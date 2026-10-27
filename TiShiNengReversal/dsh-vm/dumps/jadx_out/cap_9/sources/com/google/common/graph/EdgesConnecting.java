package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class EdgesConnecting<E> extends java.util.AbstractSet<E> {
    private final java.util.Map<?, E> nodeToOutEdge;
    private final java.lang.Object targetNode;

    EdgesConnecting(java.util.Map<?, E> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.nodeToOutEdge = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.targetNode = r1
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private E getConnectingEdge() {
            r2 = this;
            java.util.Map<?, E> r0 = r2.nodeToOutEdge
            java.lang.Object r1 = r2.targetNode
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 == 0) goto Le
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 != 0) goto Lf
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            return r0
        Lf:
            com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.singletonIterator(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.lang.Object r0 = r1.getConnectingEdge()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }
}
