package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractUnsafeSwappedByteBuf extends io.netty.buffer.SwappedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean nativeByteOrder;
    private final io.netty.buffer.AbstractByteBuf wrapped;

    static {
            return
    }

    AbstractUnsafeSwappedByteBuf(io.netty.buffer.AbstractByteBuf r5) {
            r4 = this;
            r4.<init>(r5)
            r4.wrapped = r5
            boolean r5 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            java.nio.ByteOrder r0 = r4.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r5 != r0) goto L17
            r2 = 1
        L17:
            r4.nativeByteOrder = r2
            return
    }

    protected abstract int _getInt(io.netty.buffer.AbstractByteBuf r1, int r2);

    protected abstract long _getLong(io.netty.buffer.AbstractByteBuf r1, int r2);

    protected abstract short _getShort(io.netty.buffer.AbstractByteBuf r1, int r2);

    protected abstract void _setInt(io.netty.buffer.AbstractByteBuf r1, int r2, int r3);

    protected abstract void _setLong(io.netty.buffer.AbstractByteBuf r1, int r2, long r3);

    protected abstract void _setShort(io.netty.buffer.AbstractByteBuf r1, int r2, short r3);

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final char getChar(int r1) {
            r0 = this;
            short r1 = r0.getShort(r1)
            char r1 = (char) r1
            return r1
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final double getDouble(int r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final float getFloat(int r1) {
            r0 = this;
            int r1 = r0.getInt(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final int getInt(int r3) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 4
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            int r3 = r2._getInt(r0, r3)
            boolean r0 = r2.nativeByteOrder
            if (r0 == 0) goto L11
            return r3
        L11:
            int r3 = java.lang.Integer.reverseBytes(r3)
            return r3
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final long getLong(int r3) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 8
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            long r0 = r2._getLong(r0, r3)
            boolean r3 = r2.nativeByteOrder
            if (r3 == 0) goto L12
            return r0
        L12:
            long r0 = java.lang.Long.reverseBytes(r0)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final short getShort(int r3) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 2
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            short r3 = r2._getShort(r0, r3)
            boolean r0 = r2.nativeByteOrder
            if (r0 == 0) goto L11
            return r3
        L11:
            short r3 = java.lang.Short.reverseBytes(r3)
            return r3
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final long getUnsignedInt(int r5) {
            r4 = this;
            int r5 = r4.getInt(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final int getUnsignedShort(int r2) {
            r1 = this;
            short r2 = r1.getShort(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            r0.setShort(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.setLong(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.setInt(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setInt(int r3, int r4) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 4
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            boolean r1 = r2.nativeByteOrder
            if (r1 == 0) goto Ld
            goto L11
        Ld:
            int r4 = java.lang.Integer.reverseBytes(r4)
        L11:
            r2._setInt(r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setLong(int r3, long r4) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 8
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            boolean r1 = r2.nativeByteOrder
            if (r1 == 0) goto Le
            goto L12
        Le:
            long r4 = java.lang.Long.reverseBytes(r4)
        L12:
            r2._setLong(r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf setShort(int r3, int r4) {
            r2 = this;
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            r1 = 2
            r0.checkIndex(r3, r1)
            io.netty.buffer.AbstractByteBuf r0 = r2.wrapped
            boolean r1 = r2.nativeByteOrder
            short r4 = (short) r4
            if (r1 == 0) goto Le
            goto L12
        Le:
            short r4 = java.lang.Short.reverseBytes(r4)
        L12:
            r2._setShort(r0, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            r0.writeShort(r1)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeLong(r1)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.writeInt(r1)
            return r0
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeInt(int r5) {
            r4 = this;
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            r1 = 4
            r0.ensureWritable0(r1)
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            int r2 = r0.writerIndex
            boolean r3 = r4.nativeByteOrder
            if (r3 == 0) goto Lf
            goto L13
        Lf:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L13:
            r4._setInt(r0, r2, r5)
            io.netty.buffer.AbstractByteBuf r5 = r4.wrapped
            int r0 = r5.writerIndex
            int r0 = r0 + r1
            r5.writerIndex = r0
            return r4
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeLong(long r5) {
            r4 = this;
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            r1 = 8
            r0.ensureWritable0(r1)
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            int r2 = r0.writerIndex
            boolean r3 = r4.nativeByteOrder
            if (r3 == 0) goto L10
            goto L14
        L10:
            long r5 = java.lang.Long.reverseBytes(r5)
        L14:
            r4._setLong(r0, r2, r5)
            io.netty.buffer.AbstractByteBuf r5 = r4.wrapped
            int r6 = r5.writerIndex
            int r6 = r6 + r1
            r5.writerIndex = r6
            return r4
    }

    @Override // io.netty.buffer.SwappedByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writeShort(int r5) {
            r4 = this;
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            r1 = 2
            r0.ensureWritable0(r1)
            io.netty.buffer.AbstractByteBuf r0 = r4.wrapped
            int r2 = r0.writerIndex
            boolean r3 = r4.nativeByteOrder
            short r5 = (short) r5
            if (r3 == 0) goto L10
            goto L14
        L10:
            short r5 = java.lang.Short.reverseBytes(r5)
        L14:
            r4._setShort(r0, r2, r5)
            io.netty.buffer.AbstractByteBuf r5 = r4.wrapped
            int r0 = r5.writerIndex
            int r0 = r0 + r1
            r5.writerIndex = r0
            return r4
    }
}
