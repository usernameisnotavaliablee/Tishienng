package com.kwad.components.core.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.AdWebViewActivity.class)
@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdWebViewVideoActivityProxy extends com.kwad.components.core.proxy.i {
    public static final java.lang.String KEY_REPORTED = "key_reported";
    public static final java.lang.String KEY_TEMPLATE = "key_template_json";
    public static boolean showingAdWebViewVideoActivity;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private com.kwad.components.core.page.b mFragment;
    private android.app.Dialog mKsExitInterceptDialog;
    private com.kwad.sdk.widget.DownloadProgressBar mProgressbar;
    private com.kwad.components.core.page.splitLandingPage.a mSplitLandingPage;
    private com.kwad.components.core.b.a mTitleBarHelper;
    private android.view.ViewGroup mWebDownloadContainer;





    static {
            return
    }

    public AdWebViewVideoActivityProxy() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.sdk.widget.DownloadProgressBar access$000(com.kwad.components.core.page.AdWebViewVideoActivityProxy r0) {
            com.kwad.sdk.widget.DownloadProgressBar r0 = r0.mProgressbar
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate access$100(com.kwad.components.core.page.AdWebViewVideoActivityProxy r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.a.C0073a access$200(com.kwad.components.core.page.AdWebViewVideoActivityProxy r0, boolean r1) {
            com.kwad.components.core.e.d.a$a r0 = r0.getAdClickConfig(r1)
            return r0
    }

    static /* synthetic */ void access$301(com.kwad.components.core.page.AdWebViewVideoActivityProxy r0) {
            super.onBackPressed()
            return
    }

    private com.kwad.components.core.page.widget.a buildDialog() {
            r3 = this;
            com.kwad.components.core.page.widget.a r0 = new com.kwad.components.core.page.widget.a
            android.app.Activity r1 = r3.getActivity()
            com.kwad.components.core.page.AdWebViewVideoActivityProxy$4 r2 = new com.kwad.components.core.page.AdWebViewVideoActivityProxy$4
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    private com.kwad.components.core.e.d.a.C0073a getAdClickConfig(boolean r3) {
            r2 = this;
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.app.Activity r1 = r2.getActivity()
            r0.<init>(r1)
            com.kwad.components.core.e.d.a$a r3 = r0.aq(r3)
            r0 = 1
            com.kwad.components.core.e.d.a$a r3 = r3.av(r0)
            r0 = 0
            com.kwad.components.core.e.d.a$a r3 = r3.ar(r0)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r3.aB(r1)
            com.kwad.components.core.e.d.a$a r3 = r3.at(r0)
            return r3
    }

    private void initView() {
            r5 = this;
            int r0 = com.kwad.sdk.R.id.ksad_web_download_progress
            android.view.View r0 = r5.findViewById(r0)
            com.kwad.sdk.widget.DownloadProgressBar r0 = (com.kwad.sdk.widget.DownloadProgressBar) r0
            r5.mProgressbar = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_download_container
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.mWebDownloadContainer = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r0)
            r2 = 0
            if (r1 == 0) goto L3f
            android.view.ViewGroup r1 = r5.mWebDownloadContainer
            r1.setVisibility(r2)
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            com.kwad.components.core.page.AdWebViewVideoActivityProxy$1 r4 = new com.kwad.components.core.page.AdWebViewVideoActivityProxy$1
            r4.<init>(r5, r0)
            r1.<init>(r3, r4)
            r5.mApkDownloadHelper = r1
            com.kwad.sdk.widget.DownloadProgressBar r0 = r5.mProgressbar
            com.kwad.components.core.page.AdWebViewVideoActivityProxy$2 r1 = new com.kwad.components.core.page.AdWebViewVideoActivityProxy$2
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            goto L46
        L3f:
            android.view.ViewGroup r0 = r5.mWebDownloadContainer
            r1 = 8
            r0.setVisibility(r1)
        L46:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r0.adInfoList
            if (r0 == 0) goto L67
            int r0 = r0.size()
            if (r0 <= 0) goto L67
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r0.adInfoList
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L67
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r0)
            goto L69
        L67:
            java.lang.String r0 = "详情页面"
        L69:
            com.kwad.components.core.b.a r1 = new com.kwad.components.core.b.a
            int r3 = com.kwad.sdk.R.id.ksad_kwad_web_title_bar
            android.view.View r3 = r5.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1.<init>(r3)
            r5.mTitleBarHelper = r1
            com.kwad.components.core.page.AdWebViewVideoActivityProxy$3 r3 = new com.kwad.components.core.page.AdWebViewVideoActivityProxy$3
            r3.<init>(r5)
            r1.a(r3)
            com.kwad.components.core.b.a r1 = r5.mTitleBarHelper
            com.kwad.components.core.b.b r3 = new com.kwad.components.core.b.b
            r3.<init>(r0)
            r1.a(r3)
            android.app.Activity r0 = r5.getActivity()
            com.kwad.sdk.utils.aq.dh(r0)
            android.app.Activity r0 = r5.getActivity()
            r1 = 1
            com.kwad.components.core.t.d.a(r0, r2, r1)
            int r0 = com.kwad.sdk.R.id.ksad_recycler_container
            int r1 = com.kwad.sdk.core.config.e.EP()
            if (r1 == 0) goto Lc0
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.core.page.splitLandingPage.a r1 = com.kwad.components.core.page.splitLandingPage.a.aE(r1)
            r5.mSplitLandingPage = r1
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            r1.setApkDownloadHelper(r2)
            com.kwad.sdk.api.core.fragment.KsFragmentManager r1 = r5.getSupportFragmentManager()
            com.kwad.sdk.api.core.fragment.KsFragmentTransaction r1 = r1.beginTransaction()
            com.kwad.components.core.page.splitLandingPage.a r2 = r5.mSplitLandingPage
            com.kwad.sdk.api.core.fragment.KsFragmentTransaction r0 = r1.replace(r0, r2)
            r0.commitAllowingStateLoss()
            return
        Lc0:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.core.page.b r1 = com.kwad.components.core.page.b.aC(r1)
            r5.mFragment = r1
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            r1.setApkDownloadHelper(r2)
            com.kwad.sdk.api.core.fragment.KsFragmentManager r1 = r5.getSupportFragmentManager()
            com.kwad.sdk.api.core.fragment.KsFragmentTransaction r1 = r1.beginTransaction()
            com.kwad.components.core.page.b r2 = r5.mFragment
            com.kwad.sdk.api.core.fragment.KsFragmentTransaction r0 = r1.replace(r0, r2)
            r0.commitAllowingStateLoss()
            return
    }

    private boolean isFormAdExitInterceptEnable() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = com.kwad.sdk.core.config.e.Fy()
            r2 = 1
            if (r0 == 0) goto L14
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.mIsFromContent
            if (r0 == 0) goto L14
            return r2
        L14:
            boolean r0 = com.kwad.sdk.core.config.e.Fz()
            if (r0 == 0) goto L21
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.mIsFromContent
            if (r0 != 0) goto L21
            return r2
        L21:
            return r1
    }

    public static void launch(android.content.Context r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            if (r3 == 0) goto L32
            if (r4 != 0) goto L5
            goto L32
        L5:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.kwad.sdk.api.proxy.app.BaseFragmentActivity$FragmentActivity3> r1 = com.kwad.sdk.api.proxy.app.BaseFragmentActivity.FragmentActivity3.class
            r0.<init>(r3, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            org.json.JSONObject r1 = r4.toJson()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "key_template_json"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "key_reported"
            boolean r4 = r4.mPvReported
            r0.putExtra(r1, r4)
            r3.startActivity(r0)
            android.app.Activity r3 = com.kwad.sdk.o.m.ej(r3)
            if (r3 == 0) goto L32
            r4 = 0
            r3.overridePendingTransition(r4, r4)
        L32:
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.BaseFragmentActivity$FragmentActivity3> r0 = com.kwad.sdk.api.proxy.app.BaseFragmentActivity.FragmentActivity3.class
            java.lang.Class<com.kwad.components.core.page.AdWebViewVideoActivityProxy> r1 = com.kwad.components.core.page.AdWebViewVideoActivityProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    private void showDialog() {
            r3 = this;
            android.app.Dialog r0 = r3.mKsExitInterceptDialog
            if (r0 != 0) goto La
            com.kwad.components.core.page.widget.a r0 = r3.buildDialog()
            r3.mKsExitInterceptDialog = r0
        La:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 103(0x67, float:1.44E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)
            android.app.Dialog r0 = r3.mKsExitInterceptDialog
            r0.show()
            return
    }

    private void showWaitDialog() {
            r1 = this;
            boolean r0 = r1.isFormAdExitInterceptEnable()
            if (r0 == 0) goto La
            r1.showDialog()
            return
        La:
            r1.finish()
            return
    }

    @Override // com.kwad.components.core.proxy.i
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "AdWebViewVideoActivityProxy"
            return r0
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r1 = this;
            com.kwad.components.core.page.splitLandingPage.a r0 = r1.mSplitLandingPage
            if (r0 == 0) goto Lb
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lb
            return
        Lb:
            com.kwad.components.core.page.splitLandingPage.a r0 = r1.mSplitLandingPage
            if (r0 == 0) goto L12
            r0.rJ()
        L12:
            com.kwad.components.core.page.b r0 = r1.mFragment
            if (r0 == 0) goto L21
            boolean r0 = r0.onBackPressed()
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            super.onBackPressed()
            return
        L21:
            r1.showWaitDialog()
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)     // Catch: java.lang.Throwable -> L3e
            int r4 = com.kwad.sdk.R.layout.ksad_activity_ad_video_webview     // Catch: java.lang.Throwable -> L3e
            r3.setContentView(r4)     // Catch: java.lang.Throwable -> L3e
            r4 = 1
            com.kwad.components.core.page.AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity = r4     // Catch: java.lang.Throwable -> L3e
            android.content.Intent r4 = r3.getIntent()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "key_template_json"
            java.lang.String r4 = r4.getStringExtra(r0)     // Catch: java.lang.Throwable -> L25
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L25
            r0.parseJson(r1)     // Catch: java.lang.Throwable -> L25
            r3.mAdTemplate = r0     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)     // Catch: java.lang.Throwable -> L3e
        L29:
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L40
            android.content.Intent r0 = r3.getIntent()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "key_reported"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r4.mPvReported = r0     // Catch: java.lang.Throwable -> L3e
            r3.initView()     // Catch: java.lang.Throwable -> L3e
            goto L47
        L3e:
            r4 = move-exception
            goto L44
        L40:
            r3.finish()     // Catch: java.lang.Throwable -> L3e
            goto L47
        L44:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
        L47:
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r1 = this;
            android.app.Dialog r0 = r1.mKsExitInterceptDialog     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            boolean r0 = r0.isShowing()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            android.app.Dialog r0 = r1.mKsExitInterceptDialog     // Catch: java.lang.Throwable -> L10
            r0.dismiss()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = move-exception
            goto L20
        L12:
            super.onDestroy()     // Catch: java.lang.Throwable -> L10
            r0 = 0
            com.kwad.components.core.page.AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity = r0     // Catch: java.lang.Throwable -> L10
            com.kwad.components.core.e.d.c r0 = r1.mApkDownloadHelper     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L1f
            r0.clear()     // Catch: java.lang.Throwable -> L10
        L1f:
            return
        L20:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r1 = this;
            r0 = 0
            com.kwad.components.core.page.AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity = r0
            r1.overridePendingTransition(r0, r0)
            return
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onPreCreate(r2)
            android.content.Intent r2 = r1.getIntent()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "key_template"
            r2.removeExtra(r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.kwad.components.core.proxy.i, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r1 = this;
            super.onResume()
            r0 = 1
            com.kwad.components.core.page.AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity = r0
            return
    }
}
