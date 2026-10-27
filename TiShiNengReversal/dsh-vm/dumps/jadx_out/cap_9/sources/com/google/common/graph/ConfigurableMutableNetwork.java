package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ConfigurableMutableNetwork<N, E> extends com.google.common.graph.ConfigurableNetwork<N, E> implements com.google.common.graph.MutableNetwork<N, E> {
    ConfigurableMutableNetwork(com.google.common.graph.NetworkBuilder<? super N, ? super E> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private com.google.common.graph.NetworkConnections<N, E> addNodeInternal(N r3) {
            r2 = this;
            com.google.common.graph.NetworkConnections r0 = r2.newConnections()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r1 = r2.nodeConnections
            java.lang.Object r3 = r1.put(r3, r0)
            if (r3 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            com.google.common.base.Preconditions.checkState(r3)
            return r0
    }

    private com.google.common.graph.NetworkConnections<N, E> newConnections() {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto L16
            boolean r0 = r1.allowsParallelEdges()
            if (r0 == 0) goto L11
            com.google.common.graph.DirectedMultiNetworkConnections r0 = com.google.common.graph.DirectedMultiNetworkConnections.of()
            return r0
        L11:
            com.google.common.graph.DirectedNetworkConnections r0 = com.google.common.graph.DirectedNetworkConnections.of()
            return r0
        L16:
            boolean r0 = r1.allowsParallelEdges()
            if (r0 == 0) goto L21
            com.google.common.graph.UndirectedMultiNetworkConnections r0 = com.google.common.graph.UndirectedMultiNetworkConnections.of()
            return r0
        L21:
            com.google.common.graph.UndirectedNetworkConnections r0 = com.google.common.graph.UndirectedNetworkConnections.of()
            return r0
    }

    @Override // com.google.common.graph.MutableNetwork
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addEdge(com.google.common.graph.EndpointPair<N> r2, E r3) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            boolean r2 = r1.addEdge(r0, r2, r3)
            return r2
    }

    @Override // com.google.common.graph.MutableNetwork
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addEdge(N r6, N r7, E r8) {
            r5 = this;
            java.lang.String r0 = "nodeU"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            java.lang.String r0 = "nodeV"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "edge"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            boolean r0 = r5.containsEdge(r8)
            r1 = 0
            if (r0 == 0) goto L28
            com.google.common.graph.EndpointPair r0 = r5.incidentNodes(r8)
            com.google.common.graph.EndpointPair r6 = com.google.common.graph.EndpointPair.of(r5, r6, r7)
            boolean r7 = r0.equals(r6)
            java.lang.String r2 = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s."
            com.google.common.base.Preconditions.checkArgument(r7, r2, r8, r0, r6)
            return r1
        L28:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r5.nodeConnections
            java.lang.Object r0 = r0.get(r6)
            com.google.common.graph.NetworkConnections r0 = (com.google.common.graph.NetworkConnections) r0
            boolean r2 = r5.allowsParallelEdges()
            r3 = 1
            if (r2 != 0) goto L49
            if (r0 == 0) goto L43
            java.util.Set r2 = r0.successors()
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L44
        L43:
            r1 = 1
        L44:
            java.lang.String r2 = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder."
            com.google.common.base.Preconditions.checkArgument(r1, r2, r6, r7)
        L49:
            boolean r1 = r6.equals(r7)
            boolean r2 = r5.allowsSelfLoops()
            if (r2 != 0) goto L5a
            r2 = r1 ^ 1
            java.lang.String r4 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder."
            com.google.common.base.Preconditions.checkArgument(r2, r4, r6)
        L5a:
            if (r0 != 0) goto L60
            com.google.common.graph.NetworkConnections r0 = r5.addNodeInternal(r6)
        L60:
            r0.addOutEdge(r8, r7)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r5.nodeConnections
            java.lang.Object r0 = r0.get(r7)
            com.google.common.graph.NetworkConnections r0 = (com.google.common.graph.NetworkConnections) r0
            if (r0 != 0) goto L71
            com.google.common.graph.NetworkConnections r0 = r5.addNodeInternal(r7)
        L71:
            r0.addInEdge(r8, r6, r1)
            com.google.common.graph.MapIteratorCache<E, N> r7 = r5.edgeToReferenceNode
            r7.put(r8, r6)
            return r3
    }

    @Override // com.google.common.graph.MutableNetwork
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean addNode(N r2) {
            r1 = this;
            java.lang.String r0 = "node"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            boolean r0 = r1.containsNode(r2)
            if (r0 == 0) goto Ld
            r2 = 0
            return r2
        Ld:
            r1.addNodeInternal(r2)
            r2 = 1
            return r2
    }

    @Override // com.google.common.graph.MutableNetwork
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeEdge(E r7) {
            r6 = this;
            java.lang.String r0 = "edge"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            com.google.common.graph.MapIteratorCache<E, N> r0 = r6.edgeToReferenceNode
            java.lang.Object r0 = r0.get(r7)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r2 = r6.nodeConnections
            java.lang.Object r2 = r2.get(r0)
            com.google.common.graph.NetworkConnections r2 = (com.google.common.graph.NetworkConnections) r2
            java.lang.Object r3 = r2.adjacentNode(r7)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r4 = r6.nodeConnections
            java.lang.Object r4 = r4.get(r3)
            com.google.common.graph.NetworkConnections r4 = (com.google.common.graph.NetworkConnections) r4
            r2.removeOutEdge(r7)
            boolean r2 = r6.allowsSelfLoops()
            r5 = 1
            if (r2 == 0) goto L34
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L34
            r1 = 1
        L34:
            r4.removeInEdge(r7, r1)
            com.google.common.graph.MapIteratorCache<E, N> r0 = r6.edgeToReferenceNode
            r0.remove(r7)
            return r5
    }

    @Override // com.google.common.graph.MutableNetwork
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeNode(N r3) {
            r2 = this;
            java.lang.String r0 = "node"
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r2.nodeConnections
            java.lang.Object r0 = r0.get(r3)
            com.google.common.graph.NetworkConnections r0 = (com.google.common.graph.NetworkConnections) r0
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L11:
            java.util.Set r0 = r0.incidentEdges()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            com.google.common.collect.UnmodifiableIterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            r2.removeEdge(r1)
            goto L1d
        L2b:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.NetworkConnections<N, E>> r0 = r2.nodeConnections
            r0.remove(r3)
            r3 = 1
            return r3
    }
}
