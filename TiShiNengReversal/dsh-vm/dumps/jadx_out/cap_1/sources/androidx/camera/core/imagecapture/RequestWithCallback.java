package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class RequestWithCallback implements androidx.camera.core.imagecapture.TakePictureCallback {
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mCaptureCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCaptureFuture;

    @androidx.annotation.Nullable
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCaptureRequestFuture;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mCompleteCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCompleteFuture;
    private boolean mIsAborted;
    private final androidx.camera.core.imagecapture.TakePictureRequest.RetryControl mRetryControl;
    private final androidx.camera.core.imagecapture.TakePictureRequest mTakePictureRequest;

    RequestWithCallback(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r2, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest.RetryControl r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsAborted = r0
            r1.mTakePictureRequest = r2
            r1.mRetryControl = r3
            androidx.camera.core.imagecapture.k r2 = new androidx.camera.core.imagecapture.k
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
            r1.mCaptureFuture = r2
            androidx.camera.core.imagecapture.l r2 = new androidx.camera.core.imagecapture.l
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
            r1.mCompleteFuture = r2
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.core.imagecapture.RequestWithCallback r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.mCaptureCompleter = r1
            java.lang.String r0 = "CaptureCompleteFuture"
            return r0
    }

    @androidx.annotation.MainThread
    private void abort(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 1
            r2.mIsAborted = r0
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r1 = r2.mCaptureRequestFuture
            java.util.Objects.requireNonNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r1.cancel(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCaptureCompleter
            r0.setException(r3)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r3 = r2.mCompleteCompleter
            r0 = 0
            r3.set(r0)
            return
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.core.imagecapture.RequestWithCallback r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            r0.mCompleteCompleter = r1
            java.lang.String r0 = "RequestCompleteFuture"
            return r0
    }

    private void checkOnImageCaptured() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mCaptureFuture
            boolean r0 = r0.isDone()
            java.lang.String r1 = "onImageCaptured() must be called before onFinalResult()"
            androidx.core.util.Preconditions.checkState(r0, r1)
            return
    }

    private void markComplete() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mCompleteFuture
            boolean r0 = r0.isDone()
            r0 = r0 ^ 1
            java.lang.String r1 = "The callback can only complete once."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCompleteCompleter
            r1 = 0
            r0.set(r1)
            return
    }

    @androidx.annotation.MainThread
    private void onFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.TakePictureRequest r0 = r1.mTakePictureRequest
            r0.onError(r2)
            return
    }

    @androidx.annotation.MainThread
    void abortAndSendErrorToApp(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCompleteFuture
            boolean r0 = r0.isDone()
            if (r0 == 0) goto Lc
            return
        Lc:
            r1.abort(r2)
            r1.onFailure(r2)
            return
    }

    @androidx.annotation.MainThread
    void abortSilentlyAndRetry() {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r4.mCompleteFuture
            boolean r0 = r0.isDone()
            if (r0 == 0) goto Lc
            return
        Lc:
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            java.lang.String r1 = "The request is aborted silently and retried."
            r2 = 0
            r3 = 3
            r0.<init>(r3, r1, r2)
            r4.abort(r0)
            androidx.camera.core.imagecapture.TakePictureRequest$RetryControl r0 = r4.mRetryControl
            androidx.camera.core.imagecapture.TakePictureRequest r1 = r4.mTakePictureRequest
            r0.retryRequest(r1)
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCaptureFuture() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCaptureFuture
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCompleteFuture() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCompleteFuture
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public boolean isAborted() {
            r1 = this;
            boolean r0 = r1.mIsAborted
            return r0
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @androidx.annotation.MainThread
    public void onCaptureFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.mIsAborted
            if (r0 == 0) goto L8
            goto L24
        L8:
            androidx.camera.core.imagecapture.TakePictureRequest r0 = r2.mTakePictureRequest
            boolean r0 = r0.decrementRetryCounter()
            if (r0 != 0) goto L13
            r2.onFailure(r3)
        L13:
            r2.markComplete()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r2.mCaptureCompleter
            r1.setException(r3)
            if (r0 == 0) goto L24
            androidx.camera.core.imagecapture.TakePictureRequest$RetryControl r3 = r2.mRetryControl
            androidx.camera.core.imagecapture.TakePictureRequest r0 = r2.mTakePictureRequest
            r3.retryRequest(r0)
        L24:
            return
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @androidx.annotation.MainThread
    public void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageCapture.OutputFileResults r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.mIsAborted
            if (r0 == 0) goto L8
            return
        L8:
            r1.checkOnImageCaptured()
            r1.markComplete()
            androidx.camera.core.imagecapture.TakePictureRequest r0 = r1.mTakePictureRequest
            r0.onResult(r2)
            return
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @androidx.annotation.MainThread
    public void onFinalResult(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.mIsAborted
            if (r0 == 0) goto L8
            return
        L8:
            r1.checkOnImageCaptured()
            r1.markComplete()
            androidx.camera.core.imagecapture.TakePictureRequest r0 = r1.mTakePictureRequest
            r0.onResult(r2)
            return
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @androidx.annotation.MainThread
    public void onImageCaptured() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r2.mIsAborted
            if (r0 == 0) goto L8
            return
        L8:
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r0 = r2.mCaptureCompleter
            r1 = 0
            r0.set(r1)
            return
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    @androidx.annotation.MainThread
    public void onProcessFailure(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r1.mIsAborted
            if (r0 == 0) goto L8
            return
        L8:
            r1.checkOnImageCaptured()
            r1.markComplete()
            r1.onFailure(r2)
            return
    }

    @androidx.annotation.MainThread
    public void setCaptureRequestFuture(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mCaptureRequestFuture
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "CaptureRequestFuture can only be set once."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r2.mCaptureRequestFuture = r3
            return
    }
}
