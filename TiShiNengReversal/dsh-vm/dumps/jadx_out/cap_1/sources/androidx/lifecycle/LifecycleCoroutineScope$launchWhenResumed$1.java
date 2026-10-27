package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LifecycleCoroutineScope$launchWhenResumed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> $block;
    int label;
    final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScope this$0;

    LifecycleCoroutineScope$launchWhenResumed$1(androidx.lifecycle.LifecycleCoroutineScope r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2, kotlin.coroutines.e<? super androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$block = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r3 = new androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1
            androidx.lifecycle.LifecycleCoroutineScope r0 = r2.this$0
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r2.$block
            r3.<init>(r0, r1, r4)
            return r3
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
            androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 r1 = (androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r4)
            goto L2b
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.g0.n(r4)
            androidx.lifecycle.LifecycleCoroutineScope r4 = r3.this$0
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle$lifecycle_common()
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r1 = r3.$block
            r3.label = r2
            java.lang.Object r4 = androidx.lifecycle.PausingDispatcherKt.whenResumed(r4, r1, r3)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
