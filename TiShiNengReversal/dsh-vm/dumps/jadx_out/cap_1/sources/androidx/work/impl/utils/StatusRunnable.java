package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class StatusRunnable<T> implements java.lang.Runnable {
    private final androidx.work.impl.utils.futures.SettableFuture<T> mFuture;






    public StatusRunnable() {
            r1 = this;
            r1.<init>()
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r1.mFuture = r0
            return
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forStringIds(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull java.util.List<java.lang.String> r2) {
            androidx.work.impl.utils.StatusRunnable$1 r0 = new androidx.work.impl.utils.StatusRunnable$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forTag(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull java.lang.String r2) {
            androidx.work.impl.utils.StatusRunnable$3 r0 = new androidx.work.impl.utils.StatusRunnable$3
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.utils.StatusRunnable<androidx.work.WorkInfo> forUUID(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull java.util.UUID r2) {
            androidx.work.impl.utils.StatusRunnable$2 r0 = new androidx.work.impl.utils.StatusRunnable$2
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forUniqueWork(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull java.lang.String r2) {
            androidx.work.impl.utils.StatusRunnable$4 r0 = new androidx.work.impl.utils.StatusRunnable$4
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forWorkQuerySpec(@androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r1, @androidx.annotation.NonNull androidx.work.WorkQuery r2) {
            androidx.work.impl.utils.StatusRunnable$5 r0 = new androidx.work.impl.utils.StatusRunnable$5
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<T> getFuture() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<T> r0 = r1.mFuture
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Object r0 = r2.runInternal()     // Catch: java.lang.Throwable -> La
            androidx.work.impl.utils.futures.SettableFuture<T> r1 = r2.mFuture     // Catch: java.lang.Throwable -> La
            r1.set(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            androidx.work.impl.utils.futures.SettableFuture<T> r1 = r2.mFuture
            r1.setException(r0)
            return
    }

    @androidx.annotation.WorkerThread
    abstract T runInternal();
}
