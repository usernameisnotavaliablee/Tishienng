package com.umeng.socialize.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OauthDialog extends com.umeng.socialize.view.BaseDialog {
    private static final java.lang.String BASE_URL = "https://log.umsns.com/";
    private static final java.lang.String TAG = "OauthDialog";
    private static java.lang.String mRedirectUri = "error";
    private com.umeng.socialize.view.OauthDialog.a mListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.view.OauthDialog$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private com.umeng.socialize.UMAuthListener a;
        private com.umeng.socialize.bean.SHARE_MEDIA b;
        private int c;

        public a(com.umeng.socialize.UMAuthListener r1, com.umeng.socialize.bean.SHARE_MEDIA r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void a() {
                r3 = this;
                com.umeng.socialize.UMAuthListener r0 = r3.a
                if (r0 == 0) goto Lb
                com.umeng.socialize.bean.SHARE_MEDIA r1 = r3.b
                int r2 = r3.c
                r0.onCancel(r1, r2)
            Lb:
                return
        }

        public void a(android.os.Bundle r4) {
                r3 = this;
                com.umeng.socialize.UMAuthListener r0 = r3.a
                if (r0 == 0) goto Lf
                com.umeng.socialize.bean.SHARE_MEDIA r1 = r3.b
                int r2 = r3.c
                java.util.Map r4 = com.umeng.socialize.utils.SocializeUtils.bundleTomap(r4)
                r0.onComplete(r1, r2, r4)
            Lf:
                return
        }

        public void a(java.lang.Exception r4) {
                r3 = this;
                com.umeng.socialize.UMAuthListener r0 = r3.a
                if (r0 == 0) goto Lb
                com.umeng.socialize.bean.SHARE_MEDIA r1 = r3.b
                int r2 = r3.c
                r0.onError(r1, r2, r4)
            Lb:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends android.webkit.WebChromeClient {
        private java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> a;

        private b(com.umeng.socialize.view.OauthDialog r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        /* synthetic */ b(com.umeng.socialize.view.OauthDialog r1, com.umeng.socialize.view.OauthDialog.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView r2, int r3) {
                r1 = this;
                super.onProgressChanged(r2, r3)
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r2 = r1.a
                if (r2 != 0) goto L9
                r2 = 0
                goto Lf
            L9:
                java.lang.Object r2 = r2.get()
                com.umeng.socialize.view.OauthDialog r2 = (com.umeng.socialize.view.OauthDialog) r2
            Lf:
                if (r2 == 0) goto L22
                r0 = 90
                if (r3 >= r0) goto L1c
                android.view.View r2 = r2.mProgressbar
                r3 = 0
                r2.setVisibility(r3)
                return
            L1c:
                android.os.Handler r2 = r2.mHandler
                r3 = 1
                r2.sendEmptyMessage(r3)
            L22:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends android.webkit.WebViewClient {
        private java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> a;

        private c(com.umeng.socialize.view.OauthDialog r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.a = r0
                return
        }

        /* synthetic */ c(com.umeng.socialize.view.OauthDialog r1, com.umeng.socialize.view.OauthDialog.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(java.lang.String r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r2.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L20
                r1 = 1
                r0.mFlag = r1
                android.os.Bundle r3 = com.umeng.socialize.utils.SocializeUtils.parseUrl(r3)
                r0.mValues = r3
                boolean r3 = r0.isShowing()
                if (r3 == 0) goto L20
                com.umeng.socialize.utils.SocializeUtils.safeCloseDialog(r0)
            L20:
                return
        }

        private void b(java.lang.String r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r2.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L20
                r1 = 1
                r0.mFlag = r1
                android.os.Bundle r3 = com.umeng.socialize.net.utils.SocializeNetUtils.parseUrl(r3)
                r0.mValues = r3
                boolean r3 = r0.isShowing()
                if (r3 == 0) goto L20
                com.umeng.socialize.utils.SocializeUtils.safeCloseDialog(r0)
            L20:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView r4, java.lang.String r5) {
                r3 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r3.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L26
                android.os.Handler r1 = r0.mHandler
                r2 = 1
                r1.sendEmptyMessage(r2)
                super.onPageFinished(r4, r5)
                int r4 = r0.mFlag
                if (r4 != 0) goto L26
                java.lang.String r4 = r0.mWaitUrl
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L26
                r3.a(r5)
            L26:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
                r3 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r3.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L46
                java.lang.String r1 = "?ud_get="
                boolean r1 = r5.contains(r1)
                if (r1 == 0) goto L1b
                java.lang.String r1 = com.umeng.socialize.view.OauthDialog.access$200(r0, r5)
                goto L1d
            L1b:
                java.lang.String r1 = ""
            L1d:
                java.lang.String r2 = "access_key"
                boolean r2 = r1.contains(r2)
                if (r2 == 0) goto L39
                java.lang.String r2 = "access_secret"
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L39
                java.lang.String r4 = r0.mWaitUrl
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L38
                r3.a(r5)
            L38:
                return
            L39:
                java.lang.String r0 = com.umeng.socialize.view.OauthDialog.access$300()
                boolean r0 = r5.startsWith(r0)
                if (r0 == 0) goto L46
                r3.b(r5)
            L46:
                super.onPageStarted(r4, r5, r6)
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView r4, int r5, java.lang.String r6, java.lang.String r7) {
                r3 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r3.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L1b
                android.view.View r1 = r0.mProgressbar
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L1b
                r2 = 8
                r1.setVisibility(r2)
            L1b:
                super.onReceivedError(r4, r5, r6, r7)
                if (r0 == 0) goto L23
                com.umeng.socialize.utils.SocializeUtils.safeCloseDialog(r0)
            L23:
                return
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView r1, android.webkit.SslErrorHandler r2, android.net.http.SslError r3) {
                r0 = this;
                r2.cancel()
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                r3 = this;
                java.lang.ref.WeakReference<com.umeng.socialize.view.OauthDialog> r0 = r3.a
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                java.lang.Object r0 = r0.get()
                com.umeng.socialize.view.OauthDialog r0 = (com.umeng.socialize.view.OauthDialog) r0
            Lc:
                if (r0 == 0) goto L41
                android.content.Context r1 = r0.mContext
                android.content.Context r1 = r1.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                boolean r2 = com.umeng.socialize.utils.DeviceConfig.isNetworkAvailable(r1)
                if (r2 != 0) goto L2a
                java.lang.String r4 = com.umeng.socialize.utils.UmengText.NET.NET_INAVALIBLE
                r5 = 0
                android.widget.Toast r4 = android.widget.Toast.makeText(r1, r4, r5)
                r4.show()
                r4 = 1
                return r4
            L2a:
                java.lang.String r1 = "?ud_get="
                boolean r1 = r5.contains(r1)
                if (r1 == 0) goto L36
                java.lang.String r5 = com.umeng.socialize.view.OauthDialog.access$200(r0, r5)
            L36:
                java.lang.String r0 = r0.mWaitUrl
                boolean r0 = r5.contains(r0)
                if (r0 == 0) goto L41
                r3.a(r5)
            L41:
                boolean r4 = super.shouldOverrideUrlLoading(r4, r5)
                return r4
        }
    }

    static {
            return
    }

    public OauthDialog(android.app.Activity r1, com.umeng.socialize.bean.SHARE_MEDIA r2, com.umeng.socialize.UMAuthListener r3) {
            r0 = this;
            r0.<init>(r1, r2)
            com.umeng.socialize.view.OauthDialog$a r1 = new com.umeng.socialize.view.OauthDialog$a
            r1.<init>(r3, r2)
            r0.mListener = r1
            r0.initViews()
            return
    }

    static /* synthetic */ java.lang.String access$200(com.umeng.socialize.view.OauthDialog r0, java.lang.String r1) {
            java.lang.String r0 = r0.decrypt(r1)
            return r0
    }

    static /* synthetic */ java.lang.String access$300() {
            java.lang.String r0 = com.umeng.socialize.view.OauthDialog.mRedirectUri
            return r0
    }

    private java.lang.String decrypt(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ud_get="
            java.lang.String[] r0 = r4.split(r0)     // Catch: java.lang.Exception -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r1.<init>()     // Catch: java.lang.Exception -> L1c
            r2 = 0
            r2 = r0[r2]     // Catch: java.lang.Exception -> L1c
            r1.append(r2)     // Catch: java.lang.Exception -> L1c
            r2 = 1
            r0 = r0[r2]     // Catch: java.lang.Exception -> L1c
            r1.append(r0)     // Catch: java.lang.Exception -> L1c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L1c
            return r4
        L1c:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
            return r4
    }

    private android.webkit.WebViewClient getAdapterWebViewClient() {
            r2 = this;
            com.umeng.socialize.view.OauthDialog$c r0 = new com.umeng.socialize.view.OauthDialog$c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private java.lang.String getUrl(com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r3 = this;
            com.umeng.socialize.utils.URLBuilder r0 = new com.umeng.socialize.utils.URLBuilder
            android.content.Context r1 = r3.mContext
            r0.<init>(r1)
            java.lang.String r1 = "https://log.umsns.com/"
            com.umeng.socialize.utils.URLBuilder r1 = r0.setHost(r1)
            java.lang.String r2 = "share/auth/"
            com.umeng.socialize.utils.URLBuilder r1 = r1.setPath(r2)
            android.content.Context r2 = r3.mContext
            java.lang.String r2 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r2)
            com.umeng.socialize.utils.URLBuilder r1 = r1.setAppkey(r2)
            java.lang.String r2 = com.umeng.socialize.Config.EntityKey
            com.umeng.socialize.utils.URLBuilder r1 = r1.setEntityKey(r2)
            com.umeng.socialize.utils.URLBuilder r4 = r1.withMedia(r4)
            java.lang.String r1 = "10"
            com.umeng.socialize.utils.URLBuilder r4 = r4.withOpId(r1)
            java.lang.String r1 = com.umeng.socialize.Config.SessionId
            com.umeng.socialize.utils.URLBuilder r4 = r4.withSessionId(r1)
            android.content.Context r1 = r3.mContext
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getUMId(r1)
            r4.withUID(r1)
            java.lang.String r4 = r0.toEncript()
            return r4
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r6 = this;
            android.os.Bundle r0 = r6.mValues
            if (r0 == 0) goto L9d
            java.lang.String r1 = "uid"
            java.lang.String r0 = r0.getString(r1)
            android.os.Bundle r1 = r6.mValues
            java.lang.String r2 = "error_code"
            java.lang.String r1 = r1.getString(r2)
            android.os.Bundle r2 = r6.mValues
            java.lang.String r3 = "error_description"
            java.lang.String r2 = r2.getString(r3)
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r6.mPlatform
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r3 != r4) goto L53
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L53
            com.umeng.socialize.view.OauthDialog$a r0 = r6.mListener
            com.umeng.socialize.SocializeException r3 = new com.umeng.socialize.SocializeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.umeng.socialize.bean.UmengErrorCode r5 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
            java.lang.String r5 = r5.getMessage()
            r4.append(r5)
            java.lang.String r5 = "errorcode:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " message:"
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            r0.a(r3)
            goto La2
        L53:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L7b
            com.umeng.socialize.view.OauthDialog$a r0 = r6.mListener
            com.umeng.socialize.SocializeException r1 = new com.umeng.socialize.SocializeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.umeng.socialize.bean.UmengErrorCode r3 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r3 = "unfetch usid..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r0.a(r1)
            goto La2
        L7b:
            android.os.Bundle r0 = r6.mValues
            java.lang.String r1 = "access_key"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "accessToken"
            r0.putString(r2, r1)
            android.os.Bundle r0 = r6.mValues
            java.lang.String r1 = "expires_in"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "expiration"
            r0.putString(r2, r1)
            com.umeng.socialize.view.OauthDialog$a r0 = r6.mListener
            android.os.Bundle r1 = r6.mValues
            r0.a(r1)
            goto La2
        L9d:
            com.umeng.socialize.view.OauthDialog$a r0 = r6.mListener
            r0.a()
        La2:
            super.dismiss()
            r6.releaseWebView()
            return
    }

    @Override // com.umeng.socialize.view.BaseDialog
    public void setClient(android.webkit.WebView r2) {
            r1 = this;
            android.webkit.WebViewClient r0 = r1.getAdapterWebViewClient()
            r2.setWebViewClient(r0)
            com.umeng.socialize.view.OauthDialog$b r2 = new com.umeng.socialize.view.OauthDialog$b
            r0 = 0
            r2.<init>(r1, r0)
            android.webkit.WebView r0 = r1.mWebView
            r0.setWebChromeClient(r2)
            return
    }

    public void setmRedirectUri(java.lang.String r1) {
            r0 = this;
            com.umeng.socialize.view.OauthDialog.mRedirectUri = r1
            return
    }

    @Override // android.app.Dialog
    public void show() {
            r2 = this;
            super.show()
            r0 = 0
            r2.mValues = r0
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r2.mPlatform
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r0 != r1) goto L14
            android.webkit.WebView r0 = r2.mWebView
            java.lang.String r1 = r2.mWaitUrl
            r0.loadUrl(r1)
            return
        L14:
            java.lang.String r0 = r2.getUrl(r0)
            android.webkit.WebView r1 = r2.mWebView
            r1.loadUrl(r0)
            return
    }
}
