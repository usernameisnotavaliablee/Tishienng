package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L0:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto La
            r1.wait()     // Catch: java.lang.InterruptedException -> L8
            goto L0
        L8:
            goto L0
        La:
            return
    }

    public void cancel() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsCanceled     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L3a
        L9:
            r0 = 1
            r3.mIsCanceled = r0     // Catch: java.lang.Throwable -> L7
            r3.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L7
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L7
            java.lang.Object r1 = r3.mCancellationSignalObj     // Catch: java.lang.Throwable -> L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            r2 = 0
            if (r0 == 0) goto L1c
            r0.onCancel()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L24
        L1c:
            if (r1 == 0) goto L2f
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch: java.lang.Throwable -> L1a
            r1.cancel()     // Catch: java.lang.Throwable -> L1a
            goto L2f
        L24:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L2c
            r3.notifyAll()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2f:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L37
            r3.notifyAll()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getCancellationSignalObject() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            r2.mCancellationSignalObj = r0     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.mIsCanceled     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r0.cancel()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L1a
        L16:
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void setOnCancelListener(@androidx.annotation.Nullable androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> La
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        La:
            r2 = move-exception
            goto L1c
        Lc:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> La
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L1a
            if (r2 != 0) goto L15
            goto L1a
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            r2.onCancel()
            return
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public void throwIfCanceled() {
            r1 = this;
            boolean r0 = r1.isCanceled()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
    }
}
