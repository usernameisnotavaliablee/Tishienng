package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpServerExpectContinueHandler extends io.netty.channel.ChannelInboundHandlerAdapter {
    private static final io.netty.handler.codec.http.FullHttpResponse ACCEPT = null;
    private static final io.netty.handler.codec.http.FullHttpResponse EXPECTATION_FAILED = null;

    static {
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.EXPECTATION_FAILED
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.http.HttpServerExpectContinueHandler.EXPECTATION_FAILED = r0
            io.netty.handler.codec.http.DefaultFullHttpResponse r2 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpResponseStatus r4 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            r2.<init>(r1, r4, r3)
            io.netty.handler.codec.http.HttpServerExpectContinueHandler.ACCEPT = r2
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.set(r1, r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            r0.set(r1, r3)
            return
    }

    public HttpServerExpectContinueHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    protected io.netty.handler.codec.http.HttpResponse acceptMessage(io.netty.handler.codec.http.HttpRequest r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = io.netty.handler.codec.http.HttpServerExpectContinueHandler.ACCEPT
            io.netty.handler.codec.http.FullHttpResponse r1 = r1.retainedDuplicate()
            return r1
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L36
            r0 = r5
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            boolean r1 = io.netty.handler.codec.http.HttpUtil.is100ContinueExpected(r0)
            if (r1 == 0) goto L36
            io.netty.handler.codec.http.HttpResponse r1 = r3.acceptMessage(r0)
            if (r1 != 0) goto L24
            io.netty.handler.codec.http.HttpResponse r0 = r3.rejectResponse(r0)
            io.netty.util.ReferenceCountUtil.release(r5)
            io.netty.channel.ChannelFuture r4 = r4.writeAndFlush(r0)
            io.netty.channel.ChannelFutureListener r5 = io.netty.channel.ChannelFutureListener.CLOSE_ON_FAILURE
            r4.addListener(r5)
            return
        L24:
            io.netty.channel.ChannelFuture r1 = r4.writeAndFlush(r1)
            io.netty.channel.ChannelFutureListener r2 = io.netty.channel.ChannelFutureListener.CLOSE_ON_FAILURE
            r1.addListener(r2)
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            r0.remove(r1)
        L36:
            super.channelRead(r4, r5)
            return
    }

    protected io.netty.handler.codec.http.HttpResponse rejectResponse(io.netty.handler.codec.http.HttpRequest r1) {
            r0 = this;
            io.netty.handler.codec.http.FullHttpResponse r1 = io.netty.handler.codec.http.HttpServerExpectContinueHandler.EXPECTATION_FAILED
            io.netty.handler.codec.http.FullHttpResponse r1 = r1.retainedDuplicate()
            return r1
    }
}
