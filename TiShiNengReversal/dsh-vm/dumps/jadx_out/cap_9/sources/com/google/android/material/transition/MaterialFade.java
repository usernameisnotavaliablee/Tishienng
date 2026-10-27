package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialFade extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.FadeProvider> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_INCOMING_EASING_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_OUTGOING_EASING_ATTR = 0;

    static {
            int r0 = com.google.android.material.R.attr.motionDurationMedium4
            com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_INCOMING_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort3
            com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_OUTGOING_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator
            com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_INCOMING_EASING_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator
            com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_OUTGOING_EASING_ATTR = r0
            return
    }

    public MaterialFade() {
            r2 = this;
            com.google.android.material.transition.FadeProvider r0 = createPrimaryAnimatorProvider()
            com.google.android.material.transition.VisibilityAnimatorProvider r1 = createSecondaryAnimatorProvider()
            r2.<init>(r0, r1)
            return
    }

    private static com.google.android.material.transition.FadeProvider createPrimaryAnimatorProvider() {
            com.google.android.material.transition.FadeProvider r0 = new com.google.android.material.transition.FadeProvider
            r0.<init>()
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.setIncomingEndThreshold(r1)
            return r0
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
            com.google.android.material.transition.ScaleProvider r0 = new com.google.android.material.transition.ScaleProvider
            r0.<init>()
            r1 = 0
            r0.setScaleOnDisappear(r1)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r0.setIncomingStartScale(r1)
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.addAdditionalAnimatorProvider(r1)
            return
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
            r0 = this;
            super.clearAdditionalAnimatorProvider()
            return
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.NonNull
    android.animation.TimeInterpolator getDefaultEasingInterpolator(boolean r1) {
            r0 = this;
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    int getDurationThemeAttrResId(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            int r1 = com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_INCOMING_DURATION_ATTR
            return r1
        L5:
            int r1 = com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_OUTGOING_DURATION_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    int getEasingThemeAttrResId(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            int r1 = com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_INCOMING_EASING_ATTR
            return r1
        L5:
            int r1 = com.google.android.material.transition.MaterialFade.DEFAULT_THEMED_OUTGOING_EASING_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.transition.FadeProvider getPrimaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.VisibilityAnimatorProvider r0 = super.getPrimaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.VisibilityAnimatorProvider r0 = super.getSecondaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onAppear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onDisappear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@androidx.annotation.NonNull com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            boolean r1 = super.removeAdditionalAnimatorProvider(r1)
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@androidx.annotation.Nullable com.google.android.material.transition.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.setSecondaryAnimatorProvider(r1)
            return
    }
}
