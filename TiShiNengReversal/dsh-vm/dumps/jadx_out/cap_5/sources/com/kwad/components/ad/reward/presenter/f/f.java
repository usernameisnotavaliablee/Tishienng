package com.kwad.components.ad.reward.presenter.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f extends com.kwad.components.ad.reward.presenter.f.a implements com.kwad.components.ad.reward.e.j, com.kwad.components.core.j.a.InterfaceC0078a {
    private java.util.List<com.kwad.components.core.j.c> bK;
    private com.kwad.components.core.webview.tachikoma.e nD;
    private final com.kwad.components.core.webview.tachikoma.f.a rP;
    protected android.widget.FrameLayout zB;
    private boolean zC;








    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zC = r0
            com.kwad.components.ad.reward.presenter.f.f$1 r0 = new com.kwad.components.ad.reward.presenter.f.f$1
            r0.<init>(r1)
            r1.rP = r0
            return
    }

    private void W(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fullTK: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TkRewardPagePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.widget.FrameLayout r0 = r2.zB
            if (r0 != 0) goto L18
            return
        L18:
            if (r3 == 0) goto L1c
            r3 = 0
            goto L1e
        L1c:
            r3 = 8
        L1e:
            r0.setVisibility(r3)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.e a(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.core.webview.tachikoma.e r0 = r0.nD
            return r0
    }

    private static java.util.List<com.kwad.sdk.core.response.model.AdTemplate> a(java.util.List<com.kwad.components.core.j.c> r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            java.util.List r1 = com.kwad.components.core.j.c.n(r1)
            r0.addAll(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g e(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private com.kwad.components.core.webview.tachikoma.c eD() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.f$6 r0 = new com.kwad.components.ad.reward.presenter.f.f$6
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.webview.tachikoma.e eE() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.f$5 r0 = new com.kwad.components.ad.reward.presenter.f.f$5
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.f.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void a(com.kwad.components.core.playable.PlayableSource r1, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r2) {
            r0 = this;
            boolean r1 = r0.zC
            if (r1 != 0) goto Ld
            android.widget.FrameLayout r1 = r0.zB
            if (r1 == 0) goto Ld
            r2 = 8
            r1.setVisibility(r2)
        Ld:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.a, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r6) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.widget.FrameLayout r1 = r5.zB
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r1.getHeight()
            float r1 = (float) r1
            android.widget.FrameLayout r3 = r5.zB
            int r3 = r3.getWidth()
            float r3 = (float) r3
            goto L1c
        L1a:
            r1 = 0
            r3 = 0
        L1c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L32
        L25:
            float r3 = r3 / r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r3 = (int) r3
            r6.width = r3
            float r1 = r1 / r0
            float r1 = r1 + r2
            int r0 = (int) r1
            r6.height = r0
            return
        L32:
            super.a(r6)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            super.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.ad.reward.monitor.b.a(r0, r2)
            java.lang.String r2 = "TkRewardPagePresenter"
            java.lang.String r0 = "onTkLoadFailed"
            com.kwad.sdk.core.d.c.d(r2, r0)
            r2 = 1
            r1.zC = r2
            com.kwad.components.ad.reward.g r2 = r1.tm
            r0 = 0
            r2.rT = r0
            r1.W(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.c.u r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSkipClick: "
            r0.<init>(r1)
            long r1 = r6.aci
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TkRewardPagePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.reward.g r0 = r5.tm
            if (r0 == 0) goto L26
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            if (r0 == 0) goto L26
            long r1 = r6.aci
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.onVideoSkipToEnd(r1)
        L26:
            com.kwad.components.ad.reward.g r6 = r5.tm
            com.kwad.components.ad.reward.presenter.f.u(r6)
            com.kwad.components.ad.reward.g r6 = r5.tm
            java.util.List<com.kwad.components.ad.reward.k.a> r6 = r6.rL
            com.kwad.components.ad.reward.presenter.f.f$7 r0 = new com.kwad.components.ad.reward.presenter.f.f$7
            r0.<init>(r5)
            com.kwad.components.ad.reward.g.a(r6, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            super.a(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.a, com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r2, com.kwad.sdk.core.webview.b r3) {
            r1 = this;
            super.a(r2, r3)
            com.kwad.components.ad.reward.c.f r3 = new com.kwad.components.ad.reward.c.f
            com.kwad.components.ad.reward.presenter.f.f$2 r0 = new com.kwad.components.ad.reward.presenter.f.f$2
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            com.kwad.components.core.webview.tachikoma.e r3 = r1.eE()
            r1.nD = r3
            com.kwad.components.ad.reward.g r3 = r1.tm
            com.kwad.components.core.webview.tachikoma.f.a r0 = r1.rP
            r3.a(r0)
            com.kwad.components.core.webview.tachikoma.e r3 = r1.nD
            r2.c(r3)
            com.kwad.components.core.webview.tachikoma.b r3 = new com.kwad.components.core.webview.tachikoma.b
            com.kwad.components.ad.reward.presenter.f.f$3 r0 = new com.kwad.components.ad.reward.presenter.f.f$3
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            com.kwad.components.core.webview.tachikoma.c r3 = r1.eD()
            r2.c(r3)
            com.kwad.components.core.webview.jshandler.j r3 = new com.kwad.components.core.webview.jshandler.j
            com.kwad.components.ad.reward.presenter.f.f$4 r0 = new com.kwad.components.ad.reward.presenter.f.f$4
            r0.<init>(r1)
            r3.<init>(r0)
            r2.c(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.d.b.a r5) {
            r4 = this;
            if (r5 == 0) goto L35
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.mAdResultData
            java.util.List r0 = r0.getProceedTemplateList()
            long r1 = r5.creativeId
            int r3 = r5.adStyle
            boolean r0 = com.kwad.sdk.core.response.b.e.b(r0, r1, r3)
            if (r0 == 0) goto L15
            goto L35
        L15:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.adTemplate
            if (r0 == 0) goto L25
            boolean r0 = r5.aNR
            if (r0 != 0) goto L25
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.e.b r5 = r5.rD
            r5.cW()
            return
        L25:
            java.util.List<com.kwad.components.core.j.c> r0 = r4.bK
            long r1 = r5.creativeId
            com.kwad.components.core.j.c r5 = com.kwad.components.ad.reward.g.a(r0, r1)
            if (r5 == 0) goto L34
            com.kwad.components.ad.reward.g r0 = r4.tm
            r0.a(r5)
        L34:
            return
        L35:
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.e.b r5 = r5.rD
            r5.cW()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            boolean r0 = r3.zC
            r1 = 1
            if (r0 != 0) goto Lb
            r3.W(r1)
        Lb:
            com.kwad.components.ad.reward.g r0 = r3.tm
            boolean r2 = r3.zC
            r1 = r1 ^ r2
            r0.rT = r1
            r0.a(r3)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r2 = this;
            boolean r0 = r2.zC
            if (r0 != 0) goto Lc
            android.widget.FrameLayout r0 = r2.zB
            if (r0 == 0) goto Lc
            r1 = 0
            r0.setVisibility(r1)
        Lc:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r0 = this;
            return
    }

    @androidx.annotation.IdRes
    protected int du() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_js_reward_card
            return r0
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void e(@androidx.annotation.Nullable java.util.List<com.kwad.components.core.j.c> r2) {
            r1 = this;
            if (r2 == 0) goto L33
            int r0 = r2.size()
            if (r0 == 0) goto L33
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            if (r0 != 0) goto Ld
            goto L33
        Ld:
            r1.bK = r2
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.util.List r2 = a(r2, r0)
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            com.kwad.sdk.core.webview.b r0 = r0.uU()
            if (r0 == 0) goto L22
            r0.setAdTemplateList(r2)
        L22:
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            com.kwad.components.ad.reward.k.l r0 = r0.ky()
            if (r0 == 0) goto L2e
            r0.g(r2)
            return
        L2e:
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            r0.h(r2)
        L33:
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void f(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public android.widget.FrameLayout getTKContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.zB
            return r0
    }

    public java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_reward"
            return r0
    }

    public java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dF(r0)
            return r0
    }

    public final com.kwad.components.ad.reward.page.BackPressHandleResult hx() {
            r1 = this;
            com.kwad.components.ad.reward.k.a.d r0 = r1.zF
            if (r0 != 0) goto L7
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED
            return r0
        L7:
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = r1.du()
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.zB = r0
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onError(int r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.j.a.InterfaceC0078a
    public final void onRequestResult(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.b(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r1)
            return
    }
}
