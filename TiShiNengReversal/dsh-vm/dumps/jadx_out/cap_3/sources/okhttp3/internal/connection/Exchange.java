package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class Exchange {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall call;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http.ExchangeCodec codec;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.EventListener eventListener;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
    private final class RequestBodySink extends okio.ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public RequestBodySink(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r2, okio.Sink r3, long r4, boolean r6) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>(r3)
                r1.contentLength = r4
                r1.isSocket = r6
                r1.invokeStartEvent = r6
                return
        }

        private final java.io.IOException complete(java.io.IOException r11) {
                r10 = this;
                boolean r0 = r10.completed
                if (r0 == 0) goto L5
                return r11
            L5:
                r0 = 1
                r10.completed = r0
                okhttp3.internal.connection.Exchange r1 = r10.this$0
                long r2 = r10.bytesReceived
                boolean r4 = r10.isSocket
                r8 = 4
                r9 = 0
                r5 = 0
                r6 = 1
                r7 = r11
                java.io.IOException r11 = okhttp3.internal.connection.Exchange.bodyComplete$default(r1, r2, r4, r5, r6, r7, r8, r9)
                return r11
        }

        public void close() throws java.io.IOException {
                r5 = this;
                boolean r0 = r5.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r5.closed = r0
                long r0 = r5.contentLength
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1f
                long r2 = r5.bytesReceived
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L17
                goto L1f
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L1f:
                super.close()     // Catch: java.io.IOException -> L27
                r0 = 0
                r5.complete(r0)     // Catch: java.io.IOException -> L27
                return
            L27:
                r0 = move-exception
                java.io.IOException r0 = r5.complete(r0)
                kotlin.jvm.internal.g0.m(r0)
                throw r0
        }

        public void flush() throws java.io.IOException {
                r1 = this;
                super.flush()     // Catch: java.io.IOException -> L4
                return
            L4:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                kotlin.jvm.internal.g0.m(r0)
                throw r0
        }

        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r6, r0)
                boolean r0 = r5.closed
                if (r0 != 0) goto L67
                long r0 = r5.contentLength
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L3d
                long r2 = r5.bytesReceived
                long r2 = r2 + r7
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 > 0) goto L19
                goto L3d
            L19:
                java.net.ProtocolException r6 = new java.net.ProtocolException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "expected "
                r0.append(r1)
                long r1 = r5.contentLength
                r0.append(r1)
                java.lang.String r1 = " bytes but received "
                r0.append(r1)
                long r1 = r5.bytesReceived
                long r1 = r1 + r7
                r0.append(r1)
                java.lang.String r7 = r0.toString()
                r6.<init>(r7)
                throw r6
            L3d:
                boolean r0 = r5.invokeStartEvent     // Catch: java.io.IOException -> L54
                if (r0 == 0) goto L56
                r0 = 0
                r5.invokeStartEvent = r0     // Catch: java.io.IOException -> L54
                okhttp3.internal.connection.Exchange r0 = r5.this$0     // Catch: java.io.IOException -> L54
                okhttp3.EventListener r0 = r0.getEventListener$okhttp()     // Catch: java.io.IOException -> L54
                okhttp3.internal.connection.Exchange r1 = r5.this$0     // Catch: java.io.IOException -> L54
                okhttp3.internal.connection.RealCall r1 = r1.getCall$okhttp()     // Catch: java.io.IOException -> L54
                r0.requestBodyStart(r1)     // Catch: java.io.IOException -> L54
                goto L56
            L54:
                r6 = move-exception
                goto L5f
            L56:
                super.write(r6, r7)     // Catch: java.io.IOException -> L54
                long r0 = r5.bytesReceived     // Catch: java.io.IOException -> L54
                long r0 = r0 + r7
                r5.bytesReceived = r0     // Catch: java.io.IOException -> L54
                return
            L5f:
                java.io.IOException r6 = r5.complete(r6)
                kotlin.jvm.internal.g0.m(r6)
                throw r6
            L67:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "closed"
                r6.<init>(r7)
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
    public final class ResponseBodySource extends okio.ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        public ResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r2, okio.Source r3, long r4, boolean r6) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>(r3)
                r1.contentLength = r4
                r1.isSocket = r6
                r2 = 1
                r1.invokeStartEvent = r2
                r2 = 0
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 != 0) goto L1b
                r2 = 0
                r1.complete(r2)
            L1b:
                return
        }

        public void close() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.closed = r0
                super.close()     // Catch: java.io.IOException -> L10
                r0 = 0
                r1.complete(r0)     // Catch: java.io.IOException -> L10
                return
            L10:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                kotlin.jvm.internal.g0.m(r0)
                throw r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.io.IOException complete(@org.jetbrains.annotations.Nullable java.io.IOException r12) {
                r11 = this;
                boolean r0 = r11.completed
                if (r0 == 0) goto L5
                return r12
            L5:
                r0 = 1
                r11.completed = r0
                if (r12 != 0) goto L20
                boolean r0 = r11.invokeStartEvent
                if (r0 == 0) goto L20
                r0 = 0
                r11.invokeStartEvent = r0
                okhttp3.internal.connection.Exchange r0 = r11.this$0
                okhttp3.EventListener r0 = r0.getEventListener$okhttp()
                okhttp3.internal.connection.Exchange r1 = r11.this$0
                okhttp3.internal.connection.RealCall r1 = r1.getCall$okhttp()
                r0.responseBodyStart(r1)
            L20:
                okhttp3.internal.connection.Exchange r2 = r11.this$0
                long r3 = r11.bytesReceived
                boolean r5 = r11.isSocket
                r9 = 8
                r10 = 0
                r6 = 1
                r7 = 0
                r8 = r12
                java.io.IOException r12 = okhttp3.internal.connection.Exchange.bodyComplete$default(r2, r3, r5, r6, r7, r8, r9, r10)
                return r12
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L7e
                okio.Source r0 = r7.delegate()     // Catch: java.io.IOException -> L28
                long r8 = r0.read(r8, r9)     // Catch: java.io.IOException -> L28
                boolean r10 = r7.invokeStartEvent     // Catch: java.io.IOException -> L28
                if (r10 == 0) goto L2a
                r10 = 0
                r7.invokeStartEvent = r10     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.Exchange r10 = r7.this$0     // Catch: java.io.IOException -> L28
                okhttp3.EventListener r10 = r10.getEventListener$okhttp()     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.Exchange r0 = r7.this$0     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.RealCall r0 = r0.getCall$okhttp()     // Catch: java.io.IOException -> L28
                r10.responseBodyStart(r0)     // Catch: java.io.IOException -> L28
                goto L2a
            L28:
                r8 = move-exception
                goto L76
            L2a:
                r10 = 0
                r0 = -1
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 != 0) goto L35
                r7.complete(r10)     // Catch: java.io.IOException -> L28
                return r0
            L35:
                long r2 = r7.bytesReceived     // Catch: java.io.IOException -> L28
                long r2 = r2 + r8
                long r4 = r7.contentLength     // Catch: java.io.IOException -> L28
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 == 0) goto L64
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L43
                goto L64
            L43:
                java.net.ProtocolException r8 = new java.net.ProtocolException     // Catch: java.io.IOException -> L28
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L28
                r9.<init>()     // Catch: java.io.IOException -> L28
                java.lang.String r10 = "expected "
                r9.append(r10)     // Catch: java.io.IOException -> L28
                long r0 = r7.contentLength     // Catch: java.io.IOException -> L28
                r9.append(r0)     // Catch: java.io.IOException -> L28
                java.lang.String r10 = " bytes but received "
                r9.append(r10)     // Catch: java.io.IOException -> L28
                r9.append(r2)     // Catch: java.io.IOException -> L28
                java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L28
                r8.<init>(r9)     // Catch: java.io.IOException -> L28
                throw r8     // Catch: java.io.IOException -> L28
            L64:
                r7.bytesReceived = r2     // Catch: java.io.IOException -> L28
                okhttp3.internal.connection.Exchange r0 = r7.this$0     // Catch: java.io.IOException -> L28
                okhttp3.internal.http.ExchangeCodec r0 = okhttp3.internal.connection.Exchange.access$getCodec$p(r0)     // Catch: java.io.IOException -> L28
                boolean r0 = r0.isResponseComplete()     // Catch: java.io.IOException -> L28
                if (r0 == 0) goto L75
                r7.complete(r10)     // Catch: java.io.IOException -> L28
            L75:
                return r8
            L76:
                java.io.IOException r8 = r7.complete(r8)
                kotlin.jvm.internal.g0.m(r8)
                throw r8
            L7e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }
    }

    public Exchange(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, @org.jetbrains.annotations.NotNull okhttp3.EventListener r3, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ExchangeFinder r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http.ExchangeCodec r5) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "finder"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "codec"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.call = r2
            r1.eventListener = r3
            r1.finder = r4
            r1.codec = r5
            return
    }

    public static final /* synthetic */ okhttp3.internal.http.ExchangeCodec access$getCodec$p(okhttp3.internal.connection.Exchange r0) {
            okhttp3.internal.http.ExchangeCodec r0 = r0.codec
            return r0
    }

    public static /* synthetic */ java.io.IOException bodyComplete$default(okhttp3.internal.connection.Exchange r7, long r8, boolean r10, boolean r11, boolean r12, java.io.IOException r13, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            r8 = -1
        L6:
            r1 = r8
            r8 = r14 & 4
            r9 = 0
            if (r8 == 0) goto Le
            r4 = 0
            goto Lf
        Le:
            r4 = r11
        Lf:
            r8 = r14 & 8
            if (r8 == 0) goto L18
            r5 = 0
        L14:
            r0 = r7
            r3 = r10
            r6 = r13
            goto L1a
        L18:
            r5 = r12
            goto L14
        L1a:
            java.io.IOException r7 = r0.bodyComplete(r1, r3, r4, r5, r6)
            return r7
    }

    private final void trackFailure(java.io.IOException r3) {
            r2 = this;
            r0 = 1
            r2.hasFailure = r0
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.trackFailure(r1, r3)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.IOException bodyComplete(long r10, boolean r12, boolean r13, boolean r14, @org.jetbrains.annotations.Nullable java.io.IOException r15) {
            r9 = this;
            if (r15 == 0) goto L5
            r9.trackFailure(r15)
        L5:
            if (r14 == 0) goto L18
            if (r15 == 0) goto L11
            okhttp3.EventListener r0 = r9.eventListener
            okhttp3.internal.connection.RealCall r1 = r9.call
            r0.requestFailed(r1, r15)
            goto L18
        L11:
            okhttp3.EventListener r0 = r9.eventListener
            okhttp3.internal.connection.RealCall r1 = r9.call
            r0.requestBodyEnd(r1, r10)
        L18:
            if (r13 == 0) goto L2b
            if (r15 == 0) goto L24
            okhttp3.EventListener r10 = r9.eventListener
            okhttp3.internal.connection.RealCall r11 = r9.call
            r10.responseFailed(r11, r15)
            goto L2b
        L24:
            okhttp3.EventListener r0 = r9.eventListener
            okhttp3.internal.connection.RealCall r1 = r9.call
            r0.responseBodyEnd(r1, r10)
        L2b:
            okhttp3.internal.connection.RealCall r2 = r9.call
            r10 = 0
            r11 = 1
            if (r14 == 0) goto L35
            if (r12 != 0) goto L35
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            if (r13 == 0) goto L3c
            if (r12 != 0) goto L3c
            r5 = 1
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r14 == 0) goto L43
            if (r12 == 0) goto L43
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            if (r13 == 0) goto L4c
            if (r12 == 0) goto L4c
            r6 = 1
        L49:
            r3 = r9
            r8 = r15
            goto L4e
        L4c:
            r6 = 0
            goto L49
        L4e:
            java.io.IOException r10 = r2.messageDone$okhttp(r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final void cancel() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            r0.cancel()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r7, boolean r8) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r7, r0)
            r6.isDuplex = r8
            okhttp3.RequestBody r8 = r7.body()
            kotlin.jvm.internal.g0.m(r8)
            long r3 = r8.contentLength()
            okhttp3.EventListener r8 = r6.eventListener
            okhttp3.internal.connection.RealCall r0 = r6.call
            r8.requestBodyStart(r0)
            okhttp3.internal.http.ExchangeCodec r8 = r6.codec
            okio.Sink r2 = r8.createRequestBody(r7, r3)
            okhttp3.internal.connection.Exchange$RequestBodySink r0 = new okhttp3.internal.connection.Exchange$RequestBodySink
            r5 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public final void detachWithViolence() {
            r8 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r8.codec
            r0.cancel()
            okhttp3.internal.connection.RealCall r1 = r8.call
            r6 = 1
            r7 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r2 = r8
            r1.messageDone$okhttp(r2, r3, r4, r5, r6, r7)
            return
    }

    public final void finishRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.finishRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public final void flushRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.flushRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.internal.connection.RealCall r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnection getConnection$okhttp() {
            r2 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
            boolean r1 = r0 instanceof okhttp3.internal.connection.RealConnection
            if (r1 == 0) goto Ld
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no connection for CONNECT tunnels"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ExchangeFinder getFinder$okhttp() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.finder
            return r0
    }

    public final boolean getHasFailure$okhttp() {
            r1 = this;
            boolean r0 = r1.hasFailure
            return r0
    }

    public final boolean isCoalescedConnection$okhttp() {
            r2 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r2.finder
            okhttp3.internal.connection.RoutePlanner r0 = r0.getRoutePlanner()
            okhttp3.Address r0 = r0.getAddress()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.http.ExchangeCodec r1 = r2.codec
            okhttp3.internal.http.ExchangeCodec$Carrier r1 = r1.getCarrier()
            okhttp3.Route r1 = r1.getRoute()
            okhttp3.Address r1 = r1.address()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isDuplex$okhttp() {
            r1 = this;
            boolean r0 = r1.isDuplex
            return r0
    }

    public final void noNewExchangesOnConnection() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
            r0.noNewExchanges()
            return
    }

    public final void noRequestBody() {
            r9 = this;
            okhttp3.internal.connection.RealCall r0 = r9.call
            r7 = 28
            r8 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            okhttp3.internal.connection.RealCall.messageDone$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.ResponseBody openResponseBody(@org.jetbrains.annotations.NotNull okhttp3.Response r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "Content-Type"
            r1 = 2
            r2 = 0
            java.lang.String r0 = okhttp3.Response.header$default(r9, r0, r2, r1, r2)     // Catch: java.io.IOException -> L2d
            okhttp3.internal.http.ExchangeCodec r1 = r8.codec     // Catch: java.io.IOException -> L2d
            long r5 = r1.reportedContentLength(r9)     // Catch: java.io.IOException -> L2d
            okhttp3.internal.http.ExchangeCodec r1 = r8.codec     // Catch: java.io.IOException -> L2d
            okio.Source r4 = r1.openResponseBodySource(r9)     // Catch: java.io.IOException -> L2d
            okhttp3.internal.connection.Exchange$ResponseBodySource r2 = new okhttp3.internal.connection.Exchange$ResponseBodySource     // Catch: java.io.IOException -> L2d
            r7 = 0
            r3 = r8
            r2.<init>(r3, r4, r5, r7)     // Catch: java.io.IOException -> L2a
            okhttp3.internal.http.RealResponseBody r9 = new okhttp3.internal.http.RealResponseBody     // Catch: java.io.IOException -> L2a
            okio.BufferedSource r1 = okio.Okio.buffer(r2)     // Catch: java.io.IOException -> L2a
            r9.<init>(r0, r5, r1)     // Catch: java.io.IOException -> L2a
            return r9
        L2a:
            r0 = move-exception
        L2b:
            r9 = r0
            goto L30
        L2d:
            r0 = move-exception
            r3 = r8
            goto L2b
        L30:
            okhttp3.EventListener r0 = r3.eventListener
            okhttp3.internal.connection.RealCall r1 = r3.call
            r0.responseFailed(r1, r9)
            r8.trackFailure(r9)
            throw r9
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.Headers r0 = r0.peekTrailers()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Response.Builder readResponseHeaders(boolean r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> Lc
            okhttp3.Response$Builder r3 = r0.readResponseHeaders(r3)     // Catch: java.io.IOException -> Lc
            if (r3 == 0) goto Le
            r3.initExchange$okhttp(r2)     // Catch: java.io.IOException -> Lc
            return r3
        Lc:
            r3 = move-exception
            goto Lf
        Le:
            return r3
        Lf:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }

    public final void responseHeadersEnd(@org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersEnd(r1, r3)
            return
    }

    public final void responseHeadersStart() {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.responseHeadersStart(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Socket upgradeToSocket() {
            r2 = this;
            okhttp3.internal.connection.RealCall r0 = r2.call
            r0.upgradeToSocket()
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec
            okhttp3.internal.http.ExchangeCodec$Carrier r0 = r0.getCarrier()
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection"
            kotlin.jvm.internal.g0.n(r0, r1)
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            r0.useAsSocket$okhttp()
            okhttp3.internal.connection.Exchange$upgradeToSocket$1 r0 = new okhttp3.internal.connection.Exchange$upgradeToSocket$1
            r0.<init>(r2)
            return r0
    }

    public final void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L19
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L19
            r0.requestHeadersStart(r1)     // Catch: java.io.IOException -> L19
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> L19
            r0.writeRequestHeaders(r3)     // Catch: java.io.IOException -> L19
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L19
            okhttp3.internal.connection.RealCall r1 = r2.call     // Catch: java.io.IOException -> L19
            r0.requestHeadersEnd(r1, r3)     // Catch: java.io.IOException -> L19
            return
        L19:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.internal.connection.RealCall r1 = r2.call
            r0.requestFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }
}
