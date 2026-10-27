package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    public a() {
            r1 = this;
            r1.<init>()
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

    private static android.content.Intent a(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lc
            r0 = 4
        L7:
            android.content.Intent r2 = a(r2, r0)
            return r2
        Lc:
            r0 = 0
            goto L7
    }

    public static android.content.Intent a(java.lang.String r2, int r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r2.addCategory(r0)
            r2.setComponent(r1)
            r2.setSelector(r1)
            return r3
    }

    public static boolean c(java.lang.String r3) {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 1
            java.lang.String r2 = "android.permission.INTERNET"
            int r2 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L12
            return r1
        L12:
            android.content.Intent r3 = a(r0, r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L19
            return r1
        L19:
            r3 = 0
            return r3
    }

    public static boolean d(java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L26
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "\\|"
            java.lang.String[] r4 = r4.split(r2)     // Catch: java.lang.Throwable -> L26
            int r2 = r4.length     // Catch: java.lang.Throwable -> L26
            r3 = 1
            if (r2 > r3) goto L14
            return r0
        L14:
            r2 = r4[r3]     // Catch: java.lang.Throwable -> L26
            android.content.Intent r2 = a(r2)     // Catch: java.lang.Throwable -> L26
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L26
            r2.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r2, r0)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L26
            return r3
        L26:
            return r0
    }

    public static boolean e(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L1f
            android.content.Context r0 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L1f
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L1f
            android.content.Intent r3 = r0.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1f
            r2 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r3, r2)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            return r1
    }
}
