package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f2 {
    private static final int[] a = null;
    private static final int[] b = null;
    private static final int[] c = null;
    private static final int[] d = null;
    private static boolean e;

    static {
            r0 = 1
            r1 = 5
            r2 = 0
            r3 = 4
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.huawei.hms.scankit.p.f2.a = r0
            r0 = 7
            r1 = 3
            r2 = 6
            r3 = 2
            int[] r0 = new int[]{r2, r3, r0, r1}
            com.huawei.hms.scankit.p.f2.b = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [8, 1, 1, 1, 1, 1, 1, 3} // fill-array
            com.huawei.hms.scankit.p.f2.c = r0
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [7, 1, 1, 3, 1, 1, 1, 2, 1} // fill-array
            com.huawei.hms.scankit.p.f2.d = r0
            return
    }

    public f2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static float a(int[] r9, int[] r10, float r11) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            if (r2 >= r0) goto L10
            r5 = r9[r2]
            int r3 = r3 + r5
            r5 = r10[r2]
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L5
        L10:
            r2 = 2139095040(0x7f800000, float:Infinity)
            if (r3 >= r4) goto L15
            return r2
        L15:
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r11 = r11 * r4
            r5 = 0
        L1c:
            if (r1 >= r0) goto L37
            r6 = r9[r1]
            r7 = r10[r1]
            float r7 = (float) r7
            float r7 = r7 * r4
            float r6 = (float) r6
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2c
            float r6 = r6 - r7
            goto L2e
        L2c:
            float r6 = r7 - r6
        L2e:
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 <= 0) goto L33
            return r2
        L33:
            float r5 = r5 + r6
            int r1 = r1 + 1
            goto L1c
        L37:
            float r5 = r5 / r3
            return r5
    }

    public static com.huawei.hms.scankit.p.o5 a(com.huawei.hms.scankit.p.p r1, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r2, boolean r3) throws com.huawei.hms.scankit.p.a {
            com.huawei.hms.scankit.p.s r1 = r1.b()
            r2 = 0
            a(r2)
            java.util.List r2 = a(r3, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L21
            com.huawei.hms.scankit.p.s r1 = r1.b()
            r1.f()
            java.util.List r2 = a(r3, r1)
            r3 = 1
            a(r3)
        L21:
            com.huawei.hms.scankit.p.o5 r3 = new com.huawei.hms.scankit.p.o5
            r3.<init>(r1, r2)
            return r3
    }

    private static java.util.List<com.huawei.hms.scankit.p.u6[]> a(boolean r8, com.huawei.hms.scankit.p.s r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            r3 = 0
            r4 = 0
        L9:
            int r5 = r9.c()
            if (r2 >= r5) goto L78
            com.huawei.hms.scankit.p.u6[] r3 = a(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 != 0) goto L20
            goto L78
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            com.huawei.hms.scankit.p.u6[] r4 = (com.huawei.hms.scankit.p.u6[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3e
            float r2 = (float) r2
            float r7 = r7.c()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3e:
            r4 = r4[r5]
            if (r4 == 0) goto L24
            float r4 = r4.c()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L24
        L4c:
            int r2 = r2 + 5
            goto L7
        L4f:
            r0.add(r3)
            if (r8 != 0) goto L55
            goto L78
        L55:
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L69
            float r4 = r4.b()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.c()
        L65:
            int r2 = (int) r2
            r3 = r4
            r4 = 1
            goto L9
        L69:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.b()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.c()
            goto L65
        L78:
            return r0
    }

    public static void a(boolean r0) {
            com.huawei.hms.scankit.p.f2.e = r0
            return
    }

    private static void a(com.huawei.hms.scankit.p.u6[] r3, com.huawei.hms.scankit.p.u6[] r4, int[] r5) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto Ld
            r1 = r5[r0]
            r2 = r4[r0]
            r3[r1] = r2
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }

    public static boolean a() {
            boolean r0 = com.huawei.hms.scankit.p.f2.e
            return r0
    }

    private static int[] a(com.huawei.hms.scankit.p.s r8, int r9, int r10, int r11, boolean r12, int[] r13, int[] r14) {
            int r0 = r14.length
            r1 = 0
            java.util.Arrays.fill(r14, r1, r0, r1)
            r0 = 0
        L6:
            boolean r2 = r8.b(r9, r10)
            if (r2 == 0) goto L17
            if (r9 <= 0) goto L17
            int r2 = r0 + 1
            r3 = 3
            if (r0 >= r3) goto L17
            int r9 = r9 + (-1)
            r0 = r2
            goto L6
        L17:
            int r0 = r13.length
            r2 = r12
            r3 = 0
            r12 = r9
        L1b:
            r4 = 1054280253(0x3ed70a3d, float:0.42)
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            r6 = 1
            if (r9 >= r11) goto L5d
            boolean r7 = r8.b(r9, r10)
            if (r7 == r2) goto L30
            r4 = r14[r3]
            int r4 = r4 + r6
            r14[r3] = r4
            goto L5a
        L30:
            int r7 = r0 + (-1)
            if (r3 != r7) goto L54
            float r5 = a(r14, r13, r5)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L41
            int[] r8 = new int[]{r12, r9}
            return r8
        L41:
            r4 = r14[r1]
            r5 = r14[r6]
            int r4 = r4 + r5
            int r12 = r12 + r4
            int r4 = r3 + (-1)
            r5 = 2
            java.lang.System.arraycopy(r14, r5, r14, r1, r4)
            r14[r4] = r1
            r14[r3] = r1
            int r3 = r3 + (-1)
            goto L56
        L54:
            int r3 = r3 + 1
        L56:
            r14[r3] = r6
            r2 = r2 ^ 1
        L5a:
            int r9 = r9 + 1
            goto L1b
        L5d:
            int r0 = r0 - r6
            if (r3 != r0) goto L6e
            float r8 = a(r14, r13, r5)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L6e
            int r9 = r9 - r6
            int[] r8 = new int[]{r12, r9}
            return r8
        L6e:
            r8 = 0
            return r8
    }

    private static com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.s r7, int r8, int r9) {
            int r1 = r7.c()
            int r2 = r7.e()
            r0 = 8
            com.huawei.hms.scankit.p.u6[] r6 = new com.huawei.hms.scankit.p.u6[r0]
            int[] r5 = com.huawei.hms.scankit.p.f2.c
            r0 = r7
            r3 = r8
            r4 = r9
            com.huawei.hms.scankit.p.u6[] r7 = a(r0, r1, r2, r3, r4, r5)
            int[] r8 = com.huawei.hms.scankit.p.f2.a
            a(r6, r7, r8)
            r7 = 4
            r8 = r6[r7]
            if (r8 == 0) goto L2d
            float r8 = r8.b()
            int r9 = (int) r8
            r7 = r6[r7]
            float r7 = r7.c()
            int r8 = (int) r7
            r3 = r8
            r4 = r9
        L2d:
            int[] r5 = com.huawei.hms.scankit.p.f2.d
            com.huawei.hms.scankit.p.u6[] r7 = a(r0, r1, r2, r3, r4, r5)
            int[] r8 = com.huawei.hms.scankit.p.f2.b
            a(r6, r7, r8)
            return r6
    }

    private static com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.s r15, int r16, int r17, int r18, int r19, int[] r20) {
            r0 = r16
            r1 = 4
            com.huawei.hms.scankit.p.u6[] r1 = new com.huawei.hms.scankit.p.u6[r1]
            r7 = r20
            int r2 = r7.length
            int[] r8 = new int[r2]
            r4 = r18
        Lc:
            r9 = 1
            r10 = 0
            if (r4 >= r0) goto L4d
            r6 = 0
            r2 = r15
            r5 = r17
            r3 = r19
            int[] r6 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r6 == 0) goto L48
        L1c:
            r11 = r4
            r12 = r6
            if (r11 <= 0) goto L31
            int r4 = r11 + (-1)
            r6 = 0
            r2 = r15
            r5 = r17
            r3 = r19
            r7 = r20
            int[] r6 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r6 == 0) goto L31
            goto L1c
        L31:
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            r3 = r12[r10]
            float r3 = (float) r3
            float r4 = (float) r11
            r2.<init>(r3, r4)
            r1[r10] = r2
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            r3 = r12[r9]
            float r3 = (float) r3
            r2.<init>(r3, r4)
            r1[r9] = r2
            r2 = 1
            goto L4f
        L48:
            int r4 = r4 + 5
            r7 = r20
            goto Lc
        L4d:
            r11 = r4
            r2 = 0
        L4f:
            int r3 = r11 + 1
            if (r2 == 0) goto Lb8
            r12 = 2
            int[] r2 = new int[r12]
            r4 = r1[r10]
            float r4 = r4.b()
            int r4 = (int) r4
            r2[r10] = r4
            r4 = r1[r9]
            float r4 = r4.b()
            int r4 = (int) r4
            r2[r9] = r4
            r13 = r2
            r4 = r3
            r14 = 0
        L6b:
            if (r4 >= r0) goto L9f
            r3 = r13[r10]
            r6 = 0
            r2 = r15
            r5 = r17
            r7 = r20
            int[] r3 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L95
            r2 = r13[r10]
            r5 = r3[r10]
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            r5 = 5
            if (r2 >= r5) goto L95
            r2 = r13[r9]
            r6 = r3[r9]
            int r2 = r2 - r6
            int r2 = java.lang.Math.abs(r2)
            if (r2 >= r5) goto L95
            r13 = r3
            r14 = 0
            goto L9c
        L95:
            r2 = 25
            if (r14 <= r2) goto L9a
            goto L9f
        L9a:
            int r14 = r14 + 1
        L9c:
            int r4 = r4 + 1
            goto L6b
        L9f:
            int r14 = r14 + r9
            int r3 = r4 - r14
            com.huawei.hms.scankit.p.u6 r15 = new com.huawei.hms.scankit.p.u6
            r0 = r13[r10]
            float r0 = (float) r0
            float r2 = (float) r3
            r15.<init>(r0, r2)
            r1[r12] = r15
            com.huawei.hms.scankit.p.u6 r15 = new com.huawei.hms.scankit.p.u6
            r0 = r13[r9]
            float r0 = (float) r0
            r15.<init>(r0, r2)
            r0 = 3
            r1[r0] = r15
        Lb8:
            int r3 = r3 - r11
            r15 = 10
            if (r3 >= r15) goto Lc1
            r15 = 0
            java.util.Arrays.fill(r1, r15)
        Lc1:
            return r1
    }
}
