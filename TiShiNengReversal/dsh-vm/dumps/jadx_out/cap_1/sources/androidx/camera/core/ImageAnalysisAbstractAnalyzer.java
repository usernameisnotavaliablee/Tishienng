package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class ImageAnalysisAbstractAnalyzer implements androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener {
    private static final java.lang.String TAG = "ImageAnalysisAnalyzer";
    private final java.lang.Object mAnalyzerLock;
    protected boolean mIsAttached;
    private volatile boolean mOnePixelShiftEnabled;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private android.graphics.Matrix mOriginalSensorToBufferTransformMatrix;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private android.graphics.Rect mOriginalViewPortCropRect;
    private volatile int mOutputImageFormat;
    private volatile boolean mOutputImageRotationEnabled;

    @androidx.annotation.IntRange(from = 0, to = 359)
    private volatile int mPrevBufferRotationDegrees;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private androidx.camera.core.SafeCloseImageReaderProxy mProcessedImageReaderProxy;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private android.media.ImageWriter mProcessedImageWriter;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    @androidx.annotation.VisibleForTesting
    java.nio.ByteBuffer mRGBConvertedBuffer;

    @androidx.annotation.IntRange(from = 0, to = 359)
    private volatile int mRelativeRotation;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private androidx.camera.core.ImageAnalysis.Analyzer mSubscribedAnalyzer;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    @androidx.annotation.VisibleForTesting
    java.nio.ByteBuffer mURotatedBuffer;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private android.graphics.Matrix mUpdatedSensorToBufferTransformMatrix;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private android.graphics.Rect mUpdatedViewPortCropRect;

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private java.util.concurrent.Executor mUserExecutor;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    @androidx.annotation.VisibleForTesting
    java.nio.ByteBuffer mVRotatedBuffer;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mAnalyzerLock")
    @androidx.annotation.VisibleForTesting
    java.nio.ByteBuffer mYRotatedBuffer;

    ImageAnalysisAbstractAnalyzer() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.mOutputImageFormat = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mOriginalViewPortCropRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.mUpdatedViewPortCropRect = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.mOriginalSensorToBufferTransformMatrix = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.mUpdatedSensorToBufferTransformMatrix = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.mAnalyzerLock = r1
            r2.mIsAttached = r0
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.ImageAnalysisAbstractAnalyzer r3, androidx.camera.core.ImageProxy r4, android.graphics.Matrix r5, androidx.camera.core.ImageProxy r6, android.graphics.Rect r7, androidx.camera.core.ImageAnalysis.Analyzer r8, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r9) {
            boolean r0 = r3.mIsAttached
            if (r0 == 0) goto L36
            androidx.camera.core.ImageInfo r0 = r4.getImageInfo()
            androidx.camera.core.impl.TagBundle r0 = r0.getTagBundle()
            androidx.camera.core.ImageInfo r4 = r4.getImageInfo()
            long r1 = r4.getTimestamp()
            boolean r4 = r3.mOutputImageRotationEnabled
            if (r4 == 0) goto L1a
            r3 = 0
            goto L1c
        L1a:
            int r3 = r3.mRelativeRotation
        L1c:
            androidx.camera.core.ImageInfo r3 = androidx.camera.core.ImmutableImageInfo.create(r0, r1, r3, r5)
            androidx.camera.core.SettableImageProxy r4 = new androidx.camera.core.SettableImageProxy
            r4.<init>(r6, r3)
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L2e
            r4.setCropRect(r7)
        L2e:
            r8.analyze(r4)
            r3 = 0
            r9.set(r3)
            return
        L36:
            androidx.core.os.OperationCanceledException r3 = new androidx.core.os.OperationCanceledException
            java.lang.String r4 = "ImageAnalysis is detached"
            r3.<init>(r4)
            r9.setException(r3)
            return
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.core.ImageAnalysisAbstractAnalyzer r8, java.util.concurrent.Executor r9, androidx.camera.core.ImageProxy r10, android.graphics.Matrix r11, androidx.camera.core.ImageProxy r12, android.graphics.Rect r13, androidx.camera.core.ImageAnalysis.Analyzer r14, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r15) {
            r8.getClass()
            androidx.camera.core.q r0 = new androidx.camera.core.q
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.execute(r0)
            java.lang.String r8 = "analyzeImage"
            return r8
    }

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private void createHelperBuffer(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4) {
            r3 = this;
            int r0 = r3.mOutputImageFormat
            r1 = 1
            if (r0 != r1) goto L56
            java.nio.ByteBuffer r0 = r3.mYRotatedBuffer
            if (r0 != 0) goto L19
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.mYRotatedBuffer = r0
        L19:
            java.nio.ByteBuffer r0 = r3.mYRotatedBuffer
            r1 = 0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r3.mURotatedBuffer
            if (r0 != 0) goto L35
            int r0 = r4.getWidth()
            int r2 = r4.getHeight()
            int r0 = r0 * r2
            int r0 = r0 / 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.mURotatedBuffer = r0
        L35:
            java.nio.ByteBuffer r0 = r3.mURotatedBuffer
            r0.position(r1)
            java.nio.ByteBuffer r0 = r3.mVRotatedBuffer
            if (r0 != 0) goto L50
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            int r0 = r0 * r4
            int r0 = r0 / 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.mVRotatedBuffer = r4
        L50:
            java.nio.ByteBuffer r4 = r3.mVRotatedBuffer
            r4.position(r1)
            return
        L56:
            int r0 = r3.mOutputImageFormat
            r1 = 2
            if (r0 != r1) goto L71
            java.nio.ByteBuffer r0 = r3.mRGBConvertedBuffer
            if (r0 != 0) goto L71
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            int r0 = r0 * r4
            int r0 = r0 * 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.mRGBConvertedBuffer = r4
        L71:
            return
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.SafeCloseImageReaderProxy createImageReaderProxy(int r1, int r2, int r3, int r4, int r5) {
            r0 = 90
            if (r3 == r0) goto Lb
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L9
            goto Lb
        L9:
            r3 = 0
            goto Lc
        Lb:
            r3 = 1
        Lc:
            if (r3 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            if (r3 == 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            androidx.camera.core.SafeCloseImageReaderProxy r2 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.impl.ImageReaderProxy r1 = androidx.camera.core.ImageReaderProxys.createIsolatedReader(r0, r1, r4, r5)
            r2.<init>(r1)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    static android.graphics.Matrix getAdditionalTransformMatrixAppliedByProcessor(int r3, int r4, int r5, int r6, @androidx.annotation.IntRange(from = 0, to = 359) int r7) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r7 <= 0) goto L28
            android.graphics.RectF r1 = new android.graphics.RectF
            float r3 = (float) r3
            float r4 = (float) r4
            r2 = 0
            r1.<init>(r2, r2, r3, r4)
            android.graphics.RectF r3 = androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r3, r4)
            float r3 = (float) r7
            r0.postRotate(r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = (float) r5
            float r5 = (float) r6
            r3.<init>(r2, r2, r4, r5)
            android.graphics.Matrix r3 = androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(r3)
            r0.postConcat(r3)
        L28:
            return r0
    }

    @androidx.annotation.NonNull
    static android.graphics.Rect getUpdatedCropRect(@androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.graphics.Matrix r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r2.mapRect(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.round(r1)
            return r1
    }

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private void recalculateTransformMatrixAndCropRect(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.mRelativeRotation
            android.graphics.Matrix r2 = getAdditionalTransformMatrixAppliedByProcessor(r2, r3, r4, r5, r0)
            android.graphics.Rect r3 = r1.mOriginalViewPortCropRect
            android.graphics.Rect r3 = getUpdatedCropRect(r3, r2)
            r1.mUpdatedViewPortCropRect = r3
            android.graphics.Matrix r3 = r1.mUpdatedSensorToBufferTransformMatrix
            android.graphics.Matrix r4 = r1.mOriginalSensorToBufferTransformMatrix
            r3.setConcat(r4, r2)
            return
    }

    @androidx.annotation.GuardedBy("mAnalyzerLock")
    private void recreateImageReaderProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4, @androidx.annotation.IntRange(from = 0, to = 359) int r5) {
            r3 = this;
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r3.mProcessedImageReaderProxy
            if (r0 != 0) goto L5
            goto L46
        L5:
            r0.safeClose()
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            androidx.camera.core.SafeCloseImageReaderProxy r1 = r3.mProcessedImageReaderProxy
            int r1 = r1.getImageFormat()
            androidx.camera.core.SafeCloseImageReaderProxy r2 = r3.mProcessedImageReaderProxy
            int r2 = r2.getMaxImages()
            androidx.camera.core.SafeCloseImageReaderProxy r4 = createImageReaderProxy(r0, r4, r5, r1, r2)
            r3.mProcessedImageReaderProxy = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L46
            int r4 = r3.mOutputImageFormat
            r5 = 1
            if (r4 != r5) goto L46
            android.media.ImageWriter r4 = r3.mProcessedImageWriter
            if (r4 == 0) goto L34
            androidx.camera.core.internal.compat.ImageWriterCompat.close(r4)
        L34:
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r3.mProcessedImageReaderProxy
            android.view.Surface r4 = r4.getSurface()
            androidx.camera.core.SafeCloseImageReaderProxy r5 = r3.mProcessedImageReaderProxy
            int r5 = r5.getMaxImages()
            android.media.ImageWriter r4 = androidx.camera.core.internal.compat.ImageWriterCompat.newInstance(r4, r5)
            r3.mProcessedImageWriter = r4
        L46:
            return
    }

    @androidx.annotation.Nullable
    abstract androidx.camera.core.ImageProxy acquireImage(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r1);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> analyzeImage(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r17) {
            r16 = this;
            r1 = r16
            r2 = r17
            boolean r0 = r1.mOutputImageRotationEnabled
            r9 = 0
            if (r0 == 0) goto Ld
            int r0 = r1.mRelativeRotation
            r8 = r0
            goto Le
        Ld:
            r8 = 0
        Le:
            java.lang.Object r3 = r1.mAnalyzerLock
            monitor-enter(r3)
            java.util.concurrent.Executor r0 = r1.mUserExecutor     // Catch: java.lang.Throwable -> L20
            androidx.camera.core.ImageAnalysis$Analyzer r10 = r1.mSubscribedAnalyzer     // Catch: java.lang.Throwable -> L20
            boolean r4 = r1.mOutputImageRotationEnabled     // Catch: java.lang.Throwable -> L20
            r11 = 1
            if (r4 == 0) goto L24
            int r4 = r1.mPrevBufferRotationDegrees     // Catch: java.lang.Throwable -> L20
            if (r8 == r4) goto L24
            r12 = 1
            goto L25
        L20:
            r0 = move-exception
            r14 = r3
            goto Ld6
        L24:
            r12 = 0
        L25:
            if (r12 == 0) goto L2a
            r1.recreateImageReaderProxy(r2, r8)     // Catch: java.lang.Throwable -> L20
        L2a:
            boolean r4 = r1.mOutputImageRotationEnabled     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L31
            r16.createHelperBuffer(r17)     // Catch: java.lang.Throwable -> L20
        L31:
            r4 = r3
            androidx.camera.core.SafeCloseImageReaderProxy r3 = r1.mProcessedImageReaderProxy     // Catch: java.lang.Throwable -> Ld4
            r5 = r4
            android.media.ImageWriter r4 = r1.mProcessedImageWriter     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteBuffer r6 = r1.mRGBConvertedBuffer     // Catch: java.lang.Throwable -> Ld1
            r7 = r5
            java.nio.ByteBuffer r5 = r1.mYRotatedBuffer     // Catch: java.lang.Throwable -> Lce
            java.nio.ByteBuffer r13 = r1.mURotatedBuffer     // Catch: java.lang.Throwable -> Lce
            r14 = r7
            java.nio.ByteBuffer r7 = r1.mVRotatedBuffer     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lcc
            if (r10 == 0) goto Lc0
            if (r0 == 0) goto Lc0
            boolean r14 = r1.mIsAttached
            if (r14 == 0) goto Lc0
            if (r3 == 0) goto L72
            int r14 = r1.mOutputImageFormat
            r15 = 2
            if (r14 != r15) goto L59
            boolean r4 = r1.mOnePixelShiftEnabled
            androidx.camera.core.ImageProxy r3 = androidx.camera.core.ImageProcessingUtil.convertYUVToRGB(r2, r3, r6, r8, r4)
        L57:
            r2 = r3
            goto L73
        L59:
            int r6 = r1.mOutputImageFormat
            if (r6 != r11) goto L72
            boolean r6 = r1.mOnePixelShiftEnabled
            if (r6 == 0) goto L64
            androidx.camera.core.ImageProcessingUtil.applyPixelShiftForYUV(r2)
        L64:
            if (r4 == 0) goto L72
            if (r5 == 0) goto L72
            if (r13 == 0) goto L72
            if (r7 == 0) goto L72
            r6 = r13
            androidx.camera.core.ImageProxy r3 = androidx.camera.core.ImageProcessingUtil.rotateYUV(r2, r3, r4, r5, r6, r7, r8)
            goto L57
        L72:
            r2 = 0
        L73:
            if (r2 != 0) goto L76
            r9 = 1
        L76:
            if (r9 == 0) goto L7b
            r5 = r17
            goto L7c
        L7b:
            r5 = r2
        L7c:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            java.lang.Object r2 = r1.mAnalyzerLock
            monitor-enter(r2)
            if (r12 == 0) goto La3
            if (r9 != 0) goto La3
            int r3 = r17.getWidth()     // Catch: java.lang.Throwable -> La1
            int r7 = r17.getHeight()     // Catch: java.lang.Throwable -> La1
            int r9 = r5.getWidth()     // Catch: java.lang.Throwable -> La1
            int r11 = r5.getHeight()     // Catch: java.lang.Throwable -> La1
            r1.recalculateTransformMatrixAndCropRect(r3, r7, r9, r11)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r0 = move-exception
            goto Lbe
        La3:
            r1.mPrevBufferRotationDegrees = r8     // Catch: java.lang.Throwable -> La1
            android.graphics.Rect r3 = r1.mUpdatedViewPortCropRect     // Catch: java.lang.Throwable -> La1
            r6.set(r3)     // Catch: java.lang.Throwable -> La1
            android.graphics.Matrix r3 = r1.mUpdatedSensorToBufferTransformMatrix     // Catch: java.lang.Throwable -> La1
            r4.set(r3)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
            r2 = r0
            androidx.camera.core.s r0 = new androidx.camera.core.s
            r3 = r17
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
        Lbe:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
            throw r0
        Lc0:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            java.lang.String r1 = "No analyzer or executor currently set."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
        Lcc:
            r0 = move-exception
            goto Ld6
        Lce:
            r0 = move-exception
            r14 = r7
            goto Ld6
        Ld1:
            r0 = move-exception
            r14 = r5
            goto Ld6
        Ld4:
            r0 = move-exception
            r14 = r4
        Ld6:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lcc
            throw r0
    }

    void attach() {
            r1 = this;
            r0 = 1
            r1.mIsAttached = r0
            return
    }

    abstract void clearCache();

    void detach() {
            r1 = this;
            r0 = 0
            r1.mIsAttached = r0
            r1.clearCache()
            return
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r3) {
            r2 = this;
            androidx.camera.core.ImageProxy r3 = r2.acquireImage(r3)     // Catch: java.lang.IllegalStateException -> La
            if (r3 == 0) goto Lc
            r2.onValidImageAvailable(r3)     // Catch: java.lang.IllegalStateException -> La
            return
        La:
            r3 = move-exception
            goto Ld
        Lc:
            return
        Ld:
            java.lang.String r0 = "ImageAnalysisAnalyzer"
            java.lang.String r1 = "Failed to acquire image."
            androidx.camera.core.Logger.e(r0, r1, r3)
            return
    }

    abstract void onValidImageAvailable(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1);

    void setAnalyzer(@androidx.annotation.Nullable java.util.concurrent.Executor r2, @androidx.annotation.Nullable androidx.camera.core.ImageAnalysis.Analyzer r3) {
            r1 = this;
            if (r3 != 0) goto L5
            r1.clearCache()
        L5:
            java.lang.Object r0 = r1.mAnalyzerLock
            monitor-enter(r0)
            r1.mSubscribedAnalyzer = r3     // Catch: java.lang.Throwable -> Le
            r1.mUserExecutor = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    void setOnePixelShiftEnabled(boolean r1) {
            r0 = this;
            r0.mOnePixelShiftEnabled = r1
            return
    }

    void setOutputImageFormat(int r1) {
            r0 = this;
            r0.mOutputImageFormat = r1
            return
    }

    void setOutputImageRotationEnabled(boolean r1) {
            r0 = this;
            r0.mOutputImageRotationEnabled = r1
            return
    }

    void setProcessedImageReaderProxy(@androidx.annotation.NonNull androidx.camera.core.SafeCloseImageReaderProxy r2) {
            r1 = this;
            java.lang.Object r0 = r1.mAnalyzerLock
            monitor-enter(r0)
            r1.mProcessedImageReaderProxy = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    void setRelativeRotation(int r1) {
            r0 = this;
            r0.mRelativeRotation = r1
            return
    }

    void setSensorToBufferTransformMatrix(@androidx.annotation.NonNull android.graphics.Matrix r3) {
            r2 = this;
            java.lang.Object r0 = r2.mAnalyzerLock
            monitor-enter(r0)
            r2.mOriginalSensorToBufferTransformMatrix = r3     // Catch: java.lang.Throwable -> L10
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L10
            android.graphics.Matrix r1 = r2.mOriginalSensorToBufferTransformMatrix     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2.mUpdatedSensorToBufferTransformMatrix = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    void setViewPortCropRect(@androidx.annotation.NonNull android.graphics.Rect r3) {
            r2 = this;
            java.lang.Object r0 = r2.mAnalyzerLock
            monitor-enter(r0)
            r2.mOriginalViewPortCropRect = r3     // Catch: java.lang.Throwable -> L10
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L10
            android.graphics.Rect r1 = r2.mOriginalViewPortCropRect     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2.mUpdatedViewPortCropRect = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }
}
