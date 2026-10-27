package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.widget.d {
    private android.view.View FU;
    private boolean FV;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r5) {
            r4 = this;
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r1 = 53
            r2 = 2
            r3 = 1
            r0.c(r3, r5, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            if (r0 != 0) goto L8
            goto L36
        L8:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            r3.FV = r0
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.components.ad.splashscreen.h.n(r0)
            android.view.View r1 = r3.FU
            if (r0 == 0) goto L22
            r2 = 0
            goto L24
        L22:
            r2 = 8
        L24:
            r1.setVisibility(r2)
            if (r0 == 0) goto L36
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.View r1 = r3.FU
            android.content.Context r1 = r1.getContext()
            android.view.View r2 = r3.FU
            r0.<init>(r1, r2, r3)
        L36:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSlide: enableSlickClick: "
            r0.<init>(r1)
            boolean r1 = r4.FV
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FullScreenTouchConvertPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r4.FV
            if (r0 != 0) goto L1a
            return
        L1a:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r1 = 153(0x99, float:2.14E-43)
            r2 = 2
            r3 = 1
            r0.c(r3, r5, r1, r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_splash_actionbar_full_screen
            android.view.View r0 = r1.findViewById(r0)
            r1.FU = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
