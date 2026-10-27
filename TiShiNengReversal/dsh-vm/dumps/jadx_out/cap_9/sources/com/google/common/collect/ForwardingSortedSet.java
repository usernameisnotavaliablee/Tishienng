package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingSortedSet<E> extends com.google.common.collect.ForwardingSet<E> implements java.util.SortedSet<E> {
    protected ForwardingSortedSet() {
            r0 = this;
            r0.<init>()
            return
    }

    private int unsafeCompare(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r1 = this;
            java.util.Comparator r0 = r1.comparator()
            if (r0 != 0) goto Ld
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r3)
            return r2
        Ld:
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.SortedSet
    public java.util.Comparator<? super E> comparator() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.Comparator r0 = r0.comparator()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Set delegate() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.SortedSet<E> delegate();

    @Override // java.util.SortedSet
    public E first() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.lang.Object r0 = r0.first()
            return r0
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> headSet(E r2) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.headSet(r2)
            return r2
    }

    @Override // java.util.SortedSet
    public E last() {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.lang.Object r0 = r0.last()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    @com.google.common.annotations.Beta
    protected boolean standardContains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            r0 = 0
            java.util.SortedSet r1 = r2.tailSet(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.first()     // Catch: java.lang.Throwable -> L11
            int r3 = r2.unsafeCompare(r1, r3)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L11
            r3 = 1
            return r3
        L11:
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection
    @com.google.common.annotations.Beta
    protected boolean standardRemove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.util.SortedSet r1 = r3.tailSet(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.unsafeCompare(r2, r4)     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L1e
            r1.remove()     // Catch: java.lang.Throwable -> L1e
            r4 = 1
            return r4
        L1e:
            return r0
    }

    @com.google.common.annotations.Beta
    protected java.util.SortedSet<E> standardSubSet(E r1, E r2) {
            r0 = this;
            java.util.SortedSet r1 = r0.tailSet(r1)
            java.util.SortedSet r1 = r1.headSet(r2)
            return r1
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> subSet(E r2, E r3) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.subSet(r2, r3)
            return r2
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> tailSet(E r2) {
            r1 = this;
            java.util.SortedSet r0 = r1.delegate()
            java.util.SortedSet r2 = r0.tailSet(r2)
            return r2
    }
}
