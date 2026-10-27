package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class ConfigurableMutableValueGraph<N, V> extends com.google.common.graph.ConfigurableValueGraph<N, V> implements com.google.common.graph.MutableValueGraph<N, V> {
    ConfigurableMutableValueGraph(com.google.common.graph.AbstractGraphBuilder<? super N> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private com.google.common.graph.GraphConnections<N, V> addNodeInternal(N r3) {
            r2 = this;
            com.google.common.graph.GraphConnections r0 = r2.newConnections()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r1 = r2.nodeConnections
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

    private com.google.common.graph.GraphConnections<N, V> newConnections() {
            r1 = this;
            boolean r0 = r1.isDirected()
            if (r0 == 0) goto Lb
            com.google.common.graph.DirectedGraphConnections r0 = com.google.common.graph.DirectedGraphConnections.of()
            return r0
        Lb:
            com.google.common.graph.UndirectedGraphConnections r0 = com.google.common.graph.UndirectedGraphConnections.of()
            return r0
    }

    @Override // com.google.common.graph.MutableValueGraph
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

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V putEdgeValue(com.google.common.graph.EndpointPair<N> r2, V r3) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.putEdgeValue(r0, r2, r3)
            return r2
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V putEdgeValue(N r4, N r5, V r6) {
            r3 = this;
            java.lang.String r0 = "nodeU"
            com.google.common.base.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "nodeV"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "value"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            boolean r0 = r3.allowsSelfLoops()
            if (r0 != 0) goto L20
            boolean r0 = r4.equals(r5)
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder."
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4)
        L20:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r3.nodeConnections
            java.lang.Object r0 = r0.get(r4)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            if (r0 != 0) goto L2e
            com.google.common.graph.GraphConnections r0 = r3.addNodeInternal(r4)
        L2e:
            java.lang.Object r0 = r0.addSuccessor(r5, r6)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r1 = r3.nodeConnections
            java.lang.Object r1 = r1.get(r5)
            com.google.common.graph.GraphConnections r1 = (com.google.common.graph.GraphConnections) r1
            if (r1 != 0) goto L40
            com.google.common.graph.GraphConnections r1 = r3.addNodeInternal(r5)
        L40:
            r1.addPredecessor(r4, r6)
            if (r0 != 0) goto L4f
            long r4 = r3.edgeCount
            r1 = 1
            long r4 = r4 + r1
            r3.edgeCount = r4
            com.google.common.graph.Graphs.checkPositive(r4)
        L4f:
            return r0
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V removeEdge(com.google.common.graph.EndpointPair<N> r2) {
            r1 = this;
            r1.validateEndpoints(r2)
            java.lang.Object r0 = r2.nodeU()
            java.lang.Object r2 = r2.nodeV()
            java.lang.Object r2 = r1.removeEdge(r0, r2)
            return r2
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V removeEdge(N r5, N r6) {
            r4 = this;
            java.lang.String r0 = "nodeU"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "nodeV"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r4.nodeConnections
            java.lang.Object r0 = r0.get(r5)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r1 = r4.nodeConnections
            java.lang.Object r1 = r1.get(r6)
            com.google.common.graph.GraphConnections r1 = (com.google.common.graph.GraphConnections) r1
            if (r0 == 0) goto L33
            if (r1 != 0) goto L1f
            goto L33
        L1f:
            java.lang.Object r6 = r0.removeSuccessor(r6)
            if (r6 == 0) goto L32
            r1.removePredecessor(r5)
            long r0 = r4.edgeCount
            r2 = 1
            long r0 = r0 - r2
            r4.edgeCount = r0
            com.google.common.graph.Graphs.checkNonNegative(r0)
        L32:
            return r6
        L33:
            r5 = 0
            return r5
    }

    @Override // com.google.common.graph.MutableValueGraph
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public boolean removeNode(N r9) {
            r8 = this;
            java.lang.String r0 = "node"
            com.google.common.base.Preconditions.checkNotNull(r9, r0)
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r8.nodeConnections
            java.lang.Object r0 = r0.get(r9)
            com.google.common.graph.GraphConnections r0 = (com.google.common.graph.GraphConnections) r0
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            boolean r2 = r8.allowsSelfLoops()
            r3 = 1
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.removeSuccessor(r9)
            if (r2 == 0) goto L27
            r0.removePredecessor(r9)
            long r5 = r8.edgeCount
            long r5 = r5 - r3
            r8.edgeCount = r5
        L27:
            java.util.Set r2 = r0.successors()
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r2.next()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r6 = r8.nodeConnections
            java.lang.Object r5 = r6.getWithoutCaching(r5)
            com.google.common.graph.GraphConnections r5 = (com.google.common.graph.GraphConnections) r5
            r5.removePredecessor(r9)
            long r5 = r8.edgeCount
            long r5 = r5 - r3
            r8.edgeCount = r5
            goto L2f
        L4a:
            boolean r2 = r8.isDirected()
            r5 = 1
            if (r2 == 0) goto L7d
            java.util.Set r0 = r0.predecessors()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r0.next()
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r6 = r8.nodeConnections
            java.lang.Object r2 = r6.getWithoutCaching(r2)
            com.google.common.graph.GraphConnections r2 = (com.google.common.graph.GraphConnections) r2
            java.lang.Object r2 = r2.removeSuccessor(r9)
            if (r2 == 0) goto L73
            r2 = 1
            goto L74
        L73:
            r2 = 0
        L74:
            com.google.common.base.Preconditions.checkState(r2)
            long r6 = r8.edgeCount
            long r6 = r6 - r3
            r8.edgeCount = r6
            goto L59
        L7d:
            com.google.common.graph.MapIteratorCache<N, com.google.common.graph.GraphConnections<N, V>> r0 = r8.nodeConnections
            r0.remove(r9)
            long r0 = r8.edgeCount
            com.google.common.graph.Graphs.checkNonNegative(r0)
            return r5
    }
}
