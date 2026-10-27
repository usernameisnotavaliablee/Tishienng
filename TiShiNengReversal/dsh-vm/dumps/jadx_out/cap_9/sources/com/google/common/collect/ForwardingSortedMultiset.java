package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSortedMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected abstract class StandardDescendingMultiset extends com.google.common.collect.DescendingMultiset<E> {
        final /* synthetic */ com.google.common.collect.ForwardingSortedMultiset this$0;

        public StandardDescendingMultiset(com.google.common.collect.ForwardingSortedMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.DescendingMultiset
        com.google.common.collect.SortedMultiset<E> forwardMultiset() {
                r1 = this;
                com.google.common.collect.ForwardingSortedMultiset r0 = r1.this$0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class StandardElementSet extends com.google.common.collect.SortedMultisets.NavigableElementSet<E> {
        final /* synthetic */ com.google.common.collect.ForwardingSortedMultiset this$0;

        public StandardElementSet(com.google.common.collect.ForwardingSortedMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    protected ForwardingSortedMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ com.google.common.collect.Multiset delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.collect.SortedMultiset<E> delegate();

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r0 = r0.descendingMultiset()
            return r0
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            java.util.NavigableSet r0 = r0.elementSet()
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
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.pollFirstEntry()
            return r0
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.Multiset$Entry r0 = r0.pollLastEntry()
            return r0
    }

    protected com.google.common.collect.Multiset.Entry<E> standardFirstEntry() {
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.lang.Object r0 = r0.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            java.lang.Object r1 = r0.getElement()
            int r0 = r0.getCount()
            com.google.common.collect.Multiset$Entry r0 = com.google.common.collect.Multisets.immutableEntry(r1, r0)
            return r0
    }

    protected com.google.common.collect.Multiset.Entry<E> standardLastEntry() {
            r2 = this;
            com.google.common.collect.SortedMultiset r0 = r2.descendingMultiset()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L14
            r0 = 0
            return r0
        L14:
            java.lang.Object r0 = r0.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            java.lang.Object r1 = r0.getElement()
            int r0 = r0.getCount()
            com.google.common.collect.Multiset$Entry r0 = com.google.common.collect.Multisets.immutableEntry(r1, r0)
            return r0
    }

    protected com.google.common.collect.Multiset.Entry<E> standardPollFirstEntry() {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            int r1 = r1.getCount()
            com.google.common.collect.Multiset$Entry r1 = com.google.common.collect.Multisets.immutableEntry(r2, r1)
            r0.remove()
            return r1
    }

    protected com.google.common.collect.Multiset.Entry<E> standardPollLastEntry() {
            r3 = this;
            com.google.common.collect.SortedMultiset r0 = r3.descendingMultiset()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L14
            r0 = 0
            return r0
        L14:
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            int r1 = r1.getCount()
            com.google.common.collect.Multiset$Entry r1 = com.google.common.collect.Multisets.immutableEntry(r2, r1)
            r0.remove()
            return r1
    }

    protected com.google.common.collect.SortedMultiset<E> standardSubMultiset(E r1, com.google.common.collect.BoundType r2, E r3, com.google.common.collect.BoundType r4) {
            r0 = this;
            com.google.common.collect.SortedMultiset r1 = r0.tailMultiset(r1, r2)
            com.google.common.collect.SortedMultiset r1 = r1.headMultiset(r3, r4)
            return r1
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(E r2, com.google.common.collect.BoundType r3, E r4, com.google.common.collect.BoundType r5) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.subMultiset(r2, r3, r4, r5)
            return r2
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(E r2, com.google.common.collect.BoundType r3) {
            r1 = this;
            com.google.common.collect.SortedMultiset r0 = r1.delegate()
            com.google.common.collect.SortedMultiset r2 = r0.tailMultiset(r2, r3)
            return r2
    }
}
