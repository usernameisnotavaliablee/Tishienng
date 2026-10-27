package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements kotlinx.coroutines.flow.i<R> {
    final /* synthetic */ kotlinx.coroutines.flow.i a;
    final /* synthetic */ kotlin.jvm.functions.Function3 b;


    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.i r1, kotlin.jvm.functions.Function3 r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            kotlinx.coroutines.flow.i r0 = r3.a
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r2 = r3.b
            r1.<init>(r2, r4)
            java.lang.Object r4 = r0.collect(r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L14
            return r4
        L14:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r5) {
            r3 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1
            r0.<init>(r3, r5)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.i r0 = r3.a
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1
            kotlin.jvm.functions.Function3 r2 = r3.b
            r1.<init>(r2, r4)
            r4 = 0
            kotlin.jvm.internal.d0.e(r4)
            r0.collect(r1, r5)
            r4 = 1
            kotlin.jvm.internal.d0.e(r4)
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
