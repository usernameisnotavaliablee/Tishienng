package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements kotlinx.coroutines.flow.j {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> a;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> b;

    public FlowKt__ReduceKt$fold$2(kotlin.jvm.internal.Ref.ObjectRef<R> r1, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlin.jvm.internal.Ref$ObjectRef<R> r0 = r3.a
            kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r3.b
            T r2 = r0.element
            java.lang.Object r4 = r1.invoke(r2, r4, r5)
            r0.element = r4
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.g0.n(r8)
            goto L4c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.g0.n(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.a
            kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.e<? super R>, java.lang.Object> r2 = r6.b
            T r4 = r8.element
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r4, r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r5 = r8
            r8 = r7
            r7 = r5
        L4c:
            r7.element = r8
            kotlin.n1 r7 = kotlin.n1.a
            return r7
    }
}
