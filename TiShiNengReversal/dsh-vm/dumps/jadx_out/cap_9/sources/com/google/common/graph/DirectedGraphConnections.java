package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class DirectedGraphConnections<N, V> implements com.google.common.graph.GraphConnections<N, V> {
    private static final java.lang.Object PRED = null;
    private final java.util.Map<N, java.lang.Object> adjacentNodeValues;
    private int predecessorCount;
    private int successorCount;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PredAndSucc {
        private final java.lang.Object successorValue;

        PredAndSucc(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.successorValue = r1
                return
        }

        static /* synthetic */ java.lang.Object access$500(com.google.common.graph.DirectedGraphConnections.PredAndSucc r0) {
                java.lang.Object r0 = r0.successorValue
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.common.graph.DirectedGraphConnections.PRED = r0
            return
    }

    private DirectedGraphConnections(java.util.Map<N, java.lang.Object> r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.Map r0 = (java.util.Map) r0
            r1.adjacentNodeValues = r0
            int r0 = com.google.common.graph.Graphs.checkNonNegative(r3)
            r1.predecessorCount = r0
            int r0 = com.google.common.graph.Graphs.checkNonNegative(r4)
            r1.successorCount = r0
            int r0 = r2.size()
            if (r3 > r0) goto L25
            int r2 = r2.size()
            if (r4 > r2) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            com.google.common.base.Preconditions.checkState(r2)
            return
    }

    static /* synthetic */ java.util.Map access$000(com.google.common.graph.DirectedGraphConnections r0) {
            java.util.Map<N, java.lang.Object> r0 = r0.adjacentNodeValues
            return r0
    }

    static /* synthetic */ boolean access$100(java.lang.Object r0) {
            boolean r0 = isPredecessor(r0)
            return r0
    }

    static /* synthetic */ int access$200(com.google.common.graph.DirectedGraphConnections r0) {
            int r0 = r0.predecessorCount
            return r0
    }

    static /* synthetic */ boolean access$300(java.lang.Object r0) {
            boolean r0 = isSuccessor(r0)
            return r0
    }

    static /* synthetic */ int access$400(com.google.common.graph.DirectedGraphConnections r0) {
            int r0 = r0.successorCount
            return r0
    }

    private static boolean isPredecessor(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r1 == r0) goto Lb
            boolean r1 = r1 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    private static boolean isSuccessor(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r1 == r0) goto L8
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> of() {
            com.google.common.graph.DirectedGraphConnections r0 = new com.google.common.graph.DirectedGraphConnections
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 4
            r1.<init>(r3, r2)
            r2 = 0
            r0.<init>(r1, r2, r2)
            return r0
    }

    static <N, V> com.google.common.graph.DirectedGraphConnections<N, V> ofImmutable(java.util.Set<N> r5, java.util.Map<N, V> r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.putAll(r6)
            java.util.Iterator r1 = r5.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = com.google.common.graph.DirectedGraphConnections.PRED
            java.lang.Object r3 = r0.put(r2, r3)
            if (r3 == 0) goto Lc
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r4 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r4.<init>(r3)
            r0.put(r2, r4)
            goto Lc
        L27:
            com.google.common.graph.DirectedGraphConnections r1 = new com.google.common.graph.DirectedGraphConnections
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            int r5 = r5.size()
            int r6 = r6.size()
            r1.<init>(r0, r5, r6)
            return r1
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N r3, V r4) {
            r2 = this;
            java.util.Map<N, java.lang.Object> r4 = r2.adjacentNodeValues
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            java.lang.Object r4 = r4.put(r3, r0)
            if (r4 != 0) goto L14
            int r3 = r2.predecessorCount
            int r3 = r3 + 1
            r2.predecessorCount = r3
            com.google.common.graph.Graphs.checkPositive(r3)
            return
        L14:
            boolean r1 = r4 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r1 == 0) goto L1e
            java.util.Map<N, java.lang.Object> r0 = r2.adjacentNodeValues
            r0.put(r3, r4)
            return
        L1e:
            if (r4 == r0) goto L33
            java.util.Map<N, java.lang.Object> r0 = r2.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r1 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r1.<init>(r4)
            r0.put(r3, r1)
            int r3 = r2.predecessorCount
            int r3 = r3 + 1
            r2.predecessorCount = r3
            com.google.common.graph.Graphs.checkPositive(r3)
        L33:
            return
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N r4, V r5) {
            r3 = this;
            java.util.Map<N, java.lang.Object> r0 = r3.adjacentNodeValues
            java.lang.Object r0 = r0.put(r4, r5)
            r1 = 0
            if (r0 != 0) goto L13
            int r4 = r3.successorCount
            int r4 = r4 + 1
            r3.successorCount = r4
            com.google.common.graph.Graphs.checkPositive(r4)
            return r1
        L13:
            boolean r2 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r2 == 0) goto L28
            java.util.Map<N, java.lang.Object> r1 = r3.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r2.<init>(r5)
            r1.put(r4, r2)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r4 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$500(r0)
            return r4
        L28:
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r2) goto L40
            java.util.Map<N, java.lang.Object> r0 = r3.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = new com.google.common.graph.DirectedGraphConnections$PredAndSucc
            r2.<init>(r5)
            r0.put(r4, r2)
            int r4 = r3.successorCount
            int r4 = r4 + 1
            r3.successorCount = r4
            com.google.common.graph.Graphs.checkPositive(r4)
            return r1
        L40:
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> adjacentNodes() {
            r1 = this;
            java.util.Map<N, java.lang.Object> r0 = r1.adjacentNodeValues
            java.util.Set r0 = r0.keySet()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> predecessors() {
            r1 = this;
            com.google.common.graph.DirectedGraphConnections$1 r0 = new com.google.common.graph.DirectedGraphConnections$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N r3) {
            r2 = this;
            java.util.Map<N, java.lang.Object> r0 = r2.adjacentNodeValues
            java.lang.Object r0 = r0.get(r3)
            java.lang.Object r1 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r1) goto L19
            java.util.Map<N, java.lang.Object> r0 = r2.adjacentNodeValues
            r0.remove(r3)
            int r3 = r2.predecessorCount
            int r3 = r3 + (-1)
            r2.predecessorCount = r3
            com.google.common.graph.Graphs.checkNonNegative(r3)
            return
        L19:
            boolean r1 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r1 == 0) goto L31
            java.util.Map<N, java.lang.Object> r1 = r2.adjacentNodeValues
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$500(r0)
            r1.put(r3, r0)
            int r3 = r2.predecessorCount
            int r3 = r3 + (-1)
            r2.predecessorCount = r3
            com.google.common.graph.Graphs.checkNonNegative(r3)
        L31:
            return
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(java.lang.Object r4) {
            r3 = this;
            java.util.Map<N, java.lang.Object> r0 = r3.adjacentNodeValues
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L35
            java.lang.Object r1 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r0 != r1) goto Ld
            goto L35
        Ld:
            boolean r2 = r0 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r2 == 0) goto L26
            java.util.Map<N, java.lang.Object> r2 = r3.adjacentNodeValues
            r2.put(r4, r1)
            int r4 = r3.successorCount
            int r4 = r4 + (-1)
            r3.successorCount = r4
            com.google.common.graph.Graphs.checkNonNegative(r4)
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r0 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r0
            java.lang.Object r4 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$500(r0)
            return r4
        L26:
            java.util.Map<N, java.lang.Object> r1 = r3.adjacentNodeValues
            r1.remove(r4)
            int r4 = r3.successorCount
            int r4 = r4 + (-1)
            r3.successorCount = r4
            com.google.common.graph.Graphs.checkNonNegative(r4)
            return r0
        L35:
            r4 = 0
            return r4
    }

    @Override // com.google.common.graph.GraphConnections
    public java.util.Set<N> successors() {
            r1 = this;
            com.google.common.graph.DirectedGraphConnections$2 r0 = new com.google.common.graph.DirectedGraphConnections$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N r2) {
            r1 = this;
            java.util.Map<N, java.lang.Object> r0 = r1.adjacentNodeValues
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r0 = com.google.common.graph.DirectedGraphConnections.PRED
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r0 = r2 instanceof com.google.common.graph.DirectedGraphConnections.PredAndSucc
            if (r0 == 0) goto L16
            com.google.common.graph.DirectedGraphConnections$PredAndSucc r2 = (com.google.common.graph.DirectedGraphConnections.PredAndSucc) r2
            java.lang.Object r2 = com.google.common.graph.DirectedGraphConnections.PredAndSucc.access$500(r2)
        L16:
            return r2
    }
}
