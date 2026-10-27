package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,222:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements kotlinx.coroutines.flow.j {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> a;
    final /* synthetic */ kotlinx.coroutines.flow.j<R> b;

    public FlowKt__EmittersKt$unsafeTransform$1$1(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, kotlinx.coroutines.flow.j<? super R> r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(T r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r2, r4)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r2.a
            kotlinx.coroutines.flow.j<R> r1 = r2.b
            r0.invoke(r1, r3, r4)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.g0.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.g0.n(r6)
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r6 = r4.a
            kotlinx.coroutines.flow.j<R> r2 = r4.b
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r2, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }
}
