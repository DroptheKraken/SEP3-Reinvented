package protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: users.proto")
public final class UserService1Grpc {

  private UserService1Grpc() {}

  public static final String SERVICE_NAME = "protos.UserService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.UserObj,
      protos.UserObj> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = protos.UserObj.class,
      responseType = protos.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserObj,
      protos.UserObj> getAddUserMethod() {
    io.grpc.MethodDescriptor<protos.UserObj, protos.UserObj> getAddUserMethod;
    if ((getAddUserMethod = UserService1Grpc.getAddUserMethod) == null) {
      synchronized (UserService1Grpc.class) {
        if ((getAddUserMethod = UserService1Grpc.getAddUserMethod) == null) {
          UserService1Grpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<protos.UserObj, protos.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserObj.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserObj.getDefaultInstance()))
              .setSchemaDescriptor(new UserService1MethodDescriptorSupplier("AddUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.Username,
      protos.UserObj> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = protos.Username.class,
      responseType = protos.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.Username,
      protos.UserObj> getGetUserMethod() {
    io.grpc.MethodDescriptor<protos.Username, protos.UserObj> getGetUserMethod;
    if ((getGetUserMethod = UserService1Grpc.getGetUserMethod) == null) {
      synchronized (UserService1Grpc.class) {
        if ((getGetUserMethod = UserService1Grpc.getGetUserMethod) == null) {
          UserService1Grpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<protos.Username, protos.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserObj.getDefaultInstance()))
              .setSchemaDescriptor(new UserService1MethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.Empty,
      protos.UserObj> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = protos.Empty.class,
      responseType = protos.UserObj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<protos.Empty,
      protos.UserObj> getGetUsersMethod() {
    io.grpc.MethodDescriptor<protos.Empty, protos.UserObj> getGetUsersMethod;
    if ((getGetUsersMethod = UserService1Grpc.getGetUsersMethod) == null) {
      synchronized (UserService1Grpc.class) {
        if ((getGetUsersMethod = UserService1Grpc.getGetUsersMethod) == null) {
          UserService1Grpc.getGetUsersMethod = getGetUsersMethod =
              io.grpc.MethodDescriptor.<protos.Empty, protos.UserObj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserObj.getDefaultInstance()))
              .setSchemaDescriptor(new UserService1MethodDescriptorSupplier("GetUsers"))
              .build();
        }
      }
    }
    return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.Username,
      protos.RecipeResponse1> getGetLikedRecipesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLikedRecipes",
      requestType = protos.Username.class,
      responseType = protos.RecipeResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.Username,
      protos.RecipeResponse1> getGetLikedRecipesMethod() {
    io.grpc.MethodDescriptor<protos.Username, protos.RecipeResponse1> getGetLikedRecipesMethod;
    if ((getGetLikedRecipesMethod = UserService1Grpc.getGetLikedRecipesMethod) == null) {
      synchronized (UserService1Grpc.class) {
        if ((getGetLikedRecipesMethod = UserService1Grpc.getGetLikedRecipesMethod) == null) {
          UserService1Grpc.getGetLikedRecipesMethod = getGetLikedRecipesMethod =
              io.grpc.MethodDescriptor.<protos.Username, protos.RecipeResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLikedRecipes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.RecipeResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new UserService1MethodDescriptorSupplier("GetLikedRecipes"))
              .build();
        }
      }
    }
    return getGetLikedRecipesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.Recipe1,
      protos.Empty> getLikeRecipeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LikeRecipe",
      requestType = protos.Recipe1.class,
      responseType = protos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.Recipe1,
      protos.Empty> getLikeRecipeMethod() {
    io.grpc.MethodDescriptor<protos.Recipe1, protos.Empty> getLikeRecipeMethod;
    if ((getLikeRecipeMethod = UserService1Grpc.getLikeRecipeMethod) == null) {
      synchronized (UserService1Grpc.class) {
        if ((getLikeRecipeMethod = UserService1Grpc.getLikeRecipeMethod) == null) {
          UserService1Grpc.getLikeRecipeMethod = getLikeRecipeMethod =
              io.grpc.MethodDescriptor.<protos.Recipe1, protos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LikeRecipe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Recipe1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserService1MethodDescriptorSupplier("LikeRecipe"))
              .build();
        }
      }
    }
    return getLikeRecipeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserService1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserService1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserService1Stub>() {
        @java.lang.Override
        public UserService1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserService1Stub(channel, callOptions);
        }
      };
    return UserService1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserService1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserService1BlockingStub>() {
        @java.lang.Override
        public UserService1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserService1BlockingStub(channel, callOptions);
        }
      };
    return UserService1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserService1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserService1FutureStub>() {
        @java.lang.Override
        public UserService1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserService1FutureStub(channel, callOptions);
        }
      };
    return UserService1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserService1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(protos.UserObj request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(protos.Username request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsers(protos.Empty request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersMethod(), responseObserver);
    }

    /**
     */
    public void getLikedRecipes(protos.Username request,
        io.grpc.stub.StreamObserver<protos.RecipeResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLikedRecipesMethod(), responseObserver);
    }

    /**
     */
    public void likeRecipe(protos.Recipe1 request,
        io.grpc.stub.StreamObserver<protos.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLikeRecipeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protos.UserObj,
                protos.UserObj>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getGetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protos.Username,
                protos.UserObj>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetUsersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                protos.Empty,
                protos.UserObj>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getGetLikedRecipesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protos.Username,
                protos.RecipeResponse1>(
                  this, METHODID_GET_LIKED_RECIPES)))
          .addMethod(
            getLikeRecipeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protos.Recipe1,
                protos.Empty>(
                  this, METHODID_LIKE_RECIPE)))
          .build();
    }
  }

  /**
   */
  public static final class UserService1Stub extends io.grpc.stub.AbstractAsyncStub<UserService1Stub> {
    private UserService1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserService1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserService1Stub(channel, callOptions);
    }

    /**
     */
    public void addUser(protos.UserObj request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(protos.Username request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsers(protos.Empty request,
        io.grpc.stub.StreamObserver<protos.UserObj> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLikedRecipes(protos.Username request,
        io.grpc.stub.StreamObserver<protos.RecipeResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLikedRecipesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void likeRecipe(protos.Recipe1 request,
        io.grpc.stub.StreamObserver<protos.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLikeRecipeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserService1BlockingStub extends io.grpc.stub.AbstractBlockingStub<UserService1BlockingStub> {
    private UserService1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserService1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserService1BlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.UserObj addUser(protos.UserObj request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.UserObj getUser(protos.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<protos.UserObj> getUsers(
        protos.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.RecipeResponse1 getLikedRecipes(protos.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLikedRecipesMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.Empty likeRecipe(protos.Recipe1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLikeRecipeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserService1FutureStub extends io.grpc.stub.AbstractFutureStub<UserService1FutureStub> {
    private UserService1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserService1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserService1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserObj> addUser(
        protos.UserObj request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserObj> getUser(
        protos.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.RecipeResponse1> getLikedRecipes(
        protos.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLikedRecipesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.Empty> likeRecipe(
        protos.Recipe1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLikeRecipeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_GET_USERS = 2;
  private static final int METHODID_GET_LIKED_RECIPES = 3;
  private static final int METHODID_LIKE_RECIPE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((protos.UserObj) request,
              (io.grpc.stub.StreamObserver<protos.UserObj>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((protos.Username) request,
              (io.grpc.stub.StreamObserver<protos.UserObj>) responseObserver);
          break;
        case METHODID_GET_USERS:
          serviceImpl.getUsers((protos.Empty) request,
              (io.grpc.stub.StreamObserver<protos.UserObj>) responseObserver);
          break;
        case METHODID_GET_LIKED_RECIPES:
          serviceImpl.getLikedRecipes((protos.Username) request,
              (io.grpc.stub.StreamObserver<protos.RecipeResponse1>) responseObserver);
          break;
        case METHODID_LIKE_RECIPE:
          serviceImpl.likeRecipe((protos.Recipe1) request,
              (io.grpc.stub.StreamObserver<protos.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService1");
    }
  }

  private static final class UserService1FileDescriptorSupplier
      extends UserService1BaseDescriptorSupplier {
    UserService1FileDescriptorSupplier() {}
  }

  private static final class UserService1MethodDescriptorSupplier
      extends UserService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserService1MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserService1FileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getGetLikedRecipesMethod())
              .addMethod(getLikeRecipeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
