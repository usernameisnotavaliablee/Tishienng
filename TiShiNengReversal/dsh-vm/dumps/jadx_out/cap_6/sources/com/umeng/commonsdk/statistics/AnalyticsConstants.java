package com.umeng.commonsdk.statistics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AnalyticsConstants {
    public static java.lang.String[] APPLOG_URL_LIST = null;
    public static final java.lang.String CFG_FIELD_KEY = "cfgfd";
    public static boolean CHECK_DEVICE = true;
    public static final java.lang.String LOG_TAG = "MobclickAgent";
    public static final java.lang.String OS = "Android";
    public static final java.lang.String SDK_TYPE = "Android";
    public static boolean SUB_PROCESS_EVENT = false;
    public static final boolean UM_DEBUG = false;
    public static final java.lang.String ZERO_RESPONSE_FLAG = "iscfg";
    private static int commonDeviceType;

    static {
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL
            java.lang.String r1 = com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.umeng.commonsdk.statistics.AnalyticsConstants.APPLOG_URL_LIST = r0
            boolean r0 = com.umeng.commonsdk.statistics.common.ULog.DEBUG
            com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG = r0
            r0 = 1
            com.umeng.commonsdk.statistics.AnalyticsConstants.commonDeviceType = r0
            return
    }

    public AnalyticsConstants() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized int getDeviceType() {
            java.lang.Class<com.umeng.commonsdk.statistics.AnalyticsConstants> r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.class
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.commonDeviceType     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void setDeviceType(int r0) {
            com.umeng.commonsdk.statistics.AnalyticsConstants.commonDeviceType = r0
            return
    }
}
