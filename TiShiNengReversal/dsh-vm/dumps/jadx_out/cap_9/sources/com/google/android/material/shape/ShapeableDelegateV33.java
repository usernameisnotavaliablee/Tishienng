package com.google.android.material.shape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(33)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ShapeableDelegateV33 extends com.google.android.material.shape.ShapeableDelegate {


    ShapeableDelegateV33(@androidx.annotation.NonNull android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.initMaskOutlineProvider(r1)
            return
    }

    @androidx.annotation.DoNotInline
    private void initMaskOutlineProvider(android.view.View r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegateV33$1 r0 = new com.google.android.material.shape.ShapeableDelegateV33$1
            r0.<init>(r1)
            r2.setOutlineProvider(r0)
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            boolean r0 = r1.shouldUseCompatClipping()
            r0 = r0 ^ 1
            r2.setClipToOutline(r0)
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L13
            r2.invalidate()
            return
        L13:
            r2.invalidateOutline()
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            return r0
    }
}
