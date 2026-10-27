package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class q {
    public q() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r4) {
            r0 = 0
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L15
            int r3 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L15
            int r4 = r4.checkPermission(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            r1 = -1
            if (r4 != r1) goto L13
            return r0
        L13:
            r4 = 1
            return r4
        L15:
            com.baidu.liantian.b.e.a()
            return r0
    }
}
