package io.netty.handler.codec.http.websocketx.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketClientExtensionHandler extends io.netty.channel.ChannelDuplexHandler {
    private final java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker> extensionHandshakers;

    public WebSocketClientExtensionHandler(io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker... r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L17
            int r0 = r2.length
            if (r0 == 0) goto Lf
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.extensionHandshakers = r2
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "extensionHandshakers must contains at least one handshaker"
            r2.<init>(r0)
            throw r2
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "extensionHandshakers"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r9, java.lang.Object r10) throws java.lang.Exception {
            r8 = this;
            boolean r0 = r10 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto Lcd
            r0 = r10
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            boolean r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.isWebsocketUpgrade(r1)
            if (r1 == 0) goto Lcd
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            java.lang.String r0 = r0.getAsString(r1)
            if (r0 == 0) goto Lc2
            java.util.List r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.extractExtensions(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L2f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r1.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r4 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData) r4
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker> r5 = r8.extensionHandshakers
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L42:
            if (r6 != 0) goto L55
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L55
            java.lang.Object r6 = r5.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker r6 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker) r6
            io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension r6 = r6.handshakeExtension(r4)
            goto L42
        L55:
            if (r6 == 0) goto L67
            int r4 = r6.rsv()
            r4 = r4 & r3
            if (r4 != 0) goto L67
            int r4 = r6.rsv()
            r3 = r3 | r4
            r2.add(r6)
            goto L2f
        L67:
            io.netty.handler.codec.CodecException r9 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "invalid WebSocket Extension handshake for \""
            r10.append(r1)
            r10.append(r0)
            r0 = 34
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L83:
            java.util.Iterator r0 = r2.iterator()
        L87:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension r1 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension) r1
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionDecoder r2 = r1.newExtensionDecoder()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder r1 = r1.newExtensionEncoder()
            io.netty.channel.ChannelPipeline r3 = r9.pipeline()
            java.lang.String r4 = r9.name()
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            r3.addAfter(r4, r5, r2)
            io.netty.channel.ChannelPipeline r2 = r9.pipeline()
            java.lang.String r3 = r9.name()
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            r2.addAfter(r3, r4, r1)
            goto L87
        Lc2:
            io.netty.channel.ChannelPipeline r0 = r9.pipeline()
            java.lang.String r1 = r9.name()
            r0.remove(r1)
        Lcd:
            super.channelRead(r9, r10)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7, io.netty.channel.ChannelPromise r8) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L47
            r0 = r7
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            boolean r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.isWebsocketUpgrade(r1)
            if (r1 == 0) goto L47
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            java.lang.String r1 = r1.getAsString(r2)
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker> r2 = r5.extensionHandshakers
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker r3 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker) r3
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r3 = r3.newRequestData()
            java.lang.String r4 = r3.name()
            java.util.Map r3 = r3.parameters()
            java.lang.String r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.appendExtension(r1, r4, r3)
            goto L21
        L3e:
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            r0.set(r2, r1)
        L47:
            super.write(r6, r7, r8)
            return
    }
}
