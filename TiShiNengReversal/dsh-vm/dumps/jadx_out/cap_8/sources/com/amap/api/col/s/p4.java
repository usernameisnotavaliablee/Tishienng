package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p4 extends com.amap.api.col.s.b4<com.amap.api.services.geocoder.GeocodeQuery, java.util.ArrayList<com.amap.api.services.geocoder.GeocodeAddress>> {
    public p4(android.content.Context r1, com.amap.api.services.geocoder.GeocodeQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static java.util.ArrayList<com.amap.api.services.geocoder.GeocodeAddress> U(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "GeocodingHandler"
            java.lang.String r1 = "count"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L20 org.json.JSONException -> L22
            r3.<init>(r4)     // Catch: java.lang.Exception -> L20 org.json.JSONException -> L22
            boolean r4 = r3.has(r1)     // Catch: java.lang.Exception -> L20 org.json.JSONException -> L22
            if (r4 != 0) goto L15
            goto L2f
        L15:
            int r4 = r3.getInt(r1)     // Catch: java.lang.Exception -> L20 org.json.JSONException -> L22
            if (r4 <= 0) goto L2f
            java.util.ArrayList r4 = com.amap.api.col.s.r4.r0(r3)     // Catch: java.lang.Exception -> L20 org.json.JSONException -> L22
            return r4
        L20:
            r4 = move-exception
            goto L24
        L22:
            r4 = move-exception
            goto L2a
        L24:
            java.lang.String r1 = "paseJSONException"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            goto L2f
        L2a:
            java.lang.String r1 = "paseJSONJSONException"
            com.amap.api.col.s.j4.i(r4, r0, r1)
        L2f:
            return r2
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            java.util.ArrayList r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "output=json&address="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.geocoder.GeocodeQuery r1 = (com.amap.api.services.geocoder.GeocodeQuery) r1
            java.lang.String r1 = r1.getLocationName()
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.geocoder.GeocodeQuery r1 = (com.amap.api.services.geocoder.GeocodeQuery) r1
            java.lang.String r1 = r1.getCity()
            boolean r2 = com.amap.api.col.s.r4.s0(r1)
            if (r2 != 0) goto L33
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&city="
            r0.append(r2)
            r0.append(r1)
        L33:
            T r1 = r3.n
            com.amap.api.services.geocoder.GeocodeQuery r1 = (com.amap.api.services.geocoder.GeocodeQuery) r1
            java.lang.String r1 = r1.getCountry()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L55
            java.lang.String r1 = "&country="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.geocoder.GeocodeQuery r1 = (com.amap.api.services.geocoder.GeocodeQuery) r1
            java.lang.String r1 = r1.getCountry()
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            r0.append(r1)
        L55:
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
            java.lang.String r1 = "/geocode/geo?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
