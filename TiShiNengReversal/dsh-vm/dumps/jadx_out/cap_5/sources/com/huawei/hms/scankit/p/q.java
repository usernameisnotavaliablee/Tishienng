package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class q extends com.huawei.hms.scankit.p.i7 {
    private final short c;
    private final short d;

    q(com.huawei.hms.scankit.p.i7 r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            short r1 = (short) r2
            r0.c = r1
            short r1 = (short) r3
            r0.d = r1
            return
    }

    @Override // com.huawei.hms.scankit.p.i7
    public void a(com.huawei.hms.scankit.p.r r6, byte[] r7) {
            r5 = this;
            r0 = 0
        L1:
            short r1 = r5.d
            if (r0 >= r1) goto L3b
            r2 = 62
            r3 = 31
            if (r0 == 0) goto Lf
            if (r0 != r3) goto L2e
            if (r1 > r2) goto L2e
        Lf:
            r1 = 5
            r6.a(r3, r1)
            short r4 = r5.d
            if (r4 <= r2) goto L1f
            int r4 = r4 + (-31)
            r1 = 16
            r6.a(r4, r1)
            goto L2e
        L1f:
            if (r0 != 0) goto L29
            int r2 = java.lang.Math.min(r4, r3)
            r6.a(r2, r1)
            goto L2e
        L29:
            int r4 = r4 + (-31)
            r6.a(r4, r1)
        L2e:
            short r1 = r5.c
            int r1 = r1 + r0
            r1 = r7[r1]
            r2 = 8
            r6.a(r1, r2)
            int r0 = r0 + 1
            goto L1
        L3b:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            short r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = "::"
            r0.append(r1)
            short r1 = r3.c
            short r2 = r3.d
            int r1 = r1 + r2
            int r1 = r1 + (-1)
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
