package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private final android.location.LocationManager a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f1843b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Handler f1844c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, org.json.JSONObject> f1845d;

    /* renamed from: e, reason: collision with root package name */
    private volatile cn.jpush.android.n.f.a f1846e;

    /* renamed from: f, reason: collision with root package name */
    private volatile cn.jpush.android.n.f.b f1847f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1848g;



    public class a {
        public long a;

        /* renamed from: b, reason: collision with root package name */
        public double f1849b;

        /* renamed from: c, reason: collision with root package name */
        public double f1850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.n.f f1851d;

        public a(cn.jpush.android.n.f r1) {
                r0 = this;
                r0.f1851d = r1
                r0.<init>()
                return
        }

        public void a(android.content.Context r3) {
                r2 = this;
                java.lang.String r3 = cn.jpush.android.cache.a.n(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L28
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "last pull state:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "GeofencePullHelper"
                cn.jpush.android.helper.Logger.d(r1, r0)
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
                r0.<init>(r3)     // Catch: org.json.JSONException -> L28
                r2.a(r0)     // Catch: org.json.JSONException -> L28
            L28:
                return
        }

        public void a(android.content.Context r2, org.json.JSONObject r3) {
                r1 = this;
                if (r3 != 0) goto L3
                return
            L3:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "saveGeofenceLastPullState:"
                r2.append(r0)
                java.lang.String r0 = r3.toString()
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "GeofencePullHelper"
                cn.jpush.android.helper.Logger.d(r0, r2)
                r1.a(r3)
                cn.jpush.android.n.f r2 = r1.f1851d
                android.content.Context r2 = cn.jpush.android.n.f.e(r2)
                java.lang.String r3 = r3.toString()
                cn.jpush.android.cache.a.f(r2, r3)
                return
        }

        public void a(org.json.JSONObject r7) {
                r6 = this;
                cn.jpush.android.n.f r0 = r6.f1851d
                cn.jpush.android.n.f$a r0 = cn.jpush.android.n.f.d(r0)
                java.lang.String r1 = "lat"
                r2 = 4641240890982006784(0x4069000000000000, double:200.0)
                double r4 = r7.optDouble(r1, r2)
                r0.f1849b = r4
                cn.jpush.android.n.f r0 = r6.f1851d
                cn.jpush.android.n.f$a r0 = cn.jpush.android.n.f.d(r0)
                java.lang.String r1 = "lng"
                double r1 = r7.optDouble(r1, r2)
                r0.f1850c = r1
                cn.jpush.android.n.f r0 = r6.f1851d
                cn.jpush.android.n.f$a r0 = cn.jpush.android.n.f.d(r0)
                java.lang.String r1 = "time"
                r2 = 0
                long r1 = r7.optLong(r1, r2)
                r0.a = r1
                return
        }
    }

    public class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f1852b;

        /* renamed from: c, reason: collision with root package name */
        public int f1853c;

        /* renamed from: d, reason: collision with root package name */
        public int f1854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.n.f f1855e;

        public b(cn.jpush.android.n.f r1) {
                r0 = this;
                r0.f1855e = r1
                r0.<init>()
                r1 = 1800(0x708, float:2.522E-42)
                r0.a = r1
                r1 = 10800(0x2a30, float:1.5134E-41)
                r0.f1852b = r1
                r1 = 900(0x384, float:1.261E-42)
                r0.f1853c = r1
                r1 = 20
                r0.f1854d = r1
                return
        }

        private void a(org.json.JSONObject r4) {
                r3 = this;
                cn.jpush.android.n.f r0 = r3.f1855e
                cn.jpush.android.n.f$b r0 = cn.jpush.android.n.f.a(r0)
                cn.jpush.android.n.f r1 = r3.f1855e
                cn.jpush.android.n.f$b r1 = cn.jpush.android.n.f.a(r1)
                int r1 = r1.a
                java.lang.String r2 = "minInterval"
                int r1 = r4.optInt(r2, r1)
                r0.a = r1
                cn.jpush.android.n.f r0 = r3.f1855e
                cn.jpush.android.n.f$b r0 = cn.jpush.android.n.f.a(r0)
                cn.jpush.android.n.f r1 = r3.f1855e
                cn.jpush.android.n.f$b r1 = cn.jpush.android.n.f.a(r1)
                int r1 = r1.f1852b
                java.lang.String r2 = "nextInterval"
                int r1 = r4.optInt(r2, r1)
                r0.f1852b = r1
                cn.jpush.android.n.f r0 = r3.f1855e
                cn.jpush.android.n.f$b r0 = cn.jpush.android.n.f.a(r0)
                cn.jpush.android.n.f r1 = r3.f1855e
                cn.jpush.android.n.f$b r1 = cn.jpush.android.n.f.a(r1)
                int r1 = r1.f1853c
                java.lang.String r2 = "minLBSInterval"
                int r1 = r4.optInt(r2, r1)
                r0.f1853c = r1
                cn.jpush.android.n.f r0 = r3.f1855e
                cn.jpush.android.n.f$b r0 = cn.jpush.android.n.f.a(r0)
                cn.jpush.android.n.f r1 = r3.f1855e
                cn.jpush.android.n.f$b r1 = cn.jpush.android.n.f.a(r1)
                int r1 = r1.f1854d
                java.lang.String r2 = "minLBSKilo"
                int r4 = r4.optInt(r2, r1)
                r0.f1854d = r4
                return
        }

        private void a(org.json.JSONObject r1, org.json.JSONObject r2, java.lang.String r3, int r4) {
                r0 = this;
                boolean r1 = r1.has(r3)
                if (r1 == 0) goto L9
                r2.put(r3, r4)
            L9:
                return
        }

        public void a(android.content.Context r3) {
                r2 = this;
                java.lang.String r3 = cn.jpush.android.cache.a.m(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L28
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "pull limit:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "GeofencePullHelper"
                cn.jpush.android.helper.Logger.d(r1, r0)
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L28
                r2.a(r0)     // Catch: java.lang.Throwable -> L28
            L28:
                return
        }

        public void a(android.content.Context r4, org.json.JSONObject r5) {
                r3 = this;
                if (r5 != 0) goto L3
                return
            L3:
                r3.a(r5)     // Catch: java.lang.Throwable -> L47
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L47
                r0.<init>()     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "minInterval"
                cn.jpush.android.n.f r2 = r3.f1855e     // Catch: java.lang.Throwable -> L47
                cn.jpush.android.n.f$b r2 = cn.jpush.android.n.f.a(r2)     // Catch: java.lang.Throwable -> L47
                int r2 = r2.a     // Catch: java.lang.Throwable -> L47
                r3.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "nextInterval"
                cn.jpush.android.n.f r2 = r3.f1855e     // Catch: java.lang.Throwable -> L47
                cn.jpush.android.n.f$b r2 = cn.jpush.android.n.f.a(r2)     // Catch: java.lang.Throwable -> L47
                int r2 = r2.f1852b     // Catch: java.lang.Throwable -> L47
                r3.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "minLBSInterval"
                cn.jpush.android.n.f r2 = r3.f1855e     // Catch: java.lang.Throwable -> L47
                cn.jpush.android.n.f$b r2 = cn.jpush.android.n.f.a(r2)     // Catch: java.lang.Throwable -> L47
                int r2 = r2.f1853c     // Catch: java.lang.Throwable -> L47
                r3.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "minLBSKilo"
                cn.jpush.android.n.f r2 = r3.f1855e     // Catch: java.lang.Throwable -> L47
                cn.jpush.android.n.f$b r2 = cn.jpush.android.n.f.a(r2)     // Catch: java.lang.Throwable -> L47
                int r2 = r2.f1854d     // Catch: java.lang.Throwable -> L47
                r3.a(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L47
                cn.jpush.android.cache.a.e(r4, r5)     // Catch: java.lang.Throwable -> L47
                return
            L47:
                java.lang.String r4 = "GeofencePullHelper"
                java.lang.String r5 = "save limit failed"
                cn.jpush.android.helper.Logger.d(r4, r5)
                return
        }
    }

    public f(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1845d = r0
            r0 = 0
            r1.f1848g = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.f1843b = r2
            java.lang.String r0 = "location"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r1.a = r2
            r1.c()
            r1.i()
            r1.j()
            return
    }

    static /* synthetic */ cn.jpush.android.n.f.b a(cn.jpush.android.n.f r0) {
            cn.jpush.android.n.f$b r0 = r0.f1847f
            return r0
    }

    private void a(double r12, double r14) {
            r11 = this;
            java.lang.String r1 = "GeofencePullHelper"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "lat"
            r0.put(r2, r12)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = "lng"
            r0.put(r12, r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = "time"
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            r2 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r2
            r0.put(r12, r13)     // Catch: java.lang.Throwable -> L69
            long r6 = cn.jpush.android.helper.f.a()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r12.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = "will send report geo request:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L69
            r12.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = ",requestid:"
            r12.append(r13)     // Catch: java.lang.Throwable -> L69
            r12.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L69
            cn.jpush.android.helper.Logger.dd(r1, r12)     // Catch: java.lang.Throwable -> L69
            java.util.HashMap<java.lang.String, org.json.JSONObject> r12 = r11.f1845d     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r13.<init>()     // Catch: java.lang.Throwable -> L69
            r13.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = ""
            r13.append(r14)     // Catch: java.lang.Throwable -> L69
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L69
            r12.put(r13, r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L69
            byte[] r10 = cn.jpush.android.z.b.c(r12)     // Catch: java.lang.Throwable -> L69
            android.content.Context r2 = r11.f1843b     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "JPUSH"
            r5 = 1
            r8 = 0
            r4 = 37
            cn.jpush.android.helper.JCoreHelper.sendRequest(r2, r3, r4, r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "send report geo request failed:"
            r13.append(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            cn.jpush.android.helper.Logger.dd(r1, r12)
            return
    }

    private void a(long r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pull geofence after "
            r0.append(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.append(r4)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.os.Handler r0 = r3.f1844c
            if (r0 != 0) goto L24
            return
        L24:
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L31
            android.os.Handler r0 = r3.f1844c
            r0.removeMessages(r1)
        L31:
            android.os.Handler r0 = r3.f1844c
            r0.sendEmptyMessageDelayed(r1, r4)
            return
    }

    static /* synthetic */ void a(cn.jpush.android.n.f r0, long r1) {
            r0.a(r1)
            return
    }

    private void b(long r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "compile loc after "
            r0.append(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.append(r4)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.os.Handler r0 = r3.f1844c
            if (r0 != 0) goto L24
            return
        L24:
            r1 = 1002(0x3ea, float:1.404E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L31
            android.os.Handler r0 = r3.f1844c
            r0.removeMessages(r1)
        L31:
            android.os.Handler r0 = r3.f1844c
            r0.sendEmptyMessageDelayed(r1, r4)
            return
    }

    static /* synthetic */ void b(cn.jpush.android.n.f r0) {
            r0.f()
            return
    }

    static /* synthetic */ void b(cn.jpush.android.n.f r0, long r1) {
            r0.b(r1)
            return
    }

    private void c() {
            r3 = this;
            cn.jpush.android.n.f$1 r0 = new cn.jpush.android.n.f$1     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "jg_gph_thread"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L16
            r0.start()     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.n.f$2 r1 = new cn.jpush.android.n.f$2     // Catch: java.lang.Throwable -> L16
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L16
            r3.f1844c = r1     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init geofence pull handler failed:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
    }

    static /* synthetic */ boolean c(cn.jpush.android.n.f r0) {
            boolean r0 = r0.g()
            return r0
    }

    static /* synthetic */ cn.jpush.android.n.f.a d(cn.jpush.android.n.f r0) {
            cn.jpush.android.n.f$a r0 = r0.f1846e
            return r0
    }

    private void d() {
            r2 = this;
            java.lang.String r0 = "GeofencePullHelper"
            java.lang.String r1 = "start schedule geofence pull"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            boolean r0 = r2.h()
            if (r0 != 0) goto L1d
            boolean r0 = r2.g()
            if (r0 == 0) goto L14
            goto L1d
        L14:
            cn.jpush.android.n.f$b r0 = r2.f1847f
            int r0 = r0.f1852b
            long r0 = (long) r0
        L19:
            r2.a(r0)
            goto L20
        L1d:
            r0 = 0
            goto L19
        L20:
            cn.jpush.android.n.f$b r0 = r2.f1847f
            int r0 = r0.f1853c
            long r0 = (long) r0
            r2.b(r0)
            return
    }

    static /* synthetic */ android.content.Context e(cn.jpush.android.n.f r0) {
            android.content.Context r0 = r0.f1843b
            return r0
    }

    private void e() {
            r2 = this;
            java.lang.String r0 = "GeofencePullHelper"
            java.lang.String r1 = "stop schedule geofence pull"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            android.os.Handler r0 = r2.f1844c
            if (r0 != 0) goto Lc
            goto L37
        Lc:
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L19
            android.os.Handler r0 = r2.f1844c
            r0.removeMessages(r1)
        L19:
            android.os.Handler r0 = r2.f1844c
            r1 = 1001(0x3e9, float:1.403E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L28
            android.os.Handler r0 = r2.f1844c
            r0.removeMessages(r1)
        L28:
            android.os.Handler r0 = r2.f1844c
            r1 = 1002(0x3ea, float:1.404E-42)
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L37
            android.os.Handler r0 = r2.f1844c
            r0.removeMessages(r1)
        L37:
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private void f() {
            r5 = this;
            java.lang.String r0 = "try pull..."
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.content.Context r0 = r5.f1843b
            android.location.LocationManager r2 = r5.a
            r3 = 0
            android.location.Location r0 = cn.jpush.android.n.c.a(r0, r2, r3)
            if (r0 != 0) goto L18
            java.lang.String r0 = "stop pull,get loction failed"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            return
        L18:
            double r1 = r0.getLatitude()
            double r3 = r0.getLongitude()
            r5.a(r1, r3)
            return
    }

    private boolean g() {
            r11 = this;
            android.content.Context r0 = r11.f1843b
            android.location.LocationManager r1 = r11.a
            r2 = 0
            android.location.Location r0 = cn.jpush.android.n.c.a(r0, r1, r2)
            java.lang.String r1 = "GeofencePullHelper"
            if (r0 == 0) goto L50
            double r3 = r0.getLongitude()
            double r5 = r0.getLatitude()
            cn.jpush.android.n.f$a r0 = r11.f1846e
            double r7 = r0.f1850c
            cn.jpush.android.n.f$a r0 = r11.f1846e
            double r9 = r0.f1849b
            double r3 = cn.jpush.android.ad.m.a(r3, r5, r7, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "check current distance to last pull distance:"
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = ",lbsKilo:"
            r0.append(r5)
            cn.jpush.android.n.f$b r5 = r11.f1847f
            int r5 = r5.f1854d
            int r5 = r5 * 1000
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.n.f$b r0 = r11.f1847f
            int r0 = r0.f1854d
            int r0 = r0 * 1000
            double r5 = (double) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L50
            r0 = 1
            return r0
        L50:
            java.lang.String r0 = "loc limit"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            return r2
    }

    private boolean h() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            cn.jpush.android.n.f$a r2 = r6.f1846e
            long r2 = r2.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "lastPullTime:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ",currentTime:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ",minInterval:"
            r4.append(r5)
            cn.jpush.android.n.f$b r5 = r6.f1847f
            int r5 = r5.a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.dd(r5, r4)
            long r0 = r0 - r2
            cn.jpush.android.n.f$b r2 = r6.f1847f
            int r2 = r2.a
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L46
            java.lang.String r0 = "time limit"
            cn.jpush.android.helper.Logger.dd(r5, r0)
            r0 = 0
            return r0
        L46:
            r0 = 1
            return r0
    }

    private void i() {
            r2 = this;
            cn.jpush.android.n.f$a r0 = new cn.jpush.android.n.f$a
            r0.<init>(r2)
            r2.f1846e = r0
            cn.jpush.android.n.f$a r0 = r2.f1846e
            android.content.Context r1 = r2.f1843b
            r0.a(r1)
            return
    }

    private void j() {
            r2 = this;
            cn.jpush.android.n.f$b r0 = new cn.jpush.android.n.f$b
            r0.<init>(r2)
            r2.f1847f = r0
            cn.jpush.android.n.f$b r0 = r2.f1847f
            android.content.Context r1 = r2.f1843b
            r0.a(r1)
            android.content.Context r0 = r2.f1843b
            boolean r0 = cn.jpush.android.cache.a.l(r0)
            r2.f1848g = r0
            return
    }

    public void a() {
            r2 = this;
            java.lang.String r0 = "onLogin"
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = r2.f1848g
            if (r0 != 0) goto L11
            java.lang.String r0 = "do not support pull"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            return
        L11:
            r2.d()
            return
    }

    public void a(long r4, int r6, cn.jpush.android.n.d r7) {
            r3 = this;
            java.util.HashMap<java.lang.String, org.json.JSONObject> r0 = r3.f1845d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.remove(r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            int r1 = cn.jpush.android.api.JPushInterface.ErrorCode.TIMEOUT
            java.lang.String r2 = "GeofencePullHelper"
            if (r6 != r1) goto L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "pull geo is timeout,requestid:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            cn.jpush.android.helper.Logger.dd(r2, r4)
            return
        L34:
            if (r0 != 0) goto L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "can not find request from requestid:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            cn.jpush.android.helper.Logger.dd(r2, r4)
            return
        L4b:
            org.json.JSONObject r4 = r7.a()
            if (r4 != 0) goto L57
            java.lang.String r4 = "onPullResponse empty pull response"
            cn.jpush.android.helper.Logger.dd(r2, r4)
            return
        L57:
            cn.jpush.android.n.f$b r5 = r3.f1847f
            android.content.Context r6 = r3.f1843b
            r5.a(r6, r4)
            org.json.JSONArray r4 = r7.b()
            if (r4 != 0) goto L69
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onPullResponse:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.dd(r2, r5)
            int r5 = r4.length()
            if (r5 != 0) goto L8e
            r5 = 0
            r3.f1848g = r5
            android.content.Context r6 = r3.f1843b
            cn.jpush.android.cache.a.d(r6, r5)
            r3.e()
        L8e:
            cn.jpush.android.n.f$a r5 = r3.f1846e
            android.content.Context r6 = r3.f1843b
            r5.a(r6, r0)
            cn.jpush.android.n.e r5 = cn.jpush.android.n.e.a()
            r5.a(r4)
            android.content.Context r5 = r3.f1843b
            java.lang.String r4 = r4.toString()
            cn.jpush.android.n.a.a(r5, r4)
            return
    }

    public void a(cn.jpush.android.n.b r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L3e
        L3:
            int r5 = r5.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "control pull geo type:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GeofencePullHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = r4.f1848g
            r1 = 0
            r2 = 1
            if (r5 != r2) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r0 = r0 ^ r3
            if (r0 == 0) goto L3e
            if (r5 != r2) goto L2c
            r1 = 1
        L2c:
            r4.f1848g = r1
            android.content.Context r5 = r4.f1843b
            cn.jpush.android.cache.a.d(r5, r1)
            boolean r5 = r4.f1848g
            if (r5 == 0) goto L3b
            r4.d()
            return
        L3b:
            r4.e()
        L3e:
            return
    }

    public void b() {
            r2 = this;
            java.lang.String r0 = "GeofencePullHelper"
            java.lang.String r1 = "onTcpDisconnected"
            cn.jpush.android.helper.Logger.d(r0, r1)
            r2.e()
            return
    }
}
