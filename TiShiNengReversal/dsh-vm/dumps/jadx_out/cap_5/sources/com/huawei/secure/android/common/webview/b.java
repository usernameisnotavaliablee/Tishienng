package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.webkit.WebSettings r1) {
            r0 = 0
            r1.setAllowContentAccess(r0)
            return
    }

    public static void b(android.webkit.WebSettings r1) {
            r0 = 0
            r1.setAllowFileAccess(r0)
            r1.setAllowFileAccessFromFileURLs(r0)
            r1.setAllowUniversalAccessFromFileURLs(r0)
            return
    }

    public static void c(android.webkit.WebSettings r1) {
            r0 = 0
            r1.setGeolocationEnabled(r0)
            return
    }

    public static void d(android.webkit.WebSettings r1) {
            r0 = 1
            r1.setMixedContentMode(r0)
            return
    }

    public static void e(android.webkit.WebSettings r0) {
            return
    }

    public static void f(android.webkit.WebView r1) {
            android.webkit.WebSettings r0 = r1.getSettings()
            b(r0)
            g(r1)
            e(r0)
            c(r0)
            d(r0)
            a(r0)
            return
    }

    public static void g(android.webkit.WebView r1) {
            java.lang.String r0 = "searchBoxJavaBridge_"
            r1.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibility"
            r1.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibilityTraversal"
            r1.removeJavascriptInterface(r0)
            return
    }
}
