package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    protected com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S r1) {
            r0 = this;
            r0.<init>()
            r0.spec = r1
            return
    }

    abstract void adjustCanvas(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3);

    abstract void fillIndicator(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Paint r2, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.ColorInt int r5);

    abstract void fillTrack(@androidx.annotation.NonNull android.graphics.Canvas r1, @androidx.annotation.NonNull android.graphics.Paint r2);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    protected void registerDrawable(@androidx.annotation.NonNull com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1) {
            r0 = this;
            r0.drawable = r1
            return
    }

    void validateSpecAndAdjustCanvas(@androidx.annotation.NonNull android.graphics.Canvas r2, @androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.validateSpec()
            r1.adjustCanvas(r2, r3, r4)
            return
    }
}
