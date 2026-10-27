package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public static volatile java.util.concurrent.ScheduledThreadPoolExecutor a;
    public static java.util.concurrent.ThreadFactory b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.util.concurrent.ThreadFactory {
        public java.util.concurrent.atomic.AtomicInteger a;

        public a() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.a = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "ZIDThreadPoolExecutor"
                r4.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r3.a
                r2 = 1
                int r1 = r1.addAndGet(r2)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.setName(r4)
                return r0
        }
    }

    static {
            com.umeng.umzid.c$a r0 = new com.umeng.umzid.c$a
            r0.<init>()
            com.umeng.umzid.c.b = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ScheduledThreadPoolExecutor a() {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.umzid.c.a
            if (r0 != 0) goto L25
            java.lang.Class<com.umeng.umzid.c> r0 = com.umeng.umzid.c.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.umzid.c.a     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1f
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.availableProcessors()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 * 4
            java.util.concurrent.ThreadFactory r3 = com.umeng.umzid.c.b     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1f
            com.umeng.umzid.c.a = r1     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        L25:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.umzid.c.a
            return r0
    }

    public static void a(java.lang.Runnable r1) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> L7
            r0.execute(r1)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }
}
