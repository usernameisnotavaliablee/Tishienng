package com.tencent.open.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends android.webkit.WebView {
    public b(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.a()
            return
    }

    protected void a() {
            r2 = this;
            java.lang.String r0 = "searchBoxJavaBridge_"
            r2.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibility"
            r2.removeJavascriptInterface(r0)
            java.lang.String r0 = "accessibilityTraversal"
            r2.removeJavascriptInterface(r0)
            java.lang.String r0 = "openSDK_LOG.OpenWebView"
            java.lang.String r1 = "removeJSInterface"
            com.tencent.open.log.SLog.i(r0, r1)
            return
    }

    @Override // android.webkit.WebView
    public void destroy() {
            r4 = this;
            java.lang.String r0 = "-->OpenWebView.destroy setBuiltInZoomControls"
            java.lang.String r1 = "openSDK_LOG.OpenWebView"
            android.webkit.WebSettings r2 = r4.getSettings()     // Catch: java.lang.Exception -> L1d
            r3 = 1
            r2.setBuiltInZoomControls(r3)     // Catch: java.lang.Exception -> L1d
            android.webkit.WebSettings r2 = r4.getSettings()     // Catch: java.lang.Exception -> L1d
            r3 = 0
            r2.setDisplayZoomControls(r3)     // Catch: java.lang.Exception -> L1d
            r2 = 8
            r4.setVisibility(r2)     // Catch: java.lang.Exception -> L1d
            com.tencent.open.log.SLog.i(r1, r0)     // Catch: java.lang.Exception -> L1d
            goto L21
        L1d:
            r2 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r2)
        L21:
            super.destroy()
            return
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r7 = this;
            java.lang.String r0 = "openSDK_LOG.OpenWebView"
            super.onAttachedToWindow()
            android.webkit.WebSettings r1 = r7.getSettings()
            if (r1 != 0) goto Lc
            goto L46
        Lc:
            r2 = 0
            r1.setSavePassword(r2)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r3 = "removeJavascriptInterface"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L44
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L46
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "searchBoxJavaBridge_"
            r3[r2] = r5     // Catch: java.lang.Exception -> L44
            r1.invoke(r7, r3)     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L44
            java.lang.String r5 = "accessibility"
            r3[r2] = r5     // Catch: java.lang.Exception -> L44
            r1.invoke(r7, r3)     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = "accessibilityTraversal"
            r3[r2] = r4     // Catch: java.lang.Exception -> L44
            r1.invoke(r7, r3)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "remove js interface"
            com.tencent.open.log.SLog.i(r0, r1)     // Catch: java.lang.Exception -> L44
            return
        L44:
            r1 = move-exception
            goto L47
        L46:
            return
        L47:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remove js interface.e:"
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.open.log.SLog.e(r0, r1)
            return
    }
}
