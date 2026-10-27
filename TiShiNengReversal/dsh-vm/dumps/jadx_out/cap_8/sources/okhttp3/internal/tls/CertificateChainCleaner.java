package okhttp3.internal.tls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.CertificateChainCleaner.Companion Companion = null;

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

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.tls.CertificateChainCleaner get(@org.jetbrains.annotations.NotNull javax.net.ssl.X509TrustManager r2) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.get()
                okhttp3.internal.tls.CertificateChainCleaner r2 = r0.buildCertificateChainCleaner(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.tls.CertificateChainCleaner get(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate... r4) {
                r3 = this;
                java.lang.String r0 = "caCerts"
                kotlin.jvm.internal.g0.p(r4, r0)
                okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
                okhttp3.internal.tls.BasicTrustRootIndex r1 = new okhttp3.internal.tls.BasicTrustRootIndex
                int r2 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
                java.security.cert.X509Certificate[] r4 = (java.security.cert.X509Certificate[]) r4
                r1.<init>(r4)
                r0.<init>(r1)
                return r0
        }
    }

    static {
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.CertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.CertificateChainCleaner.Companion = r0
            return
    }

    public CertificateChainCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r1, @org.jetbrains.annotations.NotNull java.lang.String r2) throws javax.net.ssl.SSLPeerUnverifiedException;
}
