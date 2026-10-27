package io.netty.handler.codec.http.websocketx.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketServerExtensionHandler extends io.netty.channel.ChannelDuplexHandler {
    private final java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker> extensionHandshakers;
    private java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> validExtensions;


    public WebSocketServerExtensionHandler(io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker... r2) {
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

    static /* synthetic */ java.util.List access$000(io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler r0) {
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> r0 = r0.validExtensions
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r7, java.lang.Object r8) throws java.lang.Exception {
            r6 = this;
            boolean r0 = r8 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L6c
            r0 = r8
            io.netty.handler.codec.http.HttpRequest r0 = (io.netty.handler.codec.http.HttpRequest) r0
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            boolean r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.isWebsocketUpgrade(r1)
            if (r1 == 0) goto L6c
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            java.lang.String r0 = r0.getAsString(r1)
            if (r0 == 0) goto L6c
            java.util.List r0 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.extractExtensions(r0)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r2 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData) r2
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker> r3 = r6.extensionHandshakers
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L39:
            if (r4 != 0) goto L4c
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker r4 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker) r4
            io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension r4 = r4.handshakeExtension(r2)
            goto L39
        L4c:
            if (r4 == 0) goto L26
            int r2 = r4.rsv()
            r2 = r2 & r1
            if (r2 != 0) goto L26
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> r2 = r6.validExtensions
            if (r2 != 0) goto L61
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 1
            r2.<init>(r3)
            r6.validExtensions = r2
        L61:
            int r2 = r4.rsv()
            r1 = r1 | r2
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> r2 = r6.validExtensions
            r2.add(r4)
            goto L26
        L6c:
            super.channelRead(r7, r8)
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r6, java.lang.Object r7, io.netty.channel.ChannelPromise r8) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L55
            r0 = r7
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            boolean r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.isWebsocketUpgrade(r1)
            if (r1 == 0) goto L55
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> r1 = r5.validExtensions
            if (r1 == 0) goto L55
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            java.lang.String r1 = r1.getAsString(r2)
            java.util.List<io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension> r2 = r5.validExtensions
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension r3 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension) r3
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r3 = r3.newReponseData()
            java.lang.String r4 = r3.name()
            java.util.Map r3 = r3.parameters()
            java.lang.String r1 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionUtil.appendExtension(r1, r4, r3)
            goto L25
        L42:
            io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler$1 r2 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler$1
            r2.<init>(r5, r6)
            r8.addListener(r2)
            if (r1 == 0) goto L55
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_EXTENSIONS
            r0.set(r2, r1)
        L55:
            super.write(r6, r7, r8)
            return
    }
}
