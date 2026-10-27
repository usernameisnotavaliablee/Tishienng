package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ReadOnlyByteBufferBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    private final io.netty.buffer.ByteBufAllocator allocator;
    protected final java.nio.ByteBuffer buffer;
    private java.nio.ByteBuffer tmpNioBuf;

    ReadOnlyByteBufferBuf(io.netty.buffer.ByteBufAllocator r3, java.nio.ByteBuffer r4) {
            r2 = this;
            int r0 = r4.remaining()
            r2.<init>(r0)
            boolean r0 = r4.isReadOnly()
            if (r0 == 0) goto L23
            r2.allocator = r3
            java.nio.ByteBuffer r3 = r4.slice()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r4)
            r2.buffer = r3
            int r3 = r3.limit()
            r2.writerIndex(r3)
            return
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "must be a readonly buffer: "
            r0.append(r1)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            byte r2 = r0.get(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r2 = r0.getInt(r2)
            int r2 = io.netty.buffer.ByteBufUtil.swapInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            long r0 = r0.getLong(r3)
            long r0 = io.netty.buffer.ByteBufUtil.swapLong(r0)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            short r2 = r0.getShort(r2)
            short r2 = io.netty.buffer.ByteBufUtil.swapShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r3) {
            r2 = this;
            byte r0 = r2.getByte(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r1 = r3 + 1
            byte r1 = r2.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            byte r3 = r2.getByte(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r3) {
            r2 = this;
            byte r0 = r2.getByte(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            byte r1 = r2.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            byte r3 = r2.getByte(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r3 = r3 | r0
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            byte[] r0 = r0.array()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.arrayOffset()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            int r0 = r1.maxCapacity()
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
    public io.netty.buffer.ByteBuf copy(int r4, int r5) {
            r3 = this;
            r3.ensureAccessible()
            java.nio.ByteBuffer r0 = r3.internalNioBuffer()     // Catch: java.lang.IllegalArgumentException -> L32
            java.nio.Buffer r0 = r0.clear()     // Catch: java.lang.IllegalArgumentException -> L32
            java.nio.Buffer r0 = r0.position(r4)     // Catch: java.lang.IllegalArgumentException -> L32
            int r1 = r4 + r5
            java.nio.Buffer r0 = r0.limit(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.IllegalArgumentException -> L32
            boolean r4 = r0.isDirect()
            if (r4 == 0) goto L26
            io.netty.buffer.ByteBufAllocator r4 = r3.alloc()
            io.netty.buffer.ByteBuf r4 = r4.directBuffer(r5)
            goto L2e
        L26:
            io.netty.buffer.ByteBufAllocator r4 = r3.alloc()
            io.netty.buffer.ByteBuf r4 = r4.heapBuffer(r5)
        L2e:
            r4.writeBytes(r0)
            return r4
        L32:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Too many bytes to read - Need "
            r1.append(r2)
            int r4 = r4 + r5
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected void deallocate() {
            r0 = this;
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int ensureWritable(int r1, boolean r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r1) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            r0.ensureAccessible()
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r3, java.nio.channels.FileChannel r4, long r5, int r7) throws java.io.IOException {
            r2 = this;
            r2.ensureAccessible()
            if (r7 != 0) goto L7
            r3 = 0
            return r3
        L7:
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r7
            r1.limit(r3)
            int r3 = r4.write(r0, r5)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r3, java.nio.channels.GatheringByteChannel r4, int r5) throws java.io.IOException {
            r2 = this;
            r2.ensureAccessible()
            if (r5 != 0) goto L7
            r3 = 0
            return r3
        L7:
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r5
            r1.limit(r3)
            int r3 = r4.write(r0)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, io.netty.buffer.ByteBuf r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.capacity()
            r2.checkDstIndex(r3, r6, r5, r0)
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L1a
            byte[] r0 = r4.array()
            int r4 = r4.arrayOffset()
            int r4 = r4 + r5
            r2.getBytes(r3, r0, r4, r6)
            return r2
        L1a:
            int r0 = r4.nioBufferCount()
            if (r0 <= 0) goto L36
            java.nio.ByteBuffer[] r4 = r4.nioBuffers(r5, r6)
            int r5 = r4.length
            r6 = 0
        L26:
            if (r6 >= r5) goto L35
            r0 = r4[r6]
            int r1 = r0.remaining()
            r2.getBytes(r3, r0)
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L26
        L35:
            return r2
        L36:
            r4.setBytes(r5, r2, r3, r6)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r4, java.io.OutputStream r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.ensureAccessible()
            if (r6 != 0) goto L6
            return r3
        L6:
            java.nio.ByteBuffer r0 = r3.buffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L1f
            java.nio.ByteBuffer r0 = r3.buffer
            byte[] r0 = r0.array()
            java.nio.ByteBuffer r1 = r3.buffer
            int r1 = r1.arrayOffset()
            int r4 = r4 + r1
            r5.write(r0, r4, r6)
            return r3
        L1f:
            byte[] r0 = io.netty.buffer.ByteBufUtil.threadLocalTempArray(r6)
            java.nio.ByteBuffer r1 = r3.internalNioBuffer()
            java.nio.Buffer r2 = r1.clear()
            r2.position(r4)
            r4 = 0
            r1.get(r0, r4, r6)
            r5.write(r0, r4, r6)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            int r0 = r5.remaining()
            r3.checkIndex(r4, r0)
            java.nio.ByteBuffer r0 = r3.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r4)
            int r2 = r5.remaining()
            int r4 = r4 + r2
            r1.limit(r4)
            r5.put(r0)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.length
            r2.checkDstIndex(r3, r6, r5, r0)
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r6
            r1.limit(r3)
            r0.get(r4, r5, r6)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getInt(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getIntLE(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r2.ensureAccessible()
            long r0 = r2._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            r2.ensureAccessible()
            long r0 = r2._getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r1) {
            r0 = this;
            r0.ensureAccessible()
            short r1 = r0._getShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r1) {
            r0 = this;
            r0.ensureAccessible()
            short r1 = r0._getShortLE(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getUnsignedMedium(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getUnsignedMediumLE(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasArray()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final java.nio.ByteBuffer internalNioBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.tmpNioBuf
            if (r0 != 0) goto Lc
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.duplicate()
            r1.tmpNioBuf = r0
        Lc:
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.ensureAccessible()
            java.nio.ByteBuffer r0 = r1.internalNioBuffer()
            java.nio.Buffer r0 = r0.clear()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r3
            java.nio.Buffer r2 = r0.limit(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r3
            java.nio.Buffer r2 = r0.limit(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r2 = r1.nioBuffer(r2, r3)
            r3 = 1
            java.nio.ByteBuffer[] r3 = new java.nio.ByteBuffer[r3]
            r0 = 0
            r3[r0] = r2
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.io.InputStream r2, int r3) throws java.io.IOException {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}
