package com.kwad.framework.filedownloader.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface a extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void seek(long r1);

    void setLength(long r1);

    void write(byte[] r1, int r2, int r3);

    void zw();
}
