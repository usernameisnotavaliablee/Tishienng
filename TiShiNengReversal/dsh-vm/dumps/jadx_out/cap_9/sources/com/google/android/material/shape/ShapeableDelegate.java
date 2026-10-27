package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ShapeableDelegate {
    boolean forceCompatClippingEnabled;
    android.graphics.RectF maskBounds;
    boolean offsetZeroCornerEdgeBoundsEnabled;

    @androidx.annotation.Nullable
    com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    final android.graphics.Path shapePath;

    public ShapeableDelegate() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.forceCompatClippingEnabled = r0
            r1.offsetZeroCornerEdgeBoundsEnabled = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.maskBounds = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.shapePath = r0
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.shape.ShapeableDelegate create(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            com.google.android.material.shape.ShapeableDelegateV33 r0 = new com.google.android.material.shape.ShapeableDelegateV33
            r0.<init>(r2)
            return r0
        Lc:
            r1 = 22
            if (r0 < r1) goto L16
            com.google.android.material.shape.ShapeableDelegateV22 r0 = new com.google.android.material.shape.ShapeableDelegateV22
            r0.<init>(r2)
            return r0
        L16:
            com.google.android.material.shape.ShapeableDelegateV14 r2 = new com.google.android.material.shape.ShapeableDelegateV14
            r2.<init>()
            return r2
    }

    private void updateShapePath() {
            r5 = this;
            android.graphics.RectF r0 = r5.maskBounds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            com.google.android.material.shape.ShapeAppearanceModel r0 = r5.shapeAppearanceModel
            if (r0 == 0) goto L1b
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            com.google.android.material.shape.ShapeAppearanceModel r1 = r5.shapeAppearanceModel
            android.graphics.RectF r2 = r5.maskBounds
            android.graphics.Path r3 = r5.shapePath
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.calculatePath(r1, r4, r2, r3)
        L1b:
            return
    }

    abstract void invalidateClippingMethod(@androidx.annotation.NonNull android.view.View r1);

    public boolean isForceCompatClippingEnabled() {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            return r0
    }

    public void maybeClip(@androidx.annotation.NonNull android.graphics.Canvas r2, @androidx.annotation.NonNull com.google.android.material.canvas.CanvasCompat.CanvasOperation r3) {
            r1 = this;
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L1d
            android.graphics.Path r0 = r1.shapePath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            r2.save()
            android.graphics.Path r0 = r1.shapePath
            r2.clipPath(r0)
            r3.run(r2)
            r2.restore()
            return
        L1d:
            r3.run(r2)
            return
    }

    public void onMaskChanged(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.graphics.RectF r2) {
            r0 = this;
            r0.maskBounds = r2
            r0.updateShapePath()
            r0.invalidateClippingMethod(r1)
            return
    }

    public void onShapeAppearanceChanged(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            r0 = this;
            r0.shapeAppearanceModel = r2
            r0.updateShapePath()
            r0.invalidateClippingMethod(r1)
            return
    }

    public void setForceCompatClippingEnabled(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            if (r3 == r0) goto L9
            r1.forceCompatClippingEnabled = r3
            r1.invalidateClippingMethod(r2)
        L9:
            return
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@androidx.annotation.NonNull android.view.View r1, boolean r2) {
            r0 = this;
            r0.offsetZeroCornerEdgeBoundsEnabled = r2
            r0.invalidateClippingMethod(r1)
            return
    }

    abstract boolean shouldUseCompatClipping();
}
