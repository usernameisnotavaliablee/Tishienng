package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l {
    private static final java.lang.String a = "WebViewSSLCheck";

    static {
            return
    }

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.webkit.SslErrorHandler r1, android.net.http.SslError r2, android.content.Context r3) {
            r0 = 0
            b(r1, r2, r0, r3, r0)
            return
    }

    public static void b(android.webkit.SslErrorHandler r4, android.net.http.SslError r5, java.lang.String r6, android.content.Context r7, com.huawei.secure.android.common.ssl.m.a r8) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.l.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " error type : "
            r1.append(r2)
            int r2 = r5.getPrimaryError()
            r1.append(r2)
            java.lang.String r2 = " , cn is : "
            r1.append(r2)
            android.net.http.SslCertificate r2 = r5.getCertificate()
            android.net.http.SslCertificate$DName r2 = r2.getIssuedTo()
            java.lang.String r2 = r2.getCName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            android.net.http.SslCertificate r5 = r5.getCertificate()
            java.security.cert.X509Certificate r5 = com.huawei.secure.android.common.ssl.util.e.a(r5)
            com.huawei.secure.android.common.ssl.util.k r1 = new com.huawei.secure.android.common.ssl.util.k
            r1.<init>(r7)
            java.security.cert.X509Certificate r1 = r1.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkServerCertificateNew: error certificate is : "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r0, r2)
            boolean r5 = com.huawei.secure.android.common.ssl.util.e.e(r1, r5)
            if (r5 == 0) goto L68
            java.lang.String r5 = "checkServerCertificateNew: proceed"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r5)
            if (r8 == 0) goto L64
            r8.b(r7, r6)
            return
        L64:
            r4.proceed()
            return
        L68:
            java.lang.String r5 = "checkServerCertificateNew: cancel"
            com.huawei.secure.android.common.ssl.util.h.d(r0, r5)
            if (r8 == 0) goto L73
            r8.a(r7, r6)
            return
        L73:
            r4.cancel()
            return
    }

    public static boolean c(java.lang.String r0, android.net.http.SslError r1) {
            java.security.cert.X509Certificate r0 = com.huawei.secure.android.common.ssl.util.e.b(r0)
            boolean r0 = d(r0, r1)
            return r0
    }

    public static boolean d(java.security.cert.X509Certificate r0, android.net.http.SslError r1) {
            android.net.http.SslCertificate r1 = r1.getCertificate()
            java.security.cert.X509Certificate r1 = com.huawei.secure.android.common.ssl.util.e.a(r1)
            boolean r0 = com.huawei.secure.android.common.ssl.util.e.e(r0, r1)
            return r0
    }
}
