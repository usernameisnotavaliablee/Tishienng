package com.scwang.smartrefresh.layout.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements android.view.animation.Interpolator {
    private static final float a = 8.0f;
    private static final float b = 0.0f;
    private static final float c = 0.0f;

    static {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = a(r0)
            float r1 = r0 / r1
            com.scwang.smartrefresh.layout.util.e.b = r1
            float r2 = a(r0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            com.scwang.smartrefresh.layout.util.e.c = r0
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float a(float r3) {
            r0 = 1090519040(0x41000000, float:8.0)
            float r3 = r3 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L14
            float r1 = -r3
            double r1 = (double) r1
            double r1 = java.lang.Math.exp(r1)
            float r1 = (float) r1
            float r0 = r0 - r1
            float r3 = r3 - r0
            return r3
        L14:
            float r3 = r0 - r3
            double r1 = (double) r3
            double r1 = java.lang.Math.exp(r1)
            float r3 = (float) r1
            float r0 = r0 - r3
            r3 = 1059181223(0x3f21d2a7, float:0.63212055)
            float r0 = r0 * r3
            r3 = 1052531378(0x3ebc5ab2, float:0.36787945)
            float r0 = r0 + r3
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
            r1 = this;
            float r0 = com.scwang.smartrefresh.layout.util.e.b
            float r2 = a(r2)
            float r0 = r0 * r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10
            float r2 = com.scwang.smartrefresh.layout.util.e.c
            float r0 = r0 + r2
        L10:
            return r0
    }
}
