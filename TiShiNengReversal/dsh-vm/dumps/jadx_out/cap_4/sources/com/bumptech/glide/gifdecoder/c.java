package com.bumptech.glide.gifdecoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private static final java.lang.String e = "GifHeaderParser";
    private static final int f = 255;
    private static final int g = 44;
    private static final int h = 33;
    private static final int i = 59;
    private static final int j = 249;
    private static final int k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f360l = 254;

    /* renamed from: m, reason: collision with root package name */
    private static final int f361m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f362n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final int f363o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f364p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f365q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f366r = 64;

    /* renamed from: s, reason: collision with root package name */
    private static final int f367s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f368t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static final int f369u = 7;

    /* renamed from: v, reason: collision with root package name */
    static final int f370v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f371w = 10;

    /* renamed from: x, reason: collision with root package name */
    private static final int f372x = 256;
    private final byte[] a;
    private java.nio.ByteBuffer b;
    private com.bumptech.glide.gifdecoder.b c;
    private int d;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.a = r0
            r0 = 0
            r1.d = r0
            return
    }

    private boolean b() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.c
            int r0 = r0.b
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private int e() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.b     // Catch: java.lang.Exception -> L9
            byte r0 = r0.get()     // Catch: java.lang.Exception -> L9
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L9:
            com.bumptech.glide.gifdecoder.b r0 = r2.c
            r1 = 1
            r0.b = r1
            r0 = 0
            return r0
    }

    private void f() {
            r8 = this;
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            int r1 = r8.o()
            r0.a = r1
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            int r1 = r8.o()
            r0.b = r1
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            int r1 = r8.o()
            r0.c = r1
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            int r1 = r8.o()
            r0.d = r1
            int r0 = r8.e()
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            r4 = r0 & 7
            int r4 = r4 + r3
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            int r4 = (int) r4
            com.bumptech.glide.gifdecoder.b r5 = r8.c
            com.bumptech.glide.gifdecoder.a r5 = r5.d
            r0 = r0 & 64
            if (r0 == 0) goto L49
            r2 = 1
        L49:
            r5.e = r2
            if (r1 == 0) goto L54
            int[] r0 = r8.h(r4)
            r5.k = r0
            goto L57
        L54:
            r0 = 0
            r5.k = r0
        L57:
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            java.nio.ByteBuffer r1 = r8.b
            int r1 = r1.position()
            r0.j = r1
            r8.t()
            boolean r0 = r8.b()
            if (r0 == 0) goto L6d
            return
        L6d:
            com.bumptech.glide.gifdecoder.b r0 = r8.c
            int r1 = r0.c
            int r1 = r1 + r3
            r0.c = r1
            java.util.List<com.bumptech.glide.gifdecoder.a> r1 = r0.e
            com.bumptech.glide.gifdecoder.a r0 = r0.d
            r1.add(r0)
            return
    }

    private void g() {
            r4 = this;
            int r0 = r4.e()
            r4.d = r0
            if (r0 <= 0) goto L22
            r0 = 0
        L9:
            int r1 = r4.d     // Catch: java.lang.Exception -> L17
            if (r0 >= r1) goto L22
            int r1 = r1 - r0
            java.nio.ByteBuffer r2 = r4.b     // Catch: java.lang.Exception -> L17
            byte[] r3 = r4.a     // Catch: java.lang.Exception -> L17
            r2.get(r3, r0, r1)     // Catch: java.lang.Exception -> L17
            int r0 = r0 + r1
            goto L9
        L17:
            java.lang.String r0 = "GifHeaderParser"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.gifdecoder.b r0 = r4.c
            r1 = 1
            r0.b = r1
        L22:
            return
    }

    @androidx.annotation.Nullable
    private int[] h(int r10) {
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.ByteBuffer r2 = r9.b     // Catch: java.nio.BufferUnderflowException -> L34
            r2.get(r0)     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r2]     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = 0
            r3 = 0
        L10:
            if (r2 >= r10) goto L33
            int r4 = r3 + 1
            r5 = r0[r3]     // Catch: java.nio.BufferUnderflowException -> L34
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r3 + 2
            r4 = r0[r4]     // Catch: java.nio.BufferUnderflowException -> L34
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 3
            r6 = r0[r6]     // Catch: java.nio.BufferUnderflowException -> L34
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r2 + 1
            int r5 = r5 << 16
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 | r8
            int r4 = r4 << 8
            r4 = r4 | r5
            r4 = r4 | r6
            r1[r2] = r4     // Catch: java.nio.BufferUnderflowException -> L34
            r2 = r7
            goto L10
        L33:
            return r1
        L34:
            java.lang.String r10 = "GifHeaderParser"
            r0 = 3
            android.util.Log.isLoggable(r10, r0)
            com.bumptech.glide.gifdecoder.b r10 = r9.c
            r0 = 1
            r10.b = r0
            return r1
    }

    private void i() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.j(r0)
            return
    }

    private void j(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 != 0) goto L92
            boolean r2 = r5.b()
            if (r2 != 0) goto L92
            com.bumptech.glide.gifdecoder.b r2 = r5.c
            int r2 = r2.c
            if (r2 > r6) goto L92
            int r2 = r5.e()
            r3 = 33
            r4 = 1
            if (r2 == r3) goto L39
            r3 = 44
            if (r2 == r3) goto L28
            r3 = 59
            if (r2 == r3) goto L26
            com.bumptech.glide.gifdecoder.b r2 = r5.c
            r2.b = r4
            goto L2
        L26:
            r1 = 1
            goto L2
        L28:
            com.bumptech.glide.gifdecoder.b r2 = r5.c
            com.bumptech.glide.gifdecoder.a r3 = r2.d
            if (r3 != 0) goto L35
            com.bumptech.glide.gifdecoder.a r3 = new com.bumptech.glide.gifdecoder.a
            r3.<init>()
            r2.d = r3
        L35:
            r5.f()
            goto L2
        L39:
            int r2 = r5.e()
            if (r2 == r4) goto L8d
            r3 = 249(0xf9, float:3.49E-43)
            if (r2 == r3) goto L7f
            r3 = 254(0xfe, float:3.56E-43)
            if (r2 == r3) goto L7b
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == r3) goto L4f
            r5.s()
            goto L2
        L4f:
            r5.g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L58:
            r4 = 11
            if (r3 >= r4) goto L67
            byte[] r4 = r5.a
            r4 = r4[r3]
            char r4 = (char) r4
            r2.append(r4)
            int r3 = r3 + 1
            goto L58
        L67:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NETSCAPE2.0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L77
            r5.n()
            goto L2
        L77:
            r5.s()
            goto L2
        L7b:
            r5.s()
            goto L2
        L7f:
            com.bumptech.glide.gifdecoder.b r2 = r5.c
            com.bumptech.glide.gifdecoder.a r3 = new com.bumptech.glide.gifdecoder.a
            r3.<init>()
            r2.d = r3
            r5.k()
            goto L2
        L8d:
            r5.s()
            goto L2
        L92:
            return
    }

    private void k() {
            r5 = this;
            r5.e()
            int r0 = r5.e()
            com.bumptech.glide.gifdecoder.b r1 = r5.c
            com.bumptech.glide.gifdecoder.a r1 = r1.d
            r2 = r0 & 28
            r3 = 2
            int r2 = r2 >> r3
            r1.g = r2
            r4 = 1
            if (r2 != 0) goto L16
            r1.g = r4
        L16:
            r0 = r0 & r4
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r4 = 0
        L1b:
            r1.f = r4
            int r0 = r5.o()
            r1 = 10
            if (r0 >= r3) goto L27
            r0 = 10
        L27:
            com.bumptech.glide.gifdecoder.b r2 = r5.c
            com.bumptech.glide.gifdecoder.a r2 = r2.d
            int r0 = r0 * 10
            r2.i = r0
            int r0 = r5.e()
            r2.h = r0
            r5.e()
            return
    }

    private void l() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            r2 = 6
            if (r1 >= r2) goto L14
            int r2 = r3.e()
            char r2 = (char) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GIF"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L26
            com.bumptech.glide.gifdecoder.b r0 = r3.c
            r1 = 1
            r0.b = r1
            return
        L26:
            r3.m()
            com.bumptech.glide.gifdecoder.b r0 = r3.c
            boolean r0 = r0.h
            if (r0 == 0) goto L49
            boolean r0 = r3.b()
            if (r0 != 0) goto L49
            com.bumptech.glide.gifdecoder.b r0 = r3.c
            int r1 = r0.i
            int[] r1 = r3.h(r1)
            r0.a = r1
            com.bumptech.glide.gifdecoder.b r0 = r3.c
            int[] r1 = r0.a
            int r2 = r0.j
            r1 = r1[r2]
            r0.f358l = r1
        L49:
            return
    }

    private void m() {
            r6 = this;
            com.bumptech.glide.gifdecoder.b r0 = r6.c
            int r1 = r6.o()
            r0.f = r1
            com.bumptech.glide.gifdecoder.b r0 = r6.c
            int r1 = r6.o()
            r0.g = r1
            int r0 = r6.e()
            com.bumptech.glide.gifdecoder.b r1 = r6.c
            r2 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r1.h = r2
            r0 = r0 & 7
            int r0 = r0 + r3
            double r2 = (double) r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r4, r2)
            int r0 = (int) r2
            r1.i = r0
            com.bumptech.glide.gifdecoder.b r0 = r6.c
            int r1 = r6.e()
            r0.j = r1
            com.bumptech.glide.gifdecoder.b r0 = r6.c
            int r1 = r6.e()
            r0.k = r1
            return
    }

    private void n() {
            r3 = this;
        L0:
            r3.g()
            byte[] r0 = r3.a
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L1b
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.gifdecoder.b r2 = r3.c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f359m = r0
        L1b:
            int r0 = r3.d
            if (r0 <= 0) goto L25
            boolean r0 = r3.b()
            if (r0 == 0) goto L0
        L25:
            return
    }

    private int o() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.b
            short r0 = r0.getShort()
            return r0
    }

    private void p() {
            r2 = this;
            r0 = 0
            r2.b = r0
            byte[] r0 = r2.a
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            com.bumptech.glide.gifdecoder.b r0 = new com.bumptech.glide.gifdecoder.b
            r0.<init>()
            r2.c = r0
            r2.d = r1
            return
    }

    private void s() {
            r3 = this;
        L0:
            int r0 = r3.e()
            java.nio.ByteBuffer r1 = r3.b
            int r1 = r1.position()
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = r3.b
            int r2 = r2.limit()
            int r1 = java.lang.Math.min(r1, r2)
            java.nio.ByteBuffer r2 = r3.b
            r2.position(r1)
            if (r0 > 0) goto L0
            return
    }

    private void t() {
            r0 = this;
            r0.e()
            r0.s()
            return
    }

    public void a() {
            r1 = this;
            r0 = 0
            r1.b = r0
            r1.c = r0
            return
    }

    public boolean c() {
            r2 = this;
            r2.l()
            boolean r0 = r2.b()
            if (r0 != 0) goto Ld
            r0 = 2
            r2.j(r0)
        Ld:
            com.bumptech.glide.gifdecoder.b r0 = r2.c
            int r0 = r0.c
            r1 = 1
            if (r0 <= r1) goto L15
            return r1
        L15:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.gifdecoder.b d() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.b
            if (r0 == 0) goto L25
            boolean r0 = r2.b()
            if (r0 == 0) goto Ld
            com.bumptech.glide.gifdecoder.b r0 = r2.c
            return r0
        Ld:
            r2.l()
            boolean r0 = r2.b()
            if (r0 != 0) goto L22
            r2.i()
            com.bumptech.glide.gifdecoder.b r0 = r2.c
            int r1 = r0.c
            if (r1 >= 0) goto L22
            r1 = 1
            r0.b = r1
        L22:
            com.bumptech.glide.gifdecoder.b r0 = r2.c
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setData() before parseHeader()"
            r0.<init>(r1)
            throw r0
    }

    public com.bumptech.glide.gifdecoder.c q(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
            r1 = this;
            r1.p()
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r1.b = r2
            r0 = 0
            r2.position(r0)
            java.nio.ByteBuffer r2 = r1.b
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            return r1
    }

    public com.bumptech.glide.gifdecoder.c r(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            if (r2 == 0) goto La
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r1.q(r2)
            return r1
        La:
            r2 = 0
            r1.b = r2
            com.bumptech.glide.gifdecoder.b r2 = r1.c
            r0 = 2
            r2.b = r0
            return r1
    }
}
