package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.security.PublicKey a(android.content.pm.Signature r2) {
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r2 = r2.toByteArray()
            r1.<init>(r2)
            java.security.cert.Certificate r2 = r0.generateCertificate(r1)
            r1.close()     // Catch: java.lang.Throwable -> L16
        L16:
            java.security.PublicKey r2 = r2.getPublicKey()
            return r2
    }

    public static java.security.PublicKey a(java.lang.String r10) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L8
            return r0
        L8:
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L75
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L75
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L75
            java.util.Enumeration r10 = r2.entries()     // Catch: java.lang.Throwable -> L75
            r3 = r0
        L16:
            boolean r4 = r10.hasMoreElements()     // Catch: java.lang.Throwable -> L75
            r5 = 0
            if (r4 == 0) goto L66
            java.lang.Object r4 = r10.nextElement()     // Catch: java.lang.Throwable -> L75
            java.util.jar.JarEntry r4 = (java.util.jar.JarEntry) r4     // Catch: java.lang.Throwable -> L75
            boolean r6 = r4.isDirectory()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L16
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "META-INF/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L16
            java.security.cert.Certificate[] r4 = a(r2, r4, r1)     // Catch: java.lang.Throwable -> L75
            if (r4 != 0) goto L3f
            r2.close()     // Catch: java.lang.Throwable -> L75
            return r0
        L3f:
            if (r3 != 0) goto L43
            r3 = r4
            goto L16
        L43:
            r6 = 0
        L44:
            int r7 = r3.length     // Catch: java.lang.Throwable -> L75
            if (r6 >= r7) goto L16
            r7 = 0
        L48:
            int r8 = r4.length     // Catch: java.lang.Throwable -> L75
            if (r7 >= r8) goto L62
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L5f
            r9 = r4[r7]     // Catch: java.lang.Throwable -> L75
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L5f
            int r7 = r3.length     // Catch: java.lang.Throwable -> L75
            int r8 = r4.length     // Catch: java.lang.Throwable -> L75
            if (r7 == r8) goto L5c
            goto L62
        L5c:
            int r6 = r6 + 1
            goto L44
        L5f:
            int r7 = r7 + 1
            goto L48
        L62:
            r2.close()     // Catch: java.lang.Throwable -> L75
            return r0
        L66:
            r2.close()     // Catch: java.lang.Throwable -> L75
            if (r3 == 0) goto L75
            int r10 = r3.length     // Catch: java.lang.Throwable -> L75
            if (r10 <= 0) goto L75
            r10 = r3[r5]     // Catch: java.lang.Throwable -> L75
            java.security.PublicKey r10 = r10.getPublicKey()     // Catch: java.lang.Throwable -> L75
            return r10
        L75:
            return r0
    }

    private static java.security.cert.Certificate[] a(java.util.jar.JarFile r3, java.util.jar.JarEntry r4, byte[] r5) {
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
            java.io.InputStream r3 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
        La:
            r3 = 0
            r2 = 8192(0x2000, float:1.148E-41)
            int r3 = r1.read(r5, r3, r2)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
            r2 = -1
            if (r3 != r2) goto La
            r1.close()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
            if (r4 == 0) goto L1e
            java.security.cert.Certificate[] r3 = r4.getCertificates()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23 java.io.IOException -> L27
            return r3
        L1e:
            return r0
        L1f:
            com.baidu.liantian.b.e.a()
            goto L2a
        L23:
            com.baidu.liantian.b.e.a()
            goto L2a
        L27:
            com.baidu.liantian.b.e.a()
        L2a:
            return r0
    }
}
