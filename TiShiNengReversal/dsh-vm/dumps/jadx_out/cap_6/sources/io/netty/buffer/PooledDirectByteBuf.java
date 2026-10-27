package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PooledDirectByteBuf extends io.netty.buffer.PooledByteBuf<java.nio.ByteBuffer> {
    private static final io.netty.util.Recycler<io.netty.buffer.PooledDirectByteBuf> RECYCLER = null;


    static {
            io.netty.buffer.PooledDirectByteBuf$1 r0 = new io.netty.buffer.PooledDirectByteBuf$1
            r0.<init>()
            io.netty.buffer.PooledDirectByteBuf.RECYCLER = r0
            return
    }

    private PooledDirectByteBuf(io.netty.util.Recycler.Handle<io.netty.buffer.PooledDirectByteBuf> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ PooledDirectByteBuf(io.netty.util.Recycler.Handle r1, int r2, io.netty.buffer.PooledDirectByteBuf.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void getBytes(int r2, java.io.OutputStream r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            r1.checkIndex(r2, r4)
            if (r4 != 0) goto L6
            return
        L6:
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            if (r5 == 0) goto L11
            java.nio.ByteBuffer r5 = r1.internalNioBuffer()
            goto L19
        L11:
            T r5 = r1.memory
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.nio.ByteBuffer r5 = r5.duplicate()
        L19:
            int r2 = r1.idx(r2)
            io.netty.buffer.ByteBufUtil.readBytes(r0, r5, r2, r4, r3)
            return
    }

    static io.netty.buffer.PooledDirectByteBuf newInstance(int r1) {
            io.netty.util.Recycler<io.netty.buffer.PooledDirectByteBuf> r0 = io.netty.buffer.PooledDirectByteBuf.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PooledDirectByteBuf r0 = (io.netty.buffer.PooledDirectByteBuf) r0
            r0.reuse(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            byte r2 = r0.get(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r1) {
            r0 = this;
            int r1 = r0._getInt(r1)
            int r1 = io.netty.buffer.ByteBufUtil.swapInt(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            T r0 = r2.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r3 = r2.idx(r3)
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            long r0 = r2._getLong(r3)
            long r0 = io.netty.buffer.ByteBufUtil.swapLong(r0)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r1) {
            r0 = this;
            short r1 = r0._getShort(r1)
            short r1 = io.netty.buffer.ByteBufUtil.swapShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r4) {
            r3 = this;
            int r4 = r3.idx(r4)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte r0 = r0.get(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            T r1 = r3.memory
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r4 + 1
            byte r1 = r1.get(r2)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            T r1 = r3.memory
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r4 = r4 + 2
            byte r4 = r1.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r4) {
            r3 = this;
            int r4 = r3.idx(r4)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte r0 = r0.get(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            T r1 = r3.memory
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r4 + 1
            byte r1 = r1.get(r2)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            T r1 = r3.memory
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r4 = r4 + 2
            byte r4 = r1.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            byte r3 = (byte) r3
            r0.put(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            r0.putInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r1, int r2) {
            r0 = this;
            int r2 = io.netty.buffer.ByteBufUtil.swapInt(r2)
            r0._setInt(r1, r2)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            r0.putLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r1, long r2) {
            r0 = this;
            long r2 = io.netty.buffer.ByteBufUtil.swapLong(r2)
            r0._setLong(r1, r2)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r4, int r5) {
            r3 = this;
            int r4 = r3.idx(r4)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r5 >>> 16
            byte r1 = (byte) r1
            r0.put(r4, r1)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r4 + 1
            int r2 = r5 >>> 8
            byte r2 = (byte) r2
            r0.put(r1, r2)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r4 = r4 + 2
            byte r5 = (byte) r5
            r0.put(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r4, int r5) {
            r3 = this;
            int r4 = r3.idx(r4)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte r1 = (byte) r5
            r0.put(r4, r1)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r4 + 1
            int r2 = r5 >>> 8
            byte r2 = (byte) r2
            r0.put(r1, r2)
            T r0 = r3.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r4 = r4 + 2
            int r5 = r5 >>> 16
            byte r5 = (byte) r5
            r0.put(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r2 = r1.idx(r2)
            short r3 = (short) r3
            r0.putShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r1, int r2) {
            r0 = this;
            short r2 = (short) r2
            short r2 = io.netty.buffer.ByteBufUtil.swapShort(r2)
            r0._setShort(r1, r2)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "direct buffer"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "direct buffer"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r3, int r4) {
            r2 = this;
            r2.checkIndex(r3, r4)
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
            int r1 = r2.maxCapacity()
            io.netty.buffer.ByteBuf r0 = r0.directBuffer(r4, r1)
            io.netty.buffer.ByteBuf r3 = r0.writeBytes(r2, r3, r4)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, io.netty.buffer.ByteBuf r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.capacity()
            r2.checkDstIndex(r3, r6, r5, r0)
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L1a
            byte[] r0 = r4.array()
            int r4 = r4.arrayOffset()
            int r4 = r4 + r5
            r2.getBytes(r3, r0, r4, r6)
            return r2
        L1a:
            int r0 = r4.nioBufferCount()
            if (r0 <= 0) goto L36
            java.nio.ByteBuffer[] r4 = r4.nioBuffers(r5, r6)
            int r5 = r4.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L35
            r0 = r4[r6]
            int r1 = r0.remaining()
            r2.getBytes(r3, r0)
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L26
        L35:
            return r2
        L36:
            r4.setBytes(r5, r2, r3, r6)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.getBytes(r2, r3, r4, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            int r0 = r3.remaining()
            java.nio.ByteBuffer r2 = r1.duplicateInternalNioBuffer(r2, r0)
            r3.put(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkDstIndex(r2, r5, r4, r0)
            r0 = 1
            java.nio.ByteBuffer r2 = r1._internalNioBuffer(r2, r5, r0)
            r2.get(r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.PooledByteBuf
    protected /* bridge */ /* synthetic */ java.nio.ByteBuffer newInternalNioBuffer(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r1 = r0.newInternalNioBuffer2(r1)
            return r1
    }

    /* renamed from: newInternalNioBuffer, reason: avoid collision after fix types in other method */
    protected java.nio.ByteBuffer newInternalNioBuffer2(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = r1.duplicate()
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.checkReadableBytes(r4)
            int r0 = r2.readerIndex
            r1 = 1
            r2.getBytes(r0, r3, r4, r1)
            int r3 = r2.readerIndex
            int r3 = r3 + r4
            r2.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r3.checkReadableBytes(r0)
            int r1 = r3.readerIndex
            r2 = 0
            java.nio.ByteBuffer r1 = r3._internalNioBuffer(r1, r0, r2)
            r4.put(r1)
            int r4 = r3.readerIndex
            int r4 = r4 + r0
            r3.readerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r3.length
            r2.checkDstIndex(r5, r4, r0)
            int r0 = r2.readerIndex
            r1 = 0
            java.nio.ByteBuffer r0 = r2._internalNioBuffer(r0, r5, r1)
            r0.get(r3, r4, r5)
            int r3 = r2.readerIndex
            int r3 = r3 + r5
            r2.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r4, java.io.InputStream r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.checkIndex(r4, r6)
            byte[] r0 = io.netty.buffer.ByteBufUtil.threadLocalTempArray(r6)
            r1 = 0
            int r5 = r5.read(r0, r1, r6)
            if (r5 > 0) goto Lf
            return r5
        Lf:
            java.nio.ByteBuffer r6 = r3.internalNioBuffer()
            java.nio.Buffer r2 = r6.clear()
            int r4 = r3.idx(r4)
            r2.position(r4)
            r6.put(r0, r1, r5)
            return r5
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, io.netty.buffer.ByteBuf r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.capacity()
            r2.checkSrcIndex(r3, r6, r5, r0)
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L1a
            byte[] r0 = r4.array()
            int r4 = r4.arrayOffset()
            int r4 = r4 + r5
            r2.setBytes(r3, r0, r4, r6)
            return r2
        L1a:
            int r0 = r4.nioBufferCount()
            if (r0 <= 0) goto L36
            java.nio.ByteBuffer[] r4 = r4.nioBuffers(r5, r6)
            int r5 = r4.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L35
            r0 = r4[r6]
            int r1 = r0.remaining()
            r2.setBytes(r3, r0)
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L26
        L35:
            return r2
        L36:
            r4.getBytes(r5, r2, r3, r6)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            int r0 = r5.remaining()
            r3.checkIndex(r4, r0)
            java.nio.ByteBuffer r1 = r3.internalNioBuffer()
            if (r5 != r1) goto L11
            java.nio.ByteBuffer r5 = r5.duplicate()
        L11:
            int r4 = r3.idx(r4)
            java.nio.Buffer r2 = r1.clear()
            java.nio.Buffer r2 = r2.position(r4)
            int r4 = r4 + r0
            r2.limit(r4)
            r1.put(r5)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkSrcIndex(r2, r5, r4, r0)
            r0 = 0
            java.nio.ByteBuffer r2 = r1._internalNioBuffer(r2, r5, r0)
            r2.put(r3, r4, r5)
            return r1
    }
}
