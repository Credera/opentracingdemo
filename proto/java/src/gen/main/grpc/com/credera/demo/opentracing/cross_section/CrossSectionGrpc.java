package com.credera.demo.opentracing.cross_section;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: cross_section.proto")
public final class CrossSectionGrpc {

  private CrossSectionGrpc() {}

  public static final String SERVICE_NAME = "crosssection.CrossSection";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCrossSectionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range,
      com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> METHOD_GET_CROSS_SECTION = getGetCrossSectionMethod();

  private static volatile io.grpc.MethodDescriptor<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range,
      com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> getGetCrossSectionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range,
      com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> getGetCrossSectionMethod() {
    io.grpc.MethodDescriptor<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range, com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> getGetCrossSectionMethod;
    if ((getGetCrossSectionMethod = CrossSectionGrpc.getGetCrossSectionMethod) == null) {
      synchronized (CrossSectionGrpc.class) {
        if ((getGetCrossSectionMethod = CrossSectionGrpc.getGetCrossSectionMethod) == null) {
          CrossSectionGrpc.getGetCrossSectionMethod = getGetCrossSectionMethod = 
              io.grpc.MethodDescriptor.<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range, com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "crosssection.CrossSection", "GetCrossSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels.getDefaultInstance()))
                  .setSchemaDescriptor(new CrossSectionMethodDescriptorSupplier("GetCrossSection"))
                  .build();
          }
        }
     }
     return getGetCrossSectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CrossSectionStub newStub(io.grpc.Channel channel) {
    return new CrossSectionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CrossSectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CrossSectionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CrossSectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CrossSectionFutureStub(channel);
  }

  /**
   */
  public static abstract class CrossSectionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtain the activity values between the specified points
     * </pre>
     */
    public void getCrossSection(com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range request,
        io.grpc.stub.StreamObserver<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCrossSectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCrossSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range,
                com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels>(
                  this, METHODID_GET_CROSS_SECTION)))
          .build();
    }
  }

  /**
   */
  public static final class CrossSectionStub extends io.grpc.stub.AbstractStub<CrossSectionStub> {
    private CrossSectionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrossSectionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrossSectionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrossSectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain the activity values between the specified points
     * </pre>
     */
    public void getCrossSection(com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range request,
        io.grpc.stub.StreamObserver<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCrossSectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CrossSectionBlockingStub extends io.grpc.stub.AbstractStub<CrossSectionBlockingStub> {
    private CrossSectionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrossSectionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrossSectionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrossSectionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain the activity values between the specified points
     * </pre>
     */
    public com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels getCrossSection(com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range request) {
      return blockingUnaryCall(
          getChannel(), getGetCrossSectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CrossSectionFutureStub extends io.grpc.stub.AbstractStub<CrossSectionFutureStub> {
    private CrossSectionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrossSectionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrossSectionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrossSectionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtain the activity values between the specified points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels> getCrossSection(
        com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCrossSectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CROSS_SECTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CrossSectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CrossSectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CROSS_SECTION:
          serviceImpl.getCrossSection((com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.Range) request,
              (io.grpc.stub.StreamObserver<com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.ActivityLevels>) responseObserver);
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

  private static abstract class CrossSectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CrossSectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.credera.demo.opentracing.cross_section.CrossSectionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CrossSection");
    }
  }

  private static final class CrossSectionFileDescriptorSupplier
      extends CrossSectionBaseDescriptorSupplier {
    CrossSectionFileDescriptorSupplier() {}
  }

  private static final class CrossSectionMethodDescriptorSupplier
      extends CrossSectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CrossSectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (CrossSectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CrossSectionFileDescriptorSupplier())
              .addMethod(getGetCrossSectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
