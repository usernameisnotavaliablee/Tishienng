package com.tencent.open.web;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(android.webkit.WebSettings r2) {
            r0 = 0
            r2.setSavePassword(r0)     // Catch: java.lang.Exception -> Le
            r2.setAllowFileAccess(r0)     // Catch: java.lang.Exception -> Le
            r2.setAllowFileAccessFromFileURLs(r0)     // Catch: java.lang.Exception -> Le
            r2.setAllowUniversalAccessFromFileURLs(r0)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r2 = move-exception
            java.lang.String r0 = "WebViewUtils"
            java.lang.String r1 = "Exception"
            com.tencent.open.log.SLog.e(r0, r1, r2)
            return
    }

    public static void a(android.webkit.WebView r0) {
            if (r0 != 0) goto L3
            goto L12
        L3:
            b(r0)
            android.webkit.WebSettings r0 = r0.getSettings()
            if (r0 == 0) goto L12
            a(r0)
            b(r0)
        L12:
            return
    }

    private static void b(android.webkit.WebSettings r1) {
            r0 = 1
            r1.setJavaScriptEnabled(r0)
            return
    }

    private static void b(android.webkit.WebView r1) {
            java.lang.String r0 = "searchBoxJavaBridge_"
            r1.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibility"
            r1.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibilityTraversal"
            r1.removeJavascriptInterface(r0)
            return
    }
}
