package xyz.adscope.ad.ad.nativead.render.view.asnp.prefab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BasicWebView extends android.webkit.WebView {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b extends android.webkit.WebChromeClient {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(java.lang.String r2, android.webkit.GeolocationPermissions.Callback r3) {
                r1 = this;
                if (r3 == 0) goto L6
                r0 = 0
                r3.invoke(r2, r0, r0)
            L6:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends android.webkit.WebViewClient {
        final /* synthetic */ xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView a;

        private c(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ c(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r1, xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r4, android.webkit.WebResourceRequest r5) {
                r3 = this;
                if (r5 == 0) goto L35
                android.net.Uri r0 = r5.getUrl()
                if (r0 == 0) goto L35
                android.net.Uri r0 = r5.getUrl()
                java.lang.String r0 = r0.toString()
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r1 = r3.a
                boolean r1 = r1.a(r0)
                if (r1 != 0) goto L33
                java.util.Map r5 = r5.getRequestHeaders()
                if (r5 == 0) goto L24
                boolean r1 = r5.isEmpty()
                if (r1 == 0) goto L29
            L24:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
            L29:
                java.lang.String r1 = "X-Requested-With"
                java.lang.String r2 = ""
                r5.put(r1, r2)
                r4.loadUrl(r0, r5)
            L33:
                r4 = 1
                return r4
            L35:
                boolean r4 = super.shouldOverrideUrlLoading(r4, r5)
                return r4
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                r3 = this;
                xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView r0 = r3.a
                boolean r0 = r0.a(r5)
                if (r0 != 0) goto L17
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r1 = "X-Requested-With"
                java.lang.String r2 = ""
                r0.put(r1, r2)
                r4.loadUrl(r5, r0)
            L17:
                r4 = 1
                return r4
        }
    }

    public BasicWebView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.d()
            return
    }

    public BasicWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.d()
            return
    }

    public BasicWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.d()
            return
    }

    public BasicWebView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.d()
            return
    }

    private void d() {
            r0 = this;
            r0.f()
            r0.e()
            return
    }

    private void e() {
            r2 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView$c r0 = new xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView$c
            r1 = 0
            r0.<init>(r2, r1)
            r2.setWebViewClient(r0)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView$b r0 = new xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.BasicWebView$b
            r0.<init>(r1)
            r2.setWebChromeClient(r0)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    private void f() {
            r5 = this;
            android.webkit.WebSettings r0 = r5.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            r2 = 0
            r0.setBuiltInZoomControls(r2)
            r0.setLoadsImagesAutomatically(r1)
            r0.setSupportZoom(r2)
            r0.setUseWideViewPort(r2)
            r0.setEnableSmoothTransition(r1)
            r0.setLightTouchEnabled(r2)
            android.webkit.WebSettings$PluginState r3 = android.webkit.WebSettings.PluginState.ON
            r0.setPluginState(r3)
            r0.setSavePassword(r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0.setMediaPlaybackRequiresUserGesture(r2)
            r0.setMixedContentMode(r2)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
            r4 = 32
            if (r3 > r4) goto L4a
            android.content.Context r3 = r5.getContext()
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r0.setAppCachePath(r3)
            r0.setAppCacheEnabled(r1)
        L4a:
            r3 = -1
            r0.setCacheMode(r3)
            r0.setAllowFileAccess(r2)
            r0.setAllowContentAccess(r2)
            r0.setGeolocationEnabled(r2)
            r0.setAllowFileAccessFromFileURLs(r2)
            r0.setAllowUniversalAccessFromFileURLs(r2)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            if (r0 == 0) goto L66
            r0.setAcceptThirdPartyCookies(r5, r1)
        L66:
            r5.setHorizontalScrollBarEnabled(r2)
            r5.setVerticalScrollBarEnabled(r2)
            r5.setScrollBarStyle(r2)
            r5.setHorizontalScrollbarOverlay(r2)
            r5.setVerticalScrollbarOverlay(r2)
            return
    }

    protected boolean a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "http"
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            r2 = 1
            return r2
    }
}
