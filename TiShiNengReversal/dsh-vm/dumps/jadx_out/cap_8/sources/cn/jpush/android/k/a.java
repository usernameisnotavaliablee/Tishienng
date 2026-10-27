package cn.jpush.android.k;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r2, cn.jpush.android.d.d r3) {
            java.lang.String r0 = "JAnalytics"
            java.lang.String r1 = "sendClickNotificationMessage"
            cn.jpush.android.helper.Logger.d(r0, r1)
            org.json.JSONObject r3 = c(r2, r3)
            java.lang.String r0 = "jg_message_click"
            a(r2, r0, r3)
            return
    }

    public static void a(android.content.Context r8, java.lang.String r9, org.json.JSONObject r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report eventId:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", eventProperty:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JAnalytics"
            cn.jpush.android.helper.Logger.d(r1, r0)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r0 = "event_id"
            r6.putString(r0, r9)
            if (r10 == 0) goto L33
            java.lang.String r9 = "event_property"
            java.lang.String r10 = r10.toString()
            r6.putString(r9, r10)
        L33:
            r9 = 0
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.String r3 = "JPUSH"
            r4 = 89
            java.lang.String r5 = "report_reserved"
            r2 = r8
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void b(android.content.Context r2, cn.jpush.android.d.d r3) {
            java.lang.String r0 = "JAnalytics"
            java.lang.String r1 = "sendClearNotificationMessage"
            cn.jpush.android.helper.Logger.d(r0, r1)
            org.json.JSONObject r3 = c(r2, r3)
            java.lang.String r0 = "jg_message_clean"
            a(r2, r0, r3)
            return
    }

    private static org.json.JSONObject c(android.content.Context r5, cn.jpush.android.d.d r6) {
            java.lang.String r0 = ""
            java.lang.String r1 = "JAnalytics"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            cn.jpush.android.api.NotificationMessage r3 = r6.b()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r3.appkey     // Catch: java.lang.Throwable -> L1c
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            java.lang.String r5 = cn.jpush.android.helper.JCoreHelper.getAppKey(r5)     // Catch: java.lang.Throwable -> L1c
            r3.appkey = r5     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r5 = move-exception
            goto L7c
        L1e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r5.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "notificationMessage:"
            r5.append(r4)     // Catch: java.lang.Throwable -> L1c
            r5.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1c
            cn.jpush.android.helper.Logger.w(r1, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_msg_id"
            java.lang.String r4 = r3.msgId     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_msg_title"
            java.lang.String r4 = r3.notificationTitle     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_msg_content"
            java.lang.String r4 = r3.notificationContent     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_msg_type"
            int r6 = r6.a     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_msg_url"
            java.lang.String r6 = r3.deeplink     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "jg_target_event"
            org.json.JSONArray r6 = r3.notificationTargetEvent     // Catch: java.lang.Throwable -> L1c
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r3.notificationExtras     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L81
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L81
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "jg_task_id"
            java.lang.String r1 = "_jg_taskid"
            java.lang.String r1 = r6.optString(r1, r0)     // Catch: java.lang.Throwable -> L81
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "jg_plan_id"
            java.lang.String r1 = "_jg_planid"
            java.lang.String r6 = r6.optString(r1, r0)     // Catch: java.lang.Throwable -> L81
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L81
            goto L81
        L7c:
            java.lang.String r6 = "getJsonNotificationMessage:"
            cn.jpush.android.helper.Logger.ee(r1, r6, r5)
        L81:
            return r2
    }
}
