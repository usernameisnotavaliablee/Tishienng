package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractListMultimap<K, V> extends com.google.common.collect.AbstractMapBasedMultimap<K, V> implements com.google.common.collect.ListMultimap<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected AbstractListMultimap(java.util.Map<K, java.util.Collection<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
            r1 = this;
            java.util.Map r0 = super.asMap()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Collection createCollection() {
            r1 = this;
            java.util.List r0 = r1.createCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    abstract java.util.List<V> createCollection();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* bridge */ /* synthetic */ java.util.Collection createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.List r0 = r1.createUnmodifiableEmptyCollection()
            return r0
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.List<V> createUnmodifiableEmptyCollection() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public java.util.List<V> get(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1) {
            r0 = this;
            java.util.Collection r1 = super.get(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            r0 = this;
            boolean r1 = super.put(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = r0.removeAll(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.List<V> removeAll(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = super.removeAll(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, java.lang.Iterable r2) {
            r0 = this;
            java.util.List r1 = r0.replaceValues(r1, r2)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.util.List<V> replaceValues(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r1, java.lang.Iterable<? extends V> r2) {
            r0 = this;
            java.util.Collection r1 = super.replaceValues(r1, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> java.util.Collection<E> unmodifiableCollectionSubclass(java.util.Collection<E> r1) {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> wrapCollection(K r2, java.util.Collection<V> r3) {
            r1 = this;
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.util.List r2 = r1.wrapList(r2, r3, r0)
            return r2
    }
}
