package kotlinx.coroutines.flow;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a = "kotlinx.coroutines.flow.defaultConcurrency";

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object A(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.f(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> A0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.l(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> A1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.j(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object B(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.b(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> B0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.a(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> B1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.h(r0, r1)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> C(java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r0, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.b(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> C0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.b(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> C1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.i(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> D(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.c(r0, r1, r2)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> D0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.c(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> D1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.k(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> E(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.d(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i E0(kotlinx.coroutines.flow.i r0, int r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.d(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> E1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.B(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> F(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.e(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> F0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.m(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> F1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.C(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> G(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.f(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> G0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.e(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> G1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.c0 r2, int r3) {
            kotlinx.coroutines.flow.x r0 = kotlinx.coroutines.flow.r.g(r0, r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> H(kotlinx.coroutines.flow.i<? extends T>[] r0, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.g(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> H0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.f(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.x H1(kotlinx.coroutines.flow.i r0, kotlinx.coroutines.r0 r1, kotlinx.coroutines.flow.c0 r2, int r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.x r0 = kotlinx.coroutines.flow.r.h(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> I(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.b(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i I0(kotlinx.coroutines.flow.i r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.g(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object I1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.j(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> J(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.c(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> J0(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.n(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object J1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.k(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> K(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.d(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombine")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> K0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.p(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> K1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.D(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> L(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.e(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.jvm.JvmName(name = "flowCombineTransform")
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> L0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.q(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> L1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.E(r0, r1)
            return r0
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> M(java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r0, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> M0(T r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.o(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> M1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.F(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> N(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.i(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> N0(@org.jetbrains.annotations.NotNull T... r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.p(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object N1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.flow.h0<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.r.i(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> O(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.j(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> O0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.h0<T> O1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.c0 r2, T r3) {
            kotlinx.coroutines.flow.h0 r0 = kotlinx.coroutines.flow.r.j(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> P(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.k(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, R> java.lang.Object P0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.e(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.G(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> Q(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r4, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function7<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.l(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void Q0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.n(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.H(r0, r1)
            return
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> R(kotlinx.coroutines.flow.i<? extends T>[] r0, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.m(r0, r1)
            return r0
    }

    public static final int R0() {
            int r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.h()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void R1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt.I(r0, r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> S(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.i<? extends T>, ? extends kotlinx.coroutines.flow.i<? extends R>> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.f(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    public static /* synthetic */ void S0() {
            kotlinx.coroutines.flow.FlowKt__MergeKt.j()
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> S1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.J(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> T(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.i<? extends R>> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object T0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.g(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> T1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.K(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> U(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object U0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> U1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.g(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> V(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.i(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.e2 V0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1) {
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> V1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> W(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.g(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> W0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.f(r0, r1)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> W1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.j(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> X(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.l.c(r0)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> X0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.k(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object X1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull C r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super C> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.m.a(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object Y(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.o.a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> Y0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object Y1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.List<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.m.b(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object Z(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.o.b(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> Z0(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.l(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object Z1(kotlinx.coroutines.flow.i r0, java.util.List r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.m.c(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.a(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.a(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.o(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object a2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull java.util.Set<T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.Set<? extends T>> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.m.d(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.b(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.OverloadResolutionByLambdaReturnType
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.b(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T>... r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.m(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object b2(kotlinx.coroutines.flow.i r0, java.util.Set r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            java.lang.Object r0 = kotlinx.coroutines.flow.m.e(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.c(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.c(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void c1() {
            java.lang.Void r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.p()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> c2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.d(r0)
            return r0
    }

    @kotlinx.coroutines.FlowPreview
    @kotlin.jvm.JvmName(name = "debounceDuration")
    @org.jetbrains.annotations.NotNull
    @kotlin.OverloadResolutionByLambdaReturnType
    public static final <T> kotlinx.coroutines.flow.i<T> d0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.time.h> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.p.d(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.q(r0, r1)
            return r0
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> d2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MergeKt.n(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Integer> e(@org.jetbrains.annotations.NotNull kotlin.ranges.m r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.e(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.j(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.d(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> e2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.i(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Long> f(@org.jetbrains.annotations.NotNull kotlin.ranges.p r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.f(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.k(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.h(r0, r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> f2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.g(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.q.a(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.e(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<kotlin.collections.a1<T>> g2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.l(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.l.b(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.q.b(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.r(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> h2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ZipKt.s(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Integer> i(@org.jetbrains.annotations.NotNull int[] r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.h(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, K> kotlinx.coroutines.flow.i<T> i0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.q.c(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> i1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.s(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.lang.Long> j(@org.jetbrains.annotations.NotNull long[] r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.i(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.d(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.t(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k(@org.jetbrains.annotations.NotNull T[] r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.j(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.e(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.u(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.s<T> r0) {
            kotlinx.coroutines.flow.x r0 = kotlinx.coroutines.flow.r.a(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object l0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.l.d(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i l1(kotlinx.coroutines.flow.i r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.v(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.h0<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.t<T> r0) {
            kotlinx.coroutines.flow.h0 r0 = kotlinx.coroutines.flow.r.b(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object m0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.g(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> m1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__EmittersKt.f(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.i n(kotlinx.coroutines.flow.i r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> n0() {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.m()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.x<T> n1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.x<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.x r0 = kotlinx.coroutines.flow.r.f(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> o(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.b(r0, r1, r2)
            return r0
    }

    public static final void o0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<?> r0) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt.b(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.channels.b0<T> o1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1) {
            kotlinx.coroutines.channels.b0 r0 = kotlinx.coroutines.flow.l.f(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i p(kotlinx.coroutines.flow.i r0, int r1, int r2, java.lang.Object r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.c(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> p0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.a(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> p1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.w(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i q(kotlinx.coroutines.flow.i r0, int r1, kotlinx.coroutines.channels.BufferOverflow r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.d(r0, r1, r2, r3, r4)
            return r0
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.i<R> q0(kotlinx.coroutines.flow.i<?> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.b(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> q1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.x(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.a(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> r0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<?> r0, @org.jetbrains.annotations.NotNull kotlin.reflect.d<R> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.c(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> r1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.y(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> s(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.k(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> s0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.d(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> s1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.l.g(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> t(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.n.e(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> t0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.e(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <S, T extends S> java.lang.Object t1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.e<? super S>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super S> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.i(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> u(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object u0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.a(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> u1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.z(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object v(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Throwable> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.b(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object v0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.b(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> v1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__MigrationKt.A(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> w(@kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.z<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.l(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object w0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.c(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> w1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, long r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.e(r0, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<?> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.a(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object x0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.d(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i x1(kotlinx.coroutines.flow.i r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.f(r0, r1, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object y(kotlinx.coroutines.flow.i<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.b(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.b0<kotlin.n1> y0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r0, long r1, long r3) {
            kotlinx.coroutines.channels.b0 r0 = kotlinx.coroutines.flow.p.f(r0, r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> y1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object z(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.d(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 z0(kotlinx.coroutines.r0 r0, long r1, long r3, int r5, java.lang.Object r6) {
            kotlinx.coroutines.channels.b0 r0 = kotlinx.coroutines.flow.p.g(r0, r1, r3, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> z1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.FlowKt__TransformKt.i(r0, r1, r2)
            return r0
    }
}
