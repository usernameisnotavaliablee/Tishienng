package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jpush.android.local.ProxyActivityAction {
    public static cn.jpush.android.webview.bridge.d a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1949b;

    /* renamed from: c, reason: collision with root package name */
    private android.webkit.WebView f1950c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jpush.android.d.d f1951d;

    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1951d = r0
            return
    }

    private cn.jpush.android.d.d a(android.app.Activity r3, android.content.Intent r4) {
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.Intent r1 = r3.getIntent()
            cn.jpush.android.d.d r0 = cn.jpush.android.x.b.b(r0, r1)
            if (r0 == 0) goto L13
            return r0
        L13:
            java.lang.String r0 = "PopWinActivityImpl"
            java.lang.String r1 = "parse entity form plugin plateform"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            android.net.Uri r0 = r4.getData()
            if (r0 == 0) goto L29
            android.net.Uri r0 = r4.getData()
            java.lang.String r0 = r0.toString()
            goto L2a
        L29:
            r0 = 0
        L2a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L40
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L40
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r0 = "JMessageExtra"
            java.lang.String r0 = r4.getString(r0)
        L40:
            java.lang.String r4 = ""
            cn.jpush.android.d.d r3 = cn.jpush.android.ac.d.a(r3, r0, r4)
            return r3
    }

    private void a() {
            r5 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            cn.jpush.android.webview.bridge.d r2 = cn.jpush.android.ui.b.a
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "JPushWeb"
            r1[r2] = r4
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r0[r3] = r4
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            android.webkit.WebView r2 = r5.f1950c     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "addJavascriptInterface"
            cn.jpush.android.ad.k.a(r2, r3, r0, r1)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addJavascriptInterface failed:"
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "PopWinActivityImpl"
            cn.jpush.android.helper.Logger.e(r1, r0)
            return
    }

    private void a(android.app.Activity r5) {
            r4 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "PopWinActivityImpl"
            if (r0 == 0) goto L52
            android.content.Intent r0 = r5.getIntent()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = cn.jpush.android.x.b.a(r5, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L13
            return
        L13:
            android.content.Intent r0 = r5.getIntent()     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.d.d r0 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L2f
            r4.f1951d = r0     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.f1757d     // Catch: java.lang.Throwable -> L2f
            r4.f1949b = r0     // Catch: java.lang.Throwable -> L2f
            r4.b(r5)     // Catch: java.lang.Throwable -> L2f
            r4.c(r5)     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.d.d r0 = r4.f1951d     // Catch: java.lang.Throwable -> L2f
            cn.jpush.android.k.a.a(r5, r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            goto L3a
        L31:
            java.lang.String r0 = "Warning，null message entity! Close PopWinActivity!"
            cn.jpush.android.helper.Logger.ww(r1, r0)     // Catch: java.lang.Throwable -> L2f
            r5.finish()     // Catch: java.lang.Throwable -> L2f
            return
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Extra data is not serializable!"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.ee(r1, r0)
        L4e:
            r5.finish()
            return
        L52:
            java.lang.String r0 = "PopWinActivity get NULL intent!"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            goto L4e
    }

    private void b(android.app.Activity r6) {
            r5 = this;
            android.content.res.Resources r0 = r6.getResources()
            java.lang.String r1 = "layout"
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = "jpush_popwin_layout"
            int r0 = r0.getIdentifier(r3, r1, r2)
            java.lang.String r1 = "PopWinActivityImpl"
            if (r0 != 0) goto L1d
            java.lang.String r0 = "Please add layout resource jpush_popwin_layout.xml to res/layout !"
            cn.jpush.android.helper.Logger.ee(r1, r0)
            r6.finish()
            return
        L1d:
            r6.setContentView(r0)
            android.content.res.Resources r0 = r6.getResources()
            java.lang.String r2 = "id"
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r4 = "wvPopwin"
            int r0 = r0.getIdentifier(r4, r2, r3)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "Please use default code in jpush_popwin_layout.xml!"
            cn.jpush.android.helper.Logger.ee(r1, r0)
            r6.finish()
            return
        L3c:
            android.view.View r0 = r6.findViewById(r0)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r5.f1950c = r0
            if (r0 != 0) goto L4f
            java.lang.String r0 = "Can not get webView in layout file!"
            cn.jpush.android.helper.Logger.ee(r1, r0)
            r6.finish()
            return
        L4f:
            r2 = 1
            r0.setScrollbarFadingEnabled(r2)
            android.webkit.WebView r0 = r5.f1950c
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r0.setScrollBarStyle(r3)
            android.webkit.WebView r0 = r5.f1950c
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setDomStorageEnabled(r2)
            cn.jpush.android.ad.a.c(r0)
            android.webkit.WebView r2 = r5.f1950c
            cn.jpush.android.ad.a.a(r2)
            cn.jpush.android.ad.a.a(r0)
            r2 = 0
            r0.setSavePassword(r2)
            android.webkit.WebView r0 = r5.f1950c
            r0.setBackgroundColor(r2)
            cn.jpush.android.webview.bridge.d r0 = new cn.jpush.android.webview.bridge.d
            cn.jpush.android.d.d r2 = r5.f1951d
            r0.<init>(r6, r2)
            cn.jpush.android.ui.b.a = r0
            java.lang.String r0 = "Android sdk version greater than or equal to 17, Java—Js interact by annotation!"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            r5.a()
            android.webkit.WebView r0 = r5.f1950c
            cn.jpush.android.webview.bridge.a r1 = new cn.jpush.android.webview.bridge.a
            java.lang.String r2 = "JPushWeb"
            java.lang.Class<cn.jpush.android.webview.bridge.HostJsScope> r3 = cn.jpush.android.webview.bridge.HostJsScope.class
            r4 = 0
            r1.<init>(r2, r3, r4, r4)
            r0.setWebChromeClient(r1)
            android.webkit.WebView r0 = r5.f1950c
            cn.jpush.android.ui.a r1 = new cn.jpush.android.ui.a
            cn.jpush.android.d.d r2 = r5.f1951d
            r1.<init>(r2, r6)
            r0.setWebViewClient(r1)
            cn.jpush.android.webview.bridge.d r6 = cn.jpush.android.ui.b.a
            cn.jpush.android.webview.bridge.HostJsScope.setWebViewHelper(r6)
            return
    }

    private void c(android.app.Activity r8) {
            r7 = this;
            cn.jpush.android.d.d r0 = r7.f1951d
            java.lang.String r1 = r0.ab
            java.lang.String r0 = r0.Z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "showUrl = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "PopWinActivityImpl"
            cn.jpush.android.helper.Logger.d(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3b
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "file://"
            java.lang.String r4 = ""
            java.lang.String r3 = r1.replace(r3, r4)
            r2.<init>(r3)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L3b
            android.webkit.WebView r0 = r7.f1950c
            r0.loadUrl(r1)
            goto L40
        L3b:
            android.webkit.WebView r1 = r7.f1950c
            r1.loadUrl(r0)
        L40:
            cn.jpush.android.d.d r0 = r7.f1951d
            byte r3 = r0.ai
            if (r3 != 0) goto L4e
            java.lang.String r0 = r7.f1949b
            r1 = 1000(0x3e8, double:4.94E-321)
            cn.jpush.android.helper.c.a(r0, r1, r8)
            return
        L4e:
            java.lang.String r1 = r0.f1757d
            java.lang.String r2 = ""
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = r8
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onBackPressed(android.app.Activity r8) {
            r7 = this;
            cn.jpush.android.d.d r0 = r7.f1951d
            if (r0 == 0) goto L8
            byte r3 = r0.ai
            if (r3 != 0) goto La
        L8:
            r6 = r8
            goto L15
        La:
            java.lang.String r1 = r7.f1949b
            java.lang.String r2 = ""
            r4 = 1006(0x3ee, double:4.97E-321)
            r6 = r8
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
            return
        L15:
            java.lang.String r8 = r7.f1949b
            r0 = 1006(0x3ee, double:4.97E-321)
            cn.jpush.android.helper.c.a(r8, r0, r6)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onConfigurationChanged(android.app.Activity r1, android.content.res.Configuration r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onCreate(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            cn.jpush.android.ad.a.e(r1)
            r0.a(r1)
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public boolean onCreateOptionsMenu(android.app.Activity r1, android.view.Menu r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onDestroy(android.app.Activity r1) {
            r0 = this;
            android.webkit.WebView r1 = r0.f1950c
            if (r1 == 0) goto Lf
            r1.removeAllViews()
            android.webkit.WebView r1 = r0.f1950c
            r1.destroy()
            r1 = 0
            r0.f1950c = r1
        Lf:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onEvent(android.app.Activity r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L49
            java.lang.String r0 = "start_push_activity"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L49
            cn.jpush.android.d.d r3 = r1.f1951d
            if (r3 == 0) goto L49
            android.webkit.WebView r3 = r1.f1950c
            if (r3 == 0) goto L49
            java.lang.String r3 = "url"
            java.lang.String r3 = r4.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L46
            cn.jpush.android.d.d r4 = r1.f1951d
            r4.Z = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<cn.jpush.android.ui.PushActivity> r4 = cn.jpush.android.ui.PushActivity.class
            r3.<init>(r2, r4)
            cn.jpush.android.d.d r4 = r1.f1951d
            java.lang.String r4 = r4.c()
            java.lang.String r0 = "msg_data"
            r3.putExtra(r0, r4)
            java.lang.String r4 = "from_way"
            r0 = 1
            r3.putExtra(r4, r0)
            r4 = 335544320(0x14000000, float:6.4623485E-27)
            r3.setFlags(r4)
            r2.startActivity(r3)
        L46:
            r2.finish()
        L49:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public boolean onKeyDown(android.app.Activity r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onNewIntent(android.app.Activity r1, android.content.Intent r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onPause(android.app.Activity r1) {
            r0 = this;
            android.webkit.WebView r1 = r0.f1950c
            if (r1 == 0) goto L7
            r1.onPause()
        L7:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onRestart(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onResume(android.app.Activity r1) {
            r0 = this;
            android.webkit.WebView r1 = r0.f1950c
            if (r1 == 0) goto Lc
            r1.onResume()
            cn.jpush.android.webview.bridge.d r1 = cn.jpush.android.ui.b.a
            cn.jpush.android.webview.bridge.HostJsScope.setWebViewHelper(r1)
        Lc:
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onStart(android.app.Activity r1, android.content.Intent r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.local.ProxyActivityAction
    public void onStop(android.app.Activity r1) {
            r0 = this;
            return
    }
}
