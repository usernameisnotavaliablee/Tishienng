package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.m.c<com.kwad.components.ad.splashscreen.h> implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener {
    private com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener Fe;
    private com.kwad.components.ad.splashscreen.e.d Ff;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.internal.api.SceneImpl mAdScene;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private boolean mPageDismissCalled;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;




    private c(android.content.Context r1, com.kwad.sdk.core.response.model.AdResultData r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r2)
            r0.mAdTemplate = r1
            com.kwad.sdk.internal.api.SceneImpl r1 = r1.mAdScene
            r0.mAdScene = r1
            r0.qs()
            return
    }

    public static com.kwad.components.ad.splashscreen.c a(android.content.Context r4, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r5, boolean r6, com.kwad.sdk.core.j.b r7, com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r8) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r5)
            r1 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L32
            r0.showStartTime = r2     // Catch: java.lang.Throwable -> L32
            com.kwad.components.ad.splashscreen.monitor.b.lZ()     // Catch: java.lang.Throwable -> L32
            com.kwad.components.ad.splashscreen.monitor.b.ai(r0)     // Catch: java.lang.Throwable -> L32
            com.kwad.components.ad.splashscreen.monitor.b.lZ()     // Catch: java.lang.Throwable -> L32
            com.kwad.sdk.l r2 = com.kwad.sdk.l.Cf()     // Catch: java.lang.Throwable -> L32
            long r2 = r2.CH()     // Catch: java.lang.Throwable -> L32
            com.kwad.components.ad.splashscreen.monitor.b.a(r0, r2, r6)     // Catch: java.lang.Throwable -> L32
            android.content.Context r4 = com.kwad.sdk.o.m.wrapContextIfNeed(r4)     // Catch: java.lang.Throwable -> L32
            com.kwad.components.ad.splashscreen.c r2 = new com.kwad.components.ad.splashscreen.c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L32
            r2.setPageExitListener(r7)     // Catch: java.lang.Throwable -> L2f
            r2.setSplashScreenAdListener(r8)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r4 = move-exception
            r1 = r2
            goto L33
        L32:
            r4 = move-exception
        L33:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            java.lang.String r5 = r4.toString()
            com.kwad.components.ad.splashscreen.monitor.b.a(r0, r5, r6)
            com.kwad.sdk.l r5 = com.kwad.sdk.l.Cf()
            boolean r5 = r5.Bk()
            if (r5 == 0) goto L4b
            com.kwad.components.core.d.a.reportSdkCaughtException(r4)
            return r1
        L4b:
            throw r4
    }

    private com.kwad.sdk.core.j.c a(com.kwad.components.ad.splashscreen.h r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.c$1 r0 = new com.kwad.components.ad.splashscreen.c$1
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo a(com.kwad.components.ad.splashscreen.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private static void a(com.kwad.sdk.mvp.Presenter r1, com.kwad.sdk.core.response.model.AdInfo r2) {
            com.kwad.components.ad.splashscreen.presenter.k r0 = new com.kwad.components.ad.splashscreen.presenter.k
            r0.<init>()
            r1.a(r0)
            com.kwad.components.ad.splashscreen.presenter.r r0 = new com.kwad.components.ad.splashscreen.presenter.r
            r0.<init>()
            r1.a(r0)
            boolean r2 = com.kwad.components.ad.splashscreen.h.r(r2)
            if (r2 == 0) goto L1e
            com.kwad.components.ad.splashscreen.presenter.endcard.f r2 = new com.kwad.components.ad.splashscreen.presenter.endcard.f
            r2.<init>()
            r1.a(r2)
        L1e:
            return
    }

    private static com.kwad.sdk.mvp.Presenter ab(com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r2)
            com.kwad.sdk.mvp.Presenter r1 = new com.kwad.sdk.mvp.Presenter
            r1.<init>()
            a(r1, r0)
            boolean r2 = com.kwad.components.ad.splashscreen.h.ac(r2)
            if (r2 == 0) goto L1b
            com.kwad.components.ad.splashscreen.presenter.playcard.a r2 = new com.kwad.components.ad.splashscreen.presenter.playcard.a
            r2.<init>()
            r1.a(r2)
            return r1
        L1b:
            com.kwad.components.ad.splashscreen.presenter.j r2 = new com.kwad.components.ad.splashscreen.presenter.j
            r2.<init>()
            r1.a(r2)
            return r1
    }

    static /* synthetic */ com.kwad.sdk.mvp.a b(com.kwad.components.ad.splashscreen.c r0) {
            T extends com.kwad.sdk.mvp.a r0 = r0.Rv
            return r0
    }

    private static com.kwad.components.offline.api.tk.model.StyleTemplate c(com.kwad.sdk.core.response.model.AdTemplate r3) {
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dK(r3)
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

    static /* synthetic */ com.kwad.sdk.mvp.a c(com.kwad.components.ad.splashscreen.c r0) {
            T extends com.kwad.sdk.mvp.a r0 = r0.Rv
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.splashscreen.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.mvp.a e(com.kwad.components.ad.splashscreen.c r0) {
            T extends com.kwad.sdk.mvp.a r0 = r0.Rv
            return r0
    }

    static /* synthetic */ com.kwad.sdk.mvp.a f(com.kwad.components.ad.splashscreen.c r0) {
            T extends com.kwad.sdk.mvp.a r0 = r0.Rv
            return r0
    }

    private int getSplashLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_splash_screen_layout
            return r0
    }

    private com.kwad.components.ad.splashscreen.h ly() {
            r5 = this;
            com.kwad.components.ad.splashscreen.e.d r0 = new com.kwad.components.ad.splashscreen.e.d
            android.view.ViewGroup r1 = r5.nY
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo
            int r2 = com.kwad.sdk.core.response.b.a.cG(r2)
            r0.<init>(r1, r2)
            r5.Ff = r0
            com.kwad.sdk.core.j.b r1 = r5.dn
            r0.a(r1)
            com.kwad.components.ad.splashscreen.e.d r0 = r5.Ff
            r0.wi()
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r5.mVideoPlayConfig
            if (r0 != 0) goto L37
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r0.<init>()
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r1 = r1.adSplashInfo
            int r1 = r1.mute
            r2 = 1
            if (r1 == r2) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = r0.videoSoundEnable(r2)
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r0.build()
            r5.mVideoPlayConfig = r0
        L37:
            com.kwad.components.ad.splashscreen.h r0 = new com.kwad.components.ad.splashscreen.h
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r5.mAdResultData
            r0.a(r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r1 = r5.Fe
            r0.setSplashScreenAdListener(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r5.mRootContainer
            r0.mRootContainer = r1
            com.kwad.sdk.internal.api.SceneImpl r1 = r5.mAdScene
            r0.mAdScene = r1
            com.kwad.sdk.api.KsVideoPlayConfig r1 = r5.mVideoPlayConfig
            r0.mVideoPlayConfig = r1
            com.kwad.components.ad.splashscreen.e.d r1 = r5.Ff
            r0.Fs = r1
            com.kwad.components.core.e.d.c r1 = r5.mApkDownloadHelper
            r0.mApkDownloadHelper = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = c(r1)
            r0.Fr = r1
            com.kwad.sdk.utils.bv r1 = new com.kwad.sdk.utils.bv
            r1.<init>()
            r0.mTimerHelper = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r5.mAdInfo
            boolean r1 = com.kwad.sdk.core.response.b.a.bc(r1)
            if (r1 == 0) goto L83
            com.kwad.components.ad.splashscreen.d.a r1 = new com.kwad.components.ad.splashscreen.d.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            com.kwad.components.core.video.DetailVideoView r3 = r5.mDetailVideoView
            com.kwad.sdk.api.KsVideoPlayConfig r4 = r5.mVideoPlayConfig
            r1.<init>(r2, r3, r4)
            r0.Fq = r1
            com.kwad.sdk.core.j.a r2 = r0.Fs
            r2.a(r1)
        L83:
            com.kwad.sdk.core.j.a r1 = r0.Fs
            com.kwad.sdk.core.j.c r2 = r5.a(r0)
            r1.a(r2)
            return r0
    }

    private void lz() {
            r1 = this;
            com.kwad.sdk.a.a.c r0 = com.kwad.sdk.a.a.c.CU()
            r0.CX()
            boolean r0 = r1.mPageDismissCalled
            if (r0 == 0) goto Lc
            return
        Lc:
            r0 = 1
            r1.mPageDismissCalled = r0
            return
    }

    public static boolean n(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdInfo r1) {
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r1 = r1.adSplashInfo
            if (r1 == 0) goto La
            int r1 = r1.fullScreenClickSwitch
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    @Override // com.kwad.components.core.m.c, com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r1 = this;
            super.aa()
            com.kwad.components.ad.splashscreen.c$3 r0 = new com.kwad.components.ad.splashscreen.c$3
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    @Override // com.kwad.components.core.m.c, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r5 = this;
            super.ab()
            r0 = 0
            android.view.View r1 = r5.getRootView()     // Catch: java.lang.Throwable -> L17
            r2 = 1
            if (r1 == 0) goto L19
            android.view.View r1 = r5.getRootView()     // Catch: java.lang.Throwable -> L17
            int r1 = r1.getVisibility()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            r1 = 1
            goto L1a
        L17:
            goto L4a
        L19:
            r1 = 0
        L1a:
            android.view.View r3 = r5.getRootView()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4b
            android.view.View r3 = r5.getRootView()     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r3 = r3.getParent()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4b
            android.view.View r3 = r5.getRootView()     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r3 = r3.getParent()     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3 instanceof android.view.View     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4b
            android.view.View r3 = r5.getRootView()     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r3 = r3.getParent()     // Catch: java.lang.Throwable -> L48
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L48
            int r3 = r3.getVisibility()     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L4b
            r0 = 1
            goto L4b
        L48:
            goto L4b
        L4a:
            r1 = 0
        L4b:
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            com.kwad.sdk.l r3 = com.kwad.sdk.l.Cf()
            long r3 = r3.CH()
            com.kwad.components.ad.splashscreen.monitor.b.a(r2, r3, r1, r0)
            com.kwad.components.core.e.d.c r0 = r5.mApkDownloadHelper
            if (r0 == 0) goto L68
            r1 = 0
            r0.setOnDismissListener(r1)
            com.kwad.components.core.e.d.c r0 = r5.mApkDownloadHelper
            r0.setOnShowListener(r1)
        L68:
            com.kwad.components.ad.splashscreen.e.d r0 = r5.Ff
            r0.wj()
            r5.lz()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwai.adclient.kscommerciallogger.model.BusinessType r0 = com.kwad.sdk.commercial.d.be(r0)
            com.kwad.components.core.g.a.a(r0)
            return
    }

    @Override // com.kwad.components.core.m.c
    public final boolean ai() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void ak() {
            r2 = this;
            android.view.ViewGroup r0 = r2.nY
            int r1 = com.kwad.sdk.R.id.ksad_splash_root_container
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r2.mRootContainer = r0
            android.view.ViewGroup r0 = r2.nY
            int r1 = com.kwad.sdk.R.id.ksad_splash_video_player
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.video.DetailVideoView r0 = (com.kwad.components.core.video.DetailVideoView) r0
            r2.mDetailVideoView = r0
            r1 = 1
            r0.setAd(r1)
            com.kwad.components.core.video.DetailVideoView r0 = r2.mDetailVideoView
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r2.mRootContainer
            int r1 = com.kwad.sdk.R.id.splash_play_card_view
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.splashscreen.c$2 r1 = new com.kwad.components.ad.splashscreen.c$2
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // com.kwad.components.core.m.c
    public final /* synthetic */ com.kwad.components.ad.splashscreen.h al() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.ly()
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final int getLayoutId() {
            r1 = this;
            int r0 = r1.getSplashLayoutId()
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void initData() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r3.mAdInfo = r0
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r0.<init>()
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            com.kwad.sdk.core.response.model.AdInfo$AdSplashInfo r1 = r1.adSplashInfo
            int r1 = r1.mute
            r2 = 1
            if (r1 == r2) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r0 = r0.videoSoundEnable(r1)
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r0.build()
            r3.mVideoPlayConfig = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            boolean r0 = r0.isVideoSoundEnable()
            if (r0 == 0) goto L2c
            r2 = 2
        L2c:
            r1.mInitVoiceStatus = r2
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.<init>(r1)
            r3.mApkDownloadHelper = r0
            r0.setOnDismissListener(r3)
            com.kwad.components.core.e.d.c r0 = r3.mApkDownloadHelper
            r0.setOnShowListener(r3)
            return
    }

    @Override // com.kwad.components.core.m.c
    @androidx.annotation.NonNull
    public final com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r1 = this;
            r1.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.mvp.Presenter r0 = ab(r0)
            return r0
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.kwad.components.core.e.c.b
            if (r0 == 0) goto Lb
            com.kwad.components.core.e.c.b r2 = (com.kwad.components.core.e.c.b) r2
            boolean r2 = r2.oY()
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r1.Fe     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1b
            if (r2 == 0) goto L18
            r0.onDownloadTipsDialogDismiss()     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r2 = move-exception
            goto L1c
        L18:
            r0.onDownloadTipsDialogCancel()     // Catch: java.lang.Throwable -> L16
        L1b:
            return
        L1c:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r1) {
            r0 = this;
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r1 = r0.Fe     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto La
            r1.onDownloadTipsDialogShow()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r1)
            return
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(@androidx.annotation.NonNull android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            return
    }

    public final void setPageExitListener(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public final void setSplashScreenAdListener(com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r2) {
            r1 = this;
            r1.Fe = r2
            T extends com.kwad.sdk.mvp.a r0 = r1.Rv
            if (r0 == 0) goto Lb
            com.kwad.components.ad.splashscreen.h r0 = (com.kwad.components.ad.splashscreen.h) r0
            r0.setSplashScreenAdListener(r2)
        Lb:
            return
    }
}
