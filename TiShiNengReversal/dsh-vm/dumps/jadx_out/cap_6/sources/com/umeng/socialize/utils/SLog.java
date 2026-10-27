package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SLog {
    private static boolean DEBUG = true;
    private static final int E = 0;
    private static final int I = 2;
    private static final java.lang.String PRIVATE = "priviteSocial";
    private static final java.lang.String TAG = "Social";

    static {
            return
    }

    public SLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void AQ(java.lang.String r2, java.lang.String r3) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r0 = "Social"
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.aq(r0, r1, r2, r3)
            return
    }

    public static void BUNDLE(android.os.Bundle r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto La
            java.lang.String r0 = "Social"
            r1 = 2
            com.umeng.commonsdk.debug.UMLog.bundle(r0, r1, r2)
        La:
            return
    }

    public static void E(java.lang.String r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L12
            java.lang.String r0 = "\n"
            java.lang.String[] r2 = r2.split(r0)
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r0 = "Social"
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r1, r2)
        L12:
            return
    }

    public static void I(java.lang.String r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L12
            java.lang.String r0 = "\n"
            java.lang.String[] r2 = r2.split(r0)
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r0 = "Social"
            r1 = 2
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r1, r2)
        L12:
            return
    }

    public static void JARRY(org.json.JSONArray r1) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L9
            java.lang.String r0 = "Social"
            com.umeng.commonsdk.debug.UMLog.jsonArry(r0, r1)
        L9:
            return
    }

    public static void JSON(org.json.JSONObject r1) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L9
            java.lang.String r0 = "Social"
            com.umeng.commonsdk.debug.UMLog.jsonObject(r0, r1)
        L9:
            return
    }

    public static void TE(java.lang.String r2, java.lang.String r3) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L21
            java.lang.String r0 = "\n"
            java.lang.String[] r3 = r3.split(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Social_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            r0 = 0
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r0, r3)
        L21:
            return
    }

    public static void TI(java.lang.String r2, java.lang.String r3) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L21
            java.lang.String r0 = "\n"
            java.lang.String[] r3 = r3.split(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Social_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            r0 = 2
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r0, r3)
        L21:
            return
    }

    public static void debug(java.lang.String r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L1f
            boolean r0 = com.umeng.socialize.utils.SLog.DEBUG
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[private log]  "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "priviteSocial"
            r1 = 2
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r1, r2)
        L1f:
            return
    }

    public static void error(java.lang.String r8, java.lang.Throwable r9) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L52
            if (r9 == 0) goto L52
            java.lang.StackTraceElement[] r0 = r9.getStackTrace()
            int r1 = r0.length
            r2 = 2
            int r1 = r1 + r2
            java.lang.String[] r1 = new java.lang.String[r1]
            r3 = 0
            r1[r3] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "错误类型:"
            r8.append(r4)
            java.lang.String r9 = r9.getMessage()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = 1
            r1[r9] = r8
            int r8 = r0.length
            r4 = 0
        L2c:
            if (r4 >= r8) goto L4b
            r5 = r0[r4]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "        at\t "
            r6.append(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1[r2] = r5
            int r2 = r2 + r9
            int r4 = r4 + 1
            goto L2c
        L4b:
            com.umeng.commonsdk.debug.UMLog r8 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r8 = "Social"
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r8, r3, r1)
        L52:
            return
    }

    public static void error(java.lang.Throwable r9) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L52
            java.lang.StackTraceElement[] r0 = r9.getStackTrace()
            int r1 = r0.length
            r2 = 2
            int r1 = r1 + r2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r3 = "错误信息如下:"
            r4 = 0
            r1[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "错误类型:"
            r3.append(r5)
            java.lang.String r9 = r9.getMessage()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r3 = 1
            r1[r3] = r9
            int r9 = r0.length
            r5 = 0
        L2c:
            if (r5 >= r9) goto L4b
            r6 = r0[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "        at\t "
            r7.append(r8)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r1[r2] = r6
            int r2 = r2 + r3
            int r5 = r5 + 1
            goto L2c
        L4b:
            com.umeng.commonsdk.debug.UMLog r9 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r9 = "Social"
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r9, r4, r1)
        L52:
            return
    }

    public static boolean isDebug() {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto L9
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static void mutlE(java.lang.String... r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            java.lang.String r0 = "Social"
            r1 = 0
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r1, r2)
            return
    }

    public static void mutlI(java.lang.String... r2) {
            com.umeng.commonsdk.debug.UMLog r0 = com.umeng.commonsdk.UMConfigure.umDebugLog
            if (r0 == 0) goto La
            java.lang.String r0 = "Social"
            r1 = 2
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r1, r2)
        La:
            return
    }

    public static void runtimePrint(java.lang.String r1) {
            java.lang.String r0 = "priviteSocial"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            return
    }

    public static void selfLog(java.lang.String r0) {
            return
    }

    public static void welcome() {
            com.umeng.commonsdk.UMConfigure.isDebugLog()
            return
    }
}
