package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractKQueueChannel extends io.netty.channel.AbstractChannel implements io.netty.channel.unix.UnixChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    protected volatile boolean active;
    private io.netty.channel.ChannelPromise connectPromise;
    private java.util.concurrent.ScheduledFuture<?> connectTimeoutFuture;
    boolean inputClosedSeenErrorOnRead;
    private volatile java.net.SocketAddress local;
    private boolean readFilterEnabled;
    boolean readReadyRunnablePending;
    private volatile java.net.SocketAddress remote;
    private java.net.SocketAddress requestedRemoteAddress;
    final io.netty.channel.kqueue.BsdSocket socket;
    private boolean writeFilterEnabled;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class AbstractKQueueUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle allocHandle;
        boolean maybeMoreDataToRead;
        boolean readPending;
        private final java.lang.Runnable readReadyRunnable;
        final /* synthetic */ io.netty.channel.kqueue.AbstractKQueueChannel this$0;




        static {
                return
        }

        AbstractKQueueUnsafe(io.netty.channel.kqueue.AbstractKQueueChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$1 r1 = new io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$1
                r1.<init>(r0)
                r0.readReadyRunnable = r1
                return
        }

        private boolean doFinishConnect() throws java.lang.Exception {
                r4 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                io.netty.channel.kqueue.BsdSocket r0 = r0.socket
                boolean r0 = r0.finishConnect()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L39
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                r0.writeFilter(r2)
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                java.net.SocketAddress r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$300(r0)
                boolean r0 = r0 instanceof java.net.InetSocketAddress
                if (r0 == 0) goto L32
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                java.net.SocketAddress r2 = io.netty.channel.kqueue.AbstractKQueueChannel.access$300(r0)
                java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r4.this$0
                io.netty.channel.kqueue.BsdSocket r3 = r3.socket
                java.net.InetSocketAddress r3 = r3.remoteAddress()
                java.net.InetSocketAddress r2 = io.netty.channel.unix.UnixChannelUtil.computeRemoteAddr(r2, r3)
                io.netty.channel.kqueue.AbstractKQueueChannel.access$502(r0, r2)
            L32:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                r2 = 0
                io.netty.channel.kqueue.AbstractKQueueChannel.access$302(r0, r2)
                return r1
            L39:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r4.this$0
                r0.writeFilter(r1)
                return r2
        }

        private void finishConnect() {
                r5 = this;
                r0 = 0
                r1 = 0
                io.netty.channel.kqueue.AbstractKQueueChannel r2 = r5.this$0     // Catch: java.lang.Throwable -> L2f
                boolean r2 = r2.isActive()     // Catch: java.lang.Throwable -> L2f
                boolean r3 = r5.doFinishConnect()     // Catch: java.lang.Throwable -> L2f
                if (r3 != 0) goto Lf
                return
            Lf:
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.ChannelPromise r3 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r3)     // Catch: java.lang.Throwable -> L2f
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.kqueue.AbstractKQueueChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.kqueue.AbstractKQueueChannel.access$400(r2)
                if (r2 == 0) goto L29
            L20:
                io.netty.channel.kqueue.AbstractKQueueChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.kqueue.AbstractKQueueChannel.access$400(r2)
                r2.cancel(r1)
            L29:
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r5.this$0
                io.netty.channel.kqueue.AbstractKQueueChannel.access$002(r1, r0)
                return
            L2f:
                r2 = move-exception
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.ChannelPromise r3 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r3)     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.kqueue.AbstractKQueueChannel r4 = r5.this$0     // Catch: java.lang.Throwable -> L4c
                java.net.SocketAddress r4 = io.netty.channel.kqueue.AbstractKQueueChannel.access$300(r4)     // Catch: java.lang.Throwable -> L4c
                java.lang.Throwable r2 = r5.annotateConnectException(r2, r4)     // Catch: java.lang.Throwable -> L4c
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.kqueue.AbstractKQueueChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.kqueue.AbstractKQueueChannel.access$400(r2)
                if (r2 == 0) goto L29
                goto L20
            L4c:
                r2 = move-exception
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.kqueue.AbstractKQueueChannel.access$400(r3)
                if (r3 == 0) goto L5e
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.kqueue.AbstractKQueueChannel.access$400(r3)
                r3.cancel(r1)
            L5e:
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r5.this$0
                io.netty.channel.kqueue.AbstractKQueueChannel.access$002(r1, r0)
                throw r2
        }

        private void fireEventAndClose(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r1.this$0
                io.netty.channel.ChannelPipeline r0 = r0.pipeline()
                r0.fireUserEventTriggered(r2)
                io.netty.channel.ChannelPromise r2 = r1.voidPromise()
                r1.close(r2)
                return
        }

        private void fulfillConnectPromise(io.netty.channel.ChannelPromise r1, java.lang.Throwable r2) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                r1.tryFailure(r2)
                r0.closeIfClosed()
                return
        }

        private void fulfillConnectPromise(io.netty.channel.ChannelPromise r3, boolean r4) {
                r2 = this;
                if (r3 != 0) goto L3
                goto L28
            L3:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                r1 = 1
                r0.active = r1
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                boolean r3 = r3.trySuccess()
                if (r4 != 0) goto L1f
                if (r0 == 0) goto L1f
                io.netty.channel.kqueue.AbstractKQueueChannel r4 = r2.this$0
                io.netty.channel.ChannelPipeline r4 = r4.pipeline()
                r4.fireChannelActive()
            L1f:
                if (r3 != 0) goto L28
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
            L28:
                return
        }

        protected final void clearReadFilter0() {
                r2 = this;
                r0 = 0
                r2.readPending = r0     // Catch: java.io.IOException -> L9
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r2.this$0     // Catch: java.io.IOException -> L9
                r1.readFilter(r0)     // Catch: java.io.IOException -> L9
                return
            L9:
                r0 = move-exception
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r2.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                r1.fireExceptionCaught(r0)
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r2.this$0
                io.netty.channel.Channel$Unsafe r1 = r1.unsafe()
                io.netty.channel.ChannelPromise r1 = r1.voidPromise()
                r0.close(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r6, java.net.SocketAddress r7, io.netty.channel.ChannelPromise r8) {
                r5 = this;
                boolean r0 = r8.setUncancellable()
                if (r0 == 0) goto L6d
                boolean r0 = r5.ensureOpen(r8)
                if (r0 != 0) goto Ld
                goto L6d
            Ld:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.ChannelPromise r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r0)     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto L5d
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r7 = r1.doConnect(r6, r7)     // Catch: java.lang.Throwable -> L27
                if (r7 == 0) goto L29
                r5.fulfillConnectPromise(r8, r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r7 = move-exception
                goto L63
            L29:
                io.netty.channel.kqueue.AbstractKQueueChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel.access$002(r7, r8)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel.access$302(r7, r6)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.KQueueChannelConfig r7 = r7.config()     // Catch: java.lang.Throwable -> L27
                int r7 = r7.getConnectTimeoutMillis()     // Catch: java.lang.Throwable -> L27
                if (r7 <= 0) goto L54
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.EventLoop r1 = r0.eventLoop()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$2 r2 = new io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$2     // Catch: java.lang.Throwable -> L27
                r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L27
                long r3 = (long) r7     // Catch: java.lang.Throwable -> L27
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L27
                io.netty.util.concurrent.ScheduledFuture r7 = r1.schedule(r2, r3, r7)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.kqueue.AbstractKQueueChannel.access$402(r0, r7)     // Catch: java.lang.Throwable -> L27
            L54:
                io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$3 r7 = new io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$3     // Catch: java.lang.Throwable -> L27
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L27
                r8.addListener(r7)     // Catch: java.lang.Throwable -> L27
                return
            L5d:
                java.nio.channels.ConnectionPendingException r7 = new java.nio.channels.ConnectionPendingException     // Catch: java.lang.Throwable -> L27
                r7.<init>()     // Catch: java.lang.Throwable -> L27
                throw r7     // Catch: java.lang.Throwable -> L27
            L63:
                r5.closeIfClosed()
                java.lang.Throwable r6 = r5.annotateConnectException(r7, r6)
                r8.tryFailure(r6)
            L6d:
                return
        }

        final void executeReadReadyRunnable(io.netty.channel.ChannelConfig r3) {
                r2 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                boolean r1 = r0.readReadyRunnablePending
                if (r1 != 0) goto L23
                boolean r0 = r0.isActive()
                if (r0 == 0) goto L23
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                boolean r3 = r0.shouldBreakReadReady(r3)
                if (r3 == 0) goto L15
                goto L23
            L15:
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r2.this$0
                r0 = 1
                r3.readReadyRunnablePending = r0
                io.netty.channel.EventLoop r3 = r3.eventLoop()
                java.lang.Runnable r0 = r2.readReadyRunnable
                r3.execute(r0)
            L23:
                return
        }

        final boolean failConnectPromise(java.lang.Throwable r4) {
                r3 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r3.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r0)
                if (r0 == 0) goto L2f
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r3.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r0)
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r3.this$0
                r2 = 0
                io.netty.channel.kqueue.AbstractKQueueChannel.access$002(r1, r2)
                boolean r1 = r4 instanceof java.net.ConnectException
                if (r1 == 0) goto L19
                goto L24
            L19:
                java.net.ConnectException r1 = new java.net.ConnectException
                java.lang.String r2 = "failed to connect"
                r1.<init>(r2)
                java.lang.Throwable r4 = r1.initCause(r4)
            L24:
                boolean r4 = r0.tryFailure(r4)
                if (r4 == 0) goto L2f
                r3.closeIfClosed()
                r4 = 1
                return r4
            L2f:
                r4 = 0
                return r4
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected final void flush0() {
                r1 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r1.this$0
                boolean r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$200(r0)
                if (r0 != 0) goto Lb
                super.flush0()
            Lb:
                return
        }

        final void readEOF() {
                r2 = this;
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r2.recvBufAllocHandle()
                r0.readEOF()
                io.netty.channel.kqueue.AbstractKQueueChannel r1 = r2.this$0
                boolean r1 = r1.isActive()
                if (r1 == 0) goto L13
                r2.readReady(r0)
                return
            L13:
                r0 = 1
                r2.shutdownInput(r0)
                return
        }

        final void readReady(long r2) {
                r1 = this;
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r1.recvBufAllocHandle()
                r0.numberBytesPending(r2)
                r1.readReady(r0)
                return
        }

        abstract void readReady(io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r1);

        final void readReadyBefore() {
                r1 = this;
                r0 = 0
                r1.maybeMoreDataToRead = r0
                return
        }

        final void readReadyFinally(io.netty.channel.ChannelConfig r3) {
                r2 = this;
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r2.allocHandle
                boolean r0 = r0.maybeMoreDataToRead()
                r2.maybeMoreDataToRead = r0
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r2.allocHandle
                boolean r0 = r0.isReadEOF()
                if (r0 != 0) goto L25
                boolean r0 = r2.readPending
                if (r0 == 0) goto L19
                boolean r1 = r2.maybeMoreDataToRead
                if (r1 == 0) goto L19
                goto L25
            L19:
                if (r0 != 0) goto L24
                boolean r3 = r3.isAutoRead()
                if (r3 != 0) goto L24
                r2.clearReadFilter0()
            L24:
                return
            L25:
                r2.executeReadReadyRunnable(r3)
                return
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe, io.netty.channel.Channel.Unsafe
        public /* bridge */ /* synthetic */ io.netty.channel.RecvByteBufAllocator.Handle recvBufAllocHandle() {
                r1 = this;
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r1.recvBufAllocHandle()
                return r0
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe, io.netty.channel.Channel.Unsafe
        public io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle recvBufAllocHandle() {
                r2 = this;
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r2.allocHandle
                if (r0 != 0) goto L11
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = new io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle
                io.netty.channel.RecvByteBufAllocator$Handle r1 = super.recvBufAllocHandle()
                io.netty.channel.RecvByteBufAllocator$ExtendedHandle r1 = (io.netty.channel.RecvByteBufAllocator.ExtendedHandle) r1
                r0.<init>(r1)
                r2.allocHandle = r0
            L11:
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r0 = r2.allocHandle
                return r0
        }

        void shutdownInput(boolean r3) {
                r2 = this;
                if (r3 == 0) goto Ld
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r0)
                if (r0 == 0) goto Ld
                r2.finishConnect()
            Ld:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r2.this$0
                io.netty.channel.kqueue.BsdSocket r0 = r0.socket
                boolean r0 = r0.isInputShutdown()
                r1 = 1
                if (r0 != 0) goto L46
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r2.this$0
                io.netty.channel.kqueue.KQueueChannelConfig r3 = r3.config()
                boolean r3 = io.netty.channel.kqueue.AbstractKQueueChannel.access$100(r3)
                if (r3 == 0) goto L3e
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r2.this$0     // Catch: java.nio.channels.NotYetConnectedException -> L2c java.io.IOException -> L38
                io.netty.channel.kqueue.BsdSocket r3 = r3.socket     // Catch: java.nio.channels.NotYetConnectedException -> L2c java.io.IOException -> L38
                r0 = 0
                r3.shutdown(r1, r0)     // Catch: java.nio.channels.NotYetConnectedException -> L2c java.io.IOException -> L38
            L2c:
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r2.this$0
                io.netty.channel.ChannelPipeline r3 = r3.pipeline()
                io.netty.channel.socket.ChannelInputShutdownEvent r0 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
                r3.fireUserEventTriggered(r0)
                return
            L38:
                io.netty.channel.socket.ChannelInputShutdownEvent r3 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
                r2.fireEventAndClose(r3)
                return
            L3e:
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
                return
            L46:
                if (r3 != 0) goto L55
                io.netty.channel.kqueue.AbstractKQueueChannel r3 = r2.this$0
                r3.inputClosedSeenErrorOnRead = r1
                io.netty.channel.ChannelPipeline r3 = r3.pipeline()
                io.netty.channel.socket.ChannelInputShutdownReadComplete r0 = io.netty.channel.socket.ChannelInputShutdownReadComplete.INSTANCE
                r3.fireUserEventTriggered(r0)
            L55:
                return
        }

        final void writeReady() {
                r1 = this;
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r1.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.kqueue.AbstractKQueueChannel.access$000(r0)
                if (r0 == 0) goto Lc
                r1.finishConnect()
                return
            Lc:
                io.netty.channel.kqueue.AbstractKQueueChannel r0 = r1.this$0
                io.netty.channel.kqueue.BsdSocket r0 = r0.socket
                boolean r0 = r0.isOutputShutdown()
                if (r0 != 0) goto L19
                super.flush0()
            L19:
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.kqueue.AbstractKQueueChannel.METADATA = r0
            return
    }

    AbstractKQueueChannel(io.netty.channel.Channel r1, io.netty.channel.kqueue.BsdSocket r2, java.net.SocketAddress r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "fd"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.kqueue.BsdSocket r1 = (io.netty.channel.kqueue.BsdSocket) r1
            r0.socket = r1
            r1 = 1
            r0.active = r1
            r0.remote = r3
            java.net.InetSocketAddress r1 = r2.localAddress()
            r0.local = r1
            return
    }

    AbstractKQueueChannel(io.netty.channel.Channel r1, io.netty.channel.kqueue.BsdSocket r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "fd"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.kqueue.BsdSocket r1 = (io.netty.channel.kqueue.BsdSocket) r1
            r0.socket = r1
            r0.active = r3
            if (r3 == 0) goto L1d
            java.net.InetSocketAddress r1 = r2.localAddress()
            r0.local = r1
            java.net.InetSocketAddress r1 = r2.remoteAddress()
            r0.remote = r1
        L1d:
            return
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$000(io.netty.channel.kqueue.AbstractKQueueChannel r0) {
            io.netty.channel.ChannelPromise r0 = r0.connectPromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$002(io.netty.channel.kqueue.AbstractKQueueChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.connectPromise = r1
            return r1
    }

    static /* synthetic */ boolean access$100(io.netty.channel.ChannelConfig r0) {
            boolean r0 = isAllowHalfClosure(r0)
            return r0
    }

    static /* synthetic */ boolean access$200(io.netty.channel.kqueue.AbstractKQueueChannel r0) {
            boolean r0 = r0.writeFilterEnabled
            return r0
    }

    static /* synthetic */ java.net.SocketAddress access$300(io.netty.channel.kqueue.AbstractKQueueChannel r0) {
            java.net.SocketAddress r0 = r0.requestedRemoteAddress
            return r0
    }

    static /* synthetic */ java.net.SocketAddress access$302(io.netty.channel.kqueue.AbstractKQueueChannel r0, java.net.SocketAddress r1) {
            r0.requestedRemoteAddress = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$400(io.netty.channel.kqueue.AbstractKQueueChannel r0) {
            java.util.concurrent.ScheduledFuture<?> r0 = r0.connectTimeoutFuture
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$402(io.netty.channel.kqueue.AbstractKQueueChannel r0, java.util.concurrent.ScheduledFuture r1) {
            r0.connectTimeoutFuture = r1
            return r1
    }

    static /* synthetic */ java.net.SocketAddress access$502(io.netty.channel.kqueue.AbstractKQueueChannel r0, java.net.SocketAddress r1) {
            r0.remote = r1
            return r1
    }

    protected static void checkResolvable(java.net.InetSocketAddress r0) {
            boolean r0 = r0.isUnresolved()
            if (r0 != 0) goto L7
            return
        L7:
            java.nio.channels.UnresolvedAddressException r0 = new java.nio.channels.UnresolvedAddressException
            r0.<init>()
            throw r0
    }

    private boolean doConnect0(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r0.connect(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto Lf
            r0 = 1
            r1.writeFilter(r0)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L10
        Lf:
            return r2
        L10:
            r1.doClose()
            throw r2
    }

    private void evSet(short r2, short r3) {
            r1 = this;
            boolean r0 = r1.isRegistered()
            if (r0 == 0) goto L9
            r1.evSet0(r2, r3)
        L9:
            return
    }

    private void evSet0(short r2, short r3) {
            r1 = this;
            r0 = 0
            r1.evSet0(r2, r3, r0)
            return
    }

    private void evSet0(short r2, short r3, int r4) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Lf
            io.netty.channel.EventLoop r0 = r1.eventLoop()
            io.netty.channel.kqueue.KQueueEventLoop r0 = (io.netty.channel.kqueue.KQueueEventLoop) r0
            r0.evSet(r1, r2, r3, r4)
        Lf:
            return
    }

    private static boolean isAllowHalfClosure(io.netty.channel.ChannelConfig r1) {
            boolean r0 = r1 instanceof io.netty.channel.kqueue.KQueueDomainSocketChannelConfig
            if (r0 == 0) goto Lb
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r1 = (io.netty.channel.kqueue.KQueueDomainSocketChannelConfig) r1
            boolean r1 = r1.isAllowHalfClosure()
            return r1
        Lb:
            boolean r0 = r1 instanceof io.netty.channel.socket.SocketChannelConfig
            if (r0 == 0) goto L19
            io.netty.channel.socket.SocketChannelConfig r1 = (io.netty.channel.socket.SocketChannelConfig) r1
            boolean r1 = r1.isAllowHalfClosure()
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    static boolean isSoErrorZero(io.netty.channel.kqueue.BsdSocket r1) {
            int r1 = r1.getSoError()     // Catch: java.io.IOException -> La
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
        La:
            r1 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r1)
            throw r0
    }

    private static io.netty.buffer.ByteBuf newDirectBuffer0(java.lang.Object r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBufAllocator r3, int r4) {
            io.netty.buffer.ByteBuf r3 = r3.directBuffer(r4)
            int r0 = r2.readerIndex()
            r3.writeBytes(r2, r0, r4)
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            return r3
    }

    final void clearReadFilter() {
            r3 = this;
            boolean r0 = r3.isRegistered()
            if (r0 == 0) goto L23
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.channel.Channel$Unsafe r1 = r3.unsafe()
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r1 = (io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe) r1
            boolean r2 = r0.inEventLoop()
            if (r2 == 0) goto L1a
            r1.clearReadFilter0()
            return
        L1a:
            io.netty.channel.kqueue.AbstractKQueueChannel$1 r2 = new io.netty.channel.kqueue.AbstractKQueueChannel$1
            r2.<init>(r3, r1)
            r0.execute(r2)
            return
        L23:
            r0 = 0
            r3.readFilterEnabled = r0
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public abstract io.netty.channel.kqueue.KQueueChannelConfig config();

    @Override // io.netty.channel.AbstractChannel
    protected final void doBeginRead() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = (io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe) r0
            r1 = 1
            r0.readPending = r1
            r2.readFilter(r1)
            boolean r1 = r0.maybeMoreDataToRead
            if (r1 == 0) goto L17
            io.netty.channel.kqueue.KQueueChannelConfig r1 = r2.config()
            r0.executeReadReadyRunnable(r1)
        L17:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto La
            r0 = r2
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            checkResolvable(r0)
        La:
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            r0.bind(r2)
            io.netty.channel.kqueue.BsdSocket r2 = r1.socket
            java.net.InetSocketAddress r2 = r2.localAddress()
            r1.local = r2
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            r0 = 0
            r1.active = r0
            r0 = 1
            r1.inputClosedSeenErrorOnRead = r0
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            r0.close()
            return
    }

    protected boolean doConnect(java.net.SocketAddress r3, java.net.SocketAddress r4) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r4 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto La
            r0 = r4
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            checkResolvable(r0)
        La:
            boolean r0 = r3 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto L12
            r0 = r3
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L18
            checkResolvable(r0)
        L18:
            java.net.SocketAddress r1 = r2.remote
            if (r1 != 0) goto L41
            if (r4 == 0) goto L23
            io.netty.channel.kqueue.BsdSocket r1 = r2.socket
            r1.bind(r4)
        L23:
            boolean r4 = r2.doConnect0(r3)
            if (r4 == 0) goto L38
            if (r0 != 0) goto L2c
            goto L36
        L2c:
            io.netty.channel.kqueue.BsdSocket r3 = r2.socket
            java.net.InetSocketAddress r3 = r3.remoteAddress()
            java.net.InetSocketAddress r3 = io.netty.channel.unix.UnixChannelUtil.computeRemoteAddr(r0, r3)
        L36:
            r2.remote = r3
        L38:
            io.netty.channel.kqueue.BsdSocket r3 = r2.socket
            java.net.InetSocketAddress r3 = r3.localAddress()
            r2.local = r3
            return r4
        L41:
            java.nio.channels.AlreadyConnectedException r3 = new java.nio.channels.AlreadyConnectedException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDeregister() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.eventLoop()
            io.netty.channel.kqueue.KQueueEventLoop r0 = (io.netty.channel.kqueue.KQueueEventLoop) r0
            r0.remove(r1)
            r0 = 0
            r1.readFilterEnabled = r0
            r1.writeFilterEnabled = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    protected final int doReadBytes(io.netty.buffer.ByteBuf r6) throws java.lang.Exception {
            r5 = this;
            int r0 = r6.writerIndex()
            io.netty.channel.Channel$Unsafe r1 = r5.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r1 = r1.recvBufAllocHandle()
            int r2 = r6.writableBytes()
            r1.attemptedBytesRead(r2)
            boolean r1 = r6.hasMemoryAddress()
            if (r1 == 0) goto L28
            io.netty.channel.kqueue.BsdSocket r1 = r5.socket
            long r2 = r6.memoryAddress()
            int r4 = r6.capacity()
            int r1 = r1.readAddress(r2, r0, r4)
            goto L3e
        L28:
            int r1 = r6.writableBytes()
            java.nio.ByteBuffer r1 = r6.internalNioBuffer(r0, r1)
            io.netty.channel.kqueue.BsdSocket r2 = r5.socket
            int r3 = r1.position()
            int r4 = r1.limit()
            int r1 = r2.read(r1, r3, r4)
        L3e:
            if (r1 <= 0) goto L44
            int r0 = r0 + r1
            r6.writerIndex(r0)
        L44:
            return r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doRegister() throws java.lang.Exception {
            r3 = this;
            r0 = 0
            r3.readReadyRunnablePending = r0
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.channel.kqueue.KQueueEventLoop r0 = (io.netty.channel.kqueue.KQueueEventLoop) r0
            r0.add(r3)
            boolean r0 = r3.writeFilterEnabled
            if (r0 == 0) goto L17
            short r0 = io.netty.channel.kqueue.Native.EVFILT_WRITE
            short r1 = io.netty.channel.kqueue.Native.EV_ADD_CLEAR_ENABLE
            r3.evSet0(r0, r1)
        L17:
            boolean r0 = r3.readFilterEnabled
            if (r0 == 0) goto L22
            short r0 = io.netty.channel.kqueue.Native.EVFILT_READ
            short r1 = io.netty.channel.kqueue.Native.EV_ADD_CLEAR_ENABLE
            r3.evSet0(r0, r1)
        L22:
            short r0 = io.netty.channel.kqueue.Native.EVFILT_SOCK
            short r1 = io.netty.channel.kqueue.Native.EV_ADD
            int r2 = io.netty.channel.kqueue.Native.NOTE_RDHUP
            r3.evSet0(r0, r1, r2)
            return
    }

    protected final int doWriteBytes(io.netty.channel.ChannelOutboundBuffer r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r7.hasMemoryAddress()
            r1 = 1
            if (r0 == 0) goto L20
            io.netty.channel.kqueue.BsdSocket r0 = r5.socket
            long r2 = r7.memoryAddress()
            int r4 = r7.readerIndex()
            int r7 = r7.writerIndex()
            int r7 = r0.writeAddress(r2, r4, r7)
            if (r7 <= 0) goto L54
            long r2 = (long) r7
            r6.removeBytes(r2)
            return r1
        L20:
            int r0 = r7.nioBufferCount()
            if (r0 != r1) goto L33
            int r0 = r7.readerIndex()
            int r2 = r7.readableBytes()
            java.nio.ByteBuffer r7 = r7.internalNioBuffer(r0, r2)
            goto L37
        L33:
            java.nio.ByteBuffer r7 = r7.nioBuffer()
        L37:
            io.netty.channel.kqueue.BsdSocket r0 = r5.socket
            int r2 = r7.position()
            int r3 = r7.limit()
            int r0 = r0.write(r7, r2, r3)
            if (r0 <= 0) goto L54
            int r2 = r7.position()
            int r2 = r2 + r0
            r7.position(r2)
            long r2 = (long) r0
            r6.removeBytes(r2)
            return r1
        L54:
            r6 = 2147483647(0x7fffffff, float:NaN)
            return r6
    }

    @Override // io.netty.channel.unix.UnixChannel
    public final io.netty.channel.unix.FileDescriptor fd() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.active
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.kqueue.KQueueEventLoop
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            java.net.SocketAddress r0 = r1.local
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.kqueue.AbstractKQueueChannel.METADATA
            return r0
    }

    protected final io.netty.buffer.ByteBuf newDirectBuffer(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.newDirectBuffer(r1, r1)
            return r1
    }

    protected final io.netty.buffer.ByteBuf newDirectBuffer(java.lang.Object r4, io.netty.buffer.ByteBuf r5) {
            r3 = this;
            int r0 = r5.readableBytes()
            if (r0 != 0) goto Lc
            io.netty.util.ReferenceCountUtil.release(r4)
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
        Lc:
            io.netty.buffer.ByteBufAllocator r1 = r3.alloc()
            boolean r2 = r1.isDirectBufferPooled()
            if (r2 == 0) goto L1b
            io.netty.buffer.ByteBuf r4 = newDirectBuffer0(r4, r5, r1, r0)
            return r4
        L1b:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.ByteBufUtil.threadLocalDirectBuffer()
            if (r2 != 0) goto L26
            io.netty.buffer.ByteBuf r4 = newDirectBuffer0(r4, r5, r1, r0)
            return r4
        L26:
            int r1 = r5.readerIndex()
            r2.writeBytes(r5, r1, r0)
            io.netty.util.ReferenceCountUtil.safeRelease(r4)
            return r2
    }

    @Override // io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected abstract io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe();

    void readFilter(boolean r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.readFilterEnabled
            if (r0 == r2) goto L12
            r1.readFilterEnabled = r2
            short r0 = io.netty.channel.kqueue.Native.EVFILT_READ
            if (r2 == 0) goto Ld
            short r2 = io.netty.channel.kqueue.Native.EV_ADD_CLEAR_ENABLE
            goto Lf
        Ld:
            short r2 = io.netty.channel.kqueue.Native.EV_DELETE_DISABLE
        Lf:
            r1.evSet(r0, r2)
        L12:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.net.SocketAddress r0 = r1.remote
            return r0
    }

    final boolean shouldBreakReadReady(io.netty.channel.ChannelConfig r2) {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isInputShutdown()
            if (r0 == 0) goto L14
            boolean r0 = r1.inputClosedSeenErrorOnRead
            if (r0 != 0) goto L12
            boolean r2 = isAllowHalfClosure(r2)
            if (r2 != 0) goto L14
        L12:
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    void unregisterFilters() throws java.lang.Exception {
            r3 = this;
            r0 = 0
            r3.readFilter(r0)
            r3.writeFilter(r0)
            short r1 = io.netty.channel.kqueue.Native.EVFILT_SOCK
            short r2 = io.netty.channel.kqueue.Native.EV_DELETE
            r3.evSet0(r1, r2, r0)
            return
    }

    void writeFilter(boolean r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.writeFilterEnabled
            if (r0 == r2) goto L12
            r1.writeFilterEnabled = r2
            short r0 = io.netty.channel.kqueue.Native.EVFILT_WRITE
            if (r2 == 0) goto Ld
            short r2 = io.netty.channel.kqueue.Native.EV_ADD_CLEAR_ENABLE
            goto Lf
        Ld:
            short r2 = io.netty.channel.kqueue.Native.EV_DELETE_DISABLE
        Lf:
            r1.evSet(r0, r2)
        L12:
            return
    }
}
