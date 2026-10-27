package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SwappedByteBuf extends io.netty.buffer.ByteBuf {
    private final io.netty.buffer.ByteBuf buf;
    private final java.nio.ByteOrder order;

    public SwappedByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L17
            r1.buf = r2
            java.nio.ByteOrder r2 = r2.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r0) goto L14
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order = r2
            return
        L14:
            r1.order = r0
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "buf"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            byte[] r0 = r0.array()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.arrayOffset()
            return r0
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.bytesBefore(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, byte r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.bytesBefore(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.bytesBefore(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.capacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.capacity(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf clear() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.clear()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int compareTo(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            int r1 = io.netty.buffer.ByteBufUtil.compare(r0, r1)
            return r1
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
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            io.netty.buffer.ByteBuf r0 = r0.copy()
            java.nio.ByteOrder r1 = r2.order
            io.netty.buffer.ByteBuf r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            java.nio.ByteOrder r3 = r1.order
            io.netty.buffer.ByteBuf r2 = r2.order(r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.discardReadBytes()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.discardSomeReadBytes()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            java.nio.ByteOrder r1 = r2.order
            io.netty.buffer.ByteBuf r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int ensureWritable(int r2, boolean r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.ensureWritable(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.ensureWritable(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lf
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            boolean r2 = io.netty.buffer.ByteBufUtil.equals(r1, r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.forEachByte(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.forEachByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.forEachByteDesc(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.forEachByteDesc(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean getBoolean(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.ByteBuf r0 = r6.buf
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.getBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char getChar(int r1) {
            r0 = this;
            short r1 = r0.getShort(r1)
            char r1 = (char) r1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.lang.CharSequence r2 = r0.getCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float getFloat(int r1) {
            r0 = this;
            int r1 = r0.getInt(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getInt(r2)
            int r2 = io.netty.buffer.ByteBufUtil.swapInt(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getLong(r3)
            long r0 = io.netty.buffer.ByteBufUtil.swapLong(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getMedium(r2)
            int r2 = io.netty.buffer.ByteBufUtil.swapMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = r0.getShort(r2)
            short r2 = io.netty.buffer.ByteBufUtil.swapShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = r0.getUnsignedByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r5) {
            r4 = this;
            int r5 = r4.getInt(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r5) {
            r4 = this;
            int r5 = r4.getIntLE(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            int r2 = r1.getMedium(r2)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            int r2 = r1.getMediumLE(r2)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            short r2 = r1.getShort(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            short r2 = r1.getShortLE(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.hasArray()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int hashCode() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int indexOf(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.indexOf(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.nioBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    final boolean isAccessible() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isReadable()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.isReadable(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isWritable()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.isWritable(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.markReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.markWriterIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxCapacity() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.maxCapacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxFastWritableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.maxFastWritableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxWritableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.maxWritableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            java.nio.ByteBuffer r0 = r0.nioBuffer()
            java.nio.ByteOrder r1 = r2.order
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            java.nio.ByteOrder r3 = r1.order
            java.nio.ByteBuffer r2 = r2.order(r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r4 = this;
            io.netty.buffer.ByteBuf r0 = r4.buf
            java.nio.ByteBuffer[] r0 = r0.nioBuffers()
            r1 = 0
        L7:
            int r2 = r0.length
            if (r1 >= r2) goto L17
            r2 = r0[r1]
            java.nio.ByteOrder r3 = r4.order
            java.nio.ByteBuffer r2 = r2.order(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L17:
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r3, int r4) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            java.nio.ByteBuffer[] r3 = r0.nioBuffers(r3, r4)
            r4 = 0
        L7:
            int r0 = r3.length
            if (r4 >= r0) goto L17
            r0 = r3[r4]
            java.nio.ByteOrder r1 = r2.order
            java.nio.ByteBuffer r0 = r0.order(r1)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L7
        L17:
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.nio.ByteOrder r0 = r1.order
            if (r2 != r0) goto L7
            return r1
        L7:
            io.netty.buffer.ByteBuf r2 = r1.buf
            return r2
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "endianness"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = r1.order
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean readBoolean() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte readByte() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            byte r0 = r0.readByte()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.readBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.readBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.readBytes(r2)
            java.nio.ByteOrder r0 = r1.order()
            io.netty.buffer.ByteBuf r2 = r2.order(r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            short r0 = r1.readShort()
            char r0 = (char) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.lang.CharSequence r2 = r0.readCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public double readDouble() {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readInt()
            int r0 = io.netty.buffer.ByteBufUtil.swapInt(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readInt()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLong() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readLong()
            long r0 = io.netty.buffer.ByteBufUtil.swapLong(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLongLE() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readLong()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readMedium()
            int r0 = io.netty.buffer.ByteBufUtil.swapMedium(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readMedium()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.readRetainedSlice(r2)
            java.nio.ByteOrder r0 = r1.order
            io.netty.buffer.ByteBuf r2 = r2.order(r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r0 = r0.readShort()
            short r0 = io.netty.buffer.ByteBufUtil.swapShort(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r0 = r0.readShort()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.readSlice(r2)
            java.nio.ByteOrder r0 = r1.order
            io.netty.buffer.ByteBuf r2 = r2.order(r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r0 = r0.readUnsignedByte()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r4 = this;
            int r0 = r4.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r4 = this;
            int r0 = r4.readIntLE()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r2 = this;
            int r0 = r2.readMedium()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r2 = this;
            int r0 = r2.readMediumLE()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r2 = this;
            short r0 = r2.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r2 = this;
            short r0 = r2.readShortLE()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readerIndex(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readerIndex(r2)
            return r1
    }

    public int refCnt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.refCnt()
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.release()
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.resetReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetWriterIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.resetWriterIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.retain()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.retain(r2)
            return r1
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
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            java.nio.ByteOrder r1 = r2.order
            io.netty.buffer.ByteBuf r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            io.netty.buffer.ByteBuf r0 = r0.retainedSlice()
            java.nio.ByteOrder r1 = r2.order
            io.netty.buffer.ByteBuf r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.retainedSlice(r2, r3)
            java.nio.ByteOrder r3 = r1.order
            io.netty.buffer.ByteBuf r2 = r2.order(r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBoolean(int r2, boolean r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBoolean(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setByte(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.ByteBuf r0 = r6.buf
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.setBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.ScatteringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            r0.setShort(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int setCharSequence(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.setCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.setLong(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.setInt(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIndex(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setIndex(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r3 = io.netty.buffer.ByteBufUtil.swapInt(r3)
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            long r3 = io.netty.buffer.ByteBufUtil.swapLong(r3)
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r3 = io.netty.buffer.ByteBufUtil.swapMedium(r3)
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r3 = (short) r3
            short r3 = io.netty.buffer.ByteBufUtil.swapShort(r3)
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r3 = (short) r3
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setZero(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf skipBytes(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.skipBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            io.netty.buffer.ByteBuf r0 = r0.slice()
            java.nio.ByteOrder r1 = r2.order
            io.netty.buffer.ByteBuf r0 = r0.order(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            java.nio.ByteOrder r3 = r1.order
            io.netty.buffer.ByteBuf r2 = r2.order(r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Swapped("
            r0.append(r1)
            io.netty.buffer.ByteBuf r1 = r2.buf
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.lang.String r2 = r0.toString(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.lang.String r2 = r0.toString(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.touch()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int writableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.writableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBoolean(boolean r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBoolean(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeByte(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.writeBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            r0.writeShort(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.writeCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeLong(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.writeInt(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = io.netty.buffer.ByteBufUtil.swapInt(r2)
            r0.writeInt(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeInt(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            long r2 = io.netty.buffer.ByteBufUtil.swapLong(r2)
            r0.writeLong(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeLong(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = io.netty.buffer.ByteBufUtil.swapMedium(r2)
            r0.writeMedium(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeMedium(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = (short) r2
            short r2 = io.netty.buffer.ByteBufUtil.swapShort(r2)
            r0.writeShort(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = (short) r2
            r0.writeShort(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeZero(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.writerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writerIndex(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writerIndex(r2)
            return r1
    }
}
