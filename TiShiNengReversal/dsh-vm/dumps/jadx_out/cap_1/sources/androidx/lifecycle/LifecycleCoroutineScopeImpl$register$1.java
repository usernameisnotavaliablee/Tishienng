package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class LifecycleCoroutineScopeImpl$register$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl this$0;

    LifecycleCoroutineScopeImpl$register$1(androidx.lifecycle.LifecycleCoroutineScopeImpl r1, kotlin.coroutines.e<? super androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = r2.this$0
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
            androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 r1 = (androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            kotlin.coroutines.intrinsics.a.l()
            int r0 = r2.label
            if (r0 != 0) goto L38
            kotlin.g0.n(r3)
            java.lang.Object r3 = r2.L$0
            kotlinx.coroutines.r0 r3 = (kotlinx.coroutines.r0) r3
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle$lifecycle_common()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L2c
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = r2.this$0
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle$lifecycle_common()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = r2.this$0
            r3.addObserver(r0)
            goto L35
        L2c:
            kotlin.coroutines.i r3 = r3.getCoroutineContext()
            r0 = 1
            r1 = 0
            kotlinx.coroutines.h2.i(r3, r1, r0, r1)
        L35:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
    }
}
