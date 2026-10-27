package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class PackageUtil {
    private static final java.lang.String PACKAGE_HMS = "com.huawei.hwid";
    private static final java.lang.String PACKAGE_HMS_STORE = "com.huawei.appmarket";
    private static final java.lang.String TAG = "PackageUtil";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PackageInfoHolder {
        private static volatile xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder instance;
        private volatile android.content.pm.PackageInfo info;

        private PackageInfoHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder getInstance() {
                xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.instance
                if (r0 != 0) goto L19
                java.lang.Class<xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder> r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.class
                monitor-enter(r0)
                xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r1 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.instance     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r1 = new xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.instance = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r1 = move-exception
                goto L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
            L19:
                xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.instance
                return r0
        }

        public android.content.pm.PackageInfo getSelfPackageInfo(android.content.Context r4) {
                r3 = this;
                android.content.pm.PackageInfo r0 = r3.info
                if (r0 != 0) goto L24
                java.lang.Class<xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder> r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.class
                monitor-enter(r0)
                android.content.pm.PackageInfo r1 = r3.info     // Catch: java.lang.Throwable -> L1b
                if (r1 != 0) goto L20
                android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
                java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
                r2 = 0
                android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
                r3.info = r4     // Catch: java.lang.Throwable -> L1b android.content.pm.PackageManager.NameNotFoundException -> L1d
                goto L20
            L1b:
                r4 = move-exception
                goto L22
            L1d:
                r4 = 0
                r3.info = r4     // Catch: java.lang.Throwable -> L1b
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                goto L24
            L22:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r4
            L24:
                android.content.pm.PackageInfo r4 = r3.info
                return r4
        }
    }

    private PackageUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getAppInstallDate(android.content.Context r2) {
            xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.getInstance()
            android.content.pm.PackageInfo r2 = r0.getSelfPackageInfo(r2)
            if (r2 == 0) goto Ld
            long r0 = r2.firstInstallTime
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static long getAppLastUpdateTime(android.content.Context r2) {
            xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.getInstance()
            android.content.pm.PackageInfo r2 = r0.getSelfPackageInfo(r2)
            if (r2 == 0) goto Ld
            long r0 = r2.lastUpdateTime
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String getAppName(android.content.Context r2) {
            if (r2 == 0) goto L1e
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            if (r0 == 0) goto L1e
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.CharSequence r2 = r0.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.String r2 = r2.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            return r2
        L1a:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
        L1e:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String getAppVersionCode(android.content.Context r0) {
            java.lang.String r0 = getPackageVersionCode(r0)
            return r0
    }

    public static java.lang.String getAppVersionName(android.content.Context r0) {
            java.lang.String r0 = getPackageVersionName(r0)
            return r0
    }

    public static java.lang.String getHmsCoreVersionCode(android.content.Context r1) {
            java.lang.String r0 = "com.huawei.hwid"
            java.lang.String r1 = getPackageVersionCode(r1, r0)
            return r1
    }

    public static java.lang.String getHmsStoreVersionCode(android.content.Context r1) {
            java.lang.String r0 = "com.huawei.appmarket"
            java.lang.String r1 = getPackageVersionCode(r1, r0)
            return r1
    }

    public static java.lang.String getPackageVersionCode(android.content.Context r1) {
            xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.getInstance()
            android.content.pm.PackageInfo r1 = r0.getSelfPackageInfo(r1)
            if (r1 == 0) goto L13
            int r1 = r1.versionCode
            if (r1 == 0) goto L13
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L13:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getPackageVersionCode(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            if (r1 == 0) goto L16
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            if (r1 == 0) goto L16
            int r1 = r1.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            if (r1 == 0) goto L16
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            return r1
        L16:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getPackageVersionName(android.content.Context r1) {
            xyz.adscope.common.v2.dev.info.PackageUtil$PackageInfoHolder r0 = xyz.adscope.common.v2.dev.info.PackageUtil.PackageInfoHolder.getInstance()
            android.content.pm.PackageInfo r1 = r0.getSelfPackageInfo(r1)
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.versionName
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    public static boolean isInstall(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L17
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L17
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            if (r2 == 0) goto L17
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            if (r2 == 0) goto L17
            r2 = 1
            return r2
        L17:
            return r0
    }
}
