package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardDescendingSet extends com.google.common.collect.Sets.DescendingSet<E> {
        final /* synthetic */ com.google.common.collect.ForwardingNavigableSet this$0;

        public StandardDescendingSet(com.google.common.collect.ForwardingNavigableSet r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    protected ForwardingNavigableSet() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.NavigableSet
    public E ceiling(E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.ceiling(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.NavigableSet<E> delegate();

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Set delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.SortedSet delegate() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            return r0
    }

    @Override // java.util.NavigableSet
    public java.util.Iterator<E> descendingIterator() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.Iterator r0 = r0.descendingIterator()
            return r0
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> descendingSet() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.descendingSet()
            return r0
    }

    @Override // java.util.NavigableSet
    public E floor(E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.floor(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> headSet(E r2, boolean r3) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.headSet(r2, r3)
            return r2
    }

    @Override // java.util.NavigableSet
    public E higher(E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.higher(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public E lower(E r2) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r2 = r0.lower(r2)
            return r2
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r0 = r0.pollFirst()
            return r0
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.lang.Object r0 = r0.pollLast()
            return r0
    }

    protected E standardCeiling(E r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableSet r2 = r1.tailSet(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    protected E standardFirst() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    protected E standardFloor(E r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableSet r2 = r1.headSet(r2, r0)
            java.util.Iterator r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    protected java.util.SortedSet<E> standardHeadSet(E r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableSet r2 = r1.headSet(r2, r0)
            return r2
    }

    protected E standardHigher(E r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableSet r2 = r1.tailSet(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    protected E standardLast() {
            r1 = this;
            java.util.Iterator r0 = r1.descendingIterator()
            java.lang.Object r0 = r0.next()
            return r0
    }

    protected E standardLower(E r2) {
            r1 = this;
            r0 = 0
            java.util.NavigableSet r2 = r1.headSet(r2, r0)
            java.util.Iterator r2 = r2.descendingIterator()
            r0 = 0
            java.lang.Object r2 = com.google.common.collect.Iterators.getNext(r2, r0)
            return r2
    }

    protected E standardPollFirst() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            return r0
    }

    protected E standardPollLast() {
            r1 = this;
            java.util.Iterator r0 = r1.descendingIterator()
            java.lang.Object r0 = com.google.common.collect.Iterators.pollNext(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    protected java.util.NavigableSet<E> standardSubSet(E r1, boolean r2, E r3, boolean r4) {
            r0 = this;
            java.util.NavigableSet r1 = r0.tailSet(r1, r2)
            java.util.NavigableSet r1 = r1.headSet(r3, r4)
            return r1
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected java.util.SortedSet<E> standardSubSet(E r3, E r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
            return r3
    }

    protected java.util.SortedSet<E> standardTailSet(E r2) {
            r1 = this;
            r0 = 1
            java.util.NavigableSet r2 = r1.tailSet(r2, r0)
            return r2
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> subSet(E r2, boolean r3, E r4, boolean r5) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.subSet(r2, r3, r4, r5)
            return r2
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> tailSet(E r2, boolean r3) {
            r1 = this;
            java.util.NavigableSet r0 = r1.delegate()
            java.util.NavigableSet r2 = r0.tailSet(r2, r3)
            return r2
    }
}
