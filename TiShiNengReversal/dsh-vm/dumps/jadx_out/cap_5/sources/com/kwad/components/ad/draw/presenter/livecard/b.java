package com.kwad.components.ad.draw.presenter.livecard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.draw.b.a implements android.view.View.OnClickListener {
    private com.kwad.components.offline.api.core.adlive.IAdLivePlayModule dC;
    private com.kwad.sdk.widget.KSFrameLayout ec;
    private com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView ed;
    private android.widget.TextView ee;
    private android.widget.TextView ef;
    private android.widget.TextView eg;
    private final com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener eh;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.livecard.b$1 r0 = new com.kwad.components.ad.draw.presenter.livecard.b$1
            r0.<init>(r1)
            r1.eh = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout a(com.kwad.components.ad.draw.presenter.livecard.b r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.ec
            return r0
    }

    private void aS() {
            r2 = this;
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r2.eh
            r0.registerAdLivePlayStateListener(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ec
            r0.setOnClickListener(r2)
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = r2.ed
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.ef
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.eg
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.ee
            r0.setOnClickListener(r2)
            return
    }

    private void initView() {
            r2 = this;
            int r0 = com.kwad.sdk.R.id.ksad_draw_live_end
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = (com.kwad.sdk.widget.KSFrameLayout) r0
            r2.ec = r0
            int r1 = com.kwad.sdk.R.id.ksad_draw_author_icon
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = (com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView) r0
            r2.ed = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ec
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_end_app_name
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ee = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ec
            int r1 = com.kwad.sdk.R.id.ksad_live_actionbar_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.eg = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ec
            int r1 = com.kwad.sdk.R.id.ksad_draw_live_end_text
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ef = r0
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = r2.ed
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.j(r1)
            android.widget.TextView r0 = r2.ee
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.cl(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r2.ef
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r2.eg
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aE(r1)
            r0.setText(r1)
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.ec
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r1 = r0.dC
            r2.dC = r1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            if (r0 != 0) goto L18
            return
        L18:
            r2.initView()
            r2.aS()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r4.ec
            boolean r0 = r5.equals(r0)
            r1 = 2
            if (r0 == 0) goto L15
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 53
            r0.a(r1, r5, r2, r1)
            return
        L15:
            com.kwad.components.ad.draw.presenter.livecard.KsLiveAuthorView r0 = r4.ed
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 15
            r0.a(r1, r5, r2, r1)
            return
        L29:
            android.widget.TextView r0 = r4.ef
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3d
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 17
            r0.a(r1, r5, r2, r1)
            return
        L3d:
            android.widget.TextView r0 = r4.ee
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L51
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 16
            r0.a(r1, r5, r2, r1)
            return
        L51:
            android.widget.TextView r0 = r4.eg
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L65
            com.kwad.components.ad.draw.b.b r0 = r4.dz
            android.content.Context r5 = r5.getContext()
            r2 = 26
            r3 = 1
            r0.a(r1, r5, r2, r3)
        L65:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r0 = r2.dC
            if (r0 != 0) goto L8
            return
        L8:
            com.kwad.components.offline.api.core.adlive.listener.AdLivePlayStateListener r1 = r2.eh
            r0.unRegisterAdLivePlayStateListener(r1)
            return
    }
}
