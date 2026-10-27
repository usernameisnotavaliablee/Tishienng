package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class AbstractBaseGraph<N> implements com.google.common.graph.BaseGraph<N> {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class IncidentEdgeSet<N> extends java.util.AbstractSet<com.google.common.graph.EndpointPair<N>> {
        protected final com.google.common.graph.BaseGraph<N> graph;
        protected final N node;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class Directed<N> extends com.google.common.graph.AbstractBaseGraph.IncidentEdgeSet<N> {



            private Directed(com.google.common.graph.BaseGraph<N> r2, N r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            /* synthetic */ Directed(com.google.common.graph.BaseGraph r1, java.lang.Object r2, com.google.common.graph.AbstractBaseGraph.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = r5 instanceof com.google.common.graph.EndpointPair
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    com.google.common.graph.EndpointPair r5 = (com.google.common.graph.EndpointPair) r5
                    boolean r0 = r5.isOrdered()
                    if (r0 != 0) goto Lf
                    return r1
                Lf:
                    java.lang.Object r0 = r5.source()
                    java.lang.Object r5 = r5.target()
                    N r2 = r4.node
                    boolean r2 = r2.equals(r0)
                    if (r2 == 0) goto L2d
                    com.google.common.graph.BaseGraph<N> r2 = r4.graph
                    N r3 = r4.node
                    java.util.Set r2 = r2.successors(r3)
                    boolean r2 = r2.contains(r5)
                    if (r2 != 0) goto L43
                L2d:
                    N r2 = r4.node
                    boolean r5 = r2.equals(r5)
                    if (r5 == 0) goto L45
                    com.google.common.graph.BaseGraph<N> r5 = r4.graph
                    N r2 = r4.node
                    java.util.Set r5 = r5.predecessors(r2)
                    boolean r5 = r5.contains(r0)
                    if (r5 == 0) goto L45
                L43:
                    r5 = 1
                    return r5
                L45:
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<com.google.common.graph.EndpointPair<N>> iterator() {
                    r3 = this;
                    com.google.common.graph.BaseGraph<N> r0 = r3.graph
                    N r1 = r3.node
                    java.util.Set r0 = r0.predecessors(r1)
                    java.util.Iterator r0 = r0.iterator()
                    com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$1 r1 = new com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$1
                    r1.<init>(r3)
                    java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
                    com.google.common.graph.BaseGraph<N> r1 = r3.graph
                    N r2 = r3.node
                    java.util.Set r1 = r1.successors(r2)
                    N r2 = r3.node
                    com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of(r2)
                    com.google.common.collect.Sets$SetView r1 = com.google.common.collect.Sets.difference(r1, r2)
                    com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
                    com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$2 r2 = new com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$2
                    r2.<init>(r3)
                    java.util.Iterator r1 = com.google.common.collect.Iterators.transform(r1, r2)
                    java.util.Iterator r0 = com.google.common.collect.Iterators.concat(r0, r1)
                    com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                    r1 = this;
                    com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r3 = this;
                    com.google.common.graph.BaseGraph<N> r0 = r3.graph
                    N r1 = r3.node
                    int r0 = r0.inDegree(r1)
                    com.google.common.graph.BaseGraph<N> r1 = r3.graph
                    N r2 = r3.node
                    int r1 = r1.outDegree(r2)
                    int r0 = r0 + r1
                    com.google.common.graph.BaseGraph<N> r1 = r3.graph
                    N r2 = r3.node
                    java.util.Set r1 = r1.successors(r2)
                    N r2 = r3.node
                    boolean r1 = r1.contains(r2)
                    int r0 = r0 - r1
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class Undirected<N> extends com.google.common.graph.AbstractBaseGraph.IncidentEdgeSet<N> {


            private Undirected(com.google.common.graph.BaseGraph<N> r2, N r3) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r0)
                    return
            }

            /* synthetic */ Undirected(com.google.common.graph.BaseGraph r1, java.lang.Object r2, com.google.common.graph.AbstractBaseGraph.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
                    r4 = this;
                    boolean r0 = r5 instanceof com.google.common.graph.EndpointPair
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    com.google.common.graph.EndpointPair r5 = (com.google.common.graph.EndpointPair) r5
                    boolean r0 = r5.isOrdered()
                    if (r0 == 0) goto Lf
                    return r1
                Lf:
                    com.google.common.graph.BaseGraph<N> r0 = r4.graph
                    N r2 = r4.node
                    java.util.Set r0 = r0.adjacentNodes(r2)
                    java.lang.Object r2 = r5.nodeU()
                    java.lang.Object r5 = r5.nodeV()
                    N r3 = r4.node
                    boolean r3 = r3.equals(r5)
                    if (r3 == 0) goto L2d
                    boolean r3 = r0.contains(r2)
                    if (r3 != 0) goto L3b
                L2d:
                    N r3 = r4.node
                    boolean r2 = r3.equals(r2)
                    if (r2 == 0) goto L3d
                    boolean r5 = r0.contains(r5)
                    if (r5 == 0) goto L3d
                L3b:
                    r5 = 1
                    return r5
                L3d:
                    return r1
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public com.google.common.collect.UnmodifiableIterator<com.google.common.graph.EndpointPair<N>> iterator() {
                    r2 = this;
                    com.google.common.graph.BaseGraph<N> r0 = r2.graph
                    N r1 = r2.node
                    java.util.Set r0 = r0.adjacentNodes(r1)
                    java.util.Iterator r0 = r0.iterator()
                    com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Undirected$1 r1 = new com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Undirected$1
                    r1.<init>(r2)
                    java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
                    com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.unmodifiableIterator(r0)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                    r1 = this;
                    com.google.common.collect.UnmodifiableIterator r0 = r1.iterator()
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                    r2 = this;
                    com.google.common.graph.BaseGraph<N> r0 = r2.graph
                    N r1 = r2.node
                    java.util.Set r0 = r0.adjacentNodes(r1)
                    int r0 = r0.size()
                    return r0
            }
        }

        private IncidentEdgeSet(com.google.common.graph.BaseGraph<N> r1, N r2) {
                r0 = this;
                r0.<init>()
                r0.graph = r1
                r0.node = r2
                return
        }

        /* synthetic */ IncidentEdgeSet(com.google.common.graph.BaseGraph r1, java.lang.Object r2, com.google.common.graph.AbstractBaseGraph.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static <N> com.google.common.graph.AbstractBaseGraph.IncidentEdgeSet<N> of(com.google.common.graph.BaseGraph<N> r2, N r3) {
                boolean r0 = r2.isDirected()
                r1 = 0
                if (r0 == 0) goto Ld
                com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed r0 = new com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed
                r0.<init>(r2, r3, r1)
                return r0
            Ld:
                com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Undirected r0 = new com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Undirected
                r0.<init>(r2, r3, r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    AbstractBaseGraph() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N r3) {
            r2 = this;
            boolean r0 = r2.isDirected()
            if (r0 == 0) goto L1b
            java.util.Set r0 = r2.predecessors(r3)
            int r0 = r0.size()
            java.util.Set r3 = r2.successors(r3)
            int r3 = r3.size()
            int r3 = com.google.common.math.IntMath.saturatedAdd(r0, r3)
            return r3
        L1b:
            java.util.Set r0 = r2.adjacentNodes(r3)
            boolean r1 = r2.allowsSelfLoops()
            if (r1 == 0) goto L2d
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            int r0 = r0.size()
            int r3 = com.google.common.math.IntMath.saturatedAdd(r0, r3)
            return r3
    }

    protected long edgeCount() {
            r8 = this;
            java.util.Set r0 = r8.nodes()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        Lb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1c
            java.lang.Object r5 = r0.next()
            int r5 = r8.degree(r5)
            long r5 = (long) r5
            long r3 = r3 + r5
            goto Lb
        L1c:
            r5 = 1
            long r5 = r5 & r3
            r0 = 1
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            com.google.common.base.Preconditions.checkState(r1)
            long r0 = r3 >>> r0
            return r0
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> edges() {
            r1 = this;
            com.google.common.graph.AbstractBaseGraph$1 r0 = new com.google.common.graph.AbstractBaseGraph$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(com.google.common.graph.EndpointPair<N> r4) {
            r3 = this;
            com.google.common.base.Preconditions.checkNotNull(r4)
            boolean r0 = r3.isOrderingCompatible(r4)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.Object r0 = r4.nodeU()
            java.lang.Object r4 = r4.nodeV()
            java.util.Set r2 = r3.nodes()
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L29
            java.util.Set r0 = r3.successors(r0)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L29
            r4 = 1
            return r4
        L29:
            return r1
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N r2, N r3) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Set r0 = r1.nodes()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1c
            java.util.Set r2 = r1.successors(r2)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.predecessors(r2)
            int r2 = r2.size()
            return r2
        Lf:
            int r2 = r1.degree(r2)
            return r2
    }

    @Override // com.google.common.graph.BaseGraph
    public java.util.Set<com.google.common.graph.EndpointPair<N>> incidentEdges(N r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.util.Set r0 = r2.nodes()
            boolean r0 = r0.contains(r3)
            java.lang.String r1 = "Node %s is not an element of this graph."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet r3 = com.google.common.graph.AbstractBaseGraph.IncidentEdgeSet.of(r2, r3)
            return r3
    }

    protected final boolean isOrderingCompatible(com.google.common.graph.EndpointPair<?> r1) {
            r0 = this;
            boolean r1 = r1.isOrdered()
            if (r1 != 0) goto Lf
            boolean r1 = r0.isDirected()
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N r2) {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lf
            java.util.Set r2 = r1.successors(r2)
            int r2 = r2.size()
            return r2
        Lf:
            int r2 = r1.degree(r2)
            return r2
    }

    protected final void validateEndpoints(com.google.common.graph.EndpointPair<?> r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r2 = r1.isOrderingCompatible(r2)
            java.lang.String r0 = "Mismatch: unordered endpoints cannot be used with directed graphs"
            com.google.common.base.Preconditions.checkArgument(r2, r0)
            return
    }
}
