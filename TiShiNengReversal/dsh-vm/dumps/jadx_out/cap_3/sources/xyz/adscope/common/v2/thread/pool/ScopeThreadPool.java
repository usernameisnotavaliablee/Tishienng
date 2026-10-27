package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ScopeThreadPool implements xyz.adscope.common.v2.thread.pool.IBaseThreadPool {
    private static final java.lang.String GROUP_ANALYSE = "T_analyse";
    private static final java.lang.String GROUP_BASIC = "T_basic";
    private static final java.lang.String GROUP_INIT = "T_init";
    private static final java.lang.String GROUP_LOCAL = "T_local";
    private static final java.lang.String GROUP_REQUEST = "T_request";
    private final int CORE_NUM;
    private final int MAX_NUM;
    private final java.util.concurrent.ExecutorService mAnalyseExecutor;
    private final java.util.concurrent.ExecutorService mBasicExecutor;
    private final java.util.concurrent.ExecutorService mCacheExecutor;
    private final java.util.concurrent.ExecutorService mInitExecutor;
    private final java.util.concurrent.ExecutorService mLocalExecutor;
    private final java.util.concurrent.ExecutorService mRequestExecutor;
    private final java.util.concurrent.ScheduledExecutorService mScheduledExecutor;

    ScopeThreadPool() {
            r7 = this;
            r7.<init>()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r7.CORE_NUM = r0
            r1 = 2
            int r0 = r0 / r1
            int r0 = r0 + 1
            r2 = 4
            int r0 = java.lang.Math.max(r0, r2)
            r7.MAX_NUM = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            java.lang.String r3 = "T_request"
            r4 = 5
            r0.<init>(r4, r3)
            r3 = 8
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r3, r0)
            r7.mRequestExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            java.lang.String r5 = "T_basic"
            r0.<init>(r4, r5)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r3, r0)
            r7.mBasicExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            r0.<init>(r4, r5)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r3, r0)
            r7.mCacheExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            java.lang.String r6 = "T_init"
            r0.<init>(r4, r6)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r7.mInitExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            java.lang.String r1 = "T_local"
            r0.<init>(r4, r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r3, r0)
            r7.mLocalExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            java.lang.String r1 = "T_analyse"
            r0.<init>(r4, r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r2, r0)
            r7.mAnalyseExecutor = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadFactory r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadFactory
            r0.<init>(r4, r5)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r0)
            r7.mScheduledExecutor = r0
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeAnalyseAsyncTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mAnalyseExecutor
            r0.execute(r2)
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeBasicAsyncTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mBasicExecutor
            r0.execute(r2)
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeInitAsyncTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mInitExecutor
            r0.execute(r2)
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeLocalAsyncTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mLocalExecutor
            r0.execute(r2)
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeRequestAsyncTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mRequestExecutor
            r0.execute(r2)
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void executeResourceCacheTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mCacheExecutor
            r0.execute(r2)
            return
    }

    void removeScheduleAtFixedRate(java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.mScheduledExecutor
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r1 == 0) goto Lb
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = (java.util.concurrent.ScheduledThreadPoolExecutor) r0
            r0.remove(r3)
        Lb:
            return
    }

    @Override // xyz.adscope.common.v2.thread.pool.IBaseThreadPool
    public void scheduleAsyncTask(java.lang.Runnable r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r1.mScheduledExecutor
            r0.schedule(r2, r3, r5)
            return
    }

    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.mScheduledExecutor
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r8
    }
}
