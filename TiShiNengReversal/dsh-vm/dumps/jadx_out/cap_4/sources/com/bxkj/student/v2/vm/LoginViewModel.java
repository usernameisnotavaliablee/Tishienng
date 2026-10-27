package com.bxkj.student.v2.vm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/bxkj/student/v2/vm/LoginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LoginViewModel extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> h;

    @org.jetbrains.annotations.NotNull
    private androidx.databinding.ObservableField<java.lang.String> i;

    @org.jetbrains.annotations.NotNull
    private androidx.databinding.ObservableField<java.lang.String> j;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> k;

    /* renamed from: l, reason: collision with root package name */
    private int f1504l;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final kotlin.s f1505m;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final kotlin.s f1506n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$autoLogin$1", f = "LoginViewModel.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/bxkj/student/v2/vm/LoginViewModel$autoLogin$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;

        a(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.LoginViewModel$a r0 = new com.bxkj.student.v2.vm.LoginViewModel$a
                com.bxkj.student.v2.vm.LoginViewModel r1 = r2.b
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
                com.bxkj.student.v2.vm.LoginViewModel$a r2 = (com.bxkj.student.v2.vm.LoginViewModel.a) r2
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
                goto L32
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                com.bxkj.student.v2.repository.splash.b r5 = new com.bxkj.student.v2.repository.splash.b
                r5.<init>()
                com.bxkj.base.v2.data.b$a r1 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r1.a()
                java.lang.String r1 = r1.I()
                r4.a = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L32
                return r0
            L32:
                java.util.Map r5 = (java.util.Map) r5
                com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r0.a()
                java.lang.String r2 = "access_token"
                java.lang.Object r2 = r5.get(r2)
                java.lang.String r3 = ""
                if (r2 != 0) goto L45
                r2 = r3
            L45:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.e0(r2)
                com.bxkj.base.v2.data.b r0 = r0.a()
                java.lang.String r1 = "refresh_token"
                java.lang.Object r1 = r5.get(r1)
                if (r1 != 0) goto L59
                goto L5a
            L59:
                r3 = r1
            L5a:
                java.lang.String r1 = java.lang.String.valueOf(r3)
                r0.K0(r1)
                com.bxkj.student.v2.vm.LoginViewModel r0 = r4.b
                androidx.lifecycle.MutableLiveData r0 = r0.D()
                r0.postValue(r5)
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$autoLogin$2", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        b(kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.b> r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r2) {
                r1 = this;
                com.bxkj.student.v2.vm.LoginViewModel$b r0 = new com.bxkj.student.v2.vm.LoginViewModel$b
                r0.<init>(r2)
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
                com.bxkj.student.v2.vm.LoginViewModel$b r2 = (com.bxkj.student.v2.vm.LoginViewModel.b) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r3.a
                if (r0 != 0) goto L26
                kotlin.g0.n(r4)
                com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r0 = r4.a()
                r1 = 1
                r0.z0(r1)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "登录页刷新Token成功"
                com.orhanobut.logger.j.d(r2, r0)
                com.bxkj.base.v2.data.b r4 = r4.a()
                r4.L0(r1)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
            L26:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$getFindPassword$1", f = "LoginViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> c;

        c(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.c> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.LoginViewModel$c r0 = new com.bxkj.student.v2.vm.LoginViewModel$c
                com.bxkj.student.v2.vm.LoginViewModel r1 = r3.b
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r2 = r3.c
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
                com.bxkj.student.v2.vm.LoginViewModel$c r2 = (com.bxkj.student.v2.vm.LoginViewModel.c) r2
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
                com.bxkj.student.v2.vm.LoginViewModel r4 = r3.b
                com.bxkj.student.v2.repository.a r4 = com.bxkj.student.v2.vm.LoginViewModel.v(r4)
                r3.a = r2
                java.lang.Object r4 = r4.b(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                com.bxkj.base.v2.http.result.ApiResult r4 = (com.bxkj.base.v2.http.result.ApiResult) r4
                if (r4 == 0) goto L34
                java.lang.Object r4 = r4.apiData()
                java.util.Map r4 = (java.util.Map) r4
                goto L35
            L34:
                r4 = 0
            L35:
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "name"
                java.lang.String r1 = r0.t(r4, r1)
                java.lang.String r2 = "linkUrl"
                java.lang.String r4 = r0.t(r4, r2)
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r0 = r3.c
                r0.invoke(r1, r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$getHelpUrl$1", f = "LoginViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> c;

        d(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.d> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.LoginViewModel$d r0 = new com.bxkj.student.v2.vm.LoginViewModel$d
                com.bxkj.student.v2.vm.LoginViewModel r1 = r3.b
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r2 = r3.c
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
                com.bxkj.student.v2.vm.LoginViewModel$d r2 = (com.bxkj.student.v2.vm.LoginViewModel.d) r2
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
                com.bxkj.student.v2.vm.LoginViewModel r4 = r3.b
                com.bxkj.student.v2.repository.a r4 = com.bxkj.student.v2.vm.LoginViewModel.v(r4)
                r3.a = r2
                java.lang.Object r4 = r4.c(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                com.bxkj.base.v2.http.result.ApiResult r4 = (com.bxkj.base.v2.http.result.ApiResult) r4
                if (r4 == 0) goto L34
                java.lang.Object r4 = r4.apiData()
                java.util.Map r4 = (java.util.Map) r4
                goto L35
            L34:
                r4 = 0
            L35:
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "name"
                java.lang.String r1 = r0.t(r4, r1)
                java.lang.String r2 = "linkUrl"
                java.lang.String r4 = r0.t(r4, r2)
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r0 = r3.c
                r0.invoke(r1, r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$getLoginNeedAuth$1", f = "LoginViewModel.kt", i = {1}, l = {34, 37}, m = "invokeSuspend", n = {"resultDataMap"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel c;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$getLoginNeedAuth$1$1", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> b;
            final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> c;

            a(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r1, java.util.Map<java.lang.String, java.lang.Object> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.e.a> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    com.bxkj.student.v2.vm.LoginViewModel$e$a r3 = new com.bxkj.student.v2.vm.LoginViewModel$e$a
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r0 = r2.b
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r2.c
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
                    com.bxkj.student.v2.vm.LoginViewModel$e$a r1 = (com.bxkj.student.v2.vm.LoginViewModel.e.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    r3 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r3.a
                    if (r0 != 0) goto L1c
                    kotlin.g0.n(r4)
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r4 = r3.b
                    com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r3.c
                    java.lang.String r2 = "loginTypes"
                    java.lang.String r0 = r0.t(r1, r2)
                    r4.invoke(r0)
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
                L1c:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
            }
        }

        e(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.e> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.vm.LoginViewModel$e r3 = new com.bxkj.student.v2.vm.LoginViewModel$e
                com.bxkj.student.v2.vm.LoginViewModel r0 = r2.c
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r1 = r2.d
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
                com.bxkj.student.v2.vm.LoginViewModel$e r1 = (com.bxkj.student.v2.vm.LoginViewModel.e) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r7)     // Catch: java.lang.Exception -> L16
                goto L73
            L16:
                r7 = move-exception
                goto L69
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.g0.n(r7)     // Catch: java.lang.Exception -> L16
                goto L36
            L24:
                kotlin.g0.n(r7)
                com.bxkj.student.v2.vm.LoginViewModel r7 = r6.c     // Catch: java.lang.Exception -> L16
                com.bxkj.student.v2.repository.b r7 = com.bxkj.student.v2.vm.LoginViewModel.w(r7)     // Catch: java.lang.Exception -> L16
                r6.b = r3     // Catch: java.lang.Exception -> L16
                java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Exception -> L16
                if (r7 != r0) goto L36
                goto L68
            L36:
                java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L16
                com.bxkj.student.v2.vm.LoginViewModel r1 = r6.c     // Catch: java.lang.Exception -> L16
                androidx.lifecycle.MutableLiveData r1 = r1.C()     // Catch: java.lang.Exception -> L16
                r1.postValue(r7)     // Catch: java.lang.Exception -> L16
                com.bxkj.student.v2.vm.LoginViewModel r1 = r6.c     // Catch: java.lang.Exception -> L16
                com.bxkj.base.v2.common.utils.x r3 = com.bxkj.base.v2.common.utils.x.a     // Catch: java.lang.Exception -> L16
                java.lang.String r4 = "isOpenRoleAuthAudit"
                int r3 = r3.k(r7, r4)     // Catch: java.lang.Exception -> L16
                r1.Q(r3)     // Catch: java.lang.Exception -> L16
                kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()     // Catch: java.lang.Exception -> L16
                com.bxkj.student.v2.vm.LoginViewModel$e$a r3 = new com.bxkj.student.v2.vm.LoginViewModel$e$a     // Catch: java.lang.Exception -> L16
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.n1> r4 = r6.d     // Catch: java.lang.Exception -> L16
                r5 = 0
                r3.<init>(r4, r7, r5)     // Catch: java.lang.Exception -> L16
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.j.a(r7)     // Catch: java.lang.Exception -> L16
                r6.a = r7     // Catch: java.lang.Exception -> L16
                r6.b = r2     // Catch: java.lang.Exception -> L16
                java.lang.Object r7 = kotlinx.coroutines.i.h(r1, r3, r6)     // Catch: java.lang.Exception -> L16
                if (r7 != r0) goto L73
            L68:
                return r0
            L69:
                java.lang.String r7 = com.bxkj.base.v2.common.ext.e.a(r7)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.orhanobut.logger.j.e(r7, r0)
            L73:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$getPhoneLoginUrl$1", f = "LoginViewModel.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> c;

        f(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.f> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.LoginViewModel$f r0 = new com.bxkj.student.v2.vm.LoginViewModel$f
                com.bxkj.student.v2.vm.LoginViewModel r1 = r3.b
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r2 = r3.c
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
                com.bxkj.student.v2.vm.LoginViewModel$f r2 = (com.bxkj.student.v2.vm.LoginViewModel.f) r2
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
                com.bxkj.student.v2.vm.LoginViewModel r4 = r3.b
                com.bxkj.student.v2.repository.a r4 = com.bxkj.student.v2.vm.LoginViewModel.v(r4)
                r3.a = r2
                java.lang.Object r4 = r4.d(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                com.bxkj.base.v2.http.result.ApiResult r4 = (com.bxkj.base.v2.http.result.ApiResult) r4
                if (r4 == 0) goto L34
                java.lang.Object r4 = r4.apiData()
                java.util.Map r4 = (java.util.Map) r4
                goto L35
            L34:
                r4 = 0
            L35:
                com.bxkj.base.v2.common.utils.x r0 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r1 = "name"
                java.lang.String r1 = r0.t(r4, r1)
                java.lang.String r2 = "linkUrl"
                java.lang.String r4 = r0.t(r4, r2)
                kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.n1> r0 = r3.c
                r0.invoke(r1, r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$login$1", f = "LoginViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;

        g(com.bxkj.student.v2.vm.LoginViewModel r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.g> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.LoginViewModel$g r0 = new com.bxkj.student.v2.vm.LoginViewModel$g
                com.bxkj.student.v2.vm.LoginViewModel r1 = r2.b
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
                com.bxkj.student.v2.vm.LoginViewModel$g r2 = (com.bxkj.student.v2.vm.LoginViewModel.g) r2
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
                com.bxkj.student.v2.vm.LoginViewModel r4 = r3.b
                com.bxkj.student.v2.repository.b r4 = com.bxkj.student.v2.vm.LoginViewModel.w(r4)
                r3.a = r2
                java.lang.Object r4 = r4.c(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                java.util.Map r4 = (java.util.Map) r4
                com.bxkj.student.v2.vm.LoginViewModel r0 = r3.b
                r0.L(r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$loginThird$1", f = "LoginViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;

        h(com.bxkj.student.v2.vm.LoginViewModel r1, java.lang.String r2, java.lang.String r3, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.h> r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r1 = 1
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r5) {
                r4 = this;
                com.bxkj.student.v2.vm.LoginViewModel$h r0 = new com.bxkj.student.v2.vm.LoginViewModel$h
                com.bxkj.student.v2.vm.LoginViewModel r1 = r4.b
                java.lang.String r2 = r4.c
                java.lang.String r3 = r4.d
                r0.<init>(r1, r2, r3, r5)
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
                com.bxkj.student.v2.vm.LoginViewModel$h r2 = (com.bxkj.student.v2.vm.LoginViewModel.h) r2
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
                goto L2d
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                com.bxkj.student.v2.vm.LoginViewModel r5 = r4.b
                com.bxkj.student.v2.repository.b r5 = com.bxkj.student.v2.vm.LoginViewModel.w(r5)
                java.lang.String r1 = r4.c
                java.lang.String r3 = r4.d
                r4.a = r2
                java.lang.Object r5 = r5.d(r1, r3, r4)
                if (r5 != r0) goto L2d
                return r0
            L2d:
                java.util.Map r5 = (java.util.Map) r5
                com.bxkj.student.v2.vm.LoginViewModel r0 = r4.b
                r0.L(r5)
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$loginThirdCheck$1", f = "LoginViewModel.kt", i = {1, 1}, l = {90, 93}, m = "invokeSuspend", n = {"it", "$i$a$-let-LoginViewModel$loginThirdCheck$1$1"}, s = {"L$0", "I$0"})
    static final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        int c;
        final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel d;
        final /* synthetic */ java.lang.String e;
        final /* synthetic */ java.lang.String f;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> g;
        final /* synthetic */ androidx.fragment.app.FragmentActivity h;
        final /* synthetic */ java.lang.String i;
        final /* synthetic */ java.lang.String j;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.LoginViewModel$loginThirdCheck$1$1$1", f = "LoginViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ androidx.fragment.app.FragmentActivity b;
            final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> c;
            final /* synthetic */ java.lang.String d;
            final /* synthetic */ java.lang.String e;
            final /* synthetic */ java.lang.String f;
            final /* synthetic */ java.lang.String g;
            final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel h;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.bxkj.student.v2.vm.LoginViewModel$i$a$a, reason: collision with other inner class name */
            public static final class C0167a implements t.b.a {
                final /* synthetic */ com.bxkj.student.v2.vm.LoginViewModel a;
                final /* synthetic */ java.lang.String b;
                final /* synthetic */ java.lang.String c;

                C0167a(com.bxkj.student.v2.vm.LoginViewModel r1, java.lang.String r2, java.lang.String r3) {
                        r0 = this;
                        r0.a = r1
                        r0.b = r2
                        r0.c = r3
                        r0.<init>()
                        return
                }

                @Override // t.b.a
                public void a(int r3, android.content.Intent r4) {
                        r2 = this;
                        r4 = -1
                        if (r3 != r4) goto L19
                        com.bxkj.student.v2.vm.LoginViewModel r3 = r2.a
                        java.lang.String r4 = r2.b
                        java.lang.String r0 = r2.c
                        java.lang.String r1 = "1"
                        boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                        if (r0 == 0) goto L14
                        java.lang.String r0 = "wechatlogin"
                        goto L16
                    L14:
                        java.lang.String r0 = "qqlogin"
                    L16:
                        r3.M(r4, r0)
                    L19:
                        return
                }
            }

            a(androidx.fragment.app.FragmentActivity r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.bxkj.student.v2.vm.LoginViewModel r7, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.i.a> r8) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.d = r3
                    r0.e = r4
                    r0.f = r5
                    r0.g = r6
                    r0.h = r7
                    r1 = 2
                    r0.<init>(r1, r8)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r10, kotlin.coroutines.e<?> r11) {
                    r9 = this;
                    com.bxkj.student.v2.vm.LoginViewModel$i$a r0 = new com.bxkj.student.v2.vm.LoginViewModel$i$a
                    androidx.fragment.app.FragmentActivity r1 = r9.b
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r9.c
                    java.lang.String r3 = r9.d
                    java.lang.String r4 = r9.e
                    java.lang.String r5 = r9.f
                    java.lang.String r6 = r9.g
                    com.bxkj.student.v2.vm.LoginViewModel r7 = r9.h
                    r8 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r0
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
                    com.bxkj.student.v2.vm.LoginViewModel$i$a r1 = (com.bxkj.student.v2.vm.LoginViewModel.i.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    r10 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r10.a
                    if (r0 != 0) goto L65
                    kotlin.g0.n(r11)
                    com.bxkj.student.v2.common.utils.h r11 = com.bxkj.student.v2.common.utils.h.a
                    androidx.fragment.app.FragmentActivity r0 = r10.b
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    r1.<init>()
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r10.c
                    java.lang.String r3 = r10.d
                    java.lang.String r4 = r10.e
                    java.lang.String r5 = r10.f
                    java.lang.String r6 = r10.g
                    com.bxkj.student.v2.vm.LoginViewModel r7 = r10.h
                    java.lang.String r8 = "name"
                    java.lang.String r9 = "身份认证"
                    r1.put(r8, r9)
                    com.bxkj.base.v2.common.utils.x r8 = com.bxkj.base.v2.common.utils.x.a
                    java.lang.String r9 = "data"
                    java.lang.String r2 = r8.t(r2, r9)
                    java.lang.String r8 = "linkUrl"
                    r1.put(r8, r2)
                    java.lang.String r2 = "openId"
                    r1.put(r2, r3)
                    java.lang.String r2 = "type"
                    r1.put(r2, r4)
                    java.lang.String r2 = "thirdName"
                    r1.put(r2, r5)
                    java.lang.String r2 = "thirdImage"
                    r1.put(r2, r6)
                    int r2 = r7.J()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)
                    java.lang.String r3 = "isOpenRoleAuthAudit"
                    r1.put(r3, r2)
                    kotlin.n1 r2 = kotlin.n1.a
                    com.bxkj.student.v2.vm.LoginViewModel$i$a$a r3 = new com.bxkj.student.v2.vm.LoginViewModel$i$a$a
                    com.bxkj.student.v2.vm.LoginViewModel r4 = r10.h
                    java.lang.String r5 = r10.d
                    java.lang.String r6 = r10.e
                    r3.<init>(r4, r5, r6)
                    r11.c(r0, r1, r3)
                    return r2
                L65:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
            }
        }

        i(com.bxkj.student.v2.vm.LoginViewModel r1, java.lang.String r2, java.lang.String r3, kotlin.jvm.functions.Function0<kotlin.n1> r4, androidx.fragment.app.FragmentActivity r5, java.lang.String r6, java.lang.String r7, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.LoginViewModel.i> r8) {
                r0 = this;
                r0.d = r1
                r0.e = r2
                r0.f = r3
                r0.g = r4
                r0.h = r5
                r0.i = r6
                r0.j = r7
                r1 = 1
                r0.<init>(r1, r8)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r10) {
                r9 = this;
                com.bxkj.student.v2.vm.LoginViewModel$i r0 = new com.bxkj.student.v2.vm.LoginViewModel$i
                com.bxkj.student.v2.vm.LoginViewModel r1 = r9.d
                java.lang.String r2 = r9.e
                java.lang.String r3 = r9.f
                kotlin.jvm.functions.Function0<kotlin.n1> r4 = r9.g
                androidx.fragment.app.FragmentActivity r5 = r9.h
                java.lang.String r6 = r9.i
                java.lang.String r7 = r9.j
                r8 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
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
                com.bxkj.student.v2.vm.LoginViewModel$i r2 = (com.bxkj.student.v2.vm.LoginViewModel.i) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r12.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r12.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r13)
                goto L85
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                kotlin.g0.n(r13)
                goto L38
            L22:
                kotlin.g0.n(r13)
                com.bxkj.student.v2.vm.LoginViewModel r13 = r12.d
                com.bxkj.student.v2.repository.b r13 = com.bxkj.student.v2.vm.LoginViewModel.w(r13)
                java.lang.String r1 = r12.e
                java.lang.String r4 = r12.f
                r12.c = r3
                java.lang.Object r13 = r13.e(r1, r4, r12)
                if (r13 != r0) goto L38
                goto L81
            L38:
                java.util.Map r13 = (java.util.Map) r13
                if (r13 == 0) goto L85
                java.util.Map r5 = kotlin.collections.i1.D0(r13)
                if (r5 == 0) goto L85
                kotlin.jvm.functions.Function0<kotlin.n1> r13 = r12.g
                androidx.fragment.app.FragmentActivity r4 = r12.h
                java.lang.String r6 = r12.e
                java.lang.String r7 = r12.f
                java.lang.String r8 = r12.i
                java.lang.String r9 = r12.j
                com.bxkj.student.v2.vm.LoginViewModel r10 = r12.d
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "code"
                int r3 = r1.k(r5, r3)
                if (r3 != 0) goto L82
                java.lang.String r3 = "data"
                java.lang.String r1 = r1.t(r5, r3)
                int r1 = r1.length()
                if (r1 <= 0) goto L82
                kotlinx.coroutines.p2 r13 = kotlinx.coroutines.g1.e()
                com.bxkj.student.v2.vm.LoginViewModel$i$a r3 = new com.bxkj.student.v2.vm.LoginViewModel$i$a
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.j.a(r5)
                r12.a = r1
                r1 = 0
                r12.b = r1
                r12.c = r2
                java.lang.Object r13 = kotlinx.coroutines.i.h(r13, r3, r12)
                if (r13 != r0) goto L85
            L81:
                return r0
            L82:
                r13.invoke()
            L85:
                kotlin.n1 r13 = kotlin.n1.a
                return r13
        }
    }

    public LoginViewModel() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.h = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r1.i = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r1.j = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.k = r0
            r0 = 1
            r1.f1504l = r0
            com.bxkj.student.v2.vm.a r0 = new com.bxkj.student.v2.vm.a
            r0.<init>(r1)
            kotlin.s r0 = kotlin.t.c(r0)
            r1.f1505m = r0
            com.bxkj.student.v2.vm.b r0 = new com.bxkj.student.v2.vm.b
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.f1506n = r0
            return
    }

    private final com.bxkj.student.v2.repository.a A() {
            r1 = this;
            kotlin.s r0 = r1.f1506n
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.a r0 = (com.bxkj.student.v2.repository.a) r0
            return r0
    }

    private final com.bxkj.student.v2.repository.b F() {
            r1 = this;
            kotlin.s r0 = r1.f1505m
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.b r0 = (com.bxkj.student.v2.repository.b) r0
            return r0
    }

    private static final com.bxkj.student.v2.repository.b O(com.bxkj.student.v2.vm.LoginViewModel r1) {
            com.bxkj.student.v2.repository.b r0 = new com.bxkj.student.v2.repository.b
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.b t(com.bxkj.student.v2.vm.LoginViewModel r0) {
            com.bxkj.student.v2.repository.b r0 = O(r0)
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.a u() {
            com.bxkj.student.v2.repository.a r0 = y()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.a v(com.bxkj.student.v2.vm.LoginViewModel r0) {
            com.bxkj.student.v2.repository.a r0 = r0.A()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.b w(com.bxkj.student.v2.vm.LoginViewModel r0) {
            com.bxkj.student.v2.repository.b r0 = r0.F()
            return r0
    }

    private final void x() {
            r11 = this;
            com.bxkj.student.v2.vm.LoginViewModel$a r1 = new com.bxkj.student.v2.vm.LoginViewModel$a
            r0 = 0
            r1.<init>(r11, r0)
            com.bxkj.student.v2.vm.LoginViewModel$b r5 = new com.bxkj.student.v2.vm.LoginViewModel$b
            r5.<init>(r0)
            r9 = 238(0xee, float:3.34E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private static final com.bxkj.student.v2.repository.a y() {
            com.bxkj.student.v2.repository.a r0 = new com.bxkj.student.v2.repository.a
            r0.<init>()
            return r0
    }

    public final void B(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.v2.vm.LoginViewModel$d r2 = new com.bxkj.student.v2.vm.LoginViewModel$d
            r0 = 0
            r2.<init>(r12, r13, r0)
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> C() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.h
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> D() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.k
            return r0
    }

    public final void E(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r8) {
            r7 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.v2.vm.LoginViewModel$e r4 = new com.bxkj.student.v2.vm.LoginViewModel$e
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> G() {
            r1 = this;
            androidx.databinding.ObservableField<java.lang.String> r0 = r1.j
            return r0
    }

    public final void H(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.v2.vm.LoginViewModel$f r2 = new com.bxkj.student.v2.vm.LoginViewModel$f
            r0 = 0
            r2.<init>(r12, r13, r0)
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.String> I() {
            r1 = this;
            androidx.databinding.ObservableField<java.lang.String> r0 = r1.i
            return r0
    }

    public final int J() {
            r1 = this;
            int r0 = r1.f1504l
            return r0
    }

    public final void K() {
            r13 = this;
            androidx.lifecycle.MutableLiveData r0 = r13.d()
            java.lang.String r1 = "正在登录..."
            r0.setValue(r1)
            com.bxkj.student.v2.vm.LoginViewModel$g r3 = new com.bxkj.student.v2.vm.LoginViewModel$g
            r0 = 0
            r3.<init>(r13, r0)
            r11 = 254(0xfe, float:3.56E-43)
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r13
            com.bxkj.base.v2.base.BaseViewModel.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public final void L(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "resultDataMap"
            kotlin.jvm.internal.g0.p(r6, r0)
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            r2 = 0
            r1.S0(r2)
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r2 = "user_id"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r3 = ""
            if (r2 != 0) goto L1e
            r2 = r3
        L1e:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.U0(r2)
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.R()
            int r1 = r1.length()
            if (r1 <= 0) goto La4
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r2 = "username"
            java.lang.Object r2 = r6.get(r2)
            if (r2 != 0) goto L40
            r2 = r3
        L40:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.W0(r2)
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r2 = "access_token"
            java.lang.Object r2 = r6.get(r2)
            if (r2 != 0) goto L54
            r2 = r3
        L54:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.e0(r2)
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r2 = "refresh_token"
            java.lang.Object r4 = r6.get(r2)
            if (r4 != 0) goto L68
            r4 = r3
        L68:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.K0(r4)
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.Object r2 = r6.get(r2)
            if (r2 != 0) goto L7a
            r2 = r3
        L7a:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.K0(r2)
            com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
            java.lang.String r2 = "dept_id"
            java.lang.String r6 = r1.t(r6, r2)
            double r1 = java.lang.Double.parseDouble(r6)
            int r6 = (int) r1
            com.bxkj.base.v2.data.b r1 = r0.a()
            r1.X0(r3)
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.k0(r6)
            r5.x()
            return
        La4:
            java.lang.String r0 = "code"
            java.lang.Object r0 = r6.get(r0)
            if (r0 != 0) goto Lad
            goto Lae
        Lad:
            r3 = r0
        Lae:
            java.lang.String r0 = "msg"
            java.lang.Object r6 = r6.get(r0)
            if (r6 != 0) goto Lb8
            java.lang.String r6 = "未知错误"
        Lb8:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto Ldb
            androidx.lifecycle.MutableLiveData r0 = r5.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "登录失败,"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.postValue(r6)
        Ldb:
            return
    }

    public final void M(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14) {
            r12 = this;
            java.lang.String r0 = "openId"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r14, r0)
            com.bxkj.student.v2.vm.LoginViewModel$h r2 = new com.bxkj.student.v2.vm.LoginViewModel$h
            r0 = 0
            r2.<init>(r12, r13, r14, r0)
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void N(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r13, @org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r18) {
            r12 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "openId"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "thirdName"
            r7 = r16
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "thirdImage"
            r8 = r17
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "success"
            r5 = r18
            kotlin.jvm.internal.g0.p(r5, r0)
            com.bxkj.student.v2.vm.LoginViewModel$i r1 = new com.bxkj.student.v2.vm.LoginViewModel$i
            r9 = 0
            r2 = r12
            r6 = r13
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r1
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void P(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.k = r2
            return
    }

    public final void Q(int r1) {
            r0 = this;
            r0.f1504l = r1
            return
    }

    public final void R(@org.jetbrains.annotations.NotNull androidx.databinding.ObservableField<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.j = r2
            return
    }

    public final void S(@org.jetbrains.annotations.NotNull androidx.databinding.ObservableField<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.i = r2
            return
    }

    public final void z(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "success"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.v2.vm.LoginViewModel$c r2 = new com.bxkj.student.v2.vm.LoginViewModel$c
            r0 = 0
            r2.<init>(r12, r13, r0)
            r10 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }
}
