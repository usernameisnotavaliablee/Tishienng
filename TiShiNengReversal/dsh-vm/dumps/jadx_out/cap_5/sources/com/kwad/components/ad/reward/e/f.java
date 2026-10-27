package com.kwad.components.ad.reward.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f {
    private static final java.util.HashMap<java.lang.String, com.kwad.components.ad.reward.e.f> us = null;
    private com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener mInteractionListener;
    private com.kwad.components.core.j.d rt;
    private com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener ut;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.components.ad.reward.e.f.us = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static com.kwad.components.ad.reward.e.f M(java.lang.String r1) {
            java.util.HashMap<java.lang.String, com.kwad.components.ad.reward.e.f> r0 = com.kwad.components.ad.reward.e.f.us
            java.lang.Object r1 = r0.get(r1)
            com.kwad.components.ad.reward.e.f r1 = (com.kwad.components.ad.reward.e.f) r1
            return r1
    }

    public static com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener N(java.lang.String r0) {
            com.kwad.components.ad.reward.e.f r0 = M(r0)
            if (r0 == 0) goto L9
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r0.ut
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static void O(java.lang.String r1) {
            com.kwad.components.ad.reward.e.f r1 = M(r1)
            if (r1 == 0) goto La
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = r1.mInteractionListener
            r1.ut = r0
        La:
            return
    }

    public static com.kwad.components.core.j.d P(java.lang.String r0) {
            com.kwad.components.ad.reward.e.f r0 = M(r0)
            if (r0 == 0) goto L9
            com.kwad.components.core.j.d r0 = r0.rt
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static void Q(java.lang.String r2) {
            com.kwad.components.ad.reward.e.f r0 = M(r2)
            if (r0 == 0) goto Lf
            r0.destroy()
            java.util.HashMap<java.lang.String, com.kwad.components.ad.reward.e.f> r0 = com.kwad.components.ad.reward.e.f.us
            r1 = 0
            r0.put(r2, r1)
        Lf:
            return
    }

    public static void a(java.lang.String r1, com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r2, com.kwad.components.core.j.d r3) {
            com.kwad.components.ad.reward.e.f r0 = new com.kwad.components.ad.reward.e.f
            r0.<init>()
            r0.mInteractionListener = r2
            r0.rt = r3
            r0.ut = r2
            java.util.HashMap<java.lang.String, com.kwad.components.ad.reward.e.f> r2 = com.kwad.components.ad.reward.e.f.us
            r2.put(r1, r0)
            return
    }

    private void destroy() {
            r2 = this;
            r0 = 0
            r2.mInteractionListener = r0
            r2.ut = r0
            com.kwad.components.core.j.d r1 = r2.rt
            if (r1 == 0) goto Le
            r1.destroy()
            r2.rt = r0
        Le:
            return
    }
}
