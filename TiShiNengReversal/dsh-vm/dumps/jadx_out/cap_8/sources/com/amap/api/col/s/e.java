package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e extends com.amap.api.col.s.d<java.lang.String, com.amap.api.services.core.PoiItem> {
    private com.amap.api.services.poisearch.PoiSearch.Query t;

    public e(android.content.Context r1, java.lang.String r2, com.amap.api.services.poisearch.PoiSearch.Query r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.t = r3
            return
    }

    private java.lang.String Q() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "id="
            r0.append(r1)
            T r1 = r3.n
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "&output=json"
            r0.append(r1)
            com.amap.api.services.poisearch.PoiSearch$Query r1 = r3.t
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.getExtensions()
            boolean r1 = com.amap.api.col.s.d.V(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = "&extensions="
            r0.append(r1)
            com.amap.api.services.poisearch.PoiSearch$Query r1 = r3.t
            java.lang.String r1 = r1.getExtensions()
            r0.append(r1)
            goto L38
        L33:
            java.lang.String r1 = "&extensions=base"
            r0.append(r1)
        L38:
            java.lang.String r1 = "&children=1"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&key="
            r1.<init>(r2)
            android.content.Context r2 = r3.q
            java.lang.String r2 = com.amap.api.col.s.x0.i(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static com.amap.api.services.core.PoiItem W(org.json.JSONObject r2) throws org.json.JSONException {
            java.lang.String r0 = "pois"
            org.json.JSONArray r2 = r2.optJSONArray(r0)
            r0 = 0
            if (r2 == 0) goto L1d
            int r1 = r2.length()
            if (r1 > 0) goto L10
            goto L1d
        L10:
            r1 = 0
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 != 0) goto L18
            return r0
        L18:
            com.amap.api.services.core.PoiItem r2 = com.amap.api.col.s.r4.d0(r2)
            return r2
        L1d:
            return r0
    }

    private static com.amap.api.services.core.PoiItem X(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "PoiSearchIdHandler"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc org.json.JSONException -> Le
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lc org.json.JSONException -> Le
            com.amap.api.services.core.PoiItem r2 = W(r1)     // Catch: java.lang.Exception -> Lc org.json.JSONException -> Le
            return r2
        Lc:
            r2 = move-exception
            goto L10
        Le:
            r2 = move-exception
            goto L16
        L10:
            java.lang.String r1 = "paseJSONException"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            goto L1b
        L16:
            java.lang.String r1 = "paseJSONJSONException"
            com.amap.api.col.s.j4.i(r2, r0, r1)
        L1b:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    public final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.core.PoiItem r1 = X(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            java.lang.String r0 = r1.Q()
            return r0
    }

    @Override // com.amap.api.col.s.a3
    protected final com.amap.api.col.s.n.b P() {
            r3 = this;
            com.amap.api.col.s.n$b r0 = new com.amap.api.col.s.n$b
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.h()
            r1.append(r2)
            java.lang.String r2 = r3.M()
            r1.append(r2)
            java.lang.String r2 = "language="
            r1.append(r2)
            com.amap.api.services.core.ServiceSettings r2 = com.amap.api.services.core.ServiceSettings.getInstance()
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a = r1
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/place/detail?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
