package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SlideDistanceProvider implements com.google.android.material.transition.VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;

    @androidx.annotation.Px
    private int slideDistance;
    private int slideEdge;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.slideDistance = r0
            r1.slideEdge = r2
            return
    }

    private static android.animation.Animator createTranslationAppearAnimator(android.view.View r3, android.view.View r4, int r5, @androidx.annotation.Px int r6) {
            float r0 = r4.getTranslationX()
            float r1 = r4.getTranslationY()
            r2 = 3
            if (r5 == r2) goto L70
            r2 = 5
            if (r5 == r2) goto L68
            r2 = 48
            if (r5 == r2) goto L60
            r2 = 80
            if (r5 == r2) goto L59
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r1) goto L48
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r1) goto L31
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L2a
            float r3 = (float) r6
            float r3 = r0 - r3
            goto L2c
        L2a:
            float r3 = (float) r6
            float r3 = r3 + r0
        L2c:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Invalid slide direction: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L48:
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L51
            float r3 = (float) r6
            float r3 = r3 + r0
            goto L54
        L51:
            float r3 = (float) r6
            float r3 = r0 - r3
        L54:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L59:
            float r3 = (float) r6
            float r3 = r3 + r1
            android.animation.Animator r3 = createTranslationYAnimator(r4, r3, r1, r1)
            return r3
        L60:
            float r3 = (float) r6
            float r3 = r1 - r3
            android.animation.Animator r3 = createTranslationYAnimator(r4, r3, r1, r1)
            return r3
        L68:
            float r3 = (float) r6
            float r3 = r0 - r3
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L70:
            float r3 = (float) r6
            float r3 = r3 + r0
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
    }

    private static android.animation.Animator createTranslationDisappearAnimator(android.view.View r3, android.view.View r4, int r5, @androidx.annotation.Px int r6) {
            float r0 = r4.getTranslationX()
            float r1 = r4.getTranslationY()
            r2 = 3
            if (r5 == r2) goto L6f
            r2 = 5
            if (r5 == r2) goto L68
            r2 = 48
            if (r5 == r2) goto L61
            r2 = 80
            if (r5 == r2) goto L59
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r1) goto L48
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r1) goto L31
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L29
            float r3 = (float) r6
            float r3 = r3 + r0
            goto L2c
        L29:
            float r3 = (float) r6
            float r3 = r0 - r3
        L2c:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Invalid slide direction: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L48:
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L52
            float r3 = (float) r6
            float r3 = r0 - r3
            goto L54
        L52:
            float r3 = (float) r6
            float r3 = r3 + r0
        L54:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L59:
            float r3 = (float) r6
            float r3 = r1 - r3
            android.animation.Animator r3 = createTranslationYAnimator(r4, r1, r3, r1)
            return r3
        L61:
            float r3 = (float) r6
            float r3 = r3 + r1
            android.animation.Animator r3 = createTranslationYAnimator(r4, r1, r3, r1)
            return r3
        L68:
            float r3 = (float) r6
            float r3 = r3 + r0
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L6f:
            float r3 = (float) r6
            float r3 = r0 - r3
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
    }

    private static android.animation.Animator createTranslationXAnimator(android.view.View r3, float r4, float r5, float r6) {
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
            r4[r2] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r4)
            com.google.android.material.transition.SlideDistanceProvider$1 r5 = new com.google.android.material.transition.SlideDistanceProvider$1
            r5.<init>(r3, r6)
            r4.addListener(r5)
            return r4
    }

    private static android.animation.Animator createTranslationYAnimator(android.view.View r3, float r4, float r5, float r6) {
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
            r4[r2] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r4)
            com.google.android.material.transition.SlideDistanceProvider$2 r5 = new com.google.android.material.transition.SlideDistanceProvider$2
            r5.<init>(r3, r6)
            r4.addListener(r5)
            return r4
    }

    private int getSlideDistanceOrDefault(android.content.Context r3) {
            r2 = this;
            int r0 = r2.slideDistance
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            android.content.res.Resources r3 = r3.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_transition_shared_axis_slide_distance
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    private static boolean isRtl(android.view.View r1) {
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createAppear(@androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull android.view.View r4) {
            r2 = this;
            int r0 = r2.slideEdge
            android.content.Context r1 = r4.getContext()
            int r1 = r2.getSlideDistanceOrDefault(r1)
            android.animation.Animator r3 = createTranslationAppearAnimator(r3, r4, r0, r1)
            return r3
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @androidx.annotation.Nullable
    public android.animation.Animator createDisappear(@androidx.annotation.NonNull android.view.ViewGroup r3, @androidx.annotation.NonNull android.view.View r4) {
            r2 = this;
            int r0 = r2.slideEdge
            android.content.Context r1 = r4.getContext()
            int r1 = r2.getSlideDistanceOrDefault(r1)
            android.animation.Animator r3 = createTranslationDisappearAnimator(r3, r4, r0, r1)
            return r3
    }

    @androidx.annotation.Px
    public int getSlideDistance() {
            r1 = this;
            int r0 = r1.slideDistance
            return r0
    }

    public int getSlideEdge() {
            r1 = this;
            int r0 = r1.slideEdge
            return r0
    }

    public void setSlideDistance(@androidx.annotation.Px int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.slideDistance = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead."
            r2.<init>(r0)
            throw r2
    }

    public void setSlideEdge(int r1) {
            r0 = this;
            r0.slideEdge = r1
            return
    }
}
