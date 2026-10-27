package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class UnsafeHeapSwappedByteBuf extends io.netty.buffer.AbstractUnsafeSwappedByteBuf {
    UnsafeHeapSwappedByteBuf(io.netty.buffer.AbstractByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static int idx(io.netty.buffer.ByteBuf r0, int r1) {
            int r0 = r0.arrayOffset()
            int r0 = r0 + r1
            return r0
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected int _getInt(io.netty.buffer.AbstractByteBuf r2, int r3) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            int r2 = io.netty.util.internal.PlatformDependent.getInt(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected long _getLong(io.netty.buffer.AbstractByteBuf r2, int r3) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            long r2 = io.netty.util.internal.PlatformDependent.getLong(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected short _getShort(io.netty.buffer.AbstractByteBuf r2, int r3) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            short r2 = io.netty.util.internal.PlatformDependent.getShort(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setInt(io.netty.buffer.AbstractByteBuf r2, int r3, int r4) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            io.netty.util.internal.PlatformDependent.putInt(r0, r2, r4)
            return
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setLong(io.netty.buffer.AbstractByteBuf r2, int r3, long r4) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            io.netty.util.internal.PlatformDependent.putLong(r0, r2, r4)
            return
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setShort(io.netty.buffer.AbstractByteBuf r2, int r3, short r4) {
            r1 = this;
            byte[] r0 = r2.array()
            int r2 = idx(r2, r3)
            io.netty.util.internal.PlatformDependent.putShort(r0, r2, r4)
            return
    }
}
