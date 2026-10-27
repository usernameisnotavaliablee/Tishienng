package org.apache.commons.net.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class g extends java.io.FilterOutputStream {
    private boolean a;

    public g(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.a = r1
            return
    }

    private void a(int r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            r1 = 10
            if (r4 == r1) goto L1e
            r1 = 13
            if (r4 == r1) goto L1a
            boolean r2 = r3.a
            if (r2 == 0) goto L14
            java.io.OutputStream r2 = r3.out
            r2.write(r1)
            r3.a = r0
        L14:
            java.io.OutputStream r0 = r3.out
            r0.write(r4)
            return
        L1a:
            r4 = 1
            r3.a = r4
            return
        L1e:
            boolean r4 = r3.a
            if (r4 == 0) goto L2c
            java.io.OutputStream r4 = r3.out
            byte[] r1 = org.apache.commons.net.io.f.d
            r4.write(r1)
            r3.a = r0
            return
        L2c:
            r3.a = r0
            java.io.OutputStream r4 = r3.out
            r4.write(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = org.apache.commons.net.io.f.b     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            super.close()     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            goto L1c
        Lc:
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L17
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> La
            r1 = 13
            r0.write(r1)     // Catch: java.lang.Throwable -> La
        L17:
            super.close()     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = org.apache.commons.net.io.f.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lc
            r0.write(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            goto L13
        Le:
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
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
            boolean r0 = org.apache.commons.net.io.f.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lc
            r0.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            goto L1e
        Le:
            int r0 = r4 + (-1)
            if (r4 <= 0) goto L1c
            int r4 = r3 + 1
            r3 = r2[r3]     // Catch: java.lang.Throwable -> Lc
            r1.a(r3)     // Catch: java.lang.Throwable -> Lc
            r3 = r4
            r4 = r0
            goto Le
        L1c:
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
