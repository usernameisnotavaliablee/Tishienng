package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n53#2:219\n55#2:223\n53#2:224\n55#2:228\n50#3:220\n55#3:222\n50#3:225\n55#3:227\n107#4:221\n107#4:226\n107#4:229\n1#5:230\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n47#1:219\n47#1:223\n74#1:224\n74#1:228\n47#1:220\n47#1:222\n74#1:225\n74#1:227\n47#1:221\n74#1:226\n82#1:229\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__MergeKt {
    private static final int a = 0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,113:1\n83#2,2:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;

        public a(kotlinx.coroutines.flow.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
                r2 = this;
                kotlinx.coroutines.flow.i r0 = r2.a
                kotlinx.coroutines.flow.FlowKt__MergeKt$b r1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$b
                r1.<init>(r3)
                java.lang.Object r3 = r0.collect(r1, r4)
                java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
                if (r3 != r4) goto L12
                return r3
            L12:
                kotlin.n1 r3 = kotlin.n1.a
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j<T> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {83}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__MergeKt.b<T> b;
            int c;

            a(kotlinx.coroutines.flow.FlowKt__MergeKt.b<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__MergeKt.b.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__MergeKt$b<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.a(r0, r1)
                    return r2
            }
        }

        b(kotlinx.coroutines.flow.j<? super T> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__MergeKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt.b.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__MergeKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.g0.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.a
                r0.c = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.k.m0(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.e r2) {
                r0 = this;
                kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                java.lang.Object r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {217, 217}, m = "invokeSuspend", n = {}, s = {})
    static final class c<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super R>, java.lang.Object> d;

        c(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__MergeKt.c> r2) {
                r0 = this;
                r0.d = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r3, T r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MergeKt$c r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.d
                r0.<init>(r1, r5)
                r0.b = r3
                r0.c = r4
                kotlin.n1 r3 = kotlin.n1.a
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.g0.n(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.g0.n(r6)
                goto L39
            L22:
                kotlin.g0.n(r6)
                java.lang.Object r6 = r5.b
                r1 = r6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r6 = r5.c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r5.d
                r5.b = r1
                r5.a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.b = r3
                r5.a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    static {
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r2 = "kotlinx.coroutines.flow.defaultConcurrency"
            r3 = 16
            int r0 = kotlinx.coroutines.internal.v0.b(r2, r3, r0, r1)
            kotlinx.coroutines.flow.FlowKt__MergeKt.a = r0
            return
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.G0(r0)
            return r1
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.d2(r2, r0)
            return r2
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1
            r0.<init>(r1, r3)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.H0(r0, r2)
            return r1
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i d(kotlinx.coroutines.flow.i r0, int r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            int r1 = kotlinx.coroutines.flow.FlowKt__MergeKt.a
        L6:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.D0(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r1) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$a r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$a
            r0.<init>(r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r8, int r9) {
            if (r9 <= 0) goto L18
            r0 = 1
            if (r9 != r0) goto La
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.G0(r8)
            return r8
        La:
            kotlinx.coroutines.flow.internal.f r0 = new kotlinx.coroutines.flow.internal.f
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L18:
            r2 = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Expected positive concurrency level, but had "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i g(kotlinx.coroutines.flow.i r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = kotlinx.coroutines.flow.FlowKt__MergeKt.a
        L6:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.H0(r0, r1)
            return r0
    }

    public static final int h() {
            int r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.a
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    public static /* synthetic */ void i() {
            return
    }

    @kotlinx.coroutines.FlowPreview
    public static /* synthetic */ void j() {
            return
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MergeKt$c r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$c
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.d2(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> l(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r7) {
            kotlinx.coroutines.flow.internal.j r0 = new kotlinx.coroutines.flow.internal.j
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T>... r0) {
            java.lang.Iterable r0 = kotlin.collections.n.K5(r0)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.Z0(r0)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> n(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r8, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r9) {
            kotlinx.coroutines.flow.internal.i r0 = new kotlinx.coroutines.flow.internal.i
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
