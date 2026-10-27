package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class as {
    private static final java.lang.String a = "UMExecutor";
    private static volatile java.util.concurrent.ScheduledThreadPoolExecutor b;
    private static final java.util.concurrent.ThreadFactory c = null;


    static {
            com.umeng.analytics.pro.as$1 r0 = new com.umeng.analytics.pro.as$1
            r0.<init>()
            com.umeng.analytics.pro.as.c = r0
            return
    }

    public as() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.concurrent.ScheduledThreadPoolExecutor a() {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.analytics.pro.as.b
            if (r0 != 0) goto L3c
            java.lang.Class<com.umeng.analytics.pro.as> r0 = com.umeng.analytics.pro.as.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.analytics.pro.as.b     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L38
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L36
            int r1 = r1.availableProcessors()     // Catch: java.lang.Throwable -> L36
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L36
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ThreadFactory r3 = com.umeng.analytics.pro.as.c     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36
            com.umeng.analytics.pro.as.b = r2     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.analytics.pro.as.b     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L36
            r3 = 3
            r1.setKeepAliveTime(r3, r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.analytics.pro.as.b     // Catch: java.lang.Throwable -> L36
            r2 = 1
            r1.allowCoreThreadTimeOut(r2)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r1 = move-exception
            goto L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
        L3c:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.analytics.pro.as.b
            return r0
    }

    public static void a(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> L8
            r0.schedule(r1, r2, r4)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "schedule error:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)
            return
    }
}
