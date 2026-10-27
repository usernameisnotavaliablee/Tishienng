package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CountingInputStream extends java.io.FilterInputStream {
    private long count;
    private long mark;

    public CountingInputStream(java.io.InputStream r3) {
            r2 = this;
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r2.<init>(r3)
            r0 = -1
            r2.mark = r0
            return
    }

    public long getCount() {
            r2 = this;
            long r0 = r2.count
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.count     // Catch: java.lang.Throwable -> Lc
            r2.mark = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L10
            long r1 = r5.count
            r3 = 1
            long r1 = r1 + r3
            r5.count = r1
        L10:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r3 = r0.read(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.count
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.count = r4
        Lf:
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L26
            long r0 = r5.mark     // Catch: java.lang.Throwable -> L1c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1e
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L1c
            r0.reset()     // Catch: java.lang.Throwable -> L1c
            long r0 = r5.mark     // Catch: java.lang.Throwable -> L1c
            r5.count = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r5)
            return
        L1c:
            r0 = move-exception
            goto L2e
        L1e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "Mark not set"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L1c
        L26:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "Mark not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L1c
        L2e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            long r3 = r0.skip(r3)
            long r0 = r2.count
            long r0 = r0 + r3
            r2.count = r0
            return r3
    }
}
