package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b0 {
    public b0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            if (r2 == 0) goto L2e
            int r0 = r2.length()
            if (r0 != 0) goto L9
            goto L2e
        L9:
            r0 = 0
            char r0 = r2.charAt(r0)
            boolean r1 = java.lang.Character.isUpperCase(r0)
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r0 = java.lang.Character.toUpperCase(r0)
            r1.append(r0)
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
        L2e:
            java.lang.String r2 = ""
            return r2
    }

    public static synchronized java.lang.String b(android.content.Context r4) {
            java.lang.Class<com.bxkj.base.util.b0> r0 = com.bxkj.base.util.b0.class
            monitor-enter(r0)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            r3 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            int r1 = r1.labelRes     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            java.lang.String r4 = r4.getString(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L21
            monitor-exit(r0)
            return r4
        L1e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
        L21:
            monitor-exit(r0)
            r4 = 0
            return r4
    }

    public static java.lang.String c() {
            com.bxkj.base.util.k r0 = com.bxkj.base.util.k.a
            boolean r1 = r0.d()
            if (r1 == 0) goto Ld
            java.lang.String r0 = r0.b()
            return r0
        Ld:
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = a(r0)
            return r0
    }

    public static java.lang.String e() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = a(r1)
            return r0
        Lf:
            return r1
    }

    public static java.lang.String f() {
            com.bxkj.base.util.k r0 = com.bxkj.base.util.k.a
            boolean r0 = r0.d()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "HarmonyOS"
            return r0
        Lb:
            java.lang.String r0 = "Android"
            return r0
    }

    public static int g(android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L10
            android.content.pm.PackageInfo r2 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L10
            int r2 = r2.versionCode     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            return r0
    }

    public static java.lang.String h(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            java.lang.String r2 = "1.0"
            return r2
    }
}
