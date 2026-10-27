package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n107#3:143\n107#3:144\n107#3:145\n107#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__LimitKt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1\n*L\n1#1,141:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt.a> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt__LimitKt.b(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n23#2,5:114\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;
        final /* synthetic */ int b;

        public b(kotlinx.coroutines.flow.i r1, int r2) {
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
                kotlin.jvm.internal.Ref$IntRef r0 = new kotlin.jvm.internal.Ref$IntRef
                r0.<init>()
                kotlinx.coroutines.flow.i r1 = r4.a
                kotlinx.coroutines.flow.FlowKt__LimitKt$c r2 = new kotlinx.coroutines.flow.FlowKt__LimitKt$c
                int r3 = r4.b
                r2.<init>(r0, r3, r5)
                java.lang.Object r5 = r1.collect(r2, r6)
                java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
                if (r5 != r6) goto L19
                return r5
            L19:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef a;
        final /* synthetic */ int b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__LimitKt.c<T> b;
            int c;

            a(kotlinx.coroutines.flow.FlowKt__LimitKt.c<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt.c.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__LimitKt$c<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        c(kotlin.jvm.internal.Ref.IntRef r1, int r2, kotlinx.coroutines.flow.j<? super T> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.c.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$c$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$c$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.g0.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.a
                int r2 = r7.element
                int r4 = r5.b
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.j<T> r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n34#2,10:114\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlinx.coroutines.flow.i a;
        final /* synthetic */ kotlin.jvm.functions.Function2 b;

        public d(kotlinx.coroutines.flow.i r1, kotlin.jvm.functions.Function2 r2) {
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
                kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
                r0.<init>()
                kotlinx.coroutines.flow.i r1 = r4.a
                kotlinx.coroutines.flow.FlowKt__LimitKt$e r2 = new kotlinx.coroutines.flow.FlowKt__LimitKt$e
                kotlin.jvm.functions.Function2 r3 = r4.b
                r2.<init>(r0, r5, r3)
                java.lang.Object r5 = r1.collect(r2, r6)
                java.lang.Object r6 = kotlin.coroutines.intrinsics.a.l()
                if (r5 != r6) goto L19
                return r5
            L19:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef a;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> b;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            java.lang.Object b;
            /* synthetic */ java.lang.Object c;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__LimitKt.e<T> d;
            int e;

            a(kotlinx.coroutines.flow.FlowKt__LimitKt.e<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt.e.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__LimitKt$e<T> r2 = r1.d
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        e(kotlin.jvm.internal.Ref.BooleanRef r1, kotlinx.coroutines.flow.j<? super T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$e$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$e$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.g0.n(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.b
                java.lang.Object r2 = r0.a
                kotlinx.coroutines.flow.FlowKt__LimitKt$e r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt.e) r2
                kotlin.g0.n(r8)
                goto L6c
            L41:
                kotlin.g0.n(r8)
                goto L59
            L45:
                kotlin.g0.n(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.a
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.j<T> r8 = r6.b
                r0.e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r8 = r6.c
                r0.a = r6
                r0.b = r7
                r0.e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.a
                r8.element = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.b
                r2 = 0
                r0.a = r2
                r0.b = r2
                r0.e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
            L8b:
                kotlin.n1 r7 = kotlin.n1.a
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    static final class f<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        f(kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt.f> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt__LimitKt.a(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class g<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef a;
        final /* synthetic */ int b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__LimitKt.g<T> b;
            int c;

            a(kotlinx.coroutines.flow.FlowKt__LimitKt.g<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt.g.a> r2) {
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
                    kotlinx.coroutines.flow.FlowKt__LimitKt$g<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        g(kotlin.jvm.internal.Ref.IntRef r1, int r2, kotlinx.coroutines.flow.j<? super T> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.g.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.g.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__LimitKt$g$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.g0.n(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.g0.n(r7)
                goto L51
            L38:
                kotlin.g0.n(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.a
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.j<T> r7 = r5.c
                r0.c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L5e
            L51:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
            L54:
                kotlinx.coroutines.flow.j<T> r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.a(r7, r6, r0)
                if (r6 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.flow.j r0, java.lang.Object r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = f(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$a r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.g0.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.g0.n(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L4f:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    private static final <T> java.lang.Object c(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r0.<init>(r2)
            r2 = 0
            kotlin.jvm.internal.d0.e(r2)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            r1.collect(r0, r3)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            r1 = 1
            kotlin.jvm.internal.d0.e(r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            goto L15
        L11:
            r1 = move-exception
            kotlinx.coroutines.flow.internal.o.b(r1, r0)
        L15:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, int r2) {
            if (r2 < 0) goto L8
            kotlinx.coroutines.flow.FlowKt__LimitKt$b r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$b
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Drop count should be non-negative, but had "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$d r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$d
            r0.<init>(r1, r2)
            return r0
    }

    private static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, kotlin.coroutines.e<? super kotlin.n1> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.f
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.f) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$f r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.g0.n(r6)
            goto L43
        L35:
            kotlin.g0.n(r6)
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, int r2) {
            if (r2 <= 0) goto L8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested element count "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = " should be positive"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.J0(r0)
            return r2
    }
}
