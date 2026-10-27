package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class k extends java.io.FilterOutputStream {
    private boolean a;

    public k(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r0 = 10
            r1 = 13
            if (r3 == r0) goto L16
            if (r3 == r1) goto La
            goto L1f
        La:
            r3 = 1
            r2.a = r3     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r3 = r2.out     // Catch: java.lang.Throwable -> L14
            r3.write(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            goto L29
        L16:
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L1f
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> L14
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
        L1f:
            r0 = 0
            r2.a = r0     // Catch: java.lang.Throwable -> L14
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> L14
            r0.write(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r2.write(r3, r1, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
        L1:
            int r0 = r4 + (-1)
            if (r4 <= 0) goto L12
            int r4 = r3 + 1
            r3 = r2[r3]     // Catch: java.lang.Throwable -> Lf
            r1.write(r3)     // Catch: java.lang.Throwable -> Lf
            r3 = r4
            r4 = r0
            goto L1
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        L12:
            monitor-exit(r1)
            return
    }
}
