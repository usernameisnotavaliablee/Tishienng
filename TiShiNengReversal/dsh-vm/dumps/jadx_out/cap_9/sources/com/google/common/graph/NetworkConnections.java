package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E r1, N r2, boolean r3);

    void addOutEdge(E r1, N r2);

    N adjacentNode(E r1);

    java.util.Set<N> adjacentNodes();

    java.util.Set<E> edgesConnecting(N r1);

    java.util.Set<E> inEdges();

    java.util.Set<E> incidentEdges();

    java.util.Set<E> outEdges();

    java.util.Set<N> predecessors();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    N removeInEdge(E r1, boolean r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    N removeOutEdge(E r1);

    java.util.Set<N> successors();
}
