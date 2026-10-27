package com.kwad.components.ad.splashscreen.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.proxy.h {
    private com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener Fe;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(com.kwad.sdk.core.j.b r1) {
            r0 = this;
            r0.dn = r1
            return
    }

    public static com.kwad.components.ad.splashscreen.c.b b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2, com.kwad.sdk.core.j.b r3, com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.kwad.components.core.c.f r1 = com.kwad.components.core.c.f.ol()
            int r2 = r1.l(r2)
            java.lang.String r1 = "ad_result_cache_idx"
            r0.putInt(r1, r2)
            com.kwad.components.ad.splashscreen.c.b r2 = new com.kwad.components.ad.splashscreen.c.b
            r2.<init>()
            r2.setArguments(r0)
            r2.a(r3)
            r2.setSplashScreenAdListener(r4)
            return r2
    }

    private void initData() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "ad_result_cache_idx"
            int r0 = r0.getInt(r1)
            if (r0 <= 0) goto L1d
            com.kwad.components.core.c.f r1 = com.kwad.components.core.c.f.ol()
            r2 = 1
            com.kwad.sdk.core.response.model.AdResultData r0 = r1.d(r0, r2)
            r3.mAdResultData = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r0)
            r3.mAdTemplate = r0
        L1d:
            return
    }

    private void setSplashScreenAdListener(com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener r1) {
            r0 = this;
            r0.Fe = r1
            return
    }

    @Override // com.kwad.components.core.proxy.h
    public final android.view.ViewGroup nj() {
            r5 = this;
            r5.initData()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            r1 = 0
            if (r0 != 0) goto L1b
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            java.lang.String r0 = "adTemplate null"
            r2 = 0
            com.kwad.components.ad.splashscreen.monitor.b.a(r2, r0, r1)
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r0 = r5.Fe
            if (r0 == 0) goto L1a
            java.lang.String r3 = "data parse error"
            r0.onAdShowError(r1, r3)
        L1a:
            return r2
        L1b:
            android.content.Context r0 = r5.mContext
            com.kwad.sdk.core.response.model.AdResultData r2 = r5.mAdResultData
            com.kwad.sdk.core.j.b r3 = r5.dn
            com.kwad.sdk.api.KsSplashScreenAd$SplashScreenAdInteractionListener r4 = r5.Fe
            com.kwad.components.ad.splashscreen.c r0 = com.kwad.components.ad.splashscreen.c.a(r0, r2, r1, r3, r4)
            return r0
    }
}
