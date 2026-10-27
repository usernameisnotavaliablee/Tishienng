package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o extends com.kwad.components.ad.splashscreen.presenter.i implements android.view.View.OnClickListener, com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.g.b, com.kwad.sdk.widget.d {
    private boolean FV;
    private com.kwad.components.ad.splashscreen.d GN;
    private android.widget.TextView Hi;
    private com.kwad.components.ad.splashscreen.widget.KsShakeView Hl;
    private android.view.ViewGroup Hr;
    private com.kwad.sdk.core.g.d gX;
    private android.os.Vibrator gZ;
    private long mStartTime;




    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.splashscreen.presenter.o r2) {
            long r0 = r2.mStartTime
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.KsShakeView b(com.kwad.components.ad.splashscreen.presenter.o r0) {
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r0.Hl
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.splashscreen.presenter.o r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // com.kwad.sdk.core.g.b
    public final void a(double r3) {
            r2 = this;
            boolean r0 = com.kwad.components.core.e.c.b.oW()
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.sdk.core.j.a r1 = r1.Fs
            boolean r1 = r1.wl()
            if (r1 == 0) goto L27
            if (r0 == 0) goto L11
            goto L27
        L11:
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r2.Hl
            com.kwad.components.ad.splashscreen.presenter.o$3 r1 = new com.kwad.components.ad.splashscreen.presenter.o$3
            r1.<init>(r2, r3)
            r0.b(r1)
            android.content.Context r3 = r2.getContext()
            android.os.Vibrator r4 = r2.gZ
            com.kwad.sdk.utils.bw.a(r3, r4)
            r2.mr()
        L27:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSingleTap: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "SplashShakePresenter"
            com.kwad.sdk.core.d.c.d(r0, r4)
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r4 = com.kwad.sdk.core.response.b.b.ea(r4)
            if (r4 != 0) goto L22
            goto L30
        L22:
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            if (r4 == 0) goto L30
            android.content.Context r0 = r3.getContext()
            r1 = 158(0x9e, float:2.21E-43)
            r2 = 1
            r4.c(r2, r0, r1, r2)
        L30:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void ak(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSlide: enableSlickClick: "
            r0.<init>(r1)
            boolean r1 = r3.FV
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SplashShakePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = r3.FV
            if (r0 != 0) goto L1a
            goto L28
        L1a:
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            if (r0 == 0) goto L28
            android.content.Context r4 = r4.getContext()
            r1 = 153(0x99, float:2.14E-43)
            r2 = 1
            r0.c(r2, r4, r1, r2)
        L28:
            return
    }

    @Override // com.kwad.sdk.core.g.b
    public final void cd() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.ca(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void fM() {
            r2 = this;
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r2.Hl
            com.kwad.components.ad.splashscreen.presenter.o$2 r1 = new com.kwad.components.ad.splashscreen.presenter.o$2
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void i(int r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = r2.Hi
            if (r0 == 0) goto L1c
            r1 = 2
            if (r3 != r1) goto Lb
            r0.setText(r4)
            return
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "或点击"
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
        L1c:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void initView() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.mStartTime = r0
            android.view.View r0 = r2.getRootView()
            com.kwad.components.ad.splashscreen.presenter.o$1 r1 = new com.kwad.components.ad.splashscreen.presenter.o$1
            r1.<init>(r2)
            r0.post(r1)
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L22
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r2.gZ = r0
        L22:
            int r0 = com.kwad.sdk.R.id.ksad_shake_layout
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L35
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.Hr = r0
            goto L3f
        L35:
            int r0 = com.kwad.sdk.R.id.ksad_shake_root
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.Hr = r0
        L3f:
            android.view.ViewGroup r0 = r2.Hr
            int r1 = com.kwad.sdk.R.id.ksad_shake_action
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Hi = r0
            android.view.ViewGroup r0 = r2.Hr
            int r1 = com.kwad.sdk.R.id.ksad_shake_view
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = (com.kwad.components.ad.splashscreen.widget.KsShakeView) r0
            r2.Hl = r0
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void lG() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bH(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mn() {
            r4 = this;
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.splashscreen.h r1 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            r3 = 2
            com.kwad.components.ad.splashscreen.d r0 = com.kwad.components.ad.splashscreen.d.a(r2, r0, r1, r3)
            r4.GN = r0
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.ea(r0)
            r4.FV = r0
            com.kwad.sdk.widget.h r0 = new com.kwad.sdk.widget.h
            com.kwad.components.ad.splashscreen.widget.KsShakeView r1 = r4.Hl
            android.content.Context r1 = r1.getContext()
            com.kwad.components.ad.splashscreen.widget.KsShakeView r2 = r4.Hl
            r0.<init>(r1, r2, r4)
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            r0.a(r4)
            android.widget.TextView r0 = r4.Hi
            if (r0 == 0) goto L3e
            com.kwad.components.ad.splashscreen.d r1 = r4.GN
            java.lang.String r1 = r1.lA()
            r0.setText(r1)
        L3e:
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r4.Hl
            if (r0 == 0) goto L4b
            com.kwad.components.ad.splashscreen.d r1 = r4.GN
            int r1 = r1.lB()
            r0.aq(r1)
        L4b:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mo() {
            r3 = this;
            android.view.ViewGroup r0 = r3.Hr
            if (r0 == 0) goto L1d
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            if (r1 == 0) goto L1d
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1 = 0
            r2 = 185(0xb9, float:2.59E-43)
            com.kwad.sdk.core.adlog.c.b(r0, r2, r1)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            r0.bm(r2)
        L1d:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mp() {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            float r0 = com.kwad.sdk.core.response.b.b.dj(r0)
            com.kwad.sdk.core.g.d r1 = r2.gX
            if (r1 != 0) goto L17
            com.kwad.sdk.core.g.d r1 = new com.kwad.sdk.core.g.d
            r1.<init>(r0)
            r2.gX = r1
            r1.a(r2)
            return
        L17:
            r1.g(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mq() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bG(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mr() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bH(r1)
        Lb:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onClick: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SplashShakePresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r3.Hl
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L39
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            if (r4 == 0) goto L39
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            if (r4 == 0) goto L39
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r4 = com.kwad.sdk.core.response.b.b.ea(r4)
            if (r4 == 0) goto L39
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            android.content.Context r0 = r3.getContext()
            r1 = 158(0x9e, float:2.21E-43)
            r2 = 1
            r4.c(r2, r0, r1, r2)
        L39:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            java.lang.String r0 = "SplashShakePresenter"
            java.lang.String r1 = "onUnbind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 == 0) goto L11
            r0.b(r2)
        L11:
            com.kwad.components.ad.splashscreen.widget.KsShakeView r0 = r2.Hl
            if (r0 == 0) goto L18
            r0.ny()
        L18:
            return
    }
}
