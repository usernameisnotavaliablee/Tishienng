package com.kwad.components.ad.reward.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void S(@androidx.annotation.NonNull android.content.Context r6) {
            long r0 = java.lang.System.currentTimeMillis()
            com.kwad.components.ad.reward.d.b r2 = new com.kwad.components.ad.reward.d.b
            r2.<init>()
            java.lang.String r3 = com.kwad.sdk.utils.ag.cY(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L2b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r4.<init>(r3)     // Catch: java.lang.Exception -> L27
            r2.parseJson(r4)     // Catch: java.lang.Exception -> L27
            long r3 = r2.jC     // Catch: java.lang.Exception -> L27
            boolean r3 = b(r3, r0)     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L2b
            int r5 = r2.ur     // Catch: java.lang.Exception -> L27
            goto L2b
        L27:
            r3 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r3)
        L2b:
            r2.jC = r0
            int r5 = r5 + 1
            r2.ur = r5
            org.json.JSONObject r0 = r2.toJson()
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.utils.ag.ad(r6, r0)
            return
    }

    private static boolean b(long r4, long r6) {
            r0 = 0
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L19
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto Lc
            goto L19
        Lc:
            r1 = 2460601000(0x92a9caa8, double:1.215698422E-314)
            long r4 = r4 / r1
            long r6 = r6 / r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L19
            r4 = 1
            return r4
        L19:
            return r0
    }

    public static boolean b(@androidx.annotation.NonNull android.content.Context r4, com.kwad.sdk.core.response.model.AdInfo r5) {
            boolean r0 = com.kwad.sdk.core.response.b.a.aG(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = com.kwad.sdk.core.response.b.a.aH(r5)
            r2 = 1
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r0, r2)
            boolean r3 = d(r4, r0)
            c(r4, r0)
            int r5 = com.kwad.sdk.core.response.b.a.aI(r5)
            boolean r4 = e(r4, r5)
            if (r3 == 0) goto L26
            if (r4 == 0) goto L26
            return r2
        L26:
            return r1
    }

    private static void c(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            int r0 = com.kwad.sdk.utils.ag.cX(r2)
            int r3 = r0 % r3
            r1 = 1
            if (r3 != 0) goto Ld
            com.kwad.sdk.utils.ag.m(r2, r1)
            return
        Ld:
            int r0 = r0 + r1
            com.kwad.sdk.utils.ag.m(r2, r0)
            return
    }

    private static boolean d(@androidx.annotation.NonNull android.content.Context r0, int r1) {
            int r0 = com.kwad.sdk.utils.ag.cX(r0)
            if (r1 == 0) goto Lb
            int r0 = r0 % r1
            if (r0 != 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static boolean e(@androidx.annotation.NonNull android.content.Context r7, int r8) {
            long r0 = java.lang.System.currentTimeMillis()
            com.kwad.components.ad.reward.d.b r2 = new com.kwad.components.ad.reward.d.b
            r2.<init>()
            java.lang.String r7 = com.kwad.sdk.utils.ag.cY(r7)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 != 0) goto L29
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r3.<init>(r7)     // Catch: java.lang.Exception -> L27
            r2.parseJson(r3)     // Catch: java.lang.Exception -> L27
            long r5 = r2.jC     // Catch: java.lang.Exception -> L27
            boolean r7 = b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L29
            int r7 = r2.ur     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            r7 = move-exception
            goto L2b
        L29:
            r7 = 0
            goto L2f
        L2b:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r7)
            goto L29
        L2f:
            if (r7 >= r8) goto L33
            r7 = 1
            return r7
        L33:
            return r4
    }
}
