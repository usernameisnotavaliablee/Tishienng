package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class s {
    public static volatile java.util.concurrent.ScheduledThreadPoolExecutor a;
    public static volatile java.util.concurrent.ExecutorService b;
    public static final java.util.concurrent.ThreadFactory c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.util.concurrent.ThreadFactory {
        public final java.util.concurrent.atomic.AtomicInteger a;

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
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Azx-"
                r0.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.a
                int r1 = r1.incrementAndGet()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = new java.lang.Thread
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.lang.Runnable {
        public final java.lang.Runnable a;

        public b(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.a     // Catch: java.lang.Throwable -> L8
                if (r0 == 0) goto La
                r0.run()     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                goto Lb
            La:
                return
            Lb:
                r0.getMessage()
                return
        }
    }

    static {
            com.uyumao.s$a r0 = new com.uyumao.s$a
            r0.<init>()
            com.uyumao.s.c = r0
            return
    }

    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Future<?> a(java.lang.Runnable r2) {
            java.util.concurrent.ExecutorService r0 = com.uyumao.s.b     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L1a
            java.lang.Class<com.uyumao.s> r0 = com.uyumao.s.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.ExecutorService r1 = com.uyumao.s.b     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.util.concurrent.ThreadFactory r1 = com.uyumao.s.c     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)     // Catch: java.lang.Throwable -> L14
            com.uyumao.s.b = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L26
        L1a:
            java.util.concurrent.ExecutorService r0 = com.uyumao.s.b     // Catch: java.lang.Throwable -> L26
            com.uyumao.s$b r1 = new com.uyumao.s$b     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.Future r2 = r0.submit(r1)     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            r2 = move-exception
            r2.getMessage()
            r2 = 0
            return r2
    }

    public static java.util.concurrent.ScheduledThreadPoolExecutor a() {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.uyumao.s.a
            if (r0 != 0) goto L3c
            java.lang.Class<com.uyumao.s> r0 = com.uyumao.s.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.uyumao.s.a     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L38
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L36
            int r1 = r1.availableProcessors()     // Catch: java.lang.Throwable -> L36
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L36
            r2 = 2
            int r1 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ThreadFactory r3 = com.uyumao.s.c     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36
            com.uyumao.s.a = r2     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.uyumao.s.a     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L36
            r3 = 3
            r1.setKeepAliveTime(r3, r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.uyumao.s.a     // Catch: java.lang.Throwable -> L36
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
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = com.uyumao.s.a
            return r0
    }

    public static void a(java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = a()     // Catch: java.lang.Throwable -> L8
            r0.schedule(r1, r2, r4)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            r1.getMessage()
            return
    }
}
