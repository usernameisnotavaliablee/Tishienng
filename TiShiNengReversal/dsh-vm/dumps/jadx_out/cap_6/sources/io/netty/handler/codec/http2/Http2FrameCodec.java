package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2FrameCodec extends io.netty.handler.codec.http2.Http2ConnectionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.internal.logging.InternalLogger LOG = null;
    private final io.netty.channel.ChannelFutureListener bufferedStreamsListener;
    io.netty.channel.ChannelHandlerContext ctx;
    private final io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream> frameStreamToInitializeMap;
    private final java.lang.Integer initialFlowControlWindowSize;
    private int numBufferedStreams;
    protected final io.netty.handler.codec.http2.Http2Connection.PropertyKey streamKey;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey upgradeKey;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ConnectionListener extends io.netty.handler.codec.http2.Http2ConnectionAdapter {
        final /* synthetic */ io.netty.handler.codec.http2.Http2FrameCodec this$0;

        private ConnectionListener(io.netty.handler.codec.http2.Http2FrameCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ConnectionListener(io.netty.handler.codec.http2.Http2FrameCodec r1, io.netty.handler.codec.http2.Http2FrameCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void onHttp2StreamStateChanged0(io.netty.handler.codec.http2.Http2Stream r3) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.streamKey
                java.lang.Object r3 = r3.getProperty(r0)
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r3 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r3
                if (r3 == 0) goto L13
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.channel.ChannelHandlerContext r1 = r0.ctx
                r0.onHttp2StreamStateChanged(r1, r3)
            L13:
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionAdapter, io.netty.handler.codec.http2.Http2Connection.Listener
        public void onStreamActive(io.netty.handler.codec.http2.Http2Stream r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r1.this$0
                io.netty.handler.codec.http2.Http2FrameCodec.access$600(r0, r2)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionAdapter, io.netty.handler.codec.http2.Http2Connection.Listener
        public void onStreamAdded(io.netty.handler.codec.http2.Http2Stream r3) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.util.collection.IntObjectMap r0 = io.netty.handler.codec.http2.Http2FrameCodec.access$500(r0)
                int r1 = r3.id()
                java.lang.Object r0 = r0.remove(r1)
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r0
                if (r0 == 0) goto L19
                io.netty.handler.codec.http2.Http2FrameCodec r1 = r2.this$0
                io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r1.streamKey
                r0.setStreamAndProperty(r1, r3)
            L19:
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionAdapter, io.netty.handler.codec.http2.Http2Connection.Listener
        public void onStreamClosed(io.netty.handler.codec.http2.Http2Stream r1) {
                r0 = this;
                r0.onHttp2StreamStateChanged0(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2ConnectionAdapter, io.netty.handler.codec.http2.Http2Connection.Listener
        public void onStreamHalfClosed(io.netty.handler.codec.http2.Http2Stream r1) {
                r0 = this;
                r0.onHttp2StreamStateChanged0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DefaultHttp2FrameStream implements io.netty.handler.codec.http2.Http2FrameStream {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        io.netty.channel.Channel attachment;
        private volatile int id;
        final io.netty.handler.codec.http2.Http2FrameStreamEvent stateChanged;
        volatile io.netty.handler.codec.http2.Http2Stream stream;
        final io.netty.handler.codec.http2.Http2FrameStreamEvent writabilityChanged;

        static {
                return
        }

        DefaultHttp2FrameStream() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.id = r0
                io.netty.handler.codec.http2.Http2FrameStreamEvent r0 = io.netty.handler.codec.http2.Http2FrameStreamEvent.stateChanged(r1)
                r1.stateChanged = r0
                io.netty.handler.codec.http2.Http2FrameStreamEvent r0 = io.netty.handler.codec.http2.Http2FrameStreamEvent.writabilityChanged(r1)
                r1.writabilityChanged = r0
                return
        }

        static /* synthetic */ int access$402(io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r0, int r1) {
                r0.id = r1
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2FrameStream
        public int id() {
                r1 = this;
                io.netty.handler.codec.http2.Http2Stream r0 = r1.stream
                if (r0 != 0) goto L7
                int r0 = r1.id
                return r0
            L7:
                int r0 = r0.id()
                return r0
        }

        io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream setStreamAndProperty(io.netty.handler.codec.http2.Http2Connection.PropertyKey r1, io.netty.handler.codec.http2.Http2Stream r2) {
                r0 = this;
                r0.stream = r2
                r2.setProperty(r1, r0)
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2FrameStream
        public io.netty.handler.codec.http2.Http2Stream.State state() {
                r1 = this;
                io.netty.handler.codec.http2.Http2Stream r0 = r1.stream
                if (r0 != 0) goto L7
                io.netty.handler.codec.http2.Http2Stream$State r0 = io.netty.handler.codec.http2.Http2Stream.State.IDLE
                return r0
            L7:
                io.netty.handler.codec.http2.Http2Stream$State r0 = r0.state()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                int r0 = r1.id()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FrameListener implements io.netty.handler.codec.http2.Http2FrameListener {
        final /* synthetic */ io.netty.handler.codec.http2.Http2FrameCodec this$0;

        private FrameListener(io.netty.handler.codec.http2.Http2FrameCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ FrameListener(io.netty.handler.codec.http2.Http2FrameCodec r1, io.netty.handler.codec.http2.Http2FrameCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private io.netty.handler.codec.http2.Http2FrameStream requireStream(int r4) {
                r3 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r3.this$0
                io.netty.handler.codec.http2.Http2Connection r0 = r0.connection()
                io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r4)
                io.netty.handler.codec.http2.Http2FrameCodec r1 = r3.this$0
                io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r1.streamKey
                java.lang.Object r0 = r0.getProperty(r1)
                io.netty.handler.codec.http2.Http2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameStream) r0
                if (r0 == 0) goto L17
                return r0
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Stream object required for identifier: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public int onDataRead(io.netty.channel.ChannelHandlerContext r3, int r4, io.netty.buffer.ByteBuf r5, int r6, boolean r7) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2DataFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2DataFrame
                r1.<init>(r5, r7, r6)
                io.netty.handler.codec.http2.Http2FrameStream r4 = r2.requireStream(r4)
                io.netty.handler.codec.http2.DefaultHttp2DataFrame r4 = r1.stream(r4)
                io.netty.handler.codec.http2.DefaultHttp2DataFrame r4 = r4.mo39retain()
                r0.onHttp2Frame(r3, r4)
                r3 = 0
                return r3
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onGoAwayRead(io.netty.channel.ChannelHandlerContext r3, int r4, long r5, io.netty.buffer.ByteBuf r7) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame
                r1.<init>(r4, r5, r7)
                io.netty.handler.codec.http2.Http2GoAwayFrame r4 = r1.mo39retain()
                r0.onHttp2Frame(r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r1, int r2, io.netty.handler.codec.http2.Http2Headers r3, int r4, short r5, boolean r6, int r7, boolean r8) {
                r0 = this;
                r4 = r3
                r5 = r7
                r6 = r8
                r3 = r2
                r2 = r1
                r1 = r0
                r1.onHeadersRead(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onHeadersRead(io.netty.channel.ChannelHandlerContext r3, int r4, io.netty.handler.codec.http2.Http2Headers r5, int r6, boolean r7) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2HeadersFrame
                r1.<init>(r5, r7, r6)
                io.netty.handler.codec.http2.Http2FrameStream r4 = r2.requireStream(r4)
                io.netty.handler.codec.http2.DefaultHttp2HeadersFrame r4 = r1.stream(r4)
                r0.onHttp2Frame(r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingAckRead(io.netty.channel.ChannelHandlerContext r4, long r5) {
                r3 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r3.this$0
                io.netty.handler.codec.http2.DefaultHttp2PingFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2PingFrame
                r2 = 1
                r1.<init>(r5, r2)
                r0.onHttp2Frame(r4, r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPingRead(io.netty.channel.ChannelHandlerContext r4, long r5) {
                r3 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r3.this$0
                io.netty.handler.codec.http2.DefaultHttp2PingFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2PingFrame
                r2 = 0
                r1.<init>(r5, r2)
                r0.onHttp2Frame(r4, r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPriorityRead(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, short r4, boolean r5) {
                r0 = this;
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onPushPromiseRead(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, io.netty.handler.codec.http2.Http2Headers r4, int r5) {
                r0 = this;
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onRstStreamRead(io.netty.channel.ChannelHandlerContext r3, int r4, long r5) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2ResetFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2ResetFrame
                r1.<init>(r5)
                io.netty.handler.codec.http2.Http2FrameStream r4 = r2.requireStream(r4)
                io.netty.handler.codec.http2.DefaultHttp2ResetFrame r4 = r1.stream(r4)
                r0.onHttp2Frame(r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsAckRead(io.netty.channel.ChannelHandlerContext r3) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.Http2SettingsAckFrame r1 = io.netty.handler.codec.http2.Http2SettingsAckFrame.INSTANCE
                r0.onHttp2Frame(r3, r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onSettingsRead(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http2.Http2Settings r4) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2SettingsFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2SettingsFrame
                r1.<init>(r4)
                r0.onHttp2Frame(r3, r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onUnknownFrame(io.netty.channel.ChannelHandlerContext r3, byte r4, int r5, io.netty.handler.codec.http2.Http2Flags r6, io.netty.buffer.ByteBuf r7) {
                r2 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2UnknownFrame
                r1.<init>(r4, r6, r7)
                io.netty.handler.codec.http2.Http2FrameStream r4 = r2.requireStream(r5)
                io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r4 = r1.stream(r4)
                io.netty.handler.codec.http2.DefaultHttp2UnknownFrame r4 = r4.mo39retain()
                r0.onHttp2Frame(r3, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FrameListener
        public void onWindowUpdateRead(io.netty.channel.ChannelHandlerContext r3, int r4, int r5) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r1 = new io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame
                r1.<init>(r5)
                io.netty.handler.codec.http2.Http2FrameStream r4 = r2.requireStream(r4)
                io.netty.handler.codec.http2.DefaultHttp2WindowUpdateFrame r4 = r1.stream(r4)
                r0.onHttp2Frame(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Http2RemoteFlowControllerListener implements io.netty.handler.codec.http2.Http2RemoteFlowController.Listener {
        final /* synthetic */ io.netty.handler.codec.http2.Http2FrameCodec this$0;

        private Http2RemoteFlowControllerListener(io.netty.handler.codec.http2.Http2FrameCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Http2RemoteFlowControllerListener(io.netty.handler.codec.http2.Http2FrameCodec r1, io.netty.handler.codec.http2.Http2FrameCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.Listener
        public void writabilityChanged(io.netty.handler.codec.http2.Http2Stream r5) {
                r4 = this;
                io.netty.handler.codec.http2.Http2FrameCodec r0 = r4.this$0
                io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r0.streamKey
                java.lang.Object r0 = r5.getProperty(r0)
                io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r0
                if (r0 != 0) goto Ld
                return
            Ld:
                io.netty.handler.codec.http2.Http2FrameCodec r1 = r4.this$0
                io.netty.channel.ChannelHandlerContext r2 = r1.ctx
                io.netty.handler.codec.http2.Http2Connection r3 = r1.connection()
                io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.remote()
                io.netty.handler.codec.http2.Http2FlowController r3 = r3.flowController()
                io.netty.handler.codec.http2.Http2RemoteFlowController r3 = (io.netty.handler.codec.http2.Http2RemoteFlowController) r3
                boolean r5 = r3.isWritable(r5)
                io.netty.handler.codec.http2.Http2FrameCodec.access$700(r1, r2, r0, r5)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.codec.http2.Http2FrameCodec> r0 = io.netty.handler.codec.http2.Http2FrameCodec.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.Http2FrameCodec.LOG = r0
            return
    }

    Http2FrameCodec(io.netty.handler.codec.http2.Http2ConnectionEncoder r1, io.netty.handler.codec.http2.Http2ConnectionDecoder r2, io.netty.handler.codec.http2.Http2Settings r3, boolean r4) {
            r0 = this;
            r0.<init>(r2, r1, r3, r4)
            io.netty.util.collection.IntObjectHashMap r1 = new io.netty.util.collection.IntObjectHashMap
            r4 = 8
            r1.<init>(r4)
            r0.frameStreamToInitializeMap = r1
            io.netty.handler.codec.http2.Http2FrameCodec$1 r1 = new io.netty.handler.codec.http2.Http2FrameCodec$1
            r1.<init>(r0)
            r0.bufferedStreamsListener = r1
            io.netty.handler.codec.http2.Http2FrameCodec$FrameListener r1 = new io.netty.handler.codec.http2.Http2FrameCodec$FrameListener
            r4 = 0
            r1.<init>(r0, r4)
            r2.frameListener(r1)
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.Http2FrameCodec$ConnectionListener r2 = new io.netty.handler.codec.http2.Http2FrameCodec$ConnectionListener
            r2.<init>(r0, r4)
            r1.addListener(r2)
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.remote()
            io.netty.handler.codec.http2.Http2FlowController r1 = r1.flowController()
            io.netty.handler.codec.http2.Http2RemoteFlowController r1 = (io.netty.handler.codec.http2.Http2RemoteFlowController) r1
            io.netty.handler.codec.http2.Http2FrameCodec$Http2RemoteFlowControllerListener r2 = new io.netty.handler.codec.http2.Http2FrameCodec$Http2RemoteFlowControllerListener
            r2.<init>(r0, r4)
            r1.listener(r2)
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r1.newKey()
            r0.streamKey = r1
            io.netty.handler.codec.http2.Http2Connection r1 = r0.connection()
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r1.newKey()
            r0.upgradeKey = r1
            java.lang.Integer r1 = r3.initialWindowSize()
            r0.initialFlowControlWindowSize = r1
            return
    }

    static /* synthetic */ int access$010(io.netty.handler.codec.http2.Http2FrameCodec r2) {
            int r0 = r2.numBufferedStreams
            int r1 = r0 + (-1)
            r2.numBufferedStreams = r1
            return r0
    }

    static /* synthetic */ io.netty.util.collection.IntObjectMap access$500(io.netty.handler.codec.http2.Http2FrameCodec r0) {
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream> r0 = r0.frameStreamToInitializeMap
            return r0
    }

    static /* synthetic */ void access$600(io.netty.handler.codec.http2.Http2FrameCodec r0, io.netty.handler.codec.http2.Http2Stream r1) {
            r0.onStreamActive0(r1)
            return
    }

    static /* synthetic */ void access$700(io.netty.handler.codec.http2.Http2FrameCodec r0, io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r2, boolean r3) {
            r0.onHttp2StreamWritabilityChanged(r1, r2, r3)
            return
    }

    private void increaseInitialConnectionWindow(int r3) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            io.netty.handler.codec.http2.Http2FlowController r0 = r0.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r0 = (io.netty.handler.codec.http2.Http2LocalFlowController) r0
            io.netty.handler.codec.http2.Http2Connection r1 = r2.connection()
            io.netty.handler.codec.http2.Http2Stream r1 = r1.connectionStream()
            r0.incrementWindowSize(r1, r3)
            return
    }

    private void onHttp2StreamWritabilityChanged(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r2, boolean r3) {
            r0 = this;
            io.netty.handler.codec.http2.Http2FrameStreamEvent r2 = r2.writabilityChanged
            r1.fireUserEventTriggered(r2)
            return
    }

    private void onHttp2UnknownStreamError(io.netty.channel.ChannelHandlerContext r2, java.lang.Throwable r3, io.netty.handler.codec.http2.Http2Exception.StreamException r4) {
            r1 = this;
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http2.Http2FrameCodec.LOG
            int r4 = r4.streamId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "Stream exception thrown for unknown stream {}."
            r2.warn(r0, r4, r3)
            return
    }

    private void onStreamActive0(io.netty.handler.codec.http2.Http2Stream r3) {
            r2 = this;
            int r0 = r3.id()
            r1 = 1
            if (r0 == r1) goto L1a
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()
            int r1 = r3.id()
            boolean r0 = r0.isValidStreamId(r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = r2.newStream()
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r2.streamKey
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r3 = r0.setStreamAndProperty(r1, r3)
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            r2.onHttp2StreamStateChanged(r0, r3)
            return
    }

    private void onUpgradeEvent(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent r2) {
            r0 = this;
            r1.fireUserEventTriggered(r2)
            return
    }

    private void tryExpandConnectionFlowControlWindow(io.netty.handler.codec.http2.Http2Connection r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            java.lang.Integer r0 = r3.initialFlowControlWindowSize
            if (r0 == 0) goto L2d
            io.netty.handler.codec.http2.Http2Stream r0 = r4.connectionStream()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r4 = r4.local()
            io.netty.handler.codec.http2.Http2FlowController r4 = r4.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r4 = (io.netty.handler.codec.http2.Http2LocalFlowController) r4
            java.lang.Integer r1 = r3.initialFlowControlWindowSize
            int r1 = r1.intValue()
            int r2 = r4.initialWindowSize(r0)
            int r1 = r1 - r2
            if (r1 <= 0) goto L2d
            int r2 = r1 << 1
            int r1 = java.lang.Math.max(r2, r1)
            r4.incrementWindowSize(r0, r1)
            io.netty.channel.ChannelHandlerContext r4 = r3.ctx
            r3.flush(r4)
        L2d:
            return
    }

    private void writeGoAwayFrame(io.netty.channel.ChannelHandlerContext r10, io.netty.handler.codec.http2.Http2GoAwayFrame r11, io.netty.channel.ChannelPromise r12) {
            r9 = this;
            int r0 = r11.lastStreamId()
            r1 = -1
            if (r0 > r1) goto L36
            io.netty.handler.codec.http2.Http2Connection r0 = r9.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()
            int r0 = r0.lastStreamCreated()
            long r0 = (long) r0
            int r2 = r11.extraStreamIds()
            long r2 = (long) r2
            r4 = 2
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L26
            r0 = r2
        L26:
            int r4 = (int) r0
            long r5 = r11.errorCode()
            io.netty.buffer.ByteBuf r7 = r11.content()
            r2 = r9
            r3 = r10
            r8 = r12
            r2.goAway(r3, r4, r5, r7, r8)
            return
        L36:
            r11.release()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Last stream id must not be set on GOAWAY frame"
            r10.<init>(r11)
            throw r10
    }

    private void writeHeadersFrame(io.netty.channel.ChannelHandlerContext r8, io.netty.handler.codec.http2.Http2HeadersFrame r9, io.netty.channel.ChannelPromise r10) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameStream r0 = r9.stream()
            int r0 = r0.id()
            boolean r0 = io.netty.handler.codec.http2.Http2CodecUtil.isStreamIdValid(r0)
            if (r0 == 0) goto L2c
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r7.encoder()
            io.netty.handler.codec.http2.Http2FrameStream r1 = r9.stream()
            int r2 = r1.id()
            io.netty.handler.codec.http2.Http2Headers r3 = r9.headers()
            int r4 = r9.padding()
            boolean r5 = r9.isEndStream()
            r1 = r8
            r6 = r10
            r0.writeHeaders(r1, r2, r3, r4, r5, r6)
            return
        L2c:
            io.netty.handler.codec.http2.Http2FrameStream r0 = r9.stream()
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream) r0
            io.netty.handler.codec.http2.Http2Connection r1 = r7.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r2 = r1.local()
            int r2 = r2.incrementAndGetNextStreamId()
            if (r2 >= 0) goto L6e
            io.netty.handler.codec.http2.Http2NoMoreStreamIdsException r0 = new io.netty.handler.codec.http2.Http2NoMoreStreamIdsException
            r0.<init>()
            r10.setFailure(r0)
            io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame r0 = new io.netty.handler.codec.http2.DefaultHttp2GoAwayFrame
            boolean r1 = r1.isServer()
            if (r1 == 0) goto L54
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L57
        L54:
            r1 = 2147483646(0x7ffffffe, float:NaN)
        L57:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.NO_ERROR
            long r2 = r2.code()
            io.netty.buffer.ByteBufAllocator r4 = r8.alloc()
            java.lang.String r5 = "Stream IDs exhausted on local stream creation"
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.ByteBufUtil.writeAscii(r4, r5)
            r0.<init>(r1, r2, r4)
            r7.onHttp2Frame(r8, r0)
            return
        L6e:
            io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream.access$402(r0, r2)
            io.netty.util.collection.IntObjectMap<io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream> r3 = r7.frameStreamToInitializeMap
            r3.put(r2, r0)
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r7.encoder()
            io.netty.handler.codec.http2.Http2Headers r3 = r9.headers()
            int r4 = r9.padding()
            boolean r5 = r9.isEndStream()
            r1 = r8
            r6 = r10
            r0.writeHeaders(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.isDone()
            if (r0 != 0) goto L9c
            int r0 = r7.numBufferedStreams
            int r0 = r0 + 1
            r7.numBufferedStreams = r0
            io.netty.channel.ChannelFutureListener r0 = r7.bufferedStreamsListener
            r10.addListener(r0)
        L9c:
            return
    }

    final boolean consumeBytes(int r3, int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r3)
            if (r0 == 0) goto L1f
            r1 = 1
            if (r3 != r1) goto L1f
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r3 = r2.upgradeKey
            java.lang.Object r3 = r0.getProperty(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L1f
            r3 = 0
            return r3
        L1f:
            io.netty.handler.codec.http2.Http2Connection r3 = r2.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.local()
            io.netty.handler.codec.http2.Http2FlowController r3 = r3.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r3 = (io.netty.handler.codec.http2.Http2LocalFlowController) r3
            boolean r3 = r3.consumeBytes(r0, r4)
            return r3
    }

    final void forEachActiveStream(io.netty.handler.codec.http2.Http2FrameStreamVisitor r3) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            int r0 = r0.numActiveStreams()
            if (r0 <= 0) goto L16
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection()
            io.netty.handler.codec.http2.Http2FrameCodec$2 r1 = new io.netty.handler.codec.http2.Http2FrameCodec$2
            r1.<init>(r2, r3)
            r0.forEachActiveStream(r1)
        L16:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public final void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r1.ctx = r2
            super.handlerAdded(r2)
            r1.handlerAdded0(r2)
            io.netty.handler.codec.http2.Http2Connection r2 = r1.connection()
            boolean r0 = r2.isServer()
            if (r0 == 0) goto L15
            r1.tryExpandConnectionFlowControlWindow(r2)
        L15:
            return
    }

    void handlerAdded0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler
    protected final boolean isGracefulShutdownComplete() {
            r1 = this;
            boolean r0 = super.isGracefulShutdownComplete()
            if (r0 == 0) goto Lc
            int r0 = r1.numBufferedStreams
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream newStream() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream r0 = new io.netty.handler.codec.http2.Http2FrameCodec$DefaultHttp2FrameStream
            r0.<init>()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler
    protected void onConnectionError(io.netty.channel.ChannelHandlerContext r1, boolean r2, java.lang.Throwable r3, io.netty.handler.codec.http2.Http2Exception r4) {
            r0 = this;
            if (r2 != 0) goto L5
            r1.fireExceptionCaught(r3)
        L5:
            super.onConnectionError(r1, r2, r3, r4)
            return
    }

    void onHttp2Frame(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2Frame r2) {
            r0 = this;
            r1.fireChannelRead(r2)
            return
    }

    void onHttp2FrameStreamException(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2FrameStreamException r2) {
            r0 = this;
            r1.fireExceptionCaught(r2)
            return
    }

    void onHttp2StreamStateChanged(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2FrameCodec.DefaultHttp2FrameStream r2) {
            r0 = this;
            io.netty.handler.codec.http2.Http2FrameStreamEvent r2 = r2.stateChanged
            r1.fireUserEventTriggered(r2)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler
    protected final void onStreamError(io.netty.channel.ChannelHandlerContext r3, boolean r4, java.lang.Throwable r5, io.netty.handler.codec.http2.Http2Exception.StreamException r6) {
            r2 = this;
            int r0 = r6.streamId()
            io.netty.handler.codec.http2.Http2Connection r1 = r2.connection()
            io.netty.handler.codec.http2.Http2Stream r0 = r1.stream(r0)
            if (r0 != 0) goto L15
            r2.onHttp2UnknownStreamError(r3, r5, r6)
            super.onStreamError(r3, r4, r5, r6)
            return
        L15:
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r2.streamKey
            java.lang.Object r0 = r0.getProperty(r1)
            io.netty.handler.codec.http2.Http2FrameStream r0 = (io.netty.handler.codec.http2.Http2FrameStream) r0
            if (r0 != 0) goto L2a
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http2.Http2FrameCodec.LOG
            java.lang.String r1 = "Stream exception thrown without stream object attached."
            r0.warn(r1, r5)
            super.onStreamError(r3, r4, r5, r6)
            return
        L2a:
            if (r4 != 0) goto L38
            io.netty.handler.codec.http2.Http2FrameStreamException r4 = new io.netty.handler.codec.http2.Http2FrameStreamException
            io.netty.handler.codec.http2.Http2Error r6 = r6.error()
            r4.<init>(r0, r6, r5)
            r2.onHttp2FrameStreamException(r3, r4)
        L38:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public final void userEventTriggered(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6) throws java.lang.Exception {
            r4 = this;
            io.netty.handler.codec.http2.Http2ConnectionPrefaceAndSettingsFrameWrittenEvent r0 = io.netty.handler.codec.http2.Http2ConnectionPrefaceAndSettingsFrameWrittenEvent.INSTANCE
            if (r6 != r0) goto Lc
            io.netty.handler.codec.http2.Http2Connection r0 = r4.connection()
            r4.tryExpandConnectionFlowControlWindow(r0)
            goto L67
        Lc:
            boolean r0 = r6 instanceof io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent
            if (r0 == 0) goto L67
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r6 = (io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeEvent) r6
            io.netty.handler.codec.http.HttpServerUpgradeHandler$UpgradeEvent r0 = r6.retain()     // Catch: java.lang.Throwable -> L2e
            r4.onUpgradeEvent(r5, r0)     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2Connection r0 = r4.connection()     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r1)     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r2 = r4.streamKey     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r0.getProperty(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L30
            r4.onStreamActive0(r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r5 = move-exception
            goto L63
        L30:
            io.netty.handler.codec.http.FullHttpRequest r2 = r6.upgradeRequest()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r3 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID     // Catch: java.lang.Throwable -> L2e
            io.netty.util.AsciiString r3 = r3.text()     // Catch: java.lang.Throwable -> L2e
            r2.setInt(r3, r1)     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r1 = r4.upgradeKey     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2e
            r0.setProperty(r1, r2)     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2Connection r0 = r4.connection()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2ConnectionDecoder r1 = r4.decoder()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.Http2FrameListener r1 = r1.frameListener()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http.FullHttpRequest r2 = r6.upgradeRequest()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http.FullHttpRequest r2 = r2.mo39retain()     // Catch: java.lang.Throwable -> L2e
            io.netty.handler.codec.http2.InboundHttpToHttp2Adapter.handle(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L2e
            r6.release()
            return
        L63:
            r6.release()
            throw r5
        L67:
            super.userEventTriggered(r5, r6)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r9, java.lang.Object r10, io.netty.channel.ChannelPromise r11) {
            r8 = this;
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2DataFrame
            if (r1 == 0) goto L25
            r0 = r10
            io.netty.handler.codec.http2.Http2DataFrame r0 = (io.netty.handler.codec.http2.Http2DataFrame) r0
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r8.encoder()
            io.netty.handler.codec.http2.Http2FrameStream r2 = r0.stream()
            int r3 = r2.id()
            io.netty.buffer.ByteBuf r4 = r0.content()
            int r5 = r0.padding()
            boolean r6 = r0.isEndStream()
            r2 = r9
            r7 = r11
            r1.writeData(r2, r3, r4, r5, r6, r7)
            return
        L25:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2HeadersFrame
            if (r1 == 0) goto L30
            r0 = r10
            io.netty.handler.codec.http2.Http2HeadersFrame r0 = (io.netty.handler.codec.http2.Http2HeadersFrame) r0
            r8.writeHeadersFrame(r9, r0, r11)
            return
        L30:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2WindowUpdateFrame
            if (r1 == 0) goto L5a
            r0 = r10
            io.netty.handler.codec.http2.Http2WindowUpdateFrame r0 = (io.netty.handler.codec.http2.Http2WindowUpdateFrame) r0
            io.netty.handler.codec.http2.Http2FrameStream r1 = r0.stream()
            if (r1 != 0) goto L47
            int r0 = r0.windowSizeIncrement()     // Catch: java.lang.Throwable -> L45
            r8.increaseInitialConnectionWindow(r0)     // Catch: java.lang.Throwable -> L45
            goto L52
        L45:
            r0 = move-exception
            goto L56
        L47:
            int r1 = r1.id()     // Catch: java.lang.Throwable -> L45
            int r0 = r0.windowSizeIncrement()     // Catch: java.lang.Throwable -> L45
            r8.consumeBytes(r1, r0)     // Catch: java.lang.Throwable -> L45
        L52:
            r11.setSuccess()     // Catch: java.lang.Throwable -> L45
            goto L59
        L56:
            r11.setFailure(r0)
        L59:
            return
        L5a:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2ResetFrame
            r3 = 0
            if (r1 == 0) goto La3
            r0 = r10
            io.netty.handler.codec.http2.Http2ResetFrame r0 = (io.netty.handler.codec.http2.Http2ResetFrame) r0
            io.netty.handler.codec.http2.Http2FrameStream r1 = r0.stream()
            int r1 = r1.id()
            io.netty.handler.codec.http2.Http2Connection r4 = r8.connection()
            boolean r1 = r4.streamMayHaveExisted(r1)
            if (r1 == 0) goto L8a
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r8.encoder()
            io.netty.handler.codec.http2.Http2FrameStream r3 = r0.stream()
            int r3 = r3.id()
            long r4 = r0.errorCode()
            r2 = r9
            r6 = r11
            r1.writeRstStream(r2, r3, r4, r6)
            return
        L8a:
            io.netty.util.ReferenceCountUtil.release(r0)
            io.netty.handler.codec.http2.Http2FrameStream r0 = r0.stream()
            int r0 = r0.id()
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "Stream never existed"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r1, r2, r3)
            r11.setFailure(r0)
            return
        La3:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2PingFrame
            if (r1 == 0) goto Lbc
            r0 = r10
            io.netty.handler.codec.http2.Http2PingFrame r0 = (io.netty.handler.codec.http2.Http2PingFrame) r0
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r8.encoder()
            boolean r3 = r0.ack()
            long r4 = r0.content()
            r2 = r9
            r6 = r11
            r1.writePing(r2, r3, r4, r6)
            return
        Lbc:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2SettingsFrame
            if (r1 == 0) goto Lcf
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r8.encoder()
            r0 = r10
            io.netty.handler.codec.http2.Http2SettingsFrame r0 = (io.netty.handler.codec.http2.Http2SettingsFrame) r0
            io.netty.handler.codec.http2.Http2Settings r0 = r0.settings()
            r1.writeSettings(r9, r0, r11)
            return
        Lcf:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2SettingsAckFrame
            if (r1 == 0) goto Ldb
            io.netty.handler.codec.http2.Http2ConnectionEncoder r0 = r8.encoder()
            r0.writeSettingsAck(r9, r11)
            return
        Ldb:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2GoAwayFrame
            if (r1 == 0) goto Le6
            r0 = r10
            io.netty.handler.codec.http2.Http2GoAwayFrame r0 = (io.netty.handler.codec.http2.Http2GoAwayFrame) r0
            r8.writeGoAwayFrame(r9, r0, r11)
            return
        Le6:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2UnknownFrame
            if (r1 == 0) goto L10c
            r0 = r10
            io.netty.handler.codec.http2.Http2UnknownFrame r0 = (io.netty.handler.codec.http2.Http2UnknownFrame) r0
            io.netty.handler.codec.http2.Http2ConnectionEncoder r1 = r8.encoder()
            byte r3 = r0.frameType()
            io.netty.handler.codec.http2.Http2FrameStream r4 = r0.stream()
            int r4 = r4.id()
            io.netty.handler.codec.http2.Http2Flags r5 = r0.flags()
            io.netty.buffer.ByteBuf r0 = r0.content()
            r2 = r9
            r7 = r11
            r6 = r0
            r1.writeFrame(r2, r3, r4, r5, r6, r7)
            return
        L10c:
            boolean r1 = r10 instanceof io.netty.handler.codec.http2.Http2Frame
            if (r1 != 0) goto L114
            r9.write(r10, r11)
            return
        L114:
            io.netty.util.ReferenceCountUtil.release(r10)
            io.netty.handler.codec.UnsupportedMessageTypeException r1 = new io.netty.handler.codec.UnsupportedMessageTypeException
            java.lang.Class[] r2 = new java.lang.Class[r3]
            r1.<init>(r10, r2)
            throw r1
    }
}
