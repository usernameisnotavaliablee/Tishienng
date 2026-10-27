package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ByteArrayDataOutput extends java.io.DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int r1);

    @Override // java.io.DataOutput
    void write(byte[] r1);

    @Override // java.io.DataOutput
    void write(byte[] r1, int r2, int r3);

    @Override // java.io.DataOutput
    void writeBoolean(boolean r1);

    @Override // java.io.DataOutput
    void writeByte(int r1);

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    void writeBytes(java.lang.String r1);

    @Override // java.io.DataOutput
    void writeChar(int r1);

    @Override // java.io.DataOutput
    void writeChars(java.lang.String r1);

    @Override // java.io.DataOutput
    void writeDouble(double r1);

    @Override // java.io.DataOutput
    void writeFloat(float r1);

    @Override // java.io.DataOutput
    void writeInt(int r1);

    @Override // java.io.DataOutput
    void writeLong(long r1);

    @Override // java.io.DataOutput
    void writeShort(int r1);

    @Override // java.io.DataOutput
    void writeUTF(java.lang.String r1);
}
