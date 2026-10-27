package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.components.core.page.c.a.a {
    private boolean Uh;
    private com.kwad.components.core.b.a mTitleBarHelper;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void aQ(int r1);
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private void A(android.view.View r3) {
            r2 = this;
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            if (r0 == 0) goto L9
            boolean r1 = r2.Uh
            r0.a(r1, r3)
        L9:
            return
    }

    private void B(android.view.View r1) {
            r0 = this;
            com.kwad.components.core.page.c.a.b r1 = r0.TJ
            com.kwad.components.core.page.a.a r1 = r1.TK
            if (r1 == 0) goto L9
            r1.qP()
        L9:
            return
    }

    static /* synthetic */ com.kwad.components.core.b.a a(com.kwad.components.core.page.c.a.f r0) {
            com.kwad.components.core.b.a r0 = r0.mTitleBarHelper
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.page.c.a.f r0, android.view.View r1) {
            r0.A(r1)
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.page.c.a.f r0, android.view.View r1) {
            r0.B(r1)
            return
    }

    private java.lang.String getTitle() {
            r2 = this;
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            java.lang.String r0 = r0.mPageTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            java.lang.String r0 = r0.mPageTitle
            return r0
        Lf:
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r0.adInfoList
            if (r0 == 0) goto L37
            int r0 = r0.size()
            if (r0 <= 0) goto L37
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            java.util.List<com.kwad.sdk.core.response.model.AdInfo> r0 = r0.adInfoList
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L37
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r0)
            return r0
        L37:
            java.lang.String r0 = "详情页面"
            return r0
    }

    private void ro() {
            r4 = this;
            com.kwad.components.core.b.a r0 = new com.kwad.components.core.b.a
            com.kwad.components.core.page.c.a.b r1 = r4.TJ
            android.view.ViewGroup r1 = r1.jI
            r0.<init>(r1)
            r4.mTitleBarHelper = r0
            com.kwad.components.core.b.b r1 = new com.kwad.components.core.b.b
            java.lang.String r2 = r4.getTitle()
            r1.<init>(r2)
            r0.a(r1)
            com.kwad.components.core.b.a r0 = r4.mTitleBarHelper
            r1 = 1
            r0.aj(r1)
            com.kwad.components.core.b.a r0 = r4.mTitleBarHelper
            com.kwad.components.core.page.c.a.f$1 r1 = new com.kwad.components.core.page.c.a.f$1
            r1.<init>(r4)
            r0.a(r1)
            com.kwad.components.core.b.a r0 = r4.mTitleBarHelper
            android.view.ViewGroup r0 = r0.hP()
            com.kwad.components.core.page.c.a.b r1 = r4.TJ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            boolean r2 = r1.mIsForceJumpLandingPage
            r3 = 0
            if (r2 != 0) goto L4e
            boolean r1 = com.kwad.sdk.core.response.b.a.cm(r1)
            if (r1 == 0) goto L3d
            goto L4e
        L3d:
            com.kwad.components.core.page.c.a.b r1 = r4.TJ
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.b.dC(r1)
            if (r1 == 0) goto L4c
            goto L4e
        L4c:
            r3 = 8
        L4e:
            r0.setVisibility(r3)
            com.kwad.components.core.page.c.a.b r0 = r4.TJ
            com.kwad.components.core.page.c.a.f$2 r1 = new com.kwad.components.core.page.c.a.f$2
            r1.<init>(r4)
            r0.a(r1)
            return
    }

    @Override // com.kwad.components.core.page.c.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.page.c.a.b r0 = r2.TJ
            java.lang.String r1 = r0.mPageUrl
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aS(r0)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r2.Uh = r0
            r2.ro()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
