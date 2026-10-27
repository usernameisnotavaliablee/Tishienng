package com.google.android.material.floatingactionbutton;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class FloatingActionButtonImplLollipop extends com.google.android.material.floatingactionbutton.FloatingActionButtonImpl {

    @androidx.annotation.Nullable
    private android.animation.StateListAnimator stateListAnimator;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AlwaysStatefulMaterialShapeDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
        AlwaysStatefulMaterialShapeDrawable(com.google.android.material.shape.ShapeAppearanceModel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    FloatingActionButtonImplLollipop(com.google.android.material.floatingactionbutton.FloatingActionButton r1, com.google.android.material.shadow.ShadowViewDelegate r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    private android.animation.StateListAnimator createDefaultStateListAnimator(float r9, float r10, float r11) {
            r8 = this;
            android.animation.StateListAnimator r0 = new android.animation.StateListAnimator
            r0.<init>()
            int[] r1 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.PRESSED_ENABLED_STATE_SET
            android.animation.Animator r11 = r8.createElevationAnimator(r9, r11)
            r0.addState(r1, r11)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.FOCUSED_ENABLED_STATE_SET
            android.animation.Animator r1 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r1)
            int[] r11 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.HOVERED_ENABLED_STATE_SET
            android.animation.Animator r10 = r8.createElevationAnimator(r9, r10)
            r0.addState(r11, r10)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r8.view
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r9
            java.lang.String r9 = "elevation"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r9, r3)
            r5 = 0
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            r5 = 100
            if (r9 < r1) goto L6d
            r1 = 24
            if (r9 > r1) goto L6d
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.view
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float r3 = r9.getTranslationZ()
            float[] r7 = new float[r2]
            r7[r4] = r3
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r7)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
        L6d:
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = r8.view
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r3 = 0
            r2[r4] = r3
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r1, r2)
            android.animation.ObjectAnimator r9 = r9.setDuration(r5)
            r11.add(r9)
            android.animation.Animator[] r9 = new android.animation.Animator[r4]
            java.lang.Object[] r9 = r11.toArray(r9)
            android.animation.Animator[] r9 = (android.animation.Animator[]) r9
            r10.playSequentially(r9)
            android.animation.TimeInterpolator r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR
            r10.setInterpolator(r9)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ENABLED_STATE_SET
            r0.addState(r9, r10)
            int[] r9 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.EMPTY_STATE_SET
            android.animation.Animator r10 = r8.createElevationAnimator(r3, r3)
            r0.addState(r9, r10)
            return r0
    }

    @androidx.annotation.NonNull
    private android.animation.Animator createElevationAnimator(float r8, float r9) {
            r7 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r7.view
            r2 = 1
            float[] r3 = new float[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r8, r3)
            r5 = 0
            android.animation.ObjectAnimator r8 = r8.setDuration(r5)
            android.animation.AnimatorSet$Builder r8 = r0.play(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r7.view
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r2]
            r2[r4] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r3, r2)
            r1 = 100
            android.animation.ObjectAnimator r9 = r9.setDuration(r1)
            r8.with(r9)
            android.animation.TimeInterpolator r8 = com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ELEVATION_ANIM_INTERPOLATOR
            r0.setInterpolator(r8)
            return r0
    }

    @androidx.annotation.NonNull
    com.google.android.material.floatingactionbutton.BorderDrawable createBorderDrawable(int r7, android.content.res.ColorStateList r8) {
            r6 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r6.view
            android.content.Context r0 = r0.getContext()
            com.google.android.material.floatingactionbutton.BorderDrawable r1 = new com.google.android.material.floatingactionbutton.BorderDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r6.shapeAppearance
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = (com.google.android.material.shape.ShapeAppearanceModel) r2
            r1.<init>(r2)
            int r2 = com.google.android.material.R.color.design_fab_stroke_top_outer_color
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            int r3 = com.google.android.material.R.color.design_fab_stroke_top_inner_color
            int r3 = androidx.core.content.ContextCompat.getColor(r0, r3)
            int r4 = com.google.android.material.R.color.design_fab_stroke_end_inner_color
            int r4 = androidx.core.content.ContextCompat.getColor(r0, r4)
            int r5 = com.google.android.material.R.color.design_fab_stroke_end_outer_color
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r5)
            r1.setGradientColors(r2, r3, r4, r0)
            float r7 = (float) r7
            r1.setBorderWidth(r7)
            r1.setBorderTint(r8)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    @androidx.annotation.NonNull
    com.google.android.material.shape.MaterialShapeDrawable createShapeDrawable() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearance
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = (com.google.android.material.shape.ShapeAppearanceModel) r0
            com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable r1 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop$AlwaysStatefulMaterialShapeDrawable
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public float getElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.view
            float r0 = r0.getElevation()
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void getPadding(@androidx.annotation.NonNull android.graphics.Rect r3) {
            r2 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r2.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 == 0) goto Lc
            super.getPadding(r3)
            return
        Lc:
            boolean r0 = r2.shouldExpandBoundsForA11y()
            if (r0 != 0) goto L21
            int r0 = r2.minTouchTargetSize
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.view
            int r1 = r1.getSizeDimension()
            int r0 = r0 - r1
            int r0 = r0 / 2
            r3.set(r0, r0, r0, r0)
            return
        L21:
            r0 = 0
            r3.set(r0, r0, r0, r0)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void initializeBackgroundDrawable(android.content.res.ColorStateList r4, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r5, android.content.res.ColorStateList r6, int r7) {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.createShapeDrawable()
            r3.shapeDrawable = r0
            r0.setTintList(r4)
            if (r5 == 0) goto L10
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.shapeDrawable
            r0.setTintMode(r5)
        L10:
            com.google.android.material.shape.MaterialShapeDrawable r5 = r3.shapeDrawable
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.view
            android.content.Context r0 = r0.getContext()
            r5.initializeElevationOverlay(r0)
            r5 = 0
            if (r7 <= 0) goto L43
            com.google.android.material.floatingactionbutton.BorderDrawable r4 = r3.createBorderDrawable(r7, r4)
            r3.borderDrawable = r4
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            com.google.android.material.floatingactionbutton.BorderDrawable r7 = r3.borderDrawable
            java.lang.Object r7 = androidx.core.util.Preconditions.checkNotNull(r7)
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.shapeDrawable
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r0
            r4.<init>(r1)
            goto L47
        L43:
            r3.borderDrawable = r5
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.shapeDrawable
        L47:
            android.graphics.drawable.RippleDrawable r7 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r6 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r6)
            r7.<init>(r6, r4, r5)
            r3.rippleDrawable = r7
            r3.contentBackground = r7
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void jumpDrawableToCurrentState() {
            r0 = this;
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onCompatShadowChanged() {
            r0 = this;
            r0.updatePadding()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onDrawableStateChanged(int[] r3) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 != r0) goto L4f
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            boolean r3 = r3.isEnabled()
            r0 = 0
            if (r3 == 0) goto L45
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            float r1 = r2.elevation
            r3.setElevation(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            boolean r3 = r3.isPressed()
            if (r3 == 0) goto L26
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            float r0 = r2.pressedTranslationZ
            r3.setTranslationZ(r0)
            return
        L26:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            boolean r3 = r3.isFocused()
            if (r3 != 0) goto L3d
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L37
            goto L3d
        L37:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            r3.setTranslationZ(r0)
            return
        L3d:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            float r0 = r2.hoveredFocusedTranslationZ
            r3.setTranslationZ(r0)
            return
        L45:
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            r3.setElevation(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            r3.setTranslationZ(r0)
        L4f:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void onElevationsChanged(float r3, float r4, float r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 != r1) goto Lc
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r2.view
            r3.refreshDrawableState()
            goto L21
        Lc:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.view
            android.animation.StateListAnimator r0 = r0.getStateListAnimator()
            android.animation.StateListAnimator r1 = r2.stateListAnimator
            if (r0 != r1) goto L21
            android.animation.StateListAnimator r3 = r2.createDefaultStateListAnimator(r3, r4, r5)
            r2.stateListAnimator = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r2.view
            r4.setStateListAnimator(r3)
        L21:
            boolean r3 = r2.shouldAddPadding()
            if (r3 == 0) goto L2a
            r2.updatePadding()
        L2a:
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    boolean requirePreDrawListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void setRippleColor(@androidx.annotation.Nullable android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.rippleDrawable
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L10
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            android.content.res.ColorStateList r3 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r3)
            r0.setColor(r3)
            return
        L10:
            super.setRippleColor(r3)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    boolean shouldAddPadding() {
            r1 = this;
            com.google.android.material.shadow.ShadowViewDelegate r0 = r1.shadowViewDelegate
            boolean r0 = r0.isCompatPaddingEnabled()
            if (r0 != 0) goto L11
            boolean r0 = r1.shouldExpandBoundsForA11y()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    void updateFromViewRotation() {
            r0 = this;
            return
    }
}
