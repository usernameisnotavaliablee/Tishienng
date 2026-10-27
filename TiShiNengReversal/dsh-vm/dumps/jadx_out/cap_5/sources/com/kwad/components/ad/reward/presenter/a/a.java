package com.kwad.components.ad.reward.presenter.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.f.g implements com.kwad.components.core.webview.tachikoma.j {
    private com.kwad.components.core.webview.tachikoma.i fU;
    private final com.kwad.components.core.video.m jE;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private long xc;
    private long xd;
    private boolean xe;
    private boolean xf;
    private com.kwad.components.ad.reward.g.b xg;




    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.a.a$1 r0 = new com.kwad.components.ad.reward.presenter.a.a$1
            r0.<init>(r1)
            r1.xg = r0
            com.kwad.components.ad.reward.presenter.a.a$2 r0 = new com.kwad.components.ad.reward.presenter.a.a$2
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout a(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.a.a r0, boolean r1) {
            r1 = 1
            r0.xe = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout b(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo c(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ long d(com.kwad.components.ad.reward.presenter.a.a r2) {
            long r0 = r2.xc
            return r0
    }

    static /* synthetic */ long e(com.kwad.components.ad.reward.presenter.a.a r2) {
            long r0 = r2.xd
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.reward.presenter.a.a r0) {
            boolean r0 = r0.xe
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g g(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g h(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.i i(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.components.core.webview.tachikoma.i r0 = r0.fU
            return r0
    }

    private com.kwad.components.core.webview.tachikoma.i iY() {
            r4 = this;
            com.kwad.components.core.webview.tachikoma.i r0 = new com.kwad.components.core.webview.tachikoma.i
            r1 = -1
            android.content.Context r3 = r4.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g j(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g k(com.kwad.components.ad.reward.presenter.a.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
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
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            java.lang.String r2 = "TkRewardInteractPresenter"
            java.lang.String r0 = "onTkLoadFailed: "
            com.kwad.sdk.core.d.c.d(r2, r0)
            com.kwad.sdk.widget.KSFrameLayout r2 = r1.zX
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.o r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.p r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.n r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.u r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r2) {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            if (r2 == 0) goto La
            boolean r2 = r2.interactSuccess
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r0.rV = r2
            if (r2 == 0) goto L14
            com.kwad.components.ad.reward.m.e r2 = r0.rE
            r2.kT()
        L14:
            boolean r2 = r1.xf
            if (r2 == 0) goto L29
            com.kwad.sdk.widget.KSFrameLayout r2 = r1.zX
            r0 = 30
            boolean r2 = com.kwad.sdk.utils.bz.o(r2, r0)
            if (r2 == 0) goto L29
            com.kwad.components.ad.reward.g r2 = r1.tm
            com.kwad.components.ad.reward.m.e r2 = r2.rE
            r2.resume()
        L29:
            com.kwad.sdk.widget.KSFrameLayout r2 = r1.zX
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r9, com.kwad.sdk.core.webview.b r10) {
            r8 = this;
            com.kwad.components.ad.reward.k.q r0 = new com.kwad.components.ad.reward.k.q
            com.kwad.components.ad.reward.g r3 = r8.tm
            com.kwad.components.core.e.d.c r2 = r3.mApkDownloadHelper
            com.kwad.components.ad.reward.presenter.a.a$3 r6 = new com.kwad.components.ad.reward.presenter.a.a$3
            r6.<init>(r8)
            r7 = 0
            r4 = -1
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r9.c(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void aA() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.core.webview.tachikoma.i r0 = r4.fU
            if (r0 != 0) goto Ld
            com.kwad.components.core.webview.tachikoma.i r0 = r4.iY()
            r4.fU = r0
        Ld:
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            int r0 = com.kwad.sdk.core.response.b.a.aJ(r0)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.xc = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aK(r0)
            long r0 = (long) r0
            long r0 = r0 * r2
            r4.xd = r0
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r4.jE
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.g$b r1 = r4.xg
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            java.lang.String r0 = "TkRewardInteractPresenter"
            java.lang.String r1 = "onTkLoadSuccess: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            r2.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 == 0) goto L27
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            android.content.Context r0 = r0.mContext
            com.kwad.components.ad.reward.d.a.S(r0)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            r0.pause()
            r0 = 1
            r2.xf = r0
        L27:
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
            java.lang.String r0 = "tk_reward_interact_card"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dR(r0)
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final com.kwad.sdk.widget.g getTouchCoordsView() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.g
    public final int iX() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_js_interact
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.g$b r1 = r2.xg
            r0.b(r1)
            com.kwad.components.core.webview.tachikoma.i r0 = r2.fU
            r0.kz()
            r0 = 0
            r2.fU = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 8
            r0.setVisibility(r1)
            r0 = 0
            r2.xe = r0
            r2.xf = r0
            return
    }
}
