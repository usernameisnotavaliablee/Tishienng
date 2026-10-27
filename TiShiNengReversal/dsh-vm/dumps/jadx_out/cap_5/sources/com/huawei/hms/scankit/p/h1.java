package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h1 implements com.huawei.hms.scankit.p.o6 {
    private static final com.huawei.hms.scankit.p.u6[] b = null;
    private final com.huawei.hms.scankit.p.t1 a;

    static {
            r0 = 0
            com.huawei.hms.scankit.p.u6[] r0 = new com.huawei.hms.scankit.p.u6[r0]
            com.huawei.hms.scankit.p.h1.b = r0
            return
    }

    public h1() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.t1 r0 = new com.huawei.hms.scankit.p.t1
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r11, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r12) throws com.huawei.hms.scankit.p.a {
            r10 = this;
            com.huawei.hms.scankit.p.d2 r0 = new com.huawei.hms.scankit.p.d2
            com.huawei.hms.scankit.p.s r11 = r11.b()
            r0.<init>(r11)
            com.huawei.hms.scankit.p.j2 r11 = r0.a()
            com.huawei.hms.scankit.p.t1 r0 = r10.a     // Catch: com.huawei.hms.scankit.p.a -> L2b
            com.huawei.hms.scankit.p.s r1 = r11.a()     // Catch: com.huawei.hms.scankit.p.a -> L2b
            com.huawei.hms.scankit.p.w1 r12 = r0.a(r1, r12)     // Catch: com.huawei.hms.scankit.p.a -> L2b
            com.huawei.hms.scankit.p.u6[] r11 = r11.d()
            com.huawei.hms.scankit.p.s6 r0 = new com.huawei.hms.scankit.p.s6
            java.lang.String r1 = r12.d()
            byte[] r12 = r12.c()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            r0.<init>(r1, r12, r11, r2)
            return r0
        L2b:
            r12 = move-exception
            com.huawei.hms.scankit.p.u6[] r0 = r11.d()
            if (r0 == 0) goto Ld3
            boolean r0 = com.huawei.hms.scankit.p.r3.c
            if (r0 != 0) goto Ld3
            com.huawei.hms.scankit.p.u6[] r0 = r11.d()
            r1 = 0
            r0 = r0[r1]
            float r0 = r0.b()
            com.huawei.hms.scankit.p.u6[] r2 = r11.d()
            r3 = 1
            r2 = r2[r3]
            float r2 = r2.b()
            float r0 = r0 - r2
            double r4 = (double) r0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r4, r6)
            com.huawei.hms.scankit.p.u6[] r0 = r11.d()
            r0 = r0[r1]
            float r0 = r0.c()
            com.huawei.hms.scankit.p.u6[] r2 = r11.d()
            r2 = r2[r3]
            float r2 = r2.c()
            float r0 = r0 - r2
            double r2 = (double) r0
            double r2 = java.lang.Math.pow(r2, r6)
            double r4 = r4 + r2
            double r2 = java.lang.Math.sqrt(r4)
            com.huawei.hms.scankit.p.u6[] r0 = r11.d()
            r0 = r0[r1]
            float r0 = r0.b()
            com.huawei.hms.scankit.p.u6[] r4 = r11.d()
            r5 = 3
            r4 = r4[r5]
            float r4 = r4.b()
            float r0 = r0 - r4
            double r8 = (double) r0
            double r8 = java.lang.Math.pow(r8, r6)
            com.huawei.hms.scankit.p.u6[] r0 = r11.d()
            r0 = r0[r1]
            float r0 = r0.c()
            com.huawei.hms.scankit.p.u6[] r1 = r11.d()
            r1 = r1[r5]
            float r1 = r1.c()
            float r0 = r0 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r6)
            double r8 = r8 + r0
            double r0 = java.lang.Math.sqrt(r8)
            com.huawei.hms.scankit.p.t1 r4 = r10.a
            com.huawei.hms.scankit.p.z7 r4 = r4.a()
            if (r4 == 0) goto Ld2
            double r0 = r2 - r0
            double r0 = java.lang.Math.abs(r0)
            double r0 = r0 / r2
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld2
            com.huawei.hms.scankit.p.s6 r12 = new com.huawei.hms.scankit.p.s6
            com.huawei.hms.scankit.p.u6[] r11 = r11.d()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.f
            r1 = 0
            r12.<init>(r1, r1, r11, r0)
            return r12
        Ld2:
            throw r12
        Ld3:
            throw r12
    }
}
