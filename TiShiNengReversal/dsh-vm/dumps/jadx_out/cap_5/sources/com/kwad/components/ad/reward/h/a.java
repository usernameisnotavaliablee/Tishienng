package com.kwad.components.ad.reward.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public static long uN = -1;
    public static int uO;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void J(android.content.Context r4) {
            com.kwad.components.ad.reward.h.b r0 = new com.kwad.components.ad.reward.h.b
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            boolean r1 = j(r1)
            r2 = 1
            if (r1 == 0) goto L16
            int r1 = com.kwad.components.ad.reward.h.a.uO
            int r1 = r1 + r2
            com.kwad.components.ad.reward.h.a.uO = r1
            goto L18
        L16:
            com.kwad.components.ad.reward.h.a.uO = r2
        L18:
            long r1 = java.lang.System.currentTimeMillis()
            com.kwad.components.ad.reward.h.a.uN = r1
            int r3 = com.kwad.components.ad.reward.h.a.uO
            r0.uP = r3
            r0.jC = r1
            org.json.JSONObject r0 = r0.toJson()
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.utils.ag.ae(r4, r0)
            return
    }

    public static int dO() {
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = j(r0)
            if (r0 != 0) goto Ld
            r0 = 0
            com.kwad.components.ad.reward.h.a.uO = r0
        Ld:
            int r0 = com.kwad.components.ad.reward.h.a.uO
            return r0
    }

    /* renamed from: if, reason: not valid java name */
    private static long m2if() {
            long r0 = com.kwad.components.ad.reward.h.a.uN
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            java.lang.String r0 = com.kwad.sdk.utils.ag.Qu()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L15
            r0 = 0
            return r0
        L15:
            com.kwad.components.ad.reward.h.b r1 = new com.kwad.components.ad.reward.h.b
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2b
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L2b
            long r2 = r1.jC     // Catch: java.lang.Exception -> L2b
            com.kwad.components.ad.reward.h.a.uN = r2     // Catch: java.lang.Exception -> L2b
            int r0 = r1.uP     // Catch: java.lang.Exception -> L2b
            com.kwad.components.ad.reward.h.a.uO = r0     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L2f:
            long r0 = com.kwad.components.ad.reward.h.a.uN
        L31:
            return r0
    }

    private static boolean j(long r6) {
            long r0 = m2if()
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L21
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L21
        L10:
            long r0 = m2if()
            r3 = 2460601000(0x92a9caa8, double:1.215698422E-314)
            long r0 = r0 / r3
            long r6 = r6 / r3
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 != 0) goto L21
            r6 = 1
            return r6
        L21:
            return r2
    }
}
