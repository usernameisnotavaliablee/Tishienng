package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, java.lang.Long> {
        final /* synthetic */ long a;

        a(long r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Long a(T r3) {
                r2 = this;
                long r0 = r2.a
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Long invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Long r1 = r0.a(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, java.lang.Long> {
        final /* synthetic */ kotlin.jvm.functions.Function1<T, kotlin.time.h> a;

        b(kotlin.jvm.functions.Function1<? super T, kotlin.time.h> r1) {
                r0 = this;
                r0.a = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Long a(T r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<T, kotlin.time.h> r0 = r2.a
                java.lang.Object r3 = r0.invoke(r3)
                kotlin.time.h r3 = (kotlin.time.h) r3
                long r0 = r3.o0()
                long r0 = kotlinx.coroutines.a1.e(r0)
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                return r3
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Long invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Long r1 = r0.a(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 426}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n18#2:416\n18#2:418\n1#3:417\n55#4,8:419\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n218#1:416\n221#1:418\n228#1:419,8\n*E\n"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        private /* synthetic */ java.lang.Object d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> f;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n18#2:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n232#1:416\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlinx.coroutines.flow.j<T> b;
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> c;

            a(kotlinx.coroutines.flow.j<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.c.a> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 1
                    r0.<init>(r1, r3)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r3 = this;
                    kotlinx.coroutines.flow.p$c$a r0 = new kotlinx.coroutines.flow.p$c$a
                    kotlinx.coroutines.flow.j<T> r1 = r3.b
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r3.c
                    r0.<init>(r1, r2, r4)
                    return r0
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.e<? super kotlin.n1> r1) {
                    r0 = this;
                    kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                    java.lang.Object r1 = r0.invoke2(r1)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r1 = this;
                    kotlin.coroutines.e r2 = r1.create(r2)
                    kotlinx.coroutines.flow.p$c$a r2 = (kotlinx.coroutines.flow.p.c.a) r2
                    kotlin.n1 r0 = kotlin.n1.a
                    java.lang.Object r2 = r2.invokeSuspend(r0)
                    return r2
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r5.a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L18
                    if (r1 != r3) goto L10
                    kotlin.g0.n(r6)
                    goto L2f
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    kotlin.g0.n(r6)
                    kotlinx.coroutines.flow.j<T> r6 = r5.b
                    kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.a
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r5.c
                    T r4 = r4.element
                    if (r4 != r1) goto L26
                    r4 = r2
                L26:
                    r5.a = r3
                    java.lang.Object r6 = r6.emit(r4, r5)
                    if (r6 != r0) goto L2f
                    return r0
                L2f:
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.c
                    r6.element = r2
                    kotlin.n1 r6 = kotlin.n1.a
                    return r6
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n514#2,6:416\n530#2,4:422\n534#2:428\n1#3:426\n18#4:427\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n238#1:416,6\n239#1:422,4\n239#1:428\n242#1:427\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.n<? extends java.lang.Object>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            java.lang.Object a;
            int b;
            /* synthetic */ java.lang.Object c;
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> d;
            final /* synthetic */ kotlinx.coroutines.flow.j<T> e;

            b(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.flow.j<? super T> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.c.b> r3) {
                    r0 = this;
                    r0.d = r1
                    r0.e = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                    r3 = this;
                    kotlinx.coroutines.flow.p$c$b r0 = new kotlinx.coroutines.flow.p$c$b
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.d
                    kotlinx.coroutines.flow.j<T> r2 = r3.e
                    r0.<init>(r1, r2, r5)
                    r0.c = r4
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = kotlinx.coroutines.channels.n.b(r1)
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$c$b r1 = (kotlinx.coroutines.flow.p.c.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.n<? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    java.lang.Object r1 = r1.o()
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r6.b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.a
                    kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
                    kotlin.g0.n(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    kotlin.g0.n(r7)
                    java.lang.Object r7 = r6.c
                    kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
                    java.lang.Object r7 = r7.o()
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.d
                    boolean r3 = r7 instanceof kotlinx.coroutines.channels.n.c
                    if (r3 != 0) goto L2e
                    r1.element = r7
                L2e:
                    kotlinx.coroutines.flow.j<T> r4 = r6.e
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = kotlinx.coroutines.channels.n.f(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.element
                    if (r3 == 0) goto L50
                    kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.c = r7
                    r6.a = r1
                    r6.b = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.flow.internal.s.c
                    r1.element = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.n1 r7 = kotlin.n1.a
                    return r7
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.p$c$c, reason: collision with other inner class name */
        static final class C0103c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super java.lang.Object>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            private /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.i<T> c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: kotlinx.coroutines.flow.p$c$c$a */
            static final class a<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.channels.z<java.lang.Object> a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {210}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.p$c$c$a$a, reason: collision with other inner class name */
                static final class C0104a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object a;
                    final /* synthetic */ kotlinx.coroutines.flow.p.c.C0103c.a<T> b;
                    int c;

                    C0104a(kotlinx.coroutines.flow.p.c.C0103c.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.c.C0103c.a.C0104a> r2) {
                            r0 = this;
                            r0.b = r1
                            r0.<init>(r2)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                            r1 = this;
                            r1.a = r2
                            int r2 = r1.c
                            r0 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r2 | r0
                            r1.c = r2
                            kotlinx.coroutines.flow.p$c$c$a<T> r2 = r1.b
                            r0 = 0
                            java.lang.Object r2 = r2.emit(r0, r1)
                            return r2
                    }
                }

                a(kotlinx.coroutines.channels.z<java.lang.Object> r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.c.C0103c.a.C0104a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.p$c$c$a$a r0 = (kotlinx.coroutines.flow.p.c.C0103c.a.C0104a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.p$c$c$a$a r0 = new kotlinx.coroutines.flow.p$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.g0.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.g0.n(r6)
                        kotlinx.coroutines.channels.z<java.lang.Object> r6 = r4.a
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.a
                    L3a:
                        r0.c = r3
                        java.lang.Object r5 = r6.T(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.n1 r5 = kotlin.n1.a
                        return r5
                }
            }

            C0103c(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.c.C0103c> r2) {
                    r0 = this;
                    r0.c = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.p$c$c r0 = new kotlinx.coroutines.flow.p$c$c
                    kotlinx.coroutines.flow.i<T> r1 = r2.c
                    r0.<init>(r1, r4)
                    r0.b = r3
                    return r0
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.z<? super java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke2(r1, r2)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<java.lang.Object> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$c$c r1 = (kotlinx.coroutines.flow.p.c.C0103c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r4.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r5)
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.g0.n(r5)
                    java.lang.Object r5 = r4.b
                    kotlinx.coroutines.channels.z r5 = (kotlinx.coroutines.channels.z) r5
                    kotlinx.coroutines.flow.i<T> r1 = r4.c
                    kotlinx.coroutines.flow.p$c$c$a r3 = new kotlinx.coroutines.flow.p$c$c$a
                    r3.<init>(r5)
                    r4.a = r2
                    java.lang.Object r5 = r1.collect(r3, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
            }
        }

        c(kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1, kotlinx.coroutines.flow.i<? extends T> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.c> r3) {
                r0 = this;
                r0.f = r1
                r0.g = r2
                r1 = 3
                r0.<init>(r1, r3)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r5, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r6) {
                r3 = this;
                kotlinx.coroutines.flow.p$c r0 = new kotlinx.coroutines.flow.p$c
                kotlin.jvm.functions.Function1<T, java.lang.Long> r1 = r3.f
                kotlinx.coroutines.flow.i<T> r2 = r3.g
                r0.<init>(r1, r2, r6)
                r0.d = r4
                r0.e = r5
                kotlin.n1 r4 = kotlin.n1.a
                java.lang.Object r4 = r0.invokeSuspend(r4)
                return r4
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.f(r1, r2, r3)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r14.c
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L3e
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r14.a
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r5 = r14.e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                java.lang.Object r6 = r14.d
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.g0.n(r15)
            L1e:
                r7 = r6
                r6 = r5
                r5 = r1
                goto L60
            L22:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L2a:
                java.lang.Object r1 = r14.b
                kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
                java.lang.Object r5 = r14.a
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                java.lang.Object r6 = r14.e
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                java.lang.Object r7 = r14.d
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlin.g0.n(r15)
                goto La2
            L3e:
                kotlin.g0.n(r15)
                java.lang.Object r15 = r14.d
                r5 = r15
                kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                java.lang.Object r15 = r14.e
                kotlinx.coroutines.flow.j r15 = (kotlinx.coroutines.flow.j) r15
                kotlinx.coroutines.flow.p$c$c r8 = new kotlinx.coroutines.flow.p$c$c
                kotlinx.coroutines.flow.i<T> r1 = r14.g
                r8.<init>(r1, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.channels.b0 r1 = kotlinx.coroutines.channels.x.f(r5, r6, r7, r8, r9, r10)
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                r5.<init>()
                r7 = r15
                r6 = r1
            L60:
                T r15 = r5.element
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.c
                if (r15 == r1) goto Le5
                kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
                r1.<init>()
                T r15 = r5.element
                if (r15 == 0) goto La4
                kotlin.jvm.functions.Function1<T, java.lang.Long> r8 = r14.f
                kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.flow.internal.s.a
                if (r15 != r9) goto L76
                r15 = r4
            L76:
                java.lang.Object r15 = r8.invoke(r15)
                java.lang.Number r15 = (java.lang.Number) r15
                long r10 = r15.longValue()
                r1.element = r10
                r12 = 0
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 < 0) goto La9
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 != 0) goto La4
                T r15 = r5.element
                if (r15 != r9) goto L91
                r15 = r4
            L91:
                r14.d = r7
                r14.e = r6
                r14.a = r5
                r14.b = r1
                r14.c = r3
                java.lang.Object r15 = r7.emit(r15, r14)
                if (r15 != r0) goto La2
                goto Le4
            La2:
                r5.element = r4
            La4:
                r15 = r1
                r1 = r5
                r5 = r6
                r6 = r7
                goto Lb1
            La9:
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Debounce timeout should not be negative"
                r15.<init>(r0)
                throw r15
            Lb1:
                kotlinx.coroutines.selects.l r7 = new kotlinx.coroutines.selects.l
                kotlin.coroutines.i r8 = r14.getContext()
                r7.<init>(r8)
                T r8 = r1.element
                if (r8 == 0) goto Lc8
                long r8 = r15.element
                kotlinx.coroutines.flow.p$c$a r15 = new kotlinx.coroutines.flow.p$c$a
                r15.<init>(r6, r1, r4)
                kotlinx.coroutines.selects.b.a(r7, r8, r15)
            Lc8:
                kotlinx.coroutines.selects.g r15 = r5.t()
                kotlinx.coroutines.flow.p$c$b r8 = new kotlinx.coroutines.flow.p$c$b
                r8.<init>(r1, r6, r4)
                r7.k(r15, r8)
                r14.d = r6
                r14.e = r5
                r14.a = r1
                r14.b = r4
                r14.c = r2
                java.lang.Object r15 = r7.y(r14)
                if (r15 != r0) goto L1e
            Le4:
                return r0
            Le5:
                kotlin.n1 r15 = kotlin.n1.a
                return r15
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {316, 318, 319}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super kotlin.n1>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;

        d(long r1, long r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.d> r5) {
                r0 = this;
                r0.c = r1
                r0.d = r3
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.p$d r0 = new kotlinx.coroutines.flow.p$d
                long r1 = r6.c
                long r3 = r6.d
                r5 = r8
                r0.<init>(r1, r3, r5)
                r0.b = r7
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.z<? super kotlin.n1> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super kotlin.n1> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.p$d r1 = (kotlinx.coroutines.flow.p.d) r1
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.b
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.g0.n(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.b
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.g0.n(r8)
                goto L3f
            L2a:
                kotlin.g0.n(r8)
                java.lang.Object r8 = r7.b
                r1 = r8
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                long r5 = r7.c
                r7.b = r1
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.a1.b(r5, r7)
                if (r8 != r0) goto L3f
                goto L5c
            L3f:
                kotlinx.coroutines.channels.c0 r8 = r1.getChannel()
                kotlin.n1 r4 = kotlin.n1.a
                r7.b = r1
                r7.a = r3
                java.lang.Object r8 = r8.T(r4, r7)
                if (r8 != r0) goto L50
                goto L5c
            L50:
                long r4 = r7.d
                r7.b = r1
                r7.a = r2
                java.lang.Object r8 = kotlinx.coroutines.a1.b(r4, r7)
                if (r8 != r0) goto L3f
            L5c:
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {423}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n55#2,8:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n284#1:416,8\n*E\n"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        java.lang.Object a;
        java.lang.Object b;
        int c;
        private /* synthetic */ java.lang.Object d;
        /* synthetic */ java.lang.Object e;
        final /* synthetic */ long f;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n514#2,6:416\n530#2,4:422\n534#2:427\n1#3:426\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n287#1:416,6\n288#1:422,4\n288#1:427\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.n<? extends java.lang.Object>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> c;
            final /* synthetic */ kotlinx.coroutines.channels.b0<kotlin.n1> d;

            a(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.channels.b0<kotlin.n1> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.e.a> r3) {
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
                    kotlinx.coroutines.flow.p$e$a r0 = new kotlinx.coroutines.flow.p$e$a
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.c
                    kotlinx.coroutines.channels.b0<kotlin.n1> r2 = r3.d
                    r0.<init>(r1, r2, r5)
                    r0.b = r4
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = kotlinx.coroutines.channels.n.b(r1)
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$e$a r1 = (kotlinx.coroutines.flow.p.e.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.n<? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    java.lang.Object r1 = r1.o()
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                    r3 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r3.a
                    if (r0 != 0) goto L35
                    kotlin.g0.n(r4)
                    java.lang.Object r4 = r3.b
                    kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                    java.lang.Object r4 = r4.o()
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r3.c
                    boolean r1 = r4 instanceof kotlinx.coroutines.channels.n.c
                    if (r1 != 0) goto L1a
                    r0.element = r4
                L1a:
                    kotlinx.coroutines.channels.b0<kotlin.n1> r2 = r3.d
                    if (r1 == 0) goto L32
                    java.lang.Throwable r4 = kotlinx.coroutines.channels.n.f(r4)
                    if (r4 != 0) goto L31
                    kotlinx.coroutines.flow.internal.ChildCancelledException r4 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r4.<init>()
                    r2.b(r4)
                    kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.flow.internal.s.c
                    r0.element = r4
                    goto L32
                L31:
                    throw r4
                L32:
                    kotlin.n1 r4 = kotlin.n1.a
                    return r4
                L35:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n18#2:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n299#1:416\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.n1, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> b;
            final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

            b(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.flow.j<? super T> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.e.b> r3) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.p$e$b r3 = new kotlinx.coroutines.flow.p$e$b
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r2.b
                    kotlinx.coroutines.flow.j<T> r1 = r2.c
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.n1 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$e$b r1 = (kotlinx.coroutines.flow.p.e.b) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.n1 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.n1 r1 = (kotlin.n1) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r5.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r6)
                    goto L36
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    kotlin.g0.n(r6)
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.b
                    T r1 = r6.element
                    if (r1 != 0) goto L23
                    kotlin.n1 r6 = kotlin.n1.a
                    return r6
                L23:
                    r3 = 0
                    r6.element = r3
                    kotlinx.coroutines.flow.j<T> r6 = r5.c
                    kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.flow.internal.s.a
                    if (r1 != r4) goto L2d
                    r1 = r3
                L2d:
                    r5.a = r2
                    java.lang.Object r6 = r6.emit(r1, r5)
                    if (r6 != r0) goto L36
                    return r0
                L36:
                    kotlin.n1 r6 = kotlin.n1.a
                    return r6
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super java.lang.Object>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            int a;
            private /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.i<T> c;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            static final class a<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.channels.z<java.lang.Object> a;

                /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {279}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.p$e$c$a$a, reason: collision with other inner class name */
                static final class C0105a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object a;
                    final /* synthetic */ kotlinx.coroutines.flow.p.e.c.a<T> b;
                    int c;

                    C0105a(kotlinx.coroutines.flow.p.e.c.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.e.c.a.C0105a> r2) {
                            r0 = this;
                            r0.b = r1
                            r0.<init>(r2)
                            return
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                            r1 = this;
                            r1.a = r2
                            int r2 = r1.c
                            r0 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r2 | r0
                            r1.c = r2
                            kotlinx.coroutines.flow.p$e$c$a<T> r2 = r1.b
                            r0 = 0
                            java.lang.Object r2 = r2.emit(r0, r1)
                            return r2
                    }
                }

                a(kotlinx.coroutines.channels.z<java.lang.Object> r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.p.e.c.a.C0105a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.p$e$c$a$a r0 = (kotlinx.coroutines.flow.p.e.c.a.C0105a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.p$e$c$a$a r0 = new kotlinx.coroutines.flow.p$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.g0.n(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.g0.n(r6)
                        kotlinx.coroutines.channels.z<java.lang.Object> r6 = r4.a
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.a
                    L3a:
                        r0.c = r3
                        java.lang.Object r5 = r6.T(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.n1 r5 = kotlin.n1.a
                        return r5
                }
            }

            c(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.e.c> r2) {
                    r0 = this;
                    r0.c = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.p$e$c r0 = new kotlinx.coroutines.flow.p$e$c
                    kotlinx.coroutines.flow.i<T> r1 = r2.c
                    r0.<init>(r1, r4)
                    r0.b = r3
                    return r0
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.z<? super java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.invoke2(r1, r2)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<java.lang.Object> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$e$c r1 = (kotlinx.coroutines.flow.p.e.c) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r4.a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.g0.n(r5)
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.g0.n(r5)
                    java.lang.Object r5 = r4.b
                    kotlinx.coroutines.channels.z r5 = (kotlinx.coroutines.channels.z) r5
                    kotlinx.coroutines.flow.i<T> r1 = r4.c
                    kotlinx.coroutines.flow.p$e$c$a r3 = new kotlinx.coroutines.flow.p$e$c$a
                    r3.<init>(r5)
                    r4.a = r2
                    java.lang.Object r5 = r1.collect(r3, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    kotlin.n1 r5 = kotlin.n1.a
                    return r5
            }
        }

        e(long r1, kotlinx.coroutines.flow.i<? extends T> r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.e> r4) {
                r0 = this;
                r0.f = r1
                r0.g = r3
                r1 = 3
                r0.<init>(r1, r4)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r6, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r7) {
                r4 = this;
                kotlinx.coroutines.flow.p$e r0 = new kotlinx.coroutines.flow.p$e
                long r1 = r4.f
                kotlinx.coroutines.flow.i<T> r3 = r4.g
                r0.<init>(r1, r3, r7)
                r0.d = r5
                r0.e = r6
                kotlin.n1 r5 = kotlin.n1.a
                java.lang.Object r5 = r0.invokeSuspend(r5)
                return r5
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.f(r1, r2, r3)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r12.c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r12.b
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                java.lang.Object r4 = r12.a
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                java.lang.Object r5 = r12.e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                java.lang.Object r6 = r12.d
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.g0.n(r13)
                goto L56
            L20:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L28:
                kotlin.g0.n(r13)
                java.lang.Object r13 = r12.d
                r4 = r13
                kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                java.lang.Object r13 = r12.e
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.j) r13
                kotlinx.coroutines.flow.p$e$c r7 = new kotlinx.coroutines.flow.p$e$c
                kotlinx.coroutines.flow.i<T> r1 = r12.g
                r7.<init>(r1, r3)
                r8 = 1
                r9 = 0
                r5 = 0
                r6 = -1
                kotlinx.coroutines.channels.b0 r1 = kotlinx.coroutines.channels.x.f(r4, r5, r6, r7, r8, r9)
                kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
                r11.<init>()
                long r5 = r12.f
                r9 = 2
                r10 = 0
                r7 = 0
                kotlinx.coroutines.channels.b0 r4 = kotlinx.coroutines.flow.k.z0(r4, r5, r7, r9, r10)
                r6 = r13
                r5 = r1
                r1 = r4
                r4 = r11
            L56:
                T r13 = r4.element
                kotlinx.coroutines.internal.s0 r7 = kotlinx.coroutines.flow.internal.s.c
                if (r13 == r7) goto L8e
                kotlinx.coroutines.selects.l r13 = new kotlinx.coroutines.selects.l
                kotlin.coroutines.i r7 = r12.getContext()
                r13.<init>(r7)
                kotlinx.coroutines.selects.g r7 = r5.t()
                kotlinx.coroutines.flow.p$e$a r8 = new kotlinx.coroutines.flow.p$e$a
                r8.<init>(r4, r1, r3)
                r13.k(r7, r8)
                kotlinx.coroutines.selects.g r7 = r1.N()
                kotlinx.coroutines.flow.p$e$b r8 = new kotlinx.coroutines.flow.p$e$b
                r8.<init>(r4, r6, r3)
                r13.k(r7, r8)
                r12.d = r6
                r12.e = r5
                r12.a = r4
                r12.b = r1
                r12.c = r2
                java.lang.Object r13 = r13.y(r12)
                if (r13 != r0) goto L56
                return r0
            L8e:
                kotlin.n1 r13 = kotlin.n1.a
                return r13
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {424}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n31#2:416\n32#2:425\n55#3,8:417\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n401#1:416\n401#1:425\n401#1:417,8\n*E\n"})
    static final class f<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.r0, kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        long a;
        int b;
        private /* synthetic */ java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        final /* synthetic */ long e;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {404}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,415:1\n514#2,6:416\n548#2,5:422\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n403#1:416,6\n405#1:422,5\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.n<? extends T>, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
            int a;
            /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

            a(kotlinx.coroutines.flow.j<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.f.a> r2) {
                    r0 = this;
                    r0.c = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r2 = this;
                    kotlinx.coroutines.flow.p$f$a r0 = new kotlinx.coroutines.flow.p$f$a
                    kotlinx.coroutines.flow.j<T> r1 = r2.c
                    r0.<init>(r1, r4)
                    r0.b = r3
                    return r0
            }

            @org.jetbrains.annotations.Nullable
            public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = kotlinx.coroutines.channels.n.b(r1)
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    kotlinx.coroutines.flow.p$f$a r1 = (kotlinx.coroutines.flow.p.f.a) r1
                    kotlin.n1 r2 = kotlin.n1.a
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                    r0 = this;
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    java.lang.Object r1 = r1.o()
                    kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                    java.lang.Object r1 = r0.f(r1, r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r4.a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.b
                    kotlin.g0.n(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.g0.n(r5)
                    java.lang.Object r5 = r4.b
                    kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                    java.lang.Object r5 = r5.o()
                    kotlinx.coroutines.flow.j<T> r1 = r4.c
                    boolean r3 = r5 instanceof kotlinx.coroutines.channels.n.c
                    if (r3 != 0) goto L37
                    r4.b = r5
                    r4.a = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof kotlinx.coroutines.channels.n.a
                    if (r0 == 0) goto L45
                    kotlinx.coroutines.channels.n.f(r5)
                    r5 = 0
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                    return r5
                L45:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r2)
                    return r5
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.e<?>, java.lang.Object> {
            int a;
            final /* synthetic */ long b;

            b(long r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.f.b> r3) {
                    r0 = this;
                    r0.b = r1
                    r1 = 1
                    r0.<init>(r1, r3)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.NotNull
            public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                    r3 = this;
                    kotlinx.coroutines.flow.p$f$b r0 = new kotlinx.coroutines.flow.p$f$b
                    long r1 = r3.b
                    r0.<init>(r1, r4)
                    return r0
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.e<?> r1) {
                    r0 = this;
                    kotlin.coroutines.e r1 = (kotlin.coroutines.e) r1
                    java.lang.Object r1 = r0.invoke2(r1)
                    return r1
            }

            @org.jetbrains.annotations.Nullable
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<?> r2) {
                    r1 = this;
                    kotlin.coroutines.e r2 = r1.create(r2)
                    kotlinx.coroutines.flow.p$f$b r2 = (kotlinx.coroutines.flow.p.f.b) r2
                    kotlin.n1 r0 = kotlin.n1.a
                    java.lang.Object r2 = r2.invokeSuspend(r0)
                    return r2
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                    r3 = this;
                    kotlin.coroutines.intrinsics.a.l()
                    int r0 = r3.a
                    if (r0 == 0) goto Lf
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                Lf:
                    kotlin.g0.n(r4)
                    kotlinx.coroutines.TimeoutCancellationException r4 = new kotlinx.coroutines.TimeoutCancellationException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Timed out waiting for "
                    r0.append(r1)
                    long r1 = r3.b
                    java.lang.String r1 = kotlin.time.h.j0(r1)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r4.<init>(r0)
                    throw r4
            }
        }

        f(long r1, kotlinx.coroutines.flow.i<? extends T> r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.p.f> r4) {
                r0 = this;
                r0.e = r1
                r0.f = r3
                r1 = 3
                r0.<init>(r1, r4)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r6, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r7) {
                r4 = this;
                kotlinx.coroutines.flow.p$f r0 = new kotlinx.coroutines.flow.p$f
                long r1 = r4.e
                kotlinx.coroutines.flow.i<T> r3 = r4.f
                r0.<init>(r1, r3, r7)
                r0.c = r5
                r0.d = r6
                kotlin.n1 r5 = kotlin.n1.a
                java.lang.Object r5 = r0.invokeSuspend(r5)
                return r5
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.f(r1, r2, r3)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.a
                java.lang.Object r1 = r9.d
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                java.lang.Object r6 = r9.c
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.g0.n(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.g0.n(r10)
                java.lang.Object r10 = r9.c
                kotlinx.coroutines.r0 r10 = (kotlinx.coroutines.r0) r10
                java.lang.Object r1 = r9.d
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                long r4 = r9.e
                kotlin.time.h$a r6 = kotlin.time.h.b
                long r6 = r6.T()
                int r4 = kotlin.time.h.k(r4, r6)
                if (r4 <= 0) goto L82
                kotlinx.coroutines.flow.i<T> r4 = r9.f
                r5 = 0
                r6 = 2
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.q(r4, r5, r3, r6, r3)
                kotlinx.coroutines.channels.b0 r10 = kotlinx.coroutines.flow.k.o1(r4, r10)
                long r4 = r9.e
                r6 = r1
                r1 = r10
            L4b:
                kotlinx.coroutines.selects.l r10 = new kotlinx.coroutines.selects.l
                kotlin.coroutines.i r7 = r9.getContext()
                r10.<init>(r7)
                kotlinx.coroutines.selects.g r7 = r1.t()
                kotlinx.coroutines.flow.p$f$a r8 = new kotlinx.coroutines.flow.p$f$a
                r8.<init>(r6, r3)
                r10.k(r7, r8)
                kotlinx.coroutines.flow.p$f$b r7 = new kotlinx.coroutines.flow.p$f$b
                r7.<init>(r4, r3)
                kotlinx.coroutines.selects.b.b(r10, r4, r7)
                r9.c = r6
                r9.d = r1
                r9.a = r4
                r9.b = r2
                java.lang.Object r10 = r10.y(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.n1 r10 = kotlin.n1.a
                return r10
            L82:
                kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
        }
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L13
            if (r2 != 0) goto L9
            return r3
        L9:
            kotlinx.coroutines.flow.p$a r0 = new kotlinx.coroutines.flow.p$a
            r0.<init>(r4)
            kotlinx.coroutines.flow.i r3 = e(r3, r0)
            return r3
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Debounce timeout should not be negative"
            r3.<init>(r4)
            throw r3
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.OverloadResolutionByLambdaReturnType
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1) {
            kotlinx.coroutines.flow.i r0 = e(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            long r1 = kotlinx.coroutines.a1.e(r1)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.a0(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.jvm.JvmName(name = "debounceDuration")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.time.h> r2) {
            kotlinx.coroutines.flow.p$b r0 = new kotlinx.coroutines.flow.p$b
            r0.<init>(r2)
            kotlinx.coroutines.flow.i r1 = e(r1, r0)
            return r1
    }

    private static final <T> kotlinx.coroutines.flow.i<T> e(kotlinx.coroutines.flow.i<? extends T> r2, kotlin.jvm.functions.Function1<? super T, java.lang.Long> r3) {
            kotlinx.coroutines.flow.p$c r0 = new kotlinx.coroutines.flow.p$c
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.internal.n.b(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.b0<kotlin.n1> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r10, long r11, long r13) {
            java.lang.String r0 = " ms"
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 < 0) goto L3d
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 < 0) goto L1e
            kotlinx.coroutines.flow.p$d r4 = new kotlinx.coroutines.flow.p$d
            r9 = 0
            r7 = r11
            r5 = r13
            r4.<init>(r5, r7, r9)
            r8 = 1
            r5 = 0
            r6 = 0
            r7 = r4
            r4 = r10
            kotlinx.coroutines.channels.b0 r10 = kotlinx.coroutines.channels.x.f(r4, r5, r6, r7, r8, r9)
            return r10
        L1e:
            r5 = r13
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Expected non-negative initial delay, but has "
            r10.append(r11)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L3d:
            r7 = r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Expected non-negative delay, but has "
            r10.append(r11)
            r10.append(r7)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 g(kotlinx.coroutines.r0 r0, long r1, long r3, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r3 = r1
        L5:
            kotlinx.coroutines.channels.b0 r0 = kotlinx.coroutines.flow.k.y0(r0, r1, r3)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            kotlinx.coroutines.flow.p$e r0 = new kotlinx.coroutines.flow.p$e
            r1 = 0
            r0.<init>(r4, r3, r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.internal.n.b(r0)
            return r3
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Sample period should be positive"
            r3.<init>(r4)
            throw r3
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            long r1 = kotlinx.coroutines.a1.e(r1)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.B1(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = k(r0, r1)
            return r0
    }

    private static final <T> kotlinx.coroutines.flow.i<T> k(kotlinx.coroutines.flow.i<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.p$f r0 = new kotlinx.coroutines.flow.p$f
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.internal.n.b(r0)
            return r2
    }
}
