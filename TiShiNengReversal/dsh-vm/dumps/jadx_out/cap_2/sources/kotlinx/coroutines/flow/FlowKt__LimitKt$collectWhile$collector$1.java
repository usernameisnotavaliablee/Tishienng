package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n*L\n1#1,141:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements kotlinx.coroutines.flow.j<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> a;

    public FlowKt__LimitKt$collectWhile$collector$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r0.<init>(r1, r3)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.invoke(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1e
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L1e:
            kotlinx.coroutines.flow.internal.AbortFlowException r2 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r2.<init>(r1)
            throw r2
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r5 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r5
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
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L51
            kotlin.n1 r5 = kotlin.n1.a
            return r5
        L51:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
    }
}
