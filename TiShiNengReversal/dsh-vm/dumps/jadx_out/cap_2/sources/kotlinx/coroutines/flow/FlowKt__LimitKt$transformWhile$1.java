package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n126#2,15:142\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n119#1:142,15\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class FlowKt__LimitKt$transformWhile$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int a;
    private /* synthetic */ java.lang.Object b;
    final /* synthetic */ kotlinx.coroutines.flow.i<T> c;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> d;

    FlowKt__LimitKt$transformWhile$1(kotlinx.coroutines.flow.i<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1> r3) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
            kotlinx.coroutines.flow.i<T> r1 = r3.c
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r2 = r3.d
            r0.<init>(r1, r2, r5)
            r0.b = r4
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.b
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
            kotlin.g0.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L13
            goto L3d
        L13:
            r6 = move-exception
            goto L3a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.g0.n(r6)
            java.lang.Object r6 = r5.b
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
            kotlinx.coroutines.flow.i<T> r1 = r5.c
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r3 = r5.d
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            r4.<init>(r3, r6)
            r5.b = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r5.a = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            java.lang.Object r6 = r1.collect(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            if (r6 != r0) goto L3d
            return r0
        L38:
            r6 = move-exception
            r0 = r4
        L3a:
            kotlinx.coroutines.flow.internal.o.b(r6, r0)
        L3d:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }
}
