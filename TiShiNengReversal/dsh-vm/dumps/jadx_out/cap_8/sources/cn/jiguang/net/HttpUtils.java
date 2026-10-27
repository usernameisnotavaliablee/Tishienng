package cn.jiguang.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HttpUtils {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1380b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile javax.net.ssl.SSLSocketFactory f1381c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f1382d = null;

    public static abstract class HttpListener {
        public HttpListener() {
                r0 = this;
                r0.<init>()
                return
        }

        protected void a() {
                r0 = this;
                return
        }

        protected void a(cn.jiguang.net.HttpResponse r1) {
                r0 = this;
                return
        }
    }

    private static class a extends android.os.AsyncTask<cn.jiguang.net.HttpRequest, java.lang.Void, cn.jiguang.net.HttpResponse> {
        private cn.jiguang.net.HttpUtils.HttpListener a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1383b;

        public a(android.content.Context r1, cn.jiguang.net.HttpUtils.HttpListener r2) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                r0.f1383b = r1
                return
        }

        protected cn.jiguang.net.HttpResponse a(cn.jiguang.net.HttpRequest... r3) {
                r2 = this;
                if (r3 == 0) goto L10
                int r0 = r3.length
                if (r0 != 0) goto L6
                goto L10
            L6:
                android.content.Context r0 = r2.f1383b
                r1 = 0
                r3 = r3[r1]
                cn.jiguang.net.HttpResponse r3 = cn.jiguang.net.HttpUtils.httpGet(r0, r3)
                return r3
            L10:
                r3 = 0
                return r3
        }

        protected void a(cn.jiguang.net.HttpResponse r2) {
                r1 = this;
                cn.jiguang.net.HttpUtils$HttpListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.a(r2)
            L7:
                return
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ cn.jiguang.net.HttpResponse doInBackground(cn.jiguang.net.HttpRequest[] r1) {
                r0 = this;
                cn.jiguang.net.HttpRequest[] r1 = (cn.jiguang.net.HttpRequest[]) r1
                cn.jiguang.net.HttpResponse r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(cn.jiguang.net.HttpResponse r1) {
                r0 = this;
                cn.jiguang.net.HttpResponse r1 = (cn.jiguang.net.HttpResponse) r1
                r0.a(r1)
                return
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
                r1 = this;
                cn.jiguang.net.HttpUtils$HttpListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.a()
            L7:
                return
        }
    }

    private static class b extends android.os.AsyncTask<java.lang.String, java.lang.Void, cn.jiguang.net.HttpResponse> {
        private cn.jiguang.net.HttpUtils.HttpListener a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1384b;

        public b(cn.jiguang.net.HttpUtils.HttpListener r1, android.content.Context r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1384b = r2
                return
        }

        protected cn.jiguang.net.HttpResponse a(java.lang.String... r3) {
                r2 = this;
                if (r3 == 0) goto L10
                int r0 = r3.length
                if (r0 != 0) goto L6
                goto L10
            L6:
                android.content.Context r0 = r2.f1384b
                r1 = 0
                r3 = r3[r1]
                cn.jiguang.net.HttpResponse r3 = cn.jiguang.net.HttpUtils.httpGet(r0, r3)
                return r3
            L10:
                r3 = 0
                return r3
        }

        protected void a(cn.jiguang.net.HttpResponse r2) {
                r1 = this;
                cn.jiguang.net.HttpUtils$HttpListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.a(r2)
            L7:
                return
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ cn.jiguang.net.HttpResponse doInBackground(java.lang.String[] r1) {
                r0 = this;
                java.lang.String[] r1 = (java.lang.String[]) r1
                cn.jiguang.net.HttpResponse r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(cn.jiguang.net.HttpResponse r1) {
                r0 = this;
                cn.jiguang.net.HttpResponse r1 = (cn.jiguang.net.HttpResponse) r1
                r0.a(r1)
                return
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
                r1 = this;
                cn.jiguang.net.HttpUtils$HttpListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.a()
            L7:
                return
        }
    }

    static {
            java.lang.String r0 = "HttpUtils"
            r1 = 3
            byte[] r1 = new byte[r1]
            r1 = {x005a: FILL_ARRAY_DATA , data: [66, 93, 99} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.net.HttpUtils.a = r1
            r1 = 0
            cn.jiguang.net.HttpUtils.f1381c = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            cn.jiguang.net.HttpUtils.f1382d = r1
            java.lang.String r1 = "http.keepAlive"
            java.lang.String r2 = "true"
            java.lang.System.setProperty(r1, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "http.maxConnections"
            java.lang.String r2 = "5"
            java.lang.System.setProperty(r1, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "http.keepAliveDuration"
            java.lang.String r2 = "60000"
            java.lang.System.setProperty(r1, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "HTTP Keep-Alive enabled: duration=60s, maxConn=5"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L33
            goto L4c
        L33:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to set HTTP Keep-Alive properties: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
        L4c:
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [32, 0, 14, 41, 38, 38, 63, 1, 23, 43} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.net.HttpUtils.f1380b = r0
            return
    }

    public HttpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static javax.net.ssl.SSLSocketFactory a() {
            javax.net.ssl.SSLSocketFactory r0 = cn.jiguang.net.HttpUtils.f1381c
            if (r0 != 0) goto L4d
            java.lang.Object r0 = cn.jiguang.net.HttpUtils.f1382d
            monitor-enter(r0)
            javax.net.ssl.SSLSocketFactory r1 = cn.jiguang.net.HttpUtils.f1381c     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            java.lang.String r1 = cn.jiguang.net.HttpUtils.a     // Catch: java.lang.Throwable -> L23
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r1.init(r2, r2, r2)     // Catch: java.lang.Throwable -> L23
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.net.HttpUtils.f1381c = r1     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "HttpUtils"
            java.lang.String r2 = "Created cached SSLSocketFactory"
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L23
            goto L49
        L23:
            r1 = move-exception
            java.lang.String r2 = "HttpUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "Failed to create cached SSLSocketFactory: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L47
            r3.append(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L47
            cn.jiguang.w.f.i(r2, r1)     // Catch: java.lang.Throwable -> L47
            javax.net.SocketFactory r1 = javax.net.ssl.SSLSocketFactory.getDefault()     // Catch: java.lang.Throwable -> L47
            javax.net.ssl.SSLSocketFactory r1 = (javax.net.ssl.SSLSocketFactory) r1     // Catch: java.lang.Throwable -> L47
            cn.jiguang.net.HttpUtils.f1381c = r1     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r1 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            goto L4d
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1
        L4d:
            javax.net.ssl.SSLSocketFactory r0 = cn.jiguang.net.HttpUtils.f1381c
            return r0
    }

    private static void a(cn.jiguang.net.HttpRequest r2, java.net.HttpURLConnection r3) {
            if (r2 == 0) goto L2d
            if (r3 != 0) goto L5
            goto L2d
        L5:
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "Keep-Alive"
            r3.setRequestProperty(r0, r1)
            java.util.Map r0 = r2.getRequestProperties()
            setURLConnection(r0, r3)
            int r0 = r2.getConnectTimeout()
            if (r0 < 0) goto L20
            int r0 = r2.getConnectTimeout()
            r3.setConnectTimeout(r0)
        L20:
            int r0 = r2.getReadTimeout()
            if (r0 < 0) goto L2d
            int r2 = r2.getReadTimeout()
            r3.setReadTimeout(r2)
        L2d:
            return
    }

    private static void a(java.net.HttpURLConnection r2, cn.jiguang.net.HttpResponse r3) {
            if (r3 == 0) goto L29
            if (r2 != 0) goto L5
            goto L29
        L5:
            int r0 = r2.getResponseCode()
            r3.setResponseCode(r0)
            int r0 = r2.getResponseCode()
            r3.setStatusCode(r0)
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r2.getHeaderField(r0)
            java.lang.String r1 = "expires"
            r3.setResponseHeader(r1, r0)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = r2.getHeaderField(r0)
            java.lang.String r0 = "cache-control"
            r3.setResponseHeader(r0, r2)
        L29:
            return
    }

    public static java.lang.String appendParaToUrl(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = "?"
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L18
            r0.append(r1)
            goto L1d
        L18:
            java.lang.String r2 = "&"
            r0.append(r2)
        L1d:
            r0.append(r3)
            java.lang.String r2 = "="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.net.HttpURLConnection getHttpURLConnectionWithProxy(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            java.net.URLConnection r1 = r0.openConnection()     // Catch: java.lang.Throwable -> Lc
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.String getUrlWithParas(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto La
            java.lang.String r2 = ""
        La:
            r0.<init>(r2)
            java.lang.String r2 = joinParas(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1f
            java.lang.String r3 = "?"
            r0.append(r3)
            r0.append(r2)
        L1f:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String getUrlWithValueEncodeParas(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto La
            java.lang.String r2 = ""
        La:
            r0.<init>(r2)
            java.lang.String r2 = joinParasWithEncodedValue(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1f
            java.lang.String r3 = "?"
            r0.append(r3)
            r0.append(r2)
        L1f:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static cn.jiguang.net.HttpResponse httpGet(android.content.Context r1, cn.jiguang.net.HttpRequest r2) {
            r0 = 0
            cn.jiguang.net.HttpResponse r1 = httpResponse(r1, r2, r0)
            return r1
    }

    public static cn.jiguang.net.HttpResponse httpGet(android.content.Context r1, java.lang.String r2) {
            cn.jiguang.net.HttpRequest r0 = new cn.jiguang.net.HttpRequest
            r0.<init>(r2)
            cn.jiguang.net.HttpResponse r1 = httpGet(r1, r0)
            return r1
    }

    public static void httpGet(android.content.Context r1, cn.jiguang.net.HttpRequest r2, cn.jiguang.net.HttpUtils.HttpListener r3) {
            cn.jiguang.net.HttpUtils$a r0 = new cn.jiguang.net.HttpUtils$a
            r0.<init>(r1, r3)
            r1 = 1
            cn.jiguang.net.HttpRequest[] r1 = new cn.jiguang.net.HttpRequest[r1]
            r3 = 0
            r1[r3] = r2
            r0.execute(r1)
            return
    }

    public static void httpGet(android.content.Context r1, java.lang.String r2, cn.jiguang.net.HttpUtils.HttpListener r3) {
            cn.jiguang.net.HttpUtils$b r0 = new cn.jiguang.net.HttpUtils$b
            r0.<init>(r3, r1)
            java.lang.String[] r1 = new java.lang.String[]{r2}
            r0.execute(r1)
            return
    }

    public static java.lang.String httpGetString(android.content.Context r0, cn.jiguang.net.HttpRequest r1) {
            cn.jiguang.net.HttpResponse r0 = httpGet(r0, r1)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.getResponseBody()
            return r0
    }

    public static java.lang.String httpGetString(android.content.Context r1, java.lang.String r2) {
            cn.jiguang.net.HttpRequest r0 = new cn.jiguang.net.HttpRequest
            r0.<init>(r2)
            cn.jiguang.net.HttpResponse r1 = httpGet(r1, r0)
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r1.getResponseBody()
            return r1
    }

    public static cn.jiguang.net.HttpResponse httpPost(android.content.Context r2, cn.jiguang.net.HttpRequest r3) {
            r0 = 1
            r1 = 0
            cn.jiguang.net.HttpResponse r2 = httpResponse(r2, r3, r0, r1)
            return r2
    }

    public static cn.jiguang.net.HttpResponse httpPost(android.content.Context r1, java.lang.String r2) {
            cn.jiguang.net.HttpRequest r0 = new cn.jiguang.net.HttpRequest
            r0.<init>(r2)
            cn.jiguang.net.HttpResponse r1 = httpPost(r1, r0)
            return r1
    }

    public static java.lang.String httpPostString(android.content.Context r1, java.lang.String r2) {
            cn.jiguang.net.HttpRequest r0 = new cn.jiguang.net.HttpRequest
            r0.<init>(r2)
            cn.jiguang.net.HttpResponse r1 = httpPost(r1, r0)
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r1.getResponseBody()
            return r1
    }

    public static java.lang.String httpPostString(android.content.Context r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            cn.jiguang.net.HttpRequest r0 = new cn.jiguang.net.HttpRequest
            r0.<init>(r2, r3)
            cn.jiguang.net.HttpResponse r1 = httpPost(r1, r0)
            if (r1 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r1.getResponseBody()
            return r1
    }

    public static cn.jiguang.net.HttpResponse httpResponse(android.content.Context r1, cn.jiguang.net.HttpRequest r2, boolean r3) {
            r0 = 0
            cn.jiguang.net.HttpResponse r1 = httpResponse(r1, r2, r3, r0)
            return r1
    }

    public static cn.jiguang.net.HttpResponse httpResponse(android.content.Context r1, cn.jiguang.net.HttpRequest r2, boolean r3, boolean r4) {
            java.lang.String r0 = r2.getUrl()
            java.net.HttpURLConnection r0 = getHttpURLConnectionWithProxy(r0)
            cn.jiguang.net.HttpResponse r1 = httpResponse(r1, r0, r2, r3, r4)
            return r1
    }

    public static cn.jiguang.net.HttpResponse httpResponse(android.content.Context r16, java.net.HttpURLConnection r17, cn.jiguang.net.HttpRequest r18, boolean r19, boolean r20) {
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = 0
            if (r2 != 0) goto La
            return r4
        La:
            cn.jiguang.net.HttpResponse r5 = new cn.jiguang.net.HttpResponse
            java.lang.String r0 = r2.getUrl()
            r5.<init>(r0)
            boolean r0 = cn.jiguang.av.b.a()
            r6 = 3006(0xbbe, float:4.212E-42)
            if (r0 != 0) goto L25
            r5.setResponseCode(r6)
            java.lang.String r0 = "user not auth!!!"
            r5.setResponseBody(r0)
            return r5
        L25:
            java.lang.String r7 = "sdk limit"
            java.lang.String r8 = "HttpUtils"
            if (r20 != 0) goto L41
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = " https sdk limit"
            cn.jiguang.w.f.i(r8, r0)
            r5.setResponseCode(r6)
            r5.setResponseBody(r7)
            return r5
        L41:
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            java.lang.String r9 = r0.a(r1, r2, r3)
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()
            r0.a(r2, r3)
            if (r17 != 0) goto L71
            java.lang.String r0 = r2.getUrl()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L63 java.net.MalformedURLException -> L6a
            java.net.HttpURLConnection r0 = getHttpURLConnectionWithProxy(r0)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L63 java.net.MalformedURLException -> L6a
            r10 = r0
            goto L73
        L5c:
            r0 = move-exception
            r10 = r17
        L5f:
            r7 = r4
            r11 = r7
            goto L22a
        L63:
            r0 = move-exception
            r10 = r17
        L66:
            r6 = r4
            r11 = r6
            goto L268
        L6a:
            r0 = move-exception
            r10 = r17
        L6d:
            r6 = r4
            r11 = r6
            goto L2c4
        L71:
            r10 = r17
        L73:
            java.net.URL r0 = r10.getURL()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            int r11 = r0.getPort()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.<init>()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r13 = "http url:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r13 = r2.getUrl()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.append(r13)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            cn.jiguang.w.f.a(r8, r12)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.<init>()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r13 = "host:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.append(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r0 = ",port:"
            r12.append(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.append(r11)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            cn.jiguang.w.f.a(r8, r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            a(r2, r10)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            boolean r0 = r10 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r11 = 1
            if (r0 == 0) goto L12a
            r0 = r10
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Le3
            javax.net.ssl.X509TrustManager r12 = r2.getSslTrustManager()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto Le5
            java.lang.String r12 = cn.jiguang.net.HttpUtils.a     // Catch: java.lang.Throwable -> Le3
            javax.net.ssl.SSLContext r12 = javax.net.ssl.SSLContext.getInstance(r12)     // Catch: java.lang.Throwable -> Le3
            javax.net.ssl.X509TrustManager r13 = r2.getSslTrustManager()     // Catch: java.lang.Throwable -> Le3
            javax.net.ssl.TrustManager[] r14 = new javax.net.ssl.TrustManager[r11]     // Catch: java.lang.Throwable -> Le3
            r15 = 0
            r14[r15] = r13     // Catch: java.lang.Throwable -> Le3
            java.security.SecureRandom r13 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> Le3
            r13.<init>()     // Catch: java.lang.Throwable -> Le3
            r12.init(r4, r14, r13)     // Catch: java.lang.Throwable -> Le3
            javax.net.ssl.SSLSocketFactory r12 = r12.getSocketFactory()     // Catch: java.lang.Throwable -> Le3
        Ldf:
            r0.setSSLSocketFactory(r12)     // Catch: java.lang.Throwable -> Le3
            goto Lec
        Le3:
            r0 = move-exception
            goto L108
        Le5:
            javax.net.ssl.SSLSocketFactory r12 = a()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto Lec
            goto Ldf
        Lec:
            javax.net.ssl.HostnameVerifier r12 = r2.getHostnameVerifier()     // Catch: java.lang.Throwable -> Le3
            if (r12 == 0) goto Lfa
            javax.net.ssl.HostnameVerifier r12 = r2.getHostnameVerifier()     // Catch: java.lang.Throwable -> Le3
        Lf6:
            r0.setHostnameVerifier(r12)     // Catch: java.lang.Throwable -> Le3
            goto L12a
        Lfa:
            cn.jiguang.net.DefaultHostVerifier r12 = new cn.jiguang.net.DefaultHostVerifier     // Catch: java.lang.Throwable -> Le3
            java.net.URL r13 = r10.getURL()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r13 = r13.getHost()     // Catch: java.lang.Throwable -> Le3
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Le3
            goto Lf6
        L108:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.<init>()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r13 = "set ssl config error:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r12.append(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            cn.jiguang.w.f.j(r8, r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            goto L12a
        L121:
            r0 = move-exception
            goto L5f
        L124:
            r0 = move-exception
            goto L66
        L127:
            r0 = move-exception
            goto L6d
        L12a:
            if (r3 != 0) goto L12e
            if (r20 == 0) goto L15f
        L12e:
            if (r20 == 0) goto L133
            java.lang.String r0 = "PUT"
            goto L135
        L133:
            java.lang.String r0 = "POST"
        L135:
            r10.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r10.setDoOutput(r11)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r10.setDoInput(r11)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            boolean r0 = r2.isUseCaches()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r10.setUseCaches(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            byte[] r0 = r2.getParas()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            if (r0 == 0) goto L15f
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L124 java.net.MalformedURLException -> L127
            r11.write(r0)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            goto L160
        L153:
            r0 = move-exception
            r7 = r4
            goto L22a
        L157:
            r0 = move-exception
            r6 = r4
            goto L268
        L15b:
            r0 = move-exception
            r6 = r4
            goto L2c4
        L15f:
            r11 = r4
        L160:
            if (r20 != 0) goto L17f
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            boolean r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            if (r0 != 0) goto L17f
            r5.setResponseCode(r6)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            r5.setResponseBody(r7)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r11)
            r10.disconnect()
            return r5
        L17f:
            int r7 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.util.Map r0 = r10.getHeaderFields()     // Catch: java.lang.Throwable -> L1a3
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L1a3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1a3
        L18f:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a3
            if (r12 == 0) goto L1a3
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r13 = r10.getHeaderField(r12)     // Catch: java.lang.Throwable -> L1a3
            r5.setResponseHeader(r12, r13)     // Catch: java.lang.Throwable -> L1a3
            goto L18f
        L1a3:
            r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.io.InputStream r0 = r10.getInputStream()     // Catch: java.lang.Throwable -> L1ac
            r12 = r0
            goto L1ce
        L1ac:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            r12.<init>()     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.lang.String r13 = "code:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            r12.append(r7)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.lang.String r13 = ",get input stream error:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            r12.append(r0)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            cn.jiguang.w.f.c(r8, r0)     // Catch: java.lang.Throwable -> L153 java.io.IOException -> L157 java.net.MalformedURLException -> L15b
            r12 = r4
        L1ce:
            boolean r0 = r2.isHaveRspData()     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            if (r0 == 0) goto L1ea
            if (r12 == 0) goto L1ea
            byte[] r0 = readInputStream(r12)     // Catch: java.lang.Throwable -> L1e9
            if (r0 == 0) goto L1eb
            boolean r13 = r2.isRspDatazip()     // Catch: java.lang.Throwable -> L1e7
            if (r13 == 0) goto L1eb
            byte[] r0 = cn.jiguang.av.x.b(r0)     // Catch: java.lang.Throwable -> L1e7
            goto L1eb
        L1e7:
            goto L1eb
        L1e9:
        L1ea:
            r0 = r4
        L1eb:
            if (r0 != 0) goto L20d
            r13 = 200(0xc8, float:2.8E-43)
            if (r7 == r13) goto L20d
            boolean r7 = r2.isNeedErrorInput()     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            if (r7 == 0) goto L20d
            java.io.InputStream r4 = r10.getErrorStream()     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            byte[] r0 = readInputStream(r4)     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            goto L20d
        L200:
            r0 = move-exception
            r7 = r4
            r4 = r12
            goto L22a
        L204:
            r0 = move-exception
            r6 = r4
            r4 = r12
            goto L268
        L208:
            r0 = move-exception
            r6 = r4
            r4 = r12
            goto L2c4
        L20d:
            if (r0 == 0) goto L219
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            java.lang.String r13 = "UTF-8"
            r7.<init>(r0, r13)     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            r5.setResponseBody(r7)     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
        L219:
            a(r10, r5)     // Catch: java.lang.Throwable -> L200 java.io.IOException -> L204 java.net.MalformedURLException -> L208
            cn.jiguang.av.x.a(r12)
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r11)
        L225:
            r10.disconnect()
            goto L2f3
        L22a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L265
            r12.<init>()     // Catch: java.lang.Throwable -> L265
            java.lang.String r13 = "http post Exception error:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L265
            r12.append(r0)     // Catch: java.lang.Throwable -> L265
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L265
            cn.jiguang.w.f.i(r8, r12)     // Catch: java.lang.Throwable -> L265
            r5.setResponseCode(r6)     // Catch: java.lang.Throwable -> L265
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L265
            r6.<init>()     // Catch: java.lang.Throwable -> L265
            java.lang.String r8 = "UNKnow execption"
            r6.append(r8)     // Catch: java.lang.Throwable -> L265
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L265
            r6.append(r0)     // Catch: java.lang.Throwable -> L265
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L265
            r5.setResponseBody(r0)     // Catch: java.lang.Throwable -> L265
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r7)
            cn.jiguang.av.x.a(r11)
            if (r10 == 0) goto L2f3
        L264:
            goto L225
        L265:
            r0 = move-exception
            goto L302
        L268:
            r7 = 2998(0xbb6, float:4.201E-42)
            r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L283
            java.lang.String r7 = "网络错误"
            r5.setResponseBody(r7)     // Catch: java.lang.Throwable -> L283
            boolean r7 = r0 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L283
            if (r7 == 0) goto L287
            r7 = 3001(0xbb9, float:4.205E-42)
            r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L283
            java.lang.String r7 = "请求超时"
        L27f:
            r5.setResponseBody(r7)     // Catch: java.lang.Throwable -> L283
            goto L2a0
        L283:
            r0 = move-exception
            r7 = r6
            goto L302
        L287:
            boolean r7 = r0 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L283
            if (r7 == 0) goto L294
            r7 = 3003(0xbbb, float:4.208E-42)
            r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L283
            java.lang.String r7 = "域名无效"
            goto L27f
        L294:
            boolean r7 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L283
            if (r7 == 0) goto L2a0
            r7 = 3005(0xbbd, float:4.211E-42)
            r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L283
            java.lang.String r7 = "SSL失败"
            goto L27f
        L2a0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L283
            r7.<init>()     // Catch: java.lang.Throwable -> L283
            java.lang.String r12 = "http post IOException error:"
            r7.append(r12)     // Catch: java.lang.Throwable -> L283
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L283
            r7.append(r0)     // Catch: java.lang.Throwable -> L283
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L283
            cn.jiguang.w.f.i(r8, r0)     // Catch: java.lang.Throwable -> L283
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r6)
            cn.jiguang.av.x.a(r11)
            if (r10 == 0) goto L2f3
            goto L264
        L2c4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L283
            r7.<init>()     // Catch: java.lang.Throwable -> L283
            java.lang.String r12 = "http post  error:"
            r7.append(r12)     // Catch: java.lang.Throwable -> L283
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L283
            r7.append(r0)     // Catch: java.lang.Throwable -> L283
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L283
            cn.jiguang.w.f.i(r8, r0)     // Catch: java.lang.Throwable -> L283
            r0 = 3004(0xbbc, float:4.21E-42)
            r5.setResponseCode(r0)     // Catch: java.lang.Throwable -> L283
            java.lang.String r0 = "MalformedURLException"
            r5.setResponseBody(r0)     // Catch: java.lang.Throwable -> L283
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r6)
            cn.jiguang.av.x.a(r11)
            if (r10 == 0) goto L2f3
            goto L264
        L2f3:
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a()
            r0.a(r1, r9, r5)
            cn.jiguang.al.c r0 = cn.jiguang.al.c.a()
            r0.a(r2, r3, r5)
            return r5
        L302:
            cn.jiguang.av.x.a(r4)
            cn.jiguang.av.x.a(r7)
            cn.jiguang.av.x.a(r11)
            if (r10 == 0) goto L310
            r10.disconnect()
        L310:
            throw r0
    }

    public static java.lang.String joinParas(java.util.Map<java.lang.String, java.lang.String> r3) {
            if (r3 == 0) goto L4a
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L4a
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.String r1 = "&"
            r0.append(r1)
            goto L16
        L45:
            java.lang.String r3 = r0.toString()
            return r3
        L4a:
            r3 = 0
            return r3
    }

    public static java.lang.String joinParasWithEncodedValue(java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            if (r3 == 0) goto L4c
            int r1 = r3.size()
            if (r1 <= 0) goto L4c
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L4c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L4c
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L4c
            r0.append(r2)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.lang.Exception -> L4c
            r0.append(r1)     // Catch: java.lang.Exception -> L4c
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L17
            java.lang.String r1 = "&"
            r0.append(r1)     // Catch: java.lang.Exception -> L4c
            goto L17
        L4c:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static long parseGmtTime(java.lang.String r2) {
            java.lang.String r0 = "EEE, d MMM yyyy HH:mm:ss z"
            java.text.SimpleDateFormat r0 = cn.jiguang.av.e.a(r0)     // Catch: java.lang.Exception -> Lf
            java.util.Date r2 = r0.parse(r2)     // Catch: java.lang.Exception -> Lf
            long r0 = r2.getTime()     // Catch: java.lang.Exception -> Lf
            return r0
        Lf:
            r0 = -1
            return r0
    }

    public static byte[] readInputStream(java.io.InputStream r0) {
            byte[] r0 = cn.jiguang.av.x.a(r0)
            return r0
    }

    public static void setURLConnection(java.util.Map<java.lang.String, java.lang.String> r2, java.net.HttpURLConnection r3) {
            if (r2 == 0) goto L3b
            int r0 = r2.size()
            if (r0 == 0) goto L3b
            if (r3 != 0) goto Lb
            goto L3b
        Lb:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L13
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L13
        L3b:
            return
    }
}
