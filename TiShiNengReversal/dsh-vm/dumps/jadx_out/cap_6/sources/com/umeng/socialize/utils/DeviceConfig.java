package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DeviceConfig {
    public DeviceConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkPermission(android.content.Context r0, java.lang.String r1) {
            boolean r0 = com.umeng.socialize.utils.DeviceConfigInternal.checkPermission(r0, r1)
            return r0
    }

    public static java.lang.String getAndroidID(android.content.Context r0) {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getAndroidID(r0)
            return r0
    }

    public static java.lang.String getAppVersion(java.lang.String r0, android.content.Context r1) {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getAppVersion(r0, r1)
            return r0
    }

    public static java.lang.String getDeviceId(android.content.Context r0) {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getDeviceId(r0)
            return r0
    }

    public static java.lang.String getDeviceSN() {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getDeviceSN()
            return r0
    }

    public static java.lang.String getMac(android.content.Context r0) {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getMac(r0)
            return r0
    }

    public static java.lang.String[] getNetworkAccessMode(android.content.Context r0) {
            java.lang.String[] r0 = com.umeng.socialize.utils.DeviceConfigInternal.getNetworkAccessMode(r0)
            return r0
    }

    public static java.lang.String getOsVersion() {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getOsVersion()
            return r0
    }

    public static java.lang.String getPackageName(android.content.Context r0) {
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfigInternal.getPackageName(r0)
            return r0
    }

    public static boolean hasFineLocationPermissionInQ(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 <= r1) goto Ld
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = checkPermission(r2, r0)
            return r2
        Ld:
            r2 = 1
            return r2
    }

    public static boolean isAppInstalled(java.lang.String r0, android.content.Context r1) {
            boolean r0 = com.umeng.socialize.utils.DeviceConfigInternal.isAppInstalled(r0, r1)
            return r0
    }

    public static boolean isNetworkAvailable(android.content.Context r0) {
            boolean r0 = com.umeng.socialize.utils.DeviceConfigInternal.isNetworkAvailable(r0)
            return r0
    }

    public static boolean isOnline(android.content.Context r0) {
            boolean r0 = com.umeng.socialize.utils.DeviceConfigInternal.isOnline(r0)
            return r0
    }
}
