package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueueDatagramChannel extends io.netty.channel.kqueue.AbstractKQueueChannel implements io.netty.channel.socket.DatagramChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final io.netty.channel.kqueue.KQueueDatagramChannelConfig config;
    private volatile boolean connected;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KQueueDatagramChannelUnsafe extends io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final /* synthetic */ io.netty.channel.kqueue.KQueueDatagramChannel this$0;

        static {
                return
        }

        KQueueDatagramChannelUnsafe(io.netty.channel.kqueue.KQueueDatagramChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe
        void readReady(io.netty.channel.kqueue.KQueueRecvByteAllocatorHandle r12) {
                r11 = this;
                io.netty.channel.kqueue.KQueueDatagramChannel r0 = r11.this$0
                io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r0.config()
                io.netty.channel.kqueue.KQueueDatagramChannel r1 = r11.this$0
                boolean r1 = r1.shouldBreakReadReady(r0)
                if (r1 == 0) goto L12
                r11.clearReadFilter0()
                return
            L12:
                io.netty.channel.kqueue.KQueueDatagramChannel r1 = r11.this$0
                io.netty.channel.ChannelPipeline r1 = r1.pipeline()
                io.netty.buffer.ByteBufAllocator r2 = r0.getAllocator()
                r12.reset(r0)
                r11.readReadyBefore()
                r3 = 0
                io.netty.channel.kqueue.KQueueDatagramChannel r4 = r11.this$0     // Catch: java.lang.Throwable -> Lef
                boolean r4 = r4.isConnected()     // Catch: java.lang.Throwable -> Lef
            L29:
                io.netty.buffer.ByteBuf r5 = r12.allocate(r2)     // Catch: java.lang.Throwable -> Lef
                int r6 = r5.writableBytes()     // Catch: java.lang.Throwable -> L4a
                r12.attemptedBytesRead(r6)     // Catch: java.lang.Throwable -> L4a
                if (r4 == 0) goto L78
                io.netty.channel.kqueue.KQueueDatagramChannel r6 = r11.this$0     // Catch: java.lang.Throwable -> L4a io.netty.channel.unix.Errors.NativeIoException -> L61
                int r6 = r6.doReadBytes(r5)     // Catch: java.lang.Throwable -> L4a io.netty.channel.unix.Errors.NativeIoException -> L61
                r12.lastBytesRead(r6)     // Catch: java.lang.Throwable -> L4a io.netty.channel.unix.Errors.NativeIoException -> L61
                int r6 = r12.lastBytesRead()     // Catch: java.lang.Throwable -> L4a
                if (r6 > 0) goto L4e
                r5.release()     // Catch: java.lang.Throwable -> L4a
                goto Lfb
            L4a:
                r2 = move-exception
            L4b:
                r3 = r2
                goto Lf3
            L4e:
                io.netty.channel.socket.DatagramPacket r6 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L4a
                java.net.SocketAddress r7 = r11.localAddress()     // Catch: java.lang.Throwable -> L4a
                java.net.InetSocketAddress r7 = (java.net.InetSocketAddress) r7     // Catch: java.lang.Throwable -> L4a
                java.net.SocketAddress r8 = r11.remoteAddress()     // Catch: java.lang.Throwable -> L4a
                java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8     // Catch: java.lang.Throwable -> L4a
                r6.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> L4a
                goto Lde
            L61:
                r2 = move-exception
                int r3 = r2.expectedErr()     // Catch: java.lang.Throwable -> L4a
                int r4 = io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE     // Catch: java.lang.Throwable -> L4a
                if (r3 != r4) goto L77
                java.net.PortUnreachableException r3 = new java.net.PortUnreachableException     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = r2.getMessage()     // Catch: java.lang.Throwable -> L4a
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a
                r3.initCause(r2)     // Catch: java.lang.Throwable -> L4a
                throw r3     // Catch: java.lang.Throwable -> L4a
            L77:
                throw r2     // Catch: java.lang.Throwable -> L4a
            L78:
                boolean r6 = r5.hasMemoryAddress()     // Catch: java.lang.Throwable -> L4a
                if (r6 == 0) goto L93
                io.netty.channel.kqueue.KQueueDatagramChannel r6 = r11.this$0     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.kqueue.BsdSocket r6 = r6.socket     // Catch: java.lang.Throwable -> L4a
                long r7 = r5.memoryAddress()     // Catch: java.lang.Throwable -> L4a
                int r9 = r5.writerIndex()     // Catch: java.lang.Throwable -> L4a
                int r10 = r5.capacity()     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.unix.DatagramSocketAddress r6 = r6.recvFromAddress(r7, r9, r10)     // Catch: java.lang.Throwable -> L4a
                goto Laf
            L93:
                int r6 = r5.writerIndex()     // Catch: java.lang.Throwable -> L4a
                int r7 = r5.writableBytes()     // Catch: java.lang.Throwable -> L4a
                java.nio.ByteBuffer r6 = r5.internalNioBuffer(r6, r7)     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.kqueue.KQueueDatagramChannel r7 = r11.this$0     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.kqueue.BsdSocket r7 = r7.socket     // Catch: java.lang.Throwable -> L4a
                int r8 = r6.position()     // Catch: java.lang.Throwable -> L4a
                int r9 = r6.limit()     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.unix.DatagramSocketAddress r6 = r7.recvFrom(r6, r8, r9)     // Catch: java.lang.Throwable -> L4a
            Laf:
                if (r6 != 0) goto Lb9
                r2 = -1
                r12.lastBytesRead(r2)     // Catch: java.lang.Throwable -> L4a
                r5.release()     // Catch: java.lang.Throwable -> L4a
                goto Lfb
            Lb9:
                io.netty.channel.unix.DatagramSocketAddress r7 = r6.localAddress()     // Catch: java.lang.Throwable -> L4a
                if (r7 != 0) goto Lc5
                java.net.SocketAddress r7 = r11.localAddress()     // Catch: java.lang.Throwable -> L4a
                java.net.InetSocketAddress r7 = (java.net.InetSocketAddress) r7     // Catch: java.lang.Throwable -> L4a
            Lc5:
                int r8 = r6.receivedAmount()     // Catch: java.lang.Throwable -> L4a
                r12.lastBytesRead(r8)     // Catch: java.lang.Throwable -> L4a
                int r8 = r5.writerIndex()     // Catch: java.lang.Throwable -> L4a
                int r9 = r12.lastBytesRead()     // Catch: java.lang.Throwable -> L4a
                int r8 = r8 + r9
                r5.writerIndex(r8)     // Catch: java.lang.Throwable -> L4a
                io.netty.channel.socket.DatagramPacket r8 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L4a
                r8.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L4a
                r6 = r8
            Lde:
                r7 = 1
                r12.incMessagesRead(r7)     // Catch: java.lang.Throwable -> L4a
                r7 = 0
                r11.readPending = r7     // Catch: java.lang.Throwable -> L4a
                r1.fireChannelRead(r6)     // Catch: java.lang.Throwable -> L4a
                boolean r5 = r12.continueReading()     // Catch: java.lang.Throwable -> Lef
                if (r5 != 0) goto L29
                goto Lfb
            Lef:
                r2 = move-exception
                r5 = r3
                goto L4b
            Lf3:
                if (r5 == 0) goto Lfb
                r5.release()     // Catch: java.lang.Throwable -> Lf9
                goto Lfb
            Lf9:
                r12 = move-exception
                goto L10a
            Lfb:
                r12.readComplete()     // Catch: java.lang.Throwable -> Lf9
                r1.fireChannelReadComplete()     // Catch: java.lang.Throwable -> Lf9
                if (r3 == 0) goto L106
                r1.fireExceptionCaught(r3)     // Catch: java.lang.Throwable -> Lf9
            L106:
                r11.readReadyFinally(r0)
                return
            L10a:
                r11.readReadyFinally(r0)
                throw r12
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 1
            r0.<init>(r1)
            io.netty.channel.kqueue.KQueueDatagramChannel.METADATA = r0
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
            io.netty.channel.kqueue.KQueueDatagramChannel.EXPECTED_TYPES = r0
            return
    }

    public KQueueDatagramChannel() {
            r3 = this;
            io.netty.channel.kqueue.BsdSocket r0 = io.netty.channel.kqueue.BsdSocket.newSocketDgram()
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = new io.netty.channel.kqueue.KQueueDatagramChannelConfig
            r0.<init>(r3)
            r3.config = r0
            return
    }

    public KQueueDatagramChannel(int r2) {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            r0.<init>(r2)
            r2 = 1
            r1.<init>(r0, r2)
            return
    }

    KQueueDatagramChannel(io.netty.channel.kqueue.BsdSocket r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r2 = new io.netty.channel.kqueue.KQueueDatagramChannelConfig
            r2.<init>(r1)
            r1.config = r2
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
            io.netty.channel.kqueue.BsdSocket r12 = r11.socket
            int r1 = r0.readerIndex()
            int r0 = r0.writerIndex()
            int r12 = r12.writeAddress(r5, r1, r0)
            goto La5
        L3b:
            io.netty.channel.kqueue.BsdSocket r4 = r11.socket
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
            io.netty.channel.kqueue.KQueueEventLoop r1 = (io.netty.channel.kqueue.KQueueEventLoop) r1
            io.netty.channel.unix.IovArray r1 = r1.cleanArray()
            r1.add(r0)
            int r7 = r1.count()
            if (r12 != 0) goto L76
            io.netty.channel.kqueue.BsdSocket r12 = r11.socket
            long r0 = r1.memoryAddress(r3)
            long r0 = r12.writevAddresses(r0, r7)
            goto Lbe
        L76:
            io.netty.channel.kqueue.BsdSocket r4 = r11.socket
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
            io.netty.channel.kqueue.BsdSocket r12 = r11.socket
            int r0 = r6.position()
            int r1 = r6.limit()
            int r12 = r12.write(r6, r0, r1)
        La5:
            long r0 = (long) r12
            goto Lbe
        La7:
            io.netty.channel.kqueue.BsdSocket r5 = r11.socket
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.kqueue.KQueueChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.kqueue.KQueueDatagramChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig config() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) throws java.lang.Exception {
            r0 = this;
            super.doBind(r1)
            r1 = 1
            r0.active = r1
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            super.doClose()
            r0 = 0
            r1.connected = r0
            return
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            r0.disconnect()
            r0 = 0
            r1.active = r0
            r1.connected = r0
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r4) throws java.lang.Exception {
            r3 = this;
        L0:
            java.lang.Object r0 = r4.current()
            if (r0 != 0) goto Lb
            r4 = 0
            r3.writeFilter(r4)
            goto L28
        Lb:
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r1 = r3.config()     // Catch: java.io.IOException -> L1f
            int r1 = r1.getWriteSpinCount()     // Catch: java.io.IOException -> L1f
        L13:
            if (r1 <= 0) goto L24
            boolean r2 = r3.doWriteMessage(r0)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L21
            r4.remove()     // Catch: java.io.IOException -> L1f
            goto L0
        L1f:
            r0 = move-exception
            goto L29
        L21:
            int r1 = r1 + (-1)
            goto L13
        L24:
            r0 = 1
            r3.writeFilter(r0)     // Catch: java.io.IOException -> L1f
        L28:
            return
        L29:
            r4.remove(r0)
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
            java.lang.String r4 = io.netty.channel.kqueue.KQueueDatagramChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            io.netty.channel.kqueue.BsdSocket r0 = r1.socket
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1c
            io.netty.channel.kqueue.KQueueDatagramChannelConfig r0 = r1.config
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
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
            java.net.InetSocketAddress r0 = r2.localAddress()     // Catch: java.net.SocketException -> L12
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.net.SocketException -> L12
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.net.SocketException -> L12
            r1 = 0
            io.netty.channel.ChannelFuture r3 = r2.joinGroup(r3, r0, r1, r4)     // Catch: java.net.SocketException -> L12
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
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            if (r1 == 0) goto L17
            if (r2 == 0) goto Lf
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Multicast not supported"
            r1.<init>(r2)
            r4.setFailure(r1)
            return r4
        Lf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "networkInterface"
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "multicastAddress"
            r1.<init>(r2)
            throw r1
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
            java.net.InetSocketAddress r0 = r2.localAddress()     // Catch: java.net.SocketException -> L12
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.net.SocketException -> L12
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.net.SocketException -> L12
            r1 = 0
            io.netty.channel.ChannelFuture r3 = r2.leaveGroup(r3, r0, r1, r4)     // Catch: java.net.SocketException -> L12
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
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            if (r1 == 0) goto L17
            if (r2 == 0) goto Lf
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Multicast not supported"
            r1.<init>(r2)
            r4.setFailure(r1)
            return r4
        Lf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "networkInterface"
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "multicastAddress"
            r1.<init>(r2)
            throw r1
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

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.kqueue.KQueueDatagramChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected /* bridge */ /* synthetic */ io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe r0 = r1.newUnsafe()
            return r0
    }

    @Override // io.netty.channel.kqueue.AbstractKQueueChannel, io.netty.channel.AbstractChannel
    protected io.netty.channel.kqueue.AbstractKQueueChannel.AbstractKQueueUnsafe newUnsafe() {
            r1 = this;
            io.netty.channel.kqueue.KQueueDatagramChannel$KQueueDatagramChannelUnsafe r0 = new io.netty.channel.kqueue.KQueueDatagramChannel$KQueueDatagramChannelUnsafe
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
