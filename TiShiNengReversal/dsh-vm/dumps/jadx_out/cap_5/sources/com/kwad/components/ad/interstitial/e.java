package com.kwad.components.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.kwad.sdk.api.KsInterstitialAd f(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r2)
            int r0 = com.kwad.sdk.core.response.b.e.eD(r0)
            r1 = 1
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto L14
            com.kwad.components.ad.interstitial.b r0 = new com.kwad.components.ad.interstitial.b
            r0.<init>(r2)
            return r0
        L14:
            com.kwad.components.ad.interstitial.e.a r0 = new com.kwad.components.ad.interstitial.e.a
            r1 = 0
            r0.<init>(r1, r2)
            return r0
        L1b:
            com.kwad.components.ad.interstitial.e.a r0 = new com.kwad.components.ad.interstitial.e.a
            r0.<init>(r1, r2)
            return r0
    }
}
