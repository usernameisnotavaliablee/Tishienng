package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m7 implements com.huawei.hms.scankit.p.l8 {
    private final com.huawei.hms.scankit.p.p2 a;

    public m7() {
            r1 = this;
            r1.<init>()
            com.huawei.hms.scankit.p.p2 r0 = new com.huawei.hms.scankit.p.p2
            r0.<init>()
            r1.a = r0
            return
    }

    @Override // com.huawei.hms.scankit.p.l8
    public com.huawei.hms.scankit.p.s a(java.lang.String r8, com.huawei.hms.scankit.aiscan.common.BarcodeFormat r9, int r10, int r11, java.util.Map<com.huawei.hms.scankit.p.u2, ?> r12) throws com.huawei.hms.hmsscankit.WriterException {
            r7 = this;
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r0 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.l
            if (r9 != r0) goto L21
            com.huawei.hms.scankit.p.p2 r1 = r7.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 48
            r9.append(r0)
            r9.append(r8)
            java.lang.String r2 = r9.toString()
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r3 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.h
            r4 = r10
            r5 = r11
            r6 = r12
            com.huawei.hms.scankit.p.s r8 = r1.a(r2, r3, r4, r5, r6)
            return r8
        L21:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Can only encode UPC-A, but got "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }
}
