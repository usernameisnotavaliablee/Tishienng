package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class MapProviderFactory<K, V> extends com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory<K, V, javax.inject.Provider<V>> implements com.google.android.datatransport.runtime.dagger.Lazy<java.util.Map<K, javax.inject.Provider<V>>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder<K, V> extends com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder<K, V, javax.inject.Provider<V>> {
        private Builder(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ Builder(int r1, com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory<K, V> build() {
                r3 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory r0 = new com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory
                java.util.LinkedHashMap<K, javax.inject.Provider<V>> r1 = r3.map
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder put(java.lang.Object r1, javax.inject.Provider r2) {
                r0 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory$Builder r1 = r0.put(r1, r2)
                return r1
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.Builder<K, V> put(K r1, javax.inject.Provider<V> r2) {
                r0 = this;
                super.put(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder putAll(javax.inject.Provider r1) {
                r0 = this;
                com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory$Builder r1 = r0.putAll(r1)
                return r1
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, javax.inject.Provider<V>>> r1) {
                r0 = this;
                super.putAll(r1)
                return r0
        }
    }

    private MapProviderFactory(java.util.Map<K, javax.inject.Provider<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* synthetic */ MapProviderFactory(java.util.Map r1, com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static <K, V> com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.Builder<K, V> builder(int r2) {
            com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory$Builder r0 = new com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.Lazy
    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.Map r0 = r1.get()
            return r0
    }

    @Override // com.google.android.datatransport.runtime.dagger.Lazy
    public java.util.Map<K, javax.inject.Provider<V>> get() {
            r1 = this;
            java.util.Map r0 = r1.contributingMap()
            return r0
    }
}
