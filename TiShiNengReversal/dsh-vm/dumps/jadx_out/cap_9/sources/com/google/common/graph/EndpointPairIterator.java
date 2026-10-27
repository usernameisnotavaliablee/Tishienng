package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class EndpointPairIterator<N> extends com.google.common.collect.AbstractIterator<com.google.common.graph.EndpointPair<N>> {
    private final com.google.common.graph.BaseGraph<N> graph;
    protected N node;
    private final java.util.Iterator<N> nodeIterator;
    protected java.util.Iterator<N> successorIterator;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.graph.EndpointPairIterator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Directed<N> extends com.google.common.graph.EndpointPairIterator<N> {
        private Directed(com.google.common.graph.BaseGraph<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ Directed(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        protected com.google.common.graph.EndpointPair<N> computeNext() {
                r2 = this;
            L0:
                java.util.Iterator<N> r0 = r2.successorIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L15
                N r0 = r2.node
                java.util.Iterator<N> r1 = r2.successorIterator
                java.lang.Object r1 = r1.next()
                com.google.common.graph.EndpointPair r0 = com.google.common.graph.EndpointPair.ordered(r0, r1)
                return r0
            L15:
                boolean r0 = r2.advance()
                if (r0 != 0) goto L0
                java.lang.Object r0 = r2.endOfData()
                com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ java.lang.Object computeNext() {
                r1 = this;
                com.google.common.graph.EndpointPair r0 = r1.computeNext()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Undirected<N> extends com.google.common.graph.EndpointPairIterator<N> {
        private java.util.Set<N> visitedNodes;

        private Undirected(com.google.common.graph.BaseGraph<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                java.util.Set r2 = r2.nodes()
                int r2 = r2.size()
                java.util.HashSet r2 = com.google.common.collect.Sets.newHashSetWithExpectedSize(r2)
                r1.visitedNodes = r2
                return
        }

        /* synthetic */ Undirected(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        protected com.google.common.graph.EndpointPair<N> computeNext() {
                r2 = this;
            L0:
                java.util.Iterator<N> r0 = r2.successorIterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1d
                java.util.Iterator<N> r0 = r2.successorIterator
                java.lang.Object r0 = r0.next()
                java.util.Set<N> r1 = r2.visitedNodes
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto L0
                N r1 = r2.node
                com.google.common.graph.EndpointPair r0 = com.google.common.graph.EndpointPair.unordered(r1, r0)
                return r0
            L1d:
                java.util.Set<N> r0 = r2.visitedNodes
                N r1 = r2.node
                r0.add(r1)
                boolean r0 = r2.advance()
                if (r0 != 0) goto L0
                r0 = 0
                r2.visitedNodes = r0
                java.lang.Object r0 = r2.endOfData()
                com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                return r0
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ java.lang.Object computeNext() {
                r1 = this;
                com.google.common.graph.EndpointPair r0 = r1.computeNext()
                return r0
        }
    }

    private EndpointPairIterator(com.google.common.graph.BaseGraph<N> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.node = r0
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of()
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
            r1.successorIterator = r0
            r1.graph = r2
            java.util.Set r2 = r2.nodes()
            java.util.Iterator r2 = r2.iterator()
            r1.nodeIterator = r2
            return
    }

    /* synthetic */ EndpointPairIterator(com.google.common.graph.BaseGraph r1, com.google.common.graph.EndpointPairIterator.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <N> com.google.common.graph.EndpointPairIterator<N> of(com.google.common.graph.BaseGraph<N> r2) {
            boolean r0 = r2.isDirected()
            r1 = 0
            if (r0 == 0) goto Ld
            com.google.common.graph.EndpointPairIterator$Directed r0 = new com.google.common.graph.EndpointPairIterator$Directed
            r0.<init>(r2, r1)
            return r0
        Ld:
            com.google.common.graph.EndpointPairIterator$Undirected r0 = new com.google.common.graph.EndpointPairIterator$Undirected
            r0.<init>(r2, r1)
            return r0
    }

    protected final boolean advance() {
            r3 = this;
            java.util.Iterator<N> r0 = r3.successorIterator
            boolean r0 = r0.hasNext()
            r1 = 1
            r0 = r0 ^ r1
            com.google.common.base.Preconditions.checkState(r0)
            java.util.Iterator<N> r0 = r3.nodeIterator
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            java.util.Iterator<N> r0 = r3.nodeIterator
            java.lang.Object r0 = r0.next()
            r3.node = r0
            com.google.common.graph.BaseGraph<N> r2 = r3.graph
            java.util.Set r0 = r2.successors(r0)
            java.util.Iterator r0 = r0.iterator()
            r3.successorIterator = r0
            return r1
    }
}
