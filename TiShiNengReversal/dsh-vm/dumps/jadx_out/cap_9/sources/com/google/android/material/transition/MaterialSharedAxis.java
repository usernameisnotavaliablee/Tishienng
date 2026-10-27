package com.google.android.material.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialSharedAxis extends com.google.android.material.transition.MaterialVisibility<com.google.android.material.transition.VisibilityAnimatorProvider> {

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_DURATION_ATTR = 0;

    @androidx.annotation.AttrRes
    private static final int DEFAULT_THEMED_EASING_ATTR = 0;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private final int axis;
    private final boolean forward;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong1
            com.google.android.material.transition.MaterialSharedAxis.DEFAULT_THEMED_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.transition.MaterialSharedAxis.DEFAULT_THEMED_EASING_ATTR = r0
            return
    }

    public MaterialSharedAxis(int r3, boolean r4) {
            r2 = this;
            com.google.android.material.transition.VisibilityAnimatorProvider r0 = createPrimaryAnimatorProvider(r3, r4)
            com.google.android.material.transition.VisibilityAnimatorProvider r1 = createSecondaryAnimatorProvider()
            r2.<init>(r0, r1)
            r2.axis = r3
            r2.forward = r4
            return
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createPrimaryAnimatorProvider(int r2, boolean r3) {
            if (r2 == 0) goto L32
            r0 = 1
            if (r2 == r0) goto L25
            r0 = 2
            if (r2 != r0) goto Le
            com.google.android.material.transition.ScaleProvider r2 = new com.google.android.material.transition.ScaleProvider
            r2.<init>(r3)
            return r2
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid axis: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L25:
            com.google.android.material.transition.SlideDistanceProvider r2 = new com.google.android.material.transition.SlideDistanceProvider
            if (r3 == 0) goto L2c
            r3 = 80
            goto L2e
        L2c:
            r3 = 48
        L2e:
            r2.<init>(r3)
            return r2
        L32:
            com.google.android.material.transition.SlideDistanceProvider r2 = new com.google.android.material.transition.SlideDistanceProvider
            if (r3 == 0) goto L3a
            r3 = 8388613(0x800005, float:1.175495E-38)
            goto L3d
        L3a:
            r3 = 8388611(0x800003, float:1.1754948E-38)
        L3d:
            r2.<init>(r3)
            return r2
    }

    private static com.google.android.material.transition.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
            com.google.android.material.transition.FadeThroughProvider r0 = new com.google.android.material.transition.FadeThroughProvider
            r0.<init>()
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

    public int getAxis() {
            r1 = this;
            int r0 = r1.axis
            return r0
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    int getDurationThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.MaterialSharedAxis.DEFAULT_THEMED_DURATION_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.AttrRes
    int getEasingThemeAttrResId(boolean r1) {
            r0 = this;
            int r1 = com.google.android.material.transition.MaterialSharedAxis.DEFAULT_THEMED_EASING_ATTR
            return r1
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ com.google.android.material.transition.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
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

    public boolean isForward() {
            r1 = this;
            boolean r0 = r1.forward
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
