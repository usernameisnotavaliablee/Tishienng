package com.autonavi.aps.amapapi.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b {
    public static java.lang.String a = "5.3";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f5847b = null;

    /* renamed from: c, reason: collision with root package name */
    static java.lang.String f5848c;

    /* renamed from: d, reason: collision with root package name */
    static java.lang.String f5849d;

    /* renamed from: e, reason: collision with root package name */
    static java.lang.String f5850e;

    /* renamed from: f, reason: collision with root package name */
    static java.lang.String f5851f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f5852g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f5853h;

    /* renamed from: i, reason: collision with root package name */
    public static int f5854i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f5855j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f5856k;
    static java.lang.String l;
    static java.util.HashMap<java.lang.String, java.lang.String> m;
    static boolean n;
    static boolean o;
    private static final java.lang.String[] p = null;
    private static com.amap.api.col.p0003l.p4 q;
    private static boolean r;
    private static boolean s;

    static {
            java.lang.String r0 = "5.1"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.autonavi.aps.amapapi.utils.b.f5847b = r0
            java.lang.String r0 = "http://apilocate.amap.com/mobile/binary"
            com.autonavi.aps.amapapi.utils.b.f5848c = r0
            java.lang.String r0 = "http://dualstack-a.apilocate.amap.com/mobile/binary"
            com.autonavi.aps.amapapi.utils.b.f5849d = r0
            java.lang.String r0 = ""
            com.autonavi.aps.amapapi.utils.b.f5850e = r0
            java.lang.String r0 = "com.loc"
            java.lang.String r1 = "com.amap.api.fence"
            java.lang.String r2 = "com.amap.api.location"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.autonavi.aps.amapapi.utils.b.p = r0
            java.lang.String r0 = "11G;11K;13J;13S;15O;15U;17J;17Y;197;1A6"
            com.autonavi.aps.amapapi.utils.b.f5851f = r0
            r0 = 0
            com.autonavi.aps.amapapi.utils.b.f5852g = r0
            com.autonavi.aps.amapapi.utils.b.f5853h = r0
            r1 = 30000(0x7530, float:4.2039E-41)
            com.autonavi.aps.amapapi.utils.b.f5854i = r1
            com.autonavi.aps.amapapi.utils.b.f5855j = r0
            com.autonavi.aps.amapapi.utils.b.f5856k = r0
            com.autonavi.aps.amapapi.utils.b.q = r0
            r0 = 0
            com.autonavi.aps.amapapi.utils.b.r = r0
            com.autonavi.aps.amapapi.utils.b.s = r0
            com.autonavi.aps.amapapi.utils.b.n = r0
            com.autonavi.aps.amapapi.utils.b.o = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Bundle a(com.amap.api.location.AMapLocationClientOption r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r3 != 0) goto Lc
            com.amap.api.location.AMapLocationClientOption r3 = new com.amap.api.location.AMapLocationClientOption
            r3.<init>()
        Lc:
            java.lang.String r1 = "opt"
            r0.putParcelable(r1, r3)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r3 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "getOptionBundle"
            a(r3, r1, r2)
            return r0
    }

    public static com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r5, com.amap.api.location.AMapLocation r6) {
            if (r6 != 0) goto L4
            goto Lb2
        L4:
            java.lang.String r0 = r6.getCountry()     // Catch: java.lang.Throwable -> Lb2
            r5.setCountry(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getRoad()     // Catch: java.lang.Throwable -> Lb2
            r5.setRoad(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getPoiName()     // Catch: java.lang.Throwable -> Lb2
            r5.setPoiName(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getStreet()     // Catch: java.lang.Throwable -> Lb2
            r5.setStreet(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getStreetNum()     // Catch: java.lang.Throwable -> Lb2
            r5.setNumber(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getCityCode()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = r6.getAdCode()     // Catch: java.lang.Throwable -> Lb2
            r5.setCityCode(r0)     // Catch: java.lang.Throwable -> Lb2
            r5.setAdCode(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getCity()     // Catch: java.lang.Throwable -> Lb2
            r5.setCity(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getDistrict()     // Catch: java.lang.Throwable -> Lb2
            r5.setDistrict(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getProvince()     // Catch: java.lang.Throwable -> Lb2
            r5.setProvince(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getAoiName()     // Catch: java.lang.Throwable -> Lb2
            r5.setAoiName(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getAddress()     // Catch: java.lang.Throwable -> Lb2
            r5.setAddress(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r6.getDescription()     // Catch: java.lang.Throwable -> Lb2
            r5.setDescription(r0)     // Catch: java.lang.Throwable -> Lb2
            android.os.Bundle r0 = r5.getExtras()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "adcode"
            java.lang.String r2 = "citycode"
            java.lang.String r3 = "desc"
            if (r0 == 0) goto L91
            android.os.Bundle r0 = r5.getExtras()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = r6.getCityCode()     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r2, r4)     // Catch: java.lang.Throwable -> Lb2
            android.os.Bundle r0 = r5.getExtras()     // Catch: java.lang.Throwable -> Lb2
            android.os.Bundle r2 = r6.getExtras()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r3, r2)     // Catch: java.lang.Throwable -> Lb2
            android.os.Bundle r0 = r5.getExtras()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r6.getAdCode()     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r1, r6)     // Catch: java.lang.Throwable -> Lb2
            return r5
        L91:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = r6.getCityCode()     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r2, r4)     // Catch: java.lang.Throwable -> Lb2
            android.os.Bundle r2 = r6.getExtras()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r3, r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r6.getAdCode()     // Catch: java.lang.Throwable -> Lb2
            r0.putString(r1, r6)     // Catch: java.lang.Throwable -> Lb2
            r5.setExtras(r0)     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            return r5
    }

    public static com.amap.api.location.AMapLocationClientOption a(android.os.Bundle r3) {
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            if (r3 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.amap.api.location.AMapLocationClientOption> r1 = com.amap.api.location.AMapLocationClientOption.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L1a
            r3.setClassLoader(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "opt"
            android.os.Parcelable r3 = r3.getParcelable(r1)     // Catch: java.lang.Throwable -> L1a
            com.amap.api.location.AMapLocationClientOption r3 = (com.amap.api.location.AMapLocationClientOption) r3     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "getOptionFromBundle"
            a(r3, r1, r2)
            return r0
    }

    public static java.lang.String a() {
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5848c
            return r0
    }

    public static void a(android.content.Context r2) {
            boolean r0 = com.amap.api.col.p0003l.q4.s(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Lb
            java.lang.String r2 = "http://abroad.apilocate.amap.com/mobile/binary"
            com.autonavi.aps.amapapi.utils.b.f5848c = r2     // Catch: java.lang.Throwable -> L1c
            return
        Lb:
            f()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = com.amap.api.col.p0003l.f4.j(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = com.autonavi.aps.amapapi.security.a.a(r2)     // Catch: java.lang.Throwable -> L1c
            com.autonavi.aps.amapapi.utils.b.l = r2     // Catch: java.lang.Throwable -> L1c
            a(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r2 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "checkUrl"
            a(r2, r0, r1)
            return
    }

    public static void a(com.amap.api.location.AMapLocation r12, org.json.JSONObject r13) {
            java.lang.String r0 = "coordType"
            java.lang.String r1 = "desc"
            java.lang.String r2 = "citycode"
            java.lang.String r3 = "adcode"
            if (r13 == 0) goto L1d1
            java.lang.String r4 = "lat"
            double r5 = r12.getLatitude()     // Catch: java.lang.Throwable -> L1c9
            double r4 = r13.optDouble(r4, r5)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r6 = "lon"
            double r7 = r12.getLongitude()     // Catch: java.lang.Throwable -> L1c9
            double r6 = r13.optDouble(r6, r7)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = "provider"
            java.lang.String r9 = r12.getProvider()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = r13.optString(r8, r9)     // Catch: java.lang.Throwable -> L1c9
            r12.setProvider(r8)     // Catch: java.lang.Throwable -> L1c9
            r12.setLatitude(r4)     // Catch: java.lang.Throwable -> L1c9
            r12.setLongitude(r6)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = "altitude"
            double r9 = r12.getAltitude()     // Catch: java.lang.Throwable -> L1c9
            double r8 = r13.optDouble(r8, r9)     // Catch: java.lang.Throwable -> L1c9
            r12.setAltitude(r8)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = "accuracy"
            java.lang.String r8 = r13.optString(r8)     // Catch: java.lang.Throwable -> L51
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L51
            if (r9 != 0) goto L51
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L51
            r12.setAccuracy(r8)     // Catch: java.lang.Throwable -> L51
        L51:
            java.lang.String r8 = "speed"
            java.lang.String r8 = r13.optString(r8)     // Catch: java.lang.Throwable -> L64
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L64
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L64
            r12.setSpeed(r8)     // Catch: java.lang.Throwable -> L64
        L64:
            java.lang.String r8 = "bearing"
            java.lang.String r8 = r13.optString(r8)     // Catch: java.lang.Throwable -> L77
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L77
            if (r9 != 0) goto L77
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L77
            r12.setBearing(r8)     // Catch: java.lang.Throwable -> L77
        L77:
            java.lang.String r8 = r12.getAdCode()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = r13.optString(r3, r8)     // Catch: java.lang.Throwable -> L1c9
            r12.setAdCode(r8)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = r12.getCityCode()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = r13.optString(r2, r8)     // Catch: java.lang.Throwable -> L1c9
            r12.setCityCode(r8)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = "address"
            java.lang.String r9 = r12.getAddress()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = r13.optString(r8, r9)     // Catch: java.lang.Throwable -> L1c9
            r12.setAddress(r8)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r8 = ""
            java.lang.String r8 = r13.optString(r1, r8)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "country"
            java.lang.String r10 = r12.getCountry()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setCountry(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "province"
            java.lang.String r10 = r12.getProvince()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setProvince(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "city"
            java.lang.String r10 = r12.getCity()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setCity(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "district"
            java.lang.String r10 = r12.getDistrict()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setDistrict(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "road"
            java.lang.String r10 = r12.getRoad()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setRoad(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "street"
            java.lang.String r10 = r12.getStreet()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setStreet(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "number"
            java.lang.String r10 = r12.getStreetNum()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setNumber(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "poiname"
            java.lang.String r10 = r12.getPoiName()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setPoiName(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "aoiname"
            java.lang.String r10 = r12.getAoiName()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setAoiName(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "errorCode"
            int r10 = r12.getErrorCode()     // Catch: java.lang.Throwable -> L1c9
            int r9 = r13.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setErrorCode(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "errorInfo"
            java.lang.String r10 = r12.getErrorInfo()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setErrorInfo(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "locationType"
            int r10 = r12.getLocationType()     // Catch: java.lang.Throwable -> L1c9
            int r9 = r13.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setLocationType(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "locationDetail"
            java.lang.String r10 = r12.getLocationDetail()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = r13.optString(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setLocationDetail(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "time"
            long r10 = r12.getTime()     // Catch: java.lang.Throwable -> L1c9
            long r9 = r13.optLong(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setTime(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r9 = "isOffset"
            boolean r10 = r12.isOffset()     // Catch: java.lang.Throwable -> L1c9
            boolean r9 = r13.optBoolean(r9, r10)     // Catch: java.lang.Throwable -> L1c9
            r12.setOffset(r9)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = "poiid"
            java.lang.String r11 = r12.getBuildingId()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = r13.optString(r10, r11)     // Catch: java.lang.Throwable -> L1c9
            r12.setBuildingId(r10)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = "floor"
            java.lang.String r11 = r12.getFloor()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = r13.optString(r10, r11)     // Catch: java.lang.Throwable -> L1c9
            r12.setFloor(r10)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = "description"
            java.lang.String r11 = r12.getDescription()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = r13.optString(r10, r11)     // Catch: java.lang.Throwable -> L1c9
            r12.setDescription(r10)     // Catch: java.lang.Throwable -> L1c9
            boolean r10 = r13.has(r0)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r11 = "GCJ02"
            if (r10 == 0) goto L19a
            java.lang.String r13 = r13.optString(r0, r11)     // Catch: java.lang.Throwable -> L1c9
            r12.setCoordType(r13)     // Catch: java.lang.Throwable -> L1c9
            goto L1ab
        L19a:
            boolean r13 = a(r4, r6)     // Catch: java.lang.Throwable -> L1c9
            if (r13 == 0) goto L1a6
            if (r9 == 0) goto L1a6
            r12.setCoordType(r11)     // Catch: java.lang.Throwable -> L1c9
            goto L1ab
        L1a6:
            java.lang.String r13 = "WGS84"
            r12.setCoordType(r13)     // Catch: java.lang.Throwable -> L1c9
        L1ab:
            android.os.Bundle r13 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1c9
            r13.<init>()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = r12.getCityCode()     // Catch: java.lang.Throwable -> L1c9
            r13.putString(r2, r0)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L1c9
            r13.putString(r1, r0)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = r12.getAdCode()     // Catch: java.lang.Throwable -> L1c9
            r13.putString(r3, r0)     // Catch: java.lang.Throwable -> L1c9
            r12.setExtras(r13)     // Catch: java.lang.Throwable -> L1c9
            goto L1d1
        L1c9:
            r12 = move-exception
            java.lang.String r13 = "CoreUtil"
            java.lang.String r0 = "transformLocation"
            a(r12, r13, r0)
        L1d1:
            return
    }

    private static void a(java.lang.String r2) {
            if (r2 == 0) goto L53
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L9
            goto L53
        L9:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto Le
            goto L53
        Le:
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L15
            goto L53
        L15:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L35
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L4b
            if (r1 <= 0) goto L35
            byte[] r0 = b(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L4b
            byte[] r2 = com.autonavi.aps.amapapi.security.a.b(r0, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "utf-8"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4b
            goto L36
        L35:
            r1 = 0
        L36:
            if (r1 == 0) goto L53
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L4b
            if (r2 <= 0) goto L53
            java.lang.String r2 = "http:"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L53
            com.autonavi.aps.amapapi.utils.b.f5850e = r1     // Catch: java.lang.Throwable -> L4b
            com.autonavi.aps.amapapi.utils.b.f5848c = r1     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            r2 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "checkUrl"
            a(r2, r0, r1)
        L53:
            return
    }

    public static void a(java.lang.Throwable r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "reportError"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r1 instanceof com.amap.api.col.p0003l.fk
            if (r0 == 0) goto Le
            return
        Le:
            com.amap.api.col.p0003l.w5.p(r1, r2, r3)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public static boolean a(double r4, double r6) {
            r0 = 4634837335261839360(0x4052400000000000, double:73.0)
            double r6 = r6 - r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r6 = r6 / r0
            int r6 = (int) r6
            r2 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r4 = r4 - r2
            double r4 = r4 / r0
            int r4 = (int) r4
            r5 = 0
            if (r4 < 0) goto L36
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r7) goto L36
            if (r6 < 0) goto L36
            r7 = 124(0x7c, float:1.74E-43)
            if (r6 < r7) goto L1d
            goto L36
        L1d:
            int r4 = r4 * 124
            int r4 = r4 + r6
            r6 = 1
            java.lang.String r7 = "00000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000001011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011101010111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000110111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111101111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000110111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011010111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110011100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000110000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001010011100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111100110001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111110011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111100000000000010111110100000011000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111110000000001111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111000000111111111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111101111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000101111111111111111111111111111111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000011110000000001111111111111111111111111111111111111111111110000000000000000000000000000000000000000000000000000000000011000011111100000000111111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000000001111111100111111111100110111111111111111111111111111111111111111111111110000000000000000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000000101111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111011111000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100100000000000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100011100000000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000111110000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110011111110000000000000000000000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110111111110000000000000000000000111011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000011111111111111111111111111111111111111111111111100001111111111111111111111111111111111111111111111111010000000000000000000000111111111111111111111111111111111111111111110000000000000001111111111111111111111111111111111111111111100000000000000000000011111111111111111111111111111111100000000000000000000000000001111111111111111111111111111111111111111110000000000000000000001111111111111111111111111111111100000000000000000000000000000001111111111111111111111111111111111111111000000000000000000000111111111111111111111111111111110000000000000000000000000000001111111111111111111111111111111111111111100000000000000000000111111111111111111111111111111000000000000000000000000000000000111111111111111111111111111111111111111111000000000000000000001111111111111111111111111110000000000000000000000000000000000001110011111111111111111111111111111111111111100000000000000000000011111111111111111100000000000000000000000000000000000000000000000001111111111111111111111111111111111111000000000000000000001111111111111111111000000000000000000000000000000000000000000000000011111111111111111111111111111111111100000000000000000000011111111111111111100000000000000000000000000000000000000000000000000011111111111111111111111111111111111000000000000000000001111111111111111100000000000000000000000000000000000000000000000000000000111111111111111111111111111111110000000000000000000000000111111111100000000000000000000000000000000000000000000000000111111111111111111111111111111111111111000000000000000000000000011111111100000000000000000000000000000000000000000000000000011111111111111111111111111111110001111100000000000000000000000000111110000000000000000000000000000000000000000000000000000001111111111111111111111111111111000000000000000000000000000000000001110000000000000000000000000000000000000000000000000000000011111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001111111111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010110000000000000000000000"
            char r4 = r7.charAt(r4)     // Catch: java.lang.Throwable -> L2d
            r7 = 49
            if (r4 != r7) goto L2c
            return r6
        L2c:
            return r5
        L2d:
            r4 = move-exception
            java.lang.String r5 = "CoreUtil"
            java.lang.String r7 = "isChina"
            a(r4, r5, r7)
            return r6
        L36:
            return r5
    }

    private static boolean a(double r5, double r7, double r9, double r11, double r13, double r15) {
            double r0 = b(r5, r7, r9, r11, r13, r15)
            double r0 = java.lang.Math.abs(r0)
            r2 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L27
            double r9 = r5 - r9
            double r5 = r5 - r13
            double r9 = r9 * r5
            r5 = 0
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 > 0) goto L27
            double r9 = r7 - r11
            double r7 = r7 - r15
            double r9 = r9 * r7
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L27
            r5 = 1
            return r5
        L27:
            r5 = 0
            return r5
    }

    private static boolean a(double r16, double r18, double r20, double r22, double r24, double r26, double r28) {
            double r0 = r20 - r16
            double r2 = r28 - r26
            double r4 = r0 * r2
            double r6 = r22 - r18
            r8 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r8 = r8 - r24
            double r10 = r6 * r8
            double r4 = r4 - r10
            r10 = 0
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L3c
            double r12 = r18 - r26
            double r8 = r8 * r12
            double r14 = r16 - r24
            double r2 = r2 * r14
            double r8 = r8 - r2
            double r8 = r8 / r4
            double r12 = r12 * r0
            double r14 = r14 * r6
            double r12 = r12 - r14
            double r12 = r12 / r4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L3c
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L3c
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 < 0) goto L3c
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L3c
            r0 = 1
            return r0
        L3c:
            r0 = 0
            return r0
    }

    public static boolean a(com.amap.api.location.DPoint r30, java.util.List<com.amap.api.location.DPoint> r31) {
            r0 = r31
            double r5 = r30.getLongitude()
            double r7 = r30.getLatitude()
            double r13 = r30.getLatitude()
            r15 = 0
            java.lang.Object r1 = r0.get(r15)
            com.amap.api.location.DPoint r1 = (com.amap.api.location.DPoint) r1
            int r2 = r0.size()
            r16 = 1
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2e
            java.lang.Object r1 = r0.get(r15)
            r0.add(r1)
        L2e:
            r1 = 0
            r17 = 0
        L31:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto Ld7
            java.lang.Object r2 = r0.get(r1)
            com.amap.api.location.DPoint r2 = (com.amap.api.location.DPoint) r2
            double r2 = r2.getLongitude()
            java.lang.Object r4 = r0.get(r1)
            com.amap.api.location.DPoint r4 = (com.amap.api.location.DPoint) r4
            double r9 = r4.getLatitude()
            int r1 = r1 + 1
            java.lang.Object r4 = r0.get(r1)
            com.amap.api.location.DPoint r4 = (com.amap.api.location.DPoint) r4
            double r11 = r4.getLongitude()
            java.lang.Object r4 = r0.get(r1)
            com.amap.api.location.DPoint r4 = (com.amap.api.location.DPoint) r4
            double r18 = r4.getLatitude()
            r26 = r18
            r18 = r1
            r28 = r5
            r5 = r2
            r1 = r28
            r3 = r7
            r7 = r9
            r9 = r11
            r11 = r26
            boolean r19 = a(r1, r3, r5, r7, r9, r11)
            r20 = r5
            r5 = r1
            r1 = r20
            r20 = r7
            r7 = r3
            r3 = r20
            r20 = r9
            r22 = r11
            if (r19 == 0) goto L86
            return r16
        L86:
            double r9 = r22 - r3
            double r9 = java.lang.Math.abs(r9)
            r11 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            int r19 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r19 < 0) goto Ld1
            r9 = 4640537203540230144(0x4066800000000000, double:180.0)
            r11 = r13
            boolean r9 = a(r1, r3, r5, r7, r9, r11)
            r13 = r1
            r24 = r3
            if (r9 == 0) goto Lab
            int r1 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r1 <= 0) goto Ld2
        La8:
            int r17 = r17 + 1
            goto Ld2
        Lab:
            r9 = 4640537203540230144(0x4066800000000000, double:180.0)
            r1 = r20
            r3 = r22
            boolean r9 = a(r1, r3, r5, r7, r9, r11)
            if (r9 == 0) goto Lbf
            int r1 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r1 <= 0) goto Ld2
            goto La8
        Lbf:
            r9 = r5
            r5 = r1
            r1 = r13
            r13 = r11
            r11 = r7
            r7 = r3
            r3 = r24
            boolean r1 = a(r1, r3, r5, r7, r9, r11, r13)
            r5 = r9
            r7 = r11
            r11 = r13
            if (r1 == 0) goto Ld2
            goto La8
        Ld1:
            r11 = r13
        Ld2:
            r13 = r11
            r1 = r18
            goto L31
        Ld7:
            int r17 = r17 % 2
            if (r17 == 0) goto Ldc
            return r16
        Ldc:
            return r15
    }

    private static double b(double r0, double r2, double r4, double r6, double r8, double r10) {
            double r4 = r4 - r0
            double r10 = r10 - r2
            double r4 = r4 * r10
            double r8 = r8 - r0
            double r6 = r6 - r2
            double r8 = r8 * r6
            double r4 = r4 - r8
            return r4
    }

    public static java.lang.String b() {
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5849d
            return r0
    }

    public static java.lang.String b(android.content.Context r0) {
            java.lang.String r0 = com.amap.api.col.p0003l.f4.i(r0)
            java.lang.String r0 = com.amap.api.col.p0003l.m4.d(r0)
            return r0
    }

    private static byte[] b(java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto L2f
            int r1 = r5.length()
            r2 = 2
            if (r1 >= r2) goto Lb
            goto L2f
        Lb:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r1)
            int r1 = r5.length()
            int r1 = r1 / r2
            byte[] r2 = new byte[r1]
        L18:
            if (r0 >= r1) goto L2e
            int r3 = r0 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r5.substring(r3, r4)
            int r3 = com.autonavi.aps.amapapi.utils.j.f(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r0] = r3
            int r0 = r0 + 1
            goto L18
        L2e:
            return r2
        L2f:
            byte[] r5 = new byte[r0]
            return r5
    }

    public static com.amap.api.col.p0003l.p4 c() {
            java.lang.String r0 = "6.4.3"
            com.amap.api.col.3l.p4 r1 = com.autonavi.aps.amapapi.utils.b.q     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L2a
            com.amap.api.col.3l.p4$a r1 = new com.amap.api.col.3l.p4$a     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "loc"
            java.lang.String r3 = "AMAP_Location_SDK_Android 6.4.3"
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r2 = e()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.3l.p4$a r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.3l.p4$a r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.3l.p4 r0 = r0.c()     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.utils.b.q = r0     // Catch: java.lang.Throwable -> L22
            goto L2a
        L22:
            r0 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "getSDKInfo"
            a(r0, r1, r2)
        L2a:
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.q
            return r0
    }

    public static void c(android.content.Context r2) {
            java.lang.String r0 = "http://abroad.apilocate.amap.com/mobile/binary"
            boolean r2 = com.amap.api.col.p0003l.q4.s(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Ld
            com.autonavi.aps.amapapi.utils.b.f5848c = r0     // Catch: java.lang.Throwable -> L16
            com.autonavi.aps.amapapi.utils.b.f5849d = r0     // Catch: java.lang.Throwable -> L16
            return
        Ld:
            java.lang.String r2 = "http://apilocate.amap.com/mobile/binary"
            com.autonavi.aps.amapapi.utils.b.f5848c = r2     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "http://dualstack-a.apilocate.amap.com/mobile/binary"
            com.autonavi.aps.amapapi.utils.b.f5849d = r2     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r2 = move-exception
            java.lang.String r0 = "CoreUtil"
            java.lang.String r1 = "changeUrl"
            a(r2, r0, r1)
            return
    }

    public static java.lang.String d() {
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5851f
            return r0
    }

    private static java.lang.String[] e() {
            java.lang.String[] r0 = com.autonavi.aps.amapapi.utils.b.p
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    private static void f() {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Ld
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e
            r1 = 16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            com.autonavi.aps.amapapi.utils.b.m = r0     // Catch: java.lang.Throwable -> L2e
        Ld:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L2e
            r0.clear()     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "fe643c382e5c3b3962141f1a2e815a78"
            java.lang.String r2 = "FB923EE67A8B4032DAA517DD8CD7A26FF7C25B0C3663F92A0B61251C4FFFA858DF169D61321C3E7919CB67DF8EFEC827"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "9a571aa113ad987d626c0457828962e6"
            java.lang.String r2 = "D2FF99A88BEB04683D89470D4FA72B1749DA456AB0D0F1A476477CE5A6874F53A9106423D905F9D808C0FCE8E7F1E04AC642F01FE41D0C7D933971F45CBA72B7"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.autonavi.aps.amapapi.utils.b.m     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "668319f11506def6208d6afe320dfd52"
            java.lang.String r2 = "53E53D46011A6BBAEA4FAE5442E659E0577CDD336F930C28635C322FB3F51C3C63F7FBAC9EAE448DFA2E5E5D716C4807"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r0 = move-exception
            java.lang.String r1 = "CoreUtil"
            java.lang.String r2 = "initUrlHash"
            a(r0, r1, r2)
            return
    }
}
