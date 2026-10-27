package cn.bluemobi.dylan.smartwebview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SmartWebView extends android.widget.RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    private static android.widget.ProgressBar f193f;

    /* renamed from: g, reason: collision with root package name */
    private static android.widget.RelativeLayout f194g;

    /* renamed from: h, reason: collision with root package name */
    private static int f195h;

    /* renamed from: i, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    public static final cn.bluemobi.dylan.smartwebview.SmartWebView.d f196i = null;
    private android.webkit.WebView a;

    /* renamed from: b, reason: collision with root package name */
    private int f197b;

    /* renamed from: c, reason: collision with root package name */
    private int f198c;

    /* renamed from: d, reason: collision with root package name */
    private cn.bluemobi.dylan.smartwebview.SmartWebView.c f199d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.View f200e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ProgressStyle extends java.lang.Enum<cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle> {
        private static final /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle[] $VALUES = null;
        public static final cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle Circle = null;
        public static final cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle Horizontal = null;

        static {
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle
                java.lang.String r1 = "Horizontal"
                r2 = 0
                r0.<init>(r1, r2)
                cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Horizontal = r0
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r1 = new cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle
                java.lang.String r3 = "Circle"
                r4 = 1
                r1.<init>(r3, r4)
                cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Circle = r1
                r3 = 2
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle[] r3 = new cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle[r3]
                r3[r2] = r0
                r3[r4] = r1
                cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.$VALUES = r3
                return
        }

        ProgressStyle(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle valueOf(java.lang.String r1) {
                java.lang.Class<cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle> r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle) r1
                return r1
        }

        public static cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle[] values() {
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle[] r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle[] r0 = (cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a implements android.view.View.OnClickListener {
        final /* synthetic */ cn.bluemobi.dylan.smartwebview.SmartWebView a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.webkit.WebSettings f201b;

        a(cn.bluemobi.dylan.smartwebview.SmartWebView r1, android.webkit.WebSettings r2) {
                r0 = this;
                r0.a = r1
                r0.f201b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r1) {
                r0 = this;
                cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r0.a
                r1.l()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends android.webkit.WebChromeClient {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a implements java.lang.Runnable {
            public static final cn.bluemobi.dylan.smartwebview.SmartWebView.b.a a = null;

            static {
                    cn.bluemobi.dylan.smartwebview.SmartWebView$b$a r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$b$a
                    r0.<init>()
                    cn.bluemobi.dylan.smartwebview.SmartWebView.b.a.a = r0
                    return
            }

            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    android.widget.ProgressBar r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                    if (r0 == 0) goto Lb
                    r1 = 8
                    r0.setVisibility(r1)
                Lb:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: cn.bluemobi.dylan.smartwebview.SmartWebView$b$b, reason: collision with other inner class name */
        static final class RunnableC0004b implements java.lang.Runnable {
            public static final cn.bluemobi.dylan.smartwebview.SmartWebView.b.RunnableC0004b a = null;

            static {
                    cn.bluemobi.dylan.smartwebview.SmartWebView$b$b r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$b$b
                    r0.<init>()
                    cn.bluemobi.dylan.smartwebview.SmartWebView.b.RunnableC0004b.a = r0
                    return
            }

            RunnableC0004b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    android.widget.RelativeLayout r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.c()
                    if (r0 == 0) goto Lb
                    r1 = 8
                    r0.setVisibility(r1)
                Lb:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class c implements java.lang.Runnable {
            public static final cn.bluemobi.dylan.smartwebview.SmartWebView.b.c a = null;

            static {
                    cn.bluemobi.dylan.smartwebview.SmartWebView$b$c r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$b$c
                    r0.<init>()
                    cn.bluemobi.dylan.smartwebview.SmartWebView.b.c.a = r0
                    return
            }

            c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    android.widget.RelativeLayout r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.c()
                    if (r0 == 0) goto La
                    r1 = 0
                    r0.setVisibility(r1)
                La:
                    return
            }
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull android.webkit.GeolocationPermissions.Callback r4) {
                r2 = this;
                java.lang.String r0 = "origin"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r4, r0)
                super.onGeolocationPermissionsShowPrompt(r3, r4)
                r0 = 1
                r1 = 0
                r4.invoke(r3, r0, r1)
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@org.jetbrains.annotations.NotNull android.webkit.WebView r4, int r5) {
                r3 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.g0.p(r4, r0)
                super.onProgressChanged(r4, r5)
                r4 = 100
                r0 = 10
                if (r5 != r4) goto L26
                android.widget.ProgressBar r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                if (r4 == 0) goto L1a
                cn.bluemobi.dylan.smartwebview.SmartWebView$b$a r5 = cn.bluemobi.dylan.smartwebview.SmartWebView.b.a.a
                r4.postDelayed(r5, r0)
            L1a:
                android.widget.RelativeLayout r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.c()
                if (r4 == 0) goto L5d
                cn.bluemobi.dylan.smartwebview.SmartWebView$b$b r5 = cn.bluemobi.dylan.smartwebview.SmartWebView.b.RunnableC0004b.a
                r4.postDelayed(r5, r0)
                return
            L26:
                int r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.a()
                cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r2 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Horizontal
                int r2 = r2.ordinal()
                if (r4 != r2) goto L52
                android.widget.ProgressBar r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                if (r4 == 0) goto L5d
                r4.setProgress(r5)
                int r5 = r4.getVisibility()
                r0 = 8
                if (r5 != r0) goto L44
                goto L45
            L44:
                r4 = 0
            L45:
                if (r4 == 0) goto L5d
                android.widget.ProgressBar r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                if (r4 == 0) goto L5d
                r5 = 0
                r4.setVisibility(r5)
                return
            L52:
                android.widget.RelativeLayout r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.c()
                if (r4 == 0) goto L5d
                cn.bluemobi.dylan.smartwebview.SmartWebView$b$c r5 = cn.bluemobi.dylan.smartwebview.SmartWebView.b.c.a
                r4.postDelayed(r5, r0)
            L5d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.webkit.WebViewClient {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private android.view.View f202b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static final class a implements java.lang.Runnable {
            public static final cn.bluemobi.dylan.smartwebview.SmartWebView.c.a a = null;

            static {
                    cn.bluemobi.dylan.smartwebview.SmartWebView$c$a r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$c$a
                    r0.<init>()
                    cn.bluemobi.dylan.smartwebview.SmartWebView.c.a.a = r0
                    return
            }

            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    android.widget.ProgressBar r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                    if (r0 == 0) goto Lb
                    r1 = 8
                    r0.setVisibility(r1)
                Lb:
                    return
            }
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        private final void b(android.webkit.WebView r3) {
                r2 = this;
                r0 = 1
                r2.a = r0
                if (r3 == 0) goto Lb
                java.lang.String r0 = "javascript:document.open();document.write('');document.close();"
                r1 = 0
                r3.evaluateJavascript(r0, r1)
            Lb:
                android.view.View r0 = r2.f202b
                if (r0 == 0) goto L1c
                if (r0 == 0) goto L15
                r1 = 0
                r0.setVisibility(r1)
            L15:
                if (r3 == 0) goto L1c
                r0 = 8
                r3.setVisibility(r0)
            L1c:
                return
        }

        private final void c(android.webkit.WebView r3) {
                r2 = this;
                android.view.View r0 = r2.f202b
                if (r0 == 0) goto L11
                if (r0 == 0) goto Lb
                r1 = 8
                r0.setVisibility(r1)
            Lb:
                if (r3 == 0) goto L11
                r0 = 0
                r3.setVisibility(r0)
            L11:
                return
        }

        public final void a(@org.jetbrains.annotations.NotNull android.view.View r2) {
                r1 = this;
                java.lang.String r0 = "errorView"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.f202b = r2
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@org.jetbrains.annotations.Nullable android.webkit.WebView r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
                r3 = this;
                super.onPageFinished(r4, r5)
                android.widget.ProgressBar r5 = cn.bluemobi.dylan.smartwebview.SmartWebView.b()
                if (r5 == 0) goto L10
                cn.bluemobi.dylan.smartwebview.SmartWebView$c$a r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.c.a.a
                r1 = 10
                r5.postDelayed(r0, r1)
            L10:
                boolean r5 = r3.a
                if (r5 == 0) goto L18
                r3.b(r4)
                goto L1b
            L18:
                r3.c(r4)
            L1b:
                r4 = 0
                r3.a = r4
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(21)
        public void onReceivedError(@org.jetbrains.annotations.Nullable android.webkit.WebView r2, @org.jetbrains.annotations.NotNull android.webkit.WebResourceRequest r3, @org.jetbrains.annotations.Nullable android.webkit.WebResourceError r4) {
                r1 = this;
                java.lang.String r0 = "webResourceRequest"
                kotlin.jvm.internal.g0.p(r3, r0)
                super.onReceivedError(r2, r3, r4)
                boolean r3 = r3.isForMainFrame()
                if (r3 == 0) goto L12
                r1.b(r2)
            L12:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@org.jetbrains.annotations.Nullable android.webkit.WebView r1, @org.jetbrains.annotations.Nullable android.webkit.SslErrorHandler r2, @org.jetbrains.annotations.Nullable android.net.http.SslError r3) {
                r0 = this;
                if (r2 == 0) goto L5
                r2.proceed()
            L5:
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull android.webkit.WebView r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
                r4 = this;
                java.lang.String r0 = "webView"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "url"
                kotlin.jvm.internal.g0.p(r6, r0)
                r5.loadUrl(r6)
                java.lang.String r5 = "http://"
                r0 = 0
                r1 = 2
                r2 = 0
                boolean r5 = kotlin.text.u.H2(r6, r5, r0, r1, r2)
                r3 = 1
                if (r5 != 0) goto L3a
                java.lang.String r5 = "https://"
                boolean r5 = kotlin.text.u.H2(r6, r5, r0, r1, r2)
                if (r5 == 0) goto L23
                goto L3a
            L23:
                android.net.Uri r5 = android.net.Uri.parse(r6)
                java.lang.String r6 = "Uri.parse(url)"
                kotlin.jvm.internal.g0.o(r5, r6)
                java.lang.String r5 = r5.getScheme()
                java.lang.String r6 = "bilibili"
                boolean r5 = kotlin.text.u.a2(r6, r5, r3)
                if (r5 == 0) goto L39
                return r3
            L39:
                return r0
            L3a:
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d {
        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ d(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            cn.bluemobi.dylan.smartwebview.SmartWebView$d r0 = new cn.bluemobi.dylan.smartwebview.SmartWebView$d
            r1 = 0
            r0.<init>(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView.f196i = r0
            cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Horizontal
            int r0 = r0.ordinal()
            cn.bluemobi.dylan.smartwebview.SmartWebView.f195h = r0
            return
    }

    public SmartWebView(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            r2 = 8
            r1.f197b = r2
            r1.f198c = r2
            r1.g()
            return
    }

    public SmartWebView(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.util.AttributeSet r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            r0 = 8
            r1.f197b = r0
            r1.f198c = r0
            int[] r0 = cn.bluemobi.dylan.smartwebview.R.styleable.WebViewWithProgress
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = cn.bluemobi.dylan.smartwebview.R.styleable.WebViewWithProgress_progressStyle
            cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Horizontal
            int r0 = r0.ordinal()
            int r3 = r2.getInt(r3, r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView.f195h = r3
            int r3 = cn.bluemobi.dylan.smartwebview.R.styleable.WebViewWithProgress_barHeight
            int r0 = r1.f197b
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.f198c = r3
            r2.recycle()
            r1.g()
            return
    }

    public static final /* synthetic */ int a() {
            int r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.f195h
            return r0
    }

    public static final /* synthetic */ android.widget.ProgressBar b() {
            android.widget.ProgressBar r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.f193f
            return r0
    }

    public static final /* synthetic */ android.widget.RelativeLayout c() {
            android.widget.RelativeLayout r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.f194g
            return r0
    }

    public static final /* synthetic */ void d(int r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView.f195h = r0
            return
    }

    public static final /* synthetic */ void e(android.widget.ProgressBar r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView.f193f = r0
            return
    }

    public static final /* synthetic */ void f(android.widget.RelativeLayout r0) {
            cn.bluemobi.dylan.smartwebview.SmartWebView.f194g = r0
            return
    }

    private final void g() {
            r6 = this;
            android.webkit.WebView r0 = new android.webkit.WebView
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1)
            r6.a = r0
            r0 = 0
            r6.setVerticalScrollBarEnabled(r0)
            r6.setHorizontalScrollBarEnabled(r0)
            android.webkit.WebView r1 = r6.a
            java.lang.String r2 = "mWebView"
            if (r1 != 0) goto L1b
            kotlin.jvm.internal.g0.S(r2)
        L1b:
            r6.setScale(r1)
            android.webkit.WebView r1 = r6.a
            if (r1 != 0) goto L25
            kotlin.jvm.internal.g0.S(r2)
        L25:
            r3 = 3
            r1.setInitialScale(r3)
            android.webkit.WebView r1 = r6.a
            if (r1 != 0) goto L30
            kotlin.jvm.internal.g0.S(r2)
        L30:
            r3 = -1
            r6.addView(r1, r3, r3)
            int r1 = cn.bluemobi.dylan.smartwebview.SmartWebView.f195h
            cn.bluemobi.dylan.smartwebview.SmartWebView$ProgressStyle r4 = cn.bluemobi.dylan.smartwebview.SmartWebView.ProgressStyle.Horizontal
            int r4 = r4.ordinal()
            r5 = 0
            if (r1 != r4) goto L6f
            android.content.Context r1 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r4 = cn.bluemobi.dylan.smartwebview.R.layout.ac_progress_horizontal
            android.view.View r1 = r1.inflate(r4, r5)
            if (r1 == 0) goto L67
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            cn.bluemobi.dylan.smartwebview.SmartWebView.f193f = r1
            r4 = 100
            r1.setMax(r4)
            android.widget.ProgressBar r1 = cn.bluemobi.dylan.smartwebview.SmartWebView.f193f
            if (r1 == 0) goto L5f
            r1.setProgress(r0)
        L5f:
            android.widget.ProgressBar r1 = cn.bluemobi.dylan.smartwebview.SmartWebView.f193f
            int r4 = r6.f198c
            r6.addView(r1, r3, r4)
            goto L86
        L67:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.ProgressBar"
            r0.<init>(r1)
            throw r0
        L6f:
            android.content.Context r1 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r4 = cn.bluemobi.dylan.smartwebview.R.layout.ac_progress_circle
            android.view.View r1 = r1.inflate(r4, r5)
            if (r1 == 0) goto L13a
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            cn.bluemobi.dylan.smartwebview.SmartWebView.f194g = r1
            r6.addView(r1, r3, r3)
        L86:
            cn.bluemobi.dylan.smartwebview.SmartWebView$c r1 = new cn.bluemobi.dylan.smartwebview.SmartWebView$c
            r1.<init>()
            r6.f199d = r1
            android.webkit.WebView r1 = r6.a
            if (r1 != 0) goto L94
            kotlin.jvm.internal.g0.S(r2)
        L94:
            cn.bluemobi.dylan.smartwebview.SmartWebView$c r3 = r6.f199d
            r1.setWebViewClient(r3)
            android.webkit.WebView r1 = r6.a
            if (r1 != 0) goto La0
            kotlin.jvm.internal.g0.S(r2)
        La0:
            cn.bluemobi.dylan.smartwebview.SmartWebView$b r3 = new cn.bluemobi.dylan.smartwebview.SmartWebView$b
            r3.<init>()
            r1.setWebChromeClient(r3)
            android.webkit.WebView r1 = r6.a
            if (r1 != 0) goto Laf
            kotlin.jvm.internal.g0.S(r2)
        Laf:
            android.webkit.WebSettings r1 = r1.getSettings()
            r2 = 1
            r1.setLoadsImagesAutomatically(r2)
            r3 = 2
            r1.setMixedContentMode(r3)
            android.webkit.WebSettings$LayoutAlgorithm r4 = android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS
            r1.setLayoutAlgorithm(r4)
            r1.setUseWideViewPort(r2)
            r1.setJavaScriptEnabled(r2)
            android.webkit.WebSettings$PluginState r4 = android.webkit.WebSettings.PluginState.ON
            r1.setPluginState(r4)
            r1.setDomStorageEnabled(r2)
            r1.setLoadWithOverviewMode(r2)
            r1.setSavePassword(r0)
            r1.setBlockNetworkImage(r0)
            java.lang.String r4 = "UTF-8"
            r1.setDefaultTextEncodingName(r4)
            r1.setAllowFileAccess(r0)
            r1.setCacheMode(r3)
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r1.setLayoutAlgorithm(r3)
            r1.setDatabaseEnabled(r2)
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "database"
            java.io.File r3 = r3.getDir(r4, r0)
            java.lang.String r3 = r3.getPath()
            r1.setGeolocationEnabled(r2)
            r1.setJavaScriptCanOpenWindowsAutomatically(r2)
            r1.setGeolocationDatabasePath(r3)
            r1.setBuiltInZoomControls(r0)
            java.lang.String r2 = "webSettings"
            kotlin.jvm.internal.g0.o(r1, r2)
            r1.setAllowUniversalAccessFromFileURLs(r0)
            r1.setAllowFileAccessFromFileURLs(r0)
            r1.setSupportZoom(r0)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = cn.bluemobi.dylan.smartwebview.R.layout.default_error_page
            android.view.View r0 = r0.inflate(r2, r5)
            int r2 = cn.bluemobi.dylan.smartwebview.R.id.bt_error_retry
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            cn.bluemobi.dylan.smartwebview.SmartWebView$a r3 = new cn.bluemobi.dylan.smartwebview.SmartWebView$a
            r3.<init>(r6, r1)
            r2.setOnClickListener(r3)
            java.lang.String r1 = "errorPageView"
            kotlin.jvm.internal.g0.o(r0, r1)
            r6.setErrorPage(r0)
            return
        L13a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            r0.<init>(r1)
            throw r0
    }

    private final void k(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "mWebView"
            if (r0 != 0) goto L13
            android.webkit.WebView r10 = r8.a
            if (r10 != 0) goto Lf
            kotlin.jvm.internal.g0.S(r1)
        Lf:
            r10.loadUrl(r9)
            return
        L13:
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L2b
            android.webkit.WebView r2 = r8.a
            if (r2 != 0) goto L20
            kotlin.jvm.internal.g0.S(r1)
        L20:
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "UTF-8"
            r7 = r11
            r4 = r10
            r3 = r11
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)
            return
        L2b:
            r4 = r10
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L40
            android.webkit.WebView r9 = r8.a
            if (r9 != 0) goto L39
            kotlin.jvm.internal.g0.S(r1)
        L39:
            java.lang.String r10 = "text/html"
            java.lang.String r11 = "UTF-8"
            r9.loadData(r4, r10, r11)
        L40:
            return
    }

    private final void setScale(android.webkit.WebView r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            if (r0 == 0) goto L4b
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            java.lang.String r1 = "wm.defaultDisplay"
            kotlin.jvm.internal.g0.o(r0, r1)
            int r0 = r0.getWidth()
            r1 = 650(0x28a, float:9.11E-43)
            if (r0 <= r1) goto L27
            r0 = 190(0xbe, float:2.66E-43)
            r3.setInitialScale(r0)
            return
        L27:
            r1 = 520(0x208, float:7.29E-43)
            if (r0 <= r1) goto L31
            r0 = 160(0xa0, float:2.24E-43)
            r3.setInitialScale(r0)
            return
        L31:
            r1 = 450(0x1c2, float:6.3E-43)
            if (r0 <= r1) goto L3b
            r0 = 140(0x8c, float:1.96E-43)
            r3.setInitialScale(r0)
            return
        L3b:
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L45
            r0 = 120(0x78, float:1.68E-43)
            r3.setInitialScale(r0)
            return
        L45:
            r0 = 100
            r3.setInitialScale(r0)
            return
        L4b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
            r3.<init>(r0)
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public final android.widget.ProgressBar getProgressBar() {
            r1 = this;
            android.widget.ProgressBar r0 = cn.bluemobi.dylan.smartwebview.SmartWebView.f193f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final android.webkit.WebView getWebView() {
            r2 = this;
            android.webkit.WebView r0 = r2.a
            if (r0 != 0) goto L9
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.g0.S(r1)
        L9:
            return r0
    }

    public final void h(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.k(r0, r2, r0)
            return
    }

    public final void i(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "baseUrl"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.k(r0, r2, r3)
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.k(r2, r0, r0)
            return
    }

    public final void l() {
            r2 = this;
            android.webkit.WebView r0 = r2.a
            if (r0 != 0) goto L9
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.g0.S(r1)
        L9:
            r0.reload()
            return
    }

    public final void m() {
            r3 = this;
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L9
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.g0.S(r1)
        L9:
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setAppCacheEnabled(r1)
            java.lang.String r2 = "settings"
            kotlin.jvm.internal.g0.o(r0, r2)
            r0.setDatabaseEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r1 = -1
            r0.setCacheMode(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            r0 = 0
            cn.bluemobi.dylan.smartwebview.SmartWebView.f193f = r0
            android.webkit.WebView r0 = r3.a
            java.lang.String r1 = "mWebView"
            if (r0 != 0) goto Lc
            kotlin.jvm.internal.g0.S(r1)
        Lc:
            r3.removeView(r0)
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L16
            kotlin.jvm.internal.g0.S(r1)
        L16:
            r0.stopLoading()
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L20
            kotlin.jvm.internal.g0.S(r1)
        L20:
            android.webkit.WebSettings r0 = r0.getSettings()
            java.lang.String r2 = "mWebView.settings"
            kotlin.jvm.internal.g0.o(r0, r2)
            r2 = 0
            r0.setJavaScriptEnabled(r2)
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L34
            kotlin.jvm.internal.g0.S(r1)
        L34:
            r0.clearHistory()
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L3e
            kotlin.jvm.internal.g0.S(r1)
        L3e:
            r0.removeAllViews()
            android.webkit.WebView r0 = r3.a
            if (r0 != 0) goto L48
            kotlin.jvm.internal.g0.S(r1)
        L48:
            r0.destroy()
            super.onDetachedFromWindow()
            return
    }

    public final void setErrorPage(@org.jetbrains.annotations.NotNull android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "errorView"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.f200e = r2
            r0 = 8
            r2.setVisibility(r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L26
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
            goto L26
        L1e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            r2.<init>(r0)
            throw r2
        L26:
            r0 = -1
            r1.addView(r2, r0, r0)
            cn.bluemobi.dylan.smartwebview.SmartWebView$c r0 = r1.f199d
            if (r0 == 0) goto L31
            r0.a(r2)
        L31:
            return
    }

    public final void setWebChromeClient(@org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView.b r3) {
            r2 = this;
            java.lang.String r0 = "webChromeClient"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.webkit.WebView r0 = r2.a
            if (r0 != 0) goto Lf
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.g0.S(r1)
        Lf:
            r0.setWebChromeClient(r3)
            return
    }

    public final void setWebViewClient(@org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView.c r3) {
            r2 = this;
            java.lang.String r0 = "webViewClient"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.f199d = r3
            android.webkit.WebView r0 = r2.a
            if (r0 != 0) goto L11
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.g0.S(r1)
        L11:
            r0.setWebViewClient(r3)
            android.view.View r3 = r2.f200e
            if (r3 == 0) goto L1b
            r2.setErrorPage(r3)
        L1b:
            return
    }
}
