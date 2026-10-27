package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class o {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {17}, m = "count", n = {"i"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.flow.o.a> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.flow.k.Y(r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef a;

        b(kotlin.jvm.internal.Ref.IntRef r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.jvm.internal.Ref$IntRef r1 = r0.a
                int r2 = r1.element
                int r2 = r2 + 1
                r1.element = r2
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {29}, m = "count", n = {"i"}, s = {"L$0"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        /* synthetic */ java.lang.Object b;
        int c;

        c(kotlin.coroutines.e<? super kotlinx.coroutines.flow.o.c> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.flow.k.Z(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> a;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {30}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object a;
            /* synthetic */ java.lang.Object b;
            final /* synthetic */ kotlinx.coroutines.flow.o.d<T> c;
            int d;

            a(kotlinx.coroutines.flow.o.d<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.o.d.a> r2) {
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
                    kotlinx.coroutines.flow.o$d<T> r2 = r1.c
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        d(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1, kotlin.jvm.internal.Ref.IntRef r2) {
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.o$d$a r0 = (kotlinx.coroutines.flow.o.d.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.o$d$a r0 = new kotlinx.coroutines.flow.o$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.a
                kotlinx.coroutines.flow.o$d r5 = (kotlinx.coroutines.flow.o.d) r5
                kotlin.g0.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.g0.n(r6)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r6 = r4.a
                r0.a = r4
                r0.d = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                kotlin.jvm.internal.Ref$IntRef r5 = r5.b
                int r6 = r5.element
                int r6 = r6 + r3
                r5.element = r6
            L55:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.g0.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r5)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            kotlinx.coroutines.flow.o$b r2 = new kotlinx.coroutines.flow.o$b
            r2.<init>(r5)
            r0.a = r5
            r0.c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$c r0 = (kotlinx.coroutines.flow.o.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$c r0 = new kotlinx.coroutines.flow.o$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.g0.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.g0.n(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            kotlinx.coroutines.flow.o$d r2 = new kotlinx.coroutines.flow.o$d
            r2.<init>(r5, r6)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.f(r4)
            return r4
    }
}
