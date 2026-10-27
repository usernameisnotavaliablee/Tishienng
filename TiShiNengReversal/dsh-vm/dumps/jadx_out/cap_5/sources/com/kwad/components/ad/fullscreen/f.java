package com.kwad.components.ad.fullscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {




    public f() {
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
            goto L51
        Lc:
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L51
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
            if (r4 != r3) goto L3d
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.K(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3d
            r0.add(r1)
            goto L10
        L3d:
            boolean r3 = com.kwad.sdk.core.response.b.a.bd(r2)
            if (r3 == 0) goto L47
            r0.add(r1)
            goto L10
        L47:
            boolean r2 = com.kwad.sdk.core.response.b.a.cR(r2)
            if (r2 == 0) goto L10
            r0.add(r1)
            goto L10
        L51:
            return r0
    }

    public static void a(com.kwad.sdk.api.KsScene r6, @androidx.annotation.NonNull com.kwad.components.ad.fullscreen.e r7) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.internal.api.SceneImpl r6 = com.kwad.sdk.internal.api.SceneImpl.covert(r6)
            com.kwad.sdk.commercial.d.d.c(r6)
            r2 = 0
            long r3 = r6.getPosId()
            com.kwad.components.ad.reward.monitor.c.a(r2, r3)
            com.kwad.components.core.t.n r2 = com.kwad.components.core.t.n.tn()
            java.lang.String r3 = "loadFullScreenVideoAd"
            boolean r2 = r2.b(r6, r3)
            r3 = 3
            r6.setAdStyle(r3)
            com.kwad.components.ad.KsAdLoadManager r3 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r4 = new com.kwad.components.core.request.model.a$a
            r4.<init>()
            com.kwad.components.core.request.model.ImpInfo r5 = new com.kwad.components.core.request.model.ImpInfo
            r5.<init>(r6)
            com.kwad.components.core.request.model.a$a r4 = r4.e(r5)
            com.kwad.components.core.request.model.a$a r2 = r4.aM(r2)
            com.kwad.components.ad.fullscreen.f$2 r4 = new com.kwad.components.ad.fullscreen.f$2
            r4.<init>(r6)
            com.kwad.components.core.request.model.a$a r2 = r2.a(r4)
            com.kwad.components.ad.fullscreen.f$1 r4 = new com.kwad.components.ad.fullscreen.f$1
            r4.<init>(r6, r7, r0)
            com.kwad.components.core.request.model.a$a r6 = r2.a(r4)
            com.kwad.components.core.request.model.a r6 = r6.sw()
            r3.a(r6)
            return
    }

    private static void a(com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.components.ad.fullscreen.e r2, java.util.List<com.kwad.sdk.api.KsFullScreenVideoAd> r3) {
            com.kwad.components.ad.fullscreen.f$3 r0 = new com.kwad.components.ad.fullscreen.f$3
            r0.<init>(r3, r2, r1)
            com.kwad.sdk.utils.bw.postOnUiThread(r0)
            return
    }

    static /* synthetic */ java.util.List b(com.kwad.sdk.internal.api.SceneImpl r0, java.util.List r1) {
            java.util.List r0 = a(r0, r1)
            return r0
    }

    static /* synthetic */ void b(com.kwad.sdk.core.response.model.AdTemplate r0, com.kwad.components.ad.fullscreen.e r1, java.util.List r2) {
            a(r0, r1, r2)
            return
    }
}
