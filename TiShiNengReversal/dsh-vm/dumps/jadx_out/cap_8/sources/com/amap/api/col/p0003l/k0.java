package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k0 extends com.amap.api.col.p0003l.b1<java.lang.String, java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince>> {

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f3604d;

    public k0(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> i(org.json.JSONObject r4) throws com.amap.api.maps.AMapException {
            r3 = this;
            java.lang.String r0 = "OfflineUpdateCityHandlerAbstract"
            android.content.Context r1 = r3.f3604d     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L16
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L10
            android.content.Context r2 = r3.f3604d     // Catch: java.lang.Throwable -> L10
            com.amap.api.col.p0003l.a1.p(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r1 = move-exception
            java.lang.String r2 = "loadData jsonInit"
            com.amap.api.col.p0003l.w5.p(r1, r0, r2)
        L16:
            r1 = 0
            android.content.Context r2 = r3.f3604d     // Catch: org.json.JSONException -> L20
            if (r2 == 0) goto L26
            java.util.List r1 = com.amap.api.col.p0003l.a1.g(r4, r2)     // Catch: org.json.JSONException -> L20
            goto L26
        L20:
            r4 = move-exception
            java.lang.String r2 = "loadData parseJson"
            com.amap.api.col.p0003l.w5.p(r4, r0, r2)
        L26:
            return r1
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final /* synthetic */ java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> a(org.json.JSONObject r1) throws com.amap.api.maps.AMapException {
            r0 = this;
            java.util.List r1 = r0.i(r1)
            return r1
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final java.lang.String b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "015"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final org.json.JSONObject c(com.amap.api.col.3l.g4.c r5) {
            r4 = this;
            if (r5 == 0) goto L29
            org.json.JSONObject r5 = r5.f3393f
            if (r5 == 0) goto L29
            java.lang.String r0 = "015"
            org.json.JSONObject r5 = r5.optJSONObject(r0)
            java.lang.String r0 = "result"
            boolean r1 = r5.has(r0)
            if (r1 != 0) goto L28
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r2.<init>()     // Catch: org.json.JSONException -> L28
            java.lang.String r3 = "offlinemap_with_province_vfour"
            org.json.JSONObject r2 = r2.put(r3, r5)     // Catch: org.json.JSONException -> L28
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L28
            return r1
        L28:
            return r5
        L29:
            r5 = 0
            return r5
    }

    @Override // com.amap.api.col.p0003l.b1
    protected final java.util.Map<java.lang.String, java.lang.String> e() {
            r3 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "mapver"
            T r2 = r3.a
            r0.put(r1, r2)
            return r0
    }

    public final void h(android.content.Context r1) {
            r0 = this;
            r0.f3604d = r1
            return
    }
}
