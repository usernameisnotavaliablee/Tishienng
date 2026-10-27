package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ConfigurableNetwork<N, E> extends com.google.common.graph.AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final com.google.common.graph.ElementOrder<E> edgeOrder;
    protected final com.google.common.graph.MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    protected final com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> nodeConnections;
    private final com.google.common.graph.ElementOrder<N> nodeOrder;

    ConfigurableNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> r5) {
            r4 = this;
            com.google.common.graph.ElementOrder<N> r0 = r5.nodeOrder
            com.google.common.base.Optional<java.lang.Integer> r1 = r5.expectedNodeCount
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.or(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map r0 = r0.createMap(r1)
            com.google.common.graph.ElementOrder<? super E> r1 = r5.edgeOrder
            com.google.common.base.Optional<java.lang.Integer> r2 = r5.expectedEdgeCount
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.or(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map r1 = r1.createMap(r2)
            r4.<init>(r5, r0, r1)
            return
    }

    ConfigurableNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> r2, java.util.Map<N, com.google.common.graph.NetworkConnections<N, E>> r3, java.util.Map<E, N> r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.directed
            r1.isDirected = r0
            boolean r0 = r2.allowsParallelEdges
            r1.allowsParallelEdges = r0
            boolean r0 = r2.allowsSelfLoops
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder<N> r0 = r2.nodeOrder
            com.google.common.graph.ElementOrder r0 = r0.cast()
            r1.nodeOrder = r0
            com.google.common.graph.ElementOrder<? super E> r2 = r2.edgeOrder
            com.google.common.graph.ElementOrder r2 = r2.cast()
            r1.edgeOrder = r2
            boolean r2 = r3 instanceof java.util.TreeMap
            if (r2 == 0) goto L29
            com.google.common.graph.MapRetrievalCache r2 = new com.google.common.graph.MapRetrievalCache
            r2.<init>(r3)
            goto L2e
        L29:
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r3)
        L2e:
            r1.nodeConnections = r2
            com.google.common.graph.MapIteratorCache r2 = new com.google.common.graph.MapIteratorCache
            r2.<init>(r4)
            r1.edgeToReferenceNode = r2
            return
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> adjacentNodes(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.adjacentNodes()
            return r1
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
            r1 = this;
            boolean r0 = r1.allowsParallelEdges
            return r0
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = r1.allowsSelfLoops
            return r0
    }

    protected final com.google.common.graph.NetworkConnections<N, E> checkedConnections(N r4) {
            r3 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r3.nodeConnections
            java.lang.Object r0 = r0.get(r4)
            com.google.common.graph.NetworkConnections r0 = (com.google.common.graph.NetworkConnections) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Node %s is not an element of this graph."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    protected final N checkedReferenceNode(E r4) {
            r3 = this;
            com.google.common.graph.MapIteratorCache<E, N> r0 = r3.edgeToReferenceNode
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L9
            return r0
        L9:
            com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Edge %s is not an element of this graph."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    protected final boolean containsEdge(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r2) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<E, N> r0 = r1.edgeToReferenceNode
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    protected final boolean containsNode(@org.checkerframework.checker.nullness.compatqual.NullableDecl N r2) {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r1.nodeConnections
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<E> edgeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<E> r0 = r1.edgeOrder
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> edges() {
            r1 = this;
            com.google.common.graph.MapIteratorCache<E, N> r0 = r1.edgeToReferenceNode
            java.util.Set r0 = r0.unmodifiableKeySet()
            return r0
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public java.util.Set<E> edgesConnecting(N r3, N r4) {
            r2 = this;
            com.google.common.graph.NetworkConnections r0 = r2.checkedConnections(r3)
            boolean r1 = r2.allowsSelfLoops
            if (r1 != 0) goto Lf
            if (r3 != r4) goto Lf
            com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
            return r3
        Lf:
            boolean r3 = r2.containsNode(r4)
            java.lang.String r1 = "Node %s is not an element of this graph."
            com.google.common.base.Preconditions.checkArgument(r3, r1, r4)
            java.util.Set r3 = r0.edgesConnecting(r4)
            return r3
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> inEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.inEdges()
            return r1
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> incidentEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.incidentEdges()
            return r1
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.EndpointPair<N> incidentNodes(E r3) {
            r2 = this;
            java.lang.Object r0 = r2.checkedReferenceNode(r3)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r1 = r2.nodeConnections
            java.lang.Object r1 = r1.get(r0)
            com.google.common.graph.NetworkConnections r1 = (com.google.common.graph.NetworkConnections) r1
            java.lang.Object r3 = r1.adjacentNode(r3)
            com.google.common.graph.EndpointPair r3 = com.google.common.graph.EndpointPair.of(r2, r0, r3)
            return r3
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
            r1 = this;
            boolean r0 = r1.isDirected
            return r0
    }

    @Override // com.google.common.graph.Network
    public com.google.common.graph.ElementOrder<N> nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder<N> r0 = r1.nodeOrder
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<N> nodes() {
            r1 = this;
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r1.nodeConnections
            java.util.Set r0 = r0.unmodifiableKeySet()
            return r0
    }

    @Override // com.google.common.graph.Network
    public java.util.Set<E> outEdges(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.outEdges()
            return r1
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public java.util.Set<N> predecessors(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.predecessors()
            return r1
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.lang.Iterable successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = r0.successors(r1)
            return r1
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public java.util.Set<N> successors(N r1) {
            r0 = this;
            com.google.common.graph.NetworkConnections r1 = r0.checkedConnections(r1)
            java.util.Set r1 = r1.successors()
            return r1
    }
}
