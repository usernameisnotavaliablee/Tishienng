package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,113:1\n289#2,5:114\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3<R> implements kotlinx.coroutines.flow.i<R> {
    final /* synthetic */ kotlinx.coroutines.flow.i[] a;
    final /* synthetic */ kotlin.jvm.functions.Function2 b;


    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(kotlinx.coroutines.flow.i[] r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            r5 = this;
            kotlinx.coroutines.flow.i[] r0 = r5.a
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$1
            kotlinx.coroutines.flow.i[] r2 = r5.a
            r1.<init>(r2)
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2
            kotlin.jvm.functions.Function2 r3 = r5.b
            r4 = 0
            r2.<init>(r3, r4)
            java.lang.Object r6 = kotlinx.coroutines.flow.internal.k.a(r6, r0, r1, r2, r7)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
            if (r6 != r7) goto L22
            return r6
        L22:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r7) {
            r5 = this;
            r0 = 4
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$1
            r0.<init>(r5, r7)
            r0 = 5
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.flow.i[] r0 = r5.a
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$1 r1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$1
            kotlinx.coroutines.flow.i[] r2 = r5.a
            r1.<init>(r2)
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2
            kotlin.jvm.functions.Function2 r3 = r5.b
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 0
            kotlin.jvm.internal.d0.e(r3)
            kotlinx.coroutines.flow.internal.k.a(r6, r0, r1, r2, r7)
            r6 = 1
            kotlin.jvm.internal.d0.e(r6)
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }
}
