package com.bytedance.msdk.core.vl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int j(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
            if (r3 == 0) goto L1d
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lf
            int r1 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Lf
            int r2 = r2.checkPermission(r3, r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L1b
            r2 = -1
            return r2
        L1b:
            r2 = 0
            return r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "permission is null"
            r2.<init>(r3)
            throw r2
    }

    public static void requestPermissions(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull java.lang.String[] r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            com.bytedance.msdk.core.vl.a.a(r2, r3, r4)
        L9:
            return
    }
}
