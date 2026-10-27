package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g2 {

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.g2 f2338c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f2339d = "acse_LocationRequsesPermissionUtil";
    public android.location.LocationManager a;

    /* renamed from: b, reason: collision with root package name */
    public android.location.LocationListener f2340b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.g2 a;

        public a(com.acse.ottn.g2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.g2 r0 = r2.a
                android.location.LocationManager r1 = r0.a
                if (r1 == 0) goto L12
                android.location.LocationListener r0 = com.acse.ottn.g2.a(r0)
                r1.removeUpdates(r0)
                com.acse.ottn.g2 r0 = r2.a
                r1 = 0
                r0.a = r1
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.location.LocationListener {
        public final /* synthetic */ com.acse.ottn.g2 a;

        public b(com.acse.ottn.g2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.NonNull android.location.Location r5) {
                r4 = this;
                com.acse.ottn.g2 r0 = r4.a
                android.location.LocationManager r1 = r0.a
                if (r1 == 0) goto L12
                android.location.LocationListener r0 = com.acse.ottn.g2.a(r0)
                r1.removeUpdates(r0)
                com.acse.ottn.g2 r0 = r4.a
                r1 = 0
                r0.a = r1
            L12:
                com.acse.ottn.g2 r0 = r4.a
                double r1 = r5.getLongitude()
                java.lang.String r0 = com.acse.ottn.g2.a(r0, r1)
                com.acse.ottn.g2 r1 = r4.a
                double r2 = r5.getLatitude()
                java.lang.String r5 = com.acse.ottn.g2.a(r1, r2)
                com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
                java.lang.String r2 = "longitude"
                r1.b(r2, r5)
                com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
                java.lang.String r2 = "latitude"
                r1.b(r2, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r2 = "|"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "liuqiang-->"
                com.acse.ottn.h2.a(r2, r1)
                com.acse.ottn.p4 r1 = com.acse.ottn.p4.a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = " lat + lon="
                r2.append(r3)
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0 = 6
                java.lang.String r2 = "获取到定位"
                r1.b(r0, r2, r5)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                com.acse.ottn.p4 r4 = com.acse.ottn.p4.a()
                r0 = 6
                java.lang.String r1 = "获取到定位"
                java.lang.String r2 = "定位结束"
                r4.b(r0, r1, r2)
                java.lang.String r4 = "liuqiang-->"
                com.acse.ottn.h2.a(r4, r2)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                com.acse.ottn.p4 r4 = com.acse.ottn.p4.a()
                r0 = 6
                java.lang.String r1 = "获取到定位"
                java.lang.String r2 = "定位完成"
                r4.b(r0, r1, r2)
                java.lang.String r4 = "liuqiang-->"
                com.acse.ottn.h2.a(r4, r2)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r2, int r3, android.os.Bundle r4) {
                r1 = this;
                com.acse.ottn.p4 r2 = com.acse.ottn.p4.a()
                r3 = 6
                java.lang.String r4 = "获取到定位"
                java.lang.String r0 = "位置变化"
                r2.b(r3, r4, r0)
                java.lang.String r2 = "liuqiang-->"
                com.acse.ottn.h2.a(r2, r0)
                return
        }
    }

    static {
            return
    }

    public g2() {
            r1 = this;
            r1.<init>()
            com.acse.ottn.g2$b r0 = new com.acse.ottn.g2$b
            r0.<init>(r1)
            r1.f2340b = r0
            return
    }

    public static /* synthetic */ android.location.LocationListener a(com.acse.ottn.g2 r0) {
            android.location.LocationListener r0 = r0.f2340b
            return r0
    }

    public static com.acse.ottn.g2 a() {
            com.acse.ottn.g2 r0 = com.acse.ottn.g2.f2338c
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.g2> r0 = com.acse.ottn.g2.class
            monitor-enter(r0)
            com.acse.ottn.g2 r1 = com.acse.ottn.g2.f2338c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.g2 r1 = new com.acse.ottn.g2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.g2.f2338c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.g2 r0 = com.acse.ottn.g2.f2338c
            return r0
    }

    public static /* synthetic */ java.lang.String a(com.acse.ottn.g2 r0, double r1) {
            java.lang.String r0 = r0.a(r1)
            return r0
    }

    public static void e(android.app.Activity r4) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "OpenPermissionName"
            java.lang.String r2 = "权限管理"
            r0.b(r1, r2)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "location_permission"
            r0.a(r2, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = 28
            java.lang.String r3 = "com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity"
            if (r0 < r2) goto L31
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r3)     // Catch: java.lang.Exception -> L52
            goto L4b
        L31:
            r2 = 26
            if (r0 < r2) goto L3c
            java.lang.String r0 = "com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity"
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r0)     // Catch: java.lang.Exception -> L52
            goto L4b
        L3c:
            r2 = 23
            if (r0 < r2) goto L45
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r3)     // Catch: java.lang.Exception -> L52
            goto L4b
        L45:
            java.lang.String r0 = "com.huawei.systemmanager/com.huawei.permissionmanager.ui.MainActivity"
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r0)     // Catch: java.lang.Exception -> L52
        L4b:
            r1.setComponent(r0)     // Catch: java.lang.Exception -> L52
            r4.startActivity(r1)     // Catch: java.lang.Exception -> L52
            return
        L52:
            java.lang.String r0 = "com.android.settings/.Settings$AppAndNotificationDashboardActivity"
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r0)     // Catch: java.lang.Exception -> L60
            r1.setComponent(r0)     // Catch: java.lang.Exception -> L60
            r0 = 10010(0x271a, float:1.4027E-41)
            r4.startActivityForResult(r1, r0)     // Catch: java.lang.Exception -> L60
        L60:
            return
    }

    public final java.lang.String a(double r9) {
            r8 = this;
            double r0 = java.lang.Math.abs(r9)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "."
            java.lang.String r4 = ""
            java.lang.String r2 = r2.replace(r3, r4)
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r5 = "0"
            java.lang.String r6 = "1"
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L21
            java.lang.String r0 = "3"
            goto L33
        L21:
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L2a
            java.lang.String r0 = "2"
            goto L33
        L2a:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 <= 0) goto L32
            r0 = r6
            goto L33
        L32:
            r0 = r5
        L33:
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            return r9
        L4c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            return r9
    }

    public void a(android.app.Activity r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L2e
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r1 = cn.easyar.engine.a.a(r5, r0)
            if (r1 != 0) goto Lf
            goto L2e
        Lf:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "battery_white"
            r1.a(r3, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "location_permission_state"
            java.lang.String r3 = "2"
            r1.b(r2, r3)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 10019(0x2723, float:1.404E-41)
            androidx.core.app.ActivityCompat.requestPermissions(r5, r0, r1)
        L2e:
            return
    }

    public boolean a(android.content.Context r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            if (r0 < r1) goto L1a
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = androidx.core.app.q.a(r4, r0)
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r4 = androidx.core.app.q.a(r4, r0)
            if (r4 != 0) goto L18
            return r2
        L18:
            r4 = 0
            return r4
        L1a:
            return r2
    }

    public final boolean a(java.lang.String r8, int r9) {
            r7 = this;
            if (r9 != 0) goto L4
            r9 = 500(0x1f4, float:7.0E-43)
        L4:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "coupon_"
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            long r0 = r0.d(r1)
            java.lang.String r3 = com.acse.ottn.g2.f2339d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "controlCouponShow appPageName ="
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = "-----"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.a(r3, r4)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            long r0 = (long) r9
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 >= 0) goto L53
            java.lang.String r8 = com.acse.ottn.g2.f2339d
            java.lang.String r9 = "controlCouponShow return false "
            com.acse.ottn.h2.a(r8, r9)
            r8 = 0
            return r8
        L53:
            com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            long r0 = java.lang.System.currentTimeMillis()
            r9.a(r8, r0)
            java.lang.String r8 = com.acse.ottn.g2.f2339d
            java.lang.String r9 = "controlCouponShow return true"
            com.acse.ottn.h2.a(r8, r9)
            r8 = 1
            return r8
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.g2 r0 = com.acse.ottn.g2.f2338c
            return r0
    }

    public void b(android.app.Activity r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1c
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "location_permission_state"
            java.lang.String r2 = "2"
            r0.b(r1, r2)
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.core.app.ActivityCompat.requestPermissions(r4, r0, r1)
        L1c:
            return
    }

    public boolean b(android.content.Context r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            if (r0 < r1) goto L12
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r4 = androidx.core.app.q.a(r4, r0)
            if (r4 != 0) goto L10
            return r2
        L10:
            r4 = 0
            return r4
        L12:
            return r2
    }

    public void c() {
            r11 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            goto L6b
        L7:
            java.lang.String r0 = "request_startLocation"
            r1 = 10000(0x2710, float:1.4013E-41)
            boolean r0 = r11.a(r0, r1)
            if (r0 != 0) goto L12
            goto L6b
        L12:
            com.acse.ottn.p4 r0 = com.acse.ottn.p4.a()
            java.lang.String r1 = "开始定位"
            java.lang.String r2 = " 0000"
            r3 = 4
            r0.b(r3, r1, r2)
            java.lang.String r0 = "liuqiang-->"
            java.lang.String r1 = "开始定位="
            com.acse.ottn.h2.a(r0, r1)
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            r11.a = r0
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            android.content.Context r3 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r4)
            if (r3 != 0) goto L51
            r1 = 1
        L51:
            if (r0 == 0) goto L56
            java.lang.String r2 = "1"
            goto L5d
        L56:
            if (r1 == 0) goto L5b
            java.lang.String r2 = "2"
            goto L5d
        L5b:
            java.lang.String r2 = "3"
        L5d:
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.String r4 = "location_state"
            r3.b(r4, r2)
            if (r0 != 0) goto L6c
            if (r1 == 0) goto L6b
            goto L6c
        L6b:
            return
        L6c:
            android.location.LocationManager r5 = r11.a
            android.location.LocationListener r10 = r11.f2340b
            r7 = 0
            r9 = 0
            java.lang.String r6 = "network"
            r5.requestLocationUpdates(r6, r7, r9, r10)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.acse.ottn.g2$a r1 = new com.acse.ottn.g2$a
            r1.<init>(r11)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
            return
    }

    public void c(android.app.Activity r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1e
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "location_permission_state"
            java.lang.String r2 = "1"
            r0.b(r1, r2)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 1018(0x3fa, float:1.427E-42)
            androidx.core.app.ActivityCompat.requestPermissions(r4, r0, r1)
        L1e:
            return
    }

    public void c(android.content.Context r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L22
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = androidx.core.app.q.a(r4, r0)
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            if (r1 != 0) goto L17
            int r1 = androidx.core.app.q.a(r4, r2)
            if (r1 != 0) goto L17
            goto L22
        L17:
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.core.app.ActivityCompat.requestPermissions(r4, r0, r1)
        L22:
            return
    }

    public void d(android.app.Activity r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "com.android.settings"
            java.lang.String r3 = "com.android.settings.HWSettings"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L14
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L14
            r5.startActivity(r0)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public void f(android.app.Activity r5) {
            r4 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            com.acse.ottn.o1 r1 = com.acse.ottn.o1.c()
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            e(r5)
            return
        L12:
            java.lang.String r1 = "vivo"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e
            r4.h(r5)
            return
        L1e:
            java.lang.String r1 = "oppo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L87
            java.lang.String r1 = "realme"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2f
            goto L87
        L2f:
            java.lang.String r1 = "xiaomi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L83
            java.lang.String r1 = "redmi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L83
            java.lang.String r1 = "blackshark"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L48
            goto L83
        L48:
            java.lang.String r1 = "oneplus"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L54
            r4.g(r5)
            return
        L54:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "location_permission_size"
            int r0 = r0.c(r1)
            r2 = 1
            r3 = 2
            if (r0 != r2) goto L71
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r0.a(r1, r3)
            com.acse.ottn.g2 r0 = a()
            r0.c(r5)
            goto L7b
        L71:
            if (r0 != r3) goto L7b
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            r2 = 3
            r0.a(r1, r2)
        L7b:
            com.acse.ottn.g2 r0 = a()
            r0.b(r5)
            return
        L83:
            r4.i(r5)
            return
        L87:
            r4.g(r5)
            return
    }

    public final void g(android.app.Activity r7) {
            r6 = this;
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
            goto L87
        Lc:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "location_permission"
            r1.a(r3, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r3 = "battery_white"
            r1.a(r3, r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r2 = 10010(0x271a, float:1.4027E-41)
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "packageName"
            java.lang.String r4 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L43
            r0.putExtra(r3, r4)     // Catch: java.lang.Exception -> L43
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = "com.color.safecenter"
            java.lang.String r5 = "com.color.safecenter.permission.PermissionManagerActivity"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L43
            r0.setComponent(r3)     // Catch: java.lang.Exception -> L43
            r7.startActivityForResult(r0, r2)     // Catch: java.lang.Exception -> L43
            return
        L43:
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = "pkg_name"
            java.lang.String r3 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L71
            r0.putExtra(r1, r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = "app_name"
            com.acse.ottn.o1 r3 = com.acse.ottn.o1.c()     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L71
            r0.putExtra(r1, r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = "class_name"
            java.lang.String r3 = "com.welab.notificationdemo.MainActivity"
            r0.putExtra(r1, r3)     // Catch: java.lang.Exception -> L71
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "com.coloros.notificationmanager"
            java.lang.String r4 = "com.coloros.notificationmanager.AppDetailPreferenceActivity"
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L71
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L71
            r7.startActivityForResult(r0, r2)     // Catch: java.lang.Exception -> L71
            goto L87
        L71:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r3 = "package"
            r4 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r4)
            r0.setData(r1)
            r7.startActivityForResult(r0, r2)
        L87:
            return
    }

    public final void h(android.app.Activity r6) {
            r5 = this;
            java.lang.String r0 = "location_permission"
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "battery_white"
            r1.a(r3, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r3 = "location_permission_state"
            java.lang.String r4 = "2"
            r1.b(r3, r4)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3f
            r1.a(r0, r2)     // Catch: java.lang.Exception -> L3f
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "com.vivo.permissionmanager"
            java.lang.String r3 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            r1.setClassName(r2, r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "packagename"
            java.lang.String r3 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L3f
            r1.putExtra(r2, r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "tabId"
            java.lang.String r3 = "1"
            r1.putExtra(r2, r3)     // Catch: java.lang.Exception -> L3f
            r2 = 10010(0x271a, float:1.4027E-41)
            r6.startActivityForResult(r1, r2)     // Catch: java.lang.Exception -> L3f
            return
        L3f:
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.a(r0, r1)
            return
    }

    public final void i(android.app.Activity r7) {
            r6 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "location_permission"
            r0.a(r2, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "location_permission_state"
            java.lang.String r3 = "2"
            r0.b(r1, r3)
            r0 = 10010(0x271a, float:1.4027E-41)
            java.lang.String r1 = com.acse.ottn.n4.b()     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "xiaomi"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Exception -> L6d
            if (r3 != 0) goto L3f
            java.lang.String r3 = "redmi"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Exception -> L6d
            if (r3 != 0) goto L3f
            java.lang.String r3 = "blackshark"
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            return
        L3f:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "OpenPermissionName"
            java.lang.String r4 = "定位"
            r1.b(r3, r4)     // Catch: java.lang.Exception -> L6d
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L6d
            r1.<init>()     // Catch: java.lang.Exception -> L6d
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Exception -> L6d
            java.lang.String r4 = "com.miui.securitycenter"
            java.lang.String r5 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L6d
            java.lang.String r4 = "extra_pkgname"
            java.lang.String r5 = r7.getPackageName()     // Catch: java.lang.Exception -> L6d
            r1.putExtra(r4, r5)     // Catch: java.lang.Exception -> L6d
            r1.setComponent(r3)     // Catch: java.lang.Exception -> L6d
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r3)     // Catch: java.lang.Exception -> L6d
            r7.startActivityForResult(r1, r0)     // Catch: java.lang.Exception -> L6d
            return
        L6d:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r1.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "package:"
            r3.append(r4)
            java.lang.String r4 = r7.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.setData(r3)
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.a(r2, r4)
            r7.startActivityForResult(r1, r0)
            return
    }
}
