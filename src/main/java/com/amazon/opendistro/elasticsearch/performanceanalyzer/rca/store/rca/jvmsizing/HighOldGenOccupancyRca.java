/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.store.rca.jvmsizing;

import static com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics.GCType.OLD_GEN;
import static com.amazon.opendistro.elasticsearch.performanceanalyzer.metrics.AllMetrics.HeapDimension.MEM_TYPE;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.metricsdb.MetricsDB;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.configs.HighOldGenOccupancyRcaConfig;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Metric;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Rca;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.Resources.State;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.aggregators.SlidingWindow;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.aggregators.SlidingWindowData;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.contexts.ResourceContext;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.flow_units.MetricFlowUnit;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.flow_units.ResourceFlowUnit;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.persist.SQLParsingUtil;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.summaries.HotResourceSummary;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.api.summaries.ResourceUtil;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.core.RcaConf;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.scheduler.FlowUnitOperationArgWrapper;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighOldGenOccupancyRca extends Rca<ResourceFlowUnit<HotResourceSummary>> {

  private static final Logger LOG = LogManager.getLogger(HighOldGenOccupancyRca.class);
  private static final long EVAL_INTERVAL_IN_S = 5;
  private static final int B_TO_MB = 1024 * 1024;

  private final Metric heapUsed;
  private final Metric heapMax;
  private final SlidingWindow<SlidingWindowData> oldGenUtilizationSlidingWindow;

  private long heapUtilizationThreshold;
  private long rcaEvaluationIntervalInS;
  private long rcaSamplesBeforeEval;
  private long samples;

  /**
   * Create HighOldGenOccupancyRca with default values.
   * @param heapMax The heapMax metric.
   * @param heapUsed The heapUsed metric.
   */
  public HighOldGenOccupancyRca(final Metric heapMax, final Metric heapUsed) {
    this(heapMax, heapUsed, HighOldGenOccupancyRcaConfig.DEFAULT_UTILIZATION,
        HighOldGenOccupancyRcaConfig.DEFAULT_EVALUATION_INTERVAL_IN_S);
  }

  public HighOldGenOccupancyRca(final Metric heapMax, final Metric heapUsed,
      final long heapUtilizationThreshold, final long rcaEvaluationIntervalInS) {
    super(EVAL_INTERVAL_IN_S);
    this.oldGenUtilizationSlidingWindow = new SlidingWindow<>(1, TimeUnit.MINUTES);
    this.heapUsed = heapUsed;
    this.heapMax = heapMax;
    this.heapUtilizationThreshold = heapUtilizationThreshold;
    this.rcaEvaluationIntervalInS = rcaEvaluationIntervalInS;
    this.rcaSamplesBeforeEval = rcaEvaluationIntervalInS / EVAL_INTERVAL_IN_S;
    this.samples = 0;
  }

  @Override
  public void generateFlowUnitListFromWire(FlowUnitOperationArgWrapper args) {
    throw new UnsupportedOperationException("generateFlowUnitListFromWire should not be called "
        + "for node-local rca: " + args.getNode().name());
  }

  @Override
  public ResourceFlowUnit<HotResourceSummary> operate() {
    samples++;
    addToSlidingWindow();
    if (samples == rcaSamplesBeforeEval) {
      samples = 0;
      return evaluateAndEmit();
    }

    return new ResourceFlowUnit<>(System.currentTimeMillis());
  }

  private ResourceFlowUnit<HotResourceSummary> evaluateAndEmit() {
    long currTime = System.currentTimeMillis();
    double averageUtilizationPercentage = oldGenUtilizationSlidingWindow.readAvg();
    ResourceContext context = new ResourceContext(State.HEALTHY);
    HotResourceSummary summary = new HotResourceSummary(ResourceUtil.OLD_GEN_HEAP_USAGE,
        (double)heapUtilizationThreshold,
        averageUtilizationPercentage, (int)rcaEvaluationIntervalInS);
    if (averageUtilizationPercentage >= heapUtilizationThreshold) {
      context = new ResourceContext(State.UNHEALTHY);
    }
    return new ResourceFlowUnit<>(currTime, context, summary);
  }

  private void addToSlidingWindow() {
    double oldGenUsed = getOldGenValueForMetric(heapUsed);
    double maxOldGen = getOldGenValueForMetric(heapMax);

    if (maxOldGen == 0d) {
      LOG.info("Max Old Gen capacity cannot be 0. Skipping.");
    }

    this.oldGenUtilizationSlidingWindow.next(new SlidingWindowData(System.currentTimeMillis(),
        oldGenUsed / maxOldGen * 100d));
  }

  private double getOldGenValueForMetric(Metric heapMetric) {
    List<MetricFlowUnit> heapMetricFlowUnits = heapMetric.getFlowUnits();
    double metricValue = 0d;
    for (final MetricFlowUnit heapMetricFlowUnit : heapMetricFlowUnits) {
      if (heapMetricFlowUnit.isEmpty()) {
        continue;
      }

      double ret = SQLParsingUtil.readDataFromSqlResult(heapMetricFlowUnit.getData(),
          MEM_TYPE.getField(),
          OLD_GEN.toString(), MetricsDB.MAX);
      if (!Double.isNaN(ret)) {
        metricValue = ret / B_TO_MB;
      }
    }

    return metricValue;
  }

  @Override
  public void readRcaConf(RcaConf conf) {
    final HighOldGenOccupancyRcaConfig config = conf.getHighOldGenOccupancyRcaConfig();
    this.rcaEvaluationIntervalInS = config.getEvaluationIntervalInS();
    this.heapUtilizationThreshold = config.getHeapUtilizationThreshold();
    this.rcaSamplesBeforeEval = rcaEvaluationIntervalInS / EVAL_INTERVAL_IN_S;
  }
}