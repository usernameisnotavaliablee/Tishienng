package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", f = "RemoteCoroutineWorker.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RemoteCoroutineWorker$startRemoteWork$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    int label;
    final /* synthetic */ androidx.work.multiprocess.RemoteCoroutineWorker this$0;

    RemoteCoroutineWorker$startRemoteWork$1(androidx.work.multiprocess.RemoteCoroutineWorker r1, kotlin.coroutines.e<? super androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
            r1 = this;
            androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 r2 = new androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1
            androidx.work.multiprocess.RemoteCoroutineWorker r0 = r1.this$0
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
            androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 r1 = (androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1) r1
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
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.g0.n(r4)     // Catch: java.lang.Throwable -> Lf
            goto L27
        Lf:
            r4 = move-exception
            goto L33
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            kotlin.g0.n(r4)
            androidx.work.multiprocess.RemoteCoroutineWorker r4 = r3.this$0     // Catch: java.lang.Throwable -> Lf
            r3.label = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r4 = r4.doRemoteWork(r3)     // Catch: java.lang.Throwable -> Lf
            if (r4 != r0) goto L27
            return r0
        L27:
            androidx.work.ListenableWorker$Result r4 = (androidx.work.ListenableWorker.Result) r4     // Catch: java.lang.Throwable -> Lf
            androidx.work.multiprocess.RemoteCoroutineWorker r0 = r3.this$0     // Catch: java.lang.Throwable -> Lf
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.multiprocess.RemoteCoroutineWorker.access$getFuture$p(r0)     // Catch: java.lang.Throwable -> Lf
            r0.set(r4)     // Catch: java.lang.Throwable -> Lf
            goto L3c
        L33:
            androidx.work.multiprocess.RemoteCoroutineWorker r0 = r3.this$0
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.multiprocess.RemoteCoroutineWorker.access$getFuture$p(r0)
            r0.setException(r4)
        L3c:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
