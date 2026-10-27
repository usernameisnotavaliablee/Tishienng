package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c0 extends com.amap.api.col.s.b4<com.amap.api.services.route.RouteSearchV2.WalkRouteQuery, com.amap.api.services.route.WalkRouteResultV2> {
    public c0(android.content.Context r1, com.amap.api.services.route.RouteSearchV2.WalkRouteQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.services.route.WalkRouteResultV2 U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.WalkRouteResultV2 r0 = com.amap.api.col.s.r4.j0(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.WalkRouteResultV2 r1 = U(r1)
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
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r1
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            java.lang.String r1 = "&destination="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r1
            com.amap.api.services.route.RouteSearchV2$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getTo()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            java.lang.String r1 = "&output=json"
            r0.append(r1)
            java.lang.String r1 = "&isindoor="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r1
            boolean r1 = r1.isIndoor()
            r0.append(r1)
            java.lang.String r1 = "&alternative_route="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r1
            int r1 = r1.getAlternativeRoute()
            r0.append(r1)
            java.lang.String r1 = "&show_fields="
            r0.append(r1)
            T r1 = r2.n
            com.amap.api.services.route.RouteSearchV2$WalkRouteQuery r1 = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) r1
            int r1 = r1.getShowFields()
            java.lang.String r1 = com.amap.api.col.s.j4.c(r1)
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
            java.lang.String r1 = "/direction/walking?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
