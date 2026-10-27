package com.bxkj.base.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class H5DetailActivity extends cn.bluemobi.dylan.base.BaseActivity {
    public static boolean a0;
    private cn.bluemobi.dylan.smartwebview.SmartWebView Y;
    private java.lang.String Z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.BaseActivity.c {
        final /* synthetic */ com.bxkj.base.webview.H5DetailActivity a;

        a(com.bxkj.base.webview.H5DetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onClick() {
                r1 = this;
                com.bxkj.base.webview.H5DetailActivity r0 = r1.a
                r0.onBackPressed()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b {
        final /* synthetic */ com.bxkj.base.webview.H5DetailActivity a;

        b(com.bxkj.base.webview.H5DetailActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @android.webkit.JavascriptInterface
        public void jsinvoke(java.lang.String r5) {
                r4 = this;
                com.bxkj.base.webview.H5DetailActivity r0 = r4.a
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = "com.bxkj.student"
                java.lang.String r3 = "com.bxkj.student.life.mall.GoodsDetailActivity"
                android.content.Intent r1 = r1.setClassName(r2, r3)
                java.lang.String r2 = "goodsId"
                android.content.Intent r5 = r1.putExtra(r2, r5)
                r0.startActivity(r5)
                return
        }
    }

    static {
            r0 = 15420(0x3c3c, float:2.1608E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public H5DetailActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_h5
            return r0
    }

    public void R() {
            r4 = this;
            java.lang.String r0 = "http://www.boxkj.com"
            r4.Z = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L19
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L1b
        L19:
            java.lang.String r0 = "消息详情"
        L1b:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "url"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto L4f
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r4.Z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "smartWebView.url="
            r1.append(r2)
            java.lang.String r2 = r4.Z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r4.Y
            java.lang.String r2 = r4.Z
            r1.j(r2)
            goto L7c
        L4f:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "content"
            boolean r1 = r1.hasExtra(r2)
            if (r1 == 0) goto L7c
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "smartWebView.content="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.orhanobut.logger.j.c(r2)
            cn.bluemobi.dylan.smartwebview.SmartWebView r2 = r4.Y
            r2.h(r1)
        L7c:
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r4.Y
            android.webkit.WebView r1 = r1.getWebView()
            com.bxkj.base.webview.H5DetailActivity$b r2 = new com.bxkj.base.webview.H5DetailActivity$b
            r2.<init>(r4)
            java.lang.String r3 = "android"
            r1.addJavascriptInterface(r2, r3)
            r4.setTitle(r0)
            return
    }

    public void S() {
            r1 = this;
            com.bxkj.base.webview.H5DetailActivity$a r0 = new com.bxkj.base.webview.H5DetailActivity$a
            r0.<init>(r1)
            r1.X(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.smartWebView
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = (cn.bluemobi.dylan.smartwebview.SmartWebView) r1
            r0.Y = r1
            return
    }

    public void onBackPressed() {
            r3 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r3.Y
            android.webkit.WebView r0 = r0.getWebView()
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L16
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r3.Y
            android.webkit.WebView r0 = r0.getWebView()
            r0.goBack()
            return
        L16:
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.util.Stack r0 = r0.m()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L68
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getSchoolName()
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r0)
            java.lang.String r1 = "com.bxkj.student"
            if (r0 != 0) goto L56
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r0 = r0.getServerUrl()
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r0)
            if (r0 == 0) goto L44
            goto L56
        L44:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.bxkj.student.MainActivity"
            android.content.Intent r0 = r0.setClassName(r1, r2)
            r3.startActivity(r0)
            r3.finish()
            goto L64
        L56:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.bxkj.student.splash.SelectSchoolActivity"
            android.content.Intent r0 = r0.setClassName(r1, r2)
            r3.startActivity(r0)
        L64:
            r3.finish()
            return
        L68:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r2 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r2.Y
            r0.removeView(r1)
        L11:
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            android.webkit.WebView r0 = r0.getWebView()
            r0.stopLoading()
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            android.webkit.WebView r0 = r0.getWebView()
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 0
            r0.setJavaScriptEnabled(r1)
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            android.webkit.WebView r0 = r0.getWebView()
            r0.clearHistory()
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            r0.removeAllViews()
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            android.webkit.WebView r0 = r0.getWebView()
            r0.destroy()
            super.onDestroy()
            return
    }

    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L46
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.Y
            android.webkit.WebView r0 = r0.getWebView()
            boolean r0 = r0.canGoBack()
            r1 = 1
            if (r0 == 0) goto L1a
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r2.Y
            android.webkit.WebView r3 = r3.getWebView()
            r3.goBack()
            return r1
        L1a:
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.util.Stack r0 = r0.m()
            if (r0 == 0) goto L46
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.util.Stack r0 = r0.m()
            int r0 = r0.size()
            if (r0 != r1) goto L46
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.bxkj.student"
            java.lang.String r0 = "com.bxkj.student.MainActivity"
            android.content.Intent r3 = r3.setClassName(r4, r0)
            r2.startActivity(r3)
            r2.finish()
            return r1
        L46:
            boolean r3 = super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(r3, r4)
            return r3
    }

    protected void onPause() {
            r1 = this;
            r0 = 0
            com.bxkj.base.webview.H5DetailActivity.a0 = r0
            super.onPause()
            return
    }

    protected void onResume() {
            r1 = this;
            r0 = 1
            com.bxkj.base.webview.H5DetailActivity.a0 = r0
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            return
    }
}
