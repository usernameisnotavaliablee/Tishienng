package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h2 {
    private final com.huawei.hms.scankit.p.s a;
    private com.huawei.hms.scankit.p.v6 b;

    public h2(com.huawei.hms.scankit.p.s r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static float a(float r0, float r1, float r2) {
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    private static void a(com.huawei.hms.scankit.p.f3 r4, com.huawei.hms.scankit.p.f3 r5, com.huawei.hms.scankit.p.f3 r6, float[] r7) {
            float r0 = r4.b()
            float r1 = r5.b()
            float r0 = r0 - r1
            float r1 = r4.c()
            float r2 = r5.c()
            float r1 = r1 - r2
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r4.b()
            float r2 = r6.b()
            float r1 = r1 - r2
            float r4 = r4.c()
            float r2 = r6.c()
            float r4 = r4 - r2
            float r1 = r1 * r1
            float r4 = r4 * r4
            float r1 = r1 + r4
            float r4 = r5.b()
            float r2 = r6.b()
            float r4 = r4 - r2
            float r5 = r5.c()
            float r6 = r6.c()
            float r5 = r5 - r6
            float r4 = r4 * r4
            float r5 = r5 * r5
            float r4 = r4 + r5
            r5 = 2
            r6 = 1
            r2 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L57
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L57
            r7[r2] = r0
            r7[r6] = r1
            r7[r5] = r4
            return
        L57:
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L66
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L66
            r7[r2] = r4
            r7[r6] = r0
            r7[r5] = r1
            return
        L66:
            r7[r2] = r1
            r7[r6] = r0
            r7[r5] = r4
            return
    }

    public static boolean a(com.huawei.hms.scankit.p.f3 r10, com.huawei.hms.scankit.p.f3 r11, com.huawei.hms.scankit.p.f3 r12) {
            r0 = 3
            float[] r0 = new float[r0]
            a(r10, r11, r12, r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r5 = 2
            r0 = r0[r5]
            double r5 = (double) r4
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            double r6 = (double) r0
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            double r7 = (double) r2
            double r7 = java.lang.Math.sqrt(r7)
            float r7 = (float) r7
            float r8 = r5 / r6
            r9 = 1072064102(0x3fe66666, float:1.8)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L88
            float r8 = r6 / r5
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L31
            goto L88
        L31:
            float r8 = b(r5, r6, r7)
            float r10 = r10.e()
            float r11 = r11.e()
            float r12 = r12.e()
            float r10 = a(r10, r11, r12)
            r11 = 1086324736(0x40c00000, float:6.0)
            float r10 = r10 * r11
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 > 0) goto L4e
            return r1
        L4e:
            float r10 = r4 + r0
            float r10 = r10 - r2
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r5 * r11
            float r12 = r12 * r6
            float r10 = r10 / r12
            float r12 = r2 + r4
            float r12 = r12 - r0
            float r7 = r7 * r11
            float r5 = r5 * r7
            float r12 = r12 / r5
            float r2 = r2 + r0
            float r2 = r2 - r4
            float r7 = r7 * r6
            float r2 = r2 / r7
            float r10 = java.lang.Math.abs(r10)
            r11 = 1051663008(0x3eaf1aa0, float:0.342)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L88
            r10 = 1058199411(0x3f12d773, float:0.5736)
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 < 0) goto L88
            r11 = 1062318218(0x3f51b08a, float:0.8191)
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 > 0) goto L88
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 < 0) goto L88
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 <= 0) goto L87
            goto L88
        L87:
            return r3
        L88:
            return r1
    }

    public static boolean a(com.huawei.hms.scankit.p.f3[] r10, com.huawei.hms.scankit.p.f3[] r11, int[] r12) {
            r0 = 0
            r1 = r10[r0]
            r2 = 1
            r3 = r10[r2]
            r4 = 2
            r10 = r10[r4]
            r5 = r12[r0]
            r6 = r12[r2]
            r12 = r12[r4]
            float r4 = r10.b()
            float r7 = r3.b()
            float r4 = r4 - r7
            float r7 = r1.b()
            float r4 = r4 + r7
            float r7 = r10.c()
            float r8 = r3.c()
            float r7 = r7 - r8
            float r8 = r1.c()
            float r7 = r7 + r8
            float r1 = r1.e()
            float r3 = r3.e()
            float r1 = r1 + r3
            float r10 = r10.e()
            float r1 = r1 + r10
            r10 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r10
            r10 = 0
        L3d:
            int r3 = r11.length
            if (r10 >= r3) goto L6c
            if (r10 == r5) goto L69
            if (r10 == r6) goto L69
            if (r10 != r12) goto L47
            goto L69
        L47:
            r3 = r11[r10]
            float r8 = r3.b()
            float r3 = r3.c()
            float r8 = r4 - r8
            float r8 = r8 * r8
            float r3 = r7 - r3
            float r3 = r3 * r3
            float r8 = r8 + r3
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r3 = (float) r8
            r8 = 1092616192(0x41200000, float:10.0)
            float r8 = r8 * r1
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L69
            return r2
        L69:
            int r10 = r10 + 1
            goto L3d
        L6c:
            return r0
    }

    private static float b(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    public final com.huawei.hms.scankit.p.f3[] a(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) throws com.huawei.hms.scankit.p.a {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.j
            java.lang.Object r0 = r4.get(r0)
            com.huawei.hms.scankit.p.v6 r0 = (com.huawei.hms.scankit.p.v6) r0
        Lc:
            r3.b = r0
            com.huawei.hms.scankit.p.j3 r1 = new com.huawei.hms.scankit.p.j3
            com.huawei.hms.scankit.p.s r2 = r3.a
            r1.<init>(r2, r0)
            com.huawei.hms.scankit.p.f3[] r4 = r1.a(r4)
            return r4
    }
}
