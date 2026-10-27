package com.kwad.components.ad.l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private com.kwad.components.core.webview.jshandler.bf BP;
    private java.util.List<com.kwad.sdk.core.response.model.AdTemplate> Mk;

    @androidx.annotation.NonNull
    private java.util.List<com.kwad.components.core.e.d.c> Ml;
    protected android.view.View Mm;
    protected boolean Mn;
    private java.lang.String Mo;
    private com.kwad.components.ad.l.b.a Mp;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.l.b.InterfaceC0030b Mq;
    protected com.kwad.sdk.core.webview.KsAdWebView eN;
    protected com.kwad.sdk.core.webview.b eQ;
    private int eR;
    protected com.kwad.components.core.webview.jshandler.az eS;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.webview.d.a.a eT;
    private com.kwad.components.core.webview.jshandler.ak.b eV;
    private android.widget.FrameLayout fc;
    private com.kwad.sdk.core.view.AdBaseFrameLayout gt;
    private com.kwad.components.core.webview.b iP;
    private com.kwad.components.core.webview.c iQ;
    protected com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    @androidx.annotation.Nullable
    private org.json.JSONObject mReportExtData;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void jL();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.l.b$b, reason: collision with other inner class name */
    public interface InterfaceC0030b {
        void iU();
    }

    public b() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Mk = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Ml = r0
            r0 = -1
            r1.eR = r0
            r0 = 0
            r1.Mn = r0
            com.kwad.components.ad.l.b$1 r0 = new com.kwad.components.ad.l.b$1
            r0.<init>(r1)
            r1.iQ = r0
            com.kwad.components.ad.l.b$2 r0 = new com.kwad.components.ad.l.b$2
            r0.<init>(r1)
            r1.eV = r0
            return
    }

    public b(@androidx.annotation.Nullable org.json.JSONObject r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Mk = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Ml = r0
            r0 = -1
            r1.eR = r0
            r0 = 0
            r1.Mn = r0
            com.kwad.components.ad.l.b$1 r0 = new com.kwad.components.ad.l.b$1
            r0.<init>(r1)
            r1.iQ = r0
            com.kwad.components.ad.l.b$2 r0 = new com.kwad.components.ad.l.b$2
            r0.<init>(r1)
            r1.eV = r0
            r1.mReportExtData = r2
            r1.Mo = r3
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.l.b r0, int r1) {
            r0.eR = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.l.b.a a(com.kwad.components.ad.l.b r0) {
            com.kwad.components.ad.l.b$a r0 = r0.Mp
            return r0
    }

    static /* synthetic */ java.lang.String b(com.kwad.components.ad.l.b r0) {
            java.lang.String r0 = r0.Mo
            return r0
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
            java.lang.String r1 = "PlayEndWebCard"
            com.kwad.sdk.core.d.c.w(r1, r0)
            return
    }

    static /* synthetic */ com.kwad.components.ad.l.b.InterfaceC0030b c(com.kwad.components.ad.l.b r0) {
            com.kwad.components.ad.l.b$b r0 = r0.Mq
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.webview.d.a.a d(com.kwad.components.ad.l.b r0) {
            com.kwad.sdk.core.webview.d.a.a r0 = r0.eT
            return r0
    }

    private static int getLayoutId() {
            int r0 = com.kwad.sdk.R.layout.ksad_ad_web_card_layout
            return r0
    }

    protected java.lang.String K(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            java.lang.String r1 = r0.Mo
            if (r1 != 0) goto La
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cK(r1)
        La:
            return r1
    }

    public final void a(android.widget.FrameLayout r7, com.kwad.sdk.core.view.AdBaseFrameLayout r8, com.kwad.sdk.core.response.model.AdTemplate r9, @androidx.annotation.Nullable com.kwad.components.core.e.d.c r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void a(android.widget.FrameLayout r1, com.kwad.sdk.core.view.AdBaseFrameLayout r2, com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.core.e.d.c r4, int r5) {
            r0 = this;
            java.util.List<com.kwad.components.core.e.d.c> r5 = r0.Ml
            r5.add(r4)
            r0.gt = r2
            r0.fc = r1
            r0.mAdTemplate = r3
            r0.gs()
            return
    }

    public final void a(android.widget.FrameLayout r1, com.kwad.sdk.core.view.AdBaseFrameLayout r2, java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r3, java.util.List<com.kwad.components.core.e.d.c> r4) {
            r0 = this;
            r0.Ml = r4
            r0.gt = r2
            r0.fc = r1
            if (r3 == 0) goto L19
            int r1 = r3.size()
            if (r1 <= 0) goto L19
            r0.Mk = r3
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = (com.kwad.sdk.core.response.model.AdTemplate) r1
            r0.mAdTemplate = r1
        L19:
            r0.gs()
            return
    }

    public final void a(com.kwad.components.ad.l.b.a r1) {
            r0 = this;
            r0.Mp = r1
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.l.b.InterfaceC0030b r3) {
            r2 = this;
            r2.Mq = r3
            android.widget.FrameLayout r3 = r2.fc
            r0 = 4
            r3.setVisibility(r0)
            r3 = -1
            r2.eR = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            java.lang.String r3 = r2.K(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startPreloadWebView url : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PlayEndWebCard"
            com.kwad.sdk.core.d.c.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L2b
            goto L37
        L2b:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 == 0) goto L37
            r2.gw()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            r0.loadUrl(r3)
        L37:
            return
    }

    protected void a(com.kwad.components.core.webview.a r6) {
            r5 = this;
            java.util.List<com.kwad.components.core.e.d.c> r0 = r5.Ml
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L40
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r0 = r5.Mk
            int r0 = r0.size()
            if (r0 <= r1) goto L40
            com.kwad.components.core.webview.jshandler.ac r0 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            java.util.List<com.kwad.components.core.e.d.c> r2 = r5.Ml
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.kwad.components.core.e.d.c r2 = (com.kwad.components.core.e.d.c) r2
            com.kwad.sdk.core.webview.d.a.a r4 = r5.eT
            r0.<init>(r1, r2, r4, r3)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.z r0 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r1 = r5.eQ
            java.util.List<com.kwad.components.core.e.d.c> r2 = r5.Ml
            com.kwad.sdk.core.webview.d.a.a r3 = r5.eT
            r0.<init>(r1, r2, r3)
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ao r0 = new com.kwad.components.core.webview.jshandler.ao
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r1 = r5.Mk
            java.util.List<com.kwad.components.core.e.d.c> r2 = r5.Ml
            r0.<init>(r1, r2)
            r6.a(r0)
        L40:
            com.kwad.components.core.webview.jshandler.bf r0 = new com.kwad.components.core.webview.jshandler.bf
            r0.<init>()
            r5.BP = r0
            r6.a(r0)
            com.kwad.components.core.webview.jshandler.ak r0 = new com.kwad.components.core.webview.jshandler.ak
            com.kwad.components.core.webview.jshandler.ak$b r1 = r5.eV
            r0.<init>(r1)
            r6.a(r0)
            return
    }

    public final void a(com.kwad.sdk.core.webview.d.a.a r1) {
            r0 = this;
            r0.eT = r1
            return
    }

    public final boolean aW() {
            r3 = this;
            boolean r0 = r3.cH()
            r1 = 0
            if (r0 == 0) goto L26
            com.kwad.components.core.webview.jshandler.az r0 = r3.eS
            if (r0 == 0) goto Le
            r0.uF()
        Le:
            android.widget.FrameLayout r0 = r3.fc
            if (r0 == 0) goto L15
            r0.setVisibility(r1)
        L15:
            com.kwad.components.core.webview.jshandler.az r0 = r3.eS
            if (r0 == 0) goto L24
            boolean r0 = r3.gt()
            if (r0 == 0) goto L24
            com.kwad.components.core.webview.jshandler.az r0 = r3.eS
            r0.uG()
        L24:
            r0 = 1
            return r0
        L26:
            android.widget.FrameLayout r0 = r3.fc
            if (r0 == 0) goto L2e
            r2 = 4
            r0.setVisibility(r2)
        L2e:
            r3.bm()
            return r1
    }

    public final void ai(boolean r2) {
            r1 = this;
            com.kwad.components.core.webview.jshandler.bf r2 = r1.BP
            r0 = 1
            r2.ai(r0)
            return
    }

    protected void b(com.kwad.sdk.core.webview.b r2) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r2.setAdTemplate(r0)
            return
    }

    protected boolean cH() {
            r2 = this;
            int r0 = r2.eR
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final long getLoadTime() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.eN
            if (r0 == 0) goto L9
            long r0 = r0.getLoadTime()
            return r0
        L9:
            r0 = -1
            return r0
    }

    protected java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "PlayEndWebCard"
            return r0
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    protected void gs() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.fc
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r4.fc
            r1 = 4
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r4.fc
            android.content.Context r0 = r0.getContext()
            int r1 = getLayoutId()
            android.widget.FrameLayout r2 = r4.fc
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r2)
            r4.Mm = r0
            android.widget.FrameLayout r0 = r4.fc
            int r1 = com.kwad.sdk.R.id.ksad_web_card_webView
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r4.eN = r0
            if (r0 == 0) goto La1
            r1 = 0
            r0.setBackgroundColor(r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.setAlpha(r1)
            com.kwad.components.core.webview.b r0 = new com.kwad.components.core.webview.b
            r0.<init>()
            r4.iP = r0
            com.kwad.components.core.webview.b$a r0 = new com.kwad.components.core.webview.b$a
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.components.core.webview.b$a r0 = r0.aM(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            java.lang.String r2 = r4.K(r2)
            com.kwad.components.core.webview.b$a r0 = r0.aP(r2)
            com.kwad.sdk.core.webview.KsAdWebView r2 = r4.eN
            com.kwad.components.core.webview.b$a r0 = r0.d(r2)
            org.json.JSONObject r2 = r4.mReportExtData
            com.kwad.components.core.webview.b$a r0 = r0.e(r2)
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r4.gt
            com.kwad.components.core.webview.b$a r0 = r0.k(r2)
            java.util.List<com.kwad.components.core.e.d.c> r2 = r4.Ml
            java.lang.Object r2 = r2.get(r1)
            com.kwad.components.core.e.d.c r2 = (com.kwad.components.core.e.d.c) r2
            com.kwad.components.core.webview.b$a r0 = r0.f(r2)
            java.util.List<com.kwad.components.core.e.d.c> r2 = r4.Ml
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L84
            java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r2 = r4.Mk
            int r2 = r2.size()
            if (r2 <= r3) goto L84
            r1 = 1
        L84:
            com.kwad.components.core.webview.b$a r0 = r0.aV(r1)
            com.kwad.components.core.webview.c r1 = r4.iQ
            com.kwad.components.core.webview.b$a r0 = r0.a(r1)
            com.kwad.components.core.webview.b r1 = r4.iP
            r1.a(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r4.eN
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            java.lang.String r1 = r4.K(r1)
            r0.loadUrl(r1)
            r4.gv()
        La1:
            return
    }

    protected boolean gt() {
            r1 = this;
            r0 = 1
            return r0
    }

    protected void gv() {
            r0 = this;
            return
    }

    protected void gw() {
            r0 = this;
            return
    }

    protected void gx() {
            r0 = this;
            return
    }

    public final void nM() {
            r3 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r3.eN
            r1 = 50
            r2 = 0
            boolean r0 = com.kwad.sdk.utils.bz.a(r0, r1, r2)
            if (r0 != 0) goto Lc
            goto L20
        Lc:
            com.kwad.components.core.webview.jshandler.az r0 = r3.eS
            if (r0 == 0) goto L13
            r0.uH()
        L13:
            android.widget.FrameLayout r0 = r3.fc
            r1 = 4
            r0.setVisibility(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r3.eS
            if (r0 == 0) goto L20
            r0.uI()
        L20:
            return
    }

    public final void ny() {
            r1 = this;
            com.kwad.components.core.webview.b r0 = r1.iP
            if (r0 == 0) goto L7
            r0.kz()
        L7:
            return
    }

    public final void release() {
            r1 = this;
            r0 = 0
            r1.Mq = r0
            return
    }
}
