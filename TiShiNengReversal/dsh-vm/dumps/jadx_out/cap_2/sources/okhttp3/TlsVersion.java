package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum TlsVersion extends java.lang.Enum<okhttp3.TlsVersion> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ okhttp3.TlsVersion[] $VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TlsVersion.Companion Companion = null;
    public static final okhttp3.TlsVersion SSL_3_0 = null;
    public static final okhttp3.TlsVersion TLS_1_0 = null;
    public static final okhttp3.TlsVersion TLS_1_1 = null;
    public static final okhttp3.TlsVersion TLS_1_2 = null;
    public static final okhttp3.TlsVersion TLS_1_3 = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String javaName;

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
        public final okhttp3.TlsVersion forJavaName(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "javaName"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r4.hashCode()
                r1 = 79201641(0x4b88569, float:4.338071E-36)
                if (r0 == r1) goto L43
                r1 = 79923350(0x4c38896, float:4.5969714E-36)
                if (r0 == r1) goto L38
                switch(r0) {
                    case -503070503: goto L2d;
                    case -503070502: goto L22;
                    case -503070501: goto L17;
                    default: goto L16;
                }
            L16:
                goto L4e
            L17:
                java.lang.String r0 = "TLSv1.3"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_3
                return r4
            L22:
                java.lang.String r0 = "TLSv1.2"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_2
                return r4
            L2d:
                java.lang.String r0 = "TLSv1.1"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_1
                return r4
            L38:
                java.lang.String r0 = "TLSv1"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_0
                return r4
            L43:
                java.lang.String r0 = "SSLv3"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L4e
                okhttp3.TlsVersion r4 = okhttp3.TlsVersion.SSL_3_0
                return r4
            L4e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected TLS version: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    private static final /* synthetic */ okhttp3.TlsVersion[] $values() {
            r0 = 5
            okhttp3.TlsVersion[] r0 = new okhttp3.TlsVersion[r0]
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_3
            r2 = 0
            r0[r2] = r1
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_2
            r2 = 1
            r0[r2] = r1
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_1
            r2 = 2
            r0[r2] = r1
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_0
            r2 = 3
            r0[r2] = r1
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.SSL_3_0
            r2 = 4
            r0[r2] = r1
            return r0
    }

    static {
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 0
            java.lang.String r2 = "TLSv1.3"
            java.lang.String r3 = "TLS_1_3"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_3 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 1
            java.lang.String r2 = "TLSv1.2"
            java.lang.String r3 = "TLS_1_2"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_2 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 2
            java.lang.String r2 = "TLSv1.1"
            java.lang.String r3 = "TLS_1_1"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_1 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 3
            java.lang.String r2 = "TLSv1"
            java.lang.String r3 = "TLS_1_0"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.TLS_1_0 = r0
            okhttp3.TlsVersion r0 = new okhttp3.TlsVersion
            r1 = 4
            java.lang.String r2 = "SSLv3"
            java.lang.String r3 = "SSL_3_0"
            r0.<init>(r3, r1, r2)
            okhttp3.TlsVersion.SSL_3_0 = r0
            okhttp3.TlsVersion[] r0 = $values()
            okhttp3.TlsVersion.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            okhttp3.TlsVersion.$ENTRIES = r0
            okhttp3.TlsVersion$Companion r0 = new okhttp3.TlsVersion$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.TlsVersion.Companion = r0
            return
    }

    TlsVersion(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.javaName = r3
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.TlsVersion forJavaName(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            okhttp3.TlsVersion$Companion r0 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r1 = r0.forJavaName(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<okhttp3.TlsVersion> getEntries() {
            kotlin.enums.a r0 = okhttp3.TlsVersion.$ENTRIES
            return r0
    }

    public static okhttp3.TlsVersion valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.TlsVersion> r0 = okhttp3.TlsVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.TlsVersion r1 = (okhttp3.TlsVersion) r1
            return r1
    }

    public static okhttp3.TlsVersion[] values() {
            okhttp3.TlsVersion[] r0 = okhttp3.TlsVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.TlsVersion[] r0 = (okhttp3.TlsVersion[]) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "javaName", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_javaName")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final java.lang.String m182deprecated_javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }

    @kotlin.jvm.JvmName(name = "javaName")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }
}
