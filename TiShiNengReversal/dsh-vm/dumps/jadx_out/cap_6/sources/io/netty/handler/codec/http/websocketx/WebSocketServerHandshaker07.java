package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerHandshaker07 extends io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker {
    public static final java.lang.String WEBSOCKET_07_ACCEPT_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    public WebSocketServerHandshaker07(java.lang.String r2, java.lang.String r3, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V07
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public WebSocketServerHandshaker07(java.lang.String r7, java.lang.String r8, boolean r9, int r10) {
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

    public WebSocketServerHandshaker07(java.lang.String r2, java.lang.String r3, boolean r4, int r5, boolean r6) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r0.allowExtensions(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r4.maxFramePayloadLength(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r4.allowMaskMismatch(r6)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r4.build()
            r1.<init>(r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.FullHttpResponse newHandshakeResponse(io.netty.handler.codec.http.FullHttpRequest r7, io.netty.handler.codec.http.HttpHeaders r8) {
            r6 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r7.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY
            java.lang.String r0 = r0.get(r1)
            if (r0 == 0) goto L9c
            io.netty.handler.codec.http.DefaultFullHttpResponse r1 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r2 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r3 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS
            io.netty.buffer.ByteBuf r4 = r7.content()
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            r5 = 0
            io.netty.buffer.ByteBuf r4 = r4.buffer(r5)
            r1.<init>(r2, r3, r4)
            if (r8 == 0) goto L2b
            io.netty.handler.codec.http.HttpHeaders r2 = r1.headers()
            r2.add(r8)
        L2b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r2 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r8 = r8.getBytes(r2)
            byte[] r8 = io.netty.handler.codec.http.websocketx.WebSocketUtil.sha1(r8)
            java.lang.String r8 = io.netty.handler.codec.http.websocketx.WebSocketUtil.base64(r8)
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.logger
            boolean r3 = r2.isDebugEnabled()
            if (r3 == 0) goto L57
            java.lang.String r3 = "WebSocket version 07 server handshake key: {}, response: {}."
            r2.debug(r3, r0, r8)
        L57:
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            r0.add(r3, r4)
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r0.add(r3, r4)
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ACCEPT
            r0.add(r3, r8)
            io.netty.handler.codec.http.HttpHeaders r7 = r7.headers()
            io.netty.util.AsciiString r8 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL
            java.lang.String r7 = r7.get(r8)
            if (r7 == 0) goto L9b
            java.lang.String r0 = r6.selectSubprotocol(r7)
            if (r0 != 0) goto L94
            boolean r8 = r2.isDebugEnabled()
            if (r8 == 0) goto L9b
            java.lang.String r8 = "Requested subprotocol(s) not supported: {}"
            r2.debug(r8, r7)
            return r1
        L94:
            io.netty.handler.codec.http.HttpHeaders r7 = r1.headers()
            r7.add(r8, r0)
        L9b:
            return r1
        L9c:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r7 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.String r8 = "not a WebSocket request: missing key"
            r7.<init>(r8)
            throw r7
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket07FrameEncoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket07FrameEncoder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket07FrameDecoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket07FrameDecoder
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = r2.decoderConfig()
            r0.<init>(r1)
            return r0
    }
}
