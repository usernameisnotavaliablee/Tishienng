package androidx.lifecycle;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> $block;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State $minState;
    final /* synthetic */ androidx.lifecycle.Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    PausingDispatcherKt$whenStateAtLeast$2(androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.e<? super androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2> r4) {
            r0 = this;
            r0.$this_whenStateAtLeast = r1
            r0.$minState = r2
            r0.$block = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) {
            r4 = this;
            androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r0 = new androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2
            androidx.lifecycle.Lifecycle r1 = r4.$this_whenStateAtLeast
            androidx.lifecycle.Lifecycle$State r2 = r4.$minState
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r3 = r4.$block
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
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
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super T> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 r1 = (androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r7.L$0
            androidx.lifecycle.LifecycleController r0 = (androidx.lifecycle.LifecycleController) r0
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L13
            goto L50
        L13:
            r8 = move-exception
            goto L56
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.r0 r8 = (kotlinx.coroutines.r0) r8
            kotlin.coroutines.i r8 = r8.getCoroutineContext()
            kotlinx.coroutines.e2$b r1 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r8 = r8.get(r1)
            kotlinx.coroutines.e2 r8 = (kotlinx.coroutines.e2) r8
            if (r8 == 0) goto L5a
            androidx.lifecycle.PausingDispatcher r1 = new androidx.lifecycle.PausingDispatcher
            r1.<init>()
            androidx.lifecycle.LifecycleController r3 = new androidx.lifecycle.LifecycleController
            androidx.lifecycle.Lifecycle r4 = r7.$this_whenStateAtLeast
            androidx.lifecycle.Lifecycle$State r5 = r7.$minState
            androidx.lifecycle.DispatchQueue r6 = r1.dispatchQueue
            r3.<init>(r4, r5, r6, r8)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> r8 = r7.$block     // Catch: java.lang.Throwable -> L54
            r7.L$0 = r3     // Catch: java.lang.Throwable -> L54
            r7.label = r2     // Catch: java.lang.Throwable -> L54
            java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r8, r7)     // Catch: java.lang.Throwable -> L54
            if (r8 != r0) goto L4f
            return r0
        L4f:
            r0 = r3
        L50:
            r0.finish()
            return r8
        L54:
            r8 = move-exception
            r0 = r3
        L56:
            r0.finish()
            throw r8
        L5a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "when[State] methods should have a parent job"
            r8.<init>(r0)
            throw r8
    }
}
