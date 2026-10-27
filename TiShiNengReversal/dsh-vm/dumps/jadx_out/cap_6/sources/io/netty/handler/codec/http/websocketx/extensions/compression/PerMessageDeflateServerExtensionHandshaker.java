package io.netty.handler.codec.http.websocketx.extensions.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PerMessageDeflateServerExtensionHandshaker implements io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker {
    static final java.lang.String CLIENT_MAX_WINDOW = "client_max_window_bits";
    static final java.lang.String CLIENT_NO_CONTEXT = "client_no_context_takeover";
    public static final int MAX_WINDOW_SIZE = 15;
    public static final int MIN_WINDOW_SIZE = 8;
    static final java.lang.String PERMESSAGE_DEFLATE_EXTENSION = "permessage-deflate";
    static final java.lang.String SERVER_MAX_WINDOW = "server_max_window_bits";
    static final java.lang.String SERVER_NO_CONTEXT = "server_no_context_takeover";
    private final boolean allowServerNoContext;
    private final boolean allowServerWindowSize;
    private final int compressionLevel;
    private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
    private final boolean preferredClientNoContext;
    private final int preferredClientWindowSize;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PermessageDeflateExtension implements io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension {
        private final boolean clientNoContext;
        private final int clientWindowSize;
        private final int compressionLevel;
        private final io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider extensionFilterProvider;
        private final boolean serverNoContext;
        private final int serverWindowSize;

        PermessageDeflateExtension(int r1, boolean r2, int r3, boolean r4, int r5, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r6) {
                r0 = this;
                r0.<init>()
                r0.compressionLevel = r1
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
                boolean r1 = r3.clientNoContext
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r2 = r3.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r2 = r2.decoderFilter()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionEncoder newExtensionEncoder() {
                r5 = this;
                io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateEncoder r0 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateEncoder
                int r1 = r5.compressionLevel
                int r2 = r5.serverWindowSize
                boolean r3 = r5.serverNoContext
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r4 = r5.extensionFilterProvider
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter r4 = r4.encoderFilter()
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension
        public io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData newReponseData() {
                r4 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r1 = 4
                r0.<init>(r1)
                boolean r1 = r4.serverNoContext
                r2 = 0
                if (r1 == 0) goto L10
                java.lang.String r1 = "server_no_context_takeover"
                r0.put(r1, r2)
            L10:
                boolean r1 = r4.clientNoContext
                if (r1 == 0) goto L19
                java.lang.String r1 = "client_no_context_takeover"
                r0.put(r1, r2)
            L19:
                int r1 = r4.serverWindowSize
                r2 = 15
                if (r1 == r2) goto L28
                java.lang.String r3 = "server_max_window_bits"
                java.lang.String r1 = java.lang.Integer.toString(r1)
                r0.put(r3, r1)
            L28:
                int r1 = r4.clientWindowSize
                if (r1 == r2) goto L35
                java.lang.String r2 = "client_max_window_bits"
                java.lang.String r1 = java.lang.Integer.toString(r1)
                r0.put(r2, r1)
            L35:
                io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r1 = new io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData
                java.lang.String r2 = "permessage-deflate"
                r1.<init>(r2, r0)
                return r1
        }

        @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketExtension
        public int rsv() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    public PerMessageDeflateServerExtensionHandshaker() {
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

    public PerMessageDeflateServerExtensionHandshaker(int r8, boolean r9, int r10, boolean r11, boolean r12) {
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

    public PerMessageDeflateServerExtensionHandshaker(int r2, boolean r3, int r4, boolean r5, boolean r6, io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r7) {
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
            r1.allowServerWindowSize = r3
            r1.preferredClientWindowSize = r4
            r1.allowServerNoContext = r5
            r1.preferredClientNoContext = r6
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
            java.lang.String r5 = "preferredServerWindowSize: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " (expected: 8-15)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandshaker
    public io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtension handshakeExtension(io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionData r13) {
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
            r0 = 1
            r2 = 15
            r3 = 0
            r4 = 1
            r7 = 0
            r8 = 15
            r9 = 0
            r10 = 15
        L25:
            if (r4 == 0) goto L8d
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "client_max_window_bits"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L44
            int r10 = r12.preferredClientWindowSize
            goto L25
        L44:
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "server_max_window_bits"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L68
            boolean r6 = r12.allowServerWindowSize
            if (r6 == 0) goto L66
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            int r8 = java.lang.Integer.parseInt(r5)
            if (r8 > r2) goto L66
            r5 = 8
            if (r8 >= r5) goto L25
        L66:
            r4 = 0
            goto L25
        L68:
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = "client_no_context_takeover"
            boolean r6 = r11.equalsIgnoreCase(r6)
            if (r6 == 0) goto L79
            boolean r9 = r12.preferredClientNoContext
            goto L25
        L79:
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "server_no_context_takeover"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L66
            boolean r5 = r12.allowServerNoContext
            if (r5 == 0) goto L66
            r7 = 1
            goto L25
        L8d:
            if (r4 == 0) goto L99
            io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateServerExtensionHandshaker$PermessageDeflateExtension r5 = new io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateServerExtensionHandshaker$PermessageDeflateExtension
            int r6 = r12.compressionLevel
            io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider r11 = r12.extensionFilterProvider
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L99:
            return r1
    }
}
