package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdWebView extends android.webkit.WebView implements com.beizi.ad.internal.view.c {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private long F;
    private float G;
    private float H;
    private boolean I;
    private java.net.HttpURLConnection J;
    private java.io.InputStream K;
    private final java.lang.Runnable L;
    boolean a;
    public com.beizi.ad.internal.f.c ad;
    public com.beizi.ad.internal.view.AdViewImpl adViewImpl;

    /* renamed from: b, reason: collision with root package name */
    protected java.lang.String f7136b;

    /* renamed from: c, reason: collision with root package name */
    boolean f7137c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7138d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7139e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.ad.internal.view.f f7140f;

    /* renamed from: g, reason: collision with root package name */
    private int f7141g;
    public android.view.GestureDetector gestureDetector;

    /* renamed from: h, reason: collision with root package name */
    private int f7142h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7143i;

    /* renamed from: j, reason: collision with root package name */
    private int f7144j;

    /* renamed from: k, reason: collision with root package name */
    private int f7145k;
    private int l;
    private int m;
    public com.beizi.ad.internal.video.AdVideoView mAdVideoView;
    private int n;
    private boolean o;
    private boolean p;
    private android.os.Handler q;
    private boolean r;
    private int s;
    private android.app.ProgressDialog t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private boolean z;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends android.webkit.WebViewClient {
        final /* synthetic */ com.beizi.ad.internal.view.AdWebView a;

        private a(com.beizi.ad.internal.view.AdWebView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.beizi.ad.internal.view.AdWebView r1, com.beizi.ad.internal.view.AdWebView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "http"
                boolean r0 = r4.startsWith(r0)
                if (r0 == 0) goto L41
                com.beizi.ad.internal.view.AdWebView r0 = r2.a     // Catch: java.lang.NullPointerException -> L41
                android.webkit.WebView$HitTestResult r0 = r0.getHitTestResult()     // Catch: java.lang.NullPointerException -> L41
                if (r0 != 0) goto L11
                goto L41
            L11:
                java.lang.String r1 = r0.getExtra()     // Catch: java.lang.NullPointerException -> L41
                if (r1 == 0) goto L41
                java.lang.String r1 = r0.getExtra()     // Catch: java.lang.NullPointerException -> L41
                boolean r1 = r1.equals(r4)     // Catch: java.lang.NullPointerException -> L41
                if (r1 != 0) goto L22
                goto L41
            L22:
                int r0 = r0.getType()
                r1 = 1
                if (r0 == r1) goto L34
                r1 = 6
                if (r0 == r1) goto L34
                r1 = 7
                if (r0 == r1) goto L34
                r1 = 8
                if (r0 == r1) goto L34
                goto L41
            L34:
                com.beizi.ad.internal.view.AdWebView r0 = r2.a
                r0.b(r4)
                r3.stopLoading()
                com.beizi.ad.internal.view.AdWebView r3 = r2.a
                r3.c()
            L41:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
                r2 = this;
                super.onPageFinished(r3, r4)
                com.beizi.ad.internal.view.AdWebView r4 = r2.a
                com.beizi.ad.internal.f.c r0 = r4.ad
                com.beizi.ad.internal.k r0 = r0.a
                com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
                if (r0 != r1) goto L10
                r4.visible()
            L10:
                com.beizi.ad.internal.view.AdWebView r4 = r2.a
                boolean r4 = com.beizi.ad.internal.view.AdWebView.d(r4)
                if (r4 != 0) goto L3e
                java.lang.String r4 = "javascript:window.mraid.util.pageFinished()"
                r0 = 0
                r3.evaluateJavascript(r4, r0)
                com.beizi.ad.internal.view.AdWebView r3 = r2.a
                boolean r3 = com.beizi.ad.internal.view.AdWebView.a(r3)
                if (r3 == 0) goto L38
                com.beizi.ad.internal.view.AdWebView r3 = r2.a
                com.beizi.ad.internal.view.f r3 = com.beizi.ad.internal.view.AdWebView.c(r3)
                com.beizi.ad.internal.view.AdWebView r4 = r2.a
                java.lang.String r0 = r4.f7136b
                r3.a(r4, r0)
                com.beizi.ad.internal.view.AdWebView r3 = r2.a
                com.beizi.ad.internal.view.AdWebView.e(r3)
            L38:
                com.beizi.ad.internal.view.AdWebView r3 = r2.a
                r4 = 1
                com.beizi.ad.internal.view.AdWebView.a(r3, r4)
            L3e:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                com.beizi.ad.internal.view.AdViewImpl r1 = r1.adViewImpl
                if (r1 == 0) goto L18
                com.beizi.ad.internal.c r1 = r1.getAdDispatcher()
                if (r1 == 0) goto L18
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                com.beizi.ad.internal.view.AdViewImpl r1 = r1.adViewImpl
                com.beizi.ad.internal.c r1 = r1.getAdDispatcher()
                r2 = 2
                r1.a(r2)
            L18:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView r1, android.webkit.SslErrorHandler r2, android.net.http.SslError r3) {
                r0 = this;
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                com.beizi.ad.internal.view.AdWebView.f(r1)
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                com.beizi.ad.internal.view.AdViewImpl r1 = r1.adViewImpl
                if (r1 == 0) goto L1d
                com.beizi.ad.internal.c r1 = r1.getAdDispatcher()
                if (r1 == 0) goto L1d
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                com.beizi.ad.internal.view.AdViewImpl r1 = r1.adViewImpl
                com.beizi.ad.internal.c r1 = r1.getAdDispatcher()
                r2 = 2
                r1.a(r2)
            L1d:
                return
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r1, android.webkit.WebResourceRequest r2) {
                r0 = this;
                com.beizi.ad.internal.view.AdWebView r1 = r0.a
                android.webkit.WebResourceResponse r1 = com.beizi.ad.internal.view.AdWebView.a(r1, r2)
                return r1
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r12, java.lang.String r13) {
                r11 = this;
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "Loading:::::::::::::::::::::::"
                r12.append(r0)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r0 = "lance"
                com.beizi.ad.lance.a.m.a(r0, r12)
                java.lang.String r12 = "javascript:"
                boolean r12 = r13.startsWith(r12)
                if (r12 == 0) goto L20
                r12 = 0
                return r12
            L20:
                java.lang.String r12 = "mraid://"
                boolean r12 = r13.startsWith(r12)
                r0 = 1
                if (r12 == 0) goto L73
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                boolean r12 = com.beizi.ad.internal.view.AdWebView.a(r12)
                if (r12 == 0) goto L41
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                com.beizi.ad.internal.view.f r12 = com.beizi.ad.internal.view.AdWebView.c(r12)
                com.beizi.ad.internal.view.AdWebView r1 = r11.a
                boolean r1 = com.beizi.ad.internal.view.AdWebView.b(r1)
                r12.a(r13, r1)
                goto L72
            L41:
                android.net.Uri r12 = android.net.Uri.parse(r13)
                java.lang.String r12 = r12.getHost()
                if (r12 == 0) goto L59
                java.lang.String r1 = "enable"
                boolean r1 = r12.equals(r1)
                if (r1 == 0) goto L59
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                r12.fireMRAIDEnabled()
                goto L72
            L59:
                if (r12 == 0) goto L72
                java.lang.String r1 = "open"
                boolean r12 = r12.equals(r1)
                if (r12 == 0) goto L72
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                com.beizi.ad.internal.view.f r12 = com.beizi.ad.internal.view.AdWebView.c(r12)
                com.beizi.ad.internal.view.AdWebView r1 = r11.a
                boolean r1 = com.beizi.ad.internal.view.AdWebView.b(r1)
                r12.a(r13, r1)
            L72:
                return r0
            L73:
                java.lang.String r12 = "BeiZi://"
                boolean r12 = r13.startsWith(r12)
                if (r12 == 0) goto Lca
                android.net.Uri r12 = android.net.Uri.parse(r13)     // Catch: java.lang.Exception -> Lc4
                java.lang.String r12 = r12.getHost()     // Catch: java.lang.Exception -> Lc4
                boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Lc4
                if (r1 != 0) goto Lc4
                java.lang.String r1 = "ClosePage"
                boolean r12 = r1.equals(r12)     // Catch: java.lang.Exception -> Lc4
                if (r12 != 0) goto Lc4
                com.beizi.ad.internal.view.AdWebView r12 = r11.a     // Catch: java.lang.Exception -> Lc4
                com.beizi.ad.internal.f.c r1 = r12.ad     // Catch: java.lang.Exception -> Lc4
                if (r1 == 0) goto Lc4
                com.beizi.ad.internal.view.AdViewImpl r12 = r12.adViewImpl     // Catch: java.lang.Exception -> Lc4
                if (r12 == 0) goto Lc4
                com.beizi.ad.internal.e r12 = r12.getAdParameters()     // Catch: java.lang.Exception -> Lc4
                if (r12 == 0) goto Lc4
                com.beizi.ad.internal.view.AdWebView r2 = r11.a     // Catch: java.lang.Exception -> Lc4
                com.beizi.ad.internal.f.c r1 = r2.ad     // Catch: java.lang.Exception -> Lc4
                java.lang.String r3 = ""
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                java.lang.String r6 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                boolean r9 = r2.f7137c     // Catch: java.lang.Exception -> Lc4
                com.beizi.ad.internal.view.AdViewImpl r12 = r2.adViewImpl     // Catch: java.lang.Exception -> Lc4
                com.beizi.ad.internal.e r12 = r12.getAdParameters()     // Catch: java.lang.Exception -> Lc4
                java.lang.String r10 = r12.a()     // Catch: java.lang.Exception -> Lc4
                r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lc4
                com.beizi.ad.internal.view.AdWebView r12 = r11.a     // Catch: java.lang.Exception -> Lc4
                r12.f7137c = r0     // Catch: java.lang.Exception -> Lc4
            Lc4:
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                com.beizi.ad.internal.view.b.a(r12, r13)
                return r0
            Lca:
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                r12.b(r13)
                com.beizi.ad.internal.view.AdWebView r12 = r11.a
                r12.c()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends android.webkit.WebView {
        final /* synthetic */ com.beizi.ad.internal.view.AdWebView a;


        @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
        public c(com.beizi.ad.internal.view.AdWebView r2, android.content.Context r3) {
                r1 = this;
                r1.a = r2
                android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper
                r0.<init>(r3)
                r1.<init>(r0)
                com.beizi.ad.internal.h.x.a(r1)
                com.beizi.ad.internal.view.AdWebView$c$1 r3 = new com.beizi.ad.internal.view.AdWebView$c$1
                r3.<init>(r1, r2)
                r1.setWebViewClient(r3)
                return
        }
    }

    public AdWebView(com.beizi.ad.internal.view.AdViewImpl r4) {
            r3 = this;
            android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r3.<init>(r0)
            r0 = 0
            r3.f7138d = r0
            r1 = 0
            r3.ad = r1
            r3.mAdVideoView = r1
            r3.a = r0
            r3.o = r0
            r3.p = r0
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r3.q = r2
            r3.r = r0
            r3.u = r0
            r3.v = r0
            r2 = -1
            r3.y = r2
            r3.z = r0
            r3.A = r0
            r3.B = r0
            r3.C = r0
            r3.D = r0
            r3.E = r0
            r3.f7137c = r0
            r3.J = r1
            r3.K = r1
            com.beizi.ad.internal.view.AdWebView$5 r1 = new com.beizi.ad.internal.view.AdWebView$5
            r1.<init>(r3)
            r3.L = r1
            r3.setBackgroundColor(r0)
            r3.adViewImpl = r4
            java.lang.String[] r4 = com.beizi.ad.internal.view.f.a
            com.beizi.ad.internal.view.f$b r0 = com.beizi.ad.internal.view.f.b.a
            int r0 = r0.ordinal()
            r4 = r4[r0]
            r3.f7136b = r4
            r3.a()
            r3.b()
            r4 = 4
            r3.setVisibility(r4)
            return
    }

    private static float a(float r1) {
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.util.DisplayMetrics r0 = r0.j()
            float r0 = r0.density
            float r1 = r1 / r0
            return r1
    }

    private static float a(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r2
            float r1 = r1 - r3
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            float r0 = a(r0)
            return r0
    }

    private android.webkit.WebResourceResponse a(android.webkit.WebResourceRequest r6) {
            r5 = this;
            r0 = 0
            java.util.Map r1 = r6.getRequestHeaders()     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = "*/*"
            java.lang.String r3 = "Accept"
            if (r1 == 0) goto L1e
            int r4 = r1.size()     // Catch: java.lang.Exception -> L73
            if (r4 <= 0) goto L1e
            boolean r4 = r1.containsKey(r3)     // Catch: java.lang.Exception -> L73
            if (r4 == 0) goto L1e
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L73
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L73
        L1e:
            android.net.Uri r1 = r6.getUrl()     // Catch: java.lang.Exception -> L73
            if (r1 != 0) goto L25
            return r0
        L25:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = "http"
            boolean r4 = r1.startsWith(r4)     // Catch: java.lang.Exception -> L73
            if (r4 != 0) goto L32
            return r0
        L32:
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Exception -> L73
            r4.<init>(r1)     // Catch: java.lang.Exception -> L73
            java.net.URLConnection r1 = r4.openConnection()     // Catch: java.lang.Exception -> L73
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Exception -> L73
            r5.J = r1     // Catch: java.lang.Exception -> L73
            java.lang.String r6 = r6.getMethod()     // Catch: java.lang.Exception -> L73
            r1.setRequestMethod(r6)     // Catch: java.lang.Exception -> L73
            java.net.HttpURLConnection r6 = r5.J     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = "X-Requested-With"
            java.lang.String r4 = ""
            r6.setRequestProperty(r1, r4)     // Catch: java.lang.Exception -> L73
            java.net.HttpURLConnection r6 = r5.J     // Catch: java.lang.Exception -> L73
            r6.setRequestProperty(r3, r2)     // Catch: java.lang.Exception -> L73
            java.net.HttpURLConnection r6 = r5.J     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = "User-Agent"
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = r3.f6835e     // Catch: java.lang.Exception -> L73
            r6.setRequestProperty(r1, r3)     // Catch: java.lang.Exception -> L73
            java.net.HttpURLConnection r6 = r5.J     // Catch: java.lang.Exception -> L73
            java.io.InputStream r6 = r6.getInputStream()     // Catch: java.lang.Exception -> L73
            r5.K = r6     // Catch: java.lang.Exception -> L73
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = "UTF-8"
            java.io.InputStream r3 = r5.K     // Catch: java.lang.Exception -> L73
            r6.<init>(r2, r1, r3)     // Catch: java.lang.Exception -> L73
            return r6
        L73:
            return r0
    }

    static /* synthetic */ android.webkit.WebResourceResponse a(com.beizi.ad.internal.view.AdWebView r0, android.webkit.WebResourceRequest r1) {
            android.webkit.WebResourceResponse r0 = r0.a(r1)
            return r0
    }

    static /* synthetic */ java.lang.String a(com.beizi.ad.internal.view.AdWebView r0, java.lang.String r1) {
            java.lang.String r0 = r0.d(r1)
            return r0
    }

    private void a(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto L16
            if (r2 != 0) goto L16
            com.beizi.ad.internal.h.x.b(r0)
            r1 = 1
            r0.p = r1
            boolean r1 = r0.f7139e
            if (r1 == 0) goto L1f
            boolean r1 = r0.f7143i
            if (r1 == 0) goto L1f
            r0.i()
            goto L1f
        L16:
            com.beizi.ad.internal.h.x.c(r0)
            r1 = 0
            r0.p = r1
            r0.j()
        L1f:
            com.beizi.ad.internal.view.f r1 = r0.f7140f
            if (r1 == 0) goto L26
            r1.b()
        L26:
            return
    }

    private void a(android.webkit.WebView r5) {
            r4 = this;
            java.lang.Class r0 = com.beizi.ad.AdActivity.a()
            android.content.Intent r1 = new android.content.Intent
            com.beizi.ad.internal.view.AdViewImpl r2 = r4.adViewImpl
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            java.lang.String r0 = "ACTIVITY_TYPE"
            java.lang.String r2 = "BROWSER"
            r1.putExtra(r0, r2)
            java.util.LinkedList<android.webkit.WebView> r0 = com.beizi.ad.internal.activity.a.a
            r0.add(r5)
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.adViewImpl
            com.beizi.ad.internal.view.AdViewImpl$c r5 = r5.getBrowserStyle()
            if (r5 == 0) goto L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = ""
            r5.append(r0)
            int r0 = super.hashCode()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "bridgeid"
            r1.putExtra(r0, r5)
            java.util.ArrayList<android.util.Pair<java.lang.String, com.beizi.ad.internal.view.AdViewImpl$c>> r0 = com.beizi.ad.internal.view.AdViewImpl.c.a
            android.util.Pair r2 = new android.util.Pair
            com.beizi.ad.internal.view.AdViewImpl r3 = r4.adViewImpl
            com.beizi.ad.internal.view.AdViewImpl$c r3 = r3.getBrowserStyle()
            r2.<init>(r5, r3)
            r0.add(r2)
        L52:
            com.beizi.ad.internal.view.AdViewImpl r5 = r4.adViewImpl     // Catch: android.content.ActivityNotFoundException -> L5f
            android.content.Context r5 = r5.getContext()     // Catch: android.content.ActivityNotFoundException -> L5f
            r5.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L5f
            r4.k()     // Catch: android.content.ActivityNotFoundException -> L5f
            return
        L5f:
            java.util.LinkedList<android.webkit.WebView> r5 = com.beizi.ad.internal.activity.a.a
            r5.remove()
            return
    }

    private void a(android.widget.FrameLayout.LayoutParams r3) {
            r2 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r2.adViewImpl
            boolean r1 = r0 instanceof com.beizi.ad.internal.view.BannerAdViewImpl
            if (r1 == 0) goto L1e
            com.beizi.ad.internal.view.BannerAdViewImpl r0 = (com.beizi.ad.internal.view.BannerAdViewImpl) r0
            boolean r0 = r0.getResizeAdToFitContainer()
            if (r0 == 0) goto L1a
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = 17
            r1 = -1
            r3.<init>(r1, r1, r0)
            r2.setLayoutParams(r3)
            return
        L1a:
            r2.setLayoutParams(r3)
            return
        L1e:
            r2.setLayoutParams(r3)
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.view.AdWebView r0, android.webkit.WebView r1) {
            r0.a(r1)
            return
    }

    private void a(java.util.HashMap r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L1b
        L7:
            java.lang.String r0 = "MRAID"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L1b
            java.lang.Object r3 = r3.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.f7139e = r3
        L1b:
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.view.AdWebView r0) {
            boolean r0 = r0.f7139e
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.view.AdWebView r0, boolean r1) {
            r0.f7143i = r1
            return r1
    }

    static /* synthetic */ java.lang.String b(com.beizi.ad.internal.view.AdWebView r0, java.lang.String r1) {
            java.lang.String r0 = r0.e(r1)
            return r0
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.view.AdWebView r0) {
            boolean r0 = r0.v
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.view.f c(com.beizi.ad.internal.view.AdWebView r0) {
            com.beizi.ad.internal.view.f r0 = r0.f7140f
            return r0
    }

    static /* synthetic */ java.lang.String c(com.beizi.ad.internal.view.AdWebView r0, java.lang.String r1) {
            java.lang.String r0 = r0.f(r1)
            return r0
    }

    private java.lang.String d(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r3)
            if (r0 != 0) goto L27
            r3.getClass()
            java.lang.String r0 = "<html>"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<html><body style='padding:0;margin:0;'>"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "</body></html>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L27:
            return r3
    }

    static /* synthetic */ boolean d(com.beizi.ad.internal.view.AdWebView r0) {
            boolean r0 = r0.f7143i
            return r0
    }

    static /* synthetic */ boolean d(com.beizi.ad.internal.view.AdWebView r0, java.lang.String r1) {
            boolean r0 = r0.h(r1)
            return r0
    }

    private java.lang.String e(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r4)
            if (r0 != 0) goto L3d
            android.content.res.Resources r0 = r3.getResources()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "<html><head><script>"
            r1.<init>(r2)
            if (r0 == 0) goto L3d
            java.lang.String r0 = com.beizi.ad.internal.h.o.f6897b
            boolean r0 = com.beizi.ad.internal.h.o.a(r1, r0)
            if (r0 == 0) goto L3d
            java.lang.String r0 = com.beizi.ad.internal.h.o.a
            boolean r0 = com.beizi.ad.internal.h.o.a(r1, r0)
            if (r0 == 0) goto L3d
            boolean r0 = com.beizi.ad.internal.h.o.a(r1)
            if (r0 != 0) goto L2a
            goto L3d
        L2a:
            java.lang.String r0 = "</script></head>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)
            java.lang.String r1 = "<html>"
            java.lang.String r4 = r4.replaceFirst(r1, r0)
        L3d:
            return r4
    }

    static /* synthetic */ void e(com.beizi.ad.internal.view.AdWebView r0) {
            r0.i()
            return
    }

    private java.lang.String f(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r3)
            if (r0 != 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no\"/>"
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)
            java.lang.String r1 = "<head>"
            java.lang.String r3 = r3.replaceFirst(r1, r0)
        L1b:
            return r3
    }

    static /* synthetic */ void f(com.beizi.ad.internal.view.AdWebView r0) {
            r0.h()
            return
    }

    static /* synthetic */ boolean g(com.beizi.ad.internal.view.AdWebView r0) {
            boolean r0 = r0.r
            return r0
    }

    private boolean g(java.lang.String r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.<init>(r1, r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)
            com.beizi.ad.internal.view.AdViewImpl r3 = r2.adViewImpl     // Catch: android.content.ActivityNotFoundException -> L1b
            android.content.Context r3 = r3.getContext()     // Catch: android.content.ActivityNotFoundException -> L1b
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L1b
            r3 = 1
            return r3
        L1b:
            boolean r3 = r2.f7139e
            r0 = 0
            if (r3 == 0) goto L30
            com.beizi.ad.internal.view.AdViewImpl r3 = r2.adViewImpl
            android.content.Context r3 = r3.getContext()
            int r1 = com.beizi.fusion.R.string.beizi_action_cant_be_completed
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r1, r0)
            r3.show()
        L30:
            return r0
    }

    static /* synthetic */ android.os.Handler h(com.beizi.ad.internal.view.AdWebView r0) {
            android.os.Handler r0 = r0.q
            return r0
    }

    private void h() {
            r1 = this;
            r0 = 1
            r1.f7138d = r0
            return
    }

    private boolean h(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "aHR0cDovL2Fib3V0OmJsYW5r"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)
            java.lang.String r1 = "http"
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L19
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L19
            boolean r3 = r2.g(r3)
            return r3
        L19:
            r3 = 0
            return r3
    }

    static /* synthetic */ android.app.ProgressDialog i(com.beizi.ad.internal.view.AdWebView r0) {
            android.app.ProgressDialog r0 = r0.t
            return r0
    }

    private void i() {
            r2 = this;
            boolean r0 = r2.p
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.r = r0
            android.os.Handler r0 = r2.q
            java.lang.Runnable r1 = r2.L
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.q
            java.lang.Runnable r1 = r2.L
            r0.post(r1)
            return
    }

    private void j() {
            r2 = this;
            r0 = 1
            r2.r = r0
            android.os.Handler r0 = r2.q
            java.lang.Runnable r1 = r2.L
            r0.removeCallbacks(r1)
            return
    }

    static /* synthetic */ void j(com.beizi.ad.internal.view.AdWebView r0) {
            r0.k()
            return
    }

    private void k() {
            r2 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r2.adViewImpl
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof com.beizi.ad.internal.view.InterstitialAdViewImpl
            if (r1 == 0) goto Ld
            com.beizi.ad.internal.view.InterstitialAdViewImpl r0 = (com.beizi.ad.internal.view.InterstitialAdViewImpl) r0
            r0.g()
        Ld:
            return
    }

    private void setCreativeHeight(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    private void setCreativeWidth(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public boolean IsVideoWifiOnly() {
            r1 = this;
            boolean r0 = r1.D
            return r0
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    protected void a() {
            r4 = this;
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r2 = 0
            r0.setBuiltInZoomControls(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setEnableSmoothTransition(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setLightTouchEnabled(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings$PluginState r3 = android.webkit.WebSettings.PluginState.ON     // Catch: java.lang.Throwable -> L9d
            r0.setPluginState(r3)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setLoadsImagesAutomatically(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setSavePassword(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setSupportZoom(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setUseWideViewPort(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setMediaPlaybackRequiresUserGesture(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setMixedContentMode(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setAllowFileAccess(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setAllowContentAccess(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setAllowFileAccessFromFileURLs(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setAllowUniversalAccessFromFileURLs(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L9d
            r0.setGeolocationEnabled(r2)     // Catch: java.lang.Throwable -> L9d
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L87
            r0.setAcceptThirdPartyCookies(r4, r1)     // Catch: java.lang.Throwable -> L9d
        L87:
            r4.setHorizontalScrollbarOverlay(r2)     // Catch: java.lang.Throwable -> L9d
            r4.setHorizontalScrollBarEnabled(r2)     // Catch: java.lang.Throwable -> L9d
            r4.setVerticalScrollbarOverlay(r2)     // Catch: java.lang.Throwable -> L9d
            r4.setVerticalScrollBarEnabled(r2)     // Catch: java.lang.Throwable -> L9d
            boolean r0 = r4.B     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L9a
            r4.setBackgroundColor(r2)     // Catch: java.lang.Throwable -> L9d
        L9a:
            r4.setScrollBarStyle(r2)     // Catch: java.lang.Throwable -> L9d
        L9d:
            return
    }

    void a(int r12, int r13, boolean r14, com.beizi.ad.internal.view.f r15, boolean r16, com.beizi.ad.AdActivity.b r17) {
            r11 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            r1.<init>(r2)
            com.beizi.ad.internal.view.f r2 = r11.f7140f
            boolean r2 = r2.f7206d
            if (r2 != 0) goto L2f
            int r2 = r1.width
            r11.f7141g = r2
            int r2 = r1.height
            r11.f7142h = r2
        L2f:
            r2 = -1
            if (r13 != r2) goto L3b
            if (r12 != r2) goto L3b
            com.beizi.ad.internal.view.AdViewImpl r3 = r11.adViewImpl
            if (r3 == 0) goto L3b
            r3 = 1
            r11.a = r3
        L3b:
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r13 == r2) goto L47
            float r13 = (float) r13
            float r5 = r0.density
            float r13 = r13 * r5
            double r5 = (double) r13
            double r5 = r5 + r3
            int r13 = (int) r5
        L47:
            r7 = r13
            if (r12 == r2) goto L52
            float r12 = (float) r12
            float r13 = r0.density
            float r12 = r12 * r13
            double r12 = (double) r12
            double r12 = r12 + r3
            int r12 = (int) r12
        L52:
            r6 = r12
            r1.height = r7
            r1.width = r6
            r12 = 17
            r1.gravity = r12
            boolean r12 = r11.a
            if (r12 == 0) goto L6a
            com.beizi.ad.internal.view.AdWebView$4 r12 = new com.beizi.ad.internal.view.AdWebView$4
            r13 = r16
            r0 = r17
            r12.<init>(r11, r15, r13, r0)
        L68:
            r10 = r12
            goto L6c
        L6a:
            r12 = 0
            goto L68
        L6c:
            com.beizi.ad.internal.view.AdViewImpl r5 = r11.adViewImpl
            if (r5 == 0) goto L7a
            r8 = r14
            r9 = r15
            r5.a(r6, r7, r8, r9, r10)
            com.beizi.ad.internal.view.AdViewImpl r12 = r11.adViewImpl
            r12.f()
        L7a:
            r11.setLayoutParams(r1)
            return
    }

    protected void a(android.app.Activity r2, boolean r3, com.beizi.ad.AdActivity.b r4) {
            r1 = this;
            com.beizi.ad.AdActivity$b r0 = com.beizi.ad.AdActivity.b.f6425c
            if (r4 == r0) goto L7
            com.beizi.ad.AdActivity.a(r2, r4)
        L7:
            if (r3 == 0) goto Ld
            com.beizi.ad.AdActivity.b(r2)
            return
        Ld:
            if (r4 != r0) goto L12
            com.beizi.ad.AdActivity.a(r2)
        L12:
            return
    }

    protected void a(java.lang.String r4) {
            r3 = this;
            com.beizi.ad.internal.view.AdWebView$1 r0 = new com.beizi.ad.internal.view.AdWebView$1
            r1 = 1
            r2 = 0
            r0.<init>(r3, r2, r1, r4)
            java.lang.Void[] r4 = new java.lang.Void[r2]
            r0.execute(r4)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    protected void b() {
            r2 = this;
            com.beizi.ad.internal.view.f r0 = new com.beizi.ad.internal.view.f
            r0.<init>(r2)
            r2.f7140f = r0
            android.content.Context r0 = r2.getContextFromMutableContext()     // Catch: java.lang.Exception -> L17
            boolean r0 = r0 instanceof android.app.Activity     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L17
            com.beizi.ad.internal.view.h r0 = new com.beizi.ad.internal.view.h     // Catch: java.lang.Exception -> L17
            r0.<init>(r2)     // Catch: java.lang.Exception -> L17
            r2.setWebChromeClient(r0)     // Catch: java.lang.Exception -> L17
        L17:
            com.beizi.ad.internal.view.AdWebView$a r0 = new com.beizi.ad.internal.view.AdWebView$a
            r1 = 0
            r0.<init>(r2, r1)
            r2.setWebViewClient(r0)
            return
    }

    void b(java.lang.String r4) {
            r3 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r3.adViewImpl
            boolean r0 = r0.getOpensNativeBrowser()
            if (r0 != 0) goto L8e
            boolean r0 = r3.h(r4)
            if (r0 == 0) goto L10
            goto L8d
        L10:
            com.beizi.ad.internal.view.AdViewImpl r0 = r3.adViewImpl     // Catch: java.lang.Exception -> L8d
            boolean r0 = r0.getLoadsInBackground()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L72
            com.beizi.ad.internal.view.AdWebView$c r0 = new com.beizi.ad.internal.view.AdWebView$c     // Catch: java.lang.Exception -> L8d
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Exception -> L8d
            r0.<init>(r3, r1)     // Catch: java.lang.Exception -> L8d
            java.util.Map r1 = com.beizi.ad.lance.a.j.a()     // Catch: java.lang.Exception -> L8d
            r0.loadUrl(r4, r1)     // Catch: java.lang.Exception -> L8d
            r4 = 8
            r0.setVisibility(r4)     // Catch: java.lang.Exception -> L8d
            com.beizi.ad.internal.view.AdViewImpl r4 = r3.adViewImpl     // Catch: java.lang.Exception -> L8d
            r4.addView(r0)     // Catch: java.lang.Exception -> L8d
            com.beizi.ad.internal.view.AdViewImpl r4 = r3.adViewImpl     // Catch: java.lang.Exception -> L8d
            boolean r4 = r4.getShowLoadingIndicator()     // Catch: java.lang.Exception -> L8d
            if (r4 == 0) goto L8d
            android.app.ProgressDialog r4 = new android.app.ProgressDialog     // Catch: java.lang.Exception -> L8d
            android.content.Context r1 = r3.getContextFromMutableContext()     // Catch: java.lang.Exception -> L8d
            r4.<init>(r1)     // Catch: java.lang.Exception -> L8d
            r3.t = r4     // Catch: java.lang.Exception -> L8d
            r1 = 1
            r4.setCancelable(r1)     // Catch: java.lang.Exception -> L8d
            android.app.ProgressDialog r4 = r3.t     // Catch: java.lang.Exception -> L8d
            com.beizi.ad.internal.view.AdWebView$2 r1 = new com.beizi.ad.internal.view.AdWebView$2     // Catch: java.lang.Exception -> L8d
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L8d
            r4.setOnCancelListener(r1)     // Catch: java.lang.Exception -> L8d
            android.app.ProgressDialog r4 = r3.t     // Catch: java.lang.Exception -> L8d
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L8d
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L8d
            int r1 = com.beizi.fusion.R.string.beizi_loading     // Catch: java.lang.Exception -> L8d
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L8d
            r4.setMessage(r0)     // Catch: java.lang.Exception -> L8d
            android.app.ProgressDialog r4 = r3.t     // Catch: java.lang.Exception -> L8d
            r0 = 0
            r4.setProgressStyle(r0)     // Catch: java.lang.Exception -> L8d
            android.app.ProgressDialog r4 = r3.t     // Catch: java.lang.Exception -> L8d
            r4.show()     // Catch: java.lang.Exception -> L8d
            return
        L72:
            android.webkit.WebView r0 = new android.webkit.WebView     // Catch: java.lang.Exception -> L8d
            android.content.MutableContextWrapper r1 = new android.content.MutableContextWrapper     // Catch: java.lang.Exception -> L8d
            android.content.Context r2 = r3.getContext()     // Catch: java.lang.Exception -> L8d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L8d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8d
            com.beizi.ad.internal.h.x.a(r0)     // Catch: java.lang.Exception -> L8d
            java.util.Map r1 = com.beizi.ad.lance.a.j.a()     // Catch: java.lang.Exception -> L8d
            r0.loadUrl(r4, r1)     // Catch: java.lang.Exception -> L8d
            r3.a(r0)     // Catch: java.lang.Exception -> L8d
        L8d:
            return
        L8e:
            r3.g(r4)
            r3.k()
            return
    }

    void c() {
            r1 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r1.adViewImpl
            if (r0 == 0) goto L7
            r0.f()
        L7:
            return
    }

    protected void c(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.evaluateJavascript(r2, r0)
            return
    }

    public void closeWebResourceRequestConnection() {
            r1 = this;
            java.io.InputStream r0 = r1.K     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.lang.Exception -> Le
        L7:
            java.net.HttpURLConnection r0 = r1.J     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto Le
            r0.disconnect()     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    void d() {
            r1 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r1.adViewImpl
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    @Override // android.webkit.WebView, com.beizi.ad.internal.view.c
    public void destroy() {
            r1 = this;
            r0 = 4
            r1.setVisibility(r0)
            com.beizi.ad.internal.h.u.a(r1)
            super.destroy()
            r1.removeAllViews()
            r1.j()
            return
    }

    void e() {
            r4 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r4.adViewImpl
            if (r0 == 0) goto Ld
            int r1 = r4.f7141g
            int r2 = r4.f7142h
            com.beizi.ad.internal.view.f r3 = r4.f7140f
            r0.a(r1, r2, r3)
        Ld:
            return
    }

    protected void f() {
            r7 = this;
            android.content.Context r0 = r7.getContextFromMutableContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L9
            goto L5f
        L9:
            r0 = 2
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r1 = 0
            r2 = r0[r1]
            int r3 = r7.getWidth()
            int r3 = r3 + r2
            r4 = 1
            r0 = r0[r4]
            int r5 = r7.getHeight()
            int r5 = r5 + r0
            android.content.Context r6 = r7.getContextFromMutableContext()
            android.app.Activity r6 = (android.app.Activity) r6
            int[] r6 = com.beizi.ad.internal.h.u.a(r6)
            if (r3 <= 0) goto L36
            r3 = r6[r1]
            if (r2 >= r3) goto L36
            if (r5 <= 0) goto L36
            r3 = r6[r4]
            if (r0 >= r3) goto L36
            r1 = 1
        L36:
            r7.o = r1
            com.beizi.ad.internal.view.f r1 = r7.f7140f
            if (r1 == 0) goto L5f
            r1.b()
            com.beizi.ad.internal.view.f r1 = r7.f7140f
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            r1.a(r2, r0, r3, r4)
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            com.beizi.ad.internal.view.f r1 = r7.f7140f
            r1.a(r0)
        L5f:
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
            r1 = this;
            boolean r0 = r1.f7138d
            return r0
    }

    public void fireMRAIDEnabled() {
            r2 = this;
            boolean r0 = r2.f7139e
            if (r0 == 0) goto L5
            goto L16
        L5:
            r0 = 1
            r2.f7139e = r0
            boolean r0 = r2.f7143i
            if (r0 == 0) goto L16
            com.beizi.ad.internal.view.f r0 = r2.f7140f
            java.lang.String r1 = r2.f7136b
            r0.a(r2, r1)
            r2.i()
        L16:
            return
    }

    boolean g() {
            r1 = this;
            boolean r0 = r1.o
            if (r0 == 0) goto La
            boolean r0 = r1.p
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public java.util.HashMap<java.lang.String, java.lang.Object> getAdExtras() {
            r1 = this;
            com.beizi.ad.internal.f.c r0 = r1.ad
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.HashMap r0 = r0.j()
            return r0
    }

    public int getAutoCloseTime() {
            r1 = this;
            int r0 = r1.x
            return r0
    }

    public android.content.Context getContextFromMutableContext() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L13
            android.content.Context r0 = r1.getContext()
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            return r0
        L13:
            android.content.Context r0 = r1.getContext()
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public int getCreativeLeft() {
            r1 = this;
            int r0 = r1.f7144j
            return r0
    }

    public int getCreativeTop() {
            r1 = this;
            int r0 = r1.f7145k
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    protected com.beizi.ad.internal.view.f getMRAIDImplementation() {
            r1 = this;
            com.beizi.ad.internal.view.f r0 = r1.f7140f
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public com.beizi.ad.internal.view.c getRealDisplayable() {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L9
            com.beizi.ad.internal.video.AdVideoView r0 = r1.mAdVideoView
            if (r0 == 0) goto L9
            return r0
        L9:
            return r1
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public int getShowCloseBtnTime() {
            r1 = this;
            int r0 = r1.w
            return r0
    }

    boolean getUserInteraction() {
            r1 = this;
            boolean r0 = r1.v
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void handleClickView(android.view.MotionEvent r12, long r13, long r15) {
            r11 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r11.adViewImpl
            if (r0 == 0) goto Lca
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto Lca
            com.beizi.ad.internal.view.AdViewImpl r0 = r11.adViewImpl
            boolean r0 = r0.isRewardedVideo()
            if (r0 != 0) goto Lca
            int r0 = r11.E
            r10 = 1
            int r0 = r0 + r10
            r11.E = r0
            com.beizi.ad.internal.view.AdViewImpl r0 = r11.adViewImpl
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.d()
            com.beizi.ad.internal.f.c r0 = r11.ad
            com.beizi.ad.internal.view.AdViewImpl r2 = r11.adViewImpl
            boolean r2 = r2.getOpensNativeBrowser()
            r0.a(r2)
            com.beizi.ad.internal.f.c r0 = r11.ad
            com.beizi.ad.internal.view.AdViewImpl r2 = r11.adViewImpl
            boolean r2 = r2.isCloseMarketDialog()
            r0.b(r2)
            if (r12 != 0) goto L5c
            com.beizi.ad.internal.f.c r0 = r11.ad
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r7 = java.lang.String.valueOf(r15)
            boolean r8 = r11.f7137c
            com.beizi.ad.internal.view.AdViewImpl r2 = r11.adViewImpl
            com.beizi.ad.internal.e r2 = r2.getAdParameters()
            java.lang.String r9 = r2.a()
            java.lang.String r2 = "100"
            java.lang.String r3 = "200"
            java.lang.String r4 = "105"
            java.lang.String r5 = "206"
            r1 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lc8
        L5c:
            com.beizi.ad.internal.f.c r0 = r11.ad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            float r3 = r12.getX()
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r12.getY()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            float r6 = r12.getRawX()
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            float r7 = r12.getRawY()
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r7 = java.lang.String.valueOf(r15)
            boolean r8 = r11.f7137c
            com.beizi.ad.internal.view.AdViewImpl r9 = r11.adViewImpl
            com.beizi.ad.internal.e r9 = r9.getAdParameters()
            java.lang.String r9 = r9.a()
            r1 = r5
            r5 = r3
            r3 = r4
            r4 = r1
            r1 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Lc8:
            r11.f7137c = r10
        Lca:
            return
    }

    public void handleClickView(com.beizi.ad.model.d r10, long r11, long r13, int r15) {
            r9 = this;
            com.beizi.ad.internal.view.AdViewImpl r0 = r9.adViewImpl
            if (r0 == 0) goto L55
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto L55
            com.beizi.ad.internal.view.AdViewImpl r0 = r9.adViewImpl
            boolean r0 = r0.isRewardedVideo()
            if (r0 != 0) goto L55
            int r0 = r9.E
            r8 = 1
            int r0 = r0 + r8
            r9.E = r0
            com.beizi.ad.internal.view.AdViewImpl r0 = r9.adViewImpl
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.d()
            com.beizi.ad.internal.f.c r0 = r9.ad
            com.beizi.ad.internal.view.AdViewImpl r2 = r9.adViewImpl
            boolean r2 = r2.getOpensNativeBrowser()
            r0.a(r2)
            com.beizi.ad.internal.f.c r0 = r9.ad
            com.beizi.ad.internal.view.AdViewImpl r2 = r9.adViewImpl
            boolean r2 = r2.isCloseMarketDialog()
            r0.b(r2)
            com.beizi.ad.internal.f.c r0 = r9.ad
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r4 = java.lang.String.valueOf(r13)
            boolean r5 = r9.f7137c
            com.beizi.ad.internal.view.AdViewImpl r2 = r9.adViewImpl
            com.beizi.ad.internal.e r2 = r2.getAdParameters()
            java.lang.String r6 = r2.a()
            r1 = r9
            r2 = r10
            r7 = r15
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            r9.f7137c = r8
        L55:
            return
    }

    public boolean isAutoPlay() {
            r1 = this;
            boolean r0 = r1.z
            return r0
    }

    public boolean isMRAIDUseCustomClose() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public boolean isMuted() {
            r1 = this;
            boolean r0 = r1.A
            return r0
    }

    public boolean isVideoFullScreen() {
            r1 = this;
            boolean r0 = r1.B
            return r0
    }

    public void loadAd(com.beizi.ad.internal.f.c r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r4.ad = r5
            int r0 = r5.c()
            r4.setCreativeHeight(r0)
            int r0 = r5.d()
            r4.setCreativeWidth(r0)
            int r0 = r5.u()
            r4.setCreativeLeft(r0)
            int r0 = r5.t()
            r4.setCreativeTop(r0)
            int r0 = r5.w()
            r4.setRefreshInterval(r0)
            boolean r0 = r5.o()
            r1 = -1
            if (r0 == 0) goto L36
            int r0 = r5.r()
            r4.w = r0
            goto L38
        L36:
            r4.w = r1
        L38:
            boolean r0 = r5.n()
            if (r0 == 0) goto L4b
            int r0 = r5.s()
            if (r0 == 0) goto L4b
            int r0 = r5.s()
            r4.x = r0
            goto L4d
        L4b:
            r4.x = r1
        L4d:
            int r0 = r4.w
            r2 = 0
            if (r0 != r1) goto L61
            int r0 = r4.x
            if (r0 != r1) goto L61
            com.beizi.ad.model.f$a r0 = r5.x()
            com.beizi.ad.model.f$a r3 = com.beizi.ad.model.f.a.f7423b
            if (r0 == r3) goto L61
            r4.w = r2
            goto L6d
        L61:
            int r0 = r4.w
            if (r0 == r1) goto L6d
            int r3 = r4.x
            if (r3 == r1) goto L6d
            if (r0 <= r3) goto L6d
            r4.w = r3
        L6d:
            boolean r0 = r5.p()
            r4.z = r0
            boolean r0 = r5.m()
            r4.A = r0
            boolean r0 = r5.k()
            r4.B = r0
            int r0 = r5.v()
            r4.s = r0
            boolean r5 = r5.l()
            r4.D = r5
            r4.y = r1
            com.beizi.ad.internal.h r5 = com.beizi.ad.internal.h.a()
            float r5 = r5.i()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r0
            int r5 = (int) r5
            r4.setInitialScale(r5)
            r4.loadAdAt(r2)
            return
    }

    public boolean loadAdAt(int r13) {
            r12 = this;
            com.beizi.ad.internal.f.c r0 = r12.ad
            r1 = 0
            if (r0 == 0) goto L9
            int r2 = r12.y
            if (r2 != r13) goto Lc
        L9:
            r5 = r12
            goto L140
        Lc:
            java.util.List r0 = r0.b()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            com.beizi.ad.internal.f.c r0 = r12.ad
            java.util.List r0 = r0.b()
            int r0 = r0.size()
            if (r0 > r13) goto L25
        L22:
            r5 = r12
            goto L13d
        L25:
            com.beizi.ad.internal.f.c r0 = r12.ad
            java.util.List r0 = r0.b()
            java.lang.Object r0 = r0.get(r13)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = com.beizi.ad.internal.h.o.a(r2)
            if (r2 == 0) goto L3f
            r12.h()
            return r1
        L3f:
            java.lang.Object r2 = r0.first
            com.beizi.ad.internal.j r3 = com.beizi.ad.internal.j.a
            r4 = 1
            if (r2 != r3) goto L72
            com.beizi.ad.internal.video.AdVideoView r1 = r12.mAdVideoView
            if (r1 != 0) goto L51
            com.beizi.ad.internal.video.AdVideoView r1 = new com.beizi.ad.internal.video.AdVideoView
            r1.<init>(r12)
            r12.mAdVideoView = r1
        L51:
            com.beizi.ad.internal.video.AdVideoView r1 = r12.mAdVideoView
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r1.transferAd(r12, r0)
            r12.C = r4
            java.lang.String r0 = "aHR0cDovL2Fib3V0OmJsYW5r"
            java.lang.String r0 = com.beizi.ad.lance.a.b.b(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L6f
            java.util.Map r1 = com.beizi.ad.lance.a.j.a()
            r12.loadUrl(r0, r1)
        L6f:
            r5 = r12
            goto L13a
        L72:
            com.beizi.ad.internal.f.c r2 = r12.ad
            java.util.HashMap r2 = r2.j()
            r12.a(r2)
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r12.d(r0)
            java.lang.String r0 = r12.e(r0)
            java.lang.String r7 = r12.f(r0)
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            float r0 = r0.g()
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            float r2 = r2.h()
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            float r3 = r3.i()
            int r5 = r12.getCreativeWidth()
            r6 = 1056964608(0x3f000000, float:0.5)
            r8 = -1
            if (r5 != r8) goto Lb5
            int r5 = r12.getCreativeHeight()
            if (r5 != r8) goto Lb5
            r3 = -1
            r5 = -1
            goto Lc7
        Lb5:
            int r5 = r12.getCreativeHeight()
            float r5 = (float) r5
            float r5 = r5 * r3
            float r5 = r5 + r6
            int r5 = (int) r5
            int r9 = r12.getCreativeWidth()
            float r9 = (float) r9
            float r9 = r9 * r3
            float r9 = r9 + r6
            int r3 = (int) r9
        Lc7:
            int r9 = r12.getCreativeLeft()
            r10 = 17
            if (r9 != 0) goto Lfd
            int r9 = r12.getCreativeTop()
            if (r9 != 0) goto Lfd
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r5, r10)
            com.beizi.ad.internal.f.c r2 = r12.ad
            com.beizi.ad.internal.k r2 = r2.a
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.a
            if (r2 != r3) goto Leb
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8, r10)
            r12.setLayoutParams(r0)
            goto L12e
        Leb:
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7002d
            if (r2 != r3) goto Lf9
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r0.<init>(r2, r8, r10)
            r12.a(r0)
            goto L12e
        Lf9:
            r12.a(r0)
            goto L12e
        Lfd:
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r11 = 8388659(0x800033, float:1.1755015E-38)
            r9.<init>(r3, r5, r11)
            int r3 = r12.getCreativeTop()
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 + r6
            int r2 = (int) r3
            int r3 = r12.getCreativeLeft()
            float r3 = (float) r3
            float r3 = r3 * r0
            float r3 = r3 + r6
            int r0 = (int) r3
            r9.setMargins(r0, r2, r1, r1)
            com.beizi.ad.internal.f.c r0 = r12.ad
            com.beizi.ad.internal.k r0 = r0.a
            com.beizi.ad.internal.k r2 = com.beizi.ad.internal.k.a
            if (r0 != r2) goto L12b
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8, r10)
            r12.setLayoutParams(r0)
            goto L12e
        L12b:
            r12.a(r9)
        L12e:
            java.lang.String r9 = "UTF-8"
            r10 = 0
            r6 = 0
            java.lang.String r8 = "text/html"
            r5 = r12
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
            r5.C = r1
        L13a:
            r5.y = r13
            return r4
        L13d:
            r12.h()
        L140:
            return r1
    }

    public boolean loadAdBy(int r2) {
            r1 = this;
            int r0 = r1.y
            int r0 = r0 + r2
            boolean r2 = r1.loadAdAt(r0)
            return r2
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0.f()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
            r0 = this;
            r0.destroy()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.app.ProgressDialog r0 = r1.t
            if (r0 == 0) goto L12
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L12
            android.app.ProgressDialog r0 = r1.t
            r0.dismiss()
        L12:
            return
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.onDraw(r1)
            return
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            r0 = 1
            r9.v = r0
            int r1 = r10.getAction()
            if (r1 == 0) goto L47
            if (r1 == r0) goto L2f
            r0 = 2
            if (r1 == r0) goto L11
        Le:
            r1 = r9
            r2 = r10
            goto L5d
        L11:
            boolean r0 = r9.I
            if (r0 == 0) goto Le
            float r0 = r9.G
            float r1 = r9.H
            float r2 = r10.getX()
            float r3 = r10.getY()
            float r0 = a(r0, r1, r2, r3)
            r1 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 0
            r9.I = r0
            goto Le
        L2f:
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r9.F
            long r0 = r5 - r3
            r7 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto Le
            boolean r0 = r9.I
            if (r0 == 0) goto Le
            r1 = r9
            r2 = r10
            r1.handleClickView(r2, r3, r5)
            goto L5d
        L47:
            r1 = r9
            r2 = r10
            long r3 = java.lang.System.currentTimeMillis()
            r1.F = r3
            float r10 = r2.getX()
            r1.G = r10
            float r10 = r2.getY()
            r1.H = r10
            r1.I = r0
        L5d:
            boolean r10 = super.onTouchEvent(r2)
            return r10
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            int r1 = r0.getWindowVisibility()
            r0.a(r1, r2)
            return
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            int r0 = r1.getVisibility()
            r1.a(r2, r0)
            return
    }

    public void resize(int r12, int r13, int r14, int r15, com.beizi.ad.internal.view.f.a r16, boolean r17) {
            r11 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            r1.<init>(r2)
            com.beizi.ad.internal.view.f r10 = r11.f7140f
            boolean r2 = r10.f7206d
            if (r2 != 0) goto L2f
            int r2 = r1.width
            r11.f7141g = r2
            int r2 = r1.height
            r11.f7142h = r2
        L2f:
            float r13 = (float) r13
            float r0 = r0.density
            float r13 = r13 * r0
            double r2 = (double) r13
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            int r13 = (int) r2
            float r12 = (float) r12
            float r12 = r12 * r0
            double r2 = (double) r12
            double r2 = r2 + r4
            int r4 = (int) r2
            r1.height = r13
            r1.width = r4
            r12 = 17
            r1.gravity = r12
            com.beizi.ad.internal.view.AdViewImpl r3 = r11.adViewImpl
            if (r3 == 0) goto L55
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r3.a(r4, r5, r6, r7, r8, r9, r10)
        L55:
            com.beizi.ad.internal.view.AdViewImpl r12 = r11.adViewImpl
            if (r12 == 0) goto L5c
            r12.f()
        L5c:
            r11.setLayoutParams(r1)
            return
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
            r0 = this;
            r1 = 0
            super.scrollTo(r1, r1)
            return
    }

    public void setCreativeLeft(int r1) {
            r0 = this;
            r0.f7144j = r1
            return
    }

    public void setCreativeTop(int r1) {
            r0 = this;
            r0.f7145k = r1
            return
    }

    public void setMRAIDUseCustomClose(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void setRefreshInterval(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public boolean shouldDisplayButton() {
            r4 = this;
            com.beizi.ad.internal.f.c r0 = r4.ad
            com.beizi.ad.model.f$a r0 = r0.x()
            com.beizi.ad.model.f$a r1 = com.beizi.ad.model.f.a.f7426e
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            com.beizi.ad.internal.f.c r0 = r4.ad
            com.beizi.ad.model.f$a r0 = r0.x()
            com.beizi.ad.model.f$a r1 = com.beizi.ad.model.f.a.f7423b
            r3 = 1
            if (r0 != r1) goto L2d
            com.beizi.ad.internal.f.c r0 = r4.ad
            java.util.List r0 = r0.b()
            int r1 = r4.y
            java.lang.Object r0 = r0.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            com.beizi.ad.internal.j r1 = com.beizi.ad.internal.j.a
            if (r0 != r1) goto L2c
            return r3
        L2c:
            return r2
        L2d:
            int r0 = r4.y
            if (r0 != 0) goto L32
            return r3
        L32:
            return r2
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
            r7 = this;
            r0 = 0
            r7.setVisibility(r0)
            com.beizi.ad.internal.view.AdViewImpl r1 = r7.adViewImpl
            r1.showAdLogo(r7)
            com.beizi.ad.internal.view.AdViewImpl r1 = r7.adViewImpl
            r1.addDownloadTextView(r7)
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.f7002d
            com.beizi.ad.internal.view.AdViewImpl r2 = r7.adViewImpl
            com.beizi.ad.internal.k r2 = r2.getMediaType()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L21
            com.beizi.ad.internal.view.AdViewImpl r2 = r7.adViewImpl
            r2.showBannerCloseBtn(r2)
        L21:
            boolean r2 = r7.shouldDisplayButton()
            if (r2 == 0) goto L51
            com.beizi.ad.internal.view.AdViewImpl r2 = r7.adViewImpl
            if (r2 == 0) goto L51
            com.beizi.ad.internal.k r2 = r2.getMediaType()
            com.beizi.ad.internal.k r3 = com.beizi.ad.internal.k.f7003e
            if (r2 != r3) goto L4c
            com.beizi.ad.internal.view.AdViewImpl r2 = r7.adViewImpl
            int r3 = r7.getShowCloseBtnTime()
            int r4 = r7.getAutoCloseTime()
            com.beizi.ad.internal.f.c r5 = r7.ad
            com.beizi.ad.model.f$a r5 = r5.x()
            com.beizi.ad.model.f$a r6 = com.beizi.ad.model.f.a.f7423b
            if (r5 != r6) goto L48
            r0 = 1
        L48:
            r2.addInterstitialCloseButton(r3, r4, r7, r0)
            goto L51
        L4c:
            com.beizi.ad.internal.view.AdViewImpl r0 = r7.adViewImpl
            r0.isLoadToShow(r7)
        L51:
            com.beizi.ad.internal.view.AdViewImpl r0 = r7.adViewImpl
            if (r0 == 0) goto L71
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto L71
            com.beizi.ad.internal.view.AdViewImpl r0 = r7.adViewImpl
            com.beizi.ad.internal.k r0 = r0.getMediaType()
            if (r0 != r1) goto L71
            android.os.Handler r0 = r7.q
            if (r0 == 0) goto L71
            com.beizi.ad.internal.view.AdWebView$3 r1 = new com.beizi.ad.internal.view.AdWebView$3
            r1.<init>(r7)
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
        L71:
            return
    }
}
