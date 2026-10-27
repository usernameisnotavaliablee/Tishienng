package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class a7 extends com.huawei.hms.scankit.p.i7 {
    private final short c;
    private final short d;

    a7(com.huawei.hms.scankit.p.i7 r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            short r1 = (short) r2
            r0.c = r1
            short r1 = (short) r3
            r0.d = r1
            return
    }

    @Override // com.huawei.hms.scankit.p.i7
    void a(com.huawei.hms.scankit.p.r r2, byte[] r3) {
            r1 = this;
            short r3 = r1.c
            short r0 = r1.d
            r2.a(r3, r0)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            short r0 = r4.c
            short r1 = r4.d
            r2 = 1
            int r1 = r2 << r1
            int r3 = r1 + (-1)
            r0 = r0 & r3
            r0 = r0 | r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 60
            r1.append(r3)
            short r3 = r4.d
            int r3 = r2 << r3
            r0 = r0 | r3
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            java.lang.String r0 = r0.substring(r2)
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
