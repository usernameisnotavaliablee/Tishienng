package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CONNECTION = "connection";

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2ExchangeCodec.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ENCODING = "encoding";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HOST = "host";

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_REQUEST_HEADERS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> HTTP_2_SKIPPED_RESPONSE_HEADERS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEEP_ALIVE = "keep-alive";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PROXY_CONNECTION = "proxy-connection";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TE = "te";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TRANSFER_ENCODING = "transfer-encoding";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String UPGRADE = "upgrade";
    private volatile boolean canceled;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http.ExchangeCodec.Carrier carrier;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http.RealInterceptorChain chain;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection http2Connection;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Protocol protocol;

    @org.jetbrains.annotations.Nullable
    private volatile okhttp3.internal.http2.Http2Stream stream;

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

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.internal.http2.Header> http2HeadersList(@org.jetbrains.annotations.NotNull okhttp3.Request r7) {
                r6 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.g0.p(r7, r0)
                okhttp3.Headers r0 = r7.headers()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + 4
                r1.<init>(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_METHOD
                java.lang.String r4 = r7.method()
                r2.<init>(r3, r4)
                r1.add(r2)
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_PATH
                okhttp3.internal.http.RequestLine r4 = okhttp3.internal.http.RequestLine.INSTANCE
                okhttp3.HttpUrl r5 = r7.url()
                java.lang.String r4 = r4.requestPath(r5)
                r2.<init>(r3, r4)
                r1.add(r2)
                java.lang.String r2 = "Host"
                java.lang.String r2 = r7.header(r2)
                if (r2 == 0) goto L48
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                okio.ByteString r4 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                r3.<init>(r4, r2)
                r1.add(r3)
            L48:
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_SCHEME
                okhttp3.HttpUrl r7 = r7.url()
                java.lang.String r7 = r7.scheme()
                r2.<init>(r3, r7)
                r1.add(r2)
                int r7 = r0.size()
                r2 = 0
            L5f:
                if (r2 >= r7) goto La2
                java.lang.String r3 = r0.name(r2)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "US"
                kotlin.jvm.internal.g0.o(r4, r5)
                java.lang.String r3 = r3.toLowerCase(r4)
                java.lang.String r4 = "toLowerCase(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                java.util.List r4 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp()
                boolean r4 = r4.contains(r3)
                if (r4 == 0) goto L93
                java.lang.String r4 = "te"
                boolean r4 = kotlin.jvm.internal.g0.g(r3, r4)
                if (r4 == 0) goto L9f
                java.lang.String r4 = r0.value(r2)
                java.lang.String r5 = "trailers"
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
                if (r4 == 0) goto L9f
            L93:
                okhttp3.internal.http2.Header r4 = new okhttp3.internal.http2.Header
                java.lang.String r5 = r0.value(r2)
                r4.<init>(r3, r5)
                r1.add(r4)
            L9f:
                int r2 = r2 + 1
                goto L5f
            La2:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Response.Builder readHttp2HeadersList(@org.jetbrains.annotations.NotNull okhttp3.Headers r8, @org.jetbrains.annotations.NotNull okhttp3.Protocol r9) {
                r7 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "protocol"
                kotlin.jvm.internal.g0.p(r9, r0)
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r8.size()
                r2 = 0
                r3 = 0
            L15:
                if (r3 >= r1) goto L4f
                java.lang.String r4 = r8.name(r3)
                java.lang.String r5 = r8.value(r3)
                java.lang.String r6 = ":status"
                boolean r6 = kotlin.jvm.internal.g0.g(r4, r6)
                if (r6 == 0) goto L3f
                okhttp3.internal.http.StatusLine$Companion r2 = okhttp3.internal.http.StatusLine.Companion
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "HTTP/1.1 "
                r4.append(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                okhttp3.internal.http.StatusLine r2 = r2.parse(r4)
                goto L4c
            L3f:
                java.util.List r6 = okhttp3.internal.http2.Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp()
                boolean r6 = r6.contains(r4)
                if (r6 != 0) goto L4c
                r0.addLenient$okhttp(r4, r5)
            L4c:
                int r3 = r3 + 1
                goto L15
            L4f:
                if (r2 == 0) goto L6f
                okhttp3.Response$Builder r8 = new okhttp3.Response$Builder
                r8.<init>()
                okhttp3.Response$Builder r8 = r8.protocol(r9)
                int r9 = r2.code
                okhttp3.Response$Builder r8 = r8.code(r9)
                java.lang.String r9 = r2.message
                okhttp3.Response$Builder r8 = r8.message(r9)
                okhttp3.Headers r9 = r0.build()
                okhttp3.Response$Builder r8 = r8.headers(r9)
                return r8
            L6f:
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "Expected ':status' header not present"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r0 = new okhttp3.internal.http2.Http2ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2ExchangeCodec.Companion = r0
            java.lang.String r12 = ":scheme"
            java.lang.String r13 = ":authority"
            java.lang.String r2 = "connection"
            java.lang.String r3 = "host"
            java.lang.String r4 = "keep-alive"
            java.lang.String r5 = "proxy-connection"
            java.lang.String r6 = "te"
            java.lang.String r7 = "transfer-encoding"
            java.lang.String r8 = "encoding"
            java.lang.String r9 = "upgrade"
            java.lang.String r10 = ":method"
            java.lang.String r11 = ":path"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = okhttp3.internal._UtilJvmKt.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS = r0
            java.lang.String r7 = "encoding"
            java.lang.String r8 = "upgrade"
            java.lang.String r1 = "connection"
            java.lang.String r2 = "host"
            java.lang.String r3 = "keep-alive"
            java.lang.String r4 = "proxy-connection"
            java.lang.String r5 = "te"
            java.lang.String r6 = "transfer-encoding"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = okhttp3.internal._UtilJvmKt.immutableListOf(r0)
            okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS = r0
            return
    }

    public Http2ExchangeCodec(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http.ExchangeCodec.Carrier r3, @org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r5) {
            r1 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "carrier"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "http2Connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.carrier = r3
            r1.chain = r4
            r1.http2Connection = r5
            java.util.List r2 = r2.protocols()
            okhttp3.Protocol r3 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_2
        L2c:
            r1.protocol = r3
            return
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS
            return r0
    }

    public static final /* synthetic */ java.util.List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
            java.util.List<java.lang.String> r0 = okhttp3.internal.http2.Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r2 = this;
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.http2.Http2Stream r0 = r2.stream
            if (r0 == 0) goto Lc
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r0.closeLater(r1)
        Lc:
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r1, long r2) {
            r0 = this;
            java.lang.String r2 = "request"
            kotlin.jvm.internal.g0.p(r1, r2)
            okhttp3.internal.http2.Http2Stream r1 = r0.stream
            kotlin.jvm.internal.g0.m(r1)
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r1.getSink()
            return r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink()
            r0.close()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.http2Connection
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.http.ExchangeCodec.Carrier getCarrier() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r1.carrier
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    /* renamed from: getSocket */
    public okio.Socket mo64getSocket() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
            r3 = this;
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isSourceComplete()
            r2 = 1
            if (r0 != r2) goto Ld
            return r2
        Ld:
            return r1
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r2) {
            r1 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.http2.Http2Stream r2 = r1.stream
            kotlin.jvm.internal.g0.m(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r2 = r2.getSource()
            return r2
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Headers peekTrailers() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream r0 = r1.stream
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.Headers r0 = r0.peekTrailers()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Response.Builder readResponseHeaders(boolean r4) {
            r3 = this;
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto L1d
            okhttp3.Headers r0 = r0.takeHeaders(r4)
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            okhttp3.Protocol r2 = r3.protocol
            okhttp3.Response$Builder r0 = r1.readHttp2HeadersList(r0, r2)
            if (r4 == 0) goto L1c
            int r4 = r0.getCode$okhttp()
            r1 = 100
            if (r4 != r1) goto L1c
            r4 = 0
            return r4
        L1c:
            return r0
        L1d:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "stream wasn't created"
            r4.<init>(r0)
            throw r4
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r3)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            long r0 = okhttp3.internal._UtilJvmKt.headersContentLength(r3)
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r4) {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.internal.http2.Http2Stream r0 = r3.stream
            if (r0 == 0) goto La
            return
        La:
            okhttp3.RequestBody r0 = r4.body()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            okhttp3.internal.http2.Http2ExchangeCodec$Companion r1 = okhttp3.internal.http2.Http2ExchangeCodec.Companion
            java.util.List r4 = r1.http2HeadersList(r4)
            okhttp3.internal.http2.Http2Connection r1 = r3.http2Connection
            okhttp3.internal.http2.Http2Stream r4 = r1.newStream(r4, r0)
            r3.stream = r4
            boolean r4 = r3.canceled
            if (r4 != 0) goto L4e
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.g0.m(r4)
            okio.Timeout r4 = r4.readTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getReadTimeoutMillis$okhttp()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r0, r2)
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.g0.m(r4)
            okio.Timeout r4 = r4.writeTimeout()
            okhttp3.internal.http.RealInterceptorChain r0 = r3.chain
            int r0 = r0.getWriteTimeoutMillis$okhttp()
            long r0 = (long) r0
            r4.timeout(r0, r2)
            return
        L4e:
            okhttp3.internal.http2.Http2Stream r4 = r3.stream
            kotlin.jvm.internal.g0.m(r4)
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r4.closeLater(r0)
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r4.<init>(r0)
            throw r4
    }
}
