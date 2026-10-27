package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ValueGraphBuilder<N, V> extends com.google.common.graph.AbstractGraphBuilder<N> {
    private ValueGraphBuilder(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private <N1 extends N, V1 extends V> com.google.common.graph.ValueGraphBuilder<N1, V1> cast() {
            r0 = this;
            return r0
    }

    public static com.google.common.graph.ValueGraphBuilder<java.lang.Object, java.lang.Object> directed() {
            com.google.common.graph.ValueGraphBuilder r0 = new com.google.common.graph.ValueGraphBuilder
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public static <N, V> com.google.common.graph.ValueGraphBuilder<N, V> from(com.google.common.graph.ValueGraph<N, V> r2) {
            com.google.common.graph.ValueGraphBuilder r0 = new com.google.common.graph.ValueGraphBuilder
            boolean r1 = r2.isDirected()
            r0.<init>(r1)
            boolean r1 = r2.allowsSelfLoops()
            com.google.common.graph.ValueGraphBuilder r0 = r0.allowsSelfLoops(r1)
            com.google.common.graph.ElementOrder r2 = r2.nodeOrder()
            com.google.common.graph.ValueGraphBuilder r2 = r0.nodeOrder(r2)
            return r2
    }

    public static com.google.common.graph.ValueGraphBuilder<java.lang.Object, java.lang.Object> undirected() {
            com.google.common.graph.ValueGraphBuilder r0 = new com.google.common.graph.ValueGraphBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public com.google.common.graph.ValueGraphBuilder<N, V> allowsSelfLoops(boolean r1) {
            r0 = this;
            r0.allowsSelfLoops = r1
            return r0
    }

    public <N1 extends N, V1 extends V> com.google.common.graph.MutableValueGraph<N1, V1> build() {
            r1 = this;
            com.google.common.graph.ConfigurableMutableValueGraph r0 = new com.google.common.graph.ConfigurableMutableValueGraph
            r0.<init>(r1)
            return r0
    }

    public com.google.common.graph.ValueGraphBuilder<N, V> expectedNodeCount(int r1) {
            r0 = this;
            int r1 = com.google.common.graph.Graphs.checkNonNegative(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.of(r1)
            r0.expectedNodeCount = r1
            return r0
    }

    public <N1 extends N> com.google.common.graph.ValueGraphBuilder<N1, V> nodeOrder(com.google.common.graph.ElementOrder<N1> r2) {
            r1 = this;
            com.google.common.graph.ValueGraphBuilder r0 = r1.cast()
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.graph.ElementOrder r2 = (com.google.common.graph.ElementOrder) r2
            r0.nodeOrder = r2
            return r0
    }
}
