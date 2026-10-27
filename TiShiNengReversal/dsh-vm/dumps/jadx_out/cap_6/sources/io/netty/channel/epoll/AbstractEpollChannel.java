package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractEpollChannel extends io.netty.channel.AbstractChannel implements io.netty.channel.unix.UnixChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    protected volatile boolean active;
    private io.netty.channel.ChannelPromise connectPromise;
    private java.util.concurrent.ScheduledFuture<?> connectTimeoutFuture;
    boolean epollInReadyRunnablePending;
    protected int flags;
    boolean inputClosedSeenErrorOnRead;
    private volatile java.net.SocketAddress local;
    private volatile java.net.SocketAddress remote;
    private java.net.SocketAddress requestedRemoteAddress;
    final io.netty.channel.epoll.LinuxSocket socket;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected abstract class AbstractEpollUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private io.netty.channel.epoll.EpollRecvByteAllocatorHandle allocHandle;
        private final java.lang.Runnable epollInReadyRunnable;
        boolean maybeMoreDataToRead;
        boolean readPending;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollChannel this$0;




        static {
                return
        }

        protected AbstractEpollUnsafe(io.netty.channel.epoll.AbstractEpollChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$1 r1 = new io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$1
                r1.<init>(r0)
                r0.epollInReadyRunnable = r1
                return
        }

        private void clearEpollRdHup() {
                r2 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0     // Catch: java.io.IOException -> L8
                int r1 = io.netty.channel.epoll.Native.EPOLLRDHUP     // Catch: java.io.IOException -> L8
                r0.clearFlag(r1)     // Catch: java.io.IOException -> L8
                return
            L8:
                r0 = move-exception
                io.netty.channel.epoll.AbstractEpollChannel r1 = r2.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                r1.fireExceptionCaught(r0)
                io.netty.channel.ChannelPromise r0 = r2.voidPromise()
                r2.close(r0)
                return
        }

        private boolean doFinishConnect() throws java.lang.Exception {
                r3 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                io.netty.channel.epoll.LinuxSocket r0 = r0.socket
                boolean r0 = r0.finishConnect()
                if (r0 == 0) goto L3a
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                int r1 = io.netty.channel.epoll.Native.EPOLLOUT
                r0.clearFlag(r1)
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                java.net.SocketAddress r0 = io.netty.channel.epoll.AbstractEpollChannel.access$200(r0)
                boolean r0 = r0 instanceof java.net.InetSocketAddress
                if (r0 == 0) goto L32
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                java.net.SocketAddress r1 = io.netty.channel.epoll.AbstractEpollChannel.access$200(r0)
                java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
                io.netty.channel.epoll.AbstractEpollChannel r2 = r3.this$0
                io.netty.channel.epoll.LinuxSocket r2 = r2.socket
                java.net.InetSocketAddress r2 = r2.remoteAddress()
                java.net.InetSocketAddress r1 = io.netty.channel.unix.UnixChannelUtil.computeRemoteAddr(r1, r2)
                io.netty.channel.epoll.AbstractEpollChannel.access$402(r0, r1)
            L32:
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                r1 = 0
                io.netty.channel.epoll.AbstractEpollChannel.access$202(r0, r1)
                r0 = 1
                return r0
            L3a:
                io.netty.channel.epoll.AbstractEpollChannel r0 = r3.this$0
                int r1 = io.netty.channel.epoll.Native.EPOLLOUT
                r0.setFlag(r1)
                r0 = 0
                return r0
        }

        private void finishConnect() {
                r5 = this;
                r0 = 0
                r1 = 0
                io.netty.channel.epoll.AbstractEpollChannel r2 = r5.this$0     // Catch: java.lang.Throwable -> L2f
                boolean r2 = r2.isActive()     // Catch: java.lang.Throwable -> L2f
                boolean r3 = r5.doFinishConnect()     // Catch: java.lang.Throwable -> L2f
                if (r3 != 0) goto Lf
                return
            Lf:
                io.netty.channel.epoll.AbstractEpollChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.ChannelPromise r3 = io.netty.channel.epoll.AbstractEpollChannel.access$100(r3)     // Catch: java.lang.Throwable -> L2f
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L2f
                io.netty.channel.epoll.AbstractEpollChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.epoll.AbstractEpollChannel.access$300(r2)
                if (r2 == 0) goto L29
            L20:
                io.netty.channel.epoll.AbstractEpollChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.epoll.AbstractEpollChannel.access$300(r2)
                r2.cancel(r1)
            L29:
                io.netty.channel.epoll.AbstractEpollChannel r1 = r5.this$0
                io.netty.channel.epoll.AbstractEpollChannel.access$102(r1, r0)
                return
            L2f:
                r2 = move-exception
                io.netty.channel.epoll.AbstractEpollChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.ChannelPromise r3 = io.netty.channel.epoll.AbstractEpollChannel.access$100(r3)     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.epoll.AbstractEpollChannel r4 = r5.this$0     // Catch: java.lang.Throwable -> L4c
                java.net.SocketAddress r4 = io.netty.channel.epoll.AbstractEpollChannel.access$200(r4)     // Catch: java.lang.Throwable -> L4c
                java.lang.Throwable r2 = r5.annotateConnectException(r2, r4)     // Catch: java.lang.Throwable -> L4c
                r5.fulfillConnectPromise(r3, r2)     // Catch: java.lang.Throwable -> L4c
                io.netty.channel.epoll.AbstractEpollChannel r2 = r5.this$0
                java.util.concurrent.ScheduledFuture r2 = io.netty.channel.epoll.AbstractEpollChannel.access$300(r2)
                if (r2 == 0) goto L29
                goto L20
            L4c:
                r2 = move-exception
                io.netty.channel.epoll.AbstractEpollChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.epoll.AbstractEpollChannel.access$300(r3)
                if (r3 == 0) goto L5e
                io.netty.channel.epoll.AbstractEpollChannel r3 = r5.this$0
                java.util.concurrent.ScheduledFuture r3 = io.netty.channel.epoll.AbstractEpollChannel.access$300(r3)
                r3.cancel(r1)
            L5e:
                io.netty.channel.epoll.AbstractEpollChannel r1 = r5.this$0
                io.netty.channel.epoll.AbstractEpollChannel.access$102(r1, r0)
                throw r2
        }

        private void fireEventAndClose(java.lang.Object r2) {
                r1 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r1.this$0
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
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                r1 = 1
                r0.active = r1
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                boolean r0 = r0.isActive()
                boolean r3 = r3.trySuccess()
                if (r4 != 0) goto L1f
                if (r0 == 0) goto L1f
                io.netty.channel.epoll.AbstractEpollChannel r4 = r2.this$0
                io.netty.channel.ChannelPipeline r4 = r4.pipeline()
                r4.fireChannelActive()
            L1f:
                if (r3 != 0) goto L28
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
            L28:
                return
        }

        protected final void clearEpollIn0() {
                r2 = this;
                r0 = 0
                r2.readPending = r0     // Catch: java.io.IOException -> Lb
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0     // Catch: java.io.IOException -> Lb
                int r1 = io.netty.channel.epoll.Native.EPOLLIN     // Catch: java.io.IOException -> Lb
                r0.clearFlag(r1)     // Catch: java.io.IOException -> Lb
                return
            Lb:
                r0 = move-exception
                io.netty.channel.epoll.AbstractEpollChannel r1 = r2.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                r1.fireExceptionCaught(r0)
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                io.netty.channel.Channel$Unsafe r0 = r0.unsafe()
                io.netty.channel.epoll.AbstractEpollChannel r1 = r2.this$0
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
                io.netty.channel.epoll.AbstractEpollChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.ChannelPromise r0 = io.netty.channel.epoll.AbstractEpollChannel.access$100(r0)     // Catch: java.lang.Throwable -> L27
                if (r0 != 0) goto L5d
                io.netty.channel.epoll.AbstractEpollChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel r1 = r5.this$0     // Catch: java.lang.Throwable -> L27
                boolean r7 = r1.doConnect(r6, r7)     // Catch: java.lang.Throwable -> L27
                if (r7 == 0) goto L29
                r5.fulfillConnectPromise(r8, r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r7 = move-exception
                goto L63
            L29:
                io.netty.channel.epoll.AbstractEpollChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel.access$102(r7, r8)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel.access$202(r7, r6)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel r7 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.EpollChannelConfig r7 = r7.config()     // Catch: java.lang.Throwable -> L27
                int r7 = r7.getConnectTimeoutMillis()     // Catch: java.lang.Throwable -> L27
                if (r7 <= 0) goto L54
                io.netty.channel.epoll.AbstractEpollChannel r0 = r5.this$0     // Catch: java.lang.Throwable -> L27
                io.netty.channel.EventLoop r1 = r0.eventLoop()     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2 r2 = new io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$2     // Catch: java.lang.Throwable -> L27
                r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L27
                long r3 = (long) r7     // Catch: java.lang.Throwable -> L27
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L27
                io.netty.util.concurrent.ScheduledFuture r7 = r1.schedule(r2, r3, r7)     // Catch: java.lang.Throwable -> L27
                io.netty.channel.epoll.AbstractEpollChannel.access$302(r0, r7)     // Catch: java.lang.Throwable -> L27
            L54:
                io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$3 r7 = new io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe$3     // Catch: java.lang.Throwable -> L27
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

        final void epollInBefore() {
                r1 = this;
                r0 = 0
                r1.maybeMoreDataToRead = r0
                return
        }

        final void epollInFinally(io.netty.channel.ChannelConfig r3) {
                r2 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r2.allocHandle
                boolean r0 = r0.maybeMoreDataToRead()
                r2.maybeMoreDataToRead = r0
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r2.allocHandle
                boolean r0 = r0.isReceivedRdHup()
                if (r0 != 0) goto L27
                boolean r0 = r2.readPending
                if (r0 == 0) goto L19
                boolean r1 = r2.maybeMoreDataToRead
                if (r1 == 0) goto L19
                goto L27
            L19:
                if (r0 != 0) goto L26
                boolean r3 = r3.isAutoRead()
                if (r3 != 0) goto L26
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                r3.clearEpollIn()
            L26:
                return
            L27:
                r2.executeEpollInReadyRunnable(r3)
                return
        }

        abstract void epollInReady();

        final void epollOutReady() {
                r1 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r1.this$0
                io.netty.channel.ChannelPromise r0 = io.netty.channel.epoll.AbstractEpollChannel.access$100(r0)
                if (r0 == 0) goto Lc
                r1.finishConnect()
                return
            Lc:
                io.netty.channel.epoll.AbstractEpollChannel r0 = r1.this$0
                io.netty.channel.epoll.LinuxSocket r0 = r0.socket
                boolean r0 = r0.isOutputShutdown()
                if (r0 != 0) goto L19
                super.flush0()
            L19:
                return
        }

        final void epollRdHupReady() {
                r1 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r1.recvBufAllocHandle()
                r0.receivedRdHup()
                io.netty.channel.epoll.AbstractEpollChannel r0 = r1.this$0
                boolean r0 = r0.isActive()
                if (r0 == 0) goto L13
                r1.epollInReady()
                goto L17
            L13:
                r0 = 1
                r1.shutdownInput(r0)
            L17:
                r1.clearEpollRdHup()
                return
        }

        final void executeEpollInReadyRunnable(io.netty.channel.ChannelConfig r3) {
                r2 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                boolean r1 = r0.epollInReadyRunnablePending
                if (r1 != 0) goto L23
                boolean r0 = r0.isActive()
                if (r0 == 0) goto L23
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                boolean r3 = r0.shouldBreakEpollInReady(r3)
                if (r3 == 0) goto L15
                goto L23
            L15:
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                r0 = 1
                r3.epollInReadyRunnablePending = r0
                io.netty.channel.EventLoop r3 = r3.eventLoop()
                java.lang.Runnable r0 = r2.epollInReadyRunnable
                r3.execute(r0)
            L23:
                return
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe
        protected final void flush0() {
                r2 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                int r1 = io.netty.channel.epoll.Native.EPOLLOUT
                boolean r0 = r0.isFlagSet(r1)
                if (r0 != 0) goto Ld
                super.flush0()
            Ld:
                return
        }

        io.netty.channel.epoll.EpollRecvByteAllocatorHandle newEpollHandle(io.netty.channel.RecvByteBufAllocator.ExtendedHandle r2) {
                r1 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = new io.netty.channel.epoll.EpollRecvByteAllocatorHandle
                r0.<init>(r2)
                return r0
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe, io.netty.channel.Channel.Unsafe
        public /* bridge */ /* synthetic */ io.netty.channel.RecvByteBufAllocator.Handle recvBufAllocHandle() {
                r1 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r1.recvBufAllocHandle()
                return r0
        }

        @Override // io.netty.channel.AbstractChannel.AbstractUnsafe, io.netty.channel.Channel.Unsafe
        public io.netty.channel.epoll.EpollRecvByteAllocatorHandle recvBufAllocHandle() {
                r1 = this;
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r1.allocHandle
                if (r0 != 0) goto L10
                io.netty.channel.RecvByteBufAllocator$Handle r0 = super.recvBufAllocHandle()
                io.netty.channel.RecvByteBufAllocator$ExtendedHandle r0 = (io.netty.channel.RecvByteBufAllocator.ExtendedHandle) r0
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r1.newEpollHandle(r0)
                r1.allocHandle = r0
            L10:
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r0 = r1.allocHandle
                return r0
        }

        void shutdownInput(boolean r3) {
                r2 = this;
                io.netty.channel.epoll.AbstractEpollChannel r0 = r2.this$0
                io.netty.channel.epoll.LinuxSocket r0 = r0.socket
                boolean r0 = r0.isInputShutdown()
                r1 = 1
                if (r0 != 0) goto L3e
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                io.netty.channel.epoll.EpollChannelConfig r3 = r3.config()
                boolean r3 = io.netty.channel.epoll.AbstractEpollChannel.access$000(r3)
                if (r3 == 0) goto L36
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0     // Catch: java.nio.channels.NotYetConnectedException -> L1f java.io.IOException -> L30
                io.netty.channel.epoll.LinuxSocket r3 = r3.socket     // Catch: java.nio.channels.NotYetConnectedException -> L1f java.io.IOException -> L30
                r0 = 0
                r3.shutdown(r1, r0)     // Catch: java.nio.channels.NotYetConnectedException -> L1f java.io.IOException -> L30
            L1f:
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                r3.clearEpollIn()
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                io.netty.channel.ChannelPipeline r3 = r3.pipeline()
                io.netty.channel.socket.ChannelInputShutdownEvent r0 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
                r3.fireUserEventTriggered(r0)
                return
            L30:
                io.netty.channel.socket.ChannelInputShutdownEvent r3 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
                r2.fireEventAndClose(r3)
                return
            L36:
                io.netty.channel.ChannelPromise r3 = r2.voidPromise()
                r2.close(r3)
                return
            L3e:
                if (r3 != 0) goto L4d
                io.netty.channel.epoll.AbstractEpollChannel r3 = r2.this$0
                r3.inputClosedSeenErrorOnRead = r1
                io.netty.channel.ChannelPipeline r3 = r3.pipeline()
                io.netty.channel.socket.ChannelInputShutdownReadComplete r0 = io.netty.channel.socket.ChannelInputShutdownReadComplete.INSTANCE
                r3.fireUserEventTriggered(r0)
            L4d:
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.epoll.AbstractEpollChannel.METADATA = r0
            return
    }

    AbstractEpollChannel(io.netty.channel.Channel r1, io.netty.channel.epoll.LinuxSocket r2, java.net.SocketAddress r3) {
            r0 = this;
            r0.<init>(r1)
            int r1 = io.netty.channel.epoll.Native.EPOLLET
            r0.flags = r1
            java.lang.String r1 = "fd"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.epoll.LinuxSocket r1 = (io.netty.channel.epoll.LinuxSocket) r1
            r0.socket = r1
            r1 = 1
            r0.active = r1
            r0.remote = r3
            java.net.InetSocketAddress r1 = r2.localAddress()
            r0.local = r1
            return
    }

    AbstractEpollChannel(io.netty.channel.Channel r1, io.netty.channel.epoll.LinuxSocket r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            int r1 = io.netty.channel.epoll.Native.EPOLLET
            r0.flags = r1
            java.lang.String r1 = "fd"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.epoll.LinuxSocket r1 = (io.netty.channel.epoll.LinuxSocket) r1
            r0.socket = r1
            r0.active = r3
            if (r3 == 0) goto L21
            java.net.InetSocketAddress r1 = r2.localAddress()
            r0.local = r1
            java.net.InetSocketAddress r1 = r2.remoteAddress()
            r0.remote = r1
        L21:
            return
    }

    AbstractEpollChannel(io.netty.channel.epoll.LinuxSocket r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r3, r1)
            return
    }

    static /* synthetic */ boolean access$000(io.netty.channel.ChannelConfig r0) {
            boolean r0 = isAllowHalfClosure(r0)
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$100(io.netty.channel.epoll.AbstractEpollChannel r0) {
            io.netty.channel.ChannelPromise r0 = r0.connectPromise
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelPromise access$102(io.netty.channel.epoll.AbstractEpollChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.connectPromise = r1
            return r1
    }

    static /* synthetic */ java.net.SocketAddress access$200(io.netty.channel.epoll.AbstractEpollChannel r0) {
            java.net.SocketAddress r0 = r0.requestedRemoteAddress
            return r0
    }

    static /* synthetic */ java.net.SocketAddress access$202(io.netty.channel.epoll.AbstractEpollChannel r0, java.net.SocketAddress r1) {
            r0.requestedRemoteAddress = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$300(io.netty.channel.epoll.AbstractEpollChannel r0) {
            java.util.concurrent.ScheduledFuture<?> r0 = r0.connectTimeoutFuture
            return r0
    }

    static /* synthetic */ java.util.concurrent.ScheduledFuture access$302(io.netty.channel.epoll.AbstractEpollChannel r0, java.util.concurrent.ScheduledFuture r1) {
            r0.connectTimeoutFuture = r1
            return r1
    }

    static /* synthetic */ java.net.SocketAddress access$402(io.netty.channel.epoll.AbstractEpollChannel r0, java.net.SocketAddress r1) {
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
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket     // Catch: java.lang.Throwable -> Le
            boolean r2 = r0.connect(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L10
            int r0 = io.netty.channel.epoll.Native.EPOLLOUT     // Catch: java.lang.Throwable -> Le
            r1.setFlag(r0)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L11
        L10:
            return r2
        L11:
            r1.doClose()
            throw r2
    }

    private static boolean isAllowHalfClosure(io.netty.channel.ChannelConfig r1) {
            boolean r0 = r1 instanceof io.netty.channel.epoll.EpollDomainSocketChannelConfig
            if (r0 == 0) goto Lb
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r1 = (io.netty.channel.epoll.EpollDomainSocketChannelConfig) r1
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

    static boolean isSoErrorZero(io.netty.channel.unix.Socket r1) {
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

    private void modifyEvents() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L15
            boolean r0 = r1.isRegistered()
            if (r0 == 0) goto L15
            io.netty.channel.EventLoop r0 = r1.eventLoop()
            io.netty.channel.epoll.EpollEventLoop r0 = (io.netty.channel.epoll.EpollEventLoop) r0
            r0.modify(r1)
        L15:
            return
    }

    private static io.netty.buffer.ByteBuf newDirectBuffer0(java.lang.Object r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBufAllocator r3, int r4) {
            io.netty.buffer.ByteBuf r3 = r3.directBuffer(r4)
            int r0 = r2.readerIndex()
            r3.writeBytes(r2, r0, r4)
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            return r3
    }

    final void clearEpollIn() {
            r3 = this;
            boolean r0 = r3.isRegistered()
            if (r0 == 0) goto L23
            io.netty.channel.EventLoop r0 = r3.eventLoop()
            io.netty.channel.Channel$Unsafe r1 = r3.unsafe()
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r1 = (io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe) r1
            boolean r2 = r0.inEventLoop()
            if (r2 == 0) goto L1a
            r1.clearEpollIn0()
            return
        L1a:
            io.netty.channel.epoll.AbstractEpollChannel$2 r2 = new io.netty.channel.epoll.AbstractEpollChannel$2
            r2.<init>(r3, r1)
            r0.execute(r2)
            return
        L23:
            int r0 = r3.flags
            int r1 = io.netty.channel.epoll.Native.EPOLLIN
            int r1 = ~r1
            r0 = r0 & r1
            r3.flags = r0
            return
    }

    void clearFlag(int r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.isFlagSet(r2)
            if (r0 == 0) goto Lf
            int r0 = r1.flags
            int r2 = ~r2
            r2 = r2 & r0
            r1.flags = r2
            r1.modifyEvents()
        Lf:
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public abstract io.netty.channel.epoll.EpollChannelConfig config();

    @Override // io.netty.channel.AbstractChannel
    protected final void doBeginRead() throws java.lang.Exception {
            r2 = this;
            io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = (io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe) r0
            r1 = 1
            r0.readPending = r1
            int r1 = io.netty.channel.epoll.Native.EPOLLIN
            r2.setFlag(r1)
            boolean r1 = r0.maybeMoreDataToRead
            if (r1 == 0) goto L19
            io.netty.channel.epoll.EpollChannelConfig r1 = r2.config()
            r0.executeEpollInReadyRunnable(r1)
        L19:
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
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            r0.bind(r2)
            io.netty.channel.epoll.LinuxSocket r2 = r1.socket
            java.net.InetSocketAddress r2 = r2.localAddress()
            r1.local = r2
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r4 = this;
            r0 = 0
            r4.active = r0
            r1 = 1
            r4.inputClosedSeenErrorOnRead = r1
            io.netty.channel.ChannelPromise r1 = r4.connectPromise     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L18
            java.nio.channels.ClosedChannelException r3 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            r1.tryFailure(r3)     // Catch: java.lang.Throwable -> L16
            r4.connectPromise = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L43
        L18:
            java.util.concurrent.ScheduledFuture<?> r1 = r4.connectTimeoutFuture     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L21
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L16
            r4.connectTimeoutFuture = r2     // Catch: java.lang.Throwable -> L16
        L21:
            boolean r0 = r4.isRegistered()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L3d
            io.netty.channel.EventLoop r0 = r4.eventLoop()     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.inEventLoop()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L35
            r4.doDeregister()     // Catch: java.lang.Throwable -> L16
            goto L3d
        L35:
            io.netty.channel.epoll.AbstractEpollChannel$1 r1 = new io.netty.channel.epoll.AbstractEpollChannel$1     // Catch: java.lang.Throwable -> L16
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L16
            r0.execute(r1)     // Catch: java.lang.Throwable -> L16
        L3d:
            io.netty.channel.epoll.LinuxSocket r0 = r4.socket
            r0.close()
            return
        L43:
            io.netty.channel.epoll.LinuxSocket r1 = r4.socket
            r1.close()
            throw r0
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
            io.netty.channel.epoll.LinuxSocket r1 = r2.socket
            r1.bind(r4)
        L23:
            boolean r4 = r2.doConnect0(r3)
            if (r4 == 0) goto L38
            if (r0 != 0) goto L2c
            goto L36
        L2c:
            io.netty.channel.epoll.LinuxSocket r3 = r2.socket
            java.net.InetSocketAddress r3 = r3.remoteAddress()
            java.net.InetSocketAddress r3 = io.netty.channel.unix.UnixChannelUtil.computeRemoteAddr(r0, r3)
        L36:
            r2.remote = r3
        L38:
            io.netty.channel.epoll.LinuxSocket r3 = r2.socket
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
            io.netty.channel.epoll.EpollEventLoop r0 = (io.netty.channel.epoll.EpollEventLoop) r0
            r0.remove(r1)
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
            io.netty.channel.epoll.LinuxSocket r1 = r5.socket
            long r2 = r6.memoryAddress()
            int r4 = r6.capacity()
            int r1 = r1.readAddress(r2, r0, r4)
            goto L3e
        L28:
            int r1 = r6.writableBytes()
            java.nio.ByteBuffer r1 = r6.internalNioBuffer(r0, r1)
            io.netty.channel.epoll.LinuxSocket r2 = r5.socket
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
            r1 = this;
            r0 = 0
            r1.epollInReadyRunnablePending = r0
            io.netty.channel.EventLoop r0 = r1.eventLoop()
            io.netty.channel.epoll.EpollEventLoop r0 = (io.netty.channel.epoll.EpollEventLoop) r0
            r0.add(r1)
            return
    }

    protected final int doWriteBytes(io.netty.channel.ChannelOutboundBuffer r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r7.hasMemoryAddress()
            r1 = 1
            if (r0 == 0) goto L20
            io.netty.channel.epoll.LinuxSocket r0 = r5.socket
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
            io.netty.channel.epoll.LinuxSocket r0 = r5.socket
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
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
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
            boolean r1 = r1 instanceof io.netty.channel.epoll.EpollEventLoop
            return r1
    }

    boolean isFlagSet(int r2) {
            r1 = this;
            int r0 = r1.flags
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
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
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.epoll.AbstractEpollChannel.METADATA
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
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected abstract io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe();

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.net.SocketAddress r0 = r1.remote
            return r0
    }

    void setFlag(int r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.isFlagSet(r2)
            if (r0 != 0) goto Le
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            r1.modifyEvents()
        Le:
            return
    }

    final boolean shouldBreakEpollInReady(io.netty.channel.ChannelConfig r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
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
}
