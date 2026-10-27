package com.bumptech.glide.gifdecoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d implements com.bumptech.glide.gifdecoder.GifDecoder {
    private static final java.lang.String A = "d";
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;

    @androidx.annotation.ColorInt
    private static final int G = 0;

    @androidx.annotation.ColorInt
    private int[] f;

    @androidx.annotation.ColorInt
    private final int[] g;
    private final com.bumptech.glide.gifdecoder.GifDecoder.a h;
    private java.nio.ByteBuffer i;
    private byte[] j;
    private com.bumptech.glide.gifdecoder.c k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f373l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f374m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f375n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f376o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.ColorInt
    private int[] f377p;

    /* renamed from: q, reason: collision with root package name */
    private int f378q;

    /* renamed from: r, reason: collision with root package name */
    private com.bumptech.glide.gifdecoder.b f379r;

    /* renamed from: s, reason: collision with root package name */
    private android.graphics.Bitmap f380s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f381t;

    /* renamed from: u, reason: collision with root package name */
    private int f382u;

    /* renamed from: v, reason: collision with root package name */
    private int f383v;

    /* renamed from: w, reason: collision with root package name */
    private int f384w;

    /* renamed from: x, reason: collision with root package name */
    private int f385x;

    /* renamed from: y, reason: collision with root package name */
    @androidx.annotation.Nullable
    private java.lang.Boolean f386y;

    /* renamed from: z, reason: collision with root package name */
    @androidx.annotation.NonNull
    private android.graphics.Bitmap.Config f387z;

    static {
            return
    }

    public d(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.a r2) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1.g = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.f387z = r0
            r1.h = r2
            com.bumptech.glide.gifdecoder.b r2 = new com.bumptech.glide.gifdecoder.b
            r2.<init>()
            r1.f379r = r2
            return
    }

    public d(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.a r2, com.bumptech.glide.gifdecoder.b r3, java.nio.ByteBuffer r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public d(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.GifDecoder.a r1, com.bumptech.glide.gifdecoder.b r2, java.nio.ByteBuffer r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.o(r2, r3, r4)
            return
    }

    @androidx.annotation.ColorInt
    private int q(int r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            r1 = r10
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L7:
            int r7 = r9.f383v
            int r7 = r7 + r10
            if (r1 >= r7) goto L34
            byte[] r7 = r9.f376o
            int r8 = r7.length
            if (r1 >= r8) goto L34
            if (r1 >= r11) goto L34
            r7 = r7[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int[] r8 = r9.f
            r7 = r8[r7]
            if (r7 == 0) goto L31
            int r8 = r7 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r8
            int r8 = r7 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r8
            int r8 = r7 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r7
            int r6 = r6 + 1
        L31:
            int r1 = r1 + 1
            goto L7
        L34:
            int r10 = r10 + r12
            r12 = r10
        L36:
            int r1 = r9.f383v
            int r1 = r1 + r10
            if (r12 >= r1) goto L63
            byte[] r1 = r9.f376o
            int r7 = r1.length
            if (r12 >= r7) goto L63
            if (r12 >= r11) goto L63
            r1 = r1[r12]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r7 = r9.f
            r1 = r7[r1]
            if (r1 == 0) goto L60
            int r7 = r1 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r7
            int r7 = r1 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r7
            int r7 = r1 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r7
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r1
            int r6 = r6 + 1
        L60:
            int r12 = r12 + 1
            goto L36
        L63:
            if (r6 != 0) goto L66
            return r0
        L66:
            int r2 = r2 / r6
            int r10 = r2 << 24
            int r3 = r3 / r6
            int r11 = r3 << 16
            r10 = r10 | r11
            int r4 = r4 / r6
            int r11 = r4 << 8
            r10 = r10 | r11
            int r5 = r5 / r6
            r10 = r10 | r5
            return r10
    }

    private void r(com.bumptech.glide.gifdecoder.a r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int[] r2 = r0.f377p
            int r3 = r1.d
            int r4 = r0.f383v
            int r3 = r3 / r4
            int r5 = r1.b
            int r5 = r5 / r4
            int r6 = r1.c
            int r6 = r6 / r4
            int r7 = r1.a
            int r7 = r7 / r4
            int r8 = r0.f378q
            if (r8 != 0) goto L1a
            r8 = 1
            goto L1b
        L1a:
            r8 = 0
        L1b:
            int r11 = r0.f385x
            int r12 = r0.f384w
            byte[] r13 = r0.f376o
            int[] r14 = r0.f
            java.lang.Boolean r15 = r0.f386y
            r16 = 8
            r9 = 0
            r10 = 0
            r18 = 1
        L2b:
            if (r10 >= r3) goto Ld3
            r19 = r2
            boolean r2 = r1.e
            if (r2 == 0) goto L5c
            if (r9 < r3) goto L57
            int r2 = r18 + 1
            r20 = r3
            r3 = 2
            if (r2 == r3) goto L52
            r3 = 3
            if (r2 == r3) goto L4b
            r3 = 4
            if (r2 == r3) goto L45
            r18 = r2
            goto L59
        L45:
            r18 = r2
            r9 = 1
            r16 = 2
            goto L59
        L4b:
            r3 = 4
            r18 = r2
            r9 = 2
            r16 = 4
            goto L59
        L52:
            r3 = 4
            r18 = r2
            r9 = 4
            goto L59
        L57:
            r20 = r3
        L59:
            int r2 = r9 + r16
            goto L60
        L5c:
            r20 = r3
            r2 = r9
            r9 = r10
        L60:
            int r9 = r9 + r5
            r3 = 1
            if (r4 != r3) goto L67
            r17 = 1
            goto L69
        L67:
            r17 = 0
        L69:
            if (r9 >= r12) goto Lc4
            int r9 = r9 * r11
            int r21 = r9 + r7
            int r3 = r21 + r6
            int r9 = r9 + r11
            if (r9 >= r3) goto L75
            r3 = r9
        L75:
            int r9 = r10 * r4
            r22 = r2
            int r2 = r1.c
            int r9 = r9 * r2
            if (r17 == 0) goto L9e
            r2 = r21
        L81:
            if (r2 >= r3) goto L9b
            r17 = r2
            r2 = r13[r9]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r14[r2]
            if (r2 == 0) goto L90
            r19[r17] = r2
            goto L97
        L90:
            if (r8 == 0) goto L97
            if (r15 != 0) goto L97
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r15 = r2
        L97:
            int r9 = r9 + r4
            int r2 = r17 + 1
            goto L81
        L9b:
            r17 = r4
            goto Lc7
        L9e:
            int r2 = r3 - r21
            int r2 = r2 * r4
            int r2 = r2 + r9
            r17 = r4
            r4 = r21
        La7:
            if (r4 >= r3) goto Lc7
            r21 = r3
            int r3 = r1.c
            int r3 = r0.q(r9, r2, r3)
            if (r3 == 0) goto Lb6
            r19[r4] = r3
            goto Lbd
        Lb6:
            if (r8 == 0) goto Lbd
            if (r15 != 0) goto Lbd
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r15 = r3
        Lbd:
            int r9 = r9 + r17
            int r4 = r4 + 1
            r3 = r21
            goto La7
        Lc4:
            r22 = r2
            goto L9b
        Lc7:
            int r10 = r10 + 1
            r4 = r17
            r2 = r19
            r3 = r20
            r9 = r22
            goto L2b
        Ld3:
            java.lang.Boolean r1 = r0.f386y
            if (r1 != 0) goto Le5
            if (r15 != 0) goto Ldb
            r10 = 0
            goto Ldf
        Ldb:
            boolean r10 = r15.booleanValue()
        Ldf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0.f386y = r1
        Le5:
            return
    }

    private void s(com.bumptech.glide.gifdecoder.a r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int[] r2 = r0.f377p
            int r3 = r1.d
            int r4 = r1.b
            int r5 = r1.c
            int r6 = r1.a
            int r7 = r0.f378q
            if (r7 != 0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            int r10 = r0.f385x
            byte[] r11 = r0.f376o
            int[] r12 = r0.f
            r14 = 0
            r15 = -1
        L1d:
            if (r14 >= r3) goto L54
            int r16 = r14 + r4
            int r16 = r16 * r10
            int r17 = r16 + r6
            int r8 = r17 + r5
            int r9 = r16 + r10
            if (r9 >= r8) goto L2c
            r8 = r9
        L2c:
            int r9 = r1.c
            int r9 = r9 * r14
            r13 = r17
        L32:
            if (r13 >= r8) goto L4d
            r1 = r11[r9]
            r17 = r2
            r2 = r1 & 255(0xff, float:3.57E-43)
            if (r2 == r15) goto L44
            r2 = r12[r2]
            if (r2 == 0) goto L43
            r17[r13] = r2
            goto L44
        L43:
            r15 = r1
        L44:
            int r9 = r9 + 1
            int r13 = r13 + 1
            r1 = r19
            r2 = r17
            goto L32
        L4d:
            r17 = r2
            int r14 = r14 + 1
            r1 = r19
            goto L1d
        L54:
            java.lang.Boolean r1 = r0.f386y
            if (r1 == 0) goto L5e
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L67
        L5e:
            java.lang.Boolean r1 = r0.f386y
            if (r1 != 0) goto L69
            if (r7 == 0) goto L69
            r1 = -1
            if (r15 == r1) goto L69
        L67:
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0.f386y = r1
            return
    }

    private void t(com.bumptech.glide.gifdecoder.a r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto Ld
            java.nio.ByteBuffer r2 = r0.i
            int r3 = r1.j
            r2.position(r3)
        Ld:
            if (r1 != 0) goto L18
            com.bumptech.glide.gifdecoder.b r1 = r0.f379r
            int r2 = r1.f
            int r1 = r1.g
        L15:
            int r2 = r2 * r1
            goto L1d
        L18:
            int r2 = r1.c
            int r1 = r1.d
            goto L15
        L1d:
            byte[] r1 = r0.f376o
            if (r1 == 0) goto L24
            int r1 = r1.length
            if (r1 >= r2) goto L2c
        L24:
            com.bumptech.glide.gifdecoder.GifDecoder$a r1 = r0.h
            byte[] r1 = r1.a(r2)
            r0.f376o = r1
        L2c:
            byte[] r1 = r0.f376o
            short[] r3 = r0.f373l
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L38
            short[] r3 = new short[r4]
            r0.f373l = r3
        L38:
            short[] r3 = r0.f373l
            byte[] r5 = r0.f374m
            if (r5 != 0) goto L42
            byte[] r5 = new byte[r4]
            r0.f374m = r5
        L42:
            byte[] r5 = r0.f374m
            byte[] r6 = r0.f375n
            if (r6 != 0) goto L4e
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f375n = r6
        L4e:
            byte[] r6 = r0.f375n
            int r7 = r0.x()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L61:
            if (r14 >= r9) goto L6b
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L61
        L6b:
            byte[] r14 = r0.j
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r29 = 1
            r8 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L87:
            if (r8 >= r2) goto L94
            if (r16 != 0) goto L9b
            int r16 = r0.w()
            if (r16 > 0) goto L99
            r3 = 3
            r0.f382u = r3
        L94:
            r13 = r20
            r0 = 0
            goto L142
        L99:
            r17 = 0
        L9b:
            r13 = r14[r17]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r18
            int r19 = r19 + r13
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + (-1)
            r13 = r18
            r4 = r21
            r15 = r23
            r0 = r24
            r23 = r3
            r3 = r25
        Lb5:
            r24 = r5
            if (r13 < r15) goto L13c
            r5 = r19 & r22
            int r19 = r19 >> r15
            int r13 = r13 - r15
            if (r5 != r9) goto Lc8
            r15 = r7
            r4 = r11
            r22 = r12
            r5 = r24
            r0 = -1
            goto Lb5
        Lc8:
            if (r5 != r10) goto Ldf
            r25 = r3
            r21 = r4
        Lce:
            r18 = r13
            r3 = r23
            r5 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r13 = 0
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L87
        Ldf:
            r25 = r6
            r6 = -1
            if (r0 != r6) goto Lf3
            r0 = r24[r5]
            r1[r20] = r0
            int r20 = r20 + 1
            int r8 = r8 + 1
            r0 = r5
            r3 = r0
            r5 = r24
            r6 = r25
            goto Lb5
        Lf3:
            if (r5 < r4) goto Lfc
            byte r3 = (byte) r3
            r25[r26] = r3
            int r26 = r26 + 1
            r3 = r0
            goto Lfd
        Lfc:
            r3 = r5
        Lfd:
            if (r3 < r9) goto L108
            r21 = r24[r3]
            r25[r26] = r21
            int r26 = r26 + 1
            short r3 = r23[r3]
            goto Lfd
        L108:
            r3 = r24[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r3
            r1[r20] = r6
        L10f:
            int r20 = r20 + 1
            int r8 = r8 + 1
            if (r26 <= 0) goto L11c
            int r26 = r26 + (-1)
            r27 = r25[r26]
            r1[r20] = r27
            goto L10f
        L11c:
            r27 = r3
            r3 = 4096(0x1000, float:5.74E-42)
            if (r4 >= r3) goto L133
            short r0 = (short) r0
            r23[r4] = r0
            r24[r4] = r6
            int r4 = r4 + 1
            r0 = r4 & r22
            if (r0 != 0) goto L133
            if (r4 >= r3) goto L133
            int r15 = r15 + 1
            int r22 = r22 + r4
        L133:
            r0 = r5
            r5 = r24
            r6 = r25
            r3 = r27
            goto Lb5
        L13c:
            r5 = r3
            r21 = r4
            r25 = r5
            goto Lce
        L142:
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.gifdecoder.c u() {
            r1 = this;
            com.bumptech.glide.gifdecoder.c r0 = r1.k
            if (r0 != 0) goto Lb
            com.bumptech.glide.gifdecoder.c r0 = new com.bumptech.glide.gifdecoder.c
            r0.<init>()
            r1.k = r0
        Lb:
            com.bumptech.glide.gifdecoder.c r0 = r1.k
            return r0
    }

    private android.graphics.Bitmap v() {
            r4 = this;
            java.lang.Boolean r0 = r4.f386y
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            android.graphics.Bitmap$Config r0 = r4.f387z
            goto L10
        Le:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L10:
            com.bumptech.glide.gifdecoder.GifDecoder$a r1 = r4.h
            int r2 = r4.f385x
            int r3 = r4.f384w
            android.graphics.Bitmap r0 = r1.b(r2, r3, r0)
            r1 = 1
            r0.setHasAlpha(r1)
            return r0
    }

    private int w() {
            r5 = this;
            int r0 = r5.x()
            if (r0 > 0) goto L7
            return r0
        L7:
            java.nio.ByteBuffer r1 = r5.i
            byte[] r2 = r5.j
            int r3 = r1.remaining()
            int r3 = java.lang.Math.min(r0, r3)
            r4 = 0
            r1.get(r2, r4, r3)
            return r0
    }

    private int x() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.i
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private android.graphics.Bitmap y(com.bumptech.glide.gifdecoder.a r9, com.bumptech.glide.gifdecoder.a r10) {
            r8 = this;
            int[] r1 = r8.f377p
            r0 = 0
            if (r10 != 0) goto L14
            android.graphics.Bitmap r2 = r8.f380s
            if (r2 == 0) goto Le
            com.bumptech.glide.gifdecoder.GifDecoder$a r3 = r8.h
            r3.c(r2)
        Le:
            r2 = 0
            r8.f380s = r2
            java.util.Arrays.fill(r1, r0)
        L14:
            r2 = 3
            if (r10 == 0) goto L22
            int r3 = r10.g
            if (r3 != r2) goto L22
            android.graphics.Bitmap r3 = r8.f380s
            if (r3 != 0) goto L22
            java.util.Arrays.fill(r1, r0)
        L22:
            if (r10 == 0) goto L76
            int r3 = r10.g
            if (r3 <= 0) goto L76
            r4 = 2
            if (r3 != r4) goto L65
            boolean r2 = r9.f
            if (r2 != 0) goto L3f
            com.bumptech.glide.gifdecoder.b r2 = r8.f379r
            int r3 = r2.f358l
            int[] r4 = r9.k
            if (r4 == 0) goto L3e
            int r2 = r2.j
            int r4 = r9.h
            if (r2 != r4) goto L3e
            goto L3f
        L3e:
            r0 = r3
        L3f:
            int r2 = r10.d
            int r3 = r8.f383v
            int r2 = r2 / r3
            int r4 = r10.b
            int r4 = r4 / r3
            int r5 = r10.c
            int r5 = r5 / r3
            int r10 = r10.a
            int r10 = r10 / r3
            int r3 = r8.f385x
            int r4 = r4 * r3
            int r4 = r4 + r10
            int r2 = r2 * r3
            int r2 = r2 + r4
        L55:
            if (r4 >= r2) goto L76
            int r10 = r4 + r5
            r3 = r4
        L5a:
            if (r3 >= r10) goto L61
            r1[r3] = r0
            int r3 = r3 + 1
            goto L5a
        L61:
            int r10 = r8.f385x
            int r4 = r4 + r10
            goto L55
        L65:
            if (r3 != r2) goto L76
            android.graphics.Bitmap r0 = r8.f380s
            if (r0 == 0) goto L76
            int r3 = r8.f385x
            r5 = 0
            int r7 = r8.f384w
            r2 = 0
            r4 = 0
            r6 = r3
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
        L76:
            r8.t(r9)
            boolean r10 = r9.e
            r0 = 1
            if (r10 != 0) goto L87
            int r10 = r8.f383v
            if (r10 == r0) goto L83
            goto L87
        L83:
            r8.s(r9)
            goto L8a
        L87:
            r8.r(r9)
        L8a:
            boolean r10 = r8.f381t
            if (r10 == 0) goto Lab
            int r9 = r9.g
            if (r9 == 0) goto L94
            if (r9 != r0) goto Lab
        L94:
            android.graphics.Bitmap r9 = r8.f380s
            if (r9 != 0) goto L9e
            android.graphics.Bitmap r9 = r8.v()
            r8.f380s = r9
        L9e:
            android.graphics.Bitmap r0 = r8.f380s
            int r3 = r8.f385x
            r5 = 0
            int r7 = r8.f384w
            r2 = 0
            r4 = 0
            r6 = r3
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
        Lab:
            android.graphics.Bitmap r0 = r8.v()
            int r3 = r8.f385x
            r5 = 0
            int r7 = r8.f384w
            r2 = 0
            r4 = 0
            r6 = r3
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void a(@androidx.annotation.NonNull android.graphics.Bitmap.Config r6) {
            r5 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r6 == r0) goto L30
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r6 != r1) goto L9
            goto L30
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported format: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = ", must be one of "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = " or "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        L30:
            r5.f387z = r6
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @java.lang.Deprecated
    public int b() {
            r2 = this;
            com.bumptech.glide.gifdecoder.b r0 = r2.f379r
            int r0 = r0.f359m
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 1
        L8:
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void c(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r1, @androidx.annotation.NonNull byte[] r2) {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.lang.Throwable -> La
            r0.n(r1, r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
            r3 = this;
            r0 = 0
            r3.f379r = r0
            byte[] r1 = r3.f376o
            if (r1 == 0) goto Lc
            com.bumptech.glide.gifdecoder.GifDecoder$a r2 = r3.h
            r2.e(r1)
        Lc:
            int[] r1 = r3.f377p
            if (r1 == 0) goto L15
            com.bumptech.glide.gifdecoder.GifDecoder$a r2 = r3.h
            r2.f(r1)
        L15:
            android.graphics.Bitmap r1 = r3.f380s
            if (r1 == 0) goto L1e
            com.bumptech.glide.gifdecoder.GifDecoder$a r2 = r3.h
            r2.c(r1)
        L1e:
            r3.f380s = r0
            r3.i = r0
            r3.f386y = r0
            byte[] r0 = r3.j
            if (r0 == 0) goto L2d
            com.bumptech.glide.gifdecoder.GifDecoder$a r1 = r3.h
            r1.e(r0)
        L2d:
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void d() {
            r1 = this;
            r0 = -1
            r1.f378q = r0
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int e() {
            r1 = this;
            int r0 = r1.f378q
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int f(@androidx.annotation.Nullable java.io.InputStream r6, int r7) {
            r5 = this;
            if (r6 == 0) goto L2b
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r7 <= 0) goto L9
            int r7 = r7 + 4096
            goto Lb
        L9:
            r7 = 16384(0x4000, float:2.2959E-41)
        Lb:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1e
            r1.<init>(r7)     // Catch: java.io.IOException -> L1e
            byte[] r7 = new byte[r0]     // Catch: java.io.IOException -> L1e
        L12:
            r2 = 0
            int r3 = r6.read(r7, r2, r0)     // Catch: java.io.IOException -> L1e
            r4 = -1
            if (r3 == r4) goto L20
            r1.write(r7, r2, r3)     // Catch: java.io.IOException -> L1e
            goto L12
        L1e:
            goto L2e
        L20:
            r1.flush()     // Catch: java.io.IOException -> L1e
            byte[] r7 = r1.toByteArray()     // Catch: java.io.IOException -> L1e
            r5.read(r7)     // Catch: java.io.IOException -> L1e
            goto L2e
        L2b:
            r7 = 2
            r5.f382u = r7
        L2e:
            if (r6 == 0) goto L33
            r6.close()     // Catch: java.io.IOException -> L33
        L33:
            int r6 = r5.f382u
            return r6
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int g() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.i
            int r0 = r0.limit()
            byte[] r1 = r2.f376o
            int r1 = r1.length
            int r0 = r0 + r1
            int[] r1 = r2.f377p
            int r1 = r1.length
            int r1 = r1 * 4
            int r0 = r0 + r1
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @androidx.annotation.NonNull
    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.i
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.f379r
            int r0 = r0.g
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
            r1 = this;
            int r0 = r1.f382u
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.f379r
            int r0 = r0.f
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @androidx.annotation.Nullable
    public synchronized android.graphics.Bitmap h() {
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.gifdecoder.b r0 = r8.f379r     // Catch: java.lang.Throwable -> Le
            int r0 = r0.c     // Catch: java.lang.Throwable -> Le
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L11
            int r0 = r8.f378q     // Catch: java.lang.Throwable -> Le
            if (r0 >= 0) goto L1f
            goto L11
        Le:
            r0 = move-exception
            goto L97
        L11:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.d.A     // Catch: java.lang.Throwable -> Le
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L1d
            com.bumptech.glide.gifdecoder.b r0 = r8.f379r     // Catch: java.lang.Throwable -> Le
            int r0 = r0.c     // Catch: java.lang.Throwable -> Le
        L1d:
            r8.f382u = r2     // Catch: java.lang.Throwable -> Le
        L1f:
            int r0 = r8.f382u     // Catch: java.lang.Throwable -> Le
            r3 = 0
            if (r0 == r2) goto L90
            r4 = 2
            if (r0 != r4) goto L28
            goto L90
        L28:
            r0 = 0
            r8.f382u = r0     // Catch: java.lang.Throwable -> Le
            byte[] r5 = r8.j     // Catch: java.lang.Throwable -> Le
            if (r5 != 0) goto L39
            com.bumptech.glide.gifdecoder.GifDecoder$a r5 = r8.h     // Catch: java.lang.Throwable -> Le
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.a(r6)     // Catch: java.lang.Throwable -> Le
            r8.j = r5     // Catch: java.lang.Throwable -> Le
        L39:
            com.bumptech.glide.gifdecoder.b r5 = r8.f379r     // Catch: java.lang.Throwable -> Le
            java.util.List<com.bumptech.glide.gifdecoder.a> r5 = r5.e     // Catch: java.lang.Throwable -> Le
            int r6 = r8.f378q     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.gifdecoder.a r5 = (com.bumptech.glide.gifdecoder.a) r5     // Catch: java.lang.Throwable -> Le
            int r6 = r8.f378q     // Catch: java.lang.Throwable -> Le
            int r6 = r6 - r2
            if (r6 < 0) goto L55
            com.bumptech.glide.gifdecoder.b r7 = r8.f379r     // Catch: java.lang.Throwable -> Le
            java.util.List<com.bumptech.glide.gifdecoder.a> r7 = r7.e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.gifdecoder.a r6 = (com.bumptech.glide.gifdecoder.a) r6     // Catch: java.lang.Throwable -> Le
            goto L56
        L55:
            r6 = r3
        L56:
            int[] r7 = r5.k     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L5b
            goto L5f
        L5b:
            com.bumptech.glide.gifdecoder.b r7 = r8.f379r     // Catch: java.lang.Throwable -> Le
            int[] r7 = r7.a     // Catch: java.lang.Throwable -> Le
        L5f:
            r8.f = r7     // Catch: java.lang.Throwable -> Le
            if (r7 != 0) goto L6c
            java.lang.String r0 = com.bumptech.glide.gifdecoder.d.A     // Catch: java.lang.Throwable -> Le
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            r8.f382u = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        L6c:
            boolean r1 = r5.f     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8a
            int[] r1 = r8.g     // Catch: java.lang.Throwable -> Le
            int r2 = r7.length     // Catch: java.lang.Throwable -> Le
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Le
            int[] r1 = r8.g     // Catch: java.lang.Throwable -> Le
            r8.f = r1     // Catch: java.lang.Throwable -> Le
            int r2 = r5.h     // Catch: java.lang.Throwable -> Le
            r1[r2] = r0     // Catch: java.lang.Throwable -> Le
            int r0 = r5.g     // Catch: java.lang.Throwable -> Le
            if (r0 != r4) goto L8a
            int r0 = r8.f378q     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            r8.f386y = r0     // Catch: java.lang.Throwable -> Le
        L8a:
            android.graphics.Bitmap r0 = r8.y(r5, r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r0
        L90:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.d.A     // Catch: java.lang.Throwable -> Le
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        L97:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void i() {
            r2 = this;
            int r0 = r2.f378q
            int r0 = r0 + 1
            com.bumptech.glide.gifdecoder.b r1 = r2.f379r
            int r1 = r1.c
            int r0 = r0 % r1
            r2.f378q = r0
            return
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int j() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.f379r
            int r0 = r0.c
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int k(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            com.bumptech.glide.gifdecoder.b r0 = r2.f379r
            int r1 = r0.c
            if (r3 >= r1) goto L13
            java.util.List<com.bumptech.glide.gifdecoder.a> r0 = r0.e
            java.lang.Object r3 = r0.get(r3)
            com.bumptech.glide.gifdecoder.a r3 = (com.bumptech.glide.gifdecoder.a) r3
            int r3 = r3.i
            return r3
        L13:
            r3 = -1
            return r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int l() {
            r3 = this;
            com.bumptech.glide.gifdecoder.b r0 = r3.f379r
            int r0 = r0.f359m
            r1 = -1
            r2 = 1
            if (r0 != r1) goto L9
            return r2
        L9:
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            int r0 = r0 + r2
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int m() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.f379r
            int r0 = r0.c
            if (r0 <= 0) goto L10
            int r0 = r1.f378q
            if (r0 >= 0) goto Lb
            goto L10
        Lb:
            int r0 = r1.k(r0)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void n(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r2, @androidx.annotation.NonNull java.nio.ByteBuffer r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.o(r2, r3, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void o(@androidx.annotation.NonNull com.bumptech.glide.gifdecoder.b r3, @androidx.annotation.NonNull java.nio.ByteBuffer r4, int r5) {
            r2 = this;
            monitor-enter(r2)
            if (r5 <= 0) goto L66
            int r5 = java.lang.Integer.highestOneBit(r5)     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            r2.f382u = r0     // Catch: java.lang.Throwable -> L3c
            r2.f379r = r3     // Catch: java.lang.Throwable -> L3c
            r1 = -1
            r2.f378q = r1     // Catch: java.lang.Throwable -> L3c
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L3c
            r2.i = r4     // Catch: java.lang.Throwable -> L3c
            r4.position(r0)     // Catch: java.lang.Throwable -> L3c
            java.nio.ByteBuffer r4 = r2.i     // Catch: java.lang.Throwable -> L3c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L3c
            r4.order(r1)     // Catch: java.lang.Throwable -> L3c
            r2.f381t = r0     // Catch: java.lang.Throwable -> L3c
            java.util.List<com.bumptech.glide.gifdecoder.a> r4 = r3.e     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3c
        L27:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L3c
            com.bumptech.glide.gifdecoder.a r0 = (com.bumptech.glide.gifdecoder.a) r0     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.g     // Catch: java.lang.Throwable -> L3c
            r1 = 3
            if (r0 != r1) goto L27
            r4 = 1
            r2.f381t = r4     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = move-exception
            goto L7d
        L3e:
            r2.f383v = r5     // Catch: java.lang.Throwable -> L3c
            int r4 = r3.f     // Catch: java.lang.Throwable -> L3c
            int r0 = r4 / r5
            r2.f385x = r0     // Catch: java.lang.Throwable -> L3c
            int r3 = r3.g     // Catch: java.lang.Throwable -> L3c
            int r5 = r3 / r5
            r2.f384w = r5     // Catch: java.lang.Throwable -> L3c
            com.bumptech.glide.gifdecoder.GifDecoder$a r5 = r2.h     // Catch: java.lang.Throwable -> L3c
            int r4 = r4 * r3
            byte[] r3 = r5.a(r4)     // Catch: java.lang.Throwable -> L3c
            r2.f376o = r3     // Catch: java.lang.Throwable -> L3c
            com.bumptech.glide.gifdecoder.GifDecoder$a r3 = r2.h     // Catch: java.lang.Throwable -> L3c
            int r4 = r2.f385x     // Catch: java.lang.Throwable -> L3c
            int r5 = r2.f384w     // Catch: java.lang.Throwable -> L3c
            int r4 = r4 * r5
            int[] r3 = r3.d(r4)     // Catch: java.lang.Throwable -> L3c
            r2.f377p = r3     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            return
        L66:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r4.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "Sample size must be >=0, not: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            r4.append(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            throw r3     // Catch: java.lang.Throwable -> L3c
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r3
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int p() {
            r1 = this;
            com.bumptech.glide.gifdecoder.b r0 = r1.f379r
            int r0 = r0.f359m
            return r0
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@androidx.annotation.Nullable byte[] r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.gifdecoder.c r0 = r1.u()     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.gifdecoder.c r0 = r0.r(r2)     // Catch: java.lang.Throwable -> L15
            com.bumptech.glide.gifdecoder.b r0 = r0.d()     // Catch: java.lang.Throwable -> L15
            r1.f379r = r0     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            r1.c(r0, r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L1b
        L17:
            int r2 = r1.f382u     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }
}
