package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PackageUtil {
    private static com.beizi.fusion.tool.PackageUtil instance;
    private volatile android.content.pm.PackageInfo mPackageInfo;

    public PackageUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.beizi.fusion.tool.PackageUtil getInstance() {
            java.lang.Class<com.beizi.fusion.tool.PackageUtil> r0 = com.beizi.fusion.tool.PackageUtil.class
            monitor-enter(r0)
            com.beizi.fusion.tool.PackageUtil r1 = com.beizi.fusion.tool.PackageUtil.instance     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            java.lang.Class<com.beizi.fusion.tool.PackageUtil> r1 = com.beizi.fusion.tool.PackageUtil.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            com.beizi.fusion.tool.PackageUtil r2 = new com.beizi.fusion.tool.PackageUtil     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.tool.PackageUtil.instance = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            goto L1c
        L18:
            com.beizi.fusion.tool.PackageUtil r1 = com.beizi.fusion.tool.PackageUtil.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public android.content.pm.PackageInfo getPackageInfo(android.content.Context r4) {
            r3 = this;
            android.content.pm.PackageInfo r0 = r3.mPackageInfo
            if (r0 != 0) goto L24
            java.lang.Class<com.beizi.fusion.tool.PackageUtil> r0 = com.beizi.fusion.tool.PackageUtil.class
            monitor-enter(r0)
            android.content.pm.PackageInfo r1 = r3.mPackageInfo     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L20
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
            r2 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
            r3.mPackageInfo = r4     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
            goto L20
        L1b:
            r4 = move-exception
            goto L22
        L1d:
            r4 = 0
            r3.mPackageInfo = r4     // Catch: java.lang.Throwable -> L1b
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L24
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L24:
            android.content.pm.PackageInfo r4 = r3.mPackageInfo
            return r4
    }
}
