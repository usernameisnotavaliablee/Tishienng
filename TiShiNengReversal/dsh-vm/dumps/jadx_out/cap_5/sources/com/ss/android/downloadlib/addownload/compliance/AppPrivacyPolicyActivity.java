package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AppPrivacyPolicyActivity extends android.app.Activity {
    private android.widget.ImageView a;
    private android.webkit.WebView b;
    private long c;
    private long d;
    private java.lang.String e;

    class a implements android.view.View.OnClickListener {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity a;

        a(com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity r3 = r2.a
                long r0 = com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.a(r3)
                java.lang.String r3 = "lp_app_privacy_click_close"
                com.ss.android.downloadlib.addownload.compliance.a.c(r3, r0)
                com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity r3 = r2.a
                r3.finish()
                return
        }
    }

    class b extends android.webkit.WebViewClient {
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity a;

        b(com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        private boolean a(android.net.Uri r2) {
                r1 = this;
                java.lang.String r2 = r2.getScheme()
                java.lang.String r0 = "http"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L17
                java.lang.String r0 = "https"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L15
                goto L17
            L15:
                r2 = 1
                return r2
            L17:
                r2 = 0
                return r2
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView r3, android.webkit.RenderProcessGoneDetail r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 >= r1) goto Lb
                boolean r3 = super.onRenderProcessGone(r3, r4)
                return r3
            Lb:
                boolean r4 = com.bytedance.sdk.openadsdk.core.live.a.a(r4)
                r0 = 1
                if (r4 != 0) goto L26
                java.lang.String r4 = "System killed the WebView rendering process to reclaim memory. Recreating..."
                com.ss.android.downloadlib.a.k.b(r4)
                if (r3 == 0) goto L25
                android.view.ViewParent r4 = r3.getParent()
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r4.removeView(r3)
                r3.destroy()
            L25:
                return r0
            L26:
                java.lang.String r4 = "The WebView rendering process crashed!"
                com.ss.android.downloadlib.a.k.b(r4)
                if (r3 == 0) goto L39
                android.view.ViewParent r4 = r3.getParent()
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r4.removeView(r3)
                r3.destroy()
            L39:
                return r0
        }

        @Override // android.webkit.WebViewClient
        @android.annotation.TargetApi(21)
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r1, android.webkit.WebResourceRequest r2) {
                r0 = this;
                android.net.Uri r1 = r2.getUrl()
                boolean r1 = r0.a(r1)
                return r1
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r1, java.lang.String r2) {
                r0 = this;
                android.net.Uri r1 = android.net.Uri.parse(r2)
                boolean r1 = r0.a(r1)
                return r1
        }
    }

    static {
            r0 = 41293(0xa14d, float:5.7864E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public AppPrivacyPolicyActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity r2) {
            long r0 = r2.d
            return r0
    }

    public static void b(android.app.Activity r2, long r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity> r1 = com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.class
            r0.<init>(r2, r1)
            java.lang.String r1 = "app_info_id"
            r0.putExtra(r1, r3)
            r2.startActivity(r0)
            return
    }

    private void c(android.webkit.WebView r2) {
            r1 = this;
            java.lang.String r0 = "searchBoxJavaBridge_"
            r2.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "accessibility"
            r2.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "accessibilityTraversal"
            r2.removeJavascriptInterface(r0)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private boolean d() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "app_info_id"
            r2 = 0
            long r0 = r0.getLongExtra(r1, r2)
            r4.c = r0
            com.ss.android.downloadlib.addownload.compliance.cw r0 = com.ss.android.downloadlib.addownload.compliance.cw.j()
            long r1 = r4.c
            com.ss.android.downloadlib.addownload.o$j r0 = r0.j(r1)
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            long r1 = r0.b
            r4.d = r1
            java.lang.String r0 = r0.i
            r4.e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L38
            org.json.JSONObject r0 = com.ss.android.downloadlib.addownload.m.f()
            java.lang.String r1 = "ad_privacy_backup_url"
            java.lang.String r2 = "https://sf6-ttcdn-tos.pstatp.com/obj/ad-tetris-site/personal-privacy-page.html"
            java.lang.String r0 = r0.optString(r1, r2)
            r4.e = r0
        L38:
            r0 = 1
            return r0
    }

    private void e() {
            r3 = this;
            int r0 = com.bytedance.gromore.R.id.iv_privacy_back
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.a = r0
            int r0 = com.bytedance.gromore.R.id.privacy_webview
            android.view.View r0 = r3.findViewById(r0)
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r3.b = r0
            android.widget.ImageView r0 = r3.a
            com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity$a r1 = new com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity$a
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            android.webkit.WebView r0 = r3.b
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 16
            r0.setDefaultFontSize(r1)
            r1 = -1
            r0.setCacheMode(r1)
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setDomStorageEnabled(r1)
            r2 = 0
            r0.setMixedContentMode(r2)
            r0.setLoadWithOverviewMode(r1)
            r0.setUseWideViewPort(r1)
            r0.setSupportZoom(r1)
            r0.setBuiltInZoomControls(r1)
            r0.setDisplayZoomControls(r2)
            r0.setSavePassword(r2)
            r0.setAllowFileAccess(r2)
            android.webkit.WebView r0 = r3.b
            com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity$b r1 = new com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity$b
            r1.<init>(r3)
            r0.setWebViewClient(r1)
            android.webkit.WebView r0 = r3.b
            r3.c(r0)
            android.webkit.WebView r0 = r3.b
            r0.setScrollBarStyle(r2)
            android.webkit.WebView r0 = r3.b
            java.lang.String r1 = r3.e
            r0.loadUrl(r1)
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r3 = this;
            java.lang.String r0 = "lp_app_privacy_click_close"
            long r1 = r3.d
            com.ss.android.downloadlib.addownload.compliance.a.c(r0, r1)
            super.onBackPressed()
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
