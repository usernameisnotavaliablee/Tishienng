package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L10
            android.content.pm.PackageInfo r2 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Exception -> L10
            int r2 = r2.versionCode     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            return r0
    }
}
