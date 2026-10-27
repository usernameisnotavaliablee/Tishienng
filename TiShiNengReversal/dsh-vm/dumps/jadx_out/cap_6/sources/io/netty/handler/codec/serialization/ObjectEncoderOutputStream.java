package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ObjectEncoderOutputStream extends java.io.OutputStream implements java.io.ObjectOutput {
    private final int estimatedLength;
    private final java.io.DataOutputStream out;

    public ObjectEncoderOutputStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.<init>(r2, r0)
            return
    }

    public ObjectEncoderOutputStream(java.io.OutputStream r3, int r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L31
            if (r4 < 0) goto L1a
            boolean r0 = r3 instanceof java.io.DataOutputStream
            if (r0 == 0) goto L10
            java.io.DataOutputStream r3 = (java.io.DataOutputStream) r3
            r2.out = r3
            goto L17
        L10:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r3)
            r2.out = r0
        L17:
            r2.estimatedLength = r4
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "estimatedLength: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L31:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "out"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectOutput
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable, java.io.ObjectOutput
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.flush()
            return
    }

    public final int size() {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            int r0 = r0.size()
            return r0
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.write(r2)
            return
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.write(r2)
            return
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeBoolean(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeByte(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeBytes(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeBytes(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeChar(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeChar(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeChars(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeChars(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeDouble(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeFloat(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeInt(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeInt(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeLong(long r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeLong(r2)
            return
    }

    @Override // java.io.ObjectOutput
    public void writeObject(java.lang.Object r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.estimatedLength
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer(r0)
            io.netty.handler.codec.serialization.CompactObjectOutputStream r1 = new io.netty.handler.codec.serialization.CompactObjectOutputStream     // Catch: java.lang.Throwable -> L28
            io.netty.buffer.ByteBufOutputStream r2 = new io.netty.buffer.ByteBufOutputStream     // Catch: java.lang.Throwable -> L28
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            r1.writeObject(r4)     // Catch: java.lang.Throwable -> L2a
            r1.flush()     // Catch: java.lang.Throwable -> L2a
            r1.close()     // Catch: java.lang.Throwable -> L28
            int r4 = r0.readableBytes()     // Catch: java.lang.Throwable -> L28
            r3.writeInt(r4)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            r0.getBytes(r1, r3, r4)     // Catch: java.lang.Throwable -> L28
            r0.release()
            return
        L28:
            r4 = move-exception
            goto L2f
        L2a:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L28
            throw r4     // Catch: java.lang.Throwable -> L28
        L2f:
            r0.release()
            throw r4
    }

    @Override // java.io.DataOutput
    public final void writeShort(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeShort(r2)
            return
    }

    @Override // java.io.DataOutput
    public final void writeUTF(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.DataOutputStream r0 = r1.out
            r0.writeUTF(r2)
            return
    }
}
