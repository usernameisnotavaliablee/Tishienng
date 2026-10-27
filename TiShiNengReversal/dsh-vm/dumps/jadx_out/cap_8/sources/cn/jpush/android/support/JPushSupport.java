package cn.jpush.android.support;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushSupport {
    private static final java.lang.Integer a = null;

    static {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.support.JPushSupport.a = r0
            return
    }

    public JPushSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.api.PushNotificationBuilder getNotificationBuilder(android.content.Context r4, cn.jpush.android.api.NotificationMessage r5) {
            java.lang.String r0 = "JPushSupport"
            r1 = 0
            int r5 = r5.notificationBuilderId     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            if (r5 >= r2) goto L11
            java.lang.Integer r5 = cn.jpush.android.support.JPushSupport.a     // Catch: java.lang.Throwable -> Lf
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r4 = move-exception
            goto L61
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = ""
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = cn.jpush.android.cache.a.d(r4, r5)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L32
            java.lang.String r4 = "not found custom notification"
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> Lf
            return r1
        L32:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "get customBuilder:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.helper.Logger.ii(r0, r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "basic"
            boolean r2 = r5.startsWith(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L5c
            java.lang.String r2 = "custom"
            boolean r2 = r5.startsWith(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L57
            goto L5c
        L57:
            cn.jpush.android.api.PushNotificationBuilder r4 = cn.jpush.android.api.MultiActionsNotificationBuilder.parseFromPreference(r4, r5)     // Catch: java.lang.Throwable -> Lf
            return r4
        L5c:
            cn.jpush.android.api.PushNotificationBuilder r4 = cn.jpush.android.api.BasicPushNotificationBuilder.parseFromPreference(r4, r5)     // Catch: java.lang.Throwable -> Lf
            return r4
        L61:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "getNotification failed:"
            r5.append(r2)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return r1
    }
}
