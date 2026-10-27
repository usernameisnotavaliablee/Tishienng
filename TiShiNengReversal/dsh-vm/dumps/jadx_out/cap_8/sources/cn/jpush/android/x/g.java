package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r5) {
            java.lang.String r0 = "ResourceHelper"
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = "drawable"
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = "jpush_notification_icon"
            int r1 = r1.getIdentifier(r4, r2, r3)
            if (r1 != 0) goto L2f
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L29
            r3 = 0
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch: java.lang.Throwable -> L29
            int r1 = r5.icon     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "JPush.mPackageInconId == 0 ?, get icon from application info."
            cn.jpush.android.helper.Logger.i(r0, r5)     // Catch: java.lang.Throwable -> L29
            return r1
        L29:
            r5 = move-exception
            java.lang.String r2 = "failed to get application info and icon."
            cn.jpush.android.helper.Logger.ee(r0, r2, r5)
        L2f:
            return r1
    }
}
