package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Response implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.ResponseBody body;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Response cacheResponse;
    private final int code;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.connection.Exchange exchange;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Handshake handshake;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;

    @org.jetbrains.annotations.Nullable
    private okhttp3.CacheControl lazyCacheControl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Response networkResponse;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.Response priorResponse;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Protocol protocol;
    private final long receivedResponseAtMillis;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Request request;
    private final long sentRequestAtMillis;

    @org.jetbrains.annotations.Nullable
    private final okio.Socket socket;

    @org.jetbrains.annotations.NotNull
    private okhttp3.TrailersSource trailersSource;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1#2:531\n*E\n"})
    public static class Builder {

        @org.jetbrains.annotations.NotNull
        private okhttp3.ResponseBody body;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Response cacheResponse;
        private int code;

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.connection.Exchange exchange;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Handshake handshake;

        @org.jetbrains.annotations.NotNull
        private okhttp3.Headers.Builder headers;

        @org.jetbrains.annotations.Nullable
        private java.lang.String message;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Response networkResponse;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Response priorResponse;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Protocol protocol;
        private long receivedResponseAtMillis;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Request request;
        private long sentRequestAtMillis;

        @org.jetbrains.annotations.Nullable
        private okio.Socket socket;

        @org.jetbrains.annotations.NotNull
        private okhttp3.TrailersSource trailersSource;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.code = r0
                okhttp3.ResponseBody r0 = okhttp3.ResponseBody.EMPTY
                r1.body = r0
                okhttp3.TrailersSource r0 = okhttp3.TrailersSource.EMPTY
                r1.trailersSource = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.<init>()
                r0 = -1
                r2.code = r0
                okhttp3.ResponseBody r0 = okhttp3.ResponseBody.EMPTY
                r2.body = r0
                okhttp3.TrailersSource r0 = okhttp3.TrailersSource.EMPTY
                r2.trailersSource = r0
                okhttp3.Request r0 = r3.request()
                r2.request = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                okhttp3.Headers r0 = r3.headers()
                okhttp3.Headers$Builder r0 = r0.newBuilder()
                r2.headers = r0
                okhttp3.ResponseBody r0 = r3.body()
                r2.body = r0
                okio.Socket r0 = r3.socket()
                r2.socket = r0
                okhttp3.Response r0 = r3.networkResponse()
                r2.networkResponse = r0
                okhttp3.Response r0 = r3.cacheResponse()
                r2.cacheResponse = r0
                okhttp3.Response r0 = r3.priorResponse()
                r2.priorResponse = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestAtMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseAtMillis = r0
                okhttp3.internal.connection.Exchange r0 = r3.exchange()
                r2.exchange = r0
                okhttp3.TrailersSource r3 = okhttp3.Response.access$getTrailersSource$p(r3)
                r2.trailersSource = r3
                return
        }

        private final void checkSupportResponse(java.lang.String r2, okhttp3.Response r3) {
                r1 = this;
                if (r3 == 0) goto L66
                okhttp3.Response r0 = r3.networkResponse()
                if (r0 != 0) goto L4b
                okhttp3.Response r0 = r3.cacheResponse()
                if (r0 != 0) goto L30
                okhttp3.Response r3 = r3.priorResponse()
                if (r3 != 0) goto L15
                return
            L15:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = ".priorResponse != null"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L30:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = ".cacheResponse != null"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L4b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = ".networkResponse != null"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L66:
                return
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder addHeader(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
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
        public okhttp3.Response.Builder body(@org.jetbrains.annotations.NotNull okhttp3.ResponseBody r2) {
                r1 = this;
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.body = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response build() {
                r19 = this;
                r0 = r19
                int r5 = r0.code
                if (r5 < 0) goto L54
                okhttp3.Request r2 = r0.request
                if (r2 == 0) goto L4c
                okhttp3.Protocol r3 = r0.protocol
                if (r3 == 0) goto L44
                java.lang.String r4 = r0.message
                if (r4 == 0) goto L3c
                okhttp3.Handshake r6 = r0.handshake
                okhttp3.Headers$Builder r1 = r0.headers
                okhttp3.Headers r7 = r1.build()
                okhttp3.ResponseBody r8 = r0.body
                okio.Socket r9 = r0.socket
                okhttp3.Response r10 = r0.networkResponse
                okhttp3.Response r11 = r0.cacheResponse
                okhttp3.Response r12 = r0.priorResponse
                long r13 = r0.sentRequestAtMillis
                r15 = r2
                long r1 = r0.receivedResponseAtMillis
                r16 = r1
                okhttp3.internal.connection.Exchange r1 = r0.exchange
                okhttp3.TrailersSource r2 = r0.trailersSource
                r18 = r2
                r2 = r15
                r15 = r16
                r17 = r1
                okhttp3.Response r1 = new okhttp3.Response
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18)
                return r1
            L3c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "message == null"
                r1.<init>(r2)
                throw r1
            L44:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "protocol == null"
                r1.<init>(r2)
                throw r1
            L4c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "request == null"
                r1.<init>(r2)
                throw r1
            L54:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "code < 0: "
                r1.append(r2)
                int r2 = r0.code
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder cacheResponse(@org.jetbrains.annotations.Nullable okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "cacheResponse"
                r1.checkSupportResponse(r0, r2)
                r1.cacheResponse = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder code(int r1) {
                r0 = this;
                r0.code = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ResponseBody getBody$okhttp() {
                r1 = this;
                okhttp3.ResponseBody r0 = r1.body
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Response getCacheResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.cacheResponse
                return r0
        }

        public final int getCode$okhttp() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
                r1 = this;
                okhttp3.internal.connection.Exchange r0 = r1.exchange
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Handshake getHandshake$okhttp() {
                r1 = this;
                okhttp3.Handshake r0 = r1.handshake
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getMessage$okhttp() {
                r1 = this;
                java.lang.String r0 = r1.message
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Response getNetworkResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.networkResponse
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Response getPriorResponse$okhttp() {
                r1 = this;
                okhttp3.Response r0 = r1.priorResponse
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Protocol getProtocol$okhttp() {
                r1 = this;
                okhttp3.Protocol r0 = r1.protocol
                return r0
        }

        public final long getReceivedResponseAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.receivedResponseAtMillis
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Request getRequest$okhttp() {
                r1 = this;
                okhttp3.Request r0 = r1.request
                return r0
        }

        public final long getSentRequestAtMillis$okhttp() {
                r2 = this;
                long r0 = r2.sentRequestAtMillis
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okio.Socket getSocket$okhttp() {
                r1 = this;
                okio.Socket r0 = r1.socket
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.TrailersSource getTrailersSource$okhttp() {
                r1 = this;
                okhttp3.TrailersSource r0 = r1.trailersSource
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder handshake(@org.jetbrains.annotations.Nullable okhttp3.Handshake r1) {
                r0 = this;
                r0.handshake = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
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
        public okhttp3.Response.Builder headers(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                r1.headers = r2
                return r1
        }

        public final void initExchange$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r2) {
                r1 = this;
                java.lang.String r0 = "exchange"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.exchange = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder message(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "message"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.message = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder networkResponse(@org.jetbrains.annotations.Nullable okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "networkResponse"
                r1.checkSupportResponse(r0, r2)
                r1.networkResponse = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder priorResponse(@org.jetbrains.annotations.Nullable okhttp3.Response r1) {
                r0 = this;
                r0.priorResponse = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder protocol(@org.jetbrains.annotations.NotNull okhttp3.Protocol r2) {
                r1 = this;
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.protocol = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder receivedResponseAtMillis(long r1) {
                r0 = this;
                r0.receivedResponseAtMillis = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder removeHeader(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder request(@org.jetbrains.annotations.NotNull okhttp3.Request r2) {
                r1 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.request = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder sentRequestAtMillis(long r1) {
                r0 = this;
                r0.sentRequestAtMillis = r1
                return r0
        }

        public final void setBody$okhttp(@org.jetbrains.annotations.NotNull okhttp3.ResponseBody r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.body = r2
                return
        }

        public final void setCacheResponse$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Response r1) {
                r0 = this;
                r0.cacheResponse = r1
                return
        }

        public final void setCode$okhttp(int r1) {
                r0 = this;
                r0.code = r1
                return
        }

        public final void setExchange$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r1) {
                r0 = this;
                r0.exchange = r1
                return
        }

        public final void setHandshake$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Handshake r1) {
                r0 = this;
                r0.handshake = r1
                return
        }

        public final void setHeaders$okhttp(@org.jetbrains.annotations.NotNull okhttp3.Headers.Builder r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.headers = r2
                return
        }

        public final void setMessage$okhttp(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.message = r1
                return
        }

        public final void setNetworkResponse$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Response r1) {
                r0 = this;
                r0.networkResponse = r1
                return
        }

        public final void setPriorResponse$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Response r1) {
                r0 = this;
                r0.priorResponse = r1
                return
        }

        public final void setProtocol$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Protocol r1) {
                r0 = this;
                r0.protocol = r1
                return
        }

        public final void setReceivedResponseAtMillis$okhttp(long r1) {
                r0 = this;
                r0.receivedResponseAtMillis = r1
                return
        }

        public final void setRequest$okhttp(@org.jetbrains.annotations.Nullable okhttp3.Request r1) {
                r0 = this;
                r0.request = r1
                return
        }

        public final void setSentRequestAtMillis$okhttp(long r1) {
                r0 = this;
                r0.sentRequestAtMillis = r1
                return
        }

        public final void setSocket$okhttp(@org.jetbrains.annotations.Nullable okio.Socket r1) {
                r0 = this;
                r0.socket = r1
                return
        }

        public final void setTrailersSource$okhttp(@org.jetbrains.annotations.NotNull okhttp3.TrailersSource r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.trailersSource = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder socket(@org.jetbrains.annotations.NotNull okio.Socket r2) {
                r1 = this;
                java.lang.String r0 = "socket"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.socket = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public okhttp3.Response.Builder trailers(@org.jetbrains.annotations.NotNull okhttp3.TrailersSource r2) {
                r1 = this;
                java.lang.String r0 = "trailersSource"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.trailersSource = r2
                return r1
        }
    }

    public Response(@org.jetbrains.annotations.NotNull okhttp3.Request r3, @org.jetbrains.annotations.NotNull okhttp3.Protocol r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6, @org.jetbrains.annotations.Nullable okhttp3.Handshake r7, @org.jetbrains.annotations.NotNull okhttp3.Headers r8, @org.jetbrains.annotations.NotNull okhttp3.ResponseBody r9, @org.jetbrains.annotations.Nullable okio.Socket r10, @org.jetbrains.annotations.Nullable okhttp3.Response r11, @org.jetbrains.annotations.Nullable okhttp3.Response r12, @org.jetbrains.annotations.Nullable okhttp3.Response r13, long r14, long r16, @org.jetbrains.annotations.Nullable okhttp3.internal.connection.Exchange r18, @org.jetbrains.annotations.NotNull okhttp3.TrailersSource r19) {
            r2 = this;
            r0 = r19
            java.lang.String r1 = "request"
            kotlin.jvm.internal.g0.p(r3, r1)
            java.lang.String r1 = "protocol"
            kotlin.jvm.internal.g0.p(r4, r1)
            java.lang.String r1 = "message"
            kotlin.jvm.internal.g0.p(r5, r1)
            java.lang.String r1 = "headers"
            kotlin.jvm.internal.g0.p(r8, r1)
            java.lang.String r1 = "body"
            kotlin.jvm.internal.g0.p(r9, r1)
            java.lang.String r1 = "trailersSource"
            kotlin.jvm.internal.g0.p(r0, r1)
            r2.<init>()
            r2.request = r3
            r2.protocol = r4
            r2.message = r5
            r2.code = r6
            r2.handshake = r7
            r2.headers = r8
            r2.body = r9
            r2.socket = r10
            r2.networkResponse = r11
            r2.cacheResponse = r12
            r2.priorResponse = r13
            r2.sentRequestAtMillis = r14
            r3 = r16
            r2.receivedResponseAtMillis = r3
            r3 = r18
            r2.exchange = r3
            r2.trailersSource = r0
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1
            r5 = 0
            if (r3 > r6) goto L51
            r3 = 300(0x12c, float:4.2E-43)
            if (r6 >= r3) goto L51
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            r2.isSuccessful = r3
            r3 = 307(0x133, float:4.3E-43)
            if (r6 == r3) goto L60
            r3 = 308(0x134, float:4.32E-43)
            if (r6 == r3) goto L60
            switch(r6) {
                case 300: goto L60;
                case 301: goto L60;
                case 302: goto L60;
                case 303: goto L60;
                default: goto L5f;
            }
        L5f:
            r4 = 0
        L60:
            r2.isRedirect = r4
            return
    }

    public static final /* synthetic */ okhttp3.TrailersSource access$getTrailersSource$p(okhttp3.Response r0) {
            okhttp3.TrailersSource r0 = r0.trailersSource
            return r0
    }

    public static /* synthetic */ java.lang.String header$default(okhttp3.Response r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = r0.header(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "body", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_body")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final okhttp3.ResponseBody m166deprecated_body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheControl", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cacheControl")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final okhttp3.CacheControl m167deprecated_cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cacheResponse", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cacheResponse")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final okhttp3.Response m168deprecated_cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "code", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_code")
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m169deprecated_code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "handshake", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_handshake")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final okhttp3.Handshake m170deprecated_handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "headers", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_headers")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final okhttp3.Headers m171deprecated_headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "message", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_message")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final java.lang.String m172deprecated_message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "networkResponse", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_networkResponse")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final okhttp3.Response m173deprecated_networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "priorResponse", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_priorResponse")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final okhttp3.Response m174deprecated_priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocol", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_protocol")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final okhttp3.Protocol m175deprecated_protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_receivedResponseAtMillis")
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m176deprecated_receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "request", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_request")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final okhttp3.Request m177deprecated_request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sentRequestAtMillis")
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m178deprecated_sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "body")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.ResponseBody body() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
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

    @kotlin.jvm.JvmName(name = "cacheResponse")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response cacheResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.cacheResponse
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.Challenge> challenges() {
            r3 = this;
            okhttp3.Headers r0 = r3.headers
            int r1 = r3.code
            r2 = 401(0x191, float:5.62E-43)
            if (r1 == r2) goto L14
            r2 = 407(0x197, float:5.7E-43)
            if (r1 == r2) goto L11
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
        L11:
            java.lang.String r1 = "Proxy-Authenticate"
            goto L16
        L14:
            java.lang.String r1 = "WWW-Authenticate"
        L16:
            java.util.List r0 = okhttp3.internal.http.HttpHeaders.parseChallenges(r0, r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            okhttp3.ResponseBody r0 = r1.body
            r0.close()
            return
    }

    @kotlin.jvm.JvmName(name = "code")
    public final int code() {
            r1 = this;
            int r0 = r1.code
            return r0
    }

    @kotlin.jvm.JvmName(name = "exchange")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.Exchange exchange() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.CacheControl getLazyCacheControl$okhttp() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.lazyCacheControl
            return r0
    }

    @kotlin.jvm.JvmName(name = "handshake")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.Handshake handshake() {
            r1 = this;
            okhttp3.Handshake r0 = r1.handshake
            return r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.lang.String header(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.String r3 = header$default(r2, r3, r0, r1, r0)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.Nullable
    public final java.lang.String header(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            if (r2 != 0) goto Le
            return r3
        Le:
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

    public final boolean isRedirect() {
            r1 = this;
            boolean r0 = r1.isRedirect
            return r0
    }

    public final boolean isSuccessful() {
            r1 = this;
            boolean r0 = r1.isSuccessful
            return r0
    }

    @kotlin.jvm.JvmName(name = "message")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String message() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @kotlin.jvm.JvmName(name = "networkResponse")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response networkResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.networkResponse
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Response.Builder newBuilder() {
            r1 = this;
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.ResponseBody peekBody(long r5) throws java.io.IOException {
            r4 = this;
            okhttp3.ResponseBody r0 = r4.body
            okio.BufferedSource r0 = r0.source()
            okio.BufferedSource r0 = r0.peek()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.request(r5)
            okio.Buffer r2 = r0.getBuffer()
            long r2 = r2.size()
            long r5 = java.lang.Math.min(r5, r2)
            r1.write(r0, r5)
            okhttp3.ResponseBody$Companion r5 = okhttp3.ResponseBody.Companion
            okhttp3.ResponseBody r6 = r4.body
            okhttp3.MediaType r6 = r6.contentType()
            long r2 = r1.size()
            okhttp3.ResponseBody r5 = r5.create(r1, r6, r2)
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
            r1 = this;
            okhttp3.TrailersSource r0 = r1.trailersSource
            okhttp3.Headers r0 = r0.peek()
            return r0
    }

    @kotlin.jvm.JvmName(name = "priorResponse")
    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response priorResponse() {
            r1 = this;
            okhttp3.Response r0 = r1.priorResponse
            return r0
    }

    @kotlin.jvm.JvmName(name = "protocol")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Protocol protocol() {
            r1 = this;
            okhttp3.Protocol r0 = r1.protocol
            return r0
    }

    @kotlin.jvm.JvmName(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
            r2 = this;
            long r0 = r2.receivedResponseAtMillis
            return r0
    }

    @kotlin.jvm.JvmName(name = "request")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @kotlin.jvm.JvmName(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
            r2 = this;
            long r0 = r2.sentRequestAtMillis
            return r0
    }

    public final void setLazyCacheControl$okhttp(@org.jetbrains.annotations.Nullable okhttp3.CacheControl r1) {
            r0 = this;
            r0.lazyCacheControl = r1
            return
    }

    @kotlin.jvm.JvmName(name = "socket")
    @org.jetbrains.annotations.Nullable
    public final okio.Socket socket() {
            r1 = this;
            okio.Socket r0 = r1.socket
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Response{protocol="
            r0.append(r1)
            okhttp3.Protocol r1 = r2.protocol
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.message
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            okhttp3.Request r1 = r2.request
            okhttp3.HttpUrl r1 = r1.url()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers trailers() throws java.io.IOException {
            r1 = this;
            okhttp3.TrailersSource r0 = r1.trailersSource
            okhttp3.Headers r0 = r0.get()
            return r0
    }
}
