package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractUnpooledSlicedByteBuf extends io.netty.buffer.AbstractDerivedByteBuf {
    private final int adjustment;
    private final io.netty.buffer.ByteBuf buffer;

    AbstractUnpooledSlicedByteBuf(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r4)
            checkSliceOutOfBounds(r3, r4, r2)
            boolean r0 = r2 instanceof io.netty.buffer.AbstractUnpooledSlicedByteBuf
            if (r0 == 0) goto L16
            io.netty.buffer.AbstractUnpooledSlicedByteBuf r2 = (io.netty.buffer.AbstractUnpooledSlicedByteBuf) r2
            io.netty.buffer.ByteBuf r0 = r2.buffer
            r1.buffer = r0
            int r2 = r2.adjustment
            int r2 = r2 + r3
            r1.adjustment = r2
            goto L27
        L16:
            boolean r0 = r2 instanceof io.netty.buffer.DuplicatedByteBuf
            if (r0 == 0) goto L23
            io.netty.buffer.ByteBuf r2 = r2.unwrap()
            r1.buffer = r2
            r1.adjustment = r3
            goto L27
        L23:
            r1.buffer = r2
            r1.adjustment = r3
        L27:
            r1.initLength(r4)
            r1.writerIndex(r4)
            return
    }

    static void checkSliceOutOfBounds(int r2, int r3, io.netty.buffer.ByteBuf r4) {
            int r0 = r4.capacity()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r2, r3, r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ".slice("
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r3)
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            int r3 = r2.idx(r3)
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            int r3 = r2.idx(r3)
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setByte(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setIntLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setLongLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setMedium(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setMediumLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setShortLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            byte[] r0 = r0.array()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r0 = r0.arrayOffset()
            int r0 = r1.idx(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "sliced buffer"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.unwrap()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            int r1 = r3.readerIndex()
            int r1 = r3.idx(r1)
            int r2 = r3.writerIndex()
            int r2 = r3.idx(r2)
            io.netty.buffer.ByteBuf r0 = r0.setIndex(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.forEachByte(r2, r3, r4)
            int r3 = r1.adjustment
            if (r2 < r3) goto L15
            int r2 = r2 - r3
            return r2
        L15:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.forEachByteDesc(r2, r3, r4)
            int r3 = r1.adjustment
            if (r2 < r3) goto L15
            int r2 = r2 - r3
            return r2
        L15:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            r0 = 1
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            r6.checkIndex0(r7, r11)
            io.netty.buffer.ByteBuf r0 = r6.unwrap()
            int r1 = r6.idx(r7)
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.getBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex0(r2, r4)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex0(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex0(r2, r4)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            int r0 = r3.remaining()
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex0(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            java.lang.CharSequence r2 = r0.getCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex0(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            int r3 = r2.idx(r3)
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex0(r3, r0)
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            int r3 = r2.idx(r3)
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.hasArray()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    final int idx(int r2) {
            r1 = this;
            int r0 = r1.adjustment
            int r2 = r2 + r0
            return r2
    }

    void initLength(int r1) {
            r0 = this;
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isDirect()
            return r0
    }

    int length() {
            r1 = this;
            int r0 = r1.capacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r4 = this;
            io.netty.buffer.ByteBuf r0 = r4.unwrap()
            long r0 = r0.memoryAddress()
            int r2 = r4.adjustment
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // io.netty.buffer.AbstractDerivedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r0 = r0.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            java.nio.ByteBuffer[] r2 = r0.nioBuffers(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    @java.lang.Deprecated
    public java.nio.ByteOrder order() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            java.nio.ByteOrder r0 = r0.order()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setByte(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex0(r2, r4)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            r6.checkIndex0(r7, r11)
            io.netty.buffer.ByteBuf r0 = r6.unwrap()
            int r1 = r6.idx(r7)
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.setBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.ScatteringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkIndex0(r2, r4)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex0(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            int r0 = r3.remaining()
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r1.checkIndex0(r2, r5)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setIntLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setLongLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setMediumLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex0(r2, r0)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            r0.setShortLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            r1.checkIndex0(r2, r3)
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r1.idx(r2)
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            return r0
    }
}
