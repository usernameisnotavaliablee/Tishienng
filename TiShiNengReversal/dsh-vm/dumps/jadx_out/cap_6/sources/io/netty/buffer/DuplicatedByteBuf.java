package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DuplicatedByteBuf extends io.netty.buffer.AbstractDerivedByteBuf {
    private final io.netty.buffer.ByteBuf buffer;

    public DuplicatedByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            int r0 = r3.readerIndex()
            int r1 = r3.writerIndex()
            r2.<init>(r3, r0, r1)
            return
    }

    DuplicatedByteBuf(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            int r0 = r2.maxCapacity()
            r1.<init>(r0)
            boolean r0 = r2 instanceof io.netty.buffer.DuplicatedByteBuf
            if (r0 == 0) goto L12
            io.netty.buffer.DuplicatedByteBuf r2 = (io.netty.buffer.DuplicatedByteBuf) r2
            io.netty.buffer.ByteBuf r2 = r2.buffer
            r1.buffer = r2
            goto L1f
        L12:
            boolean r0 = r2 instanceof io.netty.buffer.AbstractPooledDerivedByteBuf
            if (r0 == 0) goto L1d
            io.netty.buffer.ByteBuf r2 = r2.unwrap()
            r1.buffer = r2
            goto L1f
        L1d:
            r1.buffer = r2
        L1f:
            r1.setIndex(r3, r4)
            r1.markReaderIndex()
            r1.markWriterIndex()
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setByte(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setIntLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setLongLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setMedium(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setMediumLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
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
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r0 = r0.capacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.capacity(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.forEachByte(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.forEachByteDesc(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.ByteBuf r0 = r6.unwrap()
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
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
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

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.memoryAddress()
            return r0
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
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
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
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setByte(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.ByteBuf r0 = r6.unwrap()
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
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setIntLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setLongLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setMediumLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            r0.setShortLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
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
