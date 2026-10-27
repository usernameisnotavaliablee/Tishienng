package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d extends java.io.InputStream {

    @androidx.annotation.GuardedBy("POOL")
    private static final java.util.Queue<com.bumptech.glide.util.d> c = null;
    private java.io.InputStream a;
    private java.io.IOException b;

    static {
            r0 = 0
            java.util.Queue r0 = com.bumptech.glide.util.l.f(r0)
            com.bumptech.glide.util.d.c = r0
            return
    }

    d() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a() {
            java.util.Queue<com.bumptech.glide.util.d> r0 = com.bumptech.glide.util.d.c
            monitor-enter(r0)
        L3:
            java.util.Queue<com.bumptech.glide.util.d> r1 = com.bumptech.glide.util.d.c     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L11
            r1.remove()     // Catch: java.lang.Throwable -> Lf
            goto L3
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.util.d c(@androidx.annotation.NonNull java.io.InputStream r2) {
            java.util.Queue<com.bumptech.glide.util.d> r0 = com.bumptech.glide.util.d.c
            monitor-enter(r0)
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.util.d r1 = (com.bumptech.glide.util.d) r1     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L11
            com.bumptech.glide.util.d r1 = new com.bumptech.glide.util.d
            r1.<init>()
        L11:
            r1.d(r2)
            return r1
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a
            int r0 = r0.available()
            return r0
    }

    @androidx.annotation.Nullable
    public java.io.IOException b() {
            r1 = this;
            java.io.IOException r0 = r1.b
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a
            r0.close()
            return
    }

    void d(@androidx.annotation.NonNull java.io.InputStream r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.InputStream r0 = r1.a
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.a
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a     // Catch: java.io.IOException -> L7
            int r0 = r0.read()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            r1.b = r0
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.b = r2
            throw r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a     // Catch: java.io.IOException -> L7
            int r2 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.b = r2
            throw r2
    }

    public void release() {
            r2 = this;
            r0 = 0
            r2.b = r0
            r2.a = r0
            java.util.Queue<com.bumptech.glide.util.d> r0 = com.bumptech.glide.util.d.c
            monitor-enter(r0)
            r0.offer(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.a     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.a     // Catch: java.io.IOException -> L7
            long r2 = r0.skip(r2)     // Catch: java.io.IOException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.b = r2
            throw r2
    }
}
