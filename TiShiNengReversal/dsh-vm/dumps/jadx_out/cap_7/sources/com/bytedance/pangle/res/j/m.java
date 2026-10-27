package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class m implements java.io.DataInput {
    public final com.bytedance.pangle.res.j.g j;

    public m(com.bytedance.pangle.res.j.g r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            byte r0 = r0.readByte()
            return r0
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            char r0 = r0.readChar()
            return r0
    }

    @Override // java.io.DataInput
    public double readDouble() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.res.j.g r0 = r2.j
            double r0 = r0.readDouble()
            return r0
    }

    @Override // java.io.DataInput
    public float readFloat() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            float r0 = r0.readFloat()
            return r0
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r2) throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            r0.readFully(r2)
            return
    }

    @Override // java.io.DataInput
    public void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            r0.readFully(r2, r3, r4)
            return
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            int r0 = r0.readInt()
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            java.lang.String r0 = r0.readLine()
            return r0
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.res.j.g r0 = r2.j
            long r0 = r0.readLong()
            return r0
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            short r0 = r0.readShort()
            return r0
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            java.lang.String r0 = r0.readUTF()
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            int r0 = r0.readUnsignedByte()
            return r0
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            int r0 = r0.readUnsignedShort()
            return r0
    }

    @Override // java.io.DataInput
    public int skipBytes(int r2) throws java.io.IOException {
            r1 = this;
            com.bytedance.pangle.res.j.g r0 = r1.j
            int r2 = r0.skipBytes(r2)
            return r2
    }
}
