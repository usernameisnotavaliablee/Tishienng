package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h extends com.kwad.components.ad.splashscreen.presenter.a.c implements com.kwad.sdk.core.j.c {
    private android.widget.FrameLayout cV;
    private com.kwad.components.core.webview.jshandler.az cX;


    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h a(com.kwad.components.ad.splashscreen.presenter.endcard.h r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.components.core.webview.jshandler.z a(com.kwad.sdk.core.webview.b r4) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            com.kwad.components.core.e.d.c r1 = r1.mApkDownloadHelper
            com.kwad.components.ad.splashscreen.presenter.endcard.h$1 r2 = new com.kwad.components.ad.splashscreen.presenter.endcard.h$1
            r2.<init>(r3)
            r0.<init>(r4, r1, r2)
            return r0
    }

    private void an(int r4) {
            r3 = this;
            com.kwad.sdk.core.adlog.a$a r0 = new com.kwad.sdk.core.adlog.a$a
            r0.<init>()
            com.kwad.components.ad.splashscreen.h r1 = r3.Gf
            com.kwad.sdk.utils.bv r1 = r1.mTimerHelper
            if (r1 == 0) goto L11
            long r1 = r1.getTime()
            r0.duration = r1
        L11:
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 6
            com.kwad.sdk.core.adlog.c.b r1 = r1.dm(r2)
            com.kwad.sdk.core.adlog.c.b r0 = r1.b(r0)
            r1 = 2
            if (r4 != r1) goto L28
            r4 = 14
            r0.de(r4)
            goto L2c
        L28:
            r4 = 1
            r0.de(r4)
        L2c:
            com.kwad.components.ad.splashscreen.h r4 = r3.Gf
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            r1 = 0
            com.kwad.sdk.core.adlog.c.b(r4, r0, r1)
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.h b(com.kwad.components.ad.splashscreen.presenter.endcard.h r0) {
            com.kwad.components.ad.splashscreen.h r0 = r0.Gf
            return r0
    }

    private void mX() {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf     // Catch: java.lang.NullPointerException -> L10
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.mRootContainer     // Catch: java.lang.NullPointerException -> L10
            int r1 = com.kwad.sdk.R.id.splash_play_card_view     // Catch: java.lang.NullPointerException -> L10
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.NullPointerException -> L10
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.NullPointerException -> L10
            return
        L10:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            return
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
            r1.mX()
            android.widget.FrameLayout r2 = r1.cV
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r2) {
            r1 = this;
            super.a(r2)
            int r0 = r2.closeType
            r1.an(r0)
            int r2 = r2.closeType
            r0 = 2
            if (r2 != r0) goto L13
            com.kwad.components.ad.splashscreen.h r2 = r1.Gf
            r2.lW()
            return
        L13:
            com.kwad.components.ad.splashscreen.monitor.a r2 = com.kwad.components.ad.splashscreen.monitor.a.lX()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.ah(r0)
            com.kwad.components.ad.splashscreen.h r2 = r1.Gf
            r2.lS()
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            super.a(r1, r2)
            com.kwad.components.core.webview.jshandler.z r2 = r0.a(r2)
            r1.c(r2)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r1 = this;
            super.at()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto Lc
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uG()
        Lc:
            r2.mX()
            android.widget.FrameLayout r0 = r2.cV
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto L7
            r0.uJ()
        L7:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto L7
            r0.uK()
        L7:
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
            java.lang.String r0 = "tk_splash_end_card"
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final java.lang.String getTkTemplateId() {
            r1 = this;
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.dL(r0)
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.splash_end_card_view
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.cV = r0
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.a.c, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            r0.uI()
        Lc:
            super.onUnbind()
            com.kwad.components.ad.splashscreen.h r0 = r1.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.b(r1)
            return
    }
}
