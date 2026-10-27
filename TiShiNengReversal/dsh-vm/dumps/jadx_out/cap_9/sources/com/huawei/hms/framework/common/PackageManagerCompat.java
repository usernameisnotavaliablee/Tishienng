package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PackageManagerCompat {
    private static final java.lang.String a = "PackageUtils";
    private static final java.lang.String b = "7.0.2.301";
    private static java.lang.String c = "";

    static {
            return
    }

    public PackageManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.os.Bundle a(android.content.Context r3) {
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r1 != 0) goto L9
            goto Ld
        L9:
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        Ld:
            if (r3 != 0) goto L10
            goto L2c
        L10:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            if (r1 != 0) goto L17
            goto L2c
        L17:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.RuntimeException -> L28 android.content.pm.PackageManager.NameNotFoundException -> L2a
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.RuntimeException -> L28 android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r3 == 0) goto L2c
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.RuntimeException -> L28 android.content.pm.PackageManager.NameNotFoundException -> L2a
            if (r3 == 0) goto L2c
            return r3
        L28:
            r3 = move-exception
            goto L2d
        L2a:
            r3 = move-exception
            goto L2d
        L2c:
            return r0
        L2d:
            java.lang.String r1 = "PackageUtils"
            java.lang.String r2 = "NameNotFoundException:"
            com.huawei.hms.framework.common.Logger.w(r1, r2, r3)
            return r0
    }

    private static android.os.Bundle b(android.content.Context r3) {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getKitContext()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getKitContext()
        Lb:
            java.lang.String r0 = "PackageUtils"
            if (r3 != 0) goto L17
            java.lang.String r3 = "the kitContext is null"
            com.huawei.hms.framework.common.Logger.v(r0, r3)
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            return r3
        L17:
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()
            if (r1 != 0) goto L25
            java.lang.String r3 = "the kit applicationInfo is null"
            com.huawei.hms.framework.common.Logger.v(r0, r3)
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            return r3
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "kitContext: "
            r1.append(r2)
            java.lang.String r2 = r3.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            android.os.Bundle r3 = r3.metaData
            if (r3 != 0) goto L47
            android.os.Bundle r3 = android.os.Bundle.EMPTY
        L47:
            return r3
    }

    private static android.os.Bundle c(android.content.Context r2) {
            android.os.Bundle r0 = b(r2)
            if (r0 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            android.os.Bundle r2 = a(r2)
            return r2
    }

    public static java.lang.String getAppPackageName(android.content.Context r3) {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        Lb:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            return r1
        L14:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L21
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            java.lang.String r3 = "PackageUtils"
            java.lang.String r0 = "Failed to get Package managers Package Info"
            com.huawei.hms.framework.common.Logger.w(r3, r0)
            return r1
    }

    public static java.lang.String getAppVersion(android.content.Context r2) {
            java.lang.String r0 = com.huawei.hms.framework.common.PackageManagerCompat.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r2 = com.huawei.hms.framework.common.PackageManagerCompat.c
            return r2
        Lb:
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r0 != 0) goto L12
            goto L16
        L12:
            android.content.Context r2 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        L16:
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            if (r0 != 0) goto L1f
            java.lang.String r2 = com.huawei.hms.framework.common.PackageManagerCompat.c
            return r2
        L1f:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L32
            r1 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Throwable -> L32
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L32
            com.huawei.hms.framework.common.PackageManagerCompat.c = r2     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            java.lang.String r2 = "PackageUtils"
            java.lang.String r0 = "Failed to get Package managers Package Info"
            com.huawei.hms.framework.common.Logger.w(r2, r0)
        L39:
            java.lang.String r2 = com.huawei.hms.framework.common.PackageManagerCompat.c
            return r2
    }

    public static java.lang.String getMetaDataFromApp(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.os.Bundle r0 = a(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        Lb:
            return r2
    }

    public static java.lang.String getMetaDataFromKit(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.os.Bundle r0 = b(r0)     // Catch: java.lang.RuntimeException -> Lc
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.RuntimeException -> Lc
            return r0
        Lc:
            java.lang.String r0 = "PackageUtils"
            java.lang.String r1 = "the kit metaData is runtimeException"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            return r2
    }

    public static java.lang.String getMetaDataFromKitOrApp(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.os.Bundle r0 = c(r0)
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> getMetaDataMapFromKitOrApp(android.content.Context r5, java.lang.String r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.os.Bundle r5 = c(r5)
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.startsWith(r6)
            if (r3 != 0) goto L24
            goto L11
        L24:
            java.lang.String r3 = r5.getString(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L11
            int r4 = r6.length()
            java.lang.String r2 = r2.substring(r4)
            r0.put(r2, r3)
            goto L11
        L3a:
            return r0
    }
}
