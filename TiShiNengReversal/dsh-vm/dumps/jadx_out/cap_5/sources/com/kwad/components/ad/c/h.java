package com.kwad.components.ad.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h implements com.kwad.components.ad.c.d, com.kwad.sdk.api.KsBannerAd {
    private final com.kwad.sdk.api.KsAdVideoPlayConfig bU;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public h(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.<init>()
            r0.mAdResultData = r1
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r1)
            r0.mAdTemplate = r1
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r1 = new com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            r1.<init>()
            r0.bU = r1
            return
    }

    @Override // com.kwad.components.ad.c.d
    public final void b(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }

    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
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

    @Override // com.kwad.sdk.api.KsBannerAd
    public final android.view.View getView(android.content.Context r3, com.kwad.sdk.api.KsBannerAd.BannerAdInteractionListener r4, com.kwad.sdk.api.KsAdVideoPlayConfig r5) {
            r2 = this;
            if (r3 == 0) goto L20
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Ld
            goto L20
        Ld:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r0)
            com.kwad.components.ad.c.i r0 = new com.kwad.components.ad.c.i
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.<init>(r3, r1, r5)
            r0.setBannerAdListener(r4)
            r0.setBannerUpdateAdResultDataListener(r2)
            return r0
        L20:
            r3 = 0
            return r3
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsBannerAd
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 0
            return r0
    }
}
