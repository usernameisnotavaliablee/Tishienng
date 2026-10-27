package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m {




    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(int r2, com.kwad.components.ad.reward.g r3) {
            com.kwad.components.ad.reward.m$1 r0 = new com.kwad.components.ad.reward.m$1
            r0.<init>(r2, r3)
            r1 = 1
            if (r2 != r1) goto L10
            com.kwad.sdk.core.network.o r2 = k(r3)
            r0.request(r2)
            return
        L10:
            r1 = 2
            if (r2 != r1) goto L1a
            com.kwad.sdk.core.network.o r2 = l(r3)
            r0.request(r2)
        L1a:
            return
    }

    public static void b(com.kwad.components.ad.reward.g r7, long r8, long r10, long r12) {
            boolean r0 = m(r7)
            r1 = 0
            if (r0 == 0) goto L13
            com.kwad.sdk.core.response.model.AdTemplate r3 = r7.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            long r3 = com.kwad.sdk.core.response.b.a.de(r3)
            goto L14
        L13:
            r3 = r1
        L14:
            boolean r5 = r7.sd
            if (r5 != 0) goto L46
            if (r0 == 0) goto L46
            boolean r0 = r7.mCheckExposureResult
            if (r0 == 0) goto L46
            r5 = 800(0x320, double:3.953E-321)
            long r10 = r10 - r5
            long r10 = r10 - r12
            long r10 = r10 - r3
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L46
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L46
            com.kwad.sdk.core.response.model.AdTemplate r8 = r7.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r8 = com.kwad.sdk.core.response.b.e.el(r8)
            boolean r8 = com.kwad.sdk.core.response.b.a.df(r8)
            r9 = 1
            if (r8 == 0) goto L3f
            r7.sc = r9
            r8 = 2
            a(r8, r7)
            goto L44
        L3f:
            com.kwad.components.ad.reward.e.b r8 = r7.rD
            r8.onRewardVerify()
        L44:
            r7.sd = r9
        L46:
            return
    }

    private static com.kwad.sdk.core.network.o<com.kwad.components.core.request.f, com.kwad.components.ad.reward.model.RewardCallBackRespInfo> k(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.m$2 r0 = new com.kwad.components.ad.reward.m$2
            r0.<init>(r1)
            return r0
    }

    private static com.kwad.sdk.core.network.o<com.kwad.components.core.request.f, com.kwad.components.ad.reward.model.RewardCallBackRespInfo> l(com.kwad.components.ad.reward.g r1) {
            com.kwad.components.ad.reward.m$3 r0 = new com.kwad.components.ad.reward.m$3
            r0.<init>(r1)
            return r0
    }

    private static boolean m(com.kwad.components.ad.reward.g r2) {
            boolean r0 = r2.sd
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.sdk.core.response.b.a.dg(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            return r1
    }
}
