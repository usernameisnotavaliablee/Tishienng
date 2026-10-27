package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractDirectedNetworkConnections<N, E> implements com.google.common.graph.NetworkConnections<N, E> {
    protected final java.util.Map<E, N> inEdgeMap;
    protected final java.util.Map<E, N> outEdgeMap;
    private int selfLoopCount;


    protected AbstractDirectedNetworkConnections(java.util.Map<E, N> r2, java.util.Map<E, N> r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map r0 = (java.util.Map) r0
            r1.inEdgeMap = r0
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Map r0 = (java.util.Map) r0
            r1.outEdgeMap = r0
            int r0 = com.google.common.graph.Graphs.checkNonNegative(r4)
            r1.selfLoopCount = r0
            int r2 = r2.size()
            if (r4 > r2) goto L27
            int r2 = r3.size()
            if (r4 > r2) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            com.google.common.base.Preconditions.checkState(r2)
            return
    }

    static /* synthetic */ int access$000(com.google.common.graph.AbstractDirectedNetworkConnections r0) {
            int r0 = r0.selfLoopCount
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E r2, N r3, boolean r4) {
            r1 = this;
            r0 = 1
            if (r4 == 0) goto Lb
            int r4 = r1.selfLoopCount
            int r4 = r4 + r0
            r1.selfLoopCount = r4
            com.google.common.graph.Graphs.checkPositive(r4)
        Lb:
            java.util.Map<E, N> r4 = r1.inEdgeMap
            java.lang.Object r2 = r4.put(r2, r3)
            if (r2 != 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.common.base.Preconditions.checkState(r0)
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E r2, N r3) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.outEdgeMap
            java.lang.Object r2 = r0.put(r2, r3)
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            com.google.common.base.Preconditions.checkState(r2)
            return
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E r2) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.outEdgeMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            return r2
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<N> adjacentNodes() {
            r2 = this;
            java.util.Set r0 = r2.predecessors()
            java.util.Set r1 = r2.successors()
            com.google.common.collect.Sets$SetView r0 = com.google.common.collect.Sets.union(r0, r1)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> inEdges() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.inEdgeMap
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> incidentEdges() {
            r1 = this;
            com.google.common.graph.AbstractDirectedNetworkConnections$1 r0 = new com.google.common.graph.AbstractDirectedNetworkConnections$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public java.util.Set<E> outEdges() {
            r1 = this;
            java.util.Map<E, N> r0 = r1.outEdgeMap
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            int r2 = r0.selfLoopCount
            int r2 = r2 + (-1)
            r0.selfLoopCount = r2
            com.google.common.graph.Graphs.checkNonNegative(r2)
        Lb:
            java.util.Map<E, N> r2 = r0.inEdgeMap
            java.lang.Object r1 = r2.remove(r1)
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            return r1
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E r2) {
            r1 = this;
            java.util.Map<E, N> r0 = r1.outEdgeMap
            java.lang.Object r2 = r0.remove(r2)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            return r2
    }
}
