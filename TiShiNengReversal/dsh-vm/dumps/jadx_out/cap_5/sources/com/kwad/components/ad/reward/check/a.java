package com.kwad.components.ad.reward.check;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, int r4, long r5, int r7, java.lang.String r8) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r1 = new com.kwad.components.ad.reward.check.RewardCheckMonitorInfo
            r1.<init>()
            r2 = 2
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r1 = r1.setRequestStatus(r2)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r1.setCheckType(r4)
            r1 = 0
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setEnviType(r1)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setDataLoadInterval(r5)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setCode(r7)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setErrorMsg(r8)
            long r5 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setCreativeId(r5)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.f(r3)
            return
    }

    public static void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, int r4) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r1 = new com.kwad.components.ad.reward.check.RewardCheckMonitorInfo
            r1.<init>()
            r2 = 1
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r1 = r1.setRequestStatus(r2)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r1.setCheckType(r4)
            r1 = 0
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setEnviType(r1)
            long r0 = com.kwad.sdk.core.response.b.a.J(r0)
            com.kwad.components.ad.reward.check.RewardCheckMonitorInfo r4 = r4.setCreativeId(r0)
            com.kwad.sdk.commercial.c.a r3 = r4.setAdTemplate(r3)
            com.kwad.sdk.commercial.b.f(r3)
            return
    }
}
