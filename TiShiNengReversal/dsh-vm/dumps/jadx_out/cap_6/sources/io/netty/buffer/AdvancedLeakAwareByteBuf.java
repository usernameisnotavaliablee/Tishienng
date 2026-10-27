package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class AdvancedLeakAwareByteBuf extends io.netty.buffer.SimpleLeakAwareByteBuf {
    private static final boolean ACQUIRE_AND_RELEASE_ONLY = false;
    private static final java.lang.String PROP_ACQUIRE_AND_RELEASE_ONLY = "io.netty.leakDetection.acquireAndReleaseOnly";
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    static {
            java.lang.Class<io.netty.buffer.AdvancedLeakAwareByteBuf> r0 = io.netty.buffer.AdvancedLeakAwareByteBuf.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.buffer.AdvancedLeakAwareByteBuf.logger = r1
            r2 = 0
            java.lang.String r3 = "io.netty.leakDetection.acquireAndReleaseOnly"
            boolean r2 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r3, r2)
            io.netty.buffer.AdvancedLeakAwareByteBuf.ACQUIRE_AND_RELEASE_ONLY = r2
            boolean r4 = r1.isDebugEnabled()
            if (r4 == 0) goto L20
            java.lang.String r4 = "-D{}: {}"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.debug(r4, r3, r2)
        L20:
            java.lang.String r1 = "touch"
            java.lang.String r2 = "recordLeakNonRefCountingOperation"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            io.netty.util.ResourceLeakDetector.addExclusions(r0, r1)
            return
    }

    AdvancedLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    AdvancedLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static void recordLeakNonRefCountingOperation(io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r1) {
            boolean r0 = io.netty.buffer.AdvancedLeakAwareByteBuf.ACQUIRE_AND_RELEASE_ONLY
            if (r0 != 0) goto L7
            r1.record()
        L7:
            return
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.asReadOnly()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(byte r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.bytesBefore(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, byte r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.bytesBefore(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int bytesBefore(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.bytesBefore(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.capacity(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.copy()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.copy(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.discardReadBytes()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.discardSomeReadBytes()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.duplicate()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int ensureWritable(int r2, boolean r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.ensureWritable(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf ensureWritable(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.ensureWritable(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.forEachByte(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int forEachByte(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.forEachByte(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(int r2, int r3, io.netty.util.ByteProcessor r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.forEachByteDesc(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int forEachByteDesc(io.netty.util.ByteProcessor r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.forEachByteDesc(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public boolean getBoolean(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            boolean r2 = super.getBoolean(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            byte r2 = super.getByte(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.FileChannel r3, long r4, int r6) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getBytes(r2, r3, r4, r6)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getBytes(int r2, java.nio.channels.GatheringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3, r4, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.io.OutputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.getBytes(r2, r3, r4, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public char getChar(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            char r2 = super.getChar(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.lang.CharSequence getCharSequence(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.lang.CharSequence r2 = super.getCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public double getDouble(int r3) {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            double r0 = super.getDouble(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public float getFloat(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            float r2 = super.getFloat(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getInt(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getInt(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getIntLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long getLong(int r3) {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.getLong(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long getLongLE(int r3) {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.getLongLE(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getMedium(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getMediumLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short getShort(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r2 = super.getShort(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short getShortLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r2 = super.getShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short getUnsignedByte(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r2 = super.getUnsignedByte(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long getUnsignedInt(int r3) {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.getUnsignedInt(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int r3) {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.getUnsignedIntLE(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getUnsignedMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getUnsignedMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedShort(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getUnsignedShort(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.getUnsignedShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int indexOf(int r2, int r3, byte r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.indexOf(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.nio.ByteBuffer r2 = super.internalNioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf
    protected io.netty.buffer.AdvancedLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r4) {
            r1 = this;
            io.netty.buffer.AdvancedLeakAwareByteBuf r0 = new io.netty.buffer.AdvancedLeakAwareByteBuf
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf
    protected /* bridge */ /* synthetic */ io.netty.buffer.SimpleLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2, io.netty.util.ResourceLeakTracker r3) {
            r0 = this;
            io.netty.buffer.AdvancedLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.nio.ByteBuffer r0 = super.nioBuffer()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.nio.ByteBuffer r2 = super.nioBuffer(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.nio.ByteBuffer[] r0 = super.nioBuffers()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.nio.ByteBuffer[] r2 = super.nioBuffers(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.order(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public boolean readBoolean() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            boolean r0 = super.readBoolean()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public byte readByte() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            byte r0 = super.readByte()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.readBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readBytes(java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.readBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public char readChar() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            char r0 = super.readChar()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.lang.CharSequence readCharSequence(int r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.lang.CharSequence r2 = super.readCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public double readDouble() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            double r0 = super.readDouble()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public float readFloat() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            float r0 = super.readFloat()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readInt() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readInt()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readIntLE() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readIntLE()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long readLong() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.readLong()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long readLongLE() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.readLongLE()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readMedium() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readMedium()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readMediumLE() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readMediumLE()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readRetainedSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short readShort() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r0 = super.readShort()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short readShortLE() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r0 = super.readShortLE()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.readSlice(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            short r0 = super.readUnsignedByte()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.readUnsignedInt()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            recordLeakNonRefCountingOperation(r0)
            long r0 = super.readUnsignedIntLE()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readUnsignedMedium()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readUnsignedMediumLE()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readUnsignedShort()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r0 = super.readUnsignedShortLE()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf
    public boolean release() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record()
            boolean r0 = super.release()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf
    public boolean release(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record()
            boolean r2 = super.release(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record()
            io.netty.buffer.ByteBuf r0 = super.retain()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record()
            io.netty.buffer.ByteBuf r2 = super.retain(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.retainedSlice()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.retainedSlice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBoolean(int r2, boolean r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBoolean(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setByte(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.io.InputStream r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.FileChannel r3, long r4, int r6) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.setBytes(r2, r3, r4, r6)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int setBytes(int r2, java.nio.channels.ScatteringByteChannel r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3, r4, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r2, byte[] r3, int r4, int r5) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setBytes(r2, r3, r4, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setChar(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setChar(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int setCharSequence(int r2, java.lang.CharSequence r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.setCharSequence(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setDouble(int r2, double r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setDouble(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setFloat(int r2, float r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setFloat(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setInt(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setIntLE(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setIntLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r2, long r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setLong(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLongLE(int r2, long r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setLongLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setMedium(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMediumLE(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setMediumLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setShort(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShortLE(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setShortLE(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setZero(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.setZero(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf skipBytes(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.skipBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r0 = super.slice()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.slice(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString(int r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.lang.String r2 = super.toString(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            java.lang.String r2 = super.toString(r2)
            return r2
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record()
            return r1
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.record(r2)
            return r1
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.SimpleLeakAwareByteBuf, io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBoolean(boolean r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBoolean(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeByte(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeByte(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.writeBytes(r2, r3, r5)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int writeBytes(java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeBytes(byte[] r2, int r3, int r4) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeBytes(r2, r3, r4)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeChar(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeChar(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public int writeCharSequence(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            int r2 = super.writeCharSequence(r2, r3)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeDouble(double r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeDouble(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeFloat(float r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeFloat(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeInt(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeInt(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeIntLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeIntLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLong(long r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeLong(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeLongLE(long r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeLongLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMedium(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeMedium(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeMediumLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeMediumLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShort(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeShort(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeShortLE(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeShortLE(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf writeZero(int r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            recordLeakNonRefCountingOperation(r0)
            io.netty.buffer.ByteBuf r2 = super.writeZero(r2)
            return r2
    }
}
