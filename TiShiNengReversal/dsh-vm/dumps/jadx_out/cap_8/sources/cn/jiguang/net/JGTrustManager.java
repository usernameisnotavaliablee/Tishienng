package cn.jiguang.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JGTrustManager implements javax.net.ssl.X509TrustManager {
    private javax.net.ssl.X509TrustManager a;

    public JGTrustManager(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L4f
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4f
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            java.security.cert.Certificate r5 = r0.generateCertificate(r1)     // Catch: java.lang.Throwable -> L4f
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.lang.Throwable -> L4f
            r1.close()     // Catch: java.lang.Throwable -> L4f
            java.security.KeyStore$TrustedCertificateEntry r0 = new java.security.KeyStore$TrustedCertificateEntry     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Throwable -> L4f
            java.security.KeyStore r5 = java.security.KeyStore.getInstance(r5)     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            r5.load(r1, r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "ca_root"
            r5.setEntry(r2, r0, r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Throwable -> L4f
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L4f
            r0.init(r5)     // Catch: java.lang.Throwable -> L4f
            javax.net.ssl.TrustManager[] r5 = r0.getTrustManagers()     // Catch: java.lang.Throwable -> L4f
            int r0 = r5.length     // Catch: java.lang.Throwable -> L4f
            r1 = 0
        L42:
            if (r1 >= r0) goto L54
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L51
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2     // Catch: java.lang.Throwable -> L4f
            r4.a = r2     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r5 = move-exception
            goto L5c
        L51:
            int r1 = r1 + 1
            goto L42
        L54:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "No X509TrustManager found"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L4f
        L5c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init trustManager failed, error:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JGTrustManager"
            cn.jiguang.w.f.i(r1, r0)
            throw r5
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "JGTrustManager"
            java.lang.String r1 = "checkClientTrusted"
            cn.jiguang.w.f.c(r0, r1)
            javax.net.ssl.X509TrustManager r0 = r2.a
            r0.checkClientTrusted(r3, r4)
            return
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "checkServerTrusted"
            java.lang.String r1 = "JGTrustManager"
            cn.jiguang.w.f.c(r1, r0)
            javax.net.ssl.X509TrustManager r0 = r2.a
            r0.checkServerTrusted(r3, r4)
            if (r3 == 0) goto L7e
            int r4 = r3.length
            if (r4 == 0) goto L7e
            r4 = 0
            r3 = r3[r4]
            if (r3 == 0) goto L7e
            r3.checkValidity()     // Catch: java.lang.Throwable -> L1a java.security.cert.CertificateNotYetValidException -> L4a java.security.cert.CertificateExpiredException -> L64
            return
        L1a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "checkServerTrusted failed, error"
            r4.append(r0)
            java.lang.String r0 = r3.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.i(r1, r4)
            java.security.cert.CertificateException r4 = new java.security.cert.CertificateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Check Server x509Certificates exception: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L4a:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "checkServerTrusted: CertificateNotYetValidException:"
            r4.append(r0)
            java.lang.String r0 = r3.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.i(r1, r4)
            throw r3
        L64:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "checkServerTrusted: CertificateExpiredException:"
            r4.append(r0)
            java.lang.String r0 = r3.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.i(r1, r4)
            throw r3
        L7e:
            java.security.cert.CertificateException r3 = new java.security.cert.CertificateException
            java.lang.String r4 = "Check Server x509Certificates is empty"
            r3.<init>(r4)
            throw r3
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            r2 = this;
            java.lang.String r0 = "JGTrustManager"
            java.lang.String r1 = "getAcceptedIssuers"
            cn.jiguang.w.f.c(r0, r1)
            javax.net.ssl.X509TrustManager r0 = r2.a
            java.security.cert.X509Certificate[] r0 = r0.getAcceptedIssuers()
            return r0
    }
}
