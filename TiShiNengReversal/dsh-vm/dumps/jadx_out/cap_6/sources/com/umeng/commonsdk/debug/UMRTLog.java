package com.umeng.commonsdk.debug;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMRTLog {
    private static final java.lang.String RTLOG_ENABLE = "1";
    private static final java.lang.String RTLOG_PROP = "debug.umeng.rtlog";
    public static final java.lang.String RTLOG_TAG = "MobclickRT";

    private UMRTLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 0
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 0
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 0
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void sd(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 1
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void se(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 1
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void si(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 1
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void sv(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 1
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void sw(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 1
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void v(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 0
            warpperMsg(r1, r0)
        La:
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutput()
            if (r0 == 0) goto La
            r0 = 0
            warpperMsg(r1, r0)
        La:
            return
    }

    private static java.lang.String warpperMsg(java.lang.String r5, boolean r6) {
            java.lang.String r0 = ":"
            if (r6 != 0) goto L5
            goto L4c
        L5:
            java.lang.Throwable r6 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L4c
            r6.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch: java.lang.Throwable -> L4c
            int r1 = r6.length     // Catch: java.lang.Throwable -> L4c
            r2 = 3
            if (r1 < r2) goto L47
            r1 = 2
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r2.getFileName()     // Catch: java.lang.Throwable -> L4c
            r3 = r6[r1]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.getMethodName()     // Catch: java.lang.Throwable -> L4c
            r6 = r6[r1]     // Catch: java.lang.Throwable -> L4c
            int r6 = r6.getLineNumber()     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "<"
            r1.append(r4)     // Catch: java.lang.Throwable -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            r1.append(r3)     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            r1.append(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "> "
            r1.append(r6)     // Catch: java.lang.Throwable -> L4c
            r1.append(r5)     // Catch: java.lang.Throwable -> L4c
            goto L48
        L47:
            r1 = 0
        L48:
            java.lang.String r5 = r1.toString()
        L4c:
            return r5
    }
}
