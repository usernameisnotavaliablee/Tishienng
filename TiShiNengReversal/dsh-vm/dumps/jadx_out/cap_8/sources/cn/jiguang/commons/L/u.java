package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class u {
    public u() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean a(java.lang.String r4) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            r3 = 23
            if (r1 < r3) goto L44
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1f
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L1f
            if (r1 < r3) goto L21
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1f
            int r4 = androidx.core.app.q.a(r1, r4)     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L43
            goto L42
        L1f:
            r4 = move-exception
            goto L45
        L21:
            java.lang.String r4 = cn.jiguang.av.f0.a(r4)     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L28
            goto L42
        L28:
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "appops"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L1f
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1     // Catch: java.lang.Throwable -> L1f
            android.content.Context r3 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L1f
            int r4 = cn.jiguang.av.g0.a(r1, r4, r3)     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L43
        L42:
            return r2
        L43:
            return r0
        L44:
            return r2
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkPermission error: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "PermissionUtils"
            cn.jiguang.commons.w.a.f(r1, r4)
            return r0
    }

    public static boolean c() {
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean c(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.pm.PackageInfo r0 = cn.jiguang.commons.L.t.a()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L3c
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L12:
            if (r3 >= r2) goto L3c
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L21
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1e
            r5 = 1
            return r5
        L1e:
            int r3 = r3 + 1
            goto L12
        L21:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "hasPermissionDefined error: "
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "PermissionUtils"
            cn.jiguang.commons.w.a.f(r0, r5)
        L3c:
            return r1
    }

    public static boolean d() {
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = c(r0)
            return r0
    }

    public static boolean e() {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lc
            r2 = 31
            if (r1 < r2) goto Le
            boolean r0 = i()     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r1 = move-exception
            goto L25
        Le:
            r2 = 23
            if (r1 < r2) goto L20
            boolean r1 = g()     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L1f
            boolean r1 = k()     // Catch: java.lang.Exception -> Lc
            if (r1 == 0) goto L1f
            r0 = 1
        L1f:
            return r0
        L20:
            boolean r0 = g()     // Catch: java.lang.Exception -> Lc
            return r0
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check bluetooth permissions failed: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "PermissionUtils"
            cn.jiguang.commons.w.a.f(r2, r1)
            return r0
    }

    public static boolean f() {
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean g() {
            boolean r0 = h()
            if (r0 == 0) goto Le
            boolean r0 = f()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean h() {
            java.lang.String r0 = "android.permission.BLUETOOTH"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean i() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Ld
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = a(r0)
            return r0
        Ld:
            boolean r0 = k()
            return r0
    }

    public static boolean j() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L14
            boolean r0 = m()
            if (r0 != 0) goto L12
            boolean r0 = o()
            if (r0 == 0) goto L14
        L12:
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean k() {
            boolean r0 = c()
            if (r0 != 0) goto Lf
            boolean r0 = a()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static boolean l() {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 30
            if (r1 < r2) goto L1c
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1d
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L1d
            if (r1 < r2) goto L1c
            java.lang.String r1 = "android.permission.QUERY_ALL_PACKAGES"
            boolean r1 = c(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1c
            return r0
        L1c:
            r0 = 1
        L1d:
            return r0
    }

    public static boolean m() {
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean n() {
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = a(r0)
            return r0
    }

    public static boolean o() {
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = a(r0)
            return r0
    }
}
