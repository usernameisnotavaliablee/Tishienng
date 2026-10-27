package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class z4 extends com.huawei.hms.scankit.p.g5 {
    private static final com.huawei.hms.scankit.p.g5[] b = null;
    private final com.huawei.hms.scankit.p.g5[] a;

    static {
            r0 = 0
            com.huawei.hms.scankit.p.g5[] r0 = new com.huawei.hms.scankit.p.g5[r0]
            com.huawei.hms.scankit.p.z4.b = r0
            return
    }

    public z4(java.util.Map<com.huawei.hms.scankit.p.l1, ?> r5) {
            r4 = this;
            r4.<init>()
            if (r5 != 0) goto L7
            r0 = 0
            goto Lf
        L7:
            com.huawei.hms.scankit.p.l1 r0 = com.huawei.hms.scankit.p.l1.c
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
        Lf:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L8f
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L36
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L36
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.g
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L36
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.m
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L3e
        L36:
            com.huawei.hms.scankit.p.b5 r2 = new com.huawei.hms.scankit.p.b5
            r2.<init>(r5)
            r1.add(r2)
        L3e:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.c
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4f
            com.huawei.hms.scankit.p.t0 r2 = new com.huawei.hms.scankit.p.t0
            r3 = 0
            r2.<init>(r3)
            r1.add(r2)
        L4f:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.d
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L5f
            com.huawei.hms.scankit.p.v0 r2 = new com.huawei.hms.scankit.p.v0
            r2.<init>()
            r1.add(r2)
        L5f:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.e
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L6f
            com.huawei.hms.scankit.p.r0 r2 = new com.huawei.hms.scankit.p.r0
            r2.<init>()
            r1.add(r2)
        L6f:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.i
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L7f
            com.huawei.hms.scankit.p.j4 r2 = new com.huawei.hms.scankit.p.j4
            r2.<init>()
            r1.add(r2)
        L7f:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r2 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.b
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L8f
            com.huawei.hms.scankit.p.p0 r0 = new com.huawei.hms.scankit.p.p0
            r0.<init>()
            r1.add(r0)
        L8f:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc5
            com.huawei.hms.scankit.p.b5 r0 = new com.huawei.hms.scankit.p.b5
            r0.<init>(r5)
            r1.add(r0)
            com.huawei.hms.scankit.p.t0 r5 = new com.huawei.hms.scankit.p.t0
            r5.<init>()
            r1.add(r5)
            com.huawei.hms.scankit.p.p0 r5 = new com.huawei.hms.scankit.p.p0
            r5.<init>()
            r1.add(r5)
            com.huawei.hms.scankit.p.v0 r5 = new com.huawei.hms.scankit.p.v0
            r5.<init>()
            r1.add(r5)
            com.huawei.hms.scankit.p.r0 r5 = new com.huawei.hms.scankit.p.r0
            r5.<init>()
            r1.add(r5)
            com.huawei.hms.scankit.p.j4 r5 = new com.huawei.hms.scankit.p.j4
            r5.<init>()
            r1.add(r5)
        Lc5:
            com.huawei.hms.scankit.p.g5[] r5 = com.huawei.hms.scankit.p.z4.b
            java.lang.Object[] r5 = r1.toArray(r5)
            com.huawei.hms.scankit.p.g5[] r5 = (com.huawei.hms.scankit.p.g5[]) r5
            r4.a = r5
            return
    }

    @Override // com.huawei.hms.scankit.p.g5
    public com.huawei.hms.scankit.p.s6 a(int r5, com.huawei.hms.scankit.p.r r6, java.util.Map<com.huawei.hms.scankit.p.l1, ?> r7) throws com.huawei.hms.scankit.p.a {
            r4 = this;
            com.huawei.hms.scankit.p.g5[] r0 = r4.a
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            com.huawei.hms.scankit.p.s6 r5 = r3.a(r5, r6, r7)     // Catch: com.huawei.hms.scankit.p.a -> Ld
            return r5
        Ld:
            int r2 = r2 + 1
            goto L4
        L10:
            com.huawei.hms.scankit.p.a r5 = com.huawei.hms.scankit.p.a.a()
            throw r5
    }
}
