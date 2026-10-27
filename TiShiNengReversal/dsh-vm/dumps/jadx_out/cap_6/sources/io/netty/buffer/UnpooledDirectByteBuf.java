package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UnpooledDirectByteBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    private final io.netty.buffer.ByteBufAllocator alloc;
    java.nio.ByteBuffer buffer;
    private int capacity;
    private boolean doNotFree;
    private java.nio.ByteBuffer tmpNioBuf;

    public UnpooledDirectByteBuf(io.netty.buffer.ByteBufAllocator r3, int r4, int r5) {
            r2 = this;
            r2.<init>(r5)
            if (r3 == 0) goto L38
            java.lang.String r0 = "initialCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            java.lang.String r0 = "maxCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            r0 = 0
            if (r4 > r5) goto L1c
            r2.alloc = r3
            java.nio.ByteBuffer r3 = r2.allocateDirect(r4)
            r2.setByteBuffer(r3, r0)
            return
        L1c:
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
        L38:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "alloc"
            r3.<init>(r4)
            throw r3
    }

    protected UnpooledDirectByteBuf(io.netty.buffer.ByteBufAllocator r7, java.nio.ByteBuffer r8, int r9) {
            r6 = this;
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    UnpooledDirectByteBuf(io.netty.buffer.ByteBufAllocator r4, java.nio.ByteBuffer r5, int r6, boolean r7, boolean r8) {
            r3 = this;
            r3.<init>(r6)
            if (r4 == 0) goto L67
            if (r5 == 0) goto L5f
            boolean r0 = r5.isDirect()
            if (r0 == 0) goto L57
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L4f
            int r0 = r5.remaining()
            r1 = 0
            r2 = 1
            if (r0 > r6) goto L34
            r3.alloc = r4
            r4 = r7 ^ 1
            r3.doNotFree = r4
            if (r8 == 0) goto L27
            java.nio.ByteBuffer r5 = r5.slice()
        L27:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r4 = r5.order(r4)
            r3.setByteBuffer(r4, r1)
            r3.writerIndex(r0)
            return
        L34:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r5
            r7[r2] = r6
            java.lang.String r5 = "initialCapacity(%d) > maxCapacity(%d)"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r4.<init>(r5)
            throw r4
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "initialBuffer is a read-only buffer."
            r4.<init>(r5)
            throw r4
        L57:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "initialBuffer is not a direct buffer."
            r4.<init>(r5)
            throw r4
        L5f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "initialBuffer"
            r4.<init>(r5)
            throw r4
        L67:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "alloc"
            r4.<init>(r5)
            throw r4
    }

    private int getBytes(int r2, java.nio.channels.FileChannel r3, long r4, int r6, boolean r7) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            if (r6 != 0) goto L7
            r2 = 0
            return r2
        L7:
            if (r7 == 0) goto Le
            java.nio.ByteBuffer r7 = r1.internalNioBuffer()
            goto L14
        Le:
            java.nio.ByteBuffer r7 = r1.buffer
            java.nio.ByteBuffer r7 = r7.duplicate()
        L14:
            java.nio.Buffer r0 = r7.clear()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r6
            r0.limit(r2)
            int r2 = r3.write(r7, r4)
            return r2
    }

    private int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            if (r4 != 0) goto L7
            r2 = 0
            return r2
        L7:
            if (r5 == 0) goto Le
            java.nio.ByteBuffer r5 = r1.internalNioBuffer()
            goto L14
        Le:
            java.nio.ByteBuffer r5 = r1.buffer
            java.nio.ByteBuffer r5 = r5.duplicate()
        L14:
            java.nio.Buffer r0 = r5.clear()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r4
            r0.limit(r2)
            int r2 = r3.write(r5)
            return r2
    }

    private java.nio.ByteBuffer internalNioBuffer() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.tmpNioBuf
            if (r0 != 0) goto Lc
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.duplicate()
            r1.tmpNioBuf = r0
        Lc:
            return r0
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
    protected void _setByte(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            byte r3 = (byte) r3
            r0.put(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r3 = io.netty.buffer.ByteBufUtil.swapInt(r3)
            r0.putInt(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r2, long r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            r0.putLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r2, long r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            long r3 = io.netty.buffer.ByteBufUtil.swapLong(r3)
            r0.putLong(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r3, int r4) {
            r2 = this;
            int r0 = r4 >>> 16
            byte r0 = (byte) r0
            r2.setByte(r3, r0)
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2.setByte(r0, r1)
            int r3 = r3 + 2
            byte r4 = (byte) r4
            r2.setByte(r3, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r3, int r4) {
            r2 = this;
            byte r0 = (byte) r4
            r2.setByte(r3, r0)
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2.setByte(r0, r1)
            int r3 = r3 + 2
            int r4 = r4 >>> 16
            byte r4 = (byte) r4
            r2.setByte(r3, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            short r3 = (short) r3
            r0.putShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            short r3 = (short) r3
            short r3 = io.netty.buffer.ByteBufUtil.swapShort(r3)
            r0.putShort(r2, r3)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc
            return r0
    }

    protected java.nio.ByteBuffer allocateDirect(int r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "direct buffer"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "direct buffer"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r6) {
            r5 = this;
            r5.checkNewCapacity(r6)
            int r0 = r5.readerIndex()
            int r1 = r5.writerIndex()
            int r2 = r5.capacity
            r3 = 1
            if (r6 <= r2) goto L37
            java.nio.ByteBuffer r0 = r5.buffer
            java.nio.ByteBuffer r6 = r5.allocateDirect(r6)
            r1 = 0
            java.nio.Buffer r2 = r0.position(r1)
            int r4 = r0.capacity()
            r2.limit(r4)
            java.nio.Buffer r1 = r6.position(r1)
            int r2 = r0.capacity()
            r1.limit(r2)
            r6.put(r0)
            r6.clear()
            r5.setByteBuffer(r6, r3)
            return r5
        L37:
            if (r6 >= r2) goto L63
            java.nio.ByteBuffer r2 = r5.buffer
            java.nio.ByteBuffer r4 = r5.allocateDirect(r6)
            if (r0 >= r6) goto L5d
            if (r1 <= r6) goto L47
            r5.writerIndex(r6)
            goto L48
        L47:
            r6 = r1
        L48:
            java.nio.Buffer r1 = r2.position(r0)
            r1.limit(r6)
            java.nio.Buffer r0 = r4.position(r0)
            r0.limit(r6)
            r4.put(r2)
            r4.clear()
            goto L60
        L5d:
            r5.setIndex(r6, r6)
        L60:
            r5.setByteBuffer(r4, r3)
        L63:
            return r5
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r4, int r5) {
            r3 = this;
            r3.ensureAccessible()
            java.nio.ByteBuffer r0 = r3.buffer     // Catch: java.lang.IllegalArgumentException -> L2a
            java.nio.ByteBuffer r0 = r0.duplicate()     // Catch: java.lang.IllegalArgumentException -> L2a
            java.nio.Buffer r0 = r0.clear()     // Catch: java.lang.IllegalArgumentException -> L2a
            java.nio.Buffer r0 = r0.position(r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            int r1 = r4 + r5
            java.nio.Buffer r0 = r0.limit(r1)     // Catch: java.lang.IllegalArgumentException -> L2a
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.IllegalArgumentException -> L2a
            io.netty.buffer.ByteBufAllocator r4 = r3.alloc()
            int r1 = r3.maxCapacity()
            io.netty.buffer.ByteBuf r4 = r4.directBuffer(r5, r1)
            io.netty.buffer.ByteBuf r4 = r4.writeBytes(r0)
            return r4
        L2a:
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
            r2 = this;
            java.nio.ByteBuffer r0 = r2.buffer
            if (r0 != 0) goto L5
            goto Lf
        L5:
            r1 = 0
            r2.buffer = r1
            boolean r1 = r2.doNotFree
            if (r1 != 0) goto Lf
            r2.freeDirect(r0)
        Lf:
            return
    }

    protected void freeDirect(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.util.internal.PlatformDependent.freeDirectBuffer(r1)
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
            r0 = 0
            int r2 = r1.getBytes(r2, r3, r4, r0)
            return r2
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
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.getBytes(r2, r3, r4, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 0
            r1.getBytes(r2, r3, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.getBytes(r1, r2, r3, r4, r5)
            return r0
    }

    void getBytes(int r2, java.io.OutputStream r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            r1.ensureAccessible()
            if (r4 != 0) goto L6
            return
        L6:
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            if (r5 == 0) goto L11
            java.nio.ByteBuffer r5 = r1.internalNioBuffer()
            goto L17
        L11:
            java.nio.ByteBuffer r5 = r1.buffer
            java.nio.ByteBuffer r5 = r5.duplicate()
        L17:
            io.netty.buffer.ByteBufUtil.readBytes(r0, r5, r2, r4, r3)
            return
    }

    void getBytes(int r3, java.nio.ByteBuffer r4, boolean r5) {
            r2 = this;
            int r0 = r4.remaining()
            r2.checkIndex(r3, r0)
            if (r5 == 0) goto Le
            java.nio.ByteBuffer r5 = r2.internalNioBuffer()
            goto L14
        Le:
            java.nio.ByteBuffer r5 = r2.buffer
            java.nio.ByteBuffer r5 = r5.duplicate()
        L14:
            java.nio.Buffer r0 = r5.clear()
            java.nio.Buffer r0 = r0.position(r3)
            int r1 = r4.remaining()
            int r3 = r3 + r1
            r0.limit(r3)
            r4.put(r5)
            return
    }

    void getBytes(int r2, byte[] r3, int r4, int r5, boolean r6) {
            r1 = this;
            int r0 = r3.length
            r1.checkDstIndex(r2, r5, r4, r0)
            if (r6 == 0) goto Lb
            java.nio.ByteBuffer r6 = r1.internalNioBuffer()
            goto L11
        Lb:
            java.nio.ByteBuffer r6 = r1.buffer
            java.nio.ByteBuffer r6 = r6.duplicate()
        L11:
            java.nio.Buffer r0 = r6.clear()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r5
            r0.limit(r2)
            r6.get(r3, r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getInt(r1)
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
    public short getShort(int r1) {
            r0 = this;
            r0.ensureAccessible()
            short r1 = r0._getShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r1) {
            r0 = this;
            r0.ensureAccessible()
            int r1 = r0._getUnsignedMedium(r1)
            return r1
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
            r0 = 1
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
            r1.checkIndex(r2, r3)
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.Buffer r0 = r0.position(r2)
            int r2 = r2 + r3
            java.nio.Buffer r2 = r0.limit(r2)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
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
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.checkReadableBytes(r4)
            int r0 = r2.readerIndex
            r1 = 1
            r2.getBytes(r0, r3, r4, r1)
            int r3 = r2.readerIndex
            int r3 = r3 + r4
            r2.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r3.checkReadableBytes(r0)
            int r1 = r3.readerIndex
            r2 = 1
            r3.getBytes(r1, r4, r2)
            int r4 = r3.readerIndex
            int r4 = r4 + r0
            r3.readerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r7, int r8, int r9) {
            r6 = this;
            r6.checkReadableBytes(r9)
            int r1 = r6.readerIndex
            r5 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.getBytes(r1, r2, r3, r4, r5)
            int r7 = r0.readerIndex
            int r7 = r7 + r4
            r0.readerIndex = r7
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setByte(r1, r2)
            return r0
    }

    void setByteBuffer(java.nio.ByteBuffer r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L11
            java.nio.ByteBuffer r3 = r1.buffer
            if (r3 == 0) goto L11
            boolean r0 = r1.doNotFree
            if (r0 == 0) goto Le
            r3 = 0
            r1.doNotFree = r3
            goto L11
        Le:
            r1.freeDirect(r3)
        L11:
            r1.buffer = r2
            r3 = 0
            r1.tmpNioBuf = r3
            int r2 = r2.remaining()
            r1.capacity = r2
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r4, java.io.InputStream r5, int r6) throws java.io.IOException {
            r3 = this;
            r3.ensureAccessible()
            java.nio.ByteBuffer r0 = r3.buffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L1d
            java.nio.ByteBuffer r0 = r3.buffer
            byte[] r0 = r0.array()
            java.nio.ByteBuffer r1 = r3.buffer
            int r1 = r1.arrayOffset()
            int r1 = r1 + r4
            int r4 = r5.read(r0, r1, r6)
            return r4
        L1d:
            byte[] r0 = io.netty.buffer.ByteBufUtil.threadLocalTempArray(r6)
            r1 = 0
            int r5 = r5.read(r0, r1, r6)
            if (r5 > 0) goto L29
            return r5
        L29:
            java.nio.ByteBuffer r6 = r3.internalNioBuffer()
            java.nio.Buffer r2 = r6.clear()
            r2.position(r4)
            r6.put(r0, r1, r5)
            return r5
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r3, java.nio.channels.FileChannel r4, long r5, int r7) throws java.io.IOException {
            r2 = this;
            r2.ensureAccessible()
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r7
            r1.limit(r3)
            int r3 = r4.read(r0, r5)     // Catch: java.nio.channels.ClosedChannelException -> L18
            return r3
        L18:
            r3 = -1
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r3, java.nio.channels.ScatteringByteChannel r4, int r5) throws java.io.IOException {
            r2 = this;
            r2.ensureAccessible()
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r5
            r1.limit(r3)
            int r3 = r4.read(r0)     // Catch: java.nio.channels.ClosedChannelException -> L18
            return r3
        L18:
            r3 = -1
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, io.netty.buffer.ByteBuf r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.capacity()
            r2.checkSrcIndex(r3, r6, r5, r0)
            int r0 = r4.nioBufferCount()
            if (r0 <= 0) goto L23
            java.nio.ByteBuffer[] r4 = r4.nioBuffers(r5, r6)
            int r5 = r4.length
            r6 = 0
        L13:
            if (r6 >= r5) goto L22
            r0 = r4[r6]
            int r1 = r0.remaining()
            r2.setBytes(r3, r0)
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L13
        L22:
            return r2
        L23:
            r4.getBytes(r5, r2, r3, r6)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            r3.ensureAccessible()
            java.nio.ByteBuffer r0 = r3.internalNioBuffer()
            if (r5 != r0) goto Ld
            java.nio.ByteBuffer r5 = r5.duplicate()
        Ld:
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r4)
            int r2 = r5.remaining()
            int r4 = r4 + r2
            r1.limit(r4)
            r0.put(r5)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            int r0 = r4.length
            r2.checkSrcIndex(r3, r6, r5, r0)
            java.nio.ByteBuffer r0 = r2.internalNioBuffer()
            java.nio.Buffer r1 = r0.clear()
            java.nio.Buffer r1 = r1.position(r3)
            int r3 = r3 + r6
            r1.limit(r3)
            r0.put(r4, r5, r6)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setInt(r1, r2)
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
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setMedium(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0._setShort(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}
