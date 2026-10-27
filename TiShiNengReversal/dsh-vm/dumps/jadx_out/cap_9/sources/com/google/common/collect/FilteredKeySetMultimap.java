package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FilteredKeySetMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.FilteredSetMultimap<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class EntrySet extends com.google.common.collect.FilteredKeyMultimap<K, V>.Entries implements java.util.Set<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.common.collect.FilteredKeySetMultimap this$0;

        EntrySet(com.google.common.collect.FilteredKeySetMultimap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Sets.equalsImpl(r0, r1)
                return r1
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                int r0 = com.google.common.collect.Sets.hashCodeImpl(r1)
                return r0
        }
    }

    FilteredKeySetMultimap(com.google.common.collect.SetMultimap<K, V> r1, com.google.common.base.Predicate<? super K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    /* bridge */ /* synthetic */ java.util.Collection createEntries() {
            r1 = this;
            java.util.Set r0 = r1.createEntries()
            return r0
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.AbstractMultimap
    java.util.Set<java.util.Map.Entry<K, V>> createEntries() {
            r1 = this;
            com.google.common.collect.FilteredKeySetMultimap$EntrySet r0 = new com.google.common.collect.FilteredKeySetMultimap$EntrySet
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection entries() {
            r1 = this;
            java.util.Set r0 = r1.entries()
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
            r1 = this;
            java.util.Collection r0 = super.entries()
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.Set<V> get(K r1) {
            r0 = this;
            java.util.Collection r1 = super.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.Set<V> removeAll(java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = super.removeAll(r1)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.Set r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Collection r1 = super.replaceValues(r1, r2)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multimap unfiltered() {
            r1 = this;
            com.google.common.collect.SetMultimap r0 = r1.unfiltered()
            return r0
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.SetMultimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap<K, V> r0 = r1.unfiltered
            com.google.common.collect.SetMultimap r0 = (com.google.common.collect.SetMultimap) r0
            return r0
    }
}
