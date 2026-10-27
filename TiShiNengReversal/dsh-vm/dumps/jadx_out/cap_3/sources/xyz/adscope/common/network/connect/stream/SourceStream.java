package xyz.adscope.common.network.connect.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SourceStream extends java.io.InputStream {
    private final xyz.adscope.common.network.connect.Connection a;
    private final java.io.InputStream b;

    public SourceStream(xyz.adscope.common.network.connect.Connection r1, java.io.InputStream r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.io.InputStream
    public int available() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            xyz.adscope.common.network.connect.Connection r0 = r1.a
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.b     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r4) {
            r3 = this;
            java.io.InputStream r0 = r3.b
            int r1 = r4.length
            r2 = 0
            int r4 = r0.read(r4, r2, r1)
            return r4
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.InputStream r0 = r1.b
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.InputStream
    public void reset() {
            r1 = this;
            java.io.InputStream r0 = r1.b
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public long skip(long r2) {
            r1 = this;
            java.io.InputStream r0 = r1.b
            long r2 = r0.skip(r2)
            return r2
    }
}
