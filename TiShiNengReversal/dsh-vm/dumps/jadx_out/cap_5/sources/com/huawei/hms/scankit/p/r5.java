package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class r5 implements com.huawei.hms.scankit.p.o6 {
    private static final com.huawei.hms.scankit.p.s6[] a = null;

    static {
            r0 = 0
            com.huawei.hms.scankit.p.s6[] r0 = new com.huawei.hms.scankit.p.s6[r0]
            com.huawei.hms.scankit.p.r5.a = r0
            return
    }

    public r5() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(com.huawei.hms.scankit.p.u6 r0, com.huawei.hms.scankit.p.u6 r1) {
            if (r0 == 0) goto L14
            if (r1 != 0) goto L5
            goto L14
        L5:
            float r0 = r0.b()
            float r1 = r1.b()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            return r0
        L14:
            r0 = 0
            return r0
    }

    private static int a(com.huawei.hms.scankit.p.u6[] r4) {
            r0 = 0
            r0 = r4[r0]
            r1 = 4
            r1 = r4[r1]
            int r0 = a(r0, r1)
            r1 = 6
            r1 = r4[r1]
            r2 = 2
            r2 = r4[r2]
            int r1 = a(r1, r2)
            int r1 = r1 * 17
            int r1 = r1 / 18
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 1
            r1 = r4[r1]
            r2 = 5
            r2 = r4[r2]
            int r1 = a(r1, r2)
            r2 = 7
            r2 = r4[r2]
            r3 = 3
            r4 = r4[r3]
            int r4 = a(r2, r4)
            int r4 = r4 * 17
            int r4 = r4 / 18
            int r4 = java.lang.Math.max(r1, r4)
            int r4 = java.lang.Math.max(r0, r4)
            return r4
    }

    private static com.huawei.hms.scankit.p.s6[] a(com.huawei.hms.scankit.p.p r16, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r17, boolean r18) throws com.huawei.hms.scankit.p.a {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.huawei.hms.scankit.p.o5 r1 = com.huawei.hms.scankit.p.f2.a(r16, r17, r18)
            java.util.List r2 = r1.b()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r2.next()
            com.huawei.hms.scankit.p.u6[] r3 = (com.huawei.hms.scankit.p.u6[]) r3
            com.huawei.hms.scankit.p.s r4 = r1.a()
            r12 = 4
            r5 = r3[r12]
            r13 = 5
            r6 = r3[r13]
            r14 = 6
            r7 = r3[r14]
            r15 = 7
            r8 = r3[r15]
            int r9 = b(r3)
            int r10 = a(r3)
            r11 = r17
            com.huawei.hms.scankit.p.w1 r4 = com.huawei.hms.scankit.p.t5.a(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r5 = com.huawei.hms.scankit.p.f2.a()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L6f
            r5 = 0
        L44:
            int r8 = r3.length
            if (r5 >= r8) goto L6f
            r8 = r3[r5]
            if (r8 == 0) goto L6c
            com.huawei.hms.scankit.p.u6 r8 = new com.huawei.hms.scankit.p.u6
            int r9 = r16.e()
            int r9 = r9 - r7
            float r9 = (float) r9
            r10 = r3[r5]
            float r10 = r10.b()
            float r9 = r9 - r10
            int r10 = r16.c()
            int r10 = r10 - r7
            float r10 = (float) r10
            r11 = r3[r5]
            float r11 = r11.c()
            float r10 = r10 - r11
            r8.<init>(r9, r10)
            r3[r5] = r8
        L6c:
            int r5 = r5 + 1
            goto L44
        L6f:
            int r5 = r3.length
            r8 = 8
            if (r5 != r8) goto Lc9
            r5 = r3[r6]
            r8 = 3
            r9 = 2
            if (r5 != 0) goto L97
            r10 = r3[r7]
            if (r10 != 0) goto L97
            r10 = r3[r12]
            if (r10 != 0) goto L97
            r10 = r3[r13]
            if (r10 != 0) goto L97
            r5 = r3[r14]
            r3[r6] = r5
            r5 = r3[r15]
            r3[r7] = r5
            r5 = r3[r9]
            r3[r12] = r5
            r5 = r3[r8]
            r3[r13] = r5
            goto Lb5
        L97:
            r6 = r3[r9]
            if (r6 != 0) goto Lb5
            r6 = r3[r8]
            if (r6 != 0) goto Lb5
            r6 = r3[r14]
            if (r6 != 0) goto Lb5
            r6 = r3[r15]
            if (r6 != 0) goto Lb5
            r6 = r3[r12]
            r3[r9] = r6
            r6 = r3[r13]
            r3[r8] = r6
            r3[r14] = r5
            r5 = r3[r7]
            r3[r15] = r5
        Lb5:
            com.huawei.hms.scankit.p.s6 r5 = new com.huawei.hms.scankit.p.s6
            java.lang.String r6 = r4.d()
            byte[] r4 = r4.c()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r7 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.j
            r5.<init>(r6, r4, r3, r7)
            r0.add(r5)
            goto L11
        Lc9:
            java.lang.String r0 = "pdf417 points size incorrect!"
            com.huawei.hms.scankit.p.a r0 = com.huawei.hms.scankit.p.a.a(r0)
            throw r0
        Ld0:
            com.huawei.hms.scankit.p.s6[] r1 = com.huawei.hms.scankit.p.r5.a
            java.lang.Object[] r0 = r0.toArray(r1)
            com.huawei.hms.scankit.p.s6[] r0 = (com.huawei.hms.scankit.p.s6[]) r0
            return r0
    }

    private static int b(com.huawei.hms.scankit.p.u6 r0, com.huawei.hms.scankit.p.u6 r1) {
            if (r0 == 0) goto L14
            if (r1 != 0) goto L5
            goto L14
        L5:
            float r0 = r0.b()
            float r1 = r1.b()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            return r0
        L14:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    private static int b(com.huawei.hms.scankit.p.u6[] r4) {
            r0 = 0
            r0 = r4[r0]
            r1 = 4
            r1 = r4[r1]
            int r0 = b(r0, r1)
            r1 = 6
            r1 = r4[r1]
            r2 = 2
            r2 = r4[r2]
            int r1 = b(r1, r2)
            int r1 = r1 * 17
            int r1 = r1 / 18
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            r1 = r4[r1]
            r2 = 5
            r2 = r4[r2]
            int r1 = b(r1, r2)
            r2 = 7
            r2 = r4[r2]
            r3 = 3
            r4 = r4[r3]
            int r4 = b(r2, r4)
            int r4 = r4 * 17
            int r4 = r4 / 18
            int r4 = java.lang.Math.min(r1, r4)
            int r4 = java.lang.Math.min(r0, r4)
            return r4
    }

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r2, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            r0 = 0
            com.huawei.hms.scankit.p.s6[] r2 = a(r2, r3, r0)
            int r3 = r2.length
            if (r3 == 0) goto Ld
            r2 = r2[r0]
            if (r2 == 0) goto Ld
            return r2
        Ld:
            com.huawei.hms.scankit.p.a r2 = com.huawei.hms.scankit.p.a.a()
            throw r2
    }
}
