package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a0 {
    public a0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r4 = r4.getRunningServices(r0)
            int r0 = r4.size()
            r1 = 0
            if (r0 > 0) goto L17
            return r1
        L17:
            r0 = 0
        L18:
            int r2 = r4.size()
            if (r0 >= r2) goto L35
            java.lang.Object r2 = r4.get(r0)
            android.app.ActivityManager$RunningServiceInfo r2 = (android.app.ActivityManager.RunningServiceInfo) r2
            android.content.ComponentName r2 = r2.service
            java.lang.String r2 = r2.getClassName()
            boolean r2 = r2.equals(r5)
            r3 = 1
            if (r2 != r3) goto L32
            return r3
        L32:
            int r0 = r0 + 1
            goto L18
        L35:
            return r1
    }
}
