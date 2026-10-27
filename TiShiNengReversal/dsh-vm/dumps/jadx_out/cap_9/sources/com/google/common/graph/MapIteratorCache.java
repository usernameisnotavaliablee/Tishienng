package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class MapIteratorCache<K, V> {
    private final java.util.Map<K, V> backingMap;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private transient java.util.Map.Entry<K, V> entrySetCache;


    MapIteratorCache(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.backingMap = r1
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.common.graph.MapIteratorCache r0) {
            java.util.Map<K, V> r0 = r0.backingMap
            return r0
    }

    static /* synthetic */ java.util.Map.Entry access$102(com.google.common.graph.MapIteratorCache r0, java.util.Map.Entry r1) {
            r0.entrySetCache = r1
            return r1
    }

    public void clear() {
            r1 = this;
            r1.clearCache()
            java.util.Map<K, V> r0 = r1.backingMap
            r0.clear()
            return
    }

    protected void clearCache() {
            r1 = this;
            r0 = 0
            r1.entrySetCache = r0
            return
    }

    public final boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 != 0) goto L11
            java.util.Map<K, V> r0 = r1.backingMap
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getIfCached(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r2 = r1.getWithoutCaching(r2)
            return r2
    }

    protected V getIfCached(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry<K, V> r0 = r2.entrySetCache
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r0.getKey()
            if (r1 != r3) goto Lf
            java.lang.Object r3 = r0.getValue()
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public final V getWithoutCaching(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r1.clearCache()
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            r1.clearCache()
            java.util.Map<K, V> r0 = r1.backingMap
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    public final java.util.Set<K> unmodifiableKeySet() {
            r1 = this;
            com.google.common.graph.MapIteratorCache$1 r0 = new com.google.common.graph.MapIteratorCache$1
            r0.<init>(r1)
            return r0
    }
}
