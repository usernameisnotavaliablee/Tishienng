package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PooledUnsafeDirectByteBuf extends io.netty.buffer.PooledByteBuf<java.nio.ByteBuffer> {
    private static final io.netty.util.Recycler<io.netty.buffer.PooledUnsafeDirectByteBuf> RECYCLER = null;
    private long memoryAddress;


    static {
            io.netty.buffer.PooledUnsafeDirectByteBuf$1 r0 = new io.netty.buffer.PooledUnsafeDirectByteBuf$1
            r0.<init>()
            io.netty.buffer.PooledUnsafeDirectByteBuf.RECYCLER = r0
            return
    }

    private PooledUnsafeDirectByteBuf(io.netty.util.Recycler.Handle<io.netty.buffer.PooledUnsafeDirectByteBuf> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ PooledUnsafeDirectByteBuf(io.netty.util.Recycler.Handle r1, int r2, io.netty.buffer.PooledUnsafeDirectByteBuf.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private long addr(int r5) {
            r4 = this;
            long r0 = r4.memoryAddress
            long r2 = (long) r5
            long r0 = r0 + r2
            return r0
    }

    private void initMemoryAddress() {
            r4 = this;
            T r0 = r4.memory
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r0)
            int r2 = r4.offset
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.memoryAddress = r0
            return
    }

    static io.netty.buffer.PooledUnsafeDirectByteBuf newInstance(int r1) {
            io.netty.util.Recycler<io.netty.buffer.PooledUnsafeDirectByteBuf> r0 = io.netty.buffer.PooledUnsafeDirectByteBuf.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PooledUnsafeDirectByteBuf r0 = (io.netty.buffer.PooledUnsafeDirectByteBuf) r0
            r0.reuse(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            byte r3 = io.netty.buffer.UnsafeByteBufUtil.getByte(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getInt(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getIntLE(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLong(r0)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLongLE(r0)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            short r3 = io.netty.buffer.UnsafeByteBufUtil.getShort(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            short r3 = io.netty.buffer.UnsafeByteBufUtil.getShortLE(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMedium(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMediumLE(r0)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            byte r3 = (byte) r4
            io.netty.buffer.UnsafeByteBufUtil.setByte(r0, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setInt(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setIntLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r3, long r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setLong(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r3, long r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setLongLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setMedium(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setMediumLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setShort(r0, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setShortLE(r0, r4)
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
            long r0 = r2.addr(r3)
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.UnsafeByteBufUtil.copy(r2, r0, r3, r4)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            r7 = this;
            long r1 = r7.addr(r8)
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r0, r1, r3, r4, r5, r6)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r7, java.io.OutputStream r8, int r9) throws java.io.IOException {
            r6 = this;
            long r1 = r6.addr(r7)
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r0, r1, r3, r4, r5)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r2, r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
            long r1 = r7.addr(r8)
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r0, r1, r3, r4, r5, r6)
            return r0
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
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.PooledByteBuf
    void init(io.netty.buffer.PoolChunk<java.nio.ByteBuffer> r1, java.nio.ByteBuffer r2, long r3, int r5, int r6, int r7, io.netty.buffer.PoolThreadCache r8) {
            r0 = this;
            super.init(r1, r2, r3, r5, r6, r7, r8)
            r0.initMemoryAddress()
            return
    }

    @Override // io.netty.buffer.PooledByteBuf
    void initUnpooled(io.netty.buffer.PoolChunk<java.nio.ByteBuffer> r1, int r2) {
            r0 = this;
            super.initUnpooled(r1, r2)
            r0.initMemoryAddress()
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            r2.ensureAccessible()
            long r0 = r2.memoryAddress
            return r0
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

    @Override // io.netty.buffer.AbstractByteBuf
    protected io.netty.buffer.SwappedByteBuf newSwappedByteBuf() {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.isUnaligned()
            if (r0 == 0) goto Lc
            io.netty.buffer.UnsafeDirectSwappedByteBuf r0 = new io.netty.buffer.UnsafeDirectSwappedByteBuf
            r0.<init>(r1)
            return r0
        Lc:
            io.netty.buffer.SwappedByteBuf r0 = super.newSwappedByteBuf()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r7, java.io.InputStream r8, int r9) throws java.io.IOException {
            r6 = this;
            long r1 = r6.addr(r7)
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            int r7 = io.netty.buffer.UnsafeByteBufUtil.setBytes(r0, r1, r3, r4, r5)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            r7 = this;
            long r1 = r7.addr(r8)
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.netty.buffer.UnsafeByteBufUtil.setBytes(r0, r1, r3, r4, r5, r6)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setBytes(r2, r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
            long r1 = r7.addr(r8)
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.netty.buffer.UnsafeByteBufUtil.setBytes(r0, r1, r3, r4, r5, r6)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r3, int r4) {
            r2 = this;
            r2.checkIndex(r3, r4)
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setZero(r0, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r4) {
            r3 = this;
            r3.ensureWritable(r4)
            int r0 = r3.writerIndex
            long r1 = r3.addr(r0)
            io.netty.buffer.UnsafeByteBufUtil.setZero(r1, r4)
            int r0 = r0 + r4
            r3.writerIndex = r0
            return r3
    }
}
