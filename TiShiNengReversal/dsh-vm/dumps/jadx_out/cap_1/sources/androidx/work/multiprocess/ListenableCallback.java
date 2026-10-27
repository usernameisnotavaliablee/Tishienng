package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ListenableCallback<I> {
    final androidx.work.multiprocess.IWorkManagerImplCallback mCallback;
    final java.util.concurrent.Executor mExecutor;
    final com.google.common.util.concurrent.ListenableFuture<I> mFuture;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class ListenableCallbackRunnable<I> implements java.lang.Runnable {
        private static final java.lang.String TAG = null;
        private final androidx.work.multiprocess.ListenableCallback<I> mCallback;

        static {
                java.lang.String r0 = "ListenableCallbackRbl"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.TAG = r0
                return
        }

        public ListenableCallbackRunnable(@androidx.annotation.NonNull androidx.work.multiprocess.ListenableCallback<I> r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        public static void reportFailure(@androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r3, @androidx.annotation.NonNull java.lang.Throwable r4) {
                java.lang.String r4 = r4.getMessage()     // Catch: android.os.RemoteException -> L8
                r3.onFailure(r4)     // Catch: android.os.RemoteException -> L8
                return
            L8:
                r3 = move-exception
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.TAG
                r1 = 1
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r2 = 0
                r1[r2] = r3
                java.lang.String r3 = "Unable to notify failures in operation"
                r4.error(r0, r3, r1)
                return
        }

        public static void reportSuccess(@androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r3, @androidx.annotation.NonNull byte[] r4) {
                r3.onSuccess(r4)     // Catch: android.os.RemoteException -> L4
                return
            L4:
                r3 = move-exception
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.TAG
                r1 = 1
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r2 = 0
                r1[r2] = r3
                java.lang.String r3 = "Unable to notify successful operation"
                r4.error(r0, r3, r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.work.multiprocess.ListenableCallback<I> r0 = r3.mCallback     // Catch: java.lang.Throwable -> L14
                com.google.common.util.concurrent.ListenableFuture<I> r0 = r0.mFuture     // Catch: java.lang.Throwable -> L14
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L14
                androidx.work.multiprocess.ListenableCallback<I> r1 = r3.mCallback     // Catch: java.lang.Throwable -> L14
                androidx.work.multiprocess.IWorkManagerImplCallback r2 = r1.mCallback     // Catch: java.lang.Throwable -> L14
                byte[] r0 = r1.toByteArray(r0)     // Catch: java.lang.Throwable -> L14
                reportSuccess(r2, r0)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r0 = move-exception
                androidx.work.multiprocess.ListenableCallback<I> r1 = r3.mCallback
                androidx.work.multiprocess.IWorkManagerImplCallback r1 = r1.mCallback
                reportFailure(r1, r0)
                return
        }
    }

    public ListenableCallback(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.work.multiprocess.IWorkManagerImplCallback r2, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<I> r3) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            r0.mCallback = r2
            r0.mFuture = r3
            return
    }

    public void dispatchCallbackSafely() {
            r3 = this;
            com.google.common.util.concurrent.ListenableFuture<I> r0 = r3.mFuture
            androidx.work.multiprocess.ListenableCallback$ListenableCallbackRunnable r1 = new androidx.work.multiprocess.ListenableCallback$ListenableCallbackRunnable
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = r3.mExecutor
            r0.addListener(r1, r2)
            return
    }

    @androidx.annotation.NonNull
    public abstract byte[] toByteArray(@androidx.annotation.NonNull I r1);
}
