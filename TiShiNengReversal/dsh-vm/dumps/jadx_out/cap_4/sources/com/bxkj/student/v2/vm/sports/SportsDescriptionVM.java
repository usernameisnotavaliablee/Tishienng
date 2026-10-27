package com.bxkj.student.v2.vm.sports;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsDescriptionVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.SportsDescriptionVM$getSportsDescription$1", f = "SportsDescriptionVM.kt", i = {1, 1, 1, 1}, l = {28, 32}, m = "invokeSuspend", n = {"result", "description", "it", "$i$a$-let-SportsDescriptionVM$getSportsDescription$1$1"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        int d;
        int e;
        final /* synthetic */ com.bxkj.student.v2.vm.sports.SportsDescriptionVM f;

        a(com.bxkj.student.v2.vm.sports.SportsDescriptionVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.SportsDescriptionVM.a> r2) {
                r0 = this;
                r0.f = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM$a r0 = new com.bxkj.student.v2.vm.sports.SportsDescriptionVM$a
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r1 = r2.f
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
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM$a r2 = (com.bxkj.student.v2.vm.sports.SportsDescriptionVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r7.c
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r7.a
                java.util.Map r0 = (java.util.Map) r0
                kotlin.g0.n(r8)
                goto L8a
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                kotlin.g0.n(r8)
                goto L3c
            L2a:
                kotlin.g0.n(r8)
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r8 = r7.f
                com.bxkj.student.v2.repository.sports.d r8 = com.bxkj.student.v2.vm.sports.SportsDescriptionVM.u(r8)
                r7.e = r3
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L3c
                goto L89
            L3c:
                java.util.Map r8 = (java.util.Map) r8
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r1 = r7.f
                androidx.lifecycle.MutableLiveData r1 = r1.v()
                r1.postValue(r8)
                com.bxkj.base.v2.common.utils.x r1 = com.bxkj.base.v2.common.utils.x.a
                java.lang.String r3 = "content"
                java.lang.String r1 = r1.t(r8, r3)
                com.bxkj.student.v2.common.db.AppDatabase$a r3 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r3 = r3.a()
                com.bxkj.student.v2.common.db.dao.w0 r3 = r3.A()
                if (r3 == 0) goto L8a
                l0.e r4 = new l0.e
                com.bxkj.base.v2.data.b$a r5 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r5 = r5.a()
                java.lang.String r5 = r5.R()
                java.lang.String r6 = "-2"
                r4.<init>(r5, r6, r1)
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r8)
                r7.a = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r1)
                r7.b = r8
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.j.a(r1)
                r7.c = r8
                r8 = 0
                r7.d = r8
                r7.e = r2
                java.lang.Object r8 = r3.insert(r4, r7)
                if (r8 != r0) goto L8a
            L89:
                return r0
            L8a:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.SportsDescriptionVM$getSportsDescription$2", f = "SportsDescriptionVM.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"e"}, s = {"L$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSportsDescriptionVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsDescriptionVM.kt\ncom/bxkj/student/v2/vm/sports/SportsDescriptionVM$getSportsDescription$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ com.bxkj.student.v2.vm.sports.SportsDescriptionVM c;

        b(com.bxkj.student.v2.vm.sports.SportsDescriptionVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.SportsDescriptionVM.b> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM$b r0 = new com.bxkj.student.v2.vm.sports.SportsDescriptionVM$b
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        public final java.lang.Object f(java.lang.Exception r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM$b r1 = (com.bxkj.student.v2.vm.sports.SportsDescriptionVM.b) r1
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
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r4.a
                r3 = 1
                if (r2 == 0) goto L1b
                if (r2 != r3) goto L13
                kotlin.g0.n(r5)
                goto L49
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.g0.n(r5)
                boolean r5 = com.bxkj.base.v2.common.ext.e.b(r0)
                r2 = 0
                if (r5 == 0) goto L77
                java.lang.String r5 = "离线跑步获取跑步说明"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.orhanobut.logger.j.d(r5, r2)
                com.bxkj.student.v2.common.db.AppDatabase$a r5 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r5 = r5.a()
                com.bxkj.student.v2.common.db.dao.w0 r5 = r5.A()
                if (r5 == 0) goto L6b
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.j.a(r0)
                r4.b = r0
                r4.a = r3
                java.lang.String r0 = "-2"
                java.lang.Object r5 = r5.b(r0, r4)
                if (r5 != r1) goto L49
                return r1
            L49:
                java.lang.String r5 = (java.lang.String) r5
                if (r5 == 0) goto L6b
                int r0 = r5.length()
                if (r0 <= 0) goto L54
                goto L55
            L54:
                r5 = 0
            L55:
                if (r5 == 0) goto L6b
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r0 = r4.c
                androidx.lifecycle.MutableLiveData r0 = r0.v()
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.lang.String r2 = "content"
                r1.put(r2, r5)
                r0.postValue(r1)
                goto L78
            L6b:
                com.bxkj.student.v2.vm.sports.SportsDescriptionVM r5 = r4.c
                androidx.lifecycle.MutableLiveData r5 = r5.f()
                java.lang.String r0 = "服务器维护中，请稍后再进行跑步"
                r5.postValue(r0)
                goto L78
            L77:
                r3 = 0
            L78:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
                return r5
        }
    }

    public SportsDescriptionVM() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.h = r0
            com.bxkj.student.v2.vm.sports.b r0 = new com.bxkj.student.v2.vm.sports.b
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.i = r0
            return
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.sports.d t() {
            com.bxkj.student.v2.repository.sports.d r0 = z()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.sports.d u(com.bxkj.student.v2.vm.sports.SportsDescriptionVM r0) {
            com.bxkj.student.v2.repository.sports.d r0 = r0.x()
            return r0
    }

    private final com.bxkj.student.v2.repository.sports.d x() {
            r1 = this;
            kotlin.s r0 = r1.i
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.sports.d r0 = (com.bxkj.student.v2.repository.sports.d) r0
            return r0
    }

    private static final com.bxkj.student.v2.repository.sports.d z() {
            com.bxkj.student.v2.repository.sports.d r0 = new com.bxkj.student.v2.repository.sports.d
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> v() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.h
            return r0
    }

    public final void w() {
            r11 = this;
            com.bxkj.student.v2.vm.sports.SportsDescriptionVM$a r1 = new com.bxkj.student.v2.vm.sports.SportsDescriptionVM$a
            r0 = 0
            r1.<init>(r11, r0)
            com.bxkj.student.v2.vm.sports.SportsDescriptionVM$b r3 = new com.bxkj.student.v2.vm.sports.SportsDescriptionVM$b
            r3.<init>(r11, r0)
            r9 = 250(0xfa, float:3.5E-43)
            r10 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void y(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }
}
