package com.bytedance.pangle.log;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ZeusLogger {
    public static final java.lang.String TAG = "Zeus_pangle";
    public static final java.lang.String TAG_ACTIVITY = "Zeus/activity_pangle";
    public static final java.lang.String TAG_DOWNLOAD = "Zeus/download_pangle";
    public static final java.lang.String TAG_INIT = "Zeus/init_pangle";
    public static final java.lang.String TAG_INSTALL = "Zeus/install_pangle";
    public static final java.lang.String TAG_LOAD = "Zeus/load_pangle";
    public static final java.lang.String TAG_PAM = "Zeus/pam_pangle";
    public static final java.lang.String TAG_PPM = "Zeus/ppm_pangle";
    public static final java.lang.String TAG_PROVIDER = "Zeus/provider_pangle";
    public static final java.lang.String TAG_RECEIVER = "Zeus/receiver_pangle";
    public static final java.lang.String TAG_REPORTER = "Zeus/reporter_pangle";
    public static final java.lang.String TAG_RESOURCES = "Zeus/resources_pangle";
    public static final java.lang.String TAG_SERVER = "Zeus/server_pangle";
    public static final java.lang.String TAG_SERVICE = "Zeus/service_pangle";
    public static final java.lang.String TAG_SO = "Zeus/so_pangle";
    private static boolean sDebug = true;
    private static boolean sEnableTrace;

    static {
            return
    }

    public ZeusLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r1) {
            r0 = 0
            d(r0, r1)
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            i(r0, r1)
            return
    }

    public static void errReport(java.lang.String r4, java.lang.String r5) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r3, r2)
            java.lang.StackTraceElement[] r1 = (java.lang.StackTraceElement[]) r1
            r0.setStackTrace(r1)
            r1 = 0
            errReport(r4, r5, r0, r1)
            return
    }

    public static void errReport(java.lang.String r1, java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r0 = 1
            errReport(r1, r2, r3, r0)
            return
    }

    private static void errReport(java.lang.String r3, java.lang.String r4, @androidx.annotation.NonNull java.lang.Throwable r5, boolean r6) {
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = " ; "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.saveRecord(r3, r1)
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            r1 = 0
            if (r0 == 0) goto L2c
            if (r6 == 0) goto L27
            goto L28
        L27:
            r5 = r1
        L28:
            com.bytedance.sdk.openadsdk.api.m.up(r3, r4, r5)
            return
        L2c:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r0 == 0) goto L45
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r6 == 0) goto L41
            goto L42
        L41:
            r5 = r1
        L42:
            r0.e(r3, r4, r5)
        L45:
            return
    }

    private static java.lang.String getTraceInfo() {
            java.lang.String r0 = "\t\t[No Trace Info]"
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Exception -> L24
            r1.<init>()     // Catch: java.lang.Exception -> L24
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Exception -> L24
            r2 = 1
        Lc:
            int r3 = r1.length     // Catch: java.lang.Exception -> L24
            if (r2 >= r3) goto L29
            r3 = r1[r2]     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.Exception -> L24
            java.lang.Class<com.bytedance.pangle.log.ZeusLogger> r4 = com.bytedance.pangle.log.ZeusLogger.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L24
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch: java.lang.Exception -> L24
            if (r3 != 0) goto L26
            r1 = r1[r2]     // Catch: java.lang.Exception -> L24
            goto L2a
        L24:
            r1 = move-exception
            goto L44
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = "\t\t["
            r2.<init>(r3)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L24
            r2.append(r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "]"
            r2.append(r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L24
        L43:
            return r0
        L44:
            com.bytedance.sdk.openadsdk.api.m.j(r1)
            return r0
    }

    public static void i(java.lang.String r1) {
            r0 = 0
            i(r0, r1)
            return
    }

    public static void i(java.lang.String r1, java.lang.String r2) {
            java.lang.String r2 = prefixTraceInfo(r2)
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            r0.saveRecord(r1, r2)
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            if (r0 == 0) goto L17
            com.bytedance.sdk.openadsdk.api.m.cw(r1, r2)
            return
        L17:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r0 == 0) goto L2c
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            r0.i(r1, r2)
        L2c:
            return
    }

    public static boolean isDebug() {
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            return r0
    }

    public static boolean isEnableTrace() {
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sEnableTrace
            return r0
    }

    private static java.lang.String prefixTraceInfo(java.lang.String r1) {
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sEnableTrace
            if (r0 == 0) goto L17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = getTraceInfo()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L17:
            return r1
    }

    public static void setDebug(boolean r0) {
            com.bytedance.pangle.log.ZeusLogger.sDebug = r0
            return
    }

    public static void setEnableTrace(boolean r0) {
            com.bytedance.pangle.log.ZeusLogger.sEnableTrace = r0
            return
    }

    public static void v(java.lang.String r1) {
            r0 = 0
            v(r0, r1)
            return
    }

    public static void v(java.lang.String r1, java.lang.String r2) {
            java.lang.String r2 = prefixTraceInfo(r2)
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            r0.saveRecord(r1, r2)
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            if (r0 == 0) goto L17
            com.bytedance.sdk.openadsdk.api.m.j(r1, r2)
            return
        L17:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r0 == 0) goto L2c
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            r0.v(r1, r2)
        L2c:
            return
    }

    public static void w(java.lang.String r1) {
            r0 = 0
            w(r0, r1)
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2) {
            java.lang.String r2 = prefixTraceInfo(r2)
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            r0.saveRecord(r1, r2)
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            if (r0 == 0) goto L17
            com.bytedance.sdk.openadsdk.api.m.r(r1, r2)
            return
        L17:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r0 == 0) goto L2c
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            r0.w(r1, r2)
        L2c:
            return
    }

    public static void w(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            java.lang.String r4 = prefixTraceInfo(r4)
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = " ; "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.saveRecord(r3, r1)
            boolean r0 = com.bytedance.pangle.log.ZeusLogger.sDebug
            if (r0 == 0) goto L2b
            com.bytedance.sdk.openadsdk.api.m.r(r3, r4, r5)
            return
        L2b:
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            if (r0 == 0) goto L40
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusLogger r0 = r0.getLogger()
            r0.w(r3, r4, r5)
        L40:
            return
    }
}
