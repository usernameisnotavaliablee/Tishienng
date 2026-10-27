package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ak {
    private static final java.util.concurrent.atomic.AtomicInteger a = null;
    private static com.tencent.bugly.proguard.ak b;
    private java.util.concurrent.ScheduledExecutorService c;


    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            com.tencent.bugly.proguard.ak.a = r0
            return
    }

    protected ak() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            com.tencent.bugly.proguard.ak$1 r0 = new com.tencent.bugly.proguard.ak$1
            r0.<init>(r2)
            r1 = 3
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r0)
            r2.c = r0
            if (r0 == 0) goto L1c
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "[AsyncTaskHandler] ScheduledExecutorService is not valiable!"
            com.tencent.bugly.proguard.al.d(r1, r0)
            return
    }

    public static synchronized com.tencent.bugly.proguard.ak a() {
            java.lang.Class<com.tencent.bugly.proguard.ak> r0 = com.tencent.bugly.proguard.ak.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ak r1 = com.tencent.bugly.proguard.ak.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.ak r1 = new com.tencent.bugly.proguard.ak     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.ak.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.ak r1 = com.tencent.bugly.proguard.ak.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger d() {
            java.util.concurrent.atomic.AtomicInteger r0 = com.tencent.bugly.proguard.ak.a
            return r0
    }

    public final synchronized boolean a(java.lang.Runnable r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.c()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.String r6 = "[AsyncTaskHandler] Async handler was closed, should not post task."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r6, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r1
        L11:
            r6 = move-exception
            goto L3b
        L13:
            if (r6 != 0) goto L1e
            java.lang.String r6 = "[AsyncTaskHandler] Task input is null."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r6, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r1
        L1e:
            java.lang.String r0 = "[AsyncTaskHandler] Post a normal task: %s"
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L11
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L11
            r4[r1] = r2     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.c(r0, r4)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ScheduledExecutorService r0 = r5.c     // Catch: java.lang.Throwable -> L37
            r0.execute(r6)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r5)
            return r3
        L37:
            boolean r6 = com.tencent.bugly.proguard.p.c     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r1
        L3b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
            throw r6
    }

    public final synchronized boolean a(java.lang.Runnable r6, long r7) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.c()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.String r6 = "[AsyncTaskHandler] Async handler was closed, should not post task."
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.d(r6, r7)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r1
        L11:
            r6 = move-exception
            goto L41
        L13:
            r2 = 0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1a
            goto L1b
        L1a:
            r7 = r2
        L1b:
            java.lang.String r0 = "[AsyncTaskHandler] Post a delay(time: %dms) task: %s"
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L11
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L11
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L11
            r4[r1] = r2     // Catch: java.lang.Throwable -> L11
            r2 = 1
            r4[r2] = r3     // Catch: java.lang.Throwable -> L11
            com.tencent.bugly.proguard.al.c(r0, r4)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ScheduledExecutorService r0 = r5.c     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L3d
            r0.schedule(r6, r7, r3)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return r2
        L3d:
            boolean r6 = com.tencent.bugly.proguard.p.c     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return r1
        L41:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L11
            throw r6
    }

    public final synchronized void b() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ScheduledExecutorService r0 = r2.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            java.lang.String r0 = "[AsyncTaskHandler] Close async handler."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            com.tencent.bugly.proguard.al.c(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.ScheduledExecutorService r0 = r2.c     // Catch: java.lang.Throwable -> L19
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            monitor-exit(r2)
            return
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public final synchronized boolean c() {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r1.c     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            monitor-exit(r1)
            r0 = 1
            return r0
        Le:
            r0 = move-exception
            goto L13
        L10:
            monitor-exit(r1)
            r0 = 0
            return r0
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }
}
