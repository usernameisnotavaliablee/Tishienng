package cn.jpush.android.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f extends cn.jpush.android.u.b {

    /* renamed from: f, reason: collision with root package name */
    private android.webkit.WebView f1942f;

    /* renamed from: g, reason: collision with root package name */
    private cn.jpush.android.webview.bridge.d f1943g;

    public f(android.content.Context r1, cn.jpush.android.t.a r2, cn.jpush.android.d.d r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private void a() {
            r5 = this;
            cn.jpush.android.webview.bridge.d r0 = r5.f1943g
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            java.lang.String r4 = "JPushWeb"
            r2[r0] = r4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r1[r3] = r4
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r1[r0] = r3
            android.webkit.WebView r0 = r5.f1942f     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "addJavascriptInterface"
            cn.jpush.android.ad.k.a(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L1f
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
            java.lang.String r1 = "BaseInAppWrapper"
            cn.jpush.android.helper.Logger.e(r1, r0)
            return
    }

    @Override // cn.jpush.android.u.b
    public void c() {
            r4 = this;
            java.lang.String r0 = "BaseInAppWrapper"
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L5d
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "wb parent view "
            r2.append(r3)     // Catch: java.lang.Throwable -> L29
            r2.append(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L29
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L29
            android.webkit.WebView r2 = r4.f1942f     // Catch: java.lang.Throwable -> L29
            r1.removeView(r2)     // Catch: java.lang.Throwable -> L29
            goto L31
        L29:
            java.lang.String r1 = "release - parent not viewGroup"
            cn.jpush.android.helper.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r1 = move-exception
            goto L67
        L31:
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebSettings r1 = r1.getSettings()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r1.setJavaScriptEnabled(r2)     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r2 = 1
            r1.clearCache(r2)     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r1.clearHistory()     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r1.clearView()     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r1.removeAllViews()     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r1.clearSslPreferences()     // Catch: java.lang.Throwable -> L2f
            android.webkit.WebView r1 = r4.f1942f     // Catch: java.lang.Throwable -> L2f
            r1.destroy()     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            r4.f1942f = r1     // Catch: java.lang.Throwable -> L2f
        L5d:
            r4.i()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "wb release completed."
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L2f
            goto L80
        L67:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "wb destroy failed. error: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
        L80:
            return
    }

    @Override // cn.jpush.android.u.b
    public void d() {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.u.b
    public android.view.View e() {
            r1 = this;
            android.webkit.WebView r0 = r1.f1942f
            return r0
    }

    @Override // cn.jpush.android.u.b
    public boolean f() {
            r9 = this;
            android.content.Context r0 = r9.f1921d
            r1 = 0
            java.lang.String r2 = "BaseInAppWrapper"
            if (r0 == 0) goto Lcb
            cn.jpush.android.d.d r0 = r9.f1919b
            if (r0 != 0) goto Ld
            goto Lcb
        Ld:
            java.lang.String r0 = r0.be     // Catch: java.lang.Throwable -> L1b
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1e
            java.lang.String r0 = "url is empty, wb inflate failed."
            cn.jpush.android.helper.Logger.w(r2, r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r0 = move-exception
            goto Lb1
        L1e:
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L3b
            android.webkit.WebView r3 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = r9.f1921d     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            r9.f1942f = r3     // Catch: java.lang.Throwable -> L1b
            android.content.Context r4 = r9.f1921d     // Catch: java.lang.Throwable -> L1b
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L1b
            r5 = 17170445(0x106000d, float:2.461195E-38)
            int r4 = r4.getColor(r5)     // Catch: java.lang.Throwable -> L1b
            r3.setBackgroundColor(r4)     // Catch: java.lang.Throwable -> L1b
        L3b:
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            r3.setHorizontalScrollBarEnabled(r1)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            r3.setVerticalScrollBarEnabled(r1)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r3.setScrollbarFadingEnabled(r4)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r3.setScrollBarStyle(r5)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebSettings r3 = r3.getSettings()     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.ad.a.c(r3)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r5 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.ad.a.a(r5)     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.ad.a.a(r3)     // Catch: java.lang.Throwable -> L1b
            android.content.Context r3 = r9.f1921d     // Catch: java.lang.Throwable -> L1b
            android.app.Activity r3 = cn.jpush.android.s.a.a(r3)     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.webview.bridge.d r5 = new cn.jpush.android.webview.bridge.d     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.d.d r6 = r9.f1919b     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L1b
            r9.f1943g = r5     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.webview.bridge.HostJsScope.setWebViewHelper(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "Android sdk version greater than or equal to 17, Java—Js interact by annotation!"
            cn.jpush.android.helper.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r9.a()     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebViewClient r5 = new android.webkit.WebViewClient     // Catch: java.lang.Throwable -> L1b
            r5.<init>()     // Catch: java.lang.Throwable -> L1b
            r3.setWebViewClient(r5)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.webview.bridge.a r5 = new cn.jpush.android.webview.bridge.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r6 = "JPushWeb"
            java.lang.Class<cn.jpush.android.webview.bridge.HostJsScope> r7 = cn.jpush.android.webview.bridge.HostJsScope.class
            r8 = 0
            r5.<init>(r6, r7, r8, r8)     // Catch: java.lang.Throwable -> L1b
            r3.setWebChromeClient(r5)     // Catch: java.lang.Throwable -> L1b
            android.webkit.WebView r3 = r9.f1942f     // Catch: java.lang.Throwable -> L1b
            r3.loadUrl(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "wb inflate completed, url: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L1b
            r3.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            cn.jpush.android.helper.Logger.d(r2, r0)     // Catch: java.lang.Throwable -> L1b
            return r4
        Lb1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "wb inflate failed, "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        Lc7:
            cn.jpush.android.helper.Logger.w(r2, r0)
            return r1
        Lcb:
            java.lang.String r0 = "unexpected error param is null"
            goto Lc7
    }

    @Override // cn.jpush.android.u.b
    public void g() {
            r0 = this;
            return
    }
}
