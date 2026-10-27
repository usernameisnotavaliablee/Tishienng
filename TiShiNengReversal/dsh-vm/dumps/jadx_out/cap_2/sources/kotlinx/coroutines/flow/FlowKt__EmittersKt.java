package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n107#2:223\n107#2:224\n107#2:225\n107#2:226\n75#3:227\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n50#1:223\n76#1:224\n146#1:225\n181#1:226\n218#1:227\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__EmittersKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__EmittersKt.a> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt__EmittersKt.a(r2, r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef a;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__EmittersKt.b<T> b;
            int c;

            a(kotlinx.coroutines.flow.FlowKt__EmittersKt.b<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$b<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        b(kotlin.jvm.internal.Ref.BooleanRef r1, kotlinx.coroutines.flow.j<? super T> r2) {
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.b.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.g0.n(r6)
                kotlin.jvm.internal.Ref$BooleanRef r6 = r4.a
                r2 = 0
                r6.element = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.b
                r0.c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.flow.j r0, kotlin.jvm.functions.Function3 r1, java.lang.Throwable r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = c(r0, r1, r2, r3)
            return r0
    }

    public static final void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.flow.n0
            if (r0 != 0) goto L5
            return
        L5:
            kotlinx.coroutines.flow.n0 r1 = (kotlinx.coroutines.flow.n0) r1
            java.lang.Throwable r1 = r1.a
            throw r1
    }

    private static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.e<? super kotlin.n1> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$a r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.g0.n(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            kotlin.l.a(r4, r6)
        L50:
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r0)
            return r2
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }
}
