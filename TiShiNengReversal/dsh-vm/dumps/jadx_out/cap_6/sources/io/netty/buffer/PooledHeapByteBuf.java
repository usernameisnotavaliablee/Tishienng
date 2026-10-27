package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class PooledHeapByteBuf extends io.netty.buffer.PooledByteBuf<byte[]> {
    private static final io.netty.util.Recycler<io.netty.buffer.PooledHeapByteBuf> RECYCLER = null;


    static {
            io.netty.buffer.PooledHeapByteBuf$1 r0 = new io.netty.buffer.PooledHeapByteBuf$1
            r0.<init>()
            io.netty.buffer.PooledHeapByteBuf.RECYCLER = r0
            return
    }

    PooledHeapByteBuf(io.netty.util.Recycler.Handle<? extends io.netty.buffer.PooledHeapByteBuf> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static io.netty.buffer.PooledHeapByteBuf newInstance(int r1) {
            io.netty.util.Recycler<io.netty.buffer.PooledHeapByteBuf> r0 = io.netty.buffer.PooledHeapByteBuf.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PooledHeapByteBuf r0 = (io.netty.buffer.PooledHeapByteBuf) r0
            r0.reuse(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            byte r2 = io.netty.buffer.HeapByteBufUtil.getByte(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.HeapByteBufUtil.getInt(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.HeapByteBufUtil.getIntLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            T r0 = r2.memory
            byte[] r0 = (byte[]) r0
            int r3 = r2.idx(r3)
            long r0 = io.netty.buffer.HeapByteBufUtil.getLong(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            T r0 = r2.memory
            byte[] r0 = (byte[]) r0
            int r3 = r2.idx(r3)
            long r0 = io.netty.buffer.HeapByteBufUtil.getLongLE(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            short r2 = io.netty.buffer.HeapByteBufUtil.getShort(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            short r2 = io.netty.buffer.HeapByteBufUtil.getShortLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.HeapByteBufUtil.getUnsignedMedium(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.HeapByteBufUtil.getUnsignedMediumLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setByte(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setInt(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setIntLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setLong(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setLongLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setMedium(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setMediumLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setShort(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.HeapByteBufUtil.setShortLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public final byte[] array() {
            r1 = this;
            r1.ensureAccessible()
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int arrayOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf copy(int r3, int r4) {
            r2 = this;
            r2.checkIndex(r3, r4)
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
            int r1 = r2.maxCapacity()
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer(r4, r1)
            T r1 = r2.memory
            byte[] r1 = (byte[]) r1
            int r3 = r2.idx(r3)
            io.netty.buffer.ByteBuf r3 = r0.writeBytes(r1, r3, r4)
            return r3
    }

    @Override // io.netty.buffer.PooledByteBuf
    final java.nio.ByteBuffer duplicateInternalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r2, r3)
            java.nio.ByteBuffer r2 = r2.slice()
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf getBytes(int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            r7 = this;
            int r0 = r9.capacity()
            r7.checkDstIndex(r8, r11, r10, r0)
            boolean r0 = r9.hasMemoryAddress()
            if (r0 == 0) goto L21
            T r0 = r7.memory
            r1 = r0
            byte[] r1 = (byte[]) r1
            int r2 = r7.idx(r8)
            long r8 = r9.memoryAddress()
            long r3 = (long) r10
            long r3 = r3 + r8
            long r5 = (long) r11
            io.netty.util.internal.PlatformDependent.copyMemory(r1, r2, r3, r5)
            return r7
        L21:
            boolean r0 = r9.hasArray()
            if (r0 == 0) goto L34
            byte[] r0 = r9.array()
            int r9 = r9.arrayOffset()
            int r9 = r9 + r10
            r7.getBytes(r8, r0, r9, r11)
            return r7
        L34:
            T r0 = r7.memory
            byte[] r0 = (byte[]) r0
            int r8 = r7.idx(r8)
            r9.setBytes(r10, r0, r8, r11)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex(r2, r4)
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            r3.write(r0, r2, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf getBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            int r0 = r4.remaining()
            r2.checkIndex(r3, r0)
            T r1 = r2.memory
            byte[] r1 = (byte[]) r1
            int r3 = r2.idx(r3)
            r4.put(r1, r3, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkDstIndex(r2, r5, r4, r0)
            T r0 = r1.memory
            int r2 = r1.idx(r2)
            java.lang.System.arraycopy(r0, r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean hasArray() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean hasMemoryAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isDirect() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final long memoryAddress() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.PooledByteBuf
    protected /* bridge */ /* synthetic */ java.nio.ByteBuffer newInternalNioBuffer(byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            java.nio.ByteBuffer r1 = r0.newInternalNioBuffer2(r1)
            return r1
    }

    /* renamed from: newInternalNioBuffer, reason: avoid collision after fix types in other method */
    protected final java.nio.ByteBuffer newInternalNioBuffer2(byte[] r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex(r2, r4)
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = r3.read(r0, r2, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setBytes(int r9, io.netty.buffer.ByteBuf r10, int r11, int r12) {
            r8 = this;
            int r0 = r10.capacity()
            r8.checkSrcIndex(r9, r12, r11, r0)
            boolean r0 = r10.hasMemoryAddress()
            if (r0 == 0) goto L22
            long r0 = r10.memoryAddress()
            long r10 = (long) r11
            long r2 = r0 + r10
            T r10 = r8.memory
            r4 = r10
            byte[] r4 = (byte[]) r4
            int r5 = r8.idx(r9)
            long r6 = (long) r12
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r5, r6)
            return r8
        L22:
            boolean r0 = r10.hasArray()
            if (r0 == 0) goto L35
            byte[] r0 = r10.array()
            int r10 = r10.arrayOffset()
            int r10 = r10 + r11
            r8.setBytes(r9, r0, r10, r12)
            return r8
        L35:
            T r0 = r8.memory
            byte[] r0 = (byte[]) r0
            int r9 = r8.idx(r9)
            r10.getBytes(r11, r0, r9, r12)
            return r8
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            int r0 = r4.remaining()
            r2.checkIndex(r3, r0)
            T r1 = r2.memory
            byte[] r1 = (byte[]) r1
            int r3 = r2.idx(r3)
            r4.get(r1, r3, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkSrcIndex(r2, r5, r4, r0)
            T r0 = r1.memory
            int r2 = r1.idx(r2)
            java.lang.System.arraycopy(r3, r4, r0, r2, r5)
            return r1
    }
}
