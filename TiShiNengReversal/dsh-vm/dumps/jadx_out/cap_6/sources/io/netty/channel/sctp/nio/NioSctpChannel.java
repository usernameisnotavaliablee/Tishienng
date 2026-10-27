package io.netty.channel.sctp.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioSctpChannel extends io.netty.channel.nio.AbstractNioMessageChannel implements io.netty.channel.sctp.SctpChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.sctp.SctpChannelConfig config;
    private final com.sun.nio.sctp.NotificationHandler<?> notificationHandler;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class NioSctpChannelConfig extends io.netty.channel.sctp.DefaultSctpChannelConfig {
        final /* synthetic */ io.netty.channel.sctp.nio.NioSctpChannel this$0;

        private NioSctpChannelConfig(io.netty.channel.sctp.nio.NioSctpChannel r1, io.netty.channel.sctp.nio.NioSctpChannel r2, com.sun.nio.sctp.SctpChannel r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        /* synthetic */ NioSctpChannelConfig(io.netty.channel.sctp.nio.NioSctpChannel r1, io.netty.channel.sctp.nio.NioSctpChannel r2, com.sun.nio.sctp.SctpChannel r3, io.netty.channel.sctp.nio.NioSctpChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.sctp.nio.NioSctpChannel r0 = r1.this$0
                io.netty.channel.sctp.nio.NioSctpChannel.access$100(r0)
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.sctp.nio.NioSctpChannel.METADATA = r0
            java.lang.Class<io.netty.channel.sctp.nio.NioSctpChannel> r0 = io.netty.channel.sctp.nio.NioSctpChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.sctp.nio.NioSctpChannel.logger = r0
            return
    }

    public NioSctpChannel() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = newSctpChannel()
            r1.<init>(r0)
            return
    }

    public NioSctpChannel(com.sun.nio.sctp.SctpChannel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public NioSctpChannel(io.netty.channel.Channel r3, com.sun.nio.sctp.SctpChannel r4) {
            r2 = this;
            r0 = 1
            r2.<init>(r3, r4, r0)
            r3 = 0
            r4.configureBlocking(r3)     // Catch: java.io.IOException -> L18
            io.netty.channel.sctp.nio.NioSctpChannel$NioSctpChannelConfig r3 = new io.netty.channel.sctp.nio.NioSctpChannel$NioSctpChannelConfig     // Catch: java.io.IOException -> L18
            r0 = 0
            r3.<init>(r2, r2, r4, r0)     // Catch: java.io.IOException -> L18
            r2.config = r3     // Catch: java.io.IOException -> L18
            io.netty.channel.sctp.SctpNotificationHandler r3 = new io.netty.channel.sctp.SctpNotificationHandler     // Catch: java.io.IOException -> L18
            r3.<init>(r2)     // Catch: java.io.IOException -> L18
            r2.notificationHandler = r3     // Catch: java.io.IOException -> L18
            return
        L18:
            r3 = move-exception
            r4.close()     // Catch: java.io.IOException -> L1d
            goto L2d
        L1d:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.nio.NioSctpChannel.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L2d
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.nio.NioSctpChannel.logger
            java.lang.String r1 = "Failed to close a partially initialized sctp channel."
            r0.warn(r1, r4)
        L2d:
            io.netty.channel.ChannelException r4 = new io.netty.channel.ChannelException
            java.lang.String r0 = "Failed to enter non-blocking mode."
            r4.<init>(r0, r3)
            throw r4
    }

    static /* synthetic */ void access$100(io.netty.channel.sctp.nio.NioSctpChannel r0) {
            r0.clearReadPending()
            return
    }

    private static com.sun.nio.sctp.SctpChannel newSctpChannel() {
            com.sun.nio.sctp.SctpChannel r0 = com.sun.nio.sctp.SctpChannel.open()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "Failed to open a sctp channel."
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public java.util.Set<java.net.InetSocketAddress> allLocalAddresses() {
            r3 = this;
            com.sun.nio.sctp.SctpChannel r0 = r3.javaChannel()     // Catch: java.lang.Throwable -> L28
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.lang.Throwable -> L28
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L28
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L15:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L28
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2     // Catch: java.lang.Throwable -> L28
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2     // Catch: java.lang.Throwable -> L28
            r1.add(r2)     // Catch: java.lang.Throwable -> L28
            goto L15
        L27:
            return r1
        L28:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public java.util.Set<java.net.InetSocketAddress> allRemoteAddresses() {
            r3 = this;
            com.sun.nio.sctp.SctpChannel r0 = r3.javaChannel()     // Catch: java.lang.Throwable -> L28
            java.util.Set r0 = r0.getRemoteAddresses()     // Catch: java.lang.Throwable -> L28
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L28
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
        L15:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L28
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2     // Catch: java.lang.Throwable -> L28
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2     // Catch: java.lang.Throwable -> L28
            r1.add(r2)     // Catch: java.lang.Throwable -> L28
            goto L15
        L27:
            return r1
        L28:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public com.sun.nio.sctp.Association association() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()     // Catch: java.io.IOException -> L9
            com.sun.nio.sctp.Association r0 = r0.association()     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.bindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L1a
            com.sun.nio.sctp.SctpChannel r0 = r2.javaChannel()     // Catch: java.lang.Throwable -> L15
            r0.bindAddress(r3)     // Catch: java.lang.Throwable -> L15
            r4.setSuccess()     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L1a:
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.nio.NioSctpChannel$1 r1 = new io.netty.channel.sctp.nio.NioSctpChannel$1
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.sctp.SctpChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            r0.bind(r2)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            r0.close()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected boolean doConnect(java.net.SocketAddress r2, java.net.SocketAddress r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L9
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            r0.bind(r3)
        L9:
            com.sun.nio.sctp.SctpChannel r3 = r1.javaChannel()     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r3.connect(r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            java.nio.channels.SelectionKey r3 = r1.selectionKey()     // Catch: java.lang.Throwable -> L1d
            r0 = 8
            r3.interestOps(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r2 = move-exception
            goto L20
        L1f:
            return r2
        L20:
            r1.doClose()
            throw r2
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected void doFinishConnect() throws java.lang.Exception {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            boolean r0 = r0.finishConnect()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r7 = this;
            com.sun.nio.sctp.SctpChannel r0 = r7.javaChannel()
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r1 = r7.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r1 = r1.recvBufAllocHandle()
            io.netty.channel.sctp.SctpChannelConfig r2 = r7.config()
            io.netty.buffer.ByteBufAllocator r2 = r2.getAllocator()
            io.netty.buffer.ByteBuf r2 = r1.allocate(r2)
            int r3 = r2.writerIndex()     // Catch: java.lang.Throwable -> L55
            int r4 = r2.writableBytes()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r3 = r2.internalNioBuffer(r3, r4)     // Catch: java.lang.Throwable -> L55
            int r4 = r3.position()     // Catch: java.lang.Throwable -> L55
            com.sun.nio.sctp.NotificationHandler<?> r5 = r7.notificationHandler     // Catch: java.lang.Throwable -> L55
            r6 = 0
            com.sun.nio.sctp.MessageInfo r0 = r0.receive(r3, r6, r5)     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L36
            r2.release()
            r8 = 0
            return r8
        L36:
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L55
            int r3 = r3 - r4
            r1.lastBytesRead(r3)     // Catch: java.lang.Throwable -> L55
            io.netty.channel.sctp.SctpMessage r3 = new io.netty.channel.sctp.SctpMessage     // Catch: java.lang.Throwable -> L55
            int r4 = r2.writerIndex()     // Catch: java.lang.Throwable -> L55
            int r1 = r1.lastBytesRead()     // Catch: java.lang.Throwable -> L55
            int r4 = r4 + r1
            io.netty.buffer.ByteBuf r1 = r2.writerIndex(r4)     // Catch: java.lang.Throwable -> L55
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L55
            r8.add(r3)     // Catch: java.lang.Throwable -> L55
            r8 = 1
            return r8
        L55:
            r8 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r8)     // Catch: java.lang.Throwable -> L5e
            r2.release()
            r8 = -1
            return r8
        L5e:
            r8 = move-exception
            r2.release()
            throw r8
    }

    @Override // io.netty.channel.nio.AbstractNioMessageChannel
    protected boolean doWriteMessage(java.lang.Object r7, io.netty.channel.ChannelOutboundBuffer r8) throws java.lang.Exception {
            r6 = this;
            io.netty.channel.sctp.SctpMessage r7 = (io.netty.channel.sctp.SctpMessage) r7
            io.netty.buffer.ByteBuf r8 = r7.content()
            int r0 = r8.readableBytes()
            r1 = 1
            if (r0 != 0) goto Le
            return r1
        Le:
            io.netty.buffer.ByteBufAllocator r2 = r6.alloc()
            int r3 = r8.nioBufferCount()
            r4 = 0
            if (r3 == r1) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 != 0) goto L2b
            boolean r5 = r8.isDirect()
            if (r5 != 0) goto L2b
            boolean r5 = r2.isDirectBufferPooled()
            if (r5 == 0) goto L2b
            r3 = 1
        L2b:
            if (r3 == 0) goto L35
            io.netty.buffer.ByteBuf r0 = r2.directBuffer(r0)
            io.netty.buffer.ByteBuf r8 = r0.writeBytes(r8)
        L35:
            java.nio.ByteBuffer r8 = r8.nioBuffer()
            com.sun.nio.sctp.Association r0 = r6.association()
            r2 = 0
            int r3 = r7.streamIdentifier()
            com.sun.nio.sctp.MessageInfo r0 = com.sun.nio.sctp.MessageInfo.createOutgoing(r0, r2, r3)
            int r2 = r7.protocolIdentifier()
            r0.payloadProtocolID(r2)
            int r2 = r7.streamIdentifier()
            r0.streamNumber(r2)
            boolean r7 = r7.isUnordered()
            r0.unordered(r7)
            com.sun.nio.sctp.SctpChannel r7 = r6.javaChannel()
            int r7 = r7.send(r8, r0)
            if (r7 <= 0) goto L66
            return r1
        L66:
            return r4
    }

    @Override // io.netty.channel.AbstractChannel
    protected final java.lang.Object filterOutboundMessage(java.lang.Object r6) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r6 instanceof io.netty.channel.sctp.SctpMessage
            if (r0 == 0) goto L2e
            io.netty.channel.sctp.SctpMessage r6 = (io.netty.channel.sctp.SctpMessage) r6
            io.netty.buffer.ByteBuf r0 = r6.content()
            boolean r1 = r0.isDirect()
            if (r1 == 0) goto L18
            int r1 = r0.nioBufferCount()
            r2 = 1
            if (r1 != r2) goto L18
            return r6
        L18:
            io.netty.channel.sctp.SctpMessage r1 = new io.netty.channel.sctp.SctpMessage
            int r2 = r6.protocolIdentifier()
            int r3 = r6.streamIdentifier()
            boolean r4 = r6.isUnordered()
            io.netty.buffer.ByteBuf r6 = r5.newDirectBuffer(r6, r0)
            r1.<init>(r2, r3, r4, r6)
            return r1
        L2e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r1.append(r6)
            java.lang.String r6 = " (expected: "
            r1.append(r6)
            java.lang.Class<io.netty.channel.sctp.SctpMessage> r6 = io.netty.channel.sctp.SctpMessage.class
            java.lang.String r6 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L12
            com.sun.nio.sctp.Association r0 = r1.association()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    protected com.sun.nio.sctp.SctpChannel javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            com.sun.nio.sctp.SctpChannel r0 = (com.sun.nio.sctp.SctpChannel) r0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.javaChannel()
            return r0
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
            r2 = this;
            com.sun.nio.sctp.SctpChannel r0 = r2.javaChannel()     // Catch: java.io.IOException -> L19
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.io.IOException -> L19
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L19
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L19
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L19
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.sctp.nio.NioSctpChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.sctp.SctpServerChannel r0 = r1.parent()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.sctp.SctpServerChannel parent() {
            r1 = this;
            io.netty.channel.Channel r0 = super.parent()
            io.netty.channel.sctp.SctpServerChannel r0 = (io.netty.channel.sctp.SctpServerChannel) r0
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
            r2 = this;
            com.sun.nio.sctp.SctpChannel r0 = r2.javaChannel()     // Catch: java.io.IOException -> L19
            java.util.Set r0 = r0.getRemoteAddresses()     // Catch: java.io.IOException -> L19
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L19
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L19
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L19
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0     // Catch: java.io.IOException -> L19
            return r0
        L19:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.unbindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L1a
            com.sun.nio.sctp.SctpChannel r0 = r2.javaChannel()     // Catch: java.lang.Throwable -> L15
            r0.unbindAddress(r3)     // Catch: java.lang.Throwable -> L15
            r4.setSuccess()     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L1a:
            io.netty.channel.nio.NioEventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.nio.NioSctpChannel$2 r1 = new io.netty.channel.sctp.nio.NioSctpChannel$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }
}
