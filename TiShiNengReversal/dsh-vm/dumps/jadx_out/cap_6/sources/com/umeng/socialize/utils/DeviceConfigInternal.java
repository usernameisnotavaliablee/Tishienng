package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DeviceConfigInternal {
    protected static final java.lang.String LOG_TAG = "DeviceConfig";
    private static final java.lang.String MOBILE_NETWORK = "2G/3G";
    protected static final java.lang.String UNKNOW = "Unknown";
    private static final java.lang.String WIFI = "Wi-Fi";
    public static android.content.Context context;
    private static java.lang.Object object;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.socialize.utils.DeviceConfigInternal.object = r0
            return
    }

    public DeviceConfigInternal() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkPermission(android.content.Context r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.checkPermission(r0, r1)
            return r0
    }

    public static java.lang.String getAndroidID(android.content.Context r1) {
            java.lang.String r0 = ""
            if (r1 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r1)
            if (r1 != 0) goto Lc
            return r0
        Lc:
            return r1
    }

    public static java.lang.String getAppVersion(java.lang.String r2, android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L11
            r1 = 0
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            return r0
    }

    public static java.lang.String getDeviceId(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceId(r0)
            return r0
    }

    public static java.lang.String getDeviceSN() {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSerial()
            if (r0 != 0) goto L8
            java.lang.String r0 = "unknown"
        L8:
            return r0
    }

    public static java.lang.String getMac(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r0)
            return r0
    }

    public static java.lang.String[] getNetworkAccessMode(android.content.Context r0) {
            java.lang.String[] r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r0)
            return r0
    }

    public static java.lang.String getOsVersion() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static java.lang.String getPackageName(android.content.Context r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public static boolean isAppInstalled(java.lang.String r3, android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = com.umeng.socialize.utils.DeviceConfigInternal.object
            monitor-enter(r1)
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            r2 = 1
            r4.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L13
            r0 = 1
            goto L13
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public static boolean isNetworkAvailable(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.umeng.socialize.utils.DeviceConfig.checkPermission(r2, r1)
            if (r1 == 0) goto L14
            boolean r2 = com.umeng.socialize.utils.DeviceConfig.isOnline(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            return r0
    }

    public static boolean isOnline(android.content.Context r0) {
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.isOnline(r0)
            return r0
    }
}
