package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e3 extends com.huawei.hms.scankit.p.u6 {
    private final float e;
    private final int f;
    private final boolean g;

    e3(float r7, float r8, float r9, boolean r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public e3(float r1, float r2, float r3, boolean r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r5)
            r0.e = r3
            r0.f = r5
            r0.g = r4
            return
    }

    com.huawei.hms.scankit.p.e3 a(float r8, float r9, float r10, boolean r11) {
            r7 = this;
            int r0 = r7.f
            int r6 = r0 + 1
            float r0 = (float) r0
            float r1 = r7.b()
            float r0 = r0 * r1
            float r0 = r0 + r9
            float r9 = (float) r6
            float r2 = r0 / r9
            int r0 = r7.f
            float r0 = (float) r0
            float r1 = r7.c()
            float r0 = r0 * r1
            float r0 = r0 + r8
            float r3 = r0 / r9
            int r8 = r7.f
            float r8 = (float) r8
            float r0 = r7.e
            float r8 = r8 * r0
            float r8 = r8 + r10
            float r4 = r8 / r9
            boolean r8 = r7.g
            if (r8 == 0) goto L2b
            r5 = r11
            goto L2c
        L2b:
            r5 = r8
        L2c:
            com.huawei.hms.scankit.p.e3 r1 = new com.huawei.hms.scankit.p.e3
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
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

    @Override // com.huawei.hms.scankit.p.u6
    public boolean d() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public float e() {
            r1 = this;
            float r0 = r1.e
            return r0
    }
}
