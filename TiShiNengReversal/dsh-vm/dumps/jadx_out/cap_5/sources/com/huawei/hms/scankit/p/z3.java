package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class z3 implements com.huawei.hms.scankit.p.o6 {
    private java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> a;
    private final com.huawei.hms.scankit.p.u1 b;

    public z3() {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.p.l1> r1 = com.huawei.hms.scankit.p.l1.class
            r0.<init>(r1)
            r2.a = r0
            com.huawei.hms.scankit.p.u1 r0 = new com.huawei.hms.scankit.p.u1
            r0.<init>()
            r2.b = r0
            return
    }

    private com.huawei.hms.scankit.p.s6 a(int r20, int r21, com.huawei.hms.scankit.p.g3[] r22, com.huawei.hms.scankit.p.e2 r23, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r24) throws com.huawei.hms.scankit.p.a {
            r19 = this;
            r0 = r20
            r1 = r23
            r2 = 0
            r3 = 0
        L6:
            int r4 = r0 + (-2)
            if (r3 > r4) goto L106
            int r4 = r3 + 1
            r5 = r4
        Ld:
            int r6 = r0 + (-1)
            if (r5 > r6) goto Lfd
            int r6 = r5 + 1
            r7 = r6
        L14:
            if (r7 > r0) goto Lf4
            r8 = r21
            r9 = r0
        L19:
            if (r9 >= r8) goto Le9
            r10 = r22[r3]
            r11 = r22[r5]
            r12 = r22[r7]
            r13 = 3
            com.huawei.hms.scankit.p.g3[] r13 = new com.huawei.hms.scankit.p.g3[r13]
            r13[r2] = r10
            r10 = 1
            r13[r10] = r11
            r11 = 2
            r13[r11] = r12
            com.huawei.hms.scankit.p.u6.a(r13)
            r12 = r22[r9]
            r14 = r13[r11]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r14 = r14.b()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            r15 = r13[r10]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r15 = r15.b()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r14 = r14 - r15
            r15 = r13[r2]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r15 = r15.b()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r14 = r14 + r15
            r15 = r13[r11]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r15 = r15.c()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            r16 = r13[r10]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r16 = r16.c()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r15 = r15 - r16
            r16 = r13[r2]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r16 = r16.c()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r15 = r15 + r16
            r16 = r13[r10]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r16 = r16.b()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            r17 = r13[r2]     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r17 = r17.b()     // Catch: com.huawei.hms.scankit.p.a -> Le1
            float r16 = r16 - r17
            r17 = 0
            float r2 = java.lang.Math.abs(r16)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r16 = r13[r10]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r16 = r16.b()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r18 = r13[r11]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r18 = r18.b()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r16 = r16 - r18
            r18 = 1
            float r10 = java.lang.Math.abs(r16)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r2 = java.lang.Math.max(r2, r10)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r10 = r13[r18]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r10 = r10.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r16 = r13[r17]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r16 = r16.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r10 = r10 - r16
            float r10 = java.lang.Math.abs(r10)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r16 = r13[r18]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r16 = r16.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r11 = r13[r11]     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r11 = r11.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r16 = r16 - r11
            float r11 = java.lang.Math.abs(r16)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r10 = java.lang.Math.max(r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r11 = r12.b()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r14 = r14 - r11
            float r11 = java.lang.Math.abs(r14)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r14 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r14
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lcd
            float r2 = r12.c()     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r15 = r15 - r2
            float r2 = java.lang.Math.abs(r15)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            float r10 = r10 / r14
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 < 0) goto Ld2
        Lcd:
            r10 = r19
            r11 = r24
            goto Le4
        Ld2:
            int r2 = r1.a(r13, r12)     // Catch: com.huawei.hms.scankit.p.a -> Lcd
            r10 = r19
            r11 = r24
            com.huawei.hms.scankit.p.s6 r2 = r10.a(r2, r1, r11)     // Catch: com.huawei.hms.scankit.p.a -> Le4
            if (r2 == 0) goto Le4
            return r2
        Le1:
            r17 = 0
            goto Lcd
        Le4:
            int r9 = r9 + 1
            r2 = 0
            goto L19
        Le9:
            r17 = 0
            r10 = r19
            r11 = r24
            int r7 = r7 + 1
            r2 = 0
            goto L14
        Lf4:
            r10 = r19
            r8 = r21
            r11 = r24
            r5 = r6
            goto Ld
        Lfd:
            r10 = r19
            r8 = r21
            r11 = r24
            r3 = r4
            goto L6
        L106:
            r10 = r19
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a()
            throw r0
    }

    private com.huawei.hms.scankit.p.s6 a(int r13, com.huawei.hms.scankit.p.e2 r14, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r15) throws com.huawei.hms.scankit.p.a {
            r12 = this;
            int r0 = r13 + (-2)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r13 + 2
            r3 = 6
            int r2 = java.lang.Math.min(r3, r2)
            int r3 = r13 - r0
            int r3 = java.lang.Math.abs(r3)
            int r4 = r13 - r2
            int r4 = java.lang.Math.abs(r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 0
            r5 = 0
            r6 = r4
        L21:
            int r7 = r3 * 2
            if (r5 > r7) goto L5a
            int r7 = r5 * r1
            int r13 = r13 + r7
            if (r13 < r0) goto L55
            if (r13 <= r2) goto L2d
            goto L55
        L2d:
            com.huawei.hms.scankit.p.j2 r6 = r14.a(r13)     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.u1 r7 = r12.b     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.s r8 = r6.a()     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.w1 r7 = r7.a(r8, r15)     // Catch: com.huawei.hms.scankit.p.a -> L55
            java.lang.String r8 = r7.d()     // Catch: com.huawei.hms.scankit.p.a -> L55
            if (r8 == 0) goto L55
            com.huawei.hms.scankit.p.s6 r8 = new com.huawei.hms.scankit.p.s6     // Catch: com.huawei.hms.scankit.p.a -> L55
            java.lang.String r9 = r7.d()     // Catch: com.huawei.hms.scankit.p.a -> L55
            byte[] r7 = r7.c()     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.p.u6[] r10 = r6.d()     // Catch: com.huawei.hms.scankit.p.a -> L55
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r11 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.p     // Catch: com.huawei.hms.scankit.p.a -> L55
            r8.<init>(r9, r7, r10, r11)     // Catch: com.huawei.hms.scankit.p.a -> L55
            return r8
        L55:
            int r5 = r5 + 1
            int r1 = r1 * (-1)
            goto L21
        L5a:
            if (r6 == 0) goto L70
            com.huawei.hms.scankit.p.u6[] r13 = r6.d()
            int r13 = r13.length
            r14 = 3
            if (r13 <= r14) goto L70
            com.huawei.hms.scankit.p.s6 r13 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6[] r14 = r6.d()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r15 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.p
            r13.<init>(r4, r4, r14, r15)
            return r13
        L70:
            return r4
    }

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r9, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r10) throws com.huawei.hms.scankit.p.a {
            r8 = this;
            com.huawei.hms.scankit.p.e2 r4 = new com.huawei.hms.scankit.p.e2
            com.huawei.hms.scankit.p.s r9 = r9.b()
            r4.<init>(r9)
            com.huawei.hms.scankit.p.g3[] r3 = r4.a(r10)
            int r2 = r3.length
            r9 = 3
            if (r2 != r9) goto L20
            com.huawei.hms.scankit.p.u6.a(r3)
            r9 = 0
            int r9 = r4.a(r3, r9)
            com.huawei.hms.scankit.p.s6 r9 = r8.a(r9, r4, r10)
            if (r9 == 0) goto L3f
            return r9
        L20:
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L44
            com.huawei.hms.scankit.p.g3[] r0 = new com.huawei.hms.scankit.p.g3[r9]
        L26:
            if (r1 >= r9) goto L2f
            r2 = r3[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L26
        L2f:
            com.huawei.hms.scankit.p.u6.a(r0)
            r9 = r3[r9]
            int r9 = r4.a(r0, r9)
            com.huawei.hms.scankit.p.s6 r9 = r8.a(r9, r4, r10)
            if (r9 == 0) goto L3f
            return r9
        L3f:
            com.huawei.hms.scankit.p.a r9 = com.huawei.hms.scankit.p.a.a()
            throw r9
        L44:
            r9 = r3[r1]
            float r9 = r9.e()
            r0 = 1
            r0 = r3[r0]
            float r0 = r0.e()
            float r9 = r9 + r0
            r0 = 2
            r1 = r3[r0]
            float r1 = r1.e()
            float r9 = r9 + r1
            r1 = 1077936128(0x40400000, float:3.0)
            float r9 = r9 / r1
            int r1 = r2 + (-1)
            r1 = r3[r1]
            float r1 = r1.e()
            int r5 = r2 + (-2)
        L67:
            if (r5 <= r0) goto L97
            r6 = r3[r5]
            float r6 = r6.e()
            float r6 = r6 - r9
            float r6 = java.lang.Math.abs(r6)
            r7 = r3[r5]
            float r7 = r7.e()
            float r7 = r7 - r1
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L97
            int r6 = r2 - r5
            int r7 = r6 + (-1)
            float r7 = (float) r7
            float r7 = r7 * r1
            r1 = r3[r5]
            float r1 = r1.e()
            float r7 = r7 + r1
            float r1 = (float) r6
            float r1 = r7 / r1
            int r5 = r5 + (-1)
            goto L67
        L97:
            r0 = r8
            r1 = r5
            r5 = r10
            com.huawei.hms.scankit.p.s6 r9 = r0.a(r1, r2, r3, r4, r5)
            return r9
    }
}
