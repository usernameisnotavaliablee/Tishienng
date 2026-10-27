package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class ConnectInterceptor implements xyz.adscope.common.network.connect.Interceptor {
    private final xyz.adscope.common.network.cookie.CookieManager a;
    private final xyz.adscope.common.network.connect.ConnectFactory b;
    private final xyz.adscope.common.network.connect.Network c;
    private xyz.adscope.common.network.connect.Connection d;
    private boolean e;

    ConnectInterceptor() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.network.cookie.CookieManager r0 = new xyz.adscope.common.network.cookie.CookieManager
            xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.cookie.CookieStore r1 = r1.getCookieStore()
            r0.<init>(r1)
            r2.a = r0
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.connect.ConnectFactory r0 = r0.getConnectFactory()
            r2.b = r0
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.getConfig()
            xyz.adscope.common.network.connect.Network r0 = r0.getNetwork()
            r2.c = r0
            return
    }

    private xyz.adscope.common.network.Headers a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4) {
            r3 = this;
            xyz.adscope.common.network.Headers r0 = new xyz.adscope.common.network.Headers
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r0.add2(r2, r1)
            goto Ld
        L29:
            return r0
    }

    private xyz.adscope.common.network.connect.Connection a(xyz.adscope.common.network.Request r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            xyz.adscope.common.network.Headers r2 = r7.headers()     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            java.net.URI r3 = new java.net.URI     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            xyz.adscope.common.network.Url r4 = r7.url()     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            r3.<init>(r4)     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            xyz.adscope.common.network.cookie.CookieManager r4 = r6.a     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            java.util.List r4 = r4.get(r3)     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            if (r4 == 0) goto L31
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            if (r5 != 0) goto L31
            java.lang.String r5 = "Cookie"
            r2.add2(r5, r4)     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            goto L31
        L27:
            r2 = move-exception
            goto L41
        L29:
            r2 = move-exception
            goto L55
        L2b:
            r2 = move-exception
            goto L69
        L2d:
            r2 = move-exception
            goto L7d
        L2f:
            r2 = move-exception
            goto L91
        L31:
            java.lang.String r4 = "Host"
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            r2.set2(r4, r3)     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            xyz.adscope.common.network.connect.ConnectFactory r2 = r6.b     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            xyz.adscope.common.network.connect.Connection r7 = r2.connect(r7)     // Catch: java.lang.Exception -> L27 java.net.SocketTimeoutException -> L29 java.net.UnknownHostException -> L2b java.net.MalformedURLException -> L2d java.net.URISyntaxException -> L2f
            return r7
        L41:
            xyz.adscope.common.network.exception.ConnectException r3 = new xyz.adscope.common.network.exception.ConnectException
            xyz.adscope.common.network.Url r7 = r7.url()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "An unknown exception: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r3.<init>(r7, r2)
            throw r3
        L55:
            xyz.adscope.common.network.exception.ConnectTimeoutError r3 = new xyz.adscope.common.network.exception.ConnectTimeoutError
            xyz.adscope.common.network.Url r7 = r7.url()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "Connect time out: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r3.<init>(r7, r2)
            throw r3
        L69:
            xyz.adscope.common.network.exception.HostError r3 = new xyz.adscope.common.network.exception.HostError
            xyz.adscope.common.network.Url r7 = r7.url()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "Hostname can not be resolved: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r3.<init>(r7, r2)
            throw r3
        L7d:
            xyz.adscope.common.network.exception.URLError r3 = new xyz.adscope.common.network.exception.URLError
            xyz.adscope.common.network.Url r7 = r7.url()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "The url is malformed: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r3.<init>(r7, r2)
            throw r3
        L91:
            xyz.adscope.common.network.exception.URLError r3 = new xyz.adscope.common.network.exception.URLError
            xyz.adscope.common.network.Url r7 = r7.url()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.String r7 = "The url syntax error: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r3.<init>(r7, r2)
            throw r3
    }

    private void a(xyz.adscope.common.network.RequestBody r3) {
            r2 = this;
            xyz.adscope.common.network.connect.Connection r0 = r2.d     // Catch: java.lang.Exception -> L11
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Exception -> L11
            java.io.BufferedOutputStream r1 = xyz.adscope.common.network.util.IOUtils.toBufferedOutputStream(r0)     // Catch: java.lang.Exception -> L11
            r3.writeTo(r1)     // Catch: java.lang.Exception -> L11
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)     // Catch: java.lang.Exception -> L11
            return
        L11:
            r3 = move-exception
            xyz.adscope.common.network.exception.WriteException r0 = new xyz.adscope.common.network.exception.WriteException
            r0.<init>(r3)
            throw r0
    }

    private xyz.adscope.common.network.Response b(xyz.adscope.common.network.Request r7) {
            r6 = this;
            xyz.adscope.common.network.connect.Connection r0 = r6.d     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            int r0 = r0.getCode()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.lang.String r1 = ""
            xyz.adscope.common.network.connect.Connection r2 = r6.d     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.util.Map r2 = r2.getHeaders()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Headers r2 = r6.a(r2)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.lang.String r3 = "Set-Cookie"
            java.util.List r3 = r2.get2(r3)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            if (r3 == 0) goto L36
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            if (r4 != 0) goto L36
            xyz.adscope.common.network.cookie.CookieManager r4 = r6.a     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Url r5 = r7.url()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.net.URI r5 = java.net.URI.create(r5)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            r4.add(r5, r3)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            goto L36
        L32:
            r7 = move-exception
            goto L68
        L34:
            r0 = move-exception
            goto L6e
        L36:
            r3 = 302(0x12e, float:4.23E-43)
            if (r0 != r3) goto L40
            xyz.adscope.common.network.connect.Connection r1 = r6.d     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.lang.String r1 = r1.getLocationUrl()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
        L40:
            java.lang.String r3 = r2.getContentType()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.connect.StreamBody r4 = new xyz.adscope.common.network.connect.StreamBody     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.connect.Connection r5 = r6.d     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            r4.<init>(r3, r5)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response$Builder r3 = xyz.adscope.common.network.Response.newBuilder()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response$Builder r0 = r3.code(r0)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response$Builder r0 = r0.headers(r2)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response$Builder r0 = r0.body(r4)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response$Builder r0 = r0.locationUrl(r1)     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            xyz.adscope.common.network.Response r7 = r0.build()     // Catch: java.lang.Exception -> L32 java.net.SocketTimeoutException -> L34
            return r7
        L68:
            xyz.adscope.common.network.exception.ReadException r0 = new xyz.adscope.common.network.exception.ReadException
            r0.<init>(r7)
            throw r0
        L6e:
            xyz.adscope.common.network.exception.ReadTimeoutError r1 = new xyz.adscope.common.network.exception.ReadTimeoutError
            xyz.adscope.common.network.Url r7 = r7.url()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "Read data time out: %1$s."
            java.lang.String r7 = java.lang.String.format(r7, r2)
            r1.<init>(r7, r0)
            throw r1
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.e = r0
            xyz.adscope.common.network.connect.Connection r0 = r1.d
            if (r0 == 0) goto La
            r0.disconnect()
        La:
            return
    }

    @Override // xyz.adscope.common.network.connect.Interceptor
    public xyz.adscope.common.network.Response intercept(xyz.adscope.common.network.connect.http.Chain r5) {
            r4 = this;
            boolean r0 = r4.e
            if (r0 != 0) goto L45
            xyz.adscope.common.network.Request r5 = r5.request()
            xyz.adscope.common.network.RequestMethod r0 = r5.method()
            boolean r0 = r0.allowBody()
            if (r0 == 0) goto L3a
            xyz.adscope.common.network.Headers r0 = r5.headers()
            xyz.adscope.common.network.RequestBody r1 = r5.body()
            long r2 = r1.contentLength()
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "Content-Length"
            r0.set2(r3, r2)
            java.lang.String r2 = r1.contentType()
            java.lang.String r3 = "Content-Type"
            r0.set2(r3, r2)
            xyz.adscope.common.network.connect.Connection r0 = r4.a(r5)
            r4.d = r0
            r4.a(r1)
            goto L40
        L3a:
            xyz.adscope.common.network.connect.Connection r0 = r4.a(r5)
            r4.d = r0
        L40:
            xyz.adscope.common.network.Response r5 = r4.b(r5)
            return r5
        L45:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "The request has been cancelled."
            r5.<init>(r0)
            throw r5
    }
}
