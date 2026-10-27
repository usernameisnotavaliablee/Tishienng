package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lint.kt\nkotlinx/coroutines/flow/LintKt$retry$1\n*L\n1#1,193:1\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class LintKt$retry$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
    int label;

    public LintKt$retry$1(kotlin.coroutines.e<? super kotlinx.coroutines.flow.LintKt$retry$1> r2) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r0 = this;
            kotlinx.coroutines.flow.LintKt$retry$1 r1 = new kotlinx.coroutines.flow.LintKt$retry$1
            r1.<init>(r2)
            return r1
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.LintKt$retry$1 r1 = (kotlinx.coroutines.flow.LintKt$retry$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r1.label
            if (r0 != 0) goto L10
            kotlin.g0.n(r2)
            r2 = 1
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
            return r2
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r0)
            throw r2
    }
}
