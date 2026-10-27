package com.bxkj.student.v2.vm.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SplashVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final com.bxkj.student.v2.repository.splash.b h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$autoLogin$1", f = "SplashVM.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSplashVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashVM.kt\ncom/bxkj/student/v2/vm/splash/SplashVM$autoLogin$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.splash.SplashVM b;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef c;

        a(com.bxkj.student.v2.vm.splash.SplashVM r1, kotlin.jvm.internal.Ref.IntRef r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$a r0 = new com.bxkj.student.v2.vm.splash.SplashVM$a
                com.bxkj.student.v2.vm.splash.SplashVM r1 = r3.b
                kotlin.jvm.internal.Ref$IntRef r2 = r3.c
                r0.<init>(r1, r2, r4)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.splash.SplashVM$a r2 = (com.bxkj.student.v2.vm.splash.SplashVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r5)
                goto L33
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                com.bxkj.student.v2.vm.splash.SplashVM r5 = r4.b
                com.bxkj.student.v2.repository.splash.b r5 = com.bxkj.student.v2.vm.splash.SplashVM.t(r5)
                com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r1.a()
                java.lang.String r1 = r1.I()
                r4.a = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L33
                return r0
            L33:
                java.util.Map r5 = (java.util.Map) r5
                com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r0.a()
                java.lang.String r2 = "access_token"
                java.lang.Object r2 = r5.get(r2)
                java.lang.String r3 = ""
                if (r2 != 0) goto L46
                r2 = r3
            L46:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.e0(r2)
                com.bxkj.base.v2.data.b r1 = r0.a()
                java.lang.String r2 = "refresh_token"
                java.lang.Object r2 = r5.get(r2)
                if (r2 != 0) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                java.lang.String r2 = java.lang.String.valueOf(r3)
                r1.K0(r2)
                kotlin.jvm.internal.Ref$IntRef r1 = r4.c
                com.bxkj.base.v2.common.utils.x r2 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "dept_id"
                java.lang.String r5 = r2.t(r5, r3)
                double r2 = java.lang.Double.parseDouble(r5)
                int r5 = (int) r2
                r1.element = r5
                com.bxkj.base.v2.data.b r5 = r0.a()
                kotlin.jvm.internal.Ref$IntRef r0 = r4.c
                int r0 = r0.element
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r5.k0(r0)
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$autoLogin$2", f = "SplashVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;

        b(kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.b> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                r1 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$b r0 = new com.bxkj.student.v2.vm.splash.SplashVM$b
                r0.<init>(r3)
                r0.b = r2
                return r0
        }

        public final java.lang.Object f(java.lang.Exception r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.vm.splash.SplashVM$b r1 = (com.bxkj.student.v2.vm.splash.SplashVM.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Exception r1 = (java.lang.Exception) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = r4.b
                java.lang.Exception r0 = (java.lang.Exception) r0
                kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.a
                if (r1 != 0) goto L49
                kotlin.g0.n(r5)
                boolean r5 = r0 instanceof retrofit2.HttpException
                r1 = 0
                if (r5 == 0) goto L44
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                int r5 = r0.code()
                r2 = 426(0x1aa, float:5.97E-43)
                if (r5 != r2) goto L44
                retrofit2.c0 r5 = r0.response()
                r0 = 0
                if (r5 == 0) goto L35
                okhttp3.Response r5 = r5.i()
                if (r5 == 0) goto L35
                okhttp3.Request r5 = r5.request()
                if (r5 == 0) goto L35
                okhttp3.HttpUrl r5 = r5.url()
                goto L36
            L35:
                r5 = r0
            L36:
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r2 = "grant_type=refresh_token"
                r3 = 2
                boolean r5 = kotlin.text.u.l3(r5, r2, r1, r3, r0)
                if (r5 == 0) goto L44
                r1 = 1
            L44:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r1)
                return r5
            L49:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$autoLogin$3", f = "SplashVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef c;

        c(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r1, kotlin.jvm.internal.Ref.IntRef r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.c> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$c r0 = new com.bxkj.student.v2.vm.splash.SplashVM$c
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$IntRef r2 = r3.c
                r0.<init>(r1, r2, r4)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.splash.SplashVM$c r2 = (com.bxkj.student.v2.vm.splash.SplashVM.c) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L1a
                kotlin.g0.n(r2)
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$IntRef r0 = r1.c
                int r0 = r0.element
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.f(r0)
                r2.invoke(r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L1a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$getAppId$1", f = "SplashVM.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSplashVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashVM.kt\ncom/bxkj/student/v2/vm/splash/SplashVM$getAppId$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.splash.SplashVM b;

        d(com.bxkj.student.v2.vm.splash.SplashVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.d> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$d r0 = new com.bxkj.student.v2.vm.splash.SplashVM$d
                com.bxkj.student.v2.vm.splash.SplashVM r1 = r2.b
                r0.<init>(r1, r3)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.splash.SplashVM$d r2 = (com.bxkj.student.v2.vm.splash.SplashVM.d) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.student.v2.vm.splash.SplashVM r4 = r3.b
                com.bxkj.student.v2.repository.splash.b r4 = com.bxkj.student.v2.vm.splash.SplashVM.t(r4)
                r3.a = r2
                java.lang.Object r4 = r4.b(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L36
                com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r0 = r0.a()
                r0.h0(r4)
            L36:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$getSchoolInfo$1", f = "SplashVM.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.splash.SplashVM b;

        e(com.bxkj.student.v2.vm.splash.SplashVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.e> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$e r0 = new com.bxkj.student.v2.vm.splash.SplashVM$e
                com.bxkj.student.v2.vm.splash.SplashVM r1 = r2.b
                r0.<init>(r1, r3)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        public final java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r2) {
                r1 = this;
                kotlin.coroutines.e r2 = r1.create(r2)
                com.bxkj.student.v2.vm.splash.SplashVM$e r2 = (com.bxkj.student.v2.vm.splash.SplashVM.e) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r7)
                goto L29
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.g0.n(r7)
                com.bxkj.student.v2.vm.splash.SplashVM r7 = r6.b
                com.bxkj.student.v2.repository.splash.b r7 = com.bxkj.student.v2.vm.splash.SplashVM.t(r7)
                r6.a = r2
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L29
                return r0
            L29:
                java.util.Map r7 = (java.util.Map) r7
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "schName"
                java.lang.String r1 = r0.t(r7, r1)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r4 = "sysType"
                int r4 = r0.k(r7, r4)
                r3.setSysType(r4)
                com.bxkj.base.v2.data.b$a r3 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r4 = r3.a()
                java.lang.String r5 = "isOpenLive"
                int r5 = r0.k(r7, r5)
                r4.G0(r5)
                com.bxkj.base.v2.data.b r4 = r3.a()
                java.lang.String r5 = "isOpenSQZS"
                int r5 = r0.l(r7, r5, r2)
                r4.I0(r5)
                com.bxkj.base.v2.data.b r4 = r3.a()
                java.lang.String r5 = "isOpenGGLBT"
                int r5 = r0.l(r7, r5, r2)
                r4.F0(r5)
                com.bxkj.base.v2.data.b r4 = r3.a()
                java.lang.String r5 = "isJiguangPush"
                int r2 = r0.l(r7, r5, r2)
                r4.V0(r2)
                com.bxkj.base.v2.data.b r2 = r3.a()
                java.lang.String r4 = "openPhoneLogin"
                r5 = 0
                int r4 = r0.l(r7, r4, r5)
                r2.H0(r4)
                com.bxkj.base.v2.data.b r2 = r3.a()
                java.lang.String r4 = "insideNetwork"
                int r4 = r0.k(r7, r4)
                r2.p0(r4)
                com.bxkj.base.v2.data.b r2 = r3.a()
                java.lang.String r4 = "insideNetworkMsg"
                java.lang.String r4 = r0.t(r7, r4)
                r2.q0(r4)
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                int r2 = r2.getSysType()
                r4 = 2
                if (r2 != r4) goto Ld6
                com.bxkj.base.v2.data.b r2 = r3.a()
                r2.O0(r1)
                com.bxkj.base.v2.data.b r1 = r3.a()
                java.lang.String r2 = "schoolCode"
                java.lang.String r2 = r0.t(r7, r2)
                r1.M0(r2)
                com.bxkj.base.v2.data.b r1 = r3.a()
                com.bxkj.student.v2.retrofit.b$a r2 = com.bxkj.student.v2.retrofit.b.a
                java.lang.String r2 = r2.a()
                java.lang.String r3 = "lan_url"
                java.lang.String r7 = r0.u(r7, r3, r2)
                r1.P0(r7)
                com.bxkj.student.v2.retrofit.e r7 = com.bxkj.student.v2.retrofit.e.a
                r7.b()
                goto L129
            Ld6:
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                r2.setSchoolName(r1)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = "isOpenKeep"
                int r2 = r0.k(r7, r2)
                r1.setIsOpenKeep(r2)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = "isOpenEncry"
                java.lang.String r2 = r0.t(r7, r2)
                r1.setIsOpenEncry(r2)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = "openId"
                java.lang.String r2 = r0.t(r7, r2)
                r1.setAppId(r2)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = "urlSite"
                java.lang.String r2 = r0.t(r7, r2)
                r1.setServerUrl(r2)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = "oldToNewH5"
                java.lang.String r7 = r0.t(r7, r2)
                r1.setOldToNewH5(r7)
                com.bxkj.base.user.LoginUser r7 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r7 = r7.getServerUrl()
                cn.bluemobi.dylan.http.Http.changeBaseUrl(r7)
            L129:
                com.bxkj.student.common.jpush.a r7 = com.bxkj.student.common.jpush.a.a
                r7.e()
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$getSchoolLogo$1", f = "SplashVM.kt", i = {2, 2}, l = {101, 109, 113}, m = "invokeSuspend", n = {"resultDataMap", "activateUrl"}, s = {"L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        final /* synthetic */ com.bxkj.student.v2.vm.splash.SplashVM d;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$getSchoolLogo$1$1", f = "SplashVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> b;

            a(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.f.a> r2) {
                    r0 = this;
                    r0.b = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r2, kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    com.bxkj.student.v2.vm.splash.SplashVM$f$a r2 = new com.bxkj.student.v2.vm.splash.SplashVM$f$a
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r0 = r1.b
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
                    com.bxkj.student.v2.vm.splash.SplashVM$f$a r1 = (com.bxkj.student.v2.vm.splash.SplashVM.f.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r2)
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r2 = r1.b
                    com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                    com.bxkj.base.v2.data.b r0 = r0.a()
                    java.lang.String r0 = r0.K()
                    r2.invoke(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L1c:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$getSchoolLogo$1$2", f = "SplashVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> b;
            final /* synthetic */ java.lang.String c;

            b(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.f.b> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.vm.splash.SplashVM$f$b r3 = new com.bxkj.student.v2.vm.splash.SplashVM$f$b
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r0 = r2.b
                    java.lang.String r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
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
                    com.bxkj.student.v2.vm.splash.SplashVM$f$b r1 = (com.bxkj.student.v2.vm.splash.SplashVM.f.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L14
                    kotlin.g0.n(r2)
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r2 = r1.b
                    java.lang.String r0 = r1.c
                    r2.invoke(r0)
                    kotlin.n1 r2 = kotlin.n1.a
                    return r2
                L14:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        f(com.bxkj.student.v2.vm.splash.SplashVM r1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.f> r3) {
                r0 = this;
                r0.d = r1
                r0.e = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$f r3 = new com.bxkj.student.v2.vm.splash.SplashVM$f
                com.bxkj.student.v2.vm.splash.SplashVM r0 = r2.d
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r1 = r2.e
                r3.<init>(r0, r1, r4)
                return r3
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
                com.bxkj.student.v2.vm.splash.SplashVM$f r1 = (com.bxkj.student.v2.vm.splash.SplashVM.f) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.c
                r2 = 0
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L2b
                if (r1 != r4) goto L23
                java.lang.Object r0 = r9.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r9.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r10)     // Catch: java.lang.Exception -> L20
                goto Lba
            L20:
                r10 = move-exception
                goto Lb1
            L23:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2b:
                kotlin.g0.n(r10)     // Catch: java.lang.Exception -> L20
                goto L73
            L2f:
                kotlin.g0.n(r10)     // Catch: java.lang.Exception -> L20
                goto L4a
            L33:
                kotlin.g0.n(r10)
                kotlinx.coroutines.p2 r10 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L20
                com.bxkj.student.v2.vm.splash.SplashVM$f$a r1 = new com.bxkj.student.v2.vm.splash.SplashVM$f$a     // Catch: java.lang.Exception -> L20
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r7 = r9.e     // Catch: java.lang.Exception -> L20
                r1.<init>(r7, r3)     // Catch: java.lang.Exception -> L20
                r9.c = r6     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = kotlinx.coroutines.i.h(r10, r1, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r0) goto L4a
                goto Lb0
            L4a:
                com.bxkj.base.v2.data.b$a r10 = com.bxkj.base.v2.data.b.d     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.data.b r10 = r10.a()     // Catch: java.lang.Exception -> L20
                long r6 = r10.y()     // Catch: java.lang.Exception -> L20
                boolean r10 = com.bxkj.base.v2.common.ext.g.f(r6)     // Catch: java.lang.Exception -> L20
                if (r10 == 0) goto L64
                java.lang.String r10 = "获取学校图标接口当天只调用一次"
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L20
                com.orhanobut.logger.j.e(r10, r0)     // Catch: java.lang.Exception -> L20
                kotlin.n1 r10 = kotlin.n1.a     // Catch: java.lang.Exception -> L20
                return r10
            L64:
                com.bxkj.student.v2.vm.splash.SplashVM r10 = r9.d     // Catch: java.lang.Exception -> L20
                com.bxkj.student.v2.repository.splash.b r10 = com.bxkj.student.v2.vm.splash.SplashVM.t(r10)     // Catch: java.lang.Exception -> L20
                r9.c = r5     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = r10.d(r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r0) goto L73
                goto Lb0
            L73:
                java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L20
                java.lang.String r5 = "activateUrl"
                java.lang.String r1 = r1.t(r10, r5)     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.data.b$a r5 = com.bxkj.base.v2.data.b.d     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.data.b r6 = r5.a()     // Catch: java.lang.Exception -> L20
                long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L20
                r6.w0(r7)     // Catch: java.lang.Exception -> L20
                com.bxkj.base.v2.data.b r5 = r5.a()     // Catch: java.lang.Exception -> L20
                r5.N0(r1)     // Catch: java.lang.Exception -> L20
                kotlinx.coroutines.p2 r5 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L20
                com.bxkj.student.v2.vm.splash.SplashVM$f$b r6 = new com.bxkj.student.v2.vm.splash.SplashVM$f$b     // Catch: java.lang.Exception -> L20
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r7 = r9.e     // Catch: java.lang.Exception -> L20
                r6.<init>(r7, r1, r3)     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r10)     // Catch: java.lang.Exception -> L20
                r9.a = r10     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.j.a(r1)     // Catch: java.lang.Exception -> L20
                r9.b = r10     // Catch: java.lang.Exception -> L20
                r9.c = r4     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = kotlinx.coroutines.i.h(r5, r6, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r0) goto Lba
            Lb0:
                return r0
            Lb1:
                java.lang.String r10 = com.bxkj.base.v2.common.ext.e.a(r10)
                java.lang.Object[] r0 = new java.lang.Object[r2]
                com.orhanobut.logger.j.e(r10, r0)
            Lba:
                kotlin.n1 r10 = kotlin.n1.a
                return r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SplashVM$preDownloadImage$1", f = "SplashVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSplashVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashVM.kt\ncom/bxkj/student/v2/vm/splash/SplashVM$preDownloadImage$1\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n29#2,2:165\n31#2:170\n13805#3:167\n13806#3:169\n1#4:168\n*S KotlinDebug\n*F\n+ 1 SplashVM.kt\ncom/bxkj/student/v2/vm/splash/SplashVM$preDownloadImage$1\n*L\n127#1:165,2\n127#1:170\n135#1:167\n135#1:169\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        g(kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SplashVM.g> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.v2.vm.splash.SplashVM$g r1 = new com.bxkj.student.v2.vm.splash.SplashVM$g
                r1.<init>(r2)
                return r1
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
                com.bxkj.student.v2.vm.splash.SplashVM$g r1 = (com.bxkj.student.v2.vm.splash.SplashVM.g) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                r14 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r14.a
                if (r0 != 0) goto Lfa
                kotlin.g0.n(r15)
                long r0 = java.lang.System.currentTimeMillis()
                r15 = 0
                java.lang.String r2 = "icon"
                java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L2e
                com.bxkj.student.App$a r4 = com.bxkj.student.App.d     // Catch: java.lang.Exception -> L2e
                com.bxkj.student.App r5 = r4.a()     // Catch: java.lang.Exception -> L2e
                java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Exception -> L2e
                java.lang.String r5 = r5.getPath()     // Catch: java.lang.Exception -> L2e
                r3.<init>(r5, r2)     // Catch: java.lang.Exception -> L2e
                boolean r5 = r3.exists()     // Catch: java.lang.Exception -> L2e
                if (r5 != 0) goto L31
                r3.mkdir()     // Catch: java.lang.Exception -> L2e
                goto L31
            L2e:
                r2 = move-exception
                goto Lc7
            L31:
                com.bxkj.student.App r4 = r4.a()     // Catch: java.lang.Exception -> L2e
                android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Exception -> L2e
                java.lang.String[] r4 = r4.list(r2)     // Catch: java.lang.Exception -> L2e
                if (r4 == 0) goto Ld0
                int r5 = r4.length     // Catch: java.lang.Exception -> L2e
                r6 = 0
            L41:
                if (r6 >= r5) goto Ld0
                r7 = r4[r6]     // Catch: java.lang.Exception -> L2e
                java.io.File r8 = new java.io.File     // Catch: java.lang.Exception -> L2e
                r8.<init>(r3, r7)     // Catch: java.lang.Exception -> L2e
                boolean r9 = r8.exists()     // Catch: java.lang.Exception -> L2e
                r10 = 0
                if (r9 != 0) goto L53
                r9 = r8
                goto L54
            L53:
                r9 = r10
            L54:
                if (r9 == 0) goto Lc3
                com.bxkj.student.App$a r9 = com.bxkj.student.App.d     // Catch: java.lang.Exception -> L9a
                com.bxkj.student.App r9 = r9.a()     // Catch: java.lang.Exception -> L9a
                android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Exception -> L9a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9a
                r11.<init>()     // Catch: java.lang.Exception -> L9a
                r11.append(r2)     // Catch: java.lang.Exception -> L9a
                java.lang.String r12 = "/"
                r11.append(r12)     // Catch: java.lang.Exception -> L9a
                r11.append(r7)     // Catch: java.lang.Exception -> L9a
                java.lang.String r7 = r11.toString()     // Catch: java.lang.Exception -> L9a
                java.io.InputStream r7 = r9.open(r7)     // Catch: java.lang.Exception -> L9a
                java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9c
                r9.<init>(r8)     // Catch: java.lang.Throwable -> L9c
                r11 = 4096(0x1000, float:5.74E-42)
                byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L8c
            L81:
                int r12 = r7.read(r11)     // Catch: java.lang.Throwable -> L8c
                r13 = -1
                if (r12 == r13) goto L8e
                r9.write(r11, r15, r12)     // Catch: java.lang.Throwable -> L8c
                goto L81
            L8c:
                r11 = move-exception
                goto L9e
            L8e:
                r9.flush()     // Catch: java.lang.Throwable -> L8c
                kotlin.n1 r11 = kotlin.n1.a     // Catch: java.lang.Throwable -> L8c
                kotlin.io.b.a(r9, r10)     // Catch: java.lang.Throwable -> L9c
                kotlin.io.b.a(r7, r10)     // Catch: java.lang.Exception -> L9a
                goto Lc3
            L9a:
                r7 = move-exception
                goto Laa
            L9c:
                r9 = move-exception
                goto La4
            L9e:
                throw r11     // Catch: java.lang.Throwable -> L9f
            L9f:
                r12 = move-exception
                kotlin.io.b.a(r9, r11)     // Catch: java.lang.Throwable -> L9c
                throw r12     // Catch: java.lang.Throwable -> L9c
            La4:
                throw r9     // Catch: java.lang.Throwable -> La5
            La5:
                r11 = move-exception
                kotlin.io.b.a(r7, r9)     // Catch: java.lang.Exception -> L9a
                throw r11     // Catch: java.lang.Exception -> L9a
            Laa:
                java.lang.String r7 = com.bxkj.base.v2.common.ext.e.a(r7)     // Catch: java.lang.Exception -> L2e
                java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L2e
                com.orhanobut.logger.j.e(r7, r9)     // Catch: java.lang.Exception -> L2e
                boolean r7 = r8.exists()     // Catch: java.lang.Exception -> L2e
                if (r7 != 0) goto Lba
                r10 = r8
            Lba:
                if (r10 == 0) goto Lc3
                boolean r7 = r8.delete()     // Catch: java.lang.Exception -> L2e
                kotlin.coroutines.jvm.internal.a.a(r7)     // Catch: java.lang.Exception -> L2e
            Lc3:
                int r6 = r6 + 1
                goto L41
            Lc7:
                java.lang.String r2 = com.bxkj.base.v2.common.ext.e.a(r2)
                java.lang.Object[] r3 = new java.lang.Object[r15]
                com.orhanobut.logger.j.e(r2, r3)
            Ld0:
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r0
                java.lang.String r0 = com.bxkj.student.run.app.utils.i.g(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "下载图标耗时 "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = "  "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                java.lang.Object[] r15 = new java.lang.Object[r15]
                com.orhanobut.logger.j.d(r0, r15)
                kotlin.n1 r15 = kotlin.n1.a
                return r15
            Lfa:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
        }
    }

    public SplashVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.repository.splash.b r0 = new com.bxkj.student.v2.repository.splash.b
            r0.<init>()
            r1.h = r0
            return
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.splash.b t(com.bxkj.student.v2.vm.splash.SplashVM r0) {
            com.bxkj.student.v2.repository.splash.b r0 = r0.h
            return r0
    }

    public final void u(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r12) {
            r11 = this;
            java.lang.String r0 = "finish"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
            r0.<init>()
            r1 = 1
            r0.element = r1
            com.bxkj.student.v2.vm.splash.SplashVM$a r3 = new com.bxkj.student.v2.vm.splash.SplashVM$a
            r1 = 0
            r3.<init>(r11, r0, r1)
            com.bxkj.student.v2.vm.splash.SplashVM$b r5 = new com.bxkj.student.v2.vm.splash.SplashVM$b
            r5.<init>(r1)
            com.bxkj.student.v2.vm.splash.SplashVM$c r7 = new com.bxkj.student.v2.vm.splash.SplashVM$c
            r7.<init>(r12, r0, r1)
            r9 = 42
            r10 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r11
            com.bxkj.base.v2.base.BaseViewModel.l(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void v() {
            r9 = this;
            com.bxkj.student.v2.vm.splash.SplashVM$d r1 = new com.bxkj.student.v2.vm.splash.SplashVM$d
            r0 = 0
            r1.<init>(r9, r0)
            r7 = 62
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            com.bxkj.base.v2.base.BaseViewModel.l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final void w() {
            r9 = this;
            com.bxkj.student.v2.vm.splash.SplashVM$e r1 = new com.bxkj.student.v2.vm.splash.SplashVM$e
            r0 = 0
            r1.<init>(r9, r0)
            r7 = 62
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            com.bxkj.base.v2.base.BaseViewModel.l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final void x(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r8) {
            r7 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.vm.splash.SplashVM$f r4 = new com.bxkj.student.v2.vm.splash.SplashVM$f
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void y() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.vm.splash.SplashVM$g r3 = new com.bxkj.student.v2.vm.splash.SplashVM$g
            r2 = 0
            r3.<init>(r2)
            r4 = 2
            r5 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }
}
