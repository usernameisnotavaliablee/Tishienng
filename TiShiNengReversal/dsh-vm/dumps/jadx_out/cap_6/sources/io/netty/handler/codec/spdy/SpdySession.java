package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SpdySession {
    private final java.util.concurrent.atomic.AtomicInteger activeLocalStreams;
    private final java.util.concurrent.atomic.AtomicInteger activeRemoteStreams;
    private final java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession.StreamState> activeStreams;
    private final java.util.concurrent.atomic.AtomicInteger receiveWindowSize;
    private final java.util.concurrent.atomic.AtomicInteger sendWindowSize;
    private final io.netty.handler.codec.spdy.SpdySession.StreamComparator streamComparator;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class PendingWrite {
        final io.netty.channel.ChannelPromise promise;
        final io.netty.handler.codec.spdy.SpdyDataFrame spdyDataFrame;

        PendingWrite(io.netty.handler.codec.spdy.SpdyDataFrame r1, io.netty.channel.ChannelPromise r2) {
                r0 = this;
                r0.<init>()
                r0.spdyDataFrame = r1
                r0.promise = r2
                return
        }

        void fail(java.lang.Throwable r2) {
                r1 = this;
                io.netty.handler.codec.spdy.SpdyDataFrame r0 = r1.spdyDataFrame
                r0.release()
                io.netty.channel.ChannelPromise r0 = r1.promise
                r0.setFailure(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class StreamComparator implements java.util.Comparator<java.lang.Integer> {
        final /* synthetic */ io.netty.handler.codec.spdy.SpdySession this$0;

        StreamComparator(io.netty.handler.codec.spdy.SpdySession r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.lang.Integer r3, java.lang.Integer r4) {
                r2 = this;
                io.netty.handler.codec.spdy.SpdySession r0 = r2.this$0
                java.util.Map r0 = io.netty.handler.codec.spdy.SpdySession.access$000(r0)
                java.lang.Object r0 = r0.get(r3)
                io.netty.handler.codec.spdy.SpdySession$StreamState r0 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r0
                io.netty.handler.codec.spdy.SpdySession r1 = r2.this$0
                java.util.Map r1 = io.netty.handler.codec.spdy.SpdySession.access$000(r1)
                java.lang.Object r1 = r1.get(r4)
                io.netty.handler.codec.spdy.SpdySession$StreamState r1 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r1
                byte r0 = r0.getPriority()
                byte r1 = r1.getPriority()
                int r0 = r0 - r1
                if (r0 == 0) goto L24
                return r0
            L24:
                int r3 = r3.intValue()
                int r4 = r4.intValue()
                int r3 = r3 - r4
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Integer r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StreamState {
        private boolean localSideClosed;
        private final java.util.Queue<io.netty.handler.codec.spdy.SpdySession.PendingWrite> pendingWriteQueue;
        private final byte priority;
        private final java.util.concurrent.atomic.AtomicInteger receiveWindowSize;
        private int receiveWindowSizeLowerBound;
        private boolean receivedReply;
        private boolean remoteSideClosed;
        private final java.util.concurrent.atomic.AtomicInteger sendWindowSize;

        StreamState(byte r2, boolean r3, boolean r4, int r5, int r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                r1.pendingWriteQueue = r0
                r1.priority = r2
                r1.remoteSideClosed = r3
                r1.localSideClosed = r4
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>(r5)
                r1.sendWindowSize = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>(r6)
                r1.receiveWindowSize = r2
                return
        }

        void clearPendingWrites(java.lang.Throwable r2) {
                r1 = this;
            L0:
                java.util.Queue<io.netty.handler.codec.spdy.SpdySession$PendingWrite> r0 = r1.pendingWriteQueue
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.spdy.SpdySession$PendingWrite r0 = (io.netty.handler.codec.spdy.SpdySession.PendingWrite) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                r0.fail(r2)
                goto L0
        }

        void closeLocalSide() {
                r1 = this;
                r0 = 1
                r1.localSideClosed = r0
                return
        }

        void closeRemoteSide() {
                r1 = this;
                r0 = 1
                r1.remoteSideClosed = r0
                return
        }

        io.netty.handler.codec.spdy.SpdySession.PendingWrite getPendingWrite() {
                r1 = this;
                java.util.Queue<io.netty.handler.codec.spdy.SpdySession$PendingWrite> r0 = r1.pendingWriteQueue
                java.lang.Object r0 = r0.peek()
                io.netty.handler.codec.spdy.SpdySession$PendingWrite r0 = (io.netty.handler.codec.spdy.SpdySession.PendingWrite) r0
                return r0
        }

        byte getPriority() {
                r1 = this;
                byte r0 = r1.priority
                return r0
        }

        int getReceiveWindowSizeLowerBound() {
                r1 = this;
                int r0 = r1.receiveWindowSizeLowerBound
                return r0
        }

        int getSendWindowSize() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.sendWindowSize
                int r0 = r0.get()
                return r0
        }

        boolean hasReceivedReply() {
                r1 = this;
                boolean r0 = r1.receivedReply
                return r0
        }

        boolean isLocalSideClosed() {
                r1 = this;
                boolean r0 = r1.localSideClosed
                return r0
        }

        boolean isRemoteSideClosed() {
                r1 = this;
                boolean r0 = r1.remoteSideClosed
                return r0
        }

        boolean putPendingWrite(io.netty.handler.codec.spdy.SpdySession.PendingWrite r2) {
                r1 = this;
                java.util.Queue<io.netty.handler.codec.spdy.SpdySession$PendingWrite> r0 = r1.pendingWriteQueue
                boolean r2 = r0.offer(r2)
                return r2
        }

        void receivedReply() {
                r1 = this;
                r0 = 1
                r1.receivedReply = r0
                return
        }

        io.netty.handler.codec.spdy.SpdySession.PendingWrite removePendingWrite() {
                r1 = this;
                java.util.Queue<io.netty.handler.codec.spdy.SpdySession$PendingWrite> r0 = r1.pendingWriteQueue
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.spdy.SpdySession$PendingWrite r0 = (io.netty.handler.codec.spdy.SpdySession.PendingWrite) r0
                return r0
        }

        void setReceiveWindowSizeLowerBound(int r1) {
                r0 = this;
                r0.receiveWindowSizeLowerBound = r1
                return
        }

        int updateReceiveWindowSize(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.receiveWindowSize
                int r2 = r0.addAndGet(r2)
                return r2
        }

        int updateSendWindowSize(int r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.sendWindowSize
                int r2 = r0.addAndGet(r2)
                return r2
        }
    }

    SpdySession(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.activeLocalStreams = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.activeRemoteStreams = r0
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.activeStreams = r0
            io.netty.handler.codec.spdy.SpdySession$StreamComparator r0 = new io.netty.handler.codec.spdy.SpdySession$StreamComparator
            r0.<init>(r1)
            r1.streamComparator = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r2)
            r1.sendWindowSize = r0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r3)
            r1.receiveWindowSize = r2
            return
    }

    static /* synthetic */ java.util.Map access$000(io.netty.handler.codec.spdy.SpdySession r0) {
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r0.activeStreams
            return r0
    }

    private io.netty.handler.codec.spdy.SpdySession.StreamState removeActiveStream(int r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.remove(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L1b
            if (r3 == 0) goto L16
            java.util.concurrent.atomic.AtomicInteger r3 = r1.activeRemoteStreams
            r3.decrementAndGet()
            return r2
        L16:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.activeLocalStreams
            r3.decrementAndGet()
        L1b:
            return r2
    }

    void acceptStream(int r8, byte r9, boolean r10, boolean r11, int r12, int r13, boolean r14) {
            r7 = this;
            if (r10 == 0) goto L4
            if (r11 != 0) goto L29
        L4:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r7.activeStreams
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            io.netty.handler.codec.spdy.SpdySession$StreamState r1 = new io.netty.handler.codec.spdy.SpdySession$StreamState
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r0.put(r8, r1)
            io.netty.handler.codec.spdy.SpdySession$StreamState r8 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r8
            if (r8 != 0) goto L29
            if (r14 == 0) goto L24
            java.util.concurrent.atomic.AtomicInteger r8 = r7.activeRemoteStreams
            r8.incrementAndGet()
            return
        L24:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.activeLocalStreams
            r8.incrementAndGet()
        L29:
            return
    }

    java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession.StreamState> activeStreams() {
            r2 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            io.netty.handler.codec.spdy.SpdySession$StreamComparator r1 = r2.streamComparator
            r0.<init>(r1)
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r1 = r2.activeStreams
            r0.putAll(r1)
            return r0
    }

    void closeLocalSide(int r3, boolean r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r2.activeStreams
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.spdy.SpdySession$StreamState r0 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r0
            if (r0 == 0) goto L1a
            r0.closeLocalSide()
            boolean r0 = r0.isRemoteSideClosed()
            if (r0 == 0) goto L1a
            r2.removeActiveStream(r3, r4)
        L1a:
            return
    }

    void closeRemoteSide(int r3, boolean r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r2.activeStreams
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            io.netty.handler.codec.spdy.SpdySession$StreamState r0 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r0
            if (r0 == 0) goto L1a
            r0.closeRemoteSide()
            boolean r0 = r0.isLocalSideClosed()
            if (r0 == 0) goto L1a
            r2.removeActiveStream(r3, r4)
        L1a:
            return
    }

    io.netty.handler.codec.spdy.SpdySession.PendingWrite getPendingWrite(int r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L2f
            java.util.Map r4 = r3.activeStreams()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            io.netty.handler.codec.spdy.SpdySession$StreamState r1 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r1
            int r2 = r1.getSendWindowSize()
            if (r2 <= 0) goto Lf
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r1 = r1.getPendingWrite()
            if (r1 == 0) goto Lf
            return r1
        L2e:
            return r0
        L2f:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r1 = r3.activeStreams
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.get(r4)
            io.netty.handler.codec.spdy.SpdySession$StreamState r4 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r4
            if (r4 == 0) goto L42
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r4 = r4.getPendingWrite()
            return r4
        L42:
            return r0
    }

    int getReceiveWindowSizeLowerBound(int r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r1 = r2.activeStreams
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            io.netty.handler.codec.spdy.SpdySession$StreamState r3 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r3
            if (r3 == 0) goto L17
            int r3 = r3.getReceiveWindowSizeLowerBound()
            return r3
        L17:
            return r0
    }

    int getSendWindowSize(int r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r2 = r1.sendWindowSize
            int r2 = r2.get()
            return r2
        L9:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L1c
            int r2 = r2.getSendWindowSize()
            return r2
        L1c:
            r2 = -1
            return r2
    }

    boolean hasReceivedReply(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L16
            boolean r2 = r2.hasReceivedReply()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    boolean isActiveStream(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    boolean isLocalSideClosed(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L17
            boolean r2 = r2.isLocalSideClosed()
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    boolean isRemoteSideClosed(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L17
            boolean r2 = r2.isRemoteSideClosed()
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    boolean noActiveStreams() {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            boolean r0 = r0.isEmpty()
            return r0
    }

    int numActiveStreams(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r1 = r0.activeRemoteStreams
            int r1 = r1.get()
            return r1
        L9:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.activeLocalStreams
            int r1 = r1.get()
            return r1
    }

    boolean putPendingWrite(int r2, io.netty.handler.codec.spdy.SpdySession.PendingWrite r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L16
            boolean r2 = r2.putPendingWrite(r3)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    void receivedReply(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L11
            r2.receivedReply()
        L11:
            return
    }

    io.netty.handler.codec.spdy.SpdySession.PendingWrite removePendingWrite(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L13
            io.netty.handler.codec.spdy.SpdySession$PendingWrite r2 = r2.removePendingWrite()
            return r2
        L13:
            r2 = 0
            return r2
    }

    void removeStream(int r1, java.lang.Throwable r2, boolean r3) {
            r0 = this;
            io.netty.handler.codec.spdy.SpdySession$StreamState r1 = r0.removeActiveStream(r1, r3)
            if (r1 == 0) goto L9
            r1.clearPendingWrites(r2)
        L9:
            return
    }

    void updateAllReceiveWindowSizes(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r2.activeStreams
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.spdy.SpdySession$StreamState r1 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r1
            r1.updateReceiveWindowSize(r3)
            if (r3 >= 0) goto La
            r1.setReceiveWindowSizeLowerBound(r3)
            goto La
        L1f:
            return
    }

    void updateAllSendWindowSizes(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r2.activeStreams
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            io.netty.handler.codec.spdy.SpdySession$StreamState r1 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r1
            r1.updateSendWindowSize(r3)
            goto La
        L1a:
            return
    }

    int updateReceiveWindowSize(int r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r2 = r1.receiveWindowSize
            int r2 = r2.addAndGet(r3)
            return r2
        L9:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 != 0) goto L19
            r2 = -1
            return r2
        L19:
            if (r3 <= 0) goto L1f
            r0 = 0
            r2.setReceiveWindowSizeLowerBound(r0)
        L1f:
            int r2 = r2.updateReceiveWindowSize(r3)
            return r2
    }

    int updateSendWindowSize(int r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.atomic.AtomicInteger r2 = r1.sendWindowSize
            int r2 = r2.addAndGet(r3)
            return r2
        L9:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.SpdySession$StreamState> r0 = r1.activeStreams
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.SpdySession$StreamState r2 = (io.netty.handler.codec.spdy.SpdySession.StreamState) r2
            if (r2 == 0) goto L1c
            int r2 = r2.updateSendWindowSize(r3)
            return r2
        L1c:
            r2 = -1
            return r2
    }
}
