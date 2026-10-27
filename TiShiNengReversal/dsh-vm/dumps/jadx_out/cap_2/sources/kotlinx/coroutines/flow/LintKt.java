package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class LintKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r0, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void b(kotlinx.coroutines.flow.j r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            a(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> kotlinx.coroutines.flow.i<T> d(kotlinx.coroutines.flow.x<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.u(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object f(kotlinx.coroutines.flow.x<? extends T> r1, kotlin.coroutines.e<? super java.lang.Integer> r2) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>"
            kotlin.jvm.internal.g0.n(r1, r0)
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            java.lang.Object r1 = kotlinx.coroutines.flow.k.Y(r1, r2)
            r2 = 1
            kotlin.jvm.internal.d0.e(r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.i i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(kotlinx.coroutines.flow.j r0) {
            return
    }

    public static final boolean k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(kotlinx.coroutines.flow.j r0) {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> kotlinx.coroutines.flow.i<T> m(kotlinx.coroutines.flow.x<? extends T> r1, long r2, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r4) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.w1(r1, r2, r4)
            return r1
    }

    static /* synthetic */ kotlinx.coroutines.flow.i n(kotlinx.coroutines.flow.x r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L9
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto L13
            kotlinx.coroutines.flow.LintKt$retry$1 r3 = new kotlinx.coroutines.flow.LintKt$retry$1
            r4 = 0
            r3.<init>(r4)
        L13:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>"
            kotlin.jvm.internal.g0.n(r0, r4)
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.w1(r0, r1, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> kotlinx.coroutines.flow.i<T> o(kotlinx.coroutines.flow.x<? extends T> r1, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.y1(r1, r2)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object p(kotlinx.coroutines.flow.x<? extends T> r1, java.util.List<T> r2, kotlin.coroutines.e<?> r3) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>"
            kotlin.jvm.internal.g0.n(r1, r0)
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.k.Y1(r1, r2, r3)
            r1 = 1
            kotlin.jvm.internal.d0.e(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "this code is supposed to be unreachable"
            r1.<init>(r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object q(kotlinx.coroutines.flow.x<? extends T> r2, kotlin.coroutines.e<? super java.util.List<? extends T>> r3) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>"
            kotlin.jvm.internal.g0.n(r2, r0)
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.flow.k.Z1(r2, r0, r3, r1, r0)
            kotlin.jvm.internal.d0.e(r1)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object r(kotlinx.coroutines.flow.x<? extends T> r1, java.util.Set<T> r2, kotlin.coroutines.e<?> r3) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>"
            kotlin.jvm.internal.g0.n(r1, r0)
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.k.a2(r1, r2, r3)
            r1 = 1
            kotlin.jvm.internal.d0.e(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "this code is supposed to be unreachable"
            r1.<init>(r2)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object s(kotlinx.coroutines.flow.x<? extends T> r2, kotlin.coroutines.e<? super java.util.Set<? extends T>> r3) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>"
            kotlin.jvm.internal.g0.n(r2, r0)
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.flow.k.b2(r2, r0, r3, r1, r0)
            kotlin.jvm.internal.d0.e(r1)
            return r2
    }
}
