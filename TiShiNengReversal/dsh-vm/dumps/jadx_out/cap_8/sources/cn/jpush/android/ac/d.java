package cn.jpush.android.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public static int a;

    static {
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jpush.android.d.d a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            cn.jpush.android.d.d r0 = cn.jpush.android.d.d.a(r0, r1, r2)
            return r0
    }

    private static void a(android.content.Context r3, cn.jpush.android.d.d r4) {
            r0 = 2
            int r1 = r4.ad
            java.lang.String r2 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            if (r0 != r1) goto Lc
            android.content.Intent r4 = cn.jpush.android.x.b.b(r3, r2, r4)
            goto L10
        Lc:
            android.content.Intent r4 = cn.jpush.android.x.b.a(r3, r2, r4)
        L10:
            if (r4 == 0) goto L22
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r4.addFlags(r0)
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r3.startActivity(r4)
        L22:
            return
    }

    private static void a(android.content.Context r7, cn.jpush.android.d.d r8, java.lang.String r9, int r10) {
            java.lang.String r10 = "PluginPlatformsNotificationHelper"
            java.lang.String r0 = "Action - onNotificationMessageArrived"
            cn.jpush.android.helper.Logger.v(r10, r0)
            java.lang.String r10 = "cn.jpush.android.intent.NOTIFICATION_ARRIVED"
            r0 = 0
            cn.jpush.android.x.b.a(r7, r10, r8, r0)
            java.lang.String r1 = r8.f1757d
            byte r3 = r8.ai
            r4 = 1018(0x3fa, double:5.03E-321)
            r6 = r7
            r2 = r9
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6, byte r7, int r8) {
            java.lang.String r0 = "PluginPlatformsNotificationHelper"
            if (r3 != 0) goto La
            java.lang.String r3 = "context was null"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
        La:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L16
            java.lang.String r3 = "content was null"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "message content:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.v(r0, r1)
            cn.jpush.android.d.d r4 = a(r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "entity:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.v(r0, r1)
            if (r4 != 0) goto L4a
            java.lang.String r3 = "entity was null"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
        L4a:
            java.lang.String r1 = r4.f1757d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L58
            java.lang.String r3 = "message id was empty"
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
        L58:
            r4.ai = r7
            r4.f1758e = r6
            r7 = 1
            if (r8 == 0) goto L6d
            if (r8 == r7) goto L69
            r7 = 2
            if (r8 == r7) goto L65
            return
        L65:
            b(r3, r4, r5, r6)
            return
        L69:
            a(r3, r4, r5, r6)
            return
        L6d:
            c(r3, r4, r5, r6)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.String r4 = r4.f1757d
            r5.add(r4)
            cn.jpush.android.x.d.a(r3, r5, r7)
            return
    }

    private static void b(android.content.Context r7, cn.jpush.android.d.d r8, java.lang.String r9, int r10) {
            java.lang.String r0 = "PluginPlatformsNotificationHelper"
            java.lang.String r1 = "Action - onNotificationMessageUnShow in foreground"
            cn.jpush.android.helper.Logger.v(r0, r1)
            r8.f1758e = r10
            java.lang.String r10 = "cn.jpush.android.intent.NOTIFICATION_UN_SHOW"
            r0 = 0
            cn.jpush.android.x.b.a(r7, r10, r8, r0)
            java.lang.String r1 = r8.f1757d
            byte r3 = r8.ai
            r4 = 1060(0x424, double:5.237E-321)
            r6 = r7
            r2 = r9
            cn.jpush.android.helper.c.a(r1, r2, r3, r4, r6)
            return
    }

    private static void c(android.content.Context r0, cn.jpush.android.d.d r1, java.lang.String r2, int r3) {
            java.lang.String r2 = "PluginPlatformsNotificationHelper"
            java.lang.String r3 = "Action - onNotificationMessageClick"
            cn.jpush.android.helper.Logger.v(r2, r3)
            boolean r2 = r1.Y
            if (r2 != 0) goto L12
            java.lang.String r2 = "cn.jpush.android.intent.NOTIFICATION_OPENED"
            r3 = 0
            cn.jpush.android.x.b.a(r0, r2, r1, r3)
            return
        L12:
            byte r2 = r1.ai
            r3 = 8
            if (r2 != r3) goto L1b
            a(r0, r1)
        L1b:
            return
    }
}
