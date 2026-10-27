package com.kwad.components.core.playable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.components.core.webview.jshandler.p {
    private final com.kwad.sdk.core.webview.KsAdWebView VU;
    private long VV;
    private int VW;
    private com.kwad.components.core.playable.PlayableSource VX;
    private java.util.List<com.kwad.components.core.webview.jshandler.as.b> VY;
    private java.util.List<com.kwad.sdk.core.webview.KsAdWebView.e> VZ;

    @androidx.annotation.Nullable
    private com.kwad.components.core.webview.a eP;
    private com.kwad.components.core.webview.jshandler.az eS;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private android.content.Context mContext;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.playable.a$a, reason: collision with other inner class name */
    static class C0089a implements com.kwad.components.core.webview.jshandler.bi.b {
        private final java.lang.ref.WeakReference<com.kwad.components.core.playable.a> Wb;

        public C0089a(com.kwad.components.core.playable.a r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.Wb = r0
                return
        }

        @Override // com.kwad.components.core.webview.jshandler.bi.b
        public final void ae(int r2) {
                r1 = this;
                java.lang.ref.WeakReference<com.kwad.components.core.playable.a> r0 = r1.Wb
                java.lang.Object r0 = r0.get()
                com.kwad.components.core.playable.a r0 = (com.kwad.components.core.playable.a) r0
                if (r0 == 0) goto Ld
                com.kwad.components.core.playable.a.b(r0, r2)
            Ld:
                return
        }
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public a(com.kwad.sdk.core.webview.KsAdWebView r3) {
            r2 = this;
            r2.<init>()
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.UNKNOWN_TRYPLAY_ENTRY_SOURCE
            r2.VX = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.VY = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.VZ = r0
            r2.VU = r3
            com.kwad.components.core.playable.a$1 r0 = new com.kwad.components.core.playable.a$1
            r0.<init>(r2)
            r3.setOnTouchListener(r0)
            com.kwad.sdk.core.webview.a.c$a r0 = r3.getClientConfig()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r2.ju()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            r3.setClientConfig(r0)
            a(r3)
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.playable.a r0, int r1) {
            r0.VW = r1
            return r1
    }

    static /* synthetic */ long a(com.kwad.components.core.playable.a r0, long r1) {
            r0.VV = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.webview.KsAdWebView a(com.kwad.components.core.playable.a r0) {
            com.kwad.sdk.core.webview.KsAdWebView r0 = r0.VU
            return r0
    }

    private static void a(com.kwad.sdk.core.webview.KsAdWebView r1) {
            boolean r0 = com.kwad.sdk.core.config.e.FN()
            if (r0 == 0) goto Le
            android.webkit.WebSettings r1 = r1.getSettings()
            r0 = 0
            r1.setMediaPlaybackRequiresUserGesture(r0)
        Le:
            return
    }

    private void a(com.kwad.sdk.core.webview.b r3, com.kwad.components.core.webview.a r4, com.kwad.components.core.e.d.c r5) {
            r2 = this;
            com.kwad.components.core.webview.jshandler.bi r0 = new com.kwad.components.core.webview.jshandler.bi
            com.kwad.components.core.playable.a$a r1 = new com.kwad.components.core.playable.a$a
            r1.<init>(r2)
            r0.<init>(r3, r5, r1)
            r4.a(r0)
            com.kwad.components.core.webview.jshandler.as r5 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.playable.a$3 r0 = new com.kwad.components.core.playable.a$3
            r0.<init>(r2)
            java.lang.String r1 = r2.getUrl()
            r5.<init>(r0, r1)
            r4.a(r5)
            com.kwad.components.core.webview.jshandler.am r5 = new com.kwad.components.core.webview.jshandler.am
            r5.<init>(r3)
            r4.a(r5)
            com.kwad.components.core.webview.jshandler.o r5 = new com.kwad.components.core.webview.jshandler.o
            r5.<init>(r3)
            r4.b(r5)
            com.kwad.components.core.webview.jshandler.n r5 = new com.kwad.components.core.webview.jshandler.n
            r5.<init>(r3)
            r4.b(r5)
            com.kwad.components.core.webview.jshandler.az r5 = new com.kwad.components.core.webview.jshandler.az
            r5.<init>()
            r2.eS = r5
            com.kwad.components.core.webview.jshandler.ah r5 = new com.kwad.components.core.webview.jshandler.ah
            r5.<init>()
            r4.a(r5)
            com.kwad.components.core.webview.jshandler.ag r5 = new com.kwad.components.core.webview.jshandler.ag
            r5.<init>(r3)
            r4.a(r5)
            com.kwad.components.core.webview.tachikoma.b.f r3 = new com.kwad.components.core.webview.tachikoma.b.f
            r3.<init>()
            r4.a(r3)
            com.kwad.components.core.webview.jshandler.az r3 = r2.eS
            r4.a(r3)
            com.kwad.components.core.webview.jshandler.j r3 = new com.kwad.components.core.webview.jshandler.j
            r3.<init>(r2)
            r4.a(r3)
            return
    }

    private void aR(int r7) {
            r6 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.getAdTemplate()
            if (r0 != 0) goto L7
            goto L1c
        L7:
            long r0 = com.kwad.sdk.core.config.e.FO()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.VV
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1d
        L1c:
            return
        L1d:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r1 = r6.mContext
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.aB(r1)
            com.kwad.components.core.e.d.c r1 = r6.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r1)
            r1 = 0
            com.kwad.components.core.e.d.a$a r0 = r0.aq(r1)
            com.kwad.components.core.e.d.a$a r7 = r0.aA(r7)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = r6.mRootContainer
            com.kwad.sdk.utils.aj$a r0 = r0.getTouchCoords()
            com.kwad.components.core.e.d.a$a r7 = r7.d(r0)
            r0 = 1
            com.kwad.components.core.e.d.a$a r7 = r7.as(r0)
            com.kwad.components.core.e.d.a.a(r7)
            return
    }

    static /* synthetic */ java.util.List b(com.kwad.components.core.playable.a r0) {
            java.util.List<com.kwad.sdk.core.webview.KsAdWebView$e> r0 = r0.VZ
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.core.playable.a r0, int r1) {
            r0.aR(r1)
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

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.core.playable.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ java.util.List d(com.kwad.components.core.playable.a r0) {
            java.util.List<com.kwad.components.core.webview.jshandler.as$b> r0 = r0.VY
            return r0
    }

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    private java.lang.String getUrl() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bQ(r0)
            return r0
    }

    private com.kwad.sdk.core.webview.KsAdWebView.e ju() {
            r1 = this;
            com.kwad.components.core.playable.a$2 r0 = new com.kwad.components.core.playable.a$2
            r0.<init>(r1)
            return r0
    }

    private void rp() {
            r6 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r0 = com.kwad.sdk.core.response.b.a.bM(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            com.kwad.components.core.playable.a$4 r0 = new com.kwad.components.core.playable.a$4
            r0.<init>(r6)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            long r4 = com.kwad.sdk.core.response.b.a.bM(r1)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r4)
        L22:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r0 = com.kwad.sdk.core.response.b.a.bM(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L3a
            com.kwad.sdk.core.webview.KsAdWebView r0 = r6.VU
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r1 = 1
            r0.bB(r1)
        L3a:
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.core.webview.jshandler.as.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.webview.jshandler.as$b> r0 = r1.VY
            r0.add(r2)
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.p
    public final void a(com.kwad.components.core.webview.jshandler.j r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "playableSrc"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld
            com.kwad.components.core.playable.PlayableSource r0 = r1.VX
            r2.f(r0)
        Ld:
            java.lang.String r0 = "getAdType"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1e
            com.kwad.sdk.core.response.model.AdTemplate r3 = r1.mAdTemplate
            if (r3 == 0) goto L1e
            int r3 = r3.adStyle
            r2.be(r3)
        L1e:
            return
    }

    @android.annotation.SuppressLint({"AddJavascriptInterface"})
    public final void a(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.view.AdBaseFrameLayout r3, com.kwad.components.core.e.d.c r4) {
            r1 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.VU
            if (r0 != 0) goto Lc
            java.lang.String r2 = "PlayableViewHelper"
            java.lang.String r3 = "registerJsBridge mPlayableView is null"
            com.kwad.sdk.core.d.c.w(r2, r3)
            return
        Lc:
            android.content.Context r0 = r3.getContext()
            r1.mContext = r0
            r1.mRootContainer = r3
            r1.mAdTemplate = r2
            r1.mApkDownloadHelper = r4
            r3 = -1
            r1.VW = r3
            com.kwad.sdk.core.webview.b r3 = new com.kwad.sdk.core.webview.b
            r3.<init>()
            r3.setAdTemplate(r2)
            r2 = 0
            r3.mScreenOrientation = r2
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r1.mRootContainer
            r3.aMN = r2
            r3.TG = r2
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.VU
            r3.Ta = r2
            r1.bf()
            com.kwad.components.core.webview.a r2 = new com.kwad.components.core.webview.a
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.VU
            r2.<init>(r0)
            r1.eP = r2
            r1.a(r3, r2, r4)
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.VU
            com.kwad.components.core.webview.a r3 = r1.eP
            java.lang.String r4 = "KwaiAd"
            r2.addJavascriptInterface(r3, r4)
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.sdk.core.webview.KsAdWebView.e r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.core.webview.KsAdWebView$e> r0 = r1.VZ
            r0.add(r2)
            return
    }

    public final void b(@androidx.annotation.Nullable com.kwad.components.core.webview.jshandler.as.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.webview.jshandler.as$b> r0 = r1.VY
            r0.remove(r2)
            return
    }

    public final void e(com.kwad.components.core.playable.PlayableSource r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r1.VX = r2
        L4:
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.VU
            if (r2 != 0) goto L9
            goto L27
        L9:
            r1.rp()
            java.lang.String r2 = "PlayableViewHelper"
            java.lang.String r0 = "showPlayable"
            com.kwad.sdk.core.d.c.d(r2, r0)
            com.kwad.components.core.webview.jshandler.az r2 = r1.eS
            if (r2 == 0) goto L1a
            r2.uF()
        L1a:
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.VU
            r0 = 0
            r2.setVisibility(r0)
            com.kwad.components.core.webview.jshandler.az r2 = r1.eS
            if (r2 == 0) goto L27
            r2.uG()
        L27:
            return
    }

    public final long getLoadTime() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            if (r0 == 0) goto L9
            long r0 = r0.getLoadTime()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public final void iK() {
            r2 = this;
            java.lang.String r0 = "PlayableViewHelper"
            java.lang.String r1 = "showPlayable"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            if (r0 != 0) goto Lc
            return
        Lc:
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L13
            r0.uH()
        L13:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            r1 = 8
            r0.setVisibility(r1)
            com.kwad.components.core.webview.jshandler.az r0 = r2.eS
            if (r0 == 0) goto L21
            r0.uI()
        L21:
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            r0.reload()
            return
    }

    public final void rQ() {
            r1 = this;
            com.kwad.components.core.webview.a r0 = r1.eP
            if (r0 == 0) goto La
            r0.destroy()
            r0 = 0
            r1.eP = r0
        La:
            return
    }

    public final void rR() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto L25
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            if (r0 != 0) goto L9
            goto L25
        L9:
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            r1 = 0
            r0.bB(r1)
            java.lang.String r0 = r2.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L20
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.VU
            r1.loadUrl(r0)
        L20:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.adlog.c.cd(r0)
        L25:
            return
    }

    public final boolean rS() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.VU
            if (r0 == 0) goto La
            int r0 = r2.VW
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }
}
