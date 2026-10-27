package com.umeng.socialize.tracker.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static final java.lang.String a = "HttpClient";
    private java.lang.String b;
    private com.umeng.socialize.tracker.utils.b.a c;
    private java.util.Map<java.lang.String, java.lang.String> d;
    private com.umeng.socialize.tracker.utils.HttpRequestListener e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.umeng.socialize.tracker.utils.b.a> {
        public static final com.umeng.socialize.tracker.utils.b.a a = null;
        public static final com.umeng.socialize.tracker.utils.b.a b = null;
        private static final /* synthetic */ com.umeng.socialize.tracker.utils.b.a[] c = null;

        static {
                com.umeng.socialize.tracker.utils.b$a r0 = new com.umeng.socialize.tracker.utils.b$a
                java.lang.String r1 = "POST"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.socialize.tracker.utils.b.a.a = r0
                com.umeng.socialize.tracker.utils.b$a r1 = new com.umeng.socialize.tracker.utils.b$a
                java.lang.String r3 = "GET"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.socialize.tracker.utils.b.a.b = r1
                r3 = 2
                com.umeng.socialize.tracker.utils.b$a[] r3 = new com.umeng.socialize.tracker.utils.b.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.socialize.tracker.utils.b.a.c = r3
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.socialize.tracker.utils.b.a valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.socialize.tracker.utils.b$a> r0 = com.umeng.socialize.tracker.utils.b.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.socialize.tracker.utils.b$a r1 = (com.umeng.socialize.tracker.utils.b.a) r1
                return r1
        }

        public static com.umeng.socialize.tracker.utils.b.a[] values() {
                com.umeng.socialize.tracker.utils.b$a[] r0 = com.umeng.socialize.tracker.utils.b.a.c
                java.lang.Object r0 = r0.clone()
                com.umeng.socialize.tracker.utils.b$a[] r0 = (com.umeng.socialize.tracker.utils.b.a[]) r0
                return r0
        }
    }

    public b(java.lang.String r1, com.umeng.socialize.tracker.utils.b.a r2, java.util.Map<java.lang.String, java.lang.String> r3, com.umeng.socialize.tracker.utils.HttpRequestListener r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            return
    }

    public java.lang.String a(int r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117 javax.net.ssl.SSLHandshakeException -> L11a java.net.UnknownHostException -> L11d java.net.SocketTimeoutException -> L121 java.net.MalformedURLException -> L125
            java.lang.String r2 = r5.b     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117 javax.net.ssl.SSLHandshakeException -> L11a java.net.UnknownHostException -> L11d java.net.SocketTimeoutException -> L121 java.net.MalformedURLException -> L125
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117 javax.net.ssl.SSLHandshakeException -> L11a java.net.UnknownHostException -> L11d java.net.SocketTimeoutException -> L121 java.net.MalformedURLException -> L125
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117 javax.net.ssl.SSLHandshakeException -> L11a java.net.UnknownHostException -> L11d java.net.SocketTimeoutException -> L121 java.net.MalformedURLException -> L125
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L114 java.io.IOException -> L117 javax.net.ssl.SSLHandshakeException -> L11a java.net.UnknownHostException -> L11d java.net.SocketTimeoutException -> L121 java.net.MalformedURLException -> L125
            org.apache.http.conn.ssl.X509HostnameVerifier r2 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r1.setHostnameVerifier(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r2 = "TLS"
            javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r3.<init>()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r2.init(r0, r0, r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            javax.net.ssl.SSLSocketFactory r2 = r2.getSocketFactory()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r1.setSSLSocketFactory(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.d     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r2 == 0) goto L6c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r2 != 0) goto L6c
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.d     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        L3c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r4 != 0) goto L3c
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.d     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r1.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            goto L3c
        L5a:
            r6 = move-exception
            goto L129
        L5d:
            r6 = move-exception
            goto L137
        L60:
            r6 = move-exception
            goto L161
        L63:
            r6 = move-exception
            goto L18b
        L66:
            r6 = move-exception
            goto L1b6
        L69:
            goto L1e7
        L6c:
            r1.setConnectTimeout(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r1.setReadTimeout(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.b$a r6 = r5.c     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.b$a r2 = com.umeng.socialize.tracker.utils.b.a.a     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r6 != r2) goto L7e
            java.lang.String r6 = "POST"
            r1.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            goto L83
        L7e:
            java.lang.String r6 = "GET"
            r1.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        L83:
            r6 = 1
            r1.setDoOutput(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r1.setDoInput(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6 = 0
            r1.setDefaultUseCaches(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.write(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.flush()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r6 == 0) goto La7
            r6.a()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        La7:
            r1.connect()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            int r6 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto Le3
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r3 = "utf-8"
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        Lc7:
            java.lang.String r2 = r6.readLine()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r2 == 0) goto Ld1
            r7.append(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            goto Lc7
        Ld1:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r6 == 0) goto Ldf
            r6.a(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        Ldf:
            r1.disconnect()
            return r7
        Le3:
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            if (r6 == 0) goto L10f
            java.lang.Throwable r6 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7.<init>()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.a r2 = com.umeng.socialize.tracker.utils.a.g     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r2 = r2.a()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7.append(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r2 = "Http Response Code:"
            r7.append(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7.append(r2)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
            r7.a(r6)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d javax.net.ssl.SSLHandshakeException -> L60 java.net.UnknownHostException -> L63 java.net.SocketTimeoutException -> L66 java.net.MalformedURLException -> L69
        L10f:
            r1.disconnect()
            goto L1eb
        L114:
            r6 = move-exception
            r1 = r0
            goto L129
        L117:
            r6 = move-exception
            r1 = r0
            goto L137
        L11a:
            r6 = move-exception
            r1 = r0
            goto L161
        L11d:
            r6 = move-exception
            r1 = r0
            goto L18b
        L121:
            r6 = move-exception
            r1 = r0
            goto L1b6
        L125:
            r1 = r0
            goto L1e7
        L129:
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L134
            r7.a(r6)     // Catch: java.lang.Throwable -> L131
            goto L134
        L131:
            r6 = move-exception
            goto L1e1
        L134:
            if (r1 == 0) goto L1eb
            goto L10f
        L137:
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L15e
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r2.<init>()     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.a r3 = com.umeng.socialize.tracker.utils.a.e     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L131
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L131
            r2.append(r6)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L131
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L131
            r6.a(r7)     // Catch: java.lang.Throwable -> L131
        L15e:
            if (r1 == 0) goto L1eb
            goto L10f
        L161:
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L188
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r2.<init>()     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.a r3 = com.umeng.socialize.tracker.utils.a.d     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L131
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L131
            r2.append(r6)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L131
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L131
            r6.a(r7)     // Catch: java.lang.Throwable -> L131
        L188:
            if (r1 == 0) goto L1eb
            goto L10f
        L18b:
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L1b2
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r2.<init>()     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.a r3 = com.umeng.socialize.tracker.utils.a.f     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L131
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L131
            r2.append(r6)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L131
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L131
            r6.a(r7)     // Catch: java.lang.Throwable -> L131
        L1b2:
            if (r1 == 0) goto L1eb
            goto L10f
        L1b6:
            com.umeng.socialize.tracker.utils.HttpRequestListener r7 = r5.e     // Catch: java.lang.Throwable -> L131
            if (r7 == 0) goto L1dd
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r2.<init>()     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.a r3 = com.umeng.socialize.tracker.utils.a.b     // Catch: java.lang.Throwable -> L131
            java.lang.String r3 = r3.a()     // Catch: java.lang.Throwable -> L131
            r2.append(r3)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L131
            r2.append(r6)     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L131
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L131
            com.umeng.socialize.tracker.utils.HttpRequestListener r6 = r5.e     // Catch: java.lang.Throwable -> L131
            r6.a(r7)     // Catch: java.lang.Throwable -> L131
        L1dd:
            if (r1 == 0) goto L1eb
            goto L10f
        L1e1:
            if (r1 == 0) goto L1e6
            r1.disconnect()
        L1e6:
            throw r6
        L1e7:
            if (r1 == 0) goto L1eb
            goto L10f
        L1eb:
            return r0
    }
}
