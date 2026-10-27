package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b extends com.amap.api.col.s.b4<com.amap.api.services.nearby.NearbySearch.NearbyQuery, com.amap.api.services.nearby.NearbySearchResult> {
    private android.content.Context t;
    private com.amap.api.services.nearby.NearbySearch.NearbyQuery u;

    public b(android.content.Context r1, com.amap.api.services.nearby.NearbySearch.NearbyQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.t = r1
            r0.u = r2
            return
    }

    private com.amap.api.services.nearby.NearbySearchResult U(java.lang.String r3) throws com.amap.api.services.core.AMapException {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r0.<init>(r3)     // Catch: org.json.JSONException -> L1d
            com.amap.api.services.nearby.NearbySearch$NearbyQuery r3 = r2.u     // Catch: org.json.JSONException -> L1d
            int r3 = r3.getType()     // Catch: org.json.JSONException -> L1d
            r1 = 1
            if (r3 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            java.util.ArrayList r3 = com.amap.api.col.s.r4.x(r0, r1)     // Catch: org.json.JSONException -> L1d
            com.amap.api.services.nearby.NearbySearchResult r0 = new com.amap.api.services.nearby.NearbySearchResult     // Catch: org.json.JSONException -> L1d
            r0.<init>()     // Catch: org.json.JSONException -> L1d
            r0.setNearbyInfoList(r3)     // Catch: org.json.JSONException -> L1d
            return r0
        L1d:
            r3 = move-exception
            java.lang.String r0 = "NearbySearchHandler"
            java.lang.String r1 = "paseJSON"
            com.amap.api.col.s.j4.i(r3, r0, r1)
            r3 = 0
            return r3
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.nearby.NearbySearchResult r1 = r0.U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r4.t
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            com.amap.api.services.nearby.NearbySearch$NearbyQuery r1 = r4.u
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenterPoint()
            if (r1 == 0) goto L33
            java.lang.String r2 = "&center="
            r0.append(r2)
            double r2 = r1.getLongitude()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            double r1 = r1.getLatitude()
            r0.append(r1)
        L33:
            java.lang.String r1 = "&radius="
            r0.append(r1)
            com.amap.api.services.nearby.NearbySearch$NearbyQuery r1 = r4.u
            int r1 = r1.getRadius()
            r0.append(r1)
            java.lang.String r1 = "&limit=30"
            r0.append(r1)
            java.lang.String r1 = "&searchtype="
            r0.append(r1)
            com.amap.api.services.nearby.NearbySearch$NearbyQuery r1 = r4.u
            int r1 = r1.getType()
            r0.append(r1)
            java.lang.String r1 = "&timerange="
            r0.append(r1)
            com.amap.api.services.nearby.NearbySearch$NearbyQuery r1 = r4.u
            int r1 = r1.getTimeRange()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.e()
            r0.append(r1)
            java.lang.String r1 = "/nearby/around"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
