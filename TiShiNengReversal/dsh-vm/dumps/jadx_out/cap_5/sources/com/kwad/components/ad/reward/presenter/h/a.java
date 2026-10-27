package com.kwad.components.ad.reward.presenter.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.f.g implements com.kwad.components.core.webview.tachikoma.j {
    private boolean Ar;
    private com.kwad.components.core.webview.tachikoma.f As;
    private long At;
    private final com.kwad.components.core.video.m jE;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private final com.kwad.components.core.m.a.a vJ;
    private boolean xe;
    private boolean xf;
    private com.kwad.components.ad.reward.g.b xg;
    private com.kwad.components.ad.reward.k.a.d zF;







    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.h.a$1 r0 = new com.kwad.components.ad.reward.presenter.h.a$1
            r0.<init>(r1)
            r1.xg = r0
            com.kwad.components.ad.reward.presenter.h.a$2 r0 = new com.kwad.components.ad.reward.presenter.h.a$2
            r0.<init>(r1)
            r1.vJ = r0
            com.kwad.components.ad.reward.presenter.h.a$3 r0 = new com.kwad.components.ad.reward.presenter.h.a$3
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout a(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.h.a r0, boolean r1) {
            r0.Ar = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.widget.KSFrameLayout b(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.sdk.widget.KSFrameLayout r0 = r0.zX
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.reward.presenter.h.a r0, boolean r1) {
            r1 = 1
            r0.xe = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.f c(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.core.webview.tachikoma.f r0 = r0.As
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo d(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ android.content.Context e(com.kwad.components.ad.reward.presenter.h.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ long f(com.kwad.components.ad.reward.presenter.h.a r2) {
            long r0 = r2.At
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.ad.reward.presenter.h.a r0) {
            boolean r0 = r0.xe
            return r0
    }

    static /* synthetic */ android.content.Context h(com.kwad.components.ad.reward.presenter.h.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g i(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void iH() {
            r3 = this;
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r0 = com.kwad.components.ad.reward.presenter.i.z(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onPlayCompleted: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "jky"
            com.kwad.sdk.core.d.c.d(r2, r1)
            if (r0 == 0) goto L26
            com.kwad.components.ad.reward.presenter.h.a$6 r0 = new com.kwad.components.ad.reward.presenter.h.a$6
            r0.<init>(r3)
            r1 = 200(0xc8, double:9.9E-322)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            return
        L26:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            if (r0 == 0) goto L2f
            r0.onRewardVerify()
        L2f:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            r0.pause()
            com.kwad.components.ad.reward.g r0 = r3.tm
            r0.gK()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g j(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g k(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void ko() {
            r2 = this;
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            if (r0 == 0) goto Lf
            r0.pause()
        Lf:
            r0 = 1
            r2.xf = r0
            return
    }

    private com.kwad.components.core.webview.tachikoma.f kp() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.h.a$5 r0 = new com.kwad.components.ad.reward.presenter.h.a$5
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.k.a.d l(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.k.a.d r0 = r0.zF
            return r0
    }

    static /* synthetic */ void m(com.kwad.components.ad.reward.presenter.h.a r0) {
            r0.ko()
            return
    }

    static /* synthetic */ android.content.Context n(com.kwad.components.ad.reward.presenter.h.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g o(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g p(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g q(com.kwad.components.ad.reward.presenter.h.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g r(com.kwad.components.ad.reward.presenter.h.a r0) {
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
            java.lang.String r2 = "TkRewardVideoTaskPresenter"
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
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r5) {
            r4 = this;
            com.kwad.components.ad.reward.g r0 = r4.tm
            r1 = 0
            r2 = 1
            if (r5 == 0) goto Lc
            boolean r5 = r5.interactSuccess
            if (r5 == 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            r0.rV = r5
            com.kwad.components.core.r.a r5 = com.kwad.components.core.r.a.sF()
            int r5 = r5.sG()
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.components.ad.reward.m.e r3 = r0.rE
            if (r3 == 0) goto L3b
            boolean r0 = r0.rV
            if (r0 == 0) goto L2a
            r3.kT()
            if (r5 != r2) goto L2a
            r4.iH()
            r1 = 1
        L2a:
            boolean r5 = r4.xf
            if (r5 == 0) goto L3b
            boolean r5 = r4.Ar
            if (r5 != 0) goto L3b
            if (r1 != 0) goto L3b
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.m.e r5 = r5.rE
            r5.resume()
        L3b:
            com.kwad.sdk.widget.KSFrameLayout r5 = r4.zX
            r0 = 8
            r5.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            com.kwad.components.core.webview.tachikoma.f r2 = r0.kp()
            r0.As = r2
            r1.c(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r3) {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            r0.cW()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onAdClicked convertPageType: "
            r0.<init>(r1)
            int r1 = r3.aNO
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "jky"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aO(r0)
            if (r0 == 0) goto L6e
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            int r1 = r3.aNO
            r0.aW(r1)
            int r3 = r3.aNO
            r0 = -1
            if (r3 != r0) goto L42
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            r0 = 0
            r3.aP(r0)
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            r3.aX(r0)
            return
        L42:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.a.aF(r3)
            r0 = 1
            if (r3 == 0) goto L67
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            int r3 = r3.sK()
            r1 = 2
            if (r3 != r1) goto L5f
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            r0 = 3
            r3.aX(r0)
            return
        L5f:
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            r3.aX(r0)
            return
        L67:
            com.kwad.components.core.r.a r3 = com.kwad.components.core.r.a.sF()
            r3.aP(r0)
        L6e:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void aA() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r7 = this;
            super.at()
            r7.getContext()
            boolean r0 = com.kwad.sdk.utils.aq.QW()
            if (r0 != 0) goto Ld
            return
        Ld:
            r0 = 0
            r7.Ar = r0
            java.lang.String r0 = "TkRewardVideoTaskPresenter"
            java.lang.String r1 = "onBind: "
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.k.a.d r0 = r7.zF
            if (r0 != 0) goto L2f
            com.kwad.components.ad.reward.k.a.d r1 = new com.kwad.components.ad.reward.k.a.d
            com.kwad.components.ad.reward.g r2 = r7.tm
            android.content.Context r5 = r7.getContext()
            com.kwad.components.ad.reward.presenter.h.a$4 r6 = new com.kwad.components.ad.reward.presenter.h.a$4
            r6.<init>(r7)
            r3 = -1
            r1.<init>(r2, r3, r5, r6)
            r7.zF = r1
        L2f:
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r7.mAdInfo = r0
            int r0 = com.kwad.sdk.core.response.b.a.aL(r0)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r7.At = r0
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            if (r0 == 0) goto L4f
            com.kwad.components.core.video.m r1 = r7.jE
            r0.a(r1)
        L4f:
            com.kwad.components.ad.reward.g r0 = r7.tm
            com.kwad.components.ad.reward.g$b r1 = r7.xg
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r7.tm
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r7.vJ
            r0.add(r1)
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
            java.lang.String r0 = "tk_reward_task_card"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dJ(r0)
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
            int r0 = com.kwad.sdk.R.id.ksad_js_task
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            if (r0 == 0) goto Le
            com.kwad.components.core.video.m r1 = r2.jE
            r0.b(r1)
        Le:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.g$b r1 = r2.xg
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.m.a.a r1 = r2.vJ
            r0.remove(r1)
            com.kwad.components.ad.reward.k.a.d r0 = r2.zF
            if (r0 == 0) goto L28
            r0.kz()
            r0 = 0
            r2.zF = r0
        L28:
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            r0.clear()
            r0 = 0
            r2.xe = r0
            r2.xf = r0
            r2.Ar = r0
            return
    }
}
