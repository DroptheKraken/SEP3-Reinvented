// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recipes.proto

package protos;

public interface UserObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 3;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string email = 4;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string role = 5;</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 5;</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
