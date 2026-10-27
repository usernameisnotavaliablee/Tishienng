package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractValueGraph<N, V> extends com.google.common.graph.AbstractBaseGraph<N> implements com.google.common.graph.ValueGraph<N, V> {



    public AbstractValueGraph() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <N, V> java.util.Map<com.google.common.graph.EndpointPair<N>, V> edgeValueMap(com.google.common.graph.ValueGraph<N, V> r1) {
            com.google.common.graph.AbstractValueGraph$2 r0 = new com.google.common.graph.AbstractValueGraph$2
            r0.<init>(r1)
            java.util.Set r1 = r1.edges()
            java.util.Map r1 = com.google.common.collect.Maps.asMap(r1, r0)
            return r1
    }

    @Override // com.google.common.graph.ValueGraph
    public com.google.common.graph.Graph<N> asGraph() {
            r1 = this;
            com.google.common.graph.AbstractValueGraph$1 r0 = new com.google.common.graph.AbstractValueGraph$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.degree(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set edges() {
            r1 = this;
            java.util.Set r0 = super.edges()
            return r0
    }

    @Override // com.google.common.graph.ValueGraph
    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.graph.ValueGraph
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.graph.ValueGraph r5 = (com.google.common.graph.ValueGraph) r5
            boolean r1 = r4.isDirected()
            boolean r3 = r5.isDirected()
            if (r1 != r3) goto L33
            java.util.Set r1 = r4.nodes()
            java.util.Set r3 = r5.nodes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L33
            java.util.Map r1 = edgeValueMap(r4)
            java.util.Map r5 = edgeValueMap(r5)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L33
            return r0
        L33:
            return r2
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(com.google.common.graph.EndpointPair r1) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = super.hasEdgeConnecting(r1, r2)
            return r1
    }

    @Override // com.google.common.graph.ValueGraph
    public final int hashCode() {
            r1 = this;
            java.util.Map r0 = edgeValueMap(r1)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.inDegree(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ java.util.Set incidentEdges(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = super.incidentEdges(r1)
            return r1
    }

    @Override // com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(java.lang.Object r1) {
            r0 = this;
            int r1 = super.outDegree(r1)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isDirected: "
            r0.append(r1)
            boolean r1 = r2.isDirected()
            r0.append(r1)
            java.lang.String r1 = ", allowsSelfLoops: "
            r0.append(r1)
            boolean r1 = r2.allowsSelfLoops()
            r0.append(r1)
            java.lang.String r1 = ", nodes: "
            r0.append(r1)
            java.util.Set r1 = r2.nodes()
            r0.append(r1)
            java.lang.String r1 = ", edges: "
            r0.append(r1)
            java.util.Map r1 = edgeValueMap(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
