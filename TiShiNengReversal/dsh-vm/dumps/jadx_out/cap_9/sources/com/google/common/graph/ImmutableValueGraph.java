package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable(containerOf = {"N", "V"})
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ImmutableValueGraph<N, V> extends com.google.common.graph.ConfigurableValueGraph<N, V> {


    private ImmutableValueGraph(com.google.common.graph.ValueGraph<N, V> r5) {
            r4 = this;
            com.google.common.graph.ValueGraphBuilder r0 = com.google.common.graph.ValueGraphBuilder.from(r5)
            com.google.common.collect.ImmutableMap r1 = getNodeConnections(r5)
            java.util.Set r5 = r5.edges()
            int r5 = r5.size()
            long r2 = (long) r5
            r4.<init>(r0, r1, r2)
            return
    }

    private static <N, V> com.google.common.graph.GraphConnections<N, V> connectionsOf(com.google.common.graph.ValueGraph<N, V> r2, N r3) {
            com.google.common.graph.ImmutableValueGraph$1 r0 = new com.google.common.graph.ImmutableValueGraph$1
            r0.<init>(r2, r3)
            boolean r1 = r2.isDirected()
            if (r1 == 0) goto L1c
            java.util.Set r1 = r2.predecessors(r3)
            java.util.Set r2 = r2.successors(r3)
            java.util.Map r2 = com.google.common.collect.Maps.asMap(r2, r0)
            com.google.common.graph.DirectedGraphConnections r2 = com.google.common.graph.DirectedGraphConnections.ofImmutable(r1, r2)
            return r2
        L1c:
            java.util.Set r2 = r2.adjacentNodes(r3)
            java.util.Map r2 = com.google.common.collect.Maps.asMap(r2, r0)
            com.google.common.graph.UndirectedGraphConnections r2 = com.google.common.graph.UndirectedGraphConnections.ofImmutable(r2)
            return r2
    }

    @java.lang.Deprecated
    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ImmutableValueGraph<N, V> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.graph.ImmutableValueGraph r0 = (com.google.common.graph.ImmutableValueGraph) r0
            return r0
    }

    public static <N, V> com.google.common.graph.ImmutableValueGraph<N, V> copyOf(com.google.common.graph.ValueGraph<N, V> r1) {
            boolean r0 = r1 instanceof com.google.common.graph.ImmutableValueGraph
            if (r0 == 0) goto L7
            com.google.common.graph.ImmutableValueGraph r1 = (com.google.common.graph.ImmutableValueGraph) r1
            return r1
        L7:
            com.google.common.graph.ImmutableValueGraph r0 = new com.google.common.graph.ImmutableValueGraph
            r0.<init>(r1)
            return r0
    }

    private static <N, V> com.google.common.collect.ImmutableMap<N, com.google.common.graph.GraphConnections<N, V>> getNodeConnections(com.google.common.graph.ValueGraph<N, V> r4) {
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            java.util.Set r1 = r4.nodes()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            com.google.common.graph.GraphConnections r3 = connectionsOf(r4, r2)
            r0.put(r2, r3)
            goto Lc
        L1e:
            com.google.common.collect.ImmutableMap r4 = r0.build()
            return r4
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set adjacentNodes(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.adjacentNodes(r1)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
            r1 = this;
            boolean r0 = super.allowsSelfLoops()
            return r0
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public /* bridge */ /* synthetic */ com.google.common.graph.Graph asGraph() {
            r1 = this;
            com.google.common.graph.ImmutableGraph r0 = r1.asGraph()
            return r0
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public com.google.common.graph.ImmutableGraph<N> asGraph() {
            r1 = this;
            com.google.common.graph.ImmutableGraph r0 = new com.google.common.graph.ImmutableGraph
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.ValueGraph
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(com.google.common.graph.EndpointPair r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.edgeValueOrDefault(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.ValueGraph
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public /* bridge */ /* synthetic */ java.lang.Object edgeValueOrDefault(java.lang.Object r1, java.lang.Object r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r0 = this;
            java.lang.Object r1 = super.edgeValueOrDefault(r1, r2, r3)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair r1) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
            r1 = this;
            boolean r0 = super.isDirected()
            return r0
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ com.google.common.graph.ElementOrder nodeOrder() {
            r1 = this;
            com.google.common.graph.ElementOrder r0 = super.nodeOrder()
            return r0
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ java.util.Set nodes() {
            r1 = this;
            java.util.Set r0 = super.nodes()
            return r0
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set predecessors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.predecessors(r1)
            return r1
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ java.util.Set successors(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.successors(r1)
            return r1
    }
}
