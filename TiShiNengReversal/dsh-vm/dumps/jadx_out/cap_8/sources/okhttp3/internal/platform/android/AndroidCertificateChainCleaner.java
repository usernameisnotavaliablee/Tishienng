package okhttp3.internal.platform.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n37#2,2:77\n1#3:79\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n44#1:77,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final javax.net.ssl.X509TrustManager trustManager;

    @org.jetbrains.annotations.NotNull
    private final android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;

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

        @okhttp3.internal.SuppressSignatureCheck
        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r3) {
                r2 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                android.net.http.X509TrustManagerExtensions r1 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> Lc
                r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Lc
                goto Le
            Lc:
                r1 = r0
            Le:
                if (r1 == 0) goto L15
                okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner
                r0.<init>(r3, r1)
            L15:
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion = r0
            return
    }

    public AndroidCertificateChainCleaner(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2, @org.jetbrains.annotations.NotNull android.net.http.X509TrustManagerExtensions r3) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "x509TrustManagerExtensions"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.trustManager = r2
            r1.x509TrustManagerExtensions = r3
            return
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @okhttp3.internal.SuppressSignatureCheck
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3, @org.jetbrains.annotations.NotNull java.lang.String r4) throws javax.net.ssl.SSLPeerUnverifiedException {
            r2 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Collection r3 = (java.util.Collection) r3
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r0 = r2.x509TrustManagerExtensions     // Catch: java.security.cert.CertificateException -> L23
            java.lang.String r1 = "RSA"
            java.util.List r3 = r0.checkServerTrusted(r3, r1, r4)     // Catch: java.security.cert.CertificateException -> L23
            java.lang.String r4 = "checkServerTrusted(...)"
            kotlin.jvm.internal.g0.o(r3, r4)     // Catch: java.security.cert.CertificateException -> L23
            return r3
        L23:
            r3 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0)
            r4.initCause(r3)
            throw r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner
            if (r0 == 0) goto Le
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r2 = (okhttp3.internal.platform.android.AndroidCertificateChainCleaner) r2
            javax.net.ssl.X509TrustManager r2 = r2.trustManager
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.trustManager
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }
}
