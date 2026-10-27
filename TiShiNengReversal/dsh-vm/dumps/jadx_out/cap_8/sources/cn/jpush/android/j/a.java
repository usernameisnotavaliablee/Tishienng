package cn.jpush.android.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f1817b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1818c = null;

    static {
            java.lang.String r0 = ""
            java.lang.String r0 = r0.toLowerCase()
            cn.jpush.android.j.a.f1818c = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.pm.ComponentInfo a(android.content.Context r8, java.lang.String r9, java.lang.Class<?> r10) {
            java.lang.String r0 = "AndroidUtils"
            r1 = 0
            if (r8 == 0) goto L98
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto Ld
            goto L98
        Ld:
            java.lang.Class<android.app.Service> r2 = android.app.Service.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L52
            r3 = 8
            r4 = 2
            r5 = 4
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L1d
            r2 = 4
            goto L3d
        L1d:
            java.lang.Class<android.content.BroadcastReceiver> r2 = android.content.BroadcastReceiver.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L27
            r2 = 2
            goto L3d
        L27:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L31
            r2 = 1
            goto L3d
        L31:
            java.lang.Class<android.content.ContentProvider> r2 = android.content.ContentProvider.class
            boolean r2 = r2.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L3c
            r2 = 8
            goto L3d
        L3c:
            r2 = 0
        L3d:
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L52
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r9, r2)     // Catch: java.lang.Throwable -> L52
            if (r2 == r7) goto L5a
            if (r2 == r4) goto L57
            if (r2 == r5) goto L54
            if (r2 == r3) goto L4f
            r8 = r1
            goto L5c
        L4f:
            android.content.pm.ProviderInfo[] r8 = r8.providers     // Catch: java.lang.Throwable -> L52
            goto L5c
        L52:
            r8 = move-exception
            goto L86
        L54:
            android.content.pm.ServiceInfo[] r8 = r8.services     // Catch: java.lang.Throwable -> L52
            goto L5c
        L57:
            android.content.pm.ActivityInfo[] r8 = r8.receivers     // Catch: java.lang.Throwable -> L52
            goto L5c
        L5a:
            android.content.pm.ActivityInfo[] r8 = r8.activities     // Catch: java.lang.Throwable -> L52
        L5c:
            if (r8 != 0) goto L5f
            return r1
        L5f:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L52
        L60:
            if (r6 >= r9) goto L97
            r2 = r8[r6]     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r2.name     // Catch: java.lang.Throwable -> L71
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L71
            boolean r3 = r10.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L83
            return r2
        L71:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "check component e:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L52
            r3.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L52
            cn.jpush.android.i.b.d(r0, r2)     // Catch: java.lang.Throwable -> L52
        L83:
            int r6 = r6 + 1
            goto L60
        L86:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "hasComponent error:"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jpush.android.i.b.e(r0, r8)
        L97:
            return r1
        L98:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Action - hasComponent, invalide param, context:"
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = ",packageName:"
            r2.append(r8)
            r2.append(r9)
            java.lang.String r8 = ",cls:"
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = r2.toString()
            cn.jpush.android.i.b.d(r0, r8)
            return r1
    }

    public static boolean a(android.content.Context r5) {
            r0 = 0
            java.lang.String r1 = "AndroidUtils"
            if (r5 != 0) goto Lb
            java.lang.String r5 = "context was null"
        L7:
            cn.jpush.android.i.b.e(r1, r5)
            return r0
        Lb:
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "MANUFACTURER:"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            r2.append(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jpush.android.i.b.a(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L34
        L1f:
            r2 = move-exception
            goto L23
        L21:
            r2 = move-exception
            r5 = 0
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get MANUFACTURER failed - error:"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jpush.android.i.b.e(r1, r2)
        L34:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L3d
            java.lang.String r5 = "MANUFACTURER was empty"
            goto L7
        L3d:
            java.lang.String r1 = cn.jpush.android.j.a.f1818c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r2 == 0) goto L47
            return r3
        L47:
            java.lang.String r5 = r5.toLowerCase()
            boolean r5 = android.text.TextUtils.equals(r1, r5)
            if (r5 == 0) goto L52
            return r3
        L52:
            return r0
    }
}
