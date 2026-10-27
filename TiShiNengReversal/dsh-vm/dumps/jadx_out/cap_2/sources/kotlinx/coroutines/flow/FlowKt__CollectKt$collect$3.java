package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,118:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__CollectKt$collect$3<T> implements kotlinx.coroutines.flow.j<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> a;

    public FlowKt__CollectKt$collect$3(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
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
            kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            r0.<init>(r1, r3)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r1.a
            r0.invoke(r2, r3)
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r1.a
            java.lang.Object r2 = r0.invoke(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }
}
