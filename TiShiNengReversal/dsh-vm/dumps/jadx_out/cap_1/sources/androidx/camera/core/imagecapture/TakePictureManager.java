package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TakePictureManager implements androidx.camera.core.ForwardingImageProxy.OnImageCloseListener, androidx.camera.core.imagecapture.TakePictureRequest.RetryControl {
    private static final java.lang.String TAG = "TakePictureManager";

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.RequestWithCallback mCapturingRequest;
    final androidx.camera.core.imagecapture.ImageCaptureControl mImageCaptureControl;
    androidx.camera.core.imagecapture.ImagePipeline mImagePipeline;
    private final java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> mIncompleteRequests;

    @androidx.annotation.VisibleForTesting
    final java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> mNewRequests;
    boolean mPaused;


    @androidx.annotation.MainThread
    public TakePictureManager(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ImageCaptureControl r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mNewRequests = r0
            r0 = 0
            r1.mPaused = r0
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r1.mImageCaptureControl = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mIncompleteRequests = r2
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.TakePictureManager r1) {
            r0 = 0
            r1.mCapturingRequest = r0
            r1.issueNextRequest()
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.imagecapture.TakePictureManager r0, androidx.camera.core.imagecapture.RequestWithCallback r1) {
            java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> r0 = r0.mIncompleteRequests
            r0.remove(r1)
            return
    }

    @androidx.annotation.MainThread
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitCameraRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CameraRequest r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.ImageCaptureControl r0 = r2.mImageCaptureControl
            r0.lockFlashMode()
            androidx.camera.core.imagecapture.ImageCaptureControl r0 = r2.mImageCaptureControl
            java.util.List r1 = r3.getCaptureConfigs()
            com.google.common.util.concurrent.ListenableFuture r0 = r0.submitStillCaptureRequests(r1)
            androidx.camera.core.imagecapture.TakePictureManager$1 r1 = new androidx.camera.core.imagecapture.TakePictureManager$1
            r1.<init>(r2, r3)
            java.util.concurrent.ScheduledExecutorService r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r3)
            return r0
    }

    private void trackCurrentRequests(@androidx.annotation.NonNull androidx.camera.core.imagecapture.RequestWithCallback r4) {
            r3 = this;
            boolean r0 = r3.hasCapturingRequest()
            r0 = r0 ^ 1
            androidx.core.util.Preconditions.checkState(r0)
            r3.mCapturingRequest = r4
            com.google.common.util.concurrent.ListenableFuture r0 = r4.getCaptureFuture()
            androidx.camera.core.imagecapture.o r1 = new androidx.camera.core.imagecapture.o
            r1.<init>(r3)
            java.util.concurrent.Executor r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r0.addListener(r1, r2)
            java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> r0 = r3.mIncompleteRequests
            r0.add(r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r4.getCompleteFuture()
            androidx.camera.core.imagecapture.p r1 = new androidx.camera.core.imagecapture.p
            r1.<init>(r3, r4)
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r0.addListener(r1, r4)
            return
    }

    @androidx.annotation.MainThread
    public void abortRequests() {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException
            java.lang.String r1 = "Camera is closed."
            r2 = 0
            r3 = 3
            r0.<init>(r3, r1, r2)
            java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> r1 = r4.mNewRequests
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            androidx.camera.core.imagecapture.TakePictureRequest r2 = (androidx.camera.core.imagecapture.TakePictureRequest) r2
            r2.onError(r0)
            goto L12
        L22:
            java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> r1 = r4.mNewRequests
            r1.clear()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> r2 = r4.mIncompleteRequests
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.camera.core.imagecapture.RequestWithCallback r2 = (androidx.camera.core.imagecapture.RequestWithCallback) r2
            r2.abortAndSendErrorToApp(r0)
            goto L32
        L42:
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.imagecapture.ImagePipeline getImagePipeline() {
            r1 = this;
            androidx.camera.core.imagecapture.ImagePipeline r0 = r1.mImagePipeline
            return r0
    }

    @androidx.annotation.VisibleForTesting
    java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> getIncompleteRequests() {
            r1 = this;
            java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> r0 = r1.mIncompleteRequests
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean hasCapturingRequest() {
            r1 = this;
            androidx.camera.core.imagecapture.RequestWithCallback r0 = r1.mCapturingRequest
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @androidx.annotation.MainThread
    void issueNextRequest() {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            boolean r0 = r4.hasCapturingRequest()
            if (r0 == 0) goto La
            return
        La:
            boolean r0 = r4.mPaused
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.camera.core.imagecapture.ImagePipeline r0 = r4.mImagePipeline
            int r0 = r0.getCapacity()
            if (r0 != 0) goto L18
            return
        L18:
            java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> r0 = r4.mNewRequests
            java.lang.Object r0 = r0.poll()
            androidx.camera.core.imagecapture.TakePictureRequest r0 = (androidx.camera.core.imagecapture.TakePictureRequest) r0
            if (r0 != 0) goto L23
            return
        L23:
            androidx.camera.core.imagecapture.RequestWithCallback r1 = new androidx.camera.core.imagecapture.RequestWithCallback
            r1.<init>(r0, r4)
            r4.trackCurrentRequests(r1)
            androidx.camera.core.imagecapture.ImagePipeline r2 = r4.mImagePipeline
            com.google.common.util.concurrent.ListenableFuture r3 = r1.getCaptureFuture()
            androidx.core.util.Pair r0 = r2.createRequests(r0, r1, r3)
            F r2 = r0.first
            androidx.camera.core.imagecapture.CameraRequest r2 = (androidx.camera.core.imagecapture.CameraRequest) r2
            java.util.Objects.requireNonNull(r2)
            S r0 = r0.second
            androidx.camera.core.imagecapture.ProcessingRequest r0 = (androidx.camera.core.imagecapture.ProcessingRequest) r0
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.imagecapture.ImagePipeline r3 = r4.mImagePipeline
            r3.submitProcessingRequest(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r4.submitCameraRequest(r2)
            r1.setCaptureRequestFuture(r0)
            return
    }

    @androidx.annotation.MainThread
    public void offerRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> r0 = r1.mNewRequests
            r0.offer(r2)
            r1.issueNextRequest()
            return
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.imagecapture.q r0 = new androidx.camera.core.imagecapture.q
            r0.<init>(r1)
            r2.execute(r0)
            return
    }

    @androidx.annotation.MainThread
    public void pause() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 1
            r1.mPaused = r0
            androidx.camera.core.imagecapture.RequestWithCallback r0 = r1.mCapturingRequest
            if (r0 == 0) goto Ld
            r0.abortSilentlyAndRetry()
        Ld:
            return
    }

    @androidx.annotation.MainThread
    public void resume() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 0
            r1.mPaused = r0
            r1.issueNextRequest()
            return
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    @androidx.annotation.MainThread
    public void retryRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            java.lang.String r0 = "TakePictureManager"
            java.lang.String r1 = "Add a new request for retrying."
            androidx.camera.core.Logger.d(r0, r1)
            java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> r0 = r2.mNewRequests
            r0.addFirst(r3)
            r2.issueNextRequest()
            return
    }

    @androidx.annotation.MainThread
    public void setImagePipeline(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ImagePipeline r1) {
            r0 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0.mImagePipeline = r1
            r1.setOnImageCloseListener(r0)
            return
    }
}
