package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k<T, R> extends kotlin.j<T, R> implements kotlin.coroutines.e<R> {

    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function3<? super kotlin.j<?, ?>, java.lang.Object, ? super kotlin.coroutines.e<java.lang.Object>, ? extends java.lang.Object> a;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object b;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.e<java.lang.Object> c;

    @org.jetbrains.annotations.NotNull
    private java.lang.Object d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n182#2,6:162\n*E\n"})
    public static final class a implements kotlin.coroutines.e<java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.i a;
        final /* synthetic */ kotlin.k b;
        final /* synthetic */ kotlin.jvm.functions.Function3 c;
        final /* synthetic */ kotlin.coroutines.e d;

        public a(kotlin.coroutines.i r1, kotlin.k r2, kotlin.jvm.functions.Function3 r3, kotlin.coroutines.e r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // kotlin.coroutines.e
        public kotlin.coroutines.i getContext() {
                r1 = this;
                kotlin.coroutines.i r0 = r1.a
                return r0
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(java.lang.Object r3) {
                r2 = this;
                kotlin.k r0 = r2.b
                kotlin.jvm.functions.Function3 r1 = r2.c
                kotlin.k.f(r0, r1)
                kotlin.k r0 = r2.b
                kotlin.coroutines.e r1 = r2.d
                kotlin.k.e(r0, r1)
                kotlin.k r0 = r2.b
                kotlin.k.g(r0, r3)
                return
        }
    }

    public k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.j<T, R>, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, T r3) {
            r1 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r1, r2)
            r1.c = r1
            java.lang.Object r2 = kotlin.i.a()
            r1.d = r2
            return
    }

    public static final /* synthetic */ void e(kotlin.k r0, kotlin.coroutines.e r1) {
            r0.c = r1
            return
    }

    public static final /* synthetic */ void f(kotlin.k r0, kotlin.jvm.functions.Function3 r1) {
            r0.a = r1
            return
    }

    public static final /* synthetic */ void g(kotlin.k r0, java.lang.Object r1) {
            r0.d = r1
            return
    }

    private final kotlin.coroutines.e<java.lang.Object> i(kotlin.jvm.functions.Function3<? super kotlin.j<?, ?>, java.lang.Object, ? super kotlin.coroutines.e<java.lang.Object>, ? extends java.lang.Object> r3, kotlin.coroutines.e<java.lang.Object> r4) {
            r2 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.k$a r1 = new kotlin.k$a
            r1.<init>(r0, r2, r3, r4)
            return r1
    }

    @Override // kotlin.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object b(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r1 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r3, r0)
            r1.c = r3
            r1.b = r2
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.e.c(r3)
        L16:
            return r2
    }

    @Override // kotlin.j
    @org.jetbrains.annotations.Nullable
    public <U, S> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.h<U, S> r3, U r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super S> r5) {
            r2 = this;
            kotlin.jvm.functions.Function3 r3 = r3.a()
            java.lang.String r0 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r3, r0)
            kotlin.jvm.functions.Function3<? super kotlin.j<?, ?>, java.lang.Object, ? super kotlin.coroutines.e<java.lang.Object>, ? extends java.lang.Object> r0 = r2.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            if (r3 == r0) goto L1b
            r2.a = r3
            kotlin.jvm.internal.g0.n(r5, r1)
            kotlin.coroutines.e r3 = r2.i(r0, r5)
            r2.c = r3
            goto L20
        L1b:
            kotlin.jvm.internal.g0.n(r5, r1)
            r2.c = r5
        L20:
            r2.b = r4
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L2f
            kotlin.coroutines.jvm.internal.e.c(r5)
        L2f:
            return r3
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }

    public final R j() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.d
            kotlin.coroutines.e<java.lang.Object> r1 = r4.c
            if (r1 != 0) goto La
            kotlin.g0.n(r0)
            return r0
        La:
            java.lang.Object r2 = kotlin.i.a()
            boolean r2 = kotlin.Result.m13equalsimpl0(r2, r0)
            if (r2 == 0) goto L4c
            kotlin.jvm.functions.Function3<? super kotlin.j<?, ?>, java.lang.Object, ? super kotlin.coroutines.e<java.lang.Object>, ? extends java.lang.Object> r0 = r4.a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r4.b     // Catch: java.lang.Throwable -> L21
            boolean r3 = r0 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.k(r0, r4, r2, r1)     // Catch: java.lang.Throwable -> L21
            goto L2e
        L21:
            r0 = move-exception
            goto L3e
        L23:
            r3 = 3
            java.lang.Object r0 = kotlin.jvm.internal.u0.q(r0, r3)     // Catch: java.lang.Throwable -> L21
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.invoke(r4, r2, r1)     // Catch: java.lang.Throwable -> L21
        L2e:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r0 == r2) goto L0
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r1.resumeWith(r0)
            goto L0
        L3e:
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r1.resumeWith(r0)
            goto L0
        L4c:
            java.lang.Object r2 = kotlin.i.a()
            r4.d = r2
            r1.resumeWith(r0)
            goto L0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.d = r2
            return
    }
}
