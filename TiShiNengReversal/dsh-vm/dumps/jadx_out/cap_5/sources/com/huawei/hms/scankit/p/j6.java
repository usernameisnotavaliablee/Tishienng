package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j6 implements com.huawei.hms.scankit.p.o6 {
    private final com.huawei.hms.scankit.p.v1 a;

    public j6() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.v1 r0 = new com.huawei.hms.scankit.p.v1
            r0.<init>()
            r1.a = r0
            return
    }

    private int a(com.huawei.hms.scankit.p.j2 r8) {
            r7 = this;
            float r0 = r8.c()
            com.huawei.hms.scankit.p.r3.i = r0
            com.huawei.hms.scankit.p.s r8 = r8.a()
            int r0 = r8.e()
            int r0 = r0 + (-4)
            r1 = 3
            int[] r0 = new int[]{r1, r0, r1}
            int r2 = r8.c()
            int r2 = r2 + (-4)
            int[] r2 = new int[]{r1, r1, r2}
            r3 = 0
            r4 = 0
        L21:
            if (r3 >= r1) goto L32
            r5 = r0[r3]
            r6 = r2[r3]
            boolean r5 = r7.a(r8, r5, r6)
            if (r5 == 0) goto L2f
            int r4 = r4 + 1
        L2f:
            int r3 = r3 + 1
            goto L21
        L32:
            return r4
    }

    public static void a(com.huawei.hms.scankit.p.p4 r2) {
            int r0 = r2.a()
            int r2 = r2.c()
            if (r0 != r2) goto L14
            r2 = 805(0x325, float:1.128E-42)
            if (r0 != r2) goto L14
            boolean[] r2 = com.huawei.hms.scankit.p.r3.v
            r0 = 0
            r1 = 1
            r2[r0] = r1
        L14:
            return
    }

    public static void a(com.huawei.hms.scankit.p.p4 r8, com.huawei.hms.scankit.p.s6 r9) {
            int r0 = r8.a()
            int r8 = r8.c()
        L8:
            java.util.Stack<java.lang.Integer> r1 = com.huawei.hms.scankit.p.r3.w
            int r1 = r1.size()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L26
            java.util.Stack<java.lang.Integer> r1 = com.huawei.hms.scankit.p.r3.w
            java.lang.Object r1 = r1.pop()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L8
            int r1 = r0 % r1
            if (r1 != 0) goto L8
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r0 != r8) goto Le3
            if (r1 == 0) goto Le3
            if (r9 == 0) goto Le3
            com.huawei.hms.scankit.p.u6[] r1 = r9.j()
            if (r1 == 0) goto Le3
            com.huawei.hms.scankit.p.u6[] r1 = r9.j()
            r1 = r1[r3]
            float r1 = r1.b()
            com.huawei.hms.scankit.p.u6[] r4 = r9.j()
            r4 = r4[r2]
            float r4 = r4.b()
            float r1 = java.lang.Math.min(r1, r4)
            com.huawei.hms.scankit.p.u6[] r4 = r9.j()
            r5 = 2
            r4 = r4[r5]
            float r4 = r4.b()
            float r1 = java.lang.Math.min(r1, r4)
            com.huawei.hms.scankit.p.u6[] r4 = r9.j()
            r4 = r4[r3]
            float r4 = r4.b()
            com.huawei.hms.scankit.p.u6[] r6 = r9.j()
            r6 = r6[r2]
            float r6 = r6.b()
            float r4 = java.lang.Math.max(r4, r6)
            com.huawei.hms.scankit.p.u6[] r6 = r9.j()
            r6 = r6[r5]
            float r6 = r6.b()
            float r4 = java.lang.Math.max(r4, r6)
            com.huawei.hms.scankit.p.u6[] r6 = r9.j()
            r6 = r6[r3]
            float r6 = r6.c()
            com.huawei.hms.scankit.p.u6[] r7 = r9.j()
            r7 = r7[r2]
            float r7 = r7.c()
            float r6 = java.lang.Math.min(r6, r7)
            com.huawei.hms.scankit.p.u6[] r7 = r9.j()
            r7 = r7[r5]
            float r7 = r7.c()
            float r6 = java.lang.Math.min(r6, r7)
            com.huawei.hms.scankit.p.u6[] r7 = r9.j()
            r3 = r7[r3]
            float r3 = r3.c()
            com.huawei.hms.scankit.p.u6[] r7 = r9.j()
            r7 = r7[r2]
            float r7 = r7.c()
            float r3 = java.lang.Math.max(r3, r7)
            com.huawei.hms.scankit.p.u6[] r9 = r9.j()
            r9 = r9[r5]
            float r9 = r9.c()
            float r9 = java.lang.Math.max(r3, r9)
            float r4 = r4 - r1
            float r9 = r9 - r6
            float r4 = r4 * r9
            double r3 = (double) r4
            int r0 = r0 * r8
            double r8 = (double) r0
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r8 = r8 * r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto Le3
            boolean[] r8 = com.huawei.hms.scankit.p.r3.v
            r8[r2] = r2
        Le3:
            return
    }

    private boolean a(com.huawei.hms.scankit.p.s r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.c()
            r2 = 21
            if (r1 < r2) goto L96
            int r1 = r4.e()
            if (r1 >= r2) goto L14
            goto L96
        L14:
            boolean r1 = r4.b(r5, r6)
            int r2 = r5 + 1
            boolean r2 = r4.b(r2, r6)
            if (r2 == 0) goto L22
            int r1 = r1 + 1
        L22:
            int r2 = r5 + 2
            boolean r2 = r4.b(r2, r6)
            if (r2 != 0) goto L2c
            int r1 = r1 + 1
        L2c:
            int r2 = r5 + 3
            boolean r2 = r4.b(r2, r6)
            if (r2 == 0) goto L36
            int r1 = r1 + 1
        L36:
            int r2 = r5 + (-1)
            boolean r2 = r4.b(r2, r6)
            if (r2 == 0) goto L40
            int r1 = r1 + 1
        L40:
            int r2 = r5 + (-2)
            boolean r2 = r4.b(r2, r6)
            if (r2 != 0) goto L4a
            int r1 = r1 + 1
        L4a:
            int r2 = r5 + (-3)
            boolean r2 = r4.b(r2, r6)
            if (r2 == 0) goto L54
            int r1 = r1 + 1
        L54:
            int r2 = r6 + 1
            boolean r2 = r4.b(r5, r2)
            if (r2 == 0) goto L5e
            int r1 = r1 + 1
        L5e:
            int r2 = r6 + 2
            boolean r2 = r4.b(r5, r2)
            if (r2 != 0) goto L68
            int r1 = r1 + 1
        L68:
            int r2 = r6 + 3
            boolean r2 = r4.b(r5, r2)
            if (r2 == 0) goto L72
            int r1 = r1 + 1
        L72:
            int r2 = r6 + (-1)
            boolean r2 = r4.b(r5, r2)
            if (r2 == 0) goto L7c
            int r1 = r1 + 1
        L7c:
            int r2 = r6 + (-2)
            boolean r2 = r4.b(r5, r2)
            if (r2 != 0) goto L86
            int r1 = r1 + 1
        L86:
            int r6 = r6 + (-3)
            boolean r4 = r4.b(r5, r6)
            if (r4 == 0) goto L90
            int r1 = r1 + 1
        L90:
            r4 = 10
            if (r1 <= r4) goto L96
            r4 = 1
            return r4
        L96:
            return r0
    }

    @Override // com.huawei.hms.scankit.p.o6
    public final com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r7, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r8) throws com.huawei.hms.scankit.p.a {
            r6 = this;
            int r0 = com.huawei.hms.scankit.p.r3.j
            r1 = 1
            int r0 = r0 + r1
            com.huawei.hms.scankit.p.r3.j = r0
            com.huawei.hms.scankit.p.g2 r0 = new com.huawei.hms.scankit.p.g2     // Catch: com.huawei.hms.scankit.p.a -> L72
            com.huawei.hms.scankit.p.s r7 = r7.b()     // Catch: com.huawei.hms.scankit.p.a -> L72
            r0.<init>(r7)     // Catch: com.huawei.hms.scankit.p.a -> L72
            com.huawei.hms.scankit.p.j2 r7 = r0.a(r8)     // Catch: com.huawei.hms.scankit.p.a -> L72
            int r0 = r6.a(r7)
            r2 = 0
            if (r0 <= 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r3 = 0
            com.huawei.hms.scankit.p.v1 r4 = r6.a     // Catch: java.lang.Exception -> L2a
            com.huawei.hms.scankit.p.s r5 = r7.a()     // Catch: java.lang.Exception -> L2a
            com.huawei.hms.scankit.p.w1 r8 = r4.a(r5, r8)     // Catch: java.lang.Exception -> L2a
            r1 = 0
            goto L2c
        L2a:
            r8 = r3
        L2c:
            if (r1 == 0) goto L3c
            if (r0 == 0) goto L3c
            com.huawei.hms.scankit.p.s6 r8 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6[] r7 = r7.b()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            r8.<init>(r3, r3, r7, r0)
            return r8
        L3c:
            if (r1 != 0) goto L6d
            if (r8 != 0) goto L41
            return r3
        L41:
            com.huawei.hms.scankit.p.u6[] r0 = r7.d()
            java.lang.Object r1 = r8.b()
            boolean r1 = r1 instanceof com.huawei.hms.scankit.p.i6
            if (r1 == 0) goto L56
            java.lang.Object r1 = r8.b()
            com.huawei.hms.scankit.p.i6 r1 = (com.huawei.hms.scankit.p.i6) r1
            r1.a(r0)
        L56:
            com.huawei.hms.scankit.p.s6 r1 = new com.huawei.hms.scankit.p.s6
            java.lang.String r2 = r8.d()
            byte[] r8 = r8.c()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.k
            r1.<init>(r2, r8, r0, r3)
            com.huawei.hms.scankit.p.u6[] r7 = r7.b()
            r1.b(r7)
            return r1
        L6d:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
        L72:
            com.huawei.hms.scankit.p.a r7 = com.huawei.hms.scankit.p.a.a()
            throw r7
    }
}
