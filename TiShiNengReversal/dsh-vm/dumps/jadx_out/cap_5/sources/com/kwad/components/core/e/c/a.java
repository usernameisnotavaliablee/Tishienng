package com.kwad.components.core.e.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.widget.KSFrameLayout {
    private final com.kwad.components.core.e.c.b OG;
    private final com.kwad.components.core.e.c.b.C0072b OH;
    private com.kwad.components.core.e.c.d OI;
    private com.kwad.components.core.e.c.a.InterfaceC0071a OJ;
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private final android.content.Context mContext;
    private com.kwad.sdk.mvp.Presenter mPresenter;
    private final com.kwad.sdk.core.view.AdBaseFrameLayout mRootContainer;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.e.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0071a {
        void oV();
    }

    public a(android.content.Context r1, com.kwad.components.core.e.c.b r2, com.kwad.components.core.e.c.b.C0072b r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r1
            r0.OG = r2
            r0.OH = r3
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.adTemplate
            r0.mAdTemplate = r2
            int r2 = com.kwad.sdk.R.layout.ksad_download_dialog_layout
            com.kwad.sdk.o.m.inflate(r1, r2, r0)
            int r1 = com.kwad.sdk.R.id.ksad_root_container
            android.view.View r1 = r0.findViewById(r1)
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = (com.kwad.sdk.core.view.AdBaseFrameLayout) r1
            r0.mRootContainer = r1
            java.lang.String r2 = "rootView is null"
            r0.b(r1, r2)
            int r2 = com.kwad.sdk.R.id.ksad_download_tips_web_card_webView
            android.view.View r1 = r1.findViewById(r2)
            com.kwad.sdk.core.webview.KsAdWebView r1 = (com.kwad.sdk.core.webview.KsAdWebView) r1
            java.lang.String r2 = "webView is null"
            r0.b(r1, r2)
            return
    }

    private void b(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3
            return
        L3:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "inflateView fail "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "\n--viewCount:"
            r0.append(r4)
            int r4 = r2.getChildCount()
            r0.append(r4)
            java.lang.String r4 = "\n--context:"
            r0.append(r4)
            android.content.Context r4 = r2.mContext
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "\n--LayoutInflater context: "
            r0.append(r4)
            android.content.Context r4 = r2.mContext
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            android.content.Context r4 = r4.getContext()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "\n--classloader:"
            r0.append(r4)
            java.lang.Class<com.kwad.components.core.e.c.a> r4 = com.kwad.components.core.e.c.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private static com.kwad.sdk.mvp.Presenter bD() {
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.core.e.c.e r1 = new com.kwad.components.core.e.c.e
            r1.<init>()
            r0.a(r1)
            return r0
    }

    private com.kwad.components.core.e.c.d oU() {
            r3 = this;
            com.kwad.components.core.e.c.d r0 = new com.kwad.components.core.e.c.d
            r0.<init>()
            com.kwad.components.core.e.c.b r1 = r3.OG
            r0.OG = r1
            com.kwad.components.core.e.c.b$b r1 = r3.OH
            r0.OH = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.sdk.core.view.AdBaseFrameLayout r2 = r3.mRootContainer
            r0.mRootContainer = r2
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r1)
            if (r1 == 0) goto L28
            com.kwad.components.core.e.d.c r1 = new com.kwad.components.core.e.d.c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r1.<init>(r2)
            r0.mApkDownloadHelper = r1
        L28:
            return r0
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r2 = this;
            super.aa()
            com.kwad.components.core.e.c.d r0 = r2.oU()
            r2.OI = r0
            com.kwad.sdk.mvp.Presenter r0 = bD()
            r2.mPresenter = r0
            com.kwad.sdk.core.view.AdBaseFrameLayout r1 = r2.mRootContainer
            r0.K(r1)
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            com.kwad.components.core.e.c.d r1 = r2.OI
            r0.n(r1)
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r1 = this;
            super.ab()
            com.kwad.components.core.e.c.d r0 = r1.OI
            if (r0 == 0) goto La
            r0.release()
        La:
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter
            if (r0 == 0) goto L11
            r0.destroy()
        L11:
            return
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            com.kwad.components.core.e.c.a$a r1 = r0.OJ
            if (r1 == 0) goto La
            r1.oV()
        La:
            return
    }

    public final void setChangeListener(com.kwad.components.core.e.c.a.InterfaceC0071a r1) {
            r0 = this;
            r0.OJ = r1
            return
    }
}
