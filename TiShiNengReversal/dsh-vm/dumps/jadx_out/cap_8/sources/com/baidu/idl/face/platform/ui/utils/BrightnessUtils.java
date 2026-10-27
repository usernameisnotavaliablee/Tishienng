package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BrightnessUtils {
    private static final java.lang.String TAG = "BrightnessUtils";

    public BrightnessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getScreenBrightness(android.app.Activity r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "screen_brightness"
            int r1 = android.provider.Settings.System.getInt(r1, r0)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean isAutoBrightness(android.content.ContentResolver r2) {
            r0 = 0
            java.lang.String r1 = "screen_brightness_mode"
            int r2 = android.provider.Settings.System.getInt(r2, r1)     // Catch: android.provider.Settings.SettingNotFoundException -> Lb
            r1 = 1
            if (r2 != r1) goto Lb
            return r1
        Lb:
            return r0
    }

    public static void saveBrightness(android.content.ContentResolver r2, int r3) {
            java.lang.String r0 = "screen_brightness"
            android.net.Uri r1 = android.provider.Settings.System.getUriFor(r0)
            android.provider.Settings.System.putInt(r2, r0, r3)
            r3 = 0
            r2.notifyChange(r1, r3)
            return
    }

    public static void setBrightness(android.app.Activity r2, int r3) {
            android.view.Window r0 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            float r3 = (float) r3
            r1 = 998277249(0x3b808081, float:0.003921569)
            float r3 = r3 * r1
            r0.screenBrightness = r3
            android.view.Window r2 = r2.getWindow()
            r2.setAttributes(r0)
            return
    }

    public static void startAutoBrightness(android.app.Activity r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "screen_brightness_mode"
            r1 = 1
            android.provider.Settings.System.putInt(r2, r0, r1)
            return
    }

    public static void stopAutoBrightness(android.app.Activity r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "screen_brightness_mode"
            r1 = 0
            android.provider.Settings.System.putInt(r2, r0, r1)
            return
    }
}
