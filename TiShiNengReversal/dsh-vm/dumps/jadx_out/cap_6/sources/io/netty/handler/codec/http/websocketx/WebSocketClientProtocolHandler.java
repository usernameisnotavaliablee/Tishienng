package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WebSocketClientProtocolHandler extends io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler {
    private static final long DEFAULT_HANDSHAKE_TIMEOUT_MS = 10000;
    private final boolean handleCloseFrames;
    private final long handshakeTimeoutMillis;
    private final io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker handshaker;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ClientHandshakeStateEvent extends java.lang.Enum<io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent> {
        private static final /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent[] $VALUES = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent HANDSHAKE_COMPLETE = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent HANDSHAKE_ISSUED = null;
        public static final io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent HANDSHAKE_TIMEOUT = null;

        static {
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent
                java.lang.String r1 = "HANDSHAKE_TIMEOUT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_TIMEOUT = r0
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent
                java.lang.String r3 = "HANDSHAKE_ISSUED"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_ISSUED = r1
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent r3 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent
                java.lang.String r5 = "HANDSHAKE_COMPLETE"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_COMPLETE = r3
                r5 = 3
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent[] r5 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.$VALUES = r5
                return
        }

        ClientHandshakeStateEvent(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent> r0 = io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent r1 = (io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent) r1
                return r1
        }

        public static io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent[] values() {
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent[] r0 = io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent[] r0 = (io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent[]) r0
                return r0
        }
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r3) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r0)
            return
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r2, long r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r3, boolean r4) {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r3, r4, r0)
            return
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r7, boolean r8, long r9) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r7, boolean r8, boolean r9) {
            r6 = this;
            r4 = 10000(0x2710, double:4.9407E-320)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public WebSocketClientProtocolHandler(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r1, boolean r2, boolean r3, long r4) {
            r0 = this;
            r0.<init>(r3)
            r0.handshaker = r1
            r0.handleCloseFrames = r2
            java.lang.String r1 = "handshakeTimeoutMillis"
            long r1 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r1)
            r0.handshakeTimeoutMillis = r1
            return
    }

    public WebSocketClientProtocolHandler(java.net.URI r10, io.netty.handler.codec.http.websocketx.WebSocketVersion r11, java.lang.String r12, boolean r13, io.netty.handler.codec.http.HttpHeaders r14, int r15) {
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

    public WebSocketClientProtocolHandler(java.net.URI r11, io.netty.handler.codec.http.websocketx.WebSocketVersion r12, java.lang.String r13, boolean r14, io.netty.handler.codec.http.HttpHeaders r15, int r16, long r17) {
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

    public WebSocketClientProtocolHandler(java.net.URI r11, io.netty.handler.codec.http.websocketx.WebSocketVersion r12, java.lang.String r13, boolean r14, io.netty.handler.codec.http.HttpHeaders r15, int r16, boolean r17) {
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

    public WebSocketClientProtocolHandler(java.net.URI r13, io.netty.handler.codec.http.websocketx.WebSocketVersion r14, java.lang.String r15, boolean r16, io.netty.handler.codec.http.HttpHeaders r17, int r18, boolean r19, long r20) {
            r12 = this;
            r8 = 1
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public WebSocketClientProtocolHandler(java.net.URI r13, io.netty.handler.codec.http.websocketx.WebSocketVersion r14, java.lang.String r15, boolean r16, io.netty.handler.codec.http.HttpHeaders r17, int r18, boolean r19, boolean r20, boolean r21) {
            r12 = this;
            r10 = 10000(0x2710, double:4.9407E-320)
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
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public WebSocketClientProtocolHandler(java.net.URI r9, io.netty.handler.codec.http.websocketx.WebSocketVersion r10, java.lang.String r11, boolean r12, io.netty.handler.codec.http.HttpHeaders r13, int r14, boolean r15, boolean r16, boolean r17, long r18) {
            r8 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            r7 = r17
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r9 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory.newHandshaker(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = r18
            r8.<init>(r9, r15, r10)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.codec.http.websocketx.WebSocketProtocolHandler
    protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http.websocketx.WebSocketFrame r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.handleCloseFrames
            if (r0 == 0) goto Lc
            boolean r0 = r3 instanceof io.netty.handler.codec.http.websocketx.CloseWebSocketFrame
            if (r0 == 0) goto Lc
            r2.close()
            return
        Lc:
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
    public /* bridge */ /* synthetic */ void exceptionCaught(io.netty.channel.ChannelHandlerContext r1, java.lang.Throwable r2) throws java.lang.Exception {
            r0 = this;
            super.exceptionCaught(r1, r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r9) {
            r8 = this;
            io.netty.channel.ChannelPipeline r0 = r9.pipeline()
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler> r1 = io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler.class
            io.netty.channel.ChannelHandler r2 = r0.get(r1)
            if (r2 != 0) goto L24
            io.netty.channel.ChannelPipeline r2 = r9.pipeline()
            java.lang.String r3 = r9.name()
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler r4 = new io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandshakeHandler
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r5 = r8.handshaker
            long r6 = r8.handshakeTimeoutMillis
            r4.<init>(r5, r6)
            r2.addBefore(r3, r1, r4)
        L24:
            java.lang.Class<io.netty.handler.codec.http.websocketx.Utf8FrameValidator> r1 = io.netty.handler.codec.http.websocketx.Utf8FrameValidator.class
            io.netty.channel.ChannelHandler r0 = r0.get(r1)
            if (r0 != 0) goto L40
            io.netty.channel.ChannelPipeline r0 = r9.pipeline()
            java.lang.String r9 = r9.name()
            java.lang.String r1 = r1.getName()
            io.netty.handler.codec.http.websocketx.Utf8FrameValidator r2 = new io.netty.handler.codec.http.websocketx.Utf8FrameValidator
            r2.<init>()
            r0.addBefore(r9, r1, r2)
        L40:
            return
    }

    public io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker handshaker() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r0 = r1.handshaker
            return r0
    }
}
