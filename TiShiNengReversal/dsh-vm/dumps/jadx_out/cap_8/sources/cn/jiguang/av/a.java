package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static cn.jiguang.av.a f673b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Boolean f674c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile java.lang.Boolean f675d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f676e = null;

    /* renamed from: f, reason: collision with root package name */
    private static volatile java.security.cert.CertificateFactory f677f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f678g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f679h = "";

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.String f680i = "";

    /* renamed from: j, reason: collision with root package name */
    private final int f681j;

    /* renamed from: k, reason: collision with root package name */
    private final int f682k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;
    private java.lang.Boolean q;
    private java.lang.Boolean r;
    private java.lang.String s;
    private java.lang.String t;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.av.a.f676e = r0
            return
    }

    private a() {
            r2 = this;
            r2.<init>()
            r0 = 600000(0x927c0, float:8.40779E-40)
            r2.f681j = r0
            r0 = 3
            r2.f682k = r0
            java.lang.String r0 = ""
            r2.l = r0
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            r1 = 0
            r2.q = r1
            r2.r = r1
            r2.s = r0
            r2.t = r0
            return
    }

    private static android.content.Intent a(android.content.pm.PackageManager r4, java.lang.String r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.INFO"
            r0.addCategory(r1)
            r0.setPackage(r5)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r4.resolveActivity(r0, r2)
            if (r3 != 0) goto L25
            r0.removeCategory(r1)
            java.lang.String r1 = "android.intent.category.LAUNCHER"
            r0.addCategory(r1)
            r0.setPackage(r5)
            android.content.pm.ResolveInfo r3 = r4.resolveActivity(r0, r2)
        L25:
            if (r3 != 0) goto L29
            r4 = 0
            return r4
        L29:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r5)
            android.content.pm.ActivityInfo r5 = r3.activityInfo
            java.lang.String r0 = r5.packageName
            java.lang.String r5 = r5.name
            r4.setClassName(r0, r5)
            return r4
    }

    public static android.content.pm.ComponentInfo a(android.content.Context r8, java.lang.String r9, java.lang.Class<?> r10) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            if (r8 == 0) goto L8f
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L8f
            if (r10 != 0) goto Lf
            goto L8f
        Lf:
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            r3 = 8
            r4 = 2
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L1f
            r2 = 4
            goto L3f
        L1f:
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L29
            r2 = 2
            goto L3f
        L29:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L33
            r2 = 1
            goto L3f
        L33:
            java.lang.Class<android.content.ContentProvider> r2 = android.content.ContentProvider.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L3e
            r2 = 8
            goto L3f
        L3e:
            r2 = 0
        L3f:
            android.content.pm.PackageInfo r8 = cn.jiguang.av.o.a(r8, r9, r2)     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L46
            return r1
        L46:
            if (r2 == r6) goto L5b
            if (r2 == r4) goto L58
            if (r2 == r5) goto L55
            if (r2 == r3) goto L50
            r8 = r1
            goto L5d
        L50:
            android.content.pm.ProviderInfo[] r8 = r8.providers     // Catch: java.lang.Throwable -> L53
            goto L5d
        L53:
            r8 = move-exception
            goto L7a
        L55:
            android.content.pm.ServiceInfo[] r8 = r8.services     // Catch: java.lang.Throwable -> L53
            goto L5d
        L58:
            android.content.pm.ActivityInfo[] r8 = r8.receivers     // Catch: java.lang.Throwable -> L53
            goto L5d
        L5b:
            android.content.pm.ActivityInfo[] r8 = r8.activities     // Catch: java.lang.Throwable -> L53
        L5d:
            if (r8 != 0) goto L60
            return r1
        L60:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L53
            r2 = 0
        L62:
            if (r2 >= r9) goto L8e
            r3 = r8[r2]     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r3.name     // Catch: java.lang.Throwable -> L77
            java.lang.ClassLoader r5 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L77
            java.lang.Class r4 = java.lang.Class.forName(r4, r7, r5)     // Catch: java.lang.Throwable -> L77
            boolean r4 = r10.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L77
            return r3
        L77:
            int r2 = r2 + 1
            goto L62
        L7a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "hasComponent error:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.j(r0, r8)
        L8e:
            return r1
        L8f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Action - hasComponent, invalide param, context:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ",packageName:"
            r2.append(r8)
            r2.append(r9)
            java.lang.String r8 = ",cls:"
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = r2.toString()
            cn.jiguang.w.f.i(r0, r8)
            return r1
    }

    public static android.content.pm.ProviderInfo a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            if (r4 == 0) goto L32
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L32
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L10
            goto L32
        L10:
            r1 = 8
            android.content.pm.PackageInfo r4 = cn.jiguang.av.o.a(r4, r5, r1)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L32
            android.content.pm.ProviderInfo[] r4 = r4.providers     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L32
            int r5 = r4.length     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L20
            goto L32
        L20:
            int r5 = r4.length     // Catch: java.lang.Throwable -> L32
            r1 = 0
        L22:
            if (r1 >= r5) goto L32
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r2.authority     // Catch: java.lang.Throwable -> L32
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L22
        L32:
            return r0
    }

    public static cn.jiguang.av.a a() {
            cn.jiguang.av.a r0 = cn.jiguang.av.a.f673b
            if (r0 != 0) goto L19
            java.lang.Class<cn.jiguang.av.a> r0 = cn.jiguang.av.a.class
            monitor-enter(r0)
            cn.jiguang.av.a r1 = cn.jiguang.av.a.f673b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jiguang.av.a r1 = new cn.jiguang.av.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jiguang.av.a.f673b = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jiguang.av.a r0 = cn.jiguang.av.a.f673b
            return r0
    }

    private static java.io.File a(java.io.File r2) {
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L17
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            java.io.File r2 = a(r2)
        L16:
            return r2
        L17:
            r2 = 0
            return r2
    }

    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r2 = cn.jiguang.av.a.a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lb
            java.lang.String r2 = cn.jiguang.av.a.a
            return r2
        Lb:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            r0 = 28
            if (r2 < r0) goto L1e
            java.lang.String r2 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.av.a.a = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L1e
            goto L2a
        L1e:
            java.lang.String r2 = cn.jiguang.av.r.b()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.av.a.a = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L2d
        L2a:
            java.lang.String r2 = cn.jiguang.av.a.a     // Catch: java.lang.Throwable -> L34
            return r2
        L2d:
            java.lang.String r2 = c()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.av.a.a = r2     // Catch: java.lang.Throwable -> L34
            goto L4f
        L34:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#unexcepted - getCurProcessName failed:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            cn.jiguang.w.f.j(r0, r2)
        L4f:
            java.lang.String r2 = cn.jiguang.av.a.a
            return r2
    }

    public static java.lang.String a(android.content.Context r2, android.content.Intent r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveService(r3, r1)     // Catch: java.lang.Throwable -> L2b
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            android.content.pm.ServiceInfo r0 = r3.serviceInfo     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.name     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2b
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2a
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L2b
            int r2 = r2.checkPermission(r4, r3)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            return r0
        L2b:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L16
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r2 = r0.getServiceInfo(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.processName     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            java.lang.String r2 = ""
            return r2
    }

    public static void a(android.content.Context r3, android.content.Intent r4) {
            r3.sendBroadcast(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send broadcast failed: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AndroidUtil"
            cn.jiguang.w.f.j(r1, r0)
            b(r3, r4)
            return
    }

    public static void a(android.content.Context r6, java.lang.String r7, int r8) {
            boolean r0 = e(r6)
            java.lang.String r1 = "AndroidUtil"
            if (r0 != 0) goto Le
            java.lang.String r6 = "not debuggable"
            cn.jiguang.w.f.c(r1, r6)
            return
        Le:
            java.lang.String r0 = "action:showPermanentNotification"
            cn.jiguang.w.f.c(r1, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<cn.jpush.android.service.PushReceiver> r2 = cn.jpush.android.service.PushReceiver.class
            r0.<init>(r6, r2)
            java.lang.String r2 = "noti_open_proxy"
            r0.setAction(r2)
            java.lang.String r2 = r6.getPackageName()
            r0.addCategory(r2)
            java.lang.String r2 = "debug_notification"
            r3 = 1
            r0.putExtra(r2, r3)
            java.lang.String r2 = "toastText"
            r0.putExtra(r2, r7)
            java.lang.String r2 = "type"
            r0.putExtra(r2, r8)
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            r2 = 0
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r6, r2, r0, r8)
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L5c
            android.content.Context r4 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L5c
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L5c
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r4, r2)     // Catch: java.lang.Throwable -> L5c
            int r1 = r2.icon     // Catch: java.lang.Throwable -> L5c
            goto L65
        L5c:
            r2 = move-exception
            java.lang.String r3 = "failed to get application info and icon."
            cn.jiguang.w.f.e(r1, r3, r2)
            r1 = 17301586(0x1080052, float:2.4979485E-38)
        L65:
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = android.os.Build.VERSION.SDK_INT
            android.app.Notification$Builder r5 = new android.app.Notification$Builder
            android.content.Context r6 = r6.getApplicationContext()
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
            r5.<init>(r6)
            java.lang.String r6 = "Jiguang提示：包名和AppKey不匹配"
            android.app.Notification$Builder r6 = r5.setContentTitle(r6)
            java.lang.String r5 = "请到 Portal 上获取您的包名和AppKey并更新AndroidManifest相应字段"
            android.app.Notification$Builder r6 = r6.setContentText(r5)
            android.app.Notification$Builder r6 = r6.setContentIntent(r8)
            android.app.Notification$Builder r6 = r6.setSmallIcon(r1)
            android.app.Notification$Builder r6 = r6.setTicker(r7)
            android.app.Notification$Builder r6 = r6.setWhen(r2)
            r7 = 26
            if (r4 < r7) goto Lac
            java.lang.String r7 = "JPush_Notification"
            android.app.NotificationChannel r8 = cn.jiguang.av.y.a(r0, r7)
            if (r8 != 0) goto La9
            r8 = 3
            android.app.NotificationChannel r8 = cn.jiguang.av.b0.a(r7, r7, r8)
            cn.jiguang.av.z.a(r0, r8)
        La9:
            cn.jiguang.av.a0.a(r6, r7)
        Lac:
            android.app.Notification r6 = r6.getNotification()
            r7 = 34
            r6.flags = r7
            r7 = 10000(0x2710, float:1.4013E-41)
            cn.jiguang.av.a.f678g = r7
            r0.notify(r7, r6)
            return
    }

    public static java.lang.String b(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L16
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L16
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r2 = r0.getReceiverInfo(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.processName     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            java.lang.String r2 = ""
            return r2
    }

    private static java.util.List<java.lang.String> b(android.content.Context r4, android.content.Intent r5, java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L43
            r2 = 0
            java.util.List r5 = r1.queryBroadcastReceivers(r5, r2)     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L43
        L16:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L43
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch: java.lang.Throwable -> L43
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L16
            java.lang.String r2 = r2.name     // Catch: java.lang.Throwable -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L16
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L3f
            android.content.pm.ActivityInfo r1 = r1.activityInfo     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L43
            int r1 = r4.checkPermission(r6, r1)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3f
            goto L16
        L3f:
            r0.add(r2)     // Catch: java.lang.Throwable -> L43
            goto L16
        L43:
            return r0
    }

    public static synchronized void b() {
            java.lang.Class<cn.jiguang.av.a> r0 = cn.jiguang.av.a.class
            monitor-enter(r0)
            r1 = 0
            cn.jiguang.av.a.f673b = r1     // Catch: java.lang.Throwable -> Lb
            a()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static void b(android.content.Context r6, android.content.Intent r7) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            java.util.List r1 = b(r6, r7, r1)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L5d
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L5d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r7.clone()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            android.content.Intent r3 = (android.content.Intent) r3     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r5 = r6.getPackageName()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r6.sendBroadcast(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            goto L13
        L35:
            r6 = move-exception
            goto L76
        L37:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "sendBroadcast failed again:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L35
            r3.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = ", action:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r7.getAction()     // Catch: java.lang.Throwable -> L35
            r3.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.j(r0, r2)     // Catch: java.lang.Throwable -> L35
            goto L13
        L5d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "sendBroadcast failed again: receiver not found, action:"
            r6.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r7.getAction()     // Catch: java.lang.Throwable -> L35
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.j(r0, r6)     // Catch: java.lang.Throwable -> L35
            goto L8e
        L76:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "tryAgainSendBrocast failed:"
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.j(r0, r6)
        L8e:
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<cn.jpush.android.service.PushReceiver> r1 = cn.jpush.android.service.PushReceiver.class
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4c
            r0.setAction(r3)     // Catch: java.lang.Throwable -> L4c
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "data"
            r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L4c
            r0.putExtras(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r2.getPackageName()     // Catch: java.lang.Throwable -> L4c
            r0.setPackage(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "AndroidUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r4.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "send config  intent="
            r4.append(r1)     // Catch: java.lang.Throwable -> L4c
            r4.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4c
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r2.getPackageName()     // Catch: java.lang.Throwable -> L4c
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = cn.jiguang.a.a.a     // Catch: java.lang.Throwable -> L4c
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r2.sendBroadcast(r0, r3)     // Catch: java.lang.Throwable -> L4c
        L4c:
            return
    }

    public static boolean b(android.content.Context r1) {
            java.lang.Boolean r0 = cn.jiguang.av.a.f674c
            if (r0 != 0) goto L16
            java.lang.String r0 = r1.getPackageName()
            java.lang.String r1 = a(r1)
            boolean r1 = r0.equals(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            cn.jiguang.av.a.f674c = r1
        L16:
            java.lang.Boolean r1 = cn.jiguang.av.a.f674c
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static int c(android.content.Context r0) {
            int r0 = cn.jiguang.f.b.y()
            return r0
    }

    public static java.lang.String c() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L38
            java.lang.String r2 = "/proc/self/cmdline"
            r1.<init>(r2)     // Catch: java.io.IOException -> L38
            r2 = 256(0x100, float:3.59E-43)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L25
        L10:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L27
            r4 = 0
        L17:
            if (r4 >= r3) goto L10
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L1e
            goto L10
        L1e:
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L25
            r0.append(r5)     // Catch: java.lang.Throwable -> L25
            int r4 = r4 + 1
            goto L17
        L25:
            r0 = move-exception
            goto L2f
        L27:
            r1.close()     // Catch: java.io.IOException -> L38
            java.lang.String r0 = r0.toString()
            return r0
        L2f:
            r1.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L38
        L37:
            throw r0     // Catch: java.io.IOException -> L38
        L38:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean d() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L19
            java.lang.String r1 = "mounted_ro"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L23
            boolean r0 = android.os.Environment.isExternalStorageEmulated()
            if (r0 != 0) goto L23
            return r2
        L23:
            return r3
    }

    public static boolean d(android.content.Context r4) {
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.sourceDir
            boolean r0 = cn.jiguang.av.v.a(r4)
            r1 = 0
            java.lang.String r2 = "AndroidUtil"
            if (r0 == 0) goto L15
            java.lang.String r4 = "Unexpected: cannot get pk installed path"
            cn.jiguang.w.f.l(r2, r4)
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Current pk installed path: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r2, r0)
            java.lang.String r0 = "/system/app/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L33
            r4 = 1
            return r4
        L33:
            java.lang.String r0 = "/data/app/"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L3c
            return r1
        L3c:
            java.lang.String r4 = "NOTE: the pk does not installed in system/data. "
            cn.jiguang.w.f.f(r2, r4)
            return r1
    }

    public static java.lang.String e() {
            java.lang.String r0 = "os.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/proc/version"
            r1.<init>(r2)
            boolean r2 = r1.canRead()
            java.lang.String r3 = "AndroidUtil"
            if (r2 != 0) goto L1b
            java.lang.String r1 = "Cannot read /proc/version, returning default version."
            cn.jiguang.w.f.c(r3, r1)
            return r0
        L1b:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2d
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.io.IOException -> L2d
            r4.<init>(r1)     // Catch: java.io.IOException -> L2d
            r2.<init>(r4)     // Catch: java.io.IOException -> L2d
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L2f
            r2.close()     // Catch: java.io.IOException -> L2d
            return r1
        L2d:
            r1 = move-exception
            goto L39
        L2f:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.io.IOException -> L2d
        L38:
            throw r1     // Catch: java.io.IOException -> L2d
        L39:
            java.lang.String r2 = "Exception while attempting to read kernel information"
            cn.jiguang.w.f.a(r3, r2, r1)
            return r0
    }

    public static boolean e(android.content.Context r14) {
            java.lang.Boolean r0 = cn.jiguang.av.a.f675d
            if (r0 == 0) goto Lb
            java.lang.Boolean r14 = cn.jiguang.av.a.f675d
            boolean r14 = r14.booleanValue()
            return r14
        Lb:
            java.lang.Object r0 = cn.jiguang.av.a.f676e
            monitor-enter(r0)
            java.lang.Boolean r1 = cn.jiguang.av.a.f675d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            java.lang.Boolean r14 = cn.jiguang.av.a.f675d     // Catch: java.lang.Throwable -> L1a
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r14
        L1a:
            r14 = move-exception
            goto Leb
        L1d:
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r14.getApplicationInfo()     // Catch: java.lang.Throwable -> Le3
            int r2 = r2.flags     // Catch: java.lang.Throwable -> Le3
            r3 = 2
            r2 = r2 & r3
            r4 = 1
            if (r2 == 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            java.lang.String r5 = "AndroidUtil"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r6.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r7 = "isDebug:"
            r6.append(r7)     // Catch: java.lang.Throwable -> Le3
            r6.append(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> Le3
            cn.jiguang.w.f.c(r5, r2)     // Catch: java.lang.Throwable -> Le3
            javax.security.auth.x500.X500Principal r2 = new javax.security.auth.x500.X500Principal     // Catch: java.lang.Throwable -> Le3
            java.lang.String r5 = "CN=Android Debug,O=Android,C=US"
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r5 = "CN=Android Debug"
            java.lang.String r6 = "O=Android"
            java.lang.String r7 = "C=US"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch: java.lang.Throwable -> Le3
            r6 = 64
            android.content.pm.PackageInfo r14 = cn.jiguang.av.o.a(r14, r6)     // Catch: java.lang.Throwable -> Le3
            if (r14 == 0) goto Le3
            android.content.pm.Signature[] r14 = r14.signatures     // Catch: java.lang.Throwable -> Le3
            java.security.cert.CertificateFactory r6 = f()     // Catch: java.lang.Throwable -> Le3
            if (r6 != 0) goto L69
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Le3
            cn.jiguang.av.a.f675d = r14     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L69:
            int r7 = r14.length     // Catch: java.lang.Throwable -> Le3
            r8 = 0
            r9 = 0
        L6c:
            if (r8 >= r7) goto La2
            r10 = r14[r8]     // Catch: java.lang.Throwable -> La2
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> La2
            byte[] r10 = r10.toByteArray()     // Catch: java.lang.Throwable -> La2
            r11.<init>(r10)     // Catch: java.lang.Throwable -> La2
            java.security.cert.Certificate r10 = r6.generateCertificate(r11)     // Catch: java.lang.Throwable -> La2
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch: java.lang.Throwable -> La2
            r11.close()     // Catch: java.lang.Exception -> L82 java.lang.Throwable -> La2
        L82:
            javax.security.auth.x500.X500Principal r11 = r10.getSubjectX500Principal()     // Catch: java.lang.Throwable -> La2
            boolean r9 = r11.equals(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r11 = "AndroidUtil"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r12.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r13 = "debuggable :"
            r12.append(r13)     // Catch: java.lang.Throwable -> La2
            r12.append(r9)     // Catch: java.lang.Throwable -> La2
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La2
            cn.jiguang.w.f.c(r11, r12)     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto La4
        La2:
            r1 = r9
            goto Le3
        La4:
            javax.security.auth.x500.X500Principal r10 = r10.getSubjectX500Principal()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> Lad
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> Lad
            goto Lae
        Lad:
            r10 = 0
        Lae:
            java.lang.String r11 = "AndroidUtil"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r12.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r13 = "certName:"
            r12.append(r13)     // Catch: java.lang.Throwable -> La2
            r12.append(r10)     // Catch: java.lang.Throwable -> La2
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La2
            cn.jiguang.w.f.c(r11, r12)     // Catch: java.lang.Throwable -> La2
            if (r10 == 0) goto Le0
            r11 = r5[r1]     // Catch: java.lang.Throwable -> La2
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto Le0
            r11 = r5[r4]     // Catch: java.lang.Throwable -> La2
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto Le0
            r11 = r5[r3]     // Catch: java.lang.Throwable -> La2
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> La2
            if (r10 == 0) goto Le0
            r1 = 1
            goto Le3
        Le0:
            int r8 = r8 + 1
            goto L6c
        Le3:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1a
            cn.jiguang.av.a.f675d = r14     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r14
    }

    public static boolean e(android.content.Context r3, java.lang.String r4) {
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r0 = 1
            java.lang.String r1 = "android.permission.INTERNET"
            int r1 = r3.checkPermission(r1, r4)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto Le
            return r0
        Le:
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r4, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L16
            return r0
        L16:
            android.content.Intent r3 = a(r3, r4)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            return r0
        L1d:
            return r1
    }

    private static java.security.cert.CertificateFactory f() {
            java.security.cert.CertificateFactory r0 = cn.jiguang.av.a.f677f
            if (r0 != 0) goto L35
            java.lang.Object r0 = cn.jiguang.av.a.f676e
            monitor-enter(r0)
            java.security.cert.CertificateFactory r1 = cn.jiguang.av.a.f677f     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L31
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            cn.jiguang.av.a.f677f = r1     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
            goto L31
        L14:
            r1 = move-exception
            goto L33
        L16:
            r1 = move-exception
            java.lang.String r2 = "AndroidUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "Failed to create CertificateFactory: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L14
            r3.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L14
            cn.jiguang.w.f.i(r2, r1)     // Catch: java.lang.Throwable -> L14
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L35
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L35:
            java.security.cert.CertificateFactory r0 = cn.jiguang.av.a.f677f
            return r0
    }

    public static void f(android.content.Context r2) {
            int r0 = cn.jiguang.av.a.f678g     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L11
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L12
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.Throwable -> L12
            int r0 = cn.jiguang.av.a.f678g     // Catch: java.lang.Throwable -> L12
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L12
        L11:
            return
        L12:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[canclePermanentNotification] failed:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AndroidUtil"
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    public static java.lang.String g(android.content.Context r1) {
            java.lang.String r1 = k(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/data/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L1b:
            return r1
    }

    public static java.lang.String h(android.content.Context r6) {
            java.lang.String r0 = "AndroidUtil"
            r1 = 0
            r2 = -1
            if (r6 == 0) goto L6d
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L51
            android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "country_detector"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L53
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "detectCountry"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L6d
            java.lang.Object r6 = r3.invoke(r6, r1)     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L6d
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "getCountryIso"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.invoke(r6, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L51
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "getSource"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r4.invoke(r6, r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L4e
            int r2 = r6.intValue()     // Catch: java.lang.Throwable -> L4e
            r1 = r3
            goto L6d
        L4e:
            r6 = move-exception
            r1 = r3
            goto L59
        L51:
            r6 = move-exception
            goto L59
        L53:
            java.lang.String r6 = "country_detector is null"
            cn.jiguang.w.f.c(r0, r6)     // Catch: java.lang.Throwable -> L51
            goto L6d
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getCountryCode failed, error :"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            cn.jiguang.w.f.l(r0, r6)
        L6d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "get CountCode = "
            r6.append(r3)
            r6.append(r1)
            java.lang.String r3 = " source = "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.c(r0, r6)
            if (r2 == 0) goto L92
            r6 = 1
            if (r2 != r6) goto L8f
            goto L92
        L8f:
            java.lang.String r6 = ""
            return r6
        L92:
            return r1
    }

    public static java.lang.String i(android.content.Context r2) {
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L23
            int r1 = r0.labelRes     // Catch: java.lang.Exception -> L23
            if (r1 != 0) goto L1e
            java.lang.CharSequence r1 = r0.nonLocalizedLabel     // Catch: java.lang.Exception -> L23
            if (r1 == 0) goto L11
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Exception -> L23
            return r2
        L11:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L23
            java.lang.CharSequence r2 = r2.getApplicationLabel(r0)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L23
            return r2
        L1e:
            java.lang.String r2 = r2.getString(r1)     // Catch: java.lang.Exception -> L23
            return r2
        L23:
            r2 = move-exception
            java.lang.String r0 = "AndroidUtil"
            java.lang.String r1 = "Error getting application name."
            cn.jiguang.w.f.a(r0, r1, r2)
            r2 = 0
            return r2
    }

    @android.annotation.TargetApi(19)
    public static java.lang.String k(android.content.Context r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r0 = cn.jiguang.av.a.f680i     // Catch: java.lang.Throwable -> L30
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L4a
            java.lang.String r0 = "getExternalSdPath"
            r1 = 30000(0x7530, double:1.4822E-319)
            boolean r0 = cn.jiguang.av.j.a(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L4a
            android.content.Context r3 = cn.jiguang.av.c.a(r3)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            java.io.File r3 = r3.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L30
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L30
            java.io.File r3 = a(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.av.a.f680i = r3     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            goto L4a
        L32:
            java.lang.String r3 = "AndroidUtil"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "get sd ex path: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = cn.jiguang.av.a.f680i     // Catch: java.lang.Throwable -> L30
            r0.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.w.f.c(r3, r0)     // Catch: java.lang.Throwable -> L30
        L4a:
            java.lang.String r3 = cn.jiguang.av.a.f680i
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L55
            java.lang.String r3 = "/storage/emulated/0"
            goto L57
        L55:
            java.lang.String r3 = cn.jiguang.av.a.f680i
        L57:
            return r3
    }

    public static java.lang.String y(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "device_name"
            java.lang.String r1 = android.provider.Settings.Global.getString(r1, r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public java.lang.String a(android.content.Context r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.j()
            return r1
    }

    public synchronized java.lang.String a(android.content.Context r1, boolean r2) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.f.b.e()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public synchronized java.lang.String b(android.content.Context r1, boolean r2) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.f.b.f()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public synchronized java.lang.String c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.f.b.c(r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public java.lang.String c(android.content.Context r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.l()
            return r1
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public synchronized java.lang.String d(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = cn.jiguang.f.b.b(r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public java.lang.String j(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.g()
            return r1
    }

    public java.lang.String l(android.content.Context r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.c(r2, r0)
            return r2
    }

    public boolean m(android.content.Context r1) {
            r0 = this;
            boolean r1 = cn.jiguang.f.b.k()
            return r1
    }

    public java.lang.String n(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.i()
            return r1
    }

    public java.lang.String o(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.h()
            return r1
    }

    public java.lang.String p(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.r()
            return r1
    }

    public java.lang.String q(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.c()
            return r1
    }

    public java.lang.String r(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.b()
            return r1
    }

    public java.lang.String s(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.t()
            return r1
    }

    public java.lang.String t(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.s()
            return r1
    }

    public java.lang.String u(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.q()
            return r1
    }

    public java.lang.String v(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.p()
            return r1
    }

    public java.lang.String w(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.o()
            return r1
    }

    public java.lang.String x(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.f.b.n()
            return r1
    }
}
