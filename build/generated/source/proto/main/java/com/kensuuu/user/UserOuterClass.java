// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.kensuuu.user;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004user\"\036\n\016GetUserRequest\022\014\n\004" +
      "name\030\001 \001(\t\"i\n\004User\022\021\n\tuser_name\030\001 \001(\t\022\r\n" +
      "\005email\030\002 \001(\t\022\r\n\005phone\030\003 \001(\t\022\022\n\nbirth_dat" +
      "e\030\004 \001(\t\022\034\n\006gender\030\005 \001(\0162\014.user.Gender*-\n" +
      "\006Gender\022\r\n\tNOT_KNOWN\020\000\022\010\n\004MALE\020\001\022\n\n\006FEMA" +
      "LE\020\0022<\n\013UserService\022-\n\007GetUser\022\024.user.Ge" +
      "tUserRequest\032\n.user.User\"\000B\024\n\020com.kensuu" +
      "u.userP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_user_GetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_GetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_user_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_User_descriptor,
        new java.lang.String[] { "UserName", "Email", "Phone", "BirthDate", "Gender", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
