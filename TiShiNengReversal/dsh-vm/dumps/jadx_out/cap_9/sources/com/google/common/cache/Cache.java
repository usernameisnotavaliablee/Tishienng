package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Cache<K, V> {
    java.util.concurrent.ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K r1, java.util.concurrent.Callable<? extends V> r2) throws java.util.concurrent.ExecutionException;

    com.google.common.collect.ImmutableMap<K, V> getAllPresent(java.lang.Iterable<?> r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V getIfPresent(@com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    void invalidate(@com.google.errorprone.annotations.CompatibleWith("K") java.lang.Object r1);

    void invalidateAll();

    void invalidateAll(java.lang.Iterable<?> r1);

    void put(K r1, V r2);

    void putAll(java.util.Map<? extends K, ? extends V> r1);

    long size();

    com.google.common.cache.CacheStats stats();
}
