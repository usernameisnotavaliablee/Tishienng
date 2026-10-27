package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class p3 {
    private final com.huawei.hms.scankit.p.o3 a;
    private final int[] b;

    p3(com.huawei.hms.scankit.p.o3 r4, int[] r5) {
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

    int a(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L8
            int r5 = r4.b(r0)
            return r5
        L8:
            r1 = 1
            if (r5 != r1) goto L1b
            int[] r5 = r4.b
            int r1 = r5.length
            r2 = 0
        Lf:
            if (r0 >= r1) goto L1a
            r3 = r5[r0]
            int r2 = com.huawei.hms.scankit.p.o3.a(r2, r3)
            int r0 = r0 + 1
            goto Lf
        L1a:
            return r2
        L1b:
            int[] r2 = r4.b
            r0 = r2[r0]
            int r2 = r2.length
        L20:
            if (r1 >= r2) goto L33
            com.huawei.hms.scankit.p.o3 r3 = r4.a
            int r0 = r3.c(r5, r0)
            int[] r3 = r4.b
            r3 = r3[r1]
            int r0 = com.huawei.hms.scankit.p.o3.a(r0, r3)
            int r1 = r1 + 1
            goto L20
        L33:
            return r0
    }

    com.huawei.hms.scankit.p.p3 a(int r5, int r6) {
            r4 = this;
            if (r5 < 0) goto L2b
            if (r6 != 0) goto Lb
            com.huawei.hms.scankit.p.o3 r5 = r4.a
            com.huawei.hms.scankit.p.p3 r5 = r5.d()
            return r5
        Lb:
            int[] r0 = r4.b
            int r0 = r0.length
            int r5 = r5 + r0
            int[] r5 = new int[r5]
            r1 = 0
        L12:
            if (r1 >= r0) goto L23
            com.huawei.hms.scankit.p.o3 r2 = r4.a
            int[] r3 = r4.b
            r3 = r3[r1]
            int r2 = r2.c(r3, r6)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L12
        L23:
            com.huawei.hms.scankit.p.p3 r6 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r0 = r4.a
            r6.<init>(r0, r5)
            return r6
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    com.huawei.hms.scankit.p.p3 a(com.huawei.hms.scankit.p.p3 r8) {
            r7 = this;
            com.huawei.hms.scankit.p.o3 r0 = r7.a
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            boolean r0 = r7.c()
            if (r0 == 0) goto L11
            return r8
        L11:
            boolean r0 = r8.c()
            if (r0 == 0) goto L18
            return r7
        L18:
            int[] r0 = r7.b
            int[] r8 = r8.b
            int r1 = r0.length
            int r2 = r8.length
            if (r1 <= r2) goto L21
            goto L24
        L21:
            r6 = r0
            r0 = r8
            r8 = r6
        L24:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = r0.length
            int r3 = r8.length
            int r2 = r2 - r3
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r3 = r2
        L2f:
            int r4 = r0.length
            if (r3 >= r4) goto L41
            int r4 = r3 - r2
            r4 = r8[r4]
            r5 = r0[r3]
            int r4 = com.huawei.hms.scankit.p.o3.a(r4, r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2f
        L41:
            com.huawei.hms.scankit.p.p3 r8 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r0 = r7.a
            r8.<init>(r0, r1)
            return r8
        L49:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            r8.<init>(r0)
            throw r8
    }

    int[] a() {
            r1 = this;
            int[] r0 = r1.b
            return r0
    }

    int b() {
            r1 = this;
            int[] r0 = r1.b
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
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

    com.huawei.hms.scankit.p.p3[] b(com.huawei.hms.scankit.p.p3 r8) {
            r7 = this;
            com.huawei.hms.scankit.p.o3 r0 = r7.a
            com.huawei.hms.scankit.p.o3 r1 = r8.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            boolean r0 = r8.c()
            if (r0 != 0) goto L69
            com.huawei.hms.scankit.p.o3 r0 = r7.a
            com.huawei.hms.scankit.p.p3 r0 = r0.d()
            int r1 = r8.b()
            int r1 = r8.b(r1)
            com.huawei.hms.scankit.p.o3 r2 = r7.a
            int r1 = r2.b(r1)
            r2 = r7
        L25:
            int r3 = r2.b()
            int r4 = r8.b()
            if (r3 < r4) goto L5f
            boolean r3 = r2.c()
            if (r3 != 0) goto L5f
            int r3 = r2.b()
            int r4 = r8.b()
            int r3 = r3 - r4
            com.huawei.hms.scankit.p.o3 r4 = r7.a
            int r5 = r2.b()
            int r5 = r2.b(r5)
            int r4 = r4.c(r5, r1)
            com.huawei.hms.scankit.p.p3 r5 = r8.a(r3, r4)
            com.huawei.hms.scankit.p.o3 r6 = r7.a
            com.huawei.hms.scankit.p.p3 r3 = r6.b(r3, r4)
            com.huawei.hms.scankit.p.p3 r0 = r0.a(r3)
            com.huawei.hms.scankit.p.p3 r2 = r2.a(r5)
            goto L25
        L5f:
            r8 = 2
            com.huawei.hms.scankit.p.p3[] r8 = new com.huawei.hms.scankit.p.p3[r8]
            r1 = 0
            r8[r1] = r0
            r0 = 1
            r8[r0] = r2
            return r8
        L69:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Divide by 0"
            r8.<init>(r0)
            throw r8
        L71:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            r8.<init>(r0)
            throw r8
    }

    com.huawei.hms.scankit.p.p3 c(int r6) {
            r5 = this;
            if (r6 != 0) goto L9
            com.huawei.hms.scankit.p.o3 r6 = r5.a
            com.huawei.hms.scankit.p.p3 r6 = r6.d()
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
            com.huawei.hms.scankit.p.o3 r3 = r5.a
            int[] r4 = r5.b
            r4 = r4[r2]
            int r3 = r3.c(r4, r6)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L13
        L24:
            com.huawei.hms.scankit.p.p3 r6 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r0 = r5.a
            r6.<init>(r0, r1)
            return r6
    }

    com.huawei.hms.scankit.p.p3 c(com.huawei.hms.scankit.p.p3 r13) {
            r12 = this;
            com.huawei.hms.scankit.p.o3 r0 = r12.a
            com.huawei.hms.scankit.p.o3 r1 = r13.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            boolean r0 = r12.c()
            if (r0 != 0) goto L4c
            boolean r0 = r13.c()
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
            r9 = r3[r8]
            com.huawei.hms.scankit.p.o3 r10 = r12.a
            r11 = r13[r7]
            int r10 = r10.c(r6, r11)
            int r9 = com.huawei.hms.scankit.p.o3.a(r9, r10)
            r3[r8] = r9
            int r7 = r7 + 1
            goto L2a
        L41:
            int r5 = r5 + 1
            goto L25
        L44:
            com.huawei.hms.scankit.p.p3 r13 = new com.huawei.hms.scankit.p.p3
            com.huawei.hms.scankit.p.o3 r0 = r12.a
            r13.<init>(r0, r3)
            return r13
        L4c:
            com.huawei.hms.scankit.p.o3 r13 = r12.a
            com.huawei.hms.scankit.p.p3 r13 = r13.d()
            return r13
        L53:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            r13.<init>(r0)
            throw r13
    }

    boolean c() {
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

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.b()
            int r1 = r1 * 8
            r0.<init>(r1)
            int r1 = r5.b()
        Lf:
            if (r1 < 0) goto L63
            int r2 = r5.b(r1)
            if (r2 == 0) goto L60
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
            if (r2 == r3) goto L4e
        L30:
            com.huawei.hms.scankit.p.o3 r4 = r5.a
            int r2 = r4.c(r2)
            if (r2 != 0) goto L3e
            r2 = 49
            r0.append(r2)
            goto L4e
        L3e:
            if (r2 != r3) goto L46
            r2 = 97
            r0.append(r2)
            goto L4e
        L46:
            java.lang.String r4 = "a^"
            r0.append(r4)
            r0.append(r2)
        L4e:
            if (r1 == 0) goto L60
            if (r1 != r3) goto L58
            r2 = 120(0x78, float:1.68E-43)
            r0.append(r2)
            goto L60
        L58:
            java.lang.String r2 = "x^"
            r0.append(r2)
            r0.append(r1)
        L60:
            int r1 = r1 + (-1)
            goto Lf
        L63:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
