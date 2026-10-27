package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class BlockRunner$cancel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int label;
    final /* synthetic */ androidx.lifecycle.BlockRunner<T> this$0;

    BlockRunner$cancel$1(androidx.lifecycle.BlockRunner<T> r1, kotlin.coroutines.e<? super androidx.lifecycle.BlockRunner$cancel$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
            r1 = this;
            androidx.lifecycle.BlockRunner$cancel$1 r2 = new androidx.lifecycle.BlockRunner$cancel$1
            androidx.lifecycle.BlockRunner<T> r0 = r1.this$0
            r2.<init>(r0, r3)
            return r2
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
            androidx.lifecycle.BlockRunner$cancel$1 r1 = (androidx.lifecycle.BlockRunner$cancel$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r6)
            goto L29
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.g0.n(r6)
            androidx.lifecycle.BlockRunner<T> r6 = r5.this$0
            long r3 = androidx.lifecycle.BlockRunner.access$getTimeoutInMs$p(r6)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.a1.b(r3, r5)
            if (r6 != r0) goto L29
            return r0
        L29:
            androidx.lifecycle.BlockRunner<T> r6 = r5.this$0
            androidx.lifecycle.CoroutineLiveData r6 = androidx.lifecycle.BlockRunner.access$getLiveData$p(r6)
            boolean r6 = r6.hasActiveObservers()
            if (r6 != 0) goto L46
            androidx.lifecycle.BlockRunner<T> r6 = r5.this$0
            kotlinx.coroutines.e2 r6 = androidx.lifecycle.BlockRunner.access$getRunningJob$p(r6)
            r0 = 0
            if (r6 == 0) goto L41
            kotlinx.coroutines.e2.a.b(r6, r0, r2, r0)
        L41:
            androidx.lifecycle.BlockRunner<T> r6 = r5.this$0
            androidx.lifecycle.BlockRunner.access$setRunningJob$p(r6, r0)
        L46:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
    }
}
