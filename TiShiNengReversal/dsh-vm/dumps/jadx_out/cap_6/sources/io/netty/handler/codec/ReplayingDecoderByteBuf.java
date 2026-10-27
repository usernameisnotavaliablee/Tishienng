package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ReplayingDecoderByteBuf extends io.netty.buffer.ByteBuf {
    static final io.netty.handler.codec.ReplayingDecoderByteBuf EMPTY_BUFFER = null;
    private static final io.netty.util.Signal REPLAY = null;
    private io.netty.buffer.ByteBuf buffer;
    private io.netty.buffer.SwappedByteBuf swapped;
    private boolean terminated;

    static {
            io.netty.util.Signal r0 = io.netty.handler.codec.ReplayingDecoder.REPLAY
            io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY = r0
            io.netty.handler.codec.ReplayingDecoderByteBuf r0 = new io.netty.handler.codec.ReplayingDecoderByteBuf
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1)
            io.netty.handler.codec.ReplayingDecoderByteBuf.EMPTY_BUFFER = r0
            r0.terminate()
            return
    }

    ReplayingDecoderByteBuf() {
            r0 = this;
            r0.<init>()
            return
    }

    ReplayingDecoderByteBuf(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>()
            r0.setCumulation(r1)
            return
    }

    private void checkIndex(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            io.netty.buffer.ByteBuf r2 = r0.buffer
            int r2 = r2.writerIndex()
            if (r1 > r2) goto La
            return
        La:
            io.netty.util.Signal r1 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r1
    }

    private void checkReadableBytes(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readableBytes()
            if (r0 < r2) goto L9
            return
        L9:
            io.netty.util.Signal r2 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r2
    }

    private static java.lang.UnsupportedOperationException reject() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not a replayable operation"
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unmodifiableBuffer(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(byte r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.bytesBefore(r2)
            if (r2 < 0) goto L9
            return r2
        L9:
            io.netty.util.Signal r2 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, byte r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readerIndex()
            int r2 = r1.bytesBefore(r0, r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r3, int r4, byte r5) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.writerIndex()
            if (r3 >= r0) goto L20
            int r1 = r0 - r4
            if (r3 > r1) goto L13
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r3 = r0.bytesBefore(r3, r4, r5)
            return r3
        L13:
            io.netty.buffer.ByteBuf r4 = r2.buffer
            int r0 = r0 - r3
            int r3 = r4.bytesBefore(r3, r0, r5)
            if (r3 < 0) goto L1d
            return r3
        L1d:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
        L20:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.capacity()
            return r0
        Lb:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int compareTo(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int ensureWritable(int r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(int r3, int r4, io.netty.util.ByteProcessor r5) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.writerIndex()
            if (r3 >= r0) goto L20
            int r1 = r0 - r4
            if (r3 > r1) goto L13
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r3 = r0.forEachByte(r3, r4, r5)
            return r3
        L13:
            io.netty.buffer.ByteBuf r4 = r2.buffer
            int r0 = r0 - r3
            int r3 = r4.forEachByte(r3, r0, r5)
            if (r3 < 0) goto L1d
            return r3
        L1d:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
        L20:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.forEachByte(r2)
            if (r2 < 0) goto L9
            return r2
        L9:
            io.netty.util.Signal r2 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r3, int r4, io.netty.util.ByteProcessor r5) {
            r2 = this;
            int r0 = r3 + r4
            io.netty.buffer.ByteBuf r1 = r2.buffer
            int r1 = r1.writerIndex()
            if (r0 > r1) goto L11
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r3 = r0.forEachByteDesc(r3, r4, r5)
            return r3
        L11:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r2) {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.forEachByteDesc(r2)
            return r2
        Lb:
            java.lang.UnsupportedOperationException r2 = reject()
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean getBoolean(int r2) {
            r1 = this;
            r0 = 1
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            r0 = 1
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3) {
            r1 = this;
            int r0 = r3.length
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char getChar(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            char r2 = r0.getChar(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.lang.CharSequence r2 = r0.getCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float getFloat(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r2) {
            r1 = this;
            r0 = 1
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r2 = r0.getUnsignedByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r3) {
            r2 = this;
            r0 = 4
            r2.checkIndex(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.getUnsignedInt(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r3) {
            r2 = this;
            r0 = 4
            r2.checkIndex(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.getUnsignedIntLE(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getUnsignedShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r2 = r0.getUnsignedShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int hashCode() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int indexOf(int r3, int r4, byte r5) {
            r2 = this;
            if (r3 != r4) goto L4
            r3 = -1
            return r3
        L4:
            int r0 = java.lang.Math.max(r3, r4)
            io.netty.buffer.ByteBuf r1 = r2.buffer
            int r1 = r1.writerIndex()
            if (r0 > r1) goto L17
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r3 = r0.indexOf(r3, r4, r5)
            return r3
        L17:
            io.netty.util.Signal r3 = io.netty.handler.codec.ReplayingDecoderByteBuf.REPLAY
            throw r3
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.nio.ByteBuffer r2 = r0.internalNioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable() {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 == 0) goto Lf
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r0 = r0.isReadable()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable(int r2) {
            r1 = this;
            boolean r0 = r1.terminated
            if (r0 == 0) goto Lf
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r2 = r0.isReadable(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.markReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxCapacity() {
            r1 = this;
            int r0 = r1.capacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxWritableBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.nio.ByteBuffer[] r2 = r0.nioBuffers(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.nio.ByteOrder r0 = r1.order()
            if (r2 != r0) goto L9
            return r1
        L9:
            io.netty.buffer.SwappedByteBuf r2 = r1.swapped
            if (r2 != 0) goto L14
            io.netty.buffer.SwappedByteBuf r2 = new io.netty.buffer.SwappedByteBuf
            r2.<init>(r1)
            r1.swapped = r2
        L14:
            return r2
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "endianness"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteOrder order() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.nio.ByteOrder r0 = r0.order()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean readBoolean() {
            r1 = this;
            r0 = 1
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte readByte() {
            r1 = this;
            r0 = 1
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            byte r0 = r0.readByte()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r1, long r2, int r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r2) {
            r1 = this;
            r1.checkReadableBytes(r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.writableBytes()
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            r1.checkReadableBytes(r4)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.checkReadableBytes(r4)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            r0 = 2
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            char r0 = r0.readChar()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r2, java.nio.charset.Charset r3) {
            r1 = this;
            r1.checkReadableBytes(r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.lang.CharSequence r2 = r0.readCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public double readDouble() {
            r2 = this;
            r0 = 8
            r2.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            double r0 = r0.readDouble()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            r0 = 4
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            float r0 = r0.readFloat()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            r0 = 4
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readInt()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            r0 = 4
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readIntLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLong() {
            r2 = this;
            r0 = 8
            r2.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.readLong()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLongLE() {
            r2 = this;
            r0 = 8
            r2.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.readLongLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            r0 = 3
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readMedium()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            r0 = 3
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readMediumLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r2) {
            r1 = this;
            r1.checkReadableBytes(r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.readRetainedSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            r0 = 2
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r0 = r0.readShort()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            r0 = 2
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r0 = r0.readShortLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r2) {
            r1 = this;
            r1.checkReadableBytes(r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.readSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            r0 = 1
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r0 = r0.readUnsignedByte()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r2 = this;
            r0 = 4
            r2.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.readUnsignedInt()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r2 = this;
            r0 = 4
            r2.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.readUnsignedIntLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r1 = this;
            r0 = 3
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readUnsignedMedium()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r1 = this;
            r0 = 3
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readUnsignedMediumLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r1 = this;
            r0 = 2
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readUnsignedShort()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r1 = this;
            r0 = 2
            r1.checkReadableBytes(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readUnsignedShortLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readableBytes() {
            r2 = this;
            boolean r0 = r2.terminated
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.readableBytes()
            return r0
        Lb:
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.readerIndex()
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r1 - r0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readerIndex(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readerIndex(r2)
            return r1
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    public boolean release(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.resetReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetWriterIndex() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.io.InputStream r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setCharSequence(int r1, java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    void setCumulation(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.buffer = r1
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIndex(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf skipBytes(int r2) {
            r1 = this;
            r1.checkReadableBytes(r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.skipBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            return r2
    }

    void terminate() {
            r1 = this;
            r0 = 1
            r1.terminated = r0
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = "ridx="
            r0.append(r1)
            int r1 = r2.readerIndex()
            r0.append(r1)
            java.lang.String r1 = ", widx="
            r0.append(r1)
            int r1 = r2.writerIndex()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            java.lang.String r2 = r0.toString(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.touch()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.touch(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = reject()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int writableBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBoolean(boolean r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeByte(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r1, long r2, int r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.writerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writerIndex(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = reject()
            throw r1
    }
}
