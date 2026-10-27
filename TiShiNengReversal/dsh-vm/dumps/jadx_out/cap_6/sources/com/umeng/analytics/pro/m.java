package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(14)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m implements android.app.Application.ActivityLifecycleCallbacks {
    private static com.umeng.analytics.pro.m a;
    private final int b;
    private boolean c;
    private boolean d;
    private android.os.Handler e;
    private java.util.ArrayList<com.umeng.analytics.pro.n> f;
    private com.umeng.analytics.pro.m.a g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.umeng.analytics.pro.m a;

        a(com.umeng.analytics.pro.m r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.umeng.analytics.pro.m r0 = r3.a
                boolean r0 = com.umeng.analytics.pro.m.a(r0)
                java.lang.String r1 = "MobclickRT"
                if (r0 == 0) goto L3c
                com.umeng.analytics.pro.m r0 = r3.a
                boolean r0 = com.umeng.analytics.pro.m.b(r0)
                if (r0 == 0) goto L3c
                com.umeng.analytics.pro.m r0 = r3.a
                r2 = 0
                com.umeng.analytics.pro.m.a(r0, r2)
                java.lang.String r0 = "--->>> went background."
                com.umeng.commonsdk.debug.UMRTLog.i(r1, r0)
            L1d:
                com.umeng.analytics.pro.m r0 = r3.a
                java.util.ArrayList r0 = com.umeng.analytics.pro.m.c(r0)
                int r0 = r0.size()
                if (r2 >= r0) goto L3b
                com.umeng.analytics.pro.m r0 = r3.a
                java.util.ArrayList r0 = com.umeng.analytics.pro.m.c(r0)
                java.lang.Object r0 = r0.get(r2)
                com.umeng.analytics.pro.n r0 = (com.umeng.analytics.pro.n) r0
                r0.n()
                int r2 = r2 + 1
                goto L1d
            L3b:
                return
            L3c:
                java.lang.String r0 = "--->>> still foreground."
                com.umeng.commonsdk.debug.UMRTLog.i(r1, r0)
                return
        }
    }

    static {
            com.umeng.analytics.pro.m r0 = new com.umeng.analytics.pro.m
            r0.<init>()
            com.umeng.analytics.pro.m.a = r0
            return
    }

    private m() {
            r2 = this;
            r2.<init>()
            r0 = 3000(0xbb8, float:4.204E-42)
            r2.b = r0
            r0 = 0
            r2.c = r0
            r0 = 1
            r2.d = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            com.umeng.analytics.pro.m$a r0 = new com.umeng.analytics.pro.m$a
            r0.<init>(r2)
            r2.g = r0
            return
    }

    public static com.umeng.analytics.pro.m a() {
            com.umeng.analytics.pro.m r0 = com.umeng.analytics.pro.m.a
            return r0
    }

    public static void a(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto Lb
            android.app.Application r1 = (android.app.Application) r1
            com.umeng.analytics.pro.m r0 = com.umeng.analytics.pro.m.a
            r1.registerActivityLifecycleCallbacks(r0)
        Lb:
            return
    }

    static /* synthetic */ boolean a(com.umeng.analytics.pro.m r0) {
            boolean r0 = r0.c
            return r0
    }

    static /* synthetic */ boolean a(com.umeng.analytics.pro.m r0, boolean r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ boolean b(com.umeng.analytics.pro.m r0) {
            boolean r0 = r0.d
            return r0
    }

    static /* synthetic */ java.util.ArrayList c(com.umeng.analytics.pro.m r0) {
            java.util.ArrayList<com.umeng.analytics.pro.n> r0 = r0.f
            return r0
    }

    public synchronized void a(com.umeng.analytics.pro.n r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto Lc
            java.util.ArrayList<com.umeng.analytics.pro.n> r0 = r1.f     // Catch: java.lang.Throwable -> L9
            r0.add(r2)     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
        Lc:
            monitor-exit(r1)
            return
    }

    public synchronized void b(com.umeng.analytics.pro.n r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L21
            r0 = 0
        L4:
            java.util.ArrayList<com.umeng.analytics.pro.n> r1 = r2.f     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1a
            if (r0 >= r1) goto L21
            java.util.ArrayList<com.umeng.analytics.pro.n> r1 = r2.f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1a
            if (r1 != r3) goto L1c
            java.util.ArrayList<com.umeng.analytics.pro.n> r1 = r2.f     // Catch: java.lang.Throwable -> L1a
            r1.remove(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L1f
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L21:
            monitor-exit(r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            r4 = 1
            r3.d = r4
            com.umeng.analytics.pro.m$a r4 = r3.g
            if (r4 == 0) goto L15
            android.os.Handler r0 = r3.e
            r0.removeCallbacks(r4)
            android.os.Handler r4 = r3.e
            com.umeng.analytics.pro.m$a r0 = r3.g
            r1 = 3000(0xbb8, double:1.482E-320)
            r4.postDelayed(r0, r1)
        L15:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            r2 = 0
            r1.d = r2
            r2 = 1
            r1.c = r2
            com.umeng.analytics.pro.m$a r2 = r1.g
            if (r2 == 0) goto Lf
            android.os.Handler r0 = r1.e
            r0.removeCallbacks(r2)
        Lf:
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
    public void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
