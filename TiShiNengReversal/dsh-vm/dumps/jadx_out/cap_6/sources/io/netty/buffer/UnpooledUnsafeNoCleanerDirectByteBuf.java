package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class UnpooledUnsafeNoCleanerDirectByteBuf extends io.netty.buffer.UnpooledUnsafeDirectByteBuf {
    UnpooledUnsafeNoCleanerDirectByteBuf(io.netty.buffer.ByteBufAllocator r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    protected java.nio.ByteBuffer allocateDirect(int r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent.allocateDirectNoCleaner(r1)
            return r1
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r3) {
            r2 = this;
            r2.checkNewCapacity(r3)
            int r0 = r2.capacity()
            if (r3 != r0) goto La
            return r2
        La:
            java.nio.ByteBuffer r1 = r2.buffer
            java.nio.ByteBuffer r1 = r2.reallocateDirect(r1, r3)
            if (r3 >= r0) goto L25
            int r0 = r2.readerIndex()
            if (r0 >= r3) goto L22
            int r0 = r2.writerIndex()
            if (r0 <= r3) goto L25
            r2.writerIndex(r3)
            goto L25
        L22:
            r2.setIndex(r3, r3)
        L25:
            r3 = 0
            r2.setByteBuffer(r1, r3)
            return r2
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    protected void freeDirect(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.util.internal.PlatformDependent.freeDirectNoCleaner(r1)
            return
    }

    java.nio.ByteBuffer reallocateDirect(java.nio.ByteBuffer r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = io.netty.util.internal.PlatformDependent.reallocateDirectNoCleaner(r1, r2)
            return r1
    }
}
