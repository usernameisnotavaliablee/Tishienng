package io.netty.channel.local;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LocalChannel extends io.netty.channel.AbstractChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.local.LocalChannel, io.netty.util.concurrent.Future> FINISH_READ_FUTURE_UPDATER = null;
    private static final int MAX_READER_STACK_DEPTH = 8;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.ChannelConfig config;
    private volatile io.netty.channel.ChannelPromise connectPromise;
    private volatile io.netty.util.concurrent.Future<?> finishReadFuture;
    final java.util.Queue<java.lang.Object> inboundBuffer;
    private volatile io.netty.channel.local.LocalAddress localAddress;
    private volatile io.netty.channel.local.LocalChannel peer;
    private volatile boolean readInProgress;
    private final java.lang.Runnable readTask;
    private volatile io.netty.channel.local.LocalAddress remoteAddress;
    private final java.lang.Runnable shutdownHook;
    private volatile io.netty.channel.local.LocalChannel.State state;
    private volatile boolean writeInProgress;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.local.LocalChannel$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$local$LocalChannel$State = null;

        static {
                io.netty.channel.local.LocalChannel$State[] r0 = io.netty.channel.local.LocalChannel.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.local.LocalChannel.AnonymousClass6.$SwitchMap$io$netty$channel$local$LocalChannel$State = r0
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.local.LocalChannel.AnonymousClass6.$SwitchMap$io$netty$channel$local$LocalChannel$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.BOUND     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.channel.local.LocalChannel.AnonymousClass6.$SwitchMap$io$netty$channel$local$LocalChannel$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.channel.local.LocalChannel.AnonymousClass6.$SwitchMap$io$netty$channel$local$LocalChannel$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CONNECTED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class LocalUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.channel.local.LocalChannel this$0;

        private LocalUnsafe(io.netty.channel.local.LocalChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ LocalUnsafe(io.netty.channel.local.LocalChannel r1, io.netty.channel.local.LocalChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
                r2 = this;
                boolean r0 = r5.setUncancellable()
                if (r0 == 0) goto L99
                boolean r0 = r2.ensureOpen(r5)
                if (r0 != 0) goto Le
                goto L99
            Le:
                io.netty.channel.local.LocalChannel r0 = r2.this$0
                io.netty.channel.local.LocalChannel$State r0 = io.netty.channel.local.LocalChannel.access$500(r0)
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CONNECTED
                if (r0 != r1) goto L2a
                java.nio.channels.AlreadyConnectedException r3 = new java.nio.channels.AlreadyConnectedException
                r3.<init>()
                r2.safeSetFailure(r5, r3)
                io.netty.channel.local.LocalChannel r4 = r2.this$0
                io.netty.channel.ChannelPipeline r4 = r4.pipeline()
                r4.fireExceptionCaught(r3)
                return
            L2a:
                io.netty.channel.local.LocalChannel r0 = r2.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.local.LocalChannel.access$200(r0)
                if (r0 != 0) goto L93
                io.netty.channel.local.LocalChannel r0 = r2.this$0
                io.netty.channel.local.LocalChannel.access$202(r0, r5)
                io.netty.channel.local.LocalChannel r0 = r2.this$0
                io.netty.channel.local.LocalChannel$State r0 = io.netty.channel.local.LocalChannel.access$500(r0)
                io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.BOUND
                if (r0 == r1) goto L4a
                if (r4 != 0) goto L4a
                io.netty.channel.local.LocalAddress r4 = new io.netty.channel.local.LocalAddress
                io.netty.channel.local.LocalChannel r0 = r2.this$0
                r4.<init>(r0)
            L4a:
                if (r4 == 0) goto L5e
                io.netty.channel.local.LocalChannel r0 = r2.this$0     // Catch: java.lang.Throwable -> L52
                r0.doBind(r4)     // Catch: java.lang.Throwable -> L52
                goto L5e
            L52:
                r3 = move-exception
                r2.safeSetFailure(r5, r3)
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
                return
            L5e:
                io.netty.channel.Channel r4 = io.netty.channel.local.LocalChannelRegistry.get(r3)
                boolean r0 = r4 instanceof io.netty.channel.local.LocalServerChannel
                if (r0 != 0) goto L87
                java.net.ConnectException r4 = new java.net.ConnectException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "connection refused: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                r2.safeSetFailure(r5, r4)
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
                return
            L87:
                io.netty.channel.local.LocalServerChannel r4 = (io.netty.channel.local.LocalServerChannel) r4
                io.netty.channel.local.LocalChannel r3 = r2.this$0
                io.netty.channel.local.LocalChannel r4 = r4.serve(r3)
                io.netty.channel.local.LocalChannel.access$602(r3, r4)
                return
            L93:
                java.nio.channels.ConnectionPendingException r3 = new java.nio.channels.ConnectionPendingException
                r3.<init>()
                throw r3
            L99:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.channel.local.LocalChannel.State> {
        private static final /* synthetic */ io.netty.channel.local.LocalChannel.State[] $VALUES = null;
        public static final io.netty.channel.local.LocalChannel.State BOUND = null;
        public static final io.netty.channel.local.LocalChannel.State CLOSED = null;
        public static final io.netty.channel.local.LocalChannel.State CONNECTED = null;
        public static final io.netty.channel.local.LocalChannel.State OPEN = null;

        static {
                io.netty.channel.local.LocalChannel$State r0 = new io.netty.channel.local.LocalChannel$State
                java.lang.String r1 = "OPEN"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.channel.local.LocalChannel.State.OPEN = r0
                io.netty.channel.local.LocalChannel$State r1 = new io.netty.channel.local.LocalChannel$State
                java.lang.String r3 = "BOUND"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.channel.local.LocalChannel.State.BOUND = r1
                io.netty.channel.local.LocalChannel$State r3 = new io.netty.channel.local.LocalChannel$State
                java.lang.String r5 = "CONNECTED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.channel.local.LocalChannel.State.CONNECTED = r3
                io.netty.channel.local.LocalChannel$State r5 = new io.netty.channel.local.LocalChannel$State
                java.lang.String r7 = "CLOSED"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.channel.local.LocalChannel.State.CLOSED = r5
                r7 = 4
                io.netty.channel.local.LocalChannel$State[] r7 = new io.netty.channel.local.LocalChannel.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.channel.local.LocalChannel.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.channel.local.LocalChannel.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.channel.local.LocalChannel$State> r0 = io.netty.channel.local.LocalChannel.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.channel.local.LocalChannel$State r1 = (io.netty.channel.local.LocalChannel.State) r1
                return r1
        }

        public static io.netty.channel.local.LocalChannel.State[] values() {
                io.netty.channel.local.LocalChannel$State[] r0 = io.netty.channel.local.LocalChannel.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.channel.local.LocalChannel$State[] r0 = (io.netty.channel.local.LocalChannel.State[]) r0
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.channel.local.LocalChannel> r0 = io.netty.channel.local.LocalChannel.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.local.LocalChannel.logger = r1
            java.lang.Class<io.netty.util.concurrent.Future> r1 = io.netty.util.concurrent.Future.class
            java.lang.String r2 = "finishReadFuture"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            io.netty.channel.local.LocalChannel.FINISH_READ_FUTURE_UPDATER = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.local.LocalChannel.METADATA = r0
            return
    }

    public LocalChannel() {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            io.netty.channel.DefaultChannelConfig r0 = new io.netty.channel.DefaultChannelConfig
            r0.<init>(r3)
            r3.config = r0
            java.util.Queue r1 = io.netty.util.internal.PlatformDependent.newSpscQueue()
            r3.inboundBuffer = r1
            io.netty.channel.local.LocalChannel$1 r1 = new io.netty.channel.local.LocalChannel$1
            r1.<init>(r3)
            r3.readTask = r1
            io.netty.channel.local.LocalChannel$2 r1 = new io.netty.channel.local.LocalChannel$2
            r1.<init>(r3)
            r3.shutdownHook = r1
            io.netty.channel.ChannelConfig r1 = r3.config()
            io.netty.channel.PreferHeapByteBufAllocator r2 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            r2.<init>(r0)
            r1.setAllocator(r2)
            return
    }

    protected LocalChannel(io.netty.channel.local.LocalServerChannel r4, io.netty.channel.local.LocalChannel r5) {
            r3 = this;
            r3.<init>(r4)
            io.netty.channel.DefaultChannelConfig r0 = new io.netty.channel.DefaultChannelConfig
            r0.<init>(r3)
            r3.config = r0
            java.util.Queue r1 = io.netty.util.internal.PlatformDependent.newSpscQueue()
            r3.inboundBuffer = r1
            io.netty.channel.local.LocalChannel$1 r1 = new io.netty.channel.local.LocalChannel$1
            r1.<init>(r3)
            r3.readTask = r1
            io.netty.channel.local.LocalChannel$2 r1 = new io.netty.channel.local.LocalChannel$2
            r1.<init>(r3)
            r3.shutdownHook = r1
            io.netty.channel.ChannelConfig r1 = r3.config()
            io.netty.channel.PreferHeapByteBufAllocator r2 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            r2.<init>(r0)
            r1.setAllocator(r2)
            r3.peer = r5
            io.netty.channel.local.LocalAddress r4 = r4.localAddress()
            r3.localAddress = r4
            io.netty.channel.local.LocalAddress r4 = r5.localAddress()
            r3.remoteAddress = r4
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.local.LocalChannel r0) {
            r0.readInbound()
            return
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$200(io.netty.channel.local.LocalChannel r0) {
            io.netty.channel.ChannelPromise r0 = r0.connectPromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$202(io.netty.channel.local.LocalChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.connectPromise = r1
            return r1
    }

    static /* synthetic */ void access$300(io.netty.channel.local.LocalChannel r0, boolean r1) {
            r0.tryClose(r1)
            return
    }

    static /* synthetic */ void access$400(io.netty.channel.local.LocalChannel r0, io.netty.channel.local.LocalChannel r1) {
            r0.finishPeerRead0(r1)
            return
    }

    static /* synthetic */ io.netty.channel.local.LocalChannel.State access$500(io.netty.channel.local.LocalChannel r0) {
            io.netty.channel.local.LocalChannel$State r0 = r0.state
            return r0
    }

    static /* synthetic */ io.netty.channel.local.LocalChannel access$602(io.netty.channel.local.LocalChannel r0, io.netty.channel.local.LocalChannel r1) {
            r0.peer = r1
            return r1
    }

    private void finishPeerRead(io.netty.channel.local.LocalChannel r3) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.channel.EventLoop r1 = r2.eventLoop()
            if (r0 != r1) goto L12
            boolean r0 = r3.writeInProgress
            if (r0 != 0) goto L12
            r2.finishPeerRead0(r3)
            return
        L12:
            r2.runFinishPeerReadTask(r3)
            return
    }

    private void finishPeerRead0(io.netty.channel.local.LocalChannel r4) {
            r3 = this;
            io.netty.util.concurrent.Future<?> r0 = r4.finishReadFuture
            if (r0 == 0) goto L14
            boolean r1 = r0.isDone()
            if (r1 != 0) goto Le
            r3.runFinishPeerReadTask(r4)
            return
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.local.LocalChannel, io.netty.util.concurrent.Future> r1 = io.netty.channel.local.LocalChannel.FINISH_READ_FUTURE_UPDATER
            r2 = 0
            androidx.concurrent.futures.a.a(r1, r4, r0, r2)
        L14:
            boolean r0 = r4.readInProgress
            if (r0 == 0) goto L26
            java.util.Queue<java.lang.Object> r0 = r4.inboundBuffer
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            r0 = 0
            r4.readInProgress = r0
            r4.readInbound()
        L26:
            return
    }

    private void readInbound() {
            r3 = this;
            io.netty.channel.Channel$Unsafe r0 = r3.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            io.netty.channel.ChannelConfig r1 = r3.config()
            r0.reset(r1)
            io.netty.channel.ChannelPipeline r1 = r3.pipeline()
        L13:
            java.util.Queue<java.lang.Object> r2 = r3.inboundBuffer
            java.lang.Object r2 = r2.poll()
            if (r2 != 0) goto L1c
            goto L25
        L1c:
            r1.fireChannelRead(r2)
            boolean r2 = r0.continueReading()
            if (r2 != 0) goto L13
        L25:
            r1.fireChannelReadComplete()
            return
    }

    private void releaseInboundBuffers() {
            r2 = this;
            r0 = 0
            r2.readInProgress = r0
            java.util.Queue<java.lang.Object> r0 = r2.inboundBuffer
        L5:
            java.lang.Object r1 = r0.poll()
            if (r1 == 0) goto Lf
            io.netty.util.ReferenceCountUtil.release(r1)
            goto L5
        Lf:
            return
    }

    private void runFinishPeerReadTask(io.netty.channel.local.LocalChannel r5) {
            r4 = this;
            io.netty.channel.local.LocalChannel$5 r0 = new io.netty.channel.local.LocalChannel$5
            r0.<init>(r4, r5)
            boolean r1 = r5.writeInProgress     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            io.netty.channel.EventLoop r1 = r5.eventLoop()     // Catch: java.lang.Throwable -> L14
            io.netty.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.Throwable -> L14
            r5.finishReadFuture = r0     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            goto L1e
        L16:
            io.netty.channel.EventLoop r1 = r5.eventLoop()     // Catch: java.lang.Throwable -> L14
            r1.execute(r0)     // Catch: java.lang.Throwable -> L14
            return
        L1e:
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.local.LocalChannel.logger
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r3 = 2
            r2[r3] = r0
            java.lang.String r3 = "Closing Local channels {}-{} because exception occurred!"
            r1.warn(r3, r2)
            r4.close()
            r5.close()
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return
    }

    private void tryClose(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L12
            io.netty.channel.Channel$Unsafe r2 = r1.unsafe()
            io.netty.channel.Channel$Unsafe r0 = r1.unsafe()
            io.netty.channel.ChannelPromise r0 = r0.voidPromise()
            r2.close(r0)
            return
        L12:
            r1.releaseInboundBuffers()
            return
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() throws java.lang.Exception {
            r6 = this;
            boolean r0 = r6.readInProgress
            if (r0 == 0) goto L5
            return
        L5:
            java.util.Queue<java.lang.Object> r0 = r6.inboundBuffer
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L11
            r6.readInProgress = r1
            return
        L11:
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            int r2 = r0.localChannelReaderStackDepth()
            r3 = 8
            if (r2 >= r3) goto L2e
            int r1 = r2 + 1
            r0.setLocalChannelReaderStackDepth(r1)
            r6.readInbound()     // Catch: java.lang.Throwable -> L29
            r0.setLocalChannelReaderStackDepth(r2)
            return
        L29:
            r1 = move-exception
            r0.setLocalChannelReaderStackDepth(r2)
            throw r1
        L2e:
            io.netty.channel.EventLoop r0 = r6.eventLoop()     // Catch: java.lang.Throwable -> L38
            java.lang.Runnable r2 = r6.readTask     // Catch: java.lang.Throwable -> L38
            r0.execute(r2)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.local.LocalChannel.logger
            io.netty.channel.local.LocalChannel r3 = r6.peer
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r6
            r4[r1] = r3
            r1 = 2
            r4[r1] = r0
            java.lang.String r1 = "Closing Local channels {}-{} because exception occurred!"
            r2.warn(r1, r4)
            r6.close()
            io.netty.channel.local.LocalChannel r1 = r6.peer
            r1.close()
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress
            io.netty.channel.local.LocalAddress r2 = io.netty.channel.local.LocalChannelRegistry.register(r1, r0, r2)
            r1.localAddress = r2
            io.netty.channel.local.LocalChannel$State r2 = io.netty.channel.local.LocalChannel.State.BOUND
            r1.state = r2
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r8 = this;
            io.netty.channel.local.LocalChannel r0 = r8.peer
            io.netty.channel.local.LocalChannel$State r1 = r8.state
            io.netty.channel.local.LocalChannel$State r2 = io.netty.channel.local.LocalChannel.State.CLOSED     // Catch: java.lang.Throwable -> L19
            r3 = 0
            if (r1 == r2) goto L36
            io.netty.channel.local.LocalAddress r4 = r8.localAddress     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L1d
            io.netty.channel.local.LocalServerChannel r4 = r8.parent()     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L1b
            io.netty.channel.local.LocalAddress r4 = r8.localAddress     // Catch: java.lang.Throwable -> L19
            io.netty.channel.local.LocalChannelRegistry.unregister(r4)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L79
        L1b:
            r8.localAddress = r3     // Catch: java.lang.Throwable -> L19
        L1d:
            r8.state = r2     // Catch: java.lang.Throwable -> L19
            boolean r2 = r8.writeInProgress     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            r8.finishPeerRead(r0)     // Catch: java.lang.Throwable -> L19
        L28:
            io.netty.channel.ChannelPromise r2 = r8.connectPromise     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L36
            java.nio.channels.ClosedChannelException r4 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L19
            r4.<init>()     // Catch: java.lang.Throwable -> L19
            r2.tryFailure(r4)     // Catch: java.lang.Throwable -> L19
            r8.connectPromise = r3     // Catch: java.lang.Throwable -> L19
        L36:
            if (r0 == 0) goto L6f
            r8.peer = r3     // Catch: java.lang.Throwable -> L19
            io.netty.channel.EventLoop r2 = r0.eventLoop()     // Catch: java.lang.Throwable -> L19
            boolean r3 = r0.isActive()     // Catch: java.lang.Throwable -> L19
            io.netty.channel.local.LocalChannel$4 r4 = new io.netty.channel.local.LocalChannel$4     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r8, r0, r3)     // Catch: java.lang.Throwable -> L4b
            r2.execute(r4)     // Catch: java.lang.Throwable -> L4b
            goto L6f
        L4b:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.channel.local.LocalChannel.logger     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "Releasing Inbound Queues for channels {}-{} because exception occurred!"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L19
            r7 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L19
            r7 = 1
            r6[r7] = r0     // Catch: java.lang.Throwable -> L19
            r7 = 2
            r6[r7] = r3     // Catch: java.lang.Throwable -> L19
            r4.warn(r5, r6)     // Catch: java.lang.Throwable -> L19
            boolean r2 = r2.inEventLoop()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L69
            r0.releaseInboundBuffers()     // Catch: java.lang.Throwable -> L19
            goto L6c
        L69:
            r0.close()     // Catch: java.lang.Throwable -> L19
        L6c:
            io.netty.util.internal.PlatformDependent.throwException(r3)     // Catch: java.lang.Throwable -> L19
        L6f:
            if (r1 == 0) goto L78
            io.netty.channel.local.LocalChannel$State r0 = io.netty.channel.local.LocalChannel.State.CLOSED
            if (r1 == r0) goto L78
            r8.releaseInboundBuffers()
        L78:
            return
        L79:
            if (r1 == 0) goto L82
            io.netty.channel.local.LocalChannel$State r2 = io.netty.channel.local.LocalChannel.State.CLOSED
            if (r1 == r2) goto L82
            r8.releaseInboundBuffers()
        L82:
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDeregister() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.util.concurrent.SingleThreadEventExecutor r0 = (io.netty.util.concurrent.SingleThreadEventExecutor) r0
            java.lang.Runnable r1 = r2.shutdownHook
            r0.removeShutdownHook(r1)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doRegister() throws java.lang.Exception {
            r3 = this;
            io.netty.channel.local.LocalChannel r0 = r3.peer
            if (r0 == 0) goto L30
            io.netty.channel.local.LocalServerChannel r0 = r3.parent()
            if (r0 == 0) goto L30
            io.netty.channel.local.LocalChannel r0 = r3.peer
            io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CONNECTED
            r3.state = r1
            io.netty.channel.local.LocalServerChannel r2 = r3.parent()
            if (r2 != 0) goto L18
            r2 = 0
            goto L20
        L18:
            io.netty.channel.local.LocalServerChannel r2 = r3.parent()
            io.netty.channel.local.LocalAddress r2 = r2.localAddress()
        L20:
            r0.remoteAddress = r2
            r0.state = r1
            io.netty.channel.EventLoop r1 = r0.eventLoop()
            io.netty.channel.local.LocalChannel$3 r2 = new io.netty.channel.local.LocalChannel$3
            r2.<init>(r3, r0)
            r1.execute(r2)
        L30:
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.util.concurrent.SingleThreadEventExecutor r0 = (io.netty.util.concurrent.SingleThreadEventExecutor) r0
            java.lang.Runnable r1 = r3.shutdownHook
            r0.addShutdownHook(r1)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r7) throws java.lang.Exception {
            r6 = this;
            int[] r0 = io.netty.channel.local.LocalChannel.AnonymousClass6.$SwitchMap$io$netty$channel$local$LocalChannel$State
            io.netty.channel.local.LocalChannel$State r1 = r6.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L54
            r2 = 2
            if (r0 == r2) goto L54
            r2 = 3
            if (r0 == r2) goto L4e
            io.netty.channel.local.LocalChannel r0 = r6.peer
            r6.writeInProgress = r1
            r1 = 0
        L18:
            r2 = 0
            java.lang.Object r3 = r7.current()     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L25
            r6.writeInProgress = r2
            r6.finishPeerRead(r0)
            return
        L25:
            io.netty.channel.local.LocalChannel$State r4 = r0.state     // Catch: java.lang.Throwable -> L38
            io.netty.channel.local.LocalChannel$State r5 = io.netty.channel.local.LocalChannel.State.CONNECTED     // Catch: java.lang.Throwable -> L38
            if (r4 != r5) goto L3a
            java.util.Queue<java.lang.Object> r4 = r0.inboundBuffer     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = io.netty.util.ReferenceCountUtil.retain(r3)     // Catch: java.lang.Throwable -> L38
            r4.add(r3)     // Catch: java.lang.Throwable -> L38
            r7.remove()     // Catch: java.lang.Throwable -> L38
            goto L18
        L38:
            r3 = move-exception
            goto L46
        L3a:
            if (r1 != 0) goto L42
            java.nio.channels.ClosedChannelException r3 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r1 = r3
        L42:
            r7.remove(r1)     // Catch: java.lang.Throwable -> L38
            goto L18
        L46:
            r7.remove(r3)     // Catch: java.lang.Throwable -> L4a
            goto L18
        L4a:
            r7 = move-exception
            r6.writeInProgress = r2
            throw r7
        L4e:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException
            r7.<init>()
            throw r7
        L54:
            java.nio.channels.NotYetConnectedException r7 = new java.nio.channels.NotYetConnectedException
            r7.<init>()
            throw r7
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            io.netty.channel.local.LocalChannel$State r0 = r2.state
            io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CONNECTED
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
            boolean r1 = r1 instanceof io.netty.channel.SingleThreadEventLoop
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r2 = this;
            io.netty.channel.local.LocalChannel$State r0 = r2.state
            io.netty.channel.local.LocalChannel$State r1 = io.netty.channel.local.LocalChannel.State.CLOSED
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.local.LocalAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            io.netty.channel.local.LocalAddress r0 = (io.netty.channel.local.LocalAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.localAddress
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.local.LocalChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.local.LocalChannel$LocalUnsafe r0 = new io.netty.channel.local.LocalChannel$LocalUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.local.LocalServerChannel r0 = r1.parent()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.local.LocalServerChannel parent() {
            r1 = this;
            io.netty.channel.Channel r0 = super.parent()
            io.netty.channel.local.LocalServerChannel r0 = (io.netty.channel.local.LocalServerChannel) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.local.LocalAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            io.netty.channel.local.LocalAddress r0 = (io.netty.channel.local.LocalAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.remoteAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.local.LocalAddress r0 = r1.remoteAddress
            return r0
    }
}
