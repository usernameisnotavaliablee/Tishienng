package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class f4<T, V> extends com.amap.api.col.s.b4<T, V> {
    public f4(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.m = r1
            return
    }

    protected static org.json.JSONArray U(org.json.JSONObject r1) {
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto Lf
            java.lang.String r0 = "list"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    protected static void V(com.amap.api.services.cloud.CloudItem r4, org.json.JSONObject r5) {
            java.util.Iterator r0 = r5.keys()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            if (r2 == 0) goto Lc
            java.lang.String r3 = r2.toString()
            java.lang.String r3 = r5.optString(r3)
            java.lang.String r2 = r2.toString()
            r1.put(r2, r3)
            goto Lc
        L28:
            r4.setCustomfield(r1)
            return
    }

    protected static int W(org.json.JSONObject r1) {
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L17
            java.lang.String r0 = "info"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L17
            java.lang.String r0 = "count"
            int r1 = r1.optInt(r0)
            return r1
        L17:
            r1 = 0
            return r1
    }

    protected static com.amap.api.services.cloud.CloudItemDetail X(org.json.JSONObject r6) throws org.json.JSONException {
            java.lang.String r0 = "id"
            java.lang.String r0 = com.amap.api.col.s.r4.v(r6, r0)
            java.lang.String r1 = "point_y"
            double r1 = r6.optDouble(r1)
            java.lang.String r3 = "point_x"
            double r3 = r6.optDouble(r3)
            com.amap.api.services.core.LatLonPoint r5 = new com.amap.api.services.core.LatLonPoint
            r5.<init>(r1, r3)
            java.lang.String r1 = "title"
            java.lang.String r1 = com.amap.api.col.s.r4.v(r6, r1)
            java.lang.String r2 = "address"
            java.lang.String r2 = com.amap.api.col.s.r4.v(r6, r2)
            com.amap.api.services.cloud.CloudItemDetail r3 = new com.amap.api.services.cloud.CloudItemDetail
            r3.<init>(r0, r5, r1, r2)
            java.lang.String r0 = "gmt_create"
            java.lang.String r0 = com.amap.api.col.s.r4.v(r6, r0)
            r3.setCreatetime(r0)
            java.lang.String r0 = "gmt_modified"
            java.lang.String r0 = com.amap.api.col.s.r4.v(r6, r0)
            r3.setUpdatetime(r0)
            java.lang.String r0 = "_distance"
            boolean r1 = r6.has(r0)
            if (r1 == 0) goto L53
            java.lang.String r6 = r6.optString(r0)
            boolean r0 = Y(r6)
            if (r0 != 0) goto L53
            int r6 = java.lang.Integer.parseInt(r6)
            r3.setDistance(r6)
        L53:
            return r3
    }

    private static boolean Y(java.lang.String r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "[]"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    @Override // com.amap.api.col.s.a3
    protected final V J(byte[] r4) throws com.amap.api.services.core.AMapException {
            r3 = this;
            r0 = 0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L9
            goto L12
        L9:
            r4 = move-exception
            java.lang.String r1 = "ProtocalHandler"
            java.lang.String r2 = "loadData"
            com.amap.api.col.s.j4.i(r4, r1, r2)
            r1 = r0
        L12:
            if (r1 == 0) goto L25
            java.lang.String r4 = ""
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L1d
            goto L25
        L1d:
            com.amap.api.col.s.j4.m(r1)
            java.lang.Object r4 = r3.I(r1)
            return r4
        L25:
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> p() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.put(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "AMAP SDK Android Search 9.7.0"
            r0.put(r1, r2)
            android.content.Context r1 = r4.q
            java.lang.String r1 = com.amap.api.col.s.a1.b(r1)
            java.lang.String r2 = "X-INFO"
            r0.put(r2, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "9.7.0"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "cloud"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "platinfo"
            r0.put(r2, r1)
            java.lang.String r1 = "logversion"
            java.lang.String r2 = "2.1"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.dz
    public final byte[] q() {
            r1 = this;
            r0 = 0
            return r0
    }
}
