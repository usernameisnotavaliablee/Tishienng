package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerProtocolHandler extends io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler {
    private static final long DEFAULT_HANDSHAKE_TIMEOUT_MS = 10000;
    private static final io.netty.util.AttributeKey<io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker> HANDSHAKER_ATTR_KEY = null;
    private final boolean checkStartsWith;
    private final io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig decoderConfig;
    private final long handshakeTimeoutMillis;
    private final java.lang.String subprotocols;
    private final java.lang.String websocketPath;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HandshakeComplete {
        private final io.netty.handler.codec.http.HttpHeaders requestHeaders;
        private final java.lang.String requestUri;
        private final java.lang.String selectedSubprotocol;

        HandshakeComplete(java.lang.String r1, io.netty.handler.codec.http.HttpHeaders r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.requestUri = r1
                r0.requestHeaders = r2
                r0.selectedSubprotocol = r3
                return
        }

        public io.netty.handler.codec.http.HttpHeaders requestHeaders() {
                r1 = this;
                io.netty.handler.codec.http.HttpHeaders r0 = r1.requestHeaders
                return r0
        }

        public java.lang.String requestUri() {
                r1 = this;
                java.lang.String r0 = r1.requestUri
                return r0
        }

        public java.lang.String selectedSubprotocol() {
                r1 = this;
                java.lang.String r0 = r1.selectedSubprotocol
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ServerHandshakeStateEvent extends java.lang.Enum<io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent> {
        private static final /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent[] $VALUES = null;

        @java.lang.Deprecated
        public static final io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent HANDSHAKE_COMPLETE = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent HANDSHAKE_TIMEOUT = null;

        static {
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent r0 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent
                java.lang.String r1 = "HANDSHAKE_COMPLETE"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE = r0
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent r1 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent
                java.lang.String r3 = "HANDSHAKE_TIMEOUT"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_TIMEOUT = r1
                r3 = 2
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent[] r3 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent.$VALUES = r3
                return
        }

        ServerHandshakeStateEvent(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent> r0 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent r1 = (io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent) r1
                return r1
        }

        public static io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent[] values() {
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent[] r0 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$ServerHandshakeStateEvent[] r0 = (io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.ServerHandshakeStateEvent[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.class
            java.lang.String r1 = "HANDSHAKER"
            io.netty.util.AttributeKey r0 = io.netty.util.AttributeKey.valueOf(r0, r1)
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.HANDSHAKER_ATTR_KEY = r0
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r3) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r0)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r1, long r2) {
            r0 = this;
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r4, r0)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r7, java.lang.String r8, long r9) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r7, java.lang.String r8, boolean r9) {
            r6 = this;
            r4 = 10000(0x2710, double:4.9407E-320)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r8, java.lang.String r9, boolean r10, int r11) {
            r7 = this;
            r5 = 10000(0x2710, double:4.9407E-320)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r9, java.lang.String r10, boolean r11, int r12, long r13) {
            r8 = this;
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r9, java.lang.String r10, boolean r11, int r12, boolean r13) {
            r8 = this;
            r6 = 10000(0x2710, double:4.9407E-320)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r10, java.lang.String r11, boolean r12, int r13, boolean r14, long r15) {
            r9 = this;
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r10, java.lang.String r11, boolean r12, int r13, boolean r14, boolean r15) {
            r9 = this;
            r7 = 10000(0x2710, double:4.9407E-320)
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r11, java.lang.String r12, boolean r13, int r14, boolean r15, boolean r16, long r17) {
            r10 = this;
            r7 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r11, java.lang.String r12, boolean r13, int r14, boolean r15, boolean r16, boolean r17) {
            r10 = this;
            r8 = 10000(0x2710, double:4.9407E-320)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r9, java.lang.String r10, boolean r11, int r12, boolean r13, boolean r14, boolean r15, long r16) {
            r8 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r12 = r0.maxFramePayloadLength(r12)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r12 = r12.allowMaskMismatch(r13)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r11 = r12.allowExtensions(r11)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r7 = r11.build()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r8, java.lang.String r9, boolean r10, long r11) {
            r7 = this;
            r4 = 65536(0x10000, float:9.1835E-41)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r1, java.lang.String r2, boolean r3, boolean r4, long r5, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r7) {
            r0 = this;
            r0.<init>(r4)
            r0.websocketPath = r1
            r0.subprotocols = r2
            r0.checkStartsWith = r3
            java.lang.String r1 = "handshakeTimeoutMillis"
            long r1 = io.netty.util.internal.ObjectUtil.checkPositive(r5, r1)
            r0.handshakeTimeoutMillis = r1
            java.lang.String r1 = "decoderConfig"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r1)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r1
            r0.decoderConfig = r1
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r4, r0)
            return
    }

    public WebSocketServerProtocolHandler(java.lang.String r10, boolean r11, long r12) {
            r9 = this;
            r4 = 65536(0x10000, float:9.1835E-41)
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r9
            r1 = r10
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static io.netty.channel.ChannelHandler forbiddenHttpRequestResponder() {
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$1 r0 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler$1
            r0.<init>()
            return r0
    }

    static io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker getHandshaker(io.netty.channel.Channel r1) {
            io.netty.util.AttributeKey<io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.HANDSHAKER_ATTR_KEY
            io.netty.util.Attribute r1 = r1.attr(r0)
            java.lang.Object r1 = r1.get()
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker r1 = (io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker) r1
            return r1
    }

    static void setHandshaker(io.netty.channel.Channel r1, io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker r2) {
            io.netty.util.AttributeKey<io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.HANDSHAKER_ATTR_KEY
            io.netty.util.Attribute r1 = r1.attr(r0)
            r1.set(r2)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http.websocketx.WebSocketFrame r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            if (r0 == 0) goto L27
            io.netty.channel.Channel r4 = r2.channel()
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker r4 = getHandshaker(r4)
            if (r4 == 0) goto L1b
            r3.mo39retain()
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r3 = (io.netty.handler.codec.http.websocketx.CloseWebSocketFrame) r3
            r4.close(r2, r3)
            return
        L1b:
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            io.netty.channel.ChannelFuture r2 = r2.writeAndFlush(r3)
            io.netty.channel.ChannelFutureListener r3 = io.netty.channel.ChannelFutureListener.CLOSE
            r2.addListener(r3)
            return
        L27:
            super.decode(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler, io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.websocketx.WebSocketFrame r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r2 = (io.netty.handler.codec.http.websocketx.WebSocketFrame) r2
            r0.decode(r1, r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext r4, java.lang.Throwable r5) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r5 instanceof io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            if (r0 == 0) goto L27
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST
            java.lang.String r5 = r5.getMessage()
            byte[] r5 = r5.getBytes()
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.wrappedBuffer(r5)
            r0.<init>(r1, r2, r5)
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.ChannelFuture r4 = r4.writeAndFlush(r0)
            io.netty.channel.ChannelFutureListener r5 = io.netty.channel.ChannelFutureListener.CLOSE
            r4.addListener(r5)
            return
        L27:
            r4.fireExceptionCaught(r5)
            r4.close()
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r11) {
            r10 = this;
            io.netty.channel.ChannelPipeline r0 = r11.pipeline()
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler> r1 = io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler.class
            io.netty.channel.ChannelHandler r2 = r0.get(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = r11.name()
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler r3 = new io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandshakeHandler
            java.lang.String r4 = r10.websocketPath
            java.lang.String r5 = r10.subprotocols
            boolean r6 = r10.checkStartsWith
            long r7 = r10.handshakeTimeoutMillis
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r9 = r10.decoderConfig
            r3.<init>(r4, r5, r6, r7, r9)
            r0.addBefore(r2, r1, r3)
        L26:
            java.lang.Class<io.netty.handler.codec.http.websocketx.Utf8FrameValidator> r1 = io.netty.handler.codec.http.websocketx.Utf8FrameValidator.class
            io.netty.channel.ChannelHandler r2 = r0.get(r1)
            if (r2 != 0) goto L3e
            java.lang.String r11 = r11.name()
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.websocketx.Utf8FrameValidator r2 = new io.netty.handler.codec.http.websocketx.Utf8FrameValidator
            r2.<init>()
            r0.addBefore(r11, r1, r2)
        L3e:
            return
    }
}
