package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ShapeableDelegateV14 extends com.google.android.material.shape.ShapeableDelegate {
    ShapeableDelegateV14() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            if (r0 == 0) goto L16
            android.graphics.RectF r0 = r1.maskBounds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L16
            r2.invalidate()
        L16:
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
            r1 = this;
            r0 = 1
            return r0
    }
}
