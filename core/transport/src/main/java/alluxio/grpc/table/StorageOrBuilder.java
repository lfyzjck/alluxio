// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface StorageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.Storage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.table.StorageFormat storage_format = 1;</code>
   */
  boolean hasStorageFormat();
  /**
   * <code>optional .alluxio.grpc.table.StorageFormat storage_format = 1;</code>
   */
  alluxio.grpc.table.StorageFormat getStorageFormat();
  /**
   * <code>optional .alluxio.grpc.table.StorageFormat storage_format = 1;</code>
   */
  alluxio.grpc.table.StorageFormatOrBuilder getStorageFormatOrBuilder();

  /**
   * <code>optional string location = 2;</code>
   */
  boolean hasLocation();
  /**
   * <code>optional string location = 2;</code>
   */
  java.lang.String getLocation();
  /**
   * <code>optional string location = 2;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>optional .alluxio.grpc.table.HiveBucketProperty bucket_property = 3;</code>
   */
  boolean hasBucketProperty();
  /**
   * <code>optional .alluxio.grpc.table.HiveBucketProperty bucket_property = 3;</code>
   */
  alluxio.grpc.table.HiveBucketProperty getBucketProperty();
  /**
   * <code>optional .alluxio.grpc.table.HiveBucketProperty bucket_property = 3;</code>
   */
  alluxio.grpc.table.HiveBucketPropertyOrBuilder getBucketPropertyOrBuilder();

  /**
   * <code>optional bool skewed = 4;</code>
   */
  boolean hasSkewed();
  /**
   * <code>optional bool skewed = 4;</code>
   */
  boolean getSkewed();

  /**
   * <code>map&lt;string, string&gt; serde_parameters = 5;</code>
   */
  int getSerdeParametersCount();
  /**
   * <code>map&lt;string, string&gt; serde_parameters = 5;</code>
   */
  boolean containsSerdeParameters(
      java.lang.String key);
  /**
   * Use {@link #getSerdeParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSerdeParameters();
  /**
   * <code>map&lt;string, string&gt; serde_parameters = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSerdeParametersMap();
  /**
   * <code>map&lt;string, string&gt; serde_parameters = 5;</code>
   */

  java.lang.String getSerdeParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; serde_parameters = 5;</code>
   */

  java.lang.String getSerdeParametersOrThrow(
      java.lang.String key);
}