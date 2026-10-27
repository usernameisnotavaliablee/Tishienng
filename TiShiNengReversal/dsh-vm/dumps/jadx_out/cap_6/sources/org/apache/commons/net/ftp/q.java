package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class q implements javax.net.ssl.X509TrustManager {
    private static final java.security.cert.X509Certificate[] a = null;

    static {
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            org.apache.commons.net.ftp.q.a = r0
            return
    }

    public q() {
            r0 = this;
            r0.<init>()
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
            int r4 = r3.length
            r0 = 0
        L2:
            if (r0 >= r4) goto Lc
            r1 = r3[r0]
            r1.checkValidity()
            int r0 = r0 + 1
            goto L2
        Lc:
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r1 = this;
            java.security.cert.X509Certificate[] r0 = org.apache.commons.net.ftp.q.a
            return r0
    }
}
