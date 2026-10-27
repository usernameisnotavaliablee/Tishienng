package com.kwad.components.ad.reward.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private long jn;
    private com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener uM;

    public c(long r1, com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener r3) {
            r0 = this;
            r0.<init>()
            r0.jn = r1
            r0.uM = r3
            return
    }

    public final void c(com.kwad.sdk.core.response.model.AdTemplate r13, @androidx.annotation.Nullable java.util.List<com.kwad.sdk.api.KsRewardVideoAd> r14) {
            r12 = this;
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r2 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_SUCCESS_BEFORE
            long r3 = r12.jn
            r5 = 0
            r0 = 1
            r1 = r13
            com.kwad.components.ad.reward.monitor.c.a(r0, r1, r2, r3, r5)
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()
            if (r13 == 0) goto L23
            int r0 = r13.length
            r2 = 3
            if (r0 <= r2) goto L23
            if (r1 == 0) goto L23
            r0 = 2
            r13 = r13[r0]
            java.lang.String r13 = com.kwad.components.core.t.f.a(r13)
            r1.mDataLoadTraceElement = r13
        L23:
            com.kwad.sdk.api.KsLoadManager$RewardVideoAdListener r13 = r12.uM
            if (r13 == 0) goto L2a
            r13.onRewardVideoResult(r14)
        L2a:
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r8 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_SUCCESS
            long r9 = r12.jn
            r11 = 0
            r6 = 1
            r7 = r1
            com.kwad.components.ad.reward.monitor.c.a(r6, r7, r8, r9, r11)
            return
    }

    public final void d(com.kwad.sdk.core.response.model.AdTemplate r13, @androidx.annotation.Nullable java.util.List<com.kwad.sdk.api.KsRewardVideoAd> r14) {
            r12 = this;
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r2 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_CACHE_SUCCESS_BEFORE
            long r3 = r12.jn
            r5 = 0
            r0 = 1
            r1 = r13
            com.kwad.components.ad.reward.monitor.c.a(r0, r1, r2, r3, r5)
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()
            if (r13 == 0) goto L23
            int r0 = r13.length
            r2 = 3
            if (r0 <= r2) goto L23
            if (r1 == 0) goto L23
            r0 = 2
            r13 = r13[r0]
            java.lang.String r13 = com.kwad.components.core.t.f.a(r13)
            r1.mDataCacheTraceElement = r13
        L23:
            com.kwad.sdk.api.KsLoadManager$RewardVideoAdListener r13 = r12.uM
            if (r13 == 0) goto L2a
            r13.onRewardVideoAdLoad(r14)
        L2a:
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r8 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_CACHE_SUCCESS
            long r9 = r12.jn
            r11 = 0
            r6 = 1
            r7 = r1
            com.kwad.components.ad.reward.monitor.c.a(r6, r7, r8, r9, r11)
            return
    }

    public final void onError(int r8, java.lang.String r9) {
            r7 = this;
            com.kwad.sdk.api.KsLoadManager$RewardVideoAdListener r0 = r7.uM
            if (r0 == 0) goto L7
            r0.onError(r8, r9)
        L7:
            com.kwad.components.ad.reward.monitor.RewardLoadCallbackType r3 = com.kwad.components.ad.reward.monitor.RewardLoadCallbackType.LOAD_ERROR
            long r4 = r7.jn
            r6 = 0
            r1 = 1
            r2 = 0
            com.kwad.components.ad.reward.monitor.c.a(r1, r2, r3, r4, r6)
            return
    }
}
