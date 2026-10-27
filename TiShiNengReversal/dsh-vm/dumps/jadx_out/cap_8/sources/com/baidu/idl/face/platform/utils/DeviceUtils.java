package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DeviceUtils {
    private static final java.lang.String TAG = "DeviceUtils";

    static {
            return
    }

    public DeviceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getAndroidID(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
            byte[] r0 = r1.getBytes()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = com.baidu.idl.face.platform.utils.MD5Utils.encryption(r0)     // Catch: java.lang.Exception -> L12
        L12:
            return r1
    }

    public static java.lang.String getDeviceCode(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Exception -> L17
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = r2.getDeviceId()     // Catch: java.lang.Exception -> L17
            byte[] r2 = r0.getBytes()     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = com.baidu.idl.face.platform.utils.MD5Utils.encryption(r2)     // Catch: java.lang.Exception -> L17
            return r2
        L17:
            return r0
    }

    public static java.lang.String getSerialNumber(android.content.Context r0) {
            java.lang.String r0 = android.os.Build.SERIAL
            return r0
    }

    public static java.lang.String getUUID() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
