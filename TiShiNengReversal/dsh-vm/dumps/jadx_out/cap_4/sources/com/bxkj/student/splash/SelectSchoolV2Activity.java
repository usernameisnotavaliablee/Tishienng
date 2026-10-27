package com.bxkj.student.splash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SelectSchoolV2Activity extends com.bxkj.base.v2.base.BaseActivity<com.bxkj.student.databinding.AcSchoolListV2Binding, com.bxkj.student.v2.vm.splash.SelectSchoolVM> {

    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> W;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s X;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.splash.SelectSchoolV2Activity$resetLocalData$1", f = "SelectSchoolV2Activity.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        a(kotlin.coroutines.e<? super com.bxkj.student.splash.SelectSchoolV2Activity.a> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r1, kotlin.coroutines.e<?> r2) {
                r0 = this;
                com.bxkj.student.splash.SelectSchoolV2Activity$a r1 = new com.bxkj.student.splash.SelectSchoolV2Activity$a
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
                com.bxkj.student.splash.SelectSchoolV2Activity$a r1 = (com.bxkj.student.splash.SelectSchoolV2Activity.a) r1
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
                goto L3f
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                com.bxkj.base.v2.data.b$a r4 = com.bxkj.base.v2.data.b.d
                com.bxkj.base.v2.data.b r1 = r4.a()
                r1.c()
                com.bxkj.base.v2.data.b r4 = r4.a()
                r4.d()
                com.bxkj.student.v2.common.db.AppDatabase$a r4 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase r4 = r4.a()
                com.bxkj.student.v2.common.db.dao.l r4 = r4.y()
                if (r4 == 0) goto L3f
                r3.a = r2
                java.lang.Object r4 = r4.a(r3)
                if (r4 != r0) goto L3f
                return r0
            L3f:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public SelectSchoolV2Activity() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = kotlin.collections.f0.J()
            r1.W = r0
            com.bxkj.student.splash.f r0 = new com.bxkj.student.splash.f
            r0.<init>(r1)
            kotlin.s r0 = kotlin.t.c(r0)
            r1.X = r0
            return
    }

    private final com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 L() {
            r1 = this;
            kotlin.s r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r0 = (com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1) r0
            return r0
    }

    private static final void M(com.bxkj.student.splash.SelectSchoolV2Activity r2, java.lang.String r3) {
            kotlin.jvm.internal.g0.m(r3)
            int r0 = r3.length()
            if (r0 != 0) goto L16
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r2 = r2.L()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.l(r3)
            return
        L16:
            int r0 = r3.length()
            r1 = 4
            if (r0 < r1) goto L2b
            com.bxkj.base.v2.base.BaseViewModel r0 = r2.C()
            com.bxkj.student.v2.vm.splash.SelectSchoolVM r0 = (com.bxkj.student.v2.vm.splash.SelectSchoolVM) r0
            com.bxkj.student.splash.e r1 = new com.bxkj.student.splash.e
            r1.<init>(r2)
            r0.w(r3, r1)
        L2b:
            return
    }

    private static final kotlin.n1 N(com.bxkj.student.splash.SelectSchoolV2Activity r1, java.util.List r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r1 = r1.L()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            r1.l(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final void O() {
            r7 = this;
            com.bxkj.base.v2.base.BaseViewModel r0 = r7.C()
            kotlinx.coroutines.r0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.c()
            com.bxkj.student.splash.SelectSchoolV2Activity$a r4 = new com.bxkj.student.splash.SelectSchoolV2Activity$a
            r0 = 0
            r4.<init>(r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.splash.SelectSchoolV2Activity r0, java.util.List r1) {
            kotlin.n1 r0 = N(r0, r1)
            return r0
    }

    public static /* synthetic */ void f(com.bxkj.student.splash.SelectSchoolV2Activity r0, java.lang.String r1) {
            M(r0, r1)
            return
    }

    public static /* synthetic */ com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 g(com.bxkj.student.splash.SelectSchoolV2Activity r0) {
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r0 = i(r0)
            return r0
    }

    public static final /* synthetic */ void h(com.bxkj.student.splash.SelectSchoolV2Activity r0) {
            r0.O()
            return
    }

    private static final com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 i(com.bxkj.student.splash.SelectSchoolV2Activity r2) {
            java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.W
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r1 = new com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.bxkj.base.v2.base.a
    public void o() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcSchoolListV2Binding r0 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r0
            com.bxkj.base.view.SearchView r0 = r0.searchView
            com.bxkj.student.splash.g r1 = new com.bxkj.student.splash.g
            r1.<init>(r2)
            r0.setOnSearchListener(r1)
            return
    }

    @Override // com.bxkj.base.v2.base.a
    public void s() {
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcSchoolListV2Binding r0 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r0
            r0.setActivity(r2)
            androidx.databinding.ViewDataBinding r0 = r2.K()
            com.bxkj.student.databinding.AcSchoolListV2Binding r0 = (com.bxkj.student.databinding.AcSchoolListV2Binding) r0
            com.bxkj.base.v2.common.view.EmptyRecyclerView r0 = r0.rvSchool
            com.bxkj.student.splash.SelectSchoolV2Activity$adapter$2$1 r1 = r2.L()
            r0.setAdapter(r1)
            return
    }
}
