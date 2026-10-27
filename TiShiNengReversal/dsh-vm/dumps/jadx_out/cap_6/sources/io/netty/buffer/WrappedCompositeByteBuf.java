package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class WrappedCompositeByteBuf extends io.netty.buffer.CompositeByteBuf {
    private final io.netty.buffer.CompositeByteBuf wrapped;

    WrappedCompositeByteBuf(io.netty.buffer.CompositeByteBuf r2) {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
            r1.<init>(r0)
            r1.wrapped = r2
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final byte _getByte(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            byte r2 = r0._getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final int _getInt(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0._getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final int _getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0._getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final long _getLong(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final long _getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0._getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final short _getShort(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r2 = r0._getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final short _getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r2 = r0._getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final int _getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0._getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final int _getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0._getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setByte(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setIntLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setLongLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setMedium(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setMediumLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf
    protected final void _setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0._setShortLE(r2, r3)
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponent(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponent(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponent(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponent(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponent(boolean r2, int r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponent(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponent(boolean r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponent(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(int r2, java.lang.Iterable<io.netty.buffer.ByteBuf> r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(int r2, io.netty.buffer.ByteBuf... r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(java.lang.Iterable<io.netty.buffer.ByteBuf> r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(boolean r2, java.lang.Iterable<io.netty.buffer.ByteBuf> r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(boolean r2, io.netty.buffer.ByteBuf... r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addComponents(io.netty.buffer.ByteBuf... r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addComponents(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf addFlattenedComponents(boolean r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.addFlattenedComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final byte[] array() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            byte[] r0 = r0.array()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final int arrayOffset() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.arrayOffset()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.asReadOnly()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(byte r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.bytesBefore(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, byte r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.bytesBefore(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.bytesBefore(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final int capacity() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.capacity()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.capacity(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf capacity(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.capacity(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf clear() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.clear()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf clear() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.clear()
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int compareTo(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final io.netty.buffer.ByteBuf component(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.component(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final io.netty.buffer.ByteBuf componentAtOffset(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.componentAtOffset(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf consolidate() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.consolidate()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf consolidate(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.consolidate(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.copy()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
    public final void deallocate() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.deallocate()
            return
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public java.util.List<io.netty.buffer.ByteBuf> decompose(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.util.List r2 = r0.decompose(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.discardReadBytes()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf discardReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.discardReadBytes()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf discardReadComponents() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.discardReadComponents()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.discardSomeReadBytes()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.discardSomeReadBytes()
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int ensureWritable(int r2, boolean r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.ensureWritable(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf ensureWritable(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.ensureWritable(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf ensureWritable(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.ensureWritable(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.forEachByte(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.forEachByte(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.forEachByteDesc(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.forEachByteDesc(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean getBoolean(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            byte r2 = r0.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.CompositeByteBuf r0 = r6.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.getBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) throws java.io.IOException {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.getBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public char getChar(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            char r2 = r0.getChar(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.lang.CharSequence r2 = r0.getCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public float getFloat(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r2 = r0.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r2 = r0.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r2 = r0.getUnsignedByte(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.getUnsignedInt(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.getUnsignedIntLE(r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getUnsignedShort(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.getUnsignedShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final boolean hasArray() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.hasArray()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final boolean hasMemoryAddress() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int hashCode() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int indexOf(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.indexOf(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final io.netty.buffer.ByteBuf internalComponent(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.internalComponent(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final io.netty.buffer.ByteBuf internalComponentAtOffset(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.internalComponentAtOffset(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteBuffer r2 = r0.internalNioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    final boolean isAccessible() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.isAccessible()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final boolean isDirect() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final boolean isReadable() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.isReadable()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final boolean isReadable(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r2 = r0.isReadable(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final boolean isWritable() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.isWritable()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final boolean isWritable(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r2 = r0.isWritable(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, java.lang.Iterable
    public java.util.Iterator<io.netty.buffer.ByteBuf> iterator() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.markReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.markReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.markWriterIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf markWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.markWriterIndex()
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int maxCapacity() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.maxCapacity()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxFastWritableBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.maxFastWritableBytes()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final int maxNumComponents() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.maxNumComponents()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int maxWritableBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.maxWritableBytes()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final long memoryAddress() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected io.netty.buffer.SwappedByteBuf newSwappedByteBuf() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.SwappedByteBuf r0 = r0.newSwappedByteBuf()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteBuffer r0 = r0.nioBuffer()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteBuffer[] r0 = r0.nioBuffers()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteBuffer[] r2 = r0.nioBuffers(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final int numComponents() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.numComponents()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.order(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final java.nio.ByteOrder order() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.nio.ByteOrder r0 = r0.order()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean readBoolean() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte readByte() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            byte r0 = r0.readByte()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.readBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.readBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(byte[] r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(byte[] r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            char r0 = r0.readChar()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.lang.CharSequence r2 = r0.readCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public double readDouble() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            double r0 = r0.readDouble()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            float r0 = r0.readFloat()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readInt()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readIntLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long readLong() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.readLong()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long readLongLE() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.readLongLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readMedium()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readMediumLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.readRetainedSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r0 = r0.readShort()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r0 = r0.readShortLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.readSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            short r0 = r0.readUnsignedByte()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.readUnsignedInt()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r2 = this;
            io.netty.buffer.CompositeByteBuf r0 = r2.wrapped
            long r0 = r0.readUnsignedIntLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readUnsignedMedium()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readUnsignedMediumLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readUnsignedShort()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readUnsignedShortLE()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readableBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readableBytes()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int readerIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.readerIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readerIndex(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readerIndex(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf readerIndex(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.readerIndex(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    public final int refCnt() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.refCnt()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    public boolean release() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r0 = r0.release()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            boolean r2 = r0.release(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf removeComponent(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.removeComponent(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public io.netty.buffer.CompositeByteBuf removeComponents(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.removeComponents(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.resetReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.resetReaderIndex()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf resetWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.resetWriterIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf resetWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.resetWriterIndex()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf retain() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.retain()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf retain(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.retain(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.retainedSlice()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.retainedSlice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBoolean(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBoolean(int r2, boolean r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBoolean(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setByte(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setByte(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setByte(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            io.netty.buffer.CompositeByteBuf r0 = r6.wrapped
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            int r7 = r0.setBytes(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.ScatteringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setBytes(r2, r3, r4, r5)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setChar(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setChar(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setChar(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int setCharSequence(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.setCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setDouble(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setDouble(int r2, double r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setDouble(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setFloat(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setFloat(int r2, float r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setFloat(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setIndex(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf setIndex(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setIndex(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setInt(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setInt(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.setIntLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setLong(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setLong(int r2, long r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.setLongLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setMedium(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setMedium(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.setMediumLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setShort(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setShort(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.setShortLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setZero(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setZero(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setZero(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.setZero(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf skipBytes(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.skipBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf skipBytes(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.skipBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r0 = r0.slice()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.slice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final int toByteIndex(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.toByteIndex(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf
    public final int toComponentIndex(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.toComponentIndex(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final java.lang.String toString() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.lang.String r2 = r0.toString(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            java.lang.String r2 = r0.toString(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf touch() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.touch()
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.touch(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int writableBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.writableBytes()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBoolean(boolean r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBoolean(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBoolean(boolean r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBoolean(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeByte(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeByte(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeByte(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeByte(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.writeBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(byte[] r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(byte[] r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeBytes(r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeChar(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeChar(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeChar(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r2 = r0.writeCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeDouble(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeDouble(double r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeDouble(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeFloat(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeFloat(float r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeFloat(r2)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeInt(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeInt(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeInt(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeInt(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.writeIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeLong(long r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeLong(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeLong(long r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeLong(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.writeLongLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeMedium(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeMedium(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeMedium(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeMedium(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.writeMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeShort(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeShort(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeShort(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeShort(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            io.netty.buffer.ByteBuf r2 = r0.writeShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeZero(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeZero(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeZero(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writeZero(r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final int writerIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            int r0 = r0.writerIndex()
            return r0
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writerIndex(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writerIndex(r1)
            return r1
    }

    @Override // io.netty.buffer.CompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.CompositeByteBuf writerIndex(int r2) {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.wrapped
            r0.writerIndex(r2)
            return r1
    }
}
