package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class n extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.ad.reward.e.g, com.kwad.components.core.e.e.f {
    private android.view.ViewGroup jI;
    private com.kwad.components.core.m.b jJ;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.r jK;
    private android.widget.FrameLayout jL;
    private com.kwad.components.ad.reward.presenter.f.b jM;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.presenter.e.a jO;
    private com.kwad.components.ad.reward.presenter.f.f jP;
    private boolean jQ;
    private android.content.Context mContext;
    private com.kwad.components.ad.reward.model.c mModel;
    private com.kwad.components.core.webview.tachikoma.f.g mq;
    private com.kwad.components.ad.reward.g tm;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.n.a tn;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void onUnbind();
    }

    public n(com.kwad.components.core.m.b r4, android.content.Context r5, android.view.ViewGroup r6, com.kwad.components.ad.reward.model.c r7, com.kwad.components.ad.reward.g r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.jQ = r0
            com.kwad.components.ad.reward.n$1 r1 = new com.kwad.components.ad.reward.n$1
            r1.<init>(r3)
            r3.mq = r1
            r3.mContext = r5
            r3.jI = r6
            r3.mModel = r7
            r3.tm = r8
            r3.jJ = r4
            r3.a(r7)
            com.kwad.sdk.core.response.model.AdInfo r5 = r7.cU()
            boolean r6 = com.kwad.sdk.core.response.b.b.eq(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r5)
            r2 = 1
            if (r1 == 0) goto L35
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.response.model.AdResultData r1 = r1.mAdResultData
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r1 = r1.adGlobalConfigInfo
            boolean r1 = a(r1)
            if (r1 != 0) goto L48
        L35:
            boolean r1 = com.kwad.sdk.core.response.b.a.bd(r5)
            if (r1 != 0) goto L48
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.getAdTemplate()
            boolean r1 = com.kwad.components.ad.reward.g.P(r1)
            if (r1 == 0) goto L46
            goto L48
        L46:
            r1 = 0
            goto L49
        L48:
            r1 = 1
        L49:
            boolean r5 = com.kwad.sdk.core.response.b.a.dc(r5)
            if (r5 == 0) goto L5c
            com.kwad.components.ad.reward.g r5 = r3.tm
            com.kwad.sdk.core.response.model.AdResultData r5 = r5.mAdResultData
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r5 = r5.adGlobalConfigInfo
            boolean r5 = a(r5)
            if (r5 == 0) goto L5c
            r0 = 1
        L5c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "notFullTk: "
            r5.<init>(r2)
            r5.append(r1)
            java.lang.String r2 = ", mLoadStrategy: "
            r5.append(r2)
            com.kwad.components.ad.reward.g r2 = r3.tm
            com.kwad.components.ad.reward.LoadStrategy r2 = r2.sx
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "RewardPresenter"
            com.kwad.sdk.core.d.c.d(r2, r5)
            if (r0 == 0) goto L8f
            com.kwad.components.core.webview.tachikoma.e.c r4 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r5 = r3.mq
            r4.a(r5)
            com.kwad.components.ad.reward.RewardRenderResult r4 = com.kwad.components.ad.reward.RewardRenderResult.LIVE_TK
            r8.a(r4)
            r3.dd()
            return
        L8f:
            if (r6 == 0) goto La3
            com.kwad.components.core.webview.tachikoma.e.c r4 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r5 = r3.mq
            r4.a(r5)
            com.kwad.components.ad.reward.RewardRenderResult r4 = com.kwad.components.ad.reward.RewardRenderResult.TK_IMAGE
            r8.a(r4)
            r3.de()
            return
        La3:
            if (r1 != 0) goto Lc3
            com.kwad.components.ad.reward.g r5 = r3.tm
            com.kwad.components.ad.reward.LoadStrategy r5 = r5.sx
            com.kwad.components.ad.reward.LoadStrategy r6 = com.kwad.components.ad.reward.LoadStrategy.FULL_TK
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lc3
            com.kwad.components.core.webview.tachikoma.e.c r4 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r5 = r3.mq
            r4.a(r5)
            com.kwad.components.ad.reward.RewardRenderResult r4 = com.kwad.components.ad.reward.RewardRenderResult.NEO_TK
            r8.a(r4)
            r3.hw()
            return
        Lc3:
            com.kwad.components.ad.reward.RewardRenderResult r5 = com.kwad.components.ad.reward.RewardRenderResult.DEFAULT
            r8.a(r5)
            r3.a(r4, r7)
            return
    }

    private int a(com.kwad.components.ad.reward.e.g r2) {
            r1 = this;
            int r0 = r1.getPriority()
            int r2 = r2.getPriority()
            int r0 = r0 - r2
            return r0
    }

    private void a(com.kwad.components.ad.reward.model.c r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.cU()
            boolean r2 = r2.jk
            if (r2 != 0) goto Lb
            r1.a(r1)
        Lb:
            boolean r2 = com.kwad.components.ad.reward.g.g(r0)
            if (r2 == 0) goto L19
            com.kwad.components.ad.reward.presenter.g r2 = new com.kwad.components.ad.reward.presenter.g
            r2.<init>()
            r1.a(r2)
        L19:
            boolean r2 = com.kwad.sdk.core.response.b.a.aO(r0)
            if (r2 == 0) goto L2d
            boolean r2 = com.kwad.sdk.utils.aq.QW()
            if (r2 == 0) goto L2d
            com.kwad.components.ad.reward.presenter.h.a r2 = new com.kwad.components.ad.reward.presenter.h.a
            r2.<init>()
            r1.a(r2)
        L2d:
            boolean r2 = com.kwad.sdk.core.response.b.b.dA(r0)
            if (r2 == 0) goto L3b
            com.kwad.components.ad.reward.presenter.f.h r2 = new com.kwad.components.ad.reward.presenter.f.h
            r2.<init>()
            r1.a(r2)
        L3b:
            boolean r2 = com.kwad.sdk.core.response.b.b.en(r0)
            if (r2 == 0) goto L51
            boolean r2 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r2 == 0) goto L51
            com.kwad.components.ad.reward.presenter.e.a r2 = new com.kwad.components.ad.reward.presenter.e.a
            r2.<init>()
            r1.jO = r2
            r1.a(r2)
        L51:
            return
    }

    private void a(com.kwad.components.ad.reward.n r3) {
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

    static /* synthetic */ void a(com.kwad.components.ad.reward.n r0, com.kwad.components.ad.reward.n r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.n r0, com.kwad.components.core.m.b r1, com.kwad.components.ad.reward.model.c r2) {
            r0.a(r1, r2)
            return
    }

    private void a(com.kwad.components.core.m.b r5, com.kwad.components.ad.reward.model.c r6) {
            r4 = this;
            com.kwad.components.ad.reward.model.c r5 = r4.mModel
            if (r5 != 0) goto L5
            return
        L5:
            com.kwad.components.core.e.e.g r5 = com.kwad.components.core.e.e.g.pY()
            r5.a(r4)
            com.kwad.components.ad.reward.model.c r5 = r4.mModel
            com.kwad.sdk.core.response.model.AdInfo r5 = r5.cU()
            com.kwad.components.ad.reward.model.c r0 = r4.mModel
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            boolean r1 = r6.jk
            if (r1 == 0) goto L1f
            r4.a(r4)
        L1f:
            com.kwad.components.ad.reward.presenter.v r1 = new com.kwad.components.ad.reward.presenter.v
            r1.<init>()
            r2 = 1
            r4.a(r1, r2)
            boolean r1 = com.kwad.sdk.core.response.b.a.aP(r5)
            if (r1 == 0) goto L36
            com.kwad.components.ad.reward.presenter.d r1 = new com.kwad.components.ad.reward.presenter.d
            r1.<init>()
            r4.a(r1, r2)
        L36:
            com.kwad.components.ad.reward.presenter.m r1 = new com.kwad.components.ad.reward.presenter.m
            r1.<init>()
            r4.a(r1, r2)
            com.kwad.components.ad.reward.presenter.h r1 = new com.kwad.components.ad.reward.presenter.h
            r1.<init>()
            r4.a(r1, r2)
            com.kwad.components.ad.reward.presenter.platdetail.c r1 = new com.kwad.components.ad.reward.presenter.platdetail.c
            r1.<init>()
            r4.a(r1, r2)
            com.kwad.components.ad.reward.presenter.platdetail.a.e r1 = new com.kwad.components.ad.reward.presenter.platdetail.a.e
            r1.<init>()
            r4.a(r1, r2)
            boolean r1 = r6.is()
            boolean r3 = r6.it()
            boolean r6 = r6.cV()
            if (r6 == 0) goto L6c
            boolean r6 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r6 != 0) goto L6c
            r6 = 1
            goto L6d
        L6c:
            r6 = 0
        L6d:
            if (r1 != 0) goto L7b
            if (r3 != 0) goto L7b
            if (r6 != 0) goto L7b
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.c r6 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.c
            r6.<init>()
            r4.a(r6, r2)
        L7b:
            com.kwad.components.ad.reward.presenter.n r6 = new com.kwad.components.ad.reward.presenter.n
            r6.<init>()
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.c r6 = new com.kwad.components.ad.reward.presenter.c
            r6.<init>(r5)
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.d.b r6 = new com.kwad.components.ad.reward.presenter.d.b
            r6.<init>(r0, r2)
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.c.a r6 = new com.kwad.components.ad.reward.presenter.c.a
            r6.<init>()
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.u r6 = new com.kwad.components.ad.reward.presenter.u
            r6.<init>()
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.e r6 = new com.kwad.components.ad.reward.presenter.e
            android.view.ViewGroup r1 = r4.jI
            r6.<init>(r5, r1)
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.r r6 = new com.kwad.components.ad.reward.presenter.r
            r6.<init>(r0)
            r4.jK = r6
            r4.a(r6, r2)
            com.kwad.components.ad.reward.presenter.l r6 = new com.kwad.components.ad.reward.presenter.l
            r6.<init>()
            r4.a(r6, r2)
            com.kwad.components.ad.reward.g r6 = r4.tm
            boolean r1 = r6.rS
            if (r1 == 0) goto Ld9
            android.content.Context r6 = r6.mContext
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r6 = com.kwad.components.ad.reward.d.a.b(r6, r1)
            if (r6 == 0) goto Ld9
            com.kwad.components.ad.reward.presenter.a.a r6 = new com.kwad.components.ad.reward.presenter.a.a
            r6.<init>()
            r4.a(r6, r2)
        Ld9:
            boolean r6 = com.kwad.sdk.core.response.b.b.dA(r0)
            if (r6 == 0) goto Le7
            com.kwad.components.ad.reward.presenter.t r6 = new com.kwad.components.ad.reward.presenter.t
            r6.<init>()
            r4.a(r6, r2)
        Le7:
            boolean r6 = com.kwad.sdk.core.response.b.a.bd(r5)
            if (r6 == 0) goto Lf5
            com.kwad.components.ad.reward.presenter.platdetail.b r6 = new com.kwad.components.ad.reward.presenter.platdetail.b
            r6.<init>()
            r4.a(r6, r2)
        Lf5:
            boolean r5 = com.kwad.sdk.core.response.b.a.cR(r5)
            if (r5 == 0) goto L11b
            com.kwad.components.ad.reward.presenter.b.c r5 = new com.kwad.components.ad.reward.presenter.b.c
            r5.<init>()
            r4.a(r5, r2)
            com.kwad.components.ad.reward.presenter.b.a r5 = new com.kwad.components.ad.reward.presenter.b.a
            r5.<init>()
            r4.a(r5, r2)
            com.kwad.components.ad.reward.presenter.b.b r5 = new com.kwad.components.ad.reward.presenter.b.b
            r5.<init>()
            r4.a(r5, r2)
            com.kwad.components.ad.reward.presenter.k r5 = new com.kwad.components.ad.reward.presenter.k
            r5.<init>()
            r4.a(r5, r2)
        L11b:
            com.kwad.components.ad.reward.presenter.j r5 = new com.kwad.components.ad.reward.presenter.j
            r5.<init>()
            r4.a(r5, r2)
            return
    }

    private static boolean a(com.kwad.sdk.core.response.model.AdGlobalConfigInfo r1) {
            r0 = 1
            if (r1 == 0) goto La
            int r1 = r1.neoPageType
            if (r1 == r0) goto L8
            goto La
        L8:
            r1 = 0
            return r1
        La:
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.n r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.reward.n r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.widget.FrameLayout d(com.kwad.components.ad.reward.n r0) {
            android.widget.FrameLayout r0 = r0.di()
            return r0
    }

    private void dd() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.b r0 = new com.kwad.components.ad.reward.presenter.f.b
            r0.<init>()
            r1.jM = r0
            r1.a(r0)
            return
    }

    private void de() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.c r0 = new com.kwad.components.ad.reward.presenter.f.c
            r0.<init>()
            r1.jP = r0
            r1.a(r0)
            return
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

    static /* synthetic */ com.kwad.components.core.m.b e(com.kwad.components.ad.reward.n r0) {
            com.kwad.components.core.m.b r0 = r0.jJ
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.model.c f(com.kwad.components.ad.reward.n r0) {
            com.kwad.components.ad.reward.model.c r0 = r0.mModel
            return r0
    }

    private void hw() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.f.f r0 = new com.kwad.components.ad.reward.presenter.f.f
            r0.<init>()
            r1.jP = r0
            r1.a(r0)
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.reward.n.a r1) {
            r0 = this;
            r0.tn = r1
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            r0.b(r2)
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()
            com.kwad.components.ad.reward.g r1 = r2.tm
            r0.setCallerContext(r1)
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

    public final com.kwad.components.ad.reward.page.BackPressHandleResult hx() {
            r2 = this;
            com.kwad.components.ad.reward.presenter.r r0 = r2.jK
            if (r0 == 0) goto Ld
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Ld
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            return r0
        Ld:
            com.kwad.components.ad.reward.presenter.e.a r0 = r2.jO
            if (r0 == 0) goto L1a
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            com.kwad.components.ad.reward.page.BackPressHandleResult r1 = com.kwad.components.ad.reward.page.BackPressHandleResult.HANDLED
            if (r0 != r1) goto L1a
            return r1
        L1a:
            com.kwad.components.ad.reward.presenter.f.b r0 = r2.jM
            if (r0 == 0) goto L23
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            return r0
        L23:
            com.kwad.components.ad.reward.presenter.f.f r0 = r2.jP
            if (r0 == 0) goto L2c
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = r0.hx()
            return r0
        L2c:
            com.kwad.components.ad.reward.page.BackPressHandleResult r0 = com.kwad.components.ad.reward.page.BackPressHandleResult.NOT_HANDLED
            return r0
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
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            r0 = 0
            r2.jJ = r0
            com.kwad.components.core.webview.tachikoma.e.c r0 = com.kwad.components.core.webview.tachikoma.e.c.vO()
            com.kwad.components.core.webview.tachikoma.f.g r1 = r2.mq
            r0.b(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r1.tm
            r0.c(r1)
            com.kwad.components.ad.reward.n$a r0 = r1.tn
            if (r0 == 0) goto Lf
            r0.onUnbind()
        Lf:
            com.kwad.components.core.e.e.g r0 = com.kwad.components.core.e.e.g.pY()
            r0.b(r1)
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.hV()
            r0.reset()
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
