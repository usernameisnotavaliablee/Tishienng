package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g extends com.amap.api.col.s.d<com.amap.api.col.s.k, com.amap.api.services.poisearch.PoiResult> {
    private int t;
    private boolean u;
    private java.util.List<java.lang.String> v;
    private java.util.List<com.amap.api.services.core.SuggestionCity> w;

    public g(android.content.Context r1, com.amap.api.col.s.k r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.t = r1
            r0.u = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.v = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.w = r1
            return
    }

    private java.lang.String W(boolean r15) {
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "output=json"
            r0.append(r1)
            T r1 = r14.n
            r2 = r1
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$SearchBound r2 = r2.f4529b
            java.lang.String r3 = "&sortrule="
            java.lang.String r4 = "&location="
            java.lang.String r5 = ","
            if (r2 == 0) goto L132
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8f
            if (r15 == 0) goto L67
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            com.amap.api.services.core.LatLonPoint r15 = r15.getCenter()
            double r1 = r15.getLongitude()
            double r1 = com.amap.api.col.s.j4.a(r1)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            com.amap.api.services.core.LatLonPoint r15 = r15.getCenter()
            double r6 = r15.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r6)
            r0.append(r4)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r1)
            r15.append(r5)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r0.append(r15)
        L67:
            java.lang.String r15 = "&radius="
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            int r15 = r15.getRange()
            r0.append(r15)
            r0.append(r3)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            boolean r15 = r15.isDistanceSort()
            java.lang.String r15 = X(r15)
            r0.append(r15)
            goto L132
        L8f:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            java.lang.String r15 = r15.getShape()
            java.lang.String r1 = "Rectangle"
            boolean r15 = r15.equals(r1)
            java.lang.String r1 = "&polygon="
            if (r15 == 0) goto Lfb
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            com.amap.api.services.core.LatLonPoint r15 = r15.getLowerLeft()
            T r2 = r14.n
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$SearchBound r2 = r2.f4529b
            com.amap.api.services.core.LatLonPoint r2 = r2.getUpperRight()
            double r6 = r15.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r6)
            double r8 = r15.getLongitude()
            double r8 = com.amap.api.col.s.j4.a(r8)
            double r10 = r2.getLatitude()
            double r10 = com.amap.api.col.s.j4.a(r10)
            double r12 = r2.getLongitude()
            double r12 = com.amap.api.col.s.j4.a(r12)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r1)
            r15.append(r8)
            r15.append(r5)
            r15.append(r6)
            java.lang.String r1 = ";"
            r15.append(r1)
            r15.append(r12)
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            r0.append(r15)
            goto L132
        Lfb:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            java.lang.String r15 = r15.getShape()
            java.lang.String r2 = "Polygon"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L132
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$SearchBound r15 = r15.f4529b
            java.util.List r15 = r15.getPolyGonList()
            if (r15 == 0) goto L132
            int r2 = r15.size()
            if (r2 <= 0) goto L132
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r15 = com.amap.api.col.s.j4.f(r15)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r0.append(r15)
        L132:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getCity()
            boolean r1 = com.amap.api.col.s.d.V(r15)
            if (r1 != 0) goto L14e
            java.lang.String r15 = com.amap.api.col.s.b4.i(r15)
            java.lang.String r1 = "&city="
            r0.append(r1)
            r0.append(r15)
        L14e:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getQueryString()
            java.lang.String r15 = com.amap.api.col.s.b4.i(r15)
            boolean r1 = com.amap.api.col.s.d.V(r15)
            if (r1 != 0) goto L16a
            java.lang.String r1 = "&keywords="
            r0.append(r1)
            r0.append(r15)
        L16a:
            java.lang.String r15 = "&offset="
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            int r15 = r15.getPageSize()
            r0.append(r15)
            java.lang.String r15 = "&page="
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            int r15 = r15.getPageNum()
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getBuilding()
            if (r15 == 0) goto L1b6
            java.lang.String r15 = r15.trim()
            int r15 = r15.length()
            if (r15 <= 0) goto L1b6
            java.lang.String r15 = "&building="
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getBuilding()
            r0.append(r15)
        L1b6:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getCategory()
            java.lang.String r15 = com.amap.api.col.s.b4.i(r15)
            boolean r1 = com.amap.api.col.s.d.V(r15)
            if (r1 != 0) goto L1d2
            java.lang.String r1 = "&types="
            r0.append(r1)
            r0.append(r15)
        L1d2:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getExtensions()
            boolean r15 = com.amap.api.col.s.d.V(r15)
            if (r15 != 0) goto L1f5
            java.lang.String r15 = "&extensions="
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            java.lang.String r15 = r15.getExtensions()
            r0.append(r15)
            goto L1fa
        L1f5:
            java.lang.String r15 = "&extensions=base"
            r0.append(r15)
        L1fa:
            java.lang.String r15 = "&key="
            r0.append(r15)
            android.content.Context r15 = r14.q
            java.lang.String r15 = com.amap.api.col.s.x0.i(r15)
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            boolean r15 = r15.getCityLimit()
            if (r15 == 0) goto L21a
            java.lang.String r15 = "&citylimit=true"
            r0.append(r15)
            goto L21f
        L21a:
            java.lang.String r15 = "&citylimit=false"
            r0.append(r15)
        L21f:
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            boolean r15 = r15.isRequireSubPois()
            if (r15 == 0) goto L231
            java.lang.String r15 = "&children=1"
            r0.append(r15)
            goto L236
        L231:
            java.lang.String r15 = "&children=0"
            r0.append(r15)
        L236:
            boolean r15 = r14.u
            if (r15 == 0) goto L251
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            boolean r15 = r15.isSpecial()
            if (r15 == 0) goto L24c
            java.lang.String r15 = "&special=1"
            r0.append(r15)
            goto L251
        L24c:
            java.lang.String r15 = "&special=0"
            r0.append(r15)
        L251:
            T r15 = r14.n
            r1 = r15
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            if (r1 != 0) goto L2b4
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            com.amap.api.services.core.LatLonPoint r15 = r15.getLocation()
            if (r15 == 0) goto L2b4
            r0.append(r3)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            boolean r15 = r15.isDistanceSort()
            java.lang.String r15 = X(r15)
            r0.append(r15)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            com.amap.api.services.core.LatLonPoint r15 = r15.getLocation()
            double r1 = r15.getLongitude()
            double r1 = com.amap.api.col.s.j4.a(r1)
            T r15 = r14.n
            com.amap.api.col.s.k r15 = (com.amap.api.col.s.k) r15
            com.amap.api.services.poisearch.PoiSearch$Query r15 = r15.a
            com.amap.api.services.core.LatLonPoint r15 = r15.getLocation()
            double r6 = r15.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r6)
            r0.append(r4)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r1)
            r15.append(r5)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r0.append(r15)
        L2b4:
            java.lang.String r15 = r0.toString()
            return r15
    }

    private static java.lang.String X(boolean r0) {
            if (r0 == 0) goto L5
            java.lang.String r0 = "distance"
            return r0
        L5:
            java.lang.String r0 = "weight"
            return r0
    }

    private com.amap.api.services.poisearch.PoiResult Y(java.lang.String r19) throws com.amap.api.services.core.AMapException {
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "PoiSearchKeywordHandler"
            java.lang.String r3 = "suggestion"
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r0 != 0) goto L2e
            T r0 = r1.n
            r2 = r0
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$Query r4 = r2.a
            r2 = r0
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$SearchBound r5 = r2.f4529b
            java.util.List<java.lang.String> r6 = r1.v
            java.util.List<com.amap.api.services.core.SuggestionCity> r7 = r1.w
            com.amap.api.col.s.k r0 = (com.amap.api.col.s.k) r0
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r0.a
            int r8 = r0.getPageSize()
            int r9 = r1.t
            com.amap.api.services.poisearch.PoiResult r0 = com.amap.api.services.poisearch.PoiResult.createPagedResult(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L2e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> La2 org.json.JSONException -> La4
            r4.<init>(r0)     // Catch: java.lang.Exception -> La2 org.json.JSONException -> La4
            java.lang.String r0 = "count"
            int r0 = r4.optInt(r0)     // Catch: java.lang.Exception -> La2 org.json.JSONException -> La4
            r1.t = r0     // Catch: java.lang.Exception -> La2 org.json.JSONException -> La4
            java.util.ArrayList r17 = com.amap.api.col.s.r4.U(r4)     // Catch: java.lang.Exception -> La2 org.json.JSONException -> La4
            boolean r0 = r4.has(r3)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            if (r0 != 0) goto L6e
            T r0 = r1.n     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r3 = r0
            com.amap.api.col.s.k r3 = (com.amap.api.col.s.k) r3     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$Query r11 = r3.a     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r3 = r0
            com.amap.api.col.s.k r3 = (com.amap.api.col.s.k) r3     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$SearchBound r12 = r3.f4529b     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            java.util.List<java.lang.String> r13 = r1.v     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            java.util.List<com.amap.api.services.core.SuggestionCity> r14 = r1.w     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.col.s.k r0 = (com.amap.api.col.s.k) r0     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r0.a     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            int r15 = r0.getPageSize()     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            int r0 = r1.t     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r16 = r0
            com.amap.api.services.poisearch.PoiResult r0 = com.amap.api.services.poisearch.PoiResult.createPagedResult(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            return r0
        L66:
            r0 = move-exception
            r10 = r17
            goto La6
        L6a:
            r0 = move-exception
            r10 = r17
            goto Lae
        L6e:
            org.json.JSONObject r0 = r4.optJSONObject(r3)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            if (r0 != 0) goto L95
            T r0 = r1.n     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r3 = r0
            com.amap.api.col.s.k r3 = (com.amap.api.col.s.k) r3     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$Query r11 = r3.a     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r3 = r0
            com.amap.api.col.s.k r3 = (com.amap.api.col.s.k) r3     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$SearchBound r12 = r3.f4529b     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            java.util.List<java.lang.String> r13 = r1.v     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            java.util.List<com.amap.api.services.core.SuggestionCity> r14 = r1.w     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.col.s.k r0 = (com.amap.api.col.s.k) r0     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r0.a     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            int r15 = r0.getPageSize()     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            int r0 = r1.t     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r16 = r0
            com.amap.api.services.poisearch.PoiResult r0 = com.amap.api.services.poisearch.PoiResult.createPagedResult(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            return r0
        L95:
            java.util.ArrayList r3 = com.amap.api.col.s.r4.w(r0)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r1.w = r3     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            java.util.ArrayList r0 = com.amap.api.col.s.r4.M(r0)     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            r1.v = r0     // Catch: java.lang.Exception -> L66 org.json.JSONException -> L6a
            goto Lb4
        La2:
            r0 = move-exception
            goto La6
        La4:
            r0 = move-exception
            goto Lae
        La6:
            java.lang.String r3 = "paseJSONException"
            com.amap.api.col.s.j4.i(r0, r2, r3)
        Lab:
            r17 = r10
            goto Lb4
        Lae:
            java.lang.String r3 = "paseJSONJSONException"
            com.amap.api.col.s.j4.i(r0, r2, r3)
            goto Lab
        Lb4:
            T r0 = r1.n
            r2 = r0
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$Query r11 = r2.a
            r2 = r0
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$SearchBound r12 = r2.f4529b
            java.util.List<java.lang.String> r13 = r1.v
            java.util.List<com.amap.api.services.core.SuggestionCity> r14 = r1.w
            com.amap.api.col.s.k r0 = (com.amap.api.col.s.k) r0
            com.amap.api.services.poisearch.PoiSearch$Query r0 = r0.a
            int r15 = r0.getPageSize()
            int r0 = r1.t
            r16 = r0
            com.amap.api.services.poisearch.PoiResult r0 = com.amap.api.services.poisearch.PoiResult.createPagedResult(r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    private static com.amap.api.col.s.p Z() {
            com.amap.api.col.s.n r0 = com.amap.api.col.s.n.b()
            java.lang.String r1 = "regeo"
            com.amap.api.col.s.o r0 = r0.c(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            com.amap.api.col.s.p r0 = (com.amap.api.col.s.p) r0
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    public final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.poisearch.PoiResult r1 = r0.Y(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.W(r0)
            return r0
    }

    @Override // com.amap.api.col.s.a3
    protected final com.amap.api.col.s.n.b P() {
            r12 = this;
            com.amap.api.col.s.n$b r0 = new com.amap.api.col.s.n$b
            r0.<init>()
            boolean r1 = r12.u
            java.lang.String r2 = "language="
            if (r1 == 0) goto L80
            com.amap.api.col.s.p r1 = Z()
            if (r1 == 0) goto L17
            double r3 = r1.l()
        L15:
            r10 = r3
            goto L1a
        L17:
            r3 = 0
            goto L15
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r12.h()
            r1.append(r3)
            r3 = 0
            java.lang.String r3 = r12.W(r3)
            r1.append(r3)
            r1.append(r2)
            com.amap.api.services.core.ServiceSettings r2 = com.amap.api.services.core.ServiceSettings.getInstance()
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a = r1
            T r1 = r12.n
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            T r1 = r12.n
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenter()
            double r1 = r1.getLongitude()
            double r8 = com.amap.api.col.s.j4.a(r1)
            T r1 = r12.n
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenter()
            double r1 = r1.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r1)
            com.amap.api.col.s.p$a r5 = new com.amap.api.col.s.p$a
            r5.<init>(r6, r8, r10)
            r0.f4573b = r5
        L7f:
            return r0
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r12.h()
            r1.append(r3)
            java.lang.String r3 = r12.M()
            r1.append(r3)
            r1.append(r2)
            com.amap.api.services.core.ServiceSettings r2 = com.amap.api.services.core.ServiceSettings.getInstance()
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a = r1
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.b()
            r0.append(r1)
            java.lang.String r1 = "/place"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            T r1 = r3.n
            r2 = r1
            com.amap.api.col.s.k r2 = (com.amap.api.col.s.k) r2
            com.amap.api.services.poisearch.PoiSearch$SearchBound r2 = r2.f4529b
            if (r2 != 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/text?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L30:
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/around?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            r3.u = r1
            return r0
        L55:
            T r1 = r3.n
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Rectangle"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7b
            T r1 = r3.n
            com.amap.api.col.s.k r1 = (com.amap.api.col.s.k) r1
            com.amap.api.services.poisearch.PoiSearch$SearchBound r1 = r1.f4529b
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Polygon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return r0
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/polygon?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
