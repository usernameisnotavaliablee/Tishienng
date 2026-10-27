package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.huawei.hms.scankit.p.u6 {
    private final float e;

    d(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.e = r3
            return
    }

    boolean b(float r2, float r3, float r4) {
            r1 = this;
            float r0 = r1.c()
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            r0 = 0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L32
            float r3 = r1.b()
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L32
            float r3 = r1.e
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L30
            float r3 = r1.e
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L2f
            goto L30
        L2f:
            return r0
        L30:
            r2 = 1
            return r2
        L32:
            return r0
    }

    com.huawei.hms.scankit.p.d c(float r3, float r4, float r5) {
            r2 = this;
            float r0 = r2.b()
            float r0 = r0 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r1 = r2.c()
            float r1 = r1 + r3
            float r1 = r1 / r4
            float r3 = r2.e
            float r3 = r3 + r5
            float r3 = r3 / r4
            com.huawei.hms.scankit.p.d r4 = new com.huawei.hms.scankit.p.d
            r4.<init>(r0, r1, r3)
            return r4
    }
}
