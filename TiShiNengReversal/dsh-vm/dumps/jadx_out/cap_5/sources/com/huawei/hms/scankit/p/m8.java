package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class m8 implements com.huawei.hms.scankit.p.o6 {
    private java.util.Map<com.huawei.hms.scankit.p.l1, java.lang.Object> a;

    public m8() {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.p.l1> r1 = com.huawei.hms.scankit.p.l1.class
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.f3 r3, com.huawei.hms.scankit.p.f3 r4, com.huawei.hms.scankit.p.f3 r5) {
            r2 = this;
            com.huawei.hms.scankit.p.u6 r0 = new com.huawei.hms.scankit.p.u6
            float r1 = r3.b()
            float r3 = r3.c()
            r0.<init>(r1, r3)
            com.huawei.hms.scankit.p.u6 r3 = new com.huawei.hms.scankit.p.u6
            float r1 = r4.b()
            float r4 = r4.c()
            r3.<init>(r1, r4)
            com.huawei.hms.scankit.p.u6 r4 = new com.huawei.hms.scankit.p.u6
            float r1 = r5.b()
            float r5 = r5.c()
            r4.<init>(r1, r5)
            r5 = 3
            com.huawei.hms.scankit.p.u6[] r5 = new com.huawei.hms.scankit.p.u6[r5]
            r1 = 0
            r5[r1] = r0
            r0 = 1
            r5[r0] = r3
            r3 = 2
            r5[r3] = r4
            com.huawei.hms.scankit.p.s6 r3 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r4 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.q
            java.lang.String r0 = "WXCODE_TEXT"
            r1 = 0
            r3.<init>(r0, r1, r5, r4)
            return r3
    }

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r17, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r18) throws com.huawei.hms.scankit.p.a {
            r16 = this;
            r0 = r16
            com.huawei.hms.scankit.p.h2 r1 = new com.huawei.hms.scankit.p.h2
            com.huawei.hms.scankit.p.s r2 = r17.b()
            r1.<init>(r2)
            r2 = r18
            com.huawei.hms.scankit.p.f3[] r1 = r1.a(r2)
            int r2 = r1.length
            r3 = 10
            r4 = 0
            if (r2 <= r3) goto L18
            return r4
        L18:
            r3 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 != r3) goto L38
            r2 = r1[r6]
            r3 = r1[r7]
            r8 = r1[r5]
            boolean r2 = com.huawei.hms.scankit.p.h2.a(r2, r3, r8)
            if (r2 == 0) goto L35
            r2 = r1[r6]
            r3 = r1[r7]
            r1 = r1[r5]
            com.huawei.hms.scankit.p.s6 r1 = r0.a(r2, r3, r1)
            return r1
        L35:
            r17 = r4
            goto L89
        L38:
            r8 = 0
        L39:
            int r9 = r2 + (-3)
            if (r8 > r9) goto L35
            int r9 = r8 + 1
            r10 = r9
        L40:
            int r11 = r2 + (-2)
            if (r10 > r11) goto L87
            int r11 = r10 + 1
            r12 = r11
        L47:
            int r13 = r2 + (-1)
            if (r12 > r13) goto L85
            r13 = r1[r8]
            r14 = r1[r10]
            r15 = r1[r12]
            r17 = r4
            com.huawei.hms.scankit.p.f3[] r4 = new com.huawei.hms.scankit.p.f3[r3]
            r4[r6] = r13
            r4[r7] = r14
            r4[r5] = r15
            int[] r13 = new int[]{r8, r10, r12}
            com.huawei.hms.scankit.p.u6.a(r4)
            r14 = r4[r6]
            r15 = r4[r7]
            r3 = r4[r5]
            boolean r3 = com.huawei.hms.scankit.p.h2.a(r14, r15, r3)
            if (r3 == 0) goto L7f
            boolean r3 = com.huawei.hms.scankit.p.h2.a(r4, r1, r13)
            if (r3 != 0) goto L7f
            r2 = r1[r8]
            r3 = r1[r10]
            r1 = r1[r12]
            com.huawei.hms.scankit.p.s6 r1 = r0.a(r2, r3, r1)
            return r1
        L7f:
            int r12 = r12 + 1
            r4 = r17
            r3 = 3
            goto L47
        L85:
            r10 = r11
            goto L40
        L87:
            r8 = r9
            goto L39
        L89:
            return r17
    }
}
