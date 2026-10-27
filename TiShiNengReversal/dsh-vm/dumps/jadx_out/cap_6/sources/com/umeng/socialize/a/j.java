package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    private static final java.lang.String a = "UMExecutor";
    private static volatile java.util.concurrent.ScheduledThreadPoolExecutor b;
    private static volatile java.util.concurrent.ExecutorService c;
    private static final java.util.concurrent.ThreadFactory d = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a implements java.lang.Runnable {
        private final java.lang.Runnable a;

        public a(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                java.lang.Runnable r0 = r4.a     // Catch: java.lang.Throwable -> L8
                if (r0 == 0) goto La
                r0.run()     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                goto Lb
            La:
                return
            Lb:
                java.lang.String r0 = r0.getMessage()
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "error:"
                r3 = 0
                r1[r3] = r2
                r2 = 1
                r1[r2] = r0
                java.lang.String r0 = "UMExecutor"
                com.umeng.socialize.a.m.d(r0, r1)
                return
        }
    }

    static {
            com.umeng.socialize.a.j$1 r0 = new com.umeng.socialize.a.j$1
            r0.<init>()
            com.umeng.socialize.a.j.d = r0
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Future<?> a(java.lang.Runnable r3) {
            java.util.concurrent.ExecutorService r0 = b()     // Catch: java.lang.Throwable -> Ld
            java.lang.Runnable r3 = d(r3)     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.Future r3 = r0.submit(r3)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "submitSingleTask error:"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = "UMExecutor"
            com.umeng.socialize.a.m.d(r3, r0)
            r3 = 0
            return r3
    }

    private static java.util.concurrent.ScheduledThreadPoolExecutor a() {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.socialize.a.j.b
            if (r0 != 0) goto L3c
            java.lang.Class<com.umeng.socialize.a.j> r0 = com.umeng.socialize.a.j.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.socialize.a.j.b     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L38
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L36
            int r1 = r1.availableProcessors()     // Catch: java.lang.Throwable -> L36
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L36
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ThreadFactory r3 = com.umeng.socialize.a.j.d     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36
            com.umeng.socialize.a.j.b = r2     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.socialize.a.j.b     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L36
            r3 = 3
            r1.setKeepAliveTime(r3, r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.umeng.socialize.a.j.b     // Catch: java.lang.Throwable -> L36
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
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.umeng.socialize.a.j.b
            return r0
    }

    @java.lang.SafeVarargs
    public static <Params, Progress, Result> void a(android.os.AsyncTask<Params, Progress, Result> r2, Params... r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> Lb
            r2.executeOnExecutor(r0, r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "executeOnExecutor error:"
            r1 = 0
            r3[r1] = r0
            r0 = 1
            r3[r0] = r2
            java.lang.String r2 = "UMExecutor"
            com.umeng.socialize.a.m.d(r2, r3)
            return
    }

    public static void a(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> L8
            r0.schedule(r1, r2, r4)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "schedule error:"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "UMExecutor"
            com.umeng.socialize.a.m.d(r1, r2)
            return
    }

    private static java.util.concurrent.ExecutorService b() {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.a.j.c
            if (r0 != 0) goto L1a
            java.lang.Class<com.umeng.socialize.a.j> r0 = com.umeng.socialize.a.j.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = com.umeng.socialize.a.j.c     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.util.concurrent.ThreadFactory r1 = com.umeng.socialize.a.j.d     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)     // Catch: java.lang.Throwable -> L14
            com.umeng.socialize.a.j.c = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L1a:
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.a.j.c
            return r0
    }

    public static void b(java.lang.Runnable r3) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> Lc
            java.lang.Runnable r3 = d(r3)     // Catch: java.lang.Throwable -> Lc
            r0.execute(r3)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "execute error:"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = "UMExecutor"
            com.umeng.socialize.a.m.d(r3, r0)
            return
    }

    public static java.util.concurrent.Future<?> c(java.lang.Runnable r3) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> Ld
            java.lang.Runnable r3 = d(r3)     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.Future r3 = r0.submit(r3)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "submit error:"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = "UMExecutor"
            com.umeng.socialize.a.m.d(r3, r0)
            r3 = 0
            return r3
    }

    private static java.lang.Runnable d(java.lang.Runnable r1) {
            com.umeng.socialize.a.j$a r0 = new com.umeng.socialize.a.j$a
            r0.<init>(r1)
            return r0
    }
}
