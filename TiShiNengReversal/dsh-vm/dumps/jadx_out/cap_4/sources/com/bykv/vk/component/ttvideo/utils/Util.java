package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class Util {
    public static final java.lang.String BARND = null;
    public static final java.lang.String DEVICE = null;
    public static final java.lang.String DEVICE_DEBUG_INFO = null;
    public static final java.lang.String HARDWARE = null;
    public static final java.lang.String MANUFACTURER = null;
    public static final java.lang.String MODEL = null;
    public static final int SDK_INT = 0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            com.bykv.vk.component.ttvideo.utils.Util.SDK_INT = r0
            java.lang.String r1 = android.os.Build.DEVICE
            com.bykv.vk.component.ttvideo.utils.Util.DEVICE = r1
            java.lang.String r2 = android.os.Build.MANUFACTURER
            com.bykv.vk.component.ttvideo.utils.Util.MANUFACTURER = r2
            java.lang.String r3 = android.os.Build.MODEL
            com.bykv.vk.component.ttvideo.utils.Util.MODEL = r3
            java.lang.String r4 = android.os.Build.HARDWARE
            com.bykv.vk.component.ttvideo.utils.Util.HARDWARE = r4
            java.lang.String r4 = android.os.Build.BRAND
            com.bykv.vk.component.ttvideo.utils.Util.BARND = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ", "
            r4.append(r1)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.bykv.vk.component.ttvideo.utils.Util.DEVICE_DEBUG_INFO = r0
            return
    }

    public Util() {
            r0 = this;
            r0.<init>()
            return
    }
}
