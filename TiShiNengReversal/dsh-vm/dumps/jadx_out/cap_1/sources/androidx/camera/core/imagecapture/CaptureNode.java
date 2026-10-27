package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CaptureNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.CaptureNode.In, androidx.camera.core.imagecapture.CaptureNode.Out> {

    @androidx.annotation.VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final java.lang.String TAG = "CaptureNode";
    androidx.camera.core.imagecapture.ProcessingRequest mCurrentRequest;

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.CaptureNode.In mInputEdge;

    @androidx.annotation.Nullable
    private androidx.camera.core.imagecapture.CaptureNode.Out mOutputEdge;

    @androidx.annotation.NonNull
    private final java.util.Set<java.lang.Integer> mPendingStageIds;

    @androidx.annotation.Nullable
    androidx.camera.core.SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class In {

        @androidx.annotation.NonNull
        private androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;

        @androidx.annotation.Nullable
        private androidx.camera.core.impl.DeferrableSurface mSurface;


        In() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.imagecapture.CaptureNode$In$1 r0 = new androidx.camera.core.imagecapture.CaptureNode$In$1
                r0.<init>(r1)
                r1.mCameraCaptureCallback = r0
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.imagecapture.CaptureNode.In of(android.util.Size r8, int r9, int r10, boolean r11, @androidx.annotation.Nullable androidx.camera.core.ImageReaderProxyProvider r12) {
                androidx.camera.core.imagecapture.AutoValue_CaptureNode_In r0 = new androidx.camera.core.imagecapture.AutoValue_CaptureNode_In
                androidx.camera.core.processing.Edge r6 = new androidx.camera.core.processing.Edge
                r6.<init>()
                androidx.camera.core.processing.Edge r7 = new androidx.camera.core.processing.Edge
                r7.<init>()
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @androidx.annotation.NonNull
        androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
                r1 = this;
                androidx.camera.core.impl.CameraCaptureCallback r0 = r1.mCameraCaptureCallback
                return r0
        }

        @androidx.annotation.NonNull
        abstract androidx.camera.core.processing.Edge<androidx.camera.core.ImageCaptureException> getErrorEdge();

        @androidx.annotation.Nullable
        abstract androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider();

        abstract int getInputFormat();

        abstract int getOutputFormat();

        @androidx.annotation.NonNull
        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge();

        abstract android.util.Size getSize();

        @androidx.annotation.NonNull
        androidx.camera.core.impl.DeferrableSurface getSurface() {
                r1 = this;
                androidx.camera.core.impl.DeferrableSurface r0 = r1.mSurface
                java.util.Objects.requireNonNull(r0)
                return r0
        }

        abstract boolean isVirtualCamera();

        void setCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r1) {
                r0 = this;
                r0.mCameraCaptureCallback = r1
                return
        }

        void setSurface(@androidx.annotation.NonNull android.view.Surface r4) {
                r3 = this;
                androidx.camera.core.impl.DeferrableSurface r0 = r3.mSurface
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "The surface is already set."
                androidx.core.util.Preconditions.checkState(r0, r1)
                androidx.camera.core.impl.ImmediateSurface r0 = new androidx.camera.core.impl.ImmediateSurface
                android.util.Size r1 = r3.getSize()
                int r2 = r3.getInputFormat()
                r0.<init>(r4, r1, r2)
                r3.mSurface = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class Out {
        Out() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.core.imagecapture.CaptureNode.Out of(int r3, int r4) {
                androidx.camera.core.imagecapture.AutoValue_CaptureNode_Out r0 = new androidx.camera.core.imagecapture.AutoValue_CaptureNode_Out
                androidx.camera.core.processing.Edge r1 = new androidx.camera.core.processing.Edge
                r1.<init>()
                androidx.camera.core.processing.Edge r2 = new androidx.camera.core.processing.Edge
                r2.<init>()
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.ImageProxy> getImageEdge();

        abstract int getInputFormat();

        abstract int getOutputFormat();

        abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingRequest> getRequestEdge();
    }

    CaptureNode() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mPendingStageIds = r0
            r0 = 0
            r1.mCurrentRequest = r0
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.imagecapture.CaptureNode r3, androidx.camera.core.impl.ImageReaderProxy r4) {
            r3.getClass()
            java.lang.String r0 = "Failed to acquire latest image"
            r1 = 2
            androidx.camera.core.ImageProxy r4 = r4.acquireLatestImage()     // Catch: java.lang.IllegalStateException -> L10
            if (r4 == 0) goto L12
            r3.onImageProxyAvailable(r4)     // Catch: java.lang.IllegalStateException -> L10
            return
        L10:
            r4 = move-exception
            goto L1c
        L12:
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException     // Catch: java.lang.IllegalStateException -> L10
            r2 = 0
            r4.<init>(r1, r0, r2)     // Catch: java.lang.IllegalStateException -> L10
            r3.sendCaptureError(r4)     // Catch: java.lang.IllegalStateException -> L10
            return
        L1c:
            androidx.camera.core.ImageCaptureException r2 = new androidx.camera.core.ImageCaptureException
            r2.<init>(r1, r0, r4)
            r3.sendCaptureError(r2)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.imagecapture.CaptureNode r0, androidx.camera.core.imagecapture.NoMetadataImageReader r1, androidx.camera.core.imagecapture.ProcessingRequest r2) {
            r0.onRequestAvailable(r2)
            r1.acceptProcessingRequest(r2)
            return
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy(@androidx.annotation.Nullable androidx.camera.core.ImageReaderProxyProvider r7, int r8, int r9, int r10) {
            if (r7 == 0) goto Le
            r4 = 4
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            androidx.camera.core.impl.ImageReaderProxy r7 = r0.newInstance(r1, r2, r3, r4, r5)
            return r7
        Le:
            r1 = r8
            r2 = r9
            r3 = r10
            r7 = 4
            androidx.camera.core.impl.ImageReaderProxy r7 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(r1, r2, r3, r7)
            return r7
    }

    private void matchAndPropagateImage(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r6) {
            r5 = this;
            androidx.camera.core.ImageInfo r0 = r6.getImageInfo()
            androidx.camera.core.impl.TagBundle r0 = r0.getTagBundle()
            androidx.camera.core.imagecapture.ProcessingRequest r1 = r5.mCurrentRequest
            java.lang.String r1 = r1.getTagBundleKey()
            java.lang.Object r0 = r0.getTag(r1)
            java.util.Objects.requireNonNull(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            java.util.Set<java.lang.Integer> r2 = r5.mPendingStageIds
            boolean r2 = r2.contains(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Received an unexpected stage id"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            androidx.core.util.Preconditions.checkState(r2, r1)
            java.util.Set<java.lang.Integer> r1 = r5.mPendingStageIds
            r1.remove(r0)
            androidx.camera.core.imagecapture.CaptureNode$Out r0 = r5.mOutputEdge
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.processing.Edge r0 = r0.getImageEdge()
            r0.accept(r6)
            java.util.Set<java.lang.Integer> r6 = r5.mPendingStageIds
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L56
            androidx.camera.core.imagecapture.ProcessingRequest r6 = r5.mCurrentRequest
            r0 = 0
            r5.mCurrentRequest = r0
            r6.onImageCaptured()
        L56:
            return
    }

    private void releaseInputResources(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CaptureNode.In r2, @androidx.annotation.NonNull androidx.camera.core.SafeCloseImageReaderProxy r3) {
            r1 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r2.getSurface()
            r0.close()
            androidx.camera.core.impl.DeferrableSurface r2 = r2.getSurface()
            com.google.common.util.concurrent.ListenableFuture r2 = r2.getTerminationFuture()
            java.util.Objects.requireNonNull(r3)
            androidx.camera.camera2.internal.e3 r0 = new androidx.camera.camera2.internal.e3
            r0.<init>(r3)
            java.util.concurrent.ScheduledExecutorService r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r2.addListener(r0, r3)
            return
    }

    @androidx.annotation.MainThread
    public int getCapacity() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r2.mSafeCloseImageReaderProxy
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "The ImageReader is not initialized."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r2.mSafeCloseImageReaderProxy
            int r0 = r0.getCapacity()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.imagecapture.CaptureNode.In getInputEdge() {
            r1 = this;
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r1.mInputEdge
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public androidx.camera.core.SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
            r1 = this;
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r1.mSafeCloseImageReaderProxy
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    void onImageProxyAvailable(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r2.mCurrentRequest
            if (r0 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Discarding ImageProxy which was inadvertently acquired: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CaptureNode"
            androidx.camera.core.Logger.d(r1, r0)
            r3.close()
            return
        L21:
            r2.matchAndPropagateImage(r3)
            return
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    void onRequestAvailable(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r5) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r4.getCapacity()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r3 = "Too many acquire images. Close image to be able to process next."
            androidx.core.util.Preconditions.checkState(r0, r3)
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r4.mCurrentRequest
            if (r0 == 0) goto L1f
            java.util.Set<java.lang.Integer> r0 = r4.mPendingStageIds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
        L1f:
            r1 = 1
        L20:
            java.lang.String r0 = "The previous request is not complete"
            androidx.core.util.Preconditions.checkState(r1, r0)
            r4.mCurrentRequest = r5
            java.util.Set<java.lang.Integer> r0 = r4.mPendingStageIds
            java.util.List r1 = r5.getStageIds()
            r0.addAll(r1)
            androidx.camera.core.imagecapture.CaptureNode$Out r0 = r4.mOutputEdge
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.processing.Edge r0 = r0.getRequestEdge()
            r0.accept(r5)
            com.google.common.util.concurrent.ListenableFuture r0 = r5.getCaptureFuture()
            androidx.camera.core.imagecapture.CaptureNode$1 r1 = new androidx.camera.core.imagecapture.CaptureNode$1
            r1.<init>(r4, r5)
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r5)
            return
    }

    @Override // androidx.camera.core.processing.Node
    @androidx.annotation.MainThread
    public void release() {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r2.mInputEdge
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.SafeCloseImageReaderProxy r1 = r2.mSafeCloseImageReaderProxy
            java.util.Objects.requireNonNull(r1)
            r2.releaseInputResources(r0, r1)
            return
    }

    @androidx.annotation.MainThread
    void sendCaptureError(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.ProcessingRequest r0 = r1.mCurrentRequest
            if (r0 == 0) goto La
            r0.onCaptureFailure(r2)
        La:
            return
    }

    @androidx.annotation.MainThread
    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener r3) {
            r2 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r2.mSafeCloseImageReaderProxy
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "The ImageReader is not initialized."
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r2.mSafeCloseImageReaderProxy
            r0.setOnImageCloseListener(r3)
            return
    }

    @androidx.annotation.NonNull
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public androidx.camera.core.imagecapture.CaptureNode.Out transform2(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CaptureNode.In r6) {
            r5 = this;
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r5.mInputEdge
            if (r0 != 0) goto La
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r5.mSafeCloseImageReaderProxy
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "CaptureNode does not support recreation yet."
            androidx.core.util.Preconditions.checkState(r0, r1)
            r5.mInputEdge = r6
            android.util.Size r0 = r6.getSize()
            int r1 = r6.getInputFormat()
            boolean r2 = r6.isVirtualCamera()
            if (r2 != 0) goto L41
            androidx.camera.core.ImageReaderProxyProvider r2 = r6.getImageReaderProxyProvider()
            if (r2 != 0) goto L41
            androidx.camera.core.MetadataImageReader r2 = new androidx.camera.core.MetadataImageReader
            int r3 = r0.getWidth()
            int r0 = r0.getHeight()
            r4 = 4
            r2.<init>(r3, r0, r1, r4)
            androidx.camera.core.impl.CameraCaptureCallback r0 = r2.getCameraCaptureCallback()
            r6.setCameraCaptureCallback(r0)
            androidx.camera.core.imagecapture.a r0 = new androidx.camera.core.imagecapture.a
            r0.<init>(r5)
            goto L5b
        L41:
            androidx.camera.core.imagecapture.NoMetadataImageReader r2 = new androidx.camera.core.imagecapture.NoMetadataImageReader
            androidx.camera.core.ImageReaderProxyProvider r3 = r6.getImageReaderProxyProvider()
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            androidx.camera.core.impl.ImageReaderProxy r0 = createImageReaderProxy(r3, r4, r0, r1)
            r2.<init>(r0)
            androidx.camera.core.imagecapture.b r0 = new androidx.camera.core.imagecapture.b
            r0.<init>(r5, r2)
        L5b:
            android.view.Surface r1 = r2.getSurface()
            java.util.Objects.requireNonNull(r1)
            r6.setSurface(r1)
            androidx.camera.core.SafeCloseImageReaderProxy r1 = new androidx.camera.core.SafeCloseImageReaderProxy
            r1.<init>(r2)
            r5.mSafeCloseImageReaderProxy = r1
            androidx.camera.core.imagecapture.c r1 = new androidx.camera.core.imagecapture.c
            r1.<init>(r5)
            java.util.concurrent.ScheduledExecutorService r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r2.setOnImageAvailableListener(r1, r3)
            androidx.camera.core.processing.Edge r1 = r6.getRequestEdge()
            r1.setListener(r0)
            androidx.camera.core.processing.Edge r0 = r6.getErrorEdge()
            androidx.camera.core.imagecapture.d r1 = new androidx.camera.core.imagecapture.d
            r1.<init>(r5)
            r0.setListener(r1)
            int r0 = r6.getInputFormat()
            int r6 = r6.getOutputFormat()
            androidx.camera.core.imagecapture.CaptureNode$Out r6 = androidx.camera.core.imagecapture.CaptureNode.Out.of(r0, r6)
            r5.mOutputEdge = r6
            return r6
    }

    @Override // androidx.camera.core.processing.Node
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.camera.core.imagecapture.CaptureNode.Out transform(@androidx.annotation.NonNull androidx.camera.core.imagecapture.CaptureNode.In r1) {
            r0 = this;
            androidx.camera.core.imagecapture.CaptureNode$In r1 = (androidx.camera.core.imagecapture.CaptureNode.In) r1
            androidx.camera.core.imagecapture.CaptureNode$Out r1 = r0.transform2(r1)
            return r1
    }
}
