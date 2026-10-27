package com.google.common.graph;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Traverser<N> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.graph.Traverser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class GraphTraverser<N> extends com.google.common.graph.Traverser<N> {
        private final com.google.common.graph.SuccessorsFunction<N> graph;




        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class BreadthFirstIterator extends com.google.common.collect.UnmodifiableIterator<N> {
            private final java.util.Queue<N> queue;
            final /* synthetic */ com.google.common.graph.Traverser.GraphTraverser this$0;
            private final java.util.Set<N> visited;

            BreadthFirstIterator(com.google.common.graph.Traverser.GraphTraverser r2, java.lang.Iterable<? extends N> r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    java.util.ArrayDeque r2 = new java.util.ArrayDeque
                    r2.<init>()
                    r1.queue = r2
                    java.util.HashSet r2 = new java.util.HashSet
                    r2.<init>()
                    r1.visited = r2
                    java.util.Iterator r2 = r3.iterator()
                L17:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L2f
                    java.lang.Object r3 = r2.next()
                    java.util.Set<N> r0 = r1.visited
                    boolean r0 = r0.add(r3)
                    if (r0 == 0) goto L17
                    java.util.Queue<N> r0 = r1.queue
                    r0.add(r3)
                    goto L17
                L2f:
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Queue<N> r0 = r1.queue
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.Iterator
            public N next() {
                    r4 = this;
                    java.util.Queue<N> r0 = r4.queue
                    java.lang.Object r0 = r0.remove()
                    com.google.common.graph.Traverser$GraphTraverser r1 = r4.this$0
                    com.google.common.graph.SuccessorsFunction r1 = com.google.common.graph.Traverser.GraphTraverser.access$100(r1)
                    java.lang.Iterable r1 = r1.successors(r0)
                    java.util.Iterator r1 = r1.iterator()
                L14:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L2c
                    java.lang.Object r2 = r1.next()
                    java.util.Set<N> r3 = r4.visited
                    boolean r3 = r3.add(r2)
                    if (r3 == 0) goto L14
                    java.util.Queue<N> r3 = r4.queue
                    r3.add(r2)
                    goto L14
                L2c:
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class DepthFirstIterator extends com.google.common.collect.AbstractIterator<N> {
            private final com.google.common.graph.Traverser.Order order;
            private final java.util.Deque<com.google.common.graph.Traverser.GraphTraverser<N>.DepthFirstIterator.NodeAndSuccessors> stack;
            final /* synthetic */ com.google.common.graph.Traverser.GraphTraverser this$0;
            private final java.util.Set<N> visited;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private final class NodeAndSuccessors {

                @org.checkerframework.checker.nullness.compatqual.NullableDecl
                final N node;
                final java.util.Iterator<? extends N> successorIterator;
                final /* synthetic */ com.google.common.graph.Traverser.GraphTraverser.DepthFirstIterator this$1;

                NodeAndSuccessors(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.graph.Traverser.GraphTraverser.DepthFirstIterator r1, N r2, java.lang.Iterable<? extends N> r3) {
                        r0 = this;
                        r0.this$1 = r1
                        r0.<init>()
                        r0.node = r2
                        java.util.Iterator r1 = r3.iterator()
                        r0.successorIterator = r1
                        return
                }
            }

            DepthFirstIterator(com.google.common.graph.Traverser.GraphTraverser r3, java.lang.Iterable<? extends N> r4, com.google.common.graph.Traverser.Order r5) {
                    r2 = this;
                    r2.this$0 = r3
                    r2.<init>()
                    java.util.ArrayDeque r3 = new java.util.ArrayDeque
                    r3.<init>()
                    r2.stack = r3
                    java.util.HashSet r0 = new java.util.HashSet
                    r0.<init>()
                    r2.visited = r0
                    com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors r0 = new com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors
                    r1 = 0
                    r0.<init>(r2, r1, r4)
                    r3.push(r0)
                    r2.order = r5
                    return
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
                    r4 = this;
                L0:
                    java.util.Deque<com.google.common.graph.Traverser$GraphTraverser<N>$DepthFirstIterator$NodeAndSuccessors> r0 = r4.stack
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto Ld
                    java.lang.Object r0 = r4.endOfData()
                    return r0
                Ld:
                    java.util.Deque<com.google.common.graph.Traverser$GraphTraverser<N>$DepthFirstIterator$NodeAndSuccessors> r0 = r4.stack
                    java.lang.Object r0 = r0.getFirst()
                    com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors r0 = (com.google.common.graph.Traverser.GraphTraverser.DepthFirstIterator.NodeAndSuccessors) r0
                    java.util.Set<N> r1 = r4.visited
                    N r2 = r0.node
                    boolean r1 = r1.add(r2)
                    java.util.Iterator<? extends N> r2 = r0.successorIterator
                    boolean r2 = r2.hasNext()
                    if (r1 == 0) goto L2b
                    com.google.common.graph.Traverser$Order r1 = r4.order
                    com.google.common.graph.Traverser$Order r3 = com.google.common.graph.Traverser.Order.PREORDER
                    if (r1 == r3) goto L33
                L2b:
                    if (r2 != 0) goto L35
                    com.google.common.graph.Traverser$Order r1 = r4.order
                    com.google.common.graph.Traverser$Order r3 = com.google.common.graph.Traverser.Order.POSTORDER
                    if (r1 != r3) goto L35
                L33:
                    r1 = 1
                    goto L36
                L35:
                    r1 = 0
                L36:
                    if (r2 != 0) goto L3e
                    java.util.Deque<com.google.common.graph.Traverser$GraphTraverser<N>$DepthFirstIterator$NodeAndSuccessors> r2 = r4.stack
                    r2.pop()
                    goto L55
                L3e:
                    java.util.Iterator<? extends N> r2 = r0.successorIterator
                    java.lang.Object r2 = r2.next()
                    java.util.Set<N> r3 = r4.visited
                    boolean r3 = r3.contains(r2)
                    if (r3 != 0) goto L55
                    java.util.Deque<com.google.common.graph.Traverser$GraphTraverser<N>$DepthFirstIterator$NodeAndSuccessors> r3 = r4.stack
                    com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors r2 = r4.withSuccessors(r2)
                    r3.push(r2)
                L55:
                    if (r1 == 0) goto L0
                    N r0 = r0.node
                    if (r0 == 0) goto L0
                    return r0
            }

            com.google.common.graph.Traverser.GraphTraverser<N>.DepthFirstIterator.NodeAndSuccessors withSuccessors(N r3) {
                    r2 = this;
                    com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors r0 = new com.google.common.graph.Traverser$GraphTraverser$DepthFirstIterator$NodeAndSuccessors
                    com.google.common.graph.Traverser$GraphTraverser r1 = r2.this$0
                    com.google.common.graph.SuccessorsFunction r1 = com.google.common.graph.Traverser.GraphTraverser.access$100(r1)
                    java.lang.Iterable r1 = r1.successors(r3)
                    r0.<init>(r2, r3, r1)
                    return r0
            }
        }

        GraphTraverser(com.google.common.graph.SuccessorsFunction<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.graph.SuccessorsFunction r2 = (com.google.common.graph.SuccessorsFunction) r2
                r1.graph = r2
                return
        }

        static /* synthetic */ com.google.common.graph.SuccessorsFunction access$100(com.google.common.graph.Traverser.GraphTraverser r0) {
                com.google.common.graph.SuccessorsFunction<N> r0 = r0.graph
                return r0
        }

        private void checkThatNodeIsInGraph(N r2) {
                r1 = this;
                com.google.common.graph.SuccessorsFunction<N> r0 = r1.graph
                r0.successors(r2)
                return
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInGraph(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$GraphTraverser$1 r0 = new com.google.common.graph.Traverser$GraphTraverser$1
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> breadthFirst(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.breadthFirst(r1)
                return r1
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInGraph(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$GraphTraverser$3 r0 = new com.google.common.graph.Traverser$GraphTraverser$3
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPostOrder(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.depthFirstPostOrder(r1)
                return r1
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInGraph(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$GraphTraverser$2 r0 = new com.google.common.graph.Traverser$GraphTraverser$2
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPreOrder(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.depthFirstPreOrder(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum Order extends java.lang.Enum<com.google.common.graph.Traverser.Order> {
        private static final /* synthetic */ com.google.common.graph.Traverser.Order[] $VALUES = null;
        public static final com.google.common.graph.Traverser.Order POSTORDER = null;
        public static final com.google.common.graph.Traverser.Order PREORDER = null;

        static {
                com.google.common.graph.Traverser$Order r0 = new com.google.common.graph.Traverser$Order
                java.lang.String r1 = "PREORDER"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.graph.Traverser.Order.PREORDER = r0
                com.google.common.graph.Traverser$Order r1 = new com.google.common.graph.Traverser$Order
                java.lang.String r3 = "POSTORDER"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.graph.Traverser.Order.POSTORDER = r1
                r3 = 2
                com.google.common.graph.Traverser$Order[] r3 = new com.google.common.graph.Traverser.Order[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.graph.Traverser.Order.$VALUES = r3
                return
        }

        Order(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.graph.Traverser.Order valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.graph.Traverser$Order> r0 = com.google.common.graph.Traverser.Order.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.graph.Traverser$Order r1 = (com.google.common.graph.Traverser.Order) r1
                return r1
        }

        public static com.google.common.graph.Traverser.Order[] values() {
                com.google.common.graph.Traverser$Order[] r0 = com.google.common.graph.Traverser.Order.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.graph.Traverser$Order[] r0 = (com.google.common.graph.Traverser.Order[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TreeTraverser<N> extends com.google.common.graph.Traverser<N> {
        private final com.google.common.graph.SuccessorsFunction<N> tree;




        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class BreadthFirstIterator extends com.google.common.collect.UnmodifiableIterator<N> {
            private final java.util.Queue<N> queue;
            final /* synthetic */ com.google.common.graph.Traverser.TreeTraverser this$0;

            BreadthFirstIterator(com.google.common.graph.Traverser.TreeTraverser r2, java.lang.Iterable<? extends N> r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    java.util.ArrayDeque r2 = new java.util.ArrayDeque
                    r2.<init>()
                    r1.queue = r2
                    java.util.Iterator r2 = r3.iterator()
                L10:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L20
                    java.lang.Object r3 = r2.next()
                    java.util.Queue<N> r0 = r1.queue
                    r0.add(r3)
                    goto L10
                L20:
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Queue<N> r0 = r1.queue
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.Iterator
            public N next() {
                    r3 = this;
                    java.util.Queue<N> r0 = r3.queue
                    java.lang.Object r0 = r0.remove()
                    java.util.Queue<N> r1 = r3.queue
                    com.google.common.graph.Traverser$TreeTraverser r2 = r3.this$0
                    com.google.common.graph.SuccessorsFunction r2 = com.google.common.graph.Traverser.TreeTraverser.access$200(r2)
                    java.lang.Iterable r2 = r2.successors(r0)
                    com.google.common.collect.Iterables.addAll(r1, r2)
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class DepthFirstPostOrderIterator extends com.google.common.collect.AbstractIterator<N> {
            private final java.util.ArrayDeque<com.google.common.graph.Traverser.TreeTraverser<N>.DepthFirstPostOrderIterator.NodeAndChildren> stack;
            final /* synthetic */ com.google.common.graph.Traverser.TreeTraverser this$0;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private final class NodeAndChildren {
                final java.util.Iterator<? extends N> childIterator;

                @org.checkerframework.checker.nullness.compatqual.NullableDecl
                final N node;
                final /* synthetic */ com.google.common.graph.Traverser.TreeTraverser.DepthFirstPostOrderIterator this$1;

                NodeAndChildren(@org.checkerframework.checker.nullness.compatqual.NullableDecl com.google.common.graph.Traverser.TreeTraverser.DepthFirstPostOrderIterator r1, N r2, java.lang.Iterable<? extends N> r3) {
                        r0 = this;
                        r0.this$1 = r1
                        r0.<init>()
                        r0.node = r2
                        java.util.Iterator r1 = r3.iterator()
                        r0.childIterator = r1
                        return
                }
            }

            DepthFirstPostOrderIterator(com.google.common.graph.Traverser.TreeTraverser r3, java.lang.Iterable<? extends N> r4) {
                    r2 = this;
                    r2.this$0 = r3
                    r2.<init>()
                    java.util.ArrayDeque r3 = new java.util.ArrayDeque
                    r3.<init>()
                    r2.stack = r3
                    com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren r0 = new com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren
                    r1 = 0
                    r0.<init>(r2, r1, r4)
                    r3.addLast(r0)
                    return
            }

            @Override // com.google.common.collect.AbstractIterator
            protected N computeNext() {
                    r2 = this;
                L0:
                    java.util.ArrayDeque<com.google.common.graph.Traverser$TreeTraverser<N>$DepthFirstPostOrderIterator$NodeAndChildren> r0 = r2.stack
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L32
                    java.util.ArrayDeque<com.google.common.graph.Traverser$TreeTraverser<N>$DepthFirstPostOrderIterator$NodeAndChildren> r0 = r2.stack
                    java.lang.Object r0 = r0.getLast()
                    com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren r0 = (com.google.common.graph.Traverser.TreeTraverser.DepthFirstPostOrderIterator.NodeAndChildren) r0
                    java.util.Iterator<? extends N> r1 = r0.childIterator
                    boolean r1 = r1.hasNext()
                    if (r1 == 0) goto L28
                    java.util.Iterator<? extends N> r0 = r0.childIterator
                    java.lang.Object r0 = r0.next()
                    java.util.ArrayDeque<com.google.common.graph.Traverser$TreeTraverser<N>$DepthFirstPostOrderIterator$NodeAndChildren> r1 = r2.stack
                    com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren r0 = r2.withChildren(r0)
                    r1.addLast(r0)
                    goto L0
                L28:
                    java.util.ArrayDeque<com.google.common.graph.Traverser$TreeTraverser<N>$DepthFirstPostOrderIterator$NodeAndChildren> r1 = r2.stack
                    r1.removeLast()
                    N r0 = r0.node
                    if (r0 == 0) goto L0
                    return r0
                L32:
                    java.lang.Object r0 = r2.endOfData()
                    return r0
            }

            com.google.common.graph.Traverser.TreeTraverser<N>.DepthFirstPostOrderIterator.NodeAndChildren withChildren(N r3) {
                    r2 = this;
                    com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren r0 = new com.google.common.graph.Traverser$TreeTraverser$DepthFirstPostOrderIterator$NodeAndChildren
                    com.google.common.graph.Traverser$TreeTraverser r1 = r2.this$0
                    com.google.common.graph.SuccessorsFunction r1 = com.google.common.graph.Traverser.TreeTraverser.access$200(r1)
                    java.lang.Iterable r1 = r1.successors(r3)
                    r0.<init>(r2, r3, r1)
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class DepthFirstPreOrderIterator extends com.google.common.collect.UnmodifiableIterator<N> {
            private final java.util.Deque<java.util.Iterator<? extends N>> stack;
            final /* synthetic */ com.google.common.graph.Traverser.TreeTraverser this$0;

            DepthFirstPreOrderIterator(com.google.common.graph.Traverser.TreeTraverser r1, java.lang.Iterable<? extends N> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    java.util.ArrayDeque r1 = new java.util.ArrayDeque
                    r1.<init>()
                    r0.stack = r1
                    java.util.Iterator r2 = r2.iterator()
                    r1.addLast(r2)
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Deque<java.util.Iterator<? extends N>> r0 = r1.stack
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ 1
                    return r0
            }

            @Override // java.util.Iterator
            public N next() {
                    r3 = this;
                    java.util.Deque<java.util.Iterator<? extends N>> r0 = r3.stack
                    java.lang.Object r0 = r0.getLast()
                    java.util.Iterator r0 = (java.util.Iterator) r0
                    java.lang.Object r1 = r0.next()
                    java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                    boolean r0 = r0.hasNext()
                    if (r0 != 0) goto L1b
                    java.util.Deque<java.util.Iterator<? extends N>> r0 = r3.stack
                    r0.removeLast()
                L1b:
                    com.google.common.graph.Traverser$TreeTraverser r0 = r3.this$0
                    com.google.common.graph.SuccessorsFunction r0 = com.google.common.graph.Traverser.TreeTraverser.access$200(r0)
                    java.lang.Iterable r0 = r0.successors(r1)
                    java.util.Iterator r0 = r0.iterator()
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L34
                    java.util.Deque<java.util.Iterator<? extends N>> r2 = r3.stack
                    r2.addLast(r0)
                L34:
                    return r1
            }
        }

        TreeTraverser(com.google.common.graph.SuccessorsFunction<N> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.graph.SuccessorsFunction r2 = (com.google.common.graph.SuccessorsFunction) r2
                r1.tree = r2
                return
        }

        static /* synthetic */ com.google.common.graph.SuccessorsFunction access$200(com.google.common.graph.Traverser.TreeTraverser r0) {
                com.google.common.graph.SuccessorsFunction<N> r0 = r0.tree
                return r0
        }

        private void checkThatNodeIsInTree(N r2) {
                r1 = this;
                com.google.common.graph.SuccessorsFunction<N> r0 = r1.tree
                r0.successors(r2)
                return
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInTree(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$TreeTraverser$1 r0 = new com.google.common.graph.Traverser$TreeTraverser$1
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> breadthFirst(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.breadthFirst(r1)
                return r1
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInTree(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$TreeTraverser$3 r0 = new com.google.common.graph.Traverser$TreeTraverser$3
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPostOrder(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.depthFirstPostOrder(r1)
                return r1
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> r3) {
                r2 = this;
                com.google.common.base.Preconditions.checkNotNull(r3)
                boolean r0 = com.google.common.collect.Iterables.isEmpty(r3)
                if (r0 == 0) goto Le
                com.google.common.collect.ImmutableSet r3 = com.google.common.collect.ImmutableSet.of()
                return r3
            Le:
                java.util.Iterator r0 = r3.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                r2.checkThatNodeIsInTree(r1)
                goto L12
            L20:
                com.google.common.graph.Traverser$TreeTraverser$2 r0 = new com.google.common.graph.Traverser$TreeTraverser$2
                r0.<init>(r2, r3)
                return r0
        }

        @Override // com.google.common.graph.Traverser
        public java.lang.Iterable<N> depthFirstPreOrder(N r1) {
                r0 = this;
                com.google.common.base.Preconditions.checkNotNull(r1)
                com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.of(r1)
                java.lang.Iterable r1 = r0.depthFirstPreOrder(r1)
                return r1
        }
    }

    private Traverser() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ Traverser(com.google.common.graph.Traverser.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static <N> com.google.common.graph.Traverser<N> forGraph(com.google.common.graph.SuccessorsFunction<N> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.graph.Traverser$GraphTraverser r0 = new com.google.common.graph.Traverser$GraphTraverser
            r0.<init>(r1)
            return r0
    }

    public static <N> com.google.common.graph.Traverser<N> forTree(com.google.common.graph.SuccessorsFunction<N> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r2 instanceof com.google.common.graph.BaseGraph
            if (r0 == 0) goto L13
            r0 = r2
            com.google.common.graph.BaseGraph r0 = (com.google.common.graph.BaseGraph) r0
            boolean r0 = r0.isDirected()
            java.lang.String r1 = "Undirected graphs can never be trees."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
        L13:
            boolean r0 = r2 instanceof com.google.common.graph.Network
            if (r0 == 0) goto L23
            r0 = r2
            com.google.common.graph.Network r0 = (com.google.common.graph.Network) r0
            boolean r0 = r0.isDirected()
            java.lang.String r1 = "Undirected networks can never be trees."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
        L23:
            com.google.common.graph.Traverser$TreeTraverser r0 = new com.google.common.graph.Traverser$TreeTraverser
            r0.<init>(r2)
            return r0
    }

    public abstract java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> r1);

    public abstract java.lang.Iterable<N> breadthFirst(N r1);

    public abstract java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> r1);

    public abstract java.lang.Iterable<N> depthFirstPostOrder(N r1);

    public abstract java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> r1);

    public abstract java.lang.Iterable<N> depthFirstPreOrder(N r1);
}
