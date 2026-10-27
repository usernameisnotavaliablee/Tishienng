package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class PoolArena<T> implements io.netty.buffer.PoolArenaMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final boolean HAS_UNSAFE = false;
    static final int numTinySubpagePools = 32;
    private final io.netty.util.internal.LongCounter activeBytesHuge;
    private final io.netty.util.internal.LongCounter allocationsHuge;
    private long allocationsNormal;
    private final io.netty.util.internal.LongCounter allocationsSmall;
    private final io.netty.util.internal.LongCounter allocationsTiny;
    private final java.util.List<io.netty.buffer.PoolChunkListMetric> chunkListMetrics;
    final int chunkSize;
    private final io.netty.util.internal.LongCounter deallocationsHuge;
    private long deallocationsNormal;
    private long deallocationsSmall;
    private long deallocationsTiny;
    final int directMemoryCacheAlignment;
    final int directMemoryCacheAlignmentMask;
    private final int maxOrder;
    final int numSmallSubpagePools;
    final java.util.concurrent.atomic.AtomicInteger numThreadCaches;
    final int pageShifts;
    final int pageSize;
    final io.netty.buffer.PooledByteBufAllocator parent;
    private final io.netty.buffer.PoolChunkList<T> q000;
    private final io.netty.buffer.PoolChunkList<T> q025;
    private final io.netty.buffer.PoolChunkList<T> q050;
    private final io.netty.buffer.PoolChunkList<T> q075;
    private final io.netty.buffer.PoolChunkList<T> q100;
    private final io.netty.buffer.PoolChunkList<T> qInit;
    private final io.netty.buffer.PoolSubpage<T>[] smallSubpagePools;
    final int subpageOverflowMask;
    private final io.netty.buffer.PoolSubpage<T>[] tinySubpagePools;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.buffer.PoolArena$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$buffer$PoolArena$SizeClass = null;

        static {
                io.netty.buffer.PoolArena$SizeClass[] r0 = io.netty.buffer.PoolArena.SizeClass.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.buffer.PoolArena.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass = r0
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Normal     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.buffer.PoolArena.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.buffer.PoolArena$SizeClass r1 = io.netty.buffer.PoolArena.SizeClass.Small     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.buffer.PoolArena.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass     // Catch: java.lang.NoSuchFieldError -> L28
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
    static final class DirectArena extends io.netty.buffer.PoolArena<java.nio.ByteBuffer> {
        DirectArena(io.netty.buffer.PooledByteBufAllocator r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private static java.nio.ByteBuffer allocateDirect(int r1) {
                boolean r0 = io.netty.util.internal.PlatformDependent.useDirectBufferNoCleaner()
                if (r0 == 0) goto Lb
                java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent.allocateDirectNoCleaner(r1)
                return r1
            Lb:
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
                return r1
        }

        @Override // io.netty.buffer.PoolArena
        protected void destroyChunk(io.netty.buffer.PoolChunk<java.nio.ByteBuffer> r2) {
                r1 = this;
                boolean r0 = io.netty.util.internal.PlatformDependent.useDirectBufferNoCleaner()
                if (r0 == 0) goto Le
                T r2 = r2.memory
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                io.netty.util.internal.PlatformDependent.freeDirectNoCleaner(r2)
                return
            Le:
                T r2 = r2.memory
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                io.netty.util.internal.PlatformDependent.freeDirectBuffer(r2)
                return
        }

        @Override // io.netty.buffer.PoolArena
        boolean isDirect() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.netty.buffer.PoolArena
        protected /* bridge */ /* synthetic */ void memoryCopy(java.nio.ByteBuffer r1, int r2, java.nio.ByteBuffer r3, int r4, int r5) {
                r0 = this;
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
                r0.memoryCopy2(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: memoryCopy, reason: avoid collision after fix types in other method */
        protected void memoryCopy2(java.nio.ByteBuffer r9, int r10, java.nio.ByteBuffer r11, int r12, int r13) {
                r8 = this;
                if (r13 != 0) goto L3
                return
            L3:
                boolean r0 = io.netty.buffer.PoolArena.HAS_UNSAFE
                if (r0 == 0) goto L1a
                long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r9)
                long r9 = (long) r10
                long r2 = r0 + r9
                long r9 = io.netty.util.internal.PlatformDependent.directBufferAddress(r11)
                long r11 = (long) r12
                long r4 = r9 + r11
                long r6 = (long) r13
                io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r6)
                return
            L1a:
                java.nio.ByteBuffer r9 = r9.duplicate()
                java.nio.ByteBuffer r11 = r11.duplicate()
                java.nio.Buffer r0 = r9.position(r10)
                int r10 = r10 + r13
                r0.limit(r10)
                r11.position(r12)
                r11.put(r9)
                return
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PooledByteBuf<java.nio.ByteBuffer> newByteBuf(int r2) {
                r1 = this;
                boolean r0 = io.netty.buffer.PoolArena.HAS_UNSAFE
                if (r0 == 0) goto L9
                io.netty.buffer.PooledUnsafeDirectByteBuf r2 = io.netty.buffer.PooledUnsafeDirectByteBuf.newInstance(r2)
                return r2
            L9:
                io.netty.buffer.PooledDirectByteBuf r2 = io.netty.buffer.PooledDirectByteBuf.newInstance(r2)
                return r2
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PoolChunk<java.nio.ByteBuffer> newChunk(int r9, int r10, int r11, int r12) {
                r8 = this;
                int r0 = r8.directMemoryCacheAlignment
                if (r0 != 0) goto L14
                io.netty.buffer.PoolChunk r0 = new io.netty.buffer.PoolChunk
                java.nio.ByteBuffer r2 = allocateDirect(r12)
                r7 = 0
                r1 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L14:
                int r0 = r0 + r12
                java.nio.ByteBuffer r2 = allocateDirect(r0)
                io.netty.buffer.PoolChunk r0 = new io.netty.buffer.PoolChunk
                int r7 = r8.offsetCacheLine(r2)
                r1 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PoolChunk<java.nio.ByteBuffer> newUnpooledChunk(int r4) {
                r3 = this;
                int r0 = r3.directMemoryCacheAlignment
                if (r0 != 0) goto Lf
                io.netty.buffer.PoolChunk r0 = new io.netty.buffer.PoolChunk
                java.nio.ByteBuffer r1 = allocateDirect(r4)
                r2 = 0
                r0.<init>(r3, r1, r4, r2)
                return r0
            Lf:
                int r0 = r0 + r4
                java.nio.ByteBuffer r0 = allocateDirect(r0)
                io.netty.buffer.PoolChunk r1 = new io.netty.buffer.PoolChunk
                int r2 = r3.offsetCacheLine(r0)
                r1.<init>(r3, r0, r4, r2)
                return r1
        }

        int offsetCacheLine(java.nio.ByteBuffer r5) {
                r4 = this;
                boolean r0 = io.netty.buffer.PoolArena.HAS_UNSAFE
                if (r0 == 0) goto Le
                long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r5)
                int r5 = r4.directMemoryCacheAlignmentMask
                long r2 = (long) r5
                long r0 = r0 & r2
                int r5 = (int) r0
                goto Lf
            Le:
                r5 = 0
            Lf:
                int r0 = r4.directMemoryCacheAlignment
                int r0 = r0 - r5
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class HeapArena extends io.netty.buffer.PoolArena<byte[]> {
        HeapArena(io.netty.buffer.PooledByteBufAllocator r1, int r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        private static byte[] newByteArray(int r0) {
                byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r0)
                return r0
        }

        @Override // io.netty.buffer.PoolArena
        protected void destroyChunk(io.netty.buffer.PoolChunk<byte[]> r1) {
                r0 = this;
                return
        }

        @Override // io.netty.buffer.PoolArena
        boolean isDirect() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.buffer.PoolArena
        protected /* bridge */ /* synthetic */ void memoryCopy(byte[] r1, int r2, byte[] r3, int r4, int r5) {
                r0 = this;
                byte[] r1 = (byte[]) r1
                byte[] r3 = (byte[]) r3
                r0.memoryCopy2(r1, r2, r3, r4, r5)
                return
        }

        /* renamed from: memoryCopy, reason: avoid collision after fix types in other method */
        protected void memoryCopy2(byte[] r1, int r2, byte[] r3, int r4, int r5) {
                r0 = this;
                if (r5 != 0) goto L3
                return
            L3:
                java.lang.System.arraycopy(r1, r2, r3, r4, r5)
                return
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PooledByteBuf<byte[]> newByteBuf(int r2) {
                r1 = this;
                boolean r0 = io.netty.buffer.PoolArena.HAS_UNSAFE
                if (r0 == 0) goto L9
                io.netty.buffer.PooledUnsafeHeapByteBuf r2 = io.netty.buffer.PooledUnsafeHeapByteBuf.newUnsafeInstance(r2)
                return r2
            L9:
                io.netty.buffer.PooledHeapByteBuf r2 = io.netty.buffer.PooledHeapByteBuf.newInstance(r2)
                return r2
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PoolChunk<byte[]> newChunk(int r9, int r10, int r11, int r12) {
                r8 = this;
                io.netty.buffer.PoolChunk r0 = new io.netty.buffer.PoolChunk
                byte[] r2 = newByteArray(r12)
                r7 = 0
                r1 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // io.netty.buffer.PoolArena
        protected io.netty.buffer.PoolChunk<byte[]> newUnpooledChunk(int r4) {
                r3 = this;
                io.netty.buffer.PoolChunk r0 = new io.netty.buffer.PoolChunk
                byte[] r1 = newByteArray(r4)
                r2 = 0
                r0.<init>(r3, r1, r4, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum SizeClass extends java.lang.Enum<io.netty.buffer.PoolArena.SizeClass> {
        private static final /* synthetic */ io.netty.buffer.PoolArena.SizeClass[] $VALUES = null;
        public static final io.netty.buffer.PoolArena.SizeClass Normal = null;
        public static final io.netty.buffer.PoolArena.SizeClass Small = null;
        public static final io.netty.buffer.PoolArena.SizeClass Tiny = null;

        static {
                io.netty.buffer.PoolArena$SizeClass r0 = new io.netty.buffer.PoolArena$SizeClass
                java.lang.String r1 = "Tiny"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.buffer.PoolArena.SizeClass.Tiny = r0
                io.netty.buffer.PoolArena$SizeClass r1 = new io.netty.buffer.PoolArena$SizeClass
                java.lang.String r3 = "Small"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.buffer.PoolArena.SizeClass.Small = r1
                io.netty.buffer.PoolArena$SizeClass r3 = new io.netty.buffer.PoolArena$SizeClass
                java.lang.String r5 = "Normal"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.buffer.PoolArena.SizeClass.Normal = r3
                r5 = 3
                io.netty.buffer.PoolArena$SizeClass[] r5 = new io.netty.buffer.PoolArena.SizeClass[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.buffer.PoolArena.SizeClass.$VALUES = r5
                return
        }

        SizeClass(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.buffer.PoolArena.SizeClass valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.buffer.PoolArena$SizeClass> r0 = io.netty.buffer.PoolArena.SizeClass.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.buffer.PoolArena$SizeClass r1 = (io.netty.buffer.PoolArena.SizeClass) r1
                return r1
        }

        public static io.netty.buffer.PoolArena.SizeClass[] values() {
                io.netty.buffer.PoolArena$SizeClass[] r0 = io.netty.buffer.PoolArena.SizeClass.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.buffer.PoolArena$SizeClass[] r0 = (io.netty.buffer.PoolArena.SizeClass[]) r0
                return r0
        }
    }

    static {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            io.netty.buffer.PoolArena.HAS_UNSAFE = r0
            return
    }

    protected PoolArena(io.netty.buffer.PooledByteBufAllocator r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            r7.<init>()
            io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
            r7.allocationsTiny = r0
            io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
            r7.allocationsSmall = r0
            io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
            r7.allocationsHuge = r0
            io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
            r7.activeBytesHuge = r0
            io.netty.util.internal.LongCounter r0 = io.netty.util.internal.PlatformDependent.newLongCounter()
            r7.deallocationsHuge = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r7.numThreadCaches = r0
            r7.parent = r8
            r7.pageSize = r9
            r7.maxOrder = r10
            r7.pageShifts = r11
            r7.chunkSize = r12
            r7.directMemoryCacheAlignment = r13
            int r13 = r13 + (-1)
            r7.directMemoryCacheAlignmentMask = r13
            int r8 = r9 + (-1)
            int r8 = ~r8
            r7.subpageOverflowMask = r8
            r8 = 32
            io.netty.buffer.PoolSubpage[] r8 = r7.newSubpagePoolArray(r8)
            r7.tinySubpagePools = r8
            r8 = 0
            r10 = 0
        L47:
            io.netty.buffer.PoolSubpage<T>[] r13 = r7.tinySubpagePools
            int r0 = r13.length
            if (r10 >= r0) goto L55
            io.netty.buffer.PoolSubpage r0 = r7.newSubpagePoolHead(r9)
            r13[r10] = r0
            int r10 = r10 + 1
            goto L47
        L55:
            int r11 = r11 + (-9)
            r7.numSmallSubpagePools = r11
            io.netty.buffer.PoolSubpage[] r10 = r7.newSubpagePoolArray(r11)
            r7.smallSubpagePools = r10
        L5f:
            io.netty.buffer.PoolSubpage<T>[] r10 = r7.smallSubpagePools
            int r11 = r10.length
            if (r8 >= r11) goto L6d
            io.netty.buffer.PoolSubpage r11 = r7.newSubpagePoolHead(r9)
            r10[r8] = r11
            int r8 = r8 + 1
            goto L5f
        L6d:
            io.netty.buffer.PoolChunkList r0 = new io.netty.buffer.PoolChunkList
            r3 = 100
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r1 = r7
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r1
            r13 = r5
            r9.q100 = r0
            io.netty.buffer.PoolChunkList r10 = new io.netty.buffer.PoolChunkList
            r3 = 75
            r4 = 100
            r2 = r0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r2
            r9.q075 = r10
            io.netty.buffer.PoolChunkList r8 = new io.netty.buffer.PoolChunkList
            r11 = 50
            r12 = 100
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = r10
            r9.q050 = r8
            io.netty.buffer.PoolChunkList r10 = new io.netty.buffer.PoolChunkList
            r11 = 25
            r12 = 75
            r6 = r10
            r10 = r8
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r2 = r10
            r9.q025 = r8
            io.netty.buffer.PoolChunkList r10 = new io.netty.buffer.PoolChunkList
            r11 = 1
            r12 = 50
            r6 = r10
            r10 = r8
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r3 = r10
            r9.q000 = r8
            r10 = r8
            io.netty.buffer.PoolChunkList r8 = new io.netty.buffer.PoolChunkList
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 25
            r8.<init>(r9, r10, r11, r12, r13)
            r6 = r10
            r10 = r8
            r8 = r6
            r9.qInit = r10
            r0.prevList(r1)
            r1.prevList(r2)
            r2.prevList(r3)
            r3.prevList(r8)
            r11 = 0
            r8.prevList(r11)
            r10.prevList(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 6
            r11.<init>(r12)
            r11.add(r10)
            r11.add(r8)
            r11.add(r3)
            r11.add(r2)
            r11.add(r1)
            r11.add(r0)
            java.util.List r8 = java.util.Collections.unmodifiableList(r11)
            r9.chunkListMetrics = r8
            return
    }

    private void allocate(io.netty.buffer.PoolThreadCache r10, io.netty.buffer.PooledByteBuf<T> r11, int r12) {
            r9 = this;
            int r0 = r9.normalizeCapacity(r12)
            boolean r1 = r9.isTinyOrSmall(r0)
            if (r1 == 0) goto L58
            boolean r1 = isTiny(r0)
            if (r1 == 0) goto L1e
            boolean r10 = r10.allocateTiny(r9, r11, r12, r0)
            if (r10 == 0) goto L17
            goto L64
        L17:
            int r10 = tinyIdx(r0)
            io.netty.buffer.PoolSubpage<T>[] r2 = r9.tinySubpagePools
            goto L2b
        L1e:
            boolean r10 = r10.allocateSmall(r9, r11, r12, r0)
            if (r10 == 0) goto L25
            goto L64
        L25:
            int r10 = smallIdx(r0)
            io.netty.buffer.PoolSubpage<T>[] r2 = r9.smallSubpagePools
        L2b:
            r2 = r2[r10]
            monitor-enter(r2)
            io.netty.buffer.PoolSubpage<T> r10 = r2.next     // Catch: java.lang.Throwable -> L43
            if (r10 == r2) goto L46
            long r6 = r10.allocate()     // Catch: java.lang.Throwable -> L43
            io.netty.buffer.PoolChunk<T> r3 = r10.chunk     // Catch: java.lang.Throwable -> L43
            r5 = 0
            r4 = r11
            r8 = r12
            r3.initBufWithSubpage(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L43
            r9.incTinySmallAllocation(r1)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r10 = r0
            goto L56
        L46:
            r4 = r11
            r8 = r12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            monitor-enter(r9)
            r9.allocateNormal(r4, r8, r0)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            r9.incTinySmallAllocation(r1)
            return
        L52:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            throw r10
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            throw r10
        L58:
            r4 = r11
            r8 = r12
            int r11 = r9.chunkSize
            if (r0 > r11) goto L76
            boolean r10 = r10.allocateNormal(r9, r4, r8, r0)
            if (r10 == 0) goto L65
        L64:
            return
        L65:
            monitor-enter(r9)
            r9.allocateNormal(r4, r8, r0)     // Catch: java.lang.Throwable -> L72
            long r10 = r9.allocationsNormal     // Catch: java.lang.Throwable -> L72
            r0 = 1
            long r10 = r10 + r0
            r9.allocationsNormal = r10     // Catch: java.lang.Throwable -> L72
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L72
            throw r10
        L76:
            r9.allocateHuge(r4, r8)
            return
    }

    private void allocateHuge(io.netty.buffer.PooledByteBuf<T> r5, int r6) {
            r4 = this;
            io.netty.buffer.PoolChunk r0 = r4.newUnpooledChunk(r6)
            io.netty.util.internal.LongCounter r1 = r4.activeBytesHuge
            int r2 = r0.chunkSize()
            long r2 = (long) r2
            r1.add(r2)
            r5.initUnpooled(r0, r6)
            io.netty.util.internal.LongCounter r5 = r4.allocationsHuge
            r5.increment()
            return
    }

    private void allocateNormal(io.netty.buffer.PooledByteBuf<T> r5, int r6, int r7) {
            r4 = this;
            io.netty.buffer.PoolChunkList<T> r0 = r4.q050
            boolean r0 = r0.allocate(r5, r6, r7)
            if (r0 != 0) goto L3d
            io.netty.buffer.PoolChunkList<T> r0 = r4.q025
            boolean r0 = r0.allocate(r5, r6, r7)
            if (r0 != 0) goto L3d
            io.netty.buffer.PoolChunkList<T> r0 = r4.q000
            boolean r0 = r0.allocate(r5, r6, r7)
            if (r0 != 0) goto L3d
            io.netty.buffer.PoolChunkList<T> r0 = r4.qInit
            boolean r0 = r0.allocate(r5, r6, r7)
            if (r0 != 0) goto L3d
            io.netty.buffer.PoolChunkList<T> r0 = r4.q075
            boolean r0 = r0.allocate(r5, r6, r7)
            if (r0 == 0) goto L29
            goto L3d
        L29:
            int r0 = r4.pageSize
            int r1 = r4.maxOrder
            int r2 = r4.pageShifts
            int r3 = r4.chunkSize
            io.netty.buffer.PoolChunk r0 = r4.newChunk(r0, r1, r2, r3)
            r0.allocate(r5, r6, r7)
            io.netty.buffer.PoolChunkList<T> r5 = r4.qInit
            r5.add(r0)
        L3d:
            return
    }

    private static void appendPoolSubPages(java.lang.StringBuilder r3, io.netty.buffer.PoolSubpage<?>[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L24
            r1 = r4[r0]
            io.netty.buffer.PoolSubpage<T> r2 = r1.next
            if (r2 != r1) goto Lb
            goto L21
        Lb:
            java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = ": "
            r3.append(r2)
            io.netty.buffer.PoolSubpage<T> r2 = r1.next
        L1a:
            r3.append(r2)
            io.netty.buffer.PoolSubpage<T> r2 = r2.next
            if (r2 != r1) goto L1a
        L21:
            int r0 = r0 + 1
            goto L1
        L24:
            return
    }

    private void destroyPoolChunkLists(io.netty.buffer.PoolChunkList<T>... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r2.destroy(r3)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    private static void destroyPoolSubPages(io.netty.buffer.PoolSubpage<?>[] r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            r2.destroy()
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    private void incTinySmallAllocation(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            io.netty.util.internal.LongCounter r1 = r0.allocationsTiny
            r1.increment()
            return
        L8:
            io.netty.util.internal.LongCounter r1 = r0.allocationsSmall
            r1.increment()
            return
    }

    static boolean isTiny(int r0) {
            r0 = r0 & (-512(0xfffffffffffffe00, float:NaN))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private io.netty.buffer.PoolSubpage<T>[] newSubpagePoolArray(int r1) {
            r0 = this;
            io.netty.buffer.PoolSubpage[] r1 = new io.netty.buffer.PoolSubpage[r1]
            return r1
    }

    private io.netty.buffer.PoolSubpage<T> newSubpagePoolHead(int r2) {
            r1 = this;
            io.netty.buffer.PoolSubpage r0 = new io.netty.buffer.PoolSubpage
            r0.<init>(r2)
            r0.prev = r0
            r0.next = r0
            return r0
    }

    private io.netty.buffer.PoolArena.SizeClass sizeClass(int r2) {
            r1 = this;
            boolean r0 = r1.isTinyOrSmall(r2)
            if (r0 != 0) goto L9
            io.netty.buffer.PoolArena$SizeClass r2 = io.netty.buffer.PoolArena.SizeClass.Normal
            return r2
        L9:
            boolean r2 = isTiny(r2)
            if (r2 == 0) goto L12
            io.netty.buffer.PoolArena$SizeClass r2 = io.netty.buffer.PoolArena.SizeClass.Tiny
            return r2
        L12:
            io.netty.buffer.PoolArena$SizeClass r2 = io.netty.buffer.PoolArena.SizeClass.Small
            return r2
    }

    static int smallIdx(int r1) {
            int r1 = r1 >>> 10
            r0 = 0
        L3:
            if (r1 == 0) goto La
            int r1 = r1 >>> 1
            int r0 = r0 + 1
            goto L3
        La:
            return r0
    }

    private static java.util.List<io.netty.buffer.PoolSubpageMetric> subPageMetricList(io.netty.buffer.PoolSubpage<?>[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            io.netty.buffer.PoolSubpage<T> r4 = r3.next
            if (r4 != r3) goto L10
            goto L17
        L10:
            r0.add(r4)
            io.netty.buffer.PoolSubpage<T> r4 = r4.next
            if (r4 != r3) goto L10
        L17:
            int r2 = r2 + 1
            goto L7
        L1a:
            return r0
    }

    static int tinyIdx(int r0) {
            int r0 = r0 >>> 4
            return r0
    }

    int alignCapacity(int r3) {
            r2 = this;
            int r0 = r2.directMemoryCacheAlignmentMask
            r0 = r0 & r3
            if (r0 != 0) goto L6
            return r3
        L6:
            int r1 = r2.directMemoryCacheAlignment
            int r3 = r3 + r1
            int r3 = r3 - r0
            return r3
    }

    io.netty.buffer.PooledByteBuf<T> allocate(io.netty.buffer.PoolThreadCache r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.PooledByteBuf r3 = r0.newByteBuf(r3)
            r0.allocate(r1, r3, r2)
            return r3
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public java.util.List<io.netty.buffer.PoolChunkListMetric> chunkLists() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolChunkListMetric> r0 = r1.chunkListMetrics
            return r0
    }

    protected abstract void destroyChunk(io.netty.buffer.PoolChunk<T> r1);

    protected final void finalize() throws java.lang.Throwable {
            r14 = this;
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 6
            super.finalize()     // Catch: java.lang.Throwable -> L32
            io.netty.buffer.PoolSubpage<T>[] r7 = r14.smallSubpagePools
            destroyPoolSubPages(r7)
            io.netty.buffer.PoolSubpage<T>[] r7 = r14.tinySubpagePools
            destroyPoolSubPages(r7)
            io.netty.buffer.PoolChunkList<T> r7 = r14.qInit
            io.netty.buffer.PoolChunkList<T> r8 = r14.q000
            io.netty.buffer.PoolChunkList<T> r9 = r14.q025
            io.netty.buffer.PoolChunkList<T> r10 = r14.q050
            io.netty.buffer.PoolChunkList<T> r11 = r14.q075
            io.netty.buffer.PoolChunkList<T> r12 = r14.q100
            io.netty.buffer.PoolChunkList[] r6 = new io.netty.buffer.PoolChunkList[r6]
            r6[r5] = r7
            r6[r4] = r8
            r6[r3] = r9
            r6[r2] = r10
            r6[r1] = r11
            r6[r0] = r12
            r14.destroyPoolChunkLists(r6)
            return
        L32:
            r7 = move-exception
            io.netty.buffer.PoolSubpage<T>[] r8 = r14.smallSubpagePools
            destroyPoolSubPages(r8)
            io.netty.buffer.PoolSubpage<T>[] r8 = r14.tinySubpagePools
            destroyPoolSubPages(r8)
            io.netty.buffer.PoolChunkList<T> r8 = r14.qInit
            io.netty.buffer.PoolChunkList<T> r9 = r14.q000
            io.netty.buffer.PoolChunkList<T> r10 = r14.q025
            io.netty.buffer.PoolChunkList<T> r11 = r14.q050
            io.netty.buffer.PoolChunkList<T> r12 = r14.q075
            io.netty.buffer.PoolChunkList<T> r13 = r14.q100
            io.netty.buffer.PoolChunkList[] r6 = new io.netty.buffer.PoolChunkList[r6]
            r6[r5] = r8
            r6[r4] = r9
            r6[r3] = r10
            r6[r2] = r11
            r6[r1] = r12
            r6[r0] = r13
            r14.destroyPoolChunkLists(r6)
            throw r7
    }

    io.netty.buffer.PoolSubpage<T> findSubpagePoolHead(int r3) {
            r2 = this;
            boolean r0 = isTiny(r3)
            if (r0 == 0) goto Lb
            int r3 = r3 >>> 4
            io.netty.buffer.PoolSubpage<T>[] r0 = r2.tinySubpagePools
            goto L1a
        Lb:
            int r3 = r3 >>> 10
            r0 = 0
        Le:
            if (r3 == 0) goto L15
            int r3 = r3 >>> 1
            int r0 = r0 + 1
            goto Le
        L15:
            io.netty.buffer.PoolSubpage<T>[] r3 = r2.smallSubpagePools
            r1 = r0
            r0 = r3
            r3 = r1
        L1a:
            r3 = r0[r3]
            return r3
    }

    void free(io.netty.buffer.PoolChunk<T> r9, java.nio.ByteBuffer r10, long r11, int r13, io.netty.buffer.PoolThreadCache r14) {
            r8 = this;
            boolean r0 = r9.unpooled
            if (r0 == 0) goto L18
            int r10 = r9.chunkSize()
            r8.destroyChunk(r9)
            io.netty.util.internal.LongCounter r9 = r8.activeBytesHuge
            int r10 = -r10
            long r10 = (long) r10
            r9.add(r10)
            io.netty.util.internal.LongCounter r9 = r8.deallocationsHuge
            r9.increment()
            return
        L18:
            io.netty.buffer.PoolArena$SizeClass r4 = r8.sizeClass(r13)
            if (r14 == 0) goto L2d
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            r0 = r14
            r7 = r4
            r4 = r11
            boolean r13 = r0.add(r1, r2, r3, r4, r6, r7)
            r4 = r7
            if (r13 == 0) goto L2d
            return
        L2d:
            r6 = 0
            r0 = r8
            r1 = r9
            r5 = r10
            r2 = r11
            r0.freeChunk(r1, r2, r4, r5, r6)
            return
    }

    void freeChunk(io.netty.buffer.PoolChunk<T> r5, long r6, io.netty.buffer.PoolArena.SizeClass r8, java.nio.ByteBuffer r9, boolean r10) {
            r4 = this;
            monitor-enter(r4)
            if (r10 != 0) goto L2f
            int[] r10 = io.netty.buffer.PoolArena.AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass     // Catch: java.lang.Throwable -> L1c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L1c
            r8 = r10[r8]     // Catch: java.lang.Throwable -> L1c
            r10 = 1
            r0 = 1
            if (r8 == r10) goto L2a
            r10 = 2
            if (r8 == r10) goto L24
            r10 = 3
            if (r8 != r10) goto L1e
            long r2 = r4.deallocationsTiny     // Catch: java.lang.Throwable -> L1c
            long r2 = r2 + r0
            r4.deallocationsTiny = r2     // Catch: java.lang.Throwable -> L1c
            goto L2f
        L1c:
            r5 = move-exception
            goto L3c
        L1e:
            java.lang.Error r5 = new java.lang.Error     // Catch: java.lang.Throwable -> L1c
            r5.<init>()     // Catch: java.lang.Throwable -> L1c
            throw r5     // Catch: java.lang.Throwable -> L1c
        L24:
            long r2 = r4.deallocationsSmall     // Catch: java.lang.Throwable -> L1c
            long r2 = r2 + r0
            r4.deallocationsSmall = r2     // Catch: java.lang.Throwable -> L1c
            goto L2f
        L2a:
            long r2 = r4.deallocationsNormal     // Catch: java.lang.Throwable -> L1c
            long r2 = r2 + r0
            r4.deallocationsNormal = r2     // Catch: java.lang.Throwable -> L1c
        L2f:
            io.netty.buffer.PoolChunkList<T> r8 = r5.parent     // Catch: java.lang.Throwable -> L1c
            boolean r6 = r8.free(r5, r6, r9)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            if (r6 != 0) goto L3b
            r4.destroyChunk(r5)
        L3b:
            return
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }

    abstract boolean isDirect();

    boolean isTinyOrSmall(int r2) {
            r1 = this;
            int r0 = r1.subpageOverflowMask
            r2 = r2 & r0
            if (r2 != 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    protected abstract void memoryCopy(T r1, int r2, T r3, int r4, int r5);

    protected abstract io.netty.buffer.PooledByteBuf<T> newByteBuf(int r1);

    protected abstract io.netty.buffer.PoolChunk<T> newChunk(int r1, int r2, int r3, int r4);

    protected abstract io.netty.buffer.PoolChunk<T> newUnpooledChunk(int r1);

    int normalizeCapacity(int r2) {
            r1 = this;
            java.lang.String r0 = "reqCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            int r0 = r1.chunkSize
            if (r2 < r0) goto L13
            int r0 = r1.directMemoryCacheAlignment
            if (r0 != 0) goto Le
            goto L3e
        Le:
            int r2 = r1.alignCapacity(r2)
            return r2
        L13:
            boolean r0 = isTiny(r2)
            if (r0 != 0) goto L31
            int r2 = r2 + (-1)
            int r0 = r2 >>> 1
            r2 = r2 | r0
            int r0 = r2 >>> 2
            r2 = r2 | r0
            int r0 = r2 >>> 4
            r2 = r2 | r0
            int r0 = r2 >>> 8
            r2 = r2 | r0
            int r0 = r2 >>> 16
            r2 = r2 | r0
            int r2 = r2 + 1
            if (r2 >= 0) goto L30
            int r2 = r2 >>> 1
        L30:
            return r2
        L31:
            int r0 = r1.directMemoryCacheAlignment
            if (r0 <= 0) goto L3a
            int r2 = r1.alignCapacity(r2)
            return r2
        L3a:
            r0 = r2 & 15
            if (r0 != 0) goto L3f
        L3e:
            return r2
        L3f:
            r2 = r2 & (-16)
            int r2 = r2 + 16
            return r2
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveAllocations() {
            r8 = this;
            io.netty.util.internal.LongCounter r0 = r8.allocationsTiny
            long r0 = r0.value()
            io.netty.util.internal.LongCounter r2 = r8.allocationsSmall
            long r2 = r2.value()
            long r0 = r0 + r2
            io.netty.util.internal.LongCounter r2 = r8.allocationsHuge
            long r2 = r2.value()
            long r0 = r0 + r2
            io.netty.util.internal.LongCounter r2 = r8.deallocationsHuge
            long r2 = r2.value()
            long r0 = r0 - r2
            monitor-enter(r8)
            long r2 = r8.allocationsNormal     // Catch: java.lang.Throwable -> L30
            long r4 = r8.deallocationsTiny     // Catch: java.lang.Throwable -> L30
            long r6 = r8.deallocationsSmall     // Catch: java.lang.Throwable -> L30
            long r4 = r4 + r6
            long r6 = r8.deallocationsNormal     // Catch: java.lang.Throwable -> L30
            long r4 = r4 + r6
            long r2 = r2 - r4
            long r0 = r0 + r2
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L30
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            return r0
        L30:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveBytes() {
            r6 = this;
            io.netty.util.internal.LongCounter r0 = r6.activeBytesHuge
            long r0 = r0.value()
            monitor-enter(r6)
            r2 = 0
        L8:
            java.util.List<io.netty.buffer.PoolChunkListMetric> r3 = r6.chunkListMetrics     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2f
            if (r2 >= r3) goto L34
            java.util.List<io.netty.buffer.PoolChunkListMetric> r3 = r6.chunkListMetrics     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L2f
            io.netty.buffer.PoolChunkListMetric r3 = (io.netty.buffer.PoolChunkListMetric) r3     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2f
        L1c:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2f
            io.netty.buffer.PoolChunkMetric r4 = (io.netty.buffer.PoolChunkMetric) r4     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.chunkSize()     // Catch: java.lang.Throwable -> L2f
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L2f
            long r0 = r0 + r4
            goto L1c
        L2f:
            r0 = move-exception
            goto L3c
        L31:
            int r2 = r2 + 1
            goto L8
        L34:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
        L3c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveHugeAllocations() {
            r4 = this;
            long r0 = r4.numHugeAllocations()
            long r2 = r4.numHugeDeallocations()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveNormalAllocations() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.allocationsNormal     // Catch: java.lang.Throwable -> Le
            long r2 = r4.deallocationsNormal     // Catch: java.lang.Throwable -> Le
            long r0 = r0 - r2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveSmallAllocations() {
            r4 = this;
            long r0 = r4.numSmallAllocations()
            long r2 = r4.numSmallDeallocations()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveTinyAllocations() {
            r4 = this;
            long r0 = r4.numTinyAllocations()
            long r2 = r4.numTinyDeallocations()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numAllocations() {
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.allocationsNormal     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a
            io.netty.util.internal.LongCounter r2 = r6.allocationsTiny
            long r2 = r2.value()
            io.netty.util.internal.LongCounter r4 = r6.allocationsSmall
            long r4 = r4.value()
            long r2 = r2 + r4
            long r2 = r2 + r0
            io.netty.util.internal.LongCounter r0 = r6.allocationsHuge
            long r0 = r0.value()
            long r2 = r2 + r0
            return r2
        L1a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numChunkLists() {
            r1 = this;
            java.util.List<io.netty.buffer.PoolChunkListMetric> r0 = r1.chunkListMetrics
            int r0 = r0.size()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numDeallocations() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.deallocationsTiny     // Catch: java.lang.Throwable -> L12
            long r2 = r4.deallocationsSmall     // Catch: java.lang.Throwable -> L12
            long r0 = r0 + r2
            long r2 = r4.deallocationsNormal     // Catch: java.lang.Throwable -> L12
            long r0 = r0 + r2
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            io.netty.util.internal.LongCounter r2 = r4.deallocationsHuge
            long r2 = r2.value()
            long r0 = r0 + r2
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeAllocations() {
            r2 = this;
            io.netty.util.internal.LongCounter r0 = r2.allocationsHuge
            long r0 = r0.value()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeDeallocations() {
            r2 = this;
            io.netty.util.internal.LongCounter r0 = r2.deallocationsHuge
            long r0 = r0.value()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalAllocations() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.allocationsNormal     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalDeallocations() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.deallocationsNormal     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numSmallAllocations() {
            r2 = this;
            io.netty.util.internal.LongCounter r0 = r2.allocationsSmall
            long r0 = r0.value()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numSmallDeallocations() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.deallocationsSmall     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numSmallSubpages() {
            r1 = this;
            io.netty.buffer.PoolSubpage<T>[] r0 = r1.smallSubpagePools
            int r0 = r0.length
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numThreadCaches() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.numThreadCaches
            int r0 = r0.get()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numTinyAllocations() {
            r2 = this;
            io.netty.util.internal.LongCounter r0 = r2.allocationsTiny
            long r0 = r0.value()
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numTinyDeallocations() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.deallocationsTiny     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numTinySubpages() {
            r1 = this;
            io.netty.buffer.PoolSubpage<T>[] r0 = r1.tinySubpagePools
            int r0 = r0.length
            return r0
    }

    void reallocate(io.netty.buffer.PooledByteBuf<T> r16, int r17, boolean r18) {
            r15 = this;
            r6 = r16
            r1 = r17
            if (r1 < 0) goto L65
            int r2 = r6.maxCapacity()
            if (r1 > r2) goto L65
            int r5 = r6.length
            if (r5 != r1) goto L11
            goto L64
        L11:
            io.netty.buffer.PoolChunk<T> r7 = r6.chunk
            java.nio.ByteBuffer r8 = r6.tmpNioBuf
            long r9 = r6.handle
            T r2 = r6.memory
            r3 = r2
            int r2 = r6.offset
            int r11 = r6.maxLength
            int r12 = r6.readerIndex()
            int r13 = r6.writerIndex()
            io.netty.buffer.PooledByteBufAllocator r4 = r15.parent
            io.netty.buffer.PoolThreadCache r4 = r4.threadCache()
            r15.allocate(r4, r6, r1)
            if (r1 <= r5) goto L3b
            r1 = r3
            T r3 = r6.memory
            int r4 = r6.offset
            r0 = r15
            r0.memoryCopy(r1, r2, r3, r4, r5)
            goto L55
        L3b:
            r14 = r3
            r3 = r1
            r1 = r14
            if (r3 >= r5) goto L55
            if (r12 >= r3) goto L53
            if (r13 <= r3) goto L45
            r13 = r3
        L45:
            int r2 = r2 + r12
            T r3 = r6.memory
            int r0 = r6.offset
            int r4 = r0 + r12
            int r5 = r13 - r12
            r0 = r15
            r0.memoryCopy(r1, r2, r3, r4, r5)
            goto L55
        L53:
            r12 = r3
            r13 = r12
        L55:
            r6.setIndex(r12, r13)
            if (r18 == 0) goto L64
            io.netty.buffer.PoolThreadCache r6 = r6.cache
            r0 = r15
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.free(r1, r2, r3, r5, r6)
        L64:
            return
        L65:
            r3 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "newCapacity: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public java.util.List<io.netty.buffer.PoolSubpageMetric> smallSubpages() {
            r1 = this;
            io.netty.buffer.PoolSubpage<T>[] r0 = r1.smallSubpagePools
            java.util.List r0 = subPageMetricList(r0)
            return r0
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public java.util.List<io.netty.buffer.PoolSubpageMetric> tinySubpages() {
            r1 = this;
            io.netty.buffer.PoolSubpage<T>[] r0 = r1.tinySubpagePools
            java.util.List r0 = subPageMetricList(r0)
            return r0
    }

    public synchronized java.lang.String toString() {
            r3 = this;
            monitor-enter(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "Chunk(s) at 0~25%:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.qInit     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Chunk(s) at 0~50%:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.q000     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Chunk(s) at 25~75%:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.q025     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Chunk(s) at 50~100%:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.q050     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Chunk(s) at 75~100%:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.q075     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "Chunk(s) at 100%:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolChunkList<T> r2 = r3.q100     // Catch: java.lang.Throwable -> L88
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "tiny subpages:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolSubpage<T>[] r2 = r3.tinySubpagePools     // Catch: java.lang.Throwable -> L88
            appendPoolSubPages(r0, r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "small subpages:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L88
            io.netty.buffer.PoolSubpage<T>[] r2 = r3.smallSubpagePools     // Catch: java.lang.Throwable -> L88
            appendPoolSubPages(r0, r2)     // Catch: java.lang.Throwable -> L88
            r0.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)
            return r0
        L88:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            throw r0
    }
}
