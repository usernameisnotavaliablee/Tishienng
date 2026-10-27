package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    private static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1472b;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1473c;

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.content.pm.ComponentInfo a(android.content.Context r10, java.lang.String r11, java.lang.Class<?> r12) {
            java.lang.String r0 = "JDyAndroidUtils"
            r1 = 0
            if (r10 == 0) goto L94
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto L94
            if (r12 != 0) goto Lf
            goto L94
        Lf:
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            boolean r2 = r2.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L5d
            r3 = 8
            r4 = 2
            r5 = 4
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L1f
            r2 = 4
            goto L3f
        L1f:
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            boolean r2 = r2.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L29
            r2 = 2
            goto L3f
        L29:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            boolean r2 = r2.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L33
            r2 = 1
            goto L3f
        L33:
            java.lang.Class<android.content.ContentProvider> r2 = android.content.ContentProvider.class
            boolean r2 = r2.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L3e
            r2 = 8
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5d
            r9[r6] = r11     // Catch: java.lang.Throwable -> L5d
            r9[r7] = r8     // Catch: java.lang.Throwable -> L5d
            android.content.pm.PackageInfo r10 = cn.jiguang.u.f.a(r10, r9)     // Catch: java.lang.Throwable -> L5d
            if (r10 != 0) goto L50
            return r1
        L50:
            if (r2 == r7) goto L65
            if (r2 == r4) goto L62
            if (r2 == r5) goto L5f
            if (r2 == r3) goto L5a
            r10 = r1
            goto L67
        L5a:
            android.content.pm.ProviderInfo[] r10 = r10.providers     // Catch: java.lang.Throwable -> L5d
            goto L67
        L5d:
            r10 = move-exception
            goto L7f
        L5f:
            android.content.pm.ServiceInfo[] r10 = r10.services     // Catch: java.lang.Throwable -> L5d
            goto L67
        L62:
            android.content.pm.ActivityInfo[] r10 = r10.receivers     // Catch: java.lang.Throwable -> L5d
            goto L67
        L65:
            android.content.pm.ActivityInfo[] r10 = r10.activities     // Catch: java.lang.Throwable -> L5d
        L67:
            if (r10 != 0) goto L6a
            return r1
        L6a:
            int r11 = r10.length     // Catch: java.lang.Throwable -> L5d
        L6b:
            if (r6 >= r11) goto L93
            r2 = r10[r6]     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r2.name     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L7c
            boolean r3 = r12.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L7c
            return r2
        L7c:
            int r6 = r6 + 1
            goto L6b
        L7f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "hasComponent error:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.t.b.f(r0, r10)
        L93:
            return r1
        L94:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Action - hasComponent, invalide param, context:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r10 = ",packageName:"
            r2.append(r10)
            r2.append(r11)
            java.lang.String r10 = ",cls:"
            r2.append(r10)
            r2.append(r12)
            java.lang.String r10 = r2.toString()
            cn.jiguang.t.b.e(r0, r10)
            return r1
    }

    public static java.lang.String a() {
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

    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r2 = cn.jiguang.u.g.a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lb
            java.lang.String r2 = cn.jiguang.u.g.a
            return r2
        Lb:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            r0 = 28
            if (r2 < r0) goto L1e
            java.lang.String r2 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.u.g.a = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L1e
            goto L2a
        L1e:
            java.lang.String r2 = b()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.u.g.a = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L2d
        L2a:
            java.lang.String r2 = cn.jiguang.u.g.a     // Catch: java.lang.Throwable -> L34
            return r2
        L2d:
            java.lang.String r2 = a()     // Catch: java.lang.Throwable -> L34
            cn.jiguang.u.g.a = r2     // Catch: java.lang.Throwable -> L34
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
            java.lang.String r0 = "JDyAndroidUtils"
            cn.jiguang.t.b.f(r0, r2)
        L4f:
            java.lang.String r2 = cn.jiguang.u.g.a
            return r2
    }

    private static java.lang.String a(android.content.Context r2, android.content.Intent r3, java.lang.String r4) {
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

    private static java.lang.String a(android.content.Context r2, java.lang.String r3) {
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

    public static java.lang.String b() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            goto L26
        L25:
            return r0
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getCurrentProcessNameByActivityThread: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ReflectUtils"
            cn.jiguang.t.b.g(r2, r1)
            return r0
    }

    public static boolean b(android.content.Context r2) {
            if (r2 == 0) goto L15
            java.lang.String r0 = a(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L15
            java.lang.String r2 = c(r2)
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static java.lang.String c(android.content.Context r3) {
            java.lang.String r0 = cn.jiguang.u.g.f1473c
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = d(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "JDyAndroidUtils"
            if (r1 == 0) goto L31
            java.lang.String r3 = r3.getPackageName()
            cn.jiguang.u.g.f1473c = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "user serviceProcess is curProcessName:"
        L1f:
            r3.append(r0)
            java.lang.String r0 = cn.jiguang.u.g.f1473c
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            cn.jiguang.t.b.b(r2, r3)
            java.lang.String r3 = cn.jiguang.u.g.f1473c
            return r3
        L31:
            java.lang.String r3 = a(r3, r0)
            cn.jiguang.u.g.f1473c = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "user serviceProcess is:"
            goto L1f
    }

    private static java.lang.String d(android.content.Context r7) {
            java.lang.String r0 = "found userServiceClass :"
            java.lang.String r1 = ""
            java.lang.String r2 = "JDyAndroidUtils"
            r3 = 0
            java.lang.String r4 = cn.jiguang.u.g.f1472b     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto Lc
            return r4
        Lc:
            java.lang.String r4 = "cn.jpush.android.service.JCommonService"
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L53
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = "cn.jiguang.user.service.action"
            r4.setAction(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = r7.getPackageName()     // Catch: java.lang.Throwable -> L53
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = a(r7, r4, r1)     // Catch: java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L68
            java.lang.Class r5 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L53
            boolean r5 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L68
            cn.jiguang.u.g.f1472b = r4     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L53
            r4.append(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = cn.jiguang.u.g.f1472b     // Catch: java.lang.Throwable -> L53
            r4.append(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = " by getCommonServiceNames"
            r4.append(r5)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L53
            cn.jiguang.t.b.d(r2, r4)     // Catch: java.lang.Throwable -> L53
            goto L68
        L53:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getUserServiceClass failed:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.t.b.b(r2, r4)
        L68:
            java.lang.String r4 = cn.jiguang.u.g.f1472b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L97
            java.lang.String r4 = r7.getPackageName()
            android.content.pm.ComponentInfo r7 = a(r7, r4, r3)
            if (r7 == 0) goto L97
            java.lang.String r7 = r7.name
            cn.jiguang.u.g.f1472b = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = cn.jiguang.u.g.f1472b
            r7.append(r0)
            java.lang.String r0 = " by getComponentInfo"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            cn.jiguang.t.b.d(r2, r7)
        L97:
            java.lang.String r7 = cn.jiguang.u.g.f1472b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto La1
            cn.jiguang.u.g.f1472b = r1
        La1:
            java.lang.String r7 = cn.jiguang.u.g.f1472b
            return r7
    }
}
