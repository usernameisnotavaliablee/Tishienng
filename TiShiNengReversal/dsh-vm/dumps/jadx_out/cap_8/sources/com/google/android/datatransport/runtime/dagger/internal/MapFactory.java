package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MapFactory<K, V> extends com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory<K, V, V> {
    private static final javax.inject.Provider<java.util.Map<java.lang.Object, java.lang.Object>> EMPTY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.MapFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<K, V> extends com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder<K, V, V> {
        private Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ Builder(int r1, com.google.android.datatransport.runtime.dagger.internal.MapFactory.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.datatransport.runtime.dagger.internal.MapFactory<K, V> build() {
                r3 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.MapFactory
                java.util.LinkedHashMap<K, javax.inject.Provider<V>> r1 = r3.map
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder put(java.lang.Object r1, javax.inject.Provider r2) {
                r0 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapFactory$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public com.google.android.datatransport.runtime.dagger.internal.MapFactory.Builder<K, V> put(K r1, javax.inject.Provider<V> r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder putAll(javax.inject.Provider r1) {
                r0 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapFactory$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public com.google.android.datatransport.runtime.dagger.internal.MapFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, V>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }
    }

    static {
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            com.google.android.datatransport.runtime.dagger.internal.Factory r0 = com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.create(r0)
            com.google.android.datatransport.runtime.dagger.internal.MapFactory.EMPTY = r0
            return
    }

    private MapFactory(java.util.Map<K, javax.inject.Provider<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ MapFactory(java.util.Map r1, com.google.android.datatransport.runtime.dagger.internal.MapFactory.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <K, V> com.google.android.datatransport.runtime.dagger.internal.MapFactory.Builder<K, V> builder(int r2) {
            com.google.android.datatransport.runtime.dagger.internal.MapFactory$Builder r0 = new com.google.android.datatransport.runtime.dagger.internal.MapFactory$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static <K, V> javax.inject.Provider<java.util.Map<K, V>> emptyMapProvider() {
            javax.inject.Provider<java.util.Map<java.lang.Object, java.lang.Object>> r0 = com.google.android.datatransport.runtime.dagger.internal.MapFactory.EMPTY
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.Map r0 = r1.m49get()
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.util.Map<K, V> m49get() {
            r4 = this;
            java.util.Map r0 = r4.contributingMap()
            int r0 = r0.size()
            java.util.LinkedHashMap r0 = com.google.android.datatransport.runtime.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(r0)
            java.util.Map r1 = r4.contributingMap()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            javax.inject.Provider r2 = (javax.inject.Provider) r2
            java.lang.Object r2 = r2.get()
            r0.put(r3, r2)
            goto L18
        L36:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
