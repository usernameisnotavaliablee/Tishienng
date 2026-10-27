package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,495:1\n92#1:497\n1#2:496\n1878#3,3:498\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n107#1:497\n180#1:498,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Request {

    @org.jetbrains.annotations.Nullable
    private final okhttp3.RequestBody body;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.HttpUrl cacheUrlOverride;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Headers headers;

    @org.jetbrains.annotations.Nullable
    private okhttp3.CacheControl lazyCacheControl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String method;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.Tags tags;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.HttpUrl url;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {

        @org.jetbrains.annotations.Nullable
        private okhttp3.RequestBody body;

        @org.jetbrains.annotations.Nullable
        private okhttp3.HttpUrl cacheUrlOverride;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Headers.Builder headers;

        @org.jetbrains.annotations.NotNull
        private java.lang.String method;

        @org.jetbrains.annotations.NotNull
        private okhttp3.internal.Tags tags;

        @org.jetbrains.annotations.Nullable
        private okhttp3.HttpUrl url;

        public Builder() {
                r1 = this;
                r1.<init>()
                okhttp3.internal.EmptyTags r0 = okhttp3.internal.EmptyTags.INSTANCE
                r1.tags = r0
                java.lang.String r0 = "GET"
                r1.method = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                okhttp3.internal.EmptyTags r0 = okhttp3.internal.EmptyTags.INSTANCE
                r1.tags = r0
                okhttp3.HttpUrl r0 = r2.url()
                r1.url = r0
                java.lang.String r0 = r2.method()
                r1.method = r0
                okhttp3.RequestBody r0 = r2.body()
                r1.body = r0
                okhttp3.internal.Tags r0 = r2.getTags$okhttp()
                r1.tags = r0
                okhttp3.Headers r0 = r2.headers()
                okhttp3.Headers$Builder r0 = r0.newBuilder()
                r1.headers = r0
                okhttp3.HttpUrl r2 = r2.cacheUrlOverride()
                r1.cacheUrlOverride = r2
                return
        }

        private final java.lang.String canonicalUrl(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "ws:"
                r1 = 1
                boolean r0 = kotlin.text.u.F2(r4, r0, r1)
                java.lang.String r2 = "substring(...)"
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
                java.lang.String r4 = r4.substring(r1)
                kotlin.jvm.internal.g0.o(r4, r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                return r4
            L25:
                java.lang.String r0 = "wss:"
                boolean r0 = kotlin.text.u.F2(r4, r0, r1)
                if (r0 == 0) goto L46
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                java.lang.String r4 = r4.substring(r1)
                kotlin.jvm.internal.g0.o(r4, r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L46:
                return r4
        }

        public static /* synthetic */ okhttp3.Request.Builder delete$default(okhttp3.Request.Builder r0, okhttp3.RequestBody r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Ld
                r2 = r2 & 1
                if (r2 == 0) goto L8
                okhttp3.RequestBody r1 = okhttp3.RequestBody.EMPTY
            L8:
                okhttp3.Request$Builder r0 = r0.delete(r1)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder addHeader(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.add(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request build() {
                r1 = this;
                okhttp3.Request r0 = new okhttp3.Request
                r0.<init>(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder cacheControl(@org.jetbrains.annotations.NotNull okhttp3.CacheControl r3) {
                r2 = this;
                java.lang.String r0 = "cacheControl"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r3 = r3.toString()
                int r0 = r3.length()
                java.lang.String r1 = "Cache-Control"
                if (r0 != 0) goto L16
                okhttp3.Request$Builder r3 = r2.removeHeader(r1)
                return r3
            L16:
                okhttp3.Request$Builder r3 = r2.header(r1, r3)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request.Builder cacheUrlOverride(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r1) {
                r0 = this;
                r0.cacheUrlOverride = r1
                return r0
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request.Builder delete() {
                r2 = this;
                r0 = 0
                r1 = 1
                okhttp3.Request$Builder r0 = delete$default(r2, r0, r1, r0)
                return r0
        }

        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder delete(@org.jetbrains.annotations.Nullable okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "DELETE"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder get() {
                r2 = this;
                java.lang.String r0 = "GET"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.RequestBody getBody$okhttp() {
                r1 = this;
                okhttp3.RequestBody r0 = r1.body
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl getCacheUrlOverride$okhttp() {
                r1 = this;
                okhttp3.HttpUrl r0 = r1.cacheUrlOverride
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMethod$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.method
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.Tags getTags$okhttp() {
                r1 = this;
                okhttp3.internal.Tags r0 = r1.tags
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.HttpUrl getUrl$okhttp() {
                r1 = this;
                okhttp3.HttpUrl r0 = r1.url
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request.Builder gzip() {
                r4 = this;
                okhttp3.RequestBody r0 = r4.body
                if (r0 == 0) goto L38
                okhttp3.Headers$Builder r1 = r4.headers
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = r1.get(r2)
                if (r1 != 0) goto L1d
                okhttp3.Headers$Builder r1 = r4.headers
                java.lang.String r3 = "gzip"
                r1.add(r2, r3)
                okhttp3.internal.http.GzipRequestBody r1 = new okhttp3.internal.http.GzipRequestBody
                r1.<init>(r0)
                r4.body = r1
                return r4
            L1d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Content-Encoding already set: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L38:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "cannot gzip a request that has no body"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder head() {
                r2 = this;
                java.lang.String r0 = "HEAD"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.set(r2, r3)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder headers(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                r1.headers = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder method(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable okhttp3.RequestBody r4) {
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.g0.p(r3, r0)
                int r0 = r3.length()
                if (r0 <= 0) goto L5d
                java.lang.String r0 = "method "
                if (r4 != 0) goto L34
                boolean r1 = okhttp3.internal.http.HttpMethod.requiresRequestBody(r3)
                if (r1 != 0) goto L16
                goto L3a
            L16:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = " must have a request body."
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L34:
                boolean r1 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
                if (r1 == 0) goto L3f
            L3a:
                r2.method = r3
                r2.body = r4
                return r2
            L3f:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = " must not have a request body."
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L5d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "method.isEmpty() == true"
                r3.<init>(r4)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder patch(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "PATCH"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder post(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "POST"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder put(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "PUT"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder query(@org.jetbrains.annotations.NotNull okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "QUERY"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        @kotlin.jvm.JvmName(name = "reifiedTag")
        public final /* synthetic */ <T> okhttp3.Request.Builder reifiedTag(T r3) {
                r2 = this;
                r0 = 4
                java.lang.String r1 = "T"
                kotlin.jvm.internal.g0.y(r0, r1)
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
                okhttp3.Request$Builder r3 = r2.tag(r0, r3)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder removeHeader(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        public final void setBody$okhttp(@org.jetbrains.annotations.Nullable okhttp3.RequestBody r1) {
                r0 = this;
                r0.body = r1
                return
        }

        public final void setCacheUrlOverride$okhttp(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r1) {
                r0 = this;
                r0.cacheUrlOverride = r1
                return
        }

        public final void setHeaders$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.headers = r2
                return
        }

        public final void setMethod$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.method = r2
                return
        }

        public final void setTags$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.Tags r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.tags = r2
                return
        }

        public final void setUrl$okhttp(@org.jetbrains.annotations.Nullable okhttp3.HttpUrl r1) {
                r0 = this;
                r0.url = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public <T> okhttp3.Request.Builder tag(@org.jetbrains.annotations.NotNull java.lang.Class<? super T> r2, @org.jetbrains.annotations.Nullable T r3) {
                r1 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.d r2 = k3.a.i(r2)
                okhttp3.Request$Builder r2 = r1.tag(r2, r3)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder tag(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
                okhttp3.Request$Builder r2 = r1.tag(r0, r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public final <T> okhttp3.Request.Builder tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2, @org.jetbrains.annotations.Nullable T r3) {
                r1 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.Tags r0 = r1.tags
                okhttp3.internal.Tags r2 = r0.plus(r2, r3)
                r1.tags = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r2 = r1.canonicalUrl(r2)
                okhttp3.HttpUrl r2 = r0.get(r2)
                okhttp3.Request$Builder r2 = r1.url(r2)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull java.net.URL r3) {
                r2 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                okhttp3.HttpUrl r3 = r0.get(r3)
                okhttp3.Request$Builder r3 = r2.url(r3)
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Request.Builder url(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.url = r2
                return r1
        }
    }

    public Request(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2, @org.jetbrains.annotations.NotNull okhttp3.Headers r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.Nullable okhttp3.RequestBody r5) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r2 = r0.url(r2)
            okhttp3.Request$Builder r2 = r2.headers(r3)
            java.lang.String r3 = "\u0000"
            boolean r3 = kotlin.jvm.internal.g0.g(r4, r3)
            if (r3 != 0) goto L25
            goto L2c
        L25:
            if (r5 == 0) goto L2a
            java.lang.String r4 = "POST"
            goto L2c
        L2a:
            java.lang.String r4 = "GET"
        L2c:
            okhttp3.Request$Builder r2 = r2.method(r4, r5)
            r1.<init>(r2)
            return
    }

    public /* synthetic */ Request(okhttp3.HttpUrl r1, okhttp3.Headers r2, java.lang.String r3, okhttp3.RequestBody r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Ld
            okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            okhttp3.Headers r2 = r2.of(r6)
        Ld:
            r6 = r5 & 4
            if (r6 == 0) goto L13
            java.lang.String r3 = "\u0000"
        L13:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            r4 = 0
        L18:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public Request(@org.jetbrains.annotations.NotNull okhttp3.Request.Builder r2) {
            r1 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            okhttp3.HttpUrl r0 = r2.getUrl$okhttp()
            if (r0 == 0) goto L33
            r1.url = r0
            java.lang.String r0 = r2.getMethod$okhttp()
            r1.method = r0
            okhttp3.Headers$Builder r0 = r2.getHeaders$okhttp()
            okhttp3.Headers r0 = r0.build()
            r1.headers = r0
            okhttp3.RequestBody r0 = r2.getBody$okhttp()
            r1.body = r0
            okhttp3.HttpUrl r0 = r2.getCacheUrlOverride$okhttp()
            r1.cacheUrlOverride = r0
            okhttp3.internal.Tags r2 = r2.getTags$okhttp()
            r1.tags = r2
            return
        L33:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "url == null"
            r2.<init>(r0)
            throw r2
    }

    private final java.lang.String shellEscape(java.lang.String r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            r6 = 4
            r7 = 0
            java.lang.String r3 = "'"
            java.lang.String r4 = "'\\''"
            r5 = 0
            r2 = r9
            java.lang.String r9 = kotlin.text.u.x2(r2, r3, r4, r5, r6, r7)
            r0.append(r9)
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static /* synthetic */ java.lang.String toCurl$default(okhttp3.Request r0, boolean r1, int r2, java.lang.Object r3) {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = 1
        L5:
            java.lang.String r0 = r0.toCurl(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_body")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.RequestBody m161deprecated_body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cacheControl")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m162deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_headers")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m163deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "method", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_method")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final java.lang.String m164deprecated_method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_url")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m165deprecated_url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }

    @kotlin.jvm.JvmName(name = "body")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.RequestBody body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    @kotlin.jvm.JvmName(name = "cacheControl")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CacheControl cacheControl() {
            r2 = this;
            okhttp3.CacheControl r0 = r2.lazyCacheControl
            if (r0 != 0) goto Le
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.Headers r1 = r2.headers
            okhttp3.CacheControl r0 = r0.parse(r1)
            r2.lazyCacheControl = r0
        Le:
            return r0
    }

    @kotlin.jvm.JvmName(name = "cacheUrlOverride")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.HttpUrl cacheUrlOverride() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.cacheUrlOverride
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.Tags getTags$okhttp() {
            r1 = this;
            okhttp3.internal.Tags r0 = r1.tags
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String header(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> headers(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.util.List r2 = r0.values(r2)
            return r2
    }

    @kotlin.jvm.JvmName(name = "headers")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    public final boolean isHttps() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            boolean r0 = r0.isHttps()
            return r0
    }

    @kotlin.jvm.JvmName(name = "method")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request.Builder newBuilder() {
            r1 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmName(name = "reifiedTag")
    public final /* synthetic */ <T> T reifiedTag() {
            r2 = this;
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            java.lang.Object r0 = r2.tag(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object tag() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            java.lang.Object r0 = r1.tag(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.d r2 = k3.a.i(r2)
            java.lang.Object r2 = r1.tag(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final <T> T tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Class r0 = k3.a.e(r3)
            okhttp3.internal.Tags r1 = r2.tags
            java.lang.Object r3 = r1.get(r3)
            java.lang.Object r3 = r0.cast(r3)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toCurl() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r0 = toCurl$default(r3, r2, r0, r1)
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toCurl(boolean r10) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "curl "
            r1.append(r2)
            okhttp3.HttpUrl r2 = r9.url
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r9.shellEscape(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            okhttp3.RequestBody r1 = r9.body
            r2 = 0
            if (r1 == 0) goto L33
            okhttp3.MediaType r1 = r1.contentType()
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.toString()
            goto L34
        L33:
            r1 = r2
        L34:
            if (r10 == 0) goto L3d
            okhttp3.RequestBody r3 = r9.body
            if (r3 == 0) goto L3d
            java.lang.String r3 = "POST"
            goto L3f
        L3d:
            java.lang.String r3 = "GET"
        L3f:
            java.lang.String r4 = r9.method
            boolean r3 = kotlin.jvm.internal.g0.g(r4, r3)
            if (r3 != 0) goto L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " \\\n  -X "
            r3.append(r4)
            java.lang.String r4 = r9.method
            java.lang.String r4 = r9.shellEscape(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L61:
            okhttp3.Headers r3 = r9.headers
            java.util.Iterator r3 = r3.iterator()
        L67:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = " \\\n  -H "
            r6 = 1
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r3.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r7 = r4.component1()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r4.component2()
            java.lang.String r4 = (java.lang.String) r4
            if (r1 == 0) goto L8c
            java.lang.String r8 = "Content-Type"
            boolean r6 = kotlin.text.u.a2(r7, r8, r6)
            if (r6 != 0) goto L67
        L8c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r7 = ": "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r9.shellEscape(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.append(r4)
            goto L67
        Lb7:
            if (r1 == 0) goto Le0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Type: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r1 = r9.shellEscape(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
        Le0:
            if (r10 == 0) goto L135
            okhttp3.RequestBody r10 = r9.body
            if (r10 == 0) goto L135
            okio.Buffer r10 = new okio.Buffer
            r10.<init>()
            okhttp3.RequestBody r1 = r9.body
            r1.writeTo(r10)
            r3 = 0
            boolean r1 = okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8$default(r10, r3, r6, r2)
            if (r1 == 0) goto L115
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " \\\n  --data "
            r1.append(r2)
            java.lang.String r10 = r10.readUtf8()
            java.lang.String r10 = r9.shellEscape(r10)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.append(r10)
            goto L135
        L115:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " \\\n  --data-binary "
            r1.append(r2)
            okio.ByteString r10 = r10.readByteString()
            java.lang.String r10 = r10.hex()
            java.lang.String r10 = r9.shellEscape(r10)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.append(r10)
        L135:
            java.lang.String r10 = r0.toString()
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = "Request{method="
            r0.append(r1)
            java.lang.String r1 = r6.method
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            okhttp3.HttpUrl r1 = r6.url
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            int r1 = r1.size()
            if (r1 == 0) goto L6f
            java.lang.String r1 = ", headers=["
            r0.append(r1)
            okhttp3.Headers r1 = r6.headers
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L40
            kotlin.collections.f0.b0()
        L40:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.component2()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto L55
            java.lang.String r2 = ", "
            r0.append(r2)
        L55:
            r0.append(r5)
            r2 = 58
            r0.append(r2)
            boolean r2 = okhttp3.internal._UtilCommonKt.isSensitiveHeader(r5)
            if (r2 == 0) goto L65
            java.lang.String r3 = "██"
        L65:
            r0.append(r3)
            r2 = r4
            goto L2f
        L6a:
            r1 = 93
            r0.append(r1)
        L6f:
            okhttp3.internal.Tags r1 = r6.tags
            okhttp3.internal.EmptyTags r2 = okhttp3.internal.EmptyTags.INSTANCE
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L83
            java.lang.String r1 = ", tags="
            r0.append(r1)
            okhttp3.internal.Tags r1 = r6.tags
            r0.append(r1)
        L83:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @kotlin.jvm.JvmName(name = "url")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
