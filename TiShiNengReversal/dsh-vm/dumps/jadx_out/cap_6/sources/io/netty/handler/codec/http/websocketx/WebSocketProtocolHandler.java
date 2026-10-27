package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class WebSocketProtocolHandler extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.handler.codec.http.websocketx.WebSocketFrame> {
    private final boolean dropPongFrames;

    WebSocketProtocolHandler() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    WebSocketProtocolHandler(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.dropPongFrames = r1
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

    /* JADX WARN: Can't rename method to resolve collision */
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http.websocketx.WebSocketFrame r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.PingWebSocketFrame
            if (r0 == 0) goto L1f
            io.netty.buffer.ByteBuf r4 = r3.content()
            r4.retain()
            io.netty.channel.Channel r4 = r2.channel()
            io.netty.handler.codec.http.websocketx.PongWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.PongWebSocketFrame
            io.netty.buffer.ByteBuf r3 = r3.content()
            r0.<init>(r3)
            r4.writeAndFlush(r0)
            readIfNeeded(r2)
            return
        L1f:
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.PongWebSocketFrame
            if (r0 == 0) goto L2b
            boolean r0 = r1.dropPongFrames
            if (r0 == 0) goto L2b
            readIfNeeded(r2)
            return
        L2b:
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = r3.mo39retain()
            r4.add(r2)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.decode(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) throws java.lang.Exception {
            r0 = this;
            r1.fireExceptionCaught(r2)
            r1.close()
            return
    }
}
