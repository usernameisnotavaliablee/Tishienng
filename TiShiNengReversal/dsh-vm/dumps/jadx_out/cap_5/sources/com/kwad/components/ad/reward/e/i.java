package com.kwad.components.ad.reward.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i extends com.kwad.components.ad.reward.e.c {
    private static java.lang.String ux = "IS_FRAUD";
    private static java.lang.String uy = "IS_FRAUD_ERROR_CODE";
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.reward.g tm;
    private java.lang.String uv;
    private java.util.Map<java.lang.String, java.lang.Object> uw;


    static {
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.uw = r0
            return
    }

    private java.lang.String getUniqueId() {
            r1 = this;
            java.lang.String r0 = r1.uv
            return r0
    }

    private com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener ic() {
            r1 = this;
            java.lang.String r0 = r1.getUniqueId()
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.e.f.N(r0)
            return r0
    }

    public final void R(java.lang.String r1) {
            r0 = this;
            r0.uv = r1
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public void cW() {
            r4 = this;
            super.cW()
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r4.ic()
            if (r0 == 0) goto Lc
            r0.onAdClicked()
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.AD_CLICK
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 1
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public void i(boolean r4) {
            r3 = this;
            super.i(r4)
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r4 = r3.ic()
            if (r4 == 0) goto Lc
            r4.onPageDismiss()
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r4 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.PAGE_DISMISS
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 0
            r2 = 1
            com.kwad.components.ad.reward.monitor.c.a(r2, r4, r0, r1)
            return
    }

    public final boolean i(int r5, int r6) {
            r4 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r4.ic()
            if (r0 == 0) goto L9
            r0.onRewardStepVerify(r5, r6)
        L9:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r1 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.REWARD_STEP_VERIFY
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.components.ad.reward.e.i$1 r3 = new com.kwad.components.ad.reward.e.i$1
            r3.<init>(r4, r5, r6)
            r5 = 1
            com.kwad.components.ad.reward.monitor.c.a(r5, r1, r2, r3)
            if (r0 == 0) goto L19
            return r5
        L19:
            r5 = 0
            return r5
    }

    public final boolean ib() {
            r7 = this;
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r7.ic()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4d
            com.kwad.components.ad.reward.g r3 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            boolean r3 = com.kwad.sdk.core.response.b.a.dh(r3)
            if (r3 == 0) goto L45
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.uw
            java.lang.String r4 = com.kwad.components.ad.reward.e.i.ux
            com.kwad.components.ad.reward.g r5 = r7.tm
            int r5 = r5.sa
            r6 = 3
            if (r5 != r6) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.uw
            java.lang.String r4 = com.kwad.components.ad.reward.e.i.uy
            com.kwad.components.ad.reward.g r5 = r7.tm
            int r5 = r5.sb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r4, r5)
            com.kwad.components.ad.reward.g r3 = r7.tm
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            int r5 = r3.sa
            int r3 = r3.sb
            com.kwad.components.ad.reward.monitor.c.d(r4, r5, r3)
        L45:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.uw     // Catch: java.lang.Throwable -> L4a
            r0.onRewardVerify(r3)     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0.onRewardVerify()
        L4d:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.REWARD_VERIFY
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            r5 = 0
            com.kwad.components.ad.reward.monitor.c.a(r2, r3, r4, r5)
            if (r0 == 0) goto L58
            return r2
        L58:
            return r1
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public void onRewardVerify() {
            r0 = this;
            super.onRewardVerify()
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayEnd() {
            r4 = this;
            super.onVideoPlayEnd()
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r4.ic()
            if (r0 == 0) goto Lc
            r0.onVideoPlayEnd()
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_END
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 1
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayError(int r3, int r4) {
            r2 = this;
            super.onVideoPlayError(r3, r4)
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r2.ic()
            if (r0 == 0) goto Lc
            r0.onVideoPlayError(r3, r4)
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_ERROR
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            r0 = 0
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.a(r1, r3, r4, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayStart() {
            r4 = this;
            super.onVideoPlayStart()
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r4.ic()
            if (r0 == 0) goto Lc
            r0.onVideoPlayStart()
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_START
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 1
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoSkipToEnd(long r3) {
            r2 = this;
            super.onVideoSkipToEnd(r3)
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r2.ic()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto Lc
            r0.onVideoSkipToEnd(r3)     // Catch: java.lang.Throwable -> L15
        Lc:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_SKIP_TO_END     // Catch: java.lang.Throwable -> L15
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L15
            r0 = 0
            r1 = 1
            com.kwad.components.ad.reward.monitor.c.a(r1, r3, r4, r0)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public final void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }

    public final void setCallerContext(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.tm = r1
            return
    }
}
