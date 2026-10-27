package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PreferredDirectByteBufAllocator implements io.netty.buffer.ByteBufAllocator {
    private io.netty.buffer.ByteBufAllocator allocator;

    public PreferredDirectByteBufAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r0 = r0.directBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf buffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public int calculateNewCapacity(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            int r2 = r0.calculateNewCapacity(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r0 = r0.compositeDirectBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r2 = r0.compositeDirectBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeDirectBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r0 = r0.compositeDirectBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeDirectBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r2 = r0.compositeDirectBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeHeapBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r0 = r0.compositeHeapBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.CompositeByteBuf compositeHeapBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.CompositeByteBuf r2 = r0.compositeHeapBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r0 = r0.directBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf directBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.heapBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf heapBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.heapBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r0 = r0.directBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public io.netty.buffer.ByteBuf ioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            boolean r0 = r0.isDirectBufferPooled()
            return r0
    }

    public void updateAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            r0.allocator = r1
            return
    }
}
