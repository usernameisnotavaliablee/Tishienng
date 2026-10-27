package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m {
    android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    byte[] f5927b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5928c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5929d;

    /* renamed from: e, reason: collision with root package name */
    private int f5930e;

    /* renamed from: f, reason: collision with root package name */
    private int f5931f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5932g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements javax.net.ssl.X509TrustManager {
        final /* synthetic */ com.baidu.liantian.b.m a;

        /* renamed from: b, reason: collision with root package name */
        private javax.net.ssl.X509TrustManager f5933b;

        a(com.baidu.liantian.b.m r1, javax.net.ssl.X509TrustManager r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f5933b = r2
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) {
                r1 = this;
                com.baidu.liantian.b.a()
                javax.net.ssl.X509TrustManager r0 = r1.f5933b
                r0.checkClientTrusted(r2, r3)
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(java.security.cert.X509Certificate[] r3, java.lang.String r4) {
                r2 = this;
                com.baidu.liantian.b.a()
                javax.net.ssl.X509TrustManager r0 = r2.f5933b     // Catch: java.lang.Throwable -> Lc
                r0.checkServerTrusted(r3, r4)     // Catch: java.lang.Throwable -> Lc
                com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r3 = move-exception
                com.baidu.liantian.b.e.a()
                r4 = r3
            L11:
                if (r4 == 0) goto L45
                boolean r0 = r4 instanceof java.security.cert.CertificateExpiredException
                if (r0 != 0) goto L21
                boolean r0 = r4 instanceof java.security.cert.CertificateNotYetValidException
                if (r0 == 0) goto L1c
                goto L21
            L1c:
                java.lang.Throwable r4 = r4.getCause()
                goto L11
            L21:
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                java.lang.String r0 = "0"
                r3.put(r0, r4)
                com.baidu.liantian.b.m r4 = r2.a
                android.content.Context r4 = r4.a
                android.content.Context r4 = r4.getApplicationContext()
                android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
                java.lang.String r0 = "1003121"
                com.baidu.liantian.b.e.a(r4, r0, r3)
                return
            L45:
                boolean r4 = r3 instanceof java.security.cert.CertificateException
                if (r4 == 0) goto L4c
                java.security.cert.CertificateException r3 = (java.security.cert.CertificateException) r3
                throw r3
            L4c:
                java.security.cert.CertificateException r3 = new java.security.cert.CertificateException
                r3.<init>()
                throw r3
        }

        @Override // javax.net.ssl.X509TrustManager
        public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                com.baidu.liantian.b.a()
                javax.net.ssl.X509TrustManager r0 = r1.f5933b
                java.security.cert.X509Certificate[] r0 = r0.getAcceptedIssuers()
                return r0
        }
    }

    public m(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f5927b = r0
            r0 = 120000(0x1d4c0, float:1.68156E-40)
            r1.f5930e = r0
            r1.f5931f = r0
            r0 = 0
            r1.f5932g = r0
            r1.a = r2
            return
    }

    public m(android.content.Context r1, byte r2) {
            r0 = this;
            r0.<init>()
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]
            r0.f5927b = r2
            r2 = 120000(0x1d4c0, float:1.68156E-40)
            r0.f5930e = r2
            r0.f5931f = r2
            r2 = 0
            r0.f5932g = r2
            r0.a = r1
            return
    }

    private java.io.InputStream a(java.net.HttpURLConnection r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            boolean r0 = com.baidu.liantian.b.e.f(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r4 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r0 = "gzip"
            java.lang.String r2 = r4.getContentEncoding()     // Catch: java.io.IOException -> L25
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> L25
            if (r0 == 0) goto L1d
            r0 = 1
            r3.f5932g = r0     // Catch: java.io.IOException -> L25
            goto L20
        L1d:
            r0 = 0
            r3.f5932g = r0     // Catch: java.io.IOException -> L25
        L20:
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.io.IOException -> L25
            return r4
        L25:
            com.baidu.liantian.b.e.a()
            return r1
    }

    private java.io.InputStream a(byte[] r8, java.net.HttpURLConnection r9) {
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 1
            java.lang.String r3 = "gzip"
            r4 = 200(0xc8, float:2.8E-43)
            if (r8 != 0) goto L3a
            int r8 = r9.getResponseCode()     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            if (r8 != r4) goto L30
            java.lang.String r8 = r9.getContentEncoding()     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            if (r4 != 0) goto L29
            boolean r8 = r3.equalsIgnoreCase(r8)     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            if (r8 == 0) goto L29
            r7.f5932g = r2     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            goto L2b
        L25:
            r8 = move-exception
            goto L82
        L27:
            r8 = move-exception
            goto L83
        L29:
            r7.f5932g = r1     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
        L2b:
            java.io.InputStream r8 = r9.getInputStream()     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            return r8
        L30:
            android.accounts.NetworkErrorException r9 = new android.accounts.NetworkErrorException     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            r9.<init>(r8)     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            throw r9     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
        L3a:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            java.io.OutputStream r6 = r9.getOutputStream()     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            r5.<init>(r6)     // Catch: android.accounts.NetworkErrorException -> L25 java.io.IOException -> L27 java.lang.Throwable -> L77
            r5.write(r8)     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            r5.flush()     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            int r8 = r9.getResponseCode()     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            if (r8 != r4) goto L6c
            java.lang.String r8 = r9.getContentEncoding()     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            boolean r8 = r3.equalsIgnoreCase(r8)     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            if (r8 == 0) goto L62
            r7.f5932g = r2     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            goto L64
        L5c:
            r8 = move-exception
            r0 = r5
            goto L82
        L5f:
            r8 = move-exception
            r0 = r5
            goto L83
        L62:
            r7.f5932g = r1     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
        L64:
            java.io.InputStream r8 = r9.getInputStream()     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            r5.close()     // Catch: java.lang.Throwable -> L6b
        L6b:
            return r8
        L6c:
            android.accounts.NetworkErrorException r9 = new android.accounts.NetworkErrorException     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            r9.<init>(r8)     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
            throw r9     // Catch: android.accounts.NetworkErrorException -> L5c java.io.IOException -> L5f java.lang.Throwable -> L76
        L76:
            r0 = r5
        L77:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L80
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L80
            r8.<init>()     // Catch: java.lang.Throwable -> L80
            throw r8     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            goto L84
        L82:
            throw r8     // Catch: java.lang.Throwable -> L80
        L83:
            throw r8     // Catch: java.lang.Throwable -> L80
        L84:
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.lang.Throwable -> L89
        L89:
            throw r8
    }

    private java.lang.String a(java.io.InputStream r3) {
            r2 = this;
            if (r3 == 0) goto L46
            byte[] r3 = b(r3)     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L35
            boolean r0 = r2.f5932g     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L27
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3d
            com.baidu.liantian.b.j.b(r0, r3)     // Catch: java.lang.Throwable -> L3d
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L3d
            r3.flush()     // Catch: java.lang.Throwable -> L3d
            r3.close()     // Catch: java.lang.Throwable -> L3d
            r0.close()     // Catch: java.lang.Throwable -> L3d
            r3 = r1
        L27:
            if (r3 == 0) goto L2f
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            return r0
        L2f:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L35:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "responseBytes"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L3d:
            com.baidu.liantian.b.e.a()
            java.io.IOException r3 = new java.io.IOException
            r3.<init>()
            throw r3
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "InputStream"
            r3.<init>(r0)
            throw r3
    }

    private java.net.HttpURLConnection a() {
            r11 = this;
            java.lang.String r0 = r11.f5928c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1bc
            java.lang.String r0 = r11.f5929d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1bc
            java.lang.String r0 = r11.f5928c
            java.lang.String r1 = "POST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            java.lang.String r0 = r11.f5928c
            java.lang.String r2 = "GET"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L26
            r11.f5928c = r1
        L26:
            java.net.URL r0 = new java.net.URL
            java.lang.String r2 = r11.f5929d
            r0.<init>(r2)
            android.content.Context r2 = r11.a
            boolean r2 = com.baidu.liantian.b.e.e(r2)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L5a
            java.util.Properties r2 = java.lang.System.getProperties()
            java.lang.String r5 = "http.proxyHost"
            java.lang.String r2 = r2.getProperty(r5)
            java.util.Properties r5 = java.lang.System.getProperties()
            java.lang.String r6 = "http.proxyPort"
            java.lang.String r5 = r5.getProperty(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r7 = -1
            if (r6 == 0) goto L53
            goto L5c
        L53:
            int r7 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            goto L5c
        L5a:
            r2 = r4
            r7 = 0
        L5c:
            if (r2 == 0) goto L72
            if (r7 <= 0) goto L72
            java.net.InetSocketAddress r2 = java.net.InetSocketAddress.createUnresolved(r2, r7)
            java.net.Proxy r5 = new java.net.Proxy
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP
            r5.<init>(r6, r2)
            java.net.URLConnection r0 = r0.openConnection(r5)
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            goto L78
        L72:
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
        L78:
            boolean r2 = r0 instanceof javax.net.ssl.HttpsURLConnection
            r5 = 1
            if (r2 == 0) goto L113
            r2 = r0
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            java.lang.String r6 = "AndroidCAStore"
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r6)     // Catch: java.lang.Throwable -> L8a
            r6.load(r4, r4)     // Catch: java.lang.Throwable -> L8b
            goto Lb9
        L8a:
            r6 = r4
        L8b:
            java.lang.String r7 = "javax.net.ssl.trustStore"
            java.lang.String r7 = java.lang.System.getProperty(r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "javax.net.ssl.trustStorePassword"
            java.lang.String r8 = java.lang.System.getProperty(r8)     // Catch: java.lang.Throwable -> Lb8
            if (r8 != 0) goto L9b
            r8 = r4
            goto L9f
        L9b:
            char[] r8 = r8.toCharArray()     // Catch: java.lang.Throwable -> Lb8
        L9f:
            java.lang.String r9 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Throwable -> Lb8
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r9)     // Catch: java.lang.Throwable -> Lb8
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb8
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb8
            r10.<init>(r7)     // Catch: java.lang.Throwable -> Lb8
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lb8
            r6.load(r9, r8)     // Catch: java.lang.Throwable -> Lb8
            r9.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lb9
        Lb8:
        Lb9:
            if (r6 == 0) goto Le9
            java.lang.String r7 = "com.android.org.conscrypt.TrustManagerImpl"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L110
            r7 = r4
        Lc6:
            if (r7 != 0) goto Ld2
            java.lang.String r8 = "org.apache.harmony.xnet.provider.jsse.TrustManagerImpl"
            java.lang.Class r7 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> Lcf
            goto Ld2
        Lcf:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L110
        Ld2:
            if (r7 == 0) goto Le9
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L110
            java.lang.Class<java.security.KeyStore> r9 = java.security.KeyStore.class
            r8[r3] = r9     // Catch: java.lang.Throwable -> L110
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r8)     // Catch: java.lang.Throwable -> L110
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L110
            r8[r3] = r6     // Catch: java.lang.Throwable -> L110
            java.lang.Object r6 = r7.newInstance(r8)     // Catch: java.lang.Throwable -> L110
            javax.net.ssl.X509TrustManager r6 = (javax.net.ssl.X509TrustManager) r6     // Catch: java.lang.Throwable -> L110
            goto Lea
        Le9:
            r6 = r4
        Lea:
            if (r6 == 0) goto L113
            java.lang.String r7 = "TLS"
            javax.net.ssl.SSLContext r7 = javax.net.ssl.SSLContext.getInstance(r7)     // Catch: java.lang.Throwable -> L110
            com.baidu.liantian.b.m$a r8 = new com.baidu.liantian.b.m$a     // Catch: java.lang.Throwable -> L110
            r8.<init>(r11, r6)     // Catch: java.lang.Throwable -> L110
            javax.net.ssl.TrustManager[] r6 = new javax.net.ssl.TrustManager[r5]     // Catch: java.lang.Throwable -> L110
            r6[r3] = r8     // Catch: java.lang.Throwable -> L110
            java.security.SecureRandom r8 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L110
            r8.<init>()     // Catch: java.lang.Throwable -> L110
            r7.init(r4, r6, r8)     // Catch: java.lang.Throwable -> L110
            org.apache.http.conn.ssl.X509HostnameVerifier r4 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch: java.lang.Throwable -> L110
            r2.setHostnameVerifier(r4)     // Catch: java.lang.Throwable -> L110
            javax.net.ssl.SSLSocketFactory r4 = r7.getSocketFactory()     // Catch: java.lang.Throwable -> L110
            r2.setSSLSocketFactory(r4)     // Catch: java.lang.Throwable -> L110
            goto L113
        L110:
            com.baidu.liantian.b.e.a()
        L113:
            java.lang.String r2 = r11.f5928c
            r0.setRequestMethod(r2)
            r0.setDoInput(r5)
            java.lang.String r2 = r11.f5928c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L126
            r0.setDoOutput(r5)
        L126:
            r0.setInstanceFollowRedirects(r5)
            int r1 = r11.f5930e
            r0.setConnectTimeout(r1)
            int r1 = r11.f5931f
            r0.setReadTimeout(r1)
            android.content.Context r1 = r11.a
            java.lang.String[] r1 = com.baidu.liantian.b.e.g(r1)
            r1 = r1[r3]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "liantian"
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            r2.append(r1)
            r2.append(r3)
            android.content.Context r1 = r11.a
            java.lang.String r1 = com.baidu.liantian.b.t.a(r1)
            r2.append(r1)
            java.lang.String r1 = "/3.1.6.7"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "User-Agent"
            r0.setRequestProperty(r2, r1)
            java.lang.String r1 = "Pragma"
            java.lang.String r2 = "no-cache"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            java.lang.String r2 = "*/*"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip,deflate"
            r0.setRequestProperty(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getCountry()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Accept-Language"
            r0.setRequestProperty(r2, r1)
            android.content.Context r1 = r11.a
            java.lang.String r1 = com.baidu.liantian.b.g.a(r1)
            java.lang.String r1 = com.baidu.liantian.b.o.a(r1)
            java.lang.String r2 = "x-device-id"
            r0.setRequestProperty(r2, r1)
            return r0
        L1bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    private void a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.f5928c = r1
            r0.f5929d = r2
            return
    }

    private boolean a(java.io.InputStream r5, java.io.File r6) {
            r4 = this;
            boolean r0 = r4.f5932g
            if (r0 == 0) goto Le
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> Lb
            r0.<init>(r5)     // Catch: java.io.IOException -> Lb
            r5 = r0
            goto Le
        Lb:
            com.baidu.liantian.b.e.a()
        Le:
            r0 = 0
            if (r5 != 0) goto L12
            return r0
        L12:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L37
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L37
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L38
        L20:
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> L38
            r3 = -1
            if (r2 == r3) goto L2e
            r1.write(r6, r0, r2)     // Catch: java.lang.Throwable -> L38
            r1.flush()     // Catch: java.lang.Throwable -> L38
            goto L20
        L2e:
            r1.close()     // Catch: java.io.IOException -> L32
            goto L35
        L32:
            com.baidu.liantian.b.e.a()
        L35:
            r5 = 1
            return r5
        L37:
            r1 = 0
        L38:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L44
            r1.close()     // Catch: java.io.IOException -> L41
            goto L44
        L41:
            com.baidu.liantian.b.e.a()
        L44:
            return r0
        L45:
            r5 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.io.IOException -> L4c
            goto L4f
        L4c:
            com.baidu.liantian.b.e.a()
        L4f:
            throw r5
    }

    private static byte[] b(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            r0.close()
            return r4
    }

    public final java.lang.String a(java.lang.String r3) {
            r2 = this;
            com.baidu.liantian.b.s.a()
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            java.lang.String r1 = "GET"
            r2.a(r1, r3)     // Catch: java.lang.Throwable -> L2b
            java.net.HttpURLConnection r3 = r2.a()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r0 = r2.a(r0, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.a(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L20
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L38
        L20:
            if (r3 == 0) goto L25
            r3.disconnect()     // Catch: java.lang.Throwable -> L1e
        L25:
            com.baidu.liantian.b.s.b()
            return r1
        L29:
            r1 = move-exception
            goto L2d
        L2b:
            r1 = move-exception
            r3 = r0
        L2d:
            if (r0 == 0) goto L32
            r0.close()     // Catch: java.lang.Throwable -> L1e
        L32:
            if (r3 == 0) goto L37
            r3.disconnect()     // Catch: java.lang.Throwable -> L1e
        L37:
            throw r1     // Catch: java.lang.Throwable -> L1e
        L38:
            com.baidu.liantian.b.s.b()
            throw r3
    }

    public final java.lang.String a(java.lang.String r2, byte[] r3) {
            r1 = this;
            com.baidu.liantian.b.s.a()
            java.lang.String r0 = "POST"
            r1.a(r0, r2)     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            java.net.HttpURLConnection r0 = r1.a()     // Catch: java.lang.Throwable -> L28
            java.io.InputStream r2 = r1.a(r3, r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r1.a(r2)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L1d
            r2.close()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L35
        L1d:
            if (r0 == 0) goto L22
            r0.disconnect()     // Catch: java.lang.Throwable -> L1b
        L22:
            com.baidu.liantian.b.s.b()
            return r3
        L26:
            r3 = move-exception
            goto L2a
        L28:
            r3 = move-exception
            r0 = r2
        L2a:
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.lang.Throwable -> L1b
        L2f:
            if (r0 == 0) goto L34
            r0.disconnect()     // Catch: java.lang.Throwable -> L1b
        L34:
            throw r3     // Catch: java.lang.Throwable -> L1b
        L35:
            com.baidu.liantian.b.s.b()
            throw r2
    }

    public final boolean a(java.lang.String r4, java.io.File r5) {
            r3 = this;
            com.baidu.liantian.b.s.a()
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L47
            android.content.Context r0 = r3.a     // Catch: java.lang.Throwable -> L47
            boolean r0 = com.baidu.liantian.b.e.f(r0)     // Catch: java.lang.Throwable -> L47
            r1 = 0
            if (r0 != 0) goto L13
            com.baidu.liantian.b.s.b()
            return r1
        L13:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L1d
            com.baidu.liantian.b.s.b()
            return r1
        L1d:
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L47
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L47
            r0 = 0
            java.lang.String r2 = "GET"
            r3.a(r2, r4)     // Catch: java.lang.Throwable -> L4d
            java.net.HttpURLConnection r4 = r3.a()     // Catch: java.lang.Throwable -> L4d
            java.io.InputStream r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r3.a(r0, r5)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.lang.Throwable -> L40
        L3a:
            if (r4 == 0) goto L49
            r4.disconnect()     // Catch: java.lang.Throwable -> L40
            goto L49
        L40:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L47
            com.baidu.liantian.b.s.b()
            return r1
        L47:
            r4 = move-exception
            goto L7b
        L49:
            com.baidu.liantian.b.s.b()
            return r5
        L4d:
            r4 = r0
        L4e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L56
            r0.close()     // Catch: java.lang.Throwable -> L5c
        L56:
            if (r4 == 0) goto L63
            r4.disconnect()     // Catch: java.lang.Throwable -> L5c
            goto L63
        L5c:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L47
            com.baidu.liantian.b.s.b()
            return r1
        L63:
            com.baidu.liantian.b.s.b()
            return r1
        L67:
            r5 = move-exception
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.lang.Throwable -> L73
        L6d:
            if (r4 == 0) goto L7a
            r4.disconnect()     // Catch: java.lang.Throwable -> L73
            goto L7a
        L73:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L47
            com.baidu.liantian.b.s.b()
            return r1
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L47
        L7b:
            com.baidu.liantian.b.s.b()
            throw r4
    }
}
