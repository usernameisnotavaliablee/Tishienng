package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2LocalFlowController implements io.netty.handler.codec.http2.Http2LocalFlowController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final float DEFAULT_WINDOW_UPDATE_RATIO = 0.5f;
    private static final io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState REDUCED_FLOW_STATE = null;
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.handler.codec.http2.Http2FrameWriter frameWriter;
    private int initialWindowSize;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey stateKey;
    private float windowUpdateRatio;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AutoRefillState extends io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.DefaultState {
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController this$0;

        AutoRefillState(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r1, io.netty.handler.codec.http2.Http2Stream r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.DefaultState, io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public boolean consumeBytes(int r1) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.DefaultState, io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void receiveFlowControlledFrame(int r1) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                super.receiveFlowControlledFrame(r1)
                super.consumeBytes(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DefaultState implements io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean endOfStream;
        private int initialStreamWindowSize;
        private int lowerBound;
        private int processedWindow;
        private final io.netty.handler.codec.http2.Http2Stream stream;
        private float streamWindowUpdateRatio;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController this$0;
        private int window;

        static {
                return
        }

        DefaultState(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r1, io.netty.handler.codec.http2.Http2Stream r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.stream = r2
                r0.window(r3)
                float r1 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.access$600(r1)
                r0.streamWindowUpdateRatio = r1
                return
        }

        private void returnProcessedBytes(int r5) throws io.netty.handler.codec.http2.Http2Exception {
                r4 = this;
                int r0 = r4.processedWindow
                int r1 = r0 - r5
                int r2 = r4.window
                if (r1 < r2) goto Lc
                int r0 = r0 - r5
                r4.processedWindow = r0
                return
            Lc:
                io.netty.handler.codec.http2.Http2Stream r5 = r4.stream
                int r5 = r5.id()
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                io.netty.handler.codec.http2.Http2Stream r1 = r4.stream
                int r1 = r1.id()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "Attempting to return too many bytes for stream %d"
                io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r5, r0, r1, r2)
                throw r5
        }

        private void writeWindowUpdate() throws io.netty.handler.codec.http2.Http2Exception {
                r5 = this;
                int r0 = r5.initialStreamWindowSize
                int r1 = r5.processedWindow
                int r0 = r0 - r1
                r5.incrementFlowControlWindows(r0)     // Catch: java.lang.Throwable -> L28
                io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r1 = r5.this$0
                io.netty.handler.codec.http2.Http2FrameWriter r1 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.access$700(r1)
                io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r2 = r5.this$0
                io.netty.channel.ChannelHandlerContext r2 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.access$400(r2)
                io.netty.handler.codec.http2.Http2Stream r3 = r5.stream
                int r3 = r3.id()
                io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r4 = r5.this$0
                io.netty.channel.ChannelHandlerContext r4 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.access$400(r4)
                io.netty.channel.ChannelPromise r4 = r4.newPromise()
                r1.writeWindowUpdate(r2, r3, r0, r4)
                return
            L28:
                r0 = move-exception
                io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                io.netty.handler.codec.http2.Http2Stream r2 = r5.stream
                int r2 = r2.id()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r2
                java.lang.String r2 = "Attempting to return too many bytes for stream %d"
                io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r1, r0, r2, r3)
                throw r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public boolean consumeBytes(int r1) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                r0.returnProcessedBytes(r1)
                boolean r1 = r0.writeWindowUpdateIfNeeded()
                return r1
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void endOfStream(boolean r1) {
                r0 = this;
                r0.endOfStream = r1
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void incrementFlowControlWindows(int r5) throws io.netty.handler.codec.http2.Http2Exception {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L2a
                int r1 = r4.window
                r2 = 2147483647(0x7fffffff, float:NaN)
                int r2 = r2 - r5
                if (r1 > r2) goto Lc
                goto L2a
            Lc:
                io.netty.handler.codec.http2.Http2Stream r5 = r4.stream
                int r5 = r5.id()
                io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FLOW_CONTROL_ERROR
                io.netty.handler.codec.http2.Http2Stream r2 = r4.stream
                int r2 = r2.id()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r2
                java.lang.String r0 = "Flow control window overflowed for stream: %d"
                io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r5, r1, r0, r3)
                throw r5
            L2a:
                int r1 = r4.window
                int r1 = r1 + r5
                r4.window = r1
                int r1 = r4.processedWindow
                int r1 = r1 + r5
                r4.processedWindow = r1
                if (r5 >= 0) goto L37
                goto L38
            L37:
                r5 = 0
            L38:
                r4.lowerBound = r5
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void incrementInitialStreamWindow(int r5) {
                r4 = this;
                int r0 = r4.initialStreamWindowSize
                long r0 = (long) r0
                long r2 = (long) r5
                long r0 = r0 + r2
                r2 = 0
                long r0 = java.lang.Math.max(r2, r0)
                r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r0 = java.lang.Math.min(r2, r0)
                int r5 = (int) r0
                int r0 = r4.initialStreamWindowSize
                int r5 = r5 - r0
                int r0 = r0 + r5
                r4.initialStreamWindowSize = r0
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public int initialWindowSize() {
                r1 = this;
                int r0 = r1.initialStreamWindowSize
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void receiveFlowControlledFrame(int r5) throws io.netty.handler.codec.http2.Http2Exception {
                r4 = this;
                int r0 = r4.window
                int r0 = r0 - r5
                r4.window = r0
                int r5 = r4.lowerBound
                if (r0 < r5) goto La
                return
            La:
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
                java.lang.String r1 = "Flow control window exceeded for stream: %d"
                io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r5, r0, r1, r2)
                throw r5
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public int unconsumedBytes() {
                r2 = this;
                int r0 = r2.processedWindow
                int r1 = r2.window
                int r0 = r0 - r1
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void window(int r1) {
                r0 = this;
                r0.initialStreamWindowSize = r1
                r0.processedWindow = r1
                r0.window = r1
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public int windowSize() {
                r1 = this;
                int r0 = r1.window
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public float windowUpdateRatio() {
                r1 = this;
                float r0 = r1.streamWindowUpdateRatio
                return r0
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public void windowUpdateRatio(float r1) {
                r0 = this;
                r0.streamWindowUpdateRatio = r1
                return
        }

        @Override // io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState
        public boolean writeWindowUpdateIfNeeded() throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                boolean r0 = r3.endOfStream
                r1 = 0
                if (r0 != 0) goto L19
                int r0 = r3.initialStreamWindowSize
                if (r0 > 0) goto La
                goto L19
            La:
                float r0 = (float) r0
                float r2 = r3.streamWindowUpdateRatio
                float r0 = r0 * r2
                int r0 = (int) r0
                int r2 = r3.processedWindow
                if (r2 > r0) goto L19
                r3.writeWindowUpdate()
                r0 = 1
                return r0
            L19:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface FlowState {
        boolean consumeBytes(int r1) throws io.netty.handler.codec.http2.Http2Exception;

        void endOfStream(boolean r1);

        void incrementFlowControlWindows(int r1) throws io.netty.handler.codec.http2.Http2Exception;

        void incrementInitialStreamWindow(int r1);

        int initialWindowSize();

        void receiveFlowControlledFrame(int r1) throws io.netty.handler.codec.http2.Http2Exception;

        int unconsumedBytes();

        void window(int r1);

        int windowSize();

        float windowUpdateRatio();

        void windowUpdateRatio(float r1);

        boolean writeWindowUpdateIfNeeded() throws io.netty.handler.codec.http2.Http2Exception;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class WindowUpdateVisitor implements io.netty.handler.codec.http2.Http2StreamVisitor {
        private io.netty.handler.codec.http2.Http2Exception.CompositeStreamException compositeException;
        private final int delta;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController this$0;

        WindowUpdateVisitor(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.delta = r2
                return
        }

        public void throwIfError() throws io.netty.handler.codec.http2.Http2Exception.CompositeStreamException {
                r1 = this;
                io.netty.handler.codec.http2.Http2Exception$CompositeStreamException r0 = r1.compositeException
                if (r0 != 0) goto L5
                return
            L5:
                throw r0
        }

        @Override // io.netty.handler.codec.http2.Http2StreamVisitor
        public boolean visit(io.netty.handler.codec.http2.Http2Stream r4) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0 = r3.this$0     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r4 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.access$300(r0, r4)     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                int r0 = r3.delta     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                r4.incrementFlowControlWindows(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                int r0 = r3.delta     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                r4.incrementInitialStreamWindow(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception.StreamException -> L11
                goto L27
            L11:
                r4 = move-exception
                io.netty.handler.codec.http2.Http2Exception$CompositeStreamException r0 = r3.compositeException
                if (r0 != 0) goto L22
                io.netty.handler.codec.http2.Http2Exception$CompositeStreamException r0 = new io.netty.handler.codec.http2.Http2Exception$CompositeStreamException
                io.netty.handler.codec.http2.Http2Error r1 = r4.error()
                r2 = 4
                r0.<init>(r1, r2)
                r3.compositeException = r0
            L22:
                io.netty.handler.codec.http2.Http2Exception$CompositeStreamException r0 = r3.compositeException
                r0.add(r4)
            L27:
                r4 = 1
                return r4
        }
    }

    static {
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$2 r0 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$2
            r0.<init>()
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.REDUCED_FLOW_STATE = r0
            return
    }

    public DefaultHttp2LocalFlowController(io.netty.handler.codec.http2.Http2Connection r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public DefaultHttp2LocalFlowController(io.netty.handler.codec.http2.Http2Connection r3, float r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 65535(0xffff, float:9.1834E-41)
            r2.initialWindowSize = r0
            java.lang.String r0 = "connection"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.Http2Connection r0 = (io.netty.handler.codec.http2.Http2Connection) r0
            r2.connection = r0
            r2.windowUpdateRatio(r4)
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r4 = r3.newKey()
            r2.stateKey = r4
            if (r5 == 0) goto L29
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$AutoRefillState r5 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$AutoRefillState
            io.netty.handler.codec.http2.Http2Stream r0 = r3.connectionStream()
            int r1 = r2.initialWindowSize
            r5.<init>(r2, r0, r1)
            goto L34
        L29:
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$DefaultState r5 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$DefaultState
            io.netty.handler.codec.http2.Http2Stream r0 = r3.connectionStream()
            int r1 = r2.initialWindowSize
            r5.<init>(r2, r0, r1)
        L34:
            io.netty.handler.codec.http2.Http2Stream r0 = r3.connectionStream()
            r0.setProperty(r4, r5)
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$1 r4 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$1
            r4.<init>(r2)
            r3.addListener(r4)
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection.PropertyKey access$000(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.stateKey
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState access$100() {
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r0 = io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.REDUCED_FLOW_STATE
            return r0
    }

    static /* synthetic */ int access$200(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            int r0 = r0.initialWindowSize
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState access$300(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0, io.netty.handler.codec.http2.Http2Stream r1) {
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r0 = r0.state(r1)
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$400(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState access$500(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r0 = r0.connectionState()
            return r0
    }

    static /* synthetic */ float access$600(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            float r0 = r0.windowUpdateRatio
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameWriter access$700(io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r0) {
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r0.frameWriter
            return r0
    }

    private static void checkValidRatio(float r4) {
            double r0 = (double) r4
            r2 = 0
            int r2 = java.lang.Double.compare(r0, r2)
            if (r2 <= 0) goto L12
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 >= 0) goto L12
            return
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ratio: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState connectionState() {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            io.netty.handler.codec.http2.Http2Stream r0 = r0.connectionStream()
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r2.stateKey
            java.lang.Object r0 = r0.getProperty(r1)
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r0 = (io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState) r0
            return r0
    }

    private static boolean isClosed(io.netty.handler.codec.http2.Http2Stream r1) {
            io.netty.handler.codec.http2.Http2Stream$State r1 = r1.state()
            io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.CLOSED
            if (r1 != r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState state(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.stateKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r2 = (io.netty.handler.codec.http2.DefaultHttp2LocalFlowController.FlowState) r2
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void channelHandlerContext(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            java.lang.String r0 = "ctx"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelHandlerContext r2 = (io.netty.channel.ChannelHandlerContext) r2
            r1.ctx = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public boolean consumeBytes(io.netty.handler.codec.http2.Http2Stream r3, int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            java.lang.String r0 = "numBytes"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r4, r0)
            r0 = 0
            if (r4 != 0) goto L9
            return r0
        L9:
            if (r3 == 0) goto L31
            boolean r1 = isClosed(r3)
            if (r1 != 0) goto L31
            int r0 = r3.id()
            if (r0 == 0) goto L29
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r0 = r2.connectionState()
            boolean r0 = r0.consumeBytes(r4)
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r3 = r2.state(r3)
            boolean r3 = r3.consumeBytes(r4)
            r3 = r3 | r0
            return r3
        L29:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Returning bytes for the connection window is not supported"
            r3.<init>(r4)
            throw r3
        L31:
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public io.netty.handler.codec.http2.DefaultHttp2LocalFlowController frameWriter(io.netty.handler.codec.http2.Http2FrameWriter r2) {
            r1 = this;
            java.lang.String r0 = "frameWriter"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2FrameWriter r2 = (io.netty.handler.codec.http2.Http2FrameWriter) r2
            r1.frameWriter = r2
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http2.Http2LocalFlowController frameWriter(io.netty.handler.codec.http2.Http2FrameWriter r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController r1 = r0.frameWriter(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void incrementWindowSize(io.netty.handler.codec.http2.Http2Stream r1, int r2) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            r1.incrementInitialStreamWindow(r2)
            r1.writeWindowUpdateIfNeeded()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public int initialWindowSize() {
            r1 = this;
            int r0 = r1.initialWindowSize
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public int initialWindowSize(io.netty.handler.codec.http2.Http2Stream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            int r1 = r1.initialWindowSize()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public void initialWindowSize(int r2) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            int r0 = r1.initialWindowSize
            int r0 = r2 - r0
            r1.initialWindowSize = r2
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$WindowUpdateVisitor r2 = new io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$WindowUpdateVisitor
            r2.<init>(r1, r0)
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            r0.forEachActiveStream(r2)
            r2.throwIfError()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public void receiveFlowControlledFrame(io.netty.handler.codec.http2.Http2Stream r2, io.netty.buffer.ByteBuf r3, int r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            int r3 = r3.readableBytes()
            int r3 = r3 + r4
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r4 = r1.connectionState()
            r4.receiveFlowControlledFrame(r3)
            if (r2 == 0) goto L1f
            boolean r0 = isClosed(r2)
            if (r0 != 0) goto L1f
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r2 = r1.state(r2)
            r2.endOfStream(r5)
            r2.receiveFlowControlledFrame(r3)
            return
        L1f:
            if (r3 <= 0) goto L24
            r4.consumeBytes(r3)
        L24:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2LocalFlowController
    public int unconsumedBytes(io.netty.handler.codec.http2.Http2Stream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            int r1 = r1.unconsumedBytes()
            return r1
    }

    @Override // io.netty.handler.codec.http2.Http2FlowController
    public int windowSize(io.netty.handler.codec.http2.Http2Stream r1) {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            int r1 = r1.windowSize()
            return r1
    }

    public float windowUpdateRatio() {
            r1 = this;
            float r0 = r1.windowUpdateRatio
            return r0
    }

    public float windowUpdateRatio(io.netty.handler.codec.http2.Http2Stream r1) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            float r1 = r1.windowUpdateRatio()
            return r1
    }

    public void windowUpdateRatio(float r1) {
            r0 = this;
            checkValidRatio(r1)
            r0.windowUpdateRatio = r1
            return
    }

    public void windowUpdateRatio(io.netty.handler.codec.http2.Http2Stream r1, float r2) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            checkValidRatio(r2)
            io.netty.handler.codec.http2.DefaultHttp2LocalFlowController$FlowState r1 = r0.state(r1)
            r1.windowUpdateRatio(r2)
            r1.writeWindowUpdateIfNeeded()
            return
    }
}
