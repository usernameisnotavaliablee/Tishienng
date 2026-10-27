package com.bumptech.glide.disklrucache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class c implements java.io.Closeable {
    private static final byte f = 13;
    private static final byte g = 10;
    private final java.io.InputStream a;
    private final java.nio.charset.Charset b;
    private byte[] c;
    private int d;
    private int e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.io.ByteArrayOutputStream {
        final /* synthetic */ com.bumptech.glide.disklrucache.c a;

        a(com.bumptech.glide.disklrucache.c r1, int r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.io.ByteArrayOutputStream
        public java.lang.String toString() {
                r5 = this;
                int r0 = r5.count
                if (r0 <= 0) goto L10
                byte[] r1 = r5.buf
                int r2 = r0 + (-1)
                r1 = r1[r2]
                r2 = 13
                if (r1 != r2) goto L10
                int r0 = r0 + (-1)
            L10:
                java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L23
                byte[] r2 = r5.buf     // Catch: java.io.UnsupportedEncodingException -> L23
                com.bumptech.glide.disklrucache.c r3 = r5.a     // Catch: java.io.UnsupportedEncodingException -> L23
                java.nio.charset.Charset r3 = com.bumptech.glide.disklrucache.c.a(r3)     // Catch: java.io.UnsupportedEncodingException -> L23
                java.lang.String r3 = r3.name()     // Catch: java.io.UnsupportedEncodingException -> L23
                r4 = 0
                r1.<init>(r2, r4, r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L23
                return r1
            L23:
                r0 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
        }
    }

    public c(java.io.InputStream r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2a
            if (r4 == 0) goto L2a
            if (r3 < 0) goto L22
            java.nio.charset.Charset r0 = com.bumptech.glide.disklrucache.d.a
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1a
            r1.a = r2
            r1.b = r4
            byte[] r2 = new byte[r3]
            r1.c = r2
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported encoding"
            r2.<init>(r3)
            throw r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "capacity <= 0"
            r2.<init>(r3)
            throw r2
        L2a:
            r2 = 0
            throw r2
    }

    public c(java.io.InputStream r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0, r3)
            return
    }

    static /* synthetic */ java.nio.charset.Charset a(com.bumptech.glide.disklrucache.c r0) {
            java.nio.charset.Charset r0 = r0.b
            return r0
    }

    private void b() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.a
            byte[] r1 = r4.c
            int r2 = r1.length
            r3 = 0
            int r0 = r0.read(r1, r3, r2)
            r1 = -1
            if (r0 == r1) goto L12
            r4.d = r3
            r4.e = r0
            return
        L12:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public boolean c() {
            r2 = this;
            int r0 = r2.e
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.a
            monitor-enter(r0)
            byte[] r1 = r2.c     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r1 = 0
            r2.c = r1     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r2.a     // Catch: java.lang.Throwable -> L10
            r1.close()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public java.lang.String d() throws java.io.IOException {
            r7 = this;
            java.io.InputStream r0 = r7.a
            monitor-enter(r0)
            byte[] r1 = r7.c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.b()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.d     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.bumptech.glide.disklrucache.c$a r1 = new com.bumptech.glide.disklrucache.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.e = r2     // Catch: java.lang.Throwable -> L11
            r7.b()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
