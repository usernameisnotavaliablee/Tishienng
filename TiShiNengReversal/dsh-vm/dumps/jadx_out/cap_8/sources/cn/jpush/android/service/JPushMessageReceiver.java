package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JPushMessageReceiver extends android.content.BroadcastReceiver {
    public JPushMessageReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.app.Notification getNotification(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean isNeedShowNotification(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2, java.lang.String r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void onAliasOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            return
    }

    public void onCheckTagOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            return
    }

    public void onCommandResult(android.content.Context r1, cn.jpush.android.api.CmdMessage r2) {
            r0 = this;
            return
    }

    public void onConnected(android.content.Context r1, boolean r2) {
            r0 = this;
            return
    }

    public void onGeofenceReceived(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void onGeofenceRegion(android.content.Context r1, java.lang.String r2, double r3, double r5) {
            r0 = this;
            return
    }

    public void onInAppMessageClick(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onInAppMessageClick(r2, r3)
            return
    }

    public void onInAppMessageShow(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onInAppMessageShow(r2, r3)
            return
    }

    public void onMessage(android.content.Context r2, cn.jpush.android.api.CustomMessage r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onMessage(r2, r3)
            return
    }

    public void onMobileNumberOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            return
    }

    public void onMultiActionClicked(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onMultiAction(r2, r3)
            return
    }

    public void onNotificationSettingsCheck(android.content.Context r1, boolean r2, int r3) {
            r0 = this;
            return
    }

    public void onNotifyMessageArrived(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onNotifyMessageArrived(r2, r3)
            return
    }

    public void onNotifyMessageDismiss(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            return
    }

    public void onNotifyMessageOpened(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onNotifyMessageOpened(r2, r3)
            return
    }

    public void onNotifyMessageUnShow(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            return
    }

    public void onPropertyOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onJPushMessageReceive(r2, r1, r3)
            return
    }

    public void onRegister(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void onTagOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            return
    }
}
