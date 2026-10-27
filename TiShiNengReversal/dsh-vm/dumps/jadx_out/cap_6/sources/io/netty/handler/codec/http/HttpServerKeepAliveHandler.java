package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpServerKeepAliveHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final java.lang.String MULTIPART_PREFIX = "multipart";
    private int pendingResponses;
    private boolean persistentConnection;

    public HttpServerKeepAliveHandler() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.persistentConnection = r0
            return
    }

    private static boolean isInformational(io.netty.handler.codec.http.HttpResponse r1) {
            io.netty.handler.codec.http.HttpResponseStatus r1 = r1.status()
            io.netty.handler.codec.http.HttpStatusClass r1 = r1.codeClass()
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
            if (r1 != r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static boolean isMultipart(io.netty.handler.codec.http.HttpResponse r7) {
            io.netty.handler.codec.http.HttpHeaders r7 = r7.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.String r1 = r7.get(r0)
            if (r1 == 0) goto L1b
            r5 = 0
            r6 = 9
            r2 = 1
            r3 = 0
            java.lang.String r4 = "multipart"
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r7 == 0) goto L1b
            r7 = 1
            return r7
        L1b:
            r7 = 0
            return r7
    }

    private static boolean isSelfDefinedMessageLength(io.netty.handler.codec.http.HttpResponse r1) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isContentLengthSet(r1)
            if (r0 != 0) goto L2b
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isTransferEncodingChunked(r1)
            if (r0 != 0) goto L2b
            boolean r0 = isMultipart(r1)
            if (r0 != 0) goto L2b
            boolean r0 = isInformational(r1)
            if (r0 != 0) goto L2b
            io.netty.handler.codec.http.HttpResponseStatus r1 = r1.status()
            int r1 = r1.code()
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT
            int r0 = r0.code()
            if (r1 != r0) goto L29
            goto L2b
        L29:
            r1 = 0
            return r1
        L2b:
            r1 = 1
            return r1
    }

    private boolean shouldKeepAlive() {
            r1 = this;
            int r0 = r1.pendingResponses
            if (r0 != 0) goto Lb
            boolean r0 = r1.persistentConnection
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private void trackResponse(io.netty.handler.codec.http.HttpResponse r1) {
            r0 = this;
            boolean r1 = isInformational(r1)
            if (r1 != 0) goto Lc
            int r1 = r0.pendingResponses
            int r1 = r1 + (-1)
            r0.pendingResponses = r1
        Lc:
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L17
            r0 = r4
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            boolean r1 = r2.persistentConnection
            if (r1 == 0) goto L17
            int r1 = r2.pendingResponses
            int r1 = r1 + 1
            r2.pendingResponses = r1
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r0)
            r2.persistentConnection = r0
        L17:
            super.channelRead(r3, r4)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r4, java.lang.Object r5, io.netty.channel.ChannelPromise r6) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L24
            r0 = r5
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            r3.trackResponse(r0)
            boolean r1 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r0)
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = isSelfDefinedMessageLength(r0)
            if (r1 != 0) goto L1b
        L17:
            r3.pendingResponses = r2
            r3.persistentConnection = r2
        L1b:
            boolean r1 = r3.shouldKeepAlive()
            if (r1 != 0) goto L24
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r0, r2)
        L24:
            boolean r0 = r5 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r0 == 0) goto L38
            boolean r0 = r3.shouldKeepAlive()
            if (r0 != 0) goto L38
            io.netty.channel.ChannelPromise r6 = r6.unvoid()
            io.netty.channel.ChannelFutureListener r0 = io.netty.channel.ChannelFutureListener.CLOSE
            io.netty.channel.ChannelPromise r6 = r6.addListener(r0)
        L38:
            super.write(r4, r5, r6)
            return
    }
}
