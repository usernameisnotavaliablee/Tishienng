package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class oq {
    public oq() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean j(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L28
            r1 = 4
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch: java.lang.Throwable -> L28
            android.content.pm.ServiceInfo[] r4 = r4.services     // Catch: java.lang.Throwable -> L28
            int r5 = r4.length     // Catch: java.lang.Throwable -> L28
            r1 = 0
        Le:
            if (r1 >= r5) goto L30
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L28
            boolean r3 = r2.exported     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            boolean r3 = r2.enabled     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            java.lang.String r3 = r2.permission     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L2a
            java.lang.String r2 = r2.name     // Catch: java.lang.Throwable -> L28
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            r4 = 1
            return r4
        L28:
            r4 = move-exception
            goto L2d
        L2a:
            int r1 = r1 + 1
            goto Le
        L2d:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L30:
            return r0
    }
}
