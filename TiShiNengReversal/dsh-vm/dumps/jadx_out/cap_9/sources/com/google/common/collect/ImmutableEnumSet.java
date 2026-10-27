package com.google.common.collect;

import java.lang.Enum;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ImmutableEnumSet<E extends java.lang.Enum<E>> extends com.google.common.collect.ImmutableSet<E> {
    private final transient java.util.EnumSet<E> delegate;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient int hashCode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.ImmutableEnumSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class EnumSerializedForm<E extends java.lang.Enum<E>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumSet<E> delegate;

        EnumSerializedForm(java.util.EnumSet<E> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        java.lang.Object readResolve() {
                r3 = this;
                com.google.common.collect.ImmutableEnumSet r0 = new com.google.common.collect.ImmutableEnumSet
                java.util.EnumSet<E extends java.lang.Enum<E>> r1 = r3.delegate
                java.util.EnumSet r1 = r1.clone()
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private ImmutableEnumSet(java.util.EnumSet<E> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    /* synthetic */ ImmutableEnumSet(java.util.EnumSet r1, com.google.common.collect.ImmutableEnumSet.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static com.google.common.collect.ImmutableSet asImmutable(java.util.EnumSet r2) {
            int r0 = r2.size()
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 == r1) goto Lf
            com.google.common.collect.ImmutableEnumSet r0 = new com.google.common.collect.ImmutableEnumSet
            r0.<init>(r2)
            return r0
        Lf:
            java.lang.Object r2 = com.google.common.collect.Iterables.getOnlyElement(r2)
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of(r2)
            return r2
        L18:
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of()
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableEnumSet
            if (r0 == 0) goto L8
            com.google.common.collect.ImmutableEnumSet r2 = (com.google.common.collect.ImmutableEnumSet) r2
            java.util.EnumSet<E extends java.lang.Enum<E>> r2 = r2.delegate
        L8:
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableEnumSet
            if (r0 == 0) goto Lc
            com.google.common.collect.ImmutableEnumSet r2 = (com.google.common.collect.ImmutableEnumSet) r2
            java.util.EnumSet<E extends java.lang.Enum<E>> r2 = r2.delegate
        Lc:
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            if (r0 != 0) goto Lc
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            int r0 = r0.hashCode()
            r1.hashCode = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean isHashCodeFast() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r1 = this;
            java.util.EnumSet<E extends java.lang.Enum<E>> r0 = r1.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableEnumSet$EnumSerializedForm r0 = new com.google.common.collect.ImmutableEnumSet$EnumSerializedForm
            java.util.EnumSet<E extends java.lang.Enum<E>> r1 = r2.delegate
            r0.<init>(r1)
            return r0
    }
}
