package cn.jpush.android.b;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jpush.android.b.c {

    /* renamed from: b, reason: collision with root package name */
    private long f1721b;

    /* renamed from: c, reason: collision with root package name */
    private android.location.LocationManager f1722c;

    /* renamed from: d, reason: collision with root package name */
    private android.os.Handler f1723d;

    /* renamed from: e, reason: collision with root package name */
    private long f1724e;

    /* renamed from: f, reason: collision with root package name */
    private long f1725f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f1726g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1727h;

    /* renamed from: i, reason: collision with root package name */
    @android.annotation.SuppressLint({"MissingPermission"})
    private android.location.LocationListener f1728i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f1729j;




    public a(android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            r0 = 900000(0xdbba0, double:4.44659E-318)
            r4.f1724e = r0
            r2 = 30000(0x7530, double:1.4822E-319)
            r4.f1725f = r2
            r2 = 0
            r4.f1727h = r2
            cn.jpush.android.b.a$1 r2 = new cn.jpush.android.b.a$1
            r2.<init>(r4)
            r4.f1728i = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r4.f1729j = r2
            java.lang.String r2 = "location"
            java.lang.Object r2 = r5.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r4.f1722c = r2
            long r0 = cn.jpush.android.cache.a.c(r5, r0)
            r4.f1724e = r0
            r0 = -1
            long r0 = cn.jpush.android.cache.a.c(r5, r0)
            r4.f1721b = r0
            return
    }

    static /* synthetic */ android.location.LocationManager a(cn.jpush.android.b.a r0) {
            android.location.LocationManager r0 = r0.f1722c
            return r0
    }

    static /* synthetic */ java.lang.String a(cn.jpush.android.b.a r0, java.lang.String r1) {
            r0.f1726g = r1
            return r1
    }

    private void a(android.location.Location r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "current location:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r3, r2)
            android.os.Handler r2 = r0.f1723d
            if (r2 == 0) goto L2b
            r4 = 1001(0x3e9, float:1.403E-42)
            boolean r2 = r2.hasMessages(r4)
            if (r2 == 0) goto L2b
            android.os.Handler r2 = r0.f1723d
            r2.removeMessages(r4)
        L2b:
            if (r1 != 0) goto L2f
            goto L1d6
        L2f:
            cn.jpush.android.n.e r2 = cn.jpush.android.n.e.a()
            int r2 = r2.c()
            if (r2 > 0) goto L3b
            goto L1d6
        L3b:
            double r4 = r1.getLongitude()
            double r6 = r1.getLatitude()
            cn.jpush.android.n.e r2 = cn.jpush.android.n.e.a()
            java.util.LinkedHashMap r2 = r2.b()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r13 = 0
        L54:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L1a1
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            r14 = r8
            cn.jpush.android.b.b r14 = (cn.jpush.android.b.b) r14
            long r8 = r14.f1733e
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r10 = java.lang.System.currentTimeMillis()
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 > 0) goto L96
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Out of date geofence "
            r8.append(r9)
            java.lang.String r9 = r14.a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.dd(r3, r8)
            r2.remove()
            cn.jpush.android.n.e r8 = cn.jpush.android.n.e.a()
            r8.a(r14)
            goto L54
        L96:
            double r8 = r14.f1734f
            double r10 = r14.f1735g
            double r8 = cn.jpush.android.ad.m.a(r4, r6, r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r14.a
            r10.append(r11)
            java.lang.String r11 = " distance to center:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.dd(r3, r10)
            long r10 = r14.f1730b
            r16 = r13
            double r12 = (double) r10
            java.lang.String r15 = "out"
            int r17 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r17 > 0) goto Lc5
            java.lang.String r12 = "in"
            goto Lc6
        Lc5:
            r12 = r15
        Lc6:
            double r10 = (double) r10
            double r8 = r8 - r10
            double r8 = java.lang.Math.abs(r8)
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 >= 0) goto Ld8
            r8 = 1
            r13 = 1
            goto Lda
        Ld8:
            r13 = r16
        Lda:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "lastStatus:"
            r8.append(r9)
            java.lang.String r9 = r14.f1736h
            r8.append(r9)
            java.lang.String r9 = ",currentStatus:"
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.d(r3, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "geofence status :"
            r8.append(r10)
            java.lang.String r10 = r14.f1736h
            r8.append(r10)
            r8.append(r9)
            r8.append(r12)
            java.lang.String r9 = ",geoStatus:"
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.d(r3, r8)
            java.lang.String r8 = r14.f1731c
            java.lang.String r9 = "inside"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L131
            java.lang.String r8 = r14.f1736h
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L131
        L12e:
            r15 = 0
            goto L54
        L131:
            java.lang.String r8 = r14.f1731c
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L13c
            if (r12 != r15) goto L13c
            goto L12e
        L13c:
            java.lang.String r8 = r14.f1731c
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L150
            java.lang.String r8 = r14.f1736h
            if (r8 == 0) goto L18f
            java.lang.String r8 = r14.f1731c
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L18f
        L150:
            boolean r8 = r0.d(r14)
            if (r8 == 0) goto L18f
            r0.c(r14)
            r0.a(r14, r1)
            r8 = r4
            android.content.Context r4 = r0.a
            org.json.JSONObject r5 = r14.a()
            java.lang.String r5 = r5.toString()
            cn.jpush.android.n.a.a(r4, r5, r6, r8)
            r4 = r8
            boolean r8 = r14.f1732d
            if (r8 != 0) goto L18f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "No repeat geofence "
            r8.append(r9)
            java.lang.String r9 = r14.a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.dd(r3, r8)
            r2.remove()
            cn.jpush.android.n.e r8 = cn.jpush.android.n.e.a()
            r8.a(r14)
        L18f:
            r14.f1736h = r12
            cn.jpush.android.n.e r8 = cn.jpush.android.n.e.a()
            java.lang.String r9 = r14.a
            org.json.JSONObject r10 = r14.a()
            r15 = 0
            r8.a(r9, r10, r15)
            goto L54
        L1a1:
            r16 = r13
            long r1 = r0.f1721b
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d6
            if (r16 == 0) goto L1b1
            r1 = 180000(0x2bf20, float:2.52234E-40)
            goto L1b4
        L1b1:
            r1 = 900000(0xdbba0, float:1.261169E-39)
        L1b4:
            long r4 = r0.f1724e
            long r1 = (long) r1
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L1d6
            r0.f1724e = r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "need update scan peroid to:"
            r4.append(r5)
            long r5 = r0.f1724e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.dd(r3, r4)
            r0.b(r1)
        L1d6:
            return
    }

    static /* synthetic */ void a(cn.jpush.android.b.a r0, long r1) {
            r0.b(r1)
            return
    }

    static /* synthetic */ void a(cn.jpush.android.b.a r0, android.location.Location r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b(cn.jpush.android.b.a r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f1729j
            return r0
    }

    private void b(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Scan geofence after "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.os.Handler r0 = r2.f1723d
            if (r0 != 0) goto L20
            return
        L20:
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L2d
            android.os.Handler r0 = r2.f1723d
            r0.removeMessages(r1)
        L2d:
            android.os.Handler r0 = r2.f1723d
            r0.sendEmptyMessageDelayed(r1, r3)
            return
    }

    static /* synthetic */ long c(cn.jpush.android.b.a r2) {
            long r0 = r2.f1724e
            return r0
    }

    private void c() {
            r3 = this;
            cn.jpush.android.b.a$2 r0 = new cn.jpush.android.b.a$2     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "jg_cgf_thread"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L16
            r0.start()     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.b.a$3 r1 = new cn.jpush.android.b.a$3     // Catch: java.lang.Throwable -> L16
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L16
            r3.f1723d = r1     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init geofence handler failed:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
    }

    private void c(cn.jpush.android.b.b r5) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.o = r0
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r0 = "yyyy-DDD"
            java.text.SimpleDateFormat r0 = cn.jpush.android.ad.m.a(r0)
            java.lang.String r0 = r0.format(r2)
            java.lang.String r1 = r5.r
            boolean r1 = r0.equals(r1)
            r3 = 1
            if (r1 == 0) goto L25
            int r0 = r5.s
            int r0 = r0 + r3
            r5.s = r0
            goto L29
        L25:
            r5.r = r0
            r5.s = r3
        L29:
            java.lang.String r0 = "yyyy-ww"
            java.text.SimpleDateFormat r0 = cn.jpush.android.ad.m.a(r0)
            java.lang.String r0 = r0.format(r2)
            java.lang.String r1 = r5.p
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L42
            int r0 = r5.q
            int r0 = r0 + r3
            r5.q = r0
            return
        L42:
            r5.p = r0
            r5.q = r3
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void d() {
            r4 = this;
            java.lang.String r0 = "CustomGeofenAction"
            android.location.LocationListener r1 = r4.f1728i     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L16
            android.location.LocationManager r2 = r4.f1722c     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            r2.removeUpdates(r1)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            goto L19
        L10:
            java.lang.String r1 = "locationManager is null , do nothing!"
        L12:
            cn.jpush.android.helper.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> Le
            return
        L16:
            java.lang.String r1 = "Location listener is null , do nothing!"
            goto L12
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remove location listener failed  e:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.w(r0, r1)
            return
    }

    static /* synthetic */ void d(cn.jpush.android.b.a r0) {
            r0.e()
            return
    }

    private boolean d(cn.jpush.android.b.b r12) {
            r11 = this;
            long r0 = r12.o
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto La
            return r2
        La:
            boolean r0 = r12.f1732d
            r1 = 0
            java.lang.String r5 = "CustomGeofenAction"
            if (r0 != 0) goto L17
            java.lang.String r12 = "can't repeat geofence"
        L13:
            cn.jpush.android.helper.Logger.dd(r5, r12)
            return r1
        L17:
            int r0 = r12.n
            if (r0 > 0) goto L29
            java.lang.String r0 = r12.f1731c
            java.lang.String r6 = "inside"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L29
            r0 = 3600(0xe10, float:5.045E-42)
            r12.n = r0
        L29:
            long r6 = java.lang.System.currentTimeMillis()
            int r0 = r12.n
            if (r0 <= 0) goto L58
            long r8 = r12.o
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L58
            int r0 = r0 * 1000
            long r3 = (long) r0
            long r8 = r8 + r3
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L58
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "in "
            r0.append(r2)
            int r12 = r12.n
            r0.append(r12)
            java.lang.String r12 = "s, can't repeat geofence"
            r0.append(r12)
        L53:
            java.lang.String r12 = r0.toString()
            goto L13
        L58:
            int r0 = r12.m
            java.lang.String r3 = "/"
            if (r0 <= 0) goto L9c
            java.lang.String r0 = r12.r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "yyyy-DDD"
            java.text.SimpleDateFormat r0 = cn.jpush.android.ad.m.a(r0)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r6)
            java.lang.String r0 = r0.format(r4)
            java.lang.String r4 = r12.r
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L9c
            int r0 = r12.s
            int r4 = r12.m
            if (r0 < r4) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "today already repeat enough:"
            r0.append(r2)
            int r2 = r12.s
            r0.append(r2)
            r0.append(r3)
            int r12 = r12.m
        L98:
            r0.append(r12)
            goto L53
        L9c:
            int r0 = r12.l
            if (r0 <= 0) goto Ldb
            java.lang.String r0 = r12.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ldb
            java.lang.String r0 = "yyyy-ww"
            java.text.SimpleDateFormat r0 = cn.jpush.android.ad.m.a(r0)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r6)
            java.lang.String r0 = r0.format(r4)
            java.lang.String r4 = r12.p
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ldb
            int r0 = r12.q
            int r4 = r12.l
            if (r0 < r4) goto Ldb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "this week already repeat enough:"
            r0.append(r2)
            int r2 = r12.q
            r0.append(r2)
            r0.append(r3)
            int r12 = r12.l
            goto L98
        Ldb:
            return r2
    }

    private void e() {
            r3 = this;
            java.lang.String r0 = "try locate..."
            java.lang.String r1 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.d(r1, r0)
            android.content.Context r0 = r3.a
            android.location.LocationManager r2 = r3.f1722c
            boolean r0 = cn.jpush.android.n.c.a(r0, r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = "No enabled provider"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            return
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sdk int:"
            r0.append(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.append(r2)
            java.lang.String r2 = ",targetSdkVersion:"
            r0.append(r2)
            android.content.Context r2 = r3.a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.a()
            int r0 = r0.c()
            if (r0 > 0) goto L4b
            r3.a()
            return
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1729j
            boolean r0 = r0.get()
            if (r0 == 0) goto L59
            java.lang.String r0 = "isLocating..."
            cn.jpush.android.helper.Logger.d(r1, r0)
            return
        L59:
            r3.f()
            return
    }

    static /* synthetic */ void e(cn.jpush.android.b.a r0) {
            r0.d()
            return
    }

    static /* synthetic */ java.lang.String f(cn.jpush.android.b.a r0) {
            java.lang.String r0 = r0.f1726g
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void f() {
            r12 = this;
            java.lang.String r0 = "network"
            java.lang.String r1 = "gps"
            java.lang.String r2 = "CustomGeofenAction"
            android.location.LocationManager r3 = r12.f1722c     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            if (r3 == 0) goto La3
            android.content.Context r4 = r12.a     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r5 = 1
            android.location.Location r3 = cn.jpush.android.n.c.a(r4, r3, r5)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r8 = 0
            if (r3 == 0) goto L21
            long r10 = r3.getTime()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            goto L22
        L1e:
            r0 = move-exception
            goto La9
        L21:
            r10 = r8
        L22:
            long r6 = r6 - r10
            r10 = 30000(0x7530, double:1.4822E-319)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L4c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r0.<init>()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r1 = "need not restart gpslocation,the time with last:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            if (r3 == 0) goto L3d
            long r8 = r3.getTime()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
        L3d:
            long r4 = r4 - r8
            r0.append(r4)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            cn.jpush.android.helper.Logger.dd(r2, r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r12.a(r3)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            return
        L4c:
            r3 = 0
            r12.f1726g = r3     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            android.location.LocationManager r3 = r12.f1722c     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            boolean r3 = r3.isProviderEnabled(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            if (r3 == 0) goto L5a
            r12.f1726g = r1     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            goto L64
        L5a:
            android.location.LocationManager r1 = r12.f1722c     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            boolean r1 = r1.isProviderEnabled(r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            if (r1 == 0) goto L64
            r12.f1726g = r0     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r0.<init>()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r1 = "provider "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r1 = r12.f1726g     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            cn.jpush.android.helper.Logger.d(r2, r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r0 = r12.f1726g     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            if (r0 == 0) goto L88
            java.lang.String r0 = "not gps nor network provider,stop scan geofence"
            cn.jpush.android.helper.Logger.dd(r2, r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            return
        L88:
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f1729j     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r0.set(r5)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            android.location.LocationManager r6 = r12.f1722c     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            java.lang.String r7 = r12.f1726g     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            android.location.LocationListener r11 = r12.f1728i     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r8 = 2000(0x7d0, double:9.88E-321)
            r10 = 0
            r6.requestLocationUpdates(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            android.os.Handler r0 = r12.f1723d     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            long r3 = r12.f1725f     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            r1 = 1001(0x3e9, float:1.403E-42)
            r0.sendEmptyMessageDelayed(r1, r3)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            return
        La3:
            java.lang.String r0 = "locationManager is null"
            cn.jpush.android.helper.Logger.ww(r2, r0)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> Lbe
            return
        La9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "The provider is illegal argument!"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lba:
            cn.jpush.android.helper.Logger.ww(r2, r0)
            goto Lc1
        Lbe:
            java.lang.String r0 = "No suitable permission when get last known location!"
            goto Lba
        Lc1:
            return
    }

    static /* synthetic */ android.location.LocationListener g(cn.jpush.android.b.a r0) {
            android.location.LocationListener r0 = r0.f1728i
            return r0
    }

    static /* synthetic */ long h(cn.jpush.android.b.a r2) {
            long r0 = r2.f1725f
            return r0
    }

    static /* synthetic */ android.os.Handler i(cn.jpush.android.b.a r0) {
            android.os.Handler r0 = r0.f1723d
            return r0
    }

    @Override // cn.jpush.android.b.c
    protected synchronized void a() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "CustomGeofenAction"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "geofence size:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            cn.jpush.android.n.e r2 = cn.jpush.android.n.e.a()     // Catch: java.lang.Throwable -> L34
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L34
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L34
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "CustomGeofenAction"
            java.lang.String r1 = "stop listen geofence"
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r3.f1727h     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L39
            android.os.Handler r0 = r3.f1723d     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r0 = move-exception
            goto L3b
        L36:
            r0 = 0
            r3.f1727h = r0     // Catch: java.lang.Throwable -> L34
        L39:
            monitor-exit(r3)
            return
        L3b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r0
    }

    @Override // cn.jpush.android.b.c
    public void a(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Set geofence interval "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            r2.f1724e = r3
            r2.f1721b = r3
            android.content.Context r0 = r2.a
            cn.jpush.android.cache.a.b(r0, r3)
            return
    }

    @Override // cn.jpush.android.b.c
    protected void a(cn.jpush.android.b.b r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Geofence create success, id="
            r0.append(r1)
            java.lang.String r3 = r3.a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r0, r3)
            boolean r3 = r2.f1727h
            if (r3 == 0) goto L25
            android.os.Handler r3 = r2.f1723d
            if (r3 == 0) goto L25
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.sendEmptyMessage(r0)
        L25:
            return
    }

    @Override // cn.jpush.android.b.c
    protected void a(cn.jpush.android.b.b r2, cn.jpush.android.b.b r3) {
            r1 = this;
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Geofence update success, id="
            r3.append(r0)
            java.lang.String r2 = r2.a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r3, r2)
        L1a:
            boolean r2 = r1.f1727h
            if (r2 == 0) goto L27
            android.os.Handler r2 = r1.f1723d
            if (r2 == 0) goto L27
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.sendEmptyMessage(r3)
        L27:
            return
    }

    @Override // cn.jpush.android.b.c
    public synchronized void b() {
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L28
            boolean r0 = cn.jpush.android.helper.JCoreHelper.geoEnable(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "CustomGeofenAction"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "start listen geofence lbsEnable="
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            cn.jpush.android.helper.Logger.dd(r1, r2)     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L2a
            java.lang.String r0 = "CustomGeofenAction"
            java.lang.String r1 = "lbs is disable!"
            cn.jpush.android.helper.Logger.ww(r0, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L28:
            r0 = move-exception
            goto L5b
        L2a:
            boolean r0 = r4.f1727h     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L37
            java.lang.String r0 = "CustomGeofenAction"
            java.lang.String r1 = "geofence is running!"
            cn.jpush.android.helper.Logger.ii(r0, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L37:
            cn.jpush.android.n.e r0 = cn.jpush.android.n.e.a()     // Catch: java.lang.Throwable -> L28
            int r0 = r0.c()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L4a
            java.lang.String r0 = "CustomGeofenAction"
            java.lang.String r1 = "No geofence,not need listen"
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L4a:
            android.os.Handler r0 = r4.f1723d     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L51
            r4.c()     // Catch: java.lang.Throwable -> L28
        L51:
            r0 = 0
            r4.b(r0)     // Catch: java.lang.Throwable -> L28
            r0 = 1
            r4.f1727h = r0     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r0
    }

    @Override // cn.jpush.android.b.c
    protected void b(cn.jpush.android.b.b r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Geofence delete success, id="
            r0.append(r1)
            java.lang.String r3 = r3.a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "CustomGeofenAction"
            cn.jpush.android.helper.Logger.dd(r0, r3)
            return
    }
}
