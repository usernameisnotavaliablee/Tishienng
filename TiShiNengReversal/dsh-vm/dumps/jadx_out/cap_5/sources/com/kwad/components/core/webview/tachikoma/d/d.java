package com.kwad.components.core.webview.tachikoma.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.sdk.mvp.Presenter {
    private android.widget.FrameLayout Yp;
    private com.kwad.sdk.components.o Yv;
    private com.kwad.components.core.webview.tachikoma.d.e afi;
    protected com.kwad.components.core.webview.tachikoma.d.b ahp;


    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void at() {
            r5 = this;
            super.at()
            java.lang.Object r0 = r5.NN()
            com.kwad.components.core.webview.tachikoma.d.b r0 = (com.kwad.components.core.webview.tachikoma.d.b) r0
            r5.ahp = r0
            com.kwad.components.core.webview.tachikoma.d.e r0 = r0.afi
            r5.afi = r0
            if (r0 == 0) goto L19
            com.kwad.components.core.webview.tachikoma.d.d$1 r1 = new com.kwad.components.core.webview.tachikoma.d.d$1
            r1.<init>(r5)
            r0.a(r1)
        L19:
            com.kwad.components.core.webview.tachikoma.d.b r0 = r5.ahp
            com.kwad.components.core.webview.tachikoma.k r0 = r0.ahs
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r4 = 0
            r2[r3] = r4
            com.kwad.sdk.components.o r0 = r0.a(r2)
            r5.Yv = r0
            if (r0 != 0) goto L3d
            com.kwad.components.core.webview.tachikoma.d.b r0 = r5.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            r0.callbackPageStatus(r3, r4)
            com.kwad.components.core.webview.tachikoma.d.e r0 = r5.afi
            android.app.Dialog r0 = r0.getDialog()
            r0.dismiss()
            return
        L3d:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            com.kwad.sdk.components.o r2 = r5.Yv
            android.view.View r2 = r2.getView()
            r2.setLayoutParams(r0)
            android.widget.FrameLayout r0 = r5.Yp
            r0.addView(r2)
            com.kwad.sdk.components.o r0 = r5.Yv
            r0.render()
            com.kwad.components.core.webview.tachikoma.d.b r0 = r5.ahp
            com.kwad.sdk.components.l r0 = r0.ahr
            r0.callbackPageStatus(r1, r4)
            return
    }

    public final boolean onBackPressed() {
            r1 = this;
            com.kwad.sdk.components.o r0 = r1.Yv
            if (r0 == 0) goto Lc
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_tk_dialog_container
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.Yp = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
