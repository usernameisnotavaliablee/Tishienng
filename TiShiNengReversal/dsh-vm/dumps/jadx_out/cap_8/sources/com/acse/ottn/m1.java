package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m1 {

    /* renamed from: e, reason: collision with root package name */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static volatile com.acse.ottn.m1 f2473e = null;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f2474f = "HelpShopActivityManager";
    public android.app.Activity a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.m1.c f2475b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.BroadcastReceiver f2476c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.BroadcastReceiver f2477d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends android.content.BroadcastReceiver {
        public final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f2478b;

        /* renamed from: c, reason: collision with root package name */
        public final java.lang.String f2479c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.m1 f2480d;

        public a(com.acse.ottn.m1 r1) {
                r0 = this;
                r0.f2480d = r1
                r0.<init>()
                java.lang.String r1 = "reason"
                r0.a = r1
                java.lang.String r1 = "homekey"
                r0.f2478b = r1
                java.lang.String r1 = "recentapps"
                r0.f2479c = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        @androidx.annotation.RequiresApi(api = 21)
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = com.acse.ottn.m1.a()
                java.lang.String r1 = "收到注册广播"
                com.acse.ottn.h2.a(r0, r1)
                java.lang.String r0 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L5b
                java.lang.String r3 = "reason"
                java.lang.String r3 = r4.getStringExtra(r3)
                if (r3 == 0) goto L5b
                com.acse.ottn.m1 r4 = r2.f2480d
                android.app.Activity r4 = com.acse.ottn.m1.a(r4)
                if (r4 == 0) goto L45
                com.acse.ottn.m1 r4 = r2.f2480d
                android.app.Activity r0 = com.acse.ottn.m1.a(r4)
                r1 = 1
                boolean r4 = com.acse.ottn.m1.a(r4, r0, r1)
                if (r4 == 0) goto L4e
                java.lang.String r4 = com.acse.ottn.m1.a()
                java.lang.String r0 = "结束当前activity1"
                com.acse.ottn.h2.a(r4, r0)
                com.acse.ottn.m1 r4 = r2.f2480d
                android.app.Activity r4 = com.acse.ottn.m1.a(r4)
                r4.finishAndRemoveTask()
                goto L4e
            L45:
                java.lang.String r4 = com.acse.ottn.m1.a()
                java.lang.String r0 = "结束当前activity1 ==null"
                com.acse.ottn.h2.a(r4, r0)
            L4e:
                java.lang.String r4 = "homekey"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L5b
                java.lang.String r4 = "recentapps"
                r3.equals(r4)
            L5b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.acse.ottn.m1 a;

        public b(com.acse.ottn.m1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        @androidx.annotation.RequiresApi(api = 21)
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r2 = r3.getAction()
                java.lang.String r3 = com.acse.ottn.m1.a()
                java.lang.String r0 = "收到注册广播2"
                com.acse.ottn.h2.a(r3, r0)
                java.lang.String r3 = "android.intent.action.SCREEN_OFF"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L39
                com.acse.ottn.m1 r2 = r1.a
                android.app.Activity r2 = com.acse.ottn.m1.a(r2)
                if (r2 == 0) goto L30
                java.lang.String r2 = com.acse.ottn.m1.a()
                java.lang.String r3 = "结束当前activity2"
                com.acse.ottn.h2.a(r2, r3)
                com.acse.ottn.m1 r2 = r1.a
                android.app.Activity r2 = com.acse.ottn.m1.a(r2)
                r2.finishAndRemoveTask()
                return
            L30:
                java.lang.String r2 = com.acse.ottn.m1.a()
                java.lang.String r3 = "结束当前activity2 ==null"
                com.acse.ottn.h2.a(r2, r3)
            L39:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.app.Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ com.acse.ottn.m1 a;

        public c(com.acse.ottn.m1 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(com.acse.ottn.m1 r1, com.acse.ottn.m1.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
                r2 = this;
                java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
                r4.<init>(r3)
                java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r0 = com.acse.ottn.p.m
                r0.add(r4)
                java.lang.String r4 = com.acse.ottn.m1.a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onActivityCreated="
                r0.append(r1)
                java.lang.String r1 = r3.getLocalClassName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.acse.ottn.h2.a(r4, r0)
                com.acse.ottn.m1 r4 = r2.a
                com.acse.ottn.m1.a(r4, r3)
                com.acse.ottn.m1 r4 = r2.a
                r0 = 1
                boolean r3 = com.acse.ottn.m1.a(r4, r3, r0)
                if (r3 == 0) goto L39
                com.acse.ottn.m1 r3 = r2.a
                com.acse.ottn.m1.b(r3)
            L39:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r3) {
                r2 = this;
                java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r0 = com.acse.ottn.p.m
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L22
                java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r1 = com.acse.ottn.p.m
                java.lang.Object r1 = r1.get(r0)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                java.lang.Object r1 = r1.get()
                android.app.Activity r1 = (android.app.Activity) r1
                if (r1 != r3) goto L1f
                java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r1 = com.acse.ottn.p.m
                r1.remove(r0)
            L1f:
                int r0 = r0 + (-1)
                goto L8
            L22:
                com.acse.ottn.m1 r0 = r2.a     // Catch: java.lang.Exception -> L35
                android.content.BroadcastReceiver r0 = com.acse.ottn.m1.c(r0)     // Catch: java.lang.Exception -> L35
                r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L35
                com.acse.ottn.m1 r0 = r2.a     // Catch: java.lang.Exception -> L35
                android.content.BroadcastReceiver r0 = com.acse.ottn.m1.d(r0)     // Catch: java.lang.Exception -> L35
                r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L35
                return
            L35:
                r3 = move-exception
                java.lang.String r0 = com.acse.ottn.m1.a()
                java.lang.String r3 = r3.getMessage()
                com.acse.ottn.h2.a(r0, r3)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r2) {
                r1 = this;
                com.acse.ottn.m1 r2 = r1.a
                r0 = 0
                com.acse.ottn.m1.a(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r2) {
                r1 = this;
                com.acse.ottn.m1 r0 = r1.a
                com.acse.ottn.m1.a(r0, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @androidx.annotation.RequiresApi(api = 21)
        public void onActivityStopped(android.app.Activity r3) {
                r2 = this;
                com.acse.ottn.m1 r0 = r2.a
                r1 = 0
                boolean r0 = com.acse.ottn.m1.a(r0, r3, r1)
                if (r0 == 0) goto L15
                java.lang.String r0 = com.acse.ottn.m1.a()
                java.lang.String r1 = " current activity stop=开始结束"
                com.acse.ottn.h2.a(r0, r1)
                r3.finishAndRemoveTask()
            L15:
                return
        }
    }

    static {
            return
    }

    public m1(android.app.Application r3) {
            r2 = this;
            r2.<init>()
            com.acse.ottn.m1$a r0 = new com.acse.ottn.m1$a
            r0.<init>(r2)
            r2.f2476c = r0
            com.acse.ottn.m1$b r0 = new com.acse.ottn.m1$b
            r0.<init>(r2)
            r2.f2477d = r0
            com.acse.ottn.m1$c r0 = new com.acse.ottn.m1$c
            r1 = 0
            r0.<init>(r2, r1)
            r2.f2475b = r0
            r3.registerActivityLifecycleCallbacks(r0)
            return
    }

    public static /* synthetic */ android.app.Activity a(com.acse.ottn.m1 r0) {
            android.app.Activity r0 = r0.a
            return r0
    }

    public static /* synthetic */ android.app.Activity a(com.acse.ottn.m1 r0, android.app.Activity r1) {
            r0.a = r1
            return r1
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.m1.f2474f
            return r0
    }

    public static void a(android.app.Application r3) {
            com.acse.ottn.m1 r0 = com.acse.ottn.m1.f2473e
            if (r0 != 0) goto L2a
            java.lang.Class<com.acse.ottn.m1> r0 = com.acse.ottn.m1.class
            monitor-enter(r0)
            com.acse.ottn.m1 r1 = com.acse.ottn.m1.f2473e     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L26
            java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r1 = com.acse.ottn.p.m     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + (-1)
        L13:
            if (r1 < 0) goto L1f
            java.util.List<java.lang.ref.WeakReference<android.app.Activity>> r2 = com.acse.ottn.p.m     // Catch: java.lang.Throwable -> L1d
            r2.remove(r1)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + (-1)
            goto L13
        L1d:
            r3 = move-exception
            goto L28
        L1f:
            com.acse.ottn.m1 r1 = new com.acse.ottn.m1     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            com.acse.ottn.m1.f2473e = r1     // Catch: java.lang.Throwable -> L1d
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
        L2a:
            return
    }

    public static /* synthetic */ boolean a(com.acse.ottn.m1 r0, android.app.Activity r1, boolean r2) {
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    public static /* synthetic */ void b(com.acse.ottn.m1 r0) {
            r0.e()
            return
    }

    public static /* synthetic */ android.content.BroadcastReceiver c(com.acse.ottn.m1 r0) {
            android.content.BroadcastReceiver r0 = r0.f2476c
            return r0
    }

    public static com.acse.ottn.m1 c() {
            com.acse.ottn.m1 r0 = com.acse.ottn.m1.f2473e
            if (r0 == 0) goto L7
            com.acse.ottn.m1 r0 = com.acse.ottn.m1.f2473e
            return r0
        L7:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "PGYER Analytic SDK init PgyerActivityManager is error."
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ android.content.BroadcastReceiver d(com.acse.ottn.m1 r0) {
            android.content.BroadcastReceiver r0 = r0.f2477d
            return r0
    }

    public static boolean d() {
            com.acse.ottn.m1 r0 = com.acse.ottn.m1.f2473e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean a(android.app.Activity r3, boolean r4) {
            r2 = this;
            r4 = 0
            java.lang.String r0 = "com.acse.ottn.activity.ExcessActivity"
            java.lang.String r1 = r3.getLocalClassName()     // Catch: java.lang.Exception -> L27
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L27
            if (r0 != 0) goto L29
            java.lang.String r0 = "com.acse.ottn.activity.SeedingLoadingActivity"
            java.lang.String r1 = r3.getLocalClassName()     // Catch: java.lang.Exception -> L27
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L27
            if (r0 != 0) goto L29
            java.lang.String r0 = "com.acse.ottn.activity.WhiteActivity"
            java.lang.String r3 = r3.getLocalClassName()     // Catch: java.lang.Exception -> L27
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L26
            goto L29
        L26:
            return r4
        L27:
            r3 = move-exception
            goto L2b
        L29:
            r3 = 1
            return r3
        L2b:
            java.lang.String r0 = com.acse.ottn.m1.f2474f
            java.lang.String r3 = r3.getMessage()
            com.acse.ottn.h2.a(r0, r3)
            return r4
    }

    public android.app.Activity b() {
            r1 = this;
            android.app.Activity r0 = r1.a
            return r0
    }

    public final void e() {
            r3 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r0.<init>(r1)
            android.app.Activity r1 = r3.a
            android.content.BroadcastReceiver r2 = r3.f2476c
            r1.registerReceiver(r2, r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.<init>(r1)
            android.app.Activity r1 = r3.a
            android.content.BroadcastReceiver r2 = r3.f2477d
            r1.registerReceiver(r2, r0)
            java.lang.String r0 = com.acse.ottn.m1.f2474f
            java.lang.String r1 = "注册"
            com.acse.ottn.h2.a(r0, r1)
            return
    }
}
