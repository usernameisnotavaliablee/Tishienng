package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,224:1\n107#2:225\n107#2:227\n1#3:226\n163#4:228\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n58#1:225\n132#1:227\n221#1:228\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__ErrorsKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.b = r2
                int r2 = r1.c
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.c = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.k.v(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j<T> a;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__ErrorsKt.b<T> c;
            int d;

            a(kotlinx.coroutines.flow.FlowKt__ErrorsKt.b<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a> r2) {
                    r0 = this;
                    r0.c = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.b = r2
                    int r2 = r1.d
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.d = r2
                    kotlinx.coroutines.flow.FlowKt__ErrorsKt$b<T> r2 = r1.c
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        b(kotlinx.coroutines.flow.j<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.a
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b) r5
                kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.g0.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.a     // Catch: java.lang.Throwable -> L4a
                r0.a = r4     // Catch: java.lang.Throwable -> L4a
                r0.d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.b
                r5.element = r6
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;

        c(kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.c> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
                r0 = this;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$c r1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$c
                r1.<init>(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$c r1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L10
                kotlin.g0.n(r2)
                r2 = 1
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
                return r2
            L10:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<kotlinx.coroutines.flow.j<? super T>, java.lang.Throwable, java.lang.Long, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> e;

        d(long r1, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt.d> r4) {
                r0 = this;
                r0.d = r1
                r0.e = r3
                r1 = 4
                r0.<init>(r1, r4)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5, long r6, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r8) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$d r4 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$d
                long r0 = r3.d
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r2 = r3.e
                r4.<init>(r0, r2, r8)
                r4.b = r5
                r4.c = r6
                kotlin.n1 r5 = kotlin.n1.a
                java.lang.Object r4 = r4.invokeSuspend(r5)
                return r4
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Throwable r8, java.lang.Long r9, kotlin.coroutines.e<? super java.lang.Boolean> r10) {
                r6 = this;
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r2 = r8
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Number r9 = (java.lang.Number) r9
                long r3 = r9.longValue()
                r5 = r10
                kotlin.coroutines.e r5 = (kotlin.coroutines.e) r5
                r0 = r6
                java.lang.Object r7 = r0.f(r1, r2, r3, r5)
                return r7
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
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.g0.n(r8)
                java.lang.Object r8 = r7.b
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.c
                long r5 = r7.d
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r1 = r7.e
                r7.a = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r2)
                return r8
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Throwable> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.g0.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.a = r6     // Catch: java.lang.Throwable -> L51
            r0.c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.l.a(r4, r5)
            throw r4
        L72:
            kotlin.l.a(r5, r4)
            throw r5
        L76:
            throw r5
    }

    private static final boolean c(java.lang.Throwable r1, kotlin.coroutines.i r2) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r2.get(r0)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            if (r2 == 0) goto L1a
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L11
            goto L1a
        L11:
            java.util.concurrent.CancellationException r2 = r2.H()
            boolean r1 = d(r1, r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static final boolean d(java.lang.Throwable r0, java.lang.Throwable r1) {
            if (r1 == 0) goto La
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r3, long r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r6) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$d r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$d
            r1 = 0
            r0.<init>(r4, r6, r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.y1(r3, r0)
            return r3
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Expected positive amount of retries, but had "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i f(kotlinx.coroutines.flow.i r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto L13
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$c r3 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$c
            r4 = 0
            r3.<init>(r4)
        L13:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.w1(r0, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }
}
