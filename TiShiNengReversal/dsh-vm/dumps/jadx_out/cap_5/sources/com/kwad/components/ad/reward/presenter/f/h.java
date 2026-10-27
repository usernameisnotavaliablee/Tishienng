package com.kwad.components.ad.reward.presenter.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.ad.reward.presenter.f.g implements com.kwad.components.ad.reward.e.j, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private com.kwad.components.ad.reward.g.a Aa;
    private com.kwad.components.core.webview.jshandler.az cX;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private boolean zU;
    private boolean zV;

    @androidx.annotation.Nullable
    private android.view.View zY;
    private boolean zZ;




    public h() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zZ = r0
            com.kwad.components.ad.reward.presenter.f.h$1 r0 = new com.kwad.components.ad.reward.presenter.f.h$1
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.reward.presenter.f.h$2 r0 = new com.kwad.components.ad.reward.presenter.f.h$2
            r0.<init>(r1)
            r1.Aa = r0
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.f.h r0) {
            r0.ki()
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.f.h r0, boolean r1) {
            r0.zV = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az b(com.kwad.components.ad.reward.presenter.f.h r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.cX
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.f.h r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context d(com.kwad.components.ad.reward.presenter.f.h r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.view.View e(com.kwad.components.ad.reward.presenter.f.h r0) {
            android.view.View r0 = r0.zY
            return r0
    }

    static /* synthetic */ android.content.Context f(com.kwad.components.ad.reward.presenter.f.h r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.content.Context g(com.kwad.components.ad.reward.presenter.f.h r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private void ki() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto L1b
            boolean r1 = r2.zV
            if (r1 == 0) goto L1b
            boolean r1 = r2.zU
            if (r1 != 0) goto L18
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uG()
            r0 = 1
            r2.zU = r0
            return
        L18:
            r0.uJ()
        L1b:
            return
    }

    private com.kwad.components.core.webview.tachikoma.b.e.b kl() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.h$3 r0 = new com.kwad.components.ad.reward.presenter.f.h$3
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.ShowActionBarResult r1, android.view.View r2) {
            r0 = this;
            r0.zY = r2
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void a(com.kwad.components.core.playable.PlayableSource r1, @androidx.annotation.Nullable com.kwad.components.ad.reward.e.n r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            float r0 = com.kwad.sdk.c.a.a.bj(r0)
            android.content.Context r1 = r4.getContext()
            int r1 = com.kwad.sdk.c.a.a.getScreenHeight(r1)
            float r1 = (float) r1
            android.content.Context r2 = r4.getContext()
            int r2 = com.kwad.sdk.c.a.a.getScreenWidth(r2)
            float r2 = (float) r2
            float r2 = r2 / r0
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r5.width = r2
            float r1 = r1 / r0
            float r1 = r1 + r3
            int r0 = (int) r1
            r5.height = r0
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            super.a(r1)
            r0.cX = r1
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r2 = r1.cX
            if (r2 == 0) goto Lc
            r2.uH()
            com.kwad.components.core.webview.jshandler.az r2 = r1.cX
            r2.uI()
        Lc:
            r2 = 0
            r1.zZ = r2
            com.kwad.sdk.widget.KSFrameLayout r2 = r1.zX
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r2, com.kwad.sdk.core.webview.b r3) {
            r1 = this;
            super.a(r2, r3)
            com.kwad.components.core.webview.tachikoma.b.e r3 = new com.kwad.components.core.webview.tachikoma.b.e
            com.kwad.components.core.webview.tachikoma.b.e$b r0 = r1.kl()
            r3.<init>(r0)
            r2.c(r3)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.g$a r1 = r2.Aa
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.a(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.b(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            super.az()
            r2.ki()
            r0 = 1
            r2.zZ = r0
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dk() {
            r2 = this;
            boolean r0 = r2.zZ
            if (r0 == 0) goto La
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 0
            r0.setVisibility(r1)
        La:
            return
    }

    @Override // com.kwad.components.ad.reward.e.j
    public final void dl() {
            r2 = this;
            boolean r0 = r2.zZ
            if (r0 == 0) goto Lb
            com.kwad.sdk.widget.KSFrameLayout r0 = r2.zX
            r1 = 8
            r0.setVisibility(r1)
        Lb:
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
            java.lang.String r0 = "tk_top_floor_bar"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.reward.g r0 = r1.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dE(r0)
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.g
    protected final int iX() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_js_topfloor
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uI()
        Lc:
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.g$a r1 = r2.Aa
            r0.b(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r0.b(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.ad.reward.a r0 = com.kwad.components.ad.reward.a.gg()
            r0.b(r2)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 0
            r0.a(r1)
            return
    }
}
