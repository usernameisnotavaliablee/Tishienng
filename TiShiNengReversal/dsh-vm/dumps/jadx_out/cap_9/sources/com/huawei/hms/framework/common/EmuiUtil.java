package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class EmuiUtil {
    public static final java.lang.String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    public static final java.lang.String EMUI_SDK_INT = "EMUI_SDK_INT";
    public static final java.lang.String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final java.lang.String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final java.lang.String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";
    private static final java.lang.String a = "com.huawei.android.os.BuildEx";
    private static final java.lang.String b = "KPMS_Util_Emui";
    private static final int c = 7;
    private static final int d = 8;
    private static final int e = 9;
    private static final int f = 10;
    private static final int g = 11;
    private static final int h = 14;
    private static final int i = 15;
    private static final int j = 17;
    private static final int k = -1;
    private static final int l = 30;
    private static final int m = 31;
    private static final int n = 40;
    private static final int o = 41;
    private static final int p = 50;
    private static final int q = 60;
    private static final int r = 81;
    private static final int s = 90;
    private static int t = -1;

    static {
            a()
            return
    }

    public EmuiUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a() {
            int r0 = getEMUIVersionCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getEmuiType emuiVersionCode="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "KPMS_Util_Emui"
            com.huawei.hms.framework.common.Logger.d(r2, r1)
            r1 = 17
            if (r0 < r1) goto L23
            r0 = 90
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L23:
            r1 = 15
            if (r0 < r1) goto L2c
            r0 = 81
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L2c:
            r1 = 14
            if (r0 < r1) goto L35
            r0 = 60
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L35:
            r1 = 11
            if (r0 < r1) goto L3e
            r0 = 50
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L3e:
            r1 = 10
            if (r0 < r1) goto L47
            r0 = 41
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L47:
            r1 = 9
            if (r0 < r1) goto L50
            r0 = 40
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L50:
            r1 = 8
            if (r0 < r1) goto L59
            r0 = 31
            com.huawei.hms.framework.common.EmuiUtil.t = r0
            goto L60
        L59:
            r1 = 7
            if (r0 < r1) goto L60
            r0 = 30
            com.huawei.hms.framework.common.EmuiUtil.t = r0
        L60:
            int r0 = com.huawei.hms.framework.common.EmuiUtil.t
            r1 = -1
            if (r0 != r1) goto L6a
            java.lang.String r0 = "emuiType is unkown"
            com.huawei.hms.framework.common.Logger.i(r2, r0)
        L6a:
            return
    }

    public static int getEMUIVersionCode() {
            java.lang.String r0 = "com.huawei.android.os.BuildEx$VERSION"
            java.lang.String r1 = "EMUI_SDK_INT"
            java.lang.Object r0 = com.huawei.hms.framework.common.ReflectionUtils.getStaticFieldObj(r0, r1)
            java.lang.String r1 = "KPMS_Util_Emui"
            if (r0 == 0) goto L19
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L13
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L13
            goto L1a
        L13:
            r0 = move-exception
            java.lang.String r2 = "getEMUIVersionCode ClassCastException:"
            com.huawei.hms.framework.common.Logger.e(r1, r2, r0)
        L19:
            r0 = 0
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "the emui version code is::"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.framework.common.Logger.d(r1, r2)
            return r0
    }

    public static boolean isEMUI() {
            r0 = -1
            int r1 = com.huawei.hms.framework.common.EmuiUtil.t
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static boolean isUpPVersion() {
            java.lang.String r0 = "KPMS_Util_Emui"
            r1 = 0
            java.lang.String r2 = "com.huawei.android.os.BuildEx"
            boolean r2 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r2)     // Catch: java.lang.Throwable -> L1c java.lang.NoSuchMethodError -> L22
            if (r2 == 0) goto L27
            java.lang.String r2 = "com.huawei.android.os.BuildEx$VERSION"
            boolean r2 = com.huawei.hms.framework.common.ReflectionUtils.checkCompatible(r2)     // Catch: java.lang.Throwable -> L1c java.lang.NoSuchMethodError -> L22
            if (r2 == 0) goto L27
            int r0 = com.huawei.android.os.BuildEx.VERSION.EMUI_SDK_INT     // Catch: java.lang.Throwable -> L1c java.lang.NoSuchMethodError -> L22
            r2 = 17
            if (r0 < r2) goto L1b
            r0 = 1
            return r0
        L1b:
            return r1
        L1c:
            java.lang.String r2 = "com.huawei.android.os.BuildEx.VERSION has other exception"
            com.huawei.hms.framework.common.Logger.d(r0, r2)
            goto L27
        L22:
            java.lang.String r2 = "no such method for com.huawei.android.os.BuildEx.VERSION"
            com.huawei.hms.framework.common.Logger.d(r0, r2)
        L27:
            java.lang.String r2 = "com.huawei.android.os.BuildEx : false"
            com.huawei.hms.framework.common.Logger.d(r0, r2)
            return r1
    }
}
