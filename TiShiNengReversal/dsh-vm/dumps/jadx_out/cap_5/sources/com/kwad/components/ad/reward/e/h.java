package com.kwad.components.ad.reward.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h implements com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener uu;

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void b(@androidx.annotation.Nullable com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r1) {
            r0 = this;
            r0.uu = r1
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onAdClicked() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onExtraRewardVerify(int r2) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onExtraRewardVerify(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onPageDismiss() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onPageDismiss()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onRewardStepVerify(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onRewardStepVerify(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onRewardVerify() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onRewardVerify()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onRewardVerify(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onRewardVerify(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onVideoPlayEnd() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onVideoPlayEnd()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onVideoPlayError(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onVideoPlayError(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onVideoPlayStart() {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.onVideoPlayStart()     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
    public void onVideoSkipToEnd(long r2) {
            r1 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.uu
            if (r0 == 0) goto L7
            r0.onVideoSkipToEnd(r2)
        L7:
            return
    }
}
