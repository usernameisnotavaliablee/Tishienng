package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends com.kwad.components.ad.reward.e.c {
    private boolean jm;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.fullscreen.c mInteractionListener;

    public d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.jm = r0
            return
    }

    private void onAdClosed() {
            r1 = this;
            com.kwad.components.ad.fullscreen.c r0 = r1.mInteractionListener
            if (r0 == 0) goto L7
            r0.onAdClosed()
        L7:
            return
    }

    private void onAdShow() {
            r1 = this;
            com.kwad.components.ad.fullscreen.c r0 = r1.mInteractionListener
            if (r0 == 0) goto L7
            r0.onAdShow()
        L7:
            return
    }

    public final void a(com.kwad.components.ad.fullscreen.c r1) {
            r0 = this;
            r0.mInteractionListener = r1
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void cW() {
            r4 = this;
            com.kwad.components.ad.fullscreen.c r0 = r4.mInteractionListener
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.AD_CLICK
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 0
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public void i(boolean r4) {
            r3 = this;
            r3.onAdClosed()
            com.kwad.components.ad.fullscreen.c r4 = r3.mInteractionListener
            if (r4 == 0) goto La
            r4.onPageDismiss()
        La:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r4 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.PAGE_DISMISS
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 0
            r2 = 0
            com.kwad.components.ad.reward.monitor.c.a(r2, r4, r0, r1)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayEnd() {
            r4 = this;
            com.kwad.components.ad.fullscreen.c r0 = r4.mInteractionListener
            if (r0 == 0) goto L7
            r0.onVideoPlayEnd()
        L7:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_END
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 0
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayError(int r3, int r4) {
            r2 = this;
            com.kwad.components.ad.fullscreen.c r0 = r2.mInteractionListener
            if (r0 == 0) goto L7
            r0.onVideoPlayError(r3, r4)
        L7:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_ERROR
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            r0 = 0
            r1 = 0
            com.kwad.components.ad.reward.monitor.c.a(r1, r3, r4, r0)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoPlayStart() {
            r4 = this;
            com.kwad.components.ad.fullscreen.c r0 = r4.mInteractionListener
            if (r0 == 0) goto L7
            r0.onVideoPlayStart()
        L7:
            boolean r0 = r4.jm
            if (r0 != 0) goto L11
            r0 = 1
            r4.jm = r0
            r4.onAdShow()
        L11:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r0 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_PLAY_START
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 0
            r3 = 0
            com.kwad.components.ad.reward.monitor.c.a(r3, r0, r1, r2)
            return
    }

    @Override // com.kwad.components.ad.reward.e.c, com.kwad.components.ad.reward.e.b
    public final void onVideoSkipToEnd(long r3) {
            r2 = this;
            com.kwad.components.ad.fullscreen.c r3 = r2.mInteractionListener
            if (r3 == 0) goto L7
            r3.onSkippedVideo()
        L7:
            com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardInteractionCallbackType.VIDEO_SKIP_TO_END
            com.kwad.sdk.core.response.model.AdTemplate r4 = r2.mAdTemplate
            r0 = 0
            r1 = 0
            com.kwad.components.ad.reward.monitor.c.a(r1, r3, r4, r0)
            return
    }

    public final void setAdTemplate(com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0 = this;
            r0.mAdTemplate = r1
            return
    }
}
