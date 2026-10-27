package com.kwad.components.ad.reward.presenter.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.f.g implements com.kwad.components.ad.reward.k.a {
    private boolean qS;
    private com.kwad.sdk.core.response.model.AdMatrixInfo.PreLandingPageTKInfo zt;
    private com.kwad.components.core.webview.jshandler.az zu;
    private com.kwad.components.ad.reward.e.g zv;



    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.qS = r0
            com.kwad.components.ad.reward.presenter.e.a$1 r0 = new com.kwad.components.ad.reward.presenter.e.a$1
            r0.<init>(r1)
            r1.zv = r0
            return
    }

    private void T(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "switchPreForm: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKPreFormPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            com.kwad.components.ad.reward.presenter.e.a$2 r1 = new com.kwad.components.ad.reward.presenter.e.a$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g a(com.kwad.components.ad.reward.presenter.e.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.e.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.ad.reward.presenter.e.a r0) {
            r0.jS()
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout d(com.kwad.components.ad.reward.presenter.e.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout e(com.kwad.components.ad.reward.presenter.e.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az f(com.kwad.components.ad.reward.presenter.e.a r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.zu
            return r0
    }

    private void jS() {
            r2 = this;
            boolean r0 = r2.qS
            if (r0 == 0) goto L2e
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r0 = r2.zt
            if (r0 != 0) goto L9
            goto L2e
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleToSkip handleToPlayEnd isPlayEndShow: "
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r1 = r2.zt
            boolean r1 = r1.isPlayEndShow()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKPreFormPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r0 = r2.zt
            boolean r0 = r0.isPlayEndShow()
            if (r0 == 0) goto L2e
            r0 = 1
            r2.T(r0)
        L2e:
            return
    }

    private void jT() {
            r2 = this;
            boolean r0 = r2.qS
            if (r0 == 0) goto L2e
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r0 = r2.zt
            if (r0 != 0) goto L9
            goto L2e
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleToSkip mPreLandingPageData isSkipShow: "
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r1 = r2.zt
            boolean r1 = r1.isSkipShow()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TKPreFormPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r0 = r2.zt
            boolean r0 = r0.isSkipShow()
            if (r0 == 0) goto L2e
            r0 = 1
            r2.T(r0)
        L2e:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.g
    public final void a(android.widget.FrameLayout r2) {
            r1 = this;
            r0 = 4
            r2.setVisibility(r0)
            r0 = 0
            r2.setClickable(r0)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.content.Context r1 = r3.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenWidth(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r4.width = r1
            android.content.Context r1 = r3.getContext()
            int r1 = com.kwad.sdk.utils.br.getScreenHeight(r1)
            float r1 = (float) r1
            float r1 = r1 / r0
            float r1 = r1 + r2
            int r0 = (int) r1
            r4.height = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            super.a(r1)
            r0.zu = r1
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r3) {
            r2 = this;
            super.a(r3)
            r3 = 0
            r2.qS = r3
            java.lang.String r0 = "TKPreFormPresenter"
            java.lang.String r1 = "onTkLoadFailed"
            com.kwad.sdk.core.d.c.d(r0, r1)
            r2.T(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$PreLandingPageTKInfo r0 = com.kwad.sdk.core.response.b.b.dB(r0)
            r2.zt = r0
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.zv
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            super.az()
            java.lang.String r0 = "TKPreFormPresenter"
            java.lang.String r1 = "onTkLoadSuccess"
            com.kwad.sdk.core.d.c.d(r0, r1)
            r0 = 1
            r2.qS = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_pre_landing_page"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dT(r0)
            return r0
    }

    public final com.kwad.components.ad.reward.page.BackPressHandleResult hx() {
            r1 = this;
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            if (r0 == 0) goto L19
            com.kwad.sdk.widget.KSFrameLayout r0 = r1.zX
            if (r0 != 0) goto L9
            goto L19
        L9:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L16
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            return r0
        L16:
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED
            return r0
        L19:
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.g
    public final int iX() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_pre_form_card
            return r0
    }

    @Override // com.kwad.components.ad.reward.k.a
    public final void jU() {
            r2 = this;
            java.lang.String r0 = "TKPreFormPresenter"
            java.lang.String r1 = "onPlayComplete: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            r2.jS()
            return
    }

    @Override // com.kwad.components.ad.reward.k.a
    public final void jV() {
            r2 = this;
            java.lang.String r0 = "TKPreFormPresenter"
            java.lang.String r1 = "onSkipClick: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            r2.jT()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.zv
            r0.c(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.b(r2)
            return
    }
}
