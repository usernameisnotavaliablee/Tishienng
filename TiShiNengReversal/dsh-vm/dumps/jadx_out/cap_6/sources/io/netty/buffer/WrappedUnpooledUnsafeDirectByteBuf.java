package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class WrappedUnpooledUnsafeDirectByteBuf extends io.netty.buffer.UnpooledUnsafeDirectByteBuf {
    WrappedUnpooledUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r1, long r2, int r4, boolean r5) {
            r0 = this;
            java.nio.ByteBuffer r2 = io.netty.util.internal.PlatformDependent.directBuffer(r2, r4)
            r0.<init>(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    protected void freeDirect(java.nio.ByteBuffer r3) {
            r2 = this;
            long r0 = r2.memoryAddress
            io.netty.util.internal.PlatformDependent.freeMemory(r0)
            return
    }
}
