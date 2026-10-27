package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PoolChunkList<T> implements io.netty.buffer.PoolChunkListMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Iterator<io.netty.buffer.PoolChunkMetric> EMPTY_METRICS = null;
    private final io.netty.buffer.PoolArena<T> arena;
    private io.netty.buffer.PoolChunk<T> head;
    private final int maxCapacity;
    private final int maxUsage;
    private final int minUsage;
    private final io.netty.buffer.PoolChunkList<T> nextList;
    private io.netty.buffer.PoolChunkList<T> prevList;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            io.netty.buffer.PoolChunkList.EMPTY_METRICS = r0
            return
    }

    PoolChunkList(io.netty.buffer.PoolArena<T> r1, io.netty.buffer.PoolChunkList<T> r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.arena = r1
            r0.nextList = r2
            r0.minUsage = r3
            r0.maxUsage = r4
            int r1 = calculateMaxCapacity(r3, r5)
            r0.maxCapacity = r1
            return
    }

    private static int calculateMaxCapacity(int r4, int r5) {
            int r4 = minUsage0(r4)
            r0 = 100
            if (r4 != r0) goto La
            r4 = 0
            return r4
        La:
            long r0 = (long) r5
            long r4 = (long) r4
            r2 = 100
            long r4 = r2 - r4
            long r0 = r0 * r4
            long r0 = r0 / r2
            int r4 = (int) r0
            return r4
    }

    private static int minUsage0(int r1) {
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private boolean move(io.netty.buffer.PoolChunk<T> r3) {
            r2 = this;
            int r0 = r3.usage()
            int r1 = r2.minUsage
            if (r0 >= r1) goto Ld
            boolean r3 = r2.move0(r3)
            return r3
        Ld:
            r2.add0(r3)
            r3 = 1
            return r3
    }

    private boolean move0(io.netty.buffer.PoolChunk<T> r2) {
            r1 = this;
            io.netty.buffer.PoolChunkList<T> r0 = r1.prevList
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.move(r2)
            return r2
    }

    private void remove(io.netty.buffer.PoolChunk<T> r2) {
            r1 = this;
            io.netty.buffer.PoolChunk<T> r0 = r1.head
            if (r2 != r0) goto Le
            io.netty.buffer.PoolChunk<T> r2 = r2.next
            r1.head = r2
            if (r2 == 0) goto L18
            r0 = 0
            r2.prev = r0
            return
        Le:
            io.netty.buffer.PoolChunk<T> r0 = r2.next
            io.netty.buffer.PoolChunk<T> r2 = r2.prev
            r2.next = r0
            if (r0 == 0) goto L18
            r0.prev = r2
        L18:
            return
    }

    void add(io.netty.buffer.PoolChunk<T> r3) {
            r2 = this;
            int r0 = r3.usage()
            int r1 = r2.maxUsage
            if (r0 < r1) goto Le
            io.netty.buffer.PoolChunkList<T> r0 = r2.nextList
            r0.add(r3)
            return
        Le:
            r2.add0(r3)
            return
    }

    void add0(io.netty.buffer.PoolChunk<T> r3) {
            r2 = this;
            r3.parent = r2
            io.netty.buffer.PoolChunk<T> r0 = r2.head
            r1 = 0
            if (r0 != 0) goto Le
            r2.head = r3
            r3.prev = r1
            r3.next = r1
            return
        Le:
            r3.prev = r1
            r3.next = r0
            r0.prev = r3
            r2.head = r3
            return
    }

    boolean allocate(io.netty.buffer.PooledByteBuf<T> r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.maxCapacity
            r1 = 0
            if (r6 <= r0) goto L6
            return r1
        L6:
            io.netty.buffer.PoolChunk<T> r0 = r3.head
        L8:
            if (r0 == 0) goto L25
            boolean r2 = r0.allocate(r4, r5, r6)
            if (r2 == 0) goto L22
            int r4 = r0.usage()
            int r5 = r3.maxUsage
            if (r4 < r5) goto L20
            r3.remove(r0)
            io.netty.buffer.PoolChunkList<T> r4 = r3.nextList
            r4.add(r0)
        L20:
            r4 = 1
            return r4
        L22:
            io.netty.buffer.PoolChunk<T> r0 = r0.next
            goto L8
        L25:
            return r1
    }

    void destroy(io.netty.buffer.PoolArena<T> r2) {
            r1 = this;
            io.netty.buffer.PoolChunk<T> r0 = r1.head
        L2:
            if (r0 == 0) goto La
            r2.destroyChunk(r0)
            io.netty.buffer.PoolChunk<T> r0 = r0.next
            goto L2
        La:
            r2 = 0
            r1.head = r2
            return
    }

    boolean free(io.netty.buffer.PoolChunk<T> r1, long r2, java.nio.ByteBuffer r4) {
            r0 = this;
            r1.free(r2, r4)
            int r2 = r1.usage()
            int r3 = r0.minUsage
            if (r2 >= r3) goto L13
            r0.remove(r1)
            boolean r1 = r0.move0(r1)
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<io.netty.buffer.PoolChunkMetric> iterator() {
            r3 = this;
            io.netty.buffer.PoolArena<T> r0 = r3.arena
            monitor-enter(r0)
            io.netty.buffer.PoolChunk<T> r1 = r3.head     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            java.util.Iterator<io.netty.buffer.PoolChunkMetric> r1 = io.netty.buffer.PoolChunkList.EMPTY_METRICS     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L21
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            io.netty.buffer.PoolChunk<T> r2 = r3.head     // Catch: java.lang.Throwable -> Lb
        L14:
            r1.add(r2)     // Catch: java.lang.Throwable -> Lb
            io.netty.buffer.PoolChunk<T> r2 = r2.next     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L14
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // io.netty.buffer.PoolChunkListMetric
    public int maxUsage() {
            r2 = this;
            int r0 = r2.maxUsage
            r1 = 100
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.PoolChunkListMetric
    public int minUsage() {
            r1 = this;
            int r0 = r1.minUsage
            int r0 = minUsage0(r0)
            return r0
    }

    void prevList(io.netty.buffer.PoolChunkList<T> r1) {
            r0 = this;
            r0.prevList = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.buffer.PoolArena<T> r1 = r4.arena
            monitor-enter(r1)
            io.netty.buffer.PoolChunk<T> r2 = r4.head     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            java.lang.String r0 = "none"
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            goto L25
        L12:
            r0.append(r2)     // Catch: java.lang.Throwable -> L10
            io.netty.buffer.PoolChunk<T> r2 = r2.next     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.toString()
            return r0
        L1f:
            java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE     // Catch: java.lang.Throwable -> L10
            r0.append(r3)     // Catch: java.lang.Throwable -> L10
            goto L12
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
