package com.kwad.components.ad.draw;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {


    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void loadDrawAd(com.kwad.sdk.api.KsScene r6, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.DrawAdListener r7) {
            com.kwad.sdk.internal.api.SceneImpl r6 = com.kwad.sdk.internal.api.SceneImpl.covert(r6)
            int r0 = r6.getAdNum()
            if (r0 > 0) goto Lf
            java.lang.String r0 = "ad_num"
            com.kwad.components.ad.draw.a.c.a(r6, r0)
        Lf:
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            java.lang.String r1 = "loadDrawAd"
            boolean r0 = r0.b(r6, r1)
            r1 = 6
            r6.setAdStyle(r1)
            com.kwad.components.ad.draw.a.c.b(r6)
            com.kwad.sdk.commercial.d.d.c(r6)
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.kwad.components.ad.KsAdLoadManager r3 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r4 = new com.kwad.components.core.request.model.a$a
            r4.<init>()
            com.kwad.components.core.request.model.ImpInfo r5 = new com.kwad.components.core.request.model.ImpInfo
            r5.<init>(r6)
            com.kwad.components.core.request.model.a$a r4 = r4.e(r5)
            com.kwad.components.core.request.model.a$a r0 = r4.aM(r0)
            com.kwad.components.ad.draw.d$1 r4 = new com.kwad.components.ad.draw.d$1
            r4.<init>(r6, r1, r7)
            com.kwad.components.core.request.model.a$a r6 = r0.a(r4)
            com.kwad.components.core.request.model.a r6 = r6.sw()
            r3.a(r6)
            return
    }
}
