package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class FilteredMultimapValues<K, V> extends java.util.AbstractCollection<V> {

    @com.google.j2objc.annotations.Weak
    private final com.google.common.collect.FilteredMultimap<K, V> multimap;

    FilteredMultimapValues(com.google.common.collect.FilteredMultimap<K, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.FilteredMultimap r1 = (com.google.common.collect.FilteredMultimap) r1
            r0.multimap = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<V> iterator() {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            java.util.Collection r0 = r0.entries()
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r0 = com.google.common.collect.Maps.valueIterator(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r4.multimap
            com.google.common.base.Predicate r0 = r0.entryPredicate()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r4.multimap
            com.google.common.collect.Multimap r1 = r1.unfiltered()
            java.util.Collection r1 = r1.entries()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r3 = r0.apply(r2)
            if (r3 == 0) goto L14
            java.lang.Object r2 = r2.getValue()
            boolean r2 = com.google.common.base.Objects.equal(r2, r5)
            if (r2 == 0) goto L14
            r1.remove()
            r5 = 1
            return r5
        L35:
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r2.multimap
            com.google.common.collect.Multimap r0 = r0.unfiltered()
            java.util.Collection r0 = r0.entries()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r2.multimap
            com.google.common.base.Predicate r1 = r1.entryPredicate()
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.in(r3)
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.valuePredicateOnEntries(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.and(r1, r3)
            boolean r3 = com.google.common.collect.Iterables.removeIf(r0, r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r3) {
            r2 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r2.multimap
            com.google.common.collect.Multimap r0 = r0.unfiltered()
            java.util.Collection r0 = r0.entries()
            com.google.common.collect.FilteredMultimap<K, V> r1 = r2.multimap
            com.google.common.base.Predicate r1 = r1.entryPredicate()
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.in(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.not(r3)
            com.google.common.base.Predicate r3 = com.google.common.collect.Maps.valuePredicateOnEntries(r3)
            com.google.common.base.Predicate r3 = com.google.common.base.Predicates.and(r1, r3)
            boolean r3 = com.google.common.collect.Iterables.removeIf(r0, r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            com.google.common.collect.FilteredMultimap<K, V> r0 = r1.multimap
            int r0 = r0.size()
            return r0
    }
}
