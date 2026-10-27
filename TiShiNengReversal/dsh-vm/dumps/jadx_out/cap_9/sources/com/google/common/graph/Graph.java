package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Graph<N> extends com.google.common.graph.BaseGraph<N> {
    java.util.Set<N> adjacentNodes(N r1);

    boolean allowsSelfLoops();

    @Override // com.google.common.graph.BaseGraph
    int degree(N r1);

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> edges();

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r1);

    @Override // com.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N r1, N r2);

    int hashCode();

    @Override // com.google.common.graph.BaseGraph
    int inDegree(N r1);

    @Override // com.google.common.graph.BaseGraph
    java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r1);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    @Override // com.google.common.graph.BaseGraph
    int outDegree(N r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    java.util.Set<N> predecessors(N r1);

    @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N r1);
}
