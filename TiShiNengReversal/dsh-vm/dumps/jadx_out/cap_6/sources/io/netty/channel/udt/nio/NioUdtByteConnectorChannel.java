package io.netty.channel.udt.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class NioUdtByteConnectorChannel extends io.netty.channel.nio.AbstractNioByteChannel implements io.netty.channel.udt.UdtChannel {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.udt.UdtChannelConfig config;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.udt.nio.NioUdtByteConnectorChannel$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$barchart$udt$StatusUDT = null;

        static {
                com.barchart.udt.StatusUDT[] r0 = com.barchart.udt.StatusUDT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.udt.nio.NioUdtByteConnectorChannel.AnonymousClass2.$SwitchMap$com$barchart$udt$StatusUDT = r0
                com.barchart.udt.StatusUDT r1 = com.barchart.udt.StatusUDT.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.udt.nio.NioUdtByteConnectorChannel.AnonymousClass2.$SwitchMap$com$barchart$udt$StatusUDT     // Catch: java.lang.NoSuchFieldError -> L1d
                com.barchart.udt.StatusUDT r1 = com.barchart.udt.StatusUDT.OPENED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.udt.nio.NioUdtByteConnectorChannel> r0 = io.netty.channel.udt.nio.NioUdtByteConnectorChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.udt.nio.NioUdtByteConnectorChannel.logger = r0
            return
    }

    public NioUdtByteConnectorChannel() {
            r1 = this;
            com.barchart.udt.TypeUDT r0 = com.barchart.udt.TypeUDT.STREAM
            r1.<init>(r0)
            return
    }

    public NioUdtByteConnectorChannel(com.barchart.udt.TypeUDT r1) {
            r0 = this;
            com.barchart.udt.nio.SocketChannelUDT r1 = io.netty.channel.udt.nio.NioUdtProvider.newConnectorChannelUDT(r1)
            r0.<init>(r1)
            return
    }

    public NioUdtByteConnectorChannel(com.barchart.udt.nio.SocketChannelUDT r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public NioUdtByteConnectorChannel(io.netty.channel.Channel r4, com.barchart.udt.nio.SocketChannelUDT r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r4 = 0
            r5.configureBlocking(r4)     // Catch: java.lang.Exception -> L25
            int[] r0 = io.netty.channel.udt.nio.NioUdtByteConnectorChannel.AnonymousClass2.$SwitchMap$com$barchart$udt$StatusUDT     // Catch: java.lang.Exception -> L25
            com.barchart.udt.SocketUDT r1 = r5.socketUDT()     // Catch: java.lang.Exception -> L25
            com.barchart.udt.StatusUDT r1 = r1.status()     // Catch: java.lang.Exception -> L25
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L25
            r0 = r0[r1]     // Catch: java.lang.Exception -> L25
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L27
            io.netty.channel.udt.DefaultUdtChannelConfig r0 = new io.netty.channel.udt.DefaultUdtChannelConfig     // Catch: java.lang.Exception -> L25
            r0.<init>(r3, r5, r4)     // Catch: java.lang.Exception -> L25
            r3.config = r0     // Catch: java.lang.Exception -> L25
            return
        L25:
            r4 = move-exception
            goto L2f
        L27:
            io.netty.channel.udt.DefaultUdtChannelConfig r4 = new io.netty.channel.udt.DefaultUdtChannelConfig     // Catch: java.lang.Exception -> L25
            r4.<init>(r3, r5, r1)     // Catch: java.lang.Exception -> L25
            r3.config = r4     // Catch: java.lang.Exception -> L25
            return
        L2f:
            r5.close()     // Catch: java.lang.Exception -> L33
            goto L43
        L33:
            r5 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.udt.nio.NioUdtByteConnectorChannel.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L43
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.udt.nio.NioUdtByteConnectorChannel.logger
            java.lang.String r1 = "Failed to close channel."
            r0.warn(r1, r5)
        L43:
            io.netty.channel.ChannelException r5 = new io.netty.channel.ChannelException
            java.lang.String r0 = "Failed to configure channel."
            r5.<init>(r0, r4)
            throw r5
    }

    private static void privilegedBind(com.barchart.udt.nio.SocketChannelUDT r1, java.net.SocketAddress r2) throws java.io.IOException {
            io.netty.channel.udt.nio.NioUdtByteConnectorChannel$1 r0 = new io.netty.channel.udt.nio.NioUdtByteConnectorChannel$1     // Catch: java.security.PrivilegedActionException -> L9
            r0.<init>(r1, r2)     // Catch: java.security.PrivilegedActionException -> L9
            java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L9
            return
        L9:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.udt.UdtChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.udt.UdtChannelConfig config() {
            r1 = this;
            io.netty.channel.udt.UdtChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r1.javaChannel()
            privilegedBind(r0, r2)
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r1.javaChannel()
            r0.close()
            return
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    protected boolean doConnect(java.net.SocketAddress r2, java.net.SocketAddress r3) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L3
            goto L9
        L3:
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r0 = 0
            r3.<init>(r0)
        L9:
            r1.doBind(r3)
            com.barchart.udt.nio.SocketChannelUDT r3 = r1.javaChannel()     // Catch: java.lang.Throwable -> L28
            boolean r2 = io.netty.util.internal.SocketUtils.connect(r3, r2)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2a
            java.nio.channels.SelectionKey r3 = r1.selectionKey()     // Catch: java.lang.Throwable -> L28
            java.nio.channels.SelectionKey r0 = r1.selectionKey()     // Catch: java.lang.Throwable -> L28
            int r0 = r0.interestOps()     // Catch: java.lang.Throwable -> L28
            r0 = r0 | 8
            r3.interestOps(r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r2 = move-exception
            goto L2b
        L2a:
            return r2
        L2b:
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
            r2 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r2.javaChannel()
            boolean r0 = r0.finishConnect()
            if (r0 == 0) goto L1c
            java.nio.channels.SelectionKey r0 = r2.selectionKey()
            java.nio.channels.SelectionKey r1 = r2.selectionKey()
            int r1 = r1.interestOps()
            r1 = r1 & (-9)
            r0.interestOps(r1)
            return
        L1c:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Provider error: failed to finish connect. Provider library should be upgraded."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected int doReadBytes(io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.nio.AbstractNioChannel$NioUnsafe r0 = r2.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            int r1 = r3.writableBytes()
            r0.attemptedBytesRead(r1)
            com.barchart.udt.nio.SocketChannelUDT r1 = r2.javaChannel()
            int r0 = r0.attemptedBytesRead()
            int r3 = r3.writeBytes(r1, r0)
            return r3
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected int doWriteBytes(io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r2 = this;
            int r0 = r3.readableBytes()
            com.barchart.udt.nio.SocketChannelUDT r1 = r2.javaChannel()
            int r3 = r3.readBytes(r1, r0)
            return r3
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel
    protected long doWriteFileRegion(io.netty.channel.FileRegion r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r2 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r2.javaChannel()
            boolean r1 = r0.isOpen()
            if (r1 == 0) goto L12
            boolean r0 = r0.isConnectFinished()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    protected com.barchart.udt.nio.SocketChannelUDT javaChannel() {
            r1 = this;
            java.nio.channels.SelectableChannel r0 = super.mo176javaChannel()
            com.barchart.udt.nio.SocketChannelUDT r0 = (com.barchart.udt.nio.SocketChannelUDT) r0
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioChannel
    /* renamed from: javaChannel */
    protected /* bridge */ /* synthetic */ java.nio.channels.SelectableChannel mo176javaChannel() {
            r1 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r1.javaChannel()
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
            r1 = this;
            com.barchart.udt.nio.SocketChannelUDT r0 = r1.javaChannel()
            com.barchart.udt.nio.NioSocketUDT r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getLocalSocketAddress()
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
            com.barchart.udt.nio.SocketChannelUDT r0 = r1.javaChannel()
            com.barchart.udt.nio.NioSocketUDT r0 = r0.socket()
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()
            return r0
    }

    @Override // io.netty.channel.nio.AbstractNioByteChannel, io.netty.channel.socket.DuplexChannel
    protected io.netty.channel.ChannelFuture shutdownInput() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "shutdownInput"
            r0.<init>(r1)
            io.netty.channel.ChannelFuture r0 = r2.newFailedFuture(r0)
            return r0
    }
}
