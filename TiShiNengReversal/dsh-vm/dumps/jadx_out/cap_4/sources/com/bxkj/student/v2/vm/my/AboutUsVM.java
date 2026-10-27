package com.bxkj.student.v2.vm.my;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AboutUsVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.my.AboutUsVM$getPgyerAppVersion$1", f = "AboutUsVM.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.my.AboutUsVM b;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> c;

        a(com.bxkj.student.v2.vm.my.AboutUsVM r1, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.my.AboutUsVM.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.my.AboutUsVM$a r0 = new com.bxkj.student.v2.vm.my.AboutUsVM$a
                com.bxkj.student.v2.vm.my.AboutUsVM r1 = r3.b
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r2 = r3.c
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
                com.bxkj.student.v2.vm.my.AboutUsVM$a r2 = (com.bxkj.student.v2.vm.my.AboutUsVM.a) r2
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
                com.bxkj.student.v2.vm.my.AboutUsVM r4 = r3.b
                com.bxkj.student.v2.repository.my.a r4 = com.bxkj.student.v2.vm.my.AboutUsVM.v(r4)
                r3.a = r2
                java.lang.Object r4 = r4.a(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                java.util.Map r4 = (java.util.Map) r4
                if (r4 == 0) goto L32
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r0 = r3.c
                r0.invoke(r4)
            L32:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.my.AboutUsVM$getVersionCode$1", f = "AboutUsVM.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.v2.vm.my.AboutUsVM b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> c;

        b(com.bxkj.student.v2.vm.my.AboutUsVM r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.my.AboutUsVM.b> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.my.AboutUsVM$b r0 = new com.bxkj.student.v2.vm.my.AboutUsVM$b
                com.bxkj.student.v2.vm.my.AboutUsVM r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.c
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
                com.bxkj.student.v2.vm.my.AboutUsVM$b r2 = (com.bxkj.student.v2.vm.my.AboutUsVM.b) r2
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
                com.bxkj.student.v2.vm.my.AboutUsVM r4 = r3.b
                com.bxkj.student.v2.repository.my.a r4 = com.bxkj.student.v2.vm.my.AboutUsVM.v(r4)
                r3.a = r2
                java.lang.Object r4 = r4.b(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                com.bxkj.base.v2.http.result.OldApiResult r4 = (com.bxkj.base.v2.http.result.OldApiResult) r4
                if (r4 == 0) goto L35
                kotlin.jvm.internal.Ref$ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.c
                java.lang.Object r4 = r4.getData()
                r0.element = r4
            L35:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.v2.vm.my.AboutUsVM$getVersionCode$2", f = "AboutUsVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> c;

        c(kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r2, kotlin.coroutines.e<? super com.bxkj.student.v2.vm.my.AboutUsVM.c> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.v2.vm.my.AboutUsVM$c r0 = new com.bxkj.student.v2.vm.my.AboutUsVM$c
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r2 = r3.c
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
                com.bxkj.student.v2.vm.my.AboutUsVM$c r2 = (com.bxkj.student.v2.vm.my.AboutUsVM.c) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L16
                kotlin.g0.n(r2)
                kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.c
                java.lang.Object r0 = r0.element
                r2.invoke(r0)
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L16:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public AboutUsVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.v2.vm.my.a r0 = new com.bxkj.student.v2.vm.my.a
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.h = r0
            return
    }

    public static /* synthetic */ com.bxkj.student.v2.repository.my.a t() {
            com.bxkj.student.v2.repository.my.a r0 = u()
            return r0
    }

    private static final com.bxkj.student.v2.repository.my.a u() {
            com.bxkj.student.v2.repository.my.a r0 = new com.bxkj.student.v2.repository.my.a
            r0.<init>()
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.repository.my.a v(com.bxkj.student.v2.vm.my.AboutUsVM r0) {
            com.bxkj.student.v2.repository.my.a r0 = r0.w()
            return r0
    }

    private final com.bxkj.student.v2.repository.my.a w() {
            r1 = this;
            kotlin.s r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.v2.repository.my.a r0 = (com.bxkj.student.v2.repository.my.a) r0
            return r0
    }

    public final void x(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.v2.vm.my.AboutUsVM$a r2 = new com.bxkj.student.v2.vm.my.AboutUsVM$a
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

    public final void y(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.n1> r14) {
            r13 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.element = r1
            com.bxkj.student.v2.vm.my.AboutUsVM$b r3 = new com.bxkj.student.v2.vm.my.AboutUsVM$b
            r1 = 0
            r3.<init>(r13, r0, r1)
            com.bxkj.student.v2.vm.my.AboutUsVM$c r7 = new com.bxkj.student.v2.vm.my.AboutUsVM$c
            r7.<init>(r14, r0, r1)
            r11 = 238(0xee, float:3.34E-43)
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r13
            com.bxkj.base.v2.base.BaseViewModel.j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }
}
