package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ByteBufInputStream extends java.io.InputStream implements java.io.DataInput {
    private final io.netty.buffer.ByteBuf buffer;
    private boolean closed;
    private final int endIndex;
    private java.lang.StringBuilder lineBuf;
    private final boolean releaseOnClose;
    private final int startIndex;

    public ByteBufInputStream(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.readableBytes()
            r1.<init>(r2, r0)
            return
    }

    public ByteBufInputStream(io.netty.buffer.ByteBuf r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ByteBufInputStream(io.netty.buffer.ByteBuf r3, int r4, boolean r5) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L62
            if (r4 >= 0) goto L23
            if (r5 == 0) goto Lc
            r3.release()
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "length: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L23:
            int r0 = r3.readableBytes()
            if (r4 <= r0) goto L51
            if (r5 == 0) goto L2e
            r3.release()
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many bytes to be read - Needs "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ", maximum is "
            r0.append(r4)
            int r3 = r3.readableBytes()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L51:
            r2.releaseOnClose = r5
            r2.buffer = r3
            int r5 = r3.readerIndex()
            r2.startIndex = r5
            int r5 = r5 + r4
            r2.endIndex = r5
            r3.markReaderIndex()
            return
        L62:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "buffer"
            r3.<init>(r4)
            throw r3
    }

    public ByteBufInputStream(io.netty.buffer.ByteBuf r2, boolean r3) {
            r1 = this;
            int r0 = r2.readableBytes()
            r1.<init>(r2, r0, r3)
            return
    }

    private void checkAvailable(int r4) throws java.io.IOException {
            r3 = this;
            if (r4 < 0) goto L2c
            int r0 = r3.available()
            if (r4 > r0) goto L9
            return
        L9:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fieldSize is too long! Length is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", but maximum is "
            r1.append(r4)
            int r4 = r3.available()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "fieldSize cannot be a negative number"
            r4.<init>(r0)
            throw r4
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            int r0 = r2.endIndex
            io.netty.buffer.ByteBuf r1 = r2.buffer
            int r1 = r1.readerIndex()
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            r0 = 1
            super.close()     // Catch: java.lang.Throwable -> L14
            boolean r1 = r3.releaseOnClose
            if (r1 == 0) goto L13
            boolean r1 = r3.closed
            if (r1 != 0) goto L13
            r3.closed = r0
            io.netty.buffer.ByteBuf r0 = r3.buffer
            r0.release()
        L13:
            return
        L14:
            r1 = move-exception
            boolean r2 = r3.releaseOnClose
            if (r2 == 0) goto L24
            boolean r2 = r3.closed
            if (r2 != 0) goto L24
            r3.closed = r0
            io.netty.buffer.ByteBuf r0 = r3.buffer
            r0.release()
        L24:
            throw r1
    }

    @Override // java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.buffer
            r1.markReaderIndex()
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            io.netty.buffer.ByteBuf r0 = r1.buffer
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            if (r0 != 0) goto L8
            r2 = -1
            return r2
        L8:
            int r4 = java.lang.Math.min(r0, r4)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2, r3, r4)
            return r4
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.checkAvailable(r0)
            int r1 = r2.read()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            if (r0 == 0) goto Ld
            io.netty.buffer.ByteBuf r0 = r1.buffer
            byte r0 = r0.readByte()
            return r0
        Ld:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public int readBytes() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.readerIndex()
            int r1 = r2.startIndex
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
            r1 = this;
            short r0 = r1.readShort()
            char r0 = (char) r0
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
    public void readFully(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.readFully(r3, r0, r1)
            return
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.checkAvailable(r4)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2, r3, r4)
            return
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.checkAvailable(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readInt()
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() throws java.io.IOException {
            r4 = this;
            int r0 = r4.available()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.StringBuilder r1 = r4.lineBuf
            if (r1 == 0) goto L10
            r2 = 0
            r1.setLength(r2)
        L10:
            io.netty.buffer.ByteBuf r1 = r4.buffer
            short r1 = r1.readUnsignedByte()
            int r0 = r0 + (-1)
            r2 = 10
            if (r1 == r2) goto L49
            r3 = 13
            if (r1 == r3) goto L34
            java.lang.StringBuilder r2 = r4.lineBuf
            if (r2 != 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4.lineBuf = r2
        L2b:
            java.lang.StringBuilder r2 = r4.lineBuf
            char r1 = (char) r1
            r2.append(r1)
            if (r0 > 0) goto L10
            goto L49
        L34:
            if (r0 <= 0) goto L49
            io.netty.buffer.ByteBuf r0 = r4.buffer
            int r1 = r0.readerIndex()
            short r0 = r0.getUnsignedByte(r1)
            char r0 = (char) r0
            if (r0 != r2) goto L49
            io.netty.buffer.ByteBuf r0 = r4.buffer
            r1 = 1
            r0.skipBytes(r1)
        L49:
            java.lang.StringBuilder r0 = r4.lineBuf
            if (r0 == 0) goto L5a
            int r0 = r0.length()
            if (r0 <= 0) goto L5a
            java.lang.StringBuilder r0 = r4.lineBuf
            java.lang.String r0 = r0.toString()
            return r0
        L5a:
            java.lang.String r0 = ""
            return r0
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
            r2 = this;
            r0 = 8
            r2.checkAvailable(r0)
            io.netty.buffer.ByteBuf r0 = r2.buffer
            long r0 = r0.readLong()
            return r0
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.checkAvailable(r0)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r0 = r0.readShort()
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = java.io.DataInputStream.readUTF(r1)
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            byte r0 = r1.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
            r2 = this;
            short r0 = r2.readShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.resetReaderIndex()
            return
    }

    @Override // java.io.InputStream
    public long skip(long r4) throws java.io.IOException {
            r3 = this;
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r3.skipBytes(r4)
        Le:
            long r4 = (long) r4
            return r4
        L10:
            int r5 = (int) r4
            int r4 = r3.skipBytes(r5)
            goto Le
    }

    @Override // java.io.DataInput
    public int skipBytes(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            int r2 = java.lang.Math.min(r0, r2)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.skipBytes(r2)
            return r2
    }
}
