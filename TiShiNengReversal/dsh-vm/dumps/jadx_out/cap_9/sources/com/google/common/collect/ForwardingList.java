package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingList<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.List<E> {
    protected ForwardingList() {
            r0 = this;
            r0.<init>()
            return
    }

    public void add(int r2, E r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            r0.add(r2, r3)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(int r2, java.util.Collection<? extends E> r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            boolean r2 = r0.addAll(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.util.Collection delegate() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract java.util.List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.List r0 = r1.delegate()
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

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E remove(int r2) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public E set(int r2, E r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    protected boolean standardAdd(E r2) {
            r1 = this;
            int r0 = r1.size()
            r1.add(r0, r2)
            r2 = 1
            return r2
    }

    protected boolean standardAddAll(int r1, java.lang.Iterable<? extends E> r2) {
            r0 = this;
            boolean r1 = com.google.common.collect.Lists.addAllImpl(r0, r1, r2)
            return r1
    }

    @com.google.common.annotations.Beta
    protected boolean standardEquals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Lists.equalsImpl(r0, r1)
            return r1
    }

    @com.google.common.annotations.Beta
    protected int standardHashCode() {
            r1 = this;
            int r0 = com.google.common.collect.Lists.hashCodeImpl(r1)
            return r0
    }

    protected int standardIndexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            int r1 = com.google.common.collect.Lists.indexOfImpl(r0, r1)
            return r1
    }

    protected java.util.Iterator<E> standardIterator() {
            r1 = this;
            java.util.ListIterator r0 = r1.listIterator()
            return r0
    }

    protected int standardLastIndexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            int r1 = com.google.common.collect.Lists.lastIndexOfImpl(r0, r1)
            return r1
    }

    protected java.util.ListIterator<E> standardListIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    protected java.util.ListIterator<E> standardListIterator(int r1) {
            r0 = this;
            java.util.ListIterator r1 = com.google.common.collect.Lists.listIteratorImpl(r0, r1)
            return r1
    }

    @com.google.common.annotations.Beta
    protected java.util.List<E> standardSubList(int r1, int r2) {
            r0 = this;
            java.util.List r1 = com.google.common.collect.Lists.subListImpl(r0, r1, r2)
            return r1
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            java.util.List r0 = r1.delegate()
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }
}
