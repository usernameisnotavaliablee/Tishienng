package cn.jpush.android.g;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "ConnectionFactory"
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r1 = 4
            r2 = 0
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            java.lang.String r1 = r4.sharedUserId     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            java.lang.String r3 = "android.uid.system"
            boolean r3 = r1.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            java.lang.String r3 = " is not system app,sharedUserId:"
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            java.lang.String r4 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            cn.jpush.android.i.b.e(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            return r2
        L2e:
            android.content.pm.ServiceInfo[] r4 = r4.services     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L31
            goto L32
        L31:
            r4 = 0
        L32:
            if (r4 != 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "not found service by:"
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.i.b.a(r0, r4)
            return r2
        L46:
            r5 = 0
        L47:
            int r1 = r4.length
            if (r5 >= r1) goto L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "serviceInfos:"
            r1.<init>(r3)
            r3 = r4[r5]
            java.lang.String r3 = r3.name
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.i.b.a(r0, r1)
            r1 = r4[r5]
            java.lang.String r1 = r1.name
            java.lang.String r3 = "cn.jpush.android.service.PushManagerService"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L6d
            r4 = 1
            return r4
        L6d:
            int r5 = r5 + 1
            goto L47
        L70:
            return r2
    }
}
