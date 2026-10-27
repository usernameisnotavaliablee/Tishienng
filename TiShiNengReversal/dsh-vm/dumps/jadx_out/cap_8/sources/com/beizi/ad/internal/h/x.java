package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x {
    public x() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    public static void a(android.webkit.WebView r4) {
            if (r4 != 0) goto L4
            goto L95
        L4:
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r1 = 0
            r0.setBuiltInZoomControls(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r2 = 1
            r0.setSupportZoom(r2)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r0.setUseWideViewPort(r2)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r0.setJavaScriptEnabled(r2)     // Catch: java.lang.Throwable -> L95
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setMixedContentMode(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setDomStorageEnabled(r2)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setMediaPlaybackRequiresUserGesture(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setAllowFileAccess(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setAllowContentAccess(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setSavePassword(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setAllowFileAccessFromFileURLs(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setAllowUniversalAccessFromFileURLs(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L65
            r3.setAcceptThirdPartyCookies(r4, r2)     // Catch: java.lang.Throwable -> L95
        L65:
            r3 = 33
            if (r0 > r3) goto L83
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L95
            java.io.File r0 = r0.getCacheDir()     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r3 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r3.setAppCachePath(r0)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r0.setAppCacheEnabled(r2)     // Catch: java.lang.Throwable -> L95
        L83:
            android.webkit.WebSettings r0 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r2 = -1
            r0.setCacheMode(r2)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebView.setWebContentsDebuggingEnabled(r1)     // Catch: java.lang.Throwable -> L95
            android.webkit.WebSettings r4 = r4.getSettings()     // Catch: java.lang.Throwable -> L95
            r4.setGeolocationEnabled(r1)     // Catch: java.lang.Throwable -> L95
        L95:
            return
    }

    public static void b(android.webkit.WebView r3) {
            if (r3 != 0) goto L3
            goto Lf
        L3:
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r1 = "onResume"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> Lf
            r0.invoke(r3, r2)     // Catch: java.lang.Exception -> Lf
        Lf:
            return
    }

    public static void c(android.webkit.WebView r3) {
            if (r3 != 0) goto L3
            goto Lf
        L3:
            java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
            java.lang.String r1 = "onPause"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> Lf
            r0.invoke(r3, r2)     // Catch: java.lang.Exception -> Lf
        Lf:
            return
    }
}
