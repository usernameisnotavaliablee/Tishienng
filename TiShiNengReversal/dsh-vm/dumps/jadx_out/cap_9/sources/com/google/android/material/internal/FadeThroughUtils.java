package com.google.android.material.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void calculateFadeOutAndInAlphas(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r6, float[] r7) {
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L15
            float r6 = r6 * r3
            float r4 = r4 - r6
            r7[r5] = r4
            r7[r2] = r1
            return
        L15:
            r7[r5] = r1
            float r6 = r6 * r3
            float r6 = r6 - r4
            r7[r2] = r6
            return
    }
}
