package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class p extends com.kwad.components.ad.splashscreen.presenter.e {
    private com.kwad.components.ad.splashscreen.widget.KsSlideRoundView GJ;
    private com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView GK;
    private double GQ;
    private com.kwad.sdk.core.response.model.AdMatrixInfo.SplashSlideInfo GR;
    private float GS;
    private float GT;
    private float GU;
    private float GV;
    private float GW;
    private float GX;
    private boolean GY;
    private boolean GZ;
    private com.kwad.components.ad.splashscreen.e.a Gy;
    private android.view.View Hu;
    private android.widget.TextView Hv;
    private com.kwad.components.ad.splashscreen.widget.KsSlideHandView Hw;
    private com.kwad.components.core.e.d.c Hx;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private long mStartTime;






    public p() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.GY = r0
            r1.GZ = r0
            return
    }

    static /* synthetic */ double a(com.kwad.components.ad.splashscreen.presenter.p r2) {
            double r0 = r2.GQ
            return r0
    }

    static /* synthetic */ float a(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GU = r1
            return r1
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.p r0, boolean r1) {
            r1 = 1
            r0.GZ = r1
            return r1
    }

    private void ao() {
            r3 = this;
            android.view.View r0 = r3.Hu
            if (r0 == 0) goto L1d
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            if (r1 == 0) goto L1d
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1 = 0
            r2 = 243(0xf3, float:3.4E-43)
            com.kwad.sdk.core.adlog.c.b(r0, r2, r1)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            r0.bm(r2)
        L1d:
            return
    }

    static /* synthetic */ float b(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GV = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdMatrixInfo.SplashSlideInfo b(com.kwad.components.ad.splashscreen.presenter.p r0) {
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r0.GR
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.splashscreen.presenter.p r0, boolean r1) {
            r1 = 1
            r0.GY = r1
            return r1
    }

    static /* synthetic */ float c(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GS = r1
            return r1
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.splashscreen.presenter.p r0) {
            boolean r0 = r0.GY
            return r0
    }

    static /* synthetic */ float d(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GT = r1
            return r1
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.splashscreen.presenter.p r0) {
            boolean r0 = r0.GZ
            return r0
    }

    static /* synthetic */ float e(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GU
            return r0
    }

    static /* synthetic */ float e(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GW = r1
            return r1
    }

    static /* synthetic */ float f(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GV
            return r0
    }

    static /* synthetic */ float f(com.kwad.components.ad.splashscreen.presenter.p r0, float r1) {
            r0.GX = r1
            return r1
    }

    static /* synthetic */ float g(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GS
            return r0
    }

    static /* synthetic */ float h(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GW
            return r0
    }

    static /* synthetic */ float i(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GT
            return r0
    }

    private void initView() {
            r2 = this;
            int r0 = com.kwad.sdk.R.id.ksad_slide_combo_layout
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L11
            android.view.View r0 = r0.inflate()
            r2.Hu = r0
            goto L19
        L11:
            int r0 = com.kwad.sdk.R.id.ksad_slide_combo_root
            android.view.View r0 = r2.findViewById(r0)
            r2.Hu = r0
        L19:
            int r0 = com.kwad.sdk.R.id.ksad_slide_combo_slide_hand
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.KsSlideHandView r0 = (com.kwad.components.ad.splashscreen.widget.KsSlideHandView) r0
            r2.Hw = r0
            int r0 = com.kwad.sdk.R.id.ksad_slide_combo_action_sub_text
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Hv = r0
            int r0 = com.kwad.sdk.R.id.ksad_slide_combo_round_bg
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.KsSlideRoundView r0 = (com.kwad.components.ad.splashscreen.widget.KsSlideRoundView) r0
            r2.GJ = r0
            android.widget.TextView r0 = r2.Hv
            java.lang.String r1 = r2.mx()
            r0.setText(r1)
            com.kwad.components.ad.splashscreen.widget.KsSlideRoundView r0 = r2.GJ
            com.kwad.components.ad.splashscreen.presenter.p$4 r1 = new com.kwad.components.ad.splashscreen.presenter.p$4
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    static /* synthetic */ float j(com.kwad.components.ad.splashscreen.presenter.p r0) {
            float r0 = r0.GX
            return r0
    }

    private void je() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.KsSlideHandView r0 = r1.Hw
            if (r0 == 0) goto L7
            r0.fM()
        L7:
            com.kwad.components.ad.splashscreen.widget.KsSlideRoundView r0 = r1.GJ
            if (r0 == 0) goto Le
            r0.fM()
        Le:
            return
    }

    static /* synthetic */ void k(com.kwad.components.ad.splashscreen.presenter.p r0) {
            r0.mu()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo l(com.kwad.components.ad.splashscreen.presenter.p r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView m(com.kwad.components.ad.splashscreen.presenter.p r0) {
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = r0.GK
            return r0
    }

    private void mu() {
            r5 = this;
            com.kwad.components.ad.splashscreen.h r0 = r5.Gf
            if (r0 == 0) goto Lf
            android.content.Context r1 = r5.mv()
            r2 = 53
            r3 = 2
            r4 = 1
            r0.c(r4, r1, r2, r3)
        Lf:
            return
    }

    private void mw() {
            r3 = this;
            com.kwad.components.ad.splashscreen.e.a r0 = r3.Gy
            if (r0 != 0) goto L19
            com.kwad.components.ad.splashscreen.presenter.p$5 r0 = new com.kwad.components.ad.splashscreen.presenter.p$5
            android.content.Context r1 = r3.mv()
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r0.<init>(r3, r1, r2)
            r3.Gy = r0
            com.kwad.components.core.e.d.c r1 = r3.Hx
            r1.b(r0)
            return
        L19:
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.setAdTemplate(r1)
            return
    }

    private java.lang.String mx() {
            r2 = this;
            java.lang.String r0 = "跳转详情页或第三方应用"
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dI(r1)     // Catch: java.lang.Exception -> L14
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L14
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.mAdInfo     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dI(r1)     // Catch: java.lang.Exception -> L14
        L14:
            return r0
    }

    static /* synthetic */ long n(com.kwad.components.ad.splashscreen.presenter.p r2) {
            long r0 = r2.mStartTime
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.KsSlideRoundView o(com.kwad.components.ad.splashscreen.presenter.p r0) {
            com.kwad.components.ad.splashscreen.widget.KsSlideRoundView r0 = r0.GJ
            return r0
    }

    static /* synthetic */ android.widget.TextView p(com.kwad.components.ad.splashscreen.presenter.p r0) {
            android.widget.TextView r0 = r0.Hv
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 != 0) goto L8
            return
        L8:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r2.mAdInfo = r0
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r2.Hx = r1
            com.kwad.sdk.core.response.model.AdMatrixInfo r0 = r0.adMatrixInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r0 = r0.adDataV2
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashInfo r0 = r0.splashInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdInteractionInfo r0 = r0.interactionInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r0.slideInfo
            r2.GR = r0
            int r0 = r0.convertDistance
            double r0 = (double) r0
            r2.GQ = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_slideTouchView
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L3a
            android.view.View r0 = r0.inflate()
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = (com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView) r0
            r2.GK = r0
            goto L44
        L3a:
            int r0 = com.kwad.sdk.R.id.ksad_splash_slideview_root
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = (com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView) r0
            r2.GK = r0
        L44:
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = r2.GK
            if (r0 == 0) goto L5a
            com.kwad.components.ad.splashscreen.presenter.p$1 r1 = new com.kwad.components.ad.splashscreen.presenter.p$1
            r1.<init>(r2)
            r0.setOnSlideTouchListener(r1)
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = r2.GK
            com.kwad.components.ad.splashscreen.presenter.p$2 r1 = new com.kwad.components.ad.splashscreen.presenter.p$2
            r1.<init>(r2)
            r0.post(r1)
        L5a:
            com.kwad.components.ad.splashscreen.presenter.p$3 r0 = new com.kwad.components.ad.splashscreen.presenter.p$3
            r0.<init>(r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            r2.initView()
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L70
            r2.mw()
        L70:
            r2.ao()
            r2.je()
            return
    }

    @androidx.annotation.Nullable
    protected final android.content.Context mv() {
            r2 = this;
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            r0 = 0
        La:
            if (r0 != 0) goto L14
            android.view.View r1 = r2.Hu
            if (r1 == 0) goto L14
            android.content.Context r0 = r1.getContext()
        L14:
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.mStartTime = r0
            return
    }
}
