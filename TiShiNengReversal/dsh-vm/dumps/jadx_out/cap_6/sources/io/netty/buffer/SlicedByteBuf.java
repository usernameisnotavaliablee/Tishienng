package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SlicedByteBuf extends io.netty.buffer.AbstractUnpooledSlicedByteBuf {
    private int length;

    public SlicedByteBuf(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = super.alloc()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ byte[] array() {
            r1 = this;
            byte[] r0 = super.array()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int arrayOffset() {
            r1 = this;
            int r0 = super.arrayOffset()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.capacity(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf copy(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.copy(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.duplicate()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int forEachByte(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            int r1 = super.forEachByte(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int forEachByteDesc(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            int r1 = super.forEachByteDesc(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ byte getByte(int r1) {
            r0 = this;
            byte r1 = super.getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            int r1 = super.getBytes(r1, r2, r3, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) throws java.io.IOException {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ java.lang.CharSequence getCharSequence(int r1, int r2, java.nio.charset.Charset r3) {
            r0 = this;
            java.lang.CharSequence r1 = super.getCharSequence(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getInt(int r1) {
            r0 = this;
            int r1 = super.getInt(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getIntLE(int r1) {
            r0 = this;
            int r1 = super.getIntLE(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ long getLong(int r3) {
            r2 = this;
            long r0 = super.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ long getLongLE(int r3) {
            r2 = this;
            long r0 = super.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ short getShort(int r1) {
            r0 = this;
            short r1 = super.getShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ short getShortLE(int r1) {
            r0 = this;
            short r1 = super.getShortLE(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getUnsignedMedium(int r1) {
            r0 = this;
            int r1 = super.getUnsignedMedium(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int getUnsignedMediumLE(int r1) {
            r0 = this;
            int r1 = super.getUnsignedMediumLE(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ boolean hasArray() {
            r1 = this;
            boolean r0 = super.hasArray()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ boolean hasMemoryAddress() {
            r1 = this;
            boolean r0 = super.hasMemoryAddress()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf
    final void initLength(int r1) {
            r0 = this;
            r0.length = r1
            return
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ boolean isDirect() {
            r1 = this;
            boolean r0 = super.isDirect()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf
    final int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ long memoryAddress() {
            r2 = this;
            long r0 = super.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractDerivedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ java.nio.ByteBuffer nioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = super.nioBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int nioBufferCount() {
            r1 = this;
            int r0 = super.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ java.nio.ByteBuffer[] nioBuffers(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer[] r1 = super.nioBuffers(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = super.order()
            return r0
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setByte(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int setBytes(int r1, java.io.InputStream r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.setBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r0 = this;
            int r1 = super.setBytes(r1, r2, r3, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = super.setBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setInt(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setIntLE(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setIntLE(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setLong(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setLongLE(int r1, long r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setLongLE(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setMedium(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setMediumLE(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setMediumLE(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setShort(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setShortLE(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.setShortLE(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf slice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.slice(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.unwrap()
            return r0
    }
}
