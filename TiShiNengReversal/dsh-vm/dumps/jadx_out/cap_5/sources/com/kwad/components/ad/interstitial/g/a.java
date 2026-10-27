package com.kwad.components.ad.interstitial.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {


    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean d(com.kwad.components.ad.interstitial.f.c r6) {
            com.kwad.components.ad.interstitial.d r0 = r6.kW
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.app.Activity r0 = r0.getOwnerActivity()
            if (r0 == 0) goto L6c
            boolean r2 = r0.isFinishing()
            if (r2 == 0) goto L13
            goto L6c
        L13:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            int r3 = com.kwad.components.ad.interstitial.c.b.dO()
            int r4 = com.kwad.components.ad.interstitial.c.b.dP()
            int r5 = com.kwad.sdk.core.response.b.a.cw(r2)
            if (r3 <= r5) goto L6c
            int r3 = com.kwad.sdk.core.response.b.a.cx(r2)
            if (r4 >= r3) goto L6c
            int r3 = com.kwad.sdk.core.response.b.a.cy(r2)
            r4 = 2
            r5 = 1
            if (r3 != r4) goto L39
            com.kwad.components.ad.interstitial.h.b.e(r6)
            return r5
        L39:
            int r3 = com.kwad.sdk.core.response.b.a.cy(r2)
            if (r3 != r5) goto L6c
            com.kwad.components.core.page.widget.a r1 = new com.kwad.components.core.page.widget.a
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cz(r2)
            com.kwad.components.ad.interstitial.g.a$1 r3 = new com.kwad.components.ad.interstitial.g.a$1
            r3.<init>(r6)
            r1.<init>(r0, r2, r3)
            r1.show()
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 149(0x95, float:2.09E-43)
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)
            r2 = 8
            com.kwad.sdk.core.adlog.c.b r1 = r1.dk(r2)
            com.kwad.sdk.core.adlog.c.d(r6, r0, r1)
            return r5
        L6c:
            return r1
    }
}
