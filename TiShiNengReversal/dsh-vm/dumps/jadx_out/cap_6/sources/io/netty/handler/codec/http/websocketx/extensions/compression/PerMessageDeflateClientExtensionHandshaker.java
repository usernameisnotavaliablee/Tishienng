package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PerMessageDeflateClientExtensionHandshaker implements io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker {
    private final boolean allowClientNoContext;
    private final boolean allowClientWindowSize;
    private final int compressionLevel;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
    private final boolean requestedServerNoContext;
    private final int requestedServerWindowSize;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PermessageDeflateExtension implements io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension {
        private final boolean clientNoContext;
        private final int clientWindowSize;
        private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
        private final boolean serverNoContext;
        private final int serverWindowSize;
        final /* synthetic */ io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker this$0;

        PermessageDeflateExtension(io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker r1, boolean r2, int r3, boolean r4, int r5, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.serverNoContext = r2
                r0.serverWindowSize = r3
                r0.clientNoContext = r4
                r0.clientWindowSize = r5
                r0.extensionFilterProvider = r6
                return
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionDecoder newExtensionDecoder() {
                r3 = this;
                io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateDecoder r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateDecoder
                boolean r1 = r3.serverNoContext
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = r3.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2 = r2.decoderFilter()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder newExtensionEncoder() {
                r5 = this;
                io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateEncoder r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateEncoder
                io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker r1 = r5.this$0
                int r1 = io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker.access$000(r1)
                int r2 = r5.clientWindowSize
                boolean r3 = r5.clientNoContext
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r4 = r5.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r4 = r4.encoderFilter()
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public int rsv() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    public PerMessageDeflateClientExtensionHandshaker() {
            r6 = this;
            boolean r2 = io.netty.handler.codec.compression.ZlibCodecFactory.isSupportingWindowSizeAndMemLevel()
            r4 = 0
            r5 = 0
            r1 = 6
            r3 = 15
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PerMessageDeflateClientExtensionHandshaker(int r8, boolean r9, int r10, boolean r11, boolean r12) {
            r7 = this;
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r6 = io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider.DEFAULT
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public PerMessageDeflateClientExtensionHandshaker(int r2, boolean r3, int r4, boolean r5, boolean r6, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r7) {
            r1 = this;
            r1.<init>()
            r0 = 15
            if (r4 > r0) goto L42
            r0 = 8
            if (r4 < r0) goto L42
            if (r2 < 0) goto L26
            r0 = 9
            if (r2 > r0) goto L26
            r1.compressionLevel = r2
            r1.allowClientWindowSize = r3
            r1.requestedServerWindowSize = r4
            r1.allowClientNoContext = r5
            r1.requestedServerNoContext = r6
            java.lang.String r2 = "extensionFilterProvider"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r7, r2)
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = (io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider) r2
            r1.extensionFilterProvider = r2
            return
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "compressionLevel: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " (expected: 0-9)"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "requestedServerWindowSize: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " (expected: 8-15)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ int access$000(io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker r0) {
            int r0 = r0.compressionLevel
            return r0
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtension handshakeExtension(io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r13) {
            r12 = this;
            java.lang.String r0 = "permessage-deflate"
            java.lang.String r1 = r13.name()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.util.Map r13 = r13.parameters()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
            r0 = 15
            r2 = 1
            r3 = 0
            r4 = 1
            r7 = 0
            r8 = 15
            r9 = 0
            r10 = 15
        L25:
            if (r4 == 0) goto L99
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "client_max_window_bits"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L52
            boolean r6 = r12.allowClientWindowSize
            if (r6 == 0) goto L50
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r10 = java.lang.Integer.parseInt(r5)
            goto L25
        L50:
            r4 = 0
            goto L25
        L52:
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "server_max_window_bits"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L71
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r8 = java.lang.Integer.parseInt(r5)
            if (r10 > r0) goto L50
            r5 = 8
            if (r10 >= r5) goto L25
            goto L50
        L71:
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "client_no_context_takeover"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L85
            boolean r5 = r12.allowClientNoContext
            if (r5 == 0) goto L50
            r9 = 1
            goto L25
        L85:
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "server_no_context_takeover"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L50
            boolean r5 = r12.requestedServerNoContext
            if (r5 == 0) goto L50
            r7 = 1
            goto L25
        L99:
            boolean r13 = r12.requestedServerNoContext
            if (r13 == 0) goto L9f
            if (r7 == 0) goto La5
        L9f:
            int r13 = r12.requestedServerWindowSize
            if (r13 == r8) goto La4
            goto La5
        La4:
            r3 = r4
        La5:
            if (r3 == 0) goto Lb0
            io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker$PermessageDeflateExtension r5 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker$PermessageDeflateExtension
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r11 = r12.extensionFilterProvider
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        Lb0:
            return r1
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketClientExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData newRequestData() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 4
            r0.<init>(r1)
            int r1 = r4.requestedServerWindowSize
            r2 = 0
            r3 = 15
            if (r1 == r3) goto L12
            java.lang.String r1 = "server_no_context_takeover"
            r0.put(r1, r2)
        L12:
            boolean r1 = r4.allowClientNoContext
            if (r1 == 0) goto L1b
            java.lang.String r1 = "client_no_context_takeover"
            r0.put(r1, r2)
        L1b:
            int r1 = r4.requestedServerWindowSize
            if (r1 == r3) goto L28
            java.lang.String r3 = "server_max_window_bits"
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.put(r3, r1)
        L28:
            boolean r1 = r4.allowClientWindowSize
            if (r1 == 0) goto L31
            java.lang.String r1 = "client_max_window_bits"
            r0.put(r1, r2)
        L31:
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r1 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData
            java.lang.String r2 = "permessage-deflate"
            r1.<init>(r2, r0)
            return r1
    }
}
