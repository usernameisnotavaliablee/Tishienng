package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class WrappedByteBuf extends io.netty.buffer.ByteBuf {
    protected final io.netty.buffer.ByteBuf buf;

    protected WrappedByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.buf = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "buf"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBufAllocator alloc() {
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
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
    public final int capacity() {
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
    public final io.netty.buffer.ByteBuf clear() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.clear()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int compareTo(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.compareTo(r2)
            return r2
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.copy()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
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
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.equals(r2)
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
    public char getChar(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            char r2 = r0.getChar(r2)
            return r2
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
            io.netty.buffer.ByteBuf r0 = r2.buf
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float getFloat(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r2 = r0.getShortLE(r2)
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
    public long getUnsignedInt(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getUnsignedInt(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.getUnsignedIntLE(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getUnsignedShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.getUnsignedShortLE(r2)
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
    public final boolean hasMemoryAddress() {
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
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer r2 = r0.internalNioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    final boolean isAccessible() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isDirect() {
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
    public final boolean isReadable() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isReadable()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isReadable(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.isReadable(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isWritable() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r0 = r0.isWritable()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isWritable(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            boolean r2 = r0.isWritable(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.markReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.markWriterIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final int maxCapacity() {
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
    public final int maxWritableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.maxWritableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final long memoryAddress() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer r0 = r0.nioBuffer()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
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
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer[] r0 = r0.nioBuffers()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteBuffer[] r2 = r0.nioBuffers(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.order(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteOrder order() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            java.nio.ByteOrder r0 = r0.order()
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
            io.netty.buffer.ByteBuf r0 = r1.buf
            char r0 = r0.readChar()
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
            io.netty.buffer.ByteBuf r0 = r2.buf
            double r0 = r0.readDouble()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            float r0 = r0.readFloat()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readInt()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readIntLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLong() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readLong()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLongLE() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readLongLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readMedium()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readMediumLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.readRetainedSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r0 = r0.readShort()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            short r0 = r0.readShortLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.readSlice(r2)
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
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readUnsignedInt()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            long r0 = r0.readUnsignedIntLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readUnsignedMedium()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readUnsignedMediumLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readUnsignedShort()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readUnsignedShortLE()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int readableBytes() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readableBytes()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int readerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.readerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf readerIndex(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.readerIndex(r2)
            return r1
    }

    public final int refCnt() {
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
    public final io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.resetReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf resetWriterIndex() {
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
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.retainedSlice()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.retainedSlice(r2, r3)
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
    public io.netty.buffer.ByteBuf setChar(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setChar(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setCharSequence(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.setCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r2, double r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setDouble(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r2, float r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setFloat(r2, r3)
            return r1
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
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setIntLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setLongLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setMediumLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.setShortLE(r2, r3)
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
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r0 = r0.slice()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            return r2
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
            io.netty.buffer.ByteBuf r1 = r2.buf
            java.lang.String r1 = r1.toString()
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
    public final io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int writableBytes() {
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
    public io.netty.buffer.ByteBuf writeChar(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeChar(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r2 = r0.writeCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeDouble(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeFloat(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeInt(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeIntLE(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeLong(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeLongLE(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeMedium(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeMediumLE(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeShort(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writeShortLE(r2)
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
    public final int writerIndex() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            int r0 = r0.writerIndex()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf writerIndex(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buf
            r0.writerIndex(r2)
            return r1
    }
}
