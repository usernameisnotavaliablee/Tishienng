package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m extends java.lang.Thread {
    private static final java.lang.String i = "m";
    private javax.net.ssl.SSLSocketFactory a;
    private javax.net.ssl.HostnameVerifier b;
    private org.apache.http.conn.ssl.SSLSocketFactory c;
    private org.apache.http.conn.ssl.X509HostnameVerifier d;
    private android.webkit.SslErrorHandler e;
    private java.lang.String f;
    private com.huawei.secure.android.common.ssl.m.a g;
    private android.content.Context h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(android.content.Context r1, java.lang.String r2);

        void b(android.content.Context r1, java.lang.String r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements okhttp3.Callback {
        final /* synthetic */ com.huawei.secure.android.common.ssl.m.a a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ android.webkit.SslErrorHandler d;

        b(com.huawei.secure.android.common.ssl.m.a r1, android.content.Context r2, java.lang.String r3, android.webkit.SslErrorHandler r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        public void onFailure(okhttp3.Call r3, java.io.IOException r4) {
                r2 = this;
                java.lang.String r3 = com.huawei.secure.android.common.ssl.m.a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFailure , IO Exception : "
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                com.huawei.secure.android.common.ssl.util.h.d(r3, r4)
                com.huawei.secure.android.common.ssl.m$a r3 = r2.a
                if (r3 == 0) goto L28
                android.content.Context r4 = r2.b
                java.lang.String r0 = r2.c
                r3.a(r4, r0)
                return
            L28:
                android.webkit.SslErrorHandler r3 = r2.d
                r3.cancel()
                return
        }

        public void onResponse(okhttp3.Call r2, okhttp3.Response r3) throws java.io.IOException {
                r1 = this;
                java.lang.String r2 = com.huawei.secure.android.common.ssl.m.a()
                java.lang.String r3 = "onResponse . proceed"
                com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
                com.huawei.secure.android.common.ssl.m$a r2 = r1.a
                if (r2 == 0) goto L15
                android.content.Context r3 = r1.b
                java.lang.String r0 = r1.c
                r2.b(r3, r0)
                return
            L15:
                android.webkit.SslErrorHandler r2 = r1.d
                r2.proceed()
                return
        }
    }

    static {
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public m(android.webkit.SslErrorHandler r2, java.lang.String r3, android.content.Context r4) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.KeyManagementException, java.security.KeyStoreException, java.lang.IllegalAccessException {
            r1 = this;
            r1.<init>()
            r1.r(r2)
            r1.t(r3)
            r1.p(r4)
            com.huawei.secure.android.common.ssl.i r2 = new com.huawei.secure.android.common.ssl.i
            com.huawei.secure.android.common.ssl.o r3 = new com.huawei.secure.android.common.ssl.o
            r3.<init>(r4)
            r2.<init>(r3)
            r1.s(r2)
            e2.b r2 = new e2.b
            r2.<init>()
            r1.q(r2)
            com.huawei.secure.android.common.ssl.g r2 = new com.huawei.secure.android.common.ssl.g     // Catch: java.security.UnrecoverableKeyException -> L30
            com.huawei.secure.android.common.ssl.o r3 = new com.huawei.secure.android.common.ssl.o     // Catch: java.security.UnrecoverableKeyException -> L30
            r3.<init>(r4)     // Catch: java.security.UnrecoverableKeyException -> L30
            r4 = 0
            r2.<init>(r4, r3)     // Catch: java.security.UnrecoverableKeyException -> L30
            r1.n(r2)     // Catch: java.security.UnrecoverableKeyException -> L30
            goto L4b
        L30:
            r2 = move-exception
            java.lang.String r3 = com.huawei.secure.android.common.ssl.m.i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "WebViewSSLCheckThread: UnrecoverableKeyException : "
            r4.append(r0)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r3, r2)
        L4b:
            org.apache.http.conn.ssl.X509HostnameVerifier r2 = com.huawei.secure.android.common.ssl.g.j
            r1.m(r2)
            return
    }

    @java.lang.Deprecated
    public m(android.webkit.SslErrorHandler r1, java.lang.String r2, javax.net.ssl.SSLSocketFactory r3, javax.net.ssl.HostnameVerifier r4) {
            r0 = this;
            r0.<init>()
            r0.r(r1)
            r0.t(r2)
            r0.s(r3)
            r0.q(r4)
            return
    }

    @java.lang.Deprecated
    public m(android.webkit.SslErrorHandler r1, java.lang.String r2, org.apache.http.conn.ssl.SSLSocketFactory r3, org.apache.http.conn.ssl.X509HostnameVerifier r4) {
            r0 = this;
            r0.<init>()
            r0.r(r1)
            r0.t(r2)
            r0.n(r3)
            r0.m(r4)
            return
    }

    @java.lang.Deprecated
    public m(android.webkit.SslErrorHandler r1, java.lang.String r2, org.apache.http.conn.ssl.SSLSocketFactory r3, org.apache.http.conn.ssl.X509HostnameVerifier r4, com.huawei.secure.android.common.ssl.m.a r5, android.content.Context r6) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.f = r2
            r0.c = r3
            r0.d = r4
            r0.g = r5
            r0.h = r6
            return
    }

    static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.huawei.secure.android.common.ssl.m.i
            return r0
    }

    private void b() {
            r3 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.m.i
            java.lang.String r1 = "callbackCancel: "
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            com.huawei.secure.android.common.ssl.m$a r1 = r3.g
            if (r1 == 0) goto L13
            android.content.Context r0 = r3.h
            java.lang.String r2 = r3.f
            r1.a(r0, r2)
            return
        L13:
            android.webkit.SslErrorHandler r1 = r3.e
            if (r1 == 0) goto L21
            java.lang.String r1 = "callbackCancel 2: "
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            android.webkit.SslErrorHandler r0 = r3.e
            r0.cancel()
        L21:
            return
    }

    private void c() {
            r3 = this;
            java.lang.String r0 = com.huawei.secure.android.common.ssl.m.i
            java.lang.String r1 = "callbackProceed: "
            com.huawei.secure.android.common.ssl.util.h.e(r0, r1)
            com.huawei.secure.android.common.ssl.m$a r0 = r3.g
            if (r0 == 0) goto L13
            android.content.Context r1 = r3.h
            java.lang.String r2 = r3.f
            r0.b(r1, r2)
            return
        L13:
            android.webkit.SslErrorHandler r0 = r3.e
            if (r0 == 0) goto L1a
            r0.proceed()
        L1a:
            return
    }

    public static void d(android.webkit.SslErrorHandler r1, java.lang.String r2, android.content.Context r3) {
            r0 = 0
            e(r1, r2, r3, r0)
            return
    }

    public static void e(android.webkit.SslErrorHandler r3, java.lang.String r4, android.content.Context r5, com.huawei.secure.android.common.ssl.m.a r6) {
            if (r3 == 0) goto L6a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L6a
            if (r5 != 0) goto Lb
            goto L6a
        Lb:
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            com.huawei.secure.android.common.ssl.i r1 = new com.huawei.secure.android.common.ssl.i     // Catch: java.lang.Exception -> L4b
            com.huawei.secure.android.common.ssl.o r2 = new com.huawei.secure.android.common.ssl.o     // Catch: java.lang.Exception -> L4b
            r2.<init>(r5)     // Catch: java.lang.Exception -> L4b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L4b
            r1.l(r5)     // Catch: java.lang.Exception -> L4b
            com.huawei.secure.android.common.ssl.o r2 = new com.huawei.secure.android.common.ssl.o     // Catch: java.lang.Exception -> L4b
            r2.<init>(r5)     // Catch: java.lang.Exception -> L4b
            r0.sslSocketFactory(r1, r2)     // Catch: java.lang.Exception -> L4b
            e2.b r1 = new e2.b     // Catch: java.lang.Exception -> L4b
            r1.<init>()     // Catch: java.lang.Exception -> L4b
            r0.hostnameVerifier(r1)     // Catch: java.lang.Exception -> L4b
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.lang.Exception -> L4b
            r1.<init>()     // Catch: java.lang.Exception -> L4b
            okhttp3.Request$Builder r1 = r1.url(r4)     // Catch: java.lang.Exception -> L4b
            okhttp3.Request r1 = r1.build()     // Catch: java.lang.Exception -> L4b
            okhttp3.OkHttpClient r0 = r0.build()     // Catch: java.lang.Exception -> L4b
            okhttp3.Call r0 = r0.newCall(r1)     // Catch: java.lang.Exception -> L4b
            com.huawei.secure.android.common.ssl.m$b r1 = new com.huawei.secure.android.common.ssl.m$b     // Catch: java.lang.Exception -> L4b
            r1.<init>(r6, r5, r4, r3)     // Catch: java.lang.Exception -> L4b
            r0.enqueue(r1)     // Catch: java.lang.Exception -> L4b
            return
        L4b:
            r4 = move-exception
            java.lang.String r5 = com.huawei.secure.android.common.ssl.m.i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "checkServerCertificateWithOK: exception : "
            r6.append(r0)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r5, r4)
            r3.cancel()
            return
        L6a:
            java.lang.String r3 = com.huawei.secure.android.common.ssl.m.i
            java.lang.String r4 = "checkServerCertificateWithOK: handler or url or context is null"
            com.huawei.secure.android.common.ssl.util.h.d(r3, r4)
            return
    }

    public org.apache.http.conn.ssl.X509HostnameVerifier f() {
            r1 = this;
            org.apache.http.conn.ssl.X509HostnameVerifier r0 = r1.d
            return r0
    }

    public org.apache.http.conn.ssl.SSLSocketFactory g() {
            r1 = this;
            org.apache.http.conn.ssl.SSLSocketFactory r0 = r1.c
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.h
            return r0
    }

    public com.huawei.secure.android.common.ssl.m.a h() {
            r1 = this;
            com.huawei.secure.android.common.ssl.m$a r0 = r1.g
            return r0
    }

    public javax.net.ssl.HostnameVerifier i() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.b
            return r0
    }

    public android.webkit.SslErrorHandler j() {
            r1 = this;
            android.webkit.SslErrorHandler r0 = r1.e
            return r0
    }

    public javax.net.ssl.SSLSocketFactory k() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.a
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public void m(org.apache.http.conn.ssl.X509HostnameVerifier r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void n(org.apache.http.conn.ssl.SSLSocketFactory r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void o(com.huawei.secure.android.common.ssl.m.a r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void p(android.content.Context r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void q(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void r(android.webkit.SslErrorHandler r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r8 = this;
            super.run()
            org.apache.http.conn.ssl.SSLSocketFactory r0 = r8.c
            r1 = 0
            if (r0 == 0) goto Ld6
            org.apache.http.conn.ssl.X509HostnameVerifier r0 = r8.d
            if (r0 == 0) goto Ld6
            android.webkit.SslErrorHandler r0 = r8.e
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r8.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            goto Lcb
        L1a:
            org.apache.http.conn.ssl.SSLSocketFactory r0 = r8.c     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.conn.ssl.X509HostnameVerifier r2 = r8.d     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r0.setHostnameVerifier(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.conn.ssl.SSLSocketFactory r0 = r8.c     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            boolean r2 = r0 instanceof com.huawei.secure.android.common.ssl.g     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            if (r2 == 0) goto L34
            com.huawei.secure.android.common.ssl.g r0 = (com.huawei.secure.android.common.ssl.g) r0     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            android.content.Context r2 = r8.h     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r0.o(r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            goto L34
        L2f:
            r0 = move-exception
            goto Lc7
        L32:
            r0 = move-exception
            goto La6
        L34:
            org.apache.http.params.BasicHttpParams r0 = new org.apache.http.params.BasicHttpParams     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r0, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r0, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.conn.scheme.SchemeRegistry r2 = new org.apache.http.conn.scheme.SchemeRegistry     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.conn.scheme.Scheme r3 = new org.apache.http.conn.scheme.Scheme     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r4 = "https"
            org.apache.http.conn.ssl.SSLSocketFactory r5 = r8.c     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r6 = 443(0x1bb, float:6.21E-43)
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.register(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.conn.scheme.Scheme r3 = new org.apache.http.conn.scheme.Scheme     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r4 = "http"
            org.apache.http.conn.scheme.PlainSocketFactory r5 = org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r6 = 80
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.register(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager r3 = new org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.impl.client.DefaultHttpClient r2 = new org.apache.http.impl.client.DefaultHttpClient     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.net.URI r3 = new java.net.URI     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r4 = r8.f     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r0.setURI(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.HttpResponse r0 = r2.execute(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r2 = com.huawei.secure.android.common.ssl.m.i     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r4 = "status code is : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            org.apache.http.StatusLine r0 = r0.getStatusLine()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            int r0 = r0.getStatusCode()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r3.append(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            com.huawei.secure.android.common.ssl.util.g.i(r1)
            r8.c()
            return
        La6:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.m.i     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "run: exception : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L2f
            r3.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            com.huawei.secure.android.common.ssl.util.h.d(r2, r0)     // Catch: java.lang.Throwable -> L2f
            r8.b()     // Catch: java.lang.Throwable -> L2f
            com.huawei.secure.android.common.ssl.util.g.i(r1)
            return
        Lc7:
            com.huawei.secure.android.common.ssl.util.g.i(r1)
            throw r0
        Lcb:
            java.lang.String r0 = com.huawei.secure.android.common.ssl.m.i
            java.lang.String r1 = "sslErrorHandler or url is null"
            com.huawei.secure.android.common.ssl.util.h.d(r0, r1)
            r8.b()
            return
        Ld6:
            javax.net.ssl.SSLSocketFactory r0 = r8.a
            if (r0 == 0) goto L14d
            javax.net.ssl.HostnameVerifier r0 = r8.b
            if (r0 == 0) goto L14d
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            java.lang.String r2 = r8.f     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            boolean r2 = r0 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            if (r2 == 0) goto L11b
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> L111 java.lang.Exception -> L116
            javax.net.ssl.SSLSocketFactory r1 = r8.a     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r0.setSSLSocketFactory(r1)     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            javax.net.ssl.HostnameVerifier r1 = r8.b     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r0.setHostnameVerifier(r1)     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r0.connect()     // Catch: java.lang.Throwable -> L10d java.lang.Exception -> L10f
            r1 = r0
            goto L11b
        L10d:
            r1 = move-exception
            goto L147
        L10f:
            r1 = move-exception
            goto L124
        L111:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L147
        L116:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L124
        L11b:
            if (r1 == 0) goto L120
            r1.disconnect()
        L120:
            r8.c()
            return
        L124:
            java.lang.String r2 = com.huawei.secure.android.common.ssl.m.i     // Catch: java.lang.Throwable -> L10d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10d
            r3.<init>()     // Catch: java.lang.Throwable -> L10d
            java.lang.String r4 = "exception : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L10d
            r3.append(r1)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L10d
            com.huawei.secure.android.common.ssl.util.h.d(r2, r1)     // Catch: java.lang.Throwable -> L10d
            r8.b()     // Catch: java.lang.Throwable -> L10d
            if (r0 == 0) goto L146
            r0.disconnect()
        L146:
            return
        L147:
            if (r0 == 0) goto L14c
            r0.disconnect()
        L14c:
            throw r1
        L14d:
            r8.b()
            return
    }

    public void s(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void t(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }
}
