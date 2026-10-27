package com.beizi.ad.internal.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements com.beizi.ad.AdActivity.a {
    public static java.util.LinkedList<android.webkit.WebView> a;

    /* renamed from: b, reason: collision with root package name */
    private android.app.Activity f6605b;

    /* renamed from: c, reason: collision with root package name */
    private android.webkit.WebView f6606c;

    /* renamed from: d, reason: collision with root package name */
    private android.widget.ImageView f6607d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6608e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6609f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f6610g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6611h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6612i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6613j;






    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.beizi.ad.internal.activity.a.a = r0
            return
    }

    public a(android.app.Activity r1, boolean r2, boolean r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f6605b = r1
            r0.f6608e = r2
            r0.f6609f = r3
            r0.f6610g = r4
            r1 = 1
            if (r5 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.f6613j = r1
            return
    }

    static /* synthetic */ void a(com.beizi.ad.internal.activity.a r0) {
            r0.g()
            return
    }

    private void a(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f6613j
            if (r0 == 0) goto L10
            boolean r0 = r2.f6611h
            if (r0 == 0) goto Ld
            boolean r0 = r2.f6612i
            if (r0 != 0) goto Ld
            goto L36
        Ld:
            r0 = 1
            r2.f6611h = r0
        L10:
            boolean r0 = com.beizi.ad.internal.h.o.a(r3)
            if (r0 == 0) goto L18
            r3 = 0
            goto L1c
        L18:
            android.net.Uri r3 = android.net.Uri.parse(r3)
        L1c:
            if (r3 != 0) goto L1f
            goto L36
        L1f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r3)
            android.app.Activity r3 = r2.f6605b     // Catch: java.lang.Exception -> L36
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L36
            r2.c()     // Catch: java.lang.Exception -> L36
            r2.h()     // Catch: java.lang.Exception -> L36
        L36:
            return
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.activity.a r0, java.lang.String r1) {
            boolean r0 = r0.b(r1)
            return r0
    }

    static /* synthetic */ boolean a(com.beizi.ad.internal.activity.a r0, boolean r1) {
            r0.f6612i = r1
            return r1
    }

    static /* synthetic */ android.webkit.WebView b(com.beizi.ad.internal.activity.a r0) {
            android.webkit.WebView r0 = r0.f6606c
            return r0
    }

    static /* synthetic */ void b(com.beizi.ad.internal.activity.a r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    private boolean b(java.lang.String r2) {
            r1 = this;
            boolean r2 = r1.c(r2)
            r0 = 1
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r2 = r1.f6608e
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            return r0
    }

    static /* synthetic */ void c(com.beizi.ad.internal.activity.a r0) {
            r0.h()
            return
    }

    private boolean c(java.lang.String r3) {
            r2 = this;
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            java.util.List r0 = r0.n()
            if (r0 == 0) goto L28
            int r1 = r0.size()
            if (r1 <= 0) goto L28
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L14
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    private void g() {
            r8 = this;
            boolean r0 = r8.f6613j     // Catch: java.lang.Throwable -> L127
            if (r0 != 0) goto L6
            goto L127
        L6:
            boolean r0 = r8.f6611h     // Catch: java.lang.Throwable -> L127
            if (r0 != 0) goto L127
            java.lang.String r0 = r8.f6610g     // Catch: java.lang.Throwable -> L127
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L127
            if (r0 == 0) goto L14
            goto L127
        L14:
            r0 = 1
            r8.f6611h = r0     // Catch: java.lang.Throwable -> L127
            java.lang.String r1 = r8.f6610g     // Catch: java.lang.Throwable -> L127
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L127
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> L127
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 == 0) goto Le1
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "bzopen"
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L127
            if (r2 == 0) goto Le1
            java.lang.String r2 = r1.getHost()     // Catch: java.lang.Throwable -> L127
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L127
            if (r2 != 0) goto Le1
            java.util.List r2 = r1.getPathSegments()     // Catch: java.lang.Throwable -> L127
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L127
            if (r2 <= 0) goto Le1
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L127
            r2.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "android.intent.action.MAIN"
            r2.setAction(r4)     // Catch: java.lang.Throwable -> L127
            r2.setFlags(r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = "android.intent.category.LAUNCHER"
            r2.addCategory(r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = "flags"
            java.lang.String r3 = r1.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L127
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L127
            r5 = 2
            if (r4 != 0) goto L8a
            java.lang.String r4 = "0x"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            if (r4 != 0) goto L7d
            java.lang.String r4 = "0X"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            if (r4 == 0) goto L75
            goto L7d
        L75:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            r2.setFlags(r3)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            goto L8a
        L7d:
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
            r2.setFlags(r3)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L127
        L8a:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = r1.getHost()     // Catch: java.lang.Throwable -> L127
            java.util.List r6 = r1.getPathSegments()     // Catch: java.lang.Throwable -> L127
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L127
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L127
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L127
            r2.setComponent(r3)     // Catch: java.lang.Throwable -> L127
            java.lang.String r3 = "rect"
            java.lang.String r1 = r1.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L127
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L127
            if (r3 != 0) goto Ldb
            java.lang.String r3 = ":"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            int r3 = r1.length     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r4 = 4
            if (r3 != r4) goto Ldb
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r3.<init>()     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r4 = r1[r7]     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r0 = r1[r0]     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r5 = r1[r5]     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r6 = 3
            r1 = r1[r6]     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r3.set(r4, r0, r5, r1)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
            r2.setSourceBounds(r3)     // Catch: java.lang.Exception -> Ldb java.lang.Throwable -> L127
        Ldb:
            android.app.Activity r0 = r8.f6605b     // Catch: java.lang.Throwable -> L127
            r0.startActivity(r2)     // Catch: java.lang.Throwable -> L127
            goto L127
        Le1:
            java.lang.String r2 = r8.f6610g     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "hwpps://landingpage"
            boolean r2 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L127
            if (r2 == 0) goto Lfc
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L127
            r0.<init>()     // Catch: java.lang.Throwable -> L127
            r0.setData(r1)     // Catch: java.lang.Throwable -> L127
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L127
            android.app.Activity r1 = r8.f6605b     // Catch: java.lang.Throwable -> L127
            r1.startActivity(r0)     // Catch: java.lang.Throwable -> L127
            goto L127
        Lfc:
            java.lang.String r2 = r8.f6610g     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "intent"
            boolean r2 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L127
            if (r2 == 0) goto L115
            java.lang.String r1 = r8.f6610g     // Catch: java.lang.Throwable -> L127
            android.content.Intent r0 = android.content.Intent.parseUri(r1, r0)     // Catch: java.lang.Throwable -> L127
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L127
            android.app.Activity r1 = r8.f6605b     // Catch: java.lang.Throwable -> L127
            r1.startActivity(r0)     // Catch: java.lang.Throwable -> L127
            goto L127
        L115:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L127
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L127
            r1 = 805339136(0x30008000, float:4.674803E-10)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L127
            android.app.Activity r1 = r8.f6605b     // Catch: java.lang.Throwable -> L127
            r1.startActivity(r0)     // Catch: java.lang.Throwable -> L127
        L127:
            return
    }

    private void h() {
            r1 = this;
            android.app.Activity r0 = r1.f6605b
            if (r0 == 0) goto L7
            r0.finish()
        L7:
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "NewApi"})
    @android.annotation.TargetApi(17)
    public void a() {
            r5 = this;
            android.app.Activity r0 = r5.f6605b
            int r1 = com.beizi.fusion.R.style.BeiZiTheme
            r0.setTheme(r1)
            android.app.Activity r0 = r5.f6605b
            int r1 = com.beizi.fusion.R.layout.activity_in_app_browser
            r0.setContentView(r1)
            java.util.LinkedList<android.webkit.WebView> r0 = com.beizi.ad.internal.activity.a.a
            java.lang.Object r0 = r0.poll()
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r5.f6606c = r0
            if (r0 == 0) goto L114
            android.webkit.WebSettings r0 = r0.getSettings()
            if (r0 != 0) goto L22
            goto L114
        L22:
            android.webkit.WebView r0 = r5.f6606c
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L39
            android.webkit.WebView r0 = r5.f6606c
            android.content.Context r0 = r0.getContext()
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0
            android.app.Activity r1 = r5.f6605b
            r0.setBaseContext(r1)
        L39:
            android.app.Activity r0 = r5.f6605b
            int r1 = com.beizi.fusion.R.id.web_view
            android.view.View r0 = r0.findViewById(r1)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            android.webkit.WebSettings r1 = r0.getSettings()
            r2 = 0
            r1.setSavePassword(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeView(r0)
            android.webkit.WebView r0 = r5.f6606c
            com.beizi.ad.internal.h.u.a(r0)
            android.webkit.WebView r0 = r5.f6606c
            r0.setLayoutParams(r1)
            android.webkit.WebView r0 = r5.f6606c
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setUseWideViewPort(r1)
            android.webkit.WebView r0 = r5.f6606c
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setLoadWithOverviewMode(r1)
            android.webkit.WebView r0 = r5.f6606c
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setJavaScriptEnabled(r1)
            android.webkit.WebView r0 = r5.f6606c
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setGeolocationEnabled(r2)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
            android.webkit.WebView r0 = r5.f6606c
            r3.addView(r0, r4)
            android.app.Activity r0 = r5.f6605b
            int r1 = com.beizi.fusion.R.id.progress_bar
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            android.app.Activity r1 = r5.f6605b     // Catch: java.lang.Exception -> Ldf
            android.content.Intent r1 = r1.getIntent()     // Catch: java.lang.Exception -> Ldf
            java.lang.String r2 = "bridgeid"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto Ld1
            java.util.ArrayList<android.util.Pair<java.lang.String, com.beizi.ad.internal.view.AdViewImpl$c>> r2 = com.beizi.ad.internal.view.AdViewImpl.c.a     // Catch: java.lang.Exception -> Ldf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Ldf
        Lb1:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Ldf
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Ldf
            android.util.Pair r3 = (android.util.Pair) r3     // Catch: java.lang.Exception -> Ldf
            java.lang.Object r4 = r3.first     // Catch: java.lang.Exception -> Ldf
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Ldf
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Exception -> Ldf
            if (r4 == 0) goto Lb1
            java.lang.Object r4 = r3.second     // Catch: java.lang.Exception -> Ldf
            com.beizi.ad.internal.view.AdViewImpl$c r4 = (com.beizi.ad.internal.view.AdViewImpl.c) r4     // Catch: java.lang.Exception -> Ldf
            java.util.ArrayList<android.util.Pair<java.lang.String, com.beizi.ad.internal.view.AdViewImpl$c>> r4 = com.beizi.ad.internal.view.AdViewImpl.c.a     // Catch: java.lang.Exception -> Ldf
            r4.remove(r3)     // Catch: java.lang.Exception -> Ldf
            goto Lb1
        Ld1:
            boolean r1 = r5.f6613j     // Catch: java.lang.Exception -> Ldf
            if (r1 == 0) goto Ldf
            android.webkit.WebView r1 = r5.f6606c     // Catch: java.lang.Exception -> Ldf
            com.beizi.ad.internal.activity.a$1 r2 = new com.beizi.ad.internal.activity.a$1     // Catch: java.lang.Exception -> Ldf
            r2.<init>(r5)     // Catch: java.lang.Exception -> Ldf
            r1.setOnTouchListener(r2)     // Catch: java.lang.Exception -> Ldf
        Ldf:
            android.webkit.WebView r1 = r5.f6606c
            com.beizi.ad.internal.activity.a$2 r2 = new com.beizi.ad.internal.activity.a$2
            r2.<init>(r5)
            r1.setDownloadListener(r2)
            android.webkit.WebView r1 = r5.f6606c
            com.beizi.ad.internal.activity.a$3 r2 = new com.beizi.ad.internal.activity.a$3
            r2.<init>(r5)
            r1.setWebViewClient(r2)
            android.webkit.WebView r1 = r5.f6606c
            com.beizi.ad.internal.activity.a$4 r2 = new com.beizi.ad.internal.activity.a$4
            android.app.Activity r3 = r5.f6605b
            r2.<init>(r5, r3, r0)
            r1.setWebChromeClient(r2)
            android.app.Activity r0 = r5.f6605b
            int r1 = com.beizi.fusion.R.id.close_iv
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f6607d = r0
            com.beizi.ad.internal.activity.a$5 r1 = new com.beizi.ad.internal.activity.a$5
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            return
        L114:
            r5.h()
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void b() {
            r2 = this;
            java.lang.String r0 = "...........................backPressed..........................."
            java.lang.String r1 = "lance"
            com.beizi.ad.lance.a.m.a(r1, r0)
            android.webkit.WebView r0 = r2.f6606c
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L1a
            android.webkit.WebView r0 = r2.f6606c
            r0.goBack()
            java.lang.String r0 = " mWebView.goBack()"
            com.beizi.ad.lance.a.m.a(r1, r0)
            return
        L1a:
            r2.h()
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void c() {
            r1 = this;
            android.webkit.WebView r0 = r1.f6606c
            if (r0 != 0) goto L5
            return
        L5:
            com.beizi.ad.internal.h.u.a(r0)
            android.webkit.WebView r0 = r1.f6606c
            r0.destroy()
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void d() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public void e() {
            r0 = this;
            return
    }

    @Override // com.beizi.ad.AdActivity.a
    public android.webkit.WebView f() {
            r1 = this;
            android.webkit.WebView r0 = r1.f6606c
            return r0
    }
}
