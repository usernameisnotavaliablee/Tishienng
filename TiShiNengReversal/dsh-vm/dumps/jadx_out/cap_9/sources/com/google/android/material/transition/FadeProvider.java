package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FadeProvider implements com.google.android.material.transition.VisibilityAnimatorProvider {
    private float incomingEndThreshold;



    public FadeProvider() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.incomingEndThreshold = r0
            return
    }

    private static android.animation.Animator createFadeAnimator(android.view.View r7, float r8, float r9, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r10, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r11, float r12) {
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.transition.FadeProvider$1 r1 = new com.google.android.material.transition.FadeProvider$1
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.addUpdateListener(r1)
            com.google.android.material.transition.FadeProvider$2 r7 = new com.google.android.material.transition.FadeProvider$2
            r7.<init>(r2, r12)
            r0.addListener(r7)
            return r0
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createAppear(@androidx.annotation.NonNull android.view.ViewGroup r7, @androidx.annotation.NonNull android.view.View r8) {
            r6 = this;
            float r7 = r8.getAlpha()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto Le
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Le:
            float r7 = r8.getAlpha()
            r2 = r7
        L13:
            r3 = 0
            float r4 = r6.incomingEndThreshold
            r1 = 0
            r5 = r2
            r0 = r8
            android.animation.Animator r7 = createFadeAnimator(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createDisappear(@androidx.annotation.NonNull android.view.ViewGroup r7, @androidx.annotation.NonNull android.view.View r8) {
            r6 = this;
            float r7 = r8.getAlpha()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto Le
            r7 = 1065353216(0x3f800000, float:1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Le:
            float r7 = r8.getAlpha()
            r1 = r7
        L13:
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r5 = r1
            r0 = r8
            android.animation.Animator r7 = createFadeAnimator(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public float getIncomingEndThreshold() {
            r1 = this;
            float r0 = r1.incomingEndThreshold
            return r0
    }

    public void setIncomingEndThreshold(float r1) {
            r0 = this;
            r0.incomingEndThreshold = r1
            return
    }
}
