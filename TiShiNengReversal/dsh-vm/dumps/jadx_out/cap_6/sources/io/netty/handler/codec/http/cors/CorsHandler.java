package io.netty.handler.codec.http.cors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CorsHandler extends io.netty.channel.ChannelDuplexHandler {
    private static final java.lang.String ANY_ORIGIN = "*";
    private static final java.lang.String NULL_ORIGIN = "null";
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private io.netty.handler.codec.http.cors.CorsConfig config;
    private final java.util.List<io.netty.handler.codec.http.cors.CorsConfig> configList;
    private boolean isShortCircuit;
    private io.netty.handler.codec.http.HttpRequest request;

    static {
            java.lang.Class<io.netty.handler.codec.http.cors.CorsHandler> r0 = io.netty.handler.codec.http.cors.CorsHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.cors.CorsHandler.logger = r0
            return
    }

    public CorsHandler(io.netty.handler.codec.http.cors.CorsConfig r2) {
            r1 = this;
            java.lang.String r0 = "config"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            boolean r2 = r2.isShortCircuit()
            r1.<init>(r0, r2)
            return
    }

    public CorsHandler(java.util.List<io.netty.handler.codec.http.cors.CorsConfig> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "configList"
            io.netty.util.internal.ObjectUtil.checkNonEmpty(r2, r0)
            r1.configList = r2
            r1.isShortCircuit = r3
            return
    }

    private void echoRequestOrigin(io.netty.handler.codec.http.HttpResponse r3) {
            r2 = this;
            io.netty.handler.codec.http.HttpRequest r0 = r2.request
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            java.lang.String r0 = r0.get(r1)
            setOrigin(r3, r0)
            return
    }

    private static void forbidden(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.HttpRequest r6) {
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = r6.protocolVersion()
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN
            io.netty.buffer.ByteBufAllocator r3 = r5.alloc()
            r4 = 0
            io.netty.buffer.ByteBuf r3 = r3.buffer(r4)
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.ZERO
            r1.set(r2, r3)
            io.netty.util.ReferenceCountUtil.release(r6)
            respond(r5, r6, r0)
            return
    }

    private io.netty.handler.codec.http.cors.CorsConfig getForOrigin(java.lang.String r4) {
            r3 = this;
            java.util.List<io.netty.handler.codec.http.cors.CorsConfig> r0 = r3.configList
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.http.cors.CorsConfig r1 = (io.netty.handler.codec.http.cors.CorsConfig) r1
            boolean r2 = r1.isAnyOriginSupported()
            if (r2 == 0) goto L19
            goto L32
        L19:
            java.util.Set r2 = r1.origins()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L24
            goto L32
        L24:
            boolean r2 = r1.isNullOriginAllowed()
            if (r2 != 0) goto L32
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
        L32:
            return r1
        L33:
            r4 = 0
            return r4
    }

    private void handlePreflight(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.HttpRequest r6) {
            r4 = this;
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = r6.protocolVersion()
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.OK
            r3 = 1
            r0.<init>(r1, r2, r3, r3)
            boolean r1 = r4.setOrigin(r0)
            if (r1 == 0) goto L21
            r4.setAllowMethods(r0)
            r4.setAllowHeaders(r0)
            r4.setAllowCredentials(r0)
            r4.setMaxAge(r0)
            r4.setPreflightHeaders(r0)
        L21:
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L36
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderValues.ZERO
            r1.set(r2, r3)
        L36:
            io.netty.util.ReferenceCountUtil.release(r6)
            respond(r5, r6, r0)
            return
    }

    private static boolean isPreflightRequest(io.netty.handler.codec.http.HttpRequest r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.OPTIONS
            io.netty.handler.codec.http.HttpMethod r2 = r2.method()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L22
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L22
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_REQUEST_METHOD
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    private static void respond(io.netty.channel.ChannelHandlerContext r0, io.netty.handler.codec.http.HttpRequest r1, io.netty.handler.codec.http.HttpResponse r2) {
            boolean r1 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r1)
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r2, r1)
            io.netty.channel.ChannelFuture r0 = r0.writeAndFlush(r2)
            if (r1 != 0) goto L12
            io.netty.channel.ChannelFutureListener r1 = io.netty.channel.ChannelFutureListener.CLOSE
            r0.addListener(r1)
        L12:
            return
    }

    private void setAllowCredentials(io.netty.handler.codec.http.HttpResponse r3) {
            r2 = this;
            io.netty.handler.codec.http.cors.CorsConfig r0 = r2.config
            boolean r0 = r0.isCredentialsAllowed()
            if (r0 == 0) goto L25
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_ORIGIN
            java.lang.String r0 = r0.get(r1)
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_CREDENTIALS
            java.lang.String r1 = "true"
            r3.set(r0, r1)
        L25:
            return
    }

    private void setAllowHeaders(io.netty.handler.codec.http.HttpResponse r3) {
            r2 = this;
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_HEADERS
            io.netty.handler.codec.http.cors.CorsConfig r1 = r2.config
            java.util.Set r1 = r1.allowedRequestHeaders()
            r3.set(r0, r1)
            return
    }

    private void setAllowMethods(io.netty.handler.codec.http.HttpResponse r3) {
            r2 = this;
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_METHODS
            io.netty.handler.codec.http.cors.CorsConfig r1 = r2.config
            java.util.Set r1 = r1.allowedRequestMethods()
            r3.set(r0, r1)
            return
    }

    private static void setAnyOrigin(io.netty.handler.codec.http.HttpResponse r1) {
            java.lang.String r0 = "*"
            setOrigin(r1, r0)
            return
    }

    private void setExposeHeaders(io.netty.handler.codec.http.HttpResponse r3) {
            r2 = this;
            io.netty.handler.codec.http.cors.CorsConfig r0 = r2.config
            java.util.Set r0 = r0.exposedHeaders()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_EXPOSE_HEADERS
            io.netty.handler.codec.http.cors.CorsConfig r1 = r2.config
            java.util.Set r1 = r1.exposedHeaders()
            r3.set(r0, r1)
        L1b:
            return
    }

    private void setMaxAge(io.netty.handler.codec.http.HttpResponse r4) {
            r3 = this;
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_MAX_AGE
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            long r1 = r1.maxAge()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.set(r0, r1)
            return
    }

    private static void setNullOrigin(io.netty.handler.codec.http.HttpResponse r1) {
            java.lang.String r0 = "null"
            setOrigin(r1, r0)
            return
    }

    private static void setOrigin(io.netty.handler.codec.http.HttpResponse r1, java.lang.String r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_ORIGIN
            r1.set(r0, r2)
            return
    }

    private boolean setOrigin(io.netty.handler.codec.http.HttpResponse r4) {
            r3 = this;
            io.netty.handler.codec.http.HttpRequest r0 = r3.request
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            java.lang.String r0 = r0.get(r1)
            if (r0 == 0) goto L62
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            if (r1 == 0) goto L62
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            r2 = 1
            if (r1 == 0) goto L27
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            boolean r1 = r1.isNullOriginAllowed()
            if (r1 == 0) goto L27
            setNullOrigin(r4)
            return r2
        L27:
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            boolean r1 = r1.isAnyOriginSupported()
            if (r1 == 0) goto L42
            io.netty.handler.codec.http.cors.CorsConfig r0 = r3.config
            boolean r0 = r0.isCredentialsAllowed()
            if (r0 == 0) goto L3e
            r3.echoRequestOrigin(r4)
            setVaryHeader(r4)
            goto L41
        L3e:
            setAnyOrigin(r4)
        L41:
            return r2
        L42:
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            java.util.Set r1 = r1.origins()
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L55
            setOrigin(r4, r0)
            setVaryHeader(r4)
            return r2
        L55:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.codec.http.cors.CorsHandler.logger
            io.netty.handler.codec.http.cors.CorsConfig r1 = r3.config
            java.util.Set r1 = r1.origins()
            java.lang.String r2 = "Request origin [{}]] was not among the configured origins [{}]"
            r4.debug(r2, r0, r1)
        L62:
            r4 = 0
            return r4
    }

    private void setPreflightHeaders(io.netty.handler.codec.http.HttpResponse r2) {
            r1 = this;
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.handler.codec.http.cors.CorsConfig r0 = r1.config
            io.netty.handler.codec.http.HttpHeaders r0 = r0.preflightResponseHeaders()
            r2.add(r0)
            return
    }

    private static void setVaryHeader(io.netty.handler.codec.http.HttpResponse r2) {
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.VARY
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            r2.set(r0, r1)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L37
            r0 = r4
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            r2.request = r0
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            java.lang.String r0 = r0.get(r1)
            io.netty.handler.codec.http.cors.CorsConfig r1 = r2.getForOrigin(r0)
            r2.config = r1
            io.netty.handler.codec.http.HttpRequest r1 = r2.request
            boolean r1 = isPreflightRequest(r1)
            if (r1 == 0) goto L27
            io.netty.handler.codec.http.HttpRequest r4 = r2.request
            r2.handlePreflight(r3, r4)
            return
        L27:
            boolean r1 = r2.isShortCircuit
            if (r1 == 0) goto L37
            if (r0 == 0) goto L37
            io.netty.handler.codec.http.cors.CorsConfig r0 = r2.config
            if (r0 != 0) goto L37
            io.netty.handler.codec.http.HttpRequest r4 = r2.request
            forbidden(r3, r4)
            return
        L37:
            r3.fireChannelRead(r4)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.http.cors.CorsConfig r0 = r2.config
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCorsSupportEnabled()
            if (r0 == 0) goto L1d
            boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L1d
            r0 = r4
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            boolean r1 = r2.setOrigin(r0)
            if (r1 == 0) goto L1d
            r2.setAllowCredentials(r0)
            r2.setExposeHeaders(r0)
        L1d:
            r3.write(r4, r5)
            return
    }
}
