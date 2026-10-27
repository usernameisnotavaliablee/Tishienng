package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s2 implements java.io.Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.nio.charset.Charset f4683f = null;
    private final java.io.InputStream a;

    /* renamed from: b, reason: collision with root package name */
    private final java.nio.charset.Charset f4684b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4685c;

    /* renamed from: d, reason: collision with root package name */
    private int f4686d;

    /* renamed from: e, reason: collision with root package name */
    private int f4687e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends java.io.ByteArrayOutputStream {
        final /* synthetic */ com.amap.api.col.s.s2 a;

        a(com.amap.api.col.s.s2 r1, int r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.io.ByteArrayOutputStream
        public final java.lang.String toString() {
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
                com.amap.api.col.s.s2 r3 = r5.a     // Catch: java.io.UnsupportedEncodingException -> L23
                java.nio.charset.Charset r3 = com.amap.api.col.s.s2.b(r3)     // Catch: java.io.UnsupportedEncodingException -> L23
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

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.amap.api.col.s.s2.f4683f = r0
            return
    }

    public s2(java.io.InputStream r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private s2(java.io.InputStream r1, java.nio.charset.Charset r2, byte r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L22
            if (r2 == 0) goto L22
            java.nio.charset.Charset r3 = com.amap.api.col.s.s2.f4683f
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L1a
            r0.a = r1
            r0.f4684b = r2
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            r0.f4685c = r1
            return
        L1a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unsupported encoding"
            r1.<init>(r2)
            throw r1
        L22:
            r1 = 0
            throw r1
    }

    static /* synthetic */ java.nio.charset.Charset b(com.amap.api.col.s.s2 r0) {
            java.nio.charset.Charset r0 = r0.f4684b
            return r0
    }

    private void c() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.a
            byte[] r1 = r4.f4685c
            int r2 = r1.length
            r3 = 0
            int r0 = r0.read(r1, r3, r2)
            r1 = -1
            if (r0 == r1) goto L12
            r4.f4686d = r3
            r4.f4687e = r0
            return
        L12:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public final java.lang.String a() throws java.io.IOException {
            r7 = this;
            java.io.InputStream r0 = r7.a
            monitor-enter(r0)
            byte[] r1 = r7.f4685c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f4686d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f4687e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f4686d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f4687e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f4685c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f4686d     // Catch: java.lang.Throwable -> L11
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
            java.nio.charset.Charset r6 = r7.f4684b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f4686d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.amap.api.col.s.s2$a r1 = new com.amap.api.col.s.s2$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f4687e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f4686d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f4685c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f4686d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f4687e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f4687e = r2     // Catch: java.lang.Throwable -> L11
            r7.c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f4686d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f4687e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f4685c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f4686d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f4686d = r2     // Catch: java.lang.Throwable -> L11
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.a
            monitor-enter(r0)
            byte[] r1 = r2.f4685c     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r1 = 0
            r2.f4685c = r1     // Catch: java.lang.Throwable -> L10
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
}
