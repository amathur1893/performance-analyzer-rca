// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * <pre>
 *message for resource type Enum
 * </pre>
 *
 * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType}
 */
public  final class ResourceType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)
    ResourceTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceType.newBuilder() to construct.
  private ResourceType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceType() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();
            resourceTypeOneofCase_ = 1;
            resourceTypeOneof_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            resourceTypeOneofCase_ = 2;
            resourceTypeOneof_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            resourceTypeOneofCase_ = 3;
            resourceTypeOneof_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.Builder.class);
  }

  private int resourceTypeOneofCase_ = 0;
  private java.lang.Object resourceTypeOneof_;
  public enum ResourceTypeOneofCase
      implements com.google.protobuf.Internal.EnumLite {
    JVM(1),
    HARDWARE_RESOURCE_TYPE(2),
    THREAD_POOL(3),
    RESOURCETYPEONEOF_NOT_SET(0);
    private final int value;
    private ResourceTypeOneofCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResourceTypeOneofCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResourceTypeOneofCase forNumber(int value) {
      switch (value) {
        case 1: return JVM;
        case 2: return HARDWARE_RESOURCE_TYPE;
        case 3: return THREAD_POOL;
        case 0: return RESOURCETYPEONEOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResourceTypeOneofCase
  getResourceTypeOneofCase() {
    return ResourceTypeOneofCase.forNumber(
        resourceTypeOneofCase_);
  }

  public static final int JVM_FIELD_NUMBER = 1;
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
   */
  public int getJVMValue() {
    if (resourceTypeOneofCase_ == 1) {
      return (java.lang.Integer) resourceTypeOneof_;
    }
    return 0;
  }
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum getJVM() {
    if (resourceTypeOneofCase_ == 1) {
      @SuppressWarnings("deprecation")
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.valueOf(
          (java.lang.Integer) resourceTypeOneof_);
      return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.UNRECOGNIZED : result;
    }
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.OLD_GEN;
  }

  public static final int HARDWARE_RESOURCE_TYPE_FIELD_NUMBER = 2;
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
   */
  public int getHardwareResourceTypeValue() {
    if (resourceTypeOneofCase_ == 2) {
      return (java.lang.Integer) resourceTypeOneof_;
    }
    return 0;
  }
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum getHardwareResourceType() {
    if (resourceTypeOneofCase_ == 2) {
      @SuppressWarnings("deprecation")
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.valueOf(
          (java.lang.Integer) resourceTypeOneof_);
      return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.UNRECOGNIZED : result;
    }
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.CPU;
  }

  public static final int THREAD_POOL_FIELD_NUMBER = 3;
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
   */
  public int getThreadPoolValue() {
    if (resourceTypeOneofCase_ == 3) {
      return (java.lang.Integer) resourceTypeOneof_;
    }
    return 0;
  }
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum getThreadPool() {
    if (resourceTypeOneofCase_ == 3) {
      @SuppressWarnings("deprecation")
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.valueOf(
          (java.lang.Integer) resourceTypeOneof_);
      return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.UNRECOGNIZED : result;
    }
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.WRITE_QUEUE;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (resourceTypeOneofCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) resourceTypeOneof_));
    }
    if (resourceTypeOneofCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) resourceTypeOneof_));
    }
    if (resourceTypeOneofCase_ == 3) {
      output.writeEnum(3, ((java.lang.Integer) resourceTypeOneof_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resourceTypeOneofCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) resourceTypeOneof_));
    }
    if (resourceTypeOneofCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) resourceTypeOneof_));
    }
    if (resourceTypeOneofCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ((java.lang.Integer) resourceTypeOneof_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)) {
      return super.equals(obj);
    }
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType other = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType) obj;

    if (!getResourceTypeOneofCase().equals(other.getResourceTypeOneofCase())) return false;
    switch (resourceTypeOneofCase_) {
      case 1:
        if (getJVMValue()
            != other.getJVMValue()) return false;
        break;
      case 2:
        if (getHardwareResourceTypeValue()
            != other.getHardwareResourceTypeValue()) return false;
        break;
      case 3:
        if (getThreadPoolValue()
            != other.getThreadPoolValue()) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (resourceTypeOneofCase_) {
      case 1:
        hash = (37 * hash) + JVM_FIELD_NUMBER;
        hash = (53 * hash) + getJVMValue();
        break;
      case 2:
        hash = (37 * hash) + HARDWARE_RESOURCE_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getHardwareResourceTypeValue();
        break;
      case 3:
        hash = (37 * hash) + THREAD_POOL_FIELD_NUMBER;
        hash = (53 * hash) + getThreadPoolValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *message for resource type Enum
   * </pre>
   *
   * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.Builder.class);
    }

    // Construct using com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceTypeOneofCase_ = 0;
      resourceTypeOneof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceType_descriptor;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType getDefaultInstanceForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.getDefaultInstance();
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType build() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType buildPartial() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType result = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType(this);
      if (resourceTypeOneofCase_ == 1) {
        result.resourceTypeOneof_ = resourceTypeOneof_;
      }
      if (resourceTypeOneofCase_ == 2) {
        result.resourceTypeOneof_ = resourceTypeOneof_;
      }
      if (resourceTypeOneofCase_ == 3) {
        result.resourceTypeOneof_ = resourceTypeOneof_;
      }
      result.resourceTypeOneofCase_ = resourceTypeOneofCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType) {
        return mergeFrom((com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType other) {
      if (other == com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType.getDefaultInstance()) return this;
      switch (other.getResourceTypeOneofCase()) {
        case JVM: {
          setJVMValue(other.getJVMValue());
          break;
        }
        case HARDWARE_RESOURCE_TYPE: {
          setHardwareResourceTypeValue(other.getHardwareResourceTypeValue());
          break;
        }
        case THREAD_POOL: {
          setThreadPoolValue(other.getThreadPoolValue());
          break;
        }
        case RESOURCETYPEONEOF_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int resourceTypeOneofCase_ = 0;
    private java.lang.Object resourceTypeOneof_;
    public ResourceTypeOneofCase
        getResourceTypeOneofCase() {
      return ResourceTypeOneofCase.forNumber(
          resourceTypeOneofCase_);
    }

    public Builder clearResourceTypeOneof() {
      resourceTypeOneofCase_ = 0;
      resourceTypeOneof_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
     */
    public int getJVMValue() {
      if (resourceTypeOneofCase_ == 1) {
        return ((java.lang.Integer) resourceTypeOneof_).intValue();
      }
      return 0;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
     */
    public Builder setJVMValue(int value) {
      resourceTypeOneofCase_ = 1;
      resourceTypeOneof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum getJVM() {
      if (resourceTypeOneofCase_ == 1) {
        @SuppressWarnings("deprecation")
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.valueOf(
            (java.lang.Integer) resourceTypeOneof_);
        return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.UNRECOGNIZED : result;
      }
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum.OLD_GEN;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
     */
    public Builder setJVM(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceTypeOneofCase_ = 1;
      resourceTypeOneof_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.JvmEnum JVM = 1;</code>
     */
    public Builder clearJVM() {
      if (resourceTypeOneofCase_ == 1) {
        resourceTypeOneofCase_ = 0;
        resourceTypeOneof_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
     */
    public int getHardwareResourceTypeValue() {
      if (resourceTypeOneofCase_ == 2) {
        return ((java.lang.Integer) resourceTypeOneof_).intValue();
      }
      return 0;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
     */
    public Builder setHardwareResourceTypeValue(int value) {
      resourceTypeOneofCase_ = 2;
      resourceTypeOneof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum getHardwareResourceType() {
      if (resourceTypeOneofCase_ == 2) {
        @SuppressWarnings("deprecation")
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.valueOf(
            (java.lang.Integer) resourceTypeOneof_);
        return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.UNRECOGNIZED : result;
      }
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum.CPU;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
     */
    public Builder setHardwareResourceType(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceTypeOneofCase_ = 2;
      resourceTypeOneof_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.HardwareEnum hardware_resource_type = 2;</code>
     */
    public Builder clearHardwareResourceType() {
      if (resourceTypeOneofCase_ == 2) {
        resourceTypeOneofCase_ = 0;
        resourceTypeOneof_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
     */
    public int getThreadPoolValue() {
      if (resourceTypeOneofCase_ == 3) {
        return ((java.lang.Integer) resourceTypeOneof_).intValue();
      }
      return 0;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
     */
    public Builder setThreadPoolValue(int value) {
      resourceTypeOneofCase_ = 3;
      resourceTypeOneof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum getThreadPool() {
      if (resourceTypeOneofCase_ == 3) {
        @SuppressWarnings("deprecation")
        com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.valueOf(
            (java.lang.Integer) resourceTypeOneof_);
        return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.UNRECOGNIZED : result;
      }
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum.WRITE_QUEUE;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
     */
    public Builder setThreadPool(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceTypeOneofCase_ = 3;
      resourceTypeOneof_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum thread_pool = 3;</code>
     */
    public Builder clearThreadPool() {
      if (resourceTypeOneofCase_ == 3) {
        resourceTypeOneofCase_ = 0;
        resourceTypeOneof_ = null;
        onChanged();
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)
  }

  // @@protoc_insertion_point(class_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType)
  private static final com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType();
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceType>
      PARSER = new com.google.protobuf.AbstractParser<ResourceType>() {
    @java.lang.Override
    public ResourceType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResourceType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

