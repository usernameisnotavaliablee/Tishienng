package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j4 {
    public j4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static double a(double r3) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.text.DecimalFormatSymbols r1 = new java.text.DecimalFormatSymbols
            java.util.Locale r2 = java.util.Locale.US
            r1.<init>(r2)
            java.lang.String r2 = "0.000000"
            r0.<init>(r2, r1)
            java.lang.String r3 = r0.format(r3)
            double r3 = java.lang.Double.parseDouble(r3)
            return r3
    }

    public static float b(com.amap.api.services.core.LatLonPoint r18, com.amap.api.services.core.LatLonPoint r19) {
            r0 = 0
            if (r18 == 0) goto L91
            if (r19 != 0) goto L7
            goto L91
        L7:
            double r1 = r18.getLongitude()     // Catch: java.lang.Throwable -> L91
            double r3 = r18.getLatitude()     // Catch: java.lang.Throwable -> L91
            double r5 = r19.getLongitude()     // Catch: java.lang.Throwable -> L91
            double r7 = r19.getLatitude()     // Catch: java.lang.Throwable -> L91
            r9 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            double r1 = r1 * r9
            double r3 = r3 * r9
            double r5 = r5 * r9
            double r7 = r7 * r9
            double r9 = java.lang.Math.sin(r1)     // Catch: java.lang.Throwable -> L91
            double r11 = java.lang.Math.sin(r3)     // Catch: java.lang.Throwable -> L91
            double r1 = java.lang.Math.cos(r1)     // Catch: java.lang.Throwable -> L91
            double r3 = java.lang.Math.cos(r3)     // Catch: java.lang.Throwable -> L91
            double r13 = java.lang.Math.sin(r5)     // Catch: java.lang.Throwable -> L91
            double r15 = java.lang.Math.sin(r7)     // Catch: java.lang.Throwable -> L91
            double r5 = java.lang.Math.cos(r5)     // Catch: java.lang.Throwable -> L91
            double r7 = java.lang.Math.cos(r7)     // Catch: java.lang.Throwable -> L91
            double r1 = r1 * r3
            double r3 = r3 * r9
            r9 = 3
            double[] r10 = new double[r9]     // Catch: java.lang.Throwable -> L91
            r17 = 0
            r10[r17] = r1     // Catch: java.lang.Throwable -> L91
            r1 = 1
            r10[r1] = r3     // Catch: java.lang.Throwable -> L91
            r2 = 2
            r10[r2] = r11     // Catch: java.lang.Throwable -> L91
            double r5 = r5 * r7
            double r7 = r7 * r13
            double[] r3 = new double[r9]     // Catch: java.lang.Throwable -> L91
            r3[r17] = r5     // Catch: java.lang.Throwable -> L91
            r3[r1] = r7     // Catch: java.lang.Throwable -> L91
            r3[r2] = r15     // Catch: java.lang.Throwable -> L91
            r4 = r10[r17]     // Catch: java.lang.Throwable -> L91
            r6 = r3[r17]     // Catch: java.lang.Throwable -> L91
            double r8 = r4 - r6
            double r4 = r4 - r6
            double r8 = r8 * r4
            r4 = r10[r1]     // Catch: java.lang.Throwable -> L91
            r6 = r3[r1]     // Catch: java.lang.Throwable -> L91
            double r11 = r4 - r6
            double r4 = r4 - r6
            double r11 = r11 * r4
            double r8 = r8 + r11
            r4 = r10[r2]     // Catch: java.lang.Throwable -> L91
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L91
            double r6 = r4 - r1
            double r4 = r4 - r1
            double r6 = r6 * r4
            double r8 = r8 + r6
            double r1 = java.lang.Math.sqrt(r8)     // Catch: java.lang.Throwable -> L91
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            double r0 = java.lang.Math.asin(r1)     // Catch: java.lang.Throwable -> L91
            r2 = 4713102420611050193(0x41684dae328e2ad1, double:1.27420015798544E7)
            double r0 = r0 * r2
            float r0 = (float) r0
        L91:
            return r0
    }

    public static java.lang.String c(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r3 & 1
            if (r1 == 0) goto Le
            java.lang.String r1 = "cost,"
            r0.append(r1)
        Le:
            r1 = r3 & 2
            if (r1 == 0) goto L17
            java.lang.String r1 = "tmcs,"
            r0.append(r1)
        L17:
            r1 = r3 & 4
            if (r1 == 0) goto L20
            java.lang.String r1 = "navi,"
            r0.append(r1)
        L20:
            r1 = r3 & 8
            if (r1 == 0) goto L29
            java.lang.String r1 = "cities,"
            r0.append(r1)
        L29:
            r1 = r3 & 16
            if (r1 == 0) goto L32
            java.lang.String r1 = "polyline,"
            r0.append(r1)
        L32:
            r1 = r3 & 32
            if (r1 == 0) goto L3b
            java.lang.String r1 = "elec_consume_info,"
            r0.append(r1)
        L3b:
            r3 = r3 & 64
            if (r3 == 0) goto L44
            java.lang.String r3 = "charge_station_info,"
            r0.append(r3)
        L44:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            int r1 = r0.length()
            java.lang.String r2 = ""
            r0.replace(r3, r1, r2)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String d(com.amap.api.services.core.LatLonPoint r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            double r0 = r4.getLongitude()
            double r0 = a(r0)
            double r2 = r4.getLatitude()
            double r2 = a(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ","
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public static java.lang.String e(java.util.Date r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HH:mm"
            r0.<init>(r1)
            if (r2 == 0) goto Le
            java.lang.String r2 = r0.format(r2)
            return r2
        Le:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String f(java.util.List<com.amap.api.services.core.LatLonPoint> r1) {
            java.lang.String r0 = ";"
            java.lang.String r1 = g(r1, r0)
            return r1
    }

    public static java.lang.String g(java.util.List<com.amap.api.services.core.LatLonPoint> r7, java.lang.String r8) {
            if (r7 != 0) goto L5
            java.lang.String r7 = ""
            return r7
        L5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        Lb:
            int r2 = r7.size()
            if (r1 >= r2) goto L3a
            java.lang.Object r2 = r7.get(r1)
            com.amap.api.services.core.LatLonPoint r2 = (com.amap.api.services.core.LatLonPoint) r2
            if (r2 == 0) goto L37
            double r3 = r2.getLongitude()
            double r3 = a(r3)
            double r5 = r2.getLatitude()
            double r5 = a(r5)
            r0.append(r3)
            java.lang.String r2 = ","
            r0.append(r2)
            r0.append(r5)
            r0.append(r8)
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            int r7 = r0.length()
            int r7 = r7 + (-1)
            r0.deleteCharAt(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    private static void h(int r2, java.lang.String r3) throws com.amap.api.services.core.AMapException, org.json.JSONException {
            if (r2 == 0) goto L12a
            r0 = 22000(0x55f0, float:3.0829E-41)
            r1 = 2
            if (r2 == r0) goto L122
            r0 = 32200(0x7dc8, float:4.5122E-41)
            if (r2 == r0) goto L11a
            r0 = 32201(0x7dc9, float:4.5123E-41)
            if (r2 == r0) goto L112
            switch(r2) {
                case 10000: goto L12a;
                case 10001: goto L10a;
                case 10002: goto L102;
                case 10003: goto Lfa;
                case 10004: goto Lf2;
                case 10005: goto Lea;
                case 10006: goto Le2;
                case 10007: goto Lda;
                case 10008: goto Ld2;
                case 10009: goto Lca;
                case 10010: goto Lc2;
                case 10011: goto Lba;
                case 10012: goto Lb2;
                case 10013: goto Laa;
                default: goto L12;
            }
        L12:
            switch(r2) {
                case 20000: goto La2;
                case 20001: goto L9a;
                case 20002: goto L92;
                case 20003: goto L8a;
                default: goto L15;
            }
        L15:
            switch(r2) {
                case 20800: goto L82;
                case 20801: goto L7a;
                case 20802: goto L72;
                case 20803: goto L6a;
                default: goto L18;
            }
        L18:
            switch(r2) {
                case 30000: goto L62;
                case 30001: goto L5a;
                case 30002: goto L52;
                case 30003: goto L4a;
                default: goto L1b;
            }
        L1b:
            switch(r2) {
                case 32000: goto L42;
                case 32001: goto L3a;
                case 32002: goto L32;
                default: goto L1e;
            }
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2c
            if (r2 <= 0) goto L2c
            com.amap.api.services.core.AMapException r0 = new com.amap.api.services.core.AMapException
            r0.<init>(r3, r1, r3, r2)
            throw r0
        L2c:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            r2.<init>(r3, r1, r3)
            throw r2
        L32:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "服务器维护中"
            r2.<init>(r0, r1, r3)
            throw r2
        L3a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "ID不存在"
            r2.<init>(r0, r1, r3)
            throw r2
        L42:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "key对应的tableID不存在"
            r2.<init>(r0, r1, r3)
            throw r2
        L4a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "读取服务结果超时"
            r2.<init>(r0, r1, r3)
            throw r2
        L52:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "服务端请求链接超时"
            r2.<init>(r0, r1, r3)
            throw r2
        L5a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "引擎返回数据异常"
            r2.<init>(r0, r1, r3)
            throw r2
        L62:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "请求服务响应错误"
            r2.<init>(r0, r1, r3)
            throw r2
        L6a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "起点终点距离过长"
            r2.<init>(r0, r1, r3)
            throw r2
        L72:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "路线计算失败，通常是由于道路连通关系导致"
            r2.<init>(r0, r1, r3)
            throw r2
        L7a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "规划点（起点、终点、途经点）附近搜不到路"
            r2.<init>(r0, r1, r3)
            throw r2
        L82:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "规划点（包括起点、终点、途经点）不在中国陆地范围内"
            r2.<init>(r0, r1, r3)
            throw r2
        L8a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "其他未知错误"
            r2.<init>(r0, r1, r3)
            throw r2
        L92:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "请求协议非法"
            r2.<init>(r0, r1, r3)
            throw r2
        L9a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "缺少必填参数"
            r2.<init>(r0, r1, r3)
            throw r2
        La2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "请求参数非法"
            r2.<init>(r0, r1, r3)
            throw r2
        Laa:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "开发者删除了key，key被删除后无法正常使用"
            r2.<init>(r0, r1, r3)
            throw r2
        Lb2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "权限不足，服务请求被拒绝"
            r2.<init>(r0, r1, r3)
            throw r2
        Lba:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "服务不支持https请求"
            r2.<init>(r0, r1, r3)
            throw r2
        Lc2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "IP访问超限"
            r2.<init>(r0, r1, r3)
            throw r2
        Lca:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "请求key与绑定平台不符"
            r2.<init>(r0, r1, r3)
            throw r2
        Ld2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户MD5安全码未通过"
            r2.<init>(r0, r1, r3)
            throw r2
        Lda:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户签名未通过"
            r2.<init>(r0, r1, r3)
            throw r2
        Le2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户域名无效"
            r2.<init>(r0, r1, r3)
            throw r2
        Lea:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户IP无效"
            r2.<init>(r0, r1, r3)
            throw r2
        Lf2:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户访问过于频繁"
            r2.<init>(r0, r1, r3)
            throw r2
        Lfa:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "访问已超出日访问量"
            r2.<init>(r0, r1, r3)
            throw r2
        L102:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "请求服务不存在"
            r2.<init>(r0, r1, r3)
            throw r2
        L10a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "用户key不正确或过期"
            r2.<init>(r0, r1, r3)
            throw r2
        L112:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "App key未开通“附近”功能,请注册附近KEY"
            r2.<init>(r0, r1, r3)
            throw r2
        L11a:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "找不到对应的userid信息,请检查您提供的userid是否存在"
            r2.<init>(r0, r1, r3)
            throw r2
        L122:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "tableID格式不正确不存在"
            r2.<init>(r0, r1, r3)
            throw r2
        L12a:
            return
    }

    public static void i(java.lang.Throwable r1, java.lang.String r2, java.lang.String r3) {
            com.amap.api.col.s.g2 r0 = com.amap.api.col.s.g2.n()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L9
            r0.m(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        L9:
            r1.getClass()     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static boolean j(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static double k(java.util.List<com.amap.api.services.core.LatLonPoint> r19) {
            r0 = r19
            r1 = 0
            if (r0 == 0) goto L6e
            int r3 = r0.size()
            r4 = 3
            if (r3 >= r4) goto Le
            goto L6e
        Le:
            int r3 = r0.size()
            r4 = 0
        L13:
            if (r4 >= r3) goto L66
            java.lang.Object r5 = r0.get(r4)
            com.amap.api.services.core.LatLonPoint r5 = (com.amap.api.services.core.LatLonPoint) r5
            int r4 = r4 + 1
            int r6 = r4 % r3
            java.lang.Object r6 = r0.get(r6)
            com.amap.api.services.core.LatLonPoint r6 = (com.amap.api.services.core.LatLonPoint) r6
            double r7 = r5.getLongitude()
            r9 = 4682386230368406577(0x40fb2d77da4a0c31, double:111319.49079327357)
            double r7 = r7 * r9
            double r11 = r5.getLatitude()
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r11 = r11 * r13
            double r11 = java.lang.Math.cos(r11)
            double r7 = r7 * r11
            double r11 = r5.getLatitude()
            double r11 = r11 * r9
            double r15 = r6.getLongitude()
            double r15 = r15 * r9
            double r17 = r6.getLatitude()
            double r17 = r17 * r13
            double r13 = java.lang.Math.cos(r17)
            double r15 = r15 * r13
            double r5 = r6.getLatitude()
            double r5 = r5 * r9
            double r7 = r7 * r5
            double r15 = r15 * r11
            double r7 = r7 - r15
            double r1 = r1 + r7
            goto L13
        L66:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            double r0 = java.lang.Math.abs(r1)
            return r0
        L6e:
            return r1
    }

    public static void l(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "0"
            java.lang.String r1 = "status"
            java.lang.String r2 = "errcode"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5e
            r3.<init>(r4)     // Catch: org.json.JSONException -> L5e
            boolean r4 = r3.has(r2)     // Catch: org.json.JSONException -> L5e
            if (r4 == 0) goto L1f
            int r4 = r3.getInt(r2)     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "errmsg"
            java.lang.String r0 = r3.getString(r0)     // Catch: org.json.JSONException -> L5e
            h(r4, r0)     // Catch: org.json.JSONException -> L5e
            return
        L1f:
            boolean r4 = r3.has(r1)     // Catch: org.json.JSONException -> L5e
            if (r4 != 0) goto L26
            goto L5d
        L26:
            java.lang.String r4 = r3.getString(r1)     // Catch: org.json.JSONException -> L5e
            java.lang.String r1 = "1"
            boolean r1 = r4.equals(r1)     // Catch: org.json.JSONException -> L5e
            if (r1 == 0) goto L33
            goto L5d
        L33:
            boolean r1 = r4.equals(r0)     // Catch: org.json.JSONException -> L5e
            java.lang.String r2 = "infocode"
            if (r1 == 0) goto L4a
            boolean r1 = r3.has(r2)     // Catch: org.json.JSONException -> L5e
            if (r1 == 0) goto L42
            goto L4a
        L42:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "未知错误"
            r4.<init>(r0)     // Catch: org.json.JSONException -> L5e
            throw r4     // Catch: org.json.JSONException -> L5e
        L4a:
            int r1 = r3.getInt(r2)     // Catch: org.json.JSONException -> L5e
            boolean r4 = r4.equals(r0)     // Catch: org.json.JSONException -> L5e
            if (r4 == 0) goto L5d
            java.lang.String r4 = "info"
            java.lang.String r4 = r3.getString(r4)     // Catch: org.json.JSONException -> L5e
            h(r1, r4)     // Catch: org.json.JSONException -> L5e
        L5d:
            return
        L5e:
            r4 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "paseAuthFailurJson"
            i(r4, r0, r1)
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }

    public static void m(java.lang.String r4) throws com.amap.api.services.core.AMapException {
            java.lang.String r0 = "infocode"
            java.lang.String r1 = "status"
            java.lang.String r2 = "errcode"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            r3.<init>(r4)     // Catch: org.json.JSONException -> L6c
            boolean r4 = r3.has(r2)     // Catch: org.json.JSONException -> L6c
            if (r4 == 0) goto L1f
            int r4 = r3.getInt(r2)     // Catch: org.json.JSONException -> L6c
            java.lang.String r0 = "errmsg"
            java.lang.String r0 = r3.getString(r0)     // Catch: org.json.JSONException -> L6c
            h(r4, r0)     // Catch: org.json.JSONException -> L6c
            return
        L1f:
            boolean r4 = r3.has(r1)     // Catch: org.json.JSONException -> L6c
            if (r4 != 0) goto L26
            goto L50
        L26:
            int r4 = r3.optInt(r1)     // Catch: org.json.JSONException -> L6c
            if (r4 != 0) goto L48
            boolean r4 = r3.has(r0)     // Catch: org.json.JSONException -> L6c
            if (r4 == 0) goto L40
            int r4 = r3.getInt(r0)     // Catch: org.json.JSONException -> L6c
            java.lang.String r0 = "info"
            java.lang.String r0 = r3.getString(r0)     // Catch: org.json.JSONException -> L6c
            h(r4, r0)     // Catch: org.json.JSONException -> L6c
            goto L48
        L40:
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L6c
            java.lang.String r0 = "未知错误"
            r4.<init>(r0)     // Catch: org.json.JSONException -> L6c
            throw r4     // Catch: org.json.JSONException -> L6c
        L48:
            java.lang.String r4 = "code"
            int r4 = r3.optInt(r4)     // Catch: org.json.JSONException -> L6c
            if (r4 != 0) goto L51
        L50:
            return
        L51:
            java.lang.String r0 = "message"
            java.lang.String r0 = r3.optString(r0)     // Catch: org.json.JSONException -> L6c
            java.lang.String r1 = "1"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> L6c
            java.lang.String r4 = r1.concat(r4)     // Catch: org.json.JSONException -> L6c
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: org.json.JSONException -> L6c
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException     // Catch: org.json.JSONException -> L6c
            r2 = 2
            r1.<init>(r0, r2, r0, r4)     // Catch: org.json.JSONException -> L6c
            throw r1     // Catch: org.json.JSONException -> L6c
        L6c:
            r4 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "paseAuthFailurJson"
            i(r4, r0, r1)
            com.amap.api.services.core.AMapException r4 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "协议解析错误 - ProtocolException"
            r4.<init>(r0)
            throw r4
    }

    public static java.util.Date n(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L24
            java.lang.String r1 = r3.trim()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            goto L24
        L10:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "HHmm"
            r1.<init>(r2)
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L1c
            return r3
        L1c:
            r3 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "parseString2Time"
            i(r3, r1, r2)
        L24:
            return r0
    }

    public static java.util.Date o(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L24
            java.lang.String r1 = r3.trim()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L10
            goto L24
        L10:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "HH:mm"
            r1.<init>(r2)
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L1c
            return r3
        L1c:
            r3 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "parseTime"
            i(r3, r1, r2)
        L24:
            return r0
    }
}
