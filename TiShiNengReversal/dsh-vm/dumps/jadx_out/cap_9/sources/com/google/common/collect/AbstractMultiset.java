package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractMultiset<E> extends java.util.AbstractCollection<E> implements com.google.common.collect.Multiset<E> {

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<E> elementSet;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class ElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        final /* synthetic */ com.google.common.collect.AbstractMultiset this$0;

        ElementSet(com.google.common.collect.AbstractMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                java.util.Iterator r0 = r0.elementIterator()
                return r0
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class EntrySet extends com.google.common.collect.Multisets.EntrySet<E> {
        final /* synthetic */ com.google.common.collect.AbstractMultiset this$0;

        EntrySet(com.google.common.collect.AbstractMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> iterator() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                java.util.Iterator r0 = r0.entryIterator()
                return r0
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        com.google.common.collect.Multiset<E> multiset() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.AbstractMultiset r0 = r1.this$0
                int r0 = r0.distinctElements()
                return r0
        }
    }

    AbstractMultiset() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int add(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean add(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r2) {
            r1 = this;
            r0 = 1
            r1.add(r2, r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.addAllImpl(r0, r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            int r1 = r0.count(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    java.util.Set<E> createElementSet() {
            r1 = this;
            com.google.common.collect.AbstractMultiset$ElementSet r0 = new com.google.common.collect.AbstractMultiset$ElementSet
            r0.<init>(r1)
            return r0
    }

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            r1 = this;
            com.google.common.collect.AbstractMultiset$EntrySet r0 = new com.google.common.collect.AbstractMultiset$EntrySet
            r0.<init>(r1)
            return r0
    }

    abstract int distinctElements();

    abstract java.util.Iterator<E> elementIterator();

    @Override // com.google.common.collect.Multiset
    public java.util.Set<E> elementSet() {
            r1 = this;
            java.util.Set<E> r0 = r1.elementSet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createElementSet()
            r1.elementSet = r0
        La:
            return r0
    }

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    @Override // com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            r1 = this;
            java.util.Set<com.google.common.collect.Multiset$Entry<E>> r0 = r1.entrySet
            if (r0 != 0) goto La
            java.util.Set r0 = r1.createEntrySet()
            r1.entrySet = r0
        La:
            return r0
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.equalsImpl(r0, r1)
            return r1
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean remove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            r0 = 1
            int r2 = r1.remove(r2, r0)
            if (r2 <= 0) goto L8
            return r0
        L8:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.removeAllImpl(r0, r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.retainAllImpl(r0, r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public int setCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, int r2) {
            r0 = this;
            int r1 = com.google.common.collect.Multisets.setCountImpl(r0, r1, r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean setCount(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, int r2, int r3) {
            r0 = this;
            boolean r1 = com.google.common.collect.Multisets.setCountImpl(r0, r1, r2, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final java.lang.String toString() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
