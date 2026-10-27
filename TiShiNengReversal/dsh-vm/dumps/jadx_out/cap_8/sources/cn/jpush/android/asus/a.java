package cn.jpush.android.asus;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f1717b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1718c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1719d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f1720e;


    static {
            java.lang.String r0 = "asus"
            java.lang.String r0 = r0.toLowerCase()
            cn.jpush.android.asus.a.a = r0
            java.lang.String r0 = ""
            cn.jpush.android.asus.a.f1717b = r0
            r0 = 0
            cn.jpush.android.asus.a.f1720e = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.content.pm.ActivityInfo a(android.content.Context r7, java.lang.String r8, java.lang.Class<? extends android.content.BroadcastReceiver> r9) {
            r0 = 0
            java.lang.String r1 = "AsusPushHelper"
            if (r7 == 0) goto L59
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L59
            if (r9 != 0) goto Le
            goto L59
        Le:
            r2 = 2
            android.content.pm.PackageInfo r7 = cn.jpush.android.helper.JCoreHelper.getPackageInfo(r7, r8, r2)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L3e
            android.content.pm.ActivityInfo[] r7 = r7.receivers     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L3e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L3c
            if (r8 != 0) goto L1d
            goto L3e
        L1d:
            int r8 = r7.length     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = 0
        L20:
            if (r3 >= r8) goto L58
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r4.name     // Catch: java.lang.Throwable -> L39
            java.lang.ClassLoader r6 = r9.getClassLoader()     // Catch: java.lang.Throwable -> L39
            java.lang.Class r5 = java.lang.Class.forName(r5, r2, r6)     // Catch: java.lang.Throwable -> L39
            boolean r5 = r9.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L39
            boolean r5 = r4.enabled     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L39
            return r4
        L39:
            int r3 = r3 + 1
            goto L20
        L3c:
            r7 = move-exception
            goto L44
        L3e:
            java.lang.String r7 = "pkgInfo info is null"
            cn.jpush.android.helper.Logger.d(r1, r7)     // Catch: java.lang.Throwable -> L3c
            return r0
        L44:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getReceiver error:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            cn.jpush.android.helper.Logger.ww(r1, r7)
        L58:
            return r0
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Action - hasComponent, invalid param, context:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ",packageName:"
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ",cls:"
            r2.append(r7)
            r2.append(r9)
            java.lang.String r7 = r2.toString()
            cn.jpush.android.helper.Logger.w(r1, r7)
            return r0
    }

    public static void a(android.content.Context r3, int r4) {
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "code"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L49
            r2.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = ""
            r2.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L49
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "rom_type"
            r2 = 6
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L49
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "plugin_sdk_ver"
            java.lang.String r2 = cn.jpush.android.local.JPushConstants.SDK_VERSION_NAME     // Catch: java.lang.Throwable -> L49
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "vendor_sdk_ver"
            java.lang.String r2 = b()     // Catch: java.lang.Throwable -> L49
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "extra"
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r0.putString(r1, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "action_send_exception"
            cn.jpush.android.api.JThirdPlatFormInterface.doAction(r3, r4, r0)     // Catch: java.lang.Throwable -> L49
        L49:
            return
    }

    private static boolean a() {
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "asus"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L10
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
        L10:
            return r0
    }

    public static boolean a(android.content.Context r0) {
            b(r0)
            boolean r0 = cn.jpush.android.asus.a.f1718c
            return r0
    }

    private static java.lang.String b() {
            java.lang.Class<cn.jpush.android.f.e> r0 = cn.jpush.android.f.e.class
            java.lang.String r1 = "SDK_VERSION"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L13
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            java.lang.String r0 = ""
            return r0
    }

    public static synchronized void b(android.content.Context r4) {
            java.lang.Class<cn.jpush.android.asus.a> r0 = cn.jpush.android.asus.a.class
            monitor-enter(r0)
            boolean r1 = cn.jpush.android.asus.a.f1719d     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            if (r4 != 0) goto L16
            java.lang.String r4 = "AsusPushHelper"
            java.lang.String r1 = "context is null"
            cn.jpush.android.helper.Logger.ww(r4, r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r4 = move-exception
            goto L4e
        L16:
            boolean r1 = a()     // Catch: java.lang.Throwable -> L14
            r2 = 1
            if (r1 == 0) goto L2b
            boolean r1 = i(r4)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L2b
            boolean r4 = cn.jpush.android.c.b.a(r4)     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L2b
            cn.jpush.android.asus.a.f1718c = r2     // Catch: java.lang.Throwable -> L14
        L2b:
            java.lang.String r4 = "AsusPushHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            boolean r3 = cn.jpush.android.asus.a.f1718c     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L39
            java.lang.String r3 = "support "
            goto L3b
        L39:
            java.lang.String r3 = "not support "
        L3b:
            r1.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = cn.jpush.android.asus.a.a     // Catch: java.lang.Throwable -> L14
            r1.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            cn.jpush.android.helper.Logger.d(r4, r1)     // Catch: java.lang.Throwable -> L14
            cn.jpush.android.asus.a.f1719d = r2     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public static void c(android.content.Context r2) {
            b(r2)     // Catch: java.lang.Throwable -> L15
            boolean r0 = cn.jpush.android.asus.a.f1718c     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L8
            return
        L8:
            java.lang.String r0 = e(r2)     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.asus.a$1 r1 = new cn.jpush.android.asus.a$1     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.c.b.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "register error:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AsusPushHelper"
            cn.jpush.android.helper.Logger.w(r0, r2)
            return
    }

    public static byte d(android.content.Context r0) {
            r0 = 6
            return r0
    }

    public static java.lang.String e(android.content.Context r1) {
            java.lang.String r0 = cn.jpush.android.asus.a.f1717b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = cn.jpush.android.asus.a.f1717b
            return r1
        Lb:
            java.lang.String r1 = cn.jpush.android.helper.JCoreHelper.getAppKey(r1)
            return r1
    }

    public static java.lang.String f(android.content.Context r0) {
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String g(android.content.Context r0) {
            java.lang.String r0 = cn.jpush.android.c.b.d(r0)
            return r0
    }

    public static boolean h(android.content.Context r6) {
            java.lang.String r0 = e(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            java.lang.String r3 = "AsusPushHelper"
            if (r1 == 0) goto L24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = cn.jpush.android.asus.a.a
            r6.append(r0)
            java.lang.String r0 = " appkey or appid is empty,need not clear plugin rid"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
        L20:
            cn.jpush.android.helper.Logger.ii(r3, r6)
            return r2
        L24:
            java.lang.String r1 = cn.jpush.android.helper.JCoreHelper.getAppKey(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L31
            java.lang.String r6 = "jpush appkey is empty,need not clear plugin rid"
            goto L20
        L31:
            cn.jpush.android.cache.Key r4 = cn.jpush.android.cache.Key.ThirdPush_ClearFlag()
            java.lang.Object r4 = cn.jpush.android.cache.Sp.get(r6, r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            int r0 = cn.jpush.android.helper.JCoreHelper.getJCoreSDKVersionInt()
            r5.append(r0)
            int r0 = cn.jpush.android.helper.JCoreHelper.getJPushSDKVersionInt()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = cn.jpush.android.api.JThirdPlatFormInterface.toHash(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            if (r1 == 0) goto L73
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.ThirdPush_ClearFlag()
            cn.jpush.android.cache.Key r0 = r1.set(r0)
            cn.jpush.android.cache.Key[] r1 = new cn.jpush.android.cache.Key[r5]
            r1[r2] = r0
            cn.jpush.android.cache.Sp.set(r6, r1)
            return r5
        L73:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7a
            return r5
        L7a:
            boolean r1 = android.text.TextUtils.equals(r4, r0)
            if (r1 != 0) goto L95
            java.lang.String r1 = "local set changed,re bind token"
            cn.jpush.android.helper.Logger.d(r3, r1)
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.ThirdPush_ClearFlag()
            cn.jpush.android.cache.Key r0 = r1.set(r0)
            cn.jpush.android.cache.Key[] r1 = new cn.jpush.android.cache.Key[r5]
            r1[r2] = r0
            cn.jpush.android.cache.Sp.set(r6, r1)
            return r5
        L95:
            return r2
    }

    private static boolean i(android.content.Context r3) {
            java.lang.String r0 = r3.getPackageName()
            java.lang.Class<cn.jpush.android.asus.AsusPushMessageReceiver> r1 = cn.jpush.android.asus.AsusPushMessageReceiver.class
            android.content.pm.ActivityInfo r3 = a(r3, r0, r1)
            java.lang.String r0 = "AsusPushHelper"
            if (r3 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "found receiver:"
            r1.append(r2)
            java.lang.String r3 = r3.name
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r3)
            r3 = 1
            return r3
        L26:
            java.lang.String r3 = "AndroidManifest.xml missing receiver extends asus's AsusPushMessageReceiver"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            r3 = 0
            return r3
    }
}
