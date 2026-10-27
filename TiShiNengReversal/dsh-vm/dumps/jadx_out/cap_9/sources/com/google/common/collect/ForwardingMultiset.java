package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingMultiset<E> extends com.google.common.collect.ForwardingCollection<E> implements com.google.common.collect.Multiset<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        final /* synthetic */ com.google.common.collect.ForwardingMultiset this$0;

        public StandardElementSet(com.google.common.collect.ForwardingMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                com.google.common.collect.Multiset r0 = r1.multiset()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Iterator r0 = com.google.common.collect.Multisets.elementIterator(r0)
                return r0
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.ForwardingMultiset r0 = r1.this$0
                return r0
        }
    }

    protected ForwardingMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(E r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.add(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    public int count(java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.count(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract com.google.common.collect.Multiset<E> delegate();

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            return r0
    }

    public java.util.Set<E> elementSet() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            java.util.Set r0 = r0.elementSet()
            return r0
    }

    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            com.google.common.collect.Multiset r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(java.lang.Object r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.remove(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(E r2, int r3) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            int r2 = r0.setCount(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(E r2, int r3, int r4) {
            r1 = this;
            com.google.common.collect.Multiset r0 = r1.delegate()
            boolean r2 = r0.setCount(r2, r3, r4)
            return r2
    }

    protected boolean standardAdd(E r2) {
            r1 = this;
            r0 = 1
            r1.add(r2, r0)
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    @com.google.common.annotations.Beta
    protected boolean standardAddAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.addAllImpl(r0, r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected void standardClear() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            int r1 = r0.count(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @com.google.common.annotations.Beta
    protected int standardCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
            java.lang.Object r2 = r1.getElement()
            boolean r2 = com.google.common.base.Objects.equal(r2, r4)
            if (r2 == 0) goto L8
            int r4 = r1.getCount()
            return r4
        L23:
            r4 = 0
            return r4
    }

    protected boolean standardEquals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.equalsImpl(r0, r1)
            return r1
    }

    protected int standardHashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    protected java.util.Iterator<E> standardIterator() {
            r1 = this;
            java.util.Iterator r0 = com.google.common.collect.Multisets.iteratorImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.remove(r2, r0)
            if (r2 <= 0) goto L8
            return r0
        L8:
            r2 = 0
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.removeAllImpl(r0, r1)
            return r1
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRetainAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.retainAllImpl(r0, r1)
            return r1
    }

    protected int standardSetCount(E r1, int r2) {
            r0 = this;
            int r1 = com.google.common.collect.Multisets.setCountImpl(r0, r1, r2)
            return r1
    }

    protected boolean standardSetCount(E r1, int r2, int r3) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.setCountImpl(r0, r1, r2, r3)
            return r1
    }

    protected int standardSize() {
            r1 = this;
            int r0 = com.google.common.collect.Multisets.linearTimeSizeImpl(r1)
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected java.lang.String standardToString() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
