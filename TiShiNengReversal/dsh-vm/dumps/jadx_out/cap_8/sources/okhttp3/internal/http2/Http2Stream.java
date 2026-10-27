package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,743:1\n1#2:744\n63#3:745\n63#3:746\n63#3:747\n63#3:748\n63#3:749\n49#3,4:750\n63#3:754\n38#3:755\n63#3:756\n63#3:757\n49#3,4:758\n63#3:762\n38#3:763\n49#3,4:764\n49#3,4:768\n63#3:772\n38#3:773\n63#3:774\n38#3:775\n49#3,4:776\n63#3:780\n38#3:781\n34#3:782\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n89#1:745\n114#1:746\n136#1:747\n149#1:748\n175#1:749\n200#1:750,4\n203#1:754\n207#1:755\n214#1:756\n227#1:757\n272#1:758,4\n274#1:762\n280#1:763\n294#1:764,4\n304#1:768,4\n307#1:772\n321#1:773\n329#1:774\n332#1:775\n543#1:776,4\n547#1:780\n693#1:781\n713#1:782\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Http2Stream implements okhttp3.internal.concurrent.Lockable, okio.Socket {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2Stream.Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Connection connection;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.http2.ErrorCode errorCode;

    @org.jetbrains.annotations.Nullable
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.flowcontrol.WindowCounter readBytes;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

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
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,743:1\n49#2,4:744\n63#2:748\n49#2,4:749\n63#2:753\n49#2,4:754\n63#2:758\n63#2:759\n38#2:760\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n582#1:744,4\n598#1:748\n628#1:749,4\n630#1:753\n644#1:754,4\n647#1:758\n676#1:759\n678#1:760\n*E\n"})
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer sendBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Headers trailers;

        public FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.finished = r2
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.sendBuffer = r1
                return
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2, int r3, kotlin.jvm.internal.v r4) {
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        private final void emitFrame(boolean r13) throws java.io.IOException {
                r12 = this;
                okhttp3.internal.http2.Http2Stream r1 = r12.this$0
                monitor-enter(r1)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.enter()     // Catch: java.lang.Throwable -> L5f
            La:
                long r2 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L28
                long r4 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L28
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L2b
                boolean r0 = r12.finished     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                boolean r0 = r12.closed     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                okhttp3.internal.http2.ErrorCode r0 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L2b
                r1.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L28
                goto La
            L28:
                r0 = move-exception
                r13 = r0
                goto L97
            L2b:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L5f
                r1.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L5f
                long r2 = r1.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L5f
                long r4 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L5f
                long r2 = r2 - r4
                okio.Buffer r0 = r12.sendBuffer     // Catch: java.lang.Throwable -> L5f
                long r4 = r0.size()     // Catch: java.lang.Throwable -> L5f
                long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5f
                long r2 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L5f
                long r2 = r2 + r10
                r1.setWriteBytesTotal$okhttp(r2)     // Catch: java.lang.Throwable -> L5f
                if (r13 == 0) goto L62
                okio.Buffer r13 = r12.sendBuffer     // Catch: java.lang.Throwable -> L5f
                long r2 = r13.size()     // Catch: java.lang.Throwable -> L5f
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L62
                r13 = 1
                r8 = 1
                goto L64
            L5f:
                r0 = move-exception
                r13 = r0
                goto L9f
            L62:
                r13 = 0
                r8 = 0
            L64:
                kotlin.n1 r13 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.getWriteTimeout$okhttp()
                r13.enter()
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0     // Catch: java.lang.Throwable -> L8b
                okhttp3.internal.http2.Http2Connection r6 = r13.getConnection()     // Catch: java.lang.Throwable -> L8b
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0     // Catch: java.lang.Throwable -> L8b
                int r7 = r13.getId()     // Catch: java.lang.Throwable -> L8b
                okio.Buffer r9 = r12.sendBuffer     // Catch: java.lang.Throwable -> L8b
                r6.writeData(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8b
                okhttp3.internal.http2.Http2Stream r13 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.getWriteTimeout$okhttp()
                r13.exitAndThrowIfTimedOut()
                return
            L8b:
                r0 = move-exception
                r13 = r0
                okhttp3.internal.http2.Http2Stream r0 = r12.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                r0.exitAndThrowIfTimedOut()
                throw r13
            L97:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L5f
                r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L5f
                throw r13     // Catch: java.lang.Throwable -> L5f
            L9f:
                monitor-exit(r1)
                throw r13
        }

        public void close() throws java.io.IOException {
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L34:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                monitor-enter(r1)
                boolean r0 = r10.closed     // Catch: java.lang.Throwable -> Ld6
                if (r0 == 0) goto L3d
                monitor-exit(r1)
                return
            L3d:
                okhttp3.internal.http2.ErrorCode r0 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Ld6
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L47
                r0 = 1
                goto L48
            L47:
                r0 = 0
            L48:
                kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld6
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r1 = r1.getSink()
                boolean r1 = r1.finished
                if (r1 != 0) goto Lb4
                okio.Buffer r1 = r10.sendBuffer
                long r4 = r1.size()
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L63
                r1 = 1
                goto L64
            L63:
                r1 = 0
            L64:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L8f
            L68:
                okio.Buffer r1 = r10.sendBuffer
                long r4 = r1.size()
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L76
                r10.emitFrame(r2)
                goto L68
            L76:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                okhttp3.internal.http2.Http2Connection r1 = r1.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                kotlin.jvm.internal.g0.m(r4)
                java.util.List r4 = okhttp3.internal._UtilJvmKt.toHeaderList(r4)
                r1.writeHeaders$okhttp(r2, r0, r4)
                goto Lb4
            L8f:
                if (r1 == 0) goto L9f
            L91:
                okio.Buffer r0 = r10.sendBuffer
                long r0 = r0.size()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto Lb4
                r10.emitFrame(r3)
                goto L91
            L9f:
                if (r0 == 0) goto Lb4
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                int r5 = r0.getId()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.writeData(r5, r6, r7, r8)
            Lb4:
                okhttp3.internal.http2.Http2Stream r1 = r10.this$0
                monitor-enter(r1)
                r10.closed = r3     // Catch: java.lang.Throwable -> Ld3
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.Throwable -> Ld3
                r1.notifyAll()     // Catch: java.lang.Throwable -> Ld3
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Ld3
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            Ld3:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            Ld6:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        public void flush() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L34:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r0.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L58
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L58
                monitor-exit(r0)
            L3d:
                okio.Buffer r0 = r5.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L57
                r0 = 0
                r5.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                goto L3d
            L57:
                return
            L58:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(@org.jetbrains.annotations.Nullable okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                return r0
        }

        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r3, long r4) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r3, r0)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L39
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L12
                goto L39
            L12:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Thread "
                r4.append(r5)
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                r4.append(r5)
                java.lang.String r5 = " MUST NOT hold lock on "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L39:
                okio.Buffer r0 = r2.sendBuffer
                r0.write(r3, r4)
            L3e:
                okio.Buffer r3 = r2.sendBuffer
                long r3 = r3.size()
                r0 = 16384(0x4000, double:8.095E-320)
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L4f
                r3 = 0
                r2.emitFrame(r3)
                goto L3e
            L4f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,743:1\n1#2:744\n63#3:745\n49#3,4:746\n49#3,4:750\n63#3:754\n63#3:755\n38#3:756\n63#3:757\n38#3:758\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n390#1:745\n453#1:746,4\n467#1:750,4\n474#1:754\n500#1:755\n507#1:756\n528#1:757\n532#1:758\n*E\n"})
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer readBuffer;

        @org.jetbrains.annotations.NotNull
        private final okio.Buffer receiveBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        @org.jetbrains.annotations.Nullable
        private okhttp3.Headers trailers;

        public FramingSource(okhttp3.internal.http2.Http2Stream r1, long r2, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.maxByteCount = r2
                r0.finished = r4
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.receiveBuffer = r1
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.readBuffer = r1
                return
        }

        private final void updateConnectionFlowControl(long r3) {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "Thread "
                r4.append(r1)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                java.lang.String r1 = " MUST NOT hold lock on "
                r4.append(r1)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L34:
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.updateConnectionFlowControl$okhttp(r3)
                return
        }

        public void close() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r1 = 1
                r5.closed = r1     // Catch: java.lang.Throwable -> L2b
                okio.Buffer r1 = r5.readBuffer     // Catch: java.lang.Throwable -> L2b
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L2b
                okio.Buffer r3 = r5.readBuffer     // Catch: java.lang.Throwable -> L2b
                r3.clear()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r0, r3)     // Catch: java.lang.Throwable -> L2b
                r0.notifyAll()     // Catch: java.lang.Throwable -> L2b
                kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r0)
                r3 = 0
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L25
                r5.updateConnectionFlowControl(r1)
            L25:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            L2b:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed$okhttp() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished$okhttp() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Buffer getReadBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.readBuffer
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Buffer getReceiveBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.receiveBuffer
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r27, long r28) throws java.io.IOException {
                r26 = this;
                r1 = r26
                r0 = r27
                r2 = r28
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.g0.p(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L102
            L11:
                okhttp3.internal.http2.Http2Stream r6 = r1.this$0
                monitor-enter(r6)
                boolean r7 = okhttp3.internal.http2.Http2Stream.access$doReadTimeout(r6)     // Catch: java.lang.Throwable -> L22
                if (r7 == 0) goto L25
                okhttp3.internal.http2.Http2Stream$StreamTimeout r8 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> L22
                r8.enter()     // Catch: java.lang.Throwable -> L22
                goto L25
            L22:
                r0 = move-exception
                goto L100
            L25:
                okhttp3.internal.http2.ErrorCode r8 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L42
                if (r8 == 0) goto L45
                boolean r8 = r1.finished     // Catch: java.lang.Throwable -> L42
                if (r8 != 0) goto L45
                java.io.IOException r8 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> L42
                if (r8 != 0) goto L46
                okhttp3.internal.http2.StreamResetException r8 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L42
                okhttp3.internal.http2.ErrorCode r9 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L42
                kotlin.jvm.internal.g0.m(r9)     // Catch: java.lang.Throwable -> L42
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L42
                goto L46
            L42:
                r0 = move-exception
                goto Lf6
            L45:
                r8 = 0
            L46:
                boolean r9 = r1.closed     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto Lee
                okio.Buffer r9 = r1.readBuffer     // Catch: java.lang.Throwable -> L42
                long r9 = r9.size()     // Catch: java.lang.Throwable -> L42
                r11 = -1
                r13 = 0
                int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r14 <= 0) goto Laa
                okio.Buffer r9 = r1.readBuffer     // Catch: java.lang.Throwable -> L42
                long r14 = r9.size()     // Catch: java.lang.Throwable -> L42
                long r14 = java.lang.Math.min(r2, r14)     // Catch: java.lang.Throwable -> L42
                long r17 = r9.read(r0, r14)     // Catch: java.lang.Throwable -> L42
                okhttp3.internal.http2.flowcontrol.WindowCounter r16 = r6.getReadBytes()     // Catch: java.lang.Throwable -> L42
                r21 = 2
                r22 = 0
                r19 = 0
                okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(r16, r17, r19, r21, r22)     // Catch: java.lang.Throwable -> L42
                okhttp3.internal.http2.flowcontrol.WindowCounter r9 = r6.getReadBytes()     // Catch: java.lang.Throwable -> L42
                long r9 = r9.getUnacknowledged()     // Catch: java.lang.Throwable -> L42
                if (r8 != 0) goto Lb6
                okhttp3.internal.http2.Http2Connection r14 = r6.getConnection()     // Catch: java.lang.Throwable -> L42
                okhttp3.internal.http2.Settings r14 = r14.getOkHttpSettings()     // Catch: java.lang.Throwable -> L42
                int r14 = r14.getInitialWindowSize()     // Catch: java.lang.Throwable -> L42
                int r14 = r14 / 2
                long r14 = (long) r14     // Catch: java.lang.Throwable -> L42
                int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r16 < 0) goto Lb6
                okhttp3.internal.http2.Http2Connection r14 = r6.getConnection()     // Catch: java.lang.Throwable -> L42
                int r15 = r6.getId()     // Catch: java.lang.Throwable -> L42
                r14.writeWindowUpdateLater$okhttp(r15, r9)     // Catch: java.lang.Throwable -> L42
                okhttp3.internal.http2.flowcontrol.WindowCounter r19 = r6.getReadBytes()     // Catch: java.lang.Throwable -> L42
                r24 = 1
                r25 = 0
                r20 = 0
                r22 = r9
                okhttp3.internal.http2.flowcontrol.WindowCounter.update$default(r19, r20, r22, r24, r25)     // Catch: java.lang.Throwable -> L42
                goto Lb6
            Laa:
                boolean r9 = r1.finished     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto Lb4
                if (r8 != 0) goto Lb4
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L42
                r13 = 1
            Lb4:
                r17 = r11
            Lb6:
                if (r7 == 0) goto Lbf
                okhttp3.internal.http2.Http2Stream$StreamTimeout r7 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> L22
                r7.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L22
            Lbf:
                kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L22
                monitor-exit(r6)
                okhttp3.internal.http2.Http2Stream r6 = r1.this$0
                okhttp3.internal.http2.Http2Connection r6 = r6.getConnection()
                okhttp3.internal.http2.FlowControlListener r6 = r6.getFlowControlListener$okhttp()
                okhttp3.internal.http2.Http2Stream r7 = r1.this$0
                int r7 = r7.getId()
                okhttp3.internal.http2.Http2Stream r9 = r1.this$0
                okhttp3.internal.http2.flowcontrol.WindowCounter r9 = r9.getReadBytes()
                okio.Buffer r10 = r1.readBuffer
                long r14 = r10.size()
                r6.receivingStreamWindowChanged(r7, r9, r14)
                if (r13 == 0) goto Le5
                goto L11
            Le5:
                int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
                if (r0 == 0) goto Lea
                return r17
            Lea:
                if (r8 != 0) goto Led
                return r11
            Led:
                throw r8
            Lee:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L42
                throw r0     // Catch: java.lang.Throwable -> L42
            Lf6:
                if (r7 == 0) goto Lff
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> L22
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L22
            Lff:
                throw r0     // Catch: java.lang.Throwable -> L22
            L100:
                monitor-exit(r6)
                throw r0
            L102:
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

        public final void receive$okhttp(@org.jetbrains.annotations.NotNull okio.BufferedSource r14, long r15) throws java.io.IOException {
                r13 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r14, r0)
                okhttp3.internal.http2.Http2Stream r0 = r13.this$0
                boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
                if (r1 == 0) goto L39
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L12
                goto L39
            L12:
                java.lang.AssertionError r14 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Thread "
                r1.append(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " MUST NOT hold lock on "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r14.<init>(r0)
                throw r14
            L39:
                r0 = r15
            L3a:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Lb4
                okhttp3.internal.http2.Http2Stream r4 = r13.this$0
                monitor-enter(r4)
                boolean r5 = r13.finished     // Catch: java.lang.Throwable -> Lb0
                okio.Buffer r6 = r13.readBuffer     // Catch: java.lang.Throwable -> Lb0
                long r6 = r6.size()     // Catch: java.lang.Throwable -> Lb0
                long r6 = r6 + r0
                long r8 = r13.maxByteCount     // Catch: java.lang.Throwable -> Lb0
                r10 = 0
                r11 = 1
                int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r12 <= 0) goto L56
                r6 = 1
                goto L57
            L56:
                r6 = 0
            L57:
                kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lb0
                monitor-exit(r4)
                if (r6 == 0) goto L67
                r14.skip(r0)
                okhttp3.internal.http2.Http2Stream r14 = r13.this$0
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r14.closeLater(r0)
                return
            L67:
                if (r5 == 0) goto L6d
                r14.skip(r0)
                return
            L6d:
                okio.Buffer r4 = r13.receiveBuffer
                long r4 = r14.read(r4, r0)
                r6 = -1
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto Laa
                long r0 = r0 - r4
                okhttp3.internal.http2.Http2Stream r4 = r13.this$0
                monitor-enter(r4)
                boolean r5 = r13.closed     // Catch: java.lang.Throwable -> L87
                if (r5 == 0) goto L8a
                okio.Buffer r2 = r13.receiveBuffer     // Catch: java.lang.Throwable -> L87
                r2.clear()     // Catch: java.lang.Throwable -> L87
                goto La6
            L87:
                r0 = move-exception
                r14 = r0
                goto La8
            L8a:
                okio.Buffer r5 = r13.readBuffer     // Catch: java.lang.Throwable -> L87
                long r5 = r5.size()     // Catch: java.lang.Throwable -> L87
                int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r7 != 0) goto L95
                r10 = 1
            L95:
                okio.Buffer r2 = r13.readBuffer     // Catch: java.lang.Throwable -> L87
                okio.Buffer r3 = r13.receiveBuffer     // Catch: java.lang.Throwable -> L87
                r2.writeAll(r3)     // Catch: java.lang.Throwable -> L87
                if (r10 == 0) goto La6
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r4, r2)     // Catch: java.lang.Throwable -> L87
                r4.notifyAll()     // Catch: java.lang.Throwable -> L87
            La6:
                monitor-exit(r4)
                goto L3a
            La8:
                monitor-exit(r4)
                throw r14
            Laa:
                java.io.EOFException r14 = new java.io.EOFException
                r14.<init>()
                throw r14
            Lb0:
                r0 = move-exception
                r14 = r0
                monitor-exit(r4)
                throw r14
            Lb4:
                r0 = r15
                r13.updateConnectionFlowControl(r0)
                okhttp3.internal.http2.Http2Stream r14 = r13.this$0
                okhttp3.internal.http2.Http2Connection r14 = r14.getConnection()
                okhttp3.internal.http2.FlowControlListener r14 = r14.getFlowControlListener$okhttp()
                okhttp3.internal.http2.Http2Stream r0 = r13.this$0
                int r0 = r0.getId()
                okhttp3.internal.http2.Http2Stream r1 = r13.this$0
                okhttp3.internal.http2.flowcontrol.WindowCounter r1 = r1.getReadBytes()
                okio.Buffer r2 = r13.readBuffer
                long r2 = r2.size()
                r14.receivingStreamWindowChanged(r0, r1, r2)
                return
        }

        public final void setClosed$okhttp(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished$okhttp(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(@org.jetbrains.annotations.Nullable okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getReadTimeout$okhttp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class StreamTimeout extends okio.AsyncTimeout {
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        public StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.exit()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 0
                java.io.IOException r0 = r1.newTimeoutException(r0)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        protected java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Lc
                r0.initCause(r3)
            Lc:
                return r0
        }

        protected void timedOut() {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
                r0.closeLater(r1)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.sendDegradedPingLater$okhttp()
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Stream$Companion r0 = new okhttp3.internal.http2.Http2Stream$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Stream.Companion = r0
            return
    }

    public Http2Stream(int r4, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.Http2Connection r5, boolean r6, boolean r7, @org.jetbrains.annotations.Nullable okhttp3.Headers r8) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            r3.<init>()
            r3.id = r4
            r3.connection = r5
            okhttp3.internal.http2.flowcontrol.WindowCounter r0 = new okhttp3.internal.http2.flowcontrol.WindowCounter
            r0.<init>(r4)
            r3.readBytes = r0
            okhttp3.internal.http2.Settings r4 = r5.getPeerSettings()
            int r4 = r4.getInitialWindowSize()
            long r0 = (long) r4
            r3.writeBytesMaximum = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.headersQueue = r4
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Settings r5 = r5.getOkHttpSettings()
            int r5 = r5.getInitialWindowSize()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.source = r0
            okhttp3.internal.http2.Http2Stream$FramingSink r5 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r5.<init>(r3, r6)
            r3.sink = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.readTimeout = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.writeTimeout = r5
            if (r8 == 0) goto L5e
            boolean r5 = r3.isLocallyInitiated()
            if (r5 != 0) goto L56
            r4.add(r8)
            return
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "locally-initiated streams shouldn't have headers yet"
            r4.<init>(r5)
            throw r4
        L5e:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 == 0) goto L65
            return
        L65:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "remotely-initiated streams should have headers"
            r4.<init>(r5)
            throw r4
    }

    public static final /* synthetic */ boolean access$doReadTimeout(okhttp3.internal.http2.Http2Stream r0) {
            boolean r0 = r0.doReadTimeout()
            return r0
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode r3, java.io.IOException r4) {
            r2 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L32:
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            if (r0 == 0) goto L3c
            monitor-exit(r2)
            return r1
        L3c:
            r2.errorCode = r3     // Catch: java.lang.Throwable -> L5e
            r2.errorException = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r2, r3)     // Catch: java.lang.Throwable -> L5e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L5e
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource()     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r3.getFinished$okhttp()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L60
            okhttp3.internal.http2.Http2Stream$FramingSink r3 = r2.getSink()     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r3.getFinished()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L60
            monitor-exit(r2)
            return r1
        L5e:
            r3 = move-exception
            goto L6c
        L60:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
            r3 = 1
            return r3
        L6c:
            monitor-exit(r2)
            throw r3
    }

    private final boolean doReadTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            boolean r0 = r0.getClient$okhttp()
            if (r0 == 0) goto L1f
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.getSink()
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L1f
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.getSink()
            boolean r0 = r0.getFinished()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            return r0
        L1f:
            r0 = 1
            return r0
    }

    public static /* synthetic */ okhttp3.Headers takeHeaders$default(okhttp3.internal.http2.Http2Stream r0, boolean r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            okhttp3.Headers r0 = r0.takeHeaders(r1)
            return r0
    }

    public final void addBytesToWriteWindow(long r4) {
            r3 = this;
            long r0 = r3.writeBytesMaximum
            long r0 = r0 + r4
            r3.writeBytesMaximum = r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r3, r4)
            r3.notifyAll()
        L13:
            return
    }

    public void cancel() {
            r1 = this;
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1.closeLater(r0)
            return
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
            r3 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            monitor-enter(r3)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.getSource()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L60
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.getSource()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L60
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.getSink()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L5e
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.getSink()     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L60
            goto L5e
        L5c:
            r0 = move-exception
            goto L7b
        L5e:
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            boolean r1 = r3.isOpen()     // Catch: java.lang.Throwable -> L5c
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)
            if (r0 == 0) goto L71
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r3.close(r0, r1)
            return
        L71:
            if (r1 != 0) goto L7a
            okhttp3.internal.http2.Http2Connection r0 = r3.connection
            int r1 = r3.id
            r0.removeStream$okhttp(r1)
        L7a:
            return
        L7b:
            monitor-exit(r3)
            throw r0
    }

    public final void checkOutNotClosed$okhttp() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.getSink()
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L35
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.getSink()
            boolean r0 = r0.getFinished()
            if (r0 != 0) goto L2d
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()
            if (r0 == 0) goto L2c
            java.io.IOException r0 = r2.errorException
            if (r0 == 0) goto L1f
            goto L2b
        L1f:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
            okhttp3.internal.http2.ErrorCode r1 = r2.getErrorCode$okhttp()
            kotlin.jvm.internal.g0.m(r1)
            r0.<init>(r1)
        L2b:
            throw r0
        L2c:
            return
        L2d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L35:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    public final void close(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2, @org.jetbrains.annotations.Nullable java.io.IOException r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "rstStatusCode"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r3 = r1.closeInternal(r2, r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            okhttp3.internal.http2.Http2Connection r3 = r1.connection
            int r0 = r1.id
            r3.writeSynReset$okhttp(r0, r2)
            return
    }

    public final void closeLater(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.id
            r0.writeSynResetLater$okhttp(r1, r3)
            return
    }

    public final void enqueueTrailers(@org.jetbrains.annotations.NotNull okhttp3.Headers r2) {
            r1 = this;
            java.lang.String r0 = "trailers"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.getSink()     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L2b
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L23
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.getSink()     // Catch: java.lang.Throwable -> L21
            r0.setTrailers(r2)     // Catch: java.lang.Throwable -> L21
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            goto L33
        L23:
            java.lang.String r2 = "trailers.size() == 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L2b:
            java.lang.String r2 = "already finished"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L33:
            monitor-exit(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Connection getConnection() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.IOException getErrorException$okhttp() {
            r1 = this;
            java.io.IOException r0 = r1.errorException
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.flowcontrol.WindowCounter getReadBytes() {
            r1 = this;
            okhttp3.internal.http2.flowcontrol.WindowCounter r0 = r1.readBytes
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.http2.Http2Stream.FramingSink getSink() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink
            return r0
    }

    /* renamed from: getSink, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okio.Sink m66getSink() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.getSink()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.http2.Http2Stream.FramingSource getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    /* renamed from: getSource, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okio.Source m67getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.getSource()
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }

    public final boolean isLocallyInitiated() {
            r4 = this;
            int r0 = r4.id
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            okhttp3.internal.http2.Http2Connection r3 = r4.connection
            boolean r3 = r3.getClient$okhttp()
            if (r3 != r0) goto L13
            return r1
        L13:
            return r2
    }

    public final boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r2)
            return r1
        La:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L3b
            goto L21
        L1f:
            r0 = move-exception
            goto L3e
        L21:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.getSink()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L35
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.getSink()     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L3b
        L35:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L3b
            monitor-exit(r2)
            return r1
        L3b:
            monitor-exit(r2)
            r0 = 1
            return r0
        L3e:
            monitor-exit(r2)
            throw r0
    }

    public final boolean isSourceComplete() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r1)
            return r0
        L20:
            monitor-exit(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.Headers peekTrailers() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L38
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L34
            okio.Buffer r0 = r0.getReceiveBuffer()     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L38
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L34
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L38
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L34
            okhttp3.Headers r0 = r0.getTrailers()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L36
            okhttp3.Headers r0 = okhttp3.Headers.EMPTY     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L53
        L36:
            monitor-exit(r2)
            return r0
        L38:
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L50
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L43
            goto L4f
        L43:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L34
            okhttp3.internal.http2.ErrorCode r1 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L34
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L34
        L50:
            monitor-exit(r2)
            r0 = 0
            return r0
        L53:
            monitor-exit(r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    public final void receiveData(@org.jetbrains.annotations.NotNull okio.BufferedSource r4, int r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Thread "
            r5.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.getSource()
            long r1 = (long) r5
            r0.receive$okhttp(r4, r1)
            return
    }

    public final void receiveHeaders(@org.jetbrains.annotations.NotNull okhttp3.Headers r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L56
            r1 = 1
            if (r0 == 0) goto L58
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4e
            goto L58
        L4e:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L56
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L56
            goto L5f
        L56:
            r3 = move-exception
            goto L81
        L58:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L56
            r0.add(r3)     // Catch: java.lang.Throwable -> L56
        L5f:
            if (r4 == 0) goto L68
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource()     // Catch: java.lang.Throwable -> L56
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L56
        L68:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r2, r4)     // Catch: java.lang.Throwable -> L56
            r2.notifyAll()     // Catch: java.lang.Throwable -> L56
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L56
            monitor-exit(r2)
            if (r3 != 0) goto L80
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L80:
            return
        L81:
            monitor-exit(r2)
            throw r3
    }

    public final void receiveRstStream(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2) {
            r1 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r1.errorCode = r2     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Throwable -> L17
            r1.notifyAll()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L1d:
            monitor-exit(r1)
            throw r2
    }

    public final void setErrorCode$okhttp(@org.jetbrains.annotations.Nullable okhttp3.internal.http2.ErrorCode r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public final void setErrorException$okhttp(@org.jetbrains.annotations.Nullable java.io.IOException r1) {
            r0 = this;
            r0.errorException = r1
            return
    }

    public final void setWriteBytesMaximum$okhttp(long r1) {
            r0 = this;
            r0.writeBytesMaximum = r1
            return
    }

    public final void setWriteBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.writeBytesTotal = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers takeHeaders(boolean r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
        L1:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L38
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L38
            if (r3 != 0) goto L1c
            boolean r0 = r2.doReadTimeout()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            goto L1c
        L18:
            r0 = 0
            goto L1d
        L1a:
            r3 = move-exception
            goto L61
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L24
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r1.enter()     // Catch: java.lang.Throwable -> L1a
        L24:
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L1
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
            goto L1
        L2f:
            r3 = move-exception
            if (r0 == 0) goto L37
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
        L37:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L38:
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L4f
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.removeFirst()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "removeFirst(...)"
            kotlin.jvm.internal.g0.o(r3, r0)     // Catch: java.lang.Throwable -> L1a
            okhttp3.Headers r3 = (okhttp3.Headers) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return r3
        L4f:
            java.io.IOException r3 = r2.errorException     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L54
            goto L60
        L54:
            okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a
        L60:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L61:
            monitor-exit(r2)
            throw r3
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
            r1 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r1, r0)     // Catch: java.lang.InterruptedException -> L9
            r1.wait()     // Catch: java.lang.InterruptedException -> L9
            return
        L9:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r6, boolean r7, boolean r8) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "responseHeaders"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Thread "
            r7.append(r8)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            java.lang.String r8 = " MUST NOT hold lock on "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L37:
            monitor-enter(r5)
            r0 = 1
            r5.hasResponseHeaders = r0     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L4f
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r5.getSink()     // Catch: java.lang.Throwable -> L4d
            r1.setFinished(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.g0.n(r5, r1)     // Catch: java.lang.Throwable -> L4d
            r5.notifyAll()     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r6 = move-exception
            goto L7c
        L4f:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            if (r8 != 0) goto L6d
            monitor-enter(r5)
            okhttp3.internal.http2.Http2Connection r8 = r5.connection     // Catch: java.lang.Throwable -> L6a
            long r1 = r8.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L6a
            okhttp3.internal.http2.Http2Connection r8 = r5.connection     // Catch: java.lang.Throwable -> L6a
            long r3 = r8.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L6a
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 < 0) goto L67
            r8 = 1
            goto L68
        L67:
            r8 = 0
        L68:
            monitor-exit(r5)
            goto L6d
        L6a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L6d:
            okhttp3.internal.http2.Http2Connection r0 = r5.connection
            int r1 = r5.id
            r0.writeHeaders$okhttp(r1, r7, r6)
            if (r8 == 0) goto L7b
            okhttp3.internal.http2.Http2Connection r6 = r5.connection
            r6.flush()
        L7b:
            return
        L7c:
            monitor-exit(r5)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }
}
