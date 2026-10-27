package com.bxkj.student.v2.vm.sports.set;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsRankVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.sports.set.SportsRankVM$getRankData$1", f = "SportsRankVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;

        a(kotlin.coroutines.e<? super com.bxkj.student.v2.vm.sports.set.SportsRankVM.a> r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r0, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r2) {
                r1 = this;
                com.bxkj.student.v2.vm.sports.set.SportsRankVM$a r0 = new com.bxkj.student.v2.vm.sports.set.SportsRankVM$a
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
                com.bxkj.student.v2.vm.sports.set.SportsRankVM$a r2 = (com.bxkj.student.v2.vm.sports.set.SportsRankVM.a) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto Ld
                kotlin.g0.n(r2)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            Ld:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public SportsRankVM() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.h = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> t() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.h
            return r0
    }

    public final void u() {
            r11 = this;
            com.bxkj.student.v2.vm.sports.set.SportsRankVM$a r1 = new com.bxkj.student.v2.vm.sports.set.SportsRankVM$a
            r0 = 0
            r1.<init>(r0)
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

    public final void v(@org.jetbrains.annotations.NotNull androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.h = r2
            return
    }
}
