package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketClientHandshaker08 extends io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker {
    public static final java.lang.String MAGIC_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private java.lang.String expectedChallengeResponseString;
    private final boolean performMasking;

    static {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08> r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08.logger = r0
            return
    }

    public WebSocketClientHandshaker08(java.net.URI r12, io.netty.handler.codec.http.websocketx.WebSocketVersion r13, java.lang.String r14, boolean r15, io.netty.handler.codec.http.HttpHeaders r16, int r17) {
            r11 = this;
            r8 = 0
            r9 = 10000(0x2710, double:4.9407E-320)
            r7 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public WebSocketClientHandshaker08(java.net.URI r12, io.netty.handler.codec.http.websocketx.WebSocketVersion r13, java.lang.String r14, boolean r15, io.netty.handler.codec.http.HttpHeaders r16, int r17, boolean r18, boolean r19) {
            r11 = this;
            r9 = 10000(0x2710, double:4.9407E-320)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public WebSocketClientHandshaker08(java.net.URI r13, io.netty.handler.codec.http.websocketx.WebSocketVersion r14, java.lang.String r15, boolean r16, io.netty.handler.codec.http.HttpHeaders r17, int r18, boolean r19, boolean r20, long r21) {
            r12 = this;
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
    }

    WebSocketClientHandshaker08(java.net.URI r10, io.netty.handler.codec.http.websocketx.WebSocketVersion r11, java.lang.String r12, boolean r13, io.netty.handler.codec.http.HttpHeaders r14, int r15, boolean r16, boolean r17, long r18, boolean r20) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r18
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.allowExtensions = r13
            r10 = r16
            r9.performMasking = r10
            r10 = r17
            r9.allowMaskMismatch = r10
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.FullHttpRequest newHandshakeRequest() {
            r7 = this;
            java.net.URI r0 = r7.uri()
            r1 = 16
            byte[] r1 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomBytes(r1)
            java.lang.String r1 = io.netty.handler.codec.http.websocketx.WebSocketUtil.base64(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r2 = r2.getBytes(r3)
            byte[] r2 = io.netty.handler.codec.http.websocketx.WebSocketUtil.sha1(r2)
            java.lang.String r2 = io.netty.handler.codec.http.websocketx.WebSocketUtil.base64(r2)
            r7.expectedChallengeResponseString = r2
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08.logger
            boolean r3 = r2.isDebugEnabled()
            if (r3 == 0) goto L3e
            java.lang.String r3 = "WebSocket version 08 client handshake key: {}, expected response: {}"
            java.lang.String r4 = r7.expectedChallengeResponseString
            r2.debug(r3, r1, r4)
        L3e:
            io.netty.handler.codec.http.DefaultFullHttpRequest r2 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r3 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpMethod r4 = io.netty.handler.codec.http.HttpMethod.GET
            java.lang.String r5 = r7.upgradeUrl(r0)
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r2.<init>(r3, r4, r5, r6)
            io.netty.handler.codec.http.HttpHeaders r3 = r2.headers()
            io.netty.handler.codec.http.HttpHeaders r4 = r7.customHeaders
            if (r4 == 0) goto L58
            r3.add(r4)
        L58:
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            io.netty.handler.codec.http.HttpHeaders r4 = r3.set(r4, r5)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            io.netty.handler.codec.http.HttpHeaders r4 = r4.set(r5, r6)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY
            io.netty.handler.codec.http.HttpHeaders r1 = r4.set(r5, r1)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.CharSequence r5 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.websocketHostValue(r0)
            io.netty.handler.codec.http.HttpHeaders r1 = r1.set(r4, r5)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ORIGIN
            java.lang.CharSequence r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.websocketOriginValue(r0)
            r1.set(r4, r0)
            java.lang.String r0 = r7.expectedSubprotocol()
            if (r0 == 0) goto L92
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L92
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL
            r3.set(r1, r0)
        L92:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_VERSION
            java.lang.String r1 = "8"
            r3.set(r0, r1)
            return r2
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameEncoder
            boolean r1 = r2.performMasking
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder() {
            r5 = this;
            io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket08FrameDecoder
            boolean r1 = r5.allowExtensions
            int r2 = r5.maxFramePayloadLength()
            boolean r3 = r5.allowMaskMismatch
            r4 = 0
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    public io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08 setForceCloseTimeoutMillis(long r1) {
            r0 = this;
            super.setForceCloseTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker setForceCloseTimeoutMillis(long r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker08 r1 = r0.setForceCloseTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected void verify(io.netty.handler.codec.http.FullHttpResponse r6) {
            r5 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            io.netty.handler.codec.http.HttpHeaders r1 = r6.headers()
            io.netty.handler.codec.http.HttpResponseStatus r2 = r6.status()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L82
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r6 = r1.get(r6)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            boolean r0 = r0.contentEqualsIgnoreCase(r6)
            if (r0 == 0) goto L6b
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r2 = 1
            boolean r0 = r1.containsValue(r6, r0, r2)
            if (r0 == 0) goto L50
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ACCEPT
            java.lang.String r6 = r1.get(r6)
            if (r6 == 0) goto L3a
            java.lang.String r0 = r5.expectedChallengeResponseString
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3a
            return
        L3a:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r0 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.String r1 = r5.expectedChallengeResponseString
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r3[r2] = r1
            java.lang.String r6 = "Invalid challenge. Actual: %s. Expected: %s"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        L50:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r0 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid handshake response connection: "
            r2.append(r3)
            java.lang.String r6 = r1.get(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
        L6b:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r0 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid handshake response upgrade: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L82:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r0 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid handshake response getStatus: "
            r1.append(r2)
            io.netty.handler.codec.http.HttpResponseStatus r6 = r6.status()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }
}
