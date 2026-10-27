package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WeightedFairQueueByteDistributor implements io.netty.handler.codec.http2.StreamByteDistributor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_MAX_STATE_ONLY_SIZE = 5;
    static final int INITIAL_CHILDREN_MAP_SIZE = 0;
    private int allocationQuantum;
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private final io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State connectionState;
    private final int maxStateOnlySize;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey stateKey;
    private final io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State> stateOnlyMap;
    private final io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State> stateOnlyRemovalQueue;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ParentChangedEvent {
        final io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State oldParent;
        final io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State state;

        ParentChangedEvent(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r1, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r2) {
                r0 = this;
                r0.<init>()
                r0.state = r1
                r0.oldParent = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class State implements io.netty.util.internal.PriorityQueueNode {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte STATE_IS_ACTIVE = 1;
        private static final byte STATE_IS_DISTRIBUTING = 2;
        private static final byte STATE_STREAM_ACTIVATED = 4;
        int activeCountForTree;
        io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State> children;
        int dependencyTreeDepth;
        private byte flags;
        io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State parent;
        long pseudoTime;
        private final io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State> pseudoTimeQueue;
        private int pseudoTimeQueueIndex;
        long pseudoTimeToWrite;
        private int stateOnlyQueueIndex;
        io.netty.handler.codec.http2.Http2Stream stream;
        final int streamId;
        int streamableBytes;
        final /* synthetic */ io.netty.handler.codec.http2.WeightedFairQueueByteDistributor this$0;
        long totalQueuedWeights;
        short weight;

        static {
                return
        }

        State(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r3, int r4) {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r3, r4, r0, r1)
                return
        }

        State(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r1, int r2, io.netty.handler.codec.http2.Http2Stream r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                io.netty.util.collection.IntObjectMap r1 = io.netty.util.collection.IntCollections.emptyMap()
                r0.children = r1
                r1 = -1
                r0.pseudoTimeQueueIndex = r1
                r0.stateOnlyQueueIndex = r1
                r1 = 16
                r0.weight = r1
                r0.stream = r3
                r0.streamId = r2
                io.netty.util.internal.DefaultPriorityQueue r1 = new io.netty.util.internal.DefaultPriorityQueue
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StatePseudoTimeComparator r2 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StatePseudoTimeComparator.INSTANCE
                r1.<init>(r2, r4)
                r0.pseudoTimeQueue = r1
                return
        }

        State(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r2, io.netty.handler.codec.http2.Http2Stream r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        State(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r2, io.netty.handler.codec.http2.Http2Stream r3, int r4) {
                r1 = this;
                int r0 = r3.id()
                r1.<init>(r2, r0, r3, r4)
                return
        }

        private void initChildren() {
                r2 = this;
                io.netty.util.collection.IntObjectHashMap r0 = new io.netty.util.collection.IntObjectHashMap
                int r1 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.INITIAL_CHILDREN_MAP_SIZE
                r0.<init>(r1)
                r2.children = r0
                return
        }

        private void initChildrenIfEmpty() {
                r2 = this;
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r2.children
                io.netty.util.collection.IntObjectMap r1 = io.netty.util.collection.IntCollections.emptyMap()
                if (r0 != r1) goto Lb
                r2.initChildren()
            Lb:
                return
        }

        private io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State> removeAllChildrenExcept(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4) {
                r3 = this;
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r3.children
                int r4 = r4.streamId
                java.lang.Object r4 = r0.remove(r4)
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r4 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r4
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r3.children
                r3.initChildren()
                if (r4 == 0) goto L18
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r1 = r3.children
                int r2 = r4.streamId
                r1.put(r2, r4)
            L18:
                return r0
        }

        private void setActive() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 | 1
                byte r0 = (byte) r0
                r1.flags = r0
                return
        }

        private void setParent(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r3) {
                r2 = this;
                int r0 = r2.activeCountForTree
                if (r0 == 0) goto L13
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
                if (r0 == 0) goto L13
                r0.removePseudoTimeQueue(r2)
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
                int r1 = r2.activeCountForTree
                int r1 = -r1
                r0.activeCountChangeForTree(r1)
            L13:
                r2.parent = r3
                if (r3 != 0) goto L1b
                r3 = 2147483647(0x7fffffff, float:NaN)
                goto L1f
            L1b:
                int r3 = r3.dependencyTreeDepth
                int r3 = r3 + 1
            L1f:
                r2.dependencyTreeDepth = r3
                return
        }

        private void toString(java.lang.StringBuilder r3) {
                r2 = this;
                java.lang.String r0 = "{streamId "
                r3.append(r0)
                int r0 = r2.streamId
                r3.append(r0)
                java.lang.String r0 = " streamableBytes "
                r3.append(r0)
                int r0 = r2.streamableBytes
                r3.append(r0)
                java.lang.String r0 = " activeCountForTree "
                r3.append(r0)
                int r0 = r2.activeCountForTree
                r3.append(r0)
                java.lang.String r0 = " pseudoTimeQueueIndex "
                r3.append(r0)
                int r0 = r2.pseudoTimeQueueIndex
                r3.append(r0)
                java.lang.String r0 = " pseudoTimeToWrite "
                r3.append(r0)
                long r0 = r2.pseudoTimeToWrite
                r3.append(r0)
                java.lang.String r0 = " pseudoTime "
                r3.append(r0)
                long r0 = r2.pseudoTime
                r3.append(r0)
                java.lang.String r0 = " flags "
                r3.append(r0)
                byte r0 = r2.flags
                r3.append(r0)
                java.lang.String r0 = " pseudoTimeQueue.size() "
                r3.append(r0)
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r2.pseudoTimeQueue
                int r0 = r0.size()
                r3.append(r0)
                java.lang.String r0 = " stateOnlyQueueIndex "
                r3.append(r0)
                int r0 = r2.stateOnlyQueueIndex
                r3.append(r0)
                java.lang.String r0 = " parent.streamId "
                r3.append(r0)
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
                if (r0 != 0) goto L69
                r0 = -1
                goto L6b
            L69:
                int r0 = r0.streamId
            L6b:
                r3.append(r0)
                java.lang.String r0 = "} ["
                r3.append(r0)
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r2.pseudoTimeQueue
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L9f
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r2.pseudoTimeQueue
                java.util.Iterator r0 = r0.iterator()
            L81:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L96
                java.lang.Object r1 = r0.next()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r1
                r1.toString(r3)
                java.lang.String r1 = ", "
                r3.append(r1)
                goto L81
            L96:
                int r0 = r3.length()
                int r0 = r0 + (-2)
                r3.setLength(r0)
            L9f:
                r0 = 93
                r3.append(r0)
                return
        }

        private void unsetActive() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 & (-2)
                byte r0 = (byte) r0
                r1.flags = r0
                return
        }

        void activeCountChangeForTree(int r3) {
                r2 = this;
                int r0 = r2.activeCountForTree
                int r0 = r0 + r3
                r2.activeCountForTree = r0
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = r2.parent
                if (r1 == 0) goto L21
                if (r0 != 0) goto Lf
                r1.removePseudoTimeQueue(r2)
                goto L1c
            Lf:
                if (r0 != r3) goto L1c
                boolean r0 = r2.isDistributing()
                if (r0 != 0) goto L1c
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
                r0.offerAndInitializePseudoTime(r2)
            L1c:
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
                r0.activeCountChangeForTree(r3)
            L21:
                return
        }

        void close() {
                r1 = this;
                r0 = 0
                r1.updateStreamableBytes(r0, r0)
                r0 = 0
                r1.stream = r0
                return
        }

        boolean isActive() {
                r2 = this;
                byte r0 = r2.flags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                return r1
            L7:
                r0 = 0
                return r0
        }

        boolean isDescendantOf(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r2) {
                r1 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r1.parent
            L2:
                if (r0 == 0) goto Lb
                if (r0 != r2) goto L8
                r2 = 1
                return r2
            L8:
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r0.parent
                goto L2
            Lb:
                r2 = 0
                return r2
        }

        boolean isDistributing() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        void offerAndInitializePseudoTime(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r3) {
                r2 = this;
                long r0 = r2.pseudoTime
                r3.pseudoTimeToWrite = r0
                r2.offerPseudoTimeQueue(r3)
                return
        }

        void offerPseudoTimeQueue(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r5) {
                r4 = this;
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r4.pseudoTimeQueue
                r0.offer(r5)
                long r0 = r4.totalQueuedWeights
                short r5 = r5.weight
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.totalQueuedWeights = r0
                return
        }

        io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State peekPseudoTimeQueue() {
                r1 = this;
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r1.pseudoTimeQueue
                java.lang.Object r0 = r0.peek()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r0
                return r0
        }

        io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State pollPseudoTimeQueue() {
                r5 = this;
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r5.pseudoTimeQueue
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r0
                long r1 = r5.totalQueuedWeights
                short r3 = r0.weight
                long r3 = (long) r3
                long r1 = r1 - r3
                r5.totalQueuedWeights = r1
                return r0
        }

        public int priorityQueueIndex(io.netty.util.internal.DefaultPriorityQueue<?> r2) {
                r1 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0 = r1.this$0
                io.netty.util.internal.PriorityQueue r0 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.access$200(r0)
                if (r2 != r0) goto Lb
                int r2 = r1.stateOnlyQueueIndex
                return r2
            Lb:
                int r2 = r1.pseudoTimeQueueIndex
                return r2
        }

        public void priorityQueueIndex(io.netty.util.internal.DefaultPriorityQueue<?> r2, int r3) {
                r1 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0 = r1.this$0
                io.netty.util.internal.PriorityQueue r0 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.access$200(r0)
                if (r2 != r0) goto Lb
                r1.stateOnlyQueueIndex = r3
                return
            Lb:
                r1.pseudoTimeQueueIndex = r3
                return
        }

        void removeChild(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4) {
                r3 = this;
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r3.children
                int r1 = r4.streamId
                java.lang.Object r0 = r0.remove(r1)
                if (r0 == 0) goto L4b
                java.util.ArrayList r0 = new java.util.ArrayList
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r1 = r4.children
                int r1 = r1.size()
                int r1 = r1 + 1
                r0.<init>(r1)
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$ParentChangedEvent r1 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$ParentChangedEvent
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r4.parent
                r1.<init>(r4, r2)
                r0.add(r1)
                r1 = 0
                r4.setParent(r1)
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r4 = r4.children
                java.lang.Iterable r4 = r4.entries()
                java.util.Iterator r4 = r4.iterator()
            L2f:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L46
                java.lang.Object r1 = r4.next()
                io.netty.util.collection.IntObjectMap$PrimitiveEntry r1 = (io.netty.util.collection.IntObjectMap.PrimitiveEntry) r1
                java.lang.Object r1 = r1.value()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r1
                r2 = 0
                r3.takeChild(r4, r1, r2, r0)
                goto L2f
            L46:
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r4 = r3.this$0
                r4.notifyParentChanged(r0)
            L4b:
                return
        }

        void removePseudoTimeQueue(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r5) {
                r4 = this;
                io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r4.pseudoTimeQueue
                boolean r0 = r0.removeTyped(r5)
                if (r0 == 0) goto L10
                long r0 = r4.totalQueuedWeights
                short r5 = r5.weight
                long r2 = (long) r5
                long r0 = r0 - r2
                r4.totalQueuedWeights = r0
            L10:
                return
        }

        void setDistributing() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 | 2
                byte r0 = (byte) r0
                r1.flags = r0
                return
        }

        void setStreamReservedOrActivated() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 | 4
                byte r0 = (byte) r0
                r1.flags = r0
                return
        }

        void takeChild(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r2, boolean r3, java.util.List<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.ParentChangedEvent> r4) {
                r1 = this;
                r0 = 0
                r1.takeChild(r0, r2, r3, r4)
                return
        }

        void takeChild(java.util.Iterator<io.netty.util.collection.IntObjectMap.PrimitiveEntry<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State>> r3, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4, boolean r5, java.util.List<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.ParentChangedEvent> r6) {
                r2 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r4.parent
                if (r0 == r2) goto L2b
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$ParentChangedEvent r1 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$ParentChangedEvent
                r1.<init>(r4, r0)
                r6.add(r1)
                r4.setParent(r2)
                if (r3 == 0) goto L15
                r3.remove()
                goto L1e
            L15:
                if (r0 == 0) goto L1e
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r3 = r0.children
                int r0 = r4.streamId
                r3.remove(r0)
            L1e:
                r2.initChildrenIfEmpty()
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r3 = r2.children
                int r0 = r4.streamId
                java.lang.Object r3 = r3.put(r0, r4)
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r3
            L2b:
                if (r5 == 0) goto L58
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r3 = r2.children
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L58
                io.netty.util.collection.IntObjectMap r3 = r2.removeAllChildrenExcept(r4)
                java.lang.Iterable r3 = r3.entries()
                java.util.Iterator r3 = r3.iterator()
            L41:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L58
                java.lang.Object r5 = r3.next()
                io.netty.util.collection.IntObjectMap$PrimitiveEntry r5 = (io.netty.util.collection.IntObjectMap.PrimitiveEntry) r5
                java.lang.Object r5 = r5.value()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r5 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r5
                r0 = 0
                r4.takeChild(r3, r5, r0, r6)
                goto L41
            L58:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r2.activeCountForTree
                if (r1 <= 0) goto L7
                goto L8
            L7:
                r1 = 1
            L8:
                int r1 = r1 * 256
                r0.<init>(r1)
                r2.toString(r0)
                java.lang.String r0 = r0.toString()
                return r0
        }

        void unsetDistributing() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 & (-3)
                byte r0 = (byte) r0
                r1.flags = r0
                return
        }

        void updatePseudoTime(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r5, int r6, long r7) {
                r4 = this;
                long r0 = r4.pseudoTimeToWrite
                long r2 = r5.pseudoTime
                long r0 = java.lang.Math.min(r0, r2)
                long r5 = (long) r6
                long r5 = r5 * r7
                short r7 = r4.weight
                long r7 = (long) r7
                long r5 = r5 / r7
                long r0 = r0 + r5
                r4.pseudoTimeToWrite = r0
                return
        }

        void updateStreamableBytes(int r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.isActive()
                if (r0 == r3) goto L17
                if (r3 == 0) goto L10
                r3 = 1
                r1.activeCountChangeForTree(r3)
                r1.setActive()
                goto L17
            L10:
                r3 = -1
                r1.activeCountChangeForTree(r3)
                r1.unsetActive()
            L17:
                r1.streamableBytes = r2
                return
        }

        boolean wasStreamReservedOrActivated() {
                r1 = this;
                byte r0 = r1.flags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        void write(int r3, io.netty.handler.codec.http2.StreamByteDistributor.Writer r4) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.Http2Stream r0 = r2.stream     // Catch: java.lang.Throwable -> L6
                r4.write(r0, r3)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r3 = move-exception
                io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "byte distribution write error"
                io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r3, r1, r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StateOnlyComparator implements java.util.Comparator<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State>, java.io.Serializable {
        static final io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StateOnlyComparator INSTANCE = null;
        private static final long serialVersionUID = -4806936913002105966L;

        static {
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StateOnlyComparator r0 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StateOnlyComparator
                r0.<init>()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StateOnlyComparator.INSTANCE = r0
                return
        }

        private StateOnlyComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r3, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4) {
                r2 = this;
                boolean r0 = r3.wasStreamReservedOrActivated()
                boolean r1 = r4.wasStreamReservedOrActivated()
                if (r0 == r1) goto L10
                if (r0 == 0) goto Le
                r3 = -1
                return r3
            Le:
                r3 = 1
                return r3
            L10:
                int r0 = r4.dependencyTreeDepth
                int r1 = r3.dependencyTreeDepth
                int r0 = r0 - r1
                if (r0 == 0) goto L18
                return r0
            L18:
                int r3 = r3.streamId
                int r4 = r4.streamId
                int r3 = r3 - r4
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r1, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r2) {
                r0 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r1
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StatePseudoTimeComparator implements java.util.Comparator<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State>, java.io.Serializable {
        static final io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StatePseudoTimeComparator INSTANCE = null;
        private static final long serialVersionUID = -1437548640227161828L;

        static {
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StatePseudoTimeComparator r0 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StatePseudoTimeComparator
                r0.<init>()
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StatePseudoTimeComparator.INSTANCE = r0
                return
        }

        private StatePseudoTimeComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r3, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4) {
                r2 = this;
                long r0 = r3.pseudoTimeToWrite
                long r3 = r4.pseudoTimeToWrite
                int r3 = io.netty.util.internal.MathUtil.compare(r0, r3)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r1, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r2) {
                r0 = this;
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r1
                io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            java.lang.String r0 = "io.netty.http2.childrenMapSize"
            r1 = 2
            int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.INITIAL_CHILDREN_MAP_SIZE = r0
            return
    }

    public WeightedFairQueueByteDistributor(io.netty.handler.codec.http2.Http2Connection r2) {
            r1 = this;
            r0 = 5
            r1.<init>(r2, r0)
            return
    }

    public WeightedFairQueueByteDistributor(io.netty.handler.codec.http2.Http2Connection r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            r3.allocationQuantum = r0
            java.lang.String r0 = "maxStateOnlySize"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            if (r5 != 0) goto L1b
            io.netty.util.collection.IntObjectMap r0 = io.netty.util.collection.IntCollections.emptyMap()
            r3.stateOnlyMap = r0
            io.netty.util.internal.EmptyPriorityQueue r0 = io.netty.util.internal.EmptyPriorityQueue.instance()
            r3.stateOnlyRemovalQueue = r0
            goto L2d
        L1b:
            io.netty.util.collection.IntObjectHashMap r0 = new io.netty.util.collection.IntObjectHashMap
            r0.<init>(r5)
            r3.stateOnlyMap = r0
            io.netty.util.internal.DefaultPriorityQueue r0 = new io.netty.util.internal.DefaultPriorityQueue
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$StateOnlyComparator r1 = io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.StateOnlyComparator.INSTANCE
            int r2 = r5 + 2
            r0.<init>(r1, r2)
            r3.stateOnlyRemovalQueue = r0
        L2d:
            r3.maxStateOnlySize = r5
            r3.connection = r4
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r5 = r4.newKey()
            r3.stateKey = r5
            io.netty.handler.codec.http2.Http2Stream r0 = r4.connectionStream()
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State
            r2 = 16
            r1.<init>(r3, r0, r2)
            r3.connectionState = r1
            r0.setProperty(r5, r1)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$1 r5 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$1
            r5.<init>(r3)
            r4.addListener(r5)
            return
    }

    static /* synthetic */ io.netty.util.collection.IntObjectMap access$000(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0) {
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r0.stateOnlyMap
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State access$100(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0) {
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r0.connectionState
            return r0
    }

    static /* synthetic */ io.netty.util.internal.PriorityQueue access$200(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0) {
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r0.stateOnlyRemovalQueue
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection.PropertyKey access$300(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0) {
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.stateKey
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State access$400(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0, io.netty.handler.codec.http2.Http2Stream r1) {
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r0.state(r1)
            return r0
    }

    static /* synthetic */ int access$500(io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0) {
            int r0 = r0.maxStateOnlySize
            return r0
    }

    private int distribute(int r2, io.netty.handler.codec.http2.StreamByteDistributor.Writer r3, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r4) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            boolean r0 = r4.isActive()
            if (r0 == 0) goto L1a
            int r0 = r4.streamableBytes
            int r0 = java.lang.Math.min(r2, r0)
            r4.write(r0, r3)
            if (r0 != 0) goto L19
            if (r2 == 0) goto L19
            int r2 = r4.streamableBytes
            r3 = 0
            r4.updateStreamableBytes(r2, r3)
        L19:
            return r0
        L1a:
            int r2 = r1.distributeToChildren(r2, r3, r4)
            return r2
    }

    private int distributeToChildren(int r8, io.netty.handler.codec.http2.StreamByteDistributor.Writer r9, io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State r10) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            long r0 = r10.totalQueuedWeights
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r10.pollPseudoTimeQueue()
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = r10.peekPseudoTimeQueue()
            r2.setDistributing()
            if (r3 != 0) goto L10
            goto L2b
        L10:
            long r3 = r3.pseudoTimeToWrite     // Catch: java.lang.Throwable -> L43
            long r5 = r2.pseudoTimeToWrite     // Catch: java.lang.Throwable -> L43
            long r3 = r3 - r5
            short r5 = r2.weight     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L43
            long r3 = r3 * r5
            long r3 = r3 / r0
            int r5 = r7.allocationQuantum     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L43
            long r3 = r3 + r5
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = java.lang.Math.min(r3, r5)     // Catch: java.lang.Throwable -> L43
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L43
            int r8 = java.lang.Math.min(r8, r4)     // Catch: java.lang.Throwable -> L43
        L2b:
            int r8 = r7.distribute(r8, r9, r2)     // Catch: java.lang.Throwable -> L43
            long r3 = r10.pseudoTime     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r8     // Catch: java.lang.Throwable -> L43
            long r3 = r3 + r5
            r10.pseudoTime = r3     // Catch: java.lang.Throwable -> L43
            r2.updatePseudoTime(r10, r8, r0)     // Catch: java.lang.Throwable -> L43
            r2.unsetDistributing()
            int r9 = r2.activeCountForTree
            if (r9 == 0) goto L42
            r10.offerPseudoTimeQueue(r2)
        L42:
            return r8
        L43:
            r8 = move-exception
            r2.unsetDistributing()
            int r9 = r2.activeCountForTree
            if (r9 == 0) goto L4e
            r10.offerPseudoTimeQueue(r2)
        L4e:
            throw r8
    }

    private io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State state(int r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r2)
            if (r0 == 0) goto Ld
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r1.state(r0)
            return r2
        Ld:
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r1.stateOnlyMap
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r2
            return r2
    }

    private io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State state(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.stateKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r2
            return r2
    }

    public void allocationQuantum(int r2) {
            r1 = this;
            java.lang.String r0 = "allocationQuantum"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.allocationQuantum = r2
            return
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public boolean distribute(int r4, io.netty.handler.codec.http2.StreamByteDistributor.Writer r5) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r3.connectionState
            int r0 = r0.activeCountForTree
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r3.connectionState
            int r2 = r0.activeCountForTree
            int r0 = r3.distributeToChildren(r4, r5, r0)
            int r4 = r4 - r0
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r3.connectionState
            int r0 = r0.activeCountForTree
            if (r0 == 0) goto L1b
            if (r4 > 0) goto L8
            if (r2 != r0) goto L8
        L1b:
            if (r0 == 0) goto L1f
            r4 = 1
            return r4
        L1f:
            return r1
    }

    boolean isChild(int r2, int r3, short r4) {
            r1 = this;
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = r1.state(r3)
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r0 = r3.children
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L1a
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r1.state(r2)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r2.parent
            if (r0 != r3) goto L1a
            short r2 = r2.weight
            if (r2 != r4) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    void notifyParentChanged(java.util.List<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.ParentChangedEvent> r6) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.size()
            if (r0 >= r1) goto L2d
            java.lang.Object r1 = r6.get(r0)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$ParentChangedEvent r1 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.ParentChangedEvent) r1
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r2 = r5.stateOnlyRemovalQueue
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = r1.state
            r2.priorityChanged(r3)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r1.state
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = r2.parent
            if (r3 == 0) goto L2a
            int r4 = r2.activeCountForTree
            if (r4 == 0) goto L2a
            r3.offerAndInitializePseudoTime(r2)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = r1.state
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r2 = r1.parent
            int r1 = r1.activeCountForTree
            r2.activeCountChangeForTree(r1)
        L2a:
            int r0 = r0 + 1
            goto L1
        L2d:
            return
    }

    int numChildren(int r1) {
            r0 = this;
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r1 = r0.state(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r1 = r1.children
            int r1 = r1.size()
            return r1
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public void updateDependencyTree(int r8, int r9, short r10, boolean r11) {
            r7 = this;
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r7.state(r8)
            if (r0 != 0) goto L1b
            int r0 = r7.maxStateOnlySize
            if (r0 != 0) goto Lc
            goto Lb7
        Lc:
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State
            r0.<init>(r7, r8)
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r1 = r7.stateOnlyRemovalQueue
            r1.add(r0)
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r1 = r7.stateOnlyMap
            r1.put(r8, r0)
        L1b:
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r8 = r7.state(r9)
            r1 = 1
            r2 = 0
            if (r8 != 0) goto L45
            int r8 = r7.maxStateOnlySize
            if (r8 != 0) goto L29
            goto Lb7
        L29:
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r8 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State
            r8.<init>(r7, r9)
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r3 = r7.stateOnlyRemovalQueue
            r3.add(r8)
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r3 = r7.stateOnlyMap
            r3.put(r9, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r1)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r3 = r7.connectionState
            r3.takeChild(r8, r2, r9)
            r7.notifyParentChanged(r9)
        L45:
            int r9 = r0.activeCountForTree
            if (r9 == 0) goto L57
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r9 = r0.parent
            if (r9 == 0) goto L57
            long r3 = r9.totalQueuedWeights
            short r5 = r0.weight
            int r5 = r10 - r5
            long r5 = (long) r5
            long r3 = r3 + r5
            r9.totalQueuedWeights = r3
        L57:
            r0.weight = r10
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r9 = r0.parent
            if (r8 != r9) goto L67
            if (r11 == 0) goto L98
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r9 = r8.children
            int r9 = r9.size()
            if (r9 == r1) goto L98
        L67:
            boolean r9 = r8.isDescendantOf(r0)
            if (r9 == 0) goto L84
            java.util.ArrayList r9 = new java.util.ArrayList
            if (r11 == 0) goto L78
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r10 = r8.children
            int r10 = r10.size()
            goto L79
        L78:
            r10 = 0
        L79:
            int r10 = r10 + 2
            r9.<init>(r10)
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r10 = r0.parent
            r10.takeChild(r8, r2, r9)
            goto L92
        L84:
            java.util.ArrayList r9 = new java.util.ArrayList
            if (r11 == 0) goto L8e
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r10 = r8.children
            int r2 = r10.size()
        L8e:
            int r2 = r2 + r1
            r9.<init>(r2)
        L92:
            r8.takeChild(r0, r11, r9)
            r7.notifyParentChanged(r9)
        L98:
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r8 = r7.stateOnlyRemovalQueue
            int r8 = r8.size()
            int r9 = r7.maxStateOnlySize
            if (r8 <= r9) goto Lb7
            io.netty.util.internal.PriorityQueue<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r8 = r7.stateOnlyRemovalQueue
            java.lang.Object r8 = r8.poll()
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r8 = (io.netty.handler.codec.http2.WeightedFairQueueByteDistributor.State) r8
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r9 = r8.parent
            r9.removeChild(r8)
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State> r9 = r7.stateOnlyMap
            int r8 = r8.streamId
            r9.remove(r8)
            goto L98
        Lb7:
            return
    }

    @Override // io.netty.handler.codec.http2.StreamByteDistributor
    public void updateStreamableBytes(io.netty.handler.codec.http2.StreamByteDistributor.StreamState r4) {
            r3 = this;
            io.netty.handler.codec.http2.Http2Stream r0 = r4.stream()
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor$State r0 = r3.state(r0)
            int r1 = io.netty.handler.codec.http2.Http2CodecUtil.streamableBytes(r4)
            boolean r2 = r4.hasFrame()
            if (r2 == 0) goto L1a
            int r4 = r4.windowSize()
            if (r4 < 0) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            r0.updateStreamableBytes(r1, r4)
            return
    }
}
