package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SchedulerPoolFactory {
    static final java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> POOLS = null;
    public static final boolean PURGE_ENABLED = false;
    static final java.lang.String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS = 0;
    static final java.lang.String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> PURGE_THREAD = null;


    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L35
            boolean r1 = java.lang.Boolean.getBoolean(r1)
            if (r1 == 0) goto L34
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L34
            java.lang.Integer r0 = java.lang.Integer.getInteger(r2, r3)
            int r3 = r0.intValue()
            r0 = r3
            r3 = r1
            goto L36
        L34:
            r3 = r1
        L35:
            r0 = 1
        L36:
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED = r3
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS = r0
            start()
            return
    }

    private SchedulerPoolFactory() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static java.util.concurrent.ScheduledExecutorService create(java.util.concurrent.ThreadFactory r2) {
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r2)
            boolean r0 = r2 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r0 == 0) goto L11
            r0 = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = (java.util.concurrent.ScheduledThreadPoolExecutor) r0
            java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r1 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
            r1.put(r0, r2)
        L11:
            return r2
    }

    public static void shutdown() {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r0.shutdownNow()
            java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
            r0.clear()
            return
    }

    public static void start() {
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L11
            boolean r2 = r1.isShutdown()
            if (r2 != 0) goto L11
            return
        L11:
            io.reactivex.internal.schedulers.RxThreadFactory r2 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r3 = "RxSchedulerPurge"
            r2.<init>(r3)
            r3 = 1
            java.util.concurrent.ScheduledExecutorService r4 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)
            boolean r0 = androidx.camera.view.p.a(r0, r1, r4)
            if (r0 == 0) goto L32
            io.reactivex.internal.schedulers.SchedulerPoolFactory$1 r5 = new io.reactivex.internal.schedulers.SchedulerPoolFactory$1
            r5.<init>()
            int r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS
            long r6 = (long) r0
            long r8 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r4.scheduleAtFixedRate(r5, r6, r8, r10)
            return
        L32:
            r4.shutdownNow()
            goto L0
    }
}
