package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q extends com.kwad.components.ad.splashscreen.presenter.e {
    private com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView GK;
    private double GQ;
    private com.kwad.sdk.core.response.model.AdMatrixInfo.SplashSlideInfo GR;
    private com.kwad.components.ad.splashscreen.e.a Gy;
    private android.widget.TextView HA;
    private android.widget.ImageView HB;
    private com.kwad.components.ad.splashscreen.widget.d HC;
    private com.kwad.components.core.e.d.c Hx;
    private android.widget.TextView ko;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private long mStartTime;





    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context a(com.kwad.components.ad.splashscreen.presenter.q r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ double b(com.kwad.components.ad.splashscreen.presenter.q r2) {
            double r0 = r2.GQ
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.splashscreen.presenter.q r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdMatrixInfo.SplashSlideInfo d(com.kwad.components.ad.splashscreen.presenter.q r0) {
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r0.GR
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo e(com.kwad.components.ad.splashscreen.presenter.q r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ android.content.Context f(com.kwad.components.ad.splashscreen.presenter.q r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ long g(com.kwad.components.ad.splashscreen.presenter.q r2) {
            long r0 = r2.mStartTime
            return r0
    }

    static /* synthetic */ void h(com.kwad.components.ad.splashscreen.presenter.q r0) {
            r0.my()
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.d i(com.kwad.components.ad.splashscreen.presenter.q r0) {
            com.kwad.components.ad.splashscreen.widget.d r0 = r0.HC
            return r0
    }

    private void initView() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo r0 = r0.adMatrixInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r0 = r0.adDataV2
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashInfo r0 = r0.splashInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdInteractionInfo r0 = r0.interactionInfo
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r0.slideInfo
            r4.GR = r0
            int r1 = r0.convertDistance
            double r1 = (double) r1
            r4.GQ = r1
            int r0 = r0.style
            com.kwad.components.ad.splashscreen.widget.d r1 = new com.kwad.components.ad.splashscreen.widget.d
            android.content.Context r2 = r4.getContext()
            r1.<init>(r2, r0)
            r4.HC = r1
            android.widget.ImageView r2 = r4.HB
            r2.setImageDrawable(r1)
            android.widget.ImageView r1 = r4.HB
            com.kwad.components.ad.splashscreen.presenter.q$3 r2 = new com.kwad.components.ad.splashscreen.presenter.q$3
            r2.<init>(r4)
            r1.post(r2)
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r4.GR
            java.lang.String r1 = r1.title
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L43
            android.widget.TextView r0 = r4.ko
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r4.GR
            java.lang.String r1 = r1.title
            r0.setText(r1)
            goto L63
        L43:
            if (r0 == 0) goto L5c
            r1 = 1
            if (r0 == r1) goto L54
            r1 = 2
            if (r0 == r1) goto L4c
            goto L63
        L4c:
            android.widget.TextView r0 = r4.ko
            java.lang.String r1 = "向右滑动"
            r0.setText(r1)
            goto L63
        L54:
            android.widget.TextView r0 = r4.ko
            java.lang.String r1 = "向左滑动"
            r0.setText(r1)
            goto L63
        L5c:
            android.widget.TextView r0 = r4.ko
            java.lang.String r1 = "向上滑动"
            r0.setText(r1)
        L63:
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r4.GR
            java.lang.String r0 = r0.subtitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L77
            android.widget.TextView r0 = r4.HA
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r4.GR
            java.lang.String r1 = r1.subtitle
            r0.setText(r1)
            return
        L77:
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L96
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            com.kwad.components.core.e.d.c r2 = r4.Hx
            int r2 = r2.pB()
            r3 = 0
            java.lang.String r0 = com.kwad.components.ad.splashscreen.d.a(r0, r1, r2, r3)
            android.widget.TextView r1 = r4.HA
            r1.setText(r0)
            return
        L96:
            android.widget.TextView r0 = r4.HA
            java.lang.String r1 = "跳转详情页或者第三方应用"
            r0.setText(r1)
            return
    }

    static /* synthetic */ android.widget.TextView j(com.kwad.components.ad.splashscreen.presenter.q r0) {
            android.widget.TextView r0 = r0.HA
            return r0
    }

    private void mw() {
            r3 = this;
            com.kwad.components.ad.splashscreen.e.a r0 = r3.Gy
            if (r0 != 0) goto L19
            com.kwad.components.ad.splashscreen.presenter.q$4 r0 = new com.kwad.components.ad.splashscreen.presenter.q$4
            android.content.Context r1 = r3.getContext()
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

    private void my() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r0 = r4.GR
            if (r0 == 0) goto L26
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdMatrixInfo$SplashSlideInfo r1 = r4.GR
            int r1 = r1.style
            com.kwad.sdk.core.adlog.c.b r0 = r0.dn(r1)
            r1 = 190(0xbe, float:2.66E-43)
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r1)
            com.kwad.components.ad.splashscreen.h r2 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r3 = 0
            com.kwad.sdk.core.adlog.c.d(r2, r3, r0)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            r0.bm(r1)
        L26:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            if (r0 != 0) goto L8
            goto L2e
        L8:
            com.kwad.components.ad.splashscreen.presenter.q$2 r0 = new com.kwad.components.ad.splashscreen.presenter.q$2
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mAdInfo = r0
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r1.Hx = r0
            r1.initView()
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 == 0) goto L2e
            r1.mw()
        L2e:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.mStartTime = r0
            int r0 = com.kwad.sdk.R.id.ksad_slide_layout
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L16
            r0.inflate()
        L16:
            int r0 = com.kwad.sdk.R.id.ksad_splash_slide_title
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ko = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_slide_actiontext
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.HA = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_slideView
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.HB = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_slideTouchView
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L47
            android.view.View r0 = r0.inflate()
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = (com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView) r0
            r2.GK = r0
            goto L51
        L47:
            int r0 = com.kwad.sdk.R.id.ksad_splash_slideview_root
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = (com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView) r0
            r2.GK = r0
        L51:
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0 = r2.GK
            if (r0 == 0) goto L5d
            com.kwad.components.ad.splashscreen.presenter.q$1 r1 = new com.kwad.components.ad.splashscreen.presenter.q$1
            r1.<init>(r2)
            r0.setOnSlideTouchListener(r1)
        L5d:
            return
    }
}
