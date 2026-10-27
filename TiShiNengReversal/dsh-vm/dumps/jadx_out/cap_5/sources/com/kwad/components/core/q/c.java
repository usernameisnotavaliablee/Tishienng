package com.kwad.components.core.q;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends java.io.InputStream {
    private int XO;
    private int XP;
    private long XQ;
    private java.io.InputStream XR;
    private int XS;
    private long XT;
    private volatile float XU;
    private volatile long XV;
    private int XW;

    c(@androidx.annotation.NonNull java.io.InputStream r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.XO = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.XP = r0
            r0 = -1
            r2.XQ = r0
            r2.XT = r0
            r0 = 20480(0x5000, float:2.8699E-41)
            r2.XW = r0
            if (r4 >= r0) goto L18
            r4 = 20480(0x5000, float:2.8699E-41)
        L18:
            r2.XR = r3
            float r3 = (float) r4
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            r2.XU = r3
            return
    }

    @androidx.annotation.WorkerThread
    private static void N(long r0) {
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L3
        L3:
            return
    }

    private static long g(long r3, long r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            r3 = -1
            return r3
        Le:
            long r3 = r3 / r5
            return r3
    }

    private void sD() {
            r2 = this;
            r0 = 0
            r2.XO = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.XQ = r0
            return
    }

    private void sE() {
            r7 = this;
            int r0 = r7.XO
            int r1 = r7.XP
            if (r0 >= r1) goto L7
            return
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.XQ
            long r2 = r0 - r2
            int r4 = r7.XO
            float r4 = (float) r4
            float r5 = r7.XU
            float r4 = r4 / r5
            long r5 = r7.XT
            long r0 = r0 - r5
            int r5 = r7.XS
            long r5 = (long) r5
            long r0 = g(r5, r0)
            r7.XV = r0
            float r0 = (float) r2
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L2b
            float r4 = r4 - r0
            long r0 = (long) r4
            N(r0)
        L2b:
            r7.sD()
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r1 = this;
            java.io.InputStream r0 = r1.XR
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.io.InputStream r0 = r2.XR
            r0.close()
            com.kwad.components.core.q.b.a(r2)
            r0 = -1
            r2.XT = r0
            return
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.XR     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.XR
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r5 = this;
            long r0 = r5.XT
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.XT = r0
        Le:
            int r0 = r5.XS
            int r0 = r0 + 1
            r5.XS = r0
            boolean r0 = com.kwad.components.core.q.b.XM
            if (r0 == 0) goto L33
            boolean r0 = com.kwad.components.core.q.b.XL
            if (r0 == 0) goto L33
            int r0 = r5.XO
            if (r0 >= 0) goto L23
            r5.sD()
        L23:
            java.io.InputStream r0 = r5.XR
            int r0 = r0.read()
            int r1 = r5.XO
            int r1 = r1 + 1
            r5.XO = r1
            r5.sE()
            return r0
        L33:
            java.io.InputStream r0 = r5.XR
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.XR     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    public final long sC() {
            r2 = this;
            long r0 = r2.XV
            return r0
    }

    @Override // java.io.InputStream
    public final long skip(long r2) {
            r1 = this;
            java.io.InputStream r0 = r1.XR
            long r2 = r0.skip(r2)
            return r2
    }
}
