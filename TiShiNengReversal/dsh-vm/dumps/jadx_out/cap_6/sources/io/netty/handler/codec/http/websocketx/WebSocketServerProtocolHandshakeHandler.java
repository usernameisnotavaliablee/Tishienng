package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class WebSocketServerProtocolHandshakeHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private final boolean checkStartsWith;
    private io.netty.channel.ChannelHandlerContext ctx;
    private final io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig decoderConfig;
    private io.netty.channel.ChannelPromise handshakePromise;
    private final long handshakeTimeoutMillis;
    private final java.lang.String subprotocols;
    private final java.lang.String websocketPath;




    WebSocketServerProtocolHandshakeHandler(java.lang.String r1, java.lang.String r2, boolean r3, long r4, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r6) {
            r0 = this;
            r0.<init>()
            r0.websocketPath = r1
            r0.subprotocols = r2
            r0.checkStartsWith = r3
            java.lang.String r1 = "handshakeTimeoutMillis"
            long r1 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r1)
            r0.handshakeTimeoutMillis = r1
            java.lang.String r1 = "decoderConfig"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r6, r1)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r1
            r0.decoderConfig = r1
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$000(io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    private void applyHandshakeTimeout() {
            r6 = this;
            io.netty.channel.ChannelPromise r0 = r6.handshakePromise
            long r1 = r6.handshakeTimeoutMillis
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2a
            boolean r3 = r0.isDone()
            if (r3 == 0) goto L11
            goto L2a
        L11:
            io.netty.channel.ChannelHandlerContext r3 = r6.ctx
            io.netty.util.concurrent.EventExecutor r3 = r3.executor()
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$2 r4 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$2
            r4.<init>(r6, r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.netty.util.concurrent.ScheduledFuture r1 = r3.schedule(r4, r1, r5)
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$3 r2 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$3
            r2.<init>(r6, r1)
            r0.addListener(r2)
        L2a:
            return
    }

    private static java.lang.String getWebSocketLocation(io.netty.channel.ChannelPipeline r1, io.netty.handler.codec.http.HttpRequest r2, java.lang.String r3) {
            java.lang.Class<io.netty.handler.ssl.SslHandler> r0 = io.netty.handler.ssl.SslHandler.class
            io.netty.channel.ChannelHandler r1 = r1.get(r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "wss"
            goto Ld
        Lb:
            java.lang.String r1 = "ws"
        Ld:
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.String r2 = r2.get(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private boolean isNotWebSocketPath(io.netty.handler.codec.http.FullHttpRequest r4) {
            r3 = this;
            boolean r0 = r3.checkStartsWith
            r1 = 0
            r2 = 1
            java.lang.String r4 = r4.uri()
            if (r0 == 0) goto L14
            java.lang.String r0 = r3.websocketPath
            boolean r4 = r4.startsWith(r0)
            if (r4 != 0) goto L13
            return r2
        L13:
            return r1
        L14:
            java.lang.String r0 = r3.websocketPath
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1d
            return r2
        L1d:
            return r1
    }

    private static void sendHttpResponse(io.netty.channel.ChannelHandlerContext r0, io.netty.handler.codec.http.HttpRequest r1, io.netty.handler.codec.http.HttpResponse r2) {
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.ChannelFuture r0 = r0.writeAndFlush(r2)
            boolean r1 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r1)
            if (r1 == 0) goto L1c
            io.netty.handler.codec.http.HttpResponseStatus r1 = r2.status()
            int r1 = r1.code()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            io.netty.channel.ChannelFutureListener r1 = io.netty.channel.ChannelFutureListener.CLOSE
            r0.addListener(r1)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r7, java.lang.Object r8) throws java.lang.Exception {
            r6 = this;
            r4 = r8
            io.netty.handler.codec.http.FullHttpRequest r4 = (io.netty.handler.codec.http.FullHttpRequest) r4
            boolean r0 = r6.isNotWebSocketPath(r4)
            if (r0 == 0) goto Ld
            r7.fireChannelRead(r8)
            return
        Ld:
            io.netty.handler.codec.http.HttpMethod r8 = io.netty.handler.codec.http.HttpMethod.GET     // Catch: java.lang.Throwable -> L8a
            io.netty.handler.codec.http.HttpMethod r0 = r4.method()     // Catch: java.lang.Throwable -> L8a
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L8a
            if (r8 != 0) goto L36
            io.netty.handler.codec.http.DefaultFullHttpResponse r8 = new io.netty.handler.codec.http.DefaultFullHttpResponse     // Catch: java.lang.Throwable -> L32
            io.netty.handler.codec.http.HttpVersion r0 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1     // Catch: java.lang.Throwable -> L32
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN     // Catch: java.lang.Throwable -> L32
            io.netty.buffer.ByteBufAllocator r2 = r7.alloc()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            io.netty.buffer.ByteBuf r2 = r2.buffer(r3)     // Catch: java.lang.Throwable -> L32
            r8.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L32
            sendHttpResponse(r7, r4, r8)     // Catch: java.lang.Throwable -> L32
            r4.release()
            return
        L32:
            r0 = move-exception
            r7 = r0
            r1 = r6
            goto L8d
        L36:
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory r8 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory     // Catch: java.lang.Throwable -> L8a
            io.netty.channel.ChannelPipeline r0 = r7.pipeline()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r6.websocketPath     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = getWebSocketLocation(r0, r4, r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r6.subprotocols     // Catch: java.lang.Throwable -> L8a
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r6.decoderConfig     // Catch: java.lang.Throwable -> L8a
            r8.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L8a
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker r5 = r8.newHandshaker(r4)     // Catch: java.lang.Throwable -> L8a
            io.netty.channel.ChannelPromise r2 = r6.handshakePromise     // Catch: java.lang.Throwable -> L8a
            if (r5 != 0) goto L5a
            io.netty.channel.Channel r7 = r7.channel()     // Catch: java.lang.Throwable -> L32
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(r7)     // Catch: java.lang.Throwable -> L32
            r1 = r6
            goto L83
        L5a:
            io.netty.channel.Channel r8 = r7.channel()     // Catch: java.lang.Throwable -> L8a
            io.netty.channel.ChannelFuture r8 = r5.handshake(r8, r4)     // Catch: java.lang.Throwable -> L8a
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$1 r0 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler$1     // Catch: java.lang.Throwable -> L8a
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L87
            r8.addListener(r0)     // Catch: java.lang.Throwable -> L87
            r6.applyHandshakeTimeout()     // Catch: java.lang.Throwable -> L87
            io.netty.channel.Channel r7 = r3.channel()     // Catch: java.lang.Throwable -> L87
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.setHandshaker(r7, r5)     // Catch: java.lang.Throwable -> L87
            io.netty.channel.ChannelPipeline r7 = r3.pipeline()     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = "WS403Responder"
            io.netty.channel.ChannelHandler r0 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.forbiddenHttpRequestResponder()     // Catch: java.lang.Throwable -> L87
            r7.replace(r6, r8, r0)     // Catch: java.lang.Throwable -> L87
        L83:
            r4.release()
            return
        L87:
            r0 = move-exception
        L88:
            r7 = r0
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r6
            goto L88
        L8d:
            r4.release()
            throw r7
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
