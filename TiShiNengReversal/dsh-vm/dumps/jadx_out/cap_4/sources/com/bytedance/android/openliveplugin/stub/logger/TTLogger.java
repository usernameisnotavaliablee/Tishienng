package com.bytedance.android.openliveplugin.stub.logger;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTLogger {
    private static boolean DEBUG = false;
    private static final java.lang.String TAG = "TTLiveLogger";
    private static int sLevel = 4;

    static {
            return
    }

    public TTLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r1) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "TTLiveLogger"
            d(r0, r1)
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r3 != 0) goto L8
            goto L10
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 3
            if (r0 > r1) goto L10
            com.bytedance.sdk.openadsdk.api.m.xt(r2, r3)
        L10:
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L12
        L5:
            if (r3 != 0) goto La
            if (r4 != 0) goto La
            goto L12
        La:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 3
            if (r0 > r1) goto L12
            com.bytedance.sdk.openadsdk.api.m.xt(r2, r3, r4)
        L12:
            return
    }

    public static void d(java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L14
        L5:
            if (r3 != 0) goto L8
            goto L14
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 3
            if (r0 > r1) goto L14
            java.lang.String r3 = formatMsgs(r3)
            com.bytedance.sdk.openadsdk.api.m.xt(r2, r3)
        L14:
            return
    }

    public static boolean debug() {
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 3
            if (r0 > r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static void e(java.lang.String r1) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "TTLiveLogger"
            e(r0, r1)
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r3 != 0) goto L8
            goto L10
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 6
            if (r0 > r1) goto L10
            com.bytedance.sdk.openadsdk.api.m.up(r2, r3)
        L10:
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L12
        L5:
            if (r3 != 0) goto La
            if (r4 != 0) goto La
            goto L12
        La:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 6
            if (r0 > r1) goto L12
            com.bytedance.sdk.openadsdk.api.m.up(r2, r3, r4)
        L12:
            return
    }

    public static void e(java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L14
        L5:
            if (r3 != 0) goto L8
            goto L14
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 6
            if (r0 > r1) goto L14
            java.lang.String r3 = formatMsgs(r3)
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3)
        L14:
            return
    }

    private static java.lang.String formatMsgs(java.lang.Object... r4) {
            if (r4 == 0) goto L2b
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L2b
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L26
            r3 = r4[r2]
            if (r3 == 0) goto L1b
            java.lang.String r3 = r3.toString()
        L17:
            r0.append(r3)
            goto L1e
        L1b:
            java.lang.String r3 = " null "
            goto L17
        L1e:
            java.lang.String r3 = " "
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L26:
            java.lang.String r4 = r0.toString()
            return r4
        L2b:
            java.lang.String r4 = ""
            return r4
    }

    public static int getLogLevel() {
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            return r0
    }

    private static java.lang.String getSimpleClassName(java.lang.String r1) {
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 >= 0) goto L9
            return r1
        L9:
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    public static void i(java.lang.String r1) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "TTLiveLogger"
            i(r0, r1)
            return
    }

    public static void i(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r3 != 0) goto L8
            goto L10
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 4
            if (r0 > r1) goto L10
            com.bytedance.sdk.openadsdk.api.m.cw(r2, r3)
        L10:
            return
    }

    public static void i(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L12
        L5:
            if (r3 != 0) goto La
            if (r4 != 0) goto La
            goto L12
        La:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 4
            if (r0 > r1) goto L12
            com.bytedance.sdk.openadsdk.api.m.cw(r2, r3, r4)
        L12:
            return
    }

    public static void i(java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L14
        L5:
            if (r3 != 0) goto L8
            goto L14
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 4
            if (r0 > r1) goto L14
            java.lang.String r3 = formatMsgs(r3)
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3)
        L14:
            return
    }

    public static boolean isDebug() {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            return r0
    }

    public static void logDirect(java.lang.String r0, java.lang.String r1) {
            if (r1 != 0) goto L3
            return
        L3:
            if (r0 != 0) goto L7
            java.lang.String r0 = "TTLiveLogger"
        L7:
            com.bytedance.sdk.openadsdk.api.m.cw(r0, r1)
            return
    }

    public static void openDebugMode() {
            r0 = 1
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG = r0
            r0 = 3
            setLogLevel(r0)
            return
    }

    public static void setLogLevel(int r0) {
            com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel = r0
            return
    }

    public static void st(java.lang.String r5, int r6) {
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L6
            r0.<init>()     // Catch: java.lang.Exception -> L6
            throw r0     // Catch: java.lang.Exception -> L6
        L6:
            r0 = move-exception
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            r3 = 1
        L12:
            int r4 = r0.length
            int r4 = java.lang.Math.min(r6, r4)
            if (r3 >= r4) goto L3e
            if (r3 <= r2) goto L20
            java.lang.String r4 = "\n"
            r1.append(r4)
        L20:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r4 = getSimpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            r4 = r0[r3]
            java.lang.String r4 = r4.getMethodName()
            r1.append(r4)
            int r3 = r3 + 1
            goto L12
        L3e:
            java.lang.String r6 = r1.toString()
            v(r5, r6)
            return
    }

    public static void v(java.lang.String r1) {
            java.lang.String r0 = "TTLiveLogger"
            v(r0, r1)
            return
    }

    public static void v(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r3 != 0) goto L8
            goto L10
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 2
            if (r0 > r1) goto L10
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3)
        L10:
            return
    }

    public static void v(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L12
        L5:
            if (r3 != 0) goto La
            if (r4 != 0) goto La
            goto L12
        La:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 2
            if (r0 > r1) goto L12
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3, r4)
        L12:
            return
    }

    public static void v(java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L14
        L5:
            if (r3 != 0) goto L8
            goto L14
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 2
            if (r0 > r1) goto L14
            java.lang.String r3 = formatMsgs(r3)
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3)
        L14:
            return
    }

    public static void w(java.lang.String r1) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "TTLiveLogger"
            w(r0, r1)
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r3 != 0) goto L8
            goto L10
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 5
            if (r0 > r1) goto L10
            com.bytedance.sdk.openadsdk.api.m.r(r2, r3)
        L10:
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L12
        L5:
            if (r3 != 0) goto La
            if (r4 != 0) goto La
            goto L12
        La:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 5
            if (r0 > r1) goto L12
            com.bytedance.sdk.openadsdk.api.m.r(r2, r3, r4)
        L12:
            return
    }

    public static void w(java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.DEBUG
            if (r0 != 0) goto L5
            goto L14
        L5:
            if (r3 != 0) goto L8
            goto L14
        L8:
            int r0 = com.bytedance.android.openliveplugin.stub.logger.TTLogger.sLevel
            r1 = 5
            if (r0 > r1) goto L14
            java.lang.String r3 = formatMsgs(r3)
            com.bytedance.sdk.openadsdk.api.m.j(r2, r3)
        L14:
            return
    }
}
