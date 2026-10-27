package com.kwad.components.ad.c.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.c.d.c {
    private android.widget.FrameLayout cV;
    private boolean cW;
    private com.kwad.components.core.webview.jshandler.az cX;
    private com.kwad.components.core.webview.tachikoma.b.o cY;
    private boolean cp;
    private android.content.Context mContext;




    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.mContext = r1
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az a(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.cX
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.components.core.webview.jshandler.z a(com.kwad.sdk.core.webview.b r4) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.components.ad.c.d.a$2 r1 = new com.kwad.components.ad.c.d.a$2
            r1.<init>(r3)
            r2 = 0
            r0.<init>(r4, r2, r1)
            return r0
    }

    private void a(android.view.ViewGroup r3) {
            r2 = this;
            boolean r0 = com.kwad.sdk.core.config.e.FK()
            if (r0 != 0) goto L26
            float r0 = com.kwad.sdk.core.config.e.FJ()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L26
            com.kwad.components.core.widget.a r0 = new com.kwad.components.core.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r3)
            r3.addView(r0)
            com.kwad.components.ad.c.d.a$1 r3 = new com.kwad.components.ad.c.d.a$1
            r3.<init>(r2)
            r0.setViewCallback(r3)
            r0.vU()
        L26:
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.c.d.a r0, boolean r1) {
            boolean r0 = r0.f(r1)
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.c.d.a r0) {
            boolean r0 = r0.cW
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.c.d.a r0, boolean r1) {
            r0.cW = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.c.b c(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.b.o d(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.core.webview.tachikoma.b.o r0 = r0.cY
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b e(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b f(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    private boolean f(boolean r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto Ld
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            r3.aQ(r0)
            return r0
        Ld:
            boolean r3 = com.kwad.sdk.core.config.e.FL()
            r1 = 1
            if (r3 != 0) goto L39
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sX()
            if (r3 != 0) goto L2b
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r0)
            return r3
        L2b:
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.sW()
            if (r3 != 0) goto L38
            return r1
        L38:
            return r0
        L39:
            boolean r3 = r2.cp
            if (r3 != 0) goto L49
            android.content.Context r3 = r2.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            boolean r3 = r3.aQ(r1)
            r2.cp = r3
        L49:
            boolean r3 = r2.cp
            return r3
    }

    static /* synthetic */ com.kwad.components.ad.c.b g(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b h(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b i(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b j(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b k(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b l(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b m(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.c.b n(com.kwad.components.ad.c.d.a r0) {
            com.kwad.components.ad.c.b r0 = r0.cD
            return r0
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.jshandler.ae.a r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.kwad.components.ad.c.b r1 = r2.cD
            android.widget.FrameLayout r1 = r1.bH
            int r1 = r1.getWidth()
            float r1 = (float) r1
            int r0 = com.kwad.sdk.c.a.a.px2dip(r0, r1)
            r3.width = r0
            android.content.Context r0 = r2.getContext()
            com.kwad.components.ad.c.b r1 = r2.cD
            android.widget.FrameLayout r1 = r1.bH
            int r1 = r1.getHeight()
            float r1 = (float) r1
            int r0 = com.kwad.sdk.c.a.a.px2dip(r0, r1)
            r3.height = r0
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.components.core.webview.tachikoma.j
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
            com.kwad.components.ad.c.b r2 = r1.cD
            r0 = 1
            r2.bO = r0
            com.kwad.components.ad.c.b$a r2 = r2.bI
            r2.Z()
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.components.core.webview.tachikoma.b.o r2) {
            r1 = this;
            r1.cY = r2
            com.kwad.components.ad.c.d.a$3 r0 = new com.kwad.components.ad.c.d.a$3
            r0.<init>(r1)
            r2.a(r0)
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.commercial.model.WebCloseStatus r1) {
            r0 = this;
            com.kwad.components.core.webview.jshandler.az r1 = r0.cX
            r1.uI()
            com.kwad.components.ad.c.b r1 = r0.cD
            android.widget.FrameLayout r1 = r1.bH
            r1.removeAllViews()
            r0.onDestroy()
            com.kwad.components.ad.c.b r1 = r0.cD
            r1.Y()
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.components.core.webview.tachikoma.j
    public final void a(com.kwad.sdk.components.t r1, com.kwad.sdk.core.webview.b r2) {
            r0 = this;
            super.a(r1, r2)
            com.kwad.components.core.webview.jshandler.z r2 = r0.a(r2)
            r1.c(r2)
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.components.ad.c.c.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            return
    }

    @Override // com.kwad.components.core.webview.tachikoma.j
    public final void az() {
            r2 = this;
            com.kwad.components.ad.c.b r0 = r2.cD
            boolean r0 = r0.bO
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            if (r0 == 0) goto L18
            r0.uJ()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uF()
            com.kwad.components.core.webview.jshandler.az r0 = r2.cX
            r0.uG()
        L18:
            android.widget.FrameLayout r0 = r2.cV
            r1 = 0
            r0.setVisibility(r1)
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
            com.kwad.components.ad.c.b r0 = r1.cD
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdDataV2 r0 = com.kwad.sdk.core.response.b.b.cr(r0)
            com.kwad.sdk.core.response.model.AdMatrixInfo$AdBannerTKInfo r0 = r0.bannerTKInfo
            java.lang.String r0 = r0.templateId
            return r0
    }

    @Override // com.kwad.components.ad.c.c.a, com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.banner_full_tk_card_view
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.cV = r0
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.a(r0)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // com.kwad.components.ad.c.d.c, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            if (r0 == 0) goto Lc
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r1.cX
            r0.uI()
        Lc:
            super.onUnbind()
            return
    }
}
