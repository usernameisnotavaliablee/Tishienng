package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class AllEqualOrdering extends com.google.common.collect.Ordering<java.lang.Object> implements java.io.Serializable {
    static final com.google.common.collect.AllEqualOrdering INSTANCE = null;
    private static final long serialVersionUID = 0;

    static {
            com.google.common.collect.AllEqualOrdering r0 = new com.google.common.collect.AllEqualOrdering
            r0.<init>()
            com.google.common.collect.AllEqualOrdering.INSTANCE = r0
            return
    }

    AllEqualOrdering() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object readResolve() {
            r1 = this;
            com.google.common.collect.AllEqualOrdering r0 = com.google.common.collect.AllEqualOrdering.INSTANCE
            return r0
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public <E> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            return r1
    }

    @Override // com.google.common.collect.Ordering
    public <S> com.google.common.collect.Ordering<S> reverse() {
            r0 = this;
            return r0
    }

    @Override // com.google.common.collect.Ordering
    public <E> java.util.List<E> sortedCopy(java.lang.Iterable<E> r1) {
            r0 = this;
            java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.allEqual()"
            return r0
    }
}
