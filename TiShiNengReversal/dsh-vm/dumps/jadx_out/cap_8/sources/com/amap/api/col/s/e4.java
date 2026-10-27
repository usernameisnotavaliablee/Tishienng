package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e4<T> extends com.amap.api.col.s.b4<T, java.lang.Object> {
    private int t;
    private java.util.List<java.lang.String> u;
    private java.util.List<com.amap.api.services.core.SuggestionCity> v;

    public e4(android.content.Context r1, T r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.t = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.u = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.v = r1
            return
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.Object I(java.lang.String r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            r0.<init>(r5)     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = "suggestion"
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Exception -> L1a
            if (r5 == 0) goto L1c
            java.util.ArrayList r1 = com.amap.api.col.s.r4.w(r5)     // Catch: java.lang.Exception -> L1a
            r4.v = r1     // Catch: java.lang.Exception -> L1a
            java.util.ArrayList r5 = com.amap.api.col.s.r4.M(r5)     // Catch: java.lang.Exception -> L1a
            r4.u = r5     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L50
        L1c:
            java.lang.String r5 = "count"
            int r5 = r0.optInt(r5)     // Catch: java.lang.Exception -> L1a
            r4.t = r5     // Catch: java.lang.Exception -> L1a
            T r5 = r4.n     // Catch: java.lang.Exception -> L1a
            boolean r5 = r5 instanceof com.amap.api.services.busline.BusLineQuery     // Catch: java.lang.Exception -> L1a
            if (r5 == 0) goto L3d
            java.util.ArrayList r5 = com.amap.api.col.s.r4.p0(r0)     // Catch: java.lang.Exception -> L1a
            T r0 = r4.n     // Catch: java.lang.Exception -> L1a
            com.amap.api.services.busline.BusLineQuery r0 = (com.amap.api.services.busline.BusLineQuery) r0     // Catch: java.lang.Exception -> L1a
            int r1 = r4.t     // Catch: java.lang.Exception -> L1a
            java.util.List<com.amap.api.services.core.SuggestionCity> r2 = r4.v     // Catch: java.lang.Exception -> L1a
            java.util.List<java.lang.String> r3 = r4.u     // Catch: java.lang.Exception -> L1a
            com.amap.api.services.busline.BusLineResult r5 = com.amap.api.services.busline.BusLineResult.createPagedResult(r0, r1, r2, r3, r5)     // Catch: java.lang.Exception -> L1a
            return r5
        L3d:
            java.util.ArrayList r5 = com.amap.api.col.s.r4.m0(r0)     // Catch: java.lang.Exception -> L1a
            T r0 = r4.n     // Catch: java.lang.Exception -> L1a
            com.amap.api.services.busline.BusStationQuery r0 = (com.amap.api.services.busline.BusStationQuery) r0     // Catch: java.lang.Exception -> L1a
            int r1 = r4.t     // Catch: java.lang.Exception -> L1a
            java.util.List<com.amap.api.services.core.SuggestionCity> r2 = r4.v     // Catch: java.lang.Exception -> L1a
            java.util.List<java.lang.String> r3 = r4.u     // Catch: java.lang.Exception -> L1a
            com.amap.api.services.busline.BusStationResult r5 = com.amap.api.services.busline.BusStationResult.createPagedResult(r0, r1, r2, r3, r5)     // Catch: java.lang.Exception -> L1a
            return r5
        L50:
            java.lang.String r0 = "BusSearchServerHandler"
            java.lang.String r1 = "paseJSON"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            r5 = 0
            return r5
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "output=json"
            r0.append(r1)
            T r1 = r8.n
            boolean r2 = r1 instanceof com.amap.api.services.busline.BusLineQuery
            java.lang.String r3 = "&page="
            java.lang.String r4 = "&offset="
            java.lang.String r5 = "&keywords="
            java.lang.String r6 = "&city="
            if (r2 == 0) goto La6
            com.amap.api.services.busline.BusLineQuery r1 = (com.amap.api.services.busline.BusLineQuery) r1
            java.lang.String r2 = r1.getExtensions()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L31
            java.lang.String r2 = "&extensions="
            r0.append(r2)
            java.lang.String r2 = r1.getExtensions()
            r0.append(r2)
            goto L36
        L31:
            java.lang.String r2 = "&extensions=base"
            r0.append(r2)
        L36:
            com.amap.api.services.busline.BusLineQuery$SearchType r2 = r1.getCategory()
            com.amap.api.services.busline.BusLineQuery$SearchType r7 = com.amap.api.services.busline.BusLineQuery.SearchType.BY_LINE_ID
            if (r2 != r7) goto L54
            java.lang.String r1 = "&id="
            r0.append(r1)
            T r1 = r8.n
            com.amap.api.services.busline.BusLineQuery r1 = (com.amap.api.services.busline.BusLineQuery) r1
            java.lang.String r1 = r1.getQueryString()
            java.lang.String r1 = com.amap.api.col.s.b4.i(r1)
            r0.append(r1)
            goto Lf9
        L54:
            java.lang.String r2 = r1.getCity()
            boolean r7 = com.amap.api.col.s.r4.s0(r2)
            if (r7 != 0) goto L68
            java.lang.String r2 = com.amap.api.col.s.b4.i(r2)
            r0.append(r6)
            r0.append(r2)
        L68:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r5 = r1.getQueryString()
            java.lang.String r5 = com.amap.api.col.s.b4.i(r5)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            int r4 = r1.getPageSize()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            int r1 = r1.getPageNumber()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            goto Lf9
        La6:
            com.amap.api.services.busline.BusStationQuery r1 = (com.amap.api.services.busline.BusStationQuery) r1
            java.lang.String r2 = r1.getCity()
            boolean r7 = com.amap.api.col.s.r4.s0(r2)
            if (r7 != 0) goto Lbc
            java.lang.String r2 = com.amap.api.col.s.b4.i(r2)
            r0.append(r6)
            r0.append(r2)
        Lbc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r5 = r1.getQueryString()
            java.lang.String r5 = com.amap.api.col.s.b4.i(r5)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            int r4 = r1.getPageSize()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            int r1 = r1.getPageNumber()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        Lf9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "&key="
            r1.<init>(r2)
            android.content.Context r2 = r8.q
            java.lang.String r2 = com.amap.api.col.s.x0.i(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r3 = this;
            T r0 = r3.n
            boolean r1 = r0 instanceof com.amap.api.services.busline.BusLineQuery
            if (r1 == 0) goto L25
            com.amap.api.services.busline.BusLineQuery r0 = (com.amap.api.services.busline.BusLineQuery) r0
            com.amap.api.services.busline.BusLineQuery$SearchType r0 = r0.getCategory()
            com.amap.api.services.busline.BusLineQuery$SearchType r1 = com.amap.api.services.busline.BusLineQuery.SearchType.BY_LINE_ID
            if (r0 != r1) goto L13
            java.lang.String r0 = "lineid"
            goto L27
        L13:
            T r0 = r3.n
            com.amap.api.services.busline.BusLineQuery r0 = (com.amap.api.services.busline.BusLineQuery) r0
            com.amap.api.services.busline.BusLineQuery$SearchType r0 = r0.getCategory()
            com.amap.api.services.busline.BusLineQuery$SearchType r1 = com.amap.api.services.busline.BusLineQuery.SearchType.BY_LINE_NAME
            if (r0 != r1) goto L22
            java.lang.String r0 = "linename"
            goto L27
        L22:
            java.lang.String r0 = ""
            goto L27
        L25:
            java.lang.String r0 = "stopname"
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.amap.api.col.s.i4.b()
            r1.append(r2)
            java.lang.String r2 = "/bus/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
