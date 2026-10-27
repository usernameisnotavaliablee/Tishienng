package xyz.adscope.amps.tool.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSCustomWebView extends android.webkit.WebView {


    public AMPSCustomWebView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.init()
            return
    }

    public AMPSCustomWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.init()
            return
    }

    public AMPSCustomWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.init()
            return
    }

    public AMPSCustomWebView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.init()
            return
    }

    static /* synthetic */ void access$000(xyz.adscope.amps.tool.widget.AMPSCustomWebView r0, android.content.Context r1, java.lang.String r2) {
            r0.showJumpPromptDialog(r1, r2)
            return
    }

    private void init() {
            r3 = this;
            r3.setWebViewSettings()     // Catch: java.lang.Throwable -> L7
            r3.setAdScopeWebViewClient()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
            return
    }

    private void openNativeIntent(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            android.net.Uri r0 = android.net.Uri.parse(r4)
        Lc:
            java.lang.String r1 = "amps_log_tag"
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to launch custom protocol: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            xyz.adscope.common.tool.LogUtil.i(r1, r4)
            return
        L25:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r4.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r0)
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L4d
            r0.startActivity(r4)     // Catch: java.lang.Exception -> L4d
            r3.destroy()     // Catch: java.lang.Exception -> L4d
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Exception -> L4d
            boolean r4 = r4 instanceof android.app.Activity     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L4f
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Exception -> L4d
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Exception -> L4d
            r4.finish()     // Catch: java.lang.Exception -> L4d
            return
        L4d:
            r4 = move-exception
            goto L50
        L4f:
            return
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "e : "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            xyz.adscope.common.tool.LogUtil.e(r1, r4)
            return
    }

    private void setAdScopeWebViewClient() {
            r1 = this;
            xyz.adscope.amps.tool.widget.AMPSCustomWebView$1 r0 = new xyz.adscope.amps.tool.widget.AMPSCustomWebView$1
            r0.<init>(r1)
            r1.setWebViewClient(r0)
            return
    }

    private void setWebViewSettings() {
            r4 = this;
            android.webkit.WebSettings r0 = r4.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)
            r2 = 0
            r0.setBuiltInZoomControls(r2)
            r0.setEnableSmoothTransition(r1)
            r0.setLightTouchEnabled(r2)
            android.webkit.WebSettings$PluginState r3 = android.webkit.WebSettings.PluginState.ON
            r0.setPluginState(r3)
            r0.setLoadsImagesAutomatically(r1)
            r0.setSavePassword(r2)
            r0.setSupportZoom(r2)
            r0.setUseWideViewPort(r2)
            r0.setMediaPlaybackRequiresUserGesture(r2)
            r0.setMixedContentMode(r2)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
            android.content.Context r3 = r4.getContext()
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r0.setAppCachePath(r3)
            r0.setAppCacheEnabled(r1)
            r3 = -1
            r0.setCacheMode(r3)
            r0.setAllowFileAccess(r2)
            r0.setAllowContentAccess(r2)
            r0.setAllowFileAccessFromFileURLs(r2)
            r0.setAllowUniversalAccessFromFileURLs(r2)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            if (r0 == 0) goto L5d
            r0.setAcceptThirdPartyCookies(r4, r1)
        L5d:
            r4.setHorizontalScrollbarOverlay(r2)
            r4.setHorizontalScrollBarEnabled(r2)
            r4.setVerticalScrollbarOverlay(r2)
            r4.setVerticalScrollBarEnabled(r2)
            r4.setScrollBarStyle(r2)
            return
    }

    private void showJumpPromptDialog(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            if (r3 != 0) goto L9
            goto L1f
        L9:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1d
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r4)     // Catch: java.lang.Throwable -> L1d
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            goto L20
        L1f:
            return
        L20:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "e : "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r4, r3)
            return
    }
}
