package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ReadOnlyUnsafeDirectByteBuf extends io.netty.buffer.ReadOnlyByteBufferBuf {
    private final long memoryAddress;

    ReadOnlyUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.nio.ByteBuffer r1 = r0.buffer
            long r1 = io.netty.util.internal.PlatformDependent.directBufferAddress(r1)
            r0.memoryAddress = r1
            return
    }

    private long addr(int r5) {
            r4 = this;
            long r0 = r4.memoryAddress
            long r2 = (long) r5
            long r0 = r0 + r2
            return r0
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            byte r3 = io.netty.buffer.UnsafeByteBufUtil.getByte(r0)
            return r3
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getInt(r0)
            return r3
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            long r0 = io.netty.buffer.UnsafeByteBufUtil.getLong(r0)
            return r0
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            short r3 = io.netty.buffer.UnsafeByteBufUtil.getShort(r0)
            return r3
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r3) {
            r2 = this;
            long r0 = r2.addr(r3)
            int r3 = io.netty.buffer.UnsafeByteBufUtil.getUnsignedMedium(r0)
            return r3
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r9, int r10) {
            r8 = this;
            r8.checkIndex(r9, r10)
            io.netty.buffer.ByteBufAllocator r0 = r8.alloc()
            int r1 = r8.maxCapacity()
            io.netty.buffer.ByteBuf r0 = r0.directBuffer(r10, r1)
            if (r10 == 0) goto L2b
            boolean r1 = r0.hasMemoryAddress()
            if (r1 == 0) goto L28
            long r2 = r8.addr(r9)
            long r4 = r0.memoryAddress()
            long r6 = (long) r10
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r6)
            r9 = 0
            r0.setIndex(r9, r10)
            return r0
        L28:
            r0.writeBytes(r8, r9, r10)
        L2b:
            return r0
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            r7 = this;
            r7.checkIndex(r8, r11)
            if (r9 == 0) goto L57
            if (r10 < 0) goto L40
            int r0 = r9.capacity()
            int r0 = r0 - r11
            if (r10 > r0) goto L40
            boolean r0 = r9.hasMemoryAddress()
            if (r0 == 0) goto L23
            long r1 = r7.addr(r8)
            long r8 = r9.memoryAddress()
            long r3 = (long) r10
            long r3 = r3 + r8
            long r5 = (long) r11
            io.netty.util.internal.PlatformDependent.copyMemory(r1, r3, r5)
            return r7
        L23:
            boolean r0 = r9.hasArray()
            if (r0 == 0) goto L3c
            long r1 = r7.addr(r8)
            byte[] r3 = r9.array()
            int r8 = r9.arrayOffset()
            int r4 = r8 + r10
            long r5 = (long) r11
            io.netty.util.internal.PlatformDependent.copyMemory(r1, r3, r4, r5)
            return r7
        L3c:
            r9.setBytes(r10, r7, r8, r11)
            return r7
        L40:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "dstIndex: "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L57:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "dst"
            r8.<init>(r9)
            throw r8
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
            r7.checkIndex(r8, r11)
            if (r9 == 0) goto L3f
            if (r10 < 0) goto L18
            int r0 = r9.length
            int r0 = r0 - r11
            if (r10 > r0) goto L18
            if (r11 == 0) goto L17
            long r1 = r7.addr(r8)
            long r5 = (long) r11
            r3 = r9
            r4 = r10
            io.netty.util.internal.PlatformDependent.copyMemory(r1, r3, r4, r5)
        L17:
            return r7
        L18:
            r3 = r9
            r4 = r10
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            int r11 = r3.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r9 = 1
            r0[r9] = r10
            r9 = 2
            r0[r9] = r11
            java.lang.String r9 = "dstIndex: %d, length: %d (expected: range(0, %d))"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "dst"
            r8.<init>(r9)
            throw r8
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ReadOnlyByteBufferBuf, io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            long r0 = r2.memoryAddress
            return r0
    }
}
