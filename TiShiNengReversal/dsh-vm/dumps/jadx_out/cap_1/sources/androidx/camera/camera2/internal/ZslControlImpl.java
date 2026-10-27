package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ZslControlImpl implements androidx.camera.camera2.internal.ZslControl {

    @androidx.annotation.VisibleForTesting
    static final int MAX_IMAGES = 9;

    @androidx.annotation.VisibleForTesting
    static final int RING_BUFFER_CAPACITY = 3;
    private static final java.lang.String TAG = "ZslControlImpl";

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    final androidx.camera.core.internal.utils.ZslRingBuffer mImageRingBuffer;
    private boolean mIsPrivateReprocessingSupported;
    private boolean mIsZslDisabledByFlashMode;
    private boolean mIsZslDisabledByUseCaseConfig;
    private androidx.camera.core.impl.CameraCaptureCallback mMetadataMatchingCaptureCallback;
    private androidx.camera.core.impl.DeferrableSurface mReprocessingImageDeferrableSurface;
    androidx.camera.core.SafeCloseImageReaderProxy mReprocessingImageReader;

    @androidx.annotation.Nullable
    android.media.ImageWriter mReprocessingImageWriter;
    private boolean mShouldZslDisabledByQuirks;


    ZslControlImpl(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mIsZslDisabledByUseCaseConfig = r0
            r2.mIsZslDisabledByFlashMode = r0
            r2.mIsPrivateReprocessingSupported = r0
            r2.mShouldZslDisabledByQuirks = r0
            r2.mCameraCharacteristicsCompat = r3
            r1 = 4
            boolean r3 = androidx.camera.camera2.internal.ZslUtil.isCapabilitySupported(r3, r1)
            r2.mIsPrivateReprocessingSupported = r3
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk> r3 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class
            androidx.camera.core.impl.Quirk r3 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r3)
            if (r3 == 0) goto L1e
            r0 = 1
        L1e:
            r2.mShouldZslDisabledByQuirks = r0
            androidx.camera.core.internal.utils.ZslRingBuffer r3 = new androidx.camera.core.internal.utils.ZslRingBuffer
            androidx.camera.camera2.internal.f3 r0 = new androidx.camera.camera2.internal.f3
            r0.<init>()
            r1 = 3
            r3.<init>(r1, r0)
            r2.mImageRingBuffer = r3
            return
    }

    public static /* synthetic */ void a(androidx.camera.camera2.internal.ZslControlImpl r1, androidx.camera.core.impl.ImageReaderProxy r2) {
            r1.getClass()
            androidx.camera.core.ImageProxy r2 = r2.acquireLatestImage()     // Catch: java.lang.IllegalStateException -> Lf
            if (r2 == 0) goto Le
            androidx.camera.core.internal.utils.ZslRingBuffer r1 = r1.mImageRingBuffer     // Catch: java.lang.IllegalStateException -> Lf
            r1.enqueue(r2)     // Catch: java.lang.IllegalStateException -> Lf
        Le:
            return
        Lf:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Failed to acquire latest image IllegalStateException = "
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ZslControlImpl"
            androidx.camera.core.Logger.e(r2, r1)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.ImageProxy r0) {
            r0.close()
            return
    }

    private void cleanup() {
            r5 = this;
            androidx.camera.core.internal.utils.ZslRingBuffer r0 = r5.mImageRingBuffer
        L2:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L12
            java.lang.Object r1 = r0.dequeue()
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1
            r1.close()
            goto L2
        L12:
            androidx.camera.core.impl.DeferrableSurface r0 = r5.mReprocessingImageDeferrableSurface
            r1 = 0
            if (r0 == 0) goto L32
            androidx.camera.core.SafeCloseImageReaderProxy r2 = r5.mReprocessingImageReader
            if (r2 == 0) goto L2d
            com.google.common.util.concurrent.ListenableFuture r3 = r0.getTerminationFuture()
            androidx.camera.camera2.internal.e3 r4 = new androidx.camera.camera2.internal.e3
            r4.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r3.addListener(r4, r2)
            r5.mReprocessingImageReader = r1
        L2d:
            r0.close()
            r5.mReprocessingImageDeferrableSurface = r1
        L32:
            android.media.ImageWriter r0 = r5.mReprocessingImageWriter
            if (r0 == 0) goto L3b
            androidx.camera.camera2.internal.y2.a(r0)
            r5.mReprocessingImageWriter = r1
        L3b:
            return
    }

    @androidx.annotation.NonNull
    private java.util.Map<java.lang.Integer, android.util.Size> createReprocessingInputSizeMap(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r10) {
            r9 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.AssertionError -> L9
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.AssertionError -> L9
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10     // Catch: java.lang.AssertionError -> L9
            goto L25
        L9:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to retrieve StreamConfigurationMap, error = "
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "ZslControlImpl"
            androidx.camera.core.Logger.e(r0, r10)
            r10 = 0
        L25:
            if (r10 == 0) goto L5a
            int[] r0 = androidx.camera.camera2.internal.a3.a(r10)
            if (r0 != 0) goto L2e
            goto L5a
        L2e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int[] r1 = androidx.camera.camera2.internal.a3.a(r10)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L3a:
            if (r4 >= r2) goto L59
            r5 = r1[r4]
            android.util.Size[] r6 = androidx.camera.camera2.internal.b3.a(r10, r5)
            if (r6 == 0) goto L56
            androidx.camera.core.impl.utils.CompareSizesByArea r7 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r8 = 1
            r7.<init>(r8)
            java.util.Arrays.sort(r6, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = r6[r3]
            r0.put(r5, r6)
        L56:
            int r4 = r4 + 1
            goto L3a
        L59:
            return r0
        L5a:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            return r10
    }

    private boolean isJpegValidOutputForInputFormat(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r5, int r6) {
            r4 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r5 = r5.get(r0)
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            int[] r5 = androidx.camera.camera2.internal.z2.a(r5, r6)
            if (r5 != 0) goto L13
            return r0
        L13:
            int r6 = r5.length
            r1 = 0
        L15:
            if (r1 >= r6) goto L22
            r2 = r5[r1]
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L1f
            r5 = 1
            return r5
        L1f:
            int r1 = r1 + 1
            goto L15
        L22:
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r7) {
            r6 = this;
            r0 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r6.cleanup()
            boolean r2 = r6.mIsZslDisabledByUseCaseConfig
            if (r2 == 0) goto Lf
            goto Lc4
        Lf:
            boolean r2 = r6.mShouldZslDisabledByQuirks
            if (r2 == 0) goto L15
            goto Lc4
        L15:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r2 = r6.mCameraCharacteristicsCompat
            java.util.Map r2 = r6.createReprocessingInputSizeMap(r2)
            boolean r3 = r6.mIsPrivateReprocessingSupported
            if (r3 == 0) goto Lc4
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Lc4
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto Lc4
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat r3 = r6.mCameraCharacteristicsCompat
            boolean r3 = r6.isJpegValidOutputForInputFormat(r3, r0)
            if (r3 != 0) goto L35
            goto Lc4
        L35:
            java.lang.Object r1 = r2.get(r1)
            android.util.Size r1 = (android.util.Size) r1
            androidx.camera.core.MetadataImageReader r2 = new androidx.camera.core.MetadataImageReader
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            r4 = 9
            r2.<init>(r3, r1, r0, r4)
            androidx.camera.core.impl.CameraCaptureCallback r1 = r2.getCameraCaptureCallback()
            r6.mMetadataMatchingCaptureCallback = r1
            androidx.camera.core.SafeCloseImageReaderProxy r1 = new androidx.camera.core.SafeCloseImageReaderProxy
            r1.<init>(r2)
            r6.mReprocessingImageReader = r1
            androidx.camera.camera2.internal.g3 r1 = new androidx.camera.camera2.internal.g3
            r1.<init>(r6)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.ioExecutor()
            r2.setOnImageAvailableListener(r1, r3)
            androidx.camera.core.impl.ImmediateSurface r1 = new androidx.camera.core.impl.ImmediateSurface
            androidx.camera.core.SafeCloseImageReaderProxy r2 = r6.mReprocessingImageReader
            android.view.Surface r2 = r2.getSurface()
            android.util.Size r3 = new android.util.Size
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r6.mReprocessingImageReader
            int r4 = r4.getWidth()
            androidx.camera.core.SafeCloseImageReaderProxy r5 = r6.mReprocessingImageReader
            int r5 = r5.getHeight()
            r3.<init>(r4, r5)
            r1.<init>(r2, r3, r0)
            r6.mReprocessingImageDeferrableSurface = r1
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r6.mReprocessingImageReader
            com.google.common.util.concurrent.ListenableFuture r1 = r1.getTerminationFuture()
            java.util.Objects.requireNonNull(r0)
            androidx.camera.camera2.internal.e3 r2 = new androidx.camera.camera2.internal.e3
            r2.<init>(r0)
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r1.addListener(r2, r0)
            androidx.camera.core.impl.DeferrableSurface r0 = r6.mReprocessingImageDeferrableSurface
            r7.addSurface(r0)
            androidx.camera.core.impl.CameraCaptureCallback r0 = r6.mMetadataMatchingCaptureCallback
            r7.addCameraCaptureCallback(r0)
            androidx.camera.camera2.internal.ZslControlImpl$1 r0 = new androidx.camera.camera2.internal.ZslControlImpl$1
            r0.<init>(r6)
            r7.addSessionStateCallback(r0)
            androidx.camera.camera2.internal.d3.a()
            androidx.camera.core.SafeCloseImageReaderProxy r0 = r6.mReprocessingImageReader
            int r0 = r0.getWidth()
            androidx.camera.core.SafeCloseImageReaderProxy r1 = r6.mReprocessingImageReader
            int r1 = r1.getHeight()
            androidx.camera.core.SafeCloseImageReaderProxy r2 = r6.mReprocessingImageReader
            int r2 = r2.getImageFormat()
            android.hardware.camera2.params.InputConfiguration r0 = androidx.camera.camera2.internal.c3.a(r0, r1, r2)
            r7.setInputConfiguration(r0)
        Lc4:
            return
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy dequeueImageFromBuffer() {
            r2 = this;
            androidx.camera.core.internal.utils.ZslRingBuffer r0 = r2.mImageRingBuffer     // Catch: java.util.NoSuchElementException -> L9
            java.lang.Object r0 = r0.dequeue()     // Catch: java.util.NoSuchElementException -> L9
            androidx.camera.core.ImageProxy r0 = (androidx.camera.core.ImageProxy) r0     // Catch: java.util.NoSuchElementException -> L9
            return r0
        L9:
            java.lang.String r0 = "ZslControlImpl"
            java.lang.String r1 = "dequeueImageFromBuffer no such element"
            androidx.camera.core.Logger.e(r0, r1)
            r0 = 0
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4) {
            r3 = this;
            android.media.Image r4 = r4.getImage()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L31
            android.media.ImageWriter r0 = r3.mReprocessingImageWriter
            if (r0 == 0) goto L31
            if (r4 == 0) goto L31
            androidx.camera.core.internal.compat.ImageWriterCompat.queueInputImage(r0, r4)     // Catch: java.lang.IllegalStateException -> L16
            r4 = 1
            return r4
        L16:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enqueueImageToImageWriter throws IllegalStateException = "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ZslControlImpl"
            androidx.camera.core.Logger.e(r0, r4)
        L31:
            return r2
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByFlashMode() {
            r1 = this;
            boolean r0 = r1.mIsZslDisabledByFlashMode
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
            r1 = this;
            boolean r0 = r1.mIsZslDisabledByUseCaseConfig
            return r0
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByFlashMode(boolean r1) {
            r0 = this;
            r0.mIsZslDisabledByFlashMode = r1
            return
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean r1) {
            r0 = this;
            r0.mIsZslDisabledByUseCaseConfig = r1
            return
    }
}
