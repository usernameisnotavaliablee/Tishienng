package com.kwad.components.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c implements com.kwad.components.ad.interstitial.e.b {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener kL;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r1) {
            r0 = this;
            r0.kL = r1
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onAdClicked() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.kwad.components.ad.fullscreen.h
    public void onAdClosed() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onAdClosed()
        L7:
            return
    }

    @Override // com.kwad.components.ad.fullscreen.h
    public void onAdShow() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onAdShow()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onPageDismiss() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onPageDismiss()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
    public void onSkippedAd() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onSkippedAd()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onSkippedVideo() {
            r0 = this;
            r0.onSkippedAd()
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayEnd() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onVideoPlayEnd()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayError(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onVideoPlayError(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayStart() {
            r1 = this;
            com.kwad.sdk.api.KsInterstitialAd$AdInteractionListener r0 = r1.kL
            if (r0 == 0) goto L7
            r0.onVideoPlayStart()
        L7:
            return
    }
}
