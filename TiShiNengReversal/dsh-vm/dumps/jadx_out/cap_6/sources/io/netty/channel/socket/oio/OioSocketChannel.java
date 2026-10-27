package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioSocketChannel extends io.netty.channel.oio.OioByteStreamChannel implements io.netty.channel.socket.SocketChannel {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.socket.oio.OioSocketChannelConfig config;
    private final java.net.Socket socket;





    static {
            java.lang.Class<io.netty.channel.socket.oio.OioSocketChannel> r0 = io.netty.channel.socket.oio.OioSocketChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.oio.OioSocketChannel.logger = r0
            return
    }

    public OioSocketChannel() {
            r1 = this;
            java.net.Socket r0 = new java.net.Socket
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public OioSocketChannel(io.netty.channel.Channel r3, java.net.Socket r4) {
            r2 = this;
            r2.<init>(r3)
            r2.socket = r4
            io.netty.channel.socket.oio.DefaultOioSocketChannelConfig r3 = new io.netty.channel.socket.oio.DefaultOioSocketChannelConfig
            r3.<init>(r2, r4)
            r2.config = r3
            boolean r3 = r4.isConnected()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r3 == 0) goto L22
            java.io.InputStream r3 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r2.activate(r3, r0)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            goto L22
        L1e:
            r3 = move-exception
            goto L30
        L20:
            r3 = move-exception
            goto L28
        L22:
            r3 = 1000(0x3e8, float:1.401E-42)
            r4.setSoTimeout(r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            return
        L28:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "failed to initialize a socket"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L30:
            r4.close()     // Catch: java.io.IOException -> L34
            goto L3c
        L34:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.oio.OioSocketChannel.logger
            java.lang.String r1 = "Failed to close a socket."
            r0.warn(r1, r4)
        L3c:
            throw r3
    }

    public OioSocketChannel(java.net.Socket r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    static /* synthetic */ void access$000(io.netty.channel.socket.oio.OioSocketChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.shutdownOutput0(r1)
            return
    }

    static /* synthetic */ void access$100(io.netty.channel.socket.oio.OioSocketChannel r0, io.netty.channel.ChannelPromise r1) {
            r0.shutdownInput0(r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.channel.socket.oio.OioSocketChannel r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            r0.shutdownOutputDone(r1, r2)
            return
    }

    static /* synthetic */ void access$300(io.netty.channel.ChannelFuture r0, io.netty.channel.ChannelFuture r1, io.netty.channel.ChannelPromise r2) {
            shutdownDone(r0, r1, r2)
            return
    }

    private static void shutdownDone(io.netty.channel.ChannelFuture r2, io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            java.lang.Throwable r2 = r2.cause()
            java.lang.Throwable r3 = r3.cause()
            if (r2 == 0) goto L17
            if (r3 == 0) goto L13
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.oio.OioSocketChannel.logger
            java.lang.String r1 = "Exception suppressed because a previous exception occurred."
            r0.debug(r1, r3)
        L13:
            r4.setFailure(r2)
            return
        L17:
            if (r3 == 0) goto L1d
            r4.setFailure(r3)
            return
        L1d:
            r4.setSuccess()
            return
    }

    private void shutdownInput0(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            java.net.Socket r0 = r1.socket     // Catch: java.lang.Throwable -> L9
            r0.shutdownInput()     // Catch: java.lang.Throwable -> L9
            r2.setSuccess()     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            r2.setFailure(r0)
            return
    }

    private void shutdownOutput0() throws java.io.IOException {
            r1 = this;
            java.net.Socket r0 = r1.socket
            r0.shutdownOutput()
            return
    }

    private void shutdownOutput0(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            r1.shutdownOutput0()     // Catch: java.lang.Throwable -> L7
            r2.setSuccess()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r2.setFailure(r0)
            return
    }

    private void shutdownOutputDone(io.netty.channel.ChannelFuture r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownInput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            shutdownDone(r3, r0, r4)
            return
        Le:
            io.netty.channel.socket.oio.OioSocketChannel$4 r1 = new io.netty.channel.socket.oio.OioSocketChannel$4
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            return
    }

    protected boolean checkInputShutdown() {
            r2 = this;
            boolean r0 = r2.isInputShutdown()
            if (r0 == 0) goto L14
            io.netty.channel.socket.oio.OioSocketChannelConfig r0 = r2.config()     // Catch: java.lang.Throwable -> L12
            int r0 = r0.getSoTimeout()     // Catch: java.lang.Throwable -> L12
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L12
        L12:
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    final void clearReadPending0() {
            r0 = this;
            r0.clearReadPending()
            return
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.socket.oio.OioSocketChannelConfig config() {
            r1 = this;
            io.netty.channel.socket.oio.OioSocketChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r2) throws java.lang.Exception {
            r1 = this;
            java.net.Socket r0 = r1.socket
            io.netty.util.internal.SocketUtils.bind(r0, r2)
            return
    }

    @Override // io.netty.channel.oio.OioByteStreamChannel, io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r1 = this;
            java.net.Socket r0 = r1.socket
            r0.close()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r4, java.net.SocketAddress r5) throws java.lang.Exception {
            r3 = this;
            if (r5 == 0) goto L7
            java.net.Socket r0 = r3.socket
            io.netty.util.internal.SocketUtils.bind(r0, r5)
        L7:
            java.net.Socket r5 = r3.socket     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            io.netty.channel.socket.oio.OioSocketChannelConfig r0 = r3.config()     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            int r0 = r0.getConnectTimeoutMillis()     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            io.netty.util.internal.SocketUtils.connect(r5, r4, r0)     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            java.net.Socket r5 = r3.socket     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            java.net.Socket r0 = r3.socket     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            r3.activate(r5, r0)     // Catch: java.lang.Throwable -> L24 java.net.SocketTimeoutException -> L26
            return
        L24:
            r4 = move-exception
            goto L45
        L26:
            r5 = move-exception
            io.netty.channel.ConnectTimeoutException r0 = new io.netty.channel.ConnectTimeoutException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "connection timed out: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            r1.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.StackTraceElement[] r4 = r5.getStackTrace()     // Catch: java.lang.Throwable -> L24
            r0.setStackTrace(r4)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L45:
            r3.doClose()
            throw r4
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r0 = this;
            r0.doClose()
            return
    }

    @Override // io.netty.channel.oio.OioByteStreamChannel, io.netty.channel.oio.AbstractOioByteChannel
    protected int doReadBytes(io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isClosed()
            if (r0 == 0) goto La
            r2 = -1
            return r2
        La:
            int r2 = super.doReadBytes(r2)     // Catch: java.net.SocketTimeoutException -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.AbstractChannel
    protected final void doShutdownOutput() throws java.lang.Exception {
            r0 = this;
            r0.shutdownOutput0()
            return
    }

    @Override // io.netty.channel.oio.OioByteStreamChannel, io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L12
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    public boolean isInputShutdown() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L11
            boolean r0 = r1.isActive()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isClosed()
            r0 = r0 ^ 1
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isOutputShutdown() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isOutputShutdown()
            if (r0 != 0) goto L11
            boolean r0 = r1.isActive()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public boolean isShutdown() {
            r1 = this;
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isInputShutdown()
            if (r0 == 0) goto L10
            java.net.Socket r0 = r1.socket
            boolean r0 = r0.isOutputShutdown()
            if (r0 != 0) goto L16
        L10:
            boolean r0 = r1.isActive()
            if (r0 != 0) goto L18
        L16:
            r0 = 1
            return r0
        L18:
            r0 = 0
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
            java.net.Socket r0 = r1.socket
            java.net.SocketAddress r0 = r0.getLocalSocketAddress()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.Channel parent() {
            r1 = this;
            io.netty.channel.socket.ServerSocketChannel r0 = r1.parent()
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public io.netty.channel.socket.ServerSocketChannel parent() {
            r1 = this;
            io.netty.channel.Channel r0 = super.parent()
            io.netty.channel.socket.ServerSocketChannel r0 = (io.netty.channel.socket.ServerSocketChannel) r0
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
            java.net.Socket r0 = r1.socket
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()
            return r0
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    @java.lang.Deprecated
    protected void setReadPending(boolean r1) {
            r0 = this;
            super.setReadPending(r1)
            return
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdown(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdown(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.ChannelFuture r0 = r2.shutdownOutput()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Le
            r2.shutdownOutputDone(r0, r3)
            return r3
        Le:
            io.netty.channel.socket.oio.OioSocketChannel$3 r1 = new io.netty.channel.socket.oio.OioSocketChannel$3
            r1.<init>(r2, r3)
            r0.addListener(r1)
            return r3
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    public io.netty.channel.ChannelFuture shutdownInput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownInput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownInput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.shutdownInput0(r3)
            return r3
        Le:
            io.netty.channel.socket.oio.OioSocketChannel$2 r1 = new io.netty.channel.socket.oio.OioSocketChannel$2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.shutdownOutput(r0)
            return r0
    }

    @Override // io.netty.channel.socket.DuplexChannel
    public io.netty.channel.ChannelFuture shutdownOutput(io.netty.channel.ChannelPromise r3) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto Le
            r2.shutdownOutput0(r3)
            return r3
        Le:
            io.netty.channel.socket.oio.OioSocketChannel$1 r1 = new io.netty.channel.socket.oio.OioSocketChannel$1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return r3
    }
}
