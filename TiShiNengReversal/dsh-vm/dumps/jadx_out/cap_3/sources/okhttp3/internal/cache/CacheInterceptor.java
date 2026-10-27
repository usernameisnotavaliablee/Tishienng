package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CacheInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.CacheInterceptor.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Cache cache;

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

        public static final /* synthetic */ okhttp3.Headers access$combine(okhttp3.internal.cache.CacheInterceptor.Companion r0, okhttp3.Headers r1, okhttp3.Headers r2) {
                okhttp3.Headers r0 = r0.combine(r1, r2)
                return r0
        }

        private final okhttp3.Headers combine(okhttp3.Headers r10, okhttp3.Headers r11) {
                r9 = this;
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r10.size()
                r2 = 0
                r3 = 0
            Lb:
                if (r3 >= r1) goto L41
                java.lang.String r4 = r10.name(r3)
                java.lang.String r5 = r10.value(r3)
                java.lang.String r6 = "Warning"
                r7 = 1
                boolean r6 = kotlin.text.u.a2(r6, r4, r7)
                if (r6 == 0) goto L29
                r6 = 2
                r7 = 0
                java.lang.String r8 = "1"
                boolean r6 = kotlin.text.u.H2(r5, r8, r2, r6, r7)
                if (r6 == 0) goto L29
                goto L3e
            L29:
                boolean r6 = r9.isContentSpecificHeader(r4)
                if (r6 != 0) goto L3b
                boolean r6 = r9.isEndToEnd(r4)
                if (r6 == 0) goto L3b
                java.lang.String r6 = r11.get(r4)
                if (r6 != 0) goto L3e
            L3b:
                r0.addLenient$okhttp(r4, r5)
            L3e:
                int r3 = r3 + 1
                goto Lb
            L41:
                int r10 = r11.size()
            L45:
                if (r2 >= r10) goto L61
                java.lang.String r1 = r11.name(r2)
                boolean r3 = r9.isContentSpecificHeader(r1)
                if (r3 != 0) goto L5e
                boolean r3 = r9.isEndToEnd(r1)
                if (r3 == 0) goto L5e
                java.lang.String r3 = r11.value(r2)
                r0.addLenient$okhttp(r1, r3)
            L5e:
                int r2 = r2 + 1
                goto L45
            L61:
                okhttp3.Headers r10 = r0.build()
                return r10
        }

        private final boolean isContentSpecificHeader(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Content-Length"
                r1 = 1
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L1c
                java.lang.String r0 = "Content-Encoding"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L1c
                java.lang.String r0 = "Content-Type"
                boolean r3 = kotlin.text.u.a2(r0, r3, r1)
                if (r3 == 0) goto L1a
                goto L1c
            L1a:
                r3 = 0
                return r3
            L1c:
                return r1
        }

        private final boolean isEndToEnd(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Connection"
                r1 = 1
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Keep-Alive"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authenticate"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authorization"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "TE"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Trailers"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = kotlin.text.u.a2(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Upgrade"
                boolean r3 = kotlin.text.u.a2(r0, r3, r1)
                if (r3 != 0) goto L42
                return r1
            L42:
                r3 = 0
                return r3
        }
    }

    static {
            okhttp3.internal.cache.CacheInterceptor$Companion r0 = new okhttp3.internal.cache.CacheInterceptor$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheInterceptor.Companion = r0
            return
    }

    public CacheInterceptor(@org.jetbrains.annotations.Nullable okhttp3.Cache r1) {
            r0 = this;
            r0.<init>()
            r0.cache = r1
            return
    }

    private final okhttp3.Response cacheWritingResponse(okhttp3.internal.cache.CacheRequest r5, okhttp3.Response r6) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L3
            return r6
        L3:
            okio.Sink r0 = r5.body()
            okhttp3.ResponseBody r1 = r6.body()
            okio.BufferedSource r1 = r1.source()
            okio.BufferedSink r0 = okio.Okio.buffer(r0)
            okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 r2 = new okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            r2.<init>(r1, r5, r0)
            java.lang.String r5 = "Content-Type"
            r0 = 2
            r1 = 0
            java.lang.String r5 = okhttp3.Response.header$default(r6, r5, r1, r0, r1)
            okhttp3.ResponseBody r0 = r6.body()
            long r0 = r0.contentLength()
            okhttp3.Response$Builder r6 = r6.newBuilder()
            okhttp3.internal.http.RealResponseBody r3 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r3.<init>(r5, r0, r2)
            okhttp3.Response$Builder r5 = r6.body(r3)
            okhttp3.Response r5 = r5.build()
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Cache getCache$okhttp() {
            r1 = this;
            okhttp3.Cache r0 = r1.cache
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r9, r0)
            okhttp3.Call r0 = r9.call()
            okhttp3.Cache r1 = r8.cache
            r2 = 0
            if (r1 == 0) goto L1b
            okhttp3.Request r3 = r9.request()
            okhttp3.Request r3 = okhttp3.internal.cache.CacheInterceptorKt.access$requestForCache(r3)
            okhttp3.Response r1 = r1.get$okhttp(r3)
            goto L1c
        L1b:
            r1 = r2
        L1c:
            long r3 = java.lang.System.currentTimeMillis()
            okhttp3.internal.cache.CacheStrategy$Factory r5 = new okhttp3.internal.cache.CacheStrategy$Factory
            okhttp3.Request r6 = r9.request()
            r5.<init>(r3, r6, r1)
            okhttp3.internal.cache.CacheStrategy r3 = r5.compute()
            okhttp3.Request r4 = r3.getNetworkRequest()
            okhttp3.Response r5 = r3.getCacheResponse()
            okhttp3.Cache r6 = r8.cache
            if (r6 == 0) goto L3c
            r6.trackResponse$okhttp(r3)
        L3c:
            boolean r3 = r0 instanceof okhttp3.internal.connection.RealCall
            if (r3 == 0) goto L44
            r3 = r0
            okhttp3.internal.connection.RealCall r3 = (okhttp3.internal.connection.RealCall) r3
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 == 0) goto L4d
            okhttp3.EventListener r3 = r3.getEventListener$okhttp()
            if (r3 != 0) goto L4f
        L4d:
            okhttp3.EventListener r3 = okhttp3.EventListener.NONE
        L4f:
            if (r1 == 0) goto L5a
            if (r5 != 0) goto L5a
            okhttp3.ResponseBody r6 = r1.body()
            okhttp3.internal._UtilCommonKt.closeQuietly(r6)
        L5a:
            if (r4 != 0) goto L93
            if (r5 != 0) goto L93
            okhttp3.Response$Builder r1 = new okhttp3.Response$Builder
            r1.<init>()
            okhttp3.Request r9 = r9.request()
            okhttp3.Response$Builder r9 = r1.request(r9)
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r9 = r9.protocol(r1)
            r1 = 504(0x1f8, float:7.06E-43)
            okhttp3.Response$Builder r9 = r9.code(r1)
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            okhttp3.Response$Builder r9 = r9.message(r1)
            r1 = -1
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r1)
            long r1 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r1)
            okhttp3.Response r9 = r9.build()
            r3.satisfactionFailure(r0, r9)
            return r9
        L93:
            if (r4 != 0) goto Lac
            kotlin.jvm.internal.g0.m(r5)
            okhttp3.Response$Builder r9 = r5.newBuilder()
            okhttp3.Response r1 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r5)
            okhttp3.Response$Builder r9 = r9.cacheResponse(r1)
            okhttp3.Response r9 = r9.build()
            r3.cacheHit(r0, r9)
            return r9
        Lac:
            if (r5 == 0) goto Lb2
            r3.cacheConditionalHit(r0, r5)
            goto Lb9
        Lb2:
            okhttp3.Cache r6 = r8.cache
            if (r6 == 0) goto Lb9
            r3.cacheMiss(r0)
        Lb9:
            okhttp3.Response r9 = r9.proceed(r4)     // Catch: java.lang.Throwable -> L18c
            if (r9 != 0) goto Lc8
            if (r1 == 0) goto Lc8
            okhttp3.ResponseBody r1 = r1.body()
            okhttp3.internal._UtilCommonKt.closeQuietly(r1)
        Lc8:
            if (r5 == 0) goto L12d
            if (r9 == 0) goto L126
            int r1 = r9.code()
            r6 = 304(0x130, float:4.26E-43)
            if (r1 != r6) goto L126
            okhttp3.Response$Builder r1 = r5.newBuilder()
            okhttp3.internal.cache.CacheInterceptor$Companion r2 = okhttp3.internal.cache.CacheInterceptor.Companion
            okhttp3.Headers r4 = r5.headers()
            okhttp3.Headers r6 = r9.headers()
            okhttp3.Headers r2 = okhttp3.internal.cache.CacheInterceptor.Companion.access$combine(r2, r4, r6)
            okhttp3.Response$Builder r1 = r1.headers(r2)
            long r6 = r9.sentRequestAtMillis()
            okhttp3.Response$Builder r1 = r1.sentRequestAtMillis(r6)
            long r6 = r9.receivedResponseAtMillis()
            okhttp3.Response$Builder r1 = r1.receivedResponseAtMillis(r6)
            okhttp3.Response r2 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r5)
            okhttp3.Response$Builder r1 = r1.cacheResponse(r2)
            okhttp3.Response r2 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r9)
            okhttp3.Response$Builder r1 = r1.networkResponse(r2)
            okhttp3.Response r1 = r1.build()
            okhttp3.ResponseBody r9 = r9.body()
            r9.close()
            okhttp3.Cache r9 = r8.cache
            kotlin.jvm.internal.g0.m(r9)
            r9.trackConditionalCacheHit$okhttp()
            okhttp3.Cache r9 = r8.cache
            r9.update$okhttp(r5, r1)
            r3.cacheHit(r0, r1)
            return r1
        L126:
            okhttp3.ResponseBody r1 = r5.body()
            okhttp3.internal._UtilCommonKt.closeQuietly(r1)
        L12d:
            kotlin.jvm.internal.g0.m(r9)
            okhttp3.Response$Builder r1 = r9.newBuilder()
            if (r5 == 0) goto L13a
            okhttp3.Response r2 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r5)
        L13a:
            okhttp3.Response$Builder r1 = r1.cacheResponse(r2)
            okhttp3.Response r9 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r9)
            okhttp3.Response$Builder r9 = r1.networkResponse(r9)
            okhttp3.Response r9 = r9.build()
            okhttp3.Cache r1 = r8.cache
            if (r1 == 0) goto L18b
            okhttp3.Request r1 = okhttp3.internal.cache.CacheInterceptorKt.access$requestForCache(r4)
            boolean r2 = okhttp3.internal.http.HttpHeaders.promisesBody(r9)
            if (r2 == 0) goto L17c
            okhttp3.internal.cache.CacheStrategy$Companion r2 = okhttp3.internal.cache.CacheStrategy.Companion
            boolean r2 = r2.isCacheable(r9, r1)
            if (r2 == 0) goto L17c
            okhttp3.Cache r2 = r8.cache
            okhttp3.Response$Builder r4 = r9.newBuilder()
            okhttp3.Response$Builder r1 = r4.request(r1)
            okhttp3.Response r1 = r1.build()
            okhttp3.internal.cache.CacheRequest r1 = r2.put$okhttp(r1)
            okhttp3.Response r9 = r8.cacheWritingResponse(r1, r9)
            if (r5 == 0) goto L17b
            r3.cacheMiss(r0)
        L17b:
            return r9
        L17c:
            java.lang.String r0 = r4.method()
            boolean r0 = okhttp3.internal.http.HttpMethod.invalidatesCache(r0)
            if (r0 == 0) goto L18b
            okhttp3.Cache r0 = r8.cache     // Catch: java.io.IOException -> L18b
            r0.remove$okhttp(r4)     // Catch: java.io.IOException -> L18b
        L18b:
            return r9
        L18c:
            r9 = move-exception
            if (r1 == 0) goto L196
            okhttp3.ResponseBody r0 = r1.body()
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)
        L196:
            throw r9
    }
}
