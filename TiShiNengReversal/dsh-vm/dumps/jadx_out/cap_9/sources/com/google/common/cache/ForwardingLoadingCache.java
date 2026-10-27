package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingCache<K, V> implements com.google.common.cache.LoadingCache<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class SimpleForwardingLoadingCache<K, V> extends com.google.common.cache.ForwardingLoadingCache<K, V> {
        private final com.google.common.cache.LoadingCache<K, V> delegate;

        protected SimpleForwardingLoadingCache(com.google.common.cache.LoadingCache<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.cache.LoadingCache r1 = (com.google.common.cache.LoadingCache) r1
                r0.delegate = r1
                return
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ com.google.common.cache.Cache delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        protected final com.google.common.cache.LoadingCache<K, V> delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache<K, V> r0 = r1.delegate
                return r0
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                com.google.common.cache.LoadingCache r0 = r1.delegate()
                return r0
        }
    }

    protected ForwardingLoadingCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ com.google.common.cache.Cache delegate() {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.cache.LoadingCache<K, V> delegate();

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.cache.LoadingCache
    public V get(K r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            com.google.common.collect.ImmutableMap r2 = r0.getAll(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            java.lang.Object r2 = r0.getUnchecked(r2)
            return r2
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K r2) {
            r1 = this;
            com.google.common.cache.LoadingCache r0 = r1.delegate()
            r0.refresh(r2)
            return
    }
}
