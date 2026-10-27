package xyz.adscope.common.network.connect.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class NullStream extends java.io.InputStream {
    private final xyz.adscope.common.network.connect.Connection a;

    public NullStream(xyz.adscope.common.network.connect.Connection r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.io.InputStream
    public int available() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            xyz.adscope.common.network.connect.Connection r0 = r1.a
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return
    }

    @Override // java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.io.InputStream
    public void reset() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public long skip(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
