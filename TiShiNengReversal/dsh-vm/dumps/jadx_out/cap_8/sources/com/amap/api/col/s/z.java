package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z extends com.amap.api.col.s.b4<com.amap.api.services.route.RouteSearch.TruckRouteQuery, com.amap.api.services.route.TruckRouteRestult> {
    private final java.lang.String t;
    private final java.lang.String u;
    private final java.lang.String v;

    public z(android.content.Context r1, com.amap.api.services.route.RouteSearch.TruckRouteQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "/direction/truck?"
            r0.t = r1
            java.lang.String r1 = "|"
            r0.u = r1
            java.lang.String r1 = ","
            r0.v = r1
            return
    }

    private static com.amap.api.services.route.TruckRouteRestult U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.TruckRouteRestult r0 = com.amap.api.col.s.r4.A0(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.TruckRouteRestult r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r2.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            if (r1 == 0) goto L131
            java.lang.String r1 = "&origin="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getStartPoiID()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "&originid="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getStartPoiID()
            r0.append(r1)
        L5b:
            java.lang.String r1 = "&destination="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getTo()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationPoiID()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "&destinationid="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationPoiID()
            r0.append(r1)
        L99:
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getOriginType()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = "&origintype="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getOriginType()
            r0.append(r1)
        Lbf:
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationType()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto Le5
            java.lang.String r1 = "&destinationtype="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationType()
            r0.append(r1)
        Le5:
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateProvince()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L10b
            java.lang.String r1 = "&province="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateProvince()
            r0.append(r1)
        L10b:
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateNumber()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L131
            java.lang.String r1 = "&number="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateNumber()
            r0.append(r1)
        L131:
            java.lang.String r1 = "&strategy="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            int r1 = r1.getMode()
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            boolean r1 = r1.hasPassPoint()
            if (r1 == 0) goto L15b
            java.lang.String r1 = "&waypoints="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            java.lang.String r1 = r1.getPassedPointStr()
            r0.append(r1)
        L15b:
            java.lang.String r1 = "&size="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            int r1 = r1.getTruckSize()
            r0.append(r1)
            java.lang.String r1 = "&height="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            float r1 = r1.getTruckHeight()
            r0.append(r1)
            java.lang.String r1 = "&width="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            float r1 = r1.getTruckWidth()
            r0.append(r1)
            java.lang.String r1 = "&load="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            float r1 = r1.getTruckLoad()
            r0.append(r1)
            java.lang.String r1 = "&weight="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            float r1 = r1.getTruckWeight()
            r0.append(r1)
            java.lang.String r1 = "&axis="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            float r1 = r1.getTruckAxis()
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            java.lang.String r1 = r1.getExtensions()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1da
            java.lang.String r1 = "&extensions="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$TruckRouteQuery r1 = (com.amap.api.services.route.RouteSearch.TruckRouteQuery) r1
            java.lang.String r1 = r1.getExtensions()
            r0.append(r1)
            goto L1df
        L1da:
            java.lang.String r1 = "&extensions=base"
            r0.append(r1)
        L1df:
            java.lang.String r1 = "&output=json"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.c()
            r0.append(r1)
            java.lang.String r1 = "/direction/truck?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
