package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.splashscreen.presenter.e implements android.view.View.OnClickListener, com.kwad.sdk.widget.d {
    private com.kwad.components.ad.splashscreen.widget.CloseCountDownView Ij;
    private android.view.ViewGroup Ik;
    private android.view.ViewGroup Il;
    private android.widget.ImageView Im;
    private android.widget.TextView In;
    private android.widget.TextView Io;
    private com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView Ip;
    private com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a Iq;


    public c() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.splashscreen.presenter.endcard.c$1 r0 = new com.kwad.components.ad.splashscreen.presenter.endcard.c$1
            r0.<init>(r1)
            r1.Iq = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h a(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h b(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h c(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h d(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h e(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h f(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h g(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h h(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h i(com.kwad.components.ad.splashscreen.presenter.endcard.c r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    private void w(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup r0 = r4.Ik
            r1 = 2
            if (r5 != r0) goto L11
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r2 = 104(0x68, float:1.46E-43)
            r0.c(r1, r5, r2, r1)
            return
        L11:
            android.view.ViewGroup r0 = r4.Il
            if (r5 != r0) goto L22
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r2 = 26
            r3 = 1
            r0.c(r1, r5, r2, r3)
            return
        L22:
            android.widget.ImageView r0 = r4.Im
            if (r5 != r0) goto L32
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r2 = 15
            r0.c(r1, r5, r2, r1)
            return
        L32:
            android.widget.TextView r0 = r4.In
            if (r5 != r0) goto L42
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r2 = 16
            r0.c(r1, r5, r2, r1)
            return
        L42:
            android.widget.TextView r0 = r4.Io
            if (r5 != r0) goto L51
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            android.content.Context r5 = r5.getContext()
            r2 = 17
            r0.c(r1, r5, r2, r1)
        L51:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r1) {
            r0 = this;
            r0.w(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            if (r0 != 0) goto L3f
            int r0 = com.kwad.sdk.R.id.ksad_splash_end_card_native_dialog_root
            android.view.View r0 = r3.findViewById(r0)
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = (com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView) r0
            r3.Ip = r0
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r0.getCloseView()
            r3.Ij = r0
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            android.view.ViewGroup r0 = r0.getGiftBoxView()
            r3.Ik = r0
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            android.view.ViewGroup r0 = r0.getActionBarView()
            r3.Il = r0
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            android.widget.ImageView r0 = r0.getAppIcon()
            r3.Im = r0
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            android.widget.TextView r0 = r0.getAppName()
            r3.In = r0
            com.kwad.components.ad.splashscreen.presenter.endcard.SplashEndLandView r0 = r3.Ip
            android.widget.TextView r0 = r0.getAppDesc()
            r3.Io = r0
        L3f:
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r3.Ij
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$a r1 = r3.Iq
            r0.setOnViewClickListener(r1)
            android.view.ViewGroup r0 = r3.Il
            r0.setOnClickListener(r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.Il
            android.content.Context r1 = r1.getContext()
            android.view.ViewGroup r2 = r3.Il
            r0.<init>(r1, r2, r3)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.b.dz(r0)
            if (r0 == 0) goto Lae
            android.view.ViewGroup r0 = r3.Ik
            r0.setOnClickListener(r3)
            android.widget.ImageView r0 = r3.Im
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.In
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r3.Io
            r0.setOnClickListener(r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.Il
            android.content.Context r1 = r1.getContext()
            android.view.ViewGroup r2 = r3.Ik
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.Il
            android.content.Context r1 = r1.getContext()
            android.widget.ImageView r2 = r3.Im
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.Il
            android.content.Context r1 = r1.getContext()
            android.widget.TextView r2 = r3.In
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            android.view.ViewGroup r1 = r3.Il
            android.content.Context r1 = r1.getContext()
            android.widget.TextView r2 = r3.Io
            r0.<init>(r1, r2, r3)
        Lae:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            r0.w(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
