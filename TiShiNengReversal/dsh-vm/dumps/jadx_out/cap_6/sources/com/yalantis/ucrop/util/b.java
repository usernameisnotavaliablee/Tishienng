package com.yalantis.ucrop.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float a(float r0, float r1, float r2, float r3) {
            float r0 = r0 / r3
            float r2 = r2 * r0
            float r2 = r2 * r0
            float r2 = r2 * r0
            float r2 = r2 + r1
            return r2
    }

    public static float b(float r1, float r2, float r3, float r4) {
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r1 = r1 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            float r3 = r3 / r0
            if (r4 >= 0) goto L13
            float r3 = r3 * r1
            float r3 = r3 * r1
            float r3 = r3 * r1
        L11:
            float r3 = r3 + r2
            return r3
        L13:
            float r1 = r1 - r0
            float r4 = r1 * r1
            float r4 = r4 * r1
            float r4 = r4 + r0
            float r3 = r3 * r4
            goto L11
    }

    public static float c(float r1, float r2, float r3, float r4) {
            float r1 = r1 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            float r0 = r1 * r1
            float r0 = r0 * r1
            float r0 = r0 + r4
            float r3 = r3 * r0
            float r3 = r3 + r2
            return r3
    }
}
