package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n*L\n1#1,332:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class FlowKt__ZipKt$combine$6$2<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T[], kotlin.coroutines.e<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    public FlowKt__ZipKt$combine$6$2(kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2> r2) {
            r0 = this;
            r0.$transform = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = this;
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super R> r3, @org.jetbrains.annotations.NotNull T[] r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r5) {
            r2 = this;
            kotlin.jvm.internal.g0.w()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.$transform
            r0.<init>(r1, r5)
            r0.L$0 = r3
            r0.L$1 = r4
            kotlin.n1 r3 = kotlin.n1.a
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.g0.n(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            kotlin.g0.n(r6)
            goto L3b
        L22:
            kotlin.g0.n(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L3b
            goto L46
        L3b:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            java.lang.Object r3 = r2.L$0
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
            java.lang.Object r0 = r2.L$1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r2.$transform
            java.lang.Object r0 = r1.invoke(r0, r2)
            r1 = 0
            kotlin.jvm.internal.d0.e(r1)
            r3.emit(r0, r2)
            r3 = 1
            kotlin.jvm.internal.d0.e(r3)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }
}
