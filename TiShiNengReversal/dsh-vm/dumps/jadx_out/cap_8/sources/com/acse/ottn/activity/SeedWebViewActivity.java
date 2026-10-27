package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SeedWebViewActivity extends com.acse.ottn.a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2104g = "SeedWebViewActivity";

    /* renamed from: e, reason: collision with root package name */
    public com.acse.ottn.widget.CustomWebView f2105e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.activity.SeedWebViewActivity.d f2106f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.SeedWebViewActivity a;

        public a(com.acse.ottn.activity.SeedWebViewActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.SeedWebViewActivity r1 = r0.a
                r1.finish()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.webkit.WebViewClient {
        public final /* synthetic */ com.acse.ottn.activity.SeedWebViewActivity a;

        public b(com.acse.ottn.activity.SeedWebViewActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r1, java.lang.String r2) {
                r0 = this;
                r1.loadUrl(r2)
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends android.widget.FrameLayout {
        public c(android.content.Context r2) {
                r1 = this;
                r1.<init>(r2)
                android.content.res.Resources r2 = r2.getResources()
                r0 = 17170444(0x106000c, float:2.4611947E-38)
                int r2 = r2.getColor(r0)
                r1.setBackgroundColor(r2)
                return
        }

        @Override // android.view.View
        public boolean onTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d extends android.webkit.WebChromeClient {
        public final /* synthetic */ com.acse.ottn.activity.SeedWebViewActivity a;

        public d(com.acse.ottn.activity.SeedWebViewActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ d(com.acse.ottn.activity.SeedWebViewActivity r1, com.acse.ottn.activity.SeedWebViewActivity.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView r1, int r2) {
                r0 = this;
                super.onProgressChanged(r1, r2)
                return
        }
    }

    static {
            r0 = 9584(0x2570, float:1.343E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public SeedWebViewActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = com.acse.ottn.activity.SeedWebViewActivity.f2104g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loadH5Url = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.widget.CustomWebView r0 = r7.f2105e     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            if (r0 != 0) goto L1c
            goto Lb6
        L1c:
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1 = 100
            r0.setTextZoom(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1 = 1
            r0.setJavaScriptEnabled(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setDomStorageEnabled(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setJavaScriptCanOpenWindowsAutomatically(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            android.webkit.WebSettings$PluginState r2 = android.webkit.WebSettings.PluginState.ON     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setPluginState(r2)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setAllowFileAccess(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setLoadWithOverviewMode(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setUseWideViewPort(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setSupportZoom(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r2 = 0
            r0.setMixedContentMode(r2)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.activity.SeedWebViewActivity$d r3 = new com.acse.ottn.activity.SeedWebViewActivity$d     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r4 = 0
            r3.<init>(r7, r4)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r7.f2106f = r3     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.widget.CustomWebView r4 = r7.f2105e     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r4.setWebChromeClient(r3)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r5[r2] = r6     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            if (r3 == 0) goto L71
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1[r2] = r4     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r3.invoke(r0, r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            goto L71
        L6d:
            r8 = move-exception
            goto L81
        L6f:
            r8 = move-exception
            goto L9c
        L71:
            com.acse.ottn.widget.CustomWebView r0 = r7.f2105e     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.activity.SeedWebViewActivity$b r1 = new com.acse.ottn.activity.SeedWebViewActivity$b     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.setWebViewClient(r1)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            com.acse.ottn.widget.CustomWebView r0 = r7.f2105e     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            r0.loadUrl(r8)     // Catch: java.lang.Exception -> L6d java.lang.IllegalArgumentException -> L6f
            return
        L81:
            java.lang.String r0 = com.acse.ottn.activity.SeedWebViewActivity.f2104g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception="
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.acse.ottn.h2.a(r0, r8)
            goto Lb6
        L9c:
            java.lang.String r0 = com.acse.ottn.activity.SeedWebViewActivity.f2104g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "IllegalArgumentException="
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.acse.ottn.h2.a(r0, r8)
        Lb6:
            return
    }

    @Override // com.acse.ottn.a0
    public native void onCreate(android.os.Bundle r1);
}
