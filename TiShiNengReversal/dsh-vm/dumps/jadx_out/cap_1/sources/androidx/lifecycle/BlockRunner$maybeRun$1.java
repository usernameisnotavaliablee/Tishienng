package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class BlockRunner$maybeRun$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.lifecycle.BlockRunner<T> this$0;

    BlockRunner$maybeRun$1(androidx.lifecycle.BlockRunner<T> r1, kotlin.coroutines.e<? super androidx.lifecycle.BlockRunner$maybeRun$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.BlockRunner$maybeRun$1 r0 = new androidx.lifecycle.BlockRunner$maybeRun$1
            androidx.lifecycle.BlockRunner<T> r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.BlockRunner$maybeRun$1 r1 = (androidx.lifecycle.BlockRunner$maybeRun$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r5)
            goto L3c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.g0.n(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
            androidx.lifecycle.LiveDataScopeImpl r1 = new androidx.lifecycle.LiveDataScopeImpl
            androidx.lifecycle.BlockRunner<T> r3 = r4.this$0
            androidx.lifecycle.CoroutineLiveData r3 = androidx.lifecycle.BlockRunner.access$getLiveData$p(r3)
            kotlin.coroutines.i r5 = r5.getCoroutineContext()
            r1.<init>(r3, r5)
            androidx.lifecycle.BlockRunner<T> r5 = r4.this$0
            kotlin.jvm.functions.Function2 r5 = androidx.lifecycle.BlockRunner.access$getBlock$p(r5)
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L3c
            return r0
        L3c:
            androidx.lifecycle.BlockRunner<T> r5 = r4.this$0
            kotlin.jvm.functions.Function0 r5 = androidx.lifecycle.BlockRunner.access$getOnDone$p(r5)
            r5.invoke()
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }
}
