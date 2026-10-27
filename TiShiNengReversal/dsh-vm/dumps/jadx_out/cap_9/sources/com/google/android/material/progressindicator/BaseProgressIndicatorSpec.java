package com.google.android.material.progressindicator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @androidx.annotation.NonNull
    public int[] indicatorColors;
    public int showAnimationBehavior;

    @androidx.annotation.ColorInt
    public int trackColor;

    @androidx.annotation.Px
    public int trackCornerRadius;

    @androidx.annotation.Px
    public int trackThickness;

    protected BaseProgressIndicatorSpec(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, @androidx.annotation.AttrRes int r11, @androidx.annotation.StyleRes int r12) {
            r8 = this;
            r8.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r8.indicatorColors = r1
            android.content.res.Resources r1 = r9.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_progress_track_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int[] r4 = com.google.android.material.R.styleable.BaseProgressIndicator
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r10 = com.google.android.material.R.styleable.BaseProgressIndicator_trackThickness
            int r10 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r2, r9, r10, r1)
            r8.trackThickness = r10
            int r10 = com.google.android.material.R.styleable.BaseProgressIndicator_trackCornerRadius
            int r10 = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(r2, r9, r10, r0)
            int r11 = r8.trackThickness
            int r11 = r11 / 2
            int r10 = java.lang.Math.min(r10, r11)
            r8.trackCornerRadius = r10
            int r10 = com.google.android.material.R.styleable.BaseProgressIndicator_showAnimationBehavior
            int r10 = r9.getInt(r10, r0)
            r8.showAnimationBehavior = r10
            int r10 = com.google.android.material.R.styleable.BaseProgressIndicator_hideAnimationBehavior
            int r10 = r9.getInt(r10, r0)
            r8.hideAnimationBehavior = r10
            r8.loadIndicatorColors(r2, r9)
            r8.loadTrackColor(r2, r9)
            r9.recycle()
            return
    }

    private void loadIndicatorColors(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.content.res.TypedArray r6) {
            r4 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor
            boolean r1 = r6.hasValue(r0)
            r2 = -1
            if (r1 != 0) goto L16
            int r6 = com.google.android.material.R.attr.colorPrimary
            int r5 = com.google.android.material.color.MaterialColors.getColor(r5, r6, r2)
            int[] r5 = new int[]{r5}
            r4.indicatorColors = r5
            return
        L16:
            android.util.TypedValue r1 = r6.peekValue(r0)
            int r1 = r1.type
            r3 = 1
            if (r1 == r3) goto L2a
            int r5 = r6.getColor(r0, r2)
            int[] r5 = new int[]{r5}
            r4.indicatorColors = r5
            return
        L2a:
            android.content.res.Resources r5 = r5.getResources()
            int r6 = r6.getResourceId(r0, r2)
            int[] r5 = r5.getIntArray(r6)
            r4.indicatorColors = r5
            int r5 = r5.length
            if (r5 == 0) goto L3c
            return
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "indicatorColors cannot be empty when indicatorColor is not used."
            r5.<init>(r6)
            throw r5
    }

    private void loadTrackColor(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.res.TypedArray r4) {
            r2 = this;
            int r0 = com.google.android.material.R.styleable.BaseProgressIndicator_trackColor
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L10
            r3 = -1
            int r3 = r4.getColor(r0, r3)
            r2.trackColor = r3
            return
        L10:
            int[] r4 = r2.indicatorColors
            r0 = 0
            r4 = r4[r0]
            r2.trackColor = r4
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 16842803(0x1010033, float:2.36937E-38)
            int[] r4 = new int[]{r4}
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r3.getFloat(r0, r4)
            r3.recycle()
            r3 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r3
            int r3 = (int) r4
            int r4 = r2.trackColor
            int r3 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r4, r3)
            r2.trackColor = r3
            return
    }

    public boolean isHideAnimationEnabled() {
            r1 = this;
            int r0 = r1.hideAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isShowAnimationEnabled() {
            r1 = this;
            int r0 = r1.showAnimationBehavior
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    abstract void validateSpec();
}
