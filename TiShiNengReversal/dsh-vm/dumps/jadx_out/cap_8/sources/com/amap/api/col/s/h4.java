package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h4 extends com.amap.api.col.s.f4<com.amap.api.services.cloud.CloudSearch.Query, com.amap.api.services.cloud.CloudResult> {
    private int t;

    public h4(android.content.Context r1, com.amap.api.services.cloud.CloudSearch.Query r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.t = r1
            return
    }

    private java.lang.String Q() {
            r1 = this;
            T r0 = r1.n
            com.amap.api.services.cloud.CloudSearch$Query r0 = (com.amap.api.services.cloud.CloudSearch.Query) r0
            com.amap.api.services.cloud.CloudSearch$Sortingrules r0 = r0.getSortingrules()
            if (r0 == 0) goto L17
            T r0 = r1.n
            com.amap.api.services.cloud.CloudSearch$Query r0 = (com.amap.api.services.cloud.CloudSearch.Query) r0
            com.amap.api.services.cloud.CloudSearch$Sortingrules r0 = r0.getSortingrules()
            java.lang.String r0 = r0.toString()
            return r0
        L17:
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String R() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            T r1 = r3.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            java.lang.String r1 = r1.getFilterString()
            T r2 = r3.n
            com.amap.api.services.cloud.CloudSearch$Query r2 = (com.amap.api.services.cloud.CloudSearch.Query) r2
            java.lang.String r2 = r2.getFilterNumString()
            r0.append(r1)
            boolean r1 = com.amap.api.col.s.j4.j(r1)
            if (r1 != 0) goto L29
            boolean r1 = com.amap.api.col.s.j4.j(r2)
            if (r1 != 0) goto L29
            java.lang.String r1 = "&&"
            r0.append(r1)
        L29:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String T(java.lang.String r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = "&&"
            java.lang.String r1 = "%26%26"
            java.lang.String r2 = r2.replace(r0, r1)
        La:
            return r2
    }

    private static java.lang.String Z(java.util.Map<java.lang.String, java.lang.String> r3) {
            if (r3 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L26
            java.lang.String r2 = "&"
            r0.append(r2)
        L26:
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            goto Lf
        L3e:
            java.lang.String r3 = r0.toString()
            return r3
        L43:
            r3 = 0
            return r3
    }

    private com.amap.api.services.cloud.CloudResult a0(java.lang.String r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            java.lang.String r1 = ""
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lc
            goto L2f
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r0 = r4.b0(r1)     // Catch: java.lang.Throwable -> L15
        L15:
            T r5 = r4.n
            r1 = r5
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            int r2 = r4.t
            com.amap.api.services.cloud.CloudSearch$Query r5 = (com.amap.api.services.cloud.CloudSearch.Query) r5
            com.amap.api.services.cloud.CloudSearch$SearchBound r5 = r5.getBound()
            T r3 = r4.n
            com.amap.api.services.cloud.CloudSearch$Query r3 = (com.amap.api.services.cloud.CloudSearch.Query) r3
            int r3 = r3.getPageSize()
            com.amap.api.services.cloud.CloudResult r5 = com.amap.api.services.cloud.CloudResult.createPagedResult(r1, r2, r5, r3, r0)
            return r5
        L2f:
            T r5 = r4.n
            r1 = r5
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            int r2 = r4.t
            com.amap.api.services.cloud.CloudSearch$Query r5 = (com.amap.api.services.cloud.CloudSearch.Query) r5
            com.amap.api.services.cloud.CloudSearch$SearchBound r5 = r5.getBound()
            T r3 = r4.n
            com.amap.api.services.cloud.CloudSearch$Query r3 = (com.amap.api.services.cloud.CloudSearch.Query) r3
            int r3 = r3.getPageSize()
            com.amap.api.services.cloud.CloudResult r5 = com.amap.api.services.cloud.CloudResult.createPagedResult(r1, r2, r5, r3, r0)
            return r5
    }

    private java.util.ArrayList<com.amap.api.services.cloud.CloudItem> b0(org.json.JSONObject r5) throws org.json.JSONException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONArray r1 = com.amap.api.col.s.f4.U(r5)
            if (r1 != 0) goto Lc
            goto L2a
        Lc:
            int r5 = com.amap.api.col.s.f4.W(r5)
            r4.t = r5
            r5 = 0
        L13:
            int r2 = r1.length()
            if (r5 >= r2) goto L2a
            org.json.JSONObject r2 = r1.optJSONObject(r5)
            com.amap.api.services.cloud.CloudItemDetail r3 = com.amap.api.col.s.f4.X(r2)
            com.amap.api.col.s.f4.V(r3, r2)
            r0.add(r3)
            int r5 = r5 + 1
            goto L13
        L2a:
            return r0
    }

    private static java.lang.String c(java.util.Map<java.lang.String, java.lang.String> r0) {
            java.lang.String r0 = Z(r0)
            java.lang.String r0 = d0(r0)
            return r0
    }

    private static java.lang.String c0(java.lang.String r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = "%26%26"
            java.lang.String r1 = "&&"
            java.lang.String r2 = r2.replace(r0, r1)
        La:
            return r2
    }

    private static java.lang.String d0(java.lang.String r7) {
            java.lang.String r0 = "&"
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            java.lang.String r7 = ""
            return r7
        Lb:
            r0 = move-exception
            goto L49
        Ld:
            java.lang.String r7 = T(r7)     // Catch: java.lang.Throwable -> Lb
            java.lang.String[] r1 = r7.split(r0)     // Catch: java.lang.Throwable -> Lb
            java.util.Arrays.sort(r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            int r3 = r1.length     // Catch: java.lang.Throwable -> Lb
            r4 = 0
            r5 = 0
        L20:
            if (r5 >= r3) goto L2d
            r6 = r1[r5]     // Catch: java.lang.Throwable -> Lb
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb
            int r5 = r5 + 1
            goto L20
        L2d:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = c0(r0)     // Catch: java.lang.Throwable -> Lb
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            if (r1 <= r2) goto L48
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 - r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb
            return r0
        L48:
            return r7
        L49:
            java.lang.String r1 = "ut"
            java.lang.String r2 = "sPa"
            com.amap.api.col.s.d2.e(r0, r1, r2)
            return r7
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    public final /* synthetic */ java.lang.Object I(java.lang.String r1) throws com.amap.api.services.core.AMapException {
            r0 = this;
            com.amap.api.services.cloud.CloudResult r1 = r0.a0(r1)
            return r1
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3
    protected final java.lang.String M() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.s.dz
    public final java.lang.String h() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.s.i4.f()
            r0.append(r1)
            java.lang.String r1 = "/datasearch"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            T r1 = r3.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/around"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L3b:
            java.lang.String r2 = "Polygon"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L66
            java.lang.String r2 = "Rectangle"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4c
            goto L66
        L4c:
            java.lang.String r2 = "Local"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/local"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L65:
            return r0
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/polygon"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.amap.api.col.s.b4, com.amap.api.col.s.a3, com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r14 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            android.content.Context r1 = r14.q
            java.lang.String r1 = com.amap.api.col.s.x0.i(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            java.lang.String r1 = "output"
            java.lang.String r2 = "json"
            r0.put(r1, r2)
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            if (r1 == 0) goto L15e
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Bound"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = ","
            if (r1 == 0) goto L97
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenter()
            double r3 = r1.getLongitude()
            double r3 = com.amap.api.col.s.j4.a(r3)
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            com.amap.api.services.core.LatLonPoint r1 = r1.getCenter()
            double r5 = r1.getLatitude()
            double r5 = com.amap.api.col.s.j4.a(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "center"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r2 = (com.amap.api.services.cloud.CloudSearch.Query) r2
            com.amap.api.services.cloud.CloudSearch$SearchBound r2 = r2.getBound()
            int r2 = r2.getRange()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "radius"
            r0.put(r2, r1)
            goto L15e
        L97:
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r3 = "Rectangle"
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = ";"
            java.lang.String r4 = "polygon"
            if (r1 == 0) goto L109
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            com.amap.api.services.core.LatLonPoint r1 = r1.getLowerLeft()
            T r5 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r5 = (com.amap.api.services.cloud.CloudSearch.Query) r5
            com.amap.api.services.cloud.CloudSearch$SearchBound r5 = r5.getBound()
            com.amap.api.services.core.LatLonPoint r5 = r5.getUpperRight()
            double r6 = r1.getLatitude()
            double r6 = com.amap.api.col.s.j4.a(r6)
            double r8 = r1.getLongitude()
            double r8 = com.amap.api.col.s.j4.a(r8)
            double r10 = r5.getLatitude()
            double r10 = com.amap.api.col.s.j4.a(r10)
            double r12 = r5.getLongitude()
            double r12 = com.amap.api.col.s.j4.a(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            r1.append(r6)
            r1.append(r3)
            r1.append(r12)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.put(r4, r1)
            goto L15e
        L109:
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Polygon"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L139
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.util.List r1 = r1.getPolyGonList()
            if (r1 == 0) goto L15e
            int r2 = r1.size()
            if (r2 <= 0) goto L15e
            java.lang.String r1 = com.amap.api.col.s.j4.g(r1, r3)
            r0.put(r4, r1)
            goto L15e
        L139:
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getShape()
            java.lang.String r2 = "Local"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L15e
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            com.amap.api.services.cloud.CloudSearch$SearchBound r1 = r1.getBound()
            java.lang.String r1 = r1.getCity()
            java.lang.String r2 = "city"
            r0.put(r2, r1)
        L15e:
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            java.lang.String r1 = r1.getTableID()
            java.lang.String r2 = "layerId"
            r0.put(r2, r1)
            java.lang.String r1 = r14.Q()
            boolean r1 = com.amap.api.col.s.j4.j(r1)
            if (r1 != 0) goto L17e
            java.lang.String r1 = "sortrule"
            java.lang.String r2 = r14.Q()
            r0.put(r1, r2)
        L17e:
            java.lang.String r1 = r14.R()
            boolean r2 = com.amap.api.col.s.j4.j(r1)
            if (r2 != 0) goto L18d
            java.lang.String r2 = "filter"
            r0.put(r2, r1)
        L18d:
            T r1 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r1 = (com.amap.api.services.cloud.CloudSearch.Query) r1
            java.lang.String r1 = r1.getQueryString()
            java.lang.String r2 = "keywords"
            java.lang.String r3 = ""
            if (r1 == 0) goto L1a5
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L1a5
            r0.put(r2, r1)
            goto L1a8
        L1a5:
            r0.put(r2, r3)
        L1a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r2 = (com.amap.api.services.cloud.CloudSearch.Query) r2
            int r2 = r2.getPageSize()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "pageSize"
            r0.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            T r2 = r14.n
            com.amap.api.services.cloud.CloudSearch$Query r2 = (com.amap.api.services.cloud.CloudSearch.Query) r2
            int r2 = r2.getPageNum()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "pageNum"
            r0.put(r2, r1)
            java.lang.String r1 = com.amap.api.col.s.a1.a()
            android.content.Context r2 = r14.q
            java.lang.String r3 = c(r0)
            java.lang.String r2 = com.amap.api.col.s.a1.c(r2, r1, r3)
            java.lang.String r3 = "ts"
            r0.put(r3, r1)
            java.lang.String r1 = "scode"
            r0.put(r1, r2)
            return r0
    }
}
