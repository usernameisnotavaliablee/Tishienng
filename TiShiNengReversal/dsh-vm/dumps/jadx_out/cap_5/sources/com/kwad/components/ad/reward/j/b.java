package com.kwad.components.ad.reward.j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {


    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2, com.kwad.sdk.core.response.model.AdTemplate r3, java.lang.String r4, int r5, org.json.JSONObject r6) {
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r1 = 18
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r1)
            com.kwad.components.ad.reward.j.b$1 r1 = new com.kwad.components.ad.reward.j.b$1
            r1.<init>(r2, r5)
            r2 = 0
            r0.b(r3, r4, r2, r1)
            com.kwad.sdk.core.adlog.c.d(r3, r6, r0)
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r1, java.lang.String r2, java.lang.String r3, com.kwad.sdk.core.adlog.c.b r4, org.json.JSONObject r5) {
            if (r4 != 0) goto L7
            com.kwad.sdk.core.adlog.c.b r4 = new com.kwad.sdk.core.adlog.c.b
            r4.<init>()
        L7:
            r0 = 0
            r4.b(r1, r2, r3, r0)
            com.kwad.sdk.core.adlog.c.a(r1, r4, r5)
            return
    }

    public static void a(boolean r1, com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.Nullable org.json.JSONObject r3, @androidx.annotation.Nullable com.kwad.sdk.core.adlog.c.b r4) {
            com.kwad.components.core.t.b r0 = com.kwad.components.core.t.b.sY()
            boolean r3 = r0.a(r2, r3, r4)
            if (r1 == 0) goto L19
            if (r3 == 0) goto L19
            int r1 = com.kwad.sdk.core.response.b.e.ef(r2)
            r3 = 2
            if (r1 != r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            com.kwad.components.ad.reward.monitor.c.e(r1, r2)
        L19:
            return
    }
}
