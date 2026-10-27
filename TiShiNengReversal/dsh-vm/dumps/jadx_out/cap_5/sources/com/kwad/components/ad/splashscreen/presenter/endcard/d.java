package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.sdk.core.j.c {
    private android.view.ViewGroup Is;
    private android.widget.ImageView It;
    private com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView Iu;




    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.view.ViewGroup a(com.kwad.components.ad.splashscreen.presenter.endcard.d r0) {
            android.view.ViewGroup r0 = r0.Is
            return r0
    }

    private static void a(android.widget.ImageView r2, java.lang.String r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r0 = new com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder
            r0.<init>()
            r1 = 20
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat$Builder r0 = r0.setBlurRadius(r1)
            com.kwad.sdk.core.imageloader.core.DisplayImageOptionsCompat r0 = r0.build()
            com.kwad.components.ad.splashscreen.presenter.endcard.d$3 r1 = new com.kwad.components.ad.splashscreen.presenter.endcard.d$3
            r1.<init>()
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r2, r3, r4, r0, r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.endcard.d r0, java.lang.String r1) {
            r0.ab(r1)
            return
    }

    private void ab(java.lang.String r2) {
            r1 = this;
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r1.Iu
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.ab(r2)
        L9:
            return
    }

    static /* synthetic */ android.content.Context b(com.kwad.components.ad.splashscreen.presenter.endcard.d r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h c(com.kwad.components.ad.splashscreen.presenter.endcard.d r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h d(com.kwad.components.ad.splashscreen.presenter.endcard.d r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView e(com.kwad.components.ad.splashscreen.presenter.endcard.d r0) {
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r0.Iu
            return r0
    }

    private void initView() {
            r4 = this;
            int r0 = com.kwad.sdk.R.id.ksad_splash_endcard_view_stub
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.Is = r0
            goto L1d
        L13:
            int r0 = com.kwad.sdk.R.id.ksad_splash_end_card_native_root
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.Is = r0
        L1d:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.dn(r0)
            if (r0 == 0) goto L35
            android.view.ViewGroup r1 = r4.Is
            com.kwad.components.ad.splashscreen.presenter.endcard.d$2 r2 = new com.kwad.components.ad.splashscreen.presenter.endcard.d$2
            r2.<init>(r4)
            r1.post(r2)
        L35:
            int r1 = com.kwad.sdk.R.id.ksad_splash_end_card_native_bg
            android.view.View r1 = r4.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.It = r1
            int r1 = com.kwad.sdk.R.id.ksad_splash_end_card_native_dialog_root
            android.view.View r1 = r4.findViewById(r1)
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r1 = (com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView) r1
            r4.Iu = r1
            r1.t(r0)
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r4.Iu
            com.kwad.components.ad.splashscreen.h r1 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.a(r2, r1, r3)
            return
    }

    private void mG() {
            r3 = this;
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r0 != 0) goto Lf
            goto L25
        Lf:
            com.kwad.components.ad.splashscreen.presenter.endcard.d$1 r0 = new com.kwad.components.ad.splashscreen.presenter.endcard.d$1
            android.content.Context r1 = r3.getContext()
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            r0.<init>(r3, r1, r2)
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            if (r1 == 0) goto L25
            r1.b(r0)
        L25:
            return
    }

    private void mH() {
            r3 = this;
            android.view.ViewGroup r0 = r3.Is
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            android.widget.ImageView r1 = r3.It
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = com.kwad.sdk.core.response.b.a.aU(r0)
            java.lang.String r0 = r0.materialUrl
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            a(r1, r0, r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            r3.initView()
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r3)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 87
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)
            r2 = 6
            com.kwad.sdk.core.adlog.c.b r1 = r1.dm(r2)
            r2 = 0
            com.kwad.sdk.core.adlog.c.d(r0, r2, r1)
            r3.mG()
            r3.mH()
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r1 = this;
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r1.Iu
            if (r0 == 0) goto L7
            r0.bt()
        L7:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r1 = this;
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r1.Iu
            if (r0 == 0) goto L7
            r0.bu()
        L7:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r1.Iu
            if (r0 == 0) goto La
            r0.mI()
        La:
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r1)
            return
    }
}
