package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class UndirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private final java.util.Map<N, V> adjacentNodeValues;

    private UndirectedGraphConnections(java.util.Map<N, V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Map r1 = (java.util.Map) r1
            r0.adjacentNodeValues = r1
            return
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> of() {
            com.google.common.graph.UndirectedGraphConnections r0 = new com.google.common.graph.UndirectedGraphConnections
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    static <N, V> com.google.common.graph.UndirectedGraphConnections<N, V> ofImmutable(java.util.Map<N, V> r1) {
            com.google.common.graph.UndirectedGraphConnections r0 = new com.google.common.graph.UndirectedGraphConnections
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N r1, V r2) {
            r0 = this;
            r0.addSuccessor(r1, r2)
            return
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N r2, V r3) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N r1) {
            r0 = this;
            r0.removeSuccessor(r1)
            return
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N r2) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
            r1 = this;
            java.util.Set r0 = r1.adjacentNodes()
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N r2) {
            r1 = this;
            java.util.Map<N, V> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
