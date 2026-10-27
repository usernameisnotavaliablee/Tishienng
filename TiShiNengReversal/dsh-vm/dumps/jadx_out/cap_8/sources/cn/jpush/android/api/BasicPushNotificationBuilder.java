package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BasicPushNotificationBuilder extends cn.jpush.android.api.DefaultPushNotificationBuilder {
    protected android.content.Context a;
    public java.lang.String developerArg0;
    public int notificationDefaults;
    public int notificationFlags;
    public int statusBarDrawable;

    public BasicPushNotificationBuilder(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "BasicPushNotificationBu"
            r3.<init>()
            r1 = -2
            r3.notificationDefaults = r1
            r1 = 16
            r3.notificationFlags = r1
            r1 = 0
            r3.statusBarDrawable = r1
            java.lang.String r2 = "developerArg0"
            r3.developerArg0 = r2
            if (r4 == 0) goto L36
            r3.a = r4
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.pm.ApplicationInfo r4 = r2.getApplicationInfo(r4, r1)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L2b
            java.lang.String r4 = "JPush get NULL appInfo."
            cn.jpush.android.helper.Logger.ee(r0, r4)     // Catch: java.lang.Throwable -> L30
            return
        L2b:
            int r4 = r4.icon     // Catch: java.lang.Throwable -> L30
            r3.statusBarDrawable = r4     // Catch: java.lang.Throwable -> L30
            return
        L30:
            java.lang.String r4 = "[statusBarDrawable] JPush get NULL appInfo."
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "NULL context"
            r4.<init>(r0)
            throw r4
    }

    public static cn.jpush.android.api.PushNotificationBuilder parseFromPreference(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "_____"
            java.lang.String[] r3 = r3.split(r0)
            r0 = 0
            r0 = r3[r0]
            java.lang.String r1 = "basic"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L17
            cn.jpush.android.api.BasicPushNotificationBuilder r0 = new cn.jpush.android.api.BasicPushNotificationBuilder
            r0.<init>(r2)
            goto L2a
        L17:
            java.lang.String r1 = "custom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
            cn.jpush.android.api.CustomPushNotificationBuilder r0 = new cn.jpush.android.api.CustomPushNotificationBuilder
            r0.<init>(r2)
            goto L2a
        L25:
            cn.jpush.android.api.BasicPushNotificationBuilder r0 = new cn.jpush.android.api.BasicPushNotificationBuilder
            r0.<init>(r2)
        L2a:
            r0.a(r3)
            return r0
    }

    java.lang.String a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.notificationDefaults
            r0.append(r1)
            java.lang.String r1 = "_____"
            r0.append(r1)
            int r2 = r3.notificationFlags
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.statusBarDrawable
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.developerArg0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void a(java.lang.String[] r3) {
            r2 = this;
            r0 = 1
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.notificationDefaults = r0
            r0 = 2
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.notificationFlags = r0
            r0 = 3
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.statusBarDrawable = r0
            int r0 = r3.length
            r1 = 5
            if (r0 < r1) goto L24
            r0 = 4
            r3 = r3[r0]
            r2.developerArg0 = r3
        L24:
            return
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder, cn.jpush.android.api.PushNotificationBuilder
    public java.lang.String getDeveloperArg0() {
            r1 = this;
            java.lang.String r0 = r1.developerArg0
            return r0
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    @android.annotation.TargetApi(11)
    android.app.Notification getNotification(android.app.Notification.Builder r3) {
            r2 = this;
            int r0 = r2.notificationDefaults
            r1 = -2
            if (r0 == r1) goto L8
            r3.setDefaults(r0)
        L8:
            int r0 = r2.statusBarDrawable
            r3.setSmallIcon(r0)
            android.app.Notification r3 = r3.build()
            int r0 = r2.notificationFlags
            r0 = r0 | 1
            r3.flags = r0
            return r3
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    void resetNotificationParams(android.app.Notification r2) {
            r1 = this;
            int r0 = r1.notificationDefaults
            r2.defaults = r0
            int r0 = r1.notificationFlags
            r2.flags = r0
            int r0 = r1.statusBarDrawable
            r2.icon = r0
            return
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "basic_____"
            r0.append(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
