package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l {
    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"SdCardPath"})
    private static java.lang.String a(@androidx.annotation.NonNull android.content.Context r2) {
            java.io.File r0 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r2)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto Lf
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r2)     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L36
            goto L33
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "/data/data/"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = r2.getPackageName()     // Catch: java.lang.Exception -> L36
            r0.append(r1)     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "/files/"
            r0.append(r1)     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L36
            r1 = 0
            java.io.File r2 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r2, r0, r1)     // Catch: java.lang.Exception -> L36
            if (r2 == 0) goto L32
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L36
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L3a
            return r2
        L36:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L3a:
            java.lang.String r2 = "/sdcard/"
            return r2
    }

    public static java.io.File b(@androidx.annotation.NonNull android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r2 = a(r2)
            java.lang.String r1 = "CrashLogJava"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String c() {
            long r0 = java.lang.System.nanoTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "java_%s.npth"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    public static java.io.File d(@androidx.annotation.NonNull android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r2 = a(r2)
            java.lang.String r1 = "crash_history"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String e() {
            long r0 = java.lang.System.nanoTime()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "anr_%s.npth"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }
}
