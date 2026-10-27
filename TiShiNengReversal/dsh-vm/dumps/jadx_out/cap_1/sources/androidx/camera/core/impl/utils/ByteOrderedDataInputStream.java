package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
    private static final java.nio.ByteOrder BIG_ENDIAN = null;
    private static final java.nio.ByteOrder LITTLE_ENDIAN = null;
    private java.nio.ByteOrder mByteOrder;
    private final java.io.DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;

    static {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            androidx.camera.core.impl.utils.ByteOrderedDataInputStream.LITTLE_ENDIAN = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            androidx.camera.core.impl.utils.ByteOrderedDataInputStream.BIG_ENDIAN = r0
            return
    }

    ByteOrderedDataInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r2, r0)
            return
    }

    ByteOrderedDataInputStream(java.io.InputStream r3, java.nio.ByteOrder r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.mByteOrder = r0
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r3)
            r2.mDataInputStream = r0
            int r3 = r0.available()
            r2.mLength = r3
            r1 = 0
            r2.mPosition = r1
            r0.mark(r3)
            r2.mByteOrder = r4
            return
    }

    ByteOrderedDataInputStream(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.mDataInputStream
            int r0 = r0.available()
            return r0
    }

    public int getLength() {
            r1 = this;
            int r0 = r1.mLength
            return r0
    }

    @Override // java.io.InputStream
    public void mark(int r3) {
            r2 = this;
            java.io.DataInputStream r0 = r2.mDataInputStream
            monitor-enter(r0)
            java.io.DataInputStream r1 = r2.mDataInputStream     // Catch: java.lang.Throwable -> La
            r1.mark(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public int peek() {
            r1 = this;
            int r0 = r1.mPosition
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            int r0 = r1.mPosition
            int r0 = r0 + 1
            r1.mPosition = r0
            java.io.DataInputStream r0 = r1.mDataInputStream
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.mDataInputStream
            int r2 = r0.read(r2, r3, r4)
            int r3 = r1.mPosition
            int r3 = r3 + r2
            r1.mPosition = r3
            return r2
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
            r1 = this;
            int r0 = r1.mPosition
            int r0 = r0 + 1
            r1.mPosition = r0
            java.io.DataInputStream r0 = r1.mDataInputStream
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
            r2 = this;
            int r0 = r2.mPosition
            int r0 = r0 + 1
            r2.mPosition = r0
            int r1 = r2.mLength
            if (r0 > r1) goto L1a
            java.io.DataInputStream r0 = r2.mDataInputStream
            int r0 = r0.read()
            if (r0 < 0) goto L14
            byte r0 = (byte) r0
            return r0
        L14:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L1a:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
            r1 = this;
            int r0 = r1.mPosition
            int r0 = r0 + 2
            r1.mPosition = r0
            java.io.DataInputStream r0 = r1.mDataInputStream
            char r0 = r0.readChar()
            return r0
    }

    @Override // java.io.DataInput
    public double readDouble() throws java.io.IOException {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // java.io.DataInput
    public float readFloat() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.mPosition
            int r1 = r4.length
            int r0 = r0 + r1
            r3.mPosition = r0
            int r1 = r3.mLength
            if (r0 > r1) goto L1e
            java.io.DataInputStream r0 = r3.mDataInputStream
            r1 = 0
            int r2 = r4.length
            int r0 = r0.read(r4, r1, r2)
            int r4 = r4.length
            if (r0 != r4) goto L16
            return
        L16:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Couldn't read up to the length of buffer"
            r4.<init>(r0)
            throw r4
        L1e:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.mPosition
            int r0 = r0 + r5
            r2.mPosition = r0
            int r1 = r2.mLength
            if (r0 > r1) goto L1a
            java.io.DataInputStream r0 = r2.mDataInputStream
            int r3 = r0.read(r3, r4, r5)
            if (r3 != r5) goto L12
            return
        L12:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Couldn't read up to the length of buffer"
            r3.<init>(r4)
            throw r3
        L1a:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
            r6 = this;
            int r0 = r6.mPosition
            int r0 = r0 + 4
            r6.mPosition = r0
            int r1 = r6.mLength
            if (r0 > r1) goto L65
            java.io.DataInputStream r0 = r6.mDataInputStream
            int r0 = r0.read()
            java.io.DataInputStream r1 = r6.mDataInputStream
            int r1 = r1.read()
            java.io.DataInputStream r2 = r6.mDataInputStream
            int r2 = r2.read()
            java.io.DataInputStream r3 = r6.mDataInputStream
            int r3 = r3.read()
            r4 = r0 | r1
            r4 = r4 | r2
            r4 = r4 | r3
            if (r4 < 0) goto L5f
            java.nio.ByteOrder r4 = r6.mByteOrder
            java.nio.ByteOrder r5 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.LITTLE_ENDIAN
            if (r4 != r5) goto L38
            int r3 = r3 << 24
            int r2 = r2 << 16
            int r3 = r3 + r2
            int r1 = r1 << 8
            int r3 = r3 + r1
            int r3 = r3 + r0
            return r3
        L38:
            java.nio.ByteOrder r5 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.BIG_ENDIAN
            if (r4 != r5) goto L46
            int r0 = r0 << 24
            int r1 = r1 << 16
            int r0 = r0 + r1
            int r1 = r2 << 8
            int r0 = r0 + r1
            int r0 = r0 + r3
            return r0
        L46:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.nio.ByteOrder r2 = r6.mByteOrder
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5f:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L65:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "readLine() not implemented."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
            r19 = this;
            r0 = r19
            int r1 = r0.mPosition
            r2 = 8
            int r1 = r1 + r2
            r0.mPosition = r1
            int r3 = r0.mLength
            if (r1 > r3) goto Lb8
            java.io.DataInputStream r1 = r0.mDataInputStream
            int r1 = r1.read()
            java.io.DataInputStream r3 = r0.mDataInputStream
            int r3 = r3.read()
            java.io.DataInputStream r4 = r0.mDataInputStream
            int r4 = r4.read()
            java.io.DataInputStream r5 = r0.mDataInputStream
            int r5 = r5.read()
            java.io.DataInputStream r6 = r0.mDataInputStream
            int r6 = r6.read()
            java.io.DataInputStream r7 = r0.mDataInputStream
            int r7 = r7.read()
            java.io.DataInputStream r8 = r0.mDataInputStream
            int r8 = r8.read()
            java.io.DataInputStream r9 = r0.mDataInputStream
            int r9 = r9.read()
            r10 = r1 | r3
            r10 = r10 | r4
            r10 = r10 | r5
            r10 = r10 | r6
            r10 = r10 | r7
            r10 = r10 | r8
            r10 = r10 | r9
            if (r10 < 0) goto Lb2
            java.nio.ByteOrder r10 = r0.mByteOrder
            java.nio.ByteOrder r11 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.LITTLE_ENDIAN
            r14 = 32
            r15 = 40
            r16 = 48
            r17 = 56
            if (r10 != r11) goto L74
            long r9 = (long) r9
            long r9 = r9 << r17
            r11 = 16
            r18 = 24
            long r12 = (long) r8
            long r12 = r12 << r16
            long r9 = r9 + r12
            long r7 = (long) r7
            long r7 = r7 << r15
            long r9 = r9 + r7
            long r6 = (long) r6
            long r6 = r6 << r14
            long r9 = r9 + r6
            long r5 = (long) r5
            long r5 = r5 << r18
            long r9 = r9 + r5
            long r4 = (long) r4
            long r4 = r4 << r11
            long r9 = r9 + r4
            long r3 = (long) r3
            long r2 = r3 << r2
            long r9 = r9 + r2
            long r1 = (long) r1
            long r9 = r9 + r1
            return r9
        L74:
            r11 = 16
            r18 = 24
            java.nio.ByteOrder r12 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.BIG_ENDIAN
            if (r10 != r12) goto L99
            long r12 = (long) r1
            long r12 = r12 << r17
            r1 = 8
            long r2 = (long) r3
            long r2 = r2 << r16
            long r12 = r12 + r2
            long r2 = (long) r4
            long r2 = r2 << r15
            long r12 = r12 + r2
            long r2 = (long) r5
            long r2 = r2 << r14
            long r12 = r12 + r2
            long r2 = (long) r6
            long r2 = r2 << r18
            long r12 = r12 + r2
            long r2 = (long) r7
            long r2 = r2 << r11
            long r12 = r12 + r2
            long r2 = (long) r8
            long r1 = r2 << r1
            long r12 = r12 + r1
            long r1 = (long) r9
            long r12 = r12 + r1
            return r12
        L99:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid byte order: "
            r2.append(r3)
            java.nio.ByteOrder r3 = r0.mByteOrder
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lb2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        Lb8:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
            r4 = this;
            int r0 = r4.mPosition
            int r0 = r0 + 2
            r4.mPosition = r0
            int r1 = r4.mLength
            if (r0 > r1) goto L4d
            java.io.DataInputStream r0 = r4.mDataInputStream
            int r0 = r0.read()
            java.io.DataInputStream r1 = r4.mDataInputStream
            int r1 = r1.read()
            r2 = r0 | r1
            if (r2 < 0) goto L47
            java.nio.ByteOrder r2 = r4.mByteOrder
            java.nio.ByteOrder r3 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.LITTLE_ENDIAN
            if (r2 != r3) goto L25
            int r1 = r1 << 8
            int r1 = r1 + r0
            short r0 = (short) r1
            return r0
        L25:
            java.nio.ByteOrder r3 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.BIG_ENDIAN
            if (r2 != r3) goto L2e
            int r0 = r0 << 8
            int r0 = r0 + r1
            short r0 = (short) r0
            return r0
        L2e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.nio.ByteOrder r2 = r4.mByteOrder
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L4d:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
            r1 = this;
            int r0 = r1.mPosition
            int r0 = r0 + 2
            r1.mPosition = r0
            java.io.DataInputStream r0 = r1.mDataInputStream
            java.lang.String r0 = r0.readUTF()
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            int r0 = r1.mPosition
            int r0 = r0 + 1
            r1.mPosition = r0
            java.io.DataInputStream r0 = r1.mDataInputStream
            int r0 = r0.readUnsignedByte()
            return r0
    }

    public long readUnsignedInt() throws java.io.IOException {
            r4 = this;
            int r0 = r4.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
            r4 = this;
            int r0 = r4.mPosition
            int r0 = r0 + 2
            r4.mPosition = r0
            int r1 = r4.mLength
            if (r0 > r1) goto L4b
            java.io.DataInputStream r0 = r4.mDataInputStream
            int r0 = r0.read()
            java.io.DataInputStream r1 = r4.mDataInputStream
            int r1 = r1.read()
            r2 = r0 | r1
            if (r2 < 0) goto L45
            java.nio.ByteOrder r2 = r4.mByteOrder
            java.nio.ByteOrder r3 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.LITTLE_ENDIAN
            if (r2 != r3) goto L24
            int r1 = r1 << 8
            int r1 = r1 + r0
            return r1
        L24:
            java.nio.ByteOrder r3 = androidx.camera.core.impl.utils.ByteOrderedDataInputStream.BIG_ENDIAN
            if (r2 != r3) goto L2c
            int r0 = r0 << 8
            int r0 = r0 + r1
            return r0
        L2c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid byte order: "
            r1.append(r2)
            java.nio.ByteOrder r2 = r4.mByteOrder
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L4b:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public void seek(long r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.mPosition
            long r1 = (long) r0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            r0 = 0
            r4.mPosition = r0
            java.io.DataInputStream r0 = r4.mDataInputStream
            r0.reset()
            java.io.DataInputStream r0 = r4.mDataInputStream
            int r1 = r4.mLength
            r0.mark(r1)
            goto L19
        L17:
            long r0 = (long) r0
            long r5 = r5 - r0
        L19:
            int r6 = (int) r5
            int r5 = r4.skipBytes(r6)
            if (r5 != r6) goto L21
            return
        L21:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Couldn't seek up to the byteCount"
            r5.<init>(r6)
            throw r5
    }

    public void setByteOrder(java.nio.ByteOrder r1) {
            r0 = this;
            r0.mByteOrder = r1
            return
    }

    @Override // java.io.DataInput
    public int skipBytes(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.mLength
            int r1 = r3.mPosition
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r4, r0)
            r0 = 0
        La:
            if (r0 >= r4) goto L16
            java.io.DataInputStream r1 = r3.mDataInputStream
            int r2 = r4 - r0
            int r1 = r1.skipBytes(r2)
            int r0 = r0 + r1
            goto La
        L16:
            int r4 = r3.mPosition
            int r4 = r4 + r0
            r3.mPosition = r4
            return r0
    }
}
