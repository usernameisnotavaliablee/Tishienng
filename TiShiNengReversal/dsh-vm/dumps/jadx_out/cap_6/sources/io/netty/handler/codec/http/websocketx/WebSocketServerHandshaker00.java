package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerHandshaker00 extends io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker {
    private static final java.util.regex.Pattern BEGINNING_DIGIT = null;
    private static final java.util.regex.Pattern BEGINNING_SPACE = null;

    static {
            java.lang.String r0 = "[^0-9]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00.BEGINNING_DIGIT = r0
            java.lang.String r0 = "[^ ]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00.BEGINNING_SPACE = r0
            return
    }

    public WebSocketServerHandshaker00(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r0.maxFramePayloadLength(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r4.build()
            r1.<init>(r2, r3, r4)
            return
    }

    public WebSocketServerHandshaker00(java.lang.String r2, java.lang.String r3, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V00
            r1.<init>(r0, r2, r3, r4)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    public io.netty.channel.ChannelFuture close(io.netty.channel.Channel r1, io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r2, io.netty.channel.ChannelPromise r3) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r1.writeAndFlush(r2, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.FullHttpResponse newHandshakeResponse(io.netty.handler.codec.http.FullHttpRequest r14, io.netty.handler.codec.http.HttpHeaders r15) {
            r13 = this;
            io.netty.handler.codec.http.HttpHeaders r0 = r14.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.UPGRADE
            r3 = 1
            boolean r0 = r0.containsValue(r1, r2, r3)
            if (r0 == 0) goto L18a
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.WEBSOCKET
            io.netty.handler.codec.http.HttpHeaders r4 = r14.headers()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            java.lang.String r4 = r4.get(r5)
            boolean r4 = r0.contentEqualsIgnoreCase(r4)
            if (r4 == 0) goto L18a
            io.netty.handler.codec.http.HttpHeaders r4 = r14.headers()
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY1
            boolean r4 = r4.contains(r6)
            r7 = 0
            if (r4 == 0) goto L3b
            io.netty.handler.codec.http.HttpHeaders r4 = r14.headers()
            io.netty.util.AsciiString r8 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY2
            boolean r4 = r4.contains(r8)
            if (r4 == 0) goto L3b
            goto L3c
        L3b:
            r3 = 0
        L3c:
            io.netty.handler.codec.http.HttpHeaders r4 = r14.headers()
            io.netty.util.AsciiString r8 = io.netty.handler.codec.http.HttpHeaderNames.ORIGIN
            java.lang.String r4 = r4.get(r8)
            if (r4 != 0) goto L6a
            if (r3 == 0) goto L4b
            goto L6a
        L4b:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r15 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Missing origin header, got only "
            r0.append(r1)
            io.netty.handler.codec.http.HttpHeaders r14 = r14.headers()
            java.util.Set r14 = r14.names()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        L6a:
            io.netty.handler.codec.http.DefaultFullHttpResponse r8 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r9 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r10 = new io.netty.handler.codec.http.HttpResponseStatus
            if (r3 == 0) goto L75
            java.lang.String r11 = "WebSocket Protocol Handshake"
            goto L77
        L75:
            java.lang.String r11 = "Web Socket Protocol Handshake"
        L77:
            r12 = 101(0x65, float:1.42E-43)
            r10.<init>(r12, r11)
            io.netty.buffer.ByteBuf r11 = r14.content()
            io.netty.buffer.ByteBufAllocator r11 = r11.alloc()
            io.netty.buffer.ByteBuf r11 = r11.buffer(r7)
            r8.<init>(r9, r10, r11)
            if (r15 == 0) goto L94
            io.netty.handler.codec.http.HttpHeaders r9 = r8.headers()
            r9.add(r15)
        L94:
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            r15.add(r5, r0)
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            r15.add(r1, r2)
            if (r3 == 0) goto L15c
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ORIGIN
            r15.add(r0, r4)
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_LOCATION
            java.lang.String r1 = r13.uri()
            r15.add(r0, r1)
            io.netty.handler.codec.http.HttpHeaders r15 = r14.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL
            java.lang.String r15 = r15.get(r0)
            if (r15 == 0) goto Le1
            java.lang.String r1 = r13.selectSubprotocol(r15)
            if (r1 != 0) goto Lda
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto Le1
            java.lang.String r1 = "Requested subprotocol(s) not supported: {}"
            r0.debug(r1, r15)
            goto Le1
        Lda:
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            r15.add(r0, r1)
        Le1:
            io.netty.handler.codec.http.HttpHeaders r15 = r14.headers()
            java.lang.String r15 = r15.get(r6)
            io.netty.handler.codec.http.HttpHeaders r0 = r14.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY2
            java.lang.String r0 = r0.get(r1)
            java.util.regex.Pattern r1 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00.BEGINNING_DIGIT
            java.util.regex.Matcher r2 = r1.matcher(r15)
            java.lang.String r3 = ""
            java.lang.String r2 = r2.replaceAll(r3)
            long r4 = java.lang.Long.parseLong(r2)
            java.util.regex.Pattern r2 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00.BEGINNING_SPACE
            java.util.regex.Matcher r15 = r2.matcher(r15)
            java.lang.String r15 = r15.replaceAll(r3)
            int r15 = r15.length()
            long r9 = (long) r15
            long r4 = r4 / r9
            int r15 = (int) r4
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r1 = r1.replaceAll(r3)
            long r4 = java.lang.Long.parseLong(r1)
            java.util.regex.Matcher r0 = r2.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r3)
            int r0 = r0.length()
            long r0 = (long) r0
            long r4 = r4 / r0
            int r0 = (int) r4
            io.netty.buffer.ByteBuf r14 = r14.content()
            long r1 = r14.readLong()
            r14 = 16
            byte[] r14 = new byte[r14]
            io.netty.buffer.ByteBuf r14 = io.netty.buffer.Unpooled.wrappedBuffer(r14)
            io.netty.buffer.ByteBuf r14 = r14.setIndex(r7, r7)
            r14.writeInt(r15)
            r14.writeInt(r0)
            r14.writeLong(r1)
            io.netty.buffer.ByteBuf r15 = r8.content()
            byte[] r14 = r14.array()
            byte[] r14 = io.netty.handler.codec.http.websocketx.WebSocketUtil.md5(r14)
            r15.writeBytes(r14)
            return r8
        L15c:
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.WEBSOCKET_ORIGIN
            r15.add(r0, r4)
            io.netty.handler.codec.http.HttpHeaders r15 = r8.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.WEBSOCKET_LOCATION
            java.lang.String r1 = r13.uri()
            r15.add(r0, r1)
            io.netty.handler.codec.http.HttpHeaders r14 = r14.headers()
            io.netty.util.AsciiString r15 = io.netty.handler.codec.http.HttpHeaderNames.WEBSOCKET_PROTOCOL
            java.lang.String r14 = r14.get(r15)
            if (r14 == 0) goto L189
            io.netty.handler.codec.http.HttpHeaders r0 = r8.headers()
            java.lang.String r14 = r13.selectSubprotocol(r14)
            r0.add(r15, r14)
        L189:
            return r8
        L18a:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r14 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.String r15 = "not a WebSocket handshake request: missing upgrade"
            r14.<init>(r15)
            throw r14
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket00FrameEncoder
            r0.<init>()
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder() {
            r2 = this;
            io.netty.handler.codec.http.websocketx.WebSocket00FrameDecoder r0 = new io.netty.handler.codec.http.websocketx.WebSocket00FrameDecoder
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = r2.decoderConfig()
            r0.<init>(r1)
            return r0
    }
}
