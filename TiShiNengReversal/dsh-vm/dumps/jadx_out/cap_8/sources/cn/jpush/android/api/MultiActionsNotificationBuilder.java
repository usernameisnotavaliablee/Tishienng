package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MultiActionsNotificationBuilder extends cn.jpush.android.api.DefaultPushNotificationBuilder {
    private static final java.lang.String INTENT_NOTIFICATION_CLICK_ACTION_PROXY = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY";
    private static final java.lang.String NOTI_ACT_EXTRA_STR = "notification_action_extra_string";
    private static final java.lang.String NOTI_ACT_RES_ID = "notification_action_res_id";
    private static final java.lang.String NOTI_ACT_TEXT = "notification_action_text";
    private static final java.lang.String TAG = "MultiActionsNotificationBuilder";
    private org.json.JSONArray actionJSONArray;
    protected android.content.Context mContext;

    public MultiActionsNotificationBuilder(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1.actionJSONArray = r0
            r1.mContext = r2
            return
    }

    public static cn.jpush.android.api.PushNotificationBuilder parseFromPreference(android.content.Context r2, java.lang.String r3) {
            cn.jpush.android.api.MultiActionsNotificationBuilder r0 = new cn.jpush.android.api.MultiActionsNotificationBuilder
            r0.<init>(r2)
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Ld
            r2.<init>(r3)     // Catch: org.json.JSONException -> Ld
            r0.actionJSONArray = r2     // Catch: org.json.JSONException -> Ld
            return r0
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "Parse builder from preference failed!"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MultiActionsNotificationBuilder"
            cn.jpush.android.helper.Logger.ww(r3, r2)
            return r0
    }

    public void addJPushAction(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "MultiActionsNotificationBuilder"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "notification_action_res_id"
            r1.put(r2, r4)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "notification_action_text"
            r1.put(r4, r5)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = "notification_action_extra_string"
            r1.put(r4, r6)     // Catch: org.json.JSONException -> L25
            org.json.JSONArray r4 = r3.actionJSONArray     // Catch: org.json.JSONException -> L25
            r4.put(r1)     // Catch: org.json.JSONException -> L25
            org.json.JSONArray r4 = r3.actionJSONArray     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L25
            cn.jpush.android.helper.Logger.i(r0, r4)     // Catch: org.json.JSONException -> L25
            return
        L25:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Construct action failed!"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    @android.annotation.TargetApi(11)
    android.app.Notification getNotification(android.app.Notification.Builder r17) {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "notification_action_text"
            java.lang.String r3 = "notification_action_res_id"
            java.lang.String r4 = "MultiActionsNotificationBuilder"
            java.lang.String r5 = "notification_action_extra_string"
            r6 = 0
            r7 = 0
        Lc:
            org.json.JSONArray r0 = r1.actionJSONArray
            int r0 = r0.length()
            if (r7 >= r0) goto Lea
            org.json.JSONArray r0 = r1.actionJSONArray     // Catch: org.json.JSONException -> Lcf
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch: org.json.JSONException -> Lcf
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: org.json.JSONException -> Lcf
            r9 = 34
            r10 = 1
            r11 = 0
            if (r8 < r9) goto L53
            android.app.ActivityOptions r8 = cn.jpush.android.api.c.a()     // Catch: java.lang.Throwable -> L53
            java.lang.Class<android.app.ActivityOptions> r9 = android.app.ActivityOptions.class
            java.lang.String r12 = "MODE_BACKGROUND_ACTIVITY_START_ALLOWED"
            java.lang.reflect.Field r12 = r9.getField(r12)     // Catch: java.lang.Throwable -> L54
            int r12 = r12.getInt(r11)     // Catch: java.lang.Throwable -> L54
            java.lang.String r13 = "MODE_BACKGROUND_ACTIVITY_START_DENIED"
            java.lang.reflect.Field r13 = r9.getField(r13)     // Catch: java.lang.Throwable -> L54
            r13.getInt(r11)     // Catch: java.lang.Throwable -> L54
            java.lang.String r13 = "setPendingIntentCreatorBackgroundActivityStartMode"
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L54
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L54
            r14[r6] = r15     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r9 = r9.getMethod(r13, r14)     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L54
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L54
            r13[r6] = r12     // Catch: java.lang.Throwable -> L54
            r9.invoke(r8, r13)     // Catch: java.lang.Throwable -> L54
            goto L54
        L53:
            r8 = r11
        L54:
            android.content.Intent r9 = new android.content.Intent     // Catch: org.json.JSONException -> Lcf
            java.lang.String r12 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY"
            r9.<init>(r12)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r12 = "cn.jpush.android.NOTIFIACATION_ACTION_EXTRA"
            java.lang.String r13 = r0.getString(r5)     // Catch: org.json.JSONException -> Lcf
            r9.putExtra(r12, r13)     // Catch: org.json.JSONException -> Lcf
            android.content.Context r12 = r1.mContext     // Catch: org.json.JSONException -> Lcf
            java.lang.Class<cn.jpush.android.service.JNotifyActivity> r13 = cn.jpush.android.service.JNotifyActivity.class
            r9.setClass(r12, r13)     // Catch: org.json.JSONException -> Lcf
            r12 = 8388608(0x800000, float:1.1754944E-38)
            r9.setFlags(r12)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r12 = "isNotification"
            r9.putExtra(r12, r10)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r12 = "multi_notification_msg"
            cn.jpush.android.api.NotificationMessage r13 = r1.notificationMessage     // Catch: org.json.JSONException -> Lcf
            r9.putExtra(r12, r13)     // Catch: org.json.JSONException -> Lcf
            android.content.Context r12 = r1.mContext     // Catch: org.json.JSONException -> Lcf
            if (r8 != 0) goto L81
            goto L85
        L81:
            android.os.Bundle r11 = r8.toBundle()     // Catch: org.json.JSONException -> Lcf
        L85:
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r12, r7, r9, r8, r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lcf
            r9.<init>()     // Catch: org.json.JSONException -> Lcf
            java.lang.String r11 = "Add notification action: res - "
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            int r11 = r0.getInt(r3)     // Catch: org.json.JSONException -> Lcf
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r11 = ", string - "
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r11 = r0.getString(r2)     // Catch: org.json.JSONException -> Lcf
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r11 = ", extra - "
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r11 = r0.getString(r5)     // Catch: org.json.JSONException -> Lcf
            r9.append(r11)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r9 = r9.toString()     // Catch: org.json.JSONException -> Lcf
            cn.jpush.android.helper.Logger.i(r4, r9)     // Catch: org.json.JSONException -> Lcf
            int r9 = r0.getInt(r3)     // Catch: org.json.JSONException -> Lcf
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> Lcf
            r11 = r17
            android.app.Notification$Builder r0 = r11.addAction(r9, r0, r8)     // Catch: org.json.JSONException -> Lcd
            r0.setAutoCancel(r10)     // Catch: org.json.JSONException -> Lcd
            goto Le6
        Lcd:
            r0 = move-exception
            goto Ld2
        Lcf:
            r0 = move-exception
            r11 = r17
        Ld2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Parse Action from preference preference failed!"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            cn.jpush.android.helper.Logger.ww(r4, r0)
        Le6:
            int r7 = r7 + 1
            goto Lc
        Lea:
            r11 = r17
            android.app.Notification r0 = r11.build()
            return r0
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    public java.lang.String toString() {
            r1 = this;
            org.json.JSONArray r0 = r1.actionJSONArray
            java.lang.String r0 = r0.toString()
            return r0
    }
}
