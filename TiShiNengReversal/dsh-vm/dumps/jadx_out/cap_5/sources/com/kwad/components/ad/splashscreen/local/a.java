package com.kwad.components.ad.splashscreen.local;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.core.response.a.a {
    private static java.text.SimpleDateFormat jB;
    public long jC;
    public int jD;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            com.kwad.components.ad.splashscreen.local.a.jB = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.jC = r0
            r0 = 0
            r2.jD = r0
            return
    }

    public static void V(android.content.Context r8) {
            java.lang.String r0 = com.kwad.sdk.utils.ag.Qv()
            com.kwad.components.ad.splashscreen.local.a r1 = new com.kwad.components.ad.splashscreen.local.a
            r1.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r2 == 0) goto L24
            r1.jD = r3
            long r2 = java.lang.System.currentTimeMillis()
            r1.jC = r2
            org.json.JSONObject r0 = r1.toJson()
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.utils.ag.af(r8, r0)
            return
        L24:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r2.<init>(r0)     // Catch: java.lang.Exception -> L52
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L52
            long r4 = r1.jC     // Catch: java.lang.Exception -> L52
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L52
            boolean r0 = b(r4, r6)     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L3e
            int r0 = r1.jD     // Catch: java.lang.Exception -> L52
            int r0 = r0 + r3
            r1.jD = r0     // Catch: java.lang.Exception -> L52
            goto L40
        L3e:
            r1.jD = r3     // Catch: java.lang.Exception -> L52
        L40:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L52
            r1.jC = r2     // Catch: java.lang.Exception -> L52
            org.json.JSONObject r0 = r1.toJson()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L52
            com.kwad.sdk.utils.ag.af(r8, r0)     // Catch: java.lang.Exception -> L52
            return
        L52:
            r8 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r8)
            return
    }

    private static boolean b(long r4, long r6) {
            r0 = 0
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L2b
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto Lc
            goto L2b
        Lc:
            java.text.SimpleDateFormat r1 = com.kwad.components.ad.splashscreen.local.a.jB     // Catch: java.lang.Exception -> L27
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Exception -> L27
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r1.format(r2)     // Catch: java.lang.Exception -> L27
            java.text.SimpleDateFormat r5 = com.kwad.components.ad.splashscreen.local.a.jB     // Catch: java.lang.Exception -> L27
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Exception -> L27
            r1.<init>(r6)     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r5.format(r1)     // Catch: java.lang.Exception -> L27
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L27
            return r4
        L27:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
        L2b:
            return r0
    }
}
