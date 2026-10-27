package androidx.camera.core.imagecapture;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImagePipeline {
    static final androidx.camera.core.internal.compat.workaround.ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = null;
    static final byte JPEG_QUALITY_MAX_QUALITY = 100;
    static final byte JPEG_QUALITY_MIN_LATENCY = 95;

    @androidx.annotation.NonNull
    private final androidx.camera.core.imagecapture.SingleBundlingNode mBundlingNode;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CaptureConfig mCaptureConfig;

    @androidx.annotation.NonNull
    private final androidx.camera.core.imagecapture.CaptureNode mCaptureNode;

    @androidx.annotation.NonNull
    private final androidx.camera.core.imagecapture.CaptureNode.In mPipelineIn;

    @androidx.annotation.NonNull
    private final androidx.camera.core.imagecapture.ProcessingNode mProcessingNode;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.ImageCaptureConfig mUseCaseConfig;

    static {
            androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r0 = new androidx.camera.core.internal.compat.workaround.ExifRotationAvailability
            r0.<init>()
            androidx.camera.core.imagecapture.ImagePipeline.EXIF_ROTATION_AVAILABILITY = r0
            return
    }

    @androidx.annotation.MainThread
    @androidx.annotation.VisibleForTesting
    public ImagePipeline(@androidx.annotation.NonNull androidx.camera.core.impl.ImageCaptureConfig r3, @androidx.annotation.NonNull android.util.Size r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @androidx.annotation.MainThread
    public ImagePipeline(@androidx.annotation.NonNull androidx.camera.core.impl.ImageCaptureConfig r6, @androidx.annotation.NonNull android.util.Size r7, @androidx.annotation.Nullable androidx.camera.core.CameraEffect r8, boolean r9) {
            r5 = this;
            r5.<init>()
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r5.mUseCaseConfig = r6
            androidx.camera.core.impl.CaptureConfig$Builder r0 = androidx.camera.core.impl.CaptureConfig.Builder.createFrom(r6)
            androidx.camera.core.impl.CaptureConfig r0 = r0.build()
            r5.mCaptureConfig = r0
            androidx.camera.core.imagecapture.CaptureNode r0 = new androidx.camera.core.imagecapture.CaptureNode
            r0.<init>()
            r5.mCaptureNode = r0
            androidx.camera.core.imagecapture.SingleBundlingNode r1 = new androidx.camera.core.imagecapture.SingleBundlingNode
            r1.<init>()
            r5.mBundlingNode = r1
            androidx.camera.core.imagecapture.ProcessingNode r2 = new androidx.camera.core.imagecapture.ProcessingNode
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()
            java.util.concurrent.Executor r3 = r6.getIoExecutor(r3)
            java.util.Objects.requireNonNull(r3)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            if (r8 == 0) goto L37
            androidx.camera.core.processing.InternalImageProcessor r4 = new androidx.camera.core.processing.InternalImageProcessor
            r4.<init>(r8)
            goto L38
        L37:
            r4 = 0
        L38:
            r2.<init>(r3, r4)
            r5.mProcessingNode = r2
            int r8 = r6.getInputFormat()
            int r3 = r5.getOutputFormat()
            androidx.camera.core.ImageReaderProxyProvider r6 = r6.getImageReaderProxyProvider()
            androidx.camera.core.imagecapture.CaptureNode$In r6 = androidx.camera.core.imagecapture.CaptureNode.In.of(r7, r8, r3, r9, r6)
            r5.mPipelineIn = r6
            androidx.camera.core.imagecapture.CaptureNode$Out r6 = r0.transform2(r6)
            androidx.camera.core.imagecapture.ProcessingNode$In r6 = r1.transform2(r6)
            r2.transform2(r6)
            return
    }

    private androidx.camera.core.imagecapture.CameraRequest createCameraRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureBundle r7, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r8, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureCallback r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r7 = r7.getCaptureStages()
            java.util.Objects.requireNonNull(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L1a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r7.next()
            androidx.camera.core.impl.CaptureStage r2 = (androidx.camera.core.impl.CaptureStage) r2
            androidx.camera.core.impl.CaptureConfig$Builder r3 = new androidx.camera.core.impl.CaptureConfig$Builder
            r3.<init>()
            androidx.camera.core.impl.CaptureConfig r4 = r6.mCaptureConfig
            int r4 = r4.getTemplateType()
            r3.setTemplateType(r4)
            androidx.camera.core.impl.CaptureConfig r4 = r6.mCaptureConfig
            androidx.camera.core.impl.Config r4 = r4.getImplementationOptions()
            r3.addImplementationOptions(r4)
            java.util.List r4 = r8.getSessionConfigCameraCaptureCallbacks()
            r3.addAllCameraCaptureCallbacks(r4)
            androidx.camera.core.imagecapture.CaptureNode$In r4 = r6.mPipelineIn
            androidx.camera.core.impl.DeferrableSurface r4 = r4.getSurface()
            r3.addSurface(r4)
            androidx.camera.core.imagecapture.CaptureNode$In r4 = r6.mPipelineIn
            int r4 = r4.getInputFormat()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L79
            androidx.camera.core.internal.compat.workaround.ExifRotationAvailability r4 = androidx.camera.core.imagecapture.ImagePipeline.EXIF_ROTATION_AVAILABILITY
            boolean r4 = r4.isRotationOptionSupported()
            if (r4 == 0) goto L6c
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r4 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            int r5 = r8.getRotationDegrees()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.addImplementationOption(r4, r5)
        L6c:
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r4 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY
            int r5 = r6.getCameraRequestJpegQuality(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.addImplementationOption(r4, r5)
        L79:
            androidx.camera.core.impl.CaptureConfig r4 = r2.getCaptureConfig()
            androidx.camera.core.impl.Config r4 = r4.getImplementationOptions()
            r3.addImplementationOptions(r4)
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.addTag(r1, r2)
            androidx.camera.core.imagecapture.CaptureNode$In r2 = r6.mPipelineIn
            androidx.camera.core.impl.CameraCaptureCallback r2 = r2.getCameraCaptureCallback()
            r3.addCameraCaptureCallback(r2)
            androidx.camera.core.impl.CaptureConfig r2 = r3.build()
            r0.add(r2)
            goto L1a
        La1:
            androidx.camera.core.imagecapture.CameraRequest r7 = new androidx.camera.core.imagecapture.CameraRequest
            r7.<init>(r0, r9)
            return r7
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.impl.CaptureBundle createCaptureBundle() {
            r2 = this;
            androidx.camera.core.impl.ImageCaptureConfig r0 = r2.mUseCaseConfig
            androidx.camera.core.impl.CaptureBundle r1 = androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()
            androidx.camera.core.impl.CaptureBundle r0 = r0.getCaptureBundle(r1)
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.impl.CaptureBundle r0 = (androidx.camera.core.impl.CaptureBundle) r0
            return r0
    }

    @androidx.annotation.NonNull
    private androidx.camera.core.imagecapture.ProcessingRequest createProcessingRequest(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureBundle r10, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r11, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureCallback r12, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r13) {
            r9 = this;
            androidx.camera.core.imagecapture.ProcessingRequest r0 = new androidx.camera.core.imagecapture.ProcessingRequest
            androidx.camera.core.ImageCapture$OutputFileOptions r2 = r11.getOutputFileOptions()
            android.graphics.Rect r3 = r11.getCropRect()
            int r4 = r11.getRotationDegrees()
            int r5 = r11.getJpegQuality()
            android.graphics.Matrix r6 = r11.getSensorToBufferTransform()
            r1 = r10
            r7 = r12
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private int getOutputFormat() {
            r3 = this;
            androidx.camera.core.impl.ImageCaptureConfig r0 = r3.mUseCaseConfig
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            r2 = 0
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L12
            int r0 = r0.intValue()
            return r0
        L12:
            r0 = 256(0x100, float:3.59E-43)
            return r0
    }

    @androidx.annotation.MainThread
    public void close() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode r0 = r1.mCaptureNode
            r0.release()
            androidx.camera.core.imagecapture.SingleBundlingNode r0 = r1.mBundlingNode
            r0.release()
            androidx.camera.core.imagecapture.ProcessingNode r0 = r1.mProcessingNode
            r0.release()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.MainThread
    androidx.core.util.Pair<androidx.camera.core.imagecapture.CameraRequest, androidx.camera.core.imagecapture.ProcessingRequest> createRequests(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r4, @androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureCallback r5, @androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r6) {
            r3 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.CaptureBundle r0 = r3.createCaptureBundle()
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            androidx.camera.core.imagecapture.CameraRequest r2 = r3.createCameraRequest(r0, r4, r5)
            androidx.camera.core.imagecapture.ProcessingRequest r4 = r3.createProcessingRequest(r0, r4, r5, r6)
            r1.<init>(r2, r4)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(@androidx.annotation.NonNull android.util.Size r2) {
            r1 = this;
            androidx.camera.core.impl.ImageCaptureConfig r0 = r1.mUseCaseConfig
            androidx.camera.core.impl.SessionConfig$Builder r2 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r0, r2)
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r1.mPipelineIn
            androidx.camera.core.impl.DeferrableSurface r0 = r0.getSurface()
            r2.addNonRepeatingSurface(r0)
            return r2
    }

    @androidx.annotation.VisibleForTesting
    public boolean expectsMetadata() {
            r1 = this;
            androidx.camera.core.imagecapture.CaptureNode r0 = r1.mCaptureNode
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r0.getSafeCloseImageReaderProxy()
            androidx.camera.core.impl.ImageReaderProxy r0 = r0.getImageReaderProxy()
            boolean r0 = r0 instanceof androidx.camera.core.MetadataImageReader
            return r0
    }

    int getCameraRequestJpegQuality(@androidx.annotation.NonNull androidx.camera.core.imagecapture.TakePictureRequest r4) {
            r3 = this;
            androidx.camera.core.ImageCapture$OnImageSavedCallback r0 = r4.getOnDiskCallback()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            android.graphics.Rect r1 = r4.getCropRect()
            androidx.camera.core.imagecapture.CaptureNode$In r2 = r3.mPipelineIn
            android.util.Size r2 = r2.getSize()
            boolean r1 = androidx.camera.core.impl.utils.TransformUtils.hasCropping(r1, r2)
            if (r0 == 0) goto L27
            if (r1 == 0) goto L27
            int r4 = r4.getCaptureMode()
            if (r4 != 0) goto L24
            r4 = 100
            return r4
        L24:
            r4 = 95
            return r4
        L27:
            int r4 = r4.getJpegQuality()
            return r4
    }

    @androidx.annotation.MainThread
    public int getCapacity() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode r0 = r1.mCaptureNode
            int r0 = r0.getCapacity()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.imagecapture.CaptureNode getCaptureNode() {
            r1 = this;
            androidx.camera.core.imagecapture.CaptureNode r0 = r1.mCaptureNode
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.imagecapture.ProcessingNode getProcessingNode() {
            r1 = this;
            androidx.camera.core.imagecapture.ProcessingNode r0 = r1.mProcessingNode
            return r0
    }

    @androidx.annotation.MainThread
    void notifyCaptureError(@androidx.annotation.NonNull androidx.camera.core.ImageCaptureException r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r1.mPipelineIn
            androidx.camera.core.processing.Edge r0 = r0.getErrorEdge()
            r0.accept(r2)
            return
    }

    @androidx.annotation.MainThread
    public void setOnImageCloseListener(@androidx.annotation.NonNull androidx.camera.core.ForwardingImageProxy.OnImageCloseListener r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode r0 = r1.mCaptureNode
            r0.setOnImageCloseListener(r2)
            return
    }

    @androidx.annotation.MainThread
    void submitProcessingRequest(@androidx.annotation.NonNull androidx.camera.core.imagecapture.ProcessingRequest r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.imagecapture.CaptureNode$In r0 = r1.mPipelineIn
            androidx.camera.core.processing.Edge r0 = r0.getRequestEdge()
            r0.accept(r2)
            return
    }
}
