package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m extends com.kwad.components.ad.splashscreen.presenter.i implements android.view.View.OnClickListener, com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.g.a {
    private android.widget.TextView GI;
    private com.kwad.components.ad.splashscreen.d GN;
    private android.view.View Hd;
    private com.kwad.components.ad.splashscreen.widget.KsRotateView He;
    private android.widget.TextView Hf;
    private com.kwad.sdk.core.g.c gY;
    private long mStartTime;




    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.KsRotateView a(com.kwad.components.ad.splashscreen.presenter.m r0) {
            com.kwad.components.ad.splashscreen.widget.KsRotateView r0 = r0.He
            return r0
    }

    static /* synthetic */ long b(com.kwad.components.ad.splashscreen.presenter.m r2) {
            long r0 = r2.mStartTime
            return r0
    }

    @androidx.annotation.Nullable
    private android.content.Context mv() {
            r2 = this;
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> L5
            goto La
        L5:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            r0 = 0
        La:
            if (r0 != 0) goto L14
            android.view.View r1 = r2.Hd
            if (r1 == 0) goto L14
            android.content.Context r0 = r1.getContext()
        L14:
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void ak(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i, com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            android.view.View r0 = r2.getRootView()
            if (r0 != 0) goto La
            goto L19
        La:
            com.kwad.components.ad.splashscreen.presenter.m$2 r1 = new com.kwad.components.ad.splashscreen.presenter.m$2
            r1.<init>(r2)
            r0.post(r1)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 == 0) goto L19
            r0.a(r2)
        L19:
            return
    }

    @Override // com.kwad.sdk.core.g.a
    public final void ce() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.adlog.c.ca(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void fM() {
            r2 = this;
            com.kwad.components.ad.splashscreen.widget.KsRotateView r0 = r2.He
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.ad.splashscreen.presenter.m$1 r1 = new com.kwad.components.ad.splashscreen.presenter.m$1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void i(int r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = r2.GI
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
            int r0 = com.kwad.sdk.R.id.ksad_rotate_layout
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L17
            android.view.View r0 = r0.inflate()
            r2.Hd = r0
            goto L1f
        L17:
            int r0 = com.kwad.sdk.R.id.ksad_rotate_root
            android.view.View r0 = r2.findViewById(r0)
            r2.Hd = r0
        L1f:
            int r0 = com.kwad.sdk.R.id.ksad_rotate_text
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Hf = r0
            int r0 = com.kwad.sdk.R.id.ksad_rotate_action
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.GI = r0
            int r0 = com.kwad.sdk.R.id.ksad_rotate_view
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.splashscreen.widget.KsRotateView r0 = (com.kwad.components.ad.splashscreen.widget.KsRotateView) r0
            r2.He = r0
            r0.setOnClickListener(r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void lG() {
            r2 = this;
            com.kwad.sdk.core.g.c r0 = r2.gY
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.mv()
            r0.bH(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mn() {
            r4 = this;
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.ad.splashscreen.h r2 = r4.Gf
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            r3 = 1
            com.kwad.components.ad.splashscreen.d r0 = com.kwad.components.ad.splashscreen.d.a(r0, r1, r2, r3)
            r4.GN = r0
            android.widget.TextView r0 = r4.Hf
            if (r0 == 0) goto L1e
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dE(r1)
            r0.setText(r1)
        L1e:
            android.widget.TextView r0 = r4.GI
            if (r0 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "或点击"
            r1.<init>(r2)
            com.kwad.components.ad.splashscreen.d r2 = r4.GN
            java.lang.String r2 = r2.lA()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
        L39:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mo() {
            r3 = this;
            android.view.View r0 = r3.Hd
            if (r0 == 0) goto L1d
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            if (r1 == 0) goto L1d
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.ad.splashscreen.h r0 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r1 = 0
            r2 = 184(0xb8, float:2.58E-43)
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
            com.kwad.sdk.core.response.model.AdMatrixInfo$RotateInfo r0 = com.kwad.sdk.core.response.b.b.dk(r0)
            com.kwad.sdk.core.g.c r1 = r2.gY
            if (r1 != 0) goto L17
            com.kwad.sdk.core.g.c r1 = new com.kwad.sdk.core.g.c
            r1.<init>(r0)
            r2.gY = r1
            r1.a(r2)
            return
        L17:
            r1.b(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mq() {
            r2 = this;
            com.kwad.sdk.core.g.c r0 = r2.gY
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.mv()
            r0.bG(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i
    protected final void mr() {
            r2 = this;
            com.kwad.sdk.core.g.c r0 = r2.gY
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.mv()
            r0.bH(r1)
        Lb:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            android.content.Context r0 = r3.mv()
            r1 = 162(0xa2, float:2.27E-43)
            r2 = 1
            r4.c(r2, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.i, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            java.lang.String r0 = "SplashRotatePresenter"
            java.lang.String r1 = "onUnbind"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 == 0) goto L11
            r0.b(r2)
        L11:
            return
    }

    @Override // com.kwad.sdk.core.g.a
    public final void r(java.lang.String r8) {
            r7 = this;
            com.kwad.components.ad.splashscreen.h r0 = r7.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            boolean r0 = r0.wl()
            boolean r1 = com.kwad.components.core.e.c.b.oW()
            if (r0 == 0) goto L30
            if (r1 == 0) goto L11
            goto L30
        L11:
            com.kwad.components.ad.splashscreen.widget.KsRotateView r0 = r7.He
            r0.nw()
            com.kwad.components.ad.splashscreen.h r1 = r7.Gf
            if (r1 == 0) goto L2a
            android.content.Context r3 = r7.mv()
            com.kwad.components.ad.splashscreen.presenter.m$3 r6 = new com.kwad.components.ad.splashscreen.presenter.m$3
            r6.<init>(r7, r8)
            r2 = 1
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 2
            r1.a(r2, r3, r4, r5, r6)
        L2a:
            r7.mt()
            r7.mr()
        L30:
            return
    }
}
