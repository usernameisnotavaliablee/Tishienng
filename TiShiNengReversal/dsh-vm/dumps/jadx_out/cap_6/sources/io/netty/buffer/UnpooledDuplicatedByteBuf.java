package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class UnpooledDuplicatedByteBuf extends io.netty.buffer.DuplicatedByteBuf {
    UnpooledDuplicatedByteBuf(io.netty.buffer.AbstractByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            byte r2 = r0._getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            int r2 = r0._getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            int r2 = r0._getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.unwrap()
            long r0 = r0._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.unwrap()
            long r0 = r0._getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            short r2 = r0._getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            short r2 = r0._getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            int r2 = r0._getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            int r2 = r0._getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setByte(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setIntLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setLongLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setMedium(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setMediumLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            r0._setShortLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.AbstractByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.unwrap()
            io.netty.buffer.AbstractByteBuf r0 = (io.netty.buffer.AbstractByteBuf) r0
            return r0
    }

    @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            return r0
    }
}
