package com.umeng.ccg;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static volatile boolean a = true;
    private static volatile boolean b = true;
    private static volatile boolean c = true;
    private static volatile boolean d = true;
    private static java.lang.Object e;
    private static java.util.Map<java.lang.String, java.lang.Boolean> f;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.ccg.b.f = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.ccg.b.e = r0
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(boolean r3) {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            com.umeng.ccg.b.d = r3     // Catch: java.lang.Throwable -> L12
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.ccg.b.f     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "col_apl"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public static boolean a() {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            boolean r1 = com.umeng.ccg.b.a     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean a(java.lang.String r2) {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.ccg.b.f     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.ccg.b.f     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r2 = move-exception
            goto L1d
        L1a:
            r2 = 1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    public static boolean b() {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            boolean r1 = com.umeng.ccg.b.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean c() {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            boolean r1 = com.umeng.ccg.b.c     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static boolean d() {
            java.lang.Object r0 = com.umeng.ccg.b.e
            monitor-enter(r0)
            boolean r1 = com.umeng.ccg.b.d     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
