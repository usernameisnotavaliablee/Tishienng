package com.autonavi.aps.amapapi.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    static com.amap.api.location.AMapLocation f5866g;

    /* renamed from: h, reason: collision with root package name */
    static boolean f5867h;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.List<com.amap.api.col.p0003l.i7> f5868i;

    /* renamed from: j, reason: collision with root package name */
    private static org.json.JSONArray f5869j;
    public android.util.SparseArray<java.lang.Long> a;

    /* renamed from: b, reason: collision with root package name */
    public int f5870b;

    /* renamed from: c, reason: collision with root package name */
    public long f5871c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.String[] f5872d;

    /* renamed from: e, reason: collision with root package name */
    public int f5873e;

    /* renamed from: f, reason: collision with root package name */
    public long f5874f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.autonavi.aps.amapapi.utils.h$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode[] r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.autonavi.aps.amapapi.utils.h.AnonymousClass1.a = r0
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.autonavi.aps.amapapi.utils.h.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.autonavi.aps.amapapi.utils.h.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.autonavi.aps.amapapi.utils.h.f5868i = r0
            r0 = 0
            com.autonavi.aps.amapapi.utils.h.f5869j = r0
            com.autonavi.aps.amapapi.utils.h.f5866g = r0
            r0 = 0
            com.autonavi.aps.amapapi.utils.h.f5867h = r0
            return
    }

    public h() {
            r9 = this;
            r9.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.a = r0
            r0 = -1
            r9.f5870b = r0
            r1 = 0
            r9.f5871c = r1
            java.lang.String r7 = "bs"
            java.lang.String r8 = "ds"
            java.lang.String r3 = "ol"
            java.lang.String r4 = "cl"
            java.lang.String r5 = "gl"
            java.lang.String r6 = "ha"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            r9.f5872d = r1
            r9.f5873e = r0
            r0 = -1
            r9.f5874f = r0
            return
    }

    private static java.lang.String a(int r1) {
            r0 = 2011(0x7db, float:2.818E-42)
            if (r1 == r0) goto L8a
            r0 = 2031(0x7ef, float:2.846E-42)
            if (r1 == r0) goto L87
            r0 = 2041(0x7f9, float:2.86E-42)
            if (r1 == r0) goto L84
            r0 = 2081(0x821, float:2.916E-42)
            if (r1 == r0) goto L81
            r0 = 2091(0x82b, float:2.93E-42)
            if (r1 == r0) goto L7e
            r0 = 2111(0x83f, float:2.958E-42)
            if (r1 == r0) goto L7b
            r0 = 2121(0x849, float:2.972E-42)
            if (r1 == r0) goto L78
            r0 = 2141(0x85d, float:3.0E-42)
            if (r1 == r0) goto L75
            r0 = 2021(0x7e5, float:2.832E-42)
            if (r1 == r0) goto L72
            r0 = 2022(0x7e6, float:2.833E-42)
            if (r1 == r0) goto L6f
            r0 = 2061(0x80d, float:2.888E-42)
            if (r1 == r0) goto L6c
            r0 = 2062(0x80e, float:2.89E-42)
            if (r1 == r0) goto L69
            switch(r1) {
                case 2051: goto L66;
                case 2052: goto L63;
                case 2053: goto L60;
                case 2054: goto L5d;
                default: goto L33;
            }
        L33:
            switch(r1) {
                case 2101: goto L5a;
                case 2102: goto L57;
                case 2103: goto L54;
                default: goto L36;
            }
        L36:
            switch(r1) {
                case 2131: goto L51;
                case 2132: goto L4e;
                case 2133: goto L4b;
                default: goto L39;
            }
        L39:
            switch(r1) {
                case 2151: goto L48;
                case 2152: goto L45;
                case 2153: goto L42;
                case 2154: goto L3f;
                default: goto L3c;
            }
        L3c:
            java.lang.String r1 = ""
            return r1
        L3f:
            java.lang.String r1 = "UNSUPPORT_CONTINUE_LOC"
            return r1
        L42:
            java.lang.String r1 = "UNSUPPORT_COARSE_LBSLOC"
            return r1
        L45:
            java.lang.String r1 = "MaybeMockGPSLoc"
            return r1
        L48:
            java.lang.String r1 = "MaybeMockNetLoc"
            return r1
        L4b:
            java.lang.String r1 = "NoCgiAndWifiOff"
            return r1
        L4e:
            java.lang.String r1 = "AirPlaneModeAndWifiOff"
            return r1
        L51:
            java.lang.String r1 = "NoCgiOAndWifiInfo"
            return r1
        L54:
            java.lang.String r1 = "NotConfigAPSService"
            return r1
        L57:
            java.lang.String r1 = "AuthClientScodeFail"
            return r1
        L5a:
            java.lang.String r1 = "BindAPSServiceException"
            return r1
        L5d:
            java.lang.String r1 = "ParserDataException"
            return r1
        L60:
            java.lang.String r1 = "DecryptResponseException"
            return r1
        L63:
            java.lang.String r1 = "MaybeIntercepted"
            return r1
        L66:
            java.lang.String r1 = "NeedLoginNetWork\t"
            return r1
        L69:
            java.lang.String r1 = "ServerLocFail"
            return r1
        L6c:
            java.lang.String r1 = "ServerRetypeError"
            return r1
        L6f:
            java.lang.String r1 = "OnlyOneWifiButNotMain"
            return r1
        L72:
            java.lang.String r1 = "OnlyMainWifi"
            return r1
        L75:
            java.lang.String r1 = "NoEnoughStatellites"
            return r1
        L78:
            java.lang.String r1 = "NotLocPermission"
            return r1
        L7b:
            java.lang.String r1 = "ErrorCgiInfo"
            return r1
        L7e:
            java.lang.String r1 = "InitException"
            return r1
        L81:
            java.lang.String r1 = "LocalLocException"
            return r1
        L84:
            java.lang.String r1 = "ResponseResultIsNull"
            return r1
        L87:
            java.lang.String r1 = "CreateApsReqException"
            return r1
        L8a:
            java.lang.String r1 = "ContextIsNull"
            return r1
    }

    public static void a(long r6, long r8) {
            java.lang.String r0 = ","
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss.SSS"
            boolean r2 = com.autonavi.aps.amapapi.utils.h.f5867h     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L9
            goto L76
        L9:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "gpsTime:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = com.autonavi.aps.amapapi.utils.j.a(r6, r1)     // Catch: java.lang.Throwable -> L76
            r2.append(r3)     // Catch: java.lang.Throwable -> L76
            r2.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "sysTime:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = com.autonavi.aps.amapapi.utils.j.a(r8, r1)     // Catch: java.lang.Throwable -> L76
            r2.append(r8)     // Catch: java.lang.Throwable -> L76
            r2.append(r0)     // Catch: java.lang.Throwable -> L76
            long r8 = com.autonavi.aps.amapapi.utils.a.u()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "0"
            r3 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L3c
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.j.a(r8, r1)     // Catch: java.lang.Throwable -> L76
        L3c:
            java.lang.String r1 = "serverTime:"
            r2.append(r1)     // Catch: java.lang.Throwable -> L76
            r2.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "checkgpstime"
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L76
            a(r0, r1)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L6b
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L76
            r8 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L6b
            java.lang.String r6 = ", correctError"
            r2.append(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "checkgpstimeerror"
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L76
            a(r6, r7)     // Catch: java.lang.Throwable -> L76
        L6b:
            int r6 = r2.length()     // Catch: java.lang.Throwable -> L76
            r7 = 0
            r2.delete(r7, r6)     // Catch: java.lang.Throwable -> L76
            r6 = 1
            com.autonavi.aps.amapapi.utils.h.f5867h = r6     // Catch: java.lang.Throwable -> L76
        L76:
            return
    }

    public static synchronized void a(android.content.Context r3) {
            java.lang.Class<com.autonavi.aps.amapapi.utils.h> r0 = com.autonavi.aps.amapapi.utils.h.class
            monitor-enter(r0)
            if (r3 == 0) goto L3c
            boolean r1 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto Lc
            goto L3c
        Lc:
            java.util.List<com.amap.api.col.3l.i7> r1 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            if (r1 <= 0) goto L2b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.List<com.amap.api.col.3l.i7> r2 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L29
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L29
            com.amap.api.col.p0003l.j7.h(r1, r3)     // Catch: java.lang.Throwable -> L29
            java.util.List<com.amap.api.col.3l.i7> r1 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r3 = move-exception
            goto L30
        L2b:
            f(r3)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return
        L30:
            java.lang.String r1 = "ReportUtil"
            java.lang.String r2 = "destroy"
            com.autonavi.aps.amapapi.utils.b.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return
        L39:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r3
        L3c:
            monitor-exit(r0)
            return
    }

    public static void a(android.content.Context r9, int r10, int r11, long r12, long r14) {
            r0 = -1
            if (r10 == r0) goto L1a
            if (r11 != r0) goto L6
            goto L1a
        L6:
            java.lang.String r2 = "O012"
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            a(r1, r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "ReportUtil"
            java.lang.String r11 = "reportServiceAliveTime"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r11)
        L1a:
            return
    }

    public static void a(android.content.Context r1, long r2, boolean r4) {
            if (r1 == 0) goto L17
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L9
            goto L17
        L9:
            java.lang.String r0 = "O015"
            a(r1, r2, r4, r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            java.lang.String r2 = "ReportUtil"
            java.lang.String r3 = "reportGPSLocUseTime"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L17:
            return
    }

    private static void a(android.content.Context r0, long r1, boolean r3, java.lang.String r4) {
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r1 = r1.intValue()
            if (r3 != 0) goto Ld
            java.lang.String r2 = "abroad"
            goto Lf
        Ld:
            java.lang.String r2 = "domestic"
        Lf:
            a(r0, r4, r2, r1)
            return
    }

    public static synchronized void a(android.content.Context r8, com.amap.api.location.AMapLocation r9) {
            java.lang.Class<com.autonavi.aps.amapapi.utils.h> r0 = com.autonavi.aps.amapapi.utils.h.class
            monitor-enter(r0)
            boolean r1 = com.autonavi.aps.amapapi.utils.j.a(r9)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            int r1 = r9.getLocationType()     // Catch: java.lang.Throwable -> L54
            r2 = 4
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L31
            if (r1 == r4) goto L2f
            if (r1 == r2) goto L2f
            r6 = 11
            if (r1 == r6) goto L2d
            r6 = 8
            if (r1 == r6) goto L2a
            r6 = 9
            if (r1 == r6) goto L27
            r1 = 0
            goto L33
        L27:
            r1 = 2
        L28:
            r3 = 1
            goto L33
        L2a:
            r3 = 3
            r1 = 3
            goto L28
        L2d:
            r1 = 4
            goto L28
        L2f:
            r1 = 1
            goto L28
        L31:
            r1 = 0
            goto L28
        L33:
            if (r3 == 0) goto Lf3
            int r3 = com.autonavi.aps.amapapi.utils.a.c()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L48
            if (r1 == 0) goto L44
            if (r1 != r2) goto L40
            goto L44
        L40:
            if (r3 != r5) goto L48
            monitor-exit(r0)
            return
        L44:
            if (r3 != r4) goto L48
            monitor-exit(r0)
            return
        L48:
            org.json.JSONArray r2 = com.autonavi.aps.amapapi.utils.h.f5869j     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L57
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            com.autonavi.aps.amapapi.utils.h.f5869j = r2     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r8 = move-exception
            goto Lf5
        L57:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "lon"
            double r6 = r9.getLongitude()     // Catch: java.lang.Throwable -> L54
            double r6 = com.autonavi.aps.amapapi.utils.j.b(r6)     // Catch: java.lang.Throwable -> L54
            r2.put(r3, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "lat"
            double r6 = r9.getLatitude()     // Catch: java.lang.Throwable -> L54
            double r6 = com.autonavi.aps.amapapi.utils.j.b(r6)     // Catch: java.lang.Throwable -> L54
            r2.put(r3, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "type"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "timestamp"
            long r6 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L54
            r2.put(r3, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r9.getCoordType()     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "WGS84"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L96
            java.lang.String r3 = "coordType"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L54
            goto L9b
        L96:
            java.lang.String r3 = "coordType"
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L54
        L9b:
            if (r1 != 0) goto Lde
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "accuracy"
            float r4 = r9.getAccuracy()     // Catch: java.lang.Throwable -> L54
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L54
            double r4 = com.autonavi.aps.amapapi.utils.j.c(r4)     // Catch: java.lang.Throwable -> L54
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "altitude"
            double r4 = r9.getAltitude()     // Catch: java.lang.Throwable -> L54
            double r4 = com.autonavi.aps.amapapi.utils.j.c(r4)     // Catch: java.lang.Throwable -> L54
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "bearing"
            float r4 = r9.getBearing()     // Catch: java.lang.Throwable -> L54
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L54
            double r4 = com.autonavi.aps.amapapi.utils.j.c(r4)     // Catch: java.lang.Throwable -> L54
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "speed"
            float r9 = r9.getSpeed()     // Catch: java.lang.Throwable -> L54
            double r4 = (double) r9     // Catch: java.lang.Throwable -> L54
            double r4 = com.autonavi.aps.amapapi.utils.j.c(r4)     // Catch: java.lang.Throwable -> L54
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = "extension"
            r2.put(r9, r1)     // Catch: java.lang.Throwable -> L54
        Lde:
            org.json.JSONArray r9 = com.autonavi.aps.amapapi.utils.h.f5869j     // Catch: java.lang.Throwable -> L54
            org.json.JSONArray r9 = r9.put(r2)     // Catch: java.lang.Throwable -> L54
            com.autonavi.aps.amapapi.utils.h.f5869j = r9     // Catch: java.lang.Throwable -> L54
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L54
            int r1 = com.autonavi.aps.amapapi.utils.a.b()     // Catch: java.lang.Throwable -> L54
            if (r9 < r1) goto Lf3
            f(r8)     // Catch: java.lang.Throwable -> L54
        Lf3:
            monitor-exit(r0)
            return
        Lf5:
            java.lang.String r9 = "ReportUtil"
            java.lang.String r1 = "recordOfflineLocLog"
            com.autonavi.aps.amapapi.utils.b.a(r8, r9, r1)     // Catch: java.lang.Throwable -> Lfe
            monitor-exit(r0)
            return
        Lfe:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lfe
            throw r8
    }

    public static void a(android.content.Context r8, com.amap.api.location.AMapLocation r9, com.autonavi.aps.amapapi.a r10) {
            if (r9 != 0) goto L3
            goto L56
        L3:
            java.lang.String r0 = "gps"
            java.lang.String r1 = r9.getProvider()     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L56
            int r0 = r9.getLocationType()     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r0 != r1) goto L17
            goto L56
        L17:
            java.lang.String r0 = "domestic"
            boolean r2 = a(r9)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L21
            java.lang.String r0 = "abroad"
        L21:
            r3 = r0
            int r0 = r9.getErrorCode()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "net"
            java.lang.String r4 = "cache"
            r5 = 6
            r6 = 5
            if (r0 == 0) goto L41
            int r0 = r9.getErrorCode()     // Catch: java.lang.Throwable -> L57
            r1 = 4
            r7 = 0
            if (r0 == r1) goto L3f
            if (r0 == r6) goto L3f
            if (r0 == r5) goto L3f
            r1 = 11
            if (r0 == r1) goto L3f
            r2 = r4
        L3f:
            r4 = 0
            goto L4b
        L41:
            int r0 = r9.getLocationType()     // Catch: java.lang.Throwable -> L57
            if (r0 == r6) goto L4a
            if (r0 == r5) goto L4a
            r2 = r4
        L4a:
            r4 = 1
        L4b:
            java.lang.String r1 = "O016"
            int r5 = r9.getErrorCode()     // Catch: java.lang.Throwable -> L57
            r0 = r8
            r6 = r10
            a(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L57
        L56:
            return
        L57:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "ReportUtil"
            java.lang.String r10 = "reportBatting"
            com.autonavi.aps.amapapi.utils.b.a(r8, r9, r10)
            return
    }

    private static void a(android.content.Context r2, java.lang.String r3, int r4, int r5, long r6, long r8) {
            if (r2 == 0) goto L2e
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L9
            goto L2e
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "param_int_first"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "param_int_second"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "param_long_first"
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "param_long_second"
            r0.put(r4, r8)     // Catch: java.lang.Throwable -> L26
            a(r2, r3, r0)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.String r3 = "ReportUtil"
            java.lang.String r4 = "applyStatisticsEx"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r4)
        L2e:
            return
    }

    private static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5) {
            if (r2 == 0) goto L3b
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L9
            goto L3b
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L19
            java.lang.String r1 = "param_string_first"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L33
        L19:
            r4 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L25
            java.lang.String r1 = "param_string_second"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L33
        L25:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r4) goto L2f
            java.lang.String r4 = "param_int_first"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L33
        L2f:
            a(r2, r3, r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r2 = move-exception
            java.lang.String r3 = "ReportUtil"
            java.lang.String r4 = "applyStatisticsEx"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r4)
        L3b:
            return
    }

    private static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, int r8, com.autonavi.aps.amapapi.a r9) {
            if (r3 == 0) goto Le2
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> Lda
            if (r0 != 0) goto La
            goto Le2
        La:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lda
            r0.<init>()     // Catch: java.lang.Throwable -> Lda
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r1 != 0) goto L1a
            java.lang.String r1 = "param_string_first"
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lda
        L1a:
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L25
            java.lang.String r5 = "param_string_second"
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L25:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r5) goto L2f
            java.lang.String r6 = "param_int_first"
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> Lda
        L2f:
            if (r8 == r5) goto L36
            java.lang.String r5 = "param_int_second"
            r0.put(r5, r8)     // Catch: java.lang.Throwable -> Lda
        L36:
            if (r9 == 0) goto Ld6
            java.lang.String r5 = r9.d()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L4b
            java.lang.String r5 = "dns"
            java.lang.String r6 = r9.d()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L4b:
            java.lang.String r5 = r9.e()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L5e
            java.lang.String r5 = "domain"
            java.lang.String r6 = r9.e()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L5e:
            java.lang.String r5 = r9.f()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L71
            java.lang.String r5 = "type"
            java.lang.String r6 = r9.f()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L71:
            java.lang.String r5 = r9.g()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L84
            java.lang.String r5 = "reason"
            java.lang.String r6 = r9.g()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L84:
            java.lang.String r5 = r9.c()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto L97
            java.lang.String r5 = "ip"
            java.lang.String r6 = r9.c()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        L97:
            java.lang.String r5 = r9.b()     // Catch: java.lang.Throwable -> Lda
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto Laa
            java.lang.String r5 = "stack"
            java.lang.String r6 = r9.b()     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        Laa:
            long r5 = r9.h()     // Catch: java.lang.Throwable -> Lda
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto Lc1
            java.lang.String r5 = "ctime"
            long r1 = r9.h()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        Lc1:
            long r5 = r9.a()     // Catch: java.lang.Throwable -> Lda
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto Ld6
            java.lang.String r5 = "ntime"
            long r6 = r9.a()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lda
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> Lda
        Ld6:
            a(r3, r4, r0)     // Catch: java.lang.Throwable -> Lda
            return
        Lda:
            r3 = move-exception
            java.lang.String r4 = "ReportUtil"
            java.lang.String r5 = "applyStatisticsEx"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r5)
        Le2:
            return
    }

    public static synchronized void a(android.content.Context r4, java.lang.String r5, org.json.JSONObject r6) {
            java.lang.Class<com.autonavi.aps.amapapi.utils.h> r0 = com.autonavi.aps.amapapi.utils.h.class
            monitor-enter(r0)
            if (r4 == 0) goto L50
            boolean r1 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto Lc
            goto L50
        Lc:
            com.amap.api.col.3l.i7 r1 = new com.amap.api.col.3l.i7     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "loc"
            java.lang.String r3 = "6.4.3"
            r1.<init>(r4, r2, r3, r5)     // Catch: java.lang.Throwable -> L1f
            if (r6 == 0) goto L21
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L1f
            r1.a(r5)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r4 = move-exception
            goto L44
        L21:
            java.util.List<com.amap.api.col.3l.i7> r5 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L1f
            r5.add(r1)     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.amap.api.col.3l.i7> r5 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L1f
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L1f
            r6 = 30
            if (r5 < r6) goto L42
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r5.<init>()     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.amap.api.col.3l.i7> r6 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L1f
            r5.addAll(r6)     // Catch: java.lang.Throwable -> L1f
            com.amap.api.col.p0003l.j7.h(r5, r4)     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.amap.api.col.3l.i7> r4 = com.autonavi.aps.amapapi.utils.h.f5868i     // Catch: java.lang.Throwable -> L1f
            r4.clear()     // Catch: java.lang.Throwable -> L1f
        L42:
            monitor-exit(r0)
            return
        L44:
            java.lang.String r5 = "ReportUtil"
            java.lang.String r6 = "applyStatistics"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return
        L4d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r4
        L50:
            monitor-exit(r0)
            return
    }

    public static void a(com.amap.api.location.AMapLocation r8, com.amap.api.location.AMapLocation r9) {
            java.lang.String r0 = "gps"
            java.lang.String r1 = ","
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            if (r2 != 0) goto L17
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r8)     // Catch: java.lang.Throwable -> L154
            if (r2 != 0) goto L11
            com.autonavi.aps.amapapi.utils.h.f5866g = r9     // Catch: java.lang.Throwable -> L154
            return
        L11:
            com.amap.api.location.AMapLocation r2 = r8.clone()     // Catch: java.lang.Throwable -> L154
            com.autonavi.aps.amapapi.utils.h.f5866g = r2     // Catch: java.lang.Throwable -> L154
        L17:
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r2)     // Catch: java.lang.Throwable -> L154
            if (r2 == 0) goto L154
            boolean r2 = com.autonavi.aps.amapapi.utils.j.a(r9)     // Catch: java.lang.Throwable -> L154
            if (r2 == 0) goto L154
            com.amap.api.location.AMapLocation r9 = r9.clone()     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            int r2 = r2.getLocationType()     // Catch: java.lang.Throwable -> L154
            r3 = 1
            if (r2 == r3) goto L152
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            int r2 = r2.getLocationType()     // Catch: java.lang.Throwable -> L154
            r4 = 9
            if (r2 == r4) goto L152
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            java.lang.String r2 = r2.getProvider()     // Catch: java.lang.Throwable -> L154
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L154
            if (r2 != 0) goto L152
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            int r2 = r2.getLocationType()     // Catch: java.lang.Throwable -> L154
            r5 = 7
            if (r2 == r5) goto L152
            int r2 = r9.getLocationType()     // Catch: java.lang.Throwable -> L154
            if (r2 == r3) goto L152
            int r2 = r9.getLocationType()     // Catch: java.lang.Throwable -> L154
            if (r2 == r4) goto L152
            java.lang.String r2 = r9.getProvider()     // Catch: java.lang.Throwable -> L154
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L154
            if (r0 != 0) goto L152
            int r0 = r9.getLocationType()     // Catch: java.lang.Throwable -> L154
            if (r0 == r5) goto L152
            long r2 = r9.getTime()     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r0 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            long r4 = r0.getTime()     // Catch: java.lang.Throwable -> L154
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L154
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L87
            r2 = 1
        L87:
            r6 = 1800(0x708, double:8.893E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L152
            com.amap.api.location.AMapLocation r0 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r0, r9)     // Catch: java.lang.Throwable -> L154
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L154
            float r2 = r0 / r2
            r3 = 1189765120(0x46ea6000, float:30000.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L152
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L152
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L154
            r0.<init>()     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            double r2 = r2.getLatitude()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            double r2 = r2.getLongitude()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            float r2 = r2.getAccuracy()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            int r2 = r2.getLocationType()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            long r2 = r8.getTime()     // Catch: java.lang.Throwable -> L154
            java.lang.String r8 = "yyyyMMdd_HH:mm:ss:SS"
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto Lf0
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            long r2 = r2.getTime()     // Catch: java.lang.Throwable -> L154
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.j.a(r2, r8)     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            goto Lf9
        Lf0:
            com.amap.api.location.AMapLocation r2 = com.autonavi.aps.amapapi.utils.h.f5866g     // Catch: java.lang.Throwable -> L154
            long r2 = r2.getTime()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
        Lf9:
            java.lang.String r2 = "#"
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            double r2 = r9.getLatitude()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            double r2 = r9.getLongitude()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            float r2 = r9.getAccuracy()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            int r2 = r9.getLocationType()     // Catch: java.lang.Throwable -> L154
            r0.append(r2)     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
            long r1 = r9.getTime()     // Catch: java.lang.Throwable -> L154
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L13a
            long r1 = r9.getTime()     // Catch: java.lang.Throwable -> L154
            java.lang.String r8 = com.autonavi.aps.amapapi.utils.j.a(r1, r8)     // Catch: java.lang.Throwable -> L154
            r0.append(r8)     // Catch: java.lang.Throwable -> L154
            goto L141
        L13a:
            long r1 = r9.getTime()     // Catch: java.lang.Throwable -> L154
            r0.append(r1)     // Catch: java.lang.Throwable -> L154
        L141:
            java.lang.String r8 = "bigshiftstatistics"
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L154
            a(r8, r1)     // Catch: java.lang.Throwable -> L154
            int r8 = r0.length()     // Catch: java.lang.Throwable -> L154
            r1 = 0
            r0.delete(r1, r8)     // Catch: java.lang.Throwable -> L154
        L152:
            com.autonavi.aps.amapapi.utils.h.f5866g = r9     // Catch: java.lang.Throwable -> L154
        L154:
            return
    }

    public static void a(java.lang.String r1, int r2) {
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = a(r2)
            a(r1, r0, r2)
            return
    }

    public static void a(java.lang.String r1, java.lang.String r2) {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> L8
            com.amap.api.col.p0003l.w5.o(r0, r2, r1)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            java.lang.String r2 = "ReportUtil"
            java.lang.String r0 = "reportLog"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r0)
            return
    }

    public static void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "/mobile/binary"
            com.amap.api.col.p0003l.w5.k(r0, r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    public static void a(java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = r2 instanceof com.amap.api.col.p0003l.fk     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.fk r2 = (com.amap.api.col.p0003l.fk) r2     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.p0003l.w5.j(r0, r1, r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    private static boolean a(com.amap.api.location.AMapLocation r7) {
            boolean r0 = com.autonavi.aps.amapapi.utils.j.a(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            double r3 = r7.getLatitude()
            double r5 = r7.getLongitude()
            boolean r7 = com.autonavi.aps.amapapi.utils.b.a(r3, r5)
            if (r7 == 0) goto L17
            return r2
        L17:
            return r1
        L18:
            java.lang.String r7 = "http://abroad.apilocate.amap.com/mobile/binary"
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.f5848c
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L23
            return r1
        L23:
            return r2
    }

    public static void b(android.content.Context r1, long r2, boolean r4) {
            if (r1 == 0) goto L17
            boolean r0 = com.autonavi.aps.amapapi.utils.a.a()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L9
            goto L17
        L9:
            java.lang.String r0 = "O024"
            a(r1, r2, r4, r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            java.lang.String r2 = "ReportUtil"
            java.lang.String r3 = "reportCoarseLocUseTime"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L17:
            return
    }

    private static void f(android.content.Context r3) {
            org.json.JSONArray r0 = com.autonavi.aps.amapapi.utils.h.f5869j     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1f
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L20
            if (r0 <= 0) goto L1f
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.3l.g7 r1 = new com.amap.api.col.3l.g7     // Catch: java.lang.Throwable -> L20
            org.json.JSONArray r2 = com.autonavi.aps.amapapi.utils.h.f5869j     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L20
            r1.<init>(r3, r0, r2)     // Catch: java.lang.Throwable -> L20
            com.amap.api.col.p0003l.h7.e(r1, r3)     // Catch: java.lang.Throwable -> L20
            r3 = 0
            com.autonavi.aps.amapapi.utils.h.f5869j = r3     // Catch: java.lang.Throwable -> L20
        L1f:
            return
        L20:
            r3 = move-exception
            java.lang.String r0 = "ReportUtil"
            java.lang.String r1 = "writeOfflineLocLog"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    public final void a(android.content.Context r9, int r10) {
            r8 = this;
            int r0 = r8.f5870b     // Catch: java.lang.Throwable -> L32
            if (r0 != r10) goto L5
            return
        L5:
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L34
            if (r0 == r10) goto L34
            long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L32
            long r4 = r8.f5871c     // Catch: java.lang.Throwable -> L32
            long r0 = r0 - r4
            android.util.SparseArray<java.lang.Long> r4 = r8.a     // Catch: java.lang.Throwable -> L32
            int r5 = r8.f5870b     // Catch: java.lang.Throwable -> L32
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r4.get(r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L32
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray<java.lang.Long> r6 = r8.a     // Catch: java.lang.Throwable -> L32
            int r7 = r8.f5870b     // Catch: java.lang.Throwable -> L32
            long r0 = r0 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            r6.append(r7, r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r9 = move-exception
            goto L48
        L34:
            java.lang.String r0 = "pref1"
            java.lang.String[] r1 = r8.f5872d     // Catch: java.lang.Throwable -> L32
            r1 = r1[r10]     // Catch: java.lang.Throwable -> L32
            long r0 = com.autonavi.aps.amapapi.utils.i.a(r9, r0, r1, r2)     // Catch: java.lang.Throwable -> L32
            long r2 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L32
            long r2 = r2 - r0
            r8.f5871c = r2     // Catch: java.lang.Throwable -> L32
            r8.f5870b = r10     // Catch: java.lang.Throwable -> L32
            return
        L48:
            java.lang.String r10 = "ReportUtil"
            java.lang.String r0 = "setLocationType"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r0)
            return
    }

    public final void a(android.content.Context r9, com.amap.api.location.AMapLocationClientOption r10) {
            r8 = this;
            int[] r0 = com.autonavi.aps.amapapi.utils.h.AnonymousClass1.a     // Catch: java.lang.Throwable -> L4c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r10 = r10.getLocationMode()     // Catch: java.lang.Throwable -> L4c
            int r10 = r10.ordinal()     // Catch: java.lang.Throwable -> L4c
            r10 = r0[r10]     // Catch: java.lang.Throwable -> L4c
            r0 = 1
            r1 = -1
            if (r10 == r0) goto L1a
            r0 = 2
            if (r10 == r0) goto L18
            r0 = 3
            if (r10 == r0) goto L1b
            r0 = -1
            goto L1b
        L18:
            r0 = 5
            goto L1b
        L1a:
            r0 = 4
        L1b:
            int r10 = r8.f5873e     // Catch: java.lang.Throwable -> L4c
            if (r10 != r0) goto L20
            return
        L20:
            r2 = 0
            if (r10 == r1) goto L4e
            if (r10 == r0) goto L4e
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L4c
            long r6 = r8.f5874f     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 - r6
            android.util.SparseArray<java.lang.Long> r10 = r8.a     // Catch: java.lang.Throwable -> L4c
            int r1 = r8.f5873e     // Catch: java.lang.Throwable -> L4c
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.get(r1, r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L4c
            long r6 = r10.longValue()     // Catch: java.lang.Throwable -> L4c
            android.util.SparseArray<java.lang.Long> r10 = r8.a     // Catch: java.lang.Throwable -> L4c
            int r1 = r8.f5873e     // Catch: java.lang.Throwable -> L4c
            long r4 = r4 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4c
            r10.append(r1, r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r9 = move-exception
            goto L62
        L4e:
            java.lang.String r10 = "pref1"
            java.lang.String[] r1 = r8.f5872d     // Catch: java.lang.Throwable -> L4c
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L4c
            long r9 = com.autonavi.aps.amapapi.utils.i.a(r9, r10, r1, r2)     // Catch: java.lang.Throwable -> L4c
            long r1 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L4c
            long r1 = r1 - r9
            r8.f5874f = r1     // Catch: java.lang.Throwable -> L4c
            r8.f5873e = r0     // Catch: java.lang.Throwable -> L4c
            return
        L62:
            java.lang.String r10 = "ReportUtil"
            java.lang.String r0 = "setLocationMode"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r0)
            return
    }

    public final void b(android.content.Context r12) {
            r11 = this;
            java.lang.String r0 = "pref1"
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L2d
            long r6 = r11.f5871c     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 - r6
            int r6 = r11.f5870b     // Catch: java.lang.Throwable -> L2d
            r7 = -1
            if (r6 == r7) goto L2f
            android.util.SparseArray<java.lang.Long> r8 = r11.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r8.get(r6, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2d
            long r8 = r6.longValue()     // Catch: java.lang.Throwable -> L2d
            android.util.SparseArray<java.lang.Long> r6 = r11.a     // Catch: java.lang.Throwable -> L2d
            int r10 = r11.f5870b     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 + r8
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2d
            r6.append(r10, r4)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r12 = move-exception
            goto L86
        L2f:
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L2d
            long r8 = r11.f5874f     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 - r8
            int r6 = r11.f5873e     // Catch: java.lang.Throwable -> L2d
            if (r6 == r7) goto L52
            android.util.SparseArray<java.lang.Long> r7 = r11.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r7.get(r6, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2d
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L2d
            android.util.SparseArray<java.lang.Long> r8 = r11.a     // Catch: java.lang.Throwable -> L2d
            int r9 = r11.f5873e     // Catch: java.lang.Throwable -> L2d
            long r4 = r4 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2d
            r8.append(r9, r4)     // Catch: java.lang.Throwable -> L2d
        L52:
            android.content.SharedPreferences$Editor r4 = com.autonavi.aps.amapapi.utils.i.a(r12, r0)     // Catch: java.lang.Throwable -> L2d
            r5 = 0
        L57:
            java.lang.String[] r6 = r11.f5872d     // Catch: java.lang.Throwable -> L2d
            int r6 = r6.length     // Catch: java.lang.Throwable -> L2d
            if (r5 >= r6) goto L82
            android.util.SparseArray<java.lang.Long> r6 = r11.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.get(r5, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2d
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L2d
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L7f
            java.lang.String[] r8 = r11.f5872d     // Catch: java.lang.Throwable -> L2d
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L2d
            long r8 = com.autonavi.aps.amapapi.utils.i.a(r12, r0, r8, r1)     // Catch: java.lang.Throwable -> L2d
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L7f
            java.lang.String[] r8 = r11.f5872d     // Catch: java.lang.Throwable -> L2d
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L2d
            com.autonavi.aps.amapapi.utils.i.a(r4, r8, r6)     // Catch: java.lang.Throwable -> L2d
        L7f:
            int r5 = r5 + 1
            goto L57
        L82:
            com.autonavi.aps.amapapi.utils.i.a(r4)     // Catch: java.lang.Throwable -> L2d
            return
        L86:
            java.lang.String r0 = "ReportUtil"
            java.lang.String r1 = "saveLocationTypeAndMode"
            com.autonavi.aps.amapapi.utils.b.a(r12, r0, r1)
            return
    }

    public final int c(android.content.Context r15) {
            r14 = this;
            java.lang.String r0 = "pref1"
            r1 = -1
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3f
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            long r6 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3f
            r8 = 0
            r2 = r2[r8]     // Catch: java.lang.Throwable -> L3f
            long r9 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3f
            r11 = 1
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L3f
            long r12 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3f
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            int r15 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            return r1
        L2d:
            long r9 = r9 - r6
            long r12 = r12 - r6
            int r15 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r15 <= 0) goto L39
            int r15 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r15 <= 0) goto L38
            return r3
        L38:
            return r11
        L39:
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 <= 0) goto L3e
            return r8
        L3e:
            return r11
        L3f:
            return r1
    }

    public final int d(android.content.Context r15) {
            r14 = this;
            java.lang.String r0 = "pref1"
            r1 = -1
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3d
            r3 = 3
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3d
            r4 = 0
            long r6 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3d
            r8 = 4
            r2 = r2[r8]     // Catch: java.lang.Throwable -> L3d
            long r9 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r2 = r14.f5872d     // Catch: java.lang.Throwable -> L3d
            r11 = 5
            r2 = r2[r11]     // Catch: java.lang.Throwable -> L3d
            long r12 = com.autonavi.aps.amapapi.utils.i.a(r15, r0, r2, r4)     // Catch: java.lang.Throwable -> L3d
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            int r15 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 != 0) goto L2d
            return r1
        L2d:
            int r15 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r15 <= 0) goto L37
            int r15 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r15 <= 0) goto L36
            return r3
        L36:
            return r11
        L37:
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 <= 0) goto L3c
            return r8
        L3c:
            return r11
        L3d:
            return r1
    }

    public final void e(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "pref1"
            android.content.SharedPreferences$Editor r5 = com.autonavi.aps.amapapi.utils.i.a(r5, r0)     // Catch: java.lang.Throwable -> L19
            r0 = 0
        L7:
            java.lang.String[] r1 = r4.f5872d     // Catch: java.lang.Throwable -> L19
            int r2 = r1.length     // Catch: java.lang.Throwable -> L19
            if (r0 >= r2) goto L16
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L19
            r2 = 0
            com.autonavi.aps.amapapi.utils.i.a(r5, r1, r2)     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + 1
            goto L7
        L16:
            com.autonavi.aps.amapapi.utils.i.a(r5)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }
}
