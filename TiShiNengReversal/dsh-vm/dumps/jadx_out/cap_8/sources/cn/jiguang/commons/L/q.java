package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {
    private static final java.lang.String[] m = null;
    private final android.location.LocationManager a;

    /* renamed from: c, reason: collision with root package name */
    private volatile android.os.HandlerThread f911c;

    /* renamed from: d, reason: collision with root package name */
    private volatile android.os.Handler f912d;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f913e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f914f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f915g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f916h;

    /* renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f917i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f918j;

    /* renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap f919k;
    private final java.lang.Runnable l;

    class a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.L.q a;

        a(cn.jiguang.commons.L.q r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                cn.jiguang.commons.L.q r0 = r1.a
                cn.jiguang.commons.L.q.a(r0)
                return
        }
    }

    class b implements android.location.LocationListener {
        final /* synthetic */ java.util.concurrent.CountDownLatch a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.L.q f920b;

        b(cn.jiguang.commons.L.q r1, java.util.concurrent.CountDownLatch r2) {
                r0 = this;
                r0.f920b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r4) {
                r3 = this;
                java.lang.String r0 = "LocationUtils"
                cn.jiguang.commons.L.q r1 = r3.f920b     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                cn.jiguang.commons.c.j r1 = cn.jiguang.commons.L.q.a(r1, r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                if (r1 == 0) goto L2c
                cn.jiguang.commons.L.q r2 = r3.f920b     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                cn.jiguang.commons.L.q.a(r2, r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                r1.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                java.lang.String r2 = "loc:callback:ok:"
                r1.append(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                java.lang.String r4 = r4.getProvider()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                r1.append(r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                goto L2c
            L28:
                r4 = move-exception
                goto L4d
            L2a:
                r4 = move-exception
                goto L34
            L2c:
                cn.jiguang.commons.L.q r4 = r3.f920b
                java.util.concurrent.CountDownLatch r0 = r3.a
                cn.jiguang.commons.L.q.a(r4, r0)
                return
            L34:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
                r1.<init>()     // Catch: java.lang.Throwable -> L28
                java.lang.String r2 = "loc:callback:err:"
                r1.append(r2)     // Catch: java.lang.Throwable -> L28
                java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L28
                r1.append(r4)     // Catch: java.lang.Throwable -> L28
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L28
                cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L28
                goto L2c
            L4d:
                cn.jiguang.commons.L.q r0 = r3.f920b
                java.util.concurrent.CountDownLatch r1 = r3.a
                cn.jiguang.commons.L.q.a(r0, r1)
                throw r4
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "loc:provider_disabled:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "LocationUtils"
                cn.jiguang.commons.w.a.f(r0, r3)
                cn.jiguang.commons.L.q r3 = r2.f920b
                java.util.concurrent.CountDownLatch r0 = r2.a
                cn.jiguang.commons.L.q.a(r3, r0)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                if (r2 != 0) goto L1f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "loc:provider_out:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "LocationUtils"
                cn.jiguang.commons.w.a.f(r2, r1)
                cn.jiguang.commons.L.q r1 = r0.f920b
                java.util.concurrent.CountDownLatch r2 = r0.a
                cn.jiguang.commons.L.q.a(r1, r2)
            L1f:
                return
        }
    }

    class c implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.location.LocationListener f921b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.L.q f922c;

        c(cn.jiguang.commons.L.q r1, java.lang.String r2, android.location.LocationListener r3) {
                r0 = this;
                r0.f922c = r1
                r0.a = r2
                r0.f921b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.lang.String r1 = "LocationUtils"
                cn.jiguang.commons.L.q r0 = r8.f922c     // Catch: java.lang.Exception -> L29
                android.location.LocationManager r2 = cn.jiguang.commons.L.q.c(r0)     // Catch: java.lang.Exception -> L29
                java.lang.String r3 = r8.a     // Catch: java.lang.Exception -> L29
                android.location.LocationListener r7 = r8.f921b     // Catch: java.lang.Exception -> L29
                r4 = 2000(0x7d0, double:9.88E-321)
                r6 = 0
                r2.requestLocationUpdates(r3, r4, r6, r7)     // Catch: java.lang.Exception -> L29
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
                r0.<init>()     // Catch: java.lang.Exception -> L29
                java.lang.String r2 = "loc:req_registered:"
                r0.append(r2)     // Catch: java.lang.Exception -> L29
                java.lang.String r2 = r8.a     // Catch: java.lang.Exception -> L29
                r0.append(r2)     // Catch: java.lang.Exception -> L29
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L29
                cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L29
                return
            L29:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "loc:req_err:"
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.commons.w.a.f(r1, r0)
                cn.jiguang.commons.L.q r0 = r8.f922c
                java.util.concurrent.atomic.AtomicReference r1 = cn.jiguang.commons.L.q.d(r0)
                java.lang.Object r1 = r1.get()
                java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
                cn.jiguang.commons.L.q.a(r0, r1)
                return
        }
    }

    private static class d {
        final android.location.Location a;

        /* renamed from: b, reason: collision with root package name */
        final long f923b;

        d(android.location.Location r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f923b = r2
                return
        }

        boolean a(long r4) {
                r3 = this;
                long r0 = r3.f923b
                long r4 = r4 - r0
                long r4 = java.lang.Math.abs(r4)
                r0 = 2000(0x7d0, double:9.88E-321)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto Lf
                r4 = 1
                return r4
            Lf:
                r4 = 0
                return r4
        }
    }

    private static class e {
        private static final cn.jiguang.commons.L.q a = null;

        static {
                cn.jiguang.commons.L.q r0 = new cn.jiguang.commons.L.q
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.L.q.e.a = r0
                return
        }

        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.L.q a() {
                cn.jiguang.commons.L.q r0 = cn.jiguang.commons.L.q.e.a
                return r0
        }
    }

    static {
            java.lang.String r0 = "network"
            java.lang.String r1 = "gps"
            java.lang.String r2 = "passive"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            cn.jiguang.commons.L.q.m = r0
            return
    }

    private q() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f913e = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f914f = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f915g = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.f916h = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f917i = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.f918j = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f919k = r0
            cn.jiguang.commons.L.q$a r0 = new cn.jiguang.commons.L.q$a
            r0.<init>(r2)
            r2.l = r0
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            if (r0 == 0) goto L4b
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r2.a = r0
            return
    }

    /* synthetic */ q(cn.jiguang.commons.L.q.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private android.location.LocationListener a(java.util.concurrent.CountDownLatch r2) {
            r1 = this;
            cn.jiguang.commons.L.q$b r0 = new cn.jiguang.commons.L.q$b
            r0.<init>(r1, r2)
            return r0
    }

    private cn.jiguang.commons.c.j a(android.location.Location r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            cn.jiguang.commons.c.j r0 = new cn.jiguang.commons.c.j
            r0.<init>()
            double r1 = r4.getLatitude()
            r0.f1047e = r1
            double r1 = r4.getLongitude()
            r0.f1048f = r1
            float r1 = r4.getAccuracy()
            double r1 = (double) r1
            r0.f1051i = r1
            float r1 = r4.getBearing()
            double r1 = (double) r1
            r0.f1050h = r1
            float r1 = r4.getSpeed()
            double r1 = (double) r1
            r0.f1052j = r1
            double r1 = r4.getAltitude()
            r0.f1049g = r1
            java.lang.String r1 = r4.getProvider()
            r0.f1053k = r1
            long r1 = r4.getTime()
            r0.a = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f1045c = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L50
            boolean r4 = r4.isFromMockProvider()
            if (r4 == 0) goto L50
            r4 = 1
            goto L51
        L50:
            r4 = 0
        L51:
            r0.l = r4
            return r0
    }

    static /* synthetic */ cn.jiguang.commons.c.j a(cn.jiguang.commons.L.q r0, android.location.Location r1) {
            cn.jiguang.commons.c.j r0 = r0.a(r1)
            return r0
    }

    private cn.jiguang.commons.c.j a(boolean r13) {
            r12 = this;
            java.lang.String r0 = "loc:lk:"
            java.lang.String r1 = "LocationUtils"
            r2 = 0
            java.lang.String[] r3 = cn.jiguang.commons.L.q.m     // Catch: java.lang.Exception -> L60
            int r4 = r3.length     // Catch: java.lang.Exception -> L60
            r5 = 0
            r7 = r2
            r6 = 0
        Lb:
            if (r6 >= r4) goto L62
            r8 = r3[r6]     // Catch: java.lang.Exception -> L60
            boolean r9 = r12.d(r8)     // Catch: java.lang.Exception -> L35
            if (r9 == 0) goto L5d
            android.location.LocationManager r9 = r12.a     // Catch: java.lang.Exception -> L35
            android.location.Location r9 = r12.a(r9, r8)     // Catch: java.lang.Exception -> L35
            if (r9 == 0) goto L37
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r10.<init>()     // Catch: java.lang.Exception -> L35
            r10.append(r0)     // Catch: java.lang.Exception -> L35
            r10.append(r8)     // Catch: java.lang.Exception -> L35
            java.lang.String r11 = ":ok"
            r10.append(r11)     // Catch: java.lang.Exception -> L35
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L35
            cn.jiguang.commons.w.a.a(r1, r10)     // Catch: java.lang.Exception -> L35
            goto L37
        L35:
            r9 = move-exception
            goto L3f
        L37:
            boolean r8 = r12.a(r9, r7)     // Catch: java.lang.Exception -> L35
            if (r8 == 0) goto L5d
            r7 = r9
            goto L5d
        L3f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r10.<init>()     // Catch: java.lang.Exception -> L60
            r10.append(r0)     // Catch: java.lang.Exception -> L60
            r10.append(r8)     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = ":err:"
            r10.append(r8)     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = r9.getMessage()     // Catch: java.lang.Exception -> L60
            r10.append(r8)     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Exception -> L60
            cn.jiguang.commons.w.a.f(r1, r8)     // Catch: java.lang.Exception -> L60
        L5d:
            int r6 = r6 + 1
            goto Lb
        L60:
            r13 = move-exception
            goto Lcd
        L62:
            if (r7 == 0) goto Lc7
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L60
            long r8 = r7.getTime()     // Catch: java.lang.Exception -> L60
            long r3 = r3 - r8
            long r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Exception -> L60
            r8 = 40000(0x9c40, double:1.97626E-319)
            r0 = 1
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto L7b
            r6 = 1
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r13 == 0) goto L86
            r8 = 300000(0x493e0, double:1.482197E-318)
            int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r13 >= 0) goto L86
            r5 = 1
        L86:
            if (r6 != 0) goto La2
            if (r5 == 0) goto L8b
            goto La2
        L8b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r13.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "loc:lk:old:age="
            r13.append(r0)     // Catch: java.lang.Exception -> L60
            r13.append(r3)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "ms"
            r13.append(r0)     // Catch: java.lang.Exception -> L60
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L60
            goto Lc9
        La2:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r13.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "loc:lk:valid:age="
            r13.append(r0)     // Catch: java.lang.Exception -> L60
            r13.append(r3)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = "ms,provider="
            r13.append(r0)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r7.getProvider()     // Catch: java.lang.Exception -> L60
            r13.append(r0)     // Catch: java.lang.Exception -> L60
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L60
            cn.jiguang.commons.w.a.a(r1, r13)     // Catch: java.lang.Exception -> L60
            cn.jiguang.commons.c.j r13 = r12.a(r7)     // Catch: java.lang.Exception -> L60
            return r13
        Lc7:
            java.lang.String r13 = "loc:lk:null"
        Lc9:
            cn.jiguang.commons.w.a.a(r1, r13)     // Catch: java.lang.Exception -> L60
            goto Le5
        Lcd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "loc:lk:err:"
            r0.append(r3)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            cn.jiguang.commons.w.a.f(r1, r13)
        Le5:
            return r2
    }

    private java.lang.String a(java.lang.String r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f917i
            boolean r0 = r0.get()
            java.lang.String[] r1 = cn.jiguang.commons.L.q.m
            int r2 = r1.length
            r3 = 0
        La:
            java.lang.String r4 = "LocationUtils"
            if (r3 >= r2) goto L40
            r5 = r1[r3]
            boolean r6 = r5.equals(r8)
            if (r6 == 0) goto L17
            goto L3d
        L17:
            if (r0 != 0) goto L22
            java.lang.String r6 = "passive"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L22
            goto L3d
        L22:
            boolean r6 = r7.d(r5)
            if (r6 == 0) goto L3d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "loc:best_provider:"
            r8.append(r0)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            cn.jiguang.commons.w.a.a(r4, r8)
            return r5
        L3d:
            int r3 = r3 + 1
            goto La
        L40:
            java.lang.String r8 = "loc:no_provider"
            cn.jiguang.commons.w.a.f(r4, r8)
            r8 = 0
            return r8
    }

    private void a() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.f916h     // Catch: java.lang.Exception -> L27
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L27
            android.location.LocationListener r0 = (android.location.LocationListener) r0     // Catch: java.lang.Exception -> L27
            r3.a(r0)     // Catch: java.lang.Exception -> L27
            java.util.concurrent.atomic.AtomicReference r0 = r3.f915g     // Catch: java.lang.Exception -> L27
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L27
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0     // Catch: java.lang.Exception -> L27
            r3.c(r0)     // Catch: java.lang.Exception -> L27
            java.util.concurrent.atomic.AtomicReference r0 = r3.f915g     // Catch: java.lang.Exception -> L27
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Exception -> L27
            java.util.concurrent.atomic.AtomicReference r0 = r3.f916h     // Catch: java.lang.Exception -> L27
            r0.set(r1)     // Catch: java.lang.Exception -> L27
            java.util.concurrent.atomic.AtomicReference r0 = r3.f914f     // Catch: java.lang.Exception -> L27
            r0.set(r1)     // Catch: java.lang.Exception -> L27
            return
        L27:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loc:err:cleanup:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r1, r0)
            return
    }

    private void a(android.location.LocationListener r3) {
            r2 = this;
            android.location.LocationManager r0 = r2.a     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lc
            r0.removeUpdates(r3)     // Catch: java.lang.Exception -> La
            return
        La:
            r3 = move-exception
            goto Ld
        Lc:
            return
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loc:err:remove_updates:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r0, r3)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.L.q r0) {
            r0.m()
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.L.q r0, cn.jiguang.commons.c.j r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.L.q r0, java.util.concurrent.CountDownLatch r1) {
            r0.c(r1)
            return
    }

    private void a(cn.jiguang.commons.c.j r6) {
            r5 = this;
            java.lang.String r0 = "LocationUtils"
            if (r6 != 0) goto La
            java.lang.String r6 = "loc:sp:save:null"
        L6:
            cn.jiguang.commons.w.a.f(r0, r6)
            return
        La:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L81
            r1.<init>()     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "lat"
            double r3 = r6.f1047e     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "lng"
            double r3 = r6.f1048f     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "acc"
            double r3 = r6.f1051i     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "alt"
            double r3 = r6.f1049g     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "bearing"
            double r3 = r6.f1050h     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "speed"
            double r3 = r6.f1052j     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "time"
            long r3 = r6.a     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "fetch"
            long r3 = r6.f1045c     // Catch: java.lang.Exception -> L81
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "provider"
            java.lang.String r3 = r6.f1053k     // Catch: java.lang.Exception -> L81
            if (r3 == 0) goto L4e
            goto L50
        L4e:
            java.lang.String r3 = ""
        L50:
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "mock"
            boolean r6 = r6.l     // Catch: java.lang.Exception -> L81
            r1.put(r2, r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L81
            r1.<init>()     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "loc:sp:saving:data="
            r1.append(r2)     // Catch: java.lang.Exception -> L81
            r1.append(r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L81
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L81
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = "loc_gps_cache"
            r1.c(r2, r6)     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = "loc:sp:saved"
            cn.jiguang.commons.w.a.a(r0, r6)     // Catch: java.lang.Exception -> L81
            return
        L81:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loc:sp:save:err:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            goto L6
    }

    private boolean a(android.location.Location r8, android.location.Location r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r9 != 0) goto L8
            return r1
        L8:
            long r2 = r8.getTime()
            long r4 = r9.getTime()
            long r2 = r2 - r4
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L19
            return r1
        L19:
            r4 = -120000(0xfffffffffffe2b40, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L21
            return r0
        L21:
            float r8 = r8.getAccuracy()
            float r9 = r9.getAccuracy()
            float r8 = r8 - r9
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 < 0) goto L3d
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3c
            r9 = 1128792064(0x43480000, float:200.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L3c
            goto L3d
        L3c:
            return r0
        L3d:
            return r1
    }

    private long c(java.lang.String r4) {
            r3 = this;
            r0 = 5000(0x1388, double:2.4703E-320)
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "passive"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L19
            java.lang.String r2 = "gps"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L16
            return r0
        L16:
            r0 = 8000(0x1f40, double:3.9525E-320)
            return r0
        L19:
            r0 = 2000(0x7d0, double:9.88E-321)
            return r0
    }

    static /* synthetic */ android.location.LocationManager c(cn.jiguang.commons.L.q r0) {
            android.location.LocationManager r0 = r0.a
            return r0
    }

    private void c() {
            r2 = this;
            android.os.HandlerThread r0 = r2.f911c
            if (r0 == 0) goto Le
            android.os.HandlerThread r0 = r2.f911c
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            monitor-enter(r2)
            android.os.HandlerThread r0 = r2.f911c     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            android.os.HandlerThread r0 = r2.f911c     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L39
            goto L1e
        L1c:
            r0 = move-exception
            goto L3b
        L1e:
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "jg_c_location"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r2.f911c = r0     // Catch: java.lang.Throwable -> L1c
            android.os.HandlerThread r0 = r2.f911c     // Catch: java.lang.Throwable -> L1c
            r0.start()     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L1c
            android.os.HandlerThread r1 = r2.f911c     // Catch: java.lang.Throwable -> L1c
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r2.f912d = r0     // Catch: java.lang.Throwable -> L1c
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L3b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    private void c(cn.jiguang.commons.c.j r4) {
            r3 = this;
            java.lang.String r0 = "LocationUtils"
            if (r4 != 0) goto La
            java.lang.String r4 = "loc:err:cache_null"
            cn.jiguang.commons.w.a.f(r0, r4)
            return
        La:
            java.lang.String r1 = "loc:cache:updating"
            cn.jiguang.commons.w.a.a(r0, r1)
            java.util.concurrent.atomic.AtomicReference r1 = r3.f913e
            r1.set(r4)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f917i
            r2 = 1
            r1.set(r2)
            cn.jiguang.commons.d.c r1 = cn.jiguang.commons.d.c.a()
            r2 = 1502(0x5de, float:2.105E-42)
            r1.a(r2, r4)
            r3.a(r4)
            java.lang.String r4 = "loc:cache:updated"
            cn.jiguang.commons.w.a.a(r0, r4)
            return
    }

    private void c(java.util.concurrent.CountDownLatch r6) {
            r5 = this;
            if (r6 == 0) goto L2b
            long r0 = r6.getCount()     // Catch: java.lang.Exception -> L10
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2b
            r6.countDown()     // Catch: java.lang.Exception -> L10
            return
        L10:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loc:signal:err:"
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r0, r6)
        L2b:
            return
    }

    private cn.jiguang.commons.c.j d() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r6.f913e
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.c.j r0 = (cn.jiguang.commons.c.j) r0
            if (r0 == 0) goto L1d
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.a
            long r1 = r1 - r3
            long r1 = java.lang.Math.abs(r1)
            r3 = 40000(0x9c40, double:1.97626E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L1d
            return r0
        L1d:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference d(cn.jiguang.commons.L.q r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.f915g
            return r0
    }

    private boolean d(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.location.LocationManager r1 = r3.a     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto Lf
            boolean r4 = r1.isProviderEnabled(r4)     // Catch: java.lang.Exception -> Ld
            if (r4 == 0) goto Lf
            r4 = 1
            return r4
        Ld:
            r4 = move-exception
            goto L10
        Lf:
            return r0
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "loc:provider:err:"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r1, r4)
            return r0
    }

    private cn.jiguang.commons.c.j e(java.lang.String r12) {
            r11 = this;
            java.lang.String r0 = "LocationUtils"
            java.lang.String r1 = r11.a(r12)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L19
            cn.jiguang.commons.c.j r12 = r11.a(r2)
            if (r12 == 0) goto L11
            return r12
        L11:
            cn.jiguang.commons.c.j r12 = r11.h()
            if (r12 == 0) goto L18
            return r12
        L18:
            return r3
        L19:
            cn.jiguang.commons.g.l r4 = cn.jiguang.commons.g.l.a()
            r5 = 1502(0x5de, float:2.105E-42)
            boolean r4 = r4.a(r5)
            if (r4 != 0) goto L26
            return r3
        L26:
            java.util.concurrent.atomic.AtomicReference r4 = r11.f914f
            r4.set(r1)
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r4.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r5 = r11.f915g
            r5.set(r4)
            android.location.LocationListener r5 = r11.a(r4)
            java.util.concurrent.atomic.AtomicReference r6 = r11.f916h
            r6.set(r5)
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r11.k()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            long r8 = r11.c(r1)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            boolean r4 = r4.await(r8, r10)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            long r8 = r8 - r6
            long r6 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            java.lang.String r8 = "s"
            if (r4 == 0) goto L89
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r12.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.String r1 = "loc:req_ok:time="
            r12.append(r1)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r12.append(r6)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r12.append(r8)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            cn.jiguang.commons.w.a.a(r0, r12)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.util.concurrent.atomic.AtomicReference r12 = r11.f913e     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.Object r12 = r12.get()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            cn.jiguang.commons.c.j r12 = (cn.jiguang.commons.c.j) r12     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
        L7e:
            r11.a(r5)
            r11.a()
            return r12
        L85:
            r12 = move-exception
            goto Le8
        L87:
            r12 = move-exception
            goto Lc8
        L89:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r4.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.String r9 = "loc:req_timeout:"
            r4.append(r9)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r4.append(r1)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.String r9 = ":"
            r4.append(r9)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r4.append(r6)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            r4.append(r8)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            cn.jiguang.commons.c.j r2 = r11.a(r2)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            if (r2 == 0) goto Lb5
            r11.a(r5)
            r11.a()
            return r2
        Lb5:
            if (r12 != 0) goto Lc1
            java.lang.String r12 = "loc:req_retry"
            cn.jiguang.commons.w.a.a(r0, r12)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            cn.jiguang.commons.c.j r12 = r11.e(r1)     // Catch: java.lang.Throwable -> L85 java.lang.InterruptedException -> L87
            goto L7e
        Lc1:
            r11.a(r5)
            r11.a()
            return r3
        Lc8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "loc:err:interrupted:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L85
            r1.append(r12)     // Catch: java.lang.Throwable -> L85
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L85
            cn.jiguang.commons.w.a.f(r0, r12)     // Catch: java.lang.Throwable -> L85
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L85
            r12.interrupt()     // Catch: java.lang.Throwable -> L85
            goto Lc1
        Le8:
            r11.a(r5)
            r11.a()
            throw r12
    }

    private cn.jiguang.commons.c.j f() {
            r7 = this;
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "loc:start"
            java.lang.String r2 = "LocationUtils"
            cn.jiguang.commons.w.a.a(r2, r1)
            cn.jiguang.commons.c.j r1 = r7.d()
            java.lang.String r3 = ",lng="
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loc:cache_hit:lat="
            r4.append(r5)
            double r5 = r1.f1047e
            r4.append(r5)
            r4.append(r3)
            double r5 = r1.f1048f
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.a(r2, r3)
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            r2.h(r0)
        L3a:
            r7.l()
            return r1
        L3e:
            java.lang.String r1 = "loc:cache_miss"
            cn.jiguang.commons.w.a.a(r2, r1)
            cn.jiguang.commons.c.j r1 = r7.h()
            if (r1 == 0) goto L74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loc:sp_hit:lat="
            r4.append(r5)
            double r5 = r1.f1047e
            r4.append(r5)
            r4.append(r3)
            double r5 = r1.f1048f
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.a(r2, r3)
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            r2.h(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r7.f913e
            r0.set(r1)
            goto L3a
        L74:
            java.lang.String r0 = "loc:sp_miss"
            cn.jiguang.commons.w.a.a(r2, r0)
            java.lang.String r0 = "loc:no_data:trigger_bg"
            cn.jiguang.commons.w.a.a(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3001(0xbb9, float:4.205E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.h(r1)
            r7.l()
            r0 = 0
            return r0
    }

    public static cn.jiguang.commons.L.q g() {
            cn.jiguang.commons.L.q r0 = cn.jiguang.commons.L.q.e.a()
            return r0
    }

    private boolean j() {
            r4 = this;
            android.location.LocationManager r0 = r4.a
            r1 = 0
            java.lang.String r2 = "LocationUtils"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "loc:err:mgr_null"
            cn.jiguang.commons.w.a.f(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3019(0xbcb, float:4.23E-42)
        L12:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.h(r2)
            return r1
        L1a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r0 < r3) goto L32
            boolean r0 = cn.jiguang.commons.L.u.k()
            if (r0 != 0) goto L32
            java.lang.String r0 = "loc:err:no_perm"
            cn.jiguang.commons.w.a.f(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3018(0xbca, float:4.229E-42)
            goto L12
        L32:
            boolean r0 = r4.i()
            if (r0 != 0) goto L44
            java.lang.String r0 = "loc:err:service_disabled"
            cn.jiguang.commons.w.a.f(r2, r0)
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r2 = 3024(0xbd0, float:4.238E-42)
            goto L12
        L44:
            r0 = 1
            return r0
    }

    private void k() {
            r5 = this;
            java.lang.String r0 = "LocationUtils"
            r5.c()     // Catch: java.lang.Exception -> L44
            java.util.concurrent.atomic.AtomicReference r1 = r5.f914f     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L44
            java.util.concurrent.atomic.AtomicReference r2 = r5.f916h     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L44
            android.location.LocationListener r2 = (android.location.LocationListener) r2     // Catch: java.lang.Exception -> L44
            android.location.LocationManager r3 = r5.a     // Catch: java.lang.Exception -> L44
            if (r3 == 0) goto L51
            if (r1 == 0) goto L51
            if (r2 != 0) goto L1e
            goto L51
        L1e:
            boolean r3 = r5.d(r1)     // Catch: java.lang.Exception -> L44
            if (r3 != 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L44
            r2.<init>()     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = "loc:req_err:provider_disabled:"
            r2.append(r3)     // Catch: java.lang.Exception -> L44
            r2.append(r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L44
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.concurrent.atomic.AtomicReference r1 = r5.f915g     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L44
        L3e:
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1     // Catch: java.lang.Exception -> L44
            r5.c(r1)     // Catch: java.lang.Exception -> L44
            return
        L44:
            r1 = move-exception
            goto L5d
        L46:
            android.os.Handler r3 = r5.f912d     // Catch: java.lang.Exception -> L44
            cn.jiguang.commons.L.q$c r4 = new cn.jiguang.commons.L.q$c     // Catch: java.lang.Exception -> L44
            r4.<init>(r5, r1, r2)     // Catch: java.lang.Exception -> L44
            r3.post(r4)     // Catch: java.lang.Exception -> L44
            return
        L51:
            java.lang.String r1 = "loc:req_err:null_param"
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Exception -> L44
            java.util.concurrent.atomic.AtomicReference r1 = r5.f915g     // Catch: java.lang.Exception -> L44
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L44
            goto L3e
        L5d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loc:req_err:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r5.f915g
            java.lang.Object r0 = r0.get()
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r5.c(r0)
            return
    }

    private void l() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f918j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L12
            java.lang.String r0 = "LocationUtils"
            java.lang.String r1 = "loc:bg:skip:running"
            cn.jiguang.commons.w.a.a(r0, r1)
            return
        L12:
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
            java.lang.Runnable r1 = r3.l
            cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.a
            r0.a(r1, r2)
            return
    }

    private void m() {
            r6 = this;
            java.lang.String r0 = "loc:bg:done"
            java.lang.String r1 = "LocationUtils"
            r2 = 0
            java.lang.String r3 = "loc:bg:start request"
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            r3 = 0
            cn.jiguang.commons.c.j r3 = r6.e(r3)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            if (r3 == 0) goto L18
            java.lang.String r3 = "loc:bg:ok"
            goto L1a
        L14:
            r3 = move-exception
            goto L3f
        L16:
            r3 = move-exception
            goto L26
        L18:
            java.lang.String r3 = "loc:bg:failed"
        L1a:
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
        L1d:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f918j
            r3.set(r2)
            cn.jiguang.commons.w.a.a(r1, r0)
            return
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "loc:bg:err:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L14
            r4.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L14
            cn.jiguang.commons.w.a.f(r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L1d
        L3f:
            java.util.concurrent.atomic.AtomicBoolean r4 = r6.f918j
            r4.set(r2)
            cn.jiguang.commons.w.a.a(r1, r0)
            throw r3
    }

    public android.location.Location a(android.location.LocationManager r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = ":"
            r1 = 0
            java.lang.String r2 = "LocationUtils"
            if (r8 == 0) goto L9f
            if (r9 != 0) goto Lb
            goto L9f
        Lb:
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r5 = r7.f919k
            java.lang.Object r5 = r5.get(r9)
            cn.jiguang.commons.L.q$d r5 = (cn.jiguang.commons.L.q.d) r5
            if (r5 == 0) goto L36
            boolean r6 = r5.a(r3)
            if (r6 == 0) goto L36
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "hit:"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jiguang.commons.w.a.a(r2, r8)
            android.location.Location r8 = r5.a
            return r8
        L36:
            cn.jiguang.commons.g.l r5 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            r6 = 1502(0x5de, float:2.105E-42)
            boolean r5 = r5.a(r6)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            if (r5 == 0) goto L4b
            android.location.Location r1 = r8.getLastKnownLocation(r9)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            goto L4b
        L47:
            r8 = move-exception
            goto L6d
        L49:
            r8 = move-exception
            goto L8c
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            r8.<init>()     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            java.lang.String r5 = "call:"
            r8.append(r5)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            r8.append(r9)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            java.lang.String r5 = ":ret="
            r8.append(r5)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            if (r1 == 0) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 0
        L62:
            r8.append(r5)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            cn.jiguang.commons.w.a.a(r2, r8)     // Catch: java.lang.Exception -> L47 java.lang.SecurityException -> L49
            goto L94
        L6d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "err:"
        L74:
            r5.append(r6)
            r5.append(r9)
            r5.append(r0)
            java.lang.String r8 = r8.getMessage()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            cn.jiguang.commons.w.a.f(r2, r8)
            goto L94
        L8c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "err:perm:"
            goto L74
        L94:
            java.util.concurrent.ConcurrentHashMap r8 = r7.f919k
            cn.jiguang.commons.L.q$d r0 = new cn.jiguang.commons.L.q$d
            r0.<init>(r1, r3)
            r8.put(r9, r0)
            return r1
        L9f:
            java.lang.String r8 = "get:null_param"
            cn.jiguang.commons.w.a.f(r2, r8)
            return r1
    }

    public cn.jiguang.commons.c.j e() {
            r1 = this;
            boolean r0 = r1.j()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            cn.jiguang.commons.c.j r0 = r1.f()
            return r0
    }

    public cn.jiguang.commons.c.j h() {
            r10 = this;
            r0 = 0
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "loc_gps_cache"
            java.lang.String r1 = r1.a(r2, r0)     // Catch: java.lang.Exception -> L80
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L12
            return r0
        L12:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L80
            r2.<init>(r1)     // Catch: java.lang.Exception -> L80
            cn.jiguang.commons.c.j r1 = new cn.jiguang.commons.c.j     // Catch: java.lang.Exception -> L80
            r1.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "lat"
            r4 = 0
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1047e = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "lng"
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1048f = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "acc"
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1051i = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "alt"
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1049g = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "bearing"
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1050h = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "speed"
            double r6 = r2.optDouble(r3, r4)     // Catch: java.lang.Exception -> L80
            r1.f1052j = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "time"
            r6 = 0
            long r8 = r2.optLong(r3, r6)     // Catch: java.lang.Exception -> L80
            r1.a = r8     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "fetch"
            long r6 = r2.optLong(r3, r6)     // Catch: java.lang.Exception -> L80
            r1.f1045c = r6     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "provider"
            java.lang.String r6 = ""
            java.lang.String r3 = r2.optString(r3, r6)     // Catch: java.lang.Exception -> L80
            r1.f1053k = r3     // Catch: java.lang.Exception -> L80
            java.lang.String r3 = "mock"
            r6 = 0
            boolean r2 = r2.optBoolean(r3, r6)     // Catch: java.lang.Exception -> L80
            r1.l = r2     // Catch: java.lang.Exception -> L80
            double r2 = r1.f1047e     // Catch: java.lang.Exception -> L80
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L82
            double r2 = r1.f1048f     // Catch: java.lang.Exception -> L80
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L82
            return r0
        L80:
            r1 = move-exception
            goto L83
        L82:
            return r1
        L83:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loc:sp:err:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r2, r1)
            return r0
    }

    public boolean i() {
            r4 = this;
            r0 = 0
            android.location.LocationManager r1 = r4.a     // Catch: java.lang.Exception -> L10
            if (r1 == 0) goto L4c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10
            r3 = 31
            if (r2 < r3) goto L12
            boolean r0 = cn.jiguang.commons.L.e1.a(r1)     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r1 = move-exception
            goto L32
        L12:
            java.lang.String r2 = "gps"
            boolean r1 = r1.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L30
            android.location.LocationManager r1 = r4.a     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = "network"
            boolean r1 = r1.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto L30
            android.location.LocationManager r1 = r4.a     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = "passive"
            boolean r1 = r1.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L10
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            return r0
        L30:
            r0 = 1
            return r0
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "gps:err:check:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "LocationUtils"
            cn.jiguang.commons.w.a.f(r2, r1)
        L4c:
            return r0
    }
}
