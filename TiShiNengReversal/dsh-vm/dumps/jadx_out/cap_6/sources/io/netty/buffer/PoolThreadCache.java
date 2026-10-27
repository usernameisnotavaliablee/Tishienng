package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PoolThreadCache {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private int allocations;
    final io.netty.buffer.PoolArena<java.nio.ByteBuffer> directArena;
    private final int freeSweepAllocationThreshold;
    private final java.util.concurrent.atomic.AtomicBoolean freed;
    final io.netty.buffer.PoolArena<byte[]> heapArena;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<java.nio.ByteBuffer>[] normalDirectCaches;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<byte[]>[] normalHeapCaches;
    private final int numShiftsNormalDirect;
    private final int numShiftsNormalHeap;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<java.nio.ByteBuffer>[] smallSubPageDirectCaches;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<byte[]>[] smallSubPageHeapCaches;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<java.nio.ByteBuffer>[] tinySubPageDirectCaches;
    private final io.netty.buffer.PoolThreadCache.MemoryRegionCache<byte[]>[] tinySubPageHeapCaches;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.buffer.PoolThreadCache$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$buffer$PoolArena$SizeClass = null;

        static {
                io.netty.buffer.PoolArena$SizeClass[] r0 = io.netty.buffer.PoolArena.SizeClass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.buffer.PoolThreadCache.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass = r0
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Normal     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.buffer.PoolThreadCache.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Small     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.buffer.PoolThreadCache.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Tiny     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class MemoryRegionCache<T> {
        private static final io.netty.util.Recycler<io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry> RECYCLER = null;
        private int allocations;
        private final java.util.Queue<io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry<T>> queue;
        private final int size;
        private final io.netty.buffer.PoolArena.SizeClass sizeClass;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class Entry<T> {
            io.netty.buffer.PoolChunk<T> chunk;
            long handle;
            java.nio.ByteBuffer nioBuffer;
            final io.netty.util.Recycler.Handle<io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry<?>> recyclerHandle;

            Entry(io.netty.util.Recycler.Handle<io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry<?>> r3) {
                    r2 = this;
                    r2.<init>()
                    r0 = -1
                    r2.handle = r0
                    r2.recyclerHandle = r3
                    return
            }

            void recycle() {
                    r2 = this;
                    r0 = 0
                    r2.chunk = r0
                    r2.nioBuffer = r0
                    r0 = -1
                    r2.handle = r0
                    io.netty.util.Recycler$Handle<io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry<?>> r0 = r2.recyclerHandle
                    r0.recycle(r2)
                    return
            }
        }

        static {
                io.netty.buffer.PoolThreadCache$MemoryRegionCache$1 r0 = new io.netty.buffer.PoolThreadCache$MemoryRegionCache$1
                r0.<init>()
                io.netty.buffer.PoolThreadCache.MemoryRegionCache.RECYCLER = r0
                return
        }

        MemoryRegionCache(int r1, io.netty.buffer.PoolArena.SizeClass r2) {
                r0 = this;
                r0.<init>()
                int r1 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r1)
                r0.size = r1
                java.util.Queue r1 = io.netty.util.internal.PlatformDependent.newFixedMpscQueue(r1)
                r0.queue = r1
                r0.sizeClass = r2
                return
        }

        private int free(int r3, boolean r4) {
                r2 = this;
                r0 = 0
            L1:
                if (r0 >= r3) goto L13
                java.util.Queue<io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry<T>> r1 = r2.queue
                java.lang.Object r1 = r1.poll()
                io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry r1 = (io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry) r1
                if (r1 == 0) goto L13
                r2.freeEntry(r1, r4)
                int r0 = r0 + 1
                goto L1
            L13:
                return r0
        }

        private void freeEntry(io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry r8, boolean r9) {
                r7 = this;
                io.netty.buffer.PoolChunk<T> r1 = r8.chunk
                long r2 = r8.handle
                java.nio.ByteBuffer r5 = r8.nioBuffer
                if (r9 != 0) goto Lb
                r8.recycle()
            Lb:
                io.netty.buffer.PoolArena<T> r0 = r1.arena
                io.netty.buffer.PoolArena$SizeClass r4 = r7.sizeClass
                r6 = r9
                r0.freeChunk(r1, r2, r4, r5, r6)
                return
        }

        private static io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry newEntry(io.netty.buffer.PoolChunk<?> r1, java.nio.ByteBuffer r2, long r3) {
                io.netty.util.Recycler<io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry> r0 = io.netty.buffer.PoolThreadCache.MemoryRegionCache.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry r0 = (io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry) r0
                r0.chunk = r1
                r0.nioBuffer = r2
                r0.handle = r3
                return r0
        }

        public final boolean add(io.netty.buffer.PoolChunk<T> r1, java.nio.ByteBuffer r2, long r3) {
                r0 = this;
                io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry r1 = newEntry(r1, r2, r3)
                java.util.Queue<io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry<T>> r2 = r0.queue
                boolean r2 = r2.offer(r1)
                if (r2 != 0) goto Lf
                r1.recycle()
            Lf:
                return r2
        }

        public final boolean allocate(io.netty.buffer.PooledByteBuf<T> r9, int r10) {
                r8 = this;
                java.util.Queue<io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry<T>> r0 = r8.queue
                java.lang.Object r0 = r0.poll()
                io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry r0 = (io.netty.buffer.PoolThreadCache.MemoryRegionCache.Entry) r0
                if (r0 != 0) goto Lc
                r9 = 0
                return r9
            Lc:
                io.netty.buffer.PoolChunk<T> r2 = r0.chunk
                java.nio.ByteBuffer r3 = r0.nioBuffer
                long r4 = r0.handle
                r1 = r8
                r6 = r9
                r7 = r10
                r1.initBuf(r2, r3, r4, r6, r7)
                r0.recycle()
                int r9 = r1.allocations
                r10 = 1
                int r9 = r9 + r10
                r1.allocations = r9
                return r10
        }

        public final int free(boolean r2) {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r2 = r1.free(r0, r2)
                return r2
        }

        protected abstract void initBuf(io.netty.buffer.PoolChunk<T> r1, java.nio.ByteBuffer r2, long r3, io.netty.buffer.PooledByteBuf<T> r5, int r6);

        public final void trim() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.allocations
                int r0 = r0 - r1
                r1 = 0
                r2.allocations = r1
                if (r0 <= 0) goto Ld
                r2.free(r0, r1)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NormalMemoryRegionCache<T> extends io.netty.buffer.PoolThreadCache.MemoryRegionCache<T> {
        NormalMemoryRegionCache(int r2) {
                r1 = this;
                io.netty.buffer.PoolArena$SizeClass r0 = io.netty.buffer.PoolArena.SizeClass.Normal
                r1.<init>(r2, r0)
                return
        }

        @Override // io.netty.buffer.PoolThreadCache.MemoryRegionCache
        protected void initBuf(io.netty.buffer.PoolChunk<T> r3, java.nio.ByteBuffer r4, long r5, io.netty.buffer.PooledByteBuf<T> r7, int r8) {
                r2 = this;
                r0 = r5
                r5 = r4
                r4 = r7
                r6 = r0
                r3.initBuf(r4, r5, r6, r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SubPageMemoryRegionCache<T> extends io.netty.buffer.PoolThreadCache.MemoryRegionCache<T> {
        SubPageMemoryRegionCache(int r1, io.netty.buffer.PoolArena.SizeClass r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.buffer.PoolThreadCache.MemoryRegionCache
        protected void initBuf(io.netty.buffer.PoolChunk<T> r3, java.nio.ByteBuffer r4, long r5, io.netty.buffer.PooledByteBuf<T> r7, int r8) {
                r2 = this;
                r0 = r5
                r5 = r4
                r4 = r7
                r6 = r0
                r3.initBufWithSubpage(r4, r5, r6, r8)
                return
        }
    }

    static {
            java.lang.Class<io.netty.buffer.PoolThreadCache> r0 = io.netty.buffer.PoolThreadCache.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.buffer.PoolThreadCache.logger = r0
            return
    }

    PoolThreadCache(io.netty.buffer.PoolArena<byte[]> r6, io.netty.buffer.PoolArena<java.nio.ByteBuffer> r7, int r8, int r9, int r10, int r11, int r12) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r5.freed = r0
            java.lang.String r0 = "maxCachedBufferCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r11, r0)
            r5.freeSweepAllocationThreshold = r12
            r5.heapArena = r6
            r5.directArena = r7
            r0 = -1
            r1 = 32
            r2 = 0
            if (r7 == 0) goto L41
            io.netty.buffer.PoolArena$SizeClass r3 = io.netty.buffer.PoolArena.SizeClass.Tiny
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r3 = createSubPageCaches(r8, r1, r3)
            r5.tinySubPageDirectCaches = r3
            int r3 = r7.numSmallSubpagePools
            io.netty.buffer.PoolArena$SizeClass r4 = io.netty.buffer.PoolArena.SizeClass.Small
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r3 = createSubPageCaches(r9, r3, r4)
            r5.smallSubPageDirectCaches = r3
            int r3 = r7.pageSize
            int r3 = log2(r3)
            r5.numShiftsNormalDirect = r3
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r3 = createNormalCaches(r10, r11, r7)
            r5.normalDirectCaches = r3
            java.util.concurrent.atomic.AtomicInteger r7 = r7.numThreadCaches
            r7.getAndIncrement()
            goto L49
        L41:
            r5.tinySubPageDirectCaches = r2
            r5.smallSubPageDirectCaches = r2
            r5.normalDirectCaches = r2
            r5.numShiftsNormalDirect = r0
        L49:
            if (r6 == 0) goto L71
            io.netty.buffer.PoolArena$SizeClass r7 = io.netty.buffer.PoolArena.SizeClass.Tiny
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r7 = createSubPageCaches(r8, r1, r7)
            r5.tinySubPageHeapCaches = r7
            int r7 = r6.numSmallSubpagePools
            io.netty.buffer.PoolArena$SizeClass r8 = io.netty.buffer.PoolArena.SizeClass.Small
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r7 = createSubPageCaches(r9, r7, r8)
            r5.smallSubPageHeapCaches = r7
            int r7 = r6.pageSize
            int r7 = log2(r7)
            r5.numShiftsNormalHeap = r7
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r7 = createNormalCaches(r10, r11, r6)
            r5.normalHeapCaches = r7
            java.util.concurrent.atomic.AtomicInteger r6 = r6.numThreadCaches
            r6.getAndIncrement()
            goto L79
        L71:
            r5.tinySubPageHeapCaches = r2
            r5.smallSubPageHeapCaches = r2
            r5.normalHeapCaches = r2
            r5.numShiftsNormalHeap = r0
        L79:
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r6 = r5.tinySubPageDirectCaches
            if (r6 != 0) goto L91
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r6 = r5.smallSubPageDirectCaches
            if (r6 != 0) goto L91
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r6 = r5.normalDirectCaches
            if (r6 != 0) goto L91
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r6 = r5.tinySubPageHeapCaches
            if (r6 != 0) goto L91
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r6 = r5.smallSubPageHeapCaches
            if (r6 != 0) goto L91
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r6 = r5.normalHeapCaches
            if (r6 == 0) goto L94
        L91:
            r6 = 1
            if (r12 < r6) goto L95
        L94:
            return
        L95:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "freeSweepAllocationThreshold: "
            r7.append(r8)
            r7.append(r12)
            java.lang.String r8 = " (expected: > 0)"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private boolean allocate(io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> r2, io.netty.buffer.PooledByteBuf r3, int r4) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r2 = r2.allocate(r3, r4)
            int r3 = r1.allocations
            int r3 = r3 + 1
            r1.allocations = r3
            int r4 = r1.freeSweepAllocationThreshold
            if (r3 < r4) goto L17
            r1.allocations = r0
            r1.trim()
        L17:
            return r2
    }

    private io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> cache(io.netty.buffer.PoolArena<?> r2, int r3, io.netty.buffer.PoolArena.SizeClass r4) {
            r1 = this;
            int[] r0 = io.netty.buffer.PoolThreadCache.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L21
            r0 = 2
            if (r4 == r0) goto L1c
            r0 = 3
            if (r4 != r0) goto L16
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r2 = r1.cacheForTiny(r2, r3)
            return r2
        L16:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L1c:
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r2 = r1.cacheForSmall(r2, r3)
            return r2
        L21:
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r2 = r1.cacheForNormal(r2, r3)
            return r2
    }

    private static <T> io.netty.buffer.PoolThreadCache.MemoryRegionCache<T> cache(io.netty.buffer.PoolThreadCache.MemoryRegionCache<T>[] r1, int r2) {
            if (r1 == 0) goto Lb
            int r0 = r1.length
            int r0 = r0 + (-1)
            if (r2 <= r0) goto L8
            goto Lb
        L8:
            r1 = r1[r2]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> cacheForNormal(io.netty.buffer.PoolArena<?> r1, int r2) {
            r0 = this;
            boolean r1 = r1.isDirect()
            if (r1 == 0) goto L15
            int r1 = r0.numShiftsNormalDirect
            int r1 = r2 >> r1
            int r1 = log2(r1)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r2 = r0.normalDirectCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r2, r1)
            return r1
        L15:
            int r1 = r0.numShiftsNormalHeap
            int r1 = r2 >> r1
            int r1 = log2(r1)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r2 = r0.normalHeapCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r2, r1)
            return r1
    }

    private io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> cacheForSmall(io.netty.buffer.PoolArena<?> r1, int r2) {
            r0 = this;
            int r2 = io.netty.buffer.PoolArena.smallIdx(r2)
            boolean r1 = r1.isDirect()
            if (r1 == 0) goto L11
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r1 = r0.smallSubPageDirectCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r1, r2)
            return r1
        L11:
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r1 = r0.smallSubPageHeapCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r1, r2)
            return r1
    }

    private io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> cacheForTiny(io.netty.buffer.PoolArena<?> r1, int r2) {
            r0 = this;
            int r2 = io.netty.buffer.PoolArena.tinyIdx(r2)
            boolean r1 = r1.isDirect()
            if (r1 == 0) goto L11
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r1 = r0.tinySubPageDirectCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r1, r2)
            return r1
        L11:
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r1 = r0.tinySubPageHeapCaches
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = cache(r1, r2)
            return r1
    }

    private static <T> io.netty.buffer.PoolThreadCache.MemoryRegionCache<T>[] createNormalCaches(int r2, int r3, io.netty.buffer.PoolArena<T> r4) {
            if (r2 <= 0) goto L27
            if (r3 <= 0) goto L27
            int r0 = r4.chunkSize
            int r3 = java.lang.Math.min(r0, r3)
            int r4 = r4.pageSize
            int r3 = r3 / r4
            int r3 = log2(r3)
            r4 = 1
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r4, r3)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r4 = new io.netty.buffer.PoolThreadCache.MemoryRegionCache[r3]
            r0 = 0
        L1a:
            if (r0 >= r3) goto L26
            io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache r1 = new io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache
            r1.<init>(r2)
            r4[r0] = r1
            int r0 = r0 + 1
            goto L1a
        L26:
            return r4
        L27:
            r2 = 0
            return r2
    }

    private static <T> io.netty.buffer.PoolThreadCache.MemoryRegionCache<T>[] createSubPageCaches(int r3, int r4, io.netty.buffer.PoolArena.SizeClass r5) {
            if (r3 <= 0) goto L14
            if (r4 <= 0) goto L14
            io.netty.buffer.PoolThreadCache$MemoryRegionCache[] r0 = new io.netty.buffer.PoolThreadCache.MemoryRegionCache[r4]
            r1 = 0
        L7:
            if (r1 >= r4) goto L13
            io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache r2 = new io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache
            r2.<init>(r3, r5)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L13:
            return r0
        L14:
            r3 = 0
            return r3
    }

    private static int free(io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> r0, boolean r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.free(r1)
            return r0
    }

    private static int free(io.netty.buffer.PoolThreadCache.MemoryRegionCache<?>[] r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = 0
        L6:
            if (r0 >= r1) goto L12
            r3 = r4[r0]
            int r3 = free(r3, r5)
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L6
        L12:
            return r2
    }

    private static int log2(int r2) {
            r0 = 0
        L1:
            r1 = 1
            if (r2 <= r1) goto L9
            int r2 = r2 >> 1
            int r0 = r0 + 1
            goto L1
        L9:
            return r0
    }

    private static void trim(io.netty.buffer.PoolThreadCache.MemoryRegionCache<?> r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.trim()
            return
    }

    private static void trim(io.netty.buffer.PoolThreadCache.MemoryRegionCache<?>[] r3) {
            if (r3 != 0) goto L3
            goto Lf
        L3:
            int r0 = r3.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r3[r1]
            trim(r2)
            int r1 = r1 + 1
            goto L5
        Lf:
            return
    }

    boolean add(io.netty.buffer.PoolArena<?> r1, io.netty.buffer.PoolChunk r2, java.nio.ByteBuffer r3, long r4, int r6, io.netty.buffer.PoolArena.SizeClass r7) {
            r0 = this;
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = r0.cache(r1, r6, r7)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r1.add(r2, r3, r4)
            return r1
    }

    boolean allocateNormal(io.netty.buffer.PoolArena<?> r1, io.netty.buffer.PooledByteBuf<?> r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = r0.cacheForNormal(r1, r4)
            boolean r1 = r0.allocate(r1, r2, r3)
            return r1
    }

    boolean allocateSmall(io.netty.buffer.PoolArena<?> r1, io.netty.buffer.PooledByteBuf<?> r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = r0.cacheForSmall(r1, r4)
            boolean r1 = r0.allocate(r1, r2, r3)
            return r1
    }

    boolean allocateTiny(io.netty.buffer.PoolArena<?> r1, io.netty.buffer.PooledByteBuf<?> r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.PoolThreadCache$MemoryRegionCache r1 = r0.cacheForTiny(r1, r4)
            boolean r1 = r0.allocate(r1, r2, r3)
            return r1
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            r0 = 1
            super.finalize()     // Catch: java.lang.Throwable -> L8
            r2.free(r0)
            return
        L8:
            r1 = move-exception
            r2.free(r0)
            throw r1
    }

    void free(boolean r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.freed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L60
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r0 = r3.tinySubPageDirectCaches
            int r0 = free(r0, r4)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r1 = r3.smallSubPageDirectCaches
            int r1 = free(r1, r4)
            int r0 = r0 + r1
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r1 = r3.normalDirectCaches
            int r1 = free(r1, r4)
            int r0 = r0 + r1
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r1 = r3.tinySubPageHeapCaches
            int r1 = free(r1, r4)
            int r0 = r0 + r1
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r1 = r3.smallSubPageHeapCaches
            int r1 = free(r1, r4)
            int r0 = r0 + r1
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r1 = r3.normalHeapCaches
            int r4 = free(r1, r4)
            int r0 = r0 + r4
            if (r0 <= 0) goto L4e
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.buffer.PoolThreadCache.logger
            boolean r1 = r4.isDebugEnabled()
            if (r1 == 0) goto L4e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Freed {} thread-local buffer(s) from thread: {}"
            r4.debug(r2, r0, r1)
        L4e:
            io.netty.buffer.PoolArena<java.nio.ByteBuffer> r4 = r3.directArena
            if (r4 == 0) goto L57
            java.util.concurrent.atomic.AtomicInteger r4 = r4.numThreadCaches
            r4.getAndDecrement()
        L57:
            io.netty.buffer.PoolArena<byte[]> r4 = r3.heapArena
            if (r4 == 0) goto L60
            java.util.concurrent.atomic.AtomicInteger r4 = r4.numThreadCaches
            r4.getAndDecrement()
        L60:
            return
    }

    void trim() {
            r1 = this;
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r0 = r1.tinySubPageDirectCaches
            trim(r0)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r0 = r1.smallSubPageDirectCaches
            trim(r0)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<java.nio.ByteBuffer>[] r0 = r1.normalDirectCaches
            trim(r0)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r0 = r1.tinySubPageHeapCaches
            trim(r0)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r0 = r1.smallSubPageHeapCaches
            trim(r0)
            io.netty.buffer.PoolThreadCache$MemoryRegionCache<byte[]>[] r0 = r1.normalHeapCaches
            trim(r0)
            return
    }
}
