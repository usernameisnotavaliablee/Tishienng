package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class aw {
    private static com.umeng.analytics.pro.av a;
    private static boolean b;

    static {
            return
    }

    public aw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r3) {
            java.lang.Class<com.umeng.analytics.pro.aw> r0 = com.umeng.analytics.pro.aw.class
            monitor-enter(r0)
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = "--->>>*** real call OpenDeviceId.getOaid()"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r2)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L30
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L23
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L23
            if (r1 == r2) goto L28
            b(r3)     // Catch: java.lang.Throwable -> L23
            com.umeng.analytics.pro.av r1 = com.umeng.analytics.pro.aw.a     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            java.lang.String r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            monitor-exit(r0)
            return r3
        L23:
            r3 = move-exception
            goto L38
        L25:
            monitor-exit(r0)
            r3 = 0
            return r3
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Cannot be called from the main thread"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L30:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Context is null"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r3     // Catch: java.lang.Throwable -> L23
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    private static void b(android.content.Context r2) {
            com.umeng.analytics.pro.av r0 = com.umeng.analytics.pro.aw.a
            if (r0 != 0) goto L23
            boolean r0 = com.umeng.analytics.pro.aw.b
            if (r0 != 0) goto L23
            java.lang.Class<com.umeng.analytics.pro.aw> r0 = com.umeng.analytics.pro.aw.class
            monitor-enter(r0)
            com.umeng.analytics.pro.av r1 = com.umeng.analytics.pro.aw.a     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            boolean r1 = com.umeng.analytics.pro.aw.b     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            com.umeng.analytics.pro.av r2 = com.umeng.analytics.pro.ay.a(r2)     // Catch: java.lang.Throwable -> L1d
            com.umeng.analytics.pro.aw.a = r2     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            com.umeng.analytics.pro.aw.b = r2     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
        L23:
            return
    }
}
