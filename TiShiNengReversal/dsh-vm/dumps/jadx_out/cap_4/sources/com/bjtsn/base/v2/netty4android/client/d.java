package com.bjtsn.base.v2.netty4android.client;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNettyTcpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NettyTcpClient.kt\ncom/bjtsn/base/v2/netty4android/client/NettyTcpClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;
    private final int b;
    private final int c;

    @org.jetbrains.annotations.Nullable
    private io.netty.channel.EventLoopGroup d;

    @org.jetbrains.annotations.Nullable
    private r.b<com.bxkj.base.v2.netty4android.client.command.a> e;

    @org.jetbrains.annotations.Nullable
    private io.netty.channel.Channel f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;

    /* renamed from: l, reason: collision with root package name */
    private long f319l;

    /* renamed from: m, reason: collision with root package name */
    private long f320m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f321n;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.Nullable
    private java.lang.Object f322o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private int a;
        private long b;

        @org.jetbrains.annotations.Nullable
        private java.lang.String c;
        private int d;
        private int e;
        private boolean f;
        private long g;

        @org.jetbrains.annotations.Nullable
        private java.lang.Object h;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.a = r0
                r0 = 5000(0x1388, double:2.4703E-320)
                r2.b = r0
                r0 = 5
                r2.g = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d a() {
                r5 = this;
                com.bjtsn.base.v2.netty4android.client.d r0 = new com.bjtsn.base.v2.netty4android.client.d
                java.lang.String r1 = r5.c
                kotlin.jvm.internal.g0.m(r1)
                int r2 = r5.d
                int r3 = r5.e
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                int r1 = r5.a
                com.bjtsn.base.v2.netty4android.client.d.i(r0, r1)
                long r1 = r5.b
                com.bjtsn.base.v2.netty4android.client.d.k(r0, r1)
                long r1 = r5.g
                com.bjtsn.base.v2.netty4android.client.d.h(r0, r1)
                boolean r1 = r5.f
                com.bjtsn.base.v2.netty4android.client.d.m(r0, r1)
                java.lang.Object r1 = r5.h
                com.bjtsn.base.v2.netty4android.client.d.g(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a b(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                java.lang.String r0 = "heartBeatData"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.h = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a c(long r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "host"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.c = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a e(int r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a f(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a g(long r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a h(boolean r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bjtsn.base.v2.netty4android.client.d.a i(int r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends java.lang.Thread {
        final /* synthetic */ com.bjtsn.base.v2.netty4android.client.d a;

        b(com.bjtsn.base.v2.netty4android.client.d r1) {
                r0 = this;
                r0.a = r1
                java.lang.String r1 = "Netty-Client"
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                super.run()
                com.bjtsn.base.v2.netty4android.client.d r0 = r2.a
                r1 = 1
                com.bjtsn.base.v2.netty4android.client.d.j(r0, r1)
                com.bjtsn.base.v2.netty4android.client.d r0 = r2.a
                int r1 = r0.u()
                com.bjtsn.base.v2.netty4android.client.d.l(r0, r1)
                com.bjtsn.base.v2.netty4android.client.d r0 = r2.a
                com.bjtsn.base.v2.netty4android.client.d.d(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends io.netty.channel.ChannelInitializer<io.netty.channel.socket.SocketChannel> {
        final /* synthetic */ com.bjtsn.base.v2.netty4android.client.d a;

        c(com.bjtsn.base.v2.netty4android.client.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(io.netty.channel.socket.SocketChannel r10) throws java.lang.Exception {
                r9 = this;
                java.lang.String r0 = "ch"
                kotlin.jvm.internal.g0.p(r10, r0)
                com.bjtsn.base.v2.netty4android.client.d r0 = r9.a
                boolean r0 = r0.w()
                if (r0 == 0) goto L27
                io.netty.channel.ChannelPipeline r0 = r10.pipeline()
                io.netty.handler.timeout.IdleStateHandler r1 = new io.netty.handler.timeout.IdleStateHandler
                com.bjtsn.base.v2.netty4android.client.d r2 = r9.a
                long r4 = r2.s()
                r6 = 0
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2 = 0
                r1.<init>(r2, r4, r6, r8)
                java.lang.String r2 = "ping"
                r0.addLast(r2, r1)
            L27:
                io.netty.channel.ChannelPipeline r0 = r10.pipeline()
                com.bxkj.base.v2.netty4android.client.handler.c r1 = new com.bxkj.base.v2.netty4android.client.handler.c
                r2 = 0
                r3 = 1
                r1.<init>(r2, r3, r2)
                io.netty.channel.ChannelHandler[] r4 = new io.netty.channel.ChannelHandler[r3]
                r5 = 0
                r4[r5] = r1
                r0.addLast(r4)
                io.netty.channel.ChannelPipeline r0 = r10.pipeline()
                com.bxkj.base.v2.netty4android.client.handler.b r1 = new com.bxkj.base.v2.netty4android.client.handler.b
                r1.<init>(r2, r3, r2)
                io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r3]
                r2[r5] = r1
                r0.addLast(r2)
                io.netty.channel.ChannelPipeline r0 = r10.pipeline()
                io.netty.handler.codec.LineBasedFrameDecoder r1 = new io.netty.handler.codec.LineBasedFrameDecoder
                r2 = 1024(0x400, float:1.435E-42)
                r1.<init>(r2)
                io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r3]
                r2[r5] = r1
                r0.addLast(r2)
                io.netty.channel.ChannelPipeline r10 = r10.pipeline()
                com.bxkj.base.v2.netty4android.client.handler.d r0 = new com.bxkj.base.v2.netty4android.client.handler.d
                com.bjtsn.base.v2.netty4android.client.d r1 = r9.a
                r.b r1 = com.bjtsn.base.v2.netty4android.client.d.f(r1)
                com.bjtsn.base.v2.netty4android.client.d r2 = r9.a
                int r2 = r2.t()
                com.bjtsn.base.v2.netty4android.client.d r4 = r9.a
                boolean r4 = r4.w()
                com.bjtsn.base.v2.netty4android.client.d r6 = r9.a
                java.lang.Object r6 = com.bjtsn.base.v2.netty4android.client.d.e(r6)
                r0.<init>(r1, r2, r4, r6)
                io.netty.channel.ChannelHandler[] r1 = new io.netty.channel.ChannelHandler[r3]
                r1[r5] = r0
                r10.addLast(r1)
                return
        }

        public /* bridge */ /* synthetic */ void initChannel(io.netty.channel.Channel r1) {
                r0 = this;
                io.netty.channel.socket.SocketChannel r1 = (io.netty.channel.socket.SocketChannel) r1
                r0.a(r1)
                return
        }
    }

    private d(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.h = r1
            r0.i = r1
            r1 = 1
            r0.j = r1
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.f319l = r1
            r1 = 5
            r0.f320m = r1
            return
    }

    public /* synthetic */ d(java.lang.String r1, int r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static final void A(r.a r0, io.netty.util.concurrent.Future r1) {
            if (r0 == 0) goto L9
            boolean r1 = r1.isSuccess()
            r0.a(r1)
        L9:
            return
    }

    private static final void C(kotlin.jvm.functions.Function1 r0, io.netty.util.concurrent.Future r1) {
            boolean r1 = r1.isSuccess()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            return
    }

    public static /* synthetic */ void a(r.a r0, io.netty.util.concurrent.Future r1) {
            A(r0, r1)
            return
    }

    public static /* synthetic */ void b(com.bjtsn.base.v2.netty4android.client.d r0, io.netty.util.concurrent.Future r1) {
            p(r0, r1)
            return
    }

    public static /* synthetic */ void c(kotlin.jvm.functions.Function1 r0, io.netty.util.concurrent.Future r1) {
            C(r0, r1)
            return
    }

    public static final /* synthetic */ void d(com.bjtsn.base.v2.netty4android.client.d r0) {
            r0.o()
            return
    }

    public static final /* synthetic */ java.lang.Object e(com.bjtsn.base.v2.netty4android.client.d r0) {
            java.lang.Object r0 = r0.f322o
            return r0
    }

    public static final /* synthetic */ r.b f(com.bjtsn.base.v2.netty4android.client.d r0) {
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r0 = r0.e
            return r0
    }

    public static final /* synthetic */ void g(com.bjtsn.base.v2.netty4android.client.d r0, java.lang.Object r1) {
            r0.f322o = r1
            return
    }

    public static final /* synthetic */ void h(com.bjtsn.base.v2.netty4android.client.d r0, long r1) {
            r0.f320m = r1
            return
    }

    public static final /* synthetic */ void i(com.bjtsn.base.v2.netty4android.client.d r0, int r1) {
            r0.h = r1
            return
    }

    public static final /* synthetic */ void j(com.bjtsn.base.v2.netty4android.client.d r0, boolean r1) {
            r0.j = r1
            return
    }

    public static final /* synthetic */ void k(com.bjtsn.base.v2.netty4android.client.d r0, long r1) {
            r0.f319l = r1
            return
    }

    public static final /* synthetic */ void l(com.bjtsn.base.v2.netty4android.client.d r0, int r1) {
            r0.i = r1
            return
    }

    public static final /* synthetic */ void m(com.bjtsn.base.v2.netty4android.client.d r0, boolean r1) {
            r0.f321n = r1
            return
    }

    private final void o() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.g     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto Le1
            r0 = 1
            r5.k = r0     // Catch: java.lang.Throwable -> L85
            io.netty.channel.nio.NioEventLoopGroup r0 = new io.netty.channel.nio.NioEventLoopGroup     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            r5.d = r0     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = new io.netty.bootstrap.Bootstrap     // Catch: java.lang.Throwable -> L85
            r0.<init>()     // Catch: java.lang.Throwable -> L85
            io.netty.channel.EventLoopGroup r1 = r5.d     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.AbstractBootstrap r0 = r0.group(r1)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0     // Catch: java.lang.Throwable -> L85
            io.netty.channel.ChannelOption r1 = io.netty.channel.ChannelOption.TCP_NODELAY     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.AbstractBootstrap r0 = r0.option(r1, r2)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0     // Catch: java.lang.Throwable -> L85
            io.netty.channel.ChannelOption r1 = io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS     // Catch: java.lang.Throwable -> L85
            r2 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.AbstractBootstrap r0 = r0.option(r1, r2)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0     // Catch: java.lang.Throwable -> L85
            java.lang.Class<io.netty.channel.socket.nio.NioSocketChannel> r1 = io.netty.channel.socket.nio.NioSocketChannel.class
            io.netty.bootstrap.AbstractBootstrap r0 = r0.channel(r1)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0     // Catch: java.lang.Throwable -> L85
            com.bjtsn.base.v2.netty4android.client.d$c r1 = new com.bjtsn.base.v2.netty4android.client.d$c     // Catch: java.lang.Throwable -> L85
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.AbstractBootstrap r0 = r0.handler(r1)     // Catch: java.lang.Throwable -> L85
            io.netty.bootstrap.Bootstrap r0 = (io.netty.bootstrap.Bootstrap) r0     // Catch: java.lang.Throwable -> L85
            r1 = 0
            r2 = 0
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            int r4 = r5.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            io.netty.channel.ChannelFuture r0 = r0.connect(r3, r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            com.bjtsn.base.v2.netty4android.client.a r3 = new com.bjtsn.base.v2.netty4android.client.a     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            io.netty.channel.ChannelFuture r0 = r0.addListener(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            io.netty.channel.ChannelFuture r0 = r0.sync()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            io.netty.channel.Channel r0 = r0.channel()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            r5.f = r0     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            if (r0 == 0) goto L72
            io.netty.channel.ChannelFuture r0 = r0.closeFuture()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            if (r0 == 0) goto L72
            r0.sync()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            goto L72
        L70:
            r0 = move-exception
            goto L9c
        L72:
            java.lang.String r0 = " 断开连接"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            com.orhanobut.logger.j.d(r0, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> Lbf
            r5.g = r2     // Catch: java.lang.Throwable -> L85
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r0 = r5.e     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L87
            int r3 = r5.c     // Catch: java.lang.Throwable -> L85
            r0.b(r2, r3)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto Le5
        L87:
            io.netty.channel.Channel r0 = r5.f     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L97
            boolean r2 = r0.isOpen()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L92
            r1 = r0
        L92:
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.lang.Throwable -> L85
        L97:
            io.netty.channel.EventLoopGroup r0 = r5.d     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto Le1
            goto Lde
        L9c:
            r5.g = r2     // Catch: java.lang.Throwable -> L85
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r3 = r5.e     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto La7
            int r4 = r5.c     // Catch: java.lang.Throwable -> L85
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L85
        La7:
            io.netty.channel.Channel r2 = r5.f     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto Lb7
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto Lb2
            r1 = r2
        Lb2:
            if (r1 == 0) goto Lb7
            r1.close()     // Catch: java.lang.Throwable -> L85
        Lb7:
            io.netty.channel.EventLoopGroup r1 = r5.d     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto Lbe
            r1.shutdownGracefully()     // Catch: java.lang.Throwable -> L85
        Lbe:
            throw r0     // Catch: java.lang.Throwable -> L85
        Lbf:
            r5.g = r2     // Catch: java.lang.Throwable -> L85
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r0 = r5.e     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto Lca
            int r3 = r5.c     // Catch: java.lang.Throwable -> L85
            r0.b(r2, r3)     // Catch: java.lang.Throwable -> L85
        Lca:
            io.netty.channel.Channel r0 = r5.f     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto Lda
            boolean r2 = r0.isOpen()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto Ld5
            r1 = r0
        Ld5:
            if (r1 == 0) goto Lda
            r1.close()     // Catch: java.lang.Throwable -> L85
        Lda:
            io.netty.channel.EventLoopGroup r0 = r5.d     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto Le1
        Lde:
            r0.shutdownGracefully()     // Catch: java.lang.Throwable -> L85
        Le1:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L85
            monitor-exit(r5)
            return
        Le5:
            monitor-exit(r5)
            throw r0
    }

    private static final void p(com.bjtsn.base.v2.netty4android.client.d r2, io.netty.util.concurrent.Future r3) {
            boolean r3 = r3.isSuccess()
            r0 = 0
            if (r3 == 0) goto L16
            java.lang.String r3 = "连接成功"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r3, r1)
            int r3 = r2.h
            r2.i = r3
            r3 = 1
            r2.g = r3
            goto L26
        L16:
            r.b<com.bxkj.base.v2.netty4android.client.command.a> r3 = r2.e
            if (r3 == 0) goto L1d
            r3.c()
        L1d:
            java.lang.String r3 = "连接失败"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.orhanobut.logger.j.d(r3, r1)
            r2.g = r0
        L26:
            r2.k = r0
            return
    }

    private final void x() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "客户端主动重新连接"
            com.orhanobut.logger.j.d(r1, r0)
            boolean r0 = r2.j
            if (r0 == 0) goto L2c
            int r0 = r2.i
            if (r0 <= 0) goto L2c
            boolean r1 = r2.g
            if (r1 != 0) goto L2c
            int r0 = r0 + (-1)
            r2.i = r0
            long r0 = r2.f319l
            android.os.SystemClock.sleep(r0)
            boolean r0 = r2.j
            if (r0 == 0) goto L2c
            int r0 = r2.i
            if (r0 <= 0) goto L2c
            boolean r0 = r2.g
            if (r0 != 0) goto L2c
            r2.o()
        L2c:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.n1 B(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.n1> r4) {
            r2 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r4, r0)
            io.netty.channel.Channel r0 = r2.f
            if (r0 == 0) goto L21
            boolean r1 = r2.g
            if (r1 == 0) goto L1e
            io.netty.channel.ChannelFuture r3 = r0.writeAndFlush(r3)
            com.bjtsn.base.v2.netty4android.client.c r0 = new com.bjtsn.base.v2.netty4android.client.c
            r0.<init>(r4)
            r3.addListener(r0)
        L1e:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L21:
            r3 = 0
            return r3
    }

    public final void D(boolean r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public final void E(@org.jetbrains.annotations.NotNull r.b<com.bxkj.base.v2.netty4android.client.command.a> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.e = r2
            return
    }

    public final void n() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == 0) goto L5
            return
        L5:
            com.bjtsn.base.v2.netty4android.client.d$b r0 = new com.bjtsn.base.v2.netty4android.client.d$b
            r0.<init>(r1)
            r0.start()
            return
    }

    public final void q() {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "客户端主动断开连接"
            com.orhanobut.logger.j.d(r2, r1)
            r3.j = r0
            io.netty.channel.EventLoopGroup r0 = r3.d
            if (r0 == 0) goto L11
            r0.shutdownGracefully()
        L11:
            return
    }

    public final boolean r() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public final long s() {
            r2 = this;
            long r0 = r2.f320m
            return r0
    }

    public final int t() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public final int u() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public final long v() {
            r2 = this;
            long r0 = r2.f319l
            return r0
    }

    public final boolean w() {
            r1 = this;
            boolean r0 = r1.f321n
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final io.netty.channel.ChannelFuture y(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r4, @org.jetbrains.annotations.Nullable r.a r5) {
            r3 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r4, r0)
            io.netty.channel.Channel r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L23
            boolean r2 = r3.g
            if (r2 == 0) goto Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 == 0) goto L23
            r0.writeAndFlush(r4)
            io.netty.channel.ChannelFuture r4 = r0.writeAndFlush(r4)
            com.bjtsn.base.v2.netty4android.client.b r0 = new com.bjtsn.base.v2.netty4android.client.b
            r0.<init>(r5)
            io.netty.channel.ChannelFuture r4 = r4.addListener(r0)
            return r4
        L23:
            return r1
    }

    public final boolean z(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r3) {
            r2 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r3, r0)
            io.netty.channel.Channel r0 = r2.f
            if (r0 == 0) goto L1a
            boolean r1 = r2.g
            if (r1 == 0) goto L1a
            io.netty.channel.ChannelFuture r3 = r0.writeAndFlush(r3)
            io.netty.channel.ChannelFuture r3 = r3.awaitUninterruptibly()
            boolean r3 = r3.isSuccess()
            return r3
        L1a:
            r3 = 0
            return r3
    }
}
