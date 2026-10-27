package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Worker extends androidx.work.ListenableWorker {
    androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker.Result> mFuture;


    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"BanKeepAnnotation"})
    public Worker(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public abstract androidx.work.ListenableWorker.Result doWork();

    @Override // androidx.work.ListenableWorker
    @androidx.annotation.NonNull
    public final com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork() {
            r2 = this;
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r2.mFuture = r0
            java.util.concurrent.Executor r0 = r2.getBackgroundExecutor()
            androidx.work.Worker$1 r1 = new androidx.work.Worker$1
            r1.<init>(r2)
            r0.execute(r1)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.ListenableWorker$Result> r0 = r2.mFuture
            return r0
    }
}
