package xyz.adscope.common.network.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LengthOutputStream extends java.io.OutputStream {
    private final java.util.concurrent.atomic.AtomicLong a;

    public LengthOutputStream() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.a = r0
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    public long getLength() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.a
            long r0 = r0.get()
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r3 = r2.a
            r0 = 1
            r3.addAndGet(r0)
            return
    }

    public void write(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.a
            r0.addAndGet(r2)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r3.a
            int r4 = r4.length
            long r1 = (long) r4
            r0.addAndGet(r1)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r1, int r2, int r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r1 = r0.a
            long r2 = (long) r3
            r1.addAndGet(r2)
            return
    }
}
