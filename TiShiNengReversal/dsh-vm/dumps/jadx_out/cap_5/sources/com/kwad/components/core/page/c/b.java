package com.kwad.components.core.page.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.Presenter {
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.components.core.webview.jshandler.as.b eW;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;


    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.page.c.b$1 r0 = new com.kwad.components.core.page.c.b$1
            r0.<init>(r1)
            r1.eW = r0
            return
    }

    private void a(com.kwad.components.core.webview.a r4) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r3.eW
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aS(r2)
            r0.<init>(r1, r2)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.o r0 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.b(r0)
            com.kwad.components.core.webview.jshandler.n r0 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.b(r0)
            return
    }

    private void bc() {
            r2 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r2.eQ = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r2.eQ
            r1 = 0
            r0.mScreenOrientation = r1
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.mAdWebView
            r0.Ta = r1
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void be() {
            r3 = this;
            r3.bf()
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.mAdWebView
            r0.<init>(r1)
            r3.eP = r0
            r3.a(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.mAdWebView
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

    @Override // com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            java.lang.Object r0 = r2.NN()
            com.kwad.components.core.page.recycle.e r0 = (com.kwad.components.core.page.recycle.e) r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
            r2.mAdTemplate = r0
            android.view.View r0 = r2.getRootView()
            int r1 = com.kwad.sdk.R.id.ksad_video_webView
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r2.mAdWebView = r0
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r1 = 1
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bD(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.mAdWebView
            r1.setClientConfig(r0)
            r2.bc()
            r2.be()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aS(r1)
            r0.loadUrl(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.mAdWebView
            r0.onActivityCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r1.bf()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.mAdWebView
            if (r0 == 0) goto L10
            r0.onActivityDestroy()
            r0 = 0
            r1.mAdWebView = r0
        L10:
            return
    }
}
