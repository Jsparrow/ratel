// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerTransferDataProtoc.proto

package org.nico.ratel.landlords.entity;

public final class ServerTransferData {
  private static final com.google.protobuf.Descriptors.Descriptor
	    internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor;
	private static final 
	    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	      internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_fieldAccessorTable;
	private static  com.google.protobuf.Descriptors.FileDescriptor
	      descriptor;
	static {
	    java.lang.String[] descriptorData = {
	      new StringBuilder().append("\n\036ServerTransferDataProtoc.proto\022\037org.ni").append("co.ratel.landlords.entity\"D\n\030ServerTrans").append("ferDataProtoc\022\014\n\004code\030\001 \001(\t\022\014\n\004data\030\002 \001(").append("\t\022\014\n\004info\030\003 \001(\tB5\n\037org.nico.ratel.landlo").append("rds.entityB\022ServerTransferDatab\006proto3").toString()
	    };
	    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
	        (com.google.protobuf.Descriptors.FileDescriptor root) -> {
		descriptor = root;
		return null;
	        };
	    com.google.protobuf.Descriptors.FileDescriptor
	      .internalBuildGeneratedFileFrom(descriptorData,
	        new com.google.protobuf.Descriptors.FileDescriptor[] {
	        }, assigner);
	    internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor =
	      getDescriptor().getMessageTypes().get(0);
	    internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_fieldAccessorTable = new
	      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
	        internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor,
	        new java.lang.String[] { "Code", "Data", "Info", });
	  }
	private ServerTransferData() {}
	public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistryLite registry) {
	  }
	public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistry registry) {
	    registerAllExtensions(
	        (com.google.protobuf.ExtensionRegistryLite) registry);
	  }
	public static com.google.protobuf.Descriptors.FileDescriptor
	      getDescriptor() {
	    return descriptor;
	  }
