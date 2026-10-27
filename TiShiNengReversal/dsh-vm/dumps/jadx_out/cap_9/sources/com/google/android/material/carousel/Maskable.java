package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
interface Maskable {
    @androidx.annotation.NonNull
    android.graphics.RectF getMaskRectF();

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    @java.lang.Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@androidx.annotation.NonNull android.graphics.RectF r1);

    @java.lang.Deprecated
    void setMaskXPercentage(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1);

    void setOnMaskChangedListener(@androidx.annotation.Nullable com.google.android.material.carousel.OnMaskChangedListener r1);
}
