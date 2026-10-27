package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,384:1\n63#2:385\n63#2:386\n63#2:387\n63#2:388\n63#2:389\n63#2:390\n63#2:391\n63#2:392\n63#2:393\n63#2:395\n63#2:396\n63#2:397\n1#3:394\n*S KotlinDebug\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n*L\n60#1:385\n74#1:386\n108#1:387\n129#1:388\n140#1:389\n172#1:390\n201#1:391\n228#1:392\n256#1:393\n283#1:395\n329#1:396\n360#1:397\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2Writer implements java.io.Closeable, okhttp3.internal.concurrent.Lockable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Writer.Companion Companion = null;
    private static final java.util.logging.Logger logger = null;
    private final boolean client;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer hpackBuffer;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Hpack.Writer hpackWriter;
    private int maxFrameSize;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSink sink;

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
            okhttp3.internal.http2.Http2Writer$Companion r0 = new okhttp3.internal.http2.Http2Writer$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Writer.Companion = r0
            java.lang.Class<okhttp3.internal.http2.Http2> r0 = okhttp3.internal.http2.Http2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okhttp3.internal.http2.Http2Writer.logger = r0
            return
    }

    public Http2Writer(@org.jetbrains.annotations.NotNull okio.BufferedSink r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r8, r0)
            r7.<init>()
            r7.sink = r8
            r7.client = r9
            okio.Buffer r4 = new okio.Buffer
            r4.<init>()
            r7.hpackBuffer = r4
            r8 = 16384(0x4000, float:2.2959E-41)
            r7.maxFrameSize = r8
            okhttp3.internal.http2.Hpack$Writer r1 = new okhttp3.internal.http2.Hpack$Writer
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.hpackWriter = r1
            return
    }

    private final void writeContinuationFrames(int r7, long r8) throws java.io.IOException {
            r6 = this;
        L0:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L23
            int r2 = r6.maxFrameSize
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r2, r8)
            long r8 = r8 - r2
            int r4 = (int) r2
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 != 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = 0
        L16:
            r1 = 9
            r6.frameHeader(r7, r4, r1, r0)
            okio.BufferedSink r0 = r6.sink
            okio.Buffer r1 = r6.hpackBuffer
            r0.write(r1, r2)
            goto L0
        L23:
            return
    }

    public final void applyAndAckSettings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "peerSettings"
            kotlin.jvm.internal.g0.p(r3, r0)
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L34
            int r0 = r2.maxFrameSize     // Catch: java.lang.Throwable -> L23
            int r0 = r3.getMaxFrameSize(r0)     // Catch: java.lang.Throwable -> L23
            r2.maxFrameSize = r0     // Catch: java.lang.Throwable -> L23
            int r0 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L23
            r1 = -1
            if (r0 == r1) goto L25
            okhttp3.internal.http2.Hpack$Writer r0 = r2.hpackWriter     // Catch: java.lang.Throwable -> L23
            int r3 = r3.getHeaderTableSize()     // Catch: java.lang.Throwable -> L23
            r0.resizeHeaderTable(r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L3c
        L25:
            r3 = 4
            r0 = 1
            r1 = 0
            r2.frameHeader(r1, r1, r3, r0)     // Catch: java.lang.Throwable -> L23
            okio.BufferedSink r3 = r2.sink     // Catch: java.lang.Throwable -> L23
            r3.flush()     // Catch: java.lang.Throwable -> L23
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L34:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "closed"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L3c:
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.closed = r0     // Catch: java.lang.Throwable -> Ld
            okio.BufferedSink r0 = r1.sink     // Catch: java.lang.Throwable -> Ld
            r0.close()     // Catch: java.lang.Throwable -> Ld
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void connectionPreface() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L49
            boolean r0 = r3.client     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L37
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = ">> CONNECTION "
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            okio.ByteString r2 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r2.hex()     // Catch: java.lang.Throwable -> L37
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = okhttp3.internal._UtilJvmKt.format(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0.fine(r1)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L51
        L39:
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L37
            okio.ByteString r1 = okhttp3.internal.http2.Http2.CONNECTION_PREFACE     // Catch: java.lang.Throwable -> L37
            r0.write(r1)     // Catch: java.lang.Throwable -> L37
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L37
            r0.flush()     // Catch: java.lang.Throwable -> L37
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)
            return
        L49:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L51:
            monitor-exit(r3)
            throw r0
    }

    public final void data(boolean r2, int r3, @org.jetbrains.annotations.Nullable okio.Buffer r4, int r5) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            r1.dataFrame(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> Lc
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            goto L16
        Le:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = "closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lc
            throw r2     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r1)
            throw r2
    }

    public final void dataFrame(int r3, int r4, @org.jetbrains.annotations.Nullable okio.Buffer r5, int r6) throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.frameHeader(r3, r6, r0, r4)
            if (r6 <= 0) goto Lf
            okio.BufferedSink r3 = r2.sink
            kotlin.jvm.internal.g0.m(r5)
            long r0 = (long) r6
            r3.write(r5, r0)
        Lf:
            return
    }

    public final void flush() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            okio.BufferedSink r0 = r2.sink     // Catch: java.lang.Throwable -> Le
            r0.flush()     // Catch: java.lang.Throwable -> Le
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r0 = move-exception
            goto L18
        L10:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L18:
            monitor-exit(r2)
            throw r0
    }

    public final void frameHeader(int r9, int r10, int r11, int r12) throws java.io.IOException {
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.frameLog(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.maxFrameSize
            if (r5 > r9) goto L62
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            okio.BufferedSink r9 = r8.sink
            okhttp3.internal._UtilCommonKt.writeMedium(r9, r5)
            okio.BufferedSink r9 = r8.sink
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.sink
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            okio.BufferedSink r9 = r8.sink
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "reserved bit set: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.append(r10)
            int r10 = r8.maxFrameSize
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Hpack.Writer getHpackWriter() {
            r1 = this;
            okhttp3.internal.http2.Hpack$Writer r0 = r1.hpackWriter
            return r0
    }

    public final void goAway(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5, @org.jetbrains.annotations.NotNull byte[] r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "debugData"
            kotlin.jvm.internal.g0.p(r6, r0)
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L4b
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L38
            r1 = -1
            if (r0 == r1) goto L43
            int r0 = r6.length     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L38
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L38
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L38
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L38
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L38
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L38
            int r4 = r6.length     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L30
            r2 = 1
        L30:
            if (r2 != 0) goto L3a
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L38
            r4.write(r6)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r4 = move-exception
            goto L53
        L3a:
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L38
            r4.flush()     // Catch: java.lang.Throwable -> L38
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L43:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L38
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L38
            throw r5     // Catch: java.lang.Throwable -> L38
        L4b:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L38
            throw r4     // Catch: java.lang.Throwable -> L38
        L53:
            monitor-exit(r3)
            throw r4
    }

    public final void headers(boolean r7, int r8, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r9) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "headerBlock"
            kotlin.jvm.internal.g0.p(r9, r0)
            monitor-enter(r6)
            boolean r0 = r6.closed     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L40
            okhttp3.internal.http2.Hpack$Writer r0 = r6.hpackWriter     // Catch: java.lang.Throwable -> L3a
            r0.writeHeaders(r9)     // Catch: java.lang.Throwable -> L3a
            okio.Buffer r9 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L3a
            long r0 = r9.size()     // Catch: java.lang.Throwable -> L3a
            int r9 = r6.maxFrameSize     // Catch: java.lang.Throwable -> L3a
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L3a
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L3a
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 0
        L23:
            if (r7 == 0) goto L27
            r4 = r4 | 1
        L27:
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L3a
            r5 = 1
            r6.frameHeader(r8, r7, r5, r4)     // Catch: java.lang.Throwable -> L3a
            okio.BufferedSink r7 = r6.sink     // Catch: java.lang.Throwable -> L3a
            okio.Buffer r4 = r6.hpackBuffer     // Catch: java.lang.Throwable -> L3a
            r7.write(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r9 <= 0) goto L3c
            long r0 = r0 - r2
            r6.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r7 = move-exception
            goto L48
        L3c:
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r6)
            return
        L40:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = "closed"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r7     // Catch: java.lang.Throwable -> L3a
        L48:
            monitor-exit(r6)
            throw r7
    }

    public final int maxDataLength() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    public final void ping(boolean r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            r0 = 8
            r1 = 6
            r2 = 0
            r3.frameHeader(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1f
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L1f
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1f
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L1f
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L1f
            r4.flush()     // Catch: java.lang.Throwable -> L1f
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return
        L1f:
            r4 = move-exception
            goto L29
        L21:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L29:
            monitor-exit(r3)
            throw r4
    }

    public final void pushPromise(int r8, int r9, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r10) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.g0.p(r10, r0)
            monitor-enter(r7)
            boolean r0 = r7.closed     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L4b
            okhttp3.internal.http2.Hpack$Writer r0 = r7.hpackWriter     // Catch: java.lang.Throwable -> L45
            r0.writeHeaders(r10)     // Catch: java.lang.Throwable -> L45
            okio.Buffer r10 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L45
            long r0 = r10.size()     // Catch: java.lang.Throwable -> L45
            int r10 = r7.maxFrameSize     // Catch: java.lang.Throwable -> L45
            long r2 = (long) r10     // Catch: java.lang.Throwable -> L45
            r4 = 4
            long r2 = r2 - r4
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L45
            int r10 = (int) r2     // Catch: java.lang.Throwable -> L45
            int r2 = r10 + 4
            long r3 = (long) r10     // Catch: java.lang.Throwable -> L45
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 != 0) goto L29
            r5 = 4
            goto L2a
        L29:
            r5 = 0
        L2a:
            r6 = 5
            r7.frameHeader(r8, r2, r6, r5)     // Catch: java.lang.Throwable -> L45
            okio.BufferedSink r2 = r7.sink     // Catch: java.lang.Throwable -> L45
            r5 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r5
            r2.writeInt(r9)     // Catch: java.lang.Throwable -> L45
            okio.BufferedSink r9 = r7.sink     // Catch: java.lang.Throwable -> L45
            okio.Buffer r2 = r7.hpackBuffer     // Catch: java.lang.Throwable -> L45
            r9.write(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r10 <= 0) goto L47
            long r0 = r0 - r3
            r7.writeContinuationFrames(r8, r0)     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r8 = move-exception
            goto L53
        L47:
            kotlin.n1 r8 = kotlin.n1.a     // Catch: java.lang.Throwable -> L45
            monitor-exit(r7)
            return
        L4b:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "closed"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L45
            throw r8     // Catch: java.lang.Throwable -> L45
        L53:
            monitor-exit(r7)
            throw r8
    }

    public final void rstStream(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r5, r0)
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L33
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L29
            r1 = -1
            if (r0 == r1) goto L2b
            r0 = 3
            r1 = 0
            r2 = 4
            r3.frameHeader(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L29
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L29
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L29
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L29
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L29
            r4.flush()     // Catch: java.lang.Throwable -> L29
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return
        L29:
            r4 = move-exception
            goto L3b
        L2b:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L29
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L33:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L3b:
            monitor-exit(r3)
            throw r4
    }

    public final void settings(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "settings"
            kotlin.jvm.internal.g0.p(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.closed     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L3c
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 * 6
            r1 = 4
            r2 = 0
            r3.frameHeader(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
        L15:
            r0 = 10
            if (r2 >= r0) goto L33
            boolean r0 = r4.isSet(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L2e
            r0.writeShort(r2)     // Catch: java.lang.Throwable -> L2e
            okio.BufferedSink r0 = r3.sink     // Catch: java.lang.Throwable -> L2e
            int r1 = r4.get(r2)     // Catch: java.lang.Throwable -> L2e
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r4 = move-exception
            goto L44
        L30:
            int r2 = r2 + 1
            goto L15
        L33:
            okio.BufferedSink r4 = r3.sink     // Catch: java.lang.Throwable -> L2e
            r4.flush()     // Catch: java.lang.Throwable -> L2e
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return
        L3c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L44:
            monitor-exit(r3)
            throw r4
    }

    public final void windowUpdate(int r9, long r10) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.closed     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L62
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L45
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L45
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger     // Catch: java.lang.Throwable -> L2a
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2d
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r5 = 4
            r4 = r9
            r6 = r10
            java.lang.String r9 = r2.frameLogWindowUpdate(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            r0.fine(r9)     // Catch: java.lang.Throwable -> L2a
            goto L2f
        L2a:
            r0 = move-exception
            r9 = r0
            goto L6a
        L2d:
            r4 = r9
            r6 = r10
        L2f:
            r9 = 8
            r10 = 0
            r11 = 4
            r8.frameHeader(r4, r11, r9, r10)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r9 = r8.sink     // Catch: java.lang.Throwable -> L2a
            int r10 = (int) r6     // Catch: java.lang.Throwable -> L2a
            r9.writeInt(r10)     // Catch: java.lang.Throwable -> L2a
            okio.BufferedSink r9 = r8.sink     // Catch: java.lang.Throwable -> L2a
            r9.flush()     // Catch: java.lang.Throwable -> L2a
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            return
        L45:
            r6 = r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L2a
            r9.append(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2a
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L2a
            throw r10     // Catch: java.lang.Throwable -> L2a
        L62:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = "closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6a:
            monitor-exit(r8)
            throw r9
    }
}
