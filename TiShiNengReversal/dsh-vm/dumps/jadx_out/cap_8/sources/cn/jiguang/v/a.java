package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1478b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Boolean f1479c;

    /* renamed from: d, reason: collision with root package name */
    private static android.util.Pair<java.lang.String, java.lang.Long> f1480d;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f1481e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f1482f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f1483g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f1484h = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.v.a.f1481e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cn.jiguang.v.a.f1482f = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            cn.jiguang.v.a.f1483g = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            cn.jiguang.v.a.f1484h = r3
            java.lang.String r4 = "android.permission.INTERNET"
            r1.add(r4)
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            r1.add(r4)
            java.lang.String r1 = "com.huawei.android.launcher.permission.CHANGE_BADGE"
            r3.add(r1)
            java.lang.String r1 = "com.vivo.notification.permission.BADGE_ICON"
            r3.add(r1)
            java.lang.String r1 = "com.hihonor.android.launcher.permission.CHANGE_BADGE"
            r3.add(r1)
            java.lang.String r1 = "android.permission.CHANGE_WIFI_STATE"
            r2.add(r1)
            java.lang.String r1 = "android.permission.VIBRATE"
            r2.add(r1)
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            r2.add(r1)
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r2.add(r1)
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            r0.add(r1)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            r0.add(r1)
            java.lang.String r1 = "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS"
            r0.add(r1)
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            r0.add(r1)
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.pm.PackageInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            long r0 = cn.jiguang.v.n.a(r2)
            return r0
        Lb:
            long r0 = b(r2)
            return r0
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.Boolean r0 = cn.jiguang.v.a.f1479c     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L13
            java.lang.String r0 = cn.jiguang.internal.JConstants.APP_KEY     // Catch: java.lang.Throwable -> Lf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L13
            java.lang.String r1 = cn.jiguang.internal.JConstants.APP_KEY     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            cn.jiguang.v.a.f1479c = r0
        L13:
            b(r1)
            java.lang.String r1 = cn.jiguang.v.a.a
            return r1
    }

    public static java.lang.String a(android.os.Bundle r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            cn.jiguang.v.a.f1478b = r4
            cn.jiguang.e.a r0 = cn.jiguang.e.a.Z()
            cn.jiguang.e.a r0 = r0.a(r4)
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r2 = 0
            r1[r2] = r0
            cn.jiguang.e.b.a(r3, r1)
            c(r3)
            cn.jiguang.f.b.a(r4)
            return
    }

    private static long b(android.content.pm.PackageInfo r2) {
            int r2 = r2.versionCode
            long r0 = (long) r2
            return r0
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = cn.jiguang.v.a.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = cn.jiguang.v.a.a
            return r4
        Lb:
            java.lang.String r0 = cn.jiguang.v.a.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L87
            java.lang.String r0 = "CheckManifestHelper"
            if (r4 == 0) goto L82
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L87
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = ""
            if (r4 == 0) goto L42
            android.os.Bundle r4 = r4.metaData     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L42
            java.lang.String r2 = "JPUSH_APPKEY"
            java.lang.String r4 = a(r4, r2)     // Catch: java.lang.Throwable -> L87
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L43
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r4.toLowerCase(r2)     // Catch: java.lang.Throwable -> L87
            goto L43
        L42:
            r4 = r1
        L43:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L5d
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L5d
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.lang.Throwable -> L87
            boolean r2 = r1.contains(r4)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L60
        L5d:
            cn.jiguang.v.a.a = r4     // Catch: java.lang.Throwable -> L87
            goto L87
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r2.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "[key-step]appkey "
            r2.append(r3)     // Catch: java.lang.Throwable -> L87
            r2.append(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = " not in limitAppkeys:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L87
            r2.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L87
            cn.jiguang.w.f.d(r0, r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "[key-step]You use the customized sdk, but your appkey not in valid appkey list. If you want to enable it, please contact us."
            cn.jiguang.w.f.l(r0, r4)     // Catch: java.lang.Throwable -> L87
            goto L87
        L82:
            java.lang.String r4 = "[getAppKey] context is null"
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L87
        L87:
            java.lang.String r4 = cn.jiguang.v.a.a
            return r4
    }

    public static java.lang.String c(android.content.Context r3) {
            java.lang.String r0 = cn.jiguang.v.a.f1478b
            if (r0 != 0) goto L61
            if (r3 == 0) goto L61
            java.lang.String r0 = cn.jiguang.d.a.c(r3)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.v.a.f1478b = r0     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "CheckManifestHelper"
            if (r0 == 0) goto L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "get option channel - "
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = cn.jiguang.v.a.f1478b     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
        L1f:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L61
            cn.jiguang.w.f.d(r1, r3)     // Catch: java.lang.Throwable -> L61
            goto L61
        L27:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L61
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L51
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L51
            java.lang.String r0 = "JPUSH_CHANNEL"
            java.lang.String r3 = a(r3, r0)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.v.a.f1478b = r3     // Catch: java.lang.Throwable -> L61
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L51
            java.lang.String r3 = cn.jiguang.v.a.f1478b     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = cn.jiguang.av.v.b(r3)     // Catch: java.lang.Throwable -> L61
            cn.jiguang.v.a.f1478b = r3     // Catch: java.lang.Throwable -> L61
        L51:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "manifest:channel - "
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = cn.jiguang.v.a.f1478b     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            goto L1f
        L61:
            java.lang.String r3 = cn.jiguang.v.a.f1478b
            return r3
    }

    public static android.util.Pair<java.lang.String, java.lang.Long> d(android.content.Context r7) {
            java.lang.String r0 = "NO versionCode or versionName defined in manifest."
            java.lang.String r1 = "CheckManifestHelper"
            android.util.Pair<java.lang.String, java.lang.Long> r2 = cn.jiguang.v.a.f1480d
            if (r2 != 0) goto L38
            r2 = 0
            android.content.pm.PackageInfo r7 = cn.jiguang.av.o.a(r7, r2)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L31
            java.lang.String r3 = r7.versionName     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L35
            int r5 = r4.length     // Catch: java.lang.Throwable -> L35
            r6 = 30
            if (r5 <= r6) goto L21
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L35
            r3.<init>(r4, r2, r6)     // Catch: java.lang.Throwable -> L35
        L21:
            long r4 = a(r7)     // Catch: java.lang.Throwable -> L35
            android.util.Pair r7 = new android.util.Pair     // Catch: java.lang.Throwable -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.v.a.f1480d = r7     // Catch: java.lang.Throwable -> L35
            goto L38
        L31:
            cn.jiguang.w.f.d(r1, r0)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            cn.jiguang.w.f.d(r1, r0)
        L38:
            android.util.Pair<java.lang.String, java.lang.Long> r7 = cn.jiguang.v.a.f1480d
            return r7
    }

    public static int e(android.content.Context r5) {
            java.lang.String r0 = a(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = -1
            java.lang.String r3 = "CheckManifestHelper"
            if (r1 == 0) goto L1a
            java.lang.String r0 = "errorcode:10001,metadata: JCore appKey - not defined in manifest"
            cn.jiguang.w.f.n(r3, r0)
            java.lang.String r0 = " 未在manifest中配置AppKey"
            cn.jiguang.av.a.a(r5, r0, r2)
            r5 = 10001(0x2711, float:1.4014E-41)
            return r5
        L1a:
            int r1 = r0.length()
            r4 = 24
            if (r1 == r4) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "errorcode:1008,Invalid appKey : "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = ", Please get your Appkey from JIGUANG web console!"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.n(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = " AppKey:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " 是无效的AppKey,请确认与JIGUANG web端的AppKey一致"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.av.a.a(r5, r0, r2)
            r5 = 1008(0x3f0, float:1.413E-42)
            return r5
        L57:
            r5 = 0
            return r5
    }

    public static int f(android.content.Context r5) {
            c(r5)
            cn.jiguang.v.c r0 = cn.jiguang.v.c.a()
            boolean r0 = r0.e()
            java.lang.String r1 = "CheckManifestHelper"
            if (r0 != 0) goto L19
            cn.jiguang.v.c r0 = cn.jiguang.v.c.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L4b
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r5.getPackageName()
            r0.append(r2)
            java.lang.String r2 = cn.jiguang.a.a.a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r2 = cn.jiguang.av.p.b(r5, r0)
            if (r2 != 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "The permission should be defined - "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            cn.jiguang.w.f.m(r1, r5)
            r5 = 1001(0x3e9, float:1.403E-42)
            return r5
        L4b:
            java.util.ArrayList<java.lang.String> r0 = cn.jiguang.v.a.f1482f
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = cn.jiguang.av.p.a(r5, r2)
            if (r3 != 0) goto L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "The permissoin is required - "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            cn.jiguang.w.f.m(r1, r5)
            r5 = 1002(0x3ea, float:1.404E-42)
            return r5
        L7a:
            java.util.ArrayList<java.lang.String> r0 = cn.jiguang.v.a.f1483g
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "We recommend you add the permission - "
            if (r2 == 0) goto La7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = cn.jiguang.av.p.b(r5, r2)
            if (r4 != 0) goto L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            cn.jiguang.w.f.i(r1, r2)
            goto L80
        La7:
            java.util.ArrayList<java.lang.String> r0 = cn.jiguang.v.a.f1484h
            java.util.Iterator r0 = r0.iterator()
        Lad:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = cn.jiguang.av.p.b(r5, r2)
            if (r4 != 0) goto Lad
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ",Otherwise set badge number will failed"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            cn.jiguang.w.f.k(r1, r2)
            goto Lad
        Ld7:
            java.util.ArrayList<java.lang.String> r0 = cn.jiguang.v.a.f1481e
            java.util.Iterator r0 = r0.iterator()
        Ldd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L107
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = cn.jiguang.av.p.b(r5, r2)
            if (r4 != 0) goto Ldd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ", otherwise you can not locate the devices."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            cn.jiguang.w.f.i(r1, r2)
            goto Ldd
        L107:
            r5 = 0
            return r5
    }
}
