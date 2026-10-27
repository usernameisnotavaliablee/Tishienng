package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MultipartReader implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.MultipartReader.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Options afterBoundaryOptions = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String boundary;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString crlfDashDashBoundary;

    @org.jetbrains.annotations.Nullable
    private okhttp3.MultipartReader.PartSource currentPart;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

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
        public final okio.Options getAfterBoundaryOptions() {
                r1 = this;
                okio.Options r0 = okhttp3.MultipartReader.access$getAfterBoundaryOptions$cp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Part implements java.io.Closeable {

        @org.jetbrains.annotations.NotNull
        private final okio.BufferedSource body;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Headers headers;

        public Part(@org.jetbrains.annotations.NotNull okhttp3.Headers r2, @org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "body"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.headers = r2
                r1.body = r3
                return
        }

        @kotlin.jvm.JvmName(name = "body")
        @org.jetbrains.annotations.NotNull
        public final okio.BufferedSource body() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                r0.close()
                return
        }

        @kotlin.jvm.JvmName(name = "headers")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,228:1\n1#2:229\n302#3,26:230\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n168#1:230,26\n*E\n"})
    private final class PartSource implements okio.Source {
        final /* synthetic */ okhttp3.MultipartReader this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.Timeout timeout;

        public PartSource(okhttp3.MultipartReader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Timeout r1 = new okio.Timeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        public void close() {
                r2 = this;
                okhttp3.MultipartReader r0 = r2.this$0
                okhttp3.MultipartReader$PartSource r0 = okhttp3.MultipartReader.access$getCurrentPart$p(r0)
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L12
                okhttp3.MultipartReader r0 = r2.this$0
                r1 = 0
                okhttp3.MultipartReader.access$setCurrentPart$p(r0, r1)
            L12:
                return
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r19, long r20) {
                r18 = this;
                r1 = r18
                r0 = r19
                r2 = r20
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.g0.p(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Ldd
                okhttp3.MultipartReader r6 = r1.this$0
                okhttp3.MultipartReader$PartSource r6 = okhttp3.MultipartReader.access$getCurrentPart$p(r6)
                boolean r6 = kotlin.jvm.internal.g0.g(r6, r1)
                if (r6 == 0) goto Ld5
                okhttp3.MultipartReader r6 = r1.this$0
                okio.BufferedSource r6 = okhttp3.MultipartReader.access$getSource$p(r6)
                okio.Timeout r6 = r6.timeout()
                okio.Timeout r7 = r1.timeout
                okhttp3.MultipartReader r8 = r1.this$0
                long r9 = r6.timeoutNanos()
                okio.Timeout$Companion r11 = okio.Timeout.Companion
                long r12 = r7.timeoutNanos()
                long r14 = r6.timeoutNanos()
                long r11 = r11.minTimeout(r12, r14)
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r11, r13)
                boolean r11 = r6.hasDeadline()
                if (r11 == 0) goto L96
                long r11 = r6.deadlineNanoTime()
                boolean r16 = r7.hasDeadline()
                if (r16 == 0) goto L64
                r16 = r4
                long r4 = r6.deadlineNanoTime()
                long r14 = r7.deadlineNanoTime()
                long r4 = java.lang.Math.min(r4, r14)
                r6.deadlineNanoTime(r4)
                goto L66
            L64:
                r16 = r4
            L66:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> L86
                int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r4 != 0) goto L71
                r14 = -1
                goto L79
            L71:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> L86
                long r14 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> L86
            L79:
                r6.timeout(r9, r13)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto L85
                r6.deadlineNanoTime(r11)
            L85:
                return r14
            L86:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r2)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto L95
                r6.deadlineNanoTime(r11)
            L95:
                throw r0
            L96:
                r16 = r4
                boolean r4 = r7.hasDeadline()
                if (r4 == 0) goto La5
                long r4 = r7.deadlineNanoTime()
                r6.deadlineNanoTime(r4)
            La5:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> Lc5
                int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r4 != 0) goto Lb0
                r14 = -1
                goto Lb8
            Lb0:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> Lc5
                long r14 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> Lc5
            Lb8:
                r6.timeout(r9, r13)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto Lc4
                r6.clearDeadline()
            Lc4:
                return r14
            Lc5:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r2)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto Ld4
                r6.clearDeadline()
            Ld4:
                throw r0
            Ld5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            Ldd:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "byteCount < 0: "
                r0.append(r4)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.MultipartReader$Companion r0 = new okhttp3.MultipartReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartReader.Companion = r0
            okio.Options$Companion r0 = okio.Options.Companion
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            java.lang.String r2 = "\r\n"
            okio.ByteString r2 = r1.encodeUtf8(r2)
            java.lang.String r3 = "--"
            okio.ByteString r3 = r1.encodeUtf8(r3)
            java.lang.String r4 = " "
            okio.ByteString r4 = r1.encodeUtf8(r4)
            java.lang.String r5 = "\t"
            okio.ByteString r1 = r1.encodeUtf8(r5)
            r5 = 4
            okio.ByteString[] r5 = new okio.ByteString[r5]
            r6 = 0
            r5[r6] = r2
            r2 = 1
            r5[r2] = r3
            r2 = 2
            r5[r2] = r4
            r2 = 3
            r5[r2] = r1
            okio.Options r0 = r0.of(r5)
            okhttp3.MultipartReader.afterBoundaryOptions = r0
            return
    }

    public MultipartReader(@org.jetbrains.annotations.NotNull okhttp3.ResponseBody r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
    }

    public MultipartReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "boundary"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.boundary = r3
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.dashDashBoundary = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "\r\n--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.crlfDashDashBoundary = r2
            return
    }

    public static final /* synthetic */ long access$currentPartBytesRemaining(okhttp3.MultipartReader r0, long r1) {
            long r0 = r0.currentPartBytesRemaining(r1)
            return r0
    }

    public static final /* synthetic */ okio.Options access$getAfterBoundaryOptions$cp() {
            okio.Options r0 = okhttp3.MultipartReader.afterBoundaryOptions
            return r0
    }

    public static final /* synthetic */ okhttp3.MultipartReader.PartSource access$getCurrentPart$p(okhttp3.MultipartReader r0) {
            okhttp3.MultipartReader$PartSource r0 = r0.currentPart
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.MultipartReader r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ void access$setCurrentPart$p(okhttp3.MultipartReader r0, okhttp3.MultipartReader.PartSource r1) {
            r0.currentPart = r1
            return
    }

    private final long currentPartBytesRemaining(long r11) {
            r10 = this;
            okio.BufferedSource r0 = r10.source
            okio.Buffer r0 = r0.getBuffer()
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r0, r11)
            r2 = 1
            long r8 = r0 + r2
            okio.BufferedSource r4 = r10.source
            okio.ByteString r5 = r10.crlfDashDashBoundary
            r6 = 0
            long r0 = r4.indexOf(r5, r6, r8)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L23
            return r0
        L23:
            okio.BufferedSource r0 = r10.source
            okio.Buffer r0 = r0.getBuffer()
            long r0 = r0.size()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L36
            long r11 = java.lang.Math.min(r8, r11)
            return r11
        L36:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
    }

    @kotlin.jvm.JvmName(name = "boundary")
    @org.jetbrains.annotations.NotNull
    public final java.lang.String boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.closed = r0
            r0 = 0
            r1.currentPart = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.MultipartReader.Part nextPart() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 != 0) goto L9d
            boolean r0 = r6.noMoreParts
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r6.partCount
            r2 = 0
            if (r0 != 0) goto L27
            okio.BufferedSource r0 = r6.source
            okio.ByteString r4 = r6.dashDashBoundary
            boolean r0 = r0.rangeEquals(r2, r4)
            if (r0 == 0) goto L27
            okio.BufferedSource r0 = r6.source
            okio.ByteString r2 = r6.dashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            r0.skip(r2)
            goto L43
        L27:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r6.currentPartBytesRemaining(r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            okio.BufferedSource r0 = r6.source
            r0.skip(r4)
            goto L27
        L37:
            okio.BufferedSource r0 = r6.source
            okio.ByteString r2 = r6.crlfDashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            r0.skip(r2)
        L43:
            r0 = 0
        L44:
            okio.BufferedSource r2 = r6.source
            okio.Options r3 = okhttp3.MultipartReader.afterBoundaryOptions
            int r2 = r2.select(r3)
            r3 = -1
            java.lang.String r4 = "unexpected characters after boundary"
            if (r2 == r3) goto L97
            r3 = 1
            if (r2 == 0) goto L76
            if (r2 == r3) goto L5f
            r4 = 2
            if (r2 == r4) goto L5d
            r4 = 3
            if (r2 == r4) goto L5d
            goto L44
        L5d:
            r0 = 1
            goto L44
        L5f:
            if (r0 != 0) goto L70
            int r0 = r6.partCount
            if (r0 == 0) goto L68
            r6.noMoreParts = r3
            return r1
        L68:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "expected at least 1 part"
            r0.<init>(r1)
            throw r0
        L70:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L76:
            int r0 = r6.partCount
            int r0 = r0 + r3
            r6.partCount = r0
            okhttp3.internal.http1.HeadersReader r0 = new okhttp3.internal.http1.HeadersReader
            okio.BufferedSource r1 = r6.source
            r0.<init>(r1)
            okhttp3.Headers r0 = r0.readHeaders()
            okhttp3.MultipartReader$PartSource r1 = new okhttp3.MultipartReader$PartSource
            r1.<init>(r6)
            r6.currentPart = r1
            okhttp3.MultipartReader$Part r2 = new okhttp3.MultipartReader$Part
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r2.<init>(r0, r1)
            return r2
        L97:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }
}
