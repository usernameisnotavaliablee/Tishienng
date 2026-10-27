package com.bxkj.base.v2.netty4android.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNettySocketService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NettySocketService.kt\ncom/bxkj/base/v2/netty4android/service/NettySocketService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class NettySocketService extends androidx.lifecycle.LifecycleService {
    private final int a;
    private int b;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.base.v2.netty4android.client.heart.a c;

    @org.jetbrains.annotations.Nullable
    private com.bjtsn.base.v2.netty4android.client.d d;

    @org.jetbrains.annotations.NotNull
    private final com.bxkj.base.v2.netty4android.service.NettySocketService$refreshTokenBroadCastReceiver$1 e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.netty4android.service.NettySocketService$receiveCommand$1", f = "NettySocketService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.base.v2.netty4android.client.command.a b;

        a(com.bxkj.base.v2.netty4android.client.command.a r1, kotlin.coroutines.e<? super com.bxkj.base.v2.netty4android.service.NettySocketService.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.base.v2.netty4android.service.NettySocketService$a r2 = new com.bxkj.base.v2.netty4android.service.NettySocketService$a
                com.bxkj.base.v2.netty4android.client.command.a r0 = r1.b
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.base.v2.netty4android.service.NettySocketService$a r1 = (com.bxkj.base.v2.netty4android.service.NettySocketService.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L12
                kotlin.g0.n(r2)
                com.bxkj.base.v2.netty4android.client.command.a r2 = r1.b
                r2.a()
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L12:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements r.b<com.bxkj.base.v2.netty4android.client.command.a> {
        final /* synthetic */ com.bxkj.base.v2.netty4android.service.NettySocketService a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.netty4android.service.NettySocketService$startConnect$1$onClientStatusConnectChanged$1", f = "NettySocketService.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ com.bxkj.base.v2.netty4android.service.NettySocketService b;

            a(com.bxkj.base.v2.netty4android.service.NettySocketService r1, kotlin.coroutines.e<? super com.bxkj.base.v2.netty4android.service.NettySocketService.b.a> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.base.v2.netty4android.service.NettySocketService$b$a r2 = new com.bxkj.base.v2.netty4android.service.NettySocketService$b$a
                    com.bxkj.base.v2.netty4android.service.NettySocketService r0 = r1.b
                    r2.<init>(r0, r3)
                    return r2
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke(r1, r2)
                    return r1
            }

            public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    com.bxkj.base.v2.netty4android.service.NettySocketService$b$a r1 = (com.bxkj.base.v2.netty4android.service.NettySocketService.b.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r3.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r4)
                    goto L25
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.g0.n(r4)
                    r3.a = r2
                    r1 = 10000(0x2710, double:4.9407E-320)
                    java.lang.Object r4 = kotlinx.coroutines.a1.b(r1, r3)
                    if (r4 != r0) goto L25
                    return r0
                L25:
                    com.bxkj.base.v2.netty4android.service.NettySocketService r4 = r3.b
                    com.bxkj.base.v2.netty4android.service.NettySocketService.g(r4)
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
            }
        }

        b(com.bxkj.base.v2.netty4android.service.NettySocketService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // r.b
        public /* bridge */ /* synthetic */ void a(com.bxkj.base.v2.netty4android.client.command.a r1, int r2) {
                r0 = this;
                com.bxkj.base.v2.netty4android.client.command.a r1 = (com.bxkj.base.v2.netty4android.client.command.a) r1
                r0.d(r1, r2)
                return
        }

        @Override // r.b
        public void b(int r7, int r8) {
                r6 = this;
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "onClientStatusConnectChanged:"
                r8.append(r0)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r8, r1)
                if (r7 == 0) goto L63
                r8 = 1
                if (r7 == r8) goto L1d
                return
            L1d:
                com.bxkj.base.v2.data.b$a r7 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r8 = r7.a()
                long r0 = java.lang.System.currentTimeMillis()
                r8.s0(r0)
                com.bxkj.base.v2.netty4android.service.NettySocketService r8 = r6.a
                com.bxkj.base.v2.netty4android.client.command.b$a r0 = com.bxkj.base.v2.netty4android.client.command.b.a
                com.bxkj.base.v2.data.b r1 = r7.a()
                java.lang.String r1 = r1.S()
                com.bxkj.base.v2.data.b r2 = r7.a()
                java.lang.String r2 = r2.R()
                com.bxkj.base.v2.data.b r3 = r7.a()
                java.lang.String r3 = r3.D()
                com.bxkj.base.BaseApp r4 = com.bxkj.base.BaseApp.c()
                java.lang.String r4 = com.bxkj.base.util.b0.h(r4)
                java.lang.String r5 = "getVersionName(...)"
                kotlin.jvm.internal.g0.o(r4, r5)
                com.bxkj.base.v2.data.b r7 = r7.a()
                java.lang.String r5 = r7.J()
                com.bxkj.base.v2.netty4android.client.command.a r7 = r0.a(r1, r2, r3, r4, r5)
                r8.k(r7)
                return
            L63:
                java.lang.String r7 = "onClientStatusConnectChanged->连接断开"
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.orhanobut.logger.j.d(r7, r8)
                com.bxkj.base.v2.netty4android.service.NettySocketService r7 = r6.a
                com.bxkj.base.v2.netty4android.client.heart.a r7 = com.bxkj.base.v2.netty4android.service.NettySocketService.c(r7)
                if (r7 == 0) goto L75
                r7.a()
            L75:
                com.bxkj.base.v2.netty4android.service.NettySocketService r7 = r6.a
                androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
                kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
                com.bxkj.base.v2.netty4android.service.NettySocketService$b$a r3 = new com.bxkj.base.v2.netty4android.service.NettySocketService$b$a
                com.bxkj.base.v2.netty4android.service.NettySocketService r7 = r6.a
                r8 = 0
                r3.<init>(r7, r8)
                r4 = 2
                r5 = 0
                r2 = 0
                kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // r.b
        public void c() {
                r2 = this;
                com.bxkj.base.v2.netty4android.service.NettySocketService r0 = r2.a
                int r0 = com.bxkj.base.v2.netty4android.service.NettySocketService.d(r0)
                com.bxkj.base.v2.netty4android.service.NettySocketService r1 = r2.a
                int r0 = r0 + 1
                com.bxkj.base.v2.netty4android.service.NettySocketService.e(r1, r0)
                return
        }

        public void d(com.bxkj.base.v2.netty4android.client.command.a r1, int r2) {
                r0 = this;
                java.lang.String r2 = "msg"
                kotlin.jvm.internal.g0.p(r1, r2)
                com.bxkj.base.v2.netty4android.service.NettySocketService r2 = r0.a
                r2.j(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.base.v2.netty4android.service.NettySocketService$startGetSocketConfig$1", f = "NettySocketService.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.base.v2.netty4android.service.NettySocketService b;

        c(com.bxkj.base.v2.netty4android.service.NettySocketService r1, kotlin.coroutines.e<? super com.bxkj.base.v2.netty4android.service.NettySocketService.c> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.base.v2.netty4android.service.NettySocketService$c r2 = new com.bxkj.base.v2.netty4android.service.NettySocketService$c
                com.bxkj.base.v2.netty4android.service.NettySocketService r0 = r1.b
                r2.<init>(r0, r3)
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.base.v2.netty4android.service.NettySocketService$c r1 = (com.bxkj.base.v2.netty4android.service.NettySocketService.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.String r0 = "serverOpen"
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r8.a
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L1d
                if (r2 != r4) goto L15
                kotlin.g0.n(r9)     // Catch: java.lang.Exception -> L12
                goto L30
            L12:
                r9 = move-exception
                goto L94
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                kotlin.g0.n(r9)
                com.bxkj.base.v2.http.c r9 = com.bxkj.base.v2.http.c.a     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.http.b r9 = r9.b()     // Catch: java.lang.Exception -> L12
                r8.a = r4     // Catch: java.lang.Exception -> L12
                r2 = 0
                java.lang.Object r9 = com.bxkj.base.v2.http.a.a(r9, r2, r8, r4, r2)     // Catch: java.lang.Exception -> L12
                if (r9 != r1) goto L30
                return r1
            L30:
                com.bxkj.base.v2.http.result.ApiResult r9 = (com.bxkj.base.v2.http.result.ApiResult) r9     // Catch: java.lang.Exception -> L12
                if (r9 == 0) goto Lc0
                java.lang.Object r9 = r9.apiData()     // Catch: java.lang.Exception -> L12
                java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L12
                if (r9 == 0) goto Lc0
                com.bxkj.base.v2.netty4android.service.NettySocketService r1 = r8.b     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.data.b$a r2 = com.bxkj.base.v2.data.b.d     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.data.b r5 = r2.a()     // Catch: java.lang.Exception -> L12
                long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L12
                r5.Q0(r6)     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.data.b r5 = r2.a()     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.common.utils.x r6 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L12
                int r7 = r6.k(r9, r0)     // Catch: java.lang.Exception -> L12
                r5.R0(r7)     // Catch: java.lang.Exception -> L12
                int r0 = r6.k(r9, r0)     // Catch: java.lang.Exception -> L12
                if (r0 != r4) goto L89
                com.bxkj.base.v2.data.b r0 = r2.a()     // Catch: java.lang.Exception -> L12
                java.lang.String r4 = "ip"
                java.lang.String r4 = r6.t(r9, r4)     // Catch: java.lang.Exception -> L12
                r0.A0(r4)     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.data.b r0 = r2.a()     // Catch: java.lang.Exception -> L12
                java.lang.String r4 = "port"
                int r4 = r6.k(r9, r4)     // Catch: java.lang.Exception -> L12
                r0.B0(r4)     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.data.b r0 = r2.a()     // Catch: java.lang.Exception -> L12
                java.lang.String r2 = "secret"
                java.lang.String r9 = r6.t(r9, r2)     // Catch: java.lang.Exception -> L12
                r0.C0(r9)     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.netty4android.service.NettySocketService.f(r1)     // Catch: java.lang.Exception -> L12
                goto Lc0
            L89:
                java.lang.String r9 = "socket服务器设置sokect配置未开启"
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L12
                com.orhanobut.logger.j.m(r9, r0)     // Catch: java.lang.Exception -> L12
                com.bxkj.base.v2.netty4android.service.NettySocketService.b(r1)     // Catch: java.lang.Exception -> L12
                goto Lc0
            L94:
                boolean r0 = r9 instanceof retrofit2.HttpException
                if (r0 == 0) goto Laa
                r0 = r9
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                int r0 = r0.code()
                r1 = 401(0x191, float:5.62E-43)
                if (r0 != r1) goto Laa
                java.lang.String r0 = "由于获取sokect配置接口401，已经登录失效，请重新登录"
                java.lang.Object[] r1 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r0, r1)
            Laa:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "socket"
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.orhanobut.logger.j.e(r9, r0)
            Lc0:
                kotlin.n1 r9 = kotlin.n1.a
                return r9
        }
    }

    public NettySocketService() {
            r1 = this;
            r1.<init>()
            r0 = 5
            r1.a = r0
            com.bxkj.base.v2.netty4android.service.NettySocketService$refreshTokenBroadCastReceiver$1 r0 = new com.bxkj.base.v2.netty4android.service.NettySocketService$refreshTokenBroadCastReceiver$1
            r0.<init>(r1)
            r1.e = r0
            return
    }

    public static /* synthetic */ kotlin.n1 a(com.bxkj.base.v2.netty4android.client.command.a r0, boolean r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    public static final /* synthetic */ void b(com.bxkj.base.v2.netty4android.service.NettySocketService r0) {
            r0.h()
            return
    }

    public static final /* synthetic */ com.bxkj.base.v2.netty4android.client.heart.a c(com.bxkj.base.v2.netty4android.service.NettySocketService r0) {
            com.bxkj.base.v2.netty4android.client.heart.a r0 = r0.c
            return r0
    }

    public static final /* synthetic */ int d(com.bxkj.base.v2.netty4android.service.NettySocketService r0) {
            int r0 = r0.b
            return r0
    }

    public static final /* synthetic */ void e(com.bxkj.base.v2.netty4android.service.NettySocketService r0, int r1) {
            r0.b = r1
            return
    }

    public static final /* synthetic */ void f(com.bxkj.base.v2.netty4android.service.NettySocketService r0) {
            r0.m()
            return
    }

    public static final /* synthetic */ void g(com.bxkj.base.v2.netty4android.service.NettySocketService r0) {
            r0.n()
            return
    }

    private final void h() {
            r1 = this;
            com.bxkj.base.v2.netty4android.client.heart.a r0 = r1.c
            if (r0 == 0) goto L7
            r0.a()
        L7:
            r1.stopSelf()
            return
    }

    private final void i() {
            r1 = this;
            com.bjtsn.base.v2.netty4android.client.d r0 = r1.d
            if (r0 == 0) goto L7
            r0.q()
        L7:
            return
    }

    private static final kotlin.n1 l(com.bxkj.base.v2.netty4android.client.command.a r1, boolean r2) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r2 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " 消息发送失败"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r1, r2)
        L21:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void m() {
            r5 = this;
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            boolean r1 = r1.Y()
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r0 = "startSocketConnect->用户未登录，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L15:
            com.bxkj.base.v2.data.b r1 = r0.a()
            boolean r1 = r1.c0()
            if (r1 != 0) goto L27
            java.lang.String r0 = "startSocketConnect->用户Token未刷新成功，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L27:
            com.bxkj.base.v2.data.b r1 = r0.a()
            int r1 = r1.O()
            if (r1 != 0) goto L3c
            java.lang.String r0 = "startSocketConnect->服务器设置sokect配置未开启，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            r5.h()
            return
        L3c:
            int r1 = r5.b
            int r3 = r5.a
            if (r1 < r3) goto L4a
            java.lang.String r0 = "startSocketConnect->超过最大连接失败次数，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L4a:
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.B()
            int r1 = r1.length()
            if (r1 != 0) goto L63
            r5.h()
            java.lang.String r0 = "startSocketConnect->IP为空，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L63:
            com.bxkj.base.v2.data.b r1 = r0.a()
            int r1 = r1.C()
            if (r1 != 0) goto L78
            r5.h()
            java.lang.String r0 = "startSocketConnect->端口为空，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L78:
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.D()
            int r1 = r1.length()
            if (r1 != 0) goto L91
            r5.h()
            java.lang.String r0 = "startSocketConnect->秘钥为空，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L91:
            r5.i()
            com.bjtsn.base.v2.netty4android.client.d r1 = r5.d
            if (r1 != 0) goto Lde
            com.bjtsn.base.v2.netty4android.client.d$a r1 = new com.bjtsn.base.v2.netty4android.client.d$a
            r1.<init>()
            com.bxkj.base.v2.data.b r3 = r0.a()
            java.lang.String r3 = r3.B()
            com.bjtsn.base.v2.netty4android.client.d$a r1 = r1.d(r3)
            com.bxkj.base.v2.data.b r0 = r0.a()
            int r0 = r0.C()
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r1.i(r0)
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.f(r2)
            r3 = 0
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.g(r3)
            r1 = 1
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.h(r1)
            r3 = 60
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.c(r3)
            com.bxkj.base.v2.netty4android.client.command.b$a r1 = com.bxkj.base.v2.netty4android.client.command.b.a
            com.bxkj.base.v2.netty4android.client.command.a r1 = r1.b()
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.b(r1)
            com.bjtsn.base.v2.netty4android.client.d$a r0 = r0.e(r2)
            com.bjtsn.base.v2.netty4android.client.d r0 = r0.a()
            r5.d = r0
        Lde:
            com.bjtsn.base.v2.netty4android.client.d r0 = r5.d
            if (r0 == 0) goto Lfb
            boolean r0 = r0.r()
            if (r0 != 0) goto Lfb
            com.bjtsn.base.v2.netty4android.client.d r0 = r5.d
            if (r0 == 0) goto Lef
            r0.n()
        Lef:
            com.bjtsn.base.v2.netty4android.client.d r0 = r5.d
            if (r0 == 0) goto Lfb
            com.bxkj.base.v2.netty4android.service.NettySocketService$b r1 = new com.bxkj.base.v2.netty4android.service.NettySocketService$b
            r1.<init>(r5)
            r0.E(r1)
        Lfb:
            return
    }

    private final void n() {
            r8 = this;
            com.bjtsn.base.v2.netty4android.client.d r0 = r8.d
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.r()
            r2 = 1
            if (r0 != r2) goto L14
            java.lang.String r0 = "getAppSocketServer->socket已经连接，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L14:
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r2 = r0.a()
            boolean r2 = r2.Y()
            if (r2 != 0) goto L28
            java.lang.String r0 = "getAppSocketServer->用户未登录，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L28:
            com.bxkj.base.v2.data.b r2 = r0.a()
            boolean r2 = r2.c0()
            if (r2 != 0) goto L3a
            java.lang.String r0 = "getAppSocketServer->用户Token未刷新成功，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L3a:
            int r2 = r8.b
            int r3 = r8.a
            if (r2 < r3) goto L48
            java.lang.String r0 = "getAppSocketServer->超过最大连接失败次数，不再连接"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            return
        L48:
            com.bxkj.base.v2.data.b r0 = r0.a()
            long r2 = r0.N()
            boolean r0 = com.bxkj.base.v2.common.ext.g.f(r2)
            if (r0 == 0) goto L61
            java.lang.String r0 = "getAppSocketServer->当天只调用一次接口"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.orhanobut.logger.j.e(r0, r1)
            r8.m()
            return
        L61:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r8)
            kotlinx.coroutines.m0 r3 = kotlinx.coroutines.g1.c()
            com.bxkj.base.v2.netty4android.service.NettySocketService$c r5 = new com.bxkj.base.v2.netty4android.service.NettySocketService$c
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 2
            r7 = 0
            r4 = 0
            kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            return
    }

    public final void j(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r10) {
            r9 = this;
            java.lang.String r0 = "command"
            kotlin.jvm.internal.g0.p(r10, r0)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r0 = r0.a()
            long r1 = java.lang.System.currentTimeMillis()
            r0.s0(r1)
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r9)
            kotlinx.coroutines.m0 r4 = kotlinx.coroutines.g1.c()
            com.bxkj.base.v2.netty4android.service.NettySocketService$a r6 = new com.bxkj.base.v2.netty4android.service.NettySocketService$a
            r0 = 0
            r6.<init>(r10, r0)
            r7 = 2
            r8 = 0
            r5 = 0
            kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
            return
    }

    public final void k(@org.jetbrains.annotations.NotNull com.bxkj.base.v2.netty4android.client.command.a r3) {
            r2 = this;
            java.lang.String r0 = "command"
            kotlin.jvm.internal.g0.p(r3, r0)
            com.bjtsn.base.v2.netty4android.client.d r0 = r2.d
            if (r0 == 0) goto L11
            com.bxkj.base.v2.netty4android.service.b r1 = new com.bxkj.base.v2.netty4android.service.b
            r1.<init>(r3)
            r0.B(r3, r1)
        L11:
            return
    }

    public void onCreate() {
            r4 = this;
            super.onCreate()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".REFRESH_TOKEN_FINISH"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            com.bxkj.base.v2.netty4android.service.NettySocketService$refreshTokenBroadCastReceiver$1 r1 = r4.e
            com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
            java.lang.String r2 = r2.getPackageName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ".sports.permissions.V3_Sports_BROADCAST"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r4.registerReceiver(r1, r0, r2, r3)
            return
    }

    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bxkj.base.v2.netty4android.service.NettySocketService$refreshTokenBroadCastReceiver$1 r0 = r1.e
            r1.unregisterReceiver(r0)
            return
    }

    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r2, int r3, int r4) {
            r1 = this;
            super.onStartCommand(r2, r3, r4)
            com.bxkj.base.v2.netty4android.client.heart.a r3 = r1.c
            if (r3 != 0) goto L15
            com.bxkj.base.v2.netty4android.client.heart.a r3 = new com.bxkj.base.v2.netty4android.client.heart.a
            com.bxkj.base.BaseApp r4 = com.bxkj.base.BaseApp.c()
            java.lang.String r0 = "getApp(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            r3.<init>(r4)
        L15:
            r1.c = r3
            r3.b()
            r3 = 1
            if (r2 == 0) goto L49
            java.lang.String r4 = "action"
            boolean r0 = r2.hasExtra(r4)
            if (r0 == 0) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L49
            r0 = 0
            int r2 = r2.getIntExtra(r4, r0)
            if (r2 == r3) goto L3f
            r4 = 2
            if (r2 == r4) goto L34
            goto L49
        L34:
            java.lang.String r2 = "NettySocketService->ACTION_DISCONNECT"
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.orhanobut.logger.j.g(r2, r4)
            r1.i()
            goto L49
        L3f:
            java.lang.String r2 = "NettySocketService->ACTION_CONNECT"
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.orhanobut.logger.j.g(r2, r4)
            r1.n()
        L49:
            return r3
    }
}
