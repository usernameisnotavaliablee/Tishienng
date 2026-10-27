package com.bxkj.student.run.app.location.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LocationService extends android.app.Service {
    private android.app.NotificationManager A;
    private androidx.core.app.NotificationCompat.Builder B;
    private int C;
    private java.lang.String D;
    private java.util.Timer E;
    private final int F;
    private long G;
    private android.os.Handler H;
    private int I;
    private java.lang.String a;
    private boolean b;
    private com.amap.api.location.AMapLocationClient c;
    private com.amap.api.location.AMapLocationClientOption d;
    private float e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> j;
    private java.util.List<com.amap.api.maps.model.LatLng> k;

    /* renamed from: l, reason: collision with root package name */
    private android.app.Notification f1155l;

    /* renamed from: m, reason: collision with root package name */
    private int f1156m;

    /* renamed from: n, reason: collision with root package name */
    private com.bxkj.student.run.app.utils.p f1157n;

    /* renamed from: o, reason: collision with root package name */
    private long f1158o;

    /* renamed from: p, reason: collision with root package name */
    private com.bxkj.student.run.app.utils.z f1159p;

    /* renamed from: q, reason: collision with root package name */
    private android.content.BroadcastReceiver f1160q;

    /* renamed from: r, reason: collision with root package name */
    private android.media.MediaPlayer f1161r;

    /* renamed from: s, reason: collision with root package name */
    private android.content.BroadcastReceiver f1162s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1163t;

    /* renamed from: u, reason: collision with root package name */
    private com.amap.api.maps.model.LatLng f1164u;

    /* renamed from: v, reason: collision with root package name */
    private com.amap.api.maps.model.LatLng f1165v;

    /* renamed from: w, reason: collision with root package name */
    private com.bxkj.student.run.app.location.LatLngTimeSpeed f1166w;

    /* renamed from: x, reason: collision with root package name */
    private long f1167x;

    /* renamed from: y, reason: collision with root package name */
    private com.amap.api.location.AMapLocationListener f1168y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1169z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.location.service.LocationService a;

        a(com.bxkj.student.run.app.location.service.LocationService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "UPDATE_STEP"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1f
                java.lang.String r3 = "stepCount"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L82
                com.bxkj.student.run.app.location.service.LocationService r0 = r2.a
                r1 = 0
                int r3 = r4.getIntExtra(r3, r1)
                com.bxkj.student.run.app.location.service.LocationService.h(r0, r3)
                return
            L1f:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "SET_RUNNING_PAUSE"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L41
                java.lang.String r3 = "isPause"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L82
                com.bxkj.student.run.app.location.service.LocationService r0 = r2.a
                boolean r1 = com.bxkj.student.run.app.location.service.LocationService.f(r0)
                boolean r3 = r4.getBooleanExtra(r3, r1)
                com.bxkj.student.run.app.location.service.LocationService.j(r0, r3)
                return
            L41:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "STOP_LOCATION"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L53
                com.bxkj.student.run.app.location.service.LocationService r3 = r2.a
                com.bxkj.student.run.app.location.service.LocationService.n(r3)
                return
            L53:
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "RUN_PAUSE_NOTIFICATION"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L71
                java.lang.String r3 = "message"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L82
                java.lang.String r3 = r4.getStringExtra(r3)
                com.bxkj.student.run.app.location.service.LocationService r4 = r2.a
                com.bxkj.student.run.app.location.service.LocationService.m(r4, r3)
                return
            L71:
                java.lang.String r3 = r4.getAction()
                java.lang.String r4 = "RUN_CONTINUE_NOTIFICATION"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L82
                com.bxkj.student.run.app.location.service.LocationService r3 = r2.a
                com.bxkj.student.run.app.location.service.LocationService.p(r3)
            L82:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.location.service.LocationService a;

        b(com.bxkj.student.run.app.location.service.LocationService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                java.lang.String r6 = r6.getAction()
                java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L7e
                android.content.Intent r6 = new android.content.Intent
                java.lang.Class<com.bxkj.student.run.app.lockscreen.LockScreenActivity> r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.class
                r6.<init>(r5, r0)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                float r5 = com.bxkj.student.run.app.location.service.LocationService.d(r5)
                double r0 = (double) r5
                java.lang.String r5 = com.bxkj.student.run.app.utils.i.d(r0)
                java.lang.String r0 = "distance"
                r6.putExtra(r0, r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                float r5 = com.bxkj.student.run.app.location.service.LocationService.d(r5)
                double r0 = (double) r5
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                long r2 = com.bxkj.student.run.app.location.service.LocationService.c(r5)
                java.lang.String r5 = com.bxkj.student.run.app.utils.i.a(r0, r2)
                java.lang.String r0 = "speed"
                r6.putExtra(r0, r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                float r5 = com.bxkj.student.run.app.location.service.LocationService.d(r5)
                double r0 = (double) r5
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                long r2 = com.bxkj.student.run.app.location.service.LocationService.c(r5)
                java.lang.String r5 = com.bxkj.student.run.app.utils.i.b(r0, r2)
                java.lang.String r0 = "peisu"
                r6.putExtra(r0, r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                long r0 = com.bxkj.student.run.app.location.service.LocationService.c(r5)
                java.lang.String r5 = com.bxkj.student.run.app.utils.i.g(r0)
                java.lang.String r0 = "time"
                r6.putExtra(r0, r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                java.lang.String r5 = com.bxkj.student.run.app.location.service.LocationService.g(r5)
                java.lang.String r0 = "lastPauseMessage"
                r6.putExtra(r0, r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                int r5 = com.bxkj.student.run.app.location.service.LocationService.b(r5)
                java.lang.String r0 = "stepCount"
                r6.putExtra(r0, r5)
                r5 = 276824064(0x10800000, float:5.04871E-29)
                r6.addFlags(r5)
                com.bxkj.student.run.app.location.service.LocationService r5 = r4.a
                r5.startActivity(r6)
            L7e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends java.util.TimerTask {
        final /* synthetic */ com.bxkj.student.run.app.location.service.LocationService a;

        c(com.bxkj.student.run.app.location.service.LocationService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r2 = this;
                com.bxkj.student.run.app.location.service.LocationService r0 = r2.a
                android.os.Handler r0 = com.bxkj.student.run.app.location.service.LocationService.e(r0)
                r1 = 170(0xaa, float:2.38E-43)
                r0.sendEmptyMessage(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.run.app.location.service.LocationService a;

        d(com.bxkj.student.run.app.location.service.LocationService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r7) {
                r6 = this;
                int r7 = r7.what
                r0 = 170(0xaa, float:2.38E-43)
                if (r7 == r0) goto L7
                goto Lf
            L7:
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                boolean r7 = com.bxkj.student.run.app.location.service.LocationService.f(r7)
                if (r7 == 0) goto L10
            Lf:
                return
            L10:
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                long r0 = com.bxkj.student.run.app.location.service.LocationService.c(r7)
                r2 = 1
                long r0 = r0 + r2
                com.bxkj.student.run.app.location.service.LocationService.i(r7, r0)
                long r0 = java.lang.System.currentTimeMillis()
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                com.bxkj.student.run.app.location.service.LocationService.k(r7, r0)
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                long r0 = com.bxkj.student.run.app.location.service.LocationService.c(r7)
                com.bxkj.student.run.app.location.service.LocationService.q(r7, r0)
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                com.bxkj.student.run.app.location.service.LocationService.p(r7)
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                com.bxkj.student.run.app.location.service.LocationService.o(r7)
                com.bxkj.student.run.app.location.service.LocationService r0 = r6.a
                long r1 = com.bxkj.student.run.app.location.service.LocationService.c(r0)
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                float r7 = com.bxkj.student.run.app.location.service.LocationService.d(r7)
                double r3 = (double) r7
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                int r5 = com.bxkj.student.run.app.location.service.LocationService.b(r7)
                com.bxkj.student.run.app.utils.y.g(r0, r1, r3, r5)
                com.bxkj.student.run.app.location.service.LocationService r7 = r6.a
                com.bxkj.student.run.app.location.service.LocationService.l(r7)
                return
        }
    }

    public LocationService() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "LocationService"
            r4.a = r0
            r0 = 0
            r4.b = r0
            r1 = 0
            r4.c = r1
            r4.d = r1
            r1 = 0
            r4.g = r1
            r4.i = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.k = r3
            r3 = 3
            r4.f1156m = r3
            com.bxkj.student.run.app.location.service.LocationService$b r3 = new com.bxkj.student.run.app.location.service.LocationService$b
            r3.<init>(r4)
            r4.f1162s = r3
            r4.f1163t = r0
            r4.f1167x = r1
            com.bxkj.student.run.app.location.service.a r3 = new com.bxkj.student.run.app.location.service.a
            r3.<init>(r4)
            r4.f1168y = r3
            r4.f1169z = r0
            r3 = 100
            r4.C = r3
            java.lang.String r3 = ""
            r4.D = r3
            r3 = 170(0xaa, float:2.38E-43)
            r4.F = r3
            r4.G = r1
            com.bxkj.student.run.app.location.service.LocationService$d r1 = new com.bxkj.student.run.app.location.service.LocationService$d
            r1.<init>(r4)
            r4.H = r1
            r4.I = r0
            return
    }

    private void A() {
            r4 = this;
            com.bxkj.student.run.app.location.service.LocationService$a r0 = new com.bxkj.student.run.app.location.service.LocationService$a
            r0.<init>(r4)
            r4.f1160q = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "UPDATE_DISTANCE"
            r0.addAction(r1)
            java.lang.String r1 = "UPDATE_STEP"
            r0.addAction(r1)
            java.lang.String r1 = "SET_RUNNING_PAUSE"
            r0.addAction(r1)
            java.lang.String r1 = "STOP_LOCATION"
            r0.addAction(r1)
            java.lang.String r1 = "RUN_PAUSE_NOTIFICATION"
            r0.addAction(r1)
            java.lang.String r1 = "RUN_CONTINUE_NOTIFICATION"
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r4.f1160q
            java.lang.String r2 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
            return
    }

    private void B() {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r2.f1162s
            r2.registerReceiver(r1, r0)
            return
    }

    private void C() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "SAVE_LOCAL_DB"
            r0.setAction(r1)
            java.lang.String r1 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r1)
            return
    }

    private void D(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "CURRENT_LATLNG"
            r0.setAction(r1)
            java.lang.String r1 = "latLng"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    private void E(java.lang.String r3) {
            r2 = this;
            r2.D = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.f1158o = r0
            androidx.core.app.NotificationCompat$Builder r0 = r2.B
            androidx.core.app.NotificationCompat$Builder r3 = r0.setContentText(r3)
            long r0 = r2.f1158o
            androidx.core.app.NotificationCompat$Builder r3 = r3.setWhen(r0)
            android.app.Notification r3 = r3.build()
            r2.f1155l = r3
            android.app.NotificationManager r0 = r2.A
            int r1 = r2.C
            r0.notify(r1, r3)
            return
    }

    private void F() {
            r1 = this;
            com.amap.api.location.AMapLocationClient r0 = r1.c
            r0.stopLocation()
            com.amap.api.location.AMapLocationClient r0 = r1.c
            r0.startLocation()
            r0 = 1
            r1.f1169z = r0
            return
    }

    private void G() {
            r8 = this;
            long r0 = r8.f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r8.f = r0
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            r8.G = r0
            com.bxkj.student.run.app.location.service.LocationService$c r3 = new com.bxkj.student.run.app.location.service.LocationService$c
            r3.<init>(r8)
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            r8.E = r2
            r4 = 0
            r6 = 1000(0x3e8, double:4.94E-321)
            r2.schedule(r3, r4, r6)
            return
    }

    private void H() {
            r2 = this;
            android.os.Handler r0 = r2.H     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            if (r0 == 0) goto Lb
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            goto Lb
        L9:
            r0 = move-exception
            goto L31
        Lb:
            java.util.Timer r0 = r2.E     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            if (r0 == 0) goto L12
            r0.cancel()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
        L12:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            r2.h = r0     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            r0 = 1
            r2.stopForeground(r0)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            com.amap.api.location.AMapLocationClient r1 = r2.c     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            r1.disableBackgroundLocation(r0)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            boolean r0 = r2.f1169z     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            if (r0 == 0) goto L2d
            com.amap.api.location.AMapLocationClient r0 = r2.c     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            r0.stopLocation()     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
            r0 = 0
            r2.f1169z = r0     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> L35
        L2d:
            r2.stopSelf()
            return
        L31:
            r2.stopSelf()
            throw r0
        L35:
            r2.stopSelf()
            return
    }

    private void I(java.lang.String r3, int r4) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "UPDATE_GPS_STATUS"
            r0.setAction(r1)
            java.lang.String r1 = "gpsStatus"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "gpsStatusImage"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    private void J() {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "NOTIFY_RUN_DATA"
            r0.setAction(r1)
            float r1 = r5.e
            double r1 = (double) r1
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.d(r1)
            java.lang.String r2 = "distance"
            r0.putExtra(r2, r1)
            float r1 = r5.e
            double r1 = (double) r1
            long r3 = r5.g
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.a(r1, r3)
            java.lang.String r2 = "speed"
            r0.putExtra(r2, r1)
            float r1 = r5.e
            double r1 = (double) r1
            long r3 = r5.g
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.b(r1, r3)
            java.lang.String r2 = "peisu"
            r0.putExtra(r2, r1)
            long r1 = r5.g
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            java.lang.String r2 = "time"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "countTime"
            long r2 = r5.g
            r0.putExtra(r1, r2)
            java.lang.String r1 = "stepCount"
            int r2 = r5.I
            r0.putExtra(r1, r2)
            java.lang.String r1 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r5.sendBroadcast(r0, r1)
            return
    }

    private void K() {
            r3 = this;
            java.lang.String r0 = ""
            r3.D = r0
            long r0 = java.lang.System.currentTimeMillis()
            r3.f1158o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "你已经运动"
            r0.<init>(r1)
            float r1 = r3.e
            double r1 = (double) r1
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.d(r1)
            r0.append(r1)
            java.lang.String r1 = " KM,"
            r0.append(r1)
            int r1 = r3.I
            r0.append(r1)
            java.lang.String r1 = "步,用时"
            r0.append(r1)
            long r1 = r3.g
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.g(r1)
            r0.append(r1)
            androidx.core.app.NotificationCompat$Builder r1 = r3.B
            androidx.core.app.NotificationCompat$Builder r0 = r1.setContentText(r0)
            long r1 = r3.f1158o
            androidx.core.app.NotificationCompat$Builder r0 = r0.setWhen(r1)
            android.app.Notification r0 = r0.build()
            r3.f1155l = r0
            android.app.NotificationManager r1 = r3.A
            int r2 = r3.C
            r1.notify(r2, r0)
            return
    }

    private void L(long r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "TIME_CHANGE"
            r0.setAction(r1)
            java.lang.String r1 = "countTime"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.run.app.location.service.LocationService r0, com.amap.api.location.AMapLocation r1) {
            r0.z(r1)
            return
    }

    static /* bridge */ /* synthetic */ int b(com.bxkj.student.run.app.location.service.LocationService r0) {
            int r0 = r0.I
            return r0
    }

    static /* bridge */ /* synthetic */ long c(com.bxkj.student.run.app.location.service.LocationService r2) {
            long r0 = r2.g
            return r0
    }

    static /* bridge */ /* synthetic */ float d(com.bxkj.student.run.app.location.service.LocationService r0) {
            float r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler e(com.bxkj.student.run.app.location.service.LocationService r0) {
            android.os.Handler r0 = r0.H
            return r0
    }

    static /* bridge */ /* synthetic */ boolean f(com.bxkj.student.run.app.location.service.LocationService r0) {
            boolean r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String g(com.bxkj.student.run.app.location.service.LocationService r0) {
            java.lang.String r0 = r0.D
            return r0
    }

    static /* bridge */ /* synthetic */ void h(com.bxkj.student.run.app.location.service.LocationService r0, int r1) {
            r0.I = r1
            return
    }

    static /* bridge */ /* synthetic */ void i(com.bxkj.student.run.app.location.service.LocationService r0, long r1) {
            r0.g = r1
            return
    }

    static /* bridge */ /* synthetic */ void j(com.bxkj.student.run.app.location.service.LocationService r0, boolean r1) {
            r0.b = r1
            return
    }

    static /* bridge */ /* synthetic */ void k(com.bxkj.student.run.app.location.service.LocationService r0, long r1) {
            r0.G = r1
            return
    }

    static /* bridge */ /* synthetic */ void l(com.bxkj.student.run.app.location.service.LocationService r0) {
            r0.C()
            return
    }

    static /* bridge */ /* synthetic */ void m(com.bxkj.student.run.app.location.service.LocationService r0, java.lang.String r1) {
            r0.E(r1)
            return
    }

    static /* bridge */ /* synthetic */ void n(com.bxkj.student.run.app.location.service.LocationService r0) {
            r0.H()
            return
    }

    static /* bridge */ /* synthetic */ void o(com.bxkj.student.run.app.location.service.LocationService r0) {
            r0.J()
            return
    }

    static /* bridge */ /* synthetic */ void p(com.bxkj.student.run.app.location.service.LocationService r0) {
            r0.K()
            return
    }

    static /* bridge */ /* synthetic */ void q(com.bxkj.student.run.app.location.service.LocationService r0, long r1) {
            r0.L(r1)
            return
    }

    private void r(com.amap.api.maps.model.LatLng r3) {
            r2 = this;
            java.lang.String r0 = "第一个定位点获取成功"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "GET_FIRST_LOCATION_SUCCESS"
            r0.setAction(r1)
            java.lang.String r1 = "latLng"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            r3 = 1
            r2.f1163t = r3
            return
    }

    private void s(com.amap.api.maps.model.LatLng r3, com.amap.api.maps.model.LatLng r4, float r5, float r6, java.lang.String r7, java.lang.String r8, boolean r9, com.bxkj.student.run.app.location.LatLngTimeSpeed r10) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "ADD_LINE"
            r0.setAction(r1)
            java.lang.String r1 = "lastLatLng"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "currentLatLng"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "speed"
            r0.putExtra(r3, r5)
            java.lang.String r3 = "distance"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "avgSpeed"
            r0.putExtra(r3, r7)
            java.lang.String r3 = "pace"
            r0.putExtra(r3, r8)
            java.lang.String r3 = "isPause"
            r0.putExtra(r3, r9)
            java.lang.String r3 = "latLngTimeSpeed"
            r0.putExtra(r3, r10)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    private void t(java.lang.String r3, java.lang.String r4, long r5, float r7, long r8, java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r10) {
            r2 = this;
            java.lang.String r0 = "发送广播addOldLine"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "ADD_OLD_LINE"
            r0.setAction(r1)
            java.lang.String r1 = "avgSpeed"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "pace"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "countTime"
            r0.putExtra(r3, r5)
            java.lang.String r3 = "distance"
            r0.putExtra(r3, r7)
            java.lang.String r3 = "startTime"
            r0.putExtra(r3, r8)
            java.lang.String r3 = "latLngTimeSpeedList"
            r0.putParcelableArrayListExtra(r3, r10)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    private void u(com.amap.api.maps.model.LatLng r3, long r4, com.bxkj.student.run.app.location.LatLngTimeSpeed r6) {
            r2 = this;
            java.lang.String r0 = "起始点定位成功"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "ADD_START_POINT"
            r0.setAction(r1)
            java.lang.String r1 = "latLng"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "startTime"
            r0.putExtra(r3, r4)
            java.lang.String r3 = "latLngTimeSpeed"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r0, r3)
            return
    }

    private void v() {
            r2 = this;
            com.amap.api.location.AMapLocationClient r0 = r2.c     // Catch: java.lang.Exception -> L28
            r1 = 0
            if (r0 == 0) goto Lc
            r0.onDestroy()     // Catch: java.lang.Exception -> L28
            r2.c = r1     // Catch: java.lang.Exception -> L28
            r2.d = r1     // Catch: java.lang.Exception -> L28
        Lc:
            android.os.Handler r0 = r2.H     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L13
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Exception -> L28
        L13:
            java.util.Timer r0 = r2.E     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L1a
            r0.cancel()     // Catch: java.lang.Exception -> L28
        L1a:
            android.content.BroadcastReceiver r0 = r2.f1160q     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L21
            r2.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L28
        L21:
            android.content.BroadcastReceiver r0 = r2.f1162s     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L28
            r2.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L28
        L28:
            r0 = 0
            r2.f1169z = r0
            r2.i = r0
            return
    }

    private com.amap.api.location.AMapLocationClientOption w() {
            r4 = this;
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationPurpose.Sport
            r0.setLocationPurpose(r1)
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r0.setLocationMode(r1)
            r1 = 1
            r0.setGpsFirst(r1)
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.setHttpTimeOut(r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.setInterval(r2)
            r0.setNeedAddress(r1)
            r2 = 0
            r0.setOnceLocation(r2)
            r0.setOnceLocationLatest(r2)
            r0.setSensorEnable(r1)
            r0.setWifiScan(r1)
            r0.setLocationCacheEnable(r1)
            r0.setMockEnable(r2)
            return r0
    }

    private void x() {
            r2 = this;
            com.bxkj.student.run.app.utils.p r0 = new com.bxkj.student.run.app.utils.p
            r0.<init>()
            r2.f1157n = r0
            r1 = 3
            r0.p(r1)
            com.amap.api.location.AMapLocationClient r0 = new com.amap.api.location.AMapLocationClient     // Catch: java.lang.Exception -> L2c
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L2c
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L2c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2c
            r2.c = r0     // Catch: java.lang.Exception -> L2c
            com.amap.api.location.AMapLocationClientOption r0 = r2.w()     // Catch: java.lang.Exception -> L2c
            r2.d = r0     // Catch: java.lang.Exception -> L2c
            com.amap.api.location.AMapLocationClient r1 = r2.c     // Catch: java.lang.Exception -> L2c
            r1.setLocationOption(r0)     // Catch: java.lang.Exception -> L2c
            com.amap.api.location.AMapLocationClient r0 = r2.c     // Catch: java.lang.Exception -> L2c
            com.amap.api.location.AMapLocationListener r1 = r2.f1168y     // Catch: java.lang.Exception -> L2c
            r0.setLocationListener(r1)     // Catch: java.lang.Exception -> L2c
        L2c:
            r2.y()
            return
    }

    private void y() {
            r6 = this;
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            java.lang.String r1 = "default"
            r0.<init>(r6, r1)
            r6.B = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.run.app.RunningActivity> r2 = com.bxkj.student.run.app.RunningActivity.class
            r0.<init>(r6, r2)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r3 = 1
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r3, r0, r2)
            long r4 = java.lang.System.currentTimeMillis()
            r6.f1158o = r4
            androidx.core.app.NotificationCompat$Builder r2 = r6.B
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r4 = r4.getString(r5)
            androidx.core.app.NotificationCompat$Builder r2 = r2.setContentTitle(r4)
            java.lang.String r4 = "正在记录本次跑步"
            androidx.core.app.NotificationCompat$Builder r2 = r2.setContentText(r4)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            long r4 = r6.f1158o
            androidx.core.app.NotificationCompat$Builder r0 = r0.setWhen(r4)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setPriority(r3)
            r2 = 0
            androidx.core.app.NotificationCompat$Builder r0 = r0.setAutoCancel(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOngoing(r3)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOnlyAlertOnce(r3)
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r2)
            r2 = 64
            r0.setDefaults(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r6.B
            android.app.Notification r0 = r0.build()
            r6.f1155l = r0
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r6.A = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L7f
            java.lang.String r0 = "体适能"
            r2 = 2
            android.app.NotificationChannel r0 = cn.jiguang.av.b0.a(r1, r0, r2)
            android.app.NotificationManager r1 = r6.A
            cn.jiguang.av.z.a(r1, r0)
        L7f:
            int r0 = r6.C     // Catch: java.lang.Exception -> L94
            android.app.Notification r1 = r6.f1155l     // Catch: java.lang.Exception -> L94
            r6.startForeground(r0, r1)     // Catch: java.lang.Exception -> L94
            com.amap.api.location.AMapLocationClient r0 = r6.c     // Catch: java.lang.Exception -> L94
            int r1 = r6.C     // Catch: java.lang.Exception -> L94
            android.app.Notification r2 = r6.f1155l     // Catch: java.lang.Exception -> L94
            r0.enableBackgroundLocation(r1, r2)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = "initNotification()"
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Exception -> L94
        L94:
            return
    }

    private /* synthetic */ void z(com.amap.api.location.AMapLocation r22) {
            r21 = this;
            r0 = r21
            if (r22 == 0) goto L4c9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.f1167x = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "回调时间: "
            r1.append(r2)
            long r2 = r0.f1167x
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.h(r2, r4)
            r1.append(r2)
            java.lang.String r10 = "\n"
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            int r1 = r22.getErrorCode()
            if (r1 != 0) goto L3fc
            java.lang.String r1 = "定位成功\n"
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "定位类型: "
            r1.append(r2)
            int r2 = r22.getLocationType()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "经    度    : "
            r1.append(r2)
            double r2 = r22.getLongitude()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "纬    度    : "
            r1.append(r2)
            double r2 = r22.getLatitude()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "精    度    : "
            r1.append(r2)
            float r2 = r22.getAccuracy()
            r1.append(r2)
            java.lang.String r2 = "米\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "提供者    : "
            r1.append(r2)
            java.lang.String r2 = r22.getProvider()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "速    度    : "
            r1.append(r2)
            float r2 = r22.getSpeed()
            r1.append(r2)
            java.lang.String r2 = "米/秒\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "角    度    : "
            r1.append(r2)
            float r2 = r22.getBearing()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "星    数    : "
            r1.append(r2)
            int r2 = r22.getSatellites()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "国    家    : "
            r1.append(r2)
            java.lang.String r2 = r22.getCountry()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "省            : "
            r1.append(r2)
            java.lang.String r2 = r22.getProvince()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "市            : "
            r1.append(r2)
            java.lang.String r2 = r22.getCity()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "城市编码 : "
            r1.append(r2)
            java.lang.String r2 = r22.getCityCode()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "区            : "
            r1.append(r2)
            java.lang.String r2 = r22.getDistrict()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "区域 码   : "
            r1.append(r2)
            java.lang.String r2 = r22.getAdCode()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "地    址    : "
            r1.append(r2)
            java.lang.String r2 = r22.getAddress()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "兴趣点    : "
            r1.append(r2)
            java.lang.String r2 = r22.getPoiName()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "定位时间: "
            r1.append(r2)
            long r2 = r22.getTime()
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.h(r2, r4)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            double r2 = r22.getLatitude()
            double r4 = r22.getLongitude()
            r1.<init>(r2, r4)
            r0.f1164u = r1
            r0.D(r1)
            boolean r1 = r0.f1163t
            if (r1 != 0) goto L229
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            r0.r(r1)
        L229:
            int r1 = r22.getLocationType()
            r2 = 6
            if (r1 == r2) goto L452
            float r1 = r22.getAccuracy()
            r2 = 100
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L452
            float r18 = r22.getSpeed()
            boolean r1 = r0.i
            r2 = 1
            if (r1 != 0) goto L32d
            com.amap.api.maps.model.LatLng r1 = com.bxkj.student.run.app.utils.i.p(r22)
            if (r1 == 0) goto L452
            r0.i = r2
            r0.G()
            r1 = 2131886172(0x7f12005c, float:1.9406915E38)
            com.bxkj.student.run.app.utils.y.f(r0, r1)
            java.lang.String r1 = "起始点定位成功"
            com.orhanobut.logger.j.c(r1)
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r0.j
            if (r1 == 0) goto L300
            int r1 = r1.size()
            if (r1 <= 0) goto L300
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2fd
            r1.<init>()     // Catch: java.lang.Exception -> L2fd
            java.lang.String r3 = "oldLatLngTimeSpeedList"
            r1.append(r3)     // Catch: java.lang.Exception -> L2fd
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r3 = r0.j     // Catch: java.lang.Exception -> L2fd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2fd
            r1.append(r3)     // Catch: java.lang.Exception -> L2fd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2fd
            com.orhanobut.logger.j.c(r1)     // Catch: java.lang.Exception -> L2fd
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r0.j     // Catch: java.lang.Exception -> L2fd
            int r3 = r1.size()     // Catch: java.lang.Exception -> L2fd
            int r3 = r3 - r2
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L2fd
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1     // Catch: java.lang.Exception -> L2fd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2fd
            r3.<init>()     // Catch: java.lang.Exception -> L2fd
            java.lang.String r4 = "latLngTimeSpeed1"
            r3.append(r4)     // Catch: java.lang.Exception -> L2fd
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L2fd
            r3.append(r4)     // Catch: java.lang.Exception -> L2fd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2fd
            com.orhanobut.logger.j.c(r3)     // Catch: java.lang.Exception -> L2fd
            r1.setPuase(r2)     // Catch: java.lang.Exception -> L2fd
            com.bxkj.student.run.app.location.LatLngTimeSpeed r11 = new com.bxkj.student.run.app.location.LatLngTimeSpeed     // Catch: java.lang.Exception -> L2fd
            com.amap.api.maps.model.LatLng r1 = r0.f1164u     // Catch: java.lang.Exception -> L2fd
            double r12 = r1.latitude     // Catch: java.lang.Exception -> L2fd
            double r14 = r1.longitude     // Catch: java.lang.Exception -> L2fd
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2fd
            int r20 = r22.getLocationType()     // Catch: java.lang.Exception -> L2fd
            r19 = 1
            r11.<init>(r12, r14, r16, r18, r19, r20)     // Catch: java.lang.Exception -> L2fd
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r0.j     // Catch: java.lang.Exception -> L2fd
            r1.add(r11)     // Catch: java.lang.Exception -> L2fd
            float r1 = r0.e     // Catch: java.lang.Exception -> L2fd
            double r1 = (double) r1     // Catch: java.lang.Exception -> L2fd
            long r3 = r0.g     // Catch: java.lang.Exception -> L2fd
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.a(r1, r3)     // Catch: java.lang.Exception -> L2fd
            float r2 = r0.e     // Catch: java.lang.Exception -> L2fd
            double r2 = (double) r2     // Catch: java.lang.Exception -> L2fd
            long r4 = r0.g     // Catch: java.lang.Exception -> L2fd
            java.lang.String r2 = com.bxkj.student.run.app.utils.i.b(r2, r4)     // Catch: java.lang.Exception -> L2fd
            long r3 = r0.g     // Catch: java.lang.Exception -> L2fd
            float r5 = r0.e     // Catch: java.lang.Exception -> L2fd
            long r6 = r0.f     // Catch: java.lang.Exception -> L2fd
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r8 = r0.j     // Catch: java.lang.Exception -> L2fd
            r0.t(r1, r2, r3, r5, r6, r8)     // Catch: java.lang.Exception -> L2fd
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r0.k     // Catch: java.lang.Exception -> L2fd
            com.amap.api.maps.model.LatLng r2 = r0.f1164u     // Catch: java.lang.Exception -> L2fd
            r1.add(r2)     // Catch: java.lang.Exception -> L2fd
            r0.f1166w = r11     // Catch: java.lang.Exception -> L2fd
            com.amap.api.maps.model.LatLng r1 = r0.f1164u     // Catch: java.lang.Exception -> L2fd
            r0.f1165v = r1     // Catch: java.lang.Exception -> L2fd
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = r0.j     // Catch: java.lang.Exception -> L2fd
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L2fd
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1     // Catch: java.lang.Exception -> L2fd
            r1.toString()     // Catch: java.lang.Exception -> L2fd
            com.amap.api.maps.model.LatLng r1 = r0.f1165v     // Catch: java.lang.Exception -> L2fd
            r1.toString()     // Catch: java.lang.Exception -> L2fd
            goto L452
        L2fd:
            goto L452
        L300:
            com.bxkj.student.run.app.location.LatLngTimeSpeed r11 = new com.bxkj.student.run.app.location.LatLngTimeSpeed
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            double r12 = r1.latitude
            double r14 = r1.longitude
            long r16 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.b
            int r20 = r22.getLocationType()
            r19 = r1
            r11.<init>(r12, r14, r16, r18, r19, r20)
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            long r2 = r0.f
            r0.u(r1, r2, r11)
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r0.k
            com.amap.api.maps.model.LatLng r2 = r0.f1164u
            r1.add(r2)
            r0.f1166w = r11
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            r0.f1165v = r1
            goto L452
        L32d:
            com.bxkj.student.run.app.location.LatLngTimeSpeed r8 = new com.bxkj.student.run.app.location.LatLngTimeSpeed
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            double r12 = r1.latitude
            double r14 = r1.longitude
            long r16 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.b
            int r20 = r22.getLocationType()
            r19 = r1
            r11 = r8
            r11.<init>(r12, r14, r16, r18, r19, r20)
            int r1 = r22.getTrustedLevel()
            if (r1 == r2) goto L352
            int r1 = r22.getTrustedLevel()
            r2 = 2
            if (r1 != r2) goto L3f5
        L352:
            boolean r1 = r0.b
            if (r1 != 0) goto L3c5
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r2 = 0
            r1.<init>(r2)
            com.bxkj.student.run.app.drift.a$a r1 = com.bxkj.student.run.app.drift.a.a
            com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = r0.f1166w
            boolean r1 = r1.c(r2, r8)
            if (r1 == 0) goto L375
            com.amap.api.maps.model.LatLng r1 = r0.f1165v
            com.amap.api.maps.model.LatLng r2 = r0.f1164u
            float r1 = com.amap.api.maps.AMapUtils.calculateLineDistance(r1, r2)
            double r1 = (double) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            goto L3b3
        L375:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            float r2 = r0.e
            double r2 = (double) r2
            r1.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            long r3 = r0.g
            r2.<init>(r3)
            r3 = 10
            r4 = 4
            java.math.BigDecimal r1 = r1.divide(r2, r3, r4)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            com.bxkj.student.run.app.location.LatLngTimeSpeed r5 = r0.f1166w
            long r5 = r5.getTime()
            long r11 = r8.getTime()
            long r5 = r5 - r11
            r2.<init>(r5)
            java.math.BigDecimal r2 = r2.abs()
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.<init>(r6)
            java.math.BigDecimal r2 = r2.divide(r5, r3, r4)
            java.math.BigDecimal r1 = r1.multiply(r2)
            java.lang.String r2 = "漂移点avg=${avg}appendDistance=${appendDistance}"
            com.orhanobut.logger.j.c(r2)
        L3b3:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            float r3 = r0.e
            double r3 = (double) r3
            r2.<init>(r3)
            java.math.BigDecimal r1 = r2.add(r1)
            float r1 = r1.floatValue()
            r0.e = r1
        L3c5:
            float r1 = r0.e
            double r1 = (double) r1
            long r3 = r0.g
            java.lang.String r5 = com.bxkj.student.run.app.utils.i.a(r1, r3)
            float r1 = r0.e
            double r1 = (double) r1
            long r3 = r0.g
            java.lang.String r6 = com.bxkj.student.run.app.utils.i.b(r1, r3)
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            r1.toString()
            com.amap.api.maps.model.LatLng r1 = r0.f1165v
            r1.toString()
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            com.amap.api.maps.model.LatLng r2 = r0.f1165v
            float r4 = r0.e
            boolean r7 = r0.b
            r3 = r18
            r0.s(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List<com.amap.api.maps.model.LatLng> r1 = r0.k
            com.amap.api.maps.model.LatLng r2 = r0.f1164u
            r1.add(r2)
        L3f5:
            r0.f1166w = r8
            com.amap.api.maps.model.LatLng r1 = r0.f1164u
            r0.f1165v = r1
            goto L452
        L3fc:
            java.lang.String r1 = "定位失败\n"
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "错误码:"
            r1.append(r2)
            int r2 = r22.getErrorCode()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "错误信息:"
            r1.append(r2)
            java.lang.String r2 = r22.getErrorInfo()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "错误描述:"
            r1.append(r2)
            java.lang.String r2 = r22.getLocationDetail()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
        L452:
            java.lang.String r1 = "***定位质量报告***"
            r9.append(r1)
            r9.append(r10)
            java.lang.String r1 = "* WIFI开关："
            r9.append(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r22.getLocationQualityReport()
            boolean r1 = r1.isWifiAble()
            if (r1 == 0) goto L46c
            java.lang.String r1 = "开启"
            goto L46e
        L46c:
            java.lang.String r1 = "关闭"
        L46e:
            r9.append(r1)
            r9.append(r10)
            com.amap.api.location.AMapLocationQualityReport r1 = r22.getLocationQualityReport()
            int r1 = r1.getGPSStatus()
            int r2 = r22.getGpsAccuracyStatus()
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.j(r1, r2)
            int r2 = r22.getGpsAccuracyStatus()
            int r2 = com.bxkj.student.run.app.utils.i.k(r2)
            r0.I(r1, r2)
            java.lang.String r1 = "* GPS状态："
            r9.append(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r22.getLocationQualityReport()
            int r1 = r1.getGPSStatus()
            java.lang.String r1 = com.bxkj.student.run.app.utils.i.m(r1)
            r9.append(r1)
            r9.append(r10)
            java.lang.String r1 = "* GPS星数："
            r9.append(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r22.getLocationQualityReport()
            int r1 = r1.getGPSSatellites()
            r9.append(r1)
            r9.append(r10)
            java.lang.String r1 = "****************"
            r9.append(r1)
            r9.append(r10)
            java.lang.String r1 = r9.toString()
            com.orhanobut.logger.j.c(r1)
            return
        L4c9:
            java.lang.String r1 = "定位失败，loc is null"
            com.orhanobut.logger.j.c(r1)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r2.A = r0
            if (r0 == 0) goto L12
            r0.cancelAll()
        L12:
            r2.x()
            r2.B()
            r2.A()
            r0 = 2131886174(0x7f12005e, float:1.940692E38)
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r2, r0)
            r2.f1161r = r0
            r1 = 1
            r0.setWakeMode(r2, r1)
            android.media.MediaPlayer r0 = r2.f1161r
            r0.setLooping(r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r1 = this;
            r1.v()
            android.media.MediaPlayer r0 = r1.f1161r
            if (r0 == 0) goto L12
            r0.stop()
            android.media.MediaPlayer r0 = r1.f1161r
            r0.release()
            r0 = 0
            r1.f1161r = r0
        L12:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r6.A = r0
            if (r0 == 0) goto Lf
            r0.cancelAll()
        Lf:
            if (r7 == 0) goto L89
            java.lang.String r0 = "runType"
            boolean r1 = r7.hasExtra(r0)
            if (r1 == 0) goto L89
            r1 = 3
            int r0 = r7.getIntExtra(r0, r1)
            r6.f1156m = r0
            java.lang.String r0 = "runExceptionDataDB"
            boolean r1 = r7.hasExtra(r0)
            if (r1 == 0) goto L7e
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            com.bxkj.student.run.app.offline.table.RunDb r0 = (com.bxkj.student.run.app.offline.table.RunDb) r0
            if (r0 == 0) goto L7e
            java.lang.String r1 = r0.getCountTime()
            long r1 = java.lang.Long.parseLong(r1)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L7e
            java.lang.String r1 = r0.getCountTime()
            long r1 = java.lang.Long.parseLong(r1)
            r6.g = r1
            java.lang.String r1 = r0.getDistance()
            float r1 = java.lang.Float.parseFloat(r1)
            r6.e = r1
            java.lang.String r1 = r0.getStartTime()
            long r1 = java.lang.Long.parseLong(r1)
            r6.f = r1
            java.lang.String r0 = r0.getLatLngList()
            java.lang.Class<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1 = com.bxkj.student.run.app.location.LatLngTimeSpeed.class
            java.util.List r0 = com.alibaba.fastjson.JSON.parseArray(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
            if (r1 == 0) goto L6a
            java.util.ArrayList<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2 = r6.j
            r2.add(r1)
            goto L6a
        L7e:
            r6.F()
            com.bxkj.student.run.app.utils.z r0 = new com.bxkj.student.run.app.utils.z
            r0.<init>()
            r6.f1159p = r0
            goto L8c
        L89:
            r6.stopSelf()
        L8c:
            android.media.MediaPlayer r0 = r6.f1161r
            if (r0 == 0) goto L93
            r0.start()
        L93:
            int r7 = super.onStartCommand(r7, r8, r9)
            return r7
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r2) {
            r1 = this;
            android.app.NotificationManager r0 = r1.A
            if (r0 == 0) goto L7
            r0.cancelAll()
        L7:
            super.onTaskRemoved(r2)
            return
    }
}
