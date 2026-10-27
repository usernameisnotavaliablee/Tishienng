package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends java.io.FilterInputStream {
    private final java.net.Socket a;

    public h(java.net.Socket r1, java.io.InputStream r2) {
            r0 = this;
            r0.<init>(r2)
            r0.a = r1
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()
            java.net.Socket r0 = r1.a
            r0.close()
            return
    }
}
