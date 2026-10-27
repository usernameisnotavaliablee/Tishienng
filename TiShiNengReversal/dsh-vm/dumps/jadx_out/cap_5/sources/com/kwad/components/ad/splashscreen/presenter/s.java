package com.kwad.components.ad.splashscreen.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s extends com.kwad.components.ad.splashscreen.presenter.e implements com.kwad.components.ad.splashscreen.e, com.kwad.components.ad.splashscreen.g, com.kwad.sdk.core.j.c {
    private com.kwad.components.ad.splashscreen.e.b HH;
    private boolean HI;
    private boolean HJ;
    private long HK;
    private com.kwad.components.core.webview.jshandler.az HL;
    private boolean HM;
    private android.view.ViewGroup HN;
    private final java.lang.Runnable HO;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.KsAdWebView eN;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.sdk.core.g.d gX;
    private android.os.Vibrator gZ;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private long mStartTime;











    public s() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.HJ = r0
            r1.HM = r0
            com.kwad.components.ad.splashscreen.presenter.s$1 r0 = new com.kwad.components.ad.splashscreen.presenter.s$1
            r0.<init>(r1)
            r1.HO = r0
            return
    }

    private android.os.Vibrator F(android.content.Context r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            android.content.Context r2 = r1.getContext()
            java.lang.String r0 = "vibrator"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.os.Vibrator r2 = (android.os.Vibrator) r2
            return r2
        Lf:
            r2 = 0
            return r2
    }

    static /* synthetic */ android.os.Vibrator a(com.kwad.components.ad.splashscreen.presenter.s r0, android.content.Context r1) {
            android.os.Vibrator r0 = r0.F(r1)
            return r0
    }

    static /* synthetic */ android.os.Vibrator a(com.kwad.components.ad.splashscreen.presenter.s r0, android.os.Vibrator r1) {
            r0.gZ = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.splashscreen.presenter.s r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void a(android.webkit.WebView r3, java.lang.String r4) {
            r2 = this;
            r2.bf()
            android.webkit.WebSettings r0 = r3.getSettings()
            r1 = 1
            r0.setAllowFileAccess(r1)
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            r0.<init>(r3)
            r2.eP = r0
            r2.a(r0, r4)
            com.kwad.components.core.webview.a r4 = r2.eP
            java.lang.String r0 = "KwaiAd"
            r3.addJavascriptInterface(r4, r0)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.s r0, double r1) {
            r0.h(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.presenter.s r0, boolean r1, int r2, int r3, java.lang.String r4) {
            r1 = 0
            r0.a(r1, r2, r3, r4)
            return
    }

    private void a(com.kwad.components.core.webview.a r4, java.lang.String r5) {
            r3 = this;
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            r0.<init>(r1, r2)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.ac r0 = r3.mD()
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.z r0 = r3.mC()
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r0.<init>(r1)
            r4.a(r0)
            com.kwad.components.core.webview.tachikoma.b.f r0 = new com.kwad.components.core.webview.tachikoma.b.f
            r0.<init>()
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.ad.splashscreen.presenter.s$4 r1 = new com.kwad.components.ad.splashscreen.presenter.s$4
            r1.<init>(r3, r5)
            r0.<init>(r1, r5)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.bb r5 = new com.kwad.components.core.webview.jshandler.bb
            com.kwad.components.ad.splashscreen.presenter.s$5 r0 = new com.kwad.components.ad.splashscreen.presenter.s$5
            r0.<init>(r3)
            r5.<init>(r0)
            r4.a(r5)
            com.kwad.components.core.webview.jshandler.am r5 = new com.kwad.components.core.webview.jshandler.am
            com.kwad.sdk.core.webview.b r0 = r3.eQ
            r5.<init>(r0)
            r4.a(r5)
            com.kwad.components.core.webview.jshandler.o r5 = new com.kwad.components.core.webview.jshandler.o
            com.kwad.sdk.core.webview.b r0 = r3.eQ
            r5.<init>(r0)
            r4.b(r5)
            com.kwad.components.core.webview.jshandler.n r5 = new com.kwad.components.core.webview.jshandler.n
            com.kwad.sdk.core.webview.b r0 = r3.eQ
            r5.<init>(r0)
            r4.b(r5)
            com.kwad.components.core.webview.jshandler.az r5 = new com.kwad.components.core.webview.jshandler.az
            r5.<init>()
            r3.HL = r5
            r4.a(r5)
            return
    }

    private void a(com.kwad.sdk.core.webview.KsAdWebView r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r3.setBackgroundColor(r0)
            r3.setVisibility(r0)
            r2.bc()
            r2.a(r3, r4)
            com.kwad.sdk.core.webview.a.c$a r0 = r3.getClientConfig()
            com.kwad.components.ad.splashscreen.h r1 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.components.ad.splashscreen.presenter.s$3 r1 = new com.kwad.components.ad.splashscreen.presenter.s$3
            r1.<init>(r2, r4)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            r3.setClientConfig(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.components.ad.splashscreen.monitor.c.d(r4, r0)
            r3.loadUrl(r4)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r2.mA()
            return
    }

    private void a(boolean r11, int r12, int r13, java.lang.String r14) {
            r10 = this;
            com.kwad.components.ad.splashscreen.h r0 = r10.Gf
            r0.X()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = r0 ^ 1
            r2 = 0
            r3 = 1
            if (r12 != r3) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r0 == 0) goto L4d
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            com.kwad.components.ad.splashscreen.h r6 = r10.Gf     // Catch: org.json.JSONException -> L2b
            if (r6 == 0) goto L4d
            com.kwad.components.ad.splashscreen.d.a r6 = r6.Fq     // Catch: org.json.JSONException -> L2b
            if (r6 == 0) goto L2e
            java.lang.String r7 = "duration"
            long r8 = r6.getCurrentPosition()     // Catch: org.json.JSONException -> L2b
            r5.put(r7, r8)     // Catch: org.json.JSONException -> L2b
            goto L2e
        L2b:
            r11 = move-exception
            r2 = r13
            goto L49
        L2e:
            if (r11 == 0) goto L33
            r2 = 153(0x99, float:2.14E-43)
            goto L37
        L33:
            if (r4 == 0) goto L37
            r2 = 132(0x84, float:1.85E-43)
        L37:
            com.kwad.sdk.core.adlog.c.b r11 = new com.kwad.sdk.core.adlog.c.b     // Catch: org.json.JSONException -> L48
            r11.<init>()     // Catch: org.json.JSONException -> L48
            com.kwad.sdk.core.adlog.c.b r11 = r11.dd(r2)     // Catch: org.json.JSONException -> L48
            com.kwad.components.ad.splashscreen.h r6 = r10.Gf     // Catch: org.json.JSONException -> L48
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate     // Catch: org.json.JSONException -> L48
            com.kwad.sdk.core.adlog.c.a(r6, r11, r5)     // Catch: org.json.JSONException -> L48
            goto L4e
        L48:
            r11 = move-exception
        L49:
            com.kwad.sdk.core.d.c.printStackTrace(r11)
            goto L4e
        L4d:
            r2 = r13
        L4e:
            com.kwad.components.core.e.d.a$a r11 = new com.kwad.components.core.e.d.a$a
            com.kwad.components.ad.splashscreen.h r5 = r10.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r5 = r5.mRootContainer
            android.content.Context r5 = r5.getContext()
            r11.<init>(r5)
            com.kwad.components.ad.splashscreen.h r5 = r10.Gf
            com.kwad.sdk.core.response.model.AdTemplate r5 = r5.mAdTemplate
            com.kwad.components.core.e.d.a$a r11 = r11.aB(r5)
            com.kwad.components.ad.splashscreen.h r5 = r10.Gf
            com.kwad.components.core.e.d.c r5 = r5.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r11 = r11.b(r5)
            com.kwad.components.core.e.d.a$a r11 = r11.aq(r4)
            com.kwad.components.core.e.d.a$a r11 = r11.aB(r12)
            if (r0 != 0) goto L76
            goto L77
        L76:
            r13 = r2
        L77:
            com.kwad.components.core.e.d.a$a r11 = r11.aA(r13)
            com.kwad.components.core.e.d.a$a r11 = r11.am(r14)
            com.kwad.components.core.e.d.a$a r11 = r11.az(r3)
            com.kwad.components.core.e.d.a$a r11 = r11.as(r1)
            com.kwad.components.ad.splashscreen.presenter.s$2 r12 = new com.kwad.components.ad.splashscreen.presenter.s$2
            r12.<init>(r10)
            com.kwad.components.core.e.d.a$a r11 = r11.a(r12)
            com.kwad.components.core.e.d.a.a(r11)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.presenter.s r0, boolean r1) {
            r1 = 1
            r0.HM = r1
            return r1
    }

    static /* synthetic */ long b(com.kwad.components.ad.splashscreen.presenter.s r2) {
            long r0 = r2.HK
            return r0
    }

    private void bc() {
            r3 = this;
            com.kwad.sdk.core.webview.b r0 = new com.kwad.sdk.core.webview.b
            r0.<init>()
            r3.eQ = r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.setAdTemplate(r1)
            com.kwad.sdk.core.webview.b r0 = r3.eQ
            r1 = 0
            r0.mScreenOrientation = r1
            com.kwad.components.ad.splashscreen.h r2 = r3.Gf
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r2.mRootContainer
            r0.aMN = r2
            r0.TG = r2
            com.kwad.sdk.core.webview.KsAdWebView r2 = r3.eN
            r0.Ta = r2
            r2 = 0
            r0.mReportExtData = r2
            r0.aMP = r1
            com.kwad.sdk.core.response.model.AdInfo r1 = r3.mAdInfo
            boolean r1 = com.kwad.components.ad.splashscreen.h.n(r1)
            r0.aMQ = r1
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

    static /* synthetic */ void c(com.kwad.components.ad.splashscreen.presenter.s r0) {
            r0.mA()
            return
    }

    private void cF() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 != 0) goto L29
            boolean r0 = r2.HJ
            if (r0 == 0) goto L9
            goto L29
        L9:
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            float r0 = com.kwad.sdk.core.response.b.b.dj(r0)
            com.kwad.sdk.core.g.d r1 = new com.kwad.sdk.core.g.d
            r1.<init>(r0)
            r2.gX = r1
            com.kwad.components.ad.splashscreen.presenter.s$6 r0 = new com.kwad.components.ad.splashscreen.presenter.s$6
            r0.<init>(r2)
            r1.a(r0)
            com.kwad.sdk.core.g.d r0 = r2.gX
            android.content.Context r1 = r2.getContext()
            r0.bG(r1)
        L29:
            return
    }

    static /* synthetic */ java.lang.Runnable d(com.kwad.components.ad.splashscreen.presenter.s r0) {
            java.lang.Runnable r0 = r0.HO
            return r0
    }

    static /* synthetic */ long e(com.kwad.components.ad.splashscreen.presenter.s r2) {
            long r0 = r2.mStartTime
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.splashscreen.presenter.s r0) {
            boolean r0 = r0.HM
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.az g(com.kwad.components.ad.splashscreen.presenter.s r0) {
            com.kwad.components.core.webview.jshandler.az r0 = r0.HL
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo h(com.kwad.components.ad.splashscreen.presenter.s r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    private void h(double r7) {
            r6 = this;
            com.kwad.components.ad.splashscreen.h r0 = r6.Gf
            if (r0 == 0) goto L14
            android.content.Context r2 = r6.getContext()
            com.kwad.components.ad.splashscreen.presenter.s$7 r5 = new com.kwad.components.ad.splashscreen.presenter.s$7
            r5.<init>(r6, r7)
            r1 = 1
            r3 = 157(0x9d, float:2.2E-43)
            r4 = 2
            r0.a(r1, r2, r3, r4, r5)
        L14:
            return
    }

    static /* synthetic */ void i(com.kwad.components.ad.splashscreen.presenter.s r0) {
            r0.cF()
            return
    }

    static /* synthetic */ android.os.Vibrator j(com.kwad.components.ad.splashscreen.presenter.s r0) {
            android.os.Vibrator r0 = r0.gZ
            return r0
    }

    static /* synthetic */ android.content.Context k(com.kwad.components.ad.splashscreen.presenter.s r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.content.Context l(com.kwad.components.ad.splashscreen.presenter.s r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ android.content.Context m(com.kwad.components.ad.splashscreen.presenter.s r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    private void mA() {
            r2 = this;
            r0 = 1
            r2.HJ = r0
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r1 = 8
            if (r0 == 0) goto Lc
            r0.setVisibility(r1)
        Lc:
            android.view.ViewGroup r0 = r2.HN
            if (r0 == 0) goto L13
            r0.setVisibility(r1)
        L13:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            com.kwad.sdk.mvp.Presenter r0 = r2.y(r0)
            if (r0 == 0) goto L24
            com.kwad.components.ad.splashscreen.presenter.s$8 r1 = new com.kwad.components.ad.splashscreen.presenter.s$8
            r1.<init>(r2, r0)
            com.kwad.sdk.utils.bw.postOnUiThread(r1)
            return
        L24:
            r2.mB()
            return
    }

    private void mB() {
            r5 = this;
            r5.mz()
            int r0 = com.kwad.sdk.R.id.ksad_splash_actionbar_native_stub
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.d.ea(r1)
            com.kwad.components.ad.splashscreen.e.b r2 = new com.kwad.components.ad.splashscreen.e.b
            android.view.View r3 = r5.getRootView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.kwad.components.ad.splashscreen.h r4 = r5.Gf
            com.kwad.components.core.e.d.c r4 = r4.mApkDownloadHelper
            r2.<init>(r3, r0, r1, r4)
            r5.HH = r2
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            r2.as(r0)
            com.kwad.components.ad.splashscreen.e.b r0 = r5.HH
            r0.a(r5)
            com.kwad.components.ad.splashscreen.e.b r0 = r5.HH
            r0.mA()
            return
    }

    private com.kwad.components.core.webview.jshandler.z mC() {
            r4 = this;
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r1 = r4.eQ
            com.kwad.components.ad.splashscreen.h r2 = r4.Gf
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            com.kwad.components.ad.splashscreen.presenter.s$9 r3 = new com.kwad.components.ad.splashscreen.presenter.s$9
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            return r0
    }

    private com.kwad.components.core.webview.jshandler.ac mD() {
            r5 = this;
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            com.kwad.components.ad.splashscreen.h r2 = r5.Gf
            com.kwad.components.core.e.d.c r2 = r2.mApkDownloadHelper
            com.kwad.components.ad.splashscreen.presenter.s$10 r3 = new com.kwad.components.ad.splashscreen.presenter.s$10
            r3.<init>(r5)
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.g.d n(com.kwad.components.ad.splashscreen.presenter.s r0) {
            com.kwad.sdk.core.g.d r0 = r0.gX
            return r0
    }

    private com.kwad.sdk.mvp.Presenter y(com.kwad.sdk.core.response.model.AdInfo r3) {
            r2 = this;
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.dn(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r3 = com.kwad.sdk.core.response.b.b.dR(r3)
            if (r3 == 0) goto L1b
            com.kwad.components.ad.splashscreen.presenter.m r3 = new com.kwad.components.ad.splashscreen.presenter.m
            r3.<init>()
            return r3
        L1b:
            return r1
        L1c:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dP(r3)
            if (r3 == 0) goto L2a
            com.kwad.components.ad.splashscreen.presenter.o r3 = new com.kwad.components.ad.splashscreen.presenter.o
            r3.<init>()
            return r3
        L2a:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dR(r3)
            if (r3 == 0) goto L38
            com.kwad.components.ad.splashscreen.presenter.m r3 = new com.kwad.components.ad.splashscreen.presenter.m
            r3.<init>()
            return r3
        L38:
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dU(r3)
            if (r3 == 0) goto L46
            com.kwad.components.ad.splashscreen.presenter.q r3 = new com.kwad.components.ad.splashscreen.presenter.q
            r3.<init>()
            return r3
        L46:
            boolean r3 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r3 == 0) goto L5a
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dV(r3)
            if (r3 == 0) goto L5a
            com.kwad.components.ad.splashscreen.presenter.l r3 = new com.kwad.components.ad.splashscreen.presenter.l
            r3.<init>()
            return r3
        L5a:
            boolean r3 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r3 == 0) goto L6e
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dW(r3)
            if (r3 == 0) goto L6e
            com.kwad.components.ad.splashscreen.presenter.n r3 = new com.kwad.components.ad.splashscreen.presenter.n
            r3.<init>()
            return r3
        L6e:
            boolean r3 = com.kwad.sdk.utils.aq.isOrientationPortrait()
            if (r3 == 0) goto L82
            com.kwad.sdk.core.response.model.AdInfo r3 = r2.mAdInfo
            boolean r3 = com.kwad.sdk.core.response.b.b.dX(r3)
            if (r3 == 0) goto L82
            com.kwad.components.ad.splashscreen.presenter.p r3 = new com.kwad.components.ad.splashscreen.presenter.p
            r3.<init>()
            return r3
        L82:
            return r1
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void ak(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.components.ad.splashscreen.presenter.e, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.mStartTime = r0
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.j.a r0 = r0.Fs
            r0.a(r4)
            int r0 = com.kwad.sdk.R.id.ksad_splash_webview_container
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.HN = r0
            r1 = 0
            r0.setVisibility(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = new com.kwad.sdk.core.webview.KsAdWebView     // Catch: java.lang.Throwable -> L3c
            android.content.Context r2 = r4.getContext()     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            r4.eN = r0     // Catch: java.lang.Throwable -> L3c
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L3c
            r2 = -1
            r0.<init>(r2, r2)     // Catch: java.lang.Throwable -> L3c
            com.kwad.sdk.core.webview.KsAdWebView r2 = r4.eN     // Catch: java.lang.Throwable -> L3c
            r2.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L3c
            android.view.ViewGroup r0 = r4.HN     // Catch: java.lang.Throwable -> L3c
            com.kwad.sdk.core.webview.KsAdWebView r2 = r4.eN     // Catch: java.lang.Throwable -> L3c
            r0.addView(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
        L3d:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            r4.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            r4.HI = r1
            r4.HJ = r1
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.b.cu(r0)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r4.eN
            if (r1 == 0) goto L80
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L80
            com.kwad.components.ad.splashscreen.h r1 = r4.Gf
            boolean r1 = r1.Fx
            if (r1 != 0) goto L80
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4.HK = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.ad.splashscreen.monitor.c.ar(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r4.eN
            r4.a(r1, r0)
            java.lang.Runnable r0 = r4.HO
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            long r1 = com.kwad.sdk.core.response.b.b.eb(r1)
            r3 = 0
            com.kwad.sdk.utils.bw.a(r0, r3, r1)
            goto L83
        L80:
            r4.mA()
        L83:
            com.kwad.components.ad.splashscreen.h r0 = r4.Gf
            r0.a(r4)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bG(r1)
        Lb:
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bH(r1)
        Lb:
            return
    }

    @Override // com.kwad.components.ad.splashscreen.e
    public final void h(boolean r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isClick: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", isActionBar: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SplashWebViewPresenter"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r0 = 1
            if (r4 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 2
        L21:
            r3 = r3 ^ r0
            r0 = 132(0x84, float:1.85E-43)
            r1 = 0
            r2.a(r3, r4, r0, r1)
            return
    }

    @Override // com.kwad.components.ad.splashscreen.g
    public final void lG() {
            r2 = this;
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.bH(r1)
        Lb:
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public final void mz() {
            r4 = this;
            boolean r0 = r4.HI
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.HI = r0
            com.kwad.sdk.core.adlog.a$a r0 = new com.kwad.sdk.core.adlog.a$a
            r0.<init>()
            com.kwad.sdk.core.response.model.AdInfo r1 = r4.mAdInfo
            int r1 = com.kwad.components.ad.splashscreen.local.b.s(r1)
            r0.awX = r1
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)
            com.kwad.sdk.core.adlog.c.b r0 = r1.b(r0)
            com.kwad.components.ad.splashscreen.h r1 = r4.Gf
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            r3 = 0
            com.kwad.sdk.core.adlog.c.d(r1, r3, r0)
            com.kwad.components.core.webview.tachikoma.e.a r0 = com.kwad.components.core.webview.tachikoma.e.a.vI()
            r0.bm(r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.splashscreen.e.b r0 = r2.HH
            if (r0 == 0) goto La
            r0.onUnbind()
        La:
            com.kwad.sdk.core.g.d r0 = r2.gX
            if (r0 == 0) goto L15
            android.content.Context r1 = r2.getContext()
            r0.bH(r1)
        L15:
            com.kwad.components.core.webview.jshandler.az r0 = r2.HL
            if (r0 == 0) goto L21
            r0.uH()
            com.kwad.components.core.webview.jshandler.az r0 = r2.HL
            r0.uI()
        L21:
            com.kwad.components.ad.splashscreen.h r0 = r2.Gf
            if (r0 == 0) goto L2c
            com.kwad.sdk.core.j.a r0 = r0.Fs
            if (r0 == 0) goto L2c
            r0.b(r2)
        L2c:
            r2.bf()
            return
    }
}
