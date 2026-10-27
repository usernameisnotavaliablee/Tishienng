package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o3 {
    public static final com.huawei.hms.scankit.p.o3 h = null;
    public static final com.huawei.hms.scankit.p.o3 i = null;
    public static final com.huawei.hms.scankit.p.o3 j = null;
    public static final com.huawei.hms.scankit.p.o3 k = null;
    public static final com.huawei.hms.scankit.p.o3 l = null;
    public static final com.huawei.hms.scankit.p.o3 m = null;
    public static final com.huawei.hms.scankit.p.o3 n = null;
    public static final com.huawei.hms.scankit.p.o3 o = null;
    private final int[] a;
    private final int[] b;
    private final com.huawei.hms.scankit.p.p3 c;
    private final com.huawei.hms.scankit.p.p3 d;
    private final int e;
    private final int f;
    private final int g;

    static {
            com.huawei.hms.scankit.p.o3 r0 = new com.huawei.hms.scankit.p.o3
            r1 = 4201(0x1069, float:5.887E-42)
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.huawei.hms.scankit.p.o3.h = r0
            com.huawei.hms.scankit.p.o3 r0 = new com.huawei.hms.scankit.p.o3
            r1 = 1033(0x409, float:1.448E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r2, r3)
            com.huawei.hms.scankit.p.o3.i = r0
            com.huawei.hms.scankit.p.o3 r0 = new com.huawei.hms.scankit.p.o3
            r1 = 67
            r2 = 64
            r0.<init>(r1, r2, r3)
            com.huawei.hms.scankit.p.o3.j = r0
            com.huawei.hms.scankit.p.o3 r1 = new com.huawei.hms.scankit.p.o3
            r2 = 19
            r4 = 16
            r1.<init>(r2, r4, r3)
            com.huawei.hms.scankit.p.o3.k = r1
            com.huawei.hms.scankit.p.o3 r1 = new com.huawei.hms.scankit.p.o3
            r2 = 0
            r4 = 285(0x11d, float:4.0E-43)
            r5 = 256(0x100, float:3.59E-43)
            r1.<init>(r4, r5, r2)
            com.huawei.hms.scankit.p.o3.l = r1
            com.huawei.hms.scankit.p.o3 r1 = new com.huawei.hms.scankit.p.o3
            r2 = 301(0x12d, float:4.22E-43)
            r1.<init>(r2, r5, r3)
            com.huawei.hms.scankit.p.o3.m = r1
            com.huawei.hms.scankit.p.o3.n = r1
            com.huawei.hms.scankit.p.o3.o = r0
            return
    }

    public o3(int r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            r4.f = r5
            r4.e = r6
            r4.g = r7
            int[] r7 = new int[r6]
            r4.a = r7
            int[] r7 = new int[r6]
            r4.b = r7
            r7 = 1
            r0 = 0
            r1 = 0
            r2 = 1
        L15:
            if (r1 >= r6) goto L26
            int[] r3 = r4.a
            r3[r1] = r2
            int r2 = r2 * 2
            if (r2 < r6) goto L23
            r2 = r2 ^ r5
            int r3 = r6 + (-1)
            r2 = r2 & r3
        L23:
            int r1 = r1 + 1
            goto L15
        L26:
            r5 = 0
        L27:
            int r1 = r6 + (-1)
            if (r5 >= r1) goto L36
            int[] r1 = r4.b
            int[] r2 = r4.a
            r2 = r2[r5]
            r1[r2] = r5
            int r5 = r5 + 1
            goto L27
        L36:
            com.huawei.hms.scankit.p.p3 r5 = new com.huawei.hms.scankit.p.p3
            int[] r6 = new int[]{r0}
            r5.<init>(r4, r6)
            r4.c = r5
            com.huawei.hms.scankit.p.p3 r5 = new com.huawei.hms.scankit.p.p3
            int[] r6 = new int[]{r7}
            r5.<init>(r4, r6)
            r4.d = r5
            return
    }

    static int a(int r0, int r1) {
            r0 = r0 ^ r1
            return r0
    }

    public int a() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    int a(int r2) {
            r1 = this;
            int[] r0 = r1.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r0 == 0) goto Ld
            int[] r0 = r1.a
            r2 = r0[r2]
            return r2
        Ld:
            r2 = -1
            return r2
    }

    int b(int r4) {
            r3 = this;
            if (r4 == 0) goto L10
            int[] r0 = r3.a
            int r1 = r3.e
            int[] r2 = r3.b
            r4 = r2[r4]
            int r1 = r1 - r4
            int r1 = r1 + (-1)
            r4 = r0[r1]
            return r4
        L10:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            r4.<init>()
            throw r4
    }

    com.huawei.hms.scankit.p.p3 b() {
            r1 = this;
            com.huawei.hms.scankit.p.p3 r0 = r1.d
            return r0
    }

    com.huawei.hms.scankit.p.p3 b(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L14
            if (r3 != 0) goto L7
            com.huawei.hms.scankit.p.p3 r2 = r1.c
            return r2
        L7:
            int r2 = r2 + 1
            int[] r2 = new int[r2]
            r0 = 0
            r2[r0] = r3
            com.huawei.hms.scankit.p.p3 r3 = new com.huawei.hms.scankit.p.p3
            r3.<init>(r1, r2)
            return r3
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public int c() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    int c(int r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int[] r0 = r1.b
            r2 = r0[r2]
            return r2
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    int c(int r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L16
            if (r4 != 0) goto L5
            goto L16
        L5:
            int[] r0 = r2.a
            int[] r1 = r2.b
            r3 = r1[r3]
            r4 = r1[r4]
            int r3 = r3 + r4
            int r4 = r2.e
            int r4 = r4 + (-1)
            int r3 = r3 % r4
            r3 = r0[r3]
            return r3
        L16:
            r3 = 0
            return r3
    }

    com.huawei.hms.scankit.p.p3 d() {
            r1 = this;
            com.huawei.hms.scankit.p.p3 r0 = r1.c
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GF(0x"
            r0.append(r1)
            int r1 = r2.f
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
