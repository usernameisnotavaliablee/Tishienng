package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static final java.lang.String a = "CertificateUtil";

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.security.cert.X509Certificate a(android.content.Context r6) {
            r0 = 0
            java.lang.String r1 = "bks"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 java.security.NoSuchAlgorithmException -> L3b java.io.IOException -> L3d java.security.cert.CertificateException -> L3f java.security.KeyStoreException -> L41
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 java.security.NoSuchAlgorithmException -> L3b java.io.IOException -> L3d java.security.cert.CertificateException -> L3f java.security.KeyStoreException -> L41
            java.lang.String r2 = "hmsrootcas.bks"
            java.io.InputStream r6 = r6.open(r2)     // Catch: java.lang.Throwable -> L36 java.lang.RuntimeException -> L38 java.security.NoSuchAlgorithmException -> L3b java.io.IOException -> L3d java.security.cert.CertificateException -> L3f java.security.KeyStoreException -> L41
            r6.reset()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2c java.security.NoSuchAlgorithmException -> L2e java.io.IOException -> L30 java.security.cert.CertificateException -> L32 java.security.KeyStoreException -> L34
            java.lang.String r2 = ""
            char[] r2 = r2.toCharArray()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2c java.security.NoSuchAlgorithmException -> L2e java.io.IOException -> L30 java.security.cert.CertificateException -> L32 java.security.KeyStoreException -> L34
            r1.load(r6, r2)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2c java.security.NoSuchAlgorithmException -> L2e java.io.IOException -> L30 java.security.cert.CertificateException -> L32 java.security.KeyStoreException -> L34
            java.lang.String r2 = "052root"
            java.security.cert.Certificate r1 = r1.getCertificate(r2)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2c java.security.NoSuchAlgorithmException -> L2e java.io.IOException -> L30 java.security.cert.CertificateException -> L32 java.security.KeyStoreException -> L34
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2c java.security.NoSuchAlgorithmException -> L2e java.io.IOException -> L30 java.security.cert.CertificateException -> L32 java.security.KeyStoreException -> L34
            r0 = r1
            goto L5d
        L27:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L61
        L2c:
            r1 = move-exception
            goto L43
        L2e:
            r1 = move-exception
            goto L43
        L30:
            r1 = move-exception
            goto L43
        L32:
            r1 = move-exception
            goto L43
        L34:
            r1 = move-exception
            goto L43
        L36:
            r6 = move-exception
            goto L61
        L38:
            r1 = move-exception
        L39:
            r6 = r0
            goto L43
        L3b:
            r1 = move-exception
            goto L39
        L3d:
            r1 = move-exception
            goto L39
        L3f:
            r1 = move-exception
            goto L39
        L41:
            r1 = move-exception
            goto L39
        L43:
            java.lang.String r2 = "CertificateUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "loadBksCA: exception : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r3.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L27
            com.huawei.secure.android.common.ssl.util.h.d(r2, r1)     // Catch: java.lang.Throwable -> L27
        L5d:
            com.huawei.secure.android.common.ssl.util.g.g(r6)
            return r0
        L61:
            com.huawei.secure.android.common.ssl.util.g.g(r0)
            throw r6
    }
}
