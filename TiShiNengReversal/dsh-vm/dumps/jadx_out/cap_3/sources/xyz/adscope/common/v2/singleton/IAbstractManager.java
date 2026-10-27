package xyz.adscope.common.v2.singleton;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IAbstractManager<T> implements xyz.adscope.common.v2.singleton.IBaseManagerSingleton<T> {
    private volatile T impl;

    public IAbstractManager() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract T createNewImpl(android.content.Context r1);

    @Override // xyz.adscope.common.v2.singleton.IBaseManagerSingleton
    public T getOrCreateImplement(android.content.Context r2) {
            r1 = this;
            T r0 = r1.impl
            if (r0 != 0) goto L16
            monitor-enter(r1)
            T r0 = r1.impl     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            java.lang.Object r2 = r1.createNewImpl(r2)     // Catch: java.lang.Throwable -> L10
            r1.impl = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
        L16:
            T r2 = r1.impl
            return r2
    }
}
