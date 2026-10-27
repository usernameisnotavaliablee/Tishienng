package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class UnsafeDirectSwappedByteBuf extends io.netty.buffer.AbstractUnsafeSwappedByteBuf {
    UnsafeDirectSwappedByteBuf(io.netty.buffer.AbstractByteBuf r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static long addr(io.netty.buffer.AbstractByteBuf r2, int r3) {
            long r0 = r2.memoryAddress()
            long r2 = (long) r3
            long r0 = r0 + r2
            return r0
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected int _getInt(io.netty.buffer.AbstractByteBuf r1, int r2) {
            r0 = this;
            long r1 = addr(r1, r2)
            int r1 = io.netty.util.internal.PlatformDependent.getInt(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected long _getLong(io.netty.buffer.AbstractByteBuf r1, int r2) {
            r0 = this;
            long r1 = addr(r1, r2)
            long r1 = io.netty.util.internal.PlatformDependent.getLong(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected short _getShort(io.netty.buffer.AbstractByteBuf r1, int r2) {
            r0 = this;
            long r1 = addr(r1, r2)
            short r1 = io.netty.util.internal.PlatformDependent.getShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setInt(io.netty.buffer.AbstractByteBuf r1, int r2, int r3) {
            r0 = this;
            long r1 = addr(r1, r2)
            io.netty.util.internal.PlatformDependent.putInt(r1, r3)
            return
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setLong(io.netty.buffer.AbstractByteBuf r1, int r2, long r3) {
            r0 = this;
            long r1 = addr(r1, r2)
            io.netty.util.internal.PlatformDependent.putLong(r1, r3)
            return
    }

    @Override // io.netty.buffer.AbstractUnsafeSwappedByteBuf
    protected void _setShort(io.netty.buffer.AbstractByteBuf r1, int r2, short r3) {
            r0 = this;
            long r1 = addr(r1, r2)
            io.netty.util.internal.PlatformDependent.putShort(r1, r3)
            return
    }
}
