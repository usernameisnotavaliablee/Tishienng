package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g4 extends com.amap.api.col.s.f4<com.amap.api.col.s.j, com.amap.api.services.cloud.CloudItemDetail> {
    public g4(android.content.Context r1, com.amap.api.col.s.j r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.services.cloud.CloudItemDetail Z(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            r0 = 0
            if (r2 == 0) goto L16
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lc
            goto L16
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            com.amap.api.services.cloud.CloudItemDetail r2 = a0(r1)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            return r0
    }

    private static com.amap.api.services.cloud.CloudItemDetail a0(org.json.JSONObject r1) throws org.json.JSONException {
            org.json.JSONArray r1 = com.amap.api.col.s.f4.U(r1)
            if (r1 == 0) goto L1a
            int r0 = r1.length()
            if (r0 > 0) goto Ld
            goto L1a
        Ld:
            r0 = 0
            org.json.JSONObject r1 = r1.getJSONObject(r0)
            com.amap.api.services.cloud.CloudItemDetail r0 = com.amap.api.col.s.f4.X(r1)
            com.amap.api.col.s.f4.V(r0, r1)
            return r0
        L1a:
            r1 = 0
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    public final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.cloud.CloudItemDetail r1 = Z(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.f()
            r0.append(r1)
            java.lang.String r1 = "/datasearch/id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r4 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            android.content.Context r1 = r4.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            T r1 = r4.n
            com.amap.api.col.s.j r1 = (com.amap.api.col.s.j) r1
            java.lang.String r1 = r1.a
            java.lang.String r2 = "layerId"
            r0.put(r2, r1)
            java.lang.String r1 = "output"
            java.lang.String r2 = "json"
            r0.put(r1, r2)
            T r1 = r4.n
            com.amap.api.col.s.j r1 = (com.amap.api.col.s.j) r1
            java.lang.String r1 = r1.f4517b
            java.lang.String r2 = "id"
            r0.put(r2, r1)
            java.lang.String r1 = com.amap.api.col.s.a1.a()
            android.content.Context r2 = r4.q
            java.lang.String r3 = com.amap.api.col.s.j1.r(r0)
            java.lang.String r2 = com.amap.api.col.s.a1.c(r2, r1, r3)
            java.lang.String r3 = "ts"
            r0.put(r3, r1)
            java.lang.String r1 = "scode"
            r0.put(r1, r2)
            return r0
    }
}
