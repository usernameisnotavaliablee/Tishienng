package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.components.ad.b implements com.kwad.components.core.internal.api.a, com.kwad.sdk.api.KsFullScreenVideoAd {
    private com.kwad.components.ad.fullscreen.c jw;


    public g(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r1) {
            r0 = this;
            r0.<init>(r1)
            com.kwad.components.ad.i.b r1 = com.kwad.components.ad.i.b.fR()
            r1.a(r0)
            return
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c a(com.kwad.components.ad.fullscreen.g r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c b(com.kwad.components.ad.fullscreen.g r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd
    public final boolean isAdEnable() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eB(r0)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.components.core.video.k.aL(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd
    public final void setFullScreenVideoAdInteractionListener(com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener r2) {
            r1 = this;
            com.kwad.components.ad.fullscreen.c r0 = r1.jw
            if (r0 != 0) goto Lb
            com.kwad.components.ad.fullscreen.g$1 r0 = new com.kwad.components.ad.fullscreen.g$1
            r0.<init>(r1)
            r1.jw = r0
        Lb:
            com.kwad.components.ad.fullscreen.c r0 = r1.jw
            r0.a(r2)
            return
    }

    @Override // com.kwad.sdk.api.KsFullScreenVideoAd
    public final void showFullScreenVideoAd(android.app.Activity r4, com.kwad.sdk.api.KsVideoPlayConfig r5) {
            r3 = this;
            java.lang.String r0 = "KsFullScreenVideoAdControl"
            r1 = 0
            if (r4 == 0) goto L42
            boolean r2 = r4.isFinishing()
            if (r2 == 0) goto Lc
            goto L42
        Lc:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.components.ad.reward.monitor.c.h(r1, r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r2)
            boolean r2 = com.kwad.sdk.core.config.e.Gf()
            if (r2 != 0) goto L2f
            boolean r2 = r3.isAdEnable()
            if (r2 != 0) goto L2f
            java.lang.String r4 = "isAdEnable is false"
            com.kwad.sdk.core.d.c.i(r0, r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            java.lang.String r5 = "cache_not_ready"
            com.kwad.components.ad.reward.monitor.c.b(r1, r4, r5)
            return
        L2f:
            if (r5 != 0) goto L3a
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r5 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r5.<init>()
            com.kwad.sdk.api.KsVideoPlayConfig r5 = r5.build()
        L3a:
            com.kwad.sdk.core.response.model.AdResultData r0 = r3.mAdResultData
            com.kwad.components.ad.fullscreen.c r1 = r3.jw
            com.kwad.components.ad.fullscreen.KsFullScreenVideoActivityProxy.launch(r4, r0, r5, r1)
            return
        L42:
            java.lang.String r4 = "showFullScreenVideoAd error, activity is null or finished"
            com.kwad.sdk.core.d.c.e(r0, r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            java.lang.String r5 = "illegal_activity"
            com.kwad.components.ad.reward.monitor.c.b(r1, r4, r5)
            return
    }
}
