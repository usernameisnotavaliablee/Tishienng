package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum Protocol extends java.lang.Enum<okhttp3.Protocol> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ okhttp3.Protocol[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Protocol.Companion Companion = null;
    public static final okhttp3.Protocol H2_PRIOR_KNOWLEDGE = null;
    public static final okhttp3.Protocol HTTP_1_0 = null;
    public static final okhttp3.Protocol HTTP_1_1 = null;
    public static final okhttp3.Protocol HTTP_2 = null;
    public static final okhttp3.Protocol HTTP_3 = null;
    public static final okhttp3.Protocol QUIC = null;

    @kotlin.Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final okhttp3.Protocol SPDY_3 = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String protocol;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Protocol get(@org.jetbrains.annotations.NotNull java.lang.String r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.g0.p(r6, r0)
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L12
                return r0
            L12:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L1f
                return r0
            L1f:
                okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L2c
                return r0
            L2c:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L39
                return r0
            L39:
                okhttp3.Protocol r0 = okhttp3.Protocol.SPDY_3
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L46
                return r0
            L46:
                okhttp3.Protocol r0 = okhttp3.Protocol.QUIC
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                boolean r1 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r1 == 0) goto L53
                return r0
            L53:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_3
                java.lang.String r1 = okhttp3.Protocol.access$getProtocol$p(r0)
                r2 = 2
                r3 = 0
                r4 = 0
                boolean r1 = kotlin.text.u.H2(r6, r1, r4, r2, r3)
                if (r1 == 0) goto L63
                return r0
            L63:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected protocol: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    private static final /* synthetic */ okhttp3.Protocol[] $values() {
            r0 = 7
            okhttp3.Protocol[] r0 = new okhttp3.Protocol[r0]
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_0
            r2 = 0
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            r2 = 1
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.SPDY_3
            r2 = 2
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_2
            r2 = 3
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            r2 = 4
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.QUIC
            r2 = 5
            r0[r2] = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_3
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 0
            java.lang.String r2 = "http/1.0"
            java.lang.String r3 = "HTTP_1_0"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_1_0 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 1
            java.lang.String r2 = "http/1.1"
            java.lang.String r3 = "HTTP_1_1"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_1_1 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 2
            java.lang.String r2 = "spdy/3.1"
            java.lang.String r3 = "SPDY_3"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.SPDY_3 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 3
            java.lang.String r2 = "h2"
            java.lang.String r3 = "HTTP_2"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_2 = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 4
            java.lang.String r2 = "h2_prior_knowledge"
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.H2_PRIOR_KNOWLEDGE = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 5
            java.lang.String r2 = "quic"
            java.lang.String r3 = "QUIC"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.QUIC = r0
            okhttp3.Protocol r0 = new okhttp3.Protocol
            r1 = 6
            java.lang.String r2 = "h3"
            java.lang.String r3 = "HTTP_3"
            r0.<init>(r3, r1, r2)
            okhttp3.Protocol.HTTP_3 = r0
            okhttp3.Protocol[] r0 = $values()
            okhttp3.Protocol.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            okhttp3.Protocol.$ENTRIES = r0
            okhttp3.Protocol$Companion r0 = new okhttp3.Protocol$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Protocol.Companion = r0
            return
    }

    Protocol(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.protocol = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getProtocol$p(okhttp3.Protocol r0) {
            java.lang.String r0 = r0.protocol
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Protocol get(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.io.IOException {
            okhttp3.Protocol$Companion r0 = okhttp3.Protocol.Companion
            okhttp3.Protocol r1 = r0.get(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<okhttp3.Protocol> getEntries() {
            kotlin.enums.a r0 = okhttp3.Protocol.$ENTRIES
            return r0
    }

    public static okhttp3.Protocol valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.Protocol> r0 = okhttp3.Protocol.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.Protocol r1 = (okhttp3.Protocol) r1
            return r1
    }

    public static okhttp3.Protocol[] values() {
            okhttp3.Protocol[] r0 = okhttp3.Protocol.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.Protocol[] r0 = (okhttp3.Protocol[]) r0
            return r0
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }
}
