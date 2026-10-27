package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i extends javax.net.ssl.SSLSocketFactory {
    private static final java.lang.String i = "SSLFNew";
    private static volatile com.huawei.secure.android.common.ssl.i j;
    protected javax.net.ssl.SSLContext a;
    protected javax.net.ssl.SSLSocket b;
    protected android.content.Context c;
    protected java.lang.String[] d;
    protected javax.net.ssl.X509TrustManager e;
    protected java.lang.String[] f;
    protected java.lang.String[] g;
    protected java.lang.String[] h;

    static {
            return
    }

    private i(android.content.Context r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException, java.security.KeyManagementException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            if (r5 != 0) goto L12
            java.lang.String r5 = "SSLFNew"
            java.lang.String r6 = "SecureSSLSocketFactory: context is null"
            com.huawei.secure.android.common.ssl.util.h.d(r5, r6)
            return
        L12:
            r4.l(r5)
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.n(r1)
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.a(r5)
            r4.e = r5
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r6)
            return
    }

    @java.lang.Deprecated
    public i(java.io.InputStream r4, java.lang.String r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            com.huawei.secure.android.common.ssl.a r1 = new com.huawei.secure.android.common.ssl.a
            r1.<init>(r4, r5)
            r3.p(r1)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r0)
            return
    }

    public i(java.io.InputStream r4, java.lang.String r5, java.security.SecureRandom r6) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            com.huawei.secure.android.common.ssl.a r1 = new com.huawei.secure.android.common.ssl.a
            r1.<init>(r4, r5)
            r3.p(r1)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r6)
            return
    }

    @java.lang.Deprecated
    public i(javax.net.ssl.X509TrustManager r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.a = r1
            r4.p(r5)
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r0)
            return
    }

    public i(javax.net.ssl.X509TrustManager r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.a = r1
            r4.p(r5)
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r6)
            return
    }

    private void a(java.net.Socket r6) {
            r5 = this;
            java.lang.String[] r0 = r5.h
            boolean r0 = com.huawei.secure.android.common.ssl.util.d.a(r0)
            r1 = 1
            java.lang.String r2 = "SSLFNew"
            r3 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = "set protocols"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            r0 = r6
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            java.lang.String[] r4 = r5.h
            com.huawei.secure.android.common.ssl.f.h(r0, r4)
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.String[] r4 = r5.g
            boolean r4 = com.huawei.secure.android.common.ssl.util.d.a(r4)
            if (r4 == 0) goto L2f
            java.lang.String[] r4 = r5.f
            boolean r4 = com.huawei.secure.android.common.ssl.util.d.a(r4)
            if (r4 != 0) goto L2d
            goto L2f
        L2d:
            r1 = 0
            goto L4d
        L2f:
            java.lang.String r3 = "set cipher"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r3)
            r3 = r6
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            com.huawei.secure.android.common.ssl.f.g(r3)
            java.lang.String[] r4 = r5.g
            boolean r4 = com.huawei.secure.android.common.ssl.util.d.a(r4)
            if (r4 != 0) goto L48
            java.lang.String[] r4 = r5.g
            com.huawei.secure.android.common.ssl.f.l(r3, r4)
            goto L4d
        L48:
            java.lang.String[] r4 = r5.f
            com.huawei.secure.android.common.ssl.f.e(r3, r4)
        L4d:
            if (r0 != 0) goto L5a
            java.lang.String r0 = "set default protocols"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            r0 = r6
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            com.huawei.secure.android.common.ssl.f.g(r0)
        L5a:
            if (r1 != 0) goto L66
            java.lang.String r0 = "set default cipher"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            javax.net.ssl.SSLSocket r6 = (javax.net.ssl.SSLSocket) r6
            com.huawei.secure.android.common.ssl.f.f(r6)
        L66:
            return
    }

    @java.lang.Deprecated
    public static com.huawei.secure.android.common.ssl.i d(android.content.Context r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.util.c.b(r5)
            com.huawei.secure.android.common.ssl.i r2 = com.huawei.secure.android.common.ssl.i.j
            if (r2 != 0) goto L21
            java.lang.Class<com.huawei.secure.android.common.ssl.i> r2 = com.huawei.secure.android.common.ssl.i.class
            monitor-enter(r2)
            com.huawei.secure.android.common.ssl.i r3 = com.huawei.secure.android.common.ssl.i.j     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L1d
            com.huawei.secure.android.common.ssl.i r3 = new com.huawei.secure.android.common.ssl.i     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L1b
            com.huawei.secure.android.common.ssl.i.j = r3     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r5 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r5
        L21:
            com.huawei.secure.android.common.ssl.i r2 = com.huawei.secure.android.common.ssl.i.j
            android.content.Context r2 = r2.c
            if (r2 != 0) goto L2e
            if (r5 == 0) goto L2e
            com.huawei.secure.android.common.ssl.i r2 = com.huawei.secure.android.common.ssl.i.j
            r2.l(r5)
        L2e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "getInstance: cost : "
            r5.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r5.append(r2)
            java.lang.String r0 = " ms"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "SSLFNew"
            com.huawei.secure.android.common.ssl.util.h.b(r0, r5)
            com.huawei.secure.android.common.ssl.i r5 = com.huawei.secure.android.common.ssl.i.j
            return r5
    }

    public static com.huawei.secure.android.common.ssl.i e(android.content.Context r4, java.security.SecureRandom r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.util.c.b(r4)
            com.huawei.secure.android.common.ssl.i r2 = com.huawei.secure.android.common.ssl.i.j
            if (r2 != 0) goto L20
            java.lang.Class<com.huawei.secure.android.common.ssl.i> r2 = com.huawei.secure.android.common.ssl.i.class
            monitor-enter(r2)
            com.huawei.secure.android.common.ssl.i r3 = com.huawei.secure.android.common.ssl.i.j     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            com.huawei.secure.android.common.ssl.i r3 = new com.huawei.secure.android.common.ssl.i     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1a
            com.huawei.secure.android.common.ssl.i.j = r3     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r4
        L20:
            com.huawei.secure.android.common.ssl.i r5 = com.huawei.secure.android.common.ssl.i.j
            android.content.Context r5 = r5.c
            if (r5 != 0) goto L2d
            if (r4 == 0) goto L2d
            com.huawei.secure.android.common.ssl.i r5 = com.huawei.secure.android.common.ssl.i.j
            r5.l(r4)
        L2d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getInstance: cost : "
            r4.append(r5)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r4.append(r2)
            java.lang.String r5 = " ms"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SSLFNew"
            com.huawei.secure.android.common.ssl.util.h.b(r5, r4)
            com.huawei.secure.android.common.ssl.i r4 = com.huawei.secure.android.common.ssl.i.j
            return r4
    }

    public java.lang.String[] b() {
            r1 = this;
            java.lang.String[] r0 = r1.f
            return r0
    }

    public java.security.cert.X509Certificate[] c() {
            r2 = this;
            javax.net.ssl.X509TrustManager r0 = r2.e
            boolean r1 = r0 instanceof com.huawei.secure.android.common.ssl.k
            if (r1 == 0) goto Ld
            com.huawei.secure.android.common.ssl.k r0 = (com.huawei.secure.android.common.ssl.k) r0
            java.security.cert.X509Certificate[] r0 = r0.e()
            return r0
        Ld:
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            return r0
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r3, int r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "SSLFNew"
            java.lang.String r1 = "createSocket: host , port"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            javax.net.ssl.SSLContext r0 = r2.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r3 = r0.createSocket(r3, r4)
            boolean r4 = r3 instanceof javax.net.ssl.SSLSocket
            if (r4 == 0) goto L29
            r2.a(r3)
            r4 = r3
            javax.net.ssl.SSLSocket r4 = (javax.net.ssl.SSLSocket) r4
            r2.b = r4
            java.lang.String[] r4 = r4.getEnabledCipherSuites()
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            r2.d = r4
        L29:
            return r3
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r1, int r2, java.net.InetAddress r3, int r4) throws java.io.IOException, java.net.UnknownHostException {
            r0 = this;
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r1, int r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getHostAddress()
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.net.InetAddress r1, int r2, java.net.InetAddress r3, int r4) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getHostAddress()
            java.net.Socket r1 = r0.createSocket(r1, r2)
            return r1
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.net.Socket createSocket(java.net.Socket r3, java.lang.String r4, int r5, boolean r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "SSLFNew"
            java.lang.String r1 = "createSocket"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            javax.net.ssl.SSLContext r0 = r2.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r3 = r0.createSocket(r3, r4, r5, r6)
            boolean r4 = r3 instanceof javax.net.ssl.SSLSocket
            if (r4 == 0) goto L29
            r2.a(r3)
            r4 = r3
            javax.net.ssl.SSLSocket r4 = (javax.net.ssl.SSLSocket) r4
            r2.b = r4
            java.lang.String[] r4 = r4.getEnabledCipherSuites()
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            r2.d = r4
        L29:
            return r3
    }

    public java.lang.String[] f() {
            r1 = this;
            java.lang.String[] r0 = r1.h
            return r0
    }

    public javax.net.ssl.SSLContext g() {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.c
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getDefaultCipherSuites() {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            java.lang.String[] r0 = r1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    public javax.net.ssl.SSLSocket h() {
            r1 = this;
            javax.net.ssl.SSLSocket r0 = r1.b
            return r0
    }

    public java.lang.String[] i() {
            r1 = this;
            java.lang.String[] r0 = r1.g
            return r0
    }

    public javax.net.ssl.X509TrustManager j() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.e
            return r0
    }

    public void k(java.lang.String[] r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void l(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
            return
    }

    public void m(java.lang.String[] r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void n(javax.net.ssl.SSLContext r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void o(java.lang.String[] r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void p(javax.net.ssl.X509TrustManager r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
