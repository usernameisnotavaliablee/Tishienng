package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RemoteCoroutineWorker extends androidx.work.multiprocess.RemoteListenableWorker {

    @org.jetbrains.annotations.NotNull
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.b0 job;


    public RemoteCoroutineWorker(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r3)
            r2 = 0
            r3 = 1
            kotlinx.coroutines.b0 r2 = kotlinx.coroutines.h2.c(r2, r3, r2)
            r1.job = r2
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.future = r2
            androidx.work.multiprocess.RemoteCoroutineWorker$1 r3 = new androidx.work.multiprocess.RemoteCoroutineWorker$1
            r3.<init>(r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.getTaskExecutor()
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r2.addListener(r3, r0)
            return
    }

    public static final /* synthetic */ androidx.work.impl.utils.futures.SettableFuture access$getFuture$p(androidx.work.multiprocess.RemoteCoroutineWorker r0) {
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r0.future
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.b0 access$getJob$p(androidx.work.multiprocess.RemoteCoroutineWorker r0) {
            kotlinx.coroutines.b0 r0 = r0.job
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object doRemoteWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.work.ListenableWorker.Result> r1);

    @Override // androidx.work.multiprocess.RemoteListenableWorker, androidx.work.ListenableWorker
    public final void onStopped() {
            r2 = this;
            super.onStopped()
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.future
            r1 = 1
            r0.cancel(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setProgress(@org.jetbrains.annotations.NotNull androidx.work.Data r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r4 = r3.setProgressAsync(r4)
            java.lang.String r0 = "setProgressAsync(data)"
            kotlin.jvm.internal.g0.o(r4, r0)
            boolean r0 = r4.isDone()
            if (r0 == 0) goto L1e
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L14
            goto L42
        L14:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r5
        L1d:
            throw r4
        L1e:
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$1 r1 = new androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$1
            r1.<init>(r0, r4)
            androidx.work.DirectExecutor r2 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r1, r2)
            java.lang.Object r4 = r0.x()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r0) goto L42
            kotlin.coroutines.jvm.internal.e.c(r5)
        L42:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L49
            return r4
        L49:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    @org.jetbrains.annotations.NotNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startRemoteWork() {
            r7 = this;
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.g1.a()
            kotlinx.coroutines.b0 r1 = r7.job
            kotlin.coroutines.i r0 = r0.plus(r1)
            kotlinx.coroutines.r0 r1 = kotlinx.coroutines.s0.a(r0)
            androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1 r4 = new androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r7.future
            return r0
    }
}
