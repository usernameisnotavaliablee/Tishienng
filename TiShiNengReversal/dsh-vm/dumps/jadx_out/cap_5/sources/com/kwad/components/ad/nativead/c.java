package com.kwad.components.ad.nativead;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {






    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void loadNativeAd(com.kwad.sdk.api.KsScene r4, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.NativeAdListener r5) {
            com.kwad.sdk.internal.api.SceneImpl r4 = com.kwad.sdk.internal.api.SceneImpl.covert(r4)
            com.kwad.sdk.commercial.d.d.c(r4)
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            java.lang.String r1 = "loadNativeAd"
            boolean r0 = r0.b(r4, r1)
            r1 = 10000(0x2710, float:1.4013E-41)
            r4.setAdStyle(r1)
            com.kwad.components.ad.KsAdLoadManager r1 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r2 = new com.kwad.components.core.request.model.a$a
            r2.<init>()
            com.kwad.components.core.request.model.ImpInfo r3 = new com.kwad.components.core.request.model.ImpInfo
            r3.<init>(r4)
            com.kwad.components.core.request.model.a$a r2 = r2.e(r3)
            com.kwad.components.core.request.model.a$a r0 = r2.aM(r0)
            com.kwad.components.ad.nativead.c$1 r2 = new com.kwad.components.ad.nativead.c$1
            r2.<init>(r5, r4)
            com.kwad.components.core.request.model.a$a r4 = r0.a(r2)
            com.kwad.components.core.request.model.a r4 = r4.sw()
            r1.a(r4)
            return
    }

    public static void loadNativeAd(java.lang.String r3, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.NativeAdListener r4) {
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            r1 = 0
            java.lang.String r2 = "loadNativeAdByJson"
            boolean r0 = r0.b(r1, r2)
            r1 = 1
            if (r0 == 0) goto L19
            com.kwad.components.core.t.n r0 = com.kwad.components.core.t.n.tn()
            int r0 = r0.to()
            if (r0 != r1) goto L19
            return
        L19:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L27
            com.kwad.components.ad.nativead.c$2 r0 = new com.kwad.components.ad.nativead.c$2
            r0.<init>(r4)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
        L27:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L41
            r0.<init>(r3)     // Catch: org.json.JSONException -> L41
            com.kwad.sdk.core.response.model.AdResultData r3 = new com.kwad.sdk.core.response.model.AdResultData     // Catch: org.json.JSONException -> L41
            r3.<init>()     // Catch: org.json.JSONException -> L41
            r3.parseJson(r0)     // Catch: org.json.JSONException -> L41
            int r0 = r3.result     // Catch: org.json.JSONException -> L41
            if (r0 == r1) goto L43
            com.kwad.components.ad.nativead.c$3 r0 = new com.kwad.components.ad.nativead.c$3     // Catch: org.json.JSONException -> L41
            r0.<init>(r3, r4)     // Catch: org.json.JSONException -> L41
            com.kwad.sdk.utils.bw.runOnUiThread(r0)     // Catch: org.json.JSONException -> L41
            return
        L41:
            r3 = move-exception
            goto L7f
        L43:
            boolean r0 = r3.isAdResultDataEmpty()     // Catch: org.json.JSONException -> L41
            if (r0 == 0) goto L52
            com.kwad.components.ad.nativead.c$4 r0 = new com.kwad.components.ad.nativead.c$4     // Catch: org.json.JSONException -> L41
            r0.<init>(r4, r3)     // Catch: org.json.JSONException -> L41
            com.kwad.sdk.utils.bw.runOnUiThread(r0)     // Catch: org.json.JSONException -> L41
            return
        L52:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L41
            r0.<init>()     // Catch: org.json.JSONException -> L41
            java.util.List r3 = r3.getAdTemplateList()     // Catch: org.json.JSONException -> L41
            java.util.Iterator r3 = r3.iterator()     // Catch: org.json.JSONException -> L41
        L5f:
            boolean r1 = r3.hasNext()     // Catch: org.json.JSONException -> L41
            if (r1 == 0) goto L76
            java.lang.Object r1 = r3.next()     // Catch: org.json.JSONException -> L41
            com.kwad.sdk.core.response.model.AdTemplate r1 = (com.kwad.sdk.core.response.model.AdTemplate) r1     // Catch: org.json.JSONException -> L41
            if (r1 == 0) goto L5f
            com.kwad.components.ad.nativead.d r2 = new com.kwad.components.ad.nativead.d     // Catch: org.json.JSONException -> L41
            r2.<init>(r1)     // Catch: org.json.JSONException -> L41
            r0.add(r2)     // Catch: org.json.JSONException -> L41
            goto L5f
        L76:
            com.kwad.components.ad.nativead.c$5 r3 = new com.kwad.components.ad.nativead.c$5     // Catch: org.json.JSONException -> L41
            r3.<init>(r4, r0)     // Catch: org.json.JSONException -> L41
            com.kwad.sdk.utils.bw.runOnUiThread(r3)     // Catch: org.json.JSONException -> L41
            return
        L7f:
            com.kwad.sdk.core.d.c.printStackTrace(r3)
            com.kwad.sdk.core.network.e r3 = com.kwad.sdk.core.network.e.aEp
            int r0 = r3.errorCode
            java.lang.String r3 = r3.msg
            r4.onError(r0, r3)
            return
    }
}
