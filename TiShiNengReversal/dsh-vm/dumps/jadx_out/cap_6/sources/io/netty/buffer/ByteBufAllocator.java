package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ByteBufAllocator {
    public static final io.netty.buffer.ByteBufAllocator DEFAULT = null;

    static {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.ByteBufUtil.DEFAULT_ALLOCATOR
            io.netty.buffer.ByteBufAllocator.DEFAULT = r0
            return
    }

    io.netty.buffer.ByteBuf buffer();

    io.netty.buffer.ByteBuf buffer(int r1);

    io.netty.buffer.ByteBuf buffer(int r1, int r2);

    int calculateNewCapacity(int r1, int r2);

    io.netty.buffer.CompositeByteBuf compositeBuffer();

    io.netty.buffer.CompositeByteBuf compositeBuffer(int r1);

    io.netty.buffer.CompositeByteBuf compositeDirectBuffer();

    io.netty.buffer.CompositeByteBuf compositeDirectBuffer(int r1);

    io.netty.buffer.CompositeByteBuf compositeHeapBuffer();

    io.netty.buffer.CompositeByteBuf compositeHeapBuffer(int r1);

    io.netty.buffer.ByteBuf directBuffer();

    io.netty.buffer.ByteBuf directBuffer(int r1);

    io.netty.buffer.ByteBuf directBuffer(int r1, int r2);

    io.netty.buffer.ByteBuf heapBuffer();

    io.netty.buffer.ByteBuf heapBuffer(int r1);

    io.netty.buffer.ByteBuf heapBuffer(int r1, int r2);

    io.netty.buffer.ByteBuf ioBuffer();

    io.netty.buffer.ByteBuf ioBuffer(int r1);

    io.netty.buffer.ByteBuf ioBuffer(int r1, int r2);

    boolean isDirectBufferPooled();
}
