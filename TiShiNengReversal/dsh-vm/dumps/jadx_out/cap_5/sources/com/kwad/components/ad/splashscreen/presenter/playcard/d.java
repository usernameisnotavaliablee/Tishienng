package com.kwad.components.ad.splashscreen.presenter.playcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.splashscreen.presenter.a.c implements com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.j.c {
    com.kwad.components.ad.splashscreen.f Ix;
    private com.kwad.components.core.webview.tachikoma.b.m Jb;
    private android.widget.FrameLayout cV;
    private com.kwad.components.core.webview.jshandler.az cX;



    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.splashscreen.presenter.playcard.d$2 r0 = new com.kwad.components.ad.splashscreen.presenter.playcard.d$2
            r0.<init>(r1)
            r1.Ix = r0
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h a(com.kwad.components.ad.splashscreen.presenter.playcard.d r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.components.core.webview.jshandler.z a(com.kwad.sdk.core.webview.b r4) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            com.kwad.components.ad.splashscreen.presenter.playcard.d$1 r2 = new com.kwad.components.ad.splashscreen.presenter.playcard.d$1
            r2.<init>(r3)
            r0.<init>(r4, r1, r2)
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h b(com.kwad.components.ad.splashscreen.presenter.playcard.d r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    static /* synthetic */ android.widget.FrameLayout c(com.kwad.components.ad.splashscreen.presenter.playcard.d r0) {
            android.widget.FrameLayout r0 = r0.cV
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az d(com.kwad.components.ad.splashscreen.presenter.playcard.d r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.cX
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.components.core.webview.tachikoma.b.m ng() {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.m r0 = new com.kwad.components.core.webview.tachikoma.b.m
            r0.<init>()
            r1.Jb = r0
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            int r0 = com.kwad.sdk.c.a.a.px2dip(r0, r1)
            r3.width = r0
            android.content.Context r0 = r2.getContext()
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            int r1 = r1.getHeight()
            float r1 = (float) r1
            int r0 = com.kwad.sdk.c.a.a.px2dip(r0, r1)
            r3.height = r0
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.az r1) {
            r0 = this;
            super.a(r1)
            r0.cX = r1
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r2 = r1.cX
            if (r2 == 0) goto Lc
            r2.uH()
            com.kwad.components.core.webview.jshandler.az r2 = r1.cX
            r2.uI()
        Lc:
            android.widget.FrameLayout r2 = r1.cV
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            super.a(r1, r2)
            com.kwad.components.core.webview.jshandler.z r2 = r0.a(r2)
            r1.c(r2)
            com.kwad.components.core.webview.tachikoma.b.m r2 = r0.ng()
            r1.c(r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void ak(int r2) {
            r1 = this;
            com.kwad.components.core.webview.tachikoma.b.m r0 = r1.Jb
            if (r0 == 0) goto L7
            r0.bj(r2)
        L7:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r0.Fr
            com.kwad.components.ad.splashscreen.monitor.b.b(r1, r0)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r2)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            r0.a(r2)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.f r1 = r2.Ix
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            boolean r0 = r0.bO
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto L13
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uG()
        L13:
            android.widget.FrameLayout r0 = r2.cV
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            boolean r0 = r0.bO
            if (r0 == 0) goto L7
            goto Le
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Le
            r0.uJ()
        Le:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            boolean r0 = r0.bO
            if (r0 == 0) goto L7
            goto Le
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Le
            r0.uK()
        Le:
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final android.widget.FrameLayout getTKContainer() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.cV
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTKReaderScene() {
            r1 = this;
            java.lang.String r0 = "tk_splash"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dK(r0)
            return r0
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void lG() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c
    public final int nf() {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.ad.splashscreen.h r2 = r5.Gf
            long r3 = r2.Fz
            long r0 = r0 - r3
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            long r2 = com.kwad.sdk.core.response.b.b.dG(r2)
            long r2 = r2 - r0
            int r0 = (int) r2
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.splash_tk_play_card_view
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.cV = r0
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uI()
        Lc:
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r2)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.components.ad.splashscreen.f r1 = r2.Ix
            r0.b(r1)
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            r0.b(r2)
            return
    }
}
