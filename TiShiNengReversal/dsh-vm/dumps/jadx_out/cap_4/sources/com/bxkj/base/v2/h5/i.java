package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nH5BaseWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5BaseWebViewClient.kt\ncom/bxkj/base/v2/h5/H5BaseWebViewClient\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n29#2:122\n1#3:123\n*S KotlinDebug\n*F\n+ 1 H5BaseWebViewClient.kt\ncom/bxkj/base/v2/h5/H5BaseWebViewClient\n*L\n60#1:122\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i extends cn.bluemobi.dylan.smartwebview.SmartWebView.c {

    @org.jetbrains.annotations.NotNull
    private final androidx.fragment.app.FragmentActivity c;

    @org.jetbrains.annotations.NotNull
    private cn.bluemobi.dylan.smartwebview.SmartWebView d;

    @org.jetbrains.annotations.NotNull
    private java.lang.String e;

    public i(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r3, @org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView r4) {
            r2 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "smartWebView"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.c = r3
            r2.d = r4
            com.bxkj.base.v2.h5.ErrorPageView r3 = new com.bxkj.base.v2.h5.ErrorPageView
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r2.d
            android.content.Context r0 = r0.getContext()
            cn.bluemobi.dylan.smartwebview.SmartWebView r1 = r2.d
            r3.<init>(r0, r1)
            r4.setErrorPage(r3)
            java.lang.String r3 = ""
            r2.e = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final cn.bluemobi.dylan.smartwebview.SmartWebView d() {
            r1 = this;
            cn.bluemobi.dylan.smartwebview.SmartWebView r0 = r1.d
            return r0
    }

    public final void e(@org.jetbrains.annotations.NotNull cn.bluemobi.dylan.smartwebview.SmartWebView r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    public void onPageFinished(@org.jetbrains.annotations.Nullable android.webkit.WebView r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            super.onPageFinished(r2, r3)
            cn.bluemobi.dylan.smartwebview.SmartWebView r3 = r1.d
            r0 = 1
            android.view.View r3 = r3.getChildAt(r0)
            if (r3 == 0) goto L11
            r0 = 8
            r3.setVisibility(r0)
        L11:
            com.bxkj.base.v2.h5.j.a(r2)
            return
    }

    public void onPageStarted(@org.jetbrains.annotations.Nullable android.webkit.WebView r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r3) {
            r0 = this;
            super/*android.webkit.WebViewClient*/.onPageStarted(r1, r2, r3)
            com.bxkj.base.v2.h5.j.a(r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    @org.jetbrains.annotations.Nullable
    public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.Nullable android.webkit.WebView r4, @org.jetbrains.annotations.NotNull android.webkit.WebResourceRequest r5) {
            r3 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map r0 = r5.getRequestHeaders()
            java.lang.String r1 = "Referer"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L1b
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.e = r0
        L1b:
            android.webkit.WebResourceResponse r4 = super/*android.webkit.WebViewClient*/.shouldInterceptRequest(r4, r5)
            return r4
    }

    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull android.webkit.WebView r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "webView"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "smartWebView.shouldOverrideUrlLoading="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.orhanobut.logger.j.d(r0, r2)
            java.lang.String r0 = "tel:"
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.H2(r8, r0, r1, r2, r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r5 = 1
            if (r0 == 0) goto L44
            android.content.Intent r7 = new android.content.Intent
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r7.<init>(r4, r8)
            r8 = 268435456(0x10000000, float:2.524355E-29)
            r7.setFlags(r8)
            com.bxkj.base.BaseApp r8 = com.bxkj.base.BaseApp.c()
            r8.startActivity(r7)
            return r5
        L44:
            java.lang.String r0 = "https://wx.tenpay.com"
            boolean r0 = kotlin.text.u.H2(r8, r0, r1, r2, r3)
            if (r0 == 0) goto L68
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r6.e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L64
            java.lang.String r1 = "referer"
            java.lang.String r2 = r6.e
            r0.put(r1, r2)
            r7.loadUrl(r8, r0)
            goto L67
        L64:
            r7.loadUrl(r8, r0)
        L67:
            return r5
        L68:
            java.lang.String r7 = "weixin://"
            boolean r7 = kotlin.text.u.H2(r8, r7, r1, r2, r3)
            if (r7 != 0) goto L82
            java.lang.String r7 = "alipays://"
            boolean r7 = kotlin.text.u.H2(r8, r7, r1, r2, r3)
            if (r7 != 0) goto L82
            java.lang.String r7 = "upwrp://"
            boolean r7 = kotlin.text.u.H2(r8, r7, r1, r2, r3)
            if (r7 == 0) goto L81
            goto L82
        L81:
            return r1
        L82:
            android.content.Intent r7 = new android.content.Intent
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r7.<init>(r4, r8)
            androidx.fragment.app.FragmentActivity r8 = r6.c
            r8.startActivity(r7)
            return r5
    }
}
