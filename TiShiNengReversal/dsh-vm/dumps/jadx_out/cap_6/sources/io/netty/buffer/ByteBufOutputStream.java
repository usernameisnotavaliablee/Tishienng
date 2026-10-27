package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ByteBufOutputStream extends java.io.OutputStream implements java.io.DataOutput {
    private final io.netty.buffer.ByteBuf buffer;
    private final int startIndex;
    private final java.io.DataOutputStream utf8out;

    public ByteBufOutputStream(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r1.<init>()
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r1)
            r1.utf8out = r0
            if (r2 == 0) goto L15
            r1.buffer = r2
            int r2 = r2.writerIndex()
            r1.startIndex = r2
            return
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "buffer"
            r2.<init>(r0)
            throw r2
    }

    public io.netty.buffer.ByteBuf buffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            return r0
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeByte(r2)
            return
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeBytes(r2)
            return
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L3
            return
        L3:
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeBytes(r2, r3, r4)
            return
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeBoolean(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeByte(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeBytes(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buffer
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.US_ASCII
            r0.writeCharSequence(r3, r1)
            return
    }

    @Override // java.io.DataOutput
    public void writeChar(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeChar(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeChars(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            io.netty.buffer.ByteBuf r2 = r4.buffer
            char r3 = r5.charAt(r1)
            r2.writeChar(r3)
            int r1 = r1 + 1
            goto L5
        L13:
            return
    }

    @Override // java.io.DataOutput
    public void writeDouble(double r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeDouble(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeFloat(float r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeFloat(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeInt(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeInt(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeLong(long r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeLong(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeShort(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            short r2 = (short) r2
            r0.writeShort(r2)
            return
    }

    @Override // java.io.DataOutput
    public void writeUTF(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.utf8out
            r0.writeUTF(r2)
            return
    }

    public int writtenBytes() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buffer
            int r0 = r0.writerIndex()
            int r1 = r2.startIndex
            int r0 = r0 - r1
            return r0
    }
}
