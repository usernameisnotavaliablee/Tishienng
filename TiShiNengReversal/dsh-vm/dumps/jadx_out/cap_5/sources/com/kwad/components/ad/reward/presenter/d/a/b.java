package com.kwad.components.ad.reward.presenter.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.reward.presenter.b implements com.kwad.components.core.webview.jshandler.as.b {

    @androidx.annotation.Nullable
    private com.kwad.components.ad.l.b dF;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;
    private boolean wn;
    private com.kwad.components.ad.reward.widget.tailframe.TailFrameView yX;
    private volatile boolean yY;
    private boolean yZ;
    private com.kwad.components.ad.reward.n.k za;
    private int zb;
    private int zc;
    private android.graphics.drawable.Drawable zd;




    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.wn = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.zb = r0
            r1.zc = r0
            com.kwad.components.ad.reward.presenter.d.a.b$1 r0 = new com.kwad.components.ad.reward.presenter.d.a.b$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            com.kwad.components.ad.reward.presenter.d.a.b$2 r0 = new com.kwad.components.ad.reward.presenter.d.a.b$2
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            return
    }

    private void L(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L4
            r5 = 2
            goto L6
        L4:
            r5 = 153(0x99, float:2.14E-43)
        L6:
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            com.kwad.sdk.core.adlog.c.b r5 = r0.dd(r5)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.components.ad.reward.g r1 = r4.tm
            org.json.JSONObject r1 = r1.mReportExtData
            java.lang.String r2 = "native_id"
            r3 = 0
            com.kwad.components.ad.reward.j.b.a(r0, r2, r3, r5, r1)
            com.kwad.components.ad.reward.g r5 = r4.tm
            com.kwad.components.ad.reward.e.b r5 = r5.rD
            r5.cW()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            r0.jH()
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.d.a.b r0, boolean r1) {
            r0.yZ = r1
            return r1
    }

    private void ad(int r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto Lf
            r0.width = r2
            com.kwad.components.core.video.DetailVideoView r2 = r1.mDetailVideoView
            r2.setLayoutParams(r0)
        Lf:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.widget.tailframe.TailFrameView b(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r0.yX
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.d.a.b r0, boolean r1) {
            r0.L(r1)
            return
    }

    private void bn() {
            r2 = this;
            r2.jH()
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r2.yX
            com.kwad.components.ad.reward.presenter.d.a.b$3 r1 = new com.kwad.components.ad.reward.presenter.d.a.b$3
            r1.<init>(r2)
            r0.a(r1)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r2.yX
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ boolean e(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            boolean r0 = r0.wn
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g g(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g h(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.l.b i(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.l.b r0 = r0.dF
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g j(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void jH() {
            r1 = this;
            boolean r0 = r1.yY
            if (r0 == 0) goto L5
            return
        L5:
            r1.jI()
            return
    }

    private void jI() {
            r5 = this;
            java.lang.String r0 = "RewardPlayEndNativeCardPresenter"
            java.lang.String r1 = "initTailView"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r5.yX
            android.content.Context r1 = r5.getContext()
            com.kwad.components.ad.reward.g r2 = r5.tm
            int r2 = r2.mScreenOrientation
            r3 = 1
            if (r2 != 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            boolean r4 = r5.jK()
            r0.a(r1, r2, r4)
            r5.yY = r3
            return
    }

    private void jJ() {
            r2 = this;
            boolean r0 = r2.yZ
            if (r0 == 0) goto L18
            r2.jH()
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r2.yX
            r0.destroy()
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r2.yX
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.ad.reward.n.k r0 = r2.za
            r0.hide()
        L18:
            return
    }

    private boolean jK() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aX(r0)
            int r1 = r0.height
            int r0 = r0.width
            if (r1 <= r0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean k(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            boolean r0 = r0.yZ
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g l(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g m(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g n(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate o(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g p(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ void q(com.kwad.components.ad.reward.presenter.d.a.b r0) {
            r0.bn()
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.as.b
    public final void a(com.kwad.components.core.webview.jshandler.as.a r1) {
            r0 = this;
            boolean r1 = r1.isSuccess()
            r0.wn = r1
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.core.playable.a r0 = r0.rF
            if (r0 == 0) goto Lc
            r0.a(r3)
        Lc:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r3.mAdInfo = r0
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.j r1 = r0.rH
            r3.dF = r1
            com.kwad.components.ad.reward.e.g r1 = r3.mPlayEndPageListener
            r0.b(r1)
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r3.mRewardVerifyListener
            r0.a(r1)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = r3.yX
            com.kwad.components.ad.reward.g r1 = r3.tm
            r0.setCallerContext(r1)
            int r0 = com.kwad.sdk.R.id.ksad_playend_native_jinniu
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L43
            com.kwad.components.ad.reward.n.k r1 = new com.kwad.components.ad.reward.n.k
            com.kwad.components.ad.reward.g r2 = r3.tm
            r1.<init>(r2, r0)
            r3.za = r1
            return
        L43:
            int r0 = com.kwad.sdk.R.id.ksad_reward_jinniu_end_card_root
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.components.ad.reward.n.k r1 = new com.kwad.components.ad.reward.n.k
            com.kwad.components.ad.reward.g r2 = r3.tm
            r1.<init>(r2, r0)
            r3.za = r1
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_tail_frame
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.reward.widget.tailframe.TailFrameView r0 = (com.kwad.components.ad.reward.widget.tailframe.TailFrameView) r0
            r2.yX = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r2.mDetailVideoView = r0
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L27
            com.kwad.components.core.video.DetailVideoView r0 = r2.mDetailVideoView
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            r1 = 4
            r0.enableTransitionType(r1)
        L27:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r3 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.core.playable.a r0 = r0.rF
            if (r0 == 0) goto Lc
            r0.b(r3)
        Lc:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r3.mRewardVerifyListener
            r0.b(r1)
            r3.jJ()
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.e.g r1 = r3.mPlayEndPageListener
            r0.c(r1)
            com.kwad.components.core.video.DetailVideoView r0 = r3.mDetailVideoView
            if (r0 == 0) goto L51
            int r1 = r3.zc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L2c
            r0.updateTextureViewGravity(r1)
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onUnbind:  videoOriginalWidth :"
            r0.<init>(r1)
            int r1 = r3.zb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardPlayEndNativeCardPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            int r0 = r3.zb
            if (r0 == r2) goto L48
            r3.ad(r0)
        L48:
            android.graphics.drawable.Drawable r0 = r3.zd
            if (r0 == 0) goto L51
            com.kwad.components.core.video.DetailVideoView r1 = r3.mDetailVideoView
            r1.setBackground(r0)
        L51:
            return
    }
}
