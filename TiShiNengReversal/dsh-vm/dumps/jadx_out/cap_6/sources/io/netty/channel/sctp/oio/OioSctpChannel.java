package io.netty.channel.sctp.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioSctpChannel extends io.netty.channel.oio.AbstractOioMessageChannel implements io.netty.channel.sctp.SctpChannel {
    private static final java.lang.String EXPECTED_TYPE = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final com.sun.nio.sctp.SctpChannel ch;
    private final io.netty.channel.sctp.SctpChannelConfig config;
    private final java.nio.channels.Selector connectSelector;
    private final com.sun.nio.sctp.NotificationHandler<?> notificationHandler;
    private final java.nio.channels.Selector readSelector;
    private final java.nio.channels.Selector writeSelector;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class OioSctpChannelConfig extends io.netty.channel.sctp.DefaultSctpChannelConfig {
        final /* synthetic */ io.netty.channel.sctp.oio.OioSctpChannel this$0;

        private OioSctpChannelConfig(io.netty.channel.sctp.oio.OioSctpChannel r1, io.netty.channel.sctp.oio.OioSctpChannel r2, com.sun.nio.sctp.SctpChannel r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        /* synthetic */ OioSctpChannelConfig(io.netty.channel.sctp.oio.OioSctpChannel r1, io.netty.channel.sctp.oio.OioSctpChannel r2, com.sun.nio.sctp.SctpChannel r3, io.netty.channel.sctp.oio.OioSctpChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.sctp.oio.OioSctpChannel r0 = r1.this$0
                io.netty.channel.sctp.oio.OioSctpChannel.access$100(r0)
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.sctp.oio.OioSctpChannel> r0 = io.netty.channel.sctp.oio.OioSctpChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.sctp.oio.OioSctpChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.sctp.oio.OioSctpChannel.METADATA = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " (expected: "
            r0.append(r1)
            java.lang.Class<io.netty.channel.sctp.SctpMessage> r1 = io.netty.channel.sctp.SctpMessage.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.sctp.oio.OioSctpChannel.EXPECTED_TYPE = r0
            return
    }

    public OioSctpChannel() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = openChannel()
            r1.<init>(r0)
            return
    }

    public OioSctpChannel(com.sun.nio.sctp.SctpChannel r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public OioSctpChannel(io.netty.channel.Channel r4, com.sun.nio.sctp.SctpChannel r5) {
            r3 = this;
            r3.<init>(r4)
            r3.ch = r5
            r4 = 0
            r5.configureBlocking(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.nio.channels.Selector r4 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.readSelector = r4     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.nio.channels.Selector r0 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.writeSelector = r0     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.connectSelector = r1     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r2 = 1
            r5.register(r4, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4 = 4
            r5.register(r0, r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4 = 8
            r5.register(r1, r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            io.netty.channel.sctp.oio.OioSctpChannel$OioSctpChannelConfig r4 = new io.netty.channel.sctp.oio.OioSctpChannel$OioSctpChannelConfig     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0 = 0
            r4.<init>(r3, r3, r5, r0)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.config = r4     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            io.netty.channel.sctp.SctpNotificationHandler r4 = new io.netty.channel.sctp.SctpNotificationHandler     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r3.notificationHandler = r4     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            return
        L38:
            r4 = move-exception
            goto L43
        L3a:
            r4 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "failed to initialize a sctp channel"
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L43:
            r5.close()     // Catch: java.io.IOException -> L47
            goto L4f
        L47:
            r5 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.oio.OioSctpChannel.logger
            java.lang.String r1 = "Failed to close a sctp channel."
            r0.warn(r1, r5)
        L4f:
            throw r4
    }

    static /* synthetic */ void access$100(io.netty.channel.sctp.oio.OioSctpChannel r0) {
            r0.clearReadPending()
            return
    }

    private static void closeSelector(java.lang.String r3, java.nio.channels.Selector r4) {
            r4.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.oio.OioSctpChannel.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L28
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.oio.OioSctpChannel.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to close a "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " selector."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.warn(r3, r4)
        L28:
            return
    }

    private static com.sun.nio.sctp.SctpChannel openChannel() {
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
            com.sun.nio.sctp.SctpChannel r0 = r3.ch     // Catch: java.lang.Throwable -> L26
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L26
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L13:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2     // Catch: java.lang.Throwable -> L26
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2     // Catch: java.lang.Throwable -> L26
            r1.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L13
        L25:
            return r1
        L26:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public java.util.Set<java.net.InetSocketAddress> allRemoteAddresses() {
            r3 = this;
            com.sun.nio.sctp.SctpChannel r0 = r3.ch     // Catch: java.lang.Throwable -> L26
            java.util.Set r0 = r0.getRemoteAddresses()     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L26
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L13:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            java.net.SocketAddress r2 = (java.net.SocketAddress) r2     // Catch: java.lang.Throwable -> L26
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2     // Catch: java.lang.Throwable -> L26
            r1.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L13
        L25:
            return r1
        L26:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // io.netty.channel.sctp.SctpChannel
    public com.sun.nio.sctp.Association association() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.ch     // Catch: java.io.IOException -> L7
            com.sun.nio.sctp.Association r0 = r0.association()     // Catch: java.io.IOException -> L7
            return r0
        L7:
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
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L18
            com.sun.nio.sctp.SctpChannel r0 = r2.ch     // Catch: java.lang.Throwable -> L13
            r0.bindAddress(r3)     // Catch: java.lang.Throwable -> L13
            r4.setSuccess()     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L18:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.oio.OioSctpChannel$1 r1 = new io.netty.channel.sctp.oio.OioSctpChannel$1
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
            com.sun.nio.sctp.SctpChannel r0 = r1.ch
            r0.bind(r2)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = "read"
            java.nio.channels.Selector r1 = r2.readSelector
            closeSelector(r0, r1)
            java.lang.String r0 = "write"
            java.nio.channels.Selector r1 = r2.writeSelector
            closeSelector(r0, r1)
            java.lang.String r0 = "connect"
            java.nio.channels.Selector r1 = r2.connectSelector
            closeSelector(r0, r1)
            com.sun.nio.sctp.SctpChannel r0 = r2.ch
            r0.close()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r3, java.net.SocketAddress r4) throws java.lang.Exception {
            r2 = this;
            if (r4 == 0) goto L7
            com.sun.nio.sctp.SctpChannel r0 = r2.ch
            r0.bind(r4)
        L7:
            com.sun.nio.sctp.SctpChannel r4 = r2.ch     // Catch: java.lang.Throwable -> L3a
            r4.connect(r3)     // Catch: java.lang.Throwable -> L3a
            r3 = 0
        Ld:
            if (r3 != 0) goto L40
            java.nio.channels.Selector r4 = r2.connectSelector     // Catch: java.lang.Throwable -> L3a
            r0 = 1000(0x3e8, double:4.94E-321)
            int r4 = r4.select(r0)     // Catch: java.lang.Throwable -> L3a
            if (r4 < 0) goto Ld
            java.nio.channels.Selector r4 = r2.connectSelector     // Catch: java.lang.Throwable -> L3a
            java.util.Set r4 = r4.selectedKeys()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L3a
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3a
            java.nio.channels.SelectionKey r1 = (java.nio.channels.SelectionKey) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.isConnectable()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L23
            r4.clear()     // Catch: java.lang.Throwable -> L3a
            r3 = 1
            goto L3c
        L3a:
            r3 = move-exception
            goto L4c
        L3c:
            r4.clear()     // Catch: java.lang.Throwable -> L3a
            goto Ld
        L40:
            com.sun.nio.sctp.SctpChannel r3 = r2.ch     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r3.finishConnect()     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L4b
            r2.doClose()
        L4b:
            return
        L4c:
            r2.doClose()
            throw r3
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r8) throws java.lang.Exception {
            r7 = this;
            java.nio.channels.Selector r0 = r7.readSelector
            boolean r0 = r0.isOpen()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.nio.channels.Selector r0 = r7.readSelector
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = r0.select(r2)
            if (r0 <= 0) goto L7a
            java.nio.channels.Selector r0 = r7.readSelector
            java.util.Set r0 = r0.selectedKeys()
            r0.clear()
            io.netty.channel.Channel$Unsafe r0 = r7.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            io.netty.channel.sctp.SctpChannelConfig r2 = r7.config()
            io.netty.buffer.ByteBufAllocator r2 = r2.getAllocator()
            io.netty.buffer.ByteBuf r2 = r0.allocate(r2)
            int r3 = r2.writerIndex()     // Catch: java.lang.Throwable -> L6d
            int r4 = r2.writableBytes()     // Catch: java.lang.Throwable -> L6d
            java.nio.ByteBuffer r3 = r2.nioBuffer(r3, r4)     // Catch: java.lang.Throwable -> L6d
            com.sun.nio.sctp.SctpChannel r4 = r7.ch     // Catch: java.lang.Throwable -> L6d
            com.sun.nio.sctp.NotificationHandler<?> r5 = r7.notificationHandler     // Catch: java.lang.Throwable -> L6d
            r6 = 0
            com.sun.nio.sctp.MessageInfo r4 = r4.receive(r3, r6, r5)     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L4c
            r2.release()
            return r1
        L4c:
            r3.flip()     // Catch: java.lang.Throwable -> L6d
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L6d
            r0.lastBytesRead(r3)     // Catch: java.lang.Throwable -> L6d
            io.netty.channel.sctp.SctpMessage r3 = new io.netty.channel.sctp.SctpMessage     // Catch: java.lang.Throwable -> L6d
            int r5 = r2.writerIndex()     // Catch: java.lang.Throwable -> L6d
            int r0 = r0.lastBytesRead()     // Catch: java.lang.Throwable -> L6d
            int r5 = r5 + r0
            io.netty.buffer.ByteBuf r0 = r2.writerIndex(r5)     // Catch: java.lang.Throwable -> L6d
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6d
            r8.add(r3)     // Catch: java.lang.Throwable -> L6d
            r8 = 1
            return r8
        L6d:
            r8 = move-exception
            io.netty.util.internal.PlatformDependent.throwException(r8)     // Catch: java.lang.Throwable -> L75
            r2.release()
            return r1
        L75:
            r8 = move-exception
            r2.release()
            throw r8
        L7a:
            return r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r9) throws java.lang.Exception {
            r8 = this;
            java.nio.channels.Selector r0 = r8.writeSelector
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto La
            goto L91
        La:
            int r0 = r9.size()
            java.nio.channels.Selector r1 = r8.writeSelector
            r2 = 1000(0x3e8, double:4.94E-321)
            int r1 = r1.select(r2)
            if (r1 <= 0) goto L91
            java.nio.channels.Selector r1 = r8.writeSelector
            java.util.Set r1 = r1.selectedKeys()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L25
            goto L91
        L25:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2a:
            if (r2 != r0) goto L2d
            goto L91
        L2d:
            r1.next()
            r1.remove()
            java.lang.Object r3 = r9.current()
            io.netty.channel.sctp.SctpMessage r3 = (io.netty.channel.sctp.SctpMessage) r3
            if (r3 != 0) goto L3c
            goto L91
        L3c:
            io.netty.buffer.ByteBuf r4 = r3.content()
            int r5 = r4.readableBytes()
            int r6 = r4.nioBufferCount()
            r7 = -1
            if (r6 == r7) goto L50
            java.nio.ByteBuffer r4 = r4.nioBuffer()
            goto L5f
        L50:
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            int r6 = r4.readerIndex()
            r4.getBytes(r6, r5)
            r5.flip()
            r4 = r5
        L5f:
            com.sun.nio.sctp.Association r5 = r8.association()
            r6 = 0
            int r7 = r3.streamIdentifier()
            com.sun.nio.sctp.MessageInfo r5 = com.sun.nio.sctp.MessageInfo.createOutgoing(r5, r6, r7)
            int r6 = r3.protocolIdentifier()
            r5.payloadProtocolID(r6)
            int r6 = r3.streamIdentifier()
            r5.streamNumber(r6)
            boolean r3 = r3.isUnordered()
            r5.unordered(r3)
            com.sun.nio.sctp.SctpChannel r3 = r8.ch
            r3.send(r4, r5)
            int r2 = r2 + 1
            r9.remove()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2a
        L91:
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.channel.sctp.SctpMessage
            if (r0 == 0) goto L5
            return r4
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.sctp.oio.OioSctpChannel.EXPECTED_TYPE
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Le
            com.sun.nio.sctp.Association r0 = r1.association()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            com.sun.nio.sctp.SctpChannel r0 = r1.ch
            boolean r0 = r0.isOpen()
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
            com.sun.nio.sctp.SctpChannel r0 = r2.ch     // Catch: java.io.IOException -> L17
            java.util.Set r0 = r0.getAllLocalAddresses()     // Catch: java.io.IOException -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L17
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L17
            if (r1 == 0) goto L17
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L17
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0     // Catch: java.io.IOException -> L17
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.sctp.oio.OioSctpChannel.METADATA
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
            com.sun.nio.sctp.SctpChannel r0 = r2.ch     // Catch: java.io.IOException -> L17
            java.util.Set r0 = r0.getRemoteAddresses()     // Catch: java.io.IOException -> L17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L17
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L17
            if (r1 == 0) goto L17
            java.lang.Object r0 = r0.next()     // Catch: java.io.IOException -> L17
            java.net.SocketAddress r0 = (java.net.SocketAddress) r0     // Catch: java.io.IOException -> L17
            return r0
        L17:
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
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L18
            com.sun.nio.sctp.SctpChannel r0 = r2.ch     // Catch: java.lang.Throwable -> L13
            r0.unbindAddress(r3)     // Catch: java.lang.Throwable -> L13
            r4.setSuccess()     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L18:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.oio.OioSctpChannel$2 r1 = new io.netty.channel.sctp.oio.OioSctpChannel$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }
}
