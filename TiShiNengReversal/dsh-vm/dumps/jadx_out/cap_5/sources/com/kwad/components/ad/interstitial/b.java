package com.kwad.components.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.ad.b implements com.kwad.components.core.internal.api.a, com.kwad.sdk.api.KsInterstitialAd {
    private com.kwad.components.core.internal.api.c bz;
    private com.kwad.components.ad.interstitial.c kI;
    private com.kwad.components.ad.interstitial.d kJ;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r1 = this;
            r1.<init>(r2)
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r1.bz = r0
            r1.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            r1.mAdTemplate = r2
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.interstitial.b r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c b(com.kwad.components.ad.interstitial.b r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void setAdInteractionListener(@androidx.annotation.NonNull com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener r2) {
            r1 = this;
            com.kwad.components.ad.interstitial.c r0 = r1.kI
            if (r0 != 0) goto Lb
            com.kwad.components.ad.interstitial.b$1 r0 = new com.kwad.components.ad.interstitial.b$1
            r0.<init>(r1)
            r1.kI = r0
        Lb:
            com.kwad.components.ad.interstitial.c r0 = r1.kI
            r0.a(r2)
            com.kwad.components.ad.interstitial.d r2 = r1.kJ
            if (r2 == 0) goto L19
            com.kwad.components.ad.interstitial.c r0 = r1.kI
            r2.setAdInteractionListener(r0)
        L19:
            return
    }

    @Override // com.kwad.sdk.api.KsInterstitialAd
    public final void showInterstitialAd(android.app.Activity r4, @androidx.annotation.Nullable com.kwad.sdk.api.KsVideoPlayConfig r5) {
            r3 = this;
            com.kwad.components.ad.interstitial.report.c r0 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.y(r1)
            boolean r0 = com.kwad.sdk.core.config.e.EV()
            if (r0 == 0) goto L1e
            if (r4 == 0) goto L17
            boolean r0 = r4.isFinishing()
            if (r0 == 0) goto L1e
        L17:
            com.kwad.sdk.core.c.b.Ho()
            android.app.Activity r4 = com.kwad.sdk.core.c.b.getCurrentActivity()
        L1e:
            java.lang.String r0 = "InterstitialAdControl"
            if (r4 == 0) goto La6
            boolean r1 = r4.isFinishing()
            if (r1 == 0) goto L2a
            goto La6
        L2a:
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bn()
            if (r1 != 0) goto L49
            com.kwad.components.ad.interstitial.report.c r4 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.mAdTemplate
            com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEx
            int r2 = r1.errorCode
            java.lang.String r1 = r1.msg
            r4.a(r5, r2, r1)
            java.lang.String r4 = "showInterstitialAd please init sdk first"
            com.kwad.sdk.core.d.c.e(r0, r4)
            return
        L49:
            if (r5 != 0) goto L54
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r5 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r5.<init>()
            com.kwad.sdk.api.KsVideoPlayConfig r5 = r5.build()
        L54:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.adShowStartTimeStamp = r1
            boolean r0 = r5.isVideoSoundEnable()
            r1 = 1
            if (r0 == 0) goto L6e
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r2 = 2
            r0.mInitVoiceStatus = r2
            goto L72
        L6e:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r0.mInitVoiceStatus = r1
        L72:
            com.kwad.sdk.a.a.c r0 = com.kwad.sdk.a.a.c.CU()
            r0.bm(r1)
            com.kwad.components.ad.interstitial.d r0 = r3.kJ
            if (r0 != 0) goto La5
            com.kwad.components.ad.interstitial.d r0 = new com.kwad.components.ad.interstitial.d     // Catch: java.lang.Throwable -> L8f
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData     // Catch: java.lang.Throwable -> L8f
            com.kwad.components.ad.interstitial.c r2 = r3.kI     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L8f
            r3.kJ = r0     // Catch: java.lang.Throwable -> L8f
            r0.show()     // Catch: java.lang.Throwable -> L8f
            com.kwad.components.ad.interstitial.c.b.J(r4)     // Catch: java.lang.Throwable -> L8f
            goto L9c
        L8f:
            r4 = move-exception
            com.kwad.components.ad.interstitial.report.realtime.a.eW()
            java.lang.String r4 = r4.getMessage()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.mAdTemplate
            com.kwad.components.ad.interstitial.report.realtime.a.a(r4, r5)
        L9c:
            com.kwad.components.ad.interstitial.report.c r4 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.mAdTemplate
            r4.z(r5)
        La5:
            return
        La6:
            java.lang.String r4 = "showInterstitialAd activity must not be null"
            com.kwad.sdk.core.d.c.e(r0, r4)
            com.kwad.components.ad.interstitial.report.realtime.a.eW()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.components.ad.interstitial.report.realtime.a.G(r4)
            com.kwad.components.ad.interstitial.report.c r4 = com.kwad.components.ad.interstitial.report.c.eS()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r3.mAdTemplate
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEw
            int r1 = r0.errorCode
            java.lang.String r0 = r0.msg
            r4.a(r5, r1, r0)
            return
    }
}
