package cn.jiguang.commons.J;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private final java.util.concurrent.atomic.AtomicReference a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f816c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f817d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f818e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f819f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f820g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f821h;

    /* renamed from: i, reason: collision with root package name */
    private final android.os.HandlerThread f822i;

    /* renamed from: j, reason: collision with root package name */
    private android.os.Handler f823j;

    /* renamed from: k, reason: collision with root package name */
    private android.location.GnssStatus.Callback f824k;
    private android.location.GpsStatus.Listener l;

    /* renamed from: cn.jiguang.commons.J.a$a, reason: collision with other inner class name */
    class RunnableC0030a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.J.a.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.c.m f825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.a f826c;

        RunnableC0030a(cn.jiguang.commons.J.a r1, cn.jiguang.commons.J.a.f r2, cn.jiguang.commons.c.m r3) {
                r0 = this;
                r0.f826c = r1
                r0.a = r2
                r0.f825b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                cn.jiguang.commons.J.a r0 = r3.f826c
                android.location.Location r0 = cn.jiguang.commons.J.a.a(r0)
                cn.jiguang.commons.J.a r1 = r3.f826c
                boolean r1 = cn.jiguang.commons.J.a.a(r1, r0)
                if (r1 == 0) goto L1a
                cn.jiguang.commons.J.a$f r1 = r3.a
                cn.jiguang.commons.J.a r2 = r3.f826c
                java.lang.String r0 = cn.jiguang.commons.J.a.c(r2, r0)
                r1.c(r0)
                return
            L1a:
                cn.jiguang.commons.J.a r0 = r3.f826c
                cn.jiguang.commons.c.m r1 = r3.f825b
                cn.jiguang.commons.J.a$f r2 = r3.a
                cn.jiguang.commons.J.a.a(r0, r1, r2)
                return
        }
    }

    class b extends android.location.GnssStatus.Callback {
        final /* synthetic */ cn.jiguang.commons.J.a.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.a f827b;

        b(cn.jiguang.commons.J.a r1, cn.jiguang.commons.J.a.f r2) {
                r0 = this;
                r0.f827b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "gnss first fix:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "GpsStatusManager"
                cn.jiguang.commons.w.a.a(r0, r3)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                cn.jiguang.commons.J.a r2 = r1.f827b
                cn.jiguang.commons.J.a$f r0 = r1.a
                cn.jiguang.commons.J.a.a(r2, r0)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.lang.String r0 = "GpsStatusManager"
                java.lang.String r1 = "gnss started"
                cn.jiguang.commons.w.a.a(r0, r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.lang.String r0 = "GpsStatusManager"
                java.lang.String r1 = "gnss stopped"
                cn.jiguang.commons.w.a.a(r0, r1)
                return
        }
    }

    class c implements android.location.GpsStatus.Listener {
        final /* synthetic */ cn.jiguang.commons.J.a.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.a f828b;

        c(cn.jiguang.commons.J.a r1, cn.jiguang.commons.J.a.f r2) {
                r0 = this;
                r0.f828b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int r2) {
                r1 = this;
                r0 = 4
                if (r2 != r0) goto La
                cn.jiguang.commons.J.a r2 = r1.f828b
                cn.jiguang.commons.J.a$f r0 = r1.a
                cn.jiguang.commons.J.a.a(r2, r0)
            La:
                return
        }
    }

    class d implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.J.a.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.J.a f829b;

        d(cn.jiguang.commons.J.a r1, cn.jiguang.commons.J.a.f r2) {
                r0 = this;
                r0.f829b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                cn.jiguang.commons.J.a r0 = r2.f829b
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.J.a.c(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L18
                cn.jiguang.commons.J.a r0 = r2.f829b
                cn.jiguang.commons.J.a$f r1 = r2.a
                cn.jiguang.commons.J.a.c(r0, r1)
                cn.jiguang.commons.J.a r0 = r2.f829b
                cn.jiguang.commons.J.a.d(r0)
            L18:
                return
        }
    }

    private static final class e {
        private static final cn.jiguang.commons.J.a a = null;

        static {
                cn.jiguang.commons.J.a r0 = new cn.jiguang.commons.J.a
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.J.a.e.a = r0
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.J.a a() {
                cn.jiguang.commons.J.a r0 = cn.jiguang.commons.J.a.e.a
                return r0
        }
    }

    public interface f {
        void a(java.lang.String r1);

        void c(java.lang.String r1);
    }

    private a() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.a = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.f816c = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.f817d = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>(r1)
            r3.f818e = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r3.f819f = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r3.f820g = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.f821h = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "jg_c_v2"
            r2 = 5
            r0.<init>(r1, r2)
            r3.f822i = r0
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r3.f823j = r1
            java.lang.String r0 = "GpsStatusManager"
            java.lang.String r1 = "gps helper init ok"
            cn.jiguang.commons.w.a.a(r0, r1)
            return
    }

    /* synthetic */ a(cn.jiguang.commons.J.a.RunnableC0030a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private long a() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r6.f816c
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.c.m r0 = (cn.jiguang.commons.c.m) r0
            if (r0 == 0) goto L22
            java.lang.String r1 = "gps_update_interval"
            int r0 = r0.c(r1)
            long r0 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r4 = r6.f818e
            long r4 = r4.get()
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            long r0 = r0 - r2
            return r0
        L22:
            r0 = 0
            return r0
    }

    static /* synthetic */ android.location.Location a(cn.jiguang.commons.J.a r0) {
            android.location.Location r0 = r0.g()
            return r0
    }

    private android.location.Location a(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "GpsStatusManager"
            r1 = 0
            cn.jiguang.commons.L.q r2 = cn.jiguang.commons.L.q.g()     // Catch: java.lang.Exception -> L2d
            android.location.LocationManager r3 = r5.f()     // Catch: java.lang.Exception -> L2d
            android.location.Location r2 = r2.a(r3, r6)     // Catch: java.lang.Exception -> L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r3.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = "lk from "
            r3.append(r4)     // Catch: java.lang.Exception -> L2d
            r3.append(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2d
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L2d
            boolean r3 = r5.c(r2)     // Catch: java.lang.Exception -> L2d
            if (r3 == 0) goto L2f
            r5.a(r6, r2)     // Catch: java.lang.Exception -> L2d
            return r2
        L2d:
            r6 = move-exception
            goto L30
        L2f:
            return r1
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get loc err:"
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r6)
            return r1
    }

    private java.lang.String a(android.location.Location r9) {
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r9.getProvider()
            double r2 = r9.getLongitude()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            double r3 = r9.getLatitude()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r4 = r9.getAltitude()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            float r5 = r9.getBearing()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r9 = r9.getAccuracy()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            r0 = 6
            r6[r0] = r9
            java.lang.String r9 = "%d|%s|%f|%f|%f|%f|%f"
            java.lang.String r9 = java.lang.String.format(r9, r6)
            return r9
    }

    private void a(android.location.Location r3, cn.jiguang.commons.J.a.f r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            android.location.Location r1 = new android.location.Location
            r1.<init>(r3)
            r0.set(r1)
            java.lang.String r3 = r2.a(r3)
            r4.c(r3)
            r2.i()
            return
    }

    private void a(cn.jiguang.commons.J.a.f r10) {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r2 = r9.f816c
            java.lang.Object r2 = r2.get()
            cn.jiguang.commons.c.m r2 = (cn.jiguang.commons.c.m) r2
            java.lang.String r3 = "gps_update_interval"
            int r3 = r2.c(r3)
            long r3 = (long) r3
            java.lang.String r5 = "attempt location update"
            java.lang.String r6 = "GpsStatusManager"
            cn.jiguang.commons.w.a.a(r6, r5)
            java.util.concurrent.atomic.AtomicLong r5 = r9.f817d
            long r7 = r5.get()
            long r7 = r0 - r7
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L36
            java.util.concurrent.atomic.AtomicLong r3 = r9.f817d
            r3.set(r0)
            java.util.concurrent.atomic.AtomicInteger r3 = r9.f819f
            r4 = 0
            r3.set(r4)
            java.lang.String r3 = "gps interval reset"
            cn.jiguang.commons.w.a.a(r6, r3)
        L36:
            java.util.concurrent.atomic.AtomicLong r3 = r9.f818e
            long r3 = r3.get()
            long r0 = r0 - r3
            r3 = 2000(0x7d0, double:9.88E-321)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L47
            r9.a(r2, r10)
            return
        L47:
            r9.f(r10)
            return
    }

    private void a(cn.jiguang.commons.J.a.f r4, java.lang.Exception r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error: "
            r0.append(r1)
            java.lang.String r1 = r5.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generic err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "GpsStatusManager"
            cn.jiguang.commons.w.a.c(r1, r5)
            r4.a(r0)
            r3.i()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.J.a r0, cn.jiguang.commons.J.a.f r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.J.a r0, cn.jiguang.commons.c.m r1, cn.jiguang.commons.J.a.f r2) {
            r0.d(r1, r2)
            return
    }

    private void a(cn.jiguang.commons.c.m r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f816c
            r0.set(r3)
            java.util.concurrent.atomic.AtomicLong r3 = r2.f817d
            long r0 = java.lang.System.currentTimeMillis()
            r3.set(r0)
            java.util.concurrent.atomic.AtomicLong r3 = r2.f818e
            r0 = 0
            r3.set(r0)
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f819f
            r0 = 0
            r3.set(r0)
            java.util.concurrent.atomic.AtomicReference r3 = r2.a
            r0 = 0
            r3.set(r0)
            return
    }

    private void a(cn.jiguang.commons.c.m r5, cn.jiguang.commons.J.a.f r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f819f
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r0 = r4.f818e
            long r1 = java.lang.System.currentTimeMillis()
            r0.set(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "attempt location, count:"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f819f
            int r1 = r1.get()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GpsStatusManager"
            cn.jiguang.commons.w.a.a(r1, r0)
            android.location.Location r0 = r4.g()
            boolean r2 = r4.c(r0)
            if (r2 == 0) goto L58
            java.util.concurrent.atomic.AtomicReference r2 = r4.a
            java.lang.Object r2 = r2.get()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.String r3 = "gps_update_distance"
            int r5 = r5.c(r3)
            float r5 = (float) r5
            if (r2 == 0) goto L54
            float r2 = r0.distanceTo(r2)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L4e
            goto L54
        L4e:
            java.lang.String r5 = "location not updated - distance threshold not met"
            cn.jiguang.commons.w.a.a(r1, r5)
            return
        L54:
            r4.a(r0, r6)
            return
        L58:
            java.lang.String r5 = "invalid gps location"
            cn.jiguang.commons.w.a.f(r1, r5)
            return
    }

    private void a(java.lang.String r6, android.location.Location r7) {
            r5 = this;
            double r0 = r7.getLatitude()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r7.getLongitude()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            float r2 = r7.getAccuracy()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            long r3 = r7.getTime()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r0
            r6 = 2
            r3[r6] = r1
            r6 = 3
            r3[r6] = r2
            r6 = 4
            r3[r6] = r7
            java.lang.String r6 = "%s location - lat: %f, lon: %f, acc: %f, time: %d"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            java.lang.String r7 = "GpsStatusManager"
            cn.jiguang.commons.w.a.a(r7, r6)
            return
    }

    static /* synthetic */ boolean a(cn.jiguang.commons.J.a r0, android.location.Location r1) {
            boolean r0 = r0.c(r1)
            return r0
    }

    private android.location.Location c() {
            r1 = this;
            java.lang.String r0 = "network"
            android.location.Location r0 = r1.a(r0)
            return r0
    }

    static /* synthetic */ java.lang.String c(cn.jiguang.commons.J.a r0, android.location.Location r1) {
            java.lang.String r0 = r0.a(r1)
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean c(cn.jiguang.commons.J.a r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f820g
            return r0
    }

    private void c(cn.jiguang.commons.J.a.f r3) {
            r2 = this;
            boolean r0 = r2.k(r3)     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L10
            java.lang.String r0 = "GpsStatusManager"
            java.lang.String r1 = "session terminated - max attempts"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r0 = move-exception
            goto L14
        L10:
            r2.a(r3)     // Catch: java.lang.Exception -> Le
            return
        L14:
            r2.c(r3, r0)
            return
    }

    private void c(cn.jiguang.commons.J.a.f r3, java.lang.Exception r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "location err:"
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GpsStatusManager"
            cn.jiguang.commons.w.a.f(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error: "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.a(r4)
            r2.i()
            return
    }

    static /* synthetic */ void c(cn.jiguang.commons.J.a r0, cn.jiguang.commons.J.a.f r1) {
            r0.d(r1)
            return
    }

    private boolean c(android.location.Location r6) {
            r5 = this;
            if (r6 == 0) goto L16
            double r0 = r6.getLatitude()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            double r0 = r6.getLongitude()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L16
            r6 = 1
            return r6
        L16:
            r6 = 0
            return r6
    }

    private android.os.Handler d() {
            r2 = this;
            android.os.HandlerThread r0 = r2.f822i
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L11
            java.lang.String r0 = "GpsStatusManager"
            java.lang.String r1 = "handler thread not alive"
            cn.jiguang.commons.w.a.c(r0, r1)
            r0 = 0
            return r0
        L11:
            android.os.Handler r0 = r2.f823j
            if (r0 != 0) goto L22
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r2.f822i
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r2.f823j = r0
        L22:
            android.os.Handler r0 = r2.f823j
            return r0
    }

    private void d(cn.jiguang.commons.J.a.f r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.a
            java.lang.Object r0 = r0.get()
            android.location.Location r0 = (android.location.Location) r0
            boolean r0 = r3.c(r0)
            java.lang.String r1 = "GpsStatusManager"
            if (r0 == 0) goto L25
            java.lang.String r0 = "use cached location on timeout"
            cn.jiguang.commons.w.a.a(r1, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r3.a
            java.lang.Object r0 = r0.get()
            android.location.Location r0 = (android.location.Location) r0
            java.lang.String r0 = r3.a(r0)
            r4.c(r0)
            return
        L25:
            android.location.Location r0 = r3.c()
            java.lang.String r2 = "use coarse location"
            cn.jiguang.commons.w.a.a(r1, r2)
            boolean r1 = r3.c(r0)
            if (r1 == 0) goto L3c
            java.lang.String r0 = r3.a(r0)
            r4.c(r0)
            return
        L3c:
            java.lang.String r0 = "No valid location available"
            r4.a(r0)
            return
    }

    static /* synthetic */ void d(cn.jiguang.commons.J.a r0) {
            r0.i()
            return
    }

    private void d(cn.jiguang.commons.c.m r4, cn.jiguang.commons.J.a.f r5) {
            r3 = this;
            android.location.LocationManager r0 = r3.f()
            if (r0 != 0) goto L19
            java.lang.String r4 = "LocationManager not available"
            r5.a(r4)
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r5 = 3019(0xbcb, float:4.23E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.i(r5)
            return
        L19:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f820g
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L29
            java.lang.String r4 = "GPS already listening"
            r5.a(r4)
            return
        L29:
            r3.a(r4)     // Catch: java.lang.Exception -> L3a
            r3.i(r5)     // Catch: java.lang.Exception -> L3a
            r3.j(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r4 = "GpsStatusManager"
            java.lang.String r0 = "gps listening started"
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> L3a
            return
        L3a:
            r4 = move-exception
            r3.a(r5, r4)
            return
    }

    public static cn.jiguang.commons.J.a e() {
            cn.jiguang.commons.J.a r0 = cn.jiguang.commons.J.a.e.a()
            return r0
    }

    private void e(cn.jiguang.commons.J.a.f r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.location.Location r0 = (android.location.Location) r0
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = "GpsStatusManager"
            java.lang.String r1 = "use cached location after max attempts"
            cn.jiguang.commons.w.a.a(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.location.Location r0 = (android.location.Location) r0
            java.lang.String r0 = r2.a(r0)
            r3.c(r0)
            return
        L25:
            java.lang.String r0 = "Max attempts reached without valid location"
            r3.a(r0)
            return
    }

    private android.location.LocationManager f() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f821h
            java.lang.Object r0 = r0.get()
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            if (r0 != 0) goto L1d
            android.content.Context r1 = cn.jiguang.commons.L.h.a()
            if (r1 == 0) goto L1d
            java.lang.String r0 = "location"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            java.util.concurrent.atomic.AtomicReference r1 = r2.f821h
            r1.set(r0)
        L1d:
            return r0
    }

    private void f(cn.jiguang.commons.J.a.f r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r0 = r0.get()
            android.location.Location r0 = (android.location.Location) r0
            boolean r1 = r7.c(r0)
            java.lang.String r2 = "GpsStatusManager"
            if (r1 == 0) goto L3b
            long r3 = r7.a()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "use cached location, remaining:"
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = "s"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jiguang.commons.w.a.a(r2, r1)
            java.lang.String r0 = r7.a(r0)
            r8.c(r0)
            r7.i()
            return
        L3b:
            java.lang.String r8 = "no valid cached location"
            cn.jiguang.commons.w.a.f(r2, r8)
            return
    }

    private android.location.Location g() {
            r1 = this;
            java.lang.String r0 = "gps"
            android.location.Location r0 = r1.a(r0)
            return r0
    }

    private void g(cn.jiguang.commons.J.a.f r4) {
            r3 = this;
            cn.jiguang.commons.J.a$b r0 = new cn.jiguang.commons.J.a$b
            r0.<init>(r3, r4)
            r3.f824k = r0
            android.location.LocationManager r0 = r3.f()
            android.location.GnssStatus$Callback r1 = r3.f824k
            android.os.Handler r2 = r3.f823j
            boolean r0 = cn.jiguang.commons.J.g.a(r0, r1, r2)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "Failed to register GNSS callback"
            r4.a(r0)
            r3.i()
            return
        L1e:
            java.lang.String r4 = "GpsStatusManager"
            java.lang.String r0 = "gnss callback registered"
            cn.jiguang.commons.w.a.a(r4, r0)
            return
    }

    private void h(cn.jiguang.commons.J.a.f r4) {
            r3 = this;
            cn.jiguang.commons.J.a$c r0 = new cn.jiguang.commons.J.a$c
            r0.<init>(r3, r4)
            r3.l = r0
            android.location.LocationManager r0 = r3.f()     // Catch: java.lang.Exception -> L18
            android.location.GpsStatus$Listener r1 = r3.l     // Catch: java.lang.Exception -> L18
            r0.addGpsStatusListener(r1)     // Catch: java.lang.Exception -> L18
            java.lang.String r0 = "GpsStatusManager"
            java.lang.String r1 = "gps listener registered"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to register GPS listener: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.a(r0)
            r3.i()
            return
    }

    private boolean h() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private void i() {
            r5 = this;
            r0 = 0
            android.os.Handler r1 = r5.d()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r2 = 0
            if (r1 == 0) goto L10
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            goto L10
        Lc:
            r1 = move-exception
            goto L56
        Le:
            r1 = move-exception
            goto L3b
        L10:
            boolean r1 = r5.h()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            if (r1 == 0) goto L26
            android.location.GnssStatus$Callback r1 = r5.f824k     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            if (r1 == 0) goto L26
            android.location.LocationManager r1 = r5.f()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            android.location.GnssStatus$Callback r3 = r5.f824k     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            cn.jiguang.commons.J.b.a(r1, r3)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r5.f824k = r2     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            goto L35
        L26:
            android.location.GpsStatus$Listener r1 = r5.l     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            if (r1 == 0) goto L35
            android.location.LocationManager r1 = r5.f()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            android.location.GpsStatus$Listener r3 = r5.l     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r1.removeGpsStatusListener(r3)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r5.l = r2     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
        L35:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f820g
            r1.set(r0)
            return
        L3b:
            java.lang.String r2 = "GpsStatusManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r3.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = "stop gps err:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> Lc
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc
            cn.jiguang.commons.w.a.f(r2, r1)     // Catch: java.lang.Throwable -> Lc
            goto L35
        L56:
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.f820g
            r2.set(r0)
            throw r1
    }

    private void i(cn.jiguang.commons.J.a.f r2) {
            r1 = this;
            boolean r0 = r1.h()
            if (r0 == 0) goto La
            r1.g(r2)
            return
        La:
            r1.h(r2)
            return
    }

    private void j(cn.jiguang.commons.J.a.f r5) {
            r4 = this;
            android.os.Handler r0 = r4.d()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "Internal error"
            r5.a(r0)
            return
        Lc:
            cn.jiguang.commons.J.a$d r1 = new cn.jiguang.commons.J.a$d
            r1.<init>(r4, r5)
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)
            return
    }

    private boolean k(cn.jiguang.commons.J.a.f r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f819f
            int r0 = r0.get()
            r1 = 3
            if (r0 < r1) goto L11
            r2.e(r3)
            r2.i()
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    public void c(cn.jiguang.commons.c.m r4, cn.jiguang.commons.J.a.f r5) {
            r3 = this;
            android.os.Handler r0 = r3.d()
            java.lang.String r1 = "GpsStatusManager"
            if (r0 != 0) goto L20
            java.lang.String r4 = "cannot get gps handler"
            cn.jiguang.commons.w.a.c(r1, r4)
            java.lang.String r4 = "Internal error"
            r5.a(r4)
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r5 = 3035(0xbdb, float:4.253E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.i(r5)
            return
        L20:
            boolean r2 = cn.jiguang.commons.L.u.k()
            if (r2 != 0) goto L3e
            java.lang.String r4 = "location permission denied"
            cn.jiguang.commons.w.a.f(r1, r4)
            java.lang.String r4 = "Location permission not granted"
            r5.a(r4)
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r5 = 3018(0xbca, float:4.229E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.i(r5)
            return
        L3e:
            cn.jiguang.commons.L.q r2 = cn.jiguang.commons.L.q.g()
            boolean r2 = r2.i()
            if (r2 != 0) goto L60
            java.lang.String r4 = "gps disabled"
            cn.jiguang.commons.w.a.f(r1, r4)
            java.lang.String r4 = "GPS is disabled"
            r5.a(r4)
            cn.jiguang.commons.A.a r4 = cn.jiguang.commons.A.a.f()
            r5 = 3024(0xbd0, float:4.238E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.i(r5)
            return
        L60:
            cn.jiguang.commons.J.a$a r1 = new cn.jiguang.commons.J.a$a
            r1.<init>(r3, r5, r4)
            r0.post(r1)
            return
    }
}
