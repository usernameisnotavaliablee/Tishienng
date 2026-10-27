package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class AbstractMapFactory<K, V, V2> implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.Map<K, V2>> {
    private final java.util.Map<K, javax.inject.Provider<V>> contributingMap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Builder<K, V, V2> {
        final java.util.LinkedHashMap<K, javax.inject.Provider<V>> map;

        Builder(int r1) {
                r0 = this;
                r0.<init>()
                java.util.LinkedHashMap r1 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(r1)
                r0.map = r1
                return
        }

        com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder<K, V, V2> put(K r3, javax.inject.Provider<V> r4) {
                r2 = this;
                java.util.LinkedHashMap<K, javax.inject.Provider<V>> r0 = r2.map
                java.lang.String r1 = "key"
                java.lang.Object r3 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r3, r1)
                java.lang.String r1 = "provider"
                java.lang.Object r4 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r4, r1)
                r0.put(r3, r4)
                return r2
        }

        com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder<K, V, V2> putAll(javax.inject.Provider<java.util.Map<K, V2>> r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.datatransport.runtime.dagger.internal.DelegateFactory
                if (r0 == 0) goto Lf
                com.google.android.datatransport.runtime.dagger.internal.DelegateFactory r2 = (com.google.android.datatransport.runtime.dagger.internal.DelegateFactory) r2
                javax.inject.Provider r2 = r2.getDelegate()
                com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory$Builder r2 = r1.putAll(r2)
                return r2
            Lf:
                com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory r2 = (com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory) r2
                java.util.LinkedHashMap<K, javax.inject.Provider<V>> r0 = r1.map
                java.util.Map r2 = com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.access$000(r2)
                r0.putAll(r2)
                return r1
        }
    }

    AbstractMapFactory(java.util.Map<K, javax.inject.Provider<V>> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.contributingMap = r1
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory r0) {
            java.util.Map<K, javax.inject.Provider<V>> r0 = r0.contributingMap
            return r0
    }

    final java.util.Map<K, javax.inject.Provider<V>> contributingMap() {
            r1 = this;
            java.util.Map<K, javax.inject.Provider<V>> r0 = r1.contributingMap
            return r0
    }
}
