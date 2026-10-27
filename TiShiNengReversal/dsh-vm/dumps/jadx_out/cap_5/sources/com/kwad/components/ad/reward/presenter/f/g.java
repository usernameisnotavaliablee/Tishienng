package com.kwad.components.ad.reward.presenter.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class g extends com.kwad.components.ad.reward.presenter.f.d {
    public com.kwad.sdk.widget.KSFrameLayout zX;

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void a(android.widget.FrameLayout r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public android.widget.FrameLayout getTKContainer() {
            r3 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r3.zX
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.iX()
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r3.zX = r0
            if (r0 != 0) goto L3d
            com.kwad.sdk.widget.KSFrameLayout r0 = new com.kwad.sdk.widget.KSFrameLayout
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.zX = r0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r1 = 17
            r0.gravity = r1
            com.kwad.sdk.widget.KSFrameLayout r1 = r3.zX
            r3.a(r1)
            android.view.View r1 = r3.getRootView()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            com.kwad.sdk.widget.KSFrameLayout r2 = r3.zX
            r1.addView(r2, r0)
        L3d:
            com.kwad.sdk.widget.KSFrameLayout r0 = r3.zX
            return r0
    }

    @androidx.annotation.IdRes
    protected abstract int iX();
}
