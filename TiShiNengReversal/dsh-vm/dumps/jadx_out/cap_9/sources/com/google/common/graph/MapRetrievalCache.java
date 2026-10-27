package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class MapRetrievalCache<K, V> extends com.google.common.graph.MapIteratorCache<K, V> {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry1;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> cacheEntry2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CacheEntry<K, V> {
        final K key;
        final V value;

        CacheEntry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }
    }

    MapRetrievalCache(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void addToCache(com.google.common.graph.MapRetrievalCache.CacheEntry<K, V> r2) {
            r1 = this;
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r1.cacheEntry1
            r1.cacheEntry2 = r0
            r1.cacheEntry1 = r2
            return
    }

    private void addToCache(K r2, V r3) {
            r1 = this;
            com.google.common.graph.MapRetrievalCache$CacheEntry r0 = new com.google.common.graph.MapRetrievalCache$CacheEntry
            r0.<init>(r2, r3)
            r1.addToCache(r0)
            return
    }

    @Override // com.google.common.graph.MapIteratorCache
    protected void clearCache() {
            r1 = this;
            super.clearCache()
            r0 = 0
            r1.cacheEntry1 = r0
            r1.cacheEntry2 = r0
            return
    }

    @Override // com.google.common.graph.MapIteratorCache
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r0 = r1.getWithoutCaching(r2)
            if (r0 == 0) goto L10
            r1.addToCache(r2, r0)
        L10:
            return r0
    }

    @Override // com.google.common.graph.MapIteratorCache
    protected V getIfCached(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = super.getIfCached(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r2.cacheEntry1
            if (r0 == 0) goto L12
            K r1 = r0.key
            if (r1 != r3) goto L12
            V r3 = r0.value
            return r3
        L12:
            com.google.common.graph.MapRetrievalCache$CacheEntry<K, V> r0 = r2.cacheEntry2
            if (r0 == 0) goto L20
            K r1 = r0.key
            if (r1 != r3) goto L20
            r2.addToCache(r0)
            V r3 = r0.value
            return r3
        L20:
            r3 = 0
            return r3
    }
}
