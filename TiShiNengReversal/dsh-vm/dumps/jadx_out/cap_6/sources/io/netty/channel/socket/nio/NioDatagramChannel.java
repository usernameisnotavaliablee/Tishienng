package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NioDatagramChannel extends io.netty.channel.nio.AbstractNioMessageChannel implements io.netty.channel.socket.DatagramChannel {
    private static final java.nio.channels.spi.SelectorProvider DEFAULT_SELECTOR_PROVIDER = null;
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final io.netty.channel.socket.DatagramChannelConfig config;
    private java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> memberships;

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 1
            r0.<init>(r1)
            io.netty.channel.socket.nio.NioDatagramChannel.METADATA = r0
            java.nio.channels.spi.SelectorProvider r0 = java.nio.channels.spi.SelectorProvider.provider()
            io.netty.channel.socket.nio.NioDatagramChannel.DEFAULT_SELECTOR_PROVIDER = r0
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
            java.lang.Class<java.net.SocketAddress> r1 = java.net.SocketAddress.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ">, "
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.socket.nio.NioDatagramChannel.EXPECTED_TYPES = r0
            return
    }

    public NioDatagramChannel() {
            r1 = this;
            java.nio.channels.spi.SelectorProvider r0 = io.netty.channel.socket.nio.NioDatagramChannel.DEFAULT_SELECTOR_PROVIDER
            java.nio.channels.DatagramChannel r0 = newSocket(r0)
            r1.<init>(r0)
            return
    }

    public NioDatagramChannel(io.netty.channel.socket.InternetProtocolFamily r2) {
            r1 = this;
            java.nio.channels.spi.SelectorProvider r0 = io.netty.channel.socket.nio.NioDatagramChannel.DEFAULT_SELECTOR_PROVIDER
            java.nio.channels.DatagramChannel r2 = newSocket(r0, r2)
            r1.<init>(r2)
            return
    }

    public NioDatagramChannel(java.nio.channels.DatagramChannel r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r3, r1)
            io.netty.channel.socket.nio.NioDatagramChannelConfig r0 = new io.netty.channel.socket.nio.NioDatagramChannelConfig
            r0.<init>(r2, r3)
            r2.config = r0
            return
    }

    public NioDatagramChannel(java.nio.channels.spi.SelectorProvider r1) {
            r0 = this;
            java.nio.channels.DatagramChannel r1 = newSocket(r1)
            r0.<init>(r1)
            return
    }

    public NioDatagramChannel(java.nio.channels.spi.SelectorProvider r1, io.netty.channel.socket.InternetProtocolFamily r2) {
            r0 = this;
            java.nio.channels.DatagramChannel r1 = newSocket(r1, r2)
            r0.<init>(r1)
            return
    }

    private static void checkJavaVersion() {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L8
            return
        L8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Only supported on java 7+."
            r0.<init>(r1)
            throw r0
    }

    private void doBind0(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lf
            java.nio.channels.DatagramChannel r0 = r2.mo176javaChannel()
            io.netty.util.internal.SocketUtils.bind(r0, r3)
            return
        Lf:
            java.nio.channels.DatagramChannel r0 = r2.mo176javaChannel()
            java.net.DatagramSocket r0 = r0.socket()
            r0.bind(r3)
            return
    }

    private static boolean isSingleDirectBuffer(io.netty.buffer.ByteBuf r1) {
            boolean r0 = r1.isDirect()
            if (r0 == 0) goto Le
            int r1 = r1.nioBufferCount()
            r0 = 1
            if (r1 != r0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    private static java.nio.channels.DatagramChannel newSocket(java.nio.channels.spi.SelectorProvider r2) {
            java.nio.channels.DatagramChannel r2 = r2.openDatagramChannel()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "Failed to open a socket."
            r0.<init>(r1, r2)
            throw r0
    }

    private static java.nio.channels.DatagramChannel newSocket(java.nio.channels.spi.SelectorProvider r1, io.netty.channel.socket.InternetProtocolFamily r2) {
            if (r2 != 0) goto L7
            java.nio.channels.DatagramChannel r1 = newSocket(r1)
            return r1
        L7:
            checkJavaVersion()
            java.net.ProtocolFamily r2 = io.netty.channel.socket.nio.ProtocolFamilyConverter.convert(r2)     // Catch: java.io.IOException -> L13
            java.nio.channels.DatagramChannel r1 = io.netty.channel.socket.nio.h.a(r1, r2)     // Catch: java.io.IOException -> L13
            return r1
        L13:
            r1 = move-exception
            io.netty.channel.ChannelException r2 = new io.netty.channel.ChannelException
            java.lang.String r0 = "Failed to open a socket."
            r2.<init>(r0, r1)
            throw r2
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
            java.net.InetSocketAddress r0 = r1.localAddress()     // Catch: java.net.SocketException -> L11
            java.net.InetAddress r0 = r0.getAddress()     // Catch: java.net.SocketException -> L11
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)     // Catch: java.net.SocketException -> L11
            io.netty.channel.ChannelFuture r2 = r1.block(r2, r0, r3, r4)     // Catch: java.net.SocketException -> L11
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
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r3, java.net.NetworkInterface r4, java.net.InetAddress r5, io.netty.channel.ChannelPromise r6) {
            r2 = this;
            checkJavaVersion()
            if (r3 == 0) goto L52
            if (r5 == 0) goto L4a
            if (r4 == 0) goto L42
            monitor-enter(r2)
            java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> r0 = r2.memberships     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L3b
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L34
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L34
        L18:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L34
            java.nio.channels.MembershipKey r0 = io.netty.channel.socket.nio.i.a(r0)     // Catch: java.lang.Throwable -> L34
            java.net.NetworkInterface r1 = io.netty.channel.socket.nio.j.a(r0)     // Catch: java.lang.Throwable -> L34
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L18
            io.netty.channel.socket.nio.m.a(r0, r5)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            goto L18
        L34:
            r3 = move-exception
            goto L40
        L36:
            r0 = move-exception
            r6.setFailure(r0)     // Catch: java.lang.Throwable -> L34
            goto L18
        L3b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            r6.setSuccess()
            return r6
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r3
        L42:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "networkInterface"
            r3.<init>(r4)
            throw r3
        L4a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "sourceToBlock"
            r3.<init>(r4)
            throw r3
        L52:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "multicastAddress"
            r3.<init>(r4)
            throw r3
    }

    void clearReadPending0() {
            r0 = this;
            r0.clearReadPending()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean closeOnReadError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.net.SocketException
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = super.closeOnReadError(r2)
            return r2
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.DatagramChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.socket.DatagramChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.DatagramChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean continueOnWriteError() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) throws java.lang.Exception {
            r0 = this;
            r0.doBind0(r1)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
            r0.close()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected boolean doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            if (r2 == 0) goto L5
            r0.doBind0(r2)
        L5:
            java.nio.channels.DatagramChannel r2 = r0.mo176javaChannel()     // Catch: java.lang.Throwable -> Le
            r2.connect(r1)     // Catch: java.lang.Throwable -> Le
            r1 = 1
            return r1
        Le:
            r1 = move-exception
            r0.doClose()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
            r0.disconnect()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected void doFinishConnect() throws java.lang.Exception {
            r1 = this;
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r5 = this;
            java.nio.channels.DatagramChannel r0 = r5.mo176javaChannel()
            io.netty.channel.socket.DatagramChannelConfig r1 = r5.config()
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r2 = r5.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r2 = r2.recvBufAllocHandle()
            io.netty.buffer.ByteBufAllocator r1 = r1.getAllocator()
            io.netty.buffer.ByteBuf r1 = r2.allocate(r1)
            int r3 = r1.writableBytes()
            r2.attemptedBytesRead(r3)
            int r3 = r1.writerIndex()     // Catch: java.lang.Throwable -> L5f
            int r4 = r1.writableBytes()     // Catch: java.lang.Throwable -> L5f
            java.nio.ByteBuffer r3 = r1.internalNioBuffer(r3, r4)     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.position()     // Catch: java.lang.Throwable -> L5f
            java.net.SocketAddress r0 = r0.receive(r3)     // Catch: java.lang.Throwable -> L5f
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L3c
            r1.release()
            r6 = 0
            return r6
        L3c:
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 - r4
            r2.lastBytesRead(r3)     // Catch: java.lang.Throwable -> L5f
            io.netty.channel.socket.DatagramPacket r3 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L5f
            int r4 = r1.writerIndex()     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.lastBytesRead()     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + r2
            io.netty.buffer.ByteBuf r2 = r1.writerIndex(r4)     // Catch: java.lang.Throwable -> L5f
            java.net.InetSocketAddress r4 = r5.localAddress()     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2, r4, r0)     // Catch: java.lang.Throwable -> L5f
            r6.add(r3)     // Catch: java.lang.Throwable -> L5f
            r6 = 1
            return r6
        L5f:
            r6 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r6)     // Catch: java.lang.Throwable -> L68
            r1.release()
            r6 = -1
            return r6
        L68:
            r6 = move-exception
            r1.release()
            throw r6
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean doWriteMessage(java.lang.Object r4, io.netty.channel.ChannelOutboundBuffer r5) throws java.lang.Exception {
            r3 = this;
            boolean r5 = r4 instanceof io.netty.channel.AddressedEnvelope
            if (r5 == 0) goto L11
            io.netty.channel.AddressedEnvelope r4 = (io.netty.channel.AddressedEnvelope) r4
            java.net.SocketAddress r5 = r4.recipient()
            java.lang.Object r4 = r4.content()
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            goto L14
        L11:
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            r5 = 0
        L14:
            int r0 = r4.readableBytes()
            r1 = 1
            if (r0 != 0) goto L1c
            return r1
        L1c:
            int r2 = r4.nioBufferCount()
            if (r2 != r1) goto L2b
            int r2 = r4.readerIndex()
            java.nio.ByteBuffer r4 = r4.internalNioBuffer(r2, r0)
            goto L33
        L2b:
            int r2 = r4.readerIndex()
            java.nio.ByteBuffer r4 = r4.nioBuffer(r2, r0)
        L33:
            if (r5 == 0) goto L3e
            java.nio.channels.DatagramChannel r0 = r3.mo176javaChannel()
            int r4 = r0.send(r4, r5)
            goto L46
        L3e:
            java.nio.channels.DatagramChannel r5 = r3.mo176javaChannel()
            int r4 = r5.write(r4)
        L46:
            if (r4 <= 0) goto L49
            return r1
        L49:
            r4 = 0
            return r4
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.socket.DatagramPacket
            if (r0 == 0) goto L23
            io.netty.channel.socket.DatagramPacket r4 = (io.netty.channel.socket.DatagramPacket) r4
            java.lang.Object r0 = r4.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            boolean r1 = isSingleDirectBuffer(r0)
            if (r1 == 0) goto L13
            return r4
        L13:
            io.netty.channel.socket.DatagramPacket r1 = new io.netty.channel.socket.DatagramPacket
            io.netty.buffer.ByteBuf r0 = r3.newDirectBuffer(r4, r0)
            java.net.SocketAddress r4 = r4.recipient()
            java.net.InetSocketAddress r4 = (java.net.InetSocketAddress) r4
            r1.<init>(r0, r4)
            return r1
        L23:
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L35
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            boolean r0 = isSingleDirectBuffer(r4)
            if (r0 == 0) goto L30
            return r4
        L30:
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r4)
            return r4
        L35:
            boolean r0 = r4 instanceof io.netty.channel.AddressedEnvelope
            if (r0 == 0) goto L5f
            r0 = r4
            io.netty.channel.AddressedEnvelope r0 = (io.netty.channel.AddressedEnvelope) r0
            java.lang.Object r1 = r0.content()
            boolean r1 = r1 instanceof io.netty.buffer.ByteBuf
            if (r1 == 0) goto L5f
            java.lang.Object r4 = r0.content()
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            boolean r1 = isSingleDirectBuffer(r4)
            if (r1 == 0) goto L51
            return r0
        L51:
            io.netty.channel.DefaultAddressedEnvelope r1 = new io.netty.channel.DefaultAddressedEnvelope
            io.netty.buffer.ByteBuf r4 = r3.newDirectBuffer(r0, r4)
            java.net.SocketAddress r0 = r0.recipient()
            r1.<init>(r4, r0)
            return r1
        L5f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.socket.nio.NioDatagramChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r3 = this;
            java.nio.channels.DatagramChannel r0 = r3.mo176javaChannel()
            boolean r1 = r0.isOpen()
            if (r1 == 0) goto L2c
            io.netty.channel.socket.DatagramChannelConfig r1 = r3.config
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            java.lang.Object r1 = r1.getOption(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L20
            boolean r1 = r3.isRegistered()
            if (r1 != 0) goto L2a
        L20:
            java.net.DatagramSocket r0 = r0.socket()
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            return r0
        L2c:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public boolean isConnected() {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
            boolean r0 = r0.isConnected()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected java.nio.channels.DatagramChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            java.nio.channels.DatagramChannel r0 = (java.nio.channels.DatagramChannel) r0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
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
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r2, java.net.NetworkInterface r3, java.net.InetAddress r4, io.netty.channel.ChannelPromise r5) {
            r1 = this;
            checkJavaVersion()
            if (r2 == 0) goto L54
            if (r3 == 0) goto L4c
            if (r4 != 0) goto L14
            java.nio.channels.DatagramChannel r4 = r1.mo176javaChannel()     // Catch: java.lang.Throwable -> L12
            java.nio.channels.MembershipKey r3 = r4.join(r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L1c
        L12:
            r2 = move-exception
            goto L48
        L14:
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()     // Catch: java.lang.Throwable -> L12
            java.nio.channels.MembershipKey r3 = r0.join(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L12
            java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> r4 = r1.memberships     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L2c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            r1.memberships = r4     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            goto L32
        L2a:
            r2 = move-exception
            goto L46
        L2c:
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L2a
        L32:
            if (r4 != 0) goto L3e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r4.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> r0 = r1.memberships     // Catch: java.lang.Throwable -> L2a
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L2a
        L3e:
            r4.add(r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            r5.setSuccess()     // Catch: java.lang.Throwable -> L12
            return r5
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L12
        L48:
            r5.setFailure(r2)
            return r5
        L4c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "networkInterface"
            r2.<init>(r3)
            throw r2
        L54:
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
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r5, java.net.NetworkInterface r6, java.net.InetAddress r7, io.netty.channel.ChannelPromise r8) {
            r4 = this;
            checkJavaVersion()
            if (r5 == 0) goto L68
            if (r6 == 0) goto L60
            monitor-enter(r4)
            java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> r0 = r4.memberships     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L39
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L59
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L39
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L39
            java.nio.channels.MembershipKey r2 = io.netty.channel.socket.nio.i.a(r2)     // Catch: java.lang.Throwable -> L39
            java.net.NetworkInterface r3 = io.netty.channel.socket.nio.j.a(r2)     // Catch: java.lang.Throwable -> L39
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L18
            if (r7 != 0) goto L3b
            java.net.InetAddress r3 = io.netty.channel.socket.nio.k.a(r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L47
            goto L3b
        L39:
            r5 = move-exception
            goto L5e
        L3b:
            if (r7 == 0) goto L18
            java.net.InetAddress r3 = io.netty.channel.socket.nio.k.a(r2)     // Catch: java.lang.Throwable -> L39
            boolean r3 = r7.equals(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L18
        L47:
            io.netty.channel.socket.nio.l.a(r2)     // Catch: java.lang.Throwable -> L39
            r1.remove()     // Catch: java.lang.Throwable -> L39
            goto L18
        L4e:
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L59
            java.util.Map<java.net.InetAddress, java.util.List<java.nio.channels.MembershipKey>> r6 = r4.memberships     // Catch: java.lang.Throwable -> L39
            r6.remove(r5)     // Catch: java.lang.Throwable -> L39
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
            r8.setSuccess()
            return r8
        L5e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
            throw r5
        L60:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "networkInterface"
            r5.<init>(r6)
            throw r5
        L68:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "multicastAddress"
            r5.<init>(r6)
            throw r5
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

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
            java.net.DatagramSocket r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getLocalSocketAddress()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.socket.nio.NioDatagramChannel.METADATA
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

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            java.nio.channels.DatagramChannel r0 = r1.mo176javaChannel()
            java.net.DatagramSocket r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    @java.lang.Deprecated
    protected void setReadPending(boolean r1) {
            r0 = this;
            super.setReadPending(r1)
            return
    }
}
