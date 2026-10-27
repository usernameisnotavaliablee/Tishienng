package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnpooledUnsafeDirectByteBuf extends io.netty.buffer.UnpooledDirectByteBuf {
    long memoryAddress;

    public UnpooledUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    protected UnpooledUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r7, java.nio.ByteBuffer r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    UnpooledUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r7, java.nio.ByteBuffer r8, int r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            byte r3 = io.netty.buffer.UnsafeByteBufUtil.getByte(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getInt(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getIntLE(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLong(r0)
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLongLE(r0)
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            short r3 = io.netty.buffer.UnsafeByteBufUtil.getShort(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            short r3 = io.netty.buffer.UnsafeByteBufUtil.getShortLE(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMedium(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMediumLE(r0)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setByte(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setInt(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setIntLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r3, long r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setLong(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r3, long r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setLongLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setMedium(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setMediumLE(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setShort(r0, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setShortLE(r0, r4)
            return
    }

    final long addr(int r5) {
            r4 = this;
            long r0 = r4.memoryAddress
            long r2 = (long) r5
            long r0 = r0 + r2
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r3, int r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.UnsafeByteBufUtil.copy(r2, r0, r3, r4)
            return r3
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            r0.checkIndex(r1)
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
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

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    void getBytes(int r7, java.io.OutputStream r8, int r9, boolean r10) throws java.io.IOException {
            r6 = this;
            long r1 = r6.addr(r7)
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r0, r1, r3, r4, r5)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    void getBytes(int r3, java.nio.ByteBuffer r4, boolean r5) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r2, r0, r3, r4)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    void getBytes(int r8, byte[] r9, int r10, int r11, boolean r12) {
            r7 = this;
            long r1 = r7.addr(r8)
            r0 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            io.netty.buffer.UnsafeByteBufUtil.getBytes(r0, r1, r3, r4, r5, r6)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            int r2 = r1._getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            long r0 = r2._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            short r2 = r1._getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            int r2 = r1._getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            r2.ensureAccessible()
            long r0 = r2.memoryAddress
            return r0
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

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1)
            r0._setByte(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    final void setByteBuffer(java.nio.ByteBuffer r1, boolean r2) {
            r0 = this;
            super.setByteBuffer(r1, r2)
            long r1 = io.netty.util.internal.PlatformDependent.directBufferAddress(r1)
            r0.memoryAddress = r1
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
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

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
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

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            long r0 = r2.addr(r3)
            io.netty.buffer.UnsafeByteBufUtil.setBytes(r2, r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
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

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShort(r2, r3)
            return r1
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
