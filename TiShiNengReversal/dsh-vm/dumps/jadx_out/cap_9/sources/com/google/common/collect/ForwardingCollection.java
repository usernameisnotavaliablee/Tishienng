package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingCollection<E> extends com.google.common.collect.ForwardingObject implements java.util.Collection<E> {
    protected ForwardingCollection() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean add(E r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.add(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.addAll(r2)
            return r2
    }

    public void clear() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            r0.clear()
            return
    }

    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.contains(r2)
            return r2
    }

    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract java.util.Collection<E> delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.remove(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.Collection
    public int size() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    protected boolean standardAddAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = com.google.common.collect.Iterators.addAll(r0, r1)
            return r1
    }

    protected void standardClear() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    protected boolean standardContains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            boolean r2 = com.google.common.collect.Iterators.contains(r0, r2)
            return r2
    }

    protected boolean standardContainsAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Collections2.containsAllImpl(r0, r1)
            return r1
    }

    protected boolean standardIsEmpty() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            boolean r0 = r0.hasNext()
            r0 = r0 ^ 1
            return r0
    }

    protected boolean standardRemove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r2 = this;
            java.util.Iterator r0 = r2.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L4
            r0.remove()
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    protected boolean standardRemoveAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            boolean r2 = com.google.common.collect.Iterators.removeAll(r0, r2)
            return r2
    }

    protected boolean standardRetainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            boolean r2 = com.google.common.collect.Iterators.retainAll(r0, r2)
            return r2
    }

    protected java.lang.Object[] standardToArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    protected <T> T[] standardToArray(T[] r1) {
            r0 = this;
            java.lang.Object[] r1 = com.google.common.collect.ObjectArrays.toArrayImpl(r0, r1)
            return r1
    }

    protected java.lang.String standardToString() {
            r1 = this;
            java.lang.String r0 = com.google.common.collect.Collections2.toStringImpl(r1)
            return r0
    }

    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.Collection r0 = r1.delegate()
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
