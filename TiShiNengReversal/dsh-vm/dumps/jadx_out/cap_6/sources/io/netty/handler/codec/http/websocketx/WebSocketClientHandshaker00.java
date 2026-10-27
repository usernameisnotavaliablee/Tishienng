package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketClientHandshaker00 extends io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker {
    private static final io.netty.util.AsciiString WEBSOCKET = null;
    private io.netty.buffer.ByteBuf expectedChallengeResponseBytes;

    static {
            java.lang.String r0 = "WebSocket"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00.WEBSOCKET = r0
            return
    }

    public WebSocketClientHandshaker00(java.net.URI r9, io.netty.handler.codec.http.websocketx.WebSocketVersion r10, java.lang.String r11, io.netty.handler.codec.http.HttpHeaders r12, int r13) {
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

    public WebSocketClientHandshaker00(java.net.URI r10, io.netty.handler.codec.http.websocketx.WebSocketVersion r11, java.lang.String r12, io.netty.handler.codec.http.HttpHeaders r13, int r14, long r15) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    WebSocketClientHandshaker00(java.net.URI r1, io.netty.handler.codec.http.websocketx.WebSocketVersion r2, java.lang.String r3, io.netty.handler.codec.http.HttpHeaders r4, int r5, long r6, boolean r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    private static java.lang.String insertRandomCharacters(java.lang.String r8) {
            r0 = 1
            r1 = 12
            int r0 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r0, r1)
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L35
            double r4 = java.lang.Math.random()
            r6 = 4638566878703255552(0x405f800000000000, double:126.0)
            double r4 = r4 * r6
            r6 = 4629841154425225216(0x4040800000000000, double:33.0)
            double r4 = r4 + r6
            int r4 = (int) r4
            r5 = 33
            if (r5 >= r4) goto L27
            r5 = 47
            if (r4 < r5) goto L2f
        L27:
            r5 = 58
            if (r5 >= r4) goto Lb
            r5 = 126(0x7e, float:1.77E-43)
            if (r4 >= r5) goto Lb
        L2f:
            char r4 = (char) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L35:
            r3 = 0
        L36:
            if (r3 >= r0) goto L5f
            int r4 = r8.length()
            int r4 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r2, r4)
            java.lang.String r5 = r8.substring(r2, r4)
            java.lang.String r8 = r8.substring(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            char r5 = r1[r3]
            r4.append(r5)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            int r3 = r3 + 1
            goto L36
        L5f:
            return r8
    }

    private static java.lang.String insertSpaces(java.lang.String r4, int r5) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto L2d
            int r2 = r4.length()
            r3 = 1
            int r2 = r2 - r3
            int r2 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r3, r2)
            java.lang.String r3 = r4.substring(r0, r2)
            java.lang.String r4 = r4.substring(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            int r1 = r1 + 1
            goto L2
        L2d:
            return r4
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.FullHttpRequest newHandshakeRequest() {
            r9 = this;
            r0 = 1
            r1 = 12
            int r2 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r0, r1)
            int r0 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r0, r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1 / r2
            int r1 = r1 / r0
            r4 = 0
            int r3 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r4, r3)
            int r1 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomNumber(r4, r1)
            int r5 = r3 * r2
            int r6 = r1 * r0
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            java.lang.String r5 = insertRandomCharacters(r5)
            java.lang.String r6 = insertRandomCharacters(r6)
            java.lang.String r2 = insertSpaces(r5, r2)
            java.lang.String r0 = insertSpaces(r6, r0)
            r5 = 8
            byte[] r6 = io.netty.handler.codec.http.websocketx.WebSocketUtil.randomBytes(r5)
            r7 = 4
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r8.putInt(r3)
            byte[] r3 = r8.array()
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r8.putInt(r1)
            byte[] r1 = r8.array()
            r8 = 16
            byte[] r8 = new byte[r8]
            java.lang.System.arraycopy(r3, r4, r8, r4, r7)
            java.lang.System.arraycopy(r1, r4, r8, r7, r7)
            java.lang.System.arraycopy(r6, r4, r8, r5, r5)
            byte[] r1 = io.netty.handler.codec.http.websocketx.WebSocketUtil.md5(r8)
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.wrappedBuffer(r1)
            r9.expectedChallengeResponseBytes = r1
            java.net.URI r1 = r9.uri()
            io.netty.handler.codec.http.DefaultFullHttpRequest r3 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r4 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpMethod r5 = io.netty.handler.codec.http.HttpMethod.GET
            java.lang.String r7 = r9.upgradeUrl(r1)
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.wrappedBuffer(r6)
            r3.<init>(r4, r5, r7, r8)
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()
            io.netty.handler.codec.http.HttpHeaders r5 = r9.customHeaders
            if (r5 == 0) goto L8a
            r4.add(r5)
        L8a:
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00.WEBSOCKET
            io.netty.handler.codec.http.HttpHeaders r5 = r4.set(r5, r7)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r8 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            io.netty.handler.codec.http.HttpHeaders r5 = r5.set(r7, r8)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.CharSequence r8 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.websocketHostValue(r1)
            io.netty.handler.codec.http.HttpHeaders r5 = r5.set(r7, r8)
            io.netty.util.AsciiString r7 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            java.lang.CharSequence r1 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.websocketOriginValue(r1)
            io.netty.handler.codec.http.HttpHeaders r1 = r5.set(r7, r1)
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY1
            io.netty.handler.codec.http.HttpHeaders r1 = r1.set(r5, r2)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY2
            r1.set(r2, r0)
            java.lang.String r0 = r9.expectedSubprotocol()
            if (r0 == 0) goto Lca
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lca
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL
            r4.set(r1, r0)
        Lca:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            int r1 = r6.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.set(r0, r1)
            return r3
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder
            r0.<init>()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket00FrameDecoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket00FrameDecoder
            int r1 = r2.maxFramePayloadLength()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    public io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00 setForceCloseTimeoutMillis(long r1) {
            r0 = this;
            super.setForceCloseTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker setForceCloseTimeoutMillis(long r1) {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00 r1 = r0.setForceCloseTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker
    protected void verify(io.netty.handler.codec.http.FullHttpResponse r5) {
            r4 = this;
            io.netty.handler.codec.http.HttpResponseStatus r0 = r5.status()
            io.netty.handler.codec.http.HttpResponseStatus r1 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            io.netty.handler.codec.http.HttpHeaders r0 = r5.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r1 = r0.get(r1)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker00.WEBSOCKET
            boolean r2 = r2.contentEqualsIgnoreCase(r1)
            if (r2 == 0) goto L59
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r3 = 1
            boolean r2 = r0.containsValue(r1, r2, r3)
            if (r2 == 0) goto L3e
            io.netty.buffer.ByteBuf r5 = r5.content()
            io.netty.buffer.ByteBuf r0 = r4.expectedChallengeResponseBytes
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L36
            return
        L36:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r5 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.String r0 = "Invalid challenge"
            r5.<init>(r0)
            throw r5
        L3e:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r5 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid handshake response connection: "
            r2.append(r3)
            java.lang.String r0 = r0.get(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
        L59:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r5 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Invalid handshake response upgrade: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L70:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r0 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid handshake response getStatus: "
            r1.append(r2)
            io.netty.handler.codec.http.HttpResponseStatus r5 = r5.status()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
