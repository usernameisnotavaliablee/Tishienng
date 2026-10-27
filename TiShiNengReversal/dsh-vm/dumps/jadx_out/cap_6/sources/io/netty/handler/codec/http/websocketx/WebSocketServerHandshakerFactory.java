package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerHandshakerFactory {
    private final io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig decoderConfig;
    private final java.lang.String subprotocols;
    private final java.lang.String webSocketURL;

    public WebSocketServerHandshakerFactory(java.lang.String r1, java.lang.String r2, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r3) {
            r0 = this;
            r0.<init>()
            r0.webSocketURL = r1
            r0.subprotocols = r2
            java.lang.String r1 = "decoderConfig"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r1
            r0.decoderConfig = r1
            return
    }

    public WebSocketServerHandshakerFactory(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public WebSocketServerHandshakerFactory(java.lang.String r7, java.lang.String r8, boolean r9, int r10) {
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

    public WebSocketServerHandshakerFactory(java.lang.String r2, java.lang.String r3, boolean r4, int r5, boolean r6) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r0.allowExtensions(r4)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r4.maxFramePayloadLength(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r4 = r4.allowMaskMismatch(r6)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4 = r4.build()
            r1.<init>(r2, r3, r4)
            return
    }

    public static io.netty.channel.ChannelFuture sendUnsupportedVersionResponse(io.netty.channel.Channel r1) {
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r1 = sendUnsupportedVersionResponse(r1, r0)
            return r1
    }

    public static io.netty.channel.ChannelFuture sendUnsupportedVersionResponse(io.netty.channel.Channel r5, io.netty.channel.ChannelPromise r6) {
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.UPGRADE_REQUIRED
            io.netty.buffer.ByteBufAllocator r3 = r5.alloc()
            r4 = 0
            io.netty.buffer.ByteBuf r3 = r3.buffer(r4)
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_VERSION
            io.netty.handler.codec.http.websocketx.WebSocketVersion r3 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V13
            java.lang.String r3 = r3.toHttpHeaderValue()
            r1.set(r2, r3)
            r1 = 0
            io.netty.handler.codec.http.HttpUtil.setContentLength(r0, r1)
            io.netty.channel.ChannelFuture r5 = r5.writeAndFlush(r0, r6)
            return r5
    }

    @java.lang.Deprecated
    public static void sendUnsupportedWebSocketVersionResponse(io.netty.channel.Channel r0) {
            sendUnsupportedVersionResponse(r0)
            return
    }

    public io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker newHandshaker(io.netty.handler.codec.http.HttpRequest r4) {
            r3 = this;
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_VERSION
            java.lang.String r4 = r4.get(r0)
            if (r4 == 0) goto L56
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V13
            java.lang.String r0 = r0.toHttpHeaderValue()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker13 r4 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker13
            java.lang.String r0 = r3.webSocketURL
            java.lang.String r1 = r3.subprotocols
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r3.decoderConfig
            r4.<init>(r0, r1, r2)
            return r4
        L24:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V08
            java.lang.String r0 = r0.toHttpHeaderValue()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3c
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker08 r4 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker08
            java.lang.String r0 = r3.webSocketURL
            java.lang.String r1 = r3.subprotocols
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r3.decoderConfig
            r4.<init>(r0, r1, r2)
            return r4
        L3c:
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = io.netty.handler.codec.http.websocketx.WebSocketVersion.V07
            java.lang.String r0 = r0.toHttpHeaderValue()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L54
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker07 r4 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker07
            java.lang.String r0 = r3.webSocketURL
            java.lang.String r1 = r3.subprotocols
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r3.decoderConfig
            r4.<init>(r0, r1, r2)
            return r4
        L54:
            r4 = 0
            return r4
        L56:
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00 r4 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker00
            java.lang.String r0 = r3.webSocketURL
            java.lang.String r1 = r3.subprotocols
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r2 = r3.decoderConfig
            r4.<init>(r0, r1, r2)
            return r4
    }
}
