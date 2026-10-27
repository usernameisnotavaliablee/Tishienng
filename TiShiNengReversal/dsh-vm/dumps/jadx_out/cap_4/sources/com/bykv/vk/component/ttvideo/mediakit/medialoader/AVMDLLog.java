package com.bykv.vk.component.ttvideo.mediakit.medialoader;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AVMDLLog {
    public static final java.lang.String FORMAT = "<%s>%s";
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 6;
    public static final int LOG_INFO = 2;
    public static final int LOG_KILL = 4;
    public static final int LOG_TRACK = 3;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARN = 5;
    public static int LogTurnOn = 112;
    private static final java.lang.String TAG = "AVMDLLog";

    static {
            return
    }

    public AVMDLLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void d(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            r1 = 1
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto L14
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String.format(r3, r0)
        L14:
            return
    }

    public static void e(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            int r0 = r0 >> 6
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "AVMDLLog"
            com.bytedance.sdk.component.utils.vl.r(r4, r3)
        L1b:
            return
    }

    public static final void i(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            r1 = 2
            int r0 = r0 >> r1
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto L1a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r3
            r0[r2] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "AVMDLLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L1a:
            return
    }

    public static final void k(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            int r0 = r0 >> 4
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "AVMDLLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L1b:
            return
    }

    public static final void t(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            int r0 = r0 >> 3
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "AVMDLLog"
            com.bytedance.sdk.component.utils.vl.j(r4, r3)
        L1b:
            return
    }

    public static final void turnOn(int r2, int r3) {
            r0 = 1
            int r0 = r0 << r2
            int r0 = ~r0
            int r1 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            r0 = r0 & r1
            int r2 = r3 << r2
            r2 = r2 | r0
            com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn = r2
            return
    }

    public static final void w(java.lang.String r3, java.lang.String r4) {
            int r0 = com.bykv.vk.component.ttvideo.mediakit.medialoader.AVMDLLog.LogTurnOn
            int r0 = r0 >> 5
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L1b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r3
            r0[r1] = r4
            java.lang.String r3 = "<%s>%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r4 = "AVMDLLog"
            com.bytedance.sdk.component.utils.vl.xt(r4, r3)
        L1b:
            return
    }
}
