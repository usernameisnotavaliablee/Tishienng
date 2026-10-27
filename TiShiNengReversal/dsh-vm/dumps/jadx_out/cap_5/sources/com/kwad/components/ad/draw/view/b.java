package com.kwad.components.ad.draw.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.widget.KSFrameLayout {
    private boolean dA;
    private com.kwad.components.ad.draw.c.a dB;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.components.ad.draw.b.b dz;
    private boolean eD;
    private android.widget.ImageView fL;
    private long fM;
    private android.view.View.OnClickListener fN;
    private com.kwad.components.core.video.l fO;
    private com.kwad.components.core.widget.a.b fg;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private com.kwad.sdk.mvp.Presenter mPresenter;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;




    public b(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.dA = r0
            com.kwad.components.ad.draw.view.b$2 r0 = new com.kwad.components.ad.draw.view.b$2
            r0.<init>(r1)
            r1.fN = r0
            com.kwad.components.ad.draw.view.b$3 r0 = new com.kwad.components.ad.draw.view.b$3
            r0.<init>(r1)
            r1.fO = r0
            r1.mContext = r2
            r1.initView()
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.view.b r0) {
            r0.bJ()
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.draw.view.b r0) {
            r0.notifyAdClick()
            return
    }

    private com.kwad.components.ad.draw.b.b bC() {
            r3 = this;
            com.kwad.components.ad.draw.b.b r0 = new com.kwad.components.ad.draw.b.b
            r0.<init>()
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r1 = r3.dh
            r0.dh = r1
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r3.mRootContainer
            r0.mRootContainer = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L22
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.mApkDownloadHelper = r1
        L22:
            com.kwad.components.ad.draw.c.a r1 = r3.dB
            r0.dB = r1
            com.kwad.components.ad.draw.presenter.b.a r1 = new com.kwad.components.ad.draw.presenter.b.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.dE = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.cL(r1)
            if (r1 == 0) goto L3e
            com.kwad.components.ad.l.b r1 = new com.kwad.components.ad.l.b
            r1.<init>()
            r0.dF = r1
        L3e:
            return r0
    }

    private com.kwad.sdk.mvp.Presenter bD() {
            r2 = this;
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.ad.draw.presenter.a.a r1 = new com.kwad.components.ad.draw.presenter.a.a
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.b r1 = new com.kwad.components.ad.draw.presenter.b
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.d r1 = new com.kwad.components.ad.draw.presenter.d
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.c r1 = new com.kwad.components.ad.draw.presenter.c
            r1.<init>()
            r0.a(r1)
            com.kwad.components.ad.draw.presenter.b.b r1 = new com.kwad.components.ad.draw.presenter.b.b
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.cy(r1)
            if (r1 == 0) goto L3d
            com.kwad.components.ad.draw.presenter.b.c r1 = new com.kwad.components.ad.draw.presenter.b.c
            r1.<init>()
            r0.a(r1)
        L3d:
            com.kwad.components.ad.draw.presenter.c.a r1 = new com.kwad.components.ad.draw.presenter.c.a
            r1.<init>()
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.cL(r1)
            if (r1 == 0) goto L55
            com.kwad.components.ad.draw.presenter.c.b r1 = new com.kwad.components.ad.draw.presenter.c.b
            r1.<init>()
            r0.a(r1)
        L55:
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.aP(r1)
            if (r1 == 0) goto L65
            com.kwad.components.ad.draw.presenter.a r1 = new com.kwad.components.ad.draw.presenter.a
            r1.<init>()
            r0.a(r1)
        L65:
            return r0
    }

    private void bG() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L1b
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.by(r0)
            r1 = 3
            if (r1 != r0) goto L2d
            r2.bH()
            return
        L1b:
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.by(r0)
            r1 = 1
            if (r1 != r0) goto L2d
            r2.bH()
        L2d:
            return
    }

    private void bH() {
            r2 = this;
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            boolean r1 = r2.eD
            r1 = r1 ^ 1
            r0.g(r1)
            boolean r0 = r2.eD
            if (r0 != 0) goto L13
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r0.pause()
            goto L18
        L13:
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r0.resume()
        L18:
            boolean r0 = r2.eD
            r0 = r0 ^ 1
            r2.eD = r0
            return
    }

    private void bI() {
            r2 = this;
            com.kwad.components.ad.draw.b.b r0 = r2.bC()
            r2.dz = r0
            com.kwad.sdk.mvp.Presenter r0 = r2.bD()
            r2.mPresenter = r0
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r2.mRootContainer
            r0.K(r1)
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            r0.n(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            com.kwad.sdk.core.j.b r1 = r2.dn
            r0.a(r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.wi()
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r0.bo()
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            com.kwad.components.core.video.l r1 = r2.fO
            r0.a2(r1)
            return
    }

    private void bJ() {
            r2 = this;
            com.kwad.components.core.widget.a.b r0 = r2.fg
            if (r0 == 0) goto L7
            r0.release()
        L7:
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            if (r0 == 0) goto L15
            r0.bq()
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            com.kwad.components.core.video.l r1 = r2.fO
            r0.b2(r1)
        L15:
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            if (r0 == 0) goto L1c
            r0.release()
        L1c:
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            if (r0 == 0) goto L23
            r0.destroy()
        L23:
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b c(com.kwad.components.ad.draw.view.b r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ void d(com.kwad.components.ad.draw.view.b r0) {
            r0.bG()
            return
    }

    static /* synthetic */ android.widget.ImageView e(com.kwad.components.ad.draw.view.b r0) {
            android.widget.ImageView r0 = r0.fL
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate f(com.kwad.components.ad.draw.view.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ long g(com.kwad.components.ad.draw.view.b r2) {
            long r0 = r2.fM
            return r0
    }

    private void initView() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            int r1 = com.kwad.sdk.R.layout.ksad_draw_layout
            com.kwad.sdk.o.m.inflate(r0, r1, r3)
            int r0 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r3.mRootContainer = r0
            int r1 = com.kwad.sdk.R.id.ksad_video_control_button
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.fL = r0
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r3.mRootContainer
            int r1 = com.kwad.sdk.R.id.ksad_video_player
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r3.mDetailVideoView = r0
            r1 = 1
            int r2 = com.kwad.sdk.core.config.e.Gc()
            r0.g(r1, r2)
            com.kwad.components.core.video.DetailVideoView r0 = r3.mDetailVideoView
            android.view.View$OnClickListener r1 = r3.fN
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r3.fL
            android.view.View$OnClickListener r1 = r3.fN
            r0.setOnClickListener(r1)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.Context r1 = r3.mContext
            android.app.Activity r1 = com.kwad.sdk.o.m.ej(r1)
            r0.<init>(r1)
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.components.ad.draw.view.b$1 r1 = new com.kwad.components.ad.draw.view.b$1
            r1.<init>(r3, r0)
            com.kwad.sdk.core.c.b.a(r1)
            return
    }

    private void notifyAdClick() {
            r3 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.components.ad.draw.b.b r1 = r3.dz
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()
            com.kwad.sdk.core.adlog.c.b r0 = r0.f(r1)
            r1 = 85
            com.kwad.sdk.core.adlog.c.b r0 = r0.dd(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 0
            com.kwad.sdk.core.adlog.c.a(r1, r0, r2)
            com.kwad.components.ad.draw.b.b r0 = r3.dz
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r0.dh
            if (r0 == 0) goto L26
            r0.onAdClicked()
        L26:
            boolean r0 = r3.dA
            if (r0 == 0) goto L2b
            return
        L2b:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.de(r0)
            r2 = 1
            if (r1 == 0) goto L36
            r1 = 2
            goto L37
        L36:
            r1 = 1
        L37:
            com.kwad.components.ad.draw.a.c.b(r0, r2, r1)
            r3.dA = r2
            return
    }

    public final void bK() {
            r2 = this;
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            if (r0 == 0) goto L7
            r1 = 0
            r0.fl = r1
        L7:
            return
    }

    public final void k(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            r3.mAdTemplate = r4
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            r3.mAdInfo = r4
            com.kwad.components.ad.draw.b r4 = new com.kwad.components.ad.draw.b
            r4.<init>(r3)
            r3.fg = r4
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.components.ad.draw.a.b.g(r4)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.fM = r0
            com.kwad.components.ad.draw.c.a r4 = new com.kwad.components.ad.draw.c.a
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.components.core.widget.a.b r1 = r3.fg
            com.kwad.components.core.video.DetailVideoView r2 = r3.mDetailVideoView
            r4.<init>(r0, r1, r2)
            r3.dB = r4
            r3.bI()
            return
    }

    public final void pause() {
            r2 = this;
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            if (r0 == 0) goto L18
            boolean r0 = r0.br()
            if (r0 != 0) goto L18
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r1 = 2
            r0.fm = r1
            r1 = 1
            r0.g(r1)
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r0.pause()
        L18:
            return
    }

    public final void play() {
            r2 = this;
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            if (r0 == 0) goto L18
            boolean r0 = r0.br()
            if (r0 != 0) goto L18
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r1 = 1
            r0.fm = r1
            r1 = 0
            r0.g(r1)
            com.kwad.components.ad.draw.c.a r0 = r2.dB
            r0.resume()
        L18:
            return
    }

    public final void setAdInteractionListener(com.kwad.sdk.api.KsDrawAd.AdInteractionListener r1) {
            r0 = this;
            r0.dh = r1
            return
    }

    public final void setPageExitListener(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public final void setVideoSound(boolean r2) {
            r1 = this;
            com.kwad.components.ad.draw.c.a r0 = r1.dB
            if (r0 == 0) goto L7
            r0.setVideoSound(r2)
        L7:
            return
    }
}
