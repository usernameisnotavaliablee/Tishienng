package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class d4 extends com.amap.api.col.s.b4<com.amap.api.services.route.RouteSearchV2.BusRouteQuery, com.amap.api.services.route.BusRouteResultV2> {
    public d4(android.content.Context r1, com.amap.api.services.route.RouteSearchV2.BusRouteQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.services.route.BusRouteResultV2 U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.BusRouteResultV2 r0 = com.amap.api.col.s.r4.L(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.BusRouteResultV2 r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r3.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            java.lang.String r1 = "&origin="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            java.lang.String r1 = "&destination="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getTo()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getCity()
            boolean r2 = com.amap.api.col.s.r4.s0(r1)
            if (r2 != 0) goto L5d
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&city1="
            r0.append(r2)
            r0.append(r1)
        L5d:
            T r2 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r2 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r2
            java.lang.String r2 = r2.getCity()
            boolean r2 = com.amap.api.col.s.r4.s0(r2)
            if (r2 != 0) goto L77
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            java.lang.String r2 = "&city2="
            r0.append(r2)
            r0.append(r1)
        L77:
            java.lang.String r1 = "&strategy="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r2 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r2
            int r2 = r2.getMode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "&nightflag="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            int r1 = r1.getNightFlag()
            r0.append(r1)
            java.lang.String r1 = "&show_fields="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            int r1 = r1.getShowFields()
            java.lang.String r1 = com.amap.api.col.s.j4.c(r1)
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getOriginPoiId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lcd
            java.lang.String r2 = "&originpoi="
            r0.append(r2)
            r0.append(r1)
        Lcd:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getDestinationPoiId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Le3
            java.lang.String r2 = "&destinationpoi="
            r0.append(r2)
            r0.append(r1)
        Le3:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getAd1()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lf9
            java.lang.String r2 = "&ad1="
            r0.append(r2)
            r0.append(r1)
        Lf9:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getAd2()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L10f
            java.lang.String r2 = "&ad2="
            r0.append(r2)
            r0.append(r1)
        L10f:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getDate()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L125
            java.lang.String r2 = "&date="
            r0.append(r2)
            r0.append(r1)
        L125:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            java.lang.String r1 = r1.getTime()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L13b
            java.lang.String r2 = "&time="
            r0.append(r2)
            r0.append(r1)
        L13b:
            java.lang.String r1 = "&AlternativeRoute="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            int r1 = r1.getAlternativeRoute()
            r0.append(r1)
            java.lang.String r1 = "&multiexport="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            int r1 = r1.getMultiExport()
            r0.append(r1)
            java.lang.String r1 = "&max_trans="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearchV2$BusRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.BusRouteQuery) r1
            int r1 = r1.getMaxTrans()
            r0.append(r1)
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
            java.lang.String r1 = com.amap.api.col.s.i4.d()
            r0.append(r1)
            java.lang.String r1 = "/direction/transit/integrated?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
