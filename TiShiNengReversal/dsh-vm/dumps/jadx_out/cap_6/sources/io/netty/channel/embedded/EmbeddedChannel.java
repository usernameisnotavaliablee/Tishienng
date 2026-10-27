package io.netty.channel.embedded;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class EmbeddedChannel extends io.netty.channel.AbstractChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.channel.ChannelHandler[] EMPTY_HANDLERS = null;
    private static final java.net.SocketAddress LOCAL_ADDRESS = null;
    private static final io.netty.channel.ChannelMetadata METADATA_DISCONNECT = null;
    private static final io.netty.channel.ChannelMetadata METADATA_NO_DISCONNECT = null;
    private static final java.net.SocketAddress REMOTE_ADDRESS = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.ChannelConfig config;
    private java.util.Queue<java.lang.Object> inboundMessages;
    private java.lang.Throwable lastException;
    private final io.netty.channel.embedded.EmbeddedEventLoop loop;
    private final io.netty.channel.ChannelMetadata metadata;
    private java.util.Queue<java.lang.Object> outboundMessages;
    private final io.netty.channel.ChannelFutureListener recordExceptionListener;
    private io.netty.channel.embedded.EmbeddedChannel.State state;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EmbeddedChannelPipeline extends io.netty.channel.DefaultChannelPipeline {
        final /* synthetic */ io.netty.channel.embedded.EmbeddedChannel this$0;

        EmbeddedChannelPipeline(io.netty.channel.embedded.EmbeddedChannel r1, io.netty.channel.embedded.EmbeddedChannel r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // io.netty.channel.DefaultChannelPipeline
        protected void onUnhandledInboundException(java.lang.Throwable r2) {
                r1 = this;
                io.netty.channel.embedded.EmbeddedChannel r0 = r1.this$0
                io.netty.channel.embedded.EmbeddedChannel.access$200(r0, r2)
                return
        }

        @Override // io.netty.channel.DefaultChannelPipeline
        protected void onUnhandledInboundMessage(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.embedded.EmbeddedChannel r0 = r1.this$0
                r0.handleInboundMessage(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EmbeddedUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.channel.embedded.EmbeddedChannel this$0;
        final io.netty.channel.Channel.Unsafe wrapped;


        private EmbeddedUnsafe(io.netty.channel.embedded.EmbeddedChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1 r1 = new io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe$1
                r1.<init>(r0)
                r0.wrapped = r1
                return
        }

        /* synthetic */ EmbeddedUnsafe(io.netty.channel.embedded.EmbeddedChannel r1, io.netty.channel.embedded.EmbeddedChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                r0.safeSetSuccess(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.channel.embedded.EmbeddedChannel.State> {
        private static final /* synthetic */ io.netty.channel.embedded.EmbeddedChannel.State[] $VALUES = null;
        public static final io.netty.channel.embedded.EmbeddedChannel.State ACTIVE = null;
        public static final io.netty.channel.embedded.EmbeddedChannel.State CLOSED = null;
        public static final io.netty.channel.embedded.EmbeddedChannel.State OPEN = null;

        static {
                io.netty.channel.embedded.EmbeddedChannel$State r0 = new io.netty.channel.embedded.EmbeddedChannel$State
                java.lang.String r1 = "OPEN"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.channel.embedded.EmbeddedChannel.State.OPEN = r0
                io.netty.channel.embedded.EmbeddedChannel$State r1 = new io.netty.channel.embedded.EmbeddedChannel$State
                java.lang.String r3 = "ACTIVE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.channel.embedded.EmbeddedChannel.State.ACTIVE = r1
                io.netty.channel.embedded.EmbeddedChannel$State r3 = new io.netty.channel.embedded.EmbeddedChannel$State
                java.lang.String r5 = "CLOSED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.channel.embedded.EmbeddedChannel.State.CLOSED = r3
                r5 = 3
                io.netty.channel.embedded.EmbeddedChannel$State[] r5 = new io.netty.channel.embedded.EmbeddedChannel.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.channel.embedded.EmbeddedChannel.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.channel.embedded.EmbeddedChannel.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.embedded.EmbeddedChannel$State> r0 = io.netty.channel.embedded.EmbeddedChannel.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.embedded.EmbeddedChannel$State r1 = (io.netty.channel.embedded.EmbeddedChannel.State) r1
                return r1
        }

        public static io.netty.channel.embedded.EmbeddedChannel.State[] values() {
                io.netty.channel.embedded.EmbeddedChannel$State[] r0 = io.netty.channel.embedded.EmbeddedChannel.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.embedded.EmbeddedChannel$State[] r0 = (io.netty.channel.embedded.EmbeddedChannel.State[]) r0
                return r0
        }
    }

    static {
            io.netty.channel.embedded.EmbeddedSocketAddress r0 = new io.netty.channel.embedded.EmbeddedSocketAddress
            r0.<init>()
            io.netty.channel.embedded.EmbeddedChannel.LOCAL_ADDRESS = r0
            io.netty.channel.embedded.EmbeddedSocketAddress r0 = new io.netty.channel.embedded.EmbeddedSocketAddress
            r0.<init>()
            io.netty.channel.embedded.EmbeddedChannel.REMOTE_ADDRESS = r0
            r0 = 0
            io.netty.channel.ChannelHandler[] r1 = new io.netty.channel.ChannelHandler[r0]
            io.netty.channel.embedded.EmbeddedChannel.EMPTY_HANDLERS = r1
            java.lang.Class<io.netty.channel.embedded.EmbeddedChannel> r1 = io.netty.channel.embedded.EmbeddedChannel.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r1)
            io.netty.channel.embedded.EmbeddedChannel.logger = r1
            io.netty.channel.ChannelMetadata r1 = new io.netty.channel.ChannelMetadata
            r1.<init>(r0)
            io.netty.channel.embedded.EmbeddedChannel.METADATA_NO_DISCONNECT = r1
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 1
            r0.<init>(r1)
            io.netty.channel.embedded.EmbeddedChannel.METADATA_DISCONNECT = r0
            return
    }

    public EmbeddedChannel() {
            r1 = this;
            io.netty.channel.ChannelHandler[] r0 = io.netty.channel.embedded.EmbeddedChannel.EMPTY_HANDLERS
            r1.<init>(r0)
            return
    }

    public EmbeddedChannel(io.netty.channel.Channel r1, io.netty.channel.ChannelId r2, boolean r3, boolean r4, io.netty.channel.ChannelHandler... r5) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.embedded.EmbeddedEventLoop r1 = new io.netty.channel.embedded.EmbeddedEventLoop
            r1.<init>()
            r0.loop = r1
            io.netty.channel.embedded.EmbeddedChannel$1 r1 = new io.netty.channel.embedded.EmbeddedChannel$1
            r1.<init>(r0)
            r0.recordExceptionListener = r1
            io.netty.channel.ChannelMetadata r1 = metadata(r4)
            r0.metadata = r1
            io.netty.channel.DefaultChannelConfig r1 = new io.netty.channel.DefaultChannelConfig
            r1.<init>(r0)
            r0.config = r1
            r0.setup(r3, r5)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelId r2) {
            r1 = this;
            io.netty.channel.ChannelHandler[] r0 = io.netty.channel.embedded.EmbeddedChannel.EMPTY_HANDLERS
            r1.<init>(r2, r0)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelId r2, boolean r3, io.netty.channel.ChannelConfig r4, io.netty.channel.ChannelHandler... r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            io.netty.channel.embedded.EmbeddedEventLoop r2 = new io.netty.channel.embedded.EmbeddedEventLoop
            r2.<init>()
            r1.loop = r2
            io.netty.channel.embedded.EmbeddedChannel$1 r2 = new io.netty.channel.embedded.EmbeddedChannel$1
            r2.<init>(r1)
            r1.recordExceptionListener = r2
            io.netty.channel.ChannelMetadata r2 = metadata(r3)
            r1.metadata = r2
            java.lang.String r2 = "config"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            io.netty.channel.ChannelConfig r2 = (io.netty.channel.ChannelConfig) r2
            r1.config = r2
            r2 = 1
            r1.setup(r2, r5)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelId r7, boolean r8, boolean r9, io.netty.channel.ChannelHandler... r10) {
            r6 = this;
            r1 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelId r2, boolean r3, io.netty.channel.ChannelHandler... r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelId r2, io.netty.channel.ChannelHandler... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public EmbeddedChannel(boolean r2, boolean r3, io.netty.channel.ChannelHandler... r4) {
            r1 = this;
            io.netty.channel.ChannelId r0 = io.netty.channel.embedded.EmbeddedChannelId.INSTANCE
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public EmbeddedChannel(boolean r2, io.netty.channel.ChannelHandler... r3) {
            r1 = this;
            io.netty.channel.ChannelId r0 = io.netty.channel.embedded.EmbeddedChannelId.INSTANCE
            r1.<init>(r0, r2, r3)
            return
    }

    public EmbeddedChannel(io.netty.channel.ChannelHandler... r2) {
            r1 = this;
            io.netty.channel.ChannelId r0 = io.netty.channel.embedded.EmbeddedChannelId.INSTANCE
            r1.<init>(r0, r2)
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.embedded.EmbeddedChannel r0, io.netty.channel.ChannelFuture r1) {
            r0.recordException(r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.embedded.EmbeddedChannel r0, java.lang.Throwable r1) {
            r0.recordException(r1)
            return
    }

    private io.netty.channel.ChannelFuture checkException(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            java.lang.Throwable r0 = r2.lastException
            if (r0 == 0) goto L15
            r1 = 0
            r2.lastException = r1
            boolean r1 = r3.isVoid()
            if (r1 == 0) goto L10
            io.netty.util.internal.PlatformDependent.throwException(r0)
        L10:
            io.netty.channel.ChannelPromise r3 = r3.setFailure(r0)
            return r3
        L15:
            io.netty.channel.ChannelPromise r3 = r3.setSuccess()
            return r3
    }

    private boolean checkOpen(boolean r2) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 != 0) goto L12
            if (r2 == 0) goto L10
            java.nio.channels.ClosedChannelException r2 = new java.nio.channels.ClosedChannelException
            r2.<init>()
            r1.recordException(r2)
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    private boolean finish(boolean r2) {
            r1 = this;
            r1.close()
            r1.checkException()     // Catch: java.lang.Throwable -> L19
            java.util.Queue<java.lang.Object> r0 = r1.inboundMessages     // Catch: java.lang.Throwable -> L19
            boolean r0 = isNotEmpty(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L1b
            java.util.Queue<java.lang.Object> r0 = r1.outboundMessages     // Catch: java.lang.Throwable -> L19
            boolean r0 = isNotEmpty(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L29
        L1b:
            r0 = 1
        L1c:
            if (r2 == 0) goto L28
            java.util.Queue<java.lang.Object> r2 = r1.inboundMessages
            releaseAll(r2)
            java.util.Queue<java.lang.Object> r2 = r1.outboundMessages
            releaseAll(r2)
        L28:
            return r0
        L29:
            if (r2 == 0) goto L35
            java.util.Queue<java.lang.Object> r2 = r1.inboundMessages
            releaseAll(r2)
            java.util.Queue<java.lang.Object> r2 = r1.outboundMessages
            releaseAll(r2)
        L35:
            throw r0
    }

    private void finishPendingTasks(boolean r1) {
            r0 = this;
            r0.runPendingTasks()
            if (r1 == 0) goto La
            io.netty.channel.embedded.EmbeddedEventLoop r1 = r0.loop
            r1.cancelScheduledTasks()
        La:
            return
    }

    private io.netty.channel.ChannelFuture flushInbound(boolean r1, io.netty.channel.ChannelPromise r2) {
            r0 = this;
            boolean r1 = r0.checkOpen(r1)
            if (r1 == 0) goto L10
            io.netty.channel.ChannelPipeline r1 = r0.pipeline()
            r1.fireChannelReadComplete()
            r0.runPendingTasks()
        L10:
            io.netty.channel.ChannelFuture r1 = r0.checkException(r2)
            return r1
    }

    private void flushOutbound0() {
            r0 = this;
            r0.runPendingTasks()
            r0.flush()
            return
    }

    private static boolean isNotEmpty(java.util.Queue<java.lang.Object> r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static io.netty.channel.ChannelMetadata metadata(boolean r0) {
            if (r0 == 0) goto L5
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.embedded.EmbeddedChannel.METADATA_DISCONNECT
            return r0
        L5:
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.embedded.EmbeddedChannel.METADATA_NO_DISCONNECT
            return r0
    }

    private static java.lang.Object poll(java.util.Queue<java.lang.Object> r0) {
            if (r0 == 0) goto L7
            java.lang.Object r0 = r0.poll()
            return r0
        L7:
            r0 = 0
            return r0
    }

    private void recordException(io.netty.channel.ChannelFuture r2) {
            r1 = this;
            boolean r0 = r2.isSuccess()
            if (r0 != 0) goto Ld
            java.lang.Throwable r2 = r2.cause()
            r1.recordException(r2)
        Ld:
            return
    }

    private void recordException(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Throwable r0 = r2.lastException
            if (r0 != 0) goto L7
            r2.lastException = r3
            return
        L7:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.embedded.EmbeddedChannel.logger
            java.lang.String r1 = "More than one exception was raised. Will report only the first one and log others."
            r0.warn(r1, r3)
            return
    }

    private static boolean releaseAll(java.util.Queue<java.lang.Object> r1) {
            boolean r0 = isNotEmpty(r1)
            if (r0 == 0) goto L12
        L6:
            java.lang.Object r0 = r1.poll()
            if (r0 != 0) goto Le
            r1 = 1
            return r1
        Le:
            io.netty.util.ReferenceCountUtil.release(r0)
            goto L6
        L12:
            r1 = 0
            return r1
    }

    private void setup(boolean r4, io.netty.channel.ChannelHandler... r5) {
            r3 = this;
            java.lang.String r0 = "handlers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()
            io.netty.channel.embedded.EmbeddedChannel$2 r1 = new io.netty.channel.embedded.EmbeddedChannel$2
            r1.<init>(r3, r5)
            r5 = 1
            io.netty.channel.ChannelHandler[] r5 = new io.netty.channel.ChannelHandler[r5]
            r2 = 0
            r5[r2] = r1
            r0.addLast(r5)
            if (r4 == 0) goto L1e
            io.netty.channel.embedded.EmbeddedEventLoop r4 = r3.loop
            r4.register(r3)
        L1e:
            return
    }

    public void checkException() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.voidPromise()
            r1.checkException(r0)
            return
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            r1.runPendingTasks()
            io.netty.channel.ChannelFuture r2 = super.close(r2)
            r0 = 1
            r1.finishPendingTasks(r0)
            return r2
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture disconnect() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.disconnect(r0)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.ChannelFuture r2 = super.disconnect(r2)
            io.netty.channel.ChannelMetadata r0 = r1.metadata
            boolean r0 = r0.hasDisconnect()
            r0 = r0 ^ 1
            r1.finishPendingTasks(r0)
            return r2
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) throws java.lang.Exception {
            r0 = this;
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel$State r0 = io.netty.channel.embedded.EmbeddedChannel.State.CLOSED
            r1.state = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = r1.metadata
            boolean r0 = r0.hasDisconnect()
            if (r0 != 0) goto Lb
            r1.doClose()
        Lb:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doRegister() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel$State r0 = io.netty.channel.embedded.EmbeddedChannel.State.ACTIVE
            r1.state = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r2) throws java.lang.Exception {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.current()
            if (r0 != 0) goto L7
            return
        L7:
            io.netty.util.ReferenceCountUtil.retain(r0)
            r1.handleOutboundMessage(r0)
            r2.remove()
            goto L0
    }

    protected final void ensureOpen() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.checkOpen(r0)
            if (r0 != 0) goto La
            r1.checkException()
        La:
            return
    }

    public boolean finish() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.finish(r0)
            return r0
    }

    public boolean finishAndReleaseAll() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.finish(r0)
            return r0
    }

    public io.netty.channel.embedded.EmbeddedChannel flushInbound() {
            r2 = this;
            r0 = 1
            io.netty.channel.ChannelPromise r1 = r2.voidPromise()
            r2.flushInbound(r0, r1)
            return r2
    }

    public io.netty.channel.embedded.EmbeddedChannel flushOutbound() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.checkOpen(r0)
            if (r0 == 0) goto La
            r1.flushOutbound0()
        La:
            io.netty.channel.ChannelPromise r0 = r1.voidPromise()
            r1.checkException(r0)
            return r1
    }

    protected void handleInboundMessage(java.lang.Object r2) {
            r1 = this;
            java.util.Queue r0 = r1.inboundMessages()
            r0.add(r2)
            return
    }

    protected void handleOutboundMessage(java.lang.Object r2) {
            r1 = this;
            java.util.Queue r0 = r1.outboundMessages()
            r0.add(r2)
            return
    }

    public java.util.Queue<java.lang.Object> inboundMessages() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.inboundMessages
            if (r0 != 0) goto Lb
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.inboundMessages = r0
        Lb:
            java.util.Queue<java.lang.Object> r0 = r1.inboundMessages
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            io.netty.channel.embedded.EmbeddedChannel$State r0 = r2.state
            io.netty.channel.embedded.EmbeddedChannel$State r1 = io.netty.channel.embedded.EmbeddedChannel.State.ACTIVE
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.embedded.EmbeddedEventLoop
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r2 = this;
            io.netty.channel.embedded.EmbeddedChannel$State r0 = r2.state
            io.netty.channel.embedded.EmbeddedChannel$State r1 = io.netty.channel.embedded.EmbeddedChannel.State.CLOSED
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.util.Queue<java.lang.Object> lastInboundBuffer() {
            r1 = this;
            java.util.Queue r0 = r1.inboundMessages()
            return r0
    }

    @java.lang.Deprecated
    public java.util.Queue<java.lang.Object> lastOutboundBuffer() {
            r1 = this;
            java.util.Queue r0 = r1.outboundMessages()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L9
            java.net.SocketAddress r0 = io.netty.channel.embedded.EmbeddedChannel.LOCAL_ADDRESS
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = r1.metadata
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected final io.netty.channel.DefaultChannelPipeline newChannelPipeline() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline r0 = new io.netty.channel.embedded.EmbeddedChannel$EmbeddedChannelPipeline
            r0.<init>(r1, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe r0 = new io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.Queue<java.lang.Object> outboundMessages() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.outboundMessages
            if (r0 != 0) goto Lb
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.outboundMessages = r0
        Lb:
            java.util.Queue<java.lang.Object> r0 = r1.outboundMessages
            return r0
    }

    public <T> T readInbound() {
            r2 = this;
            java.util.Queue<java.lang.Object> r0 = r2.inboundMessages
            java.lang.Object r0 = poll(r0)
            if (r0 == 0) goto Ld
            java.lang.String r1 = "Caller of readInbound() will handle the message from this point"
            io.netty.util.ReferenceCountUtil.touch(r0, r1)
        Ld:
            return r0
    }

    public <T> T readOutbound() {
            r2 = this;
            java.util.Queue<java.lang.Object> r0 = r2.outboundMessages
            java.lang.Object r0 = poll(r0)
            if (r0 == 0) goto Ld
            java.lang.String r1 = "Caller of readOutbound() will handle the message from this point."
            io.netty.util.ReferenceCountUtil.touch(r0, r1)
        Ld:
            return r0
    }

    public void register() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.embedded.EmbeddedEventLoop r0 = r1.loop
            io.netty.channel.ChannelFuture r0 = r0.register(r1)
            java.lang.Throwable r0 = r0.cause()
            if (r0 == 0) goto Lf
            io.netty.util.internal.PlatformDependent.throwException(r0)
        Lf:
            return
    }

    public boolean releaseInbound() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.inboundMessages
            boolean r0 = releaseAll(r0)
            return r0
    }

    public boolean releaseOutbound() {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.outboundMessages
            boolean r0 = releaseAll(r0)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L9
            java.net.SocketAddress r0 = io.netty.channel.embedded.EmbeddedChannel.REMOTE_ADDRESS
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void runPendingTasks() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedEventLoop r0 = r1.loop     // Catch: java.lang.Exception -> L6
            r0.runTasks()     // Catch: java.lang.Exception -> L6
            goto La
        L6:
            r0 = move-exception
            r1.recordException(r0)
        La:
            io.netty.channel.embedded.EmbeddedEventLoop r0 = r1.loop     // Catch: java.lang.Exception -> L10
            r0.runScheduledTasks()     // Catch: java.lang.Exception -> L10
            goto L14
        L10:
            r0 = move-exception
            r1.recordException(r0)
        L14:
            return
    }

    public long runScheduledPendingTasks() {
            r2 = this;
            io.netty.channel.embedded.EmbeddedEventLoop r0 = r2.loop     // Catch: java.lang.Exception -> L7
            long r0 = r0.runScheduledTasks()     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            r2.recordException(r0)
            io.netty.channel.embedded.EmbeddedEventLoop r0 = r2.loop
            long r0 = r0.nextScheduledTask()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.Channel.Unsafe unsafe() {
            r1 = this;
            io.netty.channel.Channel$Unsafe r0 = super.unsafe()
            io.netty.channel.embedded.EmbeddedChannel$EmbeddedUnsafe r0 = (io.netty.channel.embedded.EmbeddedChannel.EmbeddedUnsafe) r0
            io.netty.channel.Channel$Unsafe r0 = r0.wrapped
            return r0
    }

    public boolean writeInbound(java.lang.Object... r6) {
            r5 = this;
            r5.ensureOpen()
            int r0 = r6.length
            if (r0 != 0) goto Ld
            java.util.Queue<java.lang.Object> r6 = r5.inboundMessages
            boolean r6 = isNotEmpty(r6)
            return r6
        Ld:
            io.netty.channel.ChannelPipeline r0 = r5.pipeline()
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L1e
            r4 = r6[r3]
            r0.fireChannelRead(r4)
            int r3 = r3 + 1
            goto L14
        L1e:
            io.netty.channel.ChannelPromise r6 = r5.voidPromise()
            r5.flushInbound(r2, r6)
            java.util.Queue<java.lang.Object> r6 = r5.inboundMessages
            boolean r6 = isNotEmpty(r6)
            return r6
    }

    public io.netty.channel.ChannelFuture writeOneInbound(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.writeOneInbound(r2, r0)
            return r2
    }

    public io.netty.channel.ChannelFuture writeOneInbound(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.checkOpen(r0)
            if (r0 == 0) goto Le
            io.netty.channel.ChannelPipeline r0 = r1.pipeline()
            r0.fireChannelRead(r2)
        Le:
            io.netty.channel.ChannelFuture r2 = r1.checkException(r3)
            return r2
    }

    public io.netty.channel.ChannelFuture writeOneOutbound(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.writeOneOutbound(r2, r0)
            return r2
    }

    public io.netty.channel.ChannelFuture writeOneOutbound(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.checkOpen(r0)
            if (r0 == 0) goto Lc
            io.netty.channel.ChannelFuture r2 = r1.write(r2, r3)
            return r2
        Lc:
            io.netty.channel.ChannelFuture r2 = r1.checkException(r3)
            return r2
    }

    public boolean writeOutbound(java.lang.Object... r6) {
            r5 = this;
            r5.ensureOpen()
            int r0 = r6.length
            if (r0 != 0) goto Ld
            java.util.Queue<java.lang.Object> r6 = r5.outboundMessages
            boolean r6 = isNotEmpty(r6)
            return r6
        Ld:
            int r0 = r6.length
            io.netty.util.internal.RecyclableArrayList r0 = io.netty.util.internal.RecyclableArrayList.newInstance(r0)
            int r1 = r6.length     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r3 = 0
        L15:
            if (r3 >= r1) goto L28
            r4 = r6[r3]     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L1c
            goto L28
        L1c:
            io.netty.channel.ChannelFuture r4 = r5.write(r4)     // Catch: java.lang.Throwable -> L26
            r0.add(r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            goto L15
        L26:
            r6 = move-exception
            goto L56
        L28:
            r5.flushOutbound0()     // Catch: java.lang.Throwable -> L26
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L26
        L2f:
            if (r2 >= r6) goto L49
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L26
            io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1     // Catch: java.lang.Throwable -> L26
            boolean r3 = r1.isDone()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L41
            r5.recordException(r1)     // Catch: java.lang.Throwable -> L26
            goto L46
        L41:
            io.netty.channel.ChannelFutureListener r3 = r5.recordExceptionListener     // Catch: java.lang.Throwable -> L26
            r1.addListener(r3)     // Catch: java.lang.Throwable -> L26
        L46:
            int r2 = r2 + 1
            goto L2f
        L49:
            r5.checkException()     // Catch: java.lang.Throwable -> L26
            java.util.Queue<java.lang.Object> r6 = r5.outboundMessages     // Catch: java.lang.Throwable -> L26
            boolean r6 = isNotEmpty(r6)     // Catch: java.lang.Throwable -> L26
            r0.recycle()
            return r6
        L56:
            r0.recycle()
            throw r6
    }
}
