package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class DescendingMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Comparator<? super E> comparator;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.NavigableSet<E> elementSet;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;


    DescendingMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.Comparator<? super E> r0 = r1.comparator
            if (r0 != 0) goto L16
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            java.util.Comparator r0 = r0.comparator()
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.from(r0)
            com.google.common.collect.Ordering r0 = r0.reverse()
            r1.comparator = r0
        L16:
            return r0
    }

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            r1 = this;
            com.google.common.collect.DescendingMultiset$1EntrySetImpl r0 = new com.google.common.collect.DescendingMultiset$1EntrySetImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected com.google.common.collect.Multiset<E> delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
            r1 = this;
            java.util.NavigableSet<E> r0 = r1.elementSet
            if (r0 != 0) goto Lb
            com.google.common.collect.SortedMultisets$NavigableElementSet r0 = new com.google.common.collect.SortedMultisets$NavigableElementSet
            r0.<init>(r1)
            r1.elementSet = r0
        Lb:
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.elementSet()
            return r0
    }

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            java.util.Set<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entrySet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.Multiset$Entry r0 = r0.lastEntry()
            return r0
    }

    abstract com.google.common.collect.SortedMultiset<E> forwardMultiset();

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.SortedMultiset r2 = r0.tailMultiset(r2, r3)
            com.google.common.collect.SortedMultiset r2 = r2.descendingMultiset()
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.Multiset$Entry r0 = r0.firstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.Multiset$Entry r0 = r0.pollLastEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.Multiset$Entry r0 = r0.pollFirstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(E r2, com.google.common.collect.BoundType r3, E r4, com.google.common.collect.BoundType r5) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.SortedMultiset r2 = r0.subMultiset(r4, r5, r2, r3)
            com.google.common.collect.SortedMultiset r2 = r2.descendingMultiset()
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.forwardMultiset()
            com.google.common.collect.SortedMultiset r2 = r0.headMultiset(r2, r3)
            com.google.common.collect.SortedMultiset r2 = r2.descendingMultiset()
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = r1.standardToArray()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r1) {
            r0 = this;
            java.lang.Object[] r1 = r0.standardToArray(r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingObject
    public java.lang.String toString() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
