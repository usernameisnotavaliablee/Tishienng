package com.kwad.components.core.page.splitLandingPage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.core.proxy.h {
    private com.kwad.components.core.widget.FeedVideoView Tb;
    private android.widget.LinearLayout Tc;
    private com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView Ve;
    private com.kwad.sdk.mvp.Presenter Vf;
    private com.kwad.components.core.page.splitLandingPage.view.a Vg;
    private com.kwad.components.core.page.c.a Vh;
    private boolean Vi;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;






    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.widget.LinearLayout a(com.kwad.components.core.page.splitLandingPage.a r0) {
            android.widget.LinearLayout r0 = r0.Tc
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.page.splitLandingPage.a r0, boolean r1) {
            r1 = 0
            r0.Vi = r1
            return r1
    }

    public static com.kwad.components.core.page.splitLandingPage.a aE(com.kwad.sdk.core.response.model.AdTemplate r4) {
            com.kwad.components.core.page.splitLandingPage.a r0 = new com.kwad.components.core.page.splitLandingPage.a
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            org.json.JSONObject r2 = r4.toJson()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "key_photo"
            r1.putString(r3, r2)
            java.lang.String r2 = "key_report"
            boolean r4 = r4.mPvReported
            r1.putBoolean(r2, r4)
            r0.setArguments(r1)
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.core.page.splitLandingPage.a r0) {
            r0.rI()
            return
    }

    static /* synthetic */ com.kwad.components.core.widget.FeedVideoView c(com.kwad.components.core.page.splitLandingPage.a r0) {
            com.kwad.components.core.widget.FeedVideoView r0 = r0.Tb
            return r0
    }

    static /* synthetic */ boolean d(com.kwad.components.core.page.splitLandingPage.a r0) {
            boolean r0 = r0.rH()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView e(com.kwad.components.core.page.splitLandingPage.a r0) {
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r0.Ve
            return r0
    }

    static /* synthetic */ com.kwad.components.core.page.splitLandingPage.view.a f(com.kwad.components.core.page.splitLandingPage.a r0) {
            com.kwad.components.core.page.splitLandingPage.view.a r0 = r0.Vg
            return r0
    }

    private void initView() {
            r5 = this;
            com.kwad.components.core.page.recycle.e r0 = new com.kwad.components.core.page.recycle.e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r5.mApkDownloadHelper
            r3 = 0
            r0.<init>(r1, r2, r3)
            com.kwad.sdk.mvp.Presenter r1 = r5.Vf
            r1.n(r0)
            com.kwad.components.core.page.splitLandingPage.view.a r1 = new com.kwad.components.core.page.splitLandingPage.view.a
            android.content.Context r2 = r5.mContext
            com.kwad.components.core.page.splitLandingPage.a.a r3 = new com.kwad.components.core.page.splitLandingPage.a.a
            com.kwad.sdk.core.response.model.AdTemplate r4 = r0.adTemplate
            com.kwad.components.core.e.d.c r0 = r0.Pc
            r3.<init>(r4, r0)
            r1.<init>(r2, r3)
            r5.Vg = r1
            com.kwad.components.core.page.splitLandingPage.a$3 r0 = new com.kwad.components.core.page.splitLandingPage.a$3
            r0.<init>(r5)
            r1.a(r0)
            com.kwad.components.core.widget.FeedVideoView r0 = r5.Tb
            com.kwad.components.core.page.splitLandingPage.a$4 r1 = new com.kwad.components.core.page.splitLandingPage.a$4
            r1.<init>(r5)
            r0.post(r1)
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r5.Ve
            com.kwad.components.core.page.splitLandingPage.a$5 r1 = new com.kwad.components.core.page.splitLandingPage.a$5
            r1.<init>(r5)
            r0.setSplitScrollWebViewListener(r1)
            return
    }

    private void j(android.view.ViewGroup r3) {
            r2 = this;
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            r2.Vf = r0
            r0.K(r3)
            com.kwad.components.core.page.c.b r3 = new com.kwad.components.core.page.c.b
            r3.<init>()
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r2.Ve
            r3.K(r0)
            com.kwad.components.core.page.c.a r0 = new com.kwad.components.core.page.c.a
            r0.<init>()
            r2.Vh = r0
            com.kwad.components.core.widget.FeedVideoView r1 = r2.Tb
            r0.K(r1)
            com.kwad.sdk.mvp.Presenter r0 = r2.Vf
            r0.a(r3)
            com.kwad.sdk.mvp.Presenter r3 = r2.Vf
            com.kwad.components.core.page.c.a r0 = r2.Vh
            r3.a(r0)
            return
    }

    private boolean rH() {
            r6 = this;
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r6.Ve
            r1 = 0
            if (r0 == 0) goto L66
            float r0 = r0.getTranslationY()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L66
            boolean r0 = r6.Vi
            if (r0 == 0) goto L13
            goto L66
        L13:
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r6.Ve
            r0.setDisableAnimation(r1)
            r0 = 1
            r6.Vi = r0
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r3 = r6.Ve
            float r4 = r3.getTranslationY()
            com.kwad.components.core.widget.FeedVideoView r5 = r6.Tb
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 + r5
            r5 = 0
            android.animation.Animator r2 = com.kwad.components.core.t.o.a(r3, r5, r2, r4)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            int r4 = com.kwad.sdk.core.config.e.EP()
            r5 = 2
            if (r4 != r5) goto L57
            com.kwad.components.core.page.splitLandingPage.view.a r4 = r6.Vg
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L57
            com.kwad.components.core.page.splitLandingPage.view.a r4 = r6.Vg
            r4.rJ()
            com.kwad.components.core.page.splitLandingPage.view.a r4 = r6.Vg
            android.animation.Animator r4 = r4.aK(r1)
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r5[r1] = r4
            r5[r0] = r2
            r3.playSequentially(r5)
            goto L5a
        L57:
            r3.play(r2)
        L5a:
            com.kwad.components.core.page.splitLandingPage.a$2 r1 = new com.kwad.components.core.page.splitLandingPage.a$2
            r1.<init>(r6)
            r3.addListener(r1)
            r3.start()
            return r0
        L66:
            return r1
    }

    private void rI() {
            r4 = this;
            com.kwad.components.core.page.c.a r0 = r4.Vh
            r0.ny()
            com.kwad.components.core.page.c.a r0 = r4.Vh
            com.kwad.components.core.widget.FeedVideoView r1 = r4.Tb
            r0.K(r1)
            com.kwad.components.core.page.recycle.e r0 = new com.kwad.components.core.page.recycle.e
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.components.core.e.d.c r2 = r4.mApkDownloadHelper
            r3 = 0
            r0.<init>(r1, r2, r3)
            com.kwad.components.core.page.c.a r1 = r4.Vh
            r1.n(r0)
            return
    }

    private void z(android.view.View r4) {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_web_tip_bar
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.Tc = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_tip_bar_textview
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.kwad.sdk.R.id.ksad_web_tip_close_btn
            android.view.View r4 = r4.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.kwad.components.core.page.splitLandingPage.a$1 r1 = new com.kwad.components.core.page.splitLandingPage.a$1
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r1 = com.kwad.sdk.core.response.b.a.bz(r4)
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.bv(r4)
            if (r1 == 0) goto L40
            android.widget.LinearLayout r1 = r3.Tc
            r2 = 0
            r1.setVisibility(r2)
            r0.setText(r4)
            r4 = 1
            r0.setSelected(r4)
            return
        L40:
            android.widget.LinearLayout r4 = r3.Tc
            r0 = 8
            r4.setVisibility(r0)
            return
    }

    @Override // com.kwad.components.core.proxy.h, com.kwad.sdk.m.a.b
    public final boolean onBackPressed() {
            r2 = this;
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r2.Ve
            r1 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.canGoBack()
            if (r0 == 0) goto L11
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r0 = r2.Ve
            r0.goBack()
            return r1
        L11:
            boolean r0 = r2.rH()
            if (r0 == 0) goto L18
            return r1
        L18:
            com.kwad.components.core.widget.FeedVideoView r0 = r2.Tb
            if (r0 == 0) goto L21
            boolean r0 = r0.wc()
            return r0
        L21:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.proxy.h, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            java.lang.String r0 = "key_photo"
            java.lang.String r4 = r4.getString(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = new com.kwad.sdk.core.response.model.AdTemplate
            r0.<init>()
            if (r4 == 0) goto L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r1.<init>(r4)     // Catch: org.json.JSONException -> L1d
            r0.parseJson(r1)     // Catch: org.json.JSONException -> L1d
            goto L21
        L1d:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
        L21:
            r3.mAdTemplate = r0
            android.os.Bundle r4 = r3.getArguments()
            java.lang.String r1 = "key_report"
            r2 = 0
            boolean r4 = r4.getBoolean(r1, r2)
            r0.mPvReported = r4
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            r0 = 1
            r4.mAdWebVideoPageShowing = r0
            return
    }

    @Override // com.kwad.components.core.proxy.h, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            if (r0 == 0) goto La
            r1 = 0
            r0.mAdWebVideoPageShowing = r1
        La:
            return
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            int r2 = com.kwad.sdk.R.id.ksad_split_land_ad_feed_video
            android.view.View r2 = r0.findViewById(r2)
            com.kwad.components.core.widget.FeedVideoView r2 = (com.kwad.components.core.widget.FeedVideoView) r2
            r0.Tb = r2
            int r2 = com.kwad.sdk.R.id.ksad_video_webView
            android.view.View r2 = r0.findViewById(r2)
            com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView r2 = (com.kwad.components.core.page.splitLandingPage.view.SplitScrollWebView) r2
            r0.Ve = r2
            r0.z(r1)
            android.view.ViewGroup r1 = r0.nY
            r0.j(r1)
            r0.initView()
            return
    }

    @Override // com.kwad.components.core.proxy.h
    public final int qN() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_split_land_page
            return r0
    }

    public final void rJ() {
            r1 = this;
            com.kwad.components.core.widget.FeedVideoView r0 = r1.Tb
            r0.rJ()
            return
    }

    public final void setApkDownloadHelper(com.kwad.components.core.e.d.c r1) {
            r0 = this;
            r0.mApkDownloadHelper = r1
            return
    }
}
