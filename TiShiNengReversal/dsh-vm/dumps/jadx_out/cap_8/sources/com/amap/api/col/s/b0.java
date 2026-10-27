package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b0 extends com.amap.api.col.s.b4<com.amap.api.services.auto.AutoTSearch.Query, com.amap.api.services.auto.AutoTChargeStationResult> {
    private com.amap.api.col.s.a t;

    public b0(android.content.Context r1, com.amap.api.services.auto.AutoTSearch.Query r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.t = r2
            com.amap.api.col.s.a r2 = new com.amap.api.col.s.a
            r2.<init>(r1)
            r0.t = r2
            return
    }

    private static com.amap.api.services.auto.AutoTChargeStationResult U(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> La
            r0.<init>(r1)     // Catch: java.lang.Exception -> La
            com.amap.api.services.auto.AutoTChargeStationResult r1 = com.amap.api.col.s.b1.a(r0)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.auto.AutoTChargeStationResult r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r4 = this;
            com.amap.api.col.s.a r0 = r4.t
            java.lang.String r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "&adcode="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getAdCode()
            r1.append(r0)
            java.lang.String r0 = "&city="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getCity()
            r1.append(r0)
            java.lang.String r0 = "&data_type="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getDataType()
            r1.append(r0)
            java.lang.String r0 = "&geoobj="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getGeoObj()
            r1.append(r0)
            java.lang.String r0 = "&keywords="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getKeywords()
            r1.append(r0)
            java.lang.String r0 = "&pagenum="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            int r0 = r0.getPageNum()
            r1.append(r0)
            java.lang.String r0 = "&pagesize="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            int r0 = r0.getPageSize()
            r1.append(r0)
            java.lang.String r0 = "&qii="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            boolean r0 = r0.isQii()
            r1.append(r0)
            java.lang.String r0 = "&query_type="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getQueryType()
            r1.append(r0)
            java.lang.String r0 = "&range="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            int r0 = r0.getRange()
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            com.amap.api.services.core.LatLonPoint r0 = r0.getLatLonPoint()
            if (r0 == 0) goto Lcd
            java.lang.String r2 = "&longitude="
            r1.append(r2)
            double r2 = r0.getLongitude()
            r1.append(r2)
            java.lang.String r2 = "&latitude="
            r1.append(r2)
            double r2 = r0.getLatitude()
            r1.append(r2)
        Lcd:
            java.lang.String r0 = "&user_loc="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getUserLoc()
            r1.append(r0)
            java.lang.String r0 = "&user_city="
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            java.lang.String r0 = r0.getUserCity()
            r1.append(r0)
            T r0 = r4.n
            com.amap.api.services.auto.AutoTSearch$Query r0 = (com.amap.api.services.auto.AutoTSearch.Query) r0
            com.amap.api.services.auto.AutoTSearch$FilterBox r0 = r0.getFilterBox()
            if (r0 == 0) goto L133
            java.lang.String r2 = "&retain_state="
            r1.append(r2)
            java.lang.String r2 = r0.getRetainState()
            r1.append(r2)
            java.lang.String r2 = "&checked_level="
            r1.append(r2)
            java.lang.String r2 = r0.getCheckedLevel()
            r1.append(r2)
            java.lang.String r2 = "&classify_v2_data="
            r1.append(r2)
            java.lang.String r2 = r0.getClassifyV2Data()
            r1.append(r2)
            java.lang.String r2 = "&classify_v2_level2_data="
            r1.append(r2)
            java.lang.String r2 = r0.getClassifyV2Level2Data()
            r1.append(r2)
            java.lang.String r2 = "&classify_v2_level3_data="
            r1.append(r2)
            java.lang.String r0 = r0.getClassifyV2Level3Data()
            r1.append(r0)
        L133:
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L40
            r0.<init>()     // Catch: java.lang.Exception -> L40
            T r1 = r4.n     // Catch: java.lang.Exception -> L40
            com.amap.api.services.auto.AutoTSearch$Query r1 = (com.amap.api.services.auto.AutoTSearch.Query) r1     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.getAccessKey()     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = com.amap.api.col.s.b2.c(r0, r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "POST"
            T r2 = r4.n     // Catch: java.lang.Exception -> L40
            com.amap.api.services.auto.AutoTSearch$Query r2 = (com.amap.api.services.auto.AutoTSearch.Query) r2     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r2.getSecretKey()     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = com.amap.api.col.s.b2.b(r1, r0, r2)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = com.amap.api.col.s.i4.g()     // Catch: java.lang.Exception -> L40
            r2.append(r3)     // Catch: java.lang.Exception -> L40
            java.lang.String r3 = "/ws/mapapi/poi/infolite/auto?"
            r2.append(r3)     // Catch: java.lang.Exception -> L40
            r2.append(r0)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = "&Signature="
            r2.append(r0)     // Catch: java.lang.Exception -> L40
            r2.append(r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L40
            return r0
        L40:
            r0 = 0
            return r0
    }
}
