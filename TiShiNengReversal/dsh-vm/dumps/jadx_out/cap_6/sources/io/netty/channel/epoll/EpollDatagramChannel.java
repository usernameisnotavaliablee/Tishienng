package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollDatagramChannel extends io.netty.channel.epoll.AbstractEpollChannel implements io.netty.channel.socket.DatagramChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final io.netty.channel.epoll.EpollDatagramChannelConfig config;
    private volatile boolean connected;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EpollDatagramChannelUnsafe extends io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final /* synthetic */ io.netty.channel.epoll.EpollDatagramChannel this$0;

        static {
                return
        }

        EpollDatagramChannelUnsafe(io.netty.channel.epoll.EpollDatagramChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe
        void epollInReady() {
                r12 = this;
                io.netty.channel.epoll.EpollDatagramChannel r0 = r12.this$0
                io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r0.config()
                io.netty.channel.epoll.EpollDatagramChannel r1 = r12.this$0
                boolean r1 = r1.shouldBreakEpollInReady(r0)
                if (r1 == 0) goto L12
                r12.clearEpollIn0()
                return
            L12:
                io.netty.channel.epoll.EpollRecvByteAllocatorHandle r1 = r12.recvBufAllocHandle()
                io.netty.channel.epoll.EpollDatagramChannel r2 = r12.this$0
                int r3 = io.netty.channel.epoll.Native.EPOLLET
                boolean r2 = r2.isFlagSet(r3)
                r1.edgeTriggered(r2)
                io.netty.channel.epoll.EpollDatagramChannel r2 = r12.this$0
                io.netty.channel.ChannelPipeline r2 = r2.pipeline()
                io.netty.buffer.ByteBufAllocator r3 = r0.getAllocator()
                r1.reset(r0)
                r12.epollInBefore()
                r4 = 0
                io.netty.channel.epoll.EpollDatagramChannel r5 = r12.this$0     // Catch: java.lang.Throwable -> Lfe
                boolean r5 = r5.isConnected()     // Catch: java.lang.Throwable -> Lfe
            L38:
                io.netty.buffer.ByteBuf r6 = r1.allocate(r3)     // Catch: java.lang.Throwable -> Lfe
                int r7 = r6.writableBytes()     // Catch: java.lang.Throwable -> L59
                r1.attemptedBytesRead(r7)     // Catch: java.lang.Throwable -> L59
                if (r5 == 0) goto L87
                io.netty.channel.epoll.EpollDatagramChannel r7 = r12.this$0     // Catch: java.lang.Throwable -> L59 io.netty.channel.unix.Errors.NativeIoException -> L70
                int r7 = r7.doReadBytes(r6)     // Catch: java.lang.Throwable -> L59 io.netty.channel.unix.Errors.NativeIoException -> L70
                r1.lastBytesRead(r7)     // Catch: java.lang.Throwable -> L59 io.netty.channel.unix.Errors.NativeIoException -> L70
                int r7 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L59
                if (r7 > 0) goto L5d
                r6.release()     // Catch: java.lang.Throwable -> L59
                goto L10a
            L59:
                r3 = move-exception
            L5a:
                r4 = r3
                goto L102
            L5d:
                io.netty.channel.socket.DatagramPacket r7 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L59
                java.net.SocketAddress r8 = r12.localAddress()     // Catch: java.lang.Throwable -> L59
                java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8     // Catch: java.lang.Throwable -> L59
                java.net.SocketAddress r9 = r12.remoteAddress()     // Catch: java.lang.Throwable -> L59
                java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9     // Catch: java.lang.Throwable -> L59
                r7.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L59
                goto Led
            L70:
                r3 = move-exception
                int r4 = r3.expectedErr()     // Catch: java.lang.Throwable -> L59
                int r5 = io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE     // Catch: java.lang.Throwable -> L59
                if (r4 != r5) goto L86
                java.net.PortUnreachableException r4 = new java.net.PortUnreachableException     // Catch: java.lang.Throwable -> L59
                java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Throwable -> L59
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L59
                r4.initCause(r3)     // Catch: java.lang.Throwable -> L59
                throw r4     // Catch: java.lang.Throwable -> L59
            L86:
                throw r3     // Catch: java.lang.Throwable -> L59
            L87:
                boolean r7 = r6.hasMemoryAddress()     // Catch: java.lang.Throwable -> L59
                if (r7 == 0) goto La2
                io.netty.channel.epoll.EpollDatagramChannel r7 = r12.this$0     // Catch: java.lang.Throwable -> L59
                io.netty.channel.epoll.LinuxSocket r7 = r7.socket     // Catch: java.lang.Throwable -> L59
                long r8 = r6.memoryAddress()     // Catch: java.lang.Throwable -> L59
                int r10 = r6.writerIndex()     // Catch: java.lang.Throwable -> L59
                int r11 = r6.capacity()     // Catch: java.lang.Throwable -> L59
                io.netty.channel.unix.DatagramSocketAddress r7 = r7.recvFromAddress(r8, r10, r11)     // Catch: java.lang.Throwable -> L59
                goto Lbe
            La2:
                int r7 = r6.writerIndex()     // Catch: java.lang.Throwable -> L59
                int r8 = r6.writableBytes()     // Catch: java.lang.Throwable -> L59
                java.nio.ByteBuffer r7 = r6.internalNioBuffer(r7, r8)     // Catch: java.lang.Throwable -> L59
                io.netty.channel.epoll.EpollDatagramChannel r8 = r12.this$0     // Catch: java.lang.Throwable -> L59
                io.netty.channel.epoll.LinuxSocket r8 = r8.socket     // Catch: java.lang.Throwable -> L59
                int r9 = r7.position()     // Catch: java.lang.Throwable -> L59
                int r10 = r7.limit()     // Catch: java.lang.Throwable -> L59
                io.netty.channel.unix.DatagramSocketAddress r7 = r8.recvFrom(r7, r9, r10)     // Catch: java.lang.Throwable -> L59
            Lbe:
                if (r7 != 0) goto Lc8
                r3 = -1
                r1.lastBytesRead(r3)     // Catch: java.lang.Throwable -> L59
                r6.release()     // Catch: java.lang.Throwable -> L59
                goto L10a
            Lc8:
                io.netty.channel.unix.DatagramSocketAddress r8 = r7.localAddress()     // Catch: java.lang.Throwable -> L59
                if (r8 != 0) goto Ld4
                java.net.SocketAddress r8 = r12.localAddress()     // Catch: java.lang.Throwable -> L59
                java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8     // Catch: java.lang.Throwable -> L59
            Ld4:
                int r9 = r7.receivedAmount()     // Catch: java.lang.Throwable -> L59
                r1.lastBytesRead(r9)     // Catch: java.lang.Throwable -> L59
                int r9 = r6.writerIndex()     // Catch: java.lang.Throwable -> L59
                int r10 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L59
                int r9 = r9 + r10
                r6.writerIndex(r9)     // Catch: java.lang.Throwable -> L59
                io.netty.channel.socket.DatagramPacket r9 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L59
                r9.<init>(r6, r8, r7)     // Catch: java.lang.Throwable -> L59
                r7 = r9
            Led:
                r8 = 1
                r1.incMessagesRead(r8)     // Catch: java.lang.Throwable -> L59
                r8 = 0
                r12.readPending = r8     // Catch: java.lang.Throwable -> L59
                r2.fireChannelRead(r7)     // Catch: java.lang.Throwable -> L59
                boolean r6 = r1.continueReading()     // Catch: java.lang.Throwable -> Lfe
                if (r6 != 0) goto L38
                goto L10a
            Lfe:
                r3 = move-exception
                r6 = r4
                goto L5a
            L102:
                if (r6 == 0) goto L10a
                r6.release()     // Catch: java.lang.Throwable -> L108
                goto L10a
            L108:
                r1 = move-exception
                goto L119
            L10a:
                r1.readComplete()     // Catch: java.lang.Throwable -> L108
                r2.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L108
                if (r4 == 0) goto L115
                r2.fireExceptionCaught(r4)     // Catch: java.lang.Throwable -> L108
            L115:
                r12.epollInFinally(r0)
                return
            L119:
                r12.epollInFinally(r0)
                throw r1
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 1
            r0.<init>(r1)
            io.netty.channel.epoll.EpollDatagramChannel.METADATA = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " (expected: "
            r0.append(r1)
            java.lang.Class<io.netty.channel.socket.DatagramPacket> r1 = io.netty.channel.socket.DatagramPacket.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class<io.netty.channel.AddressedEnvelope> r2 = io.netty.channel.AddressedEnvelope.class
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r2)
            r2 = 60
            r0.append(r2)
            java.lang.Class<io.netty.buffer.ByteBuf> r2 = io.netty.buffer.ByteBuf.class
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.Class<java.net.InetSocketAddress> r1 = java.net.InetSocketAddress.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ">, "
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.epoll.EpollDatagramChannel.EXPECTED_TYPES = r0
            return
    }

    public EpollDatagramChannel() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public EpollDatagramChannel(int r2) {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private EpollDatagramChannel(io.netty.channel.epoll.LinuxSocket r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r3, r1)
            io.netty.channel.epoll.EpollDatagramChannelConfig r3 = new io.netty.channel.epoll.EpollDatagramChannelConfig
            r3.<init>(r2)
            r2.config = r3
            return
    }

    public EpollDatagramChannel(io.netty.channel.socket.InternetProtocolFamily r2) {
            r1 = this;
            if (r2 != 0) goto Lb
            boolean r2 = io.netty.channel.unix.Socket.isIPv6Preferred()
        L6:
            io.netty.channel.epoll.LinuxSocket r2 = io.netty.channel.epoll.LinuxSocket.newSocketDgram(r2)
            goto L13
        Lb:
            io.netty.channel.socket.InternetProtocolFamily r0 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            if (r2 != r0) goto L11
            r2 = 1
            goto L6
        L11:
            r2 = 0
            goto L6
        L13:
            r1.<init>(r2)
            return
    }

    private boolean doWriteMessage(java.lang.Object r12) throws java.lang.Exception {
            r11 = this;
            boolean r0 = r12 instanceof io.netty.channel.AddressedEnvelope
            if (r0 == 0) goto L13
            io.netty.channel.AddressedEnvelope r12 = (io.netty.channel.AddressedEnvelope) r12
            java.lang.Object r0 = r12.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            java.net.SocketAddress r12 = r12.recipient()
            java.net.InetSocketAddress r12 = (java.net.InetSocketAddress) r12
            goto L17
        L13:
            r0 = r12
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            r12 = 0
        L17:
            int r1 = r0.readableBytes()
            r2 = 1
            if (r1 != 0) goto L1f
            return r2
        L1f:
            boolean r1 = r0.hasMemoryAddress()
            r3 = 0
            if (r1 == 0) goto L52
            long r5 = r0.memoryAddress()
            if (r12 != 0) goto L3b
            io.netty.channel.epoll.LinuxSocket r12 = r11.socket
            int r1 = r0.readerIndex()
            int r0 = r0.writerIndex()
            int r12 = r12.writeAddress(r5, r1, r0)
            goto La5
        L3b:
            io.netty.channel.epoll.LinuxSocket r4 = r11.socket
            int r7 = r0.readerIndex()
            int r8 = r0.writerIndex()
            java.net.InetAddress r9 = r12.getAddress()
            int r10 = r12.getPort()
            int r12 = r4.sendToAddress(r5, r7, r8, r9, r10)
            goto La5
        L52:
            int r1 = r0.nioBufferCount()
            if (r1 <= r2) goto L89
            io.netty.channel.EventLoop r1 = r11.eventLoop()
            io.netty.channel.epoll.EpollEventLoop r1 = (io.netty.channel.epoll.EpollEventLoop) r1
            io.netty.channel.unix.IovArray r1 = r1.cleanIovArray()
            r1.add(r0)
            int r7 = r1.count()
            if (r12 != 0) goto L76
            io.netty.channel.epoll.LinuxSocket r12 = r11.socket
            long r0 = r1.memoryAddress(r3)
            long r0 = r12.writevAddresses(r0, r7)
            goto Lbe
        L76:
            io.netty.channel.epoll.LinuxSocket r4 = r11.socket
            long r5 = r1.memoryAddress(r3)
            java.net.InetAddress r8 = r12.getAddress()
            int r9 = r12.getPort()
            int r12 = r4.sendToAddresses(r5, r7, r8, r9)
            goto La5
        L89:
            int r1 = r0.readerIndex()
            int r4 = r0.readableBytes()
            java.nio.ByteBuffer r6 = r0.internalNioBuffer(r1, r4)
            if (r12 != 0) goto La7
            io.netty.channel.epoll.LinuxSocket r12 = r11.socket
            int r0 = r6.position()
            int r1 = r6.limit()
            int r12 = r12.write(r6, r0, r1)
        La5:
            long r0 = (long) r12
            goto Lbe
        La7:
            io.netty.channel.epoll.LinuxSocket r5 = r11.socket
            int r7 = r6.position()
            int r8 = r6.limit()
            java.net.InetAddress r9 = r12.getAddress()
            int r10 = r12.getPort()
            int r12 = r5.sendTo(r6, r7, r8, r9, r10)
            goto La5
        Lbe:
            r4 = 0
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto Lc5
            return r2
        Lc5:
            return r3
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r2, java.net.InetAddress r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.block(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.localAddress()     // Catch: java.lang.Throwable -> L11
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.lang.Throwable -> L11
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.lang.Throwable -> L11
            io.netty.channel.ChannelFuture r2 = r1.block(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            r4.setFailure(r2)
            return r4
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.block(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            if (r1 == 0) goto L21
            if (r3 == 0) goto L19
            if (r2 == 0) goto L11
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Multicast not supported"
            r1.<init>(r2)
            r4.setFailure(r1)
            return r4
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "networkInterface"
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "sourceToBlock"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "multicastAddress"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.epoll.EpollDatagramChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig config() {
            r1 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r3 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto L2a
            r0 = r3
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            java.net.InetAddress r1 = r0.getAddress()
            boolean r1 = r1.isAnyLocalAddress()
            if (r1 == 0) goto L2a
            java.net.InetAddress r1 = r0.getAddress()
            boolean r1 = r1 instanceof java.net.Inet4Address
            if (r1 == 0) goto L2a
            boolean r1 = io.netty.channel.unix.Socket.isIPv6Preferred()
            if (r1 == 0) goto L2a
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            java.net.InetAddress r1 = io.netty.channel.epoll.LinuxSocket.INET6_ANY
            int r0 = r0.getPort()
            r3.<init>(r1, r0)
        L2a:
            super.doBind(r3)
            r3 = 1
            r2.active = r3
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            super.doClose()
            r0 = 0
            r1.connected = r0
            return
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel
    protected boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            boolean r1 = super.doConnect(r1, r2)
            if (r1 == 0) goto La
            r1 = 1
            r0.connected = r1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            r0.disconnect()
            r0 = 0
            r1.active = r0
            r1.connected = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r7) throws java.lang.Exception {
            r6 = this;
        L0:
            java.lang.Object r0 = r7.current()
            if (r0 != 0) goto Lc
            int r7 = io.netty.channel.epoll.Native.EPOLLOUT
            r6.clearFlag(r7)
            goto L6a
        Lc:
            boolean r1 = io.netty.channel.epoll.Native.IS_SUPPORTING_SENDMMSG     // Catch: java.io.IOException -> L40
            if (r1 == 0) goto L4e
            int r1 = r7.size()     // Catch: java.io.IOException -> L40
            r2 = 1
            if (r1 <= r2) goto L4e
            io.netty.channel.EventLoop r1 = r6.eventLoop()     // Catch: java.io.IOException -> L40
            io.netty.channel.epoll.EpollEventLoop r1 = (io.netty.channel.epoll.EpollEventLoop) r1     // Catch: java.io.IOException -> L40
            io.netty.channel.epoll.NativeDatagramPacketArray r1 = r1.cleanDatagramPacketArray()     // Catch: java.io.IOException -> L40
            r7.forEachFlushedMessage(r1)     // Catch: java.io.IOException -> L40
            int r3 = r1.count()     // Catch: java.io.IOException -> L40
            if (r3 < r2) goto L4e
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r0 = r1.packets()     // Catch: java.io.IOException -> L40
            r1 = 0
            r2 = 0
        L30:
            if (r3 <= 0) goto L0
            io.netty.channel.epoll.LinuxSocket r4 = r6.socket     // Catch: java.io.IOException -> L40
            int r4 = r4.sendmmsg(r0, r2, r3)     // Catch: java.io.IOException -> L40
            if (r4 != 0) goto L42
            int r0 = io.netty.channel.epoll.Native.EPOLLOUT     // Catch: java.io.IOException -> L40
            r6.setFlag(r0)     // Catch: java.io.IOException -> L40
            goto L6a
        L40:
            r0 = move-exception
            goto L6b
        L42:
            r5 = 0
        L43:
            if (r5 >= r4) goto L4b
            r7.remove()     // Catch: java.io.IOException -> L40
            int r5 = r5 + 1
            goto L43
        L4b:
            int r3 = r3 - r4
            int r2 = r2 + r4
            goto L30
        L4e:
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r6.config()     // Catch: java.io.IOException -> L40
            int r1 = r1.getWriteSpinCount()     // Catch: java.io.IOException -> L40
        L56:
            if (r1 <= 0) goto L65
            boolean r2 = r6.doWriteMessage(r0)     // Catch: java.io.IOException -> L40
            if (r2 == 0) goto L62
            r7.remove()     // Catch: java.io.IOException -> L40
            goto L0
        L62:
            int r1 = r1 + (-1)
            goto L56
        L65:
            int r0 = io.netty.channel.epoll.Native.EPOLLOUT     // Catch: java.io.IOException -> L40
            r6.setFlag(r0)     // Catch: java.io.IOException -> L40
        L6a:
            return
        L6b:
            r7.remove(r0)
            goto L0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.socket.DatagramPacket
            if (r0 == 0) goto L23
            r0 = r4
            io.netty.channel.socket.DatagramPacket r0 = (io.netty.channel.socket.DatagramPacket) r0
            java.lang.Object r1 = r0.content()
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            boolean r2 = io.netty.channel.unix.UnixChannelUtil.isBufferCopyNeededForWrite(r1)
            if (r2 == 0) goto L22
            io.netty.channel.socket.DatagramPacket r4 = new io.netty.channel.socket.DatagramPacket
            io.netty.buffer.ByteBuf r1 = r3.newDirectBuffer(r0, r1)
            java.net.SocketAddress r0 = r0.recipient()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r4.<init>(r1, r0)
        L22:
            return r4
        L23:
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L34
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            boolean r0 = io.netty.channel.unix.UnixChannelUtil.isBufferCopyNeededForWrite(r4)
            if (r0 == 0) goto L33
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r4)
        L33:
            return r4
        L34:
            boolean r0 = r4 instanceof io.netty.channel.AddressedEnvelope
            if (r0 == 0) goto L6e
            r0 = r4
            io.netty.channel.AddressedEnvelope r0 = (io.netty.channel.AddressedEnvelope) r0
            java.lang.Object r1 = r0.content()
            boolean r1 = r1 instanceof io.netty.buffer.ByteBuf
            if (r1 == 0) goto L6e
            java.net.SocketAddress r1 = r0.recipient()
            if (r1 == 0) goto L51
            java.net.SocketAddress r1 = r0.recipient()
            boolean r1 = r1 instanceof java.net.InetSocketAddress
            if (r1 == 0) goto L6e
        L51:
            java.lang.Object r4 = r0.content()
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            boolean r1 = io.netty.channel.unix.UnixChannelUtil.isBufferCopyNeededForWrite(r4)
            if (r1 == 0) goto L6d
            io.netty.channel.DefaultAddressedEnvelope r1 = new io.netty.channel.DefaultAddressedEnvelope
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r0, r4)
            java.net.SocketAddress r0 = r0.recipient()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r1.<init>(r4, r0)
            return r1
        L6d:
            return r0
        L6e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.epoll.EpollDatagramChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1c
            io.netty.channel.epoll.EpollDatagramChannelConfig r0 = r1.config
            boolean r0 = r0.getActiveOnOpen()
            if (r0 == 0) goto L16
            boolean r0 = r1.isRegistered()
            if (r0 != 0) goto L1a
        L16:
            boolean r0 = r1.active
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public boolean isConnected() {
            r1 = this;
            boolean r0 = r1.connected
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ boolean isOpen() {
            r1 = this;
            boolean r0 = super.isOpen()
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.joinGroup(r2, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            java.net.InetSocketAddress r0 = r2.localAddress()     // Catch: java.io.IOException -> L12
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.io.IOException -> L12
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.io.IOException -> L12
            r1 = 0
            io.netty.channel.ChannelFuture r3 = r2.joinGroup(r3, r0, r1, r4)     // Catch: java.io.IOException -> L12
            return r3
        L12:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.joinGroup(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4, io.netty.channel.ChannelPromise r5) {
            r1 = this;
            if (r2 == 0) goto L1a
            if (r3 == 0) goto L12
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket     // Catch: java.io.IOException -> Ld
            r0.joinGroup(r2, r3, r4)     // Catch: java.io.IOException -> Ld
            r5.setSuccess()     // Catch: java.io.IOException -> Ld
            return r5
        Ld:
            r2 = move-exception
            r5.setFailure(r2)
            return r5
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "networkInterface"
            r2.<init>(r3)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "multicastAddress"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetSocketAddress r2, java.net.NetworkInterface r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.joinGroup(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetSocketAddress r2, java.net.NetworkInterface r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            java.net.InetAddress r2 = r2.getAddress()
            r0 = 0
            io.netty.channel.ChannelFuture r2 = r1.joinGroup(r2, r3, r0, r4)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.leaveGroup(r2, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            java.net.InetSocketAddress r0 = r2.localAddress()     // Catch: java.io.IOException -> L12
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.io.IOException -> L12
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.io.IOException -> L12
            r1 = 0
            io.netty.channel.ChannelFuture r3 = r2.leaveGroup(r3, r0, r1, r4)     // Catch: java.io.IOException -> L12
            return r3
        L12:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.leaveGroup(r2, r3, r4, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4, io.netty.channel.ChannelPromise r5) {
            r1 = this;
            if (r2 == 0) goto L1a
            if (r3 == 0) goto L12
            io.netty.channel.epoll.LinuxSocket r0 = r1.socket     // Catch: java.io.IOException -> Ld
            r0.leaveGroup(r2, r3, r4)     // Catch: java.io.IOException -> Ld
            r5.setSuccess()     // Catch: java.io.IOException -> Ld
            return r5
        Ld:
            r2 = move-exception
            r5.setFailure(r2)
            return r5
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "networkInterface"
            r2.<init>(r3)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "multicastAddress"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetSocketAddress r2, java.net.NetworkInterface r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.leaveGroup(r2, r3, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetSocketAddress r2, java.net.NetworkInterface r3, io.netty.channel.ChannelPromise r4) {
            r1 = this;
            java.net.InetAddress r2 = r2.getAddress()
            r0 = 0
            io.netty.channel.ChannelFuture r2 = r1.leaveGroup(r2, r3, r0, r4)
            return r2
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress localAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.localAddress()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress localAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.localAddress()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.epoll.EpollDatagramChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.epoll.AbstractEpollChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.epoll.AbstractEpollChannel.AbstractEpollUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe r0 = new io.netty.channel.epoll.EpollDatagramChannel$EpollDatagramChannelUnsafe
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = super.remoteAddress()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ java.net.SocketAddress remoteAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.remoteAddress()
            return r0
    }
}
