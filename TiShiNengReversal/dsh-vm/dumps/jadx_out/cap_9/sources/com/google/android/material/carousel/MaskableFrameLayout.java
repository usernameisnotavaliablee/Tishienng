package com.google.android.material.carousel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class MaskableFrameLayout extends android.widget.FrameLayout implements com.google.android.material.carousel.Maskable, com.google.android.material.shape.Shapeable {
    private final android.graphics.RectF maskRect;
    private float maskXPercentage;

    @androidx.annotation.Nullable
    private com.google.android.material.carousel.OnMaskChangedListener onMaskChangedListener;

    @androidx.annotation.Nullable
    private java.lang.Boolean savedForceCompatClippingEnabled;

    @androidx.annotation.NonNull
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private final com.google.android.material.shape.ShapeableDelegate shapeableDelegate;

    public MaskableFrameLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaskableFrameLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MaskableFrameLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.maskXPercentage = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.maskRect = r0
            com.google.android.material.shape.ShapeableDelegate r0 = com.google.android.material.shape.ShapeableDelegate.create(r1)
            r1.shapeableDelegate = r0
            r0 = 0
            r1.savedForceCompatClippingEnabled = r0
            r0 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r2, r3, r4, r0, r0)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            r1.setShapeAppearanceModel(r2)
            return
    }

    public static /* synthetic */ com.google.android.material.shape.CornerSize a(com.google.android.material.shape.CornerSize r1) {
            boolean r0 = r1 instanceof com.google.android.material.shape.AbsoluteCornerSize
            if (r0 == 0) goto La
            com.google.android.material.shape.AbsoluteCornerSize r1 = (com.google.android.material.shape.AbsoluteCornerSize) r1
            com.google.android.material.shape.ClampedCornerSize r1 = com.google.android.material.shape.ClampedCornerSize.createFromCornerSize(r1)
        La:
            return r1
    }

    public static /* synthetic */ void b(com.google.android.material.carousel.MaskableFrameLayout r0, android.graphics.Canvas r1) {
            super.dispatchDraw(r1)
            return
    }

    private void onMaskChanged() {
            r2 = this;
            int r0 = r2.getWidth()
            if (r0 != 0) goto L7
            goto L17
        L7:
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            android.graphics.RectF r1 = r2.maskRect
            r0.onMaskChanged(r2, r1)
            com.google.android.material.carousel.OnMaskChangedListener r0 = r2.onMaskChangedListener
            if (r0 == 0) goto L17
            android.graphics.RectF r1 = r2.maskRect
            r0.onMaskChanged(r1)
        L17:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            com.google.android.material.carousel.b r1 = new com.google.android.material.carousel.b
            r1.<init>(r2)
            r0.maybeClip(r3, r1)
            return
    }

    @Override // com.google.android.material.carousel.Maskable
    @androidx.annotation.NonNull
    public android.graphics.RectF getMaskRectF() {
            r1 = this;
            android.graphics.RectF r0 = r1.maskRect
            return r0
    }

    @Override // com.google.android.material.carousel.Maskable
    @java.lang.Deprecated
    public float getMaskXPercentage() {
            r1 = this;
            float r0 = r1.maskXPercentage
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    @androidx.annotation.NonNull
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.lang.Boolean r0 = r2.savedForceCompatClippingEnabled
            if (r0 == 0) goto L10
            com.google.android.material.shape.ShapeableDelegate r1 = r2.shapeableDelegate
            boolean r0 = r0.booleanValue()
            r1.setForceCompatClippingEnabled(r2, r0)
        L10:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            boolean r0 = r0.isForceCompatClippingEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.savedForceCompatClippingEnabled = r0
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            r1 = 1
            r0.setForceCompatClippingEnabled(r2, r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.onMaskChanged()
            return
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            android.graphics.RectF r0 = r3.maskRect
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            int r0 = r4.getAction()
            if (r0 != 0) goto L20
            float r0 = r4.getX()
            float r1 = r4.getY()
            android.graphics.RectF r2 = r3.maskRect
            boolean r0 = r2.contains(r0, r1)
            if (r0 != 0) goto L20
            r4 = 0
            return r4
        L20:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public void setForceCompatClipping(boolean r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r1.shapeableDelegate
            r0.setForceCompatClippingEnabled(r1, r2)
            return
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@androidx.annotation.NonNull android.graphics.RectF r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.maskRect
            r0.set(r2)
            r1.onMaskChanged()
            return
    }

    @Override // com.google.android.material.carousel.Maskable
    @java.lang.Deprecated
    public void setMaskXPercentage(float r5) {
            r4 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = androidx.core.math.MathUtils.clamp(r5, r0, r1)
            float r2 = r4.maskXPercentage
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L30
            r4.maskXPercentage = r5
            int r5 = r4.getWidth()
            float r5 = (float) r5
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            float r2 = r4.maskXPercentage
            float r5 = com.google.android.material.animation.AnimationUtils.lerp(r0, r5, r0, r1, r2)
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r4.getWidth()
            float r2 = (float) r2
            float r2 = r2 - r5
            int r3 = r4.getHeight()
            float r3 = (float) r3
            r1.<init>(r5, r0, r2, r3)
            r4.setMaskRectF(r1)
        L30:
            return
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@androidx.annotation.Nullable com.google.android.material.carousel.OnMaskChangedListener r1) {
            r0 = this;
            r0.onMaskChangedListener = r1
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.carousel.a r0 = new com.google.android.material.carousel.a
            r0.<init>()
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.withTransformedCornerSizes(r0)
            r1.shapeAppearanceModel = r2
            com.google.android.material.shape.ShapeableDelegate r0 = r1.shapeableDelegate
            r0.onShapeAppearanceChanged(r1, r2)
            return
    }
}
