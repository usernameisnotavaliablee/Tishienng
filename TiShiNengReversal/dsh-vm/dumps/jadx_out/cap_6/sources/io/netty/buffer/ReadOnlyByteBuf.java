package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ReadOnlyByteBuf extends io.netty.buffer.AbstractDerivedByteBuf {
    private final io.netty.buffer.ByteBuf buffer;

    public ReadOnlyByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.maxCapacity()
            r1.<init>(r0)
            boolean r0 = r2 instanceof io.netty.buffer.ReadOnlyByteBuf
            if (r0 != 0) goto L13
            boolean r0 = r2 instanceof io.netty.buffer.DuplicatedByteBuf
            if (r0 == 0) goto L10
            goto L13
        L10:
            r1.buffer = r2
            goto L19
        L13:
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            r1.buffer = r0
        L19:
            int r0 = r2.readerIndex()
            int r2 = r2.writerIndex()
            r1.setIndex(r0, r2)
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
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r1 = this;
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r0 = this;
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
    public io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.buffer.ReadOnlyByteBuf r0 = new io.netty.buffer.ReadOnlyByteBuf
            r0.<init>(r1)
            return r0
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
            r0 = 0
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

    @Override // io.netty.buffer.AbstractDerivedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
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
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.AbstractDerivedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
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
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.io.InputStream r2, int r3) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) {
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

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.unmodifiableBuffer(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            return r0
    }
}
