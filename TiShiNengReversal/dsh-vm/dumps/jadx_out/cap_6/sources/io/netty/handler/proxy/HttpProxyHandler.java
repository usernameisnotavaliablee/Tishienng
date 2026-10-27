package io.netty.handler.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpProxyHandler extends io.netty.handler.proxy.ProxyHandler {
    private static final java.lang.String AUTH_BASIC = "basic";
    private static final java.lang.String PROTOCOL = "http";
    private final java.lang.CharSequence authorization;
    private final io.netty.handler.codec.http.HttpClientCodec codec;
    private final boolean ignoreDefaultPortsInConnectHostHeader;
    private io.netty.handler.codec.http.HttpHeaders inboundHeaders;
    private final io.netty.handler.codec.http.HttpHeaders outboundHeaders;
    private final java.lang.String password;
    private io.netty.handler.codec.http.HttpResponseStatus status;
    private final java.lang.String username;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HttpProxyConnectException extends io.netty.handler.proxy.ProxyConnectException {
        private static final long serialVersionUID = -8824334609292146066L;
        private final io.netty.handler.codec.http.HttpHeaders headers;

        public HttpProxyConnectException(java.lang.String r1, io.netty.handler.codec.http.HttpHeaders r2) {
                r0 = this;
                r0.<init>(r1)
                r0.headers = r2
                return
        }

        public io.netty.handler.codec.http.HttpHeaders headers() {
                r1 = this;
                io.netty.handler.codec.http.HttpHeaders r0 = r1.headers
                return r0
        }
    }

    public HttpProxyHandler(java.net.SocketAddress r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public HttpProxyHandler(java.net.SocketAddress r2, io.netty.handler.codec.http.HttpHeaders r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public HttpProxyHandler(java.net.SocketAddress r1, io.netty.handler.codec.http.HttpHeaders r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            io.netty.handler.codec.http.HttpClientCodec r1 = new io.netty.handler.codec.http.HttpClientCodec
            r1.<init>()
            r0.codec = r1
            r1 = 0
            r0.username = r1
            r0.password = r1
            r0.authorization = r1
            r0.outboundHeaders = r2
            r0.ignoreDefaultPortsInConnectHostHeader = r3
            return
    }

    public HttpProxyHandler(java.net.SocketAddress r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public HttpProxyHandler(java.net.SocketAddress r7, java.lang.String r8, java.lang.String r9, io.netty.handler.codec.http.HttpHeaders r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HttpProxyHandler(java.net.SocketAddress r3, java.lang.String r4, java.lang.String r5, io.netty.handler.codec.http.HttpHeaders r6, boolean r7) {
            r2 = this;
            r2.<init>(r3)
            io.netty.handler.codec.http.HttpClientCodec r3 = new io.netty.handler.codec.http.HttpClientCodec
            r3.<init>()
            r2.codec = r3
            if (r4 == 0) goto L62
            if (r5 == 0) goto L5a
            r2.username = r4
            r2.password = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r4 = 58
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.UTF_8
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.copiedBuffer(r3, r4)
            r4 = 0
            io.netty.buffer.ByteBuf r4 = io.netty.handler.codec.base64.Base64.encode(r3, r4)
            io.netty.util.AsciiString r5 = new io.netty.util.AsciiString
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Basic "
            r0.append(r1)
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r1 = r4.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r2.authorization = r5
            r3.release()
            r4.release()
            r2.outboundHeaders = r6
            r2.ignoreDefaultPortsInConnectHostHeader = r7
            return
        L5a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "password"
            r3.<init>(r4)
            throw r3
        L62:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "username"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void addCodec(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPipeline r0 = r4.pipeline()
            java.lang.String r4 = r4.name()
            r1 = 0
            io.netty.handler.codec.http.HttpClientCodec r2 = r3.codec
            r0.addBefore(r4, r1, r2)
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String authScheme() {
            r1 = this;
            java.lang.CharSequence r0 = r1.authorization
            if (r0 == 0) goto L7
            java.lang.String r0 = "basic"
            return r0
        L7:
            java.lang.String r0 = "none"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected boolean handleResponse(io.netty.channel.ChannelHandlerContext r2, java.lang.Object r3) throws java.lang.Exception {
            r1 = this;
            boolean r2 = r3 instanceof io.netty.handler.codec.http.HttpResponse
            if (r2 == 0) goto L25
            io.netty.handler.codec.http.HttpResponseStatus r2 = r1.status
            if (r2 != 0) goto L18
            r2 = r3
            io.netty.handler.codec.http.HttpResponse r2 = (io.netty.handler.codec.http.HttpResponse) r2
            io.netty.handler.codec.http.HttpResponseStatus r0 = r2.status()
            r1.status = r0
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            r1.inboundHeaders = r2
            goto L25
        L18:
            io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException r2 = new io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException
            java.lang.String r3 = "too many responses"
            java.lang.String r3 = r1.exceptionMessage(r3)
            r0 = 0
            r2.<init>(r3, r0)
            throw r2
        L25:
            boolean r2 = r3 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r2 == 0) goto L63
            io.netty.handler.codec.http.HttpResponseStatus r3 = r1.status
            if (r3 == 0) goto L55
            int r3 = r3.code()
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L36
            goto L63
        L36:
            io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException r2 = new io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "status: "
            r3.append(r0)
            io.netty.handler.codec.http.HttpResponseStatus r0 = r1.status
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r1.exceptionMessage(r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r1.inboundHeaders
            r2.<init>(r3, r0)
            throw r2
        L55:
            io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException r2 = new io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException
            java.lang.String r3 = "missing response"
            java.lang.String r3 = r1.exceptionMessage(r3)
            io.netty.handler.codec.http.HttpHeaders r0 = r1.inboundHeaders
            r2.<init>(r3, r0)
            throw r2
        L63:
            return r2
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected java.lang.Object newInitialMessage(io.netty.channel.ChannelHandlerContext r10) throws java.lang.Exception {
            r9 = this;
            java.net.SocketAddress r10 = r9.destinationAddress()
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.lang.String r0 = io.netty.handler.codec.http.HttpUtil.formatHostnameForHttp(r10)
            int r10 = r10.getPort()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r6 = r1.toString()
            boolean r1 = r9.ignoreDefaultPortsInConnectHostHeader
            if (r1 == 0) goto L2f
            r1 = 80
            if (r10 == r1) goto L30
            r1 = 443(0x1bb, float:6.21E-43)
            if (r10 != r1) goto L2f
            goto L30
        L2f:
            r0 = r6
        L30:
            io.netty.handler.codec.http.DefaultFullHttpRequest r3 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r4 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpMethod r5 = io.netty.handler.codec.http.HttpMethod.CONNECT
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            io.netty.handler.codec.http.HttpHeaders r10 = r3.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            r10.set(r1, r0)
            java.lang.CharSequence r10 = r9.authorization
            if (r10 == 0) goto L54
            io.netty.handler.codec.http.HttpHeaders r10 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.PROXY_AUTHORIZATION
            java.lang.CharSequence r1 = r9.authorization
            r10.set(r0, r1)
        L54:
            io.netty.handler.codec.http.HttpHeaders r10 = r9.outboundHeaders
            if (r10 == 0) goto L61
            io.netty.handler.codec.http.HttpHeaders r10 = r3.headers()
            io.netty.handler.codec.http.HttpHeaders r0 = r9.outboundHeaders
            r10.add(r0)
        L61:
            return r3
    }

    public java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = "http"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void removeDecoder(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpClientCodec r1 = r0.codec
            r1.removeInboundHandler()
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void removeEncoder(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpClientCodec r1 = r0.codec
            r1.removeOutboundHandler()
            return
    }

    public java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
