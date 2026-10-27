package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i<T, R> extends kotlinx.coroutines.flow.internal.g<T, R> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.internal.i<T, R> c;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> d;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a, reason: collision with other inner class name */
        static final class C0094a<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.e2> a;
            final /* synthetic */ kotlinx.coroutines.r0 b;
            final /* synthetic */ kotlinx.coroutines.flow.internal.i<T, R> c;
            final /* synthetic */ kotlinx.coroutines.flow.j<R> d;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a, reason: collision with other inner class name */
            static final class C0095a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
                int a;
                final /* synthetic */ kotlinx.coroutines.flow.internal.i<T, R> b;
                final /* synthetic */ kotlinx.coroutines.flow.j<R> c;
                final /* synthetic */ T d;

                C0095a(kotlinx.coroutines.flow.internal.i<T, R> r1, kotlinx.coroutines.flow.j<? super R> r2, T r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.i.a.C0094a.C0095a> r4) {
                        r0 = this;
                        r0.b = r1
                        r0.c = r2
                        r0.d = r3
                        r1 = 2
                        r0.<init>(r1, r4)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.NotNull
                public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                        r3 = this;
                        kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                        kotlinx.coroutines.flow.internal.i<T, R> r0 = r3.b
                        kotlinx.coroutines.flow.j<R> r1 = r3.c
                        T r2 = r3.d
                        r4.<init>(r0, r1, r2, r5)
                        return r4
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
                        kotlinx.coroutines.flow.internal.i$a$a$a r1 = (kotlinx.coroutines.flow.internal.i.a.C0094a.C0095a) r1
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
                        goto L2d
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        kotlin.g0.n(r5)
                        kotlinx.coroutines.flow.internal.i<T, R> r5 = r4.b
                        kotlin.jvm.functions.Function3 r5 = kotlinx.coroutines.flow.internal.i.s(r5)
                        kotlinx.coroutines.flow.j<R> r1 = r4.c
                        T r3 = r4.d
                        r4.a = r2
                        java.lang.Object r5 = r5.invoke(r1, r3, r4)
                        if (r5 != r0) goto L2d
                        return r0
                    L2d:
                        kotlin.n1 r5 = kotlin.n1.a
                        return r5
                }
            }

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                java.lang.Object a;
                java.lang.Object b;
                java.lang.Object c;
                /* synthetic */ java.lang.Object d;
                final /* synthetic */ kotlinx.coroutines.flow.internal.i.a.C0094a<T> e;
                int f;

                b(kotlinx.coroutines.flow.internal.i.a.C0094a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.i.a.C0094a.b> r2) {
                        r0 = this;
                        r0.e = r1
                        r0.<init>(r2)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                        r1 = this;
                        r1.d = r2
                        int r2 = r1.f
                        r0 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 | r0
                        r1.f = r2
                        kotlinx.coroutines.flow.internal.i$a$a<T> r2 = r1.e
                        r0 = 0
                        java.lang.Object r2 = r2.emit(r0, r1)
                        return r2
                }
            }

            C0094a(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.e2> r1, kotlinx.coroutines.r0 r2, kotlinx.coroutines.flow.internal.i<T, R> r3, kotlinx.coroutines.flow.j<? super R> r4) {
                    r0 = this;
                    r0.a = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r9) {
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.i.a.C0094a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = (kotlinx.coroutines.flow.internal.i.a.C0094a.b) r0
                    int r1 = r0.f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = new kotlinx.coroutines.flow.internal.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                    int r2 = r0.f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.c
                    kotlinx.coroutines.e2 r8 = (kotlinx.coroutines.e2) r8
                    java.lang.Object r8 = r0.b
                    java.lang.Object r0 = r0.a
                    kotlinx.coroutines.flow.internal.i$a$a r0 = (kotlinx.coroutines.flow.internal.i.a.C0094a) r0
                    kotlin.g0.n(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.g0.n(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.e2> r9 = r7.a
                    T r9 = r9.element
                    kotlinx.coroutines.e2 r9 = (kotlinx.coroutines.e2) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.b(r2)
                    r0.a = r7
                    r0.b = r8
                    r0.c = r9
                    r0.f = r3
                    java.lang.Object r9 = r9.M(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.e2> r9 = r0.a
                    kotlinx.coroutines.r0 r1 = r0.b
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                    kotlinx.coroutines.flow.internal.i<T, R> r2 = r0.c
                    kotlinx.coroutines.flow.j<R> r0 = r0.d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    kotlinx.coroutines.e2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    kotlin.n1 r8 = kotlin.n1.a
                    return r8
            }
        }

        a(kotlinx.coroutines.flow.internal.i<T, R> r1, kotlinx.coroutines.flow.j<? super R> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.i.a> r3) {
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
                kotlinx.coroutines.flow.internal.i$a r0 = new kotlinx.coroutines.flow.internal.i$a
                kotlinx.coroutines.flow.internal.i<T, R> r1 = r3.c
                kotlinx.coroutines.flow.j<R> r2 = r3.d
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
                kotlinx.coroutines.flow.internal.i$a r1 = (kotlinx.coroutines.flow.internal.i.a) r1
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
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.g0.n(r8)
                java.lang.Object r8 = r7.b
                kotlinx.coroutines.r0 r8 = (kotlinx.coroutines.r0) r8
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlinx.coroutines.flow.internal.i<T, R> r3 = r7.c
                kotlinx.coroutines.flow.i<S> r4 = r3.d
                kotlinx.coroutines.flow.internal.i$a$a r5 = new kotlinx.coroutines.flow.internal.i$a$a
                kotlinx.coroutines.flow.j<R> r6 = r7.d
                r5.<init>(r1, r8, r3, r6)
                r7.a = r2
                java.lang.Object r8 = r4.collect(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    public i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r2, r3, r4, r5)
            r0.e = r1
            return
    }

    public /* synthetic */ i(kotlin.jvm.functions.Function3 r7, kotlinx.coroutines.flow.i r8, kotlin.coroutines.i r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -2
            r4 = -2
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 s(kotlinx.coroutines.flow.internal.i r0) {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r0.e
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<R> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, int r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r9) {
            r6 = this;
            kotlinx.coroutines.flow.internal.i r0 = new kotlinx.coroutines.flow.internal.i
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r6.e
            kotlinx.coroutines.flow.i<S> r2 = r6.d
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.i$a r0 = new kotlinx.coroutines.flow.internal.i$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = kotlinx.coroutines.s0.g(r0, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L11
            return r3
        L11:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }
}
