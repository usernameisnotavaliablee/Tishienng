package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueueDomainSocketChannel extends io.netty.channel.kqueue.AbstractKQueueStreamChannel implements io.netty.channel.unix.DomainSocketChannel {
    private final io.netty.channel.kqueue.KQueueDomainSocketChannelConfig config;
    private volatile io.netty.channel.unix.DomainSocketAddress local;
    private volatile io.netty.channel.unix.DomainSocketAddress remote;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.kqueue.KQueueDomainSocketChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$unix$DomainSocketReadMode = null;

        static {
                io.netty.channel.unix.DomainSocketReadMode[] r0 = io.netty.channel.unix.DomainSocketReadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.kqueue.KQueueDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode = r0
                io.netty.channel.unix.DomainSocketReadMode r1 = io.netty.channel.unix.DomainSocketReadMode.BYTES     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.kqueue.KQueueDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode     // Catch: java.lang.NoSuchFieldError -> L1d
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
    private final class KQueueDomainUnsafe extends io.netty.channel.kqueue.AbstractKQueueStreamChannel.KQueueStreamUnsafe {
        final /* synthetic */ io.netty.channel.kqueue.KQueueDomainSocketChannel this$0;

        private KQueueDomainUnsafe(io.netty.channel.kqueue.KQueueDomainSocketChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ KQueueDomainUnsafe(io.netty.channel.kqueue.KQueueDomainSocketChannel r1, io.netty.channel.kqueue.KQueueDomainSocketChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readReadyFd() {
                r6 = this;
                io.netty.channel.kqueue.KQueueDomainSocketChannel r0 = r6.this$0
                io.netty.channel.kqueue.BsdSocket r0 = r0.socket
                boolean r0 = r0.isInputShutdown()
                if (r0 == 0) goto Le
                super.clearReadFilter0()
                return
            Le:
                io.netty.channel.kqueue.KQueueDomainSocketChannel r0 = r6.this$0
                io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = r0.config()
                io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r1 = r6.recvBufAllocHandle()
                io.netty.channel.kqueue.KQueueDomainSocketChannel r2 = r6.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                r1.reset(r0)
                r6.readReadyBefore()
            L24:
                io.netty.channel.kqueue.KQueueDomainSocketChannel r3 = r6.this$0     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.kqueue.BsdSocket r3 = r3.socket     // Catch: java.lang.Throwable -> L4a
                int r3 = r3.recvFd()     // Catch: java.lang.Throwable -> L4a
                r4 = -1
                if (r3 == r4) goto L59
                r4 = 0
                if (r3 == 0) goto L4c
                r5 = 1
                r1.lastBytesRead(r5)     // Catch: java.lang.Throwable -> L4a
                r1.incMessagesRead(r5)     // Catch: java.lang.Throwable -> L4a
                r6.readPending = r4     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.unix.FileDescriptor r4 = new io.netty.channel.unix.FileDescriptor     // Catch: java.lang.Throwable -> L4a
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L4a
                r2.fireChannelRead(r4)     // Catch: java.lang.Throwable -> L4a
                boolean r3 = r1.continueReading()     // Catch: java.lang.Throwable -> L4a
                if (r3 != 0) goto L24
                goto L4f
            L4a:
                r3 = move-exception
                goto L67
            L4c:
                r1.lastBytesRead(r4)     // Catch: java.lang.Throwable -> L4a
            L4f:
                r1.readComplete()     // Catch: java.lang.Throwable -> L4a
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L4a
                r6.readReadyFinally(r0)
                return
            L59:
                r1.lastBytesRead(r4)     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.ChannelPromise r3 = r6.voidPromise()     // Catch: java.lang.Throwable -> L4a
                r6.close(r3)     // Catch: java.lang.Throwable -> L4a
                r6.readReadyFinally(r0)
                return
            L67:
                r1.readComplete()     // Catch: java.lang.Throwable -> L74
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L74
                r2.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> L74
                r6.readReadyFinally(r0)
                return
            L74:
                r1 = move-exception
                r6.readReadyFinally(r0)
                throw r1
        }

        @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel.KQueueStreamUnsafe, io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe
        void readReady(io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r3) {
                r2 = this;
                int[] r0 = io.netty.channel.kqueue.KQueueDomainSocketChannel.AnonymousClass1.$SwitchMap$io$netty$channel$unix$DomainSocketReadMode
                io.netty.channel.kqueue.KQueueDomainSocketChannel r1 = r2.this$0
                io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r1 = r1.config()
                io.netty.channel.unix.DomainSocketReadMode r1 = r1.getReadMode()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L22
                r3 = 2
                if (r0 != r3) goto L1c
                r2.readReadyFd()
                return
            L1c:
                java.lang.Error r3 = new java.lang.Error
                r3.<init>()
                throw r3
            L22:
                super.readReady(r3)
                return
        }
    }

    public KQueueDomainSocketChannel() {
            r3 = this;
            io.netty.channel.kqueue.BsdSocket r0 = io.netty.channel.kqueue.BsdSocket.newSocketDomain()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = new io.netty.channel.kqueue.KQueueDomainSocketChannelConfig
            r0.<init>(r3)
            r3.config = r0
            return
    }

    public KQueueDomainSocketChannel(int r2) {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r2, r0)
            return
    }

    KQueueDomainSocketChannel(io.netty.channel.Channel r2, io.netty.channel.kqueue.BsdSocket r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r2 = new io.netty.channel.kqueue.KQueueDomainSocketChannelConfig
            r2.<init>(r1)
            r1.config = r2
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.kqueue.KQueueDomainSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.unix.DomainSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDomainSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            r0.bind(r2)
            io.netty.channel.unix.DomainSocketAddress r2 = (io.netty.channel.unix.DomainSocketAddress) r2
            r1.local = r2
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel
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

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel
    protected int doWriteSingle(io.netty.channel.ChannelOutboundBuffer r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r3.current()
            boolean r1 = r0 instanceof io.netty.channel.unix.FileDescriptor
            if (r1 == 0) goto L1b
            io.netty.channel.kqueue.BsdSocket r1 = r2.socket
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

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel, io.netty.channel.AbstractChannel
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.unix.DomainSocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.local
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress localAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.localAddress0()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel, io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueStreamChannel, io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.kqueue.KQueueDomainSocketChannel$KQueueDomainUnsafe r0 = new io.netty.channel.kqueue.KQueueDomainSocketChannel$KQueueDomainUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public io.netty.channel.unix.PeerCredentials peerCredentials() throws java.io.IOException {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.unix.DomainSocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remote
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress0() {
            r1 = this;
            io.netty.channel.unix.DomainSocketAddress r0 = r1.remoteAddress0()
            return r0
    }
}
