package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class s extends com.amap.api.col.s.b4<com.amap.api.services.route.RouteSearch.RideRouteQuery, com.amap.api.services.route.RideRouteResult> {
    public s(android.content.Context r1, com.amap.api.services.route.RouteSearch.RideRouteQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.services.route.RideRouteResult U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.RideRouteResult r0 = com.amap.api.col.s.r4.t0(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.RideRouteResult r1 = U(r1)
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
            java.lang.String r1 = "&origin="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$RideRouteQuery r1 = (com.amap.api.services.route.RouteSearch.RideRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            java.lang.String r1 = "&destination="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$RideRouteQuery r1 = (com.amap.api.services.route.RouteSearch.RideRouteQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getTo()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            java.lang.String r1 = "&output=json"
            r0.append(r1)
            java.lang.String r1 = "&geometry=false"
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$RideRouteQuery r1 = (com.amap.api.services.route.RouteSearch.RideRouteQuery) r1
            java.lang.String r1 = r1.getExtensions()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.String r1 = "&extensions="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearch$RideRouteQuery r1 = (com.amap.api.services.route.RouteSearch.RideRouteQuery) r1
            java.lang.String r1 = r1.getExtensions()
            r0.append(r1)
            goto L71
        L6c:
            java.lang.String r1 = "&extensions=base"
            r0.append(r1)
        L71:
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
            java.lang.String r1 = "/direction/bicycling?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
