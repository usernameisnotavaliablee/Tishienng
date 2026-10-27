package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PoolChunk<T> implements io.netty.buffer.PoolChunkMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INTEGER_SIZE_MINUS_ONE = 31;
    final io.netty.buffer.PoolArena<T> arena;
    private final java.util.Deque<java.nio.ByteBuffer> cachedNioBuffers;
    private final int chunkSize;
    private final byte[] depthMap;
    private int freeBytes;
    private final int log2ChunkSize;
    private final int maxOrder;
    private final int maxSubpageAllocs;
    final T memory;
    private final byte[] memoryMap;
    io.netty.buffer.PoolChunk<T> next;
    final int offset;
    private final int pageShifts;
    private final int pageSize;
    io.netty.buffer.PoolChunkList<T> parent;
    io.netty.buffer.PoolChunk<T> prev;
    private final int subpageOverflowMask;
    private final io.netty.buffer.PoolSubpage<T>[] subpages;
    final boolean unpooled;
    private final byte unusable;

    static {
            return
    }

    PoolChunk(io.netty.buffer.PoolArena<T> r2, T r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.unpooled = r0
            r1.arena = r2
            r1.memory = r3
            r1.offset = r5
            r2 = 0
            r1.memoryMap = r2
            r1.depthMap = r2
            r1.subpages = r2
            r3 = 0
            r1.subpageOverflowMask = r3
            r1.pageSize = r3
            r1.pageShifts = r3
            r1.maxOrder = r3
            byte r5 = (byte) r0
            r1.unusable = r5
            r1.chunkSize = r4
            int r4 = log2(r4)
            r1.log2ChunkSize = r4
            r1.maxSubpageAllocs = r3
            r1.cachedNioBuffers = r2
            return
    }

    PoolChunk(io.netty.buffer.PoolArena<T> r3, T r4, int r5, int r6, int r7, int r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.unpooled = r0
            r2.arena = r3
            r2.memory = r4
            r2.pageSize = r5
            r2.pageShifts = r7
            r2.maxOrder = r6
            r2.chunkSize = r8
            r2.offset = r9
            int r3 = r6 + 1
            byte r3 = (byte) r3
            r2.unusable = r3
            int r3 = log2(r8)
            r2.log2ChunkSize = r3
            r3 = 1
            int r5 = r5 - r3
            int r4 = ~r5
            r2.subpageOverflowMask = r4
            r2.freeBytes = r8
            int r4 = r3 << r6
            r2.maxSubpageAllocs = r4
            int r4 = r4 << r3
            byte[] r4 = new byte[r4]
            r2.memoryMap = r4
            int r4 = r4.length
            byte[] r4 = new byte[r4]
            r2.depthMap = r4
            r4 = 0
            r5 = 1
        L36:
            if (r4 > r6) goto L4e
            int r7 = r3 << r4
            r8 = 0
        L3b:
            if (r8 >= r7) goto L4b
            byte[] r9 = r2.memoryMap
            byte r1 = (byte) r4
            r9[r5] = r1
            byte[] r9 = r2.depthMap
            r9[r5] = r1
            int r5 = r5 + 1
            int r8 = r8 + 1
            goto L3b
        L4b:
            int r4 = r4 + 1
            goto L36
        L4e:
            int r3 = r2.maxSubpageAllocs
            io.netty.buffer.PoolSubpage[] r3 = r2.newSubpageArray(r3)
            r2.subpages = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r4 = 8
            r3.<init>(r4)
            r2.cachedNioBuffers = r3
            return
    }

    private int allocateNode(int r4) {
            r3 = this;
            r0 = 1
            int r1 = r0 << r4
            int r1 = -r1
            byte r2 = r3.value(r0)
            if (r2 <= r4) goto Lc
            r4 = -1
            return r4
        Lc:
            if (r2 < r4) goto L1f
            r2 = r0 & r1
            if (r2 != 0) goto L13
            goto L1f
        L13:
            r3.value(r0)
            byte r4 = r3.unusable
            r3.setValue(r0, r4)
            r3.updateParentsAlloc(r0)
            return r0
        L1f:
            int r0 = r0 << 1
            byte r2 = r3.value(r0)
            if (r2 <= r4) goto Lc
            r0 = r0 ^ 1
            byte r2 = r3.value(r0)
            goto Lc
    }

    private long allocateRun(int r3) {
            r2 = this;
            int r0 = r2.maxOrder
            int r3 = log2(r3)
            int r1 = r2.pageShifts
            int r3 = r3 - r1
            int r0 = r0 - r3
            int r3 = r2.allocateNode(r0)
            if (r3 >= 0) goto L12
            long r0 = (long) r3
            return r0
        L12:
            int r0 = r2.freeBytes
            int r1 = r2.runLength(r3)
            int r0 = r0 - r1
            r2.freeBytes = r0
            long r0 = (long) r3
            return r0
    }

    private long allocateSubpage(int r10) {
            r9 = this;
            io.netty.buffer.PoolArena<T> r0 = r9.arena
            io.netty.buffer.PoolSubpage r2 = r0.findSubpagePoolHead(r10)
            int r0 = r9.maxOrder
            monitor-enter(r2)
            int r4 = r9.allocateNode(r0)     // Catch: java.lang.Throwable -> L12
            if (r4 >= 0) goto L15
            long r0 = (long) r4     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = move-exception
            r10 = r0
            goto L3e
        L15:
            io.netty.buffer.PoolSubpage<T>[] r0 = r9.subpages     // Catch: java.lang.Throwable -> L12
            int r6 = r9.pageSize     // Catch: java.lang.Throwable -> L12
            int r1 = r9.freeBytes     // Catch: java.lang.Throwable -> L12
            int r1 = r1 - r6
            r9.freeBytes = r1     // Catch: java.lang.Throwable -> L12
            int r8 = r9.subpageIdx(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r0[r8]     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L34
            io.netty.buffer.PoolSubpage r1 = new io.netty.buffer.PoolSubpage     // Catch: java.lang.Throwable -> L12
            int r5 = r9.runOffset(r4)     // Catch: java.lang.Throwable -> L12
            r3 = r9
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12
            r0[r8] = r1     // Catch: java.lang.Throwable -> L12
            goto L38
        L34:
            r7 = r10
            r1.init(r2, r7)     // Catch: java.lang.Throwable -> L12
        L38:
            long r0 = r1.allocate()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return r0
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r10
    }

    private static int bitmapIdx(long r1) {
            r0 = 32
            long r1 = r1 >>> r0
            int r2 = (int) r1
            return r2
    }

    private byte depth(int r2) {
            r1 = this;
            byte[] r0 = r1.depthMap
            r2 = r0[r2]
            return r2
    }

    private void initBufWithSubpage(io.netty.buffer.PooledByteBuf<T> r10, java.nio.ByteBuffer r11, long r12, int r14, int r15) {
            r9 = this;
            int r0 = memoryMapIdx(r12)
            io.netty.buffer.PoolSubpage<T>[] r2 = r9.subpages
            int r3 = r9.subpageIdx(r0)
            r2 = r2[r3]
            int r0 = r9.runOffset(r0)
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r3 = r3 & r14
            int r7 = r2.elemSize
            int r3 = r3 * r7
            int r0 = r0 + r3
            int r2 = r9.offset
            int r5 = r0 + r2
            io.netty.buffer.PoolArena<T> r0 = r9.arena
            io.netty.buffer.PooledByteBufAllocator r0 = r0.parent
            io.netty.buffer.PoolThreadCache r8 = r0.threadCache()
            r1 = r9
            r0 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            r0.init(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    private static int log2(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = 31 - r0
            return r0
    }

    private static int memoryMapIdx(long r0) {
            int r1 = (int) r0
            return r1
    }

    private io.netty.buffer.PoolSubpage<T>[] newSubpageArray(int r1) {
            r0 = this;
            io.netty.buffer.PoolSubpage[] r1 = new io.netty.buffer.PoolSubpage[r1]
            return r1
    }

    private int runLength(int r2) {
            r1 = this;
            int r0 = r1.log2ChunkSize
            byte r2 = r1.depth(r2)
            int r0 = r0 - r2
            r2 = 1
            int r2 = r2 << r0
            return r2
    }

    private int runOffset(int r3) {
            r2 = this;
            r0 = 1
            byte r1 = r2.depth(r3)
            int r0 = r0 << r1
            r0 = r0 ^ r3
            int r3 = r2.runLength(r3)
            int r0 = r0 * r3
            return r0
    }

    private void setValue(int r2, byte r3) {
            r1 = this;
            byte[] r0 = r1.memoryMap
            r0[r2] = r3
            return
    }

    private int subpageIdx(int r2) {
            r1 = this;
            int r0 = r1.maxSubpageAllocs
            r2 = r2 ^ r0
            return r2
    }

    private void updateParentsAlloc(int r3) {
            r2 = this;
        L0:
            r0 = 1
            if (r3 <= r0) goto L18
            int r0 = r3 >>> 1
            byte r1 = r2.value(r3)
            r3 = r3 ^ 1
            byte r3 = r2.value(r3)
            if (r1 >= r3) goto L12
            goto L13
        L12:
            r1 = r3
        L13:
            r2.setValue(r0, r1)
            r3 = r0
            goto L0
        L18:
            return
    }

    private void updateParentsFree(int r6) {
            r5 = this;
            byte r0 = r5.depth(r6)
            r1 = 1
            int r0 = r0 + r1
        L6:
            if (r6 <= r1) goto L2b
            int r2 = r6 >>> 1
            byte r3 = r5.value(r6)
            r6 = r6 ^ 1
            byte r6 = r5.value(r6)
            int r4 = r0 + (-1)
            if (r3 != r4) goto L21
            if (r6 != r4) goto L21
            int r0 = r0 + (-2)
            byte r6 = (byte) r0
            r5.setValue(r2, r6)
            goto L28
        L21:
            if (r3 >= r6) goto L24
            goto L25
        L24:
            r3 = r6
        L25:
            r5.setValue(r2, r3)
        L28:
            r6 = r2
            r0 = r4
            goto L6
        L2b:
            return
    }

    private int usage(int r6) {
            r5 = this;
            r0 = 100
            if (r6 != 0) goto L5
            return r0
        L5:
            long r1 = (long) r6
            r3 = 100
            long r1 = r1 * r3
            int r6 = r5.chunkSize
            long r3 = (long) r6
            long r1 = r1 / r3
            int r6 = (int) r1
            if (r6 != 0) goto L14
            r6 = 99
            return r6
        L14:
            int r0 = r0 - r6
            return r0
    }

    private byte value(int r2) {
            r1 = this;
            byte[] r0 = r1.memoryMap
            r2 = r0[r2]
            return r2
    }

    boolean allocate(io.netty.buffer.PooledByteBuf<T> r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.subpageOverflowMask
            r0 = r0 & r11
            if (r0 == 0) goto Lb
            long r0 = r8.allocateRun(r11)
        L9:
            r5 = r0
            goto L10
        Lb:
            long r0 = r8.allocateSubpage(r11)
            goto L9
        L10:
            r0 = 0
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 >= 0) goto L18
            r9 = 0
            return r9
        L18:
            java.util.Deque<java.nio.ByteBuffer> r11 = r8.cachedNioBuffers
            if (r11 == 0) goto L27
            java.lang.Object r11 = r11.pollLast()
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
        L22:
            r2 = r8
            r3 = r9
            r7 = r10
            r4 = r11
            goto L29
        L27:
            r11 = 0
            goto L22
        L29:
            r2.initBuf(r3, r4, r5, r7)
            r9 = 1
            return r9
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int chunkSize() {
            r1 = this;
            int r0 = r1.chunkSize
            return r0
    }

    void destroy() {
            r1 = this;
            io.netty.buffer.PoolArena<T> r0 = r1.arena
            r0.destroyChunk(r1)
            return
    }

    void free(long r4, java.nio.ByteBuffer r6) {
            r3 = this;
            int r0 = memoryMapIdx(r4)
            int r4 = bitmapIdx(r4)
            if (r4 == 0) goto L2d
            io.netty.buffer.PoolSubpage<T>[] r5 = r3.subpages
            int r1 = r3.subpageIdx(r0)
            r5 = r5[r1]
            io.netty.buffer.PoolArena<T> r1 = r3.arena
            int r2 = r5.elemSize
            io.netty.buffer.PoolSubpage r1 = r1.findSubpagePoolHead(r2)
            monitor-enter(r1)
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r2
            boolean r4 = r5.free(r1, r4)     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r4 = move-exception
            goto L2b
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r4
        L2d:
            int r4 = r3.freeBytes
            int r5 = r3.runLength(r0)
            int r4 = r4 + r5
            r3.freeBytes = r4
            byte r4 = r3.depth(r0)
            r3.setValue(r0, r4)
            r3.updateParentsFree(r0)
            if (r6 == 0) goto L53
            java.util.Deque<java.nio.ByteBuffer> r4 = r3.cachedNioBuffers
            if (r4 == 0) goto L53
            int r4 = r4.size()
            int r5 = io.netty.buffer.PooledByteBufAllocator.DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK
            if (r4 >= r5) goto L53
            java.util.Deque<java.nio.ByteBuffer> r4 = r3.cachedNioBuffers
            r4.offer(r6)
        L53:
            return
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int freeBytes() {
            r2 = this;
            io.netty.buffer.PoolArena<T> r0 = r2.arena
            monitor-enter(r0)
            int r1 = r2.freeBytes     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    void initBuf(io.netty.buffer.PooledByteBuf<T> r10, java.nio.ByteBuffer r11, long r12, int r14) {
            r9 = this;
            int r1 = memoryMapIdx(r12)
            int r5 = bitmapIdx(r12)
            if (r5 != 0) goto L2a
            r9.value(r1)
            int r2 = r9.runOffset(r1)
            int r3 = r9.offset
            int r5 = r2 + r3
            int r7 = r9.runLength(r1)
            io.netty.buffer.PoolArena<T> r1 = r9.arena
            io.netty.buffer.PooledByteBufAllocator r1 = r1.parent
            io.netty.buffer.PoolThreadCache r8 = r1.threadCache()
            r1 = r9
            r0 = r10
            r2 = r11
            r3 = r12
            r6 = r14
            r0.init(r1, r2, r3, r5, r6, r7, r8)
            return
        L2a:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r14
            r0.initBufWithSubpage(r1, r2, r3, r5, r6)
            return
    }

    void initBufWithSubpage(io.netty.buffer.PooledByteBuf<T> r8, java.nio.ByteBuffer r9, long r10, int r12) {
            r7 = this;
            int r5 = bitmapIdx(r10)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r12
            r0.initBufWithSubpage(r1, r2, r3, r5, r6)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            io.netty.buffer.PoolArena<T> r0 = r3.arena
            monitor-enter(r0)
            int r1 = r3.freeBytes     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Chunk("
            r0.append(r2)
            int r2 = java.lang.System.identityHashCode(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            int r2 = r3.usage(r1)
            r0.append(r2)
            java.lang.String r2 = "%, "
            r0.append(r2)
            int r2 = r3.chunkSize
            int r2 = r2 - r1
            r0.append(r2)
            r1 = 47
            r0.append(r1)
            int r1 = r3.chunkSize
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int usage() {
            r2 = this;
            io.netty.buffer.PoolArena<T> r0 = r2.arena
            monitor-enter(r0)
            int r1 = r2.freeBytes     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            int r0 = r2.usage(r1)
            return r0
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
