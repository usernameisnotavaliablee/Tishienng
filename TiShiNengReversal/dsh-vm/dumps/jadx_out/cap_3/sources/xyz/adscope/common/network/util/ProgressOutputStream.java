package xyz.adscope.common.network.util;

import xyz.adscope.common.network.Content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ProgressOutputStream<T extends xyz.adscope.common.network.Content> extends java.io.OutputStream {
    private java.io.OutputStream a;
    private T b;
    private xyz.adscope.common.network.ProgressBar<T> c;
    private long d;
    private long e;
    private int f;

    public ProgressOutputStream(java.io.OutputStream r1, T r2, xyz.adscope.common.network.ProgressBar<T> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            long r1 = r2.contentLength()
            r0.d = r1
            return
    }

    private void a() {
            r6 = this;
            long r0 = r6.d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L21
            long r2 = r6.e
            r4 = 100
            long r2 = r2 * r4
            long r2 = r2 / r0
            int r0 = (int) r2
            int r1 = r6.f
            if (r0 <= r1) goto L21
            int r1 = r0 % 2
            if (r1 != 0) goto L21
            r6.f = r0
            xyz.adscope.common.network.ProgressBar<T extends xyz.adscope.common.network.Content> r1 = r6.c
            T extends xyz.adscope.common.network.Content r2 = r6.b
            r1.progress(r2, r0)
        L21:
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.OutputStream r0 = r1.a
            r0.close()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r1 = this;
            java.io.OutputStream r0 = r1.a
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r5) {
            r4 = this;
            java.io.OutputStream r0 = r4.a
            r0.write(r5)
            long r0 = r4.e
            r2 = 1
            long r0 = r0 + r2
            r4.e = r0
            r4.a()
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r5) {
            r4 = this;
            java.io.OutputStream r0 = r4.a
            r0.write(r5)
            long r0 = r4.e
            int r5 = r5.length
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.e = r0
            r4.a()
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) {
            r2 = this;
            java.io.OutputStream r0 = r2.a
            r0.write(r3, r4, r5)
            long r3 = r2.e
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.e = r3
            r2.a()
            return
    }
}
