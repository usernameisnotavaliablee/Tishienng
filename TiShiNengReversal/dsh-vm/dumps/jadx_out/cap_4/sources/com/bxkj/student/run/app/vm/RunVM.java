package com.bxkj.student.run.app.vm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RunVM extends com.bxkj.base.v2.base.BaseViewModel {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$deleteExceptionRecord$1", f = "RunVM.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ java.lang.String b;

        a(java.lang.String r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$a r0 = new com.bxkj.student.run.app.vm.RunVM$a
                java.lang.String r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$a r2 = (com.bxkj.student.run.app.vm.RunVM.a) r2
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
                goto L2a
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                h0.a r4 = new h0.a
                r4.<init>()
                java.lang.String r1 = r3.b
                r3.a = r2
                java.lang.Object r4 = r4.a(r1, r3)
                if (r4 != r0) goto L2a
                return r0
            L2a:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$getLocalRecordById$1", f = "RunVM.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;
        final /* synthetic */ java.lang.String d;

        b(kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1, java.lang.String r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.b> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$b r0 = new com.bxkj.student.run.app.vm.RunVM$b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1 = r3.c
                java.lang.String r2 = r3.d
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
                com.bxkj.student.run.app.vm.RunVM$b r2 = (com.bxkj.student.run.app.vm.RunVM.b) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r4.a
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                kotlin.g0.n(r5)
                goto L34
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.g0.n(r5)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r5 = r4.c
                h0.a r1 = new h0.a
                r1.<init>()
                java.lang.String r3 = r4.d
                r4.a = r5
                r4.b = r2
                java.lang.Object r1 = r1.c(r3, r4)
                if (r1 != r0) goto L32
                return r0
            L32:
                r0 = r5
                r5 = r1
            L34:
                r0.element = r5
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$getLocalRecordById$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;

        c(kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.c> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$c r0 = new com.bxkj.student.run.app.vm.RunVM$c
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2 = r3.c
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
                com.bxkj.student.run.app.vm.RunVM$c r2 = (com.bxkj.student.run.app.vm.RunVM.c) r2
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
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r0 = r1.c
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$getUploadFailSportsByType$1", f = "RunVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;
        final /* synthetic */ com.bxkj.student.run.app.vm.RunVM d;
        final /* synthetic */ int e;

        d(kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1, com.bxkj.student.run.app.vm.RunVM r2, int r3, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.d> r4) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r3
                r1 = 1
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r5) {
                r4 = this;
                com.bxkj.student.run.app.vm.RunVM$d r0 = new com.bxkj.student.run.app.vm.RunVM$d
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1 = r4.c
                com.bxkj.student.run.app.vm.RunVM r2 = r4.d
                int r3 = r4.e
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
                com.bxkj.student.run.app.vm.RunVM$d r2 = (com.bxkj.student.run.app.vm.RunVM.d) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r5.a
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                kotlin.g0.n(r6)
                goto L42
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.g0.n(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r6 = r5.c
                com.bxkj.student.run.app.vm.RunVM r1 = r5.d
                h0.a r1 = com.bxkj.student.run.app.vm.RunVM.u(r1)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getAccount()
                java.lang.String r4 = "getAccount(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                int r4 = r5.e
                r5.a = r6
                r5.b = r2
                java.lang.Object r1 = r1.e(r3, r4, r5)
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r6
                r6 = r1
            L42:
                r0.element = r6
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$getUploadFailSportsByType$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;

        e(kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.e> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$e r0 = new com.bxkj.student.run.app.vm.RunVM$e
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2 = r3.c
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
                com.bxkj.student.run.app.vm.RunVM$e r2 = (com.bxkj.student.run.app.vm.RunVM.e) r2
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
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r0 = r1.c
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$insertRun$1", f = "RunVM.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb b;

        f(com.bxkj.student.run.app.offline.table.RunDb r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.f> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$f r0 = new com.bxkj.student.run.app.vm.RunVM$f
                com.bxkj.student.run.app.offline.table.RunDb r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$f r2 = (com.bxkj.student.run.app.vm.RunVM.f) r2
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
                goto L2a
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                h0.a r4 = new h0.a
                r4.<init>()
                com.bxkj.student.run.app.offline.table.RunDb r1 = r3.b
                r3.a = r2
                java.lang.Object r4 = r4.f(r1, r3)
                if (r4 != r0) goto L2a
                return r0
            L2a:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$queryExceptionSports$1", f = "RunVM.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;
        final /* synthetic */ com.bxkj.student.run.app.vm.RunVM d;

        g(kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1, com.bxkj.student.run.app.vm.RunVM r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.g> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$g r0 = new com.bxkj.student.run.app.vm.RunVM$g
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1 = r3.c
                com.bxkj.student.run.app.vm.RunVM r2 = r3.d
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
                com.bxkj.student.run.app.vm.RunVM$g r2 = (com.bxkj.student.run.app.vm.RunVM.g) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r5.a
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                kotlin.g0.n(r6)
                goto L40
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.g0.n(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r6 = r5.c
                com.bxkj.student.run.app.vm.RunVM r1 = r5.d
                h0.a r1 = com.bxkj.student.run.app.vm.RunVM.u(r1)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getAccount()
                java.lang.String r4 = "getAccount(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                r5.a = r6
                r5.b = r2
                java.lang.Object r1 = r1.b(r3, r5)
                if (r1 != r0) goto L3e
                return r0
            L3e:
                r0 = r6
                r6 = r1
            L40:
                r0.element = r6
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$queryExceptionSports$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;

        h(kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.h> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$h r0 = new com.bxkj.student.run.app.vm.RunVM$h
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2 = r3.c
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
                com.bxkj.student.run.app.vm.RunVM$h r2 = (com.bxkj.student.run.app.vm.RunVM.h) r2
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
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r0 = r1.c
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$queryFailRecord$1", f = "RunVM.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        int b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;
        final /* synthetic */ com.bxkj.student.run.app.vm.RunVM d;

        i(kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1, com.bxkj.student.run.app.vm.RunVM r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.i> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$i r0 = new com.bxkj.student.run.app.vm.RunVM$i
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r1 = r3.c
                com.bxkj.student.run.app.vm.RunVM r2 = r3.d
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
                com.bxkj.student.run.app.vm.RunVM$i r2 = (com.bxkj.student.run.app.vm.RunVM.i) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r5.a
                kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                kotlin.g0.n(r6)
                goto L40
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.g0.n(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r6 = r5.c
                com.bxkj.student.run.app.vm.RunVM r1 = r5.d
                h0.a r1 = com.bxkj.student.run.app.vm.RunVM.u(r1)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getAccount()
                java.lang.String r4 = "getAccount(...)"
                kotlin.jvm.internal.g0.o(r3, r4)
                r5.a = r6
                r5.b = r2
                java.lang.Object r1 = r1.d(r3, r5)
                if (r1 != r0) goto L3e
                return r0
            L3e:
                r0 = r6
                r6 = r1
            L40:
                r0.element = r6
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$queryFailRecord$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> b;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> c;

        j(kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1, kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.j> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 1
                r0.<init>(r1, r3)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r4) {
                r3 = this;
                com.bxkj.student.run.app.vm.RunVM$j r0 = new com.bxkj.student.run.app.vm.RunVM$j
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r1 = r3.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r2 = r3.c
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
                com.bxkj.student.run.app.vm.RunVM$j r2 = (com.bxkj.student.run.app.vm.RunVM.j) r2
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
                kotlin.jvm.functions.Function1<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r2 = r1.b
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r0 = r1.c
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

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$updateExceptionStatus$1", f = "RunVM.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb b;

        k(com.bxkj.student.run.app.offline.table.RunDb r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.k> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$k r0 = new com.bxkj.student.run.app.vm.RunVM$k
                com.bxkj.student.run.app.offline.table.RunDb r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$k r2 = (com.bxkj.student.run.app.vm.RunVM.k) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r6)
                goto L47
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.g0.n(r6)
                com.bxkj.student.run.app.offline.table.RunDb r6 = r5.b
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r1 = java.lang.String.valueOf(r3)
                r6.setEndTime(r1)
                h0.a r6 = new h0.a
                r6.<init>()
                com.bxkj.student.run.app.offline.table.RunDb r1 = r5.b
                java.lang.String r1 = r1.getEndTime()
                com.bxkj.student.run.app.offline.table.RunDb r3 = r5.b
                java.lang.String r3 = r3.getUploadType()
                com.bxkj.student.run.app.offline.table.RunDb r4 = r5.b
                java.lang.String r4 = r4.getIdentify()
                r5.a = r2
                java.lang.Object r6 = r6.g(r1, r3, r4, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$updateExceptionStatus$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

        l(kotlin.jvm.functions.Function0<kotlin.n1> r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.l> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$l r0 = new com.bxkj.student.run.app.vm.RunVM$l
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$l r2 = (com.bxkj.student.run.app.vm.RunVM.l) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L12
                kotlin.g0.n(r2)
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r1.b
                r2.invoke()
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L12:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$updateExceptionToFail$1", f = "RunVM.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ com.bxkj.student.run.app.offline.table.RunDb b;

        m(com.bxkj.student.run.app.offline.table.RunDb r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.m> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$m r0 = new com.bxkj.student.run.app.vm.RunVM$m
                com.bxkj.student.run.app.offline.table.RunDb r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$m r2 = (com.bxkj.student.run.app.vm.RunVM.m) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r6)
                goto L4e
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.g0.n(r6)
                com.bxkj.student.run.app.offline.table.RunDb r6 = r5.b
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r1 = java.lang.String.valueOf(r3)
                r6.setEndTime(r1)
                com.bxkj.student.run.app.offline.table.RunDb r6 = r5.b
                java.lang.String r1 = "2"
                r6.setUploadType(r1)
                h0.a r6 = new h0.a
                r6.<init>()
                com.bxkj.student.run.app.offline.table.RunDb r1 = r5.b
                java.lang.String r1 = r1.getEndTime()
                com.bxkj.student.run.app.offline.table.RunDb r3 = r5.b
                java.lang.String r3 = r3.getUploadType()
                com.bxkj.student.run.app.offline.table.RunDb r4 = r5.b
                java.lang.String r4 = r4.getIdentify()
                r5.a = r2
                java.lang.Object r6 = r6.g(r1, r3, r4, r5)
                if (r6 != r0) goto L4e
                return r0
            L4e:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.bxkj.student.run.app.vm.RunVM$updateExceptionToFail$2", f = "RunVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.n1> b;

        n(kotlin.jvm.functions.Function0<kotlin.n1> r1, kotlin.coroutines.e<? super com.bxkj.student.run.app.vm.RunVM.n> r2) {
                r0 = this;
                r0.b = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(kotlin.coroutines.e<?> r3) {
                r2 = this;
                com.bxkj.student.run.app.vm.RunVM$n r0 = new com.bxkj.student.run.app.vm.RunVM$n
                kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.b
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
                com.bxkj.student.run.app.vm.RunVM$n r2 = (com.bxkj.student.run.app.vm.RunVM.n) r2
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L12
                kotlin.g0.n(r2)
                kotlin.jvm.functions.Function0<kotlin.n1> r2 = r1.b
                r2.invoke()
                kotlin.n1 r2 = kotlin.n1.a
                return r2
            L12:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public RunVM() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.run.app.vm.a r0 = new com.bxkj.student.run.app.vm.a
            r0.<init>()
            kotlin.s r0 = kotlin.t.c(r0)
            r1.h = r0
            return
    }

    private static final h0.a C() {
            h0.a r0 = new h0.a
            r0.<init>()
            return r0
    }

    public static /* synthetic */ h0.a t() {
            h0.a r0 = C()
            return r0
    }

    public static final /* synthetic */ h0.a u(com.bxkj.student.run.app.vm.RunVM r0) {
            h0.a r0 = r0.x()
            return r0
    }

    private final h0.a x() {
            r1 = this;
            kotlin.s r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            h0.a r0 = (h0.a) r0
            return r0
    }

    public final void A(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            com.bxkj.student.run.app.vm.RunVM$g r2 = new com.bxkj.student.run.app.vm.RunVM$g
            r1 = 0
            r2.<init>(r0, r12, r1)
            com.bxkj.student.run.app.vm.RunVM$h r6 = new com.bxkj.student.run.app.vm.RunVM$h
            r6.<init>(r13, r0, r1)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void B(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r13) {
            r12 = this;
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r13, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            com.bxkj.student.run.app.vm.RunVM$i r2 = new com.bxkj.student.run.app.vm.RunVM$i
            r1 = 0
            r2.<init>(r0, r12, r1)
            com.bxkj.student.run.app.vm.RunVM$j r6 = new com.bxkj.student.run.app.vm.RunVM$j
            r6.<init>(r13, r0, r1)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void D(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "runDb"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = r13.getEndTime()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2c
            com.bxkj.student.run.app.vm.RunVM$k r2 = new com.bxkj.student.run.app.vm.RunVM$k
            r0 = 0
            r2.<init>(r13, r0)
            com.bxkj.student.run.app.vm.RunVM$l r6 = new com.bxkj.student.run.app.vm.RunVM$l
            r6.<init>(r14, r0)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L2c:
            return
    }

    public final void E(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "runDb"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = r13.getEndTime()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2c
            com.bxkj.student.run.app.vm.RunVM$m r2 = new com.bxkj.student.run.app.vm.RunVM$m
            r0 = 0
            r2.<init>(r13, r0)
            com.bxkj.student.run.app.vm.RunVM$n r6 = new com.bxkj.student.run.app.vm.RunVM$n
            r6.<init>(r14, r0)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L2c:
            return
    }

    public final void v(@org.jetbrains.annotations.NotNull java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.run.app.vm.RunVM$a r2 = new com.bxkj.student.run.app.vm.RunVM$a
            r0 = 0
            r2.<init>(r13, r0)
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

    public final void w(@org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "identify"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            com.bxkj.student.run.app.vm.RunVM$b r2 = new com.bxkj.student.run.app.vm.RunVM$b
            r1 = 0
            r2.<init>(r0, r13, r1)
            com.bxkj.student.run.app.vm.RunVM$c r6 = new com.bxkj.student.run.app.vm.RunVM$c
            r6.<init>(r14, r0, r1)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void y(int r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>, kotlin.n1> r14) {
            r12 = this;
            java.lang.String r0 = "complete"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            com.bxkj.student.run.app.vm.RunVM$d r2 = new com.bxkj.student.run.app.vm.RunVM$d
            r1 = 0
            r2.<init>(r0, r12, r13, r1)
            com.bxkj.student.run.app.vm.RunVM$e r6 = new com.bxkj.student.run.app.vm.RunVM$e
            r6.<init>(r14, r0, r1)
            r10 = 238(0xee, float:3.34E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            com.bxkj.base.v2.base.BaseViewModel.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final void z(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r13) {
            r12 = this;
            java.lang.String r0 = "runDb"
            kotlin.jvm.internal.g0.p(r13, r0)
            com.bxkj.student.run.app.vm.RunVM$f r2 = new com.bxkj.student.run.app.vm.RunVM$f
            r0 = 0
            r2.<init>(r13, r0)
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
