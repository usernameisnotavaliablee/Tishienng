package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioDatagramChannel extends io.netty.channel.oio.AbstractOioMessageChannel implements io.netty.channel.socket.DatagramChannel {
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.socket.oio.OioDatagramChannelConfig config;
    private final java.net.MulticastSocket socket;
    private final java.net.DatagramPacket tmpPacket;

    static {
            java.lang.Class<io.netty.channel.socket.oio.OioDatagramChannel> r0 = io.netty.channel.socket.oio.OioDatagramChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.oio.OioDatagramChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 1
            r0.<init>(r1)
            io.netty.channel.socket.oio.OioDatagramChannel.METADATA = r0
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
            io.netty.channel.socket.oio.OioDatagramChannel.EXPECTED_TYPES = r0
            return
    }

    public OioDatagramChannel() {
            r1 = this;
            java.net.MulticastSocket r0 = newSocket()
            r1.<init>(r0)
            return
    }

    public OioDatagramChannel(java.net.MulticastSocket r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            byte[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            r2 = 0
            r0.<init>(r1, r2)
            r3.tmpPacket = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.setSoTimeout(r0)     // Catch: java.lang.Throwable -> L20 java.net.SocketException -> L22
            r4.setBroadcast(r2)     // Catch: java.lang.Throwable -> L20 java.net.SocketException -> L22
            r3.socket = r4
            io.netty.channel.socket.oio.DefaultOioDatagramChannelConfig r0 = new io.netty.channel.socket.oio.DefaultOioDatagramChannelConfig
            r0.<init>(r3, r4)
            r3.config = r0
            return
        L20:
            r0 = move-exception
            goto L2b
        L22:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Failed to configure the datagram socket timeout."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2b:
            r4.close()
            throw r0
    }

    private void ensureBound() {
            r3 = this;
            boolean r0 = r3.isActive()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<io.netty.channel.socket.DatagramChannel> r2 = io.netty.channel.socket.DatagramChannel.class
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " must be bound to join a group."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static java.net.MulticastSocket newSocket() {
            java.net.MulticastSocket r0 = new java.net.MulticastSocket     // Catch: java.lang.Exception -> L7
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "failed to create a new socket"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.InetAddress r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            io.netty.channel.ChannelFuture r1 = r0.newFailedFuture(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.InetAddress r2, io.netty.channel.ChannelPromise r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            r3.setFailure(r1)
            return r3
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            io.netty.channel.ChannelFuture r1 = r0.newFailedFuture(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture block(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            r4.setFailure(r1)
            return r4
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
            io.netty.channel.socket.oio.OioDatagramChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket
            r0.bind(r2)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket
            r0.close()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r3, java.net.SocketAddress r4) throws java.lang.Exception {
            r2 = this;
            if (r4 == 0) goto L7
            java.net.MulticastSocket r0 = r2.socket
            r0.bind(r4)
        L7:
            java.net.MulticastSocket r4 = r2.socket     // Catch: java.lang.Throwable -> Ld
            r4.connect(r3)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            java.net.MulticastSocket r4 = r2.socket     // Catch: java.lang.Throwable -> L14
            r4.close()     // Catch: java.lang.Throwable -> L14
            goto L1c
        L14:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.oio.OioDatagramChannel.logger
            java.lang.String r1 = "Failed to close a socket."
            r0.warn(r1, r4)
        L1c:
            throw r3
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket
            r0.disconnect()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r7 = this;
            io.netty.channel.socket.DatagramChannelConfig r0 = r7.config()
            io.netty.channel.Channel$Unsafe r1 = r7.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r1 = r1.recvBufAllocHandle()
            io.netty.buffer.ByteBufAllocator r0 = r0.getAllocator()
            int r2 = r1.guess()
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer(r2)
            r2 = -1
            java.net.DatagramPacket r3 = r7.tmpPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r4 = 0
            r3.setAddress(r4)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.DatagramPacket r3 = r7.tmpPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            byte[] r4 = r0.array()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            int r5 = r0.arrayOffset()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            int r6 = r0.capacity()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r3.setData(r4, r5, r6)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.MulticastSocket r3 = r7.socket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.DatagramPacket r4 = r7.tmpPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r3.receive(r4)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.DatagramPacket r3 = r7.tmpPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.SocketAddress r3 = r3.getSocketAddress()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.DatagramPacket r4 = r7.tmpPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            int r4 = r4.getLength()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r1.lastBytesRead(r4)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            io.netty.channel.socket.DatagramPacket r4 = new io.netty.channel.socket.DatagramPacket     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            int r1 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            io.netty.buffer.ByteBuf r1 = r0.writerIndex(r1)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            java.net.InetSocketAddress r5 = r7.localAddress()     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r4.<init>(r1, r5, r3)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r8.add(r4)     // Catch: java.lang.Throwable -> L5e java.net.SocketException -> L60 java.net.SocketTimeoutException -> L86
            r8 = 1
            return r8
        L5e:
            r8 = move-exception
            goto L62
        L60:
            r8 = move-exception
            goto L6b
        L62:
            io.netty.util.internal.PlatformDependent.throwException(r8)     // Catch: java.lang.Throwable -> L69
            r0.release()
            return r2
        L69:
            r8 = move-exception
            goto L82
        L6b:
            java.lang.String r1 = r8.getMessage()     // Catch: java.lang.Throwable -> L69
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "socket closed"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L81
            r0.release()
            return r2
        L81:
            throw r8     // Catch: java.lang.Throwable -> L69
        L82:
            r0.release()
            throw r8
        L86:
            r0.release()
            r8 = 0
            return r8
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r6) throws java.lang.Exception {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.current()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0 instanceof io.netty.channel.AddressedEnvelope
            r2 = 0
            if (r1 == 0) goto L19
            io.netty.channel.AddressedEnvelope r0 = (io.netty.channel.AddressedEnvelope) r0
            java.net.SocketAddress r1 = r0.recipient()
            java.lang.Object r0 = r0.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            goto L1c
        L19:
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            r1 = r2
        L1c:
            int r3 = r0.readableBytes()
            if (r1 == 0) goto L2a
            java.net.DatagramPacket r2 = r5.tmpPacket     // Catch: java.lang.Exception -> L28
            r2.setSocketAddress(r1)     // Catch: java.lang.Exception -> L28
            goto L35
        L28:
            r0 = move-exception
            goto L6c
        L2a:
            boolean r1 = r5.isConnected()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L66
            java.net.DatagramPacket r1 = r5.tmpPacket     // Catch: java.lang.Exception -> L28
            r1.setAddress(r2)     // Catch: java.lang.Exception -> L28
        L35:
            boolean r1 = r0.hasArray()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L4e
            java.net.DatagramPacket r1 = r5.tmpPacket     // Catch: java.lang.Exception -> L28
            byte[] r2 = r0.array()     // Catch: java.lang.Exception -> L28
            int r4 = r0.arrayOffset()     // Catch: java.lang.Exception -> L28
            int r0 = r0.readerIndex()     // Catch: java.lang.Exception -> L28
            int r4 = r4 + r0
            r1.setData(r2, r4, r3)     // Catch: java.lang.Exception -> L28
            goto L5b
        L4e:
            java.net.DatagramPacket r1 = r5.tmpPacket     // Catch: java.lang.Exception -> L28
            int r2 = r0.readerIndex()     // Catch: java.lang.Exception -> L28
            byte[] r0 = io.netty.buffer.ByteBufUtil.getBytes(r0, r2, r3)     // Catch: java.lang.Exception -> L28
            r1.setData(r0)     // Catch: java.lang.Exception -> L28
        L5b:
            java.net.MulticastSocket r0 = r5.socket     // Catch: java.lang.Exception -> L28
            java.net.DatagramPacket r1 = r5.tmpPacket     // Catch: java.lang.Exception -> L28
            r0.send(r1)     // Catch: java.lang.Exception -> L28
            r6.remove()     // Catch: java.lang.Exception -> L28
            goto L0
        L66:
            java.nio.channels.NotYetConnectedException r0 = new java.nio.channels.NotYetConnectedException     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            throw r0     // Catch: java.lang.Exception -> L28
        L6c:
            r6.remove(r0)
            goto L0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.socket.DatagramPacket
            if (r0 != 0) goto L39
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L9
            return r4
        L9:
            boolean r0 = r4 instanceof io.netty.channel.AddressedEnvelope
            if (r0 == 0) goto L19
            r0 = r4
            io.netty.channel.AddressedEnvelope r0 = (io.netty.channel.AddressedEnvelope) r0
            java.lang.Object r0 = r0.content()
            boolean r0 = r0 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L19
            return r4
        L19:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.socket.oio.OioDatagramChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L39:
            return r4
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L26
            io.netty.channel.socket.oio.OioDatagramChannelConfig r0 = r2.config
            io.netty.channel.ChannelOption<java.lang.Boolean> r1 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            java.lang.Object r0 = r0.getOption(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1c
            boolean r0 = r2.isRegistered()
            if (r0 != 0) goto L24
        L1c:
            java.net.MulticastSocket r0 = r2.socket
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public boolean isConnected() {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket
            boolean r0 = r0.isConnected()
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket
            boolean r0 = r0.isClosed()
            r0 = r0 ^ 1
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
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            r1.ensureBound()
            java.net.MulticastSocket r0 = r1.socket     // Catch: java.io.IOException -> Lc
            r0.joinGroup(r2)     // Catch: java.io.IOException -> Lc
            r3.setSuccess()     // Catch: java.io.IOException -> Lc
            return r3
        Lc:
            r2 = move-exception
            r3.setFailure(r2)
            return r3
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            io.netty.channel.ChannelFuture r1 = r0.newFailedFuture(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture joinGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            r4.setFailure(r1)
            return r4
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
            r1.ensureBound()
            java.net.MulticastSocket r0 = r1.socket     // Catch: java.io.IOException -> Lc
            r0.joinGroup(r2, r3)     // Catch: java.io.IOException -> Lc
            r4.setSuccess()     // Catch: java.io.IOException -> Lc
            return r4
        Lc:
            r2 = move-exception
            r4.setFailure(r2)
            return r4
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.leaveGroup(r2, r0)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            java.net.MulticastSocket r0 = r1.socket     // Catch: java.io.IOException -> L9
            r0.leaveGroup(r2)     // Catch: java.io.IOException -> L9
            r3.setSuccess()     // Catch: java.io.IOException -> L9
            return r3
        L9:
            r2 = move-exception
            r3.setFailure(r2)
            return r3
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            io.netty.channel.ChannelFuture r1 = r0.newFailedFuture(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannel
    public io.netty.channel.ChannelFuture leaveGroup(java.net.InetAddress r1, java.net.NetworkInterface r2, java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            r4.setFailure(r1)
            return r4
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
            java.net.MulticastSocket r0 = r1.socket     // Catch: java.io.IOException -> L9
            r0.leaveGroup(r2, r3)     // Catch: java.io.IOException -> L9
            r4.setSuccess()     // Catch: java.io.IOException -> L9
            return r4
        L9:
            r2 = move-exception
            r4.setFailure(r2)
            return r4
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
            java.net.MulticastSocket r0 = r1.socket
            java.net.SocketAddress r0 = r0.getLocalSocketAddress()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.socket.oio.OioDatagramChannel.METADATA
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
            java.net.MulticastSocket r0 = r1.socket
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()
            return r0
    }
}
