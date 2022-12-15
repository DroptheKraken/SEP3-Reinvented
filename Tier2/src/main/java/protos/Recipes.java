// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recipes.proto

package protos;

public final class Recipes {
  private Recipes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecipeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecipeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecipeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecipeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Recipe_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Recipe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rrecipes.proto\"#\n\rRecipeRequest\022\022\n\ningr" +
      "edient\030\001 \001(\t\"*\n\016RecipeResponse\022\030\n\007recipe" +
      "s\030\001 \003(\0132\007.Recipe\"a\n\006Recipe\022\017\n\007user_id\030\001 " +
      "\001(\005\022\014\n\004name\030\002 \001(\t\022\023\n\013ingredients\030\003 \001(\t\022\023" +
      "\n\013description\030\004 \001(\t\022\016\n\006status\030\005 \001(\010\"Y\n\nU" +
      "serObject\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022" +
      "\020\n\010password\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\014\n\004role" +
      "\030\005 \001(\t2\307\001\n\014RecipeFinder\022/\n\nGetRecipes\022\016." +
      "RecipeRequest\032\017.RecipeResponse\"\000\022\'\n\tAddR" +
      "ecipe\022\007.Recipe\032\017.RecipeResponse\"\000\0221\n\017Get" +
      "LikedRecipes\022\013.UserObject\032\017.RecipeRespon" +
      "se\"\000\022*\n\014UpdateRecipe\022\007.Recipe\032\017.RecipeRe" +
      "sponse\"\000B\n\n\006protosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RecipeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RecipeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecipeRequest_descriptor,
        new java.lang.String[] { "Ingredient", });
    internal_static_RecipeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RecipeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecipeResponse_descriptor,
        new java.lang.String[] { "Recipes", });
    internal_static_Recipe_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Recipe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Recipe_descriptor,
        new java.lang.String[] { "UserId", "Name", "Ingredients", "Description", "Status", });
    internal_static_UserObject_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UserObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserObject_descriptor,
        new java.lang.String[] { "Id", "Username", "Password", "Email", "Role", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
