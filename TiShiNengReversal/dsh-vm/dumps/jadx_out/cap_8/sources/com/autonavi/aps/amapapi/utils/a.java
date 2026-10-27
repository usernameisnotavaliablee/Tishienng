package com.autonavi.aps.amapapi.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static double A = 0.0d;
    private static boolean B = false;
    private static int C = 0;
    private static int D = 0;
    private static boolean E = false;
    private static boolean F = false;
    private static boolean G = false;
    private static boolean H = false;
    private static long I = 0;
    private static boolean J = false;
    private static int K = 0;
    private static boolean L = false;
    private static int M = 0;
    private static boolean N = false;
    private static java.lang.String O = null;
    private static long P = 0;
    static long a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f5837b = 0;

    /* renamed from: c, reason: collision with root package name */
    static boolean f5838c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5839d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f5840e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f5841f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f5842g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5843h = false;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f5844i = false;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f5845j = true;

    /* renamed from: k, reason: collision with root package name */
    private static int f5846k = 1000;
    private static int l = 200;
    private static boolean m = false;
    private static int n = 20;
    private static int o = 0;
    private static volatile int p = 0;
    private static boolean q = true;
    private static boolean r = false;
    private static int s = -1;
    private static long t;
    private static java.util.ArrayList<java.lang.String> u;
    private static java.util.ArrayList<java.lang.String> v;
    private static volatile boolean w;
    private static boolean x;
    private static long y;
    private static boolean z;


    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.autonavi.aps.amapapi.utils.a.u = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.autonavi.aps.amapapi.utils.a.v = r0
            r0 = 0
            com.autonavi.aps.amapapi.utils.a.w = r0
            r1 = 1
            com.autonavi.aps.amapapi.utils.a.x = r1
            r2 = 300000(0x493e0, double:1.482197E-318)
            com.autonavi.aps.amapapi.utils.a.y = r2
            com.autonavi.aps.amapapi.utils.a.z = r0
            r2 = 4603741668684706349(0x3fe3c6a7ef9db22d, double:0.618)
            com.autonavi.aps.amapapi.utils.a.A = r2
            com.autonavi.aps.amapapi.utils.a.B = r1
            r2 = 80
            com.autonavi.aps.amapapi.utils.a.C = r2
            r2 = 5
            com.autonavi.aps.amapapi.utils.a.D = r2
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            com.autonavi.aps.amapapi.utils.a.a = r3
            com.autonavi.aps.amapapi.utils.a.E = r0
            com.autonavi.aps.amapapi.utils.a.F = r1
            com.autonavi.aps.amapapi.utils.a.G = r0
            r3 = 0
            com.autonavi.aps.amapapi.utils.a.f5837b = r3
            com.autonavi.aps.amapapi.utils.a.f5838c = r0
            com.autonavi.aps.amapapi.utils.a.H = r1
            r5 = -1
            com.autonavi.aps.amapapi.utils.a.I = r5
            com.autonavi.aps.amapapi.utils.a.J = r1
            com.autonavi.aps.amapapi.utils.a.K = r1
            com.autonavi.aps.amapapi.utils.a.L = r0
            com.autonavi.aps.amapapi.utils.a.M = r2
            com.autonavi.aps.amapapi.utils.a.N = r0
            java.lang.String r1 = "CMjAzLjEwNy4xLjEvMTU0MDgxL2Q"
            com.autonavi.aps.amapapi.utils.a.O = r1
            com.autonavi.aps.amapapi.utils.a.P = r3
            com.autonavi.aps.amapapi.utils.a.f5839d = r0
            com.autonavi.aps.amapapi.utils.a.f5840e = r0
            r1 = 20480(0x5000, float:2.8699E-41)
            com.autonavi.aps.amapapi.utils.a.f5841f = r1
            r1 = 10800000(0xa4cb80, float:1.5134023E-38)
            com.autonavi.aps.amapapi.utils.a.f5842g = r1
            com.autonavi.aps.amapapi.utils.a.f5843h = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r3) {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.f5844i
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            com.autonavi.aps.amapapi.utils.a.f5844i = r0
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()
            java.lang.String r1 = com.autonavi.aps.amapapi.utils.b.d()
            com.autonavi.aps.amapapi.utils.a$1 r2 = new com.autonavi.aps.amapapi.utils.a$1
            r2.<init>(r3)
            com.amap.api.col.p0003l.g4.i(r3, r0, r1, r2)
            return
    }

    private static void a(android.content.Context r5, org.json.JSONObject r6, android.content.SharedPreferences.Editor r7) {
            java.lang.String r0 = "asw"
            java.lang.String r1 = "AuthUtil"
            java.lang.String r2 = "13S"
            org.json.JSONObject r6 = r6.optJSONObject(r2)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L77
            java.lang.String r2 = "at"
            r3 = 123(0x7b, float:1.72E-43)
            int r2 = r6.optInt(r2, r3)     // Catch: java.lang.Throwable -> L22
            r3 = 60000(0xea60, float:8.4078E-41)
            int r2 = r2 * r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L22
            com.autonavi.aps.amapapi.utils.a.a = r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "13S_at"
            com.autonavi.aps.amapapi.utils.i.a(r7, r4, r2)     // Catch: java.lang.Throwable -> L22
            goto L28
        L22:
            r2 = move-exception
            java.lang.String r3 = "requestSdkAuthInterval"
            com.autonavi.aps.amapapi.utils.b.a(r2, r1, r3)     // Catch: java.lang.Throwable -> L75
        L28:
            e(r6, r7)     // Catch: java.lang.Throwable -> L75
            r1 = 1
            java.lang.String r2 = "nla"
            java.lang.String r2 = r6.optString(r2)     // Catch: java.lang.Throwable -> L3d
            boolean r2 = com.amap.api.col.p0003l.g4.x(r2, r1)     // Catch: java.lang.Throwable -> L3d
            com.autonavi.aps.amapapi.utils.a.F = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "13S_nla"
            com.autonavi.aps.amapapi.utils.i.a(r7, r3, r2)     // Catch: java.lang.Throwable -> L3d
        L3d:
            java.lang.String r2 = r6.optString(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = com.amap.api.col.p0003l.g4.x(r2, r1)     // Catch: java.lang.Throwable -> L4a
            com.autonavi.aps.amapapi.utils.a.H = r1     // Catch: java.lang.Throwable -> L4a
            com.autonavi.aps.amapapi.utils.i.a(r7, r0, r1)     // Catch: java.lang.Throwable -> L4a
        L4a:
            java.lang.String r0 = "mlpl"
            org.json.JSONArray r6 = r6.optJSONArray(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "13S_mlpl"
            if (r6 == 0) goto L6e
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L77
            if (r1 <= 0) goto L6e
            if (r5 == 0) goto L6e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = com.amap.api.col.p0003l.q4.q(r1)     // Catch: java.lang.Throwable -> L77
            com.autonavi.aps.amapapi.utils.i.a(r7, r0, r1)     // Catch: java.lang.Throwable -> L77
            boolean r5 = a(r5, r6)     // Catch: java.lang.Throwable -> L77
            com.autonavi.aps.amapapi.utils.a.G = r5     // Catch: java.lang.Throwable -> L77
            goto L77
        L6e:
            r5 = 0
            com.autonavi.aps.amapapi.utils.a.G = r5     // Catch: java.lang.Throwable -> L77
            com.autonavi.aps.amapapi.utils.i.a(r7, r0)     // Catch: java.lang.Throwable -> L77
            goto L77
        L75:
            r5 = move-exception
            goto L78
        L77:
            return
        L78:
            java.lang.String r6 = "loadConfigAbleStatus"
            com.autonavi.aps.amapapi.utils.b.a(r5, r1, r6)
            return
    }

    private static void a(com.amap.api.col.3l.g4.c r9, android.content.SharedPreferences.Editor r10) {
            com.amap.api.col.3l.g4$c$a r9 = r9.f3394g     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L8a
            boolean r0 = r9.a     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.f5845j = r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "exception"
            com.autonavi.aps.amapapi.utils.i.a(r10, r1, r0)     // Catch: java.lang.Throwable -> L8b
            org.json.JSONObject r9 = r9.f3398c     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "pms"
            java.lang.String r1 = "rot"
            java.lang.String r2 = "ms"
            java.lang.String r3 = "igu"
            java.lang.String r4 = "mpn"
            java.lang.String r5 = "fn"
            if (r9 == 0) goto L5a
            int r6 = com.autonavi.aps.amapapi.utils.a.f5846k     // Catch: java.lang.Throwable -> L8b
            int r6 = r9.optInt(r5, r6)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.f5846k = r6     // Catch: java.lang.Throwable -> L8b
            int r6 = com.autonavi.aps.amapapi.utils.a.l     // Catch: java.lang.Throwable -> L8b
            int r6 = r9.optInt(r4, r6)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.l = r6     // Catch: java.lang.Throwable -> L8b
            r7 = 500(0x1f4, float:7.0E-43)
            if (r6 <= r7) goto L33
            com.autonavi.aps.amapapi.utils.a.l = r7     // Catch: java.lang.Throwable -> L8b
        L33:
            int r6 = com.autonavi.aps.amapapi.utils.a.l     // Catch: java.lang.Throwable -> L8b
            r7 = 30
            if (r6 >= r7) goto L3b
            com.autonavi.aps.amapapi.utils.a.l = r7     // Catch: java.lang.Throwable -> L8b
        L3b:
            java.lang.String r6 = r9.optString(r3)     // Catch: java.lang.Throwable -> L8b
            r7 = 0
            boolean r6 = com.amap.api.col.p0003l.g4.x(r6, r7)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.m = r6     // Catch: java.lang.Throwable -> L8b
            int r6 = com.autonavi.aps.amapapi.utils.a.n     // Catch: java.lang.Throwable -> L8b
            int r6 = r9.optInt(r2, r6)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.n = r6     // Catch: java.lang.Throwable -> L8b
            int r6 = r9.optInt(r1, r7)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.p = r6     // Catch: java.lang.Throwable -> L8b
            int r9 = r9.optInt(r0, r7)     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.a.o = r9     // Catch: java.lang.Throwable -> L8b
        L5a:
            int r9 = com.autonavi.aps.amapapi.utils.a.f5846k     // Catch: java.lang.Throwable -> L8b
            boolean r6 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L8b
            int r7 = com.autonavi.aps.amapapi.utils.a.n     // Catch: java.lang.Throwable -> L8b
            int r8 = com.autonavi.aps.amapapi.utils.a.o     // Catch: java.lang.Throwable -> L8b
            com.amap.api.col.p0003l.h7.c(r9, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            boolean r9 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L8b
            int r6 = com.autonavi.aps.amapapi.utils.a.o     // Catch: java.lang.Throwable -> L8b
            com.amap.api.col.p0003l.j7.f(r9, r6)     // Catch: java.lang.Throwable -> L8b
            int r9 = com.autonavi.aps.amapapi.utils.a.f5846k     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r5, r9)     // Catch: java.lang.Throwable -> L8b
            int r9 = com.autonavi.aps.amapapi.utils.a.l     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r4, r9)     // Catch: java.lang.Throwable -> L8b
            boolean r9 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r3, r9)     // Catch: java.lang.Throwable -> L8b
            int r9 = com.autonavi.aps.amapapi.utils.a.n     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r2, r9)     // Catch: java.lang.Throwable -> L8b
            int r9 = com.autonavi.aps.amapapi.utils.a.p     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r1, r9)     // Catch: java.lang.Throwable -> L8b
            int r9 = com.autonavi.aps.amapapi.utils.a.o     // Catch: java.lang.Throwable -> L8b
            com.autonavi.aps.amapapi.utils.i.a(r10, r0, r9)     // Catch: java.lang.Throwable -> L8b
        L8a:
            return
        L8b:
            r9 = move-exception
            java.lang.String r10 = "AuthUtil"
            java.lang.String r0 = "loadConfigDataUploadException"
            com.autonavi.aps.amapapi.utils.b.a(r9, r10, r0)
            return
    }

    private static void a(org.json.JSONObject r4, android.content.SharedPreferences.Editor r5) {
            java.lang.String r0 = "11G"
            org.json.JSONObject r4 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L6d
            java.lang.String r0 = "able"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L6e
            r1 = 1
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.a.x = r0     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L24
            java.lang.String r0 = "c"
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r4.optInt(r0, r1)     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.a.y = r0     // Catch: java.lang.Throwable -> L6e
        L24:
            java.lang.String r0 = "fa"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L6e
            r1 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.a.z = r0     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "ms"
            r1 = 4603741668684706349(0x3fe3c6a7ef9db22d, double:0.618)
            double r0 = r4.optDouble(r0, r1)     // Catch: java.lang.Throwable -> L6e
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r0 = java.lang.Math.max(r2, r0)     // Catch: java.lang.Throwable -> L6e
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.a.A = r0     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "ca"
            boolean r0 = com.autonavi.aps.amapapi.utils.a.x     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r5, r4, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "ct"
            long r0 = com.autonavi.aps.amapapi.utils.a.y     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r5, r4, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "11G_fa"
            boolean r0 = com.autonavi.aps.amapapi.utils.a.z     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r5, r4, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "11G_ms"
            double r0 = com.autonavi.aps.amapapi.utils.a.A     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6e
            com.autonavi.aps.amapapi.utils.i.a(r5, r4, r0)     // Catch: java.lang.Throwable -> L6e
        L6d:
            return
        L6e:
            r4 = move-exception
            java.lang.String r5 = "AuthUtil"
            java.lang.String r0 = "loadConfigDataCacheAble"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
            return
    }

    public static boolean a() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.f5845j
            return r0
    }

    public static boolean a(long r6) {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.x
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = com.autonavi.aps.amapapi.utils.j.a()
            long r2 = r2 - r6
            long r6 = com.autonavi.aps.amapapi.utils.a.y
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L19
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r6 = 1
            return r6
    }

    static boolean a(android.content.Context r2, com.amap.api.col.3l.g4.c r3) {
            java.lang.String r0 = "pref"
            android.content.SharedPreferences$Editor r0 = com.autonavi.aps.amapapi.utils.i.a(r2, r0)     // Catch: java.lang.Throwable -> L3a
            a(r3, r0)     // Catch: java.lang.Throwable -> L38
            c(r2)     // Catch: java.lang.Throwable -> L38
            org.json.JSONObject r3 = r3.f3393f     // Catch: java.lang.Throwable -> L38
            r1 = 1
            if (r3 != 0) goto L17
            if (r0 == 0) goto L16
            com.autonavi.aps.amapapi.utils.i.a(r0)     // Catch: java.lang.Throwable -> L16
        L16:
            return r1
        L17:
            a(r2, r3, r0)     // Catch: java.lang.Throwable -> L38
            a(r3, r0)     // Catch: java.lang.Throwable -> L38
            d(r3, r0)     // Catch: java.lang.Throwable -> L38
            f(r3, r0)     // Catch: java.lang.Throwable -> L38
            h(r3, r0)     // Catch: java.lang.Throwable -> L38
            g(r3, r0)     // Catch: java.lang.Throwable -> L38
            i(r3, r0)     // Catch: java.lang.Throwable -> L38
            b(r3, r0)     // Catch: java.lang.Throwable -> L38
            c(r3, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L37
            com.autonavi.aps.amapapi.utils.i.a(r0)     // Catch: java.lang.Throwable -> L37
        L37:
            return r1
        L38:
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L40
            com.autonavi.aps.amapapi.utils.i.a(r0)     // Catch: java.lang.Throwable -> L40
        L40:
            r2 = 0
            return r2
    }

    private static boolean a(android.content.Context r3, org.json.JSONArray r4) {
            r0 = 0
            if (r4 == 0) goto L21
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L21
            if (r1 <= 0) goto L21
            if (r3 == 0) goto L21
            r1 = 0
        Lc:
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L21
            if (r1 >= r2) goto L21
            java.lang.String r2 = r4.getString(r1)     // Catch: java.lang.Throwable -> L21
            boolean r2 = com.autonavi.aps.amapapi.utils.j.b(r3, r2)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            int r1 = r1 + 1
            goto Lc
        L21:
            return r0
    }

    public static int b() {
            int r0 = com.autonavi.aps.amapapi.utils.a.l
            return r0
    }

    public static void b(android.content.Context r8) {
            java.lang.String r0 = ""
            java.lang.String r1 = "AuthUtil"
            java.lang.String r2 = "pref"
            boolean r3 = com.autonavi.aps.amapapi.utils.a.w
            if (r3 == 0) goto Lc
            goto L20c
        Lc:
            r3 = 1
            com.autonavi.aps.amapapi.utils.a.w = r3
            java.lang.String r3 = "exception"
            boolean r4 = com.autonavi.aps.amapapi.utils.a.f5845j     // Catch: java.lang.Throwable -> L1d
            boolean r3 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            com.autonavi.aps.amapapi.utils.a.f5845j = r3     // Catch: java.lang.Throwable -> L1d
            c(r8)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            r3 = move-exception
            java.lang.String r4 = "loadLastAbleState p1"
            com.autonavi.aps.amapapi.utils.b.a(r3, r1, r4)
        L23:
            r3 = 0
            java.lang.String r4 = "fn"
            int r5 = com.autonavi.aps.amapapi.utils.a.f5846k     // Catch: java.lang.Throwable -> L6d
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.f5846k = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "mpn"
            int r5 = com.autonavi.aps.amapapi.utils.a.l     // Catch: java.lang.Throwable -> L6d
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.l = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "igu"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L6d
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.m = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "ms"
            int r5 = com.autonavi.aps.amapapi.utils.a.n     // Catch: java.lang.Throwable -> L6d
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.n = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "rot"
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.p = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "pms"
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L6d
            com.autonavi.aps.amapapi.utils.a.o = r4     // Catch: java.lang.Throwable -> L6d
            int r5 = com.autonavi.aps.amapapi.utils.a.f5846k     // Catch: java.lang.Throwable -> L6d
            boolean r6 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L6d
            int r7 = com.autonavi.aps.amapapi.utils.a.n     // Catch: java.lang.Throwable -> L6d
            com.amap.api.col.p0003l.h7.c(r5, r6, r7, r4)     // Catch: java.lang.Throwable -> L6d
            boolean r4 = com.autonavi.aps.amapapi.utils.a.m     // Catch: java.lang.Throwable -> L6d
            int r5 = com.autonavi.aps.amapapi.utils.a.o     // Catch: java.lang.Throwable -> L6d
            com.amap.api.col.p0003l.j7.f(r4, r5)     // Catch: java.lang.Throwable -> L6d
            goto L73
        L6d:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L73:
            java.lang.String r4 = "ca"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.x     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb3
            com.autonavi.aps.amapapi.utils.a.x = r4     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "ct"
            long r5 = com.autonavi.aps.amapapi.utils.a.y     // Catch: java.lang.Throwable -> Lb3
            long r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb3
            com.autonavi.aps.amapapi.utils.a.y = r4     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "11G_fa"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.z     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb3
            com.autonavi.aps.amapapi.utils.a.z = r4     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "11G_ms"
            double r5 = com.autonavi.aps.amapapi.utils.a.A     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> Lb3
            double r4 = r4.doubleValue()     // Catch: java.lang.Throwable -> Lb3
            com.autonavi.aps.amapapi.utils.a.A = r4     // Catch: java.lang.Throwable -> Lb3
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r4 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> Lb3
            com.autonavi.aps.amapapi.utils.a.A = r4     // Catch: java.lang.Throwable -> Lb3
            goto Lb9
        Lb3:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p3"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        Lb9:
            java.lang.String r4 = "fr"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.f5838c     // Catch: java.lang.Throwable -> Lc4
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Lc4
            com.autonavi.aps.amapapi.utils.a.f5838c = r4     // Catch: java.lang.Throwable -> Lc4
            goto Lca
        Lc4:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p4"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        Lca:
            java.lang.String r4 = "asw"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.H     // Catch: java.lang.Throwable -> Ld5
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Ld5
            com.autonavi.aps.amapapi.utils.a.H = r4     // Catch: java.lang.Throwable -> Ld5
            goto Ldb
        Ld5:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p5"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        Ldb:
            java.lang.String r4 = "awsi"
            long r5 = com.autonavi.aps.amapapi.utils.a.I     // Catch: java.lang.Throwable -> Le6
            long r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> Le6
            com.autonavi.aps.amapapi.utils.a.I = r4     // Catch: java.lang.Throwable -> Le6
            goto Lec
        Le6:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p6"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        Lec:
            java.lang.String r4 = "15ua"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.J     // Catch: java.lang.Throwable -> L10b
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L10b
            com.autonavi.aps.amapapi.utils.a.J = r4     // Catch: java.lang.Throwable -> L10b
            java.lang.String r4 = "15un"
            int r5 = com.autonavi.aps.amapapi.utils.a.K     // Catch: java.lang.Throwable -> L10b
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L10b
            com.autonavi.aps.amapapi.utils.a.K = r4     // Catch: java.lang.Throwable -> L10b
            java.lang.String r4 = "15ust"
            long r5 = com.autonavi.aps.amapapi.utils.a.P     // Catch: java.lang.Throwable -> L10b
            long r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L10b
            com.autonavi.aps.amapapi.utils.a.P = r4     // Catch: java.lang.Throwable -> L10b
            goto L111
        L10b:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p7"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L111:
            java.lang.String r4 = "ok9"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.L     // Catch: java.lang.Throwable -> L130
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L130
            com.autonavi.aps.amapapi.utils.a.L = r4     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = "ok10"
            int r5 = com.autonavi.aps.amapapi.utils.a.M     // Catch: java.lang.Throwable -> L130
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L130
            com.autonavi.aps.amapapi.utils.a.M = r4     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = "ok11"
            java.lang.String r5 = com.autonavi.aps.amapapi.utils.a.O     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L130
            com.autonavi.aps.amapapi.utils.a.O = r4     // Catch: java.lang.Throwable -> L130
            goto L136
        L130:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p8"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L136:
            java.lang.String r4 = "17ya"
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L161
            com.autonavi.aps.amapapi.utils.a.f5839d = r4     // Catch: java.lang.Throwable -> L161
            java.lang.String r4 = "17ym"
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L161
            com.autonavi.aps.amapapi.utils.a.f5840e = r4     // Catch: java.lang.Throwable -> L161
            java.lang.String r4 = "17yi"
            r5 = 2
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L161
            r5 = 3600000(0x36ee80, float:5.044674E-39)
            int r4 = r4 * r5
            com.autonavi.aps.amapapi.utils.a.f5842g = r4     // Catch: java.lang.Throwable -> L161
            java.lang.String r4 = "17yx"
            r5 = 100
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L161
            int r4 = r4 * 1024
            com.autonavi.aps.amapapi.utils.a.f5841f = r4     // Catch: java.lang.Throwable -> L161
            goto L167
        L161:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p9"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L167:
            long r4 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.f5837b = r4     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r4 = "13S_at"
            long r5 = com.autonavi.aps.amapapi.utils.a.a     // Catch: java.lang.Throwable -> L1a0
            long r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.a = r4     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r4 = "13S_nla"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.F     // Catch: java.lang.Throwable -> L1a0
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.F = r4     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r4 = "13J_able"
            boolean r5 = com.autonavi.aps.amapapi.utils.a.B     // Catch: java.lang.Throwable -> L1a0
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.B = r4     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r4 = "13J_c"
            int r5 = com.autonavi.aps.amapapi.utils.a.C     // Catch: java.lang.Throwable -> L1a0
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.C = r4     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r4 = "13J_t"
            int r5 = com.autonavi.aps.amapapi.utils.a.D     // Catch: java.lang.Throwable -> L1a0
            int r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1a0
            com.autonavi.aps.amapapi.utils.a.D = r4     // Catch: java.lang.Throwable -> L1a0
            goto L1a6
        L1a0:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p10"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L1a6:
            com.amap.api.col.p0003l.g4.D(r8)
            java.lang.String r4 = "13S_mlpl"
            r5 = 0
            java.lang.String r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r5)     // Catch: java.lang.Throwable -> L1c6
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1c6
            if (r5 != 0) goto L1cc
            java.lang.String r4 = com.amap.api.col.p0003l.q4.u(r4)     // Catch: java.lang.Throwable -> L1c6
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1c6
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1c6
            boolean r4 = a(r8, r5)     // Catch: java.lang.Throwable -> L1c6
            com.autonavi.aps.amapapi.utils.a.G = r4     // Catch: java.lang.Throwable -> L1c6
            goto L1cc
        L1c6:
            r4 = move-exception
            java.lang.String r5 = "loadLastAbleState p11"
            com.autonavi.aps.amapapi.utils.b.a(r4, r1, r5)
        L1cc:
            java.lang.String r4 = "197a"
            boolean r4 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r5 = "197dv"
            java.lang.String r5 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r5, r0)     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r6 = "197tv"
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r6, r0)     // Catch: java.lang.Throwable -> L1f8
            if (r4 == 0) goto L202
            java.lang.String r4 = com.autonavi.aps.amapapi.utils.b.a     // Catch: java.lang.Throwable -> L1f8
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L1f8
            if (r4 == 0) goto L202
            java.lang.String[] r4 = com.autonavi.aps.amapapi.utils.b.f5847b     // Catch: java.lang.Throwable -> L1f8
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1f8
        L1eb:
            if (r3 >= r5) goto L202
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L1f8
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L1f8
            if (r6 == 0) goto L1fa
            com.autonavi.aps.amapapi.utils.b.a = r0     // Catch: java.lang.Throwable -> L1f8
            goto L1fa
        L1f8:
            r0 = move-exception
            goto L1fd
        L1fa:
            int r3 = r3 + 1
            goto L1eb
        L1fd:
            java.lang.String r3 = "loadLastAbleState p12"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r3)
        L202:
            java.lang.String r0 = "1A6"
            boolean r3 = com.autonavi.aps.amapapi.utils.a.f5843h     // Catch: java.lang.Throwable -> L20d
            boolean r8 = com.autonavi.aps.amapapi.utils.i.a(r8, r2, r0, r3)     // Catch: java.lang.Throwable -> L20d
            com.autonavi.aps.amapapi.utils.a.f5843h = r8     // Catch: java.lang.Throwable -> L20d
        L20c:
            return
        L20d:
            r8 = move-exception
            java.lang.String r0 = "loadSdkEnableConfig p13"
            com.autonavi.aps.amapapi.utils.b.a(r8, r1, r0)
            return
    }

    private static void b(org.json.JSONObject r4, android.content.SharedPreferences.Editor r5) {
            if (r4 != 0) goto L3
            goto L3c
        L3:
            java.lang.String r0 = "197"
            org.json.JSONObject r4 = r4.getJSONObject(r0)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L3c
            java.lang.String r0 = "able"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "197a"
            com.autonavi.aps.amapapi.utils.i.a(r5, r1, r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "197tv"
            java.lang.String r2 = "197dv"
            java.lang.String r3 = ""
            if (r0 == 0) goto L36
            java.lang.String r0 = "sv"
            java.lang.String r0 = r4.optString(r0, r3)     // Catch: java.lang.Throwable -> L3c
            com.autonavi.aps.amapapi.utils.i.a(r5, r2, r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "tv"
            java.lang.String r4 = r4.optString(r0, r3)     // Catch: java.lang.Throwable -> L3c
            com.autonavi.aps.amapapi.utils.i.a(r5, r1, r4)     // Catch: java.lang.Throwable -> L3c
            return
        L36:
            com.autonavi.aps.amapapi.utils.i.a(r5, r2, r3)     // Catch: java.lang.Throwable -> L3c
            com.autonavi.aps.amapapi.utils.i.a(r5, r1, r3)     // Catch: java.lang.Throwable -> L3c
        L3c:
            return
    }

    public static int c() {
            int r0 = com.autonavi.aps.amapapi.utils.a.p
            if (r0 >= 0) goto L7
            r0 = 0
            com.autonavi.aps.amapapi.utils.a.p = r0
        L7:
            int r0 = com.autonavi.aps.amapapi.utils.a.p
            return r0
    }

    public static void c(android.content.Context r2) {
            com.amap.api.col.3l.p4 r0 = com.autonavi.aps.amapapi.utils.b.c()     // Catch: java.lang.Throwable -> Lc
            boolean r1 = com.autonavi.aps.amapapi.utils.a.f5845j     // Catch: java.lang.Throwable -> Lc
            r0.c(r1)     // Catch: java.lang.Throwable -> Lc
            com.amap.api.col.p0003l.w5.g(r2, r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    private static void c(org.json.JSONObject r2, android.content.SharedPreferences.Editor r3) {
            java.lang.String r0 = "1A6"
            if (r2 != 0) goto L5
            goto L1b
        L5:
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            java.lang.String r1 = "ic"
            java.lang.String r2 = r2.optString(r1)     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            boolean r2 = com.amap.api.col.p0003l.g4.x(r2, r1)     // Catch: java.lang.Throwable -> L1b
            com.autonavi.aps.amapapi.utils.i.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L1b
            com.autonavi.aps.amapapi.utils.a.f5843h = r2     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static long d() {
            long r0 = com.autonavi.aps.amapapi.utils.a.y
            return r0
    }

    private static void d(org.json.JSONObject r2, android.content.SharedPreferences.Editor r3) {
            java.lang.String r0 = "13J"
            org.json.JSONObject r2 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            java.lang.String r0 = "able"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Throwable -> L41
            r1 = 1
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.a.B = r0     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2b
            java.lang.String r0 = "c"
            int r1 = com.autonavi.aps.amapapi.utils.a.C     // Catch: java.lang.Throwable -> L41
            int r0 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.a.C = r0     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "t"
            int r1 = com.autonavi.aps.amapapi.utils.a.D     // Catch: java.lang.Throwable -> L41
            int r2 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.a.D = r2     // Catch: java.lang.Throwable -> L41
        L2b:
            java.lang.String r2 = "13J_able"
            boolean r0 = com.autonavi.aps.amapapi.utils.a.B     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.i.a(r3, r2, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "13J_c"
            int r0 = com.autonavi.aps.amapapi.utils.a.C     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.i.a(r3, r2, r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "13J_t"
            int r0 = com.autonavi.aps.amapapi.utils.a.D     // Catch: java.lang.Throwable -> L41
            com.autonavi.aps.amapapi.utils.i.a(r3, r2, r0)     // Catch: java.lang.Throwable -> L41
        L40:
            return
        L41:
            r2 = move-exception
            java.lang.String r3 = "AuthUtil"
            java.lang.String r0 = "loadConfigDataGpsGeoAble"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    private static void e(org.json.JSONObject r1, android.content.SharedPreferences.Editor r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "re"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            boolean r1 = com.amap.api.col.p0003l.g4.x(r1, r0)     // Catch: java.lang.Throwable -> L16
            com.autonavi.aps.amapapi.utils.a.f5838c = r1     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "fr"
            com.autonavi.aps.amapapi.utils.i.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            java.lang.String r2 = "AuthUtil"
            java.lang.String r0 = "checkReLocationAble"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r0)
            return
    }

    public static boolean e() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.x
            return r0
    }

    private static void f(org.json.JSONObject r2, android.content.SharedPreferences.Editor r3) {
            java.lang.String r0 = "15O"
            org.json.JSONObject r2 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L48
            java.lang.String r0 = "able"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Throwable -> L48
            r1 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3d
            java.lang.String r0 = "fl"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L2f
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L48
            if (r1 <= 0) goto L2f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L48
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3d
        L2f:
            java.lang.String r0 = "iv"
            r1 = 30
            int r2 = r2.optInt(r0, r1)     // Catch: java.lang.Throwable -> L48
            int r2 = r2 * 1000
            long r0 = (long) r2     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.utils.a.I = r0     // Catch: java.lang.Throwable -> L48
            goto L41
        L3d:
            r0 = -1
            com.autonavi.aps.amapapi.utils.a.I = r0     // Catch: java.lang.Throwable -> L48
        L41:
            java.lang.String r2 = "awsi"
            long r0 = com.autonavi.aps.amapapi.utils.a.I     // Catch: java.lang.Throwable -> L48
            com.autonavi.aps.amapapi.utils.i.a(r3, r2, r0)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }

    public static boolean f() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.z
            return r0
    }

    public static double g() {
            double r0 = com.autonavi.aps.amapapi.utils.a.A
            return r0
    }

    private static void g(org.json.JSONObject r3, android.content.SharedPreferences.Editor r4) {
            if (r3 != 0) goto L3
            goto L56
        L3:
            java.lang.String r0 = "17Y"
            org.json.JSONObject r3 = r3.getJSONObject(r0)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L56
            java.lang.String r0 = "able"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L56
            r1 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L56
            com.autonavi.aps.amapapi.utils.a.f5839d = r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "17ya"
            com.autonavi.aps.amapapi.utils.i.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "mup"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L56
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L56
            com.autonavi.aps.amapapi.utils.a.f5840e = r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "17ym"
            com.autonavi.aps.amapapi.utils.i.a(r4, r1, r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "max"
            r1 = 20
            int r0 = r3.optInt(r0, r1)     // Catch: java.lang.Throwable -> L56
            if (r0 <= 0) goto L41
            java.lang.String r1 = "17yx"
            com.autonavi.aps.amapapi.utils.i.a(r4, r1, r0)     // Catch: java.lang.Throwable -> L56
            int r0 = r0 * 1024
            com.autonavi.aps.amapapi.utils.a.f5841f = r0     // Catch: java.lang.Throwable -> L56
        L41:
            java.lang.String r0 = "inv"
            r1 = 3
            int r3 = r3.optInt(r0, r1)     // Catch: java.lang.Throwable -> L56
            if (r3 <= 0) goto L56
            java.lang.String r0 = "17yi"
            com.autonavi.aps.amapapi.utils.i.a(r4, r0, r3)     // Catch: java.lang.Throwable -> L56
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 * r4
            com.autonavi.aps.amapapi.utils.a.f5842g = r3     // Catch: java.lang.Throwable -> L56
        L56:
            return
    }

    private static void h(org.json.JSONObject r5, android.content.SharedPreferences.Editor r6) {
            java.lang.String r0 = "15U"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            java.lang.String r0 = "able"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Throwable -> L36
            r1 = 1
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "yn"
            int r2 = com.autonavi.aps.amapapi.utils.a.K     // Catch: java.lang.Throwable -> L36
            int r1 = r5.optInt(r1, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "sysTime"
            long r3 = com.autonavi.aps.amapapi.utils.a.P     // Catch: java.lang.Throwable -> L36
            long r2 = r5.optLong(r2, r3)     // Catch: java.lang.Throwable -> L36
            com.autonavi.aps.amapapi.utils.a.P = r2     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "15ua"
            com.autonavi.aps.amapapi.utils.i.a(r6, r5, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "15un"
            com.autonavi.aps.amapapi.utils.i.a(r6, r5, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "15ust"
            long r0 = com.autonavi.aps.amapapi.utils.a.P     // Catch: java.lang.Throwable -> L36
            com.autonavi.aps.amapapi.utils.i.a(r6, r5, r0)     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }

    public static boolean h() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.B
            return r0
    }

    public static int i() {
            int r0 = com.autonavi.aps.amapapi.utils.a.C
            return r0
    }

    private static void i(org.json.JSONObject r4, android.content.SharedPreferences.Editor r5) {
            if (r4 != 0) goto L3
            goto L5e
        L3:
            java.lang.String r0 = "17J"
            org.json.JSONObject r4 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L5e
            java.lang.String r0 = "able"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L5e
            com.autonavi.aps.amapapi.utils.a.L = r0     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "ok9"
            com.autonavi.aps.amapapi.utils.i.a(r5, r2, r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L5e
            java.lang.String r0 = "auth"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "ht"
            java.lang.String r2 = r4.optString(r2)     // Catch: java.lang.Throwable -> L5e
            com.autonavi.aps.amapapi.utils.a.O = r2     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "ok11"
            com.autonavi.aps.amapapi.utils.i.a(r5, r3, r2)     // Catch: java.lang.Throwable -> L5e
            com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "nr"
            java.lang.String r0 = r4.optString(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = com.amap.api.col.p0003l.g4.x(r0, r1)     // Catch: java.lang.Throwable -> L5e
            com.autonavi.aps.amapapi.utils.a.N = r0     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "tm"
            java.lang.String r4 = r4.optString(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L5e
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 <= 0) goto L5e
            r0 = 20
            if (r4 >= r0) goto L5e
            com.autonavi.aps.amapapi.utils.a.M = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "ok10"
            com.autonavi.aps.amapapi.utils.i.a(r5, r0, r4)     // Catch: java.lang.Throwable -> L5e
        L5e:
            return
    }

    public static int j() {
            int r0 = com.autonavi.aps.amapapi.utils.a.D
            return r0
    }

    public static boolean k() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.F
            return r0
    }

    public static boolean l() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.G
            return r0
    }

    public static boolean m() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.f5838c
            return r0
    }

    public static boolean n() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.H
            return r0
    }

    public static long o() {
            long r0 = com.autonavi.aps.amapapi.utils.a.I
            return r0
    }

    public static boolean p() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.N
            return r0
    }

    public static boolean q() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.L
            return r0
    }

    public static java.lang.String r() {
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.a.O
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            return r0
    }

    public static boolean s() {
            boolean r0 = com.autonavi.aps.amapapi.utils.a.J
            if (r0 == 0) goto La
            int r0 = com.autonavi.aps.amapapi.utils.a.K
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static int t() {
            int r0 = com.autonavi.aps.amapapi.utils.a.K
            return r0
    }

    public static long u() {
            long r0 = com.autonavi.aps.amapapi.utils.a.P
            return r0
    }
}
