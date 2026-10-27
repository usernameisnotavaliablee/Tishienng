package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SettingUtil {
    private static final java.lang.String a = "SettingUtil";

    public SettingUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSecureInt(android.content.ContentResolver r1, java.lang.String r2, int r3) {
            int r1 = android.provider.Settings.Secure.getInt(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.String r2 = "SettingUtil"
            java.lang.String r0 = "Settings Secure getInt throwFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r2, r0, r1)
            return r3
    }

    public static int getSystemInt(android.content.ContentResolver r1, java.lang.String r2, int r3) {
            int r1 = android.provider.Settings.System.getInt(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.String r2 = "SettingUtil"
            java.lang.String r0 = "Settings System getInt throwFromSystemServer:"
            com.huawei.hms.framework.common.Logger.e(r2, r0, r1)
            return r3
    }
}
