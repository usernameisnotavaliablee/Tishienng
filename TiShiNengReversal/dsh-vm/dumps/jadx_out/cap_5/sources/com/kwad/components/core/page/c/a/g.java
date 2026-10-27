package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.core.page.c.a.a implements com.kwad.components.core.webview.jshandler.a.c {
    private static final android.os.Handler iK = null;
    private final com.kwad.sdk.core.c.c An;
    private com.kwad.components.core.webview.jshandler.b TN;
    public com.kwad.components.core.page.AdWebViewActivityProxy.a Tu;
    private boolean Uj;
    private boolean Uk;
    private com.kwad.components.core.webview.jshandler.az Ul;
    private com.kwad.components.core.webview.jshandler.av Um;
    private java.lang.String Un;
    private java.lang.Runnable Uo;
    private com.kwad.components.core.webview.b iP;
    private com.kwad.components.core.webview.c iQ;
    public com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;







    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.kwad.components.core.page.c.a.g.iK = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Uj = r0
            r1.Uk = r0
            com.kwad.components.core.page.c.a.g$2 r0 = new com.kwad.components.core.page.c.a.g$2
            r0.<init>(r1)
            r1.An = r0
            com.kwad.components.core.page.c.a.g$3 r0 = new com.kwad.components.core.page.c.a.g$3
            r0.<init>(r1)
            r1.TN = r0
            com.kwad.components.core.page.c.a.g$4 r0 = new com.kwad.components.core.page.c.a.g$4
            r0.<init>(r1)
            r1.iQ = r0
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.av a(com.kwad.components.core.page.c.a.g r0, com.kwad.components.core.webview.jshandler.av r1) {
            r0.Um = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az a(com.kwad.components.core.page.c.a.g r0, com.kwad.components.core.webview.jshandler.az r1) {
            r0.Ul = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView a(com.kwad.components.core.page.c.a.g r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.mAdWebView
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView a(com.kwad.components.core.page.c.a.g r0, com.kwad.sdk.core.webview.KsAdWebView r1) {
            r1 = 0
            r0.mAdWebView = r1
            return r1
    }

    static /* synthetic */ java.lang.Runnable a(com.kwad.components.core.page.c.a.g r0, java.lang.Runnable r1) {
            r0.Uo = r1
            return r1
    }

    static /* synthetic */ java.lang.String a(com.kwad.components.core.page.c.a.g r0, java.lang.String r1) {
            r0.Un = r1
            return r1
    }

    static /* synthetic */ boolean a(com.kwad.components.core.page.c.a.g r0, boolean r1) {
            r0.Uj = r1
            return r1
    }

    static /* synthetic */ java.lang.String b(com.kwad.components.core.page.c.a.g r0) {
            java.lang.String r0 = r0.Un
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.page.c.a.g r0, boolean r1) {
            r1 = 1
            r0.Uk = r1
            return r1
    }

    static /* synthetic */ java.lang.Runnable c(com.kwad.components.core.page.c.a.g r0) {
            java.lang.Runnable r0 = r0.Uo
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.av d(com.kwad.components.core.page.c.a.g r0) {
            com.kwad.components.core.webview.jshandler.av r0 = r0.Um
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.b e(com.kwad.components.core.page.c.a.g r0) {
            com.kwad.components.core.webview.jshandler.b r0 = r0.TN
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.core.page.c.a.g r0) {
            boolean r0 = r0.Uk
            return r0
    }

    private void ft() {
            r3 = this;
            com.kwad.components.core.webview.b r0 = new com.kwad.components.core.webview.b
            r0.<init>()
            r3.iP = r0
            com.kwad.components.core.webview.b$a r0 = new com.kwad.components.core.webview.b$a
            r0.<init>()
            com.kwad.components.core.page.c.a.b r1 = r3.TJ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.components.core.webview.b$a r0 = r0.aM(r1)
            com.kwad.components.core.page.c.a.b r1 = r3.TJ
            java.lang.String r1 = r1.mPageUrl
            com.kwad.components.core.webview.b$a r0 = r0.aP(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            com.kwad.components.core.webview.b$a r0 = r0.d(r1)
            com.kwad.components.core.page.c.a.b r1 = r3.TJ
            android.view.ViewGroup r1 = r1.jI
            com.kwad.components.core.webview.b$a r0 = r0.k(r1)
            com.kwad.components.core.webview.c r1 = r3.iQ
            com.kwad.components.core.webview.b$a r0 = r0.a(r1)
            com.kwad.components.core.page.c.a.b r1 = r3.TJ
            com.kwad.sdk.core.webview.KsAdWebView$c r1 = r1.TL
            com.kwad.components.core.webview.b$a r0 = r0.b(r1)
            com.kwad.components.core.webview.b$a r0 = r0.a(r3)
            com.kwad.components.core.webview.b r1 = r3.iP
            r1.a(r0)
            r3.rp()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.components.core.page.AdWebViewActivityProxy$a r1 = r3.Tu
            int r1 = r1.qS()
            com.kwad.components.core.page.AdWebViewActivityProxy$a r2 = r3.Tu
            java.lang.String r2 = r2.qR()
            com.kwad.sdk.commercial.g.a.l(r0, r1, r2)
            com.kwad.components.core.page.c.a.g$1 r0 = new com.kwad.components.core.page.c.a.g$1
            r0.<init>(r3)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            com.kwad.sdk.core.webview.a.c$a r1 = r1.getClientConfig()
            r0.setClientConfig(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            r1.setWebViewClient(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            com.kwad.components.core.page.c.a.b r1 = r3.TJ
            java.lang.String r1 = r1.mPageUrl
            r0.loadUrl(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
            r0.onActivityCreate()
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void rp() {
            r6 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r6.mAdWebView
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r1 = 1
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bD(r1)
            com.kwad.components.core.page.c.a.b r2 = r6.TJ
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r2)
            r2 = 0
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bB(r2)
            com.kwad.sdk.core.webview.KsAdWebView r2 = r6.mAdWebView
            r2.setClientConfig(r0)
            com.kwad.components.core.page.c.a.b r0 = r6.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r2 = com.kwad.sdk.core.response.b.a.bL(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            com.kwad.components.core.page.c.a.g$5 r0 = new com.kwad.components.core.page.c.a.g$5
            r0.<init>(r6)
            com.kwad.components.core.page.c.a.b r1 = r6.TJ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            long r1 = com.kwad.sdk.core.response.b.a.bL(r1)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            goto L5f
        L44:
            com.kwad.components.core.page.c.a.b r0 = r6.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r2 = com.kwad.sdk.core.response.b.a.bL(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L5f
            com.kwad.sdk.core.webview.KsAdWebView r0 = r6.mAdWebView
            if (r0 == 0) goto L5f
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r0.bB(r1)
        L5f:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r6.mAdWebView
            com.kwad.components.core.page.c.a.g$6 r1 = new com.kwad.components.core.page.c.a.g$6
            r1.<init>(r6)
            r0.setOnTouchListener(r1)
            return
    }

    static /* synthetic */ android.os.Handler rr() {
            android.os.Handler r0 = com.kwad.components.core.page.c.a.g.iK
            return r0
    }

    @Override // com.kwad.components.core.page.c.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.components.core.page.AdWebViewActivityProxy$a r1 = r0.Tu
            r2.Tu = r1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            r2.ft()
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r2.An
            com.kwad.sdk.core.c.b.a(r0)
            return
    }

    public final void hide() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.Ul
            if (r0 == 0) goto L7
            r0.uH()
        L7:
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.mAdWebView
            if (r0 == 0) goto L12
            r1 = 8
            r0.setVisibility(r1)
        L12:
            com.kwad.components.core.webview.jshandler.az r0 = r2.Ul
            if (r0 == 0) goto L19
            r0.uI()
        L19:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_webview
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r1.mAdWebView = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.core.webview.b r0 = r1.iP
            r0.kz()
            com.kwad.sdk.core.c.b.Ho()
            com.kwad.sdk.core.c.c r0 = r1.An
            com.kwad.sdk.core.c.b.b(r0)
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.a.c
    public final void rq() {
            r1 = this;
            android.app.Activity r0 = r1.getActivity()
            if (r0 == 0) goto L9
            r0.finish()
        L9:
            return
    }

    public final void show() {
            r2 = this;
            boolean r0 = r2.Uj
            if (r0 != 0) goto L5
            goto L22
        L5:
            com.kwad.components.core.webview.jshandler.az r0 = r2.Ul
            if (r0 == 0) goto Lc
            r0.uF()
        Lc:
            com.kwad.components.core.page.c.a.b r0 = r2.TJ     // Catch: java.lang.Exception -> L17
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.mAdWebView     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L1b
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L17
            goto L1b
        L17:
            r0 = move-exception
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
        L1b:
            com.kwad.components.core.webview.jshandler.az r0 = r2.Ul
            if (r0 == 0) goto L22
            r0.uG()
        L22:
            return
    }
}
