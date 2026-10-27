package cn.jpush.android.local;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JPushAction {
    public JPushAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object beforLogin(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4);

    public abstract cn.jpush.android.local.ProxyActivityAction getPopWinActivity(android.content.Context r1);

    public abstract cn.jpush.android.local.ProxyActivityAction getPushActivity(android.content.Context r1);

    public java.lang.String getSdkVersion(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = cn.jpush.android.m.a.f1833b
            return r1
    }

    public abstract java.lang.Object handleAction(android.content.Context r1, java.lang.String r2, java.lang.Object r3);

    public abstract void handleNotificationIntent(android.content.Context r1, android.content.Intent r2);

    public boolean isSupportedCMD(java.lang.String r1, int r2) {
            r0 = this;
            r1 = 3
            if (r2 == r1) goto L2a
            r1 = 29
            if (r2 == r1) goto L2a
            r1 = 28
            if (r2 == r1) goto L2a
            r1 = 27
            if (r2 == r1) goto L2a
            r1 = 10
            if (r2 == r1) goto L2a
            r1 = 26
            if (r2 == r1) goto L2a
            r1 = 25
            if (r2 == r1) goto L2a
            r1 = 34
            if (r2 == r1) goto L2a
            r1 = 36
            if (r2 == r1) goto L2a
            r1 = 37
            if (r2 != r1) goto L28
            goto L2a
        L28:
            r1 = 0
            return r1
        L2a:
            r1 = 1
            return r1
    }

    public abstract void onActivityLifeCallback(android.app.Activity r1, java.lang.String r2);

    public abstract void onInAppMessageClick(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2);

    public abstract void onInAppMessageShow(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2);

    public abstract void onJPushMessageReceive(android.content.Context r1, cn.jpush.android.service.JPushMessageReceiver r2, android.content.Intent r3);

    public abstract void onJPushMessageReceive(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4);

    public abstract void onMessage(android.content.Context r1, cn.jpush.android.api.CustomMessage r2);

    public abstract void onMultiAction(android.content.Context r1, android.content.Intent r2);

    public abstract void onNotifyMessageArrived(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2);

    public abstract void onNotifyMessageOpened(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2);

    public abstract void onTagAliasResponse(android.content.Context r1, long r2, int r4, android.content.Intent r5);

    public abstract void setAliasAndTags(android.content.Context r1, java.lang.String r2, java.util.Set<java.lang.String> r3, cn.jpush.android.api.CallBackParams r4);
}
