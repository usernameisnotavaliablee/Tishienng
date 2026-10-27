package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static boolean a;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.Boolean f1807c;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ThreadPoolExecutor f1808b;

    /* renamed from: cn.jpush.android.helper.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: cn.jpush.android.helper.a$a, reason: collision with other inner class name */
    private class C0051a extends cn.jpush.android.ad.f {
        final /* synthetic */ cn.jpush.android.helper.a a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1809b;

        /* renamed from: c, reason: collision with root package name */
        private cn.jpush.android.service.JPushMessageReceiver f1810c;

        /* renamed from: d, reason: collision with root package name */
        private android.content.Intent f1811d;

        public C0051a(cn.jpush.android.helper.a r1, android.content.Context r2, cn.jpush.android.service.JPushMessageReceiver r3, android.content.Intent r4) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1809b = r2
                r0.f1810c = r3
                r0.f1811d = r4
                java.lang.String r1 = "JMessageReceiverHelper#MessageReceiverRunable"
                r0.f1674e = r1
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r3 = this;
                android.content.Context r0 = r3.f1809b
                cn.jpush.android.service.JPushMessageReceiver r1 = r3.f1810c
                android.content.Intent r2 = r3.f1811d
                cn.jpush.android.helper.a.b(r0, r1, r2)
                cn.jpush.android.ac.e r0 = cn.jpush.android.ac.e.a()
                android.content.Context r1 = r3.f1809b
                android.content.Intent r2 = r3.f1811d
                r0.a(r1, r2)
                return
        }
    }

    private static final class b {
        private static final cn.jpush.android.helper.a a = null;

        static {
                cn.jpush.android.helper.a r0 = new cn.jpush.android.helper.a
                r1 = 0
                r0.<init>(r1)
                cn.jpush.android.helper.a.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jpush.android.helper.a a() {
                cn.jpush.android.helper.a r0 = cn.jpush.android.helper.a.b.a
                return r0
        }
    }

    static {
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            r0.b()
            return
    }

    /* synthetic */ a(cn.jpush.android.helper.a.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jpush.android.helper.a a() {
            cn.jpush.android.helper.a r0 = cn.jpush.android.helper.a.b.a()
            return r0
    }

    public static void a(android.content.Context r5, android.content.Intent r6) {
            java.lang.String r0 = "null"
            java.lang.String r1 = "JMessageReceiverHelper"
            if (r5 != 0) goto L7
            return
        L7:
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L29
            int r3 = cn.jpush.android.local.JPushConstants.isForeGround     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = ".permission.JPUSH_MESSAGE"
            if (r3 != 0) goto L2b
            java.lang.String r0 = "foreground no need provider,use sendBroadcast"
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r0.append(r2)     // Catch: java.lang.Throwable -> L29
            r0.append(r4)     // Catch: java.lang.Throwable -> L29
        L21:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            r5.sendBroadcast(r6, r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r5 = move-exception
            goto L8d
        L2b:
            boolean r3 = a(r5)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L7c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "send by provider intent="
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            r3.append(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.d(r1, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            r3.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ".jiguang.InitProvider"
            r3.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "content://"
            r3.append(r4)     // Catch: java.lang.Throwable -> L29
            r3.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "/"
            r3.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L29
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L29
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L29
            android.os.Bundle r6 = cn.jpush.android.ad.a.a(r6)     // Catch: java.lang.Throwable -> L29
            r5.call(r2, r0, r0, r6)     // Catch: java.lang.Throwable -> L29
            return
        L7c:
            java.lang.String r0 = "no support provider ,use sendBroadcast"
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r0.append(r2)     // Catch: java.lang.Throwable -> L29
            r0.append(r4)     // Catch: java.lang.Throwable -> L29
            goto L21
        L8d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "send Throwable: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.d(r1, r5)
            return
    }

    public static void a(android.content.Context r7, cn.jpush.android.api.CustomMessage r8) {
            java.lang.String r0 = "JMessageReceiverHelper"
            if (r7 == 0) goto L89
            if (r8 != 0) goto L8
            goto L89
        L8:
            java.lang.String r1 = "not found user push message,use old action to user"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "cn.jpush.android.intent.MESSAGE_RECEIVED"
            r1.<init>(r2)
            java.lang.String r2 = "cn.jpush.android.APPKEY"
            java.lang.String r3 = r8.senderId
            r1.putExtra(r2, r3)
            java.lang.String r2 = "cn.jpush.android.MESSAGE"
            java.lang.String r3 = r8.message
            r1.putExtra(r2, r3)
            java.lang.String r2 = "cn.jpush.android.CONTENT_TYPE"
            java.lang.String r3 = r8.contentType
            r1.putExtra(r2, r3)
            java.lang.String r2 = "cn.jpush.android.TITLE"
            java.lang.String r3 = r8.title
            r1.putExtra(r2, r3)
            java.lang.String r2 = "cn.jpush.android.EXTRA"
            java.lang.String r3 = r8.extra
            r1.putExtra(r2, r3)
            java.lang.String r2 = "cn.jpush.android.MSG_ID"
            java.lang.String r3 = r8.messageId
            r1.putExtra(r2, r3)
            int r2 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE
            r3 = 387(0x183, float:5.42E-43)
            if (r2 < r3) goto L4b
            java.lang.String r2 = "cn.jpush.android.TYPE_PLATFORM"
            byte r3 = r8.platform
            r1.putExtra(r2, r3)
        L4b:
            java.lang.String r2 = r8.appId
            r1.addCategory(r2)
            java.lang.String r2 = r7.getPackageName()
            r1.setPackage(r2)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = r8.appId
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = "%s.permission.JPUSH_MESSAGE"
            java.lang.String r5 = java.lang.String.format(r2, r3, r5)
            r7.sendBroadcast(r1, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Send broadcast to app: "
            r7.append(r1)
            java.lang.String r8 = r8.appId
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r8
            java.lang.String r8 = java.lang.String.format(r2, r3, r1)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            cn.jpush.android.helper.Logger.i(r0, r7)
            return
        L89:
            java.lang.String r7 = "Send custom message to app failed, param is invalid!"
            cn.jpush.android.helper.Logger.dd(r0, r7)
            return
    }

    public static void a(android.content.Context r8, cn.jpush.android.api.NotificationMessage r9, java.lang.String r10) {
            java.lang.String r0 = ".permission.JPUSH_MESSAGE"
            java.lang.String r1 = "file://"
            java.lang.String r2 = ""
            java.lang.String r3 = "JMessageReceiverHelper"
            if (r8 == 0) goto L1c6
            if (r9 == 0) goto L1c6
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L14
            goto L1c6
        L14:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r10)
            java.lang.String r10 = "Send push received broadcast to developer defined receiver"
            cn.jpush.android.helper.Logger.dd(r3, r10)     // Catch: java.lang.Throwable -> L5e
            android.os.Bundle r10 = new android.os.Bundle     // Catch: java.lang.Throwable -> L5e
            r10.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "cn.jpush.android.MSG_ID"
            java.lang.String r6 = r9.msgId     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "cn.jpush.android.NOTIFICATION_ID"
            int r6 = r9.notificationId     // Catch: java.lang.Throwable -> L5e
            r10.putInt(r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "cn.jpush.android.ALERT"
            java.lang.String r6 = r9.notificationContent     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "cn.jpush.android.ALERT_TYPE"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r6.<init>()     // Catch: java.lang.Throwable -> L5e
            int r7 = r9.notificationAlertType     // Catch: java.lang.Throwable -> L5e
            r6.append(r7)     // Catch: java.lang.Throwable -> L5e
            r6.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r9.notificationTitle     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L61
            java.lang.String r5 = "cn.jpush.android.NOTIFICATION_CONTENT_TITLE"
            java.lang.String r6 = r9.notificationTitle     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r10 = move-exception
            goto L199
        L61:
            java.lang.String r5 = r9.notificationExtras     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L70
            java.lang.String r5 = "cn.jpush.android.EXTRA"
            java.lang.String r6 = r9.notificationExtras     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
        L70:
            int r5 = r9.notificationStyle     // Catch: java.lang.Throwable -> L5e
            r6 = 1
            if (r5 != r6) goto L82
            java.lang.String r5 = r9.notificationBigText     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L82
            java.lang.String r5 = "cn.jpush.android.BIG_TEXT"
            java.lang.String r6 = r9.notificationBigText     // Catch: java.lang.Throwable -> L5e
            goto L93
        L82:
            int r5 = r9.notificationStyle     // Catch: java.lang.Throwable -> L5e
            r6 = 2
            if (r5 != r6) goto L97
            java.lang.String r5 = r9.notificationInbox     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L97
            java.lang.String r5 = "cn.jpush.android.INBOX"
            java.lang.String r6 = r9.notificationInbox     // Catch: java.lang.Throwable -> L5e
        L93:
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
            goto La9
        L97:
            int r5 = r9.notificationStyle     // Catch: java.lang.Throwable -> L5e
            r6 = 3
            if (r5 != r6) goto La9
            java.lang.String r5 = r9.notificationBigPicPath     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto La9
            java.lang.String r5 = "cn.jpush.android.BIG_PIC_PATH"
            java.lang.String r6 = r9.notificationBigPicPath     // Catch: java.lang.Throwable -> L5e
            goto L93
        La9:
            int r5 = r9.notificationPriority     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto Lc3
            java.lang.String r5 = "cn.jpush.android.NOTI_PRIORITY"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r6.<init>()     // Catch: java.lang.Throwable -> L5e
            int r7 = r9.notificationPriority     // Catch: java.lang.Throwable -> L5e
            r6.append(r7)     // Catch: java.lang.Throwable -> L5e
            r6.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Lc3:
            java.lang.String r5 = r9.notificationCategory     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto Ld2
            java.lang.String r5 = "cn.jpush.android.NOTI_CATEGORY"
            java.lang.String r6 = r9.notificationCategory     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Ld2:
            java.lang.String r5 = r9.notificationSmallIcon     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto Le1
            java.lang.String r5 = "cn.jpush.android.NOTIFICATION_SMALL_ICON"
            java.lang.String r6 = r9.notificationSmallIcon     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Le1:
            java.lang.String r5 = r9.notificationLargeIcon     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto Lf0
            java.lang.String r5 = "cn.jpush.android.NOTIFICATION_LARGE_ICON"
            java.lang.String r6 = r9.notificationLargeIcon     // Catch: java.lang.Throwable -> L5e
            r10.putString(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Lf0:
            java.lang.String r5 = r9.developerArg0     // Catch: java.lang.Throwable -> L5e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto Lff
            java.lang.String r5 = "cn.jpush.android.NOTIFICATION_DEVELOPER_ARG0"
            java.lang.String r6 = r9.developerArg0     // Catch: java.lang.Throwable -> L5e
            r4.putExtra(r5, r6)     // Catch: java.lang.Throwable -> L5e
        Lff:
            boolean r5 = r9.isRichPush     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L175
            int r5 = r9.richType     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L121
            r6 = 4
            if (r5 == r6) goto L121
            java.lang.String r5 = r9._webPagePath     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L121
            boolean r5 = r5.startsWith(r1)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L121
            java.lang.String r5 = r9._webPagePath     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r5.replaceFirst(r1, r2)     // Catch: java.lang.Throwable -> L5e
            r9._webPagePath = r1     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "cn.jpush.android.HTML_PATH"
            r4.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L5e
        L121:
            java.util.ArrayList<java.lang.String> r1 = r9.showResourceList     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L175
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5e
            if (r1 <= 0) goto L175
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r9.msgId     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = cn.jpush.android.ad.c.c(r8, r2)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList<java.lang.String> r5 = r9.showResourceList     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5e
        L13c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L16c
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = "http://"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L155
            r7 = 0
            java.lang.String r6 = cn.jpush.android.ad.c.a(r6, r7)     // Catch: java.lang.Throwable -> L5e
        L155:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L166
        L15f:
            r1.append(r2)     // Catch: java.lang.Throwable -> L5e
            r1.append(r6)     // Catch: java.lang.Throwable -> L5e
            goto L13c
        L166:
            java.lang.String r7 = ","
            r1.append(r7)     // Catch: java.lang.Throwable -> L5e
            goto L15f
        L16c:
            java.lang.String r2 = "cn.jpush.android.HTML_RES"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            r4.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L5e
        L175:
            r4.putExtras(r10)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = r9.appId     // Catch: java.lang.Throwable -> L5e
            r4.addCategory(r10)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = r8.getPackageName()     // Catch: java.lang.Throwable -> L5e
            r4.setPackage(r10)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r10.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r9.appId     // Catch: java.lang.Throwable -> L5e
            r10.append(r1)     // Catch: java.lang.Throwable -> L5e
            r10.append(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5e
            r8.sendBroadcast(r4, r10)     // Catch: java.lang.Throwable -> L5e
            return
        L199:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sendNotificationReceivedBroadcast error:"
            r1.append(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            cn.jpush.android.helper.Logger.ww(r3, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.appId
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.ad.a.a(r8, r4, r9)
            return
        L1c6:
            java.lang.String r8 = "Send broad cast to app failed,the params are incorrect!"
            cn.jpush.android.helper.Logger.dd(r3, r8)
            return
    }

    public static void a(cn.jpush.android.service.JPushMessageReceiver r9, android.content.Context r10, android.content.Intent r11) {
            java.lang.String r0 = "message"
            java.lang.String r1 = "cmd"
            java.lang.String r2 = "code"
            java.lang.String r3 = "JMessageReceiverHelper"
            r4 = -2
            int r5 = r11.getIntExtra(r2, r4)     // Catch: java.lang.Throwable -> L45
            int r4 = r11.getIntExtra(r1, r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r11.getStringExtra(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r7.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "[callCmdMessage] code:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L45
            r7.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = ",cmd:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L45
            r7.append(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = ",message:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L45
            r7.append(r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.helper.Logger.d(r3, r7)     // Catch: java.lang.Throwable -> L45
            android.os.Bundle r11 = r11.getExtras()     // Catch: java.lang.Throwable -> L45
            r7 = -1
            r8 = 0
            if (r4 != r7) goto L48
            r9.onConnected(r10, r8)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r9 = move-exception
            goto Ld1
        L48:
            if (r4 != 0) goto L59
            if (r5 != 0) goto L50
            r9.onRegister(r10, r6)     // Catch: java.lang.Throwable -> L45
            return
        L50:
            cn.jpush.android.api.CmdMessage r0 = new cn.jpush.android.api.CmdMessage     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4, r5, r6, r11)     // Catch: java.lang.Throwable -> L45
            r9.onCommandResult(r10, r0)     // Catch: java.lang.Throwable -> L45
            return
        L59:
            r7 = 1
            if (r4 != r7) goto L80
            r9.onConnected(r10, r7)     // Catch: java.lang.Throwable -> L45
            boolean r11 = cn.jpush.android.helper.a.a     // Catch: java.lang.Throwable -> L45
            if (r11 != 0) goto Ld0
            cn.jpush.android.helper.a.a = r7     // Catch: java.lang.Throwable -> L45
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Throwable -> L45
            r11.<init>()     // Catch: java.lang.Throwable -> L45
            r4 = 2008(0x7d8, float:2.814E-42)
            r11.putInt(r1, r4)     // Catch: java.lang.Throwable -> L45
            r11.putInt(r2, r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "success"
            r11.putString(r0, r1)     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.api.CmdMessage r0 = new cn.jpush.android.api.CmdMessage     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4, r8, r6, r11)     // Catch: java.lang.Throwable -> L45
            r9.onCommandResult(r10, r0)     // Catch: java.lang.Throwable -> L45
            return
        L80:
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r4 == r0) goto Ld0
            r0 = 2009(0x7d9, float:2.815E-42)
            if (r4 == r0) goto Lc8
            r0 = 2011(0x7db, float:2.818E-42)
            if (r4 == r0) goto Lab
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r4 == r0) goto Lc8
            switch(r4) {
                case 2003: goto Lc8;
                case 2004: goto Lc8;
                case 2005: goto Lc8;
                case 2006: goto Lc8;
                case 2007: goto Lc8;
                default: goto L93;
            }     // Catch: java.lang.Throwable -> L45
        L93:
            switch(r4) {
                case 100001: goto Lc8;
                case 100002: goto Lc8;
                case 100003: goto Lc8;
                case 100004: goto Lc8;
                case 100005: goto Lc8;
                default: goto L96;
            }     // Catch: java.lang.Throwable -> L45
        L96:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r9.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "unkown cmd:"
            r9.append(r10)     // Catch: java.lang.Throwable -> L45
            r9.append(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.helper.Logger.dd(r3, r9)     // Catch: java.lang.Throwable -> L45
            return
        Lab:
            java.lang.String r9 = "debug_110"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r11.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "CMD_TCP_STATE code="
            r11.append(r0)     // Catch: java.lang.Throwable -> L45
            r11.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L45
            cn.jpush.android.helper.Logger.d(r9, r11)     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto Lc4
            r8 = 1
        Lc4:
            cn.jpush.android.cache.a.b(r10, r8)     // Catch: java.lang.Throwable -> L45
            return
        Lc8:
            cn.jpush.android.api.CmdMessage r0 = new cn.jpush.android.api.CmdMessage     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4, r5, r6, r11)     // Catch: java.lang.Throwable -> L45
            r9.onCommandResult(r10, r0)     // Catch: java.lang.Throwable -> L45
        Ld0:
            return
        Ld1:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "callCmdMessage failed:"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.e(r3, r9)
            return
    }

    private static boolean a(android.content.Context r3) {
            java.lang.String r0 = "JMessageReceiverHelper"
            int r1 = cn.jpush.android.m.a.f1834c     // Catch: java.lang.Throwable -> Lf
            r2 = 470(0x1d6, float:6.59E-43)
            if (r1 >= r2) goto L11
            java.lang.String r3 = "jcore < 470"
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            return r3
        Lf:
            r3 = move-exception
            goto L5b
        L11:
            java.lang.Boolean r1 = cn.jpush.android.helper.a.f1807c     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L1a
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lf
            return r3
        L1a:
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "cn.jpush.android.service.InitProvider"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lf
            android.content.pm.ComponentInfo r1 = cn.jpush.android.ad.a.a(r3, r1, r2)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L51
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.processName     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.helper.a.f1807c = r3     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "isSupportProvider info="
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = cn.jpush.android.helper.a.f1807c     // Catch: java.lang.Throwable -> Lf
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Lf
            goto L73
        L51:
            java.lang.String r3 = "ComponentInfo is null"
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lf
            cn.jpush.android.helper.a.f1807c = r3     // Catch: java.lang.Throwable -> Lf
            goto L73
        L5b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            cn.jpush.android.helper.a.f1807c = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "throwable="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r3)
        L73:
            java.lang.Boolean r3 = cn.jpush.android.helper.a.f1807c
            boolean r3 = r3.booleanValue()
            return r3
    }

    private void b() {
            r7 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 10
            r0.<init>(r1, r2, r3, r5, r6)
            r7.f1808b = r0
            r0.allowCoreThreadTimeOut(r1)
            return
    }

    public static void b(android.content.Context r4, android.content.Intent r5) {
            java.lang.String r0 = "JMessageReceiverHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "Click notification action with extra: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            android.os.Bundle r2 = r5.getExtras()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "cn.jpush.android.NOTIFIACATION_ACTION_EXTRA"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L55
            r1.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L55
            cn.jpush.android.helper.Logger.i(r0, r1)     // Catch: java.lang.Throwable -> L55
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55
            android.os.Bundle r5 = r5.getExtras()     // Catch: java.lang.Throwable -> L55
            r1.putExtras(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r4.getPackageName()     // Catch: java.lang.Throwable -> L55
            r1.addCategory(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r4.getPackageName()     // Catch: java.lang.Throwable -> L55
            r1.setPackage(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L55
            r5.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = ".permission.JPUSH_MESSAGE"
            r5.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55
            r4.sendBroadcast(r1, r5)     // Catch: java.lang.Throwable -> L55
            return
        L55:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Click notification sendBroadcast :"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r4)
            return
    }

    public static void b(android.content.Context r9, cn.jpush.android.service.JPushMessageReceiver r10, android.content.Intent r11) {
            java.lang.String r1 = "JMessageReceiverHelper"
            if (r11 != 0) goto Le
            java.lang.String r9 = "intent  was null"
        L6:
            cn.jpush.android.helper.Logger.w(r1, r9)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            r9 = r0
            goto L254
        Le:
            if (r10 != 0) goto L19
            cn.jpush.android.service.JPushMessageReceiver r10 = cn.jpush.android.local.JPushConstants.getPushMessageReceiver(r9)     // Catch: java.lang.Throwable -> La
            if (r10 != 0) goto L19
            java.lang.String r9 = "jPushMessageReceiver  was null"
            goto L6
        L19:
            r2 = r10
            java.lang.String r10 = r11.getAction()     // Catch: java.lang.Throwable -> La
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r0.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "do receiver action :"
            r0.append(r3)     // Catch: java.lang.Throwable -> La
            r0.append(r10)     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> La
            if (r10 != 0) goto L37
            java.lang.String r9 = "Unexpected error, action is null"
            goto L6
        L37:
            java.lang.String r0 = "tag_alias_message"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La2
            java.lang.String r10 = "message_type"
            r0 = -1
            int r10 = r11.getIntExtra(r10, r0)     // Catch: java.lang.Throwable -> La
            r0 = 3
            r3 = 2
            r4 = 1
            if (r4 == r10) goto L52
            if (r3 == r10) goto L52
            if (r0 != r10) goto L50
            goto L52
        L50:
            r11 = 0
            goto L5a
        L52:
            cn.jpush.android.ab.d r5 = cn.jpush.android.ab.d.a()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.api.JPushMessage r11 = r5.a(r9, r11)     // Catch: java.lang.Throwable -> La
        L5a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r5.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = "messageType:"
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            r5.append(r10)     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = ",jPushMessage:"
            r5.append(r6)     // Catch: java.lang.Throwable -> La
            r5.append(r11)     // Catch: java.lang.Throwable -> La
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.helper.Logger.d(r1, r5)     // Catch: java.lang.Throwable -> La
            if (r11 != 0) goto L7b
            java.lang.String r9 = "parse tagalias message failed"
            goto L6
        L7b:
            if (r10 != r4) goto L8d
            boolean r10 = r11.isTagCheckOperator()     // Catch: java.lang.Throwable -> La
            if (r10 == 0) goto L88
            r2.onCheckTagOperatorResult(r9, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        L88:
            r2.onTagOperatorResult(r9, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        L8d:
            if (r10 != r3) goto L94
            r2.onAliasOperatorResult(r9, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        L94:
            if (r10 != r0) goto L9b
            r2.onPropertyOperatorResult(r9, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        L9b:
            java.lang.String r9 = "unsupport message type"
            cn.jpush.android.helper.Logger.w(r1, r9)     // Catch: java.lang.Throwable -> La
            goto L26c
        La2:
            java.lang.String r0 = "mobile_result"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lb7
            cn.jpush.android.helper.d r10 = cn.jpush.android.helper.d.a()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.api.JPushMessage r10 = r10.a(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onMobileNumberOperatorResult(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        Lb7:
            java.lang.String r0 = "custom_msg"
            java.lang.String r0 = cn.jpush.android.ad.a.e(r9, r0)     // Catch: java.lang.Throwable -> La
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lcc
            cn.jpush.android.api.CustomMessage r10 = cn.jpush.android.d.b.a(r11)     // Catch: java.lang.Throwable -> La
            r2.onMessage(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        Lcc:
            java.lang.String r0 = "cmd_msg"
            java.lang.String r0 = cn.jpush.android.ad.a.e(r9, r0)     // Catch: java.lang.Throwable -> La
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ldd
            a(r2, r9, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        Ldd:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_ARRIVED"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lee
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onNotifyMessageArrived(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        Lee:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_UN_SHOW"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lff
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> L26c
            r2.onNotifyMessageUnShow(r9, r10)     // Catch: java.lang.Throwable -> L26c
            goto L26c
        Lff:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L110
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onNotifyMessageOpened(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        L110:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_DISMISS"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L121
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onNotifyMessageDismiss(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        L121:
            java.lang.String r0 = "cn.jpush.android.intent.IN_APP_MSG_SHOW"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L132
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onInAppMessageShow(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        L132:
            java.lang.String r0 = "cn.jpush.android.intent.IN_APP_MSG_CLICK"
            boolean r0 = r10.equals(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L143
            cn.jpush.android.api.NotificationMessage r10 = cn.jpush.android.x.b.c(r9, r11)     // Catch: java.lang.Throwable -> La
            r2.onInAppMessageClick(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        L143:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY"
            java.lang.String r3 = r11.getAction()     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L168
            android.content.Intent r10 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> La
            android.os.Bundle r0 = r11.getExtras()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L163
            android.os.Bundle r11 = r11.getExtras()     // Catch: java.lang.Throwable -> La
            r10.putExtras(r11)     // Catch: java.lang.Throwable -> La
        L163:
            r2.onMultiActionClicked(r9, r10)     // Catch: java.lang.Throwable -> La
            goto L26c
        L168:
            java.lang.String r0 = "on_noti_settings_check"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L182
            java.lang.String r10 = "isOn"
            r0 = 0
            boolean r10 = r11.getBooleanExtra(r10, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "source"
            int r11 = r11.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> La
            r2.onNotificationSettingsCheck(r9, r10, r11)     // Catch: java.lang.Throwable -> La
            goto L26c
        L182:
            java.lang.String r0 = "cn.jpush.android.intent.GEO_RECEIVED"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = ""
            java.lang.String r4 = "geo"
            if (r0 == 0) goto L19f
            java.lang.String r10 = r11.getStringExtra(r4)     // Catch: java.lang.Throwable -> La
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> La
            if (r11 == 0) goto L199
            goto L19a
        L199:
            r3 = r10
        L19a:
            r2.onGeofenceReceived(r9, r3)     // Catch: java.lang.Throwable -> La
            goto L26c
        L19f:
            java.lang.String r0 = "cn.jpush.android.intent.GEO_REGION"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L1bf
            java.lang.String r4 = r11.getStringExtra(r4)     // Catch: java.lang.Throwable -> La
            java.lang.String r10 = "geoLat"
            r5 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r7 = r11.getDoubleExtra(r10, r5)     // Catch: java.lang.Throwable -> La
            java.lang.String r10 = "geoLng"
            double r5 = r11.getDoubleExtra(r10, r5)     // Catch: java.lang.Throwable -> La
            r3 = r9
            r2.onGeofenceRegion(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> La
            goto L26c
        L1bf:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFY_INAPP_MESSAGE_ARRIVED"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L1dd
            cn.jpush.android.d.d r10 = cn.jpush.android.x.b.b(r9, r11)     // Catch: java.lang.Throwable -> La
            java.lang.String r11 = "notify inapp received by receiver"
            cn.jpush.android.helper.Logger.d(r1, r11)     // Catch: java.lang.Throwable -> La
            if (r10 == 0) goto L26c
            cn.jpush.android.q.a r11 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> La
            r0 = 1001(0x3e9, float:1.403E-42)
            r11.a(r9, r10, r0)     // Catch: java.lang.Throwable -> La
            goto L26c
        L1dd:
            java.lang.String r0 = "check_can_show_message"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L1f6
            cn.jpush.android.d.d r10 = cn.jpush.android.x.b.b(r9, r11)     // Catch: java.lang.Throwable -> La
            if (r10 == 0) goto L26c
            cn.jpush.android.q.a r11 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> La
            r0 = 1006(0x3ee, float:1.41E-42)
            r11.a(r9, r10, r0)     // Catch: java.lang.Throwable -> La
            goto L26c
        L1f6:
            java.lang.String r0 = "handle_message_failed"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L20e
            cn.jpush.android.d.d r10 = cn.jpush.android.x.b.b(r9, r11)     // Catch: java.lang.Throwable -> La
            if (r10 == 0) goto L26c
            cn.jpush.android.q.a r11 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> La
            r0 = 1007(0x3ef, float:1.411E-42)
            r11.a(r9, r10, r0)     // Catch: java.lang.Throwable -> La
            goto L26c
        L20e:
            java.lang.String r0 = "cn.jpush.android.intent.NOTIFY_INAPP_MESSAGE_CANCEL"
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L23f
            cn.jpush.android.d.d r10 = cn.jpush.android.x.b.b(r9, r11)     // Catch: java.lang.Throwable -> La
            if (r10 == 0) goto L225
            cn.jpush.android.q.a r11 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> La
            r0 = 1004(0x3ec, float:1.407E-42)
            r11.a(r9, r10, r0)     // Catch: java.lang.Throwable -> La
        L225:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r9.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r11 = "notify inapp cancel cmd, cancel messageId: "
            r9.append(r11)     // Catch: java.lang.Throwable -> La
            if (r10 != 0) goto L232
            goto L234
        L232:
            java.lang.String r3 = r10.f1757d     // Catch: java.lang.Throwable -> La
        L234:
            r9.append(r3)     // Catch: java.lang.Throwable -> La
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.helper.Logger.dd(r1, r9)     // Catch: java.lang.Throwable -> La
            goto L26c
        L23f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r9.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r11 = "unsupport action type, action: "
            r9.append(r11)     // Catch: java.lang.Throwable -> La
            r9.append(r10)     // Catch: java.lang.Throwable -> La
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La
            cn.jpush.android.helper.Logger.d(r1, r9)     // Catch: java.lang.Throwable -> La
            goto L26c
        L254:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "MessageReceiver run failed:"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jpush.android.helper.Logger.ww(r1, r9)
        L26c:
            return
    }

    public void a(android.content.Context r3, cn.jpush.android.service.JPushMessageReceiver r4, android.content.Intent r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f1808b
            if (r0 == 0) goto Ld
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L10
        Ld:
            r2.b()
        L10:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f1808b
            cn.jpush.android.helper.a$a r1 = new cn.jpush.android.helper.a$a
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }
}
