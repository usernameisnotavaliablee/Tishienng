package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractHttp2StreamChannel extends io.netty.util.DefaultAttributeMap implements io.netty.handler.codec.http2.Http2StreamChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final int MIN_HTTP2_FRAME_SIZE = 9;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> TOTAL_PENDING_SIZE_UPDATER = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> UNWRITABLE_UPDATER = null;
    static final io.netty.handler.codec.http2.Http2FrameStreamVisitor WRITABLE_VISITOR = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.ChannelId channelId;
    private final io.netty.channel.ChannelPromise closePromise;
    private final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2StreamChannelConfig config;
    private java.lang.Runnable fireChannelWritabilityChangedTask;
    private boolean firstFrameWritten;
    private int flowControlledBytes;
    private java.util.Queue<java.lang.Object> inboundBuffer;
    private boolean outboundClosed;
    private final io.netty.channel.ChannelPipeline pipeline;
    private boolean readCompletePending;
    private io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus readStatus;
    private volatile boolean registered;
    private final io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream stream;
    private volatile long totalPendingSize;
    private final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2ChannelUnsafe unsafe;
    private volatile int unwritable;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.AbstractHttp2StreamChannel$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$AbstractHttp2StreamChannel$ReadStatus = null;

        static {
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus[] r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.AnonymousClass4.$SwitchMap$io$netty$handler$codec$http2$AbstractHttp2StreamChannel$ReadStatus = r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.AnonymousClass4.$SwitchMap$io$netty$handler$codec$http2$AbstractHttp2StreamChannel$ReadStatus     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IN_PROGRESS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class FlowControlledFrameSizeEstimator implements io.netty.channel.MessageSizeEstimator {
        private static final io.netty.channel.MessageSizeEstimator.Handle HANDLE_INSTANCE = null;
        static final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator INSTANCE = null;


        static {
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$FlowControlledFrameSizeEstimator r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$FlowControlledFrameSizeEstimator
                r0.<init>()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.INSTANCE = r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$FlowControlledFrameSizeEstimator$1 r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$FlowControlledFrameSizeEstimator$1
                r0.<init>()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.HANDLE_INSTANCE = r0
                return
        }

        private FlowControlledFrameSizeEstimator() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ io.netty.channel.MessageSizeEstimator.Handle access$1600() {
                io.netty.channel.MessageSizeEstimator$Handle r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.HANDLE_INSTANCE
                return r0
        }

        @Override // io.netty.channel.MessageSizeEstimator
        public io.netty.channel.MessageSizeEstimator.Handle newHandle() {
                r1 = this;
                io.netty.channel.MessageSizeEstimator$Handle r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.HANDLE_INSTANCE
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2ChannelUnsafe implements io.netty.channel.Channel.Unsafe {
        private boolean closeInitiated;
        private boolean readEOS;
        private io.netty.channel.RecvByteBufAllocator.Handle recvHandle;
        final /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel this$0;
        private final io.netty.channel.VoidChannelPromise unsafeVoidPromise;
        private boolean writeDoneAndNoFlush;





        private Http2ChannelUnsafe(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                io.netty.channel.VoidChannelPromise r0 = new io.netty.channel.VoidChannelPromise
                r1 = 0
                r0.<init>(r3, r1)
                r2.unsafeVoidPromise = r0
                return
        }

        /* synthetic */ Http2ChannelUnsafe(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1, io.netty.handler.codec.http2.AbstractHttp2StreamChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void access$1000(io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2ChannelUnsafe r0, io.netty.channel.ChannelPromise r1) {
                r0.safeSetSuccess(r1)
                return
        }

        static /* synthetic */ void access$1700(io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2ChannelUnsafe r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
                r0.firstWriteComplete(r1, r2)
                return
        }

        static /* synthetic */ void access$1800(io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2ChannelUnsafe r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
                r0.writeComplete(r1, r2)
                return
        }

        private void fireChannelInactiveAndDeregister(io.netty.channel.ChannelPromise r2, boolean r3) {
                r1 = this;
                boolean r0 = r2.setUncancellable()
                if (r0 != 0) goto L7
                return
            L7:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                boolean r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$300(r0)
                if (r0 != 0) goto L13
                r2.setSuccess()
                return
            L13:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$2 r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$2
                r0.<init>(r1, r3, r2)
                r1.invokeLater(r0)
                return
        }

        private void firstWriteComplete(io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                java.lang.Throwable r1 = r1.cause()
                if (r1 != 0) goto La
                r2.setSuccess()
                return
            La:
                r0.closeForcibly()
                java.lang.Throwable r1 = r0.wrapStreamClosedError(r1)
                r2.setFailure(r1)
                return
        }

        private void invokeLater(java.lang.Runnable r3) {
                r2 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> La
                io.netty.channel.EventLoop r0 = r0.eventLoop()     // Catch: java.util.concurrent.RejectedExecutionException -> La
                r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> La
                return
            La:
                r3 = move-exception
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1100()
                java.lang.String r1 = "Can't invoke task later as EventLoop rejected it"
                r0.warn(r1, r3)
                return
        }

        private java.lang.Object pollQueuedMessage() {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                java.util.Queue r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$700(r0)
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                java.util.Queue r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$700(r0)
                java.lang.Object r0 = r0.poll()
                return r0
        }

        private void safeSetSuccess(io.netty.channel.ChannelPromise r3) {
                r2 = this;
                boolean r0 = r3 instanceof io.netty.channel.VoidChannelPromise
                if (r0 != 0) goto L13
                boolean r0 = r3.trySuccess()
                if (r0 != 0) goto L13
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1100()
                java.lang.String r1 = "Failed to mark a promise as success because it is done already: {}"
                r0.warn(r1, r3)
            L13:
                return
        }

        private void updateLocalWindowIfNeeded() {
                r4 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                int r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1400(r0)
                if (r0 == 0) goto L2f
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                int r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1400(r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r4.this$0
                r2 = 0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1402(r1, r2)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r4.this$0
                io.netty.channel.ChannelHandlerContext r2 = r1.parentContext()
                io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r3 = new io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame
                r3.<init>(r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$600(r0)
                io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r0 = r3.stream(r0)
                r1.write0(r2, r0)
                r0 = 1
                r4.writeDoneAndNoFlush = r0
            L2f:
                return
        }

        private io.netty.handler.codec.http2.Http2StreamFrame validateStreamFrame(io.netty.handler.codec.http2.Http2StreamFrame r5) {
                r4 = this;
                io.netty.handler.codec.http2.Http2FrameStream r0 = r5.stream()
                if (r0 == 0) goto L3d
                io.netty.handler.codec.http2.Http2FrameStream r0 = r5.stream()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r4.this$0
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$600(r1)
                if (r0 != r1) goto L13
                goto L3d
            L13:
                java.lang.String r0 = r5.toString()
                io.netty.util.ReferenceCountUtil.release(r5)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Stream "
                r2.append(r3)
                io.netty.handler.codec.http2.Http2FrameStream r5 = r5.stream()
                r2.append(r5)
                java.lang.String r5 = " must not be set on the frame: "
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            L3d:
                return r5
        }

        private java.lang.Throwable wrapStreamClosedError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r3 instanceof io.netty.handler.codec.http2.Http2Exception
                if (r0 == 0) goto L18
                r0 = r3
                io.netty.handler.codec.http2.Http2Exception r0 = (io.netty.handler.codec.http2.Http2Exception) r0
                io.netty.handler.codec.http2.Http2Error r0 = r0.error()
                io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.STREAM_CLOSED
                if (r0 != r1) goto L18
                java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
                r0.<init>()
                java.lang.Throwable r3 = r0.initCause(r3)
            L18:
                return r3
        }

        private void writeComplete(io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
                r2 = this;
                java.lang.Throwable r3 = r3.cause()
                if (r3 != 0) goto La
                r4.setSuccess()
                return
            La:
                java.lang.Throwable r3 = r2.wrapStreamClosedError(r3)
                boolean r0 = r3 instanceof java.io.IOException
                if (r0 == 0) goto L28
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2StreamChannelConfig r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1900(r0)
                boolean r0 = r0.isAutoClose()
                if (r0 == 0) goto L22
                r2.closeForcibly()
                goto L28
            L22:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                r1 = 1
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$802(r0, r1)
            L28:
                r4.setFailure(r3)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void beginRead() {
                r2 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                if (r0 != 0) goto L9
                goto L1d
            L9:
                int[] r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.AnonymousClass4.$SwitchMap$io$netty$handler$codec$http2$AbstractHttp2StreamChannel$ReadStatus
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r2.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1200(r1)
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L26
                r1 = 2
                if (r0 == r1) goto L1e
            L1d:
                return
            L1e:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.REQUESTED
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1202(r0, r1)
                return
            L26:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IN_PROGRESS
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1202(r0, r1)
                r2.doBeginRead()
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void bind(java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                boolean r1 = r2.setUncancellable()
                if (r1 != 0) goto L7
                return
            L7:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                r2.setFailure(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void close(io.netty.channel.ChannelPromise r5) {
                r4 = this;
                boolean r0 = r5.setUncancellable()
                if (r0 != 0) goto L7
                return
            L7:
                boolean r0 = r4.closeInitiated
                if (r0 == 0) goto L2e
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$400(r0)
                boolean r0 = r0.isDone()
                if (r0 == 0) goto L1b
                r5.setSuccess()
                return
            L1b:
                boolean r0 = r5 instanceof io.netty.channel.VoidChannelPromise
                if (r0 != 0) goto L2d
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$400(r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$1 r1 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$1
                r1.<init>(r4, r5)
                r0.addListener(r1)
            L2d:
                return
            L2e:
                r0 = 1
                r4.closeInitiated = r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r4.this$0
                r2 = 0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$502(r1, r2)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r4.this$0
                boolean r1 = r1.isActive()
                r4.updateLocalWindowIfNeeded()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                io.netty.channel.Channel r2 = r2.parent()
                boolean r2 = r2.isActive()
                if (r2 == 0) goto L81
                boolean r2 = r4.readEOS
                if (r2 != 0) goto L81
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$600(r2)
                int r2 = r2.id()
                boolean r2 = io.netty.handler.codec.http2.Http2CodecUtil.isStreamIdValid(r2)
                if (r2 == 0) goto L81
                io.netty.handler.codec.http2.DefaultHttp2ResetFrame r2 = new io.netty.handler.codec.http2.DefaultHttp2ResetFrame
                io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.CANCEL
                r2.<init>(r3)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r4.this$0
                io.netty.handler.codec.http2.Http2FrameStream r3 = r3.stream()
                io.netty.handler.codec.http2.DefaultHttp2ResetFrame r2 = r2.stream(r3)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r4.this$0
                io.netty.channel.Channel$Unsafe r3 = r3.unsafe()
                io.netty.channel.ChannelPromise r3 = r3.voidPromise()
                r4.write(r2, r3)
                r4.flush()
            L81:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                java.util.Queue r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$700(r2)
                if (r2 == 0) goto La0
            L89:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                java.util.Queue r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$700(r2)
                java.lang.Object r2 = r2.poll()
                if (r2 != 0) goto L9c
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                r3 = 0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$702(r2, r3)
                goto La0
            L9c:
                io.netty.util.ReferenceCountUtil.release(r2)
                goto L89
            La0:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r4.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$802(r2, r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r4.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$400(r0)
                r0.setSuccess()
                r5.setSuccess()
                io.netty.channel.ChannelPromise r5 = r4.voidPromise()
                r4.fireChannelInactiveAndDeregister(r5, r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void closeForcibly() {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
                io.netty.channel.ChannelPromise r0 = r0.voidPromise()
                r1.close(r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                boolean r1 = r3.setUncancellable()
                if (r1 != 0) goto L7
                return
            L7:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                r3.setFailure(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void deregister(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                r0 = 0
                r1.fireChannelInactiveAndDeregister(r2, r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void disconnect(io.netty.channel.ChannelPromise r1) {
                r0 = this;
                r0.close(r1)
                return
        }

        void doBeginRead() {
                r5 = this;
            L0:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1200(r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE
                if (r0 == r1) goto L74
                java.lang.Object r0 = r5.pollQueuedMessage()
                if (r0 != 0) goto L1e
                boolean r0 = r5.readEOS
                if (r0 == 0) goto L74
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1300(r0)
                r0.closeForcibly()
                return
            L1e:
                io.netty.channel.RecvByteBufAllocator$Handle r1 = r5.recvBufAllocHandle()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r5.this$0
                io.netty.channel.ChannelConfig r2 = r2.config()
                r1.reset(r2)
                r2 = 0
            L2c:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r5.this$0
                int r4 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1400(r3)
                io.netty.handler.codec.http2.Http2Frame r0 = (io.netty.handler.codec.http2.Http2Frame) r0
                int r0 = r5.doRead0(r0, r1)
                int r4 = r4 + r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1402(r3, r4)
                boolean r0 = r5.readEOS
                if (r0 != 0) goto L47
                boolean r0 = r1.continueReading()
                if (r0 == 0) goto L4e
                r2 = r0
            L47:
                java.lang.Object r0 = r5.pollQueuedMessage()
                if (r0 != 0) goto L2c
                r0 = r2
            L4e:
                r2 = 1
                if (r0 == 0) goto L70
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                boolean r0 = r0.isParentReadInProgress()
                if (r0 == 0) goto L70
                boolean r0 = r5.readEOS
                if (r0 != 0) goto L70
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                boolean r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$500(r0)
                if (r0 != 0) goto L0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$502(r0, r2)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r5.this$0
                r0.addChannelToReadCompletePendingQueue()
                goto L0
            L70:
                r5.notifyReadComplete(r1, r2)
                goto L0
            L74:
                return
        }

        int doRead0(io.netty.handler.codec.http2.Http2Frame r2, io.netty.channel.RecvByteBufAllocator.Handle r3) {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                io.netty.channel.ChannelPipeline r0 = r0.pipeline()
                r0.fireChannelRead(r2)
                r0 = 1
                r3.incMessagesRead(r0)
                boolean r0 = r2 instanceof io.netty.handler.codec.http2.Http2DataFrame
                if (r0 == 0) goto L1e
                io.netty.handler.codec.http2.Http2DataFrame r2 = (io.netty.handler.codec.http2.Http2DataFrame) r2
                int r2 = r2.initialFlowControlledBytes()
                r3.attemptedBytesRead(r2)
                r3.lastBytesRead(r2)
                return r2
            L1e:
                r2 = 9
                r3.attemptedBytesRead(r2)
                r3.lastBytesRead(r2)
                r2 = 0
                return r2
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void flush() {
                r3 = this;
                boolean r0 = r3.writeDoneAndNoFlush
                if (r0 == 0) goto L1e
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r3.this$0
                boolean r0 = r0.isParentReadInProgress()
                if (r0 == 0) goto Ld
                goto L1e
            Ld:
                r0 = 0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L1a
                io.netty.channel.ChannelHandlerContext r2 = r1.parentContext()     // Catch: java.lang.Throwable -> L1a
                r1.flush0(r2)     // Catch: java.lang.Throwable -> L1a
                r3.writeDoneAndNoFlush = r0
                return
            L1a:
                r1 = move-exception
                r3.writeDoneAndNoFlush = r0
                throw r1
            L1e:
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public java.net.SocketAddress localAddress() {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                io.netty.channel.Channel r0 = r0.parent()
                io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
                java.net.SocketAddress r0 = r0.localAddress()
                return r0
        }

        void notifyReadComplete(io.netty.channel.RecvByteBufAllocator.Handle r2, boolean r3) {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                boolean r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$500(r0)
                if (r0 != 0) goto Lb
                if (r3 != 0) goto Lb
                goto L49
            Lb:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r1.this$0
                r0 = 0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$502(r3, r0)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r1.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r3 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1200(r3)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.REQUESTED
                if (r3 != r0) goto L23
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r1.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IN_PROGRESS
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1202(r3, r0)
                goto L2a
            L23:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r3 = r1.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1202(r3, r0)
            L2a:
                r1.updateLocalWindowIfNeeded()
                r2.readComplete()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r2.fireChannelReadComplete()
                r1.flush()
                boolean r2 = r1.readEOS
                if (r2 == 0) goto L49
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1300(r2)
                r2.closeForcibly()
            L49:
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public io.netty.channel.ChannelOutboundBuffer outboundBuffer() {
                r1 = this;
                r0 = 0
                return r0
        }

        void readEOS() {
                r1 = this;
                r0 = 1
                r1.readEOS = r0
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public io.netty.channel.RecvByteBufAllocator.Handle recvBufAllocHandle() {
                r2 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r2.recvHandle
                if (r0 != 0) goto L1d
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r2.this$0
                io.netty.channel.ChannelConfig r0 = r0.config()
                io.netty.channel.RecvByteBufAllocator r0 = r0.getRecvByteBufAllocator()
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.newHandle()
                r2.recvHandle = r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r2.this$0
                io.netty.channel.ChannelConfig r1 = r1.config()
                r0.reset(r1)
            L1d:
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r2.recvHandle
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void register(io.netty.channel.EventLoop r2, io.netty.channel.ChannelPromise r3) {
                r1 = this;
                boolean r2 = r3.setUncancellable()
                if (r2 != 0) goto L7
                goto L3d
            L7:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                boolean r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$300(r2)
                if (r2 == 0) goto L1a
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Re-register is not supported"
                r2.<init>(r0)
                r3.setFailure(r2)
                return
            L1a:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                r0 = 1
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$302(r2, r0)
                r3.setSuccess()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r2.fireChannelRegistered()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                boolean r2 = r2.isActive()
                if (r2 == 0) goto L3d
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = r1.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r2.fireChannelActive()
            L3d:
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public java.net.SocketAddress remoteAddress() {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r1.this$0
                io.netty.channel.Channel r0 = r0.parent()
                io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
                java.net.SocketAddress r0 = r0.remoteAddress()
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public io.netty.channel.ChannelPromise voidPromise() {
                r1 = this;
                io.netty.channel.VoidChannelPromise r0 = r1.unsafeVoidPromise
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void write(java.lang.Object r7, io.netty.channel.ChannelPromise r8) {
                r6 = this;
                boolean r0 = r8.setUncancellable()
                if (r0 != 0) goto La
                io.netty.util.ReferenceCountUtil.release(r7)
                return
            La:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r6.this$0
                boolean r0 = r0.isActive()
                if (r0 == 0) goto L10d
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r6.this$0
                boolean r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$800(r0)
                if (r0 == 0) goto L24
                boolean r0 = r7 instanceof io.netty.handler.codec.http2.Http2HeadersFrame
                if (r0 != 0) goto L10d
                boolean r0 = r7 instanceof io.netty.handler.codec.http2.Http2DataFrame
                if (r0 == 0) goto L24
                goto L10d
            L24:
                boolean r0 = r7 instanceof io.netty.handler.codec.http2.Http2StreamFrame     // Catch: java.lang.Throwable -> L78
                if (r0 == 0) goto Lda
                r0 = r7
                io.netty.handler.codec.http2.Http2StreamFrame r0 = (io.netty.handler.codec.http2.Http2StreamFrame) r0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.Http2StreamFrame r0 = r6.validateStreamFrame(r0)     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.Http2FrameStream r1 = r1.stream()     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.Http2StreamFrame r0 = r0.stream(r1)     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r6.this$0     // Catch: java.lang.Throwable -> L78
                boolean r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1500(r1)     // Catch: java.lang.Throwable -> L78
                r2 = 0
                r3 = 1
                if (r1 != 0) goto Lad
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.Http2FrameStream r1 = r1.stream()     // Catch: java.lang.Throwable -> L78
                int r1 = r1.id()     // Catch: java.lang.Throwable -> L78
                boolean r1 = io.netty.handler.codec.http2.Http2CodecUtil.isStreamIdValid(r1)     // Catch: java.lang.Throwable -> L78
                if (r1 != 0) goto Lad
                boolean r1 = r0 instanceof io.netty.handler.codec.http2.Http2HeadersFrame     // Catch: java.lang.Throwable -> L78
                if (r1 != 0) goto L7b
                io.netty.util.ReferenceCountUtil.release(r0)     // Catch: java.lang.Throwable -> L78
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L78
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
                r1.<init>()     // Catch: java.lang.Throwable -> L78
                java.lang.String r2 = "The first frame must be a headers frame. Was: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L78
                java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L78
                r1.append(r0)     // Catch: java.lang.Throwable -> L78
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L78
                r7.<init>(r0)     // Catch: java.lang.Throwable -> L78
                r8.setFailure(r7)     // Catch: java.lang.Throwable -> L78
                return
            L78:
                r7 = move-exception
                goto L109
            L7b:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$1502(r1, r3)     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.channel.ChannelHandlerContext r4 = r1.parentContext()     // Catch: java.lang.Throwable -> L78
                io.netty.channel.ChannelFuture r0 = r1.write0(r4, r0)     // Catch: java.lang.Throwable -> L78
                boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L78
                if (r1 == 0) goto L94
                r6.firstWriteComplete(r0, r8)     // Catch: java.lang.Throwable -> L78
                return
            L94:
                io.netty.channel.MessageSizeEstimator$Handle r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.access$1600()     // Catch: java.lang.Throwable -> L78
                int r7 = r1.size(r7)     // Catch: java.lang.Throwable -> L78
                long r4 = (long) r7     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r7 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$100(r7, r4, r2)     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$3 r7 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$3     // Catch: java.lang.Throwable -> L78
                r7.<init>(r6, r8, r4)     // Catch: java.lang.Throwable -> L78
                r0.addListener(r7)     // Catch: java.lang.Throwable -> L78
                r6.writeDoneAndNoFlush = r3     // Catch: java.lang.Throwable -> L78
                return
            Lad:
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.channel.ChannelHandlerContext r1 = r0.parentContext()     // Catch: java.lang.Throwable -> L78
                io.netty.channel.ChannelFuture r0 = r0.write0(r1, r7)     // Catch: java.lang.Throwable -> L78
                boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L78
                if (r1 == 0) goto Lc1
                r6.writeComplete(r0, r8)     // Catch: java.lang.Throwable -> L78
                return
            Lc1:
                io.netty.channel.MessageSizeEstimator$Handle r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.access$1600()     // Catch: java.lang.Throwable -> L78
                int r7 = r1.size(r7)     // Catch: java.lang.Throwable -> L78
                long r4 = (long) r7     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel r7 = r6.this$0     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.access$100(r7, r4, r2)     // Catch: java.lang.Throwable -> L78
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$4 r7 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe$4     // Catch: java.lang.Throwable -> L78
                r7.<init>(r6, r8, r4)     // Catch: java.lang.Throwable -> L78
                r0.addListener(r7)     // Catch: java.lang.Throwable -> L78
                r6.writeDoneAndNoFlush = r3     // Catch: java.lang.Throwable -> L78
                return
            Lda:
                java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L78
                io.netty.util.ReferenceCountUtil.release(r7)     // Catch: java.lang.Throwable -> L78
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L78
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
                r1.<init>()     // Catch: java.lang.Throwable -> L78
                java.lang.String r2 = "Message must be an "
                r1.append(r2)     // Catch: java.lang.Throwable -> L78
                java.lang.Class<io.netty.handler.codec.http2.Http2StreamFrame> r2 = io.netty.handler.codec.http2.Http2StreamFrame.class
                java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)     // Catch: java.lang.Throwable -> L78
                r1.append(r2)     // Catch: java.lang.Throwable -> L78
                java.lang.String r2 = ": "
                r1.append(r2)     // Catch: java.lang.Throwable -> L78
                r1.append(r0)     // Catch: java.lang.Throwable -> L78
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L78
                r7.<init>(r0)     // Catch: java.lang.Throwable -> L78
                r8.setFailure(r7)     // Catch: java.lang.Throwable -> L78
                return
            L109:
                r8.tryFailure(r7)
                return
            L10d:
                io.netty.util.ReferenceCountUtil.release(r7)
                java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException
                r7.<init>()
                r8.setFailure(r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2StreamChannelConfig extends io.netty.channel.DefaultChannelConfig {
        final /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel this$0;

        Http2StreamChannelConfig(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1, io.netty.channel.Channel r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public io.netty.channel.MessageSizeEstimator getMessageSizeEstimator() {
                r1 = this;
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$FlowControlledFrameSizeEstimator r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.FlowControlledFrameSizeEstimator.INSTANCE
                return r0
        }

        @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
        public io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r3) {
                r2 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r3.newHandle()
                boolean r0 = r0 instanceof io.netty.channel.RecvByteBufAllocator.ExtendedHandle
                if (r0 == 0) goto Lc
                super.setRecvByteBufAllocator(r3)
                return r2
            Lc:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "allocator.newHandle() must return an object of type: "
                r0.append(r1)
                java.lang.Class<io.netty.channel.RecvByteBufAllocator$ExtendedHandle> r1 = io.netty.channel.RecvByteBufAllocator.ExtendedHandle.class
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum ReadStatus extends java.lang.Enum<io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus> {
        private static final /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus[] $VALUES = null;
        public static final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus IDLE = null;
        public static final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus IN_PROGRESS = null;
        public static final io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus REQUESTED = null;

        static {
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE = r0
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus
                java.lang.String r3 = "IN_PROGRESS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IN_PROGRESS = r1
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r3 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus
                java.lang.String r5 = "REQUESTED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.REQUESTED = r3
                r5 = 3
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus[] r5 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.$VALUES = r5
                return
        }

        ReadStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus> r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus) r1
                return r1
        }

        public static io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus[] values() {
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus[] r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus[] r0 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus[]) r0
                return r0
        }
    }

    static {
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$1 r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$1
            r0.<init>()
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel.WRITABLE_VISITOR = r0
            java.lang.Class<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel.logger = r1
            io.netty.channel.ChannelMetadata r1 = new io.netty.channel.ChannelMetadata
            r2 = 0
            r3 = 16
            r1.<init>(r2, r3)
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel.METADATA = r1
            java.lang.String r1 = "totalPendingSize"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel.TOTAL_PENDING_SIZE_UPDATER = r1
            java.lang.String r1 = "unwritable"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel.UNWRITABLE_UPDATER = r0
            return
    }

    AbstractHttp2StreamChannel(io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r3, int r4, io.netty.channel.ChannelHandler r5) {
            r2 = this;
            r2.<init>()
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2StreamChannelConfig r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2StreamChannelConfig
            r0.<init>(r2, r2)
            r2.config = r0
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            r2.unsafe = r0
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE
            r2.readStatus = r0
            r2.stream = r3
            r3.attachment = r2
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$2 r3 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$2
            r3.<init>(r2, r2)
            r2.pipeline = r3
            io.netty.channel.ChannelPromise r0 = r3.newPromise()
            r2.closePromise = r0
            io.netty.handler.codec.http2.Http2StreamChannelId r0 = new io.netty.handler.codec.http2.Http2StreamChannelId
            io.netty.channel.Channel r1 = r2.parent()
            io.netty.channel.ChannelId r1 = r1.id()
            r0.<init>(r1, r4)
            r2.channelId = r0
            if (r5 == 0) goto L41
            r4 = 1
            io.netty.channel.ChannelHandler[] r4 = new io.netty.channel.ChannelHandler[r4]
            r0 = 0
            r4[r0] = r5
            r3.addLast(r4)
        L41:
            return
    }

    static /* synthetic */ void access$100(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, long r1, boolean r3) {
            r0.incrementPendingOutboundBytes(r1, r3)
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$1100() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.logger
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus access$1200(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = r0.readStatus
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus access$1202(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus r1) {
            r0.readStatus = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2ChannelUnsafe access$1300(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r0.unsafe
            return r0
    }

    static /* synthetic */ int access$1400(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            int r0 = r0.flowControlledBytes
            return r0
    }

    static /* synthetic */ int access$1402(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, int r1) {
            r0.flowControlledBytes = r1
            return r1
    }

    static /* synthetic */ boolean access$1500(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            boolean r0 = r0.firstFrameWritten
            return r0
    }

    static /* synthetic */ boolean access$1502(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, boolean r1) {
            r0.firstFrameWritten = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.codec.http2.AbstractHttp2StreamChannel.Http2StreamChannelConfig access$1900(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2StreamChannelConfig r0 = r0.config
            return r0
    }

    static /* synthetic */ void access$200(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, long r1, boolean r3) {
            r0.decrementPendingOutboundBytes(r1, r3)
            return
    }

    static /* synthetic */ boolean access$300(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            boolean r0 = r0.registered
            return r0
    }

    static /* synthetic */ boolean access$302(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, boolean r1) {
            r0.registered = r1
            return r1
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$400(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.channel.ChannelPromise r0 = r0.closePromise
            return r0
    }

    static /* synthetic */ boolean access$500(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            boolean r0 = r0.readCompletePending
            return r0
    }

    static /* synthetic */ boolean access$502(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, boolean r1) {
            r0.readCompletePending = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream access$600(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = r0.stream
            return r0
    }

    static /* synthetic */ java.util.Queue access$700(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            java.util.Queue<java.lang.Object> r0 = r0.inboundBuffer
            return r0
    }

    static /* synthetic */ java.util.Queue access$702(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, java.util.Queue r1) {
            r0.inboundBuffer = r1
            return r1
    }

    static /* synthetic */ boolean access$800(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            boolean r0 = r0.outboundClosed
            return r0
    }

    static /* synthetic */ boolean access$802(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0, boolean r1) {
            r0.outboundClosed = r1
            return r1
    }

    static /* synthetic */ io.netty.channel.ChannelPipeline access$900(io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0) {
            io.netty.channel.ChannelPipeline r0 = r0.pipeline
            return r0
    }

    private void decrementPendingOutboundBytes(long r4, boolean r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L28
        L7:
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.TOTAL_PENDING_SIZE_UPDATER
            long r4 = -r4
            long r4 = r0.addAndGet(r3, r4)
            io.netty.channel.ChannelConfig r0 = r3.config()
            int r0 = r0.getWriteBufferLowWaterMark()
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            io.netty.channel.Channel r4 = r3.parent()
            boolean r4 = r4.isWritable()
            if (r4 == 0) goto L28
            r3.setWritable(r6)
        L28:
            return
    }

    private void fireChannelWritabilityChanged(boolean r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            if (r2 == 0) goto L19
            java.lang.Runnable r2 = r1.fireChannelWritabilityChangedTask
            if (r2 != 0) goto L11
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$3 r2 = new io.netty.handler.codec.http2.AbstractHttp2StreamChannel$3
            r2.<init>(r1, r0)
            r1.fireChannelWritabilityChangedTask = r2
        L11:
            io.netty.channel.EventLoop r0 = r1.eventLoop()
            r0.execute(r2)
            return
        L19:
            r0.fireChannelWritabilityChanged()
            return
    }

    private void incrementPendingOutboundBytes(long r4, boolean r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            goto L1d
        L7:
            java.util.concurrent.atomic.AtomicLongFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.TOTAL_PENDING_SIZE_UPDATER
            long r4 = r0.addAndGet(r3, r4)
            io.netty.channel.ChannelConfig r0 = r3.config()
            int r0 = r0.getWriteBufferHighWaterMark()
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r3.setUnwritable(r6)
        L1d:
            return
    }

    private void setUnwritable(boolean r4) {
            r3 = this;
        L0:
            int r0 = r3.unwritable
            r1 = r0 | 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L0
            if (r0 != 0) goto L13
            if (r1 == 0) goto L13
            r3.fireChannelWritabilityChanged(r4)
        L13:
            return
    }

    private void setWritable(boolean r4) {
            r3 = this;
        L0:
            int r0 = r3.unwritable
            r1 = r0 & (-2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r2 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.UNWRITABLE_UPDATER
            boolean r2 = r2.compareAndSet(r3, r0, r1)
            if (r2 == 0) goto L0
            if (r0 == 0) goto L13
            if (r1 != 0) goto L13
            r3.fireChannelWritabilityChanged(r4)
        L13:
            return
    }

    protected abstract void addChannelToReadCompletePendingQueue();

    @Override // io.netty.channel.Channel
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config()
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.bind(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.bind(r2, r3)
            return r2
    }

    @Override // io.netty.channel.Channel
    public long bytesBeforeUnwritable() {
            r5 = this;
            io.netty.channel.ChannelConfig r0 = r5.config()
            int r0 = r0.getWriteBufferHighWaterMark()
            long r0 = (long) r0
            long r2 = r5.totalPendingSize
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            boolean r4 = r5.isWritable()
            if (r4 == 0) goto L19
            return r0
        L19:
            return r2
    }

    @Override // io.netty.channel.Channel
    public long bytesBeforeWritable() {
            r5 = this;
            long r0 = r5.totalPendingSize
            io.netty.channel.ChannelConfig r2 = r5.config()
            int r2 = r2.getWriteBufferLowWaterMark()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            boolean r4 = r5.isWritable()
            if (r4 == 0) goto L19
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r0 = r0.close()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.close(r2)
            return r2
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelFuture closeFuture() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.closePromise
            return r0
    }

    void closeOutbound() {
            r1 = this;
            r0 = 1
            r1.outboundClosed = r0
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(io.netty.channel.Channel r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 0
            return r2
        L4:
            io.netty.channel.ChannelId r0 = r1.id()
            io.netty.channel.ChannelId r2 = r2.id()
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.Channel r1) {
            r0 = this;
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2StreamChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.connect(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3, r4)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r0 = r0.deregister()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.deregister(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r0 = r0.disconnect()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.disconnect(r2)
            return r2
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.EventLoop eventLoop() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.parent()
            io.netty.channel.EventLoop r0 = r0.eventLoop()
            return r0
    }

    void fireChildRead(io.netty.handler.codec.http2.Http2Frame r4) {
            r3 = this;
            boolean r0 = r3.isActive()
            if (r0 != 0) goto La
            io.netty.util.ReferenceCountUtil.release(r4)
            return
        La:
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r0 = r3.readStatus
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$ReadStatus r1 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.ReadStatus.IDLE
            if (r0 == r1) goto L38
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r3.unsafe
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            int r1 = r3.flowControlledBytes
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r2 = r3.unsafe
            int r4 = r2.doRead0(r4, r0)
            int r1 = r1 + r4
            r3.flowControlledBytes = r1
            boolean r4 = r0.continueReading()
            r1 = 1
            if (r4 == 0) goto L32
            boolean r4 = r3.readCompletePending
            if (r4 != 0) goto L31
            r3.readCompletePending = r1
            r3.addChannelToReadCompletePendingQueue()
        L31:
            return
        L32:
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r4 = r3.unsafe
            r4.notifyReadComplete(r0, r1)
            return
        L38:
            java.util.Queue<java.lang.Object> r0 = r3.inboundBuffer
            if (r0 != 0) goto L44
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r3.inboundBuffer = r0
        L44:
            java.util.Queue<java.lang.Object> r0 = r3.inboundBuffer
            r0.add(r4)
            return
    }

    void fireChildReadComplete() {
            r3 = this;
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r3.unsafe
            io.netty.channel.RecvByteBufAllocator$Handle r1 = r0.recvBufAllocHandle()
            r2 = 0
            r0.notifyReadComplete(r1, r2)
            return
    }

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.Channel flush() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            r0.flush()
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker flush() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.flush()
            return r0
    }

    protected void flush0(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            r1.flush()
            return
    }

    public int hashCode() {
            r1 = this;
            io.netty.channel.ChannelId r0 = r1.id()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelId id() {
            r1 = this;
            io.netty.channel.ChannelId r0 = r1.channelId
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isOpen()
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.closePromise
            boolean r0 = r0.isDone()
            r0 = r0 ^ 1
            return r0
    }

    protected abstract boolean isParentReadInProgress();

    @Override // io.netty.channel.Channel
    public boolean isRegistered() {
            r1 = this;
            boolean r0 = r1.registered
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isWritable() {
            r1 = this;
            int r0 = r1.unwritable
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.parent()
            java.net.SocketAddress r0 = r0.localAddress()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.newFailedFuture(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelProgressivePromise newProgressivePromise() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelProgressivePromise r0 = r0.newProgressivePromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelPromise newPromise() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newSucceededFuture() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r0 = r0.newSucceededFuture()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.parentContext()
            io.netty.channel.Channel r0 = r0.channel()
            return r0
    }

    protected abstract io.netty.channel.ChannelHandlerContext parentContext();

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelPipeline pipeline() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline
            return r0
    }

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.Channel read() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            r0.read()
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker read() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.read()
            return r0
    }

    @Override // io.netty.channel.Channel
    public java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.parent()
            java.net.SocketAddress r0 = r0.remoteAddress()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2StreamChannel
    public io.netty.handler.codec.http2.Http2FrameStream stream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = r1.stream
            return r0
    }

    void streamClosed() {
            r1 = this;
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r1.unsafe
            r0.readEOS()
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r1.unsafe
            r0.doBeginRead()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.channel.Channel r1 = r2.parent()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "(H2 - "
            r0.append(r1)
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r1 = r2.stream
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    final void trySetWritable() {
            r5 = this;
            long r0 = r5.totalPendingSize
            io.netty.channel.ChannelConfig r2 = r5.config()
            int r2 = r2.getWriteBufferLowWaterMark()
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L13
            r0 = 0
            r5.setWritable(r0)
        L13:
            return
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.Channel.Unsafe unsafe() {
            r1 = this;
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel$Http2ChannelUnsafe r0 = r1.unsafe
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelPromise voidPromise() {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelPromise r0 = r0.voidPromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.write(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.write(r2, r3)
            return r2
    }

    protected io.netty.channel.ChannelFuture write0(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r2.newPromise()
            r2.write(r3, r0)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2, r3)
            return r2
    }
}
