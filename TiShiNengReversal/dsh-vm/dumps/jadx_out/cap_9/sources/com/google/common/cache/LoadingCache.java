package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface LoadingCache<K, V> extends com.google.common.cache.Cache<K, V>, com.google.common.base.Function<K, V> {
    @Override // com.google.common.base.Function
    @java.lang.Deprecated
    V apply(K r1);

    @Override // com.google.common.cache.Cache
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    V get(K r1) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAll(java.lang.Iterable<? extends K> r1) throws java.util.concurrent.ExecutionException;

    V getUnchecked(K r1);

    void refresh(K r1);
}
