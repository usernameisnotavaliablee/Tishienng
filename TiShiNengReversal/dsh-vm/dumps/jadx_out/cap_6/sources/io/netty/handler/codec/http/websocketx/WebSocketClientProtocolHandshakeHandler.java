package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class WebSocketClientProtocolHandshakeHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private static final long DEFAULT_HANDSHAKE_TIMEOUT_MS = 10000;
    private io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.channel.ChannelPromise handshakePromise;
    private final long handshakeTimeoutMillis;
    private final io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker handshaker;




    WebSocketClientProtocolHandshakeHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r3) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r0)
            return
    }

    WebSocketClientProtocolHandshakeHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.handshaker = r1
            java.lang.String r1 = "handshakeTimeoutMillis"
            long r1 = io.netty.util.internal.ObjectUtil.checkPositive(r2, r1)
            r0.handshakeTimeoutMillis = r1
            return
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$000(io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler r0) {
            io.netty.channel.ChannelPromise r0 = r0.handshakePromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$100(io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    private void applyHandshakeTimeout() {
            r6 = this;
            io.netty.channel.ChannelPromise r0 = r6.handshakePromise
            long r1 = r6.handshakeTimeoutMillis
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2c
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L11
            goto L2c
        L11:
            io.netty.channel.ChannelHandlerContext r1 = r6.ctx
            io.netty.util.concurrent.EventExecutor r1 = r1.executor()
            io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$2 r2 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$2
            r2.<init>(r6, r0)
            long r3 = r6.handshakeTimeoutMillis
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
            io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$3 r2 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$3
            r2.<init>(r6, r1)
            r0.addListener(r2)
        L2c:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(io.netty.channel.ChannelHandlerContext r3) throws java.lang.Exception {
            r2 = this;
            super.channelActive(r3)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r0 = r2.handshaker
            io.netty.channel.Channel r1 = r3.channel()
            io.netty.channel.ChannelFuture r0 = r0.handshake(r1)
            io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$1 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler$1
            r1.<init>(r2, r3)
            r0.addListener(r1)
            r2.applyHandshakeTimeout()
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.FullHttpResponse
            if (r0 != 0) goto L8
            r3.fireChannelRead(r4)
            return
        L8:
            io.netty.handler.codec.http.FullHttpResponse r4 = (io.netty.handler.codec.http.FullHttpResponse) r4
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r0 = r2.handshaker     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.isHandshakeComplete()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L32
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r0 = r2.handshaker     // Catch: java.lang.Throwable -> L30
            io.netty.channel.Channel r1 = r3.channel()     // Catch: java.lang.Throwable -> L30
            r0.finishHandshake(r1, r4)     // Catch: java.lang.Throwable -> L30
            io.netty.channel.ChannelPromise r0 = r2.handshakePromise     // Catch: java.lang.Throwable -> L30
            r0.trySuccess()     // Catch: java.lang.Throwable -> L30
            io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent r0 = io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_COMPLETE     // Catch: java.lang.Throwable -> L30
            r3.fireUserEventTriggered(r0)     // Catch: java.lang.Throwable -> L30
            io.netty.channel.ChannelPipeline r3 = r3.pipeline()     // Catch: java.lang.Throwable -> L30
            r3.remove(r2)     // Catch: java.lang.Throwable -> L30
            r4.release()
            return
        L30:
            r3 = move-exception
            goto L3a
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "WebSocketClientHandshaker should have been non finished yet"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L3a:
            r4.release()
            throw r3
    }

    io.netty.channel.ChannelFuture getHandshakeFuture() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.handshakePromise
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            io.netty.channel.ChannelPromise r1 = r1.newPromise()
            r0.handshakePromise = r1
            return
    }
}
