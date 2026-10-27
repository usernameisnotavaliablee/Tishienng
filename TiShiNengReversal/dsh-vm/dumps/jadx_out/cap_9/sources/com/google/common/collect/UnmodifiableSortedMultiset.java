package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class UnmodifiableSortedMultiset<E> extends com.google.common.collect.Multisets.UnmodifiableMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    private static final long serialVersionUID = 0;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.google.common.collect.UnmodifiableSortedMultiset<E> descendingMultiset;

    UnmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    java.util.NavigableSet<E> createElementSet() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.elementSet()
            java.util.NavigableSet r0 = com.google.common.collect.Sets.unmodifiableNavigableSet(r0)
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    /* bridge */ /* synthetic */ java.util.Set createElementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.createElementSet()
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ com.google.common.collect.Multiset delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected com.google.common.collect.SortedMultiset<E> delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = super.delegate()
            com.google.common.collect.SortedMultiset r0 = (com.google.common.collect.SortedMultiset) r0
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
            r2 = this;
            com.google.common.collect.UnmodifiableSortedMultiset<E> r0 = r2.descendingMultiset
            if (r0 != 0) goto L15
            com.google.common.collect.UnmodifiableSortedMultiset r0 = new com.google.common.collect.UnmodifiableSortedMultiset
            com.google.common.collect.SortedMultiset r1 = r2.delegate()
            com.google.common.collect.SortedMultiset r1 = r1.descendingMultiset()
            r0.<init>(r1)
            r0.descendingMultiset = r2
            r2.descendingMultiset = r0
        L15:
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
            r1 = this;
            java.util.Set r0 = super.elementSet()
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.headMultiset(r2, r3)
            com.google.common.collect.SortedMultiset r2 = com.google.common.collect.Multisets.unmodifiableSortedMultiset(r2)
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.lastEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(E r2, com.google.common.collect.BoundType r3, E r4, com.google.common.collect.BoundType r5) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.subMultiset(r2, r3, r4, r5)
            com.google.common.collect.SortedMultiset r2 = com.google.common.collect.Multisets.unmodifiableSortedMultiset(r2)
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.tailMultiset(r2, r3)
            com.google.common.collect.SortedMultiset r2 = com.google.common.collect.Multisets.unmodifiableSortedMultiset(r2)
            return r2
    }
}
