package com.kwad.components.core.e.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    private static boolean PE;
    private static final com.kwad.components.core.e.d.b PF = null;




    static {
            com.kwad.components.core.e.d.d$3 r0 = new com.kwad.components.core.e.d.d$3
            r0.<init>()
            com.kwad.components.core.e.d.d.PF = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(com.kwad.components.core.e.d.a.C0073a r6, int r7) {
            android.content.Context r7 = r6.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.getAdTemplate()
            java.lang.String r0 = a(r6, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L14
            r6 = 0
            return r6
        L14:
            com.kwad.sdk.core.response.model.AdInfo r5 = com.kwad.sdk.core.response.b.e.el(r1)
            android.app.Activity r2 = com.kwad.sdk.o.m.ej(r7)
            if (r2 == 0) goto L33
            boolean r3 = com.kwad.sdk.core.response.b.a.T(r5)
            if (r3 == 0) goto L33
            boolean r3 = r6.pf()
            if (r3 != 0) goto L33
            r7 = 1
            r6.ay(r7)
            com.kwad.components.core.e.e.e.a(r2, r6)
            r6 = 2
            return r6
        L33:
            java.lang.String r2 = a(r0, r6, r5)
            com.kwad.components.core.e.d.d$1 r0 = new com.kwad.components.core.e.d.d$1
            r4 = 1
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            int r6 = com.kwad.sdk.core.download.a.b.a(r7, r2, r0)
            return r6
    }

    private static java.lang.String a(com.kwad.components.core.e.d.a.C0073a r3, com.kwad.sdk.core.response.model.AdInfo r4, java.lang.String r5) {
            boolean r0 = com.kwad.sdk.core.response.b.a.bj(r4)
            if (r0 != 0) goto L7
            return r5
        L7:
            java.util.concurrent.Callable r0 = r3.pe()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
            r0 = 0
        L15:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = r3.pd()
        L1f:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "__simpleItemId__"
            java.lang.String r2 = "__itemId__"
            if (r3 == 0) goto L3c
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto L37
            boolean r3 = r5.contains(r1)
            if (r3 == 0) goto L36
            goto L37
        L36:
            return r5
        L37:
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.cT(r4)
            return r3
        L3c:
            long r3 = com.kwad.components.core.e.b.a.ai(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r3 = r0
        L46:
            java.lang.String r4 = r5.replaceAll(r2, r0)
            java.lang.String r3 = r4.replaceAll(r1, r3)
            return r3
    }

    private static java.lang.String a(com.kwad.components.core.e.d.a.C0073a r5, com.kwad.sdk.core.response.model.AdTemplate r6) {
            com.kwad.sdk.core.response.model.AdInfo r6 = com.kwad.sdk.core.response.b.e.el(r6)
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r6.adConversionInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo$DeeplinkItemInfo> r0 = r0.deeplinkConf
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo$DeeplinkItemInfo r1 = (com.kwad.sdk.core.response.model.AdInfo.AdConversionInfo.DeeplinkItemInfo) r1
            java.util.List<java.lang.Integer> r2 = r1.areaConf
            int r3 = r5.dZ()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            java.util.List<java.lang.Integer> r3 = r1.sceneConf
            int r4 = r5.pj()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r2 == 0) goto L38
            if (r3 != 0) goto L4c
        L38:
            if (r2 == 0) goto L42
            java.util.List<java.lang.Integer> r2 = r1.sceneConf
            int r2 = r2.size()
            if (r2 == 0) goto L4c
        L42:
            if (r3 == 0) goto Lc
            java.util.List<java.lang.Integer> r2 = r1.areaConf
            int r2 = r2.size()
            if (r2 != 0) goto Lc
        L4c:
            java.lang.String r2 = r1.url
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r1.url
            r5.append(r0)
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r6 = r6.adConversionInfo
            java.lang.String r6 = r6.deeplinkExtra
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            return r5
        L6a:
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.cT(r6)
            return r5
    }

    private static java.lang.String a(java.lang.String r1, int r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto Lc
        L7:
            if (r2 == 0) goto Ld
            r0 = 3
            if (r2 == r0) goto Ld
        Lc:
            return r1
        Ld:
            java.lang.String r1 = l(r1, r3)
            return r1
    }

    private static java.lang.String a(java.lang.String r3, android.content.Context r4, com.kwad.sdk.internal.api.SceneImpl r5) {
            java.lang.String r0 = ""
            if (r5 == 0) goto L28
            java.lang.String r1 = "com.smile.gifmaker"
            boolean r1 = com.kwad.sdk.utils.as.ap(r4, r1)
            r2 = 0
            if (r1 == 0) goto Le
            goto L17
        Le:
            java.lang.String r1 = "com.kuaishou.nebula"
            boolean r4 = com.kwad.sdk.utils.as.ap(r4, r1)
            if (r4 == 0) goto L17
            r2 = 3
        L17:
            java.lang.String r4 = r5.getBackUrl()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L22
            goto L23
        L22:
            r0 = r4
        L23:
            java.lang.String r3 = a(r3, r2, r0)
            return r3
        L28:
            return r0
    }

    private static java.lang.String a(java.lang.String r2, com.kwad.components.core.e.d.a.C0073a r3, com.kwad.sdk.core.response.model.AdInfo r4) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.getAdTemplate()
            boolean r1 = com.kwad.sdk.core.response.b.a.bm(r4)
            if (r1 == 0) goto Le
            java.lang.String r2 = b(r3, r4, r2)
        Le:
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r4)
            if (r1 == 0) goto L18
            java.lang.String r2 = a(r3, r4, r2)
        L18:
            boolean r1 = com.kwad.sdk.core.response.b.a.cJ(r4)
            if (r1 != 0) goto L24
            boolean r4 = com.kwad.sdk.core.response.b.a.cP(r4)
            if (r4 == 0) goto L32
        L24:
            com.kwad.sdk.internal.api.SceneImpl r4 = r0.mAdScene
            if (r4 == 0) goto L32
            android.content.Context r3 = r3.getContext()
            com.kwad.sdk.internal.api.SceneImpl r4 = r0.mAdScene
            java.lang.String r2 = a(r2, r3, r4)
        L32:
            return r2
    }

    private static void a(com.kwad.sdk.core.response.model.AdTemplate r4, java.lang.String r5, int r6) {
            boolean r0 = pS()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            aA(r0)
            int r0 = com.kwad.sdk.core.config.e.Fo()
            com.kwad.sdk.core.config.e.Fp()
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= 0) goto L27
            com.kwad.components.core.e.d.d$2 r1 = new com.kwad.components.core.e.d.d$2
            r1.<init>(r4, r6, r5)
            long r4 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            r6 = 0
            com.kwad.sdk.utils.bw.a(r1, r6, r4)
            return
        L27:
            r4 = 0
            aA(r4)
            return
    }

    private static void aA(boolean r0) {
            com.kwad.components.core.e.d.d.PE = r0
            return
    }

    static /* synthetic */ void aB(boolean r0) {
            r0 = 0
            aA(r0)
            return
    }

    private static org.json.JSONObject an(java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "universeClientInfo"
            java.lang.String r2 = r2.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r2 = 0
            return r2
    }

    static /* synthetic */ org.json.JSONObject ao(java.lang.String r0) {
            org.json.JSONObject r0 = an(r0)
            return r0
    }

    public static void az(boolean r0) {
            com.kwad.sdk.core.adlog.c.axo = r0
            return
    }

    private static java.lang.String b(com.kwad.components.core.e.d.a.C0073a r4, com.kwad.sdk.core.response.model.AdInfo r5, java.lang.String r6) {
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.getAdTemplate()
            long r0 = r4.getmCurPlayTime()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            long r4 = com.kwad.sdk.core.response.b.a.bn(r5)
            long r0 = r0 - r4
            long r0 = java.lang.Math.max(r0, r2)
        L17:
            android.net.Uri r4 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r4 = r4.buildUpon()
            java.lang.String r5 = "playStartTime"
            java.lang.String r6 = java.lang.String.valueOf(r0)
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r5, r6)
            java.lang.String r4 = r4.toString()
            return r4
    }

    static /* synthetic */ void b(com.kwad.sdk.core.response.model.AdTemplate r0, java.lang.String r1, int r2) {
            a(r0, r1, r2)
            return
    }

    private static java.lang.String l(java.lang.String r2, java.lang.String r3) {
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "liveunion_"
            r0.<init>(r1)
            java.lang.String r1 = com.kwad.sdk.service.ServiceProvider.getAppId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "returnBack"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L28
            java.lang.String r3 = "0"
        L28:
            java.lang.String r0 = "back_url"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static boolean pS() {
            boolean r0 = com.kwad.components.core.e.d.d.PE
            return r0
    }

    static /* synthetic */ com.kwad.components.core.e.d.b pT() {
            com.kwad.components.core.e.d.b r0 = com.kwad.components.core.e.d.d.PF
            return r0
    }
}
