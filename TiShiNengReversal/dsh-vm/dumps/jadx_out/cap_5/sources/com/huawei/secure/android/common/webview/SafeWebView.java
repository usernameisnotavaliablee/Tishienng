package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SafeWebView extends android.webkit.WebView {
    private static final java.lang.String f = "SafeWebView";
    private java.lang.String a;
    private java.lang.String[] b;
    private java.lang.String[] c;
    private java.lang.String[] d;
    private com.huawei.secure.android.common.webview.WebViewLoadCallBack e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements android.content.DialogInterface.OnClickListener {
        private final android.webkit.SslErrorHandler a;

        b(android.webkit.SslErrorHandler r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.webkit.SslErrorHandler r1 = r0.a
                r1.cancel()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements android.content.DialogInterface.OnClickListener {
        private final android.webkit.SslErrorHandler a;

        c(android.webkit.SslErrorHandler r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.webkit.SslErrorHandler r1 = r0.a
                r1.proceed()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class d extends android.webkit.WebViewClient {
        private android.webkit.WebViewClient a;
        private boolean b;
        final /* synthetic */ com.huawei.secure.android.common.webview.SafeWebView c;

        private d(com.huawei.secure.android.common.webview.SafeWebView r1, android.webkit.WebViewClient r2, boolean r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        /* synthetic */ d(com.huawei.secure.android.common.webview.SafeWebView r1, android.webkit.WebViewClient r2, boolean r3, com.huawei.secure.android.common.webview.SafeWebView.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(android.webkit.WebView r2, java.lang.String r3, boolean r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.doUpdateVisitedHistory(r2, r3, r4)
                return
            L8:
                super.doUpdateVisitedHistory(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(android.webkit.WebView r2, android.os.Message r3, android.os.Message r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onFormResubmission(r2, r3, r4)
                return
            L8:
                super.onFormResubmission(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onLoadResource(r2, r3)
                return
            L8:
                super.onLoadResource(r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(23)
        public void onPageCommitVisible(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                com.bytedance.sdk.component.widget.c.a(r0, r2, r3)
                return
            L8:
                super.onPageCommitVisible(r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onPageFinished(r2, r3)
                return
            L8:
                super.onPageFinished(r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView r3, java.lang.String r4, android.graphics.Bitmap r5) {
                r2 = this;
                android.webkit.WebViewClient r0 = r2.a
                if (r0 == 0) goto Lc
                boolean r1 = r2.b
                if (r1 != 0) goto Lc
                r0.onPageStarted(r3, r4, r5)
                return
            Lc:
                com.huawei.secure.android.common.webview.SafeWebView r0 = r2.c
                boolean r0 = r0.c(r4)
                if (r0 != 0) goto L1a
                com.huawei.secure.android.common.webview.SafeWebView r5 = r2.c
                r5.d(r3, r4)
                return
            L1a:
                super.onPageStarted(r3, r4, r5)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(21)
        public void onReceivedClientCertRequest(android.webkit.WebView r2, android.webkit.ClientCertRequest r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onReceivedClientCertRequest(r2, r3)
                return
            L8:
                super.onReceivedClientCertRequest(r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView r2, int r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onReceivedError(r2, r3, r4, r5)
                return
            L8:
                super.onReceivedError(r2, r3, r4, r5)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(23)
        public void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                com.bytedance.sdk.component.widget.a.a(r0, r2, r3, r4)
                return
            L8:
                super.onReceivedError(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView r2, android.webkit.HttpAuthHandler r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onReceivedHttpAuthRequest(r2, r3, r4, r5)
                return
            L8:
                super.onReceivedHttpAuthRequest(r2, r3, r4, r5)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(23)
        public void onReceivedHttpError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceResponse r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                com.bytedance.sdk.component.widget.d.a(r0, r2, r3, r4)
                return
            L8:
                super.onReceivedHttpError(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(12)
        public void onReceivedLoginRequest(android.webkit.WebView r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onReceivedLoginRequest(r2, r3, r4, r5)
                return
            L8:
                super.onReceivedLoginRequest(r2, r3, r4, r5)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(8)
        public void onReceivedSslError(android.webkit.WebView r2, android.webkit.SslErrorHandler r3, android.net.http.SslError r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onReceivedSslError(r2, r3, r4)
                return
            L8:
                super.onReceivedSslError(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(android.webkit.WebView r2, android.webkit.RenderProcessGoneDetail r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                boolean r2 = com.bytedance.sdk.component.widget.b.a(r0, r2, r3)
                return r2
            L9:
                boolean r2 = super.onRenderProcessGone(r2, r3)
                return r2
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.SuppressLint({"NewApi"})
        public void onSafeBrowsingHit(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, int r4, android.webkit.SafeBrowsingResponse r5) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                com.bytedance.sdk.component.widget.e.a(r0, r2, r3, r4, r5)
                return
            L8:
                super.onSafeBrowsingHit(r2, r3, r4, r5)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(android.webkit.WebView r2, float r3, float r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onScaleChanged(r2, r3, r4)
                return
            L8:
                super.onScaleChanged(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(android.webkit.WebView r2, android.os.Message r3, android.os.Message r4) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onTooManyRedirects(r2, r3, r4)
                return
            L8:
                super.onTooManyRedirects(r2, r3, r4)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView r2, android.view.KeyEvent r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L8
                r0.onUnhandledKeyEvent(r2, r3)
                return
            L8:
                super.onUnhandledKeyEvent(r2, r3)
                return
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(21)
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                android.webkit.WebResourceResponse r2 = r0.shouldInterceptRequest(r2, r3)
                return r2
            L9:
                android.webkit.WebResourceResponse r2 = super.shouldInterceptRequest(r2, r3)
                return r2
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(11)
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                android.webkit.WebResourceResponse r2 = r0.shouldInterceptRequest(r2, r3)
                return r2
            L9:
                android.webkit.WebResourceResponse r2 = super.shouldInterceptRequest(r2, r3)
                return r2
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(android.webkit.WebView r2, android.view.KeyEvent r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                boolean r2 = r0.shouldOverrideKeyEvent(r2, r3)
                return r2
            L9:
                boolean r2 = super.shouldOverrideKeyEvent(r2, r3)
                return r2
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(24)
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                boolean r2 = com.huawei.secure.android.common.webview.c.a(r0, r2, r3)
                return r2
            L9:
                boolean r2 = super.shouldOverrideUrlLoading(r2, r3)
                return r2
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r2, java.lang.String r3) {
                r1 = this;
                android.webkit.WebViewClient r0 = r1.a
                if (r0 == 0) goto L9
                boolean r2 = r0.shouldOverrideUrlLoading(r2, r3)
                return r2
            L9:
                boolean r2 = super.shouldOverrideUrlLoading(r2, r3)
                return r2
        }
    }

    public SafeWebView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a()
            return
    }

    public SafeWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a()
            return
    }

    public SafeWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.a()
            return
    }

    @android.annotation.TargetApi(21)
    public SafeWebView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.a()
            return
    }

    private void a() {
            r1 = this;
            com.huawei.secure.android.common.webview.b.f(r1)
            r0 = 0
            r1.setWebViewClient(r0)
            return
    }

    private boolean b(java.lang.String r1) {
            r0 = this;
            boolean r1 = android.webkit.URLUtil.isHttpUrl(r1)
            return r1
    }

    @android.annotation.TargetApi(9)
    public boolean c(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf
            java.lang.String r5 = "SafeWebView"
            java.lang.String r0 = "url is null"
            com.huawei.secure.android.common.util.e.l(r5, r0)
            r5 = 0
            return r5
        Lf:
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r5)
            if (r0 != 0) goto L17
            r5 = 1
            return r5
        L17:
            java.lang.String[] r0 = r4.getWhitelistWithPath()
            java.lang.String[] r1 = r4.getWhitelistNotMatchSubDomain()
            java.lang.String[] r2 = r4.getWhitelist()
            if (r0 == 0) goto L2d
            int r3 = r0.length
            if (r3 == 0) goto L2d
            boolean r5 = com.huawei.secure.android.common.webview.d.c(r5, r0)
            return r5
        L2d:
            if (r1 == 0) goto L37
            int r0 = r1.length
            if (r0 == 0) goto L37
            boolean r5 = com.huawei.secure.android.common.webview.d.h(r5, r1)
            return r5
        L37:
            boolean r5 = com.huawei.secure.android.common.webview.d.e(r5, r2)
            return r5
    }

    public final void d(android.webkit.WebView r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "SafeWebView"
            java.lang.String r1 = "onCheckError url is not in white list "
            com.huawei.secure.android.common.util.e.m(r0, r1, r4)
            r3.stopLoading()
            java.lang.String r0 = r2.getDefaultErrorPage()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            r3.loadUrl(r0)
            return
        L18:
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r2.getWebViewLoadCallBack()
            if (r3 == 0) goto L27
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r2.getWebViewLoadCallBack()
            com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r0 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.URL_NOT_IN_WHITE_LIST
            r3.a(r4, r0)
        L27:
            return
    }

    public void e(android.webkit.WebViewClient r3, boolean r4) {
            r2 = this;
            com.huawei.secure.android.common.webview.SafeWebView$d r0 = new com.huawei.secure.android.common.webview.SafeWebView$d
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            super.setWebViewClient(r0)
            return
    }

    @java.lang.Deprecated
    protected final void f(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, android.webkit.SslErrorHandler r7) {
            r2 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L12
            r0.setTitle(r3)
        L12:
            com.huawei.secure.android.common.webview.SafeWebView$c r3 = new com.huawei.secure.android.common.webview.SafeWebView$c
            r3.<init>(r7)
            com.huawei.secure.android.common.webview.SafeWebView$b r1 = new com.huawei.secure.android.common.webview.SafeWebView$b
            r1.<init>(r7)
            r0.setMessage(r4)
            r0.setPositiveButton(r5, r3)
            r0.setNegativeButton(r6, r1)
            android.app.AlertDialog r3 = r0.create()
            r3.show()
            return
    }

    public java.lang.String getDefaultErrorPage() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.huawei.secure.android.common.webview.WebViewLoadCallBack getWebViewLoadCallBack() {
            r1 = this;
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r0 = r1.e
            return r0
    }

    @android.annotation.TargetApi(9)
    @java.lang.Deprecated
    public java.lang.String[] getWhitelist() {
            r2 = this;
            java.lang.String[] r0 = r2.b
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String[] getWhitelistNotMatchSubDomain() {
            r2 = this;
            java.lang.String[] r0 = r2.c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String[] getWhitelistNotMathcSubDomain() {
            r2 = this;
            java.lang.String[] r0 = r2.c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @android.annotation.TargetApi(9)
    public java.lang.String[] getWhitelistWithPath() {
            r2 = this;
            java.lang.String[] r0 = r2.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            boolean r0 = r7.b(r8)
            if (r0 == 0) goto L29
            java.lang.String r0 = r7.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            java.lang.String r2 = r7.a
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            super.loadDataWithBaseURL(r2, r3, r4, r5, r6)
            return
        L19:
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r9 = r7.getWebViewLoadCallBack()
            if (r9 == 0) goto L28
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r9 = r7.getWebViewLoadCallBack()
            com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r10 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.HTTP_URL
            r9.a(r8, r10)
        L28:
            return
        L29:
            super.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            return
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.c(r3)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r2.b(r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r2.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r3 = r2.a
            super.loadUrl(r3)
            return
        L1b:
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r0 = r2.getWebViewLoadCallBack()
            if (r0 == 0) goto L2a
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r0 = r2.getWebViewLoadCallBack()
            com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r1 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.HTTP_URL
            r0.a(r3, r1)
        L2a:
            return
        L2b:
            super.loadUrl(r3)
            return
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            boolean r0 = r1.c(r2)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b(r2)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r1.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r2 = r1.a
            super.loadUrl(r2, r3)
            return
        L1b:
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r1.getWebViewLoadCallBack()
            if (r3 == 0) goto L2a
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r1.getWebViewLoadCallBack()
            com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r0 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.HTTP_URL
            r3.a(r2, r0)
        L2a:
            return
        L2b:
            super.loadUrl(r2, r3)
            return
    }

    @Override // android.webkit.WebView
    public void postUrl(java.lang.String r2, byte[] r3) {
            r1 = this;
            boolean r0 = r1.c(r2)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b(r2)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r1.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r2 = r1.a
            super.postUrl(r2, r3)
            return
        L1b:
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r1.getWebViewLoadCallBack()
            if (r3 == 0) goto L2a
            com.huawei.secure.android.common.webview.WebViewLoadCallBack r3 = r1.getWebViewLoadCallBack()
            com.huawei.secure.android.common.webview.WebViewLoadCallBack$ErrorCode r0 = com.huawei.secure.android.common.webview.WebViewLoadCallBack.ErrorCode.HTTP_URL
            r3.a(r2, r0)
        L2a:
            return
        L2b:
            super.postUrl(r2, r3)
            return
    }

    public void setDefaultErrorPage(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(android.webkit.WebViewClient r4) {
            r3 = this;
            com.huawei.secure.android.common.webview.SafeWebView$d r0 = new com.huawei.secure.android.common.webview.SafeWebView$d
            r1 = 1
            r2 = 0
            r0.<init>(r3, r4, r1, r2)
            super.setWebViewClient(r0)
            return
    }

    public void setWebViewLoadCallBack(com.huawei.secure.android.common.webview.WebViewLoadCallBack r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @android.annotation.TargetApi(9)
    @java.lang.Deprecated
    public void setWhitelist(java.lang.String[] r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lb
        L4:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lb:
            r1.b = r2
            return
    }

    public void setWhitelistNotMatchSubDomain(java.lang.String[] r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lb
        L4:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lb:
            r1.c = r2
            return
    }

    @java.lang.Deprecated
    public void setWhitelistNotMathcSubDomain(java.lang.String[] r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lb
        L4:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lb:
            r1.c = r2
            return
    }

    @android.annotation.TargetApi(9)
    public void setWhitelistWithPath(java.lang.String[] r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lb
        L4:
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lb:
            r1.d = r2
            return
    }
}
