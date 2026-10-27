package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k4 extends com.amap.api.col.s.b4<com.amap.api.services.route.DistanceSearch.DistanceQuery, com.amap.api.services.route.DistanceResult> {
    private final java.lang.String t;
    private final java.lang.String u;
    private final java.lang.String v;

    public k4(android.content.Context r1, com.amap.api.services.route.DistanceSearch.DistanceQuery r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "/distance?"
            r0.t = r1
            java.lang.String r1 = "|"
            r0.u = r1
            java.lang.String r1 = ","
            r0.v = r1
            return
    }

    private static com.amap.api.services.route.DistanceResult U(java.lang.String r0) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.DistanceResult r0 = com.amap.api.col.s.r4.y0(r0)
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.route.DistanceResult r1 = U(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r10 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "key="
            r0.append(r1)
            android.content.Context r1 = r10.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            java.util.List r1 = r1.getOrigins()
            java.lang.String r2 = ","
            if (r1 == 0) goto L5c
            int r3 = r1.size()
            if (r3 <= 0) goto L5c
            java.lang.String r3 = "&origins="
            r0.append(r3)
            int r3 = r1.size()
            r4 = 0
        L2f:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            com.amap.api.services.core.LatLonPoint r5 = (com.amap.api.services.core.LatLonPoint) r5
            if (r5 == 0) goto L59
            double r6 = r5.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r6)
            double r8 = r5.getLongitude()
            double r8 = com.amap.api.col.s.j4.a(r8)
            r0.append(r8)
            r0.append(r2)
            r0.append(r6)
            if (r4 >= r3) goto L59
            java.lang.String r5 = "|"
            r0.append(r5)
        L59:
            int r4 = r4 + 1
            goto L2f
        L5c:
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            com.amap.api.services.core.LatLonPoint r1 = r1.getDestination()
            if (r1 == 0) goto L84
            double r3 = r1.getLatitude()
            double r3 = com.amap.api.col.s.j4.a(r3)
            double r5 = r1.getLongitude()
            double r5 = com.amap.api.col.s.j4.a(r5)
            java.lang.String r1 = "&destination="
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            r0.append(r3)
        L84:
            java.lang.String r1 = "&type="
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            int r1 = r1.getType()
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            java.lang.String r1 = r1.getExtensions()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lb3
            java.lang.String r1 = "&extensions="
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            java.lang.String r1 = r1.getExtensions()
            r0.append(r1)
            goto Lb8
        Lb3:
            java.lang.String r1 = "&extensions=base"
            r0.append(r1)
        Lb8:
            java.lang.String r1 = "&output=json"
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            int r1 = r1.getType()
            r2 = 1
            if (r1 != r2) goto Ld8
            java.lang.String r1 = "&strategy="
            r0.append(r1)
            T r1 = r10.n
            com.amap.api.services.route.DistanceSearch$DistanceQuery r1 = (com.amap.api.services.route.DistanceSearch.DistanceQuery) r1
            int r1 = r1.getMode()
            r0.append(r1)
        Ld8:
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
            java.lang.String r1 = "/distance?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
