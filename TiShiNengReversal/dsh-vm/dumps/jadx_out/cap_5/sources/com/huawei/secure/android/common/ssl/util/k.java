package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k {
    private static final java.lang.String b = "X509CertificateUtil";
    public static final java.lang.String c = "hmsrootcas.bks";
    public static final java.lang.String d = "";
    public static final java.lang.String e = "bks";
    public static final java.lang.String f = "052root";
    private static final java.lang.String g = "hmsincas.bks";
    private static final java.lang.String h = "huawei cbg application integration ca";
    private android.content.Context a;

    public k(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.security.cert.X509Certificate a() {
            r2 = this;
            java.lang.String r0 = "hmsincas.bks"
            java.lang.String r1 = "huawei cbg application integration ca"
            java.security.cert.X509Certificate r0 = r2.b(r0, r1)
            return r0
    }

    public java.security.cert.X509Certificate b(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "bks"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L35 java.security.cert.CertificateException -> L37 java.security.KeyStoreException -> L39
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L35 java.security.cert.CertificateException -> L37 java.security.KeyStoreException -> L39
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L35 java.security.cert.CertificateException -> L37 java.security.KeyStoreException -> L39
            java.io.InputStream r5 = r2.open(r5)     // Catch: java.lang.Throwable -> L30 java.security.NoSuchAlgorithmException -> L32 java.io.IOException -> L35 java.security.cert.CertificateException -> L37 java.security.KeyStoreException -> L39
            r5.reset()     // Catch: java.lang.Throwable -> L25 java.security.NoSuchAlgorithmException -> L28 java.io.IOException -> L2a java.security.cert.CertificateException -> L2c java.security.KeyStoreException -> L2e
            java.lang.String r2 = ""
            char[] r2 = r2.toCharArray()     // Catch: java.lang.Throwable -> L25 java.security.NoSuchAlgorithmException -> L28 java.io.IOException -> L2a java.security.cert.CertificateException -> L2c java.security.KeyStoreException -> L2e
            r1.load(r5, r2)     // Catch: java.lang.Throwable -> L25 java.security.NoSuchAlgorithmException -> L28 java.io.IOException -> L2a java.security.cert.CertificateException -> L2c java.security.KeyStoreException -> L2e
            java.security.cert.Certificate r6 = r1.getCertificate(r6)     // Catch: java.lang.Throwable -> L25 java.security.NoSuchAlgorithmException -> L28 java.io.IOException -> L2a java.security.cert.CertificateException -> L2c java.security.KeyStoreException -> L2e
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch: java.lang.Throwable -> L25 java.security.NoSuchAlgorithmException -> L28 java.io.IOException -> L2a java.security.cert.CertificateException -> L2c java.security.KeyStoreException -> L2e
            r0 = r6
            goto L55
        L25:
            r6 = move-exception
            r0 = r5
            goto L59
        L28:
            r6 = move-exception
            goto L3b
        L2a:
            r6 = move-exception
            goto L3b
        L2c:
            r6 = move-exception
            goto L3b
        L2e:
            r6 = move-exception
            goto L3b
        L30:
            r6 = move-exception
            goto L59
        L32:
            r6 = move-exception
        L33:
            r5 = r0
            goto L3b
        L35:
            r6 = move-exception
            goto L33
        L37:
            r6 = move-exception
            goto L33
        L39:
            r6 = move-exception
            goto L33
        L3b:
            java.lang.String r1 = "X509CertificateUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "loadBksCA: exception : "
            r2.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L25
            r2.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L25
            com.huawei.secure.android.common.ssl.util.h.d(r1, r6)     // Catch: java.lang.Throwable -> L25
        L55:
            com.huawei.secure.android.common.ssl.util.g.g(r5)
            return r0
        L59:
            com.huawei.secure.android.common.ssl.util.g.g(r0)
            throw r6
    }

    public java.security.cert.X509Certificate c() {
            r2 = this;
            java.lang.String r0 = "hmsrootcas.bks"
            java.lang.String r1 = "052root"
            java.security.cert.X509Certificate r0 = r2.b(r0, r1)
            return r0
    }
}
