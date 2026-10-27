package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.sdk.core.network.d {
    public long requestStartTime;

    public f(int r5, com.kwad.sdk.core.response.model.AdTemplate r6) {
            r4 = this;
            r4.<init>()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r6)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bS(r0)
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r6)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.bT(r1)     // Catch: java.lang.Exception -> L24
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L24 org.json.JSONException -> L26
            if (r2 != 0) goto L2a
            java.lang.String r2 = "serverExt"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24 org.json.JSONException -> L26
            r3.<init>(r1)     // Catch: java.lang.Exception -> L24 org.json.JSONException -> L26
            r4.putBody(r2, r3)     // Catch: java.lang.Exception -> L24 org.json.JSONException -> L26
            goto L2a
        L24:
            r5 = move-exception
            goto L46
        L26:
            r1 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r1)     // Catch: java.lang.Exception -> L24
        L2a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L49
            if (r0 == 0) goto L49
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
            r1.<init>(r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = "checkType"
            com.kwad.sdk.utils.aa.putValue(r1, r0, r5)     // Catch: java.lang.Exception -> L24
            java.lang.String r5 = "callbackUrlInfo"
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L24
            r4.putBody(r5, r0)     // Catch: java.lang.Exception -> L24
            goto L49
        L46:
            com.kwad.sdk.core.d.c.printStackTrace(r5)
        L49:
            com.kwad.components.core.request.model.ImpInfo r5 = new com.kwad.components.core.request.model.ImpInfo
            com.kwad.sdk.internal.api.SceneImpl r6 = r6.mAdScene
            r5.<init>(r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONObject r5 = r5.toJson()
            com.kwad.sdk.utils.aa.a(r6, r5)
            java.lang.String r5 = "impInfo"
            r4.putBody(r5, r6)
            return
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AV()
            return r0
    }
}
