package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface PushNotificationBuilder {
    android.app.Notification buildNotification(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2);

    android.app.Notification buildNotification(java.util.Map<java.lang.String, java.lang.String> r1);

    java.lang.String getDeveloperArg0();
}
