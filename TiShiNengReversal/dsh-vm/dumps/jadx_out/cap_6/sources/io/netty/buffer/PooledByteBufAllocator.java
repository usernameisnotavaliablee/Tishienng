package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class PooledByteBufAllocator extends io.netty.buffer.AbstractByteBufAllocator implements io.netty.buffer.ByteBufAllocatorMetricProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final io.netty.buffer.PooledByteBufAllocator DEFAULT = null;
    private static final int DEFAULT_CACHE_TRIM_INTERVAL = 0;
    private static final long DEFAULT_CACHE_TRIM_INTERVAL_MILLIS = 0;
    private static final int DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT = 0;
    private static final int DEFAULT_MAX_CACHED_BUFFER_CAPACITY = 0;
    static final int DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK = 0;
    private static final int DEFAULT_MAX_ORDER = 0;
    private static final int DEFAULT_NORMAL_CACHE_SIZE = 0;
    private static final int DEFAULT_NUM_DIRECT_ARENA = 0;
    private static final int DEFAULT_NUM_HEAP_ARENA = 0;
    private static final int DEFAULT_PAGE_SIZE = 0;
    private static final int DEFAULT_SMALL_CACHE_SIZE = 0;
    private static final int DEFAULT_TINY_CACHE_SIZE = 0;
    private static final boolean DEFAULT_USE_CACHE_FOR_ALL_THREADS = false;
    private static final int MAX_CHUNK_SIZE = 1073741824;
    private static final int MIN_PAGE_SIZE = 4096;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final int chunkSize;
    private final java.util.List<io.netty.buffer.PoolArenaMetric> directArenaMetrics;
    private final io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] directArenas;
    private final java.util.List<io.netty.buffer.PoolArenaMetric> heapArenaMetrics;
    private final io.netty.buffer.PoolArena<byte[]>[] heapArenas;
    private final io.netty.buffer.PooledByteBufAllocatorMetric metric;
    private final int normalCacheSize;
    private final int smallCacheSize;
    private final io.netty.buffer.PooledByteBufAllocator.PoolThreadLocalCache threadCache;
    private final int tinyCacheSize;
    private final java.lang.Runnable trimTask;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class PoolThreadLocalCache extends io.netty.util.concurrent.FastThreadLocal<io.netty.buffer.PoolThreadCache> {
        final /* synthetic */ io.netty.buffer.PooledByteBufAllocator this$0;
        private final boolean useCacheForAllThreads;

        PoolThreadLocalCache(io.netty.buffer.PooledByteBufAllocator r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.useCacheForAllThreads = r2
                return
        }

        private <T> io.netty.buffer.PoolArena<T> leastUsedArena(io.netty.buffer.PoolArena<T>[] r6) {
                r5 = this;
                if (r6 == 0) goto L22
                int r0 = r6.length
                if (r0 != 0) goto L6
                goto L22
            L6:
                r0 = 0
                r0 = r6[r0]
                r1 = 1
            La:
                int r2 = r6.length
                if (r1 >= r2) goto L21
                r2 = r6[r1]
                java.util.concurrent.atomic.AtomicInteger r3 = r2.numThreadCaches
                int r3 = r3.get()
                java.util.concurrent.atomic.AtomicInteger r4 = r0.numThreadCaches
                int r4 = r4.get()
                if (r3 >= r4) goto L1e
                r0 = r2
            L1e:
                int r1 = r1 + 1
                goto La
            L21:
                return r0
            L22:
                r6 = 0
                return r6
        }

        protected synchronized io.netty.buffer.PoolThreadCache initialValue() {
                r9 = this;
                monitor-enter(r9)
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PoolArena[] r0 = io.netty.buffer.PooledByteBufAllocator.access$000(r0)     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PoolArena r2 = r9.leastUsedArena(r0)     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PoolArena[] r0 = io.netty.buffer.PooledByteBufAllocator.access$100(r0)     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PoolArena r3 = r9.leastUsedArena(r0)     // Catch: java.lang.Throwable -> L2e
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2e
                boolean r1 = r9.useCacheForAllThreads     // Catch: java.lang.Throwable -> L2e
                if (r1 != 0) goto L30
                boolean r0 = r0 instanceof io.netty.util.concurrent.FastThreadLocalThread     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L22
                goto L30
            L22:
                io.netty.buffer.PoolThreadCache r1 = new io.netty.buffer.PoolThreadCache     // Catch: java.lang.Throwable -> L2e
                r7 = 0
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r9)
                return r1
            L2e:
                r0 = move-exception
                goto L74
            L30:
                io.netty.buffer.PoolThreadCache r1 = new io.netty.buffer.PoolThreadCache     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                int r4 = io.netty.buffer.PooledByteBufAllocator.access$200(r0)     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                int r5 = io.netty.buffer.PooledByteBufAllocator.access$300(r0)     // Catch: java.lang.Throwable -> L2e
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                int r6 = io.netty.buffer.PooledByteBufAllocator.access$400(r0)     // Catch: java.lang.Throwable -> L2e
                int r7 = io.netty.buffer.PooledByteBufAllocator.access$500()     // Catch: java.lang.Throwable -> L2e
                int r8 = io.netty.buffer.PooledByteBufAllocator.access$600()     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
                long r2 = io.netty.buffer.PooledByteBufAllocator.access$700()     // Catch: java.lang.Throwable -> L2e
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L72
                io.netty.util.concurrent.EventExecutor r2 = io.netty.util.internal.ThreadExecutorMap.currentExecutor()     // Catch: java.lang.Throwable -> L2e
                if (r2 == 0) goto L72
                io.netty.buffer.PooledByteBufAllocator r0 = r9.this$0     // Catch: java.lang.Throwable -> L2e
                java.lang.Runnable r3 = io.netty.buffer.PooledByteBufAllocator.access$800(r0)     // Catch: java.lang.Throwable -> L2e
                long r4 = io.netty.buffer.PooledByteBufAllocator.access$700()     // Catch: java.lang.Throwable -> L2e
                long r6 = io.netty.buffer.PooledByteBufAllocator.access$700()     // Catch: java.lang.Throwable -> L2e
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2e
                r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L2e
            L72:
                monitor-exit(r9)
                return r1
            L74:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
                throw r0
        }

        /* renamed from: initialValue, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ java.lang.Object m13initialValue() throws java.lang.Exception {
                r1 = this;
                io.netty.buffer.PoolThreadCache r0 = r1.initialValue()
                return r0
        }

        protected void onRemoval(io.netty.buffer.PoolThreadCache r2) {
                r1 = this;
                r0 = 0
                r2.free(r0)
                return
        }

        protected /* bridge */ /* synthetic */ void onRemoval(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.netty.buffer.PoolThreadCache r1 = (io.netty.buffer.PoolThreadCache) r1
                r0.onRemoval(r1)
                return
        }
    }

    static {
            java.lang.Class<io.netty.buffer.PooledByteBufAllocator> r0 = io.netty.buffer.PooledByteBufAllocator.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.buffer.PooledByteBufAllocator.logger = r0
            java.lang.String r0 = "io.netty.allocator.pageSize"
            r1 = 8192(0x2000, float:1.148E-41)
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            r2 = 0
            validateAndCalculatePageShifts(r0)     // Catch: java.lang.Throwable -> L16
            r3 = r2
            goto L1a
        L16:
            r0 = move-exception
            r3 = r0
            r0 = 8192(0x2000, float:1.148E-41)
        L1a:
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_PAGE_SIZE = r0
            java.lang.String r4 = "io.netty.allocator.maxOrder"
            r5 = 11
            int r4 = io.netty.util.internal.SystemPropertyUtil.getInt(r4, r5)
            validateAndCalculateChunkSize(r0, r4)     // Catch: java.lang.Throwable -> L29
            r5 = r4
            goto L2b
        L29:
            r0 = move-exception
            r2 = r0
        L2b:
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_ORDER = r5
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r4 = io.netty.util.NettyRuntime.availableProcessors()
            int r4 = r4 * 2
            int r6 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_PAGE_SIZE
            int r7 = r6 << r5
            long r8 = (long) r4
            long r10 = r0.maxMemory()
            long r12 = (long) r7
            long r10 = r10 / r12
            r14 = 2
            long r10 = r10 / r14
            r16 = 3
            long r10 = r10 / r16
            long r10 = java.lang.Math.min(r8, r10)
            int r0 = (int) r10
            java.lang.String r4 = "io.netty.allocator.numHeapArenas"
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r4, r0)
            r4 = 0
            int r0 = java.lang.Math.max(r4, r0)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_HEAP_ARENA = r0
            long r10 = io.netty.util.internal.PlatformDependent.maxDirectMemory()
            long r10 = r10 / r12
            long r10 = r10 / r14
            long r10 = r10 / r16
            long r7 = java.lang.Math.min(r8, r10)
            int r8 = (int) r7
            java.lang.String r7 = "io.netty.allocator.numDirectArenas"
            int r7 = io.netty.util.internal.SystemPropertyUtil.getInt(r7, r8)
            int r7 = java.lang.Math.max(r4, r7)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_DIRECT_ARENA = r7
            java.lang.String r8 = "io.netty.allocator.tinyCacheSize"
            r9 = 512(0x200, float:7.17E-43)
            int r8 = io.netty.util.internal.SystemPropertyUtil.getInt(r8, r9)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_TINY_CACHE_SIZE = r8
            java.lang.String r9 = "io.netty.allocator.smallCacheSize"
            r10 = 256(0x100, float:3.59E-43)
            int r9 = io.netty.util.internal.SystemPropertyUtil.getInt(r9, r10)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_SMALL_CACHE_SIZE = r9
            java.lang.String r10 = "io.netty.allocator.normalCacheSize"
            r11 = 64
            int r10 = io.netty.util.internal.SystemPropertyUtil.getInt(r10, r11)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_NORMAL_CACHE_SIZE = r10
            java.lang.String r11 = "io.netty.allocator.maxCachedBufferCapacity"
            r12 = 32768(0x8000, float:4.5918E-41)
            int r11 = io.netty.util.internal.SystemPropertyUtil.getInt(r11, r12)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_CACHED_BUFFER_CAPACITY = r11
            java.lang.String r12 = "io.netty.allocator.cacheTrimInterval"
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r12, r1)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL = r1
            java.lang.String r12 = "io.netty.allocation.cacheTrimIntervalMillis"
            r13 = 0
            long r12 = io.netty.util.internal.SystemPropertyUtil.getLong(r12, r13)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL_MILLIS = r12
            java.lang.String r14 = "io.netty.allocator.useCacheForAllThreads"
            r15 = 1
            boolean r14 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r14, r15)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_USE_CACHE_FOR_ALL_THREADS = r14
            java.lang.String r15 = "io.netty.allocator.directMemoryCacheAlignment"
            int r4 = io.netty.util.internal.SystemPropertyUtil.getInt(r15, r4)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT = r4
            java.lang.String r4 = "io.netty.allocator.maxCachedByteBuffersPerChunk"
            r15 = 1023(0x3ff, float:1.434E-42)
            int r4 = io.netty.util.internal.SystemPropertyUtil.getInt(r4, r15)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK = r4
            io.netty.util.internal.logging.InternalLogger r15 = io.netty.buffer.PooledByteBufAllocator.logger
            boolean r16 = r15.isDebugEnabled()
            if (r16 == 0) goto L161
            r16 = r0
            java.lang.String r0 = "-Dio.netty.allocator.numHeapArenas: {}"
            r17 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.numDirectArenas: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.pageSize: {}"
            if (r3 != 0) goto Lf4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r15.debug(r0, r1)
            goto Lfb
        Lf4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r15.debug(r0, r1, r3)
        Lfb:
            java.lang.String r0 = "-Dio.netty.allocator.maxOrder: {}"
            if (r2 != 0) goto L107
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r15.debug(r0, r1)
            goto L10e
        L107:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r15.debug(r0, r1, r2)
        L10e:
            int r0 = r6 << r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "-Dio.netty.allocator.chunkSize: {}"
            r15.debug(r1, r0)
            java.lang.String r0 = "-Dio.netty.allocator.tinyCacheSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.smallCacheSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.normalCacheSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.maxCachedBufferCapacity: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.cacheTrimInterval: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.cacheTrimIntervalMillis: {}"
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.useCacheForAllThreads: {}"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            r15.debug(r0, r1)
            java.lang.String r0 = "-Dio.netty.allocator.maxCachedByteBuffersPerChunk: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r15.debug(r0, r1)
        L161:
            io.netty.buffer.PooledByteBufAllocator r0 = new io.netty.buffer.PooledByteBufAllocator
            boolean r1 = io.netty.util.internal.PlatformDependent.directBufferPreferred()
            r0.<init>(r1)
            io.netty.buffer.PooledByteBufAllocator.DEFAULT = r0
            return
    }

    public PooledByteBufAllocator() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public PooledByteBufAllocator(int r7, int r8, int r9, int r10) {
            r6 = this;
            r1 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PooledByteBufAllocator(boolean r7) {
            r6 = this;
            int r2 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_HEAP_ARENA
            int r3 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_DIRECT_ARENA
            int r4 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_PAGE_SIZE
            int r5 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_ORDER
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public PooledByteBufAllocator(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            int r6 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_TINY_CACHE_SIZE
            int r7 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_SMALL_CACHE_SIZE
            int r8 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NORMAL_CACHE_SIZE
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @java.lang.Deprecated
    public PooledByteBufAllocator(boolean r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
            r11 = this;
            boolean r9 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_USE_CACHE_FOR_ALL_THREADS
            int r10 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public PooledByteBufAllocator(boolean r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, boolean r20) {
            r11 = this;
            int r10 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public PooledByteBufAllocator(boolean r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, boolean r12, int r13) {
            r3 = this;
            r3.<init>(r4)
            io.netty.buffer.PooledByteBufAllocator$1 r4 = new io.netty.buffer.PooledByteBufAllocator$1
            r4.<init>(r3)
            r3.trimTask = r4
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r4 = new io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache
            r4.<init>(r3, r12)
            r3.threadCache = r4
            r3.tinyCacheSize = r9
            r3.smallCacheSize = r10
            r3.normalCacheSize = r11
            int r4 = validateAndCalculateChunkSize(r7, r8)
            r3.chunkSize = r4
            java.lang.String r4 = "nHeapArena"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r4)
            java.lang.String r4 = "nDirectArena"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r6, r4)
            java.lang.String r4 = "directMemoryCacheAlignment"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r13, r4)
            if (r13 <= 0) goto L3d
            boolean r4 = isDirectMemoryCacheAlignmentSupported()
            if (r4 == 0) goto L35
            goto L3d
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "directMemoryCacheAlignment is not supported"
            r4.<init>(r5)
            throw r4
        L3d:
            int r4 = -r13
            r4 = r4 & r13
            if (r4 != r13) goto Ld6
            int r9 = validateAndCalculatePageShifts(r7)
            r4 = 0
            r0 = 0
            if (r5 <= 0) goto L85
            io.netty.buffer.PoolArena[] r5 = newArenaArray(r5)
            r3.heapArenas = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r5.length
            r1.<init>(r5)
            r5 = 0
        L56:
            io.netty.buffer.PoolArena<byte[]>[] r10 = r3.heapArenas
            int r10 = r10.length
            if (r5 >= r10) goto L78
            r11 = r9
            r9 = r7
            io.netty.buffer.PoolArena$HeapArena r7 = new io.netty.buffer.PoolArena$HeapArena
            int r12 = r3.chunkSize
            r10 = r8
            r8 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r12 = r7
            r7 = r11
            r11 = r13
            io.netty.buffer.PoolArena<byte[]>[] r13 = r8.heapArenas
            r13[r5] = r12
            r1.add(r12)
            int r5 = r5 + 1
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r10
            r13 = r11
            goto L56
        L78:
            r10 = r9
            r9 = r7
            r7 = r10
            r10 = r8
            r11 = r13
            r8 = r3
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r8.heapArenaMetrics = r5
            goto L91
        L85:
            r10 = r9
            r9 = r7
            r7 = r10
            r10 = r8
            r11 = r13
            r8 = r3
            r8.heapArenas = r4
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            r8.heapArenaMetrics = r5
        L91:
            if (r6 <= 0) goto Lc7
            io.netty.buffer.PoolArena[] r4 = newArenaArray(r6)
            r8.directArenas = r4
            java.util.ArrayList r12 = new java.util.ArrayList
            int r4 = r4.length
            r12.<init>(r4)
        L9f:
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r4 = r8.directArenas
            int r4 = r4.length
            if (r0 >= r4) goto Lbf
            io.netty.buffer.PoolArena$DirectArena r5 = new io.netty.buffer.PoolArena$DirectArena
            r6 = r8
            r8 = r10
            int r10 = r6.chunkSize
            r2 = r9
            r9 = r7
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2 = r9
            r9 = r7
            r7 = r2
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r4 = r6.directArenas
            r4[r0] = r5
            r12.add(r5)
            int r0 = r0 + 1
            r10 = r8
            r8 = r6
            goto L9f
        Lbf:
            r6 = r8
            java.util.List r4 = java.util.Collections.unmodifiableList(r12)
            r6.directArenaMetrics = r4
            goto Lce
        Lc7:
            r6 = r8
            r6.directArenas = r4
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            r6.directArenaMetrics = r4
        Lce:
            io.netty.buffer.PooledByteBufAllocatorMetric r4 = new io.netty.buffer.PooledByteBufAllocatorMetric
            r4.<init>(r3)
            r6.metric = r4
            return
        Ld6:
            r6 = r3
            r11 = r13
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "directMemoryCacheAlignment: "
            r5.append(r7)
            r5.append(r11)
            java.lang.String r7 = " (expected: power of two)"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    static /* synthetic */ io.netty.buffer.PoolArena[] access$000(io.netty.buffer.PooledByteBufAllocator r0) {
            io.netty.buffer.PoolArena<byte[]>[] r0 = r0.heapArenas
            return r0
    }

    static /* synthetic */ io.netty.buffer.PoolArena[] access$100(io.netty.buffer.PooledByteBufAllocator r0) {
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r0.directArenas
            return r0
    }

    static /* synthetic */ int access$200(io.netty.buffer.PooledByteBufAllocator r0) {
            int r0 = r0.tinyCacheSize
            return r0
    }

    static /* synthetic */ int access$300(io.netty.buffer.PooledByteBufAllocator r0) {
            int r0 = r0.smallCacheSize
            return r0
    }

    static /* synthetic */ int access$400(io.netty.buffer.PooledByteBufAllocator r0) {
            int r0 = r0.normalCacheSize
            return r0
    }

    static /* synthetic */ int access$500() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_CACHED_BUFFER_CAPACITY
            return r0
    }

    static /* synthetic */ int access$600() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL
            return r0
    }

    static /* synthetic */ long access$700() {
            long r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL_MILLIS
            return r0
    }

    static /* synthetic */ java.lang.Runnable access$800(io.netty.buffer.PooledByteBufAllocator r0) {
            java.lang.Runnable r0 = r0.trimTask
            return r0
    }

    public static int defaultMaxOrder() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_ORDER
            return r0
    }

    public static int defaultNormalCacheSize() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NORMAL_CACHE_SIZE
            return r0
    }

    public static int defaultNumDirectArena() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_DIRECT_ARENA
            return r0
    }

    public static int defaultNumHeapArena() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_NUM_HEAP_ARENA
            return r0
    }

    public static int defaultPageSize() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_PAGE_SIZE
            return r0
    }

    public static boolean defaultPreferDirect() {
            boolean r0 = io.netty.util.internal.PlatformDependent.directBufferPreferred()
            return r0
    }

    public static int defaultSmallCacheSize() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_SMALL_CACHE_SIZE
            return r0
    }

    public static int defaultTinyCacheSize() {
            int r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_TINY_CACHE_SIZE
            return r0
    }

    public static boolean defaultUseCacheForAllThreads() {
            boolean r0 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_USE_CACHE_FOR_ALL_THREADS
            return r0
    }

    public static boolean isDirectMemoryCacheAlignmentSupported() {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            return r0
    }

    private static <T> io.netty.buffer.PoolArena<T>[] newArenaArray(int r0) {
            io.netty.buffer.PoolArena[] r0 = new io.netty.buffer.PoolArena[r0]
            return r0
    }

    private static long usedMemory(io.netty.buffer.PoolArena<?>[] r8) {
            if (r8 != 0) goto L5
            r0 = -1
            return r0
        L5:
            int r0 = r8.length
            r1 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L20
            r6 = r8[r3]
            long r6 = r6.numActiveBytes()
            long r4 = r4 + r6
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L1d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L1d:
            int r3 = r3 + 1
            goto La
        L20:
            return r4
    }

    private static int validateAndCalculateChunkSize(int r4, int r5) {
            r0 = 14
            if (r5 > r0) goto L38
            r1 = r4
            r0 = r5
        L6:
            if (r0 <= 0) goto L37
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 > r2) goto L11
            int r1 = r1 << 1
            int r0 = r0 + (-1)
            goto L6
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 1073741824(0x40000000, float:2.0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r1
            java.lang.String r4 = "pageSize (%d) << maxOrder (%d) must not exceed %d"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        L37:
            return r1
        L38:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxOrder: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " (expected: 0-14)"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    private static int validateAndCalculatePageShifts(int r4) {
            java.lang.String r0 = "pageSize: "
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 < r1) goto L2c
            int r1 = r4 + (-1)
            r1 = r1 & r4
            if (r1 != 0) goto L12
            int r4 = java.lang.Integer.numberOfLeadingZeros(r4)
            int r4 = 31 - r4
            return r4
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " (expected: power of 2)"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " (expected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.<init>(r4)
            throw r2
    }

    @java.lang.Deprecated
    public final int chunkSize() {
            r1 = this;
            int r0 = r1.chunkSize
            return r0
    }

    @java.lang.Deprecated
    public java.util.List<io.netty.buffer.PoolArenaMetric> directArenas() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolArenaMetric> r0 = r1.directArenaMetrics
            return r0
    }

    public java.lang.String dumpStats() {
            r6 = this;
            io.netty.buffer.PoolArena<byte[]>[] r0 = r6.heapArenas
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto L8
        L7:
            int r0 = r0.length
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 512(0x200, float:7.17E-43)
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " heap arena(s):"
            r2.append(r3)
            java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
            r2.append(r3)
            if (r0 <= 0) goto L2c
            io.netty.buffer.PoolArena<byte[]>[] r0 = r6.heapArenas
            int r3 = r0.length
            r4 = 0
        L22:
            if (r4 >= r3) goto L2c
            r5 = r0[r4]
            r2.append(r5)
            int r4 = r4 + 1
            goto L22
        L2c:
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r6.directArenas
            if (r0 != 0) goto L32
            r0 = 0
            goto L33
        L32:
            int r0 = r0.length
        L33:
            r2.append(r0)
            java.lang.String r3 = " direct arena(s):"
            r2.append(r3)
            java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
            r2.append(r3)
            if (r0 <= 0) goto L4f
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r6.directArenas
            int r3 = r0.length
        L45:
            if (r1 >= r3) goto L4f
            r4 = r0[r1]
            r2.append(r4)
            int r1 = r1 + 1
            goto L45
        L4f:
            java.lang.String r0 = r2.toString()
            return r0
    }

    @java.lang.Deprecated
    public void freeThreadLocalCache() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r1.threadCache
            r0.remove()
            return
    }

    @java.lang.Deprecated
    public boolean hasThreadLocalCache() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r1.threadCache
            boolean r0 = r0.isSet()
            return r0
    }

    @java.lang.Deprecated
    public java.util.List<io.netty.buffer.PoolArenaMetric> heapArenas() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolArenaMetric> r0 = r1.heapArenaMetrics
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
            r1 = this;
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r1.directArenas
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocatorMetricProvider
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufAllocatorMetric metric() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocatorMetric r0 = r1.metric()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocatorMetricProvider
    public io.netty.buffer.PooledByteBufAllocatorMetric metric() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocatorMetric r0 = r1.metric
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator
    protected io.netty.buffer.ByteBuf newDirectBuffer(int r3, int r4) {
            r2 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r2.threadCache
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PoolThreadCache r0 = (io.netty.buffer.PoolThreadCache) r0
            io.netty.buffer.PoolArena<java.nio.ByteBuffer> r1 = r0.directArena
            if (r1 == 0) goto L11
            io.netty.buffer.PooledByteBuf r3 = r1.allocate(r0, r3, r4)
            goto L22
        L11:
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L1c
            io.netty.buffer.UnpooledUnsafeDirectByteBuf r3 = io.netty.buffer.UnsafeByteBufUtil.newUnsafeDirectByteBuf(r2, r3, r4)
            goto L22
        L1c:
            io.netty.buffer.UnpooledDirectByteBuf r0 = new io.netty.buffer.UnpooledDirectByteBuf
            r0.<init>(r2, r3, r4)
            r3 = r0
        L22:
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(r3)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBufAllocator
    protected io.netty.buffer.ByteBuf newHeapBuffer(int r3, int r4) {
            r2 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r2.threadCache
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PoolThreadCache r0 = (io.netty.buffer.PoolThreadCache) r0
            io.netty.buffer.PoolArena<byte[]> r1 = r0.heapArena
            if (r1 == 0) goto L11
            io.netty.buffer.PooledByteBuf r3 = r1.allocate(r0, r3, r4)
            goto L24
        L11:
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L1e
            io.netty.buffer.UnpooledUnsafeHeapByteBuf r0 = new io.netty.buffer.UnpooledUnsafeHeapByteBuf
            r0.<init>(r2, r3, r4)
        L1c:
            r3 = r0
            goto L24
        L1e:
            io.netty.buffer.UnpooledHeapByteBuf r0 = new io.netty.buffer.UnpooledHeapByteBuf
            r0.<init>(r2, r3, r4)
            goto L1c
        L24:
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(r3)
            return r3
    }

    @java.lang.Deprecated
    public int normalCacheSize() {
            r1 = this;
            int r0 = r1.normalCacheSize
            return r0
    }

    @java.lang.Deprecated
    public int numDirectArenas() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolArenaMetric> r0 = r1.directArenaMetrics
            int r0 = r0.size()
            return r0
    }

    @java.lang.Deprecated
    public int numHeapArenas() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolArenaMetric> r0 = r1.heapArenaMetrics
            int r0 = r0.size()
            return r0
    }

    @java.lang.Deprecated
    public int numThreadLocalCaches() {
            r5 = this;
            io.netty.buffer.PoolArena<byte[]>[] r0 = r5.heapArenas
            if (r0 == 0) goto L5
            goto L7
        L5:
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r5.directArenas
        L7:
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r2 = r0.length
            r3 = 0
        Ld:
            if (r1 >= r2) goto L1b
            r4 = r0[r1]
            java.util.concurrent.atomic.AtomicInteger r4 = r4.numThreadCaches
            int r4 = r4.get()
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto Ld
        L1b:
            return r3
    }

    @java.lang.Deprecated
    public int smallCacheSize() {
            r1 = this;
            int r0 = r1.smallCacheSize
            return r0
    }

    final io.netty.buffer.PoolThreadCache threadCache() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r1.threadCache
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PoolThreadCache r0 = (io.netty.buffer.PoolThreadCache) r0
            return r0
    }

    @java.lang.Deprecated
    public int tinyCacheSize() {
            r1 = this;
            int r0 = r1.tinyCacheSize
            return r0
    }

    public boolean trimCurrentThreadCache() {
            r1 = this;
            io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache r0 = r1.threadCache
            java.lang.Object r0 = r0.getIfExists()
            io.netty.buffer.PoolThreadCache r0 = (io.netty.buffer.PoolThreadCache) r0
            if (r0 == 0) goto Lf
            r0.trim()
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    final long usedDirectMemory() {
            r2 = this;
            io.netty.buffer.PoolArena<java.nio.ByteBuffer>[] r0 = r2.directArenas
            long r0 = usedMemory(r0)
            return r0
    }

    final long usedHeapMemory() {
            r2 = this;
            io.netty.buffer.PoolArena<byte[]>[] r0 = r2.heapArenas
            long r0 = usedMemory(r0)
            return r0
    }
}
