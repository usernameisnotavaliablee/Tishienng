package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(14)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class l {
    public static java.lang.String a;
    static java.lang.String d;
    static int e;
    private static org.json.JSONArray i;
    private static java.lang.Object j;
    private static android.app.Application k;
    private static boolean o;
    private static java.lang.Object p;

    /* renamed from: q, reason: collision with root package name */
    private static com.umeng.analytics.pro.bn f28q;
    boolean b;
    boolean c;
    com.umeng.analytics.vshelper.a f;
    android.app.Application.ActivityLifecycleCallbacks g;
    private final java.util.Map<java.lang.String, java.lang.Long> h;
    private boolean l;
    private int m;
    private int n;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.pro.l a = null;

        static {
                com.umeng.analytics.pro.l r0 = new com.umeng.analytics.pro.l
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.l.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.l a() {
                com.umeng.analytics.pro.l r0 = com.umeng.analytics.pro.l.a.a
                return r0
        }
    }

    static {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.umeng.analytics.pro.l.i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.pro.l.j = r0
            r0 = 0
            com.umeng.analytics.pro.l.k = r0
            com.umeng.analytics.pro.l.d = r0
            r0 = -1
            com.umeng.analytics.pro.l.e = r0
            r0 = 1
            com.umeng.analytics.pro.l.o = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.pro.l.p = r0
            com.umeng.analytics.vshelper.b r0 = new com.umeng.analytics.vshelper.b
            r0.<init>()
            com.umeng.analytics.pro.l.f28q = r0
            return
    }

    private l() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.h = r0
            r0 = 0
            r1.l = r0
            r1.b = r0
            r1.c = r0
            r1.m = r0
            r1.n = r0
            com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.getInstance()
            r1.f = r0
            com.umeng.analytics.pro.l$1 r0 = new com.umeng.analytics.pro.l$1
            r0.<init>(r1)
            r1.g = r0
            monitor-enter(r1)
            android.app.Application r0 = com.umeng.analytics.pro.l.k     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            r1.g()     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L2f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    /* synthetic */ l(com.umeng.analytics.pro.l.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int a(com.umeng.analytics.pro.l r2) {
            int r0 = r2.n
            int r1 = r0 + (-1)
            r2.n = r1
            return r0
    }

    public static synchronized com.umeng.analytics.pro.l a(android.content.Context r2) {
            java.lang.Class<com.umeng.analytics.pro.l> r0 = com.umeng.analytics.pro.l.class
            monitor-enter(r0)
            android.app.Application r1 = com.umeng.analytics.pro.l.k     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L20
            if (r2 == 0) goto L20
            boolean r1 = r2 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L16
            android.app.Application r2 = r2.getApplication()     // Catch: java.lang.Throwable -> L16
            com.umeng.analytics.pro.l.k = r2     // Catch: java.lang.Throwable -> L16
            goto L20
        L16:
            r2 = move-exception
            goto L26
        L18:
            boolean r1 = r2 instanceof android.app.Application     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L20
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L16
            com.umeng.analytics.pro.l.k = r2     // Catch: java.lang.Throwable -> L16
        L20:
            com.umeng.analytics.pro.l r2 = com.umeng.analytics.pro.l.a.a()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    private void a(android.app.Activity r3) {
            r2 = this;
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.AUTO
            if (r0 == r1) goto L1b
            com.umeng.analytics.MobclickAgent$PageMode r3 = com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION
            com.umeng.analytics.MobclickAgent$PageMode r0 = com.umeng.analytics.MobclickAgent.PageMode.MANUAL
            if (r3 != r0) goto L7c
            java.lang.Object r3 = com.umeng.analytics.pro.l.p
            monitor-enter(r3)
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> L18
            r0.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1b:
            if (r3 == 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r3.getLocalClassName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.umeng.analytics.vshelper.a r1 = r2.f
            r1.activityResume(r0)
            boolean r1 = r2.b
            if (r1 == 0) goto L6a
            r1 = 0
            r2.b = r1
            java.lang.String r1 = com.umeng.analytics.pro.l.a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L67
            java.lang.String r1 = com.umeng.analytics.pro.l.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7c
            r2.b(r3)
            java.lang.Object r3 = com.umeng.analytics.pro.l.p
            monitor-enter(r3)
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> L64
            r0.h()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            throw r0
        L67:
            com.umeng.analytics.pro.l.a = r0
            return
        L6a:
            r2.b(r3)
            java.lang.Object r3 = com.umeng.analytics.pro.l.p
            monitor-enter(r3)
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> L79
            r0.h()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            return
    }

    public static void a(android.content.Context r3, java.lang.String r4) {
            int r0 = com.umeng.analytics.pro.l.e
            r1 = 1
            if (r0 != r1) goto L51
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)
            if (r0 == 0) goto L51
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "pairUUID"
            java.lang.String r2 = com.umeng.analytics.pro.l.d
            r0.put(r1, r2)
            java.lang.String r1 = "reason"
            r0.put(r1, r4)
            java.lang.String r4 = com.umeng.analytics.pro.l.d
            if (r4 == 0) goto L23
            r4 = 0
            com.umeng.analytics.pro.l.d = r4
        L23:
            if (r3 == 0) goto L51
            int r4 = android.os.Process.myPid()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "pid"
            r0.put(r1, r4)
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "isMainProcess"
            r0.put(r1, r4)
            java.lang.String r4 = "Context"
            java.lang.String r1 = r3.toString()
            r0.put(r4, r1)
            com.umeng.analytics.b r4 = com.umeng.analytics.b.a()
            java.lang.String r1 = "$$_onUMengEnterBackground"
            r4.a(r3, r1, r0)
        L51:
            return
    }

    static /* synthetic */ void a(com.umeng.analytics.pro.l r0, android.app.Activity r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ boolean a(boolean r0) {
            com.umeng.analytics.pro.l.o = r0
            return r0
    }

    static /* synthetic */ int b(com.umeng.analytics.pro.l r2) {
            int r0 = r2.m
            int r1 = r0 + (-1)
            r2.m = r1
            return r0
    }

    private void b(android.app.Activity r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r5 = r5.getLocalClassName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.umeng.analytics.pro.l.a = r5
            java.util.Map<java.lang.String, java.lang.Long> r5 = r4.h
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r4.h     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L32
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L32
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    static /* synthetic */ void b(com.umeng.analytics.pro.l r0, android.app.Activity r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ int c(com.umeng.analytics.pro.l r0) {
            int r0 = r0.m
            return r0
    }

    private void c(android.app.Activity r8) {
            r7 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r7.h     // Catch: java.lang.Throwable -> L86
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            if (r8 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r8.getPackageName()     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "."
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = r8.getLocalClassName()     // Catch: java.lang.Throwable -> L28
            r1.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L28
            com.umeng.analytics.pro.l.a = r8     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r8 = move-exception
            goto L84
        L2a:
            java.lang.String r8 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L28
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L28
            if (r8 != 0) goto L57
            java.util.Map<java.lang.String, java.lang.Long> r8 = r7.h     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L28
            boolean r8 = r8.containsKey(r1)     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto L57
            java.util.Map<java.lang.String, java.lang.Long> r8 = r7.h     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L28
            long r1 = r8.longValue()     // Catch: java.lang.Throwable -> L28
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
            long r3 = r3 - r1
            java.util.Map<java.lang.String, java.lang.Long> r8 = r7.h     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L28
            r8.remove(r5)     // Catch: java.lang.Throwable -> L28
            goto L5a
        L57:
            r1 = 0
            r3 = r1
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = com.umeng.analytics.pro.l.j     // Catch: java.lang.Throwable -> L86
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L86
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "page_name"
            java.lang.String r6 = com.umeng.analytics.pro.l.a     // Catch: java.lang.Throwable -> L7f
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "duration"
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "page_start"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "type"
            r2 = 0
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            org.json.JSONArray r1 = com.umeng.analytics.pro.l.i     // Catch: java.lang.Throwable -> L7f
            r1.put(r0)     // Catch: java.lang.Throwable -> L7f
        L7f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L86
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r8     // Catch: java.lang.Throwable -> L86
        L86:
            return
    }

    public static void c(android.content.Context r4) {
            if (r4 == 0) goto L3d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = com.umeng.analytics.pro.l.j     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3d
            org.json.JSONArray r2 = com.umeng.analytics.pro.l.i     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            com.umeng.analytics.pro.l.i = r3     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L3d
            if (r1 <= 0) goto L3d
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "__b"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L3d
            com.umeng.analytics.pro.i r4 = com.umeng.analytics.pro.i.a(r4)     // Catch: java.lang.Throwable -> L3d
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L3d
            com.umeng.analytics.pro.i$a r2 = com.umeng.analytics.pro.i.a.a     // Catch: java.lang.Throwable -> L3d
            r4.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L3d
            return
        L3a:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r4     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
    }

    static /* synthetic */ int d(com.umeng.analytics.pro.l r0) {
            int r0 = r0.n
            return r0
    }

    static /* synthetic */ java.lang.Object d() {
            java.lang.Object r0 = com.umeng.analytics.pro.l.p
            return r0
    }

    static /* synthetic */ int e(com.umeng.analytics.pro.l r2) {
            int r0 = r2.n
            int r1 = r0 + 1
            r2.n = r1
            return r0
    }

    static /* synthetic */ boolean e() {
            boolean r0 = com.umeng.analytics.pro.l.o
            return r0
    }

    static /* synthetic */ int f(com.umeng.analytics.pro.l r2) {
            int r0 = r2.m
            int r1 = r0 + 1
            r2.m = r1
            return r0
    }

    static /* synthetic */ com.umeng.analytics.pro.bn f() {
            com.umeng.analytics.pro.bn r0 = com.umeng.analytics.pro.l.f28q
            return r0
    }

    private void g() {
            r2 = this;
            boolean r0 = r2.l
            if (r0 != 0) goto L12
            r0 = 1
            r2.l = r0
            android.app.Application r0 = com.umeng.analytics.pro.l.k
            if (r0 == 0) goto L12
            android.app.Application r0 = com.umeng.analytics.pro.l.k
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.g
            r0.registerActivityLifecycleCallbacks(r1)
        L12:
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public void b() {
            r2 = this;
            r0 = 0
            r2.l = r0
            android.app.Application r0 = com.umeng.analytics.pro.l.k
            if (r0 == 0) goto L11
            android.app.Application r0 = com.umeng.analytics.pro.l.k
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.g
            r0.unregisterActivityLifecycleCallbacks(r1)
            r0 = 0
            com.umeng.analytics.pro.l.k = r0
        L11:
            return
    }

    public void b(android.content.Context r5) {
            r4 = this;
            java.lang.Object r0 = com.umeng.analytics.pro.l.p
            monitor-enter(r0)
            boolean r1 = com.umeng.analytics.pro.l.o     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            r1 = 0
            com.umeng.analytics.pro.l.o = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            android.app.Activity r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getGlobleActivity(r5)
            if (r5 != 0) goto L19
            java.lang.String r5 = "MobclickRT"
            java.lang.String r0 = "--->>> init触发onResume: 无前台Activity，直接退出。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r0)
            return
        L19:
            java.lang.String r0 = r5.getLocalClassName()
            java.lang.String r1 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "--->>> init触发onResume: 补救成功，前台Activity名："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            r4.a(r5)
            return
        L37:
            r5 = move-exception
            goto L42
        L39:
            java.lang.String r5 = "MobclickRT"
            java.lang.String r1 = "--->>> init触发onResume: firstResumeCall = false，直接返回。"
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.c(r0)
            r1.b()
            return
    }
}
