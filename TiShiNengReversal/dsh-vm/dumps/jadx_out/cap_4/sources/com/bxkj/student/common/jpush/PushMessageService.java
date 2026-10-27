package com.bxkj.student.common.jpush;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PushMessageService extends cn.jpush.android.service.JPushMessageReceiver {
    private static final java.lang.String a = "JPush";

    public PushMessageService() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onAliasOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            super.onAliasOperatorResult(r1, r2)
            r2.getSequence()
            r2.getAlias()
            int r1 = r2.getErrorCode()
            if (r1 != 0) goto L10
            return
        L10:
            r2.getErrorCode()
            return
    }

    public void onCheckTagOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            super.onCheckTagOperatorResult(r1, r2)
            return
    }

    public void onCommandResult(android.content.Context r1, cn.jpush.android.api.CmdMessage r2) {
            r0 = this;
            java.util.Objects.toString(r2)
            return
    }

    public void onConnected(android.content.Context r1, boolean r2) {
            r0 = this;
            return
    }

    public void onMessage(android.content.Context r3, cn.jpush.android.api.CustomMessage r4) {
            r2 = this;
            java.util.Objects.toString(r4)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.jiguang.demo.message"
            r0.<init>(r1)
            java.lang.String r1 = "msg"
            java.lang.String r4 = r4.message
            r0.putExtra(r1, r4)
            r3.sendBroadcast(r0)
            return
    }

    public void onMobileNumberOperatorResult(android.content.Context r1, cn.jpush.android.api.JPushMessage r2) {
            r0 = this;
            super.onMobileNumberOperatorResult(r1, r2)
            return
    }

    public void onMultiActionClicked(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            android.os.Bundle r1 = r2.getExtras()
            java.lang.String r2 = "cn.jpush.android.NOTIFIACATION_ACTION_EXTRA"
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto Ld
            return
        Ld:
            java.lang.String r2 = "my_extra1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L16
            return
        L16:
            java.lang.String r2 = "my_extra2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1f
            return
        L1f:
            java.lang.String r2 = "my_extra3"
            r1.equals(r2)
            return
    }

    public void onNotificationSettingsCheck(android.content.Context r1, boolean r2, int r3) {
            r0 = this;
            super.onNotificationSettingsCheck(r1, r2, r3)
            return
    }

    public void onNotifyMessageArrived(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            java.util.Objects.toString(r2)
            return
    }

    public void onNotifyMessageDismiss(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            java.util.Objects.toString(r2)
            return
    }

    public void onNotifyMessageOpened(android.content.Context r1, cn.jpush.android.api.NotificationMessage r2) {
            r0 = this;
            java.util.Objects.toString(r2)
            super.onNotifyMessageOpened(r1, r2)
            java.util.Objects.toString(r2)
            return
    }

    public void onRegister(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "com.jiguang.demo.register"
            r3.<init>(r0)
            r2.sendBroadcast(r3)
            return
    }

    public void onTagOperatorResult(android.content.Context r2, cn.jpush.android.api.JPushMessage r3) {
            r1 = this;
            super.onTagOperatorResult(r2, r3)
            r3.getSequence()
            java.util.Set r2 = r3.getTags()
            java.util.Objects.toString(r2)
            java.util.Set r2 = r3.getTags()
            r2.size()
            int r2 = r3.getErrorCode()
            if (r2 != 0) goto L1b
            return
        L1b:
            int r2 = r3.getErrorCode()
            r0 = 6018(0x1782, float:8.433E-42)
            if (r2 != r0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Failed to modify tags"
            r2.append(r0)
            java.lang.String r0 = ", tags is exceed limit need to clean"
            r2.append(r0)
        L32:
            r3.getErrorCode()
            return
    }
}
