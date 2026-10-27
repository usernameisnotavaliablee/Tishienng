package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnpooledHeapByteBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    private final io.netty.buffer.ByteBufAllocator alloc;
    byte[] array;
    private java.nio.ByteBuffer tmpNioBuf;

    public UnpooledHeapByteBuf(io.netty.buffer.ByteBufAllocator r3, int r4, int r5) {
            r2 = this;
            r2.<init>(r5)
            java.lang.String r0 = "alloc"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r0 = 0
            if (r4 > r5) goto L18
            r2.alloc = r3
            byte[] r3 = r2.allocateArray(r4)
            r2.setArray(r3)
            r2.setIndex(r0, r0)
            return
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "initialCapacity(%d) > maxCapacity(%d)"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r3.<init>(r4)
            throw r3
    }

    protected UnpooledHeapByteBuf(io.netty.buffer.ByteBufAllocator r3, byte[] r4, int r5) {
            r2 = this;
            r2.<init>(r5)
            java.lang.String r0 = "alloc"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            java.lang.String r0 = "initialArray"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            int r0 = r4.length
            r1 = 0
            if (r0 > r5) goto L1b
            r2.alloc = r3
            r2.setArray(r4)
            int r3 = r4.length
            r2.setIndex(r1, r3)
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            java.lang.String r4 = "initialCapacity(%d) > maxCapacity(%d)"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.<init>(r4)
            throw r3
    }

    private int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5, boolean r6) throws java.io.IOException {
            r0 = this;
            r0.ensureAccessible()
            if (r6 == 0) goto La
            java.nio.ByteBuffer r6 = r0.internalNioBuffer()
            goto L10
        La:
            byte[] r6 = r0.array
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
        L10:
            java.nio.Buffer r6 = r6.clear()
            java.nio.Buffer r6 = r6.position(r1)
            int r1 = r1 + r5
            java.nio.Buffer r1 = r6.limit(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r2.write(r1, r3)
            return r1
    }

    private int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3, boolean r4) throws java.io.IOException {
            r0 = this;
            r0.ensureAccessible()
            if (r4 == 0) goto La
            java.nio.ByteBuffer r4 = r0.internalNioBuffer()
            goto L10
        La:
            byte[] r4 = r0.array
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
        L10:
            java.nio.Buffer r4 = r4.clear()
            java.nio.Buffer r4 = r4.position(r1)
            int r1 = r1 + r3
            java.nio.Buffer r1 = r4.limit(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r2.write(r1)
            return r1
    }

    private java.nio.ByteBuffer internalNioBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.tmpNioBuf
            if (r0 != 0) goto Lc
            byte[] r0 = r1.array
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r1.tmpNioBuf = r0
        Lc:
            return r0
    }

    private void setArray(byte[] r1) {
            r0 = this;
            r0.array = r1
            r1 = 0
            r0.tmpNioBuf = r1
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            byte r2 = io.netty.buffer.HeapByteBufUtil.getByte(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.HeapByteBufUtil.getInt(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.HeapByteBufUtil.getIntLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            byte[] r0 = r2.array
            long r0 = io.netty.buffer.HeapByteBufUtil.getLong(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            byte[] r0 = r2.array
            long r0 = io.netty.buffer.HeapByteBufUtil.getLongLE(r0, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            short r2 = io.netty.buffer.HeapByteBufUtil.getShort(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            short r2 = io.netty.buffer.HeapByteBufUtil.getShortLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.HeapByteBufUtil.getUnsignedMedium(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            byte[] r0 = r1.array
            int r2 = io.netty.buffer.HeapByteBufUtil.getUnsignedMediumLE(r0, r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setByte(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setInt(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setIntLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setLong(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setLongLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setMedium(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setMediumLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setShort(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            byte[] r0 = r1.array
            io.netty.buffer.HeapByteBufUtil.setShortLE(r0, r2, r3)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc
            return r0
    }

    protected byte[] allocateArray(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            r1.ensureAccessible()
            byte[] r0 = r1.array
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            byte[] r0 = r1.array
            int r0 = r0.length
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r5) {
            r4 = this;
            r4.checkNewCapacity(r5)
            byte[] r0 = r4.array
            int r1 = r0.length
            if (r5 <= r1) goto L18
            byte[] r5 = r4.allocateArray(r5)
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r5, r2, r1)
            r4.setArray(r5)
            r4.freeArray(r0)
            return r4
        L18:
            if (r5 >= r1) goto L3d
            byte[] r1 = r4.allocateArray(r5)
            int r2 = r4.readerIndex()
            if (r2 >= r5) goto L34
            int r3 = r4.writerIndex()
            if (r3 <= r5) goto L2e
            r4.writerIndex(r5)
            goto L2f
        L2e:
            r5 = r3
        L2f:
            int r5 = r5 - r2
            java.lang.System.arraycopy(r0, r2, r1, r2, r5)
            goto L37
        L34:
            r4.setIndex(r5, r5)
        L37:
            r4.setArray(r1)
            r4.freeArray(r0)
        L3d:
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r4, int r5) {
            r3 = this;
            r3.checkIndex(r4, r5)
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r5)
            byte[] r1 = r3.array
            r2 = 0
            java.lang.System.arraycopy(r1, r4, r0, r2, r5)
            io.netty.buffer.UnpooledHeapByteBuf r4 = new io.netty.buffer.UnpooledHeapByteBuf
            io.netty.buffer.ByteBufAllocator r5 = r3.alloc()
            int r1 = r3.maxCapacity()
            r4.<init>(r5, r0, r1)
            return r4
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected void deallocate() {
            r1 = this;
            byte[] r0 = r1.array
            r1.freeArray(r0)
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            r1.array = r0
            return
    }

    protected void freeArray(byte[] r1) {
            r0 = this;
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            r0.ensureAccessible()
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r8, java.nio.channels.FileChannel r9, long r10, int r12) throws java.io.IOException {
            r7 = this;
            r7.ensureAccessible()
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            int r8 = r0.getBytes(r1, r2, r3, r5, r6)
            return r8
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            r0 = 0
            int r2 = r1.getBytes(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            r7 = this;
            int r0 = r9.capacity()
            r7.checkDstIndex(r8, r11, r10, r0)
            boolean r0 = r9.hasMemoryAddress()
            if (r0 == 0) goto L1c
            byte[] r1 = r7.array
            long r2 = r9.memoryAddress()
            long r9 = (long) r10
            long r2 = r2 + r9
            long r5 = (long) r11
            r3 = r2
            r2 = r8
            io.netty.util.internal.PlatformDependent.copyMemory(r1, r2, r3, r5)
            return r7
        L1c:
            r2 = r8
            boolean r8 = r9.hasArray()
            if (r8 == 0) goto L30
            byte[] r8 = r9.array()
            int r9 = r9.arrayOffset()
            int r9 = r9 + r10
            r7.getBytes(r2, r8, r9, r11)
            return r7
        L30:
            byte[] r8 = r7.array
            r9.setBytes(r10, r8, r2, r11)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            byte[] r0 = r1.array
            r3.write(r0, r2, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            r2.ensureAccessible()
            byte[] r0 = r2.array
            int r1 = r4.remaining()
            r4.put(r0, r3, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkDstIndex(r2, r5, r4, r0)
            byte[] r0 = r1.array
            java.lang.System.arraycopy(r0, r2, r3, r4, r5)
            return r1
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
            r0 = 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
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
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            r1.ensureAccessible()
            byte[] r0 = r1.array
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r2, r3)
            java.nio.ByteBuffer r2 = r2.slice()
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
    public int readBytes(java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r7 = this;
            r7.checkReadableBytes(r11)
            int r1 = r7.readerIndex
            r6 = 1
            r0 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r8 = r0.getBytes(r1, r2, r3, r5, r6)
            int r9 = r0.readerIndex
            int r9 = r9 + r8
            r0.readerIndex = r9
            return r8
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.checkReadableBytes(r4)
            int r0 = r2.readerIndex
            r1 = 1
            int r3 = r2.getBytes(r0, r3, r4, r1)
            int r4 = r2.readerIndex
            int r4 = r4 + r3
            r2.readerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setByte(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            byte[] r0 = r1.array
            int r2 = r3.read(r0, r2, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.FileChannel r3, long r4, int r6) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            java.nio.ByteBuffer r0 = r1.internalNioBuffer()     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.Buffer r0 = r0.clear()     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.Buffer r0 = r0.position(r2)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            int r2 = r2 + r6
            java.nio.Buffer r2 = r0.limit(r2)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.nio.channels.ClosedChannelException -> L1b
            int r2 = r3.read(r2, r4)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            return r2
        L1b:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.ScatteringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            java.nio.ByteBuffer r0 = r1.internalNioBuffer()     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.Buffer r0 = r0.clear()     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.Buffer r0 = r0.position(r2)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            int r2 = r2 + r4
            java.nio.Buffer r2 = r0.limit(r2)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.nio.channels.ClosedChannelException -> L1b
            int r2 = r3.read(r2)     // Catch: java.nio.channels.ClosedChannelException -> L1b
            return r2
        L1b:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r9, io.netty.buffer.ByteBuf r10, int r11, int r12) {
            r8 = this;
            int r0 = r10.capacity()
            r8.checkSrcIndex(r9, r12, r11, r0)
            boolean r0 = r10.hasMemoryAddress()
            if (r0 == 0) goto L1c
            long r0 = r10.memoryAddress()
            long r10 = (long) r11
            long r2 = r0 + r10
            byte[] r4 = r8.array
            long r6 = (long) r12
            r5 = r9
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r5, r6)
            return r8
        L1c:
            r5 = r9
            boolean r9 = r10.hasArray()
            if (r9 == 0) goto L30
            byte[] r9 = r10.array()
            int r10 = r10.arrayOffset()
            int r10 = r10 + r11
            r8.setBytes(r5, r9, r10, r12)
            return r8
        L30:
            byte[] r9 = r8.array
            r10.getBytes(r11, r9, r5, r12)
            return r8
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, java.nio.ByteBuffer r4) {
            r2 = this;
            r2.ensureAccessible()
            byte[] r0 = r2.array
            int r1 = r4.remaining()
            r4.get(r0, r3, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            int r0 = r3.length
            r1.checkSrcIndex(r2, r5, r4, r0)
            byte[] r0 = r1.array
            java.lang.System.arraycopy(r3, r4, r0, r2, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setInt(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setIntLE(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setLong(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r1, long r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setLongLE(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setMedium(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setMediumLE(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setShort(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setShortLE(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}
