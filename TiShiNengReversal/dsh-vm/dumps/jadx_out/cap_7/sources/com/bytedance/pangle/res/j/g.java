package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class g extends java.io.FilterInputStream implements java.io.DataInput {
    public g(com.bytedance.pangle.res.j.up r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static int j(byte r0, byte r1, byte r2, byte r3) {
            int r0 = r0 << 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public static long j(byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12) {
            long r0 = (long) r5
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r5 = 56
            long r0 = r0 << r5
            long r5 = (long) r6
            long r5 = r5 & r2
            r4 = 48
            long r5 = r5 << r4
            long r5 = r5 | r0
            long r0 = (long) r7
            long r0 = r0 & r2
            r7 = 40
            long r0 = r0 << r7
            long r5 = r5 | r0
            long r7 = (long) r8
            long r7 = r7 & r2
            r0 = 32
            long r7 = r7 << r0
            long r5 = r5 | r7
            long r7 = (long) r9
            long r7 = r7 & r2
            r9 = 24
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r10
            long r7 = r7 & r2
            r9 = 16
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r11
            long r7 = r7 & r2
            r9 = 8
            long r7 = r7 << r9
            long r5 = r5 | r7
            long r7 = (long) r12
            long r7 = r7 & r2
            long r5 = r5 | r7
            return r5
    }

    private byte xt() throws java.io.IOException, java.io.EOFException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r1 == r0) goto Lb
            byte r0 = (byte) r0
            return r0
        Lb:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public com.bytedance.pangle.res.j.up j() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            com.bytedance.pangle.res.j.up r0 = (com.bytedance.pangle.res.j.up) r0
            return r0
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedByte()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedByte()
            byte r0 = (byte) r0
            return r0
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedShort()
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
    public void readFully(byte[] r1) throws java.io.IOException {
            r0 = this;
            com.bytedance.pangle.res.j.r.j(r0, r1)
            return
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            com.bytedance.pangle.res.j.r.j(r0, r1, r2, r3)
            return
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
            r4 = this;
            byte r0 = r4.xt()
            byte r1 = r4.xt()
            byte r2 = r4.xt()
            byte r3 = r4.xt()
            int r0 = j(r3, r2, r1, r0)
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "readLine is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
            r8 = this;
            byte r7 = r8.xt()
            byte r6 = r8.xt()
            byte r5 = r8.xt()
            byte r4 = r8.xt()
            byte r3 = r8.xt()
            byte r2 = r8.xt()
            byte r1 = r8.xt()
            byte r0 = r8.xt()
            long r0 = j(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
            r1 = this;
            int r0 = r1.readUnsignedShort()
            short r0 = (short) r0
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r2.in
            r0.<init>(r1)
            java.lang.String r0 = r0.readUTF()
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.read()
            if (r0 < 0) goto L9
            return r0
        L9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
            r3 = this;
            byte r0 = r3.xt()
            byte r1 = r3.xt()
            r2 = 0
            int r0 = j(r2, r2, r1, r0)
            return r0
    }

    @Override // java.io.DataInput
    public int skipBytes(int r4) throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            long r1 = (long) r4
            long r0 = r0.skip(r1)
            int r4 = (int) r0
            return r4
    }
}
