package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class PooledUnsafeHeapByteBuf extends io.netty.buffer.PooledHeapByteBuf {
    private static final io.netty.util.Recycler<io.netty.buffer.PooledUnsafeHeapByteBuf> RECYCLER = null;


    static {
            io.netty.buffer.PooledUnsafeHeapByteBuf$1 r0 = new io.netty.buffer.PooledUnsafeHeapByteBuf$1
            r0.<init>()
            io.netty.buffer.PooledUnsafeHeapByteBuf.RECYCLER = r0
            return
    }

    private PooledUnsafeHeapByteBuf(io.netty.util.Recycler.Handle<io.netty.buffer.PooledUnsafeHeapByteBuf> r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ PooledUnsafeHeapByteBuf(io.netty.util.Recycler.Handle r1, int r2, io.netty.buffer.PooledUnsafeHeapByteBuf.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static io.netty.buffer.PooledUnsafeHeapByteBuf newUnsafeInstance(int r1) {
            io.netty.util.Recycler<io.netty.buffer.PooledUnsafeHeapByteBuf> r0 = io.netty.buffer.PooledUnsafeHeapByteBuf.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.buffer.PooledUnsafeHeapByteBuf r0 = (io.netty.buffer.PooledUnsafeHeapByteBuf) r0
            r0.reuse(r1)
            return r0
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            byte r2 = io.netty.buffer.UnsafeByteBufUtil.getByte(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getInt(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getIntLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            T r0 = r2.memory
            byte[] r0 = (byte[]) r0
            int r3 = r2.idx(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLong(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            T r0 = r2.memory
            byte[] r0 = (byte[]) r0
            int r3 = r2.idx(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLongLE(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            short r2 = io.netty.buffer.UnsafeByteBufUtil.getShort(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            short r2 = io.netty.buffer.UnsafeByteBufUtil.getShortLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMedium(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            int r2 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMediumLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setByte(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setInt(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setIntLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setLong(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setLongLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setMedium(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setMediumLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setShort(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.PooledHeapByteBuf, io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            T r0 = r1.memory
            byte[] r0 = (byte[]) r0
            int r2 = r1.idx(r2)
            io.netty.buffer.UnsafeByteBufUtil.setShortLE(r0, r2, r3)
            return
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

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r3, int r4) {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L16
            r2.checkIndex(r3, r4)
            T r0 = r2.memory
            byte[] r0 = (byte[]) r0
            int r3 = r2.idx(r3)
            io.netty.buffer.UnsafeByteBufUtil.setZero(r0, r3, r4)
            return r2
        L16:
            io.netty.buffer.ByteBuf r3 = super.setZero(r3, r4)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r4) {
            r3 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L1b
            r3.ensureWritable(r4)
            int r0 = r3.writerIndex
            T r1 = r3.memory
            byte[] r1 = (byte[]) r1
            int r2 = r3.idx(r0)
            io.netty.buffer.UnsafeByteBufUtil.setZero(r1, r2, r4)
            int r0 = r0 + r4
            r3.writerIndex = r0
            return r3
        L1b:
            io.netty.buffer.ByteBuf r4 = super.writeZero(r4)
            return r4
    }
}
