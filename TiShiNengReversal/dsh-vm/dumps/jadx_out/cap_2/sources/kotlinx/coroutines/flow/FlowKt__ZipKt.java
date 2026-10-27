package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n272#1,3:334\n272#1,3:337\n261#1:340\n263#1:342\n272#1,3:343\n261#1:346\n263#1:348\n272#1,3:349\n261#1:352\n263#1:354\n272#1,3:355\n107#2:333\n107#2:341\n107#2:347\n107#2:353\n107#2:358\n107#2:359\n107#2:362\n37#3,2:360\n37#3,2:363\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n75#1:334,3\n103#1:337,3\n119#1:340\n119#1:342\n138#1:343,3\n156#1:346\n156#1:348\n177#1:349,3\n197#1:352\n197#1:354\n220#1:355,3\n32#1:333\n119#1:341\n156#1:347\n197#1:353\n237#1:358\n261#1:359\n288#1:362\n287#1:360,2\n306#1:363,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n33#2,2:114\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;
        final /* synthetic */ kotlinx.coroutines.flow.i b;
        final /* synthetic */ kotlin.jvm.functions.Function3 c;

        public a(kotlinx.coroutines.flow.i r1, kotlinx.coroutines.flow.i r2, kotlin.jvm.functions.Function3 r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
                r5 = this;
                kotlinx.coroutines.flow.i r0 = r5.a
                kotlinx.coroutines.flow.i r1 = r5.b
                r2 = 2
                kotlinx.coroutines.flow.i[] r2 = new kotlinx.coroutines.flow.i[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                kotlin.jvm.functions.Function0 r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.a()
                kotlinx.coroutines.flow.FlowKt__ZipKt$b r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$b
                kotlin.jvm.functions.Function3 r3 = r5.c
                r4 = 0
                r1.<init>(r3, r4)
                java.lang.Object r6 = kotlinx.coroutines.flow.internal.k.a(r6, r2, r0, r1, r7)
                java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
                if (r6 != r7) goto L24
                return r6
            L24:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    static final class b<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, java.lang.Object[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> d;

        b(kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ZipKt.b> r2) {
                r0 = this;
                r0.d = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object[] r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r3, @org.jetbrains.annotations.NotNull java.lang.Object[] r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$b r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$b
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.d
                r0.<init>(r1, r5)
                r0.b = r3
                r0.c = r4
                kotlin.n1 r3 = kotlin.n1.a
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r6.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.g0.n(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.g0.n(r7)
                goto L40
            L22:
                kotlin.g0.n(r7)
                java.lang.Object r7 = r6.b
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r6.d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.b = r1
                r6.a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.b = r3
                r6.a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0 {
        public static final kotlinx.coroutines.flow.FlowKt__ZipKt.c a = null;

        static {
                kotlinx.coroutines.flow.FlowKt__ZipKt$c r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$c
                r0.<init>()
                kotlinx.coroutines.flow.FlowKt__ZipKt.c.a = r0
                return
        }

        c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Void a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 a() {
            kotlin.jvm.functions.Function0 r0 = r()
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> b(java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            kotlinx.coroutines.flow.i[] r1 = (kotlinx.coroutines.flow.i[]) r1
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.K0(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5) {
            r0 = 3
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1
            r2.<init>(r0, r5)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r6) {
            r0 = 4
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2
            r2.<init>(r0, r6)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r7) {
            r0 = 5
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3
            r2.<init>(r0, r7)
            return r2
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2
            r0.<init>(r1, r2)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> h(java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r2, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3) {
            java.util.List r2 = kotlin.collections.f0.a6(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            kotlinx.coroutines.flow.i[] r2 = (kotlinx.coroutines.flow.i[]) r2
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            r0 = 2
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2
            r3 = 0
            r2.<init>(r0, r3, r4)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r5) {
            r0 = 3
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3
            r3 = 0
            r2.<init>(r0, r3, r5)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r5, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r6) {
            r0 = 4
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4
            r3 = 0
            r2.<init>(r0, r3, r6)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r6, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r7) {
            r0 = 5
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5
            r3 = 0
            r2.<init>(r0, r3, r7)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r2)
            return r2
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] r2, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3) {
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r0)
            return r2
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] r2, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3) {
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r0)
            return r2
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombine")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__ZipKt$a r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$a
            r0.<init>(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombineTransform")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r3, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            r0 = 2
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1
            r3 = 0
            r2.<init>(r0, r3, r4)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r2)
            return r2
    }

    private static final <T> kotlin.jvm.functions.Function0<T[]> r() {
            kotlinx.coroutines.flow.FlowKt__ZipKt$c r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.c.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.internal.k.b(r0, r1, r2)
            return r0
    }
}
