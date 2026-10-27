package com.kwad.components.core.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.components.core.m.c<com.kwad.components.core.page.c.a.b> {
    private com.kwad.components.core.page.AdWebViewActivityProxy.a Tu;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.core.webview.KsAdWebView mAdWebView;
    private boolean mAutoShow;
    private android.content.Context mContext;
    private com.kwad.components.core.page.a.a mLandPageViewListener;
    private java.lang.String mPageTitle;
    private java.lang.String mPageUrl;
    private boolean mShowPermission;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;

    private c(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.kwad.components.core.page.c a(android.content.Context r1, com.kwad.components.core.page.AdWebViewActivityProxy.a r2) {
            com.kwad.components.core.page.c r0 = new com.kwad.components.core.page.c
            r0.<init>(r1)
            r0.b(r1, r2)
            return r0
    }

    private void b(android.content.Context r1, com.kwad.components.core.page.AdWebViewActivityProxy.a r2) {
            r0 = this;
            r0.Tu = r2
            r0.mContext = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.getAdTemplate()
            r0.mAdTemplate = r1
            java.lang.String r1 = r2.qR()
            r0.mPageUrl = r1
            java.lang.String r1 = r2.qQ()
            r0.mPageTitle = r1
            boolean r1 = r2.qT()
            r0.mShowPermission = r1
            boolean r1 = r2.qV()
            r0.mAutoShow = r1
            return
    }

    private com.kwad.components.core.page.c.a.b qX() {
            r2 = this;
            com.kwad.components.core.page.c.a.b r0 = new com.kwad.components.core.page.c.a.b
            r0.<init>()
            android.content.Context r1 = r2.mContext
            r0.mContext = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.components.core.page.AdWebViewActivityProxy$a r1 = r2.Tu
            r0.Tu = r1
            java.lang.String r1 = r2.mPageTitle
            r0.mPageTitle = r1
            java.lang.String r1 = r2.mPageUrl
            r0.mPageUrl = r1
            boolean r1 = r2.mAutoShow
            r0.mAutoShow = r1
            boolean r1 = r2.mShowPermission
            r0.mShowPermission = r1
            com.kwad.components.core.page.a.a r1 = r2.mLandPageViewListener
            r0.TK = r1
            com.kwad.sdk.core.webview.d.a.b r1 = r2.mWebCardCloseListener
            r0.setWebCardCloseListener(r1)
            android.view.ViewGroup r1 = r2.nY
            r0.jI = r1
            return r0
    }

    @Override // com.kwad.components.core.m.c, com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r1 = this;
            super.ab()
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.mAdWebView
            if (r0 == 0) goto Ld
            r0.release()
            r0 = 0
            r1.mAdWebView = r0
        Ld:
            return
    }

    @Override // com.kwad.components.core.m.c
    public final void ak() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_video_webview
            android.view.View r0 = r1.findViewById(r0)
            com.kwad.sdk.core.webview.KsAdWebView r0 = (com.kwad.sdk.core.webview.KsAdWebView) r0
            r1.mAdWebView = r0
            return
    }

    @Override // com.kwad.components.core.m.c
    public final /* synthetic */ com.kwad.components.core.page.c.a.b al() {
            r1 = this;
            com.kwad.components.core.page.c.a.b r0 = r1.qX()
            return r0
    }

    public final boolean getCanInterceptBackClick() {
            r1 = this;
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter
            java.lang.Object r0 = r0.NN()
            com.kwad.components.core.page.c.a.b r0 = (com.kwad.components.core.page.c.a.b) r0
            boolean r0 = r0.re()
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final int getLayoutId() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_activity_ad_webview
            return r0
    }

    @Override // com.kwad.components.core.m.c
    public final void initData() {
            r0 = this;
            return
    }

    @Override // com.kwad.components.core.m.c
    @androidx.annotation.NonNull
    public final com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            r3 = this;
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.core.page.c.a.f r1 = new com.kwad.components.core.page.c.a.f
            r1.<init>()
            r0.a(r1)
            com.kwad.components.core.page.c.a.e r1 = new com.kwad.components.core.page.c.a.e
            r1.<init>()
            r0.a(r1)
            T extends com.kwad.sdk.mvp.a r1 = r3.Rv
            com.kwad.components.core.page.c.a.b r1 = (com.kwad.components.core.page.c.a.b) r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.e.O(r1)
            if (r1 == 0) goto L29
            com.kwad.components.core.page.c.a.c r1 = new com.kwad.components.core.page.c.a.c
            r1.<init>()
            r0.a(r1)
        L29:
            T extends com.kwad.sdk.mvp.a r1 = r3.Rv
            com.kwad.components.core.page.c.a.b r1 = (com.kwad.components.core.page.c.a.b) r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.aO(r1)
            if (r1 == 0) goto L56
            com.kwad.components.core.r.a r1 = com.kwad.components.core.r.a.sF()
            boolean r1 = r1.sL()
            if (r1 == 0) goto L56
            com.kwad.components.core.r.a r1 = com.kwad.components.core.r.a.sF()
            int r1 = r1.sG()
            r2 = 1
            if (r1 != r2) goto L56
            com.kwad.components.core.page.c.a.d r1 = new com.kwad.components.core.page.c.a.d
            r1.<init>()
            r0.a(r1)
        L56:
            com.kwad.components.core.page.c.a.g r1 = new com.kwad.components.core.page.c.a.g
            r1.<init>()
            r0.a(r1)
            return r0
    }

    public final void qY() {
            r1 = this;
            com.kwad.sdk.mvp.Presenter r0 = r1.mPresenter
            java.lang.Object r0 = r0.NN()
            com.kwad.components.core.page.c.a.b r0 = (com.kwad.components.core.page.c.a.b) r0
            r0.qY()
            return
    }

    public final void setLandPageViewListener(com.kwad.components.core.page.a.a r1) {
            r0 = this;
            r0.mLandPageViewListener = r1
            return
    }

    public final void setWebCardCloseListener(com.kwad.sdk.core.webview.d.a.b r2) {
            r1 = this;
            r1.mWebCardCloseListener = r2
            com.kwad.sdk.core.webview.KsAdWebView r0 = r1.mAdWebView
            if (r0 != 0) goto Lc
            if (r2 == 0) goto Lc
            r0 = 0
            r2.b(r0)
        Lc:
            return
    }
}
