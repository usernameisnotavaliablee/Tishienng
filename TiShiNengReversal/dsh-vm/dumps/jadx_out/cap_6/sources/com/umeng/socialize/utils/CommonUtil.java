package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CommonUtil {
    public CommonUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkAndroidManifest(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            java.lang.String r2 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            r1.<init>(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            r3.getActivityInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L13
            r3 = 1
            return r3
        L13:
            return r0
    }

    public static boolean checkIntentFilterData(android.content.Context r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            r0.addCategory(r1)
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            r0.addCategory(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "tencent"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            r1 = 64
            java.util.List r4 = r4.queryIntentActivities(r0, r1)
            int r0 = r4.size()
            r1 = 0
            if (r0 <= 0) goto L64
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r4.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.packageName
            java.lang.String r2 = r3.getPackageName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L46
            r3 = 1
            return r3
        L64:
            return r1
    }

    public static java.lang.String checkKeyHash(android.content.Context r0) {
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String checkMD5Sign(android.content.Context r0) {
            java.lang.String r0 = ""
            return r0
    }

    public static boolean checkMetaData(android.content.Context r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r1 = 0
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r3 == 0) goto L1b
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            java.lang.Object r3 = r3.get(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r3 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            return r1
    }

    public static boolean checkPath(java.lang.String r0) {
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean checkPermission(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            int r1 = r0.checkPermission(r2, r1)
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean checkResource(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r1 = r1.getPackageName()
            int r1 = r0.getIdentifier(r2, r3, r1)
            if (r1 > 0) goto L10
            r1 = 0
            return r1
        L10:
            r1 = 1
            return r1
    }

    public static java.lang.String checkSHA1(android.content.Context r0) {
            java.lang.String r0 = ""
            return r0
    }

    public static boolean isSilentMode(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r3 = 0
            java.lang.String r1 = "com.umeng.commonsdk.UMConfigure"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> Lc
            goto Le
        Lc:
            r1 = r3
        Le:
            if (r1 == 0) goto L2e
            java.lang.String r2 = "isSilentMode"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L1d
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L1f
        L1b:
            goto L1f
        L1d:
            r1 = r3
        L1f:
            if (r1 == 0) goto L2e
            java.lang.Object r3 = r1.invoke(r3, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2e
        L2e:
            return r0
    }
}
