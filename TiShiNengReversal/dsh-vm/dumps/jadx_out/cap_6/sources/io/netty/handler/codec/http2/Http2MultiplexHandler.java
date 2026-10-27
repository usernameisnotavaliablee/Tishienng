package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Http2MultiplexHandler extends io.netty.handler.codec.http2.Http2ChannelDuplexHandler {
    static final io.netty.channel.ChannelFutureListener CHILD_CHANNEL_REGISTRATION_LISTENER = null;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private int idCount;
    private final io.netty.channel.ChannelHandler inboundStreamHandler;
    private boolean parentReadInProgress;
    private final java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> readCompletePendingQueue;
    private final io.netty.channel.ChannelHandler upgradeStreamHandler;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.Http2MultiplexHandler$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.Http2MultiplexHandler.AnonymousClass3.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.AnonymousClass3.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.AnonymousClass3.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.AnonymousClass3.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass3() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2MultiplexHandlerStreamChannel extends io.netty.handler.codec.http2.AbstractHttp2StreamChannel {
        final /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexHandler this$0;

        Http2MultiplexHandlerStreamChannel(io.netty.handler.codec.http2.Http2MultiplexHandler r1, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r2, io.netty.channel.ChannelHandler r3) {
                r0 = this;
                r0.this$0 = r1
                int r1 = io.netty.handler.codec.http2.Http2MultiplexHandler.access$004(r1)
                r0.<init>(r2, r1, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected void addChannelToReadCompletePendingQueue() {
                r1 = this;
            L0:
                io.netty.handler.codec.http2.Http2MultiplexHandler r0 = r1.this$0
                java.util.Queue r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.access$200(r0)
                boolean r0 = r0.offer(r1)
                if (r0 != 0) goto L12
                io.netty.handler.codec.http2.Http2MultiplexHandler r0 = r1.this$0
                io.netty.handler.codec.http2.Http2MultiplexHandler.access$300(r0)
                goto L0
            L12:
                return
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected boolean isParentReadInProgress() {
                r1 = this;
                io.netty.handler.codec.http2.Http2MultiplexHandler r0 = r1.this$0
                boolean r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.access$100(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected io.netty.channel.ChannelHandlerContext parentContext() {
                r1 = this;
                io.netty.handler.codec.http2.Http2MultiplexHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.codec.http2.Http2MultiplexHandler.access$400(r0)
                return r0
        }
    }

    static {
            io.netty.handler.codec.http2.Http2MultiplexHandler$1 r0 = new io.netty.handler.codec.http2.Http2MultiplexHandler$1
            r0.<init>()
            io.netty.handler.codec.http2.Http2MultiplexHandler.CHILD_CHANNEL_REGISTRATION_LISTENER = r0
            return
    }

    public Http2MultiplexHandler(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Http2MultiplexHandler(io.netty.channel.ChannelHandler r4, io.netty.channel.ChannelHandler r5) {
            r3 = this;
            r3.<init>()
            io.netty.handler.codec.http2.MaxCapacityQueue r0 = new io.netty.handler.codec.http2.MaxCapacityQueue
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r2 = 8
            r1.<init>(r2)
            r2 = 100
            r0.<init>(r1, r2)
            r3.readCompletePendingQueue = r0
            java.lang.String r0 = "inboundStreamHandler"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.channel.ChannelHandler r4 = (io.netty.channel.ChannelHandler) r4
            r3.inboundStreamHandler = r4
            r3.upgradeStreamHandler = r5
            return
    }

    static /* synthetic */ int access$004(io.netty.handler.codec.http2.Http2MultiplexHandler r1) {
            int r0 = r1.idCount
            int r0 = r0 + 1
            r1.idCount = r0
            return r0
    }

    static /* synthetic */ boolean access$100(io.netty.handler.codec.http2.Http2MultiplexHandler r0) {
            boolean r0 = r0.parentReadInProgress
            return r0
    }

    static /* synthetic */ java.util.Queue access$200(io.netty.handler.codec.http2.Http2MultiplexHandler r0) {
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r0.readCompletePendingQueue
            return r0
    }

    static /* synthetic */ void access$300(io.netty.handler.codec.http2.Http2MultiplexHandler r0) {
            r0.processPendingReadCompleteQueue()
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$400(io.netty.handler.codec.http2.Http2MultiplexHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    private static boolean isServer(io.netty.channel.ChannelHandlerContext r0) {
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.Channel r0 = r0.parent()
            boolean r0 = r0 instanceof io.netty.channel.ServerChannel
            return r0
    }

    private void onHttp2GoAwayFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http2.Http2GoAwayFrame r4) {
            r2 = this;
            boolean r0 = isServer(r3)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Ld
            io.netty.handler.codec.http2.Http2MultiplexHandler$2 r1 = new io.netty.handler.codec.http2.Http2MultiplexHandler$2     // Catch: io.netty.handler.codec.http2.Http2Exception -> Ld
            r1.<init>(r2, r4, r0)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Ld
            r2.forEachActiveStream(r1)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Ld
            return
        Ld:
            r4 = move-exception
            r3.fireExceptionCaught(r4)
            r3.close()
            return
    }

    private void processPendingReadCompleteQueue() {
            r2 = this;
            r0 = 1
            r2.parentReadInProgress = r0
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r2.readCompletePendingQueue
            java.lang.Object r0 = r0.poll()
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r0
            r1 = 0
            if (r0 == 0) goto L36
        Le:
            r0.fireChildReadComplete()     // Catch: java.lang.Throwable -> L28
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r2.readCompletePendingQueue     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L28
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r0     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto Le
            r2.parentReadInProgress = r1
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r2.readCompletePendingQueue
            r0.clear()
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            r0.flush()
            return
        L28:
            r0 = move-exception
            r2.parentReadInProgress = r1
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r1 = r2.readCompletePendingQueue
            r1.clear()
            io.netty.channel.ChannelHandlerContext r1 = r2.ctx
            r1.flush()
            throw r0
        L36:
            r2.parentReadInProgress = r1
            return
    }

    static void registerDone(io.netty.channel.ChannelFuture r1) {
            boolean r0 = r1.isSuccess()
            if (r0 != 0) goto L1b
            io.netty.channel.Channel r1 = r1.channel()
            boolean r0 = r1.isRegistered()
            if (r0 == 0) goto L14
            r1.close()
            return
        L14:
            io.netty.channel.Channel$Unsafe r1 = r1.unsafe()
            r1.closeForcibly()
        L1b:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            r0 = 1
            r2.parentReadInProgress = r0
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.Http2StreamFrame
            if (r0 == 0) goto L29
            boolean r3 = r4 instanceof io.netty.handler.codec.http2.Http2WindowUpdateFrame
            if (r3 == 0) goto Lc
            return
        Lc:
            r3 = r4
            io.netty.handler.codec.http2.Http2StreamFrame r3 = (io.netty.handler.codec.http2.Http2StreamFrame) r3
            io.netty.handler.codec.http2.Http2FrameStream r0 = r3.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r0
            io.netty.channel.Channel r0 = r0.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r0 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r0
            boolean r1 = r4 instanceof io.netty.handler.codec.http2.Http2ResetFrame
            if (r1 == 0) goto L25
            io.netty.channel.ChannelPipeline r3 = r0.pipeline()
            r3.fireUserEventTriggered(r4)
            return
        L25:
            r0.fireChildRead(r3)
            return
        L29:
            boolean r0 = r4 instanceof io.netty.handler.codec.http2.Http2GoAwayFrame
            if (r0 == 0) goto L33
            r0 = r4
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = (io.netty.handler.codec.http2.Http2GoAwayFrame) r0
            r2.onHttp2GoAwayFrame(r3, r0)
        L33:
            r3.fireChannelRead(r4)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.processPendingReadCompleteQueue()
            r1.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isWritable()
            if (r0 == 0) goto Lf
            io.netty.handler.codec.http2.Http2FrameStreamVisitor r0 = io.netty.handler.codec.http2.AbstractHttp2StreamChannel.WRITABLE_VISITOR
            r1.forEachActiveStream(r0)
        Lf:
            r2.fireChannelWritabilityChanged()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http2.Http2FrameStreamException
            if (r0 == 0) goto L2d
            r2 = r3
            io.netty.handler.codec.http2.Http2FrameStreamException r2 = (io.netty.handler.codec.http2.Http2FrameStreamException) r2
            io.netty.handler.codec.http2.Http2FrameStream r2 = r2.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r2 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r2
            io.netty.channel.Channel r2 = r2.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r2
            io.netty.channel.ChannelPipeline r0 = r2.pipeline()     // Catch: java.lang.Throwable -> L24
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L24
            r0.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> L24
            io.netty.channel.Channel$Unsafe r2 = r2.unsafe()
            r2.closeForcibly()
            return
        L24:
            r3 = move-exception
            io.netty.channel.Channel$Unsafe r2 = r2.unsafe()
            r2.closeForcibly()
            throw r3
        L2d:
            r2.fireExceptionCaught(r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ChannelDuplexHandler
    protected void handlerAdded0(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            io.netty.util.concurrent.EventExecutor r0 = r3.executor()
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.channel.EventLoop r1 = r1.eventLoop()
            if (r0 != r1) goto L11
            r2.ctx = r3
            return
        L11:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "EventExecutor must be EventLoop of Channel"
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.handler.codec.http2.Http2ChannelDuplexHandler
    protected void handlerRemoved0(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r1 = r0.readCompletePendingQueue
            r1.clear()
            return
    }

    io.netty.handler.codec.http2.Http2StreamChannel newOutboundStream() {
            r3 = this;
            io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel r0 = new io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel
            io.netty.handler.codec.http2.Http2FrameStream r1 = r3.newStream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r1 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http2.Http2FrameStreamEvent
            if (r0 == 0) goto L8d
            io.netty.handler.codec.http2.Http2FrameStreamEvent r5 = (io.netty.handler.codec.http2.Http2FrameStreamEvent) r5
            io.netty.handler.codec.http2.Http2FrameStream r0 = r5.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r0
            io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r5 = r5.type()
            io.netty.handler.codec.http2.Http2FrameStreamEvent$Type r1 = io.netty.handler.codec.http2.Http2FrameStreamEvent.Type.State
            if (r5 != r1) goto L8c
            int[] r5 = io.netty.handler.codec.http2.Http2MultiplexHandler.AnonymousClass3.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
            io.netty.handler.codec.http2.Http2Stream$State r1 = r0.state()
            int r1 = r1.ordinal()
            r5 = r5[r1]
            r1 = 1
            if (r5 == r1) goto L37
            r2 = 2
            if (r5 == r2) goto L3e
            r2 = 3
            if (r5 == r2) goto L3e
            r4 = 4
            if (r5 == r4) goto L2d
            goto L8c
        L2d:
            io.netty.channel.Channel r4 = r0.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r4 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r4
            if (r4 == 0) goto L8c
            r4.streamClosed()
            return
        L37:
            int r5 = r0.id()
            if (r5 == r1) goto L3e
            goto L8c
        L3e:
            io.netty.channel.Channel r5 = r0.attachment
            if (r5 == 0) goto L43
            goto L8c
        L43:
            int r5 = r0.id()
            if (r5 != r1) goto L6a
            boolean r5 = isServer(r4)
            if (r5 != 0) goto L6a
            io.netty.channel.ChannelHandler r5 = r3.upgradeStreamHandler
            if (r5 == 0) goto L5e
            io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel r5 = new io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel
            io.netty.channel.ChannelHandler r1 = r3.upgradeStreamHandler
            r5.<init>(r3, r0, r1)
            r5.closeOutbound()
            goto L71
        L5e:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "Client is misconfigured for upgrade requests"
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r0, r5)
            throw r4
        L6a:
            io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel r5 = new io.netty.handler.codec.http2.Http2MultiplexHandler$Http2MultiplexHandlerStreamChannel
            io.netty.channel.ChannelHandler r1 = r3.inboundStreamHandler
            r5.<init>(r3, r0, r1)
        L71:
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.EventLoop r4 = r4.eventLoop()
            io.netty.channel.ChannelFuture r4 = r4.register(r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L87
            registerDone(r4)
            return
        L87:
            io.netty.channel.ChannelFutureListener r5 = io.netty.handler.codec.http2.Http2MultiplexHandler.CHILD_CHANNEL_REGISTRATION_LISTENER
            r4.addListener(r5)
        L8c:
            return
        L8d:
            r4.fireUserEventTriggered(r5)
            return
    }
}
