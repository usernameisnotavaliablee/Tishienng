package com.kwad.components.ad.adbit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdBitResultData extends com.kwad.sdk.core.response.model.AdResultData {
    private static final long serialVersionUID = -3932631606478587475L;
    public java.util.List<com.kwad.components.ad.adbit.AdBid> adBidList;
    public java.lang.String adxId;

    public AdBitResultData(com.kwad.sdk.internal.api.SceneImpl r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.adBidList = r1
            return
    }

    @Override // com.kwad.sdk.core.response.model.AdResultData, com.kwad.sdk.core.response.model.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(org.json.JSONObject r4) {
            r3 = this;
            super.parseJson(r4)
            java.lang.String r0 = "adxId"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Exception -> L3e
            r3.adxId = r0     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "adBids"
            java.lang.String r4 = r4.optString(r0)     // Catch: java.lang.Exception -> L3e
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L18
            goto L43
        L18:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L3e
            r0.<init>(r4)     // Catch: java.lang.Exception -> L3e
            int r4 = r0.length()     // Catch: java.lang.Exception -> L3e
            if (r4 <= 0) goto L43
            r4 = 0
        L24:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L3e
            if (r4 >= r1) goto L43
            org.json.JSONObject r1 = r0.optJSONObject(r4)     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L40
            com.kwad.components.ad.adbit.AdBid r2 = new com.kwad.components.ad.adbit.AdBid     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            r2.parseJson(r1)     // Catch: java.lang.Exception -> L3e
            java.util.List<com.kwad.components.ad.adbit.AdBid> r1 = r3.adBidList     // Catch: java.lang.Exception -> L3e
            r1.add(r2)     // Catch: java.lang.Exception -> L3e
            goto L40
        L3e:
            r4 = move-exception
            goto L44
        L40:
            int r4 = r4 + 1
            goto L24
        L43:
            return
        L44:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            return
    }
}
