package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class l7 extends com.huawei.hms.scankit.p.q7 {
    private final com.huawei.hms.scankit.p.q7 h;

    public l7() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.o2 r0 = new com.huawei.hms.scankit.p.o2
            r0.<init>()
            r1.h = r0
            return
    }

    private static com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.s6 r4) throws com.huawei.hms.scankit.p.a {
            java.lang.String r0 = r4.k()
            r1 = 0
            char r1 = r0.charAt(r1)
            r2 = 48
            if (r1 != r2) goto L1f
            com.huawei.hms.scankit.p.s6 r1 = new com.huawei.hms.scankit.p.s6
            r2 = 1
            java.lang.String r0 = r0.substring(r2)
            com.huawei.hms.scankit.p.u6[] r4 = r4.j()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            r3 = 0
            r1.<init>(r0, r3, r4, r2)
            return r1
        L1f:
            com.huawei.hms.scankit.p.a r4 = com.huawei.hms.scankit.p.a.a()
            throw r4
    }

    @Override // com.huawei.hms.scankit.p.q7
    protected int a(com.huawei.hms.scankit.p.r r2, int[] r3, java.lang.StringBuilder r4) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.q7 r0 = r1.h
            int r2 = r0.a(r2, r3, r4)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    com.huawei.hms.scankit.aiscan.common.BarcodeFormat a() {
            r1 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            return r0
    }

    @Override // com.huawei.hms.scankit.p.q7, com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r2, com.huawei.hms.scankit.p.r r3, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r4) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.q7 r0 = r1.h
            com.huawei.hms.scankit.p.s6 r2 = r0.a(r2, r3, r4)
            com.huawei.hms.scankit.p.s6 r2 = a(r2)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    public com.huawei.hms.scankit.p.s6 a(int r2, com.huawei.hms.scankit.p.r r3, int[] r4, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r5) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.q7 r0 = r1.h
            com.huawei.hms.scankit.p.s6 r2 = r0.a(r2, r3, r4, r5)
            com.huawei.hms.scankit.p.s6 r2 = a(r2)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.g5, com.huawei.hms.scankit.p.o6
    public com.huawei.hms.scankit.p.s6 a(com.huawei.hms.scankit.p.p r2, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r3) throws com.huawei.hms.scankit.p.a {
            r1 = this;
            com.huawei.hms.scankit.p.q7 r0 = r1.h
            com.huawei.hms.scankit.p.s6 r2 = r0.a(r2, r3)
            com.huawei.hms.scankit.p.s6 r2 = a(r2)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    public boolean a(int r2, int r3, com.huawei.hms.scankit.p.r r4) {
            r1 = this;
            int r2 = r3 - r2
            int r2 = r2 + r3
            r0 = 0
            boolean r2 = r4.a(r3, r2, r0, r0)
            return r2
    }

    @Override // com.huawei.hms.scankit.p.q7
    boolean a(int[] r8, int[] r9) throws com.huawei.hms.scankit.p.a {
            r7 = this;
            r0 = 1
            r1 = r9[r0]
            r2 = 0
            r9 = r9[r2]
            int r9 = r1 - r9
            r3 = r8[r0]
            r8 = r8[r2]
            int r3 = r3 - r8
            int r9 = r9 + r3
            double r3 = (double) r9
            r5 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r3 = r3 / r5
            int r1 = r1 - r8
            double r8 = (double) r1
            double r8 = r8 / r3
            long r8 = java.lang.Math.round(r8)
            int r9 = (int) r8
            int r9 = r9 + (-113)
            int r8 = java.lang.Math.abs(r9)
            r9 = 5
            if (r8 > r9) goto L24
            return r0
        L24:
            return r2
    }
}
