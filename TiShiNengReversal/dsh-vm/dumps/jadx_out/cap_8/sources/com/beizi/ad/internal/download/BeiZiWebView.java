package com.beizi.ad.internal.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BeiZiWebView extends android.webkit.WebView {


    public BeiZiWebView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a()
            return
    }

    public BeiZiWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a()
            return
    }

    public BeiZiWebView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.a()
            return
    }

    private void a() {
            r0 = this;
            r0.b()     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private void b() {
            r5 = this;
            android.webkit.WebSettings r0 = r5.getSettings()
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
            int r3 = android.os.Build.VERSION.SDK_INT
            r0.setMediaPlaybackRequiresUserGesture(r2)
            r0.setMixedContentMode(r2)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r2)
            r4 = 33
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
            r0.setAllowFileAccessFromFileURLs(r2)
            r0.setAllowUniversalAccessFromFileURLs(r2)
            r0.setGeolocationEnabled(r2)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            if (r0 == 0) goto L66
            r0.setAcceptThirdPartyCookies(r5, r1)
        L66:
            r5.setHorizontalScrollbarOverlay(r2)
            r5.setHorizontalScrollBarEnabled(r2)
            r5.setVerticalScrollbarOverlay(r2)
            r5.setVerticalScrollBarEnabled(r2)
            r5.setScrollBarStyle(r2)
            com.beizi.ad.internal.download.BeiZiWebView$1 r0 = new com.beizi.ad.internal.download.BeiZiWebView$1
            r0.<init>(r5)
            r5.setWebViewClient(r0)
            return
    }
}
