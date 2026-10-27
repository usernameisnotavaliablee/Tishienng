package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class r4 {
    private static java.lang.String[] a;

    static {
            java.lang.String r4 = "1852"
            java.lang.String r5 = "1853"
            java.lang.String r0 = "010"
            java.lang.String r1 = "021"
            java.lang.String r2 = "022"
            java.lang.String r3 = "023"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            com.amap.api.col.s.r4.a = r0
            return
    }

    public r4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void A(com.amap.api.services.core.PoiItemV2 r0, org.json.JSONObject r1) throws org.json.JSONException {
            java.util.List r1 = q(r1)
            r0.setPhotos(r1)
            return
    }

    public static com.amap.api.services.route.TruckRouteRestult A0(java.lang.String r16) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "toll_distance"
            java.lang.String r1 = "tolls"
            java.lang.String r2 = "duration"
            java.lang.String r3 = "distance"
            java.lang.String r4 = "paths"
            java.lang.String r5 = "data"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L153
            r7 = r16
            r6.<init>(r7)     // Catch: org.json.JSONException -> L153
            boolean r7 = r6.has(r5)     // Catch: org.json.JSONException -> L153
            if (r7 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            com.amap.api.services.route.TruckRouteRestult r7 = new com.amap.api.services.route.TruckRouteRestult     // Catch: org.json.JSONException -> L153
            r7.<init>()     // Catch: org.json.JSONException -> L153
            org.json.JSONObject r5 = r6.optJSONObject(r5)     // Catch: org.json.JSONException -> L153
            java.lang.String r6 = "route"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: org.json.JSONException -> L153
            java.lang.String r6 = "origin"
            com.amap.api.services.core.LatLonPoint r6 = S(r5, r6)     // Catch: org.json.JSONException -> L153
            r7.setStartPos(r6)     // Catch: org.json.JSONException -> L153
            java.lang.String r6 = "destination"
            com.amap.api.services.core.LatLonPoint r6 = S(r5, r6)     // Catch: org.json.JSONException -> L153
            r7.setTargetPos(r6)     // Catch: org.json.JSONException -> L153
            boolean r6 = r5.has(r4)     // Catch: org.json.JSONException -> L153
            if (r6 != 0) goto L43
            goto L49
        L43:
            org.json.JSONArray r4 = r5.optJSONArray(r4)     // Catch: org.json.JSONException -> L153
            if (r4 != 0) goto L4a
        L49:
            return r7
        L4a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> L153
            r5.<init>()     // Catch: org.json.JSONException -> L153
            int r6 = r4.length()     // Catch: org.json.JSONException -> L153
            r9 = 0
        L54:
            if (r9 >= r6) goto L14f
            com.amap.api.services.route.TruckPath r10 = new com.amap.api.services.route.TruckPath     // Catch: org.json.JSONException -> L153
            r10.<init>()     // Catch: org.json.JSONException -> L153
            org.json.JSONObject r11 = r4.getJSONObject(r9)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = v(r11, r3)     // Catch: org.json.JSONException -> L153
            float r12 = N0(r12)     // Catch: org.json.JSONException -> L153
            r10.setDistance(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = v(r11, r2)     // Catch: org.json.JSONException -> L153
            long r12 = R0(r12)     // Catch: org.json.JSONException -> L153
            r10.setDuration(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = "strategy"
            java.lang.String r12 = v(r11, r12)     // Catch: org.json.JSONException -> L153
            r10.setStrategy(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = v(r11, r1)     // Catch: org.json.JSONException -> L153
            float r12 = N0(r12)     // Catch: org.json.JSONException -> L153
            r10.setTolls(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = v(r11, r0)     // Catch: org.json.JSONException -> L153
            float r12 = N0(r12)     // Catch: org.json.JSONException -> L153
            r10.setTollDistance(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = "traffic_lights"
            java.lang.String r12 = v(r11, r12)     // Catch: org.json.JSONException -> L153
            int r12 = L0(r12)     // Catch: org.json.JSONException -> L153
            r10.setTotalTrafficlights(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = "restriction"
            java.lang.String r12 = v(r11, r12)     // Catch: org.json.JSONException -> L153
            int r12 = L0(r12)     // Catch: org.json.JSONException -> L153
            r10.setRestriction(r12)     // Catch: org.json.JSONException -> L153
            java.lang.String r12 = "steps"
            org.json.JSONArray r11 = r11.optJSONArray(r12)     // Catch: org.json.JSONException -> L153
            if (r11 == 0) goto L14b
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: org.json.JSONException -> L153
            r12.<init>()     // Catch: org.json.JSONException -> L153
            r13 = 0
        Lbc:
            int r14 = r11.length()     // Catch: org.json.JSONException -> L153
            if (r13 >= r14) goto L145
            com.amap.api.services.route.TruckStep r14 = new com.amap.api.services.route.TruckStep     // Catch: org.json.JSONException -> L153
            r14.<init>()     // Catch: org.json.JSONException -> L153
            org.json.JSONObject r15 = r11.optJSONObject(r13)     // Catch: org.json.JSONException -> L153
            if (r15 == 0) goto L141
            java.lang.String r8 = "instruction"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setInstruction(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "orientation"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setOrientation(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "road"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setRoad(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = v(r15, r3)     // Catch: org.json.JSONException -> L153
            float r8 = N0(r8)     // Catch: org.json.JSONException -> L153
            r14.setDistance(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = v(r15, r1)     // Catch: org.json.JSONException -> L153
            float r8 = N0(r8)     // Catch: org.json.JSONException -> L153
            r14.setTolls(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = v(r15, r0)     // Catch: org.json.JSONException -> L153
            float r8 = N0(r8)     // Catch: org.json.JSONException -> L153
            r14.setTollDistance(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "toll_road"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setTollRoad(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = v(r15, r2)     // Catch: org.json.JSONException -> L153
            float r8 = N0(r8)     // Catch: org.json.JSONException -> L153
            r14.setDuration(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "polyline"
            java.util.ArrayList r8 = a0(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setPolyline(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "action"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setAction(r8)     // Catch: org.json.JSONException -> L153
            java.lang.String r8 = "assistant_action"
            java.lang.String r8 = v(r15, r8)     // Catch: org.json.JSONException -> L153
            r14.setAssistantAction(r8)     // Catch: org.json.JSONException -> L153
            G(r14, r15)     // Catch: org.json.JSONException -> L153
            Q(r14, r15)     // Catch: org.json.JSONException -> L153
            r12.add(r14)     // Catch: org.json.JSONException -> L153
        L141:
            int r13 = r13 + 1
            goto Lbc
        L145:
            r10.setSteps(r12)     // Catch: org.json.JSONException -> L153
            r5.add(r10)     // Catch: org.json.JSONException -> L153
        L14b:
            int r9 = r9 + 1
            goto L54
        L14f:
            r7.setPaths(r5)     // Catch: org.json.JSONException -> L153
            return r7
        L153:
            r0 = move-exception
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "parseTruckRoute"
            com.amap.api.col.s.j4.i(r0, r1, r2)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            java.lang.String r1 = "协议解析错误 - ProtocolException"
            r0.<init>(r1)
            throw r0
    }

    private static void B(com.amap.api.services.geocoder.RegeocodeAddress r1) {
            java.lang.String r0 = r1.getCity()
            if (r0 == 0) goto L10
            java.lang.String r0 = r1.getCity()
            int r0 = r0.length()
            if (r0 > 0) goto L21
        L10:
            java.lang.String r0 = r1.getCityCode()
            boolean r0 = E0(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = r1.getProvince()
            r1.setCity(r0)
        L21:
            return
    }

    private static com.amap.api.services.busline.BusStationItem B0(org.json.JSONObject r4) throws org.json.JSONException {
            com.amap.api.services.busline.BusStationItem r0 = D0(r4)
            java.lang.String r1 = "adcode"
            java.lang.String r1 = v(r4, r1)
            r0.setAdCode(r1)
            java.lang.String r1 = "citycode"
            java.lang.String r1 = v(r4, r1)
            r0.setCityCode(r1)
            java.lang.String r1 = "buslines"
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r4 != 0) goto L27
            r0.setBusLineItems(r1)
            return r0
        L27:
            r2 = 0
        L28:
            int r3 = r4.length()
            if (r2 >= r3) goto L3e
            org.json.JSONObject r3 = r4.optJSONObject(r2)
            if (r3 == 0) goto L3b
            com.amap.api.services.busline.BusLineItem r3 = F0(r3)
            r1.add(r3)
        L3b:
            int r2 = r2 + 1
            goto L28
        L3e:
            r0.setBusLineItems(r1)
            return r0
    }

    private static void C(com.amap.api.services.route.Cost r1, org.json.JSONObject r2) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "tolls"
            java.lang.String r0 = v(r2, r0)     // Catch: org.json.JSONException -> L3e
            float r0 = N0(r0)     // Catch: org.json.JSONException -> L3e
            r1.setTolls(r0)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "toll_distance"
            java.lang.String r0 = v(r2, r0)     // Catch: org.json.JSONException -> L3e
            float r0 = N0(r0)     // Catch: org.json.JSONException -> L3e
            r1.setTollDistance(r0)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "toll_road"
            java.lang.String r0 = v(r2, r0)     // Catch: org.json.JSONException -> L3e
            r1.setTollRoad(r0)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "duration"
            java.lang.String r0 = v(r2, r0)     // Catch: org.json.JSONException -> L3e
            float r0 = N0(r0)     // Catch: org.json.JSONException -> L3e
            r1.setDuration(r0)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "traffic_lights"
            java.lang.String r2 = v(r2, r0)     // Catch: org.json.JSONException -> L3e
            int r2 = L0(r2)     // Catch: org.json.JSONException -> L3e
            r1.setTrafficLights(r2)     // Catch: org.json.JSONException -> L3e
            return
        L3e:
            r1 = move-exception
            java.lang.String r2 = "JSONHelper"
            java.lang.String r0 = "parseCostDetail"
            com.amap.api.col.s.j4.i(r1, r2, r0)
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException
            java.lang.String r2 = "协议解析错误 - ProtocolException"
            r1.<init>(r2)
            throw r1
    }

    public static com.amap.api.services.route.DriveRoutePlanResult C0(java.lang.String r20) throws com.amap.api.services.core.AMapException {
            java.lang.String r1 = "协议解析错误 - ProtocolException"
            java.lang.String r2 = "JSONHelper"
            java.lang.String r0 = "starttime"
            java.lang.String r3 = "time_infos"
            java.lang.String r4 = "paths"
            java.lang.String r5 = "data"
            java.lang.String r6 = "errcode"
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r8 = r20
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            boolean r8 = r7.has(r6)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r8 == 0) goto L2f
            r7.optInt(r6)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r6 = "errmsg"
            r7.optString(r6)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r6 = "errdetail"
            r7.optString(r6)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto L2f
        L29:
            r0 = move-exception
            goto L22b
        L2c:
            r0 = move-exception
            goto L236
        L2f:
            boolean r6 = r7.has(r5)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r6 != 0) goto L37
            r0 = 0
            return r0
        L37:
            com.amap.api.services.route.DriveRoutePlanResult r6 = new com.amap.api.services.route.DriveRoutePlanResult     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r6.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            org.json.JSONObject r5 = r7.optJSONObject(r5)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r5 != 0) goto L44
            goto L137
        L44:
            boolean r7 = r5.has(r4)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r7 != 0) goto L4c
            goto L137
        L4c:
            org.json.JSONArray r4 = r5.optJSONArray(r4)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r4 != 0) goto L54
            goto L137
        L54:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r7.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r9 = 0
        L5a:
            int r10 = r4.length()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r11 = "polyline"
            java.lang.String r12 = "distance"
            if (r9 >= r10) goto L108
            com.amap.api.services.route.DrivePlanPath r10 = new com.amap.api.services.route.DrivePlanPath     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r10.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            org.json.JSONObject r14 = r4.optJSONObject(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r14 == 0) goto Lfe
            java.lang.String r15 = v(r14, r12)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            float r15 = N0(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r10.setDistance(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r15 = "traffic_lights"
            java.lang.String r15 = v(r14, r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            int r15 = L0(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r10.setTrafficLights(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r15 = "steps"
            org.json.JSONArray r14 = r14.optJSONArray(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r14 == 0) goto Lfe
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r15.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r8 = 0
        L95:
            int r13 = r14.length()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r8 >= r13) goto Lf3
            com.amap.api.services.route.DrivePlanStep r13 = new com.amap.api.services.route.DrivePlanStep     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r16 = r4
            org.json.JSONObject r4 = r14.optJSONObject(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r4 == 0) goto Le7
            r17 = r8
            java.lang.String r8 = "adcode"
            java.lang.String r8 = v(r4, r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13.setAdCode(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r8 = "road"
            java.lang.String r8 = v(r4, r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13.setRoad(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r8 = v(r4, r12)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            float r8 = N0(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13.setDistance(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r8 = "toll"
            java.lang.String r8 = v(r4, r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            int r8 = L0(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r18 = r9
            r9 = 1
            if (r8 != r9) goto Ld8
            r8 = 1
            goto Ld9
        Ld8:
            r8 = 0
        Ld9:
            r13.setToll(r8)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.util.ArrayList r4 = a0(r4, r11)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13.setPolyline(r4)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r15.add(r13)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto Lec
        Le7:
            r17 = r8
            r18 = r9
            r9 = 1
        Lec:
            int r8 = r17 + 1
            r4 = r16
            r9 = r18
            goto L95
        Lf3:
            r16 = r4
            r18 = r9
            r10.setSteps(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r7.add(r10)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto L102
        Lfe:
            r16 = r4
            r18 = r9
        L102:
            int r9 = r18 + 1
            r4 = r16
            goto L5a
        L108:
            r9 = 1
            r6.setPaths(r7)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            boolean r4 = r5.has(r3)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r4 != 0) goto L113
            goto L137
        L113:
            org.json.JSONArray r3 = r5.optJSONArray(r3)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r3 != 0) goto L11a
            goto L137
        L11a:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r5 = 0
        L120:
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r5 >= r7) goto L227
            com.amap.api.services.route.TimeInfo r7 = new com.amap.api.services.route.TimeInfo     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r7.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            org.json.JSONObject r8 = r3.optJSONObject(r5)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r8 == 0) goto L218
            boolean r10 = r8.has(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r10 != 0) goto L138
        L137:
            return r6
        L138:
            java.lang.String r10 = v(r8, r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            long r13 = R0(r10)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r7.setStartTime(r13)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r10 = "elements"
            org.json.JSONArray r8 = r8.optJSONArray(r10)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r8 == 0) goto L218
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r10.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r13 = 0
        L151:
            int r14 = r8.length()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r13 >= r14) goto L20b
            com.amap.api.services.route.TimeInfosElement r14 = new com.amap.api.services.route.TimeInfosElement     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r14.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            org.json.JSONObject r15 = r8.optJSONObject(r13)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r15 == 0) goto L1fd
            java.lang.String r9 = "pathindex"
            java.lang.String r9 = v(r15, r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            int r9 = L0(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r14.setPathindex(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r9 = "duration"
            java.lang.String r9 = v(r15, r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            float r9 = N0(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r14.setDuration(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r9 = "tolls"
            java.lang.String r9 = v(r15, r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            float r9 = N0(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r14.setTolls(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r9 = "restriction"
            java.lang.String r9 = v(r15, r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            int r9 = L0(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r16 = r0
            r0 = 2
            if (r9 == r0) goto L19e
            r0 = -1
            if (r9 != r0) goto L19c
            goto L19e
        L19c:
            r0 = 1
            goto L19f
        L19e:
            r0 = 0
        L19f:
            r14.setRestriction(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r0 = "tmcs"
            org.json.JSONArray r0 = r15.optJSONArray(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r0 == 0) goto L1f8
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r9.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r17 = r3
            r15 = 0
        L1b2:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r15 >= r3) goto L1ef
            com.amap.api.services.route.TMC r3 = new com.amap.api.services.route.TMC     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r18 = r5
            org.json.JSONObject r5 = r0.optJSONObject(r15)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            if (r5 == 0) goto L1e6
            r19 = r0
            java.lang.String r0 = "status"
            java.lang.String r0 = v(r5, r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r3.setStatus(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.lang.String r0 = v(r5, r12)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            int r0 = L0(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r3.setDistance(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            java.util.ArrayList r0 = a0(r5, r11)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r3.setPolyline(r0)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r9.add(r3)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto L1e8
        L1e6:
            r19 = r0
        L1e8:
            int r15 = r15 + 1
            r5 = r18
            r0 = r19
            goto L1b2
        L1ef:
            r18 = r5
            r14.setTMCs(r9)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r10.add(r14)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto L200
        L1f8:
            r17 = r3
            r18 = r5
            goto L200
        L1fd:
            r16 = r0
            goto L1f8
        L200:
            int r13 = r13 + 1
            r0 = r16
            r3 = r17
            r5 = r18
            r9 = 1
            goto L151
        L20b:
            r16 = r0
            r17 = r3
            r18 = r5
            r7.setElements(r10)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            r4.add(r7)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            goto L21e
        L218:
            r16 = r0
            r17 = r3
            r18 = r5
        L21e:
            int r5 = r18 + 1
            r0 = r16
            r3 = r17
            r9 = 1
            goto L120
        L227:
            r6.setTimeInfos(r4)     // Catch: java.lang.Throwable -> L29 org.json.JSONException -> L2c
            return r6
        L22b:
            java.lang.String r3 = "parseDriveRouteThrowable"
            com.amap.api.col.s.j4.i(r0, r2, r3)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            r0.<init>(r1)
            throw r0
        L236:
            java.lang.String r3 = "parseDriveRoute"
            com.amap.api.col.s.j4.i(r0, r2, r3)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            r0.<init>(r1)
            throw r0
    }

    private static void D(com.amap.api.services.route.DriveStep r5, org.json.JSONObject r6) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L49
            r0.<init>()     // Catch: org.json.JSONException -> L49
            java.lang.String r1 = "tmcs"
            org.json.JSONArray r6 = r6.optJSONArray(r1)     // Catch: org.json.JSONException -> L49
            if (r6 != 0) goto Le
            return
        Le:
            r1 = 0
        Lf:
            int r2 = r6.length()     // Catch: org.json.JSONException -> L49
            if (r1 >= r2) goto L45
            com.amap.api.services.route.TMC r2 = new com.amap.api.services.route.TMC     // Catch: org.json.JSONException -> L49
            r2.<init>()     // Catch: org.json.JSONException -> L49
            org.json.JSONObject r3 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L49
            if (r3 == 0) goto L42
            java.lang.String r4 = "distance"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L49
            int r4 = L0(r4)     // Catch: org.json.JSONException -> L49
            r2.setDistance(r4)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "status"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L49
            r2.setStatus(r4)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "polyline"
            java.util.ArrayList r3 = a0(r3, r4)     // Catch: org.json.JSONException -> L49
            r2.setPolyline(r3)     // Catch: org.json.JSONException -> L49
            r0.add(r2)     // Catch: org.json.JSONException -> L49
        L42:
            int r1 = r1 + 1
            goto Lf
        L45:
            r5.setTMCs(r0)     // Catch: org.json.JSONException -> L49
            return
        L49:
            r5 = move-exception
            java.lang.String r6 = "JSONHelper"
            java.lang.String r0 = "parseTMCs"
            com.amap.api.col.s.j4.i(r5, r6, r0)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r6 = "协议解析错误 - ProtocolException"
            r5.<init>(r6)
            throw r5
    }

    private static com.amap.api.services.busline.BusStationItem D0(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.busline.BusStationItem r0 = new com.amap.api.services.busline.BusStationItem
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setBusStationId(r1)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r1 = S(r2, r1)
            r0.setLatLonPoint(r1)
            java.lang.String r1 = "name"
            java.lang.String r2 = v(r2, r1)
            r0.setBusStationName(r2)
            return r0
    }

    private static void E(com.amap.api.services.route.Path r3, java.util.List<com.amap.api.services.route.WalkStep> r4) {
            java.util.List r0 = r3.getPolyline()
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.amap.api.services.route.WalkStep r1 = (com.amap.api.services.route.WalkStep) r1
            if (r1 == 0) goto Lf
            java.util.List r2 = r1.getPolyline()
            if (r2 == 0) goto Lf
            java.util.List r1 = r1.getPolyline()
            r0.addAll(r1)
            goto Lf
        L2b:
            r3.setPolyline(r0)
            return
    }

    private static boolean E0(java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L25
            int r1 = r6.length()
            if (r1 > 0) goto La
            goto L25
        La:
            java.lang.String[] r1 = com.amap.api.col.s.r4.a
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L25
            r4 = r1[r3]
            java.lang.String r5 = r6.trim()
            java.lang.String r4 = r4.trim()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L22
            r6 = 1
            return r6
        L22:
            int r3 = r3 + 1
            goto Le
        L25:
            return r0
    }

    private static void F(com.amap.api.services.route.RouteSearchCity r5, org.json.JSONObject r6) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "districts"
            boolean r1 = r6.has(r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: org.json.JSONException -> L46
            r1.<init>()     // Catch: org.json.JSONException -> L46
            org.json.JSONArray r6 = r6.optJSONArray(r0)     // Catch: org.json.JSONException -> L46
            if (r6 != 0) goto L18
            r5.setDistricts(r1)     // Catch: org.json.JSONException -> L46
            return
        L18:
            r0 = 0
        L19:
            int r2 = r6.length()     // Catch: org.json.JSONException -> L46
            if (r0 >= r2) goto L42
            com.amap.api.services.route.District r2 = new com.amap.api.services.route.District     // Catch: org.json.JSONException -> L46
            r2.<init>()     // Catch: org.json.JSONException -> L46
            org.json.JSONObject r3 = r6.optJSONObject(r0)     // Catch: org.json.JSONException -> L46
            if (r3 == 0) goto L3f
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L46
            r2.setDistrictName(r4)     // Catch: org.json.JSONException -> L46
            java.lang.String r4 = "adcode"
            java.lang.String r3 = v(r3, r4)     // Catch: org.json.JSONException -> L46
            r2.setDistrictAdcode(r3)     // Catch: org.json.JSONException -> L46
            r1.add(r2)     // Catch: org.json.JSONException -> L46
        L3f:
            int r0 = r0 + 1
            goto L19
        L42:
            r5.setDistricts(r1)     // Catch: org.json.JSONException -> L46
            return
        L46:
            r5 = move-exception
            java.lang.String r6 = "JSONHelper"
            java.lang.String r0 = "parseCrossDistricts"
            com.amap.api.col.s.j4.i(r5, r6, r0)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r6 = "协议解析错误 - ProtocolException"
            r5.<init>(r6)
            throw r5
    }

    private static com.amap.api.services.busline.BusLineItem F0(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.busline.BusLineItem r0 = new com.amap.api.services.busline.BusLineItem
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineId(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineType(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineName(r1)
            java.lang.String r1 = "polyline"
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setDirectionsCoordinates(r1)
            java.lang.String r1 = "citycode"
            java.lang.String r1 = v(r2, r1)
            r0.setCityCode(r1)
            java.lang.String r1 = "start_stop"
            java.lang.String r1 = v(r2, r1)
            r0.setOriginatingStation(r1)
            java.lang.String r1 = "end_stop"
            java.lang.String r2 = v(r2, r1)
            r0.setTerminalStation(r2)
            return r0
    }

    private static void G(com.amap.api.services.route.TruckStep r5, org.json.JSONObject r6) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L48
            r0.<init>()     // Catch: org.json.JSONException -> L48
            java.lang.String r1 = "cities"
            org.json.JSONArray r6 = r6.optJSONArray(r1)     // Catch: org.json.JSONException -> L48
            if (r6 != 0) goto Le
            return
        Le:
            r1 = 0
        Lf:
            int r2 = r6.length()     // Catch: org.json.JSONException -> L48
            if (r1 >= r2) goto L44
            com.amap.api.services.route.RouteSearchCity r2 = new com.amap.api.services.route.RouteSearchCity     // Catch: org.json.JSONException -> L48
            r2.<init>()     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r3 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L48
            if (r3 == 0) goto L41
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCityName(r4)     // Catch: org.json.JSONException -> L48
            java.lang.String r4 = "citycode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCitycode(r4)     // Catch: org.json.JSONException -> L48
            java.lang.String r4 = "adcode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCityhAdCode(r4)     // Catch: org.json.JSONException -> L48
            F(r2, r3)     // Catch: org.json.JSONException -> L48
            r0.add(r2)     // Catch: org.json.JSONException -> L48
        L41:
            int r1 = r1 + 1
            goto Lf
        L44:
            r5.setRouteSearchCityList(r0)     // Catch: org.json.JSONException -> L48
            return
        L48:
            r5 = move-exception
            java.lang.String r6 = "JSONHelper"
            java.lang.String r0 = "parseCrossCity"
            com.amap.api.col.s.j4.i(r5, r6, r0)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r6 = "协议解析错误 - ProtocolException"
            r5.<init>(r6)
            throw r5
    }

    private static java.util.ArrayList<com.amap.api.services.core.LatLonPoint> G0(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ";"
            java.lang.String[] r3 = r3.split(r1)
            r1 = 0
        Lc:
            int r2 = r3.length
            if (r1 >= r2) goto L1b
            r2 = r3[r1]
            com.amap.api.services.core.LatLonPoint r2 = I0(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lc
        L1b:
            return r0
    }

    public static void H(org.json.JSONArray r5, com.amap.api.services.geocoder.RegeocodeAddress r6) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L69
            com.amap.api.services.road.Crossroad r2 = new com.amap.api.services.road.Crossroad
            r2.<init>()
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L66
            java.lang.String r4 = "id"
            java.lang.String r4 = v(r3, r4)
            r2.setId(r4)
            java.lang.String r4 = "direction"
            java.lang.String r4 = v(r3, r4)
            r2.setDirection(r4)
            java.lang.String r4 = "distance"
            java.lang.String r4 = v(r3, r4)
            float r4 = N0(r4)
            r2.setDistance(r4)
            java.lang.String r4 = "location"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)
            r2.setCenterPoint(r4)
            java.lang.String r4 = "first_id"
            java.lang.String r4 = v(r3, r4)
            r2.setFirstRoadId(r4)
            java.lang.String r4 = "first_name"
            java.lang.String r4 = v(r3, r4)
            r2.setFirstRoadName(r4)
            java.lang.String r4 = "second_id"
            java.lang.String r4 = v(r3, r4)
            r2.setSecondRoadId(r4)
            java.lang.String r4 = "second_name"
            java.lang.String r3 = v(r3, r4)
            r2.setSecondRoadName(r3)
            r0.add(r2)
        L66:
            int r1 = r1 + 1
            goto L6
        L69:
            r6.setCrossroads(r0)
            return
    }

    private static com.amap.api.services.busline.BusLineItem H0(org.json.JSONObject r4) throws org.json.JSONException {
            com.amap.api.services.busline.BusLineItem r0 = F0(r4)
            java.lang.String r1 = "start_time"
            java.lang.String r1 = v(r4, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setFirstBusTime(r1)
            java.lang.String r1 = "end_time"
            java.lang.String r1 = v(r4, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setLastBusTime(r1)
            java.lang.String r1 = "company"
            java.lang.String r1 = v(r4, r1)
            r0.setBusCompany(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "basic_price"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setBasicPrice(r1)
            java.lang.String r1 = "total_price"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setTotalPrice(r1)
            java.lang.String r1 = "bounds"
            java.util.ArrayList r1 = a0(r4, r1)
            r0.setBounds(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "busstops"
            org.json.JSONArray r4 = r4.optJSONArray(r2)
            if (r4 != 0) goto L68
            r0.setBusStations(r1)
            return r0
        L68:
            r2 = 0
        L69:
            int r3 = r4.length()
            if (r2 >= r3) goto L7f
            org.json.JSONObject r3 = r4.optJSONObject(r2)
            if (r3 == 0) goto L7c
            com.amap.api.services.busline.BusStationItem r3 = D0(r3)
            r1.add(r3)
        L7c:
            int r2 = r2 + 1
            goto L69
        L7f:
            r0.setBusStations(r1)
            return r0
    }

    public static void I(org.json.JSONArray r2, java.util.ArrayList<com.amap.api.services.district.DistrictItem> r3, com.amap.api.services.district.DistrictItem r4) throws org.json.JSONException {
            if (r2 != 0) goto L3
            goto L1f
        L3:
            r0 = 0
        L4:
            int r1 = r2.length()
            if (r0 >= r1) goto L1a
            org.json.JSONObject r1 = r2.optJSONObject(r0)
            if (r1 == 0) goto L17
            com.amap.api.services.district.DistrictItem r1 = J0(r1)
            r3.add(r1)
        L17:
            int r0 = r0 + 1
            goto L4
        L1a:
            if (r4 == 0) goto L1f
            r4.setSubDistrict(r3)
        L1f:
            return
    }

    private static com.amap.api.services.core.LatLonPoint I0(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L33
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = "[]"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L14
            goto L33
        L14:
            java.lang.String r1 = ",| "
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
            r2 = 2
            if (r1 == r2) goto L1f
            return r0
        L1f:
            r0 = 0
            r0 = r4[r0]
            double r0 = java.lang.Double.parseDouble(r0)
            r2 = 1
            r4 = r4[r2]
            double r2 = java.lang.Double.parseDouble(r4)
            com.amap.api.services.core.LatLonPoint r4 = new com.amap.api.services.core.LatLonPoint
            r4.<init>(r2, r0)
            return r4
        L33:
            return r0
    }

    public static void J(org.json.JSONObject r3, com.amap.api.services.geocoder.RegeocodeAddress r4) throws org.json.JSONException {
            java.lang.String r0 = "country"
            java.lang.String r0 = v(r3, r0)
            r4.setCountry(r0)
            java.lang.String r0 = "countrycode"
            java.lang.String r0 = v(r3, r0)
            r4.setCountryCode(r0)
            java.lang.String r0 = "province"
            java.lang.String r0 = v(r3, r0)
            r4.setProvince(r0)
            java.lang.String r0 = "city"
            java.lang.String r0 = v(r3, r0)
            r4.setCity(r0)
            java.lang.String r0 = "citycode"
            java.lang.String r0 = v(r3, r0)
            r4.setCityCode(r0)
            java.lang.String r0 = "adcode"
            java.lang.String r0 = v(r3, r0)
            r4.setAdCode(r0)
            java.lang.String r0 = "district"
            java.lang.String r0 = v(r3, r0)
            r4.setDistrict(r0)
            java.lang.String r0 = "township"
            java.lang.String r0 = v(r3, r0)
            r4.setTownship(r0)
            java.lang.String r0 = "neighborhood"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = v(r0, r1)
            r4.setNeighborhood(r0)
            java.lang.String r0 = "building"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            java.lang.String r0 = v(r0, r1)
            r4.setBuilding(r0)
            com.amap.api.services.geocoder.StreetNumber r0 = new com.amap.api.services.geocoder.StreetNumber
            r0.<init>()
            java.lang.String r1 = "streetNumber"
            org.json.JSONObject r1 = r3.optJSONObject(r1)
            java.lang.String r2 = "street"
            java.lang.String r2 = v(r1, r2)
            r0.setStreet(r2)
            java.lang.String r2 = "number"
            java.lang.String r2 = v(r1, r2)
            r0.setNumber(r2)
            java.lang.String r2 = "location"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)
            r0.setLatLonPoint(r2)
            java.lang.String r2 = "direction"
            java.lang.String r2 = v(r1, r2)
            r0.setDirection(r2)
            java.lang.String r2 = "distance"
            java.lang.String r1 = v(r1, r2)
            float r1 = N0(r1)
            r0.setDistance(r1)
            r4.setStreetNumber(r0)
            java.util.List r0 = M0(r3)
            r4.setBusinessAreas(r0)
            java.lang.String r0 = "towncode"
            java.lang.String r3 = v(r3, r0)
            r4.setTowncode(r3)
            B(r4)
            return
    }

    private static com.amap.api.services.district.DistrictItem J0(org.json.JSONObject r3) throws org.json.JSONException {
            com.amap.api.services.district.DistrictItem r0 = new com.amap.api.services.district.DistrictItem
            r0.<init>()
            java.lang.String r1 = "citycode"
            java.lang.String r1 = v(r3, r1)
            r0.setCitycode(r1)
            java.lang.String r1 = "adcode"
            java.lang.String r1 = v(r3, r1)
            r0.setAdcode(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r3, r1)
            r0.setName(r1)
            java.lang.String r1 = "level"
            java.lang.String r1 = v(r3, r1)
            r0.setLevel(r1)
            java.lang.String r1 = "center"
            com.amap.api.services.core.LatLonPoint r1 = S(r3, r1)
            r0.setCenter(r1)
            java.lang.String r1 = "polyline"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L4f
            java.lang.String r1 = r3.optString(r1)
            if (r1 == 0) goto L4f
            int r2 = r1.length()
            if (r2 <= 0) goto L4f
            java.lang.String r2 = "\\|"
            java.lang.String[] r1 = r1.split(r2)
            r0.setDistrictBoundary(r1)
        L4f:
            java.lang.String r1 = "districts"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            I(r3, r1, r0)
            return r0
    }

    private static int K(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.has(r3)
            if (r1 == 0) goto Lf
            int r2 = r2.optInt(r3)
            return r2
        Lf:
            return r0
    }

    private static boolean K0(java.lang.String r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static com.amap.api.services.route.BusRouteResultV2 L(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "transits"
            java.lang.String r1 = "route"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L67
            r2.<init>(r4)     // Catch: org.json.JSONException -> L67
            boolean r4 = r2.has(r1)     // Catch: org.json.JSONException -> L67
            if (r4 != 0) goto L11
            r4 = 0
            return r4
        L11:
            com.amap.api.services.route.BusRouteResultV2 r4 = new com.amap.api.services.route.BusRouteResultV2     // Catch: org.json.JSONException -> L67
            r4.<init>()     // Catch: org.json.JSONException -> L67
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L67
            if (r1 != 0) goto L1d
            goto L5e
        L1d:
            java.lang.String r2 = "origin"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L67
            r4.setStartPos(r2)     // Catch: org.json.JSONException -> L67
            java.lang.String r2 = "destination"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L67
            r4.setTargetPos(r2)     // Catch: org.json.JSONException -> L67
            java.lang.String r2 = "distance"
            java.lang.String r2 = v(r1, r2)     // Catch: org.json.JSONException -> L67
            float r2 = N0(r2)     // Catch: org.json.JSONException -> L67
            r4.setDistance(r2)     // Catch: org.json.JSONException -> L67
            java.lang.String r2 = "cost"
            org.json.JSONObject r2 = r1.optJSONObject(r2)     // Catch: org.json.JSONException -> L67
            if (r2 == 0) goto L51
            java.lang.String r3 = "taxi_fee"
            java.lang.String r2 = v(r2, r3)     // Catch: org.json.JSONException -> L67
            float r2 = N0(r2)     // Catch: org.json.JSONException -> L67
            r4.setTaxiCost(r2)     // Catch: org.json.JSONException -> L67
        L51:
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L67
            if (r2 != 0) goto L58
            goto L5e
        L58:
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L67
            if (r0 != 0) goto L5f
        L5e:
            return r4
        L5f:
            java.util.List r0 = N(r0)     // Catch: org.json.JSONException -> L67
            r4.setPaths(r0)     // Catch: org.json.JSONException -> L67
            return r4
        L67:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }

    private static int L0(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L21
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = "[]"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L14
            goto L21
        L14:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L19
            return r3
        L19:
            r3 = move-exception
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "str2int"
            com.amap.api.col.s.j4.i(r3, r1, r2)
        L21:
            return r0
    }

    public static java.util.ArrayList<java.lang.String> M(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "keywords"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto Le
            goto L1f
        Le:
            r1 = 0
        Lf:
            int r2 = r3.length()
            if (r1 >= r2) goto L1f
            java.lang.String r2 = r3.optString(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lf
        L1f:
            return r0
    }

    private static java.util.List<com.amap.api.services.geocoder.BusinessArea> M0(org.json.JSONObject r5) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "businessAreas"
            org.json.JSONArray r5 = r5.optJSONArray(r1)
            if (r5 == 0) goto L3e
            int r1 = r5.length()
            if (r1 != 0) goto L14
            goto L3e
        L14:
            r1 = 0
        L15:
            int r2 = r5.length()
            if (r1 >= r2) goto L3e
            com.amap.api.services.geocoder.BusinessArea r2 = new com.amap.api.services.geocoder.BusinessArea
            r2.<init>()
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L3b
            java.lang.String r4 = "location"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)
            r2.setCenterPoint(r4)
            java.lang.String r4 = "name"
            java.lang.String r3 = v(r3, r4)
            r2.setName(r3)
            r0.add(r2)
        L3b:
            int r1 = r1 + 1
            goto L15
        L3e:
            return r0
    }

    private static java.util.List<com.amap.api.services.route.BusPathV2> N(org.json.JSONArray r11) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r11 != 0) goto L9
            goto Lcb
        L9:
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r11.length()
            if (r2 >= r3) goto Lcb
            com.amap.api.services.route.BusPathV2 r3 = new com.amap.api.services.route.BusPathV2
            r3.<init>()
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            if (r4 == 0) goto Lc7
            java.lang.String r5 = "cost"
            org.json.JSONObject r5 = r4.optJSONObject(r5)
            if (r5 == 0) goto L3e
            java.lang.String r6 = "duration"
            java.lang.String r6 = v(r5, r6)
            long r6 = R0(r6)
            r3.setDuration(r6)
            java.lang.String r6 = "transit_fee"
            java.lang.String r5 = v(r5, r6)
            float r5 = N0(r5)
            r3.setCost(r5)
        L3e:
            java.lang.String r5 = "distance"
            java.lang.String r5 = v(r4, r5)
            float r5 = N0(r5)
            r3.setDistance(r5)
            java.lang.String r5 = "nightflag"
            java.lang.String r5 = v(r4, r5)
            boolean r5 = U0(r5)
            r3.setNightBus(r5)
            java.lang.String r5 = "walking_distance"
            java.lang.String r5 = v(r4, r5)
            float r5 = N0(r5)
            r3.setWalkDistance(r5)
            java.lang.String r5 = "segments"
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            if (r4 == 0) goto Lc7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
            r8 = 0
        L75:
            int r9 = r4.length()
            if (r8 >= r9) goto Lbb
            org.json.JSONObject r9 = r4.optJSONObject(r8)
            if (r9 == 0) goto Lb8
            com.amap.api.services.route.BusStepV2 r9 = Q0(r9)
            if (r9 == 0) goto Lb8
            r5.add(r9)
            com.amap.api.services.route.RouteBusWalkItem r10 = r9.getWalk()
            if (r10 == 0) goto L99
            com.amap.api.services.route.RouteBusWalkItem r10 = r9.getWalk()
            float r10 = r10.getDistance()
            float r7 = r7 + r10
        L99:
            java.util.List r10 = r9.getBusLines()
            if (r10 == 0) goto Lb8
            java.util.List r10 = r9.getBusLines()
            int r10 = r10.size()
            if (r10 <= 0) goto Lb8
            java.util.List r9 = r9.getBusLines()
            java.lang.Object r9 = r9.get(r1)
            com.amap.api.services.route.RouteBusLineItem r9 = (com.amap.api.services.route.RouteBusLineItem) r9
            float r9 = r9.getDistance()
            float r6 = r6 + r9
        Lb8:
            int r8 = r8 + 1
            goto L75
        Lbb:
            r3.setSteps(r5)
            r3.setBusDistance(r6)
            r3.setWalkDistance(r7)
            r0.add(r3)
        Lc7:
            int r2 = r2 + 1
            goto Lb
        Lcb:
            return r0
    }

    private static float N0(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L21
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L21
            java.lang.String r1 = "[]"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L14
            goto L21
        L14:
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L19
            return r3
        L19:
            r3 = move-exception
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "str2float"
            com.amap.api.col.s.j4.i(r3, r1, r2)
        L21:
            return r0
    }

    private static void O(com.amap.api.services.route.DriveStep r5, org.json.JSONObject r6) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L48
            r0.<init>()     // Catch: org.json.JSONException -> L48
            java.lang.String r1 = "cities"
            org.json.JSONArray r6 = r6.optJSONArray(r1)     // Catch: org.json.JSONException -> L48
            if (r6 != 0) goto Le
            return
        Le:
            r1 = 0
        Lf:
            int r2 = r6.length()     // Catch: org.json.JSONException -> L48
            if (r1 >= r2) goto L44
            com.amap.api.services.route.RouteSearchCity r2 = new com.amap.api.services.route.RouteSearchCity     // Catch: org.json.JSONException -> L48
            r2.<init>()     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r3 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L48
            if (r3 == 0) goto L41
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCityName(r4)     // Catch: org.json.JSONException -> L48
            java.lang.String r4 = "citycode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCitycode(r4)     // Catch: org.json.JSONException -> L48
            java.lang.String r4 = "adcode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L48
            r2.setSearchCityhAdCode(r4)     // Catch: org.json.JSONException -> L48
            F(r2, r3)     // Catch: org.json.JSONException -> L48
            r0.add(r2)     // Catch: org.json.JSONException -> L48
        L41:
            int r1 = r1 + 1
            goto Lf
        L44:
            r5.setRouteSearchCityList(r0)     // Catch: org.json.JSONException -> L48
            return
        L48:
            r5 = move-exception
            java.lang.String r6 = "JSONHelper"
            java.lang.String r0 = "parseCrossCity"
            com.amap.api.col.s.j4.i(r5, r6, r0)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r6 = "协议解析错误 - ProtocolException"
            r5.<init>(r6)
            throw r5
    }

    private static com.amap.api.services.route.BusStep O0(org.json.JSONObject r3) throws org.json.JSONException {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.amap.api.services.route.BusStep r1 = new com.amap.api.services.route.BusStep
            r1.<init>()
            java.lang.String r2 = "walking"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L18
            com.amap.api.services.route.RouteBusWalkItem r2 = S0(r2)
            r1.setWalk(r2)
        L18:
            java.lang.String r2 = "bus"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L27
            java.util.List r2 = V0(r2)
            r1.setBusLines(r2)
        L27:
            java.lang.String r2 = "entrance"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L36
            com.amap.api.services.route.Doorway r2 = X0(r2)
            r1.setEntrance(r2)
        L36:
            java.lang.String r2 = "exit"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L45
            com.amap.api.services.route.Doorway r2 = X0(r2)
            r1.setExit(r2)
        L45:
            java.lang.String r2 = "railway"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L54
            com.amap.api.services.route.RouteRailwayItem r2 = g(r2)
            r1.setRailway(r2)
        L54:
            java.lang.String r2 = "taxi"
            org.json.JSONObject r3 = r3.optJSONObject(r2)
            if (r3 == 0) goto L63
            com.amap.api.services.route.TaxiItem r3 = m(r3)
            r1.setTaxi(r3)
        L63:
            com.amap.api.services.route.RouteBusWalkItem r3 = r1.getWalk()
            if (r3 == 0) goto L77
            com.amap.api.services.route.RouteBusWalkItem r3 = r1.getWalk()
            java.util.List r3 = r3.getSteps()
            int r3 = r3.size()
            if (r3 != 0) goto L8e
        L77:
            java.util.List r3 = r1.getBusLines()
            int r3 = r3.size()
            if (r3 != 0) goto L8e
            com.amap.api.services.route.RouteRailwayItem r3 = r1.getRailway()
            if (r3 != 0) goto L8e
            com.amap.api.services.route.TaxiItem r3 = r1.getTaxi()
            if (r3 != 0) goto L8e
            return r0
        L8e:
            return r1
    }

    private static void P(com.amap.api.services.route.Path r3, java.util.List<com.amap.api.services.route.DriveStep> r4) {
            java.util.List r0 = r3.getPolyline()
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.amap.api.services.route.DriveStep r1 = (com.amap.api.services.route.DriveStep) r1
            if (r1 == 0) goto Lf
            java.util.List r2 = r1.getPolyline()
            if (r2 == 0) goto Lf
            java.util.List r1 = r1.getPolyline()
            r0.addAll(r1)
            goto Lf
        L2b:
            r3.setPolyline(r0)
            return
    }

    private static double P0(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L22
            java.lang.String r2 = ""
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L22
            java.lang.String r2 = "[]"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L15
            goto L22
        L15:
            double r0 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> L1a
            return r0
        L1a:
            r4 = move-exception
            java.lang.String r2 = "JSONHelper"
            java.lang.String r3 = "str2float"
            com.amap.api.col.s.j4.i(r4, r2, r3)
        L22:
            return r0
    }

    private static void Q(com.amap.api.services.route.TruckStep r5, org.json.JSONObject r6) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L49
            r0.<init>()     // Catch: org.json.JSONException -> L49
            java.lang.String r1 = "tmcs"
            org.json.JSONArray r6 = r6.optJSONArray(r1)     // Catch: org.json.JSONException -> L49
            if (r6 != 0) goto Le
            return
        Le:
            r1 = 0
        Lf:
            int r2 = r6.length()     // Catch: org.json.JSONException -> L49
            if (r1 >= r2) goto L45
            com.amap.api.services.route.TMC r2 = new com.amap.api.services.route.TMC     // Catch: org.json.JSONException -> L49
            r2.<init>()     // Catch: org.json.JSONException -> L49
            org.json.JSONObject r3 = r6.optJSONObject(r1)     // Catch: org.json.JSONException -> L49
            if (r3 == 0) goto L42
            java.lang.String r4 = "distance"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L49
            int r4 = L0(r4)     // Catch: org.json.JSONException -> L49
            r2.setDistance(r4)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "status"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L49
            r2.setStatus(r4)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "polyline"
            java.util.ArrayList r3 = a0(r3, r4)     // Catch: org.json.JSONException -> L49
            r2.setPolyline(r3)     // Catch: org.json.JSONException -> L49
            r0.add(r2)     // Catch: org.json.JSONException -> L49
        L42:
            int r1 = r1 + 1
            goto Lf
        L45:
            r5.setTMCs(r0)     // Catch: org.json.JSONException -> L49
            return
        L49:
            r5 = move-exception
            java.lang.String r6 = "JSONHelper"
            java.lang.String r0 = "parseTMCs"
            com.amap.api.col.s.j4.i(r5, r6, r0)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r6 = "协议解析错误 - ProtocolException"
            r5.<init>(r6)
            throw r5
    }

    private static com.amap.api.services.route.BusStepV2 Q0(org.json.JSONObject r3) throws org.json.JSONException {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.amap.api.services.route.BusStepV2 r1 = new com.amap.api.services.route.BusStepV2
            r1.<init>()
            java.lang.String r2 = "walking"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L18
            com.amap.api.services.route.RouteBusWalkItem r2 = T0(r2)
            r1.setWalk(r2)
        L18:
            java.lang.String r2 = "bus"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L27
            java.util.List r2 = W0(r2)
            r1.setBusLines(r2)
        L27:
            java.lang.String r2 = "entrance"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L36
            com.amap.api.services.route.Doorway r2 = X0(r2)
            r1.setEntrance(r2)
        L36:
            java.lang.String r2 = "exit"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L45
            com.amap.api.services.route.Doorway r2 = X0(r2)
            r1.setExit(r2)
        L45:
            java.lang.String r2 = "railway"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L54
            com.amap.api.services.route.RouteRailwayItem r2 = g(r2)
            r1.setRailway(r2)
        L54:
            java.lang.String r2 = "taxi"
            org.json.JSONObject r3 = r3.optJSONObject(r2)
            if (r3 == 0) goto L63
            com.amap.api.services.route.TaxiItemV2 r3 = n(r3)
            r1.setTaxi(r3)
        L63:
            com.amap.api.services.route.RouteBusWalkItem r3 = r1.getWalk()
            if (r3 == 0) goto L77
            com.amap.api.services.route.RouteBusWalkItem r3 = r1.getWalk()
            java.util.List r3 = r3.getSteps()
            int r3 = r3.size()
            if (r3 != 0) goto L8e
        L77:
            java.util.List r3 = r1.getBusLines()
            int r3 = r3.size()
            if (r3 != 0) goto L8e
            com.amap.api.services.route.RouteRailwayItem r3 = r1.getRailway()
            if (r3 != 0) goto L8e
            com.amap.api.services.route.TaxiItemV2 r3 = r1.getTaxi()
            if (r3 != 0) goto L8e
            return r0
        L8e:
            return r1
    }

    public static void R(org.json.JSONArray r5, com.amap.api.services.geocoder.RegeocodeAddress r6) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L4e
            com.amap.api.services.geocoder.RegeocodeRoad r2 = new com.amap.api.services.geocoder.RegeocodeRoad
            r2.<init>()
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L4b
            java.lang.String r4 = "id"
            java.lang.String r4 = v(r3, r4)
            r2.setId(r4)
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)
            r2.setName(r4)
            java.lang.String r4 = "location"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)
            r2.setLatLngPoint(r4)
            java.lang.String r4 = "direction"
            java.lang.String r4 = v(r3, r4)
            r2.setDirection(r4)
            java.lang.String r4 = "distance"
            java.lang.String r3 = v(r3, r4)
            float r3 = N0(r3)
            r2.setDistance(r3)
            r0.add(r2)
        L4b:
            int r1 = r1 + 1
            goto L6
        L4e:
            r6.setRoads(r0)
            return
    }

    private static long R0(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L22
            java.lang.String r2 = ""
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L22
            java.lang.String r2 = "[]"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L15
            goto L22
        L15:
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L1a
            return r0
        L1a:
            r4 = move-exception
            java.lang.String r2 = "JSONHelper"
            java.lang.String r3 = "str2long"
            com.amap.api.col.s.j4.i(r4, r2, r3)
        L22:
            return r0
    }

    private static com.amap.api.services.core.LatLonPoint S(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.has(r3)
            if (r1 == 0) goto L13
            java.lang.String r2 = r2.optString(r3)
            com.amap.api.services.core.LatLonPoint r2 = I0(r2)
            return r2
        L13:
            return r0
    }

    private static com.amap.api.services.route.RouteBusWalkItem S0(org.json.JSONObject r4) throws org.json.JSONException {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.amap.api.services.route.RouteBusWalkItem r0 = new com.amap.api.services.route.RouteBusWalkItem
            r0.<init>()
            java.lang.String r1 = "origin"
            com.amap.api.services.core.LatLonPoint r1 = S(r4, r1)
            r0.setOrigin(r1)
            java.lang.String r1 = "destination"
            com.amap.api.services.core.LatLonPoint r1 = S(r4, r1)
            r0.setDestination(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r4, r1)
            long r1 = R0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "steps"
            boolean r2 = r4.has(r1)
            if (r2 != 0) goto L3e
            goto L44
        L3e:
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            if (r4 != 0) goto L45
        L44:
            return r0
        L45:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L4b:
            int r3 = r4.length()
            if (r2 >= r3) goto L61
            org.json.JSONObject r3 = r4.optJSONObject(r2)
            if (r3 == 0) goto L5e
            com.amap.api.services.route.WalkStep r3 = a(r3)
            r1.add(r3)
        L5e:
            int r2 = r2 + 1
            goto L4b
        L61:
            r0.setSteps(r1)
            E(r0, r1)
            return r0
    }

    public static com.amap.api.services.route.DriveRouteResult T(java.lang.String r17) throws com.amap.api.services.core.AMapException {
            java.lang.String r1 = "协议解析错误 - ProtocolException"
            java.lang.String r2 = "JSONHelper"
            java.lang.String r0 = "toll_distance"
            java.lang.String r3 = "tolls"
            java.lang.String r4 = "duration"
            java.lang.String r5 = "distance"
            java.lang.String r6 = "paths"
            java.lang.String r7 = "route"
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r9 = r17
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            boolean r9 = r8.has(r7)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r9 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            com.amap.api.services.route.DriveRouteResult r9 = new com.amap.api.services.route.DriveRouteResult     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r9.<init>()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            org.json.JSONObject r7 = r8.optJSONObject(r7)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r7 != 0) goto L2b
            goto L57
        L2b:
            java.lang.String r8 = "origin"
            com.amap.api.services.core.LatLonPoint r8 = S(r7, r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r9.setStartPos(r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r8 = "destination"
            com.amap.api.services.core.LatLonPoint r8 = S(r7, r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r9.setTargetPos(r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r8 = "taxi_cost"
            java.lang.String r8 = v(r7, r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r8 = N0(r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r9.setTaxiCost(r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            boolean r8 = r7.has(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r8 != 0) goto L51
            goto L57
        L51:
            org.json.JSONArray r6 = r7.optJSONArray(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r6 != 0) goto L58
        L57:
            return r9
        L58:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r7.<init>()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r10 = 0
        L5e:
            int r11 = r6.length()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r10 >= r11) goto L174
            com.amap.api.services.route.DrivePath r11 = new com.amap.api.services.route.DrivePath     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.<init>()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            org.json.JSONObject r12 = r6.optJSONObject(r10)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r12 == 0) goto L16c
            java.lang.String r13 = v(r12, r5)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r13 = N0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setDistance(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = v(r12, r4)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            long r13 = R0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setDuration(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = "strategy"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setStrategy(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = v(r12, r3)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r13 = N0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setTolls(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = v(r12, r0)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r13 = N0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setTollDistance(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = "traffic_lights"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            int r13 = L0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setTotalTrafficlights(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = "restriction"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            int r13 = L0(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r11.setRestriction(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r13 = "steps"
            org.json.JSONArray r12 = r12.optJSONArray(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r12 == 0) goto L16c
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r13.<init>()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r14 = 0
        Lcc:
            int r15 = r12.length()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r14 >= r15) goto L160
            com.amap.api.services.route.DriveStep r15 = new com.amap.api.services.route.DriveStep     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.<init>()     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            org.json.JSONObject r8 = r12.optJSONObject(r14)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            if (r8 == 0) goto L158
            r16 = r6
            java.lang.String r6 = "instruction"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setInstruction(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "orientation"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setOrientation(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "road"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setRoad(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = v(r8, r5)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r6 = N0(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setDistance(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = v(r8, r3)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r6 = N0(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setTolls(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = v(r8, r0)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r6 = N0(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setTollDistance(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "toll_road"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setTollRoad(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = v(r8, r4)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            float r6 = N0(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setDuration(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "polyline"
            java.util.ArrayList r6 = a0(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setPolyline(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "action"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setAction(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            java.lang.String r6 = "assistant_action"
            java.lang.String r6 = v(r8, r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r15.setAssistantAction(r6)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            O(r15, r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            D(r15, r8)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r13.add(r15)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            goto L15a
        L154:
            r0 = move-exception
            goto L178
        L156:
            r0 = move-exception
            goto L183
        L158:
            r16 = r6
        L15a:
            int r14 = r14 + 1
            r6 = r16
            goto Lcc
        L160:
            r16 = r6
            r11.setSteps(r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            P(r11, r13)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            r7.add(r11)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            goto L16e
        L16c:
            r16 = r6
        L16e:
            int r10 = r10 + 1
            r6 = r16
            goto L5e
        L174:
            r9.setPaths(r7)     // Catch: java.lang.Throwable -> L154 org.json.JSONException -> L156
            return r9
        L178:
            java.lang.String r3 = "parseDriveRouteThrowable"
            com.amap.api.col.s.j4.i(r0, r2, r3)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            r0.<init>(r1)
            throw r0
        L183:
            java.lang.String r3 = "parseDriveRoute"
            com.amap.api.col.s.j4.i(r0, r2, r3)
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            r0.<init>(r1)
            throw r0
    }

    private static com.amap.api.services.route.RouteBusWalkItem T0(org.json.JSONObject r4) throws org.json.JSONException {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.amap.api.services.route.RouteBusWalkItem r0 = new com.amap.api.services.route.RouteBusWalkItem
            r0.<init>()
            java.lang.String r1 = "origin"
            com.amap.api.services.core.LatLonPoint r1 = S(r4, r1)
            r0.setOrigin(r1)
            java.lang.String r1 = "destination"
            com.amap.api.services.core.LatLonPoint r1 = S(r4, r1)
            r0.setDestination(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "cost"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L3d
            java.lang.String r2 = "duration"
            java.lang.String r1 = v(r1, r2)
            long r1 = R0(r1)
            r0.setDuration(r1)
        L3d:
            java.lang.String r1 = "steps"
            boolean r2 = r4.has(r1)
            if (r2 != 0) goto L46
            goto L4c
        L46:
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            if (r4 != 0) goto L4d
        L4c:
            return r0
        L4d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L53:
            int r3 = r4.length()
            if (r2 >= r3) goto L69
            org.json.JSONObject r3 = r4.optJSONObject(r2)
            if (r3 == 0) goto L66
            com.amap.api.services.route.WalkStep r3 = b(r3)
            r1.add(r3)
        L66:
            int r2 = r2 + 1
            goto L53
        L69:
            r0.setSteps(r1)
            E(r0, r1)
            return r0
    }

    public static java.util.ArrayList<com.amap.api.services.core.PoiItem> U(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L2e
        L8:
            java.lang.String r1 = "pois"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 == 0) goto L2e
            int r1 = r3.length()
            if (r1 != 0) goto L17
            goto L2e
        L17:
            r1 = 0
        L18:
            int r2 = r3.length()
            if (r1 >= r2) goto L2e
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L2b
            com.amap.api.services.core.PoiItem r2 = d0(r2)
            r0.add(r2)
        L2b:
            int r1 = r1 + 1
            goto L18
        L2e:
            return r0
    }

    private static boolean U0(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L26
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L26
            java.lang.String r1 = "[]"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L26
            java.lang.String r1 = "0"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1c
            goto L26
        L1c:
            java.lang.String r1 = "1"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            return r0
    }

    private static java.util.List<com.amap.api.services.route.ChargeStationInfo> V(org.json.JSONArray r5) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> L89
            r0.<init>()     // Catch: org.json.JSONException -> L89
            r1 = 0
        L6:
            int r2 = r5.length()     // Catch: org.json.JSONException -> L89
            if (r1 >= r2) goto L88
            org.json.JSONObject r2 = r5.getJSONObject(r1)     // Catch: org.json.JSONException -> L89
            com.amap.api.services.route.ChargeStationInfo r3 = new com.amap.api.services.route.ChargeStationInfo     // Catch: org.json.JSONException -> L89
            r3.<init>()     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setName(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "poiid"
            java.lang.String r4 = v(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setPoiId(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "brand_name"
            java.lang.String r4 = v(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setBrandName(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "show_point"
            com.amap.api.services.core.LatLonPoint r4 = S(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setShowPoint(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "projective_point"
            com.amap.api.services.core.LatLonPoint r4 = S(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setProjectivePoint(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "max_power"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setMaxPower(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "charge_percent"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setChargePercent(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "charge_time"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setChargeTime(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "remaining_capacity"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setRemainingCapacity(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "voltage"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setVoltage(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "amperage"
            int r4 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setAmperage(r4)     // Catch: org.json.JSONException -> L89
            java.lang.String r4 = "step_index"
            int r2 = K(r2, r4)     // Catch: org.json.JSONException -> L89
            r3.setStepIndex(r2)     // Catch: org.json.JSONException -> L89
            r0.add(r3)     // Catch: org.json.JSONException -> L89
            int r1 = r1 + 1
            goto L6
        L88:
            return r0
        L89:
            r5 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseChargeStationInfo"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r5.<init>(r0)
            throw r5
    }

    private static java.util.List<com.amap.api.services.route.RouteBusLineItem> V0(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L28
        L8:
            java.lang.String r1 = "buslines"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto L11
            goto L28
        L11:
            r1 = 0
        L12:
            int r2 = r3.length()
            if (r1 >= r2) goto L28
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L25
            com.amap.api.services.route.RouteBusLineItem r2 = c(r2)
            r0.add(r2)
        L25:
            int r1 = r1 + 1
            goto L12
        L28:
            return r0
    }

    private static void W(com.amap.api.services.route.Path r3, java.util.List<com.amap.api.services.route.DriveStepV2> r4) {
            java.util.List r0 = r3.getPolyline()
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.amap.api.services.route.DriveStepV2 r1 = (com.amap.api.services.route.DriveStepV2) r1
            if (r1 == 0) goto Lf
            java.util.List r2 = r1.getPolyline()
            if (r2 == 0) goto Lf
            java.util.List r1 = r1.getPolyline()
            r0.addAll(r1)
            goto Lf
        L2b:
            r3.setPolyline(r0)
            return
    }

    private static java.util.List<com.amap.api.services.route.RouteBusLineItem> W0(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L28
        L8:
            java.lang.String r1 = "buslines"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto L11
            goto L28
        L11:
            r1 = 0
        L12:
            int r2 = r3.length()
            if (r1 >= r2) goto L28
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L25
            com.amap.api.services.route.RouteBusLineItem r2 = d(r2)
            r0.add(r2)
        L25:
            int r1 = r1 + 1
            goto L12
        L28:
            return r0
    }

    public static void X(org.json.JSONArray r5, com.amap.api.services.geocoder.RegeocodeAddress r6) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()
            if (r1 >= r2) goto L52
            com.amap.api.services.geocoder.AoiItem r2 = new com.amap.api.services.geocoder.AoiItem
            r2.<init>()
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L4f
            java.lang.String r4 = "id"
            java.lang.String r4 = v(r3, r4)
            r2.setId(r4)
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)
            r2.setName(r4)
            java.lang.String r4 = "adcode"
            java.lang.String r4 = v(r3, r4)
            r2.setAdcode(r4)
            java.lang.String r4 = "location"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)
            r2.setLocation(r4)
            java.lang.String r4 = "area"
            java.lang.String r3 = v(r3, r4)
            float r3 = N0(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.setArea(r3)
            r0.add(r2)
        L4f:
            int r1 = r1 + 1
            goto L6
        L52:
            r6.setAois(r0)
            return
    }

    private static com.amap.api.services.route.Doorway X0(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.route.Doorway r0 = new com.amap.api.services.route.Doorway
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setName(r1)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r2 = S(r2, r1)
            r0.setLatLonPoint(r2)
            return r0
    }

    public static com.amap.api.services.route.DriveRouteResultV2 Y(java.lang.String r15) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "cost"
            java.lang.String r3 = "paths"
            java.lang.String r4 = "route"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            boolean r15 = r5.has(r4)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r15 != 0) goto L17
            r15 = 0
            return r15
        L17:
            com.amap.api.services.route.DriveRouteResultV2 r15 = new com.amap.api.services.route.DriveRouteResultV2     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r15.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            org.json.JSONObject r4 = r5.optJSONObject(r4)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r4 != 0) goto L23
            goto L4f
        L23:
            java.lang.String r5 = "origin"
            com.amap.api.services.core.LatLonPoint r5 = S(r4, r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r15.setStartPos(r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r5 = "destination"
            com.amap.api.services.core.LatLonPoint r5 = S(r4, r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r15.setTargetPos(r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r5 = "taxi_cost"
            java.lang.String r5 = v(r4, r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            float r5 = N0(r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r15.setTaxiCost(r5)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            boolean r5 = r4.has(r3)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r5 != 0) goto L49
            goto L4f
        L49:
            org.json.JSONArray r3 = r4.optJSONArray(r3)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r3 != 0) goto L50
        L4f:
            return r15
        L50:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r5 = 0
            r6 = 0
        L57:
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r6 >= r7) goto L163
            com.amap.api.services.route.DrivePathV2 r7 = new com.amap.api.services.route.DrivePathV2     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            org.json.JSONObject r8 = r3.optJSONObject(r6)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r8 == 0) goto L15f
            java.lang.String r9 = "distance"
            java.lang.String r9 = v(r8, r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            float r9 = N0(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setDistance(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r9 = "strategy"
            java.lang.String r9 = v(r8, r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setStrategy(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r9 = "restriction"
            java.lang.String r9 = v(r8, r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            int r9 = L0(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setRestriction(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            org.json.JSONObject r9 = r8.optJSONObject(r2)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r9 == 0) goto La3
            com.amap.api.services.route.Cost r10 = new com.amap.api.services.route.Cost     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r10.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            C(r10, r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setCost(r10)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            goto La3
        L9d:
            r15 = move-exception
            goto L167
        La0:
            r15 = move-exception
            goto L172
        La3:
            java.lang.String r9 = "elec_consume_info"
            org.json.JSONObject r9 = r8.optJSONObject(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r9 == 0) goto Lb2
            com.amap.api.services.route.ElecConsumeInfo r9 = o(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setElecConsumeInfo(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        Lb2:
            java.lang.String r9 = "charge_station_info"
            org.json.JSONArray r9 = r8.optJSONArray(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r9 == 0) goto Lc1
            java.util.List r9 = V(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r7.setChargeStationInfo(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        Lc1:
            java.lang.String r9 = "steps"
            org.json.JSONArray r8 = r8.optJSONArray(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r8 == 0) goto L15f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r9.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r10 = 0
        Lcf:
            int r11 = r8.length()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r10 >= r11) goto L156
            com.amap.api.services.route.DriveStepV2 r11 = new com.amap.api.services.route.DriveStepV2     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            org.json.JSONObject r12 = r8.optJSONObject(r10)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r12 == 0) goto L152
            java.lang.String r13 = "instruction"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setInstruction(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r13 = "orientation"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setOrientation(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r13 = "step_distance"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            int r13 = L0(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setStepDistance(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r13 = "road_name"
            java.lang.String r13 = v(r12, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setRoad(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            java.lang.String r13 = "polyline"
            java.util.ArrayList r13 = a0(r12, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setPolyline(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            org.json.JSONObject r13 = r12.optJSONObject(r2)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r13 == 0) goto L122
            com.amap.api.services.route.Cost r14 = new com.amap.api.services.route.Cost     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r14.<init>()     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            C(r14, r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setCostDetail(r14)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L122:
            java.lang.String r13 = "navi"
            org.json.JSONObject r13 = r12.optJSONObject(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r13 == 0) goto L131
            com.amap.api.services.route.Navi r13 = p(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setNavi(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L131:
            java.lang.String r13 = "cities"
            org.json.JSONArray r13 = r12.optJSONArray(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r13 == 0) goto L140
            java.util.List r13 = g0(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setRouteSearchCityList(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L140:
            java.lang.String r13 = "tmcs"
            org.json.JSONArray r12 = r12.optJSONArray(r13)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            if (r12 == 0) goto L14f
            java.util.List r12 = b0(r12)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r11.setTMCs(r12)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L14f:
            r9.add(r11)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L152:
            int r10 = r10 + 1
            goto Lcf
        L156:
            r7.setSteps(r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            W(r7, r9)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            r4.add(r7)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
        L15f:
            int r6 = r6 + 1
            goto L57
        L163:
            r15.setPaths(r4)     // Catch: java.lang.Throwable -> L9d org.json.JSONException -> La0
            return r15
        L167:
            java.lang.String r2 = "parseDriveRouteThrowable"
            com.amap.api.col.s.j4.i(r15, r1, r2)
            com.amap.api.services.core.AMapException r15 = new com.amap.api.services.core.AMapException
            r15.<init>(r0)
            throw r15
        L172:
            java.lang.String r2 = "parseDriveRoute"
            com.amap.api.col.s.j4.i(r15, r1, r2)
            com.amap.api.services.core.AMapException r15 = new com.amap.api.services.core.AMapException
            r15.<init>(r0)
            throw r15
    }

    public static java.util.ArrayList<com.amap.api.services.core.PoiItemV2> Z(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "pois"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 == 0) goto L2b
            int r1 = r3.length()
            if (r1 != 0) goto L14
            goto L2b
        L14:
            r1 = 0
        L15:
            int r2 = r3.length()
            if (r1 >= r2) goto L2b
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L28
            com.amap.api.services.core.PoiItemV2 r2 = h0(r2)
            r0.add(r2)
        L28:
            int r1 = r1 + 1
            goto L15
        L2b:
            return r0
    }

    private static com.amap.api.services.route.WalkStep a(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.route.WalkStep r0 = new com.amap.api.services.route.WalkStep
            r0.<init>()
            java.lang.String r1 = "instruction"
            java.lang.String r1 = v(r2, r1)
            r0.setInstruction(r1)
            java.lang.String r1 = "orientation"
            java.lang.String r1 = v(r2, r1)
            r0.setOrientation(r1)
            java.lang.String r1 = "road"
            java.lang.String r1 = v(r2, r1)
            r0.setRoad(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "polyline"
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setPolyline(r1)
            java.lang.String r1 = "action"
            java.lang.String r1 = v(r2, r1)
            r0.setAction(r1)
            java.lang.String r1 = "assistant_action"
            java.lang.String r2 = v(r2, r1)
            r0.setAssistantAction(r2)
            return r0
    }

    private static java.util.ArrayList<com.amap.api.services.core.LatLonPoint> a0(org.json.JSONObject r1, java.lang.String r2) throws org.json.JSONException {
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto Lf
            java.lang.String r1 = r1.optString(r2)
            java.util.ArrayList r1 = G0(r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private static com.amap.api.services.route.WalkStep b(org.json.JSONObject r3) throws org.json.JSONException {
            com.amap.api.services.route.WalkStep r0 = new com.amap.api.services.route.WalkStep
            r0.<init>()
            java.lang.String r1 = "instruction"
            java.lang.String r1 = v(r3, r1)
            r0.setInstruction(r1)
            java.lang.String r1 = "orientation"
            java.lang.String r1 = v(r3, r1)
            r0.setOrientation(r1)
            java.lang.String r1 = "road"
            java.lang.String r1 = v(r3, r1)
            r0.setRoad(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r3, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r3, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "polyline"
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L49
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setPolyline(r1)
        L49:
            java.lang.String r1 = "navi"
            org.json.JSONObject r3 = r3.optJSONObject(r1)
            if (r3 == 0) goto L70
            java.lang.String r1 = "action"
            java.lang.String r1 = v(r3, r1)
            r0.setAction(r1)
            java.lang.String r1 = "assistant_action"
            java.lang.String r1 = v(r3, r1)
            r0.setAssistantAction(r1)
            java.lang.String r1 = "walk_type"
            java.lang.String r3 = v(r3, r1)
            int r3 = L0(r3)
            r0.setRoadType(r3)
        L70:
            return r0
    }

    private static java.util.List<com.amap.api.services.route.TMC> b0(org.json.JSONArray r5) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()     // Catch: org.json.JSONException -> L3d
            if (r1 >= r2) goto L3c
            com.amap.api.services.route.TMC r2 = new com.amap.api.services.route.TMC     // Catch: org.json.JSONException -> L3d
            r2.<init>()     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r5.optJSONObject(r1)     // Catch: org.json.JSONException -> L3d
            if (r3 == 0) goto L39
            java.lang.String r4 = "tmc_distance"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L3d
            int r4 = L0(r4)     // Catch: org.json.JSONException -> L3d
            r2.setDistance(r4)     // Catch: org.json.JSONException -> L3d
            java.lang.String r4 = "tmc_status"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L3d
            r2.setStatus(r4)     // Catch: org.json.JSONException -> L3d
            java.lang.String r4 = "tmc_polyline"
            java.util.ArrayList r3 = a0(r3, r4)     // Catch: org.json.JSONException -> L3d
            r2.setPolyline(r3)     // Catch: org.json.JSONException -> L3d
            r0.add(r2)     // Catch: org.json.JSONException -> L3d
        L39:
            int r1 = r1 + 1
            goto L6
        L3c:
            return r0
        L3d:
            r5 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseTMCsV5"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r5.<init>(r0)
            throw r5
    }

    private static com.amap.api.services.route.RouteBusLineItem c(org.json.JSONObject r2) throws org.json.JSONException {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.route.RouteBusLineItem r0 = new com.amap.api.services.route.RouteBusLineItem
            r0.<init>()
            java.lang.String r1 = "departure_stop"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            com.amap.api.services.busline.BusStationItem r1 = f(r1)
            r0.setDepartureBusStation(r1)
            java.lang.String r1 = "arrival_stop"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            com.amap.api.services.busline.BusStationItem r1 = f(r1)
            r0.setArrivalBusStation(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineName(r1)
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineId(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = v(r2, r1)
            r0.setBusLineType(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "polyline"
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setPolyline(r1)
            java.lang.String r1 = "start_time"
            java.lang.String r1 = v(r2, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setFirstBusTime(r1)
            java.lang.String r1 = "end_time"
            java.lang.String r1 = v(r2, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setLastBusTime(r1)
            java.lang.String r1 = "via_num"
            java.lang.String r1 = v(r2, r1)
            int r1 = L0(r1)
            r0.setPassStationNum(r1)
            java.util.List r2 = e(r2)
            r0.setPassStations(r2)
            return r0
    }

    private static void c0(com.amap.api.services.route.Path r3, java.util.List<com.amap.api.services.route.RideStep> r4) {
            java.util.List r0 = r3.getPolyline()
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            com.amap.api.services.route.RideStep r1 = (com.amap.api.services.route.RideStep) r1
            if (r1 == 0) goto Lf
            java.util.List r2 = r1.getPolyline()
            if (r2 == 0) goto Lf
            java.util.List r1 = r1.getPolyline()
            r0.addAll(r1)
            goto Lf
        L2b:
            r3.setPolyline(r0)
            return
    }

    private static com.amap.api.services.route.RouteBusLineItem d(org.json.JSONObject r3) throws org.json.JSONException {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.amap.api.services.route.RouteBusLineItem r0 = new com.amap.api.services.route.RouteBusLineItem
            r0.<init>()
            java.lang.String r1 = "departure_stop"
            org.json.JSONObject r1 = r3.optJSONObject(r1)
            com.amap.api.services.busline.BusStationItem r1 = f(r1)
            r0.setDepartureBusStation(r1)
            java.lang.String r1 = "arrival_stop"
            org.json.JSONObject r1 = r3.optJSONObject(r1)
            com.amap.api.services.busline.BusStationItem r1 = f(r1)
            r0.setArrivalBusStation(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r3, r1)
            r0.setBusLineName(r1)
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r3, r1)
            r0.setBusLineId(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = v(r3, r1)
            r0.setBusLineType(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r3, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "cost"
            org.json.JSONObject r1 = r3.optJSONObject(r1)
            if (r1 == 0) goto L60
            java.lang.String r2 = "duration"
            java.lang.String r1 = v(r1, r2)
            float r1 = N0(r1)
            r0.setDuration(r1)
        L60:
            java.lang.String r1 = "polyline"
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L6f
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setPolyline(r1)
        L6f:
            java.lang.String r1 = "start_time"
            java.lang.String r1 = v(r3, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setFirstBusTime(r1)
            java.lang.String r1 = "end_time"
            java.lang.String r1 = v(r3, r1)
            java.util.Date r1 = com.amap.api.col.s.j4.n(r1)
            r0.setLastBusTime(r1)
            java.lang.String r1 = "via_num"
            java.lang.String r1 = v(r3, r1)
            int r1 = L0(r1)
            r0.setPassStationNum(r1)
            java.util.List r3 = e(r3)
            r0.setPassStations(r3)
            return r0
    }

    public static com.amap.api.services.core.PoiItem d0(org.json.JSONObject r7) throws org.json.JSONException {
            java.lang.String r0 = "parseBasePoi"
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "id"
            java.lang.String r2 = v(r7, r2)
            java.lang.String r3 = "location"
            com.amap.api.services.core.LatLonPoint r3 = S(r7, r3)
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r7, r4)
            java.lang.String r5 = "address"
            java.lang.String r5 = v(r7, r5)
            com.amap.api.services.core.PoiItem r6 = new com.amap.api.services.core.PoiItem
            r6.<init>(r2, r3, r4, r5)
            java.lang.String r2 = "adcode"
            java.lang.String r2 = v(r7, r2)
            r6.setAdCode(r2)
            java.lang.String r2 = "pname"
            java.lang.String r2 = v(r7, r2)
            r6.setProvinceName(r2)
            java.lang.String r2 = "cityname"
            java.lang.String r2 = v(r7, r2)
            r6.setCityName(r2)
            java.lang.String r2 = "adname"
            java.lang.String r2 = v(r7, r2)
            r6.setAdName(r2)
            java.lang.String r2 = "citycode"
            java.lang.String r2 = v(r7, r2)
            r6.setCityCode(r2)
            java.lang.String r2 = "pcode"
            java.lang.String r2 = v(r7, r2)
            r6.setProvinceCode(r2)
            java.lang.String r2 = "direction"
            java.lang.String r2 = v(r7, r2)
            r6.setDirection(r2)
            java.lang.String r2 = "distance"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto L86
            java.lang.String r2 = v(r7, r2)
            boolean r3 = s0(r2)
            if (r3 != 0) goto L86
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L7b java.lang.NumberFormatException -> L7d
            int r2 = (int) r2     // Catch: java.lang.Exception -> L7b java.lang.NumberFormatException -> L7d
            r6.setDistance(r2)     // Catch: java.lang.Exception -> L7b java.lang.NumberFormatException -> L7d
            goto L86
        L7b:
            r2 = move-exception
            goto L7f
        L7d:
            r2 = move-exception
            goto L83
        L7f:
            com.amap.api.col.s.j4.i(r2, r1, r0)
            goto L86
        L83:
            com.amap.api.col.s.j4.i(r2, r1, r0)
        L86:
            java.lang.String r0 = "tel"
            java.lang.String r0 = v(r7, r0)
            r6.setTel(r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = v(r7, r0)
            r6.setTypeDes(r0)
            java.lang.String r0 = "entr_location"
            com.amap.api.services.core.LatLonPoint r0 = S(r7, r0)
            r6.setEnter(r0)
            java.lang.String r0 = "exit_location"
            com.amap.api.services.core.LatLonPoint r0 = S(r7, r0)
            r6.setExit(r0)
            java.lang.String r0 = "website"
            java.lang.String r0 = v(r7, r0)
            r6.setWebsite(r0)
            java.lang.String r0 = "postcode"
            java.lang.String r0 = v(r7, r0)
            r6.setPostcode(r0)
            java.lang.String r0 = "business_area"
            java.lang.String r0 = v(r7, r0)
            boolean r1 = s0(r0)
            if (r1 == 0) goto Lce
            java.lang.String r0 = "businessarea"
            java.lang.String r0 = v(r7, r0)
        Lce:
            r6.setBusinessArea(r0)
            java.lang.String r0 = "email"
            java.lang.String r0 = v(r7, r0)
            r6.setEmail(r0)
            java.lang.String r0 = "indoor_map"
            java.lang.String r0 = v(r7, r0)
            boolean r0 = K0(r0)
            r1 = 0
            if (r0 == 0) goto Leb
            r6.setIndoorMap(r1)
            goto Lef
        Leb:
            r0 = 1
            r6.setIndoorMap(r0)
        Lef:
            java.lang.String r0 = "parking_type"
            java.lang.String r0 = v(r7, r0)
            r6.setParkingType(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "children"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto L124
            org.json.JSONArray r2 = r7.optJSONArray(r2)
            if (r2 == 0) goto L121
        L10b:
            int r3 = r2.length()
            if (r1 >= r3) goto L121
            org.json.JSONObject r3 = r2.optJSONObject(r1)
            if (r3 == 0) goto L11e
            com.amap.api.services.poisearch.SubPoiItem r3 = x0(r3)
            r0.add(r3)
        L11e:
            int r1 = r1 + 1
            goto L10b
        L121:
            r6.setSubPois(r0)
        L124:
            java.lang.String r0 = "indoor_data"
            com.amap.api.services.poisearch.IndoorData r0 = e0(r7, r0)
            r6.setIndoorDate(r0)
            java.lang.String r0 = "biz_ext"
            com.amap.api.services.poisearch.PoiItemExtension r0 = q0(r7, r0)
            r6.setPoiExtension(r0)
            java.lang.String r0 = "typecode"
            java.lang.String r0 = v(r7, r0)
            r6.setTypeCode(r0)
            java.lang.String r0 = "shopid"
            java.lang.String r0 = v(r7, r0)
            r6.setShopID(r0)
            z(r6, r7)
            return r6
    }

    private static java.util.List<com.amap.api.services.busline.BusStationItem> e(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L28
        L8:
            java.lang.String r1 = "via_stops"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto L11
            goto L28
        L11:
            r1 = 0
        L12:
            int r2 = r3.length()
            if (r1 >= r2) goto L28
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L25
            com.amap.api.services.busline.BusStationItem r2 = f(r2)
            r0.add(r2)
        L25:
            int r1 = r1 + 1
            goto L12
        L28:
            return r0
    }

    private static com.amap.api.services.poisearch.IndoorData e0(org.json.JSONObject r2, java.lang.String r3) throws org.json.JSONException {
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L2f
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            if (r2 == 0) goto L2f
            java.lang.String r3 = "cpid"
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "floor"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L2f
            java.lang.String r3 = v(r2, r3)
            java.lang.String r0 = v(r2, r0)
            int r0 = L0(r0)
            java.lang.String r1 = "truefloor"
            java.lang.String r2 = v(r2, r1)
            goto L33
        L2f:
            java.lang.String r3 = ""
            r0 = 0
            r2 = r3
        L33:
            com.amap.api.services.poisearch.IndoorData r1 = new com.amap.api.services.poisearch.IndoorData
            r1.<init>(r3, r0, r2)
            return r1
    }

    private static com.amap.api.services.busline.BusStationItem f(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.busline.BusStationItem r0 = new com.amap.api.services.busline.BusStationItem
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setBusStationName(r1)
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setBusStationId(r1)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r2 = S(r2, r1)
            r0.setLatLonPoint(r2)
            return r0
    }

    public static com.amap.api.services.route.WalkRouteResult f0(java.lang.String r14) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "steps"
            java.lang.String r1 = "duration"
            java.lang.String r2 = "distance"
            java.lang.String r3 = "paths"
            java.lang.String r4 = "route"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lf7
            r5.<init>(r14)     // Catch: org.json.JSONException -> Lf7
            boolean r14 = r5.has(r4)     // Catch: org.json.JSONException -> Lf7
            if (r14 != 0) goto L17
            r14 = 0
            return r14
        L17:
            com.amap.api.services.route.WalkRouteResult r14 = new com.amap.api.services.route.WalkRouteResult     // Catch: org.json.JSONException -> Lf7
            r14.<init>()     // Catch: org.json.JSONException -> Lf7
            org.json.JSONObject r4 = r5.optJSONObject(r4)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r5 = "origin"
            com.amap.api.services.core.LatLonPoint r5 = S(r4, r5)     // Catch: org.json.JSONException -> Lf7
            r14.setStartPos(r5)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r5 = "destination"
            com.amap.api.services.core.LatLonPoint r5 = S(r4, r5)     // Catch: org.json.JSONException -> Lf7
            r14.setTargetPos(r5)     // Catch: org.json.JSONException -> Lf7
            boolean r5 = r4.has(r3)     // Catch: org.json.JSONException -> Lf7
            if (r5 != 0) goto L39
            return r14
        L39:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lf7
            r5.<init>()     // Catch: org.json.JSONException -> Lf7
            org.json.JSONArray r3 = r4.optJSONArray(r3)     // Catch: org.json.JSONException -> Lf7
            if (r3 != 0) goto L48
            r14.setPaths(r5)     // Catch: org.json.JSONException -> Lf7
            return r14
        L48:
            r4 = 0
            r6 = 0
        L4a:
            int r7 = r3.length()     // Catch: org.json.JSONException -> Lf7
            if (r6 >= r7) goto Lf3
            com.amap.api.services.route.WalkPath r7 = new com.amap.api.services.route.WalkPath     // Catch: org.json.JSONException -> Lf7
            r7.<init>()     // Catch: org.json.JSONException -> Lf7
            org.json.JSONObject r8 = r3.optJSONObject(r6)     // Catch: org.json.JSONException -> Lf7
            if (r8 == 0) goto Lef
            java.lang.String r9 = v(r8, r2)     // Catch: org.json.JSONException -> Lf7
            float r9 = N0(r9)     // Catch: org.json.JSONException -> Lf7
            r7.setDistance(r9)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r9 = v(r8, r1)     // Catch: org.json.JSONException -> Lf7
            long r9 = R0(r9)     // Catch: org.json.JSONException -> Lf7
            r7.setDuration(r9)     // Catch: org.json.JSONException -> Lf7
            boolean r9 = r8.has(r0)     // Catch: org.json.JSONException -> Lf7
            if (r9 == 0) goto Lec
            org.json.JSONArray r8 = r8.optJSONArray(r0)     // Catch: org.json.JSONException -> Lf7
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lf7
            r9.<init>()     // Catch: org.json.JSONException -> Lf7
            if (r8 == 0) goto Lef
            r10 = 0
        L83:
            int r11 = r8.length()     // Catch: org.json.JSONException -> Lf7
            if (r10 >= r11) goto Le6
            com.amap.api.services.route.WalkStep r11 = new com.amap.api.services.route.WalkStep     // Catch: org.json.JSONException -> Lf7
            r11.<init>()     // Catch: org.json.JSONException -> Lf7
            org.json.JSONObject r12 = r8.optJSONObject(r10)     // Catch: org.json.JSONException -> Lf7
            if (r12 == 0) goto Le3
            java.lang.String r13 = "instruction"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setInstruction(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = "orientation"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setOrientation(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = "road"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setRoad(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = v(r12, r2)     // Catch: org.json.JSONException -> Lf7
            float r13 = N0(r13)     // Catch: org.json.JSONException -> Lf7
            r11.setDistance(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = v(r12, r1)     // Catch: org.json.JSONException -> Lf7
            float r13 = N0(r13)     // Catch: org.json.JSONException -> Lf7
            r11.setDuration(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = "polyline"
            java.util.ArrayList r13 = a0(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setPolyline(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = "action"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setAction(r13)     // Catch: org.json.JSONException -> Lf7
            java.lang.String r13 = "assistant_action"
            java.lang.String r12 = v(r12, r13)     // Catch: org.json.JSONException -> Lf7
            r11.setAssistantAction(r12)     // Catch: org.json.JSONException -> Lf7
            r9.add(r11)     // Catch: org.json.JSONException -> Lf7
        Le3:
            int r10 = r10 + 1
            goto L83
        Le6:
            r7.setSteps(r9)     // Catch: org.json.JSONException -> Lf7
            E(r7, r9)     // Catch: org.json.JSONException -> Lf7
        Lec:
            r5.add(r7)     // Catch: org.json.JSONException -> Lf7
        Lef:
            int r6 = r6 + 1
            goto L4a
        Lf3:
            r14.setPaths(r5)     // Catch: org.json.JSONException -> Lf7
            return r14
        Lf7:
            r14 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseWalkRoute"
            com.amap.api.col.s.j4.i(r14, r0, r1)
            com.amap.api.services.core.AMapException r14 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r14.<init>(r0)
            throw r14
    }

    private static com.amap.api.services.route.RouteRailwayItem g(org.json.JSONObject r4) throws org.json.JSONException {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "id"
            boolean r2 = r4.has(r1)
            if (r2 == 0) goto L7f
            java.lang.String r2 = "name"
            boolean r3 = r4.has(r2)
            if (r3 != 0) goto L15
            goto L7f
        L15:
            com.amap.api.services.route.RouteRailwayItem r0 = new com.amap.api.services.route.RouteRailwayItem
            r0.<init>()
            java.lang.String r1 = v(r4, r1)
            r0.setID(r1)
            java.lang.String r1 = v(r4, r2)
            r0.setName(r1)
            java.lang.String r1 = "time"
            java.lang.String r1 = v(r4, r1)
            r0.setTime(r1)
            java.lang.String r1 = "trip"
            java.lang.String r1 = v(r4, r1)
            r0.setTrip(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r4, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = v(r4, r1)
            r0.setType(r1)
            java.lang.String r1 = "departure_stop"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            com.amap.api.services.route.RailwayStationItem r1 = h(r1)
            r0.setDeparturestop(r1)
            java.lang.String r1 = "arrival_stop"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            com.amap.api.services.route.RailwayStationItem r1 = h(r1)
            r0.setArrivalstop(r1)
            java.util.List r1 = i(r4)
            r0.setViastops(r1)
            java.util.List r1 = j(r4)
            r0.setAlters(r1)
            java.util.List r4 = k(r4)
            r0.setSpaces(r4)
        L7f:
            return r0
    }

    private static java.util.List<com.amap.api.services.route.RouteSearchCity> g0(org.json.JSONArray r5) throws com.amap.api.services.core.AMapException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length()     // Catch: org.json.JSONException -> L3c
            if (r1 >= r2) goto L3b
            com.amap.api.services.route.RouteSearchCity r2 = new com.amap.api.services.route.RouteSearchCity     // Catch: org.json.JSONException -> L3c
            r2.<init>()     // Catch: org.json.JSONException -> L3c
            org.json.JSONObject r3 = r5.optJSONObject(r1)     // Catch: org.json.JSONException -> L3c
            if (r3 == 0) goto L38
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L3c
            r2.setSearchCityName(r4)     // Catch: org.json.JSONException -> L3c
            java.lang.String r4 = "citycode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L3c
            r2.setSearchCitycode(r4)     // Catch: org.json.JSONException -> L3c
            java.lang.String r4 = "adcode"
            java.lang.String r4 = v(r3, r4)     // Catch: org.json.JSONException -> L3c
            r2.setSearchCityhAdCode(r4)     // Catch: org.json.JSONException -> L3c
            F(r2, r3)     // Catch: org.json.JSONException -> L3c
            r0.add(r2)     // Catch: org.json.JSONException -> L3c
        L38:
            int r1 = r1 + 1
            goto L6
        L3b:
            return r0
        L3c:
            r5 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseCrossCity"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r5.<init>(r0)
            throw r5
    }

    private static com.amap.api.services.route.RailwayStationItem h(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.route.RailwayStationItem r0 = new com.amap.api.services.route.RailwayStationItem
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setID(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setName(r1)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r1 = S(r2, r1)
            r0.setLocation(r1)
            java.lang.String r1 = "adcode"
            java.lang.String r1 = v(r2, r1)
            r0.setAdcode(r1)
            java.lang.String r1 = "time"
            java.lang.String r1 = v(r2, r1)
            r0.setTime(r1)
            java.lang.String r1 = "start"
            java.lang.String r1 = v(r2, r1)
            boolean r1 = U0(r1)
            r0.setisStart(r1)
            java.lang.String r1 = "end"
            java.lang.String r1 = v(r2, r1)
            boolean r1 = U0(r1)
            r0.setisEnd(r1)
            java.lang.String r1 = "wait"
            java.lang.String r2 = v(r2, r1)
            float r2 = N0(r2)
            r0.setWait(r2)
            return r0
    }

    public static com.amap.api.services.core.PoiItemV2 h0(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "id"
            java.lang.String r0 = v(r5, r0)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r1 = S(r5, r1)
            java.lang.String r2 = "name"
            java.lang.String r2 = v(r5, r2)
            java.lang.String r3 = "address"
            java.lang.String r3 = v(r5, r3)
            com.amap.api.services.core.PoiItemV2 r4 = new com.amap.api.services.core.PoiItemV2
            r4.<init>(r0, r1, r2, r3)
            java.lang.String r0 = "type"
            java.lang.String r0 = v(r5, r0)
            r4.setTypeDes(r0)
            java.lang.String r0 = "typecode"
            java.lang.String r0 = v(r5, r0)
            r4.setTypeCode(r0)
            java.lang.String r0 = "pname"
            java.lang.String r0 = v(r5, r0)
            r4.setProvinceName(r0)
            java.lang.String r0 = "cityname"
            java.lang.String r0 = v(r5, r0)
            r4.setCityName(r0)
            java.lang.String r0 = "adname"
            java.lang.String r0 = v(r5, r0)
            r4.setAdName(r0)
            java.lang.String r0 = "pcode"
            java.lang.String r0 = v(r5, r0)
            r4.setProvinceCode(r0)
            java.lang.String r0 = "adcode"
            java.lang.String r0 = v(r5, r0)
            r4.setAdCode(r0)
            java.lang.String r0 = "citycode"
            java.lang.String r0 = v(r5, r0)
            r4.setCityCode(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "children"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L92
            org.json.JSONArray r1 = r5.optJSONArray(r1)
            if (r1 == 0) goto L8f
            r2 = 0
        L79:
            int r3 = r1.length()
            if (r2 >= r3) goto L8f
            org.json.JSONObject r3 = r1.optJSONObject(r2)
            if (r3 == 0) goto L8c
            com.amap.api.services.poisearch.SubPoiItemV2 r3 = z0(r3)
            r0.add(r3)
        L8c:
            int r2 = r2 + 1
            goto L79
        L8f:
            r4.setSubPois(r0)
        L92:
            java.lang.String r0 = "business"
            com.amap.api.services.poisearch.Business r0 = k0(r5, r0)
            r4.setBusiness(r0)
            java.lang.String r0 = "indoor"
            com.amap.api.services.poisearch.IndoorDataV2 r0 = i0(r5, r0)
            r4.setIndoorData(r0)
            java.lang.String r0 = "navi"
            com.amap.api.services.poisearch.PoiNavi r0 = n0(r5, r0)
            r4.setPoiNavi(r0)
            A(r4, r5)
            return r4
    }

    private static java.util.List<com.amap.api.services.route.RailwayStationItem> i(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L28
        L8:
            java.lang.String r1 = "via_stops"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto L11
            goto L28
        L11:
            r1 = 0
        L12:
            int r2 = r3.length()
            if (r1 >= r2) goto L28
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L25
            com.amap.api.services.route.RailwayStationItem r2 = h(r2)
            r0.add(r2)
        L25:
            int r1 = r1 + 1
            goto L12
        L28:
            return r0
    }

    private static com.amap.api.services.poisearch.IndoorDataV2 i0(org.json.JSONObject r3, java.lang.String r4) throws org.json.JSONException {
            boolean r0 = r3.has(r4)
            r1 = 0
            if (r0 == 0) goto L32
            org.json.JSONObject r3 = r3.optJSONObject(r4)
            if (r3 == 0) goto L32
            java.lang.String r4 = "indoor_map"
            java.lang.String r4 = v(r3, r4)
            int r4 = L0(r4)
            r0 = 1
            if (r4 != r0) goto L1b
            r1 = 1
        L1b:
            java.lang.String r4 = "cpid"
            java.lang.String r4 = v(r3, r4)
            java.lang.String r0 = "floor"
            java.lang.String r0 = v(r3, r0)
            int r0 = L0(r0)
            java.lang.String r2 = "truefloor"
            java.lang.String r3 = v(r3, r2)
            goto L36
        L32:
            java.lang.String r4 = ""
            r3 = r4
            r0 = 0
        L36:
            com.amap.api.services.poisearch.IndoorDataV2 r2 = new com.amap.api.services.poisearch.IndoorDataV2
            r2.<init>(r1, r4, r0, r3)
            return r2
    }

    private static java.util.List<com.amap.api.services.route.Railway> j(org.json.JSONObject r5) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 != 0) goto L8
            goto L3b
        L8:
            java.lang.String r1 = "alters"
            org.json.JSONArray r5 = r5.optJSONArray(r1)
            if (r5 != 0) goto L11
            goto L3b
        L11:
            r1 = 0
        L12:
            int r2 = r5.length()
            if (r1 >= r2) goto L3b
            org.json.JSONObject r2 = r5.optJSONObject(r1)
            if (r2 == 0) goto L38
            com.amap.api.services.route.Railway r3 = new com.amap.api.services.route.Railway
            r3.<init>()
            java.lang.String r4 = "id"
            java.lang.String r4 = v(r2, r4)
            r3.setID(r4)
            java.lang.String r4 = "name"
            java.lang.String r2 = v(r2, r4)
            r3.setName(r2)
            r0.add(r3)
        L38:
            int r1 = r1 + 1
            goto L12
        L3b:
            return r0
    }

    public static com.amap.api.services.route.WalkRouteResultV2 j0(java.lang.String r15) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "steps"
            java.lang.String r1 = "cost"
            java.lang.String r2 = "paths"
            java.lang.String r3 = "route"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L11c
            r4.<init>(r15)     // Catch: org.json.JSONException -> L11c
            boolean r15 = r4.has(r3)     // Catch: org.json.JSONException -> L11c
            if (r15 != 0) goto L15
            r15 = 0
            return r15
        L15:
            com.amap.api.services.route.WalkRouteResultV2 r15 = new com.amap.api.services.route.WalkRouteResultV2     // Catch: org.json.JSONException -> L11c
            r15.<init>()     // Catch: org.json.JSONException -> L11c
            org.json.JSONObject r3 = r4.optJSONObject(r3)     // Catch: org.json.JSONException -> L11c
            java.lang.String r4 = "origin"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)     // Catch: org.json.JSONException -> L11c
            r15.setStartPos(r4)     // Catch: org.json.JSONException -> L11c
            java.lang.String r4 = "destination"
            com.amap.api.services.core.LatLonPoint r4 = S(r3, r4)     // Catch: org.json.JSONException -> L11c
            r15.setTargetPos(r4)     // Catch: org.json.JSONException -> L11c
            boolean r4 = r3.has(r2)     // Catch: org.json.JSONException -> L11c
            if (r4 != 0) goto L37
            return r15
        L37:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L11c
            r4.<init>()     // Catch: org.json.JSONException -> L11c
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch: org.json.JSONException -> L11c
            if (r2 != 0) goto L46
            r15.setPaths(r4)     // Catch: org.json.JSONException -> L11c
            return r15
        L46:
            r3 = 0
            r5 = 0
        L48:
            int r6 = r2.length()     // Catch: org.json.JSONException -> L11c
            if (r5 >= r6) goto L118
            com.amap.api.services.route.WalkPath r6 = new com.amap.api.services.route.WalkPath     // Catch: org.json.JSONException -> L11c
            r6.<init>()     // Catch: org.json.JSONException -> L11c
            org.json.JSONObject r7 = r2.optJSONObject(r5)     // Catch: org.json.JSONException -> L11c
            if (r7 == 0) goto L114
            java.lang.String r8 = "distance"
            java.lang.String r8 = v(r7, r8)     // Catch: org.json.JSONException -> L11c
            float r8 = N0(r8)     // Catch: org.json.JSONException -> L11c
            r6.setDistance(r8)     // Catch: org.json.JSONException -> L11c
            org.json.JSONObject r8 = r7.optJSONObject(r1)     // Catch: org.json.JSONException -> L11c
            java.lang.String r9 = "duration"
            if (r8 == 0) goto L79
            java.lang.String r8 = v(r8, r9)     // Catch: org.json.JSONException -> L11c
            long r10 = R0(r8)     // Catch: org.json.JSONException -> L11c
            r6.setDuration(r10)     // Catch: org.json.JSONException -> L11c
        L79:
            boolean r8 = r7.has(r0)     // Catch: org.json.JSONException -> L11c
            if (r8 == 0) goto L111
            org.json.JSONArray r7 = r7.optJSONArray(r0)     // Catch: org.json.JSONException -> L11c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: org.json.JSONException -> L11c
            r8.<init>()     // Catch: org.json.JSONException -> L11c
            if (r7 == 0) goto L114
            r10 = 0
        L8b:
            int r11 = r7.length()     // Catch: org.json.JSONException -> L11c
            if (r10 >= r11) goto L10b
            com.amap.api.services.route.WalkStep r11 = new com.amap.api.services.route.WalkStep     // Catch: org.json.JSONException -> L11c
            r11.<init>()     // Catch: org.json.JSONException -> L11c
            org.json.JSONObject r12 = r7.optJSONObject(r10)     // Catch: org.json.JSONException -> L11c
            if (r12 == 0) goto L108
            java.lang.String r13 = "instruction"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> L11c
            r11.setInstruction(r13)     // Catch: org.json.JSONException -> L11c
            java.lang.String r13 = "orientation"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> L11c
            r11.setOrientation(r13)     // Catch: org.json.JSONException -> L11c
            java.lang.String r13 = "road_name"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> L11c
            r11.setRoad(r13)     // Catch: org.json.JSONException -> L11c
            java.lang.String r13 = "step_distance"
            java.lang.String r13 = v(r12, r13)     // Catch: org.json.JSONException -> L11c
            float r13 = N0(r13)     // Catch: org.json.JSONException -> L11c
            r11.setDistance(r13)     // Catch: org.json.JSONException -> L11c
            org.json.JSONObject r13 = r12.optJSONObject(r1)     // Catch: org.json.JSONException -> L11c
            if (r13 == 0) goto Ld5
            java.lang.String r13 = v(r13, r9)     // Catch: org.json.JSONException -> L11c
            float r13 = N0(r13)     // Catch: org.json.JSONException -> L11c
            r11.setDuration(r13)     // Catch: org.json.JSONException -> L11c
        Ld5:
            java.lang.String r13 = "navi"
            org.json.JSONObject r13 = r12.optJSONObject(r13)     // Catch: org.json.JSONException -> L11c
            if (r13 == 0) goto Lfc
            java.lang.String r14 = "action"
            java.lang.String r14 = v(r13, r14)     // Catch: org.json.JSONException -> L11c
            r11.setAction(r14)     // Catch: org.json.JSONException -> L11c
            java.lang.String r14 = "assistant_action"
            java.lang.String r14 = v(r13, r14)     // Catch: org.json.JSONException -> L11c
            r11.setAssistantAction(r14)     // Catch: org.json.JSONException -> L11c
            java.lang.String r14 = "work_type"
            java.lang.String r13 = v(r13, r14)     // Catch: org.json.JSONException -> L11c
            int r13 = L0(r13)     // Catch: org.json.JSONException -> L11c
            r11.setRoadType(r13)     // Catch: org.json.JSONException -> L11c
        Lfc:
            java.lang.String r13 = "polyline"
            java.util.ArrayList r12 = a0(r12, r13)     // Catch: org.json.JSONException -> L11c
            r11.setPolyline(r12)     // Catch: org.json.JSONException -> L11c
            r8.add(r11)     // Catch: org.json.JSONException -> L11c
        L108:
            int r10 = r10 + 1
            goto L8b
        L10b:
            r6.setSteps(r8)     // Catch: org.json.JSONException -> L11c
            E(r6, r8)     // Catch: org.json.JSONException -> L11c
        L111:
            r4.add(r6)     // Catch: org.json.JSONException -> L11c
        L114:
            int r5 = r5 + 1
            goto L48
        L118:
            r15.setPaths(r4)     // Catch: org.json.JSONException -> L11c
            return r15
        L11c:
            r15 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseWalkRoute"
            com.amap.api.col.s.j4.i(r15, r0, r1)
            com.amap.api.services.core.AMapException r15 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r15.<init>(r0)
            throw r15
    }

    private static java.util.List<com.amap.api.services.route.RailwaySpace> k(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L28
        L8:
            java.lang.String r1 = "spaces"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto L11
            goto L28
        L11:
            r1 = 0
        L12:
            int r2 = r3.length()
            if (r1 >= r2) goto L28
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L25
            com.amap.api.services.route.RailwaySpace r2 = l(r2)
            r0.add(r2)
        L25:
            int r1 = r1 + 1
            goto L12
        L28:
            return r0
    }

    private static com.amap.api.services.poisearch.Business k0(org.json.JSONObject r10, java.lang.String r11) throws org.json.JSONException {
            boolean r0 = r10.has(r11)
            if (r0 == 0) goto L52
            org.json.JSONObject r10 = r10.optJSONObject(r11)
            if (r10 == 0) goto L52
            java.lang.String r11 = "business_area"
            java.lang.String r11 = v(r10, r11)
            java.lang.String r0 = "opentime_today"
            java.lang.String r0 = v(r10, r0)
            java.lang.String r1 = "opentime_week"
            java.lang.String r1 = v(r10, r1)
            java.lang.String r2 = "tel"
            java.lang.String r2 = v(r10, r2)
            java.lang.String r3 = "tag"
            java.lang.String r3 = v(r10, r3)
            java.lang.String r4 = "rating"
            java.lang.String r4 = v(r10, r4)
            java.lang.String r5 = "cost"
            java.lang.String r5 = v(r10, r5)
            java.lang.String r6 = "parking_type"
            java.lang.String r6 = v(r10, r6)
            java.lang.String r7 = "alias"
            java.lang.String r7 = v(r10, r7)
            java.lang.String r8 = "cpid"
            java.lang.String r10 = v(r10, r8)
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            r1 = r11
            goto L5e
        L52:
            java.lang.String r11 = ""
            r10 = r11
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L5e:
            com.amap.api.services.poisearch.Business r0 = new com.amap.api.services.poisearch.Business
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.setCPID(r10)
            return r0
    }

    private static com.amap.api.services.route.RailwaySpace l(org.json.JSONObject r2) throws org.json.JSONException {
            java.lang.String r0 = "code"
            java.lang.String r0 = v(r2, r0)
            java.lang.String r1 = "cost"
            java.lang.String r2 = v(r2, r1)
            float r2 = N0(r2)
            com.amap.api.services.route.RailwaySpace r1 = new com.amap.api.services.route.RailwaySpace
            r1.<init>(r0, r2)
            return r1
    }

    public static com.amap.api.services.weather.LocalWeatherLive l0(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "lives"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            r1.<init>(r2)     // Catch: org.json.JSONException -> L7b
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L7b
            if (r2 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            com.amap.api.services.weather.LocalWeatherLive r2 = new com.amap.api.services.weather.LocalWeatherLive     // Catch: org.json.JSONException -> L7b
            r2.<init>()     // Catch: org.json.JSONException -> L7b
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L7b
            if (r0 == 0) goto L7a
            int r1 = r0.length()     // Catch: org.json.JSONException -> L7b
            if (r1 > 0) goto L21
            goto L7a
        L21:
            r1 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: org.json.JSONException -> L7b
            if (r0 != 0) goto L29
            goto L7a
        L29:
            java.lang.String r1 = "adcode"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setAdCode(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "province"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setProvince(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "city"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setCity(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "weather"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setWeather(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "temperature"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setTemperature(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "winddirection"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setWindDirection(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "windpower"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setWindPower(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "humidity"
            java.lang.String r1 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setHumidity(r1)     // Catch: org.json.JSONException -> L7b
            java.lang.String r1 = "reporttime"
            java.lang.String r0 = v(r0, r1)     // Catch: org.json.JSONException -> L7b
            r2.setReportTime(r0)     // Catch: org.json.JSONException -> L7b
        L7a:
            return r2
        L7b:
            r2 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "WeatherForecastResult"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r2.<init>(r0)
            throw r2
    }

    private static com.amap.api.services.route.TaxiItem m(org.json.JSONObject r2) throws org.json.JSONException {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.amap.api.services.route.TaxiItem r0 = new com.amap.api.services.route.TaxiItem
            r0.<init>()
            java.lang.String r1 = "origin"
            com.amap.api.services.core.LatLonPoint r1 = S(r2, r1)
            r0.setOrigin(r1)
            java.lang.String r1 = "destination"
            com.amap.api.services.core.LatLonPoint r1 = S(r2, r1)
            r0.setDestination(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "sname"
            java.lang.String r1 = v(r2, r1)
            r0.setSname(r1)
            java.lang.String r1 = "tname"
            java.lang.String r2 = v(r2, r1)
            r0.setTname(r2)
            return r0
    }

    public static java.util.ArrayList<com.amap.api.services.busline.BusStationItem> m0(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "busstops"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 == 0) goto L2b
            int r1 = r3.length()
            if (r1 != 0) goto L14
            goto L2b
        L14:
            r1 = 0
        L15:
            int r2 = r3.length()
            if (r1 >= r2) goto L2b
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L28
            com.amap.api.services.busline.BusStationItem r2 = B0(r2)
            r0.add(r2)
        L28:
            int r1 = r1 + 1
            goto L15
        L2b:
            return r0
    }

    private static com.amap.api.services.route.TaxiItemV2 n(org.json.JSONObject r3) throws org.json.JSONException {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.amap.api.services.route.TaxiItemV2 r0 = new com.amap.api.services.route.TaxiItemV2
            r0.<init>()
            java.lang.String r1 = "startpoint"
            com.amap.api.services.core.LatLonPoint r1 = S(r3, r1)
            r0.setOrigin(r1)
            java.lang.String r1 = "endpoint"
            com.amap.api.services.core.LatLonPoint r1 = S(r3, r1)
            r0.setDestination(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r3, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "drivetime"
            java.lang.String r1 = v(r3, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "polyline"
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L44
            java.util.ArrayList r1 = a0(r2, r1)
            r0.setPolyline(r1)
        L44:
            java.lang.String r1 = "startname"
            java.lang.String r1 = v(r3, r1)
            r0.setSname(r1)
            java.lang.String r1 = "endname"
            java.lang.String r3 = v(r3, r1)
            r0.setTname(r3)
            return r0
    }

    private static com.amap.api.services.poisearch.PoiNavi n0(org.json.JSONObject r3, java.lang.String r4) throws org.json.JSONException {
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L25
            org.json.JSONObject r3 = r3.optJSONObject(r4)
            if (r3 == 0) goto L25
            java.lang.String r4 = "navi_poiid"
            java.lang.String r4 = v(r3, r4)
            java.lang.String r0 = "entr_location"
            com.amap.api.services.core.LatLonPoint r0 = S(r3, r0)
            java.lang.String r1 = "exit_location"
            com.amap.api.services.core.LatLonPoint r1 = S(r3, r1)
            java.lang.String r2 = "gridcode"
            java.lang.String r3 = v(r3, r2)
            goto L2a
        L25:
            java.lang.String r4 = ""
            r0 = 0
            r3 = r4
            r1 = r0
        L2a:
            com.amap.api.services.poisearch.PoiNavi r2 = new com.amap.api.services.poisearch.PoiNavi
            r2.<init>(r4, r0, r1, r3)
            return r2
    }

    private static com.amap.api.services.route.ElecConsumeInfo o(org.json.JSONObject r4) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.ElecConsumeInfo r0 = new com.amap.api.services.route.ElecConsumeInfo     // Catch: org.json.JSONException -> L46
            r0.<init>()     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "runout_point"
            com.amap.api.services.core.LatLonPoint r1 = S(r4, r1)     // Catch: org.json.JSONException -> L46
            r0.setRunOutPoint(r1)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "runout_step_index"
            int r1 = K(r4, r1)     // Catch: org.json.JSONException -> L46
            r0.setRunOutStepIndex(r1)     // Catch: org.json.JSONException -> L46
            java.lang.String r1 = "consume_energy"
            int r1 = K(r4, r1)     // Catch: org.json.JSONException -> L46
            r0.setConsumeEnergy(r1)     // Catch: org.json.JSONException -> L46
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: org.json.JSONException -> L46
            r1.<init>()     // Catch: org.json.JSONException -> L46
            java.lang.String r2 = "left_energy"
            org.json.JSONArray r4 = r4.optJSONArray(r2)     // Catch: org.json.JSONException -> L46
            if (r4 == 0) goto L42
            r2 = 0
        L2e:
            int r3 = r4.length()     // Catch: org.json.JSONException -> L46
            if (r2 >= r3) goto L42
            int r3 = r4.optInt(r2)     // Catch: org.json.JSONException -> L46
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L46
            r1.add(r3)     // Catch: org.json.JSONException -> L46
            int r2 = r2 + 1
            goto L2e
        L42:
            r0.setLeftEnergy(r1)     // Catch: org.json.JSONException -> L46
            return r0
        L46:
            r4 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseElecConsumeInfo"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }

    public static com.amap.api.services.weather.LocalWeatherForecast o0(java.lang.String r6) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "casts"
            java.lang.String r1 = "forecasts"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le4
            r2.<init>(r6)     // Catch: org.json.JSONException -> Le4
            boolean r6 = r2.has(r1)     // Catch: org.json.JSONException -> Le4
            if (r6 != 0) goto L11
            r6 = 0
            return r6
        L11:
            com.amap.api.services.weather.LocalWeatherForecast r6 = new com.amap.api.services.weather.LocalWeatherForecast     // Catch: org.json.JSONException -> Le4
            r6.<init>()     // Catch: org.json.JSONException -> Le4
            org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch: org.json.JSONException -> Le4
            if (r1 == 0) goto Le3
            int r2 = r1.length()     // Catch: org.json.JSONException -> Le4
            if (r2 > 0) goto L24
            goto Le3
        L24:
            r2 = 0
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: org.json.JSONException -> Le4
            if (r1 != 0) goto L2d
            goto Le3
        L2d:
            java.lang.String r3 = "city"
            java.lang.String r3 = v(r1, r3)     // Catch: org.json.JSONException -> Le4
            r6.setCity(r3)     // Catch: org.json.JSONException -> Le4
            java.lang.String r3 = "adcode"
            java.lang.String r3 = v(r1, r3)     // Catch: org.json.JSONException -> Le4
            r6.setAdCode(r3)     // Catch: org.json.JSONException -> Le4
            java.lang.String r3 = "province"
            java.lang.String r3 = v(r1, r3)     // Catch: org.json.JSONException -> Le4
            r6.setProvince(r3)     // Catch: org.json.JSONException -> Le4
            java.lang.String r3 = "reporttime"
            java.lang.String r3 = v(r1, r3)     // Catch: org.json.JSONException -> Le4
            r6.setReportTime(r3)     // Catch: org.json.JSONException -> Le4
            boolean r3 = r1.has(r0)     // Catch: org.json.JSONException -> Le4
            if (r3 != 0) goto L59
            goto Le3
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> Le4
            r3.<init>()     // Catch: org.json.JSONException -> Le4
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> Le4
            if (r0 == 0) goto Le0
            int r1 = r0.length()     // Catch: org.json.JSONException -> Le4
            if (r1 > 0) goto L6b
            goto Le0
        L6b:
            int r1 = r0.length()     // Catch: org.json.JSONException -> Le4
            if (r2 >= r1) goto Ldc
            com.amap.api.services.weather.LocalDayWeatherForecast r1 = new com.amap.api.services.weather.LocalDayWeatherForecast     // Catch: org.json.JSONException -> Le4
            r1.<init>()     // Catch: org.json.JSONException -> Le4
            org.json.JSONObject r4 = r0.optJSONObject(r2)     // Catch: org.json.JSONException -> Le4
            if (r4 == 0) goto Ld9
            java.lang.String r5 = "date"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setDate(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "week"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setWeek(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "dayweather"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setDayWeather(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "nightweather"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setNightWeather(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "daytemp"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setDayTemp(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "nighttemp"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setNightTemp(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "daywind"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setDayWindDirection(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "nightwind"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setNightWindDirection(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "daypower"
            java.lang.String r5 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setDayWindPower(r5)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "nightpower"
            java.lang.String r4 = v(r4, r5)     // Catch: org.json.JSONException -> Le4
            r1.setNightWindPower(r4)     // Catch: org.json.JSONException -> Le4
            r3.add(r1)     // Catch: org.json.JSONException -> Le4
        Ld9:
            int r2 = r2 + 1
            goto L6b
        Ldc:
            r6.setWeatherForecast(r3)     // Catch: org.json.JSONException -> Le4
            return r6
        Le0:
            r6.setWeatherForecast(r3)     // Catch: org.json.JSONException -> Le4
        Le3:
            return r6
        Le4:
            r6 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "WeatherForecastResult"
            com.amap.api.col.s.j4.i(r6, r0, r1)
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r6.<init>(r0)
            throw r6
    }

    private static com.amap.api.services.route.Navi p(org.json.JSONObject r2) throws com.amap.api.services.core.AMapException {
            com.amap.api.services.route.Navi r0 = new com.amap.api.services.route.Navi     // Catch: org.json.JSONException -> L18
            r0.<init>()     // Catch: org.json.JSONException -> L18
            java.lang.String r1 = "action"
            java.lang.String r1 = v(r2, r1)     // Catch: org.json.JSONException -> L18
            r0.setAction(r1)     // Catch: org.json.JSONException -> L18
            java.lang.String r1 = "assistant_action"
            java.lang.String r2 = v(r2, r1)     // Catch: org.json.JSONException -> L18
            r0.setAssistantAction(r2)     // Catch: org.json.JSONException -> L18
            return r0
        L18:
            r2 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseNavi"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r2.<init>(r0)
            throw r2
    }

    public static java.util.ArrayList<com.amap.api.services.busline.BusLineItem> p0(org.json.JSONObject r3) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "buslines"
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 != 0) goto Le
            goto L25
        Le:
            r1 = 0
        Lf:
            int r2 = r3.length()
            if (r1 >= r2) goto L25
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 == 0) goto L22
            com.amap.api.services.busline.BusLineItem r2 = H0(r2)
            r0.add(r2)
        L22:
            int r1 = r1 + 1
            goto Lf
        L25:
            return r0
    }

    private static java.util.List<com.amap.api.services.poisearch.Photo> q(org.json.JSONObject r5) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 != 0) goto L8
            goto L3d
        L8:
            java.lang.String r1 = "photos"
            boolean r2 = r5.has(r1)
            if (r2 != 0) goto L11
            goto L3d
        L11:
            org.json.JSONArray r5 = r5.optJSONArray(r1)
            r1 = 0
        L16:
            int r2 = r5.length()
            if (r1 >= r2) goto L3d
            org.json.JSONObject r2 = r5.optJSONObject(r1)
            com.amap.api.services.poisearch.Photo r3 = new com.amap.api.services.poisearch.Photo
            r3.<init>()
            java.lang.String r4 = "title"
            java.lang.String r4 = v(r2, r4)
            r3.setTitle(r4)
            java.lang.String r4 = "url"
            java.lang.String r2 = v(r2, r4)
            r3.setUrl(r2)
            r0.add(r3)
            int r1 = r1 + 1
            goto L16
        L3d:
            return r0
    }

    private static com.amap.api.services.poisearch.PoiItemExtension q0(org.json.JSONObject r1, java.lang.String r2) throws org.json.JSONException {
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L19
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            if (r1 == 0) goto L19
            java.lang.String r2 = "open_time"
            java.lang.String r2 = v(r1, r2)
            java.lang.String r0 = "rating"
            java.lang.String r1 = v(r1, r0)
            goto L1c
        L19:
            java.lang.String r2 = ""
            r1 = r2
        L1c:
            com.amap.api.services.poisearch.PoiItemExtension r0 = new com.amap.api.services.poisearch.PoiItemExtension
            r0.<init>(r2, r1)
            return r0
    }

    private static com.amap.api.services.routepoisearch.RoutePOIItem r(org.json.JSONObject r2) throws org.json.JSONException {
            com.amap.api.services.routepoisearch.RoutePOIItem r0 = new com.amap.api.services.routepoisearch.RoutePOIItem
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r1 = v(r2, r1)
            r0.setID(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = v(r2, r1)
            r0.setTitle(r1)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r1 = S(r2, r1)
            r0.setPoint(r1)
            java.lang.String r1 = "distance"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDistance(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = v(r2, r1)
            float r1 = N0(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "cpid"
            java.lang.String r2 = v(r2, r1)
            r0.setCPID(r2)
            return r0
    }

    public static java.util.ArrayList<com.amap.api.services.geocoder.GeocodeAddress> r0(org.json.JSONObject r6) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "geocodes"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 == 0) goto La4
            int r1 = r6.length()
            if (r1 != 0) goto L15
            goto La4
        L15:
            r1 = 0
        L16:
            int r2 = r6.length()
            if (r1 >= r2) goto La4
            org.json.JSONObject r2 = r6.optJSONObject(r1)
            if (r2 == 0) goto La0
            com.amap.api.services.geocoder.GeocodeAddress r3 = new com.amap.api.services.geocoder.GeocodeAddress
            r3.<init>()
            java.lang.String r4 = "formatted_address"
            java.lang.String r4 = v(r2, r4)
            r3.setFormatAddress(r4)
            java.lang.String r4 = "province"
            java.lang.String r4 = v(r2, r4)
            r3.setProvince(r4)
            java.lang.String r4 = "city"
            java.lang.String r4 = v(r2, r4)
            r3.setCity(r4)
            java.lang.String r4 = "district"
            java.lang.String r4 = v(r2, r4)
            r3.setDistrict(r4)
            java.lang.String r4 = "township"
            java.lang.String r4 = v(r2, r4)
            r3.setTownship(r4)
            java.lang.String r4 = "neighborhood"
            org.json.JSONObject r4 = r2.optJSONObject(r4)
            java.lang.String r5 = "name"
            java.lang.String r4 = v(r4, r5)
            r3.setNeighborhood(r4)
            java.lang.String r4 = "building"
            org.json.JSONObject r4 = r2.optJSONObject(r4)
            java.lang.String r4 = v(r4, r5)
            r3.setBuilding(r4)
            java.lang.String r4 = "adcode"
            java.lang.String r4 = v(r2, r4)
            r3.setAdcode(r4)
            java.lang.String r4 = "location"
            com.amap.api.services.core.LatLonPoint r4 = S(r2, r4)
            r3.setLatLonPoint(r4)
            java.lang.String r4 = "level"
            java.lang.String r4 = v(r2, r4)
            r3.setLevel(r4)
            java.lang.String r4 = "country"
            java.lang.String r4 = v(r2, r4)
            r3.setCountry(r4)
            java.lang.String r4 = "postcode"
            java.lang.String r2 = v(r2, r4)
            r3.setPostcode(r2)
            r0.add(r3)
        La0:
            int r1 = r1 + 1
            goto L16
        La4:
            return r0
    }

    private static com.amap.api.services.route.RidePath s(org.json.JSONObject r8) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "steps"
            java.lang.String r1 = "duration"
            java.lang.String r2 = "distance"
            com.amap.api.services.route.RidePath r3 = new com.amap.api.services.route.RidePath
            r3.<init>()
            r4 = 0
            if (r8 != 0) goto Lf
            return r4
        Lf:
            java.lang.String r5 = v(r8, r2)     // Catch: org.json.JSONException -> La2
            float r5 = N0(r5)     // Catch: org.json.JSONException -> La2
            r3.setDistance(r5)     // Catch: org.json.JSONException -> La2
            java.lang.String r5 = v(r8, r1)     // Catch: org.json.JSONException -> La2
            long r5 = R0(r5)     // Catch: org.json.JSONException -> La2
            r3.setDuration(r5)     // Catch: org.json.JSONException -> La2
            boolean r5 = r8.has(r0)     // Catch: org.json.JSONException -> La2
            if (r5 == 0) goto La1
            org.json.JSONArray r8 = r8.optJSONArray(r0)     // Catch: org.json.JSONException -> La2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> La2
            r0.<init>()     // Catch: org.json.JSONException -> La2
            if (r8 != 0) goto L37
            return r4
        L37:
            r4 = 0
        L38:
            int r5 = r8.length()     // Catch: org.json.JSONException -> La2
            if (r4 >= r5) goto L9b
            com.amap.api.services.route.RideStep r5 = new com.amap.api.services.route.RideStep     // Catch: org.json.JSONException -> La2
            r5.<init>()     // Catch: org.json.JSONException -> La2
            org.json.JSONObject r6 = r8.optJSONObject(r4)     // Catch: org.json.JSONException -> La2
            if (r6 == 0) goto L98
            java.lang.String r7 = "instruction"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setInstruction(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = "orientation"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setOrientation(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = "road"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setRoad(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = v(r6, r2)     // Catch: org.json.JSONException -> La2
            float r7 = N0(r7)     // Catch: org.json.JSONException -> La2
            r5.setDistance(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = v(r6, r1)     // Catch: org.json.JSONException -> La2
            float r7 = N0(r7)     // Catch: org.json.JSONException -> La2
            r5.setDuration(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = "polyline"
            java.util.ArrayList r7 = a0(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setPolyline(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = "action"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setAction(r7)     // Catch: org.json.JSONException -> La2
            java.lang.String r7 = "assistant_action"
            java.lang.String r6 = v(r6, r7)     // Catch: org.json.JSONException -> La2
            r5.setAssistantAction(r6)     // Catch: org.json.JSONException -> La2
            r0.add(r5)     // Catch: org.json.JSONException -> La2
        L98:
            int r4 = r4 + 1
            goto L38
        L9b:
            r3.setSteps(r0)     // Catch: org.json.JSONException -> La2
            c0(r3, r0)     // Catch: org.json.JSONException -> La2
        La1:
            return r3
        La2:
            r8 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseRidePath"
            com.amap.api.col.s.j4.i(r8, r0, r1)
            com.amap.api.services.core.AMapException r8 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r8.<init>(r0)
            throw r8
    }

    public static boolean s0(java.lang.String r1) {
            if (r1 == 0) goto Ld
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    private static com.amap.api.services.route.RidePath t(org.json.JSONObject r8) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "steps"
            java.lang.String r1 = "duration"
            com.amap.api.services.route.RidePath r2 = new com.amap.api.services.route.RidePath
            r2.<init>()
            r3 = 0
            if (r8 != 0) goto Ld
            return r3
        Ld:
            java.lang.String r4 = "distance"
            java.lang.String r4 = v(r8, r4)     // Catch: org.json.JSONException -> Lc2
            float r4 = N0(r4)     // Catch: org.json.JSONException -> Lc2
            r2.setDistance(r4)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r4 = v(r8, r1)     // Catch: org.json.JSONException -> Lc2
            long r4 = R0(r4)     // Catch: org.json.JSONException -> Lc2
            r2.setDuration(r4)     // Catch: org.json.JSONException -> Lc2
            boolean r4 = r8.has(r0)     // Catch: org.json.JSONException -> Lc2
            if (r4 == 0) goto Lc1
            org.json.JSONArray r8 = r8.optJSONArray(r0)     // Catch: org.json.JSONException -> Lc2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lc2
            r0.<init>()     // Catch: org.json.JSONException -> Lc2
            if (r8 != 0) goto L37
            return r3
        L37:
            r3 = 0
        L38:
            int r4 = r8.length()     // Catch: org.json.JSONException -> Lc2
            if (r3 >= r4) goto Lbb
            com.amap.api.services.route.RideStep r4 = new com.amap.api.services.route.RideStep     // Catch: org.json.JSONException -> Lc2
            r4.<init>()     // Catch: org.json.JSONException -> Lc2
            org.json.JSONObject r5 = r8.optJSONObject(r3)     // Catch: org.json.JSONException -> Lc2
            if (r5 == 0) goto Lb7
            java.lang.String r6 = "instruction"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> Lc2
            r4.setInstruction(r6)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r6 = "orientation"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> Lc2
            r4.setOrientation(r6)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r6 = "road_name"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> Lc2
            r4.setRoad(r6)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r6 = "step_distance"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> Lc2
            float r6 = N0(r6)     // Catch: org.json.JSONException -> Lc2
            r4.setDistance(r6)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r6 = "cost"
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch: org.json.JSONException -> Lc2
            if (r6 == 0) goto L84
            java.lang.String r6 = v(r6, r1)     // Catch: org.json.JSONException -> Lc2
            float r6 = N0(r6)     // Catch: org.json.JSONException -> Lc2
            r4.setDuration(r6)     // Catch: org.json.JSONException -> Lc2
        L84:
            java.lang.String r6 = "navi"
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch: org.json.JSONException -> Lc2
            if (r6 == 0) goto Lab
            java.lang.String r7 = "action"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> Lc2
            r4.setAction(r7)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r7 = "assistant_action"
            java.lang.String r7 = v(r6, r7)     // Catch: org.json.JSONException -> Lc2
            r4.setAssistantAction(r7)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r7 = "work_type"
            java.lang.String r6 = v(r6, r7)     // Catch: org.json.JSONException -> Lc2
            int r6 = L0(r6)     // Catch: org.json.JSONException -> Lc2
            r4.setRoadType(r6)     // Catch: org.json.JSONException -> Lc2
        Lab:
            java.lang.String r6 = "polyline"
            java.util.ArrayList r5 = a0(r5, r6)     // Catch: org.json.JSONException -> Lc2
            r4.setPolyline(r5)     // Catch: org.json.JSONException -> Lc2
            r0.add(r4)     // Catch: org.json.JSONException -> Lc2
        Lb7:
            int r3 = r3 + 1
            goto L38
        Lbb:
            r2.setSteps(r0)     // Catch: org.json.JSONException -> Lc2
            c0(r2, r0)     // Catch: org.json.JSONException -> Lc2
        Lc1:
            return r2
        Lc2:
            r8 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseRidePathV2"
            com.amap.api.col.s.j4.i(r8, r0, r1)
            com.amap.api.services.core.AMapException r8 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r8.<init>(r0)
            throw r8
    }

    public static com.amap.api.services.route.RideRouteResult t0(java.lang.String r6) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "path"
            java.lang.String r1 = "data"
            java.lang.String r2 = "paths"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7f
            r3.<init>(r6)     // Catch: org.json.JSONException -> L7f
            boolean r6 = r3.has(r1)     // Catch: org.json.JSONException -> L7f
            if (r6 != 0) goto L13
            r6 = 0
            return r6
        L13:
            com.amap.api.services.route.RideRouteResult r6 = new com.amap.api.services.route.RideRouteResult     // Catch: org.json.JSONException -> L7f
            r6.<init>()     // Catch: org.json.JSONException -> L7f
            org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch: org.json.JSONException -> L7f
            java.lang.String r3 = "origin"
            com.amap.api.services.core.LatLonPoint r3 = S(r1, r3)     // Catch: org.json.JSONException -> L7f
            r6.setStartPos(r3)     // Catch: org.json.JSONException -> L7f
            java.lang.String r3 = "destination"
            com.amap.api.services.core.LatLonPoint r3 = S(r1, r3)     // Catch: org.json.JSONException -> L7f
            r6.setTargetPos(r3)     // Catch: org.json.JSONException -> L7f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> L7f
            r3.<init>()     // Catch: org.json.JSONException -> L7f
            java.lang.Object r4 = r1.opt(r2)     // Catch: org.json.JSONException -> L7f
            if (r4 != 0) goto L3d
            r6.setPaths(r3)     // Catch: org.json.JSONException -> L7f
            return r6
        L3d:
            boolean r5 = r4 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> L7f
            if (r5 == 0) goto L5c
            org.json.JSONArray r0 = r1.optJSONArray(r2)     // Catch: org.json.JSONException -> L7f
            r1 = 0
        L46:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L7f
            if (r1 >= r2) goto L7b
            org.json.JSONObject r2 = r0.optJSONObject(r1)     // Catch: org.json.JSONException -> L7f
            com.amap.api.services.route.RidePath r2 = s(r2)     // Catch: org.json.JSONException -> L7f
            if (r2 == 0) goto L59
            r3.add(r2)     // Catch: org.json.JSONException -> L7f
        L59:
            int r1 = r1 + 1
            goto L46
        L5c:
            boolean r4 = r4 instanceof org.json.JSONObject     // Catch: org.json.JSONException -> L7f
            if (r4 == 0) goto L7b
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch: org.json.JSONException -> L7f
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L7f
            if (r2 != 0) goto L6e
            r6.setPaths(r3)     // Catch: org.json.JSONException -> L7f
            return r6
        L6e:
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L7f
            com.amap.api.services.route.RidePath r0 = s(r0)     // Catch: org.json.JSONException -> L7f
            if (r0 == 0) goto L7b
            r3.add(r0)     // Catch: org.json.JSONException -> L7f
        L7b:
            r6.setPaths(r3)     // Catch: org.json.JSONException -> L7f
            return r6
        L7f:
            r6 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseRideRoute"
            com.amap.api.col.s.j4.i(r6, r0, r1)
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r6.<init>(r0)
            throw r6
    }

    public static com.amap.api.services.route.BusRouteResult u(java.lang.String r3) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "transits"
            java.lang.String r1 = "route"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L52
            r2.<init>(r3)     // Catch: org.json.JSONException -> L52
            boolean r3 = r2.has(r1)     // Catch: org.json.JSONException -> L52
            if (r3 != 0) goto L11
            r3 = 0
            return r3
        L11:
            com.amap.api.services.route.BusRouteResult r3 = new com.amap.api.services.route.BusRouteResult     // Catch: org.json.JSONException -> L52
            r3.<init>()     // Catch: org.json.JSONException -> L52
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L52
            if (r1 != 0) goto L1d
            goto L49
        L1d:
            java.lang.String r2 = "origin"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L52
            r3.setStartPos(r2)     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = "destination"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L52
            r3.setTargetPos(r2)     // Catch: org.json.JSONException -> L52
            java.lang.String r2 = "taxi_cost"
            java.lang.String r2 = v(r1, r2)     // Catch: org.json.JSONException -> L52
            float r2 = N0(r2)     // Catch: org.json.JSONException -> L52
            r3.setTaxiCost(r2)     // Catch: org.json.JSONException -> L52
            boolean r2 = r1.has(r0)     // Catch: org.json.JSONException -> L52
            if (r2 != 0) goto L43
            goto L49
        L43:
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L52
            if (r0 != 0) goto L4a
        L49:
            return r3
        L4a:
            java.util.List r0 = y(r0)     // Catch: org.json.JSONException -> L52
            r3.setPaths(r0)     // Catch: org.json.JSONException -> L52
            return r3
        L52:
            com.amap.api.services.core.AMapException r3 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r3.<init>(r0)
            throw r3
    }

    public static java.util.ArrayList<com.amap.api.services.help.Tip> u0(org.json.JSONObject r10) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "tips"
            org.json.JSONArray r10 = r10.optJSONArray(r1)
            if (r10 != 0) goto Lf
            goto L89
        Lf:
            r1 = 0
            r2 = 0
        L11:
            int r3 = r10.length()
            if (r2 >= r3) goto L89
            com.amap.api.services.help.Tip r3 = new com.amap.api.services.help.Tip
            r3.<init>()
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            if (r4 == 0) goto L86
            java.lang.String r5 = "name"
            java.lang.String r5 = v(r4, r5)
            r3.setName(r5)
            java.lang.String r5 = "district"
            java.lang.String r5 = v(r4, r5)
            r3.setDistrict(r5)
            java.lang.String r5 = "adcode"
            java.lang.String r5 = v(r4, r5)
            r3.setAdcode(r5)
            java.lang.String r5 = "id"
            java.lang.String r5 = v(r4, r5)
            r3.setID(r5)
            java.lang.String r5 = "address"
            java.lang.String r5 = v(r4, r5)
            r3.setAddress(r5)
            java.lang.String r5 = "typecode"
            java.lang.String r5 = v(r4, r5)
            r3.setTypeCode(r5)
            java.lang.String r5 = "location"
            java.lang.String r4 = v(r4, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L83
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L83
            com.amap.api.services.core.LatLonPoint r5 = new com.amap.api.services.core.LatLonPoint
            r6 = 1
            r6 = r4[r6]
            double r6 = java.lang.Double.parseDouble(r6)
            r4 = r4[r1]
            double r8 = java.lang.Double.parseDouble(r4)
            r5.<init>(r6, r8)
            r3.setPostion(r5)
        L83:
            r0.add(r3)
        L86:
            int r2 = r2 + 1
            goto L11
        L89:
            return r0
    }

    public static java.lang.String v(org.json.JSONObject r3, java.lang.String r4) throws org.json.JSONException {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r1 = r3.has(r4)
            if (r1 == 0) goto L20
            java.lang.String r1 = r3.optString(r4)
            java.lang.String r2 = "[]"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L20
            java.lang.String r3 = r3.optString(r4)
            java.lang.String r3 = r3.trim()
            return r3
        L20:
            return r0
    }

    public static com.amap.api.services.route.RideRouteResultV2 v0(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "paths"
            java.lang.String r1 = "route"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5e
            r2.<init>(r4)     // Catch: org.json.JSONException -> L5e
            boolean r4 = r2.has(r1)     // Catch: org.json.JSONException -> L5e
            if (r4 != 0) goto L11
            r4 = 0
            return r4
        L11:
            com.amap.api.services.route.RideRouteResultV2 r4 = new com.amap.api.services.route.RideRouteResultV2     // Catch: org.json.JSONException -> L5e
            r4.<init>()     // Catch: org.json.JSONException -> L5e
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "origin"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L5e
            r4.setStartPos(r2)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "destination"
            com.amap.api.services.core.LatLonPoint r2 = S(r1, r2)     // Catch: org.json.JSONException -> L5e
            r4.setTargetPos(r2)     // Catch: org.json.JSONException -> L5e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L5e
            r2.<init>()     // Catch: org.json.JSONException -> L5e
            java.lang.Object r3 = r1.opt(r0)     // Catch: org.json.JSONException -> L5e
            if (r3 != 0) goto L3b
            r4.setPaths(r2)     // Catch: org.json.JSONException -> L5e
            return r4
        L3b:
            boolean r3 = r3 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> L5e
            if (r3 == 0) goto L5a
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L5e
            r1 = 0
        L44:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L5e
            if (r1 >= r3) goto L5a
            org.json.JSONObject r3 = r0.optJSONObject(r1)     // Catch: org.json.JSONException -> L5e
            com.amap.api.services.route.RidePath r3 = t(r3)     // Catch: org.json.JSONException -> L5e
            if (r3 == 0) goto L57
            r2.add(r3)     // Catch: org.json.JSONException -> L5e
        L57:
            int r1 = r1 + 1
            goto L44
        L5a:
            r4.setPaths(r2)     // Catch: org.json.JSONException -> L5e
            return r4
        L5e:
            r4 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseRideRouteV2"
            com.amap.api.col.s.j4.i(r4, r0, r1)
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }

    public static java.util.ArrayList<com.amap.api.services.core.SuggestionCity> w(org.json.JSONObject r7) throws org.json.JSONException, java.lang.NumberFormatException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "cities"
            boolean r2 = r7.has(r1)
            if (r2 != 0) goto Le
            goto L49
        Le:
            org.json.JSONArray r7 = r7.optJSONArray(r1)
            if (r7 != 0) goto L15
            goto L49
        L15:
            r1 = 0
        L16:
            int r2 = r7.length()
            if (r1 >= r2) goto L49
            org.json.JSONObject r2 = r7.optJSONObject(r1)
            if (r2 == 0) goto L46
            java.lang.String r3 = "name"
            java.lang.String r3 = v(r2, r3)
            java.lang.String r4 = "citycode"
            java.lang.String r4 = v(r2, r4)
            java.lang.String r5 = "adcode"
            java.lang.String r5 = v(r2, r5)
            java.lang.String r6 = "num"
            java.lang.String r2 = v(r2, r6)
            int r2 = L0(r2)
            com.amap.api.services.core.SuggestionCity r6 = new com.amap.api.services.core.SuggestionCity
            r6.<init>(r3, r4, r5, r2)
            r0.add(r6)
        L46:
            int r1 = r1 + 1
            goto L16
        L49:
            return r0
    }

    public static java.util.ArrayList<com.amap.api.services.routepoisearch.RoutePOIItem> w0(org.json.JSONObject r4) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "pois"
            java.lang.Object r2 = r4.opt(r1)
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L33
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            if (r4 == 0) goto L46
            int r1 = r4.length()
            if (r1 != 0) goto L1c
            goto L46
        L1c:
            r1 = 0
        L1d:
            int r2 = r4.length()
            if (r1 >= r2) goto L46
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            if (r2 == 0) goto L30
            com.amap.api.services.routepoisearch.RoutePOIItem r2 = r(r2)
            r0.add(r2)
        L30:
            int r1 = r1 + 1
            goto L1d
        L33:
            boolean r4 = r2 instanceof org.json.JSONObject
            if (r4 == 0) goto L46
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r4 = "poi"
            org.json.JSONObject r4 = r2.optJSONObject(r4)
            com.amap.api.services.routepoisearch.RoutePOIItem r4 = r(r4)
            r0.add(r4)
        L46:
            return r0
    }

    public static java.util.ArrayList<com.amap.api.services.nearby.NearbyInfo> x(org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
            java.lang.String r0 = "datas"
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L81
            int r0 = r13.length()
            if (r0 != 0) goto L10
            goto L81
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r13.length()
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r1) goto L80
            org.json.JSONObject r4 = r13.optJSONObject(r3)
            java.lang.String r5 = "userid"
            java.lang.String r5 = v(r4, r5)
            java.lang.String r6 = "location"
            java.lang.String r6 = v(r4, r6)
            if (r6 == 0) goto L47
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 2
            if (r7 != r8) goto L47
            r7 = r6[r2]
            double r7 = P0(r7)
            r9 = 1
            r6 = r6[r9]
            double r9 = P0(r6)
            goto L4a
        L47:
            r7 = 0
            r9 = r7
        L4a:
            java.lang.String r6 = "distance"
            java.lang.String r6 = v(r4, r6)
            java.lang.String r11 = "updatetime"
            java.lang.String r4 = v(r4, r11)
            long r11 = R0(r4)
            int r4 = L0(r6)
            com.amap.api.services.core.LatLonPoint r6 = new com.amap.api.services.core.LatLonPoint
            r6.<init>(r9, r7)
            com.amap.api.services.nearby.NearbyInfo r7 = new com.amap.api.services.nearby.NearbyInfo
            r7.<init>()
            r7.setUserID(r5)
            r7.setTimeStamp(r11)
            r7.setPoint(r6)
            if (r14 == 0) goto L77
            r7.setDrivingDistance(r4)
            goto L7a
        L77:
            r7.setDistance(r4)
        L7a:
            r0.add(r7)
            int r3 = r3 + 1
            goto L1b
        L80:
            return r0
        L81:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
    }

    private static com.amap.api.services.poisearch.SubPoiItem x0(org.json.JSONObject r7) throws org.json.JSONException {
            java.lang.String r0 = "parseSubPoiItem"
            java.lang.String r1 = "JSONHelper"
            java.lang.String r2 = "id"
            java.lang.String r2 = v(r7, r2)
            java.lang.String r3 = "location"
            com.amap.api.services.core.LatLonPoint r3 = S(r7, r3)
            java.lang.String r4 = "name"
            java.lang.String r4 = v(r7, r4)
            java.lang.String r5 = "address"
            java.lang.String r5 = v(r7, r5)
            com.amap.api.services.poisearch.SubPoiItem r6 = new com.amap.api.services.poisearch.SubPoiItem
            r6.<init>(r2, r3, r4, r5)
            java.lang.String r2 = "sname"
            java.lang.String r2 = v(r7, r2)
            r6.setSubName(r2)
            java.lang.String r2 = "subtype"
            java.lang.String r2 = v(r7, r2)
            r6.setSubTypeDes(r2)
            java.lang.String r2 = "distance"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto L59
            java.lang.String r7 = v(r7, r2)
            boolean r2 = s0(r7)
            if (r2 != 0) goto L59
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.Exception -> L4e java.lang.NumberFormatException -> L50
            int r7 = (int) r7     // Catch: java.lang.Exception -> L4e java.lang.NumberFormatException -> L50
            r6.setDistance(r7)     // Catch: java.lang.Exception -> L4e java.lang.NumberFormatException -> L50
            return r6
        L4e:
            r7 = move-exception
            goto L52
        L50:
            r7 = move-exception
            goto L56
        L52:
            com.amap.api.col.s.j4.i(r7, r1, r0)
            goto L59
        L56:
            com.amap.api.col.s.j4.i(r7, r1, r0)
        L59:
            return r6
    }

    private static java.util.List<com.amap.api.services.route.BusPath> y(org.json.JSONArray r11) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r11 != 0) goto L9
            goto Lc3
        L9:
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r11.length()
            if (r2 >= r3) goto Lc3
            com.amap.api.services.route.BusPath r3 = new com.amap.api.services.route.BusPath
            r3.<init>()
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            if (r4 == 0) goto Lbf
            java.lang.String r5 = "cost"
            java.lang.String r5 = v(r4, r5)
            float r5 = N0(r5)
            r3.setCost(r5)
            java.lang.String r5 = "duration"
            java.lang.String r5 = v(r4, r5)
            long r5 = R0(r5)
            r3.setDuration(r5)
            java.lang.String r5 = "nightflag"
            java.lang.String r5 = v(r4, r5)
            boolean r5 = U0(r5)
            r3.setNightBus(r5)
            java.lang.String r5 = "walking_distance"
            java.lang.String r5 = v(r4, r5)
            float r5 = N0(r5)
            r3.setWalkDistance(r5)
            java.lang.String r5 = "distance"
            java.lang.String r5 = v(r4, r5)
            float r5 = N0(r5)
            r3.setDistance(r5)
            java.lang.String r5 = "segments"
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            if (r4 == 0) goto Lbf
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
            r8 = 0
        L6d:
            int r9 = r4.length()
            if (r8 >= r9) goto Lb3
            org.json.JSONObject r9 = r4.optJSONObject(r8)
            if (r9 == 0) goto Lb0
            com.amap.api.services.route.BusStep r9 = O0(r9)
            if (r9 == 0) goto Lb0
            r5.add(r9)
            com.amap.api.services.route.RouteBusWalkItem r10 = r9.getWalk()
            if (r10 == 0) goto L91
            com.amap.api.services.route.RouteBusWalkItem r10 = r9.getWalk()
            float r10 = r10.getDistance()
            float r7 = r7 + r10
        L91:
            java.util.List r10 = r9.getBusLines()
            if (r10 == 0) goto Lb0
            java.util.List r10 = r9.getBusLines()
            int r10 = r10.size()
            if (r10 <= 0) goto Lb0
            java.util.List r9 = r9.getBusLines()
            java.lang.Object r9 = r9.get(r1)
            com.amap.api.services.route.RouteBusLineItem r9 = (com.amap.api.services.route.RouteBusLineItem) r9
            float r9 = r9.getDistance()
            float r6 = r6 + r9
        Lb0:
            int r8 = r8 + 1
            goto L6d
        Lb3:
            r3.setSteps(r5)
            r3.setBusDistance(r6)
            r3.setWalkDistance(r7)
            r0.add(r3)
        Lbf:
            int r2 = r2 + 1
            goto Lb
        Lc3:
            return r0
    }

    public static com.amap.api.services.route.DistanceResult y0(java.lang.String r8) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "results"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L87
            r1.<init>(r8)     // Catch: org.json.JSONException -> L87
            boolean r8 = r1.has(r0)     // Catch: org.json.JSONException -> L87
            if (r8 != 0) goto Lf
            r8 = 0
            return r8
        Lf:
            com.amap.api.services.route.DistanceResult r8 = new com.amap.api.services.route.DistanceResult     // Catch: org.json.JSONException -> L87
            r8.<init>()     // Catch: org.json.JSONException -> L87
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L87
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: org.json.JSONException -> L87
            r1.<init>()     // Catch: org.json.JSONException -> L87
            int r2 = r0.length()     // Catch: org.json.JSONException -> L87
            r3 = 0
        L22:
            if (r3 >= r2) goto L83
            com.amap.api.services.route.DistanceItem r4 = new com.amap.api.services.route.DistanceItem     // Catch: org.json.JSONException -> L87
            r4.<init>()     // Catch: org.json.JSONException -> L87
            org.json.JSONObject r5 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "origin_id"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            int r6 = L0(r6)     // Catch: org.json.JSONException -> L87
            r4.setOriginId(r6)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "dest_id"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            int r6 = L0(r6)     // Catch: org.json.JSONException -> L87
            r4.setDestId(r6)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "distance"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            float r6 = N0(r6)     // Catch: org.json.JSONException -> L87
            r4.setDistance(r6)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "duration"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            float r6 = N0(r6)     // Catch: org.json.JSONException -> L87
            r4.setDuration(r6)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "info"
            java.lang.String r6 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L87
            if (r7 != 0) goto L7d
            r4.setErrorInfo(r6)     // Catch: org.json.JSONException -> L87
            java.lang.String r6 = "code"
            java.lang.String r5 = v(r5, r6)     // Catch: org.json.JSONException -> L87
            int r5 = L0(r5)     // Catch: org.json.JSONException -> L87
            r4.setErrorCode(r5)     // Catch: org.json.JSONException -> L87
        L7d:
            r1.add(r4)     // Catch: org.json.JSONException -> L87
            int r3 = r3 + 1
            goto L22
        L83:
            r8.setDistanceResults(r1)     // Catch: org.json.JSONException -> L87
            return r8
        L87:
            r8 = move-exception
            java.lang.String r0 = "JSONHelper"
            java.lang.String r1 = "parseRouteDistance"
            com.amap.api.col.s.j4.i(r8, r0, r1)
            com.amap.api.services.core.AMapException r8 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r8.<init>(r0)
            throw r8
    }

    private static void z(com.amap.api.services.core.PoiItem r2, org.json.JSONObject r3) throws org.json.JSONException {
            java.lang.String r0 = "deep_info"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            java.util.List r0 = q(r0)
            int r1 = r0.size()
            if (r1 != 0) goto L14
            java.util.List r0 = q(r3)
        L14:
            r2.setPhotos(r0)
            return
    }

    private static com.amap.api.services.poisearch.SubPoiItemV2 z0(org.json.JSONObject r5) throws org.json.JSONException {
            java.lang.String r0 = "id"
            java.lang.String r0 = v(r5, r0)
            java.lang.String r1 = "location"
            com.amap.api.services.core.LatLonPoint r1 = S(r5, r1)
            java.lang.String r2 = "name"
            java.lang.String r2 = v(r5, r2)
            java.lang.String r3 = "address"
            java.lang.String r3 = v(r5, r3)
            com.amap.api.services.poisearch.SubPoiItemV2 r4 = new com.amap.api.services.poisearch.SubPoiItemV2
            r4.<init>(r0, r1, r2, r3)
            java.lang.String r0 = "subtype"
            java.lang.String r0 = v(r5, r0)
            r4.setSubTypeDes(r0)
            java.lang.String r0 = "typecode"
            java.lang.String r5 = v(r5, r0)
            r4.setTypeCode(r5)
            return r4
    }
}
