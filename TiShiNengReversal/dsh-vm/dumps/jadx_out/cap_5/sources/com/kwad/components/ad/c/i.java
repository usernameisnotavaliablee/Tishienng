package com.kwad.components.ad.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i extends com.kwad.components.core.m.c<com.kwad.components.ad.c.b> {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bJ;
    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> bK;
    private com.kwad.sdk.api.KsBannerAd.BannerAdInteractionListener bL;
    private com.kwad.components.ad.c.d bM;
    private com.kwad.components.ad.c.f ce;
    private android.content.Context context;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.internal.api.SceneImpl mAdScene;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    public i(android.content.Context r1, com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.sdk.api.KsAdVideoPlayConfig r3) {
            r0 = this;
            r0.<init>(r1)
            r0.context = r1
            r0.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r2)
            r0.mAdTemplate = r1
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.mAdScene
            r0.mAdScene = r1
            com.kwad.sdk.core.response.model.AdResultData r1 = r0.mAdResultData
            java.util.List r1 = r1.getAdTemplateList()
            r0.bK = r1
            r0.bJ = r3
            r0.qs()
            return
    }

    private static com.kwad.sdk.mvp.Presenter a(android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.b.e.el(r2)
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            boolean r2 = com.kwad.components.ad.c.b.a(r2)
            if (r2 == 0) goto L17
            com.kwad.components.ad.c.d.a r2 = new com.kwad.components.ad.c.d.a
            r2.<init>(r1)
            r0.a(r2)
            return r0
        L17:
            com.kwad.components.ad.c.c.c r1 = new com.kwad.components.ad.c.c.c
            r1.<init>()
            r0.a(r1)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.mvp.Presenter a(com.kwad.components.ad.c.i r0) {
            com.kwad.sdk.mvp.Presenter r0 = r0.mPresenter
            return r0
    }

    private com.kwad.components.ad.c.b aj() {
            r3 = this;
            com.kwad.components.ad.c.f r0 = new com.kwad.components.ad.c.f
            android.view.ViewGroup r1 = r3.nY
            com.kwad.sdk.core.response.model.AdInfo r2 = r3.mAdInfo
            int r2 = com.kwad.sdk.core.response.b.a.cG(r2)
            r0.<init>(r1, r2)
            r3.ce = r0
            r0.wi()
            com.kwad.components.ad.c.b r0 = new com.kwad.components.ad.c.b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData
            r0.a(r1)
            com.kwad.sdk.api.KsBannerAd$BannerAdInteractionListener r1 = r3.bL
            r0.a(r1)
            com.kwad.components.ad.c.d r1 = r3.bM
            r0.setBannerUpdateAdResultDataListener(r1)
            com.kwad.sdk.internal.api.SceneImpl r1 = r3.mAdScene
            r0.mAdScene = r1
            int r1 = com.kwad.sdk.R.id.ksad_banner_base_content
            android.view.View r1 = r3.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.bH = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = c(r1)
            r0.bN = r1
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r3.bK
            r0.bK = r1
            android.content.Context r1 = r3.context
            r0.mContext = r1
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r3.bJ
            r0.bJ = r1
            com.kwad.components.ad.c.i$1 r1 = new com.kwad.components.ad.c.i$1
            r1.<init>(r3)
            r0.a(r1)
            return r0
    }

    private static com.kwad.components.offline.api.tk.model.StyleTemplate c(com.kwad.sdk.core.response.model.AdTemplate r3) {
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dM(r3)
            com.kwad.sdk.core.response.model.AdMatrixInfo$MatrixTemplate r3 = com.kwad.sdk.core.response.b.b.k(r3, r0)
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = new com.kwad.components.offline.api.tk.model.StyleTemplate
            r0.<init>()
            if (r3 == 0) goto L20
            java.lang.String r1 = r3.templateId
            r0.templateId = r1
            java.lang.String r1 = r3.templateMd5
            r0.templateMd5 = r1
            java.lang.String r1 = r3.templateUrl
            r0.templateUrl = r1
            long r1 = r3.templateVersionCode
            int r3 = (int) r1
            r0.templateVersionCode = r3
        L20:
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final boolean ai() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void ak() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.m.c
    public final /* synthetic */ com.kwad.components.ad.c.b al() {
            r1 = this;
            com.kwad.components.ad.c.b r0 = r1.aj()
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_banner_base
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void initData() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mAdInfo = r0
            return
    }

    @Override // com.kwad.components.core.m.c
    @androidx.annotation.NonNull
    public final com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.mvp.Presenter r0 = a(r0, r1)
            return r0
    }

    public final void setBannerAdListener(com.kwad.sdk.api.KsBannerAd.BannerAdInteractionListener r1) {
            r0 = this;
            r0.bL = r1
            return
    }

    public final void setBannerUpdateAdResultDataListener(com.kwad.components.ad.c.d r1) {
            r0 = this;
            r0.bM = r1
            return
    }
}
