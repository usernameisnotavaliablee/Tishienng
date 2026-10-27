package com.kwad.components.ad.interstitial;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {



    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void loadInterstitialAd(@androidx.annotation.NonNull com.kwad.sdk.api.KsScene r6, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.InterstitialAdListener r7) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto L1a
            java.lang.String r6 = "KsAdInterstitialLoadManager"
            java.lang.String r0 = "loadInterstitialAd please init sdk first"
            com.kwad.sdk.core.d.c.e(r6, r0)
            com.kwad.components.ad.interstitial.f$1 r6 = new com.kwad.components.ad.interstitial.f$1
            r6.<init>(r7)
            com.kwad.sdk.utils.bw.runOnUiThread(r6)
            return
        L1a:
            com.kwad.sdk.internal.api.SceneImpl r6 = com.kwad.sdk.internal.api.SceneImpl.covert(r6)
            com.kwad.sdk.commercial.d.d.c(r6)
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            java.lang.String r1 = "loadInterstitialAd"
            boolean r0 = r0.b(r6, r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 23
            r6.setAdStyle(r3)
            com.kwad.components.ad.interstitial.report.c r3 = com.kwad.components.ad.interstitial.report.c.eS()
            long r4 = r6.getPosId()
            r3.m(r4)
            com.kwad.components.ad.KsAdLoadManager r3 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r4 = new com.kwad.components.core.request.model.a$a
            r4.<init>()
            com.kwad.components.core.request.model.ImpInfo r5 = new com.kwad.components.core.request.model.ImpInfo
            r5.<init>(r6)
            com.kwad.components.core.request.model.a$a r4 = r4.e(r5)
            com.kwad.components.core.request.model.a$a r0 = r4.aM(r0)
            com.kwad.components.ad.interstitial.f$2 r4 = new com.kwad.components.ad.interstitial.f$2
            r4.<init>(r6, r7, r1)
            com.kwad.components.core.request.model.a$a r6 = r0.a(r4)
            com.kwad.components.core.request.model.a r6 = r6.sw()
            r3.a(r6)
            return
    }
}
