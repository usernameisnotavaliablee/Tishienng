package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(22)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ShapeableDelegateV22 extends com.google.android.material.shape.ShapeableDelegate {
    private boolean canUseViewOutline;
    private float cornerRadius;


    ShapeableDelegateV22(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.canUseViewOutline = r0
            r0 = 0
            r1.cornerRadius = r0
            r1.initMaskOutlineProvider(r2)
            return
    }

    static /* synthetic */ float access$000(com.google.android.material.shape.ShapeableDelegateV22 r0) {
            float r0 = r0.cornerRadius
            return r0
    }

    private float getDefaultCornerRadius() {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            if (r0 == 0) goto L10
            android.graphics.RectF r1 = r2.maskBounds
            if (r1 != 0) goto L9
            goto L10
        L9:
            com.google.android.material.shape.CornerSize r0 = r0.topRightCornerSize
            float r0 = r0.getCornerSize(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @androidx.annotation.DoNotInline
    private void initMaskOutlineProvider(android.view.View r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegateV22$1 r0 = new com.google.android.material.shape.ShapeableDelegateV22$1
            r0.<init>(r1)
            r2.setOutlineProvider(r0)
            return
    }

    private boolean isShapeRoundRect() {
            r2 = this;
            android.graphics.RectF r0 = r2.maskBounds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            android.graphics.RectF r1 = r2.maskBounds
            boolean r0 = r0.isRoundRect(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    private boolean offsetZeroCornerEdgeBoundsIfPossible() {
            r8 = this;
            android.graphics.RectF r0 = r8.maskBounds
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto Lc7
            com.google.android.material.shape.ShapeAppearanceModel r0 = r8.shapeAppearanceModel
            if (r0 == 0) goto Lc7
            boolean r2 = r8.offsetZeroCornerEdgeBoundsEnabled
            if (r2 == 0) goto Lc7
            android.graphics.RectF r2 = r8.maskBounds
            boolean r0 = r0.isRoundRect(r2)
            if (r0 != 0) goto Lc7
            com.google.android.material.shape.ShapeAppearanceModel r0 = r8.shapeAppearanceModel
            boolean r0 = shapeUsesAllRoundedCornerTreatments(r0)
            if (r0 != 0) goto L23
            goto Lc7
        L23:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
            android.graphics.RectF r2 = r8.maskBounds
            float r0 = r0.getCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r2 = r2.getTopRightCornerSize()
            android.graphics.RectF r3 = r8.maskBounds
            float r2 = r2.getCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r3 = r3.getBottomLeftCornerSize()
            android.graphics.RectF r4 = r8.maskBounds
            float r3 = r3.getCornerSize(r4)
            com.google.android.material.shape.ShapeAppearanceModel r4 = r8.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r4 = r4.getBottomRightCornerSize()
            android.graphics.RectF r5 = r8.maskBounds
            float r4 = r4.getCornerSize(r5)
            r5 = 0
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 != 0) goto L71
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L71
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L71
            android.graphics.RectF r0 = r8.maskBounds
            float r1 = r0.left
            float r1 = r1 - r2
            float r3 = r0.top
            float r4 = r0.right
            float r5 = r0.bottom
            r0.set(r1, r3, r4, r5)
            r8.cornerRadius = r2
            goto Lc5
        L71:
            if (r6 != 0) goto L8c
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 != 0) goto L8c
            int r6 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r6 != 0) goto L8c
            android.graphics.RectF r0 = r8.maskBounds
            float r1 = r0.left
            float r2 = r0.top
            float r2 = r2 - r3
            float r4 = r0.right
            float r5 = r0.bottom
            r0.set(r1, r2, r4, r5)
            r8.cornerRadius = r3
            goto Lc5
        L8c:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 != 0) goto La9
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 != 0) goto La9
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto La9
            android.graphics.RectF r1 = r8.maskBounds
            float r2 = r1.left
            float r3 = r1.top
            float r4 = r1.right
            float r4 = r4 + r0
            float r5 = r1.bottom
            r1.set(r2, r3, r4, r5)
            r8.cornerRadius = r0
            goto Lc5
        La9:
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lc7
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 != 0) goto Lc7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc7
            android.graphics.RectF r1 = r8.maskBounds
            float r2 = r1.left
            float r3 = r1.top
            float r4 = r1.right
            float r5 = r1.bottom
            float r5 = r5 + r0
            r1.set(r2, r3, r4, r5)
            r8.cornerRadius = r0
        Lc5:
            r0 = 1
            return r0
        Lc7:
            return r1
    }

    private static boolean shapeUsesAllRoundedCornerTreatments(com.google.android.material.shape.ShapeAppearanceModel r1) {
            com.google.android.material.shape.CornerTreatment r0 = r1.getTopLeftCorner()
            boolean r0 = r0 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto L22
            com.google.android.material.shape.CornerTreatment r0 = r1.getTopRightCorner()
            boolean r0 = r0 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto L22
            com.google.android.material.shape.CornerTreatment r0 = r1.getBottomLeftCorner()
            boolean r0 = r0 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r0 == 0) goto L22
            com.google.android.material.shape.CornerTreatment r1 = r1.getBottomRightCorner()
            boolean r1 = r1 instanceof com.google.android.material.shape.RoundedCornerTreatment
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    @androidx.annotation.VisibleForTesting
    float getCornerRadius() {
            r1 = this;
            float r0 = r1.cornerRadius
            return r0
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            float r0 = r2.getDefaultCornerRadius()
            r2.cornerRadius = r0
            boolean r0 = r2.isShapeRoundRect()
            r1 = 1
            if (r0 != 0) goto L16
            boolean r0 = r2.offsetZeroCornerEdgeBoundsIfPossible()
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            r2.canUseViewOutline = r0
            boolean r0 = r2.shouldUseCompatClipping()
            r0 = r0 ^ r1
            r3.setClipToOutline(r0)
            boolean r0 = r2.shouldUseCompatClipping()
            if (r0 == 0) goto L2b
            r3.invalidate()
            return
        L2b:
            r3.invalidateOutline()
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
            r1 = this;
            boolean r0 = r1.canUseViewOutline
            if (r0 == 0) goto Lb
            boolean r0 = r1.forceCompatClippingEnabled
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
