package xyz.adscope.common.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AppInfo {
    public AppInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap getAppIcon(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L4e
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L4e
            android.graphics.drawable.Drawable r5 = r5.loadIcon(r1)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L4e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r2 = 26
            if (r1 < r2) goto L47
            boolean r1 = cn.jpush.android.x.z.a(r5)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            int r1 = r5.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L45
            int r2 = r5.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch: java.lang.Throwable -> L45
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L45
            int r2 = r1.getWidth()     // Catch: java.lang.Throwable -> L45
            int r3 = r1.getHeight()     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r5.setBounds(r4, r4, r2, r3)     // Catch: java.lang.Throwable -> L45
            r5.draw(r1)     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            r5 = move-exception
            goto L4f
        L47:
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5     // Catch: java.lang.Throwable -> L45
            android.graphics.Bitmap r5 = r5.getBitmap()     // Catch: java.lang.Throwable -> L45
            return r5
        L4e:
            return r0
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.i(r1, r5)
            return r0
    }

    public static java.lang.String getAppName(android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1d
            java.lang.CharSequence r3 = r1.getApplicationLabel(r3)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r3 = move-exception
            goto L21
        L1d:
            r3 = r0
        L1e:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b
            return r3
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r3)
            return r0
    }

    public static java.lang.String getAppVersionName(android.content.Context r4) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L21
            r2 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r4.versionName     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L20
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L1e
            if (r1 > 0) goto L1d
            goto L20
        L1d:
            return r4
        L1e:
            r0 = move-exception
            goto L25
        L20:
            return r0
        L21:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
            return r4
    }

    public static long getInstallDate(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r3)     // Catch: java.lang.Throwable -> L15
            long r0 = r4.firstInstallTime     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e : "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r2, r4)
            return r0
    }

    public static long getLastUpdateTime(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            android.content.pm.PackageInfo r4 = r2.getPackageInfo(r4, r3)     // Catch: java.lang.Throwable -> L15
            long r0 = r4.lastUpdateTime     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e : "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r2, r4)
            return r0
    }

    public static java.lang.String getPackName(android.content.Context r1) {
            java.lang.String r0 = ""
            if (r1 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> La
            return r1
        La:
            return r0
    }

    public static java.lang.String getVerCode(android.content.Context r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Exception -> Le
            java.lang.String r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.getVersionCode(r1, r0)     // Catch: java.lang.Exception -> Le
            return r1
        Le:
            java.lang.String r1 = "0"
            return r1
    }

    public static java.lang.String getVerName(android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r3)
            return r0
    }
}
