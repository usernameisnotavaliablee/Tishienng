package com.kwad.components.core.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private com.kwad.sdk.core.webview.KsAdWebView LZ;
    private com.kwad.sdk.core.webview.KsAdWebView.c TL;
    private android.view.ViewGroup abL;
    private com.kwad.components.core.webview.a.a abM;
    private com.kwad.components.core.webview.jshandler.aw abN;
    private com.kwad.sdk.core.download.d abO;
    private boolean abP;
    private com.kwad.components.core.webview.jshandler.a.c abQ;
    private com.kwad.components.core.webview.jshandler.as.b abR;
    private com.kwad.components.core.webview.a eP;
    private com.kwad.sdk.core.webview.b eQ;
    private com.kwad.components.core.webview.c iQ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private java.lang.String mPageUrl;














    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private com.kwad.sdk.core.webview.KsAdWebView LZ;
        private com.kwad.sdk.core.webview.KsAdWebView.c TL;
        private android.view.ViewGroup abL;
        private boolean abP;
        private com.kwad.components.core.webview.jshandler.a.c abQ;
        private com.kwad.components.core.webview.c iQ;
        private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
        private com.kwad.components.core.e.d.c mApkDownloadHelper;
        private java.lang.String mPageUrl;
        private org.json.JSONObject mReportExtData;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public final com.kwad.components.core.webview.b.a a(com.kwad.components.core.webview.c r1) {
                r0 = this;
                r0.iQ = r1
                return r0
        }

        public final com.kwad.components.core.webview.b.a a(com.kwad.components.core.webview.jshandler.a.c r1) {
                r0 = this;
                r0.abQ = r1
                return r0
        }

        @androidx.annotation.Nullable
        public final com.kwad.components.core.webview.b.a aM(com.kwad.sdk.core.response.model.AdTemplate r1) {
                r0 = this;
                r0.mAdTemplate = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final com.kwad.components.core.webview.b.a aP(java.lang.String r1) {
                r0 = this;
                r0.mPageUrl = r1
                return r0
        }

        public final com.kwad.components.core.webview.b.a aV(boolean r1) {
                r0 = this;
                r0.abP = r1
                return r0
        }

        @androidx.annotation.Nullable
        public final com.kwad.components.core.webview.b.a b(com.kwad.sdk.core.webview.KsAdWebView.c r1) {
                r0 = this;
                r0.TL = r1
                return r0
        }

        @androidx.annotation.NonNull
        public final com.kwad.components.core.webview.b.a d(com.kwad.sdk.core.webview.KsAdWebView r1) {
                r0 = this;
                r0.LZ = r1
                return r0
        }

        public final com.kwad.components.core.webview.b.a e(org.json.JSONObject r1) {
                r0 = this;
                r0.mReportExtData = r1
                return r0
        }

        public final com.kwad.components.core.webview.b.a f(com.kwad.components.core.e.d.c r1) {
                r0 = this;
                r0.mApkDownloadHelper = r1
                return r0
        }

        public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
                r1 = this;
                com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
                return r0
        }

        public final com.kwad.components.core.e.d.c ij() {
                r1 = this;
                com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper
                return r0
        }

        @androidx.annotation.NonNull
        public final com.kwad.components.core.webview.b.a k(android.view.ViewGroup r1) {
                r0 = this;
                r0.abL = r1
                return r0
        }

        public final java.lang.String qR() {
                r1 = this;
                java.lang.String r0 = r1.mPageUrl
                return r0
        }

        public final com.kwad.sdk.core.webview.KsAdWebView.c rm() {
                r1 = this;
                com.kwad.sdk.core.webview.KsAdWebView$c r0 = r1.TL
                return r0
        }

        public final android.view.ViewGroup uu() {
                r1 = this;
                android.view.ViewGroup r0 = r1.abL
                return r0
        }

        public final com.kwad.sdk.core.webview.KsAdWebView uv() {
                r1 = this;
                com.kwad.sdk.core.webview.KsAdWebView r0 = r1.LZ
                return r0
        }

        public final com.kwad.components.core.webview.c uw() {
                r1 = this;
                com.kwad.components.core.webview.c r0 = r1.iQ
                return r0
        }

        public final boolean ux() {
                r1 = this;
                boolean r0 = r1.abP
                return r0
        }

        public final com.kwad.components.core.webview.jshandler.a.c uy() {
                r1 = this;
                com.kwad.components.core.webview.jshandler.a.c r0 = r1.abQ
                return r0
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.webview.b$13 r0 = new com.kwad.components.core.webview.b$13
            r0.<init>(r1)
            r1.abR = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.core.webview.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private static void a(com.kwad.components.core.webview.c r0, android.webkit.WebView r1) {
            if (r0 == 0) goto L11
            boolean r0 = r0.rt()
            if (r0 != 0) goto L9
            goto L11
        L9:
            android.webkit.WebSettings r0 = r1.getSettings()
            r1 = 1
            r0.setAllowFileAccess(r1)
        L11:
            return
    }

    private void a(com.kwad.components.core.webview.jshandler.az r2) {
            r1 = this;
            com.kwad.components.core.webview.c r0 = r1.iQ
            if (r0 != 0) goto L5
            return
        L5:
            r0.a(r2)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.webview.b b(com.kwad.components.core.webview.b r0) {
            com.kwad.sdk.core.webview.b r0 = r0.eQ
            return r0
    }

    private void b(com.kwad.components.core.webview.a r11, com.kwad.sdk.core.webview.b r12) {
            r10 = this;
            com.kwad.components.core.webview.jshandler.az r0 = new com.kwad.components.core.webview.jshandler.az
            r0.<init>()
            r11.a(r0)
            r10.a(r0)
            com.kwad.components.core.webview.jshandler.v r0 = new com.kwad.components.core.webview.jshandler.v
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.d r0 = new com.kwad.components.core.webview.jshandler.d
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.w r0 = new com.kwad.components.core.webview.jshandler.w
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.q r0 = new com.kwad.components.core.webview.jshandler.q
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.r r0 = new com.kwad.components.core.webview.jshandler.r
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.am r0 = new com.kwad.components.core.webview.jshandler.am
            r0.<init>(r12)
            com.kwad.components.core.webview.jshandler.o r1 = new com.kwad.components.core.webview.jshandler.o
            r1.<init>(r12)
            r11.b(r1)
            com.kwad.components.core.webview.jshandler.n r1 = new com.kwad.components.core.webview.jshandler.n
            r1.<init>(r12)
            r11.b(r1)
            com.kwad.components.core.webview.jshandler.am$a r1 = r10.up()
            r0.a(r1)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.af r0 = new com.kwad.components.core.webview.jshandler.af
            r0.<init>(r12)
            r11.a(r0)
            com.kwad.components.core.webview.tachikoma.b.f r0 = new com.kwad.components.core.webview.tachikoma.b.f
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.e.d.c r0 = r10.mApkDownloadHelper
            if (r0 != 0) goto L6f
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r0.<init>(r1)
            r10.mApkDownloadHelper = r0
        L6f:
            boolean r0 = r10.abP
            if (r0 != 0) goto La3
            com.kwad.components.core.webview.jshandler.ac r1 = new com.kwad.components.core.webview.jshandler.ac
            com.kwad.sdk.core.webview.b r2 = r10.eQ
            com.kwad.components.core.e.d.c r3 = r10.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r4 = r10.getClickListener()
            boolean r5 = r10.un()
            r6 = 0
            r7 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r1)
            com.kwad.components.core.webview.jshandler.z r2 = new com.kwad.components.core.webview.jshandler.z
            com.kwad.sdk.core.webview.b r3 = r10.eQ
            com.kwad.components.core.e.d.c r4 = r10.mApkDownloadHelper
            com.kwad.sdk.core.webview.d.a.a r5 = r10.getClickListener()
            boolean r6 = r10.un()
            boolean r8 = r10.uo()
            r9 = 1
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11.a(r2)
        La3:
            com.kwad.components.core.webview.jshandler.bc r0 = new com.kwad.components.core.webview.jshandler.bc
            com.kwad.sdk.core.webview.b r1 = r10.eQ
            com.kwad.components.core.e.d.c r2 = r10.mApkDownloadHelper
            r0.<init>(r1, r2)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.au r0 = new com.kwad.components.core.webview.jshandler.au
            com.kwad.sdk.core.webview.b r1 = r10.eQ
            r0.<init>(r1)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.ar r0 = new com.kwad.components.core.webview.jshandler.ar
            com.kwad.sdk.core.webview.b r1 = r10.eQ
            android.webkit.WebView r1 = r1.Ta
            android.content.Context r1 = r1.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r10.mAdTemplate
            r0.<init>(r1, r2)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.bh r0 = new com.kwad.components.core.webview.jshandler.bh
            com.kwad.components.core.webview.b$1 r1 = new com.kwad.components.core.webview.b$1
            r1.<init>(r10)
            r0.<init>(r1)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.aj r0 = new com.kwad.components.core.webview.jshandler.aj
            com.kwad.sdk.core.webview.b r1 = r10.eQ
            r0.<init>(r1)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.as r0 = new com.kwad.components.core.webview.jshandler.as
            com.kwad.components.core.webview.jshandler.as$b r1 = r10.abR
            java.lang.String r2 = r10.mPageUrl
            r0.<init>(r1, r2)
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.aw r0 = new com.kwad.components.core.webview.jshandler.aw
            r0.<init>()
            r10.abN = r0
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.aa r0 = new com.kwad.components.core.webview.jshandler.aa
            com.kwad.components.core.webview.b$6 r1 = new com.kwad.components.core.webview.b$6
            r1.<init>(r10)
            r0.<init>(r1)
            r11.a(r0)
            com.kwad.components.core.webview.tachikoma.b.s r0 = new com.kwad.components.core.webview.tachikoma.b.s
            r0.<init>()
            com.kwad.components.core.webview.b$7 r1 = new com.kwad.components.core.webview.b$7
            r1.<init>(r10)
            r0.a(r1)
            r11.a(r0)
            com.kwad.components.core.webview.tachikoma.b.k r0 = new com.kwad.components.core.webview.tachikoma.b.k
            r0.<init>()
            r11.a(r0)
            com.kwad.components.core.webview.jshandler.ai r0 = new com.kwad.components.core.webview.jshandler.ai
            r0.<init>(r12)
            r11.a(r0)
            com.kwad.sdk.core.response.model.AdTemplate r12 = r10.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r12 = com.kwad.sdk.core.response.b.e.el(r12)
            boolean r12 = com.kwad.sdk.core.response.b.a.aF(r12)
            if (r12 == 0) goto L14d
            com.kwad.components.core.webview.tachikoma.b.l r12 = new com.kwad.components.core.webview.tachikoma.b.l
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.b$8 r0 = new com.kwad.components.core.webview.b$8
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r0.<init>(r10, r1, r12)
            r10.abO = r0
            com.kwad.sdk.core.download.b r12 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.download.d r0 = r10.abO
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r12.a(r0, r1)
        L14d:
            com.kwad.components.core.webview.b$9 r12 = new com.kwad.components.core.webview.b$9
            r12.<init>(r10)
            r11.a(r12)
            com.kwad.components.core.webview.b$10 r12 = new com.kwad.components.core.webview.b$10
            r12.<init>(r10)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.f r12 = new com.kwad.components.core.webview.jshandler.f
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.i r12 = new com.kwad.components.core.webview.jshandler.i
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.l r12 = new com.kwad.components.core.webview.jshandler.l
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.e r12 = new com.kwad.components.core.webview.jshandler.e
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.ae r12 = new com.kwad.components.core.webview.jshandler.ae
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            r12.<init>(r0)
            com.kwad.components.core.webview.b$11 r0 = new com.kwad.components.core.webview.b$11
            r0.<init>(r10)
            r12.a(r0)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.m r12 = new com.kwad.components.core.webview.jshandler.m
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            android.webkit.WebView r0 = r0.Ta
            android.content.Context r0 = r0.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r10.mAdTemplate
            r12.<init>(r0, r1)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.al r12 = new com.kwad.components.core.webview.jshandler.al
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            com.kwad.components.core.webview.b$12 r1 = new com.kwad.components.core.webview.b$12
            r1.<init>(r10)
            r12.<init>(r0, r1)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.k r12 = new com.kwad.components.core.webview.jshandler.k
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.u r12 = new com.kwad.components.core.webview.jshandler.u
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.t r12 = new com.kwad.components.core.webview.jshandler.t
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.s r12 = new com.kwad.components.core.webview.jshandler.s
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.a.f r12 = new com.kwad.components.core.webview.jshandler.a.f
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            android.content.Context r0 = r0.getContext()
            r12.<init>(r0)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.a.d r12 = new com.kwad.components.core.webview.jshandler.a.d
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            android.content.Context r0 = r0.getContext()
            r12.<init>(r0)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.a.b r12 = new com.kwad.components.core.webview.jshandler.a.b
            com.kwad.components.core.webview.jshandler.a.c r0 = r10.abQ
            r12.<init>(r0)
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.a.a r12 = new com.kwad.components.core.webview.jshandler.a.a
            r12.<init>()
            r11.a(r12)
            com.kwad.components.core.webview.jshandler.a.e r12 = new com.kwad.components.core.webview.jshandler.a.e
            com.kwad.sdk.core.webview.b r0 = r10.eQ
            android.content.Context r0 = r0.getContext()
            r12.<init>(r0)
            r11.a(r12)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface", "JavascriptInterface"})
    private void b(com.kwad.sdk.core.webview.KsAdWebView r4) {
            r3 = this;
            r3.bf()
            com.kwad.components.core.webview.a r0 = new com.kwad.components.core.webview.a
            r0.<init>(r4)
            r3.eP = r0
            com.kwad.sdk.core.webview.b r1 = r3.eQ
            r3.b(r0, r1)
            com.kwad.components.core.webview.c r0 = r3.iQ
            if (r0 == 0) goto L1a
            com.kwad.components.core.webview.a r1 = r3.eP
            com.kwad.sdk.core.webview.b r2 = r3.eQ
            r0.a(r1, r2)
        L1a:
            com.kwad.components.core.webview.a r0 = r3.eP
            java.lang.String r1 = "KwaiAd"
            r4.addJavascriptInterface(r0, r1)
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
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.LZ
            r0.Ta = r1
            android.view.ViewGroup r1 = r2.abL
            r0.TG = r1
            return
    }

    private void bf() {
            r2 = this;
            com.kwad.components.core.webview.a r0 = r2.eP
            r1 = 0
            if (r0 == 0) goto La
            r0.destroy()
            r2.eP = r1
        La:
            com.kwad.components.core.webview.a.a r0 = r2.abM
            if (r0 == 0) goto L13
            r0.destroy()
            r2.abM = r1
        L13:
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.c c(com.kwad.components.core.webview.b r0) {
            com.kwad.components.core.webview.c r0 = r0.iQ
            return r0
    }

    private void c(com.kwad.sdk.core.webview.KsAdWebView r3) {
            r2 = this;
            r2.bf()
            com.kwad.components.core.webview.a.a r0 = new com.kwad.components.core.webview.a.a
            com.kwad.sdk.core.webview.b r1 = r2.eQ
            r0.<init>(r3, r1)
            r2.abM = r0
            java.lang.String r1 = "KwaiAdForThird"
            r3.addJavascriptInterface(r0, r1)
            return
    }

    static /* synthetic */ com.kwad.components.core.webview.jshandler.aw d(com.kwad.components.core.webview.b r0) {
            com.kwad.components.core.webview.jshandler.aw r0 = r0.abN
            return r0
    }

    private void ft() {
            r2 = this;
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.LZ
            com.kwad.sdk.core.webview.a.c$a r0 = r0.getClientConfig()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.sdk.core.webview.a.c$a r0 = r0.eJ(r1)
            int r1 = r2.us()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.dS(r1)
            com.kwad.sdk.core.webview.KsAdWebView$e r1 = r2.ur()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.b(r1)
            com.kwad.sdk.core.webview.KsAdWebView$b r1 = r2.uq()
            com.kwad.sdk.core.webview.a.c$a r0 = r0.a(r1)
            com.kwad.sdk.core.webview.KsAdWebView$c r1 = r2.TL
            com.kwad.sdk.core.webview.a.c$a r0 = r0.c(r1)
            com.kwad.sdk.core.webview.KsAdWebView r1 = r2.LZ
            r1.setClientConfig(r0)
            return
    }

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.webview.d.a.a getClickListener() {
            r1 = this;
            com.kwad.components.core.webview.b$2 r0 = new com.kwad.components.core.webview.b$2
            r0.<init>(r1)
            return r0
    }

    private boolean un() {
            r1 = this;
            com.kwad.components.core.webview.c r0 = r1.iQ
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.ru()
            return r0
    }

    private boolean uo() {
            r1 = this;
            r0 = 0
            return r0
    }

    private com.kwad.components.core.webview.jshandler.am.a up() {
            r1 = this;
            com.kwad.components.core.webview.b$3 r0 = new com.kwad.components.core.webview.b$3
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.webview.KsAdWebView.b uq() {
            r1 = this;
            com.kwad.components.core.webview.b$4 r0 = new com.kwad.components.core.webview.b$4
            r0.<init>(r1)
            return r0
    }

    private com.kwad.sdk.core.webview.KsAdWebView.e ur() {
            r1 = this;
            com.kwad.components.core.webview.b$5 r0 = new com.kwad.components.core.webview.b$5
            r0.<init>(r1)
            return r0
    }

    private int us() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.S(r0)
            if (r0 == 0) goto Le
            r0 = 5
            return r0
        Le:
            r0 = 1
            return r0
    }

    public final void a(com.kwad.components.core.webview.b.a r2) {
            r1 = this;
            java.lang.String r0 = r2.qR()
            r1.mPageUrl = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.getAdTemplate()
            r1.mAdTemplate = r0
            android.view.ViewGroup r0 = r2.uu()
            r1.abL = r0
            com.kwad.sdk.core.webview.KsAdWebView r0 = r2.uv()
            r1.LZ = r0
            com.kwad.components.core.webview.c r0 = r2.uw()
            r1.iQ = r0
            com.kwad.components.core.e.d.c r0 = r2.ij()
            r1.mApkDownloadHelper = r0
            boolean r0 = r2.ux()
            r1.abP = r0
            com.kwad.sdk.core.webview.KsAdWebView$c r0 = r2.rm()
            r1.TL = r0
            com.kwad.components.core.webview.jshandler.a.c r2 = r2.uy()
            r1.abQ = r2
            r1.ft()
            com.kwad.components.core.webview.c r2 = r1.iQ
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.LZ
            a(r2, r0)
            r1.bc()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.P(r2)
            if (r2 == 0) goto L55
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.LZ
            r1.c(r2)
            return
        L55:
            java.lang.String r2 = r1.mPageUrl
            boolean r2 = com.kwad.sdk.core.response.b.b.ey(r2)
            if (r2 == 0) goto L62
            com.kwad.sdk.core.webview.KsAdWebView r2 = r1.LZ
            r1.b(r2)
        L62:
            return
    }

    public final void kz() {
            r2 = this;
            r2.bf()
            com.kwad.sdk.core.download.d r0 = r2.abO
            if (r0 == 0) goto L10
            com.kwad.sdk.core.download.b r0 = com.kwad.sdk.core.download.b.GR()
            com.kwad.sdk.core.download.d r1 = r2.abO
            r0.a(r1)
        L10:
            r0 = 0
            r2.abQ = r0
            return
    }
}
