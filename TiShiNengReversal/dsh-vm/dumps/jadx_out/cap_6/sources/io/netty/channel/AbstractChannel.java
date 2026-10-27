package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractChannel extends io.netty.util.DefaultAttributeMap implements io.netty.channel.Channel {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.AbstractChannel.CloseFuture closeFuture;
    private boolean closeInitiated;
    private volatile io.netty.channel.EventLoop eventLoop;
    private final io.netty.channel.ChannelId id;
    private java.lang.Throwable initialCloseCause;
    private volatile java.net.SocketAddress localAddress;
    private final io.netty.channel.Channel parent;
    private final io.netty.channel.DefaultChannelPipeline pipeline;
    private volatile boolean registered;
    private volatile java.net.SocketAddress remoteAddress;
    private java.lang.String strVal;
    private boolean strValActive;
    private final io.netty.channel.Channel.Unsafe unsafe;
    private final io.netty.channel.VoidChannelPromise unsafeVoidPromise;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected abstract class AbstractUnsafe implements io.netty.channel.Channel.Unsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean inFlush0;
        private boolean neverRegistered;
        private volatile io.netty.channel.ChannelOutboundBuffer outboundBuffer;
        private io.netty.channel.RecvByteBufAllocator.Handle recvHandle;
        final /* synthetic */ io.netty.channel.AbstractChannel this$0;










        static {
                return
        }

        protected AbstractUnsafe(io.netty.channel.AbstractChannel r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                io.netty.channel.ChannelOutboundBuffer r0 = new io.netty.channel.ChannelOutboundBuffer
                r0.<init>(r2)
                r1.outboundBuffer = r0
                r2 = 1
                r1.neverRegistered = r2
                return
        }

        static /* synthetic */ void access$1000(io.netty.channel.AbstractChannel.AbstractUnsafe r0, java.lang.Runnable r1) {
                r0.invokeLater(r1)
                return
        }

        static /* synthetic */ void access$200(io.netty.channel.AbstractChannel.AbstractUnsafe r0, io.netty.channel.ChannelPromise r1) {
                r0.register0(r1)
                return
        }

        static /* synthetic */ void access$600(io.netty.channel.AbstractChannel.AbstractUnsafe r0, io.netty.channel.ChannelPipeline r1, io.netty.channel.ChannelOutboundBuffer r2, java.lang.Throwable r3) {
                r0.closeOutboundBufferForShutdown(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$800(io.netty.channel.AbstractChannel.AbstractUnsafe r0, io.netty.channel.ChannelPromise r1) {
                r0.doClose0(r1)
                return
        }

        static /* synthetic */ void access$900(io.netty.channel.AbstractChannel.AbstractUnsafe r0, boolean r1) {
                r0.fireChannelInactiveAndDeregister(r1)
                return
        }

        private void assertEventLoop() {
                r0 = this;
                return
        }

        private void close(io.netty.channel.ChannelPromise r10, java.lang.Throwable r11, java.nio.channels.ClosedChannelException r12, boolean r13) {
                r9 = this;
                boolean r0 = r10.setUncancellable()
                if (r0 != 0) goto L7
                return
            L7:
                io.netty.channel.AbstractChannel r0 = r9.this$0
                boolean r0 = io.netty.channel.AbstractChannel.access$700(r0)
                if (r0 == 0) goto L32
                io.netty.channel.AbstractChannel r11 = r9.this$0
                io.netty.channel.AbstractChannel$CloseFuture r11 = io.netty.channel.AbstractChannel.access$400(r11)
                boolean r11 = r11.isDone()
                if (r11 == 0) goto L1f
                r9.safeSetSuccess(r10)
                return
            L1f:
                boolean r11 = r10 instanceof io.netty.channel.VoidChannelPromise
                if (r11 != 0) goto L31
                io.netty.channel.AbstractChannel r11 = r9.this$0
                io.netty.channel.AbstractChannel$CloseFuture r11 = io.netty.channel.AbstractChannel.access$400(r11)
                io.netty.channel.AbstractChannel$AbstractUnsafe$5 r12 = new io.netty.channel.AbstractChannel$AbstractUnsafe$5
                r12.<init>(r9, r10)
                r11.addListener(r12)
            L31:
                return
            L32:
                io.netty.channel.AbstractChannel r0 = r9.this$0
                r1 = 1
                io.netty.channel.AbstractChannel.access$702(r0, r1)
                io.netty.channel.AbstractChannel r0 = r9.this$0
                boolean r8 = r0.isActive()
                io.netty.channel.ChannelOutboundBuffer r4 = r9.outboundBuffer
                r0 = 0
                r9.outboundBuffer = r0
                java.util.concurrent.Executor r0 = r9.prepareToClose()
                if (r0 == 0) goto L57
                io.netty.channel.AbstractChannel$AbstractUnsafe$6 r1 = new io.netty.channel.AbstractChannel$AbstractUnsafe$6
                r2 = r9
                r3 = r10
                r5 = r11
                r7 = r12
                r6 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r0.execute(r1)
                return
            L57:
                r2 = r9
                r3 = r10
                r5 = r11
                r7 = r12
                r6 = r13
                r9.doClose0(r3)     // Catch: java.lang.Throwable -> L78
                if (r4 == 0) goto L67
                r4.failFlushed(r5, r6)
                r4.close(r7)
            L67:
                boolean r10 = r2.inFlush0
                if (r10 == 0) goto L74
                io.netty.channel.AbstractChannel$AbstractUnsafe$7 r10 = new io.netty.channel.AbstractChannel$AbstractUnsafe$7
                r10.<init>(r9, r8)
                r9.invokeLater(r10)
                return
            L74:
                r9.fireChannelInactiveAndDeregister(r8)
                return
            L78:
                r0 = move-exception
                r10 = r0
                if (r4 == 0) goto L82
                r4.failFlushed(r5, r6)
                r4.close(r7)
            L82:
                throw r10
        }

        private void closeOutboundBufferForShutdown(io.netty.channel.ChannelPipeline r2, io.netty.channel.ChannelOutboundBuffer r3, java.lang.Throwable r4) {
                r1 = this;
                r0 = 0
                r3.failFlushed(r4, r0)
                r0 = 1
                r3.close(r4, r0)
                io.netty.channel.socket.ChannelOutputShutdownEvent r3 = io.netty.channel.socket.ChannelOutputShutdownEvent.INSTANCE
                r2.fireUserEventTriggered(r3)
                return
        }

        private void deregister(io.netty.channel.ChannelPromise r2, boolean r3) {
                r1 = this;
                boolean r0 = r2.setUncancellable()
                if (r0 != 0) goto L7
                return
            L7:
                io.netty.channel.AbstractChannel r0 = r1.this$0
                boolean r0 = io.netty.channel.AbstractChannel.access$000(r0)
                if (r0 != 0) goto L13
                r1.safeSetSuccess(r2)
                return
            L13:
                io.netty.channel.AbstractChannel$AbstractUnsafe$8 r0 = new io.netty.channel.AbstractChannel$AbstractUnsafe$8
                r0.<init>(r1, r3, r2)
                r1.invokeLater(r0)
                return
        }

        private void doClose0(io.netty.channel.ChannelPromise r3) {
                r2 = this;
                io.netty.channel.AbstractChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L12
                r0.doClose()     // Catch: java.lang.Throwable -> L12
                io.netty.channel.AbstractChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L12
                io.netty.channel.AbstractChannel$CloseFuture r0 = io.netty.channel.AbstractChannel.access$400(r0)     // Catch: java.lang.Throwable -> L12
                r0.setClosed()     // Catch: java.lang.Throwable -> L12
                r2.safeSetSuccess(r3)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r0 = move-exception
                io.netty.channel.AbstractChannel r1 = r2.this$0
                io.netty.channel.AbstractChannel$CloseFuture r1 = io.netty.channel.AbstractChannel.access$400(r1)
                r1.setClosed()
                r2.safeSetFailure(r3, r0)
                return
        }

        private void fireChannelInactiveAndDeregister(boolean r2) {
                r1 = this;
                io.netty.channel.ChannelPromise r0 = r1.voidPromise()
                if (r2 == 0) goto L10
                io.netty.channel.AbstractChannel r2 = r1.this$0
                boolean r2 = r2.isActive()
                if (r2 != 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                r1.deregister(r0, r2)
                return
        }

        private void invokeLater(java.lang.Runnable r3) {
                r2 = this;
                io.netty.channel.AbstractChannel r0 = r2.this$0     // Catch: java.util.concurrent.RejectedExecutionException -> La
                io.netty.channel.EventLoop r0 = r0.eventLoop()     // Catch: java.util.concurrent.RejectedExecutionException -> La
                r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> La
                return
            La:
                r3 = move-exception
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.access$300()
                java.lang.String r1 = "Can't invoke task later as EventLoop rejected it"
                r0.warn(r1, r3)
                return
        }

        private java.nio.channels.ClosedChannelException newClosedChannelException(java.lang.Throwable r2) {
                r1 = this;
                java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
                r0.<init>()
                if (r2 == 0) goto La
                r0.initCause(r2)
            La:
                return r0
        }

        private void register0(io.netty.channel.ChannelPromise r4) {
                r3 = this;
                boolean r0 = r4.setUncancellable()     // Catch: java.lang.Throwable -> L46
                if (r0 == 0) goto L57
                boolean r0 = r3.ensureOpen(r4)     // Catch: java.lang.Throwable -> L46
                if (r0 != 0) goto Ld
                goto L57
            Ld:
                boolean r0 = r3.neverRegistered     // Catch: java.lang.Throwable -> L46
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                r1.doRegister()     // Catch: java.lang.Throwable -> L46
                r1 = 0
                r3.neverRegistered = r1     // Catch: java.lang.Throwable -> L46
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                r2 = 1
                io.netty.channel.AbstractChannel.access$002(r1, r2)     // Catch: java.lang.Throwable -> L46
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                io.netty.channel.DefaultChannelPipeline r1 = io.netty.channel.AbstractChannel.access$500(r1)     // Catch: java.lang.Throwable -> L46
                r1.invokeHandlerAddedIfNeeded()     // Catch: java.lang.Throwable -> L46
                r3.safeSetSuccess(r4)     // Catch: java.lang.Throwable -> L46
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                io.netty.channel.DefaultChannelPipeline r1 = io.netty.channel.AbstractChannel.access$500(r1)     // Catch: java.lang.Throwable -> L46
                r1.fireChannelRegistered()     // Catch: java.lang.Throwable -> L46
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                boolean r1 = r1.isActive()     // Catch: java.lang.Throwable -> L46
                if (r1 == 0) goto L57
                if (r0 == 0) goto L48
                io.netty.channel.AbstractChannel r0 = r3.this$0     // Catch: java.lang.Throwable -> L46
                io.netty.channel.DefaultChannelPipeline r0 = io.netty.channel.AbstractChannel.access$500(r0)     // Catch: java.lang.Throwable -> L46
                r0.fireChannelActive()     // Catch: java.lang.Throwable -> L46
                return
            L46:
                r0 = move-exception
                goto L58
            L48:
                io.netty.channel.AbstractChannel r0 = r3.this$0     // Catch: java.lang.Throwable -> L46
                io.netty.channel.ChannelConfig r0 = r0.config()     // Catch: java.lang.Throwable -> L46
                boolean r0 = r0.isAutoRead()     // Catch: java.lang.Throwable -> L46
                if (r0 == 0) goto L57
                r3.beginRead()     // Catch: java.lang.Throwable -> L46
            L57:
                return
            L58:
                r3.closeForcibly()
                io.netty.channel.AbstractChannel r1 = r3.this$0
                io.netty.channel.AbstractChannel$CloseFuture r1 = io.netty.channel.AbstractChannel.access$400(r1)
                r1.setClosed()
                r3.safeSetFailure(r4, r0)
                return
        }

        private void shutdownOutput(io.netty.channel.ChannelPromise r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r0 = r4.setUncancellable()
                if (r0 != 0) goto L7
                return
            L7:
                io.netty.channel.ChannelOutboundBuffer r0 = r3.outboundBuffer
                if (r0 != 0) goto L14
                java.nio.channels.ClosedChannelException r5 = new java.nio.channels.ClosedChannelException
                r5.<init>()
                r4.setFailure(r5)
                return
            L14:
                r1 = 0
                r3.outboundBuffer = r1
                java.lang.String r1 = "Channel output shutdown"
                if (r5 != 0) goto L21
                io.netty.channel.socket.ChannelOutputShutdownException r5 = new io.netty.channel.socket.ChannelOutputShutdownException
                r5.<init>(r1)
                goto L27
            L21:
                io.netty.channel.socket.ChannelOutputShutdownException r2 = new io.netty.channel.socket.ChannelOutputShutdownException
                r2.<init>(r1, r5)
                r5 = r2
            L27:
                java.util.concurrent.Executor r1 = r3.prepareToClose()
                if (r1 == 0) goto L36
                io.netty.channel.AbstractChannel$AbstractUnsafe$4 r2 = new io.netty.channel.AbstractChannel$AbstractUnsafe$4
                r2.<init>(r3, r4, r0, r5)
                r1.execute(r2)
                return
            L36:
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L48
                r1.doShutdownOutput()     // Catch: java.lang.Throwable -> L48
                r4.setSuccess()     // Catch: java.lang.Throwable -> L48
                io.netty.channel.AbstractChannel r4 = r3.this$0
                io.netty.channel.DefaultChannelPipeline r4 = io.netty.channel.AbstractChannel.access$500(r4)
                r3.closeOutboundBufferForShutdown(r4, r0, r5)
                return
            L48:
                r1 = move-exception
                r4.setFailure(r1)     // Catch: java.lang.Throwable -> L56
                io.netty.channel.AbstractChannel r4 = r3.this$0
                io.netty.channel.DefaultChannelPipeline r4 = io.netty.channel.AbstractChannel.access$500(r4)
                r3.closeOutboundBufferForShutdown(r4, r0, r5)
                return
            L56:
                r4 = move-exception
                io.netty.channel.AbstractChannel r1 = r3.this$0
                io.netty.channel.DefaultChannelPipeline r1 = io.netty.channel.AbstractChannel.access$500(r1)
                r3.closeOutboundBufferForShutdown(r1, r0, r5)
                throw r4
        }

        protected final java.lang.Throwable annotateConnectException(java.lang.Throwable r2, java.net.SocketAddress r3) {
                r1 = this;
                boolean r0 = r2 instanceof java.net.ConnectException
                if (r0 == 0) goto Lc
                io.netty.channel.AbstractChannel$AnnotatedConnectException r0 = new io.netty.channel.AbstractChannel$AnnotatedConnectException
                java.net.ConnectException r2 = (java.net.ConnectException) r2
                r0.<init>(r2, r3)
                return r0
            Lc:
                boolean r0 = r2 instanceof java.net.NoRouteToHostException
                if (r0 == 0) goto L18
                io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException r0 = new io.netty.channel.AbstractChannel$AnnotatedNoRouteToHostException
                java.net.NoRouteToHostException r2 = (java.net.NoRouteToHostException) r2
                r0.<init>(r2, r3)
                return r0
            L18:
                boolean r0 = r2 instanceof java.net.SocketException
                if (r0 == 0) goto L24
                io.netty.channel.AbstractChannel$AnnotatedSocketException r0 = new io.netty.channel.AbstractChannel$AnnotatedSocketException
                java.net.SocketException r2 = (java.net.SocketException) r2
                r0.<init>(r2, r3)
                return r0
            L24:
                return r2
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void beginRead() {
                r2 = this;
                r2.assertEventLoop()
                io.netty.channel.AbstractChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                if (r0 != 0) goto Lc
                return
            Lc:
                io.netty.channel.AbstractChannel r0 = r2.this$0     // Catch: java.lang.Exception -> L12
                r0.doBeginRead()     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                io.netty.channel.AbstractChannel$AbstractUnsafe$9 r1 = new io.netty.channel.AbstractChannel$AbstractUnsafe$9
                r1.<init>(r2, r0)
                r2.invokeLater(r1)
                io.netty.channel.ChannelPromise r0 = r2.voidPromise()
                r2.close(r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void bind(java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
                r3 = this;
                r3.assertEventLoop()
                boolean r0 = r5.setUncancellable()
                if (r0 == 0) goto L87
                boolean r0 = r3.ensureOpen(r5)
                if (r0 != 0) goto L11
                goto L87
            L11:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                io.netty.channel.AbstractChannel r1 = r3.this$0
                io.netty.channel.ChannelConfig r1 = r1.config()
                io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_BROADCAST
                java.lang.Object r1 = r1.getOption(r2)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L5f
                boolean r0 = r4 instanceof java.net.InetSocketAddress
                if (r0 == 0) goto L5f
                r0 = r4
                java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
                java.net.InetAddress r0 = r0.getAddress()
                boolean r0 = r0.isAnyLocalAddress()
                if (r0 != 0) goto L5f
                boolean r0 = io.netty.util.internal.PlatformDependent.isWindows()
                if (r0 != 0) goto L5f
                boolean r0 = io.netty.util.internal.PlatformDependent.maybeSuperUser()
                if (r0 != 0) goto L5f
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.access$300()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A non-root user can't receive a broadcast packet if the socket is not bound to a wildcard address; binding to a non-wildcard address ("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ") anyway as requested."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.warn(r1)
            L5f:
                io.netty.channel.AbstractChannel r0 = r3.this$0
                boolean r0 = r0.isActive()
                io.netty.channel.AbstractChannel r1 = r3.this$0     // Catch: java.lang.Throwable -> L80
                r1.doBind(r4)     // Catch: java.lang.Throwable -> L80
                if (r0 != 0) goto L7c
                io.netty.channel.AbstractChannel r4 = r3.this$0
                boolean r4 = r4.isActive()
                if (r4 == 0) goto L7c
                io.netty.channel.AbstractChannel$AbstractUnsafe$2 r4 = new io.netty.channel.AbstractChannel$AbstractUnsafe$2
                r4.<init>(r3)
                r3.invokeLater(r4)
            L7c:
                r3.safeSetSuccess(r5)
                return
            L80:
                r4 = move-exception
                r3.safeSetFailure(r5, r4)
                r3.closeIfClosed()
            L87:
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void close(io.netty.channel.ChannelPromise r3) {
                r2 = this;
                r2.assertEventLoop()
                java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
                r0.<init>()
                r1 = 0
                r2.close(r3, r0, r0, r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void closeForcibly() {
                r3 = this;
                r3.assertEventLoop()
                io.netty.channel.AbstractChannel r0 = r3.this$0     // Catch: java.lang.Exception -> L9
                r0.doClose()     // Catch: java.lang.Exception -> L9
                return
            L9:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.AbstractChannel.access$300()
                java.lang.String r2 = "Failed to close a channel."
                r1.warn(r2, r0)
                return
        }

        protected final void closeIfClosed() {
                r1 = this;
                io.netty.channel.AbstractChannel r0 = r1.this$0
                boolean r0 = r0.isOpen()
                if (r0 == 0) goto L9
                return
            L9:
                io.netty.channel.ChannelPromise r0 = r1.voidPromise()
                r1.close(r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void deregister(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                r1.assertEventLoop()
                r0 = 0
                r1.deregister(r2, r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void disconnect(io.netty.channel.ChannelPromise r3) {
                r2 = this;
                r2.assertEventLoop()
                boolean r0 = r3.setUncancellable()
                if (r0 != 0) goto La
                return
            La:
                io.netty.channel.AbstractChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                io.netty.channel.AbstractChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L2e
                r1.doDisconnect()     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L27
                io.netty.channel.AbstractChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                if (r0 != 0) goto L27
                io.netty.channel.AbstractChannel$AbstractUnsafe$3 r0 = new io.netty.channel.AbstractChannel$AbstractUnsafe$3
                r0.<init>(r2)
                r2.invokeLater(r0)
            L27:
                r2.safeSetSuccess(r3)
                r2.closeIfClosed()
                return
            L2e:
                r0 = move-exception
                r2.safeSetFailure(r3, r0)
                r2.closeIfClosed()
                return
        }

        protected final boolean ensureOpen(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                io.netty.channel.AbstractChannel r0 = r1.this$0
                boolean r0 = r0.isOpen()
                if (r0 == 0) goto La
                r2 = 1
                return r2
            La:
                io.netty.channel.AbstractChannel r0 = r1.this$0
                java.lang.Throwable r0 = io.netty.channel.AbstractChannel.access$1100(r0)
                java.nio.channels.ClosedChannelException r0 = r1.newClosedChannelException(r0)
                r1.safeSetFailure(r2, r0)
                r2 = 0
                return r2
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void flush() {
                r1 = this;
                r1.assertEventLoop()
                io.netty.channel.ChannelOutboundBuffer r0 = r1.outboundBuffer
                if (r0 != 0) goto L8
                return
            L8:
                r0.addFlush()
                r1.flush0()
                return
        }

        protected void flush0() {
                r4 = this;
                boolean r0 = r4.inFlush0
                if (r0 == 0) goto L6
                goto L8f
            L6:
                io.netty.channel.ChannelOutboundBuffer r0 = r4.outboundBuffer
                if (r0 == 0) goto L8f
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L12
                goto L8f
            L12:
                r1 = 1
                r4.inFlush0 = r1
                io.netty.channel.AbstractChannel r2 = r4.this$0
                boolean r2 = r2.isActive()
                r3 = 0
                if (r2 != 0) goto L44
                io.netty.channel.AbstractChannel r2 = r4.this$0     // Catch: java.lang.Throwable -> L2f
                boolean r2 = r2.isOpen()     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L31
                java.nio.channels.NotYetConnectedException r2 = new java.nio.channels.NotYetConnectedException     // Catch: java.lang.Throwable -> L2f
                r2.<init>()     // Catch: java.lang.Throwable -> L2f
                r0.failFlushed(r2, r1)     // Catch: java.lang.Throwable -> L2f
                goto L3e
            L2f:
                r0 = move-exception
                goto L41
            L31:
                io.netty.channel.AbstractChannel r1 = r4.this$0     // Catch: java.lang.Throwable -> L2f
                java.lang.Throwable r1 = io.netty.channel.AbstractChannel.access$1100(r1)     // Catch: java.lang.Throwable -> L2f
                java.nio.channels.ClosedChannelException r1 = r4.newClosedChannelException(r1)     // Catch: java.lang.Throwable -> L2f
                r0.failFlushed(r1, r3)     // Catch: java.lang.Throwable -> L2f
            L3e:
                r4.inFlush0 = r3
                return
            L41:
                r4.inFlush0 = r3
                throw r0
            L44:
                io.netty.channel.AbstractChannel r1 = r4.this$0     // Catch: java.lang.Throwable -> L4c
                r1.doWrite(r0)     // Catch: java.lang.Throwable -> L4c
                r4.inFlush0 = r3
                return
            L4c:
                r0 = move-exception
                boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L6e
                if (r1 == 0) goto L70
                io.netty.channel.AbstractChannel r1 = r4.this$0     // Catch: java.lang.Throwable -> L6e
                io.netty.channel.ChannelConfig r1 = r1.config()     // Catch: java.lang.Throwable -> L6e
                boolean r1 = r1.isAutoClose()     // Catch: java.lang.Throwable -> L6e
                if (r1 == 0) goto L70
                io.netty.channel.AbstractChannel r1 = r4.this$0     // Catch: java.lang.Throwable -> L6e
                io.netty.channel.AbstractChannel.access$1102(r1, r0)     // Catch: java.lang.Throwable -> L6e
                io.netty.channel.ChannelPromise r1 = r4.voidPromise()     // Catch: java.lang.Throwable -> L6e
                java.nio.channels.ClosedChannelException r2 = r4.newClosedChannelException(r0)     // Catch: java.lang.Throwable -> L6e
                r4.close(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L6e
                goto L89
            L6e:
                r0 = move-exception
                goto L8c
            L70:
                io.netty.channel.ChannelPromise r1 = r4.voidPromise()     // Catch: java.lang.Throwable -> L78
                r4.shutdownOutput(r1, r0)     // Catch: java.lang.Throwable -> L78
                goto L89
            L78:
                r1 = move-exception
                io.netty.channel.AbstractChannel r2 = r4.this$0     // Catch: java.lang.Throwable -> L6e
                io.netty.channel.AbstractChannel.access$1102(r2, r0)     // Catch: java.lang.Throwable -> L6e
                io.netty.channel.ChannelPromise r2 = r4.voidPromise()     // Catch: java.lang.Throwable -> L6e
                java.nio.channels.ClosedChannelException r0 = r4.newClosedChannelException(r0)     // Catch: java.lang.Throwable -> L6e
                r4.close(r2, r1, r0, r3)     // Catch: java.lang.Throwable -> L6e
            L89:
                r4.inFlush0 = r3
                return
            L8c:
                r4.inFlush0 = r3
                throw r0
            L8f:
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final java.net.SocketAddress localAddress() {
                r1 = this;
                io.netty.channel.AbstractChannel r0 = r1.this$0
                java.net.SocketAddress r0 = r0.localAddress0()
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final io.netty.channel.ChannelOutboundBuffer outboundBuffer() {
                r1 = this;
                io.netty.channel.ChannelOutboundBuffer r0 = r1.outboundBuffer
                return r0
        }

        protected java.util.concurrent.Executor prepareToClose() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public io.netty.channel.RecvByteBufAllocator.Handle recvBufAllocHandle() {
                r1 = this;
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.recvHandle
                if (r0 != 0) goto L14
                io.netty.channel.AbstractChannel r0 = r1.this$0
                io.netty.channel.ChannelConfig r0 = r0.config()
                io.netty.channel.RecvByteBufAllocator r0 = r0.getRecvByteBufAllocator()
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.newHandle()
                r1.recvHandle = r0
            L14:
                io.netty.channel.RecvByteBufAllocator$Handle r0 = r1.recvHandle
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void register(io.netty.channel.EventLoop r4, io.netty.channel.ChannelPromise r5) {
                r3 = this;
                if (r4 == 0) goto L73
                io.netty.channel.AbstractChannel r0 = r3.this$0
                boolean r0 = r0.isRegistered()
                if (r0 == 0) goto L15
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "registered to an event loop already"
                r4.<init>(r0)
                r5.setFailure(r4)
                return
            L15:
                io.netty.channel.AbstractChannel r0 = r3.this$0
                boolean r0 = r0.isCompatible(r4)
                if (r0 != 0) goto L3f
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "incompatible event loop type: "
                r1.append(r2)
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                r5.setFailure(r0)
                return
            L3f:
                io.netty.channel.AbstractChannel r0 = r3.this$0
                io.netty.channel.AbstractChannel.access$102(r0, r4)
                boolean r0 = r4.inEventLoop()
                if (r0 == 0) goto L4e
                r3.register0(r5)
                return
            L4e:
                io.netty.channel.AbstractChannel$AbstractUnsafe$1 r0 = new io.netty.channel.AbstractChannel$AbstractUnsafe$1     // Catch: java.lang.Throwable -> L57
                r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L57
                r4.execute(r0)     // Catch: java.lang.Throwable -> L57
                return
            L57:
                r4 = move-exception
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.access$300()
                java.lang.String r1 = "Force-closing a channel whose registration task was not accepted by an event loop: {}"
                io.netty.channel.AbstractChannel r2 = r3.this$0
                r0.warn(r1, r2, r4)
                r3.closeForcibly()
                io.netty.channel.AbstractChannel r0 = r3.this$0
                io.netty.channel.AbstractChannel$CloseFuture r0 = io.netty.channel.AbstractChannel.access$400(r0)
                r0.setClosed()
                r3.safeSetFailure(r5, r4)
                return
            L73:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "eventLoop"
                r4.<init>(r5)
                throw r4
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final java.net.SocketAddress remoteAddress() {
                r1 = this;
                io.netty.channel.AbstractChannel r0 = r1.this$0
                java.net.SocketAddress r0 = r0.remoteAddress0()
                return r0
        }

        protected final void safeSetFailure(io.netty.channel.ChannelPromise r3, java.lang.Throwable r4) {
                r2 = this;
                boolean r0 = r3 instanceof io.netty.channel.VoidChannelPromise
                if (r0 != 0) goto L13
                boolean r0 = r3.tryFailure(r4)
                if (r0 != 0) goto L13
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.access$300()
                java.lang.String r1 = "Failed to mark a promise as failure because it's done already: {}"
                r0.warn(r1, r3, r4)
            L13:
                return
        }

        protected final void safeSetSuccess(io.netty.channel.ChannelPromise r3) {
                r2 = this;
                boolean r0 = r3 instanceof io.netty.channel.VoidChannelPromise
                if (r0 != 0) goto L13
                boolean r0 = r3.trySuccess()
                if (r0 != 0) goto L13
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.access$300()
                java.lang.String r1 = "Failed to mark a promise as success because it is done already: {}"
                r0.warn(r1, r3)
            L13:
                return
        }

        public final void shutdownOutput(io.netty.channel.ChannelPromise r2) {
                r1 = this;
                r1.assertEventLoop()
                r0 = 0
                r1.shutdownOutput(r2, r0)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final io.netty.channel.ChannelPromise voidPromise() {
                r1 = this;
                r1.assertEventLoop()
                io.netty.channel.AbstractChannel r0 = r1.this$0
                io.netty.channel.VoidChannelPromise r0 = io.netty.channel.AbstractChannel.access$1200(r0)
                return r0
        }

        @Override // io.netty.channel.Channel.Unsafe
        public final void write(java.lang.Object r3, io.netty.channel.ChannelPromise r4) {
                r2 = this;
                r2.assertEventLoop()
                io.netty.channel.ChannelOutboundBuffer r0 = r2.outboundBuffer
                if (r0 != 0) goto L18
                io.netty.channel.AbstractChannel r0 = r2.this$0
                java.lang.Throwable r0 = io.netty.channel.AbstractChannel.access$1100(r0)
                java.nio.channels.ClosedChannelException r0 = r2.newClosedChannelException(r0)
                r2.safeSetFailure(r4, r0)
                io.netty.util.ReferenceCountUtil.release(r3)
                return
            L18:
                io.netty.channel.AbstractChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L33
                java.lang.Object r3 = r1.filterOutboundMessage(r3)     // Catch: java.lang.Throwable -> L33
                io.netty.channel.AbstractChannel r1 = r2.this$0     // Catch: java.lang.Throwable -> L33
                io.netty.channel.DefaultChannelPipeline r1 = io.netty.channel.AbstractChannel.access$500(r1)     // Catch: java.lang.Throwable -> L33
                io.netty.channel.MessageSizeEstimator$Handle r1 = r1.estimatorHandle()     // Catch: java.lang.Throwable -> L33
                int r1 = r1.size(r3)     // Catch: java.lang.Throwable -> L33
                if (r1 >= 0) goto L2f
                r1 = 0
            L2f:
                r0.addMessage(r3, r1, r4)
                return
            L33:
                r0 = move-exception
                r2.safeSetFailure(r4, r0)
                io.netty.util.ReferenceCountUtil.release(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AnnotatedConnectException extends java.net.ConnectException {
        private static final long serialVersionUID = 3901958112696433556L;

        AnnotatedConnectException(java.net.ConnectException r3, java.net.SocketAddress r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.initCause(r3)
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable fillInStackTrace() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AnnotatedNoRouteToHostException extends java.net.NoRouteToHostException {
        private static final long serialVersionUID = -6801433937592080623L;

        AnnotatedNoRouteToHostException(java.net.NoRouteToHostException r3, java.net.SocketAddress r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.initCause(r3)
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable fillInStackTrace() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AnnotatedSocketException extends java.net.SocketException {
        private static final long serialVersionUID = 3896743275010454039L;

        AnnotatedSocketException(java.net.SocketException r3, java.net.SocketAddress r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.initCause(r3)
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable fillInStackTrace() {
                r0 = this;
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CloseFuture extends io.netty.channel.DefaultChannelPromise {
        CloseFuture(io.netty.channel.AbstractChannel r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        boolean setClosed() {
                r1 = this;
                boolean r0 = super.trySuccess()
                return r0
        }

        @Override // io.netty.channel.DefaultChannelPromise, io.netty.channel.ChannelPromise
        public io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r1) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.channel.DefaultChannelPromise
        /* renamed from: setFailure, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise mo20setFailure(java.lang.Throwable r1) {
                r0 = this;
                io.netty.channel.ChannelPromise r1 = r0.setFailure(r1)
                return r1
        }

        @Override // io.netty.channel.DefaultChannelPromise, io.netty.channel.ChannelPromise
        public io.netty.channel.ChannelPromise setSuccess() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        public boolean tryFailure(java.lang.Throwable r1) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        @Override // io.netty.channel.DefaultChannelPromise, io.netty.channel.ChannelPromise
        public boolean trySuccess() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    static {
            java.lang.Class<io.netty.channel.AbstractChannel> r0 = io.netty.channel.AbstractChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.AbstractChannel.logger = r0
            return
    }

    protected AbstractChannel(io.netty.channel.Channel r3) {
            r2 = this;
            r2.<init>()
            io.netty.channel.VoidChannelPromise r0 = new io.netty.channel.VoidChannelPromise
            r1 = 0
            r0.<init>(r2, r1)
            r2.unsafeVoidPromise = r0
            io.netty.channel.AbstractChannel$CloseFuture r0 = new io.netty.channel.AbstractChannel$CloseFuture
            r0.<init>(r2)
            r2.closeFuture = r0
            r2.parent = r3
            io.netty.channel.ChannelId r3 = r2.newId()
            r2.id = r3
            io.netty.channel.AbstractChannel$AbstractUnsafe r3 = r2.newUnsafe()
            r2.unsafe = r3
            io.netty.channel.DefaultChannelPipeline r3 = r2.newChannelPipeline()
            r2.pipeline = r3
            return
    }

    protected AbstractChannel(io.netty.channel.Channel r3, io.netty.channel.ChannelId r4) {
            r2 = this;
            r2.<init>()
            io.netty.channel.VoidChannelPromise r0 = new io.netty.channel.VoidChannelPromise
            r1 = 0
            r0.<init>(r2, r1)
            r2.unsafeVoidPromise = r0
            io.netty.channel.AbstractChannel$CloseFuture r0 = new io.netty.channel.AbstractChannel$CloseFuture
            r0.<init>(r2)
            r2.closeFuture = r0
            r2.parent = r3
            r2.id = r4
            io.netty.channel.AbstractChannel$AbstractUnsafe r3 = r2.newUnsafe()
            r2.unsafe = r3
            io.netty.channel.DefaultChannelPipeline r3 = r2.newChannelPipeline()
            r2.pipeline = r3
            return
    }

    static /* synthetic */ boolean access$000(io.netty.channel.AbstractChannel r0) {
            boolean r0 = r0.registered
            return r0
    }

    static /* synthetic */ boolean access$002(io.netty.channel.AbstractChannel r0, boolean r1) {
            r0.registered = r1
            return r1
    }

    static /* synthetic */ io.netty.channel.EventLoop access$100(io.netty.channel.AbstractChannel r0) {
            io.netty.channel.EventLoop r0 = r0.eventLoop
            return r0
    }

    static /* synthetic */ io.netty.channel.EventLoop access$102(io.netty.channel.AbstractChannel r0, io.netty.channel.EventLoop r1) {
            r0.eventLoop = r1
            return r1
    }

    static /* synthetic */ java.lang.Throwable access$1100(io.netty.channel.AbstractChannel r0) {
            java.lang.Throwable r0 = r0.initialCloseCause
            return r0
    }

    static /* synthetic */ java.lang.Throwable access$1102(io.netty.channel.AbstractChannel r0, java.lang.Throwable r1) {
            r0.initialCloseCause = r1
            return r1
    }

    static /* synthetic */ io.netty.channel.VoidChannelPromise access$1200(io.netty.channel.AbstractChannel r0) {
            io.netty.channel.VoidChannelPromise r0 = r0.unsafeVoidPromise
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$300() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.AbstractChannel.logger
            return r0
    }

    static /* synthetic */ io.netty.channel.AbstractChannel.CloseFuture access$400(io.netty.channel.AbstractChannel r0) {
            io.netty.channel.AbstractChannel$CloseFuture r0 = r0.closeFuture
            return r0
    }

    static /* synthetic */ io.netty.channel.DefaultChannelPipeline access$500(io.netty.channel.AbstractChannel r0) {
            io.netty.channel.DefaultChannelPipeline r0 = r0.pipeline
            return r0
    }

    static /* synthetic */ boolean access$700(io.netty.channel.AbstractChannel r0) {
            boolean r0 = r0.closeInitiated
            return r0
    }

    static /* synthetic */ boolean access$702(io.netty.channel.AbstractChannel r0, boolean r1) {
            r0.closeInitiated = r1
            return r1
    }

    @Override // io.netty.channel.Channel
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config()
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.bind(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture bind(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.bind(r2, r3)
            return r2
    }

    @Override // io.netty.channel.Channel
    public long bytesBeforeUnwritable() {
            r2 = this;
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            if (r0 == 0) goto Ld
            long r0 = r0.bytesBeforeUnwritable()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public long bytesBeforeWritable() {
            r2 = this;
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            if (r0 == 0) goto Ld
            long r0 = r0.bytesBeforeWritable()
            return r0
        Ld:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r0 = r0.close()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.close(r2)
            return r2
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelFuture closeFuture() {
            r1 = this;
            io.netty.channel.AbstractChannel$CloseFuture r0 = r1.closeFuture
            return r0
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(io.netty.channel.Channel r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 0
            return r2
        L4:
            io.netty.channel.ChannelId r0 = r1.id()
            io.netty.channel.ChannelId r2 = r2.id()
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.netty.channel.Channel r1) {
            r0 = this;
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.connect(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.connect(r2, r3, r4)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r0 = r0.deregister()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture deregister(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.deregister(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r0 = r0.disconnect()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture disconnect(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.disconnect(r2)
            return r2
    }

    protected abstract void doBeginRead() throws java.lang.Exception;

    protected abstract void doBind(java.net.SocketAddress r1) throws java.lang.Exception;

    protected abstract void doClose() throws java.lang.Exception;

    protected void doDeregister() throws java.lang.Exception {
            r0 = this;
            return
    }

    protected abstract void doDisconnect() throws java.lang.Exception;

    protected void doRegister() throws java.lang.Exception {
            r0 = this;
            return
    }

    protected void doShutdownOutput() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    protected abstract void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception;

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.EventLoop eventLoop() {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "channel not registered to an event loop"
            r0.<init>(r1)
            throw r0
    }

    protected java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            return r1
    }

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.Channel flush() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            r0.flush()
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker flush() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.flush()
            return r0
    }

    public final int hashCode() {
            r1 = this;
            io.netty.channel.ChannelId r0 = r1.id
            int r0 = r0.hashCode()
            return r0
    }

    @Override // io.netty.channel.Channel
    public final io.netty.channel.ChannelId id() {
            r1 = this;
            io.netty.channel.ChannelId r0 = r1.id
            return r0
    }

    @java.lang.Deprecated
    protected void invalidateLocalAddress() {
            r1 = this;
            r0 = 0
            r1.localAddress = r0
            return
    }

    @java.lang.Deprecated
    protected void invalidateRemoteAddress() {
            r1 = this;
            r0 = 0
            r1.remoteAddress = r0
            return
    }

    protected abstract boolean isCompatible(io.netty.channel.EventLoop r1);

    @Override // io.netty.channel.Channel
    public boolean isRegistered() {
            r1 = this;
            boolean r0 = r1.registered
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isWritable() {
            r1 = this;
            io.netty.channel.Channel$Unsafe r0 = r1.unsafe
            io.netty.channel.ChannelOutboundBuffer r0 = r0.outboundBuffer()
            if (r0 == 0) goto L10
            boolean r0 = r0.isWritable()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public java.net.SocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.localAddress
            if (r0 != 0) goto L14
            io.netty.channel.Channel$Unsafe r0 = r1.unsafe()     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            java.net.SocketAddress r0 = r0.localAddress()     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            r1.localAddress = r0     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            return r0
        Lf:
            r0 = move-exception
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            throw r0
        L14:
            return r0
    }

    protected abstract java.net.SocketAddress localAddress0();

    protected io.netty.channel.DefaultChannelPipeline newChannelPipeline() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = new io.netty.channel.DefaultChannelPipeline
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newFailedFuture(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.newFailedFuture(r2)
            return r2
    }

    protected io.netty.channel.ChannelId newId() {
            r1 = this;
            io.netty.channel.DefaultChannelId r0 = io.netty.channel.DefaultChannelId.newInstance()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelProgressivePromise newProgressivePromise() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelProgressivePromise r0 = r0.newProgressivePromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelPromise newPromise() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture newSucceededFuture() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r0 = r0.newSucceededFuture()
            return r0
    }

    protected abstract io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe();

    @Override // io.netty.channel.Channel
    public io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.parent
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelPipeline pipeline() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            return r0
    }

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.Channel read() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            r0.read()
            return r1
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelOutboundInvoker read() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.read()
            return r0
    }

    @Override // io.netty.channel.Channel
    public java.net.SocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.remoteAddress
            if (r0 != 0) goto L14
            io.netty.channel.Channel$Unsafe r0 = r1.unsafe()     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            java.net.SocketAddress r0 = r0.remoteAddress()     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            r1.remoteAddress = r0     // Catch: java.lang.Error -> Lf java.lang.Throwable -> L11
            return r0
        Lf:
            r0 = move-exception
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            throw r0
        L14:
            return r0
    }

    protected abstract java.net.SocketAddress remoteAddress0();

    public java.lang.String toString() {
            r8 = this;
            boolean r0 = r8.isActive()
            boolean r1 = r8.strValActive
            if (r1 != r0) goto Ld
            java.lang.String r1 = r8.strVal
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.net.SocketAddress r1 = r8.remoteAddress()
            java.net.SocketAddress r2 = r8.localAddress()
            java.lang.String r3 = ", L:"
            r4 = 93
            java.lang.String r5 = "[id: 0x"
            if (r1 == 0) goto L52
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 96
            r6.<init>(r7)
            r6.append(r5)
            io.netty.channel.ChannelId r5 = r8.id
            java.lang.String r5 = r5.asShortText()
            r6.append(r5)
            r6.append(r3)
            r6.append(r2)
            if (r0 == 0) goto L3b
            java.lang.String r2 = " - "
            goto L3d
        L3b:
            java.lang.String r2 = " ! "
        L3d:
            r6.append(r2)
            java.lang.String r2 = "R:"
            r6.append(r2)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r8.strVal = r1
            goto L93
        L52:
            if (r2 == 0) goto L77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = 64
            r1.<init>(r6)
            r1.append(r5)
            io.netty.channel.ChannelId r5 = r8.id
            java.lang.String r5 = r5.asShortText()
            r1.append(r5)
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r8.strVal = r1
            goto L93
        L77:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 16
            r1.<init>(r2)
            r1.append(r5)
            io.netty.channel.ChannelId r2 = r8.id
            java.lang.String r2 = r2.asShortText()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r8.strVal = r1
        L93:
            r8.strValActive = r0
            java.lang.String r0 = r8.strVal
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.Channel.Unsafe unsafe() {
            r1 = this;
            io.netty.channel.Channel$Unsafe r0 = r1.unsafe
            return r0
    }

    protected void validateFileRegion(io.netty.channel.DefaultFileRegion r1, long r2) throws java.io.IOException {
            r0 = this;
            io.netty.channel.DefaultFileRegion.validate(r1, r2)
            return
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public final io.netty.channel.ChannelPromise voidPromise() {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelPromise r0 = r0.voidPromise()
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.write(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture write(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.write(r2, r3)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    public io.netty.channel.ChannelFuture writeAndFlush(java.lang.Object r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.DefaultChannelPipeline r0 = r1.pipeline
            io.netty.channel.ChannelFuture r2 = r0.writeAndFlush(r2, r3)
            return r2
    }
}
