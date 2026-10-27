package com.kwad.components.core.s.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.FeedDownloadActivity.class)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.components.core.m.b<com.kwad.components.core.s.a.b> {
    private static final java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>> Ym = null;
    private static final java.util.concurrent.atomic.AtomicInteger Yn = null;
    private com.kwad.components.offline.api.tk.model.StyleTemplate Yf;
    private java.lang.String Yg;
    private boolean Yh;
    private com.kwad.sdk.components.n Yi;
    private com.kwad.components.core.webview.tachikoma.k Yj;
    private com.kwad.components.core.s.b.b Yk;
    private int Yl;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;
    private com.kwad.components.core.b.a mTitleBarHelper;


    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.kwad.components.core.s.a.a.Ym = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.kwad.components.core.s.a.a.Yn = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(int r2, java.lang.String r3, java.lang.Object r4) {
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>> r0 = com.kwad.components.core.s.a.a.Ym
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L1a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r1)
        L1a:
            r1.put(r3, r4)
            return
    }

    private java.lang.Object aF(java.lang.String r2) {
            r1 = this;
            int r0 = r1.Yl
            java.lang.Object r2 = o(r0, r2)
            return r2
    }

    private static void aZ(int r1) {
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>> r0 = com.kwad.components.core.s.a.a.Ym
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L11
            r1.clear()
        L11:
            return
    }

    private static java.lang.Object o(int r1, java.lang.String r2) {
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.Map<java.lang.String, java.lang.Object>> r0 = com.kwad.components.core.s.a.a.Ym
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.get(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.FeedDownloadActivity> r0 = com.kwad.sdk.api.proxy.app.FeedDownloadActivity.class
            java.lang.Class<com.kwad.components.core.s.a.a> r1 = com.kwad.components.core.s.a.a.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    private com.kwad.components.core.s.a.b sO() {
            r2 = this;
            com.kwad.components.core.s.a.b r0 = new com.kwad.components.core.s.a.b
            r0.<init>(r2)
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.a(r1)
            com.kwad.components.offline.api.tk.model.StyleTemplate r1 = r2.Yf
            r0.Yf = r1
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r2.mRootContainer
            r0.mRootContainer = r1
            com.kwad.sdk.components.n r1 = r2.Yi
            r0.Yi = r1
            com.kwad.components.core.webview.tachikoma.k r1 = r2.Yj
            r0.Yj = r1
            return r0
    }

    public static int sP() {
            java.util.concurrent.atomic.AtomicInteger r0 = com.kwad.components.core.s.a.a.Yn
            int r0 = r0.incrementAndGet()
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r5) {
            r4 = this;
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "tk_id"
            r1 = 0
            int r5 = r5.getIntExtra(r0, r1)
            r4.Yl = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "tk_style_template"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.String r0 = "tk_view_holder"
            java.lang.Object r0 = r4.aF(r0)
            com.kwad.components.core.webview.tachikoma.k r0 = (com.kwad.components.core.webview.tachikoma.k) r0
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L28
            if (r0 != 0) goto L28
            return r1
        L28:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L43
            com.kwad.components.offline.api.tk.model.StyleTemplate r2 = new com.kwad.components.offline.api.tk.model.StyleTemplate     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            r2.parseJson(r3)     // Catch: java.lang.Throwable -> L3e
            r4.Yf = r2     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r5 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r5)
            return r1
        L43:
            if (r0 == 0) goto L47
            r4.Yj = r0
        L47:
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "ad_result_cache_idx"
            int r5 = r5.getIntExtra(r0, r1)
            com.kwad.components.core.c.f r0 = com.kwad.components.core.c.f.ol()
            r2 = 1
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.d(r5, r2)
            r4.mAdResultData = r0
            if (r5 <= 0) goto L61
            if (r0 != 0) goto L61
            return r1
        L61:
            return r2
    }

    @Override // com.kwad.components.core.proxy.f
    public int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_tk_page
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "TKActivityProxy"
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void initData() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "show_navigationBar"
            r2 = 1
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r3.Yh = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "title"
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.Yg = r0
            java.lang.String r0 = "native_intent"
            java.lang.Object r0 = r3.aF(r0)
            com.kwad.sdk.components.n r0 = (com.kwad.sdk.components.n) r0
            r3.Yi = r0
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void initView() {
            r4 = this;
            int r0 = com.kwad.sdk.R.id.ksad_tk_root_container
            android.view.View r0 = r4.findViewById(r0)
            com.kwad.sdk.core.view.AdBaseFrameLayout r0 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r0
            r4.mRootContainer = r0
            int r0 = com.kwad.sdk.R.id.ksad_js_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            boolean r1 = r4.Yh
            r2 = 0
            if (r1 != 0) goto L24
            if (r0 == 0) goto L24
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.topMargin = r2
            r0.setLayoutParams(r1)
        L24:
            com.kwad.components.core.b.a r0 = new com.kwad.components.core.b.a
            int r1 = com.kwad.sdk.R.id.ksad_kwad_web_title_bar
            android.view.View r1 = r4.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.<init>(r1)
            r4.mTitleBarHelper = r0
            com.kwad.components.core.s.a.a$1 r1 = new com.kwad.components.core.s.a.a$1
            r1.<init>(r4)
            r0.a(r1)
            com.kwad.components.core.b.a r0 = r4.mTitleBarHelper
            com.kwad.components.core.b.b r1 = new com.kwad.components.core.b.b
            java.lang.String r3 = r4.Yg
            r1.<init>(r3)
            r0.a(r1)
            com.kwad.components.core.b.a r0 = r4.mTitleBarHelper
            r0.aj(r2)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r1 = this;
            com.kwad.components.core.s.b.b r0 = r1.Yk
            if (r0 == 0) goto Lb
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lb
            return
        Lb:
            super.onBackPressed()
            return
    }

    @Override // com.kwad.components.core.m.b
    public /* synthetic */ com.kwad.components.core.s.a.b onCreateCallerContext() {
            r1 = this;
            com.kwad.components.core.s.a.b r0 = r1.sO()
            return r0
    }

    @Override // com.kwad.components.core.m.b
    public com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r1 = this;
            com.kwad.components.offline.api.tk.model.StyleTemplate r0 = r1.Yf
            if (r0 == 0) goto La
            com.kwad.components.core.s.b.a r0 = new com.kwad.components.core.s.b.a
            r0.<init>()
            return r0
        La:
            com.kwad.components.core.s.b.b r0 = r1.Yk
            if (r0 != 0) goto L15
            com.kwad.components.core.s.b.b r0 = new com.kwad.components.core.s.b.b
            r0.<init>()
            r1.Yk = r0
        L15:
            com.kwad.components.core.s.b.b r0 = r1.Yk
            return r0
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r1 = this;
            super.onDestroy()     // Catch: java.lang.Throwable -> L9
            int r0 = r1.Yl     // Catch: java.lang.Throwable -> L9
            aZ(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r0 = this;
            super.onPause()
            return
    }

    @Override // com.kwad.components.core.m.b, com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r0 = this;
            super.onResume()
            return
    }
}
