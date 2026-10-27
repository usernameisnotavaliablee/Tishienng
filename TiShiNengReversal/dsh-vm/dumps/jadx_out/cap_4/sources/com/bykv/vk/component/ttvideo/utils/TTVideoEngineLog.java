package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTVideoEngineLog {
    public static final java.lang.String FORMAT = "<%s>%s";
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 6;
    public static final int LOG_INFO = 2;
    public static final int LOG_KILL = 4;
    public static final int LOG_TRACK = 3;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARN = 5;
    public static int LogNotifyLevel = 116;
    public static int LogTurnOn = 112;
    public static com.bykv.vk.component.ttvideo.utils.TTVideoEngineLogListener mListener;

    static {
            return
    }

    public TTVideoEngineLog() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(java.lang.String r3, java.lang.String r4) {
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLogListener r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.mListener
            if (r0 == 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L30
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLogListener r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.mListener
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TTVideoEngine: tag = "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ";  "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "\n"
            r1.append(r3)
            java.lang.String r4 = r1.toString()
        L2d:
            r0.consoleLog(r4)
        L30:
            return
    }

    public static final void d(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            r1 = 1
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto La
            a(r3, r4)
        La:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto L1d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String.format(r3, r0)
        L1d:
            return
    }

    public static void d(java.lang.Throwable r2) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            r1 = 1
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto La
            com.bytedance.sdk.component.utils.vl.j(r2)
        La:
            return
    }

    public static void e(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            int r0 = r0 >> 6
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            a(r3, r4)
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> 6
            r0 = r0 & r1
            if (r0 != r1) goto L25
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "TTVideoEngineLog"
            com.bytedance.sdk.component.utils.vl.r(r4, r3)
        L25:
            return
    }

    public static final void i(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            r1 = 2
            int r0 = r0 >> r1
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto Lb
            a(r3, r4)
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> r1
            r0 = r0 & r2
            if (r0 != r2) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r3
            r0[r2] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "TTVideoEngineLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L23:
            return
    }

    public static final void k(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            int r0 = r0 >> 4
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            a(r3, r4)
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> 4
            r0 = r0 & r1
            if (r0 != r1) goto L25
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "TTVideoEngineLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L25:
            return
    }

    public static final void setListener(com.bykv.vk.component.ttvideo.utils.TTVideoEngineLogListener r0) {
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.mListener = r0
            return
    }

    public static final void setLogNotifyLevel(int r2, int r3) {
            r0 = 1
            int r0 = r0 << r2
            int r0 = ~r0
            int r1 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            r0 = r0 & r1
            int r2 = r3 << r2
            r2 = r2 | r0
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel = r2
            return
    }

    public static final void t(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            int r0 = r0 >> 3
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            a(r3, r4)
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> 3
            r0 = r0 & r1
            if (r0 != r1) goto L25
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "TTVideoEngineLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L25:
            return
    }

    public static final void turnOn(int r3, int r4) {
            r0 = 1
            int r1 = r0 << r3
            int r1 = ~r1
            int r2 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            r1 = r1 & r2
            int r2 = r4 << r3
            r1 = r1 | r2
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn = r1
            if (r3 != r0) goto L17
            if (r4 != r0) goto L17
            r3 = r1 & (-5)
            int r4 = r4 << 2
            r3 = r3 | r4
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn = r3
        L17:
            return
    }

    public static final void w(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogNotifyLevel
            int r0 = r0 >> 5
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Lb
            a(r3, r4)
        Lb:
            int r0 = com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.LogTurnOn
            int r0 = r0 >> 5
            r0 = r0 & r1
            if (r0 != r1) goto L25
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "TTVideoEngineLog"
            com.bytedance.sdk.component.utils.vl.xt(r4, r3)
        L25:
            return
    }
}
