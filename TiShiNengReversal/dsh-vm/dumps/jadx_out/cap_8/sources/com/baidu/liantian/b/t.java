package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t {
    public t() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L11
            r1 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            com.baidu.liantian.b.e.a()
            r2 = 0
            return r2
    }
}
