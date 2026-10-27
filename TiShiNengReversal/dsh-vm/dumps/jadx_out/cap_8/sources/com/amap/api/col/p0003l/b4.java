package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b4 extends com.amap.api.col.p0003l.z3<java.util.List<com.amap.api.trace.TraceLocation>, java.util.List<com.amap.api.maps.model.LatLng>> implements java.lang.Runnable {
    private java.lang.String A;
    private java.util.List<com.amap.api.trace.TraceLocation> w;
    private android.os.Handler x;
    private int y;
    private int z;

    public b4(android.content.Context r1, android.os.Handler r2, java.util.List<com.amap.api.trace.TraceLocation> r3, java.lang.String r4, int r5, int r6) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.w = r3
            r0.x = r2
            r0.z = r5
            r0.y = r6
            r0.A = r4
            return
    }

    private static java.util.List<com.amap.api.maps.model.LatLng> o(java.lang.String r7) throws com.amap.api.col.p0003l.fc {
            java.lang.String r0 = "data"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r2.has(r0)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L13
            goto L50
        L13:
            org.json.JSONObject r7 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "points"
            org.json.JSONArray r7 = r7.optJSONArray(r0)     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L50
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L26
            goto L50
        L26:
            r0 = 0
        L27:
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L50
            if (r0 >= r2) goto L50
            org.json.JSONObject r2 = r7.optJSONObject(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "y"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Throwable -> L50
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "x"
            java.lang.String r2 = r2.optString(r5)     // Catch: java.lang.Throwable -> L50
            double r5 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Throwable -> L50
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L50
            r1.add(r2)     // Catch: java.lang.Throwable -> L50
            int r0 = r0 + 1
            goto L27
        L50:
            return r1
    }

    @Override // com.amap.api.col.p0003l.z3, com.amap.api.col.p0003l.y3
    protected final /* synthetic */ java.lang.Object g(java.lang.String r1) throws com.amap.api.col.p0003l.fc {
            r0 = this;
            java.util.List r1 = o(r1)
            return r1
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getIPV6URL() {
            r1 = this;
            java.lang.String r0 = r1.getURL()
            java.lang.String r0 = com.amap.api.col.p0003l.b3.y(r0)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final java.lang.String getURL() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "key="
            r0.<init>(r1)
            android.content.Context r1 = r5.t
            java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
            java.lang.String r2 = "&ts="
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r3)
            android.content.Context r3 = r5.t
            java.lang.String r1 = com.amap.api.col.p0003l.h4.c(r3, r1, r0)
            java.lang.String r3 = "&scode="
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "http://restsdk.amap.com/v4/grasproad/driving?"
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final boolean isSupportIPV6() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.amap.api.col.p0003l.z3, com.amap.api.col.p0003l.y3
    protected final java.lang.String l() {
            r17 = this;
            r0 = r17
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
            r4 = 0
            r5 = r2
        Lb:
            java.util.List<com.amap.api.trace.TraceLocation> r7 = r0.w
            int r7 = r7.size()
            if (r4 >= r7) goto L7e
            java.util.List<com.amap.api.trace.TraceLocation> r7 = r0.w
            java.lang.Object r7 = r7.get(r4)
            com.amap.api.trace.TraceLocation r7 = (com.amap.api.trace.TraceLocation) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "x"
            double r10 = r7.getLongitude()     // Catch: org.json.JSONException -> L78
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L78
            java.lang.String r9 = "y"
            double r10 = r7.getLatitude()     // Catch: org.json.JSONException -> L78
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L78
            java.lang.String r9 = "ag"
            float r10 = r7.getBearing()     // Catch: org.json.JSONException -> L78
            int r10 = (int) r10     // Catch: org.json.JSONException -> L78
            r8.put(r9, r10)     // Catch: org.json.JSONException -> L78
            long r9 = r7.getTime()     // Catch: org.json.JSONException -> L78
            java.lang.String r11 = "tm"
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r4 != 0) goto L59
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 != 0) goto L52
            long r9 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L78
            r14 = 10000(0x2710, double:4.9407E-320)
            long r9 = r9 - r14
            long r9 = r9 / r12
        L52:
            long r12 = r9 / r12
            r8.put(r11, r12)     // Catch: org.json.JSONException -> L78
        L57:
            r5 = r9
            goto L6e
        L59:
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 == 0) goto L69
            long r14 = r9 - r5
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 >= 0) goto L64
            goto L69
        L64:
            long r14 = r14 / r12
            r8.put(r11, r14)     // Catch: org.json.JSONException -> L78
            goto L57
        L69:
            r12 = 1
            r8.put(r11, r12)     // Catch: org.json.JSONException -> L78
            goto L57
        L6e:
            java.lang.String r9 = "sp"
            float r7 = r7.getSpeed()     // Catch: org.json.JSONException -> L78
            int r7 = (int) r7     // Catch: org.json.JSONException -> L78
            r8.put(r9, r7)     // Catch: org.json.JSONException -> L78
        L78:
            r1.put(r8)
            int r4 = r4 + 1
            goto Lb
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getURL()
            r2.append(r3)
            java.lang.String r3 = "&"
            r2.append(r3)
            java.lang.String r3 = r1.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.u = r2
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r0 = r4.m()     // Catch: com.amap.api.col.p0003l.fc -> L26 java.lang.Throwable -> L35
            java.util.List r0 = (java.util.List) r0     // Catch: com.amap.api.col.p0003l.fc -> L26 java.lang.Throwable -> L35
            com.amap.api.col.3l.d4 r1 = com.amap.api.col.p0003l.d4.b()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r4.A     // Catch: java.lang.Throwable -> L35
            int r3 = r4.y     // Catch: java.lang.Throwable -> L35
            r1.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L35
            com.amap.api.col.3l.d4 r0 = com.amap.api.col.p0003l.d4.b()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r4.A     // Catch: java.lang.Throwable -> L35
            com.amap.api.col.3l.d4$a r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L35
            android.os.Handler r1 = r4.x     // Catch: java.lang.Throwable -> L35
            r0.b(r1)     // Catch: java.lang.Throwable -> L35
            return
        L26:
            r0 = move-exception
            com.amap.api.col.p0003l.d4.b()     // Catch: java.lang.Throwable -> L35
            android.os.Handler r1 = r4.x     // Catch: java.lang.Throwable -> L35
            int r2 = r4.z     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> L35
            com.amap.api.col.p0003l.d4.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }
}
