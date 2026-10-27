package com.kwad.components.ad.draw.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.ad.draw.b.a {
    private android.view.ViewGroup dN;
    private com.kwad.components.ad.draw.presenter.b.a.b eI;
    private com.kwad.sdk.core.webview.KsAdWebView eN;
    private com.kwad.components.core.webview.jshandler.al.a eO;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private int eR;
    private com.kwad.components.core.webview.jshandler.az eS;
    private com.kwad.sdk.core.webview.d.a.a eT;
    private com.kwad.components.core.webview.jshandler.al.b eU;
    private com.kwad.components.core.webview.jshandler.ak.b eV;
    private com.kwad.components.core.webview.jshandler.as.b eW;
    private android.animation.ValueAnimator eX;
    private android.animation.ValueAnimator eY;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.video.l mVideoPlayStateListener;









    public c() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.eR = r0
            com.kwad.components.ad.draw.presenter.b.c$1 r0 = new com.kwad.components.ad.draw.presenter.b.c$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            com.kwad.components.ad.draw.presenter.b.c$2 r0 = new com.kwad.components.ad.draw.presenter.b.c$2
            r0.<init>(r1)
            r1.eI = r0
            com.kwad.components.ad.draw.presenter.b.c$3 r0 = new com.kwad.components.ad.draw.presenter.b.c$3
            r0.<init>(r1)
            r1.eT = r0
            com.kwad.components.ad.draw.presenter.b.c$4 r0 = new com.kwad.components.ad.draw.presenter.b.c$4
            r0.<init>(r1)
            r1.eU = r0
            com.kwad.components.ad.draw.presenter.b.c$5 r0 = new com.kwad.components.ad.draw.presenter.b.c$5
            r0.<init>(r1)
            r1.eV = r0
            com.kwad.components.ad.draw.presenter.b.c$6 r0 = new com.kwad.components.ad.draw.presenter.b.c$6
            r0.<init>(r1)
            r1.eW = r0
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.draw.presenter.b.c r0, int r1) {
            r0.eR = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.al.a a(com.kwad.components.ad.draw.presenter.b.c r0, com.kwad.components.core.webview.jshandler.al.a r1) {
            r0.eO = r1
            return r1
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.presenter.b.c r0) {
            r0.release()
            return
    }

    private void a(com.kwad.components.core.webview.a r6) {
            r5 = this;
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r5.eT
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r5.eT
            r0.<init>(r1, r2, r3)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ae r0 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.al r0 = new com.kwad.components.core.webview.jshandler.al
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.webview.jshandler.al$b r2 = r5.eU
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r5.eW
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.cw(r2)
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.az r0 = new com.kwad.components.core.webview.jshandler.az
            r0.<init>()
            r5.eS = r0
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            r0.<init>(r1, r2)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ak r0 = new com.kwad.components.core.webview.jshandler.ak
            com.kwad.components.core.webview.jshandler.ak$b r1 = r5.eV
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.o r0 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.b(r0)
            com.kwad.components.core.webview.jshandler.n r0 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            r0.<init>(r1)
            r6.b(r0)
            return
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.draw.presenter.b.c r0) {
            boolean r0 = r0.bg()
            return r0
    }

    private void bc() {
            r2 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r2.eQ = r0
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r2.eQ
            r1 = 0
            r0.mScreenOrientation = r1
            com.kwad.components.ad.draw.b.b r1 = r2.dz
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            r0.aMN = r1
            r0.TG = r1
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.eN
            r0.Ta = r1
            return
    }

    private void bd() {
            r2 = this;
            r0 = -1
            r2.eR = r0
            r2.be()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cw(r1)
            r0.loadUrl(r1)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void be() {
            r3 = this;
            r3.bf()
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.eN
            r0.<init>(r1)
            r3.eP = r0
            r3.a(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
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

    private boolean bg() {
            r2 = this;
            int r0 = r2.eR
            r1 = 1
            if (r0 != r1) goto L9
            r2.bh()
            return r1
        L9:
            r2.bm()
            r0 = 0
            return r0
    }

    private void bh() {
            r4 = this;
            com.kwad.components.core.webview.jshandler.al$a r0 = r4.eO
            if (r0 != 0) goto L8
            r4.bi()
            return
        L8:
            r4.bl()
            android.view.ViewGroup r0 = r4.dN
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            com.kwad.components.core.webview.jshandler.al$a r2 = r4.eO
            int r3 = r2.height
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            android.animation.ValueAnimator r0 = com.kwad.components.core.t.o.c(r0, r3, r1)
            r4.eX = r0
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.eX
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.eX
            com.kwad.components.ad.draw.presenter.b.c$7 r1 = new com.kwad.components.ad.draw.presenter.b.c$7
            r1.<init>(r4)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r4.eX
            r0.start()
            return
    }

    private void bi() {
            r2 = this;
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L7
            r0.uF()
        L7:
            android.view.ViewGroup r0 = r2.dN
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L1b
            r0.uG()
        L1b:
            return
    }

    private void bj() {
            r3 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L9
            return
        L9:
            com.kwad.components.core.webview.jshandler.al$a r0 = r3.eO
            if (r0 != 0) goto L11
            r3.bk()
            return
        L11:
            r3.bl()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            com.kwad.components.core.webview.jshandler.al$a r1 = r3.eO
            int r2 = r1.height
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = 0
            android.animation.ValueAnimator r0 = com.kwad.components.core.t.o.c(r0, r1, r2)
            r3.eY = r0
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2)
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.eY
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.eY
            com.kwad.components.ad.draw.presenter.b.c$8 r1 = new com.kwad.components.ad.draw.presenter.b.c$8
            r1.<init>(r3)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r3.eY
            r0.start()
            return
    }

    private void bk() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L9
            goto L23
        L9:
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L10
            r0.uH()
        L10:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 4
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.dN
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L23
            r0.uI()
        L23:
            return
    }

    private void bl() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.eX
            if (r0 == 0) goto Lc
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.eX
            r0.cancel()
        Lc:
            android.animation.ValueAnimator r0 = r1.eY
            if (r0 == 0) goto L18
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.eY
            r0.cancel()
        L18:
            return
    }

    private void bm() {
            r3 = this;
            int r0 = r3.eR
            r1 = -1
            if (r0 != r1) goto L8
            java.lang.String r0 = "timeout"
            goto L10
        L8:
            r1 = 1
            if (r0 == r1) goto Le
            java.lang.String r0 = "h5error"
            goto L10
        Le:
            java.lang.String r0 = "others"
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "show webCard fail, reason: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DrawPlayWebCard"
            com.kwad.sdk.core.d.c.w(r1, r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b c(com.kwad.components.ad.draw.presenter.b.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.draw.b.b d(com.kwad.components.ad.draw.presenter.b.c r0) {
            com.kwad.components.ad.draw.b.b r0 = r0.dz
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView e(com.kwad.components.ad.draw.presenter.b.c r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.eN
            return r0
    }

    static /* synthetic */ void f(com.kwad.components.ad.draw.presenter.b.c r0) {
            r0.bj()
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az g(com.kwad.components.ad.draw.presenter.b.c r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.eS
            return r0
    }

    static /* synthetic */ android.view.ViewGroup h(com.kwad.components.ad.draw.presenter.b.c r0) {
            android.view.ViewGroup r0 = r0.dN
            return r0
    }

    private void release() {
            r2 = this;
            r0 = -1
            r2.eR = r0
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 8
            r0.setVisibility(r1)
            r2.bf()
            return
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            r2.mAdTemplate = r1
            com.kwad.components.ad.draw.presenter.b.a r0 = r0.dE
            com.kwad.components.ad.draw.presenter.b.a$b r1 = r2.eI
            r0.a(r1)
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.core.e.d.c r1 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r1
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
            r2.bc()
            r2.bd()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_ad_normal_container
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.dN = r0
            int r0 = com.kwad.sdk.R.id.ksad_play_web_card_webView
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r1.eN = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.presenter.b.a r0 = r0.dE
            r1 = 0
            r0.a(r1)
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            r2.bl()
            r2.release()
            return
    }
}
