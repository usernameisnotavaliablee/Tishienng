package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.ad.reward.presenter.b {

    @androidx.annotation.Nullable
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
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.ad.reward.e.g mPlayEndPageListener;
    private java.lang.String mUrl;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl rG;
    private com.kwad.components.core.widget.KsLogoView vN;
    private com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.d yc;
    private boolean yu;
    private long yv;










    public f() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.eR = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$1 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$1
            r0.<init>(r1)
            r1.yc = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$2 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$2
            r0.<init>(r1)
            r1.mPlayEndPageListener = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$3 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$3
            r0.<init>(r1)
            r1.eT = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$5 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$5
            r0.<init>(r1)
            r1.eU = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$6 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$6
            r0.<init>(r1)
            r1.eV = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$7 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$7
            r0.<init>(r1)
            r1.eW = r0
            return
    }

    private void X(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.cL(r2)
            if (r2 != 0) goto Lb
            goto L19
        Lb:
            boolean r2 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r2 != 0) goto L19
            com.kwad.components.core.widget.KsLogoView r2 = r1.vN
            if (r2 == 0) goto L19
            r0 = 0
            r2.setVisibility(r0)
        L19:
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0, int r1) {
            r0.eR = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.al.a a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0, com.kwad.components.core.webview.jshandler.al.a r1) {
            r0.eO = r1
            return r1
    }

    private void a(com.kwad.components.core.webview.a r10) {
            r9 = this;
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            com.kwad.components.core.e.d.c r2 = r9.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r3 = r9.eT
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            r10.a(r0)
            com.kwad.components.core.webview.tachikoma.b.f r0 = new com.kwad.components.core.webview.tachikoma.b.f
            r0.<init>()
            r10.a(r0)
            com.kwad.components.ad.reward.k.q r1 = new com.kwad.components.ad.reward.k.q
            com.kwad.sdk.core.webview.b r2 = r9.eQ
            com.kwad.components.core.e.d.c r3 = r9.mApkDownloadHelper
            com.kwad.components.ad.reward.g r4 = r9.tm
            com.kwad.sdk.core.webview.d.a.a r7 = r9.eT
            r8 = 0
            r5 = -1
            r1.<init>(r2, r3, r4, r5, r7, r8)
            r10.a(r1)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.ae r0 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.al r0 = new com.kwad.components.core.webview.jshandler.al
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            com.kwad.components.core.webview.jshandler.al$b r2 = r9.eU
            r0.<init>(r1, r2)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r9.eW
            com.kwad.components.ad.reward.g r2 = r9.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            java.lang.String r2 = com.kwad.sdk.core.response.b.b.cw(r2)
            r0.<init>(r1, r2)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.az r0 = new com.kwad.components.core.webview.jshandler.az
            r0.<init>()
            r9.eS = r0
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            com.kwad.components.core.e.d.c r2 = r9.mApkDownloadHelper
            r0.<init>(r1, r2)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.ak r0 = new com.kwad.components.core.webview.jshandler.ak
            com.kwad.components.core.webview.jshandler.ak$b r1 = r9.eV
            r0.<init>(r1)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.o r0 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.b(r0)
            com.kwad.components.core.webview.jshandler.n r0 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r1 = r9.eQ
            r0.<init>(r1)
            r10.b(r0)
            com.kwad.components.ad.reward.i.b r0 = new com.kwad.components.ad.reward.i.b
            android.content.Context r1 = r9.getContext()
            com.kwad.components.ad.reward.g r2 = r9.tm
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.components.core.playable.PlayableSource r3 = com.kwad.components.core.playable.PlayableSource.ACTIONBAR_CLICK
            r0.<init>(r1, r2, r3)
            r10.a(r0)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            boolean r0 = r0.yu
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r1) {
            boolean r0 = r0.f(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0, boolean r1) {
            r0.yu = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            r0.release()
            return
    }

    private void bc() {
            r3 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r3.eQ = r0
            com.kwad.components.ad.reward.g r1 = r3.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r3.eQ
            com.kwad.components.ad.reward.g r1 = r3.tm
            int r2 = r1.mScreenOrientation
            r0.mScreenOrientation = r2
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r1.mRootContainer
            r0.aMN = r1
            r0.TG = r1
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.eN
            r0.Ta = r1
            return
    }

    private void bd() {
            r4 = this;
            r0 = -1
            r4.eR = r0
            r4.be()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            com.kwad.components.ad.reward.g r1 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r4.ju()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r4.eN
            r1.setClientConfig(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.yv = r0
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.cw(r0)
            r4.mUrl = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startPreloadWebView url: "
            r0.<init>(r1)
            java.lang.String r1 = r4.mUrl
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RewardActionBarWeb"
            com.kwad.sdk.core.d.c.d(r1, r0)
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            boolean r0 = r0.rS
            java.lang.String r2 = "play_card"
            java.lang.String r3 = r4.mUrl
            com.kwad.components.ad.reward.monitor.c.a(r1, r0, r2, r3)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            java.lang.String r1 = r4.mUrl
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

    private void bi() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r2.X(r0)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto Le
            r0.uF()
        Le:
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
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$9 r1 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$9
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
            goto L1d
        L9:
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L10
            r0.uH()
        L10:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L1d
            r0.uI()
        L1d:
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
            java.lang.String r1 = "RewardActionBarWeb"
            com.kwad.sdk.core.d.c.w(r1, r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private void dm() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 == 0) goto L22
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.cy(r0)
            if (r0 != 0) goto Lf
            goto L22
        Lf:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.core.e.d.c r0 = r0.mApkDownloadHelper
            r2.mApkDownloadHelper = r0
            r2.bc()
            r2.bd()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.b(r1)
        L22:
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    private boolean f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r4) {
            r3 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 != 0) goto Le
            return r2
        Le:
            int r0 = r3.eR
            if (r0 != r2) goto L16
            r3.g(r4)
            return r2
        L16:
            r3.bm()
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView g(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.eN
            return r0
    }

    private void g(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a r5) {
            r4 = this;
            com.kwad.components.core.webview.jshandler.al$a r0 = r4.eO
            if (r0 != 0) goto L8
            r4.bi()
            return
        L8:
            com.kwad.components.ad.reward.g r0 = r4.tm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.X(r0)
            r4.bl()
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
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.eX
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$8 r1 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$8
            r1.<init>(r4, r5)
            r0.addListener(r1)
            android.animation.ValueAnimator r5 = r4.eX
            r5.start()
            return
    }

    static /* synthetic */ com.kwad.components.ad.reward.g h(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ java.lang.String i(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            java.lang.String r0 = r0.mUrl
            return r0
    }

    static /* synthetic */ void j(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            r0.bj()
            return
    }

    private com.kwad.sdk.core.webview.KsAdWebView.e ju() {
            r1 = this;
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$4 r0 = new com.kwad.components.ad.reward.presenter.platdetail.actionbar.f$4
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ long k(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r2) {
            long r0 = r2.yv
            return r0
    }

    static /* synthetic */ int l(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            int r0 = r0.eR
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g m(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g n(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g o(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g p(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g q(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            return r0
    }

    private void release() {
            r2 = this;
            r0 = -1
            r2.eR = r0
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 == 0) goto Lc
            r1 = 8
            r0.setVisibility(r1)
        Lc:
            r2.bf()
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az s(com.kwad.components.ad.reward.presenter.platdetail.actionbar.f r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.eS
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r0 = r0.rS
            java.lang.String r1 = "play_card"
            com.kwad.components.ad.reward.monitor.c.a(r0, r1)
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r0.rG
            r2.rG = r0
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl$d r1 = r2.yc
            r0.a(r1)
            r2.dm()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_play_web_card_webView
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r1.eN = r0
            int r0 = com.kwad.sdk.R.id.ksad_ad_label_play_bar
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.vN = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl r0 = r2.rG
            if (r0 == 0) goto Lb
            r1 = 0
            r0.a(r1)
        Lb:
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.e.g r1 = r2.mPlayEndPageListener
            r0.c(r1)
            r2.bl()
            r2.release()
            return
    }
}
