package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h extends javax.net.ssl.SSLSocketFactory {

    @java.lang.Deprecated
    public static final org.apache.http.conn.ssl.X509HostnameVerifier i = null;

    @java.lang.Deprecated
    public static final org.apache.http.conn.ssl.X509HostnameVerifier j = null;
    private static final java.lang.String k = null;
    private static volatile com.huawei.secure.android.common.ssl.h l;
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
            com.huawei.secure.android.common.ssl.h.i = r0
            org.apache.http.conn.ssl.StrictHostnameVerifier r0 = new org.apache.http.conn.ssl.StrictHostnameVerifier
            r0.<init>()
            com.huawei.secure.android.common.ssl.h.j = r0
            java.lang.Class<com.huawei.secure.android.common.ssl.h> r0 = com.huawei.secure.android.common.ssl.h.class
            java.lang.String r0 = r0.getSimpleName()
            com.huawei.secure.android.common.ssl.h.k = r0
            r0 = 0
            com.huawei.secure.android.common.ssl.h.l = r0
            return
    }

    private h(android.content.Context r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException, java.security.KeyManagementException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            if (r5 != 0) goto L12
            java.lang.String r5 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r6 = "SecureSSLSocketFactory: context is null"
            com.huawei.secure.android.common.ssl.util.h.d(r5, r6)
            return
        L12:
            r4.n(r5)
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.p(r1)
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
    public h(java.io.InputStream r4, java.lang.String r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            com.huawei.secure.android.common.ssl.a r1 = new com.huawei.secure.android.common.ssl.a
            r1.<init>(r4, r5)
            r3.r(r1)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r0)
            return
    }

    public h(java.io.InputStream r4, java.lang.String r5, java.security.SecureRandom r6) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r3.a = r1
            com.huawei.secure.android.common.ssl.a r1 = new com.huawei.secure.android.common.ssl.a
            r1.<init>(r4, r5)
            r3.r(r1)
            javax.net.ssl.SSLContext r4 = r3.a
            r5 = 1
            javax.net.ssl.X509TrustManager[] r5 = new javax.net.ssl.X509TrustManager[r5]
            r2 = 0
            r5[r2] = r1
            r4.init(r0, r5, r6)
            return
    }

    @java.lang.Deprecated
    public h(javax.net.ssl.X509TrustManager r5) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.a = r1
            r4.r(r5)
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r0)
            return
    }

    public h(javax.net.ssl.X509TrustManager r5, java.security.SecureRandom r6) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.a = r0
            r4.b = r0
            javax.net.ssl.SSLContext r1 = com.huawei.secure.android.common.ssl.f.i()
            r4.a = r1
            r4.r(r5)
            javax.net.ssl.SSLContext r1 = r4.a
            r2 = 1
            javax.net.ssl.X509TrustManager[] r2 = new javax.net.ssl.X509TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r1.init(r0, r2, r6)
            return
    }

    private void a(java.net.Socket r5) {
            r4 = this;
            java.lang.String[] r0 = r4.h
            boolean r0 = com.huawei.secure.android.common.ssl.util.d.a(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
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
            java.lang.String r2 = com.huawei.secure.android.common.ssl.h.k
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
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r2 = "set default protocols"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r2)
            r0 = r5
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            com.huawei.secure.android.common.ssl.f.g(r0)
        L5e:
            if (r1 != 0) goto L6c
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r1 = "set default cipher suites"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            javax.net.ssl.SSLSocket r5 = (javax.net.ssl.SSLSocket) r5
            com.huawei.secure.android.common.ssl.f.f(r5)
        L6c:
            return
    }

    @java.lang.Deprecated
    static void b(javax.net.ssl.X509TrustManager r5) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r1 = "ssf update socket factory trust manager"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.h r2 = new com.huawei.secure.android.common.ssl.h     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            r2.<init>(r5)     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            com.huawei.secure.android.common.ssl.h.l = r2     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            goto L22
        L13:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r2 = "KeyManagementException"
            com.huawei.secure.android.common.ssl.util.h.d(r5, r2)
            goto L22
        L1b:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r2 = "NoSuchAlgorithmException"
            com.huawei.secure.android.common.ssl.util.h.d(r5, r2)
        L22:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.h.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "update: cost : "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r2.append(r3)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r5, r0)
            return
    }

    static void c(javax.net.ssl.X509TrustManager r4, java.security.SecureRandom r5) {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r1 = "ssf update socket factory trust manager"
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.h r2 = new com.huawei.secure.android.common.ssl.h     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            r2.<init>(r4, r5)     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            com.huawei.secure.android.common.ssl.h.l = r2     // Catch: java.security.KeyManagementException -> L13 java.security.NoSuchAlgorithmException -> L1b
            goto L22
        L13:
            java.lang.String r4 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r5 = "KeyManagementException"
            com.huawei.secure.android.common.ssl.util.h.d(r4, r5)
            goto L22
        L1b:
            java.lang.String r4 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r5 = "NoSuchAlgorithmException"
            com.huawei.secure.android.common.ssl.util.h.d(r4, r5)
        L22:
            java.lang.String r4 = com.huawei.secure.android.common.ssl.h.k
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "update: cost : "
            r5.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r5.append(r2)
            java.lang.String r0 = " ms"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r4, r5)
            return
    }

    @java.lang.Deprecated
    public static com.huawei.secure.android.common.ssl.h f(android.content.Context r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.util.c.b(r5)
            com.huawei.secure.android.common.ssl.h r2 = com.huawei.secure.android.common.ssl.h.l
            if (r2 != 0) goto L21
            java.lang.Class<com.huawei.secure.android.common.ssl.h> r2 = com.huawei.secure.android.common.ssl.h.class
            monitor-enter(r2)
            com.huawei.secure.android.common.ssl.h r3 = com.huawei.secure.android.common.ssl.h.l     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L1d
            com.huawei.secure.android.common.ssl.h r3 = new com.huawei.secure.android.common.ssl.h     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L1b
            com.huawei.secure.android.common.ssl.h.l = r3     // Catch: java.lang.Throwable -> L1b
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
            com.huawei.secure.android.common.ssl.h r2 = com.huawei.secure.android.common.ssl.h.l
            android.content.Context r2 = r2.c
            if (r2 != 0) goto L2e
            if (r5 == 0) goto L2e
            com.huawei.secure.android.common.ssl.h r2 = com.huawei.secure.android.common.ssl.h.l
            r2.n(r5)
        L2e:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.h.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getInstance: cost : "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r2.append(r3)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.secure.android.common.ssl.util.h.b(r5, r0)
            com.huawei.secure.android.common.ssl.h r5 = com.huawei.secure.android.common.ssl.h.l
            return r5
    }

    public static com.huawei.secure.android.common.ssl.h g(android.content.Context r4, java.security.SecureRandom r5) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException, java.lang.IllegalAccessException, java.security.KeyManagementException, java.lang.IllegalArgumentException {
            long r0 = java.lang.System.currentTimeMillis()
            com.huawei.secure.android.common.ssl.util.c.b(r4)
            com.huawei.secure.android.common.ssl.h r2 = com.huawei.secure.android.common.ssl.h.l
            if (r2 != 0) goto L20
            java.lang.Class<com.huawei.secure.android.common.ssl.h> r2 = com.huawei.secure.android.common.ssl.h.class
            monitor-enter(r2)
            com.huawei.secure.android.common.ssl.h r3 = com.huawei.secure.android.common.ssl.h.l     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            com.huawei.secure.android.common.ssl.h r3 = new com.huawei.secure.android.common.ssl.h     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1a
            com.huawei.secure.android.common.ssl.h.l = r3     // Catch: java.lang.Throwable -> L1a
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
            com.huawei.secure.android.common.ssl.h r5 = com.huawei.secure.android.common.ssl.h.l
            android.content.Context r5 = r5.c
            if (r5 != 0) goto L2d
            if (r4 == 0) goto L2d
            com.huawei.secure.android.common.ssl.h r5 = com.huawei.secure.android.common.ssl.h.l
            r5.n(r4)
        L2d:
            java.lang.String r4 = com.huawei.secure.android.common.ssl.h.k
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
            com.huawei.secure.android.common.ssl.util.h.b(r4, r5)
            com.huawei.secure.android.common.ssl.h r4 = com.huawei.secure.android.common.ssl.h.l
            return r4
    }

    @Override // javax.net.SocketFactory
    public java.net.Socket createSocket(java.lang.String r3, int r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
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
            java.lang.String r0 = com.huawei.secure.android.common.ssl.h.k
            java.lang.String r1 = "createSocket s host port autoClose"
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
            java.lang.String[] r0 = r1.g
            return r0
    }

    public javax.net.ssl.X509TrustManager l() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.e
            return r0
    }

    public void m(java.lang.String[] r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void n(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.c = r1
            return
    }

    public void o(java.lang.String[] r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void p(javax.net.ssl.SSLContext r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void q(java.lang.String[] r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void r(javax.net.ssl.X509TrustManager r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
