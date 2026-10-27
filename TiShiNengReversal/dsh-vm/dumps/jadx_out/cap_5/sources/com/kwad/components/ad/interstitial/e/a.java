package com.kwad.components.ad.interstitial.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.b implements com.kwad.components.core.internal.api.a, com.kwad.sdk.api.KsInterstitialAd {
    private final boolean ma;
    private com.kwad.components.ad.fullscreen.g mb;
    private com.kwad.components.ad.interstitial.b mc;

    @androidx.annotation.NonNull
    private final com.kwad.components.ad.interstitial.c md;

    public a(boolean r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r0 = this;
            r0.<init>(r2)
            r0.ma = r1
            if (r1 == 0) goto Lf
            com.kwad.components.ad.fullscreen.g r1 = new com.kwad.components.ad.fullscreen.g
            r1.<init>(r2)
            r0.mb = r1
            goto L16
        Lf:
            com.kwad.components.ad.interstitial.b r1 = new com.kwad.components.ad.interstitial.b
            r1.<init>(r2)
            r0.mc = r1
        L16:
            com.kwad.components.ad.interstitial.c r1 = new com.kwad.components.ad.interstitial.c
            r1.<init>()
            r0.md = r1
            return
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void setAdInteractionListener(com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r2) {
            r1 = this;
            com.kwad.components.ad.interstitial.c r0 = r1.md
            r0.a(r2)
            boolean r2 = r1.ma
            if (r2 == 0) goto L11
            com.kwad.components.ad.fullscreen.g r2 = r1.mb
            com.kwad.components.ad.interstitial.c r0 = r1.md
            r2.setFullScreenVideoAdInteractionListener(r0)
            return
        L11:
            com.kwad.components.ad.interstitial.b r2 = r1.mc
            com.kwad.components.ad.interstitial.c r0 = r1.md
            r2.setAdInteractionListener(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void showInterstitialAd(android.app.Activity r2, com.kwad.sdk.api.KsVideoPlayConfig r3) {
            r1 = this;
            boolean r0 = r1.ma
            if (r0 == 0) goto La
            com.kwad.components.ad.fullscreen.g r0 = r1.mb
            r0.showFullScreenVideoAd(r2, r3)
            return
        La:
            com.kwad.components.ad.interstitial.b r0 = r1.mc
            r0.showInterstitialAd(r2, r3)
            return
    }
}
