package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m extends com.kwad.sdk.core.network.d {
    public m(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            r4.<init>()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bS(r0)
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r5)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.bT(r1)     // Catch: java.lang.Exception -> L27
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r5)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.bU(r2)     // Catch: java.lang.Exception -> L27
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L27
            if (r3 != 0) goto L29
            java.lang.String r3 = "adExt"
            r4.putBody(r3, r2)     // Catch: java.lang.Exception -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L50
        L29:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto L39
            java.lang.String r2 = "serverExt"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r3.<init>(r1)     // Catch: java.lang.Exception -> L27
            r4.putBody(r2, r3)     // Catch: java.lang.Exception -> L27
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto L53
            if (r0 == 0) goto L53
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r1.<init>(r0)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "callbackUrlInfo"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L27
            r4.putBody(r0, r1)     // Catch: java.lang.Exception -> L27
            goto L53
        L50:
            com.kwad.sdk.core.d.c.printStackTrace(r0)
        L53:
            com.kwad.components.core.request.model.ImpInfo r0 = new com.kwad.components.core.request.model.ImpInfo
            com.kwad.sdk.internal.api.SceneImpl r5 = r5.mAdScene
            r0.<init>(r5)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONObject r0 = r0.toJson()
            com.kwad.sdk.utils.aa.a(r5, r0)
            java.lang.String r0 = "impInfo"
            r4.putBody(r0, r5)
            return
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.f
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = com.kwad.sdk.h.AW()
            return r0
    }
}
