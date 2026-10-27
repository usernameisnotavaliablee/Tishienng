package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e extends com.kwad.sdk.core.download.a.a implements com.kwad.components.core.webview.jshandler.al.b, com.kwad.components.core.webview.jshandler.as.b {
    private android.view.View BO;
    private com.kwad.components.core.webview.jshandler.bf BP;
    private com.kwad.components.ad.reward.n.f BQ;
    private com.kwad.sdk.core.webview.KsAdWebView eN;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.sdk.core.webview.d.a.a eT;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private final com.kwad.components.ad.reward.e.l mRewardVerifyListener;



    public e(com.kwad.sdk.core.webview.KsAdWebView r2, android.view.View r3, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r4, com.kwad.sdk.core.webview.d.a.a r5) {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.n.e$1 r0 = new com.kwad.components.ad.reward.n.e$1
            r0.<init>(r1)
            r1.mRewardVerifyListener = r0
            r1.BO = r3
            r1.eN = r2
            r1.mApkDownloadHelper = r4
            r1.eT = r5
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void Y(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r4)
            if (r0 == 0) goto La
            r3.ld()
            return
        La:
            r3.bf()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r3.getWebErrorListener()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.eN
            r1.setClientConfig(r0)
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.eN
            r0.<init>(r1)
            r3.eP = r0
            r3.a(r0, r4)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            com.kwad.components.core.webview.a r1 = r3.eP
            java.lang.String r2 = "KwaiAd"
            r0.addJavascriptInterface(r1, r2)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            r0.loadUrl(r4)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.bf a(com.kwad.components.ad.reward.n.e r0) {
            com.kwad.components.core.webview.jshandler.bf r0 = r0.BP
            return r0
    }

    private void a(com.kwad.components.core.webview.a r5, java.lang.String r6) {
            r4 = this;
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r1 = r4.eQ
            com.kwad.components.core.e.d.c r2 = r4.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r4.eT
            r0.<init>(r1, r2, r3)
            r5.a(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r4.eQ
            r0.<init>(r1)
            r5.a(r0)
            com.kwad.components.core.webview.jshandler.ae r0 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r1 = r4.eQ
            r0.<init>(r1)
            r5.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            r0.<init>(r4, r6)
            r5.a(r0)
            com.kwad.components.core.webview.jshandler.bf r6 = new com.kwad.components.core.webview.jshandler.bf
            r6.<init>()
            r4.BP = r6
            r5.a(r6)
            com.kwad.components.core.webview.jshandler.am r6 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r6.<init>(r0)
            r5.a(r6)
            com.kwad.components.core.webview.jshandler.o r6 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r6.<init>(r0)
            r5.b(r6)
            com.kwad.components.core.webview.jshandler.n r6 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r6.<init>(r0)
            r5.b(r6)
            com.kwad.components.core.webview.jshandler.ai r6 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r6.<init>(r0)
            r5.a(r6)
            com.kwad.components.core.webview.tachikoma.b.f r6 = new com.kwad.components.core.webview.tachikoma.b.f
            r6.<init>()
            r5.a(r6)
            com.kwad.components.core.webview.jshandler.al r6 = new com.kwad.components.core.webview.jshandler.al
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            r6.<init>(r0, r4)
            r5.a(r6)
            com.kwad.components.core.webview.jshandler.bc r6 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r0 = r4.eQ
            com.kwad.components.core.e.d.c r1 = r4.mApkDownloadHelper
            r6.<init>(r0, r1)
            r5.a(r6)
            com.kwad.components.ad.reward.i.b r6 = new com.kwad.components.ad.reward.i.b
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            android.content.Context r0 = r0.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.core.playable.PlayableSource r2 = com.kwad.components.core.playable.PlayableSource.ACTIONBAR_CLICK
            r6.<init>(r0, r1, r2)
            r5.a(r6)
            return
    }

    private void ad(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "switchWebView: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BottomCardWebViewHelper"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 != 0) goto L18
            return
        L18:
            if (r3 == 0) goto L1c
            r3 = 0
            goto L1e
        L1c:
            r3 = 8
        L1e:
            r0.setVisibility(r3)
            return
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.n.e r0) {
            r0.ld()
            return
    }

    private void b(com.kwad.sdk.core.response.model.AdTemplate r2, android.view.ViewGroup r3) {
            r1 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r1.eQ = r0
            r0.setAdTemplate(r2)
            com.kwad.sdk.core.webview.b r2 = r1.eQ
            r0 = 0
            r2.mScreenOrientation = r0
            r0 = 0
            r2.aMN = r0
            r2.TG = r3
            com.kwad.sdk.core.webview.KsAdWebView r3 = r1.eN
            r2.Ta = r3
            r2.mReportExtData = r0
            r3 = 1
            r2.aMP = r3
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

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.webview.KsAdWebView.e getWebErrorListener() {
            r1 = this;
            com.kwad.components.ad.reward.n.e$2 r0 = new com.kwad.components.ad.reward.n.e$2
            r0.<init>(r1)
            return r0
    }

    private void k(java.lang.String r2, int r3) {
            r1 = this;
            com.kwad.components.ad.reward.n.f r0 = r1.BQ
            if (r0 == 0) goto L7
            r0.i(r2, r3)
        L7:
            return
    }

    private void ld() {
            r2 = this;
            android.view.View r0 = r2.BO
            r1 = 0
            if (r0 == 0) goto L8
            r0.setVisibility(r1)
        L8:
            r2.ad(r1)
            return
    }

    public final void a(com.kwad.components.ad.reward.n.f r1) {
            r0 = this;
            r0.BQ = r1
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.al.b
    public final void a(@androidx.annotation.NonNull com.kwad.components.core.webview.jshandler.al.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onAdFrameValid : "
            r0.<init>(r1)
            org.json.JSONObject r3 = r3.toJson()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BottomCardWebViewHelper"
            com.kwad.sdk.core.d.c.d(r0, r3)
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.as.b
    public final void a(com.kwad.components.core.webview.jshandler.as.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " updatePageStatus: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BottomCardWebViewHelper"
            com.kwad.sdk.core.d.c.d(r1, r0)
            int r3 = r3.status
            r0 = 1
            if (r3 != r0) goto L2a
            r2.ad(r0)
            return
        L2a:
            r2.ld()
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r3, android.view.ViewGroup r4) {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 == 0) goto L19
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L19
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r1)
        L19:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener
            r0.a(r1)
            r2.mAdTemplate = r3
            r2.b(r3, r4)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            java.lang.String r3 = com.kwad.sdk.core.response.b.b.cw(r3)
            r2.Y(r3)
            com.kwad.components.core.e.d.c r3 = r2.mApkDownloadHelper
            if (r3 == 0) goto L37
            r3.b(r2)
        L37:
            return
    }

    public final void lc() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto L7
            r0.c(r2)
        L7:
            com.kwad.components.ad.reward.b r0 = com.kwad.components.ad.reward.b.gk()
            com.kwad.components.ad.reward.e.l r1 = r2.mRewardVerifyListener
            r0.b(r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFailed() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即下载"
        Lf:
            r1 = 100
            r2.k(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onDownloadFinished() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            goto Lb
        L7:
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r0)
        Lb:
            r1 = 100
            r2.k(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onIdle() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即下载"
        Lf:
            r1 = 100
            r2.k(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onInstalled() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ac(r0)
            goto Lf
        Ld:
            java.lang.String r0 = "立即打开"
        Lf:
            r1 = 100
            r2.k(r0, r1)
            return
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int r2) {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.dG(r2)
            r1.k(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public void onProgressUpdate(int r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.dF(r2)
            r1.k(r0, r2)
        L9:
            return
    }
}
