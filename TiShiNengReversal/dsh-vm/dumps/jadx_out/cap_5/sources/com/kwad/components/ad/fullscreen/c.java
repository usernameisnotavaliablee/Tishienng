package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c implements com.kwad.components.ad.fullscreen.h {

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener jl;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener r1) {
            r0 = this;
            r0.jl = r1
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onAdClicked() {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onAdClicked()
        L7:
            return
    }

    @Override // com.kwad.components.ad.fullscreen.h
    public void onAdClosed() {
            r2 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r2.jl
            boolean r1 = r0 instanceof com.kwad.components.ad.fullscreen.h
            if (r1 == 0) goto Lb
            com.kwad.components.ad.fullscreen.h r0 = (com.kwad.components.ad.fullscreen.h) r0
            r0.onAdClosed()
        Lb:
            return
    }

    @Override // com.kwad.components.ad.fullscreen.h
    public void onAdShow() {
            r2 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r2.jl
            boolean r1 = r0 instanceof com.kwad.components.ad.fullscreen.h
            if (r1 == 0) goto Lb
            com.kwad.components.ad.fullscreen.h r0 = (com.kwad.components.ad.fullscreen.h) r0
            r0.onAdShow()
        Lb:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onPageDismiss() {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onPageDismiss()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onSkippedVideo() {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onSkippedVideo()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayEnd() {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onVideoPlayEnd()
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayError(int r2, int r3) {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onVideoPlayError(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
    public void onVideoPlayStart() {
            r1 = this;
            com.kwad.sdk.api.KsFullScreenVideoAd$FullScreenVideoAdInteractionListener r0 = r1.jl
            if (r0 == 0) goto L7
            r0.onVideoPlayStart()
        L7:
            return
    }
}
