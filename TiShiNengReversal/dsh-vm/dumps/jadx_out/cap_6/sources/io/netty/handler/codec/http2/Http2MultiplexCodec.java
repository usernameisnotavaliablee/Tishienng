package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2MultiplexCodec extends io.netty.handler.codec.http2.Http2FrameCodec {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    volatile io.netty.channel.ChannelHandlerContext ctx;
    private int idCount;
    private final io.netty.channel.ChannelHandler inboundStreamHandler;
    private boolean parentReadInProgress;
    private final java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> readCompletePendingQueue;
    private final io.netty.channel.ChannelHandler upgradeStreamHandler;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.Http2MultiplexCodec$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.Http2MultiplexCodec.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2MultiplexCodecStreamChannel extends io.netty.handler.codec.http2.AbstractHttp2StreamChannel {
        final /* synthetic */ io.netty.handler.codec.http2.Http2MultiplexCodec this$0;

        Http2MultiplexCodecStreamChannel(io.netty.handler.codec.http2.Http2MultiplexCodec r1, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r2, io.netty.channel.ChannelHandler r3) {
                r0 = this;
                r0.this$0 = r1
                int r1 = io.netty.handler.codec.http2.Http2MultiplexCodec.access$004(r1)
                r0.<init>(r2, r1, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected void addChannelToReadCompletePendingQueue() {
                r1 = this;
            L0:
                io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.this$0
                java.util.Queue r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.access$200(r0)
                boolean r0 = r0.offer(r1)
                if (r0 != 0) goto L12
                io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.this$0
                io.netty.handler.codec.http2.Http2MultiplexCodec.access$300(r0)
                goto L0
            L12:
                return
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected void flush0(io.netty.channel.ChannelHandlerContext r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.this$0
                r0.flush0(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected boolean isParentReadInProgress() {
                r1 = this;
                io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.this$0
                boolean r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.access$100(r0)
                return r0
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected io.netty.channel.ChannelHandlerContext parentContext() {
                r1 = this;
                io.netty.handler.codec.http2.Http2MultiplexCodec r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = r0.ctx
                return r0
        }

        @Override // io.netty.handler.codec.http2.AbstractHttp2StreamChannel
        protected io.netty.channel.ChannelFuture write0(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) {
                r2 = this;
                io.netty.channel.ChannelPromise r0 = r3.newPromise()
                io.netty.handler.codec.http2.Http2MultiplexCodec r1 = r2.this$0
                r1.write(r3, r4, r0)
                return r0
        }
    }

    static {
            return
    }

    Http2MultiplexCodec(io.netty.handler.codec.http2.Http2ConnectionEncoder r1, io.netty.handler.codec.http2.Http2ConnectionDecoder r2, io.netty.handler.codec.http2.Http2Settings r3, io.netty.channel.ChannelHandler r4, io.netty.channel.ChannelHandler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r6)
            io.netty.handler.codec.http2.MaxCapacityQueue r1 = new io.netty.handler.codec.http2.MaxCapacityQueue
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r3 = 8
            r2.<init>(r3)
            r3 = 100
            r1.<init>(r2, r3)
            r0.readCompletePendingQueue = r1
            r0.inboundStreamHandler = r4
            r0.upgradeStreamHandler = r5
            return
    }

    static /* synthetic */ int access$004(io.netty.handler.codec.http2.Http2MultiplexCodec r1) {
            int r0 = r1.idCount
            int r0 = r0 + 1
            r1.idCount = r0
            return r0
    }

    static /* synthetic */ boolean access$100(io.netty.handler.codec.http2.Http2MultiplexCodec r0) {
            boolean r0 = r0.parentReadInProgress
            return r0
    }

    static /* synthetic */ java.util.Queue access$200(io.netty.handler.codec.http2.Http2MultiplexCodec r0) {
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r0.readCompletePendingQueue
            return r0
    }

    static /* synthetic */ void access$300(io.netty.handler.codec.http2.Http2MultiplexCodec r0) {
            r0.processPendingReadCompleteQueue()
            return
    }

    private void onHttp2GoAwayFrame(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2GoAwayFrame r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodec$1 r0 = new io.netty.handler.codec.http2.Http2MultiplexCodec$1     // Catch: io.netty.handler.codec.http2.Http2Exception -> L9
            r0.<init>(r1, r3)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L9
            r1.forEachActiveStream(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L9
            return
        L9:
            r3 = move-exception
            r2.fireExceptionCaught(r3)
            r2.close()
            return
    }

    private void processPendingReadCompleteQueue() {
            r2 = this;
            r0 = 1
            r2.parentReadInProgress = r0
        L3:
            r0 = 0
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r1 = r2.readCompletePendingQueue     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L1f
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r1 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r1     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1b
            r2.parentReadInProgress = r0
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r2.readCompletePendingQueue
            r0.clear()
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            r2.flush0(r0)
            return
        L1b:
            r1.fireChildReadComplete()     // Catch: java.lang.Throwable -> L1f
            goto L3
        L1f:
            r1 = move-exception
            r2.parentReadInProgress = r0
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r0 = r2.readCompletePendingQueue
            r0.clear()
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            r2.flush0(r0)
            throw r1
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.parentReadInProgress = r0
            super.channelRead(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelReadComplete(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.processPendingReadCompleteQueue()
            r0.channelReadComplete0(r1)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelWritabilityChanged(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
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

    final void flush0(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            r0.flush(r1)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameCodec
    public final void handlerAdded0(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
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

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.handler.codec.ByteToMessageDecoder
    public final void handlerRemoved0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.handlerRemoved0(r1)
            java.util.Queue<io.netty.handler.codec.http2.AbstractHttp2StreamChannel> r1 = r0.readCompletePendingQueue
            r1.clear()
            return
    }

    final io.netty.handler.codec.http2.Http2StreamChannel newOutboundStream() {
            r3 = this;
            io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel r0 = new io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r1 = r3.newStream()
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameCodec
    final void onHttp2Frame(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Frame r3) {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http2.Http2StreamFrame
            if (r0 == 0) goto L14
            io.netty.handler.codec.http2.Http2StreamFrame r3 = (io.netty.handler.codec.http2.Http2StreamFrame) r3
            io.netty.handler.codec.http2.Http2FrameStream r2 = r3.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r2 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r2
            io.netty.channel.Channel r2 = r2.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r2
            r2.fireChildRead(r3)
            return
        L14:
            boolean r0 = r3 instanceof io.netty.handler.codec.http2.Http2GoAwayFrame
            if (r0 == 0) goto L1e
            r0 = r3
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = (io.netty.handler.codec.http2.Http2GoAwayFrame) r0
            r1.onHttp2GoAwayFrame(r2, r0)
        L1e:
            r2.fireChannelRead(r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameCodec
    final void onHttp2FrameStreamException(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2FrameStreamException r3) {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameStream r2 = r3.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r2 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r2
            io.netty.channel.Channel r2 = r2.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r2 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r2
            io.netty.channel.ChannelPipeline r0 = r2.pipeline()     // Catch: java.lang.Throwable -> L1d
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Throwable -> L1d
            r0.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> L1d
            io.netty.channel.Channel$Unsafe r2 = r2.unsafe()
            r2.closeForcibly()
            return
        L1d:
            r3 = move-exception
            io.netty.channel.Channel$Unsafe r2 = r2.unsafe()
            r2.closeForcibly()
            throw r3
    }

    @Override // io.netty.handler.codec.http2.Http2FrameCodec
    final void onHttp2StreamStateChanged(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r5) {
            r3 = this;
            int[] r0 = io.netty.handler.codec.http2.Http2MultiplexCodec.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
            io.netty.handler.codec.http2.Http2Stream$State r1 = r5.state()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L23
            r2 = 2
            if (r0 == r2) goto L2a
            r2 = 3
            if (r0 == r2) goto L2a
            r4 = 4
            if (r0 == r4) goto L19
            goto L2e
        L19:
            io.netty.channel.Channel r4 = r5.attachment
            io.netty.handler.codec.http2.AbstractHttp2StreamChannel r4 = (io.netty.handler.codec.http2.AbstractHttp2StreamChannel) r4
            if (r4 == 0) goto L2e
            r4.streamClosed()
            return
        L23:
            int r0 = r5.id()
            if (r0 == r1) goto L2a
            goto L2e
        L2a:
            io.netty.channel.Channel r0 = r5.attachment
            if (r0 == 0) goto L2f
        L2e:
            return
        L2f:
            int r0 = r5.id()
            if (r0 != r1) goto L4a
            io.netty.handler.codec.http2.Http2Connection r0 = r3.connection()
            boolean r0 = r0.isServer()
            if (r0 != 0) goto L4a
            io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel r0 = new io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel
            io.netty.channel.ChannelHandler r1 = r3.upgradeStreamHandler
            r0.<init>(r3, r5, r1)
            r0.closeOutbound()
            goto L51
        L4a:
            io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel r0 = new io.netty.handler.codec.http2.Http2MultiplexCodec$Http2MultiplexCodecStreamChannel
            io.netty.channel.ChannelHandler r1 = r3.inboundStreamHandler
            r0.<init>(r3, r5, r1)
        L51:
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.EventLoop r4 = r4.eventLoop()
            io.netty.channel.ChannelFuture r4 = r4.register(r0)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L67
            io.netty.handler.codec.http2.Http2MultiplexHandler.registerDone(r4)
            return
        L67:
            io.netty.channel.ChannelFutureListener r5 = io.netty.handler.codec.http2.Http2MultiplexHandler.CHILD_CHANNEL_REGISTRATION_LISTENER
            r4.addListener(r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler
    public void onHttpClientUpgrade() throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.channel.ChannelHandler r0 = r3.upgradeStreamHandler
            if (r0 == 0) goto L8
            super.onHttpClientUpgrade()
            return
        L8:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Client is misconfigured for upgrade requests"
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
    }
}
