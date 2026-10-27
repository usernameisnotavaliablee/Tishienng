package com.bytedance.j.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h {

    /* renamed from: t, reason: collision with root package name */
    private static com.bytedance.j.xt.d f2134t;
    private android.app.Application a;
    private android.content.Context b;
    private java.util.List<java.lang.String> c;
    private java.util.List<java.lang.Long> d;
    private java.util.List<java.lang.String> e;
    private java.util.List<java.lang.Long> f;
    private java.lang.String g;
    private long h;
    private java.lang.String i;
    private long j;
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    private long f2135l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f2136m;

    /* renamed from: n, reason: collision with root package name */
    private long f2137n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f2138o;

    /* renamed from: p, reason: collision with root package name */
    private long f2139p;

    /* renamed from: q, reason: collision with root package name */
    private int f2140q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2141r;

    /* renamed from: s, reason: collision with root package name */
    private final android.app.Application.ActivityLifecycleCallbacks f2142s;

    class a implements android.app.Application.ActivityLifecycleCallbacks {
        final /* synthetic */ com.bytedance.j.xt.up.j.h a;

        a(com.bytedance.j.xt.up.j.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
                r2 = this;
                com.bytedance.j.xt.up.j.h r4 = r2.a
                com.bytedance.j.xt.d r0 = com.bytedance.j.xt.up.j.h.q()
                if (r0 != 0) goto L11
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L19
            L11:
                com.bytedance.j.xt.d r0 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r0.j(r3)
            L19:
                com.bytedance.j.xt.up.j.h.j(r4, r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.j.xt.up.j.h.h(r3, r0)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                java.util.List r3 = com.bytedance.j.xt.up.j.h.A(r3)
                com.bytedance.j.xt.up.j.h r4 = r2.a
                java.lang.String r4 = com.bytedance.j.xt.up.j.h.i(r4)
                r3.add(r4)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                java.util.List r3 = com.bytedance.j.xt.up.j.h.s(r3)
                com.bytedance.j.xt.up.j.h r4 = r2.a
                long r0 = com.bytedance.j.xt.up.j.h.c(r4)
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r3.add(r4)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r3) {
                r2 = this;
                com.bytedance.j.xt.d r0 = com.bytedance.j.xt.up.j.h.q()
                if (r0 != 0) goto Lf
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L17
            Lf:
                com.bytedance.j.xt.d r0 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r0.j(r3)
            L17:
                com.bytedance.j.xt.up.j.h r0 = r2.a
                java.util.List r0 = com.bytedance.j.xt.up.j.h.A(r0)
                int r0 = r0.indexOf(r3)
                if (r0 < 0) goto L41
                com.bytedance.j.xt.up.j.h r1 = r2.a
                java.util.List r1 = com.bytedance.j.xt.up.j.h.A(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L41
                com.bytedance.j.xt.up.j.h r1 = r2.a
                java.util.List r1 = com.bytedance.j.xt.up.j.h.A(r1)
                r1.remove(r0)
                com.bytedance.j.xt.up.j.h r1 = r2.a
                java.util.List r1 = com.bytedance.j.xt.up.j.h.s(r1)
                r1.remove(r0)
            L41:
                com.bytedance.j.xt.up.j.h r0 = r2.a
                java.util.List r0 = com.bytedance.j.xt.up.j.h.t(r0)
                r0.add(r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                java.util.List r3 = com.bytedance.j.xt.up.j.h.g(r3)
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r3.add(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                com.bytedance.j.xt.up.j.h r0 = r2.a
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                if (r1 != 0) goto L11
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L19
            L11:
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r1.j(r3)
            L19:
                com.bytedance.j.xt.up.j.h.r(r0, r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.j.xt.up.j.h.p(r3, r0)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                com.bytedance.j.xt.up.j.h.n(r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                int r3 = com.bytedance.j.xt.up.j.h.a(r3)
                if (r3 > 0) goto L38
                com.bytedance.j.xt.up.j.h r3 = r2.a
                r0 = 0
                com.bytedance.j.xt.up.j.h.m(r3, r0)
            L38:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r3) {
                r2 = this;
                com.bytedance.j.xt.up.j.h r0 = r2.a
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                if (r1 != 0) goto L11
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L19
            L11:
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r1.j(r3)
            L19:
                com.bytedance.j.xt.up.j.h.e(r0, r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.j.xt.up.j.h.d(r3, r0)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                r0 = 1
                com.bytedance.j.xt.up.j.h.m(r3, r0)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                com.bytedance.j.xt.up.j.h.u(r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r3) {
                r2 = this;
                com.bytedance.j.xt.up.j.h r0 = r2.a
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                if (r1 != 0) goto L11
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L19
            L11:
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r1.j(r3)
            L19:
                com.bytedance.j.xt.up.j.h.z(r0, r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.j.xt.up.j.h.y(r3, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r3) {
                r2 = this;
                com.bytedance.j.xt.up.j.h r0 = r2.a
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                if (r1 != 0) goto L11
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                goto L19
            L11:
                com.bytedance.j.xt.d r1 = com.bytedance.j.xt.up.j.h.q()
                java.lang.String r3 = r1.j(r3)
            L19:
                com.bytedance.j.xt.up.j.h.w(r0, r3)
                com.bytedance.j.xt.up.j.h r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.j.xt.up.j.h.v(r3, r0)
                return
        }
    }

    static {
            return
    }

    h(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f = r0
            r0 = 0
            r1.f2140q = r0
            r1.f2141r = r0
            com.bytedance.j.xt.up.j.h$a r0 = new com.bytedance.j.xt.up.j.h$a
            r0.<init>(r1)
            r1.f2142s = r0
            r1.b = r2
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L35
            android.app.Application r2 = (android.app.Application) r2
            r1.a = r2
        L35:
            r1.x()
            return
    }

    static /* synthetic */ java.util.List A(com.bytedance.j.xt.up.j.h r0) {
            java.util.List<java.lang.String> r0 = r0.c
            return r0
    }

    static /* synthetic */ int a(com.bytedance.j.xt.up.j.h r0) {
            int r0 = r0.f2140q
            return r0
    }

    private org.json.JSONArray b() {
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.e
            if (r1 == 0) goto L37
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L37
        L10:
            r1 = 0
        L11:
            java.util.List<java.lang.String> r2 = r5.e
            int r2 = r2.size()
            if (r1 >= r2) goto L37
            java.util.List<java.lang.String> r2 = r5.e     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L37
            java.util.List<java.lang.Long> r3 = r5.f     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L37
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L37
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: java.lang.Throwable -> L37
            r0.put(r2)     // Catch: java.lang.Throwable -> L37
            int r1 = r1 + 1
            goto L11
        L37:
            return r0
    }

    static /* synthetic */ long c(com.bytedance.j.xt.up.j.h r2) {
            long r0 = r2.h
            return r0
    }

    static /* synthetic */ long d(com.bytedance.j.xt.up.j.h r0, long r1) {
            r0.f2135l = r1
            return r1
    }

    static /* synthetic */ java.lang.String e(com.bytedance.j.xt.up.j.h r0, java.lang.String r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ java.util.List g(com.bytedance.j.xt.up.j.h r0) {
            java.util.List<java.lang.Long> r0 = r0.f
            return r0
    }

    static /* synthetic */ long h(com.bytedance.j.xt.up.j.h r0, long r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ java.lang.String i(com.bytedance.j.xt.up.j.h r0) {
            java.lang.String r0 = r0.g
            return r0
    }

    static /* synthetic */ java.lang.String j(com.bytedance.j.xt.up.j.h r0, java.lang.String r1) {
            r0.g = r1
            return r1
    }

    private org.json.JSONObject l(java.lang.String r3, long r4) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L10
            java.lang.String r3 = "time"
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L10
            return r0
        L10:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r0
    }

    static /* synthetic */ boolean m(com.bytedance.j.xt.up.j.h r0, boolean r1) {
            r0.f2141r = r1
            return r1
    }

    static /* synthetic */ int n(com.bytedance.j.xt.up.j.h r2) {
            int r0 = r2.f2140q
            int r1 = r0 + (-1)
            r2.f2140q = r1
            return r0
    }

    private org.json.JSONArray o() {
            r5 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.c
            if (r1 == 0) goto L37
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L37
        L10:
            r1 = 0
        L11:
            java.util.List<java.lang.String> r2 = r5.c
            int r2 = r2.size()
            if (r1 >= r2) goto L37
            java.util.List<java.lang.String> r2 = r5.c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L37
            java.util.List<java.lang.Long> r3 = r5.d     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L37
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L37
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: java.lang.Throwable -> L37
            r0.put(r2)     // Catch: java.lang.Throwable -> L37
            int r1 = r1 + 1
            goto L11
        L37:
            return r0
    }

    static /* synthetic */ long p(com.bytedance.j.xt.up.j.h r0, long r1) {
            r0.f2137n = r1
            return r1
    }

    static /* synthetic */ com.bytedance.j.xt.d q() {
            com.bytedance.j.xt.d r0 = com.bytedance.j.xt.up.j.h.f2134t
            return r0
    }

    static /* synthetic */ java.lang.String r(com.bytedance.j.xt.up.j.h r0, java.lang.String r1) {
            r0.f2136m = r1
            return r1
    }

    static /* synthetic */ java.util.List s(com.bytedance.j.xt.up.j.h r0) {
            java.util.List<java.lang.Long> r0 = r0.d
            return r0
    }

    static /* synthetic */ java.util.List t(com.bytedance.j.xt.up.j.h r0) {
            java.util.List<java.lang.String> r0 = r0.e
            return r0
    }

    static /* synthetic */ int u(com.bytedance.j.xt.up.j.h r2) {
            int r0 = r2.f2140q
            int r1 = r0 + 1
            r2.f2140q = r1
            return r0
    }

    static /* synthetic */ long v(com.bytedance.j.xt.up.j.h r0, long r1) {
            r0.f2139p = r1
            return r1
    }

    static /* synthetic */ java.lang.String w(com.bytedance.j.xt.up.j.h r0, java.lang.String r1) {
            r0.f2138o = r1
            return r1
    }

    private void x() {
            r2 = this;
            android.app.Application r0 = r2.a
            if (r0 == 0) goto L9
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.f2142s
            r0.registerActivityLifecycleCallbacks(r1)
        L9:
            return
    }

    static /* synthetic */ long y(com.bytedance.j.xt.up.j.h r0, long r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ java.lang.String z(com.bytedance.j.xt.up.j.h r0, java.lang.String r1) {
            r0.i = r1
            return r1
    }

    public org.json.JSONArray B() {
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            android.content.Context r1 = r6.b     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> L80
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L80
            if (r1 != 0) goto L12
            goto L80
        L12:
            r2 = 5
            java.util.List r1 = r1.getRunningTasks(r2)     // Catch: java.lang.Exception -> L80
            if (r1 != 0) goto L1a
            goto L80
        L1a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L80
        L1e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L80
            android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L1e
            android.content.ComponentName r3 = cn.jpush.android.ui.d.a(r2)     // Catch: java.lang.Exception -> L80
            if (r3 == 0) goto L1e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.<init>()     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "id"
            int r5 = r2.id     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "package_name"
            android.content.ComponentName r5 = cn.jpush.android.ui.d.a(r2)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r5 = r5.getPackageName()     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "description"
            java.lang.CharSequence r5 = r2.description     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "number_of_activities"
            int r5 = com.bytedance.j.xt.up.j.g.a(r2)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "number_of_running_activities"
            int r5 = r2.numRunning     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "topActivity"
            android.content.ComponentName r5 = cn.jpush.android.ui.e.a(r2)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r4 = "baseActivity"
            android.content.ComponentName r2 = cn.jpush.android.ui.d.a(r2)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r3.put(r4, r2)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            r0.put(r3)     // Catch: org.json.JSONException -> L1e java.lang.Exception -> L80
            goto L1e
        L80:
            return r0
    }

    public boolean f() {
            r1 = this;
            boolean r0 = r1.f2141r
            return r0
    }

    public org.json.JSONObject k() {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "last_create_activity"
            java.lang.String r2 = r5.g     // Catch: org.json.JSONException -> L58
            long r3 = r5.h     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "last_start_activity"
            java.lang.String r2 = r5.i     // Catch: org.json.JSONException -> L58
            long r3 = r5.j     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "last_resume_activity"
            java.lang.String r2 = r5.k     // Catch: org.json.JSONException -> L58
            long r3 = r5.f2135l     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "last_pause_activity"
            java.lang.String r2 = r5.f2136m     // Catch: org.json.JSONException -> L58
            long r3 = r5.f2137n     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "last_stop_activity"
            java.lang.String r2 = r5.f2138o     // Catch: org.json.JSONException -> L58
            long r3 = r5.f2139p     // Catch: org.json.JSONException -> L58
            org.json.JSONObject r2 = r5.l(r2, r3)     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "alive_activities"
            org.json.JSONArray r2 = r5.o()     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = "finish_activities"
            org.json.JSONArray r2 = r5.b()     // Catch: org.json.JSONException -> L58
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L58
        L58:
            return r0
    }
}
