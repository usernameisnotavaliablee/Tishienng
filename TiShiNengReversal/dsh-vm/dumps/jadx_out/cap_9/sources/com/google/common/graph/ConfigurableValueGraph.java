package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ConfigurableValueGraph<N, V> extends com.google.common.graph.AbstractValueGraph<N, V> {
    private final boolean allowsSelfLoops;
    protected long edgeCount;
    private final boolean isDirected;
    protected final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    ConfigurableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r4) {
            r3 = this;
            com.google.common.graph.ElementOrder<N> r0 = r4.nodeOrder
            com.google.common.base.Optional<java.lang.Integer> r1 = r4.expectedNodeCount
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.or(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map r0 = r0.createMap(r1)
            r1 = 0
            r3.<init>(r4, r0, r1)
            return
    }

    ConfigurableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r2, java.util.Map<N, com.google.common.graph.GraphConnections<N, V>> r3, long r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.directed
            r1.isDirected = r0
            boolean r0 = r2.allowsSelfLoops
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder<N> r2 = r2.nodeOrder
            com.google.common.graph.ElementOrder r2 = r2.cast()
            r1.nodeOrder = r2
            boolean r2 = r3 instanceof java.util.TreeMap
            if (r2 == 0) goto L1d
            com.google.common.graph.MapRetrievalCache r2 = new com.google.common.graph.MapRetrievalCache
            r2.<init>(r3)
            goto L22
        L1d:
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r3)
        L22:
            r1.nodeConnections = r2
            long r2 = com.google.common.graph.Graphs.checkNonNegative(r4)
            r1.edgeCount = r2
            return
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> adjacentNodes(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.adjacentNodes()
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = r1.allowsSelfLoops
            return r0
    }

    protected final com.google.common.graph.GraphConnections<N, V> checkedConnections(N r4) {
            r3 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r3.nodeConnections
            java.lang.Object r0 = r0.get(r4)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Node "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an element of this graph."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    protected final boolean containsNode(@org.checkerframework.checker.nullness.compatqual.NullableDecl N r2) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.graph.AbstractBaseGraph
    protected long edgeCount() {
            r2 = this;
            long r0 = r2.edgeCount
            return r0
    }

    @Override // com.google.common.graph.ValueGraph
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V edgeValueOrDefault(com.google.common.graph.EndpointPair<N> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.edgeValueOrDefault_internal(r0, r2, r3)
            return r2
    }

    @Override // com.google.common.graph.ValueGraph
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public V edgeValueOrDefault(N r1, N r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r3) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Object r1 = r0.edgeValueOrDefault_internal(r1, r2, r3)
            return r1
    }

    protected final V edgeValueOrDefault_internal(N r2, N r3, V r4) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            java.lang.Object r2 = r0.get(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            if (r2 != 0) goto Lc
            r2 = 0
            goto L10
        Lc:
            java.lang.Object r2 = r2.value(r3)
        L10:
            if (r2 != 0) goto L13
            return r4
        L13:
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1.isOrderingCompatible(r2)
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            boolean r2 = r1.hasEdgeConnecting_internal(r0, r2)
            if (r2 == 0) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N r1, N r2) {
            r0 = this;
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r1 = r0.hasEdgeConnecting_internal(r1, r2)
            return r1
    }

    protected final boolean hasEdgeConnecting_internal(N r2, N r3) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            java.lang.Object r2 = r0.get(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            if (r2 == 0) goto L16
            java.util.Set r2 = r2.successors()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public boolean isDirected() {
            r1 = this;
            boolean r0 = r1.isDirected
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<N> r0 = r1.nodeOrder
            return r0
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public java.util.Set<N> nodes() {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r1.nodeConnections
            java.util.Set r0 = r0.unmodifiableKeySet()
            return r0
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.predecessors()
            return r1
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r1) {
            r0 = this;
            com.google.common.graph.GraphConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.successors()
            return r1
    }
}
