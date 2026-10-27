package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class e {
    private final com.huawei.hms.scankit.p.s a;
    private final java.util.List<com.huawei.hms.scankit.p.d> b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final int[] h;
    private final com.huawei.hms.scankit.p.v6 i;

    e(com.huawei.hms.scankit.p.s r2, int r3, int r4, int r5, int r6, float r7, com.huawei.hms.scankit.p.v6 r8) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 5
            r2.<init>(r0)
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            r2 = 3
            int[] r2 = new int[r2]
            r1.h = r2
            r1.i = r8
            return
    }

    private float a(int r10, int r11, int r12, int r13) {
            r9 = this;
            com.huawei.hms.scankit.p.s r0 = r9.a
            int r1 = r0.c()
            int[] r2 = r9.h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = r10
        L12:
            if (r6 < 0) goto L25
            boolean r7 = r0.b(r11, r6)
            if (r7 == 0) goto L25
            r7 = r2[r4]
            if (r7 > r12) goto L25
            int r7 = r7 + 1
            r2[r4] = r7
            int r6 = r6 + (-1)
            goto L12
        L25:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r6 < 0) goto L94
            r8 = r2[r4]
            if (r8 <= r12) goto L2f
            goto L94
        L2f:
            if (r6 < 0) goto L42
            boolean r8 = r0.b(r11, r6)
            if (r8 != 0) goto L42
            r8 = r2[r3]
            if (r8 > r12) goto L42
            int r8 = r8 + 1
            r2[r3] = r8
            int r6 = r6 + (-1)
            goto L2f
        L42:
            r6 = r2[r3]
            if (r6 <= r12) goto L47
            return r7
        L47:
            int r10 = r10 + r4
        L48:
            if (r10 >= r1) goto L5b
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L5b
            r6 = r2[r4]
            if (r6 > r12) goto L5b
            int r6 = r6 + 1
            r2[r4] = r6
            int r10 = r10 + 1
            goto L48
        L5b:
            if (r10 == r1) goto L94
            r6 = r2[r4]
            if (r6 <= r12) goto L62
            goto L94
        L62:
            if (r10 >= r1) goto L75
            boolean r6 = r0.b(r11, r10)
            if (r6 != 0) goto L75
            r6 = r2[r5]
            if (r6 > r12) goto L75
            int r6 = r6 + 1
            r2[r5] = r6
            int r10 = r10 + 1
            goto L62
        L75:
            r11 = r2[r5]
            if (r11 <= r12) goto L7a
            return r7
        L7a:
            r12 = r2[r3]
            r0 = r2[r4]
            int r12 = r12 + r0
            int r12 = r12 + r11
            int r11 = r13 * 3
            if (r12 >= r11) goto L94
            int r12 = r12 * 3
            if (r12 > r13) goto L89
            goto L94
        L89:
            boolean r11 = r9.a(r2)
            if (r11 == 0) goto L94
            float r10 = a(r2, r10)
            return r10
        L94:
            return r7
    }

    private static float a(int[] r1, int r2) {
            r0 = 2
            r0 = r1[r0]
            int r2 = r2 - r0
            float r2 = (float) r2
            r0 = 1
            r1 = r1[r0]
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            return r2
    }

    private com.huawei.hms.scankit.p.d a(int r5, int r6, int r7, int[] r8) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r6 >= r7) goto L43
            com.huawei.hms.scankit.p.s r2 = r4.a
            boolean r2 = r2.b(r6, r5)
            r3 = 1
            if (r2 == 0) goto L37
            if (r1 != r3) goto L15
            r2 = r8[r3]
            int r2 = r2 + r3
            r8[r3] = r2
            goto L40
        L15:
            r2 = 2
            if (r1 != r2) goto L2f
            boolean r1 = r4.a(r8)
            if (r1 == 0) goto L25
            com.huawei.hms.scankit.p.d r1 = r4.a(r8, r5, r6)
            if (r1 == 0) goto L25
            return r1
        L25:
            r1 = r8[r2]
            r8[r0] = r1
            r8[r3] = r3
            r8[r2] = r0
            r1 = 1
            goto L40
        L2f:
            int r1 = r1 + 1
            r2 = r8[r1]
            int r2 = r2 + r3
            r8[r1] = r2
            goto L40
        L37:
            if (r1 != r3) goto L3b
            int r1 = r1 + 1
        L3b:
            r2 = r8[r1]
            int r2 = r2 + r3
            r8[r1] = r2
        L40:
            int r6 = r6 + 1
            goto L2
        L43:
            r5 = 0
            return r5
    }

    private com.huawei.hms.scankit.p.d a(int[] r7, int r8, int r9) {
            r6 = this;
            r0 = 0
            r1 = r7[r0]
            r2 = 1
            r3 = r7[r2]
            int r1 = r1 + r3
            r3 = 2
            r4 = r7[r3]
            int r1 = r1 + r4
            float r9 = a(r7, r9)
            int r4 = (int) r9
            r5 = r7[r2]
            int r5 = r5 * 3
            float r8 = r6.a(r8, r4, r5, r1)
            boolean r1 = java.lang.Float.isNaN(r8)
            if (r1 != 0) goto L58
            r0 = r7[r0]
            r1 = r7[r2]
            int r0 = r0 + r1
            r7 = r7[r3]
            int r0 = r0 + r7
            float r7 = (float) r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 / r0
            java.util.List<com.huawei.hms.scankit.p.d> r0 = r6.b
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            com.huawei.hms.scankit.p.d r1 = (com.huawei.hms.scankit.p.d) r1
            boolean r2 = r1.b(r7, r8, r9)
            if (r2 == 0) goto L30
            com.huawei.hms.scankit.p.d r7 = r1.c(r8, r9, r7)
            return r7
        L47:
            com.huawei.hms.scankit.p.d r0 = new com.huawei.hms.scankit.p.d
            r0.<init>(r9, r8, r7)
            java.util.List<com.huawei.hms.scankit.p.d> r7 = r6.b
            r7.add(r0)
            com.huawei.hms.scankit.p.v6 r7 = r6.i
            if (r7 == 0) goto L58
            r7.a(r0)
        L58:
            r7 = 0
            return r7
    }

    private boolean a(int[] r6) {
            r5 = this;
            float r0 = r5.g
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r0
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r2
            r2 = 0
            r3 = 0
        Lb:
            r4 = 3
            if (r3 >= r4) goto L1f
            r4 = r6[r3]
            float r4 = (float) r4
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L1c
            return r2
        L1c:
            int r3 = r3 + 1
            goto Lb
        L1f:
            r6 = 1
            return r6
    }

    com.huawei.hms.scankit.p.d a() throws com.huawei.hms.scankit.p.a {
            r10 = this;
            int r0 = r10.c
            int r1 = r10.f
            int r2 = r10.e
            int r2 = r2 + r0
            int r3 = r10.d
            int r4 = r1 / 2
            int r3 = r3 + r4
            r4 = 0
            r5 = 0
        Le:
            if (r5 >= r1) goto L48
            r6 = r5 & 1
            if (r6 != 0) goto L19
            int r6 = r5 + 1
            int r6 = r6 / 2
            goto L1e
        L19:
            int r6 = r5 + 1
            int r6 = r6 / 2
            int r6 = -r6
        L1e:
            int r6 = r6 + r3
            int[] r7 = new int[]{r4, r4, r4}
            r8 = r0
        L24:
            if (r8 >= r2) goto L31
            com.huawei.hms.scankit.p.s r9 = r10.a
            boolean r9 = r9.b(r8, r6)
            if (r9 != 0) goto L31
            int r8 = r8 + 1
            goto L24
        L31:
            com.huawei.hms.scankit.p.d r8 = r10.a(r6, r8, r2, r7)
            if (r8 == 0) goto L38
            return r8
        L38:
            boolean r8 = r10.a(r7)
            if (r8 == 0) goto L45
            com.huawei.hms.scankit.p.d r6 = r10.a(r7, r6, r2)
            if (r6 == 0) goto L45
            return r6
        L45:
            int r5 = r5 + 1
            goto Le
        L48:
            java.util.List<com.huawei.hms.scankit.p.d> r0 = r10.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            java.util.List<com.huawei.hms.scankit.p.d> r0 = r10.b
            java.lang.Object r0 = r0.get(r4)
            com.huawei.hms.scankit.p.d r0 = (com.huawei.hms.scankit.p.d) r0
            return r0
        L59:
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }
}
