// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/proto/addressbook/addressbook.proto

package com.github.eulerlcs.hello.api.proto.addressbook;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_eulerlcs_hello_api_proto_addressbook_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-resources/proto/addressbook/addressboo" +
      "k.proto\022/com.github.eulerlcs.hello.api.p" +
      "roto.addressbook\"\353\002\n\006Person\022\021\n\004name\030\001 \001(" +
      "\tH\000\210\001\001\022\017\n\002id\030\002 \001(\005H\001\210\001\001\022\022\n\005email\030\003 \001(\tH\002" +
      "\210\001\001\022S\n\006phones\030\004 \003(\0132C.com.github.eulerlc" +
      "s.hello.api.proto.addressbook.Person.Pho" +
      "neNumber\032\214\001\n\013PhoneNumber\022\023\n\006number\030\001 \001(\t" +
      "H\000\210\001\001\022T\n\004type\030\002 \001(\0162A.com.github.eulerlc" +
      "s.hello.api.proto.addressbook.Person.Pho" +
      "neTypeH\001\210\001\001B\t\n\007_numberB\007\n\005_type\"+\n\tPhone" +
      "Type\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002B\007\n\005" +
      "_nameB\005\n\003_idB\010\n\006_email\"V\n\013AddressBook\022G\n" +
      "\006people\030\001 \003(\01327.com.github.eulerlcs.hell" +
      "o.api.proto.addressbook.PersonBF\n/com.gi" +
      "thub.eulerlcs.hello.api.proto.addressboo" +
      "kB\021AddressBookProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "Name", "Id", "Email", });
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_PhoneNumber_descriptor =
      internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_descriptor.getNestedTypes().get(0);
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_eulerlcs_hello_api_proto_addressbook_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", "Number", "Type", });
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_eulerlcs_hello_api_proto_addressbook_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_eulerlcs_hello_api_proto_addressbook_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
