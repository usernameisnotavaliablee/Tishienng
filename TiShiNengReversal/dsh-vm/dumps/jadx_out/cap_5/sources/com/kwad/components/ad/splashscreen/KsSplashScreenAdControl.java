package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsSplashScreenAdControl extends com.kwad.sdk.api.core.AbstrackKsSplashScreenAd implements com.kwad.components.core.internal.api.a {
    private com.kwad.sdk.api.KsScene Fc;
    private com.kwad.components.core.internal.api.c bz;
    private com.kwad.sdk.core.j.b dn;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    public KsSplashScreenAdControl(@androidx.annotation.NonNull com.kwad.sdk.api.KsScene r2, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r3) {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r1.bz = r0
            com.kwad.components.ad.splashscreen.KsSplashScreenAdControl$1 r0 = new com.kwad.components.ad.splashscreen.KsSplashScreenAdControl$1
            r0.<init>(r1)
            r1.dn = r0
            r1.mAdResultData = r3
            r1.Fc = r2
            java.util.List r2 = r3.getAdTemplateList()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            r1.mAdTemplate = r2
            com.kwad.components.ad.i.b r2 = com.kwad.components.ad.i.b.fR()
            r2.a(r1)
            return
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c a(com.kwad.components.ad.splashscreen.KsSplashScreenAdControl r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @com.kwad.sdk.api.core.KsAdSdkDynamicApi
    @androidx.annotation.Keep
    protected com.kwad.sdk.api.core.fragment.KsFragment getFragment2(com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r4) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r0)
            java.lang.Class<com.kwad.components.ad.splashscreen.a.a> r0 = com.kwad.components.ad.splashscreen.a.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.splashscreen.a.a r0 = (com.kwad.components.ad.splashscreen.a.a) r0
            if (r0 == 0) goto L18
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData
            com.kwad.sdk.core.j.b r2 = r3.dn
            com.kwad.sdk.api.core.fragment.KsFragment r4 = r0.a(r1, r2, r4)
            return r4
        L18:
            r4 = 0
            return r4
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public com.kwad.sdk.api.model.KSAdInfoData getKSAdInfoData() {
            r1 = this;
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBw
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L13
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.api.model.KSAdInfoData r0 = com.kwad.sdk.core.response.b.a.dj(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.kwad.sdk.core.config.e.Ft()
            if (r1 == 0) goto L18
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            long r1 = r1.llsid
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "llsid"
            r0.put(r2, r1)
        L18:
            return r0
    }

    @Override // com.kwad.sdk.api.core.AbstrackKsSplashScreenAd
    @androidx.annotation.Nullable
    public android.view.View getView2(android.content.Context r4, com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r5) {
            r3 = this;
            if (r4 == 0) goto L1c
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r0)
            com.kwad.sdk.core.response.model.AdResultData r0 = r3.mAdResultData
            r1 = 1
            com.kwad.sdk.core.j.b r2 = r3.dn
            com.kwad.components.ad.splashscreen.c r4 = com.kwad.components.ad.splashscreen.c.a(r4, r0, r1, r2, r5)
            return r4
        L1c:
            r4 = 0
            return r4
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public boolean isAdEnable() {
            r2 = this;
            com.kwad.components.ad.splashscreen.SplashPreloadManager r0 = com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            boolean r0 = r0.h(r1)
            if (r0 != 0) goto L1a
            com.kwad.components.ad.splashscreen.SplashPreloadManager.lD()
            com.kwad.sdk.core.response.model.AdResultData r0 = r2.mAdResultData
            boolean r0 = com.kwad.components.ad.splashscreen.SplashPreloadManager.i(r0)
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public boolean isVideo() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdResultData r0 = r2.mAdResultData
            java.util.List r0 = r0.getAdTemplateList()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = (com.kwad.sdk.core.response.model.AdTemplate) r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.bc(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @androidx.annotation.Keep
    public boolean showSplashMiniWindowIfNeeded(android.content.Context r1, com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r2, android.graphics.Rect r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 0
            return r0
    }
}
