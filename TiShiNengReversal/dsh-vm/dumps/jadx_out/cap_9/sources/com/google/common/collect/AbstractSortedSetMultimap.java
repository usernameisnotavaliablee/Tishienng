package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractSortedSetMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> implements com.google.common.collect.SortedSetMultimap<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    protected AbstractSortedSetMultimap(java.util.Map<K, java.util.Collection<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Collection createCollection() {
            r1 = this;
            java.util.SortedSet r0 = r1.createCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Set createCollection() {
            r1 = this;
            java.util.SortedSet r0 = r1.createCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    abstract java.util.SortedSet<V> createCollection();

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Collection createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.SortedSet r0 = r1.createUnmodifiableEmptyCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Set createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.SortedSet r0 = r1.createUnmodifiableEmptyCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    java.util.SortedSet<V> createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.SortedSet r0 = r1.createCollection()
            java.util.SortedSet r0 = r1.unmodifiableCollectionSubclass(r0)
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public java.util.SortedSet<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1) {
            r0 = this;
            java.util.Set r1 = super.get(r1)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.SortedSet<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.removeAll(r1)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.SortedSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Set replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.SortedSet r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.SortedSet<V> replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Set r1 = super.replaceValues(r1, r2)
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Collection unmodifiableCollectionSubclass(java.util.Collection r1) {
            r0 = this;
            java.util.SortedSet r1 = r0.unmodifiableCollectionSubclass(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    <E> java.util.SortedSet<E> unmodifiableCollectionSubclass(java.util.Collection<E> r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.NavigableSet
            if (r0 == 0) goto Lb
            java.util.NavigableSet r2 = (java.util.NavigableSet) r2
            java.util.NavigableSet r2 = com.google.common.collect.Sets.unmodifiableNavigableSet(r2)
            return r2
        Lb:
            java.util.SortedSet r2 = (java.util.SortedSet) r2
            java.util.SortedSet r2 = java.util.Collections.unmodifiableSortedSet(r2)
            return r2
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(K r3, java.util.Collection<V> r4) {
            r2 = this;
            boolean r0 = r4 instanceof java.util.NavigableSet
            r1 = 0
            if (r0 == 0) goto Ld
            com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedNavigableSet
            java.util.NavigableSet r4 = (java.util.NavigableSet) r4
            r0.<init>(r2, r3, r4, r1)
            return r0
        Ld:
            com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet r0 = new com.google.common.collect.AbstractMapBasedMultimap$WrappedSortedSet
            java.util.SortedSet r4 = (java.util.SortedSet) r4
            r0.<init>(r2, r3, r4, r1)
            return r0
    }
}
