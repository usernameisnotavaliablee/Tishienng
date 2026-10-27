package com.bxkj.student.v2.repository;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLoginRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRepository.kt\ncom/bxkj/student/v2/repository/LoginRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class b {

    @org.jetbrains.annotations.NotNull
    private com.bxkj.student.v2.vm.LoginViewModel a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.LoginRepository", f = "LoginRepository.kt", i = {}, l = {37}, m = "getLoginNeedAuth", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object a;
        final /* synthetic */ com.bxkj.student.v2.repository.b b;
        int c;

        a(com.bxkj.student.v2.repository.b r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.b.a> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.a = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                com.bxkj.student.v2.repository.b r2 = r1.b
                java.lang.Object r2 = r2.a(r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.repository.LoginRepository", f = "LoginRepository.kt", i = {0, 0}, l = {26}, m = "loginThirdCheck", n = {"openId", "type"}, s = {"L$0", "L$1"})
    /* renamed from: com.bxkj.student.v2.repository.b$b, reason: collision with other inner class name */
    static final class C0149b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ com.bxkj.student.v2.repository.b d;
        int e;

        C0149b(com.bxkj.student.v2.repository.b r1, kotlin.coroutines.e<? super com.bxkj.student.v2.repository.b.C0149b> r2) {
                r0 = this;
                r0.d = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                com.bxkj.student.v2.repository.b r2 = r1.d
                r0 = 0
                java.lang.Object r2 = r2.e(r0, r0, r1)
                return r2
        }
    }

    public b(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.LoginViewModel r2) {
            r1 = this;
            java.lang.String r0 = "loginViewModel"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.bxkj.student.v2.repository.b.a
            if (r0 == 0) goto L13
            r0 = r5
            com.bxkj.student.v2.repository.b$a r0 = (com.bxkj.student.v2.repository.b.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.b$a r0 = new com.bxkj.student.v2.repository.b$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.g0.n(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.g0.n(r5)
            com.bxkj.student.v2.retrofit.e r5 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r5 = r5.c()
            r0.c = r3
            java.lang.Object r5 = r5.v(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.bxkj.base.v2.http.result.ApiResult r5 = (com.bxkj.base.v2.http.result.ApiResult) r5
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.apiData()
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L4e:
            r5 = 0
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final com.bxkj.student.v2.vm.LoginViewModel b() {
            r1 = this;
            com.bxkj.student.v2.vm.LoginViewModel r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r12) {
            r11 = this;
            com.bxkj.student.v2.retrofit.e r0 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r1 = r0.c()
            com.bxkj.student.v2.vm.LoginViewModel r0 = r11.a
            androidx.databinding.ObservableField r0 = r0.I()
            java.lang.Object r0 = r0.get()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            com.bxkj.student.v2.vm.LoginViewModel r0 = r11.a
            androidx.databinding.ObservableField r0 = r0.G()
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2f
            com.bxkj.base.v2.common.utils.a$a r3 = com.bxkj.base.v2.common.utils.a.a
            java.lang.String r0 = r3.c(r0)
            java.lang.String r3 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r3)
        L2d:
            r3 = r0
            goto L31
        L2f:
            r0 = 0
            goto L2d
        L31:
            r9 = 60
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r12
            java.lang.Object r12 = com.bxkj.student.v2.retrofit.a.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r12) {
            r9 = this;
            com.bxkj.student.v2.retrofit.e r0 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r1 = r0.c()
            r7 = 6
            r8 = 0
            r3 = 0
            r4 = 0
            r2 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r10 = com.bxkj.student.v2.retrofit.a.n(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Map<java.lang.String, java.lang.Object>> r7) {
            r4 = this;
            boolean r0 = r7 instanceof com.bxkj.student.v2.repository.b.C0149b
            if (r0 == 0) goto L13
            r0 = r7
            com.bxkj.student.v2.repository.b$b r0 = (com.bxkj.student.v2.repository.b.C0149b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.bxkj.student.v2.repository.b$b r0 = new com.bxkj.student.v2.repository.b$b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.g0.n(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.g0.n(r7)
            com.bxkj.student.v2.retrofit.e r7 = com.bxkj.student.v2.retrofit.e.a
            com.bxkj.student.v2.retrofit.b r7 = r7.c()
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r5)
            r0.a = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.j.a(r6)
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = r7.J(r5, r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            com.bxkj.base.v2.http.result.ApiResult r7 = (com.bxkj.base.v2.http.result.ApiResult) r7
            if (r7 == 0) goto L62
            java.lang.Object r5 = r7.apiData()
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L62:
            r5 = 0
            return r5
    }

    public final void f(@org.jetbrains.annotations.NotNull com.bxkj.student.v2.vm.LoginViewModel r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.a = r2
            return
    }
}
