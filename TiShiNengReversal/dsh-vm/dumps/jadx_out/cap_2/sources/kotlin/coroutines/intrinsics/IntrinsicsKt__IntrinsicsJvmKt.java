package kotlin.coroutines.intrinsics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class IntrinsicsKt__IntrinsicsJvmKt {
    public IntrinsicsKt__IntrinsicsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    private static final <T> kotlin.coroutines.e<kotlin.n1> a(kotlin.coroutines.e<? super T> r2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3) {
            kotlin.coroutines.i r0 = r2.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto Le
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 r0 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            r0.<init>(r2, r3)
            return r0
        Le:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            r1.<init>(r2, r0, r3)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.coroutines.e<kotlin.n1> b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.e r3 = kotlin.coroutines.jvm.internal.e.a(r3)
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L19
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r2 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r2
            kotlin.coroutines.e r2 = r2.create(r3)
            return r2
        L19:
            kotlin.coroutines.i r0 = r3.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L27
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 r0 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            r0.<init>(r3, r2)
            return r0
        L27:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            r1.<init>(r3, r0, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <R, T> kotlin.coroutines.e<kotlin.n1> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, R r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.coroutines.e r4 = kotlin.coroutines.jvm.internal.e.a(r4)
            boolean r0 = r2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 == 0) goto L19
            kotlin.coroutines.jvm.internal.BaseContinuationImpl r2 = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) r2
            kotlin.coroutines.e r2 = r2.create(r3, r4)
            return r2
        L19:
            kotlin.coroutines.i r0 = r4.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L27
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 r0 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            r0.<init>(r4, r2, r3)
            return r0
        L27:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            r1.<init>(r4, r0, r2, r3)
            return r1
    }

    private static final <T> kotlin.coroutines.e<T> d(kotlin.coroutines.e<? super T> r2) {
            kotlin.coroutines.i r0 = r2.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto Le
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 r0 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            r0.<init>(r2)
            return r0
        Le:
            kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2 r1 = new kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            r1.<init>(r2, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.coroutines.e<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.ContinuationImpl
            if (r0 == 0) goto Ld
            r0 = r1
            kotlin.coroutines.jvm.internal.ContinuationImpl r0 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L18
            kotlin.coroutines.e r0 = r0.intercepted()
            if (r0 != 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object f(kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r1 = i(r1, r2)
            return r1
        L13:
            r0 = 1
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r1 = r1.invoke(r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T> java.lang.Object g(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, kotlin.coroutines.e<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r1 = j(r1, r2, r3)
            return r1
        L13:
            r0 = 2
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r1 = r1.invoke(r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <R, P, T> java.lang.Object h(kotlin.jvm.functions.Function3<? super R, ? super P, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, P r3, kotlin.coroutines.e<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r1 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl
            if (r0 != 0) goto L13
            java.lang.Object r1 = k(r1, r2, r3, r4)
            return r1
        L13:
            r0 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            java.lang.Object r1 = r1.invoke(r2, r3, r4)
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.coroutines.e r2 = kotlin.coroutines.jvm.internal.e.a(r2)
            kotlin.coroutines.e r2 = d(r2)
            r0 = 1
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r1 = r1.invoke(r2)
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R, T> java.lang.Object j(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.e r3 = kotlin.coroutines.jvm.internal.e.a(r3)
            kotlin.coroutines.e r3 = d(r3)
            r0 = 2
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r1 = r1.invoke(r2, r3)
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static <R, P, T> java.lang.Object k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super P, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, P r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.coroutines.e r4 = kotlin.coroutines.jvm.internal.e.a(r4)
            kotlin.coroutines.e r4 = d(r4)
            r0 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r0)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            java.lang.Object r1 = r1.invoke(r2, r3, r4)
            return r1
    }
}
