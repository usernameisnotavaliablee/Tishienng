package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Network<N, E> extends com.google.common.graph.SuccessorsFunction<N>, com.google.common.graph.PredecessorsFunction<N> {
    java.util.Set<E> adjacentEdges(E r1);

    java.util.Set<N> adjacentNodes(N r1);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    com.google.common.graph.Graph<N> asGraph();

    int degree(N r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    E edgeConnectingOrNull(com.google.common.graph.EndpointPair<N> r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    E edgeConnectingOrNull(N r1, N r2);

    com.google.common.graph.ElementOrder<E> edgeOrder();

    java.util.Set<E> edges();

    java.util.Set<E> edgesConnecting(com.google.common.graph.EndpointPair<N> r1);

    java.util.Set<E> edgesConnecting(N r1, N r2);

    boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1);

    boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r1);

    boolean hasEdgeConnecting(N r1, N r2);

    int hashCode();

    int inDegree(N r1);

    java.util.Set<E> inEdges(N r1);

    java.util.Set<E> incidentEdges(N r1);

    com.google.common.graph.EndpointPair<N> incidentNodes(E r1);

    boolean isDirected();

    com.google.common.graph.ElementOrder<N> nodeOrder();

    java.util.Set<N> nodes();

    int outDegree(N r1);

    java.util.Set<E> outEdges(N r1);

    java.util.Set<N> predecessors(N r1);

    @Override // com.google.common.graph.SuccessorsFunction
    java.util.Set<N> successors(N r1);
}
