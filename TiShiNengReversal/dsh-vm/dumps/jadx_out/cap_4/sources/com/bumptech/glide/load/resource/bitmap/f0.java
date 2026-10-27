package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f0 extends java.io.FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends java.io.IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public f0(@androidx.annotation.NonNull java.io.InputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    f0(@androidx.annotation.NonNull java.io.InputStream r1, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.d = r1
            r0.f = r2
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r2.c(r3, r1)
            byte[] r1 = (byte[]) r1
            r0.a = r1
            return
    }

    private int a(java.io.InputStream r6, byte[] r7) throws java.io.IOException {
            r5 = this;
            int r0 = r5.d
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L57
            int r3 = r5.e
            int r3 = r3 - r0
            int r4 = r5.c
            if (r3 < r4) goto Le
            goto L57
        Le:
            if (r0 != 0) goto L36
            int r2 = r7.length
            if (r4 <= r2) goto L36
            int r2 = r5.b
            int r3 = r7.length
            if (r2 != r3) goto L36
            int r0 = r7.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1e
            goto L1f
        L1e:
            r4 = r0
        L1f:
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r5.f
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.c(r4, r2)
            byte[] r0 = (byte[]) r0
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r1, r0, r1, r2)
            r5.a = r0
            com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r5.f
            r2.put(r7)
            r7 = r0
            goto L3d
        L36:
            if (r0 <= 0) goto L3d
            int r2 = r7.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r7, r0, r7, r1, r2)
        L3d:
            int r0 = r5.e
            int r2 = r5.d
            int r0 = r0 - r2
            r5.e = r0
            r5.d = r1
            r5.b = r1
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.e
            if (r6 > 0) goto L53
            goto L54
        L53:
            int r7 = r7 + r6
        L54:
            r5.b = r7
            return r6
        L57:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L63
            r5.d = r2
            r5.e = r1
            r5.b = r6
        L63:
            return r6
    }

    private static java.io.IOException c() throws java.io.IOException {
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BufferedInputStream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.InputStream r0 = r3.in     // Catch: java.lang.Throwable -> L15
            byte[] r1 = r3.a     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            if (r0 == 0) goto L17
            int r1 = r3.b     // Catch: java.lang.Throwable -> L15
            int r2 = r3.e     // Catch: java.lang.Throwable -> L15
            int r1 = r1 - r2
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + r0
            monitor-exit(r3)
            return r1
        L15:
            r0 = move-exception
            goto L1c
        L17:
            java.io.IOException r0 = c()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.a     // Catch: java.lang.Throwable -> L8
            int r0 = r0.length     // Catch: java.lang.Throwable -> L8
            r1.c = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.a
            r1 = 0
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r3.f
            byte[] r2 = r3.a
            r0.put(r2)
            r3.a = r1
        Le:
            java.io.InputStream r0 = r3.in
            r3.in = r1
            if (r0 == 0) goto L17
            r0.close()
        L17:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.c     // Catch: java.lang.Throwable -> Lf
            int r2 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lf
            r1.c = r2     // Catch: java.lang.Throwable -> Lf
            int r2 = r1.e     // Catch: java.lang.Throwable -> Lf
            r1.d = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L18
            java.io.InputStream r1 = r5.in     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            int r2 = r5.e     // Catch: java.lang.Throwable -> L18
            int r3 = r5.b     // Catch: java.lang.Throwable -> L18
            r4 = -1
            if (r2 < r3) goto L1a
            int r1 = r5.a(r1, r0)     // Catch: java.lang.Throwable -> L18
            if (r1 != r4) goto L1a
            monitor-exit(r5)
            return r4
        L18:
            r0 = move-exception
            goto L40
        L1a:
            byte[] r1 = r5.a     // Catch: java.lang.Throwable -> L18
            if (r0 == r1) goto L28
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L23
            goto L28
        L23:
            java.io.IOException r0 = c()     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L28:
            int r1 = r5.b     // Catch: java.lang.Throwable -> L18
            int r2 = r5.e     // Catch: java.lang.Throwable -> L18
            int r1 = r1 - r2
            if (r1 <= 0) goto L39
            int r1 = r2 + 1
            r5.e = r1     // Catch: java.lang.Throwable -> L18
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L18
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L39:
            monitor-exit(r5)
            return r4
        L3b:
            java.io.IOException r0 = c()     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L40:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@androidx.annotation.NonNull byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L8d
            if (r9 != 0) goto La
            monitor-exit(r6)
            r7 = 0
            return r7
        La:
            java.io.InputStream r1 = r6.in     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L88
            int r2 = r6.e     // Catch: java.lang.Throwable -> L30
            int r3 = r6.b     // Catch: java.lang.Throwable -> L30
            if (r2 >= r3) goto L34
            int r4 = r3 - r2
            if (r4 < r9) goto L1a
            r3 = r9
            goto L1b
        L1a:
            int r3 = r3 - r2
        L1b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch: java.lang.Throwable -> L30
            int r2 = r6.e     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + r3
            r6.e = r2     // Catch: java.lang.Throwable -> L30
            if (r3 == r9) goto L32
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L2c
            goto L32
        L2c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L35
        L30:
            r7 = move-exception
            goto L92
        L32:
            monitor-exit(r6)
            return r3
        L34:
            r2 = r9
        L35:
            int r3 = r6.d     // Catch: java.lang.Throwable -> L30
            r4 = -1
            if (r3 != r4) goto L4a
            int r3 = r0.length     // Catch: java.lang.Throwable -> L30
            if (r2 < r3) goto L4a
            int r3 = r1.read(r7, r8, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 != r4) goto L78
            if (r2 != r9) goto L46
            goto L48
        L46:
            int r4 = r9 - r2
        L48:
            monitor-exit(r6)
            return r4
        L4a:
            int r3 = r6.a(r1, r0)     // Catch: java.lang.Throwable -> L30
            if (r3 != r4) goto L57
            if (r2 != r9) goto L53
            goto L55
        L53:
            int r4 = r9 - r2
        L55:
            monitor-exit(r6)
            return r4
        L57:
            byte[] r3 = r6.a     // Catch: java.lang.Throwable -> L30
            if (r0 == r3) goto L65
            byte[] r0 = r6.a     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L60
            goto L65
        L60:
            java.io.IOException r7 = c()     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.lang.Throwable -> L30
        L65:
            int r3 = r6.b     // Catch: java.lang.Throwable -> L30
            int r4 = r6.e     // Catch: java.lang.Throwable -> L30
            int r5 = r3 - r4
            if (r5 < r2) goto L6f
            r3 = r2
            goto L70
        L6f:
            int r3 = r3 - r4
        L70:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch: java.lang.Throwable -> L30
            int r4 = r6.e     // Catch: java.lang.Throwable -> L30
            int r4 = r4 + r3
            r6.e = r4     // Catch: java.lang.Throwable -> L30
        L78:
            int r2 = r2 - r3
            if (r2 != 0) goto L7d
            monitor-exit(r6)
            return r9
        L7d:
            int r4 = r1.available()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L86
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L86:
            int r8 = r8 + r3
            goto L35
        L88:
            java.io.IOException r7 = c()     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.lang.Throwable -> L30
        L8d:
            java.io.IOException r7 = c()     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.lang.Throwable -> L30
        L92:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L30
            throw r7
    }

    public synchronized void release() {
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r2.f     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r2.a     // Catch: java.lang.Throwable -> L10
            r0.put(r1)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            r2.a = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L14
        L12:
            monitor-exit(r2)
            return
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.a     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L33
            int r0 = r3.d     // Catch: java.lang.Throwable -> Le
            r1 = -1
            if (r1 == r0) goto L10
            r3.e = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return
        Le:
            r0 = move-exception
            goto L3b
        L10:
            com.bumptech.glide.load.resource.bitmap.f0$a r0 = new com.bumptech.glide.load.resource.bitmap.f0$a     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Mark has been invalidated, pos: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            int r2 = r3.e     // Catch: java.lang.Throwable -> Le
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = " markLimit: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            int r2 = r3.c     // Catch: java.lang.Throwable -> Le
            r1.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L33:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            throw r0     // Catch: java.lang.Throwable -> Le
        L3b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r11) throws java.io.IOException {
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r2 = 0
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lb
            monitor-exit(r10)
            return r2
        Lb:
            byte[] r0 = r10.a     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L70
            java.io.InputStream r1 = r10.in     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L6b
            int r4 = r10.b     // Catch: java.lang.Throwable -> L25
            int r5 = r10.e     // Catch: java.lang.Throwable -> L25
            int r6 = r4 - r5
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L25
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 < 0) goto L27
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L25
            long r0 = r0 + r11
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L25
            r10.e = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r10)
            return r11
        L25:
            r11 = move-exception
            goto L75
        L27:
            long r6 = (long) r4
            long r8 = (long) r5
            long r6 = r6 - r8
            r10.e = r4     // Catch: java.lang.Throwable -> L25
            int r4 = r10.d     // Catch: java.lang.Throwable -> L25
            r5 = -1
            if (r4 == r5) goto L5d
            int r4 = r10.c     // Catch: java.lang.Throwable -> L25
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L25
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 > 0) goto L5d
            int r0 = r10.a(r1, r0)     // Catch: java.lang.Throwable -> L25
            if (r0 != r5) goto L40
            monitor-exit(r10)
            return r6
        L40:
            int r0 = r10.b     // Catch: java.lang.Throwable -> L25
            int r1 = r10.e     // Catch: java.lang.Throwable -> L25
            int r2 = r0 - r1
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L25
            long r4 = r11 - r6
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L55
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L25
            long r0 = r0 + r11
            long r0 = r0 - r6
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L25
            r10.e = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r10)
            return r11
        L55:
            long r11 = (long) r0
            long r6 = r6 + r11
            long r11 = (long) r1
            long r6 = r6 - r11
            r10.e = r0     // Catch: java.lang.Throwable -> L25
            monitor-exit(r10)
            return r6
        L5d:
            long r11 = r11 - r6
            long r11 = r1.skip(r11)     // Catch: java.lang.Throwable -> L25
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L68
            r10.d = r5     // Catch: java.lang.Throwable -> L25
        L68:
            long r6 = r6 + r11
            monitor-exit(r10)
            return r6
        L6b:
            java.io.IOException r11 = c()     // Catch: java.lang.Throwable -> L25
            throw r11     // Catch: java.lang.Throwable -> L25
        L70:
            java.io.IOException r11 = c()     // Catch: java.lang.Throwable -> L25
            throw r11     // Catch: java.lang.Throwable -> L25
        L75:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L25
            throw r11
    }
}
