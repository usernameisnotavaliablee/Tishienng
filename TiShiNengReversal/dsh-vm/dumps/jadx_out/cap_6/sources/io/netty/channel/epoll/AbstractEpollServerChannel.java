package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractEpollServerChannel extends io.netty.channel.epoll.AbstractEpollChannel implements io.netty.channel.ServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EpollServerSocketUnsafe extends io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final byte[] acceptedAddress;
        final /* synthetic */ io.netty.channel.epoll.AbstractEpollServerChannel this$0;

        static {
                return
        }

        EpollServerSocketUnsafe(io.netty.channel.epoll.AbstractEpollServerChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r1 = 26
                byte[] r1 = new byte[r1]
                r0.acceptedAddress = r1
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe, io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                r3.setFailure(r1)
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        void epollInReady() {
                r8 = this;
                io.netty.channel.epoll.AbstractEpollServerChannel r0 = r8.this$0
                io.netty.channel.epoll.EpollChannelConfig r0 = r0.config()
                io.netty.channel.epoll.AbstractEpollServerChannel r1 = r8.this$0
                boolean r1 = r1.shouldBreakEpollInReady(r0)
                if (r1 == 0) goto L12
                r8.clearEpollIn0()
                return
            L12:
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r1 = r8.recvBufAllocHandle()
                io.netty.channel.epoll.AbstractEpollServerChannel r2 = r8.this$0
                int r3 = io.netty.channel.epoll.Native.EPOLLET
                boolean r2 = r2.isFlagSet(r3)
                r1.edgeTriggered(r2)
                io.netty.channel.epoll.AbstractEpollServerChannel r2 = r8.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r1.reset(r0)
                r3 = 1
                r1.attemptedBytesRead(r3)
                r8.epollInBefore()
            L31:
                io.netty.channel.epoll.AbstractEpollServerChannel r4 = r8.this$0     // Catch: java.lang.Throwable -> L65
                io.netty.channel.epoll.LinuxSocket r4 = r4.socket     // Catch: java.lang.Throwable -> L65
                byte[] r5 = r8.acceptedAddress     // Catch: java.lang.Throwable -> L65
                int r4 = r4.accept(r5)     // Catch: java.lang.Throwable -> L65
                r1.lastBytesRead(r4)     // Catch: java.lang.Throwable -> L65
                int r4 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L65
                r5 = -1
                if (r4 != r5) goto L46
                goto L63
            L46:
                r1.incMessagesRead(r3)     // Catch: java.lang.Throwable -> L65
                r4 = 0
                r8.readPending = r4     // Catch: java.lang.Throwable -> L65
                io.netty.channel.epoll.AbstractEpollServerChannel r5 = r8.this$0     // Catch: java.lang.Throwable -> L65
                int r6 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L65
                byte[] r7 = r8.acceptedAddress     // Catch: java.lang.Throwable -> L65
                r4 = r7[r4]     // Catch: java.lang.Throwable -> L65
                io.netty.channel.Channel r4 = r5.newChildChannel(r6, r7, r3, r4)     // Catch: java.lang.Throwable -> L65
                r2.fireChannelRead(r4)     // Catch: java.lang.Throwable -> L65
                boolean r4 = r1.continueReading()     // Catch: java.lang.Throwable -> L65
                if (r4 != 0) goto L31
            L63:
                r3 = 0
                goto L66
            L65:
                r3 = move-exception
            L66:
                r1.readComplete()     // Catch: java.lang.Throwable -> L72
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L72
                if (r3 == 0) goto L74
                r2.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> L72
                goto L74
            L72:
                r1 = move-exception
                goto L78
            L74:
                r8.epollInFinally(r0)
                return
            L78:
                r8.epollInFinally(r0)
                throw r1
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.epoll.AbstractEpollServerChannel.METADATA = r0
            return
    }

    protected AbstractEpollServerChannel(int r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r2)
            return
    }

    AbstractEpollServerChannel(io.netty.channel.epoll.LinuxSocket r2) {
            r1 = this;
            boolean r0 = io.netty.channel.epoll.AbstractEpollChannel.isSoErrorZero(r2)
            r1.<init>(r2, r0)
            return
    }

    AbstractEpollServerChannel(io.netty.channel.epoll.LinuxSocket r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel
    protected boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.netty.channel.epoll.EpollEventLoop
            return r1
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isOpen() {
            r1 = this;
            boolean r0 = super.isOpen()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.epoll.AbstractEpollServerChannel.METADATA
            return r0
    }

    abstract io.netty.channel.Channel newChildChannel(int r1, byte[] r2, int r3, int r4) throws java.lang.Exception;

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe r0 = new io.netty.channel.epoll.AbstractEpollServerChannel$EpollServerSocketUnsafe
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected java.net.InetSocketAddress remoteAddress0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.remoteAddress0()
            return r0
    }
}
