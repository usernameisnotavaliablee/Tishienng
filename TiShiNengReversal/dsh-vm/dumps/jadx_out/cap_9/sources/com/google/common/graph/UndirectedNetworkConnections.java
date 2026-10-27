package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class UndirectedNetworkConnections<N, E> extends com.google.common.graph.AbstractUndirectedNetworkConnections<N, E> {
    protected UndirectedNetworkConnections(java.util.Map<E, N> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> of() {
            com.google.common.graph.UndirectedNetworkConnections r0 = new com.google.common.graph.UndirectedNetworkConnections
            r1 = 2
            com.google.common.collect.HashBiMap r1 = com.google.common.collect.HashBiMap.create(r1)
            r0.<init>(r1)
            return r0
    }

    static <N, E> com.google.common.graph.UndirectedNetworkConnections<N, E> ofImmutable(java.util.Map<E, N> r1) {
            com.google.common.graph.UndirectedNetworkConnections r0 = new com.google.common.graph.UndirectedNetworkConnections
            com.google.common.collect.ImmutableBiMap r1 = com.google.common.collect.ImmutableBiMap.copyOf(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> adjacentNodes() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.incidentEdgeMap
            com.google.common.collect.BiMap r0 = (com.google.common.collect.BiMap) r0
            java.util.Set r0 = r0.values()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> edgesConnecting(N r3) {
            r2 = this;
            com.google.common.graph.EdgesConnecting r0 = new com.google.common.graph.EdgesConnecting
            java.util.Map<E, N> r1 = r2.incidentEdgeMap
            com.google.common.collect.BiMap r1 = (com.google.common.collect.BiMap) r1
            com.google.common.collect.BiMap r1 = r1.inverse()
            r0.<init>(r1, r3)
            return r0
    }
}
