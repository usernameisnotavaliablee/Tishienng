package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
interface GraphConnections<N, V> {
    void addPredecessor(N r1, V r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    V addSuccessor(N r1, V r2);

    java.util.Set<N> adjacentNodes();

    java.util.Set<N> predecessors();

    void removePredecessor(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    V removeSuccessor(N r1);

    java.util.Set<N> successors();

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    V value(N r1);
}
