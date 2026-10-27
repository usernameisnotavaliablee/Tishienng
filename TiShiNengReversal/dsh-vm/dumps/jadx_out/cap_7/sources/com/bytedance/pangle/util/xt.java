package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static java.lang.String j;

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r2) {
            java.lang.String r0 = com.bytedance.pangle.util.xt.j
            if (r0 != 0) goto L34
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.sourceDir
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String[] r2 = com.bytedance.pangle.util.cw.j(r0)
            r0 = 0
            r0 = r2[r0]
            com.bytedance.pangle.util.xt.j = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getHostIdentity failed. Reason: "
            r0.<init>(r1)
            r1 = 2
            r2 = r2[r1]
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "Zeus/init_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r2)
        L34:
            java.lang.String r2 = com.bytedance.pangle.util.xt.j
            return r2
    }

    public static boolean j() {
            r0 = 0
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L10
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Exception -> L10
            int r1 = r1.flags     // Catch: java.lang.Exception -> L10
            r1 = r1 & 2
            if (r1 == 0) goto L10
            r0 = 1
        L10:
            return r0
    }
}
