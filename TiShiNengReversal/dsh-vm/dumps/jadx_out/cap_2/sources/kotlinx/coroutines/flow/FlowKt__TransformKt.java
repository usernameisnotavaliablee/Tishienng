package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,136:1\n21#1:143\n23#1:147\n21#1:148\n23#1:152\n50#2:137\n55#2:139\n50#2:140\n55#2:142\n50#2:144\n55#2:146\n50#2:149\n55#2:151\n50#2:153\n55#2:155\n50#2:156\n55#2:158\n50#2:159\n55#2:161\n50#2:163\n55#2:165\n107#3:138\n107#3:141\n107#3:145\n107#3:150\n107#3:154\n107#3:157\n107#3:160\n107#3:162\n107#3:164\n107#3:166\n107#3:167\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n36#1:143\n36#1:147\n41#1:148\n41#1:152\n21#1:137\n21#1:139\n28#1:140\n28#1:142\n36#1:144\n36#1:146\n41#1:149\n41#1:151\n46#1:153\n46#1:155\n53#1:156\n53#1:158\n60#1:159\n60#1:161\n78#1:163\n78#1:165\n21#1:138\n28#1:141\n36#1:145\n41#1:150\n46#1:154\n53#1:157\n60#1:160\n68#1:162\n78#1:164\n105#1:166\n125#1:167\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__TransformKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> a;
        final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> b;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {109, 110}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a$a, reason: collision with other inner class name */
        static final class C0087a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            java.lang.Object b;
            /* synthetic */ java.lang.Object c;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt.a<T> d;
            int e;

            C0087a(kotlinx.coroutines.flow.FlowKt__TransformKt.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0087a> r2) {
                    r0 = this;
                    r0.d = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.c = r2
                    int r2 = r1.e
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.e = r2
                    kotlinx.coroutines.flow.FlowKt__TransformKt$a<T> r2 = r1.d
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        a(kotlin.jvm.internal.Ref.ObjectRef<R> r1, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, kotlinx.coroutines.flow.j<? super R> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0087a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a.C0087a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$a$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.g0.n(r8)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.b
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r2 = r0.a
                kotlinx.coroutines.flow.FlowKt__TransformKt$a r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.a) r2
                kotlin.g0.n(r8)
                goto L5a
            L40:
                kotlin.g0.n(r8)
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.a
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> r2 = r6.b
                T r5 = r8.element
                r0.a = r6
                r0.b = r8
                r0.e = r4
                java.lang.Object r7 = r2.invoke(r5, r7, r0)
                if (r7 != r1) goto L56
                goto L6f
            L56:
                r2 = r8
                r8 = r7
                r7 = r2
                r2 = r6
            L5a:
                r7.element = r8
                kotlinx.coroutines.flow.j<R> r7 = r2.c
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r2.a
                T r8 = r8.element
                r2 = 0
                r0.a = r2
                r0.b = r2
                r0.e = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L70
            L6f:
                return r1
            L70:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,113:1\n126#2,10:114\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;
        final /* synthetic */ kotlin.jvm.functions.Function3 b;

        public b(kotlinx.coroutines.flow.i r1, kotlin.jvm.functions.Function3 r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r4 = this;
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.a
                r0.element = r1
                kotlinx.coroutines.flow.i r1 = r4.a
                kotlinx.coroutines.flow.FlowKt__TransformKt$c r2 = new kotlinx.coroutines.flow.FlowKt__TransformKt$c
                kotlin.jvm.functions.Function3 r3 = r4.b
                r2.<init>(r0, r3, r5)
                java.lang.Object r5 = r1.collect(r2, r6)
                java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
                if (r5 != r6) goto L1d
                return r5
            L1d:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> a;
        final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.e<? super T>, java.lang.Object> b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {131, 133}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            java.lang.Object b;
            /* synthetic */ java.lang.Object c;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt.c<T> d;
            int e;

            a(kotlinx.coroutines.flow.FlowKt__TransformKt.c<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__TransformKt.c.a> r2) {
                    r0 = this;
                    r0.d = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.c = r2
                    int r2 = r1.e
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.e = r2
                    kotlinx.coroutines.flow.FlowKt__TransformKt$c<T> r2 = r1.d
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        c(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, kotlinx.coroutines.flow.j<? super T> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.c.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$c$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.c.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$c$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$c$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.g0.n(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.b
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                java.lang.Object r2 = r0.a
                kotlinx.coroutines.flow.FlowKt__TransformKt$c r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt.c) r2
                kotlin.g0.n(r9)
                goto L60
            L40:
                kotlin.g0.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.a
                T r2 = r9.element
                kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.e<? super T>, java.lang.Object> r5 = r7.b
                r0.a = r7
                r0.b = r9
                r0.e = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                goto L78
            L5c:
                r2 = r9
                r9 = r8
                r8 = r2
                r2 = r7
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.element = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.c
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.a
                T r9 = r9.element
                r2 = 0
                r0.a = r2
                r0.b = r2
                r0.e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
            L78:
                return r1
            L79:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,113:1\n69#2,5:114\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.i<kotlin.collections.a1<? extends T>> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;

        public d(kotlinx.coroutines.flow.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super kotlin.collections.a1<? extends T>> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
                r3 = this;
                kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
                r0.<init>()
                kotlinx.coroutines.flow.i r1 = r3.a
                kotlinx.coroutines.flow.FlowKt__TransformKt$e r2 = new kotlinx.coroutines.flow.FlowKt__TransformKt$e
                r2.<init>(r4, r0)
                java.lang.Object r4 = r1.collect(r2, r5)
                java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
                if (r4 != r5) goto L17
                return r4
            L17:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,136:1\n32#2,4:137\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n71#1:137,4\n*E\n"})
    static final class e<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j<kotlin.collections.a1<? extends T>> a;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {71}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt.e<T> b;
            int c;

            a(kotlinx.coroutines.flow.FlowKt__TransformKt.e<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__TransformKt.e.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__TransformKt$e<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        e(kotlinx.coroutines.flow.j<? super kotlin.collections.a1<? extends T>> r1, kotlin.jvm.internal.Ref.IntRef r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt.e.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$e$a r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt.e.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$e$a r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$e$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.g0.n(r9)
                kotlinx.coroutines.flow.j<kotlin.collections.a1<? extends T>> r9 = r7.a
                kotlin.collections.a1 r2 = new kotlin.collections.a1
                kotlin.jvm.internal.Ref$IntRef r4 = r7.b
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.c = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1
            r0.<init>(r1, r2)
            return r0
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.i<R> b(kotlinx.coroutines.flow.i<?> r1) {
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<?> r1, @org.jetbrains.annotations.NotNull kotlin.reflect.d<R> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, R r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1
            r0.<init>(r2, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$b r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$b
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.z1(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<kotlin.collections.a1<T>> l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.FlowKt__TransformKt$d r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$d
            r0.<init>(r1)
            return r0
    }
}
