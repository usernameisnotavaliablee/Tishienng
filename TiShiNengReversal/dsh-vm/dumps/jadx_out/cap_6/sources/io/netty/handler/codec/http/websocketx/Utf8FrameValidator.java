package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Utf8FrameValidator extends io.netty.channel.ChannelInboundHandlerAdapter {
    private int fragmentedFramesCount;
    private io.netty.handler.codec.http.websocketx.Utf8Validator utf8Validator;

    public Utf8FrameValidator() {
            r0 = this;
            r0.<init>()
            return
    }

    private void checkUTF8String(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.Utf8Validator r0 = r1.utf8Validator
            if (r0 != 0) goto Lb
            io.netty.handler.codec.http.websocketx.Utf8Validator r0 = new io.netty.handler.codec.http.websocketx.Utf8Validator
            r0.<init>()
            r1.utf8Validator = r0
        Lb:
            io.netty.handler.codec.http.websocketx.Utf8Validator r0 = r1.utf8Validator
            r0.check(r2)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.websocketx.WebSocketFrame
            if (r0 == 0) goto L56
            r0 = r4
            io.netty.handler.codec.http.websocketx.WebSocketFrame r0 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r0
            boolean r1 = r0.isFinalFragment()
            if (r1 == 0) goto L2f
            boolean r1 = r0 instanceof io.netty.handler.codec.http.websocketx.PingWebSocketFrame
            if (r1 != 0) goto L56
            r1 = 0
            r2.fragmentedFramesCount = r1
            boolean r1 = r0 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r1 != 0) goto L22
            io.netty.handler.codec.http.websocketx.Utf8Validator r1 = r2.utf8Validator
            if (r1 == 0) goto L56
            boolean r1 = r1.isChecking()
            if (r1 == 0) goto L56
        L22:
            io.netty.buffer.ByteBuf r0 = r0.content()
            r2.checkUTF8String(r0)
            io.netty.handler.codec.http.websocketx.Utf8Validator r0 = r2.utf8Validator
            r0.finish()
            goto L56
        L2f:
            int r1 = r2.fragmentedFramesCount
            if (r1 != 0) goto L3f
            boolean r1 = r0 instanceof io.netty.handler.codec.http.websocketx.TextWebSocketFrame
            if (r1 == 0) goto L50
            io.netty.buffer.ByteBuf r0 = r0.content()
            r2.checkUTF8String(r0)
            goto L50
        L3f:
            io.netty.handler.codec.http.websocketx.Utf8Validator r1 = r2.utf8Validator
            if (r1 == 0) goto L50
            boolean r1 = r1.isChecking()
            if (r1 == 0) goto L50
            io.netty.buffer.ByteBuf r0 = r0.content()
            r2.checkUTF8String(r0)
        L50:
            int r0 = r2.fragmentedFramesCount
            int r0 = r0 + 1
            r2.fragmentedFramesCount = r0
        L56:
            super.channelRead(r3, r4)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r3, java.lang.Throwable r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.CorruptedFrameException
            if (r0 == 0) goto L19
            io.netty.channel.Channel r0 = r3.channel()
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L19
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.channel.ChannelFuture r0 = r3.writeAndFlush(r0)
            io.netty.channel.ChannelFutureListener r1 = io.netty.channel.ChannelFutureListener.CLOSE
            r0.addListener(r1)
        L19:
            super.exceptionCaught(r3, r4)
            return
    }
}
