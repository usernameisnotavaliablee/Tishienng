package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EmptyByteBuf extends io.netty.buffer.ByteBuf {
    private static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER = null;
    private static final long EMPTY_BYTE_BUFFER_ADDRESS = 0;
    static final int EMPTY_BYTE_BUF_HASH_CODE = 1;
    private final io.netty.buffer.ByteBufAllocator alloc;
    private final java.nio.ByteOrder order;
    private final java.lang.String str;
    private io.netty.buffer.EmptyByteBuf swapped;

    static {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER = r0
            r1 = 0
            boolean r3 = io.netty.util.internal.PlatformDependent.hasUnsafe()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L13
            long r1 = io.netty.util.internal.PlatformDependent.directBufferAddress(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER_ADDRESS = r1
            return
    }

    public EmptyByteBuf(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r2, r0)
            return
    }

    private EmptyByteBuf(io.netty.buffer.ByteBufAllocator r2, java.nio.ByteOrder r3) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L28
            r1.alloc = r2
            r1.order = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r2.append(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r3 != r0) goto L1c
            java.lang.String r3 = "BE"
            goto L1e
        L1c:
            java.lang.String r3 = "LE"
        L1e:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.str = r2
            return
        L28:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "alloc"
            r2.<init>(r3)
            throw r2
    }

    private io.netty.buffer.ByteBuf checkIndex(int r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    private io.netty.buffer.ByteBuf checkIndex(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = "length"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
            if (r2 != 0) goto La
            if (r3 != 0) goto La
            return r1
        La:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    private io.netty.buffer.ByteBuf checkLength(int r2) {
            r1 = this;
            java.lang.String r0 = "length"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            if (r2 != 0) goto L8
            return r1
        L8:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unmodifiableBuffer(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(byte r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r1, byte r2) {
            r0 = this;
            r0.checkLength(r1)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r1, int r2, byte r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf clear() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int compareTo(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            boolean r1 = r1.isReadable()
            if (r1 == 0) goto L8
            r1 = -1
            return r1
        L8:
            r1 = 0
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
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int ensureWritable(int r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "minWritableBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r1, r2)
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            r1 = 1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r2) {
            r1 = this;
            java.lang.String r0 = "minWritableBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            if (r2 != 0) goto L8
            return r1
        L8:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Le
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            boolean r2 = r2.isReadable()
            if (r2 != 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean getBoolean(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            r0.checkIndex(r1, r5)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3) {
            r0 = this;
            r0.checkIndex(r1, r3)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            int r2 = r2.writableBytes()
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            int r2 = r2.remaining()
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2) {
            r0 = this;
            int r2 = r2.length
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char getChar(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r1, int r2, java.nio.charset.Charset r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public double getDouble(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public float getFloat(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getInt(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getIntLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLong(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLongLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMedium(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMediumLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShort(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShortLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r5 = this;
            long r0 = io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER_ADDRESS
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int indexOf(int r1, int r2, byte r3) {
            r0 = this;
            r0.checkIndex(r1)
            r0.checkIndex(r2)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            r0 = 1
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
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable(int r1) {
            r0 = this;
            r1 = 0
            return r1
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
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markWriterIndex() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxCapacity() {
            r1 = this;
            r0 = 0
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
            r2 = this;
            boolean r0 = r2.hasMemoryAddress()
            if (r0 == 0) goto L9
            long r0 = io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER_ADDRESS
            return r0
        L9:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1, r2)
            java.nio.ByteBuffer r1 = r0.nioBuffer()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r3 = this;
            r0 = 1
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            java.nio.ByteBuffer r1 = io.netty.buffer.EmptyByteBuf.EMPTY_BYTE_BUFFER
            r2 = 0
            r0[r2] = r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1, r2)
            java.nio.ByteBuffer[] r1 = r0.nioBuffers()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r3) {
            r2 = this;
            if (r3 == 0) goto L1a
            java.nio.ByteOrder r0 = r2.order()
            if (r3 != r0) goto L9
            return r2
        L9:
            io.netty.buffer.EmptyByteBuf r0 = r2.swapped
            if (r0 == 0) goto Le
            return r0
        Le:
            io.netty.buffer.EmptyByteBuf r0 = new io.netty.buffer.EmptyByteBuf
            io.netty.buffer.ByteBufAllocator r1 = r2.alloc()
            r0.<init>(r1, r3)
            r2.swapped = r0
            return r0
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "endianness"
            r3.<init>(r0)
            throw r3
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
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte readByte() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r1, long r2, int r4) {
            r0 = this;
            r0.checkLength(r4)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r1, int r2) {
            r0 = this;
            r0.checkLength(r2)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            int r1 = r1.writableBytes()
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            int r1 = r1.remaining()
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r1) {
            r0 = this;
            int r1 = r1.length
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r1, java.nio.charset.Charset r2) {
            r0 = this;
            r0.checkLength(r1)
            java.lang.String r1 = ""
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public double readDouble() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLong() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLongLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r1 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readableBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readerIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readerIndex(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1)
            return r1
    }

    public int refCnt() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean release() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean release(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetReaderIndex() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetWriterIndex() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            return r0
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
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.io.InputStream r2, int r3) {
            r0 = this;
            r0.checkIndex(r1, r3)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            r0.checkIndex(r1, r5)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) {
            r0 = this;
            r0.checkIndex(r1, r3)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            int r2 = r2.remaining()
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2) {
            r0 = this;
            int r2 = r2.length
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setCharSequence(int r1, java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIndex(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1)
            r0.checkIndex(r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r1, long r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r1, int r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf skipBytes(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(int r1, int r2, java.nio.charset.Charset r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            java.lang.String r1 = r0.toString(r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r1) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            return r0
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
            r0 = 0
            return r0
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
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeByte(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.checkLength(r2)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r1, long r2, int r4) {
            r0 = this;
            r0.checkLength(r4)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r1, int r2) {
            r0 = this;
            r0.checkLength(r2)
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            int r1 = r1.readableBytes()
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            int r1 = r1.remaining()
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r1) {
            r0 = this;
            int r1 = r1.length
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r1) {
            r0 = this;
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkLength(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int writerIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writerIndex(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.checkIndex(r1)
            return r1
    }
}
