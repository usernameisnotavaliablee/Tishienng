package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FilteredKeyListMultimap<K, V> extends com.google.common.collect.FilteredKeyMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    FilteredKeyListMultimap(com.google.common.collect.ListMultimap<K, V> r1, com.google.common.base.Predicate<? super K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.List<V> get(K r1) {
            r0 = this;
            java.util.Collection r1 = super.get(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.Multimap
    public java.util.List<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = super.removeAll(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.List r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.List<V> replaceValues(K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Collection r1 = super.replaceValues(r1, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public com.google.common.collect.ListMultimap<K, V> unfiltered() {
            r1 = this;
            com.google.common.collect.Multimap r0 = super.unfiltered()
            com.google.common.collect.ListMultimap r0 = (com.google.common.collect.ListMultimap) r0
            return r0
    }

    @Override // com.google.common.collect.FilteredKeyMultimap, com.google.common.collect.FilteredMultimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multimap unfiltered() {
            r1 = this;
            com.google.common.collect.ListMultimap r0 = r1.unfiltered()
            return r0
    }
}
