package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2RemoteFlowController implements io.netty.handler.codec.http2.Http2RemoteFlowController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MIN_WRITABLE_CHUNK = 32768;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private final io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState connectionState;
    private io.netty.channel.ChannelHandlerContext ctx;
    private int initialWindowSize;
    private io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor monitor;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey stateKey;
    private final io.netty.handler.codec.http2.StreamByteDistributor streamByteDistributor;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FlowState implements io.netty.handler.codec.http2.StreamByteDistributor.StreamState {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean cancelled;
        private boolean markedWritable;
        private long pendingBytes;
        private final java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled> pendingWriteQueue;
        private final io.netty.handler.codec.http2.Http2Stream stream;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController this$0;
        private int window;
        private boolean writing;

        static {
                return
        }

        FlowState(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1, io.netty.handler.codec.http2.Http2Stream r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.stream = r2
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r2 = 2
                r1.<init>(r2)
                r0.pendingWriteQueue = r1
                return
        }

        static /* synthetic */ io.netty.handler.codec.http2.Http2Stream access$1300(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r0) {
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream
                return r0
        }

        private void decrementFlowControlWindow(int r4) {
                r3 = this;
                int r4 = -r4
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r3.this$0     // Catch: io.netty.handler.codec.http2.Http2Exception -> Le
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Le
                r0.incrementStreamWindow(r4)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Le
                r3.incrementStreamWindow(r4)     // Catch: io.netty.handler.codec.http2.Http2Exception -> Le
                return
            Le:
                r4 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid window state when writing frame: "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1, r4)
                throw r0
        }

        private void decrementPendingBytes(int r1, boolean r2) {
                r0 = this;
                int r1 = -r1
                r0.incrementPendingBytes(r1, r2)
                return
        }

        private void enqueueFrameWithoutMerge(io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2) {
                r1 = this;
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r0 = r1.pendingWriteQueue
                r0.offer(r2)
                int r2 = r2.size()
                r0 = 1
                r1.incrementPendingBytes(r2, r0)
                return
        }

        private void incrementPendingBytes(int r5, boolean r6) {
                r4 = this;
                long r0 = r4.pendingBytes
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.pendingBytes = r0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r4.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$300(r0)
                r0.incrementPendingBytes(r5)
                if (r6 == 0) goto L1a
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r5 = r4.this$0
                io.netty.handler.codec.http2.StreamByteDistributor r5 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$600(r5)
                r5.updateStreamableBytes(r4)
            L1a:
                return
        }

        private io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled peek() {
                r1 = this;
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r0 = r1.pendingWriteQueue
                java.lang.Object r0 = r0.peek()
                io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled r0 = (io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled) r0
                return r0
        }

        private int writableWindow() {
                r2 = this;
                int r0 = r2.window
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r2.this$0
                int r1 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$700(r1)
                int r0 = java.lang.Math.min(r0, r1)
                return r0
        }

        private void writeError(io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r3, io.netty.handler.codec.http2.Http2Exception r4) {
                r2 = this;
                int r0 = r3.size()
                r1 = 1
                r2.decrementPendingBytes(r0, r1)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.channel.ChannelHandlerContext r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$500(r0)
                r3.error(r0, r4)
                return
        }

        void cancel(io.netty.handler.codec.http2.Http2Error r5, java.lang.Throwable r6) {
                r4 = this;
                r0 = 1
                r4.cancelled = r0
                boolean r0 = r4.writing
                if (r0 == 0) goto L8
                return
            L8:
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r0 = r4.pendingWriteQueue
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled r0 = (io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled) r0
                if (r0 == 0) goto L2f
                io.netty.handler.codec.http2.Http2Stream r1 = r4.stream
                int r1 = r1.id()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Stream closed before write could take place"
                io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r1, r5, r6, r3, r2)
            L21:
                r4.writeError(r0, r5)
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r6 = r4.pendingWriteQueue
                java.lang.Object r6 = r6.poll()
                r0 = r6
                io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled r0 = (io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled) r0
                if (r0 != 0) goto L21
            L2f:
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r5 = r4.this$0
                io.netty.handler.codec.http2.StreamByteDistributor r5 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$600(r5)
                r5.updateStreamableBytes(r4)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r5 = r4.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r5 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$300(r5)
                r5.stateCancelled(r4)
                return
        }

        void enqueueFrame(io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r4) {
                r3 = this;
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r0 = r3.pendingWriteQueue
                java.lang.Object r0 = r0.peekLast()
                io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled r0 = (io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled) r0
                if (r0 != 0) goto Le
                r3.enqueueFrameWithoutMerge(r4)
                return
            Le:
                int r1 = r0.size()
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r2 = r3.this$0
                io.netty.channel.ChannelHandlerContext r2 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$500(r2)
                boolean r2 = r0.merge(r2, r4)
                if (r2 == 0) goto L28
                int r4 = r0.size()
                int r4 = r4 - r1
                r0 = 1
                r3.incrementPendingBytes(r4, r0)
                return
            L28:
                r3.enqueueFrameWithoutMerge(r4)
                return
        }

        @Override // io.netty.handler.codec.http2.StreamByteDistributor.StreamState
        public boolean hasFrame() {
                r1 = this;
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r0 = r1.pendingWriteQueue
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        int incrementStreamWindow(int r5) throws io.netty.handler.codec.http2.Http2Exception {
                r4 = this;
                if (r5 <= 0) goto L2a
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r0 = r0 - r5
                int r1 = r4.window
                if (r0 < r1) goto Lb
                goto L2a
            Lb:
                io.netty.handler.codec.http2.Http2Stream r5 = r4.stream
                int r5 = r5.id()
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.FLOW_CONTROL_ERROR
                io.netty.handler.codec.http2.Http2Stream r1 = r4.stream
                int r1 = r1.id()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "Window size overflow for stream: %d"
                io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r5, r0, r1, r2)
                throw r5
            L2a:
                int r0 = r4.window
                int r0 = r0 + r5
                r4.window = r0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r5 = r4.this$0
                io.netty.handler.codec.http2.StreamByteDistributor r5 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$600(r5)
                r5.updateStreamableBytes(r4)
                int r5 = r4.window
                return r5
        }

        boolean isWritable() {
                r5 = this;
                int r0 = r5.windowSize()
                long r0 = (long) r0
                long r2 = r5.pendingBytes()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L13
                boolean r0 = r5.cancelled
                if (r0 != 0) goto L13
                r0 = 1
                return r0
            L13:
                r0 = 0
                return r0
        }

        void markedWritability(boolean r1) {
                r0 = this;
                r0.markedWritable = r1
                return
        }

        boolean markedWritability() {
                r1 = this;
                boolean r0 = r1.markedWritable
                return r0
        }

        @Override // io.netty.handler.codec.http2.StreamByteDistributor.StreamState
        public long pendingBytes() {
                r2 = this;
                long r0 = r2.pendingBytes
                return r0
        }

        @Override // io.netty.handler.codec.http2.StreamByteDistributor.StreamState
        public io.netty.handler.codec.http2.Http2Stream stream() {
                r1 = this;
                io.netty.handler.codec.http2.Http2Stream r0 = r1.stream
                return r0
        }

        @Override // io.netty.handler.codec.http2.StreamByteDistributor.StreamState
        public int windowSize() {
                r1 = this;
                int r0 = r1.window
                return r0
        }

        void windowSize(int r1) {
                r0 = this;
                r0.window = r1
                return
        }

        int writeAllocatedBytes(int r9) {
                r8 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r8.writing = r0     // Catch: java.lang.Throwable -> L7e
                r3 = r9
                r4 = 0
            L7:
                boolean r5 = r8.cancelled     // Catch: java.lang.Throwable -> L22
                if (r5 != 0) goto L55
                io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled r5 = r8.peek()     // Catch: java.lang.Throwable -> L22
                if (r5 == 0) goto L55
                int r6 = r8.writableWindow()     // Catch: java.lang.Throwable -> L22
                int r6 = java.lang.Math.min(r3, r6)     // Catch: java.lang.Throwable -> L22
                if (r6 > 0) goto L24
                int r7 = r5.size()     // Catch: java.lang.Throwable -> L22
                if (r7 <= 0) goto L24
                goto L55
            L22:
                r4 = move-exception
                goto L80
            L24:
                int r4 = r5.size()     // Catch: java.lang.Throwable -> L22
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r7 = r8.this$0     // Catch: java.lang.Throwable -> L44
                io.netty.channel.ChannelHandlerContext r7 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$500(r7)     // Catch: java.lang.Throwable -> L44
                int r6 = java.lang.Math.max(r1, r6)     // Catch: java.lang.Throwable -> L44
                r5.write(r7, r6)     // Catch: java.lang.Throwable -> L44
                int r6 = r5.size()     // Catch: java.lang.Throwable -> L44
                if (r6 != 0) goto L46
                java.util.Deque<io.netty.handler.codec.http2.Http2RemoteFlowController$FlowControlled> r6 = r8.pendingWriteQueue     // Catch: java.lang.Throwable -> L44
                r6.remove()     // Catch: java.lang.Throwable -> L44
                r5.writeComplete()     // Catch: java.lang.Throwable -> L44
                goto L46
            L44:
                r6 = move-exception
                goto L4e
            L46:
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L22
                int r4 = r4 - r5
                int r3 = r3 - r4
                r4 = 1
                goto L7
            L4e:
                int r5 = r5.size()     // Catch: java.lang.Throwable -> L22
                int r4 = r4 - r5
                int r3 = r3 - r4
                throw r6     // Catch: java.lang.Throwable -> L22
            L55:
                if (r4 != 0) goto L6b
                r8.writing = r1
                int r9 = r9 - r3
                r8.decrementPendingBytes(r9, r1)
                r8.decrementFlowControlWindow(r9)
                boolean r9 = r8.cancelled
                r0 = -1
                if (r9 == 0) goto L6a
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r8.cancel(r9, r2)
            L6a:
                return r0
            L6b:
                r8.writing = r1
                int r9 = r9 - r3
                r8.decrementPendingBytes(r9, r1)
                r8.decrementFlowControlWindow(r9)
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L7d
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r8.cancel(r0, r2)
            L7d:
                return r9
            L7e:
                r4 = move-exception
                r3 = r9
            L80:
                r8.cancelled = r0     // Catch: java.lang.Throwable -> L95
                r8.writing = r1
                int r9 = r9 - r3
                r8.decrementPendingBytes(r9, r1)
                r8.decrementFlowControlWindow(r9)
                boolean r0 = r8.cancelled
                if (r0 == 0) goto L94
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r8.cancel(r0, r4)
            L94:
                return r9
            L95:
                r0 = move-exception
                r8.writing = r1
                int r9 = r9 - r3
                r8.decrementPendingBytes(r9, r1)
                r8.decrementFlowControlWindow(r9)
                boolean r9 = r8.cancelled
                if (r9 == 0) goto La8
                io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r8.cancel(r9, r2)
            La8:
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ListenerWritabilityMonitor extends io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor implements io.netty.handler.codec.http2.Http2StreamVisitor {
        private final io.netty.handler.codec.http2.Http2RemoteFlowController.Listener listener;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController this$0;

        ListenerWritabilityMonitor(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r2, io.netty.handler.codec.http2.Http2RemoteFlowController.Listener r3) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                r1.listener = r3
                return
        }

        private void checkAllWritabilityChanged() throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r0)
                boolean r1 = r2.isWritableConnection()
                r0.markedWritability(r1)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1100(r0)
                r0.forEachActiveStream(r2)
                return
        }

        private void checkConnectionThenStreamWritabilityChanged(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r3) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                boolean r0 = r2.isWritableConnection()
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r1 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r1)
                boolean r1 = r1.markedWritability()
                if (r0 == r1) goto L14
                r2.checkAllWritabilityChanged()
                return
            L14:
                boolean r0 = r2.isWritable(r3)
                boolean r1 = r3.markedWritability()
                if (r0 == r1) goto L21
                r2.notifyWritabilityChanged(r3)
            L21:
                return
        }

        private void checkStateWritability(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r3) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                boolean r0 = r2.isWritable(r3)
                boolean r1 = r3.markedWritability()
                if (r0 == r1) goto L19
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r0)
                if (r3 != r0) goto L16
                r2.checkAllWritabilityChanged()
                return
            L16:
                r2.notifyWritabilityChanged(r3)
            L19:
                return
        }

        private void notifyWritabilityChanged(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r3) {
                r2 = this;
                boolean r0 = r3.markedWritability()
                r0 = r0 ^ 1
                r3.markedWritability(r0)
                io.netty.handler.codec.http2.Http2RemoteFlowController$Listener r0 = r2.listener     // Catch: java.lang.Throwable -> L13
                io.netty.handler.codec.http2.Http2Stream r3 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState.access$1300(r3)     // Catch: java.lang.Throwable -> L13
                r0.writabilityChanged(r3)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r3 = move-exception
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1400()
                java.lang.String r1 = "Caught Throwable from listener.writabilityChanged"
                r0.error(r1, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void channelWritabilityChange() throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r0)
                boolean r0 = r0.markedWritability()
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r2.this$0
                boolean r1 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1200(r1)
                if (r0 == r1) goto L15
                r2.checkAllWritabilityChanged()
            L15:
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void enqueueFrame(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                super.enqueueFrame(r1, r2)
                r0.checkConnectionThenStreamWritabilityChanged(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void incrementWindowSize(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1, int r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                super.incrementWindowSize(r1, r2)
                r0.checkStateWritability(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void initialWindowSize(int r1) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                super.initialWindowSize(r1)
                boolean r1 = r0.isWritableConnection()
                if (r1 == 0) goto Lc
                r0.checkAllWritabilityChanged()
            Lc:
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void stateCancelled(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r3) {
                r2 = this;
                r2.checkConnectionThenStreamWritabilityChanged(r3)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L4
                return
            L4:
                r3 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Caught unexpected exception from checkAllWritabilityChanged"
                r0.<init>(r1, r3)
                throw r0
        }

        @Override // io.netty.handler.codec.http2.Http2StreamVisitor
        public boolean visit(io.netty.handler.codec.http2.Http2Stream r3) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r3 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$100(r0, r3)
                boolean r0 = r2.isWritable(r3)
                boolean r1 = r3.markedWritability()
                if (r0 == r1) goto L13
                r2.notifyWritabilityChanged(r3)
            L13:
                r3 = 1
                return r3
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor
        void windowSize(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r2, int r3) {
                r1 = this;
                super.windowSize(r2, r3)
                r1.checkStateWritability(r2)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L7
                return
            L7:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = "Caught unexpected exception from window"
                r3.<init>(r0, r2)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class WritabilityMonitor implements io.netty.handler.codec.http2.StreamByteDistributor.Writer {
        private boolean inWritePendingBytes;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController this$0;
        private long totalPendingBytes;


        private WritabilityMonitor(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ WritabilityMonitor(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1, io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        void channelWritabilityChange() throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                return
        }

        void enqueueFrame(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                r1.enqueueFrame(r2)
                return
        }

        final void incrementPendingBytes(int r5) {
                r4 = this;
                long r0 = r4.totalPendingBytes
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.totalPendingBytes = r0
                return
        }

        void incrementWindowSize(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1, int r2) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                r1.incrementStreamWindow(r2)
                return
        }

        void initialWindowSize(int r3) throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                java.lang.String r0 = "newWindowSize"
                io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r0)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r2.this$0
                int r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$200(r0)
                int r0 = r3 - r0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$202(r1, r3)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r3 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection r3 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1100(r3)
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor$1 r1 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor$1
                r1.<init>(r2, r0)
                r3.forEachActiveStream(r1)
                if (r0 <= 0) goto L2d
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r3 = r2.this$0
                boolean r3 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1200(r3)
                if (r3 == 0) goto L2d
                r2.writePendingBytes()
            L2d:
                return
        }

        final boolean isWritable(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r2) {
                r1 = this;
                boolean r0 = r1.isWritableConnection()
                if (r0 == 0) goto Le
                boolean r2 = r2.isWritable()
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        final boolean isWritableConnection() {
                r5 = this;
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r5.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$800(r0)
                int r0 = r0.windowSize()
                long r0 = (long) r0
                long r2 = r5.totalPendingBytes
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1e
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r5.this$0
                boolean r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1200(r0)
                if (r0 == 0) goto L1e
                r0 = 1
                return r0
            L1e:
                r0 = 0
                return r0
        }

        void stateCancelled(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1) {
                r0 = this;
                return
        }

        void windowSize(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState r1, int r2) {
                r0 = this;
                r1.windowSize(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.StreamByteDistributor.Writer
        public final void write(io.netty.handler.codec.http2.Http2Stream r2, int r3) {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = r1.this$0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r2 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$100(r0, r2)
                r2.writeAllocatedBytes(r3)
                return
        }

        final void writePendingBytes() throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                boolean r0 = r3.inWritePendingBytes
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.inWritePendingBytes = r0
                r0 = 0
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r3.this$0     // Catch: java.lang.Throwable -> L2c
                int r1 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$900(r1)     // Catch: java.lang.Throwable -> L2c
            Lf:
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r2 = r3.this$0     // Catch: java.lang.Throwable -> L2c
                io.netty.handler.codec.http2.StreamByteDistributor r2 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$600(r2)     // Catch: java.lang.Throwable -> L2c
                boolean r1 = r2.distribute(r1, r3)     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L2e
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r1 = r3.this$0     // Catch: java.lang.Throwable -> L2c
                int r1 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$900(r1)     // Catch: java.lang.Throwable -> L2c
                if (r1 <= 0) goto L2e
                io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r2 = r3.this$0     // Catch: java.lang.Throwable -> L2c
                boolean r2 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.access$1000(r2)     // Catch: java.lang.Throwable -> L2c
                if (r2 != 0) goto Lf
                goto L2e
            L2c:
                r1 = move-exception
                goto L31
            L2e:
                r3.inWritePendingBytes = r0
                return
            L31:
                r3.inWritePendingBytes = r0
                throw r1
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController> r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.logger = r0
            return
    }

    public DefaultHttp2RemoteFlowController(io.netty.handler.codec.http2.Http2Connection r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultHttp2RemoteFlowController(io.netty.handler.codec.http2.Http2Connection r2, io.netty.handler.codec.http2.Http2RemoteFlowController.Listener r3) {
            r1 = this;
            io.netty.handler.codec.http2.WeightedFairQueueByteDistributor r0 = new io.netty.handler.codec.http2.WeightedFairQueueByteDistributor
            r0.<init>(r2)
            r1.<init>(r2, r0, r3)
            return
    }

    public DefaultHttp2RemoteFlowController(io.netty.handler.codec.http2.Http2Connection r2, io.netty.handler.codec.http2.StreamByteDistributor r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHttp2RemoteFlowController(io.netty.handler.codec.http2.Http2Connection r3, io.netty.handler.codec.http2.StreamByteDistributor r4, io.netty.handler.codec.http2.Http2RemoteFlowController.Listener r5) {
            r2 = this;
            r2.<init>()
            r0 = 65535(0xffff, float:9.1834E-41)
            r2.initialWindowSize = r0
            java.lang.String r0 = "connection"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.Http2Connection r0 = (io.netty.handler.codec.http2.Http2Connection) r0
            r2.connection = r0
            java.lang.String r0 = "streamWriteDistributor"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.handler.codec.http2.StreamByteDistributor r4 = (io.netty.handler.codec.http2.StreamByteDistributor) r4
            r2.streamByteDistributor = r4
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r4 = r3.newKey()
            r2.stateKey = r4
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState
            io.netty.handler.codec.http2.Http2Stream r1 = r3.connectionStream()
            r0.<init>(r2, r1)
            r2.connectionState = r0
            io.netty.handler.codec.http2.Http2Stream r1 = r3.connectionStream()
            r1.setProperty(r4, r0)
            r2.listener(r5)
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r4 = r2.monitor
            int r5 = r2.initialWindowSize
            r4.windowSize(r0, r5)
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$1 r4 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$1
            r4.<init>(r2)
            r3.addListener(r4)
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection.PropertyKey access$000(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.stateKey
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState access$100(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0, io.netty.handler.codec.http2.Http2Stream r1) {
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = r0.state(r1)
            return r0
    }

    static /* synthetic */ boolean access$1000(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            boolean r0 = r0.isChannelWritable0()
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection access$1100(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection
            return r0
    }

    static /* synthetic */ boolean access$1200(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            boolean r0 = r0.isChannelWritable()
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$1400() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.logger
            return r0
    }

    static /* synthetic */ int access$200(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            int r0 = r0.initialWindowSize
            return r0
    }

    static /* synthetic */ int access$202(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0, int r1) {
            r0.initialWindowSize = r1
            return r1
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.WritabilityMonitor access$300(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r0.monitor
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$500(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.StreamByteDistributor access$600(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.handler.codec.http2.StreamByteDistributor r0 = r0.streamByteDistributor
            return r0
    }

    static /* synthetic */ int access$700(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            int r0 = r0.connectionWindowSize()
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState access$800(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = r0.connectionState
            return r0
    }

    static /* synthetic */ int access$900(io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0) {
            int r0 = r0.writableBytes()
            return r0
    }

    private int connectionWindowSize() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r0 = r1.connectionState
            int r0 = r0.windowSize()
            return r0
    }

    private boolean isChannelWritable() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            if (r0 == 0) goto Lc
            boolean r0 = r1.isChannelWritable0()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private boolean isChannelWritable0() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            io.netty.channel.Channel r0 = r0.channel()
            boolean r0 = r0.isWritable()
            return r0
    }

    private int maxUsableChannelBytes() {
            r4 = this;
            io.netty.channel.ChannelHandlerContext r0 = r4.ctx
            io.netty.channel.Channel r0 = r0.channel()
            long r0 = r0.bytesBeforeUnwritable()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)
            int r1 = (int) r0
            if (r1 <= 0) goto L1d
            int r0 = r4.minUsableChannelBytes()
            int r0 = java.lang.Math.max(r1, r0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r1 = r4.connectionState
            int r1 = r1.windowSize()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    private int minUsableChannelBytes() {
            r2 = this;
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.ChannelConfig r0 = r0.config()
            int r0 = r0.getWriteBufferLowWaterMark()
            r1 = 32768(0x8000, float:4.5918E-41)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState state(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.stateKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r2 = (io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController.FlowState) r2
            return r2
    }

    private int writableBytes() {
            r2 = this;
            int r0 = r2.connectionWindowSize()
            int r1 = r2.maxUsableChannelBytes()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public void addFlowControlled(io.netty.handler.codec.http2.Http2Stream r2, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r3) {
            r1 = this;
            java.lang.String r0 = "frame"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor     // Catch: java.lang.Throwable -> Lf
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r2 = r1.state(r2)     // Catch: java.lang.Throwable -> Lf
            r0.enqueueFrame(r2, r3)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            r3.error(r0, r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public io.netty.channel.ChannelHandlerContext channelHandlerContext() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void channelHandlerContext(io.netty.channel.ChannelHandlerContext r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            java.lang.String r0 = "ctx"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelHandlerContext r2 = (io.netty.channel.ChannelHandlerContext) r2
            r1.ctx = r2
            r1.channelWritabilityChanged()
            boolean r2 = r1.isChannelWritable()
            if (r2 == 0) goto L16
            r1.writePendingBytes()
        L16:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public void channelWritabilityChanged() throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor
            r0.channelWritabilityChange()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public boolean hasFlowControlled(io.netty.handler.codec.http2.Http2Stream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r1 = r0.state(r1)
            boolean r1 = r1.hasFrame()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void incrementWindowSize(io.netty.handler.codec.http2.Http2Stream r2, int r3) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r2 = r1.state(r2)
            r0.incrementWindowSize(r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public int initialWindowSize() {
            r1 = this;
            int r0 = r1.initialWindowSize
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void initialWindowSize(int r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor
            r0.initialWindowSize(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public boolean isWritable(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r2 = r1.state(r2)
            boolean r2 = r0.isWritable(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public void listener(io.netty.handler.codec.http2.Http2RemoteFlowController.Listener r2) {
            r1 = this;
            if (r2 != 0) goto L9
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r2 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor
            r0 = 0
            r2.<init>(r1, r0)
            goto Lf
        L9:
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$ListenerWritabilityMonitor r0 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$ListenerWritabilityMonitor
            r0.<init>(r1, r2)
            r2 = r0
        Lf:
            r1.monitor = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public void updateDependencyTree(int r2, int r3, short r4, boolean r5) {
            r1 = this;
            io.netty.handler.codec.http2.StreamByteDistributor r0 = r1.streamByteDistributor
            r0.updateDependencyTree(r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public int windowSize(io.netty.handler.codec.http2.Http2Stream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$FlowState r1 = r0.state(r1)
            int r1 = r1.windowSize()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2RemoteFlowController
    public void writePendingBytes() throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController$WritabilityMonitor r0 = r1.monitor
            r0.writePendingBytes()
            return
    }
}
