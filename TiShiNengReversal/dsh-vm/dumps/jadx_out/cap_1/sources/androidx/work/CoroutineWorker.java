package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class CoroutineWorker extends androidx.work.ListenableWorker {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.m0 coroutineContext;

    @org.jetbrains.annotations.NotNull
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> future;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.b0 job;


    public CoroutineWorker(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters r3) {
            r1 = this;
            java.lang.String r0 = "appContext"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "params"
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
            androidx.work.CoroutineWorker$1 r3 = new androidx.work.CoroutineWorker$1
            r3.<init>(r1)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r0 = r1.getTaskExecutor()
            androidx.work.impl.utils.SerialExecutor r0 = r0.getBackgroundExecutor()
            r2.addListener(r3, r0)
            kotlinx.coroutines.m0 r2 = kotlinx.coroutines.g1.a()
            r1.coroutineContext = r2
            return
    }

    @kotlin.Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
            return
    }

    static /* synthetic */ java.lang.Object getForegroundInfo$suspendImpl(androidx.work.CoroutineWorker r0, kotlin.coroutines.e r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not implemented"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.work.ListenableWorker.Result> r1);

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 getCoroutineContext() {
            r1 = this;
            kotlinx.coroutines.m0 r0 = r1.coroutineContext
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getForegroundInfo(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.work.ForegroundInfo> r1) {
            r0 = this;
            java.lang.Object r1 = getForegroundInfo$suspendImpl(r0, r1)
            return r1
    }

    @Override // androidx.work.ListenableWorker
    @org.jetbrains.annotations.NotNull
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> getForegroundInfoAsync() {
            r9 = this;
            r0 = 1
            r1 = 0
            kotlinx.coroutines.b0 r0 = kotlinx.coroutines.h2.c(r1, r0, r1)
            kotlinx.coroutines.m0 r2 = r9.getCoroutineContext()
            kotlin.coroutines.i r2 = r2.plus(r0)
            kotlinx.coroutines.r0 r3 = kotlinx.coroutines.s0.a(r2)
            androidx.work.JobListenableFuture r2 = new androidx.work.JobListenableFuture
            r4 = 2
            r2.<init>(r0, r1, r4, r1)
            androidx.work.CoroutineWorker$getForegroundInfoAsync$1 r6 = new androidx.work.CoroutineWorker$getForegroundInfoAsync$1
            r6.<init>(r2, r9, r1)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r1.future
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.b0 getJob$work_runtime_ktx_release() {
            r1 = this;
            kotlinx.coroutines.b0 r0 = r1.job
            return r0
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
            r2 = this;
            super.onStopped()
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.future
            r1 = 0
            r0.cancel(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setForeground(@org.jetbrains.annotations.NotNull androidx.work.ForegroundInfo r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture r4 = r3.setForegroundAsync(r4)
            java.lang.String r0 = "setForegroundAsync(foregroundInfo)"
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
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
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
            androidx.work.ListenableFutureKt$await$2$1 r1 = new androidx.work.ListenableFutureKt$await$2$1
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

    @Override // androidx.work.ListenableWorker
    @org.jetbrains.annotations.NotNull
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
            r7 = this;
            kotlinx.coroutines.m0 r0 = r7.getCoroutineContext()
            kotlinx.coroutines.b0 r1 = r7.job
            kotlin.coroutines.i r0 = r0.plus(r1)
            kotlinx.coroutines.r0 r1 = kotlinx.coroutines.s0.a(r0)
            androidx.work.CoroutineWorker$startWork$1 r4 = new androidx.work.CoroutineWorker$startWork$1
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
