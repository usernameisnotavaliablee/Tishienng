package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnpooledUnsafeHeapByteBuf extends io.netty.buffer.UnpooledHeapByteBuf {
    public UnpooledUnsafeHeapByteBuf(io.netty.buffer.ByteBufAllocator r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            byte r2 = io.netty.buffer.UnsafeByteBufUtil.getByte(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getInt(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getIntLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            byte[] r0 = r2.array
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLong(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            byte[] r0 = r2.array
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLongLE(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            short r2 = io.netty.buffer.UnsafeByteBufUtil.getShort(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            short r2 = io.netty.buffer.UnsafeByteBufUtil.getShortLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMedium(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMediumLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setByte(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setInt(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setIntLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setLong(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setLongLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setMedium(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setMediumLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setShort(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.UnsafeByteBufUtil.setShortLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf
    protected byte[] allocateArray(int r1) {
            r0 = this;
            byte[] r1 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r1)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            r0.checkIndex(r1)
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            int r2 = r1._getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            int r2 = r1._getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            long r0 = r2._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            long r0 = r2._getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            short r2 = r1._getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            short r2 = r1._getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            int r2 = r1._getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            int r2 = r1._getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    @java.lang.Deprecated
    protected io.netty.buffer.SwappedByteBuf newSwappedByteBuf() {
            r1 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.isUnaligned()
            if (r0 == 0) goto Lc
            io.netty.buffer.UnsafeHeapSwappedByteBuf r0 = new io.netty.buffer.UnsafeHeapSwappedByteBuf
            r0.<init>(r1)
            return r0
        Lc:
            io.netty.buffer.SwappedByteBuf r0 = super.newSwappedByteBuf()
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1)
            r0._setByte(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setIntLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLongLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMediumLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.UnpooledHeapByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShortLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r3, int r4) {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L10
            r2.checkIndex(r3, r4)
            byte[] r0 = r2.array
            io.netty.buffer.UnsafeByteBufUtil.setZero(r0, r3, r4)
            return r2
        L10:
            io.netty.buffer.ByteBuf r3 = super.setZero(r3, r4)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r3) {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L15
            r2.ensureWritable(r3)
            int r0 = r2.writerIndex
            byte[] r1 = r2.array
            io.netty.buffer.UnsafeByteBufUtil.setZero(r1, r0, r3)
            int r0 = r0 + r3
            r2.writerIndex = r0
            return r2
        L15:
            io.netty.buffer.ByteBuf r3 = super.writeZero(r3)
            return r3
    }
}
