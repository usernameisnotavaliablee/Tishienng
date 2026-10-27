package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class CarouselStrategy {
    public CarouselStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    static float getChildMaskPercentage(float r0, float r1, float r2) {
            float r0 = r0 - r2
            float r1 = r1 - r2
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            return r1
    }

    boolean isContained() {
            r1 = this;
            r0 = 1
            return r0
    }

    abstract com.google.android.material.carousel.KeylineState onFirstChildMeasuredWithMargins(@androidx.annotation.NonNull com.google.android.material.carousel.Carousel r1, @androidx.annotation.NonNull android.view.View r2);
}
