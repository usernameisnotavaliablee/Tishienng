package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1878#2,3:126\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n119#1:126,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BridgeInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(@org.jetbrains.annotations.NotNull okhttp3.CookieJar r2) {
            r1 = this;
            java.lang.String r0 = "cookieJar"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.cookieJar = r2
            return
    }

    private final java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L1d
            kotlin.collections.f0.b0()
        L1d:
            okhttp3.Cookie r2 = (okhttp3.Cookie) r2
            if (r1 <= 0) goto L26
            java.lang.String r1 = "; "
            r0.append(r1)
        L26:
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r2.value()
            r0.append(r1)
            r1 = r3
            goto Lc
        L3b:
            java.lang.String r5 = r0.toString()
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r13, r0)
            okhttp3.Request r0 = r13.request()
            okhttp3.Request$Builder r1 = r0.newBuilder()
            okhttp3.RequestBody r2 = r0.body()
            r3 = -1
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "Content-Length"
            if (r2 == 0) goto L43
            okhttp3.MediaType r7 = r2.contentType()
            if (r7 == 0) goto L26
            java.lang.String r7 = r7.toString()
            r1.header(r5, r7)
        L26:
            long r7 = r2.contentLength()
            java.lang.String r2 = "Transfer-Encoding"
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L3b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.header(r6, r7)
            r1.removeHeader(r2)
            goto L43
        L3b:
            java.lang.String r7 = "chunked"
            r1.header(r2, r7)
            r1.removeHeader(r6)
        L43:
            java.lang.String r2 = "Host"
            java.lang.String r7 = r0.header(r2)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L59
            okhttp3.HttpUrl r7 = r0.url()
            java.lang.String r7 = okhttp3.internal._UtilJvmKt.toHostHeader$default(r7, r8, r9, r10)
            r1.header(r2, r7)
        L59:
            java.lang.String r2 = "Connection"
            java.lang.String r7 = r0.header(r2)
            if (r7 != 0) goto L66
            java.lang.String r7 = "Keep-Alive"
            r1.header(r2, r7)
        L66:
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r7 = r0.header(r2)
            java.lang.String r11 = "gzip"
            if (r7 != 0) goto L7c
            java.lang.String r7 = "Range"
            java.lang.String r7 = r0.header(r7)
            if (r7 != 0) goto L7c
            r1.header(r2, r11)
            r8 = 1
        L7c:
            okhttp3.CookieJar r2 = r12.cookieJar
            okhttp3.HttpUrl r7 = r0.url()
            java.util.List r2 = r2.loadForRequest(r7)
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L98
            java.lang.String r7 = "Cookie"
            java.lang.String r2 = r12.cookieHeader(r2)
            r1.header(r7, r2)
        L98:
            java.lang.String r2 = "User-Agent"
            java.lang.String r0 = r0.header(r2)
            if (r0 != 0) goto La5
            java.lang.String r0 = "okhttp/5.3.0"
            r1.header(r2, r0)
        La5:
            okhttp3.Request r0 = r1.build()
            okhttp3.Response r13 = r13.proceed(r0)
            okhttp3.CookieJar r1 = r12.cookieJar
            okhttp3.HttpUrl r2 = r0.url()
            okhttp3.Headers r7 = r13.headers()
            okhttp3.internal.http.HttpHeaders.receiveHeaders(r1, r2, r7)
            okhttp3.Response$Builder r1 = r13.newBuilder()
            okhttp3.Response$Builder r0 = r1.request(r0)
            if (r8 == 0) goto L10d
            java.lang.String r1 = "Content-Encoding"
            r2 = 2
            java.lang.String r7 = okhttp3.Response.header$default(r13, r1, r10, r2, r10)
            boolean r7 = kotlin.text.u.a2(r11, r7, r9)
            if (r7 == 0) goto L10d
            boolean r7 = okhttp3.internal.http.HttpHeaders.promisesBody(r13)
            if (r7 == 0) goto L10d
            okhttp3.ResponseBody r7 = r13.body()
            if (r7 == 0) goto L10d
            okio.GzipSource r8 = new okio.GzipSource
            okio.BufferedSource r7 = r7.source()
            r8.<init>(r7)
            okhttp3.Headers r7 = r13.headers()
            okhttp3.Headers$Builder r7 = r7.newBuilder()
            okhttp3.Headers$Builder r1 = r7.removeAll(r1)
            okhttp3.Headers$Builder r1 = r1.removeAll(r6)
            okhttp3.Headers r1 = r1.build()
            r0.headers(r1)
            java.lang.String r13 = okhttp3.Response.header$default(r13, r5, r10, r2, r10)
            okhttp3.internal.http.RealResponseBody r1 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r8)
            r1.<init>(r13, r3, r2)
            r0.body(r1)
        L10d:
            okhttp3.Response r13 = r0.build()
            return r13
    }
}
