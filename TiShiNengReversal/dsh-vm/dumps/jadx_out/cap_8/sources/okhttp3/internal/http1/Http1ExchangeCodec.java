package okhttp3.internal.http1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http1ExchangeCodec implements okhttp3.internal.http.ExchangeCodec {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http1.Http1ExchangeCodec.Companion Companion = null;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.Headers TRAILERS_RESPONSE_BODY_TRUNCATED = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http.ExchangeCodec.Carrier carrier;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.OkHttpClient client;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http1.HeadersReader headersReader;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.BufferedSocket socket;
    private int state;

    @org.jetbrains.annotations.Nullable
    private okhttp3.Headers trailers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class AbstractSource implements okio.Source {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.ForwardingTimeout timeout;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.HttpUrl url;

        public AbstractSource(@org.jetbrains.annotations.NotNull okhttp3.internal.http1.Http1ExchangeCodec r2, okhttp3.HttpUrl r3) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.url = r3
                okio.ForwardingTimeout r3 = new okio.ForwardingTimeout
                okhttp3.internal.connection.BufferedSocket r2 = r2.getSocket()
                okio.BufferedSource r2 = r2.getSource()
                okio.Timeout r2 = r2.timeout()
                r3.<init>(r2)
                r1.timeout = r3
                return
        }

        protected final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        @org.jetbrains.annotations.NotNull
        protected final okio.ForwardingTimeout getTimeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.HttpUrl getUrl() {
                r1 = this;
                okhttp3.HttpUrl r0 = r1.url
                return r0
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r2, long r3) {
                r1 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.io.IOException -> L14
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()     // Catch: java.io.IOException -> L14
                okio.BufferedSource r0 = r0.getSource()     // Catch: java.io.IOException -> L14
                long r2 = r0.read(r2, r3)     // Catch: java.io.IOException -> L14
                return r2
            L14:
                r2 = move-exception
                okhttp3.internal.http1.Http1ExchangeCodec r3 = r1.this$0
                okhttp3.internal.http.ExchangeCodec$Carrier r3 = r3.getCarrier()
                r3.noNewExchanges()
                okhttp3.Headers r3 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r1.responseBodyComplete(r3)
                throw r2
        }

        public final void responseBodyComplete(@org.jetbrains.annotations.NotNull okhttp3.Headers r4) {
                r3 = this;
                java.lang.String r0 = "trailers"
                kotlin.jvm.internal.g0.p(r4, r0)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                r1 = 6
                if (r0 != r1) goto Lf
                goto L42
            Lf:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                int r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r0)
                r2 = 5
                if (r0 != r2) goto L43
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okio.ForwardingTimeout r2 = r3.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r2)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.internal.http1.Http1ExchangeCodec.access$setTrailers$p(r0, r4)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                int r0 = r4.size()
                if (r0 <= 0) goto L42
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.OkHttpClient r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getClient$p(r0)
                if (r0 == 0) goto L42
                okhttp3.CookieJar r0 = r0.cookieJar()
                if (r0 == 0) goto L42
                okhttp3.HttpUrl r1 = r3.url
                okhttp3.internal.http.HttpHeaders.receiveHeaders(r0, r1, r4)
            L42:
                return
            L43:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "state: "
                r0.append(r1)
                okhttp3.internal.http1.Http1ExchangeCodec r1 = r3.this$0
                int r1 = okhttp3.internal.http1.Http1ExchangeCodec.access$getState$p(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        protected final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
    private final class ChunkedSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.ForwardingTimeout timeout;

        public ChunkedSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okhttp3.internal.connection.BufferedSocket r2 = r2.getSocket()
                okio.BufferedSink r2 = r2.getSink()
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        public synchronized void close() {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L7
                monitor-exit(r2)
                return
            L7:
                r0 = 1
                r2.closed = r0     // Catch: java.lang.Throwable -> L28
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()     // Catch: java.lang.Throwable -> L28
                okio.BufferedSink r0 = r0.getSink()     // Catch: java.lang.Throwable -> L28
                java.lang.String r1 = "0\r\n\r\n"
                r0.writeUtf8(r1)     // Catch: java.lang.Throwable -> L28
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                okio.ForwardingTimeout r1 = r2.timeout     // Catch: java.lang.Throwable -> L28
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)     // Catch: java.lang.Throwable -> L28
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0     // Catch: java.lang.Throwable -> L28
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)     // Catch: java.lang.Throwable -> L28
                monitor-exit(r2)
                return
            L28:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                throw r0
        }

        public synchronized void flush() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.closed     // Catch: java.lang.Throwable -> L16
                if (r0 == 0) goto L7
                monitor-exit(r1)
                return
            L7:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0     // Catch: java.lang.Throwable -> L16
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()     // Catch: java.lang.Throwable -> L16
                okio.BufferedSink r0 = r0.getSink()     // Catch: java.lang.Throwable -> L16
                r0.flush()     // Catch: java.lang.Throwable -> L16
                monitor-exit(r1)
                return
            L16:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
                r3 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r3.closed
                if (r0 != 0) goto L29
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L10
                return
            L10:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r3.this$0
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()
                okio.BufferedSink r0 = r0.getSink()
                r0.writeHexadecimalUnsignedLong(r5)
                java.lang.String r1 = "\r\n"
                r0.writeUtf8(r1)
                r0.write(r4, r5)
                r0.writeUtf8(r1)
                return
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "closed"
                r4.<init>(r5)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
    private final class ChunkedSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public ChunkedSource(@org.jetbrains.annotations.NotNull okhttp3.internal.http1.Http1ExchangeCodec r2, okhttp3.HttpUrl r3) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>(r2, r3)
                r2 = -1
                r1.bytesRemainingInChunk = r2
                r2 = 1
                r1.hasMoreChunks = r2
                return
        }

        private final void readChunkSize() {
                r7 = this;
                long r0 = r7.bytesRemainingInChunk
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L15
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()
                okio.BufferedSource r0 = r0.getSource()
                r0.readUtf8LineStrict()
            L15:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> L55
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()     // Catch: java.lang.NumberFormatException -> L55
                okio.BufferedSource r0 = r0.getSource()     // Catch: java.lang.NumberFormatException -> L55
                long r0 = r0.readHexadecimalUnsignedLong()     // Catch: java.lang.NumberFormatException -> L55
                r7.bytesRemainingInChunk = r0     // Catch: java.lang.NumberFormatException -> L55
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0     // Catch: java.lang.NumberFormatException -> L55
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()     // Catch: java.lang.NumberFormatException -> L55
                okio.BufferedSource r0 = r0.getSource()     // Catch: java.lang.NumberFormatException -> L55
                java.lang.String r0 = r0.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L55
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r0)     // Catch: java.lang.NumberFormatException -> L55
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L55
                long r1 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L55
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L6d
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> L55
                r2 = 0
                if (r1 <= 0) goto L57
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = kotlin.text.u.H2(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> L55
                if (r1 == 0) goto L6d
                goto L57
            L55:
                r0 = move-exception
                goto L8e
            L57:
                long r0 = r7.bytesRemainingInChunk
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L6c
                r7.hasMoreChunks = r2
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r7.this$0
                okhttp3.internal.http1.HeadersReader r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getHeadersReader$p(r0)
                okhttp3.Headers r0 = r0.readHeaders()
                r7.responseBodyComplete(r0)
            L6c:
                return
            L6d:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L55
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L55
                r2.<init>()     // Catch: java.lang.NumberFormatException -> L55
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L55
                long r3 = r7.bytesRemainingInChunk     // Catch: java.lang.NumberFormatException -> L55
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L55
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> L55
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> L55
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L55
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L55
                throw r1     // Catch: java.lang.NumberFormatException -> L55
            L8e:
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
        }

        public void close() {
                r2 = this;
                boolean r0 = r2.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r2.hasMoreChunks
                if (r0 == 0) goto L25
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal._UtilJvmKt.discard(r2, r0, r1)
                if (r0 != 0) goto L25
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
                r0.noNewExchanges()
                okhttp3.Headers r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r2.responseBodyComplete(r0)
            L25:
                r0 = 1
                r2.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r8, r0)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L5e
                boolean r2 = r7.getClosed()
                if (r2 != 0) goto L56
                boolean r2 = r7.hasMoreChunks
                r3 = -1
                if (r2 != 0) goto L18
                return r3
            L18:
                long r5 = r7.bytesRemainingInChunk
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L22
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L2a
            L22:
                r7.readChunkSize()
                boolean r0 = r7.hasMoreChunks
                if (r0 != 0) goto L2a
                return r3
            L2a:
                long r0 = r7.bytesRemainingInChunk
                long r9 = java.lang.Math.min(r9, r0)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 == 0) goto L3e
                long r0 = r7.bytesRemainingInChunk
                long r0 = r0 - r8
                r7.bytesRemainingInChunk = r0
                return r8
            L3e:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.http.ExchangeCodec$Carrier r8 = r8.getCarrier()
                r8.noNewExchanges()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                okhttp3.Headers r9 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r7.responseBodyComplete(r9)
                throw r8
            L56:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
            L5e:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r8.append(r0)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
        }
    }

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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
    private final class FixedLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public FixedLengthSource(@org.jetbrains.annotations.NotNull okhttp3.internal.http1.Http1ExchangeCodec r2, okhttp3.HttpUrl r3, long r4) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>(r2, r3)
                r1.bytesRemaining = r4
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L17
                okhttp3.Headers r2 = okhttp3.Headers.EMPTY
                r1.responseBodyComplete(r2)
            L17:
                return
        }

        public void close() {
                r5 = this;
                boolean r0 = r5.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                long r0 = r5.bytesRemaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L29
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = okhttp3.internal._UtilJvmKt.discard(r5, r0, r1)
                if (r0 != 0) goto L29
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r5.this$0
                okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
                r0.noNewExchanges()
                okhttp3.Headers r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r5.responseBodyComplete(r0)
            L29:
                r0 = 1
                r5.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r8, r0)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L55
                boolean r2 = r7.getClosed()
                if (r2 != 0) goto L4d
                long r2 = r7.bytesRemaining
                r4 = -1
                int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r6 != 0) goto L1a
                return r4
            L1a:
                long r9 = java.lang.Math.min(r2, r9)
                long r8 = super.read(r8, r9)
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L35
                long r2 = r7.bytesRemaining
                long r2 = r2 - r8
                r7.bytesRemaining = r2
                int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r10 != 0) goto L34
                okhttp3.Headers r10 = okhttp3.Headers.EMPTY
                r7.responseBodyComplete(r10)
            L34:
                return r8
            L35:
                okhttp3.internal.http1.Http1ExchangeCodec r8 = r7.this$0
                okhttp3.internal.http.ExchangeCodec$Carrier r8 = r8.getCarrier()
                r8.noNewExchanges()
                java.net.ProtocolException r8 = new java.net.ProtocolException
                java.lang.String r9 = "unexpected end of stream"
                r8.<init>(r9)
                okhttp3.Headers r9 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r7.responseBodyComplete(r9)
                throw r8
            L4d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
            L55:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r8.append(r0)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
    private final class KnownLengthSink implements okio.Sink {
        private boolean closed;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.ForwardingTimeout timeout;

        public KnownLengthSink(okhttp3.internal.http1.Http1ExchangeCodec r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.ForwardingTimeout r0 = new okio.ForwardingTimeout
                okhttp3.internal.connection.BufferedSocket r2 = r2.getSocket()
                okio.BufferedSink r2 = r2.getSink()
                okio.Timeout r2 = r2.timeout()
                r0.<init>(r2)
                r1.timeout = r0
                return
        }

        public void close() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.closed = r0
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                okio.ForwardingTimeout r1 = r2.timeout
                okhttp3.internal.http1.Http1ExchangeCodec.access$detachTimeout(r0, r1)
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r2.this$0
                r1 = 3
                okhttp3.internal.http1.Http1ExchangeCodec.access$setState$p(r0, r1)
                return
        }

        public void flush() {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                okhttp3.internal.http1.Http1ExchangeCodec r0 = r1.this$0
                okhttp3.internal.connection.BufferedSocket r0 = r0.getSocket()
                okio.BufferedSink r0 = r0.getSink()
                r0.flush()
                return
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.ForwardingTimeout r0 = r1.timeout
                return r0
        }

        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L21
                long r1 = r8.size()
                r3 = 0
                r5 = r9
                okhttp3.internal._UtilCommonKt.checkOffsetAndCount(r1, r3, r5)
                okhttp3.internal.http1.Http1ExchangeCodec r9 = r7.this$0
                okhttp3.internal.connection.BufferedSocket r9 = r9.getSocket()
                okio.BufferedSink r9 = r9.getSink()
                r9.write(r8, r5)
                return
            L21:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
    private final class UnknownLengthSource extends okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ okhttp3.internal.http1.Http1ExchangeCodec this$0;

        public UnknownLengthSource(@org.jetbrains.annotations.NotNull okhttp3.internal.http1.Http1ExchangeCodec r2, okhttp3.HttpUrl r3) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>(r2, r3)
                return
        }

        public void close() {
                r1 = this;
                boolean r0 = r1.getClosed()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r1.inputExhausted
                if (r0 != 0) goto L12
                okhttp3.Headers r0 = okhttp3.internal.http1.Http1ExchangeCodec.access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp()
                r1.responseBodyComplete(r0)
            L12:
                r0 = 1
                r1.setClosed(r0)
                return
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) {
                r3 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 < 0) goto L32
                boolean r0 = r3.getClosed()
                if (r0 != 0) goto L2a
                boolean r0 = r3.inputExhausted
                r1 = -1
                if (r0 == 0) goto L18
                return r1
            L18:
                long r4 = super.read(r4, r5)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 != 0) goto L29
                r4 = 1
                r3.inputExhausted = r4
                okhttp3.Headers r4 = okhttp3.Headers.EMPTY
                r3.responseBodyComplete(r4)
                return r1
            L29:
                return r4
            L2a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "closed"
                r4.<init>(r5)
                throw r4
            L32:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "byteCount < 0: "
                r4.append(r0)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
        }
    }

    static {
            okhttp3.internal.http1.Http1ExchangeCodec$Companion r0 = new okhttp3.internal.http1.Http1ExchangeCodec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.Http1ExchangeCodec.Companion = r0
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            java.lang.String r1 = "OkHttp-Response-Body"
            java.lang.String r2 = "Truncated"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            okhttp3.Headers r0 = r0.of(r1)
            okhttp3.internal.http1.Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED = r0
            return
    }

    public Http1ExchangeCodec(@org.jetbrains.annotations.Nullable okhttp3.OkHttpClient r2, @org.jetbrains.annotations.NotNull okhttp3.internal.http.ExchangeCodec.Carrier r3, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.BufferedSocket r4) {
            r1 = this;
            java.lang.String r0 = "carrier"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.client = r2
            r1.carrier = r3
            r1.socket = r4
            okhttp3.internal.http1.HeadersReader r2 = new okhttp3.internal.http1.HeadersReader
            okhttp3.internal.connection.BufferedSocket r3 = r1.getSocket()
            okio.BufferedSource r3 = r3.getSource()
            r2.<init>(r3)
            r1.headersReader = r2
            return
    }

    public static final /* synthetic */ void access$detachTimeout(okhttp3.internal.http1.Http1ExchangeCodec r0, okio.ForwardingTimeout r1) {
            r0.detachTimeout(r1)
            return
    }

    public static final /* synthetic */ okhttp3.OkHttpClient access$getClient$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.OkHttpClient r0 = r0.client
            return r0
    }

    public static final /* synthetic */ okhttp3.internal.http1.HeadersReader access$getHeadersReader$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            okhttp3.internal.http1.HeadersReader r0 = r0.headersReader
            return r0
    }

    public static final /* synthetic */ int access$getState$p(okhttp3.internal.http1.Http1ExchangeCodec r0) {
            int r0 = r0.state
            return r0
    }

    public static final /* synthetic */ okhttp3.Headers access$getTRAILERS_RESPONSE_BODY_TRUNCATED$cp() {
            okhttp3.Headers r0 = okhttp3.internal.http1.Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED
            return r0
    }

    public static final /* synthetic */ void access$setState$p(okhttp3.internal.http1.Http1ExchangeCodec r0, int r1) {
            r0.state = r1
            return
    }

    public static final /* synthetic */ void access$setTrailers$p(okhttp3.internal.http1.Http1ExchangeCodec r0, okhttp3.Headers r1) {
            r0.trailers = r1
            return
    }

    private final void detachTimeout(okio.ForwardingTimeout r3) {
            r2 = this;
            okio.Timeout r0 = r3.delegate()
            okio.Timeout r1 = okio.Timeout.NONE
            r3.setDelegate(r1)
            r0.clearDeadline()
            r0.clearTimeout()
            return
    }

    private final boolean isChunked(okhttp3.Request r3) {
            r2 = this;
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r3 = r3.header(r0)
            r0 = 1
            java.lang.String r1 = "chunked"
            boolean r3 = kotlin.text.u.a2(r1, r3, r0)
            return r3
    }

    private final boolean isChunked(okhttp3.Response r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r4 = okhttp3.Response.header$default(r4, r2, r0, r1, r0)
            r0 = 1
            java.lang.String r1 = "chunked"
            boolean r4 = kotlin.text.u.a2(r1, r4, r0)
            return r4
    }

    private final okio.Sink newChunkedSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSink
            r0.<init>(r2)
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "state: "
            r0.append(r1)
            int r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final okio.Source newChunkedSource(okhttp3.HttpUrl r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$ChunkedSource
            r0.<init>(r2, r3)
            return r0
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "state: "
            r3.append(r0)
            int r0 = r2.state
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private final okio.Source newFixedLengthSource(okhttp3.HttpUrl r3, long r4) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto Le
            r0 = 5
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$FixedLengthSource
            r0.<init>(r2, r3, r4)
            return r0
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "state: "
            r3.append(r4)
            int r4 = r2.state
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final okio.Sink newKnownLengthSink() {
            r2 = this;
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 2
            r2.state = r0
            okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink r0 = new okhttp3.internal.http1.Http1ExchangeCodec$KnownLengthSink
            r0.<init>(r2)
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "state: "
            r0.append(r1)
            int r1 = r2.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final okio.Source newUnknownLengthSource(okhttp3.HttpUrl r3) {
            r2 = this;
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L15
            r0 = 5
            r2.state = r0
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r2.getCarrier()
            r0.noNewExchanges()
            okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource r0 = new okhttp3.internal.http1.Http1ExchangeCodec$UnknownLengthSource
            r0.<init>(r2, r3)
            return r0
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "state: "
            r3.append(r0)
            int r0 = r2.state
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r1.getCarrier()
            r0.cancel()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r3, long r4) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.RequestBody r0 = r3.body()
            if (r0 == 0) goto L1b
            boolean r0 = r0.isDuplex()
            r1 = 1
            if (r0 == r1) goto L13
            goto L1b
        L13:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r4 = "Duplex connections are not supported for HTTP/1"
            r3.<init>(r4)
            throw r3
        L1b:
            boolean r3 = r2.isChunked(r3)
            if (r3 == 0) goto L26
            okio.Sink r3 = r2.newChunkedSink()
            return r3
        L26:
            r0 = -1
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L31
            okio.Sink r3 = r2.newKnownLengthSink()
            return r3
        L31:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot stream a request body without chunked encoding or a known content length!"
            r3.<init>(r4)
            throw r3
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
            r1 = this;
            okhttp3.internal.connection.BufferedSocket r0 = r1.getSocket()
            okio.BufferedSink r0 = r0.getSink()
            r0.flush()
            return
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
            r1 = this;
            okhttp3.internal.connection.BufferedSocket r0 = r1.getSocket()
            okio.BufferedSink r0 = r0.getSink()
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

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.BufferedSocket getSocket() {
            r1 = this;
            okhttp3.internal.connection.BufferedSocket r0 = r1.socket
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: getSocket, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okio.Socket mo64getSocket() {
            r1 = this;
            okhttp3.internal.connection.BufferedSocket r0 = r1.getSocket()
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
            r2 = this;
            int r0 = r2.state
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.NotNull
    public okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r6) {
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = okhttp3.internal.http.HttpHeaders.promisesBody(r6)
            if (r0 != 0) goto L1a
            okhttp3.Request r6 = r6.request()
            okhttp3.HttpUrl r6 = r6.url()
            r0 = 0
            okio.Source r6 = r5.newFixedLengthSource(r6, r0)
            return r6
        L1a:
            boolean r0 = r5.isChunked(r6)
            if (r0 == 0) goto L2d
            okhttp3.Request r6 = r6.request()
            okhttp3.HttpUrl r6 = r6.url()
            okio.Source r6 = r5.newChunkedSource(r6)
            return r6
        L2d:
            long r0 = okhttp3.internal._UtilJvmKt.headersContentLength(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L44
            okhttp3.Request r6 = r6.request()
            okhttp3.HttpUrl r6 = r6.url()
            okio.Source r6 = r5.newFixedLengthSource(r6, r0)
            return r6
        L44:
            okhttp3.Request r6 = r6.request()
            okhttp3.HttpUrl r6 = r6.url()
            okio.Source r6 = r5.newUnknownLengthSource(r6)
            return r6
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Headers peekTrailers() {
            r3 = this;
            okhttp3.Headers r0 = r3.trailers
            okhttp3.Headers r1 = okhttp3.internal.http1.Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED
            if (r0 == r1) goto L2d
            int r1 = r3.state
            r2 = 5
            if (r1 == r2) goto L2c
            r2 = 6
            if (r1 != r2) goto Lf
            goto L2c
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Trailers cannot be read because the state is "
            r0.append(r1)
            int r1 = r3.state
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2c:
            return r0
        L2d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Trailers cannot be read because the response body was truncated"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @org.jetbrains.annotations.Nullable
    public okhttp3.Response.Builder readResponseHeaders(boolean r5) {
            r4 = this;
            int r0 = r4.state
            r1 = 3
            if (r0 == 0) goto L2b
            r2 = 1
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L2b
            if (r0 != r1) goto Le
            goto L2b
        Le:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "state: "
            r5.append(r0)
            int r0 = r4.state
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L2b:
            okhttp3.internal.http.StatusLine$Companion r0 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.io.EOFException -> L62
            okhttp3.internal.http1.HeadersReader r2 = r4.headersReader     // Catch: java.io.EOFException -> L62
            java.lang.String r2 = r2.readLine()     // Catch: java.io.EOFException -> L62
            okhttp3.internal.http.StatusLine r0 = r0.parse(r2)     // Catch: java.io.EOFException -> L62
            okhttp3.Response$Builder r2 = new okhttp3.Response$Builder     // Catch: java.io.EOFException -> L62
            r2.<init>()     // Catch: java.io.EOFException -> L62
            okhttp3.Protocol r3 = r0.protocol     // Catch: java.io.EOFException -> L62
            okhttp3.Response$Builder r2 = r2.protocol(r3)     // Catch: java.io.EOFException -> L62
            int r3 = r0.code     // Catch: java.io.EOFException -> L62
            okhttp3.Response$Builder r2 = r2.code(r3)     // Catch: java.io.EOFException -> L62
            java.lang.String r3 = r0.message     // Catch: java.io.EOFException -> L62
            okhttp3.Response$Builder r2 = r2.message(r3)     // Catch: java.io.EOFException -> L62
            okhttp3.internal.http1.HeadersReader r3 = r4.headersReader     // Catch: java.io.EOFException -> L62
            okhttp3.Headers r3 = r3.readHeaders()     // Catch: java.io.EOFException -> L62
            okhttp3.Response$Builder r2 = r2.headers(r3)     // Catch: java.io.EOFException -> L62
            r3 = 100
            if (r5 == 0) goto L64
            int r5 = r0.code     // Catch: java.io.EOFException -> L62
            if (r5 != r3) goto L64
            r5 = 0
            return r5
        L62:
            r5 = move-exception
            goto L7a
        L64:
            int r5 = r0.code     // Catch: java.io.EOFException -> L62
            if (r5 != r3) goto L6b
            r4.state = r1     // Catch: java.io.EOFException -> L62
            return r2
        L6b:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r5) goto L76
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 >= r0) goto L76
            r4.state = r1     // Catch: java.io.EOFException -> L62
            return r2
        L76:
            r5 = 4
            r4.state = r5     // Catch: java.io.EOFException -> L62
            return r2
        L7a:
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r4.getCarrier()
            okhttp3.Route r0 = r0.getRoute()
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unexpected end of stream on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r5)
            throw r1
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
            boolean r0 = r2.isChunked(r3)
            if (r0 == 0) goto L17
            r0 = -1
            return r0
        L17:
            long r0 = okhttp3.internal._UtilJvmKt.headersContentLength(r3)
            return r0
    }

    public final void skipConnectBody(@org.jetbrains.annotations.NotNull okhttp3.Response r6) {
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r6, r0)
            long r0 = okhttp3.internal._UtilJvmKt.headersContentLength(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return
        L10:
            okhttp3.Request r6 = r6.request()
            okhttp3.HttpUrl r6 = r6.url()
            okio.Source r6 = r5.newFixedLengthSource(r6, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.internal._UtilJvmKt.skipAll(r6, r0, r1)
            r6.close()
            return
    }

    public final void writeRequest(@org.jetbrains.annotations.NotNull okhttp3.Headers r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "requestLine"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r4.state
            if (r0 != 0) goto L59
            okhttp3.internal.connection.BufferedSocket r0 = r4.getSocket()
            okio.BufferedSink r0 = r0.getSink()
            okio.BufferedSink r6 = r0.writeUtf8(r6)
            java.lang.String r0 = "\r\n"
            r6.writeUtf8(r0)
            int r6 = r5.size()
            r1 = 0
        L24:
            if (r1 >= r6) goto L4a
            okhttp3.internal.connection.BufferedSocket r2 = r4.getSocket()
            okio.BufferedSink r2 = r2.getSink()
            java.lang.String r3 = r5.name(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = ": "
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            java.lang.String r3 = r5.value(r1)
            okio.BufferedSink r2 = r2.writeUtf8(r3)
            r2.writeUtf8(r0)
            int r1 = r1 + 1
            goto L24
        L4a:
            okhttp3.internal.connection.BufferedSocket r5 = r4.getSocket()
            okio.BufferedSink r5 = r5.getSink()
            r5.writeUtf8(r0)
            r5 = 1
            r4.state = r5
            return
        L59:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "state: "
            r5.append(r6)
            int r6 = r4.state
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r4) {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.internal.http.RequestLine r0 = okhttp3.internal.http.RequestLine.INSTANCE
            okhttp3.internal.http.ExchangeCodec$Carrier r1 = r3.getCarrier()
            okhttp3.Route r1 = r1.getRoute()
            java.net.Proxy r1 = r1.proxy()
            java.net.Proxy$Type r1 = r1.type()
            java.lang.String r2 = "type(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String r0 = r0.get(r4, r1)
            okhttp3.Headers r4 = r4.headers()
            r3.writeRequest(r4, r0)
            return
    }
}
