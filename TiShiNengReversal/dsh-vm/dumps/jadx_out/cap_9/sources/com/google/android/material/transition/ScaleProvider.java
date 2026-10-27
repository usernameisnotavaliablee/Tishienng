package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ScaleProvider implements com.google.android.material.transition.VisibilityAnimatorProvider {
    private boolean growing;
    private float incomingEndScale;
    private float incomingStartScale;
    private float outgoingEndScale;
    private float outgoingStartScale;
    private boolean scaleOnDisappear;


    public ScaleProvider() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public ScaleProvider(boolean r3) {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.outgoingStartScale = r0
            r1 = 1066192077(0x3f8ccccd, float:1.1)
            r2.outgoingEndScale = r1
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2.incomingStartScale = r1
            r2.incomingEndScale = r0
            r0 = 1
            r2.scaleOnDisappear = r0
            r2.growing = r3
            return
    }

    private static android.animation.Animator createScaleAnimator(android.view.View r8, float r9, float r10) {
            float r0 = r8.getScaleX()
            float r1 = r8.getScaleY()
            android.util.Property r2 = android.view.View.SCALE_X
            float r3 = r0 * r9
            float r4 = r0 * r10
            r5 = 2
            float[] r6 = new float[r5]
            r7 = 0
            r6[r7] = r3
            r3 = 1
            r6[r3] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r6)
            android.util.Property r4 = android.view.View.SCALE_Y
            float r9 = r9 * r1
            float r10 = r10 * r1
            float[] r6 = new float[r5]
            r6[r7] = r9
            r6[r3] = r10
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofFloat(r4, r6)
            android.animation.PropertyValuesHolder[] r10 = new android.animation.PropertyValuesHolder[r5]
            r10[r7] = r2
            r10[r3] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r8, r10)
            com.google.android.material.transition.ScaleProvider$1 r10 = new com.google.android.material.transition.ScaleProvider$1
            r10.<init>(r8, r0, r1)
            r9.addListener(r10)
            return r9
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createAppear(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.NonNull android.view.View r3) {
            r1 = this;
            boolean r2 = r1.growing
            if (r2 == 0) goto Ld
            float r2 = r1.incomingStartScale
            float r0 = r1.incomingEndScale
            android.animation.Animator r2 = createScaleAnimator(r3, r2, r0)
            return r2
        Ld:
            float r2 = r1.outgoingEndScale
            float r0 = r1.outgoingStartScale
            android.animation.Animator r2 = createScaleAnimator(r3, r2, r0)
            return r2
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createDisappear(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.NonNull android.view.View r3) {
            r1 = this;
            boolean r2 = r1.scaleOnDisappear
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r1.growing
            if (r2 == 0) goto L13
            float r2 = r1.outgoingStartScale
            float r0 = r1.outgoingEndScale
            android.animation.Animator r2 = createScaleAnimator(r3, r2, r0)
            return r2
        L13:
            float r2 = r1.incomingEndScale
            float r0 = r1.incomingStartScale
            android.animation.Animator r2 = createScaleAnimator(r3, r2, r0)
            return r2
    }

    public float getIncomingEndScale() {
            r1 = this;
            float r0 = r1.incomingEndScale
            return r0
    }

    public float getIncomingStartScale() {
            r1 = this;
            float r0 = r1.incomingStartScale
            return r0
    }

    public float getOutgoingEndScale() {
            r1 = this;
            float r0 = r1.outgoingEndScale
            return r0
    }

    public float getOutgoingStartScale() {
            r1 = this;
            float r0 = r1.outgoingStartScale
            return r0
    }

    public boolean isGrowing() {
            r1 = this;
            boolean r0 = r1.growing
            return r0
    }

    public boolean isScaleOnDisappear() {
            r1 = this;
            boolean r0 = r1.scaleOnDisappear
            return r0
    }

    public void setGrowing(boolean r1) {
            r0 = this;
            r0.growing = r1
            return
    }

    public void setIncomingEndScale(float r1) {
            r0 = this;
            r0.incomingEndScale = r1
            return
    }

    public void setIncomingStartScale(float r1) {
            r0 = this;
            r0.incomingStartScale = r1
            return
    }

    public void setOutgoingEndScale(float r1) {
            r0 = this;
            r0.outgoingEndScale = r1
            return
    }

    public void setOutgoingStartScale(float r1) {
            r0 = this;
            r0.outgoingStartScale = r1
            return
    }

    public void setScaleOnDisappear(boolean r1) {
            r0 = this;
            r0.scaleOnDisappear = r1
            return
    }
}
