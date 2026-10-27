package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,118:1\n32#2,4:119\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n62#1:119,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements kotlinx.coroutines.flow.j<T> {
    private int a;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> b;

    public FlowKt__CollectKt$collectIndexed$2(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            r0 = this;
            r0.b = r1
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r3.b
            int r1 = r3.a
            int r2 = r1 + 1
            r3.a = r2
            if (r1 < 0) goto L21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1, r4, r5)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L21:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "Index overflow has happened"
            r4.<init>(r5)
            throw r4
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r3.b
            int r1 = r3.a
            int r2 = r1 + 1
            r3.a = r2
            if (r1 < 0) goto L1c
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
            java.lang.Object r4 = r0.invoke(r1, r4, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L19
            return r4
        L19:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L1c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "Index overflow has happened"
            r4.<init>(r5)
            throw r4
    }
}
