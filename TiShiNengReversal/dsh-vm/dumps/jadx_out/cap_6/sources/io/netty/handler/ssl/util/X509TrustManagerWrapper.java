package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class X509TrustManagerWrapper extends javax.net.ssl.X509ExtendedTrustManager {
    private final javax.net.ssl.X509TrustManager delegate;

    X509TrustManagerWrapper(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            r1.delegate = r2
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.delegate
            r0.checkClientTrusted(r2, r3)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2, java.net.Socket r3) throws java.security.cert.CertificateException {
            r0 = this;
            javax.net.ssl.X509TrustManager r3 = r0.delegate
            r3.checkClientTrusted(r1, r2)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2, javax.net.ssl.SSLEngine r3) throws java.security.cert.CertificateException {
            r0 = this;
            javax.net.ssl.X509TrustManager r3 = r0.delegate
            r3.checkClientTrusted(r1, r2)
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.delegate
            r0.checkServerTrusted(r2, r3)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2, java.net.Socket r3) throws java.security.cert.CertificateException {
            r0 = this;
            javax.net.ssl.X509TrustManager r3 = r0.delegate
            r3.checkServerTrusted(r1, r2)
            return
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2, javax.net.ssl.SSLEngine r3) throws java.security.cert.CertificateException {
            r0 = this;
            javax.net.ssl.X509TrustManager r3 = r0.delegate
            r3.checkServerTrusted(r1, r2)
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.delegate
            java.security.cert.X509Certificate[] r0 = r0.getAcceptedIssuers()
            return r0
    }
}
