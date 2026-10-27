package com.bykv.vk.component.ttvideo.log;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MyLog {
    private static final boolean DEBUG = false;
    private static final boolean INFO = true;

    private MyLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            return
    }

    public static void t(java.lang.String r5, java.lang.String r6) {
            if (r5 == 0) goto L36
            int r0 = r5.length()
            if (r0 == 0) goto L36
            if (r6 == 0) goto L36
            int r0 = r6.length()
            if (r0 != 0) goto L11
            goto L36
        L11:
            int r0 = r6.length()
            long r0 = (long) r0
            r2 = 3072(0xc00, double:1.518E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
        L1c:
            int r0 = r6.length()
            r1 = 3072(0xc00, float:4.305E-42)
            if (r0 <= r1) goto L33
            r0 = 0
            java.lang.String r0 = r6.substring(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r0, r1)
            com.bytedance.sdk.component.utils.vl.r(r5, r0)
            goto L1c
        L33:
            com.bytedance.sdk.component.utils.vl.r(r5, r6)
        L36:
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1) {
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            return
    }
}
