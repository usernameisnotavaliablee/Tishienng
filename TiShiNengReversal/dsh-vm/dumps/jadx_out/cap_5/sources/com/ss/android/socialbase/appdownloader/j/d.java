package com.ss.android.socialbase.appdownloader.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class d implements com.ss.android.socialbase.appdownloader.j.k {
    protected final android.content.Context a;
    protected final com.ss.android.socialbase.downloader.jy.j b;
    protected final java.lang.String c;

    public d(android.content.Context r1, com.ss.android.socialbase.downloader.jy.j r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public boolean a() {
            r4 = this;
            android.content.Context r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.Intent r0 = r4.xt()
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.ComponentName r0 = r0.resolveActivity(r2)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L18:
            r0 = move-exception
            boolean r2 = com.ss.android.socialbase.downloader.m.j.j()
            if (r2 == 0) goto L26
            java.lang.String r2 = "AbsDevicePlan"
            java.lang.String r3 = "check is valid failed!"
            com.bytedance.sdk.component.utils.vl.cw(r2, r3, r0)
        L26:
            return r1
    }
}
