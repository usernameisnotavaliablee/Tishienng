package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PowerUtils {
    private static final java.lang.String a = "PowerUtils";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final java.lang.String SMART_MODE_STATUS = "SmartModeStatus";

        public PowerMode() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public PowerUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAppIdleMode(android.content.Context r5) {
            java.lang.String r0 = "PowerUtils"
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.String r2 = r5.getPackageName()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 < r4) goto L1c
            java.lang.String r4 = "usagestats"
            java.lang.Object r5 = r5.getSystemService(r4)
            boolean r4 = r5 instanceof android.app.usage.UsageStatsManager
            if (r4 == 0) goto L28
            android.app.usage.UsageStatsManager r5 = (android.app.usage.UsageStatsManager) r5
            goto L1d
        L1c:
            r5 = 0
        L1d:
            if (r5 == 0) goto L29
            r0 = 23
            if (r3 < r0) goto L28
            boolean r5 = com.huawei.hms.framework.common.v.a(r5, r2)
            return r5
        L28:
            return r1
        L29:
            java.lang.String r5 = "isAppIdleMode statsManager is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r5)
            return r1
        L2f:
            java.lang.String r5 = "isAppIdleMode Context is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r5)
            return r1
    }

    public static boolean isDozeIdleMode(android.content.Context r4) {
            java.lang.String r0 = "PowerUtils"
            r1 = 0
            if (r4 == 0) goto L33
            java.lang.String r2 = "power"
            java.lang.Object r4 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r4, r2)
            boolean r2 = r4 instanceof android.os.PowerManager
            if (r2 == 0) goto L12
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            goto L13
        L12:
            r4 = 0
        L13:
            if (r4 == 0) goto L2d
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L27
            boolean r1 = com.huawei.hms.framework.common.w.a(r4)     // Catch: java.lang.RuntimeException -> L20
            goto L26
        L20:
            r4 = move-exception
            java.lang.String r2 = "dealType rethrowFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r0, r2, r4)
        L26:
            return r1
        L27:
            java.lang.String r4 = "isDozeIdleMode is version control state!"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
        L2d:
            java.lang.String r4 = "isDozeIdleMode powerManager is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
        L33:
            java.lang.String r4 = "isDozeIdleMode Context is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
    }

    public static boolean isInteractive(android.content.Context r2) {
            if (r2 == 0) goto L39
            java.lang.String r0 = "power"
            java.lang.Object r2 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r2, r0)
            boolean r0 = r2 instanceof android.os.PowerManager
            if (r0 == 0) goto L39
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            boolean r2 = r2.isInteractive()     // Catch: java.lang.RuntimeException -> L13
            return r2
        L13:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getActiveNetworkInfo failed, exception:"
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "PowerUtils"
            com.huawei.hms.framework.common.Logger.i(r0, r2)
        L39:
            r2 = 0
            return r2
    }

    public static boolean isWhilteList(android.content.Context r3) {
            if (r3 == 0) goto L29
            java.lang.String r0 = "power"
            java.lang.Object r0 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r3, r0)
            boolean r1 = r0 instanceof android.os.PowerManager
            if (r1 == 0) goto Lf
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r3 = r3.getPackageName()
            if (r0 == 0) goto L29
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L29
            boolean r3 = l.o.a(r0, r3)     // Catch: java.lang.RuntimeException -> L21
            return r3
        L21:
            r3 = move-exception
            java.lang.String r0 = "PowerUtils"
            java.lang.String r1 = "dealType rethrowFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r0, r1, r3)
        L29:
            r3 = 0
            return r3
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(android.content.Context r5) {
            java.lang.String r0 = "PowerUtils"
            r1 = 0
            if (r5 == 0) goto L3c
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r5.getSystemService(r2)
            boolean r3 = r2 instanceof android.net.ConnectivityManager
            if (r3 == 0) goto L12
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L36
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = com.huawei.hms.framework.common.ContextCompat.checkSelfPermission(r5, r4)
            if (r5 == 0) goto L20
            goto L2f
        L20:
            boolean r5 = r2.isActiveNetworkMetered()
            if (r5 == 0) goto L30
            r5 = 24
            if (r3 < r5) goto L2f
            int r5 = com.huawei.hms.framework.common.e.a(r2)
            return r5
        L2f:
            return r1
        L30:
            java.lang.String r5 = "ConnectType is not Mobile Network!"
            com.huawei.hms.framework.common.Logger.v(r0, r5)
            return r1
        L36:
            java.lang.String r5 = "readDataSaverMode Context is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r5)
            return r1
        L3c:
            java.lang.String r5 = "readDataSaverMode manager is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r5)
            return r1
    }

    public static int readPowerSaverMode(android.content.Context r4) {
            java.lang.String r0 = "PowerUtils"
            r1 = 0
            if (r4 == 0) goto L31
            android.content.ContentResolver r2 = r4.getContentResolver()
            java.lang.String r3 = "SmartModeStatus"
            int r2 = com.huawei.hms.framework.common.SettingUtil.getSystemInt(r2, r3, r1)
            if (r2 != 0) goto L30
            java.lang.String r3 = "power"
            java.lang.Object r4 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r4, r3)
            boolean r3 = r4 instanceof android.os.PowerManager
            if (r3 == 0) goto L1e
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 == 0) goto L30
            boolean r4 = r4.isPowerSaveMode()     // Catch: java.lang.RuntimeException -> L2a
            if (r4 == 0) goto L28
            r1 = 4
        L28:
            r2 = r1
            goto L30
        L2a:
            r4 = move-exception
            java.lang.String r1 = "dealType rethrowFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r0, r1, r4)
        L30:
            return r2
        L31:
            java.lang.String r4 = "readPowerSaverMode Context is null!"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
    }
}
