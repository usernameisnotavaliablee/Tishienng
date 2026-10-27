package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Hold extends androidx.transition.Visibility {
    public Hold() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public android.animation.Animator onAppear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.transition.TransitionValues r3, @androidx.annotation.Nullable androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public android.animation.Animator onDisappear(@androidx.annotation.NonNull android.view.ViewGroup r1, @androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.transition.TransitionValues r3, @androidx.annotation.Nullable androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            return r1
    }
}
