package cn.jpush.android.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {
    public static android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f1788b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f1789c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1790d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f1791e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicLong f1792f;

    /* renamed from: g, reason: collision with root package name */
    private static cn.jpush.android.g.a f1793g;

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f1794h;

    /* renamed from: i, reason: collision with root package name */
    private static java.lang.Boolean f1795i;

    /* renamed from: j, reason: collision with root package name */
    private static java.util.concurrent.ExecutorService f1796j;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            cn.jpush.android.f.c.f1792f = r0
            r0 = 0
            cn.jpush.android.f.c.f1789c = r0
            r0 = 0
            cn.jpush.android.f.c.f1790d = r0
            java.lang.String r0 = "com.asus.as"
            cn.jpush.android.f.c.f1791e = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            cn.jpush.android.f.c.f1796j = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a() {
            java.util.concurrent.atomic.AtomicLong r0 = cn.jpush.android.f.c.f1792f
            long r0 = r0.incrementAndGet()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            java.util.concurrent.atomic.AtomicLong r2 = cn.jpush.android.f.c.f1792f
            r3 = 0
            r2.set(r3)
        L16:
            return r0
    }

    public static void a(android.content.Context r1, java.lang.String r2, long r3, org.json.JSONObject r5) {
            boolean r1 = c(r1)
            if (r1 != 0) goto L7
            return
        L7:
            java.util.concurrent.ExecutorService r1 = cn.jpush.android.f.c.f1796j
            cn.jpush.android.f.d r0 = new cn.jpush.android.f.d
            r0.<init>(r2, r3, r5)
            r1.execute(r0)
            return
    }

    static /* synthetic */ void a(java.lang.String r4, long r5, org.json.JSONObject r7) {
            cn.jpush.android.g.a r0 = cn.jpush.android.f.c.f1793g
            if (r0 == 0) goto L9
            boolean r0 = r0.b()
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "Gobal"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "connect has disconnect, will reconnect."
            cn.jpush.android.i.b.a(r1, r0)
            cn.jpush.android.g.a r0 = cn.jpush.android.f.c.f1793g
            if (r0 == 0) goto L1a
            r0.a()
        L1a:
            if (r7 != 0) goto L21
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L21:
            java.lang.String r0 = "JPUSH_PACKAGE"
            java.lang.String r2 = cn.jpush.android.f.c.f1789c     // Catch: java.lang.Throwable -> L5b
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L32
            long r5 = a()     // Catch: java.lang.Throwable -> L5b
        L32:
            java.lang.String r0 = "JPUSH_RID"
            r7.put(r0, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "cmd:"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r6.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = ",data:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L5b
            r6.append(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.i.b.c(r1, r6)     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.g.a r6 = cn.jpush.android.f.c.f1793g     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L5b
            r6.a(r4, r5)     // Catch: java.lang.Throwable -> L5b
        L5b:
            return
    }

    public static boolean a(android.content.Context r1) {
            java.lang.String r0 = cn.jpush.android.f.c.f1791e
            boolean r1 = cn.jpush.android.g.c.a(r1, r0)
            return r1
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = "Gobal"
            java.lang.String r1 = cn.jpush.android.f.c.f1794h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld
            java.lang.String r4 = cn.jpush.android.f.c.f1794h
            return r4
        Ld:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "com.ups.push.PUSH_RESPONSE"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4b
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<cn.jiguang.push.asus.PushMessageReceiver> r2 = cn.jiguang.push.asus.PushMessageReceiver.class
            android.content.pm.ComponentInfo r4 = cn.jpush.android.j.a.a(r4, r1, r2)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L61
            java.lang.String r4 = r4.name     // Catch: java.lang.Throwable -> L4b
            cn.jpush.android.f.c.f1794h = r4     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "found userServiceClass :"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = cn.jpush.android.f.c.f1794h     // Catch: java.lang.Throwable -> L4b
            r4.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = " by getComponentInfo"
            r4.append(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "ASUS_PUSH"
            r2 = 0
            r3 = 4
            cn.jpush.android.i.a.a(r1, r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L4b
            goto L61
        L4b:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not found PushMessageReceiver :"
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jpush.android.i.b.e(r0, r4)
        L61:
            java.lang.String r4 = cn.jpush.android.f.c.f1794h
            return r4
    }

    private static boolean c(android.content.Context r6) {
            java.lang.String r0 = "asus_default_channel_id"
            java.lang.Boolean r1 = cn.jpush.android.f.c.f1795i
            if (r1 == 0) goto Lb
            boolean r6 = r1.booleanValue()
            return r6
        Lb:
            r1 = 0
            java.lang.String r2 = "Gobal"
            if (r6 != 0) goto L16
            java.lang.String r6 = "context is null"
            cn.jpush.android.i.b.g(r2, r6)
            return r1
        L16:
            boolean r3 = cn.jpush.android.j.a.a(r6)
            r4 = 0
            java.lang.String r5 = "ConnectionFactory"
            if (r3 != 0) goto L25
            java.lang.String r3 = "Manufacturer not match, give up create connection."
        L21:
            cn.jpush.android.i.b.f(r5, r3)
            goto L35
        L25:
            java.lang.String r3 = cn.jpush.android.f.c.f1791e
            boolean r3 = cn.jpush.android.g.c.a(r6, r3)
            if (r3 != 0) goto L30
            java.lang.String r3 = "cn.jpush.android.service.PushManagerService not exist in system, give up create connection."
            goto L21
        L30:
            cn.jpush.android.g.d r4 = new cn.jpush.android.g.d
            r4.<init>()
        L35:
            cn.jpush.android.f.c.f1793g = r4
            if (r4 != 0) goto L43
            java.lang.String r6 = "unsupport this device."
            cn.jpush.android.i.b.g(r2, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            cn.jpush.android.f.c.f1795i = r6
            return r1
        L43:
            android.content.Context r1 = r6.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            cn.jpush.android.f.c.a = r1
            java.lang.String r1 = r1.getPackageName()
            cn.jpush.android.f.c.f1789c = r1
            cn.jpush.android.a.a.a(r6)
            java.lang.String r1 = "notification"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L7e
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6     // Catch: java.lang.Throwable -> L7e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7e
            r3 = 26
            if (r1 < r3) goto L94
            android.app.NotificationChannel r1 = cn.jiguang.av.y.a(r6, r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L94
            java.lang.String r1 = "create default channel:默认"
            cn.jpush.android.i.b.b(r2, r1)     // Catch: java.lang.Throwable -> L7e
            cn.jpush.android.f.g.a()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "默认"
            r3 = 3
            android.app.NotificationChannel r0 = cn.jiguang.av.b0.a(r0, r1, r3)     // Catch: java.lang.Throwable -> L7e
            cn.jiguang.av.z.a(r6, r0)     // Catch: java.lang.Throwable -> L7e
            goto L94
        L7e:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[initNotificationChannel] failed:"
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jpush.android.i.b.e(r2, r6)
        L94:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            cn.jpush.android.f.c.f1795i = r6
            r6 = 1
            return r6
    }
}
