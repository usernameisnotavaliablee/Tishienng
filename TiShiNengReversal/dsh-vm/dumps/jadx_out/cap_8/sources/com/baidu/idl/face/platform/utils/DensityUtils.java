package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DensityUtils {
    private static final java.lang.String[] BUILD_MODELS = null;
    private static final float DOT_FIVE = 0.5f;
    private static final int PORTRAIT_DEGREE_270 = 270;
    private static final int PORTRAIT_DEGREE_90 = 90;

    static {
            java.lang.String r0 = "A862W"
            java.lang.String r1 = "V8526"
            java.lang.String r2 = "i700v"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.baidu.idl.face.platform.utils.DensityUtils.BUILD_MODELS = r0
            return
    }

    private DensityUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int dip2px(android.content.Context r0, float r1) {
            float r0 = getDensity(r0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static float getDensity(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            return r0
    }

    public static int getDensityDpi(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            return r0
    }

    public static int getDisplayHeight(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            return r0
    }

    public static int getDisplayWidth(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            return r0
    }

    public static int getPortraitDegree() {
            java.lang.String[] r0 = com.baidu.idl.face.platform.utils.DensityUtils.BUILD_MODELS
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            java.lang.String r4 = android.os.Build.MODEL
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L13
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L13:
            int r2 = r2 + 1
            goto L4
        L16:
            r0 = 90
            return r0
    }

    public static int px2dip(android.content.Context r0, float r1) {
            float r0 = getDensity(r0)
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static int sp2px(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static boolean supportCameraPortrait() {
            boolean r0 = com.baidu.idl.face.platform.utils.APIUtils.hasFroyo()
            if (r0 == 0) goto L12
            java.lang.String r0 = "GT-S5830i"
            java.lang.String r1 = android.os.Build.PRODUCT
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
