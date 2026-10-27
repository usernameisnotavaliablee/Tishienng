package com.kwad.components.ad.l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private boolean LY;
    private com.kwad.sdk.core.webview.KsAdWebView LZ;
    private boolean Ma;
    private boolean Mb;
    protected com.kwad.sdk.core.view.AdBaseFrameLayout Mc;
    private com.kwad.components.ad.l.a.InterfaceC0028a Md;
    private boolean Me;
    private boolean Mf;
    private boolean Mg;
    private com.kwad.sdk.core.webview.a.c.a Mh;
    private com.kwad.components.ad.l.a.b Mi;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.d.a.a eT;
    private android.widget.FrameLayout fc;
    private com.kwad.sdk.core.view.AdBaseFrameLayout gt;
    private android.os.Handler iK;
    private android.app.Activity mActivity;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.widget.ImageView mBackIcon;
    private long mLastDown;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.l.a$a, reason: collision with other inner class name */
    public interface InterfaceC0028a {
        void S(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void jG();
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.LY = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r0 = 0
            r2.Me = r0
            r2.Mf = r0
            r2.Mg = r0
            return
    }

    private static java.lang.String K(com.kwad.sdk.core.response.model.AdTemplate r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aS(r0)
            return r0
    }

    static /* synthetic */ long a(com.kwad.components.ad.l.a r0, long r1) {
            r0.mLastDown = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.l.a.InterfaceC0028a a(com.kwad.components.ad.l.a r0) {
            com.kwad.components.ad.l.a$a r0 = r0.Md
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.l.a r0, boolean r1) {
            r1 = 1
            r0.Mf = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.l.a r0) {
            boolean r0 = r0.cH()
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.ad.l.a r0, boolean r1) {
            r1 = 1
            r0.LY = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.l.a.b c(com.kwad.components.ad.l.a r0) {
            com.kwad.components.ad.l.a$b r0 = r0.Mi
            return r0
    }

    static /* synthetic */ boolean c(com.kwad.components.ad.l.a r0, boolean r1) {
            r1 = 1
            r0.Me = r1
            return r1
    }

    private boolean cH() {
            r3 = this;
            boolean r0 = r3.Mg
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r3.LY
            if (r0 != 0) goto Lb
            return r2
        Lb:
            return r1
        Lc:
            boolean r0 = r3.LY
            if (r0 != 0) goto L19
            boolean r0 = r3.Me
            if (r0 != 0) goto L19
            boolean r0 = r3.Mf
            if (r0 != 0) goto L19
            return r2
        L19:
            return r1
    }

    static /* synthetic */ android.widget.ImageView d(com.kwad.components.ad.l.a r0) {
            android.widget.ImageView r0 = r0.mBackIcon
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.ad.l.a r0, boolean r1) {
            r1 = 1
            r0.Ma = r1
            return r1
    }

    static /* synthetic */ long e(com.kwad.components.ad.l.a r2) {
            long r0 = r2.mLastDown
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate f(com.kwad.components.ad.l.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.view.AdBaseFrameLayout g(com.kwad.components.ad.l.a r0) {
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r0.gt
            return r0
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void gs() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.fc
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r3.fc
            r1 = 4
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r3.fc
            int r1 = com.kwad.sdk.R.layout.ksad_ad_landingpage_layout
            r2 = 1
            android.view.View r0 = com.kwad.sdk.c.a.a.a(r0, r1, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = com.kwad.sdk.R.id.ksad_web_card_frame
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r3.Mc = r0
            android.widget.FrameLayout r0 = r3.fc
            int r1 = com.kwad.sdk.R.id.ksad_web_card_webView
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r3.LZ = r0
            r1 = -1
            r0.setBackgroundColor(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.LZ
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r1 = 0
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bB(r1)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bD(r2)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bC(r1)
            com.kwad.sdk.core.webview.a.c$a r0 = r0.bA(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView$b r1 = r3.nK()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.a(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r3.ju()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            r3.Mh = r0
            com.kwad.sdk.core.webview.KsAdWebView r1 = r3.LZ
            r1.setClientConfig(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.LZ
            com.kwad.components.ad.l.a$1 r1 = new com.kwad.components.ad.l.a$1
            r1.<init>(r3)
            r0.setDownloadListener(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r3.Mc
            int r1 = com.kwad.sdk.R.id.ksad_end_close_btn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mBackIcon = r0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r3.mBackIcon
            com.kwad.components.ad.l.a$2 r1 = new com.kwad.components.ad.l.a$2
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            return
    }

    static /* synthetic */ boolean h(com.kwad.components.ad.l.a r0) {
            boolean r0 = r0.Ma
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.d.a.a i(com.kwad.components.ad.l.a r0) {
            com.kwad.sdk.core.webview.d.a.a r0 = r0.eT
            return r0
    }

    static /* synthetic */ android.app.Activity j(com.kwad.components.ad.l.a r0) {
            android.app.Activity r0 = r0.mActivity
            return r0
    }

    private com.kwad.sdk.core.webview.KsAdWebView.e ju() {
            r1 = this;
            com.kwad.components.ad.l.a$3 r0 = new com.kwad.components.ad.l.a$3
            r0.<init>(r1)
            return r0
    }

    private com.kwad.sdk.core.webview.KsAdWebView.b nK() {
            r1 = this;
            com.kwad.components.ad.l.a$4 r0 = new com.kwad.components.ad.l.a$4
            r0.<init>(r1)
            return r0
    }

    private boolean nL() {
            r3 = this;
            boolean r0 = r3.cH()
            r1 = 0
            if (r0 == 0) goto L10
            android.widget.FrameLayout r0 = r3.fc
            if (r0 == 0) goto Le
            r0.setVisibility(r1)
        Le:
            r0 = 1
            return r0
        L10:
            android.widget.FrameLayout r0 = r3.fc
            if (r0 == 0) goto L19
            r2 = 8
            r0.setVisibility(r2)
        L19:
            return r1
    }

    public final void a(android.widget.FrameLayout r1, com.kwad.sdk.core.view.AdBaseFrameLayout r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            r0 = this;
            r0.fc = r1
            r0.gt = r2
            r0.mAdTemplate = r3
            r0.gs()
            r1 = 0
            r0.LY = r1
            return
    }

    public final void a(com.kwad.components.ad.l.a.InterfaceC0028a r1) {
            r0 = this;
            r0.Md = r1
            return
    }

    public final void a(com.kwad.components.ad.l.a.b r1) {
            r0 = this;
            r0.Mi = r1
            return
    }

    public final void a(com.kwad.sdk.core.webview.d.a.a r1) {
            r0 = this;
            r0.eT = r1
            return
    }

    public final boolean aW() {
            r6 = this;
            boolean r0 = r6.nL()
            r1 = 1
            r6.Mg = r1
            if (r0 == 0) goto L5e
            android.app.Activity r2 = r6.mActivity
            if (r2 == 0) goto L5e
            com.kwad.sdk.core.webview.KsAdWebView r2 = r6.LZ
            com.kwad.sdk.core.webview.a.c$a r2 = r2.getClientConfig()
            if (r2 == 0) goto L27
            com.kwad.sdk.core.webview.KsAdWebView r2 = r6.LZ
            com.kwad.sdk.core.webview.a.c$a r2 = r2.getClientConfig()
            r2.bB(r1)
            com.kwad.sdk.core.webview.KsAdWebView r2 = r6.LZ
            com.kwad.sdk.core.webview.a.c$a r2 = r2.getClientConfig()
            r2.bC(r1)
        L27:
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r6.Mc
            com.kwad.components.ad.l.a$5 r2 = new com.kwad.components.ad.l.a$5
            r2.<init>(r6)
            r1.a(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            long r1 = com.kwad.sdk.core.response.b.a.am(r1)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L51
            boolean r3 = r6.Mb
            if (r3 != 0) goto L46
            goto L51
        L46:
            android.os.Handler r3 = r6.iK
            com.kwad.components.ad.l.a$6 r4 = new com.kwad.components.ad.l.a$6
            r4.<init>(r6)
            r3.postDelayed(r4, r1)
            goto L57
        L51:
            android.widget.ImageView r1 = r6.mBackIcon
            r2 = 0
            r1.setVisibility(r2)
        L57:
            com.kwad.sdk.core.webview.KsAdWebView r1 = r6.LZ
            if (r1 == 0) goto L5e
            r1.onActivityCreate()
        L5e:
            return r0
    }

    public final com.kwad.components.ad.l.a ah(boolean r1) {
            r0 = this;
            r1 = 1
            r0.Mb = r1
            return r0
    }

    public final void bd() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.fc
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            java.lang.String r0 = K(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L13
            return
        L13:
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.LZ
            r1.loadUrl(r0)
            return
    }

    public final void setActivity(android.app.Activity r1) {
            r0 = this;
            r0.mActivity = r1
            return
    }
}
