package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static final java.lang.String a = "BatteryUtils";
    private static boolean b;
    private static android.content.Context c;
    private android.content.BroadcastReceiver d;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.commonsdk.internal.utils.c a = null;

        static {
                com.umeng.commonsdk.internal.utils.c r0 = new com.umeng.commonsdk.internal.utils.c
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.internal.utils.c.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.internal.utils.c a() {
                com.umeng.commonsdk.internal.utils.c r0 = com.umeng.commonsdk.internal.utils.c.a.a
                return r0
        }
    }

    static {
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            com.umeng.commonsdk.internal.utils.c$1 r0 = new com.umeng.commonsdk.internal.utils.c$1
            r0.<init>(r1)
            r1.d = r0
            return
    }

    /* synthetic */ c(com.umeng.commonsdk.internal.utils.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.commonsdk.internal.utils.c a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.commonsdk.internal.utils.c.c
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.internal.utils.c.c = r1
        L10:
            com.umeng.commonsdk.internal.utils.c r1 = com.umeng.commonsdk.internal.utils.c.a.a()
            return r1
    }

    static /* synthetic */ android.content.Context d() {
            android.content.Context r0 = com.umeng.commonsdk.internal.utils.c.c
            return r0
    }

    public synchronized boolean a() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = com.umeng.commonsdk.internal.utils.c.b     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized void b() {
            r3 = this;
            monitor-enter(r3)
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.addAction(r1)     // Catch: java.lang.Throwable -> L16
            android.content.Context r1 = com.umeng.commonsdk.internal.utils.c.c     // Catch: java.lang.Throwable -> L16
            android.content.BroadcastReceiver r2 = r3.d     // Catch: java.lang.Throwable -> L16
            r1.registerReceiver(r2, r0)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            com.umeng.commonsdk.internal.utils.c.b = r0     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r0 = move-exception
            android.content.Context r1 = com.umeng.commonsdk.internal.utils.c.c     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r3)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = com.umeng.commonsdk.internal.utils.c.c     // Catch: java.lang.Throwable -> Lc
            android.content.BroadcastReceiver r1 = r2.d     // Catch: java.lang.Throwable -> Lc
            r0.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> Lc
            r0 = 0
            com.umeng.commonsdk.internal.utils.c.b = r0     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r0 = move-exception
            android.content.Context r1 = com.umeng.commonsdk.internal.utils.c.c     // Catch: java.lang.Throwable -> L14
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }
}
