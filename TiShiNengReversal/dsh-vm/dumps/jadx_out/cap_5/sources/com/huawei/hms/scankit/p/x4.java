package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class x4 {
    private final com.huawei.hms.scankit.p.w4 a;
    private final int[] b;

    x4(com.huawei.hms.scankit.p.w4 r4, int[] r5) {
            r3 = this;
            r3.<init>()
            int r0 = r5.length
            if (r0 == 0) goto L2f
            r3.a = r4
            int r4 = r5.length
            r0 = 1
            if (r4 <= r0) goto L2c
            r1 = 0
            r2 = r5[r1]
            if (r2 != 0) goto L2c
        L11:
            if (r0 >= r4) goto L1a
            r2 = r5[r0]
            if (r2 != 0) goto L1a
            int r0 = r0 + 1
            goto L11
        L1a:
            if (r0 != r4) goto L23
            int[] r4 = new int[]{r1}
            r3.b = r4
            return
        L23:
            int r4 = r4 - r0
            int[] r2 = new int[r4]
            r3.b = r2
            java.lang.System.arraycopy(r5, r0, r2, r1, r4)
            return
        L2c:
            r3.b = r5
            return
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    int a() {
            r1 = this;
            int[] r0 = r1.b
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    int a(int r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L8
            int r6 = r5.b(r0)
            return r6
        L8:
            r1 = 1
            if (r6 != r1) goto L1d
            int[] r6 = r5.b
            int r1 = r6.length
            r2 = 0
        Lf:
            if (r0 >= r1) goto L1c
            r3 = r6[r0]
            com.huawei.hms.scankit.p.w4 r4 = r5.a
            int r2 = r4.a(r2, r3)
            int r0 = r0 + 1
            goto Lf
        L1c:
            return r2
        L1d:
            int[] r2 = r5.b
            r0 = r2[r0]
            int r2 = r2.length
        L22:
            if (r1 >= r2) goto L35
            com.huawei.hms.scankit.p.w4 r3 = r5.a
            int r0 = r3.c(r6, r0)
            int[] r4 = r5.b
            r4 = r4[r1]
            int r0 = r3.a(r0, r4)
            int r1 = r1 + 1
            goto L22
        L35:
            return r0
    }

    com.huawei.hms.scankit.p.x4 a(int r5, int r6) {
            r4 = this;
            if (r5 < 0) goto L2b
            if (r6 != 0) goto Lb
            com.huawei.hms.scankit.p.w4 r5 = r4.a
            com.huawei.hms.scankit.p.x4 r5 = r5.c()
            return r5
        Lb:
            int[] r0 = r4.b
            int r0 = r0.length
            int r5 = r5 + r0
            int[] r5 = new int[r5]
            r1 = 0
        L12:
            if (r1 >= r0) goto L23
            com.huawei.hms.scankit.p.w4 r2 = r4.a
            int[] r3 = r4.b
            r3 = r3[r1]
            int r2 = r2.c(r3, r6)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L12
        L23:
            com.huawei.hms.scankit.p.x4 r6 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r4.a
            r6.<init>(r0, r5)
            return r6
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    com.huawei.hms.scankit.p.x4 a(com.huawei.hms.scankit.p.x4 r9) {
            r8 = this;
            com.huawei.hms.scankit.p.w4 r0 = r8.a
            com.huawei.hms.scankit.p.w4 r1 = r9.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            boolean r0 = r8.b()
            if (r0 == 0) goto L11
            return r9
        L11:
            boolean r0 = r9.b()
            if (r0 == 0) goto L18
            return r8
        L18:
            int[] r0 = r8.b
            int[] r9 = r9.b
            int r1 = r0.length
            int r2 = r9.length
            if (r1 <= r2) goto L21
            goto L24
        L21:
            r7 = r0
            r0 = r9
            r9 = r7
        L24:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = r0.length
            int r3 = r9.length
            int r2 = r2 - r3
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r3 = r2
        L2f:
            int r4 = r0.length
            if (r3 >= r4) goto L43
            com.huawei.hms.scankit.p.w4 r4 = r8.a
            int r5 = r3 - r2
            r5 = r9[r5]
            r6 = r0[r3]
            int r4 = r4.a(r5, r6)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2f
        L43:
            com.huawei.hms.scankit.p.x4 r9 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r8.a
            r9.<init>(r0, r1)
            return r9
        L4b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ModulusPolys do not have same ModulusGF field"
            r9.<init>(r0)
            throw r9
    }

    int b(int r3) {
            r2 = this;
            int[] r0 = r2.b
            int r1 = r0.length
            int r1 = r1 + (-1)
            int r1 = r1 - r3
            r3 = r0[r1]
            return r3
    }

    com.huawei.hms.scankit.p.x4 b(com.huawei.hms.scankit.p.x4 r13) {
            r12 = this;
            com.huawei.hms.scankit.p.w4 r0 = r12.a
            com.huawei.hms.scankit.p.w4 r1 = r13.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            boolean r0 = r12.b()
            if (r0 != 0) goto L4c
            boolean r0 = r13.b()
            if (r0 == 0) goto L17
            goto L4c
        L17:
            int[] r0 = r12.b
            int r1 = r0.length
            int[] r13 = r13.b
            int r2 = r13.length
            int r3 = r1 + r2
            int r3 = r3 + (-1)
            int[] r3 = new int[r3]
            r4 = 0
            r5 = 0
        L25:
            if (r5 >= r1) goto L44
            r6 = r0[r5]
            r7 = 0
        L2a:
            if (r7 >= r2) goto L41
            int r8 = r5 + r7
            com.huawei.hms.scankit.p.w4 r9 = r12.a
            r10 = r3[r8]
            r11 = r13[r7]
            int r11 = r9.c(r6, r11)
            int r9 = r9.a(r10, r11)
            r3[r8] = r9
            int r7 = r7 + 1
            goto L2a
        L41:
            int r5 = r5 + 1
            goto L25
        L44:
            com.huawei.hms.scankit.p.x4 r13 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r12.a
            r13.<init>(r0, r3)
            return r13
        L4c:
            com.huawei.hms.scankit.p.w4 r13 = r12.a
            com.huawei.hms.scankit.p.x4 r13 = r13.c()
            return r13
        L53:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ModulusPolys do not have same ModulusGF field"
            r13.<init>(r0)
            throw r13
    }

    boolean b() {
            r2 = this;
            int[] r0 = r2.b
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            return r1
    }

    com.huawei.hms.scankit.p.x4 c() {
            r6 = this;
            int[] r0 = r6.b
            int r0 = r0.length
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L18
            com.huawei.hms.scankit.p.w4 r4 = r6.a
            int[] r5 = r6.b
            r5 = r5[r3]
            int r4 = r4.d(r2, r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L7
        L18:
            com.huawei.hms.scankit.p.x4 r0 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r2 = r6.a
            r0.<init>(r2, r1)
            return r0
    }

    com.huawei.hms.scankit.p.x4 c(int r6) {
            r5 = this;
            if (r6 != 0) goto L9
            com.huawei.hms.scankit.p.w4 r6 = r5.a
            com.huawei.hms.scankit.p.x4 r6 = r6.c()
            return r6
        L9:
            r0 = 1
            if (r6 != r0) goto Ld
            return r5
        Ld:
            int[] r0 = r5.b
            int r0 = r0.length
            int[] r1 = new int[r0]
            r2 = 0
        L13:
            if (r2 >= r0) goto L24
            com.huawei.hms.scankit.p.w4 r3 = r5.a
            int[] r4 = r5.b
            r4 = r4[r2]
            int r3 = r3.c(r4, r6)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L13
        L24:
            com.huawei.hms.scankit.p.x4 r6 = new com.huawei.hms.scankit.p.x4
            com.huawei.hms.scankit.p.w4 r0 = r5.a
            r6.<init>(r0, r1)
            return r6
    }

    com.huawei.hms.scankit.p.x4 c(com.huawei.hms.scankit.p.x4 r3) {
            r2 = this;
            com.huawei.hms.scankit.p.w4 r0 = r2.a
            com.huawei.hms.scankit.p.w4 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            boolean r0 = r3.b()
            if (r0 == 0) goto L11
            return r2
        L11:
            com.huawei.hms.scankit.p.x4 r3 = r3.c()
            com.huawei.hms.scankit.p.x4 r3 = r2.a(r3)
            return r3
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ModulusPolys do not have same ModulusGF field"
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.a()
            int r1 = r1 * 8
            r0.<init>(r1)
            int r1 = r4.a()
        Lf:
            if (r1 < 0) goto L48
            int r2 = r4.b(r1)
            if (r2 == 0) goto L45
            if (r2 >= 0) goto L20
            java.lang.String r3 = " - "
            r0.append(r3)
            int r2 = -r2
            goto L2b
        L20:
            int r3 = r0.length()
            if (r3 <= 0) goto L2b
            java.lang.String r3 = " + "
            r0.append(r3)
        L2b:
            r3 = 1
            if (r1 == 0) goto L30
            if (r2 == r3) goto L33
        L30:
            r0.append(r2)
        L33:
            if (r1 == 0) goto L45
            if (r1 != r3) goto L3d
            r2 = 120(0x78, float:1.68E-43)
            r0.append(r2)
            goto L45
        L3d:
            java.lang.String r2 = "x^"
            r0.append(r2)
            r0.append(r1)
        L45:
            int r1 = r1 + (-1)
            goto Lf
        L48:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
