package com.bxkj.student.v2.vm.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class H5VM extends com.bxkj.student.v2.vm.LoginViewModel {

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private final kotlin.s f1545o;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.h5.H5VM$loginFromOldSystemToNew$1", f = "H5VM.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.h5.H5VM b;

        a(com.bxkj.student.v2.vm.h5.H5VM r1, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.h5.H5VM.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.v2.vm.h5.H5VM$a r0 = new com.bxkj.student.v2.vm.h5.H5VM$a
                com.bxkj.student.v2.vm.h5.H5VM r1 = r2.b
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
                com.bxkj.student.v2.vm.h5.H5VM$a r2 = (com.bxkj.student.v2.vm.h5.H5VM.a) r2
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
                goto L36
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                com.bxkj.student.v2.vm.h5.H5VM r5 = r4.b
                o0.a r5 = com.bxkj.student.v2.vm.h5.H5VM.U(r5)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getAccount()
                java.lang.String r3 = "getAccount(...)"
                kotlin.jvm.internal.g0.o(r1, r3)
                r4.a = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L36
                return r0
            L36:
                java.util.Map r5 = (java.util.Map) r5
                com.bxkj.student.v2.vm.h5.H5VM r0 = r4.b
                r0.L(r5)
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    public H5VM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.vm.h5.a r0 = new com.bxkj.student.v2.vm.h5.a
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.f1545o = r0
            return
    }

    public static /* synthetic */ o0.a T() {
            o0.a r0 = W()
            return r0
    }

    public static final /* synthetic */ o0.a U(com.bxkj.student.v2.vm.h5.H5VM r0) {
            o0.a r0 = r0.V()
            return r0
    }

    private final o0.a V() {
            r1 = this;
            kotlin.s r0 = r1.f1545o
            java.lang.Object r0 = r0.getValue()
            o0.a r0 = (o0.a) r0
            return r0
    }

    private static final o0.a W() {
            o0.a r0 = new o0.a
            r0.<init>()
            return r0
    }

    public final void X() {
            r11 = this;
            com.bxkj.student.v2.vm.h5.H5VM$a r1 = new com.bxkj.student.v2.vm.h5.H5VM$a
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
}
