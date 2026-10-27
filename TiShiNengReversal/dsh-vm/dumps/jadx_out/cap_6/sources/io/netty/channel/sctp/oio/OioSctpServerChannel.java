package io.netty.channel.sctp.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OioSctpServerChannel extends io.netty.channel.oio.AbstractOioMessageChannel implements io.netty.channel.sctp.SctpServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.sctp.SctpServerChannelConfig config;
    private final com.sun.nio.sctp.SctpServerChannel sch;
    private final java.nio.channels.Selector selector;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class OioSctpServerChannelConfig extends io.netty.channel.sctp.DefaultSctpServerChannelConfig {
        final /* synthetic */ io.netty.channel.sctp.oio.OioSctpServerChannel this$0;

        private OioSctpServerChannelConfig(io.netty.channel.sctp.oio.OioSctpServerChannel r1, io.netty.channel.sctp.oio.OioSctpServerChannel r2, com.sun.nio.sctp.SctpServerChannel r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        /* synthetic */ OioSctpServerChannelConfig(io.netty.channel.sctp.oio.OioSctpServerChannel r1, io.netty.channel.sctp.oio.OioSctpServerChannel r2, com.sun.nio.sctp.SctpServerChannel r3, io.netty.channel.sctp.oio.OioSctpServerChannel.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.netty.channel.DefaultChannelConfig
        protected void autoReadCleared() {
                r1 = this;
                io.netty.channel.sctp.oio.OioSctpServerChannel r0 = r1.this$0
                io.netty.channel.sctp.oio.OioSctpServerChannel.access$100(r0)
                return
        }
    }

    static {
            java.lang.Class<io.netty.channel.sctp.oio.OioSctpServerChannel> r0 = io.netty.channel.sctp.oio.OioSctpServerChannel.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.sctp.oio.OioSctpServerChannel.logger = r0
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            io.netty.channel.sctp.oio.OioSctpServerChannel.METADATA = r0
            return
    }

    public OioSctpServerChannel() {
            r1 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = newServerSocket()
            r1.<init>(r0)
            return
    }

    public OioSctpServerChannel(com.sun.nio.sctp.SctpServerChannel r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            if (r4 == 0) goto L37
            r3.sch = r4
            r1 = 0
            r4.configureBlocking(r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r3.selector = r1     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r2 = 16
            r4.register(r1, r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            io.netty.channel.sctp.oio.OioSctpServerChannel$OioSctpServerChannelConfig r1 = new io.netty.channel.sctp.oio.OioSctpServerChannel$OioSctpServerChannelConfig     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r1.<init>(r3, r3, r4, r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r3.config = r1     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            return
        L1f:
            r0 = move-exception
            goto L2a
        L21:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "failed to initialize a sctp server channel"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L2a:
            r4.close()     // Catch: java.io.IOException -> L2e
            goto L36
        L2e:
            r4 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.sctp.oio.OioSctpServerChannel.logger
            java.lang.String r2 = "Failed to close a sctp server channel."
            r1.warn(r2, r4)
        L36:
            throw r0
        L37:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "sctp server channel"
            r4.<init>(r0)
            throw r4
    }

    static /* synthetic */ void access$100(io.netty.channel.sctp.oio.OioSctpServerChannel r0) {
            r0.clearReadPending()
            return
    }

    private static com.sun.nio.sctp.SctpServerChannel newServerSocket() {
            com.sun.nio.sctp.SctpServerChannel r0 = com.sun.nio.sctp.SctpServerChannel.open()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "failed to create a sctp server channel"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public java.util.Set<java.net.InetSocketAddress> allLocalAddresses() {
            r3 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r3.sch     // Catch: java.lang.Throwable -> L26
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

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.bindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture bindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L18
            com.sun.nio.sctp.SctpServerChannel r0 = r2.sch     // Catch: java.lang.Throwable -> L13
            r0.bindAddress(r3)     // Catch: java.lang.Throwable -> L13
            r4.setSuccess()     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L18:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.oio.OioSctpServerChannel$1 r1 = new io.netty.channel.sctp.oio.OioSctpServerChannel$1
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }

    @Override // io.netty.channel.Channel
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r0 = r1.config()
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.sctp.SctpServerChannelConfig config() {
            r1 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r3) throws java.lang.Exception {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.sch
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r2.config
            int r1 = r1.getBacklog()
            r0.bind(r3, r1)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r3 = this;
            java.nio.channels.Selector r0 = r3.selector     // Catch: java.io.IOException -> L6
            r0.close()     // Catch: java.io.IOException -> L6
            goto Le
        L6:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.channel.sctp.oio.OioSctpServerChannel.logger
            java.lang.String r2 = "Failed to close a selector."
            r1.warn(r2, r0)
        Le:
            com.sun.nio.sctp.SctpServerChannel r0 = r3.sch
            r0.close()
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doConnect(java.net.SocketAddress r1, java.net.SocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.oio.AbstractOioMessageChannel
    protected int doReadMessages(java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r5.isActive()
            if (r0 != 0) goto L8
            r6 = -1
            return r6
        L8:
            r0 = 0
            r1 = 0
            java.nio.channels.Selector r2 = r5.selector     // Catch: java.lang.Throwable -> L40
            r3 = 1000(0x3e8, double:4.94E-321)
            int r2 = r2.select(r3)     // Catch: java.lang.Throwable -> L40
            if (r2 <= 0) goto L48
            java.nio.channels.Selector r2 = r5.selector     // Catch: java.lang.Throwable -> L40
            java.util.Set r2 = r2.selectedKeys()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L40
        L1e:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L40
            java.nio.channels.SelectionKey r3 = (java.nio.channels.SelectionKey) r3     // Catch: java.lang.Throwable -> L40
            r2.remove()     // Catch: java.lang.Throwable -> L40
            boolean r3 = r3.isAcceptable()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L42
            com.sun.nio.sctp.SctpServerChannel r3 = r5.sch     // Catch: java.lang.Throwable -> L40
            com.sun.nio.sctp.SctpChannel r0 = r3.accept()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L42
            io.netty.channel.sctp.oio.OioSctpChannel r3 = new io.netty.channel.sctp.oio.OioSctpChannel     // Catch: java.lang.Throwable -> L40
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L40
            r6.add(r3)     // Catch: java.lang.Throwable -> L40
            int r1 = r1 + 1
            goto L42
        L40:
            r6 = move-exception
            goto L49
        L42:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L1e
        L48:
            return r1
        L49:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.channel.sctp.oio.OioSctpServerChannel.logger
            java.lang.String r3 = "Failed to create a new channel from an accepted sctp channel."
            r2.warn(r3, r6)
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.lang.Throwable -> L56
            goto L5e
        L56:
            r6 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.sctp.oio.OioSctpServerChannel.logger
            java.lang.String r2 = "Failed to close a sctp channel."
            r0.warn(r2, r6)
        L5e:
            return r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.lang.Object filterOutboundMessage(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Le
            java.net.SocketAddress r0 = r1.localAddress0()
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
            com.sun.nio.sctp.SctpServerChannel r0 = r1.sch
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
            com.sun.nio.sctp.SctpServerChannel r0 = r2.sch     // Catch: java.io.IOException -> L17
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
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.sctp.oio.OioSctpServerChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.InetSocketAddress remoteAddress() {
            r1 = this;
            r0 = 0
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
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.unbindAddress(r2, r0)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpServerChannel
    public io.netty.channel.ChannelFuture unbindAddress(java.net.InetAddress r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L18
            com.sun.nio.sctp.SctpServerChannel r0 = r2.sch     // Catch: java.lang.Throwable -> L13
            r0.unbindAddress(r3)     // Catch: java.lang.Throwable -> L13
            r4.setSuccess()     // Catch: java.lang.Throwable -> L13
            return r4
        L13:
            r3 = move-exception
            r4.setFailure(r3)
            return r4
        L18:
            io.netty.channel.EventLoop r0 = r2.eventLoop()
            io.netty.channel.sctp.oio.OioSctpServerChannel$2 r1 = new io.netty.channel.sctp.oio.OioSctpServerChannel$2
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return r4
    }
}
