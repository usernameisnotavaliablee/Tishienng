package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RemoteCallback extends androidx.work.multiprocess.IWorkManagerImplCallback.Stub {
    private android.os.IBinder mBinder;
    private final androidx.work.impl.utils.futures.SettableFuture<byte[]> mFuture;
    private final android.os.IBinder.DeathRecipient mRecipient;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DeathRecipient implements android.os.IBinder.DeathRecipient {
        private final androidx.work.multiprocess.RemoteCallback mCallback;

        public DeathRecipient(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                androidx.work.multiprocess.RemoteCallback r0 = r2.mCallback
                java.lang.String r1 = "Binder died"
                r0.onFailure(r1)
                return
        }
    }

    public RemoteCallback() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBinder = r0
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r1.mFuture = r0
            androidx.work.multiprocess.RemoteCallback$DeathRecipient r0 = new androidx.work.multiprocess.RemoteCallback$DeathRecipient
            r0.<init>(r1)
            r1.mRecipient = r0
            return
    }

    private void onFailure(@androidx.annotation.NonNull java.lang.Throwable r2) {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<byte[]> r0 = r1.mFuture
            r0.setException(r2)
            r1.unlinkToDeath()
            r1.onRequestCompleted()
            return
    }

    private void unlinkToDeath() {
            r3 = this;
            android.os.IBinder r0 = r3.mBinder
            if (r0 == 0) goto La
            android.os.IBinder$DeathRecipient r1 = r3.mRecipient     // Catch: java.util.NoSuchElementException -> La
            r2 = 0
            r0.unlinkToDeath(r1, r2)     // Catch: java.util.NoSuchElementException -> La
        La:
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<byte[]> getFuture() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<byte[]> r0 = r1.mFuture
            return r0
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onFailure(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            r1.onFailure(r0)
            return
    }

    protected void onRequestCompleted() {
            r0 = this;
            return
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onSuccess(@androidx.annotation.NonNull byte[] r2) throws android.os.RemoteException {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<byte[]> r0 = r1.mFuture
            r0.set(r2)
            r1.unlinkToDeath()
            r1.onRequestCompleted()
            return
    }

    public void setBinder(@androidx.annotation.NonNull android.os.IBinder r3) {
            r2 = this;
            r2.mBinder = r3
            android.os.IBinder$DeathRecipient r0 = r2.mRecipient     // Catch: android.os.RemoteException -> L9
            r1 = 0
            r3.linkToDeath(r0, r1)     // Catch: android.os.RemoteException -> L9
            return
        L9:
            r3 = move-exception
            r2.onFailure(r3)
            return
    }
}
