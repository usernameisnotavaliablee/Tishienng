package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class o {
    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(int r2, int r3, com.kwad.components.ad.reward.g r4, com.kwad.components.ad.reward.model.c r5) {
            r0 = 1
            if (r2 == 0) goto L60
            if (r2 == r0) goto L34
            r1 = 2
            if (r2 == r1) goto L9
            goto L45
        L9:
            if (r3 != 0) goto L1b
            com.kwad.components.ad.reward.l.b.a r2 = r4.sm
            boolean r2 = r2.kL()
            if (r2 == 0) goto L45
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            com.kwad.sdk.core.adlog.c.l(r2, r0)
            return
        L1b:
            com.kwad.components.ad.reward.l.b.a r2 = r4.sm
            boolean r2 = r2.kL()
            if (r2 == 0) goto L2c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            r3 = 3
            com.kwad.sdk.core.adlog.c.l(r2, r3)
            return
        L2c:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            com.kwad.sdk.core.adlog.c.l(r2, r1)
            return
        L34:
            if (r3 != 0) goto L46
            com.kwad.components.ad.reward.l.a.a r2 = r4.sn
            boolean r2 = r2.kL()
            if (r2 == 0) goto L45
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            com.kwad.sdk.core.adlog.c.l(r2, r0)
        L45:
            return
        L46:
            com.kwad.components.ad.reward.l.a.a r2 = r4.sn
            boolean r2 = r2.kL()
            if (r2 == 0) goto L57
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            r3 = 5
            com.kwad.sdk.core.adlog.c.l(r2, r3)
            return
        L57:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            r3 = 4
            com.kwad.sdk.core.adlog.c.l(r2, r3)
            return
        L60:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.getAdTemplate()
            com.kwad.sdk.core.adlog.c.l(r2, r0)
            return
    }
}
