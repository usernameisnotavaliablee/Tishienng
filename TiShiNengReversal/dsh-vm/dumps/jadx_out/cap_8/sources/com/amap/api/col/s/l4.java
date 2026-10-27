package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class l4 extends com.amap.api.col.s.b4<com.amap.api.services.district.DistrictSearchQuery, com.amap.api.services.district.DistrictResult> {
    public l4(android.content.Context r1, com.amap.api.services.district.DistrictSearchQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private com.amap.api.services.district.DistrictResult U(java.lang.String r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            java.lang.String r0 = "DistrictServerHandler"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.amap.api.services.district.DistrictResult r2 = new com.amap.api.services.district.DistrictResult
            T r3 = r4.n
            com.amap.api.services.district.DistrictSearchQuery r3 = (com.amap.api.services.district.DistrictSearchQuery) r3
            r2.<init>(r3, r1)
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            r3.<init>(r5)     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            java.lang.String r5 = "count"
            int r5 = r3.optInt(r5)     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            r2.setPageCount(r5)     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            java.lang.String r5 = "districts"
            org.json.JSONArray r5 = r3.optJSONArray(r5)     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            if (r5 != 0) goto L27
            goto L3b
        L27:
            r3 = 0
            com.amap.api.col.s.r4.I(r5, r1, r3)     // Catch: java.lang.Exception -> L2c org.json.JSONException -> L2e
            return r2
        L2c:
            r5 = move-exception
            goto L30
        L2e:
            r5 = move-exception
            goto L36
        L30:
            java.lang.String r1 = "paseJSONException"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            goto L3b
        L36:
            java.lang.String r1 = "paseJSONJSONException"
            com.amap.api.col.s.j4.i(r5, r0, r1)
        L3b:
            return r2
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.district.DistrictResult r1 = r0.U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "output=json"
            r0.append(r1)
            java.lang.String r1 = "&page="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r1 = (com.amap.api.services.district.DistrictSearchQuery) r1
            int r1 = r1.getPageNum()
            r0.append(r1)
            java.lang.String r1 = "&offset="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r1 = (com.amap.api.services.district.DistrictSearchQuery) r1
            int r1 = r1.getPageSize()
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r1 = (com.amap.api.services.district.DistrictSearchQuery) r1
            boolean r1 = r1.isShowBoundary()
            if (r1 == 0) goto L3a
            java.lang.String r1 = "&extensions=all"
            r0.append(r1)
            goto L3f
        L3a:
            java.lang.String r1 = "&extensions=base"
            r0.append(r1)
        L3f:
            T r1 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r1 = (com.amap.api.services.district.DistrictSearchQuery) r1
            boolean r1 = r1.checkKeyWords()
            if (r1 == 0) goto L5d
            T r1 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r1 = (com.amap.api.services.district.DistrictSearchQuery) r1
            java.lang.String r1 = r1.getKeywords()
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&keywords="
            r0.append(r2)
            r0.append(r1)
        L5d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&key="
            r1.<init>(r2)
            android.content.Context r2 = r3.q
            java.lang.String r2 = com.amap.api.col.s.x0.i(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&subdistrict="
            r1.<init>(r2)
            T r2 = r3.n
            com.amap.api.services.district.DistrictSearchQuery r2 = (com.amap.api.services.district.DistrictSearchQuery) r2
            int r2 = r2.getSubDistrict()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/config/district?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
