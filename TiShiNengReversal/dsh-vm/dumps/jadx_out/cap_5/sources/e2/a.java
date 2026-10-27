package e2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements javax.net.ssl.HostnameVerifier {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r5, javax.net.ssl.SSLSession r6) {
            r4 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.security.cert.Certificate[] r6 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L2f
            r6 = r6[r1]     // Catch: javax.net.ssl.SSLException -> L2f
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch: javax.net.ssl.SSLException -> L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: javax.net.ssl.SSLException -> L2f
            r2.<init>()     // Catch: javax.net.ssl.SSLException -> L2f
            java.lang.String r3 = "verify: certificate is : "
            r2.append(r3)     // Catch: javax.net.ssl.SSLException -> L2f
            java.security.Principal r3 = r6.getSubjectDN()     // Catch: javax.net.ssl.SSLException -> L2f
            java.lang.String r3 = r3.getName()     // Catch: javax.net.ssl.SSLException -> L2f
            r2.append(r3)     // Catch: javax.net.ssl.SSLException -> L2f
            java.lang.String r2 = r2.toString()     // Catch: javax.net.ssl.SSLException -> L2f
            com.huawei.secure.android.common.ssl.util.h.e(r0, r2)     // Catch: javax.net.ssl.SSLException -> L2f
            e2.d.a(r5, r6, r1)     // Catch: javax.net.ssl.SSLException -> L2f
            com.huawei.secure.android.common.ssl.util.f.b()     // Catch: javax.net.ssl.SSLException -> L2f
            r5 = 1
            return r5
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "SSLException : "
            r6.append(r2)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r0, r5)
            return r1
    }
}
