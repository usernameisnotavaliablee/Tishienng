package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class PooledByteBuf<T> extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private io.netty.buffer.ByteBufAllocator allocator;
    io.netty.buffer.PoolThreadCache cache;
    protected io.netty.buffer.PoolChunk<T> chunk;
    protected long handle;
    protected int length;
    int maxLength;
    protected T memory;
    protected int offset;
    private final io.netty.util.Recycler.Handle<io.netty.buffer.PooledByteBuf<T>> recyclerHandle;
    java.nio.ByteBuffer tmpNioBuf;

    static {
            return
    }

    protected PooledByteBuf(io.netty.util.Recycler.Handle<? extends io.netty.buffer.PooledByteBuf<T>> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.recyclerHandle = r1
            return
    }

    private void init0(io.netty.buffer.PoolChunk<T> r2, java.nio.ByteBuffer r3, long r4, int r6, int r7, int r8, io.netty.buffer.PoolThreadCache r9) {
            r1 = this;
            r1.chunk = r2
            T r0 = r2.memory
            r1.memory = r0
            r1.tmpNioBuf = r3
            io.netty.buffer.PoolArena<T> r2 = r2.arena
            io.netty.buffer.PooledByteBufAllocator r2 = r2.parent
            r1.allocator = r2
            r1.cache = r9
            r1.handle = r4
            r1.offset = r6
            r1.length = r7
            r1.maxLength = r8
            return
    }

    private void recycle() {
            r1 = this;
            io.netty.util.Recycler$Handle<io.netty.buffer.PooledByteBuf<T>> r0 = r1.recyclerHandle
            r0.recycle(r1)
            return
    }

    final java.nio.ByteBuffer _internalNioBuffer(int r1, int r2, boolean r3) {
            r0 = this;
            int r1 = r0.idx(r1)
            if (r3 == 0) goto Ld
            T r3 = r0.memory
            java.nio.ByteBuffer r3 = r0.newInternalNioBuffer(r3)
            goto L11
        Ld:
            java.nio.ByteBuffer r3 = r0.internalNioBuffer()
        L11:
            int r2 = r2 + r1
            java.nio.Buffer r2 = r3.limit(r2)
            r2.position(r1)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int capacity() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf capacity(int r4) {
            r3 = this;
            int r0 = r3.length
            if (r4 != r0) goto L8
            r3.ensureAccessible()
            return r3
        L8:
            r3.checkNewCapacity(r4)
            io.netty.buffer.PoolChunk<T> r0 = r3.chunk
            boolean r1 = r0.unpooled
            if (r1 != 0) goto L40
            int r1 = r3.length
            if (r4 <= r1) goto L1c
            int r1 = r3.maxLength
            if (r4 > r1) goto L40
            r3.length = r4
            return r3
        L1c:
            int r1 = r3.maxLength
            int r2 = r1 >>> 1
            if (r4 <= r2) goto L40
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L2a
            int r1 = r1 + (-16)
            if (r4 <= r1) goto L40
        L2a:
            r3.length = r4
            int r0 = r3.readerIndex()
            int r0 = java.lang.Math.min(r0, r4)
            int r1 = r3.writerIndex()
            int r4 = java.lang.Math.min(r1, r4)
            r3.setIndex(r0, r4)
            return r3
        L40:
            io.netty.buffer.PoolArena<T> r0 = r0.arena
            r1 = 1
            r0.reallocate(r3, r4, r1)
            return r3
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected final void deallocate() {
            r8 = this;
            long r3 = r8.handle
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L23
            r0 = -1
            r8.handle = r0
            r7 = 0
            r8.memory = r7
            io.netty.buffer.PoolChunk<T> r1 = r8.chunk
            io.netty.buffer.PoolArena<T> r0 = r1.arena
            java.nio.ByteBuffer r2 = r8.tmpNioBuf
            int r5 = r8.maxLength
            io.netty.buffer.PoolThreadCache r6 = r8.cache
            r0.free(r1, r2, r3, r5, r6)
            r8.tmpNioBuf = r7
            r8.chunk = r7
            r8.recycle()
        L23:
            return
    }

    java.nio.ByteBuffer duplicateInternalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            r0 = 1
            java.nio.ByteBuffer r2 = r1._internalNioBuffer(r2, r3, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.duplicateInternalNioBuffer(r1, r5)
            int r1 = r2.write(r1, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.duplicateInternalNioBuffer(r1, r3)
            int r1 = r2.write(r1)
            return r1
    }

    protected final int idx(int r2) {
            r1 = this;
            int r0 = r1.offset
            int r0 = r0 + r2
            return r0
    }

    void init(io.netty.buffer.PoolChunk<T> r1, java.nio.ByteBuffer r2, long r3, int r5, int r6, int r7, io.netty.buffer.PoolThreadCache r8) {
            r0 = this;
            r0.init0(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    void initUnpooled(io.netty.buffer.PoolChunk<T> r10, int r11) {
            r9 = this;
            int r5 = r10.offset
            r8 = 0
            r2 = 0
            r3 = 0
            r7 = r11
            r0 = r9
            r1 = r10
            r6 = r11
            r0.init0(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    protected final java.nio.ByteBuffer internalNioBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.tmpNioBuf
            if (r0 != 0) goto Lc
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = r1.newInternalNioBuffer(r0)
            r1.tmpNioBuf = r0
        Lc:
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            r0 = 0
            java.nio.ByteBuffer r2 = r1._internalNioBuffer(r2, r3, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxFastWritableBytes() {
            r2 = this;
            int r0 = r2.maxLength
            int r1 = r2.maxCapacity()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r2.writerIndex
            int r0 = r0 - r1
            return r0
    }

    protected abstract java.nio.ByteBuffer newInternalNioBuffer(T r1);

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteBuffer nioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.duplicateInternalNioBuffer(r1, r2)
            java.nio.ByteBuffer r1 = r1.slice()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final int nioBufferCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r2 = r1.nioBuffer(r2, r3)
            r3 = 1
            java.nio.ByteBuffer[] r3 = new java.nio.ByteBuffer[r3]
            r0 = 0
            r3[r0] = r2
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readBytes(java.nio.channels.FileChannel r3, long r4, int r6) throws java.io.IOException {
            r2 = this;
            r2.checkReadableBytes(r6)
            int r0 = r2.readerIndex
            r1 = 0
            java.nio.ByteBuffer r6 = r2._internalNioBuffer(r0, r6, r1)
            int r3 = r3.write(r6, r4)
            int r4 = r2.readerIndex
            int r4 = r4 + r3
            r2.readerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readBytes(java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.checkReadableBytes(r4)
            int r0 = r2.readerIndex
            r1 = 0
            java.nio.ByteBuffer r4 = r2._internalNioBuffer(r0, r4, r1)
            int r3 = r3.write(r4)
            int r4 = r2.readerIndex
            int r4 = r4 + r3
            r2.readerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retainedDuplicate() {
            r2 = this;
            int r0 = r2.readerIndex()
            int r1 = r2.writerIndex()
            io.netty.buffer.PooledDuplicatedByteBuf r0 = io.netty.buffer.PooledDuplicatedByteBuf.newInstance(r2, r2, r0, r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retainedSlice() {
            r2 = this;
            int r0 = r2.readerIndex()
            int r1 = r2.writerIndex()
            int r1 = r1 - r0
            io.netty.buffer.ByteBuf r0 = r2.retainedSlice(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.PooledSlicedByteBuf r1 = io.netty.buffer.PooledSlicedByteBuf.newInstance(r0, r0, r1, r2)
            return r1
    }

    final void reuse(int r1) {
            r0 = this;
            r0.maxCapacity(r1)
            r0.resetRefCnt()
            r1 = 0
            r0.setIndex0(r1, r1)
            r0.discardMarks()
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public final int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.internalNioBuffer(r1, r5)     // Catch: java.nio.channels.ClosedChannelException -> L9
            int r1 = r2.read(r1, r3)     // Catch: java.nio.channels.ClosedChannelException -> L9
            return r1
        L9:
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.internalNioBuffer(r1, r3)     // Catch: java.nio.channels.ClosedChannelException -> L9
            int r1 = r2.read(r1)     // Catch: java.nio.channels.ClosedChannelException -> L9
            return r1
        L9:
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}
