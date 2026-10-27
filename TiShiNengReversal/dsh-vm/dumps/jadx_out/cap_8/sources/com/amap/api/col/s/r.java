package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r extends com.amap.api.col.s.b4<com.amap.api.services.geocoder.RegeocodeQuery, com.amap.api.services.geocoder.RegeocodeAddress> {
    public r(android.content.Context r1, com.amap.api.services.geocoder.RegeocodeQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.lang.String U(boolean r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "output=json&location="
            r0.append(r1)
            if (r4 == 0) goto L37
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            com.amap.api.services.core.LatLonPoint r4 = r4.getPoint()
            double r1 = r4.getLongitude()
            double r1 = com.amap.api.col.s.j4.a(r1)
            r0.append(r1)
            java.lang.String r4 = ","
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            com.amap.api.services.core.LatLonPoint r4 = r4.getPoint()
            double r1 = r4.getLatitude()
            double r1 = com.amap.api.col.s.j4.a(r1)
            r0.append(r1)
        L37:
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getPoiType()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L55
            java.lang.String r4 = "&poitype="
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getPoiType()
            r0.append(r4)
        L55:
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getMode()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L73
            java.lang.String r4 = "&mode="
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getMode()
            r0.append(r4)
        L73:
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getExtensions()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L92
            java.lang.String r4 = "&extensions="
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getExtensions()
            r0.append(r4)
            goto L97
        L92:
            java.lang.String r4 = "&extensions=base"
            r0.append(r4)
        L97:
            java.lang.String r4 = "&radius="
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            float r4 = r4.getRadius()
            int r4 = (int) r4
            r0.append(r4)
            java.lang.String r4 = "&coordsys="
            r0.append(r4)
            T r4 = r3.n
            com.amap.api.services.geocoder.RegeocodeQuery r4 = (com.amap.api.services.geocoder.RegeocodeQuery) r4
            java.lang.String r4 = r4.getLatLonType()
            r0.append(r4)
            java.lang.String r4 = "&key="
            r0.append(r4)
            android.content.Context r4 = r3.q
            java.lang.String r4 = com.amap.api.col.s.x0.i(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static com.amap.api.services.geocoder.RegeocodeAddress V(java.lang.String r3) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.geocoder.RegeocodeAddress r0 = new com.amap.api.services.geocoder.RegeocodeAddress
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r1.<init>(r3)     // Catch: org.json.JSONException -> L28
            java.lang.String r3 = "regeocode"
            org.json.JSONObject r3 = r1.optJSONObject(r3)     // Catch: org.json.JSONException -> L28
            if (r3 != 0) goto L13
            goto L52
        L13:
            java.lang.String r1 = "formatted_address"
            java.lang.String r1 = com.amap.api.col.s.r4.v(r3, r1)     // Catch: org.json.JSONException -> L28
            r0.setFormatAddress(r1)     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "addressComponent"
            org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch: org.json.JSONException -> L28
            if (r1 == 0) goto L2a
            com.amap.api.col.s.r4.J(r1, r0)     // Catch: org.json.JSONException -> L28
            goto L2a
        L28:
            r3 = move-exception
            goto L53
        L2a:
            java.util.ArrayList r1 = com.amap.api.col.s.r4.U(r3)     // Catch: org.json.JSONException -> L28
            r0.setPois(r1)     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "roads"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch: org.json.JSONException -> L28
            if (r1 == 0) goto L3c
            com.amap.api.col.s.r4.R(r1, r0)     // Catch: org.json.JSONException -> L28
        L3c:
            java.lang.String r1 = "roadinters"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch: org.json.JSONException -> L28
            if (r1 == 0) goto L47
            com.amap.api.col.s.r4.H(r1, r0)     // Catch: org.json.JSONException -> L28
        L47:
            java.lang.String r1 = "aois"
            org.json.JSONArray r3 = r3.optJSONArray(r1)     // Catch: org.json.JSONException -> L28
            if (r3 == 0) goto L52
            com.amap.api.col.s.r4.X(r3, r0)     // Catch: org.json.JSONException -> L28
        L52:
            return r0
        L53:
            java.lang.String r1 = "ReverseGeocodingHandler"
            java.lang.String r2 = "paseJSON"
            com.amap.api.col.s.j4.i(r3, r1, r2)
            return r0
    }

    private static com.amap.api.col.s.p W() {
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.b()
            java.lang.String r1 = "regeo"
            com.amap.api.col.s.o r0 = r0.c(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            com.amap.api.col.s.p r0 = (com.amap.api.col.s.p) r0
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.geocoder.RegeocodeAddress r1 = V(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.U(r0)
            return r0
    }

    @Override // com.amap.api.col.s.a3
    protected final com.amap.api.col.s.n.b P() {
            r9 = this;
            com.amap.api.col.s.p r0 = W()
            if (r0 == 0) goto Lc
            double r0 = r0.l()
        La:
            r7 = r0
            goto Lf
        Lc:
            r0 = 0
            goto La
        Lf:
            com.amap.api.col.s.n$b r0 = new com.amap.api.col.s.n$b
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.h()
            r1.append(r2)
            r2 = 0
            java.lang.String r2 = r9.U(r2)
            r1.append(r2)
            java.lang.String r2 = "language="
            r1.append(r2)
            com.amap.api.services.core.ServiceSettings r2 = com.amap.api.services.core.ServiceSettings.getInstance()
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a = r1
            T r1 = r9.n
            if (r1 == 0) goto L69
            com.amap.api.services.geocoder.RegeocodeQuery r1 = (com.amap.api.services.geocoder.RegeocodeQuery) r1
            com.amap.api.services.core.LatLonPoint r1 = r1.getPoint()
            if (r1 == 0) goto L69
            com.amap.api.col.s.p$a r2 = new com.amap.api.col.s.p$a
            T r1 = r9.n
            com.amap.api.services.geocoder.RegeocodeQuery r1 = (com.amap.api.services.geocoder.RegeocodeQuery) r1
            com.amap.api.services.core.LatLonPoint r1 = r1.getPoint()
            double r3 = r1.getLatitude()
            T r1 = r9.n
            com.amap.api.services.geocoder.RegeocodeQuery r1 = (com.amap.api.services.geocoder.RegeocodeQuery) r1
            com.amap.api.services.core.LatLonPoint r1 = r1.getPoint()
            double r5 = r1.getLongitude()
            r2.<init>(r3, r5, r7)
            r0.f4573b = r2
        L69:
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/geocode/regeo?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
