package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IRemoveAbleScheduledTask {
    protected final int SCHEDULE_IMMEDIATELY;
    private final java.lang.Runnable mTask;
    private java.util.concurrent.RunnableScheduledFuture<?> scheduledFuture;

    public IRemoveAbleScheduledTask(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.SCHEDULE_IMMEDIATELY = r0
            r1.mTask = r2
            return
    }

    protected final void startScheduled(long r11, long r13, java.util.concurrent.TimeUnit r15) {
            r10 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            r1 = 0
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            boolean r2 = r0 instanceof xyz.adscope.common.v2.thread.pool.ScopeThreadPool
            if (r2 == 0) goto L2b
            r3 = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadPool r3 = (xyz.adscope.common.v2.thread.pool.ScopeThreadPool) r3
            java.lang.Runnable r4 = r10.mTask
            r5 = r11
            r7 = r13
            r9 = r15
            java.util.concurrent.ScheduledFuture r11 = r3.scheduleWithFixedDelay(r4, r5, r7, r9)
            boolean r12 = r11 instanceof java.util.concurrent.RunnableScheduledFuture
            if (r12 == 0) goto L2b
            java.util.concurrent.RunnableScheduledFuture r11 = (java.util.concurrent.RunnableScheduledFuture) r11     // Catch: java.lang.Throwable -> L24
            r10.scheduledFuture = r11     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r0 = move-exception
            r11 = r0
            xyz.adscope.common.v2.log.SDKLog.stack(r11)
            r10.scheduledFuture = r1
        L2b:
            return
    }

    protected final void stopScheduled() {
            r3 = this;
            java.util.concurrent.RunnableScheduledFuture<?> r0 = r3.scheduledFuture
            if (r0 == 0) goto L1c
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            r1 = 0
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r0 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r0
            boolean r2 = r0 instanceof xyz.adscope.common.v2.thread.pool.ScopeThreadPool
            if (r2 == 0) goto L1c
            xyz.adscope.common.v2.thread.pool.ScopeThreadPool r0 = (xyz.adscope.common.v2.thread.pool.ScopeThreadPool) r0
            java.util.concurrent.RunnableScheduledFuture<?> r2 = r3.scheduledFuture
            r0.removeScheduleAtFixedRate(r2)
            r3.scheduledFuture = r1
        L1c:
            return
    }
}
