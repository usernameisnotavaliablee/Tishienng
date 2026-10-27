package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class m4 extends com.amap.api.col.s.b4<com.amap.api.services.route.RouteSearch.DrivePlanQuery, com.amap.api.services.route.DriveRoutePlanResult> {
    public m4(android.content.Context r1, com.amap.api.services.route.RouteSearch.DrivePlanQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static com.amap.api.services.route.DriveRoutePlanResult U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.DriveRoutePlanResult r0 = com.amap.api.col.s.r4.C0(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.DriveRoutePlanResult r1 = U(r1)
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
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            if (r1 == 0) goto L131
            java.lang.String r1 = "&origin="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getFrom()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getStartPoiID()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "&originid="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getStartPoiID()
            r0.append(r1)
        L5b:
            java.lang.String r1 = "&destination="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            com.amap.api.services.core.LatLonPoint r1 = r1.getTo()
            java.lang.String r1 = com.amap.api.col.s.j4.d(r1)
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationPoiID()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "&destinationid="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationPoiID()
            r0.append(r1)
        L99:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getOriginType()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto Lbf
            java.lang.String r1 = "&origintype="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getOriginType()
            r0.append(r1)
        Lbf:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationType()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto Le5
            java.lang.String r1 = "&destinationtype="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getDestinationType()
            r0.append(r1)
        Le5:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateProvince()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L10b
            java.lang.String r1 = "&province="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateProvince()
            r0.append(r1)
        L10b:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateNumber()
            boolean r1 = com.amap.api.col.s.r4.s0(r1)
            if (r1 != 0) goto L131
            java.lang.String r1 = "&number="
            r0.append(r1)
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            com.amap.api.services.route.RouteSearch$FromAndTo r1 = r1.getFromAndTo()
            java.lang.String r1 = r1.getPlateNumber()
            r0.append(r1)
        L131:
            T r1 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r1 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r1
            java.lang.String r1 = r1.getDestParentPoiID()
            if (r1 == 0) goto L157
            java.lang.String r1 = "&parentid="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            java.lang.String r2 = r2.getDestParentPoiID()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L157:
            java.lang.String r1 = "&strategy="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            int r2 = r2.getMode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "&cartype="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            int r2 = r2.getCarType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "&firsttime="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            int r2 = r2.getFirstTime()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "&interval="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            int r2 = r2.getInterval()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "&count="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r3.n
            com.amap.api.services.route.RouteSearch$DrivePlanQuery r2 = (com.amap.api.services.route.RouteSearch.DrivePlanQuery) r2
            int r2 = r2.getCount()
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
            java.lang.String r1 = com.amap.api.col.s.i4.c()
            r0.append(r1)
            java.lang.String r1 = "/etd/driving?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
