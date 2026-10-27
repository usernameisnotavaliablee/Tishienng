package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PoolSubpage<T> implements io.netty.buffer.PoolSubpageMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long[] bitmap;
    private int bitmapLength;
    final io.netty.buffer.PoolChunk<T> chunk;
    boolean doNotDestroy;
    int elemSize;
    private int maxNumElems;
    private final int memoryMapIdx;
    io.netty.buffer.PoolSubpage<T> next;
    private int nextAvail;
    private int numAvail;
    private final int pageSize;
    io.netty.buffer.PoolSubpage<T> prev;
    private final int runOffset;

    static {
            return
    }

    PoolSubpage(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.chunk = r0
            r1 = -1
            r2.memoryMapIdx = r1
            r2.runOffset = r1
            r2.elemSize = r1
            r2.pageSize = r3
            r2.bitmap = r0
            return
    }

    PoolSubpage(io.netty.buffer.PoolSubpage<T> r1, io.netty.buffer.PoolChunk<T> r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.chunk = r2
            r0.memoryMapIdx = r3
            r0.runOffset = r4
            r0.pageSize = r5
            int r2 = r5 >>> 10
            long[] r2 = new long[r2]
            r0.bitmap = r2
            r0.init(r1, r6)
            return
    }

    private void addToPool(io.netty.buffer.PoolSubpage<T> r2) {
            r1 = this;
            r1.prev = r2
            io.netty.buffer.PoolSubpage<T> r0 = r2.next
            r1.next = r0
            r0.prev = r1
            r2.next = r1
            return
    }

    private int findNextAvail() {
            r10 = this;
            long[] r0 = r10.bitmap
            int r1 = r10.bitmapLength
            r2 = 0
        L5:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            long r5 = ~r3
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L15
            int r0 = r10.findNextAvail0(r2, r3)
            return r0
        L15:
            int r2 = r2 + 1
            goto L5
        L18:
            r0 = -1
            return r0
    }

    private int findNextAvail0(int r8, long r9) {
            r7 = this;
            int r0 = r7.maxNumElems
            int r8 = r8 << 6
            r1 = 0
        L5:
            r2 = 64
            if (r1 >= r2) goto L1b
            r2 = 1
            long r2 = r2 & r9
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L16
            r8 = r8 | r1
            if (r8 >= r0) goto L1b
            return r8
        L16:
            r2 = 1
            long r9 = r9 >>> r2
            int r1 = r1 + 1
            goto L5
        L1b:
            r8 = -1
            return r8
    }

    private int getNextAvail() {
            r2 = this;
            int r0 = r2.nextAvail
            if (r0 < 0) goto L8
            r1 = -1
            r2.nextAvail = r1
            return r0
        L8:
            int r0 = r2.findNextAvail()
            return r0
    }

    private void removeFromPool() {
            r2 = this;
            io.netty.buffer.PoolSubpage<T> r0 = r2.prev
            io.netty.buffer.PoolSubpage<T> r1 = r2.next
            r0.next = r1
            io.netty.buffer.PoolSubpage<T> r1 = r2.next
            r1.prev = r0
            r0 = 0
            r2.next = r0
            r2.prev = r0
            return
    }

    private void setNextAvail(int r1) {
            r0 = this;
            r0.nextAvail = r1
            return
    }

    private long toHandle(int r5) {
            r4 = this;
            long r0 = (long) r5
            r5 = 32
            long r0 = r0 << r5
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r0 = r0 | r2
            int r5 = r4.memoryMapIdx
            long r2 = (long) r5
            long r0 = r0 | r2
            return r0
    }

    long allocate() {
            r8 = this;
            int r0 = r8.elemSize
            if (r0 != 0) goto La
            r0 = 0
            long r0 = r8.toHandle(r0)
            return r0
        La:
            int r0 = r8.numAvail
            if (r0 == 0) goto L35
            boolean r0 = r8.doNotDestroy
            if (r0 != 0) goto L13
            goto L35
        L13:
            int r0 = r8.getNextAvail()
            int r1 = r0 >>> 6
            r2 = r0 & 63
            long[] r3 = r8.bitmap
            r4 = r3[r1]
            r6 = 1
            long r6 = r6 << r2
            long r4 = r4 | r6
            r3[r1] = r4
            int r1 = r8.numAvail
            int r1 = r1 + (-1)
            r8.numAvail = r1
            if (r1 != 0) goto L30
            r8.removeFromPool()
        L30:
            long r0 = r8.toHandle(r0)
            return r0
        L35:
            r0 = -1
            return r0
    }

    void destroy() {
            r1 = this;
            io.netty.buffer.PoolChunk<T> r0 = r1.chunk
            if (r0 == 0) goto L7
            r0.destroy()
        L7:
            return
    }

    @Override // io.netty.buffer.PoolSubpageMetric
    public int elementSize() {
            r2 = this;
            io.netty.buffer.PoolChunk<T> r0 = r2.chunk
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            io.netty.buffer.PoolArena<T> r0 = r0.arena
            monitor-enter(r0)
            int r1 = r2.elemSize     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    boolean free(io.netty.buffer.PoolSubpage<T> r9, int r10) {
            r8 = this;
            int r0 = r8.elemSize
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r10 >>> 6
            r2 = r10 & 63
            long[] r3 = r8.bitmap
            r4 = r3[r0]
            r6 = 1
            long r6 = r6 << r2
            long r4 = r4 ^ r6
            r3[r0] = r4
            r8.setNextAvail(r10)
            int r10 = r8.numAvail
            int r0 = r10 + 1
            r8.numAvail = r0
            if (r10 != 0) goto L23
            r8.addToPool(r9)
            return r1
        L23:
            int r9 = r8.maxNumElems
            if (r0 == r9) goto L28
            return r1
        L28:
            io.netty.buffer.PoolSubpage<T> r9 = r8.prev
            io.netty.buffer.PoolSubpage<T> r10 = r8.next
            if (r9 != r10) goto L2f
            return r1
        L2f:
            r9 = 0
            r8.doNotDestroy = r9
            r8.removeFromPool()
            return r9
    }

    void init(io.netty.buffer.PoolSubpage<T> r4, int r5) {
            r3 = this;
            r0 = 1
            r3.doNotDestroy = r0
            r3.elemSize = r5
            if (r5 == 0) goto L29
            int r1 = r3.pageSize
            int r1 = r1 / r5
            r3.numAvail = r1
            r3.maxNumElems = r1
            r5 = 0
            r3.nextAvail = r5
            int r2 = r1 >>> 6
            r3.bitmapLength = r2
            r1 = r1 & 63
            if (r1 == 0) goto L1c
            int r2 = r2 + r0
            r3.bitmapLength = r2
        L1c:
            int r0 = r3.bitmapLength
            if (r5 >= r0) goto L29
            long[] r0 = r3.bitmap
            r1 = 0
            r0[r5] = r1
            int r5 = r5 + 1
            goto L1c
        L29:
            r3.addToPool(r4)
            return
    }

    @Override // io.netty.buffer.PoolSubpageMetric
    public int maxNumElements() {
            r2 = this;
            io.netty.buffer.PoolChunk<T> r0 = r2.chunk
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            io.netty.buffer.PoolArena<T> r0 = r0.arena
            monitor-enter(r0)
            int r1 = r2.maxNumElems     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // io.netty.buffer.PoolSubpageMetric
    public int numAvailable() {
            r2 = this;
            io.netty.buffer.PoolChunk<T> r0 = r2.chunk
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            io.netty.buffer.PoolArena<T> r0 = r0.arena
            monitor-enter(r0)
            int r1 = r2.numAvail     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // io.netty.buffer.PoolSubpageMetric
    public int pageSize() {
            r1 = this;
            int r0 = r1.pageSize
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            io.netty.buffer.PoolChunk<T> r0 = r5.chunk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L9
            r0 = 0
            goto L1e
        L9:
            io.netty.buffer.PoolArena<T> r0 = r0.arena
            monitor-enter(r0)
            boolean r4 = r5.doNotDestroy     // Catch: java.lang.Throwable -> L80
            if (r4 != 0) goto L14
            r2 = 0
            r3 = -1
            r4 = -1
            goto L1a
        L14:
            int r1 = r5.maxNumElems     // Catch: java.lang.Throwable -> L80
            int r3 = r5.numAvail     // Catch: java.lang.Throwable -> L80
            int r4 = r5.elemSize     // Catch: java.lang.Throwable -> L80
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            r0 = r3
            r3 = r1
            r1 = r4
        L1e:
            if (r2 != 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r5.memoryMapIdx
            r0.append(r1)
            java.lang.String r1 = ": not in use)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "("
            r2.append(r4)
            int r4 = r5.memoryMapIdx
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            int r0 = r3 - r0
            r2.append(r0)
            r0 = 47
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", offset: "
            r2.append(r0)
            int r0 = r5.runOffset
            r2.append(r0)
            java.lang.String r0 = ", length: "
            r2.append(r0)
            int r0 = r5.pageSize
            r2.append(r0)
            java.lang.String r0 = ", elemSize: "
            r2.append(r0)
            r2.append(r1)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L80:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r1
    }
}
