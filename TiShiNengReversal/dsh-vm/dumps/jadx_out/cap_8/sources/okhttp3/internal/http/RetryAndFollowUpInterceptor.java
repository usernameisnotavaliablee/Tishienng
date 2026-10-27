package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion Companion = null;
    private static final int MAX_FOLLOW_UPS = 20;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient client;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor.Companion = r0
            return
    }

    public RetryAndFollowUpInterceptor(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r2) {
            r1 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.client = r2
            return
    }

    private final okhttp3.Request buildRedirectRequest(okhttp3.Response r9, java.lang.String r10) {
            r8 = this;
            okhttp3.OkHttpClient r0 = r8.client
            boolean r0 = r0.followRedirects()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "Location"
            r2 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r9, r0, r1, r2, r1)
            if (r0 != 0) goto L14
            return r1
        L14:
            okhttp3.Request r2 = r9.request()
            okhttp3.HttpUrl r2 = r2.url()
            okhttp3.HttpUrl r0 = r2.resolve(r0)
            if (r0 != 0) goto L23
            return r1
        L23:
            java.lang.String r2 = r0.scheme()
            okhttp3.Request r3 = r9.request()
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r3.scheme()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L42
            okhttp3.OkHttpClient r2 = r8.client
            boolean r2 = r2.followSslRedirects()
            if (r2 != 0) goto L42
            return r1
        L42:
            okhttp3.Request r2 = r9.request()
            okhttp3.Request$Builder r2 = r2.newBuilder()
            boolean r3 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r10)
            if (r3 == 0) goto L96
            int r3 = r9.code()
            okhttp3.internal.http.HttpMethod r4 = okhttp3.internal.http.HttpMethod.INSTANCE
            boolean r5 = r4.redirectsWithBody(r10)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 308(0x134, float:4.32E-43)
            if (r5 != 0) goto L67
            if (r3 == r7) goto L67
            if (r3 != r6) goto L65
            goto L67
        L65:
            r5 = 0
            goto L68
        L67:
            r5 = 1
        L68:
            boolean r4 = r4.redirectsToGet(r10)
            if (r4 == 0) goto L78
            if (r3 == r7) goto L78
            if (r3 == r6) goto L78
            java.lang.String r10 = "GET"
            r2.method(r10, r1)
            goto L85
        L78:
            if (r5 == 0) goto L82
            okhttp3.Request r1 = r9.request()
            okhttp3.RequestBody r1 = r1.body()
        L82:
            r2.method(r10, r1)
        L85:
            if (r5 != 0) goto L96
            java.lang.String r10 = "Transfer-Encoding"
            r2.removeHeader(r10)
            java.lang.String r10 = "Content-Length"
            r2.removeHeader(r10)
            java.lang.String r10 = "Content-Type"
            r2.removeHeader(r10)
        L96:
            okhttp3.Request r9 = r9.request()
            okhttp3.HttpUrl r9 = r9.url()
            boolean r9 = okhttp3.internal._UtilJvmKt.canReuseConnectionFor(r9, r0)
            if (r9 != 0) goto La9
            java.lang.String r9 = "Authorization"
            r2.removeHeader(r9)
        La9:
            okhttp3.Request$Builder r9 = r2.url(r0)
            okhttp3.Request r9 = r9.build()
            return r9
    }

    private final okhttp3.Request followUpRequest(okhttp3.Response r6, okhttp3.internal.connection.Exchange r7) throws java.io.IOException {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto Le
            okhttp3.internal.connection.RealConnection r1 = r7.getConnection$okhttp()
            if (r1 == 0) goto Le
            okhttp3.Route r1 = r1.route()
            goto Lf
        Le:
            r1 = r0
        Lf:
            int r2 = r6.code()
            okhttp3.Request r3 = r6.request()
            java.lang.String r3 = r3.method()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto Ldf
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto Ldf
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto Ld4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto Lad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L91
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L6f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L3b
            switch(r2) {
                case 300: goto Ldf;
                case 301: goto Ldf;
                case 302: goto Ldf;
                case 303: goto Ldf;
                default: goto L3a;
            }
        L3a:
            return r0
        L3b:
            okhttp3.OkHttpClient r1 = r5.client
            boolean r1 = r1.retryOnConnectionFailure()
            if (r1 != 0) goto L44
            return r0
        L44:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto L55
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto L55
            return r0
        L55:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L62
            int r1 = r1.code()
            if (r1 != r7) goto L62
            return r0
        L62:
            r7 = 0
            int r7 = r5.retryAfter(r6, r7)
            if (r7 <= 0) goto L6a
            return r0
        L6a:
            okhttp3.Request r6 = r6.request()
            return r6
        L6f:
            kotlin.jvm.internal.g0.m(r1)
            java.net.Proxy r7 = r1.proxy()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L89
            okhttp3.OkHttpClient r7 = r5.client
            okhttp3.Authenticator r7 = r7.proxyAuthenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        L89:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L91:
            okhttp3.Response r1 = r6.priorResponse()
            if (r1 == 0) goto L9e
            int r1 = r1.code()
            if (r1 != r7) goto L9e
            return r0
        L9e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.retryAfter(r6, r7)
            if (r7 != 0) goto Lac
            okhttp3.Request r6 = r6.request()
            return r6
        Lac:
            return r0
        Lad:
            okhttp3.Request r1 = r6.request()
            okhttp3.RequestBody r1 = r1.body()
            if (r1 == 0) goto Lbe
            boolean r1 = r1.isOneShot()
            if (r1 == 0) goto Lbe
            return r0
        Lbe:
            if (r7 == 0) goto Ld3
            boolean r1 = r7.isCoalescedConnection$okhttp()
            if (r1 != 0) goto Lc7
            goto Ld3
        Lc7:
            okhttp3.internal.connection.RealConnection r7 = r7.getConnection$okhttp()
            r7.noCoalescedConnections$okhttp()
            okhttp3.Request r6 = r6.request()
            return r6
        Ld3:
            return r0
        Ld4:
            okhttp3.OkHttpClient r7 = r5.client
            okhttp3.Authenticator r7 = r7.authenticator()
            okhttp3.Request r6 = r7.authenticate(r1, r6)
            return r6
        Ldf:
            okhttp3.Request r6 = r5.buildRedirectRequest(r6, r3)
            return r6
    }

    private final boolean isRecoverable(java.io.IOException r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            r2 = 1
            if (r0 == 0) goto L13
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L12
            if (r5 != 0) goto L12
            return r2
        L12:
            return r1
        L13:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L20
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L20
            return r1
        L20:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L25
            return r1
        L25:
            return r2
    }

    private final boolean recover(java.io.IOException r5, okhttp3.internal.connection.RealCall r6, okhttp3.Request r7) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException
            r1 = r0 ^ 1
            okhttp3.OkHttpClient r2 = r4.client
            boolean r2 = r2.retryOnConnectionFailure()
            r3 = 0
            if (r2 != 0) goto Le
            return r3
        Le:
            if (r0 != 0) goto L17
            boolean r7 = r4.requestIsOneShot(r5, r7)
            if (r7 == 0) goto L17
            return r3
        L17:
            boolean r5 = r4.isRecoverable(r5, r1)
            if (r5 != 0) goto L1e
            return r3
        L1e:
            boolean r5 = r6.retryAfterFailure()
            if (r5 != 0) goto L25
            return r3
        L25:
            r5 = 1
            return r5
    }

    private final boolean requestIsOneShot(java.io.IOException r1, okhttp3.Request r2) {
            r0 = this;
            okhttp3.RequestBody r2 = r2.body()
            if (r2 == 0) goto Lc
            boolean r2 = r2.isOneShot()
            if (r2 != 0) goto L10
        Lc:
            boolean r1 = r1 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private final int retryAfter(okhttp3.Response r4, int r5) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "Retry-After"
            java.lang.String r4 = okhttp3.Response.header$default(r4, r2, r0, r1, r0)
            if (r4 != 0) goto Lb
            return r5
        Lb:
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r0 = "\\d+"
            r5.<init>(r0)
            boolean r5 = r5.matches(r4)
            if (r5 == 0) goto L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "valueOf(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            int r4 = r4.intValue()
            return r4
        L27:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r12) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r12, r0)
            okhttp3.internal.http.RealInterceptorChain r12 = (okhttp3.internal.http.RealInterceptorChain) r12
            okhttp3.Request r0 = r12.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r1 = r12.getCall$okhttp()
            java.util.List r2 = kotlin.collections.f0.J()
            r3 = 0
            r4 = 0
            r5 = 1
            r7 = r4
            r6 = 1
            r8 = 0
        L19:
            r1.enterNetworkInterceptorExchange(r0, r6, r12)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Ld3
            okhttp3.Response r6 = r12.proceed(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> Lb4
            okhttp3.Response$Builder r6 = r6.newBuilder()     // Catch: java.lang.Throwable -> L35
            okhttp3.Response$Builder r0 = r6.request(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L39
            okhttp3.Response r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r12 = move-exception
            r3 = 1
            goto Ldb
        L39:
            r6 = r4
        L3a:
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L35
            okhttp3.Response r7 = r0.build()     // Catch: java.lang.Throwable -> L35
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> L35
            okhttp3.Request r6 = r11.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L65
            if (r0 == 0) goto L57
            boolean r12 = r0.isDuplex$okhttp()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L57
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L35
        L57:
            okhttp3.EventListener r12 = r1.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L62
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L62:
            r12 = move-exception
            goto Ldb
        L65:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            okhttp3.EventListener r12 = r1.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L62
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L7c:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L35
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L96
            okhttp3.EventListener r0 = r1.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L35
            r0.followUpDecision(r1, r7, r6)     // Catch: java.lang.Throwable -> L35
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r0 = r6
            r6 = 1
            goto L19
        L96:
            okhttp3.EventListener r12 = r1.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L35
            r12.followUpDecision(r1, r7, r4)     // Catch: java.lang.Throwable -> L35
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            r0.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lb4:
            r6 = move-exception
            boolean r9 = r11.recover(r6, r1, r0)     // Catch: java.lang.Throwable -> L35
            okhttp3.EventListener r10 = r1.getEventListener$okhttp()     // Catch: java.lang.Throwable -> L35
            r10.retryDecision(r1, r6, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto Lce
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L35
            java.util.List r2 = kotlin.collections.f0.J4(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r6 = 0
            goto L19
        Lce:
            java.lang.Throwable r12 = okhttp3.internal._UtilCommonKt.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld3:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ldb:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            throw r12
    }
}
