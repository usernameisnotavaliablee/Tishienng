package com.kwad.components.ad.fullscreen.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.g, com.kwad.components.core.e.e.f {
    private com.kwad.components.ad.fullscreen.b jH;
    private android.view.ViewGroup jI;
    private com.kwad.components.core.m.b jJ;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.r jK;
    private android.widget.FrameLayout jL;
    private com.kwad.components.ad.reward.presenter.f.b jM;
    private com.kwad.components.core.webview.tachikoma.f.g jN;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.e.a jO;
    private com.kwad.components.ad.reward.presenter.f.f jP;
    private boolean jQ;


    public b(com.kwad.components.core.m.b r2, android.view.ViewGroup r3, com.kwad.components.ad.fullscreen.b r4, com.kwad.components.ad.reward.g r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.jQ = r0
            r1.jJ = r2
            r1.jH = r4
            r1.jI = r3
            r1.tm = r5
            r1.db()
            return
    }

    private int a(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            int r0 = r1.getPriority()
            int r2 = r2.getPriority()
            int r0 = r0 - r2
            return r0
    }

    private void a(com.kwad.components.ad.fullscreen.c.b r3) {
            r2 = this;
            boolean r0 = r2.jQ
            if (r0 == 0) goto L5
            return
        L5:
            com.kwad.components.ad.reward.presenter.a r0 = new com.kwad.components.ad.reward.presenter.a
            com.kwad.components.ad.reward.g r1 = r2.tm
            r0.<init>(r1)
            r1 = 1
            r3.a(r0, r1)
            r2.jQ = r1
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.fullscreen.c.b r0, com.kwad.components.ad.fullscreen.c.b r1) {
            r0.a(r1)
            return
    }

    private static boolean a(com.kwad.components.ad.reward.g r3) {
            boolean r0 = com.kwad.sdk.core.config.e.Fq()
            r1 = 0
            if (r0 != 0) goto Lf
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.SWITCH_CLOSE
            com.kwad.components.ad.reward.monitor.b.a(r3, r0)
            return r1
        Lf:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.bd(r0)
            if (r0 == 0) goto L1c
            return r1
        L1c:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$FullScreenInfo r0 = com.kwad.sdk.core.response.b.b.du(r0)
            if (r0 == 0) goto L2a
            int r0 = r0.renderType
            r2 = 1
            if (r0 != r2) goto L2a
            return r2
        L2a:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_ERROR
            com.kwad.components.ad.reward.monitor.b.a(r3, r0)
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.fullscreen.c.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.fullscreen.c.b r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.fullscreen.c.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void db() {
            r2 = this;
            com.kwad.components.ad.fullscreen.b r0 = r2.jH
            if (r0 != 0) goto L5
            return
        L5:
            r2.dg()
            com.kwad.components.ad.fullscreen.b r0 = r2.jH
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            boolean r1 = com.kwad.sdk.core.response.b.a.dc(r0)
            boolean r0 = com.kwad.sdk.core.response.b.b.eq(r0)
            if (r1 == 0) goto L2e
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.RewardRenderResult r1 = com.kwad.components.ad.reward.RewardRenderResult.LIVE_TK
            r0.a(r1)
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.dh()
            r0.a(r1)
            r2.dd()
            return
        L2e:
            if (r0 == 0) goto L46
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.dh()
            r0.a(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.RewardRenderResult r1 = com.kwad.components.ad.reward.RewardRenderResult.TK_IMAGE
            r0.a(r1)
            r2.de()
            return
        L46:
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r0 = a(r0)
            if (r0 == 0) goto L64
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.RewardRenderResult r1 = com.kwad.components.ad.reward.RewardRenderResult.FULLSCREEN_TK
            r0.a(r1)
            r2.df()
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.dh()
            r0.a(r1)
            return
        L64:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.RewardRenderResult r1 = com.kwad.components.ad.reward.RewardRenderResult.DEFAULT
            r0.a(r1)
            r2.dc()
            return
    }

    private void dc() {
            r6 = this;
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r6.jN
            r0.b(r1)
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.pY()
            r0.a(r6)
            com.kwad.components.ad.fullscreen.b r0 = r6.jH
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.components.ad.fullscreen.b r1 = r6.jH
            com.kwad.sdk.core.response.model.AdInfo r1 = r1.cU()
            com.kwad.components.ad.fullscreen.b r2 = r6.jH
            boolean r2 = r2.cV()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            boolean r2 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r2 != 0) goto L2e
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            com.kwad.components.ad.fullscreen.b r5 = r6.jH
            boolean r5 = r5.jk
            if (r5 == 0) goto L38
            r6.a(r6)
        L38:
            com.kwad.components.ad.reward.presenter.v r5 = new com.kwad.components.ad.reward.presenter.v
            r5.<init>()
            r6.a(r5, r4)
            boolean r5 = com.kwad.sdk.core.response.b.a.aP(r1)
            if (r5 == 0) goto L4e
            com.kwad.components.ad.reward.presenter.d r5 = new com.kwad.components.ad.reward.presenter.d
            r5.<init>()
            r6.a(r5, r4)
        L4e:
            com.kwad.components.ad.reward.presenter.m r5 = new com.kwad.components.ad.reward.presenter.m
            r5.<init>()
            r6.a(r5, r4)
            com.kwad.components.ad.reward.presenter.platdetail.c r5 = new com.kwad.components.ad.reward.presenter.platdetail.c
            r5.<init>()
            r6.a(r5, r4)
            boolean r5 = com.kwad.sdk.core.response.b.b.dA(r1)
            if (r5 == 0) goto L6c
            com.kwad.components.ad.reward.presenter.f.h r5 = new com.kwad.components.ad.reward.presenter.f.h
            r5.<init>()
            r6.a(r5, r4)
        L6c:
            if (r2 != 0) goto L76
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.c r2 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.c
            r2.<init>()
            r6.a(r2, r4)
        L76:
            com.kwad.components.ad.reward.presenter.c.a r2 = new com.kwad.components.ad.reward.presenter.c.a
            r2.<init>()
            r6.a(r2, r4)
            boolean r2 = com.kwad.sdk.core.response.b.b.dz(r0)
            if (r2 == 0) goto L8c
            com.kwad.components.ad.fullscreen.c.a.f r2 = new com.kwad.components.ad.fullscreen.c.a.f
            r2.<init>()
            r6.a(r2, r4)
        L8c:
            boolean r2 = com.kwad.sdk.core.response.b.a.bd(r1)
            if (r2 == 0) goto L9a
            com.kwad.components.ad.reward.presenter.platdetail.b r2 = new com.kwad.components.ad.reward.presenter.platdetail.b
            r2.<init>()
            r6.a(r2, r4)
        L9a:
            com.kwad.components.ad.reward.presenter.l r2 = new com.kwad.components.ad.reward.presenter.l
            r2.<init>()
            r6.a(r2, r4)
            boolean r2 = com.kwad.sdk.core.response.b.a.cR(r1)
            if (r2 == 0) goto Lc8
            com.kwad.components.ad.reward.presenter.b.c r2 = new com.kwad.components.ad.reward.presenter.b.c
            r2.<init>()
            r6.a(r2, r4)
            com.kwad.components.ad.reward.presenter.b.b r2 = new com.kwad.components.ad.reward.presenter.b.b
            r2.<init>()
            r6.a(r2, r4)
            com.kwad.components.ad.reward.presenter.k r2 = new com.kwad.components.ad.reward.presenter.k
            r2.<init>()
            r6.a(r2, r4)
            com.kwad.components.ad.reward.presenter.b.a r2 = new com.kwad.components.ad.reward.presenter.b.a
            r2.<init>()
            r6.a(r2, r4)
        Lc8:
            com.kwad.components.ad.reward.presenter.r r2 = new com.kwad.components.ad.reward.presenter.r
            r2.<init>(r0, r3, r3)
            r6.jK = r2
            r6.a(r2, r4)
            com.kwad.components.ad.fullscreen.c.c r2 = new com.kwad.components.ad.fullscreen.c.c
            r2.<init>()
            r6.a(r2, r4)
            com.kwad.components.ad.fullscreen.c.a r2 = new com.kwad.components.ad.fullscreen.c.a
            r2.<init>()
            r6.a(r2, r4)
            com.kwad.components.ad.reward.presenter.d.b r2 = new com.kwad.components.ad.reward.presenter.d.b
            r2.<init>(r0, r3)
            r6.a(r2, r4)
            com.kwad.components.ad.reward.presenter.e r0 = new com.kwad.components.ad.reward.presenter.e
            android.view.ViewGroup r2 = r6.jI
            r0.<init>(r1, r2)
            r6.a(r0, r4)
            com.kwad.components.ad.reward.presenter.j r0 = new com.kwad.components.ad.reward.presenter.j
            r0.<init>()
            r6.a(r0, r4)
            return
    }

    private void dd() {
            r1 = this;
            com.kwad.components.ad.fullscreen.c.c.c r0 = new com.kwad.components.ad.fullscreen.c.c.c
            r0.<init>()
            r1.jM = r0
            r1.a(r0)
            return
    }

    private void de() {
            r1 = this;
            com.kwad.components.ad.fullscreen.c.c.a r0 = new com.kwad.components.ad.fullscreen.c.c.a
            r0.<init>()
            r1.jP = r0
            r1.a(r0)
            return
    }

    private void df() {
            r2 = this;
            com.kwad.components.ad.fullscreen.c.c.b r0 = new com.kwad.components.ad.fullscreen.c.c.b
            r0.<init>()
            r1 = 1
            r2.a(r0, r1)
            return
    }

    private void dg() {
            r2 = this;
            com.kwad.components.ad.fullscreen.b r0 = r2.jH
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.cU()
            com.kwad.components.ad.fullscreen.b r1 = r2.jH
            boolean r1 = r1.jk
            if (r1 != 0) goto Lf
            r2.a(r2)
        Lf:
            boolean r0 = com.kwad.sdk.core.response.b.b.en(r0)
            if (r0 == 0) goto L26
            boolean r0 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r0 == 0) goto L26
            com.kwad.components.ad.reward.presenter.e.a r0 = new com.kwad.components.ad.reward.presenter.e.a
            r0.<init>()
            r2.jO = r0
            r1 = 1
            r2.a(r0, r1)
        L26:
            return
    }

    private com.kwad.components.core.webview.tachikoma.f.g dh() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.f.g r0 = r1.jN
            if (r0 != 0) goto Lb
            com.kwad.components.ad.fullscreen.c.b$1 r0 = new com.kwad.components.ad.fullscreen.c.b$1
            r0.<init>(r1)
            r1.jN = r0
        Lb:
            com.kwad.components.core.webview.tachikoma.f.g r0 = r1.jN
            return r0
    }

    private android.widget.FrameLayout di() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.jL
            if (r0 != 0) goto L10
            android.view.ViewGroup r0 = r2.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_play_layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.jL = r0
        L10:
            android.widget.FrameLayout r0 = r2.jL
            return r0
    }

    static /* synthetic */ android.widget.FrameLayout e(com.kwad.components.ad.fullscreen.c.b r0) {
            android.widget.FrameLayout r0 = r0.di()
            return r0
    }

    static /* synthetic */ void f(com.kwad.components.ad.fullscreen.c.b r0) {
            r0.dc()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g g(com.kwad.components.ad.fullscreen.c.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.b(r1)
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final void cX() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 1
            r0.D(r1)
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.kwad.components.ad.reward.e.g r1) {
            r0 = this;
            com.kwad.components.ad.reward.e.g r1 = (com.kwad.components.ad.reward.e.g) r1
            int r1 = r0.a(r1)
            return r1
    }

    @Override // com.kwad.components.core.e.e.f
    public final void dismiss() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 0
            r0.E(r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.gD()
            return
    }

    @Override // com.kwad.components.ad.reward.e.g
    public final int getPriority() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean onBackPressed() {
            r4 = this;
            com.kwad.components.ad.reward.presenter.r r0 = r4.jK
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.kwad.components.ad.reward.presenter.e.a r0 = r4.jO
            if (r0 == 0) goto L19
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            com.kwad.components.ad.reward.page.BackPressHandleResult r2 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            if (r0 != r2) goto L19
            return r1
        L19:
            com.kwad.components.ad.reward.presenter.f.b r0 = r4.jM
            r2 = 0
            if (r0 == 0) goto L27
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            com.kwad.components.ad.reward.page.BackPressHandleResult r3 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            if (r0 != r3) goto L27
            return r1
        L27:
            return r2
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            android.view.ViewGroup r0 = r2.jI
            int r1 = com.kwad.sdk.R.id.ksad_reward_play_layout
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.jL = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.c(r2)
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.pY()
            r0.b(r2)
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.jN
            r0.b(r1)
            return
    }

    @Override // com.kwad.components.core.e.e.f
    public final void show() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.gE()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r1 = 1
            r0.E(r1)
            return
    }
}
