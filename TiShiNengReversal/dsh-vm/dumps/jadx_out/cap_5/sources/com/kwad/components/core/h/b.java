package com.kwad.components.core.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.widget.KSFrameLayout {
    private android.widget.ImageView cm;

    public b(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private android.widget.ImageView qk() {
            r2 = this;
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            return r0
    }

    public final void a(java.lang.String r3, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener r4) {
            r2 = this;
            android.widget.ImageView r0 = r2.cm
            if (r0 == 0) goto L9
            com.kwad.sdk.core.imageloader.ImageLoaderProxy r1 = com.kwad.sdk.core.imageloader.ImageLoaderProxy.INSTANCE
            r1.load(r0, r3, r4)
        L9:
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void init(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            super.init(r1, r2)
            android.widget.ImageView r1 = r0.qk()
            r0.cm = r1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r2 = 17
            r1.gravity = r2
            android.widget.ImageView r2 = r0.cm
            r0.addView(r2, r1)
            return
    }

    public final void setImageGravity(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.cm
            if (r0 == 0) goto L13
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            if (r0 == 0) goto L13
            r0.gravity = r2
            android.widget.ImageView r2 = r1.cm
            r2.setLayoutParams(r0)
        L13:
            return
    }

    public final void setImageScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.cm
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.setScaleType(r2)
        L9:
            return
    }
}
