package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractGraphBuilder<N> {
    boolean allowsSelfLoops;
    final boolean directed;
    com.google.common.base.Optional<java.lang.Integer> expectedNodeCount;
    com.google.common.graph.ElementOrder<N> nodeOrder;

    AbstractGraphBuilder(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.allowsSelfLoops = r0
            com.google.common.graph.ElementOrder r0 = com.google.common.graph.ElementOrder.insertion()
            r1.nodeOrder = r0
            com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
            r1.expectedNodeCount = r0
            r1.directed = r2
            return
    }
}
