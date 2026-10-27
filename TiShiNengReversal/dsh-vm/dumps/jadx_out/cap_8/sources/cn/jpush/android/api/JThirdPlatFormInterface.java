package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JThirdPlatFormInterface {
    public static final java.lang.String ACTION_NOTIFICATION_ARRIVED = "action_notification_arrived";
    public static final java.lang.String ACTION_NOTIFICATION_CLCKED = "action_notification_clicked";
    public static final java.lang.String ACTION_NOTIFICATION_SHOW = "action_notification_show";
    public static final java.lang.String ACTION_NOTIFICATION_UN_SHOW = "action_notification_unshow";
    public static final java.lang.String ACTION_PLUGIN_PALTFORM_ON_MESSAGING = "intent.plugin.platform.ON_MESSAGING";
    public static final java.lang.String ACTION_PLUGIN_PALTFORM_REFRESSH_REGID = "intent.plugin.platform.REFRESSH_REGID";
    public static final java.lang.String ACTION_PLUGIN_PALTFORM_REQUEST_REGID = "intent.plugin.platform.REQUEST_REGID";
    public static final java.lang.String ACTION_REGISTER_TOKEN = "action_register_token";
    public static final java.lang.String ACTION_SEND_EXCEPTION = "action_send_exception";
    public static final int CMD_CALL_BACK = 10000;
    public static final java.lang.String EXCEPTION_TYPE = "exception_type";
    public static final java.lang.String KEY_CODE = "code";
    public static final java.lang.String KEY_DATA = "data";
    public static final java.lang.String KEY_EXTRA = "extra";
    public static final java.lang.String KEY_MSG = "msg";
    public static final java.lang.String KEY_MSG_ID = "msg_id";
    public static final java.lang.String KEY_NOTI_ID = "noti_id";
    public static final java.lang.String KEY_PLATFORM = "platform";
    public static final java.lang.String KEY_PLUGIN_SDK_VER = "plugin_sdk_ver";
    public static final java.lang.String KEY_ROM_TYPE = "rom_type";
    public static final java.lang.String KEY_TOKEN = "token";
    public static final java.lang.String KEY_VENDOR_PUSH_APP_KEY_MISS = "j10000";
    public static final java.lang.String KEY_VENDOR_PUSH_INIT_UNKNOWN_EXCEPTION = "j10001";
    public static final java.lang.String KEY_VENDOR_PUSH_MANUFACTURE_UNKNOWN = "j10003";
    public static final java.lang.String KEY_VENDOR_PUSH_STATUS_EXCEPTION = "j10002";
    public static final java.lang.String KEY_VENDOR_SDK_VER = "vendor_sdk_ver";

    public JThirdPlatFormInterface() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void doAction(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
            if (r3 != 0) goto L7
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L7:
            java.lang.String r0 = "third_key_action"
            r3.putString(r0, r2)
            cn.jpush.android.local.ActionHelper r2 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r0 = "third_action"
            r2.doAction(r1, r0, r3)
            return
    }

    public static int getNofiticationID(java.lang.String r0, int r1) {
            int r0 = cn.jpush.android.x.b.a(r0, r1)
            return r0
    }

    public static void onEvent(java.lang.Thread r1, java.lang.Throwable r2) {
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r0.onEvent(r1, r2)
            return
    }

    public static cn.jpush.android.api.NotificationMessage parseMessage(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = ""
            cn.jpush.android.d.d r1 = cn.jpush.android.d.d.a(r1, r2, r0)
            cn.jpush.android.api.NotificationMessage r1 = r1.b()
            return r1
    }

    public static void reportThirdSDKMsgActionResult(java.lang.String r0, java.lang.String r1, byte r2, long r3, android.content.Context r5) {
            cn.jpush.android.helper.c.a(r0, r1, r2, r3, r5)
            return
    }

    public static void sendActionByJCore(android.content.Context r1, android.os.Bundle r2, java.lang.String r3) {
            java.lang.String r0 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r1, r0, r3, r2)
            return
    }

    public static void setNotification(android.content.Context r0, android.app.Notification r1, java.lang.String r2, java.lang.CharSequence r3, int r4, int r5, java.lang.String r6, int r7) {
            cn.jpush.android.x.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void setNotificationChannel(android.content.Context r8, android.app.Notification.Builder r9, java.lang.String r10, java.lang.CharSequence r11, int r12, int r13, int r14) {
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            cn.jpush.android.x.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void setNotificationChannel(android.content.Context r0, android.app.Notification.Builder r1, java.lang.String r2, java.lang.CharSequence r3, int r4, int r5, java.lang.String r6, int r7) {
            cn.jpush.android.x.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static java.lang.String toHash(java.lang.String r0) {
            java.lang.String r0 = cn.jpush.android.ad.a.d(r0)
            return r0
    }

    public abstract void clearAllNotification(android.content.Context r1);

    public abstract void clearNotification(android.content.Context r1, int r2);

    public abstract java.lang.String getAppId(android.content.Context r1);

    public abstract java.lang.String getAppkey(android.content.Context r1);

    public abstract java.lang.String getRomName();

    public abstract byte getRomType(android.content.Context r1);

    public abstract java.lang.String getToken(android.content.Context r1);

    public abstract void init(android.content.Context r1);

    public abstract boolean isNeedClearToken(android.content.Context r1);

    public abstract boolean isSupport(android.content.Context r1);

    public boolean needSendToMainProcess() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void register(android.content.Context r1, android.os.Bundle r2);

    public void resumePush(android.content.Context r1) {
            r0 = this;
            return
    }

    public void stopPush(android.content.Context r1) {
            r0 = this;
            return
    }
}
