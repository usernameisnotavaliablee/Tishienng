package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
    private java.nio.ByteOrder mByteOrder;
    final java.io.OutputStream mOutputStream;

    ByteOrderedDataOutputStream(java.io.OutputStream r1, java.nio.ByteOrder r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mOutputStream = r1
            r0.mByteOrder = r2
            return
    }

    public void setByteOrder(java.nio.ByteOrder r1) {
            r0 = this;
            r0.mByteOrder = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.mOutputStream
            r0.write(r2)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.mOutputStream
            r0.write(r2, r3, r4)
            return
    }

    public void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.mOutputStream
            r0.write(r2)
            return
    }

    public void writeInt(int r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteOrder r0 = r2.mByteOrder
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r1) goto L29
            java.io.OutputStream r0 = r2.mOutputStream
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r3 = r3 >>> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
        L29:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L4f
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
        L4f:
            return
    }

    public void writeShort(short r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteOrder r0 = r2.mByteOrder
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r1) goto L17
            java.io.OutputStream r0 = r2.mOutputStream
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            int r3 = r3 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
        L17:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L2b
            java.io.OutputStream r0 = r2.mOutputStream
            int r1 = r3 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.mOutputStream
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
        L2b:
            return
    }

    public void writeUnsignedInt(long r1) throws java.io.IOException {
            r0 = this;
            int r2 = (int) r1
            r0.writeInt(r2)
            return
    }

    public void writeUnsignedShort(int r1) throws java.io.IOException {
            r0 = this;
            short r1 = (short) r1
            r0.writeShort(r1)
            return
    }
}
