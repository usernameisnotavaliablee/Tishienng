package com.bxkj.student.v2.vm.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SelectSchoolVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.splash.SelectSchoolVM$searchSchool$1", f = "SelectSchoolVM.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSelectSchoolVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectSchoolVM.kt\ncom/bxkj/student/v2/vm/splash/SelectSchoolVM$searchSchool$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.splash.SelectSchoolVM b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>, kotlin.n1> d;

        a(com.bxkj.student.v2.vm.splash.SelectSchoolVM r1, java.lang.String r2, kotlin.jvm.functions.Function1<? super java.util.List<java.util.Map<java.lang.String, java.lang.Object>>, kotlin.n1> r3, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.splash.SelectSchoolVM.a> r4) {
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
                com.bxkj.student.v2.vm.splash.SelectSchoolVM$a r0 = new com.bxkj.student.v2.vm.splash.SelectSchoolVM$a
                com.bxkj.student.v2.vm.splash.SelectSchoolVM r1 = r4.b
                java.lang.String r2 = r4.c
                kotlin.jvm.functions.Function1<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>, kotlin.n1> r3 = r4.d
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
                com.bxkj.student.v2.vm.splash.SelectSchoolVM$a r2 = (com.bxkj.student.v2.vm.splash.SelectSchoolVM.a) r2
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
                goto L2b
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.student.v2.vm.splash.SelectSchoolVM r4 = r3.b
                com.bxkj.student.v2.repository.splash.a r4 = com.bxkj.student.v2.vm.splash.SelectSchoolVM.u(r4)
                java.lang.String r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r4.a(r1, r3)
                if (r4 != r0) goto L2b
                return r0
            L2b:
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L34
                kotlin.jvm.functions.Function1<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>, kotlin.n1> r0 = r3.d
                r0.invoke(r4)
            L34:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public SelectSchoolVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.vm.splash.a r0 = new com.bxkj.student.v2.vm.splash.a
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.h = r0
            return
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.splash.a t() {
            com.bxkj.student.v2.repository.splash.a r0 = x()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.splash.a u(com.bxkj.student.v2.vm.splash.SelectSchoolVM r0) {
            com.bxkj.student.v2.repository.splash.a r0 = r0.v()
            return r0
    }

    private final com.bxkj.student.v2.repository.splash.a v() {
            r1 = this;
            kotlin.s r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.splash.a r0 = (com.bxkj.student.v2.repository.splash.a) r0
            return r0
    }

    private static final com.bxkj.student.v2.repository.splash.a x() {
            com.bxkj.student.v2.repository.splash.a r0 = new com.bxkj.student.v2.repository.splash.a
            r0.<init>()
            return r0
    }

    public final void w(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<java.util.Map<java.lang.String, java.lang.Object>>, kotlin.n1> r12) {
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "finish"
            kotlin.jvm.internal.g0.p(r12, r0)
            com.bxkj.student.v2.vm.splash.SelectSchoolVM$a r2 = new com.bxkj.student.v2.vm.splash.SelectSchoolVM$a
            r0 = 0
            r2.<init>(r10, r11, r12, r0)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            com.bxkj.base.v2.base.BaseViewModel.l(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }
}
