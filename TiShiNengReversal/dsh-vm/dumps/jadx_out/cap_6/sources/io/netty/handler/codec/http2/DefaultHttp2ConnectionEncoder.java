package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2ConnectionEncoder implements io.netty.handler.codec.http2.Http2ConnectionEncoder, io.netty.handler.codec.http2.Http2SettingsReceivedConsumer {
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private final io.netty.handler.codec.http2.Http2FrameWriter frameWriter;
    private io.netty.handler.codec.http2.Http2LifecycleManager lifecycleManager;
    private final java.util.Queue<io.netty.handler.codec.http2.Http2Settings> outstandingLocalSettingsQueue;
    private java.util.Queue<io.netty.handler.codec.http2.Http2Settings> outstandingRemoteSettingsQueue;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = null;

        static {
                io.netty.handler.codec.http2.Http2Stream$State[] r0 = io.netty.handler.codec.http2.Http2Stream.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State = r0
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.HALF_CLOSED_REMOTE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.Http2Stream$State r1 = io.netty.handler.codec.http2.Http2Stream.State.RESERVED_LOCAL     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public abstract class FlowControlledBase implements io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled, io.netty.channel.ChannelFutureListener {
        protected boolean endOfStream;
        protected int padding;
        protected io.netty.channel.ChannelPromise promise;
        protected final io.netty.handler.codec.http2.Http2Stream stream;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder this$0;

        FlowControlledBase(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r1, io.netty.handler.codec.http2.Http2Stream r2, int r3, boolean r4, io.netty.channel.ChannelPromise r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.String r1 = "padding"
                io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r3, r1)
                r0.padding = r3
                r0.endOfStream = r4
                r0.stream = r2
                r0.promise = r5
                return
        }

        public void operationComplete(io.netty.channel.ChannelFuture r2) throws java.lang.Exception {
                r1 = this;
                boolean r0 = r2.isSuccess()
                if (r0 != 0) goto L17
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0 = r1.this$0
                io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r0.flowController()
                io.netty.channel.ChannelHandlerContext r0 = r0.channelHandlerContext()
                java.lang.Throwable r2 = r2.cause()
                r1.error(r0, r2)
            L17:
                return
        }

        public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
                r0 = this;
                io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
                r0.operationComplete(r1)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public void writeComplete() {
                r3 = this;
                boolean r0 = r3.endOfStream
                if (r0 == 0) goto L11
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0 = r3.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$000(r0)
                io.netty.handler.codec.http2.Http2Stream r1 = r3.stream
                io.netty.channel.ChannelPromise r2 = r3.promise
                r0.closeStreamLocal(r1, r2)
            L11:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FlowControlledData extends io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.FlowControlledBase {
        private int dataSize;
        private final io.netty.channel.CoalescingBufferQueue queue;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder this$0;

        FlowControlledData(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r7, io.netty.handler.codec.http2.Http2Stream r8, io.netty.buffer.ByteBuf r9, int r10, boolean r11, io.netty.channel.ChannelPromise r12) {
                r6 = this;
                r6.this$0 = r7
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                io.netty.channel.CoalescingBufferQueue r7 = new io.netty.channel.CoalescingBufferQueue
                io.netty.channel.Channel r8 = r5.channel()
                r7.<init>(r8)
                r0.queue = r7
                r7.add(r9, r5)
                int r7 = r7.readableBytes()
                r0.dataSize = r7
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public void error(io.netty.channel.ChannelHandlerContext r3, java.lang.Throwable r4) {
                r2 = this;
                io.netty.channel.CoalescingBufferQueue r0 = r2.queue
                r0.releaseAndFailAll(r4)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$000(r0)
                r1 = 1
                r0.onError(r3, r1, r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public boolean merge(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r3) {
                r1 = this;
                java.lang.Class<io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledData> r2 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.FlowControlledData.class
                java.lang.Class r0 = r3.getClass()
                if (r2 != r0) goto L38
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledData r3 = (io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.FlowControlledData) r3
                int r2 = r3.size()
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r0 = r0 - r2
                int r2 = r1.size()
                if (r0 >= r2) goto L19
                goto L38
            L19:
                io.netty.channel.CoalescingBufferQueue r2 = r3.queue
                io.netty.channel.CoalescingBufferQueue r0 = r1.queue
                r2.copyTo(r0)
                io.netty.channel.CoalescingBufferQueue r2 = r1.queue
                int r2 = r2.readableBytes()
                r1.dataSize = r2
                int r2 = r1.padding
                int r0 = r3.padding
                int r2 = java.lang.Math.max(r2, r0)
                r1.padding = r2
                boolean r2 = r3.endOfStream
                r1.endOfStream = r2
                r2 = 1
                return r2
            L38:
                r2 = 0
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public int size() {
                r2 = this;
                int r0 = r2.dataSize
                int r1 = r2.padding
                int r0 = r0 + r1
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public void write(io.netty.channel.ChannelHandlerContext r11, int r12) {
                r10 = this;
                io.netty.channel.CoalescingBufferQueue r0 = r10.queue
                int r0 = r0.readableBytes()
                boolean r1 = r10.endOfStream
                r2 = 0
                if (r1 != 0) goto L2f
                if (r0 != 0) goto L2c
                io.netty.channel.CoalescingBufferQueue r12 = r10.queue
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L1a
                r10.dataSize = r2
                r10.padding = r2
                return
            L1a:
                io.netty.channel.ChannelPromise r12 = r11.newPromise()
                io.netty.channel.ChannelPromise r12 = r12.addListener(r10)
                io.netty.channel.CoalescingBufferQueue r0 = r10.queue
                io.netty.buffer.ByteBuf r0 = r0.remove(r2, r12)
                r11.write(r0, r12)
                return
            L2c:
                if (r12 != 0) goto L2f
                return
            L2f:
                int r0 = java.lang.Math.min(r0, r12)
                io.netty.channel.ChannelPromise r1 = r11.newPromise()
                io.netty.channel.ChannelPromise r9 = r1.addListener(r10)
                io.netty.channel.CoalescingBufferQueue r1 = r10.queue
                io.netty.buffer.ByteBuf r6 = r1.remove(r0, r9)
                io.netty.channel.CoalescingBufferQueue r1 = r10.queue
                int r1 = r1.readableBytes()
                r10.dataSize = r1
                int r12 = r12 - r0
                int r0 = r10.padding
                int r7 = java.lang.Math.min(r12, r0)
                int r12 = r10.padding
                int r12 = r12 - r7
                r10.padding = r12
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r12 = r10.this$0
                io.netty.handler.codec.http2.Http2FrameWriter r3 = r12.frameWriter()
                io.netty.handler.codec.http2.Http2Stream r12 = r10.stream
                int r5 = r12.id()
                boolean r12 = r10.endOfStream
                if (r12 == 0) goto L6f
                int r12 = r10.size()
                if (r12 != 0) goto L6f
                r2 = 1
                r8 = 1
            L6d:
                r4 = r11
                goto L71
            L6f:
                r8 = 0
                goto L6d
            L71:
                r3.writeData(r4, r5, r6, r7, r8, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FlowControlledHeaders extends io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.FlowControlledBase {
        private final boolean exclusive;
        private final io.netty.handler.codec.http2.Http2Headers headers;
        private final int streamDependency;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder this$0;
        private final short weight;

        FlowControlledHeaders(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r7, io.netty.handler.codec.http2.Http2Stream r8, io.netty.handler.codec.http2.Http2Headers r9, int r10, short r11, boolean r12, int r13, boolean r14, io.netty.channel.ChannelPromise r15) {
                r6 = this;
                r6.this$0 = r7
                io.netty.channel.ChannelPromise r5 = r15.unvoid()
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                r4 = r14
                r0.<init>(r1, r2, r3, r4, r5)
                r0.headers = r9
                r0.streamDependency = r10
                r0.weight = r11
                r0.exclusive = r12
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public void error(io.netty.channel.ChannelHandlerContext r3, java.lang.Throwable r4) {
                r2 = this;
                if (r3 == 0) goto Lc
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0 = r2.this$0
                io.netty.handler.codec.http2.Http2LifecycleManager r0 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$000(r0)
                r1 = 1
                r0.onError(r3, r1, r4)
            Lc:
                io.netty.channel.ChannelPromise r3 = r2.promise
                r3.tryFailure(r4)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public boolean merge(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public int size() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2RemoteFlowController.FlowControlled
        public void write(io.netty.channel.ChannelHandlerContext r12, int r13) {
                r11 = this;
                io.netty.handler.codec.http2.Http2Stream r13 = r11.stream
                io.netty.handler.codec.http2.Http2Headers r0 = r11.headers
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r1 = r11.this$0
                io.netty.handler.codec.http2.Http2Connection r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$100(r1)
                boolean r1 = r1.isServer()
                boolean r2 = r11.endOfStream
                boolean r13 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$200(r13, r0, r1, r2)
                io.netty.channel.ChannelPromise r0 = r11.promise
                r0.addListener(r11)
                io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0 = r11.this$0
                io.netty.handler.codec.http2.Http2FrameWriter r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.access$300(r0)
                io.netty.handler.codec.http2.Http2Stream r0 = r11.stream
                int r3 = r0.id()
                io.netty.handler.codec.http2.Http2Headers r4 = r11.headers
                int r5 = r11.streamDependency
                short r6 = r11.weight
                boolean r7 = r11.exclusive
                int r8 = r11.padding
                boolean r9 = r11.endOfStream
                io.netty.channel.ChannelPromise r10 = r11.promise
                r2 = r12
                io.netty.channel.ChannelFuture r12 = r1.writeHeaders(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.Throwable r12 = r12.cause()
                if (r12 != 0) goto L43
                io.netty.handler.codec.http2.Http2Stream r12 = r11.stream
                r12.headersSent(r13)
            L43:
                return
        }
    }

    public DefaultHttp2ConnectionEncoder(io.netty.handler.codec.http2.Http2Connection r3, io.netty.handler.codec.http2.Http2FrameWriter r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.outstandingLocalSettingsQueue = r0
            java.lang.String r0 = "connection"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.http2.Http2Connection r0 = (io.netty.handler.codec.http2.Http2Connection) r0
            r2.connection = r0
            java.lang.String r0 = "frameWriter"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.handler.codec.http2.Http2FrameWriter r4 = (io.netty.handler.codec.http2.Http2FrameWriter) r4
            r2.frameWriter = r4
            io.netty.handler.codec.http2.Http2Connection$Endpoint r4 = r3.remote()
            io.netty.handler.codec.http2.Http2FlowController r4 = r4.flowController()
            if (r4 != 0) goto L35
            io.netty.handler.codec.http2.Http2Connection$Endpoint r4 = r3.remote()
            io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController r0 = new io.netty.handler.codec.http2.DefaultHttp2RemoteFlowController
            r0.<init>(r3)
            r4.flowController(r0)
        L35:
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2LifecycleManager access$000(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0) {
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r0.lifecycleManager
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2Connection access$100(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0) {
            io.netty.handler.codec.http2.Http2Connection r0 = r0.connection
            return r0
    }

    static /* synthetic */ boolean access$200(io.netty.handler.codec.http2.Http2Stream r0, io.netty.handler.codec.http2.Http2Headers r1, boolean r2, boolean r3) {
            boolean r0 = validateHeadersSentState(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2FrameWriter access$300(io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder r0) {
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r0.frameWriter
            return r0
    }

    private void notifyLifecycleManagerOnError(io.netty.channel.ChannelFuture r2, io.netty.channel.ChannelHandlerContext r3) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$1 r0 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$1
            r0.<init>(r1, r3)
            r2.addListener(r0)
            return
    }

    private io.netty.handler.codec.http2.Http2Stream requireStream(int r3) {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r3)
            if (r0 != 0) goto L39
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            boolean r0 = r0.streamMayHaveExisted(r3)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Stream no longer exists: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L33
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Stream does not exist: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L39:
            return r0
    }

    private static boolean validateHeadersSentState(io.netty.handler.codec.http2.Http2Stream r1, io.netty.handler.codec.http2.Http2Headers r2, boolean r3, boolean r4) {
            if (r3 == 0) goto L10
            java.lang.CharSequence r2 = r2.status()
            io.netty.handler.codec.http.HttpStatusClass r2 = io.netty.handler.codec.http.HttpStatusClass.valueOf(r2)
            io.netty.handler.codec.http.HttpStatusClass r3 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
            if (r2 != r3) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            if (r4 != 0) goto L1b
        L15:
            boolean r3 = r1.isHeadersSent()
            if (r3 != 0) goto L22
        L1b:
            boolean r3 = r1.isTrailersSent()
            if (r3 != 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Stream "
            r3.append(r0)
            int r1 = r1.id()
            r3.append(r1)
            java.lang.String r1 = " sent too many headers EOS: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.frameWriter
            r0.close()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.handler.codec.http2.Http2FrameWriter.Configuration configuration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.frameWriter
            io.netty.handler.codec.http2.Http2FrameWriter$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2Connection connection() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2SettingsReceivedConsumer
    public void consumeReceivedSettings(io.netty.handler.codec.http2.Http2Settings r3) {
            r2 = this;
            java.util.Queue<io.netty.handler.codec.http2.Http2Settings> r0 = r2.outstandingRemoteSettingsQueue
            if (r0 != 0) goto Lc
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 2
            r0.<init>(r1)
            r2.outstandingRemoteSettingsQueue = r0
        Lc:
            java.util.Queue<io.netty.handler.codec.http2.Http2Settings> r0 = r2.outstandingRemoteSettingsQueue
            r0.add(r3)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public final io.netty.handler.codec.http2.Http2RemoteFlowController flowController() {
            r1 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection()
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.remote()
            io.netty.handler.codec.http2.Http2FlowController r0 = r0.flowController()
            io.netty.handler.codec.http2.Http2RemoteFlowController r0 = (io.netty.handler.codec.http2.Http2RemoteFlowController) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2FrameWriter frameWriter() {
            r1 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.frameWriter
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public void lifecycleManager(io.netty.handler.codec.http2.Http2LifecycleManager r2) {
            r1 = this;
            java.lang.String r0 = "lifecycleManager"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.http2.Http2LifecycleManager r2 = (io.netty.handler.codec.http2.Http2LifecycleManager) r2
            r1.lifecycleManager = r2
            return
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public io.netty.handler.codec.http2.Http2Settings pollSentSettings() {
            r1 = this;
            java.util.Queue<io.netty.handler.codec.http2.Http2Settings> r0 = r1.outstandingLocalSettingsQueue
            java.lang.Object r0 = r0.poll()
            io.netty.handler.codec.http2.Http2Settings r0 = (io.netty.handler.codec.http2.Http2Settings) r0
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder
    public void remoteSettings(io.netty.handler.codec.http2.Http2Settings r9) throws io.netty.handler.codec.http2.Http2Exception {
            r8 = this;
            java.lang.Boolean r0 = r9.pushEnabled()
            io.netty.handler.codec.http2.Http2FrameWriter$Configuration r1 = r8.configuration()
            io.netty.handler.codec.http2.Http2HeadersEncoder$Configuration r2 = r1.headersConfiguration()
            io.netty.handler.codec.http2.Http2FrameSizePolicy r1 = r1.frameSizePolicy()
            if (r0 == 0) goto L3a
            io.netty.handler.codec.http2.Http2Connection r3 = r8.connection
            boolean r3 = r3.isServer()
            if (r3 != 0) goto L2d
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L21
            goto L2d
        L21:
            io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Client received a value of ENABLE_PUSH specified to other than 0"
            io.netty.handler.codec.http2.Http2Exception r9 = io.netty.handler.codec.http2.Http2Exception.connectionError(r9, r1, r0)
            throw r9
        L2d:
            io.netty.handler.codec.http2.Http2Connection r3 = r8.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.remote()
            boolean r0 = r0.booleanValue()
            r3.allowPushTo(r0)
        L3a:
            java.lang.Long r0 = r9.maxConcurrentStreams()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r0 == 0) goto L55
            io.netty.handler.codec.http2.Http2Connection r5 = r8.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r5 = r5.local()
            long r6 = r0.longValue()
            long r6 = java.lang.Math.min(r6, r3)
            int r0 = (int) r6
            r5.maxActiveStreams(r0)
        L55:
            java.lang.Long r0 = r9.headerTableSize()
            if (r0 == 0) goto L68
            long r5 = r0.longValue()
            long r3 = java.lang.Math.min(r5, r3)
            int r0 = (int) r3
            long r3 = (long) r0
            r2.maxHeaderTableSize(r3)
        L68:
            java.lang.Long r0 = r9.maxHeaderListSize()
            if (r0 == 0) goto L75
            long r3 = r0.longValue()
            r2.maxHeaderListSize(r3)
        L75:
            java.lang.Integer r0 = r9.maxFrameSize()
            if (r0 == 0) goto L82
            int r0 = r0.intValue()
            r1.maxFrameSize(r0)
        L82:
            java.lang.Integer r9 = r9.initialWindowSize()
            if (r9 == 0) goto L93
            io.netty.handler.codec.http2.Http2RemoteFlowController r0 = r8.flowController()
            int r9 = r9.intValue()
            r0.initialWindowSize(r9)
        L93:
            return
    }

    @Override // io.netty.handler.codec.http2.Http2DataWriter
    public io.netty.channel.ChannelFuture writeData(io.netty.channel.ChannelHandlerContext r8, int r9, io.netty.buffer.ByteBuf r10, int r11, boolean r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2Stream r2 = r7.requireStream(r9)     // Catch: java.lang.Throwable -> L55
            int[] r8 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.Throwable -> L55
            io.netty.handler.codec.http2.Http2Stream$State r9 = r2.state()     // Catch: java.lang.Throwable -> L55
            int r9 = r9.ordinal()     // Catch: java.lang.Throwable -> L55
            r8 = r8[r9]     // Catch: java.lang.Throwable -> L55
            r9 = 1
            if (r8 == r9) goto L43
            r9 = 2
            if (r8 != r9) goto L17
            goto L43
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r9.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "Stream "
            r9.append(r11)     // Catch: java.lang.Throwable -> L3e
            int r11 = r2.id()     // Catch: java.lang.Throwable -> L3e
            r9.append(r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = " in unexpected state "
            r9.append(r11)     // Catch: java.lang.Throwable -> L3e
            io.netty.handler.codec.http2.Http2Stream$State r11 = r2.state()     // Catch: java.lang.Throwable -> L3e
            r9.append(r11)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r8 = r0
            r3 = r10
            r6 = r13
            goto L59
        L43:
            io.netty.handler.codec.http2.Http2RemoteFlowController r8 = r7.flowController()
            io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledData r0 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledData
            r1 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.addFlowControlled(r2, r0)
            return r6
        L55:
            r0 = move-exception
            r3 = r10
            r6 = r13
            r8 = r0
        L59:
            r3.release()
            io.netty.channel.ChannelPromise r8 = r6.setFailure(r8)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2ConnectionEncoder, io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeFrame(io.netty.channel.ChannelHandlerContext r8, byte r9, int r10, io.netty.handler.codec.http2.Http2Flags r11, io.netty.buffer.ByteBuf r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.frameWriter
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writeFrame(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeGoAway(io.netty.channel.ChannelHandlerContext r8, int r9, long r10, io.netty.buffer.ByteBuf r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r7.lifecycleManager
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.goAway(r1, r2, r3, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r14, int r15, io.netty.handler.codec.http2.Http2Headers r16, int r17, short r18, boolean r19, int r20, boolean r21, io.netty.channel.ChannelPromise r22) {
            r13 = this;
            r8 = r21
            r9 = r22
            r10 = 1
            io.netty.handler.codec.http2.Http2Connection r0 = r13.connection     // Catch: java.lang.Throwable -> La9
            io.netty.handler.codec.http2.Http2Stream r0 = r0.stream(r15)     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L46
            io.netty.handler.codec.http2.Http2Connection r0 = r13.connection     // Catch: java.lang.Throwable -> L1a io.netty.handler.codec.http2.Http2Exception -> L1e
            io.netty.handler.codec.http2.Http2Connection$Endpoint r0 = r0.local()     // Catch: java.lang.Throwable -> L1a io.netty.handler.codec.http2.Http2Exception -> L1e
            r1 = 0
            io.netty.handler.codec.http2.Http2Stream r0 = r0.createStream(r15, r1)     // Catch: java.lang.Throwable -> L1a io.netty.handler.codec.http2.Http2Exception -> L1e
        L18:
            r2 = r0
            goto L85
        L1a:
            r0 = move-exception
            r15 = r0
            goto Lee
        L1e:
            r0 = move-exception
            io.netty.handler.codec.http2.Http2Connection r1 = r13.connection     // Catch: java.lang.Throwable -> L1a
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.remote()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.mayHaveCreatedStream(r15)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L45
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Stream no longer exists: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a
            r2.append(r15)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r15 = r2.toString()     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r15, r0)     // Catch: java.lang.Throwable -> L1a
            r9.tryFailure(r1)     // Catch: java.lang.Throwable -> L1a
            return r9
        L45:
            throw r0     // Catch: java.lang.Throwable -> L1a
        L46:
            int[] r1 = io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder.AnonymousClass2.$SwitchMap$io$netty$handler$codec$http2$Http2Stream$State     // Catch: java.lang.Throwable -> La9
            io.netty.handler.codec.http2.Http2Stream$State r2 = r0.state()     // Catch: java.lang.Throwable -> La9
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La9
            r1 = r1[r2]     // Catch: java.lang.Throwable -> La9
            if (r1 == r10) goto L18
            r2 = 2
            if (r1 == r2) goto L18
            r2 = 3
            if (r1 != r2) goto L5e
            r0.open(r8)     // Catch: java.lang.Throwable -> L1a
            goto L18
        L5e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "Stream "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.id()     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = " in unexpected state "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            io.netty.handler.codec.http2.Http2Stream$State r0 = r0.state()     // Catch: java.lang.Throwable -> L1a
            r1.append(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            throw r15     // Catch: java.lang.Throwable -> L1a
        L85:
            io.netty.handler.codec.http2.Http2RemoteFlowController r11 = r13.flowController()     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L91
            boolean r0 = r11.hasFlowControlled(r2)     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L93
        L91:
            r12 = r2
            goto Lae
        L93:
            io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledHeaders r0 = new io.netty.handler.codec.http2.DefaultHttp2ConnectionEncoder$FlowControlledHeaders     // Catch: java.lang.Throwable -> La9
            r8 = 1
            r1 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            r12 = r2
            r11.addFlowControlled(r12, r0)     // Catch: java.lang.Throwable -> La9
            return r22
        La9:
            r0 = move-exception
            r15 = r0
            r9 = r22
            goto Lee
        Lae:
            io.netty.channel.ChannelPromise r9 = r22.unvoid()     // Catch: java.lang.Throwable -> La9
            io.netty.handler.codec.http2.Http2Connection r0 = r13.connection     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isServer()     // Catch: java.lang.Throwable -> L1a
            r3 = r16
            boolean r11 = validateHeadersSentState(r12, r3, r0, r8)     // Catch: java.lang.Throwable -> L1a
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r13.frameWriter     // Catch: java.lang.Throwable -> L1a
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            io.netty.channel.ChannelFuture r15 = r0.writeHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a
            java.lang.Throwable r0 = r15.cause()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Le1
            r12.headersSent(r11)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r15.isSuccess()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Le6
            r13.notifyLifecycleManagerOnError(r15, r14)     // Catch: java.lang.Throwable -> L1a
            goto Le6
        Le1:
            io.netty.handler.codec.http2.Http2LifecycleManager r2 = r13.lifecycleManager     // Catch: java.lang.Throwable -> L1a
            r2.onError(r14, r10, r0)     // Catch: java.lang.Throwable -> L1a
        Le6:
            if (r21 == 0) goto Led
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r13.lifecycleManager     // Catch: java.lang.Throwable -> L1a
            r0.closeStreamLocal(r12, r15)     // Catch: java.lang.Throwable -> L1a
        Led:
            return r15
        Lee:
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r13.lifecycleManager
            r0.onError(r14, r10, r15)
            r9.tryFailure(r15)
            return r9
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeHeaders(io.netty.channel.ChannelHandlerContext r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, boolean r15, io.netty.channel.ChannelPromise r16) {
            r10 = this;
            r5 = 16
            r6 = 0
            r4 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            io.netty.channel.ChannelFuture r11 = r0.writeHeaders(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePing(io.netty.channel.ChannelHandlerContext r7, boolean r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r6.frameWriter
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            io.netty.channel.ChannelFuture r7 = r0.writePing(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePriority(io.netty.channel.ChannelHandlerContext r8, int r9, int r10, short r11, boolean r12, io.netty.channel.ChannelPromise r13) {
            r7 = this;
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r7.frameWriter
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            io.netty.channel.ChannelFuture r8 = r0.writePriority(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writePushPromise(io.netty.channel.ChannelHandlerContext r10, int r11, int r12, io.netty.handler.codec.http2.Http2Headers r13, int r14, io.netty.channel.ChannelPromise r15) {
            r9 = this;
            r8 = 1
            io.netty.handler.codec.http2.Http2Connection r0 = r9.connection     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.goAwayReceived()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L44
            io.netty.handler.codec.http2.Http2Stream r0 = r9.requireStream(r11)     // Catch: java.lang.Throwable -> L41
            io.netty.handler.codec.http2.Http2Connection r1 = r9.connection     // Catch: java.lang.Throwable -> L41
            io.netty.handler.codec.http2.Http2Connection$Endpoint r1 = r1.local()     // Catch: java.lang.Throwable -> L41
            r1.reservePushStream(r12, r0)     // Catch: java.lang.Throwable -> L41
            io.netty.channel.ChannelPromise r7 = r15.unvoid()     // Catch: java.lang.Throwable -> L41
            io.netty.handler.codec.http2.Http2FrameWriter r1 = r9.frameWriter     // Catch: java.lang.Throwable -> L38
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            io.netty.channel.ChannelFuture r1 = r1.writePushPromise(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.Throwable r3 = r1.cause()     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L3b
            r0.pushPromiseSent()     // Catch: java.lang.Throwable -> L38
            boolean r0 = r1.isSuccess()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L3a
            r9.notifyLifecycleManagerOnError(r1, r10)     // Catch: java.lang.Throwable -> L38
            return r1
        L38:
            r0 = move-exception
            goto L50
        L3a:
            return r1
        L3b:
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r9.lifecycleManager     // Catch: java.lang.Throwable -> L38
            r0.onError(r10, r8, r3)     // Catch: java.lang.Throwable -> L38
            return r1
        L41:
            r0 = move-exception
            r7 = r15
            goto L50
        L44:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Sending PUSH_PROMISE after GO_AWAY received."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L41
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r1, r3)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L50:
            io.netty.handler.codec.http2.Http2LifecycleManager r1 = r9.lifecycleManager
            r1.onError(r10, r8, r0)
            r7.tryFailure(r0)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeRstStream(io.netty.channel.ChannelHandlerContext r7, int r8, long r9, io.netty.channel.ChannelPromise r11) {
            r6 = this;
            io.netty.handler.codec.http2.Http2LifecycleManager r0 = r6.lifecycleManager
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            io.netty.channel.ChannelFuture r7 = r0.resetStream(r1, r2, r3, r5)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettings(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http2.Http2Settings r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            java.util.Queue<io.netty.handler.codec.http2.Http2Settings> r0 = r1.outstandingLocalSettingsQueue
            r0.add(r3)
            java.lang.Boolean r0 = r3.pushEnabled()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            io.netty.handler.codec.http2.Http2Connection r0 = r1.connection     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isServer()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L14
            goto L22
        L14:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "Server sending SETTINGS frame with ENABLE_PUSH specified"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L20
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r3, r0)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L20:
            r2 = move-exception
            goto L29
        L22:
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r1.frameWriter
            io.netty.channel.ChannelFuture r2 = r0.writeSettings(r2, r3, r4)
            return r2
        L29:
            io.netty.channel.ChannelPromise r2 = r4.setFailure(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeSettingsAck(io.netty.channel.ChannelHandlerContext r5, io.netty.channel.ChannelPromise r6) {
            r4 = this;
            java.util.Queue<io.netty.handler.codec.http2.Http2Settings> r0 = r4.outstandingRemoteSettingsQueue
            if (r0 != 0) goto Lb
            io.netty.handler.codec.http2.Http2FrameWriter r0 = r4.frameWriter
            io.netty.channel.ChannelFuture r5 = r0.writeSettingsAck(r5, r6)
            return r5
        Lb:
            java.lang.Object r0 = r0.poll()
            io.netty.handler.codec.http2.Http2Settings r0 = (io.netty.handler.codec.http2.Http2Settings) r0
            if (r0 != 0) goto L21
            io.netty.handler.codec.http2.Http2Exception r5 = new io.netty.handler.codec.http2.Http2Exception
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            java.lang.String r1 = "attempted to write a SETTINGS ACK with no  pending SETTINGS"
            r5.<init>(r0, r1)
            io.netty.channel.ChannelPromise r5 = r6.setFailure(r5)
            return r5
        L21:
            io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator r1 = new io.netty.handler.codec.http2.Http2CodecUtil$SimpleChannelPromiseAggregator
            io.netty.channel.Channel r2 = r5.channel()
            io.netty.util.concurrent.EventExecutor r3 = r5.executor()
            r1.<init>(r6, r2, r3)
            io.netty.handler.codec.http2.Http2FrameWriter r6 = r4.frameWriter
            io.netty.channel.ChannelPromise r2 = r1.newPromise()
            r6.writeSettingsAck(r5, r2)
            io.netty.channel.ChannelPromise r6 = r1.newPromise()
            r4.remoteSettings(r0)     // Catch: java.lang.Throwable -> L42
            r6.setSuccess()     // Catch: java.lang.Throwable -> L42
            goto L4c
        L42:
            r0 = move-exception
            r6.setFailure(r0)
            io.netty.handler.codec.http2.Http2LifecycleManager r6 = r4.lifecycleManager
            r2 = 1
            r6.onError(r5, r2, r0)
        L4c:
            io.netty.channel.ChannelPromise r5 = r1.doneAllocatingPromises()
            return r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameWriter
    public io.netty.channel.ChannelFuture writeWindowUpdate(io.netty.channel.ChannelHandlerContext r1, int r2, int r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Use the Http2[Inbound|Outbound]FlowController objects to control window sizes"
            r1.<init>(r2)
            io.netty.channel.ChannelPromise r1 = r4.setFailure(r1)
            return r1
    }
}
