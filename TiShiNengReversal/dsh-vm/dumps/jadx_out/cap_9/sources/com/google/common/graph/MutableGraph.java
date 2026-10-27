package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface MutableGraph<N> extends com.google.common.graph.Graph<N> {
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean addNode(N r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putEdge(com.google.common.graph.EndpointPair<N> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean putEdge(N r1, N r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeEdge(com.google.common.graph.EndpointPair<N> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeEdge(N r1, N r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean removeNode(N r1);
}
