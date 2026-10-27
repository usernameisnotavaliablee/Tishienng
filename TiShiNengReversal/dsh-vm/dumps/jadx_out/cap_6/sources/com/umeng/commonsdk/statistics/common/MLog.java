package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MLog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static java.lang.String TAG = "MobclickAgent";

    static {
            return
    }

    private MLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            d(r0, r2, r1)
            return
    }

    public static void d(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8
            r0 = 2
            print(r0, r1, r2, r3)
        L8:
            return
    }

    public static void d(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            d(r0, r1, r2)
            return
    }

    public static void d(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Formatter r3 = r0.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L2a
            d(r4, r3, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L1e:
            if (r4 == 0) goto L26
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a
        L26:
            d(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            e(r3)
            return
    }

    public static void d(java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            d(r0, r1, r2)
            return
    }

    public static void d(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Formatter r1 = r0.format(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L14
            r3 = 0
            d(r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            e(r1)
            return
    }

    public static void e(java.lang.String r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            e(r0, r2, r1)
            return
    }

    public static void e(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8
            r0 = 5
            print(r0, r1, r2, r3)
        L8:
            return
    }

    public static void e(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            e(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Formatter r3 = r0.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L2a
            e(r4, r3, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L1e:
            if (r4 == 0) goto L26
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a
        L26:
            e(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            e(r3)
            return
    }

    public static void e(java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            e(r0, r1, r2)
            return
    }

    public static void e(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Formatter r1 = r0.format(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L14
            r3 = 0
            e(r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            e(r1)
            return
    }

    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L22
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L1f
            r2.flush()     // Catch: java.lang.Throwable -> L1f
            r1.flush()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            r1.close()     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2.close()
            goto L35
        L1f:
        L20:
            r0 = r1
            goto L27
        L22:
            r2 = r0
            goto L20
        L25:
            r2 = r0
        L27:
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
        L2e:
            if (r2 == 0) goto L33
            r2.close()
        L33:
            java.lang.String r3 = ""
        L35:
            return r3
    }

    public static void i(java.lang.String r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            i(r0, r2, r1)
            return
    }

    public static void i(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8
            r0 = 3
            print(r0, r1, r2, r3)
        L8:
            return
    }

    public static void i(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            i(r0, r1, r2)
            return
    }

    public static void i(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Formatter r3 = r0.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L2a
            i(r4, r3, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L1e:
            if (r4 == 0) goto L26
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a
        L26:
            i(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            e(r3)
            return
    }

    public static void i(java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            i(r0, r1, r2)
            return
    }

    public static void i(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Formatter r1 = r0.format(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L14
            r3 = 0
            i(r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            e(r1)
            return
    }

    private static void print(int r9, java.lang.String r10, java.lang.String r11, java.lang.Throwable r12) {
            boolean r10 = android.text.TextUtils.isEmpty(r11)
            if (r10 != 0) goto L5e
            int r10 = r11.length()
            int r0 = com.umeng.commonsdk.statistics.common.MLog.LOG_MAXLENGTH
            r1 = 0
            r2 = 0
        Le:
            r3 = 100
            if (r1 >= r3) goto L5e
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r10 <= r0) goto L40
            if (r9 == r7) goto L34
            if (r9 == r6) goto L30
            if (r9 == r5) goto L2c
            if (r9 == r4) goto L28
            if (r9 == r3) goto L24
            goto L37
        L24:
            r11.substring(r2, r0)
            goto L37
        L28:
            r11.substring(r2, r0)
            goto L37
        L2c:
            r11.substring(r2, r0)
            goto L37
        L30:
            r11.substring(r2, r0)
            goto L37
        L34:
            r11.substring(r2, r0)
        L37:
            int r2 = com.umeng.commonsdk.statistics.common.MLog.LOG_MAXLENGTH
            int r2 = r2 + r0
            int r1 = r1 + 1
            r8 = r2
            r2 = r0
            r0 = r8
            goto Le
        L40:
            if (r9 == r7) goto L5b
            if (r9 == r6) goto L57
            if (r9 == r5) goto L53
            if (r9 == r4) goto L4f
            if (r9 == r3) goto L4b
            goto L5e
        L4b:
            r11.substring(r2, r10)
            goto L5e
        L4f:
            r11.substring(r2, r10)
            goto L5e
        L53:
            r11.substring(r2, r10)
            goto L5e
        L57:
            r11.substring(r2, r10)
            goto L5e
        L5b:
            r11.substring(r2, r10)
        L5e:
            if (r12 == 0) goto L67
            java.lang.String r9 = getStackTrace(r12)
            android.text.TextUtils.isEmpty(r9)
        L67:
            return
    }

    public static void v(java.lang.String r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            v(r0, r2, r1)
            return
    }

    public static void v(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8
            r0 = 1
            print(r0, r1, r2, r3)
        L8:
            return
    }

    public static void v(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            v(r0, r1, r2)
            return
    }

    public static void v(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Formatter r3 = r0.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L2a
            v(r4, r3, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L1e:
            if (r4 == 0) goto L26
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a
        L26:
            v(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            e(r3)
            return
    }

    public static void v(java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            v(r0, r1, r2)
            return
    }

    public static void v(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Formatter r1 = r0.format(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L14
            r3 = 0
            v(r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            e(r1)
            return
    }

    public static void w(java.lang.String r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            w(r0, r2, r1)
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8
            r0 = 4
            print(r0, r1, r2, r3)
        L8:
            return
    }

    public static void w(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            w(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = ""
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Formatter r3 = r0.format(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L2a
            w(r4, r3, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L1e:
            if (r4 == 0) goto L26
            r0 = 0
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a
        L26:
            w(r3, r0, r2)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            e(r3)
            return
    }

    public static void w(java.lang.Throwable r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.MLog.TAG
            r1 = 0
            w(r0, r1, r2)
            return
    }

    public static void w(java.util.Locale r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.Formatter r0 = new java.util.Formatter     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Formatter r1 = r0.format(r2, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.MLog.TAG     // Catch: java.lang.Throwable -> L14
            r3 = 0
            w(r2, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            e(r1)
            return
    }
}
