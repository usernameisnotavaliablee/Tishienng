package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2Connection implements io.netty.handler.codec.http2.Http2Connection {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    final io.netty.handler.codec.http2.DefaultHttp2Connection.ActiveStreams activeStreams;
    io.netty.util.concurrent.Promise<java.lang.Void> closePromise;
    final io.netty.handler.codec.http2.DefaultHttp2Connection.ConnectionStream connectionStream;
    final java.util.List<io.netty.handler.codec.http2.Http2Connection.Listener> listeners;
    final io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> localEndpoint;
    final io.netty.handler.codec.http2.DefaultHttp2Connection.PropertyKeyRegistry propertyKeyRegistry;
    final io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> remoteEndpoint;
    final io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> streamMap;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.DefaultHttp2Connection$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.IDLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ActiveStreams {
        private final java.util.List<io.netty.handler.codec.http2.Http2Connection.Listener> listeners;
        private final java.util.Queue<io.netty.handler.codec.http2.DefaultHttp2Connection.Event> pendingEvents;
        private int pendingIterations;
        private final java.util.Set<io.netty.handler.codec.http2.Http2Stream> streams;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;



        ActiveStreams(io.netty.handler.codec.http2.DefaultHttp2Connection r2, java.util.List<io.netty.handler.codec.http2.Http2Connection.Listener> r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r0 = 4
                r2.<init>(r0)
                r1.pendingEvents = r2
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                r1.streams = r2
                r1.listeners = r3
                return
        }

        public void activate(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r3) {
                r2 = this;
                boolean r0 = r2.allowModifications()
                if (r0 == 0) goto La
                r2.addToActiveStreams(r3)
                return
            La:
                java.util.Queue<io.netty.handler.codec.http2.DefaultHttp2Connection$Event> r0 = r2.pendingEvents
                io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams$1 r1 = new io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams$1
                r1.<init>(r2, r3)
                r0.add(r1)
                return
        }

        void addToActiveStreams(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r5) {
                r4 = this;
                java.util.Set<io.netty.handler.codec.http2.Http2Stream> r0 = r4.streams
                boolean r0 = r0.add(r5)
                if (r0 == 0) goto L34
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r0 = r5.createdBy()
                int r1 = r0.numActiveStreams
                int r1 = r1 + 1
                r0.numActiveStreams = r1
                r0 = 0
            L13:
                java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners
                int r1 = r1.size()
                if (r0 >= r1) goto L34
                java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L27
                io.netty.handler.codec.http2.Http2Connection$Listener r1 = (io.netty.handler.codec.http2.Http2Connection.Listener) r1     // Catch: java.lang.Throwable -> L27
                r1.onStreamActive(r5)     // Catch: java.lang.Throwable -> L27
                goto L31
            L27:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.DefaultHttp2Connection.access$400()
                java.lang.String r3 = "Caught Throwable from listener onStreamActive."
                r2.error(r3, r1)
            L31:
                int r0 = r0 + 1
                goto L13
            L34:
                return
        }

        boolean allowModifications() {
                r1 = this;
                int r0 = r1.pendingIterations
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        public void deactivate(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r3, java.util.Iterator<?> r4) {
                r2 = this;
                boolean r0 = r2.allowModifications()
                if (r0 != 0) goto L14
                if (r4 == 0) goto L9
                goto L14
            L9:
                java.util.Queue<io.netty.handler.codec.http2.DefaultHttp2Connection$Event> r0 = r2.pendingEvents
                io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams$2 r1 = new io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams$2
                r1.<init>(r2, r3, r4)
                r0.add(r1)
                return
            L14:
                r2.removeFromActiveStreams(r3, r4)
                return
        }

        void decrementPendingIterations() {
                r3 = this;
                int r0 = r3.pendingIterations
                int r0 = r0 + (-1)
                r3.pendingIterations = r0
                boolean r0 = r3.allowModifications()
                if (r0 == 0) goto L26
            Lc:
                java.util.Queue<io.netty.handler.codec.http2.DefaultHttp2Connection$Event> r0 = r3.pendingEvents
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.http2.DefaultHttp2Connection$Event r0 = (io.netty.handler.codec.http2.DefaultHttp2Connection.Event) r0
                if (r0 != 0) goto L17
                goto L26
            L17:
                r0.process()     // Catch: java.lang.Throwable -> L1b
                goto Lc
            L1b:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.codec.http2.DefaultHttp2Connection.access$400()
                java.lang.String r2 = "Caught Throwable while processing pending ActiveStreams$Event."
                r1.error(r2, r0)
                goto Lc
            L26:
                return
        }

        public io.netty.handler.codec.http2.Http2Stream forEachActiveStream(io.netty.handler.codec.http2.Http2StreamVisitor r4) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                r3.incrementPendingIterations()
                java.util.Set<io.netty.handler.codec.http2.Http2Stream> r0 = r3.streams     // Catch: java.lang.Throwable -> L1f
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
            L9:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
                if (r1 == 0) goto L21
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1f
                io.netty.handler.codec.http2.Http2Stream r1 = (io.netty.handler.codec.http2.Http2Stream) r1     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r4.visit(r1)     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L9
                r3.decrementPendingIterations()
                return r1
            L1f:
                r4 = move-exception
                goto L26
            L21:
                r3.decrementPendingIterations()
                r4 = 0
                return r4
            L26:
                r3.decrementPendingIterations()
                throw r4
        }

        void incrementPendingIterations() {
                r1 = this;
                int r0 = r1.pendingIterations
                int r0 = r0 + 1
                r1.pendingIterations = r0
                return
        }

        void removeFromActiveStreams(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r3, java.util.Iterator<?> r4) {
                r2 = this;
                java.util.Set<io.netty.handler.codec.http2.Http2Stream> r0 = r2.streams
                boolean r0 = r0.remove(r3)
                if (r0 == 0) goto L17
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r0 = r3.createdBy()
                int r1 = r0.numActiveStreams
                int r1 = r1 + (-1)
                r0.numActiveStreams = r1
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                r0.notifyClosed(r3)
            L17:
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                r0.removeStream(r3, r4)
                return
        }

        public int size() {
                r1 = this;
                java.util.Set<io.netty.handler.codec.http2.Http2Stream> r0 = r1.streams
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ConnectionStream extends io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream {
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;

        ConnectionStream(io.netty.handler.codec.http2.DefaultHttp2Connection r3) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.IDLE
                r2.<init>(r3, r0, r1)
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream close() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream closeLocalSide() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream closeRemoteSide() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream
        io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint<? extends io.netty.handler.codec.http2.Http2FlowController> createdBy() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream headersSent(boolean r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public boolean isHeadersSent() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public boolean isPushPromiseSent() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public boolean isResetSent() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream open(boolean r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream pushPromiseSent() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream, io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream resetSent() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DefaultEndpoint<F extends io.netty.handler.codec.http2.Http2FlowController> implements io.netty.handler.codec.http2.Http2Connection.Endpoint<F> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private F flowController;
        private int lastStreamKnownByPeer;
        private int maxActiveStreams;
        private final int maxReservedStreams;
        private int maxStreams;
        private int nextReservationStreamId;
        private int nextStreamIdToCreate;
        int numActiveStreams;
        int numStreams;
        private boolean pushToAllowed;
        private final boolean server;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;

        static {
                return
        }

        DefaultEndpoint(io.netty.handler.codec.http2.DefaultHttp2Connection r2, boolean r3, int r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r2 = -1
                r1.lastStreamKnownByPeer = r2
                r2 = 1
                r1.pushToAllowed = r2
                r1.server = r3
                if (r3 == 0) goto L16
                r0 = 2
                r1.nextStreamIdToCreate = r0
                r0 = 0
                r1.nextReservationStreamId = r0
                goto L1a
            L16:
                r1.nextStreamIdToCreate = r2
                r1.nextReservationStreamId = r2
            L1a:
                r2 = r2 ^ r3
                r1.pushToAllowed = r2
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1.maxActiveStreams = r2
                java.lang.String r2 = "maxReservedStreams"
                int r2 = io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r2)
                r1.maxReservedStreams = r2
                r1.updateMaxStreams()
                return
        }

        static /* synthetic */ int access$100(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint r0) {
                int r0 = r0.lastStreamKnownByPeer
                return r0
        }

        static /* synthetic */ void access$200(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint r0, int r1) {
                r0.lastStreamKnownByPeer(r1)
                return
        }

        private void addStream(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r5) {
                r4 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r4.this$0
                io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> r0 = r0.streamMap
                int r1 = r5.id()
                r0.put(r1, r5)
                r0 = 0
            Lc:
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r4.this$0
                java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r1.listeners
                int r1 = r1.size()
                if (r0 >= r1) goto L31
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r4.this$0     // Catch: java.lang.Throwable -> L24
                java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r1.listeners     // Catch: java.lang.Throwable -> L24
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L24
                io.netty.handler.codec.http2.Http2Connection$Listener r1 = (io.netty.handler.codec.http2.Http2Connection.Listener) r1     // Catch: java.lang.Throwable -> L24
                r1.onStreamAdded(r5)     // Catch: java.lang.Throwable -> L24
                goto L2e
            L24:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.DefaultHttp2Connection.access$400()
                java.lang.String r3 = "Caught Throwable from listener onStreamAdded."
                r2.error(r3, r1)
            L2e:
                int r0 = r0 + 1
                goto Lc
            L31:
                return
        }

        private void checkNewStreamAllowed(int r6, io.netty.handler.codec.http2.Http2Stream.State r7) throws io.netty.handler.codec.http2.Http2Exception {
                r5 = this;
                int r0 = r5.lastStreamKnownByPeer
                r1 = 2
                r2 = 1
                r3 = 0
                if (r0 < 0) goto L23
                if (r6 > r0) goto La
                goto L23
            La:
                io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.REFUSED_STREAM
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                int r4 = r5.lastStreamKnownByPeer
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                r1[r2] = r4
                java.lang.String r0 = "Cannot create stream %d greater than Last-Stream-ID %d from GOAWAY."
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.streamError(r6, r7, r0, r1)
                throw r6
            L23:
                boolean r0 = r5.isValidStreamId(r6)
                if (r0 != 0) goto L4d
                if (r6 < 0) goto L47
                io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r0 = r5.server
                if (r0 == 0) goto L38
                java.lang.String r0 = "server"
                goto L3a
            L38:
                java.lang.String r0 = "client"
            L3a:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                r1[r2] = r0
                java.lang.String r6 = "Request stream %d is not correct for %s connection"
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r7, r6, r1)
                throw r6
            L47:
                io.netty.handler.codec.http2.Http2NoMoreStreamIdsException r6 = new io.netty.handler.codec.http2.Http2NoMoreStreamIdsException
                r6.<init>()
                throw r6
            L4d:
                int r0 = r5.nextStreamIdToCreate
                if (r6 < r0) goto La0
                if (r0 <= 0) goto L95
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL
                if (r7 == r0) goto L5e
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE
                if (r7 != r0) goto L5c
                goto L5e
            L5c:
                r7 = 0
                goto L5f
            L5e:
                r7 = 1
            L5f:
                if (r7 != 0) goto L67
                boolean r0 = r5.canOpenStream()
                if (r0 == 0) goto L70
            L67:
                if (r7 == 0) goto L7b
                int r7 = r5.numStreams
                int r0 = r5.maxStreams
                if (r7 >= r0) goto L70
                goto L7b
            L70:
                io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.REFUSED_STREAM
                java.lang.String r0 = "Maximum active streams violated for this endpoint."
                java.lang.Object[] r1 = new java.lang.Object[r3]
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.streamError(r6, r7, r0, r1)
                throw r6
            L7b:
                io.netty.handler.codec.http2.DefaultHttp2Connection r7 = r5.this$0
                boolean r7 = r7.isClosed()
                if (r7 != 0) goto L84
                return
            L84:
                io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r3] = r6
                java.lang.String r6 = "Attempted to create stream id %d after connection was closed"
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r7, r6, r0)
                throw r6
            L95:
                io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.REFUSED_STREAM
                java.lang.String r7 = "Stream IDs are exhausted for this endpoint."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r6, r7, r0)
                throw r6
            La0:
                io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                int r0 = r5.nextStreamIdToCreate
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                r1[r2] = r0
                java.lang.String r6 = "Request stream %d is behind the next expected stream %d"
                io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.closedStreamError(r7, r6, r1)
                throw r6
        }

        private void incrementExpectedStreamId(int r2) {
                r1 = this;
                int r0 = r1.nextReservationStreamId
                if (r2 <= r0) goto L8
                if (r0 < 0) goto L8
                r1.nextReservationStreamId = r2
            L8:
                int r2 = r2 + 2
                r1.nextStreamIdToCreate = r2
                int r2 = r1.numStreams
                int r2 = r2 + 1
                r1.numStreams = r2
                return
        }

        private boolean isLocal() {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r1.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r0.localEndpoint
                if (r1 != r0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        private void lastStreamKnownByPeer(int r1) {
                r0 = this;
                r0.lastStreamKnownByPeer = r1
                return
        }

        private void updateMaxStreams() {
                r4 = this;
                int r0 = r4.maxActiveStreams
                long r0 = (long) r0
                int r2 = r4.maxReservedStreams
                long r2 = (long) r2
                long r0 = r0 + r2
                r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r0 = java.lang.Math.min(r2, r0)
                int r1 = (int) r0
                r4.maxStreams = r1
                return
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public void allowPushTo(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                boolean r0 = r1.server
                if (r0 != 0) goto L7
                goto Lf
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Servers do not allow push"
                r2.<init>(r0)
                throw r2
            Lf:
                r1.pushToAllowed = r2
                return
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean allowPushTo() {
                r1 = this;
                boolean r0 = r1.pushToAllowed
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean canOpenStream() {
                r2 = this;
                int r0 = r2.numActiveStreams
                int r1 = r2.maxActiveStreams
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream createStream(int r3, boolean r4) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.IDLE
                boolean r1 = r2.isLocal()
                io.netty.handler.codec.http2.Http2Stream$State r4 = io.netty.handler.codec.http2.DefaultHttp2Connection.activeState(r3, r0, r1, r4)
                r2.checkNewStreamAllowed(r3, r4)
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r0 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r2.this$0
                r0.<init>(r1, r3, r4)
                r2.incrementExpectedStreamId(r3)
                r2.addStream(r0)
                r0.activate()
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Stream createStream(int r1, boolean r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r1 = r0.createStream(r1, r2)
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean created(io.netty.handler.codec.http2.Http2Stream r2) {
                r1 = this;
                boolean r0 = r2 instanceof io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream
                if (r0 == 0) goto Le
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r2 = (io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream) r2
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r2 = r2.createdBy()
                if (r2 != r1) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public F flowController() {
                r1 = this;
                F extends io.netty.handler.codec.http2.Http2FlowController r0 = r1.flowController
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public void flowController(F r2) {
                r1 = this;
                java.lang.String r0 = "flowController"
                java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                io.netty.handler.codec.http2.Http2FlowController r2 = (io.netty.handler.codec.http2.Http2FlowController) r2
                r1.flowController = r2
                return
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public int incrementAndGetNextStreamId() {
                r1 = this;
                int r0 = r1.nextReservationStreamId
                if (r0 < 0) goto L8
                int r0 = r0 + 2
                r1.nextReservationStreamId = r0
            L8:
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean isServer() {
                r1 = this;
                boolean r0 = r1.server
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean isValidStreamId(int r4) {
                r3 = this;
                r0 = 0
                if (r4 <= 0) goto Lf
                boolean r1 = r3.server
                r2 = 1
                r4 = r4 & r2
                if (r4 != 0) goto Lb
                r4 = 1
                goto Lc
            Lb:
                r4 = 0
            Lc:
                if (r1 != r4) goto Lf
                return r2
            Lf:
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public int lastStreamCreated() {
                r2 = this;
                int r0 = r2.nextStreamIdToCreate
                r1 = 1
                if (r0 <= r1) goto L8
                int r0 = r0 + (-2)
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public int lastStreamKnownByPeer() {
                r1 = this;
                int r0 = r1.lastStreamKnownByPeer
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public int maxActiveStreams() {
                r1 = this;
                int r0 = r1.maxActiveStreams
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public void maxActiveStreams(int r1) {
                r0 = this;
                r0.maxActiveStreams = r1
                r0.updateMaxStreams()
                return
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public boolean mayHaveCreatedStream(int r2) {
                r1 = this;
                boolean r0 = r1.isValidStreamId(r2)
                if (r0 == 0) goto Le
                int r0 = r1.lastStreamCreated()
                if (r2 > r0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public int numActiveStreams() {
                r1 = this;
                int r0 = r1.numActiveStreams
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public io.netty.handler.codec.http2.Http2Connection.Endpoint<? extends io.netty.handler.codec.http2.Http2FlowController> opposite() {
                r1 = this;
                boolean r0 = r1.isLocal()
                if (r0 == 0) goto Lb
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r1.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r0.remoteEndpoint
                return r0
            Lb:
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r1.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r0.localEndpoint
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream reservePushStream(int r3, io.netty.handler.codec.http2.Http2Stream r4) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                r0 = 0
                if (r4 == 0) goto L65
                boolean r1 = r2.isLocal()
                if (r1 == 0) goto L14
                io.netty.handler.codec.http2.Http2Stream$State r1 = r4.state()
                boolean r1 = r1.localSideOpen()
                if (r1 == 0) goto L4f
                goto L1e
            L14:
                io.netty.handler.codec.http2.Http2Stream$State r1 = r4.state()
                boolean r1 = r1.remoteSideOpen()
                if (r1 == 0) goto L4f
            L1e:
                io.netty.handler.codec.http2.Http2Connection$Endpoint r4 = r2.opposite()
                boolean r4 = r4.allowPushTo()
                if (r4 == 0) goto L44
                boolean r4 = r2.isLocal()
                if (r4 == 0) goto L31
                io.netty.handler.codec.http2.Http2Stream$State r4 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL
                goto L33
            L31:
                io.netty.handler.codec.http2.Http2Stream$State r4 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_REMOTE
            L33:
                r2.checkNewStreamAllowed(r3, r4)
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r0 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r2.this$0
                r0.<init>(r1, r3, r4)
                r2.incrementExpectedStreamId(r3)
                r2.addStream(r0)
                return r0
            L44:
                io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.String r4 = "Server push not allowed to opposite endpoint"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r4, r0)
                throw r3
            L4f:
                io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                int r4 = r4.id()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r4
                java.lang.String r4 = "Stream %d is not open for sending push promise"
                io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r4, r1)
                throw r3
            L65:
                io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                java.lang.String r4 = "Parent stream missing"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r4, r0)
                throw r3
        }

        @Override // io.netty.handler.codec.http2.Http2Connection.Endpoint
        public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2Stream reservePushStream(int r1, io.netty.handler.codec.http2.Http2Stream r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r1 = r0.reservePushStream(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class DefaultPropertyKey implements io.netty.handler.codec.http2.Http2Connection.PropertyKey {
        final int index;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;

        DefaultPropertyKey(io.netty.handler.codec.http2.DefaultHttp2Connection r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.index = r2
                return
        }

        io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey verifyConnection(io.netty.handler.codec.http2.Http2Connection r2) {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r1.this$0
                if (r2 != r0) goto L5
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Using a key that was not created by this connection"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DefaultStream implements io.netty.handler.codec.http2.Http2Stream {
        private static final byte META_STATE_RECV_HEADERS = 16;
        private static final byte META_STATE_RECV_TRAILERS = 32;
        private static final byte META_STATE_SENT_HEADERS = 2;
        private static final byte META_STATE_SENT_PUSHPROMISE = 8;
        private static final byte META_STATE_SENT_RST = 1;
        private static final byte META_STATE_SENT_TRAILERS = 4;
        private final int id;
        private byte metaState;
        private final io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream.PropertyMap properties;
        private io.netty.handler.codec.http2.Http2Stream.State state;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class PropertyMap {
            final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream this$1;
            java.lang.Object[] values;

            private PropertyMap(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    java.lang.Object[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_OBJECTS
                    r0.values = r1
                    return
            }

            /* synthetic */ PropertyMap(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r1, io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            <V> V add(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey r3, V r4) {
                    r2 = this;
                    int r0 = r3.index
                    r2.resizeIfNecessary(r0)
                    java.lang.Object[] r0 = r2.values
                    int r3 = r3.index
                    r1 = r0[r3]
                    r0[r3] = r4
                    return r1
            }

            <V> V get(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey r3) {
                    r2 = this;
                    int r3 = r3.index
                    java.lang.Object[] r0 = r2.values
                    int r1 = r0.length
                    if (r3 < r1) goto L9
                    r3 = 0
                    return r3
                L9:
                    r3 = r0[r3]
                    return r3
            }

            <V> V remove(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey r4) {
                    r3 = this;
                    int r4 = r4.index
                    java.lang.Object[] r0 = r3.values
                    int r1 = r0.length
                    r2 = 0
                    if (r4 >= r1) goto Ld
                    r1 = r0[r4]
                    r0[r4] = r2
                    return r1
                Ld:
                    return r2
            }

            void resizeIfNecessary(int r3) {
                    r2 = this;
                    java.lang.Object[] r0 = r2.values
                    int r1 = r0.length
                    if (r3 < r1) goto L15
                    io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r3 = r2.this$1
                    io.netty.handler.codec.http2.DefaultHttp2Connection r3 = r3.this$0
                    io.netty.handler.codec.http2.DefaultHttp2Connection$PropertyKeyRegistry r3 = r3.propertyKeyRegistry
                    int r3 = r3.size()
                    java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
                    r2.values = r3
                L15:
                    return
            }
        }

        DefaultStream(io.netty.handler.codec.http2.DefaultHttp2Connection r2, int r3, io.netty.handler.codec.http2.Http2Stream.State r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream$PropertyMap r2 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream$PropertyMap
                r0 = 0
                r2.<init>(r1, r0)
                r1.properties = r2
                r1.id = r3
                r1.state = r4
                return
        }

        void activate() {
                r3 = this;
                io.netty.handler.codec.http2.Http2Stream$State r0 = r3.state
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL
                r2 = 0
                if (r0 != r1) goto Lb
                r3.headersSent(r2)
                goto L12
            Lb:
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE
                if (r0 != r1) goto L12
                r3.headersReceived(r2)
            L12:
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r3.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r0.activeStreams
                r0.activate(r3)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream close() {
                r1 = this;
                r0 = 0
                io.netty.handler.codec.http2.Http2Stream r0 = r1.close(r0)
                return r0
        }

        io.netty.handler.codec.http2.Http2Stream close(java.util.Iterator<?> r3) {
                r2 = this;
                io.netty.handler.codec.http2.Http2Stream$State r0 = r2.state
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED
                if (r0 != r1) goto L7
                return r2
            L7:
                r2.state = r1
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r0 = r2.createdBy()
                int r1 = r0.numStreams
                int r1 = r1 + (-1)
                r0.numStreams = r1
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r0.activeStreams
                r0.deactivate(r2, r3)
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream closeLocalSide() {
                r2 = this;
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r1 = r2.state
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 4
                if (r0 == r1) goto L14
                r1 = 5
                if (r0 == r1) goto L13
                r2.close()
            L13:
                return r2
            L14:
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL
                r2.state = r0
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                r0.notifyHalfClosed(r2)
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream closeRemoteSide() {
                r2 = this;
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
                io.netty.handler.codec.http2.Http2Stream$State r1 = r2.state
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 4
                if (r0 == r1) goto L14
                r1 = 6
                if (r0 == r1) goto L13
                r2.close()
            L13:
                return r2
            L14:
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE
                r2.state = r0
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                r0.notifyHalfClosed(r2)
                return r2
        }

        io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint<? extends io.netty.handler.codec.http2.Http2FlowController> createdBy() {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r0.localEndpoint
                int r1 = r2.id
                boolean r0 = r0.isValidStreamId(r1)
                if (r0 == 0) goto L11
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r0.localEndpoint
                return r0
            L11:
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r0.remoteEndpoint
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public final <V> V getProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r3) {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream$PropertyMap r0 = r2.properties
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r3 = r1.verifyKey(r3)
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream headersReceived(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L13
                byte r2 = r1.metaState
                boolean r0 = r1.isHeadersReceived()
                if (r0 == 0) goto Ld
                r0 = 32
                goto Lf
            Ld:
                r0 = 16
            Lf:
                r2 = r2 | r0
                byte r2 = (byte) r2
                r1.metaState = r2
            L13:
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream headersSent(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L11
                byte r2 = r1.metaState
                boolean r0 = r1.isHeadersSent()
                if (r0 == 0) goto Lc
                r0 = 4
                goto Ld
            Lc:
                r0 = 2
            Ld:
                r2 = r2 | r0
                byte r2 = (byte) r2
                r1.metaState = r2
            L11:
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public final int id() {
                r1 = this;
                int r0 = r1.id
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isHeadersReceived() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 & 16
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isHeadersSent() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        final boolean isLocal() {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r0.localEndpoint
                int r1 = r2.id
                boolean r0 = r0.isValidStreamId(r1)
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isPushPromiseSent() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isResetSent() {
                r2 = this;
                byte r0 = r2.metaState
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                return r1
            L7:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isTrailersReceived() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public boolean isTrailersSent() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream open(boolean r4) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                int r0 = r3.id
                io.netty.handler.codec.http2.Http2Stream$State r1 = r3.state
                boolean r2 = r3.isLocal()
                io.netty.handler.codec.http2.Http2Stream$State r4 = io.netty.handler.codec.http2.DefaultHttp2Connection.activeState(r0, r1, r2, r4)
                r3.state = r4
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r4 = r3.createdBy()
                boolean r4 = r4.canOpenStream()
                if (r4 == 0) goto L1c
                r3.activate()
                return r3
            L1c:
                io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Maximum active streams violated for this endpoint."
                io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r1, r0)
                throw r4
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream pushPromiseSent() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 | 8
                byte r0 = (byte) r0
                r1.metaState = r0
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public final <V> V removeProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r3) {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream$PropertyMap r0 = r2.properties
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r3 = r1.verifyKey(r3)
                java.lang.Object r3 = r0.remove(r3)
                return r3
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public io.netty.handler.codec.http2.Http2Stream resetSent() {
                r1 = this;
                byte r0 = r1.metaState
                r0 = r0 | 1
                byte r0 = (byte) r0
                r1.metaState = r0
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public final <V> V setProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r3, V r4) {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream$PropertyMap r0 = r2.properties
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r3 = r1.verifyKey(r3)
                java.lang.Object r3 = r0.add(r3, r4)
                return r3
        }

        @Override // io.netty.handler.codec.http2.Http2Stream
        public final io.netty.handler.codec.http2.Http2Stream.State state() {
                r1 = this;
                io.netty.handler.codec.http2.Http2Stream$State r0 = r1.state
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Event {
        void process();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PropertyKeyRegistry {
        final java.util.List<io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey> keys;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2Connection this$0;

        private PropertyKeyRegistry(io.netty.handler.codec.http2.DefaultHttp2Connection r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r0 = 4
                r2.<init>(r0)
                r1.keys = r2
                return
        }

        /* synthetic */ PropertyKeyRegistry(io.netty.handler.codec.http2.DefaultHttp2Connection r1, io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey newKey() {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r0 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey
                io.netty.handler.codec.http2.DefaultHttp2Connection r1 = r3.this$0
                java.util.List<io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey> r2 = r3.keys
                int r2 = r2.size()
                r0.<init>(r1, r2)
                java.util.List<io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey> r1 = r3.keys
                r1.add(r0)
                return r0
        }

        int size() {
                r1 = this;
                java.util.List<io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey> r0 = r1.keys
                int r0 = r0.size()
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http2.DefaultHttp2Connection> r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.DefaultHttp2Connection.logger = r0
            return
    }

    public DefaultHttp2Connection(boolean r2) {
            r1 = this;
            r0 = 100
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2Connection(boolean r5, int r6) {
            r4 = this;
            r4.<init>()
            io.netty.util.collection.IntObjectHashMap r0 = new io.netty.util.collection.IntObjectHashMap
            r0.<init>()
            r4.streamMap = r0
            io.netty.handler.codec.http2.DefaultHttp2Connection$PropertyKeyRegistry r1 = new io.netty.handler.codec.http2.DefaultHttp2Connection$PropertyKeyRegistry
            r2 = 0
            r1.<init>(r4, r2)
            r4.propertyKeyRegistry = r1
            io.netty.handler.codec.http2.DefaultHttp2Connection$ConnectionStream r1 = new io.netty.handler.codec.http2.DefaultHttp2Connection$ConnectionStream
            r1.<init>(r4)
            r4.connectionStream = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 4
            r2.<init>(r3)
            r4.listeners = r2
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r3 = new io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams
            r3.<init>(r4, r2)
            r4.activeStreams = r3
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r2 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint
            if (r5 == 0) goto L30
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L31
        L30:
            r3 = r6
        L31:
            r2.<init>(r4, r5, r3)
            r4.localEndpoint = r2
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint r2 = new io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint
            r5 = r5 ^ 1
            r2.<init>(r4, r5, r6)
            r4.remoteEndpoint = r2
            int r5 = r1.id()
            r0.put(r5, r1)
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$400() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            return r0
    }

    static io.netty.handler.codec.http2.Http2Stream.State activeState(int r2, io.netty.handler.codec.http2.Http2Stream.State r3, boolean r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            int[] r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r4 = 2
            if (r0 == r4) goto L2f
            r4 = 3
            if (r0 != r4) goto L14
            io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL
            return r2
        L14:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Attempting to open a stream in an invalid state: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.streamError(r2, r4, r3, r5)
            throw r2
        L2f:
            io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE
            return r2
        L32:
            if (r5 == 0) goto L3c
            if (r4 == 0) goto L39
            io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_LOCAL
            return r2
        L39:
            io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE
            return r2
        L3c:
            io.netty.handler.codec.http2.Http2Stream$State r2 = io.netty.handler.codec.http2.Http2Stream.State.OPEN
            return r2
    }

    private void closeStreamsGreaterThanLastKnownStreamId(int r2, io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint<?> r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$1 r0 = new io.netty.handler.codec.http2.DefaultHttp2Connection$1
            r0.<init>(r1, r2, r3)
            r1.forEachActiveStream(r0)
            return
    }

    private boolean isStreamMapEmpty() {
            r2 = this;
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> r0 = r2.streamMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public void addListener(io.netty.handler.codec.http2.Http2Connection.Listener r2) {
            r1 = this;
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.util.concurrent.Future<java.lang.Void> close(io.netty.util.concurrent.Promise<java.lang.Void> r3) {
            r2 = this;
            java.lang.String r0 = "promise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r2.closePromise
            if (r0 == 0) goto L26
            if (r0 != r3) goto Lc
            goto L28
        Lc:
            boolean r1 = r3 instanceof io.netty.channel.ChannelPromise
            if (r1 == 0) goto L1b
            io.netty.channel.ChannelPromise r0 = (io.netty.channel.ChannelPromise) r0
            boolean r0 = r0.isVoid()
            if (r0 == 0) goto L1b
            r2.closePromise = r3
            goto L28
        L1b:
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r2.closePromise
            io.netty.util.concurrent.UnaryPromiseNotifier r1 = new io.netty.util.concurrent.UnaryPromiseNotifier
            r1.<init>(r3)
            r0.addListener(r1)
            goto L28
        L26:
            r2.closePromise = r3
        L28:
            boolean r0 = r2.isStreamMapEmpty()
            if (r0 == 0) goto L33
            r0 = 0
            r3.trySuccess(r0)
            return r3
        L33:
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> r3 = r2.streamMap
            java.lang.Iterable r3 = r3.entries()
            java.util.Iterator r3 = r3.iterator()
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r2.activeStreams
            boolean r0 = r0.allowModifications()
            if (r0 == 0) goto L74
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r2.activeStreams
            r0.incrementPendingIterations()
        L4a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L68
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L66
            io.netty.util.collection.IntObjectMap$PrimitiveEntry r0 = (io.netty.util.collection.IntObjectMap.PrimitiveEntry) r0     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r0.value()     // Catch: java.lang.Throwable -> L66
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultStream r0 = (io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream) r0     // Catch: java.lang.Throwable -> L66
            int r1 = r0.id()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L4a
            r0.close(r3)     // Catch: java.lang.Throwable -> L66
            goto L4a
        L66:
            r3 = move-exception
            goto L6e
        L68:
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r3 = r2.activeStreams
            r3.decrementPendingIterations()
            goto L90
        L6e:
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r2.activeStreams
            r0.decrementPendingIterations()
            throw r3
        L74:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r3.next()
            io.netty.util.collection.IntObjectMap$PrimitiveEntry r0 = (io.netty.util.collection.IntObjectMap.PrimitiveEntry) r0
            java.lang.Object r0 = r0.value()
            io.netty.handler.codec.http2.Http2Stream r0 = (io.netty.handler.codec.http2.Http2Stream) r0
            int r1 = r0.id()
            if (r1 == 0) goto L74
            r0.close()
            goto L74
        L90:
            io.netty.util.concurrent.Promise<java.lang.Void> r3 = r2.closePromise
            return r3
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Stream connectionStream() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$ConnectionStream r0 = r1.connectionStream
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Stream forEachActiveStream(io.netty.handler.codec.http2.Http2StreamVisitor r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r1.activeStreams
            io.netty.handler.codec.http2.Http2Stream r2 = r0.forEachActiveStream(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public void goAwayReceived(int r5, long r6, io.netty.buffer.ByteBuf r8) throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r4.localEndpoint
            int r0 = r0.lastStreamKnownByPeer()
            r1 = 0
            if (r0 < 0) goto L31
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r4.localEndpoint
            int r0 = r0.lastStreamKnownByPeer()
            if (r0 < r5) goto L12
            goto L31
        L12:
            io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r7 = r4.localEndpoint
            int r7 = r7.lastStreamKnownByPeer()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r7 = 1
            r8[r7] = r5
            java.lang.String r5 = "lastStreamId MUST NOT increase. Current value: %d new value: %d"
            io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.connectionError(r6, r5, r8)
            throw r5
        L31:
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r4.localEndpoint
            io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint.access$200(r0, r5)
        L36:
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r4.listeners
            int r0 = r0.size()
            if (r1 >= r0) goto L55
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r4.listeners     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L4a
            io.netty.handler.codec.http2.Http2Connection$Listener r0 = (io.netty.handler.codec.http2.Http2Connection.Listener) r0     // Catch: java.lang.Throwable -> L4a
            r0.onGoAwayReceived(r5, r6, r8)     // Catch: java.lang.Throwable -> L4a
            goto L52
        L4a:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            java.lang.String r3 = "Caught Throwable from listener onGoAwayReceived."
            r2.error(r3, r0)
        L52:
            int r1 = r1 + 1
            goto L36
        L55:
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r6 = r4.localEndpoint
            r4.closeStreamsGreaterThanLastKnownStreamId(r5, r6)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public boolean goAwayReceived() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r1.localEndpoint
            int r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint.access$100(r0)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public boolean goAwaySent() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r1.remoteEndpoint
            int r0 = io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint.access$100(r0)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public boolean goAwaySent(int r6, long r7, io.netty.buffer.ByteBuf r9) throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r5.remoteEndpoint
            int r0 = r0.lastStreamKnownByPeer()
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L3a
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r5.remoteEndpoint
            int r0 = r0.lastStreamKnownByPeer()
            if (r6 != r0) goto L13
            return r2
        L13:
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r5.remoteEndpoint
            int r0 = r0.lastStreamKnownByPeer()
            if (r6 > r0) goto L1c
            goto L3a
        L1c:
            io.netty.handler.codec.http2.Http2Error r7 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r8 = r5.remoteEndpoint
            int r8 = r8.lastStreamKnownByPeer()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r8
            r9[r1] = r6
            java.lang.String r6 = "Last stream identifier must not increase between sending multiple GOAWAY frames (was '%d', is '%d')."
            io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r7, r6, r9)
            throw r6
        L3a:
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r5.remoteEndpoint
            io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultEndpoint.access$200(r0, r6)
        L3f:
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r5.listeners
            int r0 = r0.size()
            if (r2 >= r0) goto L5e
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r5.listeners     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L53
            io.netty.handler.codec.http2.Http2Connection$Listener r0 = (io.netty.handler.codec.http2.Http2Connection.Listener) r0     // Catch: java.lang.Throwable -> L53
            r0.onGoAwaySent(r6, r7, r9)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            java.lang.String r4 = "Caught Throwable from listener onGoAwaySent."
            r3.error(r4, r0)
        L5b:
            int r2 = r2 + 1
            goto L3f
        L5e:
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r7 = r5.remoteEndpoint
            r5.closeStreamsGreaterThanLastKnownStreamId(r6, r7)
            return r1
    }

    final boolean isClosed() {
            r1 = this;
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r1.closePromise
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public boolean isServer() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r1.localEndpoint
            boolean r0 = r0.isServer()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Connection.Endpoint<io.netty.handler.codec.http2.Http2LocalFlowController> local() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r1.localEndpoint
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Connection.PropertyKey newKey() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$PropertyKeyRegistry r0 = r1.propertyKeyRegistry
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r0 = r0.newKey()
            return r0
    }

    void notifyClosed(io.netty.handler.codec.http2.Http2Stream r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners
            int r1 = r1.size()
            if (r0 >= r1) goto L20
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L15
            io.netty.handler.codec.http2.Http2Connection$Listener r1 = (io.netty.handler.codec.http2.Http2Connection.Listener) r1     // Catch: java.lang.Throwable -> L15
            r1.onStreamClosed(r5)     // Catch: java.lang.Throwable -> L15
            goto L1d
        L15:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            java.lang.String r3 = "Caught Throwable from listener onStreamClosed."
            r2.error(r3, r1)
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            return
    }

    void notifyHalfClosed(io.netty.handler.codec.http2.Http2Stream r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners
            int r1 = r1.size()
            if (r0 >= r1) goto L20
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r1 = r4.listeners     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L15
            io.netty.handler.codec.http2.Http2Connection$Listener r1 = (io.netty.handler.codec.http2.Http2Connection.Listener) r1     // Catch: java.lang.Throwable -> L15
            r1.onStreamHalfClosed(r5)     // Catch: java.lang.Throwable -> L15
            goto L1d
        L15:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            java.lang.String r3 = "Caught Throwable from listener onStreamHalfClosed."
            r2.error(r3, r1)
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public int numActiveStreams() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$ActiveStreams r0 = r1.activeStreams
            int r0 = r0.size()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Connection.Endpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> remote() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r1.remoteEndpoint
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public void removeListener(io.netty.handler.codec.http2.Http2Connection.Listener r2) {
            r1 = this;
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    void removeStream(io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultStream r4, java.util.Iterator<?> r5) {
            r3 = this;
            if (r5 != 0) goto L10
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> r5 = r3.streamMap
            int r0 = r4.id()
            java.lang.Object r5 = r5.remove(r0)
            if (r5 == 0) goto Lf
            goto L13
        Lf:
            return
        L10:
            r5.remove()
        L13:
            r5 = 0
        L14:
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r3.listeners
            int r0 = r0.size()
            if (r5 >= r0) goto L33
            java.util.List<io.netty.handler.codec.http2.Http2Connection$Listener> r0 = r3.listeners     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L28
            io.netty.handler.codec.http2.Http2Connection$Listener r0 = (io.netty.handler.codec.http2.Http2Connection.Listener) r0     // Catch: java.lang.Throwable -> L28
            r0.onStreamRemoved(r4)     // Catch: java.lang.Throwable -> L28
            goto L30
        L28:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.codec.http2.DefaultHttp2Connection.logger
            java.lang.String r2 = "Caught Throwable from listener onStreamRemoved."
            r1.error(r2, r0)
        L30:
            int r5 = r5 + 1
            goto L14
        L33:
            io.netty.util.concurrent.Promise<java.lang.Void> r4 = r3.closePromise
            if (r4 == 0) goto L43
            boolean r4 = r3.isStreamMapEmpty()
            if (r4 == 0) goto L43
            io.netty.util.concurrent.Promise<java.lang.Void> r4 = r3.closePromise
            r5 = 0
            r4.trySuccess(r5)
        L43:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public io.netty.handler.codec.http2.Http2Stream stream(int r2) {
            r1 = this;
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2Stream> r0 = r1.streamMap
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.http2.Http2Stream r2 = (io.netty.handler.codec.http2.Http2Stream) r2
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2Connection
    public boolean streamMayHaveExisted(int r2) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2RemoteFlowController> r0 = r1.remoteEndpoint
            boolean r0 = r0.mayHaveCreatedStream(r2)
            if (r0 != 0) goto L13
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultEndpoint<io.netty.handler.codec.http2.Http2LocalFlowController> r0 = r1.localEndpoint
            boolean r2 = r0.mayHaveCreatedStream(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    final io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey verifyKey(io.netty.handler.codec.http2.Http2Connection.PropertyKey r2) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r2 = (io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey) r2
            java.lang.String r0 = "key"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r2 = (io.netty.handler.codec.http2.DefaultHttp2Connection.DefaultPropertyKey) r2
            io.netty.handler.codec.http2.DefaultHttp2Connection$DefaultPropertyKey r2 = r2.verifyConnection(r1)
            return r2
    }
}
