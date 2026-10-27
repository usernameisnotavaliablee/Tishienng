package com.google.android.material.transition.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
interface FitModeEvaluator {
    void applyMask(android.graphics.RectF r1, float r2, com.google.android.material.transition.platform.FitModeResult r3);

    com.google.android.material.transition.platform.FitModeResult evaluate(float r1, float r2, float r3, float r4, float r5, float r6, float r7);

    boolean shouldMaskStartBounds(com.google.android.material.transition.platform.FitModeResult r1);
}
