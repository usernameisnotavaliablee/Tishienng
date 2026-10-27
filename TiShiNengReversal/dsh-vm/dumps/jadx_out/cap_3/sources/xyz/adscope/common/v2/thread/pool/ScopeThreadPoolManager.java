package xyz.adscope.common.v2.thread.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScopeThreadPoolManager extends xyz.adscope.common.v2.singleton.IAbstractManager<xyz.adscope.common.v2.thread.pool.IBaseThreadPool> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager instance;

        static {
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = new xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager access$100() {
                xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.InstanceHolder.instance
                return r0
        }
    }

    private ScopeThreadPoolManager() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ScopeThreadPoolManager(xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager getInstance() {
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.InstanceHolder.access$100()
            return r0
    }

    @Override // xyz.adscope.common.v2.singleton.IAbstractManager
    protected /* bridge */ /* synthetic */ xyz.adscope.common.v2.thread.pool.IBaseThreadPool createNewImpl(android.content.Context r1) {
            r0 = this;
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r1 = r0.createNewImpl2(r1)
            return r1
    }

    @Override // xyz.adscope.common.v2.singleton.IAbstractManager
    /* renamed from: createNewImpl, reason: avoid collision after fix types in other method */
    protected xyz.adscope.common.v2.thread.pool.IBaseThreadPool createNewImpl2(android.content.Context r1) {
            r0 = this;
            xyz.adscope.common.v2.thread.pool.ScopeThreadPool r1 = new xyz.adscope.common.v2.thread.pool.ScopeThreadPool
            r1.<init>()
            return r1
    }
}
