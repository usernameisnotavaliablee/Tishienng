package cn.jpush.android.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static volatile cn.jpush.android.v.a a;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f1962e = null;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f1963b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f1964c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1965d;



    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.v.a.f1962e = r0
            return
    }

    private a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1963b = r0
            r2.f1964c = r0
            java.lang.String r0 = ""
            r2.f1965d = r0
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "Constructor : JPushLocalNotificationCenter"
            cn.jpush.android.helper.Logger.d(r0, r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f1963b = r0
            r2.f1964c = r3
            java.lang.String r3 = r3.getPackageName()
            r2.f1965d = r3
            return
    }

    static /* synthetic */ android.content.Context a(cn.jpush.android.v.a r0) {
            android.content.Context r0 = r0.f1964c
            return r0
    }

    public static cn.jpush.android.v.a a(android.content.Context r2) {
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "getInstance"
            cn.jpush.android.helper.Logger.v(r0, r1)
            cn.jpush.android.v.a r0 = cn.jpush.android.v.a.a
            if (r0 != 0) goto L20
            java.lang.Object r0 = cn.jpush.android.v.a.f1962e
            monitor-enter(r0)
            cn.jpush.android.v.a r1 = cn.jpush.android.v.a.a     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            cn.jpush.android.v.a r1 = new cn.jpush.android.v.a     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            cn.jpush.android.v.a.a = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L20:
            cn.jpush.android.v.a r2 = cn.jpush.android.v.a.a
            return r2
    }

    private synchronized void a(long r2, long r4, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r6 = "JPushLocalNotificationCenter"
            java.lang.String r0 = "LocalNotification scheduleReadiedLN"
            cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L24
            android.os.Handler r6 = r1.f1963b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L41
            cn.jpush.android.v.a$2 r6 = new cn.jpush.android.v.a$2     // Catch: java.lang.Throwable -> L24
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L26
            java.lang.String r2 = "JPushLocalNotificationCenter"
            java.lang.String r3 = "post right now "
            cn.jpush.android.helper.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L24
            android.os.Handler r2 = r1.f1963b     // Catch: java.lang.Throwable -> L24
            r2.post(r6)     // Catch: java.lang.Throwable -> L24
            goto L41
        L24:
            r2 = move-exception
            goto L43
        L26:
            java.lang.String r2 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "post delayed : "
            r3.append(r0)     // Catch: java.lang.Throwable -> L24
            r3.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L24
            cn.jpush.android.helper.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L24
            android.os.Handler r2 = r1.f1963b     // Catch: java.lang.Throwable -> L24
            r2.postDelayed(r6, r4)     // Catch: java.lang.Throwable -> L24
        L41:
            monitor-exit(r1)
            return
        L43:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2
    }

    static /* synthetic */ void a(cn.jpush.android.v.a r0, android.content.Context r1) {
            r0.e(r1)
            return
    }

    private synchronized void e(android.content.Context r15) {
            r14 = this;
            monitor-enter(r14)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "triggerLNKillProcess"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.v.b r2 = cn.jpush.android.v.b.a(r15)     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            boolean r0 = r2.a(r1)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L8d
            r3 = 0
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r0 = 1
            android.database.Cursor r13 = r2.a(r0, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            if (r0 == 0) goto L55
        L23:
            cn.jpush.android.v.c r0 = cn.jpush.android.v.b.a(r13)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            if (r0 == 0) goto L4f
            java.lang.String r3 = r0.d()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            r14.a(r15, r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            java.lang.String r8 = r0.d()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            long r9 = r0.f()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            long r11 = r0.e()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            r5 = 0
            r6 = 0
            r7 = 0
            r2.b(r3, r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            goto L4f
        L47:
            r0 = move-exception
            r15 = r0
            r3 = r13
            goto L84
        L4b:
            r0 = move-exception
            r15 = r0
            r3 = r13
            goto L64
        L4f:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4b
            if (r0 != 0) goto L23
        L55:
            r13.close()     // Catch: java.lang.Throwable -> L5c
        L58:
            r2.b(r1)     // Catch: java.lang.Throwable -> L5c
            goto L94
        L5c:
            r0 = move-exception
            r15 = r0
            goto L96
        L5f:
            r0 = move-exception
            r15 = r0
            goto L84
        L62:
            r0 = move-exception
            r15 = r0
        L64:
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r4.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "triggerLNKillProcess: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L5f
            r4.append(r15)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r15 = r4.toString()     // Catch: java.lang.Throwable -> L5f
            cn.jpush.android.helper.Logger.ww(r0, r15)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L58
        L84:
            if (r3 == 0) goto L89
            r3.close()     // Catch: java.lang.Throwable -> L5c
        L89:
            r2.b(r1)     // Catch: java.lang.Throwable -> L5c
            throw r15     // Catch: java.lang.Throwable -> L5c
        L8d:
            java.lang.String r15 = "JPushLocalNotificationCenter"
            java.lang.String r0 = "init LocalNotification cast expt: db open failed"
            cn.jpush.android.helper.Logger.e(r15, r0)     // Catch: java.lang.Throwable -> L5c
        L94:
            monitor-exit(r14)
            return
        L96:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L5c
            throw r15
    }

    public synchronized void a(android.content.Context r16, cn.jpush.android.data.JPushLocalNotification r17) {
            r15 = this;
            monitor-enter(r15)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "add LocalNotification"
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L20
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L20
            long r0 = r17.getBroadcastTime()     // Catch: java.lang.Throwable -> L20
            long r13 = r0 - r11
            boolean r0 = cn.jpush.android.cache.a.e(r16)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "push has stopped"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r0 = move-exception
            goto L7e
        L22:
            long r3 = r17.getNotificationId()     // Catch: java.lang.Throwable -> L20
            cn.jpush.android.v.b r2 = cn.jpush.android.v.b.a(r16)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            r0 = 0
            cn.jpush.android.v.c r0 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            if (r0 == 0) goto L42
            java.lang.String r8 = r17.toJSON()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            long r9 = r17.getBroadcastTime()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            r5 = 1
            r6 = 0
            r7 = 0
            r2.b(r3, r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            goto L6b
        L40:
            r0 = move-exception
            goto L51
        L42:
            java.lang.String r8 = r17.toJSON()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            long r9 = r17.getBroadcastTime()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            r5 = 1
            r6 = 0
            r7 = 0
            r2.a(r3, r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L40
            goto L6b
        L51:
            java.lang.String r1 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "exception:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L20
            r2.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L20
            cn.jpush.android.helper.Logger.e(r1, r0)     // Catch: java.lang.Throwable -> L20
        L6b:
            r0 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7c
            long r3 = r17.getNotificationId()     // Catch: java.lang.Throwable -> L20
            r7 = 0
            r2 = r15
            r5 = r13
            r2.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L20
        L7c:
            monitor-exit(r15)
            return
        L7e:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    public void a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "start LocalNotification broadCastToPushService"
            java.lang.String r1 = "JPushLocalNotificationCenter"
            cn.jpush.android.helper.Logger.d(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "local_notify_msg"
            r0.putString(r2, r5)
            java.lang.String r5 = "JPUSH"
            java.lang.String r2 = "show_local_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r4, r5, r2, r0)
            java.lang.String r4 = "end LocalNotification broadCastToPushService"
            cn.jpush.android.helper.Logger.d(r1, r4)
            return
    }

    public synchronized boolean a(android.content.Context r6, long r7) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "remove LocalNotification "
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L3b
            int r8 = (int) r7
            long r7 = (long) r8
            r0 = 0
            cn.jpush.android.v.b r6 = cn.jpush.android.v.b.a(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            cn.jpush.android.v.c r1 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r2 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            java.lang.String r4 = "remove local count : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r3.append(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            cn.jpush.android.helper.Logger.d(r2, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r6.a(r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            android.content.Context r6 = r5.f1964c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            int r8 = (int) r7     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            cn.jpush.android.api.JPushInterface.clearNotificationById(r6, r8)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            monitor-exit(r5)
            r6 = 1
            return r6
        L3b:
            r6 = move-exception
            goto L5d
        L3d:
            r6 = move-exception
            goto L41
        L3f:
            monitor-exit(r5)
            return r0
        L41:
            java.lang.String r7 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r8.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "exception:"
            r8.append(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L3b
            r8.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jpush.android.helper.Logger.e(r7, r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r5)
            return r0
        L5d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    public synchronized void b(android.content.Context r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "clear all local notification "
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L2a
            cn.jpush.android.v.b r5 = cn.jpush.android.v.b.a(r5)     // Catch: java.lang.Throwable -> L2a
            int[] r5 = r5.a()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L2c
            int r0 = r5.length     // Catch: java.lang.Throwable -> L2a
            if (r0 <= 0) goto L2c
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = " success"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L2a
            int r0 = r5.length     // Catch: java.lang.Throwable -> L2a
            r1 = 0
        L1e:
            if (r1 >= r0) goto L2c
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L2a
            android.content.Context r3 = r4.f1964c     // Catch: java.lang.Throwable -> L2a
            cn.jpush.android.api.JPushInterface.clearNotificationById(r3, r2)     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 + 1
            goto L1e
        L2a:
            r5 = move-exception
            goto L2e
        L2c:
            monitor-exit(r4)
            return
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    public synchronized void c(android.content.Context r12) {
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "init LocalNotification"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.v.b r12 = cn.jpush.android.v.b.a(r12)     // Catch: java.lang.Throwable -> L83
            r1 = 0
            boolean r0 = r12.a(r1)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L79
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5 = 300000(0x493e0, double:1.482197E-318)
            android.database.Cursor r2 = r12.a(r3, r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r0 == 0) goto L4c
        L25:
            cn.jpush.android.v.c r0 = cn.jpush.android.v.b.a(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r0 == 0) goto L44
            long r6 = r0.a()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r8 = r0.f()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            long r8 = r8 - r3
            r10 = 0
            r5 = r11
            r5.a(r6, r8, r10)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L45
        L3a:
            r0 = move-exception
            goto L70
        L3c:
            r0 = move-exception
            goto L57
        L3e:
            r0 = move-exception
            r5 = r11
            goto L70
        L41:
            r0 = move-exception
            r5 = r11
            goto L57
        L44:
            r5 = r11
        L45:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 != 0) goto L25
            goto L4d
        L4c:
            r5 = r11
        L4d:
            r2.close()     // Catch: java.lang.Throwable -> L54
        L50:
            r12.b(r1)     // Catch: java.lang.Throwable -> L54
            goto L81
        L54:
            r0 = move-exception
        L55:
            r12 = r0
            goto L86
        L57:
            java.lang.String r3 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "init LocalNotification cast expt:"
            r4.append(r6)     // Catch: java.lang.Throwable -> L3a
            r4.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3a
            cn.jpush.android.helper.Logger.e(r3, r0)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L50
            goto L4d
        L70:
            if (r2 == 0) goto L75
            r2.close()     // Catch: java.lang.Throwable -> L54
        L75:
            r12.b(r1)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L79:
            r5 = r11
            java.lang.String r12 = "JPushLocalNotificationCenter"
            java.lang.String r0 = "init LocalNotification cast expt: db open failed"
            cn.jpush.android.helper.Logger.e(r12, r0)     // Catch: java.lang.Throwable -> L54
        L81:
            monitor-exit(r11)
            return
        L83:
            r0 = move-exception
            r5 = r11
            goto L55
        L86:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L54
            throw r12
    }

    public void d(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "LocalNotification onHeartBeat"
            java.lang.String r1 = "JPushLocalNotificationCenter"
            cn.jpush.android.helper.Logger.d(r1, r0)
            cn.jpush.android.v.a$1 r0 = new cn.jpush.android.v.a$1
            java.lang.String r2 = "JPushLocationNotificationCenter#onHeartBeat"
            r0.<init>(r3, r2, r4)
            cn.jpush.android.helper.JCoreHelper.futureExecutor(r4, r1, r0)
            return
    }
}
