package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e1 {
    private static long a;

    static {
            return
    }

    public e1() {
            r0 = this;
            r0.<init>()
            return
    }

    private static double a(com.amap.api.location.DPoint r11, com.amap.api.location.DPoint r12, com.amap.api.location.DPoint r13) {
            double r0 = r11.getLongitude()
            double r2 = r12.getLongitude()
            double r0 = r0 - r2
            double r2 = r11.getLatitude()
            double r4 = r12.getLatitude()
            double r2 = r2 - r4
            double r4 = r13.getLongitude()
            double r6 = r12.getLongitude()
            double r4 = r4 - r6
            double r6 = r13.getLatitude()
            double r8 = r12.getLatitude()
            double r6 = r6 - r8
            double r0 = r0 * r4
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r4 * r4
            double r8 = r6 * r6
            double r2 = r2 + r8
            double r0 = r0 / r2
            double r2 = r12.getLongitude()
            double r8 = r13.getLongitude()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L49
            double r2 = r12.getLatitude()
            double r8 = r13.getLatitude()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 < 0) goto L72
            if (r2 == 0) goto L53
            goto L72
        L53:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L62
            double r0 = r13.getLongitude()
            double r12 = r13.getLatitude()
            goto L7a
        L62:
            double r2 = r12.getLongitude()
            double r4 = r4 * r0
            double r2 = r2 + r4
            double r12 = r12.getLatitude()
            double r0 = r0 * r6
            double r12 = r12 + r0
            r0 = r2
            goto L7a
        L72:
            double r0 = r12.getLongitude()
            double r12 = r12.getLatitude()
        L7a:
            com.amap.api.location.DPoint r2 = new com.amap.api.location.DPoint
            double r3 = r11.getLatitude()
            double r5 = r11.getLongitude()
            r2.<init>(r3, r5)
            com.amap.api.location.DPoint r11 = new com.amap.api.location.DPoint
            r11.<init>(r12, r0)
            float r11 = com.autonavi.aps.amapapi.utils.j.a(r2, r11)
            double r11 = (double) r11
            return r11
    }

    public static int b(java.lang.String r16, java.util.List<com.amap.api.fence.GeoFence> r17, android.os.Bundle r18) {
            r0 = r17
            r1 = r18
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L125
            r3 = r16
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L125
            java.lang.String r3 = "status"
            r4 = 0
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = "infocode"
            int r5 = r2.optInt(r5, r4)     // Catch: java.lang.Throwable -> L125
            r6 = 1
            if (r3 != r6) goto L123
            java.lang.String r3 = "pois"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch: java.lang.Throwable -> L125
            if (r2 == 0) goto L123
            r3 = 0
        L24:
            int r7 = r2.length()     // Catch: java.lang.Throwable -> L125
            if (r3 >= r7) goto L123
            com.amap.api.fence.GeoFence r7 = new com.amap.api.fence.GeoFence     // Catch: java.lang.Throwable -> L125
            r7.<init>()     // Catch: java.lang.Throwable -> L125
            com.amap.api.fence.PoiItem r8 = new com.amap.api.fence.PoiItem     // Catch: java.lang.Throwable -> L125
            r8.<init>()     // Catch: java.lang.Throwable -> L125
            org.json.JSONObject r9 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "id"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            r8.setPoiId(r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "name"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            r8.setPoiName(r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "type"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            r8.setPoiType(r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "typecode"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            r8.setTypeCode(r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "address"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            r8.setAddress(r10)     // Catch: java.lang.Throwable -> L125
            java.lang.String r10 = "location"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L125
            if (r10 == 0) goto Laa
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)     // Catch: java.lang.Throwable -> L125
            r11 = r10[r4]     // Catch: java.lang.Throwable -> L125
            double r11 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.Throwable -> L125
            r8.setLongitude(r11)     // Catch: java.lang.Throwable -> L125
            r10 = r10[r6]     // Catch: java.lang.Throwable -> L125
            double r10 = java.lang.Double.parseDouble(r10)     // Catch: java.lang.Throwable -> L125
            r8.setLatitude(r10)     // Catch: java.lang.Throwable -> L125
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r10.<init>()     // Catch: java.lang.Throwable -> L125
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L125
            r11.<init>()     // Catch: java.lang.Throwable -> L125
            com.amap.api.location.DPoint r12 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> L125
            double r13 = r8.getLatitude()     // Catch: java.lang.Throwable -> L125
            r15 = r5
            double r4 = r8.getLongitude()     // Catch: java.lang.Throwable -> L125
            r12.<init>(r13, r4)     // Catch: java.lang.Throwable -> L125
            r11.add(r12)     // Catch: java.lang.Throwable -> L125
            r10.add(r11)     // Catch: java.lang.Throwable -> L125
            r7.setPointList(r10)     // Catch: java.lang.Throwable -> L125
            r7.setCenter(r12)     // Catch: java.lang.Throwable -> L125
            goto Lab
        Laa:
            r15 = r5
        Lab:
            java.lang.String r4 = "tel"
            java.lang.String r4 = r9.optString(r4)     // Catch: java.lang.Throwable -> L125
            r8.setTel(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "pname"
            java.lang.String r4 = r9.optString(r4)     // Catch: java.lang.Throwable -> L125
            r8.setProvince(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "cityname"
            java.lang.String r4 = r9.optString(r4)     // Catch: java.lang.Throwable -> L125
            r8.setCity(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "adname"
            java.lang.String r4 = r9.optString(r4)     // Catch: java.lang.Throwable -> L125
            r8.setAdname(r4)     // Catch: java.lang.Throwable -> L125
            r7.setPoiItem(r8)     // Catch: java.lang.Throwable -> L125
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L125
            r4.<init>()     // Catch: java.lang.Throwable -> L125
            long r8 = c()     // Catch: java.lang.Throwable -> L125
            r4.append(r8)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L125
            r7.setFenceId(r4)     // Catch: java.lang.Throwable -> L125
            if (r1 == 0) goto L118
            java.lang.String r4 = "customId"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L125
            r7.setCustomId(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "pendingIntentAction"
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L125
            r7.setPendingIntentAction(r4)     // Catch: java.lang.Throwable -> L125
            r4 = 2
            r7.setType(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "fenceRadius"
            float r4 = r1.getFloat(r4)     // Catch: java.lang.Throwable -> L125
            r7.setRadius(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "expiration"
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L125
            r7.setExpiration(r4)     // Catch: java.lang.Throwable -> L125
            java.lang.String r4 = "activatesAction"
            int r4 = r1.getInt(r4, r6)     // Catch: java.lang.Throwable -> L125
            r7.setActivatesAction(r4)     // Catch: java.lang.Throwable -> L125
        L118:
            if (r0 == 0) goto L11d
            r0.add(r7)     // Catch: java.lang.Throwable -> L125
        L11d:
            int r3 = r3 + 1
            r5 = r15
            r4 = 0
            goto L24
        L123:
            r15 = r5
            return r15
        L125:
            r0 = 5
            return r0
    }

    public static synchronized long c() {
            java.lang.Class<com.amap.api.col.3l.e1> r0 = com.amap.api.col.p0003l.e1.class
            monitor-enter(r0)
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L10
            long r3 = com.amap.api.col.p0003l.e1.a     // Catch: java.lang.Throwable -> L10
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L12
            com.amap.api.col.p0003l.e1.a = r1     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r1 = move-exception
            goto L1b
        L12:
            r1 = 1
            long r3 = r3 + r1
            com.amap.api.col.p0003l.e1.a = r3     // Catch: java.lang.Throwable -> L10
        L17:
            long r1 = com.amap.api.col.p0003l.e1.a     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private java.util.List<com.amap.api.location.DPoint> d(java.util.List<com.amap.api.location.DPoint> r13, float r14) {
            r12 = this;
            if (r13 != 0) goto L4
            r13 = 0
            return r13
        L4:
            int r0 = r13.size()
            r1 = 2
            if (r0 > r1) goto Lc
            return r13
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = r13.get(r1)
            com.amap.api.location.DPoint r2 = (com.amap.api.location.DPoint) r2
            int r3 = r13.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r13.get(r3)
            com.amap.api.location.DPoint r3 = (com.amap.api.location.DPoint) r3
            r5 = 0
            r7 = 1
            r8 = 0
        L28:
            int r9 = r13.size()
            int r9 = r9 - r4
            if (r7 >= r9) goto L42
            java.lang.Object r9 = r13.get(r7)
            com.amap.api.location.DPoint r9 = (com.amap.api.location.DPoint) r9
            double r9 = a(r9, r2, r3)
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L3f
            r8 = r7
            r5 = r9
        L3f:
            int r7 = r7 + 1
            goto L28
        L42:
            double r9 = (double) r14
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r0.add(r2)
            r0.add(r3)
            return r0
        L4e:
            int r2 = r8 + 1
            java.util.List r1 = r13.subList(r1, r2)
            java.util.List r1 = r12.d(r1, r14)
            int r2 = r13.size()
            java.util.List r13 = r13.subList(r8, r2)
            java.util.List r13 = r12.d(r13, r14)
            r0.addAll(r1)
            int r14 = r0.size()
            int r14 = r14 - r4
            r0.remove(r14)
            r0.addAll(r13)
            return r0
    }

    public static int e(java.lang.String r0, java.util.List<com.amap.api.fence.GeoFence> r1, android.os.Bundle r2) {
            int r0 = b(r0, r1, r2)
            return r0
    }

    public final int f(java.lang.String r34, java.util.List<com.amap.api.fence.GeoFence> r35, android.os.Bundle r36) {
            r33 = this;
            r0 = r36
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La2
            r2 = r34
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = "status"
            r3 = 0
            int r2 = r1.optInt(r2, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = "infocode"
            int r4 = r1.optInt(r4, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "customId"
            java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = "pendingIntentAction"
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = "fenceRadius"
            float r7 = r0.getFloat(r7)     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = "expiration"
            long r8 = r0.getLong(r8)     // Catch: java.lang.Throwable -> La2
            java.lang.String r10 = "activatesAction"
            r11 = 1
            int r0 = r0.getInt(r10, r11)     // Catch: java.lang.Throwable -> La2
            if (r2 != r11) goto L1d5
            java.lang.String r2 = "districts"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L1d5
            r2 = 0
        L40:
            int r10 = r1.length()     // Catch: java.lang.Throwable -> La2
            if (r2 >= r10) goto L1d5
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r10.<init>()     // Catch: java.lang.Throwable -> La2
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r12.<init>()     // Catch: java.lang.Throwable -> La2
            com.amap.api.fence.GeoFence r13 = new com.amap.api.fence.GeoFence     // Catch: java.lang.Throwable -> La2
            r13.<init>()     // Catch: java.lang.Throwable -> La2
            org.json.JSONObject r14 = r1.getJSONObject(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r15 = "citycode"
            java.lang.String r15 = r14.optString(r15)     // Catch: java.lang.Throwable -> La2
            r34 = 0
            java.lang.String r3 = "adcode"
            java.lang.String r3 = r14.optString(r3)     // Catch: java.lang.Throwable -> La2
            r16 = 1
            java.lang.String r11 = "name"
            java.lang.String r11 = r14.optString(r11)     // Catch: java.lang.Throwable -> La2
            r36 = r1
            java.lang.String r1 = "center"
            java.lang.String r1 = r14.getString(r1)     // Catch: java.lang.Throwable -> La2
            r17 = r2
            com.amap.api.location.DPoint r2 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            r18 = r4
            java.lang.String r4 = ","
            if (r1 == 0) goto La6
            java.lang.String[] r1 = r1.split(r4)     // Catch: java.lang.Throwable -> La2
            r19 = r1[r16]     // Catch: java.lang.Throwable -> La2
            r20 = r10
            r21 = r11
            double r10 = java.lang.Double.parseDouble(r19)     // Catch: java.lang.Throwable -> La2
            r2.setLatitude(r10)     // Catch: java.lang.Throwable -> La2
            r1 = r1[r34]     // Catch: java.lang.Throwable -> La2
            double r10 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.Throwable -> La2
            r2.setLongitude(r10)     // Catch: java.lang.Throwable -> La2
            r13.setCenter(r2)     // Catch: java.lang.Throwable -> La2
            goto Laa
        La2:
            r0 = r33
            goto L1da
        La6:
            r20 = r10
            r21 = r11
        Laa:
            r13.setCustomId(r5)     // Catch: java.lang.Throwable -> La2
            r13.setPendingIntentAction(r6)     // Catch: java.lang.Throwable -> La2
            r1 = 3
            r13.setType(r1)     // Catch: java.lang.Throwable -> La2
            r13.setRadius(r7)     // Catch: java.lang.Throwable -> La2
            r13.setExpiration(r8)     // Catch: java.lang.Throwable -> La2
            r13.setActivatesAction(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Throwable -> La2
            long r10 = c()     // Catch: java.lang.Throwable -> La2
            r1.append(r10)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La2
            r13.setFenceId(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "polyline"
            java.lang.String r1 = r14.optString(r1)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L1b3
            java.lang.String r10 = "\\|"
            java.lang.String[] r1 = r1.split(r10)     // Catch: java.lang.Throwable -> La2
            int r10 = r1.length     // Catch: java.lang.Throwable -> La2
            r11 = 1
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r19 = r0
            r0 = 0
        Le6:
            if (r0 >= r10) goto L195
            r22 = r0
            r0 = r1[r22]     // Catch: java.lang.Throwable -> La2
            r23 = r1
            com.amap.api.fence.DistrictItem r1 = new com.amap.api.fence.DistrictItem     // Catch: java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Throwable -> La2
            r24 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r5.<init>()     // Catch: java.lang.Throwable -> La2
            r1.setCitycode(r15)     // Catch: java.lang.Throwable -> La2
            r1.setAdcode(r3)     // Catch: java.lang.Throwable -> La2
            r25 = r3
            r3 = r21
            r1.setDistrictName(r3)     // Catch: java.lang.Throwable -> La2
            r21 = r3
            java.lang.String r3 = ";"
            java.lang.String[] r0 = r0.split(r3)     // Catch: java.lang.Throwable -> La2
            r26 = r6
            r3 = 0
        L112:
            int r6 = r0.length     // Catch: java.lang.Throwable -> La2
            if (r3 >= r6) goto L14d
            r6 = r0[r3]     // Catch: java.lang.Throwable -> La2
            java.lang.String[] r6 = r6.split(r4)     // Catch: java.lang.Throwable -> La2
            r27 = r0
            int r0 = r6.length     // Catch: java.lang.Throwable -> La2
            r28 = r3
            r3 = 1
            if (r0 <= r3) goto L13e
            r0 = r6[r3]     // Catch: java.lang.Throwable -> La2
            r6 = r6[r34]     // Catch: java.lang.Throwable -> La2
            com.amap.api.location.DPoint r3 = new com.amap.api.location.DPoint     // Catch: java.lang.Throwable -> La2
            r30 = r6
            r29 = r7
            double r6 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> La2
            r31 = r8
            double r8 = java.lang.Double.parseDouble(r30)     // Catch: java.lang.Throwable -> La2
            r3.<init>(r6, r8)     // Catch: java.lang.Throwable -> La2
            r5.add(r3)     // Catch: java.lang.Throwable -> La2
            goto L142
        L13e:
            r29 = r7
            r31 = r8
        L142:
            int r3 = r28 + 1
            r0 = r27
            r7 = r29
            r8 = r31
            r16 = 1
            goto L112
        L14d:
            r29 = r7
            r31 = r8
            int r0 = r5.size()     // Catch: java.lang.Throwable -> La2
            float r0 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L163
            r0 = r33
            java.util.List r5 = r0.d(r5, r3)     // Catch: java.lang.Throwable -> L1da
            goto L165
        L163:
            r0 = r33
        L165:
            r12.add(r5)     // Catch: java.lang.Throwable -> L1da
            r1.setPolyline(r5)     // Catch: java.lang.Throwable -> L1da
            r3 = r20
            r3.add(r1)     // Catch: java.lang.Throwable -> L1da
            float r1 = com.amap.api.col.p0003l.a.A(r2, r5)     // Catch: java.lang.Throwable -> L1da
            float r11 = java.lang.Math.max(r11, r1)     // Catch: java.lang.Throwable -> L1da
            float r1 = com.amap.api.col.p0003l.a.b(r2, r5)     // Catch: java.lang.Throwable -> L1da
            float r14 = java.lang.Math.min(r14, r1)     // Catch: java.lang.Throwable -> L1da
            int r1 = r22 + 1
            r0 = r1
            r20 = r3
            r1 = r23
            r5 = r24
            r3 = r25
            r6 = r26
            r7 = r29
            r8 = r31
            r16 = 1
            goto Le6
        L195:
            r0 = r33
            r24 = r5
            r26 = r6
            r29 = r7
            r31 = r8
            r3 = r20
            r13.setMaxDis2Center(r11)     // Catch: java.lang.Throwable -> L1da
            r13.setMinDis2Center(r14)     // Catch: java.lang.Throwable -> L1da
            r13.setDistrictItemList(r3)     // Catch: java.lang.Throwable -> L1da
            r13.setPointList(r12)     // Catch: java.lang.Throwable -> L1da
            r1 = r35
            r1.add(r13)     // Catch: java.lang.Throwable -> L1da
            goto L1c1
        L1b3:
            r1 = r35
            r19 = r0
            r24 = r5
            r26 = r6
            r29 = r7
            r31 = r8
            r0 = r33
        L1c1:
            int r2 = r17 + 1
            r1 = r36
            r4 = r18
            r0 = r19
            r5 = r24
            r6 = r26
            r7 = r29
            r8 = r31
            r3 = 0
            r11 = 1
            goto L40
        L1d5:
            r0 = r33
            r18 = r4
            return r18
        L1da:
            r1 = 5
            return r1
    }
}
