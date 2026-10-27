package okhttp3.internal.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n37#2,2:110\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n42#1:110,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Jdk9Platform extends okhttp3.internal.platform.Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Jdk9Platform.Companion Companion = null;
    private static final boolean isAvailable = false;

    @org.jetbrains.annotations.Nullable
    private static final java.lang.Integer majorVersion = null;

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

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isAvailable()
                if (r0 == 0) goto Lc
                okhttp3.internal.platform.Jdk9Platform r0 = new okhttp3.internal.platform.Jdk9Platform
                r0.<init>()
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getMajorVersion() {
                r1 = this;
                java.lang.Integer r0 = okhttp3.internal.platform.Jdk9Platform.access$getMajorVersion$cp()
                return r0
        }

        public final boolean isAvailable() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.Jdk9Platform.access$isAvailable$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L15
            java.lang.Integer r0 = kotlin.text.u.n1(r0)
            goto L16
        L15:
            r0 = r1
        L16:
            okhttp3.internal.platform.Jdk9Platform.majorVersion = r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L2e
        L24:
            r2 = 1
            goto L2e
        L26:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L2e
            goto L24
        L2e:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r2
            return
    }

    public Jdk9Platform() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.Integer access$getMajorVersion$cp() {
            java.lang.Integer r0 = okhttp3.internal.platform.Jdk9Platform.majorVersion
            return r0
    }

    public static final /* synthetic */ boolean access$isAvailable$cp() {
            boolean r0 = okhttp3.internal.platform.Jdk9Platform.isAvailable
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @okhttp3.internal.SuppressSignatureCheck
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.Protocol> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.lang.String r3 = "protocols"
            kotlin.jvm.internal.g0.p(r4, r3)
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r4 = r0.alpnProtocolNames(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            x4.h.a(r3, r4)
            r2.setSSLParameters(r3)
            return
    }

    @Override // okhttp3.internal.platform.Platform
    @okhttp3.internal.SuppressSignatureCheck
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            java.lang.String r3 = x4.i.a(r3)     // Catch: java.lang.UnsupportedOperationException -> L16
            if (r3 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = kotlin.jvm.internal.g0.g(r3, r1)     // Catch: java.lang.UnsupportedOperationException -> L16
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r3
        L16:
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.NotNull
    public javax.net.ssl.SSLContext newSSLContext() {
            r3 = this;
            java.lang.Integer r0 = okhttp3.internal.platform.Jdk9Platform.majorVersion
            java.lang.String r1 = "TLS"
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L18
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1)
            java.lang.String r1 = "getInstance(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
        L18:
            java.lang.String r0 = "TLSv1.3"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L1f
            goto L23
        L1f:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r1)
        L23:
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public javax.net.ssl.X509TrustManager trustManager(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 8 (>= 252) or JDK 9+"
            r2.<init>(r0)
            throw r2
    }
}
