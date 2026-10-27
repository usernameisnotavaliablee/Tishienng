package com.amap.api.maps;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AMapUtils {
    private static final java.lang.String AMAPNAVIURL = "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d";
    private static final java.lang.String AMAPPOISEARCHURL = "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0";
    private static final java.lang.String AMAPROUTEURL = "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d";
    public static final int BUS_COMFORT = 4;
    public static final int BUS_MONEY_LITTLE = 1;
    public static final int BUS_NO_SUBWAY = 5;
    public static final int BUS_TIME_FIRST = 0;
    public static final int BUS_TRANSFER_LITTLE = 2;
    public static final int BUS_WALK_LITTLE = 3;
    private static final double DEG_TO_RAD = 0.017453292519943295d;
    private static final int DRING_ROUTE_MODEL = 2;
    public static final int DRIVING_AVOID_CONGESTION = 4;
    public static final int DRIVING_DEFAULT = 0;
    public static final int DRIVING_NO_HIGHWAY = 3;
    public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
    public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
    public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
    public static final int DRIVING_SAVE_MONEY = 1;
    public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
    public static final int DRIVING_SHORT_DISTANCE = 2;
    private static final double EARTHRADIUS = 6378137.0d;
    private static final double NF_PI = 0.01745329251994329d;
    private static final double R = 6378137.0d;
    private static final int TRANSIT_ROUTE_MODEL = 1;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends java.lang.Thread {
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        android.content.Context f4992b;

        public a(java.lang.String r1, android.content.Context r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                if (r2 == 0) goto L11
                android.content.Context r1 = r2.getApplicationContext()
                android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
                r0.f4992b = r1
            L11:
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r4 = this;
                android.content.Context r0 = r4.f4992b
                if (r0 == 0) goto L28
                com.amap.api.col.3l.p4$a r0 = new com.amap.api.col.3l.p4$a     // Catch: com.amap.api.col.p0003l.fk -> L28
                java.lang.String r1 = r4.a     // Catch: com.amap.api.col.p0003l.fk -> L28
                java.lang.String r2 = "10.0.600"
                java.lang.String r3 = com.amap.api.col.p0003l.ha.f3470c     // Catch: com.amap.api.col.p0003l.fk -> L28
                r0.<init>(r1, r2, r3)     // Catch: com.amap.api.col.p0003l.fk -> L28
                java.lang.String r1 = "com.amap.api.maps"
                java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: com.amap.api.col.p0003l.fk -> L28
                com.amap.api.col.3l.p4$a r0 = r0.b(r1)     // Catch: com.amap.api.col.p0003l.fk -> L28
                com.amap.api.col.3l.p4 r0 = r0.c()     // Catch: com.amap.api.col.p0003l.fk -> L28
                android.content.Context r1 = r4.f4992b     // Catch: com.amap.api.col.p0003l.fk -> L28
                java.lang.String r2 = ""
                r3 = 0
                com.amap.api.col.p0003l.g4.c(r1, r0, r2, r3)     // Catch: com.amap.api.col.p0003l.fk -> L28
                r4.interrupt()     // Catch: com.amap.api.col.p0003l.fk -> L28
            L28:
                return
        }
    }

    public AMapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(com.amap.api.maps.model.NaviPara r5, android.content.Context r6) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = com.amap.api.col.p0003l.f4.e(r6)
            com.amap.api.maps.model.LatLng r1 = r5.getTargetPoint()
            double r1 = r1.latitude
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.amap.api.maps.model.LatLng r2 = r5.getTargetPoint()
            double r2 = r2.longitude
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            int r5 = r5.getNaviStyle()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r1
            r6 = 2
            r3[r6] = r2
            r6 = 3
            r3[r6] = r5
            java.lang.String r5 = "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d"
            java.lang.String r5 = java.lang.String.format(r0, r5, r3)
            return r5
    }

    private static java.lang.String a(com.amap.api.maps.model.PoiPara r4, android.content.Context r5) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = com.amap.api.col.p0003l.f4.e(r5)
            java.lang.String r1 = r4.getKeywords()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            java.lang.String r5 = "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            com.amap.api.maps.model.LatLng r0 = r4.getCenter()
            if (r0 == 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "&lat="
            r0.append(r5)
            com.amap.api.maps.model.LatLng r5 = r4.getCenter()
            double r1 = r5.latitude
            r0.append(r1)
            java.lang.String r5 = "&lon="
            r0.append(r5)
            com.amap.api.maps.model.LatLng r4 = r4.getCenter()
            double r4 = r4.longitude
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L48:
            return r5
    }

    private static void a(com.amap.api.maps.model.RoutePara r2, android.content.Context r3, int r4) throws com.amap.api.maps.AMapException {
            boolean r0 = a(r2)
            if (r0 == 0) goto L3d
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r1 = 276824064(0x10800000, float:5.04871E-29)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = b(r2, r3, r4)     // Catch: java.lang.Throwable -> L35
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L35
            r0.setData(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "com.autonavi.minimap"
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> L35
            com.amap.api.maps.AMapUtils$a r2 = new com.amap.api.maps.AMapUtils$a     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "oan"
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L35
            r2.start()     // Catch: java.lang.Throwable -> L35
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "移动设备上未安装高德地图或高德地图版本较旧"
            r2.<init>(r3)
            throw r2
        L3d:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "非法参数"
            r2.<init>(r3)
            throw r2
    }

    private static boolean a(com.amap.api.maps.model.RoutePara r1) {
            com.amap.api.maps.model.LatLng r0 = r1.getStartPoint()
            if (r0 == 0) goto L37
            com.amap.api.maps.model.LatLng r0 = r1.getEndPoint()
            if (r0 == 0) goto L37
            java.lang.String r0 = r1.getStartName()
            if (r0 == 0) goto L37
            java.lang.String r0 = r1.getStartName()
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L37
            java.lang.String r0 = r1.getEndName()
            if (r0 == 0) goto L37
            java.lang.String r1 = r1.getEndName()
            java.lang.String r1 = r1.trim()
            int r1 = r1.length()
            if (r1 > 0) goto L35
            goto L37
        L35:
            r1 = 1
            return r1
        L37:
            r1 = 0
            return r1
    }

    private static java.lang.String b(com.amap.api.maps.model.RoutePara r10, android.content.Context r11, int r12) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r11 = com.amap.api.col.p0003l.f4.e(r11)
            com.amap.api.maps.model.LatLng r1 = r10.getStartPoint()
            double r1 = r1.latitude
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            com.amap.api.maps.model.LatLng r2 = r10.getStartPoint()
            double r2 = r2.longitude
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = r10.getStartName()
            com.amap.api.maps.model.LatLng r4 = r10.getEndPoint()
            double r4 = r4.latitude
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            com.amap.api.maps.model.LatLng r5 = r10.getEndPoint()
            double r5 = r5.longitude
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.String r6 = r10.getEndName()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r8 = 8
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r11
            r11 = 1
            r8[r11] = r1
            r1 = 2
            r8[r1] = r2
            r2 = 3
            r8[r2] = r3
            r2 = 4
            r8[r2] = r4
            r2 = 5
            r8[r2] = r5
            r2 = 6
            r8[r2] = r6
            r2 = 7
            r8[r2] = r7
            java.lang.String r2 = "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r8)
            java.lang.String r2 = "&m="
            if (r12 != r11) goto L77
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r2)
            int r10 = r10.getTransitRouteStyle()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L77:
            if (r12 != r1) goto L90
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r2)
            int r10 = r10.getDrivingRouteStyle()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            return r10
        L90:
            return r0
    }

    public static float calculateArea(com.amap.api.maps.model.LatLng r9, com.amap.api.maps.model.LatLng r10) {
            r0 = 0
            if (r9 == 0) goto L42
            if (r10 == 0) goto L42
            double r1 = r9.latitude     // Catch: java.lang.Throwable -> L41
            r3 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r1 = r1 * r3
            r5 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r1 = r1 / r5
            double r1 = java.lang.Math.sin(r1)     // Catch: java.lang.Throwable -> L41
            double r7 = r10.latitude     // Catch: java.lang.Throwable -> L41
            double r7 = r7 * r3
            double r7 = r7 / r5
            double r3 = java.lang.Math.sin(r7)     // Catch: java.lang.Throwable -> L41
            double r1 = r1 - r3
            double r3 = r10.longitude     // Catch: java.lang.Throwable -> L41
            double r9 = r9.longitude     // Catch: java.lang.Throwable -> L41
            double r3 = r3 - r9
            r9 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r3 = r3 / r9
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L36
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r9
        L36:
            r9 = 4822527327953393201(0x42ed0f0dce469631, double:2.5560394669790553E14)
            double r1 = r1 * r9
            double r1 = r1 * r3
            float r9 = (float) r1
            return r9
        L41:
            return r0
        L42:
            com.amap.api.maps.AMapException r9 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L4a
            java.lang.String r10 = "非法坐标值"
            r9.<init>(r10)     // Catch: com.amap.api.maps.AMapException -> L4a
            throw r9     // Catch: com.amap.api.maps.AMapException -> L4a
        L4a:
            return r0
    }

    public static float calculateArea(java.util.List<com.amap.api.maps.model.LatLng> r19) {
            r0 = r19
            if (r0 == 0) goto L66
            int r1 = r0.size()
            r2 = 3
            if (r1 >= r2) goto Lc
            goto L66
        Lc:
            int r1 = r0.size()
            r2 = 0
            r4 = 0
        L13:
            if (r4 >= r1) goto L5d
            java.lang.Object r5 = r0.get(r4)
            com.amap.api.maps.model.LatLng r5 = (com.amap.api.maps.model.LatLng) r5
            int r4 = r4 + 1
            int r6 = r4 % r1
            java.lang.Object r6 = r0.get(r6)
            com.amap.api.maps.model.LatLng r6 = (com.amap.api.maps.model.LatLng) r6
            double r7 = r5.longitude
            r9 = 4682386230368406577(0x40fb2d77da4a0c31, double:111319.49079327357)
            double r7 = r7 * r9
            double r11 = r5.latitude
            r13 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r11 = r11 * r13
            double r11 = java.lang.Math.cos(r11)
            double r7 = r7 * r11
            double r11 = r5.latitude
            double r11 = r11 * r9
            r15 = r9
            double r9 = r6.longitude
            double r9 = r9 * r15
            r17 = r13
            double r13 = r6.latitude
            double r13 = r13 * r17
            double r13 = java.lang.Math.cos(r13)
            double r9 = r9 * r13
            double r5 = r6.latitude
            double r5 = r5 * r15
            double r7 = r7 * r5
            double r9 = r9 * r11
            double r7 = r7 - r9
            double r2 = r2 + r7
            goto L13
        L5d:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r0
            float r0 = (float) r2
            float r0 = java.lang.Math.abs(r0)
            return r0
        L66:
            r0 = 0
            return r0
    }

    public static float calculateLineDistance(com.amap.api.maps.model.LatLng r18, com.amap.api.maps.model.LatLng r19) {
            r0 = r18
            r1 = r19
            r2 = 0
            if (r0 == 0) goto L8d
            if (r1 == 0) goto L8d
            double r3 = r0.longitude     // Catch: java.lang.Throwable -> L8c
            double r5 = r0.latitude     // Catch: java.lang.Throwable -> L8c
            double r7 = r1.longitude     // Catch: java.lang.Throwable -> L8c
            double r0 = r1.latitude     // Catch: java.lang.Throwable -> L8c
            r9 = 4580687790476533047(0x3f91df46a2529d37, double:0.01745329251994329)
            double r3 = r3 * r9
            double r5 = r5 * r9
            double r7 = r7 * r9
            double r0 = r0 * r9
            double r9 = java.lang.Math.sin(r3)     // Catch: java.lang.Throwable -> L8c
            double r11 = java.lang.Math.sin(r5)     // Catch: java.lang.Throwable -> L8c
            double r3 = java.lang.Math.cos(r3)     // Catch: java.lang.Throwable -> L8c
            double r5 = java.lang.Math.cos(r5)     // Catch: java.lang.Throwable -> L8c
            double r13 = java.lang.Math.sin(r7)     // Catch: java.lang.Throwable -> L8c
            double r15 = java.lang.Math.sin(r0)     // Catch: java.lang.Throwable -> L8c
            double r7 = java.lang.Math.cos(r7)     // Catch: java.lang.Throwable -> L8c
            double r0 = java.lang.Math.cos(r0)     // Catch: java.lang.Throwable -> L8c
            double r3 = r3 * r5
            double r5 = r5 * r9
            r9 = 3
            double[] r10 = new double[r9]     // Catch: java.lang.Throwable -> L8c
            r17 = 0
            r10[r17] = r3     // Catch: java.lang.Throwable -> L8c
            r3 = 1
            r10[r3] = r5     // Catch: java.lang.Throwable -> L8c
            r4 = 2
            r10[r4] = r11     // Catch: java.lang.Throwable -> L8c
            double r7 = r7 * r0
            double r0 = r0 * r13
            double[] r5 = new double[r9]     // Catch: java.lang.Throwable -> L8c
            r5[r17] = r7     // Catch: java.lang.Throwable -> L8c
            r5[r3] = r0     // Catch: java.lang.Throwable -> L8c
            r5[r4] = r15     // Catch: java.lang.Throwable -> L8c
            r0 = r10[r17]     // Catch: java.lang.Throwable -> L8c
            r6 = r5[r17]     // Catch: java.lang.Throwable -> L8c
            double r8 = r0 - r6
            double r0 = r0 - r6
            double r8 = r8 * r0
            r0 = r10[r3]     // Catch: java.lang.Throwable -> L8c
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L8c
            double r11 = r0 - r6
            double r0 = r0 - r6
            double r11 = r11 * r0
            double r8 = r8 + r11
            r0 = r10[r4]     // Catch: java.lang.Throwable -> L8c
            r3 = r5[r4]     // Catch: java.lang.Throwable -> L8c
            double r5 = r0 - r3
            double r0 = r0 - r3
            double r5 = r5 * r0
            double r8 = r8 + r5
            double r0 = java.lang.Math.sqrt(r8)     // Catch: java.lang.Throwable -> L8c
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r3
            double r0 = java.lang.Math.asin(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 4713102420611050193(0x41684dae328e2ad1, double:1.27420015798544E7)
            double r0 = r0 * r2
            float r0 = (float) r0
            return r0
        L8c:
            return r2
        L8d:
            com.amap.api.maps.AMapException r0 = new com.amap.api.maps.AMapException     // Catch: com.amap.api.maps.AMapException -> L95
            java.lang.String r1 = "非法坐标值"
            r0.<init>(r1)     // Catch: com.amap.api.maps.AMapException -> L95
            throw r0     // Catch: com.amap.api.maps.AMapException -> L95
        L95:
            return r2
    }

    public static void getLatestAMapApp(android.content.Context r3) {
            java.lang.String r0 = "http://wap.amap.com/"
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27
            r2 = 276824064(0x10800000, float:5.04871E-29)
            r1.addFlags(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L27
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L27
            r1.setData(r0)     // Catch: java.lang.Throwable -> L27
            com.amap.api.maps.AMapUtils$a r0 = new com.amap.api.maps.AMapUtils$a     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "glaa"
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L27
            r0.start()     // Catch: java.lang.Throwable -> L27
            r3.startActivity(r1)     // Catch: java.lang.Throwable -> L27
        L27:
            return
    }

    public static void openAMapDrivingRoute(com.amap.api.maps.model.RoutePara r1, android.content.Context r2) throws com.amap.api.maps.AMapException {
            r0 = 2
            a(r1, r2, r0)
            return
    }

    public static void openAMapNavi(com.amap.api.maps.model.NaviPara r2, android.content.Context r3) throws com.amap.api.maps.AMapException {
            com.amap.api.maps.model.LatLng r0 = r2.getTargetPoint()
            if (r0 == 0) goto L3d
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r1 = 276824064(0x10800000, float:5.04871E-29)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L35
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L35
            r0.setData(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "com.autonavi.minimap"
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> L35
            com.amap.api.maps.AMapUtils$a r2 = new com.amap.api.maps.AMapUtils$a     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "oan"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L35
            r2.start()     // Catch: java.lang.Throwable -> L35
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "移动设备上未安装高德地图或高德地图版本较旧"
            r2.<init>(r3)
            throw r2
        L3d:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "非法参数"
            r2.<init>(r3)
            throw r2
    }

    public static void openAMapPoiNearbySearch(com.amap.api.maps.model.PoiPara r2, android.content.Context r3) throws com.amap.api.maps.AMapException {
            java.lang.String r0 = r2.getKeywords()
            if (r0 == 0) goto L4b
            java.lang.String r0 = r2.getKeywords()
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L4b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r1 = 276824064(0x10800000, float:5.04871E-29)
            r0.addFlags(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L43
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L43
            r0.setData(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "com.autonavi.minimap"
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> L43
            com.amap.api.maps.AMapUtils$a r2 = new com.amap.api.maps.AMapUtils$a     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "oan"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L43
            r2.start()     // Catch: java.lang.Throwable -> L43
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "移动设备上未安装高德地图或高德地图版本较旧"
            r2.<init>(r3)
            throw r2
        L4b:
            com.amap.api.maps.AMapException r2 = new com.amap.api.maps.AMapException
            java.lang.String r3 = "非法参数"
            r2.<init>(r3)
            throw r2
    }

    public static void openAMapTransitRoute(com.amap.api.maps.model.RoutePara r1, android.content.Context r2) throws com.amap.api.maps.AMapException {
            r0 = 1
            a(r1, r2, r0)
            return
    }

    public static void openAMapWalkingRoute(com.amap.api.maps.model.RoutePara r1, android.content.Context r2) throws com.amap.api.maps.AMapException {
            r0 = 4
            a(r1, r2, r0)
            return
    }
}
