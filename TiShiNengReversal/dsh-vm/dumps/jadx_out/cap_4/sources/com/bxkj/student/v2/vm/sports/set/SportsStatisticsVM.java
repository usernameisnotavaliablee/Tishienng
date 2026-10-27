package com.bxkj.student.v2.vm.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsStatisticsVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s h;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> i;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$getLoginUserInfo$1", f = "SportsStatisticsVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSportsStatisticsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsStatisticsVM.kt\ncom/bxkj/student/v2/vm/sports/set/SportsStatisticsVM$getLoginUserInfo$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM b;

        a(com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$a r0 = new com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$a
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r1 = r2.b
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
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$a r2 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM.a) r2
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
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r4 = r3.b
                com.bxkj.student.v2.repository.c r4 = com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM.u(r4)
                r3.a = r2
                java.lang.Object r4 = r4.g(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                java.util.Map r4 = (java.util.Map) r4
                if (r4 == 0) goto L36
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = r3.b
                androidx.lifecycle.MutableLiveData r0 = r0.z()
                r0.postValue(r4)
            L36:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$getSportsStatistics$1", f = "SportsStatisticsVM.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM b;

        b(com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM.b> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$b r0 = new com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$b
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r1 = r2.b
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
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$b r2 = (com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM.b) r2
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
                goto L28
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.student.v2.repository.sports.h r4 = new com.bxkj.student.v2.repository.sports.h
                r4.<init>()
                r3.a = r2
                java.lang.Object r4 = r4.a(r3)
                if (r4 != r0) goto L28
                return r0
            L28:
                java.util.Map r4 = (java.util.Map) r4
                if (r4 == 0) goto L35
                com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0 = r3.b
                androidx.lifecycle.MutableLiveData r0 = r0.v()
                r0.postValue(r4)
            L35:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public SportsStatisticsVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.vm.sports.set.b r0 = new com.bxkj.student.v2.vm.sports.set.b
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.h = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.i = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.j = r0
            return
    }

    private static final com.bxkj.student.v2.repository.c A() {
            com.bxkj.student.v2.repository.c r0 = new com.bxkj.student.v2.repository.c
            r0.<init>()
            return r0
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.c t() {
            com.bxkj.student.v2.repository.c r0 = A()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.c u(com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM r0) {
            com.bxkj.student.v2.repository.c r0 = r0.x()
            return r0
    }

    private final com.bxkj.student.v2.repository.c x() {
            r1 = this;
            kotlin.s r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.c r0 = (com.bxkj.student.v2.repository.c) r0
            return r0
    }

    public final void B(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.j = r2
            return
    }

    public final void C(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.i = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> v() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.j
            return r0
    }

    public final void w() {
            r11 = this;
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$a r1 = new com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$a
            r0 = 0
            r1.<init>(r11, r0)
            r9 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void y() {
            r11 = this;
            com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$b r1 = new com.bxkj.student.v2.vm.sports.set.SportsStatisticsVM$b
            r0 = 0
            r1.<init>(r11, r0)
            r9 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            com.bxkj.base.v2.base.BaseViewModel.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> z() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.i
            return r0
    }
}
