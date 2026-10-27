package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DeflateFrameClientExtensionHandshaker implements io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker {
    private final int compressionLevel;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
    private final boolean useWebkitExtensionName;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DeflateFrameClientExtension implements io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension {
        private final int compressionLevel;
        private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;

        DeflateFrameClientExtension(int r1, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2) {
                r0 = this;
                r0.<init>()
                r0.compressionLevel = r1
                r0.extensionFilterProvider = r2
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

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public int rsv() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    public DeflateFrameClientExtensionHandshaker(int r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r0 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    public DeflateFrameClientExtensionHandshaker(int r2, boolean r3, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r4) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L18
            r0 = 9
            if (r2 > r0) goto L18
            r1.compressionLevel = r2
            r1.useWebkitExtensionName = r3
            java.lang.String r2 = "extensionFilterProvider"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider) r2
            r1.extensionFilterProvider = r2
            return
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "compressionLevel: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " (expected: 0-9)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public DeflateFrameClientExtensionHandshaker(boolean r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension handshakeExtension(io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r4) {
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
            java.util.Map r4 = r4.parameters()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2e
            io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker$DeflateFrameClientExtension r4 = new io.netty.handler.codec.http.websocketx.extensions.compression.DeflateFrameClientExtensionHandshaker$DeflateFrameClientExtension
            int r0 = r3.compressionLevel
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r1 = r3.extensionFilterProvider
            r4.<init>(r0, r1)
            return r4
        L2e:
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData newRequestData() {
            r3 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r0 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData
            boolean r1 = r3.useWebkitExtensionName
            if (r1 == 0) goto L9
            java.lang.String r1 = "x-webkit-deflate-frame"
            goto Lb
        L9:
            java.lang.String r1 = "deflate-frame"
        Lb:
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            r0.<init>(r1, r2)
            return r0
    }
}
