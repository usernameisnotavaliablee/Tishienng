package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractByteBuf extends io.netty.buffer.ByteBuf {
    private static final java.lang.String LEGACY_PROP_CHECK_ACCESSIBLE = "io.netty.buffer.bytebuf.checkAccessible";
    private static final java.lang.String PROP_CHECK_ACCESSIBLE = "io.netty.buffer.checkAccessible";
    private static final java.lang.String PROP_CHECK_BOUNDS = "io.netty.buffer.checkBounds";
    static final boolean checkAccessible = false;
    private static final boolean checkBounds = false;
    static final io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> leakDetector = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private int markedReaderIndex;
    private int markedWriterIndex;
    private int maxCapacity;
    int readerIndex;
    int writerIndex;

    static {
            java.lang.Class<io.netty.buffer.AbstractByteBuf> r0 = io.netty.buffer.AbstractByteBuf.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.buffer.AbstractByteBuf.logger = r0
            java.lang.String r1 = "io.netty.buffer.checkAccessible"
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.contains(r1)
            r3 = 1
            if (r2 == 0) goto L18
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r1, r3)
            io.netty.buffer.AbstractByteBuf.checkAccessible = r2
            goto L20
        L18:
            java.lang.String r2 = "io.netty.buffer.bytebuf.checkAccessible"
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r2, r3)
            io.netty.buffer.AbstractByteBuf.checkAccessible = r2
        L20:
            java.lang.String r2 = "io.netty.buffer.checkBounds"
            boolean r3 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r2, r3)
            io.netty.buffer.AbstractByteBuf.checkBounds = r3
            boolean r4 = r0.isDebugEnabled()
            if (r4 == 0) goto L40
            boolean r4 = io.netty.buffer.AbstractByteBuf.checkAccessible
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "-D{}: {}"
            r0.debug(r5, r1, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.debug(r5, r2, r1)
        L40:
            io.netty.util.ResourceLeakDetectorFactory r0 = io.netty.util.ResourceLeakDetectorFactory.instance()
            java.lang.Class<io.netty.buffer.ByteBuf> r1 = io.netty.buffer.ByteBuf.class
            io.netty.util.ResourceLeakDetector r0 = r0.newResourceLeakDetector(r1)
            io.netty.buffer.AbstractByteBuf.leakDetector = r0
            return
    }

    protected AbstractByteBuf(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "maxCapacity"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.maxCapacity = r2
            return
    }

    private static void checkIndexBounds(int r3, int r4, int r5) {
            if (r3 < 0) goto L7
            if (r3 > r4) goto L7
            if (r4 > r5) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    private static void checkRangeBounds(java.lang.String r3, int r4, int r5, int r6) {
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r5, r6)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            java.lang.String r3 = "%s: %d, length: %d (expected: range(0, %d))"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    private static void checkReadableBounds(io.netty.buffer.ByteBuf r4, int r5) {
            int r0 = r4.readableBytes()
            if (r5 > r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r4.readableBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "length(%d) exceeds src.readableBytes(%d) where src is: %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
    }

    private void checkReadableBytes0(int r6) {
            r5 = this;
            r5.ensureAccessible()
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto L3a
            int r0 = r5.readerIndex
            int r1 = r5.writerIndex
            int r1 = r1 - r6
            if (r0 > r1) goto Lf
            goto L3a
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r1 = r5.readerIndex
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r5.writerIndex
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r6
            r6 = 2
            r3[r6] = r2
            r6 = 3
            r3[r6] = r5
            java.lang.String r6 = "readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        L3a:
            return
    }

    private int setCharSequence0(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4, boolean r5) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L21
            int r4 = io.netty.buffer.ByteBufUtil.utf8MaxBytes(r3)
            if (r5 == 0) goto L15
            r1.ensureWritable0(r4)
            r1.checkIndex0(r2, r4)
            goto L18
        L15:
            r1.checkIndex(r2, r4)
        L18:
            int r4 = r3.length()
            int r2 = io.netty.buffer.ByteBufUtil.writeUtf8(r1, r2, r3, r4)
            return r2
        L21:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L45
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.ISO_8859_1
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L32
            goto L45
        L32:
            java.lang.String r3 = r3.toString()
            byte[] r3 = r3.getBytes(r4)
            if (r5 == 0) goto L40
            int r4 = r3.length
            r1.ensureWritable0(r4)
        L40:
            r1.setBytes(r2, r3)
            int r2 = r3.length
            return r2
        L45:
            int r4 = r3.length()
            if (r5 == 0) goto L52
            r1.ensureWritable0(r4)
            r1.checkIndex0(r2, r4)
            goto L55
        L52:
            r1.checkIndex(r2, r4)
        L55:
            int r2 = io.netty.buffer.ByteBufUtil.writeAscii(r1, r2, r3, r4)
            return r2
    }

    protected abstract byte _getByte(int r1);

    protected abstract int _getInt(int r1);

    protected abstract int _getIntLE(int r1);

    protected abstract long _getLong(int r1);

    protected abstract long _getLongLE(int r1);

    protected abstract short _getShort(int r1);

    protected abstract short _getShortLE(int r1);

    protected abstract int _getUnsignedMedium(int r1);

    protected abstract int _getUnsignedMediumLE(int r1);

    protected abstract void _setByte(int r1, int r2);

    protected abstract void _setInt(int r1, int r2);

    protected abstract void _setIntLE(int r1, int r2);

    protected abstract void _setLong(int r1, long r2);

    protected abstract void _setLongLE(int r1, long r2);

    protected abstract void _setMedium(int r1, int r2);

    protected abstract void _setMediumLE(int r1, int r2);

    protected abstract void _setShort(int r1, int r2);

    protected abstract void _setShortLE(int r1, int r2);

    protected final void adjustMarkers(int r3) {
            r2 = this;
            int r0 = r2.markedReaderIndex
            if (r0 > r3) goto L12
            r0 = 0
            r2.markedReaderIndex = r0
            int r1 = r2.markedWriterIndex
            if (r1 > r3) goto Le
            r2.markedWriterIndex = r0
            return
        Le:
            int r1 = r1 - r3
            r2.markedWriterIndex = r1
            return
        L12:
            int r0 = r0 - r3
            r2.markedReaderIndex = r0
            int r0 = r2.markedWriterIndex
            int r0 = r0 - r3
            r2.markedWriterIndex = r0
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            boolean r0 = r1.isReadOnly()
            if (r0 == 0) goto L7
            return r1
        L7:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unmodifiableBuffer(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(byte r3) {
            r2 = this;
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            int r3 = r2.bytesBefore(r0, r1, r3)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, byte r3) {
            r1 = this;
            r1.checkReadableBytes(r2)
            int r0 = r1.readerIndex()
            int r2 = r1.bytesBefore(r0, r2, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int bytesBefore(int r1, int r2, byte r3) {
            r0 = this;
            int r2 = r2 + r1
            int r2 = r0.indexOf(r1, r2, r3)
            if (r2 >= 0) goto L9
            r1 = -1
            return r1
        L9:
            int r2 = r2 - r1
            return r2
    }

    protected final void checkDstIndex(int r2, int r3, int r4) {
            r1 = this;
            r1.checkReadableBytes(r2)
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Lc
            java.lang.String r0 = "dstIndex"
            checkRangeBounds(r0, r3, r2, r4)
        Lc:
            return
    }

    protected final void checkDstIndex(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.checkIndex(r1, r2)
            boolean r1 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r1 == 0) goto Lc
            java.lang.String r1 = "dstIndex"
            checkRangeBounds(r1, r3, r2, r4)
        Lc:
            return
    }

    protected final void checkIndex(int r2) {
            r1 = this;
            r0 = 1
            r1.checkIndex(r2, r0)
            return
    }

    protected final void checkIndex(int r1, int r2) {
            r0 = this;
            r0.ensureAccessible()
            r0.checkIndex0(r1, r2)
            return
    }

    final void checkIndex0(int r3, int r4) {
            r2 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Ld
            java.lang.String r0 = "index"
            int r1 = r2.capacity()
            checkRangeBounds(r0, r3, r4, r1)
        Ld:
            return
    }

    protected final void checkNewCapacity(int r4) {
            r3 = this;
            r3.ensureAccessible()
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto L38
            if (r4 < 0) goto L10
            int r0 = r3.maxCapacity()
            if (r4 > r0) goto L10
            goto L38
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "newCapacity: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: 0-"
            r1.append(r4)
            int r4 = r3.maxCapacity()
            r1.append(r4)
            r4 = 41
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L38:
            return
    }

    protected final void checkReadableBytes(int r2) {
            r1 = this;
            java.lang.String r0 = "minimumReadableBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.checkReadableBytes0(r2)
            return
    }

    protected final void checkSrcIndex(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.checkIndex(r1, r2)
            boolean r1 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r1 == 0) goto Lc
            java.lang.String r1 = "srcIndex"
            checkRangeBounds(r1, r3, r2, r4)
        Lc:
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf clear() {
            r1 = this;
            r0 = 0
            r1.writerIndex = r0
            r1.readerIndex = r0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int compareTo(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            int r1 = io.netty.buffer.ByteBufUtil.compare(r0, r1)
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
            r2 = this;
            int r0 = r2.readerIndex
            int r1 = r2.readableBytes()
            io.netty.buffer.ByteBuf r0 = r2.copy(r0, r1)
            return r0
    }

    final void discardMarks() {
            r1 = this;
            r0 = 0
            r1.markedWriterIndex = r0
            r1.markedReaderIndex = r0
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r3 = this;
            r3.ensureAccessible()
            int r0 = r3.readerIndex
            if (r0 != 0) goto L8
            return r3
        L8:
            int r1 = r3.writerIndex
            r2 = 0
            if (r0 == r1) goto L1e
            int r1 = r1 - r0
            r3.setBytes(r2, r3, r0, r1)
            int r0 = r3.writerIndex
            int r1 = r3.readerIndex
            int r0 = r0 - r1
            r3.writerIndex = r0
            r3.adjustMarkers(r1)
            r3.readerIndex = r2
            return r3
        L1e:
            r3.adjustMarkers(r0)
            r3.readerIndex = r2
            r3.writerIndex = r2
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r3 = this;
            r3.ensureAccessible()
            int r0 = r3.readerIndex
            if (r0 != 0) goto L8
            goto L31
        L8:
            int r1 = r3.writerIndex
            r2 = 0
            if (r0 != r1) goto L15
            r3.adjustMarkers(r0)
            r3.readerIndex = r2
            r3.writerIndex = r2
            return r3
        L15:
            int r1 = r3.capacity()
            int r1 = r1 >>> 1
            if (r0 < r1) goto L31
            int r0 = r3.readerIndex
            int r1 = r3.writerIndex
            int r1 = r1 - r0
            r3.setBytes(r2, r3, r0, r1)
            int r0 = r3.writerIndex
            int r1 = r3.readerIndex
            int r0 = r0 - r1
            r3.writerIndex = r0
            r3.adjustMarkers(r1)
            r3.readerIndex = r2
        L31:
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            r1.ensureAccessible()
            io.netty.buffer.UnpooledDuplicatedByteBuf r0 = new io.netty.buffer.UnpooledDuplicatedByteBuf
            r0.<init>(r1)
            return r0
    }

    protected final void ensureAccessible() {
            r2 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkAccessible
            if (r0 == 0) goto L12
            boolean r0 = r2.isAccessible()
            if (r0 == 0) goto Lb
            goto L12
        Lb:
            io.netty.util.IllegalReferenceCountException r0 = new io.netty.util.IllegalReferenceCountException
            r1 = 0
            r0.<init>(r1)
            throw r0
        L12:
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public int ensureWritable(int r4, boolean r5) {
            r3 = this;
            r3.ensureAccessible()
            java.lang.String r0 = "minWritableBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            int r0 = r3.writableBytes()
            if (r4 > r0) goto L10
            r4 = 0
            return r4
        L10:
            int r0 = r3.maxCapacity()
            int r1 = r3.writerIndex()
            int r2 = r0 - r1
            if (r4 <= r2) goto L2c
            if (r5 == 0) goto L2a
            int r4 = r3.capacity()
            if (r4 != r0) goto L25
            goto L2a
        L25:
            r3.capacity(r0)
            r4 = 3
            return r4
        L2a:
            r4 = 1
            return r4
        L2c:
            int r4 = r4 + r1
            io.netty.buffer.ByteBufAllocator r5 = r3.alloc()
            int r5 = r5.calculateNewCapacity(r4, r0)
            int r0 = r3.maxFastWritableBytes()
            int r1 = r1 + r0
            if (r5 <= r1) goto L3f
            if (r4 > r1) goto L3f
            r5 = r1
        L3f:
            r3.capacity(r5)
            r4 = 2
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r2) {
            r1 = this;
            java.lang.String r0 = "minWritableBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.ensureWritable0(r2)
            return r1
    }

    final void ensureWritable0(int r6) {
            r5 = this;
            r5.ensureAccessible()
            int r0 = r5.writableBytes()
            if (r6 > r0) goto La
            return
        La:
            int r0 = r5.writerIndex()
            boolean r1 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r1 == 0) goto L41
            int r1 = r5.maxCapacity
            int r1 = r1 - r0
            if (r6 > r1) goto L18
            goto L41
        L18:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r5.maxCapacity
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r2
            r6 = 3
            r3[r6] = r5
            java.lang.String r6 = "writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        L41:
            int r6 = r6 + r0
            io.netty.buffer.ByteBufAllocator r1 = r5.alloc()
            int r2 = r5.maxCapacity
            int r1 = r1.calculateNewCapacity(r6, r2)
            int r2 = r5.maxFastWritableBytes()
            int r0 = r0 + r2
            if (r1 <= r0) goto L56
            if (r6 > r0) goto L56
            r1 = r0
        L56:
            r5.capacity(r1)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L11
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lf
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            boolean r2 = io.netty.buffer.ByteBufUtil.equals(r1, r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            int r2 = r2 + r1
            int r1 = r0.forEachByteAsc0(r1, r2, r3)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r1)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r3) {
            r2 = this;
            r2.ensureAccessible()
            int r0 = r2.readerIndex     // Catch: java.lang.Exception -> Lc
            int r1 = r2.writerIndex     // Catch: java.lang.Exception -> Lc
            int r3 = r2.forEachByteAsc0(r0, r1, r3)     // Catch: java.lang.Exception -> Lc
            return r3
        Lc:
            r3 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r3)
            r3 = -1
            return r3
    }

    int forEachByteAsc0(int r2, int r3, io.netty.util.ByteProcessor r4) throws java.lang.Exception {
            r1 = this;
        L0:
            if (r2 >= r3) goto L10
            byte r0 = r1._getByte(r2)
            boolean r0 = r4.process(r0)
            if (r0 != 0) goto Ld
            return r2
        Ld:
            int r2 = r2 + 1
            goto L0
        L10:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r1, int r2, io.netty.util.ByteProcessor r3) {
            r0 = this;
            r0.checkIndex(r1, r2)
            int r2 = r2 + r1
            int r2 = r2 + (-1)
            int r1 = r0.forEachByteDesc0(r2, r1, r3)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r1)
            r1 = -1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r3) {
            r2 = this;
            r2.ensureAccessible()
            int r0 = r2.writerIndex     // Catch: java.lang.Exception -> Le
            int r0 = r0 + (-1)
            int r1 = r2.readerIndex     // Catch: java.lang.Exception -> Le
            int r3 = r2.forEachByteDesc0(r0, r1, r3)     // Catch: java.lang.Exception -> Le
            return r3
        Le:
            r3 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r3)
            r3 = -1
            return r3
    }

    int forEachByteDesc0(int r2, int r3, io.netty.util.ByteProcessor r4) throws java.lang.Exception {
            r1 = this;
        L0:
            if (r2 < r3) goto L10
            byte r0 = r1._getByte(r2)
            boolean r0 = r4.process(r0)
            if (r0 != 0) goto Ld
            return r2
        Ld:
            int r2 = r2 + (-1)
            goto L0
        L10:
            r2 = -1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean getBoolean(int r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            r0.checkIndex(r1)
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            int r0 = r3.writableBytes()
            r1.getBytes(r2, r3, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            int r0 = r3.writerIndex()
            r1.getBytes(r2, r3, r0, r4)
            int r2 = r3.writerIndex()
            int r2 = r2 + r4
            r3.writerIndex(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r3, byte[] r4) {
            r2 = this;
            r0 = 0
            int r1 = r4.length
            r2.getBytes(r3, r4, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public char getChar(int r1) {
            r0 = this;
            short r1 = r0.getShort(r1)
            char r1 = (char) r1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L16
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.ISO_8859_1
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.lang.String r2 = r1.toString(r2, r3, r4)
            return r2
        L16:
            io.netty.util.AsciiString r4 = new io.netty.util.AsciiString
            r0 = 1
            byte[] r2 = io.netty.buffer.ByteBufUtil.getBytes(r1, r2, r3, r0)
            r3 = 0
            r4.<init>(r2, r3)
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float getFloat(int r1) {
            r0 = this;
            int r1 = r0.getInt(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            int r2 = r1._getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            int r2 = r1._getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            long r0 = r2._getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            r0 = 8
            r2.checkIndex(r3, r0)
            long r0 = r2._getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            int r2 = r1.getUnsignedMedium(r2)
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r2
            if (r0 == 0) goto Lc
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
        Lc:
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            int r2 = r1.getUnsignedMediumLE(r2)
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r2
            if (r0 == 0) goto Lc
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
        Lc:
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            short r2 = r1._getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            short r2 = r1._getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            short r1 = (short) r1
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r5) {
            r4 = this;
            int r5 = r4.getInt(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r5) {
            r4 = this;
            int r5 = r4.getIntLE(r5)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            int r2 = r1._getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            int r2 = r1._getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            short r2 = r1.getShort(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            short r2 = r1.getShortLE(r2)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int hashCode() {
            r1 = this;
            int r0 = io.netty.buffer.ByteBufUtil.hashCode(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int indexOf(int r1, int r2, byte r3) {
            r0 = this;
            int r1 = io.netty.buffer.ByteBufUtil.indexOf(r0, r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable() {
            r2 = this;
            int r0 = r2.writerIndex
            int r1 = r2.readerIndex
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isReadable(int r3) {
            r2 = this;
            int r0 = r2.writerIndex
            int r1 = r2.readerIndex
            int r0 = r0 - r1
            if (r0 < r3) goto L9
            r3 = 1
            return r3
        L9:
            r3 = 0
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable() {
            r2 = this;
            int r0 = r2.capacity()
            int r1 = r2.writerIndex
            if (r0 <= r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isWritable(int r3) {
            r2 = this;
            int r0 = r2.capacity()
            int r1 = r2.writerIndex
            int r0 = r0 - r1
            if (r0 < r3) goto Lb
            r3 = 1
            return r3
        Lb:
            r3 = 0
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            int r0 = r1.readerIndex
            r1.markedReaderIndex = r0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            int r0 = r1.writerIndex
            r1.markedWriterIndex = r0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxCapacity() {
            r1 = this;
            int r0 = r1.maxCapacity
            return r0
    }

    protected final void maxCapacity(int r1) {
            r0 = this;
            r0.maxCapacity = r1
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public int maxWritableBytes() {
            r2 = this;
            int r0 = r2.maxCapacity()
            int r1 = r2.writerIndex
            int r0 = r0 - r1
            return r0
    }

    protected io.netty.buffer.SwappedByteBuf newSwappedByteBuf() {
            r1 = this;
            io.netty.buffer.SwappedByteBuf r0 = new io.netty.buffer.SwappedByteBuf
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r2 = this;
            int r0 = r2.readerIndex
            int r1 = r2.readableBytes()
            java.nio.ByteBuffer r0 = r2.nioBuffer(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r2 = this;
            int r0 = r2.readerIndex
            int r1 = r2.readableBytes()
            java.nio.ByteBuffer[] r0 = r2.nioBuffers(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            java.nio.ByteOrder r0 = r1.order()
            if (r2 != r0) goto L7
            return r1
        L7:
            if (r2 == 0) goto Le
            io.netty.buffer.SwappedByteBuf r2 = r1.newSwappedByteBuf()
            return r2
        Le:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "endianness"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean readBoolean() {
            r1 = this;
            byte r0 = r1.readByte()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte readByte() {
            r3 = this;
            r0 = 1
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            byte r2 = r3._getByte(r1)
            int r1 = r1 + r0
            r3.readerIndex = r1
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r7, long r8, int r10) throws java.io.IOException {
            r6 = this;
            r6.checkReadableBytes(r10)
            int r1 = r6.readerIndex
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            int r7 = r0.getBytes(r1, r2, r3, r5)
            int r8 = r0.readerIndex
            int r8 = r8 + r7
            r0.readerIndex = r8
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            r1.checkReadableBytes(r3)
            int r0 = r1.readerIndex
            int r2 = r1.getBytes(r0, r2, r3)
            int r3 = r1.readerIndex
            int r3 = r3 + r2
            r1.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r3) {
            r2 = this;
            r2.checkReadableBytes(r3)
            if (r3 != 0) goto L8
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r3
        L8:
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()
            int r1 = r2.maxCapacity
            io.netty.buffer.ByteBuf r0 = r0.buffer(r3, r1)
            int r1 = r2.readerIndex
            r0.writeBytes(r2, r1, r3)
            int r1 = r2.readerIndex
            int r1 = r1 + r3
            r2.readerIndex = r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.writableBytes()
            r1.readBytes(r2, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r5, int r6) {
            r4 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto L2f
            int r0 = r5.writableBytes()
            if (r6 > r0) goto Lb
            goto L2f
        Lb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r5.writableBytes()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r1
            r6 = 2
            r2[r6] = r5
            java.lang.String r5 = "length(%d) exceeds dst.writableBytes(%d) where dst is: %s"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r0.<init>(r5)
            throw r0
        L2f:
            int r0 = r5.writerIndex()
            r4.readBytes(r5, r0, r6)
            int r0 = r5.writerIndex()
            int r0 = r0 + r6
            r5.writerIndex(r0)
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            r1.checkReadableBytes(r4)
            int r0 = r1.readerIndex
            r1.getBytes(r0, r2, r3, r4)
            int r2 = r1.readerIndex
            int r2 = r2 + r4
            r1.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r1.checkReadableBytes(r3)
            int r0 = r1.readerIndex
            r1.getBytes(r0, r2, r3)
            int r2 = r1.readerIndex
            int r2 = r2 + r3
            r1.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = r3.remaining()
            r2.checkReadableBytes(r0)
            int r1 = r2.readerIndex
            r2.getBytes(r1, r3)
            int r3 = r2.readerIndex
            int r3 = r3 + r0
            r2.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.readBytes(r3, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.checkReadableBytes(r4)
            int r0 = r1.readerIndex
            r1.getBytes(r0, r2, r3, r4)
            int r2 = r1.readerIndex
            int r2 = r2 + r4
            r1.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            short r0 = r1.readShort()
            char r0 = (char) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r2, java.nio.charset.Charset r3) {
            r1 = this;
            int r0 = r1.readerIndex
            java.lang.CharSequence r3 = r1.getCharSequence(r0, r2, r3)
            int r0 = r1.readerIndex
            int r0 = r0 + r2
            r1.readerIndex = r0
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public double readDouble() {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readInt() {
            r3 = this;
            r0 = 4
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            int r1 = r3._getInt(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readIntLE() {
            r3 = this;
            r0 = 4
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            int r1 = r3._getIntLE(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLong() {
            r4 = this;
            r0 = 8
            r4.checkReadableBytes0(r0)
            int r1 = r4.readerIndex
            long r1 = r4._getLong(r1)
            int r3 = r4.readerIndex
            int r3 = r3 + r0
            r4.readerIndex = r3
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public long readLongLE() {
            r4 = this;
            r0 = 8
            r4.checkReadableBytes0(r0)
            int r1 = r4.readerIndex
            long r1 = r4._getLongLE(r1)
            int r3 = r4.readerIndex
            int r3 = r3 + r0
            r4.readerIndex = r3
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMedium() {
            r2 = this;
            int r0 = r2.readUnsignedMedium()
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 & r0
            if (r1 == 0) goto Lc
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 | r1
        Lc:
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r2 = this;
            int r0 = r2.readUnsignedMediumLE()
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 & r0
            if (r1 == 0) goto Lc
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 | r1
        Lc:
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r3) {
            r2 = this;
            r2.checkReadableBytes(r3)
            int r0 = r2.readerIndex
            io.netty.buffer.ByteBuf r0 = r2.retainedSlice(r0, r3)
            int r1 = r2.readerIndex
            int r1 = r1 + r3
            r2.readerIndex = r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShort() {
            r3 = this;
            r0 = 2
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            short r1 = r3._getShort(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public short readShortLE() {
            r3 = this;
            r0 = 2
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            short r1 = r3._getShortLE(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r3) {
            r2 = this;
            r2.checkReadableBytes(r3)
            int r0 = r2.readerIndex
            io.netty.buffer.ByteBuf r0 = r2.slice(r0, r3)
            int r1 = r2.readerIndex
            int r1 = r1 + r3
            r2.readerIndex = r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            byte r0 = r1.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r4 = this;
            int r0 = r4.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r4 = this;
            int r0 = r4.readIntLE()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r3 = this;
            r0 = 3
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            int r1 = r3._getUnsignedMedium(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r3 = this;
            r0 = 3
            r3.checkReadableBytes0(r0)
            int r1 = r3.readerIndex
            int r1 = r3._getUnsignedMediumLE(r1)
            int r2 = r3.readerIndex
            int r2 = r2 + r0
            r3.readerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r2 = this;
            short r0 = r2.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r2 = this;
            short r0 = r2.readShortLE()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readableBytes() {
            r2 = this;
            int r0 = r2.writerIndex
            int r1 = r2.readerIndex
            int r0 = r0 - r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int readerIndex() {
            r1 = this;
            int r0 = r1.readerIndex
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readerIndex(int r3) {
            r2 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Ld
            int r0 = r2.writerIndex
            int r1 = r2.capacity()
            checkIndexBounds(r3, r0, r1)
        Ld:
            r2.readerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            int r0 = r1.markedReaderIndex
            r1.readerIndex(r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf resetWriterIndex() {
            r1 = this;
            int r0 = r1.markedWriterIndex
            r1.writerIndex(r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.duplicate()
            io.netty.buffer.ByteBuf r0 = r0.retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.slice()
            io.netty.buffer.ByteBuf r0 = r0.retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.slice(r1, r2)
            io.netty.buffer.ByteBuf r1 = r1.retain()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            r0.setByte(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            r0.checkIndex(r1)
            r0._setByte(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            int r0 = r3.readableBytes()
            r1.setBytes(r2, r3, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            r1.checkIndex(r2, r4)
            if (r3 == 0) goto L1c
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Lc
            checkReadableBounds(r3, r4)
        Lc:
            int r0 = r3.readerIndex()
            r1.setBytes(r2, r3, r0, r4)
            int r2 = r3.readerIndex()
            int r2 = r2 + r4
            r3.readerIndex(r2)
            return r1
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "src"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r3, byte[] r4) {
            r2 = this;
            r0 = 0
            int r1 = r4.length
            r2.setBytes(r3, r4, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            r0.setShort(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int setCharSequence(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r1 = this;
            r0 = 0
            int r2 = r1.setCharSequence0(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.setLong(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.setInt(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIndex(int r2, int r3) {
            r1 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Lb
            int r0 = r1.capacity()
            checkIndexBounds(r2, r3, r0)
        Lb:
            r1.setIndex0(r2, r3)
            return r1
    }

    final void setIndex0(int r1, int r2) {
            r0 = this;
            r0.readerIndex = r1
            r0.writerIndex = r2
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setIntLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLongLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMediumLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShortLE(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r4, int r5) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L39
        L3:
            r3.checkIndex(r4, r5)
            int r0 = r5 >>> 3
            r5 = r5 & 7
        La:
            if (r0 <= 0) goto L16
            r1 = 0
            r3._setLong(r4, r1)
            int r4 = r4 + 8
            int r0 = r0 + (-1)
            goto La
        L16:
            r0 = 0
            r1 = 4
            if (r5 != r1) goto L1e
            r3._setInt(r4, r0)
            return r3
        L1e:
            if (r5 >= r1) goto L2a
        L20:
            if (r5 <= 0) goto L39
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L20
        L2a:
            r3._setInt(r4, r0)
            int r4 = r4 + r1
            int r5 = r5 - r1
        L2f:
            if (r5 <= 0) goto L39
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L2f
        L39:
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf skipBytes(int r2) {
            r1 = this;
            r1.checkReadableBytes(r2)
            int r0 = r1.readerIndex
            int r0 = r0 + r2
            r1.readerIndex = r0
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r2 = this;
            int r0 = r2.readerIndex
            int r1 = r2.readableBytes()
            io.netty.buffer.ByteBuf r0 = r2.slice(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            r1.ensureAccessible()
            io.netty.buffer.UnpooledSlicedByteBuf r0 = new io.netty.buffer.UnpooledSlicedByteBuf
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.refCnt()
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(freed)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = "(ridx: "
            r0.append(r1)
            int r1 = r3.readerIndex
            r0.append(r1)
            java.lang.String r1 = ", widx: "
            r0.append(r1)
            int r1 = r3.writerIndex
            r0.append(r1)
            java.lang.String r1 = ", cap: "
            r0.append(r1)
            int r1 = r3.capacity()
            r0.append(r1)
            int r1 = r3.maxCapacity
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L59
            r1 = 47
            r0.append(r1)
            int r1 = r3.maxCapacity
            r0.append(r1)
        L59:
            io.netty.buffer.ByteBuf r1 = r3.unwrap()
            if (r1 == 0) goto L67
            java.lang.String r2 = ", unwrapped: "
            r0.append(r2)
            r0.append(r1)
        L67:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(int r1, int r2, java.nio.charset.Charset r3) {
            r0 = this;
            java.lang.String r1 = io.netty.buffer.ByteBufUtil.decodeString(r0, r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r3) {
            r2 = this;
            int r0 = r2.readerIndex
            int r1 = r2.readableBytes()
            java.lang.String r3 = r2.toString(r0, r1, r3)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int writableBytes() {
            r2 = this;
            int r0 = r2.capacity()
            int r1 = r2.writerIndex
            int r0 = r0 - r1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBoolean(boolean r1) {
            r0 = this;
            r0.writeByte(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeByte(int r3) {
            r2 = this;
            r0 = 1
            r2.ensureWritable0(r0)
            int r0 = r2.writerIndex
            int r1 = r0 + 1
            r2.writerIndex = r1
            r2._setByte(r0, r3)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r1.ensureWritable(r3)
            int r0 = r1.writerIndex
            int r2 = r1.setBytes(r0, r2, r3)
            if (r2 <= 0) goto L10
            int r3 = r1.writerIndex
            int r3 = r3 + r2
            r1.writerIndex = r3
        L10:
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r7, long r8, int r10) throws java.io.IOException {
            r6 = this;
            r6.ensureWritable(r10)
            int r1 = r6.writerIndex
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r10
            int r7 = r0.setBytes(r1, r2, r3, r5)
            if (r7 <= 0) goto L14
            int r8 = r0.writerIndex
            int r8 = r8 + r7
            r0.writerIndex = r8
        L14:
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            r1.ensureWritable(r3)
            int r0 = r1.writerIndex
            int r2 = r1.setBytes(r0, r2, r3)
            if (r2 <= 0) goto L10
            int r3 = r1.writerIndex
            int r3 = r3 + r2
            r1.writerIndex = r3
        L10:
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.readableBytes()
            r1.writeBytes(r2, r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto L7
            checkReadableBounds(r2, r3)
        L7:
            int r0 = r2.readerIndex()
            r1.writeBytes(r2, r0, r3)
            int r0 = r2.readerIndex()
            int r0 = r0 + r3
            r2.readerIndex(r0)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            r1.ensureWritable(r4)
            int r0 = r1.writerIndex
            r1.setBytes(r0, r2, r3, r4)
            int r2 = r1.writerIndex
            int r2 = r2 + r4
            r1.writerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = r3.remaining()
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2.setBytes(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writeBytes(r3, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.ensureWritable(r4)
            int r0 = r1.writerIndex
            r1.setBytes(r0, r2, r3, r4)
            int r2 = r1.writerIndex
            int r2 = r2 + r4
            r1.writerIndex = r2
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            r0.writeShort(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r2 = this;
            int r0 = r2.writerIndex
            r1 = 1
            int r3 = r2.setCharSequence0(r0, r3, r4, r1)
            int r4 = r2.writerIndex
            int r4 = r4 + r3
            r2.writerIndex = r4
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeLong(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.writeInt(r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r3) {
            r2 = this;
            r0 = 4
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setInt(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r3) {
            r2 = this;
            r0 = 4
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setIntLE(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r3) {
            r2 = this;
            r0 = 8
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setLong(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r3) {
            r2 = this;
            r0 = 8
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setLongLE(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r3) {
            r2 = this;
            r0 = 3
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setMedium(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r3) {
            r2 = this;
            r0 = 3
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setMediumLE(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r3) {
            r2 = this;
            r0 = 2
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setShort(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r3) {
            r2 = this;
            r0 = 2
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            r2._setShortLE(r1, r3)
            int r3 = r2.writerIndex
            int r3 = r3 + r0
            r2.writerIndex = r3
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return r4
        L3:
            r4.ensureWritable(r5)
            int r0 = r4.writerIndex
            r4.checkIndex0(r0, r5)
            int r1 = r5 >>> 3
            r5 = r5 & 7
        Lf:
            if (r1 <= 0) goto L1b
            r2 = 0
            r4._setLong(r0, r2)
            int r0 = r0 + 8
            int r1 = r1 + (-1)
            goto Lf
        L1b:
            r1 = 0
            r2 = 4
            if (r5 != r2) goto L24
            r4._setInt(r0, r1)
            int r0 = r0 + r2
            goto L3f
        L24:
            if (r5 >= r2) goto L30
        L26:
            if (r5 <= 0) goto L3f
            r4._setByte(r0, r1)
            int r0 = r0 + 1
            int r5 = r5 + (-1)
            goto L26
        L30:
            r4._setInt(r0, r1)
            int r0 = r0 + r2
            int r5 = r5 - r2
        L35:
            if (r5 <= 0) goto L3f
            r4._setByte(r0, r1)
            int r0 = r0 + 1
            int r5 = r5 + (-1)
            goto L35
        L3f:
            r4.writerIndex = r0
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public int writerIndex() {
            r1 = this;
            int r0 = r1.writerIndex
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writerIndex(int r3) {
            r2 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkBounds
            if (r0 == 0) goto Ld
            int r0 = r2.readerIndex
            int r1 = r2.capacity()
            checkIndexBounds(r0, r3, r1)
        Ld:
            r2.writerIndex = r3
            return r2
    }
}
