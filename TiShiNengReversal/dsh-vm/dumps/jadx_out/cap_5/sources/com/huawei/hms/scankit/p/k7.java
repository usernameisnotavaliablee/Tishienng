package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k7 {
    public k7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static double a(com.huawei.hms.scankit.p.u6 r2, com.huawei.hms.scankit.p.u6 r3) {
            float r0 = r3.c()
            float r1 = r2.c()
            float r0 = r0 - r1
            double r0 = (double) r0
            float r3 = r3.b()
            float r2 = r2.b()
            float r3 = r3 - r2
            double r2 = (double) r3
            double r2 = java.lang.Math.atan2(r0, r2)
            return r2
    }

    public static byte[] a(com.huawei.hms.scankit.p.p r3, java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> r4, com.huawei.hms.scankit.p.s6 r5, int[] r6, double[] r7) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto Lf
        L7:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            java.lang.Object r0 = r4.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
        Lf:
            if (r0 == 0) goto L21
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L21
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L6e
        L21:
            if (r5 == 0) goto L6e
            java.lang.String r1 = r5.k()
            if (r1 != 0) goto L6e
            if (r0 == 0) goto L3e
            r0.clear()
            com.huawei.hms.scankit.p.l1 r1 = com.huawei.hms.scankit.p.l1.c
            r4.remove(r1)
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = r5.c()
            r0.add(r2)
            r4.put(r1, r0)
            goto L54
        L3e:
            if (r4 == 0) goto L54
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            r4.remove(r0)
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = r5.c()
            r1.add(r2)
            r4.put(r0, r1)
        L54:
            float r4 = com.huawei.hms.scankit.p.r3.i
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 >= 0) goto L61
            r0 = 1065353216(0x3f800000, float:1.0)
        L61:
            double r0 = (double) r0
            r4 = 5
            r7[r4] = r0
            com.huawei.hms.scankit.p.u6[] r4 = r5.j()
            byte[] r3 = a(r3, r4, r7, r6)
            return r3
        L6e:
            int r4 = r3.e()
            r5 = 0
            r6[r5] = r4
            int r4 = r3.c()
            r5 = 1
            r6[r5] = r4
            byte[] r3 = r3.d()
            return r3
    }

    private static byte[] a(com.huawei.hms.scankit.p.p r8, com.huawei.hms.scankit.p.u6[] r9, double[] r10, int[] r11) throws com.huawei.hms.scankit.p.a {
            r0 = 0
            if (r9 != 0) goto L15
            int r9 = r8.e()
            r11[r0] = r9
            int r9 = r8.c()
            r10 = 1
            r11[r10] = r9
            byte[] r8 = r8.d()
            return r8
        L15:
            int r1 = r8.e()
            int r2 = r8.c()
            int r3 = r9.length
            r4 = r1
            r5 = r2
            r1 = 0
            r2 = 0
        L22:
            if (r0 >= r3) goto L5b
            r6 = r9[r0]
            if (r6 == 0) goto L58
            float r7 = r6.b()
            int r7 = (int) r7
            if (r7 >= r4) goto L34
            float r4 = r6.b()
            int r4 = (int) r4
        L34:
            float r7 = r6.c()
            int r7 = (int) r7
            if (r7 >= r5) goto L40
            float r5 = r6.c()
            int r5 = (int) r5
        L40:
            float r7 = r6.b()
            int r7 = (int) r7
            if (r7 <= r1) goto L4c
            float r1 = r6.b()
            int r1 = (int) r1
        L4c:
            float r7 = r6.c()
            int r7 = (int) r7
            if (r7 <= r2) goto L58
            float r2 = r6.c()
            int r2 = (int) r2
        L58:
            int r0 = r0 + 1
            goto L22
        L5b:
            int r1 = r1 - r4
            int r2 = r2 - r5
            int r0 = java.lang.Math.max(r1, r2)
            float r0 = (float) r0
            byte[] r8 = a(r9, r8, r11, r0, r10)
            return r8
    }

    private static byte[] a(com.huawei.hms.scankit.p.u6[] r23, com.huawei.hms.scankit.p.p r24, int[] r25, float r26, double[] r27) throws com.huawei.hms.scankit.p.a {
            r0 = r26
            r1 = 0
            r2 = r23[r1]
            float r2 = r2.b()
            r3 = 1
            r4 = r23[r3]
            float r4 = r4.b()
            r5 = 2
            r6 = r23[r5]
            float r6 = r6.b()
            r7 = r23[r1]
            float r7 = r7.c()
            r8 = r23[r3]
            float r8 = r8.c()
            r9 = r23[r5]
            float r9 = r9.c()
            r10 = 0
            int r11 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r11 < 0) goto L144
            int r11 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r11 < 0) goto L144
            int r11 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r11 < 0) goto L144
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L144
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 < 0) goto L144
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 < 0) goto L144
            int r10 = r24.e()
            float r10 = (float) r10
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 > 0) goto L144
            int r10 = r24.e()
            float r10 = (float) r10
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 > 0) goto L144
            int r4 = r24.e()
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L144
            int r4 = r24.c()
            float r4 = (float) r4
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L144
            int r4 = r24.c()
            float r4 = (float) r4
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 > 0) goto L144
            int r4 = r24.c()
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 > 0) goto L144
            float r2 = r2 + r6
            int r2 = (int) r2
            int r2 = r2 / r5
            float r7 = r7 + r9
            int r4 = (int) r7
            int r4 = r4 / r5
            float r2 = (float) r2
            float r2 = r2 - r0
            int r2 = (int) r2
            if (r2 < 0) goto L84
            goto L85
        L84:
            r2 = 0
        L85:
            float r4 = (float) r4
            float r4 = r4 - r0
            int r4 = (int) r4
            if (r4 < 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            int r0 = (int) r0
            int r0 = r0 * 2
            int r6 = r2 + r0
            int r7 = r24.e()
            if (r6 > r7) goto L99
            r6 = r0
            goto L9e
        L99:
            int r6 = r24.e()
            int r6 = r6 - r2
        L9e:
            int r7 = r4 + r0
            int r8 = r24.c()
            if (r7 > r8) goto La9
        La6:
            r7 = r24
            goto Laf
        La9:
            int r0 = r24.c()
            int r0 = r0 - r4
            goto La6
        Laf:
            com.huawei.hms.scankit.p.p r8 = r7.a(r2, r4, r6, r0)
            r9 = r23[r1]
            r10 = r23[r3]
            double r9 = a(r9, r10)
            r11 = r27[r1]
            double r9 = java.lang.Math.toDegrees(r9)
            r13 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r9 = r9 + r13
            double r11 = r11 + r9
            r27[r1] = r11
            double r9 = (double) r2
            r27[r3] = r9
            double r9 = (double) r4
            r27[r5] = r9
            double r4 = (double) r6
            r2 = 3
            r27[r2] = r4
            double r9 = (double) r0
            r0 = 4
            r27[r0] = r9
            double r11 = java.lang.Math.toRadians(r11)
            double r13 = java.lang.Math.sin(r11)
            double r13 = java.lang.Math.abs(r13)
            double r13 = r13 * r4
            double r15 = java.lang.Math.cos(r11)
            double r15 = java.lang.Math.abs(r15)
            double r15 = r15 * r9
            double r13 = r13 + r15
            r0 = 5
            r15 = r27[r0]
            double r13 = r13 * r15
            int r2 = (int) r13
            double r13 = java.lang.Math.sin(r11)
            double r13 = java.lang.Math.abs(r13)
            double r9 = r9 * r13
            double r11 = java.lang.Math.cos(r11)
            double r11 = java.lang.Math.abs(r11)
            double r4 = r4 * r11
            double r9 = r9 + r4
            r4 = r27[r0]
            double r9 = r9 * r4
            int r4 = (int) r9
            r25[r1] = r4
            r25[r3] = r2
            byte[] r15 = r8.d()
            int r16 = r8.c()
            int r17 = r8.e()
            r5 = r27[r1]
            float r5 = (float) r5
            r21 = r27[r0]
            r18 = r2
            r19 = r4
            r20 = r5
            byte[] r0 = com.huawei.hms.scankit.util.LoadOpencvJNIUtil.imageRotate(r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L133
            return r0
        L133:
            int r0 = r7.e()
            r25[r1] = r0
            int r0 = r7.c()
            r25[r3] = r0
            byte[] r0 = r7.d()
            return r0
        L144:
            r7 = r24
            int r0 = r7.e()
            r25[r1] = r0
            int r0 = r7.c()
            r25[r3] = r0
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    public static com.huawei.hms.scankit.p.u6[] a(com.huawei.hms.scankit.p.u6[] r23, int r24, int r25, double[] r26) {
            r0 = r23
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 3
            r2 = r26[r2]
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L11
            int r2 = (int) r2
            goto L13
        L11:
            r2 = r24
        L13:
            r3 = 4
            r6 = r26[r3]
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L1c
            int r3 = (int) r6
            goto L1e
        L1c:
            r3 = r25
        L1e:
            r6 = 5
            r6 = r26[r6]
            int r8 = r0.length
            com.huawei.hms.scankit.p.u6[] r8 = new com.huawei.hms.scankit.p.u6[r8]
            r9 = 0
            r10 = r26[r9]
            double r10 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r10)
            double r12 = r12 * r6
            double r10 = java.lang.Math.sin(r10)
            double r10 = r10 * r6
            double r6 = (double) r3
            double r14 = java.lang.Math.abs(r10)
            double r14 = r14 - r10
            double r14 = r14 * r6
            double r2 = (double) r2
            double r16 = java.lang.Math.abs(r12)
            double r16 = r16 - r12
            double r16 = r16 * r2
            double r14 = r14 + r16
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 / r16
            r18 = r1
            r24 = r2
            double r1 = -r10
            double r19 = java.lang.Math.abs(r12)
            double r19 = r19 - r12
            double r6 = r6 * r19
            double r19 = java.lang.Math.abs(r10)
            double r19 = r19 + r10
            double r19 = r19 * r24
            double r6 = r6 + r19
            double r6 = r6 / r16
        L67:
            int r3 = r0.length
            if (r9 >= r3) goto Ld3
            r3 = r0[r9]
            if (r3 == 0) goto Lc4
            r16 = r4
            float r4 = r3.b()
            double r4 = (double) r4
            double r4 = r4 - r14
            double r4 = r4 * r12
            float r0 = r3.c()
            r19 = r1
            double r0 = (double) r0
            double r0 = r6 - r0
            double r0 = r0 * r10
            double r4 = r4 + r0
            double r0 = r12 * r12
            double r21 = r10 * r19
            double r0 = r0 - r21
            double r4 = r4 / r0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 != 0) goto L97
            float r0 = r3.c()
            double r0 = (double) r0
            double r0 = r0 - r6
            double r0 = r0 / r12
            goto La1
        L97:
            float r0 = r3.b()
            double r0 = (double) r0
            double r0 = r0 - r14
            double r2 = r12 * r4
            double r0 = r0 - r2
            double r0 = r0 / r10
        La1:
            com.huawei.hms.scankit.p.u6 r2 = new com.huawei.hms.scankit.p.u6
            long r3 = java.lang.Math.round(r4)
            r5 = 1
            r24 = r0
            r0 = r26[r5]
            int r0 = (int) r0
            long r0 = (long) r0
            long r3 = r3 + r0
            float r0 = (float) r3
            long r3 = java.lang.Math.round(r24)
            r1 = 2
            r24 = r3
            r3 = r26[r1]
            int r1 = (int) r3
            long r3 = (long) r1
            long r3 = r24 + r3
            float r1 = (float) r3
            r2.<init>(r0, r1)
            r8[r9] = r2
            goto Lca
        Lc4:
            r19 = r1
            r16 = r4
            r8[r9] = r18
        Lca:
            int r9 = r9 + 1
            r0 = r23
            r4 = r16
            r1 = r19
            goto L67
        Ld3:
            return r8
    }
}
