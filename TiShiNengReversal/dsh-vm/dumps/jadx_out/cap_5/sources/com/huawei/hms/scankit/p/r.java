package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r implements java.lang.Cloneable {
    private int[] a;
    private int[] b;
    private int c;

    public r() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1.a = r0
            return
    }

    public r(int r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            int[] r1 = f(r1)
            r0.a = r1
            return
    }

    r(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            return
    }

    private void a(int r4) {
            r3 = this;
            int[] r0 = r3.a
            int r0 = r0.length
            int r0 = r0 * 32
            if (r4 <= r0) goto L14
            int[] r4 = f(r4)
            int[] r0 = r3.a
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.a = r4
        L14:
            return
    }

    private int e(int r3) {
            r2 = this;
            r0 = 0
        L1:
            if (r3 <= 0) goto L9
            int r1 = r3 + (-1)
            r3 = r3 & r1
            int r0 = r0 + 1
            goto L1
        L9:
            return r0
    }

    private static int[] f(int r0) {
            int r0 = r0 + 31
            int r0 = r0 / 32
            int[] r0 = new int[r0]
            return r0
    }

    public void a() {
            r4 = this;
            int[] r0 = r4.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto Le
            int[] r3 = r4.a
            r3[r2] = r1
            int r2 = r2 + 1
            goto L5
        Le:
            return
    }

    public void a(int r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L1f
            r0 = 32
            if (r4 > r0) goto L1f
            int r0 = r2.c
            int r0 = r0 + r4
            r2.a(r0)
        Lc:
            if (r4 <= 0) goto L1e
            int r0 = r4 + (-1)
            int r0 = r3 >> r0
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            r2.a(r1)
            int r4 = r4 + (-1)
            goto Lc
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Num bits must be between 0 and 32"
            r3.<init>(r4)
            throw r3
    }

    public void a(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r10) goto L23
            r2 = 0
            r3 = 0
        L6:
            r4 = 8
            if (r2 >= r4) goto L1b
            boolean r4 = r6.b(r7)
            if (r4 == 0) goto L16
            int r4 = 7 - r2
            r5 = 1
            int r4 = r5 << r4
            r3 = r3 | r4
        L16:
            int r7 = r7 + 1
            int r2 = r2 + 1
            goto L6
        L1b:
            int r2 = r9 + r1
            byte r3 = (byte) r3
            r8[r2] = r3
            int r1 = r1 + 1
            goto L2
        L23:
            return
    }

    public void a(com.huawei.hms.scankit.p.r r4) {
            r3 = this;
            int r0 = r4.c
            int r1 = r3.c
            int r1 = r1 + r0
            r3.a(r1)
            r1 = 0
        L9:
            if (r1 >= r0) goto L15
            boolean r2 = r4.b(r1)
            r3.a(r2)
            int r1 = r1 + 1
            goto L9
        L15:
            return
    }

    public void a(boolean r5) {
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 + r1
            r4.a(r0)
            if (r5 == 0) goto L18
            int[] r5 = r4.a
            int r0 = r4.c
            int r2 = r0 / 32
            r3 = r5[r2]
            r0 = r0 & 31
            int r0 = r1 << r0
            r0 = r0 | r3
            r5[r2] = r0
        L18:
            int r5 = r4.c
            int r5 = r5 + r1
            r4.c = r5
            return
    }

    public boolean a(int r10, int r11, boolean r12, boolean r13) {
            r9 = this;
            if (r11 < r10) goto L4f
            if (r10 < 0) goto L4f
            int r0 = r9.c
            if (r11 > r0) goto L4f
            r0 = 1
            if (r11 != r10) goto Lc
            return r0
        Lc:
            int r11 = r11 + (-1)
            int r1 = r10 / 32
            int r2 = r11 / 32
            r3 = 0
            r4 = r1
            r5 = 0
        L15:
            if (r4 > r2) goto L4e
            if (r4 <= r1) goto L1b
            r6 = 0
            goto L1d
        L1b:
            r6 = r10 & 31
        L1d:
            if (r4 >= r2) goto L22
            r7 = 31
            goto L24
        L22:
            r7 = r11 & 31
        L24:
            r8 = 2
            int r7 = r8 << r7
            int r6 = r0 << r6
            int r7 = r7 - r6
            if (r13 != 0) goto L3d
            int[] r6 = r9.a
            r6 = r6[r4]
            r6 = r6 & r7
            int r6 = r9.e(r6)
            int r5 = r5 + r6
            int r6 = r11 - r10
            int r6 = r6 / 10
            if (r5 <= r6) goto L3d
            return r3
        L3d:
            if (r13 == 0) goto L4b
            int[] r6 = r9.a
            r6 = r6[r4]
            r6 = r6 & r7
            if (r12 == 0) goto L47
            goto L48
        L47:
            r7 = 0
        L48:
            if (r6 == r7) goto L4b
            return r3
        L4b:
            int r4 = r4 + 1
            goto L15
        L4e:
            return r0
        L4f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
    }

    public com.huawei.hms.scankit.p.r b() {
            r3 = this;
            com.huawei.hms.scankit.p.r r0 = new com.huawei.hms.scankit.p.r
            int[] r1 = r3.a
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            int r2 = r3.c
            r0.<init>(r1, r2)
            return r0
    }

    public void b(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.a
            int r2 = r2 / 32
            r0[r2] = r3
            return
    }

    public void b(com.huawei.hms.scankit.p.r r5) {
            r4 = this;
            int r0 = r4.c
            int r1 = r5.c
            if (r0 != r1) goto L19
            r0 = 0
        L7:
            int[] r1 = r4.a
            int r2 = r1.length
            if (r0 >= r2) goto L18
            r2 = r1[r0]
            int[] r3 = r5.a
            r3 = r3[r0]
            r2 = r2 ^ r3
            r1[r0] = r2
            int r0 = r0 + 1
            goto L7
        L18:
            return
        L19:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sizes don't match"
            r5.<init>(r0)
            throw r5
    }

    public boolean b(int r3) {
            r2 = this;
            int[] r0 = r2.a
            int r1 = r3 / 32
            r0 = r0[r1]
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 & r0
            if (r3 == 0) goto Lf
            return r1
        Lf:
            r3 = 0
            return r3
    }

    public int c(int r4) {
            r3 = this;
            int r0 = r3.c
            if (r4 < r0) goto L5
            return r0
        L5:
            int r0 = r4 / 32
            int[] r1 = r3.a
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r0)
            if (r1 == 0) goto L3e
            int[] r1 = r3.a
            r1 = r1[r0]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            int r4 = -r4
            r4 = r4 & r1
        L1a:
            if (r4 != 0) goto L31
            int r0 = r0 + 1
            int[] r1 = r3.a
            int r2 = r1.length
            if (r0 != r2) goto L26
            int r4 = r3.c
            return r4
        L26:
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r0)
            if (r1 == 0) goto L1a
            int[] r4 = r3.a
            r4 = r4[r0]
            goto L1a
        L31:
            int r0 = r0 * 32
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r0 = r0 + r4
            int r4 = r3.c
            if (r0 <= r4) goto L3d
            return r4
        L3d:
            return r0
        L3e:
            r4 = -1
            return r4
    }

    public void c() {
            r1 = this;
            int[] r0 = r1.a
            r1.b = r0
            return
    }

    public void c(int r7, int r8) {
            r6 = this;
            if (r8 < r7) goto L32
            if (r7 < 0) goto L32
            int r0 = r6.c
            if (r8 > r0) goto L32
            if (r8 != r7) goto Lb
            goto L31
        Lb:
            int r8 = r8 + (-1)
            int r0 = r7 / 32
            int r1 = r8 / 32
            r2 = r0
        L12:
            if (r2 > r1) goto L31
            r3 = 31
            if (r2 <= r0) goto L1a
            r4 = 0
            goto L1c
        L1a:
            r4 = r7 & 31
        L1c:
            if (r2 >= r1) goto L1f
            goto L20
        L1f:
            r3 = r3 & r8
        L20:
            r5 = 2
            int r3 = r5 << r3
            r5 = 1
            int r4 = r5 << r4
            int r3 = r3 - r4
            int[] r4 = r6.a
            r5 = r4[r2]
            r3 = r3 | r5
            r4[r2] = r3
            int r2 = r2 + 1
            goto L12
        L31:
            return
        L32:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.huawei.hms.scankit.p.r r0 = r1.b()
            return r0
    }

    public int d(int r4) {
            r3 = this;
            int r0 = r3.c
            if (r4 < r0) goto L5
            return r0
        L5:
            int r0 = r4 / 32
            int[] r1 = r3.a
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r0)
            if (r1 == 0) goto L40
            int[] r1 = r3.a
            r1 = r1[r0]
            int r1 = ~r1
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            int r4 = -r4
            r4 = r4 & r1
        L1b:
            if (r4 != 0) goto L33
            int r0 = r0 + 1
            int[] r1 = r3.a
            int r2 = r1.length
            if (r0 != r2) goto L27
            int r4 = r3.c
            return r4
        L27:
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r0)
            if (r1 == 0) goto L1b
            int[] r4 = r3.a
            r4 = r4[r0]
            int r4 = ~r4
            goto L1b
        L33:
            int r0 = r0 * 32
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r0 = r0 + r4
            int r4 = r3.c
            if (r0 <= r4) goto L3f
            return r4
        L3f:
            return r0
        L40:
            r4 = -1
            return r4
    }

    public int[] d() {
            r1 = this;
            int[] r0 = r1.a
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.huawei.hms.scankit.p.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.huawei.hms.scankit.p.r r4 = (com.huawei.hms.scankit.p.r) r4
            int r0 = r3.c
            int r2 = r4.c
            if (r0 != r2) goto L1a
            int[] r0 = r3.a
            int[] r4 = r4.a
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    public int f() {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    public void g() {
            r1 = this;
            int[] r0 = r1.b
            r1.a = r0
            return
    }

    public void g(int r5) {
            r4 = this;
            int[] r0 = r4.a
            int r1 = r5 / 32
            r2 = r0[r1]
            r5 = r5 & 31
            r3 = 1
            int r5 = r3 << r5
            r5 = r5 | r2
            r0[r1] = r5
            return
    }

    public void h() {
            r13 = this;
            int[] r0 = r13.a
            int r0 = r0.length
            int[] r0 = new int[r0]
            int r1 = r13.c
            r2 = 1
            int r1 = r1 - r2
            int r1 = r1 / 32
            int r3 = r1 + 1
            r4 = 0
            r5 = 0
        Lf:
            if (r5 >= r3) goto L51
            int[] r6 = r13.a
            r6 = r6[r5]
            long r6 = (long) r6
            long r8 = r6 >> r2
            r10 = 1431655765(0x55555555, double:7.0733193E-315)
            long r8 = r8 & r10
            long r6 = r6 & r10
            long r6 = r6 << r2
            long r6 = r6 | r8
            r8 = 2
            long r9 = r6 >> r8
            r11 = 858993459(0x33333333, double:4.24399158E-315)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 4
            long r9 = r6 >> r8
            r11 = 252645135(0xf0f0f0f, double:1.24823282E-315)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 8
            long r9 = r6 >> r8
            r11 = 16711935(0xff00ff, double:8.256793E-317)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 16
            long r9 = r6 >> r8
            r11 = 65535(0xffff, double:3.23786E-319)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            int r8 = r1 - r5
            int r7 = (int) r6
            r0[r8] = r7
            int r5 = r5 + 1
            goto Lf
        L51:
            int r5 = r13.c
            int r6 = r3 * 32
            if (r5 == r6) goto L6f
            int r6 = r6 - r5
            r4 = r0[r4]
            int r4 = r4 >>> r6
        L5b:
            if (r2 >= r3) goto L6d
            r5 = r0[r2]
            int r7 = 32 - r6
            int r7 = r5 << r7
            r4 = r4 | r7
            int r7 = r2 + (-1)
            r0[r7] = r4
            int r4 = r5 >>> r6
            int r2 = r2 + 1
            goto L5b
        L6d:
            r0[r1] = r4
        L6f:
            r13.a = r0
            return
    }

    public void h(int r5) {
            r4 = this;
            int[] r0 = r4.a
            int r1 = r5 / 32
            r2 = r0[r1]
            r5 = r5 & 31
            r3 = 1
            int r5 = r3 << r5
            int r2 = r2 - r5
            r0[r1] = r2
            return
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.c
            int r0 = r0 * 31
            int[] r1 = r2.a
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public void i() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.c
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L1b
            boolean r1 = r2.b(r0)
            if (r1 != 0) goto L18
            int r1 = r0 + 1
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L18
            r2.g(r0)
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    public void j() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.c
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L1b
            boolean r1 = r2.b(r0)
            if (r1 == 0) goto L18
            int r1 = r0 + 1
            boolean r1 = r2.b(r1)
            if (r1 != 0) goto L18
            r2.h(r0)
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.c
            int r2 = r1 / 8
            int r1 = r1 + r2
            int r1 = r1 + 1
            r0.<init>(r1)
            r1 = 0
        Ld:
            int r2 = r3.c
            if (r1 >= r2) goto L2b
            r2 = r1 & 7
            if (r2 != 0) goto L1a
            r2 = 32
            r0.append(r2)
        L1a:
            boolean r2 = r3.b(r1)
            if (r2 == 0) goto L23
            r2 = 88
            goto L25
        L23:
            r2 = 46
        L25:
            r0.append(r2)
            int r1 = r1 + 1
            goto Ld
        L2b:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
