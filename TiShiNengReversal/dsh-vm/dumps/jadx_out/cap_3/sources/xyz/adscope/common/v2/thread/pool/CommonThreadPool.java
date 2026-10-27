package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CommonThreadPool {
    private final int BASIC_CORE_SIZE;
    private final java.util.concurrent.ExecutorService mCacheExecutor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.thread.pool.CommonThreadPool$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.thread.pool.CommonThreadPool instance;

        static {
                xyz.adscope.common.v2.thread.pool.CommonThreadPool r0 = new xyz.adscope.common.v2.thread.pool.CommonThreadPool
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.thread.pool.CommonThreadPool.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.thread.pool.CommonThreadPool access$100() {
                xyz.adscope.common.v2.thread.pool.CommonThreadPool r0 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.InstanceHolder.instance
                return r0
        }
    }

    private CommonThreadPool() {
            r2 = this;
            r2.<init>()
            r0 = 6
            r2.BASIC_CORE_SIZE = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r2.mCacheExecutor = r0
            xyz.adscope.common.v2.thread.pool.CommonThreadPool r0 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.InstanceHolder.access$100()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ CommonThreadPool(xyz.adscope.common.v2.thread.pool.CommonThreadPool.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.thread.pool.CommonThreadPool getInstance() {
            xyz.adscope.common.v2.thread.pool.CommonThreadPool r0 = xyz.adscope.common.v2.thread.pool.CommonThreadPool.InstanceHolder.access$100()
            return r0
    }

    public void executeResourceCacheTask(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mCacheExecutor
            r0.execute(r2)
            return
    }
}
