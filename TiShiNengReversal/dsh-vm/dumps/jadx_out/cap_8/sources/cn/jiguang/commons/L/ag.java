package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ag {
    private static volatile long a;

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f859c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile long f860d;

    static {
            return
    }

    public ag() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a() {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            long r2 = cn.jiguang.commons.L.ag.f860d
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L23
            java.lang.Class<cn.jiguang.commons.L.ag> r2 = cn.jiguang.commons.L.ag.class
            monitor-enter(r2)
            long r3 = cn.jiguang.commons.L.ag.f860d     // Catch: java.lang.Throwable -> L1d
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L1f
            g()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.L.ag.f860d = r0     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L21
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L23:
            long r0 = cn.jiguang.commons.L.ag.f859c
            return r0
    }

    private static cn.jiguang.commons.c.d a(java.util.Map r1, java.lang.String r2) {
            java.lang.Object r0 = r1.get(r2)
            cn.jiguang.commons.c.d r0 = (cn.jiguang.commons.c.d) r0
            if (r0 != 0) goto L12
            cn.jiguang.commons.c.d r0 = new cn.jiguang.commons.c.d
            r0.<init>()
            r0.a = r2
            r1.put(r2, r0)
        L12:
            return r0
    }

    private static void a(android.app.usage.UsageEvents r3, java.util.List r4) {
        L0:
            boolean r0 = r3.hasNextEvent()
            if (r0 == 0) goto L24
            android.app.usage.UsageEvents$Event r0 = new android.app.usage.UsageEvents$Event
            r0.<init>()
            r3.getNextEvent(r0)
            int r1 = r0.getEventType()
            r2 = 1
            if (r1 != r2) goto L0
            cn.jiguang.commons.c.d r1 = new cn.jiguang.commons.c.d
            r1.<init>()
            java.lang.String r0 = r0.getPackageName()
            r1.a = r0
            r4.add(r1)
            goto L0
        L24:
            return
    }

    private static void a(android.app.usage.UsageStatsManager r1, java.util.Map r2, long r3, long r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.app.usage.UsageEvents r1 = r1.queryEvents(r3, r5)     // Catch: java.lang.Exception -> Lf
            a(r1, r0)     // Catch: java.lang.Exception -> Lf
            a(r0, r2)     // Catch: java.lang.Exception -> Lf
        Lf:
            return
    }

    private static void a(cn.jiguang.commons.c.d r4, android.app.usage.UsageStats r5, long r6) {
            long r0 = r5.getTotalTimeInForeground()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4.f1001c = r0
            java.util.List r5 = r4.f1004f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.add(r6)
            java.util.List r4 = r4.f1003e
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            return
    }

    private static void a(java.util.List r4, java.util.Map r5) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L2e
            java.lang.Object r1 = r4.get(r0)
            cn.jiguang.commons.c.d r1 = (cn.jiguang.commons.c.d) r1
            java.lang.String r2 = r1.a
            boolean r3 = a(r2)
            if (r3 == 0) goto L1a
            if (r0 <= 0) goto L1a
            a(r4, r5, r0)
        L1a:
            int r3 = r4.size()
            int r3 = r3 + (-1)
            if (r0 != r3) goto L2b
            boolean r3 = a(r2)
            if (r3 != 0) goto L2b
            a(r5, r2, r1)
        L2b:
            int r0 = r0 + 1
            goto L1
        L2e:
            return
    }

    private static void a(java.util.List r1, java.util.Map r2, int r3) {
            int r3 = r3 + (-1)
            java.lang.Object r1 = r1.get(r3)
            cn.jiguang.commons.c.d r1 = (cn.jiguang.commons.c.d) r1
            java.lang.String r3 = r1.a
            boolean r0 = a(r3)
            if (r0 != 0) goto L13
            a(r2, r3, r1)
        L13:
            return
    }

    private static void a(java.util.Map r2, java.lang.String r3, cn.jiguang.commons.c.d r4) {
            java.lang.Object r0 = r2.get(r3)
            cn.jiguang.commons.c.d r0 = (cn.jiguang.commons.c.d) r0
            r1 = 1
            if (r0 != 0) goto La
            goto Ld
        La:
            int r0 = r0.f1002d
            int r1 = r1 + r0
        Ld:
            r4.f1002d = r1
            r2.put(r3, r4)
            return
    }

    private static boolean a(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "launcher"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static boolean a(java.util.Map r2, java.lang.String r3, long r4) {
            java.lang.Object r2 = r2.get(r3)
            cn.jiguang.commons.c.d r2 = (cn.jiguang.commons.c.d) r2
            r3 = 0
            if (r2 == 0) goto L23
            java.util.List r0 = r2.f1004f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            java.util.List r2 = r2.f1004f
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L23
            r2 = 1
            return r2
        L23:
            return r3
    }

    private static long c() {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            long r2 = cn.jiguang.commons.L.ag.f860d
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L23
            java.lang.Class<cn.jiguang.commons.L.ag> r2 = cn.jiguang.commons.L.ag.class
            monitor-enter(r2)
            long r3 = cn.jiguang.commons.L.ag.f860d     // Catch: java.lang.Throwable -> L1d
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L1f
            g()     // Catch: java.lang.Throwable -> L1d
            cn.jiguang.commons.L.ag.f860d = r0     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L21
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L23:
            long r0 = cn.jiguang.commons.L.ag.a
            return r0
    }

    private static void c(java.util.List r5, java.util.Map r6) {
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r5.next()
            android.app.usage.UsageStats r0 = (android.app.usage.UsageStats) r0
            java.lang.String r1 = r0.getPackageName()
            long r2 = r0.getLastTimeStamp()
            boolean r4 = a(r6, r1, r2)
            if (r4 == 0) goto L1f
            goto L4
        L1f:
            cn.jiguang.commons.c.d r1 = a(r6, r1)
            a(r1, r0, r2)
            goto L4
        L27:
            return
    }

    private static android.app.usage.UsageStatsManager d() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r1 = "usagestats"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.usage.UsageStatsManager r0 = (android.app.usage.UsageStatsManager) r0
            return r0
    }

    public static java.util.Map e() {
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            boolean r0 = f()     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto Lc
            goto L34
        Lc:
            long r2 = c()     // Catch: java.lang.Exception -> L34
            long r4 = a()     // Catch: java.lang.Exception -> L34
            android.app.usage.UsageStatsManager r0 = d()     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto L1b
            goto L34
        L1b:
            r6 = r4
            r4 = r2
            r3 = 0
            r2 = r0
            java.util.List r8 = r2.queryUsageStats(r3, r4, r6)     // Catch: java.lang.Exception -> L34
            if (r8 == 0) goto L34
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L2c
            goto L34
        L2c:
            r2 = r4
            r4 = r6
            a(r0, r1, r2, r4)     // Catch: java.lang.Exception -> L34
            c(r8, r1)     // Catch: java.lang.Exception -> L34
        L34:
            return r1
    }

    private static boolean f() {
            r0 = 0
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L2e
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r0)     // Catch: java.lang.Throwable -> L2e
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "appops"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L2e
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "android:get_usage_stats"
            int r4 = r1.uid     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L2e
            int r1 = r2.checkOpNoThrow(r3, r4, r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L2e
            r0 = 1
        L2e:
            return r0
    }

    private static void g() {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r1 = java.lang.System.currentTimeMillis()
            r0.setTimeInMillis(r1)
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r3 = 12
            r0.set(r3, r2)
            r4 = 13
            r0.set(r4, r2)
            r5 = 14
            r0.set(r5, r2)
            long r6 = r0.getTimeInMillis()
            cn.jiguang.commons.L.ag.a = r6
            r2 = 23
            r0.set(r1, r2)
            r1 = 59
            r0.set(r3, r1)
            r0.set(r4, r1)
            r1 = 999(0x3e7, float:1.4E-42)
            r0.set(r5, r1)
            long r0 = r0.getTimeInMillis()
            cn.jiguang.commons.L.ag.f859c = r0
            return
    }
}
