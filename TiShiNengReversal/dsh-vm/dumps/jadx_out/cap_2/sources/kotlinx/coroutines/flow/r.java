package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class r {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.flow.c0 b;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> c;
        final /* synthetic */ kotlinx.coroutines.flow.s<T> d;
        final /* synthetic */ T e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.r$a$a, reason: collision with other inner class name */
        static final class C0106a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
            int a;
            /* synthetic */ int b;

            C0106a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.r.a.C0106a> r2) {
                    r1 = this;
                    r0 = 2
                    r1.<init>(r0, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
                    r1 = this;
                    kotlinx.coroutines.flow.r$a$a r0 = new kotlinx.coroutines.flow.r$a$a
                    r0.<init>(r3)
                    java.lang.Number r2 = (java.lang.Number) r2
                    int r2 = r2.intValue()
                    r0.b = r2
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(int r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                    r0 = this;
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.r$a$a r1 = (kotlinx.coroutines.flow.r.a.C0106a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                    r0 = this;
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r1.a
                    if (r0 != 0) goto L16
                    kotlin.g0.n(r2)
                    int r2 = r1.b
                    if (r2 <= 0) goto L10
                    r2 = 1
                    goto L11
                L10:
                    r2 = 0
                L11:
                    java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
                    return r2
                L16:
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r2.<init>(r0)
                    throw r2
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.i<T> c;
            final /* synthetic */ kotlinx.coroutines.flow.s<T> d;
            final /* synthetic */ T e;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: kotlinx.coroutines.flow.r$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0107a {
                public static final /* synthetic */ int[] a = null;

                static {
                        kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START     // Catch: java.lang.NoSuchFieldError -> L10
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                        r2 = 1
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                    L10:
                        kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP     // Catch: java.lang.NoSuchFieldError -> L19
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                        r2 = 2
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                    L19:
                        kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE     // Catch: java.lang.NoSuchFieldError -> L22
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                        r2 = 3
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                    L22:
                        kotlinx.coroutines.flow.r.a.b.C0107a.a = r0
                        return
                }
            }

            b(kotlinx.coroutines.flow.i<? extends T> r1, kotlinx.coroutines.flow.s<T> r2, T r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.r.a.b> r4) {
                    r0 = this;
                    r0.c = r1
                    r0.d = r2
                    r0.e = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) {
                    r4 = this;
                    kotlinx.coroutines.flow.r$a$b r0 = new kotlinx.coroutines.flow.r$a$b
                    kotlinx.coroutines.flow.i<T> r1 = r4.c
                    kotlinx.coroutines.flow.s<T> r2 = r4.d
                    T r3 = r4.e
                    r0.<init>(r1, r2, r3, r6)
                    r0.b = r5
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingCommand r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.r$a$b r1 = (kotlinx.coroutines.flow.r.a.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r3.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r4)
                    goto L4b
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.g0.n(r4)
                    java.lang.Object r4 = r3.b
                    kotlinx.coroutines.flow.SharingCommand r4 = (kotlinx.coroutines.flow.SharingCommand) r4
                    int[] r1 = kotlinx.coroutines.flow.r.a.b.C0107a.a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 == r2) goto L3e
                    r0 = 3
                    if (r4 == r0) goto L2c
                    goto L4b
                L2c:
                    T r4 = r3.e
                    kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.flow.z.a
                    if (r4 != r0) goto L38
                    kotlinx.coroutines.flow.s<T> r4 = r3.d
                    r4.b()
                    goto L4b
                L38:
                    kotlinx.coroutines.flow.s<T> r0 = r3.d
                    r0.c(r4)
                    goto L4b
                L3e:
                    kotlinx.coroutines.flow.i<T> r4 = r3.c
                    kotlinx.coroutines.flow.s<T> r1 = r3.d
                    r3.a = r2
                    java.lang.Object r4 = r4.collect(r1, r3)
                    if (r4 != r0) goto L4b
                    return r0
                L4b:
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
            }
        }

        a(kotlinx.coroutines.flow.c0 r1, kotlinx.coroutines.flow.i<? extends T> r2, kotlinx.coroutines.flow.s<T> r3, T r4, kotlin.coroutines.e<? super kotlinx.coroutines.flow.r.a> r5) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.r$a r0 = new kotlinx.coroutines.flow.r$a
                kotlinx.coroutines.flow.c0 r1 = r6.b
                kotlinx.coroutines.flow.i<T> r2 = r6.c
                kotlinx.coroutines.flow.s<T> r3 = r6.d
                T r4 = r6.e
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.r$a r1 = (kotlinx.coroutines.flow.r.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.g0.n(r8)
                goto L5c
            L21:
                kotlin.g0.n(r8)
                goto L8d
            L25:
                kotlin.g0.n(r8)
                kotlinx.coroutines.flow.c0 r8 = r7.b
                kotlinx.coroutines.flow.c0$a r1 = kotlinx.coroutines.flow.c0.a
                kotlinx.coroutines.flow.c0 r6 = r1.c()
                if (r8 != r6) goto L3f
                kotlinx.coroutines.flow.i<T> r8 = r7.c
                kotlinx.coroutines.flow.s<T> r1 = r7.d
                r7.a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                kotlinx.coroutines.flow.c0 r8 = r7.b
                kotlinx.coroutines.flow.c0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                kotlinx.coroutines.flow.s<T> r8 = r7.d
                kotlinx.coroutines.flow.h0 r8 = r8.d()
                kotlinx.coroutines.flow.r$a$a r1 = new kotlinx.coroutines.flow.r$a$a
                r1.<init>(r5)
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.k.v0(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                kotlinx.coroutines.flow.i<T> r8 = r7.c
                kotlinx.coroutines.flow.s<T> r1 = r7.d
                r7.a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                kotlinx.coroutines.flow.c0 r8 = r7.b
                kotlinx.coroutines.flow.s<T> r1 = r7.d
                kotlinx.coroutines.flow.h0 r1 = r1.d()
                kotlinx.coroutines.flow.i r8 = r8.a(r1)
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.g0(r8)
                kotlinx.coroutines.flow.r$a$b r1 = new kotlinx.coroutines.flow.r$a$b
                kotlinx.coroutines.flow.i<T> r3 = r7.c
                kotlinx.coroutines.flow.s<T> r4 = r7.d
                T r6 = r7.e
                r1.<init>(r3, r4, r6, r5)
                r7.a = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.k.A(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> c;
        final /* synthetic */ kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
        static final class a<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.flow.t<T>> a;
            final /* synthetic */ kotlinx.coroutines.r0 b;
            final /* synthetic */ kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> c;

            a(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.flow.t<T>> r1, kotlinx.coroutines.r0 r2, kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r3) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
                    r3 = this;
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.flow.t<T>> r5 = r3.a
                    T r5 = r5.element
                    kotlinx.coroutines.flow.t r5 = (kotlinx.coroutines.flow.t) r5
                    if (r5 == 0) goto Le
                    r5.setValue(r4)
                    kotlin.n1 r5 = kotlin.n1.a
                    goto Lf
                Le:
                    r5 = 0
                Lf:
                    if (r5 != 0) goto L2d
                    kotlinx.coroutines.r0 r5 = r3.b
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.flow.t<T>> r0 = r3.a
                    kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r1 = r3.c
                    kotlinx.coroutines.flow.t r4 = kotlinx.coroutines.flow.j0.a(r4)
                    kotlinx.coroutines.flow.v r2 = new kotlinx.coroutines.flow.v
                    kotlin.coroutines.i r5 = r5.getCoroutineContext()
                    kotlinx.coroutines.e2 r5 = kotlinx.coroutines.h2.B(r5)
                    r2.<init>(r4, r5)
                    r1.p(r2)
                    r0.element = r4
                L2d:
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
            }
        }

        b(kotlinx.coroutines.flow.i<? extends T> r1, kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.r.b> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.r$b r0 = new kotlinx.coroutines.flow.r$b
                kotlinx.coroutines.flow.i<T> r1 = r3.c
                kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r2 = r3.d
                r0.<init>(r1, r2, r5)
                r0.b = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.r$b r1 = (kotlinx.coroutines.flow.r.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> Lf
                goto L37
            Lf:
                r7 = move-exception
                goto L3a
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                kotlin.g0.n(r7)
                java.lang.Object r7 = r6.b
                kotlinx.coroutines.r0 r7 = (kotlinx.coroutines.r0) r7
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> Lf
                r1.<init>()     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.flow.i<T> r3 = r6.c     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.flow.r$b$a r4 = new kotlinx.coroutines.flow.r$b$a     // Catch: java.lang.Throwable -> Lf
                kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r5 = r6.d     // Catch: java.lang.Throwable -> Lf
                r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
                r6.a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r7 = r3.collect(r4, r6)     // Catch: java.lang.Throwable -> Lf
                if (r7 != r0) goto L37
                return r0
            L37:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
            L3a:
                kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r0 = r6.d
                r0.c(r7)
                throw r7
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.s<T> r2) {
            kotlinx.coroutines.flow.u r0 = new kotlinx.coroutines.flow.u
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.h0<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.t<T> r2) {
            kotlinx.coroutines.flow.v r0 = new kotlinx.coroutines.flow.v
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.b0<T> c(kotlinx.coroutines.flow.i<? extends T> r7, int r8) {
            kotlinx.coroutines.channels.j$b r0 = kotlinx.coroutines.channels.j.t0
            int r0 = r0.a()
            int r0 = kotlin.ranges.t.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.d
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.d r1 = (kotlinx.coroutines.flow.internal.d) r1
            kotlinx.coroutines.flow.i r2 = r1.j()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.b0 r7 = new kotlinx.coroutines.flow.b0
            int r3 = r1.b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.c
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.c
            kotlin.coroutines.i r1 = r1.a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.b0 r8 = new kotlinx.coroutines.flow.b0
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
    }

    private static final <T> kotlinx.coroutines.e2 d(kotlinx.coroutines.r0 r7, kotlin.coroutines.i r8, kotlinx.coroutines.flow.i<? extends T> r9, kotlinx.coroutines.flow.s<T> r10, kotlinx.coroutines.flow.c0 r11, T r12) {
            kotlinx.coroutines.flow.c0$a r0 = kotlinx.coroutines.flow.c0.a
            kotlinx.coroutines.flow.c0 r0 = r0.c()
            boolean r0 = kotlin.jvm.internal.g0.g(r11, r0)
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.DEFAULT
            goto L11
        Lf:
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
        L11:
            kotlinx.coroutines.flow.r$a r1 = new kotlinx.coroutines.flow.r$a
            r6 = 0
            r3 = r9
            r4 = r10
            r2 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            kotlinx.coroutines.e2 r7 = kotlinx.coroutines.i.d(r7, r8, r0, r1)
            return r7
    }

    private static final <T> void e(kotlinx.coroutines.r0 r6, kotlin.coroutines.i r7, kotlinx.coroutines.flow.i<? extends T> r8, kotlinx.coroutines.y<kotlinx.coroutines.flow.h0<T>> r9) {
            kotlinx.coroutines.flow.r$b r3 = new kotlinx.coroutines.flow.r$b
            r0 = 0
            r3.<init>(r8, r9, r0)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r6
            r1 = r7
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.m0 r0 = new kotlinx.coroutines.flow.m0
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r9, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.c0 r10, int r11) {
            kotlinx.coroutines.flow.b0 r8 = c(r8, r11)
            int r0 = r8.b
            kotlinx.coroutines.channels.BufferOverflow r1 = r8.c
            kotlinx.coroutines.flow.s r5 = kotlinx.coroutines.flow.z.a(r11, r0, r1)
            kotlin.coroutines.i r3 = r8.d
            kotlinx.coroutines.flow.i<T> r4 = r8.a
            kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.flow.z.a
            r2 = r9
            r6 = r10
            kotlinx.coroutines.e2 r8 = d(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.u r9 = new kotlinx.coroutines.flow.u
            r9.<init>(r5, r8)
            return r9
    }

    public static /* synthetic */ kotlinx.coroutines.flow.x h(kotlinx.coroutines.flow.i r0, kotlinx.coroutines.r0 r1, kotlinx.coroutines.flow.c0 r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            kotlinx.coroutines.flow.x r0 = kotlinx.coroutines.flow.k.G1(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.flow.h0<? extends T>> r4) {
            r0 = 1
            kotlinx.coroutines.flow.b0 r2 = c(r2, r0)
            r1 = 0
            kotlinx.coroutines.y r0 = kotlinx.coroutines.a0.c(r1, r0, r1)
            kotlin.coroutines.i r1 = r2.d
            kotlinx.coroutines.flow.i<T> r2 = r2.a
            e(r3, r1, r2, r0)
            java.lang.Object r2 = r0.f(r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.h0<T> j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r7, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.c0 r8, T r9) {
            r0 = 1
            kotlinx.coroutines.flow.b0 r6 = c(r6, r0)
            kotlinx.coroutines.flow.t r3 = kotlinx.coroutines.flow.j0.a(r9)
            kotlin.coroutines.i r1 = r6.d
            kotlinx.coroutines.flow.i<T> r2 = r6.a
            r0 = r7
            r4 = r8
            r5 = r9
            kotlinx.coroutines.e2 r6 = d(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.v r7 = new kotlinx.coroutines.flow.v
            r7.<init>(r3, r6)
            return r7
    }
}
