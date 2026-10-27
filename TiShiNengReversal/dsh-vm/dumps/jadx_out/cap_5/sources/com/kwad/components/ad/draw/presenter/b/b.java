package com.kwad.components.ad.draw.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.draw.b.a {
    private android.view.ViewGroup dN;
    private com.kwad.components.ad.draw.presenter.b.a.InterfaceC0011a eH;
    private com.kwad.components.ad.draw.view.playcard.DrawCardApp eK;
    private com.kwad.components.ad.draw.view.playcard.DrawCardH5 eL;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;




    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.b.b$1 r0 = new com.kwad.components.ad.draw.presenter.b.b$1
            r0.<init>(r1)
            r1.eH = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.presenter.b.b r0) {
            r0.aV()
            return
    }

    private void aV() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto Lc
            r1.aX()
            return
        Lc:
            r1.aY()
            return
    }

    private void aX() {
            r3 = this;
            android.view.ViewGroup r0 = r3.dN
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = r3.eK
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.ad.draw.presenter.b.b$2 r2 = new com.kwad.components.ad.draw.presenter.b.b$2
            r2.<init>(r3)
            r0.a(r1, r2)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = r3.eK
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = r3.eK
            r0.bT()
            return
    }

    private void aY() {
            r3 = this;
            android.view.ViewGroup r0 = r3.dN
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = r3.eL
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.ad.draw.presenter.b.b$3 r2 = new com.kwad.components.ad.draw.presenter.b.b$3
            r2.<init>(r3)
            r0.a(r1, r2)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = r3.eL
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = r3.eL
            r0.bT()
            return
    }

    private void aZ() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.components.ad.draw.b.b r1 = r3.dz
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            r2 = 29
            com.kwad.sdk.core.adlog.c.a(r0, r2, r1)
            com.kwad.components.ad.draw.b.b r0 = r3.dz
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r0.dh
            if (r0 == 0) goto L18
            r0.onAdClicked()
        L18:
            return
    }

    static /* synthetic */ android.view.ViewGroup b(com.kwad.components.ad.draw.presenter.b.b r0) {
            android.view.ViewGroup r0 = r0.dN
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.draw.presenter.b.b r0) {
            r0.aZ()
            return
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.presenter.b.a r0 = r0.dE
            com.kwad.components.ad.draw.presenter.b.a$a r1 = r2.eH
            r0.a(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = r2.eK
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = r2.eL
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_container
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.dN = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_app_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = (com.kwad.components.ad.draw.view.playcard.DrawCardApp) r0
            r1.eK = r0
            int r0 = com.kwad.sdk.R.id.ksad_card_h5_container
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = (com.kwad.components.ad.draw.view.playcard.DrawCardH5) r0
            r1.eL = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.draw.view.playcard.DrawCardApp r0 = r2.eK
            r0.release()
            com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0 = r2.eL
            r0.release()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.presenter.b.a r0 = r0.dE
            r1 = 0
            r0.a(r1)
            return
    }
}
