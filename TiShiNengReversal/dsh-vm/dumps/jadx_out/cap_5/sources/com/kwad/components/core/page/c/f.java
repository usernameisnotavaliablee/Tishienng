package com.kwad.components.core.page.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.core.page.c.c {
    private int TF;
    private android.view.ViewGroup TG;
    private final com.kwad.components.core.page.c.f.a TH;
    private android.webkit.WebView Ta;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private final boolean mIsRewardLandPage;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void aP(int r1);
    }

    public f(com.kwad.components.core.page.c.f.a r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.TF = r0
            r1.TH = r2
            r1.mIsRewardLandPage = r3
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.page.c.f r0, int r1) {
            r0.TF = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.page.c.f.a a(com.kwad.components.core.page.c.f r0) {
            com.kwad.components.core.page.c.f$a r0 = r0.TH
            return r0
    }

    private void a(com.kwad.components.core.webview.a r9) {
            r8 = this;
            java.lang.String r0 = "LandPageWebViewPresenter"
            java.lang.String r1 = "registerWebCardHandler"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.e.d.c r4 = new com.kwad.components.core.e.d.c
            com.kwad.components.core.page.c.d r0 = r8.TD
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.<init>(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1, r4)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.ae r0 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.az r0 = new com.kwad.components.core.webview.jshandler.az
            r0.<init>()
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r8.rd()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.cI(r2)
            r0.<init>(r1, r2)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.o r0 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.b(r0)
            com.kwad.components.core.webview.jshandler.n r0 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r0.<init>(r1)
            r9.b(r0)
            com.kwad.components.core.webview.jshandler.aq r0 = new com.kwad.components.core.webview.jshandler.aq
            com.kwad.components.core.webview.jshandler.aq$a r1 = r8.getOpenNewPageListener()
            r0.<init>(r1)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r8.eQ
            r2 = 0
            r3 = 0
            r0.<init>(r1, r4, r2, r3)
            r9.a(r0)
            com.kwad.components.core.webview.jshandler.z r2 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r3 = r8.eQ
            r6 = 2
            boolean r7 = r8.mIsRewardLandPage
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r9.a(r2)
            return
    }

    private void aB(java.lang.String r2) {
            r1 = this;
            r1.be()
            android.webkit.WebView r0 = r1.Ta
            r0.loadUrl(r2)
            return
    }

    static /* synthetic */ android.view.ViewGroup b(com.kwad.components.core.page.c.f r0) {
            android.view.ViewGroup r0 = r0.TG
            return r0
    }

    private void bc() {
            r2 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r2.eQ = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r2.eQ
            android.view.ViewGroup r1 = r2.TG
            r0.TG = r1
            android.webkit.WebView r1 = r2.Ta
            r0.Ta = r1
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void be() {
            r3 = this;
            r3.bf()
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            android.webkit.WebView r1 = r3.Ta
            r0.<init>(r1)
            r3.eP = r0
            r3.a(r0)
            android.webkit.WebView r0 = r3.Ta
            com.kwad.components.core.webview.a r1 = r3.eP
            java.lang.String r2 = "KwaiAd"
            r0.addJavascriptInterface(r1, r2)
            return
    }

    private void bf() {
            r1 = this;
            com.kwad.components.core.webview.a r0 = r1.eP
            if (r0 == 0) goto La
            r0.destroy()
            r0 = 0
            r1.eP = r0
        La:
            return
    }

    static /* synthetic */ android.webkit.WebView c(com.kwad.components.core.page.c.f r0) {
            android.webkit.WebView r0 = r0.Ta
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.core.page.c.f r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private com.kwad.components.core.webview.jshandler.aq.a getOpenNewPageListener() {
            r1 = this;
            com.kwad.components.core.page.c.f$2 r0 = new com.kwad.components.core.page.c.f$2
            r0.<init>(r1)
            return r0
    }

    private com.kwad.components.core.webview.jshandler.as.b rd() {
            r1 = this;
            com.kwad.components.core.page.c.f$1 r0 = new com.kwad.components.core.page.c.f$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.core.page.c.c, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.page.c.d r0 = r2.TD
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.mAdTemplate = r0
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.cI(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1a
            r2.bc()
            r2.aB(r0)
            return
        L1a:
            com.kwad.components.core.page.c.f$a r0 = r2.TH
            if (r0 == 0) goto L23
            int r1 = r2.TF
            r0.aP(r1)
        L23:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_landing_page_webview
            android.view.View r0 = r2.findViewById(r0)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r2.Ta = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_card_container
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.TG = r0
            android.webkit.WebView r0 = r2.Ta
            r1 = 0
            r0.setBackgroundColor(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            r0.bf()
            return
    }
}
