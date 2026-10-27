package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class f extends com.kwad.sdk.core.network.d {
    public f(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            r2.<init>()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bS(r0)
            java.lang.String r1 = "callbackUrlInfo"
            r2.putBody(r1, r0)
            com.kwad.components.core.request.model.ImpInfo r0 = new com.kwad.components.core.request.model.ImpInfo
            com.kwad.sdk.internal.api.SceneImpl r1 = r3.mAdScene
            r0.<init>(r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r0 = r0.toJson()
            com.kwad.sdk.utils.aa.a(r1, r0)
            java.lang.String r0 = "impInfo"
            r2.putBody(r0, r1)
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)     // Catch: org.json.JSONException -> L40
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.bT(r3)     // Catch: org.json.JSONException -> L40
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L40
            if (r0 != 0) goto L40
            java.lang.String r0 = "serverExt"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r1.<init>(r3)     // Catch: org.json.JSONException -> L40
            r2.putBody(r0, r1)     // Catch: org.json.JSONException -> L40
        L40:
            return
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AR()
            return r0
    }
}
