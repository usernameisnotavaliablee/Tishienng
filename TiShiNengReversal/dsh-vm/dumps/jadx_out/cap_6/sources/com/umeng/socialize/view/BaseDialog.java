package com.umeng.socialize.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class BaseDialog extends android.app.Dialog {
    public final com.umeng.socialize.common.ResContainer R;
    public android.app.Activity mActivity;
    public android.view.View mContent;
    public android.content.Context mContext;
    public int mFlag;
    public android.os.Handler mHandler;
    public com.umeng.socialize.bean.SHARE_MEDIA mPlatform;
    public android.view.View mProgressbar;
    public android.os.Bundle mValues;
    public java.lang.String mWaitUrl;
    public android.webkit.WebView mWebView;
    public android.widget.TextView titleMidTv;




    public BaseDialog(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r2 = this;
            com.umeng.socialize.common.ResContainer r0 = com.umeng.socialize.common.ResContainer.get(r3)
            java.lang.String r1 = "umeng_socialize_popup_dialog"
            int r0 = r0.style(r1)
            r2.<init>(r3, r0)
            r0 = 0
            r2.mFlag = r0
            java.lang.String r0 = "error"
            r2.mWaitUrl = r0
            com.umeng.socialize.view.BaseDialog$1 r0 = new com.umeng.socialize.view.BaseDialog$1
            r0.<init>(r2)
            r2.mHandler = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r2.mContext = r0
            com.umeng.socialize.common.ResContainer r0 = com.umeng.socialize.common.ResContainer.get(r0)
            r2.R = r0
            r2.mActivity = r3
            r2.mPlatform = r4
            return
    }

    public void initViews() {
            r11 = this;
            android.app.Activity r0 = r11.mActivity
            r11.setOwnerActivity(r0)
            android.app.Activity r0 = r11.mActivity
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            com.umeng.socialize.common.ResContainer r1 = r11.R
            java.lang.String r2 = "umeng_socialize_oauth_dialog"
            int r1 = r1.layout(r2)
            com.umeng.socialize.common.ResContainer r2 = r11.R
            java.lang.String r3 = "umeng_socialize_follow"
            int r2 = r2.id(r3)
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3)
            r11.mContent = r0
            android.view.View r7 = r0.findViewById(r2)
            r0 = 8
            r7.setVisibility(r0)
            com.umeng.socialize.common.ResContainer r1 = r11.R
            java.lang.String r2 = "progress_bar_parent"
            int r1 = r1.id(r2)
            com.umeng.socialize.common.ResContainer r2 = r11.R
            java.lang.String r4 = "umeng_back"
            int r2 = r2.id(r4)
            com.umeng.socialize.common.ResContainer r4 = r11.R
            java.lang.String r5 = "umeng_share_btn"
            int r4 = r4.id(r5)
            com.umeng.socialize.common.ResContainer r5 = r11.R
            java.lang.String r6 = "umeng_title"
            int r5 = r5.id(r6)
            com.umeng.socialize.common.ResContainer r6 = r11.R
            java.lang.String r8 = "umeng_socialize_titlebar"
            int r6 = r6.id(r8)
            android.view.View r8 = r11.mContent
            android.view.View r1 = r8.findViewById(r1)
            r11.mProgressbar = r1
            r10 = 0
            r1.setVisibility(r10)
            android.view.View r1 = r11.mContent
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            com.umeng.socialize.view.BaseDialog$2 r2 = new com.umeng.socialize.view.BaseDialog$2
            r2.<init>(r11)
            r1.setOnClickListener(r2)
            android.view.View r1 = r11.mContent
            android.view.View r1 = r1.findViewById(r4)
            r1.setVisibility(r0)
            android.view.View r0 = r11.mContent
            android.view.View r0 = r0.findViewById(r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.titleMidTv = r0
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r11.mPlatform
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SINA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
            java.lang.String r3 = com.umeng.socialize.bean.PlatformName.SINA
            goto La7
        L97:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r11.mPlatform
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DOUBAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La7
            java.lang.String r3 = com.umeng.socialize.bean.PlatformName.DOUBAN
        La7:
            android.widget.TextView r0 = r11.titleMidTv
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "授权"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r11.setUpWebView()
            android.view.View r0 = r11.mContent
            android.view.View r8 = r0.findViewById(r6)
            android.content.Context r0 = r11.mContext
            r1 = 1128792064(0x43480000, float:200.0)
            int r9 = com.umeng.socialize.utils.SocializeUtils.dip2Px(r0, r1)
            com.umeng.socialize.view.BaseDialog$3 r4 = new com.umeng.socialize.view.BaseDialog$3
            android.content.Context r6 = r11.mContext
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            android.view.View r0 = r5.mContent
            r1 = -1
            r4.addView(r0, r1, r1)
            r11.setContentView(r4)
            android.view.Window r0 = r11.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            android.content.Context r2 = r5.mContext
            boolean r2 = com.umeng.socialize.utils.SocializeUtils.isFloatWindowStyle(r2)
            if (r2 == 0) goto Lff
            android.content.Context r1 = r5.mContext
            int[] r1 = com.umeng.socialize.utils.SocializeUtils.getFloatWindowSize(r1)
            r2 = r1[r10]
            r0.width = r2
            r2 = 1
            r1 = r1[r2]
            r0.height = r1
            goto L103
        Lff:
            r0.height = r1
            r0.width = r1
        L103:
            r1 = 17
            r0.gravity = r1
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyDown(r1, r2)
            return r1
    }

    public void releaseWebView() {
            r2 = this;
            android.webkit.WebView r0 = r2.mWebView     // Catch: java.lang.Exception -> Ld
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> Ld
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Exception -> Ld
            android.webkit.WebView r1 = r2.mWebView     // Catch: java.lang.Exception -> Ld
            r0.removeView(r1)     // Catch: java.lang.Exception -> Ld
        Ld:
            android.webkit.WebView r0 = r2.mWebView     // Catch: java.lang.Exception -> L12
            r0.removeAllViews()     // Catch: java.lang.Exception -> L12
        L12:
            r0 = 0
            r2.mWebView = r0
            return
    }

    public void removeJavascriptInterface(android.webkit.WebView r1) {
            r0 = this;
            return
    }

    public abstract void setClient(android.webkit.WebView r1);

    public boolean setUpWebView() {
            r7 = this;
            android.view.View r0 = r7.mContent
            com.umeng.socialize.common.ResContainer r1 = r7.R
            java.lang.String r2 = "webView"
            int r1 = r1.id(r2)
            android.view.View r0 = r0.findViewById(r1)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r7.mWebView = r0
            r7.setClient(r0)
            android.webkit.WebView r0 = r7.mWebView
            r0.requestFocusFromTouch()
            android.webkit.WebView r0 = r7.mWebView
            r1 = 0
            r0.setVerticalScrollBarEnabled(r1)
            android.webkit.WebView r0 = r7.mWebView
            r0.setHorizontalScrollBarEnabled(r1)
            android.webkit.WebView r0 = r7.mWebView
            r0.setScrollBarStyle(r1)
            android.webkit.WebView r0 = r7.mWebView
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 2
            r0.setCacheMode(r2)
            android.webkit.WebView r0 = r7.mWebView
            r2 = -1
            r0.setBackgroundColor(r2)
            android.webkit.WebView r0 = r7.mWebView
            android.webkit.WebSettings r0 = r0.getSettings()
            r2 = 1
            r0.setJavaScriptEnabled(r2)
            android.webkit.WebSettings$PluginState r3 = android.webkit.WebSettings.PluginState.ON
            r0.setPluginState(r3)
            r0.setSupportZoom(r2)
            r0.setBuiltInZoomControls(r2)
            r0.setAllowFileAccess(r1)
            r0.setSavePassword(r1)
            android.webkit.WebSettings$LayoutAlgorithm r3 = android.webkit.WebSettings.LayoutAlgorithm.NORMAL
            r0.setLayoutAlgorithm(r3)
            r0.setUseWideViewPort(r2)
            r0.setLoadWithOverviewMode(r2)
            r0.setDatabaseEnabled(r2)
            r0.setDomStorageEnabled(r2)
            r0.setGeolocationEnabled(r2)
            java.lang.Class<android.webkit.WebSettings> r3 = android.webkit.WebSettings.class
            java.lang.String r4 = "setDisplayZoomControls"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L84
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L84
            r5[r1] = r6     // Catch: java.lang.Exception -> L84
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L84
            r3.setAccessible(r2)     // Catch: java.lang.Exception -> L84
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L84
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L84
            r4[r1] = r5     // Catch: java.lang.Exception -> L84
            r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L84
            goto L88
        L84:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
        L88:
            android.webkit.WebView r0 = r7.mWebView     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = "searchBoxJavaBridge_"
            r0.removeJavascriptInterface(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebView r0 = r7.mWebView     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = "accessibility"
            r0.removeJavascriptInterface(r1)     // Catch: java.lang.Throwable -> L9d
            android.webkit.WebView r0 = r7.mWebView     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = "accessibilityTraversal"
            r0.removeJavascriptInterface(r1)     // Catch: java.lang.Throwable -> L9d
        L9d:
            return r2
    }

    public void setWaitUrl(java.lang.String r1) {
            r0 = this;
            r0.mWaitUrl = r1
            return
    }
}
