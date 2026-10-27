package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class LittleEndianDataOutputStream extends java.io.FilterOutputStream implements java.io.DataOutput {
    public LittleEndianDataOutputStream(java.io.OutputStream r2) {
            r1 = this;
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            r0.writeBoolean(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            r0.writeByte(r2)
            return
    }

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    public void writeBytes(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            r0.writeBytes(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeChar(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeShort(r1)
            return
    }

    @Override // java.io.DataOutput
    public void writeChars(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L11
            char r1 = r3.charAt(r0)
            r2.writeChar(r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // java.io.DataOutput
    public void writeDouble(double r1) throws java.io.IOException {
            r0 = this;
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r0.writeLong(r1)
            return
    }

    @Override // java.io.DataOutput
    public void writeFloat(float r1) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0.writeInt(r1)
            return
    }

    @Override // java.io.DataOutput
    public void writeInt(int r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r1 = r3 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r1 = r3 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
    }

    @Override // java.io.DataOutput
    public void writeLong(long r2) throws java.io.IOException {
            r1 = this;
            long r2 = java.lang.Long.reverseBytes(r2)
            byte[] r2 = com.google.common.primitives.Longs.toByteArray(r2)
            r3 = 0
            int r0 = r2.length
            r1.write(r2, r3, r0)
            return
    }

    @Override // java.io.DataOutput
    public void writeShort(int r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
    }

    @Override // java.io.DataOutput
    public void writeUTF(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            r0.writeUTF(r2)
            return
    }
}
