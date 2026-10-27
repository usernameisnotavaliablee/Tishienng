package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DeflateFrameServerExtensionHandshaker implements io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker {
    static final java.lang.String DEFLATE_FRAME_EXTENSION = "deflate-frame";
    static final java.lang.String X_WEBKIT_DEFLATE_FRAME_EXTENSION = "x-webkit-deflate-frame";
    private final int compressionLevel;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DeflateFrameServerExtension implements io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension {
        private final int compressionLevel;
        private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
        private final java.lang.String extensionName;

        DeflateFrameServerExtension(int r1, java.lang.String r2, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r3) {
                r0 = this;
                r0.<init>()
                r0.extensionName = r2
                r0.compressionLevel = r1
                r0.extensionFilterProvider = r3
                return
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionDecoder newExtensionDecoder() {
                r3 = this;
                io.netty.handler.codec.http.websocketx.extensions.compression.PerFrameDeflateDecoder r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerFrameDeflateDecoder
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r1 = r3.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r1 = r1.decoderFilter()
                r2 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder newExtensionEncoder() {
                r5 = this;
                io.netty.handler.codec.http.websocketx.extensions.compression.PerFrameDeflateEncoder r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerFrameDeflateEncoder
                int r1 = r5.compressionLevel
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = r5.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2 = r2.encoderFilter()
                r3 = 15
                r4 = 0
                r0.<init>(r1, r3, r4, r2)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData newReponseData() {
                r3 = this;
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r0 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData
                java.lang.String r1 = r3.extensionName
                java.util.Map r2 = java.util.Collections.EMPTY_MAP
                r0.<init>(r1, r2)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public int rsv() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    public DeflateFrameServerExtensionHandshaker() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public DeflateFrameServerExtensionHandshaker(int r2) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r0 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public DeflateFrameServerExtensionHandshaker(int r3, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r4) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L16
            r0 = 9
            if (r3 > r0) goto L16
            r2.compressionLevel = r3
            java.lang.String r3 = "extensionFilterProvider"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r3 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider) r3
            r2.extensionFilterProvider = r3
            return
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compressionLevel: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " (expected: 0-9)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension handshakeExtension(io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r4) {
            r3 = this;
            java.lang.String r0 = "x-webkit-deflate-frame"
            java.lang.String r1 = r4.name()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.String r0 = "deflate-frame"
            java.lang.String r2 = r4.name()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.util.Map r0 = r4.parameters()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameServerExtensionHandshaker$DeflateFrameServerExtension r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameServerExtensionHandshaker$DeflateFrameServerExtension
            int r1 = r3.compressionLevel
            java.lang.String r4 = r4.name()
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = r3.extensionFilterProvider
            r0.<init>(r1, r4, r2)
            return r0
        L32:
            return r1
    }
}
