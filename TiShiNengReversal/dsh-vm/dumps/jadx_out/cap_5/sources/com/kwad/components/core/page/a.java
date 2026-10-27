package com.kwad.components.core.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.components.core.proxy.i implements com.kwad.components.core.b.a.InterfaceC0062a, com.kwad.components.core.webview.jshandler.as.b {
    private boolean SZ;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    private com.kwad.components.core.b.a mTitleBarHelper;
    private com.kwad.components.core.playable.a rF;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.SZ = r0
            return
    }

    private void b(android.content.Intent r2) {
            r1 = this;
            java.lang.String r0 = "key_template_json"
            java.lang.String r2 = r2.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L2b
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            r1.mAdTemplate = r0     // Catch: java.lang.Exception -> L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r0.<init>(r2)     // Catch: java.lang.Exception -> L27
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate     // Catch: java.lang.Exception -> L27
            r2.parseJson(r0)     // Catch: java.lang.Exception -> L27
            com.kwad.components.core.e.d.c r2 = new com.kwad.components.core.e.d.c     // Catch: java.lang.Exception -> L27
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate     // Catch: java.lang.Exception -> L27
            r2.<init>(r0)     // Catch: java.lang.Exception -> L27
            r1.mApkDownloadHelper = r2     // Catch: java.lang.Exception -> L27
            return
        L27:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
        L2b:
            return
    }

    public static void launch(android.content.Context r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            java.lang.Class<com.kwad.components.core.page.a> r0 = com.kwad.components.core.page.a.class
            java.lang.Class<com.kwad.sdk.api.proxy.app.BaseFragmentActivity$FragmentActivity8> r1 = com.kwad.sdk.api.proxy.app.BaseFragmentActivity.FragmentActivity8.class
            com.kwad.sdk.service.c.a(r1, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            org.json.JSONObject r3 = r3.toJson()
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "key_template_json"
            r0.putExtra(r1, r3)
            r2.startActivity(r0)
            return
    }

    private void qM() {
            r3 = this;
            com.kwad.components.core.b.a r0 = new com.kwad.components.core.b.a
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r3.mRootContainer
            r0.<init>(r1)
            r3.mTitleBarHelper = r0
            r0.a(r3)
            com.kwad.components.core.b.a r0 = r3.mTitleBarHelper
            com.kwad.components.core.b.b r1 = new com.kwad.components.core.b.b
            java.lang.String r2 = ""
            r1.<init>(r2)
            r0.a(r1)
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.BaseFragmentActivity$FragmentActivity8> r0 = com.kwad.sdk.api.proxy.app.BaseFragmentActivity.FragmentActivity8.class
            java.lang.Class<com.kwad.components.core.page.a> r1 = com.kwad.components.core.page.a.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    @Override // com.kwad.components.core.webview.jshandler.as.b
    public final void a(com.kwad.components.core.webview.jshandler.as.a r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updatePageStatus status: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdPlayableActivityProxy"
            com.kwad.sdk.core.d.c.d(r1, r0)
            int r3 = r3.status
            r0 = 1
            if (r3 != r0) goto L21
            com.kwad.components.core.playable.a r3 = r2.rF
            if (r3 == 0) goto L21
            com.kwad.components.core.playable.PlayableSource r0 = com.kwad.components.core.playable.PlayableSource.UNKNOWN_TRYPLAY_ENTRY_SOURCE
            r3.e(r0)
        L21:
            return
    }

    @Override // com.kwad.components.core.proxy.i
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "AdPlayableActivityProxy"
            return r0
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)     // Catch: java.lang.Throwable -> L48
            android.app.Activity r4 = r3.getActivity()     // Catch: java.lang.Throwable -> L48
            int r0 = com.kwad.sdk.R.style.Theme_AppCompat_Light_NoActionBar     // Catch: java.lang.Throwable -> L48
            r4.setTheme(r0)     // Catch: java.lang.Throwable -> L48
            int r4 = com.kwad.sdk.R.layout.ksad_activity_playable     // Catch: java.lang.Throwable -> L48
            r3.setContentView(r4)     // Catch: java.lang.Throwable -> L48
            android.content.Intent r4 = r3.getIntent()     // Catch: java.lang.Throwable -> L48
            r3.b(r4)     // Catch: java.lang.Throwable -> L48
            int r4 = com.kwad.sdk.R.id.ksad_playable_activity_root     // Catch: java.lang.Throwable -> L48
            android.view.View r4 = r3.findViewById(r4)     // Catch: java.lang.Throwable -> L48
            com.kwad.sdk.core.view.AdBaseFrameLayout r4 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r4     // Catch: java.lang.Throwable -> L48
            r3.mRootContainer = r4     // Catch: java.lang.Throwable -> L48
            int r4 = com.kwad.sdk.R.id.ksad_playable_webview     // Catch: java.lang.Throwable -> L48
            android.view.View r4 = r3.findViewById(r4)     // Catch: java.lang.Throwable -> L48
            com.kwad.sdk.core.webview.KsAdWebView r4 = (com.kwad.sdk.core.webview.KsAdWebView) r4     // Catch: java.lang.Throwable -> L48
            r3.qM()     // Catch: java.lang.Throwable -> L48
            com.kwad.components.core.playable.a r0 = new com.kwad.components.core.playable.a     // Catch: java.lang.Throwable -> L48
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r3.rF = r0     // Catch: java.lang.Throwable -> L48
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L48
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r3.mRootContainer     // Catch: java.lang.Throwable -> L48
            com.kwad.components.core.e.d.c r2 = r3.mApkDownloadHelper     // Catch: java.lang.Throwable -> L48
            r0.a(r4, r1, r2)     // Catch: java.lang.Throwable -> L48
            com.kwad.components.core.playable.a r4 = r3.rF     // Catch: java.lang.Throwable -> L48
            r4.a(r3)     // Catch: java.lang.Throwable -> L48
            com.kwad.components.core.playable.a r4 = r3.rF     // Catch: java.lang.Throwable -> L48
            r4.rR()     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r4 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r1 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> L9
            com.kwad.components.core.playable.a r0 = r1.rF     // Catch: java.lang.Throwable -> L9
            r0.b(r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r0 = this;
            super.onPause()
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onRestart() {
            r0 = this;
            super.onRestart()
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r0 = this;
            super.onResume()
            return
    }

    @Override // com.kwad.components.core.b.a.InterfaceC0062a
    public final void x(android.view.View r1) {
            r0 = this;
            r0.onBackPressed()
            return
    }

    @Override // com.kwad.components.core.b.a.InterfaceC0062a
    public final void y(android.view.View r3) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r1 = 6
            com.kwad.sdk.core.adlog.c.b r0 = r0.de(r1)
            r1 = 0
            com.kwad.sdk.core.adlog.c.b(r3, r0, r1)
            r2.finish()
            return
    }
}
