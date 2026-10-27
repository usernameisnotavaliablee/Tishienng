package cn.jiguang.p;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static final java.util.ArrayList<java.lang.String> a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.ArrayList<java.lang.String> f1385b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1386c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.Boolean f1387d;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f1388e = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.p.a.a = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cn.jiguang.p.a.f1385b = r1
            r2 = 19
            byte[] r2 = new byte[r2]
            r2 = {x0034: FILL_ARRAY_DATA , data: [122, 103, 123, 63, 67, 79, 113, 125, 56, 127, 85, 87, 106, 107, 122, 120, 85, 78, 109} // fill-array
            java.lang.String r2 = cn.jiguang.av.k.b(r2)
            r0.add(r2)
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x0042: FILL_ARRAY_DATA , data: [107, 121, 124, 30, 84, 124, 102, 117, 116, 94, 84, 55, 105, 120, 117, 66, 79, 112, 108, 56, 96, 65, 68, 118, 127, 120, 125, 95, 65, 125, 109, 100} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            r1.add(r0)
            java.lang.String r0 = "Xiaomi"
            java.lang.String r0 = r0.toLowerCase()
            cn.jiguang.p.a.f1388e = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    static cn.jiguang.n.c a(android.content.Context r6, android.content.pm.PackageManager r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "JComponentHelper"
            r1 = 0
            if (r7 == 0) goto L9d
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 == 0) goto Ld
            goto L9d
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r2.append(r8)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = ".permission.JPUSH_MESSAGE"
            r2.append(r3)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            int r2 = r7.checkPermission(r2, r8)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r7.getApplicationInfo(r8, r3)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r3 == 0) goto L9d
            android.os.Bundle r4 = r3.metaData     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r4 == 0) goto L9d
            java.lang.String r6 = cn.jiguang.v.a.a(r6)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r5 = "cn.jpush.android.service.PushService"
            r4.setClassName(r8, r5)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r5 = 0
            android.content.pm.ResolveInfo r7 = r7.resolveService(r4, r5)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r7 == 0) goto L44
            r5 = 1
        L44:
            if (r2 != 0) goto L9d
            if (r5 == 0) goto L9d
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r7 != 0) goto L9d
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r7 = 24
            if (r6 != r7) goto L9d
            cn.jiguang.n.c r6 = new cn.jiguang.n.c     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            int r7 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r6.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r7.<init>()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r7.append(r8)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r8 = ".DownloadProvider"
            r7.append(r8)     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            r6.f1344d = r7     // Catch: java.lang.Throwable -> L71 android.content.pm.PackageManager.NameNotFoundException -> L73
            return r6
        L71:
            r6 = move-exception
            goto L75
        L73:
            r6 = move-exception
            goto L8e
        L75:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkWhetherToStart throwable:"
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
        L83:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r0, r6)
            goto L9d
        L8e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkWhetherToStart exception:"
            r7.append(r8)
            java.lang.String r6 = r6.toString()
            goto L83
        L9d:
            return r1
    }

    public static void a(android.content.Context r4, boolean r5) {
            boolean r0 = cn.jiguang.p.a.f1386c     // Catch: java.lang.Throwable -> L3f
            if (r0 != r5) goto L5
            return
        L5:
            cn.jiguang.p.a.f1386c = r5     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "cn.jpush.android.intent.DaemonService"
            java.lang.String r1 = "cn.jpush.android.service.DaemonService"
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L3f
            a(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "cn.jpush.android.service.DownloadProvider"
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Throwable -> L3f
            b(r4, r5, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "cn.jpush.android.service.DActivity"
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Throwable -> L3f
            a(r4, r5, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "cn.jpush.android.service.BActivity"
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Throwable -> L3f
            a(r4, r5, r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "setComponentEnable failed, "
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JComponentHelper"
            cn.jiguang.w.f.c(r5, r4)
            return
    }

    private static void a(android.content.Context r5, boolean r6, java.lang.Class r7) {
            java.lang.String r0 = "JComponentHelper"
            if (r5 != 0) goto Lc
            java.lang.String r5 = "context is null, give up setComponentEnabled"
        L6:
            cn.jiguang.w.f.j(r0, r5)     // Catch: java.lang.Throwable -> La
            return
        La:
            r5 = move-exception
            goto L6d
        Lc:
            if (r7 != 0) goto Lf
            return
        Lf:
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> La
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> La
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L20
            java.lang.String r5 = "PackageManager is null, give up setComponentEnabled"
            goto L6
        L20:
            r2 = 1
            if (r6 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 2
        L26:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> La
            int r5 = r1.getComponentEnabledSetting(r4)     // Catch: java.lang.Throwable -> La
            if (r5 != r3) goto L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = r4.getClassName()     // Catch: java.lang.Throwable -> La
            r5.append(r7)     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = " enabled is :"
            r5.append(r7)     // Catch: java.lang.Throwable -> La
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = ", no need repeat set."
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La
            return
        L52:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            r5.append(r4)     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = " setActivityEnabledSetting newState: "
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            r5.append(r3)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La
            r1.setComponentEnabledSetting(r4, r3, r2)     // Catch: java.lang.Throwable -> La
            return
        L6d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setActivityEnabled throwable:"
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
            return
    }

    private static void a(android.content.Context r5, boolean r6, java.lang.String r7, java.lang.Class r8) {
            java.lang.String r0 = "JComponentHelper"
            if (r5 != 0) goto Ld
            java.lang.String r5 = "context is null, give up setComponentEnabled"
        L6:
            cn.jiguang.w.f.j(r0, r5)     // Catch: java.lang.Throwable -> La
            return
        La:
            r5 = move-exception
            goto Ld2
        Ld:
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> La
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> La
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L1e
            java.lang.String r5 = "PackageManager is null, give up setComponentEnabled"
            goto L6
        L1e:
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> La
            r2 = 1
            if (r6 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 2
        L28:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            r4.<init>()     // Catch: java.lang.Throwable -> La
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> La
            r4.setAction(r7)     // Catch: java.lang.Throwable -> La
            r5 = 512(0x200, float:7.17E-43)
            android.content.pm.ResolveInfo r5 = r1.resolveService(r4, r5)     // Catch: java.lang.Throwable -> La
            if (r5 == 0) goto Lcf
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch: java.lang.Throwable -> La
            if (r5 != 0) goto L41
            goto Lea
        L41:
            java.lang.String r7 = r5.name     // Catch: java.lang.Throwable -> La
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> La
            if (r4 == 0) goto L4b
            goto Lea
        L4b:
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            boolean r4 = r8.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            if (r4 == 0) goto L99
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r4 = r5.packageName     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r5 = r5.name     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r8.<init>(r4, r5)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.append(r8)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r4 = " setComponentEnabledSetting newState: "
            r5.append(r4)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.append(r3)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            int r5 = r1.getComponentEnabledSetting(r8)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            if (r5 != r3) goto L95
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r8 = "DaemonService  enabled is :"
            r5.append(r8)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.append(r6)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r6 = ", no need repeat set."
            r5.append(r6)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            return
        L95:
            r1.setComponentEnabledSetting(r8, r3, r2)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            goto Lea
        L99:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r6 = "give up setting, as "
            r5.append(r6)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.append(r7)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r6 = " is not extend from: "
            r5.append(r6)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r6 = r8.getName()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            r5.append(r6)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            cn.jiguang.w.f.j(r0, r5)     // Catch: java.lang.Throwable -> La java.lang.ClassNotFoundException -> Lba
            goto Lea
        Lba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = "cant't find service class:"
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            r5.append(r7)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
        Lcb:
            cn.jiguang.w.f.i(r0, r5)     // Catch: java.lang.Throwable -> La
            goto Lea
        Lcf:
            java.lang.String r5 = "cant't find DaemonService"
            goto Lcb
        Ld2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setServiceEnabled throwable:"
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
        Lea:
            return
    }

    public static boolean a(android.content.Context r1) {
            java.lang.Boolean r0 = cn.jiguang.p.a.f1387d
            if (r0 == 0) goto L9
            boolean r1 = r0.booleanValue()
            return r1
        L9:
            boolean r1 = b(r1)
            if (r1 == 0) goto L14
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L11:
            cn.jiguang.p.a.f1387d = r1
            goto L17
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L11
        L17:
            java.lang.Boolean r1 = cn.jiguang.p.a.f1387d
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean a(android.content.Context r3, java.lang.String r4, android.content.Intent r5, boolean r6) {
            java.lang.String r0 = "JComponentHelper"
            r1 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto La
            return r1
        La:
            r5.setPackage(r4)     // Catch: java.lang.Throwable -> L18
            if (r6 != 0) goto L1b
            java.lang.String r6 = "cn.jpush.android.intent.DActivity"
            r5.setAction(r6)     // Catch: java.lang.Throwable -> L18
            r5.addCategory(r4)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r3 = move-exception
            goto Lcb
        L1b:
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r5, r1)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "getDActivity resolveInfo was null from:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L18
            r3.append(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.i(r0, r3)     // Catch: java.lang.Throwable -> L18
            return r1
        L36:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r6.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "target actvity name:"
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r2 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r2.name     // Catch: java.lang.Throwable -> L18
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = ", theme:"
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r2 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            int r2 = r2.theme     // Catch: java.lang.Throwable -> L18
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = ", exported:"
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r2 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.exported     // Catch: java.lang.Throwable -> L18
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = ", enable: "
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r2 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.enabled     // Catch: java.lang.Throwable -> L18
            r6.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r0, r6)     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r6 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            boolean r6 = r6.exported     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto Lc5
            boolean r6 = a(r4)     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto L85
            android.content.pm.ActivityInfo r6 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            boolean r6 = r6.enabled     // Catch: java.lang.Throwable -> L18
            if (r6 != 0) goto L85
            goto Lc5
        L85:
            java.util.ArrayList<java.lang.String> r6 = cn.jiguang.p.a.f1385b     // Catch: java.lang.Throwable -> L18
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto Laf
            android.content.pm.ActivityInfo r4 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            int r4 = r4.theme     // Catch: java.lang.Throwable -> L18
            r6 = 16973840(0x1030010, float:2.4060945E-38)
            if (r4 == r6) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r4.<init>()     // Catch: java.lang.Throwable -> L18
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.name     // Catch: java.lang.Throwable -> L18
            r4.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "activity theme must config as @android:style/Theme.Translucent.NoTitleBar"
            r4.append(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.i(r0, r3)     // Catch: java.lang.Throwable -> L18
            return r1
        Laf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "dIntent:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L18
            r3.append(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r0, r3)     // Catch: java.lang.Throwable -> L18
            r3 = 1
            return r3
        Lc5:
            java.lang.String r3 = "activity muse be exported and enabled"
            cn.jiguang.w.f.i(r0, r3)     // Catch: java.lang.Throwable -> L18
            return r1
        Lcb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get deeplink activity error#"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
            return r1
    }

    private static boolean a(java.lang.String r3) {
            java.util.ArrayList<java.lang.String> r0 = cn.jiguang.p.a.a
            boolean r0 = r0.contains(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package["
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "] need check activity enable state, "
            r1.append(r3)
            r3 = r0 ^ 1
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "JComponentHelper"
            cn.jiguang.w.f.f(r1, r3)
            r3 = r0 ^ 1
            return r3
    }

    private static void b(android.content.Context r5, boolean r6, java.lang.Class r7) {
            java.lang.String r0 = "JComponentHelper"
            if (r5 != 0) goto Lc
            java.lang.String r5 = "context is null, give up setComponentEnabled"
        L6:
            cn.jiguang.w.f.j(r0, r5)     // Catch: java.lang.Throwable -> La
            return
        La:
            r5 = move-exception
            goto L6a
        Lc:
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> La
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> La
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L1d
            java.lang.String r5 = "PackageManager is null, give up setComponentEnabled"
            goto L6
        L1d:
            r2 = 1
            if (r6 == 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 2
        L23:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> La
            int r5 = r1.getComponentEnabledSetting(r4)     // Catch: java.lang.Throwable -> La
            if (r5 != r3) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = r4.getClassName()     // Catch: java.lang.Throwable -> La
            r5.append(r7)     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = " enabled is :"
            r5.append(r7)     // Catch: java.lang.Throwable -> La
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = ", no need repeat set."
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La
            return
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            r5.append(r4)     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = " setDownloadProviderEnabledSetting newState: "
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            r5.append(r3)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
            cn.jiguang.w.f.c(r0, r5)     // Catch: java.lang.Throwable -> La
            r1.setComponentEnabledSetting(r4, r3, r2)     // Catch: java.lang.Throwable -> La
            return
        L6a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "setContentProviderEnabled throwable:"
            r6.append(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.w.f.i(r0, r5)
            return
    }

    private static boolean b(android.content.Context r2) {
            cn.jiguang.av.a r0 = cn.jiguang.av.a.a()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r0.u(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L33
            java.lang.String r0 = cn.jiguang.p.a.f1388e     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L33
            r2 = 1
            return r2
        L1c:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get MANUFACTURER failed - error:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "JComponentHelper"
            cn.jiguang.w.f.j(r0, r2)
        L33:
            r2 = 0
            return r2
    }
}
