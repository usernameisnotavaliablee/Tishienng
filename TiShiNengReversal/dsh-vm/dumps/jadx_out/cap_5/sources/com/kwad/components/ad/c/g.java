package com.kwad.components.ad.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g {
    public static com.kwad.sdk.api.KsScene bV;





    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static java.util.List<com.kwad.sdk.core.response.model.AdTemplate> a(com.kwad.sdk.internal.api.SceneImpl r5, java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lc
            goto L3d
        Lc:
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r6.next()
            com.kwad.sdk.core.response.model.AdTemplate r1 = (com.kwad.sdk.core.response.model.AdTemplate) r1
            if (r1 == 0) goto L10
            com.kwad.sdk.internal.api.SceneImpl r2 = r1.mAdScene
            if (r2 != 0) goto L24
            r1.mAdScene = r5
        L24:
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r1)
            int r3 = com.kwad.sdk.core.response.b.a.be(r2)
            r4 = 1
            if (r4 != r3) goto L33
            r0.add(r1)
            goto L10
        L33:
            boolean r2 = com.kwad.sdk.core.response.b.a.bd(r2)
            if (r2 == 0) goto L10
            r0.add(r1)
            goto L10
        L3d:
            return r0
    }

    private static void a(com.kwad.sdk.api.KsLoadManager.BannerAdListener r1, com.kwad.sdk.api.KsBannerAd r2) {
            com.kwad.components.ad.c.g$4 r0 = new com.kwad.components.ad.c.g$4
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    static /* synthetic */ void a(com.kwad.sdk.core.response.model.AdTemplate r0, com.kwad.sdk.api.KsLoadManager.BannerAdListener r1, com.kwad.sdk.api.KsBannerAd r2) {
            a(r1, r2)
            return
    }

    static /* synthetic */ java.util.List b(com.kwad.sdk.internal.api.SceneImpl r0, java.util.List r1) {
            java.util.List r0 = a(r0, r1)
            return r0
    }

    public static void loadBannerAd(com.kwad.sdk.api.KsScene r4, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.BannerAdListener r5) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto L1a
            java.lang.String r4 = "KsAdBannerLoadManager"
            java.lang.String r0 = "loadBannerAd please init sdk first"
            com.kwad.sdk.core.d.c.e(r4, r0)
            com.kwad.components.ad.c.g$1 r4 = new com.kwad.components.ad.c.g$1
            r4.<init>(r5)
            com.kwad.sdk.utils.bw.runOnUiThread(r4)
            return
        L1a:
            int r0 = com.kwad.sdk.core.config.e.Gj()
            r4.setAdNum(r0)
            com.kwad.components.ad.c.g.bV = r4
            com.kwad.sdk.internal.api.SceneImpl r4 = com.kwad.sdk.internal.api.SceneImpl.covert(r4)
            com.kwad.sdk.commercial.d.d.c(r4)
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            java.lang.String r1 = "loadBannerAd"
            boolean r0 = r0.b(r4, r1)
            r1 = 5
            r4.setAdStyle(r1)
            com.kwad.components.ad.KsAdLoadManager r1 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r2 = new com.kwad.components.core.request.model.a$a
            r2.<init>()
            com.kwad.components.core.request.model.ImpInfo r3 = new com.kwad.components.core.request.model.ImpInfo
            r3.<init>(r4)
            com.kwad.components.core.request.model.a$a r2 = r2.e(r3)
            com.kwad.components.core.request.model.a$a r0 = r2.aM(r0)
            com.kwad.components.ad.c.g$3 r2 = new com.kwad.components.ad.c.g$3
            r2.<init>()
            com.kwad.components.core.request.model.a$a r0 = r0.a(r2)
            com.kwad.components.ad.c.g$2 r2 = new com.kwad.components.ad.c.g$2
            r2.<init>(r5, r4)
            com.kwad.components.core.request.model.a$a r4 = r0.a(r2)
            com.kwad.components.core.request.model.a r4 = r4.sw()
            r1.a(r4)
            return
    }
}
