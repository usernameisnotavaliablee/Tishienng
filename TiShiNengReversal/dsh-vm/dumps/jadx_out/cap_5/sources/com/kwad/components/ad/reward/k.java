package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class k {



    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(com.kwad.components.ad.reward.g r4, long r5, long r7, long r9) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            long r0 = com.kwad.sdk.core.response.b.a.di(r0)
            r2 = 800(0x320, double:3.953E-321)
            long r7 = r7 - r2
            long r7 = r7 - r9
            long r7 = r7 - r0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2a
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2a
            com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r5 = com.kwad.sdk.core.response.b.e.el(r5)
            boolean r5 = com.kwad.sdk.core.response.b.a.dh(r5)
            if (r5 == 0) goto L2a
            h(r4)
            r4 = 1
            return r4
        L2a:
            r4 = 0
            return r4
    }

    private static void h(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.k$1 r0 = new com.kwad.components.ad.reward.k$1
            r0.<init>(r1)
            com.kwad.sdk.core.network.o r1 = i(r1)
            r0.request(r1)
            return
    }

    private static com.kwad.sdk.core.network.o<com.kwad.components.core.request.m, com.kwad.components.ad.reward.model.RewardFraudVerifyRespInfo> i(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.k$2 r0 = new com.kwad.components.ad.reward.k$2
            r0.<init>(r1)
            return r0
    }
}
