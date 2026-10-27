package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n40#2:445\n40#2:447\n40#2:448\n40#2:449\n40#2:450\n40#2:451\n40#2:452\n40#2:453\n40#2:457\n40#2:459\n1#3:446\n63#4:454\n63#4:455\n63#4:456\n51#5:458\n85#6:460\n85#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class FileHandle implements java.io.Closeable {
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;
    private int openStreamCount;
    private final boolean readWrite;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    private static final class FileHandleSink implements okio.Sink {
        private boolean closed;

        @org.jetbrains.annotations.NotNull
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSink(@org.jetbrains.annotations.NotNull okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L38
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L38
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L3a
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L2d
                goto L3a
            L2d:
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L38
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L38:
                r1 = move-exception
                goto L3e
            L3a:
                r0.unlock()
                return
            L3e:
                r0.unlock()
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 != 0) goto La
                okio.FileHandle r0 = r2.fileHandle
                r0.protectedFlush()
                return
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                r0.<init>(r1)
                throw r0
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Sink
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }

        @Override // okio.Sink
        public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L18
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                okio.FileHandle.access$writeNoCloseCheck(r1, r2, r4, r5)
                long r8 = r7.position
                long r8 = r8 + r5
                r7.position = r8
                return
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    private static final class FileHandleSource implements okio.Source {
        private boolean closed;

        @org.jetbrains.annotations.NotNull
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSource(@org.jetbrains.annotations.NotNull okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L38
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L38
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L3a
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L38
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L2d
                goto L3a
            L2d:
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L38
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L38:
                r1 = move-exception
                goto L3e
            L3a:
                r0.unlock()
                return
            L3e:
                r0.unlock()
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        @Override // okio.Source
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.g0.p(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L1f
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                long r8 = okio.FileHandle.access$readNoCloseCheck(r1, r2, r4, r5)
                r0 = -1
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 == 0) goto L1e
                long r0 = r7.position
                long r0 = r0 + r8
                r7.position = r0
            L1e:
                return r8
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                r8.<init>(r9)
                throw r8
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Source
        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }
    }

    public FileHandle(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.readWrite = r1
            java.util.concurrent.locks.ReentrantLock r1 = okio._JvmPlatformKt.newLock()
            r0.lock = r1
            return
    }

    public static final /* synthetic */ boolean access$getClosed$p(okio.FileHandle r0) {
            boolean r0 = r0.closed
            return r0
    }

    public static final /* synthetic */ int access$getOpenStreamCount$p(okio.FileHandle r0) {
            int r0 = r0.openStreamCount
            return r0
    }

    public static final /* synthetic */ long access$readNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            long r0 = r0.readNoCloseCheck(r1, r3, r4)
            return r0
    }

    public static final /* synthetic */ void access$setOpenStreamCount$p(okio.FileHandle r0, int r1) {
            r0.openStreamCount = r1
            return
    }

    public static final /* synthetic */ void access$writeNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            r0.writeNoCloseCheck(r1, r3, r4)
            return
    }

    private final long readNoCloseCheck(long r15, okio.Buffer r17, long r18) {
            r14 = this;
            r0 = r17
            r1 = r18
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L53
            long r1 = r1 + r15
            r4 = r15
        Lc:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L51
            r3 = 1
            okio.Segment r9 = r0.writableSegment$okio(r3)
            byte[] r6 = r9.data
            int r7 = r9.limit
            long r10 = r1 - r4
            int r3 = 8192 - r7
            long r12 = (long) r3
            long r10 = java.lang.Math.min(r10, r12)
            int r8 = (int) r10
            r3 = r14
            int r6 = r3.protectedRead(r4, r6, r7, r8)
            r3 = -1
            if (r6 != r3) goto L41
            int r1 = r9.pos
            int r2 = r9.limit
            if (r1 != r2) goto L3a
            okio.Segment r1 = r9.pop()
            r0.head = r1
            okio.SegmentPool.recycle(r9)
        L3a:
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 != 0) goto L51
            r0 = -1
            return r0
        L41:
            int r3 = r9.limit
            int r3 = r3 + r6
            r9.limit = r3
            long r6 = (long) r6
            long r4 = r4 + r6
            long r8 = r0.size()
            long r8 = r8 + r6
            r0.setSize$okio(r8)
            goto Lc
        L51:
            long r4 = r4 - r15
            return r4
        L53:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "byteCount < 0: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Sink r0 = r0.sink(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Source r0 = r0.source(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: source"
            r0.<init>(r1)
            throw r0
    }

    private final void writeNoCloseCheck(long r8, okio.Buffer r10, long r11) {
            r7 = this;
            long r0 = r10.size()
            r2 = 0
            r4 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            long r11 = r8 + r4
            r1 = r8
        Ld:
            int r8 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r8 >= 0) goto L4a
            okio.Segment r8 = r10.head
            kotlin.jvm.internal.g0.m(r8)
            long r3 = r11 - r1
            int r9 = r8.limit
            int r0 = r8.pos
            int r9 = r9 - r0
            long r5 = (long) r9
            long r3 = java.lang.Math.min(r3, r5)
            int r5 = (int) r3
            byte[] r3 = r8.data
            int r4 = r8.pos
            r0 = r7
            r0.protectedWrite(r1, r3, r4, r5)
            int r9 = r8.pos
            int r9 = r9 + r5
            r8.pos = r9
            long r3 = (long) r5
            long r1 = r1 + r3
            long r5 = r10.size()
            long r5 = r5 - r3
            r10.setSize$okio(r5)
            int r9 = r8.pos
            int r0 = r8.limit
            if (r9 != r0) goto Ld
            okio.Segment r9 = r8.pop()
            r10.head = r9
            okio.SegmentPool.recycle(r8)
            goto Ld
        L4a:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink appendingSink() throws java.io.IOException {
            r2 = this;
            long r0 = r2.size()
            okio.Sink r0 = r2.sink(r0)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto Ld
            r0.unlock()
            return
        Ld:
            r1 = 1
            r2.closed = r1     // Catch: java.lang.Throwable -> L21
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L18
            r0.unlock()
            return
        L18:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            r2.protectedClose()
            return
        L21:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void flush() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.readWrite
            if (r0 == 0) goto L24
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            r3.protectedFlush()
            return
        L16:
            r1 = move-exception
            goto L20
        L18:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L16
        L20:
            r0.unlock()
            throw r1
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final boolean getReadWrite() {
            r1 = this;
            boolean r0 = r1.readWrite
            return r0
    }

    public final long position(@org.jetbrains.annotations.NotNull okio.Sink r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSink
            if (r0 == 0) goto L14
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Sink r5 = r5.sink
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r2 == 0) goto L39
            r2 = r5
            okio.FileHandle$FileHandleSink r2 = (okio.FileHandle.FileHandleSink) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L39
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L31
            long r2 = r5.getPosition()
            long r2 = r2 + r0
            return r2
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r5.<init>(r0)
            throw r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sink was not created by this FileHandle"
            r5.<init>(r0)
            throw r5
    }

    public final long position(@org.jetbrains.annotations.NotNull okio.Source r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSource
            if (r0 == 0) goto L14
            okio.RealBufferedSource r5 = (okio.RealBufferedSource) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Source r5 = r5.source
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSource
            if (r2 == 0) goto L39
            r2 = r5
            okio.FileHandle$FileHandleSource r2 = (okio.FileHandle.FileHandleSource) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L39
            okio.FileHandle$FileHandleSource r5 = (okio.FileHandle.FileHandleSource) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L31
            long r2 = r5.getPosition()
            long r2 = r2 - r0
            return r2
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r5.<init>(r0)
            throw r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "source was not created by this FileHandle"
            r5.<init>(r0)
            throw r5
    }

    protected abstract void protectedClose() throws java.io.IOException;

    protected abstract void protectedFlush() throws java.io.IOException;

    protected abstract int protectedRead(long r1, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) throws java.io.IOException;

    protected abstract void protectedResize(long r1) throws java.io.IOException;

    protected abstract long protectedSize() throws java.io.IOException;

    protected abstract void protectedWrite(long r1, @org.jetbrains.annotations.NotNull byte[] r3, int r4, int r5) throws java.io.IOException;

    public final int read(long r3, @org.jetbrains.annotations.NotNull byte[] r5, int r6, int r7) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1b
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            r1.unlock()
            int r3 = r2.protectedRead(r3, r5, r6, r7)
            return r3
        L18:
            r0 = move-exception
            r3 = r0
            goto L23
        L1b:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L23:
            r1.unlock()
            throw r3
    }

    public final long read(long r3, @org.jetbrains.annotations.NotNull okio.Buffer r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1b
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            r1.unlock()
            long r3 = r2.readNoCloseCheck(r3, r5, r6)
            return r3
        L18:
            r0 = move-exception
            r3 = r0
            goto L23
        L1b:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L23:
            r1.unlock()
            throw r3
    }

    public final void reposition(@org.jetbrains.annotations.NotNull okio.Sink r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSink
            java.lang.String r1 = "closed"
            java.lang.String r2 = "sink was not created by this FileHandle"
            if (r0 == 0) goto L39
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Sink r0 = r5.sink
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSink
            if (r3 == 0) goto L33
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r4) goto L33
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L2d
            r5.emit()
            r0.setPosition(r6)
            return
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r1)
            throw r5
        L33:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L39:
            boolean r0 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r0 == 0) goto L58
            r0 = r5
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r4) goto L58
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r0 = r5.getClosed()
            if (r0 != 0) goto L52
            r5.setPosition(r6)
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r1)
            throw r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
    }

    public final void reposition(@org.jetbrains.annotations.NotNull okio.Source r9, long r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9 instanceof okio.RealBufferedSource
            java.lang.String r1 = "closed"
            java.lang.String r2 = "source was not created by this FileHandle"
            if (r0 == 0) goto L56
            okio.RealBufferedSource r9 = (okio.RealBufferedSource) r9
            okio.Source r0 = r9.source
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSource
            if (r3 == 0) goto L50
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r8) goto L50
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L4a
            okio.Buffer r1 = r9.bufferField
            long r1 = r1.size()
            long r3 = r0.getPosition()
            long r3 = r3 - r1
            long r3 = r10 - r3
            r5 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L41
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L41
            r9.skip(r3)
            return
        L41:
            okio.Buffer r9 = r9.bufferField
            r9.clear()
            r0.setPosition(r10)
            return
        L4a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        L50:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            throw r9
        L56:
            boolean r0 = r9 instanceof okio.FileHandle.FileHandleSource
            if (r0 == 0) goto L75
            r0 = r9
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r8) goto L75
            okio.FileHandle$FileHandleSource r9 = (okio.FileHandle.FileHandleSource) r9
            boolean r0 = r9.getClosed()
            if (r0 != 0) goto L6f
            r9.setPosition(r10)
            return
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        L75:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            throw r9
    }

    public final void resize(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L24
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            r2.protectedResize(r3)
            return
        L16:
            r3 = move-exception
            goto L20
        L18:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16
            throw r4     // Catch: java.lang.Throwable -> L16
        L20:
            r0.unlock()
            throw r3
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L1c
            r0.unlock()
            okio.FileHandle$FileHandleSink r0 = new okio.FileHandle$FileHandleSink
            r0.<init>(r2, r3)
            return r0
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L26:
            r0.unlock()
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            r3.<init>(r4)
            throw r3
    }

    public final long size() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            long r0 = r3.protectedSize()
            return r0
        L13:
            r1 = move-exception
            goto L1d
        L15:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L1d:
            r0.unlock()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source source(long r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            okio.FileHandle$FileHandleSource r0 = new okio.FileHandle$FileHandleSource
            r0.<init>(r2, r3)
            return r0
        L18:
            r3 = move-exception
            goto L22
        L1a:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L22:
            r0.unlock()
            throw r3
    }

    public final void write(long r3, @org.jetbrains.annotations.NotNull okio.Buffer r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1e
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            r1.unlock()
            r2.writeNoCloseCheck(r3, r5, r6)
            return
        L1b:
            r0 = move-exception
            r3 = r0
            goto L26
        L1e:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L26:
            r1.unlock()
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            r3.<init>(r4)
            throw r3
    }

    public final void write(long r3, @org.jetbrains.annotations.NotNull byte[] r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.lock()
            boolean r0 = r2.closed     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1e
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            r1.unlock()
            r2.protectedWrite(r3, r5, r6, r7)
            return
        L1b:
            r0 = move-exception
            r3 = r0
            goto L26
        L1e:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L26:
            r1.unlock()
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            r3.<init>(r4)
            throw r3
    }
}
