package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s implements java.lang.Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public s(int r1) {
            r0 = this;
            r0.<init>(r1, r1)
            return
    }

    public s(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r2 < r0) goto L19
            if (r3 < r0) goto L19
            r1.a = r2
            r1.b = r3
            int r2 = r2 + 31
            int r2 = r2 / 32
            r1.c = r2
            int r2 = r2 * r3
            int[] r2 = new int[r2]
            r1.d = r2
            return
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Both dimensions must be greater than 0"
            r2.<init>(r3)
            throw r2
    }

    public s(int r1, int r2, int r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    private java.lang.String a(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.b
            int r2 = r5.a
            int r2 = r2 + 1
            int r1 = r1 * r2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        Lf:
            int r3 = r5.b
            if (r2 >= r3) goto L2d
            r3 = 0
        L14:
            int r4 = r5.a
            if (r3 >= r4) goto L27
            boolean r4 = r5.b(r3, r2)
            if (r4 == 0) goto L20
            r4 = r6
            goto L21
        L20:
            r4 = r7
        L21:
            r0.append(r4)
            int r3 = r3 + 1
            goto L14
        L27:
            r0.append(r8)
            int r2 = r2 + 1
            goto Lf
        L2d:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public com.huawei.hms.scankit.p.r a(int r5, com.huawei.hms.scankit.p.r r6) {
            r4 = this;
            if (r6 == 0) goto Lf
            int r0 = r6.e()
            int r1 = r4.a
            if (r0 >= r1) goto Lb
            goto Lf
        Lb:
            r6.a()
            goto L16
        Lf:
            com.huawei.hms.scankit.p.r r6 = new com.huawei.hms.scankit.p.r
            int r0 = r4.a
            r6.<init>(r0)
        L16:
            int r0 = r4.c
            int r5 = r5 * r0
            r0 = 0
        L1b:
            int r1 = r4.c
            if (r0 >= r1) goto L2d
            int r1 = r0 * 32
            int[] r2 = r4.d
            int r3 = r5 + r0
            r2 = r2[r3]
            r6.b(r1, r2)
            int r0 = r0 + 1
            goto L1b
        L2d:
            return r6
    }

    public java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "\n"
            java.lang.String r2 = r1.a(r2, r3, r0)
            return r2
    }

    public void a() {
            r4 = this;
            int[] r0 = r4.d
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto Le
            int[] r3 = r4.d
            r3[r2] = r1
            int r2 = r2 + 1
            goto L5
        Le:
            return
    }

    public void a(int r4, int r5) {
            r3 = this;
            int r0 = r3.c
            int r5 = r5 * r0
            int r0 = r4 / 32
            int r5 = r5 + r0
            int[] r0 = r3.d
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r5)
            if (r0 == 0) goto L1b
            int[] r0 = r3.d
            r1 = r0[r5]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            r4 = r4 ^ r1
            r0[r5] = r4
        L1b:
            return
    }

    public void a(int r8, int r9, int r10, int r11) {
            r7 = this;
            if (r9 < 0) goto L41
            if (r8 < 0) goto L41
            r0 = 1
            if (r11 < r0) goto L39
            if (r10 < r0) goto L39
            int r10 = r10 + r8
            int r11 = r11 + r9
            int r1 = r7.b
            if (r11 > r1) goto L31
            int r1 = r7.a
            if (r10 > r1) goto L31
        L13:
            if (r9 >= r11) goto L30
            int r1 = r7.c
            int r1 = r1 * r9
            r2 = r8
        L1a:
            if (r2 >= r10) goto L2d
            int[] r3 = r7.d
            int r4 = r2 / 32
            int r4 = r4 + r1
            r5 = r3[r4]
            r6 = r2 & 31
            int r6 = r0 << r6
            r5 = r5 | r6
            r3[r4] = r5
            int r2 = r2 + 1
            goto L1a
        L2d:
            int r9 = r9 + 1
            goto L13
        L30:
            return
        L31:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The region must fit inside the matrix"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Height and width must be at least 1"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Left and top must be nonnegative"
            r8.<init>(r9)
            throw r8
    }

    public com.huawei.hms.scankit.p.s b() {
            r5 = this;
            com.huawei.hms.scankit.p.s r0 = new com.huawei.hms.scankit.p.s
            int r1 = r5.a
            int r2 = r5.b
            int r3 = r5.c
            int[] r4 = r5.d
            java.lang.Object r4 = r4.clone()
            int[] r4 = (int[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public void b(int r4, com.huawei.hms.scankit.p.r r5) {
            r3 = this;
            int[] r5 = r5.d()
            int[] r0 = r3.d
            int r1 = r3.c
            int r4 = r4 * r1
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r4, r1)
            return
    }

    public boolean b(int r3, int r4) {
            r2 = this;
            int r0 = r2.c
            int r4 = r4 * r0
            int r0 = r3 / 32
            int r4 = r4 + r0
            int[] r0 = r2.d
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r4)
            r1 = 0
            if (r0 == 0) goto L1d
            int[] r0 = r2.d
            r4 = r0[r4]
            r3 = r3 & 31
            int r3 = r4 >>> r3
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L1d
            return r4
        L1d:
            return r1
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public void c(int r4, int r5) {
            r3 = this;
            int r0 = r3.c
            int r5 = r5 * r0
            int r0 = r4 / 32
            int r5 = r5 + r0
            int[] r0 = r3.d
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r5)
            if (r0 == 0) goto L1b
            int[] r0 = r3.d
            r1 = r0[r5]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            r4 = r4 | r1
            r0[r5] = r4
        L1b:
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.huawei.hms.scankit.p.s r0 = r1.b()
            return r0
    }

    public com.huawei.hms.scankit.p.s d() {
            r5 = this;
            int[] r0 = r5.d
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 0
        L6:
            int[] r2 = r5.d
            int r3 = r2.length
            if (r1 >= r3) goto L13
            r2 = r2[r1]
            int r2 = ~r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L13:
            com.huawei.hms.scankit.p.s r1 = new com.huawei.hms.scankit.p.s
            int r2 = r5.a
            int r3 = r5.b
            int r4 = r5.c
            r1.<init>(r2, r3, r4, r0)
            return r1
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.huawei.hms.scankit.p.s
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.huawei.hms.scankit.p.s r4 = (com.huawei.hms.scankit.p.s) r4
            int r0 = r3.a
            int r2 = r4.a
            if (r0 != r2) goto L26
            int r0 = r3.b
            int r2 = r4.b
            if (r0 != r2) goto L26
            int r0 = r3.c
            int r2 = r4.c
            if (r0 != r2) goto L26
            int[] r0 = r3.d
            int[] r4 = r4.d
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L26
            r4 = 1
            return r4
        L26:
            return r1
    }

    public void f() {
            r5 = this;
            int r0 = r5.e()
            int r1 = r5.c()
            com.huawei.hms.scankit.p.r r2 = new com.huawei.hms.scankit.p.r
            r2.<init>(r0)
            com.huawei.hms.scankit.p.r r3 = new com.huawei.hms.scankit.p.r
            r3.<init>(r0)
            r0 = 0
        L13:
            int r4 = r1 + 1
            int r4 = r4 / 2
            if (r0 >= r4) goto L33
            com.huawei.hms.scankit.p.r r2 = r5.a(r0, r2)
            int r4 = r1 + (-1)
            int r4 = r4 - r0
            com.huawei.hms.scankit.p.r r3 = r5.a(r4, r3)
            r2.h()
            r3.h()
            r5.b(r0, r3)
            r5.b(r4, r2)
            int r0 = r0 + 1
            goto L13
        L33:
            return
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r1 = r0 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.b
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.c
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r0 = r2.d
            int r0 = java.util.Arrays.hashCode(r0)
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "X "
            java.lang.String r1 = "  "
            java.lang.String r0 = r2.a(r0, r1)
            return r0
    }
}
