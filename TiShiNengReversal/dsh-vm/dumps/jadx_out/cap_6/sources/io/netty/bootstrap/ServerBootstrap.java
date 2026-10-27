package io.netty.bootstrap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ServerBootstrap extends io.netty.bootstrap.AbstractBootstrap<io.netty.bootstrap.ServerBootstrap, io.netty.channel.ServerChannel> {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> childAttrs;
    private volatile io.netty.channel.EventLoopGroup childGroup;
    private volatile io.netty.channel.ChannelHandler childHandler;
    private final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> childOptions;
    private final io.netty.bootstrap.ServerBootstrapConfig config;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ServerBootstrapAcceptor extends io.netty.channel.ChannelInboundHandlerAdapter {
        private final java.util.Map.Entry<io.netty.util.AttributeKey<?>, java.lang.Object>[] childAttrs;
        private final io.netty.channel.EventLoopGroup childGroup;
        private final io.netty.channel.ChannelHandler childHandler;
        private final java.util.Map.Entry<io.netty.channel.ChannelOption<?>, java.lang.Object>[] childOptions;
        private final java.lang.Runnable enableAutoReadTask;



        ServerBootstrapAcceptor(io.netty.channel.Channel r1, io.netty.channel.EventLoopGroup r2, io.netty.channel.ChannelHandler r3, java.util.Map.Entry<io.netty.channel.ChannelOption<?>, java.lang.Object>[] r4, java.util.Map.Entry<io.netty.util.AttributeKey<?>, java.lang.Object>[] r5) {
                r0 = this;
                r0.<init>()
                r0.childGroup = r2
                r0.childHandler = r3
                r0.childOptions = r4
                r0.childAttrs = r5
                io.netty.bootstrap.ServerBootstrap$ServerBootstrapAcceptor$1 r2 = new io.netty.bootstrap.ServerBootstrap$ServerBootstrapAcceptor$1
                r2.<init>(r0, r1)
                r0.enableAutoReadTask = r2
                return
        }

        static /* synthetic */ void access$200(io.netty.channel.Channel r0, java.lang.Throwable r1) {
                forceClose(r0, r1)
                return
        }

        private static void forceClose(io.netty.channel.Channel r2, java.lang.Throwable r3) {
                io.netty.channel.Channel$Unsafe r0 = r2.unsafe()
                r0.closeForcibly()
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.bootstrap.ServerBootstrap.access$100()
                java.lang.String r1 = "Failed to register an accepted channel: {}"
                r0.warn(r1, r2, r3)
                return
        }

        @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
        public void channelRead(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6) {
                r4 = this;
                io.netty.channel.Channel r6 = (io.netty.channel.Channel) r6
                io.netty.channel.ChannelPipeline r5 = r6.pipeline()
                io.netty.channel.ChannelHandler r0 = r4.childHandler
                r1 = 1
                io.netty.channel.ChannelHandler[] r1 = new io.netty.channel.ChannelHandler[r1]
                r2 = 0
                r1[r2] = r0
                r5.addLast(r1)
                java.util.Map$Entry<io.netty.channel.ChannelOption<?>, java.lang.Object>[] r5 = r4.childOptions
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.bootstrap.ServerBootstrap.access$100()
                io.netty.bootstrap.AbstractBootstrap.setChannelOptions(r6, r5, r0)
                java.util.Map$Entry<io.netty.util.AttributeKey<?>, java.lang.Object>[] r5 = r4.childAttrs
                int r0 = r5.length
            L1d:
                if (r2 >= r0) goto L35
                r1 = r5[r2]
                java.lang.Object r3 = r1.getKey()
                io.netty.util.AttributeKey r3 = (io.netty.util.AttributeKey) r3
                io.netty.util.Attribute r3 = r6.attr(r3)
                java.lang.Object r1 = r1.getValue()
                r3.set(r1)
                int r2 = r2 + 1
                goto L1d
            L35:
                io.netty.channel.EventLoopGroup r5 = r4.childGroup     // Catch: java.lang.Throwable -> L44
                io.netty.channel.ChannelFuture r5 = r5.register(r6)     // Catch: java.lang.Throwable -> L44
                io.netty.bootstrap.ServerBootstrap$ServerBootstrapAcceptor$2 r0 = new io.netty.bootstrap.ServerBootstrap$ServerBootstrapAcceptor$2     // Catch: java.lang.Throwable -> L44
                r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L44
                r5.addListener(r0)     // Catch: java.lang.Throwable -> L44
                return
            L44:
                r5 = move-exception
                forceClose(r6, r5)
                return
        }

        @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler, io.netty.channel.ChannelInboundHandler
        public void exceptionCaught(io.netty.channel.ChannelHandlerContext r6, java.lang.Throwable r7) throws java.lang.Exception {
                r5 = this;
                io.netty.channel.Channel r0 = r6.channel()
                io.netty.channel.ChannelConfig r0 = r0.config()
                boolean r1 = r0.isAutoRead()
                if (r1 == 0) goto L23
                r1 = 0
                r0.setAutoRead(r1)
                io.netty.channel.Channel r0 = r6.channel()
                io.netty.channel.EventLoop r0 = r0.eventLoop()
                java.lang.Runnable r1 = r5.enableAutoReadTask
                r2 = 1
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                r0.schedule(r1, r2, r4)
            L23:
                r6.fireExceptionCaught(r7)
                return
        }
    }

    static {
            java.lang.Class<io.netty.bootstrap.ServerBootstrap> r0 = io.netty.bootstrap.ServerBootstrap.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.bootstrap.ServerBootstrap.logger = r0
            return
    }

    public ServerBootstrap() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.childOptions = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.childAttrs = r0
            io.netty.bootstrap.ServerBootstrapConfig r0 = new io.netty.bootstrap.ServerBootstrapConfig
            r0.<init>(r1)
            r1.config = r0
            return
    }

    private ServerBootstrap(io.netty.bootstrap.ServerBootstrap r5) {
            r4 = this;
            r4.<init>(r5)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.childOptions = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r4.childAttrs = r1
            io.netty.bootstrap.ServerBootstrapConfig r2 = new io.netty.bootstrap.ServerBootstrapConfig
            r2.<init>(r4)
            r4.config = r2
            io.netty.channel.EventLoopGroup r2 = r5.childGroup
            r4.childGroup = r2
            io.netty.channel.ChannelHandler r2 = r5.childHandler
            r4.childHandler = r2
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r2 = r5.childOptions
            monitor-enter(r2)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r3 = r5.childOptions     // Catch: java.lang.Throwable -> L36
            r0.putAll(r3)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r5.childAttrs
            monitor-enter(r0)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r5 = r5.childAttrs     // Catch: java.lang.Throwable -> L33
            r1.putAll(r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r5
        L36:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    static /* synthetic */ io.netty.bootstrap.ServerBootstrapConfig access$000(io.netty.bootstrap.ServerBootstrap r0) {
            io.netty.bootstrap.ServerBootstrapConfig r0 = r0.config
            return r0
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$100() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.bootstrap.ServerBootstrap.logger
            return r0
    }

    private static java.util.Map.Entry<io.netty.util.AttributeKey<?>, java.lang.Object>[] newAttrArray(int r0) {
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            return r0
    }

    private static java.util.Map.Entry<io.netty.channel.ChannelOption<?>, java.lang.Object>[] newOptionArray(int r0) {
            java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
            return r0
    }

    public <T> io.netty.bootstrap.ServerBootstrap childAttr(io.netty.util.AttributeKey<T> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "childKey"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            if (r3 != 0) goto Ld
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r3 = r1.childAttrs
            r3.remove(r2)
            return r1
        Ld:
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r1.childAttrs
            r0.put(r2, r3)
            return r1
    }

    final java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> childAttrs() {
            r1 = this;
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r1.childAttrs
            java.util.Map r0 = io.netty.bootstrap.AbstractBootstrap.copiedMap(r0)
            return r0
    }

    @java.lang.Deprecated
    public io.netty.channel.EventLoopGroup childGroup() {
            r1 = this;
            io.netty.channel.EventLoopGroup r0 = r1.childGroup
            return r0
    }

    public io.netty.bootstrap.ServerBootstrap childHandler(io.netty.channel.ChannelHandler r2) {
            r1 = this;
            java.lang.String r0 = "childHandler"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelHandler r2 = (io.netty.channel.ChannelHandler) r2
            r1.childHandler = r2
            return r1
    }

    final io.netty.channel.ChannelHandler childHandler() {
            r1 = this;
            io.netty.channel.ChannelHandler r0 = r1.childHandler
            return r0
    }

    public <T> io.netty.bootstrap.ServerBootstrap childOption(io.netty.channel.ChannelOption<T> r3, T r4) {
            r2 = this;
            java.lang.String r0 = "childOption"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            if (r4 != 0) goto L14
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.childOptions
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r4 = r2.childOptions     // Catch: java.lang.Throwable -> L11
            r4.remove(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
        L14:
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r2.childOptions
            monitor-enter(r0)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r1 = r2.childOptions     // Catch: java.lang.Throwable -> L1e
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    final java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> childOptions() {
            r1 = this;
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r1.childOptions
            java.util.Map r0 = io.netty.bootstrap.AbstractBootstrap.copiedMap(r0)
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.ServerBootstrap clone() {
            r1 = this;
            io.netty.bootstrap.ServerBootstrap r0 = r1.clone2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: clone, reason: avoid collision after fix types in other method */
    public io.netty.bootstrap.ServerBootstrap clone2() {
            r1 = this;
            io.netty.bootstrap.ServerBootstrap r0 = new io.netty.bootstrap.ServerBootstrap
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo0clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            io.netty.bootstrap.ServerBootstrap r0 = r1.clone2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.ServerBootstrap, io.netty.channel.ServerChannel> config() {
            r1 = this;
            io.netty.bootstrap.ServerBootstrapConfig r0 = r1.config2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: config, reason: avoid collision after fix types in other method */
    public final io.netty.bootstrap.AbstractBootstrapConfig<io.netty.bootstrap.ServerBootstrap, io.netty.channel.ServerChannel> config2() {
            r1 = this;
            io.netty.bootstrap.ServerBootstrapConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.ServerBootstrap group(io.netty.channel.EventLoopGroup r1) {
            r0 = this;
            io.netty.bootstrap.ServerBootstrap r1 = r0.group2(r1)
            return r1
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: group, reason: avoid collision after fix types in other method */
    public io.netty.bootstrap.ServerBootstrap group2(io.netty.channel.EventLoopGroup r1) {
            r0 = this;
            io.netty.bootstrap.ServerBootstrap r1 = r0.group(r1, r1)
            return r1
    }

    public io.netty.bootstrap.ServerBootstrap group(io.netty.channel.EventLoopGroup r1, io.netty.channel.EventLoopGroup r2) {
            r0 = this;
            super.group(r1)
            java.lang.String r1 = "childGroup"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.channel.EventLoopGroup r1 = r0.childGroup
            if (r1 != 0) goto Lf
            r0.childGroup = r2
            return r0
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "childGroup set already"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    void init(io.netty.channel.Channel r8) throws java.lang.Exception {
            r7 = this;
            java.util.Map r1 = r7.options0()
            monitor-enter(r1)
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.bootstrap.ServerBootstrap.logger     // Catch: java.lang.Throwable -> L86
            io.netty.bootstrap.AbstractBootstrap.setChannelOptions(r8, r1, r0)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L86
            java.util.Map r2 = r7.attrs0()
            monitor-enter(r2)
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L36
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L36
            io.netty.util.AttributeKey r3 = (io.netty.util.AttributeKey) r3     // Catch: java.lang.Throwable -> L36
            io.netty.util.Attribute r3 = r8.attr(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L36
            r3.set(r1)     // Catch: java.lang.Throwable -> L36
            goto L18
        L36:
            r0 = move-exception
            r8 = r0
            goto L84
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            io.netty.channel.ChannelPipeline r8 = r8.pipeline()
            io.netty.channel.EventLoopGroup r2 = r7.childGroup
            io.netty.channel.ChannelHandler r3 = r7.childHandler
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r1 = r7.childOptions
            monitor-enter(r1)
            java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r0 = r7.childOptions     // Catch: java.lang.Throwable -> L80
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L80
            r6 = 0
            java.util.Map$Entry[] r4 = newOptionArray(r6)     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch: java.lang.Throwable -> L80
            r4 = r0
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r5 = r7.childAttrs
            monitor-enter(r5)
            java.util.Map<io.netty.util.AttributeKey<?>, java.lang.Object> r0 = r7.childAttrs     // Catch: java.lang.Throwable -> L7c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7c
            java.util.Map$Entry[] r1 = newAttrArray(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L7c
            java.util.Map$Entry[] r0 = (java.util.Map.Entry[]) r0     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7c
            r5 = r0
            io.netty.bootstrap.ServerBootstrap$1 r0 = new io.netty.bootstrap.ServerBootstrap$1
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 1
            io.netty.channel.ChannelHandler[] r1 = new io.netty.channel.ChannelHandler[r1]
            r1[r6] = r0
            r8.addLast(r1)
            return
        L7c:
            r0 = move-exception
            r8 = r0
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7c
            throw r8
        L80:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            throw r8
        L84:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r8
        L86:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L86
            throw r8
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    public /* bridge */ /* synthetic */ io.netty.bootstrap.ServerBootstrap validate() {
            r1 = this;
            io.netty.bootstrap.ServerBootstrap r0 = r1.validate2()
            return r0
    }

    @Override // io.netty.bootstrap.AbstractBootstrap
    /* renamed from: validate, reason: avoid collision after fix types in other method */
    public io.netty.bootstrap.ServerBootstrap validate2() {
            r2 = this;
            super.validate()
            io.netty.channel.ChannelHandler r0 = r2.childHandler
            if (r0 == 0) goto L1b
            io.netty.channel.EventLoopGroup r0 = r2.childGroup
            if (r0 != 0) goto L1a
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.bootstrap.ServerBootstrap.logger
            java.lang.String r1 = "childGroup is not set. Using parentGroup instead."
            r0.warn(r1)
            io.netty.bootstrap.ServerBootstrapConfig r0 = r2.config
            io.netty.channel.EventLoopGroup r0 = r0.group()
            r2.childGroup = r0
        L1a:
            return r2
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "childHandler not set"
            r0.<init>(r1)
            throw r0
    }
}