public interface ServerTransferDataProtocOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nico.ratel.landlords.entity.ServerTransferDataProtoc)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string code = 1;</code>
     */
    java.lang.String getCode();
    /**
     * <code>string code = 1;</code>
     */
    com.google.protobuf.ByteString
        getCodeBytes();

    /**
     * <code>string data = 2;</code>
     */
    java.lang.String getData();
    /**
     * <code>string data = 2;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <code>string info = 3;</code>
     */
    java.lang.String getInfo();
    /**
     * <code>string info = 3;</code>
     */
    com.google.protobuf.ByteString
        getInfoBytes();
  }
  /**
   * Protobuf type {@code org.nico.ratel.landlords.entity.ServerTransferDataProtoc}
   */
  public  static final class ServerTransferDataProtoc extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nico.ratel.landlords.entity.ServerTransferDataProtoc)
      ServerTransferDataProtocOrBuilder {
  private static final long serialVersionUID = 0L;
public static final int CODE_FIELD_NUMBER = 1;
public static final int DATA_FIELD_NUMBER = 2;
public static final int INFO_FIELD_NUMBER = 3;
// @@protoc_insertion_point(class_scope:org.nico.ratel.landlords.entity.ServerTransferDataProtoc)
private static final org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc DEFAULT_INSTANCE;
static {
  DEFAULT_INSTANCE = new org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc();
}

private static final com.google.protobuf.Parser<ServerTransferDataProtoc>
    PARSER = new com.google.protobuf.AbstractParser<ServerTransferDataProtoc>() {
  @java.lang.Override
  public ServerTransferDataProtoc parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return new ServerTransferDataProtoc(input, extensionRegistry);
  }
};
private volatile java.lang.Object code;
private volatile java.lang.Object data_;
private volatile java.lang.Object info;
private byte memoizedIsInitialized = -1;
// Use ServerTransferDataProtoc.newBuilder() to construct.
private ServerTransferDataProtoc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
  super(builder);
}
private ServerTransferDataProtoc() {
  code = "";
  data_ = "";
  info = "";
}
private ServerTransferDataProtoc(
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
        case 10: {
          java.lang.String s = input.readStringRequireUtf8();

          code = s;
          break;
        }
        case 18: {
          java.lang.String s = input.readStringRequireUtf8();

          data_ = s;
          break;
        }
        case 26: {
          java.lang.String s = input.readStringRequireUtf8();

          info = s;
          break;
        }
        default: {
          if (!parseUnknownFieldProto3(
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
@java.lang.Override
public final com.google.protobuf.UnknownFieldSet
getUnknownFields() {
  return this.unknownFields;
}
public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
  return org.nico.ratel.landlords.entity.ServerTransferData.internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor;
}
@java.lang.Override
protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
  return org.nico.ratel.landlords.entity.ServerTransferData.internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
          org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.class, org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.Builder.class);
}
/**
 * <code>string code = 1;</code>
 */
@Override
public java.lang.String getCode() {
  java.lang.Object ref = code;
  if (ref instanceof java.lang.String) {
    return (java.lang.String) ref;
  } else {
    com.google.protobuf.ByteString bs = 
        (com.google.protobuf.ByteString) ref;
    java.lang.String s = bs.toStringUtf8();
    code = s;
    return s;
  }
}
/**
 * <code>string code = 1;</code>
 */
@Override
public com.google.protobuf.ByteString
    getCodeBytes() {
  java.lang.Object ref = code;
  if (!(ref instanceof java.lang.String)) {
	return (com.google.protobuf.ByteString) ref;
}
com.google.protobuf.ByteString b = 
    com.google.protobuf.ByteString.copyFromUtf8(
        (java.lang.String) ref);
code = b;
return b;
}
/**
 * <code>string data = 2;</code>
 */
@Override
public java.lang.String getData() {
  java.lang.Object ref = data_;
  if (ref instanceof java.lang.String) {
    return (java.lang.String) ref;
  } else {
    com.google.protobuf.ByteString bs = 
        (com.google.protobuf.ByteString) ref;
    java.lang.String s = bs.toStringUtf8();
    data_ = s;
    return s;
  }
}
/**
 * <code>string data = 2;</code>
 */
@Override
public com.google.protobuf.ByteString
    getDataBytes() {
  java.lang.Object ref = data_;
  if (!(ref instanceof java.lang.String)) {
	return (com.google.protobuf.ByteString) ref;
}
com.google.protobuf.ByteString b = 
    com.google.protobuf.ByteString.copyFromUtf8(
        (java.lang.String) ref);
data_ = b;
return b;
}
/**
 * <code>string info = 3;</code>
 */
@Override
public java.lang.String getInfo() {
  java.lang.Object ref = info;
  if (ref instanceof java.lang.String) {
    return (java.lang.String) ref;
  } else {
    com.google.protobuf.ByteString bs = 
        (com.google.protobuf.ByteString) ref;
    java.lang.String s = bs.toStringUtf8();
    info = s;
    return s;
  }
}
/**
 * <code>string info = 3;</code>
 */
@Override
public com.google.protobuf.ByteString
    getInfoBytes() {
  java.lang.Object ref = info;
  if (!(ref instanceof java.lang.String)) {
	return (com.google.protobuf.ByteString) ref;
}
com.google.protobuf.ByteString b = 
    com.google.protobuf.ByteString.copyFromUtf8(
        (java.lang.String) ref);
info = b;
return b;
}
@java.lang.Override
public final boolean isInitialized() {
  byte isInitialized = memoizedIsInitialized;
  if (isInitialized == 1) {
	return true;
}
  if (isInitialized == 0) {
	return false;
}

  memoizedIsInitialized = 1;
  return true;
}
@java.lang.Override
public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
  if (!getCodeBytes().isEmpty()) {
    com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code);
  }
  if (!getDataBytes().isEmpty()) {
    com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
  }
  if (!getInfoBytes().isEmpty()) {
    com.google.protobuf.GeneratedMessageV3.writeString(output, 3, info);
  }
  unknownFields.writeTo(output);
}
@java.lang.Override
public int getSerializedSize() {
  int size = memoizedSize;
  if (size != -1) {
	return size;
}

  size = 0;
  if (!getCodeBytes().isEmpty()) {
    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code);
  }
  if (!getDataBytes().isEmpty()) {
    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
  }
  if (!getInfoBytes().isEmpty()) {
    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, info);
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
  if (!(obj instanceof org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc)) {
    return super.equals(obj);
  }
  org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc other = (org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc) obj;

  boolean result = true;
  result = result && getCode()
      .equals(other.getCode());
  result = result && getData()
      .equals(other.getData());
  result = result && getInfo()
      .equals(other.getInfo());
  result = result && unknownFields.equals(other.unknownFields);
  return result;
}
@java.lang.Override
public int hashCode() {
  if (memoizedHashCode != 0) {
    return memoizedHashCode;
  }
  int hash = 41;
  hash = (19 * hash) + getDescriptor().hashCode();
  hash = (37 * hash) + CODE_FIELD_NUMBER;
  hash = (53 * hash) + getCode().hashCode();
  hash = (37 * hash) + DATA_FIELD_NUMBER;
  hash = (53 * hash) + getData().hashCode();
  hash = (37 * hash) + INFO_FIELD_NUMBER;
  hash = (53 * hash) + getInfo().hashCode();
  hash = (29 * hash) + unknownFields.hashCode();
  memoizedHashCode = hash;
  return hash;
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    java.nio.ByteBuffer data)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    java.nio.ByteBuffer data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data, extensionRegistry);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data, extensionRegistry);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
  return PARSER.parseFrom(data, extensionRegistry);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(java.io.InputStream input)
    throws java.io.IOException {
  return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
  return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input, extensionRegistry);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
  return com.google.protobuf.GeneratedMessageV3
      .parseDelimitedWithIOException(PARSER, input);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
  return com.google.protobuf.GeneratedMessageV3
      .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
  return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input);
}
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parseFrom(
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
public static Builder newBuilder(org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc prototype) {
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
public static org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc getDefaultInstance() {
  return DEFAULT_INSTANCE;
}
public static com.google.protobuf.Parser<ServerTransferDataProtoc> parser() {
  return PARSER;
}
@java.lang.Override
public com.google.protobuf.Parser<ServerTransferDataProtoc> getParserForType() {
  return PARSER;
}
@java.lang.Override
public org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc getDefaultInstanceForType() {
  return DEFAULT_INSTANCE;
}
    /**
     * Protobuf type {@code org.nico.ratel.landlords.entity.ServerTransferDataProtoc}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nico.ratel.landlords.entity.ServerTransferDataProtoc)
        org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtocOrBuilder {
      private java.lang.Object code_ = "";
		private java.lang.Object data = "";
		private java.lang.Object info_ = "";
		// Construct using org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.newBuilder()
		  private Builder() {
		    maybeForceBuilderInitialization();
		  }

		private Builder(
		      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		    super(parent);
		    maybeForceBuilderInitialization();
		  }

		public static final com.google.protobuf.Descriptors.Descriptor
		      getDescriptor() {
		    return org.nico.ratel.landlords.entity.ServerTransferData.internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor;
		  }

		@java.lang.Override
		  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		      internalGetFieldAccessorTable() {
		    return org.nico.ratel.landlords.entity.ServerTransferData.internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_fieldAccessorTable
		        .ensureFieldAccessorsInitialized(
		            org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.class, org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.Builder.class);
		  }

		private void maybeForceBuilderInitialization() {
		    if (com.google.protobuf.GeneratedMessageV3
		            .alwaysUseFieldBuilders) {
		    }
		  }

		@java.lang.Override
		  public Builder clear() {
		    super.clear();
		    code_ = "";

		    data = "";

		    info_ = "";

		    return this;
		  }

		@java.lang.Override
		  public com.google.protobuf.Descriptors.Descriptor
		      getDescriptorForType() {
		    return org.nico.ratel.landlords.entity.ServerTransferData.internal_static_org_nico_ratel_landlords_entity_ServerTransferDataProtoc_descriptor;
		  }

		@java.lang.Override
		  public org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc getDefaultInstanceForType() {
		    return org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.getDefaultInstance();
		  }

		@java.lang.Override
		  public org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc build() {
		    org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc result = buildPartial();
		    if (!result.isInitialized()) {
		      throw newUninitializedMessageException(result);
		    }
		    return result;
		  }

		@java.lang.Override
		  public org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc buildPartial() {
		    org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc result = new org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc(this);
		    result.code = code_;
		    result.data_ = data;
		    result.info = info_;
		    onBuilt();
		    return result;
		  }

		@java.lang.Override
		  public Builder clone() {
		    return (Builder) super.clone();
		  }

		@java.lang.Override
		  public Builder setField(
		      com.google.protobuf.Descriptors.FieldDescriptor field,
		      java.lang.Object value) {
		    return (Builder) super.setField(field, value);
		  }

		@java.lang.Override
		  public Builder clearField(
		      com.google.protobuf.Descriptors.FieldDescriptor field) {
		    return (Builder) super.clearField(field);
		  }

		@java.lang.Override
		  public Builder clearOneof(
		      com.google.protobuf.Descriptors.OneofDescriptor oneof) {
		    return (Builder) super.clearOneof(oneof);
		  }

		@java.lang.Override
		  public Builder setRepeatedField(
		      com.google.protobuf.Descriptors.FieldDescriptor field,
		      int index, java.lang.Object value) {
		    return (Builder) super.setRepeatedField(field, index, value);
		  }

		@java.lang.Override
		  public Builder addRepeatedField(
		      com.google.protobuf.Descriptors.FieldDescriptor field,
		      java.lang.Object value) {
		    return (Builder) super.addRepeatedField(field, value);
		  }

		@java.lang.Override
		  public Builder mergeFrom(com.google.protobuf.Message other) {
		    if (other instanceof org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc) {
		      return mergeFrom((org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc)other);
		    } else {
		      super.mergeFrom(other);
		      return this;
		    }
		  }

		public Builder mergeFrom(org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc other) {
		    if (other == org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc.getDefaultInstance()) {
				return this;
			}
		    if (!other.getCode().isEmpty()) {
		      code_ = other.code;
		      onChanged();
		    }
		    if (!other.getData().isEmpty()) {
		      data = other.data_;
		      onChanged();
		    }
		    if (!other.getInfo().isEmpty()) {
		      info_ = other.info;
		      onChanged();
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
		    org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc parsedMessage = null;
		    try {
		      parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
		    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
		      parsedMessage = (org.nico.ratel.landlords.entity.ServerTransferData.ServerTransferDataProtoc) e.getUnfinishedMessage();
		      throw e.unwrapIOException();
		    } finally {
		      if (parsedMessage != null) {
		        mergeFrom(parsedMessage);
		      }
		    }
		    return this;
		  }

		/**
		   * <code>string code = 1;</code>
		   */
		  @Override
		public java.lang.String getCode() {
		    java.lang.Object ref = code_;
		    if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			}
			com.google.protobuf.ByteString bs =
		          (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			code_ = s;
			return s;
		  }

		/**
		   * <code>string code = 1;</code>
		   */
		  @Override
		public com.google.protobuf.ByteString
		      getCodeBytes() {
		    java.lang.Object ref = code_;
		    if (!(ref instanceof String)) {
				return (com.google.protobuf.ByteString) ref;
			}
			com.google.protobuf.ByteString b = 
		          com.google.protobuf.ByteString.copyFromUtf8(
		              (java.lang.String) ref);
			code_ = b;
			return b;
		  }

		/**
		   * <code>string code = 1;</code>
		   */
		  public Builder setCode(
		      java.lang.String value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  
		    code_ = value;
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string code = 1;</code>
		   */
		  public Builder clearCode() {
		    
		    code_ = getDefaultInstance().getCode();
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string code = 1;</code>
		   */
		  public Builder setCodeBytes(
		      com.google.protobuf.ByteString value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
		    
		    code_ = value;
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string data = 2;</code>
		   */
		  @Override
		public java.lang.String getData() {
		    java.lang.Object ref = data;
		    if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			}
			com.google.protobuf.ByteString bs =
		          (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			data = s;
			return s;
		  }

		/**
		   * <code>string data = 2;</code>
		   */
		  @Override
		public com.google.protobuf.ByteString
		      getDataBytes() {
		    java.lang.Object ref = data;
		    if (!(ref instanceof String)) {
				return (com.google.protobuf.ByteString) ref;
			}
			com.google.protobuf.ByteString b = 
		          com.google.protobuf.ByteString.copyFromUtf8(
		              (java.lang.String) ref);
			data = b;
			return b;
		  }

		/**
		   * <code>string data = 2;</code>
		   */
		  public Builder setData(
		      java.lang.String value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  
		    data = value;
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string data = 2;</code>
		   */
		  public Builder clearData() {
		    
		    data = getDefaultInstance().getData();
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string data = 2;</code>
		   */
		  public Builder setDataBytes(
		      com.google.protobuf.ByteString value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
		    
		    data = value;
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string info = 3;</code>
		   */
		  @Override
		public java.lang.String getInfo() {
		    java.lang.Object ref = info_;
		    if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			}
			com.google.protobuf.ByteString bs =
		          (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			info_ = s;
			return s;
		  }

		/**
		   * <code>string info = 3;</code>
		   */
		  @Override
		public com.google.protobuf.ByteString
		      getInfoBytes() {
		    java.lang.Object ref = info_;
		    if (!(ref instanceof String)) {
				return (com.google.protobuf.ByteString) ref;
			}
			com.google.protobuf.ByteString b = 
		          com.google.protobuf.ByteString.copyFromUtf8(
		              (java.lang.String) ref);
			info_ = b;
			return b;
		  }

		/**
		   * <code>string info = 3;</code>
		   */
		  public Builder setInfo(
		      java.lang.String value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  
		    info_ = value;
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string info = 3;</code>
		   */
		  public Builder clearInfo() {
		    
		    info_ = getDefaultInstance().getInfo();
		    onChanged();
		    return this;
		  }

		/**
		   * <code>string info = 3;</code>
		   */
		  public Builder setInfoBytes(
		      com.google.protobuf.ByteString value) {
		    if (value == null) {
		throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
		    
		    info_ = value;
		    onChanged();
		    return this;
		  }

		@java.lang.Override
		  public final Builder setUnknownFields(
		      final com.google.protobuf.UnknownFieldSet unknownFields) {
		    return super.setUnknownFieldsProto3(unknownFields);
		  }

		@java.lang.Override
		  public final Builder mergeUnknownFields(
		      final com.google.protobuf.UnknownFieldSet unknownFields) {
		    return super.mergeUnknownFields(unknownFields);
		  }


      // @@protoc_insertion_point(builder_scope:org.nico.ratel.landlords.entity.ServerTransferDataProtoc)
    }

  }

  // @@protoc_insertion_point(outer_class_scope)
}
