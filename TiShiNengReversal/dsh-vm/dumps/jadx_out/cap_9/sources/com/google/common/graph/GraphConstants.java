package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class GraphConstants {
    static final int DEFAULT_EDGE_COUNT = 20;
    static final int DEFAULT_NODE_COUNT = 10;
    static final java.lang.String EDGE_ALREADY_EXISTS = "Edge %s already exists in the graph.";
    static final java.lang.String EDGE_NOT_IN_GRAPH = "Edge %s is not an element of this graph.";
    static final java.lang.String ENDPOINTS_MISMATCH = "Mismatch: unordered endpoints cannot be used with directed graphs";
    static final int EXPECTED_DEGREE = 2;
    static final int INNER_CAPACITY = 2;
    static final float INNER_LOAD_FACTOR = 1.0f;
    static final java.lang.String MULTIPLE_EDGES_CONNECTING = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";
    static final java.lang.String NODE_NOT_IN_GRAPH = "Node %s is not an element of this graph.";
    static final java.lang.String NOT_AVAILABLE_ON_UNDIRECTED = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";
    static final java.lang.String PARALLEL_EDGES_NOT_ALLOWED = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";
    static final java.lang.String REUSING_EDGE = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";
    static final java.lang.String SELF_LOOPS_NOT_ALLOWED = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Presence extends java.lang.Enum<com.google.common.graph.GraphConstants.Presence> {
        private static final /* synthetic */ com.google.common.graph.GraphConstants.Presence[] $VALUES = null;
        public static final com.google.common.graph.GraphConstants.Presence EDGE_EXISTS = null;

        static {
                com.google.common.graph.GraphConstants$Presence r0 = new com.google.common.graph.GraphConstants$Presence
                java.lang.String r1 = "EDGE_EXISTS"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.graph.GraphConstants.Presence.EDGE_EXISTS = r0
                r1 = 1
                com.google.common.graph.GraphConstants$Presence[] r1 = new com.google.common.graph.GraphConstants.Presence[r1]
                r1[r2] = r0
                com.google.common.graph.GraphConstants.Presence.$VALUES = r1
                return
        }

        Presence(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.GraphConstants.Presence valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.GraphConstants$Presence> r0 = com.google.common.graph.GraphConstants.Presence.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.GraphConstants$Presence r1 = (com.google.common.graph.GraphConstants.Presence) r1
                return r1
        }

        public static com.google.common.graph.GraphConstants.Presence[] values() {
                com.google.common.graph.GraphConstants$Presence[] r0 = com.google.common.graph.GraphConstants.Presence.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.GraphConstants$Presence[] r0 = (com.google.common.graph.GraphConstants.Presence[]) r0
                return r0
        }
    }

    private GraphConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
