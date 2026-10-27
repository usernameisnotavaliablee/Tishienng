package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g extends org.apache.http.conn.ssl.SSLSocketFactory {
    public static final org.apache.http.conn.ssl.X509HostnameVerifier i = null;
    public static final org.apache.http.conn.ssl.X509HostnameVerifier j = null;
    private static final java.lang.String k = null;
    private static volatile com.huawei.secure.android.common.ssl.g l;
    private javax.net.ssl.SSLContext a;
    private javax.net.ssl.SSLSocket b;
    private android.content.Context c;
    private java.lang.String[] d;
    private javax.net.ssl.X509TrustManager e;
    private java.lang.String[] f;
    private java.lang.String[] g;
    private java.lang.String[] h;

    static {
            org.apache.http.conn.ssl.BrowserCompatHostnameVerifier r0 = new org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
            r0.<init>()
            com.huawei.secure.android.common.ssl.g.i = r0
            org.apache.http.conn.ssl.StrictHostnameVerifier r0 = new org.apache.http.conn.ssl.StrictHostnameVerifier
            r0.<init>()
            com.huawei.secure.android.common.ssl.g.j = r0
            java.lang.Class<com.huawei.secure.android.common.ssl.g> r0 = com.huawei.secure.android.common.ssl.g.class
            java.lang.String r0 = r0.getSimpleName()
            com.huawei.secure.android.common.ssl.g.k = r0
            r0 = 0
            com.huawei.secure.android.common.ssl.g.l = r0
            return
    }

    private g(java.security.KeyStore r1) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.b = r1
            return
    }

    private g(java.security.KeyStore r4, android.content.Context r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.b = r4
            if (r5 != 0) goto L10
            java.lang.String r4 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r5 = "SecureSSLSocketFactory: context is null"
            com.huawei.secure.android.common.ssl.util.h.d(r4, r5)
            return
        L10:
            r3.o(r5)
            javax.net.ssl.SSLContext r0 = com.huawei.secure.android.common.ssl.f.i()
            r3.q(r0)
            com.huawei.secure.android.common.ssl.k r5 = com.huawei.secure.android.common.ssl.j.a(r5)
            r3.e = r5
            javax.net.ssl.SSLContext r0 = r3.a
            r1 = 1
            javax.net.ssl.X509TrustManager[] r1 = new javax.net.ssl.X509TrustManager[r1]
            r2 = 0
            r1[r2] = r5
            r0.init(r4, r1, r6)
            return
    }

    @java.lang.Deprecated
    public g(java.security.KeyStore r3, java.io.InputStream r4, java.lang.String r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.b = r3
            javax.net.ssl.SSLContext r0 = com.huawei.secure.android.common.ssl.f.i()
            r2.a = r0
            com.huawei.secure.android.common.ssl.a r0 = new com.huawei.secure.android.common.ssl.a
            r0.<init>(r4, r5)
            r2.t(r0)
            javax.net.ssl.SSLContext r4 = r2.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r1 = 0
            r5[r1] = r0
            r4.init(r3, r5, r3)
            return
    }

    public g(java.security.KeyStore r3, java.io.InputStream r4, java.lang.String r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.b = r3
            javax.net.ssl.SSLContext r0 = com.huawei.secure.android.common.ssl.f.i()
            r2.a = r0
            com.huawei.secure.android.common.ssl.a r0 = new com.huawei.secure.android.common.ssl.a
            r0.<init>(r4, r5)
            r2.t(r0)
            javax.net.ssl.SSLContext r4 = r2.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r1 = 0
            r5[r1] = r0
            r4.init(r3, r5, r6)
            return
    }

    @java.lang.Deprecated
    public g(java.security.KeyStore r4, javax.net.ssl.X509TrustManager r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.b = r4
            javax.net.ssl.SSLContext r0 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r0
            r3.t(r5)
            javax.net.ssl.SSLContext r0 = r3.a
            r1 = 1
            javax.net.ssl.X509TrustManager[] r1 = new javax.net.ssl.X509TrustManager[r1]
            r2 = 0
            r1[r2] = r5
            r0.init(r4, r1, r4)
            return
    }

    public g(java.security.KeyStore r4, javax.net.ssl.X509TrustManager r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>(r4)
            r4 = 0
            r3.b = r4
            javax.net.ssl.SSLContext r0 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r0
            r3.t(r5)
            javax.net.ssl.SSLContext r0 = r3.a
            r1 = 1
            javax.net.ssl.X509TrustManager[] r1 = new javax.net.ssl.X509TrustManager[r1]
            r2 = 0
            r1[r2] = r5
            r0.init(r4, r1, r6)
            return
    }

    private void a(java.net.Socket r5) {
            r4 = this;
            java.lang.String[] r0 = r4.h
            boolean r0 = com.huawei.secure.android.common.ssl.util.d.a(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "set protocols"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r3)
            r0 = r5
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            java.lang.String[] r3 = r4.h
            com.huawei.secure.android.common.ssl.f.h(r0, r3)
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.String[] r3 = r4.g
            boolean r3 = com.huawei.secure.android.common.ssl.util.d.a(r3)
            if (r3 == 0) goto L2f
            java.lang.String[] r3 = r4.f
            boolean r3 = com.huawei.secure.android.common.ssl.util.d.a(r3)
            if (r3 != 0) goto L2d
            goto L2f
        L2d:
            r1 = 0
            goto L4f
        L2f:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "set white cipher or black cipher"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r3)
            r2 = r5
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2
            com.huawei.secure.android.common.ssl.f.g(r2)
            java.lang.String[] r3 = r4.g
            boolean r3 = com.huawei.secure.android.common.ssl.util.d.a(r3)
            if (r3 != 0) goto L4a
            java.lang.String[] r3 = r4.g
            com.huawei.secure.android.common.ssl.f.l(r2, r3)
            goto L4f
        L4a:
            java.lang.String[] r3 = r4.f
            com.huawei.secure.android.common.ssl.f.e(r2, r3)
        L4f:
            if (r0 != 0) goto L5e
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r2 = "set default protocols"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r2)
            r0 = r5
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            com.huawei.secure.android.common.ssl.f.g(r0)
        L5e:
            if (r1 != 0) goto L6c
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r1 = "set default cipher suites"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            javax.net.ssl.SSLSocket r5 = (javax.net.ssl.SSLSocket) r5
            com.huawei.secure.android.common.ssl.f.f(r5)
        L6c:
            return
    }

    @java.lang.Deprecated
    static void b(javax.net.ssl.X509TrustManager r2) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r1 = "sasf update socket factory trust manager"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            com.huawei.secure.android.common.ssl.g r0 = new com.huawei.secure.android.common.ssl.g     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            r1 = 0
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            com.huawei.secure.android.common.ssl.g.l = r0     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            return
        L10:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "IOException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            goto L3f
        L18:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "CertificateException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            goto L3f
        L20:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "KeyStoreException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            goto L3f
        L28:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "UnrecoverableKeyException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            goto L3f
        L30:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "KeyManagementException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
            goto L3f
        L38:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r0 = "NoSuchAlgorithmException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)
        L3f:
            return
    }

    static void c(javax.net.ssl.X509TrustManager r2, java.security.SecureRandom r3) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r1 = "sasf update socket factory trust manager"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            com.huawei.secure.android.common.ssl.g r0 = new com.huawei.secure.android.common.ssl.g     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            r1 = 0
            r0.<init>(r1, r2, r3)     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            com.huawei.secure.android.common.ssl.g.l = r0     // Catch: java.io.IOException -> L10 java.security.cert.CertificateException -> L18 java.security.KeyStoreException -> L20 java.security.UnrecoverableKeyException -> L28 java.security.KeyManagementException -> L30 java.security.NoSuchAlgorithmException -> L38
            return
        L10:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "IOException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            goto L3f
        L18:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "CertificateException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            goto L3f
        L20:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "KeyStoreException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            goto L3f
        L28:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "UnrecoverableKeyException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            goto L3f
        L30:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "KeyManagementException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            goto L3f
        L38:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r3 = "NoSuchAlgorithmException"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
        L3f:
            return
    }

    @java.lang.Deprecated
    public static com.huawei.secure.android.common.ssl.g f(java.security.KeyStore r3, android.content.Context r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            com.huawei.secure.android.common.ssl.util.c.b(r4)
            com.huawei.secure.android.common.ssl.g r0 = com.huawei.secure.android.common.ssl.g.l
            if (r0 != 0) goto L1d
            java.lang.Class<com.huawei.secure.android.common.ssl.g> r0 = com.huawei.secure.android.common.ssl.g.class
            monitor-enter(r0)
            com.huawei.secure.android.common.ssl.g r1 = com.huawei.secure.android.common.ssl.g.l     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.huawei.secure.android.common.ssl.g r1 = new com.huawei.secure.android.common.ssl.g     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L17
            com.huawei.secure.android.common.ssl.g.l = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1d:
            com.huawei.secure.android.common.ssl.g r3 = com.huawei.secure.android.common.ssl.g.l
            return r3
    }

    public static com.huawei.secure.android.common.ssl.g g(java.security.KeyStore r2, android.content.Context r3, java.security.SecureRandom r4) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException, java.io.IOException, java.lang.IllegalArgumentException {
            com.huawei.secure.android.common.ssl.util.c.b(r3)
            com.huawei.secure.android.common.ssl.g r0 = com.huawei.secure.android.common.ssl.g.l
            if (r0 != 0) goto L1c
            java.lang.Class<com.huawei.secure.android.common.ssl.g> r0 = com.huawei.secure.android.common.ssl.g.class
            monitor-enter(r0)
            com.huawei.secure.android.common.ssl.g r1 = com.huawei.secure.android.common.ssl.g.l     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            com.huawei.secure.android.common.ssl.g r1 = new com.huawei.secure.android.common.ssl.g     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L16
            com.huawei.secure.android.common.ssl.g.l = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        L1c:
            com.huawei.secure.android.common.ssl.g r2 = com.huawei.secure.android.common.ssl.g.l
            return r2
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public java.net.Socket createSocket() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r1 = "createSocket: "
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            javax.net.ssl.SSLContext r0 = r2.a
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            java.net.Socket r0 = r0.createSocket()
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocket
            if (r1 == 0) goto L29
            r2.a(r0)
            r1 = r0
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1
            r2.b = r1
            java.lang.String[] r1 = r1.getEnabledCipherSuites()
            java.lang.Object r1 = r1.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2.d = r1
        L29:
            return r0
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public java.net.Socket createSocket(java.net.Socket r3, java.lang.String r4, int r5, boolean r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.g.k
            java.lang.String r1 = "createSocket: socket host port autoClose"
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

    public java.lang.String[] d() {
            r1 = this;
            java.lang.String[] r0 = r1.f
            return r0
    }

    public java.security.cert.X509Certificate[] e() {
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

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.c
            return r0
    }

    public java.lang.String[] h() {
            r1 = this;
            java.lang.String[] r0 = r1.h
            return r0
    }

    public javax.net.ssl.SSLContext i() {
            r1 = this;
            javax.net.ssl.SSLContext r0 = r1.a
            return r0
    }

    public javax.net.ssl.SSLSocket j() {
            r1 = this;
            javax.net.ssl.SSLSocket r0 = r1.b
            return r0
    }

    public java.lang.String[] k() {
            r1 = this;
            java.lang.String[] r0 = r1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    public java.lang.String[] l() {
            r1 = this;
            java.lang.String[] r0 = r1.g
            return r0
    }

    public javax.net.ssl.X509TrustManager m() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.e
            return r0
    }

    public void n(java.lang.String[] r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void o(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
            return
    }

    public void p(java.lang.String[] r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void q(javax.net.ssl.SSLContext r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void r(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void s(java.lang.String[] r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void t(javax.net.ssl.X509TrustManager r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
