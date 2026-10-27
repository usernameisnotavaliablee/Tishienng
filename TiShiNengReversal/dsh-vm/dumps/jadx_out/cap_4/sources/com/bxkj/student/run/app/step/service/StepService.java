package com.bxkj.student.run.app.step.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StepService extends android.app.Service implements android.hardware.SensorEventListener {
    private android.content.BroadcastReceiver A;
    private final java.lang.String a;
    private java.util.List<java.lang.Integer> b;
    private android.hardware.SensorManager c;
    private int d;
    private java.lang.Integer e;
    private com.bxkj.student.run.app.step.accelerometer.a f;
    private com.bxkj.student.run.app.step.service.StepService.e g;
    private boolean h;
    private com.bxkj.student.run.app.step.a i;
    private com.bxkj.student.run.app.offline.table.RunDb j;
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    private android.content.BroadcastReceiver f1217l;

    /* renamed from: m, reason: collision with root package name */
    private long f1218m;

    /* renamed from: n, reason: collision with root package name */
    private com.bxkj.student.run.app.step.d f1219n;

    /* renamed from: o, reason: collision with root package name */
    private long f1220o;

    /* renamed from: p, reason: collision with root package name */
    private long f1221p;

    /* renamed from: q, reason: collision with root package name */
    private final int f1222q;

    /* renamed from: r, reason: collision with root package name */
    private long f1223r;

    /* renamed from: s, reason: collision with root package name */
    private java.util.Timer f1224s;

    /* renamed from: t, reason: collision with root package name */
    private android.os.Handler f1225t;

    /* renamed from: u, reason: collision with root package name */
    private android.app.NotificationManager f1226u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.core.app.NotificationCompat.Builder f1227v;

    /* renamed from: w, reason: collision with root package name */
    private int f1228w;

    /* renamed from: x, reason: collision with root package name */
    private long f1229x;

    /* renamed from: y, reason: collision with root package name */
    private android.app.Notification f1230y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1231z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.step.service.StepService a;

        a(com.bxkj.student.run.app.step.service.StepService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "SET_RUNNING_PAUSE"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L3e
                java.lang.String r3 = "isPause"
                boolean r0 = r4.hasExtra(r3)
                if (r0 == 0) goto L4f
                com.bxkj.student.run.app.step.service.StepService r0 = r2.a
                boolean r1 = com.bxkj.student.run.app.step.service.StepService.f(r0)
                boolean r3 = r4.getBooleanExtra(r3, r1)
                com.bxkj.student.run.app.step.service.StepService.i(r0, r3)
                com.bxkj.student.run.app.step.service.StepService r3 = r2.a
                com.bxkj.student.run.app.step.service.StepService.f(r3)
                com.bxkj.student.run.app.step.service.StepService r3 = r2.a
                com.bxkj.student.run.app.step.accelerometer.a r3 = com.bxkj.student.run.app.step.service.StepService.g(r3)
                if (r3 == 0) goto L4f
                com.bxkj.student.run.app.step.service.StepService r3 = r2.a
                com.bxkj.student.run.app.step.accelerometer.a r3 = com.bxkj.student.run.app.step.service.StepService.g(r3)
                com.bxkj.student.run.app.step.service.StepService r4 = r2.a
                boolean r4 = com.bxkj.student.run.app.step.service.StepService.f(r4)
                r3.e(r4)
                return
            L3e:
                java.lang.String r3 = r4.getAction()
                java.lang.String r4 = "STOP_LOCATION"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L4f
                com.bxkj.student.run.app.step.service.StepService r3 = r2.a
                r3.l()
            L4f:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends java.util.TimerTask {
        final /* synthetic */ com.bxkj.student.run.app.step.service.StepService a;

        b(com.bxkj.student.run.app.step.service.StepService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r2 = this;
                com.bxkj.student.run.app.step.service.StepService r0 = r2.a
                android.os.Handler r0 = com.bxkj.student.run.app.step.service.StepService.e(r0)
                r1 = 170(0xaa, float:2.38E-43)
                r0.sendEmptyMessage(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.run.app.step.service.StepService a;

        c(com.bxkj.student.run.app.step.service.StepService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                int r5 = r5.what
                r0 = 170(0xaa, float:2.38E-43)
                if (r5 == r0) goto L7
                goto Lf
            L7:
                com.bxkj.student.run.app.step.service.StepService r5 = r4.a
                boolean r5 = com.bxkj.student.run.app.step.service.StepService.f(r5)
                if (r5 == 0) goto L10
            Lf:
                return
            L10:
                com.bxkj.student.run.app.step.service.StepService r5 = r4.a
                long r0 = com.bxkj.student.run.app.step.service.StepService.c(r5)
                r2 = 1
                long r0 = r0 + r2
                com.bxkj.student.run.app.step.service.StepService.h(r5, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.student.run.app.step.service.StepService a;

        d(com.bxkj.student.run.app.step.service.StepService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r3 = r3.getAction()
                java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L33
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.bxkj.student.run.app.lockscreen.LockScreenActivity> r0 = com.bxkj.student.run.app.lockscreen.LockScreenActivity.class
                r3.<init>(r2, r0)
                com.bxkj.student.run.app.step.service.StepService r2 = r1.a
                java.lang.String r2 = com.bxkj.student.run.app.step.service.StepService.d(r2)
                java.lang.String r0 = "time"
                r3.putExtra(r0, r2)
                com.bxkj.student.run.app.step.service.StepService r2 = r1.a
                int r2 = r2.o()
                java.lang.String r0 = "stepCount"
                r3.putExtra(r0, r2)
                r2 = 276824064(0x10800000, float:5.04871E-29)
                r3.addFlags(r2)
                com.bxkj.student.run.app.step.service.StepService r2 = r1.a
                r2.startActivity(r3)
            L33:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e extends android.os.Binder {
        final /* synthetic */ com.bxkj.student.run.app.step.service.StepService a;

        public e(com.bxkj.student.run.app.step.service.StepService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public com.bxkj.student.run.app.step.service.StepService a() {
                r1 = this;
                com.bxkj.student.run.app.step.service.StepService r0 = r1.a
                return r0
        }
    }

    public StepService() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "StepService"
            r4.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.b = r0
            r0 = 0
            r4.d = r0
            com.bxkj.student.run.app.step.service.StepService$e r1 = new com.bxkj.student.run.app.step.service.StepService$e
            r1.<init>(r4)
            r4.g = r1
            r4.h = r0
            r1 = 0
            r4.f1218m = r1
            r3 = 170(0xaa, float:2.38E-43)
            r4.f1222q = r3
            r4.f1223r = r1
            com.bxkj.student.run.app.step.service.StepService$c r1 = new com.bxkj.student.run.app.step.service.StepService$c
            r1.<init>(r4)
            r4.f1225t = r1
            r1 = 100
            r4.f1228w = r1
            r4.f1231z = r0
            com.bxkj.student.run.app.step.service.StepService$d r0 = new com.bxkj.student.run.app.step.service.StepService$d
            r0.<init>(r4)
            r4.A = r0
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.run.app.step.service.StepService r0, int r1) {
            r0.q(r1)
            return
    }

    public static /* synthetic */ void b(com.bxkj.student.run.app.step.service.StepService r0) {
            r0.r()
            return
    }

    static /* bridge */ /* synthetic */ long c(com.bxkj.student.run.app.step.service.StepService r2) {
            long r0 = r2.f1218m
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String d(com.bxkj.student.run.app.step.service.StepService r0) {
            java.lang.String r0 = r0.k
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler e(com.bxkj.student.run.app.step.service.StepService r0) {
            android.os.Handler r0 = r0.f1225t
            return r0
    }

    static /* bridge */ /* synthetic */ boolean f(com.bxkj.student.run.app.step.service.StepService r0) {
            boolean r0 = r0.h
            return r0
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.run.app.step.accelerometer.a g(com.bxkj.student.run.app.step.service.StepService r0) {
            com.bxkj.student.run.app.step.accelerometer.a r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ void h(com.bxkj.student.run.app.step.service.StepService r0, long r1) {
            r0.f1218m = r1
            return
    }

    static /* bridge */ /* synthetic */ void i(com.bxkj.student.run.app.step.service.StepService r0, boolean r1) {
            r0.h = r1
            return
    }

    private void j() {
            r4 = this;
            com.bxkj.student.run.app.step.accelerometer.a r0 = new com.bxkj.student.run.app.step.accelerometer.a
            r0.<init>()
            r4.f = r0
            boolean r1 = r4.h
            r0.e(r1)
            com.bxkj.student.run.app.step.accelerometer.a r0 = r4.f
            int r1 = r4.d
            r0.f(r1)
            android.hardware.SensorManager r0 = r4.c
            r1 = 1
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            android.hardware.SensorManager r1 = r4.c
            com.bxkj.student.run.app.step.accelerometer.a r2 = r4.f
            com.bxkj.student.run.app.step.accelerometer.c r2 = r2.b()
            r3 = 2
            r1.registerListener(r2, r0, r3)
            com.bxkj.student.run.app.step.accelerometer.a r0 = r4.f
            com.bxkj.student.run.app.step.service.d r1 = new com.bxkj.student.run.app.step.service.d
            r1.<init>(r4)
            r0.c(r1)
            return
    }

    private void k() {
            r3 = this;
            android.hardware.SensorManager r0 = r3.c
            r1 = 19
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            android.hardware.SensorManager r1 = r3.c
            r2 = 18
            android.hardware.Sensor r1 = r1.getDefaultSensor(r2)
            r2 = 0
            if (r0 == 0) goto L19
            android.hardware.SensorManager r1 = r3.c
            r1.registerListener(r3, r0, r2)
            return
        L19:
            if (r1 == 0) goto L21
            android.hardware.SensorManager r0 = r3.c
            r0.registerListener(r3, r1, r2)
            return
        L21:
            r3.j()
            return
    }

    private void p() {
            r6 = this;
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            java.lang.String r1 = "default"
            r0.<init>(r6, r1)
            r6.f1227v = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bxkj.student.run.app.RunningActivity> r2 = com.bxkj.student.run.app.RunningActivity.class
            r0.<init>(r6, r2)
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r3 = 1
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r3, r0, r2)
            long r4 = java.lang.System.currentTimeMillis()
            r6.f1229x = r4
            androidx.core.app.NotificationCompat$Builder r2 = r6.f1227v
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r4 = r4.getString(r5)
            androidx.core.app.NotificationCompat$Builder r2 = r2.setContentTitle(r4)
            java.lang.String r4 = "正在记录本次跑步"
            androidx.core.app.NotificationCompat$Builder r2 = r2.setContentText(r4)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            long r4 = r6.f1229x
            androidx.core.app.NotificationCompat$Builder r0 = r0.setWhen(r4)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setPriority(r3)
            r2 = 0
            androidx.core.app.NotificationCompat$Builder r0 = r0.setAutoCancel(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOngoing(r3)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOnlyAlertOnce(r3)
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            r0.setSmallIcon(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r6.f1227v
            android.app.Notification r0 = r0.build()
            r6.f1230y = r0
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r6.f1226u = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L79
            java.lang.String r0 = "体适能"
            r2 = 2
            android.app.NotificationChannel r0 = cn.jiguang.av.b0.a(r1, r0, r2)
            android.app.NotificationManager r1 = r6.f1226u
            cn.jiguang.av.z.a(r1, r0)
        L79:
            int r0 = r6.f1228w
            android.app.Notification r1 = r6.f1230y
            r6.startForeground(r0, r1)
            java.lang.String r0 = "initNotification()"
            com.orhanobut.logger.j.c(r0)
            return
    }

    private /* synthetic */ void q(int r3) {
            r2 = this;
            r2.d = r3
            com.bxkj.student.run.app.step.a r3 = r2.i
            if (r3 == 0) goto Ld
            int r0 = r2.o()
            r3.a(r0)
        Ld:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r0 = "UPDATE_STEP"
            r3.setAction(r0)
            java.lang.String r0 = "stepCount"
            int r1 = r2.o()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r2.sendBroadcast(r3, r0)
            return
    }

    private /* synthetic */ void r() {
            r0 = this;
            r0.x()
            return
    }

    private void s() {
            r4 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "NOTIFY_RUN_DATA"
            r0.addAction(r1)
            java.lang.String r1 = "SET_RUNNING_PAUSE"
            r0.addAction(r1)
            java.lang.String r1 = "STOP_LOCATION"
            r0.addAction(r1)
            com.bxkj.student.run.app.step.service.StepService$a r1 = new com.bxkj.student.run.app.step.service.StepService$a
            r1.<init>(r4)
            r4.f1217l = r1
            java.lang.String r2 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
            return
    }

    private void t() {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r2.A
            r2.registerReceiver(r1, r0)
            r0 = 1
            r2.f1231z = r0
            return
    }

    private void w() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L65
            r0 = 4
            java.lang.String r1 = "default"
            android.app.NotificationChannel r0 = cn.jiguang.av.b0.a(r1, r1, r0)
            cn.jpush.android.x.v.a(r0, r1)
            r1 = 2
            com.bxkj.student.run.app.step.service.a.a(r0, r1)
            java.lang.String r1 = ""
            com.bxkj.student.run.app.step.service.b.a(r0, r1)
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            com.bxkj.student.run.app.step.service.c.a(r0, r2)
            cn.jpush.android.x.r.a(r0, r1)
            r2 = 0
            cn.jpush.android.x.q.a(r0, r2, r2)
            r2 = 0
            cn.jpush.android.x.k.a(r0, r2)
            androidx.core.app.NotificationCompat$Builder r2 = new androidx.core.app.NotificationCompat$Builder
            java.lang.String r0 = cn.jpush.android.x.i.a(r0)
            r2.<init>(r4, r0)
            r0 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r0 = r4.getString(r0)
            r2.setContentTitle(r0)
            r2.setContentText(r1)
            r0 = -1
            r2.setDefaults(r0)
            r0 = 1
            r2.setAutoCancel(r0)
            r2.setShowWhen(r0)
            r0 = 2131689689(0x7f0f00d9, float:1.90084E38)
            r2.setSmallIcon(r0)
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r4)
            android.app.Notification r1 = r2.build()
            r3 = 100
            r0.notify(r3, r1)
            android.app.Notification r0 = r2.build()     // Catch: java.lang.Exception -> L65
            r4.startForeground(r3, r0)     // Catch: java.lang.Exception -> L65
        L65:
            return
    }

    private void x() {
            r1 = this;
            android.hardware.SensorManager r0 = r1.c
            if (r0 == 0) goto L7
            r0 = 0
            r1.c = r0
        L7:
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r1.c = r0
            r1.k()
            return
    }

    public void l() {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r3.f1221p = r0     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            android.os.Handler r0 = r3.f1225t     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r1 = 0
            if (r0 == 0) goto L11
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            goto L11
        Lf:
            r0 = move-exception
            goto L41
        L11:
            java.util.Timer r0 = r3.f1224s     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            if (r0 == 0) goto L18
            r0.cancel()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
        L18:
            r0 = 1
            r3.stopForeground(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r0 = 2131886176(0x7f120060, float:1.9406923E38)
            com.bxkj.student.run.app.utils.y.f(r3, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            android.content.BroadcastReceiver r0 = r3.f1217l     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            if (r0 == 0) goto L2b
            r3.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r3.f1217l = r1     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
        L2b:
            android.content.BroadcastReceiver r0 = r3.A     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            if (r0 == 0) goto L38
            boolean r2 = r3.f1231z     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            if (r2 == 0) goto L38
            r3.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r3.A = r1     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
        L38:
            android.hardware.SensorManager r0 = r3.c     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r0.unregisterListener(r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L45
            r3.stopSelf()
            return
        L41:
            r3.stopSelf()
            throw r0
        L45:
            r3.stopSelf()
            return
    }

    public long m() {
            r2 = this;
            long r0 = r2.f1221p
            return r0
    }

    public long n() {
            r2 = this;
            long r0 = r2.f1220o
            return r0
    }

    public int o() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            com.bxkj.student.run.app.step.service.StepService$e r1 = r0.g
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            r0.s()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r3 = this;
            super.onDestroy()
            android.os.Handler r0 = r3.f1225t
            r1 = 0
            if (r0 == 0) goto Lb
            r0.removeCallbacksAndMessages(r1)
        Lb:
            java.util.Timer r0 = r3.f1224s
            if (r0 == 0) goto L12
            r0.cancel()
        L12:
            android.hardware.SensorManager r0 = r3.c
            if (r0 == 0) goto L19
            r0.unregisterListener(r3)
        L19:
            android.hardware.SensorManager r0 = r3.c
            if (r0 == 0) goto L28
            com.bxkj.student.run.app.step.accelerometer.a r2 = r3.f
            if (r2 == 0) goto L28
            com.bxkj.student.run.app.step.accelerometer.c r2 = r2.b()
            r0.unregisterListener(r2)
        L28:
            r0 = 1
            r3.stopForeground(r0)
            android.content.BroadcastReceiver r0 = r3.f1217l
            if (r0 == 0) goto L35
            r3.unregisterReceiver(r0)
            r3.f1217l = r1
        L35:
            android.content.BroadcastReceiver r0 = r3.A
            if (r0 == 0) goto L42
            boolean r2 = r3.f1231z
            if (r2 == 0) goto L42
            r3.unregisterReceiver(r0)
            r3.A = r1
        L42:
            java.lang.String r0 = "stepService关闭"
            com.orhanobut.logger.j.c(r0)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r8) {
            r7 = this;
            android.hardware.Sensor r0 = r8.sensor
            int r0 = r0.getType()
            r1 = 19
            java.lang.String r2 = "com.bxkj.student.sports.permissions.MY_BROADCAST"
            java.lang.String r3 = "stepCount"
            java.lang.String r4 = "UPDATE_STEP"
            r5 = 0
            if (r0 != r1) goto L57
            float[] r8 = r8.values
            r8 = r8[r5]
            int r8 = (int) r8
            java.lang.Integer r0 = r7.e
            if (r0 == 0) goto L33
            int r0 = r0.intValue()
            int r0 = r8 - r0
            if (r0 >= 0) goto L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.e = r0
            goto L2a
        L29:
            r5 = r0
        L2a:
            boolean r0 = r7.h
            if (r0 != 0) goto L33
            int r0 = r7.d
            int r0 = r0 + r5
            r7.d = r0
        L33:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.e = r8
            com.bxkj.student.run.app.step.a r8 = r7.i
            if (r8 == 0) goto L44
            int r0 = r7.o()
            r8.a(r0)
        L44:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r8.setAction(r4)
            int r0 = r7.o()
            r8.putExtra(r3, r0)
            r7.sendBroadcast(r8, r2)
            return
        L57:
            android.hardware.Sensor r0 = r8.sensor
            int r0 = r0.getType()
            r1 = 18
            if (r0 != r1) goto L93
            float[] r8 = r8.values
            r8 = r8[r5]
            double r0 = (double) r8
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 != 0) goto L76
            boolean r8 = r7.h
            if (r8 != 0) goto L76
            int r8 = r7.d
            int r8 = r8 + 1
            r7.d = r8
        L76:
            com.bxkj.student.run.app.step.a r8 = r7.i
            if (r8 == 0) goto L81
            int r0 = r7.o()
            r8.a(r0)
        L81:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r8.setAction(r4)
            int r0 = r7.o()
            r8.putExtra(r3, r0)
            r7.sendBroadcast(r8, r2)
        L93:
            return
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent r1, int r2) {
            r0 = this;
            super.onStart(r1, r2)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = "onStartCommand"
            com.orhanobut.logger.j.c(r0)
            if (r6 == 0) goto L92
            java.lang.String r0 = "runType"
            boolean r0 = r6.hasExtra(r0)
            if (r0 == 0) goto L92
            java.lang.String r0 = "isPause"
            boolean r1 = r6.hasExtra(r0)
            if (r1 == 0) goto L28
            boolean r1 = r5.h
            boolean r0 = r6.getBooleanExtra(r0, r1)
            r5.h = r0
            com.bxkj.student.run.app.step.accelerometer.a r0 = r5.f
            if (r0 == 0) goto L28
            boolean r1 = r5.h
            r0.e(r1)
        L28:
            java.lang.String r0 = "runExceptionDataDB"
            boolean r1 = r6.hasExtra(r0)
            if (r1 == 0) goto L81
            android.os.Parcelable r0 = r6.getParcelableExtra(r0)
            com.bxkj.student.run.app.offline.table.RunDb r0 = (com.bxkj.student.run.app.offline.table.RunDb) r0
            r5.j = r0
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.getCountTime()
            long r0 = java.lang.Long.parseLong(r0)
            r5.f1218m = r0
            com.bxkj.student.run.app.offline.table.RunDb r0 = r5.j
            java.lang.String r0 = r0.getStartTime()
            long r0 = java.lang.Long.parseLong(r0)
            r5.f1220o = r0
            long r0 = r5.f1218m
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L66
            com.bxkj.student.run.app.offline.table.RunDb r0 = r5.j
            java.lang.String r0 = r0.getStepList()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.util.List r0 = com.alibaba.fastjson.JSON.parseArray(r0, r1)
            r5.b = r0
        L66:
            java.util.List<java.lang.Integer> r0 = r5.b
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L6d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 + r2
            goto L6d
        L7f:
            r5.d = r1
        L81:
            java.lang.Thread r0 = new java.lang.Thread
            com.bxkj.student.run.app.step.service.e r1 = new com.bxkj.student.run.app.step.service.e
            r1.<init>(r5)
            r0.<init>(r1)
            r0.start()
            r5.w()
            goto L95
        L92:
            r5.stopSelf()
        L95:
            int r6 = super.onStartCommand(r6, r7, r8)
            return r6
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r1) {
            r0 = this;
            boolean r1 = super.onUnbind(r1)
            return r1
    }

    public void u(com.bxkj.student.run.app.step.a r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void v(com.bxkj.student.run.app.step.d r1) {
            r0 = this;
            r0.f1219n = r1
            return
    }

    public void y(long r7) {
            r6 = this;
            r0 = 2131886172(0x7f12005c, float:1.9406915E38)
            com.bxkj.student.run.app.utils.y.f(r6, r0)
            r6.t()
            r6.p()
            long r0 = r6.f1220o
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2f
            r6.f1220o = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "跑步开始时间="
            r0.append(r1)
            r1 = 0
            java.lang.String r7 = com.bxkj.student.run.app.utils.i.h(r7, r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.orhanobut.logger.j.c(r7)
        L2f:
            long r7 = java.lang.System.currentTimeMillis()
            r6.f1223r = r7
            com.bxkj.student.run.app.step.service.StepService$b r1 = new com.bxkj.student.run.app.step.service.StepService$b
            r1.<init>(r6)
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r6.f1224s = r0
            r2 = 0
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.schedule(r1, r2, r4)
            return
    }
}
