package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DefaultPushNotificationBuilder implements cn.jpush.android.api.PushNotificationBuilder {
    public static final int NOTI_STYLE_BIG_PICTURE = 3;
    public static final int NOTI_STYLE_BIG_TEXT = 1;
    public static final int NOTI_STYLE_INBOX = 2;
    private static final java.lang.String TAG = "DefaultPushNotificationBuilder";
    protected android.content.Context context;
    protected cn.jpush.android.api.NotificationMessage notificationMessage;

    public DefaultPushNotificationBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    android.widget.RemoteViews buildContentView(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jpush.android.api.PushNotificationBuilder
    public android.app.Notification buildNotification(android.content.Context r4, cn.jpush.android.api.NotificationMessage r5) {
            r3 = this;
            r3.context = r4
            r3.notificationMessage = r5
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r5 == 0) goto L170
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notificationContent:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationContent
            r0.append(r1)
            java.lang.String r1 = "\nnotificationTitle"
            r0.append(r1)
            java.lang.String r1 = r5.notificationTitle
            r0.append(r1)
            java.lang.String r1 = "\nnotificationStyle:"
            r0.append(r1)
            int r1 = r5.notificationStyle
            r0.append(r1)
            java.lang.String r1 = "\nnotificationPriority:"
            r0.append(r1)
            int r1 = r5.notificationPriority
            r0.append(r1)
            java.lang.String r1 = "\nnotificationBigText:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationBigText
            r0.append(r1)
            java.lang.String r1 = "\nnotificationBigPicPath:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationBigPicPath
            r0.append(r1)
            java.lang.String r1 = "\nnotificationInbox:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationInbox
            r0.append(r1)
            java.lang.String r1 = "\nnotificationCategory:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationCategory
            r0.append(r1)
            java.lang.String r1 = "\nnotificationAlertType:"
            r0.append(r1)
            int r1 = r5.notificationAlertType
            r0.append(r1)
            java.lang.String r1 = "\nnotificationSmallIcon:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationSmallIcon
            r0.append(r1)
            java.lang.String r1 = "\nnotificationLargeIcon:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationLargeIcon
            r0.append(r1)
            java.lang.String r1 = "\nextraJson:"
            r0.append(r1)
            java.lang.String r1 = r5.notificationExtras
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DefaultPushNotificationBuilder"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.String r0 = "cn.jpush.android.MSG_ID"
            java.lang.String r1 = r5.msgId
            r4.put(r0, r1)
            java.lang.String r0 = "cn.jpush.android.ALERT"
            java.lang.String r1 = r5.notificationContent
            r4.put(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.notificationAlertType
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "cn.jpush.android.ALERT_TYPE"
            r4.put(r2, r0)
            java.lang.String r0 = r5.notificationTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "cn.jpush.android.NOTIFICATION_CONTENT_TITLE"
            java.lang.String r2 = r5.notificationTitle
            r4.put(r0, r2)
        Lc6:
            java.lang.String r0 = r5.notificationExtras
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld5
            java.lang.String r0 = "cn.jpush.android.EXTRA"
            java.lang.String r2 = r5.notificationExtras
            r4.put(r0, r2)
        Ld5:
            int r0 = r5.notificationStyle
            r2 = 1
            if (r0 != r2) goto Lea
            java.lang.String r0 = r5.notificationBigText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lea
            java.lang.String r0 = "cn.jpush.android.BIG_TEXT"
            java.lang.String r2 = r5.notificationBigText
        Le6:
            r4.put(r0, r2)
            goto L10e
        Lea:
            int r0 = r5.notificationStyle
            r2 = 2
            if (r0 != r2) goto Lfc
            java.lang.String r0 = r5.notificationInbox
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lfc
            java.lang.String r0 = "cn.jpush.android.INBOX"
            java.lang.String r2 = r5.notificationInbox
            goto Le6
        Lfc:
            int r0 = r5.notificationStyle
            r2 = 3
            if (r0 != r2) goto L10e
            java.lang.String r0 = r5.notificationBigPicPath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10e
            java.lang.String r0 = "cn.jpush.android.BIG_PIC_PATH"
            java.lang.String r2 = r5.notificationBigPicPath
            goto Le6
        L10e:
            int r0 = r5.notificationPriority
            if (r0 == 0) goto L128
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r5.notificationPriority
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "cn.jpush.android.NOTI_PRIORITY"
            r4.put(r2, r0)
        L128:
            int r0 = r5.notificationImportance
            r2 = -1
            if (r0 == r2) goto L143
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r5.notificationImportance
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "cn.jpush.android.NOTI_IMPORTANCE"
            r4.put(r1, r0)
        L143:
            java.lang.String r0 = r5.notificationCategory
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L152
            java.lang.String r0 = "cn.jpush.android.NOTI_CATEGORY"
            java.lang.String r1 = r5.notificationCategory
            r4.put(r0, r1)
        L152:
            java.lang.String r0 = r5.notificationSmallIcon
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L161
            java.lang.String r0 = "cn.jpush.android.NOTIFICATION_SMALL_ICON"
            java.lang.String r1 = r5.notificationSmallIcon
            r4.put(r0, r1)
        L161:
            java.lang.String r0 = r5.notificationLargeIcon
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L170
            java.lang.String r0 = "cn.jpush.android.NOTIFICATION_LARGE_ICON"
            java.lang.String r5 = r5.notificationLargeIcon
            r4.put(r0, r5)
        L170:
            android.app.Notification r4 = r3.buildNotification(r4)
            return r4
    }

    @Override // cn.jpush.android.api.PushNotificationBuilder
    public android.app.Notification buildNotification(java.util.Map<java.lang.String, java.lang.String> r21) {
            r20 = this;
            r1 = r20
            r0 = r21
            android.content.Context r2 = r1.context
            r3 = 0
            java.lang.String r4 = "DefaultPushNotificationBuilder"
            if (r2 != 0) goto L11
            java.lang.String r0 = "Can't find valid context when build notification."
            cn.jpush.android.helper.Logger.w(r4, r0)
            return r3
        L11:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L24
            android.content.Context r5 = r1.context     // Catch: java.lang.Throwable -> L24
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L24
            java.lang.CharSequence r2 = r2.loadLabel(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r2 = r3
        L26:
            java.lang.String r5 = "cn.jpush.android.MSG_ID"
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L34
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
        L34:
            java.lang.String r5 = "cn.jpush.android.ALERT"
            boolean r6 = r0.containsKey(r5)
            java.lang.String r7 = ""
            if (r6 == 0) goto L45
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L46
        L45:
            r5 = r7
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L52
            java.lang.String r0 = "No notification content to show. Give up."
            cn.jpush.android.helper.Logger.ww(r4, r0)
            return r3
        L52:
            java.lang.String r3 = "cn.jpush.android.NOTIFICATION_SMALL_ICON"
            boolean r6 = r0.containsKey(r3)
            if (r6 == 0) goto L60
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        L60:
            java.lang.String r3 = "cn.jpush.android.NOTIFICATION_LARGE_ICON"
            boolean r6 = r0.containsKey(r3)
            if (r6 == 0) goto L6f
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L70
        L6f:
            r3 = r7
        L70:
            java.lang.String r6 = "cn.jpush.android.NOTIFICATION_CONTENT_TITLE"
            boolean r8 = r0.containsKey(r6)
            if (r8 == 0) goto L7e
            java.lang.Object r2 = r0.get(r6)
            java.lang.String r2 = (java.lang.String) r2
        L7e:
            java.lang.String r6 = "cn.jpush.android.BIG_TEXT"
            boolean r8 = r0.containsKey(r6)
            if (r8 == 0) goto L8d
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            goto L8e
        L8d:
            r6 = r7
        L8e:
            java.lang.String r8 = "cn.jpush.android.INBOX"
            boolean r9 = r0.containsKey(r8)
            if (r9 == 0) goto L9d
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L9e
        L9d:
            r8 = r7
        L9e:
            java.lang.String r9 = "cn.jpush.android.NOTI_PRIORITY"
            boolean r10 = r0.containsKey(r9)
            if (r10 == 0) goto Lb3
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
            r16 = r9
            goto Lb5
        Lb3:
            r16 = 0
        Lb5:
            java.lang.String r9 = "cn.jpush.android.NOTI_IMPORTANCE"
            boolean r10 = r0.containsKey(r9)
            r12 = -1
            if (r10 == 0) goto Lcb
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
            r19 = r9
            goto Lcd
        Lcb:
            r19 = -1
        Lcd:
            java.lang.String r9 = "cn.jpush.android.NOTI_CATEGORY"
            boolean r10 = r0.containsKey(r9)
            if (r10 == 0) goto Ldc
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto Ldd
        Ldc:
            r9 = r7
        Ldd:
            java.lang.String r10 = "cn.jpush.android.BIG_PIC_PATH"
            boolean r13 = r0.containsKey(r10)
            if (r13 == 0) goto Lec
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto Led
        Lec:
            r10 = r7
        Led:
            java.lang.String r13 = "cn.jpush.android.ALERT_TYPE"
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L100
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            goto L101
        L100:
            r0 = -1
        L101:
            if (r0 < r12) goto L10a
            r13 = 7
            if (r0 <= r13) goto L107
            goto L10a
        L107:
            r17 = r0
            goto L10c
        L10a:
            r17 = -1
        L10c:
            android.widget.RemoteViews r13 = r1.buildContentView(r5, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r14 = r13
            android.app.Notification$Builder r13 = new android.app.Notification$Builder
            android.content.Context r15 = r1.context
            r13.<init>(r15)
            android.app.Notification$Builder r2 = r13.setContentTitle(r2)
            android.app.Notification$Builder r2 = r2.setContentText(r5)
            r2.setTicker(r5)
            android.content.Context r2 = r1.context
            int r2 = cn.jpush.android.x.g.a(r2)
            if (r2 == 0) goto L145
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "setSmallIcon with resId:"
            r5.append(r15)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.dd(r4, r5)
        L141:
            r13.setSmallIcon(r2)
            goto L14e
        L145:
            java.lang.String r2 = "not found small icon in your app,will setSmallIcon with android.R.color.transparent "
            cn.jpush.android.helper.Logger.ww(r4, r2)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            goto L141
        L14e:
            android.content.Context r2 = r1.context
            java.lang.Object r2 = cn.jpush.android.x.b.b(r2, r3)
            r3 = 23
            if (r0 < r3) goto L16f
            boolean r0 = androidx.core.app.k.a(r2)
            if (r0 == 0) goto L166
            android.graphics.drawable.Icon r0 = androidx.core.app.l.a(r2)
            cn.jpush.android.api.a.a(r13, r0)
            goto L16f
        L166:
            boolean r0 = r2 instanceof android.graphics.Bitmap
            if (r0 == 0) goto L16f
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r13.setLargeIcon(r2)
        L16f:
            r2 = 1
            r13.setShowWhen(r2)
            r3 = -1
            android.content.Context r12 = r1.context
            cn.jpush.android.api.NotificationMessage r0 = r1.notificationMessage
            if (r0 == 0) goto L17c
            java.lang.String r7 = r0.notificationChannelId
        L17c:
            java.lang.String r15 = ""
            r18 = 0
            r3 = r14
            r5 = -1
            r14 = r7
            cn.jpush.android.x.a.a(r12, r13, r14, r15, r16, r17, r18, r19)
            r7 = r16
            r12 = r17
            if (r3 != 0) goto L24c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L19d
            android.app.Notification$BigTextStyle r0 = new android.app.Notification$BigTextStyle
            r0.<init>()
            r0.bigText(r6)
            r13.setStyle(r0)
        L19d:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L21d
            android.app.Notification$InboxStyle r6 = new android.app.Notification$InboxStyle
            r6.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L1ca
            r0.<init>()     // Catch: java.lang.Throwable -> L1ca
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1ca
            r14.<init>(r8)     // Catch: java.lang.Throwable -> L1ca
            java.util.Iterator r8 = r14.keys()     // Catch: java.lang.Throwable -> L1ca
        L1b6:
            boolean r15 = r8.hasNext()     // Catch: java.lang.Throwable -> L1ca
            if (r15 == 0) goto L1cc
            java.lang.Object r15 = r8.next()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r11 = r14.optString(r15)     // Catch: java.lang.Throwable -> L1ca
            r0.put(r15, r11)     // Catch: java.lang.Throwable -> L1ca
            goto L1b6
        L1ca:
            r0 = move-exception
            goto L202
        L1cc:
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L1ca
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1ca
        L1d4:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ca
            if (r8 == 0) goto L1e4
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L1ca
            r6.addLine(r8)     // Catch: java.lang.Throwable -> L1ca
            goto L1d4
        L1e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r0.<init>()     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r8 = " + "
            r0.append(r8)     // Catch: java.lang.Throwable -> L1ca
            int r8 = r14.length()     // Catch: java.lang.Throwable -> L1ca
            r0.append(r8)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r8 = " new messages"
            r0.append(r8)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1ca
            r6.setSummaryText(r0)     // Catch: java.lang.Throwable -> L1ca
            goto L21a
        L202:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Set inbox style error: "
            r8.append(r11)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            cn.jpush.android.helper.Logger.ee(r4, r0)
        L21a:
            r13.setStyle(r6)
        L21d:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L24c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Set notification BPS with picture path:"
            r0.append(r6)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.i(r4, r0)
            android.app.Notification$BigPictureStyle r0 = new android.app.Notification$BigPictureStyle     // Catch: java.lang.Throwable -> L247
            r0.<init>()     // Catch: java.lang.Throwable -> L247
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch: java.lang.Throwable -> L247
            r0.bigPicture(r6)     // Catch: java.lang.Throwable -> L247
            r13.setStyle(r0)     // Catch: java.lang.Throwable -> L247
            goto L24c
        L247:
            java.lang.String r0 = "Create big picture style failed."
            cn.jpush.android.helper.Logger.ww(r4, r0)
        L24c:
            if (r7 != 0) goto L24f
            goto L268
        L24f:
            if (r7 != r2) goto L255
        L251:
            r13.setPriority(r2)
            goto L268
        L255:
            r0 = 2
            if (r7 != r0) goto L25c
        L258:
            r13.setPriority(r0)
            goto L268
        L25c:
            if (r7 != r5) goto L262
            r13.setPriority(r5)
            goto L268
        L262:
            r0 = -2
            if (r7 != r0) goto L266
            goto L258
        L266:
            r2 = 0
            goto L251
        L268:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L271
            r13.setCategory(r9)
        L271:
            if (r3 == 0) goto L28c
            r13.setContent(r3)
            android.content.Context r0 = r1.context
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r2 = 31
            if (r0 < r2) goto L291
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L291
            cn.jpush.android.api.b.a(r13, r3)
            goto L291
        L28c:
            java.lang.String r0 = " Use default notification view! "
            cn.jpush.android.helper.Logger.i(r4, r0)
        L291:
            r13.setDefaults(r12)
            android.app.Notification r0 = r1.getNotification(r13)
            return r0
    }

    @Override // cn.jpush.android.api.PushNotificationBuilder
    public java.lang.String getDeveloperArg0() {
            r1 = this;
            r0 = 0
            return r0
    }

    android.app.Notification getNotification(android.app.Notification.Builder r3) {
            r2 = this;
            android.app.Notification r3 = r3.build()     // Catch: java.lang.Throwable -> L5
            return r3
        L5:
            r3 = move-exception
            java.lang.String r0 = "DefaultPushNotificationBuilder"
            java.lang.String r1 = "Build notification error:"
            cn.jpush.android.helper.Logger.ww(r0, r1, r3)
            r3 = 0
            return r3
    }

    void resetNotificationParams(android.app.Notification r1) {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }
}
