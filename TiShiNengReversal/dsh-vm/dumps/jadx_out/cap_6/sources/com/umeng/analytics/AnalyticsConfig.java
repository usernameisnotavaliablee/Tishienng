package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final java.lang.String DEBUG_KEY = "debugkey";
    public static final java.lang.String DEBUG_MODE_PERIOD = "sendaging";
    public static java.lang.String GPU_RENDERER = "";
    public static java.lang.String GPU_VENDER = "";
    public static final java.lang.String RTD_PERIOD = "period";
    public static final java.lang.String RTD_SP_FILE = null;
    public static final java.lang.String RTD_START_TIME = "startTime";
    static double[] a = null;
    private static java.lang.String b = null;
    private static java.lang.String c = null;
    private static java.lang.String d = null;
    private static int e = 0;
    public static boolean enable = true;
    private static java.lang.Object f = null;
    private static boolean g = false;
    private static java.lang.String h = null;
    public static long kContinueSessionMillis = 30000;
    public static java.lang.String mWrapperType;
    public static java.lang.String mWrapperVersion;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "rtd"
            java.lang.String r0 = r0.b(r1)
            com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.AnalyticsConfig.f = r0
            r0 = 0
            com.umeng.analytics.AnalyticsConfig.g = r0
            java.lang.String r0 = ""
            com.umeng.analytics.AnalyticsConfig.h = r0
            return
    }

    public AnalyticsConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(android.content.Context r0, int r1) {
            com.umeng.analytics.AnalyticsConfig.e = r1
            com.umeng.common.b r0 = com.umeng.common.b.a(r0)
            int r1 = com.umeng.analytics.AnalyticsConfig.e
            r0.a(r1)
            return
    }

    static void a(android.content.Context r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L12
            com.umeng.analytics.AnalyticsConfig.d = r2
            com.umeng.common.b r1 = com.umeng.common.b.a(r1)
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.d
            r1.a(r2)
            return
        L12:
            r1 = 0
            java.lang.String r2 = "\\|"
            java.lang.String r0 = "MobclickAgent.setSecret方法参数secretkey不能为null，也不能为空字符串。|secretkey参数必须是非空 字符串。"
            com.umeng.commonsdk.debug.UMLog.aq(r0, r1, r2)
            return
    }

    static void a(java.lang.String r0) {
            com.umeng.analytics.AnalyticsConfig.c = r0
            return
    }

    public static java.lang.String getAppkey(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r0)
            return r0
    }

    public static java.lang.String getChannel(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getChannel(r0)
            return r0
    }

    public static java.lang.String getGameSdkVersion(android.content.Context r1) {
            java.lang.String r1 = "com.umeng.analytics.game.GameSdkVersion"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "SDK_VERSION"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static double[] getLocation() {
            double[] r0 = com.umeng.analytics.AnalyticsConfig.a
            return r0
    }

    public static java.lang.String getRealTimeDebugKey() {
            java.lang.Object r0 = com.umeng.analytics.AnalyticsConfig.f
            monitor-enter(r0)
            java.lang.String r1 = com.umeng.analytics.AnalyticsConfig.h     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.lang.String getSecretKey(android.content.Context r1) {
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L12
            com.umeng.common.b r1 = com.umeng.common.b.a(r1)
            java.lang.String r1 = r1.c()
            com.umeng.analytics.AnalyticsConfig.d = r1
        L12:
            java.lang.String r1 = com.umeng.analytics.AnalyticsConfig.d
            return r1
    }

    public static int getVerticalType(android.content.Context r1) {
            int r0 = com.umeng.analytics.AnalyticsConfig.e
            if (r0 != 0) goto Le
            com.umeng.common.b r1 = com.umeng.common.b.a(r1)
            int r1 = r1.d()
            com.umeng.analytics.AnalyticsConfig.e = r1
        Le:
            int r1 = com.umeng.analytics.AnalyticsConfig.e
            return r1
    }

    public static boolean isRealTimeDebugMode() {
            java.lang.Object r0 = com.umeng.analytics.AnalyticsConfig.f
            monitor-enter(r0)
            boolean r1 = com.umeng.analytics.AnalyticsConfig.g     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void turnOffRealTimeDebug() {
            java.lang.Object r0 = com.umeng.analytics.AnalyticsConfig.f
            monitor-enter(r0)
            r1 = 0
            com.umeng.analytics.AnalyticsConfig.g = r1     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = ""
            com.umeng.analytics.AnalyticsConfig.h = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static void turnOnRealTimeDebug(java.util.Map<java.lang.String, java.lang.String> r2) {
            java.lang.Object r0 = com.umeng.analytics.AnalyticsConfig.f
            monitor-enter(r0)
            r1 = 1
            com.umeng.analytics.AnalyticsConfig.g = r1     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.String r1 = "debugkey"
            boolean r1 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.String r1 = "debugkey"
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b
            com.umeng.analytics.AnalyticsConfig.h = r2     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
    }
}
