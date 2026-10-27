package com.kwad.components.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.api.KsLoadManager {







    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final java.lang.String getBidRequestToken(com.kwad.sdk.api.KsScene r2) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.b> r0 = com.kwad.components.ad.b.b.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.b r0 = (com.kwad.components.ad.b.b) r0
            if (r0 == 0) goto Lf
            java.lang.String r2 = r0.getBidRequestToken(r2)
            return r2
        Lf:
            java.lang.String r2 = ""
            return r2
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final java.lang.String getBidRequestTokenV2(com.kwad.sdk.api.KsScene r2) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.b> r0 = com.kwad.components.ad.b.b.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.b r0 = (com.kwad.components.ad.b.b) r0
            if (r0 == 0) goto Lf
            java.lang.String r2 = r0.getBidRequestTokenV2(r2)
            return r2
        Lf:
            java.lang.String r2 = ""
            return r2
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadBannerAd(com.kwad.sdk.api.KsScene r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.BannerAdListener r3) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.a> r0 = com.kwad.components.ad.b.a.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Throwable -> Le
            com.kwad.components.ad.b.a r0 = (com.kwad.components.ad.b.a) r0     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0.loadBannerAd(r2, r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            goto L22
        L10:
            java.lang.Boolean r2 = com.kwad.components.ad.f.a.oz     // Catch: java.lang.Throwable -> Le
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L21
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEn     // Catch: java.lang.Throwable -> Le
            int r0 = r2.errorCode     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.msg     // Catch: java.lang.Throwable -> Le
            r3.onError(r0, r2)     // Catch: java.lang.Throwable -> Le
        L21:
            return
        L22:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEv
            int r0 = r2.errorCode
            java.lang.String r2 = r2.msg
            r3.onError(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadConfigFeedAd(com.kwad.sdk.api.KsScene r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.FeedAdListener r3) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.d> r0 = com.kwad.components.ad.b.d.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.d r0 = (com.kwad.components.ad.b.d) r0
            if (r0 == 0) goto Le
            r0.loadConfigFeedAd(r2, r3)
            return
        Le:
            java.lang.Boolean r2 = com.kwad.components.ad.f.a.oz
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEn
            int r0 = r2.errorCode
            java.lang.String r2 = r2.msg
            r3.onError(r0, r2)
        L1f:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadDrawAd(com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.DrawAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.c> r0 = com.kwad.components.ad.b.c.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.c r0 = (com.kwad.components.ad.b.c) r0
            if (r0 == 0) goto L13
            com.kwad.components.core.b$3 r1 = new com.kwad.components.core.b$3
            r1.<init>(r2, r4)
            r0.loadDrawAd(r3, r1)
            return
        L13:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
        L24:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadFeedAd(com.kwad.sdk.api.KsScene r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.FeedAdListener r3) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.d> r0 = com.kwad.components.ad.b.d.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.d r0 = (com.kwad.components.ad.b.d) r0
            if (r0 == 0) goto Le
            r0.loadFeedAd(r2, r3)
            return
        Le:
            java.lang.Boolean r2 = com.kwad.components.ad.f.a.oz
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEn
            int r0 = r2.errorCode
            java.lang.String r2 = r2.msg
            r3.onError(r0, r2)
        L1f:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadFullScreenVideoAd(com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.e> r0 = com.kwad.components.ad.b.e.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.e r0 = (com.kwad.components.ad.b.e) r0
            if (r0 == 0) goto L13
            com.kwad.components.core.b$1 r1 = new com.kwad.components.core.b$1
            r1.<init>(r2, r4)
            r0.loadFullScreenVideoAd(r3, r1)
            return
        L13:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
        L24:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadInterstitialAd(@androidx.annotation.NonNull com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.InterstitialAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.f> r0 = com.kwad.components.ad.b.f.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.f r0 = (com.kwad.components.ad.b.f) r0
            if (r0 == 0) goto L13
            com.kwad.components.core.b$6 r1 = new com.kwad.components.core.b$6
            r1.<init>(r2, r4)
            r0.loadInterstitialAd(r3, r1)
            return
        L13:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
        L24:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadNativeAd(com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.NativeAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.g> r0 = com.kwad.components.ad.b.g.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.g r0 = (com.kwad.components.ad.b.g) r0
            if (r0 == 0) goto L13
            com.kwad.components.core.b$4 r1 = new com.kwad.components.core.b$4
            r1.<init>(r2, r4)
            r0.loadNativeAd(r3, r1)
            return
        L13:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
        L24:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadNativeAd(java.lang.String r2, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.NativeAdListener r3) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.g> r0 = com.kwad.components.ad.b.g.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.g r0 = (com.kwad.components.ad.b.g) r0
            if (r0 == 0) goto Le
            r0.loadNativeAd(r2, r3)
            return
        Le:
            java.lang.Boolean r2 = com.kwad.components.ad.f.a.oz
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            com.kwad.sdk.core.network.e r2 = com.kwad.sdk.core.network.e.aEn
            int r0 = r2.errorCode
            java.lang.String r2 = r2.msg
            r3.onError(r0, r2)
        L1f:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadRewardVideoAd(com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.h> r0 = com.kwad.components.ad.b.h.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.h r0 = (com.kwad.components.ad.b.h) r0
            if (r0 == 0) goto L13
            com.kwad.components.core.b$2 r1 = new com.kwad.components.core.b$2
            r1.<init>(r2, r4)
            r0.loadRewardVideoAd(r3, r1)
            return
        L13:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
        L24:
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final void loadSplashScreenAd(@androidx.annotation.NonNull com.kwad.sdk.api.KsScene r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener r4) {
            r2 = this;
            java.lang.Class<com.kwad.components.ad.b.i> r0 = com.kwad.components.ad.b.i.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Throwable -> L13
            com.kwad.components.ad.b.i r0 = (com.kwad.components.ad.b.i) r0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            com.kwad.components.core.b$5 r1 = new com.kwad.components.core.b$5     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L13
            r0.loadSplashScreenAd(r3, r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r3 = move-exception
            goto L27
        L15:
            java.lang.Boolean r3 = com.kwad.components.ad.f.a.oz     // Catch: java.lang.Throwable -> L13
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L26
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEn     // Catch: java.lang.Throwable -> L13
            int r0 = r3.errorCode     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r3.msg     // Catch: java.lang.Throwable -> L13
            r4.onError(r0, r3)     // Catch: java.lang.Throwable -> L13
        L26:
            return
        L27:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEv
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsLoadManager
    public final boolean showInstallDialog(android.app.Activity r2, com.kwad.sdk.api.KsExitInstallListener r3) {
            r1 = this;
            java.lang.Class<com.kwad.components.ad.b.b> r0 = com.kwad.components.ad.b.b.class
            com.kwad.sdk.components.b r0 = com.kwad.sdk.components.d.f(r0)
            com.kwad.components.ad.b.b r0 = (com.kwad.components.ad.b.b) r0
            if (r0 == 0) goto Lf
            boolean r2 = r0.showInstallDialog(r2, r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
