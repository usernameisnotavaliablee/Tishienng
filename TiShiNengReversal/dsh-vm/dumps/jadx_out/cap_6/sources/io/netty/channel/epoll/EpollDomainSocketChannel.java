package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollDomainSocketChannel extends io.netty.channel.epoll.AbstractEpollStreamChannel implements io.netty.channel.unix.DomainSocketChannel {
    private final io.netty.channel.epoll.EpollDomainSocketChannelConfig config;
    private volatile io.netty.channel.unix.DomainSocketAddress local;
    private volatile io.netty.channel.unix.DomainSocketAddress remote;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.epoll.EpollDomainSocketChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$unix$DomainSocketReadMode = null;

        static {
                io.netty.channel.unix.DomainSocketReadMode[] r0 = io.netty.channel.unix.DomainSocketReadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.epoll.EpollDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode = r0
                io.netty.channel.unix.DomainSocketReadMode r1 = io.netty.channel.unix.DomainSocketReadMode.BYTES     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.epoll.EpollDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.unix.DomainSocketReadMode r1 = io.netty.channel.unix.DomainSocketReadMode.FILE_DESCRIPTORS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EpollDomainUnsafe extends io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe {
        final /* synthetic */ io.netty.channel.epoll.EpollDomainSocketChannel this$0;

        private EpollDomainUnsafe(io.netty.channel.epoll.EpollDomainSocketChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ EpollDomainUnsafe(io.netty.channel.epoll.EpollDomainSocketChannel r1, io.netty.channel.epoll.EpollDomainSocketChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void epollInReadFd() {
                r5 = this;
                io.netty.channel.epoll.EpollDomainSocketChannel r0 = r5.this$0
                io.netty.channel.epoll.LinuxSocket r0 = r0.socket
                boolean r0 = r0.isInputShutdown()
                if (r0 == 0) goto Le
                r5.clearEpollIn0()
                return
            Le:
                io.netty.channel.epoll.EpollDomainSocketChannel r0 = r5.this$0
                io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = r0.config()
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r1 = r5.recvBufAllocHandle()
                io.netty.channel.epoll.EpollDomainSocketChannel r2 = r5.this$0
                int r3 = io.netty.channel.epoll.Native.EPOLLET
                boolean r2 = r2.isFlagSet(r3)
                r1.edgeTriggered(r2)
                io.netty.channel.epoll.EpollDomainSocketChannel r2 = r5.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r1.reset(r0)
                r5.epollInBefore()
            L2f:
                io.netty.channel.epoll.EpollDomainSocketChannel r3 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                io.netty.channel.epoll.LinuxSocket r3 = r3.socket     // Catch: java.lang.Throwable -> L5d
                int r3 = r3.recvFd()     // Catch: java.lang.Throwable -> L5d
                r1.lastBytesRead(r3)     // Catch: java.lang.Throwable -> L5d
                int r3 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L5d
                r4 = -1
                if (r3 == r4) goto L69
                if (r3 == 0) goto L5f
                r3 = 1
                r1.incMessagesRead(r3)     // Catch: java.lang.Throwable -> L5d
                r3 = 0
                r5.readPending = r3     // Catch: java.lang.Throwable -> L5d
                io.netty.channel.unix.FileDescriptor r3 = new io.netty.channel.unix.FileDescriptor     // Catch: java.lang.Throwable -> L5d
                int r4 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L5d
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d
                r2.fireChannelRead(r3)     // Catch: java.lang.Throwable -> L5d
                boolean r3 = r1.continueReading()     // Catch: java.lang.Throwable -> L5d
                if (r3 != 0) goto L2f
                goto L5f
            L5d:
                r3 = move-exception
                goto L74
            L5f:
                r1.readComplete()     // Catch: java.lang.Throwable -> L5d
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L5d
                r5.epollInFinally(r0)
                return
            L69:
                io.netty.channel.ChannelPromise r3 = r5.voidPromise()     // Catch: java.lang.Throwable -> L5d
                r5.close(r3)     // Catch: java.lang.Throwable -> L5d
                r5.epollInFinally(r0)
                return
            L74:
                r1.readComplete()     // Catch: java.lang.Throwable -> L81
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L81
                r2.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> L81
                r5.epollInFinally(r0)
                return
            L81:
                r1 = move-exception
                r5.epollInFinally(r0)
                throw r1
        }

        @Override // io.netty.channel.epoll.AbstractEpollStreamChannel.EpollStreamUnsafe, io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        void epollInReady() {
                r2 = this;
                int[] r0 = io.netty.channel.epoll.EpollDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode
                io.netty.channel.epoll.EpollDomainSocketChannel r1 = r2.this$0
                io.netty.channel.epoll.EpollDomainSocketChannelConfig r1 = r1.config()
                io.netty.channel.unix.DomainSocketReadMode r1 = r1.getReadMode()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L22
                r1 = 2
                if (r0 != r1) goto L1c
                r2.epollInReadFd()
                return
            L1c:
                java.lang.Error r0 = new java.lang.Error
                r0.<init>()
                throw r0
            L22:
                super.epollInReady()
                return
        }
    }

    public EpollDomainSocketChannel() {
            r2 = this;
            io.netty.channel.epoll.LinuxSocket r0 = io.netty.channel.epoll.LinuxSocket.newSocketDomain()
            r1 = 0
            r2.<init>(r0, r1)
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = new io.netty.channel.epoll.EpollDomainSocketChannelConfig
            r0.<init>(r2)
            r2.config = r0
            return
    }

    public EpollDomainSocketChannel(int r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r1 = new io.netty.channel.epoll.EpollDomainSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    public EpollDomainSocketChannel(int r2, boolean r3) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r2)
            r1.<init>(r0, r3)
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r2 = new io.netty.channel.epoll.EpollDomainSocketChannelConfig
            r2.<init>(r1)
            r1.config = r2
            return
    }

    public EpollDomainSocketChannel(io.netty.channel.Channel r1, io.netty.channel.epoll.LinuxSocket r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r1 = new io.netty.channel.epoll.EpollDomainSocketChannelConfig
            r1.<init>(r0)
            r0.config = r1
            return
    }

    EpollDomainSocketChannel(io.netty.channel.Channel r2, io.netty.channel.unix.FileDescriptor r3) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            int r3 = r3.intValue()
            r0.<init>(r3)
            r1.<init>(r2, r0)
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r2 = new io.netty.channel.epoll.EpollDomainSocketChannelConfig
            r2.<init>(r1)
            r1.config = r2
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.epoll.EpollDomainSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.unix.DomainSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            r0.bind(r2)
            io.netty.channel.unix.DomainSocketAddress r2 = (io.netty.channel.unix.DomainSocketAddress) r2
            r1.local = r2
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel
    protected boolean doConnect(java.net.SocketAddress r2, java.net.SocketAddress r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = super.doConnect(r2, r3)
            if (r0 == 0) goto L10
            io.netty.channel.unix.DomainSocketAddress r3 = (io.netty.channel.unix.DomainSocketAddress) r3
            r1.local = r3
            io.netty.channel.unix.DomainSocketAddress r2 = (io.netty.channel.unix.DomainSocketAddress) r2
            r1.remote = r2
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel
    protected int doWriteSingle(io.netty.channel.ChannelOutboundBuffer r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r3.current()
            boolean r1 = r0 instanceof io.netty.channel.unix.FileDescriptor
            if (r1 == 0) goto L1b
            io.netty.channel.epoll.LinuxSocket r1 = r2.socket
            io.netty.channel.unix.FileDescriptor r0 = (io.netty.channel.unix.FileDescriptor) r0
            int r0 = r0.intValue()
            int r0 = r1.sendFd(r0)
            if (r0 <= 0) goto L1b
            r3.remove()
            r3 = 1
            return r3
        L1b:
            int r3 = super.doWriteSingle(r3)
            return r3
    }

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel, io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.unix.FileDescriptor
            if (r0 == 0) goto L5
            return r2
        L5:
            java.lang.Object r2 = super.filterOutboundMessage(r2)
            return r2
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.unix.DomainSocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            io.netty.channel.unix.DomainSocketAddress r0 = (io.netty.channel.unix.DomainSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.unix.DomainSocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.local
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.localAddress0()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel, io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollStreamChannel, io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe r0 = new io.netty.channel.epoll.EpollDomainSocketChannel$EpollDomainUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public io.netty.channel.unix.PeerCredentials peerCredentials() throws java.io.IOException {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            io.netty.channel.unix.PeerCredentials r0 = r0.getPeerCredentials()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.unix.DomainSocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            io.netty.channel.unix.DomainSocketAddress r0 = (io.netty.channel.unix.DomainSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remoteAddress()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.unix.DomainSocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remote
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remoteAddress0()
            return r0
    }
}
