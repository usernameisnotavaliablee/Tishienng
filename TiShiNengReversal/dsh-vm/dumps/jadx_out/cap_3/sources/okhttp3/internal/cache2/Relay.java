package okhttp3.internal.cache2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class Relay implements okhttp3.internal.concurrent.Lockable {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.cache2.Relay.Companion Companion = null;
    private static final long FILE_HEADER_SIZE = 32;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString PREFIX_CLEAN = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString PREFIX_DIRTY = null;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;

    @org.jetbrains.annotations.Nullable
    private java.io.RandomAccessFile file;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString metadata;
    private int sourceCount;

    @org.jetbrains.annotations.Nullable
    private okio.Source upstream;

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer upstreamBuffer;
    private long upstreamPos;

    @org.jetbrains.annotations.Nullable
    private java.lang.Thread upstreamReader;

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
        public final okhttp3.internal.cache2.Relay edit(@org.jetbrains.annotations.NotNull java.io.File r11, @org.jetbrains.annotations.NotNull okio.Source r12, @org.jetbrains.annotations.NotNull okio.ByteString r13, long r14) throws java.io.IOException {
                r10 = this;
                java.lang.String r0 = "file"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.lang.String r0 = "upstream"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "metadata"
                kotlin.jvm.internal.g0.p(r13, r0)
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
                java.lang.String r0 = "rw"
                r2.<init>(r11, r0)
                okhttp3.internal.cache2.Relay r1 = new okhttp3.internal.cache2.Relay
                r4 = 0
                r9 = 0
                r3 = r12
                r6 = r13
                r7 = r14
                r1.<init>(r2, r3, r4, r6, r7, r9)
                r11 = 0
                r2.setLength(r11)
                okio.ByteString r4 = okhttp3.internal.cache2.Relay.PREFIX_DIRTY
                r5 = -1
                r7 = -1
                r3 = r1
                okhttp3.internal.cache2.Relay.access$writeHeader(r3, r4, r5, r7)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.cache2.Relay read(@org.jetbrains.annotations.NotNull java.io.File r11) throws java.io.IOException {
                r10 = this;
                java.lang.String r0 = "file"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
                java.lang.String r0 = "rw"
                r2.<init>(r11, r0)
                okhttp3.internal.cache2.FileOperator r3 = new okhttp3.internal.cache2.FileOperator
                java.nio.channels.FileChannel r11 = r2.getChannel()
                java.lang.String r0 = "getChannel(...)"
                kotlin.jvm.internal.g0.o(r11, r0)
                r3.<init>(r11)
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
                r4 = 0
                r7 = 32
                r3.read(r4, r6, r7)
                okio.ByteString r11 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
                int r0 = r11.size()
                long r0 = (long) r0
                okio.ByteString r0 = r6.readByteString(r0)
                boolean r11 = kotlin.jvm.internal.g0.g(r0, r11)
                if (r11 == 0) goto L59
                long r0 = r6.readLong()
                long r7 = r6.readLong()
                okio.Buffer r6 = new okio.Buffer
                r6.<init>()
                r4 = 32
                long r4 = r4 + r0
                r3.read(r4, r6, r7)
                okio.ByteString r6 = r6.readByteString()
                r4 = r0
                okhttp3.internal.cache2.Relay r1 = new okhttp3.internal.cache2.Relay
                r7 = 0
                r9 = 0
                r3 = 0
                r1.<init>(r2, r3, r4, r6, r7, r9)
                return r1
            L59:
                java.io.IOException r11 = new java.io.IOException
                java.lang.String r0 = "unreadable cache file"
                r11.<init>(r0)
                throw r11
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,362:1\n38#2:363\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n272#1:363\n*E\n"})
    public final class RelaySource implements okio.Source {

        @org.jetbrains.annotations.Nullable
        private okhttp3.internal.cache2.FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ okhttp3.internal.cache2.Relay this$0;

        @org.jetbrains.annotations.NotNull
        private final okio.Timeout timeout;

        public RelaySource(okhttp3.internal.cache2.Relay r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                okio.Timeout r0 = new okio.Timeout
                r0.<init>()
                r2.timeout = r0
                okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
                java.io.RandomAccessFile r3 = r3.getFile()
                kotlin.jvm.internal.g0.m(r3)
                java.nio.channels.FileChannel r3 = r3.getChannel()
                java.lang.String r1 = "getChannel(...)"
                kotlin.jvm.internal.g0.o(r3, r1)
                r0.<init>(r3)
                r2.fileOperator = r0
                return
        }

        public void close() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.cache2.FileOperator r0 = r3.fileOperator
                if (r0 != 0) goto L5
                goto L2d
            L5:
                r0 = 0
                r3.fileOperator = r0
                okhttp3.internal.cache2.Relay r1 = r3.this$0
                monitor-enter(r1)
                int r2 = r1.getSourceCount()     // Catch: java.lang.Throwable -> L23
                int r2 = r2 + (-1)
                r1.setSourceCount(r2)     // Catch: java.lang.Throwable -> L23
                int r2 = r1.getSourceCount()     // Catch: java.lang.Throwable -> L23
                if (r2 != 0) goto L25
                java.io.RandomAccessFile r2 = r1.getFile()     // Catch: java.lang.Throwable -> L23
                r1.setFile(r0)     // Catch: java.lang.Throwable -> L23
                r0 = r2
                goto L25
            L23:
                r0 = move-exception
                goto L2e
            L25:
                kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L23
                monitor-exit(r1)
                if (r0 == 0) goto L2d
                okhttp3.internal._UtilCommonKt.closeQuietly(r0)
            L2d:
                return
            L2e:
                monitor-exit(r1)
                throw r0
        }

        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r22, long r23) throws java.io.IOException {
                r21 = this;
                r1 = r21
                r2 = r23
                java.lang.String r0 = "sink"
                r5 = r22
                kotlin.jvm.internal.g0.p(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                if (r0 == 0) goto L179
                okhttp3.internal.cache2.Relay r8 = r1.this$0
                monitor-enter(r8)
            L12:
                long r6 = r8.getUpstreamPos()     // Catch: java.lang.Throwable -> L33
                long r9 = r1.sourcePos     // Catch: java.lang.Throwable -> L33
                r0 = 2
                r11 = -1
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 != 0) goto L3f
                boolean r4 = r8.getComplete()     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L27
                monitor-exit(r8)
                return r11
            L27:
                java.lang.Thread r4 = r8.getUpstreamReader()     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L36
                okio.Timeout r0 = r1.timeout     // Catch: java.lang.Throwable -> L33
                r0.waitUntilNotified(r8)     // Catch: java.lang.Throwable -> L33
                goto L12
            L33:
                r0 = move-exception
                goto L177
            L36:
                java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L33
                r8.setUpstreamReader(r4)     // Catch: java.lang.Throwable -> L33
                r4 = 1
                goto L53
            L3f:
                long r6 = r8.getUpstreamPos()     // Catch: java.lang.Throwable -> L33
                okio.Buffer r4 = r8.getBuffer()     // Catch: java.lang.Throwable -> L33
                long r9 = r4.size()     // Catch: java.lang.Throwable -> L33
                long r6 = r6 - r9
                long r9 = r1.sourcePos     // Catch: java.lang.Throwable -> L33
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 >= 0) goto L153
                r4 = 2
            L53:
                monitor-exit(r8)
                r8 = 32
                if (r4 != r0) goto L76
                okhttp3.internal.cache2.Relay r0 = r1.this$0
                long r6 = r0.getUpstreamPos()
                long r10 = r1.sourcePos
                long r6 = r6 - r10
                long r6 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                kotlin.jvm.internal.g0.m(r2)
                long r3 = r1.sourcePos
                long r3 = r3 + r8
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r6
                r1.sourcePos = r2
                return r6
            L76:
                r10 = 0
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                okio.Source r0 = r0.getUpstream()     // Catch: java.lang.Throwable -> Lb2
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                okio.Buffer r4 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r5 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                long r5 = r5.getBufferMaxSize()     // Catch: java.lang.Throwable -> Lb2
                long r13 = r0.read(r4, r5)     // Catch: java.lang.Throwable -> Lb2
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 != 0) goto Lb5
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                long r2 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> Lb2
                r0.commit(r2)     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r10)     // Catch: java.lang.Throwable -> Laf
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r2, r0)     // Catch: java.lang.Throwable -> Laf
                r2.notifyAll()     // Catch: java.lang.Throwable -> Laf
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r2)
                return r11
            Laf:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            Lb2:
                r0 = move-exception
                goto L13e
            Lb5:
                long r6 = java.lang.Math.min(r13, r2)     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                okio.Buffer r2 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> Lb2
                r4 = 0
                r3 = r22
                r2.copyTo(r3, r4, r6)     // Catch: java.lang.Throwable -> Lb2
                long r2 = r1.sourcePos     // Catch: java.lang.Throwable -> Lb2
                long r2 = r2 + r6
                r1.sourcePos = r2     // Catch: java.lang.Throwable -> Lb2
                r17 = r13
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch: java.lang.Throwable -> Lb2
                kotlin.jvm.internal.g0.m(r13)     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                long r2 = r0.getUpstreamPos()     // Catch: java.lang.Throwable -> Lb2
                long r14 = r2 + r8
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                okio.Buffer r0 = r0.getUpstreamBuffer()     // Catch: java.lang.Throwable -> Lb2
                okio.Buffer r16 = r0.clone()     // Catch: java.lang.Throwable -> Lb2
                r13.write(r14, r16, r17)     // Catch: java.lang.Throwable -> Lb2
                r2 = r17
                okhttp3.internal.cache2.Relay r4 = r1.this$0     // Catch: java.lang.Throwable -> Lb2
                monitor-enter(r4)     // Catch: java.lang.Throwable -> Lb2
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L11c
                okio.Buffer r5 = r4.getUpstreamBuffer()     // Catch: java.lang.Throwable -> L11c
                r0.write(r5, r2)     // Catch: java.lang.Throwable -> L11c
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L11c
                long r8 = r0.size()     // Catch: java.lang.Throwable -> L11c
                long r11 = r4.getBufferMaxSize()     // Catch: java.lang.Throwable -> L11c
                int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r0 <= 0) goto L11e
                okio.Buffer r0 = r4.getBuffer()     // Catch: java.lang.Throwable -> L11c
                okio.Buffer r5 = r4.getBuffer()     // Catch: java.lang.Throwable -> L11c
                long r8 = r5.size()     // Catch: java.lang.Throwable -> L11c
                long r11 = r4.getBufferMaxSize()     // Catch: java.lang.Throwable -> L11c
                long r8 = r8 - r11
                r0.skip(r8)     // Catch: java.lang.Throwable -> L11c
                goto L11e
            L11c:
                r0 = move-exception
                goto L13c
            L11e:
                long r8 = r4.getUpstreamPos()     // Catch: java.lang.Throwable -> L11c
                long r8 = r8 + r2
                r4.setUpstreamPos(r8)     // Catch: java.lang.Throwable -> L11c
                kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L11c
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r10)     // Catch: java.lang.Throwable -> L139
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r2, r0)     // Catch: java.lang.Throwable -> L139
                r2.notifyAll()     // Catch: java.lang.Throwable -> L139
                monitor-exit(r2)
                return r6
            L139:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L13c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb2
                throw r0     // Catch: java.lang.Throwable -> Lb2
            L13e:
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                r2.setUpstreamReader(r10)     // Catch: java.lang.Throwable -> L150
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.g0.n(r2, r3)     // Catch: java.lang.Throwable -> L150
                r2.notifyAll()     // Catch: java.lang.Throwable -> L150
                kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L150
                monitor-exit(r2)
                throw r0
            L150:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L153:
                long r4 = r8.getUpstreamPos()     // Catch: java.lang.Throwable -> L33
                long r9 = r1.sourcePos     // Catch: java.lang.Throwable -> L33
                long r4 = r4 - r9
                long r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L33
                r19 = r6
                r6 = r2
                r3 = r19
                okio.Buffer r2 = r8.getBuffer()     // Catch: java.lang.Throwable -> L33
                long r9 = r1.sourcePos     // Catch: java.lang.Throwable -> L33
                long r9 = r9 - r3
                r3 = r22
                r4 = r9
                r2.copyTo(r3, r4, r6)     // Catch: java.lang.Throwable -> L33
                long r2 = r1.sourcePos     // Catch: java.lang.Throwable -> L33
                long r2 = r2 + r6
                r1.sourcePos = r2     // Catch: java.lang.Throwable -> L33
                monitor-exit(r8)
                return r6
            L177:
                monitor-exit(r8)
                throw r0
            L179:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Check failed."
                r0.<init>(r2)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.internal.cache2.Relay$Companion r0 = new okhttp3.internal.cache2.Relay$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.cache2.Relay.Companion = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "OkHttp cache v1\n"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_CLEAN = r1
            java.lang.String r1 = "OkHttp DIRTY :(\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.cache2.Relay.PREFIX_DIRTY = r0
            return
    }

    private Relay(java.io.RandomAccessFile r1, okio.Source r2, long r3, okio.ByteString r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            r0.upstream = r2
            r0.upstreamPos = r3
            r0.metadata = r5
            r0.bufferMaxSize = r6
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.upstreamBuffer = r1
            okio.Source r1 = r0.upstream
            if (r1 != 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r0.complete = r1
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r0.buffer = r1
            return
    }

    public /* synthetic */ Relay(java.io.RandomAccessFile r1, okio.Source r2, long r3, okio.ByteString r5, long r6, kotlin.jvm.internal.v r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    public static final /* synthetic */ void access$writeHeader(okhttp3.internal.cache2.Relay r0, okio.ByteString r1, long r2, long r4) {
            r0.writeHeader(r1, r2, r4)
            return
    }

    private final void writeHeader(okio.ByteString r7, long r8, long r10) throws java.io.IOException {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r3.write(r7)
            r3.writeLong(r8)
            r3.writeLong(r10)
            long r7 = r3.size()
            r9 = 32
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L33
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r7 = r6.file
            kotlin.jvm.internal.g0.m(r7)
            java.nio.channels.FileChannel r7 = r7.getChannel()
            java.lang.String r8 = "getChannel(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            r0.<init>(r7)
            r1 = 0
            r4 = 32
            r0.write(r1, r3, r4)
            return
        L33:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Failed requirement."
            r7.<init>(r8)
            throw r7
    }

    private final void writeMetadata(long r7) throws java.io.IOException {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.ByteString r0 = r6.metadata
            r3.write(r0)
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r1 = r6.file
            kotlin.jvm.internal.g0.m(r1)
            java.nio.channels.FileChannel r1 = r1.getChannel()
            java.lang.String r2 = "getChannel(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            r1 = 32
            long r1 = r1 + r7
            okio.ByteString r7 = r6.metadata
            int r7 = r7.size()
            long r4 = (long) r7
            r0.write(r1, r3, r4)
            return
    }

    public final void commit(long r9) throws java.io.IOException {
            r8 = this;
            r8.writeMetadata(r9)
            java.io.RandomAccessFile r0 = r8.file
            kotlin.jvm.internal.g0.m(r0)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r1 = 0
            r0.force(r1)
            okio.ByteString r3 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
            okio.ByteString r0 = r8.metadata
            int r0 = r0.size()
            long r6 = (long) r0
            r2 = r8
            r4 = r9
            r2.writeHeader(r3, r4, r6)
            java.io.RandomAccessFile r9 = r2.file
            kotlin.jvm.internal.g0.m(r9)
            java.nio.channels.FileChannel r9 = r9.getChannel()
            r9.force(r1)
            monitor-enter(r8)
            r9 = 1
            r2.complete = r9     // Catch: java.lang.Throwable -> L3c
            kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)
            okio.Source r9 = r2.upstream
            if (r9 == 0) goto L38
            okhttp3.internal._UtilCommonKt.closeQuietly(r9)
        L38:
            r9 = 0
            r2.upstream = r9
            return
        L3c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final long getBufferMaxSize() {
            r2 = this;
            long r0 = r2.bufferMaxSize
            return r0
    }

    public final boolean getComplete() {
            r1 = this;
            boolean r0 = r1.complete
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.RandomAccessFile getFile() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            return r0
    }

    public final int getSourceCount() {
            r1 = this;
            int r0 = r1.sourceCount
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Source getUpstream() {
            r1 = this;
            okio.Source r0 = r1.upstream
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer getUpstreamBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.upstreamBuffer
            return r0
    }

    public final long getUpstreamPos() {
            r2 = this;
            long r0 = r2.upstreamPos
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Thread getUpstreamReader() {
            r1 = this;
            java.lang.Thread r0 = r1.upstreamReader
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString metadata() {
            r1 = this;
            okio.ByteString r0 = r1.metadata
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Source newSource() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.file     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            int r0 = r1.sourceCount     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r1.sourceCount = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            okhttp3.internal.cache2.Relay$RelaySource r0 = new okhttp3.internal.cache2.Relay$RelaySource
            r0.<init>(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void setComplete(boolean r1) {
            r0 = this;
            r0.complete = r1
            return
    }

    public final void setFile(@org.jetbrains.annotations.Nullable java.io.RandomAccessFile r1) {
            r0 = this;
            r0.file = r1
            return
    }

    public final void setSourceCount(int r1) {
            r0 = this;
            r0.sourceCount = r1
            return
    }

    public final void setUpstream(@org.jetbrains.annotations.Nullable okio.Source r1) {
            r0 = this;
            r0.upstream = r1
            return
    }

    public final void setUpstreamPos(long r1) {
            r0 = this;
            r0.upstreamPos = r1
            return
    }

    public final void setUpstreamReader(@org.jetbrains.annotations.Nullable java.lang.Thread r1) {
            r0 = this;
            r0.upstreamReader = r1
            return
    }
}
