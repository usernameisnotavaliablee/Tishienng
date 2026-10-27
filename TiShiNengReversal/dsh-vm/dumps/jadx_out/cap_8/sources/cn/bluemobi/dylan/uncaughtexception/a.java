package cn.bluemobi.dylan.uncaughtexception;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    private static final java.lang.String a = "cat.ereza.customactivityoncrash.ERROR";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f223b = "cat.ereza.customactivityoncrash.RESTART";

    /* renamed from: c, reason: collision with root package name */
    private static android.app.Application f224c;

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.ref.WeakReference<android.app.Activity> f225d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f226e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f227f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f228g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f229h;

    /* renamed from: i, reason: collision with root package name */
    private static int f230i;

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.Class<? extends android.app.Activity> f231j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.Class<? extends android.app.Activity> f232k;
    private static boolean l;
    private static java.lang.String[] m;
    private static java.lang.String n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: cn.bluemobi.dylan.uncaughtexception.a$a, reason: collision with other inner class name */
    static class C0005a implements java.lang.Thread.UncaughtExceptionHandler {
        final /* synthetic */ android.content.Context a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: cn.bluemobi.dylan.uncaughtexception.a$a$a, reason: collision with other inner class name */
        class C0006a extends java.lang.Thread {
            final /* synthetic */ java.lang.Throwable a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.a.C0005a f233b;

            C0006a(cn.bluemobi.dylan.uncaughtexception.a.C0005a r1, java.lang.Throwable r2) {
                    r0 = this;
                    r0.f233b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r5 = this;
                    super.run()
                    java.io.StringWriter r0 = new java.io.StringWriter
                    r0.<init>()
                    java.io.PrintWriter r1 = new java.io.PrintWriter
                    r1.<init>(r0)
                    java.lang.Throwable r1 = r5.a
                    r1.getClass()
                    java.lang.String r0 = r0.toString()
                    int r1 = r0.length()
                    r2 = 131071(0x1ffff, float:1.8367E-40)
                    r3 = 0
                    if (r1 <= r2) goto L38
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r2 = 131047(0x1ffe7, float:1.83636E-40)
                    java.lang.String r0 = r0.substring(r3, r2)
                    r1.append(r0)
                    java.lang.String r0 = " [stack trace too large]"
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                L38:
                    java.lang.String r1 = cn.bluemobi.dylan.uncaughtexception.a.D()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L68
                    java.lang.String r1 = cn.bluemobi.dylan.uncaughtexception.a.D()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "{ \"msgtype\": \"text\", \"text\": {\"content\": \""
                    r2.append(r4)
                    cn.bluemobi.dylan.uncaughtexception.a$a r4 = r5.f233b
                    android.content.Context r4 = r4.a
                    java.lang.String r4 = cn.bluemobi.dylan.uncaughtexception.a.v(r4, r0)
                    r2.append(r4)
                    java.lang.String r4 = "\"}}"
                    r2.append(r4)
                    java.lang.String r2 = r2.toString()
                    cn.bluemobi.dylan.uncaughtexception.a.b(r1, r2)
                L68:
                    cn.bluemobi.dylan.uncaughtexception.a$a r1 = r5.f233b
                    android.content.Context r1 = r1.a
                    java.lang.String r1 = cn.bluemobi.dylan.uncaughtexception.a.y(r1)
                    cn.bluemobi.dylan.uncaughtexception.a$a r2 = r5.f233b
                    android.content.Context r2 = r2.a
                    java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.v(r2, r0)
                    j.b.a(r1, r0)
                    cn.bluemobi.dylan.uncaughtexception.a.j()
                    java.lang.System.exit(r3)
                    return
            }
        }

        C0005a(android.content.Context r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r4 = cn.bluemobi.dylan.uncaughtexception.a.a()
                if (r4 != 0) goto Lf
                cn.bluemobi.dylan.uncaughtexception.a$a$a r4 = new cn.bluemobi.dylan.uncaughtexception.a$a$a
                r4.<init>(r3, r5)
                r4.start()
                return
            Lf:
                java.lang.Class r4 = cn.bluemobi.dylan.uncaughtexception.a.k()
                if (r4 != 0) goto L20
                android.app.Application r4 = cn.bluemobi.dylan.uncaughtexception.a.m()
                java.lang.Class r4 = cn.bluemobi.dylan.uncaughtexception.a.n(r4)
                cn.bluemobi.dylan.uncaughtexception.a.l(r4)
            L20:
                java.lang.Class r4 = cn.bluemobi.dylan.uncaughtexception.a.k()
                boolean r4 = cn.bluemobi.dylan.uncaughtexception.a.o(r5, r4)
                if (r4 == 0) goto L2c
                goto Lc7
            L2c:
                boolean r4 = cn.bluemobi.dylan.uncaughtexception.a.p()
                if (r4 != 0) goto L38
                boolean r4 = cn.bluemobi.dylan.uncaughtexception.a.q()
                if (r4 != 0) goto Lc7
            L38:
                android.content.Intent r4 = new android.content.Intent
                android.app.Application r0 = cn.bluemobi.dylan.uncaughtexception.a.m()
                java.lang.Class r1 = cn.bluemobi.dylan.uncaughtexception.a.k()
                r4.<init>(r0, r1)
                java.io.StringWriter r0 = new java.io.StringWriter
                r0.<init>()
                java.io.PrintWriter r1 = new java.io.PrintWriter
                r1.<init>(r0)
                r5.getClass()
                java.lang.String r5 = r0.toString()
                int r0 = r5.length()
                r1 = 131071(0x1ffff, float:1.8367E-40)
                if (r0 <= r1) goto L78
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                r2 = 131047(0x1ffe7, float:1.83636E-40)
                java.lang.String r5 = r5.substring(r1, r2)
                r0.append(r5)
                java.lang.String r5 = " [stack trace too large]"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
            L78:
                boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.s()
                if (r0 == 0) goto L90
                java.lang.Class r0 = cn.bluemobi.dylan.uncaughtexception.a.c()
                if (r0 != 0) goto L90
                android.app.Application r0 = cn.bluemobi.dylan.uncaughtexception.a.m()
                java.lang.Class r0 = cn.bluemobi.dylan.uncaughtexception.a.e(r0)
                cn.bluemobi.dylan.uncaughtexception.a.d(r0)
                goto L9a
            L90:
                boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.s()
                if (r0 != 0) goto L9a
                r0 = 0
                cn.bluemobi.dylan.uncaughtexception.a.d(r0)
            L9a:
                java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"
                r4.putExtra(r0, r5)
                java.lang.String r5 = "cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS"
                java.lang.Class r0 = cn.bluemobi.dylan.uncaughtexception.a.c()
                r4.putExtra(r5, r0)
                java.lang.String r5 = "cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS"
                boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f()
                r4.putExtra(r5, r0)
                java.lang.String r5 = "cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID"
                int r0 = cn.bluemobi.dylan.uncaughtexception.a.g()
                r4.putExtra(r5, r0)
                r5 = 268468224(0x10008000, float:2.5342157E-29)
                r4.setFlags(r5)
                android.app.Application r5 = cn.bluemobi.dylan.uncaughtexception.a.m()
                r5.startActivity(r4)
            Lc7:
                java.lang.ref.WeakReference r4 = cn.bluemobi.dylan.uncaughtexception.a.h()
                java.lang.Object r4 = r4.get()
                android.app.Activity r4 = (android.app.Activity) r4
                if (r4 == 0) goto Ldd
                r4.finish()
                java.lang.ref.WeakReference r4 = cn.bluemobi.dylan.uncaughtexception.a.h()
                r4.clear()
            Ldd:
                cn.bluemobi.dylan.uncaughtexception.a.j()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements android.app.Application.ActivityLifecycleCallbacks {
        int a;

        b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Class r3 = r2.getClass()
                java.lang.Class r0 = cn.bluemobi.dylan.uncaughtexception.a.k()
                if (r3 == r0) goto L12
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r2)
                cn.bluemobi.dylan.uncaughtexception.a.i(r3)
            L12:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                int r2 = r1.a
                r0 = 1
                int r2 = r2 + r0
                r1.a = r2
                if (r2 != 0) goto L9
                goto La
            L9:
                r0 = 0
            La:
                cn.bluemobi.dylan.uncaughtexception.a.r(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r2) {
                r1 = this;
                int r2 = r1.a
                r0 = 1
                int r2 = r2 - r0
                r1.a = r2
                if (r2 != 0) goto L9
                goto La
            L9:
                r0 = 0
            La:
                cn.bluemobi.dylan.uncaughtexception.a.r(r0)
                return
        }
    }

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            cn.bluemobi.dylan.uncaughtexception.a.f225d = r0
            r0 = 0
            cn.bluemobi.dylan.uncaughtexception.a.f226e = r0
            r0 = 1
            cn.bluemobi.dylan.uncaughtexception.a.f227f = r0
            cn.bluemobi.dylan.uncaughtexception.a.f228g = r0
            cn.bluemobi.dylan.uncaughtexception.a.f229h = r0
            int r2 = cat.ereza.customactivityoncrash.R.drawable.customactivityoncrash_error_image
            cn.bluemobi.dylan.uncaughtexception.a.f230i = r2
            cn.bluemobi.dylan.uncaughtexception.a.f231j = r1
            cn.bluemobi.dylan.uncaughtexception.a.f232k = r1
            cn.bluemobi.dylan.uncaughtexception.a.l = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int A() {
            int r0 = cn.bluemobi.dylan.uncaughtexception.a.f230i
            return r0
    }

    public static int B(android.content.Intent r2) {
            java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID"
            int r1 = cat.ereza.customactivityoncrash.R.drawable.customactivityoncrash_error_image
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    private static java.lang.String C() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto Lf
            java.lang.String r0 = t(r1)
            return r0
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = t(r0)
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static java.lang.String D() {
            java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.n
            return r0
    }

    public static java.lang.String[] E() {
            java.lang.String[] r0 = cn.bluemobi.dylan.uncaughtexception.a.m
            return r0
    }

    public static java.lang.Class<? extends android.app.Activity> F() {
            java.lang.Class<? extends android.app.Activity> r0 = cn.bluemobi.dylan.uncaughtexception.a.f231j
            return r0
    }

    private static java.lang.Class<? extends android.app.Activity> G(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "cat.ereza.customactivityoncrash.ERROR"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = r2.getPackageName()
            android.content.Intent r0 = r0.setPackage(r1)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r1 = 64
            java.util.List r2 = r2.queryIntentActivities(r0, r1)
            if (r2 == 0) goto L35
            int r0 = r2.size()
            if (r0 <= 0) goto L35
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.ClassNotFoundException -> L35
            java.lang.String r2 = r2.name     // Catch: java.lang.ClassNotFoundException -> L35
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L35
            return r2
        L35:
            r2 = 0
            return r2
    }

    private static java.lang.Class<? extends android.app.Activity> H(android.content.Context r1) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r1 = r0.getLaunchIntentForPackage(r1)
            if (r1 == 0) goto L1b
            android.content.ComponentName r1 = r1.getComponent()     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.String r1 = r1.getClassName()     // Catch: java.lang.ClassNotFoundException -> L1b
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L1b
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static java.lang.Class<? extends android.app.Activity> I() {
            java.lang.Class<? extends android.app.Activity> r0 = cn.bluemobi.dylan.uncaughtexception.a.f232k
            return r0
    }

    public static java.lang.Class<? extends android.app.Activity> J(android.content.Intent r1) {
            java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS"
            java.io.Serializable r1 = r1.getSerializableExtra(r0)
            if (r1 == 0) goto Lf
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lf
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private static java.lang.Class<? extends android.app.Activity> K(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "cat.ereza.customactivityoncrash.RESTART"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = r2.getPackageName()
            android.content.Intent r0 = r0.setPackage(r1)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r1 = 64
            java.util.List r2 = r2.queryIntentActivities(r0, r1)
            if (r2 == 0) goto L35
            int r0 = r2.size()
            if (r0 <= 0) goto L35
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.ClassNotFoundException -> L35
            java.lang.String r2 = r2.name     // Catch: java.lang.ClassNotFoundException -> L35
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L35
            return r2
        L35:
            r2 = 0
            return r2
    }

    public static java.lang.String L(android.content.Intent r1) {
            java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"
            java.lang.String r1 = r1.getStringExtra(r0)
            return r1
    }

    private static java.lang.String M() {
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
    }

    private static java.lang.String N(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: java.lang.Exception -> L10
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Exception -> L10
            return r2
        L10:
            java.lang.String r2 = "Unknown"
            return r2
    }

    private static java.lang.Class<? extends android.app.Activity> O(android.content.Context r0) {
            java.lang.Class r0 = G(r0)
            if (r0 != 0) goto L8
            java.lang.Class<cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity> r0 = cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.class
        L8:
            return r0
    }

    private static java.lang.Class<? extends android.app.Activity> P(android.content.Context r1) {
            java.lang.Class r0 = K(r1)
            if (r0 != 0) goto Lb
            java.lang.Class r1 = H(r1)
            return r1
        Lb:
            return r0
    }

    public static void Q(android.content.Context r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L1a
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "cat.ereza.customactivityoncrash"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L1a
            return
        L1a:
            if (r0 == 0) goto L29
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "com.android.internal.os"
            r0.startsWith(r1)     // Catch: java.lang.Throwable -> L47
        L29:
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L47
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L47
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L47
            cn.bluemobi.dylan.uncaughtexception.a.f224c = r0     // Catch: java.lang.Throwable -> L47
            cn.bluemobi.dylan.uncaughtexception.a$a r0 = new cn.bluemobi.dylan.uncaughtexception.a$a     // Catch: java.lang.Throwable -> L47
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> L47
            android.app.Application r3 = cn.bluemobi.dylan.uncaughtexception.a.f224c     // Catch: java.lang.Throwable -> L47
            cn.bluemobi.dylan.uncaughtexception.a$b r0 = new cn.bluemobi.dylan.uncaughtexception.a$b     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            r3.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L47
        L47:
            return
    }

    public static boolean R() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f229h
            return r0
    }

    public static boolean S() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f227f
            return r0
    }

    public static boolean T() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f228g
            return r0
    }

    public static boolean U(android.content.Intent r2) {
            java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS"
            r1 = 1
            boolean r2 = r2.getBooleanExtra(r0, r1)
            return r2
    }

    private static boolean V(java.lang.Throwable r7, java.lang.Class<? extends android.app.Activity> r8) {
        L0:
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L36
            r4 = r0[r3]
            java.lang.String r5 = r4.getClassName()
            java.lang.String r6 = "android.app.ActivityThread"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L23
            java.lang.String r5 = r4.getMethodName()
            java.lang.String r6 = "handleBindApplication"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L31
        L23:
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = r8.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L33
        L31:
            r7 = 1
            return r7
        L33:
            int r3 = r3 + 1
            goto L7
        L36:
            java.lang.Throwable r7 = r7.getCause()
            if (r7 != 0) goto L0
            return r2
    }

    private static void W() {
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 10
            java.lang.System.exit(r0)
            return
    }

    private static void X(java.lang.String r2, java.lang.String r3) {
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r0.getClass()     // Catch: java.lang.Exception -> L68
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L68
            r0.<init>(r2)     // Catch: java.lang.Exception -> L68
            java.net.URLConnection r2 = r0.openConnection()     // Catch: java.lang.Exception -> L68
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Exception -> L68
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L68
            r2.setReadTimeout(r0)     // Catch: java.lang.Exception -> L68
            r0 = 1
            r2.setDoOutput(r0)     // Catch: java.lang.Exception -> L68
            r2.setDoInput(r0)     // Catch: java.lang.Exception -> L68
            r1 = 0
            r2.setUseCaches(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "POST"
            r2.setRequestMethod(r1)     // Catch: java.lang.Exception -> L68
            r2.setInstanceFollowRedirects(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r2.setRequestProperty(r0, r1)     // Catch: java.lang.Exception -> L68
            r2.connect()     // Catch: java.lang.Exception -> L68
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.lang.Exception -> L68
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch: java.lang.Exception -> L68
            r0.<init>(r1)     // Catch: java.lang.Exception -> L68
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L68
            r0.write(r3)     // Catch: java.lang.Exception -> L68
            r0.flush()     // Catch: java.lang.Exception -> L68
            r0.close()     // Catch: java.lang.Exception -> L68
            int r3 = r2.getResponseCode()     // Catch: java.lang.Exception -> L68
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L60
            java.io.InputStream r3 = r2.getInputStream()     // Catch: java.lang.Exception -> L68
            i0(r3)     // Catch: java.lang.Exception -> L68
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r3.getClass()     // Catch: java.lang.Exception -> L68
            goto L65
        L60:
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r3.getClass()     // Catch: java.lang.Exception -> L68
        L65:
            r2.disconnect()     // Catch: java.lang.Exception -> L68
        L68:
            return
    }

    public static void Y(android.app.Activity r1, android.content.Intent r2) {
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r2.addFlags(r0)
            r1.finish()
            r1.startActivity(r2)
            W()
            return
    }

    public static void Z(boolean r0) {
            cn.bluemobi.dylan.uncaughtexception.a.l = r0
            return
    }

    static /* synthetic */ boolean a() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.l
            return r0
    }

    public static void a0(int r0) {
            return
    }

    static /* synthetic */ void b(java.lang.String r0, java.lang.String r1) {
            X(r0, r1)
            return
    }

    public static void b0(java.lang.String r0) {
            cn.bluemobi.dylan.uncaughtexception.a.n = r0
            return
    }

    static /* synthetic */ java.lang.Class c() {
            java.lang.Class<? extends android.app.Activity> r0 = cn.bluemobi.dylan.uncaughtexception.a.f232k
            return r0
    }

    public static void c0(java.lang.String[] r0) {
            cn.bluemobi.dylan.uncaughtexception.a.m = r0
            return
    }

    static /* synthetic */ java.lang.Class d(java.lang.Class r0) {
            cn.bluemobi.dylan.uncaughtexception.a.f232k = r0
            return r0
    }

    public static void d0(boolean r0) {
            return
    }

    static /* synthetic */ java.lang.Class e(android.content.Context r0) {
            java.lang.Class r0 = P(r0)
            return r0
    }

    public static void e0(java.lang.Class<? extends android.app.Activity> r0) {
            return
    }

    static /* synthetic */ boolean f() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f228g
            return r0
    }

    public static void f0(boolean r0) {
            return
    }

    static /* synthetic */ int g() {
            int r0 = cn.bluemobi.dylan.uncaughtexception.a.f230i
            return r0
    }

    public static void g0(java.lang.Class<? extends android.app.Activity> r0) {
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference h() {
            java.lang.ref.WeakReference<android.app.Activity> r0 = cn.bluemobi.dylan.uncaughtexception.a.f225d
            return r0
    }

    public static void h0(boolean r0) {
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference i(java.lang.ref.WeakReference r0) {
            cn.bluemobi.dylan.uncaughtexception.a.f225d = r0
            return r0
    }

    public static java.lang.String i0(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L25
        L9:
            int r2 = r4.read(r1)     // Catch: java.lang.Exception -> L25
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Exception -> L25
            goto L9
        L15:
            r0.close()     // Catch: java.lang.Exception -> L25
            r4.close()     // Catch: java.lang.Exception -> L25
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L25
            r0.<init>(r4)     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            r4 = 0
            return r4
    }

    static /* synthetic */ void j() {
            W()
            return
    }

    static /* synthetic */ java.lang.Class k() {
            java.lang.Class<? extends android.app.Activity> r0 = cn.bluemobi.dylan.uncaughtexception.a.f231j
            return r0
    }

    static /* synthetic */ java.lang.Class l(java.lang.Class r0) {
            cn.bluemobi.dylan.uncaughtexception.a.f231j = r0
            return r0
    }

    static /* synthetic */ android.app.Application m() {
            android.app.Application r0 = cn.bluemobi.dylan.uncaughtexception.a.f224c
            return r0
    }

    static /* synthetic */ java.lang.Class n(android.content.Context r0) {
            java.lang.Class r0 = O(r0)
            return r0
    }

    static /* synthetic */ boolean o(java.lang.Throwable r0, java.lang.Class r1) {
            boolean r0 = V(r0, r1)
            return r0
    }

    static /* synthetic */ boolean p() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f227f
            return r0
    }

    static /* synthetic */ boolean q() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f226e
            return r0
    }

    static /* synthetic */ boolean r(boolean r0) {
            cn.bluemobi.dylan.uncaughtexception.a.f226e = r0
            return r0
    }

    static /* synthetic */ boolean s() {
            boolean r0 = cn.bluemobi.dylan.uncaughtexception.a.f229h
            return r0
    }

    private static java.lang.String t(java.lang.String r2) {
            if (r2 == 0) goto L2e
            int r0 = r2.length()
            if (r0 != 0) goto L9
            goto L2e
        L9:
            r0 = 0
            char r0 = r2.charAt(r0)
            boolean r1 = java.lang.Character.isUpperCase(r0)
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r0 = java.lang.Character.toUpperCase(r0)
            r1.append(r0)
            r0 = 1
            java.lang.String r2 = r2.substring(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
        L2e:
            java.lang.String r2 = ""
            return r2
    }

    public static void u(android.app.Activity r0) {
            r0.finish()
            W()
            return
    }

    public static java.lang.String v(android.content.Context r6, java.lang.String r7) {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.CHINA
            r1.<init>(r2, r3)
            java.lang.String r2 = x(r6, r1)
            java.lang.String r3 = N(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r5 = "ApplicationName: "
            r4.append(r5)
            java.lang.String r6 = y(r6)
            r4.append(r6)
            java.lang.String r6 = " \n"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "Build version: "
            r5.append(r4)
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "Build date: "
            r4.append(r3)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "Current date: "
            r3.append(r2)
            java.lang.String r0 = r1.format(r0)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "Device: "
            r1.append(r0)
            java.lang.String r0 = C()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "SupportedAbis: "
            r0.append(r6)
            java.lang.String r6 = M()
            r0.append(r6)
            java.lang.String r6 = " \n\n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "Stack trace:  \n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String w(android.content.Context r6, android.content.Intent r7) {
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.CHINA
            r1.<init>(r2, r3)
            java.lang.String r2 = x(r6, r1)
            java.lang.String r3 = N(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r5 = "ApplicationName: "
            r4.append(r5)
            java.lang.String r6 = y(r6)
            r4.append(r6)
            java.lang.String r6 = " \n"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "Build version: "
            r5.append(r4)
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "Build date: "
            r4.append(r3)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "Current date: "
            r3.append(r2)
            java.lang.String r0 = r1.format(r0)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "Device: "
            r1.append(r0)
            java.lang.String r0 = C()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "SupportedAbis: "
            r0.append(r6)
            java.lang.String r6 = M()
            r0.append(r6)
            java.lang.String r6 = " \n\n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "Stack trace:  \n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = L(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String x(android.content.Context r2, java.text.DateFormat r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            long r0 = r2.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            goto L12
        L10:
            r0 = 0
        L12:
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r2 = r3.format(r2)
            return r2
    }

    public static java.lang.String y(android.content.Context r3) {
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lf
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            goto L10
        Lf:
            r1 = r0
        L10:
            java.lang.CharSequence r3 = r1.getApplicationLabel(r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    private static java.lang.String z(android.content.Context r3, java.text.DateFormat r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L2b
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)     // Catch: java.lang.Exception -> L2b
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Exception -> L2b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = "classes.dex"
            java.util.zip.ZipEntry r3 = r0.getEntry(r3)     // Catch: java.lang.Exception -> L2b
            long r1 = r3.getTime()     // Catch: java.lang.Exception -> L2b
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Exception -> L2b
            r3.<init>(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r4.format(r3)     // Catch: java.lang.Exception -> L2b
            r0.close()     // Catch: java.lang.Exception -> L2b
            return r3
        L2b:
            java.lang.String r3 = "Unknown"
            return r3
    }
}
