package io.netty.bootstrap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Bootstrap extends io.netty.bootstrap.AbstractBootstrap<io.netty.bootstrap.Bootstrap, io.netty.channel.Channel> {
    private static final io.netty.resolver.AddressResolverGroup<?> DEFAULT_RESOLVER = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.bootstrap.BootstrapConfig config;
    private volatile java.net.SocketAddress remoteAddress;
    private volatile io.netty.resolver.AddressResolverGroup<java.net.SocketAddress> resolver;




    static {
            java.lang.Class<io.netty.bootstrap.Bootstrap> r0 = io.netty.bootstrap.Bootstrap.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.bootstrap.Bootstrap.logger = r0
            io.netty.resolver.DefaultAddressResolverGroup r0 = io.netty.resolver.DefaultAddressResolverGroup.INSTANCE
            io.netty.bootstrap.Bootstrap.DEFAULT_RESOLVER = r0
            return
    }

    public Bootstrap() {
            r1 = this;
            r1.<init>()
            io.netty.bootstrap.BootstrapConfig r0 = new io.netty.bootstrap.BootstrapConfig
            r0.<init>(r1)
            r1.config = r0
            io.netty.resolver.AddressResolverGroup<?> r0 = io.netty.bootstrap.Bootstrap.DEFAULT_RESOLVER
            r1.resolver = r0
            return
    }

    private Bootstrap(io.netty.bootstrap.Bootstrap r2) {
            r1 = this;
            r1.<init>(r2)
            io.netty.bootstrap.BootstrapConfig r0 = new io.netty.bootstrap.BootstrapConfig
            r0.<init>(r1)
            r1.config = r0
            io.netty.resolver.AddressResolverGroup<?> r0 = io.netty.bootstrap.Bootstrap.DEFAULT_RESOLVER
            r1.resolver = r0
            io.netty.resolver.AddressResolverGroup<java.net.SocketAddress> r0 = r2.resolver
            r1.resolver = r0
            java.net.SocketAddress r2 = r2.remoteAddress
            r1.remoteAddress = r2
            return
    }

    static /* synthetic */ io.netty.channel.ChannelFuture access$000(io.netty.bootstrap.Bootstrap r0, io.netty.channel.Channel r1, java.net.SocketAddress r2, java.net.SocketAddress r3, io.netty.channel.ChannelPromise r4) {
            io.netty.channel.ChannelFuture r0 = r0.doResolveAndConnect0(r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ void access$100(java.net.SocketAddress r0, java.net.SocketAddress r1, io.netty.channel.ChannelPromise r2) {
            doConnect(r0, r1, r2)
            return
    }

    private static void doConnect(java.net.SocketAddress r3, java.net.SocketAddress r4, io.netty.channel.ChannelPromise r5) {
            io.netty.channel.Channel r0 = r5.channel()
            io.netty.channel.EventLoop r1 = r0.eventLoop()
            io.netty.bootstrap.Bootstrap$3 r2 = new io.netty.bootstrap.Bootstrap$3
            r2.<init>(r4, r0, r3, r5)
            r1.execute(r2)
            return
    }

    private io.netty.channel.ChannelFuture doResolveAndConnect(java.net.SocketAddress r8, java.net.SocketAddress r9) {
            r7 = this;
            io.netty.channel.ChannelFuture r0 = r7.initAndRegister()
            io.netty.channel.Channel r4 = r0.channel()
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L1e
            boolean r1 = r0.isSuccess()
            if (r1 != 0) goto L15
            return r0
        L15:
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            io.netty.channel.ChannelFuture r8 = r7.doResolveAndConnect0(r4, r8, r9, r0)
            return r8
        L1e:
            io.netty.bootstrap.AbstractBootstrap$PendingRegistrationPromise r3 = new io.netty.bootstrap.AbstractBootstrap$PendingRegistrationPromise
            r3.<init>(r4)
            io.netty.bootstrap.Bootstrap$1 r1 = new io.netty.bootstrap.Bootstrap$1
            r2 = r7
            r5 = r8
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.addListener(r1)
            return r3
    }

    private io.netty.channel.ChannelFuture doResolveAndConnect0(io.netty.channel.Channel r3, java.net.SocketAddress r4, java.net.SocketAddress r5, io.netty.channel.ChannelPromise r6) {
            r2 = this;
            io.netty.channel.EventLoop r0 = r3.eventLoop()     // Catch: java.lang.Throwable -> L2e
            io.netty.resolver.AddressResolverGroup<java.net.SocketAddress> r1 = r2.resolver     // Catch: java.lang.Throwable -> L2e
            io.netty.resolver.AddressResolver r0 = r1.getResolver(r0)     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isSupported(r4)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L43
            boolean r1 = r0.isResolved(r4)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L17
            goto L43
        L17:
            io.netty.util.concurrent.Future r4 = r0.resolve(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r4.isDone()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L3a
            java.lang.Throwable r0 = r4.cause()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            r3.close()     // Catch: java.lang.Throwable -> L2e
            r6.setFailure(r0)     // Catch: java.lang.Throwable -> L2e
            return r6
        L2e:
            r3 = move-exception
            goto L47
        L30:
            java.lang.Object r3 = r4.getNow()     // Catch: java.lang.Throwable -> L2e
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3     // Catch: java.lang.Throwable -> L2e
            doConnect(r3, r5, r6)     // Catch: java.lang.Throwable -> L2e
            return r6
        L3a:
            io.netty.bootstrap.Bootstrap$2 r0 = new io.netty.bootstrap.Bootstrap$2     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2, r3, r6, r5)     // Catch: java.lang.Throwable -> L2e
            r4.addListener(r0)     // Catch: java.lang.Throwable -> L2e
            return r6
        L43:
            doConnect(r4, r5, r6)     // Catch: java.lang.Throwable -> L2e
            return r6
        L47:
            r6.tryFailure(r3)
            return r6
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.Bootstrap clone() {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = r1.clone2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: clone, reason: avoid collision after fix types in other method */
    public io.netty.bootstrap.Bootstrap clone2() {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = new io.netty.bootstrap.Bootstrap
            r0.<init>(r1)
            return r0
    }

    public io.netty.bootstrap.Bootstrap clone(io.netty.channel.EventLoopGroup r2) {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = new io.netty.bootstrap.Bootstrap
            r0.<init>(r1)
            r0.group = r2
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo0clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = r1.clone2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.Bootstrap, io.netty.channel.Channel> config() {
            r1 = this;
            io.netty.bootstrap.BootstrapConfig r0 = r1.config2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: config, reason: avoid collision after fix types in other method */
    public final io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.Bootstrap, io.netty.channel.Channel> config2() {
            r1 = this;
            io.netty.bootstrap.BootstrapConfig r0 = r1.config
            return r0
    }

    public io.netty.channel.ChannelFuture connect() {
            r2 = this;
            r2.validate2()
            java.net.SocketAddress r0 = r2.remoteAddress
            if (r0 == 0) goto L12
            io.netty.bootstrap.BootstrapConfig r1 = r2.config
            java.net.SocketAddress r1 = r1.localAddress()
            io.netty.channel.ChannelFuture r0 = r2.doResolveAndConnect(r0, r1)
            return r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remoteAddress not set"
            r0.<init>(r1)
            throw r0
    }

    public io.netty.channel.ChannelFuture connect(java.lang.String r1, int r2) {
            r0 = this;
            java.net.InetSocketAddress r1 = java.net.InetSocketAddress.createUnresolved(r1, r2)
            io.netty.channel.ChannelFuture r1 = r0.connect(r1)
            return r1
    }

    public io.netty.channel.ChannelFuture connect(java.net.InetAddress r2, int r3) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            io.netty.channel.ChannelFuture r2 = r1.connect(r0)
            return r2
    }

    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2) {
            r1 = this;
            java.lang.String r0 = "remoteAddress"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            r1.validate2()
            io.netty.bootstrap.BootstrapConfig r0 = r1.config
            java.net.SocketAddress r0 = r0.localAddress()
            io.netty.channel.ChannelFuture r2 = r1.doResolveAndConnect(r2, r0)
            return r2
    }

    public io.netty.channel.ChannelFuture connect(java.net.SocketAddress r2, java.net.SocketAddress r3) {
            r1 = this;
            java.lang.String r0 = "remoteAddress"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            r1.validate2()
            io.netty.channel.ChannelFuture r2 = r1.doResolveAndConnect(r2, r3)
            return r2
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    void init(io.netty.channel.Channel r5) throws java.lang.Exception {
            r4 = this;
            io.netty.channel.ChannelPipeline r0 = r5.pipeline()
            io.netty.bootstrap.BootstrapConfig r1 = r4.config
            io.netty.channel.ChannelHandler r1 = r1.handler()
            r2 = 1
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r3 = 0
            r2[r3] = r1
            r0.addLast(r2)
            java.util.Map r0 = r4.options0()
            monitor-enter(r0)
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.bootstrap.Bootstrap.logger     // Catch: java.lang.Throwable -> L4f
            io.netty.bootstrap.AbstractBootstrap.setChannelOptions(r5, r0, r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            java.util.Map r1 = r4.attrs0()
            monitor-enter(r1)
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L49
        L2b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L49
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L49
            io.netty.util.AttributeKey r3 = (io.netty.util.AttributeKey) r3     // Catch: java.lang.Throwable -> L49
            io.netty.util.Attribute r3 = r5.attr(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L49
            r3.set(r2)     // Catch: java.lang.Throwable -> L49
            goto L2b
        L49:
            r5 = move-exception
            goto L4d
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            return
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
            throw r5
        L4f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r5
    }

    public io.netty.bootstrap.Bootstrap remoteAddress(java.lang.String r1, int r2) {
            r0 = this;
            java.net.InetSocketAddress r1 = java.net.InetSocketAddress.createUnresolved(r1, r2)
            r0.remoteAddress = r1
            return r0
    }

    public io.netty.bootstrap.Bootstrap remoteAddress(java.net.InetAddress r2, int r3) {
            r1 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r2, r3)
            r1.remoteAddress = r0
            return r1
    }

    public io.netty.bootstrap.Bootstrap remoteAddress(java.net.SocketAddress r1) {
            r0 = this;
            r0.remoteAddress = r1
            return r0
    }

    final java.net.SocketAddress remoteAddress() {
            r1 = this;
            java.net.SocketAddress r0 = r1.remoteAddress
            return r0
    }

    public io.netty.bootstrap.Bootstrap resolver(io.netty.resolver.AddressResolverGroup<?> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            io.netty.resolver.AddressResolverGroup<?> r1 = io.netty.bootstrap.Bootstrap.DEFAULT_RESOLVER
        L4:
            r0.resolver = r1
            return r0
    }

    final io.netty.resolver.AddressResolverGroup<?> resolver() {
            r1 = this;
            io.netty.resolver.AddressResolverGroup<java.net.SocketAddress> r0 = r1.resolver
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.Bootstrap validate() {
            r1 = this;
            io.netty.bootstrap.Bootstrap r0 = r1.validate2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: validate, reason: avoid collision after fix types in other method */
    public io.netty.bootstrap.Bootstrap validate2() {
            r2 = this;
            super.validate()
            io.netty.bootstrap.BootstrapConfig r0 = r2.config
            io.netty.channel.ChannelHandler r0 = r0.handler()
            if (r0 == 0) goto Lc
            return r2
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "handler not set"
            r0.<init>(r1)
            throw r0
    }
}
