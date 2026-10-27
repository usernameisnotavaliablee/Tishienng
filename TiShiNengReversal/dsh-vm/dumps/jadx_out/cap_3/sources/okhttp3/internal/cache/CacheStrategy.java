package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CacheStrategy {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache.CacheStrategy.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Response cacheResponse;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Request networkRequest;

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

        public final boolean isCacheable(@org.jetbrains.annotations.NotNull okhttp3.Response r5, @org.jetbrains.annotations.NotNull okhttp3.Request r6) {
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r5.code()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.CacheControl r5 = r5.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7b
                okhttp3.CacheControl r5 = r6.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Factory {
        private int ageSeconds;

        @org.jetbrains.annotations.Nullable
        private final okhttp3.Response cacheResponse;

        @org.jetbrains.annotations.Nullable
        private java.lang.String etag;

        @org.jetbrains.annotations.Nullable
        private java.util.Date expires;

        @org.jetbrains.annotations.Nullable
        private java.util.Date lastModified;

        @org.jetbrains.annotations.Nullable
        private java.lang.String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Request request;
        private long sentRequestMillis;

        @org.jetbrains.annotations.Nullable
        private java.util.Date servedDate;

        @org.jetbrains.annotations.Nullable
        private java.lang.String servedDateString;

        public Factory(long r5, @org.jetbrains.annotations.NotNull okhttp3.Request r7, @org.jetbrains.annotations.Nullable okhttp3.Response r8) {
                r4 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r7, r0)
                r4.<init>()
                r4.nowMillis = r5
                r4.request = r7
                r4.cacheResponse = r8
                r5 = -1
                r4.ageSeconds = r5
                if (r8 == 0) goto L80
                long r6 = r8.sentRequestAtMillis()
                r4.sentRequestMillis = r6
                long r6 = r8.receivedResponseAtMillis()
                r4.receivedResponseMillis = r6
                okhttp3.Headers r6 = r8.headers()
                int r7 = r6.size()
                r8 = 0
            L28:
                if (r8 >= r7) goto L80
                java.lang.String r0 = r6.name(r8)
                java.lang.String r1 = r6.value(r8)
                java.lang.String r2 = "Date"
                r3 = 1
                boolean r2 = kotlin.text.u.a2(r0, r2, r3)
                if (r2 == 0) goto L44
                java.util.Date r0 = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(r1)
                r4.servedDate = r0
                r4.servedDateString = r1
                goto L7d
            L44:
                java.lang.String r2 = "Expires"
                boolean r2 = kotlin.text.u.a2(r0, r2, r3)
                if (r2 == 0) goto L53
                java.util.Date r0 = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(r1)
                r4.expires = r0
                goto L7d
            L53:
                java.lang.String r2 = "Last-Modified"
                boolean r2 = kotlin.text.u.a2(r0, r2, r3)
                if (r2 == 0) goto L64
                java.util.Date r0 = okhttp3.internal.http.DateFormattingKt.toHttpDateOrNull(r1)
                r4.lastModified = r0
                r4.lastModifiedString = r1
                goto L7d
            L64:
                java.lang.String r2 = "ETag"
                boolean r2 = kotlin.text.u.a2(r0, r2, r3)
                if (r2 == 0) goto L6f
                r4.etag = r1
                goto L7d
            L6f:
                java.lang.String r2 = "Age"
                boolean r0 = kotlin.text.u.a2(r0, r2, r3)
                if (r0 == 0) goto L7d
                int r0 = okhttp3.internal._UtilCommonKt.toNonNegativeInt(r1, r5)
                r4.ageSeconds = r0
            L7d:
                int r8 = r8 + 1
                goto L28
            L80:
                return
        }

        private final long cacheResponseAge() {
                r11 = this;
                java.util.Date r0 = r11.servedDate
                r1 = 0
                if (r0 == 0) goto L12
                long r3 = r11.receivedResponseMillis
                long r5 = r0.getTime()
                long r3 = r3 - r5
                long r3 = java.lang.Math.max(r1, r3)
                goto L13
            L12:
                r3 = r1
            L13:
                int r0 = r11.ageSeconds
                r5 = -1
                if (r0 == r5) goto L23
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                long r6 = (long) r0
                long r5 = r5.toMillis(r6)
                long r3 = java.lang.Math.max(r3, r5)
            L23:
                long r5 = r11.receivedResponseMillis
                long r7 = r11.sentRequestMillis
                long r5 = r5 - r7
                long r5 = java.lang.Math.max(r1, r5)
                long r7 = r11.nowMillis
                long r9 = r11.receivedResponseMillis
                long r7 = r7 - r9
                long r0 = java.lang.Math.max(r1, r7)
                long r3 = r3 + r5
                long r3 = r3 + r0
                return r3
        }

        private final okhttp3.internal.cache.CacheStrategy computeCandidate() {
                r13 = this;
                okhttp3.Response r0 = r13.cacheResponse
                r1 = 0
                if (r0 != 0) goto Ld
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            Ld:
                okhttp3.Request r0 = r13.request
                boolean r0 = r0.isHttps()
                if (r0 == 0) goto L25
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Handshake r0 = r0.handshake()
                if (r0 != 0) goto L25
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L25:
                okhttp3.internal.cache.CacheStrategy$Companion r0 = okhttp3.internal.cache.CacheStrategy.Companion
                okhttp3.Response r2 = r13.cacheResponse
                okhttp3.Request r3 = r13.request
                boolean r0 = r0.isCacheable(r2, r3)
                if (r0 != 0) goto L39
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L39:
                okhttp3.Request r0 = r13.request
                okhttp3.CacheControl r0 = r0.cacheControl()
                boolean r2 = r0.noCache()
                if (r2 != 0) goto L122
                okhttp3.Request r2 = r13.request
                boolean r2 = r13.hasConditions(r2)
                if (r2 == 0) goto L4f
                goto L122
            L4f:
                okhttp3.Response r2 = r13.cacheResponse
                okhttp3.CacheControl r2 = r2.cacheControl()
                long r3 = r13.cacheResponseAge()
                long r5 = r13.computeFreshnessLifetime()
                int r7 = r0.maxAgeSeconds()
                r8 = -1
                if (r7 == r8) goto L73
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r9 = r0.maxAgeSeconds()
                long r9 = (long) r9
                long r9 = r7.toMillis(r9)
                long r5 = java.lang.Math.min(r5, r9)
            L73:
                int r7 = r0.minFreshSeconds()
                r9 = 0
                if (r7 == r8) goto L87
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r11 = r0.minFreshSeconds()
                long r11 = (long) r11
                long r11 = r7.toMillis(r11)
                goto L88
            L87:
                r11 = r9
            L88:
                boolean r7 = r2.mustRevalidate()
                if (r7 != 0) goto L9f
                int r7 = r0.maxStaleSeconds()
                if (r7 == r8) goto L9f
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxStaleSeconds()
                long r8 = (long) r0
                long r9 = r7.toMillis(r8)
            L9f:
                boolean r0 = r2.noCache()
                if (r0 != 0) goto Ld8
                long r11 = r11 + r3
                long r9 = r9 + r5
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto Ld8
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Response$Builder r0 = r0.newBuilder()
                java.lang.String r2 = "Warning"
                int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r7 < 0) goto Lbc
                java.lang.String r5 = "110 HttpURLConnection \"Response is stale\""
                r0.addHeader(r2, r5)
            Lbc:
                r5 = 86400000(0x5265c00, double:4.2687272E-316)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto Lce
                boolean r3 = r13.isFreshnessLifetimeHeuristic()
                if (r3 == 0) goto Lce
                java.lang.String r3 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.addHeader(r2, r3)
            Lce:
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r0 = r0.build()
                r2.<init>(r1, r0)
                return r2
            Ld8:
                java.lang.String r0 = r13.etag
                if (r0 == 0) goto Ldf
                java.lang.String r1 = "If-None-Match"
                goto Lf0
            Ldf:
                java.util.Date r0 = r13.lastModified
                java.lang.String r2 = "If-Modified-Since"
                if (r0 == 0) goto Le9
                java.lang.String r0 = r13.lastModifiedString
            Le7:
                r1 = r2
                goto Lf0
            Le9:
                java.util.Date r0 = r13.servedDate
                if (r0 == 0) goto L11a
                java.lang.String r0 = r13.servedDateString
                goto Le7
            Lf0:
                okhttp3.Request r2 = r13.request
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                kotlin.jvm.internal.g0.m(r0)
                r2.addLenient$okhttp(r1, r0)
                okhttp3.Request r0 = r13.request
                okhttp3.Request$Builder r0 = r0.newBuilder()
                okhttp3.Headers r1 = r2.build()
                okhttp3.Request$Builder r0 = r0.headers(r1)
                okhttp3.Request r0 = r0.build()
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r2 = r13.cacheResponse
                r1.<init>(r0, r2)
                return r1
            L11a:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L122:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
        }

        private final long computeFreshnessLifetime() {
                r7 = this;
                okhttp3.Response r0 = r7.cacheResponse
                kotlin.jvm.internal.g0.m(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r2 = -1
                if (r1 == r2) goto L1c
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxAgeSeconds()
                long r2 = (long) r0
                long r0 = r1.toMillis(r2)
                return r0
            L1c:
                java.util.Date r0 = r7.expires
                r1 = 0
                if (r0 == 0) goto L38
                java.util.Date r3 = r7.servedDate
                if (r3 == 0) goto L2b
                long r3 = r3.getTime()
                goto L2d
            L2b:
                long r3 = r7.receivedResponseMillis
            L2d:
                long r5 = r0.getTime()
                long r5 = r5 - r3
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 <= 0) goto L37
                return r5
            L37:
                return r1
            L38:
                java.util.Date r0 = r7.lastModified
                if (r0 == 0) goto L6a
                okhttp3.Response r0 = r7.cacheResponse
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.query()
                if (r0 != 0) goto L6a
                java.util.Date r0 = r7.servedDate
                if (r0 == 0) goto L55
                long r3 = r0.getTime()
                goto L57
            L55:
                long r3 = r7.sentRequestMillis
            L57:
                java.util.Date r0 = r7.lastModified
                kotlin.jvm.internal.g0.m(r0)
                long r5 = r0.getTime()
                long r3 = r3 - r5
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6a
                r0 = 10
                long r0 = (long) r0
                long r3 = r3 / r0
                return r3
            L6a:
                return r1
        }

        private final boolean hasConditions(okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "If-Modified-Since"
                java.lang.String r0 = r2.header(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "If-None-Match"
                java.lang.String r2 = r2.header(r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                return r2
            L13:
                r2 = 1
                return r2
        }

        private final boolean isFreshnessLifetimeHeuristic() {
                r2 = this;
                okhttp3.Response r0 = r2.cacheResponse
                kotlin.jvm.internal.g0.m(r0)
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L16
                java.util.Date r0 = r2.expires
                if (r0 != 0) goto L16
                r0 = 1
                return r0
            L16:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache.CacheStrategy compute() {
                r2 = this;
                okhttp3.internal.cache.CacheStrategy r0 = r2.computeCandidate()
                okhttp3.Request r1 = r0.getNetworkRequest()
                if (r1 == 0) goto L1c
                okhttp3.Request r1 = r2.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r1 = r1.onlyIfCached()
                if (r1 == 0) goto L1c
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                r1 = 0
                r0.<init>(r1, r1)
            L1c:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }
    }

    static {
            okhttp3.internal.cache.CacheStrategy$Companion r0 = new okhttp3.internal.cache.CacheStrategy$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache.CacheStrategy.Companion = r0
            return
    }

    public CacheStrategy(@org.jetbrains.annotations.Nullable okhttp3.Request r1, @org.jetbrains.annotations.Nullable okhttp3.Response r2) {
            r0 = this;
            r0.<init>()
            r0.networkRequest = r1
            r0.cacheResponse = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response getCacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Request getNetworkRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.networkRequest
            return r0
    }
}
