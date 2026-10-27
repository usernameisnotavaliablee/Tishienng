package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class oq extends java.io.FilterInputStream {
    public oq(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            int r0 = super.available()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            r1.j(r0)
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in     // Catch: java.io.IOException -> L6
            r0.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            r1.j(r0)
            return
    }

    protected void j(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void j(java.io.IOException r1) throws java.io.IOException {
            r0 = this;
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            r0 = -1
            java.io.InputStream r1 = r3.in     // Catch: java.io.IOException -> L10
            int r1 = r1.read()     // Catch: java.io.IOException -> L10
            if (r1 == r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = -1
        Lc:
            r3.j(r2)     // Catch: java.io.IOException -> L10
            return r1
        L10:
            r1 = move-exception
            r3.j(r1)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in     // Catch: java.io.IOException -> La
            int r2 = r0.read(r2)     // Catch: java.io.IOException -> La
            r1.j(r2)     // Catch: java.io.IOException -> La
            return r2
        La:
            r2 = move-exception
            r1.j(r2)
            r2 = -1
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in     // Catch: java.io.IOException -> La
            int r2 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> La
            r1.j(r2)     // Catch: java.io.IOException -> La
            return r2
        La:
            r2 = move-exception
            r1.j(r2)
            r2 = -1
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L8 java.io.IOException -> La
            r0.reset()     // Catch: java.lang.Throwable -> L8 java.io.IOException -> La
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            goto L10
        La:
            r0 = move-exception
            r1.j(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in     // Catch: java.io.IOException -> L7
            long r2 = r0.skip(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.j(r2)
            r2 = 0
            return r2
    }
}
