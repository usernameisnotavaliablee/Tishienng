package io.netty.handler.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ProxyHandler extends io.netty.channel.ChannelDuplexHandler {
    static final java.lang.String AUTH_NONE = "none";
    private static final long DEFAULT_CONNECT_TIMEOUT_MILLIS = 10000;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.proxy.ProxyHandler.LazyChannelPromise connectPromise;
    private io.netty.util.concurrent.ScheduledFuture<?> connectTimeoutFuture;
    private volatile long connectTimeoutMillis;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private volatile java.net.SocketAddress destinationAddress;
    private boolean finished;
    private boolean flushedPrematurely;
    private io.netty.channel.PendingWriteQueue pendingWrites;
    private final java.net.SocketAddress proxyAddress;
    private boolean suppressChannelReadComplete;
    private final io.netty.channel.ChannelFutureListener writeListener;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class LazyChannelPromise extends io.netty.util.concurrent.DefaultPromise<io.netty.channel.Channel> {
        final /* synthetic */ io.netty.handler.proxy.ProxyHandler this$0;

        private LazyChannelPromise(io.netty.handler.proxy.ProxyHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ LazyChannelPromise(io.netty.handler.proxy.ProxyHandler r1, io.netty.handler.proxy.ProxyHandler.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        protected io.netty.util.concurrent.EventExecutor executor() {
                r1 = this;
                io.netty.handler.proxy.ProxyHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.proxy.ProxyHandler.access$300(r0)
                if (r0 == 0) goto L13
                io.netty.handler.proxy.ProxyHandler r0 = r1.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.proxy.ProxyHandler.access$300(r0)
                io.netty.util.concurrent.EventExecutor r0 = r0.executor()
                return r0
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.proxy.ProxyHandler> r0 = io.netty.handler.proxy.ProxyHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.proxy.ProxyHandler.logger = r0
            return
    }

    protected ProxyHandler(java.net.SocketAddress r3) {
            r2 = this;
            r2.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.connectTimeoutMillis = r0
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = new io.netty.handler.proxy.ProxyHandler$LazyChannelPromise
            r1 = 0
            r0.<init>(r2, r1)
            r2.connectPromise = r0
            io.netty.handler.proxy.ProxyHandler$1 r0 = new io.netty.handler.proxy.ProxyHandler$1
            r0.<init>(r2)
            r2.writeListener = r0
            if (r3 == 0) goto L1b
            r2.proxyAddress = r3
            return
        L1b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "proxyAddress"
            r3.<init>(r0)
            throw r3
    }

    static /* synthetic */ void access$100(io.netty.handler.proxy.ProxyHandler r0, java.lang.Throwable r1) {
            r0.setConnectFailure(r1)
            return
    }

    static /* synthetic */ io.netty.handler.proxy.ProxyHandler.LazyChannelPromise access$200(io.netty.handler.proxy.ProxyHandler r0) {
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r0.connectPromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$300(io.netty.handler.proxy.ProxyHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    private void addPendingWrite(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.channel.PendingWriteQueue r0 = r1.pendingWrites
            if (r0 != 0) goto Lb
            io.netty.channel.PendingWriteQueue r0 = new io.netty.channel.PendingWriteQueue
            r0.<init>(r2)
            r1.pendingWrites = r0
        Lb:
            r0.add(r3, r4)
            return
    }

    private void cancelConnectTimeoutFuture() {
            r2 = this;
            io.netty.util.concurrent.ScheduledFuture<?> r0 = r2.connectTimeoutFuture
            if (r0 == 0) goto Lb
            r1 = 0
            r0.cancel(r1)
            r0 = 0
            r2.connectTimeoutFuture = r0
        Lb:
            return
    }

    private void failPendingWrites(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.PendingWriteQueue r0 = r1.pendingWrites
            if (r0 == 0) goto La
            r0.removeAndFailAll(r2)
            r2 = 0
            r1.pendingWrites = r2
        La:
            return
    }

    private void failPendingWritesAndClose(java.lang.Throwable r2) {
            r1 = this;
            r1.failPendingWrites(r2)
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r1.connectPromise
            r0.tryFailure(r2)
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            r0.fireExceptionCaught(r2)
            io.netty.channel.ChannelHandlerContext r2 = r1.ctx
            r2.close()
            return
    }

    private static void readIfNeeded(io.netty.channel.ChannelHandlerContext r1) {
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L11
            r1.read()
        L11:
            return
    }

    private boolean safeRemoveDecoder() {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx     // Catch: java.lang.Exception -> L7
            r3.removeDecoder(r0)     // Catch: java.lang.Exception -> L7
            r0 = 1
            return r0
        L7:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.proxy.ProxyHandler.logger
            java.lang.String r2 = "Failed to remove proxy decoders:"
            r1.warn(r2, r0)
            r0 = 0
            return r0
    }

    private boolean safeRemoveEncoder() {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx     // Catch: java.lang.Exception -> L7
            r3.removeEncoder(r0)     // Catch: java.lang.Exception -> L7
            r0 = 1
            return r0
        L7:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.proxy.ProxyHandler.logger
            java.lang.String r2 = "Failed to remove proxy encoders:"
            r1.warn(r2, r0)
            r0 = 0
            return r0
    }

    private void sendInitialMessage(io.netty.channel.ChannelHandlerContext r6) throws java.lang.Exception {
            r5 = this;
            long r0 = r5.connectTimeoutMillis
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.netty.util.concurrent.EventExecutor r2 = r6.executor()
            io.netty.handler.proxy.ProxyHandler$2 r3 = new io.netty.handler.proxy.ProxyHandler$2
            r3.<init>(r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r0 = r2.schedule(r3, r0, r4)
            r5.connectTimeoutFuture = r0
        L19:
            java.lang.Object r0 = r5.newInitialMessage(r6)
            if (r0 == 0) goto L22
            r5.sendToProxyServer(r0)
        L22:
            readIfNeeded(r6)
            return
    }

    private void setConnectFailure(java.lang.Throwable r3) {
            r2 = this;
            r0 = 1
            r2.finished = r0
            r2.cancelConnectTimeoutFuture()
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r2.connectPromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L29
            boolean r0 = r3 instanceof io.netty.handler.proxy.ProxyConnectException
            if (r0 != 0) goto L20
            io.netty.handler.proxy.ProxyConnectException r0 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r2.exceptionMessage(r1)
            r0.<init>(r1, r3)
            r3 = r0
        L20:
            r2.safeRemoveDecoder()
            r2.safeRemoveEncoder()
            r2.failPendingWritesAndClose(r3)
        L29:
            return
    }

    private void setConnectSuccess() {
            r7 = this;
            r0 = 1
            r7.finished = r0
            r7.cancelConnectTimeoutFuture()
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r7.connectPromise
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L51
            boolean r0 = r7.safeRemoveEncoder()
            io.netty.channel.ChannelHandlerContext r1 = r7.ctx
            io.netty.handler.proxy.ProxyConnectionEvent r2 = new io.netty.handler.proxy.ProxyConnectionEvent
            java.lang.String r3 = r7.protocol()
            java.lang.String r4 = r7.authScheme()
            java.net.SocketAddress r5 = r7.proxyAddress
            java.net.SocketAddress r6 = r7.destinationAddress
            r2.<init>(r3, r4, r5, r6)
            r1.fireUserEventTriggered(r2)
            boolean r1 = r7.safeRemoveDecoder()
            r0 = r0 & r1
            if (r0 == 0) goto L47
            r7.writePendingWrites()
            boolean r0 = r7.flushedPrematurely
            if (r0 == 0) goto L3b
            io.netty.channel.ChannelHandlerContext r0 = r7.ctx
            r0.flush()
        L3b:
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r7.connectPromise
            io.netty.channel.ChannelHandlerContext r1 = r7.ctx
            io.netty.channel.Channel r1 = r1.channel()
            r0.trySuccess(r1)
            return
        L47:
            io.netty.handler.proxy.ProxyConnectException r0 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.String r1 = "failed to remove all codec handlers added by the proxy handler; bug?"
            r0.<init>(r1)
            r7.failPendingWritesAndClose(r0)
        L51:
            return
    }

    private void writePendingWrites() {
            r1 = this;
            io.netty.channel.PendingWriteQueue r0 = r1.pendingWrites
            if (r0 == 0) goto La
            r0.removeAndWriteAll()
            r0 = 0
            r1.pendingWrites = r0
        La:
            return
    }

    protected abstract void addCodec(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    public abstract java.lang.String authScheme();

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelActive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.sendInitialMessage(r1)
            r1.fireChannelActive()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelInactive(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L8
            r2.fireChannelInactive()
            return
        L8:
            io.netty.handler.proxy.ProxyConnectException r2 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.String r0 = "disconnected"
            java.lang.String r0 = r1.exceptionMessage(r0)
            r2.<init>(r0)
            r1.setConnectFailure(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelRead(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto Lb
            r0 = 0
            r1.suppressChannelReadComplete = r0
            r2.fireChannelRead(r3)
            return
        Lb:
            r0 = 1
            r1.suppressChannelReadComplete = r0
            boolean r2 = r1.handleResponse(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            r1.setConnectSuccess()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r2 = move-exception
            goto L1e
        L1a:
            io.netty.util.ReferenceCountUtil.release(r3)
            return
        L1e:
            io.netty.util.ReferenceCountUtil.release(r3)
            r1.setConnectFailure(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void channelReadComplete(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.suppressChannelReadComplete
            if (r0 == 0) goto Lb
            r0 = 0
            r1.suppressChannelReadComplete = r0
            readIfNeeded(r2)
            return
        Lb:
            r2.fireChannelReadComplete()
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public final void connect(io.netty.channel.ChannelHandlerContext r2, java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r1 = this;
            java.net.SocketAddress r0 = r1.destinationAddress
            if (r0 == 0) goto Ld
            java.nio.channels.ConnectionPendingException r2 = new java.nio.channels.ConnectionPendingException
            r2.<init>()
            r5.setFailure(r2)
            return
        Ld:
            r1.destinationAddress = r3
            java.net.SocketAddress r3 = r1.proxyAddress
            r2.connect(r3, r4, r5)
            return
    }

    public final io.netty.util.concurrent.Future<io.netty.channel.Channel> connectFuture() {
            r1 = this;
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r1.connectPromise
            return r0
    }

    public final long connectTimeoutMillis() {
            r2 = this;
            long r0 = r2.connectTimeoutMillis
            return r0
    }

    public final <T extends java.net.SocketAddress> T destinationAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.destinationAddress
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public final void exceptionCaught(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L8
            r2.fireExceptionCaught(r3)
            return
        L8:
            r1.setConnectFailure(r3)
            return
    }

    protected final java.lang.String exceptionMessage(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 128
            r0.<init>(r1)
            java.lang.String r1 = r3.protocol()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = r3.authScheme()
            r0.append(r2)
            r0.append(r1)
            java.net.SocketAddress r2 = r3.proxyAddress
            r0.append(r2)
            java.lang.String r2 = " => "
            r0.append(r2)
            java.net.SocketAddress r2 = r3.destinationAddress
            r0.append(r2)
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L40
            r0.append(r1)
            r0.append(r4)
        L40:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public final void flush(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto Lb
            r1.writePendingWrites()
            r2.flush()
            return
        Lb:
            r2 = 1
            r1.flushedPrematurely = r2
            return
    }

    protected abstract boolean handleResponse(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public final void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r1.ctx = r2
            r1.addCodec(r2)
            io.netty.channel.Channel r0 = r2.channel()
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            r1.sendInitialMessage(r2)
        L12:
            return
    }

    public final boolean isConnected() {
            r1 = this;
            io.netty.handler.proxy.ProxyHandler$LazyChannelPromise r0 = r1.connectPromise
            boolean r0 = r0.isSuccess()
            return r0
    }

    protected abstract java.lang.Object newInitialMessage(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    public abstract java.lang.String protocol();

    public final <T extends java.net.SocketAddress> T proxyAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.proxyAddress
            return r0
    }

    protected abstract void removeDecoder(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    protected abstract void removeEncoder(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception;

    protected final void sendToProxyServer(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2)
            io.netty.channel.ChannelFutureListener r0 = r1.writeListener
            r2.addListener(r0)
            return
    }

    public final void setConnectTimeoutMillis(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            r4 = r0
        L7:
            r3.connectTimeoutMillis = r4
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public final void write(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3, io.netty.channel.ChannelPromise r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto Lb
            r1.writePendingWrites()
            r2.write(r3, r4)
            return
        Lb:
            r1.addPendingWrite(r2, r3, r4)
            return
    }
}
