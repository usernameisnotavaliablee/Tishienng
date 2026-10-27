package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class Utils {
    private static final java.lang.String a = "Utils";

    public Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getCurrentTime(boolean r2) {
            if (r2 == 0) goto L7
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static boolean is64Bit(android.content.Context r6) {
            java.lang.String r0 = "64"
            r1 = 0
            java.lang.String r2 = "Utils"
            if (r6 != 0) goto Ld
            java.lang.String r6 = "Null context, please check it."
            com.huawei.hms.framework.common.Logger.e(r2, r6)
            return r1
        Ld:
            android.content.Context r3 = r6.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            if (r3 != 0) goto L19
            r3 = r6
            goto L21
        L19:
            android.content.Context r3 = r6.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
        L21:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L2c
            boolean r6 = com.bytedance.pangle.up.a.a()
            return r6
        L2c:
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            java.lang.String r3 = r3.nativeLibraryDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            boolean r6 = r3.contains(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            return r6
        L41:
            java.lang.String r3 = "Get application info failed: name not found, try to get baseContext."
            com.huawei.hms.framework.common.Logger.e(r2, r3)
            boolean r3 = r6 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L72
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            r1 = 1
            if (r6 != 0) goto L5a
            java.lang.String r6 = "Get baseContext failed: null. Return default: is64-bit."
            com.huawei.hms.framework.common.Logger.w(r2, r6)
            return r1
        L5a:
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r6 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.pm.ApplicationInfo r6 = r3.getApplicationInfo(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r6 = r6.nativeLibraryDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            boolean r1 = r6.contains(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto L72
        L6d:
            java.lang.String r6 = "Get baseContext application info failed: name not found"
            com.huawei.hms.framework.common.Logger.e(r2, r6)
        L72:
            return r1
    }
}
