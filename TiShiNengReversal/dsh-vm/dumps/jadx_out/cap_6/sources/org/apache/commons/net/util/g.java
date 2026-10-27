package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class g {
    private static final java.security.cert.X509Certificate[] a = null;
    private static final javax.net.ssl.X509TrustManager b = null;
    private static final javax.net.ssl.X509TrustManager c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements javax.net.ssl.X509TrustManager {
        private final boolean a;

        a(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r3, java.lang.String r4) throws java.security.cert.CertificateException {
                r2 = this;
                boolean r4 = r2.a
                if (r4 == 0) goto L10
                int r4 = r3.length
                r0 = 0
            L6:
                if (r0 >= r4) goto L10
                r1 = r3[r0]
                r1.checkValidity()
                int r0 = r0 + 1
                goto L6
            L10:
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                java.security.cert.X509Certificate[] r0 = org.apache.commons.net.util.g.a()
                return r0
        }
    }

    static {
            r0 = 0
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r0]
            org.apache.commons.net.util.g.a = r1
            org.apache.commons.net.util.g$a r1 = new org.apache.commons.net.util.g$a
            r1.<init>(r0)
            org.apache.commons.net.util.g.b = r1
            org.apache.commons.net.util.g$a r0 = new org.apache.commons.net.util.g$a
            r1 = 1
            r0.<init>(r1)
            org.apache.commons.net.util.g.c = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.security.cert.X509Certificate[] a() {
            java.security.cert.X509Certificate[] r0 = org.apache.commons.net.util.g.a
            return r0
    }

    public static javax.net.ssl.X509TrustManager b() {
            javax.net.ssl.X509TrustManager r0 = org.apache.commons.net.util.g.b
            return r0
    }

    public static javax.net.ssl.X509TrustManager c(java.security.KeyStore r1) throws java.security.GeneralSecurityException {
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r0.init(r1)
            javax.net.ssl.TrustManager[] r1 = r0.getTrustManagers()
            r0 = 0
            r1 = r1[r0]
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            return r1
    }

    public static javax.net.ssl.X509TrustManager d() {
            javax.net.ssl.X509TrustManager r0 = org.apache.commons.net.util.g.c
            return r0
    }
}
